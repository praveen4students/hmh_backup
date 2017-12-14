
package com.sforce.soap.schemas._class.customerservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SfdcCustomer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SfdcCustomer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insideSalesAccountFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="mdrCustomerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mdrPid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pnpAccountFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sapCustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sfdcCustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shippingCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shippingCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shippingState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shippingStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shippingZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SfdcCustomer", propOrder = {
    "email",
    "fax",
    "insideSalesAccountFlag",
    "mdrCustomerType",
    "mdrPid",
    "name",
    "phone",
    "pnpAccountFlag",
    "sapCustomerId",
    "sfdcCustomerId",
    "shippingCity",
    "shippingCountry",
    "shippingState",
    "shippingStreet",
    "shippingZip"
})
public class SfdcCustomer {

    @XmlElement(nillable = true)
    protected String email;
    @XmlElement(nillable = true)
    protected String fax;
    @XmlElement(nillable = true)
    protected Boolean insideSalesAccountFlag;
    @XmlElement(nillable = true)
    protected String mdrCustomerType;
    @XmlElement(nillable = true)
    protected String mdrPid;
    @XmlElement(nillable = true)
    protected String name;
    @XmlElement(nillable = true)
    protected String phone;
    @XmlElement(nillable = true)
    protected Boolean pnpAccountFlag;
    @XmlElement(nillable = true)
    protected String sapCustomerId;
    @XmlElement(nillable = true)
    protected String sfdcCustomerId;
    @XmlElement(nillable = true)
    protected String shippingCity;
    @XmlElement(nillable = true)
    protected String shippingCountry;
    @XmlElement(nillable = true)
    protected String shippingState;
    @XmlElement(nillable = true)
    protected String shippingStreet;
    @XmlElement(nillable = true)
    protected String shippingZip;

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the insideSalesAccountFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInsideSalesAccountFlag() {
        return insideSalesAccountFlag;
    }

    /**
     * Sets the value of the insideSalesAccountFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInsideSalesAccountFlag(Boolean value) {
        this.insideSalesAccountFlag = value;
    }

    /**
     * Gets the value of the mdrCustomerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdrCustomerType() {
        return mdrCustomerType;
    }

    /**
     * Sets the value of the mdrCustomerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdrCustomerType(String value) {
        this.mdrCustomerType = value;
    }

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
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the pnpAccountFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPnpAccountFlag() {
        return pnpAccountFlag;
    }

    /**
     * Sets the value of the pnpAccountFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPnpAccountFlag(Boolean value) {
        this.pnpAccountFlag = value;
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
     * Gets the value of the sfdcCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfdcCustomerId() {
        return sfdcCustomerId;
    }

    /**
     * Sets the value of the sfdcCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfdcCustomerId(String value) {
        this.sfdcCustomerId = value;
    }

    /**
     * Gets the value of the shippingCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingCity() {
        return shippingCity;
    }

    /**
     * Sets the value of the shippingCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingCity(String value) {
        this.shippingCity = value;
    }

    /**
     * Gets the value of the shippingCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingCountry() {
        return shippingCountry;
    }

    /**
     * Sets the value of the shippingCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingCountry(String value) {
        this.shippingCountry = value;
    }

    /**
     * Gets the value of the shippingState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingState() {
        return shippingState;
    }

    /**
     * Sets the value of the shippingState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingState(String value) {
        this.shippingState = value;
    }

    /**
     * Gets the value of the shippingStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingStreet() {
        return shippingStreet;
    }

    /**
     * Sets the value of the shippingStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingStreet(String value) {
        this.shippingStreet = value;
    }

    /**
     * Gets the value of the shippingZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingZip() {
        return shippingZip;
    }

    /**
     * Sets the value of the shippingZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingZip(String value) {
        this.shippingZip = value;
    }

}
