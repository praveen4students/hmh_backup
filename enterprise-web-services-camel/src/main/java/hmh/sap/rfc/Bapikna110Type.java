package hmh.sap.rfc;


public class Bapikna110Type extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1335986960830L) ;

    private  Bapikna110Type.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.XSDL_COMPLEX_TYPE, "urn:sap-com:document:sap:rfc:functions", "BAPIKNA110", 4, 0, hmh.sap.rfc.Bapikna110Type.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "BAPIKNA110", 196, 392, -1, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"BAPIKNA110\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Transfer Structure KNA1/Search Terms</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>196</ifr:internalLength1><ifr:internalLength2>392</ifr:internalLength2></ifr:definition></ifr:container></s0:type>");
        descriptorSetElementProperties(descriptor, 0, "COMP_CODE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Comp_Code", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "COMP_CODE", 0, 0, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"COMP_CODE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Company Code</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>T001</ifr:checkTable><ifr:offset1>0</ifr:offset1><ifr:offset2>0</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BUKRS\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 1, "TABNAME", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Tabname", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "30"}}, "TABNAME", 4, 8, -1, 30, 60, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TABNAME\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Table Name</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>DD02L</ifr:checkTable><ifr:offset1>4</ifr:offset1><ifr:offset2>8</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"TABNAME\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>30</ifr:length><ifr:internalLength1>30</ifr:internalLength1><ifr:internalLength2>60</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>30</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 2, "FIELDNAME", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Fieldname", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "30"}}, "FIELDNAME", 34, 68, -1, 30, 60, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"FIELDNAME\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Field Name</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>DD03L</ifr:checkTable><ifr:offset1>34</ifr:offset1><ifr:offset2>68</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"FIELDNAME\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>30</ifr:length><ifr:internalLength1>30</ifr:internalLength1><ifr:internalLength2>60</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>30</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 3, "FIELDVALUE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Fieldvalue", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "132"}}, "FIELDVALUE", 64, 128, -1, 132, 264, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"FIELDVALUE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Field value</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>64</ifr:offset1><ifr:offset2>128</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"FIELDVALUE\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>132</ifr:length><ifr:internalLength1>132</ifr:internalLength1><ifr:internalLength2>264</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>132</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        staticDescriptor = descriptor;
    }
    protected  Bapikna110Type (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    public  Bapikna110Type () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public void setFieldvalue(java.lang.String Fieldvalue) {
        baseTypeData().setElementValue(3, Fieldvalue);
    }

    
    public java.lang.String getComp_Code() {
        return (java.lang.String)baseTypeData().getElementValueAsString(0);
    }

    
    public void setFieldname(java.lang.String Fieldname) {
        baseTypeData().setElementValue(2, Fieldname);
    }

    
    public void setTabname(java.lang.String Tabname) {
        baseTypeData().setElementValue(1, Tabname);
    }

    
    public java.lang.String getFieldname() {
        return (java.lang.String)baseTypeData().getElementValueAsString(2);
    }

    
    public java.lang.String getTabname() {
        return (java.lang.String)baseTypeData().getElementValueAsString(1);
    }

    
    public void setComp_Code(java.lang.String Comp_Code) {
        baseTypeData().setElementValue(0, Comp_Code);
    }

    
    public java.lang.String getFieldvalue() {
        return (java.lang.String)baseTypeData().getElementValueAsString(3);
    }

    
    public MetaData metadata() {
        return metadata;
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  Bapikna110Type parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Bapikna110Type parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getComp_Code() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getFieldname() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTabname() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getFieldvalue() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
    }

}
