package hmh.ws.services;

import hmh.rs.pojo.CreateCustomerRequest;
import hmh.rs.pojo.CustomerResponse;
import hmh.rs.pojo.OrderSubmitResponse;
import hmh.rs.pojo.UpdateCustomerRequest;
import hmh.sap.rfc.BapiccardType;
import hmh.sap.rfc.Bapiret2Type;
import hmh.sap.rfc.Bapireturn1Type;
import hmh.sap.rfc.Bapisdhd1Type;
import hmh.sap.rfc.Bapisdhd1XType;
import hmh.sap.rfc.BapisditType;
import hmh.sap.rfc.Zbdcmsgcoll_RfcType;
import hmh.sap.rfc.Zcust_AddressType;
import hmh.sap.rfc.Zcust_Address_WpType;
import hmh.sap.rfc.ZvcustdetailsType;
import hmh.sap.rfc.ZvcustomersType;
import hmh.sap.rfc.ZvdivinfoType;
import hmh.sap.rfc.Zvemail2Type;
import hmh.sap.rfc.ZvetailcustType;
import hmh.sap.rfc.ZvgetcustType;
import hmh.sap.rfc.ZvrelationType;
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
import hmh.ws.controller.CustomerBean;
import hmh.ws.controller.SfdcBean;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.xml.ws.Holder;

import org.apache.camel.CamelContext;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.google.common.collect.ArrayListMultimap;
import com.hmco.eai.AsyncRequestId;
import com.hmco.eai.AsyncRequestStatus;
import com.hmco.eai.EaiException;
import com.hmco.eai.Error;
import com.hmco.eai.ErrorList;
import com.hmco.eai.ots.customer.AccountStatementPDFRequest;
import com.hmco.eai.ots.customer.AccountStatementPDFResponse;
import com.hmco.eai.ots.customer.Address;
import com.hmco.eai.ots.customer.CreateEtailCustomerRequest;
import com.hmco.eai.ots.customer.CreateEtailCustomerResponse;
import com.hmco.eai.ots.customer.CreateSundryCustomerRequest;
import com.hmco.eai.ots.customer.CustomerDetail;
import com.hmco.eai.ots.customer.CustomerDetail.CustomerDivisionInfo;
import com.hmco.eai.ots.customer.CustomerDetailList;
import com.hmco.eai.ots.customer.CustomerIDList;
import com.hmco.eai.ots.customer.CustomerKey;
import com.hmco.eai.ots.customer.CustomerKeyList;
import com.hmco.eai.ots.customer.CustomerRelationship;
import com.hmco.eai.ots.customer.CustomerRelationshipList;
import com.hmco.eai.ots.customer.CustomerSearchCriteria;
import com.hmco.eai.ots.customer.EmailAddressStruct;
import com.hmco.eai.ots.customer.FindSFDCCustomerRequest;
import com.hmco.eai.ots.customer.GetCustomerRelationshipsRequest;
import com.hmco.eai.ots.customer.RelationshipTypeList;
import com.hmco.eai.ots.customer.SFDCCustomer;
import com.hmco.eai.ots.customer.SFDCCustomerList;
import com.hmco.eai.ots.customer.SFDCRep;
import com.hmco.eai.ots.customer.SFDCRepList;
import com.hmco.eai.ots.customer.SfdcCustomerIdList;
import com.hmco.eai.ots.packinglist.PackingListRequest;
import com.hmco.eai.ots.packinglist.PackingListResponse;
import com.hmco.eai.tibco.enterprisewebservices.CustomerEx;
import com.hmco.eai.tibco.enterprisewebservices.CustomerException;
import com.hmh.util.async.AsyncService;
import com.hmh.util.audit.AuditService;
import com.hmh.util.dao.EAI_Log;
import com.hmh.util.hasher.Hasher;
import com.sforce.soap.schemas._class.customerservice.SfdcCustomer;
import com.sforce.soap.schemas._class.customerservice.SfdcRep;

//@Path("/customer")
public class CustomerImpl implements CustomerEx, InitializingBean, DisposableBean {

	private static final Logger logger = Logger.getLogger(CustomerImpl.class);
	public final static String ERROR_NO_TXN = "customerKey must have at least one non-empty customerID, san, or mdrPID.";
	public final static String ERROR_RQST = "An error occurred while processing SOAP request.";
	private final static String GET_CUSTOMER_DETAIL = "GetCustomerDetail";
	private final static String GET_CUSTOMER_RELATIONSHIPS = "GetCustomerRelationships";
	private final static String FIND_SFDC_CUSTOMER = "findSFDCCustomer";
	private final static String CREATE_ETAIL_CUSTOMER = "CreateEtailCustomer";
	private final static String CREATE_SUNDRY_CUSTOMER = "CreateSundryCustomer";
	private final static String FIND_ETAIL_CUST = "FindEtailCustomer";
	private final static String ASYNC_POLL = "asyncPoll";
	private final static String ACCNT_STMT_PDF = "accountStatementPdf";
	
	

	private CustomerBean bean;
	private Hasher hasher;
	private AuditService audit;
	private CamelContext camelContext;
	private SfdcBean sfdcBean;
	private AsyncService asyncService;

	@Produce(ref = "sedaCustomerAudit")
	ProducerTemplate producer;

	//@Produce(ref = "sedaCustomerRelAysnc")
	//ProducerTemplate asyncCusRelProducer;
	
	//@Produce(ref = "sedaCustomerDetailAysnc")
	//ProducerTemplate asyncCusDtlProducer;

	// for id generator
	private static int staticCounter = 0;
	private static final int nBits = 4;
	private static final String CREATE_CUSTOMER = "CreateCustomer";
	private static final String UPDATE_CUSTOMER = "UpdateCustomer";

	@Override
	public void destroy() throws Exception {
		logger.debug("destroy " + this.getClass().getName());
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		logger.debug("initialize " + this.getClass().getName());
	}

	public void setBean(CustomerBean bean) {
		this.bean = bean;
	}

	public void setHasher(Hasher hasher) {
		this.hasher = hasher;
	}

	public void setCamelContext(CamelContext camelContext) {
		this.camelContext = camelContext;
	}
	
	public void setAudit(AuditService audit) {
		logger.debug("instantiate AuditService");
		this.audit = audit;
	}

	// using by sega route
	public void sendAudit(EAI_Log log) {
		logger.debug("send audit of " + log.getMsg_Text());
		audit.insertToEAI_LOG(log);
	}

	@Override
	public com.hmco.eai.ots.customer.CustomerDetailList getCustomerDetail(
			com.hmco.eai.ots.customer.CustomerKeyList getCustomerDetailRequest)
			throws CustomerException {

		logger.debug("getCustomerDetail begin");
		long enterTime = System.currentTimeMillis();

		List<CustomerKey> keyList = getCustomerDetailRequest.getCustomerKey();

		CustomerKey[] custArray = keyList.toArray(new CustomerKey[0]);

		ZvgetcustType[] T_Getcust = new ZvgetcustType[custArray.length];

		List<String> custIds = new ArrayList<String>(0);
		List<String> sanIds = new ArrayList<String>(0);
		List<String> mdrIds = new ArrayList<String>(0);
		custIds.removeAll(Arrays.asList(Transaction_Constants.EMPTY));
		sanIds.removeAll(Arrays.asList(Transaction_Constants.EMPTY));
		mdrIds.removeAll(Arrays.asList(Transaction_Constants.EMPTY));
		
		String custId = null;
		String sanId = null;
		String mdrId = null;
		boolean isError = false;
		ErrorList errorList = null;
		errorList = new ErrorList();
		List<com.hmco.eai.Error> listError = errorList.getError();
		for (int count = 0; count < custArray.length; count++) {
			custId = custArray[count].getCustomerID() != null ? custArray[count].getCustomerID() : Transaction_Constants.EMPTY;
			sanId = custArray[count].getSan() != null ? custArray[count].getSan() :  Transaction_Constants.EMPTY;
			mdrId = custArray[count].getMdrPID()  != null ? custArray[count].getMdrPID() : Transaction_Constants.EMPTY;
			
			if (custId.trim().length() == 0 && sanId.trim().length() == 0 && mdrId.trim().length() == 0) {
				isError = true;
				com.hmco.eai.Error e = new Error();
				e.setErrorCategory(Transaction_Constants.ERROR_CATEGORY);
				e.setErrorCode(Transaction_Constants.ERROR_CODE);
				e.setErrorMessage(ERROR_NO_TXN);
				listError.add(e);
			} else {
				T_Getcust[count] = new ZvgetcustType();
				T_Getcust[count].setKunnr(custId);
				T_Getcust[count].setEikto(sanId);
				T_Getcust[count].setZmdrpid(mdrId);
			}
		}
		
		EAI_Log log = EAI_Log.enter(
				arrayToString(custIds.toArray(new String[0]),
						Transaction_Constants.COMMA_SEPERATOR),
				GET_CUSTOMER_DETAIL, EAI_Log.SYS_WebService, EAI_Log.SYS_SAP);
		
		if(isError) {
			EaiException exc = new EaiException();
			exc.setErrorList(errorList);
			String errorBody = Converter.convertBodyToString(exc.getErrorList());
			log.toException(Converter.convertBodyToString(getCustomerDetailRequest), ERROR_RQST,
					EAI_Log.EXEPTION_BUSINESS, errorBody);
			producer.sendBody(log.clone());
			throw new CustomerException(ERROR_RQST, exc);
		}
		
		producer.sendBody(log.clone());

		Holder<ZvcustdetailsType[]> T_CustdetailsHolder = new Holder<ZvcustdetailsType[]>();
		Holder<ZvdivinfoType[]> T_DivinfoHolder = new Holder<ZvdivinfoType[]>();
		Holder<Zvemail2Type[]> T_EmailHolder = new Holder<Zvemail2Type[]>();
		Holder<hmh.sap.rfc.Zbdcmsgcoll_RfcType []> T_Bdcmsgcoll = new Holder<Zbdcmsgcoll_RfcType[]>();
		
		long requestTime = 0;
		long responseTime = 0;
		try {
			requestTime = System.currentTimeMillis();

			log.toRequest();
			producer.sendBody(log.clone());
			String sapErrorStatus  = bean.getCustomerDetail(T_Getcust, T_CustdetailsHolder,
					T_DivinfoHolder, T_EmailHolder, T_Bdcmsgcoll);
			responseTime = System.currentTimeMillis();

			log.toResponse();
			producer.sendBody(log.clone());

			logger.debug("SAP time was " + (responseTime - requestTime)
					+ " ms.");
			
			if( sapErrorStatus != null && !sapErrorStatus.trim().equals(Transaction_Constants.ZERO) ) {
				Zbdcmsgcoll_RfcType[] sapErrorList = T_Bdcmsgcoll.value;
				if( sapErrorList != null ) {
					errorList = new ErrorList();
					listError = errorList.getError();
					for( Zbdcmsgcoll_RfcType sapError : sapErrorList) {
						com.hmco.eai.Error e = new Error();
						e.setErrorCategory(sapErrorStatus);
						e.setErrorCode(sapError.getMsgnr());
						e.setErrorMessage(sapError.getMsgv1());
						listError.add(e);
					}
					EaiException exc = new EaiException();
					exc.setErrorList(errorList);
					throw new CustomerException(ERROR_RQST, exc);
				}
			}

			CustomerDetailList cusDetailList = makeCustDetailList(
					T_CustdetailsHolder.value, T_DivinfoHolder.value,
					T_EmailHolder.value);

			return cusDetailList;

		} catch (CustomerException ex) {
			String errorBody = Converter.convertBodyToString(ex.getFaultInfo());
			log.toException(Converter.convertBodyToString(getCustomerDetailRequest), ex.getMessage(),
					EAI_Log.EXEPTION_BUSINESS, errorBody);
			producer.sendBody(log.clone());
			throw ex;
		}
		catch (Exception ex) {
			ex.printStackTrace(System.err);
			logger.error("Exception calling getCustomerDetail", ex);
			requestTime = responseTime = 0;

			StringWriter stackTrace = new StringWriter();
			ex.printStackTrace(new PrintWriter(stackTrace));
			stackTrace.flush();

			log.toException(Converter.convertBodyToString(getCustomerDetailRequest), ex.getMessage(), EAI_Log.EXEPTION_SYSTEM,
					stackTrace.toString());
			producer.sendBody(log.clone());
			throw new CustomerException(ex.getMessage());
		} finally {
			long exitTime = System.currentTimeMillis();
			logger.debug("servicemix time was "
					+ ((exitTime - enterTime) - (responseTime - requestTime))
					+ " ms.");
			logger.debug("execution time was " + (exitTime - enterTime)
					+ " ms.");
			logger.debug("getCustomerDetail ends");

			log.toExit();
			producer.sendBody(log.clone());
		}

	}

