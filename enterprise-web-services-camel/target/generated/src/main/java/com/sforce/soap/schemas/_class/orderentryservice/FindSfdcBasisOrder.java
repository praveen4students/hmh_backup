
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
 *         &lt;element name="crit" type="{http://soap.sforce.com/schemas/class/OrderEntryService}BasisOrderSearchCriteria"/>
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
@XmlRootElement(name = "findSfdcBasisOrder")
public class FindSfdcBasisOrder {

    @XmlElement(required = true, nillable = true)
    protected BasisOrderSearchCriteria crit;

    /**
     * Gets the value of the crit property.
     * 
     * @return
     *     possible object is
     *     {@link BasisOrderSearchCriteria }
     *     
     */
    public BasisOrderSearchCriteria getCrit() {
        return crit;
    }

    /**
     * Sets the value of the crit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasisOrderSearchCriteria }
     *     
     */
    public void setCrit(BasisOrderSearchCriteria value) {
        this.crit = value;
    }

}
