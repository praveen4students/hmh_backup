
package com.hmco.eai.ots.customer;

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
 *         &lt;element name="soldToCustomerID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shipToCustomerID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billToCustomerID" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "soldToCustomerID",
    "shipToCustomerID",
    "billToCustomerID"
})
@XmlRootElement(name = "createEtailCustomerResponse")
public class CreateEtailCustomerResponse {

    @XmlElement(required = true)
    protected String soldToCustomerID;
    @XmlElement(required = true)
    protected String shipToCustomerID;
    @XmlElement(required = true)
    protected String billToCustomerID;

    /**
     * Gets the value of the soldToCustomerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoldToCustomerID() {
        return soldToCustomerID;
    }

    /**
     * Sets the value of the soldToCustomerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoldToCustomerID(String value) {
        this.soldToCustomerID = value;
    }

    /**
     * Gets the value of the shipToCustomerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToCustomerID() {
        return shipToCustomerID;
    }

    /**
     * Sets the value of the shipToCustomerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToCustomerID(String value) {
        this.shipToCustomerID = value;
    }

    /**
     * Gets the value of the billToCustomerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToCustomerID() {
        return billToCustomerID;
    }

    /**
     * Sets the value of the billToCustomerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToCustomerID(String value) {
        this.billToCustomerID = value;
    }

}
