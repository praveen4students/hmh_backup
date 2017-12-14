package hmh.rs.services;

import hmh.sap.rfc.BapiMaterialGetAll_PortType;
import hmh.sap.rfc.Bapi_Material_Getall_Input;
import hmh.sap.rfc.Bapi_Material_Getall_Output;
import hmh.sap.rfc.Bapiret2Type;
import hmh.sap.rfc.GetCustomerDetail_PortType;
import hmh.sap.rfc.Z_PRODUCT_LIST_EXCLUSION_WRAP_PortType;
import hmh.sap.rfc.Z_Product_List_Exclusion_Wrap_Input;
import hmh.sap.rfc.Z_Product_List_Exclusion_Wrap_Output;
import hmh.sap.rfc.Z_Rfc_Get_Cust_Details_Input;
import hmh.sap.rfc.Z_Rfc_Get_Cust_Details_Output;
import hmh.sap.rfc.Z_VI_SL_GET_CONTRACT_PRICING_PortType;
import hmh.sap.rfc.Z_Vi_Sl_Get_Contract_Pricing_Input;
import hmh.sap.rfc.Z_Vi_Sl_Get_Contract_Pricing_Output;
import hmh.sap.rfc.Zbdcmsgcoll_RfcType;
import hmh.sap.rfc.ZcontprType;
import hmh.sap.rfc.Zlist_ExclusionType;
import hmh.sap.rfc.ZmatnrType;
import hmh.sap.rfc.ZrestrictionType;
import hmh.sap.rfc.ZvcustdetailsType;
import hmh.sap.rfc.ZvgetcustType;
import hmh.sap.rfc.util.ZcontprType_List;
import hmh.sap.rfc.wrapper.Bapi_Material_Getall_Output_Wrapper;
import hmh.sap.rfc.wrapper.Bapiret2Type_Wrapper;
import hmh.sap.rfc.wrapper.Zbdcmsgcoll_RfcType_Wrapper;
import hmh.sap.rfc.wrapper.ZcontprTypeList_Wrapper;
import hmh.sap.rfc.wrapper.ZcontprType_Wrapper;
import hmh.sap.rfc.wrapper.ZrestrictionTypeList_Wrapper;
import hmh.sap.rfc.wrapper.ZrestrictionType_Wrapper;
import hmh.sap.rfc.wrapper.ZvcustdetailsType_Wrapper;
import hmh.util.Transaction_Constants;

import java.util.GregorianCalendar;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.sap.aii.proxy.framework.core.ApplicationFaultException;
import com.sap.aii.proxy.framework.core.SystemFaultException;
import com.sap.mw.jco.JCO;


@Path("/sap")
public class SapREST implements InitializingBean, DisposableBean {
	
	private static final Logger logger = Logger.getLogger(SapREST.class);

		
	public static String ENDL = System.getProperty("line.separator");
	
	public static final String SAP_USERNAME = "tibco";
	
	public static final String SAP_PASSWORD = "t_one14";
	
	
	/**
	 * @param args
	 */
	private String sapSID;
	private String sapClientId;
	private String sapUser;
	private String sapPasswd;
	private String sapHost;
	private String sapSysNo;
	private String sapMSHost;
	private String sapR3Name;
	private String sapGroup;
	
	private int sapMaxNumConn;
	
	private static final String POOL_NAME = "SAPDirectPool";
	private JCO.PoolManager poolManager = null;
	
	//static final String idCodeIsbn13 = "0001";
	//static final String matNumber = "000000000001030219A";
	//static final String matNumber2 = "000000000000293066";
	//static final String matNumber = "000000000001030219";

	//private String sid;
	private int maxRows = 0;
	
	
	public int getMaxRows() {
		return maxRows;
	}

	public void setMaxRows(int maxRows) {
		this.maxRows = maxRows;
	}

