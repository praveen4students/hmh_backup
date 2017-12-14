
package com.hmco.eai.ots.order;

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
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}submitSaleTranAction"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}saleHeader"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}saleLineItemList"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}creditCard" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}clientTransactionID" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}poNumber"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}submitForManualCorrection"/>
 *         &lt;element name="tranType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "submitSaleTranAction",
    "saleHeader",
    "saleLineItemList",
    "creditCard",
    "clientTransactionID",
    "poNumber",
    "submitForManualCorrection",
    "tranType"
})
@XmlRootElement(name = "submitSaleRequest")
public class SubmitSaleRequest {

    @XmlElement(required = true)
    protected String submitSaleTranAction;
    @XmlElement(required = true)
    protected SaleHeader saleHeader;
    @XmlElement(required = true)
    protected SaleLineItemList saleLineItemList;
    protected CreditCard creditCard;
    protected String clientTransactionID;
    @XmlElement(required = true)
    protected String poNumber;
    protected boolean submitForManualCorrection;
    protected String tranType;

    /**
     * Gets the value of the submitSaleTranAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmitSaleTranAction() {
        return submitSaleTranAction;
    }

    /**
     * Sets the value of the submitSaleTranAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmitSaleTranAction(String value) {
        this.submitSaleTranAction = value;
    }

    /**
     * Gets the value of the saleHeader property.
     * 
     * @return
     *     possible object is
     *     {@link SaleHeader }
     *     
     */
    public SaleHeader getSaleHeader() {
        return saleHeader;
    }

    /**
     * Sets the value of the saleHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleHeader }
     *     
     */
    public void setSaleHeader(SaleHeader value) {
        this.saleHeader = value;
    }

    /**
     * Gets the value of the saleLineItemList property.
     * 
     * @return
     *     possible object is
     *     {@link SaleLineItemList }
     *     
     */
    public SaleLineItemList getSaleLineItemList() {
        return saleLineItemList;
    }

    /**
     * Sets the value of the saleLineItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleLineItemList }
     *     
     */
    public void setSaleLineItemList(SaleLineItemList value) {
        this.saleLineItemList = value;
    }

    /**
     * Gets the value of the creditCard property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCard }
     *     
     */
    public CreditCard getCreditCard() {
        return creditCard;
    }

    /**
     * Sets the value of the creditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCard }
     *     
     */
    public void setCreditCard(CreditCard value) {
        this.creditCard = value;
    }

    /**
     * Gets the value of the clientTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientTransactionID() {
        return clientTransactionID;
    }

    /**
     * Sets the value of the clientTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientTransactionID(String value) {
        this.clientTransactionID = value;
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
     * Gets the value of the submitForManualCorrection property.
     * 
     */
    public boolean isSubmitForManualCorrection() {
        return submitForManualCorrection;
    }

    /**
     * Sets the value of the submitForManualCorrection property.
     * 
     */
    public void setSubmitForManualCorrection(boolean value) {
        this.submitForManualCorrection = value;
    }

    /**
     * Gets the value of the tranType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranType() {
        return tranType;
    }

    /**
     * Sets the value of the tranType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranType(String value) {
        this.tranType = value;
    }

}
