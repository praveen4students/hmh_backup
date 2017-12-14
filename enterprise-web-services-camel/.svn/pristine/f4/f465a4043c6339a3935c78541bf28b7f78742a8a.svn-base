package hmh.ws.services;

import hmh.rs.pojo.ErrorException;
import hmh.rs.pojo.OrderSimulateRequest;
import hmh.rs.pojo.OrderSimulateResponse;
import hmh.rs.pojo.OrderSubmitRequest;
import hmh.rs.pojo.OrderSubmitResponse;
import hmh.sap.rfc.Bapiaddr1Type;
import hmh.sap.rfc.BapiccardType;
import hmh.sap.rfc.BapicondType;
import hmh.sap.rfc.BapicondxType;
import hmh.sap.rfc.BapictrType;
import hmh.sap.rfc.BapicucfgType;
import hmh.sap.rfc.BapicuvalType;
import hmh.sap.rfc.BapiparexType;
import hmh.sap.rfc.BapiparnrType;
import hmh.sap.rfc.Bapiret2Type;
import hmh.sap.rfc.BapischdlType;
import hmh.sap.rfc.Bapisdhd1Type;
import hmh.sap.rfc.Bapisdhd1XType;
import hmh.sap.rfc.BapisditType;
import hmh.sap.rfc.BapisditmType;
import hmh.sap.rfc.BapisdkeyType;
import hmh.sap.rfc.Zbdcmsgcoll_RfcType;
import hmh.sap.rfc.ZccardType;
import hmh.sap.rfc.Zvgetsales_HType;
import hmh.sap.rfc.Zvgetsales_HeType;
import hmh.sap.rfc.Zvgetsales_LType;
import hmh.sap.rfc.Zvgetsales_LeType;
import hmh.sap.rfc.util.Bapiaddr1Type_List;
import hmh.sap.rfc.util.BapiccardType_List;
import hmh.sap.rfc.util.BapicondType_List;
import hmh.sap.rfc.util.BapicondxType_List;
import hmh.sap.rfc.util.BapictrType_List;
import hmh.sap.rfc.util.BapicucfgType_List;
import hmh.sap.rfc.util.BapicuvalType_List;
import hmh.sap.rfc.util.BapiparexType_List;
import hmh.sap.rfc.util.BapiparnrType_List;
import hmh.sap.rfc.util.BapischdlType_List;
import hmh.sap.rfc.util.BapisditmType_List;
import hmh.util.Converter;
import hmh.util.EnterpriseConstants;
import hmh.util.Transaction_Constants;
import hmh.ws.controller.OrderBean;
import hmh.ws.controller.SfdcBean;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

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

import com.hmco.eai.AsyncRequestId;
import com.hmco.eai.AsyncRequestStatus;
import com.hmco.eai.Error;
import com.hmco.eai.ErrorList;
import com.hmco.eai.ots.customer.Address;
import com.hmco.eai.ots.eskertransaction.EskerTransactionRequest;
import com.hmco.eai.ots.eskertransaction.EskerTransactionResult;
import com.hmco.eai.ots.material.SubscriptionTerm;
import com.hmco.eai.ots.order.BasisOrderList;
import com.hmco.eai.ots.order.CreditCard;
import com.hmco.eai.ots.order.DeliveryInfo;
import com.hmco.eai.ots.order.FindBasisOrderRequest;
import com.hmco.eai.ots.order.FindBasisOrderResponse;
import com.hmco.eai.ots.order.FindUnsubmittedOrdersRequest;
import com.hmco.eai.ots.order.FindUnsubmittedOrdersResponse;
import com.hmco.eai.ots.order.LineItemError;
import com.hmco.eai.ots.order.LineList;
import com.hmco.eai.ots.order.OrderLineList;
import com.hmco.eai.ots.order.OrderNoteList;
import com.hmco.eai.ots.order.SaleHeader;
import com.hmco.eai.ots.order.SaleHeader2;
import com.hmco.eai.ots.order.SaleLineItem;
import com.hmco.eai.ots.order.SaleLineItemList;
import com.hmco.eai.ots.order.SampleHeader;
import com.hmco.eai.ots.order.SampleLineItem;
import com.hmco.eai.ots.order.SampleLineItemList;
import com.hmco.eai.ots.order.SubmitOrderLIneList;
import com.hmco.eai.ots.order.SubmitOrderRequest;
import com.hmco.eai.ots.order.SubmitOrderResponse;
import com.hmco.eai.ots.order.SubmitSaleRequest;
import com.hmco.eai.ots.order.SubmitSaleRequest2;
import com.hmco.eai.ots.order.SubmitSaleResponse;
import com.hmco.eai.ots.order.SubmitSaleResponse2;
import com.hmco.eai.ots.order.SubmitSampleRequest;
import com.hmco.eai.ots.order.SubmitSampleResponse;
import com.hmco.eai.ots.order.UnsubmittedOrders;
import com.hmco.eai.tibco.enterprisewebservices.EaiException;
import com.hmco.eai.tibco.enterprisewebservices.EskerServices;
import com.hmco.eai.tibco.enterprisewebservices.Order;
import com.hmco.eai.tibco.enterprisewebservices.OrderEx;
import com.hmco.eai.tibco.enterprisewebservices.OrderException;
import com.hmh.util.async.AsyncService;
import com.hmh.util.audit.AuditService;
import com.hmh.util.dao.EAI_Log;
import com.hmh.util.hasher.Hasher;
import com.sforce.soap.schemas._class.orderentryservice.BasisOrder;
import com.sforce.soap.schemas._class.orderentryservice.BasisOrderLine;
import com.sforce.soap.schemas._class.orderentryservice.BasisOrderSearchCriteria;
import com.sforce.soap.schemas._class.orderentryservice.BasisOrderSearchResult;
import com.sforce.soap.schemas._class.orderentryservice.OrderNote;
import com.sforce.soap.schemas._class.orderentryservice.SubmitOrder;
import com.sforce.soap.schemas._class.orderentryservice.SubmitOrderLine;
import com.sforce.soap.schemas._class.orderentryservice.SubmitOrderResult;
import com.sforce.soap.schemas._class.orderinquiryservice.FindOrderCriteria;
import com.sforce.soap.schemas._class.orderinquiryservice.OrderInfo;
import com.sforce.soap.schemas._class.orderinquiryservice.OrderLine;

public class OrderImpl implements OrderEx, Order, EskerServices,
		InitializingBean, DisposableBean {

	public final static String ERROR_RQST = "An error occurred while processing SOAP request.";
	public final static String SUBMIT_SALE = "submitSaleOrder";
	public final static String SUBMIT_SALE_EX = "submitSaleOrderEx";
	public final static String SUBMIT_SAMPLE = "submitSampleOrder";
	public final static String FIND_UNSUBMITTED_ORDER = "findUnsubmittedOrders";
	public final static String FIND_SFDC_BASIS_ORDER = "findBasisOrder";
	public final static String SUBMIT_ORDER = "SUBMIT_ORDER";
	public final static String SUBMIT_SFDC_ORDER = "SUBMIT_SFDC_ORDER";
	public final static String ESKER_TRANSACTION = "EskerTransaction";
	public final static DateFormat yyyymmddhhMMss = new SimpleDateFormat("yyyyMMddHHmmss");
	private static final Logger logger = Logger.getLogger(OrderImpl.class);
	private static final String ORDER_SIMULATE = "OrderSimulate";
	private static final String ORDER_SUBMIT = "OrderSubmit";

	private SfdcBean sfdcBean;

	private OrderBean bean;

	private AsyncService asyncService;

	private Hasher hasher;

	private AuditService audit;

	private CamelContext camelContext;

	@Produce(ref = "sedaOrderAudit")
	ProducerTemplate producer;

	public void setSfdcBean(SfdcBean sfdcBean) {
		logger.debug("instantiate " + sfdcBean.getClass().getName());
		this.sfdcBean = sfdcBean;
	}

	public void setBean(OrderBean bean) {
		logger.debug("instantiate orderBean");
		this.bean = bean;
	}

	public AsyncService getAsyncService() {
		return asyncService;
	}

	public void setAsyncService(AsyncService asyncService) {
		this.asyncService = asyncService;
	}

	public ProducerTemplate getProducer() {
		return producer;
	}

	public void setProducer(ProducerTemplate producer) {
		this.producer = producer;
	}

	public OrderBean getBean() {
		return bean;
	}

	public Hasher getHasher() {
		return hasher;
	}

	public AuditService getAudit() {
		return audit;
	}

	public CamelContext getCamelContext() {
		return camelContext;
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

	public void setAudit(AuditService audit) {
		logger.debug("instantiate AuditService");
		this.audit = audit;
	}

	//
	// InitializingBean interface
	//
	@Override
	public void afterPropertiesSet() throws Exception {
		logger.debug("initialize " + this.getClass().getName());
	}

	//
	// DisposableBean interface
	//
	@Override
	public void destroy() throws Exception {
		logger.debug("destroy " + this.getClass().getName());
	}

	//
	// OrderEx methods
	//
	@Override
	public SubmitSaleResponse submitSale(SubmitSaleRequest submitSaleRequest)
			throws OrderException {

		logger.debug("submitSale begin");
		long enterTime = System.currentTimeMillis();

		String clientTransId = submitSaleRequest.getClientTransactionID();
		String orderType = null;
		if (submitSaleRequest.getTranType() != null
				&& submitSaleRequest.getTranType().length() > 0) {
			orderType = hasher.getValue(Transaction_Constants.TRANSACTION_TYPE,
					Transaction_Constants.ENTERPRISE,
					submitSaleRequest.getTranType(), Transaction_Constants.SAP);
		}
		if (orderType == null
				|| (orderType != null && orderType.trim().length() == 0)) {
			orderType = "ZOR";
		}

		String poNumber = submitSaleRequest.getPoNumber();
		String transactionAction = submitSaleRequest.getSubmitSaleTranAction() != null ? submitSaleRequest
				.getSubmitSaleTranAction() : Transaction_Constants.EMPTY;
		boolean invalidTransaction = true;
		if (transactionAction != null && transactionAction.trim().length() > 0) {

			for (Transaction_Constants.TRANSACTION trans : Transaction_Constants.TRANSACTION
					.values()) {
				// logger.info("Transaction Name :: " + trans.name());
				if (transactionAction.trim().equals(trans.name())) {
					invalidTransaction = false;
				}
			}
		}

		com.hmco.eai.ots.order.OrderException faultInfo = new com.hmco.eai.ots.order.OrderException();
		List<Error> headerErrorList = faultInfo.getHeaderError();
		List<LineItemError> lineItemErrorList = faultInfo.getLineItemError();

		// make headers
		String soldToCustomerId = null;
		Zvgetsales_HType salesdocheadIn = null;
		if (submitSaleRequest.getSaleHeader() != null) {
			SaleHeader hdr = submitSaleRequest.getSaleHeader();
			salesdocheadIn = makeSubmitSaleHeader(hdr, headerErrorList);
			soldToCustomerId = hdr.getSoldToCustomerID();
		}

		// make items
		SaleLineItemList inSaleLineItemType = submitSaleRequest
				.getSaleLineItemList();
		Zvgetsales_LType[] salesdocdetailIn = null;
		if (inSaleLineItemType != null) {
			salesdocdetailIn = makeSubmitSaleItems(inSaleLineItemType, lineItemErrorList);
		}

		boolean submitForManualCorrection = submitSaleRequest
				.isSubmitForManualCorrection();
		Holder<Zvgetsales_HeType> salesdocheadOut = new Holder<Zvgetsales_HeType>();
		Holder<Zvgetsales_LeType[]> salesdocdetailOut = new Holder<Zvgetsales_LeType[]>();
		Holder<Zbdcmsgcoll_RfcType[]> sapReturnList = new Holder<Zbdcmsgcoll_RfcType[]>();

		EAI_Log log = EAI_Log.enter(soldToCustomerId, SUBMIT_SALE,
				EAI_Log.SYS_WebService, EAI_Log.SYS_SAP);
		
		if (invalidTransaction) {
			Error e = new Error();
			e.setErrorCategory(Transaction_Constants.TWO);
			e.setErrorCode("400");
			e.setErrorMessage("submitSaleTranAction should only contain any one of the following : TRAN_ACTION_RELEASE or TRAN_ACTION_HOLD or TRAN_ACTION_PRICE");
			headerErrorList.add(e);
			OrderException oe = new OrderException(ERROR_RQST, faultInfo);
			String errorBody = Converter.convertBodyToString(oe.getFaultInfo());
			log.toException(Converter.convertBodyToString(submitSaleRequest),
					oe.getMessage(), EAI_Log.EXEPTION_BUSINESS, errorBody);
			producer.sendBody(log.clone());
			throw oe;
		}

		ZccardType creditCardInfo = null;
		if (submitSaleRequest.getCreditCard() != null) {
			CreditCard in = submitSaleRequest.getCreditCard();
			if (in != null) {
				creditCardInfo = new ZccardType();
				creditCardInfo.setCvval(in.getCVV());
				creditCardInfo.setExpdate(in.getExpDate());
				creditCardInfo.setNumber(in.getNumber());
				String rqstLookupValue = hasher.getValue(
						Transaction_Constants.CREDIT_CARD_TYPE,
						Transaction_Constants.ENTERPRISE, in.getCardType(),
						Transaction_Constants.SAP);
				if ((rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue
						.trim().length() == 0))
						&& (in.getCardType() != null && in.getCardType().trim()
								.length() > 0)) {
					Error e = new Error();
					e.setErrorCategory(Transaction_Constants.CREDIT_CARD_TYPE_UNEXPECTED);
					e.setErrorCode(Transaction_Constants.CREDIT_CARD_TYPE_UNEXPECTED);
					e.setErrorMessage(Transaction_Constants.CREDIT_CARD_TYPE_UNEXPECTED);
					headerErrorList.add(e);
				}
				creditCardInfo.setType(rqstLookupValue);
			}
		}

		if((headerErrorList != null && headerErrorList.size() > 0) || (lineItemErrorList != null && lineItemErrorList.size() > 0)) {
			OrderException oe = new OrderException(ERROR_RQST,
					faultInfo);
			String errorBody = Converter.convertBodyToString(oe.getFaultInfo());
			log.toException(Converter.convertBodyToString(submitSaleRequest),
					oe.getMessage(), EAI_Log.EXEPTION_BUSINESS, errorBody);
			producer.sendBody(log.clone());
			throw oe;
		}
		//log Enter
		producer.sendBody(log.clone());
		
		long requestTime = 0;
		long responseTime = 0;
		try {
			requestTime = System.currentTimeMillis();

			//
			// SAP Transaction Bean
			//
			log.toRequest();
			producer.sendBody(log.clone());

			String sapErrorStatus = bean.submitOrder(clientTransId, orderType,
					poNumber, transactionAction, creditCardInfo,
					salesdocheadIn, salesdocdetailIn,
					submitForManualCorrection, salesdocheadOut,
					salesdocdetailOut, sapReturnList);

			responseTime = System.currentTimeMillis();

			log.toResponse();
			producer.sendBody(log.clone());

			logger.debug("SAP time was " + (responseTime - requestTime)
					+ " ms.");

			if (sapErrorStatus != null && !sapErrorStatus.equals(Transaction_Constants.ZERO)) {

				Zbdcmsgcoll_RfcType[] sapErrorList = sapReturnList.value;
				for (Zbdcmsgcoll_RfcType sapError : sapErrorList) {
					if (sapError.getMsgtyp() != null) {
						if (sapError.getMsgtyp().equals("H")) {
							Error e = new Error();
							e.setErrorCategory(sapError.getTcode());
							e.setErrorCode(sapError.getMsgid());
							e.setErrorMessage(sapError.getMsgv1());
							headerErrorList.add(e);
						} else if (sapError.getMsgtyp().equals("L")) {
							LineItemError liError = new LineItemError();
							liError.setErrorCategory(sapError.getTcode());
							liError.setErrorCode(sapError.getMsgid());
							if (sapError.getMsgv1() != null) {
								if (sapError.getMsgv1().length() >= 6) {
									liError.setErrorMessage(sapError.getMsgv1()
											.substring(6));
									String lineno = sapError.getMsgv1()
											.substring(0, 6).trim();
									liError.setLineNo(Integer.parseInt(lineno));
								}
							}
							lineItemErrorList.add(liError);
						}
					}
				}
				OrderException oe = new OrderException(ERROR_RQST, faultInfo);
				throw oe;
			}

			SubmitSaleResponse ret = makeSubmitSaleResponse(
					salesdocheadOut.value, salesdocdetailOut.value);

			return ret;

		} catch (OrderException ex) {
			// StringWriter stackTrace = new StringWriter();
			// ex.printStackTrace(new PrintWriter(stackTrace));
			// stackTrace.flush();
			String errorBody = Converter.convertBodyToString(ex.getFaultInfo());
			log.toException(Converter.convertBodyToString(submitSaleRequest),
					ex.getMessage(), EAI_Log.EXEPTION_BUSINESS, errorBody);
			producer.sendBody(log.clone());
			throw ex;
		} catch (Exception ex) {
			ex.printStackTrace(System.err);
			logger.error("Exception calling submitSale", ex);
			requestTime = responseTime = 0;

			StringWriter stackTrace = new StringWriter();
			ex.printStackTrace(new PrintWriter(stackTrace));
			stackTrace.flush();

			log.toException(Converter.convertBodyToString(submitSaleRequest),
					ex.getMessage(), EAI_Log.EXEPTION_SYSTEM,
					stackTrace.toString());
			producer.sendBody(log.clone());

			throw new OrderException(ex.getMessage());

		} finally {
			long exitTime = System.currentTimeMillis();
			logger.debug("servicemix time was "
					+ ((exitTime - enterTime) - (responseTime - requestTime))
					+ " ms.");
			logger.debug("execution time was " + (exitTime - enterTime)
					+ " ms.");
			logger.debug("submitSale ends");

			log.toExit();
			producer.sendBody(log.clone());
		}

		// return null;
	}

	@Override
	public AsyncRequestId submitSaleAsync(SubmitSaleRequest2 submitSaleRequest)
			throws EaiException {
		//throws OrderException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SubmitSaleResponse2 submitSaleAsyncResult(
			AsyncRequestId asyncRequestId) throws OrderException {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public AsyncRequestStatus asyncPoll(AsyncRequestId asyncRequestId)
			throws EaiException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SubmitSaleResponse2 submitSaleEx(SubmitSaleRequest2 submitSaleRequest)
			throws OrderException {

		logger.debug("submitSaleEx begin");
		long enterTime = System.currentTimeMillis();

		String clientTransId = submitSaleRequest.getClientTransactionID();
		String orderType = null;
		if (submitSaleRequest.getTranType() != null
				&& submitSaleRequest.getTranType().length() > 0) {
			orderType = hasher.getValue(Transaction_Constants.TRANSACTION_TYPE,
					Transaction_Constants.ENTERPRISE,
					submitSaleRequest.getTranType(), Transaction_Constants.SAP);
		}
		if (orderType == null
				|| (orderType != null && orderType.trim().length() == 0)) {
			orderType = "ZOR";
		}

		String poNumber = submitSaleRequest.getPoNumber();
		String transactionAction = submitSaleRequest.getSubmitSaleTranAction();
		ZccardType creditCardInfo = null;
		com.hmco.eai.ots.order.OrderException faultInfo = new com.hmco.eai.ots.order.OrderException();
		List<Error> headerErrorList = faultInfo.getHeaderError();
		List<LineItemError> lineItemErrorList = faultInfo.getLineItemError();
		
		// make headers
		String soldToCustomerId = null;
		Zvgetsales_HType salesdocheadIn = null;
		if (submitSaleRequest.getSaleHeader2() != null) {
			SaleHeader2 hdr = submitSaleRequest.getSaleHeader2();
			salesdocheadIn = makeSubmitSaleHeader2(hdr, headerErrorList);
			soldToCustomerId = hdr.getSoldToCustomerID();
		}

		// make items
		SaleLineItemList inSaleLineItemType = submitSaleRequest
				.getSaleLineItemList();
		Zvgetsales_LType[] salesdocdetailIn = null;
		if (inSaleLineItemType != null) {
			salesdocdetailIn = makeSubmitSaleItems(inSaleLineItemType, lineItemErrorList);
		}

		boolean submitForManualCorrection = submitSaleRequest
				.isSubmitForManualCorrection();
		Holder<Zvgetsales_HeType> salesdocheadOut = new Holder<Zvgetsales_HeType>();
		Holder<Zvgetsales_LeType[]> salesdocdetailOut = new Holder<Zvgetsales_LeType[]>();
		Holder<Zbdcmsgcoll_RfcType[]> sapReturnList = new Holder<Zbdcmsgcoll_RfcType[]>();

		EAI_Log log = EAI_Log.enter(soldToCustomerId, SUBMIT_SALE_EX,
				EAI_Log.SYS_WebService, EAI_Log.SYS_SAP);
		
		if (submitSaleRequest.getCreditCard() != null) {
			CreditCard in = submitSaleRequest.getCreditCard();
			if (in != null) {
				creditCardInfo = new ZccardType();
				creditCardInfo.setCvval(in.getCVV());
				creditCardInfo.setExpdate(in.getExpDate());
				creditCardInfo.setNumber(in.getNumber());
				String rqstLookupValue = hasher.getValue(
						Transaction_Constants.CREDIT_CARD_TYPE,
						Transaction_Constants.ENTERPRISE, in.getCardType(),
						Transaction_Constants.SAP);
				if ((rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue
						.trim().length() == 0))
						&& (in.getCardType() != null && in.getCardType().trim()
								.length() > 0)) {
					Error e = new Error();
					e.setErrorCategory(Transaction_Constants.CREDIT_CARD_TYPE_UNEXPECTED);
					e.setErrorCode(Transaction_Constants.CREDIT_CARD_TYPE_UNEXPECTED);
					e.setErrorMessage(Transaction_Constants.CREDIT_CARD_TYPE_UNEXPECTED);
					headerErrorList.add(e);
				}
				creditCardInfo.setType(rqstLookupValue);
				//CrediCard Fraud Check Added as part of a CR on 13-SEP-2012
				creditCardInfo.setCcname(in.getCCName());
			}
		}
		
		if((headerErrorList != null && headerErrorList.size() > 0) || (lineItemErrorList != null && lineItemErrorList.size() > 0)) {
			OrderException oe = new OrderException(ERROR_RQST,
					faultInfo);
			String errorBody = Converter.convertBodyToString(oe.getFaultInfo());
			log.toException(Converter.convertBodyToString(submitSaleRequest),
					oe.getMessage(), EAI_Log.EXEPTION_BUSINESS, errorBody);
			producer.sendBody(log.clone());
			throw oe;
		}

		//log enter
		producer.sendBody(log.clone());

		long requestTime = 0;
		long responseTime = 0;
		try {
			requestTime = System.currentTimeMillis();

			//
			// SAP Transaction Bean
			//
			log.toRequest();
			producer.sendBody(log.clone());

			String sapErrorStatus = bean.submitOrder(clientTransId, orderType,
					poNumber, transactionAction, creditCardInfo,
					salesdocheadIn, salesdocdetailIn,
					submitForManualCorrection, salesdocheadOut,
					salesdocdetailOut, sapReturnList);

			responseTime = System.currentTimeMillis();

			log.toResponse();
			producer.sendBody(log.clone());

			logger.debug("SAP time was " + (responseTime - requestTime)
					+ " ms.");
			logger.debug("SAP ERROR STATUS " + sapErrorStatus);
			if (sapErrorStatus != null && !sapErrorStatus.equals(Transaction_Constants.ZERO)) {
				Zbdcmsgcoll_RfcType[] sapErrorList = sapReturnList.value;
				for (Zbdcmsgcoll_RfcType sapError : sapErrorList) {
					if (sapError.getMsgtyp() != null) {
						if (sapError.getMsgtyp().equals("H")) {
							Error e = new Error();
							e.setErrorCategory(sapError.getTcode());
							e.setErrorCode(sapError.getMsgid());
							e.setErrorMessage(sapError.getMsgv1());
							headerErrorList.add(e);
						} else if (sapError.getMsgtyp().equals("L")) {
							LineItemError liError = new LineItemError();
							liError.setErrorCategory(sapError.getTcode());
							liError.setErrorCode(sapError.getMsgid());
							if (sapError.getMsgv1() != null) {
								if (sapError.getMsgv1().length() >= 6) {
									liError.setErrorMessage(sapError.getMsgv1()
											.substring(6));
									String lineno = sapError.getMsgv1()
											.substring(0, 6).trim();
									liError.setLineNo(Integer.parseInt(lineno));
								}
							}
							lineItemErrorList.add(liError);
						}
					}
				}
				OrderException oe = new OrderException(ERROR_RQST, faultInfo);
				throw oe;
			}
			SubmitSaleResponse2 ret = makeSubmitSaleResponse2(
					salesdocheadOut.value, salesdocdetailOut.value);

			return ret;

		} catch (OrderException ex) {
			// StringWriter stackTrace = new StringWriter();
			// ex.printStackTrace(new PrintWriter(stackTrace));
			// stackTrace.flush();
			String errorBody = Converter.convertBodyToString(ex.getFaultInfo());
			log.toException(Converter.convertBodyToString(submitSaleRequest),
					ex.getMessage(), EAI_Log.EXEPTION_BUSINESS, errorBody);
			producer.sendBody(log.clone());
			throw ex;
		} catch (Exception ex) {
			ex.printStackTrace(System.err);
			logger.error("Exception calling submitSaleEx", ex);
			requestTime = responseTime = 0;

			StringWriter stackTrace = new StringWriter();
			ex.printStackTrace(new PrintWriter(stackTrace));
			stackTrace.flush();

			log.toException(Converter.convertBodyToString(submitSaleRequest),
					ex.getMessage(), EAI_Log.EXEPTION_SYSTEM,
					stackTrace.toString());
			producer.sendBody(log.clone());

			throw new OrderException(ex.getMessage());

		} finally {
			long exitTime = System.currentTimeMillis();
			logger.debug("servicemix time was "
					+ ((exitTime - enterTime) - (responseTime - requestTime))
					+ " ms.");
			logger.debug("execution time was " + (exitTime - enterTime)
					+ " ms.");
			logger.debug("submitSale ends");

			log.toExit();
			producer.sendBody(log.clone());
		}
		// return null;
	}

	//
	// Order interface
	//
	@Override
	public SubmitSampleResponse submitSample(
			SubmitSampleRequest submitSampleRequest) throws OrderException {

		logger.debug("submitSample begin");
		long enterTime = System.currentTimeMillis();
		String rqstLookupValue = null;
		boolean isError = false;
		String clientTransId = submitSampleRequest.getClientTransactionID();
		String orderType = null;
		if (submitSampleRequest.getTranType() != null
				&& submitSampleRequest.getTranType().length() > 0) {
			orderType = hasher.getValue(Transaction_Constants.TRANSACTION_TYPE,
					Transaction_Constants.ENTERPRISE,
					submitSampleRequest.getTranType(), 
					Transaction_Constants.SAP);
		}
		if(orderType == null || (orderType != null && orderType.trim().length()  == 0)) {
			orderType = "ZOS";
		}

		String poNumber = submitSampleRequest.getPoNumber();
		String transactionAction = submitSampleRequest.getSubmitSampleTranAction();
		ZccardType creditCardInfo = null;
		
		com.hmco.eai.ots.order.OrderException faultInfo = new com.hmco.eai.ots.order.OrderException();
		List<Error> headerErrorList = faultInfo.getHeaderError();
		List<LineItemError> lineItemErrorList  = faultInfo.getLineItemError();
		
		/**
		 * Add Header Details
		 */
		String soldToCustomerId = null;
		Zvgetsales_HType salesdocheadIn = null;
		if (submitSampleRequest.getSampleHeader() != null) {
			salesdocheadIn = new Zvgetsales_HType();
			SampleHeader in = submitSampleRequest.getSampleHeader();
			
			Address add = in.getOverrideAddress();
			if (add != null) {
				salesdocheadIn.setOverride_Add1(add.getAddressLine1());
				salesdocheadIn.setOverride_Add2(add.getAddressLine2());
				salesdocheadIn.setOverride_Add3(add.getAddressLine3());
				salesdocheadIn.setOverride_City(add.getCity());
				salesdocheadIn.setOverride_Countryname(add.getCountryCode());
				salesdocheadIn.setOverride_Name1(add.getCustomerName());
				salesdocheadIn.setOverride_Pobox(add.getPoBox());
				salesdocheadIn.setOverride_State(add.getState());
				salesdocheadIn.setOverride_Zipcode(add.getZipcode());
			}
			salesdocheadIn.setAllowcontractpricingflag(in
					.isAllowContractPricingFlag() != null || !in.isAllowSubstitutionsFlag() ? Transaction_Constants.N
					: Transaction_Constants.Y);
			salesdocheadIn.setAllowsubstitutionsflag(in
					.isAllowSubstitutionsFlag() ? Transaction_Constants.Y
					: Transaction_Constants.N);
			
			rqstLookupValue = hasher.getValue(Transaction_Constants.AR_TERMS,
					Transaction_Constants.ENTERPRISE, in.getArTerms(),
					Transaction_Constants.SAP);
			if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (in.getArTerms() != null && in.getArTerms().trim().length() > 0)) {
				isError = true;
				Error e = new Error();
				e.setErrorCategory(Transaction_Constants.ARTERMS_UNEXPECTED);
				e.setErrorCode(Transaction_Constants.ARTERMS_UNEXPECTED);
				e.setErrorMessage(Transaction_Constants.ARTERMS_UNEXPECTED);
				headerErrorList.add(e);
			}
			salesdocheadIn.setArterms(rqstLookupValue);
			
			salesdocheadIn.setBackordercanceldate(toSqlDate(in
					.getBackorderCancelDate()));
			rqstLookupValue = hasher.getValue(Transaction_Constants.BACK_ORDER_OPTION,
					Transaction_Constants.ENTERPRISE, in.getBackorderOption(),
					Transaction_Constants.SAP);
			if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (in.getBackorderOption() != null && in.getBackorderOption().trim().length() > 0)) {
				isError = true;
				Error e = new Error();
				e.setErrorCategory(Transaction_Constants.BACK_ORDER_OPTION_UNEXPECTED);
				e.setErrorCode(Transaction_Constants.BACK_ORDER_OPTION_UNEXPECTED);
				e.setErrorMessage(Transaction_Constants.BACK_ORDER_OPTION_UNEXPECTED);
				headerErrorList.add(e);
			}
			salesdocheadIn.setBackorderoption(rqstLookupValue);
			salesdocheadIn.setBill_Of_Lading_Text(in.getBillOfLading());
			salesdocheadIn.setBilltoattentionline(in.getBillToAttentionLine());
			salesdocheadIn.setBilltocustomerid(in.getBillToCustomerID());
			salesdocheadIn.setContactname(in.getContactName());
			salesdocheadIn.setContactphone(in.getContactPhone());
			salesdocheadIn.setCshold(in.getCsHold());
			salesdocheadIn.setCustomeremail(in.getCustomerEmail());
			salesdocheadIn.setDeferedpaymentdate(toSqlDate(in
					.getDeferedPaymentDate()));
			rqstLookupValue = hasher.getValue(Transaction_Constants.DELIVERY_BLOCK,
					Transaction_Constants.ENTERPRISE, in.getDeliveryBlock(),
					Transaction_Constants.SAP);
			if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (in.getDeliveryBlock() != null && in.getDeliveryBlock().trim().length() > 0)) {
				isError = true;
				Error e = new Error();
				e.setErrorCategory(Transaction_Constants.DELIVERY_BLOCK_UNEXPECTED);
				e.setErrorCode(Transaction_Constants.DELIVERY_BLOCK_UNEXPECTED);
				e.setErrorMessage(Transaction_Constants.DELIVERY_BLOCK_UNEXPECTED);
				headerErrorList.add(e);
			}
			salesdocheadIn.setDeliveryblock(rqstLookupValue);
			salesdocheadIn.setDock_Instruct_Text(in.getDockInstructions());
			rqstLookupValue = hasher.getValue(
					Transaction_Constants.DIVISION,
					Transaction_Constants.ENTERPRISE,
					in.getEntryDivision(),
					Transaction_Constants.SAP);
			if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (in.getEntryDivision() != null && in.getEntryDivision().trim().length() > 0)) {
				isError = true;
				Error e = new Error();
				e.setErrorCategory(Transaction_Constants.DIVISION_CODE_UNEXPECTED);
				e.setErrorCode(Transaction_Constants.DIVISION_CODE_UNEXPECTED);
				e.setErrorMessage(Transaction_Constants.DIVISION_CODE_UNEXPECTED);
				headerErrorList.add(e);
			}
			salesdocheadIn.setEntrydivision(rqstLookupValue);
