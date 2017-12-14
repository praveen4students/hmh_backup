
package com.sforce.soap.schemas._class.eskerservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EskerTransactionResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EskerTransactionResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cpoId" type="{http://soap.sforce.com/schemas/class/EskerService}ID" minOccurs="0"/>
 *         &lt;element name="cpoSfdcOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataOut1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataOut2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataOut3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resultCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EskerTransactionResult", propOrder = {
    "cpoId",
    "cpoSfdcOrderNumber",
    "dataOut1",
    "dataOut2",
    "dataOut3",
    "message",
    "resultCode"
})
public class EskerTransactionResult {

    @XmlElement(nillable = true)
    protected String cpoId;
    @XmlElement(nillable = true)
    protected String cpoSfdcOrderNumber;
    @XmlElement(nillable = true)
    protected String dataOut1;
    @XmlElement(nillable = true)
    protected String dataOut2;
    @XmlElement(nillable = true)
    protected String dataOut3;
    @XmlElement(nillable = true)
    protected String message;
    @XmlElement(nillable = true)
    protected Integer resultCode;

    /**
     * Gets the value of the cpoId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpoId() {
        return cpoId;
    }

    /**
     * Sets the value of the cpoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpoId(String value) {
        this.cpoId = value;
    }

    /**
     * Gets the value of the cpoSfdcOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpoSfdcOrderNumber() {
        return cpoSfdcOrderNumber;
    }

    /**
     * Sets the value of the cpoSfdcOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpoSfdcOrderNumber(String value) {
        this.cpoSfdcOrderNumber = value;
    }

    /**
     * Gets the value of the dataOut1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataOut1() {
        return dataOut1;
    }

    /**
     * Sets the value of the dataOut1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataOut1(String value) {
        this.dataOut1 = value;
    }

    /**
     * Gets the value of the dataOut2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataOut2() {
        return dataOut2;
    }

    /**
     * Sets the value of the dataOut2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataOut2(String value) {
        this.dataOut2 = value;
    }

    /**
     * Gets the value of the dataOut3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataOut3() {
        return dataOut3;
    }

    /**
     * Sets the value of the dataOut3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataOut3(String value) {
        this.dataOut3 = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the resultCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResultCode(Integer value) {
        this.resultCode = value;
    }

}
