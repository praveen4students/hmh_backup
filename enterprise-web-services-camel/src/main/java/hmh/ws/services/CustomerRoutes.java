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

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hmco.eai.AsyncRequestId;
import com.hmco.eai.EaiException;
import com.hmco.eai.ots.customer.AccountStatementPDFRequest;
import com.hmco.eai.ots.customer.CreateEtailCustomerRequest;
import com.hmco.eai.ots.customer.CreateSundryCustomerRequest;
import com.hmco.eai.ots.customer.CustomerDetailList;
import com.hmco.eai.ots.customer.CustomerKeyList;
import com.hmco.eai.ots.customer.CustomerRelationshipList;
import com.hmco.eai.ots.customer.CustomerSearchCriteria;
import com.hmco.eai.ots.customer.FindSFDCCustomerRequest;
import com.hmco.eai.ots.customer.GetCustomerRelationshipsRequest;
import com.hmco.eai.ots.customer.SfdcCustomerIdList;
import com.hmco.eai.tibco.enterprisewebservices.CustomerException;
import com.hmh.util.async.AsyncService;

/**
 * Our routes that we can build using Camel DSL as we extend the RouteBuilder
 * class.
 * <p/>
 * In the configure method we have all kind of DSL methods we use for expressing
 * our routes.
 */
public class CustomerRoutes extends RouteBuilder {

	protected final transient Logger log = LoggerFactory.getLogger(getClass());

	//private static final String REST_ENDPOINT_URI = "cxfrs://http://0.0.0.0:7110/rest/customer"
	//		+ "?resourceClasses=hmh.ws.services.CustomerImpl";

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

		//
		// main route
		//
		from("cxf:bean:customerExEndpoint")
			.log("route starts")
			// .to("log:input")
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
				.when(header("operationName").isEqualTo("asyncPoll"))
					.to("direct:asyncPoll")
				.when(header("operationName").isEqualTo("getCustomerDetail"))
					.to("direct:getCustomerDetail")
				.when(header("operationName").isEqualTo("getCustomerDetailAsync"))
					.to("direct:getCustomerDetailAsync")
				.when(header("operationName").isEqualTo("getCustomerDetailAsyncResult"))
					.to("direct:getCustomerDetailAsyncResult")
				.when(header("operationName").isEqualTo("getCustomerRelationships"))
					.to("direct:getCustomerRelationships")
				.when(header("operationName").isEqualTo("getCustomerRelationshipsAsync"))
					.to("direct:getCustomerRelationshipsAsync")
				.when(header("operationName").isEqualTo("getCustomerRelationshipsAsyncResult"))
					.to("direct:getCustomerRelationshipsAsyncResult")
				.when(header("operationName").isEqualTo("createEtailCustomer"))
					.to("direct:createEtailCustomer")
				.when(header("operationName").isEqualTo("findEtailCustomer"))
					.to("direct:findEtailCustomer")
				.when(header("operationName").isEqualTo("createSundryCustomer"))
					.to("direct:createSundryCustomer")
				.when(header("operationName").isEqualTo("createSundryCustomerAsync"))
					.to("direct:createSundryCustomerAsync")
				.when(header("operationName").isEqualTo("createSundryCustomerAsyncResult"))
					.to("direct:createSundryCustomerAsyncResult")					
				.when(header("operationName").isEqualTo("findSFDCCustomer"))
					.to("direct:findSFDCCustomer")
				.when(header("operationName").isEqualTo("accountStatementPDF"))
					.to("direct:accountStatementPDF")
				.when(header("operationName").isEqualTo("getSFDCRep"))
					.to("direct:getSFDCRep")
			.end()
			// .to("log:output")
			.log("route ends")
			.end();

		//
		// method routes
		//
		
		from("direct:getCustomerDetail")
			.convertBodyTo(CustomerKeyList.class)
			.beanRef("customerImplBean", "getCustomerDetail")
			.end();
				
