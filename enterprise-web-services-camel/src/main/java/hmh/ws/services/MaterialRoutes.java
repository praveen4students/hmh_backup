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
import com.hmco.eai.ots.material.GetMaterialDetailRequest;
import com.hmco.eai.ots.material.MaterialDetailList;
import com.hmco.eai.ots.material.MaterialKeyList;
import com.hmco.eai.ots.material.getatp.GETATPREQUEST;
import com.hmco.eai.ots.material.getatp.GETATPRESPONSE;
import com.hmco.eai.tibco.enterprisewebservices.GetMaterialATPException;
import com.hmco.eai.tibco.enterprisewebservices.MaterialException;
import com.hmh.util.async.AsyncService;

/**
 * Our routes that we can build using Camel DSL as we extend the RouteBuilder
 * class.
 * <p/>
 * In the configure method we have all kind of DSL methods we use for expressing
 * our routes.
 */
public class MaterialRoutes extends RouteBuilder {

	protected final transient Logger log = LoggerFactory.getLogger(getClass());

/*	private static final String REST_ENDPOINT_URI = "cxfrs://http://0.0.0.0:7110/rest/customer"
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

		//
		// MaterialEx main route
		//
		from("cxf:bean:materialExEndpoint")
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
				.when(header("operationName").isEqualTo("getMaterialDetailAsyncResult"))
					.to("direct:getMaterialDetailAsyncResult")
				.when(header("operationName").isEqualTo("getMaterialDetail"))
					.to("direct:getMaterialDetail")
				.when(header("operationName").isEqualTo("getMaterialSubstitutions"))
					.to("direct:getMaterialSubstitutions")
				.when(header("operationName").isEqualTo("getMaterialDetailAsync"))
					.to("direct:getMaterialDetailAsync")
				.when(header("operationName").isEqualTo("getMaterialDetailEx"))
					.to("direct:getMaterialDetailEx")
			.end()
			// .to("log:output")
			.log("route ends")
			.end();

		//
		// ATPEx main route
		//
		from("cxf:bean:atpExEndpoint")
			.log("route starts")
			// .to("log:input")
			.process(new Processor() {
				public void process(Exchange exchange) throws Exception {
					String opName = exchange.getIn().getHeader(
							"operationName", String.class);
					log.debug("OperationName: " + opName);
				}
			})
			// .setHeader(Exchange.FILE_NAME,
			// constant("request-${date:now:yyyy-MM-dd-HHmmssSSS}"))
			// .wireTap("file://target/inbox/")
			.choice()
				.when(header("operationName").isEqualTo("asyncPoll"))
					.to("direct:asyncPoll")
				.when(header("operationName").isEqualTo("getMaterialATP"))
					.to("direct:getMaterialATP")
				.when(header("operationName").isEqualTo("getMaterialATPEx"))
					.to("direct:getMaterialATPEx")
				.when(header("operationName").isEqualTo("getMaterialATPAsync"))
					.to("direct:getMaterialATPAsync")
				.when(header("operationName").isEqualTo("getMaterialATPAsyncResult"))
					.to("direct:getMaterialATPAsyncResult")
			.end()
			// .to("log:output")
			.log("route ends")
			.end();
		
		//
		// MaterialEx method routes
		//
		
		from("direct:getMaterialDetail")
			.convertBodyTo(GetMaterialDetailRequest.class)
			.beanRef("materialImplBean", "getMaterialDetail")
			.end();
				
		from("direct:getMaterialDetailEx")
			.convertBodyTo(com.hmco.eai.ots.materialnew.GetMaterialDetailRequest.class)
			.beanRef("materialImplBean", "getMaterialDetailEx")
			.end();
			
		from("direct:getMaterialSubstitutions")
			.convertBodyTo(MaterialKeyList.class)
			.beanRef("materialImplBean", "getMaterialSubstitutions")
			.end();
		
		from("direct:getMaterialDetailAsync").process(new AsyncProcessor("direct:getMaterialDetail", asyncService));			
//		from("direct:getMaterialDetailAsyncResult").to("direct:getAsyncResult").convertBodyTo(MaterialDetailList.class);		
		from("direct:getMaterialDetailAsyncResult")
		.convertBodyTo(AsyncRequestId.class)
		.process(new AsyncResponser<MaterialDetailList, MaterialException, EaiException>(
					asyncService, 
					MaterialDetailList.class, 
					MaterialException.class, 
					EaiException.class));
		
		//
		// ATPEx method routes
		//
		
		from("direct:getMaterialATP")
			.convertBodyTo(GETATPREQUEST.class)
			.beanRef("materialImplBean", "getMaterialATP")
			.end();

		from("direct:getMaterialATPEx")
			.convertBodyTo(com.hmco.eai.ots.material.getatpnew.GETATPREQUEST.class)
			.beanRef("materialImplBean", "getMaterialATPEx")
			.end();
		
		//from("direct:asyncPoll").end();	
		from("direct:getMaterialATPAsync").process(new AsyncProcessor("direct:getMaterialATP", asyncService));
		
//		from("direct:getMaterialATPAsyncResult").to("direct:getAsyncResult").convertBodyTo(GETATPRESPONSE.class);
		
		from("direct:getMaterialATPAsyncResult")
		.convertBodyTo(AsyncRequestId.class)
		.process(new AsyncResponser<GETATPRESPONSE, GetMaterialATPException, EaiException>(
					asyncService, 
					GETATPRESPONSE.class, 
					GetMaterialATPException.class, 
					EaiException.class));

		//
		// sega audit
		//
		// defined in xml
		//
		// this.getContext().getEndpoint(endpointR)
		//from("seda:materialAudit?concurrentConsumers=10")
		//	.beanRef("materialImplBean", "sendAudit")
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
