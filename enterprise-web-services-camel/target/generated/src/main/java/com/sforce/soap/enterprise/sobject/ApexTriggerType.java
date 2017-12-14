
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ApexTrigger complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApexTrigger">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="ApiVersion" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Body" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BodyCrc" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="IsValid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LengthWithoutComments" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NamespacePrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TableEnumOrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UsageAfterDelete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UsageAfterInsert" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UsageAfterUndelete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UsageAfterUpdate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UsageBeforeDelete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UsageBeforeInsert" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UsageBeforeUpdate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UsageIsBulk" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApexTrigger", propOrder = {
    "apiVersion",
    "body",
    "bodyCrc",
    "createdBy",
    "createdById",
    "createdDate",
    "isValid",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "lengthWithoutComments",
    "name",
    "namespacePrefix",
    "status",
    "systemModstamp",
    "tableEnumOrId",
    "usageAfterDelete",
    "usageAfterInsert",
    "usageAfterUndelete",
    "usageAfterUpdate",
    "usageBeforeDelete",
    "usageBeforeInsert",
    "usageBeforeUpdate",
    "usageIsBulk"
})
public class ApexTriggerType
    extends SObjectType
{

    @XmlElement(name = "ApiVersion", nillable = true)
    protected Double apiVersion;
    @XmlElement(name = "Body", nillable = true)
    protected String body;
    @XmlElement(name = "BodyCrc", nillable = true)
    protected Double bodyCrc;
    @XmlElement(name = "CreatedBy", nillable = true)
    protected UserType createdBy;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "IsValid", nillable = true)
    protected Boolean isValid;
    @XmlElement(name = "LastModifiedBy", nillable = true)
    protected UserType lastModifiedBy;
    @XmlElement(name = "LastModifiedById", nillable = true)
    protected String lastModifiedById;
    @XmlElement(name = "LastModifiedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlElement(name = "LengthWithoutComments", nillable = true)
    protected Integer lengthWithoutComments;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "NamespacePrefix", nillable = true)
    protected String namespacePrefix;
    @XmlElement(name = "Status", nillable = true)
    protected String status;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "TableEnumOrId", nillable = true)
    protected String tableEnumOrId;
    @XmlElement(name = "UsageAfterDelete", nillable = true)
    protected Boolean usageAfterDelete;
    @XmlElement(name = "UsageAfterInsert", nillable = true)
    protected Boolean usageAfterInsert;
    @XmlElement(name = "UsageAfterUndelete", nillable = true)
    protected Boolean usageAfterUndelete;
    @XmlElement(name = "UsageAfterUpdate", nillable = true)
    protected Boolean usageAfterUpdate;
    @XmlElement(name = "UsageBeforeDelete", nillable = true)
    protected Boolean usageBeforeDelete;
    @XmlElement(name = "UsageBeforeInsert", nillable = true)
    protected Boolean usageBeforeInsert;
    @XmlElement(name = "UsageBeforeUpdate", nillable = true)
    protected Boolean usageBeforeUpdate;
    @XmlElement(name = "UsageIsBulk", nillable = true)
    protected Boolean usageIsBulk;

    /**
     * Gets the value of the apiVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getApiVersion() {
        return apiVersion;
    }

    /**
     * Sets the value of the apiVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setApiVersion(Double value) {
        this.apiVersion = value;
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBody(String value) {
        this.body = value;
    }

    /**
     * Gets the value of the bodyCrc property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBodyCrc() {
        return bodyCrc;
    }

    /**
     * Sets the value of the bodyCrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBodyCrc(Double value) {
        this.bodyCrc = value;
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
     * Gets the value of the isValid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsValid() {
        return isValid;
    }

    /**
     * Sets the value of the isValid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsValid(Boolean value) {
        this.isValid = value;
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
     * Gets the value of the lengthWithoutComments property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLengthWithoutComments() {
        return lengthWithoutComments;
    }

    /**
     * Sets the value of the lengthWithoutComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLengthWithoutComments(Integer value) {
        this.lengthWithoutComments = value;
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
     * Gets the value of the namespacePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamespacePrefix() {
        return namespacePrefix;
    }

    /**
     * Sets the value of the namespacePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamespacePrefix(String value) {
        this.namespacePrefix = value;
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
     * Gets the value of the tableEnumOrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableEnumOrId() {
        return tableEnumOrId;
    }

    /**
     * Sets the value of the tableEnumOrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableEnumOrId(String value) {
        this.tableEnumOrId = value;
    }

    /**
     * Gets the value of the usageAfterDelete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsageAfterDelete() {
        return usageAfterDelete;
    }

    /**
     * Sets the value of the usageAfterDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsageAfterDelete(Boolean value) {
        this.usageAfterDelete = value;
    }

    /**
     * Gets the value of the usageAfterInsert property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsageAfterInsert() {
        return usageAfterInsert;
    }

    /**
     * Sets the value of the usageAfterInsert property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsageAfterInsert(Boolean value) {
        this.usageAfterInsert = value;
    }

    /**
     * Gets the value of the usageAfterUndelete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsageAfterUndelete() {
        return usageAfterUndelete;
    }

    /**
     * Sets the value of the usageAfterUndelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsageAfterUndelete(Boolean value) {
        this.usageAfterUndelete = value;
    }

    /**
     * Gets the value of the usageAfterUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsageAfterUpdate() {
        return usageAfterUpdate;
    }

    /**
     * Sets the value of the usageAfterUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsageAfterUpdate(Boolean value) {
        this.usageAfterUpdate = value;
    }

    /**
     * Gets the value of the usageBeforeDelete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsageBeforeDelete() {
        return usageBeforeDelete;
    }

    /**
     * Sets the value of the usageBeforeDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsageBeforeDelete(Boolean value) {
        this.usageBeforeDelete = value;
    }

    /**
     * Gets the value of the usageBeforeInsert property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsageBeforeInsert() {
        return usageBeforeInsert;
    }

    /**
     * Sets the value of the usageBeforeInsert property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsageBeforeInsert(Boolean value) {
        this.usageBeforeInsert = value;
    }

    /**
     * Gets the value of the usageBeforeUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsageBeforeUpdate() {
        return usageBeforeUpdate;
    }

    /**
     * Sets the value of the usageBeforeUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsageBeforeUpdate(Boolean value) {
        this.usageBeforeUpdate = value;
    }

    /**
     * Gets the value of the usageIsBulk property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsageIsBulk() {
        return usageIsBulk;
    }

    /**
     * Sets the value of the usageIsBulk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsageIsBulk(Boolean value) {
        this.usageIsBulk = value;
    }

}