	public static void main(String[] args) throws Exception {
		
		// TODO Auto-generated method stub
		//CustomerBean test = new CustomerBean();
		
				//"Q01",
				//TransactionBean.MAX_NUM_CON,
				//"100", //MaterialBean.sapClientId,
				//TransactionBean.sapUser,
				//TransactionBean.sapPasswd,
				//"oaxs43qt", //MaterialBean.sapHost,
				//"01" //MaterialBean.sapSysNo
				//);

		
		//test.testRun();
		//StringPair[] res = test.getMaterialDetailArray(
		//			new String[] {matNumber, matNumber});
		//System.out.println("n: " + res.length);
		//test.testMaterialGetList();
		//test.testMaterialSearch();
		//test.testMatNR_ExtToInt();
		//Zmaterial_DetailsType matDetails = test.getMaterialDetails(matNumber);
		
/*		
  		String[] tranIDs = new String[] {"0004265496", "0004261470", "0001029392"};
		Holder<Zvsales_Order_HType[]> T_Gt_HeadHolder = new Holder();
		Holder<Zvso_LineitemType[]> T_Gt_ItemHolder = new Holder();
		Holder<ZvaddrType[]> T_Gt_AddrHolder = new Holder();
		Holder<ZvsubscriptionType[]>  T_Gt_SubHolder = new Holder();
		Holder<ZvsrType[]> T_SrepHolder = new Holder();
		Holder<ZvemailType[]> T_Email = new Holder();

		test.getTransactionDetail(tranIDs, T_Gt_HeadHolder, T_Gt_ItemHolder, 
				T_Gt_AddrHolder, T_Gt_SubHolder, T_SrepHolder, T_Email);
		
		test.cleanup();
*/	
	}

	private void init() {
						
	      // Add a connection pool to the specified system
	      //    The pool will be saved in the pool list to be used
	      //    from other threads by JCO.getClient(SID).
	      //    The pool must be explicitely removed by JCO.removeClientPool(SID)
		
		logger.debug("create connection pool " + POOL_NAME);
		poolManager = JCO.createPoolManager(POOL_NAME);

		logger.debug("add client pool " + sapSID);
		// no LB
		//poolManager.addClientPool( sapSID,         	// Alias for this pool
	    //                     sapMaxNumConn,   		// Max. number of connections
	    //                     sapClientId,       // SAP client
	    //                     sapUser,   		// userid
	    //                     sapPasswd,     	// password
	    //                     "en",        		// language
	    //                     sapHost, 			// host name
	    //                     sapSysNo);
		
		// with LB
		poolManager.addClientPool( sapSID,         	// Alias for this pool
                sapMaxNumConn,   		// Max. number of connections
                sapClientId,       // SAP client
                sapUser,   		// userid
                sapPasswd,     	// password
                "en",        		// language
                sapMSHost, 			// ms host
                sapR3Name,
                sapGroup);		
	}

	public void cleanup() {
		logger.debug("remove client pool " + sapSID);
	    poolManager.removeClientPool(sapSID);
	}
	

//
//	REST Methods
//

