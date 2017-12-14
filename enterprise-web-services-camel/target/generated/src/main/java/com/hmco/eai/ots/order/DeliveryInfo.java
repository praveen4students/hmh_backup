
package com.hmco.eai.ots.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="projectedShippingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="projectedShippingQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "projectedShippingDate",
    "projectedShippingQuantity"
})
@XmlRootElement(name = "deliveryInfo")
public class DeliveryInfo {

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar projectedShippingDate;
    protected Integer projectedShippingQuantity;

    /**
     * Gets the value of the projectedShippingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProjectedShippingDate() {
        return projectedShippingDate;
    }

    /**
     * Sets the value of the projectedShippingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProjectedShippingDate(XMLGregorianCalendar value) {
        this.projectedShippingDate = value;
    }

    /**
     * Gets the value of the projectedShippingQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProjectedShippingQuantity() {
        return projectedShippingQuantity;
    }

    /**
     * Sets the value of the projectedShippingQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProjectedShippingQuantity(Integer value) {
        this.projectedShippingQuantity = value;
    }

}
