package hmh.rs.services;

import hmh.rs.pojo.Address;
import hmh.rs.pojo.CreateCustomerRequest;
import hmh.rs.pojo.CustomerResponse;
import hmh.rs.pojo.Error;
import hmh.rs.pojo.ErrorException;
import hmh.rs.pojo.OrderSimulateRequest;
import hmh.rs.pojo.UpdateCustomerRequest;
import hmh.ws.services.CustomerImpl;

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

import com.hmco.eai.ots.customer.AccountStatementPDFRequest;
import com.hmco.eai.ots.customer.AccountStatementPDFResponse;
import com.hmco.eai.ots.customer.CreateEtailCustomerRequest;
import com.hmco.eai.ots.customer.CreateEtailCustomerResponse;
import com.hmco.eai.ots.customer.CreateSundryCustomerRequest;
import com.hmco.eai.ots.customer.CustomerDetailList;
import com.hmco.eai.ots.customer.CustomerIDList;
import com.hmco.eai.ots.customer.CustomerKey;
import com.hmco.eai.ots.customer.CustomerKeyList;
import com.hmco.eai.ots.customer.CustomerRelationshipList;
import com.hmco.eai.ots.customer.CustomerSearchCriteria;
import com.hmco.eai.ots.customer.FindSFDCCustomerRequest;
import com.hmco.eai.ots.customer.GetCustomerRelationshipsRequest;
import com.hmco.eai.ots.customer.RelationshipTypeList;
import com.hmco.eai.ots.customer.SFDCCustomerList;
import com.hmco.eai.ots.customer.SFDCRepList;
import com.hmco.eai.ots.customer.SfdcCustomerIdList;
import com.hmco.eai.ots.packinglist.PackingListRequest;
import com.hmco.eai.ots.packinglist.PackingListResponse;
import com.hmco.eai.tibco.enterprisewebservices.CustomerException;
import com.hmco.eai.tibco.enterprisewebservices.EaiException;


@Path("/customer")
public class CustomerREST {

	protected final transient Logger log = LoggerFactory.getLogger(getClass());

	private CustomerImpl impl;	

	public void setImpl(CustomerImpl customerImpl) {
		this.impl = customerImpl;
	}

	
	@GET
	@Path("/getCustomerDetail")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public CustomerDetailList getCustomerDetail(
			@QueryParam("cid") String cid,
			@QueryParam("san") String san,
			@QueryParam("mdrPID") String mdrPID) 
	{		
		CustomerKeyList idList = new CustomerKeyList();
		List<CustomerKey> list = idList.getCustomerKey();
		CustomerKey key = new CustomerKey();
		key.setCustomerID(cid);
		key.setSan(san);
		key.setMdrPID(mdrPID);
		list.add(key);
		try {
			return impl.getCustomerDetail(idList);
		} catch (CustomerException e) {
			log.error(e.getMessage(), e);
			Response r = Response
					.status(500)
					.header("Customer-Detail",
							"No transaction with customer-id " + cid
									+ " is available").entity(e).build();
			throw new WebApplicationException(r);
		}
	}
	

	@GET
	@Path("/findSfdcCustomer")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public SFDCCustomerList findSFDCCustomer(@QueryParam("mdrId") String mdrId,
			@QueryParam("sapCustId") String sapCustId,
			@QueryParam("zipCode") String zipCode) {
		
		FindSFDCCustomerRequest findSFDCCustomerRequest = new FindSFDCCustomerRequest();
		findSFDCCustomerRequest.setMdrPid(mdrId);
		findSFDCCustomerRequest.setSapCustomerId(sapCustId);
		findSFDCCustomerRequest.setZipCode(zipCode);
		try {
			return impl.findSFDCCustomer(findSFDCCustomerRequest);
		} catch (com.hmco.eai.tibco.enterprisewebservices.EaiException e) {
			log.error(e.getMessage(), e);
			Response r = Response
					.status(500)
					.header("Customer-Detail",
							"No transaction with customer-id " + mdrId + sapCustId + zipCode 
									+ " is available").entity(e).build();
			throw new WebApplicationException(r);

		}
	}
	
	@GET
	@Path("/getSFDRep")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public SFDCRepList getSFDCRep(@QueryParam("id") List<String> cusList) {
		
		SfdcCustomerIdList idList = new SfdcCustomerIdList();
		List<String> list = idList.getSfdcCustomerId();
		for (String id : cusList) {
			list.add(id);
		}
		try {
			return impl.getSFDCRep(idList);
		} catch (com.hmco.eai.tibco.enterprisewebservices.EaiException e) {
			log.error(e.getMessage(), e);
			Response r = Response
					.status(500)
					.header("Customer-Detail",
							"No transaction with customer-id " + cusList.toString() 
									+ " is available").entity(e).build();
			throw new WebApplicationException(r);
		}
	}
	
