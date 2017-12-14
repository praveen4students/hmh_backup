package hmh.sap.rfc;


public class Z_Rfc_Get_Material_Substitute_Input extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1329337306542L) ;

    private  Z_Rfc_Get_Material_Substitute_Input.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.WSDL_MESSAGE_FOR_JCO, "urn:sap-com:document:sap:rfc:functions", "Z_RFC_GET_MATERIAL_SUBSTITUTE.Input", 4, 0, hmh.sap.rfc.Z_Rfc_Get_Material_Substitute_Input.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "Z_RFC_GET_MATERIAL_SUBSTITUTE", 0, 0, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">To get the material details</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:package>ZVBD</ifr:package><ifr:akhNode>HLA0009600</ifr:akhNode><ifr:released>no</ifr:released><ifr:outbound>false</ifr:outbound><ifr:synchronous>true</ifr:synchronous><ifr:asynchronous>false</ifr:asynchronous><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2></ifr:properties><ifr:definition /></ifr:container>");
        descriptorSetElementProperties(descriptor, 0, "I_MATERIAL_SUBSTITUTE", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "I_Material_Substitute", hmh.sap.rfc.util.Zmatnr_SubstituteType_List.class, new hmh.sap.rfc.Zmatnr_SubstituteType(), new java.lang.String[][]{}, "I_MATERIAL_SUBSTITUTE", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"I_MATERIAL_SUBSTITUTE\"><ifr:descriptor><ifr:description language=\"en\">Details of substituted material</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZMATNR_SUBSTITUTE\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZMATNR_SUBSTITUTE\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 1, "I_MATERIAL_NUMBER", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "I_Material_Number", hmh.sap.rfc.util.ZmatnrType_List.class, new hmh.sap.rfc.ZmatnrType(), new java.lang.String[][]{}, "I_MATERIAL_NUMBER", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"I_MATERIAL_NUMBER\"><ifr:descriptor><ifr:description language=\"en\">Table Type for Materials</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZMATNR\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZMATNR\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 2, "I_ISBN", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "I_Isbn", hmh.sap.rfc.util.Zident_CodeType_List.class, new hmh.sap.rfc.Zident_CodeType(), new java.lang.String[][]{}, "I_ISBN", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"I_ISBN\"><ifr:descriptor><ifr:description language=\"en\">Table Type for ISMIDENTCODE</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZIDENT_CODE\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZIDENT_CODE\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 3, "I_ERROR_MSGS", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "I_Error_Msgs", hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List.class, new hmh.sap.rfc.Zbdcmsgcoll_RfcType(), new java.lang.String[][]{}, "I_ERROR_MSGS", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"I_ERROR_MSGS\"><ifr:descriptor><ifr:description language=\"en\">Message Table in Transaction</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZBDCMSGCOLL_RFC\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZBDCMSGCOLL_RFC\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        staticDescriptor = descriptor;
    }
    public  Z_Rfc_Get_Material_Substitute_Input () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    protected  Z_Rfc_Get_Material_Substitute_Input (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    
    public MetaData metadataZ_Rfc_Get_Material_Substitute_Input() {
        return metadata;
    }

    
    public hmh.sap.rfc.util.ZmatnrType_List get_as_listI_Material_Number() {
        return (hmh.sap.rfc.util.ZmatnrType_List)baseTypeData().getElementValue(1);
    }

    
    public hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List get_as_listI_Error_Msgs() {
        return (hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List)baseTypeData().getElementValue(3);
    }

    
    public void setI_Material_Substitute(hmh.sap.rfc.Zmatnr_SubstituteType[] I_Material_Substitute) {
        baseTypeData().setElementValue(0, new hmh.sap.rfc.util.Zmatnr_SubstituteType_List());
        hmh.sap.rfc.util.Zmatnr_SubstituteType_List list$ = get_as_listI_Material_Substitute();
        for (int  i$ = 0; i$ < I_Material_Substitute.length; i$++){
         list$.addZmatnr_SubstituteType(I_Material_Substitute[ i$]);
        }
    }

    
    public void setI_Isbn(hmh.sap.rfc.Zident_CodeType[] I_Isbn) {
        baseTypeData().setElementValue(2, new hmh.sap.rfc.util.Zident_CodeType_List());
        hmh.sap.rfc.util.Zident_CodeType_List list$ = get_as_listI_Isbn();
        for (int  i$ = 0; i$ < I_Isbn.length; i$++){
         list$.addZident_CodeType(I_Isbn[ i$]);
        }
    }

    
    public void setI_Material_Number(hmh.sap.rfc.util.ZmatnrType_List I_Material_Number) {
        baseTypeData().setElementValue(1, I_Material_Number);
    }

    
    public void setI_Material_Substitute(hmh.sap.rfc.util.Zmatnr_SubstituteType_List I_Material_Substitute) {
        baseTypeData().setElementValue(0, I_Material_Substitute);
    }

    
    public hmh.sap.rfc.Zbdcmsgcoll_RfcType[] getI_Error_Msgs() {
        hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List i$ = (hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List)baseTypeData().getElementValue(3);
        if ( i$ == null){return null;}
        return  i$.toArrayZbdcmsgcoll_RfcType();
    }

    
    public hmh.sap.rfc.ZmatnrType[] getI_Material_Number() {
        hmh.sap.rfc.util.ZmatnrType_List i$ = (hmh.sap.rfc.util.ZmatnrType_List)baseTypeData().getElementValue(1);
        if ( i$ == null){return null;}
        return  i$.toArrayZmatnrType();
    }

    
    public hmh.sap.rfc.util.Zmatnr_SubstituteType_List get_as_listI_Material_Substitute() {
        return (hmh.sap.rfc.util.Zmatnr_SubstituteType_List)baseTypeData().getElementValue(0);
    }

    
    public hmh.sap.rfc.util.Zident_CodeType_List get_as_listI_Isbn() {
        return (hmh.sap.rfc.util.Zident_CodeType_List)baseTypeData().getElementValue(2);
    }

    
    public hmh.sap.rfc.Zmatnr_SubstituteType[] getI_Material_Substitute() {
        hmh.sap.rfc.util.Zmatnr_SubstituteType_List i$ = (hmh.sap.rfc.util.Zmatnr_SubstituteType_List)baseTypeData().getElementValue(0);
        if ( i$ == null){return null;}
        return  i$.toArrayZmatnr_SubstituteType();
    }

    
    public void setI_Error_Msgs(hmh.sap.rfc.Zbdcmsgcoll_RfcType[] I_Error_Msgs) {
        baseTypeData().setElementValue(3, new hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List());
        hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List list$ = get_as_listI_Error_Msgs();
        for (int  i$ = 0; i$ < I_Error_Msgs.length; i$++){
         list$.addZbdcmsgcoll_RfcType(I_Error_Msgs[ i$]);
        }
    }

    
    public void setI_Isbn(hmh.sap.rfc.util.Zident_CodeType_List I_Isbn) {
        baseTypeData().setElementValue(2, I_Isbn);
    }

    
    public void setI_Error_Msgs(hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List I_Error_Msgs) {
        baseTypeData().setElementValue(3, I_Error_Msgs);
    }

    
    public void setI_Material_Number(hmh.sap.rfc.ZmatnrType[] I_Material_Number) {
        baseTypeData().setElementValue(1, new hmh.sap.rfc.util.ZmatnrType_List());
        hmh.sap.rfc.util.ZmatnrType_List list$ = get_as_listI_Material_Number();
        for (int  i$ = 0; i$ < I_Material_Number.length; i$++){
         list$.addZmatnrType(I_Material_Number[ i$]);
        }
    }

    
    public hmh.sap.rfc.Zident_CodeType[] getI_Isbn() {
        hmh.sap.rfc.util.Zident_CodeType_List i$ = (hmh.sap.rfc.util.Zident_CodeType_List)baseTypeData().getElementValue(2);
        if ( i$ == null){return null;}
        return  i$.toArrayZident_CodeType();
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  Z_Rfc_Get_Material_Substitute_Input parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Z_Rfc_Get_Material_Substitute_Input parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getI_Material_Substitute() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getI_Error_Msgs() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getI_Material_Number() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getI_Isbn() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
    }

}
