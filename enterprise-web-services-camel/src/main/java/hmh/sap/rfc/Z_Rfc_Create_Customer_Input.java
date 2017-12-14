package hmh.sap.rfc;


public class Z_Rfc_Create_Customer_Input extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1356026424542L) ;

    private  Z_Rfc_Create_Customer_Input.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.WSDL_MESSAGE_FOR_JCO, "urn:sap-com:document:sap:rfc:functions", "Z_RFC_CREATE_CUSTOMER.Input", 6, 0, hmh.sap.rfc.Z_Rfc_Create_Customer_Input.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "Z_RFC_CREATE_CUSTOMER", 0, 0, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Create Customer for Web Presence</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>110</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:package>ZVSL</ifr:package><ifr:akhNode>HLA0009600</ifr:akhNode><ifr:released>no</ifr:released><ifr:outbound>false</ifr:outbound><ifr:synchronous>true</ifr:synchronous><ifr:asynchronous>false</ifr:asynchronous><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2></ifr:properties><ifr:definition /></ifr:container>");
        descriptorSetElementProperties(descriptor, 0, "I_BILL_TO_ADDR", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:ZCUST_ADDRESS_WP", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "I_Bill_To_Addr", hmh.sap.rfc.Zcust_Address_WpType.class, new hmh.sap.rfc.Zcust_Address_WpType(), new java.lang.String[][]{}, "I_BILL_TO_ADDR", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"I_BILL_TO_ADDR\"><ifr:descriptor><ifr:description language=\"en\">Structure for Customer Address</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZCUST_ADDRESS_WP\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZCUST_ADDRESS_WP\" /></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 1, "I_ECOMM_USER_NAME", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 1, 1, false, null, "I_Ecomm_User_Name", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "35"}}, "I_ECOMM_USER_NAME", 0, 0, -1, 35, 70, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"I_ECOMM_USER_NAME\"><ifr:descriptor><ifr:description language=\"en\">Name 1</ifr:description></ifr:descriptor><ifr:definition><ifr:scalarType name=\"NAME1_GP\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>35</ifr:length><ifr:internalLength1>35</ifr:internalLength1><ifr:internalLength2>70</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>35</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 2, "I_SHIP_TO_ADDR", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:ZCUST_ADDRESS_WP", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "I_Ship_To_Addr", hmh.sap.rfc.Zcust_Address_WpType.class, new hmh.sap.rfc.Zcust_Address_WpType(), new java.lang.String[][]{}, "I_SHIP_TO_ADDR", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"I_SHIP_TO_ADDR\"><ifr:descriptor><ifr:description language=\"en\">Structure for Customer Address</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZCUST_ADDRESS_WP\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZCUST_ADDRESS_WP\" /></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 3, "I_SOLD_TO_ADDR", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:ZCUST_ADDRESS_WP", "urn:sap-com:document:sap:rfc:functions", false, 1, 1, false, null, "I_Sold_To_Addr", hmh.sap.rfc.Zcust_Address_WpType.class, new hmh.sap.rfc.Zcust_Address_WpType(), new java.lang.String[][]{}, "I_SOLD_TO_ADDR", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"I_SOLD_TO_ADDR\"><ifr:descriptor><ifr:description language=\"en\">Structure for Customer Address</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZCUST_ADDRESS_WP\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZCUST_ADDRESS_WP\" /></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 4, "I_STORE_ID", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 1, 1, false, null, "I_Store_Id", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "30"}}, "I_STORE_ID", 0, 0, -1, 30, 60, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"I_STORE_ID\"><ifr:descriptor><ifr:description language=\"en\">Characteristic Value</ifr:description></ifr:descriptor><ifr:definition><ifr:scalarType name=\"ATWRT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>30</ifr:length><ifr:internalLength1>30</ifr:internalLength1><ifr:internalLength2>60</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>30</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 5, "T_RETURN", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "T_Return", hmh.sap.rfc.util.Bapireturn1Type_List.class, new hmh.sap.rfc.Bapireturn1Type(), new java.lang.String[][]{}, "T_RETURN", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"T_RETURN\"><ifr:descriptor><ifr:description language=\"en\">Return Parameter</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"BAPIRETURN1\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPIRETURN1\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        staticDescriptor = descriptor;
    }
    public  Z_Rfc_Create_Customer_Input () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    protected  Z_Rfc_Create_Customer_Input (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    
    public void setI_Ship_To_Addr(hmh.sap.rfc.Zcust_Address_WpType I_Ship_To_Addr) {
        baseTypeData().setElementValue(2, I_Ship_To_Addr);
    }

    
    public java.lang.String getI_Ecomm_User_Name() {
        return (java.lang.String)baseTypeData().getElementValueAsString(1);
    }

    
    public void setI_Sold_To_Addr(hmh.sap.rfc.Zcust_Address_WpType I_Sold_To_Addr) {
        baseTypeData().setElementValue(3, I_Sold_To_Addr);
    }

    
    public void setI_Store_Id(java.lang.String I_Store_Id) {
        baseTypeData().setElementValue(4, I_Store_Id);
    }

    
    public void setI_Ecomm_User_Name(java.lang.String I_Ecomm_User_Name) {
        baseTypeData().setElementValue(1, I_Ecomm_User_Name);
    }

    
    public hmh.sap.rfc.Bapireturn1Type[] getT_Return() {
        hmh.sap.rfc.util.Bapireturn1Type_List i$ = (hmh.sap.rfc.util.Bapireturn1Type_List)baseTypeData().getElementValue(5);
        if ( i$ == null){return null;}
        return  i$.toArrayBapireturn1Type();
    }

    
    public hmh.sap.rfc.util.Bapireturn1Type_List get_as_listT_Return() {
        return (hmh.sap.rfc.util.Bapireturn1Type_List)baseTypeData().getElementValue(5);
    }

    
    public void setT_Return(hmh.sap.rfc.util.Bapireturn1Type_List T_Return) {
        baseTypeData().setElementValue(5, T_Return);
    }

    
    public MetaData metadataZ_Rfc_Create_Customer_Input() {
        return metadata;
    }

    
    public hmh.sap.rfc.Zcust_Address_WpType getI_Ship_To_Addr() {
        return (hmh.sap.rfc.Zcust_Address_WpType)baseTypeData().getElementValue(2);
    }

    
    public void setI_Bill_To_Addr(hmh.sap.rfc.Zcust_Address_WpType I_Bill_To_Addr) {
        baseTypeData().setElementValue(0, I_Bill_To_Addr);
    }

    
    public java.lang.String getI_Store_Id() {
        return (java.lang.String)baseTypeData().getElementValueAsString(4);
    }

    
    public void setT_Return(hmh.sap.rfc.Bapireturn1Type[] T_Return) {
        baseTypeData().setElementValue(5, new hmh.sap.rfc.util.Bapireturn1Type_List());
        hmh.sap.rfc.util.Bapireturn1Type_List list$ = get_as_listT_Return();
        for (int  i$ = 0; i$ < T_Return.length; i$++){
         list$.addBapireturn1Type(T_Return[ i$]);
        }
    }

    
    public hmh.sap.rfc.Zcust_Address_WpType getI_Bill_To_Addr() {
        return (hmh.sap.rfc.Zcust_Address_WpType)baseTypeData().getElementValue(0);
    }

    
    public hmh.sap.rfc.Zcust_Address_WpType getI_Sold_To_Addr() {
        return (hmh.sap.rfc.Zcust_Address_WpType)baseTypeData().getElementValue(3);
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  Z_Rfc_Create_Customer_Input parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Z_Rfc_Create_Customer_Input parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getI_Ship_To_Addr() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getI_Ecomm_User_Name() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getI_Store_Id() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(4);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getI_Bill_To_Addr() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getT_Return() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(5);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getI_Sold_To_Addr() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
    }

}
