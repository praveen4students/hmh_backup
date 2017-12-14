
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sforce.soap.enterprise.QueryResult;


/**
 * <p>Java class for FiscalYearSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FiscalYearSettings">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="IsStandardYear" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PeriodId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="PeriodLabelScheme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PeriodPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Periods" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="QuarterLabelScheme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuarterPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="WeekLabelScheme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WeekStartDay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="YearType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FiscalYearSettings", propOrder = {
    "description",
    "endDate",
    "isStandardYear",
    "name",
    "periodId",
    "periodLabelScheme",
    "periodPrefix",
    "periods",
    "quarterLabelScheme",
    "quarterPrefix",
    "startDate",
    "systemModstamp",
    "weekLabelScheme",
    "weekStartDay",
    "yearType"
})
public class FiscalYearSettingsType
    extends SObjectType
{

    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "EndDate", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "IsStandardYear", nillable = true)
    protected Boolean isStandardYear;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "PeriodId", nillable = true)
    protected String periodId;
    @XmlElement(name = "PeriodLabelScheme", nillable = true)
    protected String periodLabelScheme;
    @XmlElement(name = "PeriodPrefix", nillable = true)
    protected String periodPrefix;
    @XmlElement(name = "Periods", nillable = true)
    protected QueryResult periods;
    @XmlElement(name = "QuarterLabelScheme", nillable = true)
    protected String quarterLabelScheme;
    @XmlElement(name = "QuarterPrefix", nillable = true)
    protected String quarterPrefix;
    @XmlElement(name = "StartDate", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "WeekLabelScheme", nillable = true)
    protected String weekLabelScheme;
    @XmlElement(name = "WeekStartDay", nillable = true)
    protected Integer weekStartDay;
    @XmlElement(name = "YearType", nillable = true)
    protected String yearType;

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
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the isStandardYear property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsStandardYear() {
        return isStandardYear;
    }

    /**
     * Sets the value of the isStandardYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsStandardYear(Boolean value) {
        this.isStandardYear = value;
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
     * Gets the value of the periodLabelScheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodLabelScheme() {
        return periodLabelScheme;
    }

    /**
     * Sets the value of the periodLabelScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodLabelScheme(String value) {
        this.periodLabelScheme = value;
    }

    /**
     * Gets the value of the periodPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodPrefix() {
        return periodPrefix;
    }

    /**
     * Sets the value of the periodPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodPrefix(String value) {
        this.periodPrefix = value;
    }

    /**
     * Gets the value of the periods property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getPeriods() {
        return periods;
    }

    /**
     * Sets the value of the periods property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setPeriods(QueryResult value) {
        this.periods = value;
    }

    /**
     * Gets the value of the quarterLabelScheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuarterLabelScheme() {
        return quarterLabelScheme;
    }

    /**
     * Sets the value of the quarterLabelScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuarterLabelScheme(String value) {
        this.quarterLabelScheme = value;
    }

    /**
     * Gets the value of the quarterPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuarterPrefix() {
        return quarterPrefix;
    }

    /**
     * Sets the value of the quarterPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuarterPrefix(String value) {
        this.quarterPrefix = value;
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
     * Gets the value of the weekLabelScheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeekLabelScheme() {
        return weekLabelScheme;
    }

    /**
     * Sets the value of the weekLabelScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeekLabelScheme(String value) {
        this.weekLabelScheme = value;
    }

    /**
     * Gets the value of the weekStartDay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWeekStartDay() {
        return weekStartDay;
    }

    /**
     * Sets the value of the weekStartDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWeekStartDay(Integer value) {
        this.weekStartDay = value;
    }

    /**
     * Gets the value of the yearType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearType() {
        return yearType;
    }

    /**
     * Sets the value of the yearType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearType(String value) {
        this.yearType = value;
    }

}
