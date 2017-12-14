
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sforce.soap.enterprise.QueryResult;


/**
 * <p>Java class for Unassigned_Sales__c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Unassigned_Sales__c">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="Account_PID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Account_Related_Account__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Account__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Account__r" type="{urn:sobject.enterprise.soap.sforce.com}Account" minOccurs="0"/>
 *         &lt;element name="Amount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Assigned_date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Assigned_to__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Assigned_to__r" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="Attachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ConnectionReceived" type="{urn:sobject.enterprise.soap.sforce.com}PartnerNetworkConnection" minOccurs="0"/>
 *         &lt;element name="ConnectionReceivedId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ConnectionSent" type="{urn:sobject.enterprise.soap.sforce.com}PartnerNetworkConnection" minOccurs="0"/>
 *         &lt;element name="ConnectionSentId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Customer_Class_Desc__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Customer_Class__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Customer_Payer_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Customer_Payer__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Customer_Type_Desc__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Customer_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Date_Returned__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Date_Sent__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="District__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeedSubscriptionsForEntity" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MDR_PID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="New_Data_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="NotesAndAttachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Overall_Comments__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Owner" type="{urn:sobject.enterprise.soap.sforce.com}Name" minOccurs="0"/>
 *         &lt;element name="OwnerId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Payer_MDR_PID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProcessInstances" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ProcessSteps" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Reason_Unresolved_Driver__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Recommendation__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Related_Account_OfficeFlag__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Research_Comment__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAP_Account_Customer_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAP_Account_Front_Back_Office__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAP_Account_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAP_Account_Number__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAP_Account_Shipping_City__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAP_Account_Shipping_State__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAP_Account_Shipping_Street__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAP_Account_Shipping_Zip__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAP_Ship_to_Sold_to__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sent_to_Temps__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Sent_to__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ship_to_Party_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ship_to_Party__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ship_to_State_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ship_to_State__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ship_to_Zip__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sold_to__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Text_Status_Date__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Text_Status__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Unassigned_Sales__c", propOrder = {
    "accountPIDC",
    "accountRelatedAccountC",
    "accountC",
    "accountR",
    "amountC",
    "assignedDateC",
    "assignedToC",
    "assignedToR",
    "attachments",
    "connectionReceived",
    "connectionReceivedId",
    "connectionSent",
    "connectionSentId",
    "createdBy",
    "createdById",
    "createdDate",
    "customerClassDescC",
    "customerClassC",
    "customerPayerNameC",
    "customerPayerC",
    "customerTypeDescC",
    "customerTypeC",
    "dateReturnedC",
    "dateSentC",
    "districtC",
    "feedSubscriptionsForEntity",
    "isDeleted",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "mdrPIDC",
    "name",
    "newDataDateC",
    "notes",
    "notesAndAttachments",
    "overallCommentsC",
    "owner",
    "ownerId",
    "payerMDRPIDC",
    "processInstances",
    "processSteps",
    "reasonUnresolvedDriverC",
    "recommendationC",
    "relatedAccountOfficeFlagC",
    "researchCommentC",
    "sapAccountCustomerTypeC",
    "sapAccountFrontBackOfficeC",
    "sapAccountNameC",
    "sapAccountNumberC",
    "sapAccountShippingCityC",
    "sapAccountShippingStateC",
    "sapAccountShippingStreetC",
    "sapAccountShippingZipC",
    "sapShipToSoldToC",
    "sentToTempsC",
    "sentToC",
    "shipToPartyNameC",
    "shipToPartyC",
    "shipToStateNameC",
    "shipToStateC",
    "shipToZipC",
    "soldToC",
    "statusC",
    "systemModstamp",
    "textStatusDateC",
    "textStatusC"
})
public class Unassigned_Sales__CType
    extends SObjectType
{

    @XmlElement(name = "Account_PID__c", nillable = true)
    protected String accountPIDC;
    @XmlElement(name = "Account_Related_Account__c", nillable = true)
    protected String accountRelatedAccountC;
    @XmlElement(name = "Account__c", nillable = true)
    protected String accountC;
    @XmlElement(name = "Account__r", nillable = true)
    protected AccountType accountR;
    @XmlElement(name = "Amount__c", nillable = true)
    protected Double amountC;
    @XmlElement(name = "Assigned_date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar assignedDateC;
    @XmlElement(name = "Assigned_to__c", nillable = true)
    protected String assignedToC;
    @XmlElement(name = "Assigned_to__r", nillable = true)
    protected UserType assignedToR;
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
    @XmlElement(name = "Customer_Class_Desc__c", nillable = true)
    protected String customerClassDescC;
    @XmlElement(name = "Customer_Class__c", nillable = true)
    protected String customerClassC;
    @XmlElement(name = "Customer_Payer_Name__c", nillable = true)
    protected String customerPayerNameC;
    @XmlElement(name = "Customer_Payer__c", nillable = true)
    protected String customerPayerC;
    @XmlElement(name = "Customer_Type_Desc__c", nillable = true)
    protected String customerTypeDescC;
    @XmlElement(name = "Customer_Type__c", nillable = true)
    protected String customerTypeC;
    @XmlElement(name = "Date_Returned__c", nillable = true)
    protected String dateReturnedC;
    @XmlElement(name = "Date_Sent__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateSentC;
    @XmlElement(name = "District__c", nillable = true)
    protected String districtC;
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
    @XmlElement(name = "MDR_PID__c", nillable = true)
    protected String mdrPIDC;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "New_Data_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar newDataDateC;
    @XmlElement(name = "Notes", nillable = true)
    protected QueryResult notes;
    @XmlElement(name = "NotesAndAttachments", nillable = true)
    protected QueryResult notesAndAttachments;
    @XmlElement(name = "Overall_Comments__c", nillable = true)
    protected String overallCommentsC;
    @XmlElement(name = "Owner", nillable = true)
    protected NameType owner;
    @XmlElement(name = "OwnerId", nillable = true)
    protected String ownerId;
    @XmlElement(name = "Payer_MDR_PID__c", nillable = true)
    protected String payerMDRPIDC;
    @XmlElement(name = "ProcessInstances", nillable = true)
    protected QueryResult processInstances;
    @XmlElement(name = "ProcessSteps", nillable = true)
    protected QueryResult processSteps;
    @XmlElement(name = "Reason_Unresolved_Driver__c", nillable = true)
    protected String reasonUnresolvedDriverC;
    @XmlElement(name = "Recommendation__c", nillable = true)
    protected String recommendationC;
    @XmlElement(name = "Related_Account_OfficeFlag__c", nillable = true)
    protected String relatedAccountOfficeFlagC;
    @XmlElement(name = "Research_Comment__c", nillable = true)
    protected String researchCommentC;
    @XmlElement(name = "SAP_Account_Customer_Type__c", nillable = true)
    protected String sapAccountCustomerTypeC;
    @XmlElement(name = "SAP_Account_Front_Back_Office__c", nillable = true)
    protected String sapAccountFrontBackOfficeC;
    @XmlElement(name = "SAP_Account_Name__c", nillable = true)
    protected String sapAccountNameC;
    @XmlElement(name = "SAP_Account_Number__c", nillable = true)
    protected String sapAccountNumberC;
    @XmlElement(name = "SAP_Account_Shipping_City__c", nillable = true)
    protected String sapAccountShippingCityC;
    @XmlElement(name = "SAP_Account_Shipping_State__c", nillable = true)
    protected String sapAccountShippingStateC;
    @XmlElement(name = "SAP_Account_Shipping_Street__c", nillable = true)
    protected String sapAccountShippingStreetC;
    @XmlElement(name = "SAP_Account_Shipping_Zip__c", nillable = true)
    protected String sapAccountShippingZipC;
    @XmlElement(name = "SAP_Ship_to_Sold_to__c", nillable = true)
    protected String sapShipToSoldToC;
    @XmlElement(name = "Sent_to_Temps__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sentToTempsC;
    @XmlElement(name = "Sent_to__c", nillable = true)
    protected String sentToC;
    @XmlElement(name = "Ship_to_Party_Name__c", nillable = true)
    protected String shipToPartyNameC;
    @XmlElement(name = "Ship_to_Party__c", nillable = true)
    protected String shipToPartyC;
    @XmlElement(name = "Ship_to_State_Name__c", nillable = true)
    protected String shipToStateNameC;
    @XmlElement(name = "Ship_to_State__c", nillable = true)
    protected String shipToStateC;
    @XmlElement(name = "Ship_to_Zip__c", nillable = true)
    protected String shipToZipC;
    @XmlElement(name = "Sold_to__c", nillable = true)
    protected String soldToC;
    @XmlElement(name = "Status__c", nillable = true)
    protected String statusC;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "Text_Status_Date__c", nillable = true)
    protected String textStatusDateC;
    @XmlElement(name = "Text_Status__c", nillable = true)
    protected String textStatusC;

    /**
     * Gets the value of the account_PID__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount_PID__C() {
        return accountPIDC;
    }

    /**
     * Sets the value of the account_PID__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount_PID__C(String value) {
        this.accountPIDC = value;
    }

    /**
     * Gets the value of the account_Related_Account__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount_Related_Account__C() {
        return accountRelatedAccountC;
    }

    /**
     * Sets the value of the account_Related_Account__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount_Related_Account__C(String value) {
        this.accountRelatedAccountC = value;
    }

    /**
     * Gets the value of the account__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount__C() {
        return accountC;
    }

    /**
     * Sets the value of the account__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount__C(String value) {
        this.accountC = value;
    }

    /**
     * Gets the value of the account__R property.
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getAccount__R() {
        return accountR;
    }

    /**
     * Sets the value of the account__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setAccount__R(AccountType value) {
        this.accountR = value;
    }

    /**
     * Gets the value of the amount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmount__C() {
        return amountC;
    }

    /**
     * Sets the value of the amount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmount__C(Double value) {
        this.amountC = value;
    }

    /**
     * Gets the value of the assigned_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAssigned_Date__C() {
        return assignedDateC;
    }

    /**
     * Sets the value of the assigned_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAssigned_Date__C(XMLGregorianCalendar value) {
        this.assignedDateC = value;
    }

    /**
     * Gets the value of the assigned_To__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssigned_To__C() {
        return assignedToC;
    }

    /**
     * Sets the value of the assigned_To__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssigned_To__C(String value) {
        this.assignedToC = value;
    }

    /**
     * Gets the value of the assigned_To__R property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getAssigned_To__R() {
        return assignedToR;
    }

    /**
     * Sets the value of the assigned_To__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setAssigned_To__R(UserType value) {
        this.assignedToR = value;
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
     * Gets the value of the customer_Class_Desc__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomer_Class_Desc__C() {
        return customerClassDescC;
    }

    /**
     * Sets the value of the customer_Class_Desc__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomer_Class_Desc__C(String value) {
        this.customerClassDescC = value;
    }

    /**
     * Gets the value of the customer_Class__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomer_Class__C() {
        return customerClassC;
    }

    /**
     * Sets the value of the customer_Class__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomer_Class__C(String value) {
        this.customerClassC = value;
    }

    /**
     * Gets the value of the customer_Payer_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomer_Payer_Name__C() {
        return customerPayerNameC;
    }

    /**
     * Sets the value of the customer_Payer_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomer_Payer_Name__C(String value) {
        this.customerPayerNameC = value;
    }

    /**
     * Gets the value of the customer_Payer__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomer_Payer__C() {
        return customerPayerC;
    }

    /**
     * Sets the value of the customer_Payer__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomer_Payer__C(String value) {
        this.customerPayerC = value;
    }

    /**
     * Gets the value of the customer_Type_Desc__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomer_Type_Desc__C() {
        return customerTypeDescC;
    }

    /**
     * Sets the value of the customer_Type_Desc__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomer_Type_Desc__C(String value) {
        this.customerTypeDescC = value;
    }

    /**
     * Gets the value of the customer_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomer_Type__C() {
        return customerTypeC;
    }

    /**
     * Sets the value of the customer_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomer_Type__C(String value) {
        this.customerTypeC = value;
    }

    /**
     * Gets the value of the date_Returned__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate_Returned__C() {
        return dateReturnedC;
    }

    /**
     * Sets the value of the date_Returned__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate_Returned__C(String value) {
        this.dateReturnedC = value;
    }

    /**
     * Gets the value of the date_Sent__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate_Sent__C() {
        return dateSentC;
    }

    /**
     * Sets the value of the date_Sent__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate_Sent__C(XMLGregorianCalendar value) {
        this.dateSentC = value;
    }

    /**
     * Gets the value of the district__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict__C() {
        return districtC;
    }

    /**
     * Sets the value of the district__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict__C(String value) {
        this.districtC = value;
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
     * Gets the value of the mdr_PID__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDR_PID__C() {
        return mdrPIDC;
    }

    /**
     * Sets the value of the mdr_PID__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDR_PID__C(String value) {
        this.mdrPIDC = value;
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
     * Gets the value of the new_Data_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNew_Data_Date__C() {
        return newDataDateC;
    }

    /**
     * Sets the value of the new_Data_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNew_Data_Date__C(XMLGregorianCalendar value) {
        this.newDataDateC = value;
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
     * Gets the value of the overall_Comments__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverall_Comments__C() {
        return overallCommentsC;
    }

    /**
     * Sets the value of the overall_Comments__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverall_Comments__C(String value) {
        this.overallCommentsC = value;
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
     * Gets the value of the payer_MDR_PID__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayer_MDR_PID__C() {
        return payerMDRPIDC;
    }

    /**
     * Sets the value of the payer_MDR_PID__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayer_MDR_PID__C(String value) {
        this.payerMDRPIDC = value;
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
     * Gets the value of the reason_Unresolved_Driver__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason_Unresolved_Driver__C() {
        return reasonUnresolvedDriverC;
    }

    /**
     * Sets the value of the reason_Unresolved_Driver__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason_Unresolved_Driver__C(String value) {
        this.reasonUnresolvedDriverC = value;
    }

    /**
     * Gets the value of the recommendation__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecommendation__C() {
        return recommendationC;
    }

    /**
     * Sets the value of the recommendation__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecommendation__C(String value) {
        this.recommendationC = value;
    }

    /**
     * Gets the value of the related_Account_OfficeFlag__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelated_Account_OfficeFlag__C() {
        return relatedAccountOfficeFlagC;
    }

    /**
     * Sets the value of the related_Account_OfficeFlag__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelated_Account_OfficeFlag__C(String value) {
        this.relatedAccountOfficeFlagC = value;
    }

    /**
     * Gets the value of the research_Comment__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResearch_Comment__C() {
        return researchCommentC;
    }

    /**
     * Sets the value of the research_Comment__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResearch_Comment__C(String value) {
        this.researchCommentC = value;
    }

    /**
     * Gets the value of the sap_Account_Customer_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAP_Account_Customer_Type__C() {
        return sapAccountCustomerTypeC;
    }

    /**
     * Sets the value of the sap_Account_Customer_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAP_Account_Customer_Type__C(String value) {
        this.sapAccountCustomerTypeC = value;
    }

    /**
     * Gets the value of the sap_Account_Front_Back_Office__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAP_Account_Front_Back_Office__C() {
        return sapAccountFrontBackOfficeC;
    }

    /**
     * Sets the value of the sap_Account_Front_Back_Office__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAP_Account_Front_Back_Office__C(String value) {
        this.sapAccountFrontBackOfficeC = value;
    }

    /**
     * Gets the value of the sap_Account_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAP_Account_Name__C() {
        return sapAccountNameC;
    }

    /**
     * Sets the value of the sap_Account_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAP_Account_Name__C(String value) {
        this.sapAccountNameC = value;
    }

    /**
     * Gets the value of the sap_Account_Number__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAP_Account_Number__C() {
        return sapAccountNumberC;
    }

    /**
     * Sets the value of the sap_Account_Number__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAP_Account_Number__C(String value) {
        this.sapAccountNumberC = value;
    }

    /**
     * Gets the value of the sap_Account_Shipping_City__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAP_Account_Shipping_City__C() {
        return sapAccountShippingCityC;
    }

    /**
     * Sets the value of the sap_Account_Shipping_City__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAP_Account_Shipping_City__C(String value) {
        this.sapAccountShippingCityC = value;
    }

    /**
     * Gets the value of the sap_Account_Shipping_State__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAP_Account_Shipping_State__C() {
        return sapAccountShippingStateC;
    }

    /**
     * Sets the value of the sap_Account_Shipping_State__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAP_Account_Shipping_State__C(String value) {
        this.sapAccountShippingStateC = value;
    }

    /**
     * Gets the value of the sap_Account_Shipping_Street__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAP_Account_Shipping_Street__C() {
        return sapAccountShippingStreetC;
    }

    /**
     * Sets the value of the sap_Account_Shipping_Street__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAP_Account_Shipping_Street__C(String value) {
        this.sapAccountShippingStreetC = value;
    }

    /**
     * Gets the value of the sap_Account_Shipping_Zip__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAP_Account_Shipping_Zip__C() {
        return sapAccountShippingZipC;
    }

    /**
     * Sets the value of the sap_Account_Shipping_Zip__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAP_Account_Shipping_Zip__C(String value) {
        this.sapAccountShippingZipC = value;
    }

    /**
     * Gets the value of the sap_Ship_To_Sold_To__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAP_Ship_To_Sold_To__C() {
        return sapShipToSoldToC;
    }

    /**
     * Sets the value of the sap_Ship_To_Sold_To__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAP_Ship_To_Sold_To__C(String value) {
        this.sapShipToSoldToC = value;
    }

    /**
     * Gets the value of the sent_To_Temps__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSent_To_Temps__C() {
        return sentToTempsC;
    }

    /**
     * Sets the value of the sent_To_Temps__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSent_To_Temps__C(XMLGregorianCalendar value) {
        this.sentToTempsC = value;
    }

    /**
     * Gets the value of the sent_To__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSent_To__C() {
        return sentToC;
    }

    /**
     * Sets the value of the sent_To__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSent_To__C(String value) {
        this.sentToC = value;
    }

    /**
     * Gets the value of the ship_To_Party_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShip_To_Party_Name__C() {
        return shipToPartyNameC;
    }

    /**
     * Sets the value of the ship_To_Party_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShip_To_Party_Name__C(String value) {
        this.shipToPartyNameC = value;
    }

    /**
     * Gets the value of the ship_To_Party__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShip_To_Party__C() {
        return shipToPartyC;
    }

    /**
     * Sets the value of the ship_To_Party__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShip_To_Party__C(String value) {
        this.shipToPartyC = value;
    }

    /**
     * Gets the value of the ship_To_State_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShip_To_State_Name__C() {
        return shipToStateNameC;
    }

    /**
     * Sets the value of the ship_To_State_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShip_To_State_Name__C(String value) {
        this.shipToStateNameC = value;
    }

    /**
     * Gets the value of the ship_To_State__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShip_To_State__C() {
        return shipToStateC;
    }

    /**
     * Sets the value of the ship_To_State__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShip_To_State__C(String value) {
        this.shipToStateC = value;
    }

    /**
     * Gets the value of the ship_To_Zip__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShip_To_Zip__C() {
        return shipToZipC;
    }

    /**
     * Sets the value of the ship_To_Zip__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShip_To_Zip__C(String value) {
        this.shipToZipC = value;
    }

    /**
     * Gets the value of the sold_To__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSold_To__C() {
        return soldToC;
    }

    /**
     * Sets the value of the sold_To__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSold_To__C(String value) {
        this.soldToC = value;
    }

    /**
     * Gets the value of the status__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus__C() {
        return statusC;
    }

    /**
     * Sets the value of the status__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus__C(String value) {
        this.statusC = value;
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
     * Gets the value of the text_Status_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText_Status_Date__C() {
        return textStatusDateC;
    }

    /**
     * Sets the value of the text_Status_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText_Status_Date__C(String value) {
        this.textStatusDateC = value;
    }

    /**
     * Gets the value of the text_Status__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText_Status__C() {
        return textStatusC;
    }

    /**
     * Sets the value of the text_Status__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText_Status__C(String value) {
        this.textStatusC = value;
    }

}
