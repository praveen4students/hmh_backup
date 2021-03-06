
package com.hmco.eai.tibco.enterprisewebservices;

import javax.xml.ws.WebFault;


/**
 * This class was generated by FuseSource Services Framework 2.5.0.fuse-7-061
 * 2013-01-23T23:53:33.942+05:30
 * Generated source version: 2.5.0.fuse-7-061
 */

@WebFault(name = "materialException", targetNamespace = "http://www.hmco.com/EAI/OTS/Material")
public class MaterialException extends Exception {
    
    private com.hmco.eai.EaiException materialException;

    public MaterialException() {
        super();
    }
    
    public MaterialException(String message) {
        super(message);
    }
    
    public MaterialException(String message, Throwable cause) {
        super(message, cause);
    }

    public MaterialException(String message, com.hmco.eai.EaiException materialException) {
        super(message);
        this.materialException = materialException;
    }

    public MaterialException(String message, com.hmco.eai.EaiException materialException, Throwable cause) {
        super(message, cause);
        this.materialException = materialException;
    }

    public com.hmco.eai.EaiException getFaultInfo() {
        return this.materialException;
    }
}
