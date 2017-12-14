
package com.hmco.eai.ots.packinglist;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.hmco.eai.ots.packinglist package. 
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

    private final static QName _CustomerRecipientEMail_QNAME = new QName("http://www.hmco.com/EAI/OTS/PackingList", "Customer_Recipient_E-mail");
    private final static QName _Response_QNAME = new QName("http://www.hmco.com/EAI/OTS/PackingList", "Response");
    private final static QName _CustomerCCEMail_QNAME = new QName("http://www.hmco.com/EAI/OTS/PackingList", "Customer_CC_E-mail");
    private final static QName _DeliveryNumber_QNAME = new QName("http://www.hmco.com/EAI/OTS/PackingList", "Delivery_Number");
    private final static QName _SubjectLine_QNAME = new QName("http://www.hmco.com/EAI/OTS/PackingList", "Subject_Line");
    private final static QName _HMHFromEMail_QNAME = new QName("http://www.hmco.com/EAI/OTS/PackingList", "HMH_From_E-mail");
    private final static QName _Plant_QNAME = new QName("http://www.hmco.com/EAI/OTS/PackingList", "Plant");
    private final static QName _Notes_QNAME = new QName("http://www.hmco.com/EAI/OTS/PackingList", "Notes");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.hmco.eai.ots.packinglist
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PackingListRequest }
     * 
     */
    public PackingListRequest createPackingListRequest() {
        return new PackingListRequest();
    }

    /**
     * Create an instance of {@link PackingListResponse }
     * 
     */
    public PackingListResponse createPackingListResponse() {
        return new PackingListResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/PackingList", name = "Customer_Recipient_E-mail")
    public JAXBElement<String> createCustomerRecipientEMail(String value) {
        return new JAXBElement<String>(_CustomerRecipientEMail_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/PackingList", name = "Response")
    public JAXBElement<String> createResponse(String value) {
        return new JAXBElement<String>(_Response_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/PackingList", name = "Customer_CC_E-mail")
    public JAXBElement<String> createCustomerCCEMail(String value) {
        return new JAXBElement<String>(_CustomerCCEMail_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/PackingList", name = "Delivery_Number")
    public JAXBElement<String> createDeliveryNumber(String value) {
        return new JAXBElement<String>(_DeliveryNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/PackingList", name = "Subject_Line")
    public JAXBElement<String> createSubjectLine(String value) {
        return new JAXBElement<String>(_SubjectLine_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/PackingList", name = "HMH_From_E-mail")
    public JAXBElement<String> createHMHFromEMail(String value) {
        return new JAXBElement<String>(_HMHFromEMail_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/PackingList", name = "Plant")
    public JAXBElement<String> createPlant(String value) {
        return new JAXBElement<String>(_Plant_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/PackingList", name = "Notes")
    public JAXBElement<String> createNotes(String value) {
        return new JAXBElement<String>(_Notes_QNAME, String.class, null, value);
    }

}
