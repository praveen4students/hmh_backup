
package com.hmco.eai.ots.transaction;

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
 *         &lt;element name="transactionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Transaction}invoiceTransactionItem" maxOccurs="unbounded"/>
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
    "transactionID",
    "invoiceTransactionItem"
})
@XmlRootElement(name = "invoiceDetails")
public class InvoiceDetails {

    @XmlElement(required = true)
    protected String transactionID;
    @XmlElement(required = true)
    protected List<InvoiceTransactionItem> invoiceTransactionItem;

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the invoiceTransactionItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceTransactionItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceTransactionItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceTransactionItem }
     * 
     * 
     */
    public List<InvoiceTransactionItem> getInvoiceTransactionItem() {
        if (invoiceTransactionItem == null) {
            invoiceTransactionItem = new ArrayList<InvoiceTransactionItem>();
        }
        return this.invoiceTransactionItem;
    }

}
