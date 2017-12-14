
package com.sforce.soap.schemas._class.orderentryservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BasisOrderLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasisOrderLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="beginningGradeLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cpsiaReqCertificate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cpsiaReqLabel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="customerTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eGoodIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endingGradeLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isbn13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productHierarchyLevelDesc1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productHierarchyLevelDesc2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productHierarchyLevelDesc3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productHierarchyLevelDesc4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productHierarchyLevelDesc5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="sfdcInternalOrderLineId" type="{http://soap.sforce.com/schemas/class/OrderEntryService}ID" minOccurs="0"/>
 *         &lt;element name="shortProductCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasisOrderLine", propOrder = {
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
public class BasisOrderLine {

    @XmlElement(nillable = true)
    protected String beginningGradeLevel;
    @XmlElement(nillable = true)
    protected Boolean cpsiaReqCertificate;
    @XmlElement(nillable = true)
    protected Boolean cpsiaReqLabel;
    @XmlElement(nillable = true)
    protected String customerTitle;
    @XmlElement(nillable = true)
    protected String eGoodIndicator;
    @XmlElement(nillable = true)
    protected String endingGradeLevel;
    @XmlElement(nillable = true)
    protected String isbn13;
    @XmlElement(nillable = true)
    protected String productHierarchyLevelDesc1;
    @XmlElement(nillable = true)
    protected String productHierarchyLevelDesc2;
    @XmlElement(nillable = true)
    protected String productHierarchyLevelDesc3;
    @XmlElement(nillable = true)
    protected String productHierarchyLevelDesc4;
    @XmlElement(nillable = true)
    protected String productHierarchyLevelDesc5;
    @XmlElement(nillable = true)
    protected Double quantity;
    @XmlElement(nillable = true)
    protected String sfdcInternalOrderLineId;
    @XmlElement(nillable = true)
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
