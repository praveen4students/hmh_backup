
package paymetric.xipaysoap30.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="pPacketsIn" type="{http://Paymetric/XiPaySoap30/message/}IPackets" minOccurs="0"/>
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
    "pPacketsIn"
})
@XmlRootElement(name = "SoapOp")
public class SoapOp {

    protected IPackets pPacketsIn;

    /**
     * Gets the value of the pPacketsIn property.
     * 
     * @return
     *     possible object is
     *     {@link IPackets }
     *     
     */
    public IPackets getPPacketsIn() {
        return pPacketsIn;
    }

    /**
     * Sets the value of the pPacketsIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link IPackets }
     *     
     */
    public void setPPacketsIn(IPackets value) {
        this.pPacketsIn = value;
    }

}
