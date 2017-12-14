
package com.hmco.eai.ots.order;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}couponCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}districtPid" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}effectiveDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}entryDivision" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}expirationDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}isPriceListOrderForm" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}sfdcTransactionLineItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}sfdcInternalOrderId" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}sfdcOrderNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}shiptoCustomerId" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}soldtoCustomerId" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}transactionName" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}transactionStatus" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}transactionType" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}techContactEmail" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}techContactName" minOccurs="0"/>
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
    "couponCode",
    "districtPid",
    "effectiveDate",
    "entryDivision",
    "expirationDate",
    "isPriceListOrderForm",
    "sfdcTransactionLineItem",
    "sfdcInternalOrderId",
    "sfdcOrderNumber",
    "shiptoCustomerId",
    "soldtoCustomerId",
    "transactionName",
    "transactionStatus",
    "transactionType",
    "techContactEmail",
    "techContactName"
})
@XmlRootElement(name = "sfdcTransactionHeader")
public class SfdcTransactionHeader {

    protected String couponCode;
    protected String districtPid;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    protected String entryDivision;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expirationDate;
    protected Boolean isPriceListOrderForm;
    protected List<SfdcTransactionLineItem> sfdcTransactionLineItem;
    protected String sfdcInternalOrderId;
    protected String sfdcOrderNumber;
    protected String shiptoCustomerId;
    protected String soldtoCustomerId;
    protected String transactionName;
    protected String transactionStatus;
    protected String transactionType;
    protected String techContactEmail;
    protected String techContactName;

    /**
     * Gets the value of the couponCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponCode() {
        return couponCode;
    }

    /**
     * Sets the value of the couponCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponCode(String value) {
        this.couponCode = value;
    }

    /**
     * Gets the value of the districtPid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictPid() {
        return districtPid;
    }

    /**
     * Sets the value of the districtPid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictPid(String value) {
        this.districtPid = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the entryDivision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryDivision() {
        return entryDivision;
    }

    /**
     * Sets the value of the entryDivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryDivision(String value) {
        this.entryDivision = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the isPriceListOrderForm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPriceListOrderForm() {
        return isPriceListOrderForm;
    }

    /**
     * Sets the value of the isPriceListOrderForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPriceListOrderForm(Boolean value) {
        this.isPriceListOrderForm = value;
    }

    /**
     * Gets the value of the sfdcTransactionLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sfdcTransactionLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSfdcTransactionLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SfdcTransactionLineItem }
     * 
     * 
     */
    public List<SfdcTransactionLineItem> getSfdcTransactionLineItem() {
        if (sfdcTransactionLineItem == null) {
            sfdcTransactionLineItem = new ArrayList<SfdcTransactionLineItem>();
        }
        return this.sfdcTransactionLineItem;
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
     * Gets the value of the shiptoCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShiptoCustomerId() {
        return shiptoCustomerId;
    }

    /**
     * Sets the value of the shiptoCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShiptoCustomerId(String value) {
        this.shiptoCustomerId = value;
    }

    /**
     * Gets the value of the soldtoCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoldtoCustomerId() {
        return soldtoCustomerId;
    }

    /**
     * Sets the value of the soldtoCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoldtoCustomerId(String value) {
        this.soldtoCustomerId = value;
    }

    /**
     * Gets the value of the transactionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionName() {
        return transactionName;
    }

    /**
     * Sets the value of the transactionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionName(String value) {
        this.transactionName = value;
    }

    /**
     * Gets the value of the transactionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionStatus() {
        return transactionStatus;
    }

    /**
     * Sets the value of the transactionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionStatus(String value) {
        this.transactionStatus = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the techContactEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechContactEmail() {
        return techContactEmail;
    }

    /**
     * Sets the value of the techContactEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechContactEmail(String value) {
        this.techContactEmail = value;
    }

    /**
     * Gets the value of the techContactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechContactName() {
        return techContactName;
    }

    /**
     * Sets the value of the techContactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechContactName(String value) {
        this.techContactName = value;
    }

}
