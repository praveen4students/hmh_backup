
package hmh.rs.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class EaiException {

    //protected ErrorList errorList;
	/**
	 * List of Error
	 */	
    protected List<Error> errorList;

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

/*    
    public ErrorList getErrorList() {
        return errorList;
    }

   
    public void setErrorList(ErrorList value) {
        this.errorList = value;
    }
*/
}
