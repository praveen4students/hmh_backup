
package com.hmco.eai.ots.order;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.hmco.eai.ots.material.SubscriptionTerm;


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
 *         &lt;element name="header2">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="transactionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="saleDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="orderSubTotal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="taxAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="shippingAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="saleTotal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="deliveredPricing" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="ccPreauth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ccResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ccResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ccCVVResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ccAddResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="lineItem" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="lineNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="materialID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="listPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="netPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="discountPercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="substituted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="couponCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="contractPriceIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="discountAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="promoAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="freeGoodsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}deliveryInfo" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="deliveredPriceIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element ref="{http://www.hmco.com/EAI/OTS/Material}subscriptionTerm" maxOccurs="unbounded" minOccurs="0"/>
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
    "header2",
    "lineItem"
})
@XmlRootElement(name = "submitSaleResponse2")
public class SubmitSaleResponse2 {

    @XmlElement(required = true)
    protected SubmitSaleResponse2 .Header2 header2;
    @XmlElement(required = true)
    protected List<SubmitSaleResponse2 .LineItem> lineItem;

    /**
     * Gets the value of the header2 property.
     * 
     * @return
     *     possible object is
     *     {@link SubmitSaleResponse2 .Header2 }
     *     
     */
    public SubmitSaleResponse2 .Header2 getHeader2() {
        return header2;
    }

    /**
     * Sets the value of the header2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmitSaleResponse2 .Header2 }
     *     
     */
    public void setHeader2(SubmitSaleResponse2 .Header2 value) {
        this.header2 = value;
    }

