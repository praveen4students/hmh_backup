
package com.hmco.eai.ots.materialnew;

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
 *         &lt;element name="materialID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isbn13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isbn10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="internalDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fullDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="materialStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="materialStatusDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="netPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="quantityInStock" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="restriction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="materialGroup" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="substituted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="availableDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="copyrightYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mediaType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productDivision" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phLevelCode1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phLevelCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phLevelCode3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phLevelCode4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phLevelCode5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitsPerCarton" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="isSubscription" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="genItemCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/MaterialNew}component" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/MaterialNew}subscriptionTerm" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="editionCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/MaterialNew}Oldmaterialnumber" minOccurs="0"/>
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
    "materialID",
    "isbn13",
    "isbn10",
    "internalDescription",
    "fullDescription",
    "author",
    "materialStatus",
    "materialStatusDescription",
    "listPrice",
    "netPrice",
    "quantityInStock",
    "restriction",
    "materialGroup",
    "substituted",
    "availableDate",
    "copyrightYear",
    "mediaType",
    "productDivision",
    "phLevelCode1",
    "phLevelCode2",
    "phLevelCode3",
    "phLevelCode4",
    "phLevelCode5",
    "unitsPerCarton",
    "isSubscription",
    "genItemCategory",
    "component",
    "subscriptionTerm",
    "editionCategory",
    "oldmaterialnumber"
})
@XmlRootElement(name = "materialDetail")
public class MaterialDetail {

    protected String materialID;
    protected String isbn13;
    protected String isbn10;
    @XmlElement(required = true)
    protected String internalDescription;
    protected String fullDescription;
    protected String author;
    @XmlElement(required = true)
    protected String materialStatus;
    protected String materialStatusDescription;
    protected Double listPrice;
    protected Double netPrice;
    protected Integer quantityInStock;
    protected String restriction;
    @XmlElement(required = true)
    protected String materialGroup;
    protected boolean substituted;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar availableDate;
    protected String copyrightYear;
    protected String mediaType;
    @XmlElement(required = true)
    protected String productDivision;
    protected String phLevelCode1;
    protected String phLevelCode2;
    protected String phLevelCode3;
    protected String phLevelCode4;
    protected String phLevelCode5;
    protected Integer unitsPerCarton;
    protected boolean isSubscription;
    protected String genItemCategory;
    protected List<Component> component;
    protected List<SubscriptionTerm> subscriptionTerm;
    protected String editionCategory;
    @XmlElement(name = "Oldmaterialnumber")
    protected String oldmaterialnumber;

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
     * Gets the value of the isbn13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsbn13() {
        return isbn13;
    }

    /**
     * Sets the value of the isbn13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsbn13(String value) {
        this.isbn13 = value;
    }

    /**
     * Gets the value of the isbn10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsbn10() {
        return isbn10;
    }

    /**
     * Sets the value of the isbn10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsbn10(String value) {
        this.isbn10 = value;
    }

    /**
     * Gets the value of the internalDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalDescription() {
        return internalDescription;
    }

    /**
     * Sets the value of the internalDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalDescription(String value) {
        this.internalDescription = value;
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
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * Gets the value of the materialStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterialStatus() {
        return materialStatus;
    }

    /**
     * Sets the value of the materialStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterialStatus(String value) {
        this.materialStatus = value;
    }

    /**
     * Gets the value of the materialStatusDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterialStatusDescription() {
        return materialStatusDescription;
    }

    /**
     * Sets the value of the materialStatusDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterialStatusDescription(String value) {
        this.materialStatusDescription = value;
    }

    /**
     * Gets the value of the listPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getListPrice() {
        return listPrice;
    }

    /**
     * Sets the value of the listPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setListPrice(Double value) {
        this.listPrice = value;
    }

    /**
     * Gets the value of the netPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNetPrice() {
        return netPrice;
    }

    /**
     * Sets the value of the netPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNetPrice(Double value) {
        this.netPrice = value;
    }

    /**
     * Gets the value of the quantityInStock property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantityInStock() {
        return quantityInStock;
    }

    /**
     * Sets the value of the quantityInStock property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantityInStock(Integer value) {
        this.quantityInStock = value;
    }

    /**
     * Gets the value of the restriction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestriction() {
        return restriction;
    }

    /**
     * Sets the value of the restriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestriction(String value) {
        this.restriction = value;
    }

    /**
     * Gets the value of the materialGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterialGroup() {
        return materialGroup;
    }

    /**
     * Sets the value of the materialGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterialGroup(String value) {
        this.materialGroup = value;
    }

    /**
     * Gets the value of the substituted property.
     * 
     */
    public boolean isSubstituted() {
        return substituted;
    }

