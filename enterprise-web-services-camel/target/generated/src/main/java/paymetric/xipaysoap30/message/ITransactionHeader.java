
package paymetric.xipaysoap30.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ITransactionHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ITransactionHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AVSAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AVSCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AVSZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountingDocNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuthorizationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuthorizationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="AuthorizationReferenceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuthorizationTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuthorizedThroughCartridge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankBatchID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankSubBatchID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BatchID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="BillingPlanItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CaptureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CaptureReferenceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardCVV2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardDataSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardFollowOnNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardHolderAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardHolderAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardHolderCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardHolderCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardHolderDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardHolderName1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardHolderName2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardHolderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardHolderState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardHolderZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardPresent" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardValidFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChargeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Client" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CurrencyKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustTXN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FiscalYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GLAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastModificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="LocationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MerchantID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MerchantTXN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MerchantTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModifiedStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OrderDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OrderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Origin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PONumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PacketOperation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Preauthorized" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferenceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferenceLineItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResponseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesDocNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SettlementAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SettlementDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SettlementReferenceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingCaptureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ShippingLocationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StatusTXN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxLevel1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxLevel2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxLevel3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxLevel4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TerminalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VATNumberCustomer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VATNumberMerchant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XIID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InfoItems" type="{http://Paymetric/XiPaySoap30/message/}ArrayOfInfoItem" minOccurs="0"/>
 *         &lt;element name="LineItems" type="{http://Paymetric/XiPaySoap30/message/}ArrayOfLineItem" minOccurs="0"/>
 *         &lt;element name="SourceSystemInfoItems" type="{http://Paymetric/XiPaySoap30/message/}ArrayOfInfoItem" minOccurs="0"/>
 *         &lt;element name="BlobItems" type="{http://Paymetric/XiPaySoap30/message/}ArrayOfBlobItem" minOccurs="0"/>
 *         &lt;element name="CheckImages" type="{http://Paymetric/XiPaySoap30/message/}ArrayOfCheckImage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ITransactionHeader", propOrder = {
    "avsAddress",
    "avsCode",
    "avsZipCode",
    "accountingDocNumber",
    "actionCode",
    "additionalInfo",
    "amount",
    "authorizationCode",
    "authorizationDate",
    "authorizationReferenceCode",
    "authorizationTime",
    "authorizedThroughCartridge",
    "bankBatchID",
    "bankSubBatchID",
    "bankTransactionID",
    "batchID",
    "billingDate",
    "billingPlanItem",
    "captureDate",
    "captureReferenceCode",
    "cardCVV2",
    "cardDataSource",
    "cardExpirationDate",
    "cardFollowOnNumber",
    "cardHolderAddress1",
    "cardHolderAddress2",
    "cardHolderCity",
    "cardHolderCountry",
    "cardHolderDistrict",
    "cardHolderName1",
    "cardHolderName2",
    "cardHolderName",
    "cardHolderState",
    "cardHolderZip",
    "cardNumber",
    "cardPresent",
    "cardType",
    "cardValidFrom",
    "chargeAmount",
    "client",
    "companyCode",
    "creationDate",
    "currencyKey",
    "custTXN",
    "customerNumber",
    "fiscalYear",
    "glAccount",
    "lastModificationDate",
    "locationID",
    "merchantID",
    "merchantTXN",
    "merchantTransactionID",
    "message",
    "modifiedStatus",
    "orderDate",
    "orderID",
    "origin",
    "poNumber",
    "packetOperation",
    "preauthorized",
    "referenceCode",
    "referenceLineItem",
    "responseCode",
    "salesDocNumber",
    "settlementAmount",
    "settlementDate",
    "settlementReferenceCode",
    "shippingCaptureDate",
    "shippingLocationID",
    "shippingMethod",
    "statusCode",
    "statusTXN",
    "taxLevel1",
    "taxLevel2",
    "taxLevel3",
    "taxLevel4",
    "terminalID",
    "transactionID",
    "transactionType",
    "vatNumberCustomer",
    "vatNumberMerchant",
    "xiid",
    "infoItems",
    "lineItems",
    "sourceSystemInfoItems",
    "blobItems",
    "checkImages"
})
public class ITransactionHeader {

