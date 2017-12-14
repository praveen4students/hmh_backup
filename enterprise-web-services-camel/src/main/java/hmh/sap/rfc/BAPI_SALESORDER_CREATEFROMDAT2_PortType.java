package hmh.sap.rfc;


public class BAPI_SALESORDER_CREATEFROMDAT2_PortType extends com.sap.aii.proxy.framework.core.AbstractProxy{

    private  static final com.sap.aii.proxy.framework.core.BaseProxyDescriptor staticDescriptor = com.sap.aii.proxy.framework.core.BaseProxyDescriptorFactory.createNewBaseProxyDescriptor("urn:sap-com:document:sap:rfc:functions:BAPI_SALESORDER_CREATEFROMDAT2.PortType", new java.lang.Object[][][]{{{"BAPI_SALESORDER_CREATEFROMDAT2", "bapi_Salesorder_Createfromdat2", "BAPI_SALESORDER_CREATEFROMDAT2"}, {"urn:sap-com:document:sap:rfc:functions:BAPI_SALESORDER_CREATEFROMDAT2.Input", "hmh.sap.rfc.Bapi_Salesorder_Createfromdat2_Input"}, {"urn:sap-com:document:sap:rfc:functions:BAPI_SALESORDER_CREATEFROMDAT2.Output", "hmh.sap.rfc.Bapi_Salesorder_Createfromdat2_Output"}}}, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, hmh.sap.rfc.BAPI_SALESORDER_CREATEFROMDAT2_PortType.class) ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1342559811727L) ;

    public  BAPI_SALESORDER_CREATEFROMDAT2_PortType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public hmh.sap.rfc.Bapi_Salesorder_Createfromdat2_Output bapi_Salesorder_Createfromdat2(hmh.sap.rfc.Bapi_Salesorder_Createfromdat2_Input Bapi_Salesorder_Createfromdat2_Input) throws com.sap.aii.proxy.framework.core.ApplicationFaultException, com.sap.aii.proxy.framework.core.SystemFaultException{
        com.sap.aii.proxy.framework.core.BaseType $result = null;
        try {
        $result = send$(Bapi_Salesorder_Createfromdat2_Input, "urn:sap-com:document:sap:rfc:functions", "BAPI_SALESORDER_CREATEFROMDAT2.PortType", "BAPI_SALESORDER_CREATEFROMDAT2", new hmh.sap.rfc.Bapi_Salesorder_Createfromdat2_Output());
        }catch (com.sap.aii.proxy.framework.core.ApplicationFaultException e){
         throw createExceptionWrongExceptionType$(e);}
        if (($result == null) || ($result instanceof hmh.sap.rfc.Bapi_Salesorder_Createfromdat2_Output)){
        return (hmh.sap.rfc.Bapi_Salesorder_Createfromdat2_Output)$result;
        } else { throw createExceptionWrongType$($result);}
    }

}
