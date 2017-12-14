
package com.hmco.eai.ots.transactionnew;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="invoiceNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="invoiceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billingDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="subTotal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="salesTax" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="shippingCharge" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="lineItem" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.hmco.com/EAI/OTS/TransactionNew}productInfo2"/>
 *                   &lt;element name="shipmentNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="shipmentLineNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="shipmentLocation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="paymentTerm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element ref="{http://www.hmco.com/EAI/OTS/TransactionNew}transactionNo" minOccurs="0"/>
 *                   &lt;element ref="{http://www.hmco.com/EAI/OTS/TransactionNew}transactionLineNo" minOccurs="0"/>
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
    "invoiceNo",
    "invoiceType",
    "billingDate",
    "subTotal",
    "salesTax",
    "shippingCharge",
    "total",
    "lineItem"
})
@XmlRootElement(name = "invoiceTransactionItem")
public class InvoiceTransactionItem {

    @XmlElement(required = true)
    protected String invoiceNo;
    @XmlElement(required = true)
    protected String invoiceType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar billingDate;
    protected double subTotal;
    protected double salesTax;
    protected double shippingCharge;
    protected double total;
    @XmlElement(required = true)
    protected List<InvoiceTransactionItem.LineItem> lineItem;

    /**
     * Gets the value of the invoiceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNo() {
        return invoiceNo;
    }

    /**
     * Sets the value of the invoiceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNo(String value) {
        this.invoiceNo = value;
    }

    /**
     * Gets the value of the invoiceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceType() {
        return invoiceType;
    }

    /**
     * Sets the value of the invoiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceType(String value) {
        this.invoiceType = value;
    }

    /**
     * Gets the value of the billingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBillingDate() {
        return billingDate;
    }

    /**
     * Sets the value of the billingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBillingDate(XMLGregorianCalendar value) {
        this.billingDate = value;
    }

    /**
     * Gets the value of the subTotal property.
     * 
     */
    public double getSubTotal() {
        return subTotal;
    }

    /**
     * Sets the value of the subTotal property.
     * 
     */
    public void setSubTotal(double value) {
        this.subTotal = value;
    }

    /**
     * Gets the value of the salesTax property.
     * 
     */
    public double getSalesTax() {
        return salesTax;
    }

    /**
     * Sets the value of the salesTax property.
     * 
     */
    public void setSalesTax(double value) {
        this.salesTax = value;
    }

    /**
     * Gets the value of the shippingCharge property.
     * 
     */
    public double getShippingCharge() {
        return shippingCharge;
    }

    /**
     * Sets the value of the shippingCharge property.
     * 
     */
    public void setShippingCharge(double value) {
        this.shippingCharge = value;
    }

    /**
     * Gets the value of the total property.
     * 
     */
    public double getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     */
    public void setTotal(double value) {
        this.total = value;
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
     * {@link InvoiceTransactionItem.LineItem }
     * 
     * 
     */
    public List<InvoiceTransactionItem.LineItem> getLineItem() {
        if (lineItem == null) {
            lineItem = new ArrayList<InvoiceTransactionItem.LineItem>();
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
     *         &lt;element ref="{http://www.hmco.com/EAI/OTS/TransactionNew}productInfo2"/>
     *         &lt;element name="shipmentNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="shipmentLineNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="shipmentLocation" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="paymentTerm" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element ref="{http://www.hmco.com/EAI/OTS/TransactionNew}transactionNo" minOccurs="0"/>
     *         &lt;element ref="{http://www.hmco.com/EAI/OTS/TransactionNew}transactionLineNo" minOccurs="0"/>
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
        "productInfo2",
        "shipmentNo",
        "shipmentLineNo",
        "shipmentLocation",
        "paymentTerm",
        "transactionNo",
        "transactionLineNo"
    })
    public static class LineItem {

        @XmlElement(required = true)
        protected ProductInfo2 productInfo2;
        @XmlElement(required = true)
        protected String shipmentNo;
        protected int shipmentLineNo;
        @XmlElement(required = true)
        protected String shipmentLocation;
        @XmlElement(required = true)
        protected String paymentTerm;
        protected String transactionNo;
        protected Integer transactionLineNo;

        /**
         * Gets the value of the productInfo2 property.
         * 
         * @return
         *     possible object is
         *     {@link ProductInfo2 }
         *     
         */
        public ProductInfo2 getProductInfo2() {
            return productInfo2;
        }

        /**
         * Sets the value of the productInfo2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProductInfo2 }
         *     
         */
        public void setProductInfo2(ProductInfo2 value) {
            this.productInfo2 = value;
        }

        /**
         * Gets the value of the shipmentNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShipmentNo() {
            return shipmentNo;
        }

        /**
         * Sets the value of the shipmentNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShipmentNo(String value) {
            this.shipmentNo = value;
        }

        /**
         * Gets the value of the shipmentLineNo property.
         * 
         */
        public int getShipmentLineNo() {
            return shipmentLineNo;
        }

        /**
         * Sets the value of the shipmentLineNo property.
         * 
         */
        public void setShipmentLineNo(int value) {
            this.shipmentLineNo = value;
        }

        /**
         * Gets the value of the shipmentLocation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShipmentLocation() {
            return shipmentLocation;
        }

        /**
         * Sets the value of the shipmentLocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShipmentLocation(String value) {
            this.shipmentLocation = value;
        }

        /**
         * Gets the value of the paymentTerm property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentTerm() {
            return paymentTerm;
        }

        /**
         * Sets the value of the paymentTerm property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaymentTerm(String value) {
            this.paymentTerm = value;
        }

        /**
         * Gets the value of the transactionNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransactionNo() {
            return transactionNo;
        }

        /**
         * Sets the value of the transactionNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTransactionNo(String value) {
            this.transactionNo = value;
        }

        /**
         * Gets the value of the transactionLineNo property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getTransactionLineNo() {
            return transactionLineNo;
        }

        /**
         * Sets the value of the transactionLineNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setTransactionLineNo(Integer value) {
            this.transactionLineNo = value;
        }

    }

}
