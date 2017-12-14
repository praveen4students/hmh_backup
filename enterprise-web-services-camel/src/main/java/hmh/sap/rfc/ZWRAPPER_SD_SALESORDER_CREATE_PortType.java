package hmh.sap.rfc;


public class ZWRAPPER_SD_SALESORDER_CREATE_PortType extends com.sap.aii.proxy.framework.core.AbstractProxy{

    private  static final com.sap.aii.proxy.framework.core.BaseProxyDescriptor staticDescriptor = com.sap.aii.proxy.framework.core.BaseProxyDescriptorFactory.createNewBaseProxyDescriptor("urn:sap-com:document:sap:rfc:functions:ZWRAPPER_SD_SALESORDER_CREATE.PortType", new java.lang.Object[][][]{{{"ZWRAPPER_SD_SALESORDER_CREATE", "zwrapper_Sd_Salesorder_Create", "ZWRAPPER_SD_SALESORDER_CREATE"}, {"urn:sap-com:document:sap:rfc:functions:ZWRAPPER_SD_SALESORDER_CREATE.Input", "hmh.sap.rfc.Zwrapper_Sd_Salesorder_Create_Input"}, {"urn:sap-com:document:sap:rfc:functions:ZWRAPPER_SD_SALESORDER_CREATE.Output", "hmh.sap.rfc.Zwrapper_Sd_Salesorder_Create_Output"}}}, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, hmh.sap.rfc.ZWRAPPER_SD_SALESORDER_CREATE_PortType.class) ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1354127028370L) ;

    public  ZWRAPPER_SD_SALESORDER_CREATE_PortType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public hmh.sap.rfc.Zwrapper_Sd_Salesorder_Create_Output zwrapper_Sd_Salesorder_Create(hmh.sap.rfc.Zwrapper_Sd_Salesorder_Create_Input Zwrapper_Sd_Salesorder_Create_Input) throws com.sap.aii.proxy.framework.core.ApplicationFaultException, com.sap.aii.proxy.framework.core.SystemFaultException{
        com.sap.aii.proxy.framework.core.BaseType $result = null;
        try {
        $result = send$(Zwrapper_Sd_Salesorder_Create_Input, "urn:sap-com:document:sap:rfc:functions", "ZWRAPPER_SD_SALESORDER_CREATE.PortType", "ZWRAPPER_SD_SALESORDER_CREATE", new hmh.sap.rfc.Zwrapper_Sd_Salesorder_Create_Output());
        }catch (com.sap.aii.proxy.framework.core.ApplicationFaultException e){
         throw createExceptionWrongExceptionType$(e);}
        if (($result == null) || ($result instanceof hmh.sap.rfc.Zwrapper_Sd_Salesorder_Create_Output)){
        return (hmh.sap.rfc.Zwrapper_Sd_Salesorder_Create_Output)$result;
        } else { throw createExceptionWrongType$($result);}
    }

}
