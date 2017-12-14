package hmh.sap.rfc;


public class BapiMaterialGetList_PortType extends com.sap.aii.proxy.framework.core.AbstractProxy{

    private  static final com.sap.aii.proxy.framework.core.BaseProxyDescriptor staticDescriptor = com.sap.aii.proxy.framework.core.BaseProxyDescriptorFactory.createNewBaseProxyDescriptor("urn:sap-com:document:sap:rfc:functions:BapiMaterialGetList.PortType", new java.lang.Object[][][]{{{"BAPI_MATERIAL_GETLIST", "bapi_Material_Getlist", "BAPI_MATERIAL_GETLIST"}, {"urn:sap-com:document:sap:rfc:functions:BAPI_MATERIAL_GETLIST.Input", "hmh.sap.rfc.Bapi_Material_Getlist_Input"}, {"urn:sap-com:document:sap:rfc:functions:BAPI_MATERIAL_GETLIST.Output", "hmh.sap.rfc.Bapi_Material_Getlist_Output"}}}, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, hmh.sap.rfc.BapiMaterialGetList_PortType.class) ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1335985573938L) ;

    public  BapiMaterialGetList_PortType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public hmh.sap.rfc.Bapi_Material_Getlist_Output bapi_Material_Getlist(hmh.sap.rfc.Bapi_Material_Getlist_Input Bapi_Material_Getlist_Input) throws com.sap.aii.proxy.framework.core.ApplicationFaultException, com.sap.aii.proxy.framework.core.SystemFaultException{
        com.sap.aii.proxy.framework.core.BaseType $result = null;
        try {
        $result = send$(Bapi_Material_Getlist_Input, "urn:sap-com:document:sap:rfc:functions", "BapiMaterialGetList.PortType", "BAPI_MATERIAL_GETLIST", new hmh.sap.rfc.Bapi_Material_Getlist_Output());
        }catch (com.sap.aii.proxy.framework.core.ApplicationFaultException e){
         throw createExceptionWrongExceptionType$(e);}
        if (($result == null) || ($result instanceof hmh.sap.rfc.Bapi_Material_Getlist_Output)){
        return (hmh.sap.rfc.Bapi_Material_Getlist_Output)$result;
        } else { throw createExceptionWrongType$($result);}
    }

}
