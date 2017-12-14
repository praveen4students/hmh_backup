package hmh.sap.rfc;


public class FindEtailCustomer_PortType extends com.sap.aii.proxy.framework.core.AbstractProxy{

    private  static final com.sap.aii.proxy.framework.core.BaseProxyDescriptor staticDescriptor = com.sap.aii.proxy.framework.core.BaseProxyDescriptorFactory.createNewBaseProxyDescriptor("urn:sap-com:document:sap:rfc:functions:FindEtailCustomer.PortType", new java.lang.Object[][][]{{{"Z_RFC_FIND_ETAIL_CUST", "z_Rfc_Find_Etail_Cust", "Z_RFC_FIND_ETAIL_CUST"}, {"urn:sap-com:document:sap:rfc:functions:Z_RFC_FIND_ETAIL_CUST.Input", "hmh.sap.rfc.Z_Rfc_Find_Etail_Cust_Input"}, {"urn:sap-com:document:sap:rfc:functions:Z_RFC_FIND_ETAIL_CUST.Output", "hmh.sap.rfc.Z_Rfc_Find_Etail_Cust_Output"}}}, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, hmh.sap.rfc.FindEtailCustomer_PortType.class) ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1326921363429L) ;

    public  FindEtailCustomer_PortType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public hmh.sap.rfc.Z_Rfc_Find_Etail_Cust_Output z_Rfc_Find_Etail_Cust(hmh.sap.rfc.Z_Rfc_Find_Etail_Cust_Input Z_Rfc_Find_Etail_Cust_Input) throws com.sap.aii.proxy.framework.core.ApplicationFaultException, com.sap.aii.proxy.framework.core.SystemFaultException{
        com.sap.aii.proxy.framework.core.BaseType $result = null;
        try {
        $result = send$(Z_Rfc_Find_Etail_Cust_Input, "urn:sap-com:document:sap:rfc:functions", "FindEtailCustomer.PortType", "Z_RFC_FIND_ETAIL_CUST", new hmh.sap.rfc.Z_Rfc_Find_Etail_Cust_Output());
        }catch (com.sap.aii.proxy.framework.core.ApplicationFaultException e){
         throw createExceptionWrongExceptionType$(e);}
        if (($result == null) || ($result instanceof hmh.sap.rfc.Z_Rfc_Find_Etail_Cust_Output)){
        return (hmh.sap.rfc.Z_Rfc_Find_Etail_Cust_Output)$result;
        } else { throw createExceptionWrongType$($result);}
    }

}
