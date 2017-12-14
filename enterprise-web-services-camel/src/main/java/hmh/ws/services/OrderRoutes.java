/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package hmh.ws.services;

import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import hmh.util.Converter;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import org.apache.cxf.message.MessageContentsList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hmco.eai.AsyncRequestId;
import com.hmco.eai.ots.eskertransaction.EskerTransactionRequest;
import com.hmco.eai.ots.order.FindBasisOrderRequest;
import com.hmco.eai.ots.order.FindUnsubmittedOrdersRequest;
import com.hmco.eai.ots.order.SubmitOrderRequest;
import com.hmco.eai.ots.order.SubmitSaleRequest;
import com.hmco.eai.ots.order.SubmitSaleRequest2;
import com.hmco.eai.ots.order.SubmitSaleResponse2;
import com.hmco.eai.ots.order.SubmitSampleRequest;
import com.hmco.eai.tibco.enterprisewebservices.OrderException;
import com.hmh.util.async.AsyncService;
import com.hmh.util.dao.AsyncMethodException;

/**
 * Our routes that we can build using Camel DSL as we extend the RouteBuilder
 * class.
 * <p/>
 * In the configure method we have all kind of DSL methods we use for expressing
 * our routes.
 */
public class OrderRoutes extends RouteBuilder {

	protected final transient Logger log = LoggerFactory.getLogger(getClass());

	/*private static final String REST_ENDPOINT_URI = "cxfrs://http://0.0.0.0:7110/rest/customer"
			+ "?resourceClasses=hmh.ws.services.CustomerImpl";*/

	private AsyncService asyncService;
	
	public void setAsyncService(AsyncService asyncService) {
		this.asyncService = asyncService;
	}


