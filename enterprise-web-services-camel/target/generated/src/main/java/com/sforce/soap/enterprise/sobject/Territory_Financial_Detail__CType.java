
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sforce.soap.enterprise.QueryResult;


/**
 * <p>Java class for Territory_Financial_Detail__c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Territory_Financial_Detail__c">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="Account__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Account__r" type="{urn:sobject.enterprise.soap.sforce.com}Account" minOccurs="0"/>
 *         &lt;element name="AdValue__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Attachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ConnectionReceived" type="{urn:sobject.enterprise.soap.sforce.com}PartnerNetworkConnection" minOccurs="0"/>
 *         &lt;element name="ConnectionReceivedId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ConnectionSent" type="{urn:sobject.enterprise.soap.sforce.com}PartnerNetworkConnection" minOccurs="0"/>
 *         &lt;element name="ConnectionSentId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DataDate__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DataTime__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dept__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="District_Account__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="District_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Estimated_Residual_Revenue__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="FIN_Territory_Budget__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="FIN_Territory_Fcst_1__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="FIN_Territory_Fcst_2__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="FIN_Territory_Fcst_3__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="FIN_Territory_Fcst_4__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="FeedSubscriptionsForEntity" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Freight_YTD_Amount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Freight__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Histories" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Implementation_Approval_Budget_PCT__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Implementation_Budget__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Implementation_Open__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Implementation_YTD_Cost_shipped__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Losses__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Net_Sales_Quota__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="NotesAndAttachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="OWNER_ID__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="OWNER_ID__r" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="OpenAd__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="OpenOrd__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Owner" type="{urn:sobject.enterprise.soap.sforce.com}Name" minOccurs="0"/>
 *         &lt;element name="OwnerId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Pilot_Approval_Budget_PCT__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Pilot_Budget__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Pilot_Open__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Pilot_YTD_Cost_shipped__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PostpAd__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ProcessInstances" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ProcessSteps" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Region__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RepName__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAP_Territory_Id__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sales_Budget__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Sales_Open__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Sales_YTD_Amount_shipped__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Sales__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Sample_Approval_Budget_PCT__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Sample_Budget__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Sample_Open__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Sample_YTD_Cost_shipped__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Shares" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="SlsOpenFr__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SlswWins__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SlswoWins__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TH_Level_1__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TH_Level_2__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TH_Level_3__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TH_Level_4__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Variance__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Wins_With_Out_Sales__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Wins__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="WinswoSls__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="WinwSls__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Territory_Financial_Detail__c", propOrder = {
    "accountC",
    "accountR",
    "adValueC",
    "attachments",
    "connectionReceived",
    "connectionReceivedId",
    "connectionSent",
    "connectionSentId",
    "createdBy",
    "createdById",
    "createdDate",
    "dataDateC",
    "dataTimeC",
    "deptC",
    "districtAccountC",
    "districtNameC",
    "estimatedResidualRevenueC",
    "finTerritoryBudgetC",
    "finTerritoryFcst1C",
    "finTerritoryFcst2C",
    "finTerritoryFcst3C",
    "finTerritoryFcst4C",
    "feedSubscriptionsForEntity",
    "freightYTDAmountC",
    "freightC",
    "histories",
    "implementationApprovalBudgetPCTC",
    "implementationBudgetC",
    "implementationOpenC",
    "implementationYTDCostShippedC",
    "isDeleted",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "lossesC",
    "name",
    "netSalesQuotaC",
    "notes",
    "notesAndAttachments",
    "ownerIDC",
    "ownerIDR",
    "openAdC",
    "openOrdC",
    "owner",
    "ownerId",
    "pilotApprovalBudgetPCTC",
    "pilotBudgetC",
    "pilotOpenC",
    "pilotYTDCostShippedC",
    "postpAdC",
    "processInstances",
    "processSteps",
    "regionC",
    "repNameC",
    "sapTerritoryIdC",
    "salesBudgetC",
    "salesOpenC",
    "salesYTDAmountShippedC",
    "salesC",
    "sampleApprovalBudgetPCTC",
    "sampleBudgetC",
    "sampleOpenC",
    "sampleYTDCostShippedC",
    "shares",
    "slsOpenFrC",
    "slswWinsC",
    "slswoWinsC",
    "systemModstamp",
    "thLevel1C",
    "thLevel2C",
    "thLevel3C",
    "thLevel4C",
    "varianceC",
    "winsWithOutSalesC",
    "winsC",
    "winswoSlsC",
    "winwSlsC"
})
public class Territory_Financial_Detail__CType
    extends SObjectType
{

    @XmlElement(name = "Account__c", nillable = true)
    protected String accountC;
    @XmlElement(name = "Account__r", nillable = true)
    protected AccountType accountR;
    @XmlElement(name = "AdValue__c", nillable = true)
    protected Double adValueC;
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
    @XmlElement(name = "DataDate__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataDateC;
    @XmlElement(name = "DataTime__c", nillable = true)
    protected String dataTimeC;
    @XmlElement(name = "Dept__c", nillable = true)
    protected String deptC;
    @XmlElement(name = "District_Account__c", nillable = true)
    protected String districtAccountC;
    @XmlElement(name = "District_Name__c", nillable = true)
    protected String districtNameC;
    @XmlElement(name = "Estimated_Residual_Revenue__c", nillable = true)
    protected Double estimatedResidualRevenueC;
    @XmlElement(name = "FIN_Territory_Budget__c", nillable = true)
    protected Double finTerritoryBudgetC;
    @XmlElement(name = "FIN_Territory_Fcst_1__c", nillable = true)
    protected Double finTerritoryFcst1C;
    @XmlElement(name = "FIN_Territory_Fcst_2__c", nillable = true)
    protected Double finTerritoryFcst2C;
    @XmlElement(name = "FIN_Territory_Fcst_3__c", nillable = true)
    protected Double finTerritoryFcst3C;
    @XmlElement(name = "FIN_Territory_Fcst_4__c", nillable = true)
    protected Double finTerritoryFcst4C;
    @XmlElement(name = "FeedSubscriptionsForEntity", nillable = true)
    protected QueryResult feedSubscriptionsForEntity;
    @XmlElement(name = "Freight_YTD_Amount__c", nillable = true)
    protected Double freightYTDAmountC;
    @XmlElement(name = "Freight__c", nillable = true)
    protected Double freightC;
    @XmlElement(name = "Histories", nillable = true)
    protected QueryResult histories;
    @XmlElement(name = "Implementation_Approval_Budget_PCT__c", nillable = true)
    protected Double implementationApprovalBudgetPCTC;
    @XmlElement(name = "Implementation_Budget__c", nillable = true)
    protected Double implementationBudgetC;
    @XmlElement(name = "Implementation_Open__c", nillable = true)
    protected Double implementationOpenC;
    @XmlElement(name = "Implementation_YTD_Cost_shipped__c", nillable = true)
    protected Double implementationYTDCostShippedC;
    @XmlElement(name = "IsDeleted", nillable = true)
    protected Boolean isDeleted;
    @XmlElement(name = "LastModifiedBy", nillable = true)
    protected UserType lastModifiedBy;
    @XmlElement(name = "LastModifiedById", nillable = true)
    protected String lastModifiedById;
    @XmlElement(name = "LastModifiedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlElement(name = "Losses__c", nillable = true)
    protected Double lossesC;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "Net_Sales_Quota__c", nillable = true)
    protected Double netSalesQuotaC;
    @XmlElement(name = "Notes", nillable = true)
    protected QueryResult notes;
    @XmlElement(name = "NotesAndAttachments", nillable = true)
    protected QueryResult notesAndAttachments;
    @XmlElement(name = "OWNER_ID__c", nillable = true)
    protected String ownerIDC;
    @XmlElement(name = "OWNER_ID__r", nillable = true)
    protected UserType ownerIDR;
    @XmlElement(name = "OpenAd__c", nillable = true)
    protected Double openAdC;
    @XmlElement(name = "OpenOrd__c", nillable = true)
    protected Double openOrdC;
    @XmlElement(name = "Owner", nillable = true)
    protected NameType owner;
    @XmlElement(name = "OwnerId", nillable = true)
    protected String ownerId;
    @XmlElement(name = "Pilot_Approval_Budget_PCT__c", nillable = true)
    protected Double pilotApprovalBudgetPCTC;
    @XmlElement(name = "Pilot_Budget__c", nillable = true)
    protected Double pilotBudgetC;
    @XmlElement(name = "Pilot_Open__c", nillable = true)
    protected Double pilotOpenC;
    @XmlElement(name = "Pilot_YTD_Cost_shipped__c", nillable = true)
    protected Double pilotYTDCostShippedC;
    @XmlElement(name = "PostpAd__c", nillable = true)
    protected Double postpAdC;
    @XmlElement(name = "ProcessInstances", nillable = true)
    protected QueryResult processInstances;
    @XmlElement(name = "ProcessSteps", nillable = true)
    protected QueryResult processSteps;
    @XmlElement(name = "Region__c", nillable = true)
    protected String regionC;
    @XmlElement(name = "RepName__c", nillable = true)
    protected String repNameC;
    @XmlElement(name = "SAP_Territory_Id__c", nillable = true)
    protected String sapTerritoryIdC;
    @XmlElement(name = "Sales_Budget__c", nillable = true)
    protected Double salesBudgetC;
    @XmlElement(name = "Sales_Open__c", nillable = true)
    protected Double salesOpenC;
    @XmlElement(name = "Sales_YTD_Amount_shipped__c", nillable = true)
    protected Double salesYTDAmountShippedC;
    @XmlElement(name = "Sales__c", nillable = true)
    protected Double salesC;
    @XmlElement(name = "Sample_Approval_Budget_PCT__c", nillable = true)
    protected Double sampleApprovalBudgetPCTC;
    @XmlElement(name = "Sample_Budget__c", nillable = true)
    protected Double sampleBudgetC;
    @XmlElement(name = "Sample_Open__c", nillable = true)
    protected Double sampleOpenC;
    @XmlElement(name = "Sample_YTD_Cost_shipped__c", nillable = true)
    protected Double sampleYTDCostShippedC;
    @XmlElement(name = "Shares", nillable = true)
    protected QueryResult shares;
    @XmlElement(name = "SlsOpenFr__c", nillable = true)
    protected Double slsOpenFrC;
    @XmlElement(name = "SlswWins__c", nillable = true)
    protected Double slswWinsC;
    @XmlElement(name = "SlswoWins__c", nillable = true)
    protected Double slswoWinsC;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "TH_Level_1__c", nillable = true)
    protected String thLevel1C;
    @XmlElement(name = "TH_Level_2__c", nillable = true)
    protected String thLevel2C;
    @XmlElement(name = "TH_Level_3__c", nillable = true)
    protected String thLevel3C;
    @XmlElement(name = "TH_Level_4__c", nillable = true)
    protected String thLevel4C;
    @XmlElement(name = "Variance__c", nillable = true)
    protected Double varianceC;
    @XmlElement(name = "Wins_With_Out_Sales__c", nillable = true)
    protected Double winsWithOutSalesC;
    @XmlElement(name = "Wins__c", nillable = true)
    protected Double winsC;
    @XmlElement(name = "WinswoSls__c", nillable = true)
    protected Double winswoSlsC;
    @XmlElement(name = "WinwSls__c", nillable = true)
    protected Double winwSlsC;

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
     * Gets the value of the adValue__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAdValue__C() {
        return adValueC;
    }

    /**
     * Sets the value of the adValue__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAdValue__C(Double value) {
        this.adValueC = value;
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
     * Gets the value of the dataDate__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataDate__C() {
        return dataDateC;
    }

    /**
     * Sets the value of the dataDate__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataDate__C(XMLGregorianCalendar value) {
        this.dataDateC = value;
    }

    /**
     * Gets the value of the dataTime__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataTime__C() {
        return dataTimeC;
    }

    /**
     * Sets the value of the dataTime__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataTime__C(String value) {
        this.dataTimeC = value;
    }

    /**
     * Gets the value of the dept__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDept__C() {
        return deptC;
    }

    /**
     * Sets the value of the dept__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDept__C(String value) {
        this.deptC = value;
    }

    /**
     * Gets the value of the district_Account__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict_Account__C() {
        return districtAccountC;
    }

    /**
     * Sets the value of the district_Account__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict_Account__C(String value) {
        this.districtAccountC = value;
    }

    /**
     * Gets the value of the district_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict_Name__C() {
        return districtNameC;
    }

    /**
     * Sets the value of the district_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict_Name__C(String value) {
        this.districtNameC = value;
    }

    /**
     * Gets the value of the estimated_Residual_Revenue__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEstimated_Residual_Revenue__C() {
        return estimatedResidualRevenueC;
    }

    /**
     * Sets the value of the estimated_Residual_Revenue__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEstimated_Residual_Revenue__C(Double value) {
        this.estimatedResidualRevenueC = value;
    }

    /**
     * Gets the value of the fin_Territory_Budget__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFIN_Territory_Budget__C() {
        return finTerritoryBudgetC;
    }

    /**
     * Sets the value of the fin_Territory_Budget__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFIN_Territory_Budget__C(Double value) {
        this.finTerritoryBudgetC = value;
    }

    /**
     * Gets the value of the fin_Territory_Fcst_1__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFIN_Territory_Fcst_1__C() {
        return finTerritoryFcst1C;
    }

    /**
     * Sets the value of the fin_Territory_Fcst_1__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFIN_Territory_Fcst_1__C(Double value) {
        this.finTerritoryFcst1C = value;
    }

    /**
     * Gets the value of the fin_Territory_Fcst_2__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFIN_Territory_Fcst_2__C() {
        return finTerritoryFcst2C;
    }

    /**
     * Sets the value of the fin_Territory_Fcst_2__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFIN_Territory_Fcst_2__C(Double value) {
        this.finTerritoryFcst2C = value;
    }

    /**
     * Gets the value of the fin_Territory_Fcst_3__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFIN_Territory_Fcst_3__C() {
        return finTerritoryFcst3C;
    }

    /**
     * Sets the value of the fin_Territory_Fcst_3__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFIN_Territory_Fcst_3__C(Double value) {
        this.finTerritoryFcst3C = value;
    }

    /**
     * Gets the value of the fin_Territory_Fcst_4__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFIN_Territory_Fcst_4__C() {
        return finTerritoryFcst4C;
    }

    /**
     * Sets the value of the fin_Territory_Fcst_4__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFIN_Territory_Fcst_4__C(Double value) {
        this.finTerritoryFcst4C = value;
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
     * Gets the value of the freight_YTD_Amount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFreight_YTD_Amount__C() {
        return freightYTDAmountC;
    }

    /**
     * Sets the value of the freight_YTD_Amount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFreight_YTD_Amount__C(Double value) {
        this.freightYTDAmountC = value;
    }

    /**
     * Gets the value of the freight__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFreight__C() {
        return freightC;
    }

    /**
     * Sets the value of the freight__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFreight__C(Double value) {
        this.freightC = value;
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
     * Gets the value of the implementation_Approval_Budget_PCT__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getImplementation_Approval_Budget_PCT__C() {
        return implementationApprovalBudgetPCTC;
    }

    /**
     * Sets the value of the implementation_Approval_Budget_PCT__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setImplementation_Approval_Budget_PCT__C(Double value) {
        this.implementationApprovalBudgetPCTC = value;
    }

    /**
     * Gets the value of the implementation_Budget__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getImplementation_Budget__C() {
        return implementationBudgetC;
    }

    /**
     * Sets the value of the implementation_Budget__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setImplementation_Budget__C(Double value) {
        this.implementationBudgetC = value;
    }

    /**
     * Gets the value of the implementation_Open__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getImplementation_Open__C() {
        return implementationOpenC;
    }

    /**
     * Sets the value of the implementation_Open__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setImplementation_Open__C(Double value) {
        this.implementationOpenC = value;
    }

    /**
     * Gets the value of the implementation_YTD_Cost_Shipped__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getImplementation_YTD_Cost_Shipped__C() {
        return implementationYTDCostShippedC;
    }

    /**
     * Sets the value of the implementation_YTD_Cost_Shipped__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setImplementation_YTD_Cost_Shipped__C(Double value) {
        this.implementationYTDCostShippedC = value;
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
     * Gets the value of the losses__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLosses__C() {
        return lossesC;
    }

    /**
     * Sets the value of the losses__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLosses__C(Double value) {
        this.lossesC = value;
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
     * Gets the value of the net_Sales_Quota__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNet_Sales_Quota__C() {
        return netSalesQuotaC;
    }

    /**
     * Sets the value of the net_Sales_Quota__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNet_Sales_Quota__C(Double value) {
        this.netSalesQuotaC = value;
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
     * Gets the value of the owner_ID__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOWNER_ID__C() {
        return ownerIDC;
    }

    /**
     * Sets the value of the owner_ID__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOWNER_ID__C(String value) {
        this.ownerIDC = value;
    }

    /**
     * Gets the value of the owner_ID__R property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getOWNER_ID__R() {
        return ownerIDR;
    }

    /**
     * Sets the value of the owner_ID__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setOWNER_ID__R(UserType value) {
        this.ownerIDR = value;
    }

    /**
     * Gets the value of the openAd__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOpenAd__C() {
        return openAdC;
    }

    /**
     * Sets the value of the openAd__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOpenAd__C(Double value) {
        this.openAdC = value;
    }

    /**
     * Gets the value of the openOrd__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOpenOrd__C() {
        return openOrdC;
    }

    /**
     * Sets the value of the openOrd__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOpenOrd__C(Double value) {
        this.openOrdC = value;
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
     * Gets the value of the pilot_Approval_Budget_PCT__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPilot_Approval_Budget_PCT__C() {
        return pilotApprovalBudgetPCTC;
    }

    /**
     * Sets the value of the pilot_Approval_Budget_PCT__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPilot_Approval_Budget_PCT__C(Double value) {
        this.pilotApprovalBudgetPCTC = value;
    }

    /**
     * Gets the value of the pilot_Budget__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPilot_Budget__C() {
        return pilotBudgetC;
    }

    /**
     * Sets the value of the pilot_Budget__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPilot_Budget__C(Double value) {
        this.pilotBudgetC = value;
    }

    /**
     * Gets the value of the pilot_Open__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPilot_Open__C() {
        return pilotOpenC;
    }

    /**
     * Sets the value of the pilot_Open__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPilot_Open__C(Double value) {
        this.pilotOpenC = value;
    }

    /**
     * Gets the value of the pilot_YTD_Cost_Shipped__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPilot_YTD_Cost_Shipped__C() {
        return pilotYTDCostShippedC;
    }

    /**
     * Sets the value of the pilot_YTD_Cost_Shipped__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPilot_YTD_Cost_Shipped__C(Double value) {
        this.pilotYTDCostShippedC = value;
    }

    /**
     * Gets the value of the postpAd__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPostpAd__C() {
        return postpAdC;
    }

    /**
     * Sets the value of the postpAd__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPostpAd__C(Double value) {
        this.postpAdC = value;
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
     * Gets the value of the region__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion__C() {
        return regionC;
    }

    /**
     * Sets the value of the region__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion__C(String value) {
        this.regionC = value;
    }

    /**
     * Gets the value of the repName__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepName__C() {
        return repNameC;
    }

    /**
     * Sets the value of the repName__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepName__C(String value) {
        this.repNameC = value;
    }

    /**
     * Gets the value of the sap_Territory_Id__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAP_Territory_Id__C() {
        return sapTerritoryIdC;
    }

    /**
     * Sets the value of the sap_Territory_Id__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAP_Territory_Id__C(String value) {
        this.sapTerritoryIdC = value;
    }

    /**
     * Gets the value of the sales_Budget__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSales_Budget__C() {
        return salesBudgetC;
    }

    /**
     * Sets the value of the sales_Budget__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSales_Budget__C(Double value) {
        this.salesBudgetC = value;
    }

    /**
     * Gets the value of the sales_Open__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSales_Open__C() {
        return salesOpenC;
    }

    /**
     * Sets the value of the sales_Open__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSales_Open__C(Double value) {
        this.salesOpenC = value;
    }

    /**
     * Gets the value of the sales_YTD_Amount_Shipped__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSales_YTD_Amount_Shipped__C() {
        return salesYTDAmountShippedC;
    }

    /**
     * Sets the value of the sales_YTD_Amount_Shipped__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSales_YTD_Amount_Shipped__C(Double value) {
        this.salesYTDAmountShippedC = value;
    }

    /**
     * Gets the value of the sales__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSales__C() {
        return salesC;
    }

    /**
     * Sets the value of the sales__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSales__C(Double value) {
        this.salesC = value;
    }

    /**
     * Gets the value of the sample_Approval_Budget_PCT__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSample_Approval_Budget_PCT__C() {
        return sampleApprovalBudgetPCTC;
    }

    /**
     * Sets the value of the sample_Approval_Budget_PCT__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSample_Approval_Budget_PCT__C(Double value) {
        this.sampleApprovalBudgetPCTC = value;
    }

    /**
     * Gets the value of the sample_Budget__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSample_Budget__C() {
        return sampleBudgetC;
    }

    /**
     * Sets the value of the sample_Budget__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSample_Budget__C(Double value) {
        this.sampleBudgetC = value;
    }

    /**
     * Gets the value of the sample_Open__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSample_Open__C() {
        return sampleOpenC;
    }

    /**
     * Sets the value of the sample_Open__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSample_Open__C(Double value) {
        this.sampleOpenC = value;
    }

    /**
     * Gets the value of the sample_YTD_Cost_Shipped__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSample_YTD_Cost_Shipped__C() {
        return sampleYTDCostShippedC;
    }

    /**
     * Sets the value of the sample_YTD_Cost_Shipped__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSample_YTD_Cost_Shipped__C(Double value) {
        this.sampleYTDCostShippedC = value;
    }

    /**
     * Gets the value of the shares property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getShares() {
        return shares;
    }

    /**
     * Sets the value of the shares property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setShares(QueryResult value) {
        this.shares = value;
    }

    /**
     * Gets the value of the slsOpenFr__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSlsOpenFr__C() {
        return slsOpenFrC;
    }

    /**
     * Sets the value of the slsOpenFr__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSlsOpenFr__C(Double value) {
        this.slsOpenFrC = value;
    }

    /**
     * Gets the value of the slswWins__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSlswWins__C() {
        return slswWinsC;
    }

    /**
     * Sets the value of the slswWins__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSlswWins__C(Double value) {
        this.slswWinsC = value;
    }

    /**
     * Gets the value of the slswoWins__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSlswoWins__C() {
        return slswoWinsC;
    }

    /**
     * Sets the value of the slswoWins__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSlswoWins__C(Double value) {
        this.slswoWinsC = value;
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
     * Gets the value of the th_Level_1__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTH_Level_1__C() {
        return thLevel1C;
    }

    /**
     * Sets the value of the th_Level_1__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTH_Level_1__C(String value) {
        this.thLevel1C = value;
    }

    /**
     * Gets the value of the th_Level_2__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTH_Level_2__C() {
        return thLevel2C;
    }

    /**
     * Sets the value of the th_Level_2__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTH_Level_2__C(String value) {
        this.thLevel2C = value;
    }

    /**
     * Gets the value of the th_Level_3__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTH_Level_3__C() {
        return thLevel3C;
    }

    /**
     * Sets the value of the th_Level_3__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTH_Level_3__C(String value) {
        this.thLevel3C = value;
    }

    /**
     * Gets the value of the th_Level_4__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTH_Level_4__C() {
        return thLevel4C;
    }

    /**
     * Sets the value of the th_Level_4__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTH_Level_4__C(String value) {
        this.thLevel4C = value;
    }

    /**
     * Gets the value of the variance__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVariance__C() {
        return varianceC;
    }

    /**
     * Sets the value of the variance__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVariance__C(Double value) {
        this.varianceC = value;
    }

    /**
     * Gets the value of the wins_With_Out_Sales__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWins_With_Out_Sales__C() {
        return winsWithOutSalesC;
    }

    /**
     * Sets the value of the wins_With_Out_Sales__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWins_With_Out_Sales__C(Double value) {
        this.winsWithOutSalesC = value;
    }

    /**
     * Gets the value of the wins__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWins__C() {
        return winsC;
    }

    /**
     * Sets the value of the wins__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWins__C(Double value) {
        this.winsC = value;
    }

    /**
     * Gets the value of the winswoSls__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWinswoSls__C() {
        return winswoSlsC;
    }

    /**
     * Sets the value of the winswoSls__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWinswoSls__C(Double value) {
        this.winswoSlsC = value;
    }

    /**
     * Gets the value of the winwSls__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWinwSls__C() {
        return winwSlsC;
    }

    /**
     * Sets the value of the winwSls__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWinwSls__C(Double value) {
        this.winwSlsC = value;
    }

}
