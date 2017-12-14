
package com.hmco.eai.ots.transaction;

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
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Transaction}productInfo"/>
 *         &lt;element name="lineitemStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Transaction}lineitemRejectionStatus" minOccurs="0"/>
 *         &lt;element name="isLineitemComplete" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="titleStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deliveryBlock" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="availableDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Transaction}salesRep" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Transaction}itemType"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Transaction}isKitComponent"/>
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
    "productInfo",
    "lineitemStatus",
    "lineitemRejectionStatus",
    "isLineitemComplete",
    "titleStatus",
    "deliveryBlock",
    "requestDate",
    "availableDate",
    "salesRep",
    "itemType",
    "isKitComponent"
})
@XmlRootElement(name = "transactionLineItem")
public class TransactionLineItem {

    @XmlElement(required = true)
    protected ProductInfo productInfo;
    @XmlElement(required = true)
    protected String lineitemStatus;
    protected String lineitemRejectionStatus;
    protected boolean isLineitemComplete;
    @XmlElement(required = true)
    protected String titleStatus;
    protected String deliveryBlock;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar requestDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar availableDate;
    protected List<SalesRep> salesRep;
    @XmlElement(required = true)
    protected String itemType;
    protected boolean isKitComponent;

    /**
     * Gets the value of the productInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProductInfo }
     *     
     */
    public ProductInfo getProductInfo() {
        return productInfo;
    }

    /**
     * Sets the value of the productInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductInfo }
     *     
     */
    public void setProductInfo(ProductInfo value) {
        this.productInfo = value;
    }

    /**
     * Gets the value of the lineitemStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineitemStatus() {
        return lineitemStatus;
    }

    /**
     * Sets the value of the lineitemStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineitemStatus(String value) {
        this.lineitemStatus = value;
    }

    /**
     * Gets the value of the lineitemRejectionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineitemRejectionStatus() {
        return lineitemRejectionStatus;
    }

    /**
     * Sets the value of the lineitemRejectionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineitemRejectionStatus(String value) {
        this.lineitemRejectionStatus = value;
    }

    /**
     * Gets the value of the isLineitemComplete property.
     * 
     */
    public boolean isIsLineitemComplete() {
        return isLineitemComplete;
    }

    /**
     * Sets the value of the isLineitemComplete property.
     * 
     */
    public void setIsLineitemComplete(boolean value) {
        this.isLineitemComplete = value;
    }

    /**
     * Gets the value of the titleStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleStatus() {
        return titleStatus;
    }

    /**
     * Sets the value of the titleStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleStatus(String value) {
        this.titleStatus = value;
    }

    /**
     * Gets the value of the deliveryBlock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryBlock() {
        return deliveryBlock;
    }

    /**
     * Sets the value of the deliveryBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryBlock(String value) {
        this.deliveryBlock = value;
    }

    /**
     * Gets the value of the requestDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestDate() {
        return requestDate;
    }

    /**
     * Sets the value of the requestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestDate(XMLGregorianCalendar value) {
        this.requestDate = value;
    }

    /**
     * Gets the value of the availableDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAvailableDate() {
        return availableDate;
    }

    /**
     * Sets the value of the availableDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAvailableDate(XMLGregorianCalendar value) {
        this.availableDate = value;
    }

    /**
     * Gets the value of the salesRep property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesRep property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesRep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesRep }
     * 
     * 
     */
    public List<SalesRep> getSalesRep() {
        if (salesRep == null) {
            salesRep = new ArrayList<SalesRep>();
        }
        return this.salesRep;
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
     * Gets the value of the isKitComponent property.
     * 
     */
    public boolean isIsKitComponent() {
        return isKitComponent;
    }

    /**
     * Sets the value of the isKitComponent property.
     * 
     */
    public void setIsKitComponent(boolean value) {
        this.isKitComponent = value;
    }

}
