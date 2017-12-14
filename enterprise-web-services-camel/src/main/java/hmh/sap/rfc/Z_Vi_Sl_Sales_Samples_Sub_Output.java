package hmh.sap.rfc;


public class Z_Vi_Sl_Sales_Samples_Sub_Output extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1355250403753L) ;

    private  Z_Vi_Sl_Sales_Samples_Sub_Output.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.WSDL_MESSAGE_FOR_JCO, "urn:sap-com:document:sap:rfc:functions", "Z_VI_SL_SALES_SAMPLES_SUB.Output", 5, 0, hmh.sap.rfc.Z_Vi_Sl_Sales_Samples_Sub_Output.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "Z_VI_SL_SALES_SAMPLES_SUB", 0, 0, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Create Sales Order From ECommerce</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>110</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:package>ZVSL</ifr:package><ifr:akhNode>HLA0009600</ifr:akhNode><ifr:released>no</ifr:released><ifr:outbound>false</ifr:outbound><ifr:synchronous>true</ifr:synchronous><ifr:asynchronous>false</ifr:asynchronous><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2></ifr:properties><ifr:definition /></ifr:container>");
        descriptorSetElementProperties(descriptor, 0, "E_STATUS", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "E_Status", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "E_STATUS", 0, 0, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.EXPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"E_STATUS\"><ifr:descriptor><ifr:description language=\"en\">Status Indicator For Function Module</ifr:description></ifr:descriptor><ifr:definition><ifr:scalarType name=\"CHAR1\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>out</ifr:direction><ifr:class>export</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 1, "SALESDOCHEADOUT", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:ZVGETSALES_HE", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Salesdocheadout", hmh.sap.rfc.Zvgetsales_HeType.class, new hmh.sap.rfc.Zvgetsales_HeType(), new java.lang.String[][]{}, "SALESDOCHEADOUT", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, com.sap.mw.jco.JCO.EXPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"SALESDOCHEADOUT\"><ifr:descriptor><ifr:description language=\"en\">Sales Document Input Headers Structure</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZVGETSALES_HE\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZVGETSALES_HE\" /></ifr:definition><ifr:properties><ifr:direction>out</ifr:direction><ifr:class>export</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 2, "SALESDOCDETAILOUT", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Salesdocdetailout", hmh.sap.rfc.util.Zvgetsales_LeType_List.class, new hmh.sap.rfc.Zvgetsales_LeType(), new java.lang.String[][]{}, "SALESDOCDETAILOUT", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"SALESDOCDETAILOUT\"><ifr:descriptor><ifr:description language=\"en\">Sales Document Item Details(Output From Funtion Module)</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZVGETSALES_LE\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZVGETSALES_LE\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 3, "SALESDOCDETAILIN", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Salesdocdetailin", hmh.sap.rfc.util.Zvgetsales_LType_List.class, new hmh.sap.rfc.Zvgetsales_LType(), new java.lang.String[][]{}, "SALESDOCDETAILIN", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"SALESDOCDETAILIN\"><ifr:descriptor><ifr:description language=\"en\">Sales Document Item  Details(Input To Function Module)</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZVGETSALES_L\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZVGETSALES_L\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 4, "RETURN", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Return", hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List.class, new hmh.sap.rfc.Zbdcmsgcoll_RfcType(), new java.lang.String[][]{}, "RETURN", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"RETURN\"><ifr:descriptor><ifr:description language=\"en\">Return parameter (for error)</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZBDCMSGCOLL_RFC\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZBDCMSGCOLL_RFC\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        staticDescriptor = descriptor;
    }
    public  Z_Vi_Sl_Sales_Samples_Sub_Output () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    protected  Z_Vi_Sl_Sales_Samples_Sub_Output (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    
    public void setReturn(hmh.sap.rfc.Zbdcmsgcoll_RfcType[] Return) {
        baseTypeData().setElementValue(4, new hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List());
        hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List list$ = get_as_listReturn();
        for (int  i$ = 0; i$ < Return.length; i$++){
         list$.addZbdcmsgcoll_RfcType(Return[ i$]);
        }
    }

    
    public hmh.sap.rfc.Zvgetsales_HeType getSalesdocheadout() {
        return (hmh.sap.rfc.Zvgetsales_HeType)baseTypeData().getElementValue(1);
    }

    
    public void setSalesdocdetailout(hmh.sap.rfc.util.Zvgetsales_LeType_List Salesdocdetailout) {
        baseTypeData().setElementValue(2, Salesdocdetailout);
    }

    
    public hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List get_as_listReturn() {
        return (hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List)baseTypeData().getElementValue(4);
    }

    
    public void setSalesdocdetailin(hmh.sap.rfc.util.Zvgetsales_LType_List Salesdocdetailin) {
        baseTypeData().setElementValue(3, Salesdocdetailin);
    }

    
    public MetaData metadataZ_Vi_Sl_Sales_Samples_Sub_Output() {
        return metadata;
    }

    
    public void setSalesdocdetailout(hmh.sap.rfc.Zvgetsales_LeType[] Salesdocdetailout) {
        baseTypeData().setElementValue(2, new hmh.sap.rfc.util.Zvgetsales_LeType_List());
        hmh.sap.rfc.util.Zvgetsales_LeType_List list$ = get_as_listSalesdocdetailout();
        for (int  i$ = 0; i$ < Salesdocdetailout.length; i$++){
         list$.addZvgetsales_LeType(Salesdocdetailout[ i$]);
        }
    }

    
    public void setSalesdocdetailin(hmh.sap.rfc.Zvgetsales_LType[] Salesdocdetailin) {
        baseTypeData().setElementValue(3, new hmh.sap.rfc.util.Zvgetsales_LType_List());
        hmh.sap.rfc.util.Zvgetsales_LType_List list$ = get_as_listSalesdocdetailin();
        for (int  i$ = 0; i$ < Salesdocdetailin.length; i$++){
         list$.addZvgetsales_LType(Salesdocdetailin[ i$]);
        }
    }

    
    public hmh.sap.rfc.Zbdcmsgcoll_RfcType[] getReturn() {
        hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List i$ = (hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List)baseTypeData().getElementValue(4);
        if ( i$ == null){return null;}
        return  i$.toArrayZbdcmsgcoll_RfcType();
    }

    
    public hmh.sap.rfc.Zvgetsales_LType[] getSalesdocdetailin() {
        hmh.sap.rfc.util.Zvgetsales_LType_List i$ = (hmh.sap.rfc.util.Zvgetsales_LType_List)baseTypeData().getElementValue(3);
        if ( i$ == null){return null;}
        return  i$.toArrayZvgetsales_LType();
    }

    
    public hmh.sap.rfc.util.Zvgetsales_LType_List get_as_listSalesdocdetailin() {
        return (hmh.sap.rfc.util.Zvgetsales_LType_List)baseTypeData().getElementValue(3);
    }

    
    public hmh.sap.rfc.util.Zvgetsales_LeType_List get_as_listSalesdocdetailout() {
        return (hmh.sap.rfc.util.Zvgetsales_LeType_List)baseTypeData().getElementValue(2);
    }

    
    public java.lang.String getE_Status() {
        return (java.lang.String)baseTypeData().getElementValueAsString(0);
    }

    
    public void setSalesdocheadout(hmh.sap.rfc.Zvgetsales_HeType Salesdocheadout) {
        baseTypeData().setElementValue(1, Salesdocheadout);
    }

    
    public void setReturn(hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List Return) {
        baseTypeData().setElementValue(4, Return);
    }

    
    public void setE_Status(java.lang.String E_Status) {
        baseTypeData().setElementValue(0, E_Status);
    }

    
    public hmh.sap.rfc.Zvgetsales_LeType[] getSalesdocdetailout() {
        hmh.sap.rfc.util.Zvgetsales_LeType_List i$ = (hmh.sap.rfc.util.Zvgetsales_LeType_List)baseTypeData().getElementValue(2);
        if ( i$ == null){return null;}
        return  i$.toArrayZvgetsales_LeType();
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  Z_Vi_Sl_Sales_Samples_Sub_Output parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Z_Vi_Sl_Sales_Samples_Sub_Output parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getReturn() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(4);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSalesdocdetailin() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSalesdocheadout() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getE_Status() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSalesdocdetailout() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
    }

}
