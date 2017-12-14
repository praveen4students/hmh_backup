package hmh.rs.services;

import hmh.ws.services.TransactionImpl;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hmco.eai.ots.transaction.InvoiceDetailsList;
import com.hmco.eai.ots.transaction.RetrieveInvoicePDFRequest;
import com.hmco.eai.ots.transaction.RetrieveInvoicePDFResponse;
import com.hmco.eai.ots.transaction.ShipmentDetailsList;
import com.hmco.eai.ots.transaction.TransactionIDList;
import com.hmco.eai.ots.transaction.TransactionList;
import com.hmco.eai.tibco.enterprisewebservices.TransactionException;


@Path("/transaction")
public class TransactionREST {
	
	protected final transient Logger log = LoggerFactory.getLogger(getClass());

	private TransactionImpl impl;
	
	// for transactionImpl property injection
	public void setImpl(TransactionImpl transactionImpl) {
		this.impl = transactionImpl;
	}

	
	@GET
	@Path("/getTransactionDetail")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public TransactionList getTransactionDetail(
				@QueryParam("id") List<String> idList) {
		TransactionIDList tidList = new TransactionIDList();
		List<String> list = tidList.getTransactionID();
		for (String id : idList) {
			list.add(id);
		}
		try {
			return impl.getTransactionDetail(tidList);
		} catch (TransactionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			Response r = Response
					.status(404)
					.header("Transaction-Detail",
							"No transaction with id " + tidList.toString() + " is available")
					.entity(e).build();
			throw new WebApplicationException(r);

		}
	}
	
	@GET
	@Path("/getTransactionDetailEx")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public com.hmco.eai.ots.transactionnew.TransactionList getTransactionDetailEx(
				@QueryParam("id") List<String> idList) {
		com.hmco.eai.ots.transactionnew.TransactionIDList tidList = new com.hmco.eai.ots.transactionnew.TransactionIDList();
		List<String> list = tidList.getTransactionID();
		for (String id : idList) {
			list.add(id);
		}
		try {
			return impl.getTransactionDetailEx(tidList);
		} catch (TransactionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			Response r = Response
					.status(404)
					.header("Transaction-Detail",
							"No transaction with id " + tidList.toString() + " is available")
					.entity(e).build();
			throw new WebApplicationException(r);

		}
	}
	
	
	@GET
	@Path("/getShipments")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public ShipmentDetailsList getShipments(
				@QueryParam("id") List<String> idList) {
		TransactionIDList tidList = new TransactionIDList();
		List<String> list = tidList.getTransactionID();
		for (String id : idList) {
			list.add(id);
		}
		try {
			return impl.getShipments(tidList);
		} catch (TransactionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			Response r = Response
					.status(404)
					.header("Transaction-Detail",
							"No transaction with id " + tidList.toString() + " is available")
					.entity(e).build();
			throw new WebApplicationException(r);

		}
	}

	@GET
	@Path("/getInvoices")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public InvoiceDetailsList getInvoices(
				@QueryParam("id") List<String> idList) {
		TransactionIDList tidList = new TransactionIDList();
		List<String> list = tidList.getTransactionID();
		for (String id : idList) {
			list.add(id);
		}
		try {
			return impl.getInvoices(tidList);
		} catch (TransactionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			Response r = Response
					.status(404)
					.header("Transaction-Detail",
							"No transaction with id " + tidList.toString() + " is available")
					.entity(e).build();
			throw new WebApplicationException(r);

		}
	}
	
