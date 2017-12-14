package hmh.sap.rfc;


public class AccountStatementPDF_PortType extends com.sap.aii.proxy.framework.core.AbstractProxy{

    private  static final com.sap.aii.proxy.framework.core.BaseProxyDescriptor staticDescriptor = com.sap.aii.proxy.framework.core.BaseProxyDescriptorFactory.createNewBaseProxyDescriptor("urn:sap-com:document:sap:rfc:functions:accountStatementPDF.PortType", new java.lang.Object[][][]{{{"Z_RFC_SEND_ACCOUNT_STATEMENT", "z_Rfc_Send_Account_Statement", "Z_RFC_SEND_ACCOUNT_STATEMENT"}, {"urn:sap-com:document:sap:rfc:functions:Z_RFC_SEND_ACCOUNT_STATEMENT.Input", "hmh.sap.rfc.Z_Rfc_Send_Account_Statement_Input"}, {"urn:sap-com:document:sap:rfc:functions:Z_RFC_SEND_ACCOUNT_STATEMENT.Output", "hmh.sap.rfc.Z_Rfc_Send_Account_Statement_Output"}}}, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, hmh.sap.rfc.AccountStatementPDF_PortType.class) ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1326920827663L) ;

    public  AccountStatementPDF_PortType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public hmh.sap.rfc.Z_Rfc_Send_Account_Statement_Output z_Rfc_Send_Account_Statement(hmh.sap.rfc.Z_Rfc_Send_Account_Statement_Input Z_Rfc_Send_Account_Statement_Input) throws com.sap.aii.proxy.framework.core.ApplicationFaultException, com.sap.aii.proxy.framework.core.SystemFaultException{
        com.sap.aii.proxy.framework.core.BaseType $result = null;
        try {
        $result = send$(Z_Rfc_Send_Account_Statement_Input, "urn:sap-com:document:sap:rfc:functions", "accountStatementPDF.PortType", "Z_RFC_SEND_ACCOUNT_STATEMENT", new hmh.sap.rfc.Z_Rfc_Send_Account_Statement_Output());
        }catch (com.sap.aii.proxy.framework.core.ApplicationFaultException e){
         throw createExceptionWrongExceptionType$(e);}
        if (($result == null) || ($result instanceof hmh.sap.rfc.Z_Rfc_Send_Account_Statement_Output)){
        return (hmh.sap.rfc.Z_Rfc_Send_Account_Statement_Output)$result;
        } else { throw createExceptionWrongType$($result);}
    }

}
