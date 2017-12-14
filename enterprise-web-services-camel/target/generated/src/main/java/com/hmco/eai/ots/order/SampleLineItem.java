
package com.hmco.eai.ots.order;

import java.math.BigDecimal;
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
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}materialKey"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}lineCouponCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Material}subscriptionTerm" minOccurs="0"/>
 *         &lt;element name="itemType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}overrideShipping" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}grade" minOccurs="0"/>
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
    "materialKey",
    "quantity",
    "lineCouponCode",
    "subscriptionTerm",
    "itemType",
    "overrideShipping",
    "grade"
})
@XmlRootElement(name = "sampleLineItem")
public class SampleLineItem {

    protected int lineNo;
    @XmlElement(required = true)
    protected MaterialKey materialKey;
    protected int quantity;
    protected String lineCouponCode;
    @XmlElement(namespace = "http://www.hmco.com/EAI/OTS/Material")
    protected SubscriptionTerm subscriptionTerm;
    protected String itemType;
    protected BigDecimal overrideShipping;
    protected String grade;

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
     * Gets the value of the materialKey property.
     * 
     * @return
     *     possible object is
     *     {@link MaterialKey }
     *     
     */
    public MaterialKey getMaterialKey() {
        return materialKey;
    }

    /**
     * Sets the value of the materialKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaterialKey }
     *     
     */
    public void setMaterialKey(MaterialKey value) {
        this.materialKey = value;
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
     * Gets the value of the lineCouponCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineCouponCode() {
        return lineCouponCode;
    }

    /**
     * Sets the value of the lineCouponCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineCouponCode(String value) {
        this.lineCouponCode = value;
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

    /**
     * Gets the value of the itemType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemType() {
        return itemType;
    }

    /**
     * Sets the value of the itemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemType(String value) {
        this.itemType = value;
    }

    /**
     * Gets the value of the overrideShipping property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOverrideShipping() {
        return overrideShipping;
    }

    /**
     * Sets the value of the overrideShipping property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOverrideShipping(BigDecimal value) {
        this.overrideShipping = value;
    }

    /**
     * Gets the value of the grade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrade() {
        return grade;
    }

    /**
     * Sets the value of the grade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrade(String value) {
        this.grade = value;
    }

}
