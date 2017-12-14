
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sforce.soap.enterprise.QueryResult;


/**
 * <p>Java class for QuantityForecast complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuantityForecast">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="Closed" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Commit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CommitComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommitOverride" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DefaultRollupCommit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DefaultRollupUpside" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="InvalidationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ManagerChoiceCommit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManagerChoiceUpside" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManagerClosed" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ManagerCommit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ManagerCommitOverride" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ManagerDefaultRollupCommit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ManagerDefaultRollupUpside" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ManagerId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ManagerOpportunityRollupCommit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ManagerOpportunityRollupUpside" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ManagerPipeline" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ManagerTerritoryId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ManagerUpside" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ManagerUpsideOverride" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="OpportunityRollupClosed" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="OpportunityRollupCommit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="OpportunityRollupPipeline" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="OpportunityRollupUpside" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Owner" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="OwnerId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="PeriodId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Pipeline" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ProductFamily" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuantityForecastHistories" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Quota" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TerritoryId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Upside" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="UpsideComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpsideOverride" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityForecast", propOrder = {
    "closed",
    "commit",
    "commitComment",
    "commitOverride",
    "createdBy",
    "createdById",
    "createdDate",
    "defaultRollupCommit",
    "defaultRollupUpside",
    "invalidationDate",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "managerChoiceCommit",
    "managerChoiceUpside",
    "managerClosed",
    "managerCommit",
    "managerCommitOverride",
    "managerDefaultRollupCommit",
    "managerDefaultRollupUpside",
    "managerId",
    "managerOpportunityRollupCommit",
    "managerOpportunityRollupUpside",
    "managerPipeline",
    "managerTerritoryId",
    "managerUpside",
    "managerUpsideOverride",
    "opportunityRollupClosed",
    "opportunityRollupCommit",
    "opportunityRollupPipeline",
    "opportunityRollupUpside",
    "owner",
    "ownerId",
    "periodId",
    "pipeline",
    "productFamily",
    "quantityForecastHistories",
    "quota",
    "startDate",
    "systemModstamp",
    "territoryId",
    "upside",
    "upsideComment",
    "upsideOverride"
})
public class QuantityForecastType
    extends SObjectType
{

    @XmlElement(name = "Closed", nillable = true)
    protected Double closed;
    @XmlElement(name = "Commit", nillable = true)
    protected Double commit;
    @XmlElement(name = "CommitComment", nillable = true)
    protected String commitComment;
    @XmlElement(name = "CommitOverride", nillable = true)
    protected Double commitOverride;
    @XmlElement(name = "CreatedBy", nillable = true)
    protected UserType createdBy;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "DefaultRollupCommit", nillable = true)
    protected Double defaultRollupCommit;
    @XmlElement(name = "DefaultRollupUpside", nillable = true)
    protected Double defaultRollupUpside;
    @XmlElement(name = "InvalidationDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar invalidationDate;
    @XmlElement(name = "LastModifiedBy", nillable = true)
    protected UserType lastModifiedBy;
    @XmlElement(name = "LastModifiedById", nillable = true)
    protected String lastModifiedById;
    @XmlElement(name = "LastModifiedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlElement(name = "ManagerChoiceCommit", nillable = true)
    protected String managerChoiceCommit;
    @XmlElement(name = "ManagerChoiceUpside", nillable = true)
    protected String managerChoiceUpside;
    @XmlElement(name = "ManagerClosed", nillable = true)
    protected Double managerClosed;
    @XmlElement(name = "ManagerCommit", nillable = true)
    protected Double managerCommit;
    @XmlElement(name = "ManagerCommitOverride", nillable = true)
    protected Double managerCommitOverride;
    @XmlElement(name = "ManagerDefaultRollupCommit", nillable = true)
    protected Double managerDefaultRollupCommit;
    @XmlElement(name = "ManagerDefaultRollupUpside", nillable = true)
    protected Double managerDefaultRollupUpside;
    @XmlElement(name = "ManagerId", nillable = true)
    protected String managerId;
    @XmlElement(name = "ManagerOpportunityRollupCommit", nillable = true)
    protected Double managerOpportunityRollupCommit;
    @XmlElement(name = "ManagerOpportunityRollupUpside", nillable = true)
    protected Double managerOpportunityRollupUpside;
    @XmlElement(name = "ManagerPipeline", nillable = true)
    protected Double managerPipeline;
    @XmlElement(name = "ManagerTerritoryId", nillable = true)
    protected String managerTerritoryId;
    @XmlElement(name = "ManagerUpside", nillable = true)
    protected Double managerUpside;
    @XmlElement(name = "ManagerUpsideOverride", nillable = true)
    protected Double managerUpsideOverride;
    @XmlElement(name = "OpportunityRollupClosed", nillable = true)
    protected Double opportunityRollupClosed;
    @XmlElement(name = "OpportunityRollupCommit", nillable = true)
    protected Double opportunityRollupCommit;
    @XmlElement(name = "OpportunityRollupPipeline", nillable = true)
    protected Double opportunityRollupPipeline;
    @XmlElement(name = "OpportunityRollupUpside", nillable = true)
    protected Double opportunityRollupUpside;
    @XmlElement(name = "Owner", nillable = true)
    protected UserType owner;
    @XmlElement(name = "OwnerId", nillable = true)
    protected String ownerId;
    @XmlElement(name = "PeriodId", nillable = true)
    protected String periodId;
    @XmlElement(name = "Pipeline", nillable = true)
    protected Double pipeline;
    @XmlElement(name = "ProductFamily", nillable = true)
    protected String productFamily;
    @XmlElement(name = "QuantityForecastHistories", nillable = true)
    protected QueryResult quantityForecastHistories;
    @XmlElement(name = "Quota", nillable = true)
    protected Double quota;
    @XmlElement(name = "StartDate", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "TerritoryId", nillable = true)
    protected String territoryId;
    @XmlElement(name = "Upside", nillable = true)
    protected Double upside;
    @XmlElement(name = "UpsideComment", nillable = true)
    protected String upsideComment;
    @XmlElement(name = "UpsideOverride", nillable = true)
    protected Double upsideOverride;

    /**
     * Gets the value of the closed property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getClosed() {
        return closed;
    }

    /**
     * Sets the value of the closed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setClosed(Double value) {
        this.closed = value;
    }

    /**
     * Gets the value of the commit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCommit() {
        return commit;
    }

    /**
     * Sets the value of the commit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCommit(Double value) {
        this.commit = value;
    }

    /**
     * Gets the value of the commitComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommitComment() {
        return commitComment;
    }

    /**
     * Sets the value of the commitComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommitComment(String value) {
        this.commitComment = value;
    }

    /**
     * Gets the value of the commitOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCommitOverride() {
        return commitOverride;
    }

    /**
     * Sets the value of the commitOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCommitOverride(Double value) {
        this.commitOverride = value;
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
     * Gets the value of the defaultRollupCommit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDefaultRollupCommit() {
        return defaultRollupCommit;
    }

    /**
     * Sets the value of the defaultRollupCommit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDefaultRollupCommit(Double value) {
        this.defaultRollupCommit = value;
    }

    /**
     * Gets the value of the defaultRollupUpside property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDefaultRollupUpside() {
        return defaultRollupUpside;
    }

    /**
     * Sets the value of the defaultRollupUpside property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDefaultRollupUpside(Double value) {
        this.defaultRollupUpside = value;
    }

    /**
     * Gets the value of the invalidationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInvalidationDate() {
        return invalidationDate;
    }

    /**
     * Sets the value of the invalidationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInvalidationDate(XMLGregorianCalendar value) {
        this.invalidationDate = value;
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
     * Gets the value of the managerChoiceCommit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerChoiceCommit() {
        return managerChoiceCommit;
    }

    /**
     * Sets the value of the managerChoiceCommit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerChoiceCommit(String value) {
        this.managerChoiceCommit = value;
    }

    /**
     * Gets the value of the managerChoiceUpside property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerChoiceUpside() {
        return managerChoiceUpside;
    }

    /**
     * Sets the value of the managerChoiceUpside property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerChoiceUpside(String value) {
        this.managerChoiceUpside = value;
    }

    /**
     * Gets the value of the managerClosed property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getManagerClosed() {
        return managerClosed;
    }

    /**
     * Sets the value of the managerClosed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setManagerClosed(Double value) {
        this.managerClosed = value;
    }

    /**
     * Gets the value of the managerCommit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getManagerCommit() {
        return managerCommit;
    }

    /**
     * Sets the value of the managerCommit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setManagerCommit(Double value) {
        this.managerCommit = value;
    }

    /**
     * Gets the value of the managerCommitOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getManagerCommitOverride() {
        return managerCommitOverride;
    }

    /**
     * Sets the value of the managerCommitOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setManagerCommitOverride(Double value) {
        this.managerCommitOverride = value;
    }

    /**
     * Gets the value of the managerDefaultRollupCommit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getManagerDefaultRollupCommit() {
        return managerDefaultRollupCommit;
    }

    /**
     * Sets the value of the managerDefaultRollupCommit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setManagerDefaultRollupCommit(Double value) {
        this.managerDefaultRollupCommit = value;
    }

    /**
     * Gets the value of the managerDefaultRollupUpside property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getManagerDefaultRollupUpside() {
        return managerDefaultRollupUpside;
    }

    /**
     * Sets the value of the managerDefaultRollupUpside property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setManagerDefaultRollupUpside(Double value) {
        this.managerDefaultRollupUpside = value;
    }

    /**
     * Gets the value of the managerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerId() {
        return managerId;
    }

    /**
     * Sets the value of the managerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerId(String value) {
        this.managerId = value;
    }

    /**
     * Gets the value of the managerOpportunityRollupCommit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getManagerOpportunityRollupCommit() {
        return managerOpportunityRollupCommit;
    }

    /**
     * Sets the value of the managerOpportunityRollupCommit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setManagerOpportunityRollupCommit(Double value) {
        this.managerOpportunityRollupCommit = value;
    }

    /**
     * Gets the value of the managerOpportunityRollupUpside property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getManagerOpportunityRollupUpside() {
        return managerOpportunityRollupUpside;
    }

    /**
     * Sets the value of the managerOpportunityRollupUpside property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setManagerOpportunityRollupUpside(Double value) {
        this.managerOpportunityRollupUpside = value;
    }

    /**
     * Gets the value of the managerPipeline property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getManagerPipeline() {
        return managerPipeline;
    }

    /**
     * Sets the value of the managerPipeline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setManagerPipeline(Double value) {
        this.managerPipeline = value;
    }

    /**
     * Gets the value of the managerTerritoryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerTerritoryId() {
        return managerTerritoryId;
    }

    /**
     * Sets the value of the managerTerritoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerTerritoryId(String value) {
        this.managerTerritoryId = value;
    }

    /**
     * Gets the value of the managerUpside property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getManagerUpside() {
        return managerUpside;
    }

    /**
     * Sets the value of the managerUpside property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setManagerUpside(Double value) {
        this.managerUpside = value;
    }

    /**
     * Gets the value of the managerUpsideOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getManagerUpsideOverride() {
        return managerUpsideOverride;
    }

    /**
     * Sets the value of the managerUpsideOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setManagerUpsideOverride(Double value) {
        this.managerUpsideOverride = value;
    }

    /**
     * Gets the value of the opportunityRollupClosed property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOpportunityRollupClosed() {
        return opportunityRollupClosed;
    }

    /**
     * Sets the value of the opportunityRollupClosed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOpportunityRollupClosed(Double value) {
        this.opportunityRollupClosed = value;
    }

    /**
     * Gets the value of the opportunityRollupCommit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOpportunityRollupCommit() {
        return opportunityRollupCommit;
    }

    /**
     * Sets the value of the opportunityRollupCommit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOpportunityRollupCommit(Double value) {
        this.opportunityRollupCommit = value;
    }

    /**
     * Gets the value of the opportunityRollupPipeline property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOpportunityRollupPipeline() {
        return opportunityRollupPipeline;
    }

    /**
     * Sets the value of the opportunityRollupPipeline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOpportunityRollupPipeline(Double value) {
        this.opportunityRollupPipeline = value;
    }

    /**
     * Gets the value of the opportunityRollupUpside property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOpportunityRollupUpside() {
        return opportunityRollupUpside;
    }

    /**
     * Sets the value of the opportunityRollupUpside property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOpportunityRollupUpside(Double value) {
        this.opportunityRollupUpside = value;
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
     * Gets the value of the periodId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodId() {
        return periodId;
    }

    /**
     * Sets the value of the periodId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodId(String value) {
        this.periodId = value;
    }

    /**
     * Gets the value of the pipeline property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPipeline() {
        return pipeline;
    }

    /**
     * Sets the value of the pipeline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPipeline(Double value) {
        this.pipeline = value;
    }

    /**
     * Gets the value of the productFamily property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductFamily() {
        return productFamily;
    }

    /**
     * Sets the value of the productFamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductFamily(String value) {
        this.productFamily = value;
    }

    /**
     * Gets the value of the quantityForecastHistories property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getQuantityForecastHistories() {
        return quantityForecastHistories;
    }

    /**
     * Sets the value of the quantityForecastHistories property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setQuantityForecastHistories(QueryResult value) {
        this.quantityForecastHistories = value;
    }

    /**
     * Gets the value of the quota property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuota() {
        return quota;
    }

    /**
     * Sets the value of the quota property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuota(Double value) {
        this.quota = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
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
     * Gets the value of the territoryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerritoryId() {
        return territoryId;
    }

    /**
     * Sets the value of the territoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerritoryId(String value) {
        this.territoryId = value;
    }

    /**
     * Gets the value of the upside property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUpside() {
        return upside;
    }

    /**
     * Sets the value of the upside property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUpside(Double value) {
        this.upside = value;
    }

    /**
     * Gets the value of the upsideComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpsideComment() {
        return upsideComment;
    }

    /**
     * Sets the value of the upsideComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpsideComment(String value) {
        this.upsideComment = value;
    }

    /**
     * Gets the value of the upsideOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUpsideOverride() {
        return upsideOverride;
    }

    /**
     * Sets the value of the upsideOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUpsideOverride(Double value) {
        this.upsideOverride = value;
    }

}
