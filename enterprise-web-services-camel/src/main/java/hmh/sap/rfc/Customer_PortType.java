package hmh.sap.rfc;


public class Customer_PortType extends com.sap.aii.proxy.framework.core.AbstractProxy{

    private  static final com.sap.aii.proxy.framework.core.BaseProxyDescriptor staticDescriptor = com.sap.aii.proxy.framework.core.BaseProxyDescriptorFactory.createNewBaseProxyDescriptor("urn:sap-com:document:sap:rfc:functions:Customer.PortType", new java.lang.Object[][][]{{{"Z_RFC_CREATE_SUNDRY_CUSTOMER", "z_Rfc_Create_Sundry_Customer", "Z_RFC_CREATE_SUNDRY_CUSTOMER"}, {"urn:sap-com:document:sap:rfc:functions:Z_RFC_CREATE_SUNDRY_CUSTOMER.Input", "hmh.sap.rfc.Z_Rfc_Create_Sundry_Customer_Input"}, {"urn:sap-com:document:sap:rfc:functions:Z_RFC_CREATE_SUNDRY_CUSTOMER.Output", "hmh.sap.rfc.Z_Rfc_Create_Sundry_Customer_Output"}}, {{"Z_RFC_GET_CUST_RELATIONSHIPS", "z_Rfc_Get_Cust_Relationships", "Z_RFC_GET_CUST_RELATIONSHIPS"}, {"urn:sap-com:document:sap:rfc:functions:Z_RFC_GET_CUST_RELATIONSHIPS.Input", "hmh.sap.rfc.Z_Rfc_Get_Cust_Relationships_Input"}, {"urn:sap-com:document:sap:rfc:functions:Z_RFC_GET_CUST_RELATIONSHIPS.Output", "hmh.sap.rfc.Z_Rfc_Get_Cust_Relationships_Output"}}, {{"Z_RFC_GET_CUST_SUBSTITUTIONS", "z_Rfc_Get_Cust_Substitutions", "Z_RFC_GET_CUST_SUBSTITUTIONS"}, {"urn:sap-com:document:sap:rfc:functions:Z_RFC_GET_CUST_SUBSTITUTIONS.Input", "hmh.sap.rfc.Z_Rfc_Get_Cust_Substitutions_Input"}, {"urn:sap-com:document:sap:rfc:functions:Z_RFC_GET_CUST_SUBSTITUTIONS.Output", "hmh.sap.rfc.Z_Rfc_Get_Cust_Substitutions_Output"}}, {{"Z_RFC_CREATE_ETAIL_CUSTOMER", "z_Rfc_Create_Etail_Customer", "Z_RFC_CREATE_ETAIL_CUSTOMER"}, {"urn:sap-com:document:sap:rfc:functions:Z_RFC_CREATE_ETAIL_CUSTOMER.Input", "hmh.sap.rfc.Z_Rfc_Create_Etail_Customer_Input"}, {"urn:sap-com:document:sap:rfc:functions:Z_RFC_CREATE_ETAIL_CUSTOMER.Output", "hmh.sap.rfc.Z_Rfc_Create_Etail_Customer_Output"}}, {{"Z_RFC_FIND_ETAIL_CUST", "z_Rfc_Find_Etail_Cust", "Z_RFC_FIND_ETAIL_CUST"}, {"urn:sap-com:document:sap:rfc:functions:Z_RFC_FIND_ETAIL_CUST.Input", "hmh.sap.rfc.Z_Rfc_Find_Etail_Cust_Input"}, {"urn:sap-com:document:sap:rfc:functions:Z_RFC_FIND_ETAIL_CUST.Output", "hmh.sap.rfc.Z_Rfc_Find_Etail_Cust_Output"}}, {{"Z_RFC_GET_CUST_DETAILS", "z_Rfc_Get_Cust_Details", "Z_RFC_GET_CUST_DETAILS"}, {"urn:sap-com:document:sap:rfc:functions:Z_RFC_GET_CUST_DETAILS.Input", "hmh.sap.rfc.Z_Rfc_Get_Cust_Details_Input"}, {"urn:sap-com:document:sap:rfc:functions:Z_RFC_GET_CUST_DETAILS.Output", "hmh.sap.rfc.Z_Rfc_Get_Cust_Details_Output"}}}, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, hmh.sap.rfc.Customer_PortType.class) ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1329337766944L) ;

    public  Customer_PortType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public hmh.sap.rfc.Z_Rfc_Find_Etail_Cust_Output z_Rfc_Find_Etail_Cust(hmh.sap.rfc.Z_Rfc_Find_Etail_Cust_Input Z_Rfc_Find_Etail_Cust_Input) throws com.sap.aii.proxy.framework.core.ApplicationFaultException, com.sap.aii.proxy.framework.core.SystemFaultException{
        com.sap.aii.proxy.framework.core.BaseType $result = null;
        try {
        $result = send$(Z_Rfc_Find_Etail_Cust_Input, "urn:sap-com:document:sap:rfc:functions", "Customer.PortType", "Z_RFC_FIND_ETAIL_CUST", new hmh.sap.rfc.Z_Rfc_Find_Etail_Cust_Output());
        }catch (com.sap.aii.proxy.framework.core.ApplicationFaultException e){
         throw createExceptionWrongExceptionType$(e);}
        if (($result == null) || ($result instanceof hmh.sap.rfc.Z_Rfc_Find_Etail_Cust_Output)){
        return (hmh.sap.rfc.Z_Rfc_Find_Etail_Cust_Output)$result;
        } else { throw createExceptionWrongType$($result);}
    }

    
    public hmh.sap.rfc.Z_Rfc_Get_Cust_Details_Output z_Rfc_Get_Cust_Details(hmh.sap.rfc.Z_Rfc_Get_Cust_Details_Input Z_Rfc_Get_Cust_Details_Input) throws com.sap.aii.proxy.framework.core.ApplicationFaultException, com.sap.aii.proxy.framework.core.SystemFaultException{
        com.sap.aii.proxy.framework.core.BaseType $result = null;
        try {
        $result = send$(Z_Rfc_Get_Cust_Details_Input, "urn:sap-com:document:sap:rfc:functions", "Customer.PortType", "Z_RFC_GET_CUST_DETAILS", new hmh.sap.rfc.Z_Rfc_Get_Cust_Details_Output());
        }catch (com.sap.aii.proxy.framework.core.ApplicationFaultException e){
         throw createExceptionWrongExceptionType$(e);}
        if (($result == null) || ($result instanceof hmh.sap.rfc.Z_Rfc_Get_Cust_Details_Output)){
        return (hmh.sap.rfc.Z_Rfc_Get_Cust_Details_Output)$result;
        } else { throw createExceptionWrongType$($result);}
    }

    
    public hmh.sap.rfc.Z_Rfc_Get_Cust_Relationships_Output z_Rfc_Get_Cust_Relationships(hmh.sap.rfc.Z_Rfc_Get_Cust_Relationships_Input Z_Rfc_Get_Cust_Relationships_Input) throws com.sap.aii.proxy.framework.core.ApplicationFaultException, com.sap.aii.proxy.framework.core.SystemFaultException{
        com.sap.aii.proxy.framework.core.BaseType $result = null;
        try {
        $result = send$(Z_Rfc_Get_Cust_Relationships_Input, "urn:sap-com:document:sap:rfc:functions", "Customer.PortType", "Z_RFC_GET_CUST_RELATIONSHIPS", new hmh.sap.rfc.Z_Rfc_Get_Cust_Relationships_Output());
        }catch (com.sap.aii.proxy.framework.core.ApplicationFaultException e){
         throw createExceptionWrongExceptionType$(e);}
        if (($result == null) || ($result instanceof hmh.sap.rfc.Z_Rfc_Get_Cust_Relationships_Output)){
        return (hmh.sap.rfc.Z_Rfc_Get_Cust_Relationships_Output)$result;
        } else { throw createExceptionWrongType$($result);}
    }

    
    public hmh.sap.rfc.Z_Rfc_Create_Etail_Customer_Output z_Rfc_Create_Etail_Customer(hmh.sap.rfc.Z_Rfc_Create_Etail_Customer_Input Z_Rfc_Create_Etail_Customer_Input) throws com.sap.aii.proxy.framework.core.ApplicationFaultException, com.sap.aii.proxy.framework.core.SystemFaultException{
        com.sap.aii.proxy.framework.core.BaseType $result = null;
        try {
        $result = send$(Z_Rfc_Create_Etail_Customer_Input, "urn:sap-com:document:sap:rfc:functions", "Customer.PortType", "Z_RFC_CREATE_ETAIL_CUSTOMER", new hmh.sap.rfc.Z_Rfc_Create_Etail_Customer_Output());
        }catch (com.sap.aii.proxy.framework.core.ApplicationFaultException e){
         throw createExceptionWrongExceptionType$(e);}
        if (($result == null) || ($result instanceof hmh.sap.rfc.Z_Rfc_Create_Etail_Customer_Output)){
        return (hmh.sap.rfc.Z_Rfc_Create_Etail_Customer_Output)$result;
        } else { throw createExceptionWrongType$($result);}
    }

    
    public hmh.sap.rfc.Z_Rfc_Get_Cust_Substitutions_Output z_Rfc_Get_Cust_Substitutions(hmh.sap.rfc.Z_Rfc_Get_Cust_Substitutions_Input Z_Rfc_Get_Cust_Substitutions_Input) throws com.sap.aii.proxy.framework.core.ApplicationFaultException, com.sap.aii.proxy.framework.core.SystemFaultException{
        com.sap.aii.proxy.framework.core.BaseType $result = null;
        try {
        $result = send$(Z_Rfc_Get_Cust_Substitutions_Input, "urn:sap-com:document:sap:rfc:functions", "Customer.PortType", "Z_RFC_GET_CUST_SUBSTITUTIONS", new hmh.sap.rfc.Z_Rfc_Get_Cust_Substitutions_Output());
        }catch (com.sap.aii.proxy.framework.core.ApplicationFaultException e){
         throw createExceptionWrongExceptionType$(e);}
        if (($result == null) || ($result instanceof hmh.sap.rfc.Z_Rfc_Get_Cust_Substitutions_Output)){
        return (hmh.sap.rfc.Z_Rfc_Get_Cust_Substitutions_Output)$result;
        } else { throw createExceptionWrongType$($result);}
    }

    
    public hmh.sap.rfc.Z_Rfc_Create_Sundry_Customer_Output z_Rfc_Create_Sundry_Customer(hmh.sap.rfc.Z_Rfc_Create_Sundry_Customer_Input Z_Rfc_Create_Sundry_Customer_Input) throws com.sap.aii.proxy.framework.core.ApplicationFaultException, com.sap.aii.proxy.framework.core.SystemFaultException{
        com.sap.aii.proxy.framework.core.BaseType $result = null;
        try {
        $result = send$(Z_Rfc_Create_Sundry_Customer_Input, "urn:sap-com:document:sap:rfc:functions", "Customer.PortType", "Z_RFC_CREATE_SUNDRY_CUSTOMER", new hmh.sap.rfc.Z_Rfc_Create_Sundry_Customer_Output());
        }catch (com.sap.aii.proxy.framework.core.ApplicationFaultException e){
         throw createExceptionWrongExceptionType$(e);}
        if (($result == null) || ($result instanceof hmh.sap.rfc.Z_Rfc_Create_Sundry_Customer_Output)){
        return (hmh.sap.rfc.Z_Rfc_Create_Sundry_Customer_Output)$result;
        } else { throw createExceptionWrongType$($result);}
    }

}
