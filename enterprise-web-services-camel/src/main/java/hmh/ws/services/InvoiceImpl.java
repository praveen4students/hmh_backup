package hmh.ws.services;

import hmh.sap.rfc.Zvgetinvoice_HType;
import hmh.sap.rfc.Zvgetinvoice_LType;
import hmh.sap.rfc.ZvsubscriptionType;
import hmh.sap.rfc.ZvtrackingType;
import hmh.util.Pair;
import hmh.util.Transaction_Constants;
import hmh.ws.controller.TransactionBean;

import java.io.File;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;

import org.apache.log4j.Logger;

import com.google.common.collect.ArrayListMultimap;
import com.hmco.eai.ots.transaction.InvoiceDetails;
import com.hmco.eai.ots.transaction.InvoiceDetailsList;
import com.hmco.eai.ots.transaction.InvoiceTransactionItem;
import com.hmco.eai.ots.transaction.InvoiceTransactionItem.LineItem;
import com.hmco.eai.ots.transaction.ProductInfo;
import com.hmco.eai.ots.transaction.ShipmentDetailsItem.TrackingItem;
import com.hmco.eai.ots.transaction.ShipmentDetailsList;
import com.hmco.eai.ots.transaction.TransactionIDList;
import com.sap.aii.proxy.framework.core.ApplicationFaultException;
import com.sap.aii.proxy.framework.core.SystemFaultException;

public class InvoiceImpl {

	private static final Logger logger = Logger.getLogger(InvoiceImpl.class);

	private TransactionBean bean;

	public void setBean(TransactionBean bean) {
		logger.debug("instantiate transactionBean");
		this.bean = bean;
	}

	public InvoiceDetailsList getInvoices(TransactionIDList transactionIDList)
			throws ApplicationFaultException, SystemFaultException {
		long enterTime = System.currentTimeMillis();

		List<String> transIdList = transactionIDList.getTransactionID();
		String[] transIdArray = new String[transIdList.size()];
		transIdList.toArray(transIdArray);

		Holder<Zvgetinvoice_HType[]> T_BilldocheadHolder = new Holder<Zvgetinvoice_HType[]>();
		Holder<Zvgetinvoice_LType[]> T_BilldocdetailHolder = new Holder<Zvgetinvoice_LType[]>();
		Holder<ZvsubscriptionType[]> T_SubsHolder = new Holder<ZvsubscriptionType[]>();

		long requestTime = 0;
		long responseTime = 0;
		InvoiceDetailsList invoiceList;
		try {
			requestTime = System.currentTimeMillis();
			
			bean.getInvoices(transIdArray, T_BilldocheadHolder,
					T_BilldocdetailHolder, T_SubsHolder);
			responseTime = System.currentTimeMillis();
			logger.debug("SAP time was " + (responseTime - requestTime)
					+ " ms.");

			invoiceList = makeInvoiceDetailsList(T_BilldocheadHolder.value,
					T_BilldocdetailHolder.value, T_SubsHolder.value);
			return invoiceList;
		} catch (Exception ex) {
			ex.printStackTrace(System.err);
			logger.error("Exception calling ShipmentDetails", ex);
			requestTime = responseTime = 0;
		} finally {
			long exitTime = System.currentTimeMillis();
			logger.debug("servicemix time was "
					+ ((exitTime - enterTime) - (responseTime - requestTime))
					+ " ms.");
			logger.debug("execution time was " + (exitTime - enterTime)
					+ " ms.");
			logger.debug("getShipmentDetail ends");
		}
		return null;
	}

	private InvoiceDetailsList makeInvoiceDetailsList(
			Zvgetinvoice_HType[] hTypeArray, Zvgetinvoice_LType[] lTypeArray,
			ZvsubscriptionType[] subTypeArray) throws Exception {

		ArrayListMultimap<String, Zvgetinvoice_HType> hTypeMap = ArrayListMultimap
				.<String, Zvgetinvoice_HType> create();
		for (int i = 0; i < hTypeArray.length; ++i)
			hTypeMap.put(hTypeArray[i].getSono(), hTypeArray[i]);

		ArrayListMultimap<Pair<String, String>, Zvgetinvoice_LType> dTypeMap = ArrayListMultimap
				.<Pair<String, String>, Zvgetinvoice_LType> create();
		for (int i = 0; i < lTypeArray.length; ++i)
			dTypeMap.put(new Pair<String, String>(lTypeArray[i].getOrd_No(),
					lTypeArray[i].getInv_No()), lTypeArray[i]);

		ArrayListMultimap<String, ZvsubscriptionType> tTypeMap = ArrayListMultimap
				.<String, ZvsubscriptionType> create();
		for (int i = 0; i < subTypeArray.length; ++i)
			tTypeMap.put(subTypeArray[i].getInv_No(), subTypeArray[i]);

		InvoiceDetailsList returnList = new InvoiceDetailsList();
		List<InvoiceDetails> invoiceDetailsList = returnList
				.getInvoiceDetails();

		for (Iterator<String> it = hTypeMap.keySet().iterator(); it.hasNext();) {
			String txnId = it.next();
			InvoiceDetails details = new InvoiceDetails();
			details.setTransactionID(txnId);
			List<InvoiceTransactionItem> invoiceTxnItemList = details
					.getInvoiceTransactionItem();
			List<Zvgetinvoice_HType> hTypeList = hTypeMap.get(txnId);
			for (Zvgetinvoice_HType hType : hTypeList) {
				makeInvoiceTxnItem(invoiceTxnItemList, hType, dTypeMap,
						tTypeMap);
			}
			invoiceDetailsList.add(details);
		}

		return returnList;
	}

