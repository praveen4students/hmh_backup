
package com.sforce.soap.schemas._class.orderentryservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderNote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderNote">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adHocNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adHocNoteTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderNote", propOrder = {
    "adHocNote",
    "adHocNoteTitle"
})
public class OrderNote {

    @XmlElement(nillable = true)
    protected String adHocNote;
    @XmlElement(nillable = true)
    protected String adHocNoteTitle;

    /**
     * Gets the value of the adHocNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdHocNote() {
        return adHocNote;
    }

    /**
     * Sets the value of the adHocNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdHocNote(String value) {
        this.adHocNote = value;
    }

    /**
     * Gets the value of the adHocNoteTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdHocNoteTitle() {
        return adHocNoteTitle;
    }

    /**
     * Sets the value of the adHocNoteTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdHocNoteTitle(String value) {
        this.adHocNoteTitle = value;
    }

}
