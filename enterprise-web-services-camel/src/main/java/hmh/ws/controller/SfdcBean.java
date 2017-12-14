package hmh.ws.controller;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;
import javax.xml.ws.soap.SOAPBinding;
import javax.xml.ws.soap.SOAPFaultException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.hmco.eai.tibco.enterprisewebservices.EaiException;
import com.sforce.soap.enterprise.InvalidIdFault;
import com.sforce.soap.enterprise.LoginFault;
import com.sforce.soap.enterprise.LoginResult;
import com.sforce.soap.enterprise.SforceService;
import com.sforce.soap.enterprise.Soap;
import com.sforce.soap.enterprise.UnexpectedErrorFault;
import com.sforce.soap.schemas._class.customerservice.AllowFieldTruncationHeader;
import com.sforce.soap.schemas._class.customerservice.CallOptions;
import com.sforce.soap.schemas._class.customerservice.CustomerServicePortType;
import com.sforce.soap.schemas._class.customerservice.CustomerServiceService;
import com.sforce.soap.schemas._class.customerservice.DebuggingHeader;
import com.sforce.soap.schemas._class.customerservice.DebuggingInfo;
import com.sforce.soap.schemas._class.customerservice.SfdcCustomer;
import com.sforce.soap.schemas._class.customerservice.SfdcRep;
import com.sforce.soap.schemas._class.eskerservice.EskerServicePortType;
import com.sforce.soap.schemas._class.eskerservice.EskerServiceService;
import com.sforce.soap.schemas._class.eskerservice.EskerTransactionRequest;
import com.sforce.soap.schemas._class.eskerservice.EskerTransactionResult;
import com.sforce.soap.schemas._class.orderentryservice.BasisOrderSearchCriteria;
import com.sforce.soap.schemas._class.orderentryservice.BasisOrderSearchResult;
import com.sforce.soap.schemas._class.orderentryservice.OrderEntryServicePortType;
import com.sforce.soap.schemas._class.orderentryservice.OrderEntryServiceService;
import com.sforce.soap.schemas._class.orderentryservice.SubmitOrder;
import com.sforce.soap.schemas._class.orderentryservice.SubmitOrderResult;
import com.sforce.soap.schemas._class.orderinquiryservice.FindOrderCriteria;
import com.sforce.soap.schemas._class.orderinquiryservice.OrderInfo;
import com.sforce.soap.schemas._class.orderinquiryservice.OrderInquiryServicePortType;
import com.sforce.soap.schemas._class.orderinquiryservice.OrderInquiryServiceService;

public class SfdcBean implements InitializingBean, DisposableBean {

	private static final Logger logger = Logger.getLogger(SfdcBean.class);
	
	private String sfdcUrl;
	private String sfdcUserName;
	private String sfdcPassword;
	
	// sfdc classes
	Soap soap = null;
	CustomerServicePortType custPort = null;
	OrderEntryServicePortType orderEntryPort = null;
	OrderInquiryServicePortType orderInquiryPort = null;
	EskerServicePortType eskerServicePort = null;
	
	//SessionHeader header = new SessionHeader();
	String ssid = null;
	

/*	
	public String getSfdcSessionId() {
		// TODO Auto-generated method stub
		String sessionId = null;
		//if(sessionId == null || ( sessionId != null && sessionId.length() <= 0 ) ) 
		{
			SforceService service = new SforceService();
			Soap soap = service.getSoap();
			logger.info("----------------Got Soap port-----------------");
			com.sforce.soap.enterprise.LoginResult response = null;
			try {
				logger.info("----------------Before login call-----------------");
				logger.info("username " + sfdcUserName);
				logger.info("password " + sfdcPassword);
				response = soap.login(sfdcUserName, sfdcPassword);
//				LoginResult result = response.getResult();
				logger.info("----------------After login call-----------------");
				if(response.isPasswordExpired()) {
					logger.error("password expired");
				}
				sessionId = response.getSessionId();
			} catch (InvalidIdFault e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (LoginFault e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (UnexpectedErrorFault e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return sessionId;
	}
*/	

