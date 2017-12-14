package hmh.sap.rfc;


public class Z_Rfc_Get_Invoices_Output extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1329338318024L) ;

    private  Z_Rfc_Get_Invoices_Output.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.WSDL_MESSAGE_FOR_JCO, "urn:sap-com:document:sap:rfc:functions", "Z_RFC_GET_INVOICES.Output", 6, 0, hmh.sap.rfc.Z_Rfc_Get_Invoices_Output.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "Z_RFC_GET_INVOICES", 0, 0, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">463 - RFC For Get Invoices</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:package>ZVSL</ifr:package><ifr:akhNode>HLA0009600</ifr:akhNode><ifr:released>no</ifr:released><ifr:outbound>false</ifr:outbound><ifr:synchronous>true</ifr:synchronous><ifr:asynchronous>false</ifr:asynchronous><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2></ifr:properties><ifr:definition /></ifr:container>");
        descriptorSetElementProperties(descriptor, 0, "E_RETURN", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "E_Return", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "E_RETURN", 0, 0, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.EXPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"E_RETURN\"><ifr:descriptor><ifr:description language=\"en\">Single-character flag</ifr:description></ifr:descriptor><ifr:definition><ifr:scalarType name=\"CHAR1\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>out</ifr:direction><ifr:class>export</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 1, "T_TID", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "T_Tid", hmh.sap.rfc.util.Zvbeln_TidType_List.class, new hmh.sap.rfc.Zvbeln_TidType(), new java.lang.String[][]{}, "T_TID", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"T_TID\"><ifr:descriptor><ifr:description language=\"en\">463 - Structure for VBELN</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZVBELN_TID\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZVBELN_TID\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 2, "T_SUBS", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "T_Subs", hmh.sap.rfc.util.ZvsubscriptionType_List.class, new hmh.sap.rfc.ZvsubscriptionType(), new java.lang.String[][]{}, "T_SUBS", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"T_SUBS\"><ifr:descriptor><ifr:description language=\"en\">Subscription</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZVSUBSCRIPTION\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZVSUBSCRIPTION\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 3, "T_RETURN", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "T_Return", hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List.class, new hmh.sap.rfc.Zbdcmsgcoll_RfcType(), new java.lang.String[][]{}, "T_RETURN", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"T_RETURN\"><ifr:descriptor><ifr:description language=\"en\">Collecting messages in the SAP System</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZBDCMSGCOLL_RFC\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZBDCMSGCOLL_RFC\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 4, "T_BILLDOCHEAD", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "T_Billdochead", hmh.sap.rfc.util.Zvgetinvoice_HType_List.class, new hmh.sap.rfc.Zvgetinvoice_HType(), new java.lang.String[][]{}, "T_BILLDOCHEAD", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"T_BILLDOCHEAD\"><ifr:descriptor><ifr:description language=\"en\">Invoice - Header Info</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZVGETINVOICE_H\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZVGETINVOICE_H\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 5, "T_BILLDOCDETAIL", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "T_Billdocdetail", hmh.sap.rfc.util.Zvgetinvoice_LType_List.class, new hmh.sap.rfc.Zvgetinvoice_LType(), new java.lang.String[][]{}, "T_BILLDOCDETAIL", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"T_BILLDOCDETAIL\"><ifr:descriptor><ifr:description language=\"en\">Invoice - item details</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZVGETINVOICE_L\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZVGETINVOICE_L\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        staticDescriptor = descriptor;
    }
    protected  Z_Rfc_Get_Invoices_Output (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    public  Z_Rfc_Get_Invoices_Output () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public hmh.sap.rfc.Zvgetinvoice_HType[] getT_Billdochead() {
        hmh.sap.rfc.util.Zvgetinvoice_HType_List i$ = (hmh.sap.rfc.util.Zvgetinvoice_HType_List)baseTypeData().getElementValue(4);
        if ( i$ == null){return null;}
        return  i$.toArrayZvgetinvoice_HType();
    }

    
    public MetaData metadataZ_Rfc_Get_Invoices_Output() {
        return metadata;
    }

    
    public java.lang.String getE_Return() {
        return (java.lang.String)baseTypeData().getElementValueAsString(0);
    }

    
    public void setT_Subs(hmh.sap.rfc.util.ZvsubscriptionType_List T_Subs) {
        baseTypeData().setElementValue(2, T_Subs);
    }

    
    public void setT_Billdocdetail(hmh.sap.rfc.util.Zvgetinvoice_LType_List T_Billdocdetail) {
        baseTypeData().setElementValue(5, T_Billdocdetail);
    }

    
    public hmh.sap.rfc.Zbdcmsgcoll_RfcType[] getT_Return() {
        hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List i$ = (hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List)baseTypeData().getElementValue(3);
        if ( i$ == null){return null;}
        return  i$.toArrayZbdcmsgcoll_RfcType();
    }

    
    public hmh.sap.rfc.Zvbeln_TidType[] getT_Tid() {
        hmh.sap.rfc.util.Zvbeln_TidType_List i$ = (hmh.sap.rfc.util.Zvbeln_TidType_List)baseTypeData().getElementValue(1);
        if ( i$ == null){return null;}
        return  i$.toArrayZvbeln_TidType();
    }

    
    public hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List get_as_listT_Return() {
        return (hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List)baseTypeData().getElementValue(3);
    }

    
    public void setT_Billdochead(hmh.sap.rfc.Zvgetinvoice_HType[] T_Billdochead) {
        baseTypeData().setElementValue(4, new hmh.sap.rfc.util.Zvgetinvoice_HType_List());
        hmh.sap.rfc.util.Zvgetinvoice_HType_List list$ = get_as_listT_Billdochead();
        for (int  i$ = 0; i$ < T_Billdochead.length; i$++){
         list$.addZvgetinvoice_HType(T_Billdochead[ i$]);
        }
    }

    
    public hmh.sap.rfc.util.Zvgetinvoice_LType_List get_as_listT_Billdocdetail() {
        return (hmh.sap.rfc.util.Zvgetinvoice_LType_List)baseTypeData().getElementValue(5);
    }

    
    public hmh.sap.rfc.util.Zvgetinvoice_HType_List get_as_listT_Billdochead() {
        return (hmh.sap.rfc.util.Zvgetinvoice_HType_List)baseTypeData().getElementValue(4);
    }

    
    public hmh.sap.rfc.util.Zvbeln_TidType_List get_as_listT_Tid() {
        return (hmh.sap.rfc.util.Zvbeln_TidType_List)baseTypeData().getElementValue(1);
    }

    
    public void setE_Return(java.lang.String E_Return) {
        baseTypeData().setElementValue(0, E_Return);
    }

    
    public void setT_Tid(hmh.sap.rfc.util.Zvbeln_TidType_List T_Tid) {
        baseTypeData().setElementValue(1, T_Tid);
    }

    
    public void setT_Return(hmh.sap.rfc.Zbdcmsgcoll_RfcType[] T_Return) {
        baseTypeData().setElementValue(3, new hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List());
        hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List list$ = get_as_listT_Return();
        for (int  i$ = 0; i$ < T_Return.length; i$++){
         list$.addZbdcmsgcoll_RfcType(T_Return[ i$]);
        }
    }

    
    public void setT_Tid(hmh.sap.rfc.Zvbeln_TidType[] T_Tid) {
        baseTypeData().setElementValue(1, new hmh.sap.rfc.util.Zvbeln_TidType_List());
        hmh.sap.rfc.util.Zvbeln_TidType_List list$ = get_as_listT_Tid();
        for (int  i$ = 0; i$ < T_Tid.length; i$++){
         list$.addZvbeln_TidType(T_Tid[ i$]);
        }
    }

    
    public hmh.sap.rfc.util.ZvsubscriptionType_List get_as_listT_Subs() {
        return (hmh.sap.rfc.util.ZvsubscriptionType_List)baseTypeData().getElementValue(2);
    }

    
    public hmh.sap.rfc.Zvgetinvoice_LType[] getT_Billdocdetail() {
        hmh.sap.rfc.util.Zvgetinvoice_LType_List i$ = (hmh.sap.rfc.util.Zvgetinvoice_LType_List)baseTypeData().getElementValue(5);
        if ( i$ == null){return null;}
        return  i$.toArrayZvgetinvoice_LType();
    }

    
    public hmh.sap.rfc.ZvsubscriptionType[] getT_Subs() {
        hmh.sap.rfc.util.ZvsubscriptionType_List i$ = (hmh.sap.rfc.util.ZvsubscriptionType_List)baseTypeData().getElementValue(2);
        if ( i$ == null){return null;}
        return  i$.toArrayZvsubscriptionType();
    }

    
    public void setT_Billdochead(hmh.sap.rfc.util.Zvgetinvoice_HType_List T_Billdochead) {
        baseTypeData().setElementValue(4, T_Billdochead);
    }

    
    public void setT_Subs(hmh.sap.rfc.ZvsubscriptionType[] T_Subs) {
        baseTypeData().setElementValue(2, new hmh.sap.rfc.util.ZvsubscriptionType_List());
        hmh.sap.rfc.util.ZvsubscriptionType_List list$ = get_as_listT_Subs();
        for (int  i$ = 0; i$ < T_Subs.length; i$++){
         list$.addZvsubscriptionType(T_Subs[ i$]);
        }
    }

    
    public void setT_Billdocdetail(hmh.sap.rfc.Zvgetinvoice_LType[] T_Billdocdetail) {
        baseTypeData().setElementValue(5, new hmh.sap.rfc.util.Zvgetinvoice_LType_List());
        hmh.sap.rfc.util.Zvgetinvoice_LType_List list$ = get_as_listT_Billdocdetail();
        for (int  i$ = 0; i$ < T_Billdocdetail.length; i$++){
         list$.addZvgetinvoice_LType(T_Billdocdetail[ i$]);
        }
    }

    
    public void setT_Return(hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List T_Return) {
        baseTypeData().setElementValue(3, T_Return);
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  Z_Rfc_Get_Invoices_Output parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Z_Rfc_Get_Invoices_Output parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getT_Billdochead() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(4);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getE_Return() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getT_Billdocdetail() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(5);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getT_Subs() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getT_Return() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getT_Tid() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
    }

}
