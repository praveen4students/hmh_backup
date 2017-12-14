
package paymetric.xipaysoap30.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BlobItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BlobItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BlobXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BlobItem", propOrder = {
    "blobXML"
})
public class BlobItem {

    @XmlElement(name = "BlobXML")
    protected String blobXML;

    /**
     * Gets the value of the blobXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlobXML() {
        return blobXML;
    }

    /**
     * Sets the value of the blobXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlobXML(String value) {
        this.blobXML = value;
    }

}