	private void setUrl(BindingProvider bindingProvider, String url) {
        //BindingProvider bindingProvider = (BindingProvider)custPort;
        //String url = lr.getServerUrl();        
		try {
			String endpoint = (String) bindingProvider.getRequestContext().get(BindingProvider.ENDPOINT_ADDRESS_PROPERTY);
			URL defaultUrl = new URL(endpoint);
	        URL soapUrl = new URL(url);	        
			String newUrl = soapUrl.getProtocol() + "://" + soapUrl.getHost() + defaultUrl.getPath();
			//System.out.println("endpoint: " + endpoint);
	        bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, newUrl);
	        
		} catch (MalformedURLException e) {
			//e.printStackTrace();
			logger.error(e);
		}
		
	}
	
	private void init() {
		
		try {
			if (soap == null) {
				SforceService forceService = new SforceService(SforceService.class.getResource("/META-INF/wsdl/SFDC_Enterprise.wsdl"));
				forceService.addPort(SforceService.Soap, SOAPBinding.SOAP11HTTP_BINDING, getSfdcUrl());
				soap = forceService.getSoap();
			}

			LoginResult lr = soap.login(getSfdcUserName(), getSfdcPassword());
	        String url = lr.getServerUrl();
	        ssid = lr.getSessionId();
	        
	        if (custPort == null) {
				CustomerServiceService custService = new CustomerServiceService(CustomerServiceService.class.getResource("/META-INF/wsdl/SFDC_CustomerService.wsdl"));
		        //custService.addPort(CustomerServiceService.SERVICE, SOAPBinding.SOAP11HTTP_BINDING, Url);
				custPort = custService.getCustomerService();
				setUrl((BindingProvider)custPort, url);
	        }
	        
	        if (orderEntryPort == null) {
				OrderEntryServiceService orderEntryService = new OrderEntryServiceService(OrderEntryServiceService.class.getResource("/META-INF/wsdl/SFDC_OrderEntryService.wsdl"));
				//orderEntryService.addPort(OrderEntryServiceService.SERVICE, SOAPBinding.SOAP11HTTP_BINDING, Url);
				orderEntryPort = orderEntryService.getOrderEntryService();
				setUrl((BindingProvider)orderEntryPort, url);
	        }
	        
	        if (orderInquiryPort == null) {
				OrderInquiryServiceService orderInquiryService = new OrderInquiryServiceService(OrderInquiryServiceService.class.getResource("/META-INF/wsdl/SFDC_OrderInquiryService.wsdl"));
				//orderInquiryService.addPort(OrderInquiryServiceService.SERVICE, SOAPBinding.SOAP11HTTP_BINDING, Url);
				orderInquiryPort = orderInquiryService.getOrderInquiryService();
				setUrl((BindingProvider)orderInquiryPort, url);
	        }
	        
	        if (eskerServicePort == null) {
				EskerServiceService eskerService = new EskerServiceService(EskerServiceService.class.getResource("/META-INF/wsdl/SFDC_EskerService.wsdl"));
				//eskerService.addPort(EskerServiceService.SERVICE, SOAPBinding.SOAP11HTTP_BINDING, Url);
				eskerServicePort = eskerService.getEskerService();
				setUrl((BindingProvider)eskerServicePort, url);
	        }
	        						
		} catch (InvalidIdFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error(e);
		} catch (LoginFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error(e);
		} catch (UnexpectedErrorFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error(e);
		}

	}
	
    public List<SfdcCustomer> findSfdcCustomers (
            String mdrPid,
            String sapCustomerId,
            String zip) throws EaiException{
    	
    	List<SfdcCustomer> customerList  = null;
    	boolean isSessionValid = true;
    	if (custPort == null) {
    		init();
    	}
    	for (int i=0; i<2; ++i) {
	    	try {
	    		//customerList = custPort.findSfdcCustomers(mdrPid, sapCustomerId, zip, header, new CallOptions(), new DebuggingHeader(), new AllowFieldTruncationHeader(), new Holder<DebuggingInfo>() );
	    		com.sforce.soap.schemas._class.customerservice.SessionHeader header = new com.sforce.soap.schemas._class.customerservice.SessionHeader();
	    		header.setSessionId(ssid);
	    		customerList = custPort.findSfdcCustomers(mdrPid, sapCustomerId, zip, header, null, null, null, null);
	    	}
	    	catch(SOAPFaultException ex) {
	    		String code = ex.getFault().getFaultCode();
	    		if (code.endsWith("INVALID_SESSION_ID")) {
	    			isSessionValid = false;
	    			init();
	    		}
	    		else
	    			throw new EaiException(ex.getMessage());
	    	}
	    	if( isSessionValid ) {
	    		break;
	    	}
    	} 
		return customerList;
    }
    
    public java.util.List<com.sforce.soap.schemas._class.customerservice.SfdcRep> getRepsForCustomers(List<String> sfdcCustomerIds, String division) throws EaiException {
    	
    	List<SfdcRep> sfdcRepList = null;
    	boolean isSessionValid = true;
    	if (custPort == null) {
    		init();
    	}
    	for (int i=0; i<2; ++i) {
	    	try {
	    		//sfdcRepList = custPort.getRepsForCustomers(sfdcCustomerIds, null, header, new CallOptions(), new DebuggingHeader(), new AllowFieldTruncationHeader(), new Holder<DebuggingInfo>() );
	    		com.sforce.soap.schemas._class.customerservice.SessionHeader header = new com.sforce.soap.schemas._class.customerservice.SessionHeader();
	    		header.setSessionId(ssid);
	    		sfdcRepList = custPort.getRepsForCustomers(sfdcCustomerIds, division, header, null, null, null, null);
	    	}
	    	catch(SOAPFaultException ex) {
	    		String code = ex.getFault().getFaultCode();
	    		if (code.endsWith("INVALID_SESSION_ID")) {
	    			isSessionValid = false;
	    			init();
	    		}
	    		else
	    			throw new EaiException(ex.getMessage());
	    	}
	    	if( isSessionValid ) {
	    		break;
	    	}
    	} 
		return sfdcRepList;
    }
    
    public List<OrderInfo> findUnsubmittedOrders(FindOrderCriteria criteria) throws EaiException {
    	
    	List<OrderInfo> orderInfoList = null;
    	boolean isSessionValid = true;
    	if (orderInquiryPort == null) {
    		init();
    	}
    	
    	for (int i=0; i<2; ++i) {
	    	try {
	    		com.sforce.soap.schemas._class.orderinquiryservice.SessionHeader header = new com.sforce.soap.schemas._class.orderinquiryservice.SessionHeader();
	    		header.setSessionId(ssid);	    		
	    		orderInfoList = orderInquiryPort.findUnsubmittedOrdersWS(criteria, header, null, null, null, null);
	    	}
	    	catch(SOAPFaultException ex) {
	    		String code = ex.getFault().getFaultCode();
	    		if (code.endsWith("INVALID_SESSION_ID")) {
	    			isSessionValid = false;
	    			init();
	    		}
	    		else
	    			throw new EaiException(ex.getMessage());
	    	}
	    	if( isSessionValid ) {
	    		break;
	    	}
    	} 
		return orderInfoList;
    }
    
    public BasisOrderSearchResult findSfdcBasicOrders(BasisOrderSearchCriteria criteria) throws EaiException {
    	
    	BasisOrderSearchResult orderResult = null;
    	boolean isSessionValid = true;
    	if (orderEntryPort == null) {
    		init();
    	}
    	
    	for (int i=0; i<2; ++i) {
	    	try {
	    		com.sforce.soap.schemas._class.orderentryservice.SessionHeader header = new com.sforce.soap.schemas._class.orderentryservice.SessionHeader();
	    		header.setSessionId(ssid);	    		
	    		orderResult = orderEntryPort.findSfdcBasisOrder(criteria, header, null, null, null, null);
	    	}
	    	catch(SOAPFaultException ex) {
	    		String code = ex.getFault().getFaultCode();
	    		if (code.endsWith("INVALID_SESSION_ID")) {
	    			isSessionValid = false;
	    			init();
	    		}
	    		else
	    			throw new EaiException(ex.getMessage());
	    	}
	    	if( isSessionValid ) {
	    		break;
	    	}
    	} 
		return orderResult;
    }
    
    public SubmitOrderResult submitSfdcOrder(SubmitOrder subOrder) throws EaiException {
    	
    	SubmitOrderResult orderResult = null;
    	boolean isSessionValid = true;
    	if (orderEntryPort == null) {
    		init();
    	}
    	
    	for (int i=0; i<2; ++i) {
	    	try {
	    		com.sforce.soap.schemas._class.orderentryservice.SessionHeader header = new com.sforce.soap.schemas._class.orderentryservice.SessionHeader();
	    		header.setSessionId(ssid);	    			    		
	    		orderResult = orderEntryPort.submitSfdcOrder(subOrder, header, null, null, null, null);
	    	}
	    	catch(SOAPFaultException ex) {
	    		String code = ex.getFault().getFaultCode();
	    		if (code.endsWith("INVALID_SESSION_ID")) {
	    			isSessionValid = false;
	    			init();
	    		}
	    		else
	    			throw new EaiException(ex.getMessage());
	    	}
	    	if( isSessionValid ) {
	    		break;
	    	}
    	} 
		return orderResult;
    }
            
    public EskerTransactionResult createCPOFromCPWS(EskerTransactionRequest req) throws EaiException {
    	
    	EskerTransactionResult eskerResult = null;
    	boolean isSessionValid = true;
    	if (orderEntryPort == null) {
    		init();
    	}
    	
    	for (int i=0; i<2; ++i) {
	    	try {
	    		com.sforce.soap.schemas._class.eskerservice.SessionHeader header = new com.sforce.soap.schemas._class.eskerservice.SessionHeader();
	    		header.setSessionId(ssid);	    		
	    		eskerResult = eskerServicePort.createCPOFromCPWS(req, header, null, null, null, null);
	    	}
	    	catch(SOAPFaultException ex) {
	    		String code = ex.getFault().getFaultCode();
	    		if (code.endsWith("INVALID_SESSION_ID")) {
	    			isSessionValid = false;
	    			init();
	    		}
	    		else
	    			throw new EaiException(ex.getMessage());
	    	}
	    	if( isSessionValid ) {
	    		break;
	    	}
    	} 
		return eskerResult;
    }
            
	
	public void afterPropertiesSet() throws Exception {
		logger.debug("initializing " + this.getClass().getName());
		init();
	}

	public void destroy() throws Exception {
		logger.debug("destroying " + this.getClass().getName());
	}
	
	
	public String getSfdcUrl() {
		return sfdcUrl;
	}

	public void setSfdcUrl(String sfdcUrl) {
		this.sfdcUrl = sfdcUrl;
	}
	
	public String getSfdcUserName() {
		return sfdcUserName;
	}

	public void setSfdcUserName(String sfdcUserName) {
		this.sfdcUserName = sfdcUserName;
	}

	public String getSfdcPassword() {
		return sfdcPassword;
	}

	public void setSfdcPassword(String sfdcPassword) {
		this.sfdcPassword = sfdcPassword;
	}

}
