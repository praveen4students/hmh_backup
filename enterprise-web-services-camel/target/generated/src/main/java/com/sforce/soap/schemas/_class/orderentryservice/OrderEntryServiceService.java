package com.sforce.soap.schemas._class.orderentryservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by FuseSource Services Framework 2.5.0.fuse-7-061
 * 2013-01-23T23:53:34.398+05:30
 * Generated source version: 2.5.0.fuse-7-061
 * 
 */
@WebServiceClient(name = "OrderEntryServiceService", 
                  wsdlLocation = "file:/C:/Praveen/Institute/workspace/enterprise-web-services-camel/src/main/resources/META-INF/wsdl/SFDC_OrderEntryService.wsdl",
                  targetNamespace = "http://soap.sforce.com/schemas/class/OrderEntryService") 
public class OrderEntryServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://soap.sforce.com/schemas/class/OrderEntryService", "OrderEntryServiceService");
    public final static QName OrderEntryService = new QName("http://soap.sforce.com/schemas/class/OrderEntryService", "OrderEntryService");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Praveen/Institute/workspace/enterprise-web-services-camel/src/main/resources/META-INF/wsdl/SFDC_OrderEntryService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(OrderEntryServiceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Praveen/Institute/workspace/enterprise-web-services-camel/src/main/resources/META-INF/wsdl/SFDC_OrderEntryService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public OrderEntryServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public OrderEntryServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OrderEntryServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns OrderEntryServicePortType
     */
    @WebEndpoint(name = "OrderEntryService")
    public OrderEntryServicePortType getOrderEntryService() {
        return super.getPort(OrderEntryService, OrderEntryServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OrderEntryServicePortType
     */
    @WebEndpoint(name = "OrderEntryService")
    public OrderEntryServicePortType getOrderEntryService(WebServiceFeature... features) {
        return super.getPort(OrderEntryService, OrderEntryServicePortType.class, features);
    }

}
