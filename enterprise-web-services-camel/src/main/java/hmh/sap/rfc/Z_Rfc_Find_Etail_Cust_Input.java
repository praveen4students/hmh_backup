package hmh.sap.rfc;


public class Z_Rfc_Find_Etail_Cust_Input extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1329337766950L) ;

    private  Z_Rfc_Find_Etail_Cust_Input.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.WSDL_MESSAGE_FOR_JCO, "urn:sap-com:document:sap:rfc:functions", "Z_RFC_FIND_ETAIL_CUST.Input", 6, 0, hmh.sap.rfc.Z_Rfc_Find_Etail_Cust_Input.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "Z_RFC_FIND_ETAIL_CUST", 0, 0, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Find Etail Customer</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:package>ZVSL</ifr:package><ifr:akhNode>HLA0009600</ifr:akhNode><ifr:released>no</ifr:released><ifr:outbound>false</ifr:outbound><ifr:synchronous>true</ifr:synchronous><ifr:asynchronous>false</ifr:asynchronous><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2></ifr:properties><ifr:definition /></ifr:container>");
        descriptorSetElementProperties(descriptor, 0, "I_ADDRESS", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 1, 1, false, null, "I_Address", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "60"}}, "I_ADDRESS", 0, 0, -1, 60, 120, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"I_ADDRESS\"><ifr:descriptor><ifr:description language=\"en\">Street</ifr:description></ifr:descriptor><ifr:definition><ifr:field name=\"ADRC.STREET\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>603</ifr:offset1><ifr:offset2>1206</ifr:offset2></ifr:properties></ifr:field><ifr:scalarType name=\"AD_STREET\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>60</ifr:length><ifr:internalLength1>60</ifr:internalLength1><ifr:internalLength2>120</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>60</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 1, "I_NAME1", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 1, 1, false, null, "I_Name1", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "35"}}, "I_NAME1", 0, 0, -1, 35, 70, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"I_NAME1\"><ifr:descriptor><ifr:description language=\"en\">Name 1</ifr:description></ifr:descriptor><ifr:definition><ifr:field name=\"KNA1.NAME1\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>16</ifr:offset1><ifr:offset2>32</ifr:offset2></ifr:properties></ifr:field><ifr:scalarType name=\"NAME1_GP\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>35</ifr:length><ifr:internalLength1>35</ifr:internalLength1><ifr:internalLength2>70</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>35</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 2, "I_SPART", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 1, 1, false, null, "I_Spart", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "I_SPART", 0, 0, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"I_SPART\"><ifr:descriptor><ifr:description language=\"en\">Division</ifr:description></ifr:descriptor><ifr:definition><ifr:field name=\"KNVV.SPART\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TSPA</ifr:checkTable><ifr:offset1>19</ifr:offset1><ifr:offset2>38</ifr:offset2></ifr:properties></ifr:field><ifr:scalarType name=\"SPART\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 3, "I_ZIP", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 1, 1, false, null, "I_Zip", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "I_ZIP", 0, 0, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"I_ZIP\"><ifr:descriptor><ifr:description language=\"en\">City postal code</ifr:description></ifr:descriptor><ifr:definition><ifr:field name=\"ADRC.POST_CODE1\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>445</ifr:offset1><ifr:offset2>890</ifr:offset2></ifr:properties></ifr:field><ifr:scalarType name=\"AD_PSTCD1\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 4, "T_CUSTOMERS", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "T_Customers", hmh.sap.rfc.util.ZvetailcustType_List.class, new hmh.sap.rfc.ZvetailcustType(), new java.lang.String[][]{}, "T_CUSTOMERS", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"T_CUSTOMERS\"><ifr:descriptor><ifr:description language=\"en\">Etial Customer Ids</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZVETAILCUST\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZVETAILCUST\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 5, "T_BDCMSGCOLL", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "T_Bdcmsgcoll", hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List.class, new hmh.sap.rfc.Zbdcmsgcoll_RfcType(), new java.lang.String[][]{}, "T_BDCMSGCOLL", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"T_BDCMSGCOLL\"><ifr:descriptor><ifr:description language=\"en\">Collecting messages in the SAP System</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZBDCMSGCOLL_RFC\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZBDCMSGCOLL_RFC\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        staticDescriptor = descriptor;
    }
    protected  Z_Rfc_Find_Etail_Cust_Input (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    public  Z_Rfc_Find_Etail_Cust_Input () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public void setI_Spart(java.lang.String I_Spart) {
        baseTypeData().setElementValue(2, I_Spart);
    }

    
    public java.lang.String getI_Zip() {
        return (java.lang.String)baseTypeData().getElementValueAsString(3);
    }

    
    public void setT_Customers(hmh.sap.rfc.util.ZvetailcustType_List T_Customers) {
        baseTypeData().setElementValue(4, T_Customers);
    }

    
    public MetaData metadataZ_Rfc_Find_Etail_Cust_Input() {
        return metadata;
    }

    
    public void setT_Bdcmsgcoll(hmh.sap.rfc.Zbdcmsgcoll_RfcType[] T_Bdcmsgcoll) {
        baseTypeData().setElementValue(5, new hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List());
        hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List list$ = get_as_listT_Bdcmsgcoll();
        for (int  i$ = 0; i$ < T_Bdcmsgcoll.length; i$++){
         list$.addZbdcmsgcoll_RfcType(T_Bdcmsgcoll[ i$]);
        }
    }

    
    public hmh.sap.rfc.Zbdcmsgcoll_RfcType[] getT_Bdcmsgcoll() {
        hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List i$ = (hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List)baseTypeData().getElementValue(5);
        if ( i$ == null){return null;}
        return  i$.toArrayZbdcmsgcoll_RfcType();
    }

    
    public java.lang.String getI_Address() {
        return (java.lang.String)baseTypeData().getElementValueAsString(0);
    }

    
    public java.lang.String getI_Spart() {
        return (java.lang.String)baseTypeData().getElementValueAsString(2);
    }

    
    public void setI_Name1(java.lang.String I_Name1) {
        baseTypeData().setElementValue(1, I_Name1);
    }

    
    public java.lang.String getI_Name1() {
        return (java.lang.String)baseTypeData().getElementValueAsString(1);
    }

    
    public void setT_Customers(hmh.sap.rfc.ZvetailcustType[] T_Customers) {
        baseTypeData().setElementValue(4, new hmh.sap.rfc.util.ZvetailcustType_List());
        hmh.sap.rfc.util.ZvetailcustType_List list$ = get_as_listT_Customers();
        for (int  i$ = 0; i$ < T_Customers.length; i$++){
         list$.addZvetailcustType(T_Customers[ i$]);
        }
    }

    
    public hmh.sap.rfc.util.ZvetailcustType_List get_as_listT_Customers() {
        return (hmh.sap.rfc.util.ZvetailcustType_List)baseTypeData().getElementValue(4);
    }

    
    public hmh.sap.rfc.ZvetailcustType[] getT_Customers() {
        hmh.sap.rfc.util.ZvetailcustType_List i$ = (hmh.sap.rfc.util.ZvetailcustType_List)baseTypeData().getElementValue(4);
        if ( i$ == null){return null;}
        return  i$.toArrayZvetailcustType();
    }

    
    public void setI_Address(java.lang.String I_Address) {
        baseTypeData().setElementValue(0, I_Address);
    }

    
    public void setI_Zip(java.lang.String I_Zip) {
        baseTypeData().setElementValue(3, I_Zip);
    }

    
    public hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List get_as_listT_Bdcmsgcoll() {
        return (hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List)baseTypeData().getElementValue(5);
    }

    
    public void setT_Bdcmsgcoll(hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List T_Bdcmsgcoll) {
        baseTypeData().setElementValue(5, T_Bdcmsgcoll);
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  Z_Rfc_Find_Etail_Cust_Input parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Z_Rfc_Find_Etail_Cust_Input parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getI_Zip() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getI_Name1() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getT_Customers() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(4);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getT_Bdcmsgcoll() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(5);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getI_Address() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getI_Spart() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
    }

}
