
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Organization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ComplianceBccEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DefaultAccountAccess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DefaultCalendarAccess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DefaultCampaignAccess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DefaultCaseAccess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DefaultContactAccess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DefaultLeadAccess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DefaultLocaleSidKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DefaultOpportunityAccess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DefaultPricebookAccess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DefaultTerritoryAccountAccess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DefaultTerritoryCaseAccess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DefaultTerritoryContactAccess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DefaultTerritoryOppAccess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Division" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FiscalYearStartMonth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LanguageLocaleKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MonthlyPageViewsEntitlement" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MonthlyPageViewsUsed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferencesRequireOpportunityProducts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PrimaryContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReceivesAdminInfoEmails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReceivesInfoEmails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TrialExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="UiSkin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UsesStartDateAsFiscalYearName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WebToCaseDefaultOrigin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization", propOrder = {
    "city",
    "complianceBccEmail",
    "country",
    "createdBy",
    "createdById",
    "createdDate",
    "defaultAccountAccess",
    "defaultCalendarAccess",
    "defaultCampaignAccess",
    "defaultCaseAccess",
    "defaultContactAccess",
    "defaultLeadAccess",
    "defaultLocaleSidKey",
    "defaultOpportunityAccess",
    "defaultPricebookAccess",
    "defaultTerritoryAccountAccess",
    "defaultTerritoryCaseAccess",
    "defaultTerritoryContactAccess",
    "defaultTerritoryOppAccess",
    "division",
    "fax",
    "fiscalYearStartMonth",
    "languageLocaleKey",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "monthlyPageViewsEntitlement",
    "monthlyPageViewsUsed",
    "name",
    "organizationType",
    "phone",
    "postalCode",
    "preferencesRequireOpportunityProducts",
    "primaryContact",
    "receivesAdminInfoEmails",
    "receivesInfoEmails",
    "state",
    "street",
    "systemModstamp",
    "trialExpirationDate",
    "uiSkin",
    "usesStartDateAsFiscalYearName",
    "webToCaseDefaultOrigin"
})
public class OrganizationType
    extends SObjectType
{

    @XmlElement(name = "City", nillable = true)
    protected String city;
    @XmlElement(name = "ComplianceBccEmail", nillable = true)
    protected String complianceBccEmail;
    @XmlElement(name = "Country", nillable = true)
    protected String country;
    @XmlElement(name = "CreatedBy", nillable = true)
    protected UserType createdBy;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "DefaultAccountAccess", nillable = true)
    protected String defaultAccountAccess;
    @XmlElement(name = "DefaultCalendarAccess", nillable = true)
    protected String defaultCalendarAccess;
    @XmlElement(name = "DefaultCampaignAccess", nillable = true)
    protected String defaultCampaignAccess;
    @XmlElement(name = "DefaultCaseAccess", nillable = true)
    protected String defaultCaseAccess;
    @XmlElement(name = "DefaultContactAccess", nillable = true)
    protected String defaultContactAccess;
    @XmlElement(name = "DefaultLeadAccess", nillable = true)
    protected String defaultLeadAccess;
    @XmlElement(name = "DefaultLocaleSidKey", nillable = true)
    protected String defaultLocaleSidKey;
    @XmlElement(name = "DefaultOpportunityAccess", nillable = true)
    protected String defaultOpportunityAccess;
    @XmlElement(name = "DefaultPricebookAccess", nillable = true)
    protected String defaultPricebookAccess;
    @XmlElement(name = "DefaultTerritoryAccountAccess", nillable = true)
    protected String defaultTerritoryAccountAccess;
    @XmlElement(name = "DefaultTerritoryCaseAccess", nillable = true)
    protected String defaultTerritoryCaseAccess;
    @XmlElement(name = "DefaultTerritoryContactAccess", nillable = true)
    protected String defaultTerritoryContactAccess;
    @XmlElement(name = "DefaultTerritoryOppAccess", nillable = true)
    protected String defaultTerritoryOppAccess;
    @XmlElement(name = "Division", nillable = true)
    protected String division;
    @XmlElement(name = "Fax", nillable = true)
    protected String fax;
    @XmlElement(name = "FiscalYearStartMonth", nillable = true)
    protected Integer fiscalYearStartMonth;
    @XmlElement(name = "LanguageLocaleKey", nillable = true)
    protected String languageLocaleKey;
    @XmlElement(name = "LastModifiedBy", nillable = true)
    protected UserType lastModifiedBy;
    @XmlElement(name = "LastModifiedById", nillable = true)
    protected String lastModifiedById;
    @XmlElement(name = "LastModifiedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlElement(name = "MonthlyPageViewsEntitlement", nillable = true)
    protected Integer monthlyPageViewsEntitlement;
    @XmlElement(name = "MonthlyPageViewsUsed", nillable = true)
    protected Integer monthlyPageViewsUsed;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "OrganizationType", nillable = true)
    protected String organizationType;
    @XmlElement(name = "Phone", nillable = true)
    protected String phone;
    @XmlElement(name = "PostalCode", nillable = true)
    protected String postalCode;
    @XmlElement(name = "PreferencesRequireOpportunityProducts", nillable = true)
    protected Boolean preferencesRequireOpportunityProducts;
    @XmlElement(name = "PrimaryContact", nillable = true)
    protected String primaryContact;
    @XmlElement(name = "ReceivesAdminInfoEmails", nillable = true)
    protected Boolean receivesAdminInfoEmails;
    @XmlElement(name = "ReceivesInfoEmails", nillable = true)
    protected Boolean receivesInfoEmails;
    @XmlElement(name = "State", nillable = true)
    protected String state;
    @XmlElement(name = "Street", nillable = true)
    protected String street;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "TrialExpirationDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar trialExpirationDate;
    @XmlElement(name = "UiSkin", nillable = true)
    protected String uiSkin;
    @XmlElement(name = "UsesStartDateAsFiscalYearName", nillable = true)
    protected Boolean usesStartDateAsFiscalYearName;
    @XmlElement(name = "WebToCaseDefaultOrigin", nillable = true)
    protected String webToCaseDefaultOrigin;

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the complianceBccEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplianceBccEmail() {
        return complianceBccEmail;
    }

    /**
     * Sets the value of the complianceBccEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplianceBccEmail(String value) {
        this.complianceBccEmail = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
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
     * Gets the value of the defaultAccountAccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultAccountAccess() {
        return defaultAccountAccess;
    }

    /**
     * Sets the value of the defaultAccountAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultAccountAccess(String value) {
        this.defaultAccountAccess = value;
    }

    /**
     * Gets the value of the defaultCalendarAccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultCalendarAccess() {
        return defaultCalendarAccess;
    }

    /**
     * Sets the value of the defaultCalendarAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultCalendarAccess(String value) {
        this.defaultCalendarAccess = value;
    }

    /**
     * Gets the value of the defaultCampaignAccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultCampaignAccess() {
        return defaultCampaignAccess;
    }

    /**
     * Sets the value of the defaultCampaignAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultCampaignAccess(String value) {
        this.defaultCampaignAccess = value;
    }

    /**
     * Gets the value of the defaultCaseAccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultCaseAccess() {
        return defaultCaseAccess;
    }

    /**
     * Sets the value of the defaultCaseAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultCaseAccess(String value) {
        this.defaultCaseAccess = value;
    }

    /**
     * Gets the value of the defaultContactAccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultContactAccess() {
        return defaultContactAccess;
    }

    /**
     * Sets the value of the defaultContactAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultContactAccess(String value) {
        this.defaultContactAccess = value;
    }

    /**
     * Gets the value of the defaultLeadAccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultLeadAccess() {
        return defaultLeadAccess;
    }

    /**
     * Sets the value of the defaultLeadAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultLeadAccess(String value) {
        this.defaultLeadAccess = value;
    }

    /**
     * Gets the value of the defaultLocaleSidKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultLocaleSidKey() {
        return defaultLocaleSidKey;
    }

    /**
     * Sets the value of the defaultLocaleSidKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultLocaleSidKey(String value) {
        this.defaultLocaleSidKey = value;
    }

    /**
     * Gets the value of the defaultOpportunityAccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultOpportunityAccess() {
        return defaultOpportunityAccess;
    }

    /**
     * Sets the value of the defaultOpportunityAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultOpportunityAccess(String value) {
        this.defaultOpportunityAccess = value;
    }

    /**
     * Gets the value of the defaultPricebookAccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultPricebookAccess() {
        return defaultPricebookAccess;
    }

    /**
     * Sets the value of the defaultPricebookAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultPricebookAccess(String value) {
        this.defaultPricebookAccess = value;
    }

    /**
     * Gets the value of the defaultTerritoryAccountAccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultTerritoryAccountAccess() {
        return defaultTerritoryAccountAccess;
    }

    /**
     * Sets the value of the defaultTerritoryAccountAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultTerritoryAccountAccess(String value) {
        this.defaultTerritoryAccountAccess = value;
    }

    /**
     * Gets the value of the defaultTerritoryCaseAccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultTerritoryCaseAccess() {
        return defaultTerritoryCaseAccess;
    }

    /**
     * Sets the value of the defaultTerritoryCaseAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultTerritoryCaseAccess(String value) {
        this.defaultTerritoryCaseAccess = value;
    }

    /**
     * Gets the value of the defaultTerritoryContactAccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultTerritoryContactAccess() {
        return defaultTerritoryContactAccess;
    }

    /**
     * Sets the value of the defaultTerritoryContactAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultTerritoryContactAccess(String value) {
        this.defaultTerritoryContactAccess = value;
    }

    /**
     * Gets the value of the defaultTerritoryOppAccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultTerritoryOppAccess() {
        return defaultTerritoryOppAccess;
    }

    /**
     * Sets the value of the defaultTerritoryOppAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultTerritoryOppAccess(String value) {
        this.defaultTerritoryOppAccess = value;
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
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the fiscalYearStartMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFiscalYearStartMonth() {
        return fiscalYearStartMonth;
    }

    /**
     * Sets the value of the fiscalYearStartMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFiscalYearStartMonth(Integer value) {
        this.fiscalYearStartMonth = value;
    }

    /**
     * Gets the value of the languageLocaleKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageLocaleKey() {
        return languageLocaleKey;
    }

    /**
     * Sets the value of the languageLocaleKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageLocaleKey(String value) {
        this.languageLocaleKey = value;
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
     * Gets the value of the monthlyPageViewsEntitlement property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMonthlyPageViewsEntitlement() {
        return monthlyPageViewsEntitlement;
    }

    /**
     * Sets the value of the monthlyPageViewsEntitlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMonthlyPageViewsEntitlement(Integer value) {
        this.monthlyPageViewsEntitlement = value;
    }

    /**
     * Gets the value of the monthlyPageViewsUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMonthlyPageViewsUsed() {
        return monthlyPageViewsUsed;
    }

    /**
     * Sets the value of the monthlyPageViewsUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMonthlyPageViewsUsed(Integer value) {
        this.monthlyPageViewsUsed = value;
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
     * Gets the value of the organizationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationType() {
        return organizationType;
    }

    /**
     * Sets the value of the organizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationType(String value) {
        this.organizationType = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the preferencesRequireOpportunityProducts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreferencesRequireOpportunityProducts() {
        return preferencesRequireOpportunityProducts;
    }

    /**
     * Sets the value of the preferencesRequireOpportunityProducts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferencesRequireOpportunityProducts(Boolean value) {
        this.preferencesRequireOpportunityProducts = value;
    }

    /**
     * Gets the value of the primaryContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryContact() {
        return primaryContact;
    }

    /**
     * Sets the value of the primaryContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryContact(String value) {
        this.primaryContact = value;
    }

    /**
     * Gets the value of the receivesAdminInfoEmails property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReceivesAdminInfoEmails() {
        return receivesAdminInfoEmails;
    }

    /**
     * Sets the value of the receivesAdminInfoEmails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReceivesAdminInfoEmails(Boolean value) {
        this.receivesAdminInfoEmails = value;
    }

    /**
     * Gets the value of the receivesInfoEmails property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReceivesInfoEmails() {
        return receivesInfoEmails;
    }

    /**
     * Sets the value of the receivesInfoEmails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReceivesInfoEmails(Boolean value) {
        this.receivesInfoEmails = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
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
     * Gets the value of the trialExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTrialExpirationDate() {
        return trialExpirationDate;
    }

    /**
     * Sets the value of the trialExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTrialExpirationDate(XMLGregorianCalendar value) {
        this.trialExpirationDate = value;
    }

    /**
     * Gets the value of the uiSkin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUiSkin() {
        return uiSkin;
    }

    /**
     * Sets the value of the uiSkin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUiSkin(String value) {
        this.uiSkin = value;
    }

    /**
     * Gets the value of the usesStartDateAsFiscalYearName property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsesStartDateAsFiscalYearName() {
        return usesStartDateAsFiscalYearName;
    }

    /**
     * Sets the value of the usesStartDateAsFiscalYearName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsesStartDateAsFiscalYearName(Boolean value) {
        this.usesStartDateAsFiscalYearName = value;
    }

    /**
     * Gets the value of the webToCaseDefaultOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebToCaseDefaultOrigin() {
        return webToCaseDefaultOrigin;
    }

    /**
     * Sets the value of the webToCaseDefaultOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebToCaseDefaultOrigin(String value) {
        this.webToCaseDefaultOrigin = value;
    }

}
