package hmh.sap.rfc;


public class Z_Rfc_Create_Etail_Customer_Input extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1329337766949L) ;

    private  Z_Rfc_Create_Etail_Customer_Input.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.WSDL_MESSAGE_FOR_JCO, "urn:sap-com:document:sap:rfc:functions", "Z_RFC_CREATE_ETAIL_CUSTOMER.Input", 8, 0, hmh.sap.rfc.Z_Rfc_Create_Etail_Customer_Input.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "Z_RFC_CREATE_ETAIL_CUSTOMER", 0, 0, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">To Create an E-tail Customer</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:package>ZVSL</ifr:package><ifr:akhNode>HLA0009600</ifr:akhNode><ifr:released>no</ifr:released><ifr:outbound>false</ifr:outbound><ifr:synchronous>true</ifr:synchronous><ifr:asynchronous>false</ifr:asynchronous><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2></ifr:properties><ifr:definition /></ifr:container>");
        descriptorSetElementProperties(descriptor, 0, "I_BILL_TO_ADDR", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:ZCUST_ADDRESS", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "I_Bill_To_Addr", hmh.sap.rfc.Zcust_AddressType.class, new hmh.sap.rfc.Zcust_AddressType(), new java.lang.String[][]{}, "I_BILL_TO_ADDR", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"I_BILL_TO_ADDR\"><ifr:descriptor><ifr:description language=\"en\">Structure for Customer Address</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZCUST_ADDRESS\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZCUST_ADDRESS\" /></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 1, "I_CUSTOMER_NAME", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 1, 1, false, null, "I_Customer_Name", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "35"}}, "I_CUSTOMER_NAME", 0, 0, -1, 35, 70, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"I_CUSTOMER_NAME\"><ifr:descriptor><ifr:description language=\"en\">Name 1</ifr:description></ifr:descriptor><ifr:definition><ifr:scalarType name=\"NAME1_GP\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>35</ifr:length><ifr:internalLength1>35</ifr:internalLength1><ifr:internalLength2>70</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>35</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 2, "I_EMAIL", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "I_Email", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "241"}}, "I_EMAIL", 0, 0, -1, 241, 482, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"I_EMAIL\"><ifr:descriptor><ifr:description language=\"en\">E-Mail Address</ifr:description></ifr:descriptor><ifr:definition><ifr:scalarType name=\"AD_SMTPADR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>241</ifr:length><ifr:internalLength1>241</ifr:internalLength1><ifr:internalLength2>482</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>241</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 3, "I_SHIP_TO_ADDR", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:ZCUST_ADDRESS", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "I_Ship_To_Addr", hmh.sap.rfc.Zcust_AddressType.class, new hmh.sap.rfc.Zcust_AddressType(), new java.lang.String[][]{}, "I_SHIP_TO_ADDR", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"I_SHIP_TO_ADDR\"><ifr:descriptor><ifr:description language=\"en\">Structure for Customer Address</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZCUST_ADDRESS\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZCUST_ADDRESS\" /></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 4, "I_SOLD_TO_ADDR", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:ZCUST_ADDRESS", "urn:sap-com:document:sap:rfc:functions", false, 1, 1, false, null, "I_Sold_To_Addr", hmh.sap.rfc.Zcust_AddressType.class, new hmh.sap.rfc.Zcust_AddressType(), new java.lang.String[][]{}, "I_SOLD_TO_ADDR", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"I_SOLD_TO_ADDR\"><ifr:descriptor><ifr:description language=\"en\">Structure for Customer Address</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZCUST_ADDRESS\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZCUST_ADDRESS\" /></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 5, "I_STORE_ID", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 1, 1, false, null, "I_Store_Id", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "30"}}, "I_STORE_ID", 0, 0, -1, 30, 60, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"I_STORE_ID\"><ifr:descriptor><ifr:description language=\"en\">Customer Number 1</ifr:description></ifr:descriptor><ifr:definition><ifr:scalarType name=\"ATWRT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>30</ifr:length><ifr:internalLength1>30</ifr:internalLength1><ifr:internalLength2>60</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>30</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 6, "I_TELEPHONE_1", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 1, 1, false, null, "I_Telephone_1", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "16"}}, "I_TELEPHONE_1", 0, 0, -1, 16, 32, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"I_TELEPHONE_1\"><ifr:descriptor><ifr:description language=\"en\">First telephone number</ifr:description></ifr:descriptor><ifr:definition><ifr:scalarType name=\"TELF1\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>16</ifr:length><ifr:internalLength1>16</ifr:internalLength1><ifr:internalLength2>32</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>16</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 7, "T_RETURN_TAB", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "T_Return_Tab", hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List.class, new hmh.sap.rfc.Zbdcmsgcoll_RfcType(), new java.lang.String[][]{}, "T_RETURN_TAB", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"T_RETURN_TAB\"><ifr:descriptor><ifr:description language=\"en\">Collecting messages in the SAP System</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZBDCMSGCOLL_RFC\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZBDCMSGCOLL_RFC\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        staticDescriptor = descriptor;
    }
    public  Z_Rfc_Create_Etail_Customer_Input () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    protected  Z_Rfc_Create_Etail_Customer_Input (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    
    public java.lang.String getI_Customer_Name() {
        return (java.lang.String)baseTypeData().getElementValueAsString(1);
    }

    
    public void setI_Sold_To_Addr(hmh.sap.rfc.Zcust_AddressType I_Sold_To_Addr) {
        baseTypeData().setElementValue(4, I_Sold_To_Addr);
    }

    
    public java.lang.String getI_Email() {
        return (java.lang.String)baseTypeData().getElementValueAsString(2);
    }

    
    public void setI_Ship_To_Addr(hmh.sap.rfc.Zcust_AddressType I_Ship_To_Addr) {
        baseTypeData().setElementValue(3, I_Ship_To_Addr);
    }

    
    public void setI_Telephone_1(java.lang.String I_Telephone_1) {
        baseTypeData().setElementValue(6, I_Telephone_1);
    }

    
    public void setI_Bill_To_Addr(hmh.sap.rfc.Zcust_AddressType I_Bill_To_Addr) {
        baseTypeData().setElementValue(0, I_Bill_To_Addr);
    }

    
    public MetaData metadataZ_Rfc_Create_Etail_Customer_Input() {
        return metadata;
    }

    
    public void setI_Store_Id(java.lang.String I_Store_Id) {
        baseTypeData().setElementValue(5, I_Store_Id);
    }

    
    public void setT_Return_Tab(hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List T_Return_Tab) {
        baseTypeData().setElementValue(7, T_Return_Tab);
    }

    
    public hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List get_as_listT_Return_Tab() {
        return (hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List)baseTypeData().getElementValue(7);
    }

    
    public void setT_Return_Tab(hmh.sap.rfc.Zbdcmsgcoll_RfcType[] T_Return_Tab) {
        baseTypeData().setElementValue(7, new hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List());
        hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List list$ = get_as_listT_Return_Tab();
        for (int  i$ = 0; i$ < T_Return_Tab.length; i$++){
         list$.addZbdcmsgcoll_RfcType(T_Return_Tab[ i$]);
        }
    }

    
    public hmh.sap.rfc.Zcust_AddressType getI_Ship_To_Addr() {
        return (hmh.sap.rfc.Zcust_AddressType)baseTypeData().getElementValue(3);
    }

    
    public java.lang.String getI_Store_Id() {
        return (java.lang.String)baseTypeData().getElementValueAsString(5);
    }

    
    public java.lang.String getI_Telephone_1() {
        return (java.lang.String)baseTypeData().getElementValueAsString(6);
    }

    
    public hmh.sap.rfc.Zbdcmsgcoll_RfcType[] getT_Return_Tab() {
        hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List i$ = (hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List)baseTypeData().getElementValue(7);
        if ( i$ == null){return null;}
        return  i$.toArrayZbdcmsgcoll_RfcType();
    }

    
    public hmh.sap.rfc.Zcust_AddressType getI_Bill_To_Addr() {
        return (hmh.sap.rfc.Zcust_AddressType)baseTypeData().getElementValue(0);
    }

    
    public hmh.sap.rfc.Zcust_AddressType getI_Sold_To_Addr() {
        return (hmh.sap.rfc.Zcust_AddressType)baseTypeData().getElementValue(4);
    }

    
    public void setI_Customer_Name(java.lang.String I_Customer_Name) {
        baseTypeData().setElementValue(1, I_Customer_Name);
    }

    
    public void setI_Email(java.lang.String I_Email) {
        baseTypeData().setElementValue(2, I_Email);
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  Z_Rfc_Create_Etail_Customer_Input parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Z_Rfc_Create_Etail_Customer_Input parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getI_Customer_Name() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getI_Email() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getI_Ship_To_Addr() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getI_Telephone_1() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(6);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getI_Store_Id() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(5);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getT_Return_Tab() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(7);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getI_Bill_To_Addr() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getI_Sold_To_Addr() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(4);
        }
    
    }

}
