
package com.hmco.eai.ots.order;

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
 *         &lt;element name="soldToCustomerID">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="shipToCustomerID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}billToCustomerID" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}shipToAttentionLine" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}billToAttentionLine" minOccurs="0"/>
 *         &lt;element name="entryDivision" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}contactName" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}contactPhone" minOccurs="0"/>
 *         &lt;element name="toDepartment" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="shipToLocation" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="overrideAddress" type="{http://www.hmco.com/EAI/OTS/Customer}address" minOccurs="0"/>
 *         &lt;element name="orderSource" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shipmentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}priceDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}promotionCode" minOccurs="0"/>
 *         &lt;element name="allowSubstitutionsFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}allowContractPricingFlag" minOccurs="0"/>
 *         &lt;element name="requestedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="shipDateOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}arTerms" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}shippingTerms" minOccurs="0"/>
 *         &lt;element name="salesRepID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="backorderOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="backorderCancelDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}deferedPaymentDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}freeformMessage" minOccurs="0"/>
 *         &lt;element name="handlingTerms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerEmail" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="256"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}headerCouponCode" minOccurs="0"/>
 *         &lt;element name="deliveryBlock" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}orderReason" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}csHold" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}userId" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}billOfLading" minOccurs="0"/>
 *         &lt;element name="mustArriveByDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}mustArriveByReason" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}removeFreightForwarder" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}dockInstructions" minOccurs="0"/>
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
    "billToCustomerID",
    "shipToAttentionLine",
    "billToAttentionLine",
    "entryDivision",
    "contactName",
    "contactPhone",
    "toDepartment",
    "shipToLocation",
    "overrideAddress",
    "orderSource",
    "shipmentMethod",
    "priceDate",
    "promotionCode",
    "allowSubstitutionsFlag",
    "allowContractPricingFlag",
    "requestedDate",
    "shipDateOption",
    "arTerms",
    "shippingTerms",
    "salesRepID",
    "backorderOption",
    "backorderCancelDate",
    "deferedPaymentDate",
    "freeformMessage",
    "handlingTerms",
    "customerEmail",
    "headerCouponCode",
    "deliveryBlock",
    "orderReason",
    "csHold",
    "userId",
    "billOfLading",
    "mustArriveByDate",
    "mustArriveByReason",
    "removeFreightForwarder",
    "dockInstructions"
})
@XmlRootElement(name = "sampleHeader")
public class SampleHeader {

    @XmlElement(required = true)
    protected String soldToCustomerID;
    protected String shipToCustomerID;
    protected String billToCustomerID;
    protected String shipToAttentionLine;
    protected String billToAttentionLine;
    @XmlElement(required = true)
    protected String entryDivision;
    protected String contactName;
    protected String contactPhone;
    protected String toDepartment;
    protected String shipToLocation;
    protected Address overrideAddress;
    @XmlElement(required = true)
    protected String orderSource;
    protected String shipmentMethod;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar priceDate;
    protected String promotionCode;
    protected boolean allowSubstitutionsFlag;
    protected Boolean allowContractPricingFlag;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar requestedDate;
    protected String shipDateOption;
    protected String arTerms;
    protected String shippingTerms;
    protected String salesRepID;
    protected String backorderOption;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar backorderCancelDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar deferedPaymentDate;
    protected String freeformMessage;
    protected String handlingTerms;
    protected String customerEmail;
    protected String headerCouponCode;
    protected String deliveryBlock;
    protected String orderReason;
    protected String csHold;
    protected String userId;
    protected String billOfLading;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mustArriveByDate;
    protected String mustArriveByReason;
    protected Boolean removeFreightForwarder;
    protected String dockInstructions;

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

