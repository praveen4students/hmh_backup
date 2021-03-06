package com.sforce.soap.enterprise;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * Sforce SOAP API
 *
 * This class was generated by FuseSource Services Framework 2.5.0.fuse-7-061
 * 2013-01-23T23:53:39.936+05:30
 * Generated source version: 2.5.0.fuse-7-061
 * 
 */
@WebServiceClient(name = "SforceService", 
                  wsdlLocation = "file:/C:/Praveen/Institute/workspace/enterprise-web-services-camel/src/main/resources/META-INF/wsdl/SFDC_Enterprise.wsdl",
                  targetNamespace = "urn:enterprise.soap.sforce.com") 
public class SforceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("urn:enterprise.soap.sforce.com", "SforceService");
    public final static QName Soap = new QName("urn:enterprise.soap.sforce.com", "Soap");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Praveen/Institute/workspace/enterprise-web-services-camel/src/main/resources/META-INF/wsdl/SFDC_Enterprise.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SforceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Praveen/Institute/workspace/enterprise-web-services-camel/src/main/resources/META-INF/wsdl/SFDC_Enterprise.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SforceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SforceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SforceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns Soap
     */
    @WebEndpoint(name = "Soap")
    public Soap getSoap() {
        return super.getPort(Soap, Soap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Soap
     */
    @WebEndpoint(name = "Soap")
    public Soap getSoap(WebServiceFeature... features) {
        return super.getPort(Soap, Soap.class, features);
    }

}
