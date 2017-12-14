
package com.sforce.soap.schemas._class.eskerservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="req" type="{http://soap.sforce.com/schemas/class/EskerService}EskerTransactionRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "req"
})
@XmlRootElement(name = "createCPOFromCPWS")
public class CreateCPOFromCPWS {

    @XmlElement(required = true, nillable = true)
    protected EskerTransactionRequest req;

    /**
     * Gets the value of the req property.
     * 
     * @return
     *     possible object is
     *     {@link EskerTransactionRequest }
     *     
     */
    public EskerTransactionRequest getReq() {
        return req;
    }

    /**
     * Sets the value of the req property.
     * 
     * @param value
     *     allowed object is
     *     {@link EskerTransactionRequest }
     *     
     */
    public void setReq(EskerTransactionRequest value) {
        this.req = value;
    }

}
