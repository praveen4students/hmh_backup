package hmh.sap.rfc;


public class BapicompType extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1335985881492L) ;

    private  BapicompType.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.XSDL_COMPLEX_TYPE, "urn:sap-com:document:sap:rfc:functions", "BAPICOMP", 7, 0, hmh.sap.rfc.BapicompType.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "BAPICOMP", 113, 220, -1, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"BAPICOMP\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">BAPI communication structure: Components of struct. material</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>113</ifr:internalLength1><ifr:internalLength2>220</ifr:internalLength2></ifr:definition></ifr:container></s0:type>");
        descriptorSetElementProperties(descriptor, 0, "MATERIAL", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Material", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "18"}}, "MATERIAL", 0, 0, -1, 18, 36, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MATERIAL\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Material Number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>MARA</ifr:checkTable><ifr:offset1>0</ifr:offset1><ifr:offset2>0</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MATNR\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>18</ifr:length><ifr:internalLength1>18</ifr:internalLength1><ifr:internalLength2>36</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>18</ifr:outputLength><ifr:conversionExit>MATN1</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 1, "UNIT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Unit", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "UNIT", 18, 36, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"UNIT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Unit of Measure for Display</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>T006</ifr:checkTable><ifr:offset1>18</ifr:offset1><ifr:offset2>36</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MEINH\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>UNIT</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength><ifr:conversionExit>CUNIT</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 2, "UNIT_ISO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Unit_Iso", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "UNIT_ISO", 21, 42, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"UNIT_ISO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">ISO code for unit of measurement</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>T006I</ifr:checkTable><ifr:offset1>21</ifr:offset1><ifr:offset2>42</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ISOCD_UNIT\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 3, "QUANTITY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Quantity", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "13"}, {"fractionDigits", "3"}}, "QUANTITY", 24, 48, -1, 7, 7, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"QUANTITY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Quantity</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:referenceField>UNIT</ifr:referenceField><ifr:referenceTable>BAPICOMP</ifr:referenceTable><ifr:offset1>24</ifr:offset1><ifr:offset2>48</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MENGE_D\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>QUAN</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>13</ifr:length><ifr:internalLength1>7</ifr:internalLength1><ifr:internalLength2>7</ifr:internalLength2><ifr:decimals>3</ifr:decimals><ifr:outputLength>17</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 4, "MATERIAL_EXTERNAL", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Material_External", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "40"}}, "MATERIAL_EXTERNAL", 31, 56, -1, 40, 80, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MATERIAL_EXTERNAL\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Long material number (future development) for MATERIAL field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>31</ifr:offset1><ifr:offset2>56</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MGV_MATERIAL_EXTERNAL\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>40</ifr:length><ifr:internalLength1>40</ifr:internalLength1><ifr:internalLength2>80</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>40</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 5, "MATERIAL_GUID", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Material_Guid", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "32"}}, "MATERIAL_GUID", 71, 136, -1, 32, 64, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MATERIAL_GUID\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">External GUID (future development) for MATERIAL field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>71</ifr:offset1><ifr:offset2>136</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MGV_MATERIAL_GUID\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>32</ifr:length><ifr:internalLength1>32</ifr:internalLength1><ifr:internalLength2>64</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>32</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 6, "MATERIAL_VERSION", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Material_Version", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "MATERIAL_VERSION", 103, 200, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MATERIAL_VERSION\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Version number (future development) for MATERIAL field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>103</ifr:offset1><ifr:offset2>200</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MGV_MATERIAL_VERSION\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        staticDescriptor = descriptor;
    }
    public  BapicompType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    protected  BapicompType (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    
    public void setMaterial_Guid(java.lang.String Material_Guid) {
        baseTypeData().setElementValue(5, Material_Guid);
    }

    
    public void setQuantity(java.math.BigDecimal Quantity) {
        baseTypeData().setElementValue(3, Quantity);
    }

    
    public void setMaterial(java.lang.String Material) {
        baseTypeData().setElementValue(0, Material);
    }

    
    public void setMaterial_External(java.lang.String Material_External) {
        baseTypeData().setElementValue(4, Material_External);
    }

    
    public java.lang.String getMaterial() {
        return (java.lang.String)baseTypeData().getElementValueAsString(0);
    }

    
    public void setMaterial_Version(java.lang.String Material_Version) {
        baseTypeData().setElementValue(6, Material_Version);
    }

    
    public MetaData metadata() {
        return metadata;
    }

    
    public java.lang.String getMaterial_Guid() {
        return (java.lang.String)baseTypeData().getElementValueAsString(5);
    }

    
    public java.math.BigDecimal getQuantity() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(3);
    }

    
    public java.lang.String getMaterial_External() {
        return (java.lang.String)baseTypeData().getElementValueAsString(4);
    }

    
    public void setUnit(java.lang.String Unit) {
        baseTypeData().setElementValue(1, Unit);
    }

    
    public java.lang.String getUnit() {
        return (java.lang.String)baseTypeData().getElementValueAsString(1);
    }

    
    public void setUnit_Iso(java.lang.String Unit_Iso) {
        baseTypeData().setElementValue(2, Unit_Iso);
    }

    
    public java.lang.String getUnit_Iso() {
        return (java.lang.String)baseTypeData().getElementValueAsString(2);
    }

    
    public java.lang.String getMaterial_Version() {
        return (java.lang.String)baseTypeData().getElementValueAsString(6);
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  BapicompType parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (BapicompType parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMaterial_Guid() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(5);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getQuantity() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMaterial_External() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(4);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getUnit() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMaterial() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getUnit_Iso() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMaterial_Version() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(6);
        }
    
    }

}
