
package com.hmco.eai.ots.customer;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Customer}billToCustomer"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Customer}emailSubject"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Customer}emailTo" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Customer}emailCc" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Customer}emailBody" maxOccurs="unbounded" minOccurs="0"/>
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
    "billToCustomer",
    "emailSubject",
    "emailTo",
    "emailCc",
    "emailBody"
})
@XmlRootElement(name = "accountStatementPDFRequest")
public class AccountStatementPDFRequest {

    @XmlElement(required = true)
    protected String billToCustomer;
    @XmlElement(required = true)
    protected String emailSubject;
    @XmlElement(required = true)
    protected List<String> emailTo;
    protected List<String> emailCc;
    protected List<String> emailBody;

    /**
     * Gets the value of the billToCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToCustomer() {
        return billToCustomer;
    }

    /**
     * Sets the value of the billToCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToCustomer(String value) {
        this.billToCustomer = value;
    }

    /**
     * Gets the value of the emailSubject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailSubject() {
        return emailSubject;
    }

    /**
     * Sets the value of the emailSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailSubject(String value) {
        this.emailSubject = value;
    }

    /**
     * Gets the value of the emailTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailTo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEmailTo() {
        if (emailTo == null) {
            emailTo = new ArrayList<String>();
        }
        return this.emailTo;
    }

    /**
     * Gets the value of the emailCc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailCc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailCc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEmailCc() {
        if (emailCc == null) {
            emailCc = new ArrayList<String>();
        }
        return this.emailCc;
    }

    /**
     * Gets the value of the emailBody property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailBody property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailBody().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEmailBody() {
        if (emailBody == null) {
            emailBody = new ArrayList<String>();
        }
        return this.emailBody;
    }

}
