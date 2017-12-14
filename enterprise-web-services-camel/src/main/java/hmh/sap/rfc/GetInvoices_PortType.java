package hmh.sap.rfc;


public class GetInvoices_PortType extends com.sap.aii.proxy.framework.core.AbstractProxy{

    private  static final com.sap.aii.proxy.framework.core.BaseProxyDescriptor staticDescriptor = com.sap.aii.proxy.framework.core.BaseProxyDescriptorFactory.createNewBaseProxyDescriptor("urn:sap-com:document:sap:rfc:functions:GetInvoices.PortType", new java.lang.Object[][][]{{{"Z_RFC_GET_INVOICES", "z_Rfc_Get_Invoices", "Z_RFC_GET_INVOICES"}, {"urn:sap-com:document:sap:rfc:functions:Z_RFC_GET_INVOICES.Input", "sap.rfc.Z_Rfc_Get_Invoices_Input"}, {"urn:sap-com:document:sap:rfc:functions:Z_RFC_GET_INVOICES.Output", "sap.rfc.Z_Rfc_Get_Invoices_Output"}}}, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, hmh.sap.rfc.GetInvoices_PortType.class) ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1322525396330L) ;

    public  GetInvoices_PortType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public hmh.sap.rfc.Z_Rfc_Get_Invoices_Output z_Rfc_Get_Invoices(hmh.sap.rfc.Z_Rfc_Get_Invoices_Input Z_Rfc_Get_Invoices_Input) throws com.sap.aii.proxy.framework.core.ApplicationFaultException, com.sap.aii.proxy.framework.core.SystemFaultException{
        com.sap.aii.proxy.framework.core.BaseType $result = null;
        try {
        $result = send$(Z_Rfc_Get_Invoices_Input, "urn:sap-com:document:sap:rfc:functions", "GetInvoices.PortType", "Z_RFC_GET_INVOICES", new hmh.sap.rfc.Z_Rfc_Get_Invoices_Output());
        }catch (com.sap.aii.proxy.framework.core.ApplicationFaultException e){
         throw createExceptionWrongExceptionType$(e);}
        if (($result == null) || ($result instanceof hmh.sap.rfc.Z_Rfc_Get_Invoices_Output)){
        return (hmh.sap.rfc.Z_Rfc_Get_Invoices_Output)$result;
        } else { throw createExceptionWrongType$($result);}
    }

}
