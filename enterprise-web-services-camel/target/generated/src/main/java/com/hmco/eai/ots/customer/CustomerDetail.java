
package com.hmco.eai.ots.customer;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="customerID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerRole" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerClassCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerClassDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerTypeDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="creditStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="san" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mdrPID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Customer}isPrimeMDR" minOccurs="0"/>
 *         &lt;element name="customerAddress" type="{http://www.hmco.com/EAI/OTS/Customer}address"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="telNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="altTelNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="collegeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerFax" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="31"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="customerDivisionInfo" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="division" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="geographicTerritory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="allowSubstitutionsFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "customerID",
    "customerRole",
    "customerClassCode",
    "customerClassDesc",
    "customerTypeCode",
    "customerTypeDesc",
    "creditStatus",
    "san",
    "mdrPID",
    "isPrimeMDR",
    "customerAddress",
    "name",
    "telNumber",
    "altTelNumber",
    "customerStatus",
    "collegeNumber",
    "customerEmail",
    "customerFax",
    "customerDivisionInfo"
})
@XmlRootElement(name = "customerDetail")
public class CustomerDetail {

    @XmlElement(required = true)
    protected String customerID;
    @XmlElement(required = true)
    protected String customerRole;
    @XmlElement(required = true)
    protected String customerClassCode;
    @XmlElement(required = true)
    protected String customerClassDesc;
    @XmlElement(required = true)
    protected String customerTypeCode;
    @XmlElement(required = true)
    protected String customerTypeDesc;
    protected String creditStatus;
    protected String san;
    protected String mdrPID;
    @XmlElement(nillable = true)
    protected Boolean isPrimeMDR;
    @XmlElement(required = true)
    protected Address customerAddress;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String telNumber;
    protected String altTelNumber;
    protected String customerStatus;
    protected String collegeNumber;
    protected String customerEmail;
    protected String customerFax;
    protected List<CustomerDetail.CustomerDivisionInfo> customerDivisionInfo;

    /**
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerID(String value) {
        this.customerID = value;
    }

    /**
     * Gets the value of the customerRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerRole() {
        return customerRole;
    }

    /**
     * Sets the value of the customerRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerRole(String value) {
        this.customerRole = value;
    }

    /**
     * Gets the value of the customerClassCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerClassCode() {
        return customerClassCode;
    }

    /**
     * Sets the value of the customerClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerClassCode(String value) {
        this.customerClassCode = value;
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
     * Gets the value of the customerTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerTypeCode() {
        return customerTypeCode;
    }

    /**
     * Sets the value of the customerTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerTypeCode(String value) {
        this.customerTypeCode = value;
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
     * Gets the value of the creditStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditStatus() {
        return creditStatus;
    }

    /**
     * Sets the value of the creditStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditStatus(String value) {
        this.creditStatus = value;
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
     * Gets the value of the mdrPID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdrPID() {
        return mdrPID;
    }

    /**
     * Sets the value of the mdrPID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdrPID(String value) {
        this.mdrPID = value;
    }

    /**
     * Gets the value of the isPrimeMDR property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPrimeMDR() {
        return isPrimeMDR;
    }

    /**
     * Sets the value of the isPrimeMDR property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPrimeMDR(Boolean value) {
        this.isPrimeMDR = value;
    }

    /**
     * Gets the value of the customerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getCustomerAddress() {
        return customerAddress;
    }

    /**
     * Sets the value of the customerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setCustomerAddress(Address value) {
        this.customerAddress = value;
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
     * Gets the value of the telNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelNumber() {
        return telNumber;
    }

    /**
     * Sets the value of the telNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelNumber(String value) {
        this.telNumber = value;
    }

    /**
     * Gets the value of the altTelNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltTelNumber() {
        return altTelNumber;
    }

    /**
     * Sets the value of the altTelNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltTelNumber(String value) {
        this.altTelNumber = value;
    }

    /**
     * Gets the value of the customerStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerStatus() {
        return customerStatus;
    }

    /**
     * Sets the value of the customerStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerStatus(String value) {
        this.customerStatus = value;
    }

    /**
     * Gets the value of the collegeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollegeNumber() {
        return collegeNumber;
    }

    /**
     * Sets the value of the collegeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollegeNumber(String value) {
        this.collegeNumber = value;
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
     * Gets the value of the customerFax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerFax() {
        return customerFax;
    }

    /**
     * Sets the value of the customerFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerFax(String value) {
        this.customerFax = value;
    }

    /**
     * Gets the value of the customerDivisionInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerDivisionInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerDivisionInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerDetail.CustomerDivisionInfo }
     * 
     * 
     */
    public List<CustomerDetail.CustomerDivisionInfo> getCustomerDivisionInfo() {
        if (customerDivisionInfo == null) {
            customerDivisionInfo = new ArrayList<CustomerDetail.CustomerDivisionInfo>();
        }
        return this.customerDivisionInfo;
    }


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
     *         &lt;element name="division" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="geographicTerritory" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="allowSubstitutionsFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "division",
        "geographicTerritory",
        "allowSubstitutionsFlag"
    })
    public static class CustomerDivisionInfo {

        @XmlElement(required = true)
        protected String division;
        @XmlElement(required = true)
        protected String geographicTerritory;
        protected boolean allowSubstitutionsFlag;

        /**
         * Gets the value of the division property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDivision() {
            return division;
        }

        /**
         * Sets the value of the division property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDivision(String value) {
            this.division = value;
        }

        /**
         * Gets the value of the geographicTerritory property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGeographicTerritory() {
            return geographicTerritory;
        }

        /**
         * Sets the value of the geographicTerritory property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGeographicTerritory(String value) {
            this.geographicTerritory = value;
        }

        /**
         * Gets the value of the allowSubstitutionsFlag property.
         * 
         */
        public boolean isAllowSubstitutionsFlag() {
            return allowSubstitutionsFlag;
        }

        /**
         * Sets the value of the allowSubstitutionsFlag property.
         * 
         */
        public void setAllowSubstitutionsFlag(boolean value) {
            this.allowSubstitutionsFlag = value;
        }

    }

}
