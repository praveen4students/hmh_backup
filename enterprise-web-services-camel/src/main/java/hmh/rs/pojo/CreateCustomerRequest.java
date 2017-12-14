package hmh.rs.pojo;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class CreateCustomerRequest {

	/**
	 * Store ID
	 */
	protected String storeId;
	
	/**
	 * WebUser ID
	 */
	protected String webUserId;
	
	/**
	 * Sold To Address 
	 */
	protected Address soldtoAddress;
	

	public CreateCustomerRequest() {
		
	}
	
	public CreateCustomerRequest(String storeId, String webUserId, Address soldToAddress) {
		this.storeId = storeId;
		this.webUserId = webUserId;
		this.soldtoAddress = soldToAddress;
	}


	public String getStoreId() {
		return storeId;
	}


	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}


	public String getWebUserId() {
		return webUserId;
	}


	public void setWebUserId(String webUserId) {
		this.webUserId = webUserId;
	}


	public Address getSoldtoAddress() {
		return soldtoAddress;
	}
	
	public void setSoldtoAddress(Address soldtoAddress) {
		this.soldtoAddress = soldtoAddress;
	}
	
	
	
	
}


