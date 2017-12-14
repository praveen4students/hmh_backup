
package com.hmco.eai.ots.order;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}basisOrderUsed" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}entryDivision" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}entryYear" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}hasEGood" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}lineList" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}sfdcAccountId" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}sfdcInternalOrderId" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}sfdcOrderNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}state" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}transactionType" minOccurs="0"/>
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
@XmlRootElement(name = "basisOrderList")
public class BasisOrderList {

    protected Boolean basisOrderUsed;
    protected String entryDivision;
    protected Integer entryYear;
    protected Boolean hasEGood;
    protected List<LineList> lineList;
    protected String sfdcAccountId;
    protected String sfdcInternalOrderId;
    protected String sfdcOrderNumber;
    protected String state;
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
     * {@link LineList }
     * 
     * 
     */
    public List<LineList> getLineList() {
        if (lineList == null) {
            lineList = new ArrayList<LineList>();
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
