
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sforce.soap.enterprise.QueryResult;


/**
 * <p>Java class for ities_msg__Message__c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ities_msg__Message__c">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="Attachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ConnectionReceived" type="{urn:sobject.enterprise.soap.sforce.com}PartnerNetworkConnection" minOccurs="0"/>
 *         &lt;element name="ConnectionReceivedId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ConnectionSent" type="{urn:sobject.enterprise.soap.sforce.com}PartnerNetworkConnection" minOccurs="0"/>
 *         &lt;element name="ConnectionSentId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FeedSubscriptionsForEntity" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="NotesAndAttachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Owner" type="{urn:sobject.enterprise.soap.sforce.com}Name" minOccurs="0"/>
 *         &lt;element name="OwnerId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ProcessInstances" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ProcessSteps" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ities_msg__Active__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ities_msg__Always_Visible__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ities_msg__Contents__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ities_msg__Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ities_msg__Expiration_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ities_msg__Opted_Out10__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ities_msg__Opted_Out2__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ities_msg__Opted_Out3__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ities_msg__Opted_Out4__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ities_msg__Opted_Out5__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ities_msg__Opted_Out6__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ities_msg__Opted_Out7__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ities_msg__Opted_Out8__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ities_msg__Opted_Out9__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ities_msg__Opted_Out__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ities_msg__Visibility__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ities_msg__Message__c", propOrder = {
    "attachments",
    "connectionReceived",
    "connectionReceivedId",
    "connectionSent",
    "connectionSentId",
    "createdBy",
    "createdById",
    "createdDate",
    "feedSubscriptionsForEntity",
    "isDeleted",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "name",
    "notes",
    "notesAndAttachments",
    "owner",
    "ownerId",
    "processInstances",
    "processSteps",
    "systemModstamp",
    "itiesMsgActiveC",
    "itiesMsgAlwaysVisibleC",
    "itiesMsgContentsC",
    "itiesMsgDateC",
    "itiesMsgExpirationDateC",
    "itiesMsgOptedOut10C",
    "itiesMsgOptedOut2C",
    "itiesMsgOptedOut3C",
    "itiesMsgOptedOut4C",
    "itiesMsgOptedOut5C",
    "itiesMsgOptedOut6C",
    "itiesMsgOptedOut7C",
    "itiesMsgOptedOut8C",
    "itiesMsgOptedOut9C",
    "itiesMsgOptedOutC",
    "itiesMsgVisibilityC"
})
public class Ities_Msg__Message__CType
    extends SObjectType
{

    @XmlElement(name = "Attachments", nillable = true)
    protected QueryResult attachments;
    @XmlElement(name = "ConnectionReceived", nillable = true)
    protected PartnerNetworkConnectionType connectionReceived;
    @XmlElement(name = "ConnectionReceivedId", nillable = true)
    protected String connectionReceivedId;
    @XmlElement(name = "ConnectionSent", nillable = true)
    protected PartnerNetworkConnectionType connectionSent;
    @XmlElement(name = "ConnectionSentId", nillable = true)
    protected String connectionSentId;
    @XmlElement(name = "CreatedBy", nillable = true)
    protected UserType createdBy;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "FeedSubscriptionsForEntity", nillable = true)
    protected QueryResult feedSubscriptionsForEntity;
    @XmlElement(name = "IsDeleted", nillable = true)
    protected Boolean isDeleted;
    @XmlElement(name = "LastModifiedBy", nillable = true)
    protected UserType lastModifiedBy;
    @XmlElement(name = "LastModifiedById", nillable = true)
    protected String lastModifiedById;
    @XmlElement(name = "LastModifiedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "Notes", nillable = true)
    protected QueryResult notes;
    @XmlElement(name = "NotesAndAttachments", nillable = true)
    protected QueryResult notesAndAttachments;
    @XmlElement(name = "Owner", nillable = true)
    protected NameType owner;
    @XmlElement(name = "OwnerId", nillable = true)
    protected String ownerId;
    @XmlElement(name = "ProcessInstances", nillable = true)
    protected QueryResult processInstances;
    @XmlElement(name = "ProcessSteps", nillable = true)
    protected QueryResult processSteps;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "ities_msg__Active__c", nillable = true)
    protected Boolean itiesMsgActiveC;
    @XmlElement(name = "ities_msg__Always_Visible__c", nillable = true)
    protected Boolean itiesMsgAlwaysVisibleC;
    @XmlElement(name = "ities_msg__Contents__c", nillable = true)
    protected String itiesMsgContentsC;
    @XmlElement(name = "ities_msg__Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar itiesMsgDateC;
    @XmlElement(name = "ities_msg__Expiration_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar itiesMsgExpirationDateC;
    @XmlElement(name = "ities_msg__Opted_Out10__c", nillable = true)
    protected String itiesMsgOptedOut10C;
    @XmlElement(name = "ities_msg__Opted_Out2__c", nillable = true)
    protected String itiesMsgOptedOut2C;
    @XmlElement(name = "ities_msg__Opted_Out3__c", nillable = true)
    protected String itiesMsgOptedOut3C;
    @XmlElement(name = "ities_msg__Opted_Out4__c", nillable = true)
    protected String itiesMsgOptedOut4C;
    @XmlElement(name = "ities_msg__Opted_Out5__c", nillable = true)
    protected String itiesMsgOptedOut5C;
    @XmlElement(name = "ities_msg__Opted_Out6__c", nillable = true)
    protected String itiesMsgOptedOut6C;
    @XmlElement(name = "ities_msg__Opted_Out7__c", nillable = true)
    protected String itiesMsgOptedOut7C;
    @XmlElement(name = "ities_msg__Opted_Out8__c", nillable = true)
    protected String itiesMsgOptedOut8C;
    @XmlElement(name = "ities_msg__Opted_Out9__c", nillable = true)
    protected String itiesMsgOptedOut9C;
    @XmlElement(name = "ities_msg__Opted_Out__c", nillable = true)
    protected String itiesMsgOptedOutC;
    @XmlElement(name = "ities_msg__Visibility__c", nillable = true)
    protected String itiesMsgVisibilityC;

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setAttachments(QueryResult value) {
        this.attachments = value;
    }

    /**
     * Gets the value of the connectionReceived property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerNetworkConnectionType }
     *     
     */
    public PartnerNetworkConnectionType getConnectionReceived() {
        return connectionReceived;
    }

    /**
     * Sets the value of the connectionReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerNetworkConnectionType }
     *     
     */
    public void setConnectionReceived(PartnerNetworkConnectionType value) {
        this.connectionReceived = value;
    }

    /**
     * Gets the value of the connectionReceivedId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionReceivedId() {
        return connectionReceivedId;
    }

    /**
     * Sets the value of the connectionReceivedId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionReceivedId(String value) {
        this.connectionReceivedId = value;
    }

    /**
     * Gets the value of the connectionSent property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerNetworkConnectionType }
     *     
     */
    public PartnerNetworkConnectionType getConnectionSent() {
        return connectionSent;
    }

    /**
     * Sets the value of the connectionSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerNetworkConnectionType }
     *     
     */
    public void setConnectionSent(PartnerNetworkConnectionType value) {
        this.connectionSent = value;
    }

    /**
     * Gets the value of the connectionSentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionSentId() {
        return connectionSentId;
    }

    /**
     * Sets the value of the connectionSentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionSentId(String value) {
        this.connectionSentId = value;
    }

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
     * Gets the value of the feedSubscriptionsForEntity property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }

    /**
     * Sets the value of the feedSubscriptionsForEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setFeedSubscriptionsForEntity(QueryResult value) {
        this.feedSubscriptionsForEntity = value;
    }

    /**
     * Gets the value of the isDeleted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeleted() {
        return isDeleted;
    }

    /**
     * Sets the value of the isDeleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeleted(Boolean value) {
        this.isDeleted = value;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setNotes(QueryResult value) {
        this.notes = value;
    }

    /**
     * Gets the value of the notesAndAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }

    /**
     * Sets the value of the notesAndAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setNotesAndAttachments(QueryResult value) {
        this.notesAndAttachments = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setOwner(NameType value) {
        this.owner = value;
    }

    /**
     * Gets the value of the ownerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * Sets the value of the ownerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerId(String value) {
        this.ownerId = value;
    }

    /**
     * Gets the value of the processInstances property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getProcessInstances() {
        return processInstances;
    }

    /**
     * Sets the value of the processInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setProcessInstances(QueryResult value) {
        this.processInstances = value;
    }

    /**
     * Gets the value of the processSteps property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getProcessSteps() {
        return processSteps;
    }

    /**
     * Sets the value of the processSteps property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setProcessSteps(QueryResult value) {
        this.processSteps = value;
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

    /**
     * Gets the value of the ities_Msg__Active__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIties_Msg__Active__C() {
        return itiesMsgActiveC;
    }

    /**
     * Sets the value of the ities_Msg__Active__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIties_Msg__Active__C(Boolean value) {
        this.itiesMsgActiveC = value;
    }

    /**
     * Gets the value of the ities_Msg__Always_Visible__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIties_Msg__Always_Visible__C() {
        return itiesMsgAlwaysVisibleC;
    }

    /**
     * Sets the value of the ities_Msg__Always_Visible__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIties_Msg__Always_Visible__C(Boolean value) {
        this.itiesMsgAlwaysVisibleC = value;
    }

    /**
     * Gets the value of the ities_Msg__Contents__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIties_Msg__Contents__C() {
        return itiesMsgContentsC;
    }

    /**
     * Sets the value of the ities_Msg__Contents__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIties_Msg__Contents__C(String value) {
        this.itiesMsgContentsC = value;
    }

    /**
     * Gets the value of the ities_Msg__Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIties_Msg__Date__C() {
        return itiesMsgDateC;
    }

    /**
     * Sets the value of the ities_Msg__Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIties_Msg__Date__C(XMLGregorianCalendar value) {
        this.itiesMsgDateC = value;
    }

    /**
     * Gets the value of the ities_Msg__Expiration_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIties_Msg__Expiration_Date__C() {
        return itiesMsgExpirationDateC;
    }

    /**
     * Sets the value of the ities_Msg__Expiration_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIties_Msg__Expiration_Date__C(XMLGregorianCalendar value) {
        this.itiesMsgExpirationDateC = value;
    }

    /**
     * Gets the value of the ities_Msg__Opted_Out10__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIties_Msg__Opted_Out10__C() {
        return itiesMsgOptedOut10C;
    }

    /**
     * Sets the value of the ities_Msg__Opted_Out10__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIties_Msg__Opted_Out10__C(String value) {
        this.itiesMsgOptedOut10C = value;
    }

    /**
     * Gets the value of the ities_Msg__Opted_Out2__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIties_Msg__Opted_Out2__C() {
        return itiesMsgOptedOut2C;
    }

    /**
     * Sets the value of the ities_Msg__Opted_Out2__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIties_Msg__Opted_Out2__C(String value) {
        this.itiesMsgOptedOut2C = value;
    }

    /**
     * Gets the value of the ities_Msg__Opted_Out3__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIties_Msg__Opted_Out3__C() {
        return itiesMsgOptedOut3C;
    }

    /**
     * Sets the value of the ities_Msg__Opted_Out3__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIties_Msg__Opted_Out3__C(String value) {
        this.itiesMsgOptedOut3C = value;
    }

    /**
     * Gets the value of the ities_Msg__Opted_Out4__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIties_Msg__Opted_Out4__C() {
        return itiesMsgOptedOut4C;
    }

    /**
     * Sets the value of the ities_Msg__Opted_Out4__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIties_Msg__Opted_Out4__C(String value) {
        this.itiesMsgOptedOut4C = value;
    }

    /**
     * Gets the value of the ities_Msg__Opted_Out5__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIties_Msg__Opted_Out5__C() {
        return itiesMsgOptedOut5C;
    }

    /**
     * Sets the value of the ities_Msg__Opted_Out5__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIties_Msg__Opted_Out5__C(String value) {
        this.itiesMsgOptedOut5C = value;
    }

    /**
     * Gets the value of the ities_Msg__Opted_Out6__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIties_Msg__Opted_Out6__C() {
        return itiesMsgOptedOut6C;
    }

    /**
     * Sets the value of the ities_Msg__Opted_Out6__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIties_Msg__Opted_Out6__C(String value) {
        this.itiesMsgOptedOut6C = value;
    }

    /**
     * Gets the value of the ities_Msg__Opted_Out7__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIties_Msg__Opted_Out7__C() {
        return itiesMsgOptedOut7C;
    }

    /**
     * Sets the value of the ities_Msg__Opted_Out7__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIties_Msg__Opted_Out7__C(String value) {
        this.itiesMsgOptedOut7C = value;
    }

    /**
     * Gets the value of the ities_Msg__Opted_Out8__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIties_Msg__Opted_Out8__C() {
        return itiesMsgOptedOut8C;
    }

    /**
     * Sets the value of the ities_Msg__Opted_Out8__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIties_Msg__Opted_Out8__C(String value) {
        this.itiesMsgOptedOut8C = value;
    }

    /**
     * Gets the value of the ities_Msg__Opted_Out9__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIties_Msg__Opted_Out9__C() {
        return itiesMsgOptedOut9C;
    }

    /**
     * Sets the value of the ities_Msg__Opted_Out9__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIties_Msg__Opted_Out9__C(String value) {
        this.itiesMsgOptedOut9C = value;
    }

    /**
     * Gets the value of the ities_Msg__Opted_Out__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIties_Msg__Opted_Out__C() {
        return itiesMsgOptedOutC;
    }

    /**
     * Sets the value of the ities_Msg__Opted_Out__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIties_Msg__Opted_Out__C(String value) {
        this.itiesMsgOptedOutC = value;
    }

    /**
     * Gets the value of the ities_Msg__Visibility__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIties_Msg__Visibility__C() {
        return itiesMsgVisibilityC;
    }

    /**
     * Sets the value of the ities_Msg__Visibility__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIties_Msg__Visibility__C(String value) {
        this.itiesMsgVisibilityC = value;
    }

}
