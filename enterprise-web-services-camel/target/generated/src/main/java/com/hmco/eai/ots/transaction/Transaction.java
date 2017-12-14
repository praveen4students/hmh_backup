
package com.hmco.eai.ots.transaction;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.hmco.eai.ots.customer.Address;


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
 *         &lt;element name="transactionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="poNumber">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="35"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="orderSource" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="division" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="salesOffice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="soldToCustomerID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Transaction}soldToSANNumber" minOccurs="0"/>
 *         &lt;element name="soldToCustomerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="soldToCustomerAddress" type="{http://www.hmco.com/EAI/OTS/Customer}address"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Transaction}soldToCustomerEmailAddress" minOccurs="0"/>
 *         &lt;element name="shipToCustomerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Transaction}shipToSANNumber" minOccurs="0"/>
 *         &lt;element name="shipToCustomerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipToCustomerAddress" type="{http://www.hmco.com/EAI/OTS/Customer}address" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Transaction}shipToCustomerEmailAddress" minOccurs="0"/>
 *         &lt;element name="billToCustomerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Transaction}billToSANNumber" minOccurs="0"/>
 *         &lt;element name="billToCustomerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billToCustomerAddress" type="{http://www.hmco.com/EAI/OTS/Customer}address" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Transaction}billToCustomerEmailAddress" minOccurs="0"/>
 *         &lt;element name="isHeaderComplete" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Transaction}transactionRejectionStatus" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Transaction}transactionLineItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Transaction}shipToCareOf_1" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Transaction}shipToCareOf_2" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Transaction}billingBlock" minOccurs="0"/>
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
    "transactionID",
    "type",
    "poNumber",
    "status",
    "creationDate",
    "orderSource",
    "division",
    "salesOffice",
    "customerEmail",
    "soldToCustomerID",
    "soldToSANNumber",
    "soldToCustomerName",
    "soldToCustomerAddress",
    "soldToCustomerEmailAddress",
    "shipToCustomerID",
    "shipToSANNumber",
    "shipToCustomerName",
    "shipToCustomerAddress",
    "shipToCustomerEmailAddress",
    "billToCustomerID",
    "billToSANNumber",
    "billToCustomerName",
    "billToCustomerAddress",
    "billToCustomerEmailAddress",
    "isHeaderComplete",
    "transactionRejectionStatus",
    "transactionLineItem",
    "shipToCareOf1",
    "shipToCareOf2",
    "billingBlock"
})
@XmlRootElement(name = "transaction")
public class Transaction {

    @XmlElement(required = true)
    protected String transactionID;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected String poNumber;
    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(required = true)
    protected String orderSource;
    @XmlElement(required = true)
    protected String division;
    protected String salesOffice;
    protected String customerEmail;
    @XmlElement(required = true)
    protected String soldToCustomerID;
    protected String soldToSANNumber;
    @XmlElement(required = true)
    protected String soldToCustomerName;
    @XmlElement(required = true)
    protected Address soldToCustomerAddress;
    protected String soldToCustomerEmailAddress;
    protected String shipToCustomerID;
    protected String shipToSANNumber;
    protected String shipToCustomerName;
    protected Address shipToCustomerAddress;
    protected String shipToCustomerEmailAddress;
    protected String billToCustomerID;
    protected String billToSANNumber;
    protected String billToCustomerName;
    protected Address billToCustomerAddress;
    protected String billToCustomerEmailAddress;
    protected boolean isHeaderComplete;
    protected String transactionRejectionStatus;
    protected List<TransactionLineItem> transactionLineItem;
    @XmlElement(name = "shipToCareOf_1")
    protected String shipToCareOf1;
    @XmlElement(name = "shipToCareOf_2")
    protected String shipToCareOf2;
    protected String billingBlock;

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the orderSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderSource() {
        return orderSource;
    }

