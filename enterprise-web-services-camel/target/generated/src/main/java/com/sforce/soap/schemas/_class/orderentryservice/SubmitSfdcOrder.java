
package com.sforce.soap.schemas._class.orderentryservice;

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
 *         &lt;element name="order" type="{http://soap.sforce.com/schemas/class/OrderEntryService}SubmitOrder"/>
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
    "order"
})
@XmlRootElement(name = "submitSfdcOrder")
public class SubmitSfdcOrder {

    @XmlElement(required = true, nillable = true)
    protected SubmitOrder order;

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link SubmitOrder }
     *     
     */
    public SubmitOrder getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmitOrder }
     *     
     */
    public void setOrder(SubmitOrder value) {
        this.order = value;
    }

}
