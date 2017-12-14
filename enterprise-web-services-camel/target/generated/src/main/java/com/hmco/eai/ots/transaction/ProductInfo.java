
package com.hmco.eai.ots.transaction;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="lineNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="salesOffice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="materialID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isbn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="couponCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promotionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="listPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="netPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="productDivision" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="listDiscount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="isEGood" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isSubscription" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Material}subscriptionTerm" minOccurs="0"/>
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
    "salesOffice",
    "materialID",
    "isbn",
    "description",
    "couponCode",
    "promotionType",
    "quantity",
    "listPrice",
    "netPrice",
    "productDivision",
    "listDiscount",
    "isEGood",
    "isSubscription",
    "subscriptionTerm"
})
@XmlRootElement(name = "productInfo")
public class ProductInfo {

    protected int lineNo;
    protected String salesOffice;
    protected String materialID;
    @XmlElement(required = true)
    protected String isbn;
    @XmlElement(required = true)
    protected String description;
    protected String couponCode;
    protected String promotionType;
    protected int quantity;
    protected double listPrice;
    protected double netPrice;
    @XmlElement(required = true)
    protected String productDivision;
    protected double listDiscount;
    protected boolean isEGood;
    protected boolean isSubscription;
    @XmlElement(namespace = "http://www.hmco.com/EAI/OTS/Material")
    protected SubscriptionTerm subscriptionTerm;

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
     * Gets the value of the isbn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Sets the value of the isbn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsbn(String value) {
        this.isbn = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the value of the promotionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionType() {
        return promotionType;
    }

    /**
     * Sets the value of the promotionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionType(String value) {
        this.promotionType = value;
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
     * Gets the value of the productDivision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDivision() {
        return productDivision;
    }

    /**
     * Sets the value of the productDivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDivision(String value) {
        this.productDivision = value;
    }

    /**
     * Gets the value of the listDiscount property.
     * 
     */
    public double getListDiscount() {
        return listDiscount;
    }

    /**
     * Sets the value of the listDiscount property.
     * 
     */
    public void setListDiscount(double value) {
        this.listDiscount = value;
    }

    /**
     * Gets the value of the isEGood property.
     * 
     */
    public boolean isIsEGood() {
        return isEGood;
    }

    /**
     * Sets the value of the isEGood property.
     * 
     */
    public void setIsEGood(boolean value) {
        this.isEGood = value;
    }

    /**
     * Gets the value of the isSubscription property.
     * 
     */
    public boolean isIsSubscription() {
        return isSubscription;
    }

    /**
     * Sets the value of the isSubscription property.
     * 
     */
    public void setIsSubscription(boolean value) {
        this.isSubscription = value;
    }

    /**
     * Gets the value of the subscriptionTerm property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionTerm }
     *     
     */
    public SubscriptionTerm getSubscriptionTerm() {
        return subscriptionTerm;
    }

    /**
     * Sets the value of the subscriptionTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionTerm }
     *     
     */
    public void setSubscriptionTerm(SubscriptionTerm value) {
        this.subscriptionTerm = value;
    }

}
