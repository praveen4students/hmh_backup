package hmh.sap.rfc;


public class BapiMaterialGetAll_PortType extends com.sap.aii.proxy.framework.core.AbstractProxy{

    private  static final com.sap.aii.proxy.framework.core.BaseProxyDescriptor staticDescriptor = com.sap.aii.proxy.framework.core.BaseProxyDescriptorFactory.createNewBaseProxyDescriptor("urn:sap-com:document:sap:rfc:functions:BapiMaterialGetAll.PortType", new java.lang.Object[][][]{{{"BAPI_MATERIAL_GETALL", "bapi_Material_Getall", "BAPI_MATERIAL_GETALL"}, {"urn:sap-com:document:sap:rfc:functions:BAPI_MATERIAL_GETALL.Input", "hmh.sap.rfc.Bapi_Material_Getall_Input"}, {"urn:sap-com:document:sap:rfc:functions:BAPI_MATERIAL_GETALL.Output", "hmh.sap.rfc.Bapi_Material_Getall_Output"}}}, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, hmh.sap.rfc.BapiMaterialGetAll_PortType.class) ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1335984408507L) ;

    public  BapiMaterialGetAll_PortType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public hmh.sap.rfc.Bapi_Material_Getall_Output bapi_Material_Getall(hmh.sap.rfc.Bapi_Material_Getall_Input Bapi_Material_Getall_Input) throws com.sap.aii.proxy.framework.core.ApplicationFaultException, com.sap.aii.proxy.framework.core.SystemFaultException{
        com.sap.aii.proxy.framework.core.BaseType $result = null;
        try {
        $result = send$(Bapi_Material_Getall_Input, "urn:sap-com:document:sap:rfc:functions", "BapiMaterialGetAll.PortType", "BAPI_MATERIAL_GETALL", new hmh.sap.rfc.Bapi_Material_Getall_Output());
        }catch (com.sap.aii.proxy.framework.core.ApplicationFaultException e){
         throw createExceptionWrongExceptionType$(e);}
        if (($result == null) || ($result instanceof hmh.sap.rfc.Bapi_Material_Getall_Output)){
        return (hmh.sap.rfc.Bapi_Material_Getall_Output)$result;
        } else { throw createExceptionWrongType$($result);}
    }

}
