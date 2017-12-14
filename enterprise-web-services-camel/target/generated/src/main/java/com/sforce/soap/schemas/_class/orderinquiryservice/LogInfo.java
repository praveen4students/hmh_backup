
package com.sforce.soap.schemas._class.orderinquiryservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LogInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LogInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="category" type="{http://soap.sforce.com/schemas/class/OrderInquiryService}LogCategory"/>
 *         &lt;element name="level" type="{http://soap.sforce.com/schemas/class/OrderInquiryService}LogCategoryLevel"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogInfo", propOrder = {
    "category",
    "level"
})
public class LogInfo {

    @XmlElement(required = true)
    protected LogCategory category;
    @XmlElement(required = true)
    protected LogCategoryLevel level;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link LogCategory }
     *     
     */
    public LogCategory getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogCategory }
     *     
     */
    public void setCategory(LogCategory value) {
        this.category = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link LogCategoryLevel }
     *     
     */
    public LogCategoryLevel getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogCategoryLevel }
     *     
     */
    public void setLevel(LogCategoryLevel value) {
        this.level = value;
    }

}
