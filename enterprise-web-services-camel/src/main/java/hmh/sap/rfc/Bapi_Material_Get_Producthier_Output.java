package hmh.sap.rfc;


public class Bapi_Material_Get_Producthier_Output extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1335985974368L) ;

    private  Bapi_Material_Get_Producthier_Output.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.WSDL_MESSAGE_FOR_JCO, "urn:sap-com:document:sap:rfc:functions", "BAPI_MATERIAL_GET_PRODUCTHIER.Output", 3, 0, hmh.sap.rfc.Bapi_Material_Get_Producthier_Output.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "BAPI_MATERIAL_GET_PRODUCTHIER", 0, 0, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">BAPI Material Get Product Hierarchy ()</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:package>VS0C</ifr:package><ifr:akhNode>HLA0006859</ifr:akhNode><ifr:released>external</ifr:released><ifr:outbound>false</ifr:outbound><ifr:synchronous>true</ifr:synchronous><ifr:asynchronous>false</ifr:asynchronous><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2></ifr:properties><ifr:definition /></ifr:container>");
        descriptorSetElementProperties(descriptor, 0, "RETURN", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:BAPIRET2", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Return", hmh.sap.rfc.Bapiret2Type.class, new hmh.sap.rfc.Bapiret2Type(), new java.lang.String[][]{}, "RETURN", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, com.sap.mw.jco.JCO.EXPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"RETURN\"><ifr:descriptor><ifr:description language=\"en\">Return Code</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"BAPIRET2\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPIRET2\" /></ifr:definition><ifr:properties><ifr:direction>out</ifr:direction><ifr:class>export</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 1, "NODE_REFERENCE_LIST", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Node_Reference_List", hmh.sap.rfc.util.Bapimat_ProdhrType_List.class, new hmh.sap.rfc.Bapimat_ProdhrType(), new java.lang.String[][]{}, "NODE_REFERENCE_LIST", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"NODE_REFERENCE_LIST\"><ifr:descriptor><ifr:description language=\"en\">Nodes with Reference to Material Master Records</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"BAPIMAT_PRODHR\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPIMAT_PRODHR\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 2, "NODE_LIST", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Node_List", hmh.sap.rfc.util.Bapimat_ProdhType_List.class, new hmh.sap.rfc.Bapimat_ProdhType(), new java.lang.String[][]{}, "NODE_LIST", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"NODE_LIST\"><ifr:descriptor><ifr:description language=\"en\">Product Hierarchy Nodes</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"BAPIMAT_PRODH\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPIMAT_PRODH\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        staticDescriptor = descriptor;
    }
    public  Bapi_Material_Get_Producthier_Output () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    protected  Bapi_Material_Get_Producthier_Output (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    
    public hmh.sap.rfc.Bapiret2Type getReturn() {
        return (hmh.sap.rfc.Bapiret2Type)baseTypeData().getElementValue(0);
    }

    
    public MetaData metadataBapi_Material_Get_Producthier_Output() {
        return metadata;
    }

    
    public void setNode_Reference_List(hmh.sap.rfc.Bapimat_ProdhrType[] Node_Reference_List) {
        baseTypeData().setElementValue(1, new hmh.sap.rfc.util.Bapimat_ProdhrType_List());
        hmh.sap.rfc.util.Bapimat_ProdhrType_List list$ = get_as_listNode_Reference_List();
        for (int  i$ = 0; i$ < Node_Reference_List.length; i$++){
         list$.addBapimat_ProdhrType(Node_Reference_List[ i$]);
        }
    }

    
    public hmh.sap.rfc.util.Bapimat_ProdhType_List get_as_listNode_List() {
        return (hmh.sap.rfc.util.Bapimat_ProdhType_List)baseTypeData().getElementValue(2);
    }

    
    public hmh.sap.rfc.Bapimat_ProdhrType[] getNode_Reference_List() {
        hmh.sap.rfc.util.Bapimat_ProdhrType_List i$ = (hmh.sap.rfc.util.Bapimat_ProdhrType_List)baseTypeData().getElementValue(1);
        if ( i$ == null){return null;}
        return  i$.toArrayBapimat_ProdhrType();
    }

    
    public hmh.sap.rfc.util.Bapimat_ProdhrType_List get_as_listNode_Reference_List() {
        return (hmh.sap.rfc.util.Bapimat_ProdhrType_List)baseTypeData().getElementValue(1);
    }

    
    public void setNode_List(hmh.sap.rfc.util.Bapimat_ProdhType_List Node_List) {
        baseTypeData().setElementValue(2, Node_List);
    }

    
    public void setNode_List(hmh.sap.rfc.Bapimat_ProdhType[] Node_List) {
        baseTypeData().setElementValue(2, new hmh.sap.rfc.util.Bapimat_ProdhType_List());
        hmh.sap.rfc.util.Bapimat_ProdhType_List list$ = get_as_listNode_List();
        for (int  i$ = 0; i$ < Node_List.length; i$++){
         list$.addBapimat_ProdhType(Node_List[ i$]);
        }
    }

    
    public hmh.sap.rfc.Bapimat_ProdhType[] getNode_List() {
        hmh.sap.rfc.util.Bapimat_ProdhType_List i$ = (hmh.sap.rfc.util.Bapimat_ProdhType_List)baseTypeData().getElementValue(2);
        if ( i$ == null){return null;}
        return  i$.toArrayBapimat_ProdhType();
    }

    
    public void setReturn(hmh.sap.rfc.Bapiret2Type Return) {
        baseTypeData().setElementValue(0, Return);
    }

    
    public void setNode_Reference_List(hmh.sap.rfc.util.Bapimat_ProdhrType_List Node_Reference_List) {
        baseTypeData().setElementValue(1, Node_Reference_List);
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  Bapi_Material_Get_Producthier_Output parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Bapi_Material_Get_Producthier_Output parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getReturn() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getNode_Reference_List() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getNode_List() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
    }

}
