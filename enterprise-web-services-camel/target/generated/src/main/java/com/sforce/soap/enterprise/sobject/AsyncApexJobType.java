
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AsyncApexJob complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AsyncApexJob">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="ApexClass" type="{urn:sobject.enterprise.soap.sforce.com}ApexClass" minOccurs="0"/>
 *         &lt;element name="ApexClassId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CompletedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ExtendedStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JobItemsProcessed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="JobType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastProcessed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastProcessedOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MethodName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberOfErrors" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ParentJobId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalJobItems" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AsyncApexJob", propOrder = {
    "apexClass",
    "apexClassId",
    "completedDate",
    "createdBy",
    "createdById",
    "createdDate",
    "extendedStatus",
    "jobItemsProcessed",
    "jobType",
    "lastProcessed",
    "lastProcessedOffset",
    "methodName",
    "numberOfErrors",
    "parentJobId",
    "status",
    "totalJobItems"
})
public class AsyncApexJobType
    extends SObjectType
{

    @XmlElement(name = "ApexClass", nillable = true)
    protected ApexClassType apexClass;
    @XmlElement(name = "ApexClassId", nillable = true)
    protected String apexClassId;
    @XmlElement(name = "CompletedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar completedDate;
    @XmlElement(name = "CreatedBy", nillable = true)
    protected UserType createdBy;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "ExtendedStatus", nillable = true)
    protected String extendedStatus;
    @XmlElement(name = "JobItemsProcessed", nillable = true)
    protected Integer jobItemsProcessed;
    @XmlElement(name = "JobType", nillable = true)
    protected String jobType;
    @XmlElement(name = "LastProcessed", nillable = true)
    protected String lastProcessed;
    @XmlElement(name = "LastProcessedOffset", nillable = true)
    protected Integer lastProcessedOffset;
    @XmlElement(name = "MethodName", nillable = true)
    protected String methodName;
    @XmlElement(name = "NumberOfErrors", nillable = true)
    protected Integer numberOfErrors;
    @XmlElement(name = "ParentJobId", nillable = true)
    protected String parentJobId;
    @XmlElement(name = "Status", nillable = true)
    protected String status;
    @XmlElement(name = "TotalJobItems", nillable = true)
    protected Integer totalJobItems;

    /**
     * Gets the value of the apexClass property.
     * 
     * @return
     *     possible object is
     *     {@link ApexClassType }
     *     
     */
    public ApexClassType getApexClass() {
        return apexClass;
    }

    /**
     * Sets the value of the apexClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApexClassType }
     *     
     */
    public void setApexClass(ApexClassType value) {
        this.apexClass = value;
    }

    /**
     * Gets the value of the apexClassId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApexClassId() {
        return apexClassId;
    }

    /**
     * Sets the value of the apexClassId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApexClassId(String value) {
        this.apexClassId = value;
    }

    /**
     * Gets the value of the completedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompletedDate() {
        return completedDate;
    }

    /**
     * Sets the value of the completedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompletedDate(XMLGregorianCalendar value) {
        this.completedDate = value;
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
     * Gets the value of the extendedStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedStatus() {
        return extendedStatus;
    }

    /**
     * Sets the value of the extendedStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedStatus(String value) {
        this.extendedStatus = value;
    }

    /**
     * Gets the value of the jobItemsProcessed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getJobItemsProcessed() {
        return jobItemsProcessed;
    }

    /**
     * Sets the value of the jobItemsProcessed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setJobItemsProcessed(Integer value) {
        this.jobItemsProcessed = value;
    }

    /**
     * Gets the value of the jobType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobType() {
        return jobType;
    }

    /**
     * Sets the value of the jobType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobType(String value) {
        this.jobType = value;
    }

    /**
     * Gets the value of the lastProcessed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastProcessed() {
        return lastProcessed;
    }

    /**
     * Sets the value of the lastProcessed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastProcessed(String value) {
        this.lastProcessed = value;
    }

    /**
     * Gets the value of the lastProcessedOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLastProcessedOffset() {
        return lastProcessedOffset;
    }

    /**
     * Sets the value of the lastProcessedOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLastProcessedOffset(Integer value) {
        this.lastProcessedOffset = value;
    }

    /**
     * Gets the value of the methodName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethodName() {
        return methodName;
    }

    /**
     * Sets the value of the methodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethodName(String value) {
        this.methodName = value;
    }

    /**
     * Gets the value of the numberOfErrors property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfErrors() {
        return numberOfErrors;
    }

    /**
     * Sets the value of the numberOfErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfErrors(Integer value) {
        this.numberOfErrors = value;
    }

    /**
     * Gets the value of the parentJobId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentJobId() {
        return parentJobId;
    }

    /**
     * Sets the value of the parentJobId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentJobId(String value) {
        this.parentJobId = value;
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
     * Gets the value of the totalJobItems property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalJobItems() {
        return totalJobItems;
    }

    /**
     * Sets the value of the totalJobItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalJobItems(Integer value) {
        this.totalJobItems = value;
    }

}
