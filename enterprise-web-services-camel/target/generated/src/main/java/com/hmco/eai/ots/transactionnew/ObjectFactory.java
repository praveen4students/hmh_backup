
package com.hmco.eai.ots.transactionnew;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.hmco.eai.EaiException;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.hmco.eai.ots.transactionnew package. 
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

    private final static QName _InvoiceId_QNAME = new QName("http://www.hmco.com/EAI/OTS/TransactionNew", "invoiceId");
    private final static QName _TransactionRejectionStatus_QNAME = new QName("http://www.hmco.com/EAI/OTS/TransactionNew", "transactionRejectionStatus");
    private final static QName _ShipToCustomerEmailAddress_QNAME = new QName("http://www.hmco.com/EAI/OTS/TransactionNew", "shipToCustomerEmailAddress");
    private final static QName _LineitemRejectionStatus_QNAME = new QName("http://www.hmco.com/EAI/OTS/TransactionNew", "lineitemRejectionStatus");
    private final static QName _BillToCustomerEmailAddress_QNAME = new QName("http://www.hmco.com/EAI/OTS/TransactionNew", "billToCustomerEmailAddress");
    private final static QName _ShipToCareOf1_QNAME = new QName("http://www.hmco.com/EAI/OTS/TransactionNew", "shipToCareOf_1");
    private final static QName _ShipToCareOf2_QNAME = new QName("http://www.hmco.com/EAI/OTS/TransactionNew", "shipToCareOf_2");
    private final static QName _SoldToCustomerEmailAddress_QNAME = new QName("http://www.hmco.com/EAI/OTS/TransactionNew", "soldToCustomerEmailAddress");
    private final static QName _ZipCode_QNAME = new QName("http://www.hmco.com/EAI/OTS/TransactionNew", "zipCode");
    private final static QName _TransactionLineNo_QNAME = new QName("http://www.hmco.com/EAI/OTS/TransactionNew", "transactionLineNo");
    private final static QName _TransactionException_QNAME = new QName("http://www.hmco.com/EAI/OTS/TransactionNew", "transactionException");
    private final static QName _EmailBody_QNAME = new QName("http://www.hmco.com/EAI/OTS/TransactionNew", "emailBody");
    private final static QName _InvoiceRequestType_QNAME = new QName("http://www.hmco.com/EAI/OTS/TransactionNew", "invoiceRequestType");
    private final static QName _SearchType_QNAME = new QName("http://www.hmco.com/EAI/OTS/TransactionNew", "searchType");
    private final static QName _SoldToSANNumber_QNAME = new QName("http://www.hmco.com/EAI/OTS/TransactionNew", "soldToSANNumber");
    private final static QName _ItemType_QNAME = new QName("http://www.hmco.com/EAI/OTS/TransactionNew", "itemType");
    private final static QName _MaterialID_QNAME = new QName("http://www.hmco.com/EAI/OTS/TransactionNew", "materialID");
    private final static QName _EmailTo_QNAME = new QName("http://www.hmco.com/EAI/OTS/TransactionNew", "emailTo");
    private final static QName _EmailCc_QNAME = new QName("http://www.hmco.com/EAI/OTS/TransactionNew", "emailCc");
    private final static QName _CountryCode_QNAME = new QName("http://www.hmco.com/EAI/OTS/TransactionNew", "countryCode");
    private final static QName _ShipToSANNumber_QNAME = new QName("http://www.hmco.com/EAI/OTS/TransactionNew", "shipToSANNumber");
    private final static QName _BillingBlock_QNAME = new QName("http://www.hmco.com/EAI/OTS/TransactionNew", "billingBlock");
    private final static QName _Pdf_QNAME = new QName("http://www.hmco.com/EAI/OTS/TransactionNew", "pdf");
    private final static QName _IsKitComponent_QNAME = new QName("http://www.hmco.com/EAI/OTS/TransactionNew", "isKitComponent");
    private final static QName _BillToSANNumber_QNAME = new QName("http://www.hmco.com/EAI/OTS/TransactionNew", "billToSANNumber");
    private final static QName _SanNumber_QNAME = new QName("http://www.hmco.com/EAI/OTS/TransactionNew", "sanNumber");
    private final static QName _TransactionNo_QNAME = new QName("http://www.hmco.com/EAI/OTS/TransactionNew", "transactionNo");
    private final static QName _Division_QNAME = new QName("http://www.hmco.com/EAI/OTS/TransactionNew", "Division");
    private final static QName _EmailSubject_QNAME = new QName("http://www.hmco.com/EAI/OTS/TransactionNew", "emailSubject");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.hmco.eai.ots.transactionnew
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InvoiceDetailsList }
     * 
     */
    public InvoiceDetailsList createInvoiceDetailsList() {
        return new InvoiceDetailsList();
    }

    /**
     * Create an instance of {@link InvoiceTransactionItem.LineItem }
     * 
     */
    public InvoiceTransactionItem.LineItem createInvoiceTransactionItemLineItem() {
        return new InvoiceTransactionItem.LineItem();
    }

    /**
     * Create an instance of {@link InvoiceTransactionItem }
     * 
     */
    public InvoiceTransactionItem createInvoiceTransactionItem() {
        return new InvoiceTransactionItem();
    }

    /**
     * Create an instance of {@link RetrieveInvoicePDFRequest }
     * 
     */
    public RetrieveInvoicePDFRequest createRetrieveInvoicePDFRequest() {
        return new RetrieveInvoicePDFRequest();
    }

    /**
     * Create an instance of {@link ProductInfo2 }
     * 
     */
    public ProductInfo2 createProductInfo2() {
        return new ProductInfo2();
    }

    /**
     * Create an instance of {@link ShipmentDetailsItem }
     * 
     */
    public ShipmentDetailsItem createShipmentDetailsItem() {
        return new ShipmentDetailsItem();
    }

    /**
     * Create an instance of {@link Transaction }
     * 
     */
    public Transaction createTransaction() {
        return new Transaction();
    }

    /**
     * Create an instance of {@link TransactionSearchCriteria }
     * 
     */
    public TransactionSearchCriteria createTransactionSearchCriteria() {
        return new TransactionSearchCriteria();
    }

    /**
     * Create an instance of {@link SalesRep }
     * 
     */
    public SalesRep createSalesRep() {
        return new SalesRep();
    }

    /**
     * Create an instance of {@link ShipmentDetails }
     * 
     */
    public ShipmentDetails createShipmentDetails() {
        return new ShipmentDetails();
    }

    /**
     * Create an instance of {@link ShipmentDetailsItem.LineItem }
     * 
     */
    public ShipmentDetailsItem.LineItem createShipmentDetailsItemLineItem() {
        return new ShipmentDetailsItem.LineItem();
    }

    /**
     * Create an instance of {@link ShipmentDetailsItem.TrackingItem }
     * 
     */
    public ShipmentDetailsItem.TrackingItem createShipmentDetailsItemTrackingItem() {
        return new ShipmentDetailsItem.TrackingItem();
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
     * Create an instance of {@link TransactionExceptionList }
     * 
     */
    public TransactionExceptionList createTransactionExceptionList() {
        return new TransactionExceptionList();
    }

    /**
     * Create an instance of {@link TransactionIDList }
     * 
     */
    public TransactionIDList createTransactionIDList() {
        return new TransactionIDList();
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
     * Create an instance of {@link RetrieveInvoicePDFResponse }
     * 
     */
    public RetrieveInvoicePDFResponse createRetrieveInvoicePDFResponse() {
        return new RetrieveInvoicePDFResponse();
    }

    /**
     * Create an instance of {@link TransactionList }
     * 
     */
    public TransactionList createTransactionList() {
        return new TransactionList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/TransactionNew", name = "invoiceId")
    public JAXBElement<String> createInvoiceId(String value) {
        return new JAXBElement<String>(_InvoiceId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/TransactionNew", name = "transactionRejectionStatus")
    public JAXBElement<String> createTransactionRejectionStatus(String value) {
        return new JAXBElement<String>(_TransactionRejectionStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/TransactionNew", name = "shipToCustomerEmailAddress")
    public JAXBElement<String> createShipToCustomerEmailAddress(String value) {
        return new JAXBElement<String>(_ShipToCustomerEmailAddress_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/TransactionNew", name = "lineitemRejectionStatus")
    public JAXBElement<String> createLineitemRejectionStatus(String value) {
        return new JAXBElement<String>(_LineitemRejectionStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/TransactionNew", name = "billToCustomerEmailAddress")
    public JAXBElement<String> createBillToCustomerEmailAddress(String value) {
        return new JAXBElement<String>(_BillToCustomerEmailAddress_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/TransactionNew", name = "shipToCareOf_1")
    public JAXBElement<String> createShipToCareOf1(String value) {
        return new JAXBElement<String>(_ShipToCareOf1_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/TransactionNew", name = "shipToCareOf_2")
    public JAXBElement<String> createShipToCareOf2(String value) {
        return new JAXBElement<String>(_ShipToCareOf2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/TransactionNew", name = "soldToCustomerEmailAddress")
    public JAXBElement<String> createSoldToCustomerEmailAddress(String value) {
        return new JAXBElement<String>(_SoldToCustomerEmailAddress_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/TransactionNew", name = "zipCode")
    public JAXBElement<String> createZipCode(String value) {
        return new JAXBElement<String>(_ZipCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/TransactionNew", name = "transactionLineNo")
    public JAXBElement<Integer> createTransactionLineNo(Integer value) {
        return new JAXBElement<Integer>(_TransactionLineNo_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EaiException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/TransactionNew", name = "transactionException")
    public JAXBElement<EaiException> createTransactionException(EaiException value) {
        return new JAXBElement<EaiException>(_TransactionException_QNAME, EaiException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/TransactionNew", name = "emailBody")
    public JAXBElement<String> createEmailBody(String value) {
        return new JAXBElement<String>(_EmailBody_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/TransactionNew", name = "invoiceRequestType")
    public JAXBElement<String> createInvoiceRequestType(String value) {
        return new JAXBElement<String>(_InvoiceRequestType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/TransactionNew", name = "searchType")
    public JAXBElement<String> createSearchType(String value) {
        return new JAXBElement<String>(_SearchType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/TransactionNew", name = "soldToSANNumber")
    public JAXBElement<String> createSoldToSANNumber(String value) {
        return new JAXBElement<String>(_SoldToSANNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/TransactionNew", name = "itemType")
    public JAXBElement<String> createItemType(String value) {
        return new JAXBElement<String>(_ItemType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/TransactionNew", name = "materialID")
    public JAXBElement<String> createMaterialID(String value) {
        return new JAXBElement<String>(_MaterialID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/TransactionNew", name = "emailTo")
    public JAXBElement<String> createEmailTo(String value) {
        return new JAXBElement<String>(_EmailTo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/TransactionNew", name = "emailCc")
    public JAXBElement<String> createEmailCc(String value) {
        return new JAXBElement<String>(_EmailCc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/TransactionNew", name = "countryCode")
    public JAXBElement<String> createCountryCode(String value) {
        return new JAXBElement<String>(_CountryCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/TransactionNew", name = "shipToSANNumber")
    public JAXBElement<String> createShipToSANNumber(String value) {
        return new JAXBElement<String>(_ShipToSANNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/TransactionNew", name = "billingBlock")
    public JAXBElement<String> createBillingBlock(String value) {
        return new JAXBElement<String>(_BillingBlock_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/TransactionNew", name = "pdf")
    public JAXBElement<String> createPdf(String value) {
        return new JAXBElement<String>(_Pdf_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/TransactionNew", name = "isKitComponent")
    public JAXBElement<Boolean> createIsKitComponent(Boolean value) {
        return new JAXBElement<Boolean>(_IsKitComponent_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/TransactionNew", name = "billToSANNumber")
    public JAXBElement<String> createBillToSANNumber(String value) {
        return new JAXBElement<String>(_BillToSANNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/TransactionNew", name = "sanNumber")
    public JAXBElement<String> createSanNumber(String value) {
        return new JAXBElement<String>(_SanNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/TransactionNew", name = "transactionNo")
    public JAXBElement<String> createTransactionNo(String value) {
        return new JAXBElement<String>(_TransactionNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/TransactionNew", name = "Division")
    public JAXBElement<String> createDivision(String value) {
        return new JAXBElement<String>(_Division_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/TransactionNew", name = "emailSubject")
    public JAXBElement<String> createEmailSubject(String value) {
        return new JAXBElement<String>(_EmailSubject_QNAME, String.class, null, value);
    }

}
