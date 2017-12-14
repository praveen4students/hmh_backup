package hmh.rs.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class MateriaPriceRequest {
	
	/**
	 * Sold To Customer ID
	 */
	protected String soldToCustomerId;
	
	/**
	 * Ship To Customer ID
	 */
	protected String shipToCustomerId;
	
	/**
	 * Selling Division 
	 */
	protected String sellingDivision;
	
	/**
	 * Ship To State
	 */
	protected String shipToState;
	
	/**
	 * Ship To Country
	 */
	protected String shipToCountry;
	
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

	public String getSoldToCustomerId() {
		return soldToCustomerId;
	}

	public void setSoldToCustomerId(String soldToCustomerId) {
		this.soldToCustomerId = soldToCustomerId;
	}

	public String getShipToCustomerId() {
		return shipToCustomerId;
	}

	public void setShipToCustomerId(String shipToCustomerId) {
		this.shipToCustomerId = shipToCustomerId;
	}

	public String getSellingDivision() {
		return sellingDivision;
	}

	public void setSellingDivision(String sellingDivision) {
		this.sellingDivision = sellingDivision;
	}

	public String getShipToState() {
		return shipToState;
	}

	public void setShipToState(String shipToState) {
		this.shipToState = shipToState;
	}

	public String getShipToCountry() {
		return shipToCountry;
	}

	public void setShipToCountry(String shipToCountry) {
		this.shipToCountry = shipToCountry;
	}
	
}
