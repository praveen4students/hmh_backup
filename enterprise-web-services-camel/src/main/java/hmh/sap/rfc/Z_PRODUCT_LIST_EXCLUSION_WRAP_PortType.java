package hmh.sap.rfc;


public class Z_PRODUCT_LIST_EXCLUSION_WRAP_PortType extends com.sap.aii.proxy.framework.core.AbstractProxy{

    private  static final com.sap.aii.proxy.framework.core.BaseProxyDescriptor staticDescriptor = com.sap.aii.proxy.framework.core.BaseProxyDescriptorFactory.createNewBaseProxyDescriptor("urn:sap-com:document:sap:rfc:functions:Z_PRODUCT_LIST_EXCLUSION_WRAP.PortType", new java.lang.Object[][][]{{{"Z_PRODUCT_LIST_EXCLUSION_WRAP", "z_Product_List_Exclusion_Wrap", "Z_PRODUCT_LIST_EXCLUSION_WRAP"}, {"urn:sap-com:document:sap:rfc:functions:Z_PRODUCT_LIST_EXCLUSION_WRAP.Input", "hmh.sap.rfc.Z_Product_List_Exclusion_Wrap_Input"}, {"urn:sap-com:document:sap:rfc:functions:Z_PRODUCT_LIST_EXCLUSION_WRAP.Output", "hmh.sap.rfc.Z_Product_List_Exclusion_Wrap_Output"}}}, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, hmh.sap.rfc.Z_PRODUCT_LIST_EXCLUSION_WRAP_PortType.class) ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1343230299043L) ;

    public  Z_PRODUCT_LIST_EXCLUSION_WRAP_PortType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public hmh.sap.rfc.Z_Product_List_Exclusion_Wrap_Output z_Product_List_Exclusion_Wrap(hmh.sap.rfc.Z_Product_List_Exclusion_Wrap_Input Z_Product_List_Exclusion_Wrap_Input) throws com.sap.aii.proxy.framework.core.ApplicationFaultException, com.sap.aii.proxy.framework.core.SystemFaultException{
        com.sap.aii.proxy.framework.core.BaseType $result = null;
        try {
        $result = send$(Z_Product_List_Exclusion_Wrap_Input, "urn:sap-com:document:sap:rfc:functions", "Z_PRODUCT_LIST_EXCLUSION_WRAP.PortType", "Z_PRODUCT_LIST_EXCLUSION_WRAP", new hmh.sap.rfc.Z_Product_List_Exclusion_Wrap_Output());
        }catch (com.sap.aii.proxy.framework.core.ApplicationFaultException e){
         throw createExceptionWrongExceptionType$(e);}
        if (($result == null) || ($result instanceof hmh.sap.rfc.Z_Product_List_Exclusion_Wrap_Output)){
        return (hmh.sap.rfc.Z_Product_List_Exclusion_Wrap_Output)$result;
        } else { throw createExceptionWrongType$($result);}
    }

}