	public void configure() throws Exception {
		// webservice response for OK
		// OutputReportIncident ok = new OutputReportIncident();
		// ok.setCode("OK");
		// OutputReportIncident accepted = new OutputReportIncident();
		// accepted.setCode("Accepted");

        // Here we just pass the exception back , don't need to use errorHandler
        //errorHandler(noErrorHandler());
		/*
        onException(OrderException.class) //.maximumRedeliveries(0) //.handled(true)
        	.process(new Processor() {
	            public void process(Exchange exchange) throws Exception {
	                SoapFault fault = exchange.getProperty(Exchange.EXCEPTION_CAUGHT, SoapFault.class);
	                //Throwable cause = exchange.getProperty(Exchange.EXCEPTION_CAUGHT, Throwable.class);
	                Exception cause = exchange.getProperty(Exchange.EXCEPTION_CAUGHT, Exception.class);
	                //exchange.getOut().setFault(true);
	                //exchange.getOut().setBody(cause);
	                //exchange.getFault().setBody(fault);
	            }
        	})
        	.end();
		*/

		//
		// main route
		//
/*		
		onException(AsyncMethodException.class).handled(true).log("Exception Caught").process(new Processor() {
			
			@Override
			public void process(Exchange exchange) throws Exception {
				// TODO Auto-generated method stub
				log.debug("In error processor");
			}
		}).end();
*/
		from("cxf:bean:eskerEndpoint")
			.log("route starts")
			.process(new Processor() {
				public void process(Exchange exchange) throws Exception {
					String opName = exchange.getIn().getHeader(
							CxfConstants.OPERATION_NAME, String.class);
					log.debug("OperationName: " + opName);
				}
			})
			.choice()
				.when(header("operationName").isEqualTo("EskerTransactionOperation"))
					.to("direct:eskerTransactionOperation")
			.end()
			.log("route ends")
		.end();
		
		from("cxf:bean:orderEndpoint")
			.log("route starts")
			//.to("log:input")
			.process(new Processor() {
				public void process(Exchange exchange) throws Exception {
					String opName = exchange.getIn().getHeader(
							CxfConstants.OPERATION_NAME, String.class);
					log.debug("OperationName: " + opName);
				}
			})
			// .setHeader(Exchange.FILE_NAME,
			// constant("request-${date:now:yyyy-MM-dd-HHmmssSSS}"))
			// .wireTap("file://target/inbox/")
			.choice()
				.when(header("operationName").isEqualTo("findUnsubmittedOrder"))
					.to("direct:findUnsubmittedOrder")
				.when(header("operationName").isEqualTo("submitSample"))
					.to("direct:submitSample")
				.when(header("operationName").isEqualTo("findSfdcBasisOrder"))
					.to("direct:findSfdcBasisOrder")
				.when(header("operationName").isEqualTo("submitSfdcOrder"))
					.to("direct:submitSfdcOrder")
			.end()
			// .to("log:output")
			.log("route ends")
		.end();
		
		from("cxf:bean:orderExEndpoint")
			.log("route starts")
			.process(new Processor() {
				public void process(Exchange exchange) throws Exception {
					String opName = exchange.getIn().getHeader(
							CxfConstants.OPERATION_NAME, String.class);
					log.debug("OperationName: " + opName);
				}
			})
			.choice()
				.when(header("operationName").isEqualTo("asyncPoll"))
					.to("direct:asyncPoll")
				.when(header("operationName").isEqualTo("submitSale"))
					.to("direct:submitSale")
				.when(header("operationName").isEqualTo("submitSaleAsync"))
					.to("direct:submitSaleAsync")
				.when(header("operationName").isEqualTo("submitSaleAsyncResult"))
					.to("direct:submitSaleAsyncResult")
				.when(header("operationName").isEqualTo("submitSaleEx"))
					.to("direct:submitSaleEx")
			.end()
			.log("route ends")
		.end();

		
		//
		// method routes
		//
		
		from("direct:submitSale")
			.convertBodyTo(SubmitSaleRequest.class)
			.beanRef("orderImplBean", "submitSale")
			.end();
		from("direct:submitSaleEx")
			.convertBodyTo(SubmitSaleRequest2.class)
			.beanRef("orderImplBean", "submitSaleEx")
			.end();
		from("direct:findUnsubmittedOrder")
			.convertBodyTo(FindUnsubmittedOrdersRequest.class)
			.beanRef("orderImplBean", "findUnsubmittedOrder")
			.end();
		from("direct:submitSample")
			.convertBodyTo(SubmitSampleRequest.class)
			.beanRef("orderImplBean", "submitSample")
			.end();
		from("direct:findSfdcBasisOrder")
			.convertBodyTo(FindBasisOrderRequest.class)
			.beanRef("orderImplBean", "findSfdcBasisOrder")
			.end();
		from("direct:submitSfdcOrder")
			.convertBodyTo(SubmitOrderRequest.class)
			.beanRef("orderImplBean", "submitSfdcOrder")
			.end();
		from("direct:eskerTransactionOperation")
			.convertBodyTo(EskerTransactionRequest.class)
			.beanRef("orderImplBean", "eskerTransactionOperation")
			.end();
				
		

		//	async methods
		//
		
		//from("direct:submitSaleAsyncResult").to("direct:getAsyncResult").convertBodyTo(SubmitSaleResponse.class);		
/*
		from("direct:submitSaleAsyncResult")
			.doTry()
				.to("direct:getAsyncResult")
				.convertBodyTo(SubmitSaleResponse2.class)
			.doCatch(AsyncMethodException.class)
				.process(new Processor() {
					public void process(Exchange exchange) throws Exception {
						AsyncMethodException e = exchange.getProperty(Exchange.EXCEPTION_CAUGHT, AsyncMethodException.class);
						
						//Boolean b1 = exchange.getProperty(Exchange.ERRORHANDLER_HANDLED, Boolean.class);
						//Boolean b2 = exchange.getProperty(Exchange.FAILURE_HANDLED, Boolean.class);
						
						//String error = e.getError();
						String error = e.getMessage();
						log.debug("AsyncMethodError: " + error);						
			            exchange.getOut().setBody(error);
					}
				})
				.convertBodyTo(com.hmco.eai.ots.order.OrderException.class)
				.process(new Processor() {
					public void process(Exchange exchange) throws Exception {
						com.hmco.eai.ots.order.OrderException faultInfo = exchange.getIn().getBody(com.hmco.eai.ots.order.OrderException.class);
						OrderException oe = new OrderException("", faultInfo);
			            exchange.getOut().setFault(true);
			            exchange.getOut().setBody(oe);
					}
				})
			.end();
*/							


		from("direct:submitSaleAsyncResult")
			.convertBodyTo(AsyncRequestId.class)
			.process(new AsyncResponser<SubmitSaleResponse2, OrderException, com.hmco.eai.ots.order.OrderException>(
						asyncService, 
						SubmitSaleResponse2.class, 
						OrderException.class, 
						com.hmco.eai.ots.order.OrderException.class));
				
		//from("direct:submitSaleAsync").process(new AsyncProcessor("direct:submitSaleEx", asyncService));
		from("direct:submitSaleAsync")
			.process(new Processor() {
				public void process(Exchange exchange) throws Exception {
					String callId = asyncService.makeNewAsyncCallId();
					exchange.getIn().setHeader(AsyncProcessor.ASYNC_CALL_ID, callId);
				}
			})
			.wireTap("direct:processAsync") //.executorServiceRef("wireTapThreadPool")
			.process(new Processor() {
				public void process(Exchange exchange) throws Exception {
					String callId = exchange.getIn().getHeader(AsyncProcessor.ASYNC_CALL_ID, String.class);
					AsyncRequestId id = new AsyncRequestId();
					id.setRequestId(callId);
					exchange.getOut().setBody(id);
				}
			})
			.end();
		
		
		final ProducerTemplate template = getContext().createProducerTemplate();					
		from("direct:processAsync")
			.process(new Processor() {
				public void process(Exchange exchangeIn) throws Exception {
					String callId = exchangeIn.getIn().getHeader(AsyncProcessor.ASYNC_CALL_ID, String.class);
					
					//String requestBody = exchangeIn.getIn().getBody(String.class);
					//Object body =  exchangeIn.getIn().getBody();
					MessageContentsList mList = exchangeIn.getIn().getBody(MessageContentsList.class);
					Object body = mList.get(0);
					String requestBody = Converter.convertBodyToString(body);
					
					// call destination
					Exchange exchange = template.send("direct:submitSaleEx", exchangeIn);
					Exception ex = exchange.getException();
					
					if (ex == null) {
						//String requestBody = exchange.getIn().getBody(String.class);			
						String responseBody = exchange.getIn().getBody(String.class);
						log.debug("async call complete. id = " + callId);
						asyncService.saveAsyncResponse(callId, requestBody, responseBody);						
					}
					else {
						//String requestBody = exchange.getIn().getBody(String.class);
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
						
						
						log.debug("async call fail. id = " + callId);
						asyncService.saveAsyncError(callId, requestBody, errResponseBody);
						
					}
				}
			})
			.end();

		
		
		//
		// sega audit
		//
		// defined in xml
		//
		// this.getContext().getEndpoint(endpointR)
		//from("seda:orderAudit?concurrentConsumers=10")
		//	.beanRef("orderImplBean", "sendAudit")
		//	.end();
		


		// GTD REST endpoint
		//
		/*from(REST_ENDPOINT_URI)
			.log("REST route starts, " + REST_ENDPOINT_URI)
			.convertBodyTo(String.class)
			.beanRef("customerImplBean", "rsGetCustomerDetail")
			.end();*/
	}
}
