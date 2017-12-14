
package com.hmco.eai.ots.material.getatp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.hmco.eai.EaiException;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.hmco.eai.ots.material.getatp package. 
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

    private final static QName _DISTCHNL_QNAME = new QName("http://www.hmco.com/EAI/OTS/Material/GetATP", "DIST_CHNL");
    private final static QName _REGION_QNAME = new QName("http://www.hmco.com/EAI/OTS/Material/GetATP", "REGION");
    private final static QName _CUSTID_QNAME = new QName("http://www.hmco.com/EAI/OTS/Material/GetATP", "CUST_ID");
    private final static QName _DIVISION_QNAME = new QName("http://www.hmco.com/EAI/OTS/Material/GetATP", "DIVISION");
    private final static QName _ORDERTYPE_QNAME = new QName("http://www.hmco.com/EAI/OTS/Material/GetATP", "ORDER_TYPE");
    private final static QName _GetMaterialATPAsyncRequest_QNAME = new QName("http://www.hmco.com/EAI/OTS/Material/GetATP", "getMaterialATPAsyncRequest");
    private final static QName _MATNR_QNAME = new QName("http://www.hmco.com/EAI/OTS/Material/GetATP", "MATNR");
    private final static QName _ATPEXCEPTION_QNAME = new QName("http://www.hmco.com/EAI/OTS/Material/GetATP", "ATP_EXCEPTION");
    private final static QName _FLEX3_QNAME = new QName("http://www.hmco.com/EAI/OTS/Material/GetATP", "FLEX3");
    private final static QName _FLEX1_QNAME = new QName("http://www.hmco.com/EAI/OTS/Material/GetATP", "FLEX1");
    private final static QName _FLEX2_QNAME = new QName("http://www.hmco.com/EAI/OTS/Material/GetATP", "FLEX2");
    private final static QName _COUNTRY_QNAME = new QName("http://www.hmco.com/EAI/OTS/Material/GetATP", "COUNTRY");
    private final static QName _MDR_QNAME = new QName("http://www.hmco.com/EAI/OTS/Material/GetATP", "MDR");
    private final static QName _ITEMTYPE_QNAME = new QName("http://www.hmco.com/EAI/OTS/Material/GetATP", "ITEM_TYPE");
    private final static QName _GetMaterialATPRequest_QNAME = new QName("http://www.hmco.com/EAI/OTS/Material/GetATP", "getMaterialATPRequest");
    private final static QName _SUCCESS_QNAME = new QName("http://www.hmco.com/EAI/OTS/Material/GetATP", "SUCCESS");
    private final static QName _SALESORG_QNAME = new QName("http://www.hmco.com/EAI/OTS/Material/GetATP", "SALES_ORG");
    private final static QName _QUANTITY_QNAME = new QName("http://www.hmco.com/EAI/OTS/Material/GetATP", "QUANTITY");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.hmco.eai.ots.material.getatp
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GETATPRESPONSE }
     * 
     */
    public GETATPRESPONSE createGETATPRESPONSE() {
        return new GETATPRESPONSE();
    }

    /**
     * Create an instance of {@link ATPMATERIALLIST }
     * 
     */
    public ATPMATERIALLIST createATPMATERIALLIST() {
        return new ATPMATERIALLIST();
    }

    /**
     * Create an instance of {@link GETATPREQUEST }
     * 
     */
    public GETATPREQUEST createGETATPREQUEST() {
        return new GETATPREQUEST();
    }

    /**
     * Create an instance of {@link ATPDETAILLIST }
     * 
     */
    public ATPDETAILLIST createATPDETAILLIST() {
        return new ATPDETAILLIST();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Material/GetATP", name = "DIST_CHNL")
    public JAXBElement<String> createDISTCHNL(String value) {
        return new JAXBElement<String>(_DISTCHNL_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Material/GetATP", name = "REGION")
    public JAXBElement<String> createREGION(String value) {
        return new JAXBElement<String>(_REGION_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Material/GetATP", name = "CUST_ID")
    public JAXBElement<String> createCUSTID(String value) {
        return new JAXBElement<String>(_CUSTID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Material/GetATP", name = "DIVISION")
    public JAXBElement<String> createDIVISION(String value) {
        return new JAXBElement<String>(_DIVISION_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Material/GetATP", name = "ORDER_TYPE")
    public JAXBElement<String> createORDERTYPE(String value) {
        return new JAXBElement<String>(_ORDERTYPE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GETATPREQUEST }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Material/GetATP", name = "getMaterialATPAsyncRequest")
    public JAXBElement<GETATPREQUEST> createGetMaterialATPAsyncRequest(GETATPREQUEST value) {
        return new JAXBElement<GETATPREQUEST>(_GetMaterialATPAsyncRequest_QNAME, GETATPREQUEST.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Material/GetATP", name = "MATNR")
    public JAXBElement<String> createMATNR(String value) {
        return new JAXBElement<String>(_MATNR_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EaiException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Material/GetATP", name = "ATP_EXCEPTION")
    public JAXBElement<EaiException> createATPEXCEPTION(EaiException value) {
        return new JAXBElement<EaiException>(_ATPEXCEPTION_QNAME, EaiException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Material/GetATP", name = "FLEX3")
    public JAXBElement<String> createFLEX3(String value) {
        return new JAXBElement<String>(_FLEX3_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Material/GetATP", name = "FLEX1")
    public JAXBElement<String> createFLEX1(String value) {
        return new JAXBElement<String>(_FLEX1_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Material/GetATP", name = "FLEX2")
    public JAXBElement<String> createFLEX2(String value) {
        return new JAXBElement<String>(_FLEX2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Material/GetATP", name = "COUNTRY")
    public JAXBElement<String> createCOUNTRY(String value) {
        return new JAXBElement<String>(_COUNTRY_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Material/GetATP", name = "MDR")
    public JAXBElement<String> createMDR(String value) {
        return new JAXBElement<String>(_MDR_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Material/GetATP", name = "ITEM_TYPE")
    public JAXBElement<String> createITEMTYPE(String value) {
        return new JAXBElement<String>(_ITEMTYPE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GETATPREQUEST }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Material/GetATP", name = "getMaterialATPRequest")
    public JAXBElement<GETATPREQUEST> createGetMaterialATPRequest(GETATPREQUEST value) {
        return new JAXBElement<GETATPREQUEST>(_GetMaterialATPRequest_QNAME, GETATPREQUEST.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Material/GetATP", name = "SUCCESS")
    public JAXBElement<String> createSUCCESS(String value) {
        return new JAXBElement<String>(_SUCCESS_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Material/GetATP", name = "SALES_ORG")
    public JAXBElement<String> createSALESORG(String value) {
        return new JAXBElement<String>(_SALESORG_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Material/GetATP", name = "QUANTITY")
    public JAXBElement<String> createQUANTITY(String value) {
        return new JAXBElement<String>(_QUANTITY_QNAME, String.class, null, value);
    }

}