//			salesdocheadIn.setFaxurl(in.get);
//			salesdocheadIn.setForce_Delv_Price(in.getForce);
			rqstLookupValue = hasher.getValue(
					Transaction_Constants.HANDLING_TERMS,
					Transaction_Constants.ENTERPRISE,
					in.getHandlingTerms(),
					Transaction_Constants.SAP);
			if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (in.getHandlingTerms() != null && in.getHandlingTerms().trim().length() > 0)) {
				isError = true;
				Error e = new Error();
				e.setErrorCategory(Transaction_Constants.HANDLING_TERMS_UNEXPECTED);
				e.setErrorCode(Transaction_Constants.HANDLING_TERMS_UNEXPECTED);
				e.setErrorMessage(Transaction_Constants.HANDLING_TERMS_UNEXPECTED);
				headerErrorList.add(e);
			}
			salesdocheadIn.setHandlingterms(rqstLookupValue);
			salesdocheadIn.setMessage(in.getFreeformMessage());
			salesdocheadIn.setMust_Arrive_By_Date(toSqlDate(in
					.getMustArriveByDate()));
			rqstLookupValue = hasher.getValue(
					Transaction_Constants.ARRIVE_BY_REASON,
					Transaction_Constants.ENTERPRISE,
					in.getMustArriveByReason(), Transaction_Constants.SAP);
			if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (in.getMustArriveByReason() != null && in.getMustArriveByReason().trim().length() > 0)) {
				isError = true;
				Error e = new Error();
				e.setErrorCategory(Transaction_Constants.ARRIVE_BY_REASON_UNEXPECTED);
				e.setErrorCode(Transaction_Constants.ARRIVE_BY_REASON_UNEXPECTED);
				e.setErrorMessage(Transaction_Constants.ARRIVE_BY_REASON_UNEXPECTED);
				headerErrorList.add(e);
			}
			salesdocheadIn.setMust_Arrive_By_Reason(rqstLookupValue);
			rqstLookupValue = hasher.getValue(
					Transaction_Constants.ORDER_REASON,
					Transaction_Constants.ENTERPRISE,
					in.getOrderReason(),
					Transaction_Constants.SAP);
			if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (in.getOrderReason() != null && in.getOrderReason().trim().length() > 0)) {
				isError = true;
				Error e = new Error();
				e.setErrorCategory(Transaction_Constants.ORDER_REASON_UNEXPECTED);
				e.setErrorCode(Transaction_Constants.ORDER_REASON_UNEXPECTED);
				e.setErrorMessage(Transaction_Constants.ORDER_REASON_UNEXPECTED);
				headerErrorList.add(e);
			}
			salesdocheadIn.setOrderreason(rqstLookupValue);
			rqstLookupValue = hasher.getValue(
					Transaction_Constants.ORDER_SOURCE,
					Transaction_Constants.ENTERPRISE,
					in.getOrderSource(),
					Transaction_Constants.SAP);
			if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (in.getOrderSource() != null && in.getOrderSource().trim().length() > 0)) {
				isError = true;
				Error e = new Error();
				e.setErrorCategory(Transaction_Constants.ORDER_SOURCE_UNEXPECTED);
				e.setErrorCode(Transaction_Constants.ORDER_SOURCE_UNEXPECTED);
				e.setErrorMessage(Transaction_Constants.ORDER_SOURCE_UNEXPECTED);
				headerErrorList.add(e);
			}
			salesdocheadIn.setOrdersource(rqstLookupValue);
			salesdocheadIn.setPricedate(toSqlDate(in.getPriceDate()));
			salesdocheadIn.setPromotioncode(in.getPromotionCode());
			salesdocheadIn
					.setRemove_Frgt_Forw(in.isRemoveFreightForwarder()!=null &&  in.isRemoveFreightForwarder()!=null ? Transaction_Constants.Y
							: Transaction_Constants.N);
			salesdocheadIn.setRequesteddate(toSqlDate(in.getRequestedDate()));
			salesdocheadIn.setSalesrepid(in.getSalesRepID());
			rqstLookupValue = hasher.getValue(
					Transaction_Constants.SHIP_DATE_OPTION,
					Transaction_Constants.ENTERPRISE, in.getShipDateOption(),
					Transaction_Constants.SAP);
			if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (in.getShipDateOption() != null && in.getShipDateOption().trim().length() > 0)) {
				isError = true;
				Error e = new Error();
				e.setErrorCategory(Transaction_Constants.SHIP_DATE_OPTION_UNEXPECTED);
				e.setErrorCode(Transaction_Constants.SHIP_DATE_OPTION_UNEXPECTED);
				e.setErrorMessage(Transaction_Constants.SHIP_DATE_OPTION_UNEXPECTED);
				headerErrorList.add(e);
			}
			salesdocheadIn.setShipdateoption(rqstLookupValue);
			rqstLookupValue = hasher.getValue(
					Transaction_Constants.SHIPMENT_METHOD,
					Transaction_Constants.ENTERPRISE, in.getShipmentMethod(),
					Transaction_Constants.SAP);
			if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (in.getShipmentMethod() != null && in.getShipmentMethod().trim().length() > 0)) {
				isError = true;
				Error e = new Error();
				e.setErrorCategory(Transaction_Constants.SHIPMENT_METHOD_UNEXPECTED);
				e.setErrorCode(Transaction_Constants.SHIPMENT_METHOD_UNEXPECTED);
				e.setErrorMessage(Transaction_Constants.SHIPMENT_METHOD_UNEXPECTED);
				headerErrorList.add(e);
			}
			salesdocheadIn.setShipmentmethod(rqstLookupValue);
			rqstLookupValue = hasher.getValue(
					Transaction_Constants.SHIPPING_TERMS,
					Transaction_Constants.ENTERPRISE, in.getShippingTerms(),
					Transaction_Constants.SAP);
			if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (in.getShippingTerms() != null && in.getShippingTerms().trim().length() > 0)) {
				isError = true;
				Error e = new Error();
				e.setErrorCategory(Transaction_Constants.SHIPPING_TERMS_UNEXPECTED);
				e.setErrorCode(Transaction_Constants.SHIPPING_TERMS_UNEXPECTED);
				e.setErrorMessage(Transaction_Constants.SHIPPING_TERMS_UNEXPECTED);
				headerErrorList.add(e);
			}
			salesdocheadIn.setShippingterms(rqstLookupValue);
			salesdocheadIn.setShiptodepartment(in.getToDepartment());
			salesdocheadIn.setShiptolocation(in.getShipToLocation());
			salesdocheadIn.setShiptoattentionline(in.getShipToAttentionLine());
			salesdocheadIn.setShiptocustomerid(in.getShipToCustomerID());
			soldToCustomerId = in.getSoldToCustomerID();
			salesdocheadIn.setSoldtocustomerid(soldToCustomerId);
			salesdocheadIn.setUserid(in.getUserId());
			salesdocheadIn.setZcoupon_Code(in.getHeaderCouponCode());
		}
		SampleLineItemList inSampleLineItemType = submitSampleRequest
				.getSampleLineItemList();
		List<SampleLineItem> inSampleLineItemList = null;
		Zvgetsales_LType[] salesdocdetailIn = null;
		if (inSampleLineItemType != null) {
			inSampleLineItemList = inSampleLineItemType.getSampleLineItem();
			if (inSampleLineItemList != null && inSampleLineItemList.size() > 0) {
				int count = 0;
				salesdocdetailIn = new Zvgetsales_LType[inSampleLineItemList
						.size()];
				for (SampleLineItem in : inSampleLineItemList) {
					salesdocdetailIn[count] = new Zvgetsales_LType();
					salesdocdetailIn[count].setGrade_Level(in.getGrade());
					rqstLookupValue = hasher.getValue(
							Transaction_Constants.ITEM_TYPE,
							Transaction_Constants.ENTERPRISE,
							in.getItemType(),
							Transaction_Constants.SAP);
					if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (in.getItemType() != null && in.getItemType().trim().length() > 0)) {
						isError = true;
						LineItemError e = new LineItemError();
						e.setErrorCategory(Transaction_Constants.ITEM_TYPE_UNEXPECTED);
						e.setErrorCode(Transaction_Constants.ITEM_TYPE_UNEXPECTED);
						e.setErrorMessage(Transaction_Constants.ITEM_TYPE_UNEXPECTED);
						lineItemErrorList.add(e);
					}
					salesdocdetailIn[count].setItem_Type(rqstLookupValue);
					// SAP needs NUMC - Character string with only digits (num char - 6, decimal place - 0)
					//salesdocdetailIn[count].setItemno(Double.toString(in.getLineNo()));
					salesdocdetailIn[count].setItemno(Integer.toString((int)in.getLineNo()));
					salesdocdetailIn[count].setMaterialid(in.getMaterialKey() != null ? in.getMaterialKey().getMaterialID() : Transaction_Constants.EMPTY);
					salesdocdetailIn[count].setIsbn(in.getMaterialKey() != null ? in.getMaterialKey().getIsbn() : Transaction_Constants.EMPTY);
					salesdocdetailIn[count].setOverride_Ship(in
							.getOverrideShipping());
					salesdocdetailIn[count].setQty(new BigDecimal(in
							.getQuantity()));
					SubscriptionTerm subTerm = in.getSubscriptionTerm();

					if (subTerm != null) {
						rqstLookupValue = hasher.getValue(
								Transaction_Constants.SUBSCRIPTION_TERM,
								Transaction_Constants.ENTERPRISE,
								subTerm.getUnit(),
								Transaction_Constants.SAP);
						if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (subTerm.getUnit() != null && subTerm.getUnit().trim().length() > 0)) {
							isError = true;
							LineItemError e = new LineItemError();
							e.setErrorCategory(Transaction_Constants.SUBSCRIPTION_TERM_UNIT_UNEXPECTED);
							e.setErrorCode(Transaction_Constants.SUBSCRIPTION_TERM_UNIT_UNEXPECTED);
							e.setErrorMessage(Transaction_Constants.SUBSCRIPTION_TERM_UNIT_UNEXPECTED);
							lineItemErrorList.add(e);
						}
						salesdocdetailIn[count].setSub_Str_Qty(rqstLookupValue);
						salesdocdetailIn[count]
								.setSub_Str_Start_Date(toSqlDate(subTerm
										.getStartDate()));
						salesdocdetailIn[count].setSub_Str_Unit(subTerm.getUnit());
					}

					salesdocdetailIn[count].setZcoupon_Code(in
							.getLineCouponCode());
					count++;
				}
			}
		}
		EAI_Log log = EAI_Log.enter(soldToCustomerId != null ? soldToCustomerId : new Date().toString(), SUBMIT_SAMPLE,
				EAI_Log.SYS_WebService, EAI_Log.SYS_SAP);
		producer.sendBody(log.clone());

		
		if (isError) {
			OrderException oe = new OrderException(ERROR_RQST, faultInfo);
			String errorBody = Converter.convertBodyToString(oe.getFaultInfo());
			log.toException(Converter.convertBodyToString(submitSampleRequest),
					oe.getMessage(), EAI_Log.EXEPTION_BUSINESS, errorBody);
			producer.sendBody(log.clone());
			throw oe;
		}
		boolean submitForManualCorrection = submitSampleRequest
				.isSubmitForManualCorrection();
		Holder<Zvgetsales_HeType> salesdocheadOut = new Holder<Zvgetsales_HeType>();
		Holder<Zvgetsales_LeType[]> salesdocdetailOut = new Holder<Zvgetsales_LeType[]>();
		Holder<Zbdcmsgcoll_RfcType[]> sapReturnList = new Holder<Zbdcmsgcoll_RfcType[]>();
		
		
		long requestTime = 0;
		long responseTime = 0;
		try {
			requestTime = System.currentTimeMillis();

			//
			// SAP Transaction Bean
			//
			log.toRequest();
			producer.sendBody(log.clone());

			String sapErrorStatus = bean.submitOrder(clientTransId, orderType, poNumber,
					transactionAction, creditCardInfo, salesdocheadIn,
					salesdocdetailIn, submitForManualCorrection,
					salesdocheadOut, salesdocdetailOut, sapReturnList);

			responseTime = System.currentTimeMillis();
			
			log.toResponse();
			producer.sendBody(log.clone());

			logger.debug("SAP time was " + (responseTime - requestTime)
					+ " ms.");
			if( sapErrorStatus != null && !sapErrorStatus.equals(Transaction_Constants.ZERO)) {
					
					
					Zbdcmsgcoll_RfcType[] sapErrorList = sapReturnList.value;
					for(Zbdcmsgcoll_RfcType sapError: sapErrorList) {
						if(sapError.getMsgtyp() != null) {
							if(sapError.getMsgtyp().equals("H")) {
								Error e = new Error();
								e.setErrorCategory(sapError.getTcode());
								e.setErrorCode(sapError.getMsgid());
								e.setErrorMessage(sapError.getMsgv1());
								headerErrorList.add(e);
							} else if(sapError.getMsgtyp().equals("L")) {
								LineItemError liError = new LineItemError();
								liError.setErrorCategory(sapError.getTcode());
								liError.setErrorCode(sapError.getMsgid());
								if(sapError.getMsgv1() != null) {
									if(sapError.getMsgv1().length() >= 6) {
										liError.setErrorMessage(sapError.getMsgv1().substring(6));
										String lineno = sapError.getMsgv1().substring(0, 6).trim();
										liError.setLineNo(Integer.parseInt(lineno));									
									}
								}
								lineItemErrorList.add(liError);
							}
						}
					}
					OrderException oe = new OrderException(ERROR_RQST, faultInfo);
					throw oe;	
			}
			SubmitSampleResponse ret = makeSubmitSampleResponse(
					salesdocheadOut.value, salesdocdetailOut.value);

			return ret;

		} catch (OrderException ex) {
			String errorBody = Converter.convertBodyToString(ex.getFaultInfo());
			log.toException(Converter.convertBodyToString(submitSampleRequest), ex.getMessage(),
					EAI_Log.EXEPTION_BUSINESS, errorBody);
			producer.sendBody(log.clone());
			throw ex;
		}
		catch (Exception ex) {
			ex.printStackTrace(System.err);
			logger.error("Exception calling submitSample", ex);
			requestTime = responseTime = 0;

			StringWriter stackTrace = new StringWriter();
			ex.printStackTrace(new PrintWriter(stackTrace));
			stackTrace.flush();

			log.toException(transactionAction, ex.getMessage(),
					EAI_Log.EXEPTION_SYSTEM, stackTrace.toString());
			producer.sendBody(log.clone());
			throw new OrderException(ex.getMessage());
		} finally {
			long exitTime = System.currentTimeMillis();
			logger.debug("servicemix time was "
					+ ((exitTime - enterTime) - (responseTime - requestTime))
					+ " ms.");
			logger.debug("execution time was " + (exitTime - enterTime)
					+ " ms.");
			logger.debug("submitSample ends");

			log.toExit();
			producer.sendBody(log.clone());
		}

