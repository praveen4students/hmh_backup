
package com.hmco.eai.ots.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}beginningGradeLevel" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}cpsiaReqCertificate" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}cpsiaReqLabel" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}customerTitle" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}eGoodIndicator" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}endingGradeLevel" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}isbn13" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}productHierarchyLevelDesc1" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}productHierarchyLevelDesc2" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}productHierarchyLevelDesc3" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}productHierarchyLevelDesc4" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}productHierarchyLevelDesc5" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}quantity" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}sfdcInternalOrderLineId" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}shortProductCode" minOccurs="0"/>
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
    "beginningGradeLevel",
    "cpsiaReqCertificate",
    "cpsiaReqLabel",
    "customerTitle",
    "eGoodIndicator",
    "endingGradeLevel",
    "isbn13",
    "productHierarchyLevelDesc1",
    "productHierarchyLevelDesc2",
    "productHierarchyLevelDesc3",
    "productHierarchyLevelDesc4",
    "productHierarchyLevelDesc5",
    "quantity",
    "sfdcInternalOrderLineId",
    "shortProductCode"
})
@XmlRootElement(name = "lineList")
public class LineList {

    protected String beginningGradeLevel;
    protected Boolean cpsiaReqCertificate;
    protected Boolean cpsiaReqLabel;
    protected String customerTitle;
    protected String eGoodIndicator;
    protected String endingGradeLevel;
    protected String isbn13;
    protected String productHierarchyLevelDesc1;
    protected String productHierarchyLevelDesc2;
    protected String productHierarchyLevelDesc3;
    protected String productHierarchyLevelDesc4;
    protected String productHierarchyLevelDesc5;
    protected Double quantity;
    protected String sfdcInternalOrderLineId;
    protected String shortProductCode;

    /**
     * Gets the value of the beginningGradeLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeginningGradeLevel() {
        return beginningGradeLevel;
    }

    /**
     * Sets the value of the beginningGradeLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginningGradeLevel(String value) {
        this.beginningGradeLevel = value;
    }

    /**
     * Gets the value of the cpsiaReqCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCpsiaReqCertificate() {
        return cpsiaReqCertificate;
    }

    /**
     * Sets the value of the cpsiaReqCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCpsiaReqCertificate(Boolean value) {
        this.cpsiaReqCertificate = value;
    }

    /**
     * Gets the value of the cpsiaReqLabel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCpsiaReqLabel() {
        return cpsiaReqLabel;
    }

    /**
     * Sets the value of the cpsiaReqLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCpsiaReqLabel(Boolean value) {
        this.cpsiaReqLabel = value;
    }

    /**
     * Gets the value of the customerTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerTitle() {
        return customerTitle;
    }

    /**
     * Sets the value of the customerTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerTitle(String value) {
        this.customerTitle = value;
    }

    /**
     * Gets the value of the eGoodIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEGoodIndicator() {
        return eGoodIndicator;
    }

    /**
     * Sets the value of the eGoodIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEGoodIndicator(String value) {
        this.eGoodIndicator = value;
    }

    /**
     * Gets the value of the endingGradeLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndingGradeLevel() {
        return endingGradeLevel;
    }

    /**
     * Sets the value of the endingGradeLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndingGradeLevel(String value) {
        this.endingGradeLevel = value;
    }

    /**
     * Gets the value of the isbn13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsbn13() {
        return isbn13;
    }

    /**
     * Sets the value of the isbn13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsbn13(String value) {
        this.isbn13 = value;
    }

    /**
     * Gets the value of the productHierarchyLevelDesc1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductHierarchyLevelDesc1() {
        return productHierarchyLevelDesc1;
    }

    /**
     * Sets the value of the productHierarchyLevelDesc1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductHierarchyLevelDesc1(String value) {
        this.productHierarchyLevelDesc1 = value;
    }

    /**
     * Gets the value of the productHierarchyLevelDesc2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductHierarchyLevelDesc2() {
        return productHierarchyLevelDesc2;
    }

    /**
     * Sets the value of the productHierarchyLevelDesc2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductHierarchyLevelDesc2(String value) {
        this.productHierarchyLevelDesc2 = value;
    }

    /**
     * Gets the value of the productHierarchyLevelDesc3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductHierarchyLevelDesc3() {
        return productHierarchyLevelDesc3;
    }

    /**
     * Sets the value of the productHierarchyLevelDesc3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductHierarchyLevelDesc3(String value) {
        this.productHierarchyLevelDesc3 = value;
    }

    /**
     * Gets the value of the productHierarchyLevelDesc4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductHierarchyLevelDesc4() {
        return productHierarchyLevelDesc4;
    }

    /**
     * Sets the value of the productHierarchyLevelDesc4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductHierarchyLevelDesc4(String value) {
        this.productHierarchyLevelDesc4 = value;
    }

    /**
     * Gets the value of the productHierarchyLevelDesc5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductHierarchyLevelDesc5() {
        return productHierarchyLevelDesc5;
    }

    /**
     * Sets the value of the productHierarchyLevelDesc5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductHierarchyLevelDesc5(String value) {
        this.productHierarchyLevelDesc5 = value;
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
     * Gets the value of the sfdcInternalOrderLineId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfdcInternalOrderLineId() {
        return sfdcInternalOrderLineId;
    }

    /**
     * Sets the value of the sfdcInternalOrderLineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfdcInternalOrderLineId(String value) {
        this.sfdcInternalOrderLineId = value;
    }

    /**
     * Gets the value of the shortProductCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortProductCode() {
        return shortProductCode;
    }

    /**
     * Sets the value of the shortProductCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortProductCode(String value) {
        this.shortProductCode = value;
    }

}
