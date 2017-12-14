
package com.hmco.eai.ots.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="billToCustomerID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="shipToAttentionLine" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="billToAttentionLine" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="entryDivision" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contactName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="contactPhone" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="orderSource" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shipmentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priceDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="promotionCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="allowSubstitutionsFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="allowContractPricingFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="requestedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="shipDateOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arTerms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shippingTerms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="backorderOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="backorderCancelDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="deferedPaymentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="freeformMessage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1256"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="customerEmail" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="256"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="headerCouponCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deliveryBlock" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}orderReason" minOccurs="0"/>
 *         &lt;element name="csHold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}billOfLading" minOccurs="0"/>
 *         &lt;element name="mustArriveByDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}mustArriveByReason" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}shipToCustomerPO" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}faxURL" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}removeFreightForwarder" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}forceDeliveredPricing" minOccurs="0"/>
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
    "backorderOption",
    "backorderCancelDate",
    "deferedPaymentDate",
    "freeformMessage",
    "customerEmail",
    "headerCouponCode",
    "deliveryBlock",
    "orderReason",
    "csHold",
    "userId",
    "billOfLading",
    "mustArriveByDate",
    "mustArriveByReason",
    "shipToCustomerPO",
    "faxURL",
    "removeFreightForwarder",
    "forceDeliveredPricing",
    "dockInstructions"
})
@XmlRootElement(name = "saleHeader")
public class SaleHeader {

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
    @XmlElement(required = true)
    protected String orderSource;
    protected String shipmentMethod;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar priceDate;
    protected String promotionCode;
    protected boolean allowSubstitutionsFlag;
    protected boolean allowContractPricingFlag;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar requestedDate;
    protected String shipDateOption;
    protected String arTerms;
    protected String shippingTerms;
    protected String backorderOption;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar backorderCancelDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar deferedPaymentDate;
    protected String freeformMessage;
    protected String customerEmail;
    @XmlElement(nillable = true)
    protected String headerCouponCode;
    protected String deliveryBlock;
    protected String orderReason;
    protected String csHold;
    protected String userId;
    protected String billOfLading;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mustArriveByDate;
    protected String mustArriveByReason;
    protected String shipToCustomerPO;
    protected String faxURL;
    protected Boolean removeFreightForwarder;
    protected String forceDeliveredPricing;
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
     */
    public boolean isAllowContractPricingFlag() {
        return allowContractPricingFlag;
    }

    /**
     * Sets the value of the allowContractPricingFlag property.
     * 
     */
    public void setAllowContractPricingFlag(boolean value) {
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
     * Gets the value of the shipToCustomerPO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToCustomerPO() {
        return shipToCustomerPO;
    }

    /**
     * Sets the value of the shipToCustomerPO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToCustomerPO(String value) {
        this.shipToCustomerPO = value;
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
     * Gets the value of the forceDeliveredPricing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForceDeliveredPricing() {
        return forceDeliveredPricing;
    }

    /**
     * Sets the value of the forceDeliveredPricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForceDeliveredPricing(String value) {
        this.forceDeliveredPricing = value;
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
