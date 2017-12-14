package hmh.rs.services;

import hmh.rs.pojo.Address;
import hmh.rs.pojo.CreditCard;
import hmh.rs.pojo.ErrorException;
import hmh.rs.pojo.OrderSimulateRequest;
import hmh.rs.pojo.OrderSimulateResponse;
import hmh.rs.pojo.OrderSubmitRequest;
import hmh.rs.pojo.OrderSubmitResponse;
import hmh.rs.pojo.SaleLineItem;
import hmh.rs.pojo.SubscriptionTerm;
import hmh.util.Transaction_Constants;
import hmh.ws.services.OrderImpl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.GregorianCalendar;
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
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hmco.eai.ots.eskertransaction.EskerTransactionRequest;
import com.hmco.eai.ots.eskertransaction.EskerTransactionResult;
import com.hmco.eai.ots.order.FindBasisOrderRequest;
import com.hmco.eai.ots.order.FindBasisOrderResponse;
import com.hmco.eai.ots.order.FindUnsubmittedOrdersRequest;
import com.hmco.eai.ots.order.FindUnsubmittedOrdersResponse;
import com.hmco.eai.ots.order.SubmitOrderRequest;
import com.hmco.eai.ots.order.SubmitOrderResponse;
import com.hmco.eai.ots.order.SubmitSaleRequest;
import com.hmco.eai.ots.order.SubmitSaleRequest2;
import com.hmco.eai.ots.order.SubmitSaleResponse;
import com.hmco.eai.ots.order.SubmitSaleResponse2;
import com.hmco.eai.ots.order.SubmitSampleRequest;
import com.hmco.eai.ots.order.SubmitSampleResponse;
import com.hmco.eai.tibco.enterprisewebservices.EaiException;
import com.hmco.eai.tibco.enterprisewebservices.OrderException;


@Path("/order")
public class OrderREST {

	protected final transient Logger log = LoggerFactory.getLogger(getClass());
	
	private OrderImpl impl;

	public void setImpl(OrderImpl impl) {
		this.impl = impl;
	}

	@GET
	@Path("/findUnSubmittedOrder")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public FindUnsubmittedOrdersResponse findUnSubmittedOrder(
			@QueryParam("division") String division,
			@QueryParam("endDate") String endDate,
			@QueryParam("matId") String matId,
			@QueryParam("poNo") String poNo,
			@QueryParam("sapCustNo") String sapCustNo,
			@QueryParam("startDate") String startDate,
			@QueryParam("zipCode") String zipCode) {
		
		FindUnsubmittedOrdersRequest rqst = new FindUnsubmittedOrdersRequest();
		rqst.setDivision(division);
		rqst.setEndDate(endDate);
		rqst.setMaterialID(matId);
		rqst.setPoNumber(poNo);
		rqst.setSapCustomerNo(sapCustNo);
		rqst.setStartDate(startDate);
		rqst.setZipCode(zipCode);
		
		try {
			return impl.findUnsubmittedOrder(rqst);
		} catch (com.hmco.eai.tibco.enterprisewebservices.EaiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			Response r = Response
					.status(404)
					.header("Order-Detail",
							"No transaction with customer-id " + division + Transaction_Constants.COMMA_SEPERATOR +
							endDate + Transaction_Constants.COMMA_SEPERATOR + matId + Transaction_Constants.COMMA_SEPERATOR +
							poNo + Transaction_Constants.COMMA_SEPERATOR + sapCustNo + Transaction_Constants.COMMA_SEPERATOR +
							startDate + Transaction_Constants.COMMA_SEPERATOR + zipCode
									+ " is available").entity(e).build();
			throw new WebApplicationException(r);
		}
	}
	