    /**
     * Sets the value of the orderSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderSource(String value) {
        this.orderSource = value;
    }

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
     * Gets the value of the salesOffice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesOffice() {
        return salesOffice;
    }

    /**
     * Sets the value of the salesOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesOffice(String value) {
        this.salesOffice = value;
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
     * Gets the value of the soldToSANNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoldToSANNumber() {
        return soldToSANNumber;
    }

    /**
     * Sets the value of the soldToSANNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoldToSANNumber(String value) {
        this.soldToSANNumber = value;
    }

    /**
     * Gets the value of the soldToCustomerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoldToCustomerName() {
        return soldToCustomerName;
    }

    /**
     * Sets the value of the soldToCustomerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoldToCustomerName(String value) {
        this.soldToCustomerName = value;
    }

    /**
     * Gets the value of the soldToCustomerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getSoldToCustomerAddress() {
        return soldToCustomerAddress;
    }

    /**
     * Sets the value of the soldToCustomerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setSoldToCustomerAddress(Address value) {
        this.soldToCustomerAddress = value;
    }

    /**
     * Gets the value of the soldToCustomerEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoldToCustomerEmailAddress() {
        return soldToCustomerEmailAddress;
    }

    /**
     * Sets the value of the soldToCustomerEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoldToCustomerEmailAddress(String value) {
        this.soldToCustomerEmailAddress = value;
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
     * Gets the value of the shipToSANNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToSANNumber() {
        return shipToSANNumber;
    }

    /**
     * Sets the value of the shipToSANNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToSANNumber(String value) {
        this.shipToSANNumber = value;
    }

    /**
     * Gets the value of the shipToCustomerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToCustomerName() {
        return shipToCustomerName;
    }

    /**
     * Sets the value of the shipToCustomerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToCustomerName(String value) {
        this.shipToCustomerName = value;
    }

    /**
     * Gets the value of the shipToCustomerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getShipToCustomerAddress() {
        return shipToCustomerAddress;
    }

    /**
     * Sets the value of the shipToCustomerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setShipToCustomerAddress(Address value) {
        this.shipToCustomerAddress = value;
    }

    /**
     * Gets the value of the shipToCustomerEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToCustomerEmailAddress() {
        return shipToCustomerEmailAddress;
    }

    /**
     * Sets the value of the shipToCustomerEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToCustomerEmailAddress(String value) {
        this.shipToCustomerEmailAddress = value;
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

    /**
     * Gets the value of the billToSANNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToSANNumber() {
        return billToSANNumber;
    }

    /**
     * Sets the value of the billToSANNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToSANNumber(String value) {
        this.billToSANNumber = value;
    }

    /**
     * Gets the value of the billToCustomerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToCustomerName() {
        return billToCustomerName;
    }

    /**
     * Sets the value of the billToCustomerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToCustomerName(String value) {
        this.billToCustomerName = value;
    }

    /**
     * Gets the value of the billToCustomerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getBillToCustomerAddress() {
        return billToCustomerAddress;
    }

    /**
     * Sets the value of the billToCustomerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setBillToCustomerAddress(Address value) {
        this.billToCustomerAddress = value;
    }

    /**
     * Gets the value of the billToCustomerEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToCustomerEmailAddress() {
        return billToCustomerEmailAddress;
    }

    /**
     * Sets the value of the billToCustomerEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToCustomerEmailAddress(String value) {
        this.billToCustomerEmailAddress = value;
    }

    /**
     * Gets the value of the isHeaderComplete property.
     * 
     */
    public boolean isIsHeaderComplete() {
        return isHeaderComplete;
    }

    /**
     * Sets the value of the isHeaderComplete property.
     * 
     */
    public void setIsHeaderComplete(boolean value) {
        this.isHeaderComplete = value;
    }

    /**
     * Gets the value of the transactionRejectionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionRejectionStatus() {
        return transactionRejectionStatus;
    }

    /**
     * Sets the value of the transactionRejectionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionRejectionStatus(String value) {
        this.transactionRejectionStatus = value;
    }

    /**
     * Gets the value of the transactionLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionLineItem }
     * 
     * 
     */
    public List<TransactionLineItem> getTransactionLineItem() {
        if (transactionLineItem == null) {
            transactionLineItem = new ArrayList<TransactionLineItem>();
        }
        return this.transactionLineItem;
    }

    /**
     * Gets the value of the shipToCareOf1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToCareOf1() {
        return shipToCareOf1;
    }

    /**
     * Sets the value of the shipToCareOf1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToCareOf1(String value) {
        this.shipToCareOf1 = value;
    }

    /**
     * Gets the value of the shipToCareOf2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToCareOf2() {
        return shipToCareOf2;
    }

    /**
     * Sets the value of the shipToCareOf2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToCareOf2(String value) {
        this.shipToCareOf2 = value;
    }

    /**
     * Gets the value of the billingBlock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingBlock() {
        return billingBlock;
    }

    /**
     * Sets the value of the billingBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingBlock(String value) {
        this.billingBlock = value;
    }

}
