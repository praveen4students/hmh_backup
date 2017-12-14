
package com.hmco.eai.ots.order;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}sfdcAccountId" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}attnTo" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}basisSfdcInternalOrderId" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}clientTransactionId" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}clientSystemId" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}contactEmail" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}contactName" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}contactPhone" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}deliveryNotes" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}districtPid" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}egoodEmail" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}entryDivision" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}orderReasonCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}originalPONumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}packBySchoolOrGrade" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}poNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}shipDateOption" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}shipDateOptionDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}shippingAccountName" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}shippingAddressCity" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}shippingAddressLine1" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}shippingAddressLine2" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}shippingAddressState" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}shippingCountry" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}shippingZip" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}shipToPid" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}transactionName" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}transactionType" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}useOverrideAddress" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}orderNoteList" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}submitOrderLIneList" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}sendConfirmationEmail" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}orderedByRep" minOccurs="0"/>
 *         &lt;element name="alternateEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noFridayDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="deliverByDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}doNotMixPOsOnSamePallet" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}headerCCRatioIndicator" minOccurs="0"/>
 *         &lt;element ref="{http://www.hmco.com/EAI/OTS/Order}marketCode" minOccurs="0"/>
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
    "sfdcAccountId",
    "attnTo",
    "basisSfdcInternalOrderId",
    "clientTransactionId",
    "clientSystemId",
    "contactEmail",
    "contactName",
    "contactPhone",
    "deliveryNotes",
    "districtPid",
    "egoodEmail",
    "entryDivision",
    "orderReasonCode",
    "originalPONumber",
    "packBySchoolOrGrade",
    "poNumber",
    "shipDateOption",
    "shipDateOptionDate",
    "shippingAccountName",
    "shippingAddressCity",
    "shippingAddressLine1",
    "shippingAddressLine2",
    "shippingAddressState",
    "shippingCountry",
    "shippingZip",
    "shipToPid",
    "transactionName",
    "transactionType",
    "useOverrideAddress",
    "orderNoteList",
    "submitOrderLIneList",
    "sendConfirmationEmail",
    "orderedByRep",
    "alternateEmailAddress",
    "noFridayDelivery",
    "deliverByDate",
    "doNotMixPOsOnSamePallet",
    "headerCCRatioIndicator",
    "marketCode"
})
@XmlRootElement(name = "submitOrderRequest")
public class SubmitOrderRequest {

    protected String sfdcAccountId;
    protected String attnTo;
    protected String basisSfdcInternalOrderId;
    protected String clientTransactionId;
    protected String clientSystemId;
    protected String contactEmail;
    protected String contactName;
    protected String contactPhone;
    protected String deliveryNotes;
    protected String districtPid;
    protected String egoodEmail;
    protected String entryDivision;
    protected String orderReasonCode;
    protected String originalPONumber;
    protected String packBySchoolOrGrade;
    protected String poNumber;
    protected String shipDateOption;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar shipDateOptionDate;
    protected String shippingAccountName;
    protected String shippingAddressCity;
    protected String shippingAddressLine1;
    protected String shippingAddressLine2;
    protected String shippingAddressState;
    protected String shippingCountry;
    protected String shippingZip;
    protected String shipToPid;
    protected String transactionName;
    protected String transactionType;
    protected Boolean useOverrideAddress;
    protected List<OrderNoteList> orderNoteList;
    protected List<SubmitOrderLIneList> submitOrderLIneList;
    protected Boolean sendConfirmationEmail;
    protected String orderedByRep;
    protected String alternateEmailAddress;
    protected Boolean noFridayDelivery;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar deliverByDate;
    protected Boolean doNotMixPOsOnSamePallet;
    protected String headerCCRatioIndicator;
    protected String marketCode;

