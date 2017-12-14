package hmh.sap.rfc;


public class Z_Rfc_Get_Cust_Substitutions_Input extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1329337766948L) ;

    private  Z_Rfc_Get_Cust_Substitutions_Input.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.WSDL_MESSAGE_FOR_JCO, "urn:sap-com:document:sap:rfc:functions", "Z_RFC_GET_CUST_SUBSTITUTIONS.Input", 6, 0, hmh.sap.rfc.Z_Rfc_Get_Cust_Substitutions_Input.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "Z_RFC_GET_CUST_SUBSTITUTIONS", 0, 0, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Get Customer Substitution Materials</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:package>ZVSL</ifr:package><ifr:akhNode>HLA0009600</ifr:akhNode><ifr:released>no</ifr:released><ifr:outbound>false</ifr:outbound><ifr:synchronous>true</ifr:synchronous><ifr:asynchronous>false</ifr:asynchronous><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2></ifr:properties><ifr:definition /></ifr:container>");
        descriptorSetElementProperties(descriptor, 0, "I_DIVISION", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 1, 1, false, null, "I_Division", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "I_DIVISION", 0, 0, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"I_DIVISION\"><ifr:descriptor><ifr:description language=\"en\">Division</ifr:description></ifr:descriptor><ifr:definition><ifr:scalarType name=\"SPART\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 1, "I_KUNNR", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 1, 1, false, null, "I_Kunnr", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "I_KUNNR", 0, 0, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"I_KUNNR\"><ifr:descriptor><ifr:description language=\"en\">Customer Number 1</ifr:description></ifr:descriptor><ifr:definition><ifr:scalarType name=\"KUNNR\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 2, "I_TRANSACTION", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 1, 1, false, null, "I_Transaction", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "I_TRANSACTION", 0, 0, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"I_TRANSACTION\"><ifr:descriptor><ifr:description language=\"en\">Sales Document Type</ifr:description></ifr:descriptor><ifr:definition><ifr:scalarType name=\"AUART\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength><ifr:conversionExit>AUART</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 3, "T_MATERIALS", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "T_Materials", hmh.sap.rfc.util.ZvmaterialsType_List.class, new hmh.sap.rfc.ZvmaterialsType(), new java.lang.String[][]{}, "T_MATERIALS", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"T_MATERIALS\"><ifr:descriptor><ifr:description language=\"en\">Material Numbers</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZVMATERIALS\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZVMATERIALS\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 4, "T_CUSTSUB", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "T_Custsub", hmh.sap.rfc.util.ZvcustsubType_List.class, new hmh.sap.rfc.ZvcustsubType(), new java.lang.String[][]{}, "T_CUSTSUB", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"T_CUSTSUB\"><ifr:descriptor><ifr:description language=\"en\">Customer Substitution material Details</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZVCUSTSUB\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZVCUSTSUB\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 5, "T_BDCMSGCOLL", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "T_Bdcmsgcoll", hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List.class, new hmh.sap.rfc.Zbdcmsgcoll_RfcType(), new java.lang.String[][]{}, "T_BDCMSGCOLL", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"T_BDCMSGCOLL\"><ifr:descriptor><ifr:description language=\"en\">Collecting messages in the SAP System</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZBDCMSGCOLL_RFC\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZBDCMSGCOLL_RFC\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        staticDescriptor = descriptor;
    }
    protected  Z_Rfc_Get_Cust_Substitutions_Input (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    public  Z_Rfc_Get_Cust_Substitutions_Input () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public hmh.sap.rfc.util.ZvmaterialsType_List get_as_listT_Materials() {
        return (hmh.sap.rfc.util.ZvmaterialsType_List)baseTypeData().getElementValue(3);
    }

    
    public void setI_Transaction(java.lang.String I_Transaction) {
        baseTypeData().setElementValue(2, I_Transaction);
    }

    
    public void setT_Bdcmsgcoll(hmh.sap.rfc.Zbdcmsgcoll_RfcType[] T_Bdcmsgcoll) {
        baseTypeData().setElementValue(5, new hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List());
        hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List list$ = get_as_listT_Bdcmsgcoll();
        for (int  i$ = 0; i$ < T_Bdcmsgcoll.length; i$++){
         list$.addZbdcmsgcoll_RfcType(T_Bdcmsgcoll[ i$]);
        }
    }

    
    public java.lang.String getI_Kunnr() {
        return (java.lang.String)baseTypeData().getElementValueAsString(1);
    }

    
    public void setI_Division(java.lang.String I_Division) {
        baseTypeData().setElementValue(0, I_Division);
    }

    
    public hmh.sap.rfc.Zbdcmsgcoll_RfcType[] getT_Bdcmsgcoll() {
        hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List i$ = (hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List)baseTypeData().getElementValue(5);
        if ( i$ == null){return null;}
        return  i$.toArrayZbdcmsgcoll_RfcType();
    }

    
    public MetaData metadataZ_Rfc_Get_Cust_Substitutions_Input() {
        return metadata;
    }

    
    public java.lang.String getI_Division() {
        return (java.lang.String)baseTypeData().getElementValueAsString(0);
    }

    
    public void setT_Custsub(hmh.sap.rfc.ZvcustsubType[] T_Custsub) {
        baseTypeData().setElementValue(4, new hmh.sap.rfc.util.ZvcustsubType_List());
        hmh.sap.rfc.util.ZvcustsubType_List list$ = get_as_listT_Custsub();
        for (int  i$ = 0; i$ < T_Custsub.length; i$++){
         list$.addZvcustsubType(T_Custsub[ i$]);
        }
    }

    
    public void setT_Custsub(hmh.sap.rfc.util.ZvcustsubType_List T_Custsub) {
        baseTypeData().setElementValue(4, T_Custsub);
    }

    
    public hmh.sap.rfc.ZvcustsubType[] getT_Custsub() {
        hmh.sap.rfc.util.ZvcustsubType_List i$ = (hmh.sap.rfc.util.ZvcustsubType_List)baseTypeData().getElementValue(4);
        if ( i$ == null){return null;}
        return  i$.toArrayZvcustsubType();
    }

    
    public java.lang.String getI_Transaction() {
        return (java.lang.String)baseTypeData().getElementValueAsString(2);
    }

    
    public hmh.sap.rfc.ZvmaterialsType[] getT_Materials() {
        hmh.sap.rfc.util.ZvmaterialsType_List i$ = (hmh.sap.rfc.util.ZvmaterialsType_List)baseTypeData().getElementValue(3);
        if ( i$ == null){return null;}
        return  i$.toArrayZvmaterialsType();
    }

    
    public hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List get_as_listT_Bdcmsgcoll() {
        return (hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List)baseTypeData().getElementValue(5);
    }

    
    public void setT_Bdcmsgcoll(hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List T_Bdcmsgcoll) {
        baseTypeData().setElementValue(5, T_Bdcmsgcoll);
    }

    
    public void setT_Materials(hmh.sap.rfc.util.ZvmaterialsType_List T_Materials) {
        baseTypeData().setElementValue(3, T_Materials);
    }

    
    public hmh.sap.rfc.util.ZvcustsubType_List get_as_listT_Custsub() {
        return (hmh.sap.rfc.util.ZvcustsubType_List)baseTypeData().getElementValue(4);
    }

    
    public void setI_Kunnr(java.lang.String I_Kunnr) {
        baseTypeData().setElementValue(1, I_Kunnr);
    }

    
    public void setT_Materials(hmh.sap.rfc.ZvmaterialsType[] T_Materials) {
        baseTypeData().setElementValue(3, new hmh.sap.rfc.util.ZvmaterialsType_List());
        hmh.sap.rfc.util.ZvmaterialsType_List list$ = get_as_listT_Materials();
        for (int  i$ = 0; i$ < T_Materials.length; i$++){
         list$.addZvmaterialsType(T_Materials[ i$]);
        }
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  Z_Rfc_Get_Cust_Substitutions_Input parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Z_Rfc_Get_Cust_Substitutions_Input parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getT_Custsub() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(4);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getI_Kunnr() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getI_Transaction() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getT_Bdcmsgcoll() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(5);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getT_Materials() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getI_Division() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
    }

}
