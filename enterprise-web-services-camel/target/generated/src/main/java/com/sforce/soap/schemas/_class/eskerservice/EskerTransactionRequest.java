
package com.sforce.soap.schemas._class.eskerservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EskerTransactionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EskerTransactionRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attnLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cpSfdcOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerPO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataIn1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataIn2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataIn3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="faxURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="overrideFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="poReceiptTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="shipToCustomer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="soldToCustomer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EskerTransactionRequest", propOrder = {
    "attnLine",
    "cpSfdcOrderNumber",
    "customerPO",
    "dataIn1",
    "dataIn2",
    "dataIn3",
    "emailAddress",
    "faxURL",
    "overrideFlag",
    "poReceiptTimestamp",
    "shipToCustomer",
    "soldToCustomer"
})
public class EskerTransactionRequest {

    @XmlElement(nillable = true)
    protected String attnLine;
    @XmlElement(nillable = true)
    protected String cpSfdcOrderNumber;
    @XmlElement(nillable = true)
    protected String customerPO;
    @XmlElement(nillable = true)
    protected String dataIn1;
    @XmlElement(nillable = true)
    protected String dataIn2;
    @XmlElement(nillable = true)
    protected String dataIn3;
    @XmlElement(nillable = true)
    protected String emailAddress;
    @XmlElement(nillable = true)
    protected String faxURL;
    @XmlElement(nillable = true)
    protected Boolean overrideFlag;
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar poReceiptTimestamp;
    @XmlElement(nillable = true)
    protected String shipToCustomer;
    @XmlElement(nillable = true)
    protected String soldToCustomer;

    /**
     * Gets the value of the attnLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttnLine() {
        return attnLine;
    }

    /**
     * Sets the value of the attnLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttnLine(String value) {
        this.attnLine = value;
    }

    /**
     * Gets the value of the cpSfdcOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpSfdcOrderNumber() {
        return cpSfdcOrderNumber;
    }

    /**
     * Sets the value of the cpSfdcOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpSfdcOrderNumber(String value) {
        this.cpSfdcOrderNumber = value;
    }

    /**
     * Gets the value of the customerPO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPO() {
        return customerPO;
    }

    /**
     * Sets the value of the customerPO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPO(String value) {
        this.customerPO = value;
    }

    /**
     * Gets the value of the dataIn1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataIn1() {
        return dataIn1;
    }

    /**
     * Sets the value of the dataIn1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataIn1(String value) {
        this.dataIn1 = value;
    }

    /**
     * Gets the value of the dataIn2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataIn2() {
        return dataIn2;
    }

    /**
     * Sets the value of the dataIn2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataIn2(String value) {
        this.dataIn2 = value;
    }

    /**
     * Gets the value of the dataIn3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataIn3() {
        return dataIn3;
    }

    /**
     * Sets the value of the dataIn3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataIn3(String value) {
        this.dataIn3 = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the faxURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxURL() {
        return faxURL;
    }

    /**
     * Sets the value of the faxURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxURL(String value) {
        this.faxURL = value;
    }

    /**
     * Gets the value of the overrideFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverrideFlag() {
        return overrideFlag;
    }

    /**
     * Sets the value of the overrideFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverrideFlag(Boolean value) {
        this.overrideFlag = value;
    }

    /**
     * Gets the value of the poReceiptTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPoReceiptTimestamp() {
        return poReceiptTimestamp;
    }

    /**
     * Sets the value of the poReceiptTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPoReceiptTimestamp(XMLGregorianCalendar value) {
        this.poReceiptTimestamp = value;
    }

    /**
     * Gets the value of the shipToCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToCustomer() {
        return shipToCustomer;
    }

    /**
     * Sets the value of the shipToCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToCustomer(String value) {
        this.shipToCustomer = value;
    }

    /**
     * Gets the value of the soldToCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoldToCustomer() {
        return soldToCustomer;
    }

    /**
     * Sets the value of the soldToCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoldToCustomer(String value) {
        this.soldToCustomer = value;
    }

}
