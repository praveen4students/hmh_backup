
package com.hmco.eai.ots.eskertransaction;

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
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/EskerTransaction}resultCode"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/EskerTransaction}cpoSfdcOrderNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/EskerTransaction}cpoId" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/EskerTransaction}message" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/EskerTransaction}dataOut1" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/EskerTransaction}dataOut2" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/EskerTransaction}dataOut3" minOccurs="0"/>
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
    "resultCode",
    "cpoSfdcOrderNumber",
    "cpoId",
    "message",
    "dataOut1",
    "dataOut2",
    "dataOut3"
})
@XmlRootElement(name = "EskerTransactionResult")
public class EskerTransactionResult {

    protected int resultCode;
    protected String cpoSfdcOrderNumber;
    protected String cpoId;
    protected String message;
    protected String dataOut1;
    protected String dataOut2;
    protected String dataOut3;

    /**
     * Gets the value of the resultCode property.
     * 
     */
    public int getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     */
    public void setResultCode(int value) {
        this.resultCode = value;
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

}
