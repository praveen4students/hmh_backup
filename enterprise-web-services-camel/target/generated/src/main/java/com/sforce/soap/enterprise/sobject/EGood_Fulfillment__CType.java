
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sforce.soap.enterprise.QueryResult;


/**
 * <p>Java class for EGood_Fulfillment__c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EGood_Fulfillment__c">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="Account__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Account__r" type="{urn:sobject.enterprise.soap.sforce.com}Account" minOccurs="0"/>
 *         &lt;element name="Attachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Back_Office_Order__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConnectionReceived" type="{urn:sobject.enterprise.soap.sforce.com}PartnerNetworkConnection" minOccurs="0"/>
 *         &lt;element name="ConnectionReceivedId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ConnectionSent" type="{urn:sobject.enterprise.soap.sforce.com}PartnerNetworkConnection" minOccurs="0"/>
 *         &lt;element name="ConnectionSentId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EGood_Indicator__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeedSubscriptionsForEntity" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ISBN__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Legacy_Product_Id__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Line_Number__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Material_Description__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Net_Price__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="NotesAndAttachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Opportunity__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Opportunity__r" type="{urn:sobject.enterprise.soap.sforce.com}Opportunity" minOccurs="0"/>
 *         &lt;element name="Original_Invoice_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Owner" type="{urn:sobject.enterprise.soap.sforce.com}Name" minOccurs="0"/>
 *         &lt;element name="OwnerId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="PO_Number__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProcessInstances" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ProcessSteps" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Product__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Product__r" type="{urn:sobject.enterprise.soap.sforce.com}Product2" minOccurs="0"/>
 *         &lt;element name="Quantity__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Ship_To_Addr_Zipcode__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ship_To_Customer_Email__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ship_to_Addr_City__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ship_to_Addr_Line1__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ship_to_Addr_State__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ship_to_Customer_ID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ship_to_Customer_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sold_To_Customer_Email__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sold_to_Customer_ID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sold_to_Customer_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "EGood_Fulfillment__c", propOrder = {
    "accountC",
    "accountR",
    "attachments",
    "backOfficeOrderC",
    "connectionReceived",
    "connectionReceivedId",
    "connectionSent",
    "connectionSentId",
    "createdBy",
    "createdById",
    "createdDate",
    "eGoodIndicatorC",
    "feedSubscriptionsForEntity",
    "isbnC",
    "isDeleted",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "legacyProductIdC",
    "lineNumberC",
    "materialDescriptionC",
    "name",
    "netPriceC",
    "notes",
    "notesAndAttachments",
    "opportunityC",
    "opportunityR",
    "originalInvoiceDateC",
    "owner",
    "ownerId",
    "poNumberC",
    "processInstances",
    "processSteps",
    "productC",
    "productR",
    "quantityC",
    "shipToAddrZipcodeC",
    "shipToCustomerEmailC",
    "shipToAddrCityC",
    "shipToAddrLine1C",
    "shipToAddrStateC",
    "shipToCustomerIDC",
    "shipToCustomerNameC",
    "soldToCustomerEmailC",
    "soldToCustomerIDC",
    "soldToCustomerNameC",
    "systemModstamp"
})
public class EGood_Fulfillment__CType
    extends SObjectType
{

    @XmlElement(name = "Account__c", nillable = true)
    protected String accountC;
    @XmlElement(name = "Account__r", nillable = true)
    protected AccountType accountR;
    @XmlElement(name = "Attachments", nillable = true)
    protected QueryResult attachments;
    @XmlElement(name = "Back_Office_Order__c", nillable = true)
    protected String backOfficeOrderC;
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
    @XmlElement(name = "EGood_Indicator__c", nillable = true)
    protected String eGoodIndicatorC;
    @XmlElement(name = "FeedSubscriptionsForEntity", nillable = true)
    protected QueryResult feedSubscriptionsForEntity;
    @XmlElement(name = "ISBN__c", nillable = true)
    protected String isbnC;
    @XmlElement(name = "IsDeleted", nillable = true)
    protected Boolean isDeleted;
    @XmlElement(name = "LastModifiedBy", nillable = true)
    protected UserType lastModifiedBy;
    @XmlElement(name = "LastModifiedById", nillable = true)
    protected String lastModifiedById;
    @XmlElement(name = "LastModifiedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlElement(name = "Legacy_Product_Id__c", nillable = true)
    protected String legacyProductIdC;
    @XmlElement(name = "Line_Number__c", nillable = true)
    protected Double lineNumberC;
    @XmlElement(name = "Material_Description__c", nillable = true)
    protected String materialDescriptionC;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "Net_Price__c", nillable = true)
    protected Double netPriceC;
    @XmlElement(name = "Notes", nillable = true)
    protected QueryResult notes;
    @XmlElement(name = "NotesAndAttachments", nillable = true)
    protected QueryResult notesAndAttachments;
    @XmlElement(name = "Opportunity__c", nillable = true)
    protected String opportunityC;
    @XmlElement(name = "Opportunity__r", nillable = true)
    protected OpportunityType opportunityR;
    @XmlElement(name = "Original_Invoice_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar originalInvoiceDateC;
    @XmlElement(name = "Owner", nillable = true)
    protected NameType owner;
    @XmlElement(name = "OwnerId", nillable = true)
    protected String ownerId;
    @XmlElement(name = "PO_Number__c", nillable = true)
    protected String poNumberC;
    @XmlElement(name = "ProcessInstances", nillable = true)
    protected QueryResult processInstances;
    @XmlElement(name = "ProcessSteps", nillable = true)
    protected QueryResult processSteps;
    @XmlElement(name = "Product__c", nillable = true)
    protected String productC;
    @XmlElement(name = "Product__r", nillable = true)
    protected Product2Type productR;
    @XmlElement(name = "Quantity__c", nillable = true)
    protected Double quantityC;
    @XmlElement(name = "Ship_To_Addr_Zipcode__c", nillable = true)
    protected String shipToAddrZipcodeC;
    @XmlElement(name = "Ship_To_Customer_Email__c", nillable = true)
    protected String shipToCustomerEmailC;
    @XmlElement(name = "Ship_to_Addr_City__c", nillable = true)
    protected String shipToAddrCityC;
    @XmlElement(name = "Ship_to_Addr_Line1__c", nillable = true)
    protected String shipToAddrLine1C;
    @XmlElement(name = "Ship_to_Addr_State__c", nillable = true)
    protected String shipToAddrStateC;
    @XmlElement(name = "Ship_to_Customer_ID__c", nillable = true)
    protected String shipToCustomerIDC;
    @XmlElement(name = "Ship_to_Customer_Name__c", nillable = true)
    protected String shipToCustomerNameC;
    @XmlElement(name = "Sold_To_Customer_Email__c", nillable = true)
    protected String soldToCustomerEmailC;
    @XmlElement(name = "Sold_to_Customer_ID__c", nillable = true)
    protected String soldToCustomerIDC;
    @XmlElement(name = "Sold_to_Customer_Name__c", nillable = true)
    protected String soldToCustomerNameC;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;

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
     * Gets the value of the back_Office_Order__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBack_Office_Order__C() {
        return backOfficeOrderC;
    }

    /**
     * Sets the value of the back_Office_Order__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBack_Office_Order__C(String value) {
        this.backOfficeOrderC = value;
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
     * Gets the value of the eGood_Indicator__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEGood_Indicator__C() {
        return eGoodIndicatorC;
    }

    /**
     * Sets the value of the eGood_Indicator__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEGood_Indicator__C(String value) {
        this.eGoodIndicatorC = value;
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
     * Gets the value of the isbn__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISBN__C() {
        return isbnC;
    }

    /**
     * Sets the value of the isbn__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISBN__C(String value) {
        this.isbnC = value;
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
     * Gets the value of the legacy_Product_Id__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegacy_Product_Id__C() {
        return legacyProductIdC;
    }

    /**
     * Sets the value of the legacy_Product_Id__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegacy_Product_Id__C(String value) {
        this.legacyProductIdC = value;
    }

    /**
     * Gets the value of the line_Number__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLine_Number__C() {
        return lineNumberC;
    }

    /**
     * Sets the value of the line_Number__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLine_Number__C(Double value) {
        this.lineNumberC = value;
    }

    /**
     * Gets the value of the material_Description__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterial_Description__C() {
        return materialDescriptionC;
    }

    /**
     * Sets the value of the material_Description__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterial_Description__C(String value) {
        this.materialDescriptionC = value;
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
     * Gets the value of the net_Price__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNet_Price__C() {
        return netPriceC;
    }

    /**
     * Sets the value of the net_Price__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNet_Price__C(Double value) {
        this.netPriceC = value;
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
     * Gets the value of the opportunity__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpportunity__C() {
        return opportunityC;
    }

    /**
     * Sets the value of the opportunity__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpportunity__C(String value) {
        this.opportunityC = value;
    }

    /**
     * Gets the value of the opportunity__R property.
     * 
     * @return
     *     possible object is
     *     {@link OpportunityType }
     *     
     */
    public OpportunityType getOpportunity__R() {
        return opportunityR;
    }

    /**
     * Sets the value of the opportunity__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpportunityType }
     *     
     */
    public void setOpportunity__R(OpportunityType value) {
        this.opportunityR = value;
    }

    /**
     * Gets the value of the original_Invoice_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOriginal_Invoice_Date__C() {
        return originalInvoiceDateC;
    }

    /**
     * Sets the value of the original_Invoice_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOriginal_Invoice_Date__C(XMLGregorianCalendar value) {
        this.originalInvoiceDateC = value;
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
     * Gets the value of the po_Number__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPO_Number__C() {
        return poNumberC;
    }

    /**
     * Sets the value of the po_Number__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPO_Number__C(String value) {
        this.poNumberC = value;
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
     * Gets the value of the product__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct__C() {
        return productC;
    }

    /**
     * Sets the value of the product__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct__C(String value) {
        this.productC = value;
    }

    /**
     * Gets the value of the product__R property.
     * 
     * @return
     *     possible object is
     *     {@link Product2Type }
     *     
     */
    public Product2Type getProduct__R() {
        return productR;
    }

    /**
     * Sets the value of the product__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product2Type }
     *     
     */
    public void setProduct__R(Product2Type value) {
        this.productR = value;
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
     * Gets the value of the ship_To_Addr_Zipcode__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShip_To_Addr_Zipcode__C() {
        return shipToAddrZipcodeC;
    }

    /**
     * Sets the value of the ship_To_Addr_Zipcode__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShip_To_Addr_Zipcode__C(String value) {
        this.shipToAddrZipcodeC = value;
    }

    /**
     * Gets the value of the ship_To_Customer_Email__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShip_To_Customer_Email__C() {
        return shipToCustomerEmailC;
    }

    /**
     * Sets the value of the ship_To_Customer_Email__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShip_To_Customer_Email__C(String value) {
        this.shipToCustomerEmailC = value;
    }

    /**
     * Gets the value of the ship_To_Addr_City__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShip_To_Addr_City__C() {
        return shipToAddrCityC;
    }

    /**
     * Sets the value of the ship_To_Addr_City__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShip_To_Addr_City__C(String value) {
        this.shipToAddrCityC = value;
    }

    /**
     * Gets the value of the ship_To_Addr_Line1__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShip_To_Addr_Line1__C() {
        return shipToAddrLine1C;
    }

    /**
     * Sets the value of the ship_To_Addr_Line1__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShip_To_Addr_Line1__C(String value) {
        this.shipToAddrLine1C = value;
    }

    /**
     * Gets the value of the ship_To_Addr_State__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShip_To_Addr_State__C() {
        return shipToAddrStateC;
    }

    /**
     * Sets the value of the ship_To_Addr_State__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShip_To_Addr_State__C(String value) {
        this.shipToAddrStateC = value;
    }

    /**
     * Gets the value of the ship_To_Customer_ID__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShip_To_Customer_ID__C() {
        return shipToCustomerIDC;
    }

    /**
     * Sets the value of the ship_To_Customer_ID__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShip_To_Customer_ID__C(String value) {
        this.shipToCustomerIDC = value;
    }

    /**
     * Gets the value of the ship_To_Customer_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShip_To_Customer_Name__C() {
        return shipToCustomerNameC;
    }

    /**
     * Sets the value of the ship_To_Customer_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShip_To_Customer_Name__C(String value) {
        this.shipToCustomerNameC = value;
    }

    /**
     * Gets the value of the sold_To_Customer_Email__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSold_To_Customer_Email__C() {
        return soldToCustomerEmailC;
    }

    /**
     * Sets the value of the sold_To_Customer_Email__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSold_To_Customer_Email__C(String value) {
        this.soldToCustomerEmailC = value;
    }

    /**
     * Gets the value of the sold_To_Customer_ID__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSold_To_Customer_ID__C() {
        return soldToCustomerIDC;
    }

    /**
     * Sets the value of the sold_To_Customer_ID__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSold_To_Customer_ID__C(String value) {
        this.soldToCustomerIDC = value;
    }

    /**
     * Gets the value of the sold_To_Customer_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSold_To_Customer_Name__C() {
        return soldToCustomerNameC;
    }

    /**
     * Sets the value of the sold_To_Customer_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSold_To_Customer_Name__C(String value) {
        this.soldToCustomerNameC = value;
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
