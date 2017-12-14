package hmh.util;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.apache.log4j.Logger;

import com.hmco.eai.AsyncRequestId;

public final class Converter {

	private static final Logger logger = Logger.getLogger(Converter.class);

	public static String convertBodyToString(Object body) {
		try {
			//String className = body.getClass().getName();
			String className = body.getClass().getPackage().getName();
			JAXBContext jaxb = JAXBContext.newInstance(className);
			Marshaller m = jaxb.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
			StringWriter sw = new StringWriter();
			m.marshal(body, sw);
			sw.flush();
			return sw.toString();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace(System.err);
			logger.error(e);
			return "";
		}
	}

	public static <T> T convertTo(String body, Class<T> type) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(type);
			Unmarshaller um = jaxbContext.createUnmarshaller();
			StringReader reader = new StringReader(body);
			@SuppressWarnings("unchecked")
			T t  = (T) um.unmarshal(reader);
			return t;
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace(System.err);
			logger.error(e);
			return null;
		}

	}
	
	public static String getRequestId(AsyncRequestId asyncRequestId) {
		return asyncRequestId.getRequestId();
	}
	
	
}
