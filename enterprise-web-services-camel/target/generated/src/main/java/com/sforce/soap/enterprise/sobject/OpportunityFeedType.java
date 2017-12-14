
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sforce.soap.enterprise.QueryResult;


/**
 * <p>Java class for OpportunityFeed complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpportunityFeed">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="Body" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommentCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Connection" type="{urn:sobject.enterprise.soap.sforce.com}PartnerNetworkConnection" minOccurs="0"/>
 *         &lt;element name="ConnectionId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ContentData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="ContentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContentFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContentSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ContentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}Name" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FeedComments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="FeedLikes" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="FeedTrackedChanges" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="InsertedBy" type="{urn:sobject.enterprise.soap.sforce.com}Name" minOccurs="0"/>
 *         &lt;element name="InsertedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LikeCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LinkUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Parent" type="{urn:sobject.enterprise.soap.sforce.com}Opportunity" minOccurs="0"/>
 *         &lt;element name="ParentId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="RelatedRecordId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "OpportunityFeed", propOrder = {
    "body",
    "commentCount",
    "connection",
    "connectionId",
    "contentData",
    "contentDescription",
    "contentFileName",
    "contentSize",
    "contentType",
    "createdBy",
    "createdById",
    "createdDate",
    "feedComments",
    "feedLikes",
    "feedTrackedChanges",
    "insertedBy",
    "insertedById",
    "isDeleted",
    "lastModifiedDate",
    "likeCount",
    "linkUrl",
    "parent",
    "parentId",
    "relatedRecordId",
    "systemModstamp",
    "title",
    "type"
})
public class OpportunityFeedType
    extends SObjectType
{

    @XmlElement(name = "Body", nillable = true)
    protected String body;
    @XmlElement(name = "CommentCount", nillable = true)
    protected Integer commentCount;
    @XmlElement(name = "Connection", nillable = true)
    protected PartnerNetworkConnectionType connection;
    @XmlElement(name = "ConnectionId", nillable = true)
    protected String connectionId;
    @XmlElement(name = "ContentData", nillable = true)
    protected byte[] contentData;
    @XmlElement(name = "ContentDescription", nillable = true)
    protected String contentDescription;
    @XmlElement(name = "ContentFileName", nillable = true)
    protected String contentFileName;
    @XmlElement(name = "ContentSize", nillable = true)
    protected Integer contentSize;
    @XmlElement(name = "ContentType", nillable = true)
    protected String contentType;
    @XmlElement(name = "CreatedBy", nillable = true)
    protected NameType createdBy;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "FeedComments", nillable = true)
    protected QueryResult feedComments;
    @XmlElement(name = "FeedLikes", nillable = true)
    protected QueryResult feedLikes;
    @XmlElement(name = "FeedTrackedChanges", nillable = true)
    protected QueryResult feedTrackedChanges;
    @XmlElement(name = "InsertedBy", nillable = true)
    protected NameType insertedBy;
    @XmlElement(name = "InsertedById", nillable = true)
    protected String insertedById;
    @XmlElement(name = "IsDeleted", nillable = true)
    protected Boolean isDeleted;
    @XmlElement(name = "LastModifiedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlElement(name = "LikeCount", nillable = true)
    protected Integer likeCount;
    @XmlElement(name = "LinkUrl", nillable = true)
    protected String linkUrl;
    @XmlElement(name = "Parent", nillable = true)
    protected OpportunityType parent;
    @XmlElement(name = "ParentId", nillable = true)
    protected String parentId;
    @XmlElement(name = "RelatedRecordId", nillable = true)
    protected String relatedRecordId;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "Title", nillable = true)
    protected String title;
    @XmlElement(name = "Type", nillable = true)
    protected String type;

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBody(String value) {
        this.body = value;
    }

    /**
     * Gets the value of the commentCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCommentCount() {
        return commentCount;
    }

    /**
     * Sets the value of the commentCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCommentCount(Integer value) {
        this.commentCount = value;
    }

    /**
     * Gets the value of the connection property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerNetworkConnectionType }
     *     
     */
    public PartnerNetworkConnectionType getConnection() {
        return connection;
    }

    /**
     * Sets the value of the connection property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerNetworkConnectionType }
     *     
     */
    public void setConnection(PartnerNetworkConnectionType value) {
        this.connection = value;
    }

    /**
     * Gets the value of the connectionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionId() {
        return connectionId;
    }

    /**
     * Sets the value of the connectionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionId(String value) {
        this.connectionId = value;
    }

    /**
     * Gets the value of the contentData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getContentData() {
        return contentData;
    }

    /**
     * Sets the value of the contentData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setContentData(byte[] value) {
        this.contentData = ((byte[]) value);
    }

    /**
     * Gets the value of the contentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentDescription() {
        return contentDescription;
    }

    /**
     * Sets the value of the contentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentDescription(String value) {
        this.contentDescription = value;
    }

    /**
     * Gets the value of the contentFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentFileName() {
        return contentFileName;
    }

    /**
     * Sets the value of the contentFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentFileName(String value) {
        this.contentFileName = value;
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
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentType(String value) {
        this.contentType = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setCreatedBy(NameType value) {
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
     * Gets the value of the feedComments property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getFeedComments() {
        return feedComments;
    }

    /**
     * Sets the value of the feedComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setFeedComments(QueryResult value) {
        this.feedComments = value;
    }

    /**
     * Gets the value of the feedLikes property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getFeedLikes() {
        return feedLikes;
    }

    /**
     * Sets the value of the feedLikes property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setFeedLikes(QueryResult value) {
        this.feedLikes = value;
    }

    /**
     * Gets the value of the feedTrackedChanges property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getFeedTrackedChanges() {
        return feedTrackedChanges;
    }

    /**
     * Sets the value of the feedTrackedChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setFeedTrackedChanges(QueryResult value) {
        this.feedTrackedChanges = value;
    }

    /**
     * Gets the value of the insertedBy property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getInsertedBy() {
        return insertedBy;
    }

    /**
     * Sets the value of the insertedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setInsertedBy(NameType value) {
        this.insertedBy = value;
    }

    /**
     * Gets the value of the insertedById property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsertedById() {
        return insertedById;
    }

    /**
     * Sets the value of the insertedById property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsertedById(String value) {
        this.insertedById = value;
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
     * Gets the value of the likeCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLikeCount() {
        return likeCount;
    }

    /**
     * Sets the value of the likeCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLikeCount(Integer value) {
        this.likeCount = value;
    }

    /**
     * Gets the value of the linkUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkUrl() {
        return linkUrl;
    }

    /**
     * Sets the value of the linkUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkUrl(String value) {
        this.linkUrl = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link OpportunityType }
     *     
     */
    public OpportunityType getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpportunityType }
     *     
     */
    public void setParent(OpportunityType value) {
        this.parent = value;
    }

    /**
     * Gets the value of the parentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * Sets the value of the parentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentId(String value) {
        this.parentId = value;
    }

    /**
     * Gets the value of the relatedRecordId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedRecordId() {
        return relatedRecordId;
    }

    /**
     * Sets the value of the relatedRecordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedRecordId(String value) {
        this.relatedRecordId = value;
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
