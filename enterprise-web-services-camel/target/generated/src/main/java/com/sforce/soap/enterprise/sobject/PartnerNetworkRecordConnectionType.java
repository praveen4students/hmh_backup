
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PartnerNetworkRecordConnection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartnerNetworkRecordConnection">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="ConnectionId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LocalRecordId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ParentRecordId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="PartnerRecordId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="RelatedRecords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SendClosedTasks" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SendEmails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SendOpenTasks" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartnerNetworkRecordConnection", propOrder = {
    "connectionId",
    "endDate",
    "localRecordId",
    "parentRecordId",
    "partnerRecordId",
    "relatedRecords",
    "sendClosedTasks",
    "sendEmails",
    "sendOpenTasks",
    "startDate",
    "status"
})
public class PartnerNetworkRecordConnectionType
    extends SObjectType
{

    @XmlElement(name = "ConnectionId", nillable = true)
    protected String connectionId;
    @XmlElement(name = "EndDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "LocalRecordId", nillable = true)
    protected String localRecordId;
    @XmlElement(name = "ParentRecordId", nillable = true)
    protected String parentRecordId;
    @XmlElement(name = "PartnerRecordId", nillable = true)
    protected String partnerRecordId;
    @XmlElement(name = "RelatedRecords", nillable = true)
    protected String relatedRecords;
    @XmlElement(name = "SendClosedTasks", nillable = true)
    protected Boolean sendClosedTasks;
    @XmlElement(name = "SendEmails", nillable = true)
    protected Boolean sendEmails;
    @XmlElement(name = "SendOpenTasks", nillable = true)
    protected Boolean sendOpenTasks;
    @XmlElement(name = "StartDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "Status", nillable = true)
    protected String status;

    /**
     * Gets the value of the connectionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionId() {
        return connectionId;
    }

    /**
     * Sets the value of the connectionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionId(String value) {
        this.connectionId = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the localRecordId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalRecordId() {
        return localRecordId;
    }

    /**
     * Sets the value of the localRecordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalRecordId(String value) {
        this.localRecordId = value;
    }

    /**
     * Gets the value of the parentRecordId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentRecordId() {
        return parentRecordId;
    }

    /**
     * Sets the value of the parentRecordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentRecordId(String value) {
        this.parentRecordId = value;
    }

    /**
     * Gets the value of the partnerRecordId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerRecordId() {
        return partnerRecordId;
    }

    /**
     * Sets the value of the partnerRecordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerRecordId(String value) {
        this.partnerRecordId = value;
    }

    /**
     * Gets the value of the relatedRecords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedRecords() {
        return relatedRecords;
    }

    /**
     * Sets the value of the relatedRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedRecords(String value) {
        this.relatedRecords = value;
    }

    /**
     * Gets the value of the sendClosedTasks property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendClosedTasks() {
        return sendClosedTasks;
    }

    /**
     * Sets the value of the sendClosedTasks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendClosedTasks(Boolean value) {
        this.sendClosedTasks = value;
    }

    /**
     * Gets the value of the sendEmails property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendEmails() {
        return sendEmails;
    }

    /**
     * Sets the value of the sendEmails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendEmails(Boolean value) {
        this.sendEmails = value;
    }

    /**
     * Gets the value of the sendOpenTasks property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendOpenTasks() {
        return sendOpenTasks;
    }

    /**
     * Sets the value of the sendOpenTasks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendOpenTasks(Boolean value) {
        this.sendOpenTasks = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
