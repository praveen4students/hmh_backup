package hmh.sap.rfc;


public class Bapi_Material_Getlist_Output extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1335985573954L) ;

    private  Bapi_Material_Getlist_Output.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.WSDL_MESSAGE_FOR_JCO, "urn:sap-com:document:sap:rfc:functions", "BAPI_MATERIAL_GETLIST.Output", 9, 0, hmh.sap.rfc.Bapi_Material_Getlist_Output.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "BAPI_MATERIAL_GETLIST", 0, 0, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Supply List of Materials for Search Criteria Transferred</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:package>MGA</ifr:package><ifr:akhNode>HLA0006031</ifr:akhNode><ifr:released>external</ifr:released><ifr:outbound>false</ifr:outbound><ifr:synchronous>true</ifr:synchronous><ifr:asynchronous>false</ifr:asynchronous><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2></ifr:properties><ifr:definition /></ifr:container>");
        descriptorSetElementProperties(descriptor, 0, "STORAGELOCATIONSELECT", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Storagelocationselect", hmh.sap.rfc.util.BapimatralType_List.class, new hmh.sap.rfc.BapimatralType(), new java.lang.String[][]{}, "STORAGELOCATIONSELECT", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"STORAGELOCATIONSELECT\"><ifr:descriptor><ifr:description language=\"en\">Selection options for storage locations</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"BAPIMATRAL\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPIMATRAL\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 1, "SALESORGANISATIONSELECTION", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Salesorganisationselection", hmh.sap.rfc.util.BapimatrasoType_List.class, new hmh.sap.rfc.BapimatrasoType(), new java.lang.String[][]{}, "SALESORGANISATIONSELECTION", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"SALESORGANISATIONSELECTION\"><ifr:descriptor><ifr:description language=\"en\">Selection options for sales organization</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"BAPIMATRASO\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPIMATRASO\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 2, "RETURN", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Return", hmh.sap.rfc.util.Bapiret2Type_List.class, new hmh.sap.rfc.Bapiret2Type(), new java.lang.String[][]{}, "RETURN", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"RETURN\"><ifr:descriptor><ifr:description language=\"en\">Return Parameter</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"BAPIRET2\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPIRET2\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 3, "PLANTSELECTION", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Plantselection", hmh.sap.rfc.util.BapimatrawType_List.class, new hmh.sap.rfc.BapimatrawType(), new java.lang.String[][]{}, "PLANTSELECTION", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"PLANTSELECTION\"><ifr:descriptor><ifr:description language=\"en\">Selection options for plants</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"BAPIMATRAW\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPIMATRAW\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 4, "MATNRSELECTION", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Matnrselection", hmh.sap.rfc.util.BapimatramType_List.class, new hmh.sap.rfc.BapimatramType(), new java.lang.String[][]{}, "MATNRSELECTION", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"MATNRSELECTION\"><ifr:descriptor><ifr:description language=\"en\">Selection options for material number</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"BAPIMATRAM\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPIMATRAM\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 5, "MATNRLIST", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Matnrlist", hmh.sap.rfc.util.BapimatlstType_List.class, new hmh.sap.rfc.BapimatlstType(), new java.lang.String[][]{}, "MATNRLIST", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"MATNRLIST\"><ifr:descriptor><ifr:description language=\"en\">List of material numbers with material description</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"BAPIMATLST\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPIMATLST\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 6, "MATERIALSHORTDESCSEL", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Materialshortdescsel", hmh.sap.rfc.util.BapimatrasType_List.class, new hmh.sap.rfc.BapimatrasType(), new java.lang.String[][]{}, "MATERIALSHORTDESCSEL", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"MATERIALSHORTDESCSEL\"><ifr:descriptor><ifr:description language=\"en\">Selection options for material description</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"BAPIMATRAS\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPIMATRAS\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 7, "MANUFACTURERPARTNUMB", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Manufacturerpartnumb", hmh.sap.rfc.util.BapimatmfrpnType_List.class, new hmh.sap.rfc.BapimatmfrpnType(), new java.lang.String[][]{}, "MANUFACTURERPARTNUMB", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"MANUFACTURERPARTNUMB\"><ifr:descriptor><ifr:description language=\"en\">Manufacturer and manufacturer part number</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"BAPIMATMFRPN\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPIMATMFRPN\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 8, "DISTRIBUTIONCHANNELSELECTION", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Distributionchannelselection", hmh.sap.rfc.util.BapimatradcType_List.class, new hmh.sap.rfc.BapimatradcType(), new java.lang.String[][]{}, "DISTRIBUTIONCHANNELSELECTION", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"DISTRIBUTIONCHANNELSELECTION\"><ifr:descriptor><ifr:description language=\"en\">Selection options for distribution channel</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"BAPIMATRADC\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPIMATRADC\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        staticDescriptor = descriptor;
    }
    public  Bapi_Material_Getlist_Output () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    protected  Bapi_Material_Getlist_Output (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    
    public void setMatnrselection(hmh.sap.rfc.util.BapimatramType_List Matnrselection) {
        baseTypeData().setElementValue(4, Matnrselection);
    }

    
    public void setSalesorganisationselection(hmh.sap.rfc.BapimatrasoType[] Salesorganisationselection) {
        baseTypeData().setElementValue(1, new hmh.sap.rfc.util.BapimatrasoType_List());
        hmh.sap.rfc.util.BapimatrasoType_List list$ = get_as_listSalesorganisationselection();
        for (int  i$ = 0; i$ < Salesorganisationselection.length; i$++){
         list$.addBapimatrasoType(Salesorganisationselection[ i$]);
        }
    }

    
    public hmh.sap.rfc.BapimatrasoType[] getSalesorganisationselection() {
        hmh.sap.rfc.util.BapimatrasoType_List i$ = (hmh.sap.rfc.util.BapimatrasoType_List)baseTypeData().getElementValue(1);
        if ( i$ == null){return null;}
        return  i$.toArrayBapimatrasoType();
    }

    
    public void setMatnrlist(hmh.sap.rfc.util.BapimatlstType_List Matnrlist) {
        baseTypeData().setElementValue(5, Matnrlist);
    }

    
    public hmh.sap.rfc.util.BapimatrasoType_List get_as_listSalesorganisationselection() {
        return (hmh.sap.rfc.util.BapimatrasoType_List)baseTypeData().getElementValue(1);
    }

    
    public void setMaterialshortdescsel(hmh.sap.rfc.BapimatrasType[] Materialshortdescsel) {
        baseTypeData().setElementValue(6, new hmh.sap.rfc.util.BapimatrasType_List());
        hmh.sap.rfc.util.BapimatrasType_List list$ = get_as_listMaterialshortdescsel();
        for (int  i$ = 0; i$ < Materialshortdescsel.length; i$++){
         list$.addBapimatrasType(Materialshortdescsel[ i$]);
        }
    }

    
    public void setManufacturerpartnumb(hmh.sap.rfc.util.BapimatmfrpnType_List Manufacturerpartnumb) {
        baseTypeData().setElementValue(7, Manufacturerpartnumb);
    }

    
    public hmh.sap.rfc.Bapiret2Type[] getReturn() {
        hmh.sap.rfc.util.Bapiret2Type_List i$ = (hmh.sap.rfc.util.Bapiret2Type_List)baseTypeData().getElementValue(2);
        if ( i$ == null){return null;}
        return  i$.toArrayBapiret2Type();
    }

    
    public MetaData metadataBapi_Material_Getlist_Output() {
        return metadata;
    }

    
    public void setStoragelocationselect(hmh.sap.rfc.util.BapimatralType_List Storagelocationselect) {
        baseTypeData().setElementValue(0, Storagelocationselect);
    }

    
    public void setMatnrselection(hmh.sap.rfc.BapimatramType[] Matnrselection) {
        baseTypeData().setElementValue(4, new hmh.sap.rfc.util.BapimatramType_List());
        hmh.sap.rfc.util.BapimatramType_List list$ = get_as_listMatnrselection();
        for (int  i$ = 0; i$ < Matnrselection.length; i$++){
         list$.addBapimatramType(Matnrselection[ i$]);
        }
    }

    
    public hmh.sap.rfc.BapimatrasType[] getMaterialshortdescsel() {
        hmh.sap.rfc.util.BapimatrasType_List i$ = (hmh.sap.rfc.util.BapimatrasType_List)baseTypeData().getElementValue(6);
        if ( i$ == null){return null;}
        return  i$.toArrayBapimatrasType();
    }

    
    public void setMatnrlist(hmh.sap.rfc.BapimatlstType[] Matnrlist) {
        baseTypeData().setElementValue(5, new hmh.sap.rfc.util.BapimatlstType_List());
        hmh.sap.rfc.util.BapimatlstType_List list$ = get_as_listMatnrlist();
        for (int  i$ = 0; i$ < Matnrlist.length; i$++){
         list$.addBapimatlstType(Matnrlist[ i$]);
        }
    }

    
    public hmh.sap.rfc.BapimatramType[] getMatnrselection() {
        hmh.sap.rfc.util.BapimatramType_List i$ = (hmh.sap.rfc.util.BapimatramType_List)baseTypeData().getElementValue(4);
        if ( i$ == null){return null;}
        return  i$.toArrayBapimatramType();
    }

    
    public void setDistributionchannelselection(hmh.sap.rfc.BapimatradcType[] Distributionchannelselection) {
        baseTypeData().setElementValue(8, new hmh.sap.rfc.util.BapimatradcType_List());
        hmh.sap.rfc.util.BapimatradcType_List list$ = get_as_listDistributionchannelselection();
        for (int  i$ = 0; i$ < Distributionchannelselection.length; i$++){
         list$.addBapimatradcType(Distributionchannelselection[ i$]);
        }
    }

    
    public hmh.sap.rfc.BapimatrawType[] getPlantselection() {
        hmh.sap.rfc.util.BapimatrawType_List i$ = (hmh.sap.rfc.util.BapimatrawType_List)baseTypeData().getElementValue(3);
        if ( i$ == null){return null;}
        return  i$.toArrayBapimatrawType();
    }

    
    public hmh.sap.rfc.util.BapimatrawType_List get_as_listPlantselection() {
        return (hmh.sap.rfc.util.BapimatrawType_List)baseTypeData().getElementValue(3);
    }

    
    public hmh.sap.rfc.util.BapimatramType_List get_as_listMatnrselection() {
        return (hmh.sap.rfc.util.BapimatramType_List)baseTypeData().getElementValue(4);
    }

    
    public hmh.sap.rfc.util.Bapiret2Type_List get_as_listReturn() {
        return (hmh.sap.rfc.util.Bapiret2Type_List)baseTypeData().getElementValue(2);
    }

    
    public void setDistributionchannelselection(hmh.sap.rfc.util.BapimatradcType_List Distributionchannelselection) {
        baseTypeData().setElementValue(8, Distributionchannelselection);
    }

    
    public void setStoragelocationselect(hmh.sap.rfc.BapimatralType[] Storagelocationselect) {
        baseTypeData().setElementValue(0, new hmh.sap.rfc.util.BapimatralType_List());
        hmh.sap.rfc.util.BapimatralType_List list$ = get_as_listStoragelocationselect();
        for (int  i$ = 0; i$ < Storagelocationselect.length; i$++){
         list$.addBapimatralType(Storagelocationselect[ i$]);
        }
    }

    
    public hmh.sap.rfc.BapimatralType[] getStoragelocationselect() {
        hmh.sap.rfc.util.BapimatralType_List i$ = (hmh.sap.rfc.util.BapimatralType_List)baseTypeData().getElementValue(0);
        if ( i$ == null){return null;}
        return  i$.toArrayBapimatralType();
    }

    
    public hmh.sap.rfc.util.BapimatrasType_List get_as_listMaterialshortdescsel() {
        return (hmh.sap.rfc.util.BapimatrasType_List)baseTypeData().getElementValue(6);
    }

    
    public void setPlantselection(hmh.sap.rfc.BapimatrawType[] Plantselection) {
        baseTypeData().setElementValue(3, new hmh.sap.rfc.util.BapimatrawType_List());
        hmh.sap.rfc.util.BapimatrawType_List list$ = get_as_listPlantselection();
        for (int  i$ = 0; i$ < Plantselection.length; i$++){
         list$.addBapimatrawType(Plantselection[ i$]);
        }
    }

    
    public hmh.sap.rfc.BapimatradcType[] getDistributionchannelselection() {
        hmh.sap.rfc.util.BapimatradcType_List i$ = (hmh.sap.rfc.util.BapimatradcType_List)baseTypeData().getElementValue(8);
        if ( i$ == null){return null;}
        return  i$.toArrayBapimatradcType();
    }

    
    public void setSalesorganisationselection(hmh.sap.rfc.util.BapimatrasoType_List Salesorganisationselection) {
        baseTypeData().setElementValue(1, Salesorganisationselection);
    }

    
    public hmh.sap.rfc.util.BapimatmfrpnType_List get_as_listManufacturerpartnumb() {
        return (hmh.sap.rfc.util.BapimatmfrpnType_List)baseTypeData().getElementValue(7);
    }

    
    public void setMaterialshortdescsel(hmh.sap.rfc.util.BapimatrasType_List Materialshortdescsel) {
        baseTypeData().setElementValue(6, Materialshortdescsel);
    }

    
    public hmh.sap.rfc.BapimatlstType[] getMatnrlist() {
        hmh.sap.rfc.util.BapimatlstType_List i$ = (hmh.sap.rfc.util.BapimatlstType_List)baseTypeData().getElementValue(5);
        if ( i$ == null){return null;}
        return  i$.toArrayBapimatlstType();
    }

    
    public hmh.sap.rfc.BapimatmfrpnType[] getManufacturerpartnumb() {
        hmh.sap.rfc.util.BapimatmfrpnType_List i$ = (hmh.sap.rfc.util.BapimatmfrpnType_List)baseTypeData().getElementValue(7);
        if ( i$ == null){return null;}
        return  i$.toArrayBapimatmfrpnType();
    }

    
    public void setPlantselection(hmh.sap.rfc.util.BapimatrawType_List Plantselection) {
        baseTypeData().setElementValue(3, Plantselection);
    }

    
    public hmh.sap.rfc.util.BapimatradcType_List get_as_listDistributionchannelselection() {
        return (hmh.sap.rfc.util.BapimatradcType_List)baseTypeData().getElementValue(8);
    }

    
    public void setManufacturerpartnumb(hmh.sap.rfc.BapimatmfrpnType[] Manufacturerpartnumb) {
        baseTypeData().setElementValue(7, new hmh.sap.rfc.util.BapimatmfrpnType_List());
        hmh.sap.rfc.util.BapimatmfrpnType_List list$ = get_as_listManufacturerpartnumb();
        for (int  i$ = 0; i$ < Manufacturerpartnumb.length; i$++){
         list$.addBapimatmfrpnType(Manufacturerpartnumb[ i$]);
        }
    }

    
    public void setReturn(hmh.sap.rfc.Bapiret2Type[] Return) {
        baseTypeData().setElementValue(2, new hmh.sap.rfc.util.Bapiret2Type_List());
        hmh.sap.rfc.util.Bapiret2Type_List list$ = get_as_listReturn();
        for (int  i$ = 0; i$ < Return.length; i$++){
         list$.addBapiret2Type(Return[ i$]);
        }
    }

    
    public void setReturn(hmh.sap.rfc.util.Bapiret2Type_List Return) {
        baseTypeData().setElementValue(2, Return);
    }

    
    public hmh.sap.rfc.util.BapimatralType_List get_as_listStoragelocationselect() {
        return (hmh.sap.rfc.util.BapimatralType_List)baseTypeData().getElementValue(0);
    }

    
    public hmh.sap.rfc.util.BapimatlstType_List get_as_listMatnrlist() {
        return (hmh.sap.rfc.util.BapimatlstType_List)baseTypeData().getElementValue(5);
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  Bapi_Material_Getlist_Output parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Bapi_Material_Getlist_Output parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getReturn() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDistributionchannelselection() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(8);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSalesorganisationselection() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMatnrlist() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(5);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getManufacturerpartnumb() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(7);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMaterialshortdescsel() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(6);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getStoragelocationselect() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMatnrselection() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(4);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPlantselection() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
    }

}
