package hmh.sap.rfc.wrapper;

import hmh.sap.rfc.ZcontprType;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ZcontprType")
public class ZcontprType_Wrapper {

	private ZcontprType instance;
	
	public void setInstance(ZcontprType instance) {
		this.instance = instance;
	}
	
	public ZcontprType_Wrapper() {}
	
	public ZcontprType_Wrapper(ZcontprType instance) {
		this.instance = instance;
	}

	
	//
	//	delegate methods
	//

	public void setContract_Price(BigDecimal contract_Price) {
		instance.setContract_Price(contract_Price);
	}

	public String getMaterial() {
		return instance.getMaterial();
	}

	public void setMaterial(String material) {
		instance.setMaterial(material);
	}

	public BigDecimal getContract_Price() {
		return instance.getContract_Price();
	}

}