    /**
     * Gets the value of the sfdcAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfdcAccountId() {
        return sfdcAccountId;
    }

    /**
     * Sets the value of the sfdcAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfdcAccountId(String value) {
        this.sfdcAccountId = value;
    }

    /**
     * Gets the value of the attnTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttnTo() {
        return attnTo;
    }

    /**
     * Sets the value of the attnTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttnTo(String value) {
        this.attnTo = value;
    }

    /**
     * Gets the value of the basisSfdcInternalOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasisSfdcInternalOrderId() {
        return basisSfdcInternalOrderId;
    }

    /**
     * Sets the value of the basisSfdcInternalOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasisSfdcInternalOrderId(String value) {
        this.basisSfdcInternalOrderId = value;
    }

    /**
     * Gets the value of the clientTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientTransactionId() {
        return clientTransactionId;
    }

    /**
     * Sets the value of the clientTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientTransactionId(String value) {
        this.clientTransactionId = value;
    }

    /**
     * Gets the value of the clientSystemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientSystemId() {
        return clientSystemId;
    }

    /**
     * Sets the value of the clientSystemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientSystemId(String value) {
        this.clientSystemId = value;
    }

    /**
     * Gets the value of the contactEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactEmail() {
        return contactEmail;
    }

    /**
     * Sets the value of the contactEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactEmail(String value) {
        this.contactEmail = value;
    }

    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the contactPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * Sets the value of the contactPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPhone(String value) {
        this.contactPhone = value;
    }

    /**
     * Gets the value of the deliveryNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryNotes() {
        return deliveryNotes;
    }

    /**
     * Sets the value of the deliveryNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryNotes(String value) {
        this.deliveryNotes = value;
    }

    /**
     * Gets the value of the districtPid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictPid() {
        return districtPid;
    }

    /**
     * Sets the value of the districtPid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictPid(String value) {
        this.districtPid = value;
    }

    /**
     * Gets the value of the egoodEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEgoodEmail() {
        return egoodEmail;
    }

    /**
     * Sets the value of the egoodEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEgoodEmail(String value) {
        this.egoodEmail = value;
    }

    /**
     * Gets the value of the entryDivision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryDivision() {
        return entryDivision;
    }

    /**
     * Sets the value of the entryDivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryDivision(String value) {
        this.entryDivision = value;
    }

    /**
     * Gets the value of the orderReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderReasonCode() {
        return orderReasonCode;
    }

    /**
     * Sets the value of the orderReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderReasonCode(String value) {
        this.orderReasonCode = value;
    }

    /**
     * Gets the value of the originalPONumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalPONumber() {
        return originalPONumber;
    }

    /**
     * Sets the value of the originalPONumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalPONumber(String value) {
        this.originalPONumber = value;
    }

    /**
     * Gets the value of the packBySchoolOrGrade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackBySchoolOrGrade() {
        return packBySchoolOrGrade;
    }

    /**
     * Sets the value of the packBySchoolOrGrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackBySchoolOrGrade(String value) {
        this.packBySchoolOrGrade = value;
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
     * Gets the value of the shipDateOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipDateOption() {
        return shipDateOption;
    }

    /**
     * Sets the value of the shipDateOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipDateOption(String value) {
        this.shipDateOption = value;
    }

    /**
     * Gets the value of the shipDateOptionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShipDateOptionDate() {
        return shipDateOptionDate;
    }

    /**
     * Sets the value of the shipDateOptionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShipDateOptionDate(XMLGregorianCalendar value) {
        this.shipDateOptionDate = value;
    }

    /**
     * Gets the value of the shippingAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingAccountName() {
        return shippingAccountName;
    }

    /**
     * Sets the value of the shippingAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingAccountName(String value) {
        this.shippingAccountName = value;
    }

    /**
     * Gets the value of the shippingAddressCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingAddressCity() {
        return shippingAddressCity;
    }

    /**
     * Sets the value of the shippingAddressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingAddressCity(String value) {
        this.shippingAddressCity = value;
    }

    /**
     * Gets the value of the shippingAddressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingAddressLine1() {
        return shippingAddressLine1;
    }

    /**
     * Sets the value of the shippingAddressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingAddressLine1(String value) {
        this.shippingAddressLine1 = value;
    }

    /**
     * Gets the value of the shippingAddressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingAddressLine2() {
        return shippingAddressLine2;
    }

    /**
     * Sets the value of the shippingAddressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingAddressLine2(String value) {
        this.shippingAddressLine2 = value;
    }

    /**
     * Gets the value of the shippingAddressState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingAddressState() {
        return shippingAddressState;
    }

    /**
     * Sets the value of the shippingAddressState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingAddressState(String value) {
        this.shippingAddressState = value;
    }

    /**
     * Gets the value of the shippingCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingCountry() {
        return shippingCountry;
    }

    /**
     * Sets the value of the shippingCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingCountry(String value) {
        this.shippingCountry = value;
    }

    /**
     * Gets the value of the shippingZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingZip() {
        return shippingZip;
    }

    /**
     * Sets the value of the shippingZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingZip(String value) {
        this.shippingZip = value;
    }

    /**
     * Gets the value of the shipToPid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToPid() {
        return shipToPid;
    }

    /**
     * Sets the value of the shipToPid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToPid(String value) {
        this.shipToPid = value;
    }

    /**
     * Gets the value of the transactionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionName() {
        return transactionName;
    }

    /**
     * Sets the value of the transactionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionName(String value) {
        this.transactionName = value;
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
     * Gets the value of the useOverrideAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseOverrideAddress() {
        return useOverrideAddress;
    }

    /**
     * Sets the value of the useOverrideAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseOverrideAddress(Boolean value) {
        this.useOverrideAddress = value;
    }

    /**
     * Gets the value of the orderNoteList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderNoteList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderNoteList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderNoteList }
     * 
     * 
     */
    public List<OrderNoteList> getOrderNoteList() {
        if (orderNoteList == null) {
            orderNoteList = new ArrayList<OrderNoteList>();
        }
        return this.orderNoteList;
    }

