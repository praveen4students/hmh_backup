package hmh.sap.rfc;


public class Bapi_Materialgroup_Get_List_Output extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1335985769731L) ;

    private  Bapi_Materialgroup_Get_List_Output.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.WSDL_MESSAGE_FOR_JCO, "urn:sap-com:document:sap:rfc:functions", "BAPI_MATERIALGROUP_GET_LIST.Output", 4, 0, hmh.sap.rfc.Bapi_Materialgroup_Get_List_Output.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "BAPI_MATERIALGROUP_GET_LIST", 0, 0, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">BAPI Read Material Group(s)/Material Group Description(s)</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:package>WWGR</ifr:package><ifr:akhNode>I020004200</ifr:akhNode><ifr:released>internal</ifr:released><ifr:outbound>false</ifr:outbound><ifr:synchronous>true</ifr:synchronous><ifr:asynchronous>false</ifr:asynchronous><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2></ifr:properties><ifr:definition /></ifr:container>");
        descriptorSetElementProperties(descriptor, 0, "SHORTDESCRIPTIONS", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Shortdescriptions", hmh.sap.rfc.util.Bapiwwg5_Matl_Groups_And_DescrType_List.class, new hmh.sap.rfc.Bapiwwg5_Matl_Groups_And_DescrType(), new java.lang.String[][]{}, "SHORTDESCRIPTIONS", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"SHORTDESCRIPTIONS\"><ifr:descriptor><ifr:description language=\"en\">BAPI Output Table - Material Group Descriptions</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"BAPIWWG5_MATL_GROUPS_AND_DESCR\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPIWWG5_MATL_GROUPS_AND_DESCR\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 1, "RETURN", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Return", hmh.sap.rfc.util.Bapiret2Type_List.class, new hmh.sap.rfc.Bapiret2Type(), new java.lang.String[][]{}, "RETURN", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"RETURN\"><ifr:descriptor><ifr:description language=\"en\">Return Parameters (Event/Error Log)</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"BAPIRET2\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPIRET2\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 2, "MATERIALGROUPS", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Materialgroups", hmh.sap.rfc.util.Bapiwwg5_Material_GroupType_List.class, new hmh.sap.rfc.Bapiwwg5_Material_GroupType(), new java.lang.String[][]{}, "MATERIALGROUPS", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"MATERIALGROUPS\"><ifr:descriptor><ifr:description language=\"en\">BAPI Output Table Material Groups</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"BAPIWWG5_MATERIAL_GROUP\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPIWWG5_MATERIAL_GROUP\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 3, "MATERIALGROUPRANGE", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Materialgrouprange", hmh.sap.rfc.util.Bapiwwg5_Material_Group_RangeType_List.class, new hmh.sap.rfc.Bapiwwg5_Material_Group_RangeType(), new java.lang.String[][]{}, "MATERIALGROUPRANGE", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"MATERIALGROUPRANGE\"><ifr:descriptor><ifr:description language=\"en\">BAPI Range Table Material Groups</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"BAPIWWG5_MATERIAL_GROUP_RANGE\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPIWWG5_MATERIAL_GROUP_RANGE\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        staticDescriptor = descriptor;
    }
    protected  Bapi_Materialgroup_Get_List_Output (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    public  Bapi_Materialgroup_Get_List_Output () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public void setMaterialgroups(hmh.sap.rfc.Bapiwwg5_Material_GroupType[] Materialgroups) {
        baseTypeData().setElementValue(2, new hmh.sap.rfc.util.Bapiwwg5_Material_GroupType_List());
        hmh.sap.rfc.util.Bapiwwg5_Material_GroupType_List list$ = get_as_listMaterialgroups();
        for (int  i$ = 0; i$ < Materialgroups.length; i$++){
         list$.addBapiwwg5_Material_GroupType(Materialgroups[ i$]);
        }
    }

    
    public hmh.sap.rfc.Bapiwwg5_Material_GroupType[] getMaterialgroups() {
        hmh.sap.rfc.util.Bapiwwg5_Material_GroupType_List i$ = (hmh.sap.rfc.util.Bapiwwg5_Material_GroupType_List)baseTypeData().getElementValue(2);
        if ( i$ == null){return null;}
        return  i$.toArrayBapiwwg5_Material_GroupType();
    }

    
    public hmh.sap.rfc.util.Bapiret2Type_List get_as_listReturn() {
        return (hmh.sap.rfc.util.Bapiret2Type_List)baseTypeData().getElementValue(1);
    }

    
    public void setMaterialgrouprange(hmh.sap.rfc.util.Bapiwwg5_Material_Group_RangeType_List Materialgrouprange) {
        baseTypeData().setElementValue(3, Materialgrouprange);
    }

    
    public hmh.sap.rfc.util.Bapiwwg5_Material_Group_RangeType_List get_as_listMaterialgrouprange() {
        return (hmh.sap.rfc.util.Bapiwwg5_Material_Group_RangeType_List)baseTypeData().getElementValue(3);
    }

    
    public void setMaterialgroups(hmh.sap.rfc.util.Bapiwwg5_Material_GroupType_List Materialgroups) {
        baseTypeData().setElementValue(2, Materialgroups);
    }

    
    public hmh.sap.rfc.Bapiwwg5_Material_Group_RangeType[] getMaterialgrouprange() {
        hmh.sap.rfc.util.Bapiwwg5_Material_Group_RangeType_List i$ = (hmh.sap.rfc.util.Bapiwwg5_Material_Group_RangeType_List)baseTypeData().getElementValue(3);
        if ( i$ == null){return null;}
        return  i$.toArrayBapiwwg5_Material_Group_RangeType();
    }

    
    public hmh.sap.rfc.Bapiret2Type[] getReturn() {
        hmh.sap.rfc.util.Bapiret2Type_List i$ = (hmh.sap.rfc.util.Bapiret2Type_List)baseTypeData().getElementValue(1);
        if ( i$ == null){return null;}
        return  i$.toArrayBapiret2Type();
    }

    
    public MetaData metadataBapi_Materialgroup_Get_List_Output() {
        return metadata;
    }

    
    public void setMaterialgrouprange(hmh.sap.rfc.Bapiwwg5_Material_Group_RangeType[] Materialgrouprange) {
        baseTypeData().setElementValue(3, new hmh.sap.rfc.util.Bapiwwg5_Material_Group_RangeType_List());
        hmh.sap.rfc.util.Bapiwwg5_Material_Group_RangeType_List list$ = get_as_listMaterialgrouprange();
        for (int  i$ = 0; i$ < Materialgrouprange.length; i$++){
         list$.addBapiwwg5_Material_Group_RangeType(Materialgrouprange[ i$]);
        }
    }

    
    public hmh.sap.rfc.Bapiwwg5_Matl_Groups_And_DescrType[] getShortdescriptions() {
        hmh.sap.rfc.util.Bapiwwg5_Matl_Groups_And_DescrType_List i$ = (hmh.sap.rfc.util.Bapiwwg5_Matl_Groups_And_DescrType_List)baseTypeData().getElementValue(0);
        if ( i$ == null){return null;}
        return  i$.toArrayBapiwwg5_Matl_Groups_And_DescrType();
    }

    
    public hmh.sap.rfc.util.Bapiwwg5_Matl_Groups_And_DescrType_List get_as_listShortdescriptions() {
        return (hmh.sap.rfc.util.Bapiwwg5_Matl_Groups_And_DescrType_List)baseTypeData().getElementValue(0);
    }

    
    public void setShortdescriptions(hmh.sap.rfc.util.Bapiwwg5_Matl_Groups_And_DescrType_List Shortdescriptions) {
        baseTypeData().setElementValue(0, Shortdescriptions);
    }

    
    public void setReturn(hmh.sap.rfc.util.Bapiret2Type_List Return) {
        baseTypeData().setElementValue(1, Return);
    }

    
    public void setReturn(hmh.sap.rfc.Bapiret2Type[] Return) {
        baseTypeData().setElementValue(1, new hmh.sap.rfc.util.Bapiret2Type_List());
        hmh.sap.rfc.util.Bapiret2Type_List list$ = get_as_listReturn();
        for (int  i$ = 0; i$ < Return.length; i$++){
         list$.addBapiret2Type(Return[ i$]);
        }
    }

    
    public void setShortdescriptions(hmh.sap.rfc.Bapiwwg5_Matl_Groups_And_DescrType[] Shortdescriptions) {
        baseTypeData().setElementValue(0, new hmh.sap.rfc.util.Bapiwwg5_Matl_Groups_And_DescrType_List());
        hmh.sap.rfc.util.Bapiwwg5_Matl_Groups_And_DescrType_List list$ = get_as_listShortdescriptions();
        for (int  i$ = 0; i$ < Shortdescriptions.length; i$++){
         list$.addBapiwwg5_Matl_Groups_And_DescrType(Shortdescriptions[ i$]);
        }
    }

    
    public hmh.sap.rfc.util.Bapiwwg5_Material_GroupType_List get_as_listMaterialgroups() {
        return (hmh.sap.rfc.util.Bapiwwg5_Material_GroupType_List)baseTypeData().getElementValue(2);
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  Bapi_Materialgroup_Get_List_Output parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Bapi_Materialgroup_Get_List_Output parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getReturn() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMaterialgroups() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getShortdescriptions() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMaterialgrouprange() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
    }

}
