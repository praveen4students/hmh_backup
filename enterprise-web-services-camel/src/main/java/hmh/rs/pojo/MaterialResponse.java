package hmh.rs.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class MaterialResponse {
	
    protected List<Error> errorList;

	private List<Material> materialList;

	public MaterialResponse() {
		
	}
	
	public MaterialResponse(List<Material> materialList) {
		this.materialList = materialList;
	}
	
	public MaterialResponse(List<Material> materialList, List<Error> errorList) {
		this.materialList = materialList;
		this.errorList = errorList;
	}
	
	
    @XmlElement(name = "error")
    public List<Error> getErrorList() {
        if (errorList == null) {
            errorList = new ArrayList<Error>();
        }
        return this.errorList;
    }
    
    public void setErrorList(List<Error> errList) {
    	errorList = errList;
    }

    
	@XmlElement(name = "material")
	public List<Material> getMaterialList() {
		if (materialList == null) {
			materialList = new ArrayList<Material>();
		}		
		return materialList;
	}
	
	public void setMaterialList(List<Material> materialList) {
		this.materialList = materialList;
	}
	

}
