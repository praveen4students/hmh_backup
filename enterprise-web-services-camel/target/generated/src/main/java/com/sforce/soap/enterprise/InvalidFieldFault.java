
package com.sforce.soap.enterprise;

import javax.xml.ws.WebFault;


/**
 * This class was generated by FuseSource Services Framework 2.5.0.fuse-7-061
 * 2013-01-23T23:53:39.915+05:30
 * Generated source version: 2.5.0.fuse-7-061
 */

@WebFault(name = "InvalidFieldFault", targetNamespace = "urn:fault.enterprise.soap.sforce.com")
public class InvalidFieldFault extends Exception {
    
    private com.sforce.soap.enterprise.fault.InvalidFieldFault invalidFieldFault;

    public InvalidFieldFault() {
        super();
    }
    
    public InvalidFieldFault(String message) {
        super(message);
    }
    
    public InvalidFieldFault(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidFieldFault(String message, com.sforce.soap.enterprise.fault.InvalidFieldFault invalidFieldFault) {
        super(message);
        this.invalidFieldFault = invalidFieldFault;
    }

    public InvalidFieldFault(String message, com.sforce.soap.enterprise.fault.InvalidFieldFault invalidFieldFault, Throwable cause) {
        super(message, cause);
        this.invalidFieldFault = invalidFieldFault;
    }

    public com.sforce.soap.enterprise.fault.InvalidFieldFault getFaultInfo() {
        return this.invalidFieldFault;
    }
}
