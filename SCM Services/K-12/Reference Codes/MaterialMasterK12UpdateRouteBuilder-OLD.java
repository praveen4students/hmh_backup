package hmh.services.scm_services.routes;

import java.io.PrintWriter;
import java.io.StringWriter;

import hmh.services.scm_services.common.SCMCentralDBUtil;
import hmh.services.scm_services.common.SCMEaiLogUtil;
import hmh.services.scm_services.mapping.MaterialMasterK12UpdateMapping;
import hmh.services.scm_services.mapping.MaterialMasterUpdateMapping;

import org.apache.camel.Endpoint;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.builder.xml.Namespaces;
import org.apache.camel.builder.xml.XPathBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.apache.log4j.Logger;

import com.hmh.util.dao.EAI_Log;
import com.tibco.schemas.sunrisecentral_database_consumer_updated_material.sharedresources.schemas.scm.schema.MaterialMasterUpdate;
import com.tibco.xmlns.ae2xsd._2002._05.ae._620.basic.idocs.ISMMATMAS03ZISMMATMAS034X;

public class MaterialMasterK12UpdateRouteBuilder extends RouteBuilder 
{
	private String idocJaxbFormat 	= "com.tibco.xmlns.ae2xsd._2002._05.ae._620.basic.idocs";
	private String sfaJaxbFormat	= "com.hmco.schemas.sfa.k12";
	private String nameSpace		= "http://www.tibco.com/xmlns/ae2xsd/2002/05/ae/620/basic/IDOCS";
	private String endPoint 		= "ref:tibSAPMaterialMasterK12UpdateCamel";
	private String xPathInput		= "EAIMessage/ns:ISM__MATMAS03-ZISM__MATMAS03-4x";
	private Object mappingBean		= new MaterialMasterK12UpdateMapping();
	
	private static final Logger logger = Logger.getLogger(MaterialMasterK12UpdateRouteBuilder.class);
	protected static final String HEADER_PAY_LOAD = "payLoad";
	private SCMCentralDBUtil centralDBUtil;
	private SCMEaiLogUtil eaiLogUtil;
	private EAI_Log log = null;
	
	//EBS Name = Source + Process Name + Destination
	protected static final String EBS_NAME = "SAPMaterialMasterK12UpdateCDB";
	
	@Override
	public void configure() throws Exception {

		JaxbDataFormat idocJaxb = new JaxbDataFormat(idocJaxbFormat);				
		JaxbDataFormat sfaJaxb  = new JaxbDataFormat(sfaJaxbFormat);
		final Namespaces ns 	= new Namespaces("ns", nameSpace);
		Endpoint tibSAPMaterialMasterUpdateCamel = getContext().getEndpoint(endPoint);
		
		from(tibSAPMaterialMasterUpdateCamel)
		.doTry()
	    	.process(new Processor() {
	    		public void process(Exchange exchange) throws Exception {
	    			String body = (String) exchange.getIn().getBody(String.class);	
	    			
	    			logger.debug("MaterialMasterK12Update Input XML : "+body);
	    			
	    			String nodeValue = XPathBuilder
	    								.xpath(xPathInput)
	    								.namespaces(ns)
	    								.evaluate(getContext(), body, String.class);
	    			
	    			exchange.getIn().setBody(nodeValue);
	    			exchange.getIn().setHeader(HEADER_PAY_LOAD, body);
	    		}
	    	})			
        	.unmarshal(idocJaxb)
        	.process(new Processor() {
				public void process(Exchange exchange) throws Exception {
					
					ISMMATMAS03ZISMMATMAS034X idoc = exchange.getIn().getBody(ISMMATMAS03ZISMMATMAS034X.class);
					String idocNo = idoc.getEDIDC().getValue().getDOCNUM().getValue();
					logger.debug("IDOC Number : " + idocNo);
										
					log = EAI_Log.enter(idocNo, EBS_NAME, EAI_Log.SYS_SAP, EAI_Log.SYS_CDB, EAI_Log.COMP_CentralDB);
					eaiLogUtil.sendToEaiLog(log);
				}
       		})
        	.bean(mappingBean)
        	.marshal(sfaJaxb)
        	.process(new Processor() {
        		public void process(Exchange exchange) throws Exception {
        			
        			String body = (String) exchange.getIn().getBody(String.class);
        			exchange.getIn().setHeader(HEADER_PAY_LOAD, body);
        			MaterialMasterUpdate mappingBean = exchange.getIn().getBody(MaterialMasterUpdate.class); 

        			logger.debug("MaterialMasterUpdate Output XML : "+body);
        			
        			if(mappingBean==null){
        				log.toFilter();
        			}else{
        				centralDBUtil.materialsUpsert(body, mappingBean);
        				log.toExit();
        			}//End of if-else
        			eaiLogUtil.sendToEaiLog(log);
        		}//End of process        		
        	})
        .doCatch(Throwable.class)
		    .process(new Processor() {
				@Override
				public void process(Exchange exchange) throws Exception {
					Throwable ex = exchange.getProperty(Exchange.EXCEPTION_CAUGHT, Throwable.class);
					ex.printStackTrace(System.err);
					logger.error(EBS_NAME+" : Exception Occured. Exception is : ", ex);
	
					StringWriter stackTrace = new StringWriter();			
					ex.printStackTrace(new PrintWriter(stackTrace));
					stackTrace.flush();
	
					String err = stackTrace.toString().toLowerCase();
					String errorType = EAI_Log.EXEPTION_BUSINESS;
					if( err.contains("jdbc") && !err.contains("unique constraint")){
						errorType = EAI_Log.EXEPTION_SYSTEM;
					}
					
					log.toException((String)exchange.getIn().getHeader(HEADER_PAY_LOAD), ex.getMessage(), errorType, stackTrace.toString());
					eaiLogUtil.sendToEaiLog(log);
				}
			})
        .end();
	}//End of configure()
	
	public void setCentralDBUtil(SCMCentralDBUtil centralDBUtil) {
		this.centralDBUtil = centralDBUtil;
	}
	public void setEaiLogUtil(SCMEaiLogUtil eaiLogUtil) {
		this.eaiLogUtil = eaiLogUtil;
	}
	
}//End of Class
