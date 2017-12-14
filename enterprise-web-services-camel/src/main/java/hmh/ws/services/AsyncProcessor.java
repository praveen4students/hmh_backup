package hmh.ws.services;

import hmh.util.EnterpriseConstants;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.support.SynchronizationAdapter;
import org.apache.camel.spi.Synchronization;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.hmco.eai.AsyncRequestId;
import com.hmco.eai.tibco.enterprisewebservices.EaiException;
import com.hmh.util.async.AsyncService;
import com.hmh.util.dao.AsyncMethodException;

class AsyncProcessor implements Processor {
	
	public final static String ASYNC_CALL_ID = "AsyncCallId";
	private final transient Logger log = LoggerFactory.getLogger(getClass());
	
	private String endpoint;
	private AsyncService asyncService;
	private String callId;
	//private String requestBody;
	
	final Synchronization callback = new SynchronizationAdapter() {
		@Override
		public void onComplete(Exchange exchange) {
			//String callId = exchange.getIn().getHeader(ASYNC_CALL_ID, String.class);
			String requestBody = exchange.getIn().getBody(String.class);			
			String responseBody = exchange.getOut().getBody(String.class);
			log.debug("async call complete. id = " + (String) exchange.getProperty("RQSTID"));
			asyncService.saveAsyncResponse((String) exchange.getProperty("RQSTID"), requestBody, responseBody);
		}
		@Override
		public void onFailure(Exchange exchange) {
			//String callId = exchange.getIn().getHeader(ASYNC_CALL_ID, String.class);
			String requestBody = exchange.getIn().getBody(String.class);			
			//String errResponseBody = exchange.getOut().getBody(String.class);
			Exception ex = exchange.getException();
			String errResponseBody = null;

			JAXBContext jaxbContext;
			try {
		        Method m = ex.getClass().getMethod("getFaultInfo");
		        Object faultInfo = m.invoke(ex);
				
				jaxbContext = JAXBContext.newInstance(faultInfo.getClass());
				Marshaller marshaller = jaxbContext.createMarshaller();
				//marshaller.setProperty("jaxb.formatted.output", Boolean.TRUE);
				StringWriter writer = new StringWriter();
				marshaller.marshal(faultInfo, writer);
				writer.flush();
				errResponseBody = writer.getBuffer().toString();
			} catch (JAXBException e) {
				e.printStackTrace(System.err);
			} catch (SecurityException e) {
				e.printStackTrace(System.err);
			} catch (NoSuchMethodException e) {
				e.printStackTrace(System.err);
			} catch (IllegalArgumentException e) {
				e.printStackTrace(System.err);
			} catch (IllegalAccessException e) {
				e.printStackTrace(System.err);
			} catch (InvocationTargetException e) {
				e.printStackTrace(System.err);
			}
			
			
			log.debug("async call fail. id = " + (String) exchange.getProperty("RQSTID"));
			asyncService.saveAsyncError((String) exchange.getProperty("RQSTID"), requestBody, errResponseBody);
		}
	};
	
	public AsyncProcessor(String endpoint, AsyncService asyncService) {
		this.endpoint = endpoint;
		this.asyncService = asyncService;
	}
	
	public void process(Exchange exchange) throws Exception {

		try {
			callId = asyncService.makeNewAsyncCallId();

			//
			// use callback exchanger to get source request
			//
	/*		
			MessageContentsList contentsList = (MessageContentsList)exchange.getIn().getBody();
			Object inBody = contentsList.get(0);
			String className = inBody.getClass().getPackage().getName();		
			JAXBContext jaxb = JAXBContext.newInstance(className);
			Marshaller m = jaxb.createMarshaller();
			//m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
			StringWriter sw = new StringWriter();
			m.marshal(inBody, sw);
			sw.flush();
			requestBody = sw.toString();
	*/
			
			log.debug("async call begin. id = " + callId + ", endpoint = " + endpoint);
			
			ProducerTemplate template = exchange.getContext().createProducerTemplate();					
			Exchange newEx = exchange.copy();
			newEx.setProperty("RQSTID", callId);
			template.asyncCallback(endpoint, newEx, this.callback);
			
			// return
			AsyncRequestId id = new AsyncRequestId();
			id.setRequestId(callId);
			exchange.getOut().setBody(id);
		}
		catch(AsyncMethodException ex) {
			//if (ex.isSystemError()) {

			//String infoBody = ex.getMessage();
			//I info = Converter.convertTo(infoBody, infoClass);
			
			//Constructor<E> constructor = exceptionClass.getConstructor(new Class[]{String.class, infoClass});
			//E exception = constructor.newInstance(Transaction_Constants.EMPTY, info);

			//
			// cannot get callId from db. raise exception
			com.hmco.eai.Error err = new com.hmco.eai.Error();
			err.setErrorCategory(EnterpriseConstants.ERROR_CATEGORY_SYSTEM);
			err.setErrorMessage(ex.getMessage());
			com.hmco.eai.ErrorList errList = new com.hmco.eai.ErrorList();
			errList.getError().add(err);
			com.hmco.eai.EaiException eaiEx = new com.hmco.eai.EaiException();
			eaiEx.setErrorList(errList);
			
			EaiException exception = new EaiException("", eaiEx);
			
            exchange.getOut().setFault(true);
            exchange.getOut().setBody(exception);

            //} else {
	        //    exchange.getOut().setFault(true);
	        //    exchange.getOut().setBody(ex.getCause());				
			//}			
		}
	}
		
}

