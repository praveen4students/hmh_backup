
package com.sforce.soap.schemas._class.orderentryservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubmitOrderLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubmitOrderLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chargeStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="grade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isbn13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lineCCRatioIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lineItemNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "SubmitOrderLine", propOrder = {
    "chargeStatus",
    "grade",
    "isbn13",
    "lineCCRatioIndicator",
    "lineItemNote",
    "quantity",
    "sfdcInternalOrderLineId",
    "shortProductCode"
})
public class SubmitOrderLine {

    @XmlElement(nillable = true)
    protected String chargeStatus;
    @XmlElement(nillable = true)
    protected String grade;
    @XmlElement(nillable = true)
    protected String isbn13;
    @XmlElement(nillable = true)
    protected String lineCCRatioIndicator;
    @XmlElement(nillable = true)
    protected String lineItemNote;
    @XmlElement(nillable = true)
    protected Double quantity;
    @XmlElement(nillable = true)
    protected String sfdcInternalOrderLineId;
    @XmlElement(nillable = true)
    protected String shortProductCode;

    /**
     * Gets the value of the chargeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeStatus() {
        return chargeStatus;
    }

    /**
     * Sets the value of the chargeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeStatus(String value) {
        this.chargeStatus = value;
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
     * Gets the value of the lineCCRatioIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineCCRatioIndicator() {
        return lineCCRatioIndicator;
    }

    /**
     * Sets the value of the lineCCRatioIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineCCRatioIndicator(String value) {
        this.lineCCRatioIndicator = value;
    }

    /**
     * Gets the value of the lineItemNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineItemNote() {
        return lineItemNote;
    }

    /**
     * Sets the value of the lineItemNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineItemNote(String value) {
        this.lineItemNote = value;
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
