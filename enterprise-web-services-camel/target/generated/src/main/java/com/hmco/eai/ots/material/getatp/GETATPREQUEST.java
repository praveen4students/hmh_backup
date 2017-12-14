
package com.hmco.eai.ots.material.getatp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GET_ATP_REQUEST complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GET_ATP_REQUEST">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Material/GetATP}COUNTRY" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Material/GetATP}REGION" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Material/GetATP}CUST_ID" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Material/GetATP}DIST_CHNL" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Material/GetATP}DIVISION" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Material/GetATP}ITEM_TYPE" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Material/GetATP}MDR" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Material/GetATP}SALES_ORG" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Material/GetATP}ORDER_TYPE" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Material/GetATP}FLEX1" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Material/GetATP}FLEX2" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Material/GetATP}FLEX3" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Material/GetATP}ATP_MATERIAL_LIST"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_ATP_REQUEST", propOrder = {
    "country",
    "region",
    "custid",
    "distchnl",
    "division",
    "itemtype",
    "mdr",
    "salesorg",
    "ordertype",
    "flex1",
    "flex2",
    "flex3",
    "atpmateriallist"
})
public class GETATPREQUEST {

    @XmlElement(name = "COUNTRY")
    protected String country;
    @XmlElement(name = "REGION")
    protected String region;
    @XmlElement(name = "CUST_ID")
    protected String custid;
    @XmlElement(name = "DIST_CHNL")
    protected String distchnl;
    @XmlElement(name = "DIVISION")
    protected String division;
    @XmlElement(name = "ITEM_TYPE")
    protected String itemtype;
    @XmlElement(name = "MDR")
    protected String mdr;
    @XmlElement(name = "SALES_ORG")
    protected String salesorg;
    @XmlElement(name = "ORDER_TYPE")
    protected String ordertype;
    @XmlElement(name = "FLEX1")
    protected String flex1;
    @XmlElement(name = "FLEX2")
    protected String flex2;
    @XmlElement(name = "FLEX3")
    protected String flex3;
    @XmlElement(name = "ATP_MATERIAL_LIST", required = true)
    protected ATPMATERIALLIST atpmateriallist;

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOUNTRY() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOUNTRY(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREGION() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREGION(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the custid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTID() {
        return custid;
    }

    /**
     * Sets the value of the custid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTID(String value) {
        this.custid = value;
    }

    /**
     * Gets the value of the distchnl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISTCHNL() {
        return distchnl;
    }

    /**
     * Sets the value of the distchnl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISTCHNL(String value) {
        this.distchnl = value;
    }

    /**
     * Gets the value of the division property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIVISION() {
        return division;
    }

    /**
     * Sets the value of the division property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIVISION(String value) {
        this.division = value;
    }

    /**
     * Gets the value of the itemtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITEMTYPE() {
        return itemtype;
    }

    /**
     * Sets the value of the itemtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITEMTYPE(String value) {
        this.itemtype = value;
    }

    /**
     * Gets the value of the mdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDR() {
        return mdr;
    }

    /**
     * Sets the value of the mdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDR(String value) {
        this.mdr = value;
    }

    /**
     * Gets the value of the salesorg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSALESORG() {
        return salesorg;
    }

    /**
     * Sets the value of the salesorg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSALESORG(String value) {
        this.salesorg = value;
    }

    /**
     * Gets the value of the ordertype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORDERTYPE() {
        return ordertype;
    }

    /**
     * Sets the value of the ordertype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORDERTYPE(String value) {
        this.ordertype = value;
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
     * Gets the value of the atpmateriallist property.
     * 
     * @return
     *     possible object is
     *     {@link ATPMATERIALLIST }
     *     
     */
    public ATPMATERIALLIST getATPMATERIALLIST() {
        return atpmateriallist;
    }

    /**
     * Sets the value of the atpmateriallist property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATPMATERIALLIST }
     *     
     */
    public void setATPMATERIALLIST(ATPMATERIALLIST value) {
        this.atpmateriallist = value;
    }

}
