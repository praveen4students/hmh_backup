
package com.hmco.eai.ots.packinglist;

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
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/PackingList}Plant"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/PackingList}Delivery_Number"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/PackingList}HMH_From_E-mail"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/PackingList}Customer_Recipient_E-mail"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/PackingList}Customer_CC_E-mail" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/PackingList}Subject_Line"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/PackingList}Notes" minOccurs="0"/>
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
    "plant",
    "deliveryNumber",
    "hmhFromEMail",
    "customerRecipientEMail",
    "customerCCEMail",
    "subjectLine",
    "notes"
})
@XmlRootElement(name = "packingListRequest")
public class PackingListRequest {

    @XmlElement(name = "Plant", required = true)
    protected String plant;
    @XmlElement(name = "Delivery_Number", required = true)
    protected String deliveryNumber;
    @XmlElement(name = "HMH_From_E-mail", required = true)
    protected String hmhFromEMail;
    @XmlElement(name = "Customer_Recipient_E-mail", required = true)
    protected String customerRecipientEMail;
    @XmlElement(name = "Customer_CC_E-mail")
    protected String customerCCEMail;
    @XmlElement(name = "Subject_Line", required = true)
    protected String subjectLine;
    @XmlElement(name = "Notes")
    protected String notes;

    /**
     * Gets the value of the plant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlant() {
        return plant;
    }

    /**
     * Sets the value of the plant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlant(String value) {
        this.plant = value;
    }

    /**
     * Gets the value of the deliveryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryNumber() {
        return deliveryNumber;
    }

    /**
     * Sets the value of the deliveryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryNumber(String value) {
        this.deliveryNumber = value;
    }

    /**
     * Gets the value of the hmhFromEMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHMHFromEMail() {
        return hmhFromEMail;
    }

    /**
     * Sets the value of the hmhFromEMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHMHFromEMail(String value) {
        this.hmhFromEMail = value;
    }

    /**
     * Gets the value of the customerRecipientEMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerRecipientEMail() {
        return customerRecipientEMail;
    }

    /**
     * Sets the value of the customerRecipientEMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerRecipientEMail(String value) {
        this.customerRecipientEMail = value;
    }

    /**
     * Gets the value of the customerCCEMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCCEMail() {
        return customerCCEMail;
    }

    /**
     * Sets the value of the customerCCEMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCCEMail(String value) {
        this.customerCCEMail = value;
    }

    /**
     * Gets the value of the subjectLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectLine() {
        return subjectLine;
    }

    /**
     * Sets the value of the subjectLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectLine(String value) {
        this.subjectLine = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

}
