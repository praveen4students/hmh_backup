
package com.hmco.eai.ots.eskertransaction;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.hmco.eai.ots.eskertransaction package. 
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

    private final static QName _FaxURL_QNAME = new QName("http://www.hmco.com/EAI/OTS/EskerTransaction", "faxURL");
    private final static QName _AttnLine_QNAME = new QName("http://www.hmco.com/EAI/OTS/EskerTransaction", "attnLine");
    private final static QName _ResultCode_QNAME = new QName("http://www.hmco.com/EAI/OTS/EskerTransaction", "resultCode");
    private final static QName _SoldToCustomer_QNAME = new QName("http://www.hmco.com/EAI/OTS/EskerTransaction", "soldToCustomer");
    private final static QName _Message_QNAME = new QName("http://www.hmco.com/EAI/OTS/EskerTransaction", "message");
    private final static QName _CpoId_QNAME = new QName("http://www.hmco.com/EAI/OTS/EskerTransaction", "cpoId");
    private final static QName _DataOut2_QNAME = new QName("http://www.hmco.com/EAI/OTS/EskerTransaction", "dataOut2");
    private final static QName _DataOut3_QNAME = new QName("http://www.hmco.com/EAI/OTS/EskerTransaction", "dataOut3");
    private final static QName _DataOut1_QNAME = new QName("http://www.hmco.com/EAI/OTS/EskerTransaction", "dataOut1");
    private final static QName _DataIn3_QNAME = new QName("http://www.hmco.com/EAI/OTS/EskerTransaction", "dataIn3");
    private final static QName _DataIn2_QNAME = new QName("http://www.hmco.com/EAI/OTS/EskerTransaction", "dataIn2");
    private final static QName _DataIn1_QNAME = new QName("http://www.hmco.com/EAI/OTS/EskerTransaction", "dataIn1");
    private final static QName _ShipToCustomer_QNAME = new QName("http://www.hmco.com/EAI/OTS/EskerTransaction", "shipToCustomer");
    private final static QName _PoReceiptTimestamp_QNAME = new QName("http://www.hmco.com/EAI/OTS/EskerTransaction", "poReceiptTimestamp");
    private final static QName _EmailAddress_QNAME = new QName("http://www.hmco.com/EAI/OTS/EskerTransaction", "emailAddress");
    private final static QName _OverrideFlag_QNAME = new QName("http://www.hmco.com/EAI/OTS/EskerTransaction", "overrideFlag");
    private final static QName _CpoSfdcOrderNumber_QNAME = new QName("http://www.hmco.com/EAI/OTS/EskerTransaction", "cpoSfdcOrderNumber");
    private final static QName _CpSfdcOrderNumber_QNAME = new QName("http://www.hmco.com/EAI/OTS/EskerTransaction", "cpSfdcOrderNumber");
    private final static QName _CustomerPO_QNAME = new QName("http://www.hmco.com/EAI/OTS/EskerTransaction", "customerPO");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.hmco.eai.ots.eskertransaction
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EskerTransactionRequest }
     * 
     */
    public EskerTransactionRequest createEskerTransactionRequest() {
        return new EskerTransactionRequest();
    }

    /**
     * Create an instance of {@link EskerTransactionResult }
     * 
     */
    public EskerTransactionResult createEskerTransactionResult() {
        return new EskerTransactionResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/EskerTransaction", name = "faxURL")
    public JAXBElement<String> createFaxURL(String value) {
        return new JAXBElement<String>(_FaxURL_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/EskerTransaction", name = "attnLine")
    public JAXBElement<String> createAttnLine(String value) {
        return new JAXBElement<String>(_AttnLine_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/EskerTransaction", name = "resultCode")
    public JAXBElement<Integer> createResultCode(Integer value) {
        return new JAXBElement<Integer>(_ResultCode_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/EskerTransaction", name = "soldToCustomer")
    public JAXBElement<String> createSoldToCustomer(String value) {
        return new JAXBElement<String>(_SoldToCustomer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/EskerTransaction", name = "message")
    public JAXBElement<String> createMessage(String value) {
        return new JAXBElement<String>(_Message_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/EskerTransaction", name = "cpoId")
    public JAXBElement<String> createCpoId(String value) {
        return new JAXBElement<String>(_CpoId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/EskerTransaction", name = "dataOut2")
    public JAXBElement<String> createDataOut2(String value) {
        return new JAXBElement<String>(_DataOut2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/EskerTransaction", name = "dataOut3")
    public JAXBElement<String> createDataOut3(String value) {
        return new JAXBElement<String>(_DataOut3_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/EskerTransaction", name = "dataOut1")
    public JAXBElement<String> createDataOut1(String value) {
        return new JAXBElement<String>(_DataOut1_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/EskerTransaction", name = "dataIn3")
    public JAXBElement<String> createDataIn3(String value) {
        return new JAXBElement<String>(_DataIn3_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/EskerTransaction", name = "dataIn2")
    public JAXBElement<String> createDataIn2(String value) {
        return new JAXBElement<String>(_DataIn2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/EskerTransaction", name = "dataIn1")
    public JAXBElement<String> createDataIn1(String value) {
        return new JAXBElement<String>(_DataIn1_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/EskerTransaction", name = "shipToCustomer")
    public JAXBElement<String> createShipToCustomer(String value) {
        return new JAXBElement<String>(_ShipToCustomer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/EskerTransaction", name = "poReceiptTimestamp")
    public JAXBElement<XMLGregorianCalendar> createPoReceiptTimestamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PoReceiptTimestamp_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/EskerTransaction", name = "emailAddress")
    public JAXBElement<String> createEmailAddress(String value) {
        return new JAXBElement<String>(_EmailAddress_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/EskerTransaction", name = "overrideFlag")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<String> createOverrideFlag(String value) {
        return new JAXBElement<String>(_OverrideFlag_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/EskerTransaction", name = "cpoSfdcOrderNumber")
    public JAXBElement<String> createCpoSfdcOrderNumber(String value) {
        return new JAXBElement<String>(_CpoSfdcOrderNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/EskerTransaction", name = "cpSfdcOrderNumber")
    public JAXBElement<String> createCpSfdcOrderNumber(String value) {
        return new JAXBElement<String>(_CpSfdcOrderNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/EskerTransaction", name = "customerPO")
    public JAXBElement<String> createCustomerPO(String value) {
        return new JAXBElement<String>(_CustomerPO_QNAME, String.class, null, value);
    }

}
