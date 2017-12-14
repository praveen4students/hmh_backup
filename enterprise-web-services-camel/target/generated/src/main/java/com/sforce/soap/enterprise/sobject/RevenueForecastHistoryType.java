
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RevenueForecastHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RevenueForecastHistory">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="Closed" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Commit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CommitComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommitOverridden" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ForecastOverride" type="{urn:sobject.enterprise.soap.sforce.com}RevenueForecast" minOccurs="0"/>
 *         &lt;element name="ForecastOverrideId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Pipeline" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Quota" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Upside" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="UpsideComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpsideOverridden" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RevenueForecastHistory", propOrder = {
    "closed",
    "commit",
    "commitComments",
    "commitOverridden",
    "createdBy",
    "createdById",
    "createdDate",
    "forecastOverride",
    "forecastOverrideId",
    "pipeline",
    "quota",
    "systemModstamp",
    "upside",
    "upsideComments",
    "upsideOverridden"
})
public class RevenueForecastHistoryType
    extends SObjectType
{

    @XmlElement(name = "Closed", nillable = true)
    protected Double closed;
    @XmlElement(name = "Commit", nillable = true)
    protected Double commit;
    @XmlElement(name = "CommitComments", nillable = true)
    protected String commitComments;
    @XmlElement(name = "CommitOverridden", nillable = true)
    protected Boolean commitOverridden;
    @XmlElement(name = "CreatedBy", nillable = true)
    protected UserType createdBy;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "ForecastOverride", nillable = true)
    protected RevenueForecastType forecastOverride;
    @XmlElement(name = "ForecastOverrideId", nillable = true)
    protected String forecastOverrideId;
    @XmlElement(name = "Pipeline", nillable = true)
    protected Double pipeline;
    @XmlElement(name = "Quota", nillable = true)
    protected Double quota;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "Upside", nillable = true)
    protected Double upside;
    @XmlElement(name = "UpsideComments", nillable = true)
    protected String upsideComments;
    @XmlElement(name = "UpsideOverridden", nillable = true)
    protected Boolean upsideOverridden;

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
     * Gets the value of the commitComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommitComments() {
        return commitComments;
    }

    /**
     * Sets the value of the commitComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommitComments(String value) {
        this.commitComments = value;
    }

    /**
     * Gets the value of the commitOverridden property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCommitOverridden() {
        return commitOverridden;
    }

    /**
     * Sets the value of the commitOverridden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCommitOverridden(Boolean value) {
        this.commitOverridden = value;
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
     * Gets the value of the forecastOverride property.
     * 
     * @return
     *     possible object is
     *     {@link RevenueForecastType }
     *     
     */
    public RevenueForecastType getForecastOverride() {
        return forecastOverride;
    }

    /**
     * Sets the value of the forecastOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevenueForecastType }
     *     
     */
    public void setForecastOverride(RevenueForecastType value) {
        this.forecastOverride = value;
    }

    /**
     * Gets the value of the forecastOverrideId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForecastOverrideId() {
        return forecastOverrideId;
    }

    /**
     * Sets the value of the forecastOverrideId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForecastOverrideId(String value) {
        this.forecastOverrideId = value;
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
     * Gets the value of the upsideComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpsideComments() {
        return upsideComments;
    }

    /**
     * Sets the value of the upsideComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpsideComments(String value) {
        this.upsideComments = value;
    }

    /**
     * Gets the value of the upsideOverridden property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpsideOverridden() {
        return upsideOverridden;
    }

    /**
     * Sets the value of the upsideOverridden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpsideOverridden(Boolean value) {
        this.upsideOverridden = value;
    }

}
