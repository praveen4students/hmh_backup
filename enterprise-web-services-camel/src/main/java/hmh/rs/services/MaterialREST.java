package hmh.rs.services;

import hmh.rs.pojo.Error;
import hmh.rs.pojo.ErrorException;
import hmh.rs.pojo.Material;
import hmh.rs.pojo.MaterialRequest;
import hmh.rs.pojo.InventoryItemResponse;
import hmh.rs.pojo.MateriaPriceRequest;
import hmh.rs.pojo.MaterialResponse;
import hmh.util.EnterpriseConstants;
import hmh.ws.services.MaterialImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.camel.language.Constant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hmco.eai.ots.material.GetMaterialDetailRequest;
import com.hmco.eai.ots.material.MaterialDetailList;
import com.hmco.eai.ots.material.MaterialKeyList;
import com.hmco.eai.ots.material.MaterialSubstitutionList;
import com.hmco.eai.ots.material.getatp.GETATPREQUEST;
import com.hmco.eai.ots.material.getatp.GETATPRESPONSE;
import com.hmco.eai.tibco.enterprisewebservices.GetMaterialATPException;
import com.hmco.eai.tibco.enterprisewebservices.MaterialException;
import com.ibm.wsdl.Constants;



@Path("/material")
public class MaterialREST {

protected final transient Logger log = LoggerFactory.getLogger(getClass());
	
	private MaterialImpl impl;

	public void setImpl(MaterialImpl impl) {
		this.impl = impl;
	}
	
	@GET
	@Path("/getMaterialSubstitutions")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public MaterialSubstitutionList getMaterialSubstitutions(
			@QueryParam("materialId") List<String> materialId,
			@QueryParam("isbn") List<String> isbn) {
		MaterialKeyList materialKeyList = new MaterialKeyList();
		List<String> isbnList = materialKeyList.getIsbn();
		List<String> matIdList = materialKeyList.getMaterialID();
		for(String material : materialId) {
			matIdList.add(material);
		}
		for(String is : isbn) {
			isbnList.add(is);
		}
		try {
			return impl.getMaterialSubstitutions(materialKeyList);
		} catch (MaterialException e) {
			log.error(e.getMessage(), e);
			Response r = Response
					.status(500)
					.header("getMaterialSubstitutions",
							e.getMessage()).entity(e).build();
			throw new WebApplicationException(r);
		}	
	}

	
	//@GET
	@POST
	@Path("/getMaterialAvailability")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public MaterialResponse getMaterialAvailability(
			List<Material> request) {
			
		MaterialResponse response = new MaterialResponse();
		List<Material> outputList = response.getMaterialList();
		List<Error> errorList = null;
		
		List<Material> materialList = request; //.getMaterialList();
		for(Material it : materialList) {
			try {
				Long quantity = impl.getMaterialAvailability(it);
				it.setQuantity(quantity);
				outputList.add(it);
			}
			catch(ErrorException ex) {
				if (errorList == null) errorList = response.getErrorList();
				hmh.rs.pojo.Error e = ex.getError();
				e.setItemKey(it.getMaterialId());
				//eaiEx.getErrorList().getError().add(e);
				errorList.add(e);
			}
		}
		
		return response;

/*		
		} catch (MaterialException e) {
			log.error(e.getMessage(), e);
			Response r = Response.status(500)
					.header("getMaterialAvailability", e.getMessage())
					.entity(e).build();
			throw new WebApplicationException(r);
		}
*/
	}

	
	@POST
	@Path("/getNetPrice")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public InventoryItemResponse getNetPrice(
			MateriaPriceRequest request) {
			
		InventoryItemResponse response = new InventoryItemResponse();
		List<Material> outputList = response.getInventoryItemList();
		hmh.rs.pojo.EaiException eaiEx = null;
		List<Material> inputList = request.getInventoryItemList();
		double listPrice = 500.25;
		double NetPrice = 800.25;
		for(Material it : inputList) {
				it.setListPrice(listPrice+=200);
				it.setNetPrice(NetPrice+=200);
				outputList.add(it);
		}
		
		hmh.rs.pojo.Error r = new hmh.rs.pojo.Error(EnterpriseConstants.ERROR_CATEGORY_BUSINESS, "M110", "Message Unknown");
        throw new WebApplicationException(Response.status(Status.BAD_REQUEST)
        		.type("application/json").entity(r)
                .build());

        /*for(InventoryItem it : inputList) {
			try {
//				Long quantity = impl.getMaterialAvailability(it);
				it.setListPrice(listPrice+=200);
				it.setNetPrice(NetPrice+=200);
				outputList.add(it);
			}
			catch(ErrorException ex) {
				if (eaiEx == null) {
					eaiEx = new hmh.rs.pojo.EaiException();
					//eaiEx.setErrorList(new hmh.rs.pojo.ErrorList());
				}
				hmh.rs.pojo.Error e = ex.getError();
				//e.setErrorCategory(it.getMaterialId());
				e.setItemKey(it.getMaterialId());
				//eaiEx.getErrorList().getError().add(e);
				eaiEx.getErrorList().add(e);
			}
		}*/
//		response.setMaterialException(eaiEx);
		
		//return response;

	}

	
	@GET
	@Path("/getMaterialRestriction")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public InventoryItemResponse getMaterialRestriction(
			@QueryParam("materialId") List<String> materialId,
			@QueryParam("soldToCustomerId") String soldToCustomerId,
			@QueryParam("shipToCustomerId") String shipToCustomerId,
			@QueryParam("entryDivision") String division,			
			@QueryParam("orderType") String orderType,
			@QueryParam("orderSource") String orderSource,
			@QueryParam("shipToState") String shipToState,
			@QueryParam("shipToCountry") String shipToCountry,
			@QueryParam("itemCategory") String itemCategory) {
			
		InventoryItemResponse response = new InventoryItemResponse();
		List<Material> outputList = response.getInventoryItemList();
		hmh.rs.pojo.EaiException eaiEx = null;
		Random rn = new Random();
		for(String matId : materialId) {
				Material item = new Material();
				item.setMaterialId(matId);
				item.setRestrictionFlag(rn.nextBoolean());
				outputList.add(item);
		}
		
		return response;
	}

	
	//------------------------------------------------------------------
	//
	//	Methods with "traditional" signature (as in webservices) 
	//	through POST
	//
	//------------------------------------------------------------------
	
	
	@POST
	@Path("/getMaterialDetail")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public MaterialDetailList getMaterialDetail(
			GetMaterialDetailRequest getMaterialDetailRequest) {
		try {
			return impl.getMaterialDetail(getMaterialDetailRequest);
		} catch (MaterialException e) {
			log.error(e.getMessage(), e);
			Response r = Response
					.status(500)
					.header("getMaterialDetail",
							e.getMessage()).entity(e).build();
			throw new WebApplicationException(r);
		}	
	}
	
