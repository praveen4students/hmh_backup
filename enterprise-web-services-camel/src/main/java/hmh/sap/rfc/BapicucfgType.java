package hmh.sap.rfc;


public class BapicucfgType extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1354127028433L) ;

    private  BapicucfgType.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.XSDL_COMPLEX_TYPE, "urn:sap-com:document:sap:rfc:functions", "BAPICUCFG", 13, 0, hmh.sap.rfc.BapicucfgType.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "BAPICUCFG", 397, 794, -1, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"BAPICUCFG\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">CU: Configuration Data</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>110</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>397</ifr:internalLength1><ifr:internalLength2>794</ifr:internalLength2></ifr:definition></ifr:container></s0:type>");
        descriptorSetElementProperties(descriptor, 0, "POSEX", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Posex", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "6"}}, "POSEX", 0, 0, -1, 6, 12, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"POSEX\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">External item number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>0</ifr:offset1><ifr:offset2>0</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CU_POSEX\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>6</ifr:length><ifr:internalLength1>6</ifr:internalLength1><ifr:internalLength2>12</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>6</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 1, "CONFIG_ID", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Config_Id", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "6"}}, "CONFIG_ID", 6, 12, -1, 6, 12, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CONFIG_ID\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">External Configuration ID (Temporary)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>6</ifr:offset1><ifr:offset2>12</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CUX_CFG_ID\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>6</ifr:length><ifr:internalLength1>6</ifr:internalLength1><ifr:internalLength2>12</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>6</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 2, "ROOT_ID", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Root_Id", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "8"}}, "ROOT_ID", 12, 24, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ROOT_ID\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Instance Number in Configuration</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>12</ifr:offset1><ifr:offset2>24</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CU_INST_ID\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>8</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 3, "SCE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Sce", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "SCE", 20, 40, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SCE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">CUX: Type of Configuration</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>20</ifr:offset1><ifr:offset2>40</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CUX_CONFIGURATION_TYPE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 4, "KBNAME", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Kbname", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "30"}}, "KBNAME", 21, 42, -1, 30, 60, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"KBNAME\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Knowledge-Base Object</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>21</ifr:offset1><ifr:offset2>42</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CUX_KBOBJNAME\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>30</ifr:length><ifr:internalLength1>30</ifr:internalLength1><ifr:internalLength2>60</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>30</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 5, "KBVERSION", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Kbversion", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "30"}}, "KBVERSION", 51, 102, -1, 30, 60, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"KBVERSION\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Runtime Version of SCE Knowledge Base</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>51</ifr:offset1><ifr:offset2>102</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CUX_RTVERSION\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>30</ifr:length><ifr:internalLength1>30</ifr:internalLength1><ifr:internalLength2>60</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>30</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 6, "COMPLETE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Complete", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "COMPLETE", 81, 162, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"COMPLETE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">General indicator</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>81</ifr:offset1><ifr:offset2>162</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CU_CHECKED\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 7, "CONSISTENT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Consistent", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "CONSISTENT", 82, 164, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CONSISTENT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">General indicator</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>82</ifr:offset1><ifr:offset2>164</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CU_CHECKED\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 8, "CFGINFO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cfginfo", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "250"}}, "CFGINFO", 83, 166, -1, 250, 500, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CFGINFO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">CU: BLOB of Configuration (SCE)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>83</ifr:offset1><ifr:offset2>166</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CUBLOB\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>250</ifr:length><ifr:internalLength1>250</ifr:internalLength1><ifr:internalLength2>500</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>250</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 9, "KBPROFILE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Kbprofile", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "30"}}, "KBPROFILE", 333, 666, -1, 30, 60, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"KBPROFILE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Knowledge-Base Profile</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>333</ifr:offset1><ifr:offset2>666</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CUX_KBPROFILE\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>30</ifr:length><ifr:internalLength1>30</ifr:internalLength1><ifr:internalLength2>60</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>30</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 10, "KBLANGUAGE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Kblanguage", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "KBLANGUAGE", 363, 726, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"KBLANGUAGE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Language of Configuration</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>363</ifr:offset1><ifr:offset2>726</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CUX_KBLANGUAGE\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>LANG</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength><ifr:conversionExit>ISOLA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 11, "CBASE_ID", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cbase_Id", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "32"}}, "CBASE_ID", 364, 728, -1, 32, 64, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CBASE_ID\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Instance Number (Persistent)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>364</ifr:offset1><ifr:offset2>728</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CUX_PERSIST_ID\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>32</ifr:length><ifr:internalLength1>32</ifr:internalLength1><ifr:internalLength2>64</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>32</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 12, "CBASE_ID_TYPE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cbase_Id_Type", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "CBASE_ID_TYPE", 396, 792, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CBASE_ID_TYPE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Instance Number Type (Persistent)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>396</ifr:offset1><ifr:offset2>792</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CUX_PERSIST_ID_TYPE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        staticDescriptor = descriptor;
    }
    public  BapicucfgType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    protected  BapicucfgType (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    
    public java.lang.String getComplete() {
        return (java.lang.String)baseTypeData().getElementValueAsString(6);
    }

    
    public void setConfig_Id(java.lang.String Config_Id) {
        baseTypeData().setElementValue(1, Config_Id);
    }

    
    public java.lang.String getKblanguage() {
        return (java.lang.String)baseTypeData().getElementValueAsString(10);
    }

    
    public java.lang.String getCbase_Id_Type() {
        return (java.lang.String)baseTypeData().getElementValueAsString(12);
    }

    
    public void setSce(java.lang.String Sce) {
        baseTypeData().setElementValue(3, Sce);
    }

    
    public MetaData metadata() {
        return metadata;
    }

    
    public java.lang.String getPosex() {
        return (java.lang.String)baseTypeData().getElementValueAsString(0);
    }

    
    public java.lang.String getConfig_Id() {
        return (java.lang.String)baseTypeData().getElementValueAsString(1);
    }

    
    public java.lang.String getKbname() {
        return (java.lang.String)baseTypeData().getElementValueAsString(4);
    }

    
    public void setPosex(java.lang.String Posex) {
        baseTypeData().setElementValue(0, Posex);
    }

    
    public java.lang.String getKbprofile() {
        return (java.lang.String)baseTypeData().getElementValueAsString(9);
    }

    
    public void setConsistent(java.lang.String Consistent) {
        baseTypeData().setElementValue(7, Consistent);
    }

    
    public java.lang.String getCbase_Id() {
        return (java.lang.String)baseTypeData().getElementValueAsString(11);
    }

    
    public void setRoot_Id(java.lang.String Root_Id) {
        baseTypeData().setElementValue(2, Root_Id);
    }

    
    public void setCbase_Id_Type(java.lang.String Cbase_Id_Type) {
        baseTypeData().setElementValue(12, Cbase_Id_Type);
    }

    
    public void setCfginfo(java.lang.String Cfginfo) {
        baseTypeData().setElementValue(8, Cfginfo);
    }

    
    public java.lang.String getSce() {
        return (java.lang.String)baseTypeData().getElementValueAsString(3);
    }

    
    public java.lang.String getCfginfo() {
        return (java.lang.String)baseTypeData().getElementValueAsString(8);
    }

    
    public void setComplete(java.lang.String Complete) {
        baseTypeData().setElementValue(6, Complete);
    }

    
    public void setCbase_Id(java.lang.String Cbase_Id) {
        baseTypeData().setElementValue(11, Cbase_Id);
    }

    
    public void setKbprofile(java.lang.String Kbprofile) {
        baseTypeData().setElementValue(9, Kbprofile);
    }

    
    public java.lang.String getKbversion() {
        return (java.lang.String)baseTypeData().getElementValueAsString(5);
    }

    
    public java.lang.String getConsistent() {
        return (java.lang.String)baseTypeData().getElementValueAsString(7);
    }

    
    public void setKblanguage(java.lang.String Kblanguage) {
        baseTypeData().setElementValue(10, Kblanguage);
    }

    
    public void setKbversion(java.lang.String Kbversion) {
        baseTypeData().setElementValue(5, Kbversion);
    }

    
    public void setKbname(java.lang.String Kbname) {
        baseTypeData().setElementValue(4, Kbname);
    }

    
    public java.lang.String getRoot_Id() {
        return (java.lang.String)baseTypeData().getElementValueAsString(2);
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  BapicucfgType parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (BapicucfgType parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getComplete() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(6);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getKblanguage() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(10);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCbase_Id_Type() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(12);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSce() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCfginfo() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(8);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPosex() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getConfig_Id() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getKbname() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(4);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getKbversion() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(5);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getConsistent() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(7);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getKbprofile() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(9);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRoot_Id() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCbase_Id() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(11);
        }
    
    }

}
