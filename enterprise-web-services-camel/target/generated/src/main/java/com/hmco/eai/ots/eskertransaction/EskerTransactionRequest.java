
package com.hmco.eai.ots.eskertransaction;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/EskerTransaction}cpSfdcOrderNumber"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/EskerTransaction}soldToCustomer" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/EskerTransaction}shipToCustomer" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/EskerTransaction}attnLine" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/EskerTransaction}emailAddress" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/EskerTransaction}faxURL" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/EskerTransaction}customerPO"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/EskerTransaction}overrideFlag"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/EskerTransaction}dataIn1" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/EskerTransaction}dataIn2" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/EskerTransaction}dataIn3" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/EskerTransaction}poReceiptTimestamp" minOccurs="0"/>
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
    "cpSfdcOrderNumber",
    "soldToCustomer",
    "shipToCustomer",
    "attnLine",
    "emailAddress",
    "faxURL",
    "customerPO",
    "overrideFlag",
    "dataIn1",
    "dataIn2",
    "dataIn3",
    "poReceiptTimestamp"
})
@XmlRootElement(name = "EskerTransactionRequest")
public class EskerTransactionRequest {

    @XmlElement(required = true)
    protected String cpSfdcOrderNumber;
    protected String soldToCustomer;
    protected String shipToCustomer;
    protected String attnLine;
    protected String emailAddress;
    protected String faxURL;
    @XmlElement(required = true)
    protected String customerPO;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "boolean")
    protected String overrideFlag;
    protected String dataIn1;
    protected String dataIn2;
    protected String dataIn3;
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar poReceiptTimestamp;

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
     * Gets the value of the overrideFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideFlag() {
        return overrideFlag;
    }

    /**
     * Sets the value of the overrideFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrideFlag(String value) {
        this.overrideFlag = value;
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

}
