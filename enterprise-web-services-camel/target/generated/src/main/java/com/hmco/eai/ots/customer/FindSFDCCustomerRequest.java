
package com.hmco.eai.ots.customer;

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
 *         &lt;element name="mdrPid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sapCustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "mdrPid",
    "sapCustomerId",
    "zipCode"
})
@XmlRootElement(name = "findSFDCCustomerRequest")
public class FindSFDCCustomerRequest {

    protected String mdrPid;
    protected String sapCustomerId;
    protected String zipCode;

    /**
     * Gets the value of the mdrPid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdrPid() {
        return mdrPid;
    }

    /**
     * Sets the value of the mdrPid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdrPid(String value) {
        this.mdrPid = value;
    }

    /**
     * Gets the value of the sapCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSapCustomerId() {
        return sapCustomerId;
    }

    /**
     * Sets the value of the sapCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSapCustomerId(String value) {
        this.sapCustomerId = value;
    }

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

}
