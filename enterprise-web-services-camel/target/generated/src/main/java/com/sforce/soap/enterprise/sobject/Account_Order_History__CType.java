
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sforce.soap.enterprise.QueryResult;


/**
 * <p>Java class for Account_Order_History__c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Account_Order_History__c">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="AP_Display_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Account_Id__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Account_Id__r" type="{urn:sobject.enterprise.soap.sforce.com}Account" minOccurs="0"/>
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
 *         &lt;element name="Fiscal_Year__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hierarchy_Level_1_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hierarchy_Level_1__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hierarchy_Level_2_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hierarchy_Level_2__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hierarchy_Level_3_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hierarchy_Level_3__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hierarchy_Level_4_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hierarchy_Level_4__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hierarchy_Level_5_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hierarchy_Level_5__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISBN_13__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Impl_Amt__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Impl_Qty__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Key_Field__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="NotesAndAttachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="PID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProcessInstances" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ProcessSteps" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Product_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Profile_Parent_Account__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Profile_Parent_Account__r" type="{urn:sobject.enterprise.soap.sforce.com}Account" minOccurs="0"/>
 *         &lt;element name="Sale_Amt__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Sale_Qty__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Sample_Amt__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Sample_Qty__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Short_Product_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Ultimate_Parent_Account__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Ultimate_Parent_Account__r" type="{urn:sobject.enterprise.soap.sforce.com}Account" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Account_Order_History__c", propOrder = {
    "apDisplayNameC",
    "accountIdC",
    "accountIdR",
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
    "fiscalYearC",
    "hierarchyLevel1CodeC",
    "hierarchyLevel1C",
    "hierarchyLevel2CodeC",
    "hierarchyLevel2C",
    "hierarchyLevel3CodeC",
    "hierarchyLevel3C",
    "hierarchyLevel4CodeC",
    "hierarchyLevel4C",
    "hierarchyLevel5CodeC",
    "hierarchyLevel5C",
    "isbn13C",
    "implAmtC",
    "implQtyC",
    "isDeleted",
    "keyFieldC",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "name",
    "notes",
    "notesAndAttachments",
    "pidC",
    "processInstances",
    "processSteps",
    "productNameC",
    "profileParentAccountC",
    "profileParentAccountR",
    "saleAmtC",
    "saleQtyC",
    "sampleAmtC",
    "sampleQtyC",
    "shortProductCodeC",
    "systemModstamp",
    "ultimateParentAccountC",
    "ultimateParentAccountR"
})
public class Account_Order_History__CType
    extends SObjectType
{

    @XmlElement(name = "AP_Display_Name__c", nillable = true)
    protected String apDisplayNameC;
    @XmlElement(name = "Account_Id__c", nillable = true)
    protected String accountIdC;
    @XmlElement(name = "Account_Id__r", nillable = true)
    protected AccountType accountIdR;
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
    @XmlElement(name = "Fiscal_Year__c", nillable = true)
    protected String fiscalYearC;
    @XmlElement(name = "Hierarchy_Level_1_Code__c", nillable = true)
    protected String hierarchyLevel1CodeC;
    @XmlElement(name = "Hierarchy_Level_1__c", nillable = true)
    protected String hierarchyLevel1C;
    @XmlElement(name = "Hierarchy_Level_2_Code__c", nillable = true)
    protected String hierarchyLevel2CodeC;
    @XmlElement(name = "Hierarchy_Level_2__c", nillable = true)
    protected String hierarchyLevel2C;
    @XmlElement(name = "Hierarchy_Level_3_Code__c", nillable = true)
    protected String hierarchyLevel3CodeC;
    @XmlElement(name = "Hierarchy_Level_3__c", nillable = true)
    protected String hierarchyLevel3C;
    @XmlElement(name = "Hierarchy_Level_4_Code__c", nillable = true)
    protected String hierarchyLevel4CodeC;
    @XmlElement(name = "Hierarchy_Level_4__c", nillable = true)
    protected String hierarchyLevel4C;
    @XmlElement(name = "Hierarchy_Level_5_Code__c", nillable = true)
    protected String hierarchyLevel5CodeC;
    @XmlElement(name = "Hierarchy_Level_5__c", nillable = true)
    protected String hierarchyLevel5C;
    @XmlElement(name = "ISBN_13__c", nillable = true)
    protected String isbn13C;
    @XmlElement(name = "Impl_Amt__c", nillable = true)
    protected Double implAmtC;
    @XmlElement(name = "Impl_Qty__c", nillable = true)
    protected Double implQtyC;
    @XmlElement(name = "IsDeleted", nillable = true)
    protected Boolean isDeleted;
    @XmlElement(name = "Key_Field__c", nillable = true)
    protected String keyFieldC;
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
    @XmlElement(name = "PID__c", nillable = true)
    protected String pidC;
    @XmlElement(name = "ProcessInstances", nillable = true)
    protected QueryResult processInstances;
    @XmlElement(name = "ProcessSteps", nillable = true)
    protected QueryResult processSteps;
    @XmlElement(name = "Product_Name__c", nillable = true)
    protected String productNameC;
    @XmlElement(name = "Profile_Parent_Account__c", nillable = true)
    protected String profileParentAccountC;
    @XmlElement(name = "Profile_Parent_Account__r", nillable = true)
    protected AccountType profileParentAccountR;
    @XmlElement(name = "Sale_Amt__c", nillable = true)
    protected Double saleAmtC;
    @XmlElement(name = "Sale_Qty__c", nillable = true)
    protected Double saleQtyC;
    @XmlElement(name = "Sample_Amt__c", nillable = true)
    protected Double sampleAmtC;
    @XmlElement(name = "Sample_Qty__c", nillable = true)
    protected Double sampleQtyC;
    @XmlElement(name = "Short_Product_Code__c", nillable = true)
    protected String shortProductCodeC;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "Ultimate_Parent_Account__c", nillable = true)
    protected String ultimateParentAccountC;
    @XmlElement(name = "Ultimate_Parent_Account__r", nillable = true)
    protected AccountType ultimateParentAccountR;

    /**
     * Gets the value of the ap_Display_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAP_Display_Name__C() {
        return apDisplayNameC;
    }

    /**
     * Sets the value of the ap_Display_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAP_Display_Name__C(String value) {
        this.apDisplayNameC = value;
    }

    /**
     * Gets the value of the account_Id__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount_Id__C() {
        return accountIdC;
    }

    /**
     * Sets the value of the account_Id__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount_Id__C(String value) {
        this.accountIdC = value;
    }

    /**
     * Gets the value of the account_Id__R property.
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getAccount_Id__R() {
        return accountIdR;
    }

    /**
     * Sets the value of the account_Id__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setAccount_Id__R(AccountType value) {
        this.accountIdR = value;
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
     * Gets the value of the fiscal_Year__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiscal_Year__C() {
        return fiscalYearC;
    }

    /**
     * Sets the value of the fiscal_Year__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiscal_Year__C(String value) {
        this.fiscalYearC = value;
    }

    /**
     * Gets the value of the hierarchy_Level_1_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHierarchy_Level_1_Code__C() {
        return hierarchyLevel1CodeC;
    }

    /**
     * Sets the value of the hierarchy_Level_1_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHierarchy_Level_1_Code__C(String value) {
        this.hierarchyLevel1CodeC = value;
    }

    /**
     * Gets the value of the hierarchy_Level_1__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHierarchy_Level_1__C() {
        return hierarchyLevel1C;
    }

    /**
     * Sets the value of the hierarchy_Level_1__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHierarchy_Level_1__C(String value) {
        this.hierarchyLevel1C = value;
    }

    /**
     * Gets the value of the hierarchy_Level_2_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHierarchy_Level_2_Code__C() {
        return hierarchyLevel2CodeC;
    }

    /**
     * Sets the value of the hierarchy_Level_2_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHierarchy_Level_2_Code__C(String value) {
        this.hierarchyLevel2CodeC = value;
    }

    /**
     * Gets the value of the hierarchy_Level_2__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHierarchy_Level_2__C() {
        return hierarchyLevel2C;
    }

    /**
     * Sets the value of the hierarchy_Level_2__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHierarchy_Level_2__C(String value) {
        this.hierarchyLevel2C = value;
    }

    /**
     * Gets the value of the hierarchy_Level_3_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHierarchy_Level_3_Code__C() {
        return hierarchyLevel3CodeC;
    }

    /**
     * Sets the value of the hierarchy_Level_3_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHierarchy_Level_3_Code__C(String value) {
        this.hierarchyLevel3CodeC = value;
    }

    /**
     * Gets the value of the hierarchy_Level_3__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHierarchy_Level_3__C() {
        return hierarchyLevel3C;
    }

    /**
     * Sets the value of the hierarchy_Level_3__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHierarchy_Level_3__C(String value) {
        this.hierarchyLevel3C = value;
    }

    /**
     * Gets the value of the hierarchy_Level_4_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHierarchy_Level_4_Code__C() {
        return hierarchyLevel4CodeC;
    }

    /**
     * Sets the value of the hierarchy_Level_4_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHierarchy_Level_4_Code__C(String value) {
        this.hierarchyLevel4CodeC = value;
    }

    /**
     * Gets the value of the hierarchy_Level_4__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHierarchy_Level_4__C() {
        return hierarchyLevel4C;
    }

    /**
     * Sets the value of the hierarchy_Level_4__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHierarchy_Level_4__C(String value) {
        this.hierarchyLevel4C = value;
    }

    /**
     * Gets the value of the hierarchy_Level_5_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHierarchy_Level_5_Code__C() {
        return hierarchyLevel5CodeC;
    }

    /**
     * Sets the value of the hierarchy_Level_5_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHierarchy_Level_5_Code__C(String value) {
        this.hierarchyLevel5CodeC = value;
    }

    /**
     * Gets the value of the hierarchy_Level_5__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHierarchy_Level_5__C() {
        return hierarchyLevel5C;
    }

    /**
     * Sets the value of the hierarchy_Level_5__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHierarchy_Level_5__C(String value) {
        this.hierarchyLevel5C = value;
    }

    /**
     * Gets the value of the isbn_13__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISBN_13__C() {
        return isbn13C;
    }

    /**
     * Sets the value of the isbn_13__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISBN_13__C(String value) {
        this.isbn13C = value;
    }

    /**
     * Gets the value of the impl_Amt__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getImpl_Amt__C() {
        return implAmtC;
    }

    /**
     * Sets the value of the impl_Amt__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setImpl_Amt__C(Double value) {
        this.implAmtC = value;
    }

    /**
     * Gets the value of the impl_Qty__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getImpl_Qty__C() {
        return implQtyC;
    }

    /**
     * Sets the value of the impl_Qty__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setImpl_Qty__C(Double value) {
        this.implQtyC = value;
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
     * Gets the value of the key_Field__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey_Field__C() {
        return keyFieldC;
    }

    /**
     * Sets the value of the key_Field__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey_Field__C(String value) {
        this.keyFieldC = value;
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
     * Gets the value of the pid__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPID__C() {
        return pidC;
    }

    /**
     * Sets the value of the pid__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPID__C(String value) {
        this.pidC = value;
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
     * Gets the value of the product_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct_Name__C() {
        return productNameC;
    }

    /**
     * Sets the value of the product_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct_Name__C(String value) {
        this.productNameC = value;
    }

    /**
     * Gets the value of the profile_Parent_Account__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfile_Parent_Account__C() {
        return profileParentAccountC;
    }

    /**
     * Sets the value of the profile_Parent_Account__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfile_Parent_Account__C(String value) {
        this.profileParentAccountC = value;
    }

    /**
     * Gets the value of the profile_Parent_Account__R property.
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getProfile_Parent_Account__R() {
        return profileParentAccountR;
    }

    /**
     * Sets the value of the profile_Parent_Account__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setProfile_Parent_Account__R(AccountType value) {
        this.profileParentAccountR = value;
    }

    /**
     * Gets the value of the sale_Amt__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSale_Amt__C() {
        return saleAmtC;
    }

    /**
     * Sets the value of the sale_Amt__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSale_Amt__C(Double value) {
        this.saleAmtC = value;
    }

    /**
     * Gets the value of the sale_Qty__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSale_Qty__C() {
        return saleQtyC;
    }

    /**
     * Sets the value of the sale_Qty__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSale_Qty__C(Double value) {
        this.saleQtyC = value;
    }

    /**
     * Gets the value of the sample_Amt__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSample_Amt__C() {
        return sampleAmtC;
    }

    /**
     * Sets the value of the sample_Amt__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSample_Amt__C(Double value) {
        this.sampleAmtC = value;
    }

    /**
     * Gets the value of the sample_Qty__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSample_Qty__C() {
        return sampleQtyC;
    }

    /**
     * Sets the value of the sample_Qty__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSample_Qty__C(Double value) {
        this.sampleQtyC = value;
    }

    /**
     * Gets the value of the short_Product_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShort_Product_Code__C() {
        return shortProductCodeC;
    }

    /**
     * Sets the value of the short_Product_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShort_Product_Code__C(String value) {
        this.shortProductCodeC = value;
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
     * Gets the value of the ultimate_Parent_Account__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUltimate_Parent_Account__C() {
        return ultimateParentAccountC;
    }

    /**
     * Sets the value of the ultimate_Parent_Account__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUltimate_Parent_Account__C(String value) {
        this.ultimateParentAccountC = value;
    }

    /**
     * Gets the value of the ultimate_Parent_Account__R property.
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getUltimate_Parent_Account__R() {
        return ultimateParentAccountR;
    }

    /**
     * Sets the value of the ultimate_Parent_Account__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setUltimate_Parent_Account__R(AccountType value) {
        this.ultimateParentAccountR = value;
    }

}