	@GET
	@Path("/retrieveInvoicePDF")
	@Produces("application/pdf")
	public byte[] retrieveInvoicePDF(
			@QueryParam("invoiceId") String invoiceId,
			@QueryParam("invoiceRequestType") String invoiceRequestType,
			@QueryParam("emailSubject") String emailSubject,
			@QueryParam("emailBody") String emailBody,
			@QueryParam("emailTo") List<String> emailTo,
			@QueryParam("emailCC") List<String> emailCC){
		
		RetrieveInvoicePDFRequest req = new RetrieveInvoicePDFRequest();
		req.setEmailBody(emailBody);
		req.setEmailSubject(emailSubject);
		req.setInvoiceId(invoiceId);
		req.setInvoiceRequestType(invoiceRequestType);
		
		List<String> emailCCList = req.getEmailCc();
		List<String> emailToList = req.getEmailTo();
		
		for(String to : emailTo) {
			emailToList.add(to);
		}
		
		for(String cc : emailCC) {
			emailCCList.add(cc);
		}
		
		try {
			return impl.retrieveInvoicePDFBinary(req);
		} catch (TransactionException e) {
			log.error(e.getMessage(), e);
			Response r = Response
					.status(500)
					.header("retrieveInvoicePDF",
							e.getMessage()).entity(e).build();
			throw new WebApplicationException(r);
		}	
	}
	
	//------------------------------------------------------------------
	//
	//	Methods with "traditional" signature (as in webservices) 
	//	through POST
	//
	//------------------------------------------------------------------
	
	
	@POST
	@Path("/getTransactionDetail")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public TransactionList getTransactionDetail(
			TransactionIDList transactionIDList) {
		try {
			return impl.getTransactionDetail(transactionIDList);
		} catch (TransactionException e) {
			log.error(e.getMessage(), e);
			Response r = Response
					.status(500)
					.header("getTransactionDetail",
							e.getMessage()).entity(e).build();
			throw new WebApplicationException(r);
		}	
	}
	
	@POST
	@Path("/findTransactions")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public TransactionList findTransactions(
			com.hmco.eai.ots.transaction.TransactionSearchCriteria transactionSearchCriteria){
		try {
			return impl.findTransactions(transactionSearchCriteria);
		} catch (TransactionException e) {
			log.error(e.getMessage(), e);
			Response r = Response
					.status(500)
					.header("findTransactions",
							e.getMessage()).entity(e).build();
			throw new WebApplicationException(r);
		}	
	}
	
	@POST
	@Path("/retrieveInvoicePDF")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public RetrieveInvoicePDFResponse retrieveInvoicePDF(
			RetrieveInvoicePDFRequest req){
		try {
			return impl.retrieveInvoicePDF(req);
		} catch (TransactionException e) {
			log.error(e.getMessage(), e);
			Response r = Response
					.status(500)
					.header("retrieveInvoicePDF",
							e.getMessage()).entity(e).build();
			throw new WebApplicationException(r);
		}	
	}
	
	@POST
	@Path("/getTransactionDetailEx")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public com.hmco.eai.ots.transactionnew.TransactionList getTransactionDetailEx(
			com.hmco.eai.ots.transactionnew.TransactionIDList transactionIDList) {
		try {
			return impl.getTransactionDetailEx(transactionIDList);
		} catch (TransactionException e) {
			log.error(e.getMessage(), e);
			Response r = Response
					.status(500)
					.header("getTransactionDetailEx",
							e.getMessage()).entity(e).build();
			throw new WebApplicationException(r);
		}	
	}
	
	@POST
	@Path("/getInvoices")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public InvoiceDetailsList getInvoices(
			TransactionIDList transactionIDListGetInvoices) {
		try {
			return impl.getInvoices(transactionIDListGetInvoices);
		} catch (TransactionException e) {
			log.error(e.getMessage(), e);
			Response r = Response
					.status(500)
					.header("getInvoices",
							e.getMessage()).entity(e).build();
			throw new WebApplicationException(r);
		}	
	}
	
	@POST
	@Path("/getShipments")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public ShipmentDetailsList getShipments(TransactionIDList transactionIDList) {
		try {
			return impl.getShipments(transactionIDList);
		} catch (TransactionException e) {
			log.error(e.getMessage(), e);
			Response r = Response
					.status(500)
					.header("getShipments",
							e.getMessage()).entity(e).build();
			throw new WebApplicationException(r);
		}	
	}

}