	@GET
	@Path("/findEtailCustomer")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public CustomerIDList findEtailCustomer(
			@QueryParam("name") String name,
			@QueryParam("address") String address,
			@QueryParam("zipCode") String zipCode,
			@QueryParam("division") String division)
	{
		CustomerSearchCriteria req = new CustomerSearchCriteria();
		req.setAddress(address);
		req.setDivision(division);
		req.setName(name);
		req.setZipCode(zipCode);
		try {
			return impl.findEtailCustomer(req);
		} catch (CustomerException e) {
			log.error(e.getMessage(), e);
			Response r = Response
					.status(500)
					.header("findEtailCustomer",
							e.getMessage()).entity(e).build();
			throw new WebApplicationException(r);
		}		
	}
	
	@GET
	@Path("/accountStatementPDF")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public AccountStatementPDFResponse accountStatementPDF(
			@QueryParam("billToCustomer") String billToCustomer,
			@QueryParam("emailSubject") String emailSubject,
			@QueryParam("emailTo") List<String> emailTo,
			@QueryParam("emailCC") List<String> emailCC,
			@QueryParam("emailBody") List<String> emailBody)
	{
		AccountStatementPDFRequest req = new AccountStatementPDFRequest();
		req.setBillToCustomer(billToCustomer);
		req.setEmailSubject(emailSubject);
		List<String> emailToList = req.getEmailTo();
		List<String> emailCCList = req.getEmailCc();
		List<String> emailBodyList = req.getEmailBody();
		
		for(String to : emailTo) {
			emailToList.add(to);
		}
		for(String cc : emailCC) {
			emailCCList.add(cc);
		}
		for(String body : emailBody) {
			emailBodyList.add(body);
		}
		
		try {
			return impl.accountStatementPDF(req);
		} catch (CustomerException e) {
			log.error(e.getMessage(), e);
			Response r = Response
					.status(500)
					.header("accountStatementPDF",
							e.getMessage()).entity(e).build();
			throw new WebApplicationException(r);
		}		
	}
	

