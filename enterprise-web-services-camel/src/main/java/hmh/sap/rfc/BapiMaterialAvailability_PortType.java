package hmh.sap.rfc;


public class BapiMaterialAvailability_PortType extends com.sap.aii.proxy.framework.core.AbstractProxy{

    private  static final com.sap.aii.proxy.framework.core.BaseProxyDescriptor staticDescriptor = com.sap.aii.proxy.framework.core.BaseProxyDescriptorFactory.createNewBaseProxyDescriptor("urn:sap-com:document:sap:rfc:functions:BapiMaterialAvailability.PortType", new java.lang.Object[][][]{{{"BAPI_MATERIAL_AVAILABILITY", "bapi_Material_Availability", "BAPI_MATERIAL_AVAILABILITY"}, {"urn:sap-com:document:sap:rfc:functions:BAPI_MATERIAL_AVAILABILITY.Input", "hmh.sap.rfc.Bapi_Material_Availability_Input"}, {"urn:sap-com:document:sap:rfc:functions:BAPI_MATERIAL_AVAILABILITY.Output", "hmh.sap.rfc.Bapi_Material_Availability_Output"}}}, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, hmh.sap.rfc.BapiMaterialAvailability_PortType.class) ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1335986080127L) ;

    public  BapiMaterialAvailability_PortType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public hmh.sap.rfc.Bapi_Material_Availability_Output bapi_Material_Availability(hmh.sap.rfc.Bapi_Material_Availability_Input Bapi_Material_Availability_Input) throws com.sap.aii.proxy.framework.core.ApplicationFaultException, com.sap.aii.proxy.framework.core.SystemFaultException{
        com.sap.aii.proxy.framework.core.BaseType $result = null;
        try {
        $result = send$(Bapi_Material_Availability_Input, "urn:sap-com:document:sap:rfc:functions", "BapiMaterialAvailability.PortType", "BAPI_MATERIAL_AVAILABILITY", new hmh.sap.rfc.Bapi_Material_Availability_Output());
        }catch (com.sap.aii.proxy.framework.core.ApplicationFaultException e){
         throw createExceptionWrongExceptionType$(e);}
        if (($result == null) || ($result instanceof hmh.sap.rfc.Bapi_Material_Availability_Output)){
        return (hmh.sap.rfc.Bapi_Material_Availability_Output)$result;
        } else { throw createExceptionWrongType$($result);}
    }

}
