package hmh.sap.rfc.wrapper;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ZrestrictionTypeList")
public class ZrestrictionTypeList_Wrapper {
    private ZrestrictionType_Wrapper[] value;
    
    public ZrestrictionTypeList_Wrapper() {}
    public ZrestrictionTypeList_Wrapper(ZrestrictionType_Wrapper[] value) {
    	this.value = value;
    }
    
	public ZrestrictionType_Wrapper[] getValue() {
		return value;
	}
	public void setValue(ZrestrictionType_Wrapper[] value) {
		this.value = value;
	}

    
}
