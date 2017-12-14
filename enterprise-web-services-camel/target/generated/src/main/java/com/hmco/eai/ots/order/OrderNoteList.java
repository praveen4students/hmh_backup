
package com.hmco.eai.ots.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}adHocNoteTitle" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}adHocNote" minOccurs="0"/>
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
    "adHocNoteTitle",
    "adHocNote"
})
@XmlRootElement(name = "orderNoteList")
public class OrderNoteList {

    protected String adHocNoteTitle;
    protected String adHocNote;

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

}
