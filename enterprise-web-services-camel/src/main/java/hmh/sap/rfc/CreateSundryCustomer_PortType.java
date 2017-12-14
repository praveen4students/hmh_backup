package hmh.sap.rfc;


public class CreateSundryCustomer_PortType extends com.sap.aii.proxy.framework.core.AbstractProxy{

    private  static final com.sap.aii.proxy.framework.core.BaseProxyDescriptor staticDescriptor = com.sap.aii.proxy.framework.core.BaseProxyDescriptorFactory.createNewBaseProxyDescriptor("urn:sap-com:document:sap:rfc:functions:CreateSundryCustomer.PortType", new java.lang.Object[][][]{{{"Z_RFC_CREATE_SUNDRY_CUSTOMER", "z_Rfc_Create_Sundry_Customer", "Z_RFC_CREATE_SUNDRY_CUSTOMER"}, {"urn:sap-com:document:sap:rfc:functions:Z_RFC_CREATE_SUNDRY_CUSTOMER.Input", "hmh.sap.rfc.Z_Rfc_Create_Sundry_Customer_Input"}, {"urn:sap-com:document:sap:rfc:functions:Z_RFC_CREATE_SUNDRY_CUSTOMER.Output", "hmh.sap.rfc.Z_Rfc_Create_Sundry_Customer_Output"}}}, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, hmh.sap.rfc.CreateSundryCustomer_PortType.class) ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1326921198022L) ;

    public  CreateSundryCustomer_PortType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public hmh.sap.rfc.Z_Rfc_Create_Sundry_Customer_Output z_Rfc_Create_Sundry_Customer(hmh.sap.rfc.Z_Rfc_Create_Sundry_Customer_Input Z_Rfc_Create_Sundry_Customer_Input) throws com.sap.aii.proxy.framework.core.ApplicationFaultException, com.sap.aii.proxy.framework.core.SystemFaultException{
        com.sap.aii.proxy.framework.core.BaseType $result = null;
        try {
        $result = send$(Z_Rfc_Create_Sundry_Customer_Input, "urn:sap-com:document:sap:rfc:functions", "CreateSundryCustomer.PortType", "Z_RFC_CREATE_SUNDRY_CUSTOMER", new hmh.sap.rfc.Z_Rfc_Create_Sundry_Customer_Output());
        }catch (com.sap.aii.proxy.framework.core.ApplicationFaultException e){
         throw createExceptionWrongExceptionType$(e);}
        if (($result == null) || ($result instanceof hmh.sap.rfc.Z_Rfc_Create_Sundry_Customer_Output)){
        return (hmh.sap.rfc.Z_Rfc_Create_Sundry_Customer_Output)$result;
        } else { throw createExceptionWrongType$($result);}
    }

}
