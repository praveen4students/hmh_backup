
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sforce.soap.enterprise.QueryResult;


/**
 * <p>Java class for UserRole complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserRole">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="CaseAccessForAccountOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactAccessForAccountOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ForecastUserId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MayForecastManagerShare" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OpportunityAccessForAccountOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentRoleId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="PortalAccountId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="PortalAccountOwnerId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="PortalType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RollupDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Users" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserRole", propOrder = {
    "caseAccessForAccountOwner",
    "contactAccessForAccountOwner",
    "forecastUserId",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "mayForecastManagerShare",
    "name",
    "opportunityAccessForAccountOwner",
    "parentRoleId",
    "portalAccountId",
    "portalAccountOwnerId",
    "portalType",
    "rollupDescription",
    "systemModstamp",
    "users"
})
public class UserRoleType
    extends SObjectType
{

    @XmlElement(name = "CaseAccessForAccountOwner", nillable = true)
    protected String caseAccessForAccountOwner;
    @XmlElement(name = "ContactAccessForAccountOwner", nillable = true)
    protected String contactAccessForAccountOwner;
    @XmlElement(name = "ForecastUserId", nillable = true)
    protected String forecastUserId;
    @XmlElement(name = "LastModifiedBy", nillable = true)
    protected UserType lastModifiedBy;
    @XmlElement(name = "LastModifiedById", nillable = true)
    protected String lastModifiedById;
    @XmlElement(name = "LastModifiedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlElement(name = "MayForecastManagerShare", nillable = true)
    protected Boolean mayForecastManagerShare;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "OpportunityAccessForAccountOwner", nillable = true)
    protected String opportunityAccessForAccountOwner;
    @XmlElement(name = "ParentRoleId", nillable = true)
    protected String parentRoleId;
    @XmlElement(name = "PortalAccountId", nillable = true)
    protected String portalAccountId;
    @XmlElement(name = "PortalAccountOwnerId", nillable = true)
    protected String portalAccountOwnerId;
    @XmlElement(name = "PortalType", nillable = true)
    protected String portalType;
    @XmlElement(name = "RollupDescription", nillable = true)
    protected String rollupDescription;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "Users", nillable = true)
    protected QueryResult users;

    /**
     * Gets the value of the caseAccessForAccountOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseAccessForAccountOwner() {
        return caseAccessForAccountOwner;
    }

    /**
     * Sets the value of the caseAccessForAccountOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseAccessForAccountOwner(String value) {
        this.caseAccessForAccountOwner = value;
    }

    /**
     * Gets the value of the contactAccessForAccountOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactAccessForAccountOwner() {
        return contactAccessForAccountOwner;
    }

    /**
     * Sets the value of the contactAccessForAccountOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactAccessForAccountOwner(String value) {
        this.contactAccessForAccountOwner = value;
    }

    /**
     * Gets the value of the forecastUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForecastUserId() {
        return forecastUserId;
    }

    /**
     * Sets the value of the forecastUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForecastUserId(String value) {
        this.forecastUserId = value;
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
     * Gets the value of the mayForecastManagerShare property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMayForecastManagerShare() {
        return mayForecastManagerShare;
    }

    /**
     * Sets the value of the mayForecastManagerShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMayForecastManagerShare(Boolean value) {
        this.mayForecastManagerShare = value;
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
     * Gets the value of the opportunityAccessForAccountOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpportunityAccessForAccountOwner() {
        return opportunityAccessForAccountOwner;
    }

    /**
     * Sets the value of the opportunityAccessForAccountOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpportunityAccessForAccountOwner(String value) {
        this.opportunityAccessForAccountOwner = value;
    }

    /**
     * Gets the value of the parentRoleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentRoleId() {
        return parentRoleId;
    }

    /**
     * Sets the value of the parentRoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentRoleId(String value) {
        this.parentRoleId = value;
    }

    /**
     * Gets the value of the portalAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortalAccountId() {
        return portalAccountId;
    }

    /**
     * Sets the value of the portalAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortalAccountId(String value) {
        this.portalAccountId = value;
    }

    /**
     * Gets the value of the portalAccountOwnerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortalAccountOwnerId() {
        return portalAccountOwnerId;
    }

    /**
     * Sets the value of the portalAccountOwnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortalAccountOwnerId(String value) {
        this.portalAccountOwnerId = value;
    }

    /**
     * Gets the value of the portalType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortalType() {
        return portalType;
    }

    /**
     * Sets the value of the portalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortalType(String value) {
        this.portalType = value;
    }

    /**
     * Gets the value of the rollupDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRollupDescription() {
        return rollupDescription;
    }

    /**
     * Sets the value of the rollupDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRollupDescription(String value) {
        this.rollupDescription = value;
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
     * Gets the value of the users property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getUsers() {
        return users;
    }

    /**
     * Sets the value of the users property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setUsers(QueryResult value) {
        this.users = value;
    }

}
