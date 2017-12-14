
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Holiday complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Holiday">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="ActivityDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndTimeInMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsAllDay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsRecurrence" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecurrenceDayOfMonth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RecurrenceDayOfWeekMask" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RecurrenceEndDateOnly" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="RecurrenceInstance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecurrenceInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RecurrenceMonthOfYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecurrenceStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="RecurrenceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartTimeInMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "Holiday", propOrder = {
    "activityDate",
    "createdBy",
    "createdById",
    "createdDate",
    "description",
    "endTimeInMinutes",
    "isAllDay",
    "isRecurrence",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "name",
    "recurrenceDayOfMonth",
    "recurrenceDayOfWeekMask",
    "recurrenceEndDateOnly",
    "recurrenceInstance",
    "recurrenceInterval",
    "recurrenceMonthOfYear",
    "recurrenceStartDate",
    "recurrenceType",
    "startTimeInMinutes",
    "systemModstamp"
})
public class HolidayType
    extends SObjectType
{

    @XmlElement(name = "ActivityDate", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar activityDate;
    @XmlElement(name = "CreatedBy", nillable = true)
    protected UserType createdBy;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "EndTimeInMinutes", nillable = true)
    protected Integer endTimeInMinutes;
    @XmlElement(name = "IsAllDay", nillable = true)
    protected Boolean isAllDay;
    @XmlElement(name = "IsRecurrence", nillable = true)
    protected Boolean isRecurrence;
    @XmlElement(name = "LastModifiedBy", nillable = true)
    protected UserType lastModifiedBy;
    @XmlElement(name = "LastModifiedById", nillable = true)
    protected String lastModifiedById;
    @XmlElement(name = "LastModifiedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "RecurrenceDayOfMonth", nillable = true)
    protected Integer recurrenceDayOfMonth;
    @XmlElement(name = "RecurrenceDayOfWeekMask", nillable = true)
    protected Integer recurrenceDayOfWeekMask;
    @XmlElement(name = "RecurrenceEndDateOnly", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar recurrenceEndDateOnly;
    @XmlElement(name = "RecurrenceInstance", nillable = true)
    protected String recurrenceInstance;
    @XmlElement(name = "RecurrenceInterval", nillable = true)
    protected Integer recurrenceInterval;
    @XmlElement(name = "RecurrenceMonthOfYear", nillable = true)
    protected String recurrenceMonthOfYear;
    @XmlElement(name = "RecurrenceStartDate", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar recurrenceStartDate;
    @XmlElement(name = "RecurrenceType", nillable = true)
    protected String recurrenceType;
    @XmlElement(name = "StartTimeInMinutes", nillable = true)
    protected Integer startTimeInMinutes;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;

    /**
     * Gets the value of the activityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivityDate() {
        return activityDate;
    }

    /**
     * Sets the value of the activityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivityDate(XMLGregorianCalendar value) {
        this.activityDate = value;
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
     * Gets the value of the endTimeInMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEndTimeInMinutes() {
        return endTimeInMinutes;
    }

    /**
     * Sets the value of the endTimeInMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEndTimeInMinutes(Integer value) {
        this.endTimeInMinutes = value;
    }

    /**
     * Gets the value of the isAllDay property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAllDay() {
        return isAllDay;
    }

    /**
     * Sets the value of the isAllDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAllDay(Boolean value) {
        this.isAllDay = value;
    }

    /**
     * Gets the value of the isRecurrence property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRecurrence() {
        return isRecurrence;
    }

    /**
     * Sets the value of the isRecurrence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRecurrence(Boolean value) {
        this.isRecurrence = value;
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
     * Gets the value of the recurrenceDayOfMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecurrenceDayOfMonth() {
        return recurrenceDayOfMonth;
    }

    /**
     * Sets the value of the recurrenceDayOfMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecurrenceDayOfMonth(Integer value) {
        this.recurrenceDayOfMonth = value;
    }

    /**
     * Gets the value of the recurrenceDayOfWeekMask property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecurrenceDayOfWeekMask() {
        return recurrenceDayOfWeekMask;
    }

    /**
     * Sets the value of the recurrenceDayOfWeekMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecurrenceDayOfWeekMask(Integer value) {
        this.recurrenceDayOfWeekMask = value;
    }

    /**
     * Gets the value of the recurrenceEndDateOnly property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecurrenceEndDateOnly() {
        return recurrenceEndDateOnly;
    }

    /**
     * Sets the value of the recurrenceEndDateOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecurrenceEndDateOnly(XMLGregorianCalendar value) {
        this.recurrenceEndDateOnly = value;
    }

    /**
     * Gets the value of the recurrenceInstance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurrenceInstance() {
        return recurrenceInstance;
    }

    /**
     * Sets the value of the recurrenceInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurrenceInstance(String value) {
        this.recurrenceInstance = value;
    }

    /**
     * Gets the value of the recurrenceInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecurrenceInterval() {
        return recurrenceInterval;
    }

    /**
     * Sets the value of the recurrenceInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecurrenceInterval(Integer value) {
        this.recurrenceInterval = value;
    }

    /**
     * Gets the value of the recurrenceMonthOfYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurrenceMonthOfYear() {
        return recurrenceMonthOfYear;
    }

    /**
     * Sets the value of the recurrenceMonthOfYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurrenceMonthOfYear(String value) {
        this.recurrenceMonthOfYear = value;
    }

    /**
     * Gets the value of the recurrenceStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecurrenceStartDate() {
        return recurrenceStartDate;
    }

    /**
     * Sets the value of the recurrenceStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecurrenceStartDate(XMLGregorianCalendar value) {
        this.recurrenceStartDate = value;
    }

    /**
     * Gets the value of the recurrenceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurrenceType() {
        return recurrenceType;
    }

    /**
     * Sets the value of the recurrenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurrenceType(String value) {
        this.recurrenceType = value;
    }

    /**
     * Gets the value of the startTimeInMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartTimeInMinutes() {
        return startTimeInMinutes;
    }

    /**
     * Sets the value of the startTimeInMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartTimeInMinutes(Integer value) {
        this.startTimeInMinutes = value;
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
