
package com.hmco.eai.ots.order;

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
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}sfdcTransactionHeader" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}resultCode" minOccurs="0"/>
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
    "sfdcTransactionHeader",
    "resultCode"
})
@XmlRootElement(name = "findsfdcTransactionResponse")
public class FindsfdcTransactionResponse {

    protected SfdcTransactionHeader sfdcTransactionHeader;
    protected String resultCode;

    /**
     * Gets the value of the sfdcTransactionHeader property.
     * 
     * @return
     *     possible object is
     *     {@link SfdcTransactionHeader }
     *     
     */
    public SfdcTransactionHeader getSfdcTransactionHeader() {
        return sfdcTransactionHeader;
    }

    /**
     * Sets the value of the sfdcTransactionHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link SfdcTransactionHeader }
     *     
     */
    public void setSfdcTransactionHeader(SfdcTransactionHeader value) {
        this.sfdcTransactionHeader = value;
    }

    /**
     * Gets the value of the resultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultCode(String value) {
        this.resultCode = value;
    }

}
