package hmh.ws.services;

import hmh.sap.rfc.Zbdcmsgcoll_RfcType;
import hmh.sap.rfc.ZvaddrType;
import hmh.sap.rfc.ZvemailType;
import hmh.sap.rfc.Zvfindtrans_IpType;
import hmh.sap.rfc.Zvgetinvoice_HType;
import hmh.sap.rfc.Zvgetinvoice_LType;
import hmh.sap.rfc.Zvgetshipment_DType;
import hmh.sap.rfc.Zvgetshipment_HType;
import hmh.sap.rfc.ZvparvwType;
import hmh.sap.rfc.Zvsales_Order_HType;
import hmh.sap.rfc.Zvso_LineitemType;
import hmh.sap.rfc.ZvsrType;
import hmh.sap.rfc.ZvsubscriptionType;
import hmh.sap.rfc.ZvtrackingType;
import hmh.util.Converter;
import hmh.util.Pair;
import hmh.util.Transaction_Constants;
import hmh.util.Triple;
import hmh.ws.controller.TransactionBean;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.DatatypeConverter;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;

import org.apache.camel.CamelContext;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.google.common.collect.ArrayListMultimap;
import com.hmco.eai.EaiException;
import com.hmco.eai.Error;
import com.hmco.eai.ErrorList;
import com.hmco.eai.ots.customer.Address;
import com.hmco.eai.ots.customer.EmailAddressStruct;
import com.hmco.eai.ots.material.SubscriptionTerm;
import com.hmco.eai.ots.transaction.InvoiceDetails;
import com.hmco.eai.ots.transaction.InvoiceDetailsList;
import com.hmco.eai.ots.transaction.InvoiceTransactionItem;
import com.hmco.eai.ots.transaction.ProductInfo;
import com.hmco.eai.ots.transaction.RetrieveInvoicePDFRequest;
import com.hmco.eai.ots.transaction.RetrieveInvoicePDFResponse;
import com.hmco.eai.ots.transaction.SalesRep;
import com.hmco.eai.ots.transaction.ShipmentDetails;
import com.hmco.eai.ots.transaction.ShipmentDetailsItem;
import com.hmco.eai.ots.transaction.ShipmentDetailsItem.LineItem;
import com.hmco.eai.ots.transaction.ShipmentDetailsItem.TrackingItem;
import com.hmco.eai.ots.transaction.ShipmentDetailsList;
import com.hmco.eai.ots.transaction.Transaction;
import com.hmco.eai.ots.transaction.TransactionIDList;
import com.hmco.eai.ots.transaction.TransactionLineItem;
import com.hmco.eai.ots.transaction.TransactionList;
import com.hmco.eai.ots.transaction.TransactionSearchCriteria.PartnerFunctionList;
import com.hmco.eai.ots.transactionnew.ProductInfo2;
import com.hmco.eai.tibco.enterprisewebservices.TransactionEx;
import com.hmco.eai.tibco.enterprisewebservices.TransactionException;
import com.hmh.util.audit.AuditService;
import com.hmh.util.dao.EAI_Log;
import com.hmh.util.hasher.Hasher;