    /**
     * Gets the value of the lineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubmitSaleResponse2 .LineItem }
     * 
     * 
     */
    public List<SubmitSaleResponse2 .LineItem> getLineItem() {
        if (lineItem == null) {
            lineItem = new ArrayList<SubmitSaleResponse2 .LineItem>();
        }
        return this.lineItem;
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
     *         &lt;element name="transactionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="saleDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="orderSubTotal" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *         &lt;element name="taxAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *         &lt;element name="shippingAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *         &lt;element name="saleTotal" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *         &lt;element name="deliveredPricing" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="ccPreauth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ccResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ccResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ccCVVResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ccAddResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "saleDate",
        "orderSubTotal",
        "taxAmount",
        "shippingAmount",
        "saleTotal",
        "deliveredPricing",
        "ccPreauth",
        "ccResponse",
        "ccResult",
        "ccCVVResult",
        "ccAddResult"
    })
    public static class Header2 {

        @XmlElement(required = true)
        protected String transactionID;
        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar saleDate;
        protected double orderSubTotal;
        protected double taxAmount;
        protected double shippingAmount;
        protected double saleTotal;
        protected boolean deliveredPricing;
        protected String ccPreauth;
        protected String ccResponse;
        protected String ccResult;
        protected String ccCVVResult;
        protected String ccAddResult;

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
         * Gets the value of the saleDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getSaleDate() {
            return saleDate;
        }

        /**
         * Sets the value of the saleDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setSaleDate(XMLGregorianCalendar value) {
            this.saleDate = value;
        }

        /**
         * Gets the value of the orderSubTotal property.
         * 
         */
        public double getOrderSubTotal() {
            return orderSubTotal;
        }

        /**
         * Sets the value of the orderSubTotal property.
         * 
         */
        public void setOrderSubTotal(double value) {
            this.orderSubTotal = value;
        }

        /**
         * Gets the value of the taxAmount property.
         * 
         */
        public double getTaxAmount() {
            return taxAmount;
        }

        /**
         * Sets the value of the taxAmount property.
         * 
         */
        public void setTaxAmount(double value) {
            this.taxAmount = value;
        }

        /**
         * Gets the value of the shippingAmount property.
         * 
         */
        public double getShippingAmount() {
            return shippingAmount;
        }

        /**
         * Sets the value of the shippingAmount property.
         * 
         */
        public void setShippingAmount(double value) {
            this.shippingAmount = value;
        }

        /**
         * Gets the value of the saleTotal property.
         * 
         */
        public double getSaleTotal() {
            return saleTotal;
        }

        /**
         * Sets the value of the saleTotal property.
         * 
         */
        public void setSaleTotal(double value) {
            this.saleTotal = value;
        }

        /**
         * Gets the value of the deliveredPricing property.
         * 
         */
        public boolean isDeliveredPricing() {
            return deliveredPricing;
        }

        /**
         * Sets the value of the deliveredPricing property.
         * 
         */
        public void setDeliveredPricing(boolean value) {
            this.deliveredPricing = value;
        }

        /**
         * Gets the value of the ccPreauth property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCcPreauth() {
            return ccPreauth;
        }

        /**
         * Sets the value of the ccPreauth property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCcPreauth(String value) {
            this.ccPreauth = value;
        }

        /**
         * Gets the value of the ccResponse property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCcResponse() {
            return ccResponse;
        }

        /**
         * Sets the value of the ccResponse property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCcResponse(String value) {
            this.ccResponse = value;
        }

        /**
         * Gets the value of the ccResult property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCcResult() {
            return ccResult;
        }

        /**
         * Sets the value of the ccResult property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCcResult(String value) {
            this.ccResult = value;
        }

        /**
         * Gets the value of the ccCVVResult property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCcCVVResult() {
            return ccCVVResult;
        }

        /**
         * Sets the value of the ccCVVResult property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCcCVVResult(String value) {
            this.ccCVVResult = value;
        }

        /**
         * Gets the value of the ccAddResult property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCcAddResult() {
            return ccAddResult;
        }

        /**
         * Sets the value of the ccAddResult property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCcAddResult(String value) {
            this.ccAddResult = value;
        }

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
     *         &lt;element name="lineNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="materialID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="listPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *         &lt;element name="netPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *         &lt;element name="discountPercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *         &lt;element name="substituted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="couponCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="contractPriceIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="discountAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *         &lt;element name="promoAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *         &lt;element name="freeGoodsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}deliveryInfo" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="deliveredPriceIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Material}subscriptionTerm" maxOccurs="unbounded" minOccurs="0"/>
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
        "lineNo",
        "materialID",
        "quantity",
        "listPrice",
        "netPrice",
        "discountPercent",
        "substituted",
        "couponCode",
        "contractPriceIndicator",
        "discountAmount",
        "promoAmount",
        "freeGoodsIndicator",
        "deliveryInfo",
        "deliveredPriceIndicator",
        "subscriptionTerm"
    })
    public static class LineItem {

        protected int lineNo;
        @XmlElement(required = true)
        protected String materialID;
        protected int quantity;
        protected double listPrice;
        protected double netPrice;
        protected Double discountPercent;
        protected Boolean substituted;
        @XmlElement(nillable = true)
        protected String couponCode;
        @XmlElement(nillable = true)
        protected Boolean contractPriceIndicator;
        @XmlElement(nillable = true)
        protected Double discountAmount;
        @XmlElement(nillable = true)
        protected Double promoAmount;
        @XmlElement(nillable = true)
        protected Boolean freeGoodsIndicator;
        protected List<DeliveryInfo> deliveryInfo;
        protected Boolean deliveredPriceIndicator;
        @XmlElement(namespace = "http://www.hmco.com/EAI/OTS/Material")
        protected List<SubscriptionTerm> subscriptionTerm;

        /**
         * Gets the value of the lineNo property.
         * 
         */
        public int getLineNo() {
            return lineNo;
        }

        /**
         * Sets the value of the lineNo property.
         * 
         */
        public void setLineNo(int value) {
            this.lineNo = value;
        }

        /**
         * Gets the value of the materialID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMaterialID() {
            return materialID;
        }

        /**
         * Sets the value of the materialID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMaterialID(String value) {
            this.materialID = value;
        }

        /**
         * Gets the value of the quantity property.
         * 
         */
        public int getQuantity() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         */
        public void setQuantity(int value) {
            this.quantity = value;
        }

        /**
         * Gets the value of the listPrice property.
         * 
         */
        public double getListPrice() {
            return listPrice;
        }

        /**
         * Sets the value of the listPrice property.
         * 
         */
        public void setListPrice(double value) {
            this.listPrice = value;
        }

        /**
         * Gets the value of the netPrice property.
         * 
         */
        public double getNetPrice() {
            return netPrice;
        }

        /**
         * Sets the value of the netPrice property.
         * 
         */
        public void setNetPrice(double value) {
            this.netPrice = value;
        }

        /**
         * Gets the value of the discountPercent property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getDiscountPercent() {
            return discountPercent;
        }

        /**
         * Sets the value of the discountPercent property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setDiscountPercent(Double value) {
            this.discountPercent = value;
        }

        /**
         * Gets the value of the substituted property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSubstituted() {
            return substituted;
        }

        /**
         * Sets the value of the substituted property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSubstituted(Boolean value) {
            this.substituted = value;
        }

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
         * Gets the value of the contractPriceIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isContractPriceIndicator() {
            return contractPriceIndicator;
        }

        /**
         * Sets the value of the contractPriceIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setContractPriceIndicator(Boolean value) {
            this.contractPriceIndicator = value;
        }

        /**
         * Gets the value of the discountAmount property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getDiscountAmount() {
            return discountAmount;
        }

        /**
         * Sets the value of the discountAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setDiscountAmount(Double value) {
            this.discountAmount = value;
        }

        /**
         * Gets the value of the promoAmount property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getPromoAmount() {
            return promoAmount;
        }

        /**
         * Sets the value of the promoAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setPromoAmount(Double value) {
            this.promoAmount = value;
        }

        /**
         * Gets the value of the freeGoodsIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFreeGoodsIndicator() {
            return freeGoodsIndicator;
        }

        /**
         * Sets the value of the freeGoodsIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFreeGoodsIndicator(Boolean value) {
            this.freeGoodsIndicator = value;
        }

        /**
         * Gets the value of the deliveryInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the deliveryInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDeliveryInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DeliveryInfo }
         * 
         * 
         */
        public List<DeliveryInfo> getDeliveryInfo() {
            if (deliveryInfo == null) {
                deliveryInfo = new ArrayList<DeliveryInfo>();
            }
            return this.deliveryInfo;
        }

        /**
         * Gets the value of the deliveredPriceIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDeliveredPriceIndicator() {
            return deliveredPriceIndicator;
        }

        /**
         * Sets the value of the deliveredPriceIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDeliveredPriceIndicator(Boolean value) {
            this.deliveredPriceIndicator = value;
        }

        /**
         * Gets the value of the subscriptionTerm property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subscriptionTerm property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubscriptionTerm().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SubscriptionTerm }
         * 
         * 
         */
        public List<SubscriptionTerm> getSubscriptionTerm() {
            if (subscriptionTerm == null) {
                subscriptionTerm = new ArrayList<SubscriptionTerm>();
            }
            return this.subscriptionTerm;
        }

    }

}