	@GET
	@Path("/z_rfc_get_cust_details")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public ZvcustdetailsType_Wrapper[] getCustomerDetail(
			@QueryParam("cid") String custId,
			@QueryParam("san") String sanId,
			@QueryParam("mdrPID") String mdrId) 
	{		
		logger.debug("getCustomerDetail begin");
		
		JCO.Client jcoClient = null;
		try {
			
	        // Get a client from the pool
	        //jcoClient = JCO.getClient(sid);
			logger.debug("get client from pool " + sapSID);
	        jcoClient = poolManager.getClient(sapSID);
			
	        int count = 1-1;
			ZvgetcustType[] T_Getcust = new ZvgetcustType[1];
			
			T_Getcust[count] = new ZvgetcustType();
			T_Getcust[count].setKunnr(custId != null ? custId : Transaction_Constants.EMPTY);
			T_Getcust[count].setEikto(sanId != null ? sanId : Transaction_Constants.EMPTY);
			T_Getcust[count].setZmdrpid(mdrId != null ? mdrId : Transaction_Constants.EMPTY);
	        
			// making input
	        Z_Rfc_Get_Cust_Details_Input input = new Z_Rfc_Get_Cust_Details_Input();
			input.setT_Getcust(T_Getcust);			
			
			GetCustomerDetail_PortType myProxy = new GetCustomerDetail_PortType();
			myProxy.messageSpecifier.setJcoClient(jcoClient);
	
			Z_Rfc_Get_Cust_Details_Output output = myProxy.z_Rfc_Get_Cust_Details(input);
	
			ZvcustdetailsType[] arr = output.getT_Custdetails();
			ZvcustdetailsType_Wrapper[] ret = new ZvcustdetailsType_Wrapper[arr.length];
			for (int i=0; i<arr.length; ++i) {
				ZvcustdetailsType_Wrapper w = new ZvcustdetailsType_Wrapper();
				w.setInstance(arr[i]);
				ret[i] = w;
			}
			
			return ret;
			
		} 
		catch (ApplicationFaultException e) {
			logger.error(e.getMessage(), e);
			Response r = Response
					.status(500)
					.entity(e).build();
			throw new WebApplicationException(r);
			
		} 
		catch (SystemFaultException e) {
			logger.error(e.getMessage(), e);
			Response r = Response
					.status(500)
					.entity(e).build();
			throw new WebApplicationException(r);
		} 
	    finally {
	        // Release the client to the pool
	        if (jcoClient != null) {
	        	//JCO.releaseClient(jcoClient);
				logger.debug("release client from pool ");
	        	poolManager.releaseClient(jcoClient);
	        }
			logger.debug("getCustomerDetail ends");
	    }		
	}	
	
	
	@GET
	@Path("/bapi_material_getall")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public 
	Bapi_Material_Getall_Output_Wrapper 
	//Bapi_Mara_GaType_Wrapper
		bapi_material_getall(
			@QueryParam("material") String material,
			@QueryParam("companycode") String companycode,
			@QueryParam("valuationarea") String valuationarea,
			@QueryParam("valuationtype") String valuationtype,
			@QueryParam("plant") String plant,
			@QueryParam("storagelocation") String storagelocation,
			@QueryParam("salesorganisation") String salesorganisation,
			@QueryParam("distributionchannel") String distributionchannel,
			@QueryParam("warehousenumber") String warehousenumber,
			@QueryParam("storagetype") String storagetype,
			@QueryParam("lifovaluationlevel") String lifovaluationlevel	) 
	{		
		logger.debug("bapi_material_getall begin");
		
		JCO.Client jcoClient = null;
		try {
			
	        // Get a client from the pool
	        //jcoClient = JCO.getClient(sid);
			logger.debug("get client from pool " + sapSID);
	        jcoClient = poolManager.getClient(sapSID);
			
			// making input
			Bapi_Material_Getall_Input input = new Bapi_Material_Getall_Input();
			if (material != null) input.setMaterial(material);
			if (companycode != null) input.setCompanycode(companycode);
			if (valuationarea != null) input.setValuationarea(valuationarea);
			if (valuationtype != null) input.setValuationtype(valuationtype);
			if (plant != null) input.setPlant(plant);
			if (storagelocation != null) input.setStoragelocation(storagelocation);
			if (salesorganisation != null) input.setSalesorganisation(salesorganisation);
			if (distributionchannel != null) input.setDistributionchannel(distributionchannel);
			if (warehousenumber != null) input.setWarehousenumber(warehousenumber);
			if (storagetype != null) input.setStoragetype(storagetype);
			if (lifovaluationlevel != null) input.setLifovaluationlevel(lifovaluationlevel);
						
			BapiMaterialGetAll_PortType myProxy = new BapiMaterialGetAll_PortType();
			myProxy.messageSpecifier.setJcoClient(jcoClient);
	
			Bapi_Material_Getall_Output output = myProxy.bapi_Material_Getall(input);
			Bapi_Material_Getall_Output_Wrapper ret = new Bapi_Material_Getall_Output_Wrapper();
			ret.setInstance(output);
			//Bapi_Mara_GaType_Wrapper ret = new Bapi_Mara_GaType_Wrapper();
			//Bapi_Mara_GaType clientData = output.getClientdata();
			//String mat = clientData.getMaterial();			
			//ret.setInstance(clientData);
			
			return ret;
			
		} 
		catch (ApplicationFaultException e) {
			logger.error(e.getMessage(), e);
			Response r = Response
					.status(500)
					.entity(e).build();
			throw new WebApplicationException(r);
			
		} 
		catch (SystemFaultException e) {
			logger.error(e.getMessage(), e);
			Response r = Response
					.status(500)
					.entity(e).build();
			throw new WebApplicationException(r);
		} 
	    finally {
	        // Release the client to the pool
	        if (jcoClient != null) {
	        	//JCO.releaseClient(jcoClient);
				logger.debug("release client from pool ");
	        	poolManager.releaseClient(jcoClient);
	        }
			logger.debug("bapi_material_getall ends");
	    }		
	}	
	

