
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sforce.soap.enterprise.QueryResult;


/**
 * <p>Java class for Site complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Site">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="Admin" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="AdminId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="AnalyticsTrackingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DailyBandwidthLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DailyBandwidthUsed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DailyRequestTimeLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DailyRequestTimeUsed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeedSubscriptionsForEntity" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Feeds" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Histories" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MasterLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MonthlyPageViewsEntitlement" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptionsAllowHomePage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OptionsAllowStandardAnswersPages" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OptionsAllowStandardIdeasPages" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OptionsAllowStandardLookups" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OptionsAllowStandardSearch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OptionsEnableFeeds" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SiteDomains" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="SiteType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Subdomain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="UrlPathPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Site", propOrder = {
    "admin",
    "adminId",
    "analyticsTrackingCode",
    "createdBy",
    "createdById",
    "createdDate",
    "dailyBandwidthLimit",
    "dailyBandwidthUsed",
    "dailyRequestTimeLimit",
    "dailyRequestTimeUsed",
    "description",
    "feedSubscriptionsForEntity",
    "feeds",
    "histories",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "masterLabel",
    "monthlyPageViewsEntitlement",
    "name",
    "optionsAllowHomePage",
    "optionsAllowStandardAnswersPages",
    "optionsAllowStandardIdeasPages",
    "optionsAllowStandardLookups",
    "optionsAllowStandardSearch",
    "optionsEnableFeeds",
    "siteDomains",
    "siteType",
    "status",
    "subdomain",
    "systemModstamp",
    "urlPathPrefix"
})
public class SiteType
    extends SObjectType
{

    @XmlElement(name = "Admin", nillable = true)
    protected UserType admin;
    @XmlElement(name = "AdminId", nillable = true)
    protected String adminId;
    @XmlElement(name = "AnalyticsTrackingCode", nillable = true)
    protected String analyticsTrackingCode;
    @XmlElement(name = "CreatedBy", nillable = true)
    protected UserType createdBy;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "DailyBandwidthLimit", nillable = true)
    protected Integer dailyBandwidthLimit;
    @XmlElement(name = "DailyBandwidthUsed", nillable = true)
    protected Integer dailyBandwidthUsed;
    @XmlElement(name = "DailyRequestTimeLimit", nillable = true)
    protected Integer dailyRequestTimeLimit;
    @XmlElement(name = "DailyRequestTimeUsed", nillable = true)
    protected Integer dailyRequestTimeUsed;
    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "FeedSubscriptionsForEntity", nillable = true)
    protected QueryResult feedSubscriptionsForEntity;
    @XmlElement(name = "Feeds", nillable = true)
    protected QueryResult feeds;
    @XmlElement(name = "Histories", nillable = true)
    protected QueryResult histories;
    @XmlElement(name = "LastModifiedBy", nillable = true)
    protected UserType lastModifiedBy;
    @XmlElement(name = "LastModifiedById", nillable = true)
    protected String lastModifiedById;
    @XmlElement(name = "LastModifiedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlElement(name = "MasterLabel", nillable = true)
    protected String masterLabel;
    @XmlElement(name = "MonthlyPageViewsEntitlement", nillable = true)
    protected Integer monthlyPageViewsEntitlement;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "OptionsAllowHomePage", nillable = true)
    protected Boolean optionsAllowHomePage;
    @XmlElement(name = "OptionsAllowStandardAnswersPages", nillable = true)
    protected Boolean optionsAllowStandardAnswersPages;
    @XmlElement(name = "OptionsAllowStandardIdeasPages", nillable = true)
    protected Boolean optionsAllowStandardIdeasPages;
    @XmlElement(name = "OptionsAllowStandardLookups", nillable = true)
    protected Boolean optionsAllowStandardLookups;
    @XmlElement(name = "OptionsAllowStandardSearch", nillable = true)
    protected Boolean optionsAllowStandardSearch;
    @XmlElement(name = "OptionsEnableFeeds", nillable = true)
    protected Boolean optionsEnableFeeds;
    @XmlElement(name = "SiteDomains", nillable = true)
    protected QueryResult siteDomains;
    @XmlElement(name = "SiteType", nillable = true)
    protected String siteType;
    @XmlElement(name = "Status", nillable = true)
    protected String status;
    @XmlElement(name = "Subdomain", nillable = true)
    protected String subdomain;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "UrlPathPrefix", nillable = true)
    protected String urlPathPrefix;

    /**
     * Gets the value of the admin property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getAdmin() {
        return admin;
    }

    /**
     * Sets the value of the admin property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setAdmin(UserType value) {
        this.admin = value;
    }

    /**
     * Gets the value of the adminId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminId() {
        return adminId;
    }

    /**
     * Sets the value of the adminId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminId(String value) {
        this.adminId = value;
    }

    /**
     * Gets the value of the analyticsTrackingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnalyticsTrackingCode() {
        return analyticsTrackingCode;
    }

    /**
     * Sets the value of the analyticsTrackingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnalyticsTrackingCode(String value) {
        this.analyticsTrackingCode = value;
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
     * Gets the value of the dailyBandwidthLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDailyBandwidthLimit() {
        return dailyBandwidthLimit;
    }

    /**
     * Sets the value of the dailyBandwidthLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDailyBandwidthLimit(Integer value) {
        this.dailyBandwidthLimit = value;
    }

    /**
     * Gets the value of the dailyBandwidthUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDailyBandwidthUsed() {
        return dailyBandwidthUsed;
    }

    /**
     * Sets the value of the dailyBandwidthUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDailyBandwidthUsed(Integer value) {
        this.dailyBandwidthUsed = value;
    }

    /**
     * Gets the value of the dailyRequestTimeLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDailyRequestTimeLimit() {
        return dailyRequestTimeLimit;
    }

    /**
     * Sets the value of the dailyRequestTimeLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDailyRequestTimeLimit(Integer value) {
        this.dailyRequestTimeLimit = value;
    }

    /**
     * Gets the value of the dailyRequestTimeUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDailyRequestTimeUsed() {
        return dailyRequestTimeUsed;
    }

    /**
     * Sets the value of the dailyRequestTimeUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDailyRequestTimeUsed(Integer value) {
        this.dailyRequestTimeUsed = value;
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
     * Gets the value of the masterLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterLabel() {
        return masterLabel;
    }

    /**
     * Sets the value of the masterLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterLabel(String value) {
        this.masterLabel = value;
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
     * Gets the value of the optionsAllowHomePage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOptionsAllowHomePage() {
        return optionsAllowHomePage;
    }

    /**
     * Sets the value of the optionsAllowHomePage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptionsAllowHomePage(Boolean value) {
        this.optionsAllowHomePage = value;
    }

    /**
     * Gets the value of the optionsAllowStandardAnswersPages property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOptionsAllowStandardAnswersPages() {
        return optionsAllowStandardAnswersPages;
    }

    /**
     * Sets the value of the optionsAllowStandardAnswersPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptionsAllowStandardAnswersPages(Boolean value) {
        this.optionsAllowStandardAnswersPages = value;
    }

    /**
     * Gets the value of the optionsAllowStandardIdeasPages property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOptionsAllowStandardIdeasPages() {
        return optionsAllowStandardIdeasPages;
    }

    /**
     * Sets the value of the optionsAllowStandardIdeasPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptionsAllowStandardIdeasPages(Boolean value) {
        this.optionsAllowStandardIdeasPages = value;
    }

    /**
     * Gets the value of the optionsAllowStandardLookups property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOptionsAllowStandardLookups() {
        return optionsAllowStandardLookups;
    }

    /**
     * Sets the value of the optionsAllowStandardLookups property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptionsAllowStandardLookups(Boolean value) {
        this.optionsAllowStandardLookups = value;
    }

    /**
     * Gets the value of the optionsAllowStandardSearch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOptionsAllowStandardSearch() {
        return optionsAllowStandardSearch;
    }

    /**
     * Sets the value of the optionsAllowStandardSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptionsAllowStandardSearch(Boolean value) {
        this.optionsAllowStandardSearch = value;
    }

    /**
     * Gets the value of the optionsEnableFeeds property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOptionsEnableFeeds() {
        return optionsEnableFeeds;
    }

    /**
     * Sets the value of the optionsEnableFeeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptionsEnableFeeds(Boolean value) {
        this.optionsEnableFeeds = value;
    }

    /**
     * Gets the value of the siteDomains property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getSiteDomains() {
        return siteDomains;
    }

    /**
     * Sets the value of the siteDomains property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setSiteDomains(QueryResult value) {
        this.siteDomains = value;
    }

    /**
     * Gets the value of the siteType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteType() {
        return siteType;
    }

    /**
     * Sets the value of the siteType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteType(String value) {
        this.siteType = value;
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
     * Gets the value of the subdomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubdomain() {
        return subdomain;
    }

    /**
     * Sets the value of the subdomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubdomain(String value) {
        this.subdomain = value;
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
     * Gets the value of the urlPathPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlPathPrefix() {
        return urlPathPrefix;
    }

    /**
     * Sets the value of the urlPathPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlPathPrefix(String value) {
        this.urlPathPrefix = value;
    }

}