		from("direct:getCustomerRelationships")
			.convertBodyTo(GetCustomerRelationshipsRequest.class)
			.beanRef("customerImplBean", "getCustomerRelationships")
			.end();

		from("direct:createEtailCustomer")
			.convertBodyTo(CreateEtailCustomerRequest.class)
			.beanRef("customerImplBean", "createEtailCustomer")
			.end();

		from("direct:findEtailCustomer")
			.convertBodyTo(CustomerSearchCriteria.class)
			.beanRef("customerImplBean", "findEtailCustomer")
			.end();

		from("direct:createSundryCustomer")
			.convertBodyTo(CreateSundryCustomerRequest.class)
			.beanRef("customerImplBean", "createSundryCustomer")
			.end();

		from("direct:findSFDCCustomer")
			.convertBodyTo(FindSFDCCustomerRequest.class)
			.beanRef("customerImplBean", "findSFDCCustomer")
			.end();
		
		from("direct:getSFDCRep")
			.convertBodyTo(SfdcCustomerIdList.class)
			.beanRef("customerImplBean", "getSFDCRep")
			.end();
		
		from("direct:accountStatementPDF")
			.convertBodyTo(AccountStatementPDFRequest.class)
			.beanRef("customerImplBean", "accountStatementPDF")
			.end();

		//	async methods
		//
		
		from("direct:asyncPoll")
			.convertBodyTo(AsyncRequestId.class)
			.beanRef("customerImplBean", "asyncPoll")
			.end();

		from("direct:getAsyncResult")
			.convertBodyTo(AsyncRequestId.class)
			.beanRef("customerImplBean", "getRequestId")
			.bean(asyncService, "getAsyncResponse")
			.end();
		
//		from("direct:getCustomerDetailAsyncResult").to("direct:getAsyncResult").convertBodyTo(CustomerDetailList.class);
//		from("direct:getCustomerRelationshipsAsyncResult").to("direct:getAsyncResult").convertBodyTo(CustomerRelationshipList.class);
//		from("direct:createSundryCustomerAsyncResult").to("direct:getAsyncResult").convertBodyTo(String.class);
		
		from("direct:getCustomerDetailAsyncResult")
		.convertBodyTo(AsyncRequestId.class)
		.process(new AsyncResponser<CustomerDetailList, CustomerException, EaiException>(
					asyncService, 
					CustomerDetailList.class, 
					CustomerException.class, 
					EaiException.class));
		
		from("direct:getCustomerRelationshipsAsyncResult")
		.convertBodyTo(AsyncRequestId.class)
		.process(new AsyncResponser<CustomerRelationshipList, CustomerException, EaiException>(
					asyncService, 
					CustomerRelationshipList.class, 
					CustomerException.class, 
					EaiException.class));
		
		from("direct:createSundryCustomerAsyncResult")
		.convertBodyTo(AsyncRequestId.class)
		.process(new AsyncResponser<String, CustomerException, EaiException>(
					asyncService, 
					String.class, 
					CustomerException.class, 
					EaiException.class));
		
		

		from("direct:getCustomerDetailAsync").process(new AsyncProcessor("direct:getCustomerDetail", asyncService));			
		from("direct:getCustomerRelationshipsAsync").process(new AsyncProcessor("direct:getCustomerRelationships", asyncService));			
		from("direct:createSundryCustomerAsync").process(new AsyncProcessor("direct:createSundryCustomer", asyncService));			
		

		//
		// sega audit
		//
		// defined in xml
		//
		// this.getContext().getEndpoint(endpointR)
		//from("seda:customerAudit?concurrentConsumers=10")
		//	.beanRef("customerImplBean", "sendAudit")
		//	.end();
		

/*
		// GTD REST endpoint
		//
		from(REST_ENDPOINT_URI)
			.log("REST route starts, " + REST_ENDPOINT_URI)
			.convertBodyTo(String.class)
			.beanRef("customerImplBean", "rsGetCustomerDetail")
			.end();
*/		
	}
}
