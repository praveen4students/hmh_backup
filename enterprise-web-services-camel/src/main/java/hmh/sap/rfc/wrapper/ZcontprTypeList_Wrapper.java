package hmh.sap.rfc.wrapper;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ZcompTypeList")

public class ZcontprTypeList_Wrapper {
    private ZcontprType_Wrapper[] value;
    
    public ZcontprTypeList_Wrapper() {}
    public ZcontprTypeList_Wrapper(ZcontprType_Wrapper[] value) {
    	this.value = value;
    }
    
	public ZcontprType_Wrapper[] getValue() {
		return value;
	}
	public void setValue(ZcontprType_Wrapper[] value) {
		this.value = value;
	}

    
}
