package hmh.rs.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class OrderSimulateRequest {

	protected String soldToCustomerId;

	protected String shipToCustomerId;
	
	protected String billToCustomerId;
	
	protected String payerCustomerId;
	
	protected Address shipToAddress;
	
	protected Address billToAddress;
	
	protected Address soldToAddress;
	
	protected Address payerAddress;
	
	protected String entryDivision;
	
	protected String shipmentMethod;
	
	protected String poNumber;
	
	protected String transactionType;
	
	protected String orderSource;
	
	protected String couponCode;
	
	protected String overrideShipping;
	
	protected List<SaleLineItem> saleLineItemList;
	
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

	public String getBillToCustomerId() {
		return billToCustomerId;
	}

	public void setBillToCustomerId(String billToCustomerId) {
		this.billToCustomerId = billToCustomerId;
	}

	public String getPayerCustomerId() {
		return payerCustomerId;
	}

	public void setPayerCustomerId(String payerCustomerId) {
		this.payerCustomerId = payerCustomerId;
	}

	

	public String getEntryDivision() {
		return entryDivision;
	}

	public void setEntryDivision(String entryDivision) {
		this.entryDivision = entryDivision;
	}

	public String getShipmentMethod() {
		return shipmentMethod;
	}

	public void setShipmentMethod(String shipmentMethod) {
		this.shipmentMethod = shipmentMethod;
	}

	public String getPoNumber() {
		return poNumber;
	}

	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getOrderSource() {
		return orderSource;
	}

	public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public String getOverrideShipping() {
		return overrideShipping;
	}

	public void setOverrideShipping(String overrideShipping) {
		this.overrideShipping = overrideShipping;
	}

	public Address getShipToAddress() {
		return shipToAddress;
	}

	public void setShipToAddress(Address shipToAddress) {
		this.shipToAddress = shipToAddress;
	}

	public Address getBillToAddress() {
		return billToAddress;
	}

	public void setBillToAddress(Address billToAddress) {
		this.billToAddress = billToAddress;
	}

	public Address getSoldToAddress() {
		return soldToAddress;
	}

	public void setSoldToAddress(Address soldToAddress) {
		this.soldToAddress = soldToAddress;
	}

	public Address getPayerAddress() {
		return payerAddress;
	}

	public void setPayerAddress(Address payerAddress) {
		this.payerAddress = payerAddress;
	}

	public List<SaleLineItem> getSaleLineItemList() {
		if(saleLineItemList == null) {
			saleLineItemList = new ArrayList<SaleLineItem>(0);
		}
		return saleLineItemList;
	}

	public void setSaleLineItemList(List<SaleLineItem> saleLineItemList) {
		this.saleLineItemList = saleLineItemList;
	}
	
}