    /**
     * Gets the value of the shipToAttentionLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToAttentionLine() {
        return shipToAttentionLine;
    }

    /**
     * Sets the value of the shipToAttentionLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToAttentionLine(String value) {
        this.shipToAttentionLine = value;
    }

    /**
     * Gets the value of the billToAttentionLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToAttentionLine() {
        return billToAttentionLine;
    }

    /**
     * Sets the value of the billToAttentionLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToAttentionLine(String value) {
        this.billToAttentionLine = value;
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
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the contactPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * Sets the value of the contactPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPhone(String value) {
        this.contactPhone = value;
    }

    /**
     * Gets the value of the toDepartment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToDepartment() {
        return toDepartment;
    }

    /**
     * Sets the value of the toDepartment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToDepartment(String value) {
        this.toDepartment = value;
    }

    /**
     * Gets the value of the shipToLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToLocation() {
        return shipToLocation;
    }

    /**
     * Sets the value of the shipToLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToLocation(String value) {
        this.shipToLocation = value;
    }

    /**
     * Gets the value of the overrideAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getOverrideAddress() {
        return overrideAddress;
    }

    /**
     * Sets the value of the overrideAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setOverrideAddress(Address value) {
        this.overrideAddress = value;
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
     * Gets the value of the shipmentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentMethod() {
        return shipmentMethod;
    }

    /**
     * Sets the value of the shipmentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentMethod(String value) {
        this.shipmentMethod = value;
    }

    /**
     * Gets the value of the priceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPriceDate() {
        return priceDate;
    }

    /**
     * Sets the value of the priceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPriceDate(XMLGregorianCalendar value) {
        this.priceDate = value;
    }

    /**
     * Gets the value of the promotionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionCode() {
        return promotionCode;
    }

    /**
     * Sets the value of the promotionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionCode(String value) {
        this.promotionCode = value;
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

    /**
     * Gets the value of the allowContractPricingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowContractPricingFlag() {
        return allowContractPricingFlag;
    }

    /**
     * Sets the value of the allowContractPricingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowContractPricingFlag(Boolean value) {
        this.allowContractPricingFlag = value;
    }

    /**
     * Gets the value of the requestedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestedDate() {
        return requestedDate;
    }

    /**
     * Sets the value of the requestedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestedDate(XMLGregorianCalendar value) {
        this.requestedDate = value;
    }

    /**
     * Gets the value of the shipDateOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipDateOption() {
        return shipDateOption;
    }

    /**
     * Sets the value of the shipDateOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipDateOption(String value) {
        this.shipDateOption = value;
    }

    /**
     * Gets the value of the arTerms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArTerms() {
        return arTerms;
    }

    /**
     * Sets the value of the arTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArTerms(String value) {
        this.arTerms = value;
    }

    /**
     * Gets the value of the shippingTerms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingTerms() {
        return shippingTerms;
    }

    /**
     * Sets the value of the shippingTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingTerms(String value) {
        this.shippingTerms = value;
    }

    /**
     * Gets the value of the salesRepID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesRepID() {
        return salesRepID;
    }

    /**
     * Sets the value of the salesRepID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesRepID(String value) {
        this.salesRepID = value;
    }

    /**
     * Gets the value of the backorderOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackorderOption() {
        return backorderOption;
    }

    /**
     * Sets the value of the backorderOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackorderOption(String value) {
        this.backorderOption = value;
    }

    /**
     * Gets the value of the backorderCancelDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBackorderCancelDate() {
        return backorderCancelDate;
    }

    /**
     * Sets the value of the backorderCancelDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBackorderCancelDate(XMLGregorianCalendar value) {
        this.backorderCancelDate = value;
    }

    /**
     * Gets the value of the deferedPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeferedPaymentDate() {
        return deferedPaymentDate;
    }

    /**
     * Sets the value of the deferedPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeferedPaymentDate(XMLGregorianCalendar value) {
        this.deferedPaymentDate = value;
    }

    /**
     * Gets the value of the freeformMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeformMessage() {
        return freeformMessage;
    }

    /**
     * Sets the value of the freeformMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreeformMessage(String value) {
        this.freeformMessage = value;
    }

    /**
     * Gets the value of the handlingTerms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandlingTerms() {
        return handlingTerms;
    }

    /**
     * Sets the value of the handlingTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandlingTerms(String value) {
        this.handlingTerms = value;
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
     * Gets the value of the headerCouponCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderCouponCode() {
        return headerCouponCode;
    }

    /**
     * Sets the value of the headerCouponCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderCouponCode(String value) {
        this.headerCouponCode = value;
    }

    /**
     * Gets the value of the deliveryBlock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryBlock() {
        return deliveryBlock;
    }

    /**
     * Sets the value of the deliveryBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryBlock(String value) {
        this.deliveryBlock = value;
    }

    /**
     * Gets the value of the orderReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderReason() {
        return orderReason;
    }

    /**
     * Sets the value of the orderReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderReason(String value) {
        this.orderReason = value;
    }

    /**
     * Gets the value of the csHold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsHold() {
        return csHold;
    }

    /**
     * Sets the value of the csHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsHold(String value) {
        this.csHold = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the billOfLading property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillOfLading() {
        return billOfLading;
    }

    /**
     * Sets the value of the billOfLading property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillOfLading(String value) {
        this.billOfLading = value;
    }

    /**
     * Gets the value of the mustArriveByDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMustArriveByDate() {
        return mustArriveByDate;
    }

    /**
     * Sets the value of the mustArriveByDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMustArriveByDate(XMLGregorianCalendar value) {
        this.mustArriveByDate = value;
    }

    /**
     * Gets the value of the mustArriveByReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMustArriveByReason() {
        return mustArriveByReason;
    }

    /**
     * Sets the value of the mustArriveByReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMustArriveByReason(String value) {
        this.mustArriveByReason = value;
    }

    /**
     * Gets the value of the removeFreightForwarder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemoveFreightForwarder() {
        return removeFreightForwarder;
    }

    /**
     * Sets the value of the removeFreightForwarder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoveFreightForwarder(Boolean value) {
        this.removeFreightForwarder = value;
    }

    /**
     * Gets the value of the dockInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDockInstructions() {
        return dockInstructions;
    }

    /**
     * Sets the value of the dockInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDockInstructions(String value) {
        this.dockInstructions = value;
    }

}
