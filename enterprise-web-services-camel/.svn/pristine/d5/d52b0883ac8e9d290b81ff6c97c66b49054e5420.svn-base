package hmh.ws.services;

import java.lang.reflect.Constructor;

import hmh.util.Converter;
import hmh.util.Transaction_Constants;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.hmco.eai.AsyncRequestId;
import com.hmh.util.async.AsyncService;
import com.hmh.util.dao.AsyncMethodException;


public class AsyncResponser<T,E,I> implements Processor {

	private AsyncService asyncService;
	private Class<T> responseClass;
	private Class<E> exceptionClass;
	private Class<I> infoClass;
	
	@Override
	public void process(Exchange exchange) throws Exception {

		//.convertBodyTo(AsyncRequestId.class)
		//.bean(Converter.class, "getRequestId")
		//.bean(asyncService, "getAsyncResponse")
		//.convertBodyTo(SubmitSaleResponse2.class)
		AsyncRequestId asyncRequestId = exchange.getIn().getBody(AsyncRequestId.class);
		String requestId = asyncRequestId.getRequestId();
		try {
			String responseBody = asyncService.getAsyncResponse(requestId);
			T response = Converter.convertTo(responseBody, responseClass);
			exchange.getOut().setBody(response);
		}
		catch(AsyncMethodException ex) {
			if (!ex.isSystemError()) {
				String infoBody = ex.getMessage();
				I info = Converter.convertTo(infoBody, infoClass);
				
				Constructor<E> constructor = exceptionClass.getConstructor(new Class[]{String.class, infoClass});
				E exception = constructor.newInstance(Transaction_Constants.EMPTY, info);
				
	            exchange.getOut().setFault(true);
	            exchange.getOut().setBody(exception);
			}
			else {
	            exchange.getOut().setFault(true);
	            exchange.getOut().setBody(ex.getCause());				
			}
			
		}
		
		
	}

	public AsyncResponser(AsyncService asyncService, Class<T> responseClass, Class<E> exceptionClass, Class<I> infoClass) {
		this.asyncService = asyncService;
		this.responseClass = responseClass;
		this.exceptionClass = exceptionClass;
		this.infoClass = infoClass;
	}
}
