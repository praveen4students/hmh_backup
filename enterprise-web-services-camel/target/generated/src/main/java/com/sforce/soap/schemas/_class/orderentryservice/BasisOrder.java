
package com.sforce.soap.schemas._class.orderentryservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BasisOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasisOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="basisOrderUsed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="entryDivision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entryYear" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="hasEGood" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="lineList" type="{http://soap.sforce.com/schemas/class/OrderEntryService}BasisOrderLine" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sfdcAccountId" type="{http://soap.sforce.com/schemas/class/OrderEntryService}ID" minOccurs="0"/>
 *         &lt;element name="sfdcInternalOrderId" type="{http://soap.sforce.com/schemas/class/OrderEntryService}ID" minOccurs="0"/>
 *         &lt;element name="sfdcOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasisOrder", propOrder = {
    "basisOrderUsed",
    "entryDivision",
    "entryYear",
    "hasEGood",
    "lineList",
    "sfdcAccountId",
    "sfdcInternalOrderId",
    "sfdcOrderNumber",
    "state",
    "transactionType"
})
public class BasisOrder {

    @XmlElement(nillable = true)
    protected Boolean basisOrderUsed;
    @XmlElement(nillable = true)
    protected String entryDivision;
    @XmlElement(nillable = true)
    protected Integer entryYear;
    @XmlElement(nillable = true)
    protected Boolean hasEGood;
    @XmlElement(nillable = true)
    protected List<BasisOrderLine> lineList;
    @XmlElement(nillable = true)
    protected String sfdcAccountId;
    @XmlElement(nillable = true)
    protected String sfdcInternalOrderId;
    @XmlElement(nillable = true)
    protected String sfdcOrderNumber;
    @XmlElement(nillable = true)
    protected String state;
    @XmlElement(nillable = true)
    protected String transactionType;

    /**
     * Gets the value of the basisOrderUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBasisOrderUsed() {
        return basisOrderUsed;
    }

    /**
     * Sets the value of the basisOrderUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBasisOrderUsed(Boolean value) {
        this.basisOrderUsed = value;
    }

    /**
     * Gets the value of the entryDivision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryDivision() {
        return entryDivision;
    }

    /**
     * Sets the value of the entryDivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryDivision(String value) {
        this.entryDivision = value;
    }

    /**
     * Gets the value of the entryYear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEntryYear() {
        return entryYear;
    }

    /**
     * Sets the value of the entryYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEntryYear(Integer value) {
        this.entryYear = value;
    }

    /**
     * Gets the value of the hasEGood property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasEGood() {
        return hasEGood;
    }

    /**
     * Sets the value of the hasEGood property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasEGood(Boolean value) {
        this.hasEGood = value;
    }

    /**
     * Gets the value of the lineList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasisOrderLine }
     * 
     * 
     */
    public List<BasisOrderLine> getLineList() {
        if (lineList == null) {
            lineList = new ArrayList<BasisOrderLine>();
        }
        return this.lineList;
    }

    /**
     * Gets the value of the sfdcAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfdcAccountId() {
        return sfdcAccountId;
    }

    /**
     * Sets the value of the sfdcAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfdcAccountId(String value) {
        this.sfdcAccountId = value;
    }

    /**
     * Gets the value of the sfdcInternalOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfdcInternalOrderId() {
        return sfdcInternalOrderId;
    }

    /**
     * Sets the value of the sfdcInternalOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfdcInternalOrderId(String value) {
        this.sfdcInternalOrderId = value;
    }

    /**
     * Gets the value of the sfdcOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfdcOrderNumber() {
        return sfdcOrderNumber;
    }

    /**
     * Sets the value of the sfdcOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfdcOrderNumber(String value) {
        this.sfdcOrderNumber = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

}
