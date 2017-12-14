package hmh.rs.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class InventoryItemResponse {
	/**
	 * Exception
	 */	
	protected EaiException eaiException;

	/**
	 * List of InventoryItem
	 */	
	protected List<Material> inventoryItemList;
	
	public List<Material> getInventoryItemList() {
		if (inventoryItemList == null) {
			inventoryItemList = new ArrayList<Material>();
		}		
		return inventoryItemList;
	}
	public void setInventoryItemList(List<Material> inventoryItemList) {
		this.inventoryItemList = inventoryItemList;
	}
	
	public EaiException getEaiException() {
		return eaiException;
	}
	public void setEaiException(EaiException eaiException) {
		this.eaiException = eaiException;
	}
	

}
