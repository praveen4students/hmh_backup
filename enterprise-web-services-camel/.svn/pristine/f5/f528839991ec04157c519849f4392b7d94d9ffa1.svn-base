package hmh.ws.controller;

import hmh.sap.rfc.AccountStatementPDF_PortType;
import hmh.sap.rfc.Bapireturn1Type;
import hmh.sap.rfc.CreateEtailCustomer_PortType;
import hmh.sap.rfc.CreateSundryCustomer_PortType;
import hmh.sap.rfc.FindEtailCustomer_PortType;
import hmh.sap.rfc.GetCustomerDetail_PortType;
import hmh.sap.rfc.GetCustomerRelationships_PortType;
import hmh.sap.rfc.GetCustomerSubstitutions_PortType;
import hmh.sap.rfc.Solisti1Type;
import hmh.sap.rfc.Z_RFC_CREATE_CUSTOMER_PortType;
import hmh.sap.rfc.Z_RFC_UPDATE_CUSTOMER_PortType;
import hmh.sap.rfc.Z_Rfc_Create_Customer_Input;
import hmh.sap.rfc.Z_Rfc_Create_Customer_Output;
import hmh.sap.rfc.Z_Rfc_Create_Etail_Customer_Input;
import hmh.sap.rfc.Z_Rfc_Create_Etail_Customer_Output;
import hmh.sap.rfc.Z_Rfc_Create_Sundry_Customer_Input;
import hmh.sap.rfc.Z_Rfc_Create_Sundry_Customer_Output;
import hmh.sap.rfc.Z_Rfc_Find_Etail_Cust_Input;
import hmh.sap.rfc.Z_Rfc_Find_Etail_Cust_Output;
import hmh.sap.rfc.Z_Rfc_Get_Cust_Details_Input;
import hmh.sap.rfc.Z_Rfc_Get_Cust_Details_Output;
import hmh.sap.rfc.Z_Rfc_Get_Cust_Relationships_Input;
import hmh.sap.rfc.Z_Rfc_Get_Cust_Relationships_Output;
import hmh.sap.rfc.Z_Rfc_Get_Cust_Substitutions_Input;
import hmh.sap.rfc.Z_Rfc_Get_Cust_Substitutions_Output;
import hmh.sap.rfc.Z_Rfc_Send_Account_Statement_Input;
import hmh.sap.rfc.Z_Rfc_Send_Account_Statement_Output;
import hmh.sap.rfc.Z_Rfc_Update_Customer_Input;
import hmh.sap.rfc.Z_Rfc_Update_Customer_Output;
import hmh.sap.rfc.Z_Vi_Sl_Sales_Samples_Sub_Output;
import hmh.sap.rfc.Zbdcmsgcoll_RfcType;
import hmh.sap.rfc.Zcust_AddressType;
import hmh.sap.rfc.Zcust_Address_WpType;
import hmh.sap.rfc.ZemailType;
import hmh.sap.rfc.ZvcustomersType;
import hmh.sap.rfc.ZvcustsubType;
import hmh.sap.rfc.ZvetailcustType;
import hmh.sap.rfc.ZvgetcustType;
import hmh.sap.rfc.ZvmaterialsType;
import hmh.sap.rfc.ZvrelationType;
import hmh.util.Transaction_Constants;

import java.util.List;

import javax.xml.ws.Holder;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.sap.aii.proxy.framework.core.ApplicationFaultException;
import com.sap.aii.proxy.framework.core.SystemFaultException;
import com.sap.mw.jco.JCO;


public class CustomerBean implements InitializingBean, DisposableBean {
	
