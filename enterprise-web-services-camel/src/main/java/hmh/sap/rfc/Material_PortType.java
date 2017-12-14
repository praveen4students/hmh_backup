package hmh.sap.rfc;


public class Material_PortType extends com.sap.aii.proxy.framework.core.AbstractProxy{

    private  static final com.sap.aii.proxy.framework.core.BaseProxyDescriptor staticDescriptor = com.sap.aii.proxy.framework.core.BaseProxyDescriptorFactory.createNewBaseProxyDescriptor("urn:sap-com:document:sap:rfc:functions:Material.PortType", new java.lang.Object[][][]{{{"Z_RFC_GET_MATERIAL_SUBSTITUTE", "z_Rfc_Get_Material_Substitute", "Z_RFC_GET_MATERIAL_SUBSTITUTE"}, {"urn:sap-com:document:sap:rfc:functions:Z_RFC_GET_MATERIAL_SUBSTITUTE.Input", "hmh.sap.rfc.Z_Rfc_Get_Material_Substitute_Input"}, {"urn:sap-com:document:sap:rfc:functions:Z_RFC_GET_MATERIAL_SUBSTITUTE.Output", "hmh.sap.rfc.Z_Rfc_Get_Material_Substitute_Output"}}, {{"Z_RFC_GET_MATERIAL_DETAIL_ATP", "z_Rfc_Get_Material_Detail_Atp", "Z_RFC_GET_MATERIAL_DETAIL_ATP"}, {"urn:sap-com:document:sap:rfc:functions:Z_RFC_GET_MATERIAL_DETAIL_ATP.Input", "hmh.sap.rfc.Z_Rfc_Get_Material_Detail_Atp_Input"}, {"urn:sap-com:document:sap:rfc:functions:Z_RFC_GET_MATERIAL_DETAIL_ATP.Output", "hmh.sap.rfc.Z_Rfc_Get_Material_Detail_Atp_Output"}}, {{"Z_RFC_GET_MATERIAL_DETAIL", "z_Rfc_Get_Material_Detail", "Z_RFC_GET_MATERIAL_DETAIL"}, {"urn:sap-com:document:sap:rfc:functions:Z_RFC_GET_MATERIAL_DETAIL.Input", "hmh.sap.rfc.Z_Rfc_Get_Material_Detail_Input"}, {"urn:sap-com:document:sap:rfc:functions:Z_RFC_GET_MATERIAL_DETAIL.Output", "hmh.sap.rfc.Z_Rfc_Get_Material_Detail_Output"}}}, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, hmh.sap.rfc.Material_PortType.class) ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1329337306542L) ;

    public  Material_PortType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public hmh.sap.rfc.Z_Rfc_Get_Material_Detail_Output z_Rfc_Get_Material_Detail(hmh.sap.rfc.Z_Rfc_Get_Material_Detail_Input Z_Rfc_Get_Material_Detail_Input) throws com.sap.aii.proxy.framework.core.ApplicationFaultException, com.sap.aii.proxy.framework.core.SystemFaultException{
        com.sap.aii.proxy.framework.core.BaseType $result = null;
        try {
        $result = send$(Z_Rfc_Get_Material_Detail_Input, "urn:sap-com:document:sap:rfc:functions", "Material.PortType", "Z_RFC_GET_MATERIAL_DETAIL", new hmh.sap.rfc.Z_Rfc_Get_Material_Detail_Output());
        }catch (com.sap.aii.proxy.framework.core.ApplicationFaultException e){
         throw createExceptionWrongExceptionType$(e);}
        if (($result == null) || ($result instanceof hmh.sap.rfc.Z_Rfc_Get_Material_Detail_Output)){
        return (hmh.sap.rfc.Z_Rfc_Get_Material_Detail_Output)$result;
        } else { throw createExceptionWrongType$($result);}
    }

    
    public hmh.sap.rfc.Z_Rfc_Get_Material_Substitute_Output z_Rfc_Get_Material_Substitute(hmh.sap.rfc.Z_Rfc_Get_Material_Substitute_Input Z_Rfc_Get_Material_Substitute_Input) throws com.sap.aii.proxy.framework.core.ApplicationFaultException, com.sap.aii.proxy.framework.core.SystemFaultException{
        com.sap.aii.proxy.framework.core.BaseType $result = null;
        try {
        $result = send$(Z_Rfc_Get_Material_Substitute_Input, "urn:sap-com:document:sap:rfc:functions", "Material.PortType", "Z_RFC_GET_MATERIAL_SUBSTITUTE", new hmh.sap.rfc.Z_Rfc_Get_Material_Substitute_Output());
        }catch (com.sap.aii.proxy.framework.core.ApplicationFaultException e){
         throw createExceptionWrongExceptionType$(e);}
        if (($result == null) || ($result instanceof hmh.sap.rfc.Z_Rfc_Get_Material_Substitute_Output)){
        return (hmh.sap.rfc.Z_Rfc_Get_Material_Substitute_Output)$result;
        } else { throw createExceptionWrongType$($result);}
    }

    
    public hmh.sap.rfc.Z_Rfc_Get_Material_Detail_Atp_Output z_Rfc_Get_Material_Detail_Atp(hmh.sap.rfc.Z_Rfc_Get_Material_Detail_Atp_Input Z_Rfc_Get_Material_Detail_Atp_Input) throws com.sap.aii.proxy.framework.core.ApplicationFaultException, com.sap.aii.proxy.framework.core.SystemFaultException{
        com.sap.aii.proxy.framework.core.BaseType $result = null;
        try {
        $result = send$(Z_Rfc_Get_Material_Detail_Atp_Input, "urn:sap-com:document:sap:rfc:functions", "Material.PortType", "Z_RFC_GET_MATERIAL_DETAIL_ATP", new hmh.sap.rfc.Z_Rfc_Get_Material_Detail_Atp_Output());
        }catch (com.sap.aii.proxy.framework.core.ApplicationFaultException e){
         throw createExceptionWrongExceptionType$(e);}
        if (($result == null) || ($result instanceof hmh.sap.rfc.Z_Rfc_Get_Material_Detail_Atp_Output)){
        return (hmh.sap.rfc.Z_Rfc_Get_Material_Detail_Atp_Output)$result;
        } else { throw createExceptionWrongType$($result);}
    }

}
