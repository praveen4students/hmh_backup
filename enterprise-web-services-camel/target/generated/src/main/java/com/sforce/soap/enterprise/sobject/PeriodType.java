
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Period complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Period">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="FiscalYearSettings" type="{urn:sobject.enterprise.soap.sforce.com}FiscalYearSettings" minOccurs="0"/>
 *         &lt;element name="FiscalYearSettingsId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="IsForecastPeriod" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PeriodLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuarterLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "Period", propOrder = {
    "endDate",
    "fiscalYearSettings",
    "fiscalYearSettingsId",
    "isForecastPeriod",
    "number",
    "periodLabel",
    "quarterLabel",
    "startDate",
    "systemModstamp",
    "type"
})
public class PeriodType
    extends SObjectType
{

    @XmlElement(name = "EndDate", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "FiscalYearSettings", nillable = true)
    protected FiscalYearSettingsType fiscalYearSettings;
    @XmlElement(name = "FiscalYearSettingsId", nillable = true)
    protected String fiscalYearSettingsId;
    @XmlElement(name = "IsForecastPeriod", nillable = true)
    protected Boolean isForecastPeriod;
    @XmlElement(name = "Number", nillable = true)
    protected Integer number;
    @XmlElement(name = "PeriodLabel", nillable = true)
    protected String periodLabel;
    @XmlElement(name = "QuarterLabel", nillable = true)
    protected String quarterLabel;
    @XmlElement(name = "StartDate", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "Type", nillable = true)
    protected String type;

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
     * Gets the value of the fiscalYearSettings property.
     * 
     * @return
     *     possible object is
     *     {@link FiscalYearSettingsType }
     *     
     */
    public FiscalYearSettingsType getFiscalYearSettings() {
        return fiscalYearSettings;
    }

    /**
     * Sets the value of the fiscalYearSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link FiscalYearSettingsType }
     *     
     */
    public void setFiscalYearSettings(FiscalYearSettingsType value) {
        this.fiscalYearSettings = value;
    }

    /**
     * Gets the value of the fiscalYearSettingsId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiscalYearSettingsId() {
        return fiscalYearSettingsId;
    }

    /**
     * Sets the value of the fiscalYearSettingsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiscalYearSettingsId(String value) {
        this.fiscalYearSettingsId = value;
    }

    /**
     * Gets the value of the isForecastPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsForecastPeriod() {
        return isForecastPeriod;
    }

    /**
     * Sets the value of the isForecastPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsForecastPeriod(Boolean value) {
        this.isForecastPeriod = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumber(Integer value) {
        this.number = value;
    }

    /**
     * Gets the value of the periodLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodLabel() {
        return periodLabel;
    }

    /**
     * Sets the value of the periodLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodLabel(String value) {
        this.periodLabel = value;
    }

    /**
     * Gets the value of the quarterLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuarterLabel() {
        return quarterLabel;
    }

    /**
     * Sets the value of the quarterLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuarterLabel(String value) {
        this.quarterLabel = value;
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
