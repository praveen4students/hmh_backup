
package com.hmco.eai.tibco.enterprisewebservices;

import javax.xml.ws.WebFault;


/**
 * This class was generated by FuseSource Services Framework 2.5.0.fuse-7-061
 * 2013-01-23T23:53:33.928+05:30
 * Generated source version: 2.5.0.fuse-7-061
 */

@WebFault(name = "orderException", targetNamespace = "http://www.hmco.com/EAI/OTS/Order")
public class OrderException extends Exception {
    
    private com.hmco.eai.ots.order.OrderException orderException;

    public OrderException() {
        super();
    }
    
    public OrderException(String message) {
        super(message);
    }
    
    public OrderException(String message, Throwable cause) {
        super(message, cause);
    }

    public OrderException(String message, com.hmco.eai.ots.order.OrderException orderException) {
        super(message);
        this.orderException = orderException;
    }

    public OrderException(String message, com.hmco.eai.ots.order.OrderException orderException, Throwable cause) {
        super(message, cause);
        this.orderException = orderException;
    }

    public com.hmco.eai.ots.order.OrderException getFaultInfo() {
        return this.orderException;
    }
}