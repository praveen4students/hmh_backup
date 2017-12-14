
package com.hmco.eai.ots.material;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for substitution complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="substitution">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="key">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="materialID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="isbn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Material}substitutionValue" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "substitution", propOrder = {
    "key",
    "substitutionValue"
})
public class Substitution {

    @XmlElement(required = true)
    protected Substitution.Key key;
    @XmlElement(required = true)
    protected List<SubstitutionValue> substitutionValue;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link Substitution.Key }
     *     
     */
    public Substitution.Key getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link Substitution.Key }
     *     
     */
    public void setKey(Substitution.Key value) {
        this.key = value;
    }

    /**
     * Gets the value of the substitutionValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the substitutionValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubstitutionValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubstitutionValue }
     * 
     * 
     */
    public List<SubstitutionValue> getSubstitutionValue() {
        if (substitutionValue == null) {
            substitutionValue = new ArrayList<SubstitutionValue>();
        }
        return this.substitutionValue;
    }


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
     *         &lt;element name="materialID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="isbn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "materialID",
        "isbn"
    })
    public static class Key {

        protected String materialID;
        protected String isbn;

        /**
         * Gets the value of the materialID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMaterialID() {
            return materialID;
        }

        /**
         * Sets the value of the materialID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMaterialID(String value) {
            this.materialID = value;
        }

        /**
         * Gets the value of the isbn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIsbn() {
            return isbn;
        }

        /**
         * Sets the value of the isbn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIsbn(String value) {
            this.isbn = value;
        }

    }

}