//		return null;
	}

	@Override
	public FindUnsubmittedOrdersResponse findUnsubmittedOrder(
			FindUnsubmittedOrdersRequest findUnsubmittedOrderRequest)
			throws EaiException {

		EAI_Log log = EAI_Log
				.enter(findUnsubmittedOrderRequest.getSapCustomerNo() != null ? findUnsubmittedOrderRequest
						.getSapCustomerNo() : new Date().toString(),
						FIND_UNSUBMITTED_ORDER, EAI_Log.SYS_WebService,
						EAI_Log.SYS_SFDC);
		producer.sendBody(log.clone());
		String rqstLookupValue = null;
		try {
			logger.debug("findUnsubmittedOrder begin");
			FindOrderCriteria crit = new FindOrderCriteria();
			rqstLookupValue = hasher.getValue(Transaction_Constants.DIVISION,
					Transaction_Constants.ENTERPRISE,
					findUnsubmittedOrderRequest.getDivision(),
					Transaction_Constants.SFDC);
			if ((rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue
					.trim().length() == 0))
					&& (findUnsubmittedOrderRequest.getDivision() != null && findUnsubmittedOrderRequest
							.getDivision().trim().length() > 0)) {
				com.hmco.eai.EaiException eaiException = new com.hmco.eai.EaiException();
				ErrorList errorList = new ErrorList();
				List<com.hmco.eai.Error> listError = errorList.getError();
				Error e = new Error();
				e.setErrorCategory(Transaction_Constants.DIVISION_CODE_UNEXPECTED);
				e.setErrorCode(Transaction_Constants.DIVISION_CODE_UNEXPECTED);
				e.setErrorMessage(Transaction_Constants.DIVISION_CODE_UNEXPECTED);
				listError.add(e);

				eaiException.setErrorList(errorList);
				throw new EaiException(ERROR_RQST, eaiException);

			}
			crit.setDivision(rqstLookupValue);
			crit.setEndDate(findUnsubmittedOrderRequest.getEndDate());
			crit.setMaterialID(findUnsubmittedOrderRequest.getMaterialID());
			crit.setPoNumber(findUnsubmittedOrderRequest.getPoNumber());
			crit.setSapCustomerNo(findUnsubmittedOrderRequest
					.getSapCustomerNo());
			crit.setStartDate(findUnsubmittedOrderRequest.getStartDate());
			crit.setZipCode(findUnsubmittedOrderRequest.getZipCode());

			log.toRequest();
			producer.sendBody(log.clone());

			List<OrderInfo> orderInfoList = sfdcBean
					.findUnsubmittedOrders(crit);

			log.toResponse();
			producer.sendBody(log.clone());

			FindUnsubmittedOrdersResponse response = new FindUnsubmittedOrdersResponse();
			List<UnsubmittedOrders> outputList = response
					.getUnsubmittedOrders();

			if (orderInfoList != null)
				for (OrderInfo info : orderInfoList) {
					if (info == null)
						continue;
					UnsubmittedOrders unOrder = new UnsubmittedOrders();
					unOrder.setCreatedDate(info.getCreatedDate());
					unOrder.setPoNumber(info.getPoNumber());
					unOrder.setShipToCustomerName(info.getShipToCustomerName());
					List<OrderLineList> outOrdLineList = unOrder
							.getOrderLineList();
					List<OrderLine> inOrdLineList = info.getOrderLineList();
					if (inOrdLineList != null) {
						for (OrderLine inOrderLine : inOrdLineList) {
							if (inOrderLine == null)
								continue;
							OrderLineList outOrderLine = new OrderLineList();
							outOrderLine.setIsbn13(inOrderLine.getIsbn13());
							outOrderLine.setMaterialDescription(inOrderLine
									.getMaterialDescription());
							outOrderLine.setMaterialID(inOrderLine
									.getMaterialID());
							outOrderLine.setQuantity(inOrderLine.getQuantity());
							outOrderLine.setStatus(inOrderLine.getStatus());
							outOrdLineList.add(outOrderLine);
						}
					}
					outputList.add(unOrder);
				}

			log.toExit();
			producer.sendBody(log.clone());
			logger.debug("findUnsubmittedOrder ends");
			return response;
		} catch(EaiException ex) {
			String errorBody = Converter.convertBodyToString(ex.getFaultInfo());
			log.toException(Converter.convertBodyToString(findUnsubmittedOrderRequest),
					ex.getMessage(), EAI_Log.EXEPTION_BUSINESS, errorBody);
			producer.sendBody(log.clone());
			throw ex;		
		}catch (Exception ex) {
			ex.printStackTrace(System.err);
			logger.error("Exception calling findUnsubmittedOrder", ex);

			StringWriter stackTrace = new StringWriter();
			ex.printStackTrace(new PrintWriter(stackTrace));
			stackTrace.flush();

			log.toException(
					Converter.convertBodyToString(findUnsubmittedOrderRequest),
					ex.getMessage(), EAI_Log.EXEPTION_SYSTEM,
					stackTrace.toString());
			producer.sendBody(log.clone());

			throw new com.hmco.eai.tibco.enterprisewebservices.EaiException(
					ex.getMessage());
		} finally {
			log.toExit();
			producer.sendBody(log.clone());
		}
	}

	@Override
	public FindBasisOrderResponse findSfdcBasisOrder(FindBasisOrderRequest rqst)
			throws EaiException {
		EAI_Log log = EAI_Log
				.enter(new Date().toString() + rqst.getSfdcOrderNumber() != null ? rqst
						.getSfdcOrderNumber() : (rqst.getPid() != null ? rqst
						.getPid() : Transaction_Constants.EMPTY),
						FIND_SFDC_BASIS_ORDER, EAI_Log.SYS_WebService,
						EAI_Log.SYS_SFDC);
		producer.sendBody(log.clone());
		String rqstLookupValue = null;
		try {
			logger.debug("findSfdcBasisOrder begin");
			BasisOrderSearchCriteria criteria = new BasisOrderSearchCriteria();
			rqstLookupValue = hasher.getValue(Transaction_Constants.DIVISION,
					Transaction_Constants.ENTERPRISE, rqst.getEntryDivision(),
					Transaction_Constants.SFDC);
			if ((rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue
					.trim().length() == 0))
					&& (rqst.getEntryDivision() != null && rqst
							.getEntryDivision().trim().length() > 0)) {
				com.hmco.eai.EaiException eaiException = new com.hmco.eai.EaiException();
				ErrorList errorList = new ErrorList();
				List<com.hmco.eai.Error> listError = errorList.getError();
				Error e = new Error();
				e.setErrorCategory(Transaction_Constants.DIVISION_CODE_UNEXPECTED);
				e.setErrorCode(Transaction_Constants.DIVISION_CODE_UNEXPECTED);
				e.setErrorMessage(Transaction_Constants.DIVISION_CODE_UNEXPECTED);
				listError.add(e);

				eaiException.setErrorList(errorList);
				throw new EaiException(ERROR_RQST, eaiException);

			}
			criteria.setEntryDivision(rqstLookupValue);
			criteria.setEntryYear(rqst.getEntryYear());
			criteria.setPid(rqst.getPid());
			criteria.setSfdcOrderNumber(rqst.getSfdcOrderNumber());

			log.toRequest();
			producer.sendBody(log.clone());

			BasisOrderSearchResult searchResult = sfdcBean
					.findSfdcBasicOrders(criteria);

			log.toResponse();
			producer.sendBody(log.clone());

			FindBasisOrderResponse response = new FindBasisOrderResponse();
			if (searchResult != null) {
				response.setMessage(searchResult.getMessage());
				response.setStatus(searchResult.getStatus());
				List<BasisOrder> basisOrderInList = searchResult
						.getBasisOrderList();
				List<BasisOrderList> basisOrderOutList = response
						.getBasisOrderList();
				String respLookupValue = null;
				if (basisOrderInList != null) {
					for (BasisOrder inOrder : basisOrderInList) {
						if (inOrder == null)
							continue;
						BasisOrderList outBasisOrder = new BasisOrderList();
						// logger.info("inOrder ::: " + inOrder);
						outBasisOrder.setBasisOrderUsed(inOrder
								.isBasisOrderUsed());
						respLookupValue = hasher.getValue(
								Transaction_Constants.DIVISION,
								Transaction_Constants.SFDC,
								inOrder.getEntryDivision(),
								Transaction_Constants.ENTERPRISE);
						outBasisOrder
								.setEntryDivision((respLookupValue != null && respLookupValue
										.trim().length() == 0)
										|| respLookupValue == null ? Transaction_Constants.DIVISION_CODE_UNEXPECTED
										: respLookupValue);
						outBasisOrder.setEntryYear(inOrder.getEntryYear());
						outBasisOrder.setHasEGood(inOrder.isHasEGood());
						outBasisOrder.setSfdcAccountId(inOrder
								.getSfdcAccountId());
						outBasisOrder.setSfdcInternalOrderId(inOrder
								.getSfdcInternalOrderId());
						outBasisOrder.setSfdcOrderNumber(inOrder
								.getSfdcOrderNumber());
						outBasisOrder.setState(inOrder.getState());
						outBasisOrder.setTransactionType(inOrder
								.getTransactionType());
						List<LineList> outLineList = outBasisOrder
								.getLineList();
						List<BasisOrderLine> inLineList = inOrder.getLineList();
						if (inLineList != null) {
							for (BasisOrderLine inOrdLine : inLineList) {
								if (inOrdLine == null)
									continue;
								LineList outOrdLine = new LineList();
								outOrdLine.setBeginningGradeLevel(inOrdLine
										.getBeginningGradeLevel());
								outOrdLine.setCpsiaReqCertificate(inOrdLine
										.isCpsiaReqCertificate());
								outOrdLine.setCpsiaReqLabel(inOrdLine
										.isCpsiaReqLabel());
								outOrdLine.setCustomerTitle(inOrdLine
										.getCustomerTitle());
								outOrdLine.setEGoodIndicator(inOrdLine
										.getEGoodIndicator());
								outOrdLine.setEndingGradeLevel(inOrdLine
										.getEndingGradeLevel());
								outOrdLine.setIsbn13(inOrdLine
										.getEndingGradeLevel());
								outOrdLine
										.setProductHierarchyLevelDesc1(inOrdLine
												.getProductHierarchyLevelDesc1());
								outOrdLine
										.setProductHierarchyLevelDesc2(inOrdLine
												.getProductHierarchyLevelDesc2());
								outOrdLine
										.setProductHierarchyLevelDesc3(inOrdLine
												.getProductHierarchyLevelDesc3());
								outOrdLine
										.setProductHierarchyLevelDesc4(inOrdLine
												.getProductHierarchyLevelDesc4());
								outOrdLine
										.setProductHierarchyLevelDesc5(inOrdLine
												.getProductHierarchyLevelDesc5());
								outOrdLine.setQuantity(inOrdLine.getQuantity());
								outOrdLine.setSfdcInternalOrderLineId(inOrdLine
										.getSfdcInternalOrderLineId());
								outOrdLine.setShortProductCode(inOrdLine
										.getShortProductCode());
								outLineList.add(outOrdLine);
							}
						}
						basisOrderOutList.add(outBasisOrder);
					}
				}
			} else {
				response = new FindBasisOrderResponse();
			}

			log.toExit();
			producer.sendBody(log.clone());
			logger.debug("findSfdcBasisOrder ends");
			return response;
		} catch (EaiException ex) { 
			String errorBody = Converter.convertBodyToString(ex.getFaultInfo());
			log.toException(Converter.convertBodyToString(rqst),
					ex.getMessage(), EAI_Log.EXEPTION_BUSINESS, errorBody);
			producer.sendBody(log.clone());
			throw ex;		
		
		}catch (Exception ex) {
			ex.printStackTrace(System.err);
			logger.error("Exception calling findSfdcBasisOrder", ex);

			StringWriter stackTrace = new StringWriter();
			ex.printStackTrace(new PrintWriter(stackTrace));
			stackTrace.flush();

			log.toException(Converter.convertBodyToString(rqst),
					ex.getMessage(), EAI_Log.EXEPTION_SYSTEM,
					stackTrace.toString());
			producer.sendBody(log.clone());

			throw new com.hmco.eai.tibco.enterprisewebservices.EaiException(
					ex.getMessage());
		} finally {
			log.toExit();
			producer.sendBody(log.clone());
		}
	}

	@Override
	public SubmitOrderResponse submitSfdcOrder(
			SubmitOrderRequest rqst) throws EaiException {

		EAI_Log log = EAI_Log
		.enter(new Date().toString(),
				SUBMIT_ORDER, EAI_Log.SYS_WebService,
				EAI_Log.SYS_SFDC);
		producer.sendBody(log.clone());
		
		try {
			logger.debug("submitSfdcOrder begin");
			SubmitOrder subOrder = new SubmitOrder();
			subOrder.setAlternateEmailAddress(rqst.getAlternateEmailAddress());
			subOrder.setAttnTo(rqst.getAttnTo());
			subOrder.setBasisSfdcInternalOrderId(rqst.getBasisSfdcInternalOrderId());
			subOrder.setClientSystemId(rqst.getClientSystemId());
			subOrder.setClientTransactionId(rqst.getClientTransactionId());
			subOrder.setContactEmail(rqst.getContactEmail());
			subOrder.setContactName(rqst.getContactName());
			subOrder.setContactPhone(rqst.getContactPhone());
			subOrder.setDeliverByDate(rqst.getDeliverByDate());
			subOrder.setDeliveryNotes(rqst.getDeliveryNotes());
			subOrder.setDistrictPid(rqst.getDistrictPid());
			subOrder.setDoNotMixPOsOnSamePallet(rqst.isDoNotMixPOsOnSamePallet());
			subOrder.setEgoodEmail(rqst.getEgoodEmail());
			
			boolean isError = false;
			com.hmco.eai.EaiException eaiException = new com.hmco.eai.EaiException();
			ErrorList errorList = new ErrorList();
			List<com.hmco.eai.Error> listError = errorList.getError();
			
			String rqstLookupValue = hasher.getValue(Transaction_Constants.DIVISION,
					Transaction_Constants.ENTERPRISE,
					rqst.getEntryDivision(), 
					Transaction_Constants.SFDC);
			if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (rqst.getEntryDivision() != null && rqst.getEntryDivision().trim().length() > 0)) {
				isError = true;
				Error e = new Error();
				e.setErrorCategory(Transaction_Constants.DIVISION_CODE_UNEXPECTED);
				e.setErrorCode(Transaction_Constants.DIVISION_CODE_UNEXPECTED);
				e.setErrorMessage(Transaction_Constants.DIVISION_CODE_UNEXPECTED);
				listError.add(e);
			}
			subOrder.setEntryDivision(rqstLookupValue);
			subOrder.setHeaderCCRatioIndicator(rqst.getHeaderCCRatioIndicator());
			subOrder.setMarketCode(rqst.getMarketCode());
			subOrder.setNoFridayDelivery(rqst.isNoFridayDelivery());
			subOrder.setOrderedBy(rqst.getOrderedByRep());
			subOrder.setOrderReasonCode(rqst.getOrderReasonCode());
			subOrder.setOriginalPONumber(rqst.getOriginalPONumber());
			List<SubmitOrderLine> outSoLineList = subOrder.getLineList();
			List<SubmitOrderLIneList> inSoLineList = rqst.getSubmitOrderLIneList();
			if(inSoLineList != null) {
				for(SubmitOrderLIneList inSoLine : inSoLineList) {
					if(inSoLine == null)
						continue;
					SubmitOrderLine outSoLine = new SubmitOrderLine();
					outSoLine.setChargeStatus(inSoLine.getChargeStatus());
					outSoLine.setGrade(inSoLine.getGrade());
					outSoLine.setIsbn13(inSoLine.getIsbn13());
					outSoLine.setLineCCRatioIndicator(inSoLine.getLineCCRatioIndicator());
					outSoLine.setLineItemNote(inSoLine.getLineItemNote());
					outSoLine.setQuantity(inSoLine.getQuantity());
					outSoLine.setSfdcInternalOrderLineId(inSoLine.getSfdcInternalOrderLineId());
					outSoLine.setShortProductCode(inSoLine.getShortProductCode());
					outSoLineList.add(outSoLine);
				}
			}
			
			List<OrderNote> outOrdNoteList = subOrder.getOrderNoteList();
			List<OrderNoteList> inOrdNoteList = rqst.getOrderNoteList();
			if(inOrdNoteList != null) {
				for(OrderNoteList inOrdNote : inOrdNoteList) {
					if(inOrdNote == null) 
						continue;
					OrderNote outOrdNote = new OrderNote();
					outOrdNote.setAdHocNote(inOrdNote.getAdHocNote());
					outOrdNote.setAdHocNoteTitle(inOrdNote.getAdHocNoteTitle());
					outOrdNoteList.add(outOrdNote);
				}
			}
			
			rqstLookupValue = hasher.getValue(Transaction_Constants.PACK_BY_OPTION,
					Transaction_Constants.ENTERPRISE,
					rqst.getPackBySchoolOrGrade(), 
					Transaction_Constants.SFDC);
			if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (rqst.getPackBySchoolOrGrade() != null && rqst.getPackBySchoolOrGrade().trim().length() > 0)) {
				isError = true;
				Error e = new Error();
				e.setErrorCategory(Transaction_Constants.PACK_BY_OPTION_UNEXPECTED);
				e.setErrorCode(Transaction_Constants.PACK_BY_OPTION_UNEXPECTED);
				e.setErrorMessage(Transaction_Constants.PACK_BY_OPTION_UNEXPECTED);
				listError.add(e);
			}
			subOrder.setPackBySchoolOrGrade(rqstLookupValue);
			subOrder.setPoNumber(rqst.getPoNumber());
			subOrder.setSendConfirmationEmail(rqst.isSendConfirmationEmail());
			subOrder.setSfdcAccountId(rqst.getSfdcAccountId());
			
			rqstLookupValue = hasher.getValue(Transaction_Constants.SHIP_DATE_OPTION,
					Transaction_Constants.ENTERPRISE,
					rqst.getShipDateOption(), 
					Transaction_Constants.SFDC);
			if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (rqst.getShipDateOption() != null && rqst.getShipDateOption().trim().length() > 0)) {
				isError = true;
				Error e = new Error();
				e.setErrorCategory(Transaction_Constants.SHIP_DATE_OPTION_UNEXPECTED);
				e.setErrorCode(Transaction_Constants.SHIP_DATE_OPTION_UNEXPECTED);
				e.setErrorMessage(Transaction_Constants.SHIP_DATE_OPTION_UNEXPECTED);
				listError.add(e);
			}
			subOrder.setShipDateOption(rqstLookupValue);
			subOrder.setShipDateOptionDate(rqst.getShipDateOptionDate());
			subOrder.setShippingAccountName(rqst.getShippingAccountName());
			subOrder.setShippingAddressCity(rqst.getShippingAddressCity());
			subOrder.setShippingAddressLine1(rqst.getShippingAddressLine1());
			subOrder.setShippingAddressLine2(rqst.getShippingAddressLine2());
			subOrder.setShippingAddressState(rqst.getShippingAddressState());
			subOrder.setShippingCountry(rqst.getShippingCountry());
			subOrder.setShippingZip(rqst.getShippingZip());
			subOrder.setShipToPid(rqst.getShipToPid());
			subOrder.setTransactionName(rqst.getTransactionName());
			
			rqstLookupValue = hasher.getValue(Transaction_Constants.TRANSACTION_TYPE,
					Transaction_Constants.ENTERPRISE,
					rqst.getTransactionType(), 
					Transaction_Constants.SFDC);
			if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (rqst.getTransactionType() != null && rqst.getTransactionType().trim().length() > 0)) {
				isError = true;
				Error e = new Error();
				e.setErrorCategory(Transaction_Constants.TRANSACTION_TYPE_UNEXPECTED);
				e.setErrorCode(Transaction_Constants.TRANSACTION_TYPE_UNEXPECTED);
				e.setErrorMessage(Transaction_Constants.TRANSACTION_TYPE_UNEXPECTED);
				listError.add(e);
			}
			subOrder.setTransactionType(rqstLookupValue);
			subOrder.setUseOverrideAddress(rqst.isUseOverrideAddress());
			
			if(isError) {
				eaiException.setErrorList(errorList);
				throw new EaiException(ERROR_RQST, eaiException);
			}
			
			log.toRequest();
			producer.sendBody(log.clone());

			SubmitOrderResult searchResult = sfdcBean.submitSfdcOrder(subOrder);

			log.toResponse();
			producer.sendBody(log.clone());

			SubmitOrderResponse response = new SubmitOrderResponse();
			response.setMessage(searchResult.getMessage());
			response.setPoNumber(searchResult.getPoNumber());
			response.setSfdcInternalOrderId(searchResult.getSfdcInternalOrderId());
			response.setSfdcOrderNumber(searchResult.getSfdcOrderNumber());
			response.setStatus(searchResult.getStatus());
			
			log.toExit();
			producer.sendBody(log.clone());
			logger.debug("submitSfdcOrder ends");
			return response;
		} catch(EaiException ex ){
			String errorBody = Converter.convertBodyToString(ex.getFaultInfo());
			log.toException(Converter.convertBodyToString(rqst),
					ex.getMessage(), EAI_Log.EXEPTION_BUSINESS, errorBody);
			producer.sendBody(log.clone());
			throw ex;		
		} catch (Exception ex) {
			ex.printStackTrace(System.err);
			logger.error("Exception calling submitSfdcOrder", ex);

			StringWriter stackTrace = new StringWriter();
			ex.printStackTrace(new PrintWriter(stackTrace));
			stackTrace.flush();

			log.toException(Converter.convertBodyToString(rqst), ex.getMessage(),
					EAI_Log.EXEPTION_SYSTEM, stackTrace.toString());
			producer.sendBody(log.clone());
			
			throw new com.hmco.eai.tibco.enterprisewebservices.EaiException(ex.getMessage()); 
		} finally {
			log.toExit();
			producer.sendBody(log.clone());
		}
		
	}

	//
	// EskerService interface
	//
	@Override
	public EskerTransactionResult eskerTransactionOperation(
			EskerTransactionRequest wsReq) throws EaiException {

		EAI_Log log = EAI_Log.enter(wsReq.getCpSfdcOrderNumber(),
				ESKER_TRANSACTION, EAI_Log.SYS_WebService, EAI_Log.SYS_SFDC);
		producer.sendBody(log.clone());

		try {
			logger.debug("eskerTransactionOperation begin");
			
			String requestBody = Converter.convertBodyToString(wsReq);
			logger.debug("request: " + requestBody);

			com.sforce.soap.schemas._class.eskerservice.EskerTransactionRequest req = new com.sforce.soap.schemas._class.eskerservice.EskerTransactionRequest();
			req.setAttnLine(wsReq.getAttnLine());
			req.setCpSfdcOrderNumber(wsReq.getCpSfdcOrderNumber());
			req.setCustomerPO(wsReq.getCustomerPO());
			req.setDataIn1(wsReq.getDataIn1());
			req.setDataIn2(wsReq.getDataIn2());
			req.setDataIn3(wsReq.getDataIn3());
			req.setEmailAddress(wsReq.getEmailAddress());
			req.setFaxURL(wsReq.getFaxURL());
			req.setPoReceiptTimestamp(wsReq.getPoReceiptTimestamp());
			// logger.info("Esker Override Flag ::: " +
			// wsReq.getOverrideFlag());
			com.hmco.eai.EaiException eaiException = new com.hmco.eai.EaiException();
			ErrorList errorList = new ErrorList();
			List<com.hmco.eai.Error> listError = errorList.getError();
			boolean isError = false;
			if (wsReq.getOverrideFlag() != null
					&& wsReq.getOverrideFlag().trim().length() > 0) {
				if (!wsReq.getOverrideFlag().trim().equalsIgnoreCase("1")
						&& !wsReq.getOverrideFlag().trim()
								.equalsIgnoreCase(Transaction_Constants.TRUE)
						&& !wsReq.getOverrideFlag().trim()
								.equalsIgnoreCase(Transaction_Constants.ZERO)
						&& !wsReq.getOverrideFlag().trim()
								.equalsIgnoreCase(Transaction_Constants.FALSE)) {
					isError = true;
					Error e = new Error();
					e.setErrorCategory("3");
					e.setErrorCode(wsReq.getOverrideFlag()
							+ " is not a valid boolean value");
					e.setErrorMessage(wsReq.getOverrideFlag()
							+ " is not a valid boolean value");
					listError.add(e);
				}
				req.setOverrideFlag(wsReq.getOverrideFlag().trim()
						.equalsIgnoreCase("1")
						|| wsReq.getOverrideFlag().trim()
								.equalsIgnoreCase(Transaction_Constants.TRUE));
			} else {
				isError = true;
				Error e = new Error();
				e.setErrorCategory("3");
				e.setErrorCode("overrideFlag is empty or null");
				e.setErrorMessage("overrideFlag is empty or null");
				listError.add(e);
			}

			if (isError) {
				eaiException.setErrorList(errorList);
				throw new EaiException(ERROR_RQST, eaiException);
			}

			req.setShipToCustomer(wsReq.getShipToCustomer());
			req.setSoldToCustomer(wsReq.getSoldToCustomer());

			log.toRequest();
			producer.sendBody(log.clone());

			com.sforce.soap.schemas._class.eskerservice.EskerTransactionResult res = sfdcBean
					.createCPOFromCPWS(req);

			log.toResponse();
			producer.sendBody(log.clone());

			EskerTransactionResult wres = new EskerTransactionResult();
			wres.setCpoId(res.getCpoId());
			wres.setCpoSfdcOrderNumber(res.getCpoSfdcOrderNumber());
			wres.setDataOut1(res.getDataOut1());
			wres.setDataOut2(res.getDataOut2());
			wres.setDataOut3(res.getDataOut3());
			wres.setMessage(res.getMessage());
			wres.setResultCode(res.getResultCode());

			// log.toExit();
			// producer.sendBody(log.clone());

			String responseBody = Converter.convertBodyToString(wres);
			logger.debug("response: " + responseBody);
			
			logger.debug("eskerTransactionOperation ends");

			return wres;

		} catch (EaiException ex) {
			String errorBody = Converter.convertBodyToString(ex.getFaultInfo());
			log.toException(Converter.convertBodyToString(wsReq),
					ex.getMessage(), EAI_Log.EXEPTION_BUSINESS, errorBody);
			producer.sendBody(log.clone());
			throw ex;
		} catch (Exception ex) {
			// ex.printStackTrace(System.err);
			logger.error("Exception calling eskerTransactionOperation", ex);

			StringWriter stackTrace = new StringWriter();
			ex.printStackTrace(new PrintWriter(stackTrace));
			stackTrace.flush();

			log.toException(Converter.convertBodyToString(wsReq),
					ex.getMessage(), EAI_Log.EXEPTION_SYSTEM,
					stackTrace.toString());
			producer.sendBody(log.clone());

			throw new com.hmco.eai.tibco.enterprisewebservices.EaiException(
					ex.getMessage());
		} finally {
			log.toExit();
			producer.sendBody(log.clone());
		}
	}

	//
	// Helper Methods
	//
	private java.sql.Date toSqlDate(XMLGregorianCalendar xgc) {
		if (xgc != null) {
			Date javaDate = xgc.toGregorianCalendar().getTime();
			java.sql.Date sqlDate = new java.sql.Date(javaDate.getTime());
			return sqlDate;
		} else
			return null;

	}

	private XMLGregorianCalendar toXMLGregorianCalendar(Date d)
			throws DatatypeConfigurationException {
		if (d != null) {
			GregorianCalendar c = new GregorianCalendar();
			c.setTime(d);
			XMLGregorianCalendar gc = DatatypeFactory.newInstance()
					.newXMLGregorianCalendar(c);
			gc.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
			gc.setTime(DatatypeConstants.FIELD_UNDEFINED,
					DatatypeConstants.FIELD_UNDEFINED,
					DatatypeConstants.FIELD_UNDEFINED);
			return gc;
		} else
			return null;
	}

	private Zvgetsales_HType makeSubmitSaleHeader(SaleHeader in, List<Error> headerErrorList) {
		com.hmco.eai.EaiException eaiException = new com.hmco.eai.EaiException();
		
		Zvgetsales_HType salesdocheadIn = new Zvgetsales_HType();
		// SaleHeader in = submitSaleRequest.getSaleHeader();
		salesdocheadIn.setAllowcontractpricingflag(in
				.isAllowContractPricingFlag() ? Transaction_Constants.Y
				: Transaction_Constants.N);
		salesdocheadIn
				.setAllowsubstitutionsflag(in.isAllowSubstitutionsFlag() ? Transaction_Constants.Y
						: Transaction_Constants.N);

		String rqstLookupValue = hasher.getValue(
				Transaction_Constants.AR_TERMS,
				Transaction_Constants.ENTERPRISE, in.getArTerms(),
				Transaction_Constants.SAP);
		boolean isError = false;
		if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (in.getArTerms() != null && in.getArTerms().trim().length() > 0)) {
			isError = true;
			Error e = new Error();
			e.setErrorCategory(Transaction_Constants.ARTERMS_UNEXPECTED);
			e.setErrorCode(Transaction_Constants.ARTERMS_UNEXPECTED);
			e.setErrorMessage(Transaction_Constants.ARTERMS_UNEXPECTED);
			headerErrorList.add(e);
		}
		salesdocheadIn.setArterms(rqstLookupValue);
		salesdocheadIn.setBackordercanceldate(toSqlDate(in
				.getBackorderCancelDate()));
		rqstLookupValue = hasher.getValue(
				Transaction_Constants.BACK_ORDER_OPTION,
				Transaction_Constants.ENTERPRISE, in.getBackorderOption(),
				Transaction_Constants.SAP);

		if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (in.getBackorderOption() != null && in.getBackorderOption().trim().length() > 0)) {
			isError = true;
			Error e = new Error();
			e.setErrorCategory(Transaction_Constants.BACK_ORDER_OPTION_UNEXPECTED);
			e.setErrorCode(Transaction_Constants.BACK_ORDER_OPTION_UNEXPECTED);
			e.setErrorMessage(Transaction_Constants.BACK_ORDER_OPTION_UNEXPECTED);
			headerErrorList.add(e);
		}
		salesdocheadIn.setBackorderoption(rqstLookupValue);
		salesdocheadIn.setBill_Of_Lading_Text(in.getBillOfLading());
		salesdocheadIn.setBilltoattentionline(in.getBillToAttentionLine());
		salesdocheadIn.setBilltocustomerid(in.getBillToCustomerID());
		salesdocheadIn.setContactname(in.getContactName());
		salesdocheadIn.setContactphone(in.getContactPhone());
		salesdocheadIn.setCshold(in.getCsHold());
		salesdocheadIn.setCustomeremail(in.getCustomerEmail());
		salesdocheadIn.setDeferedpaymentdate(toSqlDate(in
				.getDeferedPaymentDate()));
		rqstLookupValue = hasher.getValue(
				Transaction_Constants.DELIVERY_BLOCK,
				Transaction_Constants.ENTERPRISE, in.getDeliveryBlock(),
				Transaction_Constants.SAP);

		if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (in.getDeliveryBlock() != null && in.getDeliveryBlock().trim().length() > 0)) {
			isError = true;
			Error e = new Error();
			e.setErrorCategory(Transaction_Constants.DELIVERY_BLOCK_UNEXPECTED);
			e.setErrorCode(Transaction_Constants.DELIVERY_BLOCK_UNEXPECTED);
			e.setErrorMessage(Transaction_Constants.DELIVERY_BLOCK_UNEXPECTED);
			headerErrorList.add(e);
		}
		salesdocheadIn.setDeliveryblock(rqstLookupValue);
		salesdocheadIn.setDock_Instruct_Text(in.getDockInstructions());
		
		rqstLookupValue = hasher.getValue(
				Transaction_Constants.DIVISION,
				Transaction_Constants.ENTERPRISE, in.getEntryDivision(),
				Transaction_Constants.SAP);
		if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (in.getEntryDivision() != null && in.getEntryDivision().trim().length() > 0)) {
			isError = true;
			Error e = new Error();
			e.setErrorCategory(Transaction_Constants.DIVISION_CODE_UNEXPECTED);
			e.setErrorCode(Transaction_Constants.DIVISION_CODE_UNEXPECTED);
			e.setErrorMessage(Transaction_Constants.DIVISION_CODE_UNEXPECTED);
			headerErrorList.add(e);
		}
		salesdocheadIn.setEntrydivision(rqstLookupValue);
		salesdocheadIn.setFaxurl(in.getFaxURL());
		if (in.getForceDeliveredPricing() != null
				&& in.getForceDeliveredPricing().equalsIgnoreCase(Transaction_Constants.ALWAYS)) {
			salesdocheadIn.setForce_Delv_Price(Transaction_Constants.Y);
		} else if (in.getForceDeliveredPricing() != null
				&& in.getForceDeliveredPricing().equalsIgnoreCase(Transaction_Constants.NEVER)) {
			salesdocheadIn.setForce_Delv_Price(Transaction_Constants.N);
		}
		// salesdocheadIn.setHandlingterms(in.get)
		salesdocheadIn.setMessage(in.getFreeformMessage());
		salesdocheadIn.setMust_Arrive_By_Date(toSqlDate(in
				.getMustArriveByDate()));
		rqstLookupValue = hasher.getValue(
				Transaction_Constants.ARRIVE_BY_REASON,
				Transaction_Constants.ENTERPRISE, in.getMustArriveByReason(),
				Transaction_Constants.SAP);
		if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (in.getMustArriveByReason() != null && in.getMustArriveByReason().trim().length() > 0)) {
			isError = true;
			Error e = new Error();
			e.setErrorCategory(Transaction_Constants.ARRIVE_BY_REASON_UNEXPECTED);
			e.setErrorCode(Transaction_Constants.ARRIVE_BY_REASON_UNEXPECTED);
			e.setErrorMessage(Transaction_Constants.ARRIVE_BY_REASON_UNEXPECTED);
			headerErrorList.add(e);
		}
		salesdocheadIn.setMust_Arrive_By_Reason(rqstLookupValue);
		rqstLookupValue = hasher.getValue(
				Transaction_Constants.ORDER_REASON,
				Transaction_Constants.ENTERPRISE, in.getOrderReason(),
				Transaction_Constants.SAP);
		if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (in.getOrderReason() != null && in.getOrderReason().trim().length() > 0)) {
			isError = true;
			Error e = new Error();
			e.setErrorCategory(Transaction_Constants.ORDER_REASON_UNEXPECTED);
			e.setErrorCode(Transaction_Constants.ORDER_REASON_UNEXPECTED);
			e.setErrorMessage(Transaction_Constants.ORDER_REASON_UNEXPECTED);
			headerErrorList.add(e);
		}
		salesdocheadIn.setOrderreason(rqstLookupValue);
		rqstLookupValue = hasher.getValue(
				Transaction_Constants.ORDER_SOURCE,
				Transaction_Constants.ENTERPRISE, in.getOrderSource(),
				Transaction_Constants.SAP);
		if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (in.getOrderSource() != null && in.getOrderSource().trim().length() > 0)) {
			isError = true;
			Error e = new Error();
			e.setErrorCategory(Transaction_Constants.ORDER_SOURCE_UNEXPECTED);
			e.setErrorCode(Transaction_Constants.ORDER_SOURCE_UNEXPECTED);
			e.setErrorMessage(Transaction_Constants.ORDER_SOURCE_UNEXPECTED);
			headerErrorList.add(e);
		}
		salesdocheadIn.setOrdersource(rqstLookupValue);
		salesdocheadIn.setPricedate(toSqlDate(in.getPriceDate()));
		salesdocheadIn.setPromotioncode(in.getPromotionCode());
		salesdocheadIn
				.setRemove_Frgt_Forw(in.isRemoveFreightForwarder() != null
						&& in.isRemoveFreightForwarder() != null ? Transaction_Constants.Y
						: Transaction_Constants.N);
		salesdocheadIn.setRequesteddate(toSqlDate(in.getRequestedDate()));
		// salesdocheadIn.setSalesrepid(in.gets)
		rqstLookupValue = hasher.getValue(
				Transaction_Constants.SHIP_DATE_OPTION,
				Transaction_Constants.ENTERPRISE, in.getShipDateOption(),
				Transaction_Constants.SAP);
		if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (in.getShipDateOption() != null && in.getShipDateOption().trim().length() > 0)) {
			isError = true;
			Error e = new Error();
			e.setErrorCategory(Transaction_Constants.SHIP_DATE_OPTION_UNEXPECTED);
			e.setErrorCode(Transaction_Constants.SHIP_DATE_OPTION_UNEXPECTED);
			e.setErrorMessage(Transaction_Constants.SHIP_DATE_OPTION_UNEXPECTED);
			headerErrorList.add(e);
		}
		salesdocheadIn.setShipdateoption(rqstLookupValue);
		rqstLookupValue = hasher.getValue(
				Transaction_Constants.SHIPMENT_METHOD,
				Transaction_Constants.ENTERPRISE, in.getShipmentMethod(),
				Transaction_Constants.SAP);
		if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (in.getShipmentMethod() != null && in.getShipmentMethod().trim().length() > 0)) {
			isError = true;
			Error e = new Error();
			e.setErrorCategory(Transaction_Constants.SHIPMENT_METHOD_UNEXPECTED);
			e.setErrorCode(Transaction_Constants.SHIPMENT_METHOD_UNEXPECTED);
			e.setErrorMessage(Transaction_Constants.SHIPMENT_METHOD_UNEXPECTED);
			headerErrorList.add(e);
		}
		salesdocheadIn.setShipmentmethod(rqstLookupValue);
		rqstLookupValue = hasher.getValue(
				Transaction_Constants.SHIPPING_TERMS,
				Transaction_Constants.ENTERPRISE, in.getShippingTerms(),
				Transaction_Constants.SAP);
		if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (in.getShippingTerms() != null && in.getShippingTerms().trim().length() > 0)) {
			isError = true;
			Error e = new Error();
			e.setErrorCategory(Transaction_Constants.SHIPPING_TERMS_UNEXPECTED);
			e.setErrorCode(Transaction_Constants.SHIPPING_TERMS_UNEXPECTED);
			e.setErrorMessage(Transaction_Constants.SHIPPING_TERMS_UNEXPECTED);
			headerErrorList.add(e);
		}
		salesdocheadIn.setShippingterms(rqstLookupValue);
		salesdocheadIn.setShiptoattentionline(in.getShipToAttentionLine());
		salesdocheadIn.setShiptocustomerid(in.getShipToCustomerID());
		// salesdocheadIn.setShiptodepartment(in.get)
		// salesdocheadIn.setShiptolocation(in.gets)
		salesdocheadIn.setShiptopo(in.getShipToCustomerPO());
		String soldToCustomerId = in.getSoldToCustomerID();
		salesdocheadIn.setSoldtocustomerid(soldToCustomerId);
		salesdocheadIn.setUserid(in.getUserId());
		salesdocheadIn.setZcoupon_Code(in.getHeaderCouponCode());

		return salesdocheadIn;
	}

	private Zvgetsales_HType makeSubmitSaleHeader2(SaleHeader2 in, List<Error> headerErrorList) {
		Zvgetsales_HType salesdocheadIn = new Zvgetsales_HType();
		// SaleHeader in = submitSaleRequest.getSaleHeader();
		salesdocheadIn.setAllowcontractpricingflag(in
				.isAllowContractPricingFlag() ? Transaction_Constants.Y
				: Transaction_Constants.N);
//		salesdocheadIn
//				.setAllowsubstitutionsflag(in.isAllowSubstitutionsFlag() ? Transaction_Constants.Y
//						: Transaction_Constants.N);
		
		//added as part of a CR on 13-SEP-2012
		if(in.getAllowSubstitutionsFlag() != null) {
			if(in.getAllowSubstitutionsFlag().equalsIgnoreCase(Transaction_Constants.ALLOW_SUBSTITUTIONS_ALWAYS) || 
					in.getAllowSubstitutionsFlag().equalsIgnoreCase(Transaction_Constants.ALWAYS_SUBSTITUTE)) {
				salesdocheadIn.setAllowsubstitutionsflag(Transaction_Constants.Y);	
			} else if(in.getAllowSubstitutionsFlag().equalsIgnoreCase(Transaction_Constants.ALLOW_SUBSTITUTIONS_NEVER) || 
					in.getAllowSubstitutionsFlag().equalsIgnoreCase(Transaction_Constants.NEVER_SUBSTITUTE)) {
				salesdocheadIn.setAllowsubstitutionsflag(Transaction_Constants.N);	
			}  else if(in.getAllowSubstitutionsFlag().equalsIgnoreCase(Transaction_Constants.ALLOW_SUBSTITUTIONS_CUSTOMER_DEFAULT ) || 
					in.getAllowSubstitutionsFlag().equalsIgnoreCase(Transaction_Constants.CUSTOMER_DEFAULT )) {
				salesdocheadIn.setAllowsubstitutionsflag(Transaction_Constants.EMPTY);
			}
		} else {
			salesdocheadIn.setAllowsubstitutionsflag(Transaction_Constants.EMPTY);
		}
		
		salesdocheadIn.setFreight_Charges(in.getFreightCharges()); // added as part of a CR on 13-SEP-2012
		if(in.getPoReceiptTimestamp() != null) {
			salesdocheadIn.setReciept_Date(yyyymmddhhMMss.format(in.getPoReceiptTimestamp().toGregorianCalendar().getTime())); // added as part of a CR on 29-OCT-2012
			logger.info("RECEIPT DATE ::: " + salesdocheadIn.getReciept_Date());
//			salesdocheadIn.setReciept_Date(in.getPoReceiptTimestamp().toString()); // added as part of a CR on 29-OCT-2012	
		}
		
		String rqstLookupValue = hasher.getValue(
				Transaction_Constants.AR_TERMS,
				Transaction_Constants.ENTERPRISE, in.getArTerms(),
				Transaction_Constants.SAP);
		if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (in.getArTerms() != null && in.getArTerms().trim().length() > 0)) {
			Error e = new Error();
			e.setErrorCategory(Transaction_Constants.ARTERMS_UNEXPECTED);
			e.setErrorCode(Transaction_Constants.ARTERMS_UNEXPECTED);
			e.setErrorMessage(Transaction_Constants.ARTERMS_UNEXPECTED);
			headerErrorList.add(e);
		}
		salesdocheadIn.setArterms(rqstLookupValue);
		salesdocheadIn.setBackordercanceldate(toSqlDate(in
				.getBackorderCancelDate()));
		rqstLookupValue = hasher.getValue(
				Transaction_Constants.BACK_ORDER_OPTION,
				Transaction_Constants.ENTERPRISE, in.getBackorderOption(),
				Transaction_Constants.SAP);
		if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (in.getBackorderOption() != null && in.getBackorderOption().trim().length() > 0)) {
			Error e = new Error();
			e.setErrorCategory(Transaction_Constants.BACK_ORDER_OPTION_UNEXPECTED);
			e.setErrorCode(Transaction_Constants.BACK_ORDER_OPTION_UNEXPECTED);
			e.setErrorMessage(Transaction_Constants.BACK_ORDER_OPTION_UNEXPECTED);
			headerErrorList.add(e);
		}
		salesdocheadIn.setBackorderoption(rqstLookupValue);
		salesdocheadIn.setBill_Of_Lading_Text(in.getBillOfLading());
		salesdocheadIn.setBilltoattentionline(in.getBillToAttentionLine());
		salesdocheadIn.setBilltocustomerid(in.getBillToCustomerID());
		salesdocheadIn.setContactname(in.getContactName());
		salesdocheadIn.setContactphone(in.getContactPhone());
		salesdocheadIn.setCshold(in.getCsHold());
		salesdocheadIn.setCustomeremail(in.getCustomerEmail());
		salesdocheadIn.setDeferedpaymentdate(toSqlDate(in
				.getDeferedPaymentDate()));
		rqstLookupValue = hasher.getValue(
				Transaction_Constants.DELIVERY_BLOCK,
				Transaction_Constants.ENTERPRISE, in.getDeliveryBlock(),
				Transaction_Constants.SAP);
		if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (in.getDeliveryBlock() != null && in.getDeliveryBlock().trim().length() > 0)) {
			Error e = new Error();
			e.setErrorCategory(Transaction_Constants.DELIVERY_BLOCK_UNEXPECTED);
			e.setErrorCode(Transaction_Constants.DELIVERY_BLOCK_UNEXPECTED);
			e.setErrorMessage(Transaction_Constants.DELIVERY_BLOCK_UNEXPECTED);
			headerErrorList.add(e);
		}
		salesdocheadIn.setDeliveryblock(rqstLookupValue);
		salesdocheadIn.setDock_Instruct_Text(in.getDockInstructions());
		rqstLookupValue = hasher.getValue(
				Transaction_Constants.DIVISION,
				Transaction_Constants.ENTERPRISE, in.getEntryDivision(),
				Transaction_Constants.SAP);
		if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (in.getEntryDivision() != null && in.getEntryDivision().trim().length() > 0)) {
			Error e = new Error();
			e.setErrorCategory(Transaction_Constants.DIVISION_CODE_UNEXPECTED);
			e.setErrorCode(Transaction_Constants.DIVISION_CODE_UNEXPECTED);
			e.setErrorMessage(Transaction_Constants.DIVISION_CODE_UNEXPECTED);
			headerErrorList.add(e);
		}
		salesdocheadIn.setEntrydivision(rqstLookupValue);
		salesdocheadIn.setFaxurl(in.getFaxURL());
		if (in.getForceDeliveredPricing() != null
				&& in.getForceDeliveredPricing().equalsIgnoreCase(Transaction_Constants.ALWAYS)) {
			salesdocheadIn.setForce_Delv_Price(Transaction_Constants.Y);
		} else if (in.getForceDeliveredPricing() != null
				&& in.getForceDeliveredPricing().equalsIgnoreCase(Transaction_Constants.NEVER)) {
			salesdocheadIn.setForce_Delv_Price(Transaction_Constants.N);
		}

		// salesdocheadIn.setHandlingterms(in.get)
		salesdocheadIn.setMessage(in.getFreeformMessage());
		salesdocheadIn.setMust_Arrive_By_Date(toSqlDate(in
				.getMustArriveByDate()));
		rqstLookupValue = hasher.getValue(
				Transaction_Constants.ARRIVE_BY_REASON,
				Transaction_Constants.ENTERPRISE, in.getMustArriveByReason(),
				Transaction_Constants.SAP);
		if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (in.getMustArriveByReason() != null && in.getMustArriveByReason().trim().length() > 0)) {
			Error e = new Error();
			e.setErrorCategory(Transaction_Constants.ARRIVE_BY_REASON_UNEXPECTED);
			e.setErrorCode(Transaction_Constants.ARRIVE_BY_REASON_UNEXPECTED);
			e.setErrorMessage(Transaction_Constants.ARRIVE_BY_REASON_UNEXPECTED);
			headerErrorList.add(e);
		}
		salesdocheadIn.setMust_Arrive_By_Reason(rqstLookupValue);
		rqstLookupValue = hasher.getValue(
				Transaction_Constants.ORDER_REASON,
				Transaction_Constants.ENTERPRISE, in.getOrderReason(),
				Transaction_Constants.SAP);
		if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (in.getOrderReason() != null && in.getOrderReason().trim().length() > 0)) {
			Error e = new Error();
			e.setErrorCategory(Transaction_Constants.ORDER_REASON_UNEXPECTED);
			e.setErrorCode(Transaction_Constants.ORDER_REASON_UNEXPECTED);
			e.setErrorMessage(Transaction_Constants.ORDER_REASON_UNEXPECTED);
			headerErrorList.add(e);
		}
		salesdocheadIn.setOrderreason(rqstLookupValue);
		rqstLookupValue = hasher.getValue(
				Transaction_Constants.ORDER_SOURCE,
				Transaction_Constants.ENTERPRISE, in.getOrderSource(),
				Transaction_Constants.SAP);
		if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (in.getOrderSource() != null && in.getOrderSource().trim().length() > 0)) {
			Error e = new Error();
			e.setErrorCategory(Transaction_Constants.ORDER_SOURCE_UNEXPECTED);
			e.setErrorCode(Transaction_Constants.ORDER_SOURCE_UNEXPECTED);
			e.setErrorMessage(Transaction_Constants.ORDER_SOURCE_UNEXPECTED);
			headerErrorList.add(e);
		}
		salesdocheadIn.setOrdersource(rqstLookupValue);
		salesdocheadIn.setPricedate(toSqlDate(in.getPriceDate()));
		salesdocheadIn.setPromotioncode(in.getPromotionCode());
		salesdocheadIn
				.setRemove_Frgt_Forw(in.isRemoveFreightForwarder() != null
						&& in.isRemoveFreightForwarder() != null ? Transaction_Constants.Y
						: Transaction_Constants.N);
		salesdocheadIn.setRequesteddate(toSqlDate(in.getRequestedDate()));
		// salesdocheadIn.setSalesrepid(in.gets)
		rqstLookupValue = hasher.getValue(
				Transaction_Constants.SHIP_DATE_OPTION,
				Transaction_Constants.ENTERPRISE, in.getShipDateOption(),
				Transaction_Constants.SAP);
		if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (in.getShipDateOption() != null && in.getShipDateOption().trim().length() > 0)) {
			Error e = new Error();
			e.setErrorCategory(Transaction_Constants.SHIP_DATE_OPTION_UNEXPECTED);
			e.setErrorCode(Transaction_Constants.SHIP_DATE_OPTION_UNEXPECTED);
			e.setErrorMessage(Transaction_Constants.SHIP_DATE_OPTION_UNEXPECTED);
			headerErrorList.add(e);
		}
		salesdocheadIn.setShipdateoption(rqstLookupValue);
		rqstLookupValue = hasher.getValue(
				Transaction_Constants.SHIPMENT_METHOD,
				Transaction_Constants.ENTERPRISE, in.getShipmentMethod(),
				Transaction_Constants.SAP);
		if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (in.getShipmentMethod() != null && in.getShipmentMethod().trim().length() > 0)) {
			Error e = new Error();
			e.setErrorCategory(Transaction_Constants.SHIPMENT_METHOD_UNEXPECTED);
			e.setErrorCode(Transaction_Constants.SHIPMENT_METHOD_UNEXPECTED);
			e.setErrorMessage(Transaction_Constants.SHIPMENT_METHOD_UNEXPECTED);
			headerErrorList.add(e);
		}
		salesdocheadIn.setShipmentmethod(rqstLookupValue);
		rqstLookupValue = hasher.getValue(
				Transaction_Constants.SHIPPING_TERMS,
				Transaction_Constants.ENTERPRISE, in.getShippingTerms(),
				Transaction_Constants.SAP);
		if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (in.getShippingTerms() != null && in.getShippingTerms().trim().length() > 0)) {
			Error e = new Error();
			e.setErrorCategory(Transaction_Constants.SHIPPING_TERMS_UNEXPECTED);
			e.setErrorCode(Transaction_Constants.SHIPPING_TERMS_UNEXPECTED);
			e.setErrorMessage(Transaction_Constants.SHIPPING_TERMS_UNEXPECTED);
			headerErrorList.add(e);
		}
		salesdocheadIn.setShippingterms(rqstLookupValue);
		salesdocheadIn.setShiptoattentionline(in.getShipToAttentionLine());
		salesdocheadIn.setShiptocustomerid(in.getShipToCustomerID());

		salesdocheadIn.setShiptopo(in.getShipToCustomerPO());

		String soldToCustomerId = in.getSoldToCustomerID();
		salesdocheadIn.setSoldtocustomerid(soldToCustomerId);
		salesdocheadIn.setUserid(in.getUserId());
		salesdocheadIn.setZcoupon_Code(in.getHeaderCouponCode());

		// additional fields for SaleHeader2
		//
		
		salesdocheadIn.setShiptodepartment(in.getToDepartment());
		salesdocheadIn.setShiptolocation(in.getShipToLocation());

		// shipTooverrideAddress
		{
			Address addr = in.getShipTooverrideAddress();
			if (addr != null) {
				salesdocheadIn.setOverride_Name1(addr.getCustomerName());
				salesdocheadIn.setOverride_Add1(addr.getAddressLine1());
				salesdocheadIn.setOverride_Add2(addr.getAddressLine2());
				salesdocheadIn.setOverride_Add3(addr.getAddressLine3());
				salesdocheadIn.setOverride_Pobox(addr.getPoBox());
				salesdocheadIn.setOverride_City(addr.getCity());
				salesdocheadIn.setOverride_State(addr.getState());
				salesdocheadIn.setOverride_Zipcode(addr.getZipcode());
				salesdocheadIn.setOverride_Countryname(addr.getCountryCode());
			}
		}
		// soldTooverrideAddress
		{
			Address addr = in.getSoldTooverrideAddress();
			if (addr != null) {
				salesdocheadIn.setOverride_Name1_Soldto(addr.getCustomerName());
				salesdocheadIn.setOverride_Add1_Soldto(addr.getAddressLine1());
				salesdocheadIn.setOverride_Add2_Soldto(addr.getAddressLine2());
				salesdocheadIn.setOverride_Add3_Soldto(addr.getAddressLine3());
				salesdocheadIn.setOverride_Pobox_Soldto(addr.getPoBox());
				salesdocheadIn.setOverride_City_Soldto(addr.getCity());
				salesdocheadIn.setOverride_State_Soldto(addr.getState());
				salesdocheadIn.setOverride_Zipcode_Soldto(addr.getZipcode());
				salesdocheadIn.setOverride_Countryname_Soldto(addr
						.getCountryCode());
			}
		}
		// billTooverrideAddress
		{
			Address addr = in.getBillTooverrideAddress();
			if (addr != null) {
				salesdocheadIn.setOverride_Name1_Billto(addr.getCustomerName());
				salesdocheadIn.setOverride_Add1_Billto(addr.getAddressLine1());
				salesdocheadIn.setOverride_Add2_Billto(addr.getAddressLine2());
				salesdocheadIn.setOverride_Add3_Billto(addr.getAddressLine3());
				salesdocheadIn.setOverride_Pobox_Billto(addr.getPoBox());
				salesdocheadIn.setOverride_City_Billto(addr.getCity());
				salesdocheadIn.setOverride_State_Billto(addr.getState());
				salesdocheadIn.setOverride_Zipcode_Billto(addr.getZipcode());
				salesdocheadIn.setOverride_Countryname_Billto(addr
						.getCountryCode());
			}
		}
		
		//CrediCard Fraud Check Added as part of a CR on 13-SEP-2012
		// payerTooverrideAddress
		{
			Address addr = in.getPayerTooverrideAddress();
			if (addr != null) {
				salesdocheadIn.setOverride_Name1_Payer(addr.getCustomerName());
				salesdocheadIn.setOverride_Add1_Payer(addr.getAddressLine1());
				salesdocheadIn.setOverride_Add2_Payer(addr.getAddressLine2());
				salesdocheadIn.setOverride_Add3_Payer(addr.getAddressLine3());
				salesdocheadIn.setOverride_Pobox_Payer(addr.getPoBox());
				salesdocheadIn.setOverride_City_Payer(addr.getCity());
				salesdocheadIn.setOverride_State_Payer(addr.getState());
				salesdocheadIn.setOverride_Zipcode_Payer(addr.getZipcode());
				salesdocheadIn.setOverride_Countryname_Payer(addr
						.getCountryCode());
			}
		}

		//CrediCard Fraud Check Added as part of a CR on 13-SEP-2012
		salesdocheadIn.setPayercustomerid(in.getPayerCustomerID());
		
		return salesdocheadIn;
	}

	private Zvgetsales_LType[] makeSubmitSaleItems(
			SaleLineItemList inSaleLineItemType, List<LineItemError> lineItemErrorList) {
		// SaleLineItemList inSaleLineItemType =
		// submitSaleRequest.getSaleLineItemList();
		List<SaleLineItem> inSaleLineItemList = inSaleLineItemType
				.getSaleLineItem();
		Zvgetsales_LType[] salesdocdetailIn = new Zvgetsales_LType[inSaleLineItemList
				.size()];

		int count = 0;
		if (inSaleLineItemList != null) {
			String rqstLookupValue = null;
			for (SaleLineItem in : inSaleLineItemList) {
				if (in == null)
					continue;
				salesdocdetailIn[count] = new Zvgetsales_LType();
				salesdocdetailIn[count].setGrade_Level(in.getGrade());
				// salesdocdetailIn[count].setIsbn(inSale.get)
				// if (in.getItemType())
				rqstLookupValue = hasher.getValue(
						Transaction_Constants.ITEM_TYPE,
						Transaction_Constants.ENTERPRISE, in.getItemType(),
						Transaction_Constants.SAP);
				if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (in.getItemType() != null && in.getItemType().trim().length() > 0)) {
					LineItemError e = new LineItemError(); 
					e.setErrorCategory(Transaction_Constants.ITEM_TYPE_UNEXPECTED);
					e.setErrorCode(Transaction_Constants.ITEM_TYPE_UNEXPECTED);
					e.setErrorMessage(Transaction_Constants.ITEM_TYPE_UNEXPECTED);
					lineItemErrorList.add(e);
				}
				salesdocdetailIn[count].setItem_Type(rqstLookupValue);
				// SAP needs NUMC - Character string with only digits (num char
				// - 6, decimal place - 0)
				// salesdocdetailIn[count].setItemno(Double.toString(in.getLineNo()));
				salesdocdetailIn[count].setItemno(Integer.toString((int) in
						.getLineNo()));
				salesdocdetailIn[count].setMaterialid(in.getMaterialID());
				salesdocdetailIn[count].setOverride_Ship(in
						.getOverrideShipping());
				salesdocdetailIn[count]
						.setQty(new BigDecimal(in.getQuantity()));
				SubscriptionTerm subTerm = in.getSubscriptionTerm();

				if (subTerm != null) {
					salesdocdetailIn[count].setSub_Str_Qty(subTerm
							.getDuration() != null ? subTerm.getDuration()
							.toString() : Transaction_Constants.EMPTY);
					salesdocdetailIn[count]
							.setSub_Str_Start_Date(toSqlDate(subTerm
									.getStartDate()));
					rqstLookupValue = hasher.getValue(
							Transaction_Constants.SUBSCRIPTION_TERM,
							Transaction_Constants.ENTERPRISE,
							subTerm.getUnit(), Transaction_Constants.SAP);
					if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (subTerm.getUnit() != null && subTerm.getUnit().trim().length() > 0)) {
						LineItemError e = new LineItemError();
						e.setErrorCategory(Transaction_Constants.SUBSCRIPTION_TERM_UNIT_UNEXPECTED);
						e.setErrorCode(Transaction_Constants.SUBSCRIPTION_TERM_UNIT_UNEXPECTED);
						e.setErrorMessage(Transaction_Constants.SUBSCRIPTION_TERM_UNIT_UNEXPECTED);
						lineItemErrorList.add(e);
					}
					salesdocdetailIn[count].setSub_Str_Unit(rqstLookupValue);
				}

				salesdocdetailIn[count].setZcoupon_Code(in.getLineCouponCode());
				/**
				 * start - added as part of cr 2169
				 */
				salesdocdetailIn[count].setCon_St_Date(toSqlDate(in.getContractEndDate()));
				salesdocdetailIn[count].setCon_End_Date(toSqlDate(in.getContractEndDate()));
				/**
				 * end
				 */
				count++;
			}
		}
		return salesdocdetailIn;
	}

	private SubmitSaleResponse makeSubmitSaleResponse(Zvgetsales_HeType hIn,
			Zvgetsales_LeType[] lIn) throws DatatypeConfigurationException {
		SubmitSaleResponse response = new SubmitSaleResponse();

		SubmitSaleResponse.Header header = makeSubmitSaleHeaderResponse(hIn);
		response.setHeader(header);

		List<SubmitSaleResponse.LineItem> lineItemList = response.getLineItem();
		makeSubmitSaleItemResponse(lIn, lineItemList);

		return response;
	}

	private SubmitSaleResponse2 makeSubmitSaleResponse2(Zvgetsales_HeType hIn,
			Zvgetsales_LeType[] lIn) throws DatatypeConfigurationException {
		SubmitSaleResponse2 response = new SubmitSaleResponse2();

		SubmitSaleResponse2.Header2 header = makeSubmitSaleHeader2Response(hIn);
		response.setHeader2(header);

		List<SubmitSaleResponse2.LineItem> lineItemList = response
				.getLineItem();
		makeSubmitSaleItem2Response(lIn, lineItemList);

		return response;
	}

	private SubmitSaleResponse.Header makeSubmitSaleHeaderResponse(
			Zvgetsales_HeType hIn) throws DatatypeConfigurationException {
		SubmitSaleResponse.Header header = new SubmitSaleResponse.Header();
		logger.debug("Order SubTotal " + hIn.getOrdersubtotal());
		logger.debug("Tax Amount " + hIn.getTaxamount());
		header.setTransactionID(hIn.getClienttransactionid());
		header.setDeliveredPricing(hIn.getDeliveredpricingcode() != null
				&& hIn.getDeliveredpricingcode().equalsIgnoreCase(
						Transaction_Constants.Y));
		header.setOrderSubTotal(hIn.getOrdersubtotal() != null ? hIn
				.getOrdersubtotal().doubleValue() : 0.0);
		header.setSaleDate(toXMLGregorianCalendar(hIn.getSaledate()));
		header.setTaxAmount(hIn.getTaxamount() != null ? hIn.getTaxamount()
				.doubleValue() : 0.0);
		header.setShippingAmount(hIn.getShippingamount() != null ? hIn
				.getShippingamount().doubleValue() : 0.0);
		header.setSaleTotal(hIn.getSaletotal() != null ? hIn.getSaletotal()
				.doubleValue() : 0.0);

		return header;
	}

	private SubmitSaleResponse2.Header2 makeSubmitSaleHeader2Response(
			Zvgetsales_HeType hIn) throws DatatypeConfigurationException {
		SubmitSaleResponse2.Header2 header = new SubmitSaleResponse2.Header2();
		header.setTransactionID(hIn.getClienttransactionid());
		header.setDeliveredPricing(hIn.getDeliveredpricingcode() != null
				&& hIn.getDeliveredpricingcode().equalsIgnoreCase(
						Transaction_Constants.Y));
		header.setOrderSubTotal(hIn.getOrdersubtotal() != null ? hIn
				.getOrdersubtotal().doubleValue() : 0.0);
		header.setSaleDate(toXMLGregorianCalendar(hIn.getSaledate()));
		header.setTaxAmount(hIn.getTaxamount() != null ? hIn.getTaxamount()
				.doubleValue() : 0.0);
		header.setShippingAmount(hIn.getShippingamount() != null ? hIn
				.getShippingamount().doubleValue() : 0.0);
		header.setSaleTotal(hIn.getSaletotal() != null ? hIn.getSaletotal()
				.doubleValue() : 0.0);

		// extra Header2 fields
		header.setCcPreauth(hIn.getCreditcard_Preauth());
		header.setCcResponse(hIn.getCreditcard_Response());
		header.setCcResult(hIn.getCreditcard_Result());
		header.setCcCVVResult(hIn.getCreditcard_Cvv_Result());
		header.setCcAddResult(hIn.getCreditcard_Add_Result());

		return header;
	}

	private void makeSubmitSaleItemResponse(Zvgetsales_LeType[] lIn,
			List<SubmitSaleResponse.LineItem> lineItemList)
			throws DatatypeConfigurationException {
		if (lIn != null) {
			for (Zvgetsales_LeType in : lIn) {
				if (in == null)
					continue;
				SubmitSaleResponse.LineItem item = new SubmitSaleResponse.LineItem();
				item.setLineNo(in.getLine_No() != null ? Integer.parseInt(in
						.getLine_No()) : 0);
				item.setMaterialID(in.getMaterialid());
				item.setQuantity(in.getQuantity() != null ? in.getQuantity()
						.intValue() : 0);
				item.setListPrice(in.getListprice() != null ? in.getListprice()
						.doubleValue() : 0.0);
				item.setNetPrice(in.getNetprice() != null ? in.getNetprice()
						.doubleValue() : 0.0);
				item.setDiscountPercent(in.getDiscountpercent() != null ? in
						.getDiscountpercent().doubleValue() : 0.0);
				item.setSubstituted(in.getSubstituted() != null
						&& in.getSubstituted().equalsIgnoreCase(
								Transaction_Constants.Y));
				item.setCouponCode(in.getZcoupon_Code());
				item.setContractPriceIndicator(in.getCon_Price_Ind() != null
						&& in.getCon_Price_Ind().equalsIgnoreCase(
								Transaction_Constants.X));
				item.setDiscountAmount(in.getDisc_Amt() != null ? in
						.getDisc_Amt().doubleValue() : 0.0);
				item.setPromoAmount(in.getPromo_Amt() != null ? in
						.getPromo_Amt().doubleValue() : 0.0);
				item.setFreeGoodsIndicator(in.getFree_Indicator() != null
						&& in.getFree_Indicator().equalsIgnoreCase(
								Transaction_Constants.X));
				item.setDeliveredPriceIndicator(in.getDelv_Price_Ind() != null
						&& in.getDelv_Price_Ind().equals(
								Transaction_Constants.X));

				List<DeliveryInfo> delInfoList = item.getDeliveryInfo();
				List<SubscriptionTerm> subTermList = item.getSubscriptionTerm();

				if (in.getConfir_Qty().doubleValue() != 0.0) {
					DeliveryInfo delInfo = new DeliveryInfo();
					delInfo.setProjectedShippingDate(toXMLGregorianCalendar(in
							.getDeliverydate()));
					delInfo.setProjectedShippingQuantity(in.getConfir_Qty()
							.intValue());
					delInfoList.add(delInfo);

					SubscriptionTerm term = new SubscriptionTerm();
					term.setDuration(in.getTime_Duration() != null
							&& in.getTime_Duration().length() > 0 ? Integer
							.parseInt(in.getTime_Duration()) : 0);
					if (in.getTime_Unit() != null) {
						if (in.getTime_Unit().equalsIgnoreCase(Transaction_Constants.YEAR)) {
							term.setUnit(Transaction_Constants.SUBSCRIPTION_TERM_UNIT_YEAR);
						} else if (in.getTime_Unit().equalsIgnoreCase(Transaction_Constants.MONTH)) {
							term.setUnit(Transaction_Constants.SUBSCRIPTION_TERM_UNIT_MONTH);
						} else if (in.getTime_Unit().equalsIgnoreCase(Transaction_Constants.WEEK)) {
							term.setUnit(Transaction_Constants.SUBSCRIPTION_TERM_UNIT_WEEK);
						} else if (in.getTime_Unit().equalsIgnoreCase(Transaction_Constants.DAY)) {
							term.setUnit(Transaction_Constants.SUBSCRIPTION_TERM_UNIT_DAY);
						}
					}
					term.setRate(in.getSubscr_Rate() != null ? in
							.getSubscr_Rate().doubleValue() : 0.0);
					term.setStartDate(toXMLGregorianCalendar(in
							.getContract_Start()));
					term.setEndDate(toXMLGregorianCalendar(in.getContract_End()));
					subTermList.add(term);
				}

				lineItemList.add(item);
			}

		}
	}

	private void makeSubmitSaleItem2Response(Zvgetsales_LeType[] lIn,
			List<SubmitSaleResponse2.LineItem> lineItemList)
			throws DatatypeConfigurationException {
		if (lIn != null) {

			HashMap<String, Zvgetsales_LeType> itemMap = new HashMap<String, Zvgetsales_LeType>();
			HashMap<String, DeliveryInfo> delInfoMap = new HashMap<String, DeliveryInfo>();
			for (int i = 0; i < lIn.length; ++i) {
				itemMap.put(lIn[i].getLine_No(), lIn[i]);
				if (lIn[i].getConfir_Qty().doubleValue() != 0.0) {
					DeliveryInfo delInfo = new DeliveryInfo();
					delInfo.setProjectedShippingDate(toXMLGregorianCalendar(lIn[i]
							.getDeliverydate()));
					delInfo.setProjectedShippingQuantity(lIn[i].getConfir_Qty()
							.intValue());
					delInfoMap.put(lIn[i].getLine_No(), delInfo);
				}
			}

			for (Iterator<String> it = itemMap.keySet().iterator(); it
					.hasNext();) {
				String lineNo = it.next();
				Zvgetsales_LeType in = itemMap.get(lineNo);
				if (in == null)
					continue;
				SubmitSaleResponse2.LineItem item = new SubmitSaleResponse2.LineItem();
				item.setLineNo(in.getLine_No() != null ? Integer.parseInt(in
						.getLine_No()) : 0);
				item.setMaterialID(in.getMaterialid());
				item.setQuantity(in.getQuantity() != null ? in.getQuantity()
						.intValue() : 0);
				item.setListPrice(in.getListprice() != null ? in.getListprice()
						.doubleValue() : 0.0);
				item.setNetPrice(in.getNetprice() != null ? in.getNetprice()
						.doubleValue() : 0.0);
				item.setDiscountPercent(in.getDiscountpercent() != null ? in
						.getDiscountpercent().doubleValue() : 0.0);
				item.setSubstituted(in.getSubstituted() != null
						&& in.getSubstituted().equalsIgnoreCase(
								Transaction_Constants.Y));
				item.setCouponCode(in.getZcoupon_Code());
				item.setContractPriceIndicator(in.getCon_Price_Ind() != null
						&& in.getCon_Price_Ind().equalsIgnoreCase(
								Transaction_Constants.X));
				item.setDiscountAmount(in.getDisc_Amt() != null ? in
						.getDisc_Amt().doubleValue() : 0.0);
				item.setPromoAmount(in.getPromo_Amt() != null ? in
						.getPromo_Amt().doubleValue() : 0.0);
				item.setFreeGoodsIndicator(in.getFree_Indicator() != null
						&& in.getFree_Indicator().equalsIgnoreCase(
								Transaction_Constants.X));
				item.setDeliveredPriceIndicator(in.getDelv_Price_Ind() != null
						&& in.getDelv_Price_Ind().equals(
								Transaction_Constants.X));
				
				/**
				 * start - added as part of CR-2192
				 */
				//item.setPromoFreightAmount(in.getPromo_Fr_Amt() != null ? in.getPromo_Fr_Amt().doubleValue() : 0.0);
				//item.setShipAmount(in.getShip_Amt() != null ? in.getShip_Amt().doubleValue() : 0.0);
				/**
				 * end
				 */
				List<DeliveryInfo> delInfoList = item.getDeliveryInfo();
				List<SubscriptionTerm> subTermList = item.getSubscriptionTerm();

				if (in.getConfir_Qty().doubleValue() != 0.0) {
					DeliveryInfo delInfo = delInfoMap.get(in.getLine_No());

					/*
					 * delInfo.setProjectedShippingDate(toXMLGregorianCalendar(in
					 * .getDeliverydate()));
					 * delInfo.setProjectedShippingQuantity
					 * (in.getConfir_Qty().intValue());
					 */
					delInfoList.add(delInfo);

					SubscriptionTerm term = new SubscriptionTerm();
					term.setDuration(in.getTime_Duration() != null
							&& in.getTime_Duration().length() > 0 ? Integer
							.parseInt(in.getTime_Duration()) : 0);
					if (in.getTime_Unit() != null) {
						if (in.getTime_Unit().equalsIgnoreCase(Transaction_Constants.YEAR)) {
							term.setUnit(Transaction_Constants.SUBSCRIPTION_TERM_UNIT_YEAR);
						} else if (in.getTime_Unit().equalsIgnoreCase(Transaction_Constants.MONTH)) {
							term.setUnit(Transaction_Constants.SUBSCRIPTION_TERM_UNIT_MONTH);
						} else if (in.getTime_Unit().equalsIgnoreCase(Transaction_Constants.WEEK)) {
							term.setUnit(Transaction_Constants.SUBSCRIPTION_TERM_UNIT_WEEK);
						} else if (in.getTime_Unit().equalsIgnoreCase(Transaction_Constants.DAY)) {
							term.setUnit(Transaction_Constants.SUBSCRIPTION_TERM_UNIT_DAY);
						}
					}
					term.setRate(in.getSubscr_Rate() != null ? in
							.getSubscr_Rate().doubleValue() : 0.0);
					term.setStartDate(toXMLGregorianCalendar(in
							.getContract_Start()));
					term.setEndDate(toXMLGregorianCalendar(in.getContract_End()));
					subTermList.add(term);
				}

				lineItemList.add(item);
			}

		}
	}

	private SubmitSampleResponse makeSubmitSampleResponse(
			Zvgetsales_HeType hIn, Zvgetsales_LeType[] lIn) throws Exception {
		SubmitSampleResponse response = new SubmitSampleResponse();
		// Header header = response.getHeader();
		com.hmco.eai.ots.order.SubmitSampleResponse.Header header = new com.hmco.eai.ots.order.SubmitSampleResponse.Header();
		header.setTransactionID(hIn.getClienttransactionid());
		header.setDeliveredPricing(hIn.getDeliveredpricingcode() != null
				&& hIn.getDeliveredpricingcode().equalsIgnoreCase(
						Transaction_Constants.Y));
		header.setOrderSubTotal(hIn.getOrdersubtotal() != null ? hIn
				.getOrdersubtotal().doubleValue() : 0.0);
		header.setSaleDate(toXMLGregorianCalendar(hIn.getSaledate()));
		header.setTaxAmount(hIn.getTaxamount() != null ? hIn.getTaxamount()
				.doubleValue() : 0.0);
		header.setShippingAmount(hIn.getShippingamount() != null ? hIn
				.getShippingamount().doubleValue() : 0.0);
		header.setSaleTotal(hIn.getSaletotal() != null ? hIn.getSaletotal()
				.doubleValue() : 0.0);

		response.setHeader(header);

		List<com.hmco.eai.ots.order.SubmitSampleResponse.LineItem> lineItemList = response
				.getLineItem();

		if (lIn != null) {
			HashMap<String, Zvgetsales_LeType> itemMap = new HashMap<String, Zvgetsales_LeType>();
			for (int i = 0; i < lIn.length; ++i)
				itemMap.put(lIn[i].getLine_No(), lIn[i]);

			for (Iterator<String> it = itemMap.keySet().iterator(); it
					.hasNext();) {

				String lineNo = it.next();
				Zvgetsales_LeType in = itemMap.get(lineNo);

				if (in == null)
					continue;
				com.hmco.eai.ots.order.SubmitSampleResponse.LineItem item = new com.hmco.eai.ots.order.SubmitSampleResponse.LineItem();
				item.setLineNo(in.getLine_No());
				item.setMaterialID(in.getMaterialid());
				item.setQuantity(in.getQuantity() != null ? in.getQuantity()
						.doubleValue() : 0);
				item.setListPrice(in.getListprice() != null ? in.getListprice()
						.doubleValue() : 0.0);
				item.setNetPrice(in.getNetprice() != null ? in.getNetprice()
						.doubleValue() : 0.0);
				item.setDiscountPercent(in.getDiscountpercent() != null ? in
						.getDiscountpercent().doubleValue() : 0.0);
				item.setSubstituted(in.getSubstituted() != null
						&& in.getSubstituted().equalsIgnoreCase(
								Transaction_Constants.Y));
				item.setCouponCode(in.getZcoupon_Code());
				item.setContractPriceIndicator(in.getCon_Price_Ind() != null
						&& in.getCon_Price_Ind().equalsIgnoreCase(
								Transaction_Constants.X));
				item.setDiscountAmount(in.getDisc_Amt() != null ? in
						.getDisc_Amt().doubleValue() : 0.0);
				item.setPromoAmount(in.getPromo_Amt() != null ? in
						.getPromo_Amt().doubleValue() : 0.0);
				item.setFreeGoodsIndicator(in.getFree_Indicator() != null
						&& in.getFree_Indicator().equalsIgnoreCase(
								Transaction_Constants.X));
				item.setDeliveredPriceIndicator(in.getDelv_Price_Ind() != null
						&& in.getDelv_Price_Ind().equals(
								Transaction_Constants.X));

				List<DeliveryInfo> delInfoList = item.getDeliveryInfo();
				List<SubscriptionTerm> subTermList = item.getSubscriptionTerm();

				if (in.getConfir_Qty().doubleValue() > 0.0) {
					DeliveryInfo delInfo = new DeliveryInfo();
					delInfo.setProjectedShippingDate(toXMLGregorianCalendar(in
							.getDeliverydate()));
					delInfo.setProjectedShippingQuantity(in.getConfir_Qty()
							.intValue());
					delInfoList.add(delInfo);

					SubscriptionTerm term = new SubscriptionTerm();
					term.setDuration(in.getTime_Duration() != null
							&& in.getTime_Duration().length() > 0 ? Integer
							.parseInt(in.getTime_Duration()) : 0);
					if (in.getTime_Unit() != null) {
						if (in.getTime_Unit().equalsIgnoreCase(Transaction_Constants.YEAR)) {
							term.setUnit(Transaction_Constants.SUBSCRIPTION_TERM_UNIT_YEAR);
						} else if (in.getTime_Unit().equalsIgnoreCase(Transaction_Constants.MONTH)) {
							term.setUnit(Transaction_Constants.SUBSCRIPTION_TERM_UNIT_MONTH);
						} else if (in.getTime_Unit().equalsIgnoreCase(Transaction_Constants.WEEK)) {
							term.setUnit(Transaction_Constants.SUBSCRIPTION_TERM_UNIT_WEEK);
						} else if (in.getTime_Unit().equalsIgnoreCase(Transaction_Constants.DAY)) {
							term.setUnit(Transaction_Constants.SUBSCRIPTION_TERM_UNIT_DAY);
						}
					}
					term.setRate(in.getSubscr_Rate() != null ? in
							.getSubscr_Rate().doubleValue() : 0.0);
					term.setStartDate(toXMLGregorianCalendar(in
							.getContract_Start()));
					term.setEndDate(toXMLGregorianCalendar(in.getContract_End()));
					subTermList.add(term);
				}

				lineItemList.add(item);
			}
		}
		return response;
	}

	public OrderSimulateResponse orderSimulate(OrderSimulateRequest req) throws ErrorException {
		logger.debug("orderSimulate begin");
		/*
		 * Added to Handle Line Number in Simulate Order
		 */
		int lineNo = 0;
		
		long enterTime = System.currentTimeMillis();
		long requestTime = 0;
		long responseTime = 0;
		OrderSimulateResponse response = new OrderSimulateResponse();
		List<hmh.rs.pojo.Error> errorList = response.getErrorList();
		EAI_Log log = EAI_Log.enter(req.getSoldToCustomerId(), ORDER_SIMULATE,
				EAI_Log.SYS_WebService, EAI_Log.SYS_SAP);
		producer.sendBody(log.clone());
		try {
			if( req != null ) {
				
				BapiparnrType_List sales_PartnersList = new BapiparnrType_List();
				Bapiaddr1Type_List partnerAddList = new Bapiaddr1Type_List();
				Bapisdhd1Type saleHeaderIn = new Bapisdhd1Type();
				Bapisdhd1XType saleHeaderInX = new Bapisdhd1XType();
				BapicondType_List saleCondList = new BapicondType_List();
				BapicondxType_List saleCondXList = new BapicondxType_List();
				BapisditmType_List saleLineItemList = new BapisditmType_List();
				BapischdlType_List saleScheduleInList = new BapischdlType_List();
				BapicucfgType_List saleCfgsRefList = new BapicucfgType_List(); 
				BapicuvalType_List saleCfgsValueList = new BapicuvalType_List(); 
				BapictrType_List saleContractInList = new BapictrType_List();
				BapiparexType_List extensionList = new BapiparexType_List();

				makeSales_PartnerLists(req.getBillToAddress(), req.getShipToAddress(), req.getSoldToAddress(), req.getPayerAddress(), req.getBillToCustomerId(),
							req.getShipToCustomerId(), req.getSoldToCustomerId(), req.getPayerCustomerId(), sales_PartnersList, partnerAddList);
				makeSaleHeaders(req.getEntryDivision(), req.getPoNumber(), req.getOrderSource(), req.getTransactionType(), saleHeaderIn, saleHeaderInX, errorList);
				
				makeExtensionList(req.getShipmentMethod(),  req.getCouponCode(), extensionList, errorList);
				
				makeSaleConditions(req.getOverrideShipping(), saleCondList, saleCondXList);
				makeSaleLineItems(req.getSaleLineItemList(), saleLineItemList, saleScheduleInList, 
						saleCfgsRefList, saleCfgsValueList, saleContractInList, saleCondList, saleCondXList);
				
				
				Holder<BapisditType[]> isdList = new Holder<BapisditType[]>();
				Holder<Bapiret2Type[]> returnList = new Holder<Bapiret2Type[]>();
				
				/*
				 * Added to Handle Line Number in Simulate Order
				 */
				Holder<BapisdkeyType[]> salesKeyList = new Holder<BapisdkeyType[]>();
				
				if(errorList != null && errorList.size() > 0) {
					return response;
				}

				log.toRequest();
				producer.sendBody(log.clone());
				requestTime = System.currentTimeMillis();
				
				bean.orderSimulate(Transaction_Constants.X,sales_PartnersList, partnerAddList, saleHeaderIn, saleHeaderInX, extensionList, saleCondList, 
						saleCondXList, saleLineItemList, saleScheduleInList, saleCfgsRefList, saleCfgsValueList, saleContractInList
						, isdList, salesKeyList, returnList, null);
				
				responseTime = System.currentTimeMillis();
				log.toResponse();
				producer.sendBody(log.clone());
				
				logger.debug("SAP time was " + (responseTime - requestTime)
						+ " ms.");
				
				//prepare response
				BapisditType[] lineItemList = isdList.value;
				List<hmh.rs.pojo.SaleLineItem> respItemList = response.getSaleLineItemList();
				
				/*
				 * Added to Handle Line Number in Simulate Order
				 */
				BapisdkeyType[] returnSalesKeyList = salesKeyList.value;
				
				if(lineItemList != null && lineItemList.length > 0) 
				{
					//response.setShippingAmount(lineItemList[0].getSubtot_Pp3() != null ? lineItemList[0].getSubtot_Pp3() : new BigDecimal(0));
					//response.setTaxAmount(lineItemList[0].getTax_Amount() != null ? lineItemList[0].getTax_Amount() : new BigDecimal(0));
					
					for (BapisditType inItem : lineItemList) 
					{						
						// sum goes to header
						BigDecimal shipAmount = response.getShippingAmount() != null 
												? response.getShippingAmount() 
												: new BigDecimal(0);
												
						BigDecimal taxAmount = response.getTaxAmount() != null 
												? response.getTaxAmount() 
												: new BigDecimal(0);
												
						response.setShippingAmount(shipAmount.add(inItem.getSubtot_Pp3()));
						response.setTaxAmount(taxAmount.add(inItem.getTax_Amount()));
						
						hmh.rs.pojo.SaleLineItem outItem = new hmh.rs.pojo.SaleLineItem();
						
						/*
						 * Changed to Handle Line Number in Simulate Order
						 */
						//outItem.setLineNo(inItem.getItm_Number());
						outItem.setHigherLevelItemNo(inItem.getHg_Lv_Item());
						
						int val = Integer.parseInt(inItem.getHg_Lv_Item());
						if(val > 0){
							outItem.setLineNo( "000000"  );
						}else{
							++lineNo;
							String strLineNo = getStringLineNumber(lineNo);
							String correctLineItemNumber = getCorrectLineNo(strLineNo, returnSalesKeyList);
							outItem.setLineNo( correctLineItemNumber  );
						}
						
						outItem.setBackOfficeLineNo(inItem.getItm_Number());
						
						outItem.setMaterialID(inItem.getMaterial());
						outItem.setNetPrice(inItem.getSubtot_Pp2() != null ? inItem.getSubtot_Pp2() : new BigDecimal(0));
						outItem.setQuantity(inItem.getReq_Qty() != null ? inItem.getReq_Qty().longValue() : 0);
						outItem.setSubstituted(inItem.getSubstreaso() != null && inItem.getSubstreaso().trim().length() > 0 ? true : false);
						outItem.setFreeGoodsIndicator(inItem.getItm_Type_Usage() != null && inItem.getItm_Type_Usage().trim().length() > 0 ? true : false);
						respItemList.add(outItem);
					}
				}
				
				// error processing
				if (returnList != null && returnList.value != null ) {
					for (Bapiret2Type bapiRet : returnList.value) {
						
						String type = bapiRet.getType();
						String code = bapiRet.getId() + bapiRet.getNumber();
						String msg = bapiRet.getMessage();
						
						if ( type.length() > 0 && (type.equalsIgnoreCase(Transaction_Constants.E) || type.equalsIgnoreCase(Transaction_Constants.A)) ) {
							hmh.rs.pojo.Error e = new hmh.rs.pojo.Error();
							e.setErrorCategory(EnterpriseConstants.ERROR_CATEGORY_BUSINESS);
							e.setErrorCode(code);
							e.setErrorMessage(msg);
							e.setTargetSystemError("SAP_code: " + code + ", SAP_msg: " + msg);
							e.setItemKey(req.getPoNumber());
							errorList.add(e);
						}
					}
				}
 			}
			
		} catch (Exception ex) {
			ex.printStackTrace(System.err);
			logger.error("Exception calling orderSimulate", ex);
			requestTime = responseTime = 0;

			StringWriter stackTrace = new StringWriter();
			ex.printStackTrace(new PrintWriter(stackTrace));
			stackTrace.flush();
			log.toException(req.getSoldToCustomerId(), ex.getMessage(), EAI_Log.EXEPTION_SYSTEM, stackTrace.toString());			
			producer.sendBody(log.clone());
			throw new hmh.rs.pojo.ErrorException(ex.getMessage());

		} finally {
			long exitTime = System.currentTimeMillis();
			logger.debug("servicemix time was "
					+ ((exitTime - enterTime) - (responseTime - requestTime))
					+ " ms.");
			logger.debug("execution time was " + (exitTime - enterTime)
					+ " ms.");
			logger.debug("orderSimulate ends");

		}
		return response;
	}
	
	/**
	 * Added to Handle Line Number in Simulate Order
	 * 
	 * Line Item numbers are not  required by the calling system(Ex: ecommerce) but apache will be required 
	 * to populate line numbers for this RFC to relate the main line item table with other line item level 
	 * tables like schedule line table/conditions table but since we are setting INT_NUMBER_ASSIGNMENT = 'X', 
	 * SAP will change the line item numbers if there is a BOM(kit) or a free good added due to a coupon code.    
	 * We will be using index in SALES_KEYS table to connect input and output line items. This way the calling 
	 * system does not have to worry about line item numbers when sending BOMs which can explode into multiple 
	 * child components in SAP. 
	 * 
	 * Example: If the order from ecommerce has 2 line items and first line item is a kit with 3 components. 
	 * Apache will have to make the RFC call with Line item numbers 10 and 20 and does not have to know line item 
	 * 10 is a kit. SAP will create the order and line item 10 will use line 20, 30 and 40 for its components. 
	 * The 2nd line item(intially line item 20) will now pick line item 50. Now Apache can link this back to the 
	 * first and 2nd line items that ecommerce sent, through the use of the SALES_KEYS table. Line item(ITM_NUMBER) 
	 * number for 2nd line can by found by looking up table SALES_KEY with TINDEX = '000002' AND REFOBJECT = 'ITEM'.
	 * 
	 * @param req
	 * @return
	 * @throws ErrorException
	 */
	private String getCorrectLineNo(String lineNumber, BapisdkeyType[] returnSalesKeyList)
	{
		String tIndex = "";
		String refObject = "";
		String itemNumber = "000000";
		
		if(returnSalesKeyList != null && returnSalesKeyList.length > 0) 
		{
			for(BapisdkeyType salesKey : returnSalesKeyList)
			{
				refObject = (salesKey.getRefobject() != null)
						? salesKey.getRefobject()
						: "";
				tIndex = salesKey.getTindex() != null
						? salesKey.getTindex()
						: "";
						
				if(tIndex.equalsIgnoreCase(lineNumber)
						   && refObject.equalsIgnoreCase(Transaction_Constants.SALES_KEY_REFOBJECT_ITEM))
				{
					itemNumber = salesKey.getItm_Number();
					break;
				}
			}//End of For Loop
		}//End of if Block
		
		return itemNumber;
	}
	
	
	/**
	 * Added to Handle Line Number in Simulate Order
	 * 
	 * @param lineNo
	 * @return
	 */
	private String getStringLineNumber(int lineNo)
	{
		String strLineNo = Transaction_Constants.LEADING_ZEROES_5+lineNo;
		
		//always the length of the line item will be 6 digits
		return strLineNo.substring(strLineNo.length() - 6);
	}
	
	public OrderSubmitResponse orderSubmit(OrderSubmitRequest req) throws ErrorException {
		logger.debug("orderSubmit begin");
		long enterTime = System.currentTimeMillis();
		long requestTime = 0;
		long responseTime = 0;
		OrderSubmitResponse response = new OrderSubmitResponse();
		List<hmh.rs.pojo.Error> errorList = response.getErrorList();
		EAI_Log log = EAI_Log.enter(req.getSoldToCustomerId(), ORDER_SUBMIT,
				EAI_Log.SYS_WebService, EAI_Log.SYS_SAP);
		producer.sendBody(log.clone());
		try {
			if( req != null ) {
				BapiparnrType_List sales_PartnersList = new BapiparnrType_List();
				Bapiaddr1Type_List partnerAddList = new Bapiaddr1Type_List();
				Bapisdhd1Type saleHeaderIn = new Bapisdhd1Type();
				Bapisdhd1XType saleHeaderInX = new Bapisdhd1XType();
				BapicondType_List saleCondList = new BapicondType_List();
				BapicondxType_List saleCondXList = new BapicondxType_List();
				BapisditmType_List saleLineItemList = new BapisditmType_List();
				BapischdlType_List saleScheduleInList = new BapischdlType_List();
				BapicucfgType_List saleCfgsRefList = new BapicucfgType_List(); 
				BapicuvalType_List saleCfgsValueList = new BapicuvalType_List(); 
				BapictrType_List saleContractInList = new BapictrType_List();
				BapiparexType_List extensionList = new BapiparexType_List();
				BapiccardType_List ccList = new BapiccardType_List();
				
				makeSales_PartnerLists(req.getBillToAddress(), req.getShipToAddress(), req.getSoldToAddress(), req.getPayerAddress(), req.getBillToCustomerId(),
							req.getShipToCustomerId(), req.getSoldToCustomerId(), req.getPayerCustomerId(), sales_PartnersList, partnerAddList);
				makeSaleHeaders(req.getEntryDivision(), req.getPoNumber(), req.getOrderSource(), req.getTransactionType(), saleHeaderIn, saleHeaderInX, errorList);
				
				makeExtensionList(req.getShipmentMethod(),  req.getCouponCode(), extensionList, errorList);
				
				makeSaleConditions(req.getOverrideShipping(), saleCondList, saleCondXList);
				makeSaleLineItems(req.getSaleLineItemList(), saleLineItemList, saleScheduleInList, 
						saleCfgsRefList, saleCfgsValueList, saleContractInList, saleCondList, saleCondXList);
				
				Holder<BapisditType[]> isdList = new Holder<BapisditType[]>();
				Holder<Bapiret2Type[]> returnList = new Holder<Bapiret2Type[]>();
				if(errorList != null && errorList.size() > 0) {
					return response;
				}
				
				if(req.getCreditCard() != null) {
					BapiccardType ccType = new BapiccardType();
					ccType.setCc_Name(req.getCreditCard().getCcName());
					ccType.setCc_Type(req.getCreditCard().getCardType());
					ccType.setCc_Number(req.getCreditCard().getNumber());
					ccType.setCc_Valid_T(toSqlDate(req.getCreditCard().getExpDate()));
					ccList.add(ccType);
				}
				
				log.toRequest();
				producer.sendBody(log);
				requestTime = System.currentTimeMillis();
				
				String orderNumber = bean.orderSimulate(Transaction_Constants.SPACE, sales_PartnersList, partnerAddList, saleHeaderIn, saleHeaderInX, extensionList, saleCondList, 
						saleCondXList, saleLineItemList, saleScheduleInList, saleCfgsRefList, saleCfgsValueList, saleContractInList
						, isdList, null, returnList, ccList);
				
				responseTime = System.currentTimeMillis();
				log.toResponse();
				producer.sendBody(log);
				logger.debug("SAP time was " + (responseTime - requestTime)
						+ " ms.");
				//prepare response
				response.setOrderNumber(orderNumber);
				
				// error processing
				if (returnList != null && returnList.value != null ) {
					for (Bapiret2Type bapiRet : returnList.value) {
						
						String type = bapiRet.getType();
						String code = bapiRet.getId() + bapiRet.getNumber();
						String msg = bapiRet.getMessage();
						
						if ( type.length() > 0 && (type.equalsIgnoreCase(Transaction_Constants.E) || type.equalsIgnoreCase(Transaction_Constants.A)) ) {
							hmh.rs.pojo.Error e = new hmh.rs.pojo.Error();
							e.setErrorCategory(EnterpriseConstants.ERROR_CATEGORY_BUSINESS);
							e.setErrorCode(code);
							e.setErrorMessage(msg);
							e.setTargetSystemError("SAP_code: " + code + ", SAP_msg: " + msg);
							e.setItemKey(req.getPoNumber());
							errorList.add(e);
						}
					}
				}
 			}
			
		} catch (Exception ex) {
			ex.printStackTrace(System.err);
			logger.error("Exception calling orderSubmit", ex);
			requestTime = responseTime = 0;

			StringWriter stackTrace = new StringWriter();
			ex.printStackTrace(new PrintWriter(stackTrace));
			stackTrace.flush();
			log.toException(req.getSoldToCustomerId(), ex.getMessage(), EAI_Log.EXEPTION_SYSTEM, stackTrace.toString());			
			producer.sendBody(log.clone());
			throw new hmh.rs.pojo.ErrorException(ex.getMessage());

		} finally {
			long exitTime = System.currentTimeMillis();
			logger.debug("orderSubmit time was "
					+ ((exitTime - enterTime) - (responseTime - requestTime))
					+ " ms.");
			logger.debug("execution time was " + (exitTime - enterTime)
					+ " ms.");
			logger.debug("orderSubmit ends");

		}
		return response;
	}

	private void makeExtensionList(String shippingMethod, String couponCode,
			BapiparexType_List extensionList, List<hmh.rs.pojo.Error> errorList) {
		
		BapiparexType extnInVBAK = null;
		BapiparexType extnInVBAK_X = null;
		StringBuffer vbakValue = new StringBuffer(Transaction_Constants.EMPTY);
		StringBuffer vbakValue_X = new StringBuffer(Transaction_Constants.EMPTY);
		String shipmentMethod = null;
		
		if(shippingMethod != null && shippingMethod.length() > 0) {
			
			shipmentMethod = hasher.getValue(
					Transaction_Constants.SHIPMENT_METHOD,
					Transaction_Constants.ENTERPRISE, shippingMethod,
					Transaction_Constants.SAP);
			if( (shipmentMethod == null || (shipmentMethod != null && shipmentMethod.trim().length() == 0)) && (shippingMethod != null && shippingMethod.trim().length() > 0)) {
				hmh.rs.pojo.Error e = new hmh.rs.pojo.Error();
				e.setErrorCategory(Transaction_Constants.SHIPMENT_METHOD_UNEXPECTED);
				e.setErrorCode(Transaction_Constants.SHIPMENT_METHOD_UNEXPECTED);
				e.setErrorMessage(Transaction_Constants.SHIPMENT_METHOD_UNEXPECTED);
				errorList.add(e);
			}
			if(shipmentMethod != null && shipmentMethod.length() > 0) {
				extnInVBAK = new BapiparexType();
				extnInVBAK_X = new BapiparexType();
				
				extnInVBAK.setStructure(Transaction_Constants.BAPE_VBAK);
				extnInVBAK_X.setStructure(Transaction_Constants.BAPE_VBAK_X);

				//set ShippingMethod
				
				vbakValue = new StringBuffer("          " + (shipmentMethod.length() > 12 ? shipmentMethod.substring(0,12) : shipmentMethod));
				vbakValue_X = new StringBuffer("          " + Transaction_Constants.X);
				extnInVBAK.setValuepart1(vbakValue.toString());
				extnInVBAK_X.setValuepart1(vbakValue_X.toString());
			}
		}
		
		//set CouponCode
		if(couponCode != null && couponCode.length() > 0) {
			if(extnInVBAK == null && extnInVBAK_X== null) {
				extnInVBAK = new BapiparexType();
				extnInVBAK_X = new BapiparexType();
				extnInVBAK.setStructure(Transaction_Constants.BAPE_VBAK);
				extnInVBAK_X.setStructure(Transaction_Constants.BAPE_VBAK_X);
			}
			while (vbakValue != null && vbakValue.length() < 26) {
				vbakValue.append(Transaction_Constants.SPACE);
			}
			vbakValue.append(couponCode.length() > 10 ? couponCode.substring(0, 10) : couponCode);
			if(vbakValue_X != null) {
				while(vbakValue_X.length() < 13) {
					vbakValue_X.append(Transaction_Constants.SPACE);
				}
			}
			vbakValue_X.append(Transaction_Constants.X);
			extnInVBAK.setValuepart1(vbakValue.toString());
			extnInVBAK_X.setValuepart1(vbakValue_X.toString());
		}
		
		if(extnInVBAK != null && extnInVBAK_X != null) {
			extensionList.add(extnInVBAK);
			extensionList.add(extnInVBAK_X);	
		}
	}

	private void makeSaleLineItems(List<hmh.rs.pojo.SaleLineItem> list,
			BapisditmType_List bapiSaleLineItemList, BapischdlType_List bapiSaleScheduleInList, 
			BapicucfgType_List saleCfgsRefList, BapicuvalType_List saleCfgsValueList, 
			BapictrType_List saleContractInList, BapicondType_List saleCondList, BapicondxType_List saleCondXList) {
		int itmNoCount = 10;
		String subUnit = null;
		StringBuffer itemNo = new StringBuffer();
		for( hmh.rs.pojo.SaleLineItem item : list ) {
			BapisditmType bapiItem = new BapisditmType();
			itemNo.append(Transaction_Constants.LEADING_ZEROES + itmNoCount);
			bapiItem.setItm_Number(itemNo.substring(itemNo.length() - 6));
			bapiItem.setPo_Itm_No(itemNo.substring(itemNo.length() - 6));
			
			bapiItem.setMaterial(item.getMaterialID());
			bapiSaleLineItemList.add(bapiItem);
			
			BapischdlType bapischdlType = new BapischdlType();
			if(item.getQuantity() != null )
			bapischdlType.setReq_Qty(new BigDecimal(item.getQuantity()));
			bapischdlType.setItm_Number(itemNo.substring(itemNo.length() - 6));
			bapiSaleScheduleInList.add(bapischdlType);
						
			if(item.getOverrideShipping() != null /*&& org.apache.commons.lang.StringUtils.isNumeric(item.getOverrideShipping())*/) {
				BapicondType condType = new BapicondType();
				condType.setItm_Number(itemNo.substring(itemNo.length() - 6));
				condType.setCond_Type(Transaction_Constants.ZFIP);
//				if(item.getOverrideShipping() != null /*&& org.apache.commons.lang.StringUtils.isNumeric(item.getOverrideShipping())*/)
				condType.setCond_Value(new BigDecimal(item.getOverrideShipping()).divide(BigDecimal.valueOf(10)));
				saleCondList.add(condType);
				
				BapicondxType condXType = new BapicondxType();
				condXType.setItm_Number(itemNo.substring(itemNo.length() - 6));
				condXType.setCond_Type(Transaction_Constants.ZFIP);
				condXType.setCond_Value(Transaction_Constants.X);
				condXType.setUpdateflag(Transaction_Constants.X);
				saleCondXList.add(condXType);	
			}
			
			if(item.getOverrideItemPrice() != null) {
				BapicondType condPriceType = new BapicondType();
				condPriceType.setItm_Number(itemNo.substring(itemNo.length() - 6));
				condPriceType.setCond_Type(Transaction_Constants.ZOVR);
				
				//Changes to take care : SALES_CONDITIONS_IN-cond_value = (OverrideItemPrice/10) 
				//condPriceType.setCond_Value(item.getOverrideItemPrice());
				condPriceType.setCond_Value( item.getOverrideItemPrice().divide(BigDecimal.valueOf(10)) );
				
				saleCondList.add(condPriceType);
				
				BapicondxType condXPriceType = new BapicondxType();
				condXPriceType.setItm_Number(itemNo.substring(itemNo.length() - 6));
				condXPriceType.setCond_Type(Transaction_Constants.ZOVR);
				condXPriceType.setCond_Value(Transaction_Constants.X);
				condXPriceType.setUpdateflag(Transaction_Constants.X);
				saleCondXList.add(condXPriceType);	
			}
			
			
			BapicucfgType bapicfgRefType = new BapicucfgType();
			bapicfgRefType.setPosex(itemNo.substring(itemNo.length() - 6));
			bapicfgRefType.setConfig_Id(itemNo.substring(itemNo.length() - 6));
			bapicfgRefType.setRoot_Id(Transaction_Constants.ONE);
			saleCfgsRefList.add(bapicfgRefType);
			
			if(item.getSubscriptionTerm() != null) {
				BapicuvalType bapicfgValType = new BapicuvalType();
				bapicfgValType.setConfig_Id(itemNo.substring(itemNo.length() - 6));
				bapicfgValType.setInst_Id(Transaction_Constants.ONE);
				bapicfgValType.setCharc(Transaction_Constants.ZTB_QTY);
				bapicfgValType.setValue(item.getSubscriptionTerm().getDuration() != null ? item.getSubscriptionTerm().getDuration().toString() : Transaction_Constants.EMPTY);
				saleCfgsValueList.add(bapicfgValType);	
			}
			
			if(item.getSubscriptionTerm() != null) {
				BapicuvalType bapicfgValType = new BapicuvalType();
				bapicfgValType.setConfig_Id(itemNo.substring(itemNo.length() - 6));
				bapicfgValType.setInst_Id(Transaction_Constants.ONE);
				bapicfgValType.setCharc(Transaction_Constants.ZTB_UNIT);
				subUnit = item.getSubscriptionTerm().getUnit() != null ? item.getSubscriptionTerm().getUnit() : Transaction_Constants.EMPTY;
				if(subUnit != null && subUnit.length() > 0) {
					if(subUnit.equalsIgnoreCase(Transaction_Constants.SUBSCRIPTION_TERM_UNIT_DAY)) {
						bapicfgValType.setValue(Transaction_Constants.ORDER_SIMULATE_DAY);		
					} else if(subUnit.equalsIgnoreCase(Transaction_Constants.SUBSCRIPTION_TERM_UNIT_WEEK)) {
						bapicfgValType.setValue(Transaction_Constants.ORDER_SIMULATE_WK);		
					} else if(subUnit.equalsIgnoreCase(Transaction_Constants.SUBSCRIPTION_TERM_UNIT_MONTH)) {
						bapicfgValType.setValue(Transaction_Constants.ORDER_SIMULATE_MON);		
					} else if(subUnit.equalsIgnoreCase(Transaction_Constants.SUBSCRIPTION_TERM_UNIT_YEAR)) {
						bapicfgValType.setValue(Transaction_Constants.ORDER_SIMULATE_YR);		
					} 
				}
				saleCfgsValueList.add(bapicfgValType);
			}
			
			if(item.getSubscriptionTerm() != null) {
				BapictrType bapictrType = new BapictrType();
				bapictrType.setItm_Number(itemNo.substring(itemNo.length() - 6));
				if(item.getSubscriptionTerm().getStartDate() != null)
				bapictrType.setCon_St_Dat(toSqlDate(item.getSubscriptionTerm().getStartDate()));	
			}
			
			
			itmNoCount += 10;
		}
	}

	private void makeSaleConditions(String overrideShipping,
			BapicondType_List saleCondList, BapicondxType_List saleCondXList) {
		BapicondType saleCond= new BapicondType();
		BapicondxType saleCondX= new BapicondxType();
		if(overrideShipping != null && overrideShipping.trim().length() > 0) {
			saleCond.setItm_Number(Transaction_Constants.ZERO_HEADER);
			saleCond.setCond_Type(Transaction_Constants.ZAFO);
			//TODO
			if(overrideShipping != null /*&& org.apache.commons.lang.StringUtils.isNumeric(overrideShipping)*/)
			saleCond.setCond_Value(new BigDecimal(overrideShipping).divide(BigDecimal.valueOf(10)));
			
			saleCondX.setItm_Number(Transaction_Constants.ZERO_HEADER);
			saleCondX.setCond_Type(Transaction_Constants.ZAFO);
			
			saleCondX.setCond_Value(Transaction_Constants.X);
			saleCondX.setUpdateflag(Transaction_Constants.I);
			saleCondList.add(saleCond);
			saleCondXList.add(saleCondX);
		}
		logger.info("itm_number " + saleCond.getItm_Number());
		logger.info("zero header " + Transaction_Constants.ZERO_HEADER);
		for(int i=0;i<saleCondList.size();i++) {
			BapicondType cond = saleCondList.getBapicondType(i);
			logger.info("make saleconditions ITM_NUMBER ::: " + cond.getItm_Number());
		}
	}

	private void makeSaleHeaders(String entryDivision, String poNumber, String orderSource, String tranType, Bapisdhd1Type saleHeaderIn,
			Bapisdhd1XType saleHeaderInX, List<hmh.rs.pojo.Error> errorList) {
		String rqstLookupValue = null;
		if(entryDivision != null && entryDivision.trim().length() > 0) {
			saleHeaderIn.setSales_Org(Transaction_Constants.HMC1);
			saleHeaderIn.setDistr_Chan("10");
			rqstLookupValue = hasher.getValue(Transaction_Constants.DIVISION,
					Transaction_Constants.ENTERPRISE,
					entryDivision, Transaction_Constants.SAP);
			saleHeaderIn.setDivision(rqstLookupValue);
			if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (entryDivision != null && entryDivision.trim().length() > 0)) {
				hmh.rs.pojo.Error e = new hmh.rs.pojo.Error();
				e.setErrorCategory(Transaction_Constants.DIVISION_CODE_UNEXPECTED);
				e.setErrorCode(Transaction_Constants.DIVISION_CODE_UNEXPECTED);
				e.setErrorMessage(Transaction_Constants.DIVISION_CODE_UNEXPECTED);
				errorList.add(e);
			}
			saleHeaderInX.setSales_Org(Transaction_Constants.X);
			saleHeaderInX.setDistr_Chan(Transaction_Constants.X);
			saleHeaderInX.setDivision(Transaction_Constants.X);
			saleHeaderInX.setUpdateflag(Transaction_Constants.I);
		}
		
		if(poNumber != null && poNumber.trim().length() > 0) {
			saleHeaderIn.setPurch_No_C(poNumber);
			saleHeaderInX.setPurch_No_C(Transaction_Constants.X);
		}
		
		if(orderSource != null && orderSource.trim().length() > 0) {
			rqstLookupValue = hasher.getValue(Transaction_Constants.ORDER_SOURCE,
					Transaction_Constants.ENTERPRISE,
					orderSource, Transaction_Constants.SAP);
			saleHeaderIn.setPo_Method(rqstLookupValue);
			if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (orderSource != null && orderSource.trim().length() > 0)) {
				hmh.rs.pojo.Error e = new hmh.rs.pojo.Error();
				e.setErrorCategory(Transaction_Constants.ORDER_SOURCE_UNEXPECTED);
				e.setErrorCode(Transaction_Constants.ORDER_SOURCE_UNEXPECTED);
				e.setErrorMessage(Transaction_Constants.ORDER_SOURCE_UNEXPECTED);
				errorList.add(e);
			}
			saleHeaderInX.setPo_Method(Transaction_Constants.X);
		}
		
		if(tranType != null && tranType.trim().length() > 0) {
			rqstLookupValue = hasher.getValue(Transaction_Constants.TRANSACTION_TYPE,
					Transaction_Constants.ENTERPRISE,
					tranType, Transaction_Constants.SAP);
			saleHeaderIn.setDoc_Type(rqstLookupValue);
			if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (tranType != null && tranType.trim().length() > 0)) {
				hmh.rs.pojo.Error e = new hmh.rs.pojo.Error();
				e.setErrorCategory(Transaction_Constants.TRANSACTION_TYPE_UNEXPECTED);
				e.setErrorCode(Transaction_Constants.TRANSACTION_TYPE_UNEXPECTED);
				e.setErrorMessage(Transaction_Constants.TRANSACTION_TYPE_UNEXPECTED);
				errorList.add(e);
			}
			saleHeaderInX.setDoc_Type(Transaction_Constants.X);
		}		
	}

	private void makeSales_PartnerLists(hmh.rs.pojo.Address billToAddress, hmh.rs.pojo.Address shipToAddress, hmh.rs.pojo.Address soldToAddress,
			hmh.rs.pojo.Address payerAddress, String billToCustomerId, String shipToCustomerId, String soldToCustomerId, String payerCustomerId, BapiparnrType_List sales_PartnersList, Bapiaddr1Type_List partnerAddList) {
		if(soldToCustomerId != null && soldToCustomerId.trim().length() > 0) {
			BapiparnrType salePartner = new BapiparnrType();
			salePartner.setPartn_Role(Transaction_Constants.AG);
			salePartner.setPartn_Numb(soldToCustomerId);
			
			if(soldToAddress != null) {
				Bapiaddr1Type ptnrAddress = new Bapiaddr1Type();
				
				salePartner.setAddr_Orig(Transaction_Constants.B);
				salePartner.setAddr_Link(Transaction_Constants.AG);
				
				ptnrAddress.setAddr_No(Transaction_Constants.AG);
				ptnrAddress.setName(soldToAddress.getCustomerName());
				ptnrAddress.setStreet(soldToAddress.getAddressLine1());
				ptnrAddress.setStr_Suppl1(soldToAddress.getAddressLine2());
				ptnrAddress.setStr_Suppl2(soldToAddress.getAddressLine3());
				ptnrAddress.setCity(soldToAddress.getCity());
				ptnrAddress.setPostl_Cod1(soldToAddress.getZipcode());
				ptnrAddress.setRegion(soldToAddress.getState());
				ptnrAddress.setCountry(soldToAddress.getCountryCode());
				ptnrAddress.setPo_Box(soldToAddress.getPoBox());
				ptnrAddress.setE_Mail(soldToAddress.getEmail());
				ptnrAddress.setTel1_Numbr(soldToAddress.getPhone());
				partnerAddList.add(ptnrAddress);
			}
			sales_PartnersList.add(salePartner);
		}
		
		if(billToCustomerId != null && billToCustomerId.trim().length() > 0) {
			BapiparnrType salePartner = new BapiparnrType();
			salePartner.setPartn_Role(Transaction_Constants.RE);
			salePartner.setPartn_Numb(billToCustomerId);
			
			if(billToAddress != null) {
				Bapiaddr1Type ptnrAddress = new Bapiaddr1Type();
				
				salePartner.setAddr_Orig(Transaction_Constants.B);
				salePartner.setAddr_Link(Transaction_Constants.RE);
				
				ptnrAddress.setAddr_No(Transaction_Constants.RE);
				ptnrAddress.setName(billToAddress.getCustomerName());
				ptnrAddress.setStreet(billToAddress.getAddressLine1());
				ptnrAddress.setStr_Suppl1(billToAddress.getAddressLine2());
				ptnrAddress.setStr_Suppl2(billToAddress.getAddressLine3());
				ptnrAddress.setCity(billToAddress.getCity());
				ptnrAddress.setPostl_Cod1(billToAddress.getZipcode());
				ptnrAddress.setRegion(billToAddress.getState());
				ptnrAddress.setCountry(billToAddress.getCountryCode());
				ptnrAddress.setPo_Box(billToAddress.getPoBox());
				ptnrAddress.setE_Mail(billToAddress.getEmail());
				ptnrAddress.setTel1_Numbr(billToAddress.getPhone());
				partnerAddList.add(ptnrAddress);
			}
			sales_PartnersList.add(salePartner);
		}
		
		if(shipToCustomerId != null && shipToCustomerId.trim().length() > 0) {
			BapiparnrType salePartner = new BapiparnrType();
			salePartner.setPartn_Role(Transaction_Constants.WE);
			salePartner.setPartn_Numb(shipToCustomerId);
			
			if(shipToAddress != null) {
				Bapiaddr1Type ptnrAddress = new Bapiaddr1Type();
				
				salePartner.setAddr_Orig(Transaction_Constants.B);
				salePartner.setAddr_Link(Transaction_Constants.WE);
				
				ptnrAddress.setAddr_No(Transaction_Constants.WE);
				ptnrAddress.setName(shipToAddress.getCustomerName());
				ptnrAddress.setStreet(shipToAddress.getAddressLine1());
				ptnrAddress.setStr_Suppl1(shipToAddress.getAddressLine2());
				ptnrAddress.setStr_Suppl2(shipToAddress.getAddressLine3());
				ptnrAddress.setCity(shipToAddress.getCity());
				ptnrAddress.setPostl_Cod1(shipToAddress.getZipcode());
				ptnrAddress.setRegion(shipToAddress.getState());
				ptnrAddress.setCountry(shipToAddress.getCountryCode());
				ptnrAddress.setPo_Box(shipToAddress.getPoBox());
				ptnrAddress.setE_Mail(shipToAddress.getEmail());
				ptnrAddress.setTel1_Numbr(shipToAddress.getPhone());
				partnerAddList.add(ptnrAddress);
			}
			sales_PartnersList.add(salePartner);
		}
		
		if(payerCustomerId != null && payerCustomerId.trim().length() > 0) {
			BapiparnrType salePartner = new BapiparnrType();
			salePartner.setPartn_Role(Transaction_Constants.RG);
			salePartner.setPartn_Numb(payerCustomerId);
			
			if(payerAddress != null) {
				Bapiaddr1Type ptnrAddress = new Bapiaddr1Type();
				
				salePartner.setAddr_Orig(Transaction_Constants.B);
				salePartner.setAddr_Link(Transaction_Constants.RG);
				
				ptnrAddress.setAddr_No(Transaction_Constants.RG);
				ptnrAddress.setName(payerAddress.getCustomerName());
				ptnrAddress.setStreet(payerAddress.getAddressLine1());
				ptnrAddress.setStr_Suppl1(payerAddress.getAddressLine2());
				ptnrAddress.setStr_Suppl2(payerAddress.getAddressLine3());
				ptnrAddress.setCity(payerAddress.getCity());
				ptnrAddress.setPostl_Cod1(payerAddress.getZipcode());
				ptnrAddress.setRegion(payerAddress.getState());
				ptnrAddress.setCountry(payerAddress.getCountryCode());
				ptnrAddress.setPo_Box(payerAddress.getPoBox());
				ptnrAddress.setE_Mail(payerAddress.getEmail());
				ptnrAddress.setTel1_Numbr(payerAddress.getPhone());
				partnerAddList.add(ptnrAddress);
			}
			sales_PartnersList.add(salePartner);
		}		
	}

}
