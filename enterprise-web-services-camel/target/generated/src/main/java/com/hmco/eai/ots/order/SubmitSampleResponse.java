
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
import com.hmco.eai.Error;
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
 *         &lt;element name="header">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="transactionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}saleDate" minOccurs="0"/>
 *                   &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}orderSubTotal" minOccurs="0"/>
 *                   &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}taxAmount" minOccurs="0"/>
 *                   &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}shippingAmount" minOccurs="0"/>
 *                   &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}saleTotal" minOccurs="0"/>
 *                   &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}deliveredPricing" minOccurs="0"/>
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
 *                   &lt;element name="lineNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="materialID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}quantity" minOccurs="0"/>
 *                   &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}listPrice" minOccurs="0"/>
 *                   &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}netPrice" minOccurs="0"/>
 *                   &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}discountPercent" minOccurs="0"/>
 *                   &lt;element name="substituted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}couponCode" minOccurs="0"/>
 *                   &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}contractPriceIndicator" minOccurs="0"/>
 *                   &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}discountAmount" minOccurs="0"/>
 *                   &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}promoAmount" minOccurs="0"/>
 *                   &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}freeGoodsIndicator" minOccurs="0"/>
 *                   &lt;element name="lineItemError" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.hmco.com/EAI}error">
 *                           &lt;sequence>
 *                             &lt;element name="lineNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}deliveryInfo" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}deliveredPriceIndicator" minOccurs="0"/>
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
    "header",
    "lineItem"
})
@XmlRootElement(name = "submitSampleResponse")
public class SubmitSampleResponse {

    @XmlElement(required = true)
    protected SubmitSampleResponse.Header header;
    @XmlElement(required = true)
    protected List<SubmitSampleResponse.LineItem> lineItem;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link SubmitSampleResponse.Header }
     *     
     */
    public SubmitSampleResponse.Header getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmitSampleResponse.Header }
     *     
     */
    public void setHeader(SubmitSampleResponse.Header value) {
        this.header = value;
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
     * {@link SubmitSampleResponse.LineItem }
     * 
     * 
     */
    public List<SubmitSampleResponse.LineItem> getLineItem() {
        if (lineItem == null) {
            lineItem = new ArrayList<SubmitSampleResponse.LineItem>();
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
     *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}saleDate" minOccurs="0"/>
     *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}orderSubTotal" minOccurs="0"/>
     *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}taxAmount" minOccurs="0"/>
     *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}shippingAmount" minOccurs="0"/>
     *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}saleTotal" minOccurs="0"/>
     *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}deliveredPricing" minOccurs="0"/>
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
        "deliveredPricing"
    })
    public static class Header {

        @XmlElement(required = true)
        protected String transactionID;
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar saleDate;
        protected Double orderSubTotal;
        protected Double taxAmount;
        protected Double shippingAmount;
        protected Double saleTotal;
        protected Boolean deliveredPricing;

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
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getOrderSubTotal() {
            return orderSubTotal;
        }

        /**
         * Sets the value of the orderSubTotal property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setOrderSubTotal(Double value) {
            this.orderSubTotal = value;
        }

        /**
         * Gets the value of the taxAmount property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getTaxAmount() {
            return taxAmount;
        }

        /**
         * Sets the value of the taxAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setTaxAmount(Double value) {
            this.taxAmount = value;
        }

        /**
         * Gets the value of the shippingAmount property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getShippingAmount() {
            return shippingAmount;
        }

        /**
         * Sets the value of the shippingAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setShippingAmount(Double value) {
            this.shippingAmount = value;
        }

        /**
         * Gets the value of the saleTotal property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getSaleTotal() {
            return saleTotal;
        }

        /**
         * Sets the value of the saleTotal property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setSaleTotal(Double value) {
            this.saleTotal = value;
        }

        /**
         * Gets the value of the deliveredPricing property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDeliveredPricing() {
            return deliveredPricing;
        }

        /**
         * Sets the value of the deliveredPricing property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDeliveredPricing(Boolean value) {
            this.deliveredPricing = value;
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
     *         &lt;element name="lineNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="materialID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}quantity" minOccurs="0"/>
     *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}listPrice" minOccurs="0"/>
     *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}netPrice" minOccurs="0"/>
     *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}discountPercent" minOccurs="0"/>
     *         &lt;element name="substituted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}couponCode" minOccurs="0"/>
     *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}contractPriceIndicator" minOccurs="0"/>
     *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}discountAmount" minOccurs="0"/>
     *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}promoAmount" minOccurs="0"/>
     *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}freeGoodsIndicator" minOccurs="0"/>
     *         &lt;element name="lineItemError" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.hmco.com/EAI}error">
     *                 &lt;sequence>
     *                   &lt;element name="lineNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}deliveryInfo" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}deliveredPriceIndicator" minOccurs="0"/>
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
        "lineItemError",
        "deliveryInfo",
        "deliveredPriceIndicator",
        "subscriptionTerm"
    })
    public static class LineItem {

        @XmlElement(required = true)
        protected String lineNo;
        @XmlElement(required = true)
        protected String materialID;
        protected Double quantity;
        protected Double listPrice;
        protected Double netPrice;
        protected Double discountPercent;
        protected boolean substituted;
        protected String couponCode;
        protected Boolean contractPriceIndicator;
        protected Double discountAmount;
        protected Double promoAmount;
        protected Boolean freeGoodsIndicator;
        protected SubmitSampleResponse.LineItem.LineItemError lineItemError;
        protected List<DeliveryInfo> deliveryInfo;
        protected Boolean deliveredPriceIndicator;
        @XmlElement(namespace = "http://www.hmco.com/EAI/OTS/Material")
        protected List<SubscriptionTerm> subscriptionTerm;

        /**
         * Gets the value of the lineNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLineNo() {
            return lineNo;
        }

        /**
         * Sets the value of the lineNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLineNo(String value) {
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
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getQuantity() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setQuantity(Double value) {
            this.quantity = value;
        }

        /**
         * Gets the value of the listPrice property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getListPrice() {
            return listPrice;
        }

        /**
         * Sets the value of the listPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setListPrice(Double value) {
            this.listPrice = value;
        }

        /**
         * Gets the value of the netPrice property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getNetPrice() {
            return netPrice;
        }

        /**
         * Sets the value of the netPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setNetPrice(Double value) {
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
         */
        public boolean isSubstituted() {
            return substituted;
        }

        /**
         * Sets the value of the substituted property.
         * 
         */
        public void setSubstituted(boolean value) {
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
         * Gets the value of the lineItemError property.
         * 
         * @return
         *     possible object is
         *     {@link SubmitSampleResponse.LineItem.LineItemError }
         *     
         */
        public SubmitSampleResponse.LineItem.LineItemError getLineItemError() {
            return lineItemError;
        }

        /**
         * Sets the value of the lineItemError property.
         * 
         * @param value
         *     allowed object is
         *     {@link SubmitSampleResponse.LineItem.LineItemError }
         *     
         */
        public void setLineItemError(SubmitSampleResponse.LineItem.LineItemError value) {
            this.lineItemError = value;
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


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.hmco.com/EAI}error">
         *       &lt;sequence>
         *         &lt;element name="lineNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "lineNo"
        })
        public static class LineItemError
            extends Error
        {

            @XmlElement(required = true)
            protected String lineNo;

            /**
             * Gets the value of the lineNo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLineNo() {
                return lineNo;
            }

            /**
             * Sets the value of the lineNo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLineNo(String value) {
                this.lineNo = value;
            }

        }

    }

}