	/*@POST
	@Path("/z_product_list_exclusion_wrap")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public ZrestrictionTypeList_Wrapper getProductListExclusion(
			ZPRODUCTLISTEXCLUSIONWRAP parameters) {
		
		ZPRODUCTLISTEXCLUSIONWRAPService service = new ZPRODUCTLISTEXCLUSIONWRAPService(ZPRODUCTLISTEXCLUSIONWRAPService.class.getResource("/META-INF/wsdl/Z_PRODUCT_LIST_EXCLUSION_WRAP.wsdl"));
		
		org.apache.cxf.jaxws.JaxWsProxyFactoryBean clientFactory = new JaxWsProxyFactoryBean();             
		clientFactory.setAddress("http://oaxs43qt.hmco.com:8001/sap/bc/soap/rfc"); 
		clientFactory.setServiceClass(ZPRODUCTLISTEXCLUSIONWRAPPortType.class); 
		clientFactory.setUsername(SAP_USERNAME); 
		clientFactory.setPassword(SAP_PASSWORD); 
		
		ZPRODUCTLISTEXCLUSIONWRAPPortType client = (ZPRODUCTLISTEXCLUSIONWRAPPortType)clientFactory.create();
		ZPRODUCTLISTEXCLUSIONWRAPResponse sapOutput = client.zPRODUCTLISTEXCLUSIONWRAP(parameters);
		
		ORESTRICTION oRestriction = sapOutput.getORESTRICTION();
		List<ZRESTRICTION> restList = oRestriction.getItem();
		
		ZrestrictionTypeList_Wrapper serviceOp = new ZrestrictionTypeList_Wrapper();
		ZrestrictionType_Wrapper[] restOpList = null;
		if(restList != null) {
			restOpList = new ZrestrictionType_Wrapper[restList.size()];
			int count = 0;
			for(ZRESTRICTION rest : restList) {
				ZrestrictionType_Wrapper wrapper = new ZrestrictionType_Wrapper();
				ZrestrictionType zType = new ZrestrictionType();
				zType.setMatnr(rest.getMATNR());
				zType.setRestricted(rest.getRESTRICTED());
				wrapper.setInstance(zType);
				restOpList[count++] = wrapper;
			}
			
			return serviceOp;
		}
				
		return null;
	}*/
	
