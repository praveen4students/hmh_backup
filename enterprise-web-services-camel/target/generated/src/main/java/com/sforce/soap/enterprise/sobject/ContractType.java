
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sforce.soap.enterprise.QueryResult;


/**
 * <p>Java class for Contract complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contract">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="Account" type="{urn:sobject.enterprise.soap.sforce.com}Account" minOccurs="0"/>
 *         &lt;element name="AccountId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ActivatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="ActivatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ActivatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ActivityHistories" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Approvals" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Attachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="BillingCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanySigned" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CompanySignedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CompanySignedId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ContractContactRoles" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ContractNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContractTerm" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CustomerSigned" type="{urn:sobject.enterprise.soap.sforce.com}Contact" minOccurs="0"/>
 *         &lt;element name="CustomerSignedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CustomerSignedId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CustomerSignedTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Discount_Amount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Discount_Notes__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Division" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Events" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="FeedSubscriptionsForEntity" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Feeds" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Histories" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastActivityDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="LastApprovedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="NotesAndAttachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="OpenActivities" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Owner" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="OwnerExpirationNotice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Pro_rated_Term__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProcessInstances" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ProcessSteps" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="SpecialTerms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Tasks" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="experianqas__Updated_Touchpoints_Timestamp__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="experianqas__Updated_Touchpoints__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contract", propOrder = {
    "account",
    "accountId",
    "activatedBy",
    "activatedById",
    "activatedDate",
    "activityHistories",
    "approvals",
    "attachments",
    "billingCity",
    "billingCountry",
    "billingPostalCode",
    "billingState",
    "billingStreet",
    "companySigned",
    "companySignedDate",
    "companySignedId",
    "contractContactRoles",
    "contractNumber",
    "contractTerm",
    "createdBy",
    "createdById",
    "createdDate",
    "customerSigned",
    "customerSignedDate",
    "customerSignedId",
    "customerSignedTitle",
    "description",
    "discountAmountC",
    "discountNotesC",
    "division",
    "endDate",
    "events",
    "feedSubscriptionsForEntity",
    "feeds",
    "histories",
    "isDeleted",
    "lastActivityDate",
    "lastApprovedDate",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "notes",
    "notesAndAttachments",
    "openActivities",
    "owner",
    "ownerExpirationNotice",
    "ownerId",
    "proRatedTermC",
    "processInstances",
    "processSteps",
    "specialTerms",
    "startDate",
    "status",
    "statusCode",
    "systemModstamp",
    "tasks",
    "experianqasUpdatedTouchpointsTimestampC",
    "experianqasUpdatedTouchpointsC"
})
public class ContractType
    extends SObjectType
{

    @XmlElement(name = "Account", nillable = true)
    protected AccountType account;
    @XmlElement(name = "AccountId", nillable = true)
    protected String accountId;
    @XmlElement(name = "ActivatedBy", nillable = true)
    protected UserType activatedBy;
    @XmlElement(name = "ActivatedById", nillable = true)
    protected String activatedById;
    @XmlElement(name = "ActivatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar activatedDate;
    @XmlElement(name = "ActivityHistories", nillable = true)
    protected QueryResult activityHistories;
    @XmlElement(name = "Approvals", nillable = true)
    protected QueryResult approvals;
    @XmlElement(name = "Attachments", nillable = true)
    protected QueryResult attachments;
    @XmlElement(name = "BillingCity", nillable = true)
    protected String billingCity;
    @XmlElement(name = "BillingCountry", nillable = true)
    protected String billingCountry;
    @XmlElement(name = "BillingPostalCode", nillable = true)
    protected String billingPostalCode;
    @XmlElement(name = "BillingState", nillable = true)
    protected String billingState;
    @XmlElement(name = "BillingStreet", nillable = true)
    protected String billingStreet;
    @XmlElement(name = "CompanySigned", nillable = true)
    protected UserType companySigned;
    @XmlElement(name = "CompanySignedDate", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar companySignedDate;
    @XmlElement(name = "CompanySignedId", nillable = true)
    protected String companySignedId;
    @XmlElement(name = "ContractContactRoles", nillable = true)
    protected QueryResult contractContactRoles;
    @XmlElement(name = "ContractNumber", nillable = true)
    protected String contractNumber;
    @XmlElement(name = "ContractTerm", nillable = true)
    protected Integer contractTerm;
    @XmlElement(name = "CreatedBy", nillable = true)
    protected UserType createdBy;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "CustomerSigned", nillable = true)
    protected ContactType customerSigned;
    @XmlElement(name = "CustomerSignedDate", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar customerSignedDate;
    @XmlElement(name = "CustomerSignedId", nillable = true)
    protected String customerSignedId;
    @XmlElement(name = "CustomerSignedTitle", nillable = true)
    protected String customerSignedTitle;
    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "Discount_Amount__c", nillable = true)
    protected Double discountAmountC;
    @XmlElement(name = "Discount_Notes__c", nillable = true)
    protected String discountNotesC;
    @XmlElement(name = "Division", nillable = true)
    protected String division;
    @XmlElement(name = "EndDate", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "Events", nillable = true)
    protected QueryResult events;
    @XmlElement(name = "FeedSubscriptionsForEntity", nillable = true)
    protected QueryResult feedSubscriptionsForEntity;
    @XmlElement(name = "Feeds", nillable = true)
    protected QueryResult feeds;
    @XmlElement(name = "Histories", nillable = true)
    protected QueryResult histories;
    @XmlElement(name = "IsDeleted", nillable = true)
    protected Boolean isDeleted;
    @XmlElement(name = "LastActivityDate", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastActivityDate;
    @XmlElement(name = "LastApprovedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastApprovedDate;
    @XmlElement(name = "LastModifiedBy", nillable = true)
    protected UserType lastModifiedBy;
    @XmlElement(name = "LastModifiedById", nillable = true)
    protected String lastModifiedById;
    @XmlElement(name = "LastModifiedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlElement(name = "Notes", nillable = true)
    protected QueryResult notes;
    @XmlElement(name = "NotesAndAttachments", nillable = true)
    protected QueryResult notesAndAttachments;
    @XmlElement(name = "OpenActivities", nillable = true)
    protected QueryResult openActivities;
    @XmlElement(name = "Owner", nillable = true)
    protected UserType owner;
    @XmlElement(name = "OwnerExpirationNotice", nillable = true)
    protected String ownerExpirationNotice;
    @XmlElement(name = "OwnerId", nillable = true)
    protected String ownerId;
    @XmlElement(name = "Pro_rated_Term__c", nillable = true)
    protected Boolean proRatedTermC;
    @XmlElement(name = "ProcessInstances", nillable = true)
    protected QueryResult processInstances;
    @XmlElement(name = "ProcessSteps", nillable = true)
    protected QueryResult processSteps;
    @XmlElement(name = "SpecialTerms", nillable = true)
    protected String specialTerms;
    @XmlElement(name = "StartDate", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "Status", nillable = true)
    protected String status;
    @XmlElement(name = "StatusCode", nillable = true)
    protected String statusCode;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "Tasks", nillable = true)
    protected QueryResult tasks;
    @XmlElement(name = "experianqas__Updated_Touchpoints_Timestamp__c", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar experianqasUpdatedTouchpointsTimestampC;
    @XmlElement(name = "experianqas__Updated_Touchpoints__c", nillable = true)
    protected String experianqasUpdatedTouchpointsC;

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setAccount(AccountType value) {
        this.account = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the activatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getActivatedBy() {
        return activatedBy;
    }

    /**
     * Sets the value of the activatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setActivatedBy(UserType value) {
        this.activatedBy = value;
    }

    /**
     * Gets the value of the activatedById property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivatedById() {
        return activatedById;
    }

    /**
     * Sets the value of the activatedById property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivatedById(String value) {
        this.activatedById = value;
    }

    /**
     * Gets the value of the activatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivatedDate() {
        return activatedDate;
    }

    /**
     * Sets the value of the activatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivatedDate(XMLGregorianCalendar value) {
        this.activatedDate = value;
    }

    /**
     * Gets the value of the activityHistories property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getActivityHistories() {
        return activityHistories;
    }

    /**
     * Sets the value of the activityHistories property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setActivityHistories(QueryResult value) {
        this.activityHistories = value;
    }

    /**
     * Gets the value of the approvals property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getApprovals() {
        return approvals;
    }

    /**
     * Sets the value of the approvals property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setApprovals(QueryResult value) {
        this.approvals = value;
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
     * Gets the value of the billingCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingCity() {
        return billingCity;
    }

    /**
     * Sets the value of the billingCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingCity(String value) {
        this.billingCity = value;
    }

    /**
     * Gets the value of the billingCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingCountry() {
        return billingCountry;
    }

    /**
     * Sets the value of the billingCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingCountry(String value) {
        this.billingCountry = value;
    }

    /**
     * Gets the value of the billingPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingPostalCode() {
        return billingPostalCode;
    }

    /**
     * Sets the value of the billingPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingPostalCode(String value) {
        this.billingPostalCode = value;
    }

    /**
     * Gets the value of the billingState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingState() {
        return billingState;
    }

    /**
     * Sets the value of the billingState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingState(String value) {
        this.billingState = value;
    }

    /**
     * Gets the value of the billingStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingStreet() {
        return billingStreet;
    }

    /**
     * Sets the value of the billingStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingStreet(String value) {
        this.billingStreet = value;
    }

    /**
     * Gets the value of the companySigned property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getCompanySigned() {
        return companySigned;
    }

    /**
     * Sets the value of the companySigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setCompanySigned(UserType value) {
        this.companySigned = value;
    }

    /**
     * Gets the value of the companySignedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompanySignedDate() {
        return companySignedDate;
    }

    /**
     * Sets the value of the companySignedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompanySignedDate(XMLGregorianCalendar value) {
        this.companySignedDate = value;
    }

    /**
     * Gets the value of the companySignedId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanySignedId() {
        return companySignedId;
    }

    /**
     * Sets the value of the companySignedId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanySignedId(String value) {
        this.companySignedId = value;
    }

    /**
     * Gets the value of the contractContactRoles property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getContractContactRoles() {
        return contractContactRoles;
    }

    /**
     * Sets the value of the contractContactRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setContractContactRoles(QueryResult value) {
        this.contractContactRoles = value;
    }

    /**
     * Gets the value of the contractNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /**
     * Sets the value of the contractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractNumber(String value) {
        this.contractNumber = value;
    }

    /**
     * Gets the value of the contractTerm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContractTerm() {
        return contractTerm;
    }

    /**
     * Sets the value of the contractTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContractTerm(Integer value) {
        this.contractTerm = value;
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
     * Gets the value of the customerSigned property.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getCustomerSigned() {
        return customerSigned;
    }

    /**
     * Sets the value of the customerSigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setCustomerSigned(ContactType value) {
        this.customerSigned = value;
    }

    /**
     * Gets the value of the customerSignedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCustomerSignedDate() {
        return customerSignedDate;
    }

    /**
     * Sets the value of the customerSignedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCustomerSignedDate(XMLGregorianCalendar value) {
        this.customerSignedDate = value;
    }

    /**
     * Gets the value of the customerSignedId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerSignedId() {
        return customerSignedId;
    }

    /**
     * Sets the value of the customerSignedId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerSignedId(String value) {
        this.customerSignedId = value;
    }

    /**
     * Gets the value of the customerSignedTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerSignedTitle() {
        return customerSignedTitle;
    }

    /**
     * Sets the value of the customerSignedTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerSignedTitle(String value) {
        this.customerSignedTitle = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the discount_Amount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDiscount_Amount__C() {
        return discountAmountC;
    }

    /**
     * Sets the value of the discount_Amount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDiscount_Amount__C(Double value) {
        this.discountAmountC = value;
    }

    /**
     * Gets the value of the discount_Notes__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscount_Notes__C() {
        return discountNotesC;
    }

    /**
     * Sets the value of the discount_Notes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscount_Notes__C(String value) {
        this.discountNotesC = value;
    }

    /**
     * Gets the value of the division property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivision() {
        return division;
    }

    /**
     * Sets the value of the division property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivision(String value) {
        this.division = value;
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
     * Gets the value of the events property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getEvents() {
        return events;
    }

    /**
     * Sets the value of the events property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setEvents(QueryResult value) {
        this.events = value;
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
     * Gets the value of the feeds property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getFeeds() {
        return feeds;
    }

    /**
     * Sets the value of the feeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setFeeds(QueryResult value) {
        this.feeds = value;
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
     * Gets the value of the lastActivityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastActivityDate() {
        return lastActivityDate;
    }

    /**
     * Sets the value of the lastActivityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastActivityDate(XMLGregorianCalendar value) {
        this.lastActivityDate = value;
    }

    /**
     * Gets the value of the lastApprovedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastApprovedDate() {
        return lastApprovedDate;
    }

    /**
     * Sets the value of the lastApprovedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastApprovedDate(XMLGregorianCalendar value) {
        this.lastApprovedDate = value;
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
     * Gets the value of the openActivities property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getOpenActivities() {
        return openActivities;
    }

    /**
     * Sets the value of the openActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setOpenActivities(QueryResult value) {
        this.openActivities = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setOwner(UserType value) {
        this.owner = value;
    }

    /**
     * Gets the value of the ownerExpirationNotice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerExpirationNotice() {
        return ownerExpirationNotice;
    }

    /**
     * Sets the value of the ownerExpirationNotice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerExpirationNotice(String value) {
        this.ownerExpirationNotice = value;
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
     * Gets the value of the pro_Rated_Term__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPro_Rated_Term__C() {
        return proRatedTermC;
    }

    /**
     * Sets the value of the pro_Rated_Term__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPro_Rated_Term__C(Boolean value) {
        this.proRatedTermC = value;
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
     * Gets the value of the specialTerms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialTerms() {
        return specialTerms;
    }

    /**
     * Sets the value of the specialTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialTerms(String value) {
        this.specialTerms = value;
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

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
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
     * Gets the value of the tasks property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getTasks() {
        return tasks;
    }

    /**
     * Sets the value of the tasks property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setTasks(QueryResult value) {
        this.tasks = value;
    }

    /**
     * Gets the value of the experianqas__Updated_Touchpoints_Timestamp__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExperianqas__Updated_Touchpoints_Timestamp__C() {
        return experianqasUpdatedTouchpointsTimestampC;
    }

    /**
     * Sets the value of the experianqas__Updated_Touchpoints_Timestamp__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExperianqas__Updated_Touchpoints_Timestamp__C(XMLGregorianCalendar value) {
        this.experianqasUpdatedTouchpointsTimestampC = value;
    }

    /**
     * Gets the value of the experianqas__Updated_Touchpoints__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExperianqas__Updated_Touchpoints__C() {
        return experianqasUpdatedTouchpointsC;
    }

    /**
     * Sets the value of the experianqas__Updated_Touchpoints__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExperianqas__Updated_Touchpoints__C(String value) {
        this.experianqasUpdatedTouchpointsC = value;
    }

}
