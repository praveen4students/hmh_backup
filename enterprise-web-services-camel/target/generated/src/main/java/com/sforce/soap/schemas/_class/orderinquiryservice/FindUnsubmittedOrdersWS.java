
package com.sforce.soap.schemas._class.orderinquiryservice;

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
 *         &lt;element name="crit" type="{http://soap.sforce.com/schemas/class/OrderInquiryService}FindOrderCriteria"/>
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
    "crit"
})
@XmlRootElement(name = "findUnsubmittedOrdersWS")
public class FindUnsubmittedOrdersWS {

    @XmlElement(required = true, nillable = true)
    protected FindOrderCriteria crit;

    /**
     * Gets the value of the crit property.
     * 
     * @return
     *     possible object is
     *     {@link FindOrderCriteria }
     *     
     */
    public FindOrderCriteria getCrit() {
        return crit;
    }

    /**
     * Sets the value of the crit property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindOrderCriteria }
     *     
     */
    public void setCrit(FindOrderCriteria value) {
        this.crit = value;
    }

}