	@GET
	//@Path("/Z_PRODUCT_LIST_EXCLUSION_WRAP")
	@Path("/z_product_list_exclusion_wrap")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public 
	//ZrestrictionType_Wrapper[]
    ZrestrictionTypeList_Wrapper
		getProductListExclusion(
			@QueryParam("division") String division,
			@QueryParam("doctype") String doctype,
			@QueryParam("shipto") String shipto,
			@QueryParam("soldto") String soldto,
			@QueryParam("potype") String potype,
			@QueryParam("podate") String podateStr,
			@QueryParam("matnr") List<String> matList)
	{		
		logger.debug("getProductListExclusion begin");
		
		JCO.Client jcoClient = null;
		try {
			
	        // Get a client from the pool
	        //jcoClient = JCO.getClient(sid);
			logger.debug("get client from pool " + sapSID);
	        jcoClient = poolManager.getClient(sapSID);
			
			// making input
	        //
	        Zlist_ExclusionType I_Ord = new Zlist_ExclusionType();
			if (division != null) I_Ord.setOrd_Div(division);
			if (doctype != null) I_Ord.setOrd_Type(doctype);
			if (shipto != null) I_Ord.setOrd_Shipto(shipto);
			if (soldto != null) I_Ord.setOrd_Soldto(soldto);
			if (potype != null) I_Ord.setOrd_Potype(potype);
			if (podateStr != null && podateStr.length() >= 8) {
				int year = new Integer(podateStr.substring(0, 4)).intValue();
				int month = new Integer(podateStr.substring(4, 6)).intValue();
				int day = new Integer(podateStr.substring(6, 8)).intValue();
				GregorianCalendar gc = new GregorianCalendar(year + 1900, month, day);
				java.sql.Date podate = new java.sql.Date(gc.getTimeInMillis());
				I_Ord.setOrd_Podate(podate);
			}
	        
			ZmatnrType[] I_Matnr = new ZmatnrType[matList.size()];
			int i=0;
			for (String matNum : matList) {
				ZmatnrType t = new ZmatnrType();
				t.setMatnr(matNum);
				I_Matnr[i++] = t;
			}
			           
	        Z_Product_List_Exclusion_Wrap_Input input = new Z_Product_List_Exclusion_Wrap_Input();
	        input.setI_Ord(I_Ord);
	        input.setI_Matnr(I_Matnr);
	        
			Z_PRODUCT_LIST_EXCLUSION_WRAP_PortType myProxy = new Z_PRODUCT_LIST_EXCLUSION_WRAP_PortType();
			myProxy.messageSpecifier.setJcoClient(jcoClient);
	
			Z_Product_List_Exclusion_Wrap_Output output = myProxy.z_Product_List_Exclusion_Wrap(input);
			
			// error processing
			Zbdcmsgcoll_RfcType[] errTable = output.getO_Return();			
			if (errTable.length > 0) {	
				/*
				Bapiret2Type_Wrapper[] retErr = new Bapiret2Type_Wrapper[errTable.length];
				int i=0;
				for (Zbdcmsgcoll_RfcType err : errTable) {
					Bapiret2Type t = makeBapiret2Type(err);
					Bapiret2Type_Wrapper wrap = new Bapiret2Type_Wrapper(t);
					retErr[i++] = wrap;
				}
				*/
				Zbdcmsgcoll_RfcType_Wrapper[] wrapArray = new Zbdcmsgcoll_RfcType_Wrapper[errTable.length];
				int k=0;
				for (Zbdcmsgcoll_RfcType err : errTable) {
					wrapArray[k++] = new Zbdcmsgcoll_RfcType_Wrapper(err);
				}
				
				logger.error(wrapArray);
				Response r = Response
						.status(400)
						.entity(wrapArray).build();
				throw new WebApplicationException(r);
				
			}
			
			ZrestrictionType[] restrictions = output.getO_Restriction();
			ZrestrictionType_Wrapper[] retWrap = new ZrestrictionType_Wrapper[restrictions.length];
			int k=0;
			for (ZrestrictionType rest : restrictions) {
				retWrap[k++] = new ZrestrictionType_Wrapper(rest);
			}
			return new ZrestrictionTypeList_Wrapper(retWrap);
		} 
		catch (ApplicationFaultException e) {
			logger.error(e.getMessage(), e);
			Response r = Response
					.status(500)
					.entity(e).build();
			throw new WebApplicationException(r);
			
		} 
		catch (SystemFaultException e) {
			logger.error(e.getMessage(), e);
			Response r = Response
					.status(500)
					.entity(e).build();
			throw new WebApplicationException(r);
		} 
	    finally {
	        // Release the client to the pool
	        if (jcoClient != null) {
	        	//JCO.releaseClient(jcoClient);
				logger.debug("release client from pool ");
	        	poolManager.releaseClient(jcoClient);
	        }
			logger.debug("getProductListExclusion ends");
	    }		
	}	
	
	Bapiret2Type makeBapiret2Type(Zbdcmsgcoll_RfcType err) {
		Bapiret2Type t = new Bapiret2Type();
		t.setId(err.getMsgid());
		t.setMessage(err.getMsgv1());
		return t;
	}
	
