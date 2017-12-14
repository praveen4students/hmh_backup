package hmh.rs.pojo;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class UpdateCustomerRequest {

	/**
	 * Store ID
	 */
	protected String customerId;
	
	/**
	 * Sold To Address 
	 */
	protected Address soldtoAddress;
	

	public UpdateCustomerRequest() {
		
	}
	
	public UpdateCustomerRequest(String customerId, Address soldToAddress) {
		this.customerId = customerId;
		this.soldtoAddress = soldtoAddress;
	}

	public Address getSoldtoAddress() {
		return soldtoAddress;
	}


	public void setSoldtoAddress(Address soldtoAddress) {
		this.soldtoAddress = soldtoAddress;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	
	
	
	

}
