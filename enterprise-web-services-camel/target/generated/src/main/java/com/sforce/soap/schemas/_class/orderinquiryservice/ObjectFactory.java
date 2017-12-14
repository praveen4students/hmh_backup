
package com.sforce.soap.schemas._class.orderinquiryservice;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sforce.soap.schemas._class.orderinquiryservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sforce.soap.schemas._class.orderinquiryservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OrderLine }
     * 
     */
    public OrderLine createOrderLine() {
        return new OrderLine();
    }

    /**
     * Create an instance of {@link FindOrderCriteria }
     * 
     */
    public FindOrderCriteria createFindOrderCriteria() {
        return new FindOrderCriteria();
    }

    /**
     * Create an instance of {@link SessionHeader }
     * 
     */
    public SessionHeader createSessionHeader() {
        return new SessionHeader();
    }

    /**
     * Create an instance of {@link AllowFieldTruncationHeader }
     * 
     */
    public AllowFieldTruncationHeader createAllowFieldTruncationHeader() {
        return new AllowFieldTruncationHeader();
    }

    /**
     * Create an instance of {@link OrderInfo }
     * 
     */
    public OrderInfo createOrderInfo() {
        return new OrderInfo();
    }

    /**
     * Create an instance of {@link FindUnsubmittedOrdersWSResponse }
     * 
     */
    public FindUnsubmittedOrdersWSResponse createFindUnsubmittedOrdersWSResponse() {
        return new FindUnsubmittedOrdersWSResponse();
    }

    /**
     * Create an instance of {@link LogInfo }
     * 
     */
    public LogInfo createLogInfo() {
        return new LogInfo();
    }

    /**
     * Create an instance of {@link DebuggingHeader }
     * 
     */
    public DebuggingHeader createDebuggingHeader() {
        return new DebuggingHeader();
    }

    /**
     * Create an instance of {@link DebuggingInfo }
     * 
     */
    public DebuggingInfo createDebuggingInfo() {
        return new DebuggingInfo();
    }

    /**
     * Create an instance of {@link CallOptions }
     * 
     */
    public CallOptions createCallOptions() {
        return new CallOptions();
    }

    /**
     * Create an instance of {@link FindUnsubmittedOrdersWS }
     * 
     */
    public FindUnsubmittedOrdersWS createFindUnsubmittedOrdersWS() {
        return new FindUnsubmittedOrdersWS();
    }

}
