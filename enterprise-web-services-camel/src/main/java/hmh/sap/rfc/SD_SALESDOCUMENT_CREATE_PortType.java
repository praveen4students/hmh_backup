package hmh.sap.rfc;


public class SD_SALESDOCUMENT_CREATE_PortType extends com.sap.aii.proxy.framework.core.AbstractProxy{

    private  static final com.sap.aii.proxy.framework.core.BaseProxyDescriptor staticDescriptor = com.sap.aii.proxy.framework.core.BaseProxyDescriptorFactory.createNewBaseProxyDescriptor("urn:sap-com:document:sap:rfc:functions:SD_SALESDOCUMENT_CREATE.PortType", new java.lang.Object[][][]{{{"SD_SALESDOCUMENT_CREATE", "sd_Salesdocument_Create", "SD_SALESDOCUMENT_CREATE"}, {"urn:sap-com:document:sap:rfc:functions:SD_SALESDOCUMENT_CREATE.Input", "hmh.sap.rfc.Sd_Salesdocument_Create_Input"}, {"urn:sap-com:document:sap:rfc:functions:SD_SALESDOCUMENT_CREATE.Output", "hmh.sap.rfc.Sd_Salesdocument_Create_Output"}}}, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, hmh.sap.rfc.SD_SALESDOCUMENT_CREATE_PortType.class) ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1342559989906L) ;

    public  SD_SALESDOCUMENT_CREATE_PortType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public hmh.sap.rfc.Sd_Salesdocument_Create_Output sd_Salesdocument_Create(hmh.sap.rfc.Sd_Salesdocument_Create_Input Sd_Salesdocument_Create_Input) throws com.sap.aii.proxy.framework.core.ApplicationFaultException, com.sap.aii.proxy.framework.core.SystemFaultException{
        com.sap.aii.proxy.framework.core.BaseType $result = null;
        try {
        $result = send$(Sd_Salesdocument_Create_Input, "urn:sap-com:document:sap:rfc:functions", "SD_SALESDOCUMENT_CREATE.PortType", "SD_SALESDOCUMENT_CREATE", new hmh.sap.rfc.Sd_Salesdocument_Create_Output());
        }catch (com.sap.aii.proxy.framework.core.ApplicationFaultException e){
         throw createExceptionWrongExceptionType$(e);}
        if (($result == null) || ($result instanceof hmh.sap.rfc.Sd_Salesdocument_Create_Output)){
        return (hmh.sap.rfc.Sd_Salesdocument_Create_Output)$result;
        } else { throw createExceptionWrongType$($result);}
    }

}
