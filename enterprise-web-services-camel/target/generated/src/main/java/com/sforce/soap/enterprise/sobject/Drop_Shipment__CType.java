
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sforce.soap.enterprise.QueryResult;


/**
 * <p>Java class for Drop_Shipment__c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Drop_Shipment__c">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="ATTN_To__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Account_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Account__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Account__r" type="{urn:sobject.enterprise.soap.sforce.com}Account" minOccurs="0"/>
 *         &lt;element name="Attachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Batch_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Charge_Status__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConnectionReceived" type="{urn:sobject.enterprise.soap.sforce.com}PartnerNetworkConnection" minOccurs="0"/>
 *         &lt;element name="ConnectionReceivedId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ConnectionSent" type="{urn:sobject.enterprise.soap.sforce.com}PartnerNetworkConnection" minOccurs="0"/>
 *         &lt;element name="ConnectionSentId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Customer_Message__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Deliver_By_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Do_Not_Mix_POs_On_Same_Pallet__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Error_Text__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeedSubscriptionsForEntity" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="No_Friday_Delivery__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="NotesAndAttachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Opportunity_Line_Item_Source_Id__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Opportunity_Line_Item_Target_ID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Opportunity_Source_CP__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Opportunity_Source_CP__r" type="{urn:sobject.enterprise.soap.sforce.com}Opportunity" minOccurs="0"/>
 *         &lt;element name="Opportunity_Target_CP__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Opportunity_Target_CP__r" type="{urn:sobject.enterprise.soap.sforce.com}Opportunity" minOccurs="0"/>
 *         &lt;element name="Override_Addr_City__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Override_Addr_Line1__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Override_Addr_Line2__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Override_Addr_Line3__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Override_Addr_State_Prov__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Override_Addr_Zipcode__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Owner" type="{urn:sobject.enterprise.soap.sforce.com}Name" minOccurs="0"/>
 *         &lt;element name="OwnerId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Pack_By__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProcessInstances" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ProcessSteps" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Purchase_Order__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Quantity__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Ship_Date_Option_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Ship_Date_Option__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ship_to_SAP_Override__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sold_to_SAP_Override__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "Drop_Shipment__c", propOrder = {
    "attnToC",
    "accountNameC",
    "accountC",
    "accountR",
    "attachments",
    "batchNameC",
    "chargeStatusC",
    "connectionReceived",
    "connectionReceivedId",
    "connectionSent",
    "connectionSentId",
    "createdBy",
    "createdById",
    "createdDate",
    "customerMessageC",
    "deliverByDateC",
    "doNotMixPOsOnSamePalletC",
    "errorTextC",
    "feedSubscriptionsForEntity",
    "isDeleted",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "name",
    "noFridayDeliveryC",
    "notes",
    "notesAndAttachments",
    "opportunityLineItemSourceIdC",
    "opportunityLineItemTargetIDC",
    "opportunitySourceCPC",
    "opportunitySourceCPR",
    "opportunityTargetCPC",
    "opportunityTargetCPR",
    "overrideAddrCityC",
    "overrideAddrLine1C",
    "overrideAddrLine2C",
    "overrideAddrLine3C",
    "overrideAddrStateProvC",
    "overrideAddrZipcodeC",
    "owner",
    "ownerId",
    "packByC",
    "processInstances",
    "processSteps",
    "purchaseOrderC",
    "quantityC",
    "shipDateOptionDateC",
    "shipDateOptionC",
    "shipToSAPOverrideC",
    "soldToSAPOverrideC",
    "statusC",
    "systemModstamp"
})
public class Drop_Shipment__CType
    extends SObjectType
{

    @XmlElement(name = "ATTN_To__c", nillable = true)
    protected String attnToC;
    @XmlElement(name = "Account_Name__c", nillable = true)
    protected String accountNameC;
    @XmlElement(name = "Account__c", nillable = true)
    protected String accountC;
    @XmlElement(name = "Account__r", nillable = true)
    protected AccountType accountR;
    @XmlElement(name = "Attachments", nillable = true)
    protected QueryResult attachments;
    @XmlElement(name = "Batch_Name__c", nillable = true)
    protected String batchNameC;
    @XmlElement(name = "Charge_Status__c", nillable = true)
    protected String chargeStatusC;
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
    @XmlElement(name = "Customer_Message__c", nillable = true)
    protected String customerMessageC;
    @XmlElement(name = "Deliver_By_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar deliverByDateC;
    @XmlElement(name = "Do_Not_Mix_POs_On_Same_Pallet__c", nillable = true)
    protected Boolean doNotMixPOsOnSamePalletC;
    @XmlElement(name = "Error_Text__c", nillable = true)
    protected String errorTextC;
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
    @XmlElement(name = "No_Friday_Delivery__c", nillable = true)
    protected Boolean noFridayDeliveryC;
    @XmlElement(name = "Notes", nillable = true)
    protected QueryResult notes;
    @XmlElement(name = "NotesAndAttachments", nillable = true)
    protected QueryResult notesAndAttachments;
    @XmlElement(name = "Opportunity_Line_Item_Source_Id__c", nillable = true)
    protected String opportunityLineItemSourceIdC;
    @XmlElement(name = "Opportunity_Line_Item_Target_ID__c", nillable = true)
    protected String opportunityLineItemTargetIDC;
    @XmlElement(name = "Opportunity_Source_CP__c", nillable = true)
    protected String opportunitySourceCPC;
    @XmlElement(name = "Opportunity_Source_CP__r", nillable = true)
    protected OpportunityType opportunitySourceCPR;
    @XmlElement(name = "Opportunity_Target_CP__c", nillable = true)
    protected String opportunityTargetCPC;
    @XmlElement(name = "Opportunity_Target_CP__r", nillable = true)
    protected OpportunityType opportunityTargetCPR;
    @XmlElement(name = "Override_Addr_City__c", nillable = true)
    protected String overrideAddrCityC;
    @XmlElement(name = "Override_Addr_Line1__c", nillable = true)
    protected String overrideAddrLine1C;
    @XmlElement(name = "Override_Addr_Line2__c", nillable = true)
    protected String overrideAddrLine2C;
    @XmlElement(name = "Override_Addr_Line3__c", nillable = true)
    protected String overrideAddrLine3C;
    @XmlElement(name = "Override_Addr_State_Prov__c", nillable = true)
    protected String overrideAddrStateProvC;
    @XmlElement(name = "Override_Addr_Zipcode__c", nillable = true)
    protected String overrideAddrZipcodeC;
    @XmlElement(name = "Owner", nillable = true)
    protected NameType owner;
    @XmlElement(name = "OwnerId", nillable = true)
    protected String ownerId;
    @XmlElement(name = "Pack_By__c", nillable = true)
    protected String packByC;
    @XmlElement(name = "ProcessInstances", nillable = true)
    protected QueryResult processInstances;
    @XmlElement(name = "ProcessSteps", nillable = true)
    protected QueryResult processSteps;
    @XmlElement(name = "Purchase_Order__c", nillable = true)
    protected String purchaseOrderC;
    @XmlElement(name = "Quantity__c", nillable = true)
    protected Double quantityC;
    @XmlElement(name = "Ship_Date_Option_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar shipDateOptionDateC;
    @XmlElement(name = "Ship_Date_Option__c", nillable = true)
    protected String shipDateOptionC;
    @XmlElement(name = "Ship_to_SAP_Override__c", nillable = true)
    protected String shipToSAPOverrideC;
    @XmlElement(name = "Sold_to_SAP_Override__c", nillable = true)
    protected String soldToSAPOverrideC;
    @XmlElement(name = "Status__c", nillable = true)
    protected String statusC;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;

    /**
     * Gets the value of the attn_To__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATTN_To__C() {
        return attnToC;
    }

    /**
     * Sets the value of the attn_To__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATTN_To__C(String value) {
        this.attnToC = value;
    }

    /**
     * Gets the value of the account_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount_Name__C() {
        return accountNameC;
    }

    /**
     * Sets the value of the account_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount_Name__C(String value) {
        this.accountNameC = value;
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
     * Gets the value of the batch_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatch_Name__C() {
        return batchNameC;
    }

    /**
     * Sets the value of the batch_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatch_Name__C(String value) {
        this.batchNameC = value;
    }

    /**
     * Gets the value of the charge_Status__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharge_Status__C() {
        return chargeStatusC;
    }

    /**
     * Sets the value of the charge_Status__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharge_Status__C(String value) {
        this.chargeStatusC = value;
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
     * Gets the value of the customer_Message__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomer_Message__C() {
        return customerMessageC;
    }

    /**
     * Sets the value of the customer_Message__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomer_Message__C(String value) {
        this.customerMessageC = value;
    }

    /**
     * Gets the value of the deliver_By_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliver_By_Date__C() {
        return deliverByDateC;
    }

    /**
     * Sets the value of the deliver_By_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliver_By_Date__C(XMLGregorianCalendar value) {
        this.deliverByDateC = value;
    }

    /**
     * Gets the value of the do_Not_Mix_POs_On_Same_Pallet__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDo_Not_Mix_POs_On_Same_Pallet__C() {
        return doNotMixPOsOnSamePalletC;
    }

    /**
     * Sets the value of the do_Not_Mix_POs_On_Same_Pallet__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDo_Not_Mix_POs_On_Same_Pallet__C(Boolean value) {
        this.doNotMixPOsOnSamePalletC = value;
    }

    /**
     * Gets the value of the error_Text__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError_Text__C() {
        return errorTextC;
    }

    /**
     * Sets the value of the error_Text__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setError_Text__C(String value) {
        this.errorTextC = value;
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
     * Gets the value of the no_Friday_Delivery__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNo_Friday_Delivery__C() {
        return noFridayDeliveryC;
    }

    /**
     * Sets the value of the no_Friday_Delivery__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNo_Friday_Delivery__C(Boolean value) {
        this.noFridayDeliveryC = value;
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
     * Gets the value of the opportunity_Line_Item_Source_Id__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpportunity_Line_Item_Source_Id__C() {
        return opportunityLineItemSourceIdC;
    }

    /**
     * Sets the value of the opportunity_Line_Item_Source_Id__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpportunity_Line_Item_Source_Id__C(String value) {
        this.opportunityLineItemSourceIdC = value;
    }

    /**
     * Gets the value of the opportunity_Line_Item_Target_ID__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpportunity_Line_Item_Target_ID__C() {
        return opportunityLineItemTargetIDC;
    }

    /**
     * Sets the value of the opportunity_Line_Item_Target_ID__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpportunity_Line_Item_Target_ID__C(String value) {
        this.opportunityLineItemTargetIDC = value;
    }

    /**
     * Gets the value of the opportunity_Source_CP__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpportunity_Source_CP__C() {
        return opportunitySourceCPC;
    }

    /**
     * Sets the value of the opportunity_Source_CP__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpportunity_Source_CP__C(String value) {
        this.opportunitySourceCPC = value;
    }

    /**
     * Gets the value of the opportunity_Source_CP__R property.
     * 
     * @return
     *     possible object is
     *     {@link OpportunityType }
     *     
     */
    public OpportunityType getOpportunity_Source_CP__R() {
        return opportunitySourceCPR;
    }

    /**
     * Sets the value of the opportunity_Source_CP__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpportunityType }
     *     
     */
    public void setOpportunity_Source_CP__R(OpportunityType value) {
        this.opportunitySourceCPR = value;
    }

    /**
     * Gets the value of the opportunity_Target_CP__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpportunity_Target_CP__C() {
        return opportunityTargetCPC;
    }

    /**
     * Sets the value of the opportunity_Target_CP__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpportunity_Target_CP__C(String value) {
        this.opportunityTargetCPC = value;
    }

    /**
     * Gets the value of the opportunity_Target_CP__R property.
     * 
     * @return
     *     possible object is
     *     {@link OpportunityType }
     *     
     */
    public OpportunityType getOpportunity_Target_CP__R() {
        return opportunityTargetCPR;
    }

    /**
     * Sets the value of the opportunity_Target_CP__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpportunityType }
     *     
     */
    public void setOpportunity_Target_CP__R(OpportunityType value) {
        this.opportunityTargetCPR = value;
    }

    /**
     * Gets the value of the override_Addr_City__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverride_Addr_City__C() {
        return overrideAddrCityC;
    }

    /**
     * Sets the value of the override_Addr_City__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverride_Addr_City__C(String value) {
        this.overrideAddrCityC = value;
    }

    /**
     * Gets the value of the override_Addr_Line1__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverride_Addr_Line1__C() {
        return overrideAddrLine1C;
    }

    /**
     * Sets the value of the override_Addr_Line1__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverride_Addr_Line1__C(String value) {
        this.overrideAddrLine1C = value;
    }

    /**
     * Gets the value of the override_Addr_Line2__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverride_Addr_Line2__C() {
        return overrideAddrLine2C;
    }

    /**
     * Sets the value of the override_Addr_Line2__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverride_Addr_Line2__C(String value) {
        this.overrideAddrLine2C = value;
    }

    /**
     * Gets the value of the override_Addr_Line3__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverride_Addr_Line3__C() {
        return overrideAddrLine3C;
    }

    /**
     * Sets the value of the override_Addr_Line3__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverride_Addr_Line3__C(String value) {
        this.overrideAddrLine3C = value;
    }

    /**
     * Gets the value of the override_Addr_State_Prov__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverride_Addr_State_Prov__C() {
        return overrideAddrStateProvC;
    }

    /**
     * Sets the value of the override_Addr_State_Prov__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverride_Addr_State_Prov__C(String value) {
        this.overrideAddrStateProvC = value;
    }

    /**
     * Gets the value of the override_Addr_Zipcode__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverride_Addr_Zipcode__C() {
        return overrideAddrZipcodeC;
    }

    /**
     * Sets the value of the override_Addr_Zipcode__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverride_Addr_Zipcode__C(String value) {
        this.overrideAddrZipcodeC = value;
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
     * Gets the value of the pack_By__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPack_By__C() {
        return packByC;
    }

    /**
     * Sets the value of the pack_By__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPack_By__C(String value) {
        this.packByC = value;
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
     * Gets the value of the purchase_Order__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchase_Order__C() {
        return purchaseOrderC;
    }

    /**
     * Sets the value of the purchase_Order__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchase_Order__C(String value) {
        this.purchaseOrderC = value;
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
     * Gets the value of the ship_Date_Option_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShip_Date_Option_Date__C() {
        return shipDateOptionDateC;
    }

    /**
     * Sets the value of the ship_Date_Option_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShip_Date_Option_Date__C(XMLGregorianCalendar value) {
        this.shipDateOptionDateC = value;
    }

    /**
     * Gets the value of the ship_Date_Option__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShip_Date_Option__C() {
        return shipDateOptionC;
    }

    /**
     * Sets the value of the ship_Date_Option__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShip_Date_Option__C(String value) {
        this.shipDateOptionC = value;
    }

    /**
     * Gets the value of the ship_To_SAP_Override__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShip_To_SAP_Override__C() {
        return shipToSAPOverrideC;
    }

    /**
     * Sets the value of the ship_To_SAP_Override__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShip_To_SAP_Override__C(String value) {
        this.shipToSAPOverrideC = value;
    }

    /**
     * Gets the value of the sold_To_SAP_Override__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSold_To_SAP_Override__C() {
        return soldToSAPOverrideC;
    }

    /**
     * Sets the value of the sold_To_SAP_Override__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSold_To_SAP_Override__C(String value) {
        this.soldToSAPOverrideC = value;
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

}
