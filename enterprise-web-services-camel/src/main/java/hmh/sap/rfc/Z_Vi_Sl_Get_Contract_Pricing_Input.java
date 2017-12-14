package hmh.sap.rfc;


public class Z_Vi_Sl_Get_Contract_Pricing_Input extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1343922213457L) ;

    private  Z_Vi_Sl_Get_Contract_Pricing_Input.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.WSDL_MESSAGE_FOR_JCO, "urn:sap-com:document:sap:rfc:functions", "Z_VI_SL_GET_CONTRACT_PRICING.Input", 9, 0, hmh.sap.rfc.Z_Vi_Sl_Get_Contract_Pricing_Input.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "Z_VI_SL_GET_CONTRACT_PRICING", 0, 0, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Contract Pricing Lookup Function</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:package>ZVSL</ifr:package><ifr:akhNode>HLA0009600</ifr:akhNode><ifr:released>no</ifr:released><ifr:outbound>false</ifr:outbound><ifr:synchronous>true</ifr:synchronous><ifr:asynchronous>false</ifr:asynchronous><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2></ifr:properties><ifr:definition /></ifr:container>");
        descriptorSetElementProperties(descriptor, 0, "I_ORDER_REASON", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "I_Order_Reason", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "I_ORDER_REASON", 0, 0, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"I_ORDER_REASON\"><ifr:descriptor><ifr:description language=\"en\">Order reason (reason for the business transaction)</ifr:description></ifr:descriptor><ifr:definition><ifr:scalarType name=\"AUGRU\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 1, "I_SELLING_DIVISION", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 1, 1, false, null, "I_Selling_Division", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "I_SELLING_DIVISION", 0, 0, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"I_SELLING_DIVISION\"><ifr:descriptor><ifr:description language=\"en\">Selling Division</ifr:description></ifr:descriptor><ifr:definition><ifr:scalarType name=\"SPART\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 2, "I_SHIP_TO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 1, 1, false, null, "I_Ship_To", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "I_SHIP_TO", 0, 0, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"I_SHIP_TO\"><ifr:descriptor><ifr:description language=\"en\">Ship-To Party</ifr:description></ifr:descriptor><ifr:definition><ifr:scalarType name=\"KUNWE\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 3, "I_SHIP_TO_COUNTRY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "I_Ship_To_Country", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "I_SHIP_TO_COUNTRY", 0, 0, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"I_SHIP_TO_COUNTRY\"><ifr:descriptor><ifr:description language=\"en\">Country</ifr:description></ifr:descriptor><ifr:definition><ifr:scalarType name=\"LAND1\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 4, "I_SHIP_TO_STATE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "I_Ship_To_State", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "I_SHIP_TO_STATE", 0, 0, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"I_SHIP_TO_STATE\"><ifr:descriptor><ifr:description language=\"en\">Region (State, Province, County)</ifr:description></ifr:descriptor><ifr:definition><ifr:scalarType name=\"REGIO\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 5, "I_SOLD_TO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 1, 1, false, null, "I_Sold_To", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "I_SOLD_TO", 0, 0, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"I_SOLD_TO\"><ifr:descriptor><ifr:description language=\"en\">Sold-to party</ifr:description></ifr:descriptor><ifr:definition><ifr:scalarType name=\"KUNAG\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 6, "O_RETURN", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "O_Return", hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List.class, new hmh.sap.rfc.Zbdcmsgcoll_RfcType(), new java.lang.String[][]{}, "O_RETURN", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"O_RETURN\"><ifr:descriptor><ifr:description language=\"en\">Error Msssages</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZBDCMSGCOLL_RFC\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZBDCMSGCOLL_RFC\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 7, "O_PRICE", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "O_Price", hmh.sap.rfc.util.ZcontprType_List.class, new hmh.sap.rfc.ZcontprType(), new java.lang.String[][]{}, "O_PRICE", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"O_PRICE\"><ifr:descriptor><ifr:description language=\"en\">Contract Price Output</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZCONTPR\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZCONTPR\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 8, "I_MATERIALS", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "I_Materials", hmh.sap.rfc.util.ZmatnrType_List.class, new hmh.sap.rfc.ZmatnrType(), new java.lang.String[][]{}, "I_MATERIALS", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"I_MATERIALS\"><ifr:descriptor><ifr:description language=\"en\">Materials - Input</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZMATNR\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZMATNR\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        staticDescriptor = descriptor;
    }
    public  Z_Vi_Sl_Get_Contract_Pricing_Input () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    protected  Z_Vi_Sl_Get_Contract_Pricing_Input (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    
    public void setI_Ship_To_State(java.lang.String I_Ship_To_State) {
        baseTypeData().setElementValue(4, I_Ship_To_State);
    }

    
    public java.lang.String getI_Selling_Division() {
        return (java.lang.String)baseTypeData().getElementValueAsString(1);
    }

    
    public java.lang.String getI_Order_Reason() {
        return (java.lang.String)baseTypeData().getElementValueAsString(0);
    }

    
    public hmh.sap.rfc.Zbdcmsgcoll_RfcType[] getO_Return() {
        hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List i$ = (hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List)baseTypeData().getElementValue(6);
        if ( i$ == null){return null;}
        return  i$.toArrayZbdcmsgcoll_RfcType();
    }

    
    public void setI_Sold_To(java.lang.String I_Sold_To) {
        baseTypeData().setElementValue(5, I_Sold_To);
    }

    
    public void setI_Order_Reason(java.lang.String I_Order_Reason) {
        baseTypeData().setElementValue(0, I_Order_Reason);
    }

    
    public hmh.sap.rfc.util.ZcontprType_List get_as_listO_Price() {
        return (hmh.sap.rfc.util.ZcontprType_List)baseTypeData().getElementValue(7);
    }

    
    public void setO_Price(hmh.sap.rfc.ZcontprType[] O_Price) {
        baseTypeData().setElementValue(7, new hmh.sap.rfc.util.ZcontprType_List());
        hmh.sap.rfc.util.ZcontprType_List list$ = get_as_listO_Price();
        for (int  i$ = 0; i$ < O_Price.length; i$++){
         list$.addZcontprType(O_Price[ i$]);
        }
    }

    
    public hmh.sap.rfc.ZmatnrType[] getI_Materials() {
        hmh.sap.rfc.util.ZmatnrType_List i$ = (hmh.sap.rfc.util.ZmatnrType_List)baseTypeData().getElementValue(8);
        if ( i$ == null){return null;}
        return  i$.toArrayZmatnrType();
    }

    
    public MetaData metadataZ_Vi_Sl_Get_Contract_Pricing_Input() {
        return metadata;
    }

    
    public void setI_Ship_To_Country(java.lang.String I_Ship_To_Country) {
        baseTypeData().setElementValue(3, I_Ship_To_Country);
    }

    
    public hmh.sap.rfc.util.ZmatnrType_List get_as_listI_Materials() {
        return (hmh.sap.rfc.util.ZmatnrType_List)baseTypeData().getElementValue(8);
    }

    
    public java.lang.String getI_Sold_To() {
        return (java.lang.String)baseTypeData().getElementValueAsString(5);
    }

    
    public java.lang.String getI_Ship_To_Country() {
        return (java.lang.String)baseTypeData().getElementValueAsString(3);
    }

    
    public java.lang.String getI_Ship_To() {
        return (java.lang.String)baseTypeData().getElementValueAsString(2);
    }

    
    public hmh.sap.rfc.ZcontprType[] getO_Price() {
        hmh.sap.rfc.util.ZcontprType_List i$ = (hmh.sap.rfc.util.ZcontprType_List)baseTypeData().getElementValue(7);
        if ( i$ == null){return null;}
        return  i$.toArrayZcontprType();
    }

    
    public void setO_Return(hmh.sap.rfc.Zbdcmsgcoll_RfcType[] O_Return) {
        baseTypeData().setElementValue(6, new hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List());
        hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List list$ = get_as_listO_Return();
        for (int  i$ = 0; i$ < O_Return.length; i$++){
         list$.addZbdcmsgcoll_RfcType(O_Return[ i$]);
        }
    }

    
    public void setI_Materials(hmh.sap.rfc.util.ZmatnrType_List I_Materials) {
        baseTypeData().setElementValue(8, I_Materials);
    }

    
    public void setI_Selling_Division(java.lang.String I_Selling_Division) {
        baseTypeData().setElementValue(1, I_Selling_Division);
    }

    
    public void setO_Price(hmh.sap.rfc.util.ZcontprType_List O_Price) {
        baseTypeData().setElementValue(7, O_Price);
    }

    
    public hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List get_as_listO_Return() {
        return (hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List)baseTypeData().getElementValue(6);
    }

    
    public void setI_Materials(hmh.sap.rfc.ZmatnrType[] I_Materials) {
        baseTypeData().setElementValue(8, new hmh.sap.rfc.util.ZmatnrType_List());
        hmh.sap.rfc.util.ZmatnrType_List list$ = get_as_listI_Materials();
        for (int  i$ = 0; i$ < I_Materials.length; i$++){
         list$.addZmatnrType(I_Materials[ i$]);
        }
    }

    
    public void setI_Ship_To(java.lang.String I_Ship_To) {
        baseTypeData().setElementValue(2, I_Ship_To);
    }

    
    public java.lang.String getI_Ship_To_State() {
        return (java.lang.String)baseTypeData().getElementValueAsString(4);
    }

    
    public void setO_Return(hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List O_Return) {
        baseTypeData().setElementValue(6, O_Return);
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  Z_Vi_Sl_Get_Contract_Pricing_Input parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Z_Vi_Sl_Get_Contract_Pricing_Input parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getO_Return() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(6);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getI_Selling_Division() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getI_Order_Reason() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getI_Sold_To() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(5);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getI_Ship_To_Country() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getI_Ship_To() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getO_Price() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(7);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getI_Materials() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(8);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getI_Ship_To_State() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(4);
        }
    
    }

}
