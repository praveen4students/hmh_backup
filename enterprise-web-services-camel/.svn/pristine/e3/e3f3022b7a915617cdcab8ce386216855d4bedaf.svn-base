package hmh.rs.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class OrderSimulateResponse {
	
    protected List<Error> errorList;

	protected BigDecimal taxAmount;
	
	protected BigDecimal shippingAmount;
	
	protected List<SaleLineItem> saleLineItemList;

	public OrderSimulateResponse() {
		
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

	public BigDecimal getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(BigDecimal taxAmount) {
		this.taxAmount = taxAmount;
	}

	public BigDecimal getShippingAmount() {
		return shippingAmount;
	}

	public void setShippingAmount(BigDecimal shippingAmount) {
		this.shippingAmount = shippingAmount;
	}

	public List<SaleLineItem> getSaleLineItemList() {
		if (saleLineItemList == null) {
			saleLineItemList = new ArrayList<SaleLineItem>();
		}
		return this.saleLineItemList;
	}

	public void setSaleLineItemList(List<SaleLineItem> saleLineItemList) {
		this.saleLineItemList = saleLineItemList;
	}

}
