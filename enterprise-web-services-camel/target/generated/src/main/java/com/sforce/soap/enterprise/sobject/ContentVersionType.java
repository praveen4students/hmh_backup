
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sforce.soap.enterprise.QueryResult;


/**
 * <p>Java class for ContentVersion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentVersion">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="ContentDocument" type="{urn:sobject.enterprise.soap.sforce.com}ContentDocument" minOccurs="0"/>
 *         &lt;element name="ContentDocumentId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ContentModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ContentModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ContentSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ContentUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Division" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="FeaturedContentBoost" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FeaturedContentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="FileType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstPublishLocation" type="{urn:sobject.enterprise.soap.sforce.com}Name" minOccurs="0"/>
 *         &lt;element name="FirstPublishLocationId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Histories" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsLatest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="NegativeRatingCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Origin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Owner" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="OwnerId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="PathOnClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PositiveRatingCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PublishStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RatingCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ReasonForChange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TagCsv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VersionData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="VersionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentVersion", propOrder = {
    "contentDocument",
    "contentDocumentId",
    "contentModifiedById",
    "contentModifiedDate",
    "contentSize",
    "contentUrl",
    "createdBy",
    "createdById",
    "createdDate",
    "description",
    "division",
    "featuredContentBoost",
    "featuredContentDate",
    "fileType",
    "firstPublishLocation",
    "firstPublishLocationId",
    "histories",
    "isDeleted",
    "isLatest",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "negativeRatingCount",
    "origin",
    "owner",
    "ownerId",
    "pathOnClient",
    "positiveRatingCount",
    "publishStatus",
    "ratingCount",
    "reasonForChange",
    "systemModstamp",
    "tagCsv",
    "title",
    "versionData",
    "versionNumber"
})
public class ContentVersionType
    extends SObjectType
{

    @XmlElement(name = "ContentDocument", nillable = true)
    protected ContentDocumentType contentDocument;
    @XmlElement(name = "ContentDocumentId", nillable = true)
    protected String contentDocumentId;
    @XmlElement(name = "ContentModifiedById", nillable = true)
    protected String contentModifiedById;
    @XmlElement(name = "ContentModifiedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar contentModifiedDate;
    @XmlElement(name = "ContentSize", nillable = true)
    protected Integer contentSize;
    @XmlElement(name = "ContentUrl", nillable = true)
    protected String contentUrl;
    @XmlElement(name = "CreatedBy", nillable = true)
    protected UserType createdBy;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "Division", nillable = true)
    protected String division;
    @XmlElement(name = "FeaturedContentBoost", nillable = true)
    protected Integer featuredContentBoost;
    @XmlElement(name = "FeaturedContentDate", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar featuredContentDate;
    @XmlElement(name = "FileType", nillable = true)
    protected String fileType;
    @XmlElement(name = "FirstPublishLocation", nillable = true)
    protected NameType firstPublishLocation;
    @XmlElement(name = "FirstPublishLocationId", nillable = true)
    protected String firstPublishLocationId;
    @XmlElement(name = "Histories", nillable = true)
    protected QueryResult histories;
    @XmlElement(name = "IsDeleted", nillable = true)
    protected Boolean isDeleted;
    @XmlElement(name = "IsLatest", nillable = true)
    protected Boolean isLatest;
    @XmlElement(name = "LastModifiedBy", nillable = true)
    protected UserType lastModifiedBy;
    @XmlElement(name = "LastModifiedById", nillable = true)
    protected String lastModifiedById;
    @XmlElement(name = "LastModifiedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlElement(name = "NegativeRatingCount", nillable = true)
    protected Integer negativeRatingCount;
    @XmlElement(name = "Origin", nillable = true)
    protected String origin;
    @XmlElement(name = "Owner", nillable = true)
    protected UserType owner;
    @XmlElement(name = "OwnerId", nillable = true)
    protected String ownerId;
    @XmlElement(name = "PathOnClient", nillable = true)
    protected String pathOnClient;
    @XmlElement(name = "PositiveRatingCount", nillable = true)
    protected Integer positiveRatingCount;
    @XmlElement(name = "PublishStatus", nillable = true)
    protected String publishStatus;
    @XmlElement(name = "RatingCount", nillable = true)
    protected Integer ratingCount;
    @XmlElement(name = "ReasonForChange", nillable = true)
    protected String reasonForChange;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "TagCsv", nillable = true)
    protected String tagCsv;
    @XmlElement(name = "Title", nillable = true)
    protected String title;
    @XmlElement(name = "VersionData", nillable = true)
    protected byte[] versionData;
    @XmlElement(name = "VersionNumber", nillable = true)
    protected String versionNumber;

    /**
     * Gets the value of the contentDocument property.
     * 
     * @return
     *     possible object is
     *     {@link ContentDocumentType }
     *     
     */
    public ContentDocumentType getContentDocument() {
        return contentDocument;
    }

    /**
     * Sets the value of the contentDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentDocumentType }
     *     
     */
    public void setContentDocument(ContentDocumentType value) {
        this.contentDocument = value;
    }

    /**
     * Gets the value of the contentDocumentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentDocumentId() {
        return contentDocumentId;
    }

    /**
     * Sets the value of the contentDocumentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentDocumentId(String value) {
        this.contentDocumentId = value;
    }

    /**
     * Gets the value of the contentModifiedById property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentModifiedById() {
        return contentModifiedById;
    }

    /**
     * Sets the value of the contentModifiedById property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentModifiedById(String value) {
        this.contentModifiedById = value;
    }

    /**
     * Gets the value of the contentModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContentModifiedDate() {
        return contentModifiedDate;
    }

    /**
     * Sets the value of the contentModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContentModifiedDate(XMLGregorianCalendar value) {
        this.contentModifiedDate = value;
    }

    /**
     * Gets the value of the contentSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContentSize() {
        return contentSize;
    }

    /**
     * Sets the value of the contentSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContentSize(Integer value) {
        this.contentSize = value;
    }

    /**
     * Gets the value of the contentUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentUrl() {
        return contentUrl;
    }

    /**
     * Sets the value of the contentUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentUrl(String value) {
        this.contentUrl = value;
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
     * Gets the value of the featuredContentBoost property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFeaturedContentBoost() {
        return featuredContentBoost;
    }

    /**
     * Sets the value of the featuredContentBoost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFeaturedContentBoost(Integer value) {
        this.featuredContentBoost = value;
    }

    /**
     * Gets the value of the featuredContentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFeaturedContentDate() {
        return featuredContentDate;
    }

    /**
     * Sets the value of the featuredContentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFeaturedContentDate(XMLGregorianCalendar value) {
        this.featuredContentDate = value;
    }

    /**
     * Gets the value of the fileType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * Sets the value of the fileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileType(String value) {
        this.fileType = value;
    }

    /**
     * Gets the value of the firstPublishLocation property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getFirstPublishLocation() {
        return firstPublishLocation;
    }

    /**
     * Sets the value of the firstPublishLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setFirstPublishLocation(NameType value) {
        this.firstPublishLocation = value;
    }

    /**
     * Gets the value of the firstPublishLocationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstPublishLocationId() {
        return firstPublishLocationId;
    }

    /**
     * Sets the value of the firstPublishLocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstPublishLocationId(String value) {
        this.firstPublishLocationId = value;
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
     * Gets the value of the isLatest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLatest() {
        return isLatest;
    }

    /**
     * Sets the value of the isLatest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLatest(Boolean value) {
        this.isLatest = value;
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
     * Gets the value of the negativeRatingCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNegativeRatingCount() {
        return negativeRatingCount;
    }

    /**
     * Sets the value of the negativeRatingCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNegativeRatingCount(Integer value) {
        this.negativeRatingCount = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setOwner(UserType value) {
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
     * Gets the value of the pathOnClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPathOnClient() {
        return pathOnClient;
    }

    /**
     * Sets the value of the pathOnClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPathOnClient(String value) {
        this.pathOnClient = value;
    }

    /**
     * Gets the value of the positiveRatingCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPositiveRatingCount() {
        return positiveRatingCount;
    }

    /**
     * Sets the value of the positiveRatingCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPositiveRatingCount(Integer value) {
        this.positiveRatingCount = value;
    }

    /**
     * Gets the value of the publishStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublishStatus() {
        return publishStatus;
    }

    /**
     * Sets the value of the publishStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublishStatus(String value) {
        this.publishStatus = value;
    }

    /**
     * Gets the value of the ratingCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRatingCount() {
        return ratingCount;
    }

    /**
     * Sets the value of the ratingCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRatingCount(Integer value) {
        this.ratingCount = value;
    }

    /**
     * Gets the value of the reasonForChange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonForChange() {
        return reasonForChange;
    }

    /**
     * Sets the value of the reasonForChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonForChange(String value) {
        this.reasonForChange = value;
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
     * Gets the value of the tagCsv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagCsv() {
        return tagCsv;
    }

    /**
     * Sets the value of the tagCsv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagCsv(String value) {
        this.tagCsv = value;
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
     * Gets the value of the versionData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getVersionData() {
        return versionData;
    }

    /**
     * Sets the value of the versionData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setVersionData(byte[] value) {
        this.versionData = ((byte[]) value);
    }

    /**
     * Gets the value of the versionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionNumber() {
        return versionNumber;
    }

    /**
     * Sets the value of the versionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionNumber(String value) {
        this.versionNumber = value;
    }

}
