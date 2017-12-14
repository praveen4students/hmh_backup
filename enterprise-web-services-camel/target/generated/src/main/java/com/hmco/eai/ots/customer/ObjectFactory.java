
package com.hmco.eai.ots.customer;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.hmco.eai.EaiException;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.hmco.eai.ots.customer package. 
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

    private final static QName _GetCustomerDetailAsyncRequest_QNAME = new QName("http://www.hmco.com/EAI/OTS/Customer", "getCustomerDetailAsyncRequest");
    private final static QName _GetCustomerRelationshipsRequest_QNAME = new QName("http://www.hmco.com/EAI/OTS/Customer", "getCustomerRelationshipsRequest");
    private final static QName _BillToCustomer_QNAME = new QName("http://www.hmco.com/EAI/OTS/Customer", "billToCustomer");
    private final static QName _EmailAddress_QNAME = new QName("http://www.hmco.com/EAI/OTS/Customer", "emailAddress");
    private final static QName _EReturn_QNAME = new QName("http://www.hmco.com/EAI/OTS/Customer", "eReturn");
    private final static QName _IsPrimeMDR_QNAME = new QName("http://www.hmco.com/EAI/OTS/Customer", "isPrimeMDR");
    private final static QName _IsPrimary_QNAME = new QName("http://www.hmco.com/EAI/OTS/Customer", "isPrimary");
    private final static QName _EmailBody_QNAME = new QName("http://www.hmco.com/EAI/OTS/Customer", "emailBody");
    private final static QName _SfdcCustomerId_QNAME = new QName("http://www.hmco.com/EAI/OTS/Customer", "sfdcCustomerId");
    private final static QName _InsideSalesAccountFlag_QNAME = new QName("http://www.hmco.com/EAI/OTS/Customer", "insideSalesAccountFlag");
    private final static QName _CreateSundryCustomerAsyncRequest_QNAME = new QName("http://www.hmco.com/EAI/OTS/Customer", "createSundryCustomerAsyncRequest");
    private final static QName _CustomerException_QNAME = new QName("http://www.hmco.com/EAI/OTS/Customer", "customerException");
    private final static QName _TransactionType_QNAME = new QName("http://www.hmco.com/EAI/OTS/Customer", "transactionType");
    private final static QName _MaterialID_QNAME = new QName("http://www.hmco.com/EAI/OTS/Customer", "materialID");
    private final static QName _EmailCc_QNAME = new QName("http://www.hmco.com/EAI/OTS/Customer", "emailCc");
    private final static QName _Division_QNAME = new QName("http://www.hmco.com/EAI/OTS/Customer", "division");
    private final static QName _EmailTo_QNAME = new QName("http://www.hmco.com/EAI/OTS/Customer", "emailTo");
    private final static QName _GetCustomerDetailRequest_QNAME = new QName("http://www.hmco.com/EAI/OTS/Customer", "getCustomerDetailRequest");
    private final static QName _GetCustomerRelationshipsAsyncRequest_QNAME = new QName("http://www.hmco.com/EAI/OTS/Customer", "getCustomerRelationshipsAsyncRequest");
    private final static QName _CreateSundryCustomerRequest_QNAME = new QName("http://www.hmco.com/EAI/OTS/Customer", "createSundryCustomerRequest");
    private final static QName _Message_QNAME = new QName("http://www.hmco.com/EAI/OTS/Customer", "message");
    private final static QName _CustomerKeyList_QNAME = new QName("http://www.hmco.com/EAI/OTS/Customer", "customerKeyList");
    private final static QName _PnpAccountFlag_QNAME = new QName("http://www.hmco.com/EAI/OTS/Customer", "pnpAccountFlag");
    private final static QName _RelationshipType_QNAME = new QName("http://www.hmco.com/EAI/OTS/Customer", "relationshipType");
    private final static QName _StoreID_QNAME = new QName("http://www.hmco.com/EAI/OTS/Customer", "storeID");
    private final static QName _EmailSubject_QNAME = new QName("http://www.hmco.com/EAI/OTS/Customer", "emailSubject");
    private final static QName _CustomerID_QNAME = new QName("http://www.hmco.com/EAI/OTS/Customer", "customerID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.hmco.eai.ots.customer
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RelationshipTypeList }
     * 
     */
    public RelationshipTypeList createRelationshipTypeList() {
        return new RelationshipTypeList();
    }

    /**
     * Create an instance of {@link CustomerRelationshipList }
     * 
     */
    public CustomerRelationshipList createCustomerRelationshipList() {
        return new CustomerRelationshipList();
    }

    /**
     * Create an instance of {@link GetCustomerRelationshipsRequest }
     * 
     */
    public GetCustomerRelationshipsRequest createGetCustomerRelationshipsRequest() {
        return new GetCustomerRelationshipsRequest();
    }

    /**
     * Create an instance of {@link SFDCRep }
     * 
     */
    public SFDCRep createSFDCRep() {
        return new SFDCRep();
    }

    /**
     * Create an instance of {@link FindSFDCCustomerRequest }
     * 
     */
    public FindSFDCCustomerRequest createFindSFDCCustomerRequest() {
        return new FindSFDCCustomerRequest();
    }

    /**
     * Create an instance of {@link CustomerSearchCriteria }
     * 
     */
    public CustomerSearchCriteria createCustomerSearchCriteria() {
        return new CustomerSearchCriteria();
    }

    /**
     * Create an instance of {@link CustomerDetailList }
     * 
     */
    public CustomerDetailList createCustomerDetailList() {
        return new CustomerDetailList();
    }

    /**
     * Create an instance of {@link CustomerKey }
     * 
     */
    public CustomerKey createCustomerKey() {
        return new CustomerKey();
    }

    /**
     * Create an instance of {@link LookUpFields }
     * 
     */
    public LookUpFields createLookUpFields() {
        return new LookUpFields();
    }

    /**
     * Create an instance of {@link CreateEtailCustomerRequest }
     * 
     */
    public CreateEtailCustomerRequest createCreateEtailCustomerRequest() {
        return new CreateEtailCustomerRequest();
    }

    /**
     * Create an instance of {@link CustomerRelationship }
     * 
     */
    public CustomerRelationship createCustomerRelationship() {
        return new CustomerRelationship();
    }

    /**
     * Create an instance of {@link TitleList }
     * 
     */
    public TitleList createTitleList() {
        return new TitleList();
    }

    /**
     * Create an instance of {@link CustomerDetail.CustomerDivisionInfo }
     * 
     */
    public CustomerDetail.CustomerDivisionInfo createCustomerDetailCustomerDivisionInfo() {
        return new CustomerDetail.CustomerDivisionInfo();
    }

    /**
     * Create an instance of {@link CustomerDetail }
     * 
     */
    public CustomerDetail createCustomerDetail() {
        return new CustomerDetail();
    }

    /**
     * Create an instance of {@link GetCustomerSubstitutionsRequest }
     * 
     */
    public GetCustomerSubstitutionsRequest createGetCustomerSubstitutionsRequest() {
        return new GetCustomerSubstitutionsRequest();
    }

    /**
     * Create an instance of {@link CreateSundryCustomerRequest }
     * 
     */
    public CreateSundryCustomerRequest createCreateSundryCustomerRequest() {
        return new CreateSundryCustomerRequest();
    }

    /**
     * Create an instance of {@link SfdcCustomerIdList }
     * 
     */
    public SfdcCustomerIdList createSfdcCustomerIdList() {
        return new SfdcCustomerIdList();
    }

    /**
     * Create an instance of {@link CreateEtailCustomerResponse }
     * 
     */
    public CreateEtailCustomerResponse createCreateEtailCustomerResponse() {
        return new CreateEtailCustomerResponse();
    }

    /**
     * Create an instance of {@link SFDCRepList }
     * 
     */
    public SFDCRepList createSFDCRepList() {
        return new SFDCRepList();
    }

    /**
     * Create an instance of {@link CustomerIDList }
     * 
     */
    public CustomerIDList createCustomerIDList() {
        return new CustomerIDList();
    }

    /**
     * Create an instance of {@link CustomerKeyList }
     * 
     */
    public CustomerKeyList createCustomerKeyList() {
        return new CustomerKeyList();
    }

    /**
     * Create an instance of {@link SFDCCustomer }
     * 
     */
    public SFDCCustomer createSFDCCustomer() {
        return new SFDCCustomer();
    }

    /**
     * Create an instance of {@link CustomerExceptionList }
     * 
     */
    public CustomerExceptionList createCustomerExceptionList() {
        return new CustomerExceptionList();
    }

    /**
     * Create an instance of {@link SFDCCustomerList }
     * 
     */
    public SFDCCustomerList createSFDCCustomerList() {
        return new SFDCCustomerList();
    }

    /**
     * Create an instance of {@link CustomerSubstitution }
     * 
     */
    public CustomerSubstitution createCustomerSubstitution() {
        return new CustomerSubstitution();
    }

    /**
     * Create an instance of {@link EmailAddressStruct }
     * 
     */
    public EmailAddressStruct createEmailAddressStruct() {
        return new EmailAddressStruct();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link AccountStatementPDFResponse }
     * 
     */
    public AccountStatementPDFResponse createAccountStatementPDFResponse() {
        return new AccountStatementPDFResponse();
    }

    /**
     * Create an instance of {@link AccountStatementPDFRequest }
     * 
     */
    public AccountStatementPDFRequest createAccountStatementPDFRequest() {
        return new AccountStatementPDFRequest();
    }

    /**
     * Create an instance of {@link CustomerSubstitutionList }
     * 
     */
    public CustomerSubstitutionList createCustomerSubstitutionList() {
        return new CustomerSubstitutionList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerKeyList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Customer", name = "getCustomerDetailAsyncRequest")
    public JAXBElement<CustomerKeyList> createGetCustomerDetailAsyncRequest(CustomerKeyList value) {
        return new JAXBElement<CustomerKeyList>(_GetCustomerDetailAsyncRequest_QNAME, CustomerKeyList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerRelationshipsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Customer", name = "getCustomerRelationshipsRequest")
    public JAXBElement<GetCustomerRelationshipsRequest> createGetCustomerRelationshipsRequest(GetCustomerRelationshipsRequest value) {
        return new JAXBElement<GetCustomerRelationshipsRequest>(_GetCustomerRelationshipsRequest_QNAME, GetCustomerRelationshipsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Customer", name = "billToCustomer")
    public JAXBElement<String> createBillToCustomer(String value) {
        return new JAXBElement<String>(_BillToCustomer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Customer", name = "emailAddress")
    public JAXBElement<String> createEmailAddress(String value) {
        return new JAXBElement<String>(_EmailAddress_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Customer", name = "eReturn")
    public JAXBElement<String> createEReturn(String value) {
        return new JAXBElement<String>(_EReturn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Customer", name = "isPrimeMDR")
    public JAXBElement<Boolean> createIsPrimeMDR(Boolean value) {
        return new JAXBElement<Boolean>(_IsPrimeMDR_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Customer", name = "isPrimary")
    public JAXBElement<Boolean> createIsPrimary(Boolean value) {
        return new JAXBElement<Boolean>(_IsPrimary_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Customer", name = "emailBody")
    public JAXBElement<String> createEmailBody(String value) {
        return new JAXBElement<String>(_EmailBody_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Customer", name = "sfdcCustomerId")
    public JAXBElement<String> createSfdcCustomerId(String value) {
        return new JAXBElement<String>(_SfdcCustomerId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Customer", name = "insideSalesAccountFlag")
    public JAXBElement<Boolean> createInsideSalesAccountFlag(Boolean value) {
        return new JAXBElement<Boolean>(_InsideSalesAccountFlag_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSundryCustomerRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Customer", name = "createSundryCustomerAsyncRequest")
    public JAXBElement<CreateSundryCustomerRequest> createCreateSundryCustomerAsyncRequest(CreateSundryCustomerRequest value) {
        return new JAXBElement<CreateSundryCustomerRequest>(_CreateSundryCustomerAsyncRequest_QNAME, CreateSundryCustomerRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EaiException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Customer", name = "customerException")
    public JAXBElement<EaiException> createCustomerException(EaiException value) {
        return new JAXBElement<EaiException>(_CustomerException_QNAME, EaiException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Customer", name = "transactionType")
    public JAXBElement<String> createTransactionType(String value) {
        return new JAXBElement<String>(_TransactionType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Customer", name = "materialID")
    public JAXBElement<String> createMaterialID(String value) {
        return new JAXBElement<String>(_MaterialID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Customer", name = "emailCc")
    public JAXBElement<String> createEmailCc(String value) {
        return new JAXBElement<String>(_EmailCc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Customer", name = "division")
    public JAXBElement<String> createDivision(String value) {
        return new JAXBElement<String>(_Division_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Customer", name = "emailTo")
    public JAXBElement<String> createEmailTo(String value) {
        return new JAXBElement<String>(_EmailTo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerKeyList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Customer", name = "getCustomerDetailRequest")
    public JAXBElement<CustomerKeyList> createGetCustomerDetailRequest(CustomerKeyList value) {
        return new JAXBElement<CustomerKeyList>(_GetCustomerDetailRequest_QNAME, CustomerKeyList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerRelationshipsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Customer", name = "getCustomerRelationshipsAsyncRequest")
    public JAXBElement<GetCustomerRelationshipsRequest> createGetCustomerRelationshipsAsyncRequest(GetCustomerRelationshipsRequest value) {
        return new JAXBElement<GetCustomerRelationshipsRequest>(_GetCustomerRelationshipsAsyncRequest_QNAME, GetCustomerRelationshipsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSundryCustomerRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Customer", name = "createSundryCustomerRequest")
    public JAXBElement<CreateSundryCustomerRequest> createCreateSundryCustomerRequest(CreateSundryCustomerRequest value) {
        return new JAXBElement<CreateSundryCustomerRequest>(_CreateSundryCustomerRequest_QNAME, CreateSundryCustomerRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Customer", name = "message")
    public JAXBElement<String> createMessage(String value) {
        return new JAXBElement<String>(_Message_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerKeyList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Customer", name = "customerKeyList")
    public JAXBElement<CustomerKeyList> createCustomerKeyList(CustomerKeyList value) {
        return new JAXBElement<CustomerKeyList>(_CustomerKeyList_QNAME, CustomerKeyList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Customer", name = "pnpAccountFlag")
    public JAXBElement<Boolean> createPnpAccountFlag(Boolean value) {
        return new JAXBElement<Boolean>(_PnpAccountFlag_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Customer", name = "relationshipType")
    public JAXBElement<String> createRelationshipType(String value) {
        return new JAXBElement<String>(_RelationshipType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Customer", name = "storeID")
    public JAXBElement<String> createStoreID(String value) {
        return new JAXBElement<String>(_StoreID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Customer", name = "emailSubject")
    public JAXBElement<String> createEmailSubject(String value) {
        return new JAXBElement<String>(_EmailSubject_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Customer", name = "customerID")
    public JAXBElement<String> createCustomerID(String value) {
        return new JAXBElement<String>(_CustomerID_QNAME, String.class, null, value);
    }

}
