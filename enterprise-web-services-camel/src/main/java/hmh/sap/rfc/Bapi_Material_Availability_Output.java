package hmh.sap.rfc;


public class Bapi_Material_Availability_Output extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1335986080129L) ;

    private  Bapi_Material_Availability_Output.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.WSDL_MESSAGE_FOR_JCO, "urn:sap-com:document:sap:rfc:functions", "BAPI_MATERIAL_AVAILABILITY.Output", 6, 0, hmh.sap.rfc.Bapi_Material_Availability_Output.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "BAPI_MATERIAL_AVAILABILITY", 0, 0, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">ATP information</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:package>MDW1</ifr:package><ifr:akhNode>HLA0006562</ifr:akhNode><ifr:released>external</ifr:released><ifr:outbound>false</ifr:outbound><ifr:synchronous>true</ifr:synchronous><ifr:asynchronous>false</ifr:asynchronous><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2></ifr:properties><ifr:definition /></ifr:container>");
        descriptorSetElementProperties(descriptor, 0, "AV_QTY_PLT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Av_Qty_Plt", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "13"}, {"fractionDigits", "3"}}, "AV_QTY_PLT", 0, 0, -1, 7, 7, -1, com.sap.mw.jco.JCO.TYPE_BCD, com.sap.mw.jco.JCO.EXPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"AV_QTY_PLT\"><ifr:descriptor><ifr:description language=\"en\">Quantity available at plant level</ifr:description></ifr:descriptor><ifr:definition><ifr:field name=\"BAPICM61V.WKBST\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:referenceField>MEINS</ifr:referenceField><ifr:referenceTable>BAPIMATVP</ifr:referenceTable><ifr:offset1>22</ifr:offset1><ifr:offset2>44</ifr:offset2></ifr:properties></ifr:field><ifr:scalarType name=\"MNG01\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>true</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>QUAN</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>13</ifr:length><ifr:internalLength1>7</ifr:internalLength1><ifr:internalLength2>7</ifr:internalLength2><ifr:decimals>3</ifr:decimals><ifr:outputLength>18</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>out</ifr:direction><ifr:class>export</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 1, "DIALOGFLAG", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Dialogflag", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "DIALOGFLAG", 0, 0, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.EXPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"DIALOGFLAG\"><ifr:descriptor><ifr:description language=\"en\">Indicator (X = not available, N = no check)</ifr:description></ifr:descriptor><ifr:definition><ifr:field name=\"BAPICM61V.DIAFL\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>20</ifr:offset1><ifr:offset2>40</ifr:offset2></ifr:properties></ifr:field><ifr:scalarType name=\"CHAR1\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>out</ifr:direction><ifr:class>export</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 2, "ENDLEADTME", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Endleadtme", java.sql.Date.class, null, new java.lang.String[][]{}, "ENDLEADTME", 0, 0, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, com.sap.mw.jco.JCO.EXPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"ENDLEADTME\"><ifr:descriptor><ifr:description language=\"en\">End of replenishment lead time</ifr:description></ifr:descriptor><ifr:definition><ifr:field name=\"BAPICM61M.WZTER\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>62</ifr:offset1><ifr:offset2>118</ifr:offset2></ifr:properties></ifr:field><ifr:scalarType name=\"WZTER\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>out</ifr:direction><ifr:class>export</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 3, "RETURN", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:BAPIRETURN", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Return", hmh.sap.rfc.BapireturnType.class, new hmh.sap.rfc.BapireturnType(), new java.lang.String[][]{}, "RETURN", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, com.sap.mw.jco.JCO.EXPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"RETURN\"><ifr:descriptor><ifr:description language=\"en\">Indicator (X = not available, N = no check)</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"BAPIRETURN\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPIRETURN\" /></ifr:definition><ifr:properties><ifr:direction>out</ifr:direction><ifr:class>export</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 4, "WMDVSX", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Wmdvsx", hmh.sap.rfc.util.BapiwmdvsType_List.class, new hmh.sap.rfc.BapiwmdvsType(), new java.lang.String[][]{}, "WMDVSX", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"WMDVSX\"><ifr:descriptor><ifr:description language=\"en\">Input table (date and quantity)</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"BAPIWMDVS\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPIWMDVS\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 5, "WMDVEX", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Wmdvex", hmh.sap.rfc.util.BapiwmdveType_List.class, new hmh.sap.rfc.BapiwmdveType(), new java.lang.String[][]{}, "WMDVEX", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"WMDVEX\"><ifr:descriptor><ifr:description language=\"en\">Output table (date and ATP quantity)</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"BAPIWMDVE\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPIWMDVE\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        staticDescriptor = descriptor;
    }
    public  Bapi_Material_Availability_Output () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    protected  Bapi_Material_Availability_Output (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    
    public void setDialogflag(java.lang.String Dialogflag) {
        baseTypeData().setElementValue(1, Dialogflag);
    }

    
    public void setEndleadtme(java.sql.Date Endleadtme) {
        baseTypeData().setElementValue(2, Endleadtme);
    }

    
    public MetaData metadataBapi_Material_Availability_Output() {
        return metadata;
    }

    
    public hmh.sap.rfc.BapiwmdvsType[] getWmdvsx() {
        hmh.sap.rfc.util.BapiwmdvsType_List i$ = (hmh.sap.rfc.util.BapiwmdvsType_List)baseTypeData().getElementValue(4);
        if ( i$ == null){return null;}
        return  i$.toArrayBapiwmdvsType();
    }

    
    public java.math.BigDecimal getAv_Qty_Plt() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(0);
    }

    
    public void setReturn(hmh.sap.rfc.BapireturnType Return) {
        baseTypeData().setElementValue(3, Return);
    }

    
    public void setWmdvsx(hmh.sap.rfc.util.BapiwmdvsType_List Wmdvsx) {
        baseTypeData().setElementValue(4, Wmdvsx);
    }

    
    public void setWmdvex(hmh.sap.rfc.util.BapiwmdveType_List Wmdvex) {
        baseTypeData().setElementValue(5, Wmdvex);
    }

    
    public hmh.sap.rfc.BapireturnType getReturn() {
        return (hmh.sap.rfc.BapireturnType)baseTypeData().getElementValue(3);
    }

    
    public void setWmdvex(hmh.sap.rfc.BapiwmdveType[] Wmdvex) {
        baseTypeData().setElementValue(5, new hmh.sap.rfc.util.BapiwmdveType_List());
        hmh.sap.rfc.util.BapiwmdveType_List list$ = get_as_listWmdvex();
        for (int  i$ = 0; i$ < Wmdvex.length; i$++){
         list$.addBapiwmdveType(Wmdvex[ i$]);
        }
    }

    
    public java.lang.String getDialogflag() {
        return (java.lang.String)baseTypeData().getElementValueAsString(1);
    }

    
    public hmh.sap.rfc.util.BapiwmdvsType_List get_as_listWmdvsx() {
        return (hmh.sap.rfc.util.BapiwmdvsType_List)baseTypeData().getElementValue(4);
    }

    
    public hmh.sap.rfc.BapiwmdveType[] getWmdvex() {
        hmh.sap.rfc.util.BapiwmdveType_List i$ = (hmh.sap.rfc.util.BapiwmdveType_List)baseTypeData().getElementValue(5);
        if ( i$ == null){return null;}
        return  i$.toArrayBapiwmdveType();
    }

    
    public java.sql.Date getEndleadtme() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(2);
    }

    
    public void setWmdvsx(hmh.sap.rfc.BapiwmdvsType[] Wmdvsx) {
        baseTypeData().setElementValue(4, new hmh.sap.rfc.util.BapiwmdvsType_List());
        hmh.sap.rfc.util.BapiwmdvsType_List list$ = get_as_listWmdvsx();
        for (int  i$ = 0; i$ < Wmdvsx.length; i$++){
         list$.addBapiwmdvsType(Wmdvsx[ i$]);
        }
    }

    
    public void setAv_Qty_Plt(java.math.BigDecimal Av_Qty_Plt) {
        baseTypeData().setElementValue(0, Av_Qty_Plt);
    }

    
    public hmh.sap.rfc.util.BapiwmdveType_List get_as_listWmdvex() {
        return (hmh.sap.rfc.util.BapiwmdveType_List)baseTypeData().getElementValue(5);
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  Bapi_Material_Availability_Output parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Bapi_Material_Availability_Output parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getReturn() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDialogflag() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getWmdvex() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(5);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getWmdvsx() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(4);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getEndleadtme() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getAv_Qty_Plt() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
    }

}
