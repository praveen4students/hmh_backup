
package paymetric.xipaysoap30.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="SoapOpResult" type="{http://Paymetric/XiPaySoap30/message/}IPackets" minOccurs="0"/>
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
    "soapOpResult"
})
@XmlRootElement(name = "SoapOpResponse")
public class SoapOpResponse {

    @XmlElement(name = "SoapOpResult")
    protected IPackets soapOpResult;

    /**
     * Gets the value of the soapOpResult property.
     * 
     * @return
     *     possible object is
     *     {@link IPackets }
     *     
     */
    public IPackets getSoapOpResult() {
        return soapOpResult;
    }

    /**
     * Sets the value of the soapOpResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IPackets }
     *     
     */
    public void setSoapOpResult(IPackets value) {
        this.soapOpResult = value;
    }

}