	@POST
	@Path("/getMaterialSubstitutions")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public MaterialSubstitutionList getMaterialSubstitutions(
			MaterialKeyList materialKeyList) {
		try {
			return impl.getMaterialSubstitutions(materialKeyList);
		} catch (MaterialException e) {
			log.error(e.getMessage(), e);
			Response r = Response
					.status(500)
					.header("getMaterialSubstitutions",
							e.getMessage()).entity(e).build();
			throw new WebApplicationException(r);
		}	
	}
	
	@POST
	@Path("/getMaterialDetailEx")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public com.hmco.eai.ots.materialnew.MaterialDetailList getMaterialDetailEx(
			com.hmco.eai.ots.materialnew.GetMaterialDetailRequest getMaterialDetailRequest) {
		try {
			return impl.getMaterialDetailEx(getMaterialDetailRequest);
		} catch (MaterialException e) {
			log.error(e.getMessage(), e);
			Response r = Response
					.status(500)
					.header("getMaterialDetailEx",
							e.getMessage()).entity(e).build();
			throw new WebApplicationException(r);
		}	
	}
	
	@POST
	@Path("/getMaterialATP")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public GETATPRESPONSE getMaterialATP(GETATPREQUEST getMaterialATP) {
		try {
			return impl.getMaterialATP(getMaterialATP);
		} catch (GetMaterialATPException e) {
			log.error(e.getMessage(), e);
			Response r = Response
					.status(500)
					.header("getMaterialATP",
							e.getMessage()).entity(e).build();
			throw new WebApplicationException(r);
		}	
	}
	
	
	//
	//	!!! Test !!!
	//
	@GET
	@Path("/echo")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	//@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public 
		//MaterialRequest
		//Material[]
		List<Material>
		echo(
			//MateriaPriceRequest request
			) {
		/*
		MateriaPriceRequest req = new MateriaPriceRequest();
		req.setSellingDivision("div");
		req.setShipToCountry("shipto");
		req.setShipToCustomerId("custid");
		req.setShipToState("state");
		req.setSoldToCustomerId("soldto");
		*/
		List<Material> inputList = new ArrayList<Material>();
		Material i = new Material();
		i.setListPrice((double) 1000);
		i.setMaterialId("matid1");
		inputList.add(i);

		i = new Material();
		i.setListPrice((double) 1010);
		i.setMaterialId("matid2");
		inputList.add(i);

		//req.setInventoryItemList(inputList);
		
		//return req;
		//return new MaterialRequest(inputList);
		//return inputList.toArray(new Material[0]);
		return inputList;
	}	
	
}
