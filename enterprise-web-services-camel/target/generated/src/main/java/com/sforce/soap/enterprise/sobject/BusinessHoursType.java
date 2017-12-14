
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sforce.soap.enterprise.QueryResult;


/**
 * <p>Java class for BusinessHours complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessHours">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="Cases" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FridayEndTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="FridayStartTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MondayEndTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="MondayStartTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SaturdayEndTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="SaturdayStartTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="SundayEndTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="SundayStartTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ThursdayEndTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="ThursdayStartTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="TimeZoneSidKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TuesdayEndTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="TuesdayStartTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="WednesdayEndTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="WednesdayStartTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessHours", propOrder = {
    "cases",
    "createdBy",
    "createdById",
    "createdDate",
    "fridayEndTime",
    "fridayStartTime",
    "isActive",
    "isDefault",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "mondayEndTime",
    "mondayStartTime",
    "name",
    "saturdayEndTime",
    "saturdayStartTime",
    "sundayEndTime",
    "sundayStartTime",
    "systemModstamp",
    "thursdayEndTime",
    "thursdayStartTime",
    "timeZoneSidKey",
    "tuesdayEndTime",
    "tuesdayStartTime",
    "wednesdayEndTime",
    "wednesdayStartTime"
})
public class BusinessHoursType
    extends SObjectType
{

    @XmlElement(name = "Cases", nillable = true)
    protected QueryResult cases;
    @XmlElement(name = "CreatedBy", nillable = true)
    protected UserType createdBy;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "FridayEndTime", nillable = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar fridayEndTime;
    @XmlElement(name = "FridayStartTime", nillable = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar fridayStartTime;
    @XmlElement(name = "IsActive", nillable = true)
    protected Boolean isActive;
    @XmlElement(name = "IsDefault", nillable = true)
    protected Boolean isDefault;
    @XmlElement(name = "LastModifiedBy", nillable = true)
    protected UserType lastModifiedBy;
    @XmlElement(name = "LastModifiedById", nillable = true)
    protected String lastModifiedById;
    @XmlElement(name = "LastModifiedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlElement(name = "MondayEndTime", nillable = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar mondayEndTime;
    @XmlElement(name = "MondayStartTime", nillable = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar mondayStartTime;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "SaturdayEndTime", nillable = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar saturdayEndTime;
    @XmlElement(name = "SaturdayStartTime", nillable = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar saturdayStartTime;
    @XmlElement(name = "SundayEndTime", nillable = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar sundayEndTime;
    @XmlElement(name = "SundayStartTime", nillable = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar sundayStartTime;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "ThursdayEndTime", nillable = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar thursdayEndTime;
    @XmlElement(name = "ThursdayStartTime", nillable = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar thursdayStartTime;
    @XmlElement(name = "TimeZoneSidKey", nillable = true)
    protected String timeZoneSidKey;
    @XmlElement(name = "TuesdayEndTime", nillable = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar tuesdayEndTime;
    @XmlElement(name = "TuesdayStartTime", nillable = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar tuesdayStartTime;
    @XmlElement(name = "WednesdayEndTime", nillable = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar wednesdayEndTime;
    @XmlElement(name = "WednesdayStartTime", nillable = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar wednesdayStartTime;

    /**
     * Gets the value of the cases property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getCases() {
        return cases;
    }

    /**
     * Sets the value of the cases property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setCases(QueryResult value) {
        this.cases = value;
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
     * Gets the value of the fridayEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFridayEndTime() {
        return fridayEndTime;
    }

    /**
     * Sets the value of the fridayEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFridayEndTime(XMLGregorianCalendar value) {
        this.fridayEndTime = value;
    }

    /**
     * Gets the value of the fridayStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFridayStartTime() {
        return fridayStartTime;
    }

    /**
     * Sets the value of the fridayStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFridayStartTime(XMLGregorianCalendar value) {
        this.fridayStartTime = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the isDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDefault() {
        return isDefault;
    }

    /**
     * Sets the value of the isDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDefault(Boolean value) {
        this.isDefault = value;
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
     * Gets the value of the mondayEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMondayEndTime() {
        return mondayEndTime;
    }

    /**
     * Sets the value of the mondayEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMondayEndTime(XMLGregorianCalendar value) {
        this.mondayEndTime = value;
    }

    /**
     * Gets the value of the mondayStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMondayStartTime() {
        return mondayStartTime;
    }

    /**
     * Sets the value of the mondayStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMondayStartTime(XMLGregorianCalendar value) {
        this.mondayStartTime = value;
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
     * Gets the value of the saturdayEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSaturdayEndTime() {
        return saturdayEndTime;
    }

    /**
     * Sets the value of the saturdayEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSaturdayEndTime(XMLGregorianCalendar value) {
        this.saturdayEndTime = value;
    }

    /**
     * Gets the value of the saturdayStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSaturdayStartTime() {
        return saturdayStartTime;
    }

    /**
     * Sets the value of the saturdayStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSaturdayStartTime(XMLGregorianCalendar value) {
        this.saturdayStartTime = value;
    }

    /**
     * Gets the value of the sundayEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSundayEndTime() {
        return sundayEndTime;
    }

    /**
     * Sets the value of the sundayEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSundayEndTime(XMLGregorianCalendar value) {
        this.sundayEndTime = value;
    }

    /**
     * Gets the value of the sundayStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSundayStartTime() {
        return sundayStartTime;
    }

    /**
     * Sets the value of the sundayStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSundayStartTime(XMLGregorianCalendar value) {
        this.sundayStartTime = value;
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
     * Gets the value of the thursdayEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getThursdayEndTime() {
        return thursdayEndTime;
    }

    /**
     * Sets the value of the thursdayEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setThursdayEndTime(XMLGregorianCalendar value) {
        this.thursdayEndTime = value;
    }

    /**
     * Gets the value of the thursdayStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getThursdayStartTime() {
        return thursdayStartTime;
    }

    /**
     * Sets the value of the thursdayStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setThursdayStartTime(XMLGregorianCalendar value) {
        this.thursdayStartTime = value;
    }

    /**
     * Gets the value of the timeZoneSidKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZoneSidKey() {
        return timeZoneSidKey;
    }

    /**
     * Sets the value of the timeZoneSidKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZoneSidKey(String value) {
        this.timeZoneSidKey = value;
    }

    /**
     * Gets the value of the tuesdayEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTuesdayEndTime() {
        return tuesdayEndTime;
    }

    /**
     * Sets the value of the tuesdayEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTuesdayEndTime(XMLGregorianCalendar value) {
        this.tuesdayEndTime = value;
    }

    /**
     * Gets the value of the tuesdayStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTuesdayStartTime() {
        return tuesdayStartTime;
    }

    /**
     * Sets the value of the tuesdayStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTuesdayStartTime(XMLGregorianCalendar value) {
        this.tuesdayStartTime = value;
    }

    /**
     * Gets the value of the wednesdayEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWednesdayEndTime() {
        return wednesdayEndTime;
    }

    /**
     * Sets the value of the wednesdayEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWednesdayEndTime(XMLGregorianCalendar value) {
        this.wednesdayEndTime = value;
    }

    /**
     * Gets the value of the wednesdayStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWednesdayStartTime() {
        return wednesdayStartTime;
    }

    /**
     * Sets the value of the wednesdayStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWednesdayStartTime(XMLGregorianCalendar value) {
        this.wednesdayStartTime = value;
    }

}
