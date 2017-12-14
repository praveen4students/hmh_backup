
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ContentDocumentLink complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentDocumentLink">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="ContentDocument" type="{urn:sobject.enterprise.soap.sforce.com}ContentDocument" minOccurs="0"/>
 *         &lt;element name="ContentDocumentId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LinkedEntity" type="{urn:sobject.enterprise.soap.sforce.com}Name" minOccurs="0"/>
 *         &lt;element name="LinkedEntityId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
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
@XmlType(name = "ContentDocumentLink", propOrder = {
    "contentDocument",
    "contentDocumentId",
    "isDeleted",
    "linkedEntity",
    "linkedEntityId",
    "systemModstamp"
})
public class ContentDocumentLinkType
    extends SObjectType
{

    @XmlElement(name = "ContentDocument", nillable = true)
    protected ContentDocumentType contentDocument;
    @XmlElement(name = "ContentDocumentId", nillable = true)
    protected String contentDocumentId;
    @XmlElement(name = "IsDeleted", nillable = true)
    protected Boolean isDeleted;
    @XmlElement(name = "LinkedEntity", nillable = true)
    protected NameType linkedEntity;
    @XmlElement(name = "LinkedEntityId", nillable = true)
    protected String linkedEntityId;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;

    /**
     * Gets the value of the contentDocument property.
     * 
     * @return
     *     possible object is
     *     {@link ContentDocumentType }
     *     
     */
    public ContentDocumentType getContentDocument() {
        return contentDocument;
    }

    /**
     * Sets the value of the contentDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentDocumentType }
     *     
     */
    public void setContentDocument(ContentDocumentType value) {
        this.contentDocument = value;
    }

    /**
     * Gets the value of the contentDocumentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentDocumentId() {
        return contentDocumentId;
    }

    /**
     * Sets the value of the contentDocumentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentDocumentId(String value) {
        this.contentDocumentId = value;
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
     * Gets the value of the linkedEntity property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getLinkedEntity() {
        return linkedEntity;
    }

    /**
     * Sets the value of the linkedEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setLinkedEntity(NameType value) {
        this.linkedEntity = value;
    }

    /**
     * Gets the value of the linkedEntityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkedEntityId() {
        return linkedEntityId;
    }

    /**
     * Sets the value of the linkedEntityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkedEntityId(String value) {
        this.linkedEntityId = value;
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
