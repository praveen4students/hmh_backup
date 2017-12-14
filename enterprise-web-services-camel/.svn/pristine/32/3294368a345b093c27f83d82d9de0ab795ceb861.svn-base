package hmh.ws.controller;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.xml.ws.Holder;

import hmh.sap.rfc.FindTransaction_PortType;
import hmh.sap.rfc.GetInvoices_PortType;
import hmh.sap.rfc.GetShipment_PortType;
import hmh.sap.rfc.GetTransactionDetail_PortType;
import hmh.sap.rfc.SendInvoiceEmailPdf_PortType;
import hmh.sap.rfc.Solisti1Type;
import hmh.sap.rfc.Z_Rfc_Find_Transaction_Input;
import hmh.sap.rfc.Z_Rfc_Find_Transaction_Output;
import hmh.sap.rfc.Z_Rfc_Get_Invoices_Input;
import hmh.sap.rfc.Z_Rfc_Get_Invoices_Output;
import hmh.sap.rfc.Z_Rfc_Get_Shipment_Input;
import hmh.sap.rfc.Z_Rfc_Get_Shipment_Output;
import hmh.sap.rfc.Z_Rfc_Get_Trans_Detail_Input;
import hmh.sap.rfc.Z_Rfc_Get_Trans_Detail_Output;
import hmh.sap.rfc.Z_Rfc_Send_Invoice_Email_Pdf_Input;
import hmh.sap.rfc.Z_Rfc_Send_Invoice_Email_Pdf_Output;
import hmh.sap.rfc.Zbdcmsgcoll_RfcType;
import hmh.sap.rfc.ZemailType;
import hmh.sap.rfc.ZvaddrType;
import hmh.sap.rfc.Zvbeln_TidType;
import hmh.sap.rfc.ZvemailType;
import hmh.sap.rfc.Zvfindtrans_IpType;
import hmh.sap.rfc.Zvgetinvoice_HType;
import hmh.sap.rfc.Zvgetinvoice_LType;
import hmh.sap.rfc.Zvgetshipment_DType;
import hmh.sap.rfc.Zvgetshipment_HType;
import hmh.sap.rfc.ZvparvwType;
import hmh.sap.rfc.Zvsales_Order_HType;
import hmh.sap.rfc.Zvso_LineitemType;
import hmh.sap.rfc.ZvsrType;
import hmh.sap.rfc.ZvsubscriptionType;
import hmh.sap.rfc.ZvtrackingType;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.sap.aii.proxy.framework.core.ApplicationFaultException;
import com.sap.aii.proxy.framework.core.SystemFaultException;
import com.sap.mw.jco.JCO;


public class TransactionBean implements InitializingBean, DisposableBean {
	
