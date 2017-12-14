
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sforce.soap.enterprise.QueryResult;


/**
 * <p>Java class for OIR__c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OIR__c">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="Account_Executive__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Account_Executive__r" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="Account__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Account__r" type="{urn:sobject.enterprise.soap.sforce.com}Account" minOccurs="0"/>
 *         &lt;element name="ActivityHistories" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Address__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="City__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConnectionReceived" type="{urn:sobject.enterprise.soap.sforce.com}PartnerNetworkConnection" minOccurs="0"/>
 *         &lt;element name="ConnectionReceivedId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ConnectionSent" type="{urn:sobject.enterprise.soap.sforce.com}PartnerNetworkConnection" minOccurs="0"/>
 *         &lt;element name="ConnectionSentId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Country__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Curriculum_Contact__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Curriculum_Contact__r" type="{urn:sobject.enterprise.soap.sforce.com}Contact" minOccurs="0"/>
 *         &lt;element name="Customer_PO__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Customer_Price_Comments__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Customer_Price_Recognized__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Customer_Price_Remaining__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Customer_Price__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Date_Purchased__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Division" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Events" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="FeedSubscriptionsForEntity" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LT_Assets1__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="LT_Assets__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="LastActivityDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="NotesAndAttachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="OIRs__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="OpenActivities" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Parent_Account__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Parent_Account__r" type="{urn:sobject.enterprise.soap.sforce.com}Account" minOccurs="0"/>
 *         &lt;element name="Parent_OIR__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Parent_OIR__r" type="{urn:sobject.enterprise.soap.sforce.com}OIR__c" minOccurs="0"/>
 *         &lt;element name="ProcessInstances" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ProcessSteps" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Related_Opportunity__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Related_Opportunity__r" type="{urn:sobject.enterprise.soap.sforce.com}Opportunity" minOccurs="0"/>
 *         &lt;element name="Reseller__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAP_Customer_Number__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAP_Order_Number__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAP_Sales_Number__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sales_Rep__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Sales_Rep__r" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="Site_Readiness_Form_Received__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Site__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Special_Instructions__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Tasks" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Technical_Contact__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Technical_Contact__r" type="{urn:sobject.enterprise.soap.sforce.com}Contact" minOccurs="0"/>
 *         &lt;element name="Training_Planning_Contact__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Training_Planning_Contact__r" type="{urn:sobject.enterprise.soap.sforce.com}Contact" minOccurs="0"/>
 *         &lt;element name="Zip__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OIR__c", propOrder = {
    "accountExecutiveC",
    "accountExecutiveR",
    "accountC",
    "accountR",
    "activityHistories",
    "addressC",
    "attachments",
    "cityC",
    "connectionReceived",
    "connectionReceivedId",
    "connectionSent",
    "connectionSentId",
    "countryC",
    "createdBy",
    "createdById",
    "createdDate",
    "curriculumContactC",
    "curriculumContactR",
    "customerPOC",
    "customerPriceCommentsC",
    "customerPriceRecognizedC",
    "customerPriceRemainingC",
    "customerPriceC",
    "datePurchasedC",
    "division",
    "events",
    "feedSubscriptionsForEntity",
    "isDeleted",
    "ltAssets1R",
    "ltAssetsR",
    "lastActivityDate",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "name",
    "notes",
    "notesAndAttachments",
    "oiRsR",
    "openActivities",
    "parentAccountC",
    "parentAccountR",
    "parentOIRC",
    "parentOIRR",
    "processInstances",
    "processSteps",
    "relatedOpportunityC",
    "relatedOpportunityR",
    "resellerC",
    "sapCustomerNumberC",
    "sapOrderNumberC",
    "sapSalesNumberC",
    "salesRepC",
    "salesRepR",
    "siteReadinessFormReceivedC",
    "siteC",
    "specialInstructionsC",
    "stateC",
    "systemModstamp",
    "tasks",
    "technicalContactC",
    "technicalContactR",
    "trainingPlanningContactC",
    "trainingPlanningContactR",
    "zipC"
})
public class OIR__CType
    extends SObjectType
{

    @XmlElement(name = "Account_Executive__c", nillable = true)
    protected String accountExecutiveC;
    @XmlElement(name = "Account_Executive__r", nillable = true)
    protected UserType accountExecutiveR;
    @XmlElement(name = "Account__c", nillable = true)
    protected String accountC;
    @XmlElement(name = "Account__r", nillable = true)
    protected AccountType accountR;
    @XmlElement(name = "ActivityHistories", nillable = true)
    protected QueryResult activityHistories;
    @XmlElement(name = "Address__c", nillable = true)
    protected String addressC;
    @XmlElement(name = "Attachments", nillable = true)
    protected QueryResult attachments;
    @XmlElement(name = "City__c", nillable = true)
    protected String cityC;
    @XmlElement(name = "ConnectionReceived", nillable = true)
    protected PartnerNetworkConnectionType connectionReceived;
    @XmlElement(name = "ConnectionReceivedId", nillable = true)
    protected String connectionReceivedId;
    @XmlElement(name = "ConnectionSent", nillable = true)
    protected PartnerNetworkConnectionType connectionSent;
    @XmlElement(name = "ConnectionSentId", nillable = true)
    protected String connectionSentId;
    @XmlElement(name = "Country__c", nillable = true)
    protected String countryC;
    @XmlElement(name = "CreatedBy", nillable = true)
    protected UserType createdBy;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "Curriculum_Contact__c", nillable = true)
    protected String curriculumContactC;
    @XmlElement(name = "Curriculum_Contact__r", nillable = true)
    protected ContactType curriculumContactR;
    @XmlElement(name = "Customer_PO__c", nillable = true)
    protected String customerPOC;
    @XmlElement(name = "Customer_Price_Comments__c", nillable = true)
    protected String customerPriceCommentsC;
    @XmlElement(name = "Customer_Price_Recognized__c", nillable = true)
    protected Double customerPriceRecognizedC;
    @XmlElement(name = "Customer_Price_Remaining__c", nillable = true)
    protected Double customerPriceRemainingC;
    @XmlElement(name = "Customer_Price__c", nillable = true)
    protected Double customerPriceC;
    @XmlElement(name = "Date_Purchased__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datePurchasedC;
    @XmlElement(name = "Division", nillable = true)
    protected String division;
    @XmlElement(name = "Events", nillable = true)
    protected QueryResult events;
    @XmlElement(name = "FeedSubscriptionsForEntity", nillable = true)
    protected QueryResult feedSubscriptionsForEntity;
    @XmlElement(name = "IsDeleted", nillable = true)
    protected Boolean isDeleted;
    @XmlElement(name = "LT_Assets1__r", nillable = true)
    protected QueryResult ltAssets1R;
    @XmlElement(name = "LT_Assets__r", nillable = true)
    protected QueryResult ltAssetsR;
    @XmlElement(name = "LastActivityDate", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastActivityDate;
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
    @XmlElement(name = "OIRs__r", nillable = true)
    protected QueryResult oiRsR;
    @XmlElement(name = "OpenActivities", nillable = true)
    protected QueryResult openActivities;
    @XmlElement(name = "Parent_Account__c", nillable = true)
    protected String parentAccountC;
    @XmlElement(name = "Parent_Account__r", nillable = true)
    protected AccountType parentAccountR;
    @XmlElement(name = "Parent_OIR__c", nillable = true)
    protected String parentOIRC;
    @XmlElement(name = "Parent_OIR__r", nillable = true)
    protected OIR__CType parentOIRR;
    @XmlElement(name = "ProcessInstances", nillable = true)
    protected QueryResult processInstances;
    @XmlElement(name = "ProcessSteps", nillable = true)
    protected QueryResult processSteps;
    @XmlElement(name = "Related_Opportunity__c", nillable = true)
    protected String relatedOpportunityC;
    @XmlElement(name = "Related_Opportunity__r", nillable = true)
    protected OpportunityType relatedOpportunityR;
    @XmlElement(name = "Reseller__c", nillable = true)
    protected String resellerC;
    @XmlElement(name = "SAP_Customer_Number__c", nillable = true)
    protected String sapCustomerNumberC;
    @XmlElement(name = "SAP_Order_Number__c", nillable = true)
    protected String sapOrderNumberC;
    @XmlElement(name = "SAP_Sales_Number__c", nillable = true)
    protected String sapSalesNumberC;
    @XmlElement(name = "Sales_Rep__c", nillable = true)
    protected String salesRepC;
    @XmlElement(name = "Sales_Rep__r", nillable = true)
    protected UserType salesRepR;
    @XmlElement(name = "Site_Readiness_Form_Received__c", nillable = true)
    protected String siteReadinessFormReceivedC;
    @XmlElement(name = "Site__c", nillable = true)
    protected String siteC;
    @XmlElement(name = "Special_Instructions__c", nillable = true)
    protected String specialInstructionsC;
    @XmlElement(name = "State__c", nillable = true)
    protected String stateC;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "Tasks", nillable = true)
    protected QueryResult tasks;
    @XmlElement(name = "Technical_Contact__c", nillable = true)
    protected String technicalContactC;
    @XmlElement(name = "Technical_Contact__r", nillable = true)
    protected ContactType technicalContactR;
    @XmlElement(name = "Training_Planning_Contact__c", nillable = true)
    protected String trainingPlanningContactC;
    @XmlElement(name = "Training_Planning_Contact__r", nillable = true)
    protected ContactType trainingPlanningContactR;
    @XmlElement(name = "Zip__c", nillable = true)
    protected String zipC;

    /**
     * Gets the value of the account_Executive__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount_Executive__C() {
        return accountExecutiveC;
    }

    /**
     * Sets the value of the account_Executive__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount_Executive__C(String value) {
        this.accountExecutiveC = value;
    }

    /**
     * Gets the value of the account_Executive__R property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getAccount_Executive__R() {
        return accountExecutiveR;
    }

    /**
     * Sets the value of the account_Executive__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setAccount_Executive__R(UserType value) {
        this.accountExecutiveR = value;
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
     * Gets the value of the address__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress__C() {
        return addressC;
    }

    /**
     * Sets the value of the address__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress__C(String value) {
        this.addressC = value;
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
     * Gets the value of the city__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity__C() {
        return cityC;
    }

    /**
     * Sets the value of the city__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity__C(String value) {
        this.cityC = value;
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
     * Gets the value of the country__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry__C() {
        return countryC;
    }

    /**
     * Sets the value of the country__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry__C(String value) {
        this.countryC = value;
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
     * Gets the value of the curriculum_Contact__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurriculum_Contact__C() {
        return curriculumContactC;
    }

    /**
     * Sets the value of the curriculum_Contact__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurriculum_Contact__C(String value) {
        this.curriculumContactC = value;
    }

    /**
     * Gets the value of the curriculum_Contact__R property.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getCurriculum_Contact__R() {
        return curriculumContactR;
    }

    /**
     * Sets the value of the curriculum_Contact__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setCurriculum_Contact__R(ContactType value) {
        this.curriculumContactR = value;
    }

    /**
     * Gets the value of the customer_PO__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomer_PO__C() {
        return customerPOC;
    }

    /**
     * Sets the value of the customer_PO__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomer_PO__C(String value) {
        this.customerPOC = value;
    }

    /**
     * Gets the value of the customer_Price_Comments__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomer_Price_Comments__C() {
        return customerPriceCommentsC;
    }

    /**
     * Sets the value of the customer_Price_Comments__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomer_Price_Comments__C(String value) {
        this.customerPriceCommentsC = value;
    }

    /**
     * Gets the value of the customer_Price_Recognized__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCustomer_Price_Recognized__C() {
        return customerPriceRecognizedC;
    }

    /**
     * Sets the value of the customer_Price_Recognized__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCustomer_Price_Recognized__C(Double value) {
        this.customerPriceRecognizedC = value;
    }

    /**
     * Gets the value of the customer_Price_Remaining__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCustomer_Price_Remaining__C() {
        return customerPriceRemainingC;
    }

    /**
     * Sets the value of the customer_Price_Remaining__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCustomer_Price_Remaining__C(Double value) {
        this.customerPriceRemainingC = value;
    }

    /**
     * Gets the value of the customer_Price__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCustomer_Price__C() {
        return customerPriceC;
    }

    /**
     * Sets the value of the customer_Price__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCustomer_Price__C(Double value) {
        this.customerPriceC = value;
    }

    /**
     * Gets the value of the date_Purchased__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate_Purchased__C() {
        return datePurchasedC;
    }

    /**
     * Sets the value of the date_Purchased__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate_Purchased__C(XMLGregorianCalendar value) {
        this.datePurchasedC = value;
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
     * Gets the value of the lt_Assets1__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getLT_Assets1__R() {
        return ltAssets1R;
    }

    /**
     * Sets the value of the lt_Assets1__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setLT_Assets1__R(QueryResult value) {
        this.ltAssets1R = value;
    }

    /**
     * Gets the value of the lt_Assets__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getLT_Assets__R() {
        return ltAssetsR;
    }

    /**
     * Sets the value of the lt_Assets__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setLT_Assets__R(QueryResult value) {
        this.ltAssetsR = value;
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
     * Gets the value of the oiRs__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getOIRs__R() {
        return oiRsR;
    }

    /**
     * Sets the value of the oiRs__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setOIRs__R(QueryResult value) {
        this.oiRsR = value;
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
     * Gets the value of the parent_Account__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParent_Account__C() {
        return parentAccountC;
    }

    /**
     * Sets the value of the parent_Account__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParent_Account__C(String value) {
        this.parentAccountC = value;
    }

    /**
     * Gets the value of the parent_Account__R property.
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getParent_Account__R() {
        return parentAccountR;
    }

    /**
     * Sets the value of the parent_Account__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setParent_Account__R(AccountType value) {
        this.parentAccountR = value;
    }

    /**
     * Gets the value of the parent_OIR__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParent_OIR__C() {
        return parentOIRC;
    }

    /**
     * Sets the value of the parent_OIR__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParent_OIR__C(String value) {
        this.parentOIRC = value;
    }

    /**
     * Gets the value of the parent_OIR__R property.
     * 
     * @return
     *     possible object is
     *     {@link OIR__CType }
     *     
     */
    public OIR__CType getParent_OIR__R() {
        return parentOIRR;
    }

    /**
     * Sets the value of the parent_OIR__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link OIR__CType }
     *     
     */
    public void setParent_OIR__R(OIR__CType value) {
        this.parentOIRR = value;
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
     * Gets the value of the related_Opportunity__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelated_Opportunity__C() {
        return relatedOpportunityC;
    }

    /**
     * Sets the value of the related_Opportunity__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelated_Opportunity__C(String value) {
        this.relatedOpportunityC = value;
    }

    /**
     * Gets the value of the related_Opportunity__R property.
     * 
     * @return
     *     possible object is
     *     {@link OpportunityType }
     *     
     */
    public OpportunityType getRelated_Opportunity__R() {
        return relatedOpportunityR;
    }

    /**
     * Sets the value of the related_Opportunity__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpportunityType }
     *     
     */
    public void setRelated_Opportunity__R(OpportunityType value) {
        this.relatedOpportunityR = value;
    }

    /**
     * Gets the value of the reseller__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReseller__C() {
        return resellerC;
    }

    /**
     * Sets the value of the reseller__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReseller__C(String value) {
        this.resellerC = value;
    }

    /**
     * Gets the value of the sap_Customer_Number__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAP_Customer_Number__C() {
        return sapCustomerNumberC;
    }

    /**
     * Sets the value of the sap_Customer_Number__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAP_Customer_Number__C(String value) {
        this.sapCustomerNumberC = value;
    }

    /**
     * Gets the value of the sap_Order_Number__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAP_Order_Number__C() {
        return sapOrderNumberC;
    }

    /**
     * Sets the value of the sap_Order_Number__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAP_Order_Number__C(String value) {
        this.sapOrderNumberC = value;
    }

    /**
     * Gets the value of the sap_Sales_Number__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAP_Sales_Number__C() {
        return sapSalesNumberC;
    }

    /**
     * Sets the value of the sap_Sales_Number__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAP_Sales_Number__C(String value) {
        this.sapSalesNumberC = value;
    }

    /**
     * Gets the value of the sales_Rep__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSales_Rep__C() {
        return salesRepC;
    }

    /**
     * Sets the value of the sales_Rep__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSales_Rep__C(String value) {
        this.salesRepC = value;
    }

    /**
     * Gets the value of the sales_Rep__R property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getSales_Rep__R() {
        return salesRepR;
    }

    /**
     * Sets the value of the sales_Rep__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setSales_Rep__R(UserType value) {
        this.salesRepR = value;
    }

    /**
     * Gets the value of the site_Readiness_Form_Received__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSite_Readiness_Form_Received__C() {
        return siteReadinessFormReceivedC;
    }

    /**
     * Sets the value of the site_Readiness_Form_Received__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSite_Readiness_Form_Received__C(String value) {
        this.siteReadinessFormReceivedC = value;
    }

    /**
     * Gets the value of the site__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSite__C() {
        return siteC;
    }

    /**
     * Sets the value of the site__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSite__C(String value) {
        this.siteC = value;
    }

    /**
     * Gets the value of the special_Instructions__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecial_Instructions__C() {
        return specialInstructionsC;
    }

    /**
     * Sets the value of the special_Instructions__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecial_Instructions__C(String value) {
        this.specialInstructionsC = value;
    }

    /**
     * Gets the value of the state__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState__C() {
        return stateC;
    }

    /**
     * Sets the value of the state__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState__C(String value) {
        this.stateC = value;
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
     * Gets the value of the technical_Contact__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnical_Contact__C() {
        return technicalContactC;
    }

    /**
     * Sets the value of the technical_Contact__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnical_Contact__C(String value) {
        this.technicalContactC = value;
    }

    /**
     * Gets the value of the technical_Contact__R property.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getTechnical_Contact__R() {
        return technicalContactR;
    }

    /**
     * Sets the value of the technical_Contact__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setTechnical_Contact__R(ContactType value) {
        this.technicalContactR = value;
    }

    /**
     * Gets the value of the training_Planning_Contact__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraining_Planning_Contact__C() {
        return trainingPlanningContactC;
    }

    /**
     * Sets the value of the training_Planning_Contact__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraining_Planning_Contact__C(String value) {
        this.trainingPlanningContactC = value;
    }

    /**
     * Gets the value of the training_Planning_Contact__R property.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getTraining_Planning_Contact__R() {
        return trainingPlanningContactR;
    }

    /**
     * Sets the value of the training_Planning_Contact__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setTraining_Planning_Contact__R(ContactType value) {
        this.trainingPlanningContactR = value;
    }

    /**
     * Gets the value of the zip__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZip__C() {
        return zipC;
    }

    /**
     * Sets the value of the zip__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZip__C(String value) {
        this.zipC = value;
    }

}
