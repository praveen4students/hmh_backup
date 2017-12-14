package hmh.rs.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class MaterialRequest {

	private List<Material> materialList;

	public MaterialRequest() {
		
	}
	
	public MaterialRequest(List<Material> materialList) {
		this.materialList = materialList;
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
