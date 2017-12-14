package hmh.sap.rfc;


public class Bapi_Cust_Sareas_Materials_Get_Input extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1335986197636L) ;

    private  Bapi_Cust_Sareas_Materials_Get_Input.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.WSDL_MESSAGE_FOR_JCO, "urn:sap-com:document:sap:rfc:functions", "BAPI_CUST_SAREAS_MATERIALS_GET.Input", 8, 0, hmh.sap.rfc.Bapi_Cust_Sareas_Materials_Get_Input.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "BAPI_CUST_SAREAS_MATERIALS_GET", 0, 0, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Create List of Materials for the Sales Areas of a Customer</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:package>QC</ifr:package><ifr:akhNode>HLA0006216</ifr:akhNode><ifr:released>external</ifr:released><ifr:outbound>false</ifr:outbound><ifr:synchronous>true</ifr:synchronous><ifr:asynchronous>false</ifr:asynchronous><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2></ifr:properties><ifr:definition /></ifr:container>");
        descriptorSetElementProperties(descriptor, 0, "CUSTOMERNO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 1, 1, false, null, "Customerno", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "CUSTOMERNO", 0, 0, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"CUSTOMERNO\"><ifr:descriptor><ifr:description language=\"en\">Customer Number</ifr:description></ifr:descriptor><ifr:definition><ifr:field name=\"BAPIKNVVKY.CUSTOMER\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>KNA1</ifr:checkTable><ifr:offset1>0</ifr:offset1><ifr:offset2>0</ifr:offset2></ifr:properties></ifr:field><ifr:scalarType name=\"KUNNR\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 1, "MATERIAL_GROUP", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Material_Group", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "9"}}, "MATERIAL_GROUP", 0, 0, -1, 9, 18, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"MATERIAL_GROUP\"><ifr:descriptor><ifr:description language=\"en\">Material Group</ifr:description></ifr:descriptor><ifr:definition><ifr:field name=\"BAPIQCI.MATL_GROUP\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>T023</ifr:checkTable><ifr:offset1>136</ifr:offset1><ifr:offset2>264</ifr:offset2></ifr:properties></ifr:field><ifr:scalarType name=\"MATKL\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>9</ifr:length><ifr:internalLength1>9</ifr:internalLength1><ifr:internalLength2>18</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>9</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 2, "SPECIFIC_DISTR_CHANNEL", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Specific_Distr_Channel", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "SPECIFIC_DISTR_CHANNEL", 0, 0, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"SPECIFIC_DISTR_CHANNEL\"><ifr:descriptor><ifr:description language=\"en\">Specific Distribution Channel</ifr:description></ifr:descriptor><ifr:definition><ifr:field name=\"BAPIKNVVKY.DISTRCHN\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TVTW</ifr:checkTable><ifr:offset1>14</ifr:offset1><ifr:offset2>28</ifr:offset2></ifr:properties></ifr:field><ifr:scalarType name=\"VTWEG\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 3, "SPECIFIC_SALESORGANISATION", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Specific_Salesorganisation", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "SPECIFIC_SALESORGANISATION", 0, 0, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"SPECIFIC_SALESORGANISATION\"><ifr:descriptor><ifr:description language=\"en\">Specific Sales Organization</ifr:description></ifr:descriptor><ifr:definition><ifr:field name=\"BAPIKNVVKY.SALESORG\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TVKO</ifr:checkTable><ifr:offset1>10</ifr:offset1><ifr:offset2>20</ifr:offset2></ifr:properties></ifr:field><ifr:scalarType name=\"VKORG\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 4, "TEXTLANGUAGE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Textlanguage", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "TEXTLANGUAGE", 0, 0, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"TEXTLANGUAGE\"><ifr:descriptor><ifr:description language=\"en\">Language for Material Short Text</ifr:description></ifr:descriptor><ifr:definition><ifr:field name=\"BAPIMAKT.LANGU\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>T002</ifr:checkTable><ifr:offset1>18</ifr:offset1><ifr:offset2>36</ifr:offset2></ifr:properties></ifr:field><ifr:scalarType name=\"SPRAS\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>LANG</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength><ifr:conversionExit>ISOLA</ifr:conversionExit></ifr:definition></ifr:scalarType><ifr:defaultDefinition>SY-LANGU</ifr:defaultDefinition></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 5, "TEXTSTRING", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Textstring", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "40"}}, "TEXTSTRING", 0, 0, -1, 40, 80, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"TEXTSTRING\"><ifr:descriptor><ifr:description language=\"en\">Search String for Material Short Text</ifr:description></ifr:descriptor><ifr:definition><ifr:field name=\"BAPIMAKT.MATL_DESC\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>19</ifr:offset1><ifr:offset2>38</ifr:offset2></ifr:properties></ifr:field><ifr:scalarType name=\"MAKTX\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>40</ifr:length><ifr:internalLength1>40</ifr:internalLength1><ifr:internalLength2>80</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>40</ifr:outputLength></ifr:definition></ifr:scalarType><ifr:defaultDefinition>&apos;*&apos;</ifr:defaultDefinition></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 6, "MESSAGETABLE", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Messagetable", hmh.sap.rfc.util.BapiqclineType_List.class, new hmh.sap.rfc.BapiqclineType(), new java.lang.String[][]{}, "MESSAGETABLE", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"MESSAGETABLE\"><ifr:descriptor><ifr:description language=\"en\">Log Table</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"BAPIQCLINE\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPIQCLINE\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 7, "MATERIALS", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Materials", hmh.sap.rfc.util.BapimaktType_List.class, new hmh.sap.rfc.BapimaktType(), new java.lang.String[][]{}, "MATERIALS", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"MATERIALS\"><ifr:descriptor><ifr:description language=\"en\">Materials Table</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"BAPIMAKT\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPIMAKT\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        staticDescriptor = descriptor;
    }
    public  Bapi_Cust_Sareas_Materials_Get_Input () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    protected  Bapi_Cust_Sareas_Materials_Get_Input (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    
    public java.lang.String getSpecific_Distr_Channel() {
        return (java.lang.String)baseTypeData().getElementValueAsString(2);
    }

    
    public void setSpecific_Distr_Channel(java.lang.String Specific_Distr_Channel) {
        baseTypeData().setElementValue(2, Specific_Distr_Channel);
    }

    
    public void setMaterials(hmh.sap.rfc.BapimaktType[] Materials) {
        baseTypeData().setElementValue(7, new hmh.sap.rfc.util.BapimaktType_List());
        hmh.sap.rfc.util.BapimaktType_List list$ = get_as_listMaterials();
        for (int  i$ = 0; i$ < Materials.length; i$++){
         list$.addBapimaktType(Materials[ i$]);
        }
    }

    
    public java.lang.String getMaterial_Group() {
        return (java.lang.String)baseTypeData().getElementValueAsString(1);
    }

    
    public void setSpecific_Salesorganisation(java.lang.String Specific_Salesorganisation) {
        baseTypeData().setElementValue(3, Specific_Salesorganisation);
    }

    
    public java.lang.String getTextlanguage() {
        return (java.lang.String)baseTypeData().getElementValueAsString(4);
    }

    
    public java.lang.String getTextstring() {
        return (java.lang.String)baseTypeData().getElementValueAsString(5);
    }

    
    public void setTextstring(java.lang.String Textstring) {
        baseTypeData().setElementValue(5, Textstring);
    }

    
    public hmh.sap.rfc.BapiqclineType[] getMessagetable() {
        hmh.sap.rfc.util.BapiqclineType_List i$ = (hmh.sap.rfc.util.BapiqclineType_List)baseTypeData().getElementValue(6);
        if ( i$ == null){return null;}
        return  i$.toArrayBapiqclineType();
    }

    
    public hmh.sap.rfc.BapimaktType[] getMaterials() {
        hmh.sap.rfc.util.BapimaktType_List i$ = (hmh.sap.rfc.util.BapimaktType_List)baseTypeData().getElementValue(7);
        if ( i$ == null){return null;}
        return  i$.toArrayBapimaktType();
    }

    
    public java.lang.String getSpecific_Salesorganisation() {
        return (java.lang.String)baseTypeData().getElementValueAsString(3);
    }

    
    public MetaData metadataBapi_Cust_Sareas_Materials_Get_Input() {
        return metadata;
    }

    
    public hmh.sap.rfc.util.BapimaktType_List get_as_listMaterials() {
        return (hmh.sap.rfc.util.BapimaktType_List)baseTypeData().getElementValue(7);
    }

    
    public void setMaterial_Group(java.lang.String Material_Group) {
        baseTypeData().setElementValue(1, Material_Group);
    }

    
    public void setTextlanguage(java.lang.String Textlanguage) {
        baseTypeData().setElementValue(4, Textlanguage);
    }

    
    public void setCustomerno(java.lang.String Customerno) {
        baseTypeData().setElementValue(0, Customerno);
    }

    
    public void setMessagetable(hmh.sap.rfc.BapiqclineType[] Messagetable) {
        baseTypeData().setElementValue(6, new hmh.sap.rfc.util.BapiqclineType_List());
        hmh.sap.rfc.util.BapiqclineType_List list$ = get_as_listMessagetable();
        for (int  i$ = 0; i$ < Messagetable.length; i$++){
         list$.addBapiqclineType(Messagetable[ i$]);
        }
    }

    
    public java.lang.String getCustomerno() {
        return (java.lang.String)baseTypeData().getElementValueAsString(0);
    }

    
    public void setMessagetable(hmh.sap.rfc.util.BapiqclineType_List Messagetable) {
        baseTypeData().setElementValue(6, Messagetable);
    }

    
    public void setMaterials(hmh.sap.rfc.util.BapimaktType_List Materials) {
        baseTypeData().setElementValue(7, Materials);
    }

    
    public hmh.sap.rfc.util.BapiqclineType_List get_as_listMessagetable() {
        return (hmh.sap.rfc.util.BapiqclineType_List)baseTypeData().getElementValue(6);
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  Bapi_Cust_Sareas_Materials_Get_Input parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Bapi_Cust_Sareas_Materials_Get_Input parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSpecific_Distr_Channel() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCustomerno() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMaterial_Group() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTextlanguage() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(4);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTextstring() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(5);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMessagetable() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(6);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMaterials() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(7);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSpecific_Salesorganisation() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
    }

}
