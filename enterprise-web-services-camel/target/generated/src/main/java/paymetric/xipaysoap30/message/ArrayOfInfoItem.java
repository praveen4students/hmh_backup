
package paymetric.xipaysoap30.message;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfInfoItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfInfoItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InfoItem" type="{http://Paymetric/XiPaySoap30/message/}InfoItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInfoItem", propOrder = {
    "infoItem"
})
public class ArrayOfInfoItem {

    @XmlElement(name = "InfoItem", nillable = true)
    protected List<InfoItem> infoItem;

    /**
     * Gets the value of the infoItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infoItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfoItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InfoItem }
     * 
     * 
     */
    public List<InfoItem> getInfoItem() {
        if (infoItem == null) {
            infoItem = new ArrayList<InfoItem>();
        }
        return this.infoItem;
    }

}