	private static final Logger logger = Logger.getLogger(CustomerBean.class);

		
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

	
	private static final String POOL_NAME = "CustomerPool";
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
			
	
	public String getCustomerDetail(
				ZvgetcustType[] T_Getcust,
				Holder<hmh.sap.rfc.ZvcustdetailsType[]> T_CustdetailsHolder,
				Holder<hmh.sap.rfc.ZvdivinfoType[]> T_DivinfoHolder,
				Holder<hmh.sap.rfc.Zvemail2Type[]> T_EmailHolder,
				Holder<hmh.sap.rfc.Zbdcmsgcoll_RfcType []> T_Bdcmsgcoll)
		throws ApplicationFaultException, SystemFaultException
	{
		logger.debug("getCustomerDetail begin");
		
		JCO.Client jcoClient = null;
		String ret = Transaction_Constants.EMPTY;
		try {
			
	        // Get a client from the pool
	        //jcoClient = JCO.getClient(sid);
			logger.debug("get client from pool " + sapSID);
	        jcoClient = poolManager.getClient(sapSID);
				
			// making input
	        Z_Rfc_Get_Cust_Details_Input input = new Z_Rfc_Get_Cust_Details_Input();
			input.setT_Getcust(T_Getcust);			
			
			GetCustomerDetail_PortType myProxy = new GetCustomerDetail_PortType();
			myProxy.messageSpecifier.setJcoClient(jcoClient);
	
			Z_Rfc_Get_Cust_Details_Output output = myProxy.z_Rfc_Get_Cust_Details(input);
	
			// outputs
			T_CustdetailsHolder.value = output.getT_Custdetails();
			T_DivinfoHolder.value = output.getT_Divinfo();
			T_EmailHolder.value = output.getT_Email();
			T_Bdcmsgcoll.value = output.getT_Bdcmsgcoll();
			
			ret = output.getE_Status();
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
		
		return ret;
	}

	
	public String getCustomerRelationships(
			String customerID,
			String division,
			ZvrelationType[] T_Relation,
			Holder<ZvcustomersType[]> T_CustomersHolder,
			Holder<Zbdcmsgcoll_RfcType[]> T_Bdcmsgcoll)
	throws ApplicationFaultException, SystemFaultException
	{
		logger.debug("getCustomerRelationships begin");
		
		JCO.Client jcoClient = null;
		String ret = Transaction_Constants.EMPTY;
		try {
			
	        // Get a client from the pool
	        //jcoClient = JCO.getClient(sid);
			logger.debug("get client from pool " + sapSID);
	        jcoClient = poolManager.getClient(sapSID);
				
			// making input
	        Z_Rfc_Get_Cust_Relationships_Input input = new Z_Rfc_Get_Cust_Relationships_Input();
			input.setI_Kunnr(customerID);
			input.setI_Spart(division);
			input.setT_Relation(T_Relation);
			
			GetCustomerRelationships_PortType myProxy = new GetCustomerRelationships_PortType();
			myProxy.messageSpecifier.setJcoClient(jcoClient);
	
			Z_Rfc_Get_Cust_Relationships_Output output = myProxy.z_Rfc_Get_Cust_Relationships(input);

			// outputs
			T_CustomersHolder.value = output.getT_Customers();
			T_Bdcmsgcoll.value = output.getT_Bdcmsgcoll();
			ret = output.getE_Status();
			
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
		
		return ret;
	}


	public String getCustomerSubstitutions(
			String customerID,
			String division,
			String transactionType,
			String[] materialNums,
			Holder<ZvcustsubType[]> T_Custsub)
	throws ApplicationFaultException, SystemFaultException
	{
		logger.debug("getCustomerSubstitutions begin");
		
		JCO.Client jcoClient = null;
		String ret = Transaction_Constants.EMPTY;
		try {
			
	        // Get a client from the pool
	        //jcoClient = JCO.getClient(sid);
			logger.debug("get client from pool " + sapSID);
	        jcoClient = poolManager.getClient(sapSID);
				
			// making input
	        Z_Rfc_Get_Cust_Substitutions_Input input = new Z_Rfc_Get_Cust_Substitutions_Input();
			input.setI_Kunnr(customerID);
			input.setI_Division(division);
			input.setT_Materials(toZvmaterialsType(materialNums));
			
			GetCustomerSubstitutions_PortType myProxy = new GetCustomerSubstitutions_PortType();
			myProxy.messageSpecifier.setJcoClient(jcoClient);
	
			Z_Rfc_Get_Cust_Substitutions_Output output = myProxy.z_Rfc_Get_Cust_Substitutions(input);

			// outputs
			T_Custsub.value = output.getT_Custsub();
			ret = output.getE_Status();
		} 
	    finally {
	        // Release the client to the pool
	        if (jcoClient != null) {
	        	//JCO.releaseClient(jcoClient);
				logger.debug("release client from pool ");
	        	poolManager.releaseClient(jcoClient);
	        }
			logger.debug("getCustomerSubstitutions ends");
	    }
		
		return ret;
	}

	
	public String createEtailCustomer(
			String I_Customer_Name,
			Zcust_AddressType I_Sold_To_Addr,
			Zcust_AddressType I_Bill_To_Addr,
			Zcust_AddressType I_Ship_To_Addr,
			String I_Email,
			String I_Store_Id,
			String I_Telephone,
			Holder<String> E_Sold_To_Custno,
			Holder<String> E_Ship_To_Custno,
			Holder<String> E_Bill_To_Custno,
			Holder<Zbdcmsgcoll_RfcType[]> T_Bdcmsgcoll)			
	throws ApplicationFaultException, SystemFaultException
	{
		logger.debug("createEtailCustomer begin");
		
		JCO.Client jcoClient = null;
		String ret = Transaction_Constants.EMPTY;
		try {
			
	        // Get a client from the pool
	        //jcoClient = JCO.getClient(sid);
			logger.debug("get client from pool " + sapSID);
	        jcoClient = poolManager.getClient(sapSID);
				
			// making input
	        Z_Rfc_Create_Etail_Customer_Input input = new Z_Rfc_Create_Etail_Customer_Input();
	        input.setI_Customer_Name(I_Customer_Name);
	        input.setI_Sold_To_Addr(I_Sold_To_Addr);
	        input.setI_Ship_To_Addr(I_Ship_To_Addr);
	        input.setI_Bill_To_Addr(I_Bill_To_Addr);
	        input.setI_Email(I_Email);
	        input.setI_Store_Id(I_Store_Id);
	        input.setI_Telephone_1(I_Telephone);
	        			
			CreateEtailCustomer_PortType myProxy = new CreateEtailCustomer_PortType();
			myProxy.messageSpecifier.setJcoClient(jcoClient);
	
			Z_Rfc_Create_Etail_Customer_Output output = myProxy.z_Rfc_Create_Etail_Customer(input);

			// outputs
			E_Sold_To_Custno.value = output.getE_Sold_To_Custno();
			E_Ship_To_Custno.value = output.getE_Ship_To_Custno();
			E_Bill_To_Custno.value = output.getE_Bill_To_Custno();
			ret = output.getE_Error_Code();
			T_Bdcmsgcoll.value = output.getT_Return_Tab();
			
		} 
	    finally {
	        // Release the client to the pool
	        if (jcoClient != null) {
	        	//JCO.releaseClient(jcoClient);
				logger.debug("release client from pool ");
	        	poolManager.releaseClient(jcoClient);
	        }
			logger.debug("createEtailCustomer ends");
	    }
		
		return ret;
	}
	

	public String createSundryCustomer(
			String I_College_No,
			String I_Customer_Name,
			String I_Division,
			String I_Email,
			String I_Fax,
			String I_Sales_Territory,
			String I_Sfa_Rep_Id,
			Zcust_AddressType I_Ship_To_Addr,
			String I_Telephone_1,
			String I_Telephone_2,			
			Holder<String> E_Ship_To_Custno,
			Holder<Zbdcmsgcoll_RfcType[]> T_Bdcmsgcoll)
	throws ApplicationFaultException, SystemFaultException
	{
		logger.debug("createSundryCustomer begin");
		
		JCO.Client jcoClient = null;
		String ret = Transaction_Constants.EMPTY;
		try {
			
	        // Get a client from the pool
	        //jcoClient = JCO.getClient(sid);
			logger.debug("get client from pool " + sapSID);
	        jcoClient = poolManager.getClient(sapSID);
				
			// making input
	        Z_Rfc_Create_Sundry_Customer_Input input = new Z_Rfc_Create_Sundry_Customer_Input();
	        input.setI_College_No(I_College_No);
	        input.setI_Customer_Name(I_Customer_Name);
	        input.setI_Division(I_Division);
	        input.setI_Email(I_Email);
	        input.setI_Fax(I_Fax);
	        input.setI_Sales_Territory(I_Sales_Territory);
	        input.setI_Sfa_Rep_Id(I_Sfa_Rep_Id);
	        input.setI_Ship_To_Addr(I_Ship_To_Addr);
	        input.setI_Telephone_1(I_Telephone_1);
	        input.setI_Telephone_2(I_Telephone_2);
	        	                			
	        CreateSundryCustomer_PortType myProxy = new CreateSundryCustomer_PortType();
			myProxy.messageSpecifier.setJcoClient(jcoClient);
	
			Z_Rfc_Create_Sundry_Customer_Output output = myProxy.z_Rfc_Create_Sundry_Customer(input);

			// outputs
			E_Ship_To_Custno.value = output.getE_Ship_To_Custno();
			ret = output.getE_Error_Code();
			T_Bdcmsgcoll.value = output.getT_Return_Tab();
		} 
	    finally {
	        // Release the client to the pool
	        if (jcoClient != null) {
	        	//JCO.releaseClient(jcoClient);
				logger.debug("release client from pool ");
	        	poolManager.releaseClient(jcoClient);
	        }
			logger.debug("createSundryCustomer ends");
	    }
		
		return ret;
	}

	
	public String findEtailCustomer(
			String I_Address,
			String I_Name1,
			String I_Division,
			String I_Zip,
			Holder<ZvetailcustType[]> T_Customers,
			Holder<Zbdcmsgcoll_RfcType[]> T_Bdcmsgcoll)
	throws ApplicationFaultException, SystemFaultException
	{
		logger.debug("findEtailCustomer begin");
		
		JCO.Client jcoClient = null;
		String ret = Transaction_Constants.EMPTY;
		try {
			
	        // Get a client from the pool
	        //jcoClient = JCO.getClient(sid);
			logger.debug("get client from pool " + sapSID);
	        jcoClient = poolManager.getClient(sapSID);
				
			// making input
	        Z_Rfc_Find_Etail_Cust_Input input = new Z_Rfc_Find_Etail_Cust_Input();
	        input.setI_Address(I_Address);
	        input.setI_Name1(I_Name1);
	        input.setI_Spart(I_Division);
	        input.setI_Zip(I_Zip);
	        	        	                			
	        FindEtailCustomer_PortType myProxy = new FindEtailCustomer_PortType();
			myProxy.messageSpecifier.setJcoClient(jcoClient);
	
			Z_Rfc_Find_Etail_Cust_Output output = myProxy.z_Rfc_Find_Etail_Cust(input);

			// outputs
			T_Customers.value = output.getT_Customers();
			T_Bdcmsgcoll.value = output.getT_Bdcmsgcoll();
			ret = output.getE_Status();
		} 
	    finally {
	        // Release the client to the pool
	        if (jcoClient != null) {
	        	//JCO.releaseClient(jcoClient);
				logger.debug("release client from pool ");
	        	poolManager.releaseClient(jcoClient);
	        }
			logger.debug("findEtailCustomer ends");
	    }
		
		return ret;
	}
	
	
	public Zbdcmsgcoll_RfcType accountStatementPDF(
			String Bill_To_Customer,
			String[] Email_Id_To,
			String[] Email_Id_Cc,
			String Email_Subject,
			String Email_Text)
	throws ApplicationFaultException, SystemFaultException
	{
		logger.debug("findEtailCustomer begin");
		
		JCO.Client jcoClient = null;
		Zbdcmsgcoll_RfcType ret = null;
		try {
			
	        // Get a client from the pool
	        //jcoClient = JCO.getClient(sid);
			logger.debug("get client from pool " + sapSID);
	        jcoClient = poolManager.getClient(sapSID);
				
			// making input
	        Z_Rfc_Send_Account_Statement_Input input = new Z_Rfc_Send_Account_Statement_Input();
	        input.setBill_To_Customer(Bill_To_Customer);
	        input.setEmail_Id_To(toZemailType(Email_Id_To));
	        input.setEmail_Id_Cc(toZemailType(Email_Id_Cc));
	        input.setEmail_Subject(Email_Subject);	        
	        input.setEmail_Text(toSolisti1Type(split(Email_Text, 255)));
	        	        	                			
	        AccountStatementPDF_PortType myProxy = new AccountStatementPDF_PortType();
			myProxy.messageSpecifier.setJcoClient(jcoClient);
	
			Z_Rfc_Send_Account_Statement_Output output = myProxy.z_Rfc_Send_Account_Statement(input);

			// outputs
			ret = output.getE_Return();
		} 
	    finally {
	        // Release the client to the pool
	        if (jcoClient != null) {
	        	//JCO.releaseClient(jcoClient);
				logger.debug("release client from pool ");
	        	poolManager.releaseClient(jcoClient);
	        }
			logger.debug("findEtailCustomer ends");
	    }
		
		return ret;
	}
	
	public String updateCustomer(
			Zcust_Address_WpType I_Addr,
			String I_Customer_No, Holder<Bapireturn1Type[]> returnList)
	throws ApplicationFaultException, SystemFaultException
	{
		logger.debug("updateCustomer begin");
		
		JCO.Client jcoClient = null;
		String ret = null;
		try {
			
	        // Get a client from the pool
	        //jcoClient = JCO.getClient(sid);
			logger.debug("get client from pool " + sapSID);
	        jcoClient = poolManager.getClient(sapSID);
				
			// making input
	        Z_Rfc_Update_Customer_Input input = new Z_Rfc_Update_Customer_Input();
			input.setI_Addr(I_Addr);
			input.setI_Customer_No(I_Customer_No);
	        
			logger.debug("SAP INPUT " + input.toXml(input.getClass().getName(), Transaction_Constants.EMPTY));        	                			
			
	        Z_RFC_UPDATE_CUSTOMER_PortType myProxy = new Z_RFC_UPDATE_CUSTOMER_PortType();
			myProxy.messageSpecifier.setJcoClient(jcoClient);
	
			Z_Rfc_Update_Customer_Output output = myProxy.z_Rfc_Update_Customer(input);
			
			logger.debug("SAP OUTPUT " + output.toXml(output.getClass().getName(), Transaction_Constants.EMPTY));
			
			returnList.value = output.getT_Return();
			ret = output.getO_Customer_No();
			logger.info("SoldToCustNo ::: " + output.getO_Customer_No());
		} 
	    finally {
	        // Release the client to the pool
	        if (jcoClient != null) {
	        	//JCO.releaseClient(jcoClient);
				logger.debug("release client from pool ");
	        	poolManager.releaseClient(jcoClient);
	        }
			logger.debug("updateCustomer ends");
	    }
		
		return ret;
	}
	
	public String createCustomer(
			Zcust_Address_WpType I_Sold_To_Addr,
			String I_Store_Id, String I_Ecomm_User_Name, Holder<Bapireturn1Type[]> returnList)
	throws ApplicationFaultException, SystemFaultException
	{
		logger.debug("createCustomer begin");
		
		JCO.Client jcoClient = null;
		String ret = null;
		try {
			
	        // Get a client from the pool
	        //jcoClient = JCO.getClient(sid);
			logger.debug("get client from pool " + sapSID);
	        jcoClient = poolManager.getClient(sapSID);
				
			// making input
	        Z_Rfc_Create_Customer_Input input = new Z_Rfc_Create_Customer_Input();
			input.setI_Sold_To_Addr(I_Sold_To_Addr);
			input.setI_Store_Id(I_Store_Id);
			input.setI_Ecomm_User_Name(I_Ecomm_User_Name);
	        
			logger.debug("SAP INPUT :: " + input.toXml(input.getClass().getName(), Transaction_Constants.EMPTY));

	        	        	                			
	        Z_RFC_CREATE_CUSTOMER_PortType myProxy = new Z_RFC_CREATE_CUSTOMER_PortType();
			myProxy.messageSpecifier.setJcoClient(jcoClient);
	
			Z_Rfc_Create_Customer_Output output = myProxy.z_Rfc_Create_Customer(input);
			
			logger.debug("SAP OUTPUT " + output.toXml(output.getClass().getName(), Transaction_Constants.EMPTY));
			returnList.value = output.getT_Return();
			ret = output.getE_Sold_To_Custno();
			logger.info("SoldToCustNo ::: " + output.getE_Sold_To_Custno());
		} 
	    finally {
	        // Release the client to the pool
	        if (jcoClient != null) {
	        	//JCO.releaseClient(jcoClient);
				logger.debug("release client from pool ");
	        	poolManager.releaseClient(jcoClient);
	        }
			logger.debug("createCustomer ends");
	    }
		
		return ret;
	}
	
	
	// unfinished !!! needs to move to CustomerImpl
	//
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
			T_Materials[i++] = t;
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
