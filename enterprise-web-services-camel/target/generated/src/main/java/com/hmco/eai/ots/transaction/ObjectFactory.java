
package com.hmco.eai.ots.transaction;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.hmco.eai.EaiException;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.hmco.eai.ots.transaction package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ShipmentIDList_QNAME = new QName("http://www.hmco.com/EAI/OTS/Transaction", "shipmentIDList");
    private final static QName _ShipToCustomerEmailAddress_QNAME = new QName("http://www.hmco.com/EAI/OTS/Transaction", "shipToCustomerEmailAddress");
    private final static QName _TransactionRejectionStatus_QNAME = new QName("http://www.hmco.com/EAI/OTS/Transaction", "transactionRejectionStatus");
    private final static QName _InvoiceId_QNAME = new QName("http://www.hmco.com/EAI/OTS/Transaction", "invoiceId");
    private final static QName _BillToCustomerEmailAddress_QNAME = new QName("http://www.hmco.com/EAI/OTS/Transaction", "billToCustomerEmailAddress");
    private final static QName _ShipToCareOf1_QNAME = new QName("http://www.hmco.com/EAI/OTS/Transaction", "shipToCareOf_1");
    private final static QName _ShipToCareOf2_QNAME = new QName("http://www.hmco.com/EAI/OTS/Transaction", "shipToCareOf_2");
    private final static QName _LineitemRejectionStatus_QNAME = new QName("http://www.hmco.com/EAI/OTS/Transaction", "lineitemRejectionStatus");
    private final static QName _TransactionIDList_QNAME = new QName("http://www.hmco.com/EAI/OTS/Transaction", "transactionIDList");
    private final static QName _ZipCode_QNAME = new QName("http://www.hmco.com/EAI/OTS/Transaction", "zipCode");
    private final static QName _SoldToCustomerEmailAddress_QNAME = new QName("http://www.hmco.com/EAI/OTS/Transaction", "soldToCustomerEmailAddress");
    private final static QName _TransactionLineNo_QNAME = new QName("http://www.hmco.com/EAI/OTS/Transaction", "transactionLineNo");
    private final static QName _TransactionException_QNAME = new QName("http://www.hmco.com/EAI/OTS/Transaction", "transactionException");
    private final static QName _InvoiceRequestType_QNAME = new QName("http://www.hmco.com/EAI/OTS/Transaction", "invoiceRequestType");
    private final static QName _EmailBody_QNAME = new QName("http://www.hmco.com/EAI/OTS/Transaction", "emailBody");
    private final static QName _SoldToSANNumber_QNAME = new QName("http://www.hmco.com/EAI/OTS/Transaction", "soldToSANNumber");
    private final static QName _SearchType_QNAME = new QName("http://www.hmco.com/EAI/OTS/Transaction", "searchType");
    private final static QName _ItemType_QNAME = new QName("http://www.hmco.com/EAI/OTS/Transaction", "itemType");
    private final static QName _MaterialID_QNAME = new QName("http://www.hmco.com/EAI/OTS/Transaction", "materialID");
    private final static QName _EmailTo_QNAME = new QName("http://www.hmco.com/EAI/OTS/Transaction", "emailTo");
    private final static QName _EmailCc_QNAME = new QName("http://www.hmco.com/EAI/OTS/Transaction", "emailCc");
    private final static QName _CountryCode_QNAME = new QName("http://www.hmco.com/EAI/OTS/Transaction", "countryCode");
    private final static QName _ShipToSANNumber_QNAME = new QName("http://www.hmco.com/EAI/OTS/Transaction", "shipToSANNumber");
    private final static QName _SanNumber_QNAME = new QName("http://www.hmco.com/EAI/OTS/Transaction", "sanNumber");
    private final static QName _BillToSANNumber_QNAME = new QName("http://www.hmco.com/EAI/OTS/Transaction", "billToSANNumber");
    private final static QName _BillingBlock_QNAME = new QName("http://www.hmco.com/EAI/OTS/Transaction", "billingBlock");
    private final static QName _IsKitComponent_QNAME = new QName("http://www.hmco.com/EAI/OTS/Transaction", "isKitComponent");
    private final static QName _Pdf_QNAME = new QName("http://www.hmco.com/EAI/OTS/Transaction", "pdf");
    private final static QName _TransactionNo_QNAME = new QName("http://www.hmco.com/EAI/OTS/Transaction", "transactionNo");
    private final static QName _Division_QNAME = new QName("http://www.hmco.com/EAI/OTS/Transaction", "Division");
    private final static QName _EmailSubject_QNAME = new QName("http://www.hmco.com/EAI/OTS/Transaction", "emailSubject");
    private final static QName _InvoiceIDList_QNAME = new QName("http://www.hmco.com/EAI/OTS/Transaction", "invoiceIDList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.hmco.eai.ots.transaction
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InvoiceTransactionItem }
     * 
     */
    public InvoiceTransactionItem createInvoiceTransactionItem() {
        return new InvoiceTransactionItem();
    }

    /**
     * Create an instance of {@link ShipmentDetailsList }
     * 
     */
    public ShipmentDetailsList createShipmentDetailsList() {
        return new ShipmentDetailsList();
    }

    /**
     * Create an instance of {@link InvoiceDetails }
     * 
     */
    public InvoiceDetails createInvoiceDetails() {
        return new InvoiceDetails();
    }

    /**
     * Create an instance of {@link TransactionSearchCriteria }
     * 
     */
    public TransactionSearchCriteria createTransactionSearchCriteria() {
        return new TransactionSearchCriteria();
    }

    /**
     * Create an instance of {@link InvoiceTransactionItem.LineItem }
     * 
     */
    public InvoiceTransactionItem.LineItem createInvoiceTransactionItemLineItem() {
        return new InvoiceTransactionItem.LineItem();
    }

    /**
     * Create an instance of {@link Transaction }
     * 
     */
    public Transaction createTransaction() {
        return new Transaction();
    }

    /**
     * Create an instance of {@link ShipmentDetailsItem.LineItem }
     * 
     */
    public ShipmentDetailsItem.LineItem createShipmentDetailsItemLineItem() {
        return new ShipmentDetailsItem.LineItem();
    }

    /**
     * Create an instance of {@link RetrieveInvoicePDFResponse }
     * 
     */
    public RetrieveInvoicePDFResponse createRetrieveInvoicePDFResponse() {
        return new RetrieveInvoicePDFResponse();
    }

    /**
     * Create an instance of {@link TransactionIDList }
     * 
     */
    public TransactionIDList createTransactionIDList() {
        return new TransactionIDList();
    }

    /**
     * Create an instance of {@link ShipmentDetailsItem.TrackingItem }
     * 
     */
    public ShipmentDetailsItem.TrackingItem createShipmentDetailsItemTrackingItem() {
        return new ShipmentDetailsItem.TrackingItem();
    }

    /**
     * Create an instance of {@link InvoiceDetailsList }
     * 
     */
    public InvoiceDetailsList createInvoiceDetailsList() {
        return new InvoiceDetailsList();
    }

    /**
     * Create an instance of {@link ShipmentDetails }
     * 
     */
    public ShipmentDetails createShipmentDetails() {
        return new ShipmentDetails();
    }

    /**
     * Create an instance of {@link RetrieveInvoicePDFRequest }
     * 
     */
    public RetrieveInvoicePDFRequest createRetrieveInvoicePDFRequest() {
        return new RetrieveInvoicePDFRequest();
    }

    /**
     * Create an instance of {@link TransactionLineItem }
     * 
     */
    public TransactionLineItem createTransactionLineItem() {
        return new TransactionLineItem();
    }

    /**
     * Create an instance of {@link TransactionSearchCriteria.PartnerFunctionList }
     * 
     */
    public TransactionSearchCriteria.PartnerFunctionList createTransactionSearchCriteriaPartnerFunctionList() {
        return new TransactionSearchCriteria.PartnerFunctionList();
    }

    /**
     * Create an instance of {@link SalesRep }
     * 
     */
    public SalesRep createSalesRep() {
        return new SalesRep();
    }

    /**
     * Create an instance of {@link ShipmentDetailsItem }
     * 
     */
    public ShipmentDetailsItem createShipmentDetailsItem() {
        return new ShipmentDetailsItem();
    }

    /**
     * Create an instance of {@link TransactionList }
     * 
     */
    public TransactionList createTransactionList() {
        return new TransactionList();
    }

    /**
     * Create an instance of {@link TransactionExceptionList }
     * 
     */
    public TransactionExceptionList createTransactionExceptionList() {
        return new TransactionExceptionList();
    }

    /**
     * Create an instance of {@link ProductInfo }
     * 
     */
    public ProductInfo createProductInfo() {
        return new ProductInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionIDList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Transaction", name = "shipmentIDList")
    public JAXBElement<TransactionIDList> createShipmentIDList(TransactionIDList value) {
        return new JAXBElement<TransactionIDList>(_ShipmentIDList_QNAME, TransactionIDList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Transaction", name = "shipToCustomerEmailAddress")
    public JAXBElement<String> createShipToCustomerEmailAddress(String value) {
        return new JAXBElement<String>(_ShipToCustomerEmailAddress_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Transaction", name = "transactionRejectionStatus")
    public JAXBElement<String> createTransactionRejectionStatus(String value) {
        return new JAXBElement<String>(_TransactionRejectionStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Transaction", name = "invoiceId")
    public JAXBElement<String> createInvoiceId(String value) {
        return new JAXBElement<String>(_InvoiceId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Transaction", name = "billToCustomerEmailAddress")
    public JAXBElement<String> createBillToCustomerEmailAddress(String value) {
        return new JAXBElement<String>(_BillToCustomerEmailAddress_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Transaction", name = "shipToCareOf_1")
    public JAXBElement<String> createShipToCareOf1(String value) {
        return new JAXBElement<String>(_ShipToCareOf1_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Transaction", name = "shipToCareOf_2")
    public JAXBElement<String> createShipToCareOf2(String value) {
        return new JAXBElement<String>(_ShipToCareOf2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Transaction", name = "lineitemRejectionStatus")
    public JAXBElement<String> createLineitemRejectionStatus(String value) {
        return new JAXBElement<String>(_LineitemRejectionStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionIDList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Transaction", name = "transactionIDList")
    public JAXBElement<TransactionIDList> createTransactionIDList(TransactionIDList value) {
        return new JAXBElement<TransactionIDList>(_TransactionIDList_QNAME, TransactionIDList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Transaction", name = "zipCode")
    public JAXBElement<String> createZipCode(String value) {
        return new JAXBElement<String>(_ZipCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Transaction", name = "soldToCustomerEmailAddress")
    public JAXBElement<String> createSoldToCustomerEmailAddress(String value) {
        return new JAXBElement<String>(_SoldToCustomerEmailAddress_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Transaction", name = "transactionLineNo")
    public JAXBElement<Integer> createTransactionLineNo(Integer value) {
        return new JAXBElement<Integer>(_TransactionLineNo_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EaiException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Transaction", name = "transactionException")
    public JAXBElement<EaiException> createTransactionException(EaiException value) {
        return new JAXBElement<EaiException>(_TransactionException_QNAME, EaiException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Transaction", name = "invoiceRequestType")
    public JAXBElement<String> createInvoiceRequestType(String value) {
        return new JAXBElement<String>(_InvoiceRequestType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Transaction", name = "emailBody")
    public JAXBElement<String> createEmailBody(String value) {
        return new JAXBElement<String>(_EmailBody_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Transaction", name = "soldToSANNumber")
    public JAXBElement<String> createSoldToSANNumber(String value) {
        return new JAXBElement<String>(_SoldToSANNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Transaction", name = "searchType")
    public JAXBElement<String> createSearchType(String value) {
        return new JAXBElement<String>(_SearchType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Transaction", name = "itemType")
    public JAXBElement<String> createItemType(String value) {
        return new JAXBElement<String>(_ItemType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Transaction", name = "materialID")
    public JAXBElement<String> createMaterialID(String value) {
        return new JAXBElement<String>(_MaterialID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Transaction", name = "emailTo")
    public JAXBElement<String> createEmailTo(String value) {
        return new JAXBElement<String>(_EmailTo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Transaction", name = "emailCc")
    public JAXBElement<String> createEmailCc(String value) {
        return new JAXBElement<String>(_EmailCc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Transaction", name = "countryCode")
    public JAXBElement<String> createCountryCode(String value) {
        return new JAXBElement<String>(_CountryCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Transaction", name = "shipToSANNumber")
    public JAXBElement<String> createShipToSANNumber(String value) {
        return new JAXBElement<String>(_ShipToSANNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Transaction", name = "sanNumber")
    public JAXBElement<String> createSanNumber(String value) {
        return new JAXBElement<String>(_SanNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Transaction", name = "billToSANNumber")
    public JAXBElement<String> createBillToSANNumber(String value) {
        return new JAXBElement<String>(_BillToSANNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Transaction", name = "billingBlock")
    public JAXBElement<String> createBillingBlock(String value) {
        return new JAXBElement<String>(_BillingBlock_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Transaction", name = "isKitComponent")
    public JAXBElement<Boolean> createIsKitComponent(Boolean value) {
        return new JAXBElement<Boolean>(_IsKitComponent_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Transaction", name = "pdf")
    public JAXBElement<String> createPdf(String value) {
        return new JAXBElement<String>(_Pdf_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Transaction", name = "transactionNo")
    public JAXBElement<String> createTransactionNo(String value) {
        return new JAXBElement<String>(_TransactionNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Transaction", name = "Division")
    public JAXBElement<String> createDivision(String value) {
        return new JAXBElement<String>(_Division_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Transaction", name = "emailSubject")
    public JAXBElement<String> createEmailSubject(String value) {
        return new JAXBElement<String>(_EmailSubject_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionIDList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Transaction", name = "invoiceIDList")
    public JAXBElement<TransactionIDList> createInvoiceIDList(TransactionIDList value) {
        return new JAXBElement<TransactionIDList>(_InvoiceIDList_QNAME, TransactionIDList.class, null, value);
    }

}
