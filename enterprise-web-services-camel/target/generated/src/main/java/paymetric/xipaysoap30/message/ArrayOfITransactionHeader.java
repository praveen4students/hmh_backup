
package paymetric.xipaysoap30.message;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfITransactionHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfITransactionHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ITransactionHeader" type="{http://Paymetric/XiPaySoap30/message/}ITransactionHeader" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfITransactionHeader", propOrder = {
    "iTransactionHeader"
})
public class ArrayOfITransactionHeader {

    @XmlElement(name = "ITransactionHeader", nillable = true)
    protected List<ITransactionHeader> iTransactionHeader;

    /**
     * Gets the value of the iTransactionHeader property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iTransactionHeader property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getITransactionHeader().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ITransactionHeader }
     * 
     * 
     */
    public List<ITransactionHeader> getITransactionHeader() {
        if (iTransactionHeader == null) {
            iTransactionHeader = new ArrayList<ITransactionHeader>();
        }
        return this.iTransactionHeader;
    }

}
