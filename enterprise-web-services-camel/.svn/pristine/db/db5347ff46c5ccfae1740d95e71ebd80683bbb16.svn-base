package hmh.ws.controller;

import hmh.sap.rfc.BapiMaterialAvailability_PortType;
import hmh.sap.rfc.Bapi_Material_Availability_Input;
import hmh.sap.rfc.Bapi_Material_Availability_Output;
import hmh.sap.rfc.BapireturnType;
import hmh.sap.rfc.Material_PortType;
import hmh.sap.rfc.Solisti1Type;
import hmh.sap.rfc.Z_Rfc_Get_Material_Detail_Atp_Input;
import hmh.sap.rfc.Z_Rfc_Get_Material_Detail_Atp_Output;
import hmh.sap.rfc.Z_Rfc_Get_Material_Detail_Input;
import hmh.sap.rfc.Z_Rfc_Get_Material_Detail_Output;
import hmh.sap.rfc.Z_Rfc_Get_Material_Substitute_Input;
import hmh.sap.rfc.Z_Rfc_Get_Material_Substitute_Output;
import hmh.sap.rfc.ZemailType;
import hmh.sap.rfc.Zident_CodeType;
import hmh.sap.rfc.ZmatnrType;
import hmh.sap.rfc.ZvmaterialsType;
import hmh.sap.rfc.ZvrelationType;
import hmh.util.Transaction_Constants;

import java.math.BigDecimal;
import java.util.List;

import javax.xml.ws.Holder;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.sap.aii.proxy.framework.core.ApplicationFaultException;
import com.sap.aii.proxy.framework.core.SystemFaultException;
import com.sap.mw.jco.JCO;


public class MaterialBean implements InitializingBean, DisposableBean {
	
	private static final Logger logger = Logger.getLogger(MaterialBean.class);

		
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
	private int sapTrace;

	
	private static final String POOL_NAME = "MaterialPool";
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
		