	@GET
	@Path("/findSfdcBasisOrder")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public FindBasisOrderResponse findSfdcBasisOrder(
			@QueryParam("division") String entryDivision,
			@QueryParam("entryYear") Integer entryYear,
			@QueryParam("pId") String pId,
			@QueryParam("sfdcOrderNumber") String sfdcOrderNo) {
		
		FindBasisOrderRequest rqst = new FindBasisOrderRequest();
		rqst.setEntryDivision(entryDivision);
		rqst.setEntryYear(entryYear);
		rqst.setPid(pId);
		rqst.setSfdcOrderNumber(sfdcOrderNo);
		
		try {
			return impl.findSfdcBasisOrder(rqst);
		} catch (com.hmco.eai.tibco.enterprisewebservices.EaiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			Response r = Response
					.status(404)
					.header("Order-Detail",
							"No transaction with customer-id " + entryDivision + Transaction_Constants.COMMA_SEPERATOR +
							entryYear + Transaction_Constants.COMMA_SEPERATOR + 
							pId + Transaction_Constants.COMMA_SEPERATOR + sfdcOrderNo 
									+ " is available").entity(e).build();
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
	@Path("/submitSale")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public SubmitSaleResponse submitSale(SubmitSaleRequest submitSaleRequest) {
		try {
			return impl.submitSale(submitSaleRequest);
		} catch (OrderException e) {
			log.error(e.getMessage(), e);
			Response r = Response
					.status(500)
					.header("submitSale",
							e.getMessage()).entity(e).build();
			throw new WebApplicationException(r);
		}	
	}
	
	@POST
	@Path("/submitSaleEx")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public SubmitSaleResponse2 submitSaleEx(SubmitSaleRequest2 submitSaleRequest) {
		try {
			return impl.submitSaleEx(submitSaleRequest);
		} catch (OrderException e) {
			log.error(e.getMessage(), e);
			Response r = Response
					.status(500)
					.header("submitSaleEx",
							e.getMessage()).entity(e).build();
			throw new WebApplicationException(r);
		}	
	}
	
	@POST
	@Path("/submitSample")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public SubmitSampleResponse submitSample(
			SubmitSampleRequest submitSampleRequest) {
		try {
			return impl.submitSample(submitSampleRequest);
		} catch (OrderException e) {
			log.error(e.getMessage(), e);
			Response r = Response
					.status(500)
					.header("submitSample",
							e.getMessage()).entity(e).build();
			throw new WebApplicationException(r);
		}	
	}
	
	@POST
	@Path("/findUnsubmittedOrder")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public FindUnsubmittedOrdersResponse findUnsubmittedOrder(
			FindUnsubmittedOrdersRequest findUnsubmittedOrderRequest) {
		try {
			return impl.findUnsubmittedOrder(findUnsubmittedOrderRequest);
		} catch (EaiException e) {
			log.error(e.getMessage(), e);
			Response r = Response
					.status(500)
					.header("findUnsubmittedOrder",
							e.getMessage()).entity(e).build();
			throw new WebApplicationException(r);
		}	
	}
	
	@POST
	@Path("/findSfdcBasisOrder")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public FindBasisOrderResponse findSfdcBasisOrder(
			FindBasisOrderRequest rqst) {
		try {
			return impl.findSfdcBasisOrder(rqst);
		} catch (EaiException e) {
			log.error(e.getMessage(), e);
			Response r = Response
					.status(500)
					.header("findSfdcBasisOrder",
							e.getMessage()).entity(e).build();
			throw new WebApplicationException(r);
		}	
	}
	
	@POST
	@Path("/submitSfdcOrder")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public SubmitOrderResponse submitSfdcOrder(
			SubmitOrderRequest rqst) {
		try {
			return impl.submitSfdcOrder(rqst);
		} catch (EaiException e) {
			log.error(e.getMessage(), e);
			Response r = Response
					.status(500)
					.header("submitSfdcOrder",
							e.getMessage()).entity(e).build();
			throw new WebApplicationException(r);
		}	
	}
	
	@POST
	@Path("/eskerTransactionOperation")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public EskerTransactionResult eskerTransactionOperation(
			EskerTransactionRequest rqst) {
		try {
			return impl.eskerTransactionOperation(rqst);
		} catch (EaiException e) {
			log.error(e.getMessage(), e);
			Response r = Response
					.status(500)
					.header("eskerTransactionOperation",
							e.getMessage()).entity(e).build();
			throw new WebApplicationException(r);
		}	
	}
	
	@POST
	@Path("/orderSimulate")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public OrderSimulateResponse orderSimulate(
			OrderSimulateRequest req) 
	{
		log.info("ordersimulate begins");
		OrderSimulateResponse response = null;
		try {
			response =  impl.orderSimulate(req);
		} catch (ErrorException e) {
			log.info("ErrorException in ordersimulate");
		} catch (Exception e){
			log.error(e.getMessage(), e);
			Response r = Response
					.status(500)
					.header("orderSimulateOperation",
							e.getMessage()).entity(e).build();
			throw new WebApplicationException(r);
		}
		log.info("ordersimulate ends");
		return response;
	}
	
	@GET
	@Path("/os")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public OrderSubmitRequest os(
			) 
	{
		log.info("begins");
		OrderSubmitRequest request = new OrderSubmitRequest();
		
		return constructJsonInput(request);
	}
	
	private OrderSubmitRequest constructJsonInput(OrderSubmitRequest request) {
		request.setSoldToCustomerId("soldToId");
		request.setShipToCustomerId("shipToId");
		request.setBillToCustomerId("billToId");
		request.setPayerCustomerId("payerId");
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
		add.setZipcode("zipcode");
		
		request.setShipToAddress(add);
		request.setBillToAddress(add);
		request.setPayerAddress(add);
		request.setSoldToAddress(add);
		request.setEntryDivision("entryDivision");
		request.setShipmentMethod("shipmentMethod");
		request.setPoNumber("poNumber");
		request.setTransactionType("transactionType");
		request.setOrderSource("orderSource");
		request.setCouponCode("couponCode");
		request.setOverrideShipping("overrideShipping");
		
		List<SaleLineItem> sList = request.getSaleLineItemList();
		SaleLineItem item = new SaleLineItem();
		item.setFreeGoodsIndicator(true);
		item.setLineNo("10");
		item.setMaterialID("materialID");
		item.setNetPrice(new BigDecimal("10.25"));
		item.setOverrideShipping("overrideShipping");
		item.setOverrideItemPrice(new BigDecimal("10.25"));
		item.setQuantity(10L);
		SubscriptionTerm term = new SubscriptionTerm();
		term.setDuration(1L);
		term.setStartDate(null);
		term.setUnit("unit");
		
		item.setSubscriptionTerm(term);
		sList.add(item);
		sList.add(item);
		
		CreditCard cc = new CreditCard();
		cc.setCardType("type");
		cc.setCcName("name");
		cc.setCvv("cvv");
		GregorianCalendar gregory = new GregorianCalendar();
		gregory.setTime(new Date());

		XMLGregorianCalendar calendar = null;
		try {
			calendar = DatatypeFactory.newInstance()
			        .newXMLGregorianCalendar(
			            gregory);
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cc.setExpDate(calendar);
		cc.setNumber("number");
		
		request.setCreditCard(cc);
		return request;
	}

	@POST
	@Path("/orderSubmit")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public OrderSubmitResponse orderSubmit(
			OrderSubmitRequest req) 
	{
		log.info("orderSubmit begins");
		OrderSubmitResponse response = null;
		try {
			response =  impl.orderSubmit(req);
		} catch (ErrorException e) {
			log.info("ErrorException in orderSubmit");
		} catch (Exception e){
			log.error(e.getMessage(), e);
			Response r = Response
					.status(500)
					.header("orderSubmitOperation",
							e.getMessage()).entity(e).build();
			throw new WebApplicationException(r);
		}
		log.info("orderSubmit ends");
		return response;
	}
	
}
