
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sforce.soap.enterprise.QueryResult;


/**
 * <p>Java class for Proposal_Tree__c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Proposal_Tree__c">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="After_Text__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Before_Text__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CPO_Quantity__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ConnectionReceived" type="{urn:sobject.enterprise.soap.sforce.com}PartnerNetworkConnection" minOccurs="0"/>
 *         &lt;element name="ConnectionReceivedId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ConnectionSent" type="{urn:sobject.enterprise.soap.sforce.com}PartnerNetworkConnection" minOccurs="0"/>
 *         &lt;element name="ConnectionSentId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Default_Charge__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Default_Grade__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Display_Flag__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FeedSubscriptionsForEntity" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Is_Choice__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Is_Option__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Is_Untitled_Group__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Legacy_Group_Id__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="NotesAndAttachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Owner" type="{urn:sobject.enterprise.soap.sforce.com}Name" minOccurs="0"/>
 *         &lt;element name="OwnerId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Parent_Id__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Parent_Id__r" type="{urn:sobject.enterprise.soap.sforce.com}Proposal_Tree__c" minOccurs="0"/>
 *         &lt;element name="ProcessInstances" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ProcessSteps" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Proposal_Id__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Proposal_Id__r" type="{urn:sobject.enterprise.soap.sforce.com}Opportunity" minOccurs="0"/>
 *         &lt;element name="Quantity__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="R00NS0000000HI7TMAW__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="R00NS0000000HI7xMAG__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="SSO_Control_Group_Id__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="SSO_Control_Group_Id__r" type="{urn:sobject.enterprise.soap.sforce.com}CP_Control_Groups__c" minOccurs="0"/>
 *         &lt;element name="SSO_Override_Indicator__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Show_After_Text__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Show_Before_Text__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Skip_Total_Line__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Sort_Order__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Tree_Sort_Order__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Proposal_Tree__c", propOrder = {
    "afterTextC",
    "attachments",
    "beforeTextC",
    "cpoQuantityC",
    "connectionReceived",
    "connectionReceivedId",
    "connectionSent",
    "connectionSentId",
    "createdBy",
    "createdById",
    "createdDate",
    "defaultChargeC",
    "defaultGradeC",
    "displayFlagC",
    "feedSubscriptionsForEntity",
    "isDeleted",
    "isChoiceC",
    "isOptionC",
    "isUntitledGroupC",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "legacyGroupIdC",
    "name",
    "notes",
    "notesAndAttachments",
    "owner",
    "ownerId",
    "parentIdC",
    "parentIdR",
    "processInstances",
    "processSteps",
    "proposalIdC",
    "proposalIdR",
    "quantityC",
    "r00NS0000000HI7TMAWR",
    "r00NS0000000HI7XMAGR",
    "ssoControlGroupIdC",
    "ssoControlGroupIdR",
    "ssoOverrideIndicatorC",
    "showAfterTextC",
    "showBeforeTextC",
    "skipTotalLineC",
    "sortOrderC",
    "systemModstamp",
    "treeSortOrderC"
})
public class Proposal_Tree__CType
    extends SObjectType
{

    @XmlElement(name = "After_Text__c", nillable = true)
    protected String afterTextC;
    @XmlElement(name = "Attachments", nillable = true)
    protected QueryResult attachments;
    @XmlElement(name = "Before_Text__c", nillable = true)
    protected String beforeTextC;
    @XmlElement(name = "CPO_Quantity__c", nillable = true)
    protected Double cpoQuantityC;
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
    @XmlElement(name = "Default_Charge__c", nillable = true)
    protected String defaultChargeC;
    @XmlElement(name = "Default_Grade__c", nillable = true)
    protected String defaultGradeC;
    @XmlElement(name = "Display_Flag__c", nillable = true)
    protected Boolean displayFlagC;
    @XmlElement(name = "FeedSubscriptionsForEntity", nillable = true)
    protected QueryResult feedSubscriptionsForEntity;
    @XmlElement(name = "IsDeleted", nillable = true)
    protected Boolean isDeleted;
    @XmlElement(name = "Is_Choice__c", nillable = true)
    protected Boolean isChoiceC;
    @XmlElement(name = "Is_Option__c", nillable = true)
    protected Boolean isOptionC;
    @XmlElement(name = "Is_Untitled_Group__c", nillable = true)
    protected Boolean isUntitledGroupC;
    @XmlElement(name = "LastModifiedBy", nillable = true)
    protected UserType lastModifiedBy;
    @XmlElement(name = "LastModifiedById", nillable = true)
    protected String lastModifiedById;
    @XmlElement(name = "LastModifiedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlElement(name = "Legacy_Group_Id__c", nillable = true)
    protected String legacyGroupIdC;
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
    @XmlElement(name = "Parent_Id__c", nillable = true)
    protected String parentIdC;
    @XmlElement(name = "Parent_Id__r", nillable = true)
    protected Proposal_Tree__CType parentIdR;
    @XmlElement(name = "ProcessInstances", nillable = true)
    protected QueryResult processInstances;
    @XmlElement(name = "ProcessSteps", nillable = true)
    protected QueryResult processSteps;
    @XmlElement(name = "Proposal_Id__c", nillable = true)
    protected String proposalIdC;
    @XmlElement(name = "Proposal_Id__r", nillable = true)
    protected OpportunityType proposalIdR;
    @XmlElement(name = "Quantity__c", nillable = true)
    protected Double quantityC;
    @XmlElement(name = "R00NS0000000HI7TMAW__r", nillable = true)
    protected QueryResult r00NS0000000HI7TMAWR;
    @XmlElement(name = "R00NS0000000HI7xMAG__r", nillable = true)
    protected QueryResult r00NS0000000HI7XMAGR;
    @XmlElement(name = "SSO_Control_Group_Id__c", nillable = true)
    protected String ssoControlGroupIdC;
    @XmlElement(name = "SSO_Control_Group_Id__r", nillable = true)
    protected CP_Control_Groups__CType ssoControlGroupIdR;
    @XmlElement(name = "SSO_Override_Indicator__c", nillable = true)
    protected String ssoOverrideIndicatorC;
    @XmlElement(name = "Show_After_Text__c", nillable = true)
    protected Boolean showAfterTextC;
    @XmlElement(name = "Show_Before_Text__c", nillable = true)
    protected Boolean showBeforeTextC;
    @XmlElement(name = "Skip_Total_Line__c", nillable = true)
    protected Boolean skipTotalLineC;
    @XmlElement(name = "Sort_Order__c", nillable = true)
    protected Double sortOrderC;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "Tree_Sort_Order__c", nillable = true)
    protected Double treeSortOrderC;

    /**
     * Gets the value of the after_Text__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfter_Text__C() {
        return afterTextC;
    }

    /**
     * Sets the value of the after_Text__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfter_Text__C(String value) {
        this.afterTextC = value;
    }

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
     * Gets the value of the before_Text__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBefore_Text__C() {
        return beforeTextC;
    }

    /**
     * Sets the value of the before_Text__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBefore_Text__C(String value) {
        this.beforeTextC = value;
    }

    /**
     * Gets the value of the cpo_Quantity__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCPO_Quantity__C() {
        return cpoQuantityC;
    }

    /**
     * Sets the value of the cpo_Quantity__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCPO_Quantity__C(Double value) {
        this.cpoQuantityC = value;
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
     * Gets the value of the default_Charge__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefault_Charge__C() {
        return defaultChargeC;
    }

    /**
     * Sets the value of the default_Charge__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefault_Charge__C(String value) {
        this.defaultChargeC = value;
    }

    /**
     * Gets the value of the default_Grade__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefault_Grade__C() {
        return defaultGradeC;
    }

    /**
     * Sets the value of the default_Grade__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefault_Grade__C(String value) {
        this.defaultGradeC = value;
    }

    /**
     * Gets the value of the display_Flag__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplay_Flag__C() {
        return displayFlagC;
    }

    /**
     * Sets the value of the display_Flag__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplay_Flag__C(Boolean value) {
        this.displayFlagC = value;
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
     * Gets the value of the is_Choice__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIs_Choice__C() {
        return isChoiceC;
    }

    /**
     * Sets the value of the is_Choice__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIs_Choice__C(Boolean value) {
        this.isChoiceC = value;
    }

    /**
     * Gets the value of the is_Option__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIs_Option__C() {
        return isOptionC;
    }

    /**
     * Sets the value of the is_Option__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIs_Option__C(Boolean value) {
        this.isOptionC = value;
    }

    /**
     * Gets the value of the is_Untitled_Group__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIs_Untitled_Group__C() {
        return isUntitledGroupC;
    }

    /**
     * Sets the value of the is_Untitled_Group__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIs_Untitled_Group__C(Boolean value) {
        this.isUntitledGroupC = value;
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
     * Gets the value of the legacy_Group_Id__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegacy_Group_Id__C() {
        return legacyGroupIdC;
    }

    /**
     * Sets the value of the legacy_Group_Id__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegacy_Group_Id__C(String value) {
        this.legacyGroupIdC = value;
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
     * Gets the value of the parent_Id__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParent_Id__C() {
        return parentIdC;
    }

    /**
     * Sets the value of the parent_Id__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParent_Id__C(String value) {
        this.parentIdC = value;
    }

    /**
     * Gets the value of the parent_Id__R property.
     * 
     * @return
     *     possible object is
     *     {@link Proposal_Tree__CType }
     *     
     */
    public Proposal_Tree__CType getParent_Id__R() {
        return parentIdR;
    }

    /**
     * Sets the value of the parent_Id__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Proposal_Tree__CType }
     *     
     */
    public void setParent_Id__R(Proposal_Tree__CType value) {
        this.parentIdR = value;
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
     * Gets the value of the proposal_Id__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProposal_Id__C() {
        return proposalIdC;
    }

    /**
     * Sets the value of the proposal_Id__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProposal_Id__C(String value) {
        this.proposalIdC = value;
    }

    /**
     * Gets the value of the proposal_Id__R property.
     * 
     * @return
     *     possible object is
     *     {@link OpportunityType }
     *     
     */
    public OpportunityType getProposal_Id__R() {
        return proposalIdR;
    }

    /**
     * Sets the value of the proposal_Id__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpportunityType }
     *     
     */
    public void setProposal_Id__R(OpportunityType value) {
        this.proposalIdR = value;
    }

    /**
     * Gets the value of the quantity__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantity__C() {
        return quantityC;
    }

    /**
     * Sets the value of the quantity__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantity__C(Double value) {
        this.quantityC = value;
    }

    /**
     * Gets the value of the r00NS0000000HI7TMAW__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getR00NS0000000HI7TMAW__R() {
        return r00NS0000000HI7TMAWR;
    }

    /**
     * Sets the value of the r00NS0000000HI7TMAW__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setR00NS0000000HI7TMAW__R(QueryResult value) {
        this.r00NS0000000HI7TMAWR = value;
    }

    /**
     * Gets the value of the r00NS0000000HI7XMAG__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getR00NS0000000HI7XMAG__R() {
        return r00NS0000000HI7XMAGR;
    }

    /**
     * Sets the value of the r00NS0000000HI7XMAG__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setR00NS0000000HI7XMAG__R(QueryResult value) {
        this.r00NS0000000HI7XMAGR = value;
    }

    /**
     * Gets the value of the sso_Control_Group_Id__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSO_Control_Group_Id__C() {
        return ssoControlGroupIdC;
    }

    /**
     * Sets the value of the sso_Control_Group_Id__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSO_Control_Group_Id__C(String value) {
        this.ssoControlGroupIdC = value;
    }

    /**
     * Gets the value of the sso_Control_Group_Id__R property.
     * 
     * @return
     *     possible object is
     *     {@link CP_Control_Groups__CType }
     *     
     */
    public CP_Control_Groups__CType getSSO_Control_Group_Id__R() {
        return ssoControlGroupIdR;
    }

    /**
     * Sets the value of the sso_Control_Group_Id__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link CP_Control_Groups__CType }
     *     
     */
    public void setSSO_Control_Group_Id__R(CP_Control_Groups__CType value) {
        this.ssoControlGroupIdR = value;
    }

    /**
     * Gets the value of the sso_Override_Indicator__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSO_Override_Indicator__C() {
        return ssoOverrideIndicatorC;
    }

    /**
     * Sets the value of the sso_Override_Indicator__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSO_Override_Indicator__C(String value) {
        this.ssoOverrideIndicatorC = value;
    }

    /**
     * Gets the value of the show_After_Text__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShow_After_Text__C() {
        return showAfterTextC;
    }

    /**
     * Sets the value of the show_After_Text__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShow_After_Text__C(Boolean value) {
        this.showAfterTextC = value;
    }

    /**
     * Gets the value of the show_Before_Text__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShow_Before_Text__C() {
        return showBeforeTextC;
    }

    /**
     * Sets the value of the show_Before_Text__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShow_Before_Text__C(Boolean value) {
        this.showBeforeTextC = value;
    }

    /**
     * Gets the value of the skip_Total_Line__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSkip_Total_Line__C() {
        return skipTotalLineC;
    }

    /**
     * Sets the value of the skip_Total_Line__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkip_Total_Line__C(Boolean value) {
        this.skipTotalLineC = value;
    }

    /**
     * Gets the value of the sort_Order__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSort_Order__C() {
        return sortOrderC;
    }

    /**
     * Sets the value of the sort_Order__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSort_Order__C(Double value) {
        this.sortOrderC = value;
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
     * Gets the value of the tree_Sort_Order__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTree_Sort_Order__C() {
        return treeSortOrderC;
    }

    /**
     * Sets the value of the tree_Sort_Order__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTree_Sort_Order__C(Double value) {
        this.treeSortOrderC = value;
    }

}
