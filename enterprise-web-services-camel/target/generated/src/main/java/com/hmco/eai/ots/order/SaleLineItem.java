
package com.hmco.eai.ots.order;

import java.math.BigDecimal;
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
 *         &lt;element name="lineNo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="materialID">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="18"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lineCouponCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Material}subscriptionTerm" minOccurs="0"/>
 *         &lt;element name="itemType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="overrideShipping" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}grade" minOccurs="0"/>
 *         &lt;element name="contractStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="contractEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
    "lineCouponCode",
    "subscriptionTerm",
    "itemType",
    "overrideShipping",
    "grade",
    "contractStartDate",
    "contractEndDate"
})
@XmlRootElement(name = "saleLineItem")
public class SaleLineItem {

    protected double lineNo;
    @XmlElement(required = true)
    protected String materialID;
    protected int quantity;
    @XmlElement(nillable = true)
    protected String lineCouponCode;
    @XmlElement(namespace = "http://www.hmco.com/EAI/OTS/Material")
    protected SubscriptionTerm subscriptionTerm;
    protected String itemType;
    protected BigDecimal overrideShipping;
    protected String grade;
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar contractStartDate;
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar contractEndDate;

    /**
     * Gets the value of the lineNo property.
     * 
     */
    public double getLineNo() {
        return lineNo;
    }

    /**
     * Sets the value of the lineNo property.
     * 
     */
    public void setLineNo(double value) {
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

    /**
     * Gets the value of the contractStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractStartDate() {
        return contractStartDate;
    }

    /**
     * Sets the value of the contractStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractStartDate(XMLGregorianCalendar value) {
        this.contractStartDate = value;
    }

    /**
     * Gets the value of the contractEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractEndDate() {
        return contractEndDate;
    }

    /**
     * Sets the value of the contractEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractEndDate(XMLGregorianCalendar value) {
        this.contractEndDate = value;
    }

}
