
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sforce.soap.enterprise.QueryResult;


/**
 * <p>Java class for EmailServicesFunction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmailServicesFunction">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="AddressInactiveAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Addresses" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ApexClassId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="AttachmentOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuthenticationFailureAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuthorizationFailureAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuthorizedSenders" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ErrorRoutingAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FunctionInactiveAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FunctionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsAuthenticationRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsErrorRoutingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsTextAttachmentsAsBinary" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsTextTruncated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsTlsRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="OverLimitAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "EmailServicesFunction", propOrder = {
    "addressInactiveAction",
    "addresses",
    "apexClassId",
    "attachmentOption",
    "authenticationFailureAction",
    "authorizationFailureAction",
    "authorizedSenders",
    "createdBy",
    "createdById",
    "createdDate",
    "errorRoutingAddress",
    "functionInactiveAction",
    "functionName",
    "isActive",
    "isAuthenticationRequired",
    "isErrorRoutingEnabled",
    "isTextAttachmentsAsBinary",
    "isTextTruncated",
    "isTlsRequired",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "overLimitAction",
    "systemModstamp"
})
public class EmailServicesFunctionType
    extends SObjectType
{

    @XmlElement(name = "AddressInactiveAction", nillable = true)
    protected String addressInactiveAction;
    @XmlElement(name = "Addresses", nillable = true)
    protected QueryResult addresses;
    @XmlElement(name = "ApexClassId", nillable = true)
    protected String apexClassId;
    @XmlElement(name = "AttachmentOption", nillable = true)
    protected String attachmentOption;
    @XmlElement(name = "AuthenticationFailureAction", nillable = true)
    protected String authenticationFailureAction;
    @XmlElement(name = "AuthorizationFailureAction", nillable = true)
    protected String authorizationFailureAction;
    @XmlElement(name = "AuthorizedSenders", nillable = true)
    protected String authorizedSenders;
    @XmlElement(name = "CreatedBy", nillable = true)
    protected UserType createdBy;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "ErrorRoutingAddress", nillable = true)
    protected String errorRoutingAddress;
    @XmlElement(name = "FunctionInactiveAction", nillable = true)
    protected String functionInactiveAction;
    @XmlElement(name = "FunctionName", nillable = true)
    protected String functionName;
    @XmlElement(name = "IsActive", nillable = true)
    protected Boolean isActive;
    @XmlElement(name = "IsAuthenticationRequired", nillable = true)
    protected Boolean isAuthenticationRequired;
    @XmlElement(name = "IsErrorRoutingEnabled", nillable = true)
    protected Boolean isErrorRoutingEnabled;
    @XmlElement(name = "IsTextAttachmentsAsBinary", nillable = true)
    protected Boolean isTextAttachmentsAsBinary;
    @XmlElement(name = "IsTextTruncated", nillable = true)
    protected Boolean isTextTruncated;
    @XmlElement(name = "IsTlsRequired", nillable = true)
    protected Boolean isTlsRequired;
    @XmlElement(name = "LastModifiedBy", nillable = true)
    protected UserType lastModifiedBy;
    @XmlElement(name = "LastModifiedById", nillable = true)
    protected String lastModifiedById;
    @XmlElement(name = "LastModifiedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlElement(name = "OverLimitAction", nillable = true)
    protected String overLimitAction;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;

    /**
     * Gets the value of the addressInactiveAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressInactiveAction() {
        return addressInactiveAction;
    }

    /**
     * Sets the value of the addressInactiveAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressInactiveAction(String value) {
        this.addressInactiveAction = value;
    }

    /**
     * Gets the value of the addresses property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getAddresses() {
        return addresses;
    }

    /**
     * Sets the value of the addresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setAddresses(QueryResult value) {
        this.addresses = value;
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
     * Gets the value of the attachmentOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentOption() {
        return attachmentOption;
    }

    /**
     * Sets the value of the attachmentOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentOption(String value) {
        this.attachmentOption = value;
    }

    /**
     * Gets the value of the authenticationFailureAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationFailureAction() {
        return authenticationFailureAction;
    }

    /**
     * Sets the value of the authenticationFailureAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationFailureAction(String value) {
        this.authenticationFailureAction = value;
    }

    /**
     * Gets the value of the authorizationFailureAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationFailureAction() {
        return authorizationFailureAction;
    }

    /**
     * Sets the value of the authorizationFailureAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationFailureAction(String value) {
        this.authorizationFailureAction = value;
    }

    /**
     * Gets the value of the authorizedSenders property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizedSenders() {
        return authorizedSenders;
    }

    /**
     * Sets the value of the authorizedSenders property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizedSenders(String value) {
        this.authorizedSenders = value;
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
     * Gets the value of the errorRoutingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorRoutingAddress() {
        return errorRoutingAddress;
    }

    /**
     * Sets the value of the errorRoutingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorRoutingAddress(String value) {
        this.errorRoutingAddress = value;
    }

    /**
     * Gets the value of the functionInactiveAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionInactiveAction() {
        return functionInactiveAction;
    }

    /**
     * Sets the value of the functionInactiveAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionInactiveAction(String value) {
        this.functionInactiveAction = value;
    }

    /**
     * Gets the value of the functionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionName() {
        return functionName;
    }

    /**
     * Sets the value of the functionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionName(String value) {
        this.functionName = value;
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
     * Gets the value of the isAuthenticationRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAuthenticationRequired() {
        return isAuthenticationRequired;
    }

    /**
     * Sets the value of the isAuthenticationRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAuthenticationRequired(Boolean value) {
        this.isAuthenticationRequired = value;
    }

    /**
     * Gets the value of the isErrorRoutingEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsErrorRoutingEnabled() {
        return isErrorRoutingEnabled;
    }

    /**
     * Sets the value of the isErrorRoutingEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsErrorRoutingEnabled(Boolean value) {
        this.isErrorRoutingEnabled = value;
    }

    /**
     * Gets the value of the isTextAttachmentsAsBinary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTextAttachmentsAsBinary() {
        return isTextAttachmentsAsBinary;
    }

    /**
     * Sets the value of the isTextAttachmentsAsBinary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTextAttachmentsAsBinary(Boolean value) {
        this.isTextAttachmentsAsBinary = value;
    }

    /**
     * Gets the value of the isTextTruncated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTextTruncated() {
        return isTextTruncated;
    }

    /**
     * Sets the value of the isTextTruncated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTextTruncated(Boolean value) {
        this.isTextTruncated = value;
    }

    /**
     * Gets the value of the isTlsRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTlsRequired() {
        return isTlsRequired;
    }

    /**
     * Sets the value of the isTlsRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTlsRequired(Boolean value) {
        this.isTlsRequired = value;
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
     * Gets the value of the overLimitAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverLimitAction() {
        return overLimitAction;
    }

    /**
     * Sets the value of the overLimitAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverLimitAction(String value) {
        this.overLimitAction = value;
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
