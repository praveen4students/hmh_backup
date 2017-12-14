package hmh.sap.rfc;


public class Bapi_Materialgroup_Get_List_Input extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1335985769729L) ;

    private  Bapi_Materialgroup_Get_List_Input.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.WSDL_MESSAGE_FOR_JCO, "urn:sap-com:document:sap:rfc:functions", "BAPI_MATERIALGROUP_GET_LIST.Input", 7, 0, hmh.sap.rfc.Bapi_Materialgroup_Get_List_Input.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "BAPI_MATERIALGROUP_GET_LIST", 0, 0, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">BAPI Read Material Group(s)/Material Group Description(s)</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:package>WWGR</ifr:package><ifr:akhNode>I020004200</ifr:akhNode><ifr:released>internal</ifr:released><ifr:outbound>false</ifr:outbound><ifr:synchronous>true</ifr:synchronous><ifr:asynchronous>false</ifr:asynchronous><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2></ifr:properties><ifr:definition /></ifr:container>");
        descriptorSetElementProperties(descriptor, 0, "LANGUAGE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Language", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "LANGUAGE", 0, 0, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"LANGUAGE\"><ifr:descriptor><ifr:description language=\"en\">Language key</ifr:description></ifr:descriptor><ifr:definition><ifr:field name=\"BAPIWWG5_LANGUAGE.LANGU\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>0</ifr:offset1><ifr:offset2>0</ifr:offset2></ifr:properties></ifr:field><ifr:scalarType name=\"SPRAS\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>LANG</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength><ifr:conversionExit>ISOLA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 1, "LANGUAGEISO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Languageiso", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "LANGUAGEISO", 0, 0, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"LANGUAGEISO\"><ifr:descriptor><ifr:description language=\"en\">Language according to ISO 639</ifr:description></ifr:descriptor><ifr:definition><ifr:field name=\"BAPIWWG5_LANGUAGE.LANGU_ISO\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1</ifr:offset1><ifr:offset2>2</ifr:offset2></ifr:properties></ifr:field><ifr:scalarType name=\"LAISO\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 2, "SHORTDESCRIPTIONFLAG", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 1, 1, false, null, "Shortdescriptionflag", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "SHORTDESCRIPTIONFLAG", 0, 0, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"SHORTDESCRIPTIONFLAG\"><ifr:descriptor><ifr:description language=\"en\">Indicator for Requesting Material Group Descriptions</ifr:description></ifr:descriptor><ifr:definition><ifr:field name=\"BAPIWWG5_MG_DESCR_SHORT.FLAG\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>0</ifr:offset1><ifr:offset2>0</ifr:offset2></ifr:properties></ifr:field><ifr:scalarType name=\"WGBEZ_FLAG\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 3, "SHORTDESCRIPTIONS", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Shortdescriptions", hmh.sap.rfc.util.Bapiwwg5_Matl_Groups_And_DescrType_List.class, new hmh.sap.rfc.Bapiwwg5_Matl_Groups_And_DescrType(), new java.lang.String[][]{}, "SHORTDESCRIPTIONS", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"SHORTDESCRIPTIONS\"><ifr:descriptor><ifr:description language=\"en\">BAPI Output Table - Material Group Descriptions</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"BAPIWWG5_MATL_GROUPS_AND_DESCR\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPIWWG5_MATL_GROUPS_AND_DESCR\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 4, "RETURN", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Return", hmh.sap.rfc.util.Bapiret2Type_List.class, new hmh.sap.rfc.Bapiret2Type(), new java.lang.String[][]{}, "RETURN", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"RETURN\"><ifr:descriptor><ifr:description language=\"en\">Return Parameters (Event/Error Log)</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"BAPIRET2\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPIRET2\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 5, "MATERIALGROUPS", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Materialgroups", hmh.sap.rfc.util.Bapiwwg5_Material_GroupType_List.class, new hmh.sap.rfc.Bapiwwg5_Material_GroupType(), new java.lang.String[][]{}, "MATERIALGROUPS", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"MATERIALGROUPS\"><ifr:descriptor><ifr:description language=\"en\">BAPI Output Table Material Groups</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"BAPIWWG5_MATERIAL_GROUP\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPIWWG5_MATERIAL_GROUP\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 6, "MATERIALGROUPRANGE", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Materialgrouprange", hmh.sap.rfc.util.Bapiwwg5_Material_Group_RangeType_List.class, new hmh.sap.rfc.Bapiwwg5_Material_Group_RangeType(), new java.lang.String[][]{}, "MATERIALGROUPRANGE", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"MATERIALGROUPRANGE\"><ifr:descriptor><ifr:description language=\"en\">BAPI Range Table Material Groups</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"BAPIWWG5_MATERIAL_GROUP_RANGE\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPIWWG5_MATERIAL_GROUP_RANGE\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        staticDescriptor = descriptor;
    }
    public  Bapi_Materialgroup_Get_List_Input () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    protected  Bapi_Materialgroup_Get_List_Input (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    
    public void setMaterialgroups(hmh.sap.rfc.Bapiwwg5_Material_GroupType[] Materialgroups) {
        baseTypeData().setElementValue(5, new hmh.sap.rfc.util.Bapiwwg5_Material_GroupType_List());
        hmh.sap.rfc.util.Bapiwwg5_Material_GroupType_List list$ = get_as_listMaterialgroups();
        for (int  i$ = 0; i$ < Materialgroups.length; i$++){
         list$.addBapiwwg5_Material_GroupType(Materialgroups[ i$]);
        }
    }

    
    public hmh.sap.rfc.Bapiwwg5_Material_GroupType[] getMaterialgroups() {
        hmh.sap.rfc.util.Bapiwwg5_Material_GroupType_List i$ = (hmh.sap.rfc.util.Bapiwwg5_Material_GroupType_List)baseTypeData().getElementValue(5);
        if ( i$ == null){return null;}
        return  i$.toArrayBapiwwg5_Material_GroupType();
    }

    
    public java.lang.String getLanguage() {
        return (java.lang.String)baseTypeData().getElementValueAsString(0);
    }

    
    public hmh.sap.rfc.util.Bapiret2Type_List get_as_listReturn() {
        return (hmh.sap.rfc.util.Bapiret2Type_List)baseTypeData().getElementValue(4);
    }

    
    public void setMaterialgrouprange(hmh.sap.rfc.util.Bapiwwg5_Material_Group_RangeType_List Materialgrouprange) {
        baseTypeData().setElementValue(6, Materialgrouprange);
    }

    
    public hmh.sap.rfc.util.Bapiwwg5_Material_Group_RangeType_List get_as_listMaterialgrouprange() {
        return (hmh.sap.rfc.util.Bapiwwg5_Material_Group_RangeType_List)baseTypeData().getElementValue(6);
    }

    
    public void setShortdescriptionflag(java.lang.String Shortdescriptionflag) {
        baseTypeData().setElementValue(2, Shortdescriptionflag);
    }

    
    public void setMaterialgroups(hmh.sap.rfc.util.Bapiwwg5_Material_GroupType_List Materialgroups) {
        baseTypeData().setElementValue(5, Materialgroups);
    }

    
    public hmh.sap.rfc.Bapiwwg5_Material_Group_RangeType[] getMaterialgrouprange() {
        hmh.sap.rfc.util.Bapiwwg5_Material_Group_RangeType_List i$ = (hmh.sap.rfc.util.Bapiwwg5_Material_Group_RangeType_List)baseTypeData().getElementValue(6);
        if ( i$ == null){return null;}
        return  i$.toArrayBapiwwg5_Material_Group_RangeType();
    }

    
    public java.lang.String getLanguageiso() {
        return (java.lang.String)baseTypeData().getElementValueAsString(1);
    }

    
    public hmh.sap.rfc.Bapiret2Type[] getReturn() {
        hmh.sap.rfc.util.Bapiret2Type_List i$ = (hmh.sap.rfc.util.Bapiret2Type_List)baseTypeData().getElementValue(4);
        if ( i$ == null){return null;}
        return  i$.toArrayBapiret2Type();
    }

    
    public java.lang.String getShortdescriptionflag() {
        return (java.lang.String)baseTypeData().getElementValueAsString(2);
    }

    
    public MetaData metadataBapi_Materialgroup_Get_List_Input() {
        return metadata;
    }

    
    public void setMaterialgrouprange(hmh.sap.rfc.Bapiwwg5_Material_Group_RangeType[] Materialgrouprange) {
        baseTypeData().setElementValue(6, new hmh.sap.rfc.util.Bapiwwg5_Material_Group_RangeType_List());
        hmh.sap.rfc.util.Bapiwwg5_Material_Group_RangeType_List list$ = get_as_listMaterialgrouprange();
        for (int  i$ = 0; i$ < Materialgrouprange.length; i$++){
         list$.addBapiwwg5_Material_Group_RangeType(Materialgrouprange[ i$]);
        }
    }

    
    public hmh.sap.rfc.Bapiwwg5_Matl_Groups_And_DescrType[] getShortdescriptions() {
        hmh.sap.rfc.util.Bapiwwg5_Matl_Groups_And_DescrType_List i$ = (hmh.sap.rfc.util.Bapiwwg5_Matl_Groups_And_DescrType_List)baseTypeData().getElementValue(3);
        if ( i$ == null){return null;}
        return  i$.toArrayBapiwwg5_Matl_Groups_And_DescrType();
    }

    
    public hmh.sap.rfc.util.Bapiwwg5_Matl_Groups_And_DescrType_List get_as_listShortdescriptions() {
        return (hmh.sap.rfc.util.Bapiwwg5_Matl_Groups_And_DescrType_List)baseTypeData().getElementValue(3);
    }

    
    public void setReturn(hmh.sap.rfc.Bapiret2Type[] Return) {
        baseTypeData().setElementValue(4, new hmh.sap.rfc.util.Bapiret2Type_List());
        hmh.sap.rfc.util.Bapiret2Type_List list$ = get_as_listReturn();
        for (int  i$ = 0; i$ < Return.length; i$++){
         list$.addBapiret2Type(Return[ i$]);
        }
    }

    
    public void setLanguageiso(java.lang.String Languageiso) {
        baseTypeData().setElementValue(1, Languageiso);
    }

    
    public void setShortdescriptions(hmh.sap.rfc.util.Bapiwwg5_Matl_Groups_And_DescrType_List Shortdescriptions) {
        baseTypeData().setElementValue(3, Shortdescriptions);
    }

    
    public void setReturn(hmh.sap.rfc.util.Bapiret2Type_List Return) {
        baseTypeData().setElementValue(4, Return);
    }

    
    public void setLanguage(java.lang.String Language) {
        baseTypeData().setElementValue(0, Language);
    }

    
    public void setShortdescriptions(hmh.sap.rfc.Bapiwwg5_Matl_Groups_And_DescrType[] Shortdescriptions) {
        baseTypeData().setElementValue(3, new hmh.sap.rfc.util.Bapiwwg5_Matl_Groups_And_DescrType_List());
        hmh.sap.rfc.util.Bapiwwg5_Matl_Groups_And_DescrType_List list$ = get_as_listShortdescriptions();
        for (int  i$ = 0; i$ < Shortdescriptions.length; i$++){
         list$.addBapiwwg5_Matl_Groups_And_DescrType(Shortdescriptions[ i$]);
        }
    }

    
    public hmh.sap.rfc.util.Bapiwwg5_Material_GroupType_List get_as_listMaterialgroups() {
        return (hmh.sap.rfc.util.Bapiwwg5_Material_GroupType_List)baseTypeData().getElementValue(5);
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  Bapi_Materialgroup_Get_List_Input parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Bapi_Materialgroup_Get_List_Input parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getReturn() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(4);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMaterialgroups() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(5);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getShortdescriptionflag() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getLanguage() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getShortdescriptions() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMaterialgrouprange() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(6);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getLanguageiso() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
    }

}
