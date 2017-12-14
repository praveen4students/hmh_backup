
package com.hmco.eai.ots.transaction;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="shipmentNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shipmentCharge" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="shipmentCarrier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shipmentServiceLevel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shipmentWeight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="totalPackages" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="docDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="shippingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="lineItem" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="lineNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="transactionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="transactionLineNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="materialID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="isbn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="fullDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="shipmentLocation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="productDivision" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="trackingItem" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="trackingNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="shippedDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="shipmentServiceLevel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="destinationZip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="trackingURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "shipmentNo",
    "shipmentCharge",
    "shipmentCarrier",
    "shipmentServiceLevel",
    "shipmentWeight",
    "totalPackages",
    "docDate",
    "shippingDate",
    "lineItem",
    "trackingItem"
})
@XmlRootElement(name = "shipmentDetailsItem")
public class ShipmentDetailsItem {

    @XmlElement(required = true)
    protected String shipmentNo;
    protected double shipmentCharge;
    @XmlElement(required = true)
    protected String shipmentCarrier;
    @XmlElement(required = true)
    protected String shipmentServiceLevel;
    protected double shipmentWeight;
    protected int totalPackages;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar docDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar shippingDate;
    @XmlElement(required = true)
    protected List<ShipmentDetailsItem.LineItem> lineItem;
    protected List<ShipmentDetailsItem.TrackingItem> trackingItem;

    /**
     * Gets the value of the shipmentNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentNo() {
        return shipmentNo;
    }

    /**
     * Sets the value of the shipmentNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentNo(String value) {
        this.shipmentNo = value;
    }

    /**
     * Gets the value of the shipmentCharge property.
     * 
     */
    public double getShipmentCharge() {
        return shipmentCharge;
    }

    /**
     * Sets the value of the shipmentCharge property.
     * 
     */
    public void setShipmentCharge(double value) {
        this.shipmentCharge = value;
    }

    /**
     * Gets the value of the shipmentCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentCarrier() {
        return shipmentCarrier;
    }

    /**
     * Sets the value of the shipmentCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentCarrier(String value) {
        this.shipmentCarrier = value;
    }

    /**
     * Gets the value of the shipmentServiceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentServiceLevel() {
        return shipmentServiceLevel;
    }

    /**
     * Sets the value of the shipmentServiceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentServiceLevel(String value) {
        this.shipmentServiceLevel = value;
    }

    /**
     * Gets the value of the shipmentWeight property.
     * 
     */
    public double getShipmentWeight() {
        return shipmentWeight;
    }

    /**
     * Sets the value of the shipmentWeight property.
     * 
     */
    public void setShipmentWeight(double value) {
        this.shipmentWeight = value;
    }

    /**
     * Gets the value of the totalPackages property.
     * 
     */
    public int getTotalPackages() {
        return totalPackages;
    }

    /**
     * Sets the value of the totalPackages property.
     * 
     */
    public void setTotalPackages(int value) {
        this.totalPackages = value;
    }

    /**
     * Gets the value of the docDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocDate() {
        return docDate;
    }

    /**
     * Sets the value of the docDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocDate(XMLGregorianCalendar value) {
        this.docDate = value;
    }

    /**
     * Gets the value of the shippingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShippingDate() {
        return shippingDate;
    }

    /**
     * Sets the value of the shippingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShippingDate(XMLGregorianCalendar value) {
        this.shippingDate = value;
    }

    /**
     * Gets the value of the lineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentDetailsItem.LineItem }
     * 
     * 
     */
    public List<ShipmentDetailsItem.LineItem> getLineItem() {
        if (lineItem == null) {
            lineItem = new ArrayList<ShipmentDetailsItem.LineItem>();
        }
        return this.lineItem;
    }

