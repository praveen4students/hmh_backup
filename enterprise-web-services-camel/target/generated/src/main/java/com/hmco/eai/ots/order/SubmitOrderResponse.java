
package com.hmco.eai.ots.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}message" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}poNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}sfdcInternalOrderId" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}sfdcOrderNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}status" minOccurs="0"/>
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
    "message",
    "poNumber",
    "sfdcInternalOrderId",
    "sfdcOrderNumber",
    "status"
})
@XmlRootElement(name = "submitOrderResponse")
public class SubmitOrderResponse {

    protected String message;
    protected String poNumber;
    protected String sfdcInternalOrderId;
    protected String sfdcOrderNumber;
    protected String status;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the poNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoNumber() {
        return poNumber;
    }

    /**
     * Sets the value of the poNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoNumber(String value) {
        this.poNumber = value;
    }

    /**
     * Gets the value of the sfdcInternalOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfdcInternalOrderId() {
        return sfdcInternalOrderId;
    }

    /**
     * Sets the value of the sfdcInternalOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfdcInternalOrderId(String value) {
        this.sfdcInternalOrderId = value;
    }

    /**
     * Gets the value of the sfdcOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfdcOrderNumber() {
        return sfdcOrderNumber;
    }

    /**
     * Sets the value of the sfdcOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfdcOrderNumber(String value) {
        this.sfdcOrderNumber = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
