package hmh.sap.rfc;


public class Bapi_Material_Getall_Output extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1335984408523L) ;

    private  Bapi_Material_Getall_Output.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.WSDL_MESSAGE_FOR_JCO, "urn:sap-com:document:sap:rfc:functions", "BAPI_MATERIAL_GETALL.Output", 18, 0, hmh.sap.rfc.Bapi_Material_Getall_Output.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "BAPI_MATERIAL_GETALL", 0, 0, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Wrapper for BAPI for Reading Material Data</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:package>MGA</ifr:package><ifr:akhNode>HLA0006031</ifr:akhNode><ifr:released>external</ifr:released><ifr:outbound>false</ifr:outbound><ifr:synchronous>true</ifr:synchronous><ifr:asynchronous>false</ifr:asynchronous><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2></ifr:properties><ifr:definition /></ifr:container>");
        descriptorSetElementProperties(descriptor, 0, "CLIENTDATA", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:BAPI_MARA_GA", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Clientdata", hmh.sap.rfc.Bapi_Mara_GaType.class, new hmh.sap.rfc.Bapi_Mara_GaType(), new java.lang.String[][]{}, "CLIENTDATA", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, com.sap.mw.jco.JCO.EXPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"CLIENTDATA\"><ifr:descriptor><ifr:description language=\"en\">Material Data at Client Level</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"BAPI_MARA_GA\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPI_MARA_GA\" /></ifr:definition><ifr:properties><ifr:direction>out</ifr:direction><ifr:class>export</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 1, "FORECASTPARAMETERS", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:BAPI_MPOP_GA", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Forecastparameters", hmh.sap.rfc.Bapi_Mpop_GaType.class, new hmh.sap.rfc.Bapi_Mpop_GaType(), new java.lang.String[][]{}, "FORECASTPARAMETERS", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, com.sap.mw.jco.JCO.EXPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"FORECASTPARAMETERS\"><ifr:descriptor><ifr:description language=\"en\">Forecast Parameters</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"BAPI_MPOP_GA\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPI_MPOP_GA\" /></ifr:definition><ifr:properties><ifr:direction>out</ifr:direction><ifr:class>export</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 2, "LIFOVALUATIONDATA", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:BAPI_MYMS_GA", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Lifovaluationdata", hmh.sap.rfc.Bapi_Myms_GaType.class, new hmh.sap.rfc.Bapi_Myms_GaType(), new java.lang.String[][]{}, "LIFOVALUATIONDATA", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, com.sap.mw.jco.JCO.EXPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"LIFOVALUATIONDATA\"><ifr:descriptor><ifr:description language=\"en\">LIFO-Relevant Material Data</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"BAPI_MYMS_GA\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPI_MYMS_GA\" /></ifr:definition><ifr:properties><ifr:direction>out</ifr:direction><ifr:class>export</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 3, "PLANNINGDATA", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:BAPI_MPGD_GA", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Planningdata", hmh.sap.rfc.Bapi_Mpgd_GaType.class, new hmh.sap.rfc.Bapi_Mpgd_GaType(), new java.lang.String[][]{}, "PLANNINGDATA", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, com.sap.mw.jco.JCO.EXPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"PLANNINGDATA\"><ifr:descriptor><ifr:description language=\"en\">Change Document Structure for Material Master/Product Group</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"BAPI_MPGD_GA\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPI_MPGD_GA\" /></ifr:definition><ifr:properties><ifr:direction>out</ifr:direction><ifr:class>export</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 4, "PLANTDATA", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:BAPI_MARC_GA", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Plantdata", hmh.sap.rfc.Bapi_Marc_GaType.class, new hmh.sap.rfc.Bapi_Marc_GaType(), new java.lang.String[][]{}, "PLANTDATA", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, com.sap.mw.jco.JCO.EXPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"PLANTDATA\"><ifr:descriptor><ifr:description language=\"en\">Material Data at Plant Level</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"BAPI_MARC_GA\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPI_MARC_GA\" /></ifr:definition><ifr:properties><ifr:direction>out</ifr:direction><ifr:class>export</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 5, "PRODUCTIONRESOURCETOOLDATA", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:BAPI_MFHM_GA", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Productionresourcetooldata", hmh.sap.rfc.Bapi_Mfhm_GaType.class, new hmh.sap.rfc.Bapi_Mfhm_GaType(), new java.lang.String[][]{}, "PRODUCTIONRESOURCETOOLDATA", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, com.sap.mw.jco.JCO.EXPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"PRODUCTIONRESOURCETOOLDATA\"><ifr:descriptor><ifr:description language=\"en\">Production Resource Tool (PRT) Fields in the Material Master</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"BAPI_MFHM_GA\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPI_MFHM_GA\" /></ifr:definition><ifr:properties><ifr:direction>out</ifr:direction><ifr:class>export</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 6, "SALESDATA", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:BAPI_MVKE_GA", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Salesdata", hmh.sap.rfc.Bapi_Mvke_GaType.class, new hmh.sap.rfc.Bapi_Mvke_GaType(), new java.lang.String[][]{}, "SALESDATA", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, com.sap.mw.jco.JCO.EXPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"SALESDATA\"><ifr:descriptor><ifr:description language=\"en\">Sales Data</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"BAPI_MVKE_GA\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPI_MVKE_GA\" /></ifr:definition><ifr:properties><ifr:direction>out</ifr:direction><ifr:class>export</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 7, "STORAGELOCATIONDATA", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:BAPI_MARD_GA", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Storagelocationdata", hmh.sap.rfc.Bapi_Mard_GaType.class, new hmh.sap.rfc.Bapi_Mard_GaType(), new java.lang.String[][]{}, "STORAGELOCATIONDATA", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, com.sap.mw.jco.JCO.EXPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"STORAGELOCATIONDATA\"><ifr:descriptor><ifr:description language=\"en\">Material Data at Storage Location Level</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"BAPI_MARD_GA\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPI_MARD_GA\" /></ifr:definition><ifr:properties><ifr:direction>out</ifr:direction><ifr:class>export</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 8, "STORAGETYPEDATA", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:BAPI_MLGT_GA", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Storagetypedata", hmh.sap.rfc.Bapi_Mlgt_GaType.class, new hmh.sap.rfc.Bapi_Mlgt_GaType(), new java.lang.String[][]{}, "STORAGETYPEDATA", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, com.sap.mw.jco.JCO.EXPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"STORAGETYPEDATA\"><ifr:descriptor><ifr:description language=\"en\">Storage type data</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"BAPI_MLGT_GA\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPI_MLGT_GA\" /></ifr:definition><ifr:properties><ifr:direction>out</ifr:direction><ifr:class>export</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 9, "VALUATIONDATA", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:BAPI_MBEW_GA", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Valuationdata", hmh.sap.rfc.Bapi_Mbew_GaType.class, new hmh.sap.rfc.Bapi_Mbew_GaType(), new java.lang.String[][]{}, "VALUATIONDATA", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, com.sap.mw.jco.JCO.EXPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"VALUATIONDATA\"><ifr:descriptor><ifr:description language=\"en\">Valuation Data</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"BAPI_MBEW_GA\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPI_MBEW_GA\" /></ifr:definition><ifr:properties><ifr:direction>out</ifr:direction><ifr:class>export</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 10, "WAREHOUSENUMBERDATA", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:BAPI_MLGN_GA", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Warehousenumberdata", hmh.sap.rfc.Bapi_Mlgn_GaType.class, new hmh.sap.rfc.Bapi_Mlgn_GaType(), new java.lang.String[][]{}, "WAREHOUSENUMBERDATA", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, com.sap.mw.jco.JCO.EXPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"WAREHOUSENUMBERDATA\"><ifr:descriptor><ifr:description language=\"en\">Warehouse Number Data</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"BAPI_MLGN_GA\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPI_MLGN_GA\" /></ifr:definition><ifr:properties><ifr:direction>out</ifr:direction><ifr:class>export</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 11, "UNITSOFMEASURE", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Unitsofmeasure", hmh.sap.rfc.util.Bapi_Marm_GaType_List.class, new hmh.sap.rfc.Bapi_Marm_GaType(), new java.lang.String[][]{}, "UNITSOFMEASURE", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"UNITSOFMEASURE\"><ifr:descriptor><ifr:description language=\"en\">Units of Measure</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"BAPI_MARM_GA\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPI_MARM_GA\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 12, "TAXCLASSIFICATIONS", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Taxclassifications", hmh.sap.rfc.util.Bapi_Mlan_GaType_List.class, new hmh.sap.rfc.Bapi_Mlan_GaType(), new java.lang.String[][]{}, "TAXCLASSIFICATIONS", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"TAXCLASSIFICATIONS\"><ifr:descriptor><ifr:description language=\"en\">Control Data</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"BAPI_MLAN_GA\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPI_MLAN_GA\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 13, "RETURN", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Return", hmh.sap.rfc.util.BapireturnType_List.class, new hmh.sap.rfc.BapireturnType(), new java.lang.String[][]{}, "RETURN", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"RETURN\"><ifr:descriptor><ifr:description language=\"en\">Return Parameters</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"BAPIRETURN\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPIRETURN\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 14, "MATERIALTEXT", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Materialtext", hmh.sap.rfc.util.Bapi_Mltx_GaType_List.class, new hmh.sap.rfc.Bapi_Mltx_GaType(), new java.lang.String[][]{}, "MATERIALTEXT", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"MATERIALTEXT\"><ifr:descriptor><ifr:description language=\"en\">Long Texts</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"BAPI_MLTX_GA\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPI_MLTX_GA\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 15, "MATERIALDESCRIPTION", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Materialdescription", hmh.sap.rfc.util.Bapi_Makt_GaType_List.class, new hmh.sap.rfc.Bapi_Makt_GaType(), new java.lang.String[][]{}, "MATERIALDESCRIPTION", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"MATERIALDESCRIPTION\"><ifr:descriptor><ifr:description language=\"en\">Material Descriptions</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"BAPI_MAKT_GA\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPI_MAKT_GA\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 16, "INTERNATIONARTICLENUMBERS", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Internationarticlenumbers", hmh.sap.rfc.util.Bapi_Mean_GaType_List.class, new hmh.sap.rfc.Bapi_Mean_GaType(), new java.lang.String[][]{}, "INTERNATIONARTICLENUMBERS", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"INTERNATIONARTICLENUMBERS\"><ifr:descriptor><ifr:description language=\"en\">International Article Numbers (EANs)</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"BAPI_MEAN_GA\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPI_MEAN_GA\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 17, "EXTENSIONOUT", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Extensionout", hmh.sap.rfc.util.BapiparexType_List.class, new hmh.sap.rfc.BapiparexType(), new java.lang.String[][]{}, "EXTENSIONOUT", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"EXTENSIONOUT\"><ifr:descriptor><ifr:description language=\"en\">Reference Structure for BAPI Parameters EXTENSIONIN/EXTENSIONOUT</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"BAPIPAREX\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPIPAREX\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        staticDescriptor = descriptor;
    }
    public  Bapi_Material_Getall_Output () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    protected  Bapi_Material_Getall_Output (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    
    public void setPlantdata(hmh.sap.rfc.Bapi_Marc_GaType Plantdata) {
        baseTypeData().setElementValue(4, Plantdata);
    }

    
    public void setInternationarticlenumbers(hmh.sap.rfc.Bapi_Mean_GaType[] Internationarticlenumbers) {
        baseTypeData().setElementValue(16, new hmh.sap.rfc.util.Bapi_Mean_GaType_List());
        hmh.sap.rfc.util.Bapi_Mean_GaType_List list$ = get_as_listInternationarticlenumbers();
        for (int  i$ = 0; i$ < Internationarticlenumbers.length; i$++){
         list$.addBapi_Mean_GaType(Internationarticlenumbers[ i$]);
        }
    }

    
    public void setReturn(hmh.sap.rfc.BapireturnType[] Return) {
        baseTypeData().setElementValue(13, new hmh.sap.rfc.util.BapireturnType_List());
        hmh.sap.rfc.util.BapireturnType_List list$ = get_as_listReturn();
        for (int  i$ = 0; i$ < Return.length; i$++){
         list$.addBapireturnType(Return[ i$]);
        }
    }

    
    public hmh.sap.rfc.Bapi_Mpgd_GaType getPlanningdata() {
        return (hmh.sap.rfc.Bapi_Mpgd_GaType)baseTypeData().getElementValue(3);
    }

    
    public hmh.sap.rfc.Bapi_Mlan_GaType[] getTaxclassifications() {
        hmh.sap.rfc.util.Bapi_Mlan_GaType_List i$ = (hmh.sap.rfc.util.Bapi_Mlan_GaType_List)baseTypeData().getElementValue(12);
        if ( i$ == null){return null;}
        return  i$.toArrayBapi_Mlan_GaType();
    }

    
    public void setUnitsofmeasure(hmh.sap.rfc.util.Bapi_Marm_GaType_List Unitsofmeasure) {
        baseTypeData().setElementValue(11, Unitsofmeasure);
    }

    
    public hmh.sap.rfc.Bapi_Mlgt_GaType getStoragetypedata() {
        return (hmh.sap.rfc.Bapi_Mlgt_GaType)baseTypeData().getElementValue(8);
    }

    
    public void setMaterialdescription(hmh.sap.rfc.Bapi_Makt_GaType[] Materialdescription) {
        baseTypeData().setElementValue(15, new hmh.sap.rfc.util.Bapi_Makt_GaType_List());
        hmh.sap.rfc.util.Bapi_Makt_GaType_List list$ = get_as_listMaterialdescription();
        for (int  i$ = 0; i$ < Materialdescription.length; i$++){
         list$.addBapi_Makt_GaType(Materialdescription[ i$]);
        }
    }

    
    public hmh.sap.rfc.Bapi_Mard_GaType getStoragelocationdata() {
        return (hmh.sap.rfc.Bapi_Mard_GaType)baseTypeData().getElementValue(7);
    }

    
    public void setWarehousenumberdata(hmh.sap.rfc.Bapi_Mlgn_GaType Warehousenumberdata) {
        baseTypeData().setElementValue(10, Warehousenumberdata);
    }

    
    public hmh.sap.rfc.BapireturnType[] getReturn() {
        hmh.sap.rfc.util.BapireturnType_List i$ = (hmh.sap.rfc.util.BapireturnType_List)baseTypeData().getElementValue(13);
        if ( i$ == null){return null;}
        return  i$.toArrayBapireturnType();
    }

    
    public hmh.sap.rfc.Bapi_Mpop_GaType getForecastparameters() {
        return (hmh.sap.rfc.Bapi_Mpop_GaType)baseTypeData().getElementValue(1);
    }

    
    public hmh.sap.rfc.Bapi_Mbew_GaType getValuationdata() {
        return (hmh.sap.rfc.Bapi_Mbew_GaType)baseTypeData().getElementValue(9);
    }

    
    public hmh.sap.rfc.Bapi_Mlgn_GaType getWarehousenumberdata() {
        return (hmh.sap.rfc.Bapi_Mlgn_GaType)baseTypeData().getElementValue(10);
    }

    
    public hmh.sap.rfc.Bapi_Marm_GaType[] getUnitsofmeasure() {
        hmh.sap.rfc.util.Bapi_Marm_GaType_List i$ = (hmh.sap.rfc.util.Bapi_Marm_GaType_List)baseTypeData().getElementValue(11);
        if ( i$ == null){return null;}
        return  i$.toArrayBapi_Marm_GaType();
    }

    
    public void setPlanningdata(hmh.sap.rfc.Bapi_Mpgd_GaType Planningdata) {
        baseTypeData().setElementValue(3, Planningdata);
    }

    
    public void setLifovaluationdata(hmh.sap.rfc.Bapi_Myms_GaType Lifovaluationdata) {
        baseTypeData().setElementValue(2, Lifovaluationdata);
    }

    
    public hmh.sap.rfc.Bapi_Marc_GaType getPlantdata() {
        return (hmh.sap.rfc.Bapi_Marc_GaType)baseTypeData().getElementValue(4);
    }

    
    public void setUnitsofmeasure(hmh.sap.rfc.Bapi_Marm_GaType[] Unitsofmeasure) {
        baseTypeData().setElementValue(11, new hmh.sap.rfc.util.Bapi_Marm_GaType_List());
        hmh.sap.rfc.util.Bapi_Marm_GaType_List list$ = get_as_listUnitsofmeasure();
        for (int  i$ = 0; i$ < Unitsofmeasure.length; i$++){
         list$.addBapi_Marm_GaType(Unitsofmeasure[ i$]);
        }
    }

    
    public hmh.sap.rfc.util.BapireturnType_List get_as_listReturn() {
        return (hmh.sap.rfc.util.BapireturnType_List)baseTypeData().getElementValue(13);
    }

    
    public hmh.sap.rfc.util.Bapi_Marm_GaType_List get_as_listUnitsofmeasure() {
        return (hmh.sap.rfc.util.Bapi_Marm_GaType_List)baseTypeData().getElementValue(11);
    }

    
    public hmh.sap.rfc.BapiparexType[] getExtensionout() {
        hmh.sap.rfc.util.BapiparexType_List i$ = (hmh.sap.rfc.util.BapiparexType_List)baseTypeData().getElementValue(17);
        if ( i$ == null){return null;}
        return  i$.toArrayBapiparexType();
    }

    
    public hmh.sap.rfc.util.Bapi_Mltx_GaType_List get_as_listMaterialtext() {
        return (hmh.sap.rfc.util.Bapi_Mltx_GaType_List)baseTypeData().getElementValue(14);
    }

    
    public hmh.sap.rfc.Bapi_Mvke_GaType getSalesdata() {
        return (hmh.sap.rfc.Bapi_Mvke_GaType)baseTypeData().getElementValue(6);
    }

    
    public void setMaterialtext(hmh.sap.rfc.Bapi_Mltx_GaType[] Materialtext) {
        baseTypeData().setElementValue(14, new hmh.sap.rfc.util.Bapi_Mltx_GaType_List());
        hmh.sap.rfc.util.Bapi_Mltx_GaType_List list$ = get_as_listMaterialtext();
        for (int  i$ = 0; i$ < Materialtext.length; i$++){
         list$.addBapi_Mltx_GaType(Materialtext[ i$]);
        }
    }

    
    public hmh.sap.rfc.Bapi_Mltx_GaType[] getMaterialtext() {
        hmh.sap.rfc.util.Bapi_Mltx_GaType_List i$ = (hmh.sap.rfc.util.Bapi_Mltx_GaType_List)baseTypeData().getElementValue(14);
        if ( i$ == null){return null;}
        return  i$.toArrayBapi_Mltx_GaType();
    }

    
    public void setStoragetypedata(hmh.sap.rfc.Bapi_Mlgt_GaType Storagetypedata) {
        baseTypeData().setElementValue(8, Storagetypedata);
    }

    
    public void setClientdata(hmh.sap.rfc.Bapi_Mara_GaType Clientdata) {
        baseTypeData().setElementValue(0, Clientdata);
    }

    
    public void setReturn(hmh.sap.rfc.util.BapireturnType_List Return) {
        baseTypeData().setElementValue(13, Return);
    }

    
    public void setValuationdata(hmh.sap.rfc.Bapi_Mbew_GaType Valuationdata) {
        baseTypeData().setElementValue(9, Valuationdata);
    }

    
    public void setProductionresourcetooldata(hmh.sap.rfc.Bapi_Mfhm_GaType Productionresourcetooldata) {
        baseTypeData().setElementValue(5, Productionresourcetooldata);
    }

    
    public void setStoragelocationdata(hmh.sap.rfc.Bapi_Mard_GaType Storagelocationdata) {
        baseTypeData().setElementValue(7, Storagelocationdata);
    }

    
    public void setForecastparameters(hmh.sap.rfc.Bapi_Mpop_GaType Forecastparameters) {
        baseTypeData().setElementValue(1, Forecastparameters);
    }

    
    public hmh.sap.rfc.Bapi_Mean_GaType[] getInternationarticlenumbers() {
        hmh.sap.rfc.util.Bapi_Mean_GaType_List i$ = (hmh.sap.rfc.util.Bapi_Mean_GaType_List)baseTypeData().getElementValue(16);
        if ( i$ == null){return null;}
        return  i$.toArrayBapi_Mean_GaType();
    }

    
    public hmh.sap.rfc.Bapi_Myms_GaType getLifovaluationdata() {
        return (hmh.sap.rfc.Bapi_Myms_GaType)baseTypeData().getElementValue(2);
    }

    
    public hmh.sap.rfc.Bapi_Mara_GaType getClientdata() {
        return (hmh.sap.rfc.Bapi_Mara_GaType)baseTypeData().getElementValue(0);
    }

    
    public void setExtensionout(hmh.sap.rfc.util.BapiparexType_List Extensionout) {
        baseTypeData().setElementValue(17, Extensionout);
    }

    
    public hmh.sap.rfc.Bapi_Makt_GaType[] getMaterialdescription() {
        hmh.sap.rfc.util.Bapi_Makt_GaType_List i$ = (hmh.sap.rfc.util.Bapi_Makt_GaType_List)baseTypeData().getElementValue(15);
        if ( i$ == null){return null;}
        return  i$.toArrayBapi_Makt_GaType();
    }

    
    public hmh.sap.rfc.util.Bapi_Mlan_GaType_List get_as_listTaxclassifications() {
        return (hmh.sap.rfc.util.Bapi_Mlan_GaType_List)baseTypeData().getElementValue(12);
    }

    
    public void setInternationarticlenumbers(hmh.sap.rfc.util.Bapi_Mean_GaType_List Internationarticlenumbers) {
        baseTypeData().setElementValue(16, Internationarticlenumbers);
    }

    
    public void setMaterialtext(hmh.sap.rfc.util.Bapi_Mltx_GaType_List Materialtext) {
        baseTypeData().setElementValue(14, Materialtext);
    }

    
    public hmh.sap.rfc.util.Bapi_Mean_GaType_List get_as_listInternationarticlenumbers() {
        return (hmh.sap.rfc.util.Bapi_Mean_GaType_List)baseTypeData().getElementValue(16);
    }

    
    public hmh.sap.rfc.Bapi_Mfhm_GaType getProductionresourcetooldata() {
        return (hmh.sap.rfc.Bapi_Mfhm_GaType)baseTypeData().getElementValue(5);
    }

    
    public void setMaterialdescription(hmh.sap.rfc.util.Bapi_Makt_GaType_List Materialdescription) {
        baseTypeData().setElementValue(15, Materialdescription);
    }

    
    public hmh.sap.rfc.util.Bapi_Makt_GaType_List get_as_listMaterialdescription() {
        return (hmh.sap.rfc.util.Bapi_Makt_GaType_List)baseTypeData().getElementValue(15);
    }

    
    public void setTaxclassifications(hmh.sap.rfc.Bapi_Mlan_GaType[] Taxclassifications) {
        baseTypeData().setElementValue(12, new hmh.sap.rfc.util.Bapi_Mlan_GaType_List());
        hmh.sap.rfc.util.Bapi_Mlan_GaType_List list$ = get_as_listTaxclassifications();
        for (int  i$ = 0; i$ < Taxclassifications.length; i$++){
         list$.addBapi_Mlan_GaType(Taxclassifications[ i$]);
        }
    }

    
    public void setExtensionout(hmh.sap.rfc.BapiparexType[] Extensionout) {
        baseTypeData().setElementValue(17, new hmh.sap.rfc.util.BapiparexType_List());
        hmh.sap.rfc.util.BapiparexType_List list$ = get_as_listExtensionout();
        for (int  i$ = 0; i$ < Extensionout.length; i$++){
         list$.addBapiparexType(Extensionout[ i$]);
        }
    }

    
    public MetaData metadataBapi_Material_Getall_Output() {
        return metadata;
    }

    
    public void setTaxclassifications(hmh.sap.rfc.util.Bapi_Mlan_GaType_List Taxclassifications) {
        baseTypeData().setElementValue(12, Taxclassifications);
    }

    
    public hmh.sap.rfc.util.BapiparexType_List get_as_listExtensionout() {
        return (hmh.sap.rfc.util.BapiparexType_List)baseTypeData().getElementValue(17);
    }

    
    public void setSalesdata(hmh.sap.rfc.Bapi_Mvke_GaType Salesdata) {
        baseTypeData().setElementValue(6, Salesdata);
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  Bapi_Material_Getall_Output parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Bapi_Material_Getall_Output parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPlantdata() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(4);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTaxclassifications() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(12);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPlanningdata() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getStoragetypedata() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(8);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getInternationarticlenumbers() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(16);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getStoragelocationdata() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(7);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getExtensionout() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(17);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getReturn() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(13);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getForecastparameters() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSalesdata() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(6);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getLifovaluationdata() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getClientdata() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getValuationdata() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(9);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMaterialtext() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(14);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMaterialdescription() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(15);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getWarehousenumberdata() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(10);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getProductionresourcetooldata() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(5);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getUnitsofmeasure() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(11);
        }
    
    }

}
