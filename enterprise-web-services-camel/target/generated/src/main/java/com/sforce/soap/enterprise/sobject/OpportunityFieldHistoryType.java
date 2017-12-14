
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OpportunityFieldHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpportunityFieldHistory">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}Name" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Division" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Field" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NewValue" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="OldValue" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="Opportunity" type="{urn:sobject.enterprise.soap.sforce.com}Opportunity" minOccurs="0"/>
 *         &lt;element name="OpportunityId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpportunityFieldHistory", propOrder = {
    "createdBy",
    "createdById",
    "createdDate",
    "division",
    "field",
    "isDeleted",
    "newValue",
    "oldValue",
    "opportunity",
    "opportunityId"
})
public class OpportunityFieldHistoryType
    extends SObjectType
{

    @XmlElement(name = "CreatedBy", nillable = true)
    protected NameType createdBy;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "Division", nillable = true)
    protected String division;
    @XmlElement(name = "Field", nillable = true)
    protected String field;
    @XmlElement(name = "IsDeleted", nillable = true)
    protected Boolean isDeleted;
    @XmlElement(name = "NewValue", nillable = true)
    protected Object newValue;
    @XmlElement(name = "OldValue", nillable = true)
    protected Object oldValue;
    @XmlElement(name = "Opportunity", nillable = true)
    protected OpportunityType opportunity;
    @XmlElement(name = "OpportunityId", nillable = true)
    protected String opportunityId;

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
     * Gets the value of the division property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivision() {
        return division;
    }

    /**
     * Sets the value of the division property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivision(String value) {
        this.division = value;
    }

    /**
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField(String value) {
        this.field = value;
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
     * Gets the value of the newValue property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNewValue() {
        return newValue;
    }

    /**
     * Sets the value of the newValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNewValue(Object value) {
        this.newValue = value;
    }

    /**
     * Gets the value of the oldValue property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOldValue() {
        return oldValue;
    }

    /**
     * Sets the value of the oldValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOldValue(Object value) {
        this.oldValue = value;
    }

    /**
     * Gets the value of the opportunity property.
     * 
     * @return
     *     possible object is
     *     {@link OpportunityType }
     *     
     */
    public OpportunityType getOpportunity() {
        return opportunity;
    }

    /**
     * Sets the value of the opportunity property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpportunityType }
     *     
     */
    public void setOpportunity(OpportunityType value) {
        this.opportunity = value;
    }

    /**
     * Gets the value of the opportunityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpportunityId() {
        return opportunityId;
    }

    /**
     * Sets the value of the opportunityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpportunityId(String value) {
        this.opportunityId = value;
    }

}
