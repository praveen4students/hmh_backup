package hmh.rs.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class CustomerResponse {
	
    protected String soldToCustomerId;
    
    protected List<Error> errorList;

	public CustomerResponse() {
		
	}
	
	public CustomerResponse(String soldToCustomerId) {
		this.soldToCustomerId = soldToCustomerId;
	}
	
	public CustomerResponse(String soldToCustomerId, List<Error> errorList) {
		this.soldToCustomerId = soldToCustomerId;
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

	public String getSoldToCustomerId() {
		return soldToCustomerId;
	}

	public void setSoldToCustomerId(String soldToCustomerId) {
		this.soldToCustomerId = soldToCustomerId;
	}
	

}
