package hmh.rs.services;


import hmh.util.Transaction_Constants;

import java.io.InputStream;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.Arrays;
import java.util.Dictionary;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import javax.xml.ws.soap.SOAPBinding;

import org.apache.camel.CamelContext;
import org.apache.camel.component.properties.PropertiesComponent;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;
import org.osgi.service.cm.Configuration;
import org.osgi.service.cm.ConfigurationAdmin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import paymetric.xipaysoap30.XiPayWS;
import paymetric.xipaysoap30.XiPayWSSoap;
import paymetric.xipaysoap30.message.ArrayOfITransactionHeader;
import paymetric.xipaysoap30.message.ArrayOfInfoItem;
import paymetric.xipaysoap30.message.IPackets;
import paymetric.xipaysoap30.message.ITransactionHeader;
import paymetric.xipaysoap30.message.InfoItem;

import com.hmh.util.hasher.Hasher;

@Path("/ccard")
public class CardREST implements InitializingBean, DisposableBean {
	
	protected final transient Logger log = LoggerFactory.getLogger(getClass());
	public static final String SAP = "SAP";
	public static final String ENTERPRISE = "Enterprise";
	public final static QName SERVICE = new QName("http://Paymetric/XiPaySoap30/message/", "XiPayWS");
	private CamelContext camelContext;
	private ConfigurationAdmin configAdmin;	
	private Hasher hasher;
		
	private String pmUrl;
	private String pmUser;
	private String pmPass;
	private String pmStatusCode;
	private String pmTr_Card_Cidrespcode;
	private String pmAvsCode;
	
	XiPayWSSoap soap = null;
	private List<String> nonAvsCode;
	private Dictionary merchantProp;


    class PaymetricAuthenticator extends Authenticator {
        public PasswordAuthentication getPasswordAuthentication() {
            // I haven't checked getRequestingScheme() here, since for NTLM
            // and Negotiate, the usrname and password are all the same.
            log.debug("Feeding username and password for " + getRequestingScheme());
            log.debug("pmUser: " + pmUser + ", pmPass: " + pmPass);
            return (new PasswordAuthentication(pmUser, pmPass.toCharArray()));
        }
    }
    

	//
	// properties setters
	//

	public void setCamelContext(CamelContext camelContext) {
		this.camelContext = camelContext;
	}

	public void setConfigAdmin(ConfigurationAdmin configAdmin) { 
        this.configAdmin = configAdmin; 
	}
	
	public void setHasher(Hasher hasher) {
		this.hasher = hasher;
	}

	public void setPmUrl(String pmUrl) {
		this.pmUrl = pmUrl;
	}

	public void setPmUser(String pmUser) {
		this.pmUser = pmUser;
	}

	public void setPmPass(String pmPass) {
		this.pmPass = pmPass;
	}

	public void setPmStatusCode(String pmStatusCode) {
		this.pmStatusCode = pmStatusCode;
	}

	public void setPmTr_Card_Cidrespcode(String pmTr_Card_Cidrespcode) {
		this.pmTr_Card_Cidrespcode = pmTr_Card_Cidrespcode;
	}

	public void setPmAvsCode(String pmAvsCode) {
		this.pmAvsCode = pmAvsCode;
	}
	