//@WebService(serviceName = "getTransactionDetail", endpointInterface = "ws.Transaction", targetNamespace = "http://www.hmco.com/EAI/OTS/Transaction/getTransactionDetailImpl/BusinessProcesses/Transaction/GetTransactionDetail/MainProcesses")
//@Path("/transaction")
public class TransactionImpl implements TransactionEx, // {
		InitializingBean, DisposableBean {

	// operations
	public final static String GET_TRANSACTION_DETAIL = "getTransactionDetail";
	public final static String GET_INVOICES = "getInvoices";
	public final static String GET_SHIPMENTS = "getShipments";
	public final static String FIND_TRANSACTIONS = "findTransactions";
	public final static String RETRIEVE_INVOICE_PDF = "retrieveInvoicePDF";
	public final static String GET_TRANSACTION_DETAIL_EX = "getTransactionDetailEx";
	public final static String ERROR_NO_TXN = "transactionID cannot be whitespace.";
	public final static String ERROR_RQST = "An error occurred while processing SOAP request.";
	public final static String ERROR_INVLD_LEN = "length must be at most 10 CHARACTERs";
	

	private static final Logger logger = Logger
			.getLogger(TransactionImpl.class);

	private TransactionBean bean;
	private Hasher hasher;
	private AuditService audit;
	private CamelContext camelContext;
	
	@Produce(ref = "sedaTransactionAudit")
	ProducerTemplate producer;
	
	public void setBean(TransactionBean bean) {
		logger.debug("instantiate transactionBean");
		this.bean = bean;
	}

	public void setHasher(Hasher hasher) {
		logger.debug("instantiate hasher");
		this.hasher = hasher;
	}

	public void setCamelContext(CamelContext camelContext) {
		this.camelContext = camelContext;
	}

	// using by sega route
	public void sendAudit(EAI_Log log) {
		logger.debug("send audit of " + log.getMsg_Text());
		audit.insertToEAI_LOG(log);
	}
	
	
	//
	//	TransactionEx interface
	//
	@Override
	public TransactionList getTransactionDetail(
			TransactionIDList transactionIDList) throws TransactionException {

		logger.debug("getTransactionDetail begin");
		long enterTime = System.currentTimeMillis();

		ArrayList<String> ids = (ArrayList<String>) transactionIDList
				.getTransactionID();
		ids.removeAll(Arrays.asList(Transaction_Constants.EMPTY));

		
		String[] tranIDs = ids.toArray(new String[0]);
		EAI_Log log = EAI_Log.enter(arrayToString(tranIDs, Transaction_Constants.COMMA_SEPERATOR), GET_TRANSACTION_DETAIL, EAI_Log.SYS_WebService, EAI_Log.SYS_SAP);
		
		if (ids == null || (ids != null && ids.size() <= 0 )  ) {
			EaiException exc = new EaiException();
			ErrorList errorList = new ErrorList();
			List<com.hmco.eai.Error> listError = errorList.getError();
			com.hmco.eai.Error e = new Error();
			e.setErrorCategory(ERROR_NO_TXN);
			e.setErrorCode(ERROR_NO_TXN);
			e.setErrorMessage(ERROR_NO_TXN);
			listError.add(e);
			exc.setErrorList(errorList);
			String errorBody = Converter.convertBodyToString(exc.getErrorList());
			log.toException(Converter.convertBodyToString(transactionIDList), ERROR_RQST,
					EAI_Log.EXEPTION_BUSINESS, errorBody);
			producer.sendBody(log.clone());
			throw new TransactionException(ERROR_RQST, exc);
		} else {
			boolean isError =  false;
			EaiException exc = new EaiException();
			ErrorList errorList = new ErrorList();
			List<com.hmco.eai.Error> listError = errorList.getError();
			for(String id : ids) {
				if(id != null && id.length() > 10) {
					isError = true;
					com.hmco.eai.Error e = new Error();
					e.setErrorCategory(Transaction_Constants.ERROR_CATEGORY);
					e.setErrorCode(Transaction_Constants.ERROR_CODE);
					e.setErrorMessage(ERROR_INVLD_LEN);
					listError.add(e);
					exc.setErrorList(errorList);
				}
			}
			if (isError) {
				String errorBody = Converter.convertBodyToString(exc.getErrorList());
				log.toException(Converter.convertBodyToString(transactionIDList), ERROR_RQST,
						EAI_Log.EXEPTION_BUSINESS, errorBody);
				producer.sendBody(log.clone());
				throw new TransactionException(ERROR_RQST, exc);
			}
		}
		
		producer.sendBody(log.clone());
		
		// new String[] {"0004265496", "0004261470", "0001029392"};
		Holder<Zvsales_Order_HType[]> T_Gt_HeadHolder = new Holder<Zvsales_Order_HType[]>();
		Holder<Zvso_LineitemType[]> T_Gt_ItemHolder = new Holder<Zvso_LineitemType[]>();
		Holder<ZvaddrType[]> T_Gt_AddrHolder = new Holder<ZvaddrType[]>();
		Holder<ZvsubscriptionType[]> T_Gt_SubHolder = new Holder<ZvsubscriptionType[]>();
		Holder<ZvsrType[]> T_SrepHolder = new Holder<ZvsrType[]>();
		Holder<ZvemailType[]> T_Email = new Holder<ZvemailType[]>();

		long requestTime = 0;
		long responseTime = 0;
		try {
			requestTime = System.currentTimeMillis();

			//
			// SAP Transaction Bean
			//
			log.toRequest();
			producer.sendBody(log.clone());

			
			bean.getTransactionDetail(tranIDs, T_Gt_HeadHolder,
					T_Gt_ItemHolder, T_Gt_AddrHolder, T_Gt_SubHolder,
					T_SrepHolder, T_Email);
			responseTime = System.currentTimeMillis();
			
			log.toResponse();
			producer.sendBody(log.clone());
			
			logger.debug("SAP time was " + (responseTime - requestTime)
					+ " ms.");

			TransactionList ret = makeTransactionList(T_Gt_HeadHolder.value,
					T_Gt_ItemHolder.value, T_Gt_AddrHolder.value,
					T_Gt_SubHolder.value, T_SrepHolder.value, T_Email.value);
			
			return ret;

		} catch ( TransactionException ex ) {  
			String errorBody = Converter.convertBodyToString(ex.getFaultInfo());
			log.toException(Converter.convertBodyToString(transactionIDList), ex.getMessage(),
					EAI_Log.EXEPTION_BUSINESS, errorBody);
			producer.sendBody(log.clone());
			throw ex;
		} catch (Exception ex) {
			ex.printStackTrace(System.err);
			logger.error("Exception calling getTransactionDetail", ex);
			requestTime = responseTime = 0;

			StringWriter stackTrace = new StringWriter();			
			ex.printStackTrace(new PrintWriter(stackTrace));
			stackTrace.flush();

			//log.toException(arrayToString(tranIDs, Transaction_Constants.COMMA_SEPERATOR), ex.getMessage(), EAI_Log.EXEPTION_SYSTEM, stackTrace.toString());
			log.toException(Converter.convertBodyToString(transactionIDList), ex.getMessage(), EAI_Log.EXEPTION_SYSTEM, stackTrace.toString());			
			producer.sendBody(log.clone());
			
			throw new TransactionException(ex.getMessage());
			
		} finally {
			long exitTime = System.currentTimeMillis();
			logger.debug("servicemix time was "
					+ ((exitTime - enterTime) - (responseTime - requestTime))
					+ " ms.");
			logger.debug("execution time was " + (exitTime - enterTime)
					+ " ms.");
			logger.debug("getTransactionDetail ends");
			
			log.toExit();
			producer.sendBody(log.clone());
		}

		//return null;
	}

	@Override
	public TransactionList findTransactions(
			com.hmco.eai.ots.transaction.TransactionSearchCriteria transactionSearchCriteria)
			throws TransactionException {
//		FindTransactions
		logger.debug("findTransactions begin");

		long enterTime = System.currentTimeMillis();

		Holder<Zvsales_Order_HType[]> T_Sales_HHolder = new Holder<Zvsales_Order_HType[]>();
		Holder<Zvso_LineitemType[]> T_Sales_DHolder = new Holder<Zvso_LineitemType[]>();
		Holder<ZvaddrType[]> T_AddrHolder = new Holder<ZvaddrType[]>();
		Holder<ZvsubscriptionType[]> T_SubsHolder = new Holder<ZvsubscriptionType[]>();
		Holder<ZvsrType[]> T_SrepHolder = new Holder<ZvsrType[]>();
		Holder<ZvemailType[]> T_EmailHolder = new Holder<ZvemailType[]>();
		Holder<ZvparvwType[]> T_ParvwHolder = new Holder<ZvparvwType[]>();
		Holder<Zbdcmsgcoll_RfcType> sapReturnList = new Holder<Zbdcmsgcoll_RfcType>();
		
		long requestTime = 0;
		long responseTime = 0;
		//TODO
		String custId = transactionSearchCriteria.getCustomerID() != null ? transactionSearchCriteria.getCustomerID() : Transaction_Constants.EMPTY; 
		String zipCode = transactionSearchCriteria.getZipCode() != null ? transactionSearchCriteria.getZipCode() : Transaction_Constants.EMPTY;  
		EAI_Log log = EAI_Log.enter(custId + Transaction_Constants.HYPHEN + zipCode, FIND_TRANSACTIONS, EAI_Log.SYS_WebService, EAI_Log.SYS_SAP);
		producer.sendBody(log.clone());
		
		boolean isError = false;
		ErrorList errorList = null;
		errorList = new ErrorList();
		List<com.hmco.eai.Error> listError = errorList.getError();
		
		if(transactionSearchCriteria.getCustomerID() != null && transactionSearchCriteria.getCustomerID().trim().length() > 10) {
			isError = true;
			com.hmco.eai.Error e = new Error();
			e.setErrorCategory(Transaction_Constants.CUS_ID_INVALID);
			e.setErrorCode(Transaction_Constants.CUS_ID_INVALID);
			e.setErrorMessage(Transaction_Constants.CUS_ID_INVALID);
			listError.add(e);
		}
		if(isError) {
			EaiException exc = new EaiException();
			exc.setErrorList(errorList);
			String errorBody = Converter.convertBodyToString(exc.getErrorList());
			log.toException(Converter.convertBodyToString(transactionSearchCriteria), ERROR_RQST,
					EAI_Log.EXEPTION_BUSINESS, errorBody);
			producer.sendBody(log.clone());
			throw new TransactionException(ERROR_RQST, exc);
		}
//		if(transactionSearchCriteria.)
		
		try {
			requestTime = System.currentTimeMillis();

			//
			// SAP Transaction Bean
			//
			Zvfindtrans_IpType I_Input = new Zvfindtrans_IpType();
			/**
			 * setInput
			 */
			I_Input.setClienttid(transactionSearchCriteria
					.getClientTransactionID());
			I_Input.setCountry(transactionSearchCriteria.getCountryCode());
			I_Input.setCustomer(transactionSearchCriteria.getCustomerID());
			String rqstLookupValue = hasher.getValue(
					Transaction_Constants.DIVISION, Transaction_Constants.ENTERPRISE,
					transactionSearchCriteria.getDivision(), Transaction_Constants.SAP);
			if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (transactionSearchCriteria.getDivision() != null && transactionSearchCriteria.getDivision().trim().length() > 0)) {
				isError = true;
				com.hmco.eai.Error e = new Error();
				e.setErrorCategory(Transaction_Constants.DIVISION_CODE_UNEXPECTED);
				e.setErrorCode(Transaction_Constants.DIVISION_CODE_UNEXPECTED);
				e.setErrorMessage(Transaction_Constants.DIVISION_CODE_UNEXPECTED);
				listError.add(e);
			}
			I_Input.setDivision(rqstLookupValue);
			I_Input.setFromdate(toSqlDate(transactionSearchCriteria
					.getFromDate()));
			I_Input.setInvoice(transactionSearchCriteria.getInvoiceNo());
			I_Input.setIsbn(transactionSearchCriteria.getIsbn());
			I_Input.setLimit(Transaction_Constants.EMPTY + transactionSearchCriteria.getLimitOfResults());
			I_Input.setMaterial(transactionSearchCriteria.getMaterialID());
			
			rqstLookupValue = hasher.getValue(
					Transaction_Constants.ORDER_SOURCE, Transaction_Constants.ENTERPRISE,
					transactionSearchCriteria.getOrderSource(), Transaction_Constants.SAP);
			if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (transactionSearchCriteria.getOrderSource() != null && transactionSearchCriteria.getOrderSource().trim().length() > 0)) {
				isError = true;
				com.hmco.eai.Error e = new Error();
				e.setErrorCategory(Transaction_Constants.ORDER_SOURCE_UNEXPECTED);
				e.setErrorCode(Transaction_Constants.ORDER_SOURCE_UNEXPECTED);
				e.setErrorMessage(Transaction_Constants.ORDER_SOURCE_UNEXPECTED);
				listError.add(e);
			}
			I_Input.setOdersource(rqstLookupValue);
			
			rqstLookupValue = hasher.getValue(
					Transaction_Constants.TRANSACTION_TYPE, Transaction_Constants.ENTERPRISE,
					transactionSearchCriteria.getTransactionType(), Transaction_Constants.SAP);
			if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (transactionSearchCriteria.getTransactionType() != null && transactionSearchCriteria.getTransactionType().trim().length() > 0)) {
				isError = true;
				com.hmco.eai.Error e = new Error();
				e.setErrorCategory(Transaction_Constants.TRANSACTION_TYPE_UNEXPECTED);
				e.setErrorCode(Transaction_Constants.TRANSACTION_TYPE_UNEXPECTED);
				e.setErrorMessage(Transaction_Constants.TRANSACTION_TYPE_UNEXPECTED);
				listError.add(e);
			}
			I_Input.setOrdertype(rqstLookupValue);
			I_Input.setPono(transactionSearchCriteria.getPoNo());
			I_Input.setSan(transactionSearchCriteria.getSanNumber());
			I_Input.setSearchtype(transactionSearchCriteria.getSearchType());
			
			rqstLookupValue = hasher.getValue(
					Transaction_Constants.TRANSACTION_STATUS, Transaction_Constants.ENTERPRISE,
					transactionSearchCriteria.getStatus(), Transaction_Constants.SAP);
			if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (transactionSearchCriteria.getStatus() != null && transactionSearchCriteria.getStatus().trim().length() > 0)) {
				isError = true;
				com.hmco.eai.Error e = new Error();
				e.setErrorCategory(Transaction_Constants.TRANSACTION_STATUS_UNEXPECTED);
				e.setErrorCode(Transaction_Constants.TRANSACTION_STATUS_UNEXPECTED);
				e.setErrorMessage(Transaction_Constants.TRANSACTION_STATUS_UNEXPECTED);
				listError.add(e);
			}
			I_Input.setStatus(rqstLookupValue);
			I_Input.setTodate(toSqlDate(transactionSearchCriteria.getToDate()));
			I_Input.setZipcode(transactionSearchCriteria.getZipCode());

			PartnerFunctionList ptnrFnInput = transactionSearchCriteria
					.getPartnerFunctionList();
			if (ptnrFnInput != null) {
				List<String> ptnrFnList = ptnrFnInput.getPartnerFunction();
				if (ptnrFnList != null && ptnrFnList.size() > 0) {
					ZvparvwType[] zvPtnrType = new ZvparvwType[ptnrFnList
							.size()];
					for (int i = 0; i < ptnrFnList.size(); i++) {
						zvPtnrType[i] = new ZvparvwType();
						rqstLookupValue = hasher.getValue(
								Transaction_Constants.PARTNER_FUNCTION,
								Transaction_Constants.ENTERPRISE, ptnrFnList.get(i), Transaction_Constants.SAP);
						
						if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (ptnrFnList.get(i) != null && ptnrFnList.get(i).trim().length() > 0)) {
							isError = true;
							com.hmco.eai.Error e = new Error();
							e.setErrorCategory(Transaction_Constants.PARTNER_FUNCTION_UNEXPECTED);
							e.setErrorCode(Transaction_Constants.PARTNER_FUNCTION_UNEXPECTED);
							e.setErrorMessage(Transaction_Constants.PARTNER_FUNCTION_UNEXPECTED);
							listError.add(e);
						}
						zvPtnrType[i].setParvw(rqstLookupValue);
					}
					T_ParvwHolder = new Holder<ZvparvwType[]>(zvPtnrType);
				}
			}

			if(isError) {
				EaiException exc = new EaiException();
				exc.setErrorList(errorList);
				String errorBody = Converter.convertBodyToString(exc.getErrorList());
				log.toException(Converter.convertBodyToString(transactionSearchCriteria), ERROR_RQST,
						EAI_Log.EXEPTION_BUSINESS, errorBody);
				producer.sendBody(log.clone());
				throw new TransactionException(ERROR_RQST, exc);
			}
			
			log.toRequest();
			producer.sendBody(log.clone());
			
			String sapErrorStatus = bean.findTransaction(I_Input, T_Sales_HHolder, T_Sales_DHolder,
					T_AddrHolder, T_SubsHolder, T_SrepHolder, T_ParvwHolder,
					T_EmailHolder, sapReturnList);

			log.toResponse();
			producer.sendBody(log.clone());
			
			responseTime = System.currentTimeMillis();
			logger.debug("SAP time was " + (responseTime - requestTime)
					+ " ms.");

			if( sapErrorStatus != null && sapErrorStatus.length() > 0 && !sapErrorStatus.endsWith(Transaction_Constants.ZERO)) {

				Zbdcmsgcoll_RfcType sapError = sapReturnList.value;

				EaiException exc = new EaiException();
				errorList = new ErrorList();
				listError = errorList.getError();
				com.hmco.eai.Error e = new Error();
				e.setErrorCategory(sapErrorStatus);
				e.setErrorCode(sapError.getMsgnr());
				e.setErrorMessage(sapError.getMsgv1());
				listError.add(e);
				exc.setErrorList(errorList);
				String errorBody = Converter.convertBodyToString(exc.getErrorList());
				log.toException(Converter.convertBodyToString(transactionSearchCriteria), ERROR_RQST,
						EAI_Log.EXEPTION_BUSINESS, errorBody);
				producer.sendBody(log.clone());
				throw new TransactionException(ERROR_RQST, exc);
			}
			TransactionList ret = makeTransactionList(T_Sales_HHolder.value,
					T_Sales_DHolder.value, T_AddrHolder.value,
					T_SubsHolder.value, T_SrepHolder.value, T_EmailHolder.value);

			return ret;

		} catch (TransactionException ex) {
			String errorBody = Converter.convertBodyToString(ex.getFaultInfo());
			log.toException(Converter.convertBodyToString(transactionSearchCriteria), ex.getMessage(),
					EAI_Log.EXEPTION_BUSINESS, errorBody);
			producer.sendBody(log.clone());
			throw ex;
		}
		catch (Exception ex) {
			ex.printStackTrace(System.err);
			logger.error("Exception calling findTransactions", ex);
			requestTime = responseTime = 0;
			
			StringWriter stackTrace = new StringWriter();			
			ex.printStackTrace(new PrintWriter(stackTrace));
			stackTrace.flush();

			log.toException(Converter.convertBodyToString(transactionSearchCriteria), ex.getMessage(), EAI_Log.EXEPTION_SYSTEM, stackTrace.toString());
			producer.sendBody(log.clone());
			throw new TransactionException(ex.getMessage());
		} finally {
			long exitTime = System.currentTimeMillis();
			logger.debug("servicemix time was "
					+ ((exitTime - enterTime) - (responseTime - requestTime))
					+ " ms.");
			logger.debug("execution time was " + (exitTime - enterTime)
					+ " ms.");
			logger.debug("findTransactions ends");
			
			log.toExit();
			producer.sendBody(log.clone());
		}

	}

	@Override
	public RetrieveInvoicePDFResponse retrieveInvoicePDF(
			RetrieveInvoicePDFRequest req)
			throws TransactionException {
		
		byte[] pdfBinary = retrieveInvoicePDFBinary(req);
		
		String pdfBase64String = DatatypeConverter.printBase64Binary(pdfBinary);
		RetrieveInvoicePDFResponse ret = new RetrieveInvoicePDFResponse();
		ret.setPdf(pdfBase64String);
		
		return ret;
	}
	
	public byte[] retrieveInvoicePDFBinary(
			RetrieveInvoicePDFRequest req)
			throws TransactionException {
		
		logger.debug("retrieveInvoicePDF begin");
		long enterTime = System.currentTimeMillis();
				
		EAI_Log log = EAI_Log.enter(req.getInvoiceId(), RETRIEVE_INVOICE_PDF, EAI_Log.SYS_WebService, EAI_Log.SYS_SAP);
		producer.sendBody(log.clone());
		
		// new String[] {"0004265496", "0004261470", "0001029392"};
		Holder<Zvsales_Order_HType[]> T_Gt_HeadHolder = new Holder<Zvsales_Order_HType[]>();
		Holder<Zvso_LineitemType[]> T_Gt_ItemHolder = new Holder<Zvso_LineitemType[]>();
		Holder<ZvaddrType[]> T_Gt_AddrHolder = new Holder<ZvaddrType[]>();
		Holder<ZvsubscriptionType[]> T_Gt_SubHolder = new Holder<ZvsubscriptionType[]>();
		Holder<ZvsrType[]> T_SrepHolder = new Holder<ZvsrType[]>();
		Holder<ZvemailType[]> T_Email = new Holder<ZvemailType[]>();

		long requestTime = 0;
		long responseTime = 0;
		try {
			requestTime = System.currentTimeMillis();

			boolean isError = false;
			ErrorList errorList = null;
			errorList = new ErrorList();
			List<com.hmco.eai.Error> listError = errorList.getError();
			
			String rqstType = hasher.getValue(
					Transaction_Constants.INVOICE_REQUEST_TYPE, Transaction_Constants.ENTERPRISE,
					req.getInvoiceRequestType(), Transaction_Constants.SAP);
			
			if( (rqstType == null || (rqstType != null && rqstType.trim().length() == 0)) && (req.getInvoiceRequestType() != null && req.getInvoiceRequestType().trim().length() > 0)) {
				isError = true;
				com.hmco.eai.Error e = new Error();
				e.setErrorCategory(Transaction_Constants.INVOICE_REQUEST_TYPE_UNEXPECTED);
				e.setErrorCode(Transaction_Constants.INVOICE_REQUEST_TYPE_UNEXPECTED);
				e.setErrorMessage(Transaction_Constants.INVOICE_REQUEST_TYPE_UNEXPECTED);
				listError.add(e);
				
				EaiException exc = new EaiException();
				exc.setErrorList(errorList);
				String errorBody = Converter.convertBodyToString(exc.getErrorList());
				log.toException(Converter.convertBodyToString(req), ERROR_RQST,
						EAI_Log.EXEPTION_BUSINESS, errorBody);
				producer.sendBody(log.clone());
				throw new TransactionException(ERROR_RQST, exc);
			}
			//
			// SAP Transaction Bean
			//
			log.toRequest();
			producer.sendBody(log.clone());
			
			//Holder<String> pdfStringHolder = new Holder<String>();
			Holder<byte[]> byteArrayHolder = new Holder<byte[]>();

			//Zbdcmsgcoll_RfcType rfcReturn = bean.sendInvoiceEmailPdf(req.getInvoiceId(), rqstType, req.getEmailSubject(), req.getEmailTo(), req.getEmailCc(), req.getEmailBody(), pdfStringHolder);
			Zbdcmsgcoll_RfcType rfcReturn = bean.sendInvoiceEmailPdf(req.getInvoiceId(), rqstType, req.getEmailSubject(), req.getEmailTo(), req.getEmailCc(), req.getEmailBody(), byteArrayHolder);
			
			responseTime = System.currentTimeMillis();
			
			log.toResponse();
			producer.sendBody(log.clone());
			
			logger.debug("SAP time was " + (responseTime - requestTime)
					+ " ms.");
			
			if( rfcReturn != null && rfcReturn.getMsgtyp() != null && rfcReturn.getMsgtyp().equalsIgnoreCase(Transaction_Constants.S) ) {
				//String pdfBase64String = DatatypeConverter.printBase64Binary(byteArrayHolder.value);
				//RetrieveInvoicePDFResponse ret = new RetrieveInvoicePDFResponse();
				//ret.setPdf(pdfBase64String);
				return byteArrayHolder.value;
			} else {
				EaiException exc = new EaiException();
				errorList = new ErrorList();
				listError = errorList.getError();
				com.hmco.eai.Error e = new Error();
				e.setErrorCategory(rfcReturn.getMsgtyp());
				e.setErrorCode(rfcReturn.getMsgnr());
				e.setErrorMessage(rfcReturn.getMsgv1());
				listError.add(e);
				exc.setErrorList(errorList);
				String errorBody = Converter.convertBodyToString(exc.getErrorList());
				log.toException(Converter.convertBodyToString(req), ERROR_RQST,
						EAI_Log.EXEPTION_BUSINESS, errorBody);
				producer.sendBody(log.clone());
				throw new TransactionException(ERROR_RQST, exc);
			}
		}
		catch (TransactionException ex) {
			String errorBody = Converter.convertBodyToString(ex.getFaultInfo());
			log.toException(Converter.convertBodyToString(req), ex.getMessage(),
					EAI_Log.EXEPTION_BUSINESS, errorBody);
			producer.sendBody(log.clone());
			throw ex;
		}
		catch (Exception ex) {
			ex.printStackTrace(System.err);
			logger.error("Exception calling retrieveInvoicePDF", ex);
			requestTime = responseTime = 0;

			StringWriter stackTrace = new StringWriter();			
			ex.printStackTrace(new PrintWriter(stackTrace));
			stackTrace.flush();

			
			log.toException(Converter.convertBodyToString(req), ex.getMessage(), EAI_Log.EXEPTION_SYSTEM, stackTrace.toString());			
			producer.sendBody(log.clone());
			
			throw new TransactionException(ex.getMessage());

		} finally {
			long exitTime = System.currentTimeMillis();
			logger.debug("servicemix time was "
					+ ((exitTime - enterTime) - (responseTime - requestTime))
					+ " ms.");
			logger.debug("execution time was " + (exitTime - enterTime)
					+ " ms.");
			logger.debug("retrieveInvoicePDF ends");
			
			log.toExit();
			producer.sendBody(log.clone());
		}
	}

	@Override
	public com.hmco.eai.ots.transactionnew.TransactionList getTransactionDetailEx(
			com.hmco.eai.ots.transactionnew.TransactionIDList transactionIDList)
			throws TransactionException {

		logger.debug("getTransactionDetailEx begin");
		long enterTime = System.currentTimeMillis();

		ArrayList<String> ids = (ArrayList<String>) transactionIDList
				.getTransactionID();
		ids.removeAll(Arrays.asList(Transaction_Constants.EMPTY));
		
		String[] tranIDs = ids.toArray(new String[0]);
		EAI_Log log = EAI_Log.enter(arrayToString(tranIDs, Transaction_Constants.COMMA_SEPERATOR), GET_TRANSACTION_DETAIL, EAI_Log.SYS_WebService, EAI_Log.SYS_SAP);
		
		if (ids == null || (ids != null && ids.size() <= 0 )  ) {
			EaiException exc = new EaiException();
			ErrorList errorList = new ErrorList();
			List<com.hmco.eai.Error> listError = errorList.getError();
			com.hmco.eai.Error e = new Error();
			e.setErrorCategory(ERROR_NO_TXN);
			e.setErrorCode(ERROR_NO_TXN);
			e.setErrorMessage(ERROR_NO_TXN);
			listError.add(e);
			exc.setErrorList(errorList);
			String errorBody = Converter.convertBodyToString(exc.getErrorList());
			log.toException(Converter.convertBodyToString(transactionIDList), ERROR_RQST,
					EAI_Log.EXEPTION_BUSINESS, errorBody);
			producer.sendBody(log.clone());
			throw new TransactionException(ERROR_RQST, exc);
		} else {
			boolean isError = false;
			EaiException exc = new EaiException();
			ErrorList errorList = new ErrorList();
			List<com.hmco.eai.Error> listError = errorList.getError();
			for(String id : ids) {
				if(id != null && id.length() > 10) {
					isError = true;
					com.hmco.eai.Error e = new Error();
					e.setErrorCategory(Transaction_Constants.ERROR_CATEGORY);
					e.setErrorCode(Transaction_Constants.ERROR_CODE);
					e.setErrorMessage(ERROR_INVLD_LEN);
					listError.add(e);
					exc.setErrorList(errorList);
				}
			}
			if(isError) {
				String errorBody = Converter.convertBodyToString(exc.getErrorList());
				log.toException(Converter.convertBodyToString(transactionIDList), ERROR_RQST,
						EAI_Log.EXEPTION_BUSINESS, errorBody);
				producer.sendBody(log.clone());
				throw new TransactionException(ERROR_RQST, exc);
			}
		}
		
		producer.sendBody(log.clone());
		
		// new String[] {"0004265496", "0004261470", "0001029392"};
		Holder<Zvsales_Order_HType[]> T_Gt_HeadHolder = new Holder<Zvsales_Order_HType[]>();
		Holder<Zvso_LineitemType[]> T_Gt_ItemHolder = new Holder<Zvso_LineitemType[]>();
		Holder<ZvaddrType[]> T_Gt_AddrHolder = new Holder<ZvaddrType[]>();
		Holder<ZvsubscriptionType[]> T_Gt_SubHolder = new Holder<ZvsubscriptionType[]>();
		Holder<ZvsrType[]> T_SrepHolder = new Holder<ZvsrType[]>();
		Holder<ZvemailType[]> T_Email = new Holder<ZvemailType[]>();

		long requestTime = 0;
		long responseTime = 0;
		try {
			requestTime = System.currentTimeMillis();

			//
			// SAP Transaction Bean
			//
			log.toRequest();
			producer.sendBody(log.clone());

			
			bean.getTransactionDetail(tranIDs, T_Gt_HeadHolder,
					T_Gt_ItemHolder, T_Gt_AddrHolder, T_Gt_SubHolder,
					T_SrepHolder, T_Email);
			responseTime = System.currentTimeMillis();
			
			log.toResponse();
			producer.sendBody(log.clone());
			
			logger.debug("SAP time was " + (responseTime - requestTime)
					+ " ms.");

			com.hmco.eai.ots.transactionnew.TransactionList ret = makeTransactionListEx(T_Gt_HeadHolder.value,
					T_Gt_ItemHolder.value, T_Gt_AddrHolder.value,
					T_Gt_SubHolder.value, T_SrepHolder.value, T_Email.value);


/*			
			//
			//  very dirty trick, and it too much work to replacement per line items
			//
			XStream xstream = new XStream();
			String xmlBody = xstream.toXML(ret);
			String xmlBody1 = xmlBody.replace("com.hmco.eai.ots.transaction.", "com.hmco.eai.ots.transactionnew.");
			String xmlBody2 = xmlBody1.replace("productInfo", "productInfo2");
			logger.debug(xmlBody2);
			com.hmco.eai.ots.transactionnew.TransactionList ret2 = (com.hmco.eai.ots.transactionnew.TransactionList) xstream.fromXML(xmlBody2);
			return ret2;
*/
			return ret;
			
		} catch ( TransactionException ex ) {
			String errorBody = Converter.convertBodyToString(ex.getFaultInfo());
			log.toException(Converter.convertBodyToString(transactionIDList), ex.getMessage(),
					EAI_Log.EXEPTION_BUSINESS, errorBody);
			producer.sendBody(log.clone());
			throw ex;
		} catch (Exception ex) {
			ex.printStackTrace(System.err);
			logger.error("Exception calling getTransactionDetail", ex);
			requestTime = responseTime = 0;

			StringWriter stackTrace = new StringWriter();			
			ex.printStackTrace(new PrintWriter(stackTrace));
			stackTrace.flush();

			log.toException(Converter.convertBodyToString(transactionIDList), ex.getMessage(), EAI_Log.EXEPTION_SYSTEM, stackTrace.toString());
			producer.sendBody(log.clone());
			throw new TransactionException(ex.getMessage());

		} finally {
			long exitTime = System.currentTimeMillis();
			logger.debug("servicemix time was "
					+ ((exitTime - enterTime) - (responseTime - requestTime))
					+ " ms.");
			logger.debug("execution time was " + (exitTime - enterTime)
					+ " ms.");
			logger.debug("getTransactionDetail ends");
			
			log.toExit();
			producer.sendBody(log.clone());
		}

	}


	
	@Override
	public InvoiceDetailsList getInvoices(
			TransactionIDList transactionIDListGetInvoices)
			throws TransactionException {

		logger.debug("getInvoices begin");
		long enterTime = System.currentTimeMillis();

		List<String> transIdList = transactionIDListGetInvoices
				.getTransactionID();
		transIdList.removeAll(Arrays.asList(Transaction_Constants.EMPTY));

		String[] transIdArray = new String[transIdList.size()];
		transIdList.toArray(transIdArray);

		EAI_Log log = EAI_Log.enter(arrayToString(transIdArray, Transaction_Constants.COMMA_SEPERATOR), GET_INVOICES, EAI_Log.SYS_WebService, EAI_Log.SYS_SAP);

		if (transIdList == null || (transIdList != null && transIdList.size() <= 0)) {
			EaiException exc = new EaiException();
			ErrorList errorList = new ErrorList();
			List<com.hmco.eai.Error> listError = errorList.getError();
			com.hmco.eai.Error e = new Error();
			e.setErrorCategory(ERROR_NO_TXN);
			e.setErrorCode(ERROR_NO_TXN);
			e.setErrorMessage(ERROR_NO_TXN);
			listError.add(e);
			exc.setErrorList(errorList);
			String errorBody = Converter.convertBodyToString(exc.getErrorList());
			log.toException(Converter.convertBodyToString(transactionIDListGetInvoices), ERROR_RQST,
					EAI_Log.EXEPTION_BUSINESS, errorBody);
			producer.sendBody(log.clone());
			throw new TransactionException(ERROR_RQST, exc);
		}  else {
			boolean isError = false;
			EaiException exc = new EaiException();
			ErrorList errorList = new ErrorList();
			List<com.hmco.eai.Error> listError = errorList.getError();
			for(String id : transIdList) {
				if(id != null && id.length() > 10) {
					isError = true;
					com.hmco.eai.Error e = new Error();
					e.setErrorCategory(Transaction_Constants.ERROR_CATEGORY);
					e.setErrorCode(Transaction_Constants.ERROR_CODE);
					e.setErrorMessage(ERROR_INVLD_LEN);
					listError.add(e);
					exc.setErrorList(errorList);
					
				}
			} 
			if(isError) {
				String errorBody = Converter.convertBodyToString(exc.getErrorList());
				log.toException(Converter.convertBodyToString(transactionIDListGetInvoices), ERROR_RQST,
						EAI_Log.EXEPTION_BUSINESS, errorBody);
				producer.sendBody(log.clone());
				throw new TransactionException(ERROR_RQST, exc);
			}
		}
		
		producer.sendBody(log.clone());
		
		Holder<Zvgetinvoice_HType[]> T_BilldocheadHolder = new Holder<Zvgetinvoice_HType[]>();
		Holder<Zvgetinvoice_LType[]> T_BilldocdetailHolder = new Holder<Zvgetinvoice_LType[]>();
		Holder<ZvsubscriptionType[]> T_SubsHolder = new Holder<ZvsubscriptionType[]>();

		long requestTime = 0;
		long responseTime = 0;
		InvoiceDetailsList invoiceList;
		try {
			requestTime = System.currentTimeMillis();

			log.toRequest();
			producer.sendBody(log.clone());
			
			bean.getInvoices(transIdArray, T_BilldocheadHolder,
					T_BilldocdetailHolder, T_SubsHolder);
			responseTime = System.currentTimeMillis();
			
			log.toResponse();
			producer.sendBody(log.clone());
			
			logger.debug("SAP time was " + (responseTime - requestTime)
					+ " ms.");

			invoiceList = makeInvoiceDetailsList(T_BilldocheadHolder.value,
					T_BilldocdetailHolder.value, T_SubsHolder.value);
			return invoiceList;
		} catch ( TransactionException ex ) {
			String errorBody = Converter.convertBodyToString(ex.getFaultInfo());
			log.toException(Converter.convertBodyToString(transactionIDListGetInvoices), ERROR_RQST,
					EAI_Log.EXEPTION_BUSINESS, errorBody);
			producer.sendBody(log.clone());
			throw ex;
		}
		catch (Exception ex) {
			ex.printStackTrace(System.err);
			logger.error("Exception calling getInvoices", ex);
			requestTime = responseTime = 0;
			
			StringWriter stackTrace = new StringWriter();			
			ex.printStackTrace(new PrintWriter(stackTrace));
			stackTrace.flush();
			
			log.toException(Converter.convertBodyToString(transactionIDListGetInvoices), ex.getMessage(), EAI_Log.EXEPTION_SYSTEM, stackTrace.toString());
			producer.sendBody(log.clone());
			throw new TransactionException(ex.getMessage());
		} finally {
			long exitTime = System.currentTimeMillis();
			logger.debug("servicemix time was "
					+ ((exitTime - enterTime) - (responseTime - requestTime))
					+ " ms.");
			logger.debug("execution time was " + (exitTime - enterTime)
					+ " ms.");
			logger.debug("getInvoices ends");
			
			log.toExit();
			producer.sendBody(log.clone());
		}
	}


	//
	//	helper methods
	//
	TransactionList makeTransactionList(Zvsales_Order_HType[] headers,
			Zvso_LineitemType[] items, ZvaddrType[] addrs,
			ZvsubscriptionType[] subs, ZvsrType[] sreps, ZvemailType[] emails)
			throws Exception {
		//
		// making maps
		//
		HashMap<String, Zvsales_Order_HType> headerMap = new HashMap<String, Zvsales_Order_HType>();
		for (int i = 0; i < headers.length; ++i)
			headerMap.put(headers[i].getTransactionid(), headers[i]);

		ArrayListMultimap<String, Zvso_LineitemType> itemMap = ArrayListMultimap
				.<String, Zvso_LineitemType> create();
		for (int i = 0; i < items.length; ++i)
			itemMap.put(items[i].getTransactionid(), items[i]);

		HashMap<Triple<String, String, String>, ZvaddrType> addrMap = new HashMap<Triple<String, String, String>, ZvaddrType>();
		for (int i = 0; i < addrs.length; ++i) {
			addrMap.put(
					new Triple<String, String, String>(addrs[i]
							.getTransactionid(), addrs[i].getCustid(), addrs[i]
							.getCusttyp()), addrs[i]);
		}

		HashMap<Pair<String, String>, ZvsubscriptionType> subMap = new HashMap<Pair<String, String>, ZvsubscriptionType>();
		for (int i = 0; i < subs.length; ++i) {
			subMap.put(
					new Pair<String, String>(subs[i].getInv_No(), subs[i]
							.getLinenum()), subs[i]);
		}

		ArrayListMultimap<Pair<String, String>, ZvsrType> srepMap = ArrayListMultimap
				.<Pair<String, String>, ZvsrType> create();
		for (int i = 0; i < sreps.length; ++i) {
			srepMap.put(new Pair<String, String>(sreps[i].getTransactionid(),
					sreps[i].getLinenum()), sreps[i]);
		}

		ArrayListMultimap<Pair<String, String>, ZvemailType> emailMap = ArrayListMultimap
				.<Pair<String, String>, ZvemailType> create();
		for (int i = 0; i < emails.length; ++i) {
			emailMap.put(new Pair<String, String>(emails[i].getTransactionid(),
					emails[i].getCusttyp()), emails[i]);
		}

		TransactionList ret = new TransactionList();
		List<Transaction> list = ret.getTransaction();
		String respLookupValue = null; 
		// For keys of a map
		for (Iterator<String> it = headerMap.keySet().iterator(); it.hasNext();) {
			String tranID = it.next();
			Zvsales_Order_HType h = headerMap.get(tranID);

			Transaction t = new Transaction();
			t.setTransactionID(tranID);
			
			respLookupValue = hasher.getValue(Transaction_Constants.TRANSACTION_TYPE,
					Transaction_Constants.SAP, h.getType(), Transaction_Constants.ENTERPRISE);
			
			t.setType((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.TRANSACTION_TYPE_UNEXPECTED : respLookupValue);
			t.setPoNumber(h.getPono());

			respLookupValue = hasher.getValue(
					Transaction_Constants.TRANSACTION_STATUS, Transaction_Constants.SAP,
					h.getStatus(), Transaction_Constants.ENTERPRISE);
			t.setStatus((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.TRANSACTION_STATUS_UNEXPECTED : respLookupValue);

			// GregorianCalendar c = new GregorianCalendar();
			// c.setTime( h.getCreationdate());
			// t.setCreationDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(c));
			t.setCreationDate(toXMLGregorianCalendar(h.getCreationdate()));

			respLookupValue = hasher.getValue(
					Transaction_Constants.ORDER_SOURCE, Transaction_Constants.SAP,
					h.getOrdersource(), Transaction_Constants.ENTERPRISE);
			t.setOrderSource((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.ORDER_SOURCE_UNEXPECTED : respLookupValue);
			respLookupValue = hasher.getValue(Transaction_Constants.DIVISION, Transaction_Constants.SAP,
					h.getDivision(), Transaction_Constants.ENTERPRISE); 
			t.setDivision((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.DIVISION_CODE_UNEXPECTED : respLookupValue);
			t.setSalesOffice(h.getSalesoffice());
			t.setCustomerEmail(h.getEmail());
			t.setSoldToCustomerID(h.getSoldtocustid());
			t.setSoldToSANNumber(h.getSoldtosan());
			t.setSoldToCustomerName(h.getSoldtocustname());
			t.setSoldToCustomerEmailAddress(h.getSoldtoemail());
			{
				ZvaddrType adrT = addrMap
						.get(new Triple<String, String, String>(tranID, h
								.getSoldtocustid(), Transaction_Constants.AG));
				List<ZvemailType> emailList = emailMap
						.get(new Pair<String, String>(tranID,
								Transaction_Constants.AG));
				if (adrT != null)
					t.setSoldToCustomerAddress(makeAddr(adrT, emailList));
			}
			t.setShipToCustomerID(h.getShiptocustid());
			t.setShipToSANNumber(h.getShiptosan());
			t.setShipToCustomerName(h.getShiptocustname());
			t.setShipToCustomerEmailAddress(h.getShiptoemail());
			{
				ZvaddrType adrT = addrMap
						.get(new Triple<String, String, String>(tranID, h
								.getShiptocustid(), Transaction_Constants.WE));
				List<ZvemailType> emailList = emailMap
						.get(new Pair<String, String>(tranID,
								Transaction_Constants.WE));
				if (adrT != null)
					t.setShipToCustomerAddress(makeAddr(adrT, emailList));
			}
			t.setBillToCustomerID(h.getBilltocustid());
			t.setBillToSANNumber(h.getBilltosan());
			t.setBillToCustomerName(h.getBilltocustname());
			t.setBillToCustomerEmailAddress(h.getBilltoemail());
			{
				ZvaddrType adrT = addrMap
						.get(new Triple<String, String, String>(tranID, h
								.getBilltocustid(), Transaction_Constants.RE));
				List<ZvemailType> emailList = emailMap
						.get(new Pair<String, String>(tranID,
								Transaction_Constants.RE));
				if (adrT != null)
					t.setBillToCustomerAddress(makeAddr(adrT, emailList));
			}
			t.setIsHeaderComplete(h.getComplete().equalsIgnoreCase(
					Transaction_Constants.Y));
			respLookupValue = hasher.getValue(
					Transaction_Constants.TRANSACTION_REJECTION_STATUS, Transaction_Constants.SAP,
					h.getRejectstatus(), Transaction_Constants.ENTERPRISE);
			t.setTransactionRejectionStatus((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.TRANSACTION_REJECTION_STATUS_UNEXPECTED : respLookupValue);
			t.setShipToCareOf1(h.getShipto_Careof1());
			t.setShipToCareOf2(h.getShipto_Careof2());
			respLookupValue = hasher.getValue(
					Transaction_Constants.BILLING_BLOCK, Transaction_Constants.SAP,
					h.getBilling_Block(), Transaction_Constants.ENTERPRISE);
			t.setBillingBlock((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.BILLING_BLOCK_UNEXPECTED : respLookupValue);

			// protected List<TransactionLineItem> transactionLineItem;
			List<TransactionLineItem> liList = t.getTransactionLineItem();
			makeLineItems(liList, itemMap.get(tranID), subMap, srepMap);

			list.add(t);
		}

		return ret;
	}

	com.hmco.eai.ots.transactionnew.TransactionList makeTransactionListEx(Zvsales_Order_HType[] headers,
			Zvso_LineitemType[] items, ZvaddrType[] addrs,
			ZvsubscriptionType[] subs, ZvsrType[] sreps, ZvemailType[] emails)
			throws Exception {
		//
		// making maps
		//
		HashMap<String, Zvsales_Order_HType> headerMap = new HashMap<String, Zvsales_Order_HType>();
		for (int i = 0; i < headers.length; ++i)
			headerMap.put(headers[i].getTransactionid(), headers[i]);

		ArrayListMultimap<String, Zvso_LineitemType> itemMap = ArrayListMultimap
				.<String, Zvso_LineitemType> create();
		for (int i = 0; i < items.length; ++i)
			itemMap.put(items[i].getTransactionid(), items[i]);

		HashMap<Triple<String, String, String>, ZvaddrType> addrMap = new HashMap<Triple<String, String, String>, ZvaddrType>();
		for (int i = 0; i < addrs.length; ++i) {
			addrMap.put(
					new Triple<String, String, String>(addrs[i]
							.getTransactionid(), addrs[i].getCustid(), addrs[i]
							.getCusttyp()), addrs[i]);
		}

		HashMap<Pair<String, String>, ZvsubscriptionType> subMap = new HashMap<Pair<String, String>, ZvsubscriptionType>();
		for (int i = 0; i < subs.length; ++i) {
			subMap.put(
					new Pair<String, String>(subs[i].getInv_No(), subs[i]
							.getLinenum()), subs[i]);
		}

		ArrayListMultimap<Pair<String, String>, ZvsrType> srepMap = ArrayListMultimap
				.<Pair<String, String>, ZvsrType> create();
		for (int i = 0; i < sreps.length; ++i) {
			srepMap.put(new Pair<String, String>(sreps[i].getTransactionid(),
					sreps[i].getLinenum()), sreps[i]);
		}

		ArrayListMultimap<Pair<String, String>, ZvemailType> emailMap = ArrayListMultimap
				.<Pair<String, String>, ZvemailType> create();
		for (int i = 0; i < emails.length; ++i) {
			emailMap.put(new Pair<String, String>(emails[i].getTransactionid(),
					emails[i].getCusttyp()), emails[i]);
		}

		com.hmco.eai.ots.transactionnew.TransactionList ret = new com.hmco.eai.ots.transactionnew.TransactionList();
		List<com.hmco.eai.ots.transactionnew.Transaction> list = ret.getTransaction();
		String respLookupValue = null;
		// For keys of a map
		for (Iterator<String> it = headerMap.keySet().iterator(); it.hasNext();) {
			String tranID = it.next();
			Zvsales_Order_HType h = headerMap.get(tranID);

			com.hmco.eai.ots.transactionnew.Transaction t = new com.hmco.eai.ots.transactionnew.Transaction();
			t.setTransactionID(tranID);
			respLookupValue = hasher.getValue(Transaction_Constants.TRANSACTION_TYPE,
					Transaction_Constants.SAP, h.getType(), Transaction_Constants.ENTERPRISE); 
			t.setType((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.TRANSACTION_TYPE_UNEXPECTED : respLookupValue);
			t.setPoNumber(h.getPono());
			respLookupValue = hasher.getValue(
					Transaction_Constants.TRANSACTION_STATUS, Transaction_Constants.SAP,
					h.getStatus(), Transaction_Constants.ENTERPRISE); 
			t.setStatus((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.TRANSACTION_STATUS_UNEXPECTED : respLookupValue);

			// GregorianCalendar c = new GregorianCalendar();
			// c.setTime( h.getCreationdate());
			// t.setCreationDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(c));
			t.setCreationDate(toXMLGregorianCalendar(h.getCreationdate()));

			respLookupValue = hasher.getValue(
					Transaction_Constants.ORDER_SOURCE, Transaction_Constants.SAP,
					h.getOrdersource(), Transaction_Constants.ENTERPRISE); 
			t.setOrderSource((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.ORDER_SOURCE_UNEXPECTED : respLookupValue);
			respLookupValue = hasher.getValue(Transaction_Constants.DIVISION, Transaction_Constants.SAP,
					h.getDivision(), Transaction_Constants.ENTERPRISE); 
			t.setDivision((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.DIVISION_CODE_UNEXPECTED : respLookupValue);
			t.setSalesOffice(h.getSalesoffice());
			t.setCustomerEmail(h.getEmail());
			t.setSoldToCustomerID(h.getSoldtocustid());
			t.setSoldToSANNumber(h.getSoldtosan());
			t.setSoldToCustomerName(h.getSoldtocustname());
			t.setSoldToCustomerEmailAddress(h.getSoldtoemail());
			{
				ZvaddrType adrT = addrMap
						.get(new Triple<String, String, String>(tranID, h
								.getSoldtocustid(), Transaction_Constants.AG));
				List<ZvemailType> emailList = emailMap
						.get(new Pair<String, String>(tranID,
								Transaction_Constants.AG));
				if (adrT != null)
					t.setSoldToCustomerAddress(makeAddr(adrT, emailList));
			}
			t.setShipToCustomerID(h.getShiptocustid());
			t.setShipToSANNumber(h.getShiptosan());
			t.setShipToCustomerName(h.getShiptocustname());
			t.setShipToCustomerEmailAddress(h.getShiptoemail());
			{
				ZvaddrType adrT = addrMap
						.get(new Triple<String, String, String>(tranID, h
								.getShiptocustid(), Transaction_Constants.WE));
				List<ZvemailType> emailList = emailMap
						.get(new Pair<String, String>(tranID,
								Transaction_Constants.WE));
				if (adrT != null)
					t.setShipToCustomerAddress(makeAddr(adrT, emailList));
			}
			t.setBillToCustomerID(h.getBilltocustid());
			t.setBillToSANNumber(h.getBilltosan());
			t.setBillToCustomerName(h.getBilltocustname());
			t.setBillToCustomerEmailAddress(h.getBilltoemail());
			{
				ZvaddrType adrT = addrMap
						.get(new Triple<String, String, String>(tranID, h
								.getBilltocustid(), Transaction_Constants.RE));
				List<ZvemailType> emailList = emailMap
						.get(new Pair<String, String>(tranID,
								Transaction_Constants.RE));
				if (adrT != null)
					t.setBillToCustomerAddress(makeAddr(adrT, emailList));
			}
			t.setIsHeaderComplete(h.getComplete().equalsIgnoreCase(
					Transaction_Constants.Y));
			respLookupValue = hasher.getValue(
					Transaction_Constants.TRANSACTION_REJECTION_STATUS, Transaction_Constants.SAP,
					h.getRejectstatus(), Transaction_Constants.ENTERPRISE);
			t.setTransactionRejectionStatus((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.TRANSACTION_REJECTION_STATUS_UNEXPECTED : respLookupValue);
			t.setShipToCareOf1(h.getShipto_Careof1());
			t.setShipToCareOf2(h.getShipto_Careof2());
			respLookupValue = hasher.getValue(
					Transaction_Constants.BILLING_BLOCK, Transaction_Constants.SAP,
					h.getBilling_Block(), Transaction_Constants.ENTERPRISE);
			t.setBillingBlock((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.BILLING_BLOCK_UNEXPECTED : respLookupValue);

			// protected List<TransactionLineItem> transactionLineItem;
			List<com.hmco.eai.ots.transactionnew.TransactionLineItem> liList = t.getTransactionLineItem();
			makeLineItemsEx(liList, itemMap.get(tranID), subMap, srepMap);

			list.add(t);
		}

		return ret;
	}

	private Address makeAddr(ZvaddrType t, List<ZvemailType> list) {
		Address ret = new Address();
		ret.setAddressLine1(t.getAddline1());
		ret.setAddressLine2(t.getAddline2());
		ret.setPoBox(t.getPo_Box());
		ret.setCity(t.getCity());
		ret.setState(t.getState());
		ret.setZipcode(t.getZip());
		ret.setCountryCode(t.getCountry());

		List<EmailAddressStruct> emailList = ret.getEmailAddressStruct();
		for (ZvemailType email : list) {
			EmailAddressStruct e = new EmailAddressStruct();
			e.setEmailAddress(email.getEmail());
			if(email.getFlgdefault() != null) {
				e.setIsPrimary(email.getFlgdefault().equalsIgnoreCase(
						Transaction_Constants.X));	
			}
			emailList.add(e);
		}

		return ret;
	}

	private void makeLineItems(List<TransactionLineItem> liList,
			List<Zvso_LineitemType> itemList,
			HashMap<Pair<String, String>, ZvsubscriptionType> subMap,
			ArrayListMultimap<Pair<String, String>, ZvsrType> srepMap)
			throws Exception {

		String respLookupValue = null;
		for (Zvso_LineitemType t : itemList) {
			TransactionLineItem li = new TransactionLineItem();

			ZvsubscriptionType sub = subMap.get(new Pair<String, String>(t
					.getTransactionid(), t.getLinenum()));
			li.setProductInfo(makeProductInfo(t, sub));
			
			respLookupValue = hasher.getValue(
					Transaction_Constants.LINE_ITEM_STATUS, Transaction_Constants.SAP,
					t.getLinestatus(), Transaction_Constants.ENTERPRISE);
			li.setLineitemStatus((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.LINE_ITEM_STATUS_UNEXPECTED : respLookupValue);
			
			respLookupValue = hasher.getValue(
					Transaction_Constants.LINE_ITEM_REJECTION_STATUS, Transaction_Constants.SAP,
					t.getRejectstatus(), Transaction_Constants.ENTERPRISE);
			li.setLineitemRejectionStatus((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.LINE_ITEM_REJECTION_STATUS_UNEXPECTED : respLookupValue);

			/*if ((li.getLineitemRejectionStatus() != null)
					&& (li.getLineitemStatus() == null)) {
				// o stupid SAP...it sends rejectionStatus without itemStatus
				// so to prevent schema validation, will set itemStatus to _UNEXPECTED
				li.setLineitemStatus(Transaction_Constants.LINE_ITEM_STATUS + "_UNEXPECTED");
			}*/

			li.setIsLineitemComplete(t.getComplete().equalsIgnoreCase(Transaction_Constants.Y));
			respLookupValue = hasher.getValue(
					Transaction_Constants.MATERIAL_STATUS, Transaction_Constants.SAP,
					t.getTitlestatus(), Transaction_Constants.ENTERPRISE);
			li.setTitleStatus((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.MATERIAL_STATUS_UNEXPECTED : respLookupValue);
			respLookupValue = hasher.getValue(
					Transaction_Constants.DELIVERY_BLOCK, Transaction_Constants.SAP, t.getDblock(),
					Transaction_Constants.ENTERPRISE);
			li.setDeliveryBlock((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.DELIVERY_BLOCK_UNEXPECTED : respLookupValue);

			// GregorianCalendar c = new GregorianCalendar();
			// Date d = t.getCrdate();
			// c.setTime(d);
			// li.setRequestDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(c));
			li.setRequestDate(toXMLGregorianCalendar(t.getCrdate()));

			// c.setTime(t.getAvailabledt());
			// li.setAvailableDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(c));
			li.setAvailableDate(toXMLGregorianCalendar(t.getAvailabledt()));
			String itemType = hasher.getValue(Transaction_Constants.ITEM_TYPE,
					Transaction_Constants.SAP, t.getItem_Type(), Transaction_Constants.ENTERPRISE);
			li.setItemType(itemType != null && itemType.trim().length() > 0 ? itemType : Transaction_Constants.ITEM_TYPE_UNEXPECTED);
			li.setIsKitComponent(t.getIskitcomp().equalsIgnoreCase(
					Transaction_Constants.Y));

			List<ZvsrType> srepList = srepMap.get(new Pair<String, String>(t
					.getTransactionid(), t.getLinenum()));
			List<SalesRep> list = li.getSalesRep();
			makeSalesRep(srepList, list);

			liList.add(li);
		}
	}

	private void makeLineItemsEx(List<com.hmco.eai.ots.transactionnew.TransactionLineItem> liList,
			List<Zvso_LineitemType> itemList,
			HashMap<Pair<String, String>, ZvsubscriptionType> subMap,
			ArrayListMultimap<Pair<String, String>, ZvsrType> srepMap)
			throws Exception {

		String respLookupValue = null;
		for (Zvso_LineitemType t : itemList) {
			com.hmco.eai.ots.transactionnew.TransactionLineItem li = new com.hmco.eai.ots.transactionnew.TransactionLineItem();

			ZvsubscriptionType sub = subMap.get(new Pair<String, String>(t
					.getTransactionid(), t.getLinenum()));
			li.setProductInfo2(makeProductInfo2(t, sub));
			respLookupValue = hasher.getValue(
					Transaction_Constants.LINE_ITEM_STATUS, Transaction_Constants.SAP,
					t.getLinestatus(), Transaction_Constants.ENTERPRISE);
			li.setLineitemStatus((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.LINE_ITEM_STATUS_UNEXPECTED : respLookupValue);
			respLookupValue = hasher.getValue(
					Transaction_Constants.LINE_ITEM_REJECTION_STATUS, Transaction_Constants.SAP,
					t.getRejectstatus(), Transaction_Constants.ENTERPRISE);
			li.setLineitemRejectionStatus((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.LINE_ITEM_REJECTION_STATUS_UNEXPECTED : respLookupValue);
			
			/*if ((li.getLineitemRejectionStatus() != null)
					&& (li.getLineitemStatus() == null)) {
				// o stupid SAP...it sends rejectionStatus without itemStatus
				// so to prevent schema validation, will set itemStatus to _UNEXPECTED
				li.setLineitemStatus(Transaction_Constants.LINE_ITEM_STATUS + "_UNEXPECTED");
			}*/
			
			li.setIsLineitemComplete(t.getComplete().equalsIgnoreCase(Transaction_Constants.Y));
			respLookupValue = hasher.getValue(
					Transaction_Constants.MATERIAL_STATUS, Transaction_Constants.SAP,
					t.getTitlestatus(), Transaction_Constants.ENTERPRISE);
			li.setTitleStatus((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.MATERIAL_STATUS_UNEXPECTED : respLookupValue);
			respLookupValue = hasher.getValue(
					Transaction_Constants.DELIVERY_BLOCK, Transaction_Constants.SAP, t.getDblock(),
					Transaction_Constants.ENTERPRISE);
			li.setDeliveryBlock((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.DELIVERY_BLOCK_UNEXPECTED : respLookupValue);

			// GregorianCalendar c = new GregorianCalendar();
			// Date d = t.getCrdate();
			// c.setTime(d);
			// li.setRequestDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(c));
			li.setRequestDate(toXMLGregorianCalendar(t.getCrdate()));

			// c.setTime(t.getAvailabledt());
			// li.setAvailableDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(c));
			li.setAvailableDate(toXMLGregorianCalendar(t.getAvailabledt()));

			respLookupValue = hasher.getValue(Transaction_Constants.ITEM_TYPE,
					Transaction_Constants.SAP, t.getItem_Type(), Transaction_Constants.ENTERPRISE);
			li.setItemType((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.ITEM_TYPE_UNEXPECTED : respLookupValue);

			li.setIsKitComponent(t.getIskitcomp().equalsIgnoreCase(
					Transaction_Constants.Y));

			List<ZvsrType> srepList = srepMap.get(new Pair<String, String>(t
					.getTransactionid(), t.getLinenum()));
			List<com.hmco.eai.ots.transactionnew.SalesRep> list = li.getSalesRep();
			makeSalesRepEx(srepList, list);

			liList.add(li);
		}
	}

	private ProductInfo makeProductInfo(Zvso_LineitemType i,
			ZvsubscriptionType sub) throws Exception {
		ProductInfo pi = new ProductInfo();
		pi.setLineNo(makeInteger(i.getLinenum()).intValue());
		// pi.setSalesOffice();
		pi.setMaterialID(i.getMatid());
		pi.setIsbn(i.getIsbn());
		pi.setDescription(i.getDescp());
		pi.setCouponCode(i.getCouponcode());
		pi.setPromotionType(i.getPromotiontype());
		pi.setQuantity(i.getQty().intValue());
		pi.setListPrice(i.getListprice().doubleValue());
		pi.setNetPrice(i.getNetprice().doubleValue());
		String respLookupValue = hasher.getValue(Transaction_Constants.DIVISION,
				Transaction_Constants.SAP, i.getPdiv(), Transaction_Constants.ENTERPRISE);
		pi.setProductDivision((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.DIVISION_CODE_UNEXPECTED : respLookupValue);
		pi.setListDiscount(i.getListdiscount().doubleValue());
		pi.setIsEGood(i.getIsegood().equalsIgnoreCase(Transaction_Constants.X));
		pi.setIsSubscription(i.getIsesub().equalsIgnoreCase(
				Transaction_Constants.X));
		if (pi.isIsSubscription() && sub != null) {
			SubscriptionTerm t = new SubscriptionTerm();
			t.setDuration(makeInteger(sub.getDuration()));
			respLookupValue = hasher.getValue(Transaction_Constants.SUBSCRIPTION_TERM,
					Transaction_Constants.SAP, sub.getUnit(), Transaction_Constants.ENTERPRISE); 
			t.setUnit((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.SUBSCRIPTION_TERM_UNIT_UNEXPECTED : respLookupValue);
			t.setRate(sub.getRate().doubleValue());

			// GregorianCalendar c = new GregorianCalendar();
			// Date d = sub.getStartdt();
			// c.setTime(d);
			// t.setStartDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(c));
			t.setStartDate(toXMLGregorianCalendar(sub.getStartdt()));

			// d = sub.getEnddt();
			// c.setTime(d);
			// t.setEndDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(c));
			t.setEndDate(toXMLGregorianCalendar(sub.getEnddt()));

			pi.setSubscriptionTerm(t);
		}

		return pi;
	}

	private ProductInfo2 makeProductInfo2(Zvso_LineitemType i,
			ZvsubscriptionType sub) throws Exception {
		ProductInfo2 pi = new ProductInfo2();
		pi.setLineNo(makeInteger(i.getLinenum()).intValue());
		// pi.setSalesOffice();
		pi.setMaterialID(i.getMatid());
		pi.setIsbn(i.getIsbn());
		pi.setDescription(i.getDescp());
		pi.setCouponCode(i.getCouponcode());
		pi.setPromotionType(i.getPromotiontype());
		pi.setQuantity(i.getQty().intValue());
		pi.setListPrice(i.getListprice().doubleValue());
		pi.setNetPrice(i.getNetprice().doubleValue());
		String respLookupValue = hasher.getValue(Transaction_Constants.DIVISION,
				Transaction_Constants.SAP, i.getPdiv(), Transaction_Constants.ENTERPRISE); 
		pi.setProductDivision((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.DIVISION_CODE_UNEXPECTED : respLookupValue);
		pi.setListDiscount(i.getListdiscount().doubleValue());
		pi.setIsEGood(i.getIsegood().equalsIgnoreCase(Transaction_Constants.X));
		pi.setIsSubscription(i.getIsesub().equalsIgnoreCase(
				Transaction_Constants.X));
		if (pi.isIsSubscription() && sub != null) {
			SubscriptionTerm t = new SubscriptionTerm();
			t.setDuration(makeInteger(sub.getDuration()));
			respLookupValue = hasher.getValue(Transaction_Constants.SUBSCRIPTION_TERM,
					Transaction_Constants.SAP, sub.getUnit(), Transaction_Constants.ENTERPRISE); 
			t.setUnit((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.SUBSCRIPTION_TERM_UNIT_UNEXPECTED : respLookupValue);
			t.setRate(sub.getRate().doubleValue());

			// GregorianCalendar c = new GregorianCalendar();
			// Date d = sub.getStartdt();
			// c.setTime(d);
			// t.setStartDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(c));
			t.setStartDate(toXMLGregorianCalendar(sub.getStartdt()));

			// d = sub.getEnddt();
			// c.setTime(d);
			// t.setEndDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(c));
			t.setEndDate(toXMLGregorianCalendar(sub.getEnddt()));

			pi.setSubscriptionTerm(t);
		}
		//
		// additional fields for ProductInfo2
		pi.setCancelledQuantity(i.getRejected_Qty().toString());
		pi.setPromoAmount(i.getPromo_Amt().toString());

		return pi;
	}

	private void makeSalesRep(List<ZvsrType> srepList, List<SalesRep> list) {
		for (ZvsrType t : srepList) {
			SalesRep i = new SalesRep();
			i.setRepID(t.getSp_Id());
			i.setRepName(t.getSp_Name());
			i.setSfaRepID(t.getSfa_Repid());
			list.add(i);
		}
	}

	private void makeSalesRepEx(List<ZvsrType> srepList, List<com.hmco.eai.ots.transactionnew.SalesRep> list) {
		for (ZvsrType t : srepList) {
			com.hmco.eai.ots.transactionnew.SalesRep i = new com.hmco.eai.ots.transactionnew.SalesRep();
			i.setRepID(t.getSp_Id());
			i.setRepName(t.getSp_Name());
			i.setSfaRepID(t.getSfa_Repid());
			list.add(i);
		}
	}

	private Integer makeInteger(short n) {
		try {
			return new Integer(n);
		} catch (NumberFormatException ex) {
		}
		return null;
	}

	private Integer makeInteger(String n) {
		try {
			return new Integer(n);
		} catch (NumberFormatException ex) {
		}
		return null;
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

	private java.sql.Date toSqlDate(XMLGregorianCalendar xgc) {
		if (xgc != null) {
			Date javaDate = xgc.toGregorianCalendar().getTime();
			java.sql.Date sqlDate = new java.sql.Date(javaDate.getTime());
			return sqlDate;
		} else
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

		HashMap<Pair<String, String>, ZvsubscriptionType> subMap = new HashMap<Pair<String, String>, ZvsubscriptionType>();
		for (int i = 0; i < subTypeArray.length; ++i) {
			subMap.put(new Pair<String, String>(subTypeArray[i].getInv_No(),
					subTypeArray[i].getLinenum()), subTypeArray[i]);
		}

		/*
		 * ArrayListMultimap<String, ZvsubscriptionType> tTypeMap =
		 * ArrayListMultimap .<String, ZvsubscriptionType> create(); for (int i
		 * = 0; i < subTypeArray.length; ++i)
		 * tTypeMap.put(subTypeArray[i].getInv_No(), subTypeArray[i]);
		 */

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
				makeInvoiceTxnItem(invoiceTxnItemList, hType, dTypeMap, subMap);
			}
			invoiceDetailsList.add(details);
		}

		return returnList;
	}

	private void makeInvoiceTxnItem(
			List<InvoiceTransactionItem> invoiceTxnItemList,
			Zvgetinvoice_HType hType,
			ArrayListMultimap<Pair<String, String>, Zvgetinvoice_LType> dTypeMap,
			HashMap<Pair<String, String>, ZvsubscriptionType> subMap)
			throws Exception {

		InvoiceTransactionItem txnItem = new InvoiceTransactionItem();
		txnItem.setInvoiceNo(hType.getInv_No());
		String respLookupValue = hasher.getValue(
				Transaction_Constants.INVOICE_TYPE, Transaction_Constants.SAP, hType.getInv_Typ(),
				Transaction_Constants.ENTERPRISE); 
		txnItem.setInvoiceType((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.INVOICE_TYPE_UNEXPECTED : respLookupValue);
		txnItem.setBillingDate(toXMLGregorianCalendar(hType.getBilldate()));
		txnItem.setSubTotal(hType.getStotal().doubleValue());
		txnItem.setSalesTax(hType.getSaletx().doubleValue());
		txnItem.setShippingCharge(hType.getShipcrg().doubleValue());
		txnItem.setTotal(hType.getTotal().doubleValue());

		List<com.hmco.eai.ots.transaction.InvoiceTransactionItem.LineItem> lineItemList = txnItem
				.getLineItem();
		makeInvoiceLineItemList(lineItemList,
				dTypeMap.get(new Pair<String, String>(hType.getSono(), hType
						.getInv_No())), subMap);

		invoiceTxnItemList.add(txnItem);

	}

	private void makeInvoiceLineItemList(
			List<com.hmco.eai.ots.transaction.InvoiceTransactionItem.LineItem> lineItemList,
			List<Zvgetinvoice_LType> list,
			HashMap<Pair<String, String>, ZvsubscriptionType> subMap) {
		for (Zvgetinvoice_LType dType : list) {
			com.hmco.eai.ots.transaction.InvoiceTransactionItem.LineItem li = new com.hmco.eai.ots.transaction.InvoiceTransactionItem.LineItem();
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
			String respLookupValue = hasher.getValue(
					Transaction_Constants.DIVISION, Transaction_Constants.SAP, dType.getPdiv(),
					Transaction_Constants.ENTERPRISE);
			pInfo.setProductDivision((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.DIVISION_CODE_UNEXPECTED : respLookupValue);
			pInfo.setListDiscount(dType.getListdis().doubleValue());
			pInfo.setIsEGood(dType.getIsegood().equalsIgnoreCase(
					Transaction_Constants.X));
			pInfo.setIsSubscription(dType.getIsesub().equalsIgnoreCase(
					Transaction_Constants.X));
			ZvsubscriptionType zvSubType = subMap.get(new Pair<String, String>(
					li.getTransactionNo(), dType.getLinenum()));
			if (zvSubType != null) {
				SubscriptionTerm term = new SubscriptionTerm();
				respLookupValue = hasher.getValue(
						Transaction_Constants.SUBSCRIPTION_TERM, Transaction_Constants.SAP,
						zvSubType.getUnit(), Transaction_Constants.ENTERPRISE); 
				term.setUnit((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.SUBSCRIPTION_TERM_UNIT_UNEXPECTED : respLookupValue);
				pInfo.setSubscriptionTerm(term);
			}

			li.setProductInfo(pInfo);
			li.setShipmentNo(dType.getShipno());
			String lineNo = dType.getShipln();
			li.setShipmentLineNo(lineNo != null && lineNo.trim().length() > 0 ? Integer
					.parseInt(lineNo) : 0);
			li.setShipmentLocation(dType.getShiploc());
			respLookupValue = hasher.getValue(Transaction_Constants.AR_TERMS,
					Transaction_Constants.SAP, dType.getPayterm(), Transaction_Constants.ENTERPRISE);
			li.setPaymentTerm((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.ARTERMS_UNEXPECTED : respLookupValue);
			li.setTransactionNo(dType.getOrd_No());
			lineNo = dType.getOrd_Ln();
			li.setTransactionLineNo(lineNo != null
					&& lineNo.trim().length() > 0 ? Integer.parseInt(lineNo)
					: 0);

			lineItemList.add(li);
		}
	}

	@Override
	public ShipmentDetailsList getShipments(TransactionIDList transactionIDList)
			throws TransactionException {

		logger.debug("getShipments begin");
		long enterTime = System.currentTimeMillis();

		List<String> transIdList = transactionIDList.getTransactionID();
		transIdList.removeAll(Arrays.asList(Transaction_Constants.EMPTY));

		String[] transIdArray = new String[transIdList.size()];
		transIdList.toArray(transIdArray);
		
		EAI_Log log = EAI_Log.enter(arrayToString(transIdArray, Transaction_Constants.COMMA_SEPERATOR), GET_SHIPMENTS, EAI_Log.SYS_WebService, EAI_Log.SYS_SAP);
		if (transIdList == null || (transIdList != null && transIdList.size() <= 0)) {
			EaiException exc = new EaiException();
			ErrorList errorList = new ErrorList();
			List<com.hmco.eai.Error> listError = errorList.getError();
			com.hmco.eai.Error e = new Error();
			e.setErrorCategory(ERROR_NO_TXN);
			e.setErrorCode(ERROR_NO_TXN);
			e.setErrorMessage(ERROR_NO_TXN);
			listError.add(e);
			exc.setErrorList(errorList);
			String errorBody = Converter.convertBodyToString(exc.getErrorList());
			log.toException(Converter.convertBodyToString(transactionIDList), ERROR_RQST,
					EAI_Log.EXEPTION_BUSINESS, errorBody);
			producer.sendBody(log.clone());
			throw new TransactionException(ERROR_RQST, exc);
		} else {
			boolean isError = false;
			EaiException exc = new EaiException();
			ErrorList errorList = new ErrorList();
			List<com.hmco.eai.Error> listError = errorList.getError();
			for(String id : transIdList) {
				if(id != null && id.length() > 10) {
					isError = true;
					com.hmco.eai.Error e = new Error();
					e.setErrorCategory(Transaction_Constants.ERROR_CATEGORY);
					e.setErrorCode(Transaction_Constants.ERROR_CODE);
					e.setErrorMessage(ERROR_INVLD_LEN);
					listError.add(e);
					exc.setErrorList(errorList);
				}
			}
			if(isError) {
				String errorBody = Converter.convertBodyToString(exc.getErrorList());
				log.toException(Converter.convertBodyToString(transactionIDList), ERROR_RQST,
						EAI_Log.EXEPTION_BUSINESS, errorBody);
				producer.sendBody(log.clone());
				throw new TransactionException(ERROR_RQST, exc);
			}
		}
		
		producer.sendBody(log.clone());
		
		Holder<Zvgetshipment_HType[]> T_Delivery_HHolder = new Holder<Zvgetshipment_HType[]>();
		Holder<Zvgetshipment_DType[]> T_Delivery_DHolder = new Holder<Zvgetshipment_DType[]>();
		Holder<ZvtrackingType[]> T_TrackingHolder = new Holder<ZvtrackingType[]>();

		long requestTime = 0;
		long responseTime = 0;
		ShipmentDetailsList shipmentList;
		try {
			requestTime = System.currentTimeMillis();

			log.toRequest();
			producer.sendBody(log.clone());
			
			bean.getShipment(transIdArray, T_Delivery_HHolder,
					T_Delivery_DHolder, T_TrackingHolder);
			responseTime = System.currentTimeMillis();
			
			log.toResponse();
			producer.sendBody(log.clone());
			
			logger.debug("SAP time was " + (responseTime - requestTime)
					+ " ms.");

			shipmentList = makeShipmentDetailsList(T_Delivery_HHolder.value,
					T_Delivery_DHolder.value, T_TrackingHolder.value);
			return shipmentList;
		} catch ( TransactionException ex ) {
			String errorBody = Converter.convertBodyToString(ex.getFaultInfo());
			log.toException(Converter.convertBodyToString(transactionIDList), ex.getMessage(),
					EAI_Log.EXEPTION_BUSINESS, errorBody);
			producer.sendBody(log.clone());
			throw ex;
		} catch (Exception ex) {
			ex.printStackTrace(System.err);
			logger.error("Exception calling getShipments", ex);
			requestTime = responseTime = 0;
			
			StringWriter stackTrace = new StringWriter();			
			ex.printStackTrace(new PrintWriter(stackTrace));
			stackTrace.flush();
			
			log.toException(Converter.convertBodyToString(transactionIDList), ex.getMessage(), EAI_Log.EXEPTION_SYSTEM, stackTrace.toString());
			producer.sendBody(log.clone());
			throw new TransactionException(ex.getMessage());
		} finally {
			long exitTime = System.currentTimeMillis();
			logger.debug("servicemix time was "
					+ ((exitTime - enterTime) - (responseTime - requestTime))
					+ " ms.");
			logger.debug("execution time was " + (exitTime - enterTime)
					+ " ms.");
			logger.debug("getShipments ends");
			log.toExit();
			producer.sendBody(log.clone());
		}

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
			dTypeMap.put(new Pair<String, String>(dTypeArray[i].getTransid(),
					dTypeArray[i].getShipmentno()), dTypeArray[i]);

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
		makeShipmentLineItemList(lineItemList,
				dTypeMap.get(new Pair<String, String>(hType.getSono(), hType
						.getShipmentno())));

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

	private void makeShipmentLineItemList(List<LineItem> lineItemList,
			List<Zvgetshipment_DType> list) {
		String respLookupValue = null;
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
			respLookupValue = hasher.getValue(
					Transaction_Constants.DIVISION, Transaction_Constants.SAP, dType.getPdiv(),
					Transaction_Constants.ENTERPRISE);
			li.setProductDivision((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.DIVISION_CODE_UNEXPECTED : respLookupValue);
			lineItemList.add(li);
		}
	}

	public void destroy() throws Exception {
		logger.debug("destroy " + this.getClass().getName());
	}

	public void afterPropertiesSet() throws Exception {
		logger.debug("initialize " + this.getClass().getName());
	}

	public void setAudit(AuditService audit) {
		logger.debug("instantiate AuditService");
		this.audit = audit;
	}

	public static String arrayToString(String[] a, String separator) {
		String result = Transaction_Constants.EMPTY;
		if (a != null && a.length > 0) {
			result = a[0]; // start with the first element
			for (int i = 1; i < a.length; i++) {
				result = result + separator + a[i];
				if (result.length() >= 50) {
					return result.substring(0, 50);
					//break;
				}
			}
		}
		return result;
	}

}