
package com.hmco.eai.ots.order;

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
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}submitSampleTranAction"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}sampleHeader"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}sampleLineItemList"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}clientTransactionID" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}poNumber"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}submitForManualCorrection"/>
 *         &lt;element name="tranType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "submitSampleTranAction",
    "sampleHeader",
    "sampleLineItemList",
    "clientTransactionID",
    "poNumber",
    "submitForManualCorrection",
    "tranType"
})
@XmlRootElement(name = "submitSampleRequest")
public class SubmitSampleRequest {

    @XmlElement(required = true)
    protected String submitSampleTranAction;
    @XmlElement(required = true)
    protected SampleHeader sampleHeader;
    @XmlElement(required = true)
    protected SampleLineItemList sampleLineItemList;
    protected String clientTransactionID;
    @XmlElement(required = true)
    protected String poNumber;
    protected boolean submitForManualCorrection;
    protected String tranType;

    /**
     * Gets the value of the submitSampleTranAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmitSampleTranAction() {
        return submitSampleTranAction;
    }

    /**
     * Sets the value of the submitSampleTranAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmitSampleTranAction(String value) {
        this.submitSampleTranAction = value;
    }

    /**
     * Gets the value of the sampleHeader property.
     * 
     * @return
     *     possible object is
     *     {@link SampleHeader }
     *     
     */
    public SampleHeader getSampleHeader() {
        return sampleHeader;
    }

    /**
     * Sets the value of the sampleHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link SampleHeader }
     *     
     */
    public void setSampleHeader(SampleHeader value) {
        this.sampleHeader = value;
    }

    /**
     * Gets the value of the sampleLineItemList property.
     * 
     * @return
     *     possible object is
     *     {@link SampleLineItemList }
     *     
     */
    public SampleLineItemList getSampleLineItemList() {
        return sampleLineItemList;
    }

    /**
     * Sets the value of the sampleLineItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SampleLineItemList }
     *     
     */
    public void setSampleLineItemList(SampleLineItemList value) {
        this.sampleLineItemList = value;
    }

    /**
     * Gets the value of the clientTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientTransactionID() {
        return clientTransactionID;
    }

    /**
     * Sets the value of the clientTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientTransactionID(String value) {
        this.clientTransactionID = value;
    }

    /**
     * Gets the value of the poNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoNumber() {
        return poNumber;
    }

    /**
     * Sets the value of the poNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoNumber(String value) {
        this.poNumber = value;
    }

    /**
     * Gets the value of the submitForManualCorrection property.
     * 
     */
    public boolean isSubmitForManualCorrection() {
        return submitForManualCorrection;
    }

    /**
     * Sets the value of the submitForManualCorrection property.
     * 
     */
    public void setSubmitForManualCorrection(boolean value) {
        this.submitForManualCorrection = value;
    }

    /**
     * Gets the value of the tranType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranType() {
        return tranType;
    }

    /**
     * Sets the value of the tranType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranType(String value) {
        this.tranType = value;
    }

}
