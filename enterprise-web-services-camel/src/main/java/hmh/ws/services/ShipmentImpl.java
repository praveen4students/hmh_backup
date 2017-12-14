package hmh.ws.services;

import hmh.sap.rfc.Zvgetshipment_DType;
import hmh.sap.rfc.Zvgetshipment_HType;
import hmh.sap.rfc.ZvtrackingType;
import hmh.util.Pair;
import hmh.ws.controller.TransactionBean;

import java.io.File;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
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
import com.hmco.eai.ots.transaction.ShipmentDetails;
import com.hmco.eai.ots.transaction.ShipmentDetailsItem;
import com.hmco.eai.ots.transaction.ShipmentDetailsItem.LineItem;
import com.hmco.eai.ots.transaction.ShipmentDetailsItem.TrackingItem;
import com.hmco.eai.ots.transaction.ShipmentDetailsList;
import com.hmco.eai.ots.transaction.TransactionIDList;
import com.sap.aii.proxy.framework.core.ApplicationFaultException;
import com.sap.aii.proxy.framework.core.SystemFaultException;

public class ShipmentImpl {

	private static final Logger logger = Logger.getLogger(ShipmentImpl.class);

	private TransactionBean bean;

	public void setBean(TransactionBean bean) {
		logger.debug("instantiate transactionBean");
		this.bean = bean;
	}