	private static final Logger logger = Logger.getLogger(TransactionBean.class);

		
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
	
	
	private static final String POOL_NAME = "TransactionPool";
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
		TransactionBean test = new TransactionBean();
		
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
			
	
	public String getTransactionDetail(
				String[] tranIDs,
				Holder<Zvsales_Order_HType[]> T_Gt_HeadHolder,
				Holder<Zvso_LineitemType[]> T_Gt_ItemHolder,
				Holder<ZvaddrType[]> T_Gt_AddrHolder,
				Holder<ZvsubscriptionType[]>  T_Gt_SubHolder,
				Holder<ZvsrType[]> T_SrepHolder,
				Holder<ZvemailType[]> T_Email)	
		throws ApplicationFaultException, SystemFaultException
	{
		logger.debug("getTransactionDetail begin");
		
		/*
        logger.debug("waiting...");        	
		try {
			Thread t = Thread.currentThread();
			t.sleep(300000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        logger.debug("done");        	
		*/
		
		JCO.Client jcoClient = null;
		String ret = "";
		try {
			
	        // Get a client from the pool
	        //jcoClient = JCO.getClient(sid);
			logger.debug("get client from pool " + sapSID);
	        jcoClient = poolManager.getClient(sapSID);
				
			// making input
			Z_Rfc_Get_Trans_Detail_Input input = new Z_Rfc_Get_Trans_Detail_Input();
			Zvbeln_TidType[] T_Tid = new Zvbeln_TidType[tranIDs.length];
			int i=0;
			for (String vbeln : tranIDs ) {
				Zvbeln_TidType t = new Zvbeln_TidType();
				t.setVbeln(vbeln);
				T_Tid[i++] = t;
			}
			input.setT_Tid(T_Tid);			
			
			GetTransactionDetail_PortType myProxy = new GetTransactionDetail_PortType();
			myProxy.messageSpecifier.setJcoClient(jcoClient);
	
			Z_Rfc_Get_Trans_Detail_Output output = myProxy.z_Rfc_Get_Trans_Detail(input);
	
			// outputs
			T_Gt_HeadHolder.value = output.getT_Gt_Head();
			T_Gt_ItemHolder.value = output.getT_Gt_Item();
			T_Gt_AddrHolder.value = output.getT_Gt_Addr();
			T_Gt_SubHolder.value = output.getT_Gt_Sub();
			T_SrepHolder.value = output.getT_Srep();
			T_Email.value = output.getT_Email();
			
			ret = output.getE_Return();
		} 
		/*
		catch (ApplicationFaultException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (SystemFaultException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	    finally {
	        // Release the client to the pool
	        if (jcoClient != null) {
	        	//JCO.releaseClient(jcoClient);
				logger.debug("release client from pool ");
	        	poolManager.releaseClient(jcoClient);
	        }
			logger.debug("getTransactionDetail ends");
	    }
		
		return ret;
	}

	
	public String getShipment(
			String[] tranIDs,
			Holder<Zvgetshipment_HType[]> T_Delivery_HHolder,
			Holder<Zvgetshipment_DType[]> T_Delivery_DHolder,
			Holder<ZvtrackingType[]> T_TrackingHolder)	
		throws ApplicationFaultException, SystemFaultException
	{
		logger.debug("getShipment begin");
		
		JCO.Client jcoClient = null;
		String ret = "";
		try {
			
			logger.debug("get client from pool " + sapSID);
	        jcoClient = poolManager.getClient(sapSID);
				
			// making input
	        Z_Rfc_Get_Shipment_Input input = new Z_Rfc_Get_Shipment_Input();
			Zvbeln_TidType[] T_Tid = new Zvbeln_TidType[tranIDs.length];
			int i=0;
			for (String vbeln : tranIDs ) {
				Zvbeln_TidType t = new Zvbeln_TidType();
				t.setVbeln(vbeln);
				T_Tid[i++] = t;
			}
			input.setT_Tid(T_Tid);			
			
			GetShipment_PortType myProxy = new GetShipment_PortType();			
			myProxy.messageSpecifier.setJcoClient(jcoClient);
	
			Z_Rfc_Get_Shipment_Output output = myProxy.z_Rfc_Get_Shipment(input);
	
			// outputs
			T_Delivery_HHolder.value = output.getT_Delivery_H();
			T_Delivery_DHolder.value = output.getT_Delivery_D();
			T_TrackingHolder.value = output.getT_Tracking();
			
			ret = output.getE_Return();
		} 
	    finally {
	        // Release the client to the pool
	        if (jcoClient != null) {
	        	//JCO.releaseClient(jcoClient);
				logger.debug("release client from pool ");
	        	poolManager.releaseClient(jcoClient);
	        }
			logger.debug("getShipment ends");
	    }
		
		return ret;
	}

	
	public String getInvoices(
			String[] tranIDs,
			Holder<Zvgetinvoice_HType[]> T_BilldocheadHolder,
			Holder<Zvgetinvoice_LType[]> T_BilldocdetailHolder,
			Holder<ZvsubscriptionType[]> T_SubsHolder)	
		throws ApplicationFaultException, SystemFaultException
	{
		logger.debug("getInvoices begin");
		
		JCO.Client jcoClient = null;
		String ret = "";
		try {
			
			logger.debug("get client from pool " + sapSID);
	        jcoClient = poolManager.getClient(sapSID);
				
			// making input
	        Z_Rfc_Get_Invoices_Input input = new Z_Rfc_Get_Invoices_Input();
			Zvbeln_TidType[] T_Tid = new Zvbeln_TidType[tranIDs.length];
			int i=0;
			for (String vbeln : tranIDs ) {
				Zvbeln_TidType t = new Zvbeln_TidType();
				t.setVbeln(vbeln);
				T_Tid[i++] = t;
			}
			input.setT_Tid(T_Tid);			
			
			GetInvoices_PortType myProxy = new GetInvoices_PortType();			
			myProxy.messageSpecifier.setJcoClient(jcoClient);
	
			Z_Rfc_Get_Invoices_Output output = myProxy.z_Rfc_Get_Invoices(input);
	
			// outputs
			T_BilldocheadHolder.value = output.getT_Billdochead();
			T_BilldocdetailHolder.value = output.getT_Billdocdetail();
			T_SubsHolder.value = output.getT_Subs();
			
			ret = output.getE_Return();
		} 
	    finally {
	        // Release the client to the pool
	        if (jcoClient != null) {
	        	//JCO.releaseClient(jcoClient);
				logger.debug("release client from pool ");
	        	poolManager.releaseClient(jcoClient);
	        }
			logger.debug("getInvoices ends");
	    }
		
		return ret;
	}

	
	public String findTransaction(
			Zvfindtrans_IpType I_Input,			
			Holder<Zvsales_Order_HType[]> T_Sales_HHolder,
			Holder<Zvso_LineitemType[]> T_Sales_DHolder,
			Holder<ZvaddrType[]> T_AddrHolder,
			Holder<ZvsubscriptionType[]> T_SubsHolder,
			Holder<ZvsrType[]> T_SrepHolder,
			Holder<ZvparvwType[]> T_ParvwHolder,
			Holder<ZvemailType[]> T_EmailHolder,
			Holder<Zbdcmsgcoll_RfcType> E_ReturnHolder)	
		throws ApplicationFaultException, SystemFaultException
	{
		logger.debug("findTransaction begin");
		
		JCO.Client jcoClient = null;
		String ret = "";
		try {
			
			logger.debug("get client from pool " + sapSID);
	        jcoClient = poolManager.getClient(sapSID);
				
			// making input
	        Z_Rfc_Find_Transaction_Input input = new Z_Rfc_Find_Transaction_Input();
	        input.setI_Input(I_Input);
	        input.setT_Parvw(T_ParvwHolder.value);
			
	        FindTransaction_PortType myProxy = new FindTransaction_PortType();			
			myProxy.messageSpecifier.setJcoClient(jcoClient);
	
			Z_Rfc_Find_Transaction_Output output = myProxy.z_Rfc_Find_Transaction(input);
	
			// outputs
			T_Sales_HHolder.value = output.getT_Sales_H();
			T_Sales_DHolder.value = output.getT_Sales_D();
			T_AddrHolder.value = output.getT_Addr();
			T_SubsHolder.value = output.getT_Subs();
			T_SrepHolder.value = output.getT_Srep();
			T_ParvwHolder.value = output.getT_Parvw();
			T_EmailHolder.value = output.getT_Email();
			E_ReturnHolder.value = output.getE_Return();
			
			ret = output.getE_Result();
		} 
	    finally {
	        // Release the client to the pool
	        if (jcoClient != null) {
	        	//JCO.releaseClient(jcoClient);
				logger.debug("release client from pool ");
	        	poolManager.releaseClient(jcoClient);
	        }
			logger.debug("findTransaction ends");
	    }
		
		return ret;
	}


	public Zbdcmsgcoll_RfcType sendInvoiceEmailPdf(
			String Invoice_No,		
			String Request_Type,
			String Email_Subject,
			List<String> listTo,
			List<String> listCC,
			String body,
			//Holder<String> Pdf_StringHolder
			Holder<byte[]> byteArrayHolder)
		throws ApplicationFaultException, SystemFaultException
	{
		logger.debug("sendInvoiceEmailPdf begin");
		
		JCO.Client jcoClient = null;
		Zbdcmsgcoll_RfcType ret = null;
		
		try {
			
			logger.debug("get client from pool " + sapSID);
	        jcoClient = poolManager.getClient(sapSID);
				
			// making input
	        Z_Rfc_Send_Invoice_Email_Pdf_Input input = new Z_Rfc_Send_Invoice_Email_Pdf_Input();
	        input.setInvoice_No(Invoice_No);
	        input.setRequest_Type(Request_Type);
	        input.setEmail_Subject(Email_Subject);
	        
	        ZemailType[] Email_Id_To_T = toZemailType(listTo);
	        input.setEmail_Id_To(Email_Id_To_T);
	        
	        ZemailType[] Email_Id_Cc_T = toZemailType(listCC);
	        input.setEmail_Id_Cc(Email_Id_Cc_T);
	        
	        if (body != null) {
	        	Solisti1Type[] Email_Text_T = toSolisti1Type(getParts(body, 255));
	        	input.setEmail_Text(Email_Text_T);
	        }
	        
	        SendInvoiceEmailPdf_PortType myProxy = new SendInvoiceEmailPdf_PortType();			
			myProxy.messageSpecifier.setJcoClient(jcoClient);
	
			Z_Rfc_Send_Invoice_Email_Pdf_Output output = myProxy.z_Rfc_Send_Invoice_Email_Pdf(input);
	
			// outputs
			//Solisti1Type[] Pdf_String_T = output.getPdf_String();
			//String Pdf_String = toStringType(Pdf_String_T);
			//Pdf_StringHolder.value = Pdf_String;
			byteArrayHolder.value = output.getE_Bin_File();
			
			ret = output.getE_Return();
		} 
	    finally {
	        // Release the client to the pool
	        if (jcoClient != null) {
	        	//JCO.releaseClient(jcoClient);
				logger.debug("release client from pool ");
	        	poolManager.releaseClient(jcoClient);
	        }
			logger.debug("sendInvoiceEmailPdf ends");
	    }
		
		return ret;
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
	
    ZemailType[] toZemailType(List<String> emails) {
	    ZemailType[] EmailTypes = new ZemailType[emails.size()];
		int i=0;
		for (String email : emails ) {
			ZemailType t = new ZemailType();
			t.setSmtp_Addr(email);
			EmailTypes[i++] = t;
		}
		return EmailTypes;
    }
	

    private static List<String> getParts(String body, int partitionSize) {
        List<String> parts = new ArrayList<String>();
        int len = body.length();
        for (int i=0; i<len; i+=partitionSize)
        {
            parts.add(body.substring(i, Math.min(len, i + partitionSize)));
        }
        return parts;
    }
    
    Solisti1Type[] toSolisti1Type(List<String> texts) {
    	Solisti1Type[] types = new Solisti1Type[texts.size()];
		int i=0;
		for (String s : texts ) {
			Solisti1Type t = new Solisti1Type();
			t.setLine(s);
			types[i++] = t;
		}
		return types;
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
    
    String[] toStringTypeArray(Solisti1Type[] texts) {
    	String[] types = new String[texts.length];
		int i=0;
		for (Solisti1Type t : texts ) {
			types[i++] = t.getLine();
		}
		return types;
    }

    String toStringType(Solisti1Type[] texts) {
    	StringBuilder sb = new StringBuilder();
		for (Solisti1Type t : texts ) {
			sb.append(t.getLine());
		}
		return sb.toString();
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
