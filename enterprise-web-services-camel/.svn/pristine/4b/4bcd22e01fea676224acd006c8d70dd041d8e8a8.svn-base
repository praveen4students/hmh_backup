package hmh.rs.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class OrderSubmitResponse {
	
    protected String orderNumber;
    
    protected List<Error> errorList;

	public OrderSubmitResponse() {
		
	}
	
	public OrderSubmitResponse(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	
	public OrderSubmitResponse(String orderNumber, List<Error> errorList) {
		this.orderNumber = orderNumber;
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

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	
	

}
