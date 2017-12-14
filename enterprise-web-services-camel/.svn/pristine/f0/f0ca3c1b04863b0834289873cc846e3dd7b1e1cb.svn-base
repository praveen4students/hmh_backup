package hmh.sap.rfc;


public class BapiCustomerFind_PortType extends com.sap.aii.proxy.framework.core.AbstractProxy{

    private  static final com.sap.aii.proxy.framework.core.BaseProxyDescriptor staticDescriptor = com.sap.aii.proxy.framework.core.BaseProxyDescriptorFactory.createNewBaseProxyDescriptor("urn:sap-com:document:sap:rfc:functions:BapiCustomerFind.PortType", new java.lang.Object[][][]{{{"BAPI_CUSTOMER_FIND", "bapi_Customer_Find", "BAPI_CUSTOMER_FIND"}, {"urn:sap-com:document:sap:rfc:functions:BAPI_CUSTOMER_FIND.Input", "hmh.sap.rfc.Bapi_Customer_Find_Input"}, {"urn:sap-com:document:sap:rfc:functions:BAPI_CUSTOMER_FIND.Output", "hmh.sap.rfc.Bapi_Customer_Find_Output"}}}, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, hmh.sap.rfc.BapiCustomerFind_PortType.class) ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1335986960815L) ;

    public  BapiCustomerFind_PortType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public hmh.sap.rfc.Bapi_Customer_Find_Output bapi_Customer_Find(hmh.sap.rfc.Bapi_Customer_Find_Input Bapi_Customer_Find_Input) throws com.sap.aii.proxy.framework.core.ApplicationFaultException, com.sap.aii.proxy.framework.core.SystemFaultException{
        com.sap.aii.proxy.framework.core.BaseType $result = null;
        try {
        $result = send$(Bapi_Customer_Find_Input, "urn:sap-com:document:sap:rfc:functions", "BapiCustomerFind.PortType", "BAPI_CUSTOMER_FIND", new hmh.sap.rfc.Bapi_Customer_Find_Output());
        }catch (com.sap.aii.proxy.framework.core.ApplicationFaultException e){
         throw createExceptionWrongExceptionType$(e);}
        if (($result == null) || ($result instanceof hmh.sap.rfc.Bapi_Customer_Find_Output)){
        return (hmh.sap.rfc.Bapi_Customer_Find_Output)$result;
        } else { throw createExceptionWrongType$($result);}
    }

}
