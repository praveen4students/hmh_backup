
package com.hmco.eai.ots.customernew;

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
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/CustomerNew}customerID"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/CustomerNew}transactionType"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/CustomerNew}division"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/CustomerNew}titleList"/>
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
    "customerID",
    "transactionType",
    "division",
    "titleList"
})
@XmlRootElement(name = "getCustomerSubstitutionsRequest")
public class GetCustomerSubstitutionsRequest {

    @XmlElement(required = true)
    protected String customerID;
    @XmlElement(required = true)
    protected String transactionType;
    @XmlElement(required = true)
    protected String division;
    @XmlElement(required = true)
    protected TitleList titleList;

    /**
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerID(String value) {
        this.customerID = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the division property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivision() {
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
    public void setDivision(String value) {
        this.division = value;
    }

    /**
     * Gets the value of the titleList property.
     * 
     * @return
     *     possible object is
     *     {@link TitleList }
     *     
     */
    public TitleList getTitleList() {
        return titleList;
    }

    /**
     * Sets the value of the titleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TitleList }
     *     
     */
    public void setTitleList(TitleList value) {
        this.titleList = value;
    }

}