	@GET
	@Path("/getCustomerRelationships")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public CustomerRelationshipList getCustomerRelationships(
			@QueryParam("customerId") String customerId,
			@QueryParam("division") String division,
			@QueryParam("relationshipType") List<String> relationshipType)
	{
		GetCustomerRelationshipsRequest req = new GetCustomerRelationshipsRequest();
		req.setCustomerID(customerId);
		req.setDivision(division);
		RelationshipTypeList relationshipTypeList = new RelationshipTypeList();
		List<String> relTypeList = relationshipTypeList.getRelationshipType();
		
		for(String relType : relationshipType) {
			relTypeList.add(relType);
		}
		
		req.setRelationshipTypeList(relationshipTypeList);
		
		try {
			return impl.getCustomerRelationships(req);
		} catch (CustomerException e) {
			log.error(e.getMessage(), e);
			Response r = Response
					.status(500)
					.header("getCustomerRelationships",
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
	@Path("/createEtailCustomer")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public CreateEtailCustomerResponse createEtailCustomer(
			CreateEtailCustomerRequest req) 
	{
		try {
			return impl.createEtailCustomer(req);
		} catch (CustomerException e) {
			log.error(e.getMessage(), e);
			Response r = Response
					.status(500)
					.header("createEtailCustomer",
							e.getMessage()).entity(e).build();
			throw new WebApplicationException(r);
		}		
	}
	
	@POST
	@Path("/createSundryCustomer")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public String createSundryCustomer(
	        CreateSundryCustomerRequest req) 
	{
		try {
			return impl.createSundryCustomer(req);
		} catch (CustomerException e) {
			log.error(e.getMessage(), e);
			Response r = Response
					.status(500)
					.header("createSundryCustomer",
							e.getMessage()).entity(e).build();
			throw new WebApplicationException(r);
		}				
	}


	@POST
	@Path("/getCustomerDetailEx")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public com.hmco.eai.ots.customernew.CustomerDetailList getCustomerDetailEx(
			com.hmco.eai.ots.customernew.CustomerKeyList req)
	{
		try {
			return impl.getCustomerDetailEx(req);
		} catch (CustomerException e) {
			log.error(e.getMessage(), e);
			Response r = Response
					.status(500)
					.header("getCustomerDetailEx",
							e.getMessage()).entity(e).build();
			throw new WebApplicationException(r);
		}		
	}


	@POST
	@Path("/packingListOperation")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public PackingListResponse packingListOperation(
			PackingListRequest req) 
	{
		try {
			return impl.packingListOperation(req);
		} catch (EaiException e) {
			log.error(e.getMessage(), e);
			Response r = Response
					.status(500)
					.header("packingListOperation",
							e.getMessage()).entity(e).build();
			throw new WebApplicationException(r);
		}		
	}


	@POST
	@Path("/findSFDCCustomer")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public SFDCCustomerList findSFDCCustomer(
			FindSFDCCustomerRequest req)
	{
		try {
			return impl.findSFDCCustomer(req);
		} catch (EaiException e) {
			log.error(e.getMessage(), e);
			Response r = Response
					.status(500)
					.header("findSFDCCustomer",
							e.getMessage()).entity(e).build();
			throw new WebApplicationException(r);
		}		
	}


	@POST
	@Path("/getSFDCRep")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public SFDCRepList getSFDCRep(SfdcCustomerIdList req)
	{
		try {
			return impl.getSFDCRep(req);
		} catch (EaiException e) {
			log.error(e.getMessage(), e);
			Response r = Response
					.status(500)
					.header("getSFDCRep",
							e.getMessage()).entity(e).build();
			throw new WebApplicationException(r);
		}		
	}


	@POST
	@Path("/getCustomerDetail")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public CustomerDetailList getCustomerDetail(
			CustomerKeyList req) 
	{
		try {
			return impl.getCustomerDetail(req);
		} catch (CustomerException e) {
			log.error(e.getMessage(), e);
			Response r = Response
					.status(500)
					.header("getCustomerDetail",
							e.getMessage()).entity(e).build();
			throw new WebApplicationException(r);
		}		
	}


	@POST
	@Path("/accountStatementPDF")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public AccountStatementPDFResponse accountStatementPDF(
			AccountStatementPDFRequest req)
	{
		try {
			return impl.accountStatementPDF(req);
		} catch (CustomerException e) {
			log.error(e.getMessage(), e);
			Response r = Response
					.status(500)
					.header("accountStatementPDF",
							e.getMessage()).entity(e).build();
			throw new WebApplicationException(r);
		}		
	}


	@POST
	@Path("/getCustomerRelationships")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public CustomerRelationshipList getCustomerRelationships(
			GetCustomerRelationshipsRequest req)
	{
		try {
			return impl.getCustomerRelationships(req);
		} catch (CustomerException e) {
			log.error(e.getMessage(), e);
			Response r = Response
					.status(500)
					.header("getCustomerRelationships",
							e.getMessage()).entity(e).build();
			throw new WebApplicationException(r);
		}		
	}


	@POST
	@Path("/findEtailCustomer")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public CustomerIDList findEtailCustomer(
			CustomerSearchCriteria req)
	{
		try {
			return impl.findEtailCustomer(req);
		} catch (CustomerException e) {
			log.error(e.getMessage(), e);
			Response r = Response
					.status(500)
					.header("findEtailCustomer",
							e.getMessage()).entity(e).build();
			throw new WebApplicationException(r);
		}		
	}
	
	@POST
	@Path("/createCustomer")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public CustomerResponse createCustomer(
			CreateCustomerRequest req) 
	{
		CustomerResponse response = null;
		List<Error> errorList = null;
		log.info("STORE ID :: " + req.getStoreId());
		log.info("WEB USER ID :: " + req.getWebUserId());
		log.info("ADDRESS :: " + req.getSoldtoAddress());
		log.info("ADDRESS :: " + req.getSoldtoAddress().getCustomerName());
		if(req.getSoldtoAddress() != null)
		log.info("CUSTOMER NAME :: " + req.getSoldtoAddress().getCustomerName());
		try {
			response =  impl.createCustomer(req);
		} catch (ErrorException e) {
			log.info("ErrorException in createCustomer");
		} catch (Exception e){
			log.error(e.getMessage(), e);
			Response r = Response
					.status(500)
					.header("createCustomerOperation",
							e.getMessage()).entity(e).build();
			throw new WebApplicationException(r);
		}	
		return response;
	}
	
	@GET
	@Path("/getCC")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public CreateCustomerRequest getCust(){
		CreateCustomerRequest req = new CreateCustomerRequest();
		req.setStoreId("storeId");
		req.setWebUserId("webUser");
		Address add = new Address();
		add.setCustomerName("ramesh");
		add.setAddressLine1("add1");
		add.setAddressLine2("add2");
		add.setAddressLine3("add3");
		add.setPoBox("pobox");
		add.setCity("cis");
		add.setState("state");
		add.setCountryCode("counrty");
		req.setSoldtoAddress(add);
		return req;
		
	}
	
	@POST
	@Path("/updateCustomer")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public CustomerResponse updateCustomer(
			UpdateCustomerRequest req) 
	{
		CustomerResponse response = null;
		try {
			response =  impl.updateCustomer(req);
		} catch (ErrorException e) {
			log.info("ErrorException in updateCustomer");
		} catch (Exception e){
			log.error(e.getMessage(), e);
			Response r = Response
					.status(500)
					.header("updateCustomerOperation",
							e.getMessage()).entity(e).build();
			throw new WebApplicationException(r);
		}	
		return response;
	}
	
	@GET
	@Path("/uc")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public UpdateCustomerRequest os() 
	{
		log.info("begins");
		UpdateCustomerRequest request = new UpdateCustomerRequest();
		request.setCustomerId("123");
		Address add = new Address();
		add.setAddressLine1("addressLine1");
		add.setAddressLine2("addressLine2");
		add.setAddressLine3("addressLine3");
		add.setCity("city");
		add.setCountryCode("countryCode");
		add.setCustomerName("customerName");
		add.setEmail("email");
		add.setPhone("phone");
		add.setPoBox("poBox");
		add.setState("state");
		add.setZipcode("zipcode");;
		request.setSoldtoAddress(add );
		return request;
	}
	
}
