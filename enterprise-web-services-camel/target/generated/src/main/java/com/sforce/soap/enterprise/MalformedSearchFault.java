
package com.sforce.soap.enterprise;

import javax.xml.ws.WebFault;


/**
 * This class was generated by FuseSource Services Framework 2.5.0.fuse-7-061
 * 2013-01-23T23:53:39.926+05:30
 * Generated source version: 2.5.0.fuse-7-061
 */

@WebFault(name = "MalformedSearchFault", targetNamespace = "urn:fault.enterprise.soap.sforce.com")
public class MalformedSearchFault extends Exception {
    
    private com.sforce.soap.enterprise.fault.MalformedSearchFault malformedSearchFault;

    public MalformedSearchFault() {
        super();
    }
    
    public MalformedSearchFault(String message) {
        super(message);
    }
    
    public MalformedSearchFault(String message, Throwable cause) {
        super(message, cause);
    }

    public MalformedSearchFault(String message, com.sforce.soap.enterprise.fault.MalformedSearchFault malformedSearchFault) {
        super(message);
        this.malformedSearchFault = malformedSearchFault;
    }

    public MalformedSearchFault(String message, com.sforce.soap.enterprise.fault.MalformedSearchFault malformedSearchFault, Throwable cause) {
        super(message, cause);
        this.malformedSearchFault = malformedSearchFault;
    }

    public com.sforce.soap.enterprise.fault.MalformedSearchFault getFaultInfo() {
        return this.malformedSearchFault;
    }
}
