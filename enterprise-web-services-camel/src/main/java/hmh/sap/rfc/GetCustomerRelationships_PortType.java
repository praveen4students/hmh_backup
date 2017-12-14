package hmh.sap.rfc;


public class GetCustomerRelationships_PortType extends com.sap.aii.proxy.framework.core.AbstractProxy{

    private  static final com.sap.aii.proxy.framework.core.BaseProxyDescriptor staticDescriptor = com.sap.aii.proxy.framework.core.BaseProxyDescriptorFactory.createNewBaseProxyDescriptor("urn:sap-com:document:sap:rfc:functions:GetCustomerRelationships.PortType", new java.lang.Object[][][]{{{"Z_RFC_GET_CUST_RELATIONSHIPS", "z_Rfc_Get_Cust_Relationships", "Z_RFC_GET_CUST_RELATIONSHIPS"}, {"urn:sap-com:document:sap:rfc:functions:Z_RFC_GET_CUST_RELATIONSHIPS.Input", "hmh.sap.rfc.Z_Rfc_Get_Cust_Relationships_Input"}, {"urn:sap-com:document:sap:rfc:functions:Z_RFC_GET_CUST_RELATIONSHIPS.Output", "hmh.sap.rfc.Z_Rfc_Get_Cust_Relationships_Output"}}}, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, hmh.sap.rfc.GetCustomerRelationships_PortType.class) ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1326921633066L) ;

    public  GetCustomerRelationships_PortType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public hmh.sap.rfc.Z_Rfc_Get_Cust_Relationships_Output z_Rfc_Get_Cust_Relationships(hmh.sap.rfc.Z_Rfc_Get_Cust_Relationships_Input Z_Rfc_Get_Cust_Relationships_Input) throws com.sap.aii.proxy.framework.core.ApplicationFaultException, com.sap.aii.proxy.framework.core.SystemFaultException{
        com.sap.aii.proxy.framework.core.BaseType $result = null;
        try {
        $result = send$(Z_Rfc_Get_Cust_Relationships_Input, "urn:sap-com:document:sap:rfc:functions", "GetCustomerRelationships.PortType", "Z_RFC_GET_CUST_RELATIONSHIPS", new hmh.sap.rfc.Z_Rfc_Get_Cust_Relationships_Output());
        }catch (com.sap.aii.proxy.framework.core.ApplicationFaultException e){
         throw createExceptionWrongExceptionType$(e);}
        if (($result == null) || ($result instanceof hmh.sap.rfc.Z_Rfc_Get_Cust_Relationships_Output)){
        return (hmh.sap.rfc.Z_Rfc_Get_Cust_Relationships_Output)$result;
        } else { throw createExceptionWrongType$($result);}
    }

}
