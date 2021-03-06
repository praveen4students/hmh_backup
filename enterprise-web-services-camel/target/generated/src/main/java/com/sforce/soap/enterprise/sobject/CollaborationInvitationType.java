
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CollaborationInvitation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CollaborationInvitation">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="InvitedUserEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvitedUserEmailNormalized" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InviterId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="OptionalMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="SharedEntityId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollaborationInvitation", propOrder = {
    "createdBy",
    "createdById",
    "createdDate",
    "invitedUserEmail",
    "invitedUserEmailNormalized",
    "inviterId",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "optionalMessage",
    "parentId",
    "sharedEntityId",
    "status",
    "systemModstamp"
})
public class CollaborationInvitationType
    extends SObjectType
{

    @XmlElement(name = "CreatedBy", nillable = true)
    protected UserType createdBy;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "InvitedUserEmail", nillable = true)
    protected String invitedUserEmail;
    @XmlElement(name = "InvitedUserEmailNormalized", nillable = true)
    protected String invitedUserEmailNormalized;
    @XmlElement(name = "InviterId", nillable = true)
    protected String inviterId;
    @XmlElement(name = "LastModifiedBy", nillable = true)
    protected UserType lastModifiedBy;
    @XmlElement(name = "LastModifiedById", nillable = true)
    protected String lastModifiedById;
    @XmlElement(name = "LastModifiedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlElement(name = "OptionalMessage", nillable = true)
    protected String optionalMessage;
    @XmlElement(name = "ParentId", nillable = true)
    protected String parentId;
    @XmlElement(name = "SharedEntityId", nillable = true)
    protected String sharedEntityId;
    @XmlElement(name = "Status", nillable = true)
    protected String status;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setCreatedBy(UserType value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the createdById property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedById() {
        return createdById;
    }

    /**
     * Sets the value of the createdById property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedById(String value) {
        this.createdById = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the invitedUserEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvitedUserEmail() {
        return invitedUserEmail;
    }

    /**
     * Sets the value of the invitedUserEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvitedUserEmail(String value) {
        this.invitedUserEmail = value;
    }

    /**
     * Gets the value of the invitedUserEmailNormalized property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvitedUserEmailNormalized() {
        return invitedUserEmailNormalized;
    }

    /**
     * Sets the value of the invitedUserEmailNormalized property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvitedUserEmailNormalized(String value) {
        this.invitedUserEmailNormalized = value;
    }

    /**
     * Gets the value of the inviterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInviterId() {
        return inviterId;
    }

    /**
     * Sets the value of the inviterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInviterId(String value) {
        this.inviterId = value;
    }

    /**
     * Gets the value of the lastModifiedBy property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getLastModifiedBy() {
        return lastModifiedBy;
    }

    /**
     * Sets the value of the lastModifiedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setLastModifiedBy(UserType value) {
        this.lastModifiedBy = value;
    }

    /**
     * Gets the value of the lastModifiedById property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModifiedById() {
        return lastModifiedById;
    }

    /**
     * Sets the value of the lastModifiedById property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModifiedById(String value) {
        this.lastModifiedById = value;
    }

    /**
     * Gets the value of the lastModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets the value of the lastModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedDate(XMLGregorianCalendar value) {
        this.lastModifiedDate = value;
    }

    /**
     * Gets the value of the optionalMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionalMessage() {
        return optionalMessage;
    }

    /**
     * Sets the value of the optionalMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionalMessage(String value) {
        this.optionalMessage = value;
    }

    /**
     * Gets the value of the parentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * Sets the value of the parentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentId(String value) {
        this.parentId = value;
    }

    /**
     * Gets the value of the sharedEntityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharedEntityId() {
        return sharedEntityId;
    }

    /**
     * Sets the value of the sharedEntityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharedEntityId(String value) {
        this.sharedEntityId = value;
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

    /**
     * Gets the value of the systemModstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSystemModstamp() {
        return systemModstamp;
    }

    /**
     * Sets the value of the systemModstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSystemModstamp(XMLGregorianCalendar value) {
        this.systemModstamp = value;
    }

}