		JCO.Pool pool = poolManager.getPool(sapSID);
		//pool.setTrace(sapTrace == 1);
		
	}

	public void cleanup() {
		logger.debug("remove client pool " + sapSID);
	    poolManager.removeClientPool(sapSID);
	}
	
	//public TransactionBean() {
	//}
			
	
	public String getMaterialDetail(
				String customerId,
				String[] materialIDs,
				String[] isbns,
				Holder<hmh.sap.rfc.Zmaterial_DetailsType[]> I_Material_Detail,
				Holder<hmh.sap.rfc.ZcompType[]> I_Components,
				Holder<hmh.sap.rfc.ZsubsType[]> I_Subscription)
		throws ApplicationFaultException, SystemFaultException
	{
		logger.debug("getMaterialDetail begin");
		
		JCO.Client jcoClient = null;
		String ret = Transaction_Constants.EMPTY;
		try {
			
	        // Get a client from the pool
	        //jcoClient = JCO.getClient(sid);
			logger.debug("get client from pool " + sapSID);
	        jcoClient = poolManager.getClient(sapSID);
				
			// making input
	        Z_Rfc_Get_Material_Detail_Input input = new Z_Rfc_Get_Material_Detail_Input();
			input.setCust_Id(customerId);
			input.setI_Material_Number(toZmatnrType(materialIDs));
			input.setI_Isbn(toZident_CodeType(isbns));
						
			Material_PortType myProxy = new Material_PortType();
			myProxy.messageSpecifier.setJcoClient(jcoClient);
	
			Z_Rfc_Get_Material_Detail_Output output = myProxy.z_Rfc_Get_Material_Detail(input);
	
			// outputs
			I_Material_Detail.value = output.getI_Material_Detail();
			I_Components.value = output.getI_Components();
			I_Subscription.value = output.getI_Subscription();
			
			ret = output.getReturn_Status_Code();
		} 
	    finally {
	        // Release the client to the pool
	        if (jcoClient != null) {
	        	//JCO.releaseClient(jcoClient);
				logger.debug("release client from pool ");
	        	poolManager.releaseClient(jcoClient);
	        }
			logger.debug("getMaterialDetail ends");
	    }
		
		return ret;
	}

	public String getMaterialSubstitutions(
			String[] materialIDs,
			String[] isbns,
			Holder<hmh.sap.rfc.Zmatnr_SubstituteType[]> I_Material_Substitute)
	throws ApplicationFaultException, SystemFaultException
	{
		logger.debug("getMaterialSubstitutions begin");
		
		JCO.Client jcoClient = null;
		String ret = Transaction_Constants.EMPTY;
		try {
			
	        // Get a client from the pool
	        //jcoClient = JCO.getClient(sid);
			logger.debug("get client from pool " + sapSID);
	        jcoClient = poolManager.getClient(sapSID);
				
			// making input
	        Z_Rfc_Get_Material_Substitute_Input input = new Z_Rfc_Get_Material_Substitute_Input();
			input.setI_Material_Number(toZmatnrType(materialIDs));
			input.setI_Isbn(toZident_CodeType(isbns));
						
			Material_PortType myProxy = new Material_PortType();
			myProxy.messageSpecifier.setJcoClient(jcoClient);
	
			Z_Rfc_Get_Material_Substitute_Output output = myProxy.z_Rfc_Get_Material_Substitute(input);
	
			// outputs
			I_Material_Substitute.value = output.getI_Material_Substitute();
			
			ret = output.getReturn_Status_Code();
		} 
	    finally {
	        // Release the client to the pool
	        if (jcoClient != null) {
	        	//JCO.releaseClient(jcoClient);
				logger.debug("release client from pool ");
	        	poolManager.releaseClient(jcoClient);
	        }
			logger.debug("getMaterialSubstitutions ends");
	    }
		
		return ret;
	}

	public String getMaterialDetailAtp(
			String[] materialNums,
			String country,
			String region,
			String custId,
			String division,
			String itemType,
			String orderType,
			String distChnl, String salesOrg, Holder<hmh.sap.rfc.Zmaterial_DetailsType[]> I_Material_Detail)
	throws ApplicationFaultException, SystemFaultException
	{
		logger.debug("getMaterialDetailAtp begin");
		
		JCO.Client jcoClient = null;
		String ret = Transaction_Constants.EMPTY;
		try {
			
	        // Get a client from the pool
	        //jcoClient = JCO.getClient(sid);
			logger.debug("get client from pool " + sapSID);
	        jcoClient = poolManager.getClient(sapSID);
				
			// making input
	        Z_Rfc_Get_Material_Detail_Atp_Input input = new Z_Rfc_Get_Material_Detail_Atp_Input();
			input.setI_Material_Number(toZmatnrType(materialNums));
			input.setCountry(country);
			input.setRegion(region);
			input.setCust_Id(custId);
			input.setDivision(division);
			input.setItem_Type(itemType);
			input.setOrder_Type(orderType);
			input.setDist_Chnl(distChnl);
			input.setSales_Org(salesOrg);
			
			Material_PortType myProxy = new Material_PortType();
			myProxy.messageSpecifier.setJcoClient(jcoClient);
	
			Z_Rfc_Get_Material_Detail_Atp_Output output = myProxy.z_Rfc_Get_Material_Detail_Atp(input);
	
			// outputs
			I_Material_Detail.value = output.getI_Material_Detail();
			
			ret = output.getReturn_Status_Code();
		} 
	    finally {
	        // Release the client to the pool
	        if (jcoClient != null) {
	        	//JCO.releaseClient(jcoClient);
				logger.debug("release client from pool ");
	        	poolManager.releaseClient(jcoClient);
	        }
			logger.debug("getMaterialDetailAtp ends");
	    }
		
		return ret;
	}


	public BapireturnType getMaterialAvailability(
					String material, 
					String plantName,
					Holder<BigDecimal> quantityHolder)
			throws ApplicationFaultException, SystemFaultException {
		logger.debug("getMaterialAvailability begin");

		JCO.Client jcoClient = null;
		//String ret = Transaction_Constants.EMPTY;
		BapireturnType bapiRet = null;
		try {

			// Get a client from the pool
			logger.debug("get client from pool " + sapSID);
			jcoClient = poolManager.getClient(sapSID);

			// making input
			Bapi_Material_Availability_Input input = new Bapi_Material_Availability_Input();
			input.setMaterial(material);
			input.setPlant(plantName);
			input.setUnit("EA");
			
			//input.setItm_Number("000000");
			//input.setDec_For_Rounding((short) 0);

			BapiMaterialAvailability_PortType myProxy = new BapiMaterialAvailability_PortType();
			myProxy.messageSpecifier.setJcoClient(jcoClient);

			Bapi_Material_Availability_Output output = myProxy
					.bapi_Material_Availability(input);

			// outputs
			quantityHolder.value = output.getAv_Qty_Plt();
			bapiRet = output.getReturn();
			logger.debug("Available Quantity ::: " + quantityHolder.value);
			logger.debug("Bapi ret ::: type:" + bapiRet.getType() + ", code:" + bapiRet.getCode() + ", msg:" + bapiRet.getMessage());
			
			//return bapiRet;
		} 
		finally {
			// Release the client to the pool
			if (jcoClient != null) {
				logger.debug("release client from pool ");
				poolManager.releaseClient(jcoClient);
			}
			logger.debug("getMaterialAvailability ends");
		}
		
		return bapiRet;
	}
	
	
	
	// helper methods
	//
	ZmatnrType[] toZmatnrType(String[] matNums) {
		ZmatnrType[] ret = new ZmatnrType[matNums.length];
		int i=0;
		for (String matnr : matNums) {
			ZmatnrType t = new ZmatnrType();
			t.setMatnr(matnr);
			ret[i++] = t;
		}
		return ret;
	}
	
	Zident_CodeType[] toZident_CodeType(String[] isbns) {
		Zident_CodeType[] ret = new Zident_CodeType[isbns.length];
		int i=0;
		for (String isbn : isbns) {
			Zident_CodeType t = new Zident_CodeType();
			t.setIdentcode(isbn);
			ret[i++] = t;
		}
		return ret;
	}
	
	ZvrelationType[] toZvrelationType(List<String> relationshipList) {
		ZvrelationType[] T_Relation = new ZvrelationType[relationshipList.size()];
		int i=0;
		for (String s : relationshipList) {
			ZvrelationType t = new ZvrelationType();
			t.setParvw(s);
			T_Relation[i++] = t;
		}
		return T_Relation;
	}
	
	ZvmaterialsType[] toZvmaterialsType(String[] matNums) {
		ZvmaterialsType[] T_Materials = new ZvmaterialsType[matNums.length];
		int i=0;
		for (String s : matNums) {
			ZvmaterialsType t = new ZvmaterialsType();
			t.setMatnr(s);
			T_Materials[i] = t;
		}		
		return T_Materials;
	}
	
    ZemailType[] toZemailType(String[] emails) {
	    ZemailType[] EmailTypes = new ZemailType[emails.length];
		int i=0;
		for (String email : emails ) {
			ZemailType t = new ZemailType();
			t.setSmtp_Addr(email);
			EmailTypes[i++] = t;
		}
		return EmailTypes;
    }
	
    Solisti1Type[] toSolisti1Type(String[] texts) {
    	Solisti1Type[] types = new Solisti1Type[texts.length];
		int i=0;
		for (String s : texts ) {
			Solisti1Type t = new Solisti1Type();
			t.setLine(s);
			types[i++] = t;
		}
		return types;
    }
    
    String[] toStringType(Solisti1Type[] texts) {
    	String[] types = new String[texts.length];
		int i=0;
		for (Solisti1Type t : texts ) {
			types[i++] = t.getLine();
		}
		return types;
    }

    String[] split(String s, int size) {
    	int n = s.length() / size + 1;
    	String[] ret = new String[n];
    	int beginIndex;
    	int endIndex;
    	for (int i=0; i<n; ++i) {
    		beginIndex = i * size;
    		endIndex = ((i+1) * size) < s.length() ? ((i+1) * size) : s.length(); 
    		ret[i] = s.substring(beginIndex, endIndex);    				    				
    	}
    	return ret;
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

	public int getSapTrace() {
		return sapTrace;
	}
	public void setSapTrace(int sapTrace) {
		this.sapTrace = sapTrace;
	}

	
	//
	//
	//
	public void afterPropertiesSet() throws Exception {
		logger.debug("initializing " + this.getClass().getName());
		init();
	}

	public void destroy() throws Exception {
		logger.debug("destroying " + this.getClass().getName());
		cleanup();		
	}

	
}
