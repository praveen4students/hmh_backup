
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sforce.soap.enterprise.QueryResult;


/**
 * <p>Java class for Dashboard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dashboard">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="BackgroundDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BackgroundEnd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BackgroundStart" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DashboardComponents" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeveloperName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeedSubscriptionsForEntity" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Feeds" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Folder" type="{urn:sobject.enterprise.soap.sforce.com}Folder" minOccurs="0"/>
 *         &lt;element name="FolderId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LeftSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NamespacePrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RightSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RunningUser" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="RunningUserId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TextColor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TitleColor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TitleSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dashboard", propOrder = {
    "backgroundDirection",
    "backgroundEnd",
    "backgroundStart",
    "createdBy",
    "createdById",
    "createdDate",
    "dashboardComponents",
    "description",
    "developerName",
    "feedSubscriptionsForEntity",
    "feeds",
    "folder",
    "folderId",
    "isDeleted",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "leftSize",
    "middleSize",
    "namespacePrefix",
    "rightSize",
    "runningUser",
    "runningUserId",
    "systemModstamp",
    "textColor",
    "title",
    "titleColor",
    "titleSize",
    "type"
})
public class DashboardType
    extends SObjectType
{

    @XmlElement(name = "BackgroundDirection", nillable = true)
    protected String backgroundDirection;
    @XmlElement(name = "BackgroundEnd", nillable = true)
    protected Integer backgroundEnd;
    @XmlElement(name = "BackgroundStart", nillable = true)
    protected Integer backgroundStart;
    @XmlElement(name = "CreatedBy", nillable = true)
    protected UserType createdBy;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "DashboardComponents", nillable = true)
    protected QueryResult dashboardComponents;
    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "DeveloperName", nillable = true)
    protected String developerName;
    @XmlElement(name = "FeedSubscriptionsForEntity", nillable = true)
    protected QueryResult feedSubscriptionsForEntity;
    @XmlElement(name = "Feeds", nillable = true)
    protected QueryResult feeds;
    @XmlElement(name = "Folder", nillable = true)
    protected FolderType folder;
    @XmlElement(name = "FolderId", nillable = true)
    protected String folderId;
    @XmlElement(name = "IsDeleted", nillable = true)
    protected Boolean isDeleted;
    @XmlElement(name = "LastModifiedBy", nillable = true)
    protected UserType lastModifiedBy;
    @XmlElement(name = "LastModifiedById", nillable = true)
    protected String lastModifiedById;
    @XmlElement(name = "LastModifiedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlElement(name = "LeftSize", nillable = true)
    protected String leftSize;
    @XmlElement(name = "MiddleSize", nillable = true)
    protected String middleSize;
    @XmlElement(name = "NamespacePrefix", nillable = true)
    protected String namespacePrefix;
    @XmlElement(name = "RightSize", nillable = true)
    protected String rightSize;
    @XmlElement(name = "RunningUser", nillable = true)
    protected UserType runningUser;
    @XmlElement(name = "RunningUserId", nillable = true)
    protected String runningUserId;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "TextColor", nillable = true)
    protected Integer textColor;
    @XmlElement(name = "Title", nillable = true)
    protected String title;
    @XmlElement(name = "TitleColor", nillable = true)
    protected Integer titleColor;
    @XmlElement(name = "TitleSize", nillable = true)
    protected Integer titleSize;
    @XmlElement(name = "Type", nillable = true)
    protected String type;

    /**
     * Gets the value of the backgroundDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackgroundDirection() {
        return backgroundDirection;
    }

    /**
     * Sets the value of the backgroundDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackgroundDirection(String value) {
        this.backgroundDirection = value;
    }

    /**
     * Gets the value of the backgroundEnd property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBackgroundEnd() {
        return backgroundEnd;
    }

    /**
     * Sets the value of the backgroundEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBackgroundEnd(Integer value) {
        this.backgroundEnd = value;
    }

    /**
     * Gets the value of the backgroundStart property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBackgroundStart() {
        return backgroundStart;
    }

    /**
     * Sets the value of the backgroundStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBackgroundStart(Integer value) {
        this.backgroundStart = value;
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
     * Gets the value of the dashboardComponents property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getDashboardComponents() {
        return dashboardComponents;
    }

    /**
     * Sets the value of the dashboardComponents property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setDashboardComponents(QueryResult value) {
        this.dashboardComponents = value;
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
     * Gets the value of the developerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeveloperName() {
        return developerName;
    }

    /**
     * Sets the value of the developerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeveloperName(String value) {
        this.developerName = value;
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
     * Gets the value of the folder property.
     * 
     * @return
     *     possible object is
     *     {@link FolderType }
     *     
     */
    public FolderType getFolder() {
        return folder;
    }

    /**
     * Sets the value of the folder property.
     * 
     * @param value
     *     allowed object is
     *     {@link FolderType }
     *     
     */
    public void setFolder(FolderType value) {
        this.folder = value;
    }

    /**
     * Gets the value of the folderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolderId() {
        return folderId;
    }

    /**
     * Sets the value of the folderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolderId(String value) {
        this.folderId = value;
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
     * Gets the value of the leftSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeftSize() {
        return leftSize;
    }

    /**
     * Sets the value of the leftSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeftSize(String value) {
        this.leftSize = value;
    }

    /**
     * Gets the value of the middleSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleSize() {
        return middleSize;
    }

    /**
     * Sets the value of the middleSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleSize(String value) {
        this.middleSize = value;
    }

    /**
     * Gets the value of the namespacePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamespacePrefix() {
        return namespacePrefix;
    }

    /**
     * Sets the value of the namespacePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamespacePrefix(String value) {
        this.namespacePrefix = value;
    }

    /**
     * Gets the value of the rightSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRightSize() {
        return rightSize;
    }

    /**
     * Sets the value of the rightSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRightSize(String value) {
        this.rightSize = value;
    }

    /**
     * Gets the value of the runningUser property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getRunningUser() {
        return runningUser;
    }

    /**
     * Sets the value of the runningUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setRunningUser(UserType value) {
        this.runningUser = value;
    }

    /**
     * Gets the value of the runningUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunningUserId() {
        return runningUserId;
    }

    /**
     * Sets the value of the runningUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunningUserId(String value) {
        this.runningUserId = value;
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
     * Gets the value of the textColor property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTextColor() {
        return textColor;
    }

    /**
     * Sets the value of the textColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTextColor(Integer value) {
        this.textColor = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the titleColor property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTitleColor() {
        return titleColor;
    }

    /**
     * Sets the value of the titleColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTitleColor(Integer value) {
        this.titleColor = value;
    }

    /**
     * Gets the value of the titleSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTitleSize() {
        return titleSize;
    }

    /**
     * Sets the value of the titleSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTitleSize(Integer value) {
        this.titleSize = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
