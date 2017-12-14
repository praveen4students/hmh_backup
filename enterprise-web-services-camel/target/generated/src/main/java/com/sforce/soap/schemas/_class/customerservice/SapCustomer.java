
package com.sforce.soap.schemas._class.customerservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SapCustomer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SapCustomer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerClassDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerTypeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="divisionList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hmhId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mdrPid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderBlock" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="san" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sapCustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shippingCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shippingCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shippingCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shippingState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shippingStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shippingStreet2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shippingStreet3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "SapCustomer", propOrder = {
    "accountGroup",
    "customerClass",
    "customerClassDesc",
    "customerName",
    "customerType",
    "customerTypeDesc",
    "divisionList",
    "email",
    "fax",
    "hmhId",
    "mdrPid",
    "orderBlock",
    "phone",
    "san",
    "sapCustomerId",
    "shippingCity",
    "shippingCountry",
    "shippingCounty",
    "shippingState",
    "shippingStreet",
    "shippingStreet2",
    "shippingStreet3",
    "shippingZip"
})
public class SapCustomer {

    @XmlElement(nillable = true)
    protected String accountGroup;
    @XmlElement(nillable = true)
    protected String customerClass;
    @XmlElement(nillable = true)
    protected String customerClassDesc;
    @XmlElement(nillable = true)
    protected String customerName;
    @XmlElement(nillable = true)
    protected String customerType;
    @XmlElement(nillable = true)
    protected String customerTypeDesc;
    @XmlElement(nillable = true)
    protected List<String> divisionList;
    @XmlElement(nillable = true)
    protected String email;
    @XmlElement(nillable = true)
    protected String fax;
    @XmlElement(nillable = true)
    protected String hmhId;
    @XmlElement(nillable = true)
    protected String mdrPid;
    @XmlElement(nillable = true)
    protected String orderBlock;
    @XmlElement(nillable = true)
    protected String phone;
    @XmlElement(nillable = true)
    protected String san;
    @XmlElement(nillable = true)
    protected String sapCustomerId;
    @XmlElement(nillable = true)
    protected String shippingCity;
    @XmlElement(nillable = true)
    protected String shippingCountry;
    @XmlElement(nillable = true)
    protected String shippingCounty;
    @XmlElement(nillable = true)
    protected String shippingState;
    @XmlElement(nillable = true)
    protected String shippingStreet;
    @XmlElement(nillable = true)
    protected String shippingStreet2;
    @XmlElement(nillable = true)
    protected String shippingStreet3;
    @XmlElement(nillable = true)
    protected String shippingZip;

    /**
     * Gets the value of the accountGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountGroup() {
        return accountGroup;
    }

    /**
     * Sets the value of the accountGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountGroup(String value) {
        this.accountGroup = value;
    }

    /**
     * Gets the value of the customerClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerClass() {
        return customerClass;
    }

    /**
     * Sets the value of the customerClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerClass(String value) {
        this.customerClass = value;
    }

    /**
     * Gets the value of the customerClassDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerClassDesc() {
        return customerClassDesc;
    }

    /**
     * Sets the value of the customerClassDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerClassDesc(String value) {
        this.customerClassDesc = value;
    }

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the customerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerType() {
        return customerType;
    }

    /**
     * Sets the value of the customerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerType(String value) {
        this.customerType = value;
    }

    /**
     * Gets the value of the customerTypeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerTypeDesc() {
        return customerTypeDesc;
    }

    /**
     * Sets the value of the customerTypeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerTypeDesc(String value) {
        this.customerTypeDesc = value;
    }

    /**
     * Gets the value of the divisionList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the divisionList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDivisionList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDivisionList() {
        if (divisionList == null) {
            divisionList = new ArrayList<String>();
        }
        return this.divisionList;
    }

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
     * Gets the value of the hmhId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHmhId() {
        return hmhId;
    }

    /**
     * Sets the value of the hmhId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHmhId(String value) {
        this.hmhId = value;
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
     * Gets the value of the orderBlock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderBlock() {
        return orderBlock;
    }

    /**
     * Sets the value of the orderBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderBlock(String value) {
        this.orderBlock = value;
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
     * Gets the value of the san property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSan() {
        return san;
    }

    /**
     * Sets the value of the san property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSan(String value) {
        this.san = value;
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
     * Gets the value of the shippingCounty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingCounty() {
        return shippingCounty;
    }

    /**
     * Sets the value of the shippingCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingCounty(String value) {
        this.shippingCounty = value;
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
     * Gets the value of the shippingStreet2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingStreet2() {
        return shippingStreet2;
    }

    /**
     * Sets the value of the shippingStreet2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingStreet2(String value) {
        this.shippingStreet2 = value;
    }

    /**
     * Gets the value of the shippingStreet3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingStreet3() {
        return shippingStreet3;
    }

    /**
     * Sets the value of the shippingStreet3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingStreet3(String value) {
        this.shippingStreet3 = value;
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
