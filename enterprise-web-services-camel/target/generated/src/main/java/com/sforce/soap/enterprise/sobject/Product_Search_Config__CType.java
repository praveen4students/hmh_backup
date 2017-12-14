
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sforce.soap.enterprise.QueryResult;


/**
 * <p>Java class for Product_Search_Config__c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Product_Search_Config__c">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="Attachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Column_1__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Column_2__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Column_3__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Column_4__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Column_5__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Column_6__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Column_7__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConnectionReceived" type="{urn:sobject.enterprise.soap.sforce.com}PartnerNetworkConnection" minOccurs="0"/>
 *         &lt;element name="ConnectionReceivedId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ConnectionSent" type="{urn:sobject.enterprise.soap.sforce.com}PartnerNetworkConnection" minOccurs="0"/>
 *         &lt;element name="ConnectionSentId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Division_Abbr__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Division_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeedSubscriptionsForEntity" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Histories" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="NotesAndAttachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Owner" type="{urn:sobject.enterprise.soap.sforce.com}Name" minOccurs="0"/>
 *         &lt;element name="OwnerId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="PH_Label_2__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PH_Label_3__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PH_Label_4__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PH_Label_5__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProcessInstances" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ProcessSteps" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
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
@XmlType(name = "Product_Search_Config__c", propOrder = {
    "attachments",
    "column1C",
    "column2C",
    "column3C",
    "column4C",
    "column5C",
    "column6C",
    "column7C",
    "connectionReceived",
    "connectionReceivedId",
    "connectionSent",
    "connectionSentId",
    "createdBy",
    "createdById",
    "createdDate",
    "divisionAbbrC",
    "divisionCodeC",
    "feedSubscriptionsForEntity",
    "histories",
    "isDeleted",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "name",
    "notes",
    "notesAndAttachments",
    "owner",
    "ownerId",
    "phLabel2C",
    "phLabel3C",
    "phLabel4C",
    "phLabel5C",
    "processInstances",
    "processSteps",
    "systemModstamp"
})
public class Product_Search_Config__CType
    extends SObjectType
{

    @XmlElement(name = "Attachments", nillable = true)
    protected QueryResult attachments;
    @XmlElement(name = "Column_1__c", nillable = true)
    protected String column1C;
    @XmlElement(name = "Column_2__c", nillable = true)
    protected String column2C;
    @XmlElement(name = "Column_3__c", nillable = true)
    protected String column3C;
    @XmlElement(name = "Column_4__c", nillable = true)
    protected String column4C;
    @XmlElement(name = "Column_5__c", nillable = true)
    protected String column5C;
    @XmlElement(name = "Column_6__c", nillable = true)
    protected String column6C;
    @XmlElement(name = "Column_7__c", nillable = true)
    protected String column7C;
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
    @XmlElement(name = "Division_Abbr__c", nillable = true)
    protected String divisionAbbrC;
    @XmlElement(name = "Division_Code__c", nillable = true)
    protected String divisionCodeC;
    @XmlElement(name = "FeedSubscriptionsForEntity", nillable = true)
    protected QueryResult feedSubscriptionsForEntity;
    @XmlElement(name = "Histories", nillable = true)
    protected QueryResult histories;
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
    @XmlElement(name = "PH_Label_2__c", nillable = true)
    protected String phLabel2C;
    @XmlElement(name = "PH_Label_3__c", nillable = true)
    protected String phLabel3C;
    @XmlElement(name = "PH_Label_4__c", nillable = true)
    protected String phLabel4C;
    @XmlElement(name = "PH_Label_5__c", nillable = true)
    protected String phLabel5C;
    @XmlElement(name = "ProcessInstances", nillable = true)
    protected QueryResult processInstances;
    @XmlElement(name = "ProcessSteps", nillable = true)
    protected QueryResult processSteps;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;

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
     * Gets the value of the column_1__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumn_1__C() {
        return column1C;
    }

    /**
     * Sets the value of the column_1__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumn_1__C(String value) {
        this.column1C = value;
    }

    /**
     * Gets the value of the column_2__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumn_2__C() {
        return column2C;
    }

    /**
     * Sets the value of the column_2__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumn_2__C(String value) {
        this.column2C = value;
    }

    /**
     * Gets the value of the column_3__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumn_3__C() {
        return column3C;
    }

    /**
     * Sets the value of the column_3__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumn_3__C(String value) {
        this.column3C = value;
    }

    /**
     * Gets the value of the column_4__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumn_4__C() {
        return column4C;
    }

    /**
     * Sets the value of the column_4__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumn_4__C(String value) {
        this.column4C = value;
    }

    /**
     * Gets the value of the column_5__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumn_5__C() {
        return column5C;
    }

    /**
     * Sets the value of the column_5__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumn_5__C(String value) {
        this.column5C = value;
    }

    /**
     * Gets the value of the column_6__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumn_6__C() {
        return column6C;
    }

    /**
     * Sets the value of the column_6__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumn_6__C(String value) {
        this.column6C = value;
    }

    /**
     * Gets the value of the column_7__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumn_7__C() {
        return column7C;
    }

    /**
     * Sets the value of the column_7__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumn_7__C(String value) {
        this.column7C = value;
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
     * Gets the value of the division_Abbr__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivision_Abbr__C() {
        return divisionAbbrC;
    }

    /**
     * Sets the value of the division_Abbr__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivision_Abbr__C(String value) {
        this.divisionAbbrC = value;
    }

    /**
     * Gets the value of the division_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivision_Code__C() {
        return divisionCodeC;
    }

    /**
     * Sets the value of the division_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivision_Code__C(String value) {
        this.divisionCodeC = value;
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
     * Gets the value of the histories property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getHistories() {
        return histories;
    }

    /**
     * Sets the value of the histories property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setHistories(QueryResult value) {
        this.histories = value;
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
     * Gets the value of the ph_Label_2__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPH_Label_2__C() {
        return phLabel2C;
    }

    /**
     * Sets the value of the ph_Label_2__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPH_Label_2__C(String value) {
        this.phLabel2C = value;
    }

    /**
     * Gets the value of the ph_Label_3__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPH_Label_3__C() {
        return phLabel3C;
    }

    /**
     * Sets the value of the ph_Label_3__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPH_Label_3__C(String value) {
        this.phLabel3C = value;
    }

    /**
     * Gets the value of the ph_Label_4__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPH_Label_4__C() {
        return phLabel4C;
    }

    /**
     * Sets the value of the ph_Label_4__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPH_Label_4__C(String value) {
        this.phLabel4C = value;
    }

    /**
     * Gets the value of the ph_Label_5__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPH_Label_5__C() {
        return phLabel5C;
    }

    /**
     * Sets the value of the ph_Label_5__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPH_Label_5__C(String value) {
        this.phLabel5C = value;
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

}