    /**
     * Gets the value of the submitOrderLIneList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the submitOrderLIneList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubmitOrderLIneList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubmitOrderLIneList }
     * 
     * 
     */
    public List<SubmitOrderLIneList> getSubmitOrderLIneList() {
        if (submitOrderLIneList == null) {
            submitOrderLIneList = new ArrayList<SubmitOrderLIneList>();
        }
        return this.submitOrderLIneList;
    }

    /**
     * Gets the value of the sendConfirmationEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendConfirmationEmail() {
        return sendConfirmationEmail;
    }

    /**
     * Sets the value of the sendConfirmationEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendConfirmationEmail(Boolean value) {
        this.sendConfirmationEmail = value;
    }

    /**
     * Gets the value of the orderedByRep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderedByRep() {
        return orderedByRep;
    }

    /**
     * Sets the value of the orderedByRep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderedByRep(String value) {
        this.orderedByRep = value;
    }

    /**
     * Gets the value of the alternateEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateEmailAddress() {
        return alternateEmailAddress;
    }

    /**
     * Sets the value of the alternateEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateEmailAddress(String value) {
        this.alternateEmailAddress = value;
    }

    /**
     * Gets the value of the noFridayDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoFridayDelivery() {
        return noFridayDelivery;
    }

    /**
     * Sets the value of the noFridayDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoFridayDelivery(Boolean value) {
        this.noFridayDelivery = value;
    }

    /**
     * Gets the value of the deliverByDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliverByDate() {
        return deliverByDate;
    }

    /**
     * Sets the value of the deliverByDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliverByDate(XMLGregorianCalendar value) {
        this.deliverByDate = value;
    }

    /**
     * Gets the value of the doNotMixPOsOnSamePallet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDoNotMixPOsOnSamePallet() {
        return doNotMixPOsOnSamePallet;
    }

    /**
     * Sets the value of the doNotMixPOsOnSamePallet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDoNotMixPOsOnSamePallet(Boolean value) {
        this.doNotMixPOsOnSamePallet = value;
    }

    /**
     * Gets the value of the headerCCRatioIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderCCRatioIndicator() {
        return headerCCRatioIndicator;
    }

    /**
     * Sets the value of the headerCCRatioIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderCCRatioIndicator(String value) {
        this.headerCCRatioIndicator = value;
    }

    /**
     * Gets the value of the marketCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketCode() {
        return marketCode;
    }

    /**
     * Sets the value of the marketCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketCode(String value) {
        this.marketCode = value;
    }

}
