
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Territory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Territory">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="AccountAccessLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Back_Office_Territory_Flag__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CaseAccessLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactAccessLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="District_Description__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ForecastUserId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Ledger_Rep_Flag__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MayForecastManagerShare" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OpportunityAccessLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentTerritoryId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Primary_User_Id__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Primary_User_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RestrictOpportunityTransfer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SAP_Territory_Id__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TH_Level_1__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TH_Level_2__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TH_Level_3__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TH_Level_4__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Territory_Assignment_Description__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Territory_Year__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Territory", propOrder = {
    "accountAccessLevel",
    "backOfficeTerritoryFlagC",
    "caseAccessLevel",
    "contactAccessLevel",
    "description",
    "districtDescriptionC",
    "forecastUserId",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "ledgerRepFlagC",
    "mayForecastManagerShare",
    "name",
    "opportunityAccessLevel",
    "parentTerritoryId",
    "primaryUserIdC",
    "primaryUserNameC",
    "restrictOpportunityTransfer",
    "sapTerritoryIdC",
    "systemModstamp",
    "thLevel1C",
    "thLevel2C",
    "thLevel3C",
    "thLevel4C",
    "territoryAssignmentDescriptionC",
    "territoryYearC"
})
public class TerritoryType
    extends SObjectType
{

    @XmlElement(name = "AccountAccessLevel", nillable = true)
    protected String accountAccessLevel;
    @XmlElement(name = "Back_Office_Territory_Flag__c", nillable = true)
    protected Boolean backOfficeTerritoryFlagC;
    @XmlElement(name = "CaseAccessLevel", nillable = true)
    protected String caseAccessLevel;
    @XmlElement(name = "ContactAccessLevel", nillable = true)
    protected String contactAccessLevel;
    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "District_Description__c", nillable = true)
    protected String districtDescriptionC;
    @XmlElement(name = "ForecastUserId", nillable = true)
    protected String forecastUserId;
    @XmlElement(name = "LastModifiedBy", nillable = true)
    protected UserType lastModifiedBy;
    @XmlElement(name = "LastModifiedById", nillable = true)
    protected String lastModifiedById;
    @XmlElement(name = "LastModifiedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlElement(name = "Ledger_Rep_Flag__c", nillable = true)
    protected Boolean ledgerRepFlagC;
    @XmlElement(name = "MayForecastManagerShare", nillable = true)
    protected Boolean mayForecastManagerShare;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "OpportunityAccessLevel", nillable = true)
    protected String opportunityAccessLevel;
    @XmlElement(name = "ParentTerritoryId", nillable = true)
    protected String parentTerritoryId;
    @XmlElement(name = "Primary_User_Id__c", nillable = true)
    protected String primaryUserIdC;
    @XmlElement(name = "Primary_User_Name__c", nillable = true)
    protected String primaryUserNameC;
    @XmlElement(name = "RestrictOpportunityTransfer", nillable = true)
    protected Boolean restrictOpportunityTransfer;
    @XmlElement(name = "SAP_Territory_Id__c", nillable = true)
    protected String sapTerritoryIdC;
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
    @XmlElement(name = "Territory_Assignment_Description__c", nillable = true)
    protected String territoryAssignmentDescriptionC;
    @XmlElement(name = "Territory_Year__c", nillable = true)
    protected String territoryYearC;

    /**
     * Gets the value of the accountAccessLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountAccessLevel() {
        return accountAccessLevel;
    }

    /**
     * Sets the value of the accountAccessLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountAccessLevel(String value) {
        this.accountAccessLevel = value;
    }

    /**
     * Gets the value of the back_Office_Territory_Flag__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBack_Office_Territory_Flag__C() {
        return backOfficeTerritoryFlagC;
    }

    /**
     * Sets the value of the back_Office_Territory_Flag__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBack_Office_Territory_Flag__C(Boolean value) {
        this.backOfficeTerritoryFlagC = value;
    }

    /**
     * Gets the value of the caseAccessLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseAccessLevel() {
        return caseAccessLevel;
    }

    /**
     * Sets the value of the caseAccessLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseAccessLevel(String value) {
        this.caseAccessLevel = value;
    }

    /**
     * Gets the value of the contactAccessLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactAccessLevel() {
        return contactAccessLevel;
    }

    /**
     * Sets the value of the contactAccessLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactAccessLevel(String value) {
        this.contactAccessLevel = value;
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
     * Gets the value of the district_Description__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict_Description__C() {
        return districtDescriptionC;
    }

    /**
     * Sets the value of the district_Description__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict_Description__C(String value) {
        this.districtDescriptionC = value;
    }

    /**
     * Gets the value of the forecastUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForecastUserId() {
        return forecastUserId;
    }

    /**
     * Sets the value of the forecastUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForecastUserId(String value) {
        this.forecastUserId = value;
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
     * Gets the value of the ledger_Rep_Flag__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLedger_Rep_Flag__C() {
        return ledgerRepFlagC;
    }

    /**
     * Sets the value of the ledger_Rep_Flag__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLedger_Rep_Flag__C(Boolean value) {
        this.ledgerRepFlagC = value;
    }

    /**
     * Gets the value of the mayForecastManagerShare property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMayForecastManagerShare() {
        return mayForecastManagerShare;
    }

    /**
     * Sets the value of the mayForecastManagerShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMayForecastManagerShare(Boolean value) {
        this.mayForecastManagerShare = value;
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
     * Gets the value of the opportunityAccessLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpportunityAccessLevel() {
        return opportunityAccessLevel;
    }

    /**
     * Sets the value of the opportunityAccessLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpportunityAccessLevel(String value) {
        this.opportunityAccessLevel = value;
    }

    /**
     * Gets the value of the parentTerritoryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentTerritoryId() {
        return parentTerritoryId;
    }

    /**
     * Sets the value of the parentTerritoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentTerritoryId(String value) {
        this.parentTerritoryId = value;
    }

    /**
     * Gets the value of the primary_User_Id__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimary_User_Id__C() {
        return primaryUserIdC;
    }

    /**
     * Sets the value of the primary_User_Id__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimary_User_Id__C(String value) {
        this.primaryUserIdC = value;
    }

    /**
     * Gets the value of the primary_User_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimary_User_Name__C() {
        return primaryUserNameC;
    }

    /**
     * Sets the value of the primary_User_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimary_User_Name__C(String value) {
        this.primaryUserNameC = value;
    }

    /**
     * Gets the value of the restrictOpportunityTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestrictOpportunityTransfer() {
        return restrictOpportunityTransfer;
    }

    /**
     * Sets the value of the restrictOpportunityTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestrictOpportunityTransfer(Boolean value) {
        this.restrictOpportunityTransfer = value;
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
     * Gets the value of the territory_Assignment_Description__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerritory_Assignment_Description__C() {
        return territoryAssignmentDescriptionC;
    }

    /**
     * Sets the value of the territory_Assignment_Description__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerritory_Assignment_Description__C(String value) {
        this.territoryAssignmentDescriptionC = value;
    }

    /**
     * Gets the value of the territory_Year__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerritory_Year__C() {
        return territoryYearC;
    }

    /**
     * Sets the value of the territory_Year__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerritory_Year__C(String value) {
        this.territoryYearC = value;
    }

}
