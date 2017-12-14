
package com.hmco.eai.ots.material.getatp;

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
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Material/GetATP}MATNR"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Material/GetATP}QUANTITY"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Material/GetATP}FLEX1" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Material/GetATP}FLEX2" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Material/GetATP}FLEX3" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Material/GetATP}SUCCESS" minOccurs="0"/>
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
    "matnr",
    "quantity",
    "flex1",
    "flex2",
    "flex3",
    "success"
})
@XmlRootElement(name = "ATP_DETAIL_LIST")
public class ATPDETAILLIST {

    @XmlElement(name = "MATNR", required = true)
    protected String matnr;
    @XmlElement(name = "QUANTITY", required = true)
    protected String quantity;
    @XmlElement(name = "FLEX1")
    protected String flex1;
    @XmlElement(name = "FLEX2")
    protected String flex2;
    @XmlElement(name = "FLEX3")
    protected String flex3;
    @XmlElement(name = "SUCCESS")
    protected String success;

    /**
     * Gets the value of the matnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMATNR() {
        return matnr;
    }

    /**
     * Sets the value of the matnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMATNR(String value) {
        this.matnr = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQUANTITY() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQUANTITY(String value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the flex1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLEX1() {
        return flex1;
    }

    /**
     * Sets the value of the flex1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLEX1(String value) {
        this.flex1 = value;
    }

    /**
     * Gets the value of the flex2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLEX2() {
        return flex2;
    }

    /**
     * Sets the value of the flex2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLEX2(String value) {
        this.flex2 = value;
    }

    /**
     * Gets the value of the flex3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLEX3() {
        return flex3;
    }

    /**
     * Sets the value of the flex3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLEX3(String value) {
        this.flex3 = value;
    }

    /**
     * Gets the value of the success property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUCCESS() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUCCESS(String value) {
        this.success = value;
    }

}
