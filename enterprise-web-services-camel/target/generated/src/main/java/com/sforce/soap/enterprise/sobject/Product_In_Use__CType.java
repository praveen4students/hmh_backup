
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sforce.soap.enterprise.QueryResult;


/**
 * <p>Java class for Product_In_Use__c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Product_In_Use__c">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="Account__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Account__r" type="{urn:sobject.enterprise.soap.sforce.com}Account" minOccurs="0"/>
 *         &lt;element name="Attachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ConnectionReceived" type="{urn:sobject.enterprise.soap.sforce.com}PartnerNetworkConnection" minOccurs="0"/>
 *         &lt;element name="ConnectionReceivedId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ConnectionSent" type="{urn:sobject.enterprise.soap.sforce.com}PartnerNetworkConnection" minOccurs="0"/>
 *         &lt;element name="ConnectionSentId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Division" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="FeedSubscriptionsForEntity" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="GP_PHL_Code_1__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GP_PHL_Code_4__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="General_Year__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_PHL_Code_1__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_PHL_Code_4__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Intervention_Amount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Intervention_Year__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="NotesAndAttachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="PHL_Code_2__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PHL_Code_3__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PH_Code_1_Lookup__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="PH_Code_1_Lookup__r" type="{urn:sobject.enterprise.soap.sforce.com}Product_In_Use_Hierarchy__c" minOccurs="0"/>
 *         &lt;element name="PH_Code_3_Lookup__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="PH_Code_3_Lookup__r" type="{urn:sobject.enterprise.soap.sforce.com}Product_In_Use_Hierarchy__c" minOccurs="0"/>
 *         &lt;element name="PH_Code_4_Lookup__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="PH_Code_4_Lookup__r" type="{urn:sobject.enterprise.soap.sforce.com}Product_In_Use_Hierarchy__c" minOccurs="0"/>
 *         &lt;element name="PIU_Notes__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProcessInstances" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ProcessSteps" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="School_type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "Product_In_Use__c", propOrder = {
    "accountC",
    "accountR",
    "attachments",
    "connectionReceived",
    "connectionReceivedId",
    "connectionSent",
    "connectionSentId",
    "createdBy",
    "createdById",
    "createdDate",
    "division",
    "feedSubscriptionsForEntity",
    "gpPHLCode1C",
    "gpPHLCode4C",
    "generalYearC",
    "ipPHLCode1C",
    "ipPHLCode4C",
    "interventionAmountC",
    "interventionYearC",
    "isDeleted",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "name",
    "notes",
    "notesAndAttachments",
    "phlCode2C",
    "phlCode3C",
    "phCode1LookupC",
    "phCode1LookupR",
    "phCode3LookupC",
    "phCode3LookupR",
    "phCode4LookupC",
    "phCode4LookupR",
    "piuNotesC",
    "processInstances",
    "processSteps",
    "schoolTypeC",
    "systemModstamp"
})
public class Product_In_Use__CType
    extends SObjectType
{

    @XmlElement(name = "Account__c", nillable = true)
    protected String accountC;
    @XmlElement(name = "Account__r", nillable = true)
    protected AccountType accountR;
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
    @XmlElement(name = "Division", nillable = true)
    protected String division;
    @XmlElement(name = "FeedSubscriptionsForEntity", nillable = true)
    protected QueryResult feedSubscriptionsForEntity;
    @XmlElement(name = "GP_PHL_Code_1__c", nillable = true)
    protected String gpPHLCode1C;
    @XmlElement(name = "GP_PHL_Code_4__c", nillable = true)
    protected String gpPHLCode4C;
    @XmlElement(name = "General_Year__c", nillable = true)
    protected String generalYearC;
    @XmlElement(name = "IP_PHL_Code_1__c", nillable = true)
    protected String ipPHLCode1C;
    @XmlElement(name = "IP_PHL_Code_4__c", nillable = true)
    protected String ipPHLCode4C;
    @XmlElement(name = "Intervention_Amount__c", nillable = true)
    protected Double interventionAmountC;
    @XmlElement(name = "Intervention_Year__c", nillable = true)
    protected String interventionYearC;
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
    @XmlElement(name = "PHL_Code_2__c", nillable = true)
    protected String phlCode2C;
    @XmlElement(name = "PHL_Code_3__c", nillable = true)
    protected String phlCode3C;
    @XmlElement(name = "PH_Code_1_Lookup__c", nillable = true)
    protected String phCode1LookupC;
    @XmlElement(name = "PH_Code_1_Lookup__r", nillable = true)
    protected Product_In_Use_Hierarchy__CType phCode1LookupR;
    @XmlElement(name = "PH_Code_3_Lookup__c", nillable = true)
    protected String phCode3LookupC;
    @XmlElement(name = "PH_Code_3_Lookup__r", nillable = true)
    protected Product_In_Use_Hierarchy__CType phCode3LookupR;
    @XmlElement(name = "PH_Code_4_Lookup__c", nillable = true)
    protected String phCode4LookupC;
    @XmlElement(name = "PH_Code_4_Lookup__r", nillable = true)
    protected Product_In_Use_Hierarchy__CType phCode4LookupR;
    @XmlElement(name = "PIU_Notes__c", nillable = true)
    protected String piuNotesC;
    @XmlElement(name = "ProcessInstances", nillable = true)
    protected QueryResult processInstances;
    @XmlElement(name = "ProcessSteps", nillable = true)
    protected QueryResult processSteps;
    @XmlElement(name = "School_type__c", nillable = true)
    protected String schoolTypeC;
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
     * Gets the value of the gp_PHL_Code_1__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGP_PHL_Code_1__C() {
        return gpPHLCode1C;
    }

    /**
     * Sets the value of the gp_PHL_Code_1__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGP_PHL_Code_1__C(String value) {
        this.gpPHLCode1C = value;
    }

    /**
     * Gets the value of the gp_PHL_Code_4__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGP_PHL_Code_4__C() {
        return gpPHLCode4C;
    }

    /**
     * Sets the value of the gp_PHL_Code_4__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGP_PHL_Code_4__C(String value) {
        this.gpPHLCode4C = value;
    }

    /**
     * Gets the value of the general_Year__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneral_Year__C() {
        return generalYearC;
    }

    /**
     * Sets the value of the general_Year__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneral_Year__C(String value) {
        this.generalYearC = value;
    }

    /**
     * Gets the value of the ip_PHL_Code_1__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIP_PHL_Code_1__C() {
        return ipPHLCode1C;
    }

    /**
     * Sets the value of the ip_PHL_Code_1__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIP_PHL_Code_1__C(String value) {
        this.ipPHLCode1C = value;
    }

    /**
     * Gets the value of the ip_PHL_Code_4__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIP_PHL_Code_4__C() {
        return ipPHLCode4C;
    }

    /**
     * Sets the value of the ip_PHL_Code_4__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIP_PHL_Code_4__C(String value) {
        this.ipPHLCode4C = value;
    }

    /**
     * Gets the value of the intervention_Amount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getIntervention_Amount__C() {
        return interventionAmountC;
    }

    /**
     * Sets the value of the intervention_Amount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setIntervention_Amount__C(Double value) {
        this.interventionAmountC = value;
    }

    /**
     * Gets the value of the intervention_Year__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntervention_Year__C() {
        return interventionYearC;
    }

    /**
     * Sets the value of the intervention_Year__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntervention_Year__C(String value) {
        this.interventionYearC = value;
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
     * Gets the value of the phl_Code_2__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPHL_Code_2__C() {
        return phlCode2C;
    }

    /**
     * Sets the value of the phl_Code_2__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPHL_Code_2__C(String value) {
        this.phlCode2C = value;
    }

    /**
     * Gets the value of the phl_Code_3__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPHL_Code_3__C() {
        return phlCode3C;
    }

    /**
     * Sets the value of the phl_Code_3__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPHL_Code_3__C(String value) {
        this.phlCode3C = value;
    }

    /**
     * Gets the value of the ph_Code_1_Lookup__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPH_Code_1_Lookup__C() {
        return phCode1LookupC;
    }

    /**
     * Sets the value of the ph_Code_1_Lookup__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPH_Code_1_Lookup__C(String value) {
        this.phCode1LookupC = value;
    }

    /**
     * Gets the value of the ph_Code_1_Lookup__R property.
     * 
     * @return
     *     possible object is
     *     {@link Product_In_Use_Hierarchy__CType }
     *     
     */
    public Product_In_Use_Hierarchy__CType getPH_Code_1_Lookup__R() {
        return phCode1LookupR;
    }

    /**
     * Sets the value of the ph_Code_1_Lookup__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product_In_Use_Hierarchy__CType }
     *     
     */
    public void setPH_Code_1_Lookup__R(Product_In_Use_Hierarchy__CType value) {
        this.phCode1LookupR = value;
    }

    /**
     * Gets the value of the ph_Code_3_Lookup__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPH_Code_3_Lookup__C() {
        return phCode3LookupC;
    }

    /**
     * Sets the value of the ph_Code_3_Lookup__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPH_Code_3_Lookup__C(String value) {
        this.phCode3LookupC = value;
    }

    /**
     * Gets the value of the ph_Code_3_Lookup__R property.
     * 
     * @return
     *     possible object is
     *     {@link Product_In_Use_Hierarchy__CType }
     *     
     */
    public Product_In_Use_Hierarchy__CType getPH_Code_3_Lookup__R() {
        return phCode3LookupR;
    }

    /**
     * Sets the value of the ph_Code_3_Lookup__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product_In_Use_Hierarchy__CType }
     *     
     */
    public void setPH_Code_3_Lookup__R(Product_In_Use_Hierarchy__CType value) {
        this.phCode3LookupR = value;
    }

    /**
     * Gets the value of the ph_Code_4_Lookup__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPH_Code_4_Lookup__C() {
        return phCode4LookupC;
    }

    /**
     * Sets the value of the ph_Code_4_Lookup__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPH_Code_4_Lookup__C(String value) {
        this.phCode4LookupC = value;
    }

    /**
     * Gets the value of the ph_Code_4_Lookup__R property.
     * 
     * @return
     *     possible object is
     *     {@link Product_In_Use_Hierarchy__CType }
     *     
     */
    public Product_In_Use_Hierarchy__CType getPH_Code_4_Lookup__R() {
        return phCode4LookupR;
    }

    /**
     * Sets the value of the ph_Code_4_Lookup__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product_In_Use_Hierarchy__CType }
     *     
     */
    public void setPH_Code_4_Lookup__R(Product_In_Use_Hierarchy__CType value) {
        this.phCode4LookupR = value;
    }

    /**
     * Gets the value of the piu_Notes__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIU_Notes__C() {
        return piuNotesC;
    }

    /**
     * Sets the value of the piu_Notes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIU_Notes__C(String value) {
        this.piuNotesC = value;
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
     * Gets the value of the school_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchool_Type__C() {
        return schoolTypeC;
    }

    /**
     * Sets the value of the school_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchool_Type__C(String value) {
        this.schoolTypeC = value;
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