    /**
     * Gets the value of the trackingItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trackingItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrackingItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentDetailsItem.TrackingItem }
     * 
     * 
     */
    public List<ShipmentDetailsItem.TrackingItem> getTrackingItem() {
        if (trackingItem == null) {
            trackingItem = new ArrayList<ShipmentDetailsItem.TrackingItem>();
        }
        return this.trackingItem;
    }


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
     *         &lt;element name="lineNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="transactionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="transactionLineNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="materialID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="isbn" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="fullDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="shipmentLocation" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *         &lt;element name="productDivision" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "lineNo",
        "transactionID",
        "transactionLineNo",
        "materialID",
        "isbn",
        "fullDescription",
        "shipmentLocation",
        "quantity",
        "productDivision"
    })
    public static class LineItem {

        protected int lineNo;
        @XmlElement(required = true)
        protected String transactionID;
        @XmlElement(required = true)
        protected String transactionLineNo;
        protected String materialID;
        @XmlElement(required = true)
        protected String isbn;
        @XmlElement(required = true)
        protected String fullDescription;
        @XmlElement(required = true)
        protected String shipmentLocation;
        protected double quantity;
        @XmlElement(required = true)
        protected String productDivision;

        /**
         * Gets the value of the lineNo property.
         * 
         */
        public int getLineNo() {
            return lineNo;
        }

        /**
         * Sets the value of the lineNo property.
         * 
         */
        public void setLineNo(int value) {
            this.lineNo = value;
        }

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
         * Gets the value of the transactionLineNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransactionLineNo() {
            return transactionLineNo;
        }

        /**
         * Sets the value of the transactionLineNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTransactionLineNo(String value) {
            this.transactionLineNo = value;
        }

        /**
         * Gets the value of the materialID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMaterialID() {
            return materialID;
        }

        /**
         * Sets the value of the materialID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMaterialID(String value) {
            this.materialID = value;
        }

        /**
         * Gets the value of the isbn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIsbn() {
            return isbn;
        }

        /**
         * Sets the value of the isbn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIsbn(String value) {
            this.isbn = value;
        }

        /**
         * Gets the value of the fullDescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFullDescription() {
            return fullDescription;
        }

        /**
         * Sets the value of the fullDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFullDescription(String value) {
            this.fullDescription = value;
        }

        /**
         * Gets the value of the shipmentLocation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShipmentLocation() {
            return shipmentLocation;
        }

        /**
         * Sets the value of the shipmentLocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShipmentLocation(String value) {
            this.shipmentLocation = value;
        }

        /**
         * Gets the value of the quantity property.
         * 
         */
        public double getQuantity() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         */
        public void setQuantity(double value) {
            this.quantity = value;
        }

        /**
         * Gets the value of the productDivision property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProductDivision() {
            return productDivision;
        }

        /**
         * Sets the value of the productDivision property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProductDivision(String value) {
            this.productDivision = value;
        }

    }


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
     *         &lt;element name="trackingNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="shippedDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="shipmentServiceLevel" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="destinationZip" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *         &lt;element name="trackingURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "trackingNo",
        "shippedDate",
        "shipmentServiceLevel",
        "destinationZip",
        "weight",
        "trackingURL"
    })
    public static class TrackingItem {

        @XmlElement(required = true)
        protected String trackingNo;
        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar shippedDate;
        @XmlElement(required = true)
        protected String shipmentServiceLevel;
        @XmlElement(required = true)
        protected String destinationZip;
        protected double weight;
        @XmlElement(required = true)
        protected String trackingURL;

        /**
         * Gets the value of the trackingNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTrackingNo() {
            return trackingNo;
        }

        /**
         * Sets the value of the trackingNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTrackingNo(String value) {
            this.trackingNo = value;
        }

        /**
         * Gets the value of the shippedDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getShippedDate() {
            return shippedDate;
        }

        /**
         * Sets the value of the shippedDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setShippedDate(XMLGregorianCalendar value) {
            this.shippedDate = value;
        }

        /**
         * Gets the value of the shipmentServiceLevel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShipmentServiceLevel() {
            return shipmentServiceLevel;
        }

        /**
         * Sets the value of the shipmentServiceLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShipmentServiceLevel(String value) {
            this.shipmentServiceLevel = value;
        }

        /**
         * Gets the value of the destinationZip property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDestinationZip() {
            return destinationZip;
        }

        /**
         * Sets the value of the destinationZip property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDestinationZip(String value) {
            this.destinationZip = value;
        }

        /**
         * Gets the value of the weight property.
         * 
         */
        public double getWeight() {
            return weight;
        }

        /**
         * Sets the value of the weight property.
         * 
         */
        public void setWeight(double value) {
            this.weight = value;
        }

        /**
         * Gets the value of the trackingURL property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTrackingURL() {
            return trackingURL;
        }

        /**
         * Sets the value of the trackingURL property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTrackingURL(String value) {
            this.trackingURL = value;
        }

    }

}
