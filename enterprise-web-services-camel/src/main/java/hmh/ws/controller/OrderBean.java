package hmh.ws.controller;

import hmh.sap.rfc.BapiccardType;
import hmh.sap.rfc.BapictrType;
import hmh.sap.rfc.BapicuvalType;
import hmh.sap.rfc.Bapiret2Type;
import hmh.sap.rfc.Bapisdhd1Type;
import hmh.sap.rfc.Bapisdhd1XType;
import hmh.sap.rfc.BapisditType;
import hmh.sap.rfc.BapisditmType;
import hmh.sap.rfc.BapisdkeyType;
import hmh.sap.rfc.Order_PortType;
import hmh.sap.rfc.ZWRAPPER_SD_SALESORDER_CREATE_PortType;
import hmh.sap.rfc.Z_Vi_Sl_Sales_Samples_Sub_Input;
import hmh.sap.rfc.Z_Vi_Sl_Sales_Samples_Sub_Output;
import hmh.sap.rfc.Zbdcmsgcoll_RfcType;
import hmh.sap.rfc.ZccardType;
import hmh.sap.rfc.Zvgetsales_HType;
import hmh.sap.rfc.Zvgetsales_HeType;
import hmh.sap.rfc.Zvgetsales_LType;
import hmh.sap.rfc.Zvgetsales_LeType;
import hmh.sap.rfc.Zwrapper_Sd_Salesorder_Create_Input;
import hmh.sap.rfc.Zwrapper_Sd_Salesorder_Create_Output;
import hmh.sap.rfc.util.Bapiaddr1Type_List;
import hmh.sap.rfc.util.BapiccardType_List;
import hmh.sap.rfc.util.BapicondType_List;
import hmh.sap.rfc.util.BapicondxType_List;
import hmh.sap.rfc.util.BapictrType_List;
import hmh.sap.rfc.util.BapicucfgType_List;
import hmh.sap.rfc.util.BapicuvalType_List;
import hmh.sap.rfc.util.BapiparexType_List;
import hmh.sap.rfc.util.BapiparnrType_List;
import hmh.sap.rfc.util.BapischdlType_List;
import hmh.sap.rfc.util.BapisditmType_List;
import hmh.util.Transaction_Constants;

import javax.xml.ws.Holder;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.sap.aii.proxy.framework.core.ApplicationFaultException;
import com.sap.aii.proxy.framework.core.SystemFaultException;
import com.sap.mw.jco.JCO;


public class OrderBean implements InitializingBean, DisposableBean {
	
	private static final Logger logger = Logger.getLogger(OrderBean.class);

		
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
	
	private static final String POOL_NAME = "OrderPool";
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
		
		 // From JCO doc...
		// In difference to getClientPoolManager() it is not returning the singleton created by JCo 
		// for the static methods working on pools, but a completely new instance.
		 
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
	
			
	
	public String submitOrder(
				String clientTransId,
				String orderType,
				String poNumber,
				String transactionAction,
				ZccardType creditCardInfo,
				Zvgetsales_HType salesdocheadIn,
				Zvgetsales_LType[] salesdocdetailIn,
				boolean submitForManualCorrection,
				Holder<Zvgetsales_HeType> salesdocheadOut,
				Holder<Zvgetsales_LeType[]> salesdocdetailOut,
				Holder<Zbdcmsgcoll_RfcType[]> sapReturn)				
		throws ApplicationFaultException, SystemFaultException
	{
		logger.debug("submitOrder begin");
		
		JCO.Client jcoClient = null;
		String ret = Transaction_Constants.EMPTY;
		try {
			
	        // Get a client from the pool
	        //jcoClient = JCO.getClient(sid);
			logger.debug("get client from pool " + sapSID);
	        jcoClient = poolManager.getClient(sapSID);
	        logger.debug("client hashkey " + jcoClient.getHashKey(false));
				
			// making input
	        Z_Vi_Sl_Sales_Samples_Sub_Input input = new Z_Vi_Sl_Sales_Samples_Sub_Input();
	        if (clientTransId != null) input.setClienttransid(clientTransId);
        	input.setOrdertype((orderType != null) ? orderType : Transaction_Constants.ZOR);	        	
	        if (poNumber != null) input.setPonumber(poNumber);
	        if (transactionAction != null) input.setTransaction(transactionAction);
	        if (creditCardInfo != null ) input.setCreditcard(creditCardInfo);
	        input.setSalesdocheadin(salesdocheadIn);
	        input.setSalesdocdetailin(salesdocdetailIn);
	        input.setSubmitformanualcorrection((submitForManualCorrection == true) ? Transaction_Constants.Y : Transaction_Constants.N);
	        
	        //String inputXml = input.toXml();
	        //logger.debug(inputXml);
	        
	        Order_PortType myProxy = new Order_PortType();
			myProxy.messageSpecifier.setJcoClient(jcoClient);
	
			logger.debug("SAP INPUT :: " + input.toXml(input.getClass().getName(), Transaction_Constants.EMPTY));
			//logger.info("SAP INPUT ::: " + input.toXml(""));
			Z_Vi_Sl_Sales_Samples_Sub_Output output = myProxy.z_Vi_Sl_Sales_Samples_Sub(input);
			logger.debug("SAP OUTPUT " + output.toXml(output.getClass().getName(), Transaction_Constants.EMPTY));
			//logger.info("SAP OUTPUT :: " + output.toXml(""));
			// outputs
			salesdocheadOut.value = output.getSalesdocheadout();
			salesdocdetailOut.value = output.getSalesdocdetailout();
			sapReturn.value = output.getReturn();
			ret = output.getE_Status();
		} 
	    finally {
	        // Release the client to the pool
	        if (jcoClient != null) {
	        	//JCO.releaseClient(jcoClient);
				logger.debug("release client from pool ");
	        	poolManager.releaseClient(jcoClient);
	        }
			logger.debug("submitOrder ends");
	    }
		
		return ret;
	}
	
