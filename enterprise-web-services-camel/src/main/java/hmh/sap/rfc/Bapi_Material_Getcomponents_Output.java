package hmh.sap.rfc;


public class Bapi_Material_Getcomponents_Output extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1335985881491L) ;

    private  Bapi_Material_Getcomponents_Output.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.WSDL_MESSAGE_FOR_JCO, "urn:sap-com:document:sap:rfc:functions", "BAPI_MATERIAL_GETCOMPONENTS.Output", 2, 0, hmh.sap.rfc.Bapi_Material_Getcomponents_Output.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "BAPI_MATERIAL_GETCOMPONENTS", 0, 0, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Break down structured materials</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:package>WSTR</ifr:package><ifr:akhNode>HLA0006031</ifr:akhNode><ifr:released>external</ifr:released><ifr:outbound>false</ifr:outbound><ifr:synchronous>true</ifr:synchronous><ifr:asynchronous>false</ifr:asynchronous><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2></ifr:properties><ifr:definition /></ifr:container>");
        descriptorSetElementProperties(descriptor, 0, "RETURN", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:BAPIRETURN1", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Return", hmh.sap.rfc.Bapireturn1Type.class, new hmh.sap.rfc.Bapireturn1Type(), new java.lang.String[][]{}, "RETURN", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, com.sap.mw.jco.JCO.EXPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"RETURN\"><ifr:descriptor><ifr:description language=\"en\">Return value</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"BAPIRETURN1\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPIRETURN1\" /></ifr:definition><ifr:properties><ifr:direction>out</ifr:direction><ifr:class>export</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 1, "COMP_ITEMS", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Comp_Items", hmh.sap.rfc.util.BapicompType_List.class, new hmh.sap.rfc.BapicompType(), new java.lang.String[][]{}, "COMP_ITEMS", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"COMP_ITEMS\"><ifr:descriptor><ifr:description language=\"en\">Return table</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"BAPICOMP\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPICOMP\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        staticDescriptor = descriptor;
    }
    protected  Bapi_Material_Getcomponents_Output (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    public  Bapi_Material_Getcomponents_Output () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public hmh.sap.rfc.Bapireturn1Type getReturn() {
        return (hmh.sap.rfc.Bapireturn1Type)baseTypeData().getElementValue(0);
    }

    
    public hmh.sap.rfc.util.BapicompType_List get_as_listComp_Items() {
        return (hmh.sap.rfc.util.BapicompType_List)baseTypeData().getElementValue(1);
    }

    
    public void setComp_Items(hmh.sap.rfc.util.BapicompType_List Comp_Items) {
        baseTypeData().setElementValue(1, Comp_Items);
    }

    
    public MetaData metadataBapi_Material_Getcomponents_Output() {
        return metadata;
    }

    
    public hmh.sap.rfc.BapicompType[] getComp_Items() {
        hmh.sap.rfc.util.BapicompType_List i$ = (hmh.sap.rfc.util.BapicompType_List)baseTypeData().getElementValue(1);
        if ( i$ == null){return null;}
        return  i$.toArrayBapicompType();
    }

    
    public void setComp_Items(hmh.sap.rfc.BapicompType[] Comp_Items) {
        baseTypeData().setElementValue(1, new hmh.sap.rfc.util.BapicompType_List());
        hmh.sap.rfc.util.BapicompType_List list$ = get_as_listComp_Items();
        for (int  i$ = 0; i$ < Comp_Items.length; i$++){
         list$.addBapicompType(Comp_Items[ i$]);
        }
    }

    
    public void setReturn(hmh.sap.rfc.Bapireturn1Type Return) {
        baseTypeData().setElementValue(0, Return);
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  Bapi_Material_Getcomponents_Output parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Bapi_Material_Getcomponents_Output parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getReturn() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getComp_Items() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
    }

}
