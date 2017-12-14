
package com.hmco.eai.ots.transactionnew;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="repID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="repName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sfaRepID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "repID",
    "repName",
    "sfaRepID"
})
@XmlRootElement(name = "salesRep")
public class SalesRep {

    @XmlElement(required = true)
    protected String repID;
    @XmlElement(required = true)
    protected String repName;
    protected String sfaRepID;

    /**
     * Gets the value of the repID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepID() {
        return repID;
    }

    /**
     * Sets the value of the repID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepID(String value) {
        this.repID = value;
    }

    /**
     * Gets the value of the repName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepName() {
        return repName;
    }

    /**
     * Sets the value of the repName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepName(String value) {
        this.repName = value;
    }

    /**
     * Gets the value of the sfaRepID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfaRepID() {
        return sfaRepID;
    }

    /**
     * Sets the value of the sfaRepID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfaRepID(String value) {
        this.sfaRepID = value;
    }

}
