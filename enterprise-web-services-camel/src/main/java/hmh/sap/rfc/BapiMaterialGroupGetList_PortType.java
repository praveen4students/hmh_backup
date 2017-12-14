package hmh.sap.rfc;


public class BapiMaterialGroupGetList_PortType extends com.sap.aii.proxy.framework.core.AbstractProxy{

    private  static final com.sap.aii.proxy.framework.core.BaseProxyDescriptor staticDescriptor = com.sap.aii.proxy.framework.core.BaseProxyDescriptorFactory.createNewBaseProxyDescriptor("urn:sap-com:document:sap:rfc:functions:BapiMaterialGroupGetList.PortType", new java.lang.Object[][][]{{{"BAPI_MATERIALGROUP_GET_LIST", "bapi_Materialgroup_Get_List", "BAPI_MATERIALGROUP_GET_LIST"}, {"urn:sap-com:document:sap:rfc:functions:BAPI_MATERIALGROUP_GET_LIST.Input", "hmh.sap.rfc.Bapi_Materialgroup_Get_List_Input"}, {"urn:sap-com:document:sap:rfc:functions:BAPI_MATERIALGROUP_GET_LIST.Output", "hmh.sap.rfc.Bapi_Materialgroup_Get_List_Output"}}}, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, hmh.sap.rfc.BapiMaterialGroupGetList_PortType.class) ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1335985769729L) ;

    public  BapiMaterialGroupGetList_PortType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public hmh.sap.rfc.Bapi_Materialgroup_Get_List_Output bapi_Materialgroup_Get_List(hmh.sap.rfc.Bapi_Materialgroup_Get_List_Input Bapi_Materialgroup_Get_List_Input) throws com.sap.aii.proxy.framework.core.ApplicationFaultException, com.sap.aii.proxy.framework.core.SystemFaultException{
        com.sap.aii.proxy.framework.core.BaseType $result = null;
        try {
        $result = send$(Bapi_Materialgroup_Get_List_Input, "urn:sap-com:document:sap:rfc:functions", "BapiMaterialGroupGetList.PortType", "BAPI_MATERIALGROUP_GET_LIST", new hmh.sap.rfc.Bapi_Materialgroup_Get_List_Output());
        }catch (com.sap.aii.proxy.framework.core.ApplicationFaultException e){
         throw createExceptionWrongExceptionType$(e);}
        if (($result == null) || ($result instanceof hmh.sap.rfc.Bapi_Materialgroup_Get_List_Output)){
        return (hmh.sap.rfc.Bapi_Materialgroup_Get_List_Output)$result;
        } else { throw createExceptionWrongType$($result);}
    }

}
