
package com.hmco.eai.ots.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCustomerRelationshipsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCustomerRelationshipsRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Customer}customerID"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Customer}division"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Customer}relationshipTypeList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCustomerRelationshipsRequest", propOrder = {
    "customerID",
    "division",
    "relationshipTypeList"
})
public class GetCustomerRelationshipsRequest {

    @XmlElement(required = true)
    protected String customerID;
    @XmlElement(required = true)
    protected String division;
    @XmlElement(required = true)
    protected RelationshipTypeList relationshipTypeList;

    /**
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerID(String value) {
        this.customerID = value;
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
     * Gets the value of the relationshipTypeList property.
     * 
     * @return
     *     possible object is
     *     {@link RelationshipTypeList }
     *     
     */
    public RelationshipTypeList getRelationshipTypeList() {
        return relationshipTypeList;
    }

    /**
     * Sets the value of the relationshipTypeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationshipTypeList }
     *     
     */
    public void setRelationshipTypeList(RelationshipTypeList value) {
        this.relationshipTypeList = value;
    }

}
