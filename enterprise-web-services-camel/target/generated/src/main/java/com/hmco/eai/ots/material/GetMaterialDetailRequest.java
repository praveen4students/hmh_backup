
package com.hmco.eai.ots.material;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMaterialDetailRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMaterialDetailRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Material}materialKeyList"/>
 *         &lt;element name="customerID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMaterialDetailRequest", propOrder = {
    "materialKeyList",
    "customerID"
})
public class GetMaterialDetailRequest {

    @XmlElement(required = true)
    protected MaterialKeyList materialKeyList;
    protected String customerID;

    /**
     * Gets the value of the materialKeyList property.
     * 
     * @return
     *     possible object is
     *     {@link MaterialKeyList }
     *     
     */
    public MaterialKeyList getMaterialKeyList() {
        return materialKeyList;
    }

    /**
     * Sets the value of the materialKeyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaterialKeyList }
     *     
     */
    public void setMaterialKeyList(MaterialKeyList value) {
        this.materialKeyList = value;
    }

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

}
