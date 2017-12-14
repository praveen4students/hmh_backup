
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sforce.soap.enterprise.QueryResult;


/**
 * <p>Java class for Related_Product__c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Related_Product__c">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="Attachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="BOM_Usage__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Child_ISBN13__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Child_Short_Product_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConnectionReceived" type="{urn:sobject.enterprise.soap.sforce.com}PartnerNetworkConnection" minOccurs="0"/>
 *         &lt;element name="ConnectionReceivedId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ConnectionSent" type="{urn:sobject.enterprise.soap.sforce.com}PartnerNetworkConnection" minOccurs="0"/>
 *         &lt;element name="ConnectionSentId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FeedSubscriptionsForEntity" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Kit__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Kit__r" type="{urn:sobject.enterprise.soap.sforce.com}Product2" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LegacyID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="NotesAndAttachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Owner" type="{urn:sobject.enterprise.soap.sforce.com}Name" minOccurs="0"/>
 *         &lt;element name="OwnerId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Parent_ISBN13__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Parent_Short_Product_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProcessInstances" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ProcessSteps" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Product__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Product__r" type="{urn:sobject.enterprise.soap.sforce.com}Product2" minOccurs="0"/>
 *         &lt;element name="Quantity_In_Kit__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
@XmlType(name = "Related_Product__c", propOrder = {
    "attachments",
    "bomUsageC",
    "childISBN13C",
    "childShortProductCodeC",
    "connectionReceived",
    "connectionReceivedId",
    "connectionSent",
    "connectionSentId",
    "createdBy",
    "createdById",
    "createdDate",
    "feedSubscriptionsForEntity",
    "isDeleted",
    "kitC",
    "kitR",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "legacyIDC",
    "name",
    "notes",
    "notesAndAttachments",
    "owner",
    "ownerId",
    "parentISBN13C",
    "parentShortProductCodeC",
    "processInstances",
    "processSteps",
    "productC",
    "productR",
    "quantityInKitC",
    "systemModstamp"
})
public class Related_Product__CType
    extends SObjectType
{

    @XmlElement(name = "Attachments", nillable = true)
    protected QueryResult attachments;
    @XmlElement(name = "BOM_Usage__c", nillable = true)
    protected String bomUsageC;
    @XmlElement(name = "Child_ISBN13__c", nillable = true)
    protected String childISBN13C;
    @XmlElement(name = "Child_Short_Product_Code__c", nillable = true)
    protected String childShortProductCodeC;
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
    @XmlElement(name = "FeedSubscriptionsForEntity", nillable = true)
    protected QueryResult feedSubscriptionsForEntity;
    @XmlElement(name = "IsDeleted", nillable = true)
    protected Boolean isDeleted;
    @XmlElement(name = "Kit__c", nillable = true)
    protected String kitC;
    @XmlElement(name = "Kit__r", nillable = true)
    protected Product2Type kitR;
    @XmlElement(name = "LastModifiedBy", nillable = true)
    protected UserType lastModifiedBy;
    @XmlElement(name = "LastModifiedById", nillable = true)
    protected String lastModifiedById;
    @XmlElement(name = "LastModifiedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlElement(name = "LegacyID__c", nillable = true)
    protected String legacyIDC;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "Notes", nillable = true)
    protected QueryResult notes;
    @XmlElement(name = "NotesAndAttachments", nillable = true)
    protected QueryResult notesAndAttachments;
    @XmlElement(name = "Owner", nillable = true)
    protected NameType owner;
    @XmlElement(name = "OwnerId", nillable = true)
    protected String ownerId;
    @XmlElement(name = "Parent_ISBN13__c", nillable = true)
    protected String parentISBN13C;
    @XmlElement(name = "Parent_Short_Product_Code__c", nillable = true)
    protected String parentShortProductCodeC;
    @XmlElement(name = "ProcessInstances", nillable = true)
    protected QueryResult processInstances;
    @XmlElement(name = "ProcessSteps", nillable = true)
    protected QueryResult processSteps;
    @XmlElement(name = "Product__c", nillable = true)
    protected String productC;
    @XmlElement(name = "Product__r", nillable = true)
    protected Product2Type productR;
    @XmlElement(name = "Quantity_In_Kit__c", nillable = true)
    protected Double quantityInKitC;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;

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
     * Gets the value of the bom_Usage__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBOM_Usage__C() {
        return bomUsageC;
    }

    /**
     * Sets the value of the bom_Usage__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBOM_Usage__C(String value) {
        this.bomUsageC = value;
    }

    /**
     * Gets the value of the child_ISBN13__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChild_ISBN13__C() {
        return childISBN13C;
    }

    /**
     * Sets the value of the child_ISBN13__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChild_ISBN13__C(String value) {
        this.childISBN13C = value;
    }

    /**
     * Gets the value of the child_Short_Product_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChild_Short_Product_Code__C() {
        return childShortProductCodeC;
    }

    /**
     * Sets the value of the child_Short_Product_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChild_Short_Product_Code__C(String value) {
        this.childShortProductCodeC = value;
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
     * Gets the value of the kit__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKit__C() {
        return kitC;
    }

    /**
     * Sets the value of the kit__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKit__C(String value) {
        this.kitC = value;
    }

    /**
     * Gets the value of the kit__R property.
     * 
     * @return
     *     possible object is
     *     {@link Product2Type }
     *     
     */
    public Product2Type getKit__R() {
        return kitR;
    }

    /**
     * Sets the value of the kit__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product2Type }
     *     
     */
    public void setKit__R(Product2Type value) {
        this.kitR = value;
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
     * Gets the value of the legacyID__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegacyID__C() {
        return legacyIDC;
    }

    /**
     * Sets the value of the legacyID__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegacyID__C(String value) {
        this.legacyIDC = value;
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
     * Gets the value of the parent_ISBN13__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParent_ISBN13__C() {
        return parentISBN13C;
    }

    /**
     * Sets the value of the parent_ISBN13__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParent_ISBN13__C(String value) {
        this.parentISBN13C = value;
    }

    /**
     * Gets the value of the parent_Short_Product_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParent_Short_Product_Code__C() {
        return parentShortProductCodeC;
    }

    /**
     * Sets the value of the parent_Short_Product_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParent_Short_Product_Code__C(String value) {
        this.parentShortProductCodeC = value;
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
     * Gets the value of the product__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct__C() {
        return productC;
    }

    /**
     * Sets the value of the product__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct__C(String value) {
        this.productC = value;
    }

    /**
     * Gets the value of the product__R property.
     * 
     * @return
     *     possible object is
     *     {@link Product2Type }
     *     
     */
    public Product2Type getProduct__R() {
        return productR;
    }

    /**
     * Sets the value of the product__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product2Type }
     *     
     */
    public void setProduct__R(Product2Type value) {
        this.productR = value;
    }

    /**
     * Gets the value of the quantity_In_Kit__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantity_In_Kit__C() {
        return quantityInKitC;
    }

    /**
     * Sets the value of the quantity_In_Kit__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantity_In_Kit__C(Double value) {
        this.quantityInKitC = value;
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