	private CustomerDetailList makeCustDetailList(ZvcustdetailsType[] cusDtls,
			ZvdivinfoType[] divInfos, Zvemail2Type[] emails) {

		HashMap<String, ZvcustdetailsType> cusDtlMap = new HashMap<String, ZvcustdetailsType>();
		for (int i = 0; i < cusDtls.length; i++)
			cusDtlMap.put(cusDtls[i].getKunnr(), cusDtls[i]);

		ArrayListMultimap<String, ZvdivinfoType> divInfoMap = ArrayListMultimap
				.<String, ZvdivinfoType> create();
		for (int i = 0; i < divInfos.length; i++)
			divInfoMap.put(divInfos[i].getKunnr(), divInfos[i]);

		ArrayListMultimap<String, Zvemail2Type> emailMap = ArrayListMultimap
				.<String, Zvemail2Type> create();
		for (int i = 0; i < emails.length; i++) {
			emailMap.put(emails[i].getCustomerid(), emails[i]);
		}

		CustomerDetailList cusDtlList = new CustomerDetailList();
		List<CustomerDetail> customerDetail = cusDtlList.getCustomerDetail();
		String respLookupValue = null;
		for (Iterator<String> it = cusDtlMap.keySet().iterator(); it.hasNext();) {
			
			String custId = it.next();
			ZvcustdetailsType cusDtlType = cusDtlMap.get(custId);
			CustomerDetail cusDtl = new CustomerDetail();
			cusDtl.setCustomerID(custId);
			respLookupValue = hasher.getValue(
					Transaction_Constants.CUSTOMER_ROLE,
					Transaction_Constants.SAP, cusDtlType.getKtokd(),
					Transaction_Constants.ENTERPRISE);
			cusDtl.setCustomerRole((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.CUSTOMER_ROLE_UNEXPECTED : respLookupValue);

			respLookupValue = hasher.getValue(
					Transaction_Constants.CUSTOMER_CLASS,
					Transaction_Constants.SAP, cusDtlType.getKdkg1(),
					Transaction_Constants.ENTERPRISE);
			cusDtl.setCustomerClassCode((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.CUSTOMER_CLASS_UNEXPECTED : respLookupValue);
			cusDtl.setCustomerClassDesc(cusDtlType.getKdkg1Text());
			
			respLookupValue = hasher.getValue(
					Transaction_Constants.CUSTOMER_TYPE,
					Transaction_Constants.SAP, cusDtlType.getKdkg2(),
					Transaction_Constants.ENTERPRISE);
			cusDtl.setCustomerTypeCode((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.CUSTOMER_TYPE_UNEXPECTED : respLookupValue);
			cusDtl.setCustomerTypeDesc(cusDtlType.getKdkg2Text());
			
			respLookupValue = hasher.getValue(
					Transaction_Constants.CREDIT_STATUS,
					Transaction_Constants.SAP, cusDtlType.getCrblb(),
					Transaction_Constants.ENTERPRISE);
			cusDtl.setCreditStatus((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.CREDIT_STATUS_UNEXPECTED : respLookupValue);
			cusDtl.setSan(cusDtlType.getEikto());
			cusDtl.setMdrPID(cusDtlType.getZmdrpid());
			cusDtl.setIsPrimeMDR(cusDtlType.getPrimary_Mdr() != null && cusDtlType.getPrimary_Mdr().equalsIgnoreCase(Transaction_Constants.Y));

			Address addr = new Address();
			addr.setAddressLine1(cusDtlType.getStreet());
			addr.setAddressLine2(cusDtlType.getStr_Suppl2());
			addr.setAddressLine3(Transaction_Constants.EMPTY);
			addr.setPoBox(cusDtlType.getPo_Box());
			addr.setCity(cusDtlType.getCity());
			addr.setState(cusDtlType.getRegion());
			addr.setZipcode(cusDtlType.getPost_1());
			addr.setCountryCode(cusDtlType.getCountry());
			addr.setZipcode(cusDtlType.getPost_1());

			List<EmailAddressStruct> emailOutputList = addr
					.getEmailAddressStruct();
			List<Zvemail2Type> emailInputList = emailMap.get(custId);
			if(emailInputList != null) {
				for (Zvemail2Type email : emailInputList) {
					if(email == null)
						continue;
					EmailAddressStruct e = new EmailAddressStruct();
					e.setEmailAddress(email.getEmail());
					if (email.getFlgdefault() != null) {
						e.setIsPrimary(email.getFlgdefault().equalsIgnoreCase(
								Transaction_Constants.X));
					}
					emailOutputList.add(e);
				}
			}
			
			cusDtl.setCustomerAddress(addr);

			cusDtl.setName(cusDtlType.getName1());
			cusDtl.setTelNumber(cusDtlType.getTel_Number());
			cusDtl.setAltTelNumber(cusDtlType.getMob_Number());
			cusDtl.setCollegeNumber(cusDtlType.getLocco());
			cusDtl.setCustomerEmail(cusDtlType.getEmail());
			cusDtl.setCustomerFax(cusDtlType.getTelfx());
			
			respLookupValue = hasher.getValue(	
					Transaction_Constants.CUSTOMER_STATUS,
					Transaction_Constants.SAP, cusDtlType.getLoevm(),
					Transaction_Constants.ENTERPRISE);
			cusDtl.setCustomerStatus((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.CUSTOMER_STATUS_UNEXPECTED : respLookupValue);

			List<CustomerDetail.CustomerDivisionInfo> divInfoOpList = cusDtl
					.getCustomerDivisionInfo();
			List<ZvdivinfoType> divInfoIpList = divInfoMap.get(custId);
			if( divInfoIpList != null ){
				for (ZvdivinfoType divInfo : divInfoIpList) {
					if(divInfo == null)
						continue;
					CustomerDivisionInfo cusDivInfo = new CustomerDivisionInfo();
					respLookupValue = hasher.getValue(
							Transaction_Constants.DIVISION,
							Transaction_Constants.SAP, divInfo.getSpart(),
							Transaction_Constants.ENTERPRISE);
					cusDivInfo.setDivision((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.DIVISION_CODE_UNEXPECTED : respLookupValue);
					cusDivInfo.setGeographicTerritory(divInfo.getBzirk());
					if (divInfo.getKvgr3() != null) {
						cusDivInfo.setAllowSubstitutionsFlag(divInfo.getKvgr3()
								.equalsIgnoreCase(Transaction_Constants.X));
					}
					divInfoOpList.add(cusDivInfo);
				}
			}

			customerDetail.add(cusDtl);
		}
		return cusDtlList;
	}

	@Override
	public com.hmco.eai.ots.customernew.CustomerDetailList getCustomerDetailEx(
			com.hmco.eai.ots.customernew.CustomerKeyList getCustomerDetailServiceRequest)
			throws CustomerException {
		// TODO Auto-generated method stub
		
		//
		// should be removed as there is no wsdl changes compare with base mathod
		//
		return null;
	}

	@Override
	public CustomerDetailList getCustomerDetailAsyncResult(
			AsyncRequestId asyncRequestId) throws CustomerException {
/*
		String response = asyncService.getAsyncResponse(asyncRequestId.getRequestId());
		JAXBContext jaxb;
		try {
			jaxb = JAXBContext.newInstance("com.hmco.eai.ots.customer");
			Unmarshaller unmarshall = jaxb.createUnmarshaller();
			InputStream is = new ByteArrayInputStream(response.getBytes());
			InputSource ic = new InputSource(is);
			CustomerDetailList element = (CustomerDetailList) unmarshall.unmarshal(ic);
			return element;
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/		
		return null;
	}

	@Override
	public CustomerRelationshipList getCustomerRelationshipsAsyncResult(
			AsyncRequestId asyncRequestId) throws CustomerException {
/*		
		String response = asyncService.getAsyncResponse(asyncRequestId.getRequestId());
		JAXBContext jaxb;
		try {
			jaxb = JAXBContext.newInstance("com.hmco.eai.ots.customer");
			Unmarshaller unmarshall = jaxb.createUnmarshaller();
			InputStream is = new ByteArrayInputStream(response.getBytes());
			InputSource ic = new InputSource(is);
			CustomerRelationshipList element = (CustomerRelationshipList) unmarshall.unmarshal(ic);
			return element;
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/		
		return null;
	}

	@Override
	public CreateEtailCustomerResponse createEtailCustomer(
			CreateEtailCustomerRequest customerRqst)
			throws CustomerException {

		logger.debug("createEtailCustomer begin");
		long enterTime = System.currentTimeMillis();
		
		String I_Customer_Name = customerRqst.getName() != null ? customerRqst.getName() : Transaction_Constants.EMPTY;
		String I_Store_Id = customerRqst.getStoreID() != null ? customerRqst.getStoreID() : Transaction_Constants.EMPTY;
		String I_Telephone = customerRqst.getTelephone();
		
		boolean isError = false;
		ErrorList errorList = new ErrorList();;
		List<com.hmco.eai.Error> listError = errorList.getError();
		if(I_Store_Id == null || (I_Store_Id != null && I_Store_Id.length() == 0)) {
			isError = true;
			
			com.hmco.eai.Error e = new Error();
			e.setErrorCategory(Transaction_Constants.STORE_ERROR);
			e.setErrorCode(Transaction_Constants.STORE_ERROR);
			e.setErrorMessage(Transaction_Constants.STORE_ERROR);
			listError.add(e);
		} else if( I_Store_Id != null && I_Store_Id.length() > 30 ) {
			isError = true;
			com.hmco.eai.Error e = new Error();
			e.setErrorCategory(Transaction_Constants.STORE_INVALID);
			e.setErrorCode(Transaction_Constants.STORE_INVALID);
			e.setErrorMessage(Transaction_Constants.STORE_INVALID);
			listError.add(e);
		} if (I_Customer_Name == null || (I_Customer_Name != null && I_Customer_Name.length() == 0)) {

			isError = true;
			com.hmco.eai.Error e = new Error();
			e.setErrorCategory(Transaction_Constants.CUS_NAME_ERROR);
			e.setErrorCode(Transaction_Constants.CUS_NAME_ERROR);
			e.setErrorMessage(Transaction_Constants.CUS_NAME_ERROR);
			listError.add(e);
		
		} else if ( I_Customer_Name != null && I_Customer_Name.length() > 35 ) {

			isError = true;
			com.hmco.eai.Error e = new Error();
			e.setErrorCategory(Transaction_Constants.CUS_NAME_INVALID);
			e.setErrorCode(Transaction_Constants.CUS_NAME_INVALID);
			e.setErrorMessage(Transaction_Constants.CUS_NAME_INVALID);
			listError.add(e);
		
		} if (I_Telephone == null || (I_Telephone != null && I_Telephone.length() == 0)) {

			isError = true;
			com.hmco.eai.Error e = new Error();
			e.setErrorCategory(Transaction_Constants.TEL_ERROR);
			e.setErrorCode(Transaction_Constants.TEL_ERROR);
			e.setErrorMessage(Transaction_Constants.TEL_ERROR);
			listError.add(e);
		
		} else if (I_Telephone != null && I_Telephone.length() > 16) {

			isError = true;
			com.hmco.eai.Error e = new Error();
			e.setErrorCategory(Transaction_Constants.TEL_INVALID);
			e.setErrorCode(Transaction_Constants.TEL_INVALID);
			e.setErrorMessage(Transaction_Constants.TEL_INVALID);
			listError.add(e);
		
		} 
		if(validateAddress(customerRqst.getSoldToAddress(), listError,Transaction_Constants.SOLD_TO_ADDRESS)) {
			isError = true;
		} 
		if(validateAddress(customerRqst.getBillToAddress(), listError,Transaction_Constants.BILL_TO_ADDRESS)) {
			isError = true;
		} else {
//			I_Bill_To_Addr = new Zcust_AddressType();
		}
		if(validateAddress(customerRqst.getShipToAddress(), listError,Transaction_Constants.SHIP_TO_ADDRESS)) {
			isError = true;
		} else {
//			I_Ship_To_Addr = new Zcust_AddressType();
		}
		
		EAI_Log log = EAI_Log.enter(I_Customer_Name + I_Store_Id,
				CREATE_ETAIL_CUSTOMER, EAI_Log.SYS_WebService, EAI_Log.SYS_SAP);
		if(isError) {
			EaiException exc = new EaiException();
			exc.setErrorList(errorList);
			String errorBody = Converter.convertBodyToString(exc.getErrorList());
			log.toException(Converter.convertBodyToString(customerRqst), ERROR_RQST,
					EAI_Log.EXEPTION_BUSINESS, errorBody);
			producer.sendBody(log.clone());
			throw new CustomerException(ERROR_RQST, exc);
		}
		
		
		producer.sendBody(log.clone());
		

		/**
		 * Construct input for SAP RFC
		 */
		
		// SOLD TO ADDRESS
		Zcust_AddressType I_Sold_To_Addr = null;
		Address address = customerRqst.getSoldToAddress();
		if(address != null) {
			I_Sold_To_Addr = new Zcust_AddressType();
			I_Sold_To_Addr.setAddr_Line1(address.getAddressLine1());
			I_Sold_To_Addr.setAddr_Line2(address.getAddressLine2());
//			I_Sold_To_Addr.setAddr_Line3(address.getAddressLine3());
			I_Sold_To_Addr.setCity(address.getCity());
			I_Sold_To_Addr.setCountry_Code(address.getCountryCode());
			I_Sold_To_Addr.setPo_Box(address.getPoBox());
			I_Sold_To_Addr.setState(address.getState());
			I_Sold_To_Addr.setZip_Code(address.getZipcode());
		}
		
		// BILL TO ADDRESS
		Zcust_AddressType I_Bill_To_Addr = new Zcust_AddressType();
		address = customerRqst.getBillToAddress();
		if (address != null) {
			I_Bill_To_Addr.setAddr_Line1(address.getAddressLine1());
			I_Bill_To_Addr.setAddr_Line2(address.getAddressLine2());
//			I_Bill_To_Addr.setAddr_Line3(address.getAddressLine3());
			I_Bill_To_Addr.setCity(address.getCity());
			I_Bill_To_Addr.setCountry_Code(address.getCountryCode());
			I_Bill_To_Addr.setPo_Box(address.getPoBox());
			I_Bill_To_Addr.setState(address.getState());
			I_Bill_To_Addr.setZip_Code(address.getZipcode());
		}

		// SHIP TO ADDRESS
		Zcust_AddressType I_Ship_To_Addr = new Zcust_AddressType();
		address = customerRqst.getShipToAddress();
		if (address != null) {
			I_Ship_To_Addr.setAddr_Line1(address.getAddressLine1());
			I_Ship_To_Addr.setAddr_Line2(address.getAddressLine2());
//			I_Ship_To_Addr.setAddr_Line3(address.getAddressLine3());
			I_Ship_To_Addr.setCity(address.getCity());
			I_Ship_To_Addr.setCountry_Code(address.getCountryCode());
			I_Ship_To_Addr.setPo_Box(address.getPoBox());
			I_Ship_To_Addr.setState(address.getState());
			I_Ship_To_Addr.setZip_Code(address.getZipcode());
		}

		String I_Email = customerRqst.getCustomerEmail();
		Holder<String> E_Sold_To_Custno = new Holder<String>();
		Holder<String> E_Ship_To_Custno = new Holder<String>();
		Holder<String> E_Bill_To_Custno = new Holder<String>();

		

		long requestTime = 0;
		long responseTime = 0;
		try {
			requestTime = System.currentTimeMillis();

			log.toRequest();
			producer.sendBody(log.clone());

			/*
			 * bean.getCustomerDetail(T_Getcust, T_CustdetailsHolder,
			 * T_DivinfoHolder, T_EmailHolder);
			 */
			
			Holder<Zbdcmsgcoll_RfcType[]> T_Bdcmsgcoll = new Holder<Zbdcmsgcoll_RfcType[]>();
			
			String sapErrorStatus = bean.createEtailCustomer(I_Customer_Name, I_Sold_To_Addr,
					I_Bill_To_Addr, I_Ship_To_Addr, I_Email, I_Store_Id,
					I_Telephone, E_Sold_To_Custno, E_Ship_To_Custno,
					E_Bill_To_Custno, T_Bdcmsgcoll);
			responseTime = System.currentTimeMillis();

			log.toResponse();
			producer.sendBody(log.clone());

			logger.debug("SAP time was " + (responseTime - requestTime)
					+ " ms.");
			
			if( sapErrorStatus != null && !sapErrorStatus.trim().equals(Transaction_Constants.ZERO) ) {
				Zbdcmsgcoll_RfcType[] sapErrorList = T_Bdcmsgcoll.value;
				if( sapErrorList != null ) {
					errorList = new ErrorList();
					listError = errorList.getError();
					for( Zbdcmsgcoll_RfcType sapError : sapErrorList) {
						com.hmco.eai.Error e = new Error();
						int errorCategory = Integer.parseInt(sapErrorStatus);
						if( errorCategory > 2 )
							e.setErrorCategory(Transaction_Constants.ENTERPRISE_ERROR_CODE_SYSTEM);
						else {
							e.setErrorCategory(sapErrorStatus);
						}
						e.setErrorCode(sapError.getMsgnr());
						e.setErrorMessage(sapError.getMsgv1());
						listError.add(e);
					}
					EaiException exc = new EaiException();
					exc.setErrorList(errorList);
					throw new CustomerException(ERROR_RQST, exc);
				}
			} else {
				CreateEtailCustomerResponse response = makeEtailCustomerResponse(
						E_Sold_To_Custno, E_Ship_To_Custno, E_Bill_To_Custno);

				return response;
	
			}
		} catch (CustomerException ex) {
			String errorBody = Converter.convertBodyToString(ex.getFaultInfo());
			log.toException(Converter.convertBodyToString(customerRqst), ex.getMessage(),
					EAI_Log.EXEPTION_BUSINESS, errorBody);
			producer.sendBody(log.clone());
			throw ex;
		}
		catch (Exception ex) {
			ex.printStackTrace(System.err);
			logger.error("Exception calling createEtailCustomer", ex);
			requestTime = responseTime = 0;

			StringWriter stackTrace = new StringWriter();
			ex.printStackTrace(new PrintWriter(stackTrace));
			stackTrace.flush();

			log.toException(Converter.convertBodyToString(customerRqst), ex.getMessage(), EAI_Log.EXEPTION_SYSTEM,
					stackTrace.toString());
			producer.sendBody(log.clone());
			throw new CustomerException(ex.getMessage());

		} finally {
			long exitTime = System.currentTimeMillis();
			logger.debug("servicemix time was "
					+ ((exitTime - enterTime) - (responseTime - requestTime))
					+ " ms.");
			logger.debug("execution time was " + (exitTime - enterTime)
					+ " ms.");
			logger.debug("createEtailCustomer ends");

			log.toExit();
			producer.sendBody(log.clone());
		}
		
		return null;

	}
	
	private CreateEtailCustomerResponse makeEtailCustomerResponse(
			Holder<String> e_Sold_To_Custno, Holder<String> e_Ship_To_Custno,
			Holder<String> e_Bill_To_Custno) {
		CreateEtailCustomerResponse response = new CreateEtailCustomerResponse();
		
		response.setSoldToCustomerID(e_Sold_To_Custno.value);
		if(e_Ship_To_Custno.value != null && e_Ship_To_Custno.value.length() > 0) {
			response.setShipToCustomerID(e_Ship_To_Custno.value);	
		} else {
			response.setShipToCustomerID(e_Sold_To_Custno.value);
		}
		if(e_Bill_To_Custno.value != null && e_Bill_To_Custno.value.length() > 0) {
			response.setBillToCustomerID(e_Bill_To_Custno.value);	
		} else {
			response.setBillToCustomerID(e_Sold_To_Custno.value);
		}
		
		
		return response;
	}

	public String getRequestId(AsyncRequestId asyncRequestId) {
		return asyncRequestId.getRequestId();
	}
	
	@Override
	public AsyncRequestStatus asyncPoll(AsyncRequestId asyncRequestId)
			throws com.hmco.eai.tibco.enterprisewebservices.EaiException {
		EAI_Log log = EAI_Log.enter(asyncRequestId != null ? asyncRequestId.getRequestId() : new Date().toString(), ASYNC_POLL,
				EAI_Log.SYS_WebService, EAI_Log.SYS_SAP);
		producer.sendBody(log.clone());
		AsyncRequestStatus status = new AsyncRequestStatus();

		status.setIsReady(asyncService.asyncPoll(asyncRequestId.getRequestId()));
		log.toExit();
		producer.sendBody(log.clone());
		return status;
	}

	@Override
	public PackingListResponse packingListOperation(
			PackingListRequest packingListRequest)
			throws com.hmco.eai.tibco.enterprisewebservices.EaiException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SFDCCustomerList findSFDCCustomer(
			FindSFDCCustomerRequest findSFDCCustomerRequest)
			throws com.hmco.eai.tibco.enterprisewebservices.EaiException {
		
		EAI_Log log = EAI_Log
		.enter(findSFDCCustomerRequest.getSapCustomerId() != null ? findSFDCCustomerRequest
				.getSapCustomerId() : (findSFDCCustomerRequest
				.getMdrPid() != null ? findSFDCCustomerRequest
				.getMdrPid() : (findSFDCCustomerRequest.getZipCode())),
				FIND_SFDC_CUSTOMER, EAI_Log.SYS_WebService,
				EAI_Log.SYS_SFDC);
		try {
			producer.sendBody(log.clone());

			String mdrPid = findSFDCCustomerRequest.getMdrPid();
			String sapCustomerId = findSFDCCustomerRequest.getSapCustomerId();
			String zip = findSFDCCustomerRequest.getZipCode();

			log.toRequest();
			producer.sendBody(log.clone());

			java.util.List<SfdcCustomer> customerInList = sfdcBean
					.findSfdcCustomers(mdrPid, sapCustomerId, zip);

			log.toResponse();
			producer.sendBody(log.clone());

			SFDCCustomerList customerOpList = new SFDCCustomerList();
			List<SFDCCustomer> cusList = customerOpList.getSFDCCustomer();
			if( customerInList != null ) {
				for (SfdcCustomer cusIn : customerInList) {
					if(cusIn == null) 
						continue;
					SFDCCustomer cusOut = new SFDCCustomer();
					cusOut.setEmail(cusIn.getEmail());
					cusOut.setFax(cusIn.getFax());
					cusOut.setInsideSalesAccountFlag(cusIn.isInsideSalesAccountFlag());
					cusOut.setMdrPid(cusIn.getMdrPid());
					cusOut.setName(cusIn.getName());
					cusOut.setPhone(cusIn.getPhone());
					cusOut.setPnpAccountFlag(cusIn.isPnpAccountFlag());
					cusOut.setSapCustomerId(cusIn.getSapCustomerId());
					cusOut.setSfdcCustomerId(cusIn.getSfdcCustomerId());
					cusOut.setShippingCity(cusIn.getShippingCity());
					cusOut.setShippingCountry(cusIn.getShippingCountry());
					cusOut.setShippingState(cusIn.getShippingState());
					cusOut.setShippingStreet(cusIn.getShippingStreet());
					cusOut.setShippingZip(cusIn.getShippingZip());
					cusList.add(cusOut);
				}
			}

			return customerOpList;
		
		} catch (Exception ex) {
			ex.printStackTrace(System.err);
			logger.error("Exception calling findSFDCCustomer", ex);

			StringWriter stackTrace = new StringWriter();
			ex.printStackTrace(new PrintWriter(stackTrace));
			stackTrace.flush();

			log.toException(Converter.convertBodyToString(findSFDCCustomerRequest), ex.getMessage(),
					EAI_Log.EXEPTION_SYSTEM, stackTrace.toString());
			producer.sendBody(log.clone());
			
			throw new com.hmco.eai.tibco.enterprisewebservices.EaiException(ex.getMessage()); 
		} finally {
			log.toExit();
			producer.sendBody(log.clone());
		}
		
	}

	/*
	 * public URL getSfdcWsdlUrl() { URL wsdlUrl = null; try { wsdlUrl = new
	 * URL(sfdcServiceEndpoint + "?wsdl"); logger.info("WSDL :::: " +
	 * sfdcServiceEndpoint + "?wsdl"); } catch (MalformedURLException e1) { //
	 * TODO Auto-generated catch block e1.printStackTrace(); } return wsdlUrl; }
	 */

	@Override
	public String createSundryCustomer(
			CreateSundryCustomerRequest createSundryCustomerRequest)
			throws CustomerException {

		logger.debug("createSundryCustomerRequest begin");
		long enterTime = System.currentTimeMillis();

		String I_College_No = createSundryCustomerRequest.getCollegeNumber() != null ? createSundryCustomerRequest.getCollegeNumber() : Transaction_Constants.EMPTY;
		String I_Customer_Name = createSundryCustomerRequest.getName() != null ? createSundryCustomerRequest.getName(): Transaction_Constants.EMPTY;
		String rqstLookupValue = hasher.getValue(
				Transaction_Constants.DIVISION,
				Transaction_Constants.ENTERPRISE, createSundryCustomerRequest.getDivision(),
				Transaction_Constants.SAP);
		ErrorList errorList = new ErrorList();
		List<com.hmco.eai.Error> listError = errorList.getError();
		boolean isError = false;
		if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (createSundryCustomerRequest.getDivision() != null && createSundryCustomerRequest.getDivision().trim().length() > 0)) {
			isError = true;
			com.hmco.eai.Error e = new Error();
			e.setErrorCategory(Transaction_Constants.DIVISION_CODE_UNEXPECTED);
			e.setErrorCode(Transaction_Constants.DIVISION_CODE_UNEXPECTED);
			e.setErrorMessage(Transaction_Constants.DIVISION_CODE_UNEXPECTED);
			listError.add(e);
		}
		String I_Division = rqstLookupValue;
		String I_Email = createSundryCustomerRequest.getCustomerEmail();
		String I_Fax = createSundryCustomerRequest.getFax();
		String I_GEO_Sales_Territory = createSundryCustomerRequest
				.getGeographicSalesTerritory();
		String I_Sales_Territory = createSundryCustomerRequest.getSFASalesTerritory();
		Zcust_AddressType customerAddress = null;
		Address add = createSundryCustomerRequest.getCustomerAddress();
		if (add != null) {
			customerAddress = new Zcust_AddressType();
			customerAddress.setAddr_Line1(add.getAddressLine1());
			customerAddress.setAddr_Line2(add.getAddressLine2());
//			customerAddress.setAddr_Line3(add.getAddressLine3());
			customerAddress.setCity(add.getCity());
			customerAddress.setCountry_Code(add.getCountryCode());
			customerAddress.setPo_Box(add.getPoBox());
			customerAddress.setState(add.getState());
			customerAddress.setZip_Code(add.getZipcode());
		}

		String I_Telephone_1 = createSundryCustomerRequest.getTelephone1();
		String I_Telephone_2 = createSundryCustomerRequest.getTelephone2();
		Holder<String> E_Ship_To_Custno = new Holder<String>();
		
		if(I_Division == null || (I_Division != null && I_Division.length() == 0)) {
			isError = true;
			com.hmco.eai.Error e = new Error();
			e.setErrorCategory(Transaction_Constants.DIV_ERROR);
			e.setErrorCode(Transaction_Constants.DIV_ERROR);
			e.setErrorMessage(Transaction_Constants.DIV_ERROR);
			listError.add(e);
		} if (I_Sales_Territory == null || (I_Sales_Territory != null && I_Sales_Territory.length() == 0)) {
			isError = true;
			com.hmco.eai.Error e = new Error();
			e.setErrorCategory(Transaction_Constants.SFA_TERR_ERROR);
			e.setErrorCode(Transaction_Constants.SFA_TERR_ERROR);
			e.setErrorMessage(Transaction_Constants.SFA_TERR_ERROR);
			listError.add(e);
		
		} if (I_Customer_Name == null || (I_Customer_Name != null && I_Customer_Name.length() == 0)) {
			isError = true;
			com.hmco.eai.Error e = new Error();
			e.setErrorCategory(Transaction_Constants.NAME_ERROR);
			e.setErrorCode(Transaction_Constants.NAME_ERROR);
			e.setErrorMessage(Transaction_Constants.NAME_ERROR);
			listError.add(e);
		
		} else if ( I_Customer_Name != null && I_Customer_Name.length() > 35 ) {
			isError = true;
			com.hmco.eai.Error e = new Error();
			e.setErrorCategory(Transaction_Constants.NAME_INVALID);
			e.setErrorCode(Transaction_Constants.NAME_INVALID);
			e.setErrorMessage(Transaction_Constants.NAME_INVALID);
			listError.add(e);
		} 
		
		if(validateAddress(add, listError, Transaction_Constants.CUSTOMER_ADDRESS)) {
			isError = true;
		}
		
		EAI_Log log = EAI_Log
		.enter(I_College_No+I_Customer_Name, CREATE_SUNDRY_CUSTOMER,
				EAI_Log.SYS_WebService, EAI_Log.SYS_SAP);
		
		if(isError) {
			EaiException exc = new EaiException();
			exc.setErrorList(errorList);
			String errorBody = Converter.convertBodyToString(exc.getErrorList());
			log.toException(Converter.convertBodyToString(createSundryCustomerRequest), ERROR_RQST,
					EAI_Log.EXEPTION_BUSINESS, errorBody);
			producer.sendBody(log.clone());
			throw new CustomerException(ERROR_RQST, exc);
		}
		
		producer.sendBody(log.clone());

		long requestTime = 0;
		long responseTime = 0;
		try {
			requestTime = System.currentTimeMillis();

			log.toRequest();
			producer.sendBody(log.clone());
			Holder<Zbdcmsgcoll_RfcType[]> T_Bdcmsgcoll = new Holder<Zbdcmsgcoll_RfcType[]>();
			String sapErrorStatus = bean.createSundryCustomer(I_College_No, I_Customer_Name,
					I_Division, I_Email, I_Fax, I_GEO_Sales_Territory,
					I_Sales_Territory, customerAddress, I_Telephone_1, I_Telephone_2,
					E_Ship_To_Custno,T_Bdcmsgcoll);
			responseTime = System.currentTimeMillis();

			log.toResponse();
			producer.sendBody(log.clone());

			logger.debug("SAP time was " + (responseTime - requestTime)
					+ " ms.");
			
			if( sapErrorStatus != null && sapErrorStatus.equals(Transaction_Constants.ZERO)) {
				return E_Ship_To_Custno.value;	
			} else {
				Zbdcmsgcoll_RfcType[] sapErrorList = T_Bdcmsgcoll.value;
				if( sapErrorList != null ) {
					errorList = new ErrorList();
					listError = errorList.getError();
					for( Zbdcmsgcoll_RfcType sapError : sapErrorList) {
						com.hmco.eai.Error e = new Error();
						int errorCategory = Integer.parseInt(sapErrorStatus);
						if( errorCategory > 2 )
							e.setErrorCategory(Transaction_Constants.ENTERPRISE_ERROR_CODE_SYSTEM);
						else {
							e.setErrorCategory(sapErrorStatus);
						}
						e.setErrorCode(sapError.getMsgnr());
						e.setErrorMessage(sapError.getMsgv1());
						listError.add(e);
					}
					EaiException exc = new EaiException();
					exc.setErrorList(errorList);
					throw new CustomerException(ERROR_RQST, exc);
				}
			}
		}
		catch (CustomerException ex) {
			String errorBody = Converter.convertBodyToString(ex.getFaultInfo());
			log.toException(Converter.convertBodyToString(createSundryCustomerRequest), ex.getMessage(),
					EAI_Log.EXEPTION_BUSINESS, errorBody);
			producer.sendBody(log.clone());
			throw ex;
		}
		catch (Exception ex) {
			ex.printStackTrace(System.err);
			logger.error("Exception calling createSundryCustomer", ex);
			requestTime = responseTime = 0;

			StringWriter stackTrace = new StringWriter();
			ex.printStackTrace(new PrintWriter(stackTrace));
			stackTrace.flush();

			log.toException(Converter.convertBodyToString(createSundryCustomerRequest), ex.getMessage(), EAI_Log.EXEPTION_SYSTEM,
					stackTrace.toString());
			producer.sendBody(log.clone());
			throw new CustomerException(ex.getMessage());

		} finally {
			long exitTime = System.currentTimeMillis();
			logger.debug("servicemix time was "
					+ ((exitTime - enterTime) - (responseTime - requestTime))
					+ " ms.");
			logger.debug("execution time was " + (exitTime - enterTime)
					+ " ms.");
			logger.debug("createSundryCustomer ends");

			log.toExit();
			producer.sendBody(log.clone());
		}
		return null;
	}

	@Override
	public SFDCRepList getSFDCRep(SfdcCustomerIdList sfdcCustomerIdList)
			throws com.hmco.eai.tibco.enterprisewebservices.EaiException {

		ArrayList<String> ids = (ArrayList<String>) sfdcCustomerIdList.getSfdcCustomerId();
		ids.removeAll(Arrays.asList(Transaction_Constants.EMPTY));
		String[] custIds = ids.toArray(new String[0]);
		
		EAI_Log log = EAI_Log
		.enter(arrayToString(custIds, Transaction_Constants.COMMA_SEPERATOR),
				FIND_SFDC_CUSTOMER, EAI_Log.SYS_WebService,
				EAI_Log.SYS_SFDC);
		try {
			List<SfdcRep> sfdcRepInList = sfdcBean
			.getRepsForCustomers(sfdcCustomerIdList.getSfdcCustomerId(), null);

			SFDCRepList sfdcRepOpFinalList = new SFDCRepList();
			List<SFDCRep> sfdcRepOpList = sfdcRepOpFinalList.getSFDCRep();
			if( sfdcRepInList != null ) {
				String respLookupValue = null;
				for (SfdcRep repIn : sfdcRepInList) {
					if(repIn == null)
						continue;
					SFDCRep repOut = new SFDCRep();
					/*logger.debug("SFDC REP DIVISION ID :::: " + repIn.getDivision().getValue() + " :::: " + hasher.getValue(
							Transaction_Constants.DIVISION,
							Transaction_Constants.SAP, repIn.getDivision().getValue(),
							Transaction_Constants.ENTERPRISE));*/
					respLookupValue = hasher.getValue(
							Transaction_Constants.DIVISION,
							Transaction_Constants.SFDC, repIn.getDivision(),
							Transaction_Constants.ENTERPRISE); 
					repOut.setDivision((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.DIVISION_CODE_UNEXPECTED : respLookupValue);
					repOut.setEmail(repIn.getEmail());
					repOut.setMarket(repIn.getMarket());
					repOut.setPhone(repIn.getPhone());
					repOut.setSfdcCustomerId(repIn.getSfdcCustomerId());
					repOut.setSfdcUserID(repIn.getSfdcUserId());
					repOut.setTerritoryDescription(repIn.getTerritoryDescription());
					repOut.setUserName(repIn.getUserName());
					sfdcRepOpList.add(repOut);
				}
			}
			
			return sfdcRepOpFinalList;
		} catch (Exception ex) {
			ex.printStackTrace(System.err);
			logger.error("Exception calling getSFDCRep", ex);

			StringWriter stackTrace = new StringWriter();
			ex.printStackTrace(new PrintWriter(stackTrace));
			stackTrace.flush();

			log.toException(Converter.convertBodyToString(sfdcCustomerIdList), ex.getMessage(),
					EAI_Log.EXEPTION_SYSTEM, stackTrace.toString());
			producer.sendBody(log.clone());
			
			throw new com.hmco.eai.tibco.enterprisewebservices.EaiException(ex.getMessage()); 
		} finally {
			log.toExit();
			producer.sendBody(log.clone());
		}
		
	}

	@Override
	public AsyncRequestId getCustomerRelationshipsAsync(
			GetCustomerRelationshipsRequest relationshipTypeList)
			throws CustomerException {
/*
		JAXBContext jaxbMssgContext;
		StringBuffer xmlContent = null;
		
		String rqstId = asyncService.getAsyncRqstId(xmlContent);
		AsyncRequestId id = new AsyncRequestId();
		id.setRequestId(rqstId);
		logger.info("Got rqst ID " + rqstId);
		List rqstDetails = new ArrayList();
		rqstDetails.add(rqstId);
		rqstDetails.add(relationshipTypeList);
		asyncCusRelProducer.sendBody(rqstDetails);
		return id;
*/
		return null;
	}

	@Override
	public AccountStatementPDFResponse accountStatementPDF(
			AccountStatementPDFRequest accountStatementPDFRequest)
			throws CustomerException {

		logger.debug("accountStatementPDF begin");
		long enterTime = System.currentTimeMillis();

		String Bill_To_Customer = accountStatementPDFRequest
				.getBillToCustomer();
		String[] Email_Id_To = accountStatementPDFRequest.getEmailTo() != null ? accountStatementPDFRequest.getEmailTo().toArray(
				new String[0]) : new String[0];
		String[] Email_Id_Cc = accountStatementPDFRequest.getEmailCc() != null ? accountStatementPDFRequest.getEmailCc().toArray(
				new String[0]) : new String[0];
		StringBuffer Email_Subject = new StringBuffer(accountStatementPDFRequest.getEmailSubject() != null ? accountStatementPDFRequest.getEmailSubject() : Transaction_Constants.EMPTY);
		
		if( Email_Subject != null && Email_Subject.length() > 50 ) {
			Email_Subject.substring(0, 50);
		}
		StringBuffer body = new StringBuffer(Transaction_Constants.EMPTY);
		String Email_Text  = null;
		for (String text : accountStatementPDFRequest.getEmailBody()) {
			body.append(text).append(Transaction_Constants.NEW_LINE);
		}
		if(body != null && body.length() > 0) {
			Email_Text = makeMultiLineString(body.toString());
		}
		
		EAI_Log log = EAI_Log.enter(Bill_To_Customer,
				ACCNT_STMT_PDF, EAI_Log.SYS_WebService, EAI_Log.SYS_SAP);
		producer.sendBody(log.clone());

		long requestTime = 0;
		long responseTime = 0;
		try {
			requestTime = System.currentTimeMillis();

			log.toRequest();
			producer.sendBody(log.clone());

			Zbdcmsgcoll_RfcType sapResponse = bean.accountStatementPDF(
					Bill_To_Customer, Email_Id_To, Email_Id_Cc, Email_Subject.toString(),
					Email_Text);
			
			responseTime = System.currentTimeMillis();

			log.toResponse();
			producer.sendBody(log.clone());

			logger.debug("SAP time was " + (responseTime - requestTime)
					+ " ms.");

			
			AccountStatementPDFResponse accResponse = new AccountStatementPDFResponse();
			if( sapResponse!= null && sapResponse.getMsgtyp() != null && sapResponse.getMsgtyp().equalsIgnoreCase(Transaction_Constants.S) ) {
				accResponse.setEReturn(sapResponse.getMsgv1());
				accResponse.setMessage(sapResponse.getMsgv2());
				return accResponse;	
			} else {
				EaiException exc = new EaiException();
				ErrorList errorList = new ErrorList();
				List<com.hmco.eai.Error> listError = errorList.getError();
				
				com.hmco.eai.Error e = new Error();
				e.setErrorCategory(sapResponse.getMsgtyp());
				e.setErrorCode(sapResponse.getMsgnr());
				e.setErrorMessage(sapResponse.getMsgv1());
				listError.add(e);
				exc.setErrorList(errorList);
				
				throw new CustomerException(ERROR_RQST, exc);
			}

		} catch (CustomerException ex) {
			String errorBody = Converter.convertBodyToString(ex.getFaultInfo());
			log.toException(Converter.convertBodyToString(accountStatementPDFRequest), ex.getMessage(),
					EAI_Log.EXEPTION_BUSINESS, errorBody);
			producer.sendBody(log.clone());
			throw ex;
		}
		catch (Exception ex) {
			ex.printStackTrace(System.err);
			logger.error("Exception calling AccountStatementPDF", ex);
			requestTime = responseTime = 0;

			StringWriter stackTrace = new StringWriter();
			ex.printStackTrace(new PrintWriter(stackTrace));
			stackTrace.flush();

			log.toException(Converter.convertBodyToString(accountStatementPDFRequest), ex.getMessage(), EAI_Log.EXEPTION_SYSTEM,
					stackTrace.toString());
			producer.sendBody(log.clone());
			throw new CustomerException(ex.getMessage());
		} finally {
			long exitTime = System.currentTimeMillis();
			logger.debug("servicemix time was "
					+ ((exitTime - enterTime) - (responseTime - requestTime))
					+ " ms.");
			logger.debug("execution time was " + (exitTime - enterTime)
					+ " ms.");
			logger.debug("AccountStatementPDF ends");

			log.toExit();
			producer.sendBody(log.clone());
		}

	}

	@Override
	public AsyncRequestId createSundryCustomerAsync(
			CreateSundryCustomerRequest createSundryCustomerRequest)
			throws CustomerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createSundryCustomerAsyncResult(AsyncRequestId asyncRequestId)
			throws CustomerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AsyncRequestId getCustomerDetailAsync(
			CustomerKeyList getCustomerDetailRequest) throws CustomerException {
/*
		JAXBContext jaxbMssgContext;
		StringBuffer xmlContent = null;
		
		 * try { jaxbMssgContext =
		 * JAXBContext.newInstance("com.hmco.eai.ots.customer"); Marshaller
		 * marshaller = jaxbMssgContext.createMarshaller();
		 * marshaller.setProperty("jaxb.formatted.output",Boolean.TRUE);
		 * StringWriter writer = new StringWriter();
		 * marshaller.marshal(getCustomerDetailRequest, writer); xmlContent =
		 * writer.getBuffer(); } catch (JAXBException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 

		String rqstId = asyncService.getAsyncRqstId(xmlContent);
		AsyncRequestId id = new AsyncRequestId();
		id.setRequestId(rqstId);
		logger.info("Got rqst ID " + rqstId);
		List rqstDetails = new ArrayList();
		rqstDetails.add(rqstId);
		rqstDetails.add(getCustomerDetailRequest);
		asyncCusDtlProducer.sendBody(rqstDetails);
		return id;
*/	
		return null;
	}

	
/*
	public void asynCalltoGetCustDetail(List rqstDetails) {
		
		CustomerDetailList cusDetailList = null;
		CustomerKeyList keyList = (CustomerKeyList) rqstDetails.get(1);
		String rqstId = (String) rqstDetails.get(0);
		logger.info("rqstId from seda component " + rqstId);
		try {
			cusDetailList = getCustomerDetail(keyList);
		} catch (CustomerException e1) {
			e1.printStackTrace();
		}
		JAXBContext jaxbMssgContext;
		StringBuffer rqstXml = null;
		StringBuffer responseXml = null;
		try {
			jaxbMssgContext = JAXBContext
					.newInstance("com.hmco.eai.ots.customer");
			Marshaller marshaller = jaxbMssgContext.createMarshaller();
			marshaller.setProperty("jaxb.formatted.output", Boolean.TRUE);
			StringWriter rqstWriter = new StringWriter();
			marshaller.marshal(keyList, rqstWriter);
			rqstXml = rqstWriter.getBuffer();

			marshaller = jaxbMssgContext.createMarshaller();
			marshaller.setProperty("jaxb.formatted.output", Boolean.TRUE);
			StringWriter respWriter = new StringWriter();
			marshaller.marshal(cusDetailList, respWriter);
			responseXml = respWriter.getBuffer();

			rqstWriter.flush();
			respWriter.flush();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.info("Rqst xml :: CustomerImpl " + rqstXml);
		logger.info("Resp xml :: CustomerImpl " + responseXml);
		asyncService.saveAsyncResponse(rqstId, rqstXml, responseXml);
	
		}
*/

/*	
	public void asynCalltoGetCustRelDetail(List rqstDetails) {
		CustomerRelationshipList cusRelList = null;
		GetCustomerRelationshipsRequest input = (GetCustomerRelationshipsRequest) rqstDetails.get(1);
		String rqstId = (String) rqstDetails.get(0);
		logger.info("rqstId from seda component " + rqstId);
		try {
			cusRelList = getCustomerRelationships(input);
		} catch (CustomerException e1) {
			e1.printStackTrace();
		}
		JAXBContext jaxbMssgContext;
		StringBuffer rqstXml = null;
		StringBuffer responseXml = null;
		try {
			jaxbMssgContext = JAXBContext
					.newInstance("com.hmco.eai.ots.customer");
			Marshaller marshaller = jaxbMssgContext.createMarshaller();
			marshaller.setProperty("jaxb.formatted.output", Boolean.TRUE);
			StringWriter rqstWriter = new StringWriter();
			marshaller.marshal(input, rqstWriter);
			rqstXml = rqstWriter.getBuffer();

			marshaller = jaxbMssgContext.createMarshaller();
			marshaller.setProperty("jaxb.formatted.output", Boolean.TRUE);
			StringWriter respWriter = new StringWriter();
			marshaller.marshal(cusRelList, respWriter);
			responseXml = respWriter.getBuffer();

			rqstWriter.flush();
			respWriter.flush();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.info("Rqst xml :: CustomerImpl " + rqstXml);
		logger.info("Resp xml :: CustomerImpl " + responseXml);
		asyncService.saveAsyncResponse(rqstId, rqstXml, responseXml);
	}
*/
	
	@Override
	public CustomerRelationshipList getCustomerRelationships(
			GetCustomerRelationshipsRequest relationshipTypeList)
			throws CustomerException {

		logger.debug("getCustomerRelationships begin");
		long enterTime = System.currentTimeMillis();

		EaiException exc = new EaiException();
		ErrorList errorList = new ErrorList();
		List<com.hmco.eai.Error> listError = errorList.getError();
		boolean isError = false;
		String custId = relationshipTypeList.getCustomerID();
		String rqstLookupValue = hasher.getValue(
				Transaction_Constants.DIVISION,
				Transaction_Constants.ENTERPRISE,
				relationshipTypeList.getDivision(),
				Transaction_Constants.SAP);
		if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (relationshipTypeList.getDivision() != null && relationshipTypeList.getDivision().trim().length() > 0)) {
			isError = true;
			com.hmco.eai.Error e = new Error();
			e.setErrorCategory(Transaction_Constants.DIVISION_CODE_UNEXPECTED);
			e.setErrorCode(Transaction_Constants.DIVISION_CODE_UNEXPECTED);
			e.setErrorMessage(Transaction_Constants.DIVISION_CODE_UNEXPECTED);
			listError.add(e);
		}
		String div = rqstLookupValue;
		RelationshipTypeList relationshipTypes = relationshipTypeList
				.getRelationshipTypeList();
		
		EAI_Log log = EAI_Log.enter(custId, GET_CUSTOMER_RELATIONSHIPS,
				EAI_Log.SYS_WebService, EAI_Log.SYS_SAP);
		
		if(relationshipTypes == null) {
			com.hmco.eai.Error e = new Error();
			e.setErrorCategory(Transaction_Constants.REL_ERROR);
			e.setErrorCode(Transaction_Constants.REL_ERROR);
			e.setErrorMessage(Transaction_Constants.REL_ERROR);
			listError.add(e);
			exc.setErrorList(errorList);
			
			String errorBody = Converter.convertBodyToString(exc.getErrorList());
			log.toException(Converter.convertBodyToString(relationshipTypeList), ERROR_RQST,
					EAI_Log.EXEPTION_BUSINESS, errorBody);
			producer.sendBody(log.clone());
			throw new CustomerException(ERROR_RQST, exc);
		}
		List<String> listOfRelationshipTypes = relationshipTypes
				.getRelationshipType();
		/*listOfRelationshipTypes.removeAll(Arrays
				.asList(Transaction_Constants.EMPTY));*/
		ZvrelationType[] T_Relation = null;

		
		if (listOfRelationshipTypes != null
				&& listOfRelationshipTypes.size() > 0) {
			T_Relation = new ZvrelationType[listOfRelationshipTypes.size()];
			for (int count = 0; count < listOfRelationshipTypes.size(); count++) {
				T_Relation[count] = new ZvrelationType();
				if(listOfRelationshipTypes.get(count) != null && listOfRelationshipTypes.get(count).trim().length() > 0) {
					/*logger.debug("CUSTOMER_RELATIONSHIP :: " + listOfRelationshipTypes.get(count) + " :: " +hasher.getValue(
							Transaction_Constants.CUSTOMER_RELATIONSHIP,
							Transaction_Constants.ENTERPRISE,
							listOfRelationshipTypes.get(count),
							Transaction_Constants.SAP) );*/
					rqstLookupValue = hasher.getValue(
							Transaction_Constants.CUSTOMER_RELATIONSHIP,
							Transaction_Constants.ENTERPRISE,
							listOfRelationshipTypes.get(count),
							Transaction_Constants.SAP);
					if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (listOfRelationshipTypes.get(count) != null && listOfRelationshipTypes.get(count).trim().length() > 0)) {
						isError = true;
						com.hmco.eai.Error e = new Error();
						e.setErrorCategory(Transaction_Constants.CUSTOMER_RELATIONSHIP_UNEXPECTED);
						e.setErrorCode(Transaction_Constants.CUSTOMER_RELATIONSHIP_UNEXPECTED);
						e.setErrorMessage(Transaction_Constants.CUSTOMER_RELATIONSHIP_UNEXPECTED);
						listError.add(e);
					}
					T_Relation[count].setParvw(rqstLookupValue);	
				} else {
					isError = true;
					com.hmco.eai.Error e = new Error();
					e.setErrorCategory(Transaction_Constants.REL_ERROR);
					e.setErrorCode(Transaction_Constants.REL_ERROR);
					e.setErrorMessage(Transaction_Constants.REL_ERROR);
					listError.add(e);
				}
			}
		} else if (listOfRelationshipTypes == null) {
			isError = true;
			com.hmco.eai.Error e = new Error();
			e.setErrorCategory(Transaction_Constants.REL_ERROR);
			e.setErrorCode(Transaction_Constants.REL_ERROR);
			e.setErrorMessage(Transaction_Constants.REL_ERROR);
			listError.add(e);
		}

		if (custId == null || (custId != null && custId.length() <= 0)) {
			isError = true;
			com.hmco.eai.Error e = new Error();
			e.setErrorCategory(Transaction_Constants.CUS_ID_ERROR);
			e.setErrorCode(Transaction_Constants.CUS_ID_ERROR);
			e.setErrorMessage(Transaction_Constants.CUS_ID_ERROR);
			listError.add(e);
		}
		if (div == null || (div != null && div.length() <= 0)) {
			isError = true;
			com.hmco.eai.Error e = new Error();
			e.setErrorCategory(Transaction_Constants.DIV_ERROR);
			e.setErrorCode(Transaction_Constants.DIV_ERROR);
			e.setErrorMessage(Transaction_Constants.DIV_ERROR);
			listError.add(e);
		} 
		if(isError) {
			exc.setErrorList(errorList);
			String errorBody = Converter.convertBodyToString(exc.getErrorList());
			log.toException(Converter.convertBodyToString(relationshipTypeList), ERROR_RQST,
					EAI_Log.EXEPTION_BUSINESS, errorBody);
			producer.sendBody(log.clone());
			throw new CustomerException(ERROR_RQST, exc);
		}

		
		producer.sendBody(log.clone());

		Holder<ZvcustomersType[]> T_CustomersHolder = new Holder<ZvcustomersType[]>();

		long requestTime = 0;
		long responseTime = 0;
		try {
			requestTime = System.currentTimeMillis();

			log.toRequest();
			producer.sendBody(log.clone());

//			logger.debug("T_Relation :: " + T_Relation.length + " :: " + T_Relation.toString());
			Holder<Zbdcmsgcoll_RfcType[]> T_Bdcmsgcoll = new Holder<Zbdcmsgcoll_RfcType[]>();
			String sapErrorStatus = bean.getCustomerRelationships(custId, div, T_Relation,
					T_CustomersHolder, T_Bdcmsgcoll);
			responseTime = System.currentTimeMillis();

			log.toResponse();
			producer.sendBody(log.clone());

			logger.debug("SAP time was " + (responseTime - requestTime)
					+ " ms.");

			if( sapErrorStatus != null && sapErrorStatus.equals(Transaction_Constants.ZERO) ) {
				CustomerRelationshipList relList = makeCustRelationShipList(custId,
						div, T_CustomersHolder.value);
				/*
				 * CustomerDetailList cusDetailList = makeCustDetailList(
				 * T_CustdetailsHolder.value, T_DivinfoHolder.value,
				 * T_EmailHolder.value);
				 */
				return relList;
			} else {
				Zbdcmsgcoll_RfcType[] sapErrorList = T_Bdcmsgcoll.value;
				if( sapErrorList != null ) {
					errorList = new ErrorList();
					listError = errorList.getError();
					for( Zbdcmsgcoll_RfcType sapError : sapErrorList) {
						com.hmco.eai.Error e = new Error();
						e.setErrorCategory(sapErrorStatus);
						e.setErrorCode(sapError.getMsgnr());
						e.setErrorMessage(sapError.getMsgv1());
						listError.add(e);
					}
					exc = new EaiException();
					exc.setErrorList(errorList);
					throw new CustomerException(ERROR_RQST, exc);
				}
			}
			
		}
		catch (CustomerException ex) {
			String errorBody = Converter.convertBodyToString(ex.getFaultInfo());
			log.toException(Converter.convertBodyToString(relationshipTypeList), ex.getMessage(),
					EAI_Log.EXEPTION_BUSINESS, errorBody);
			producer.sendBody(log.clone());
			throw ex;
		}
		catch (Exception ex) {
			ex.printStackTrace(System.err);
			logger.error("Exception calling getCustomerRelationships", ex);
			requestTime = responseTime = 0;

			StringWriter stackTrace = new StringWriter();
			ex.printStackTrace(new PrintWriter(stackTrace));
			stackTrace.flush();

			log.toException(Converter.convertBodyToString(relationshipTypeList), ex.getMessage(), EAI_Log.EXEPTION_SYSTEM,
					stackTrace.toString());
			producer.sendBody(log.clone());
			throw new CustomerException(ex.getMessage());
		} finally {
			long exitTime = System.currentTimeMillis();
			logger.debug("servicemix time was "
					+ ((exitTime - enterTime) - (responseTime - requestTime))
					+ " ms.");
			logger.debug("execution time was " + (exitTime - enterTime)
					+ " ms.");
			logger.debug("getCustomerRelationships ends");

			log.toExit();
			producer.sendBody(log.clone());
		}
		return null;
	}

	private CustomerRelationshipList makeCustRelationShipList(String custId,
			String div, ZvcustomersType[] customers) {

		ArrayListMultimap<String, ZvcustomersType> customerMap = ArrayListMultimap
				.<String, ZvcustomersType> create();

		for (int i = 0; i < customers.length; i++)
			customerMap.put(customers[i].getParvw(), customers[i]);

		CustomerRelationshipList custRelList = new CustomerRelationshipList();
		List<CustomerRelationship> customerRelationship = custRelList
				.getCustomerRelationship();
		String respLookupValue = null;
		for (Iterator<String> it = customerMap.keySet().iterator(); it
				.hasNext();) {
			String relType = it.next();
			List<ZvcustomersType> cusTypeList = customerMap.get(relType);

			CustomerRelationship cusRel = new CustomerRelationship();
			respLookupValue = hasher.getValue(
					Transaction_Constants.CUSTOMER_RELATIONSHIP,
					Transaction_Constants.SAP, relType,
					Transaction_Constants.ENTERPRISE);
			cusRel.setRelationshipType((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.CUSTOMER_RELATIONSHIP_UNEXPECTED : respLookupValue);
			List<String> cusIdOpList = cusRel.getCustomerID();
			if(cusTypeList != null) {
				for (ZvcustomersType cusType : cusTypeList) {
					if(cusType != null)
					cusIdOpList.add(cusType.getKunn2());
				}
			}
			
			customerRelationship.add(cusRel);
		}

		return custRelList;
	}

	@Override
	public CustomerIDList findEtailCustomer(
			CustomerSearchCriteria customerSearchCriteria)
			throws CustomerException {

		logger.debug("findEtailCustomer begin");
		long enterTime = System.currentTimeMillis();

		String I_Address = customerSearchCriteria.getAddress() != null ? customerSearchCriteria.getAddress() : Transaction_Constants.EMPTY;
		String I_Name1 = customerSearchCriteria.getName() != null ? customerSearchCriteria.getName(): Transaction_Constants.EMPTY;
		boolean isError = false;
		ErrorList errorList = new ErrorList();;
		List<com.hmco.eai.Error> listError = errorList.getError();
		String rqstLookupValue = hasher.getValue(
				Transaction_Constants.DIVISION,
				Transaction_Constants.ENTERPRISE,
				customerSearchCriteria.getDivision(),
				Transaction_Constants.SAP);
		if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (customerSearchCriteria.getDivision() != null && customerSearchCriteria.getDivision().trim().length() > 0)) {
			isError = true;
			com.hmco.eai.Error e = new Error();
			e.setErrorCategory(Transaction_Constants.DIVISION_CODE_UNEXPECTED);
			e.setErrorCode(Transaction_Constants.DIVISION_CODE_UNEXPECTED);
			e.setErrorMessage(Transaction_Constants.DIVISION_CODE_UNEXPECTED);
			listError.add(e);
		}
		String I_Division = rqstLookupValue;
		String I_Zip = customerSearchCriteria.getZipCode();
		Holder<ZvetailcustType[]> T_Customers = new Holder<ZvetailcustType[]>();
		
		EAI_Log log = EAI_Log.enter(I_Address+I_Name1,FIND_ETAIL_CUST ,
				EAI_Log.SYS_WebService, EAI_Log.SYS_SAP);
		producer.sendBody(log.clone());

		if(I_Address == null || (I_Address != null && I_Address.length() == 0)) {
			isError = true;
			com.hmco.eai.Error e = new Error();
			e.setErrorCategory(Transaction_Constants.ADDR_INVALID);
			e.setErrorCode(Transaction_Constants.ADDR_INVALID);
			e.setErrorMessage(Transaction_Constants.ADDR_INVALID);
			listError.add(e);
		} else if( I_Address != null && I_Address.length() > 60 ) {
			isError = true;
			com.hmco.eai.Error e = new Error();
			e.setErrorCategory(Transaction_Constants.ADDR_INVALID);
			e.setErrorCode(Transaction_Constants.ADDR_INVALID);
			e.setErrorMessage(Transaction_Constants.ADDR_INVALID);
			listError.add(e);
		} if (I_Name1 == null || (I_Name1 != null && I_Name1.length() == 0)) {
			isError = true;
			com.hmco.eai.Error e = new Error();
			e.setErrorCategory(Transaction_Constants.NAME_ERROR);
			e.setErrorCode(Transaction_Constants.NAME_ERROR);
			e.setErrorMessage(Transaction_Constants.NAME_ERROR);
			listError.add(e);
		} else if ( I_Name1 != null && I_Name1.length() > 35 ) {
			isError = true;
			com.hmco.eai.Error e = new Error();
			e.setErrorCategory(Transaction_Constants.NAME_INVALID);
			e.setErrorCode(Transaction_Constants.NAME_INVALID);
			e.setErrorMessage(Transaction_Constants.NAME_INVALID);
			listError.add(e);
		} if (I_Zip == null || (I_Zip != null && I_Zip.length() == 0)) {
			isError = true;
			com.hmco.eai.Error e = new Error();
			e.setErrorCategory(Transaction_Constants.ZIP_ERROR);
			e.setErrorCode(Transaction_Constants.ZIP_ERROR);
			e.setErrorMessage(Transaction_Constants.ZIP_ERROR);
			listError.add(e);
		} else if (I_Zip != null && I_Zip.length() > 10) {
			isError = true;
			com.hmco.eai.Error e = new Error();
			e.setErrorCategory(Transaction_Constants.ZIP_CODE_INVALID);
			e.setErrorCode(Transaction_Constants.ZIP_CODE_INVALID);
			e.setErrorMessage(Transaction_Constants.ZIP_CODE_INVALID);
			listError.add(e);
		} 
		
		if(isError) {
			EaiException exc = new EaiException();
			exc.setErrorList(errorList);
			String errorBody = Converter.convertBodyToString(exc.getErrorList());
			log.toException(Converter.convertBodyToString(customerSearchCriteria), ERROR_RQST,
					EAI_Log.EXEPTION_BUSINESS, errorBody);
			producer.sendBody(log.clone());
			throw new CustomerException(ERROR_RQST, exc);
		}
		
		long requestTime = 0;
		long responseTime = 0;
		try {
			requestTime = System.currentTimeMillis();

			log.toRequest();
			producer.sendBody(log.clone());
			
			Holder<Zbdcmsgcoll_RfcType[]> T_Bdcmsgcoll = new Holder<Zbdcmsgcoll_RfcType[]>();

			String sapErrorStatus = bean.findEtailCustomer(I_Address, I_Name1, I_Division, I_Zip,
					T_Customers,T_Bdcmsgcoll);
			responseTime = System.currentTimeMillis();

			log.toResponse();
			producer.sendBody(log.clone());

			logger.debug("SAP time was " + (responseTime - requestTime)
					+ " ms.");
			
			if(sapErrorStatus != null && sapErrorStatus.equals(Transaction_Constants.ZERO)) {
				CustomerIDList cusIdList = makeCustIdList(T_Customers.value);
				return cusIdList;	
			} else {
				Zbdcmsgcoll_RfcType[] sapErrorList = T_Bdcmsgcoll.value;
				if( sapErrorList != null ) {
					errorList = new ErrorList();
					listError = errorList.getError();
					for( Zbdcmsgcoll_RfcType sapError : sapErrorList) {
						com.hmco.eai.Error e = new Error();
						e.setErrorCategory(sapErrorStatus);
						e.setErrorCode(sapError.getMsgnr());
						e.setErrorMessage(sapError.getMsgv1());
						listError.add(e);
					}
					EaiException exc = new EaiException();
					exc.setErrorList(errorList);
					throw new CustomerException(ERROR_RQST, exc);
				}
			}
		} catch (CustomerException ex) {
			String errorBody = Converter.convertBodyToString(ex.getFaultInfo());
			log.toException(Converter.convertBodyToString(customerSearchCriteria), ex.getMessage(),
					EAI_Log.EXEPTION_BUSINESS, errorBody);
			producer.sendBody(log.clone());
			throw ex;
		}
		catch (Exception ex) {
			ex.printStackTrace(System.err);
			logger.error("Exception calling getCustomerDetail", ex);
			requestTime = responseTime = 0;

			StringWriter stackTrace = new StringWriter();
			ex.printStackTrace(new PrintWriter(stackTrace));
			stackTrace.flush();

			log.toException(Converter.convertBodyToString(customerSearchCriteria), ex.getMessage(), EAI_Log.EXEPTION_SYSTEM,
					stackTrace.toString());
			producer.sendBody(log.clone());
			throw new CustomerException(ex.getMessage());
		} finally {
			long exitTime = System.currentTimeMillis();
			logger.debug("servicemix time was "
					+ ((exitTime - enterTime) - (responseTime - requestTime))
					+ " ms.");
			logger.debug("execution time was " + (exitTime - enterTime)
					+ " ms.");
			logger.debug("getCustomerDetail ends");

			log.toExit();
			producer.sendBody(log.clone());
		}
		return null;
	}

	public CustomerResponse createCustomer(CreateCustomerRequest req) throws hmh.rs.pojo.ErrorException{
		logger.debug("createCustomer begin");
		long enterTime = System.currentTimeMillis();
		long requestTime = 0;
		long responseTime = 0;
		CustomerResponse response = new CustomerResponse();
		List<hmh.rs.pojo.Error> errorList = response.getErrorList();
		String soldtoId = null;
		EAI_Log log = EAI_Log.enter(req.getWebUserId(), CREATE_CUSTOMER,
				EAI_Log.SYS_WebService, EAI_Log.SYS_SAP);
		producer.sendBody(log.clone());
		try {
			
				Holder<Bapireturn1Type[]> returnList = new Holder<Bapireturn1Type[]>();
				Zcust_Address_WpType I_Addr = new Zcust_Address_WpType();
				hmh.rs.pojo.Address addr = req.getSoldtoAddress();
				if(addr != null) {
					I_Addr.setAddr_Line1(addr.getAddressLine1());
					I_Addr.setAddr_Line2(addr.getAddressLine2());
					I_Addr.setAddr_Line3(addr.getAddressLine3());
					I_Addr.setCity(addr.getCity());
					I_Addr.setCountry_Code(addr.getCountryCode());
					I_Addr.setCustomer_Name(addr.getCustomerName());
					I_Addr.setEmail(addr.getEmail());
					I_Addr.setPo_Box(addr.getPoBox());
					I_Addr.setState(addr.getState());
					I_Addr.setTelephone_1(addr.getPhone());
					I_Addr.setZip_Code(addr.getZipcode());
				}
				
				log.toRequest();
				producer.sendBody(log);
				requestTime = System.currentTimeMillis();
				soldtoId = bean.createCustomer(I_Addr, req.getStoreId(), req.getWebUserId(),returnList);
				responseTime = System.currentTimeMillis();
				log.toResponse();
				producer.sendBody(log);
				logger.debug("SAP time was " + (responseTime - requestTime)
						+ " ms.");
				//prepare response
				response.setSoldToCustomerId(soldtoId);
				
				// error processing
				if (returnList != null && returnList.value != null ) {
					for (Bapireturn1Type bapiRet : returnList.value) {
						
						String type = bapiRet.getType();
						String code = bapiRet.getId() + bapiRet.getNumber();
						String msg = bapiRet.getMessage();
						{
							hmh.rs.pojo.Error e = new hmh.rs.pojo.Error();
							e.setErrorCategory(EnterpriseConstants.ERROR_CATEGORY_BUSINESS);
							e.setErrorCode(code);
							e.setErrorMessage(msg);
							e.setTargetSystemError("SAP_code: " + code + ", SAP_msg: " + msg);
							e.setItemKey(req.getWebUserId());
							errorList.add(e);
						}
					}
				}
			
		} catch (Exception ex) {
			ex.printStackTrace(System.err);
			logger.error("Exception calling createCustomer", ex);
			requestTime = responseTime = 0;

			StringWriter stackTrace = new StringWriter();
			ex.printStackTrace(new PrintWriter(stackTrace));
			stackTrace.flush();
			log.toException(req.getWebUserId(), ex.getMessage(), EAI_Log.EXEPTION_SYSTEM, stackTrace.toString());			
			producer.sendBody(log.clone());
			throw new hmh.rs.pojo.ErrorException(ex.getMessage());

		} finally {
			long exitTime = System.currentTimeMillis();
			logger.debug("createCustomer time was "
					+ ((exitTime - enterTime) - (responseTime - requestTime))
					+ " ms.");
			logger.debug("execution time was " + (exitTime - enterTime)
					+ " ms.");
			logger.debug("createCustomer ends");

		}
		return response;
	}
	
	public CustomerResponse updateCustomer(UpdateCustomerRequest req) throws hmh.rs.pojo.ErrorException{
		logger.debug("updateCustomer begin");
		long enterTime = System.currentTimeMillis();
		long requestTime = 0;
		long responseTime = 0;
		CustomerResponse response = new CustomerResponse();
		List<hmh.rs.pojo.Error> errorList = response.getErrorList();
		String soldtoId = null;
		EAI_Log log = EAI_Log.enter(req.getCustomerId(), CREATE_CUSTOMER,
				EAI_Log.SYS_WebService, EAI_Log.SYS_SAP);
		producer.sendBody(log.clone());
		try {
			
				Holder<Bapireturn1Type[]> returnList = new Holder<Bapireturn1Type[]>();
				Zcust_Address_WpType I_Addr = new Zcust_Address_WpType();
				hmh.rs.pojo.Address addr = req.getSoldtoAddress();
				if(addr != null) {
					I_Addr.setAddr_Line1(addr.getAddressLine1());
					I_Addr.setAddr_Line2(addr.getAddressLine2());
					I_Addr.setAddr_Line3(addr.getAddressLine3());
					I_Addr.setCity(addr.getCity());
					I_Addr.setCountry_Code(addr.getCountryCode());
					I_Addr.setCustomer_Name(addr.getCustomerName());
					I_Addr.setEmail(addr.getEmail());
					I_Addr.setPo_Box(addr.getPoBox());
					I_Addr.setState(addr.getState());
					I_Addr.setTelephone_1(addr.getPhone());
					I_Addr.setZip_Code(addr.getZipcode());
				}
				
				log.toRequest();
				producer.sendBody(log);
				requestTime = System.currentTimeMillis();
				
				soldtoId = bean.updateCustomer(I_Addr, req.getCustomerId(), returnList);
				
				responseTime = System.currentTimeMillis();
				log.toResponse();
				producer.sendBody(log);
				logger.debug("SAP time was " + (responseTime - requestTime)
						+ " ms.");
				
				//prepare response
				response.setSoldToCustomerId(soldtoId);
				
				// error processing
				if (returnList != null && returnList.value != null ) {
					for (Bapireturn1Type bapiRet : returnList.value) {
						
						String type = bapiRet.getType();
						String code = bapiRet.getId() + bapiRet.getNumber();
						String msg = bapiRet.getMessage();
						{
							hmh.rs.pojo.Error e = new hmh.rs.pojo.Error();
							e.setErrorCategory(EnterpriseConstants.ERROR_CATEGORY_BUSINESS);
							e.setErrorCode(code);
							e.setErrorMessage(msg);
							e.setTargetSystemError("SAP_code: " + code + ", SAP_msg: " + msg);
							e.setItemKey(req.getCustomerId());
							errorList.add(e);
						}
					}
				}
			
		} catch (Exception ex) {
			ex.printStackTrace(System.err);
			logger.error("Exception calling updateCustomer", ex);
			requestTime = responseTime = 0;

			StringWriter stackTrace = new StringWriter();
			ex.printStackTrace(new PrintWriter(stackTrace));
			stackTrace.flush();
			log.toException(req.getCustomerId(), ex.getMessage(), EAI_Log.EXEPTION_SYSTEM, stackTrace.toString());			
			producer.sendBody(log.clone());
			throw new hmh.rs.pojo.ErrorException(ex.getMessage());

		} finally {
			long exitTime = System.currentTimeMillis();
			logger.debug("updateCustomer time was "
					+ ((exitTime - enterTime) - (responseTime - requestTime))
					+ " ms.");
			logger.debug("execution time was " + (exitTime - enterTime)
					+ " ms.");
			logger.debug("updateCustomer ends");

		}
		return response;
	}
	
	private CustomerIDList makeCustIdList(ZvetailcustType[] cusTypeInList) {
		CustomerIDList cusIdFinalList = new CustomerIDList();
		List<String> customerIdList = cusIdFinalList.getCustomerID();
		if(cusTypeInList != null) {
			for (ZvetailcustType cusTypeIn : cusTypeInList) {
				if(cusTypeIn != null)
				customerIdList.add(cusTypeIn.getKunnr());
			}
		}
		
		return cusIdFinalList;
	}

	public static String arrayToString(String[] a, String separator) {
		String result = Transaction_Constants.EMPTY;
		if (a != null && a.length > 0) {
			result = a[0]; // start with the first element
			for (int i = 1; i < a.length; i++) {
				result = result + separator + a[i];
				if (result.length() > 50) {
					return result.substring(0, 50);
					//break;
				}
			}
		}
		return result;
	}

	public void setSfdcBean(SfdcBean sfdcBean) {
		this.sfdcBean = sfdcBean;
	}

	public SfdcBean getSfdcBean() {
		return sfdcBean;
	}

	public static String makeEventId() {
		long id = ((System.currentTimeMillis()) << nBits)
				| (staticCounter++ & 2 ^ nBits - 1);
		long tid = Thread.currentThread().getId();
		return id + "." + tid;
	}

	public void setAsyncService(AsyncService asyncService) {
		this.asyncService = asyncService;
	}

	public AsyncService getAsyncService() {
		return asyncService;
	}
	
	public String makeMultiLineString(String s) {
		StringBuffer sb = new StringBuffer(s);
		int length = s.length();
		for(int i=0;i< length/250;i++) {
			sb.insert(250 * (i+1), "\n");
		}
		return sb.toString();
	}
	
	private boolean validateAddress(Address address, List<com.hmco.eai.Error> listError, String type) {
		boolean isError = false;
		if (address == null && (type.equals(Transaction_Constants.SOLD_TO_ADDRESS) || type.equals(Transaction_Constants.CUSTOMER_ADDRESS))) {
			isError = true;
			com.hmco.eai.Error e = new Error();
			e.setErrorCategory(Transaction_Constants.ERROR_CATEGORY);
			e.setErrorCode(Transaction_Constants.ERROR_CODE);
			e.setErrorMessage(type + " is must");
			listError.add(e);
		} else if( address == null && (type.equals(Transaction_Constants.BILL_TO_ADDRESS) || type.equals(Transaction_Constants.SHIP_TO_ADDRESS))) {
			return false;
		}
		
		if(address != null ) {
			if ((address.getAddressLine1() == null || (address.getAddressLine1() != null && address.getAddressLine1().length()==0) )) {
				isError = true;
				com.hmco.eai.Error e = new Error();
				e.setErrorCategory(type + Transaction_Constants.HYPHEN + Transaction_Constants.ADDR_ERROR);
				e.setErrorCode(type + Transaction_Constants.HYPHEN + Transaction_Constants.ADDR_ERROR);
				e.setErrorMessage(type + Transaction_Constants.HYPHEN + Transaction_Constants.ADDR_ERROR);
				listError.add(e);
			} else if (address.getAddressLine1() != null && address.getAddressLine1().length() > 60 ) {
				isError = true;
				com.hmco.eai.Error e = new Error();
				e.setErrorCategory(type + Transaction_Constants.HYPHEN + Transaction_Constants.ADDR1_INVALID);
				e.setErrorCode(type + Transaction_Constants.HYPHEN + Transaction_Constants.ADDR1_INVALID);
				e.setErrorMessage(type + Transaction_Constants.HYPHEN + Transaction_Constants.ADDR1_INVALID);
				listError.add(e);
			} if ((address.getCity() == null || (address.getCity() != null && address.getCity().length()==0) )) {
				isError = true;
				com.hmco.eai.Error e = new Error();
				e.setErrorCategory(type + Transaction_Constants.HYPHEN + Transaction_Constants.CITY_ERROR);
				e.setErrorCode(type + Transaction_Constants.HYPHEN + Transaction_Constants.CITY_ERROR);
				e.setErrorMessage(type + Transaction_Constants.HYPHEN + Transaction_Constants.CITY_ERROR);
				listError.add(e);
			} else if (address.getCity() != null && address.getCity().length() > 35 ) {
				isError = true;
				com.hmco.eai.Error e = new Error();
				e.setErrorCategory(type + Transaction_Constants.HYPHEN + Transaction_Constants.CITY_INVALID);
				e.setErrorCode(type + Transaction_Constants.HYPHEN + Transaction_Constants.CITY_INVALID);
				e.setErrorMessage(type + Transaction_Constants.HYPHEN + Transaction_Constants.CITY_INVALID);
				listError.add(e);
			} if ((address.getState() == null || (address.getState() != null && address.getState().length()==0) )) {
				isError = true;
				com.hmco.eai.Error e = new Error();
				e.setErrorCategory(type + Transaction_Constants.HYPHEN + Transaction_Constants.STATE_ERROR);
				e.setErrorCode(type + Transaction_Constants.HYPHEN + Transaction_Constants.STATE_ERROR);
				e.setErrorMessage(type + Transaction_Constants.HYPHEN + Transaction_Constants.STATE_ERROR);
				listError.add(e);
			} else if (address.getState() != null && address.getState().length() > 3 ) {
				isError = true;
				com.hmco.eai.Error e = new Error();
				e.setErrorCategory(type + Transaction_Constants.HYPHEN + Transaction_Constants.STATE_INVALID);
				e.setErrorCode(type + Transaction_Constants.HYPHEN + Transaction_Constants.STATE_INVALID);
				e.setErrorMessage(type + Transaction_Constants.HYPHEN + Transaction_Constants.STATE_INVALID);
				listError.add(e);
			} if ((address.getZipcode() == null || (address.getZipcode() != null && address.getZipcode().length()==0) )) {
				isError = true;
				com.hmco.eai.Error e = new Error();
				e.setErrorCategory(type + Transaction_Constants.HYPHEN + Transaction_Constants.ZIP_ERROR);
				e.setErrorCode(type + Transaction_Constants.HYPHEN + Transaction_Constants.ZIP_ERROR);
				e.setErrorMessage(type + Transaction_Constants.HYPHEN + Transaction_Constants.ZIP_ERROR);
				listError.add(e);
			} else if (address.getZipcode() != null && address.getZipcode().length() > 10 ) {
				isError = true;
				com.hmco.eai.Error e = new Error();
				e.setErrorCategory(type + Transaction_Constants.HYPHEN + Transaction_Constants.ZIP_CODE_INVALID);
				e.setErrorCode(type + Transaction_Constants.HYPHEN + Transaction_Constants.ZIP_CODE_INVALID);
				e.setErrorMessage(type + Transaction_Constants.HYPHEN + Transaction_Constants.ZIP_CODE_INVALID);
				listError.add(e);
			} if ((address.getCountryCode() == null || (address.getCountryCode() != null && address.getCountryCode().length()==0) )) {
				isError = true;
				com.hmco.eai.Error e = new Error();
				e.setErrorCategory(type + Transaction_Constants.HYPHEN + Transaction_Constants.COUNTRY_CODE_ERROR);
				e.setErrorCode(type + Transaction_Constants.HYPHEN + Transaction_Constants.COUNTRY_CODE_ERROR);
				e.setErrorMessage(type + Transaction_Constants.HYPHEN + Transaction_Constants.COUNTRY_CODE_ERROR);
				listError.add(e);
			} else if (address.getCountryCode() != null && address.getCountryCode().length() > 3 ) {
				isError = true;
				com.hmco.eai.Error e = new Error();
				e.setErrorCategory(type + Transaction_Constants.HYPHEN + Transaction_Constants.COUNTRY_CODE_INVALID);
				e.setErrorCode(type + Transaction_Constants.HYPHEN + Transaction_Constants.COUNTRY_CODE_INVALID);
				e.setErrorMessage(type + Transaction_Constants.HYPHEN + Transaction_Constants.COUNTRY_CODE_INVALID);
				listError.add(e);
			} /*if (createEtailCustomerRequest.getSoldToAddress() != null && createEtailCustomerRequest.getSoldToAddress().getEmailAddressStruct() != null ) {
				List<EmailAddressStruct> emailList = createEtailCustomerRequest.getSoldToAddress().getEmailAddressStruct();
				if(emailList != null)
				for(EmailAddressStruct emailAddress : emailList) {
//					logger.debug("isPrimary EmailAddressStructure " + emailAddress.isIsPrimary());
				}
				
			}*/
		}
		
		return isError;
	}

}

