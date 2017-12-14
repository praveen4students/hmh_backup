
package paymetric.xipaysoap30.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LineItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UPC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaterialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesDocItemNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActualInvoicedQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NetValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InfoItems" type="{http://Paymetric/XiPaySoap30/message/}ArrayOfInfoItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItem", propOrder = {
    "upc",
    "materialNumber",
    "description",
    "salesDocItemNumber",
    "actualInvoicedQuantity",
    "salesUnit",
    "taxAmount",
    "netValue",
    "infoItems"
})
public class LineItem {

    @XmlElement(name = "UPC")
    protected String upc;
    @XmlElement(name = "MaterialNumber")
    protected String materialNumber;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "SalesDocItemNumber")
    protected String salesDocItemNumber;
    @XmlElement(name = "ActualInvoicedQuantity")
    protected String actualInvoicedQuantity;
    @XmlElement(name = "SalesUnit")
    protected String salesUnit;
    @XmlElement(name = "TaxAmount")
    protected String taxAmount;
    @XmlElement(name = "NetValue")
    protected String netValue;
    @XmlElement(name = "InfoItems")
    protected ArrayOfInfoItem infoItems;

    /**
     * Gets the value of the upc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPC() {
        return upc;
    }

    /**
     * Sets the value of the upc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPC(String value) {
        this.upc = value;
    }

    /**
     * Gets the value of the materialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterialNumber() {
        return materialNumber;
    }

    /**
     * Sets the value of the materialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterialNumber(String value) {
        this.materialNumber = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the salesDocItemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesDocItemNumber() {
        return salesDocItemNumber;
    }

    /**
     * Sets the value of the salesDocItemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesDocItemNumber(String value) {
        this.salesDocItemNumber = value;
    }

    /**
     * Gets the value of the actualInvoicedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualInvoicedQuantity() {
        return actualInvoicedQuantity;
    }

    /**
     * Sets the value of the actualInvoicedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualInvoicedQuantity(String value) {
        this.actualInvoicedQuantity = value;
    }

    /**
     * Gets the value of the salesUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesUnit() {
        return salesUnit;
    }

    /**
     * Sets the value of the salesUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesUnit(String value) {
        this.salesUnit = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxAmount(String value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the netValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetValue() {
        return netValue;
    }

    /**
     * Sets the value of the netValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetValue(String value) {
        this.netValue = value;
    }

    /**
     * Gets the value of the infoItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInfoItem }
     *     
     */
    public ArrayOfInfoItem getInfoItems() {
        return infoItems;
    }

    /**
     * Sets the value of the infoItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInfoItem }
     *     
     */
    public void setInfoItems(ArrayOfInfoItem value) {
        this.infoItems = value;
    }

}
