package hmh.services.mail_services;

import java.net.URI;
import java.net.URISyntaxException;

import microsoft.exchange.webservices.data.ConflictResolutionMode;
import microsoft.exchange.webservices.data.EmailMessage;
import microsoft.exchange.webservices.data.EmailMessageSchema;
import microsoft.exchange.webservices.data.ExchangeCredentials;
import microsoft.exchange.webservices.data.ExchangeService;
import microsoft.exchange.webservices.data.ExchangeVersion;
import microsoft.exchange.webservices.data.FindItemsResults;
import microsoft.exchange.webservices.data.InternetMessageHeader;
import microsoft.exchange.webservices.data.InternetMessageHeaderCollection;
import microsoft.exchange.webservices.data.Item;
import microsoft.exchange.webservices.data.ItemView;
import microsoft.exchange.webservices.data.SearchFilter;
import microsoft.exchange.webservices.data.WebCredentials;
import microsoft.exchange.webservices.data.WellKnownFolderName;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;

public class MailProcessor implements Processor
{
	private static final Logger logger = Logger.getLogger(MailProcessor.class);
	
	private MailServicesRFCUtil rfcUtil;
    private boolean isOrderIdPresent;
    private String orderID;
    private ExchangeService service;
    private final String  SAP_HEADER_ORDERID = "SAP_ORDER_ID";

    @Override
	public void process(Exchange exchange) throws Exception 
	{
		logger.debug("Reading the Mail from the Inbox ");
	    
		ItemView view = new ItemView(50);
		FindItemsResults<Item> findResults;
		SearchFilter itemFilter = new SearchFilter.IsEqualTo(EmailMessageSchema.IsRead, false);

		do {
			findResults = service.findItems(WellKnownFolderName.Inbox, itemFilter, view);  
			for (Item item : findResults.getItems()) 
			{
				item.load();
				
				EmailMessage em = (EmailMessage) item;

			    //Reading Header
				isOrderIdPresent = isOrderIdPresentInHeader(item.getInternetMessageHeaders());
			    
				if(isOrderIdPresent)
			    {
			    	logger.debug("Making SAP RFC Call ");
//					rfcUtil.makeSAPCall(orderID,  "https://owa.hmhpub.com/OWA/"+em.getWebClientReadFormQueryString());
			    	rfcUtil.makeSAPCall("709642",  "https://owa.hmhpub.com/OWA/"+em.getWebClientReadFormQueryString());
					System.out.println("************"+"https://owa.hmhpub.com/OWA/"+em.getWebClientReadFormQueryString());
					logger.debug("Successfully Made SAP RFC Call ");
			    }
				
			    em.setIsRead(true);
			    em.update(ConflictResolutionMode.AlwaysOverwrite);
			}

			int i = view.getOffset();
			i += 50;
			view.setOffset(i);
		} while (findResults.isMoreAvailable());
	}
	
    public void setRfcUtil(MailServicesRFCUtil rfcUtil) {
		this.rfcUtil = rfcUtil;
	}

	public void init()
    {
		try 
		{
			service = new ExchangeService(ExchangeVersion.Exchange2010_SP2);
//			service.setTraceEnabled(true);
			ExchangeCredentials credentials = new WebCredentials("dyamappap","Sharadha^4636^");
			service.setCredentials(credentials);
			service.setUrl(new URI("https://owa.hmhpub.com/EWS/Exchange.asmx"));
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
	
	public void destroy()
	{
	}
	
	private boolean isOrderIdPresentInHeader(InternetMessageHeaderCollection headers)
	{
		return true;
		/*//Reading Header
	    for(InternetMessageHeader header : headers)
	    {
	    	logger.debug("Header Name: "+header.getName()+" Header Value: "+header.getValue() );
	    	
	    	if(header.getName().equalsIgnoreCase(SAP_HEADER_ORDERID)){
	    		orderID = header.getValue();
	    		break;
	    	}
	    }//End of for
	    
		return isOrderIdPresentInHeader(orderID);*/
	}
	
	private boolean isOrderIdPresentInHeader(String orderId)
	{
		if(orderId == null || orderId.equals("")){
    		return false;
    	}
    	
		try 
    	{
			Integer.parseInt(orderId);
			return true;
			
		} catch (NumberFormatException e) {
			return false;
		}
		
		//To Test : Keep as of Now. Need to be removed
		/*processor.setRFCcallRequired(true);
		processor.setOrderID("709642");
    	return false;*/
		
	}//End of isOrderIdNotPresent()
}//End of Class
