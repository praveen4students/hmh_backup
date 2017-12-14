
package com.hmco.eai.ots.materialnew;

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
 *         &lt;element name="substituteID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="substituteISBN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="autoSubstitute" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="usePrimePrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="applySale" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="applySample" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "substituteID",
    "substituteISBN",
    "description",
    "autoSubstitute",
    "usePrimePrice",
    "applySale",
    "applySample"
})
@XmlRootElement(name = "substitutionValue")
public class SubstitutionValue {

    @XmlElement(required = true)
    protected String substituteID;
    @XmlElement(required = true)
    protected String substituteISBN;
    @XmlElement(required = true)
    protected String description;
    protected Boolean autoSubstitute;
    protected Boolean usePrimePrice;
    protected Boolean applySale;
    protected Boolean applySample;

    /**
     * Gets the value of the substituteID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubstituteID() {
        return substituteID;
    }

    /**
     * Sets the value of the substituteID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubstituteID(String value) {
        this.substituteID = value;
    }

    /**
     * Gets the value of the substituteISBN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubstituteISBN() {
        return substituteISBN;
    }

    /**
     * Sets the value of the substituteISBN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubstituteISBN(String value) {
        this.substituteISBN = value;
    }

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
     * Gets the value of the autoSubstitute property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoSubstitute() {
        return autoSubstitute;
    }

    /**
     * Sets the value of the autoSubstitute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoSubstitute(Boolean value) {
        this.autoSubstitute = value;
    }

    /**
     * Gets the value of the usePrimePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsePrimePrice() {
        return usePrimePrice;
    }

    /**
     * Sets the value of the usePrimePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsePrimePrice(Boolean value) {
        this.usePrimePrice = value;
    }

    /**
     * Gets the value of the applySale property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplySale() {
        return applySale;
    }

    /**
     * Sets the value of the applySale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplySale(Boolean value) {
        this.applySale = value;
    }

    /**
     * Gets the value of the applySample property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplySample() {
        return applySample;
    }

    /**
     * Sets the value of the applySample property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplySample(Boolean value) {
        this.applySample = value;
    }

}
