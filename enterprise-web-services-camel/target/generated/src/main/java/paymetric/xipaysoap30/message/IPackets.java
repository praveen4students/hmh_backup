
package paymetric.xipaysoap30.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IPackets complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IPackets">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="xipayvbresult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="packets" type="{http://Paymetric/XiPaySoap30/message/}ArrayOfITransactionHeader" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPackets", propOrder = {
    "count",
    "xipayvbresult",
    "packets"
})
public class IPackets {

    protected int count;
    protected boolean xipayvbresult;
    protected ArrayOfITransactionHeader packets;

    /**
     * Gets the value of the count property.
     * 
     */
    public int getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     */
    public void setCount(int value) {
        this.count = value;
    }

    /**
     * Gets the value of the xipayvbresult property.
     * 
     */
    public boolean isXipayvbresult() {
        return xipayvbresult;
    }

    /**
     * Sets the value of the xipayvbresult property.
     * 
     */
    public void setXipayvbresult(boolean value) {
        this.xipayvbresult = value;
    }

    /**
     * Gets the value of the packets property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfITransactionHeader }
     *     
     */
    public ArrayOfITransactionHeader getPackets() {
        return packets;
    }

    /**
     * Sets the value of the packets property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfITransactionHeader }
     *     
     */
    public void setPackets(ArrayOfITransactionHeader value) {
        this.packets = value;
    }

}
