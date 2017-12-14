package hmh.sap.rfc;


public class GetCustomerDetail_PortType extends com.sap.aii.proxy.framework.core.AbstractProxy{

    private  static final com.sap.aii.proxy.framework.core.BaseProxyDescriptor staticDescriptor = com.sap.aii.proxy.framework.core.BaseProxyDescriptorFactory.createNewBaseProxyDescriptor("urn:sap-com:document:sap:rfc:functions:GetCustomerDetail.PortType", new java.lang.Object[][][]{{{"Z_RFC_GET_CUST_DETAILS", "z_Rfc_Get_Cust_Details", "Z_RFC_GET_CUST_DETAILS"}, {"urn:sap-com:document:sap:rfc:functions:Z_RFC_GET_CUST_DETAILS.Input", "hmh.sap.rfc.Z_Rfc_Get_Cust_Details_Input"}, {"urn:sap-com:document:sap:rfc:functions:Z_RFC_GET_CUST_DETAILS.Output", "hmh.sap.rfc.Z_Rfc_Get_Cust_Details_Output"}}}, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, hmh.sap.rfc.GetCustomerDetail_PortType.class) ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1326921499270L) ;

    public  GetCustomerDetail_PortType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public hmh.sap.rfc.Z_Rfc_Get_Cust_Details_Output z_Rfc_Get_Cust_Details(hmh.sap.rfc.Z_Rfc_Get_Cust_Details_Input Z_Rfc_Get_Cust_Details_Input) throws com.sap.aii.proxy.framework.core.ApplicationFaultException, com.sap.aii.proxy.framework.core.SystemFaultException{
        com.sap.aii.proxy.framework.core.BaseType $result = null;
        try {
        $result = send$(Z_Rfc_Get_Cust_Details_Input, "urn:sap-com:document:sap:rfc:functions", "GetCustomerDetail.PortType", "Z_RFC_GET_CUST_DETAILS", new hmh.sap.rfc.Z_Rfc_Get_Cust_Details_Output());
        }catch (com.sap.aii.proxy.framework.core.ApplicationFaultException e){
         throw createExceptionWrongExceptionType$(e);}
        if (($result == null) || ($result instanceof hmh.sap.rfc.Z_Rfc_Get_Cust_Details_Output)){
        return (hmh.sap.rfc.Z_Rfc_Get_Cust_Details_Output)$result;
        } else { throw createExceptionWrongType$($result);}
    }

}
