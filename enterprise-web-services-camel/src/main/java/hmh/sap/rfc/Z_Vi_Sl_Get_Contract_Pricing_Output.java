package hmh.sap.rfc;


public class Z_Vi_Sl_Get_Contract_Pricing_Output extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1343922213459L) ;

    private  Z_Vi_Sl_Get_Contract_Pricing_Output.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.WSDL_MESSAGE_FOR_JCO, "urn:sap-com:document:sap:rfc:functions", "Z_VI_SL_GET_CONTRACT_PRICING.Output", 3, 0, hmh.sap.rfc.Z_Vi_Sl_Get_Contract_Pricing_Output.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "Z_VI_SL_GET_CONTRACT_PRICING", 0, 0, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Contract Pricing Lookup Function</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:package>ZVSL</ifr:package><ifr:akhNode>HLA0009600</ifr:akhNode><ifr:released>no</ifr:released><ifr:outbound>false</ifr:outbound><ifr:synchronous>true</ifr:synchronous><ifr:asynchronous>false</ifr:asynchronous><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2></ifr:properties><ifr:definition /></ifr:container>");
        descriptorSetElementProperties(descriptor, 0, "O_RETURN", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "O_Return", hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List.class, new hmh.sap.rfc.Zbdcmsgcoll_RfcType(), new java.lang.String[][]{}, "O_RETURN", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"O_RETURN\"><ifr:descriptor><ifr:description language=\"en\">Error Msssages</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZBDCMSGCOLL_RFC\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZBDCMSGCOLL_RFC\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 1, "O_PRICE", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "O_Price", hmh.sap.rfc.util.ZcontprType_List.class, new hmh.sap.rfc.ZcontprType(), new java.lang.String[][]{}, "O_PRICE", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"O_PRICE\"><ifr:descriptor><ifr:description language=\"en\">Contract Price Output</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZCONTPR\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZCONTPR\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 2, "I_MATERIALS", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "I_Materials", hmh.sap.rfc.util.ZmatnrType_List.class, new hmh.sap.rfc.ZmatnrType(), new java.lang.String[][]{}, "I_MATERIALS", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"I_MATERIALS\"><ifr:descriptor><ifr:description language=\"en\">Materials - Input</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZMATNR\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZMATNR\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        staticDescriptor = descriptor;
    }
    public  Z_Vi_Sl_Get_Contract_Pricing_Output () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    protected  Z_Vi_Sl_Get_Contract_Pricing_Output (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    
    public void setI_Materials(hmh.sap.rfc.util.ZmatnrType_List I_Materials) {
        baseTypeData().setElementValue(2, I_Materials);
    }

    
    public MetaData metadataZ_Vi_Sl_Get_Contract_Pricing_Output() {
        return metadata;
    }

    
    public hmh.sap.rfc.Zbdcmsgcoll_RfcType[] getO_Return() {
        hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List i$ = (hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List)baseTypeData().getElementValue(0);
        if ( i$ == null){return null;}
        return  i$.toArrayZbdcmsgcoll_RfcType();
    }

    
    public hmh.sap.rfc.util.ZcontprType_List get_as_listO_Price() {
        return (hmh.sap.rfc.util.ZcontprType_List)baseTypeData().getElementValue(1);
    }

    
    public void setO_Price(hmh.sap.rfc.ZcontprType[] O_Price) {
        baseTypeData().setElementValue(1, new hmh.sap.rfc.util.ZcontprType_List());
        hmh.sap.rfc.util.ZcontprType_List list$ = get_as_listO_Price();
        for (int  i$ = 0; i$ < O_Price.length; i$++){
         list$.addZcontprType(O_Price[ i$]);
        }
    }

    
    public hmh.sap.rfc.ZmatnrType[] getI_Materials() {
        hmh.sap.rfc.util.ZmatnrType_List i$ = (hmh.sap.rfc.util.ZmatnrType_List)baseTypeData().getElementValue(2);
        if ( i$ == null){return null;}
        return  i$.toArrayZmatnrType();
    }

    
    public void setO_Price(hmh.sap.rfc.util.ZcontprType_List O_Price) {
        baseTypeData().setElementValue(1, O_Price);
    }

    
    public hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List get_as_listO_Return() {
        return (hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List)baseTypeData().getElementValue(0);
    }

    
    public hmh.sap.rfc.util.ZmatnrType_List get_as_listI_Materials() {
        return (hmh.sap.rfc.util.ZmatnrType_List)baseTypeData().getElementValue(2);
    }

    
    public void setI_Materials(hmh.sap.rfc.ZmatnrType[] I_Materials) {
        baseTypeData().setElementValue(2, new hmh.sap.rfc.util.ZmatnrType_List());
        hmh.sap.rfc.util.ZmatnrType_List list$ = get_as_listI_Materials();
        for (int  i$ = 0; i$ < I_Materials.length; i$++){
         list$.addZmatnrType(I_Materials[ i$]);
        }
    }

    
    public hmh.sap.rfc.ZcontprType[] getO_Price() {
        hmh.sap.rfc.util.ZcontprType_List i$ = (hmh.sap.rfc.util.ZcontprType_List)baseTypeData().getElementValue(1);
        if ( i$ == null){return null;}
        return  i$.toArrayZcontprType();
    }

    
    public void setO_Return(hmh.sap.rfc.Zbdcmsgcoll_RfcType[] O_Return) {
        baseTypeData().setElementValue(0, new hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List());
        hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List list$ = get_as_listO_Return();
        for (int  i$ = 0; i$ < O_Return.length; i$++){
         list$.addZbdcmsgcoll_RfcType(O_Return[ i$]);
        }
    }

    
    public void setO_Return(hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List O_Return) {
        baseTypeData().setElementValue(0, O_Return);
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  Z_Vi_Sl_Get_Contract_Pricing_Output parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Z_Vi_Sl_Get_Contract_Pricing_Output parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getO_Return() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getO_Price() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getI_Materials() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
    }

}
