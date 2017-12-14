package hmh.sap.rfc;


public class Bapi_Mpgd_GaType extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1335984408567L) ;

    private  Bapi_Mpgd_GaType.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.XSDL_COMPLEX_TYPE, "urn:sap-com:document:sap:rfc:functions", "BAPI_MPGD_GA", 7, 0, hmh.sap.rfc.Bapi_Mpgd_GaType.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "BAPI_MPGD_GA", 118, 236, -1, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"BAPI_MPGD_GA\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Change Document Structure for Material Master/Product Group</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>118</ifr:internalLength1><ifr:internalLength2>236</ifr:internalLength2></ifr:definition></ifr:container></s0:type>");
        descriptorSetElementProperties(descriptor, 0, "PLANT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Plant", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "PLANT", 0, 0, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PLANT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Plant</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>0</ifr:offset1><ifr:offset2>0</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"WERKS_D\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 1, "PLNG_MATL", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Plng_Matl", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "18"}}, "PLNG_MATL", 4, 8, -1, 18, 36, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PLNG_MATL\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Planning material</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>4</ifr:offset1><ifr:offset2>8</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VPMAT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>18</ifr:length><ifr:internalLength1>18</ifr:internalLength1><ifr:internalLength2>36</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>18</ifr:outputLength><ifr:conversionExit>MATN1</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 2, "PLNG_PLANT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Plng_Plant", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "PLNG_PLANT", 22, 44, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PLNG_PLANT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Planning plant</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>22</ifr:offset1><ifr:offset2>44</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VPWRK\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 3, "CONVFACTOR", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Convfactor", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "CONVFACTOR", 26, 52, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CONVFACTOR\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Conv. factor f. plng material</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>26</ifr:offset1><ifr:offset2>52</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VPREF\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 4, "PLNG_MATL_EXTERNAL", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Plng_Matl_External", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "40"}}, "PLNG_MATL_EXTERNAL", 36, 72, -1, 40, 80, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PLNG_MATL_EXTERNAL\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Long material number (future development) for PLNG_ field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>36</ifr:offset1><ifr:offset2>72</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MGV_PLNG_MATL_EXTERNAL\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>40</ifr:length><ifr:internalLength1>40</ifr:internalLength1><ifr:internalLength2>80</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>40</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 5, "PLNG_MATL_GUID", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Plng_Matl_Guid", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "32"}}, "PLNG_MATL_GUID", 76, 152, -1, 32, 64, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PLNG_MATL_GUID\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">External GUID (future development) for PLNG_MATL field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>76</ifr:offset1><ifr:offset2>152</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MGV_PLNG_MATL_GUID\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>32</ifr:length><ifr:internalLength1>32</ifr:internalLength1><ifr:internalLength2>64</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>32</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 6, "PLNG_MATL_VERSION", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Plng_Matl_Version", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "PLNG_MATL_VERSION", 108, 216, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PLNG_MATL_VERSION\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Version number (future development) for PLNG_MATL field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>108</ifr:offset1><ifr:offset2>216</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MGV_PLNG_MATL_VERSION\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        staticDescriptor = descriptor;
    }
    public  Bapi_Mpgd_GaType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    protected  Bapi_Mpgd_GaType (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    
    public java.lang.String getPlng_Matl_External() {
        return (java.lang.String)baseTypeData().getElementValueAsString(4);
    }

    
    public void setPlng_Matl_Version(java.lang.String Plng_Matl_Version) {
        baseTypeData().setElementValue(6, Plng_Matl_Version);
    }

    
    public java.lang.String getPlant() {
        return (java.lang.String)baseTypeData().getElementValueAsString(0);
    }

    
    public void setPlng_Matl_External(java.lang.String Plng_Matl_External) {
        baseTypeData().setElementValue(4, Plng_Matl_External);
    }

    
    public java.lang.String getPlng_Matl() {
        return (java.lang.String)baseTypeData().getElementValueAsString(1);
    }

    
    public void setPlant(java.lang.String Plant) {
        baseTypeData().setElementValue(0, Plant);
    }

    
    public MetaData metadata() {
        return metadata;
    }

    
    public java.lang.String getPlng_Matl_Guid() {
        return (java.lang.String)baseTypeData().getElementValueAsString(5);
    }

    
    public void setPlng_Matl_Guid(java.lang.String Plng_Matl_Guid) {
        baseTypeData().setElementValue(5, Plng_Matl_Guid);
    }

    
    public void setConvfactor(java.lang.String Convfactor) {
        baseTypeData().setElementValue(3, Convfactor);
    }

    
    public java.lang.String getPlng_Plant() {
        return (java.lang.String)baseTypeData().getElementValueAsString(2);
    }

    
    public void setPlng_Plant(java.lang.String Plng_Plant) {
        baseTypeData().setElementValue(2, Plng_Plant);
    }

    
    public java.lang.String getConvfactor() {
        return (java.lang.String)baseTypeData().getElementValueAsString(3);
    }

    
    public java.lang.String getPlng_Matl_Version() {
        return (java.lang.String)baseTypeData().getElementValueAsString(6);
    }

    
    public void setPlng_Matl(java.lang.String Plng_Matl) {
        baseTypeData().setElementValue(1, Plng_Matl);
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  Bapi_Mpgd_GaType parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Bapi_Mpgd_GaType parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPlng_Matl_External() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(4);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPlng_Plant() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPlant() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPlng_Matl() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPlng_Matl_Version() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(6);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getConvfactor() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPlng_Matl_Guid() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(5);
        }
    
    }

}
