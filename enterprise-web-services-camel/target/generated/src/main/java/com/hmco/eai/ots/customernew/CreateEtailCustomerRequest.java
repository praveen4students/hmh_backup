
package com.hmco.eai.ots.customernew;

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
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/CustomerNew}storeID"/>
 *         &lt;element name="name">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="35"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="telephone">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="customerEmail" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="241"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="soldToAddress" type="{http://www.hmco.com/EAI/OTS/CustomerNew}address"/>
 *         &lt;element name="billToAddress" type="{http://www.hmco.com/EAI/OTS/CustomerNew}address" minOccurs="0"/>
 *         &lt;element name="shipToAddress" type="{http://www.hmco.com/EAI/OTS/CustomerNew}address" minOccurs="0"/>
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
    "storeID",
    "name",
    "telephone",
    "customerEmail",
    "soldToAddress",
    "billToAddress",
    "shipToAddress"
})
@XmlRootElement(name = "createEtailCustomerRequest")
public class CreateEtailCustomerRequest {

    @XmlElement(required = true)
    protected String storeID;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String telephone;
    protected String customerEmail;
    @XmlElement(required = true)
    protected Address soldToAddress;
    protected Address billToAddress;
    protected Address shipToAddress;

    /**
     * Gets the value of the storeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreID() {
        return storeID;
    }

    /**
     * Sets the value of the storeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreID(String value) {
        this.storeID = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the telephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * Sets the value of the telephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephone(String value) {
        this.telephone = value;
    }

    /**
     * Gets the value of the customerEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerEmail() {
        return customerEmail;
    }

    /**
     * Sets the value of the customerEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerEmail(String value) {
        this.customerEmail = value;
    }

    /**
     * Gets the value of the soldToAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getSoldToAddress() {
        return soldToAddress;
    }

    /**
     * Sets the value of the soldToAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setSoldToAddress(Address value) {
        this.soldToAddress = value;
    }

    /**
     * Gets the value of the billToAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getBillToAddress() {
        return billToAddress;
    }

    /**
     * Sets the value of the billToAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setBillToAddress(Address value) {
        this.billToAddress = value;
    }

    /**
     * Gets the value of the shipToAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getShipToAddress() {
        return shipToAddress;
    }

    /**
     * Sets the value of the shipToAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setShipToAddress(Address value) {
        this.shipToAddress = value;
    }

}
