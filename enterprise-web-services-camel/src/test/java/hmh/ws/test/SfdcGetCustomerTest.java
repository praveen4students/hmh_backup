package hmh.ws.test;


import java.net.URL;

import javax.xml.ws.Holder;
import javax.xml.ws.soap.SOAPBinding;
import javax.xml.ws.soap.SOAPFaultException;
import javax.xml.ws.BindingProvider;

import junit.framework.TestCase;

import org.apache.camel.test.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;

import com.sforce.soap.enterprise.LoginResult;
import com.sforce.soap.enterprise.SforceService;
import com.sforce.soap.enterprise.Soap;
import com.sforce.soap.schemas._class.customerservice.AllowFieldTruncationHeader;
import com.sforce.soap.schemas._class.customerservice.CallOptions;
import com.sforce.soap.schemas._class.customerservice.CustomerServicePortType;
import com.sforce.soap.schemas._class.customerservice.CustomerServiceService;
import com.sforce.soap.schemas._class.customerservice.DebuggingHeader;
import com.sforce.soap.schemas._class.customerservice.DebuggingInfo;
import com.sforce.soap.schemas._class.customerservice.SessionHeader;
import com.sforce.soap.schemas._class.customerservice.SfdcCustomer;


public class SfdcGetCustomerTest extends TestCase {

    @Test
    public void testRendportIncident() throws Exception {
        runTest();
    }
    
    protected void runTest() throws Exception {

		//
		// ws call to tibco
		//
    	// http://www.talendforge.org/forum/viewtopic.php?id=18520
    		
		String endpointAddress =
			"https://test.salesforce.com/services/Soap/c/24.0"; 
			//"https://cs3-api.salesforce.com/services/Soap/c/22.0";

		//URL url = new URL(endpointAddress);
		//SforceService agent = new SforceService(url);
		SforceService agent = new SforceService(SforceService.class.getResource("/META-INF/wsdl/SFDC_Enterprise.wsdl"));
		agent.addPort(agent.Soap, SOAPBinding.SOAP11HTTP_BINDING, endpointAddress);
		Soap soap = agent.getSoap();
        //BindingProvider soapBindingProvider = (BindingProvider)soap;
        //soapBindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpointAddress);

		//BindingProvider bindingProvider = (BindingProvider) soap;
		//System.out.println("The login url is: " + ((BindingProvider) soap).getRequestContext().get(BindingProvider.ENDPOINT_ADDRESS_PROPERTY));
		
		LoginResult lr = soap.login("integrate@hmco.com.sb5", "hmco#123Shye3YH8O1CwDL1ihYXRgiVn2");
		if (lr.isPasswordExpired()) {
			System.out.println("password expired");
		}
        // assert we got a OK back
        assertEquals(false, lr.isPasswordExpired());

        //String surl = lr.getServerUrl();        
        //String Url = "https://cs3-api.salesforce.com/services/Soap/class/CustomerService";
        //String ssid = lr.getSessionId();
        
        //SessionHeader header = new SessionHeader();
        //header.setSessionId(ssid);
        
        CustomerServiceService custService = new CustomerServiceService(CustomerServiceService.class.getResource("/META-INF/wsdl/SFDC_CustomerService.wsdl"));
		CustomerServicePortType port = custService.getCustomerService();
        BindingProvider bindingProvider = (BindingProvider)port;

        String url = lr.getServerUrl();        
		String customerEndpoint = (String) bindingProvider.getRequestContext().get(BindingProvider.ENDPOINT_ADDRESS_PROPERTY);
		URL customerUrl = new URL(customerEndpoint);
        URL soapUrl = new URL(url);
        
		String endpoint = soapUrl.getProtocol() + "://" + soapUrl.getHost() + customerUrl.getPath();
		System.out.println("endpoint: " + endpoint);
        bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpoint);
		
        //custService.addPort(custService.SERVICE, SOAPBinding.SOAP11HTTP_BINDING, endpoint);
		//CustomerServicePortType port = custService.getCustomerService();
		
		SessionHeader header = new SessionHeader();
		header.setSessionId(lr.getSessionId());
		
		String mdrPid = "";
		String sapCustomerId = "341791";
		String zip = "";

		try {
			java.util.List<SfdcCustomer> customerList = port.findSfdcCustomers(mdrPid, sapCustomerId, zip, header, null, null, null, null);
			//java.util.List<SfdcCustomer> customerList = port.findSfdcCustomers(mdrPid, sapCustomerId, zip, header, new CallOptions(), new DebuggingHeader(), new AllowFieldTruncationHeader(), new Holder<DebuggingInfo>() );
	        for (SfdcCustomer c : customerList) {
	        	String name = c.getName(); //.getValue();
	        	System.out.println("customer-name: " + name);
	        }
		}
    	catch(SOAPFaultException ex) {
    		ex.printStackTrace(System.err);
    		String code = ex.getFault().getFaultCode();
    		if (code.endsWith("INVALID_SESSION_ID")) {
    			System.out.println(code);
    		}    			
    		else
    			throw ex;
    	}
		
    }


}