    @XmlElement(name = "AVSAddress")
    protected String avsAddress;
    @XmlElement(name = "AVSCode")
    protected String avsCode;
    @XmlElement(name = "AVSZipCode")
    protected String avsZipCode;
    @XmlElement(name = "AccountingDocNumber")
    protected String accountingDocNumber;
    @XmlElement(name = "ActionCode")
    protected String actionCode;
    @XmlElement(name = "AdditionalInfo")
    protected String additionalInfo;
    @XmlElement(name = "Amount")
    protected String amount;
    @XmlElement(name = "AuthorizationCode")
    protected String authorizationCode;
    @XmlElement(name = "AuthorizationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar authorizationDate;
    @XmlElement(name = "AuthorizationReferenceCode")
    protected String authorizationReferenceCode;
    @XmlElement(name = "AuthorizationTime")
    protected String authorizationTime;
    @XmlElement(name = "AuthorizedThroughCartridge")
    protected String authorizedThroughCartridge;
    @XmlElement(name = "BankBatchID")
    protected String bankBatchID;
    @XmlElement(name = "BankSubBatchID")
    protected String bankSubBatchID;
    @XmlElement(name = "BankTransactionID")
    protected String bankTransactionID;
    @XmlElement(name = "BatchID")
    protected String batchID;
    @XmlElement(name = "BillingDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar billingDate;
    @XmlElement(name = "BillingPlanItem")
    protected String billingPlanItem;
    @XmlElement(name = "CaptureDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar captureDate;
    @XmlElement(name = "CaptureReferenceCode")
    protected String captureReferenceCode;
    @XmlElement(name = "CardCVV2")
    protected String cardCVV2;
    @XmlElement(name = "CardDataSource")
    protected String cardDataSource;
    @XmlElement(name = "CardExpirationDate")
    protected String cardExpirationDate;
    @XmlElement(name = "CardFollowOnNumber")
    protected String cardFollowOnNumber;
    @XmlElement(name = "CardHolderAddress1")
    protected String cardHolderAddress1;
    @XmlElement(name = "CardHolderAddress2")
    protected String cardHolderAddress2;
    @XmlElement(name = "CardHolderCity")
    protected String cardHolderCity;
    @XmlElement(name = "CardHolderCountry")
    protected String cardHolderCountry;
    @XmlElement(name = "CardHolderDistrict")
    protected String cardHolderDistrict;
    @XmlElement(name = "CardHolderName1")
    protected String cardHolderName1;
    @XmlElement(name = "CardHolderName2")
    protected String cardHolderName2;
    @XmlElement(name = "CardHolderName")
    protected String cardHolderName;
    @XmlElement(name = "CardHolderState")
    protected String cardHolderState;
    @XmlElement(name = "CardHolderZip")
    protected String cardHolderZip;
    @XmlElement(name = "CardNumber")
    protected String cardNumber;
    @XmlElement(name = "CardPresent")
    protected int cardPresent;
    @XmlElement(name = "CardType")
    protected String cardType;
    @XmlElement(name = "CardValidFrom")
    protected String cardValidFrom;
    @XmlElement(name = "ChargeAmount")
    protected String chargeAmount;
    @XmlElement(name = "Client")
    protected String client;
    @XmlElement(name = "CompanyCode")
    protected String companyCode;
    @XmlElement(name = "CreationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "CurrencyKey")
    protected String currencyKey;
    @XmlElement(name = "CustTXN")
    protected String custTXN;
    @XmlElement(name = "CustomerNumber")
    protected String customerNumber;
    @XmlElement(name = "FiscalYear")
    protected String fiscalYear;
    @XmlElement(name = "GLAccount")
    protected String glAccount;
    @XmlElement(name = "LastModificationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModificationDate;
    @XmlElement(name = "LocationID")
    protected String locationID;
    @XmlElement(name = "MerchantID")
    protected String merchantID;
    @XmlElement(name = "MerchantTXN")
    protected String merchantTXN;
    @XmlElement(name = "MerchantTransactionID")
    protected String merchantTransactionID;
    @XmlElement(name = "Message")
    protected String message;
    @XmlElement(name = "ModifiedStatus")
    protected int modifiedStatus;
    @XmlElement(name = "OrderDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderDate;
    @XmlElement(name = "OrderID")
    protected String orderID;
    @XmlElement(name = "Origin")
    protected String origin;
    @XmlElement(name = "PONumber")
    protected String poNumber;
    @XmlElement(name = "PacketOperation")
    protected int packetOperation;
    @XmlElement(name = "Preauthorized")
    protected String preauthorized;
    @XmlElement(name = "ReferenceCode")
    protected String referenceCode;
    @XmlElement(name = "ReferenceLineItem")
    protected String referenceLineItem;
    @XmlElement(name = "ResponseCode")
    protected String responseCode;
    @XmlElement(name = "SalesDocNumber")
    protected String salesDocNumber;
    @XmlElement(name = "SettlementAmount")
    protected String settlementAmount;
    @XmlElement(name = "SettlementDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar settlementDate;
    @XmlElement(name = "SettlementReferenceCode")
    protected String settlementReferenceCode;
    @XmlElement(name = "ShippingCaptureDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar shippingCaptureDate;
    @XmlElement(name = "ShippingLocationID")
    protected String shippingLocationID;
    @XmlElement(name = "ShippingMethod")
    protected String shippingMethod;
    @XmlElement(name = "StatusCode")
    protected int statusCode;
    @XmlElement(name = "StatusTXN")
    protected String statusTXN;
    @XmlElement(name = "TaxLevel1")
    protected String taxLevel1;
    @XmlElement(name = "TaxLevel2")
    protected String taxLevel2;
    @XmlElement(name = "TaxLevel3")
    protected String taxLevel3;
    @XmlElement(name = "TaxLevel4")
    protected String taxLevel4;
    @XmlElement(name = "TerminalID")
    protected String terminalID;
    @XmlElement(name = "TransactionID")
    protected String transactionID;
    @XmlElement(name = "TransactionType")
    protected String transactionType;
    @XmlElement(name = "VATNumberCustomer")
    protected String vatNumberCustomer;
    @XmlElement(name = "VATNumberMerchant")
    protected String vatNumberMerchant;
    @XmlElement(name = "XIID")
    protected String xiid;
    @XmlElement(name = "InfoItems")
    protected ArrayOfInfoItem infoItems;
    @XmlElement(name = "LineItems")
    protected ArrayOfLineItem lineItems;
    @XmlElement(name = "SourceSystemInfoItems")
    protected ArrayOfInfoItem sourceSystemInfoItems;
    @XmlElement(name = "BlobItems")
    protected ArrayOfBlobItem blobItems;
    @XmlElement(name = "CheckImages")
    protected ArrayOfCheckImage checkImages;

    /**
     * Gets the value of the avsAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVSAddress() {
        return avsAddress;
    }

    /**
     * Sets the value of the avsAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVSAddress(String value) {
        this.avsAddress = value;
    }

    /**
     * Gets the value of the avsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVSCode() {
        return avsCode;
    }

    /**
     * Sets the value of the avsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVSCode(String value) {
        this.avsCode = value;
    }

    /**
     * Gets the value of the avsZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVSZipCode() {
        return avsZipCode;
    }

    /**
     * Sets the value of the avsZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVSZipCode(String value) {
        this.avsZipCode = value;
    }

    /**
     * Gets the value of the accountingDocNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountingDocNumber() {
        return accountingDocNumber;
    }

    /**
     * Sets the value of the accountingDocNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountingDocNumber(String value) {
        this.accountingDocNumber = value;
    }

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionCode(String value) {
        this.actionCode = value;
    }

    /**
     * Gets the value of the additionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInfo(String value) {
        this.additionalInfo = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the authorizationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationCode() {
        return authorizationCode;
    }

    /**
     * Sets the value of the authorizationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationCode(String value) {
        this.authorizationCode = value;
    }

    /**
     * Gets the value of the authorizationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAuthorizationDate() {
        return authorizationDate;
    }

    /**
     * Sets the value of the authorizationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAuthorizationDate(XMLGregorianCalendar value) {
        this.authorizationDate = value;
    }

    /**
     * Gets the value of the authorizationReferenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationReferenceCode() {
        return authorizationReferenceCode;
    }

    /**
     * Sets the value of the authorizationReferenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationReferenceCode(String value) {
        this.authorizationReferenceCode = value;
    }

    /**
     * Gets the value of the authorizationTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationTime() {
        return authorizationTime;
    }

    /**
     * Sets the value of the authorizationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationTime(String value) {
        this.authorizationTime = value;
    }

    /**
     * Gets the value of the authorizedThroughCartridge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizedThroughCartridge() {
        return authorizedThroughCartridge;
    }

    /**
     * Sets the value of the authorizedThroughCartridge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizedThroughCartridge(String value) {
        this.authorizedThroughCartridge = value;
    }

    /**
     * Gets the value of the bankBatchID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankBatchID() {
        return bankBatchID;
    }

    /**
     * Sets the value of the bankBatchID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankBatchID(String value) {
        this.bankBatchID = value;
    }

    /**
     * Gets the value of the bankSubBatchID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankSubBatchID() {
        return bankSubBatchID;
    }

    /**
     * Sets the value of the bankSubBatchID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankSubBatchID(String value) {
        this.bankSubBatchID = value;
    }

    /**
     * Gets the value of the bankTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankTransactionID() {
        return bankTransactionID;
    }

    /**
     * Sets the value of the bankTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankTransactionID(String value) {
        this.bankTransactionID = value;
    }

    /**
     * Gets the value of the batchID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchID() {
        return batchID;
    }

    /**
     * Sets the value of the batchID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchID(String value) {
        this.batchID = value;
    }

    /**
     * Gets the value of the billingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBillingDate() {
        return billingDate;
    }

    /**
     * Sets the value of the billingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBillingDate(XMLGregorianCalendar value) {
        this.billingDate = value;
    }

    /**
     * Gets the value of the billingPlanItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingPlanItem() {
        return billingPlanItem;
    }

    /**
     * Sets the value of the billingPlanItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingPlanItem(String value) {
        this.billingPlanItem = value;
    }

    /**
     * Gets the value of the captureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCaptureDate() {
        return captureDate;
    }

    /**
     * Sets the value of the captureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCaptureDate(XMLGregorianCalendar value) {
        this.captureDate = value;
    }

    /**
     * Gets the value of the captureReferenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaptureReferenceCode() {
        return captureReferenceCode;
    }

    /**
     * Sets the value of the captureReferenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaptureReferenceCode(String value) {
        this.captureReferenceCode = value;
    }

    /**
     * Gets the value of the cardCVV2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCVV2() {
        return cardCVV2;
    }

    /**
     * Sets the value of the cardCVV2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCVV2(String value) {
        this.cardCVV2 = value;
    }

    /**
     * Gets the value of the cardDataSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardDataSource() {
        return cardDataSource;
    }

    /**
     * Sets the value of the cardDataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardDataSource(String value) {
        this.cardDataSource = value;
    }

    /**
     * Gets the value of the cardExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardExpirationDate() {
        return cardExpirationDate;
    }

    /**
     * Sets the value of the cardExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardExpirationDate(String value) {
        this.cardExpirationDate = value;
    }

    /**
     * Gets the value of the cardFollowOnNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardFollowOnNumber() {
        return cardFollowOnNumber;
    }

    /**
     * Sets the value of the cardFollowOnNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardFollowOnNumber(String value) {
        this.cardFollowOnNumber = value;
    }

    /**
     * Gets the value of the cardHolderAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderAddress1() {
        return cardHolderAddress1;
    }

    /**
     * Sets the value of the cardHolderAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderAddress1(String value) {
        this.cardHolderAddress1 = value;
    }

    /**
     * Gets the value of the cardHolderAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderAddress2() {
        return cardHolderAddress2;
    }

    /**
     * Sets the value of the cardHolderAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderAddress2(String value) {
        this.cardHolderAddress2 = value;
    }

    /**
     * Gets the value of the cardHolderCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderCity() {
        return cardHolderCity;
    }

    /**
     * Sets the value of the cardHolderCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderCity(String value) {
        this.cardHolderCity = value;
    }

    /**
     * Gets the value of the cardHolderCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderCountry() {
        return cardHolderCountry;
    }

    /**
     * Sets the value of the cardHolderCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderCountry(String value) {
        this.cardHolderCountry = value;
    }

    /**
     * Gets the value of the cardHolderDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderDistrict() {
        return cardHolderDistrict;
    }

    /**
     * Sets the value of the cardHolderDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderDistrict(String value) {
        this.cardHolderDistrict = value;
    }

    /**
     * Gets the value of the cardHolderName1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderName1() {
        return cardHolderName1;
    }

    /**
     * Sets the value of the cardHolderName1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderName1(String value) {
        this.cardHolderName1 = value;
    }

    /**
     * Gets the value of the cardHolderName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderName2() {
        return cardHolderName2;
    }

    /**
     * Sets the value of the cardHolderName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderName2(String value) {
        this.cardHolderName2 = value;
    }

    /**
     * Gets the value of the cardHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderName() {
        return cardHolderName;
    }

    /**
     * Sets the value of the cardHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderName(String value) {
        this.cardHolderName = value;
    }

    /**
     * Gets the value of the cardHolderState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderState() {
        return cardHolderState;
    }

    /**
     * Sets the value of the cardHolderState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderState(String value) {
        this.cardHolderState = value;
    }

    /**
     * Gets the value of the cardHolderZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderZip() {
        return cardHolderZip;
    }

    /**
     * Sets the value of the cardHolderZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderZip(String value) {
        this.cardHolderZip = value;
    }

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the cardPresent property.
     * 
     */
    public int getCardPresent() {
        return cardPresent;
    }

    /**
     * Sets the value of the cardPresent property.
     * 
     */
    public void setCardPresent(int value) {
        this.cardPresent = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the cardValidFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardValidFrom() {
        return cardValidFrom;
    }

    /**
     * Sets the value of the cardValidFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardValidFrom(String value) {
        this.cardValidFrom = value;
    }

    /**
     * Gets the value of the chargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeAmount() {
        return chargeAmount;
    }

    /**
     * Sets the value of the chargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeAmount(String value) {
        this.chargeAmount = value;
    }

    /**
     * Gets the value of the client property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClient() {
        return client;
    }

    /**
     * Sets the value of the client property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClient(String value) {
        this.client = value;
    }

    /**
     * Gets the value of the companyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * Sets the value of the companyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyCode(String value) {
        this.companyCode = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the currencyKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyKey() {
        return currencyKey;
    }

    /**
     * Sets the value of the currencyKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyKey(String value) {
        this.currencyKey = value;
    }

    /**
     * Gets the value of the custTXN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustTXN() {
        return custTXN;
    }

    /**
     * Sets the value of the custTXN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustTXN(String value) {
        this.custTXN = value;
    }

    /**
     * Gets the value of the customerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerNumber() {
        return customerNumber;
    }

    /**
     * Sets the value of the customerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerNumber(String value) {
        this.customerNumber = value;
    }

    /**
     * Gets the value of the fiscalYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiscalYear() {
        return fiscalYear;
    }

    /**
     * Sets the value of the fiscalYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiscalYear(String value) {
        this.fiscalYear = value;
    }

    /**
     * Gets the value of the glAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGLAccount() {
        return glAccount;
    }

    /**
     * Sets the value of the glAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGLAccount(String value) {
        this.glAccount = value;
    }

    /**
     * Gets the value of the lastModificationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModificationDate() {
        return lastModificationDate;
    }

    /**
     * Sets the value of the lastModificationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModificationDate(XMLGregorianCalendar value) {
        this.lastModificationDate = value;
    }

    /**
     * Gets the value of the locationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationID() {
        return locationID;
    }

    /**
     * Sets the value of the locationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationID(String value) {
        this.locationID = value;
    }

    /**
     * Gets the value of the merchantID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantID() {
        return merchantID;
    }

    /**
     * Sets the value of the merchantID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantID(String value) {
        this.merchantID = value;
    }

    /**
     * Gets the value of the merchantTXN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantTXN() {
        return merchantTXN;
    }

    /**
     * Sets the value of the merchantTXN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantTXN(String value) {
        this.merchantTXN = value;
    }

    /**
     * Gets the value of the merchantTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantTransactionID() {
        return merchantTransactionID;
    }

    /**
     * Sets the value of the merchantTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantTransactionID(String value) {
        this.merchantTransactionID = value;
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
     * Gets the value of the modifiedStatus property.
     * 
     */
    public int getModifiedStatus() {
        return modifiedStatus;
    }

    /**
     * Sets the value of the modifiedStatus property.
     * 
     */
    public void setModifiedStatus(int value) {
        this.modifiedStatus = value;
    }

    /**
     * Gets the value of the orderDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderDate() {
        return orderDate;
    }

    /**
     * Sets the value of the orderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderDate(XMLGregorianCalendar value) {
        this.orderDate = value;
    }

    /**
     * Gets the value of the orderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderID() {
        return orderID;
    }

    /**
     * Sets the value of the orderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderID(String value) {
        this.orderID = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the poNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPONumber() {
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
    public void setPONumber(String value) {
        this.poNumber = value;
    }

    /**
     * Gets the value of the packetOperation property.
     * 
     */
    public int getPacketOperation() {
        return packetOperation;
    }

    /**
     * Sets the value of the packetOperation property.
     * 
     */
    public void setPacketOperation(int value) {
        this.packetOperation = value;
    }

    /**
     * Gets the value of the preauthorized property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreauthorized() {
        return preauthorized;
    }

    /**
     * Sets the value of the preauthorized property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreauthorized(String value) {
        this.preauthorized = value;
    }

    /**
     * Gets the value of the referenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceCode() {
        return referenceCode;
    }

    /**
     * Sets the value of the referenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceCode(String value) {
        this.referenceCode = value;
    }

    /**
     * Gets the value of the referenceLineItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceLineItem() {
        return referenceLineItem;
    }

    /**
     * Sets the value of the referenceLineItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceLineItem(String value) {
        this.referenceLineItem = value;
    }

    /**
     * Gets the value of the responseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseCode() {
        return responseCode;
    }

    /**
     * Sets the value of the responseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseCode(String value) {
        this.responseCode = value;
    }

    /**
     * Gets the value of the salesDocNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesDocNumber() {
        return salesDocNumber;
    }

    /**
     * Sets the value of the salesDocNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesDocNumber(String value) {
        this.salesDocNumber = value;
    }

    /**
     * Gets the value of the settlementAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementAmount() {
        return settlementAmount;
    }

    /**
     * Sets the value of the settlementAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementAmount(String value) {
        this.settlementAmount = value;
    }

    /**
     * Gets the value of the settlementDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSettlementDate() {
        return settlementDate;
    }

    /**
     * Sets the value of the settlementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSettlementDate(XMLGregorianCalendar value) {
        this.settlementDate = value;
    }

    /**
     * Gets the value of the settlementReferenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementReferenceCode() {
        return settlementReferenceCode;
    }

    /**
     * Sets the value of the settlementReferenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementReferenceCode(String value) {
        this.settlementReferenceCode = value;
    }

    /**
     * Gets the value of the shippingCaptureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShippingCaptureDate() {
        return shippingCaptureDate;
    }

    /**
     * Sets the value of the shippingCaptureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShippingCaptureDate(XMLGregorianCalendar value) {
        this.shippingCaptureDate = value;
    }

    /**
     * Gets the value of the shippingLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingLocationID() {
        return shippingLocationID;
    }

    /**
     * Sets the value of the shippingLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingLocationID(String value) {
        this.shippingLocationID = value;
    }

    /**
     * Gets the value of the shippingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingMethod() {
        return shippingMethod;
    }

    /**
     * Sets the value of the shippingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingMethod(String value) {
        this.shippingMethod = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     */
    public int getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     */
    public void setStatusCode(int value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the statusTXN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusTXN() {
        return statusTXN;
    }

    /**
     * Sets the value of the statusTXN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusTXN(String value) {
        this.statusTXN = value;
    }

    /**
     * Gets the value of the taxLevel1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxLevel1() {
        return taxLevel1;
    }

    /**
     * Sets the value of the taxLevel1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxLevel1(String value) {
        this.taxLevel1 = value;
    }

    /**
     * Gets the value of the taxLevel2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxLevel2() {
        return taxLevel2;
    }

    /**
     * Sets the value of the taxLevel2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxLevel2(String value) {
        this.taxLevel2 = value;
    }

    /**
     * Gets the value of the taxLevel3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxLevel3() {
        return taxLevel3;
    }

    /**
     * Sets the value of the taxLevel3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxLevel3(String value) {
        this.taxLevel3 = value;
    }

    /**
     * Gets the value of the taxLevel4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxLevel4() {
        return taxLevel4;
    }

    /**
     * Sets the value of the taxLevel4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxLevel4(String value) {
        this.taxLevel4 = value;
    }

    /**
     * Gets the value of the terminalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalID() {
        return terminalID;
    }

    /**
     * Sets the value of the terminalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalID(String value) {
        this.terminalID = value;
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
     * Gets the value of the vatNumberCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVATNumberCustomer() {
        return vatNumberCustomer;
    }

    /**
     * Sets the value of the vatNumberCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVATNumberCustomer(String value) {
        this.vatNumberCustomer = value;
    }

    /**
     * Gets the value of the vatNumberMerchant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVATNumberMerchant() {
        return vatNumberMerchant;
    }

    /**
     * Sets the value of the vatNumberMerchant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVATNumberMerchant(String value) {
        this.vatNumberMerchant = value;
    }

    /**
     * Gets the value of the xiid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXIID() {
        return xiid;
    }

    /**
     * Sets the value of the xiid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXIID(String value) {
        this.xiid = value;
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

    /**
     * Gets the value of the lineItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLineItem }
     *     
     */
    public ArrayOfLineItem getLineItems() {
        return lineItems;
    }

    /**
     * Sets the value of the lineItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLineItem }
     *     
     */
    public void setLineItems(ArrayOfLineItem value) {
        this.lineItems = value;
    }

    /**
     * Gets the value of the sourceSystemInfoItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInfoItem }
     *     
     */
    public ArrayOfInfoItem getSourceSystemInfoItems() {
        return sourceSystemInfoItems;
    }

    /**
     * Sets the value of the sourceSystemInfoItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInfoItem }
     *     
     */
    public void setSourceSystemInfoItems(ArrayOfInfoItem value) {
        this.sourceSystemInfoItems = value;
    }

    /**
     * Gets the value of the blobItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBlobItem }
     *     
     */
    public ArrayOfBlobItem getBlobItems() {
        return blobItems;
    }

    /**
     * Sets the value of the blobItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBlobItem }
     *     
     */
    public void setBlobItems(ArrayOfBlobItem value) {
        this.blobItems = value;
    }

    /**
     * Gets the value of the checkImages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCheckImage }
     *     
     */
    public ArrayOfCheckImage getCheckImages() {
        return checkImages;
    }

    /**
     * Sets the value of the checkImages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCheckImage }
     *     
     */
    public void setCheckImages(ArrayOfCheckImage value) {
        this.checkImages = value;
    }

}