	private void makeInvoiceTxnItem(
			List<InvoiceTransactionItem> invoiceTxnItemList,
			Zvgetinvoice_HType hType,
			ArrayListMultimap<Pair<String, String>, Zvgetinvoice_LType> dTypeMap,
			ArrayListMultimap<String, ZvsubscriptionType> tTypeMap)
			throws Exception {

		InvoiceTransactionItem txnItem = new InvoiceTransactionItem();
		txnItem.setInvoiceNo(hType.getInv_No());
		txnItem.setInvoiceType(hType.getInv_Typ());
		txnItem.setBillingDate(toXMLGregorianCalendar(hType.getBilldate()));
		txnItem.setSubTotal(hType.getStotal().doubleValue());
		txnItem.setSalesTax(hType.getSaletx().doubleValue());
		txnItem.setShippingCharge(hType.getShipcrg().doubleValue());
		txnItem.setTotal(hType.getTotal().doubleValue());

		List<LineItem> lineItemList = txnItem.getLineItem();
		makeLineItemList(lineItemList, dTypeMap.get(new Pair<String, String>(
				hType.getSono(), hType.getInv_No())));

		invoiceTxnItemList.add(txnItem);

	}

	private void makeLineItemList(List<LineItem> lineItemList,
			List<Zvgetinvoice_LType> list) {
		for (Zvgetinvoice_LType dType : list) {
			LineItem li = new LineItem();
			ProductInfo pInfo = new ProductInfo();
			pInfo.setLineNo(dType.getLinenum() != null ? Integer.parseInt(dType
					.getLinenum()) : 0);

			pInfo.setSalesOffice(dType.getSalesoffice());
			pInfo.setMaterialID(dType.getMatid());
			pInfo.setIsbn(dType.getIsbn());
			pInfo.setDescription(dType.getDescp());
			pInfo.setCouponCode(dType.getCouponcode());
			pInfo.setPromotionType(dType.getPromotiontype());
			pInfo.setQuantity(dType.getQty().intValue());
			pInfo.setListPrice(dType.getListprice().doubleValue());
			pInfo.setNetPrice(dType.getNetprice().doubleValue());
			pInfo.setProductDivision(dType.getPdiv());
			pInfo.setListDiscount(dType.getListdis().doubleValue());
			pInfo.setIsEGood(dType.getIsegood().equalsIgnoreCase(
					Transaction_Constants.X));
			pInfo.setIsSubscription(dType.getIsesub().equalsIgnoreCase(
					Transaction_Constants.X));

			li.setProductInfo(pInfo);
			li.setShipmentNo(dType.getShipno());
			String lineNo = dType.getShipln();
			li.setShipmentLineNo(lineNo != null && lineNo.trim().length() > 0 ? Integer
					.parseInt(lineNo) : 0);
			li.setShipmentLocation(dType.getShiploc());
			li.setPaymentTerm(dType.getPayterm());
			li.setTransactionNo(dType.getOrd_No());
			lineNo = dType.getOrd_Ln();
			li.setTransactionLineNo(lineNo != null
					&& lineNo.trim().length() > 0 ? Integer.parseInt(lineNo)
					: 0);

			lineItemList.add(li);
		}
	}

	private XMLGregorianCalendar toXMLGregorianCalendar(Date d)
			throws DatatypeConfigurationException {
		if (d != null) {
			GregorianCalendar c = new GregorianCalendar();
			c.setTime(d);
			XMLGregorianCalendar gc = DatatypeFactory.newInstance().newXMLGregorianCalendar( c );  
			gc.setTimezone(DatatypeConstants.FIELD_UNDEFINED);  
			gc.setTime(DatatypeConstants.FIELD_UNDEFINED, DatatypeConstants.FIELD_UNDEFINED, DatatypeConstants.FIELD_UNDEFINED);  
			return gc;
		} else
			return null;
	}

	public static void main(String[] args) throws Exception {
		TransactionIDList list = new TransactionIDList();
		list.getTransactionID().add("0002172030");

		list.getTransactionID().add("0002172051");
		list.getTransactionID().add("0002172050");
		list.getTransactionID().add("0002172048");
		list.getTransactionID().add("0002172011");

		InvoiceDetailsList returnList = new InvoiceImpl().getInvoices(list);
		System.out.println(returnList);
		JAXBContext jaxbMssgContext = JAXBContext
				.newInstance("com.hmco.eai.ots.transaction");
		Marshaller marshaller = jaxbMssgContext.createMarshaller();
		marshaller.setProperty("jaxb.formatted.output", Boolean.TRUE);
		marshaller
				.marshal(
						returnList,
						new File(
								"C:/Users/277256/Documents/HMH/Andrew/request_reponse/invoice_list.xml"));
	}
}
