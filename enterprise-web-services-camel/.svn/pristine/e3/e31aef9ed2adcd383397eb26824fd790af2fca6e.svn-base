package hmh.util;

import javax.xml.bind.ValidationEvent;
import javax.xml.bind.helpers.DefaultValidationEventHandler;

import org.apache.log4j.Logger;

public class MaterialSchemaValidator extends DefaultValidationEventHandler {

	private static final Logger logger = Logger
	.getLogger(MaterialSchemaValidator.class);
	
	@Override
    public boolean handleEvent(ValidationEvent event) {
		logger.info("Error Message ::: " + event.getMessage());
		
		if (event.getMessage().equalsIgnoreCase("cvc-complex-type.2.4.d: Invalid content was found starting with element 'mat:customerID'. No child element is expected at this point.")) {
			throw new RuntimeException("Only one customerId should be mentioned in the input");
		} else {
			return super.handleEvent(event);
		}
    }

}
