package hmh.sap.rfc;


public class FindTransaction_PortType extends com.sap.aii.proxy.framework.core.AbstractProxy{

    private  static final com.sap.aii.proxy.framework.core.BaseProxyDescriptor staticDescriptor = com.sap.aii.proxy.framework.core.BaseProxyDescriptorFactory.createNewBaseProxyDescriptor("urn:sap-com:document:sap:rfc:functions:FindTransaction.PortType", new java.lang.Object[][][]{{{"Z_RFC_FIND_TRANSACTION", "z_Rfc_Find_Transaction", "Z_RFC_FIND_TRANSACTION"}, {"urn:sap-com:document:sap:rfc:functions:Z_RFC_FIND_TRANSACTION.Input", "sap.rfc.Z_Rfc_Find_Transaction_Input"}, {"urn:sap-com:document:sap:rfc:functions:Z_RFC_FIND_TRANSACTION.Output", "sap.rfc.Z_Rfc_Find_Transaction_Output"}}}, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, hmh.sap.rfc.FindTransaction_PortType.class) ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1322525270577L) ;

    public  FindTransaction_PortType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public hmh.sap.rfc.Z_Rfc_Find_Transaction_Output z_Rfc_Find_Transaction(hmh.sap.rfc.Z_Rfc_Find_Transaction_Input Z_Rfc_Find_Transaction_Input) throws com.sap.aii.proxy.framework.core.ApplicationFaultException, com.sap.aii.proxy.framework.core.SystemFaultException{
        com.sap.aii.proxy.framework.core.BaseType $result = null;
        try {
        $result = send$(Z_Rfc_Find_Transaction_Input, "urn:sap-com:document:sap:rfc:functions", "FindTransaction.PortType", "Z_RFC_FIND_TRANSACTION", new hmh.sap.rfc.Z_Rfc_Find_Transaction_Output());
        }catch (com.sap.aii.proxy.framework.core.ApplicationFaultException e){
         throw createExceptionWrongExceptionType$(e);}
        if (($result == null) || ($result instanceof hmh.sap.rfc.Z_Rfc_Find_Transaction_Output)){
        return (hmh.sap.rfc.Z_Rfc_Find_Transaction_Output)$result;
        } else { throw createExceptionWrongType$($result);}
    }

}
