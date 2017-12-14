
package com.hmco.eai;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.hmco.eai package. 
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

    private final static QName _RequestId_QNAME = new QName("http://www.hmco.com/EAI", "requestId");
    private final static QName _SubmitSaleAsyncResultRequest_QNAME = new QName("http://www.hmco.com/EAI", "submitSaleAsyncResultRequest");
    private final static QName _GetCustomerRelationshipsAsyncResultRequest_QNAME = new QName("http://www.hmco.com/EAI", "getCustomerRelationshipsAsyncResultRequest");
    private final static QName _CreateSundryCustomerAsyncResultRequest_QNAME = new QName("http://www.hmco.com/EAI", "createSundryCustomerAsyncResultRequest");
    private final static QName _Error_QNAME = new QName("http://www.hmco.com/EAI", "error");
    private final static QName _AsyncRequestId_QNAME = new QName("http://www.hmco.com/EAI", "asyncRequestId");
    private final static QName _GetCustomerDetailAsyncResultRequest_QNAME = new QName("http://www.hmco.com/EAI", "getCustomerDetailAsyncResultRequest");
    private final static QName _EaiException_QNAME = new QName("http://www.hmco.com/EAI", "eaiException");
    private final static QName _GetMaterialATPAsyncResultRequest_QNAME = new QName("http://www.hmco.com/EAI", "getMaterialATPAsyncResultRequest");
    private final static QName _GetMaterialDetailAsyncResultRequest_QNAME = new QName("http://www.hmco.com/EAI", "getMaterialDetailAsyncResultRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.hmco.eai
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AsyncRequestStatus }
     * 
     */
    public AsyncRequestStatus createAsyncRequestStatus() {
        return new AsyncRequestStatus();
    }

    /**
     * Create an instance of {@link EaiException }
     * 
     */
    public EaiException createEaiException() {
        return new EaiException();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link ErrorList }
     * 
     */
    public ErrorList createErrorList() {
        return new ErrorList();
    }

    /**
     * Create an instance of {@link AsyncRequestId }
     * 
     */
    public AsyncRequestId createAsyncRequestId() {
        return new AsyncRequestId();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI", name = "requestId")
    public JAXBElement<String> createRequestId(String value) {
        return new JAXBElement<String>(_RequestId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsyncRequestId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI", name = "submitSaleAsyncResultRequest")
    public JAXBElement<AsyncRequestId> createSubmitSaleAsyncResultRequest(AsyncRequestId value) {
        return new JAXBElement<AsyncRequestId>(_SubmitSaleAsyncResultRequest_QNAME, AsyncRequestId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsyncRequestId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI", name = "getCustomerRelationshipsAsyncResultRequest")
    public JAXBElement<AsyncRequestId> createGetCustomerRelationshipsAsyncResultRequest(AsyncRequestId value) {
        return new JAXBElement<AsyncRequestId>(_GetCustomerRelationshipsAsyncResultRequest_QNAME, AsyncRequestId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsyncRequestId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI", name = "createSundryCustomerAsyncResultRequest")
    public JAXBElement<AsyncRequestId> createCreateSundryCustomerAsyncResultRequest(AsyncRequestId value) {
        return new JAXBElement<AsyncRequestId>(_CreateSundryCustomerAsyncResultRequest_QNAME, AsyncRequestId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Error }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI", name = "error")
    public JAXBElement<Error> createError(Error value) {
        return new JAXBElement<Error>(_Error_QNAME, Error.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsyncRequestId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI", name = "asyncRequestId")
    public JAXBElement<AsyncRequestId> createAsyncRequestId(AsyncRequestId value) {
        return new JAXBElement<AsyncRequestId>(_AsyncRequestId_QNAME, AsyncRequestId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsyncRequestId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI", name = "getCustomerDetailAsyncResultRequest")
    public JAXBElement<AsyncRequestId> createGetCustomerDetailAsyncResultRequest(AsyncRequestId value) {
        return new JAXBElement<AsyncRequestId>(_GetCustomerDetailAsyncResultRequest_QNAME, AsyncRequestId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EaiException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI", name = "eaiException")
    public JAXBElement<EaiException> createEaiException(EaiException value) {
        return new JAXBElement<EaiException>(_EaiException_QNAME, EaiException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsyncRequestId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI", name = "getMaterialATPAsyncResultRequest")
    public JAXBElement<AsyncRequestId> createGetMaterialATPAsyncResultRequest(AsyncRequestId value) {
        return new JAXBElement<AsyncRequestId>(_GetMaterialATPAsyncResultRequest_QNAME, AsyncRequestId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsyncRequestId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI", name = "getMaterialDetailAsyncResultRequest")
    public JAXBElement<AsyncRequestId> createGetMaterialDetailAsyncResultRequest(AsyncRequestId value) {
        return new JAXBElement<AsyncRequestId>(_GetMaterialDetailAsyncResultRequest_QNAME, AsyncRequestId.class, null, value);
    }

}
