package hmh.services.scm_services;

import javax.sql.DataSource;
import org.apache.camel.Endpoint;
import org.apache.camel.Exchange;
import org.apache.camel.LoggingLevel;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.builder.xml.Namespaces;
import org.apache.camel.builder.xml.XPathBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

import com.tibco.xmlns.ae2xsd._2002._05.ae._620.basic.idocs.ISMMATMAS03ZISMMATMAS034X;


public class MaterialMasterUpdateRouteBuilder extends RouteBuilder {

	private static final Logger logger = Logger.getLogger(MaterialMasterUpdateRouteBuilder.class);
	
	public static final String MatNumberHeader = "MatNumberHeader";
	public static final String MaterialUpdateUpsertSql = "{call SCM_MATMASUPDATE_UPSERT(?, ?)}";

	
	private JdbcTemplate jdbcTemplateCDB;
	//private JdbcTemplate jdbcTemplateWP;
		
	
	public void setCdbDataSource(DataSource dataSource) {
		logger.info("setCDBDataSource");
		this.jdbcTemplateCDB = new JdbcTemplate(dataSource);
	}
	
	//public void setWpDataSource(DataSource dataSource) {
	//	logger.info("setWPDataSource");
	//	this.jdbcTemplateWP = new JdbcTemplate(dataSource);
	//}
	
	
	@Override
	public void configure() throws Exception {

		//JaxbDataFormat idocJaxb = new JaxbDataFormat("generated");
		JaxbDataFormat idocJaxb = new JaxbDataFormat("com.tibco.xmlns.ae2xsd._2002._05.ae._620.basic.idocs");				
        JaxbDataFormat sfaJaxb = new JaxbDataFormat("com.hmco.schemas.sfa.material_update");

		final Namespaces ns = new Namespaces("ns", "http://www.tibco.com/xmlns/ae2xsd/2002/05/ae/620/basic/IDOCS");
        
		Endpoint tibSAPMaterialMasterUpdateCamel = getContext().getEndpoint("ref:tibSAPMaterialMasterUpdateCamel");
		
			
		//
		// SAPMaterialMasterUpdateCamel durable
		//
		from(tibSAPMaterialMasterUpdateCamel)
			//.log(LoggingLevel.DEBUG, "idoc: ${body}")	
	    	.process(new Processor() {
	    		public void process(Exchange exchange) throws Exception {
	    			String body = (String) exchange.getIn().getBody(String.class);	
	    			String nodeValue = XPathBuilder
	    								.xpath("EAIMessage/ns:ISM__MATMAS03-ZISM__MATMAS03-4x")
	    								.namespaces(ns)
	    								.evaluate(getContext(), body, String.class);
	    			exchange.getIn().setBody(nodeValue);
	    		}
	    	})			
			//.log("SAPMaterialMasterUpdateCamel: ${body}")	
        	.unmarshal(idocJaxb)
        	.process(new Processor() {
				public void process(Exchange exchange) throws Exception {
					ISMMATMAS03ZISMMATMAS034X idoc = exchange.getIn().getBody(ISMMATMAS03ZISMMATMAS034X.class);
					String matnr = idoc.getCHILDREN().getValue().getE1MARAM().getValue().getItem().get(0).getFIELDS().getValue().getMATNR().getValue();
					String idocNum = idoc.getEDIDC().getValue().getDOCNUM().getValue();
					if (log.isDebugEnabled()) {
						log.debug("idoc: " + idocNum);
						log.debug("matnr: " + matnr);
					}
					exchange.getIn().setHeader(MatNumberHeader, matnr);
				}
       		})
        	.bean(ZISMMATMAS03_to_MaterialUpdate.class)
        	.marshal(sfaJaxb)
			.log(LoggingLevel.INFO, "com.hmco.schemas.sfa.material_update: ${body}")	
        	.process(new Processor() {
        		public void process(Exchange exchange) throws Exception {
        			String body = (String) exchange.getIn().getBody(String.class);
        			String matnr = exchange.getIn().getHeader(MatNumberHeader, String.class);
        			
        			// CDB
        			try {
        				logger.info("MaterialUpdate to CDB. matnr: " + matnr);
        				jdbcTemplateCDB.update(MaterialUpdateUpsertSql, new Object[] {matnr, body});
        			}
        			catch(Exception ex) {
        				logger.error(ex.getMessage(), ex);
        			}

        		}        		
        	})		
        	.end();
		
	}

}