	public String orderSimulate(String testRun, BapiparnrType_List Sales_Partners, Bapiaddr1Type_List Partneraddresses, Bapisdhd1Type Sales_Header_In,
			Bapisdhd1XType Sales_Header_Inx, BapiparexType_List ExtensionList, BapicondType_List Sales_Conditions_In, 
			BapicondxType_List Sales_Conditions_Inx, BapisditmType_List saleLineItemList, BapischdlType_List Sales_Schedules_In, 
			BapicucfgType_List Sales_Cfgs_Ref, BapicuvalType_List Sales_Cfgs_Value, BapictrType_List Sales_Contract_In,
			Holder<BapisditType[]> isdList, Holder<BapisdkeyType[]> salesKeyList, Holder<Bapiret2Type[]> returnList, BapiccardType_List sales_Ccard)
			throws ApplicationFaultException, SystemFaultException {
		logger.info("simulateOrder begin");
		String ret = Transaction_Constants.EMPTY;
		JCO.Client jcoClient = null;
		try {

			// Get a client from the pool
			// jcoClient = JCO.getClient(sid);
			logger.info("get client from pool " + sapSID);
			jcoClient = poolManager.getClient(sapSID);
			// making input
			
			Zwrapper_Sd_Salesorder_Create_Input input = new Zwrapper_Sd_Salesorder_Create_Input();
			input.setBusiness_Object(Transaction_Constants.BUS2032);
			input.setBehave_When_Error(Transaction_Constants.R);
			input.setTestrun(testRun);
			input.setInt_Number_Assignment(Transaction_Constants.X);
			input.setStatus_Buffer_Refresh(Transaction_Constants.SPACE);
			
			input.setSales_Partners(Sales_Partners );
			input.setPartneraddresses(Partneraddresses );
			input.setSales_Header_In(Sales_Header_In);
			input.setSales_Header_Inx(Sales_Header_Inx);
			input.setExtensionin(ExtensionList );
			input.setSales_Conditions_In(Sales_Conditions_In );
			input.setSales_Conditions_Inx(Sales_Conditions_Inx );
			input.setSales_Items_In(saleLineItemList);
			input.setSales_Schedules_In(Sales_Schedules_In);
			input.setSales_Cfgs_Ref(Sales_Cfgs_Ref);
			input.setSales_Cfgs_Value(Sales_Cfgs_Value);
			input.setSales_Contract_In(Sales_Contract_In);
			
			if(sales_Ccard != null) {
				input.setSales_Ccard(sales_Ccard);	
			}
			
			logger.debug("SAP INPUT " + input.toXml(input.getClass().getName(), Transaction_Constants.EMPTY));

			ZWRAPPER_SD_SALESORDER_CREATE_PortType myProxy = new ZWRAPPER_SD_SALESORDER_CREATE_PortType();
			myProxy.messageSpecifier.setJcoClient(jcoClient);

			Zwrapper_Sd_Salesorder_Create_Output output = myProxy.zwrapper_Sd_Salesorder_Create(input);

			logger.debug("SAP OUTPUT :: " + output.toXml(input.getClass().getName(), Transaction_Constants.EMPTY));
			isdList.value = output.getItems_Ex();
			
			/*
			 * Added to Handle Line Number in Simulate Order
			 */
			if(salesKeyList != null){
				salesKeyList.value = output.getSales_Keys();
			}
			
			ret = output.getSalesdocument_Ex();
			returnList.value = output.getReturn();
		} finally {
			// Release the client to the pool
			if (jcoClient != null) {
				logger.debug("release client from pool ");
				poolManager.releaseClient(jcoClient);
			}
			logger.debug("simulateOrder ends");
		}
		return ret;
	}
	
	// helper methods
	//

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
