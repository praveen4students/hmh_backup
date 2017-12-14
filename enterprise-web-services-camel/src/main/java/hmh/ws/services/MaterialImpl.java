package hmh.ws.services;

import hmh.rs.pojo.Material;
import hmh.sap.rfc.BapireturnType;
import hmh.sap.rfc.ZcompType;
import hmh.sap.rfc.Zmaterial_DetailsType;
import hmh.sap.rfc.Zmatnr_SubstituteType;
import hmh.sap.rfc.ZsubsType;
import hmh.util.Converter;
import hmh.util.EnterpriseConstants;
import hmh.util.ErrorException;
import hmh.util.Pair;
import hmh.util.Transaction_Constants;
import hmh.ws.controller.MaterialBean;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

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
import com.hmco.eai.AsyncRequestId;
import com.hmco.eai.AsyncRequestStatus;
import com.hmco.eai.EaiException;
import com.hmco.eai.Error;
import com.hmco.eai.ErrorList;
import com.hmco.eai.ots.material.Component;
import com.hmco.eai.ots.material.GetMaterialDetailRequest;
import com.hmco.eai.ots.material.MaterialDetail;
import com.hmco.eai.ots.material.MaterialDetailList;
import com.hmco.eai.ots.material.MaterialKeyList;
import com.hmco.eai.ots.material.MaterialSubstitutionList;
import com.hmco.eai.ots.material.SubscriptionTerm;
import com.hmco.eai.ots.material.Substitution;
import com.hmco.eai.ots.material.SubstitutionValue;
import com.hmco.eai.ots.material.getatp.ATPDETAILLIST;
import com.hmco.eai.ots.material.getatp.GETATPREQUEST;
import com.hmco.eai.ots.material.getatp.GETATPRESPONSE;
import com.hmco.eai.tibco.enterprisewebservices.ATPEx;
import com.hmco.eai.tibco.enterprisewebservices.GetMaterialATPException;
import com.hmco.eai.tibco.enterprisewebservices.MaterialEx;
import com.hmco.eai.tibco.enterprisewebservices.MaterialException;
import com.hmh.util.async.AsyncService;
import com.hmh.util.audit.AuditService;
import com.hmh.util.dao.EAI_Log;
import com.hmh.util.hasher.Hasher;