    /**
     * Sets the value of the substituted property.
     * 
     */
    public void setSubstituted(boolean value) {
        this.substituted = value;
    }

    /**
     * Gets the value of the availableDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAvailableDate() {
        return availableDate;
    }

    /**
     * Sets the value of the availableDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAvailableDate(XMLGregorianCalendar value) {
        this.availableDate = value;
    }

    /**
     * Gets the value of the copyrightYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyrightYear() {
        return copyrightYear;
    }

    /**
     * Sets the value of the copyrightYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyrightYear(String value) {
        this.copyrightYear = value;
    }

    /**
     * Gets the value of the mediaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaType() {
        return mediaType;
    }

    /**
     * Sets the value of the mediaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaType(String value) {
        this.mediaType = value;
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

    /**
     * Gets the value of the phLevelCode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhLevelCode1() {
        return phLevelCode1;
    }

    /**
     * Sets the value of the phLevelCode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhLevelCode1(String value) {
        this.phLevelCode1 = value;
    }

    /**
     * Gets the value of the phLevelCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhLevelCode2() {
        return phLevelCode2;
    }

    /**
     * Sets the value of the phLevelCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhLevelCode2(String value) {
        this.phLevelCode2 = value;
    }

    /**
     * Gets the value of the phLevelCode3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhLevelCode3() {
        return phLevelCode3;
    }

    /**
     * Sets the value of the phLevelCode3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhLevelCode3(String value) {
        this.phLevelCode3 = value;
    }

    /**
     * Gets the value of the phLevelCode4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhLevelCode4() {
        return phLevelCode4;
    }

    /**
     * Sets the value of the phLevelCode4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhLevelCode4(String value) {
        this.phLevelCode4 = value;
    }

    /**
     * Gets the value of the phLevelCode5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhLevelCode5() {
        return phLevelCode5;
    }

    /**
     * Sets the value of the phLevelCode5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhLevelCode5(String value) {
        this.phLevelCode5 = value;
    }

    /**
     * Gets the value of the unitsPerCarton property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnitsPerCarton() {
        return unitsPerCarton;
    }

    /**
     * Sets the value of the unitsPerCarton property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnitsPerCarton(Integer value) {
        this.unitsPerCarton = value;
    }

    /**
     * Gets the value of the isSubscription property.
     * 
     */
    public boolean isIsSubscription() {
        return isSubscription;
    }

    /**
     * Sets the value of the isSubscription property.
     * 
     */
    public void setIsSubscription(boolean value) {
        this.isSubscription = value;
    }

    /**
     * Gets the value of the genItemCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenItemCategory() {
        return genItemCategory;
    }

    /**
     * Sets the value of the genItemCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenItemCategory(String value) {
        this.genItemCategory = value;
    }

    /**
     * Gets the value of the component property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the component property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Component }
     * 
     * 
     */
    public List<Component> getComponent() {
        if (component == null) {
            component = new ArrayList<Component>();
        }
        return this.component;
    }

    /**
     * Gets the value of the subscriptionTerm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscriptionTerm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriptionTerm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubscriptionTerm }
     * 
     * 
     */
    public List<SubscriptionTerm> getSubscriptionTerm() {
        if (subscriptionTerm == null) {
            subscriptionTerm = new ArrayList<SubscriptionTerm>();
        }
        return this.subscriptionTerm;
    }

    /**
     * Gets the value of the editionCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditionCategory() {
        return editionCategory;
    }

    /**
     * Sets the value of the editionCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditionCategory(String value) {
        this.editionCategory = value;
    }

    /**
     * Gets the value of the oldmaterialnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldmaterialnumber() {
        return oldmaterialnumber;
    }

    /**
     * Sets the value of the oldmaterialnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldmaterialnumber(String value) {
        this.oldmaterialnumber = value;
    }

}
