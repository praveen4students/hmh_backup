
package com.hmco.eai.ots.material;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.hmco.eai.EaiException;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.hmco.eai.ots.material package. 
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

    private final static QName _GetMaterialDetailAsyncRequest_QNAME = new QName("http://www.hmco.com/EAI/OTS/Material", "getMaterialDetailAsyncRequest");
    private final static QName _GetMaterialDetailRequest_QNAME = new QName("http://www.hmco.com/EAI/OTS/Material", "getMaterialDetailRequest");
    private final static QName _MaterialException_QNAME = new QName("http://www.hmco.com/EAI/OTS/Material", "materialException");
    private final static QName _MaterialSubstitution_QNAME = new QName("http://www.hmco.com/EAI/OTS/Material", "materialSubstitution");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.hmco.eai.ots.material
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MaterialDetail }
     * 
     */
    public MaterialDetail createMaterialDetail() {
        return new MaterialDetail();
    }

    /**
     * Create an instance of {@link Component }
     * 
     */
    public Component createComponent() {
        return new Component();
    }

    /**
     * Create an instance of {@link MaterialSubstitutionList }
     * 
     */
    public MaterialSubstitutionList createMaterialSubstitutionList() {
        return new MaterialSubstitutionList();
    }

    /**
     * Create an instance of {@link MaterialKeyList }
     * 
     */
    public MaterialKeyList createMaterialKeyList() {
        return new MaterialKeyList();
    }

    /**
     * Create an instance of {@link GetMaterialDetailRequest }
     * 
     */
    public GetMaterialDetailRequest createGetMaterialDetailRequest() {
        return new GetMaterialDetailRequest();
    }

    /**
     * Create an instance of {@link Substitution }
     * 
     */
    public Substitution createSubstitution() {
        return new Substitution();
    }

    /**
     * Create an instance of {@link SubscriptionTerm }
     * 
     */
    public SubscriptionTerm createSubscriptionTerm() {
        return new SubscriptionTerm();
    }

    /**
     * Create an instance of {@link SubstitutionValue }
     * 
     */
    public SubstitutionValue createSubstitutionValue() {
        return new SubstitutionValue();
    }

    /**
     * Create an instance of {@link Substitution.Key }
     * 
     */
    public Substitution.Key createSubstitutionKey() {
        return new Substitution.Key();
    }

    /**
     * Create an instance of {@link MaterialDetailList }
     * 
     */
    public MaterialDetailList createMaterialDetailList() {
        return new MaterialDetailList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMaterialDetailRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Material", name = "getMaterialDetailAsyncRequest")
    public JAXBElement<GetMaterialDetailRequest> createGetMaterialDetailAsyncRequest(GetMaterialDetailRequest value) {
        return new JAXBElement<GetMaterialDetailRequest>(_GetMaterialDetailAsyncRequest_QNAME, GetMaterialDetailRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMaterialDetailRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Material", name = "getMaterialDetailRequest")
    public JAXBElement<GetMaterialDetailRequest> createGetMaterialDetailRequest(GetMaterialDetailRequest value) {
        return new JAXBElement<GetMaterialDetailRequest>(_GetMaterialDetailRequest_QNAME, GetMaterialDetailRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EaiException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Material", name = "materialException")
    public JAXBElement<EaiException> createMaterialException(EaiException value) {
        return new JAXBElement<EaiException>(_MaterialException_QNAME, EaiException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Substitution }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Material", name = "materialSubstitution")
    public JAXBElement<Substitution> createMaterialSubstitution(Substitution value) {
        return new JAXBElement<Substitution>(_MaterialSubstitution_QNAME, Substitution.class, null, value);
    }

}