public class MaterialImpl implements MaterialEx, ATPEx, InitializingBean,
		DisposableBean {

	public final static String INVALID_ISBN = "isbnId cannot be whitespace.";
	public final static String INVALID_MATID = "materialId cannot be whitespace.";
	public final static String ERROR_RQST = "An error occurred while processing SOAP request.";
	public final static String GET_MATERIAL_DETAIL = "getMaterialDetail";
	public final static String GET_MATERIAL_SUBST = "getMaterialSubstitution";
	public final static String GET_MATERIAL_ATP = "getMaterialAtp";

	private static final Logger logger = Logger.getLogger(MaterialImpl.class);

	private MaterialBean bean;

	private AsyncService asyncService;

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

	public MaterialBean getBean() {
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

	private Hasher hasher;
	private AuditService audit;
	private CamelContext camelContext;

	@Produce(ref = "sedaMaterialAudit")
	ProducerTemplate producer;

	public void setBean(MaterialBean bean) {
		logger.debug("instantiate orderBean");
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

	public void setAudit(AuditService audit) {
		logger.debug("instantiate AuditService");
		this.audit = audit;
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub

	}

	// --------------------------------------------------------
	//
	// MaterialEx interface methods
	//
	// --------------------------------------------------------

	@Override
	public MaterialDetailList getMaterialDetailAsyncResult(
			AsyncRequestId asyncRequestId) throws MaterialException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AsyncRequestStatus asyncPoll(AsyncRequestId asyncRequestId)
			throws com.hmco.eai.tibco.enterprisewebservices.EaiException {
		AsyncRequestStatus status = new AsyncRequestStatus();
		status.setIsReady(asyncService.asyncPoll(asyncRequestId.getRequestId()));
		return status;
	}

	public String getRequestId(AsyncRequestId asyncRequestId) {
		return asyncRequestId.getRequestId();
	}

	@Override
	public MaterialDetailList getMaterialDetail(
			GetMaterialDetailRequest getMaterialDetailRequest)
			throws MaterialException {

		logger.debug("getMaterialDetail begin");
		long enterTime = System.currentTimeMillis();

		MaterialKeyList materialKeyList = getMaterialDetailRequest
				.getMaterialKeyList();
		List<String> materialIdList = materialKeyList!= null ? materialKeyList.getMaterialID() : new ArrayList<String>(0);
		List<String> materialIsbnList = materialKeyList!= null ? materialKeyList.getIsbn() : new ArrayList<String>(0);
		/*
		 * List<String> ids = (List<String>) transactionIDList
		 * .getTransactionID();
		 */
		logger.info("Material ID List Size ::: " + materialIdList.size());
		logger.info("ISBN List Size ::: " + materialIsbnList.size());
		
		String[] matIDs = materialIdList.toArray(new String[0]);
		String[] isbnIDs = materialIsbnList.toArray(new String[0]);

		String customerId = getMaterialDetailRequest.getCustomerID();
		Holder<hmh.sap.rfc.Zmaterial_DetailsType[]> I_Material_Detail = new Holder<Zmaterial_DetailsType[]>();
		Holder<hmh.sap.rfc.ZcompType[]> I_Components = new Holder<ZcompType[]>();
		Holder<hmh.sap.rfc.ZsubsType[]> I_Subscription = new Holder<ZsubsType[]>();
		
		EAI_Log log = EAI_Log.enter(
				matIDs != null && matIDs.length > 0 ? 
						arrayToString(matIDs, Transaction_Constants.COMMA_SEPERATOR) 
				: (isbnIDs != null && isbnIDs.length > 0 
						? arrayToString(isbnIDs, Transaction_Constants.COMMA_SEPERATOR) : customerId != null ? customerId : Transaction_Constants.EMPTY),
				GET_MATERIAL_DETAIL, EAI_Log.SYS_WebService, EAI_Log.SYS_SAP);
		
		if ( materialIdList.size() > 0 && materialIsbnList.size() == 0 ) {
			
			materialIdList.removeAll(Arrays.asList(Transaction_Constants.EMPTY));
			
			if ( materialIdList.size() == 0 ) {
				EaiException exc = new EaiException();
				ErrorList errorList = new ErrorList();
				List<com.hmco.eai.Error> listError = errorList.getError();
				com.hmco.eai.Error e = new Error();
				e.setErrorCategory(INVALID_MATID);
				e.setErrorCode(INVALID_MATID);
				e.setErrorMessage(INVALID_MATID);
				listError.add(e);
				exc.setErrorList(errorList);
				String errorBody = Converter.convertBodyToString(exc.getErrorList());
				log.toException(Converter.convertBodyToString(getMaterialDetailRequest), ERROR_RQST,
						EAI_Log.EXEPTION_BUSINESS, errorBody);
				producer.sendBody(log.clone());
				throw new MaterialException(ERROR_RQST, exc);
			}
		} else if ( materialIsbnList.size() > 0 && materialIdList.size() == 0 ) {
			
			materialIsbnList.removeAll(Arrays.asList(Transaction_Constants.EMPTY));
			
			if ( materialIsbnList.size() == 0 ) {
				EaiException exc = new EaiException();
				ErrorList errorList = new ErrorList();
				List<com.hmco.eai.Error> listError = errorList.getError();
				com.hmco.eai.Error e = new Error();
				e.setErrorCategory(INVALID_ISBN);
				e.setErrorCode(INVALID_ISBN);
				e.setErrorMessage(INVALID_ISBN);
				listError.add(e);
				exc.setErrorList(errorList);
				String errorBody = Converter.convertBodyToString(exc.getErrorList());
				log.toException(Converter.convertBodyToString(getMaterialDetailRequest), ERROR_RQST,
						EAI_Log.EXEPTION_BUSINESS, errorBody);
				producer.sendBody(log.clone());
				throw new MaterialException(ERROR_RQST, exc);
			}
		} else if ( materialIsbnList.size() > 0 && materialIdList.size() > 0 ) {
			
			materialIsbnList.removeAll(Arrays.asList(Transaction_Constants.EMPTY));
			materialIdList.removeAll(Arrays.asList(Transaction_Constants.EMPTY));

			if ( materialIsbnList.size() == 0 && materialIdList.size() == 0 ) {
				EaiException exc = new EaiException();
				ErrorList errorList = new ErrorList();
				List<com.hmco.eai.Error> listError = errorList.getError();
				
				com.hmco.eai.Error e1 = new Error();
				e1.setErrorCategory(INVALID_MATID);
				e1.setErrorCode(INVALID_MATID);
				e1.setErrorMessage(INVALID_MATID);
				listError.add(e1);
				
				com.hmco.eai.Error e2 = new Error();
				e2.setErrorCategory(INVALID_ISBN);
				e2.setErrorCode(INVALID_ISBN);
				e2.setErrorMessage(INVALID_ISBN);
				listError.add(e2);
				exc.setErrorList(errorList);
				String errorBody = Converter.convertBodyToString(exc.getErrorList());
				log.toException(Converter.convertBodyToString(getMaterialDetailRequest), ERROR_RQST,
						EAI_Log.EXEPTION_BUSINESS, errorBody);
				producer.sendBody(log.clone());
				throw new MaterialException(ERROR_RQST, exc);
			}
		} 
		
		if ( materialIdList.size() > 0 || materialIsbnList.size() > 0 ) {
			materialIdList.removeAll(Arrays.asList(Transaction_Constants.EMPTY));
			materialIsbnList.removeAll(Arrays.asList(Transaction_Constants.EMPTY));
			EaiException exc = new EaiException();
			ErrorList errorList = new ErrorList();
			List<com.hmco.eai.Error> listError = errorList.getError();
			boolean isError = false;
			for (String mat : materialIdList) {
				if ( mat != null && mat.trim().length() > 18) {
					isError = true;
					com.hmco.eai.Error e = new Error();
					e.setErrorCategory(Transaction_Constants.ERROR_CATEGORY);
					e.setErrorCode(Transaction_Constants.ERROR_CODE);
					e.setErrorMessage("materialID " + mat + Transaction_Constants.SPACE + Transaction_Constants.MATID_LENGTH_ERROR);
					listError.add(e);
				}
			}
			for (String isbn : materialIsbnList) {
				if ( isbn != null && isbn.trim().length() > 18) {
					isError = true;
					com.hmco.eai.Error e = new Error();
					e.setErrorCategory(Transaction_Constants.ERROR_CATEGORY);
					e.setErrorCode(Transaction_Constants.ERROR_CODE);
					e.setErrorMessage("isbn " + isbn + Transaction_Constants.SPACE + Transaction_Constants.MATID_LENGTH_ERROR);
					listError.add(e);
				}
			}
						
			if(isError) {
				exc.setErrorList(errorList);
				String errorBody = Converter.convertBodyToString(exc.getErrorList());
				log.toException(Converter.convertBodyToString(getMaterialDetailRequest), ERROR_RQST,
						EAI_Log.EXEPTION_BUSINESS, errorBody);
				producer.sendBody(log.clone());
				throw new MaterialException(ERROR_RQST, exc);
			}
		}
		
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

			bean.getMaterialDetail(customerId, matIDs, isbnIDs,
					I_Material_Detail, I_Components, I_Subscription);

			responseTime = System.currentTimeMillis();

			log.toResponse();
			producer.sendBody(log.clone());

			logger.debug("SAP time was " + (responseTime - requestTime)
					+ " ms.");

			MaterialDetailList ret = makeMatDetailList(customerId,
					I_Material_Detail.value, I_Components.value,
					I_Subscription.value);

			return ret;

		} catch (Exception ex) {
			ex.printStackTrace(System.err);
			logger.error("Exception calling getMaterialDetail", ex);
			requestTime = responseTime = 0;

			StringWriter stackTrace = new StringWriter();
			ex.printStackTrace(new PrintWriter(stackTrace));
			stackTrace.flush();

			log.toException(
					Converter.convertBodyToString(getMaterialDetailRequest),
					ex.getMessage(), EAI_Log.EXEPTION_SYSTEM,
					stackTrace.toString());
			producer.sendBody(log.clone());
			throw new MaterialException(ex.getMessage());

		} finally {
			long exitTime = System.currentTimeMillis();
			logger.debug("servicemix time was "
					+ ((exitTime - enterTime) - (responseTime - requestTime))
					+ " ms.");
			logger.debug("execution time was " + (exitTime - enterTime)
					+ " ms.");
			logger.debug("getMaterialDetail ends");

			log.toExit();
			producer.sendBody(log.clone());
		}

//		return null;
	}

	@Override
	public MaterialSubstitutionList getMaterialSubstitutions(
			MaterialKeyList materialKeyList) throws MaterialException {

		logger.debug("getMaterialSubstitutions begin");
		long enterTime = System.currentTimeMillis();

		List<String> materialIdList = materialKeyList!= null ? materialKeyList.getMaterialID() : new ArrayList<String>(0);
		List<String> materialIsbnList = materialKeyList!= null ? materialKeyList.getIsbn() : new ArrayList<String>(0);
		/*
		 * List<String> ids = (List<String>) transactionIDList
		 * .getTransactionID();
		 */
		logger.info("Material ID List Size ::: " + materialIdList.size());
		logger.info("ISBN List Size ::: " + materialIsbnList.size());
		
		String[] matIDs = materialIdList.toArray(new String[0]);
		String[] isbnIDs = materialIsbnList.toArray(new String[0]);

		EAI_Log log = EAI_Log.enter(
				arrayToString(matIDs, Transaction_Constants.COMMA_SEPERATOR),
				GET_MATERIAL_SUBST, EAI_Log.SYS_WebService, EAI_Log.SYS_SAP);
		
		if ( materialIdList.size() > 0 && materialIsbnList.size() == 0 ) {
			
			materialIdList.removeAll(Arrays.asList(Transaction_Constants.EMPTY));
			
			if ( materialIdList.size() == 0 ) {
				EaiException exc = new EaiException();
				ErrorList errorList = new ErrorList();
				List<com.hmco.eai.Error> listError = errorList.getError();
				com.hmco.eai.Error e = new Error();
				e.setErrorCategory(INVALID_MATID);
				e.setErrorCode(INVALID_MATID);
				e.setErrorMessage(INVALID_MATID);
				listError.add(e);
				exc.setErrorList(errorList);
				String errorBody = Converter.convertBodyToString(exc.getErrorList());
				log.toException(Converter.convertBodyToString(materialKeyList), ERROR_RQST,
						EAI_Log.EXEPTION_BUSINESS, errorBody);
				producer.sendBody(log.clone());
				throw new MaterialException(ERROR_RQST, exc);
			}
		} else if ( materialIsbnList.size() > 0 && materialIdList.size() == 0 ) {
			
			materialIsbnList.removeAll(Arrays.asList(Transaction_Constants.EMPTY));
			
			if ( materialIsbnList.size() == 0 ) {
				EaiException exc = new EaiException();
				ErrorList errorList = new ErrorList();
				List<com.hmco.eai.Error> listError = errorList.getError();
				com.hmco.eai.Error e = new Error();
				e.setErrorCategory(INVALID_ISBN);
				e.setErrorCode(INVALID_ISBN);
				e.setErrorMessage(INVALID_ISBN);
				listError.add(e);
				exc.setErrorList(errorList);
				String errorBody = Converter.convertBodyToString(exc.getErrorList());
				log.toException(Converter.convertBodyToString(materialKeyList), ERROR_RQST,
						EAI_Log.EXEPTION_BUSINESS, errorBody);
				producer.sendBody(log.clone());
				throw new MaterialException(ERROR_RQST, exc);
			}
		} else if ( materialIsbnList.size() > 0 && materialIdList.size() > 0 ) {
			
			materialIsbnList.removeAll(Arrays.asList(Transaction_Constants.EMPTY));
			materialIdList.removeAll(Arrays.asList(Transaction_Constants.EMPTY));

			if ( materialIsbnList.size() == 0 && materialIdList.size() == 0 ) {
				EaiException exc = new EaiException();
				ErrorList errorList = new ErrorList();
				List<com.hmco.eai.Error> listError = errorList.getError();
				
				com.hmco.eai.Error e1 = new Error();
				e1.setErrorCategory(INVALID_MATID);
				e1.setErrorCode(INVALID_MATID);
				e1.setErrorMessage(INVALID_MATID);
				listError.add(e1);
				
				com.hmco.eai.Error e2 = new Error();
				e2.setErrorCategory(INVALID_ISBN);
				e2.setErrorCode(INVALID_ISBN);
				e2.setErrorMessage(INVALID_ISBN);
				listError.add(e2);
				exc.setErrorList(errorList);
				String errorBody = Converter.convertBodyToString(exc.getErrorList());
				log.toException(Converter.convertBodyToString(materialKeyList), ERROR_RQST,
						EAI_Log.EXEPTION_BUSINESS, errorBody);
				producer.sendBody(log.clone());
				throw new MaterialException(ERROR_RQST, exc);
			}
		} 
		
		if ( materialIdList.size() > 0 || materialIsbnList.size() > 0 ) {
			materialIdList.removeAll(Arrays.asList(Transaction_Constants.EMPTY));
			materialIsbnList.removeAll(Arrays.asList(Transaction_Constants.EMPTY));
			EaiException exc = new EaiException();
			ErrorList errorList = new ErrorList();
			List<com.hmco.eai.Error> listError = errorList.getError();
			boolean isError = false;
			for (String mat : materialIdList) {
				if ( mat != null && mat.trim().length() > 18) {
					isError = true;
					com.hmco.eai.Error e = new Error();
					e.setErrorCategory(Transaction_Constants.ERROR_CATEGORY);
					e.setErrorCode(Transaction_Constants.ERROR_CODE);
					e.setErrorMessage("materialID " + mat + Transaction_Constants.SPACE + Transaction_Constants.MATID_LENGTH_ERROR);
					listError.add(e);
				}
			}
			for (String isbn : materialIsbnList) {
				if ( isbn != null && isbn.trim().length() > 18) {
					isError = true;
					com.hmco.eai.Error e = new Error();
					e.setErrorCategory(Transaction_Constants.ERROR_CATEGORY);
					e.setErrorCode(Transaction_Constants.ERROR_CODE);
					e.setErrorMessage("isbn " + isbn + Transaction_Constants.SPACE + Transaction_Constants.MATID_LENGTH_ERROR);
					listError.add(e);
				}
			}
						
			if(isError) {
				exc.setErrorList(errorList);
				String errorBody = Converter.convertBodyToString(exc.getErrorList());
				log.toException(Converter.convertBodyToString(materialKeyList), ERROR_RQST,
						EAI_Log.EXEPTION_BUSINESS, errorBody);
				producer.sendBody(log.clone());
				throw new MaterialException(ERROR_RQST, exc);
			}
		}
		
		producer.sendBody(log.clone());

		Holder<hmh.sap.rfc.Zmatnr_SubstituteType[]> I_Material_Substitute = new Holder<Zmatnr_SubstituteType[]>();

		long requestTime = 0;
		long responseTime = 0;
		try {
			requestTime = System.currentTimeMillis();

			//
			// SAP Transaction Bean
			//
			log.toRequest();
			producer.sendBody(log.clone());

			bean.getMaterialSubstitutions(matIDs, isbnIDs,
					I_Material_Substitute);

			responseTime = System.currentTimeMillis();

			log.toResponse();
			producer.sendBody(log.clone());

			logger.debug("SAP time was " + (responseTime - requestTime)
					+ " ms.");

			MaterialSubstitutionList ret = makeMatSubstList(I_Material_Substitute.value);

			return ret;

		} catch (Exception ex) {
			ex.printStackTrace(System.err);
			logger.error("Exception calling getMaterialSubstitutions", ex);
			requestTime = responseTime = 0;

			StringWriter stackTrace = new StringWriter();
			ex.printStackTrace(new PrintWriter(stackTrace));
			stackTrace.flush();

			log.toException(
					Converter.convertBodyToString(materialKeyList),
					ex.getMessage(), EAI_Log.EXEPTION_SYSTEM,
					stackTrace.toString());
			producer.sendBody(log.clone());
			throw new MaterialException(ex.getMessage());

		} finally {
			long exitTime = System.currentTimeMillis();
			logger.debug("servicemix time was "
					+ ((exitTime - enterTime) - (responseTime - requestTime))
					+ " ms.");
			logger.debug("execution time was " + (exitTime - enterTime)
					+ " ms.");
			logger.debug("getMaterialSubstitutions ends");

			log.toExit();
			producer.sendBody(log.clone());
		}

//		return null;
	}

	@Override
	public AsyncRequestId getMaterialDetailAsync(
			GetMaterialDetailRequest getMaterialDetailRequest)
			throws MaterialException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public com.hmco.eai.ots.materialnew.MaterialDetailList getMaterialDetailEx(
			com.hmco.eai.ots.materialnew.GetMaterialDetailRequest getMaterialDetailRequest)
			throws MaterialException {

		logger.debug("getMaterialDetail begin");
		long enterTime = System.currentTimeMillis();

		com.hmco.eai.ots.materialnew.MaterialKeyList materialKeyList = getMaterialDetailRequest
				.getMaterialKeyList();
		List<String> materialIdList = materialKeyList!= null ? materialKeyList.getMaterialID() : new ArrayList<String>(0);
		List<String> materialIsbnList = materialKeyList!= null ? materialKeyList.getIsbn() : new ArrayList<String>(0);
		/*
		 * List<String> ids = (List<String>) transactionIDList
		 * .getTransactionID();
		 */
		logger.info("Material ID List Size ::: " + materialIdList.size());
		logger.info("ISBN List Size ::: " + materialIsbnList.size());
		
		String[] matIDs = materialIdList.toArray(new String[0]);
		String[] isbnIDs = materialIsbnList.toArray(new String[0]);

		EAI_Log log = EAI_Log.enter(
				arrayToString(matIDs, Transaction_Constants.COMMA_SEPERATOR),
				GET_MATERIAL_DETAIL, EAI_Log.SYS_WebService, EAI_Log.SYS_SAP);
		
		if ( materialIdList.size() > 0 && materialIsbnList.size() == 0 ) {
			
			materialIdList.removeAll(Arrays.asList(Transaction_Constants.EMPTY));
			
			if ( materialIdList.size() == 0 ) {
				EaiException exc = new EaiException();
				ErrorList errorList = new ErrorList();
				List<com.hmco.eai.Error> listError = errorList.getError();
				com.hmco.eai.Error e = new Error();
				e.setErrorCategory(INVALID_MATID);
				e.setErrorCode(INVALID_MATID);
				e.setErrorMessage(INVALID_MATID);
				listError.add(e);
				exc.setErrorList(errorList);
				String errorBody = Converter.convertBodyToString(exc.getErrorList());
				log.toException(Converter.convertBodyToString(getMaterialDetailRequest), ERROR_RQST,
						EAI_Log.EXEPTION_BUSINESS, errorBody);
				producer.sendBody(log.clone());
				throw new MaterialException(ERROR_RQST, exc);
			}
		} else if ( materialIsbnList.size() > 0 && materialIdList.size() == 0 ) {
			
			materialIsbnList.removeAll(Arrays.asList(Transaction_Constants.EMPTY));
			
			if ( materialIsbnList.size() == 0 ) {
				EaiException exc = new EaiException();
				ErrorList errorList = new ErrorList();
				List<com.hmco.eai.Error> listError = errorList.getError();
				com.hmco.eai.Error e = new Error();
				e.setErrorCategory(INVALID_ISBN);
				e.setErrorCode(INVALID_ISBN);
				e.setErrorMessage(INVALID_ISBN);
				listError.add(e);
				exc.setErrorList(errorList);
				String errorBody = Converter.convertBodyToString(exc.getErrorList());
				log.toException(Converter.convertBodyToString(getMaterialDetailRequest), ERROR_RQST,
						EAI_Log.EXEPTION_BUSINESS, errorBody);
				producer.sendBody(log.clone());
				throw new MaterialException(ERROR_RQST, exc);
			}
		} else if ( materialIsbnList.size() > 0 && materialIdList.size() > 0 ) {
			
			materialIsbnList.removeAll(Arrays.asList(Transaction_Constants.EMPTY));
			materialIdList.removeAll(Arrays.asList(Transaction_Constants.EMPTY));

			if ( materialIsbnList.size() == 0 && materialIdList.size() == 0 ) {
				EaiException exc = new EaiException();
				ErrorList errorList = new ErrorList();
				List<com.hmco.eai.Error> listError = errorList.getError();
				
				com.hmco.eai.Error e1 = new Error();
				e1.setErrorCategory(INVALID_MATID);
				e1.setErrorCode(INVALID_MATID);
				e1.setErrorMessage(INVALID_MATID);
				listError.add(e1);
				
				com.hmco.eai.Error e2 = new Error();
				e2.setErrorCategory(INVALID_ISBN);
				e2.setErrorCode(INVALID_ISBN);
				e2.setErrorMessage(INVALID_ISBN);
				listError.add(e2);
				exc.setErrorList(errorList);
				String errorBody = Converter.convertBodyToString(exc.getErrorList());
				log.toException(Converter.convertBodyToString(getMaterialDetailRequest), ERROR_RQST,
						EAI_Log.EXEPTION_BUSINESS, errorBody);
				producer.sendBody(log.clone());
				throw new MaterialException(ERROR_RQST, exc);
			}
		} 
		
		if ( materialIdList.size() > 0 || materialIsbnList.size() > 0 ) {
			materialIdList.removeAll(Arrays.asList(Transaction_Constants.EMPTY));
			materialIsbnList.removeAll(Arrays.asList(Transaction_Constants.EMPTY));
			EaiException exc = new EaiException();
			ErrorList errorList = new ErrorList();
			List<com.hmco.eai.Error> listError = errorList.getError();
			boolean isError = false;
			for (String mat : materialIdList) {
				if ( mat != null && mat.trim().length() > 18) {
					isError = true;
					com.hmco.eai.Error e = new Error();
					e.setErrorCategory(Transaction_Constants.ERROR_CATEGORY);
					e.setErrorCode(Transaction_Constants.ERROR_CODE);
					e.setErrorMessage("materialID " + mat + Transaction_Constants.SPACE + Transaction_Constants.MATID_LENGTH_ERROR);
					listError.add(e);
				}
			}
			for (String isbn : materialIsbnList) {
				if ( isbn != null && isbn.trim().length() > 18) {
					isError = true;
					com.hmco.eai.Error e = new Error();
					e.setErrorCategory(Transaction_Constants.ERROR_CATEGORY);
					e.setErrorCode(Transaction_Constants.ERROR_CODE);
					e.setErrorMessage("isbn " + isbn + Transaction_Constants.SPACE + Transaction_Constants.MATID_LENGTH_ERROR);
					listError.add(e);
				}
			}
						
			if(isError) {
				exc.setErrorList(errorList);
				String errorBody = Converter.convertBodyToString(exc.getErrorList());
				log.toException(Converter.convertBodyToString(getMaterialDetailRequest), ERROR_RQST,
						EAI_Log.EXEPTION_BUSINESS, errorBody);
				producer.sendBody(log.clone());
				throw new MaterialException(ERROR_RQST, exc);
			}
		}

		producer.sendBody(log.clone());

		String customerId = getMaterialDetailRequest.getCustomerID();
		Holder<hmh.sap.rfc.Zmaterial_DetailsType[]> I_Material_Detail = new Holder<Zmaterial_DetailsType[]>();
		Holder<hmh.sap.rfc.ZcompType[]> I_Components = new Holder<ZcompType[]>();
		Holder<hmh.sap.rfc.ZsubsType[]> I_Subscription = new Holder<ZsubsType[]>();

		long requestTime = 0;
		long responseTime = 0;
		try {
			requestTime = System.currentTimeMillis();

			//
			// SAP Transaction Bean
			//
			log.toRequest();
			producer.sendBody(log.clone());

			bean.getMaterialDetail(customerId, matIDs, isbnIDs,
					I_Material_Detail, I_Components, I_Subscription);

			responseTime = System.currentTimeMillis();

			log.toResponse();
			producer.sendBody(log.clone());

			logger.debug("SAP time was " + (responseTime - requestTime)
					+ " ms.");

			com.hmco.eai.ots.materialnew.MaterialDetailList ret = makeMatDetailListEx(
					customerId, I_Material_Detail.value, I_Components.value,
					I_Subscription.value);

			return ret;

		} catch (Exception ex) {
			ex.printStackTrace(System.err);
			logger.error("Exception calling getMaterialDetail", ex);
			requestTime = responseTime = 0;

			StringWriter stackTrace = new StringWriter();
			ex.printStackTrace(new PrintWriter(stackTrace));
			stackTrace.flush();

			log.toException(
					Converter.convertBodyToString(getMaterialDetailRequest),
					ex.getMessage(), EAI_Log.EXEPTION_SYSTEM,
					stackTrace.toString());
			producer.sendBody(log.clone());
			throw new MaterialException(ex.getMessage());

		} finally {
			long exitTime = System.currentTimeMillis();
			logger.debug("servicemix time was "
					+ ((exitTime - enterTime) - (responseTime - requestTime))
					+ " ms.");
			logger.debug("execution time was " + (exitTime - enterTime)
					+ " ms.");
			logger.debug("getMaterialDetail ends");

			log.toExit();
			producer.sendBody(log.clone());
		}

//		return null;
	}

	// --------------------------------------------------------
	//
	// ATPEx interface methods
	//
	// --------------------------------------------------------

	@Override
	public GETATPRESPONSE getMaterialATP(GETATPREQUEST getMaterialATP)
			throws GetMaterialATPException {

		logger.debug("getMaterialATP begin");
		long enterTime = System.currentTimeMillis();

		boolean isError = false;
		EaiException exc = new EaiException();
		ErrorList errorList = new ErrorList();
		List<com.hmco.eai.Error> listError = errorList.getError();
		
		String country = getMaterialATP.getCOUNTRY();
		String region = getMaterialATP.getREGION();
		String custId = getMaterialATP.getCUSTID();
		String division = getMaterialATP.getDIVISION();
		String distChnl = getMaterialATP.getDISTCHNL() != null && getMaterialATP.getDISTCHNL().trim().length() > 0 ? getMaterialATP.getDISTCHNL() : "10";
		String salesOrg = getMaterialATP.getSALESORG() != null && getMaterialATP.getSALESORG().trim().length() > 0 ? getMaterialATP.getSALESORG() : "HMC1";
		String rqstLookupValue = hasher.getValue(
				Transaction_Constants.ITEM_TYPE,
				Transaction_Constants.ENTERPRISE, getMaterialATP.getITEMTYPE(),
				Transaction_Constants.SAP); 
		if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (getMaterialATP.getITEMTYPE() != null && getMaterialATP.getITEMTYPE().trim().length() > 0)) {
			isError = true;
			com.hmco.eai.Error e = new Error();
			e.setErrorCategory(Transaction_Constants.ITEM_TYPE_UNEXPECTED);
			e.setErrorCode(Transaction_Constants.ITEM_TYPE_UNEXPECTED);
			e.setErrorMessage(Transaction_Constants.ITEM_TYPE_UNEXPECTED);
			listError.add(e);
		}
		String itemType = rqstLookupValue;
		
		rqstLookupValue = hasher.getValue(
				Transaction_Constants.TRANSACTION_TYPE,
				Transaction_Constants.ENTERPRISE, getMaterialATP.getORDERTYPE(),
				Transaction_Constants.SAP);
		if( (rqstLookupValue == null || (rqstLookupValue != null && rqstLookupValue.trim().length() == 0)) && (getMaterialATP.getORDERTYPE() != null && getMaterialATP.getORDERTYPE().trim().length() > 0)) {
			isError = true;
			com.hmco.eai.Error e = new Error();
			e.setErrorCategory(Transaction_Constants.TRANSACTION_TYPE_UNEXPECTED);
			e.setErrorCode(Transaction_Constants.TRANSACTION_TYPE_UNEXPECTED);
			e.setErrorMessage(Transaction_Constants.TRANSACTION_TYPE_UNEXPECTED);
			listError.add(e);
		}
		String orderType = rqstLookupValue;
		
		Holder<hmh.sap.rfc.Zmaterial_DetailsType[]> I_Material_Detail = new Holder<Zmaterial_DetailsType[]>();

		List<String> materialIdList = getMaterialATP.getATPMATERIALLIST()
				.getMATNR();
		materialIdList.removeAll(Arrays.asList(Transaction_Constants.EMPTY));

		String[] matIDs = materialIdList.toArray(new String[0]);

		EAI_Log log = EAI_Log.enter(
				arrayToString(matIDs, Transaction_Constants.COMMA_SEPERATOR),
				GET_MATERIAL_ATP, EAI_Log.SYS_WebService, EAI_Log.SYS_SAP);
		
		if ( (materialIdList == null
				|| (materialIdList != null && materialIdList.size() <= 0)) ) {
			isError = true;
			com.hmco.eai.Error e = new Error();
			e.setErrorCategory(INVALID_MATID);
			e.setErrorCode(INVALID_MATID);
			e.setErrorMessage(INVALID_MATID);
			listError.add(e);
		}
		if(isError) {
			exc.setErrorList(errorList);
			String errorBody = Converter.convertBodyToString(exc.getErrorList());
			log.toException(Converter.convertBodyToString(getMaterialATP), ERROR_RQST,
					EAI_Log.EXEPTION_BUSINESS, errorBody);
			producer.sendBody(log.clone());
			throw new GetMaterialATPException(ERROR_RQST, exc);
		}

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

			bean.getMaterialDetailAtp(matIDs, country, region, custId,
					division, itemType, orderType, distChnl, salesOrg, I_Material_Detail);

			responseTime = System.currentTimeMillis();

			log.toResponse();
			producer.sendBody(log.clone());

			logger.debug("SAP time was " + (responseTime - requestTime)
					+ " ms.");

			GETATPRESPONSE ret = makeMatAtpList(I_Material_Detail.value);

			return ret;

		} catch (Exception ex) {
			ex.printStackTrace(System.err);
			logger.error("Exception calling getMaterialATP", ex);
			requestTime = responseTime = 0;

			StringWriter stackTrace = new StringWriter();
			ex.printStackTrace(new PrintWriter(stackTrace));
			stackTrace.flush();

			log.toException(
					Converter.convertBodyToString(getMaterialATP),
					ex.getMessage(), EAI_Log.EXEPTION_SYSTEM,
					stackTrace.toString());
			producer.sendBody(log.clone());
			throw new GetMaterialATPException(ex.getMessage());

		} finally {
			long exitTime = System.currentTimeMillis();
			logger.debug("servicemix time was "
					+ ((exitTime - enterTime) - (responseTime - requestTime))
					+ " ms.");
			logger.debug("execution time was " + (exitTime - enterTime)
					+ " ms.");
			logger.debug("getMaterialATP ends");

			log.toExit();
			producer.sendBody(log.clone());
		}

//		return null;
	}

	private GETATPRESPONSE makeMatAtpList(Zmaterial_DetailsType[] dtlType) {

		HashMap<String, Zmaterial_DetailsType> atpDtlMap = new HashMap<String, Zmaterial_DetailsType>();
		for (int i = 0; i < dtlType.length; i++)
			atpDtlMap.put(dtlType[i].getMatnr(), dtlType[i]);

		GETATPRESPONSE resp = new GETATPRESPONSE();
		List<ATPDETAILLIST> atpList = resp.getATPDETAILLIST();
		for (Iterator<String> it = atpDtlMap.keySet().iterator(); it.hasNext();) {
			String matid = it.next();
			Zmaterial_DetailsType in = atpDtlMap.get(matid);
			ATPDETAILLIST atpdetaillist = new ATPDETAILLIST();
			atpdetaillist.setMATNR(in.getMatnr());
			atpdetaillist.setQUANTITY(in.getQuan_Stock() != null ? in
					.getQuan_Stock().toString() : Transaction_Constants.EMPTY);
			atpList.add(atpdetaillist);
		}
		return resp;
	}

	@Override
	public com.hmco.eai.ots.material.getatpnew.GETATPRESPONSE getMaterialATPEx(
			com.hmco.eai.ots.material.getatpnew.GETATPREQUEST getATPREQUEST)
			throws GetMaterialATPException {
		// TODO Auto-generated method stub

		// /////////////////////////////////////////////////////
		//
		// not needed. there is no changes in wsdl types
		//
		// ////////////////////////////////////////////////////
		return null;
	}

	@Override
	public AsyncRequestId getMaterialATPAsync(
			GETATPREQUEST getMaterialATPRequest) throws GetMaterialATPException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GETATPRESPONSE getMaterialATPAsyncResult(
			AsyncRequestId asyncRequestId) throws GetMaterialATPException {
		// TODO Auto-generated method stub
		return null;
	}

	// --------------------------------------------------------
	//
	// Helper methods
	//
	// --------------------------------------------------------

	private MaterialDetailList makeMatDetailList(String customerId,
			Zmaterial_DetailsType[] matDtls, ZcompType[] compTypes,
			ZsubsType[] subTypes) throws DatatypeConfigurationException {

		Map<Pair<String, String>, String> isbnMap = new HashMap<Pair<String, String>, String>();

		Map<String, Zmaterial_DetailsType> matDtlMap = new HashMap<String, Zmaterial_DetailsType>();
		for (int i = 0; i < matDtls.length; i++) {
			matDtlMap.put(matDtls[i].getMatnr(), matDtls[i]);
			isbnMap.put(new Pair<String, String>(matDtls[i].getMatnr(),
					matDtls[i].getIdcodetype()), matDtls[i].getIsbn());
		}

		ArrayListMultimap<String, ZcompType> compTypeMap = ArrayListMultimap
		.<String, ZcompType> create() ;
		for (int i = 0; i < compTypes.length; i++) {
			compTypeMap.put(compTypes[i].getMatnr(), compTypes[i]);
		}

		ArrayListMultimap<String, ZsubsType> subTypeMap = ArrayListMultimap
		.<String, ZsubsType> create() ;
		for (int i = 0; i < subTypes.length; i++) {
			subTypeMap.put(subTypes[i].getMatnr(), subTypes[i]);
		}

		MaterialDetailList returnList = new MaterialDetailList();
		List<MaterialDetail> materialList = returnList.getMaterialDetail();
		String respLookupValue = null;
		for (Iterator<String> it = matDtlMap.keySet().iterator(); it.hasNext();) {
			String matId = it.next();
			MaterialDetail detail = new MaterialDetail();
			Zmaterial_DetailsType input = matDtlMap.get(matId);
			detail.setAuthor(input.getAuthor());
			detail.setAvailableDate(toXMLGregorianCalendar(input
					.getAvailable_Dt()));
			detail.setCopyrightYear(input.getCopy_Rt_Yr());
			if(input.getEdition_Type() != null && input.getEdition_Type().trim().length() > 0) {
				respLookupValue = hasher.getValue(
						Transaction_Constants.EDITION_CATEGORY,
						Transaction_Constants.SAP, input.getEdition_Type(),
						Transaction_Constants.ENTERPRISE);
				
				detail.setEditionCategory((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.EDITION_CATEGORY_UNEXPECTED : respLookupValue);
				/*if(editionType != null && editionType.trim().length() > 0) {
					detail.setEditionCategory(editionType);	
				}*/
			} else {
				detail.setEditionCategory(Transaction_Constants.EDITION_CATEGORY_UNEXPECTED);	
			}
			
			detail.setFullDescription(input.getFull_Desc());
			detail.setGenItemCategory(input.getGen_Item_Category());
			detail.setInternalDescription(input.getInt_Desc());
			

			/*if(input.getIdcodetype() != null) {
				if(input.getIdcodetype().equalsIgnoreCase(Transaction_Constants.ISBN10)) {
					detail.setIsbn10(input.getIsbn());	
				} else if(input.getIdcodetype().equalsIgnoreCase(Transaction_Constants.ISBN13)) {
					detail.setIsbn13(input.getIsbn());
				}
					
			}*/
			
			detail.setIsbn10(isbnMap.get(new Pair<String, String>(matId,
					Transaction_Constants.ISBN10)));
			detail.setIsbn13(isbnMap.get(new Pair<String, String>(matId,
					Transaction_Constants.ISBN13)));
			
			/*logger.info("ISBN 10 ::: " + isbnMap.get(new Pair<String, String>(matId,
					Transaction_Constants.ISBN10)) );
			logger.info("ISBN 13 ::: " + isbnMap.get(new Pair<String, String>(matId,
					Transaction_Constants.ISBN13)) );
			detail.setIsbn10(isbnMap.get(new Pair<String, String>(matId,
					Transaction_Constants.ISBN10)));
			detail.setIsbn13(isbnMap.get(new Pair<String, String>(matId,
					Transaction_Constants.ISBN13)));*/

			if (input.getIs_Subscription() != null) {
				detail.setIsSubscription(input.getIs_Subscription()
						.equalsIgnoreCase("1") || input.getIs_Subscription().equalsIgnoreCase(Transaction_Constants.TRUE));
			}
			detail.setListPrice(input.getList_Price() != null ? input
					.getList_Price().doubleValue() : 0.0);
			
			if(input.getMat_Grp() != null && input.getMat_Grp().trim().length() > 0) {
				respLookupValue = hasher.getValue(
						Transaction_Constants.MATERIAL_GROUP,
						Transaction_Constants.SAP, input.getMat_Grp(),
						Transaction_Constants.ENTERPRISE);
				detail.setMaterialGroup((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.MATERIAL_GROUP_UNEXPECTED : respLookupValue);
				/*if(matGroup != null && matGroup.trim().length() > 0) {
					detail.setMaterialGroup(matGroup);	
				} */
			} else {
				detail.setMaterialGroup(Transaction_Constants.MATERIAL_GROUP_UNEXPECTED);
			}
			
			detail.setMaterialID(matId);
			if(input.getMat_Stat() != null && input.getMat_Stat().trim().length()  >0) {
				respLookupValue = hasher.getValue(
						Transaction_Constants.MATERIAL_STATUS,
						Transaction_Constants.SAP, input.getMat_Stat(),
						Transaction_Constants.ENTERPRISE);
				detail.setMaterialStatus((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.MATERIAL_STATUS_UNEXPECTED : respLookupValue);
				/*if(matStatus != null && matStatus.trim().length() > 0) {
					detail.setMaterialStatus(matStatus);	
				} 				*/
			} else {
				detail.setMaterialStatus(Transaction_Constants.MATERIAL_STATUS_UNEXPECTED);
			}
			
			detail.setMaterialStatusDescription(input.getMat_Stat_Desc());
			
			if(input.getMedia_Type() != null && input.getMedia_Type().trim().length() > 0) {
				respLookupValue = hasher.getValue(
						Transaction_Constants.MEDIA_TYPE,
						Transaction_Constants.SAP, input.getMedia_Type(),
						Transaction_Constants.ENTERPRISE);
				detail.setMediaType((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.MEDIA_TYPE__UNEXPECTED : respLookupValue);
				/*if(mediaType != null && mediaType.trim().length() > 0) {
					detail.setMediaType(mediaType);	
				}*/ 				
			} else {
				detail.setMediaType(Transaction_Constants.MEDIA_TYPE__UNEXPECTED);
			}
			
			detail.setNetPrice(input.getNet_Price() != null ? Double
					.valueOf(input.getNet_Price()) / 100 : 0.0);
			
			String prodHier = input.getProduct_Hier();
			
			for (int i = 0; prodHier != null && i < prodHier.length()
					&& i + 2 <= prodHier.length(); ) {

				if (i == 0) {
					
					if(prodHier.substring(i, i + 2) != null && prodHier.substring(i, i + 2).trim().length() > 0) {
						respLookupValue = hasher.getValue(
								Transaction_Constants.DIVISION,
								Transaction_Constants.SAP,
								prodHier.substring(i, i + 2),
								Transaction_Constants.ENTERPRISE) ;
						detail.setProductDivision((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.DIVISION_CODE_UNEXPECTED : respLookupValue);
						/*if(prodDivision != null && prodDivision.trim().length() > 0) {
							detail.setProductDivision(prodDivision);	
						}*/ 
					} else {
						detail.setProductDivision(Transaction_Constants.DIVISION_CODE_UNEXPECTED);
					}
					
					detail.setPhLevelCode1(prodHier.substring(i, i + 2));
					i+=2;
				} else if (i == 2) {
					detail.setPhLevelCode2(prodHier.substring(i, i + 2));
					i+=2;
				} else if (i == 4) {
					detail.setPhLevelCode3(prodHier.substring(i, i + 2));
					i+=2;
				} else if (i == 6) {
					detail.setPhLevelCode4(prodHier.substring(i, i + 3));
					i+=3;
				} else if (i == 9) {
					detail.setPhLevelCode5(prodHier.substring(i, i + 2));
					i+=2;
				}
			}
			detail.setQuantityInStock(input.getQuan_Stock().intValue());
			
			if(input.getRestriction() != null && input.getRestriction().trim().length() > 0) {
				respLookupValue = hasher.getValue(
						Transaction_Constants.MATERIAL_RESTRICTION,
						Transaction_Constants.SAP, input.getRestriction(),
						Transaction_Constants.ENTERPRISE);
				detail.setRestriction((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.MATERIAL_RESTRICTION_UNEXPECTED : respLookupValue);
				/*if( matRestriction != null &&  matRestriction.trim().length() > 0) {
					detail.setRestriction(matRestriction);	
				}*/ 				
			} else {
				detail.setRestriction(Transaction_Constants.MATERIAL_RESTRICTION_UNEXPECTED);
			}
			
			detail.setSubstituted(input.getSubst_Mat() != null
					&& input.getSubst_Mat().length() > 0);
			detail.setUnitsPerCarton(input.getUnits_Per_Crtn().intValue());
			List<Component> compList = detail.getComponent();
			compList = makeMatComponentList(compList, compTypeMap.get(input.getMatnr()));
			List<SubscriptionTerm> subTermList = detail.getSubscriptionTerm();
			subTermList = makeSubTermList(subTermList, subTypeMap.get(input.getMatnr()));

			materialList.add(detail);
		}
		return returnList;
	}

	private com.hmco.eai.ots.materialnew.MaterialDetailList makeMatDetailListEx(
			String customerId, Zmaterial_DetailsType[] matDtls,
			ZcompType[] compTypes, ZsubsType[] subTypes)
			throws DatatypeConfigurationException {

		Map<Pair<String, String>, String> isbnMap = new HashMap<Pair<String, String>, String>();

		Map<String, Zmaterial_DetailsType> cusDtlMap = new HashMap<String, Zmaterial_DetailsType>();
		for (int i = 0; i < matDtls.length; i++) {
			cusDtlMap.put(matDtls[i].getMatnr(), matDtls[i]);
			isbnMap.put(new Pair<String, String>(matDtls[i].getMatnr(),
					matDtls[i].getIdcodetype()), matDtls[i].getIsbn());
		}

		ArrayListMultimap<String, ZcompType> compTypeMap = ArrayListMultimap
		.<String, ZcompType> create() ;
		for (int i = 0; i < compTypes.length; i++) {
			compTypeMap.put(compTypes[i].getMatnr(), compTypes[i]);
		}
		
		ArrayListMultimap<String, ZsubsType> subTypeMap = ArrayListMultimap
		.<String, ZsubsType> create() ;
		for (int i = 0; i < subTypes.length; i++) {
			subTypeMap.put(subTypes[i].getMatnr(), subTypes[i]);
		}

		com.hmco.eai.ots.materialnew.MaterialDetailList returnList = new com.hmco.eai.ots.materialnew.MaterialDetailList();
		List<com.hmco.eai.ots.materialnew.MaterialDetail> materialList = returnList
				.getMaterialDetail();
		String respLookupValue = null;
		for (Iterator<String> it = cusDtlMap.keySet().iterator(); it.hasNext();) {
			String matId = it.next();
			com.hmco.eai.ots.materialnew.MaterialDetail detail = new com.hmco.eai.ots.materialnew.MaterialDetail();
			Zmaterial_DetailsType input = cusDtlMap.get(matId);
			detail.setAuthor(input.getAuthor());
			detail.setAvailableDate(toXMLGregorianCalendar(input
					.getAvailable_Dt()));
			detail.setCopyrightYear(input.getCopy_Rt_Yr());
			
			if(input.getEdition_Type() != null && input.getEdition_Type().trim().length() > 0) {
				respLookupValue = hasher.getValue(
						Transaction_Constants.EDITION_CATEGORY,
						Transaction_Constants.SAP, input.getEdition_Type(),
						Transaction_Constants.ENTERPRISE);
				detail.setEditionCategory((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.EDITION_CATEGORY_UNEXPECTED : respLookupValue);
				/*if ( editionType != null && editionType.trim().length() > 0 ) {
					detail.setEditionCategory(editionType);	
				} 				*/
			} else {
				detail.setEditionCategory(Transaction_Constants.EDITION_CATEGORY_UNEXPECTED);
			}
			
			detail.setFullDescription(input.getFull_Desc());
			detail.setGenItemCategory(input.getGen_Item_Category());
			detail.setInternalDescription(input.getInt_Desc());
			detail.setIsbn10(isbnMap.get(new Pair<String, String>(matId,
					Transaction_Constants.ISBN10)));
			detail.setIsbn13(isbnMap.get(new Pair<String, String>(matId,
					Transaction_Constants.ISBN13)));

			if (input.getIs_Subscription() != null) {
				detail.setIsSubscription(input.getIs_Subscription()
						.equalsIgnoreCase(Transaction_Constants.X));
			}
			detail.setListPrice(input.getList_Price() != null ? input
					.getList_Price().doubleValue() : 0.0);

			if(input.getMat_Grp() != null && input.getMat_Grp().trim().length() > 0) {
				respLookupValue = hasher.getValue(
						Transaction_Constants.MATERIAL_GROUP,
						Transaction_Constants.SAP, input.getMat_Grp(),
						Transaction_Constants.ENTERPRISE);
				detail.setMaterialGroup((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.MATERIAL_GROUP_UNEXPECTED : respLookupValue);
				/*if( matGroup != null && matGroup.trim().length() > 0 ) {
					detail.setMaterialGroup(matGroup);
				}*/
			} else {
				detail.setMaterialGroup(Transaction_Constants.MATERIAL_GROUP_UNEXPECTED);	
			}
			
			detail.setMaterialID(matId);
			
			if(input.getMat_Stat() != null && input.getMat_Stat().trim().length() > 0) {
				respLookupValue = hasher.getValue(
						Transaction_Constants.MATERIAL_STATUS,
						Transaction_Constants.SAP, input.getMat_Stat(),
						Transaction_Constants.ENTERPRISE);
				detail.setMaterialStatus((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.MATERIAL_STATUS_UNEXPECTED : respLookupValue);
				/*if( matStatus != null && matStatus.trim().length() > 0 ) {
					detail.setMaterialStatus(matStatus);	
				}*/	
			} else {
				detail.setMaterialStatus(Transaction_Constants.MATERIAL_STATUS_UNEXPECTED);
			}
			
			detail.setMaterialStatusDescription(input.getMat_Stat_Desc());
			if(input.getMedia_Type() != null && input.getMedia_Type().trim().length() > 0) {
				respLookupValue = hasher.getValue(
						Transaction_Constants.MEDIA_TYPE,
						Transaction_Constants.SAP, input.getMedia_Type(),
						Transaction_Constants.ENTERPRISE);
				detail.setMediaType((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.MEDIA_TYPE__UNEXPECTED : respLookupValue);
				/*if( mediaType != null && mediaType.trim().length() > 0 ) {
					detail.setMediaType(mediaType);
				}*/	
			} else {
				detail.setMediaType(Transaction_Constants.MEDIA_TYPE__UNEXPECTED);	
			}
			
			detail.setNetPrice(input.getNet_Price() != null ? Double
					.valueOf(input.getNet_Price()) : 0.0);
			String prodHier = input.getProduct_Hier();
			for (int i = 0; prodHier != null && i < prodHier.length()
					&& i + 2 <= prodHier.length();) {

				if (i == 0) {
					if(prodHier.substring(i, i + 2).trim().length() > 0) {
						respLookupValue = hasher.getValue(
								Transaction_Constants.DIVISION,
								Transaction_Constants.SAP,
								prodHier.substring(i, i + 2),
								Transaction_Constants.ENTERPRISE);
						detail.setProductDivision((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.DIVISION_CODE_UNEXPECTED : respLookupValue);
						/*if(prodDiv.trim().length() > 0) {
							detail.setProductDivision(prodDiv);	
						}*/	
					} else {
						detail.setProductDivision(Transaction_Constants.DIVISION_CODE_UNEXPECTED);
					}
					
					detail.setPhLevelCode1(prodHier.substring(i, i + 2));
					i+=2;
				} else if (i == 2) {
					detail.setPhLevelCode2(prodHier.substring(i, i + 2));
					i+=2;
				} else if (i == 4) {
					detail.setPhLevelCode3(prodHier.substring(i, i + 2));
					i+=2;
				} else if (i == 6) {
					detail.setPhLevelCode4(prodHier.substring(i, i + 3));
					i+=3;
				} else if (i == 9) {
					detail.setPhLevelCode5(prodHier.substring(i, i + 2));
					i+=2;
				}
			}
			detail.setQuantityInStock(input.getQuan_Stock().intValue());
			if(input.getRestriction() != null && input.getRestriction().trim().length() > 0) {
				respLookupValue = hasher.getValue(
						Transaction_Constants.MATERIAL_RESTRICTION,
						Transaction_Constants.SAP, input.getRestriction(),
						Transaction_Constants.ENTERPRISE);
				detail.setRestriction((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.MATERIAL_RESTRICTION_UNEXPECTED : respLookupValue);
				/*if( matRest != null &&  matRest.trim().length() > 0) {
					detail.setRestriction(matRest);	
				}*/	
			} else {
				detail.setRestriction(Transaction_Constants.MATERIAL_RESTRICTION_UNEXPECTED);
			}
			
			detail.setSubstituted(input.getSubst_Mat() != null
					&& input.getSubst_Mat().length() > 0);
			detail.setUnitsPerCarton(input.getUnits_Per_Crtn().intValue());
			List<com.hmco.eai.ots.materialnew.Component> compList = detail
					.getComponent();
			compList = makeMatComponentListEx(compList, compTypeMap.get(input.getMatnr()));
			List<com.hmco.eai.ots.materialnew.SubscriptionTerm> subTermList = detail
					.getSubscriptionTerm();
			subTermList = makeSubTermListEx(subTermList, subTypeMap.get(input.getMatnr()));

			// additional fields for ex method
			detail.setOldmaterialnumber(input.getBismt());

			materialList.add(detail);
		}
		return returnList;
	}

	private List<SubscriptionTerm> makeSubTermList(
			List<SubscriptionTerm> subTermList,
			List<ZsubsType> list)
			throws DatatypeConfigurationException {
		String respLookupValue = null;
		for (ZsubsType inSub : list) {
			SubscriptionTerm subTerm = new SubscriptionTerm();

			subTerm.setDuration(inSub.getTerm_Duration() != null ? Integer
					.valueOf(inSub.getTerm_Duration()) : 0);
			subTerm.setEndDate(toXMLGregorianCalendar(inSub.getEnd_Date()));
			subTerm.setRate(inSub.getList_Price() != null ? inSub
					.getList_Price().doubleValue() : 0.0);
			subTerm.setStartDate(toXMLGregorianCalendar(inSub.getEffective_Dt()));
			
			if(inSub.getTerm_Unit() != null && inSub.getTerm_Unit().trim().length() > 0) {
				respLookupValue = hasher.getValue(
						Transaction_Constants.SUBSCRIPTION_TERM,
						Transaction_Constants.SAP, inSub.getTerm_Unit(),
						Transaction_Constants.ENTERPRISE);
				subTerm.setUnit((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.SUBSCRIPTION_TERM_UNIT_UNEXPECTED : respLookupValue);
				/*if( subUnit != null && subUnit.trim().length() > 0 ) {
					subTerm.setUnit(subUnit);
				}*/
			} else {
				subTerm.setUnit(Transaction_Constants.SUBSCRIPTION_TERM_UNIT_UNEXPECTED);				
			}
			
			subTermList.add(subTerm);
		}
		return subTermList;
	}

	private List<com.hmco.eai.ots.materialnew.SubscriptionTerm> makeSubTermListEx(
			List<com.hmco.eai.ots.materialnew.SubscriptionTerm> subTermList,
			List<ZsubsType> list)
			throws DatatypeConfigurationException {
		String respLookupValue = null;
		for (ZsubsType inSub : list) {
			com.hmco.eai.ots.materialnew.SubscriptionTerm subTerm = new com.hmco.eai.ots.materialnew.SubscriptionTerm();

			subTerm.setDuration(inSub.getTerm_Duration() != null ? Integer
					.valueOf(inSub.getTerm_Duration()) : 0);
			subTerm.setEndDate(toXMLGregorianCalendar(inSub.getEnd_Date()));
			subTerm.setRate(inSub.getList_Price() != null ? inSub
					.getList_Price().doubleValue() : 0.0);
			subTerm.setStartDate(toXMLGregorianCalendar(inSub.getEffective_Dt()));
			if(inSub.getTerm_Unit() != null && inSub.getTerm_Unit().trim().length() > 0) {
				respLookupValue = hasher.getValue(
						Transaction_Constants.SUBSCRIPTION_TERM,
						Transaction_Constants.SAP, inSub.getTerm_Unit(),
						Transaction_Constants.ENTERPRISE);
				subTerm.setUnit((respLookupValue != null && respLookupValue.trim().length() == 0) || respLookupValue == null ? Transaction_Constants.SUBSCRIPTION_TERM_UNIT_UNEXPECTED : respLookupValue);
				/*if( subUnit != null && subUnit.trim().length() > 0 ) {
					subTerm.setUnit(subUnit);
				}*/	
			} else {
				subTerm.setUnit(Transaction_Constants.SUBSCRIPTION_TERM_UNIT_UNEXPECTED);				
			}
			
			subTermList.add(subTerm);
		}
		return subTermList;
	}

	private List<Component> makeMatComponentList(List<Component> compList,
			List<ZcompType> list) {
		for (ZcompType inCom : list) {
			Component comp = new Component();
			comp.setBomType(inCom.getBom_Type());
			comp.setIsbn(inCom.getIsbn());
			comp.setMaterialID(inCom.getComponent());
			comp.setQuantity(inCom.getComp_Qty() != null ? inCom.getComp_Qty()
					.intValue() : 0);
			compList.add(comp);
		}
		return compList;
	}

	private List<com.hmco.eai.ots.materialnew.Component> makeMatComponentListEx(
			List<com.hmco.eai.ots.materialnew.Component> compList,
			List<ZcompType> list) {
		for (ZcompType inCom : list) {
			com.hmco.eai.ots.materialnew.Component comp = new com.hmco.eai.ots.materialnew.Component();
			comp.setBomType(inCom.getBom_Type());
			comp.setIsbn(inCom.getIsbn());
			comp.setMaterialID(inCom.getComponent());
			comp.setQuantity(inCom.getComp_Qty() != null ? inCom.getComp_Qty()
					.intValue() : 0);
			compList.add(comp);
		}
		return compList;
	}

	private MaterialSubstitutionList makeMatSubstList(
			Zmatnr_SubstituteType[] subsTypes) {

		ArrayListMultimap<String, Zmatnr_SubstituteType> subMap = ArrayListMultimap
				.<String, Zmatnr_SubstituteType> create();
		for (int i = 0; i < subsTypes.length; i++)
			subMap.put(subsTypes[i].getMatnr(), subsTypes[i]);

		MaterialSubstitutionList returnList = new MaterialSubstitutionList();
		List<Substitution> subsList = returnList.getMaterialSubstitution();
		for (Iterator<String> it = subMap.keySet().iterator(); it.hasNext();) {
			String matID = it.next();
			if (matID != null
					&& !matID.endsWith(Transaction_Constants.MAT_ID_SUFFIX)) {
				List<Zmatnr_SubstituteType> inSubsList = subMap.get(matID);
				Substitution subs = new Substitution();
				List<SubstitutionValue> subValueList = subs
						.getSubstitutionValue();

				String isbn = null;
				String matnr = null;
				for (Zmatnr_SubstituteType subType : inSubsList) {
					SubstitutionValue subValue = new SubstitutionValue();
					subValue.setSubstituteID(subType.getSub_Title_Number());
					subValue.setSubstituteISBN(subType.getSub_Isbn());
					subValue.setDescription(subType.getDescription());
					subValue.setAutoSubstitute(subType.getAuto_Substitute() != null
							&& subType.getAuto_Substitute().length() > 0 ? true
							: false);
					subValue.setUsePrimePrice(subType.getUse_Prime_Price() != null
							&& subType.getUse_Prime_Price().length() > 0 ? true
							: false);
					subValue.setApplySale(subType.getApply_Sale() != null
							&& subType.getApply_Sale().length() > 0 ? true
							: false);
					subValue.setApplySample(subType.getApply_Sample() != null
							&& subType.getApply_Sample().length() > 0 ? true
							: false);
					isbn = subType.getIsbn();
					matnr = subType.getMatnr();
					subValueList.add(subValue);
				}

				Substitution.Key key = new Substitution.Key();
				key.setIsbn(isbn);
				key.setMaterialID(matnr);
				subs.setKey(key);
				subsList.add(subs);
			}
		}
		return returnList;
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
	
	public Long getMaterialAvailability(Material it) throws hmh.rs.pojo.ErrorException {
		Long quantity = null;
		logger.debug("getMaterialAvailability begin");
		long enterTime = System.currentTimeMillis();
		long requestTime = 0;
		long responseTime = 0;
		try {
			requestTime = System.currentTimeMillis();
			
			Holder<BigDecimal> quantityHolder = new Holder<BigDecimal>(); 
			BapireturnType bapiRet = bean.getMaterialAvailability(it.getMaterialId(), it.getPlantName(), quantityHolder);
			
			// error processing
			if (bapiRet != null) {
				String type = bapiRet.getType();
				String code = bapiRet.getCode();
				String msg = bapiRet.getMessage();
				
				if (type.length() > 0 && type.compareTo("S") != 0) {
					hmh.rs.pojo.Error e = new hmh.rs.pojo.Error();
					e.setErrorCategory(EnterpriseConstants.ERROR_CATEGORY_BUSINESS);
					e.setErrorCode(code);
					e.setErrorMessage(msg);
					e.setTargetSystemError("SAP_code: " + code + ", SAP_msg: " + msg);
					throw new hmh.rs.pojo.ErrorException(e);
				}
			}
			
			quantity = quantityHolder.value.longValue();
			
			responseTime = System.currentTimeMillis();
			
		} catch(hmh.rs.pojo.ErrorException e) {
			throw e;
		} catch (Exception ex) {
			ex.printStackTrace(System.err);
			logger.error("Exception calling getMaterialAvailability", ex);
			requestTime = responseTime = 0;

			StringWriter stackTrace = new StringWriter();
			ex.printStackTrace(new PrintWriter(stackTrace));
			stackTrace.flush();

			throw new hmh.rs.pojo.ErrorException(ex.getMessage());

		} finally {
			long exitTime = System.currentTimeMillis();
			logger.debug("servicemix time was "
					+ ((exitTime - enterTime) - (responseTime - requestTime))
					+ " ms.");
			logger.debug("execution time was " + (exitTime - enterTime)
					+ " ms.");
			logger.debug("getMaterialAvailability ends");

		}
		return quantity;
	}

}