	@GET
	@Path("/z_vi_sl_get_contract_pricing")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public 
    ZcontprTypeList_Wrapper
		getContractPricing(
			@QueryParam("orderReason") String orderReason,
			@QueryParam("sellingDiv") String sellingDiv,
			@QueryParam("shipto") String shipto,
			@QueryParam("shiptoCountry") String shiptoCountry,
			@QueryParam("shiptoState") String shiptoState,
			@QueryParam("soldto") String soldto,
			@QueryParam("matnr") List<String> matList)
	{		
		logger.debug("getContractPricing begin");
		
		JCO.Client jcoClient = null;
		try {
			
	        // Get a client from the pool
	        //jcoClient = JCO.getClient(sid);
			logger.debug("get client from pool " + sapSID);
	        jcoClient = poolManager.getClient(sapSID);
			
			// making input
	        //
	        Z_Vi_Sl_Get_Contract_Pricing_Input input = new Z_Vi_Sl_Get_Contract_Pricing_Input();
	        
			if (orderReason != null) input.setI_Order_Reason(orderReason);
			if (sellingDiv != null) input.setI_Selling_Division(sellingDiv);
			if (shipto != null) input.setI_Ship_To(shipto);
			if (shiptoCountry != null) input.setI_Ship_To_Country(shiptoCountry);
			if (shiptoState != null) input.setI_Ship_To_State(shiptoState);
			if (soldto != null) input.setI_Sold_To(soldto);
				        
			ZmatnrType[] I_Matnr = new ZmatnrType[matList.size()];
			int i=0;
			for (String matNum : matList) {
				ZmatnrType t = new ZmatnrType();
				t.setMatnr(matNum);
				I_Matnr[i++] = t;
			}
			           
	        input.setI_Materials(I_Matnr);
	        
	        Z_VI_SL_GET_CONTRACT_PRICING_PortType myProxy = new Z_VI_SL_GET_CONTRACT_PRICING_PortType();
			myProxy.messageSpecifier.setJcoClient(jcoClient);
	
			Z_Vi_Sl_Get_Contract_Pricing_Output output = myProxy.z_Vi_Sl_Get_Contract_Pricing(input);
			
			// error processing
			Zbdcmsgcoll_RfcType[] errTable = output.getO_Return();			
			if (errTable.length > 0) {	
				
				Zbdcmsgcoll_RfcType_Wrapper[] wrapArray = new Zbdcmsgcoll_RfcType_Wrapper[errTable.length];
				int k=0;
				for (Zbdcmsgcoll_RfcType err : errTable) {
					wrapArray[k++] = new Zbdcmsgcoll_RfcType_Wrapper(err);
				}
				
				logger.error(wrapArray);
				Response r = Response
						.status(400)
						.entity(wrapArray).build();
				throw new WebApplicationException(r);
				
			}
			
			ZcontprType[] contractPrice = output.getO_Price();
			ZcontprType_Wrapper[] retWrap = new ZcontprType_Wrapper[contractPrice.length];
			int k=0;
			for (ZcontprType contprType : contractPrice) {
				retWrap[k++] = new ZcontprType_Wrapper(contprType);
			}
			return new ZcontprTypeList_Wrapper(retWrap);
			
		} 
		catch (ApplicationFaultException e) {
			logger.error(e.getMessage(), e);
			Response r = Response
					.status(500)
					.entity(e).build();
			throw new WebApplicationException(r);
			
		} 
		catch (SystemFaultException e) {
			logger.error(e.getMessage(), e);
			Response r = Response
					.status(500)
					.entity(e).build();
			throw new WebApplicationException(r);
		} 
	    finally {
	        // Release the client to the pool
	        if (jcoClient != null) {
	        	//JCO.releaseClient(jcoClient);
				logger.debug("release client from pool ");
	        	poolManager.releaseClient(jcoClient);
	        }
			logger.debug("getContractPricing ends");
	    }		
	}	
	
	
	
	

    
    //
    //	Properties fillers
    //
    
	public String getSapSID() {
		return sapSID;
	}
	public void setSapSID(String sapSID) {
		this.sapSID = sapSID;
	}

	public String getSapClientId() {
		return sapClientId;
	}
	public void setSapClientId(String sapClientId) {
		this.sapClientId = sapClientId;
	}

	public String getSapUser() {
		return sapUser;
	}
	public void setSapUser(String sapUser) {
		this.sapUser = sapUser;
	}

	public String getSapPasswd() {
		return sapPasswd;
	}
	public void setSapPasswd(String sapPasswd) {
		this.sapPasswd = sapPasswd;
	}

	public String getSapHost() {
		return sapHost;
	}
	public void setSapHost(String sapHost) {
		this.sapHost = sapHost;
	}

	public String getSapSysNo() {
		return sapSysNo;
	}
	public void setSapSysNo(String sapSysNo) {
		this.sapSysNo = sapSysNo;
	}

	public String getSapMSHost() {
		return sapMSHost;
	}
	public void setSapMSHost(String sapMSHost) {
		this.sapMSHost = sapMSHost;
	}

	public String getSapR3Name() {
		return sapR3Name;
	}
	public void setSapR3Name(String sapR3Name) {
		this.sapR3Name = sapR3Name;
	}

	public String getSapGroup() {
		return sapGroup;
	}
	public void setSapGroup(String sapGroup) {
		this.sapGroup = sapGroup;
	}

	public int getSapMaxNumConn() {
		return sapMaxNumConn;
	}
	public void setSapMaxNumConn(int sapMaxNumConn) {
		this.sapMaxNumConn = sapMaxNumConn;
	}

	
	//
	//	InitializingBean
	//
	public void afterPropertiesSet() throws Exception {
		logger.debug("initializing " + this.getClass().getName());
		init();
	}

	//
	//	DisposableBean
	//
	public void destroy() throws Exception {
		logger.debug("destroying " + this.getClass().getName());
		cleanup();		
	}

	
}