	public ShipmentDetailsList getShipmentDetail(
			TransactionIDList transactionIDList)
			throws ApplicationFaultException, SystemFaultException {

		long enterTime = System.currentTimeMillis();

		List<String> transIdList = transactionIDList.getTransactionID();
		String[] transIdArray = new String[transIdList.size()];
		transIdList.toArray(transIdArray);

		Holder<Zvgetshipment_HType[]> T_Delivery_HHolder = new Holder<Zvgetshipment_HType[]>();
		Holder<Zvgetshipment_DType[]> T_Delivery_DHolder = new Holder<Zvgetshipment_DType[]>();
		Holder<ZvtrackingType[]> T_TrackingHolder = new Holder<ZvtrackingType[]>();

		long requestTime = 0;
		long responseTime = 0;
		ShipmentDetailsList shipmentList;
		try {
			requestTime = System.currentTimeMillis();
			
			bean.getShipment(transIdArray, T_Delivery_HHolder,
					T_Delivery_DHolder, T_TrackingHolder);
			responseTime = System.currentTimeMillis();
			logger.debug("SAP time was " + (responseTime - requestTime)
					+ " ms.");

			shipmentList = makeShipmentDetailsList(T_Delivery_HHolder.value,
					T_Delivery_DHolder.value, T_TrackingHolder.value);
			return shipmentList;
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

	private ShipmentDetailsList makeShipmentDetailsList(
			Zvgetshipment_HType[] hTypeArray, Zvgetshipment_DType[] dTypeArray,
			ZvtrackingType[] trackingTypeArray) throws Exception {

		ArrayListMultimap<String, Zvgetshipment_HType> hTxnTypeMap = ArrayListMultimap
				.<String, Zvgetshipment_HType> create();
		for (int i = 0; i < hTypeArray.length; ++i)
			hTxnTypeMap.put(hTypeArray[i].getSono(), hTypeArray[i]);

		ArrayListMultimap<Pair<String, String>, Zvgetshipment_DType> dTypeMap = ArrayListMultimap
				.<Pair<String, String>, Zvgetshipment_DType> create();
		for (int i = 0; i < dTypeArray.length; ++i)
			dTypeMap.put(new Pair<String, String>(dTypeArray[i].getTransid(), dTypeArray[i].getShipmentno()), dTypeArray[i]);

		ArrayListMultimap<String, ZvtrackingType> tTypeMap = ArrayListMultimap
				.<String, ZvtrackingType> create();
		for (int i = 0; i < trackingTypeArray.length; ++i)
			tTypeMap.put(trackingTypeArray[i].getShipmentno(),
					trackingTypeArray[i]);

		ShipmentDetailsList returnList = new ShipmentDetailsList();

		List<ShipmentDetails> shipmentDetailList = returnList
				.getShipmentDetails();
		for (Iterator<String> it = hTxnTypeMap.keySet().iterator(); it
				.hasNext();) {
			String txnId = it.next();
			ShipmentDetails details = new ShipmentDetails();
			details.setTransactionID(txnId);
			List<ShipmentDetailsItem> shipmentDetailItemList = details
					.getShipmentDetailsItem();
			List<Zvgetshipment_HType> hTypeList = hTxnTypeMap.get(txnId);
			for (Zvgetshipment_HType hType : hTypeList) {
				makeShipmentDetailItem(shipmentDetailItemList, hType, dTypeMap,
						tTypeMap);
			}
			shipmentDetailList.add(details);
		}

		return returnList;
	}

	private void makeShipmentDetailItem(
			List<ShipmentDetailsItem> shipmentDetailItemList,
			Zvgetshipment_HType hType,
			ArrayListMultimap<Pair<String, String>, Zvgetshipment_DType> dTypeMap,
			ArrayListMultimap<String, ZvtrackingType> tTypeMap)
			throws Exception {
		ShipmentDetailsItem detailItem = new ShipmentDetailsItem();
		detailItem.setShipmentNo(hType.getShipmentno());
		detailItem.setShipmentCharge(hType.getShipcrg().doubleValue());
		detailItem.setShipmentCarrier(hType.getShipcr());
		detailItem.setShipmentServiceLevel(hType.getShipsl());
		detailItem.setShipmentWeight(hType.getShipwt().doubleValue());
		String strPkgCount = hType.getTotpkg();
		detailItem.setTotalPackages(strPkgCount != null
				&& hType.getTotpkg().trim().length() > 0 ? Integer
				.parseInt(strPkgCount) : 0);
		detailItem.setDocDate(toXMLGregorianCalendar(hType.getDocdt()));
		detailItem.setShippingDate(toXMLGregorianCalendar(hType.getShipdt()));
		
		List<LineItem> lineItemList = detailItem.getLineItem();
		makeLineItemList(lineItemList, dTypeMap.get(new Pair<String, String>(hType.getSono(),hType.getShipmentno())));

		List<TrackingItem> trackingItemList = detailItem.getTrackingItem();
		makeTrackingItemList(trackingItemList,
				tTypeMap.get(hType.getShipmentno()));
		
		shipmentDetailItemList.add(detailItem);
	}

	private void makeTrackingItemList(List<TrackingItem> trackingItemList,
			List<ZvtrackingType> list) throws Exception {
		for (ZvtrackingType tType : list) {
			TrackingItem ti = new TrackingItem();
			ti.setTrackingNo(tType.getTrackno());
			ti.setShippedDate(toXMLGregorianCalendar(tType.getShipdt()));
			ti.setShipmentServiceLevel(tType.getShipsl());
			ti.setDestinationZip(tType.getDestzip());
			ti.setWeight(tType.getWt().doubleValue());
			ti.setTrackingURL(tType.getTrackurl());
			trackingItemList.add(ti);
		}
	}

	private void makeLineItemList(List<LineItem> lineItemList,
			List<Zvgetshipment_DType> list) {
		for (Zvgetshipment_DType dType : list) {
			LineItem li = new LineItem();
			li.setLineNo(dType.getLinenum() != null ? Integer.parseInt(dType
					.getLinenum()) : 0);
			li.setTransactionID(dType.getTransid());
			li.setTransactionLineNo(dType.getTranslino());
			li.setMaterialID(dType.getMatid());
			li.setIsbn(dType.getIsbn());
			li.setFullDescription(dType.getDescp());
			li.setShipmentLocation(dType.getShiploc());
			li.setQuantity(dType.getQty().doubleValue());
			li.setProductDivision(dType.getPdiv());
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
		list.getTransactionID().add("0004111651");
		list.getTransactionID().add("0004726312");
		list.getTransactionID().add("0004560938");
		list.getTransactionID().add("0004560932");
		list.getTransactionID().add("0004111650");

		ShipmentDetailsList returnList = new ShipmentImpl()
				.getShipmentDetail(list);
		System.out.println(returnList);
		JAXBContext jaxbMssgContext = JAXBContext
				.newInstance("com.hmco.eai.ots.transaction");
		Marshaller marshaller = jaxbMssgContext.createMarshaller();
		marshaller.setProperty("jaxb.formatted.output", Boolean.TRUE);
		marshaller
				.marshal(
						returnList,
						new File(
								"C:/Users/277256/Documents/HMH/Andrew/getshipments/getshipments/shipment_list.xml"));
	}
}