	@GET
	@Path("/authorization")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public JAXBElement<IPackets> authorization(
			@QueryParam("division") String division,
			@QueryParam("type") String cardType,
			@QueryParam("number") String cardNumber,
			@QueryParam("expiration") String cardExpirationDate,
			@QueryParam("cvv") String cardCVV,
			@QueryParam("currency") String currencyKey,
			@QueryParam("amount") String amount,
			@QueryParam("name") String holderName,
			@QueryParam("address") String holderAddress,
			@QueryParam("city") String holderCity,
			@QueryParam("state") String holderState,
			@QueryParam("zip") String holderZip,
			@QueryParam("country") String holderCountry
			
		) {
				
		try {	
			ITransactionHeader header = new ITransactionHeader();
			header.setPacketOperation(1);
			header.setMerchantID(getMerchantId(division));
			header.setCardType(cardType);
			header.setCardNumber(cardNumber);
			header.setCardExpirationDate(cardExpirationDate);
			header.setCardCVV2(cardCVV);
			header.setCurrencyKey(currencyKey);
			header.setAmount(amount);
			
			header.setCardHolderName(holderName);
			header.setCardHolderAddress1(holderAddress);
			header.setCardHolderCity(holderCity);
			header.setCardHolderState(holderState);
			header.setCardHolderZip(holderZip);
			header.setCardHolderCountry(holderCountry);
	
			ArrayOfInfoItem infos = new ArrayOfInfoItem();
			List<InfoItem> listInfos = infos.getInfoItem();
			InfoItem item = new InfoItem();
			item.setKey("TR_CARD_CIDIND");
			item.setValue("1");
			listInfos.add(item);
			header.setInfoItems(infos);
			
		
			IPackets iPackets = new IPackets();
			iPackets.setXipayvbresult(false);		
			ArrayOfITransactionHeader headers = new ArrayOfITransactionHeader();
			List<ITransactionHeader> headerList = headers.getITransactionHeader();
			headerList.add(header);
			iPackets.setPackets(headers);
			iPackets.setCount(1);
				
			IPackets oPackets = soap.soapOp(iPackets);
			JAXBElement<IPackets> ret = new JAXBElement<IPackets>(SERVICE, IPackets.class, oPackets);
			
			String out_statusCode = new String(oPackets.getPackets().getITransactionHeader().get(0).getStatusCode() + Transaction_Constants.EMPTY);
			String out_avsCode = oPackets.getPackets().getITransactionHeader().get(0).getAVSCode();
			String out_cidRespCode = oPackets.getPackets().getITransactionHeader().get(0).getInfoItems().getInfoItem().get(0).getValue();
			//log.debug("CID_RESPCODE KEY :: " + oPackets.getPackets().getITransactionHeader().get(0).getInfoItems().getInfoItem().get(0).getKey());
			//log.debug("CID_RESPCODE VALUE :: " + oPackets.getPackets().getITransactionHeader().get(0).getInfoItems().getInfoItem().get(0).getValue());
			log.debug("response code: " + out_statusCode);
			
/*
			// caller would like to analyze those code
			if( out_statusCode != null 
					&& out_avsCode != null 
					&& out_cidRespCode != null 
					&& out_statusCode.equalsIgnoreCase(pmStatusCode) 
					&& !nonAvsCode.contains(out_avsCode) 
					&& out_cidRespCode.equalsIgnoreCase(pmTr_Card_Cidrespcode)) {
				return ret;
			} else {
				throw new Exception();
			}
*/
			return ret;
			
		} catch (Exception e) {
			log.error(e.getMessage(), e);

			Response r = Response
					.status(500)
					.header("Authorization",
							e.getMessage())
					.entity(e).build();
			throw new WebApplicationException(r);
		}
	}

	private String getMerchantId(String division) throws Exception {
		String sapDiv = hasher.getValue(
				Transaction_Constants.DIVISION, ENTERPRISE,
				division, SAP);
		if( sapDiv == null || (sapDiv != null && sapDiv.length()== 0) ) {
			log.info("Exception in getMerchantID");
			throw new Exception("Invalid division");
		} else {
			String merchantId = (String)merchantProp.get(sapDiv);
			log.debug("MerchantId: " + merchantId);
			return merchantId;
		}
	}
	
	private void init() {
		if (soap == null) {
			XiPayWS	service = new XiPayWS(XiPayWS.class.getResource("/META-INF/wsdl/XiPay30WS.asmx.wsdl"));
			service.addPort(XiPayWS.XiPayWSSoap, SOAPBinding.SOAP11HTTP_BINDING, pmUrl);
			//soap = service.getXiPayWSSoap();
			soap = service.getPort(XiPayWS.XiPayWSSoap, XiPayWSSoap.class);
			
			// Okay, are you sick of configuration files ?
			// This will show you how to configure the http conduit dynamically
			Client client = ClientProxy.getClient(soap);
			HTTPConduit http = (HTTPConduit) client.getConduit();
			
			HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();
			
			httpClientPolicy.setConnectionTimeout(36000);
			httpClientPolicy.setAllowChunking(false);
			//httpClientPolicy.setReceiveTimeout(32000);
			
			http.setClient(httpClientPolicy);			
		}	
		// initialize values from property files
		nonAvsCode = Arrays.asList(pmAvsCode.split("\\s*,\\s*"));
		try {
			//Configuration[] cfgs = configAdmin.listConfigurations(null);
			Configuration cfg = configAdmin.getConfiguration("hmh.paymetric.merchantid");
			//Dictionary props = cfg.getProperties();
			merchantProp = cfg.getProperties();
			if (merchantProp == null) {
	        	log.error("==================Merchant id is not loaded ==================");			
			}
			
			/*
			//Properties props = PropertiesLoaderUtils.loadAllProperties("hmh.paymetric.merchantid.cfg");	
			
			//Map<String, String> props = camelContext.getProperties();
			String merchantID = (String) merchantProp.get("10");
        	log.debug("Merchant ID " + merchantID);

			ClassLoader sysClassLoader = ClassLoader.getSystemClassLoader();
            InputStream is = sysClassLoader.getResourceAsStream("hmh.paymetric.merchantid");
            merchantProp.load(is);
            if(merchantProp != null) {
            	log.info("Merchant ID " + merchantProp.get("10"));
            } else {
            	log.info("Property file not loaded ");
            }
            */
        } catch (Exception e) {
        	log.error("==================Merchant id is not loaded ==================", e);
        }
	}
	
	//
	//	InitializingBean
	//
	public void afterPropertiesSet() throws Exception {
		log.debug("initializing " + this.getClass().getName());
        Authenticator.setDefault(new PaymetricAuthenticator());
        init();
	}

	//
	//	DisposableBean
	//
	public void destroy() throws Exception {
		log.debug("destroying " + this.getClass().getName());
	}

	
}
