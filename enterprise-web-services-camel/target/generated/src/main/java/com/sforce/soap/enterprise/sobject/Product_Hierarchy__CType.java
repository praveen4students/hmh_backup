
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sforce.soap.enterprise.QueryResult;


/**
 * <p>Java class for Product_Hierarchy__c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Product_Hierarchy__c">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="Attachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Beg_Grd_Lvl__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Competitor_Offerings__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ConnectionReceived" type="{urn:sobject.enterprise.soap.sforce.com}PartnerNetworkConnection" minOccurs="0"/>
 *         &lt;element name="ConnectionReceivedId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ConnectionSent" type="{urn:sobject.enterprise.soap.sforce.com}PartnerNetworkConnection" minOccurs="0"/>
 *         &lt;element name="ConnectionSentId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Copyright_Year__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cost_Ratio_Percentage__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Description__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="End_Grd_Lvl__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Entity_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeedSubscriptionsForEntity" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Hierarchy_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="KenTests__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Level_1_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Level_2_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Level_3_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Level_4_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Level_5_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListStatus__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="NotesAndAttachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Opps_Orders_Proposals__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Owner" type="{urn:sobject.enterprise.soap.sforce.com}Name" minOccurs="0"/>
 *         &lt;element name="OwnerId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Pricebook_Price__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ProcessInstances" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ProcessSteps" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Product2_Id__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Product2_Id__r" type="{urn:sobject.enterprise.soap.sforce.com}Product2" minOccurs="0"/>
 *         &lt;element name="Products1__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Products2__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Products3__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Products4__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Products__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Publisher__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SFDC_Description__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Search_Flag__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Sort_Order__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
@XmlType(name = "Product_Hierarchy__c", propOrder = {
    "attachments",
    "begGrdLvlC",
    "codeC",
    "competitorOfferingsR",
    "connectionReceived",
    "connectionReceivedId",
    "connectionSent",
    "connectionSentId",
    "copyrightYearC",
    "costRatioPercentageC",
    "createdBy",
    "createdById",
    "createdDate",
    "descriptionC",
    "endGrdLvlC",
    "entityNameC",
    "feedSubscriptionsForEntity",
    "hierarchyTypeC",
    "isDeleted",
    "kenTestsR",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "level1CodeC",
    "level2CodeC",
    "level3CodeC",
    "level4CodeC",
    "level5CodeC",
    "listStatusC",
    "name",
    "notes",
    "notesAndAttachments",
    "oppsOrdersProposalsR",
    "owner",
    "ownerId",
    "pricebookPriceC",
    "processInstances",
    "processSteps",
    "product2IdC",
    "product2IdR",
    "products1R",
    "products2R",
    "products3R",
    "products4R",
    "productsR",
    "publisherC",
    "sfdcDescriptionC",
    "searchFlagC",
    "sortOrderC",
    "systemModstamp"
})
public class Product_Hierarchy__CType
    extends SObjectType
{

    @XmlElement(name = "Attachments", nillable = true)
    protected QueryResult attachments;
    @XmlElement(name = "Beg_Grd_Lvl__c", nillable = true)
    protected String begGrdLvlC;
    @XmlElement(name = "Code__c", nillable = true)
    protected String codeC;
    @XmlElement(name = "Competitor_Offerings__r", nillable = true)
    protected QueryResult competitorOfferingsR;
    @XmlElement(name = "ConnectionReceived", nillable = true)
    protected PartnerNetworkConnectionType connectionReceived;
    @XmlElement(name = "ConnectionReceivedId", nillable = true)
    protected String connectionReceivedId;
    @XmlElement(name = "ConnectionSent", nillable = true)
    protected PartnerNetworkConnectionType connectionSent;
    @XmlElement(name = "ConnectionSentId", nillable = true)
    protected String connectionSentId;
    @XmlElement(name = "Copyright_Year__c", nillable = true)
    protected String copyrightYearC;
    @XmlElement(name = "Cost_Ratio_Percentage__c", nillable = true)
    protected Double costRatioPercentageC;
    @XmlElement(name = "CreatedBy", nillable = true)
    protected UserType createdBy;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "Description__c", nillable = true)
    protected String descriptionC;
    @XmlElement(name = "End_Grd_Lvl__c", nillable = true)
    protected String endGrdLvlC;
    @XmlElement(name = "Entity_Name__c", nillable = true)
    protected String entityNameC;
    @XmlElement(name = "FeedSubscriptionsForEntity", nillable = true)
    protected QueryResult feedSubscriptionsForEntity;
    @XmlElement(name = "Hierarchy_Type__c", nillable = true)
    protected String hierarchyTypeC;
    @XmlElement(name = "IsDeleted", nillable = true)
    protected Boolean isDeleted;
    @XmlElement(name = "KenTests__r", nillable = true)
    protected QueryResult kenTestsR;
    @XmlElement(name = "LastModifiedBy", nillable = true)
    protected UserType lastModifiedBy;
    @XmlElement(name = "LastModifiedById", nillable = true)
    protected String lastModifiedById;
    @XmlElement(name = "LastModifiedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlElement(name = "Level_1_Code__c", nillable = true)
    protected String level1CodeC;
    @XmlElement(name = "Level_2_Code__c", nillable = true)
    protected String level2CodeC;
    @XmlElement(name = "Level_3_Code__c", nillable = true)
    protected String level3CodeC;
    @XmlElement(name = "Level_4_Code__c", nillable = true)
    protected String level4CodeC;
    @XmlElement(name = "Level_5_Code__c", nillable = true)
    protected String level5CodeC;
    @XmlElement(name = "ListStatus__c", nillable = true)
    protected String listStatusC;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "Notes", nillable = true)
    protected QueryResult notes;
    @XmlElement(name = "NotesAndAttachments", nillable = true)
    protected QueryResult notesAndAttachments;
    @XmlElement(name = "Opps_Orders_Proposals__r", nillable = true)
    protected QueryResult oppsOrdersProposalsR;
    @XmlElement(name = "Owner", nillable = true)
    protected NameType owner;
    @XmlElement(name = "OwnerId", nillable = true)
    protected String ownerId;
    @XmlElement(name = "Pricebook_Price__c", nillable = true)
    protected Double pricebookPriceC;
    @XmlElement(name = "ProcessInstances", nillable = true)
    protected QueryResult processInstances;
    @XmlElement(name = "ProcessSteps", nillable = true)
    protected QueryResult processSteps;
    @XmlElement(name = "Product2_Id__c", nillable = true)
    protected String product2IdC;
    @XmlElement(name = "Product2_Id__r", nillable = true)
    protected Product2Type product2IdR;
    @XmlElement(name = "Products1__r", nillable = true)
    protected QueryResult products1R;
    @XmlElement(name = "Products2__r", nillable = true)
    protected QueryResult products2R;
    @XmlElement(name = "Products3__r", nillable = true)
    protected QueryResult products3R;
    @XmlElement(name = "Products4__r", nillable = true)
    protected QueryResult products4R;
    @XmlElement(name = "Products__r", nillable = true)
    protected QueryResult productsR;
    @XmlElement(name = "Publisher__c", nillable = true)
    protected String publisherC;
    @XmlElement(name = "SFDC_Description__c", nillable = true)
    protected String sfdcDescriptionC;
    @XmlElement(name = "Search_Flag__c", nillable = true)
    protected Boolean searchFlagC;
    @XmlElement(name = "Sort_Order__c", nillable = true)
    protected Double sortOrderC;
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
     * Gets the value of the beg_Grd_Lvl__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeg_Grd_Lvl__C() {
        return begGrdLvlC;
    }

    /**
     * Sets the value of the beg_Grd_Lvl__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeg_Grd_Lvl__C(String value) {
        this.begGrdLvlC = value;
    }

    /**
     * Gets the value of the code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode__C() {
        return codeC;
    }

    /**
     * Sets the value of the code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode__C(String value) {
        this.codeC = value;
    }

    /**
     * Gets the value of the competitor_Offerings__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getCompetitor_Offerings__R() {
        return competitorOfferingsR;
    }

    /**
     * Sets the value of the competitor_Offerings__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setCompetitor_Offerings__R(QueryResult value) {
        this.competitorOfferingsR = value;
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
     * Gets the value of the copyright_Year__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyright_Year__C() {
        return copyrightYearC;
    }

    /**
     * Sets the value of the copyright_Year__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyright_Year__C(String value) {
        this.copyrightYearC = value;
    }

    /**
     * Gets the value of the cost_Ratio_Percentage__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCost_Ratio_Percentage__C() {
        return costRatioPercentageC;
    }

    /**
     * Sets the value of the cost_Ratio_Percentage__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCost_Ratio_Percentage__C(Double value) {
        this.costRatioPercentageC = value;
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
     * Gets the value of the description__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription__C() {
        return descriptionC;
    }

    /**
     * Sets the value of the description__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription__C(String value) {
        this.descriptionC = value;
    }

    /**
     * Gets the value of the end_Grd_Lvl__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnd_Grd_Lvl__C() {
        return endGrdLvlC;
    }

    /**
     * Sets the value of the end_Grd_Lvl__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnd_Grd_Lvl__C(String value) {
        this.endGrdLvlC = value;
    }

    /**
     * Gets the value of the entity_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntity_Name__C() {
        return entityNameC;
    }

    /**
     * Sets the value of the entity_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntity_Name__C(String value) {
        this.entityNameC = value;
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
     * Gets the value of the hierarchy_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHierarchy_Type__C() {
        return hierarchyTypeC;
    }

    /**
     * Sets the value of the hierarchy_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHierarchy_Type__C(String value) {
        this.hierarchyTypeC = value;
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
     * Gets the value of the kenTests__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getKenTests__R() {
        return kenTestsR;
    }

    /**
     * Sets the value of the kenTests__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setKenTests__R(QueryResult value) {
        this.kenTestsR = value;
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
     * Gets the value of the level_1_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel_1_Code__C() {
        return level1CodeC;
    }

    /**
     * Sets the value of the level_1_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel_1_Code__C(String value) {
        this.level1CodeC = value;
    }

    /**
     * Gets the value of the level_2_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel_2_Code__C() {
        return level2CodeC;
    }

    /**
     * Sets the value of the level_2_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel_2_Code__C(String value) {
        this.level2CodeC = value;
    }

    /**
     * Gets the value of the level_3_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel_3_Code__C() {
        return level3CodeC;
    }

    /**
     * Sets the value of the level_3_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel_3_Code__C(String value) {
        this.level3CodeC = value;
    }

    /**
     * Gets the value of the level_4_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel_4_Code__C() {
        return level4CodeC;
    }

    /**
     * Sets the value of the level_4_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel_4_Code__C(String value) {
        this.level4CodeC = value;
    }

    /**
     * Gets the value of the level_5_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel_5_Code__C() {
        return level5CodeC;
    }

    /**
     * Sets the value of the level_5_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel_5_Code__C(String value) {
        this.level5CodeC = value;
    }

    /**
     * Gets the value of the listStatus__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListStatus__C() {
        return listStatusC;
    }

    /**
     * Sets the value of the listStatus__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListStatus__C(String value) {
        this.listStatusC = value;
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
     * Gets the value of the opps_Orders_Proposals__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getOpps_Orders_Proposals__R() {
        return oppsOrdersProposalsR;
    }

    /**
     * Sets the value of the opps_Orders_Proposals__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setOpps_Orders_Proposals__R(QueryResult value) {
        this.oppsOrdersProposalsR = value;
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
     * Gets the value of the pricebook_Price__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPricebook_Price__C() {
        return pricebookPriceC;
    }

    /**
     * Sets the value of the pricebook_Price__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPricebook_Price__C(Double value) {
        this.pricebookPriceC = value;
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
     * Gets the value of the product2_Id__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct2_Id__C() {
        return product2IdC;
    }

    /**
     * Sets the value of the product2_Id__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct2_Id__C(String value) {
        this.product2IdC = value;
    }

    /**
     * Gets the value of the product2_Id__R property.
     * 
     * @return
     *     possible object is
     *     {@link Product2Type }
     *     
     */
    public Product2Type getProduct2_Id__R() {
        return product2IdR;
    }

    /**
     * Sets the value of the product2_Id__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product2Type }
     *     
     */
    public void setProduct2_Id__R(Product2Type value) {
        this.product2IdR = value;
    }

    /**
     * Gets the value of the products1__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getProducts1__R() {
        return products1R;
    }

    /**
     * Sets the value of the products1__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setProducts1__R(QueryResult value) {
        this.products1R = value;
    }

    /**
     * Gets the value of the products2__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getProducts2__R() {
        return products2R;
    }

    /**
     * Sets the value of the products2__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setProducts2__R(QueryResult value) {
        this.products2R = value;
    }

    /**
     * Gets the value of the products3__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getProducts3__R() {
        return products3R;
    }

    /**
     * Sets the value of the products3__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setProducts3__R(QueryResult value) {
        this.products3R = value;
    }

    /**
     * Gets the value of the products4__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getProducts4__R() {
        return products4R;
    }

    /**
     * Sets the value of the products4__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setProducts4__R(QueryResult value) {
        this.products4R = value;
    }

    /**
     * Gets the value of the products__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getProducts__R() {
        return productsR;
    }

    /**
     * Sets the value of the products__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setProducts__R(QueryResult value) {
        this.productsR = value;
    }

    /**
     * Gets the value of the publisher__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisher__C() {
        return publisherC;
    }

    /**
     * Sets the value of the publisher__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisher__C(String value) {
        this.publisherC = value;
    }

    /**
     * Gets the value of the sfdc_Description__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSFDC_Description__C() {
        return sfdcDescriptionC;
    }

    /**
     * Sets the value of the sfdc_Description__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSFDC_Description__C(String value) {
        this.sfdcDescriptionC = value;
    }

    /**
     * Gets the value of the search_Flag__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSearch_Flag__C() {
        return searchFlagC;
    }

    /**
     * Sets the value of the search_Flag__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSearch_Flag__C(Boolean value) {
        this.searchFlagC = value;
    }

    /**
     * Gets the value of the sort_Order__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSort_Order__C() {
        return sortOrderC;
    }

    /**
     * Sets the value of the sort_Order__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSort_Order__C(Double value) {
        this.sortOrderC = value;
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
