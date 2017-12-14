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

import com.hmco.eai.ots.transaction.RetrieveInvoicePDFRequest;
import com.hmco.eai.ots.transaction.TransactionIDList;
import com.hmco.eai.ots.transaction.TransactionSearchCriteria;

/**
 * Our routes that we can build using Camel DSL as we extend the RouteBuilder class.
 * <p/>
 * In the configure method we have all kind of DSL methods we use for expressing our routes.
 */
public class TransactionRoutes extends RouteBuilder {

	protected final transient Logger log = LoggerFactory.getLogger(getClass());	
	
    
    private static final String REST_ENDPOINT_URI = "cxfrs://http://0.0.0.0:7110/rest/transaction"
        + "?resourceClasses=hmh.ws.services.TransactionImpl";
	
	//@Autowired
	//private hmh.ws.services.TransactionImpl transactionImpl;
	
	
    public void configure() throws Exception {
        // webservice response for OK
        //OutputReportIncident ok = new OutputReportIncident();
        //ok.setCode("OK");
        //OutputReportIncident accepted = new OutputReportIncident();
        //accepted.setCode("Accepted");

    	//
    	//	main route
    	//
        from("cxf:bean:transactionExEndpoint")
        	.log("route starts")
        	//.to("log:input")
        	.process(new Processor() {
        		public void process(Exchange exchange) throws Exception {
        			String opName = exchange.getIn().getHeader(CxfConstants.OPERATION_NAME, String.class);
        			log.debug("OperationName: " + opName);
        		}        		
        	})
	        //.setHeader(Exchange.FILE_NAME, constant("request-${date:now:yyyy-MM-dd-HHmmssSSS}"))
	        //.wireTap("file://target/inbox/")
        	.choice()
        		.when(header("operationName").isEqualTo("getTransactionDetail"))
        			.to("direct:getTransactionDetail")
        		.when(header("operationName").isEqualTo("getInvoices"))
        			.to("direct:getInvoices")
        		.when(header("operationName").isEqualTo("getShipments"))
        			.to("direct:getShipments")
        		.when(header("operationName").isEqualTo("findTransactions"))
        			.to("direct:findTransactions")
        		.when(header("operationName").isEqualTo("getTransactionDetailEx"))
        			.to("direct:getTransactionDetailEx")
        		.when(header("operationName").isEqualTo("retrieveInvoicePDF"))
        			.to("direct:retrieveInvoicePDF")
        	.end()
        	//.to("log:output")
        	.log("route ends")
        	.end();

        
        //
        // method routes
        //
        from("direct:getTransactionDetail")
	    	.convertBodyTo(TransactionIDList.class)
	        .beanRef("transactionImplBean", "getTransactionDetail")
	        .end();

        from("direct:getInvoices")
	    	.convertBodyTo(TransactionIDList.class)
	        .beanRef("transactionImplBean", "getInvoices")
	        .end();

        from("direct:getShipments")
	    	.convertBodyTo(TransactionIDList.class)
	        .beanRef("transactionImplBean", "getShipments")
	        .end();

        from("direct:findTransactions")
	    	.convertBodyTo(TransactionSearchCriteria.class)
	        .beanRef("transactionImplBean", "findTransactions")
	        .end();

        from("direct:getTransactionDetailEx")
    		.convertBodyTo(com.hmco.eai.ots.transactionnew.TransactionIDList.class)
    		.beanRef("transactionImplBean", "getTransactionDetailEx")
    		.end();
        
        from("direct:retrieveInvoicePDF")
		.convertBodyTo(RetrieveInvoicePDFRequest.class)
		.beanRef("transactionImplBean", "retrieveInvoicePDF")
		.end();

        
        //
        // sega audit
        //
        // route defined in zml
        //
        //from("seda:transactionAudit?concurrentConsumers=10")
    	//	.beanRef("transactionImplBean", "sendAudit")
/*
    		.process(new Processor() {
        		public void process(Exchange exchange) throws Exception {
        			EAI_Log eaiLog = exchange.getIn().getBody(EAI_Log.class);
        			exchange.getIn().setBody(eaiLog.makeDataArray());
        			log.debug("send audit for " + eaiLog.getMsg_Text());
        		}        		
        	})        
        	// need 14 
        	.to("sql:insert into EAI_LOG a (a.trans_id,a.event_id,a.ebs_nm,a.source,a.severity,a.cmpt_nm,a.evnt_payload,a.err_stack_trace,a.evnt_acty_tmstp,a.err_family,a.err_type,a.msg_text,a.load_acty_tmstp,a.destination) values(#,#,#,#,#,#,#,#,#,#,#,#,#,#)")
*/
    	//	.end();
    		
    	// GTD webservices entpoint
    	//
/*
        from("cxf:bean:transactionExEndpoint")
            //.convertBodyTo(InputReportIncident.class)
        	.convertBodyTo(TransactionIDList.class)
            .setHeader(Exchange.FILE_NAME, constant("request-${date:now:yyyy-MM-dd-HHmmssSSS}"))
            .wireTap("file://target/inbox/")
            .beanRef("transactionImplBean", "getTransactionDetail")
            ;
*/
 
/*        
        // GTD REST endpoint
        //
        from(REST_ENDPOINT_URI)
        	.log("REST route starts, " + REST_ENDPOINT_URI)

        	.process(new Processor() {

                public void process(Exchange exchange) throws Exception {
                    Message inMessage = exchange.getIn();                        
                    // Get the operation name from in message
                    String operationName = inMessage.getHeader(CxfConstants.OPERATION_NAME, String.class);
                    String httpMethod = inMessage.getHeader(Exchange.HTTP_METHOD, String.class);
                    String path = inMessage.getHeader(Exchange.HTTP_PATH, String.class);
                    // The parameter of the invocation is stored in the body of in message
                    String id = inMessage.getBody(String.class);
                    log.debug("opName: " + operationName);
                    log.debug("path: " + path);
                    log.debug("body:" + id);
                }
        	})
        	.convertBodyTo(String.class)
            .beanRef("transactionImplBean", "rsGetTransactionDetail")
        	//.beanRef("transactionImplBean", header(CxfConstants.OPERATION_NAME).toString())
            .end();
*/        
        
    }
}
