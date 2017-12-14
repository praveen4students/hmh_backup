package hmh.sap.rfc;


public class Z_Rfc_Get_Material_Detail_Atp_Input extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1329337306544L) ;

    private  Z_Rfc_Get_Material_Detail_Atp_Input.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.WSDL_MESSAGE_FOR_JCO, "urn:sap-com:document:sap:rfc:functions", "Z_RFC_GET_MATERIAL_DETAIL_ATP.Input", 14, 0, hmh.sap.rfc.Z_Rfc_Get_Material_Detail_Atp_Input.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "Z_RFC_GET_MATERIAL_DETAIL_ATP", 0, 0, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">To get the material details</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:package>ZVBD</ifr:package><ifr:akhNode>HLA0009600</ifr:akhNode><ifr:released>no</ifr:released><ifr:outbound>false</ifr:outbound><ifr:synchronous>true</ifr:synchronous><ifr:asynchronous>false</ifr:asynchronous><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2></ifr:properties><ifr:definition /></ifr:container>");
        descriptorSetElementProperties(descriptor, 0, "COUNTRY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Country", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "COUNTRY", 0, 0, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"COUNTRY\"><ifr:descriptor><ifr:description language=\"en\">Country Key</ifr:description></ifr:descriptor><ifr:definition><ifr:field name=\"KNA1.LAND1\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>T005</ifr:checkTable><ifr:offset1>13</ifr:offset1><ifr:offset2>26</ifr:offset2></ifr:properties></ifr:field><ifr:scalarType name=\"LAND1_GP\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 1, "CUST_ID", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cust_Id", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "CUST_ID", 0, 0, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"CUST_ID\"><ifr:descriptor><ifr:description language=\"en\">Customer Number 1</ifr:description></ifr:descriptor><ifr:definition><ifr:field name=\"KNA1.KUNNR\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>3</ifr:offset1><ifr:offset2>6</ifr:offset2></ifr:properties></ifr:field><ifr:scalarType name=\"KUNNR\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 2, "DIST_CHNL", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Dist_Chnl", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "DIST_CHNL", 0, 0, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"DIST_CHNL\"><ifr:descriptor><ifr:description language=\"en\">Distribution Channel</ifr:description></ifr:descriptor><ifr:definition><ifr:scalarType name=\"VTWEG\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 3, "DIVISION", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Division", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "DIVISION", 0, 0, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"DIVISION\"><ifr:descriptor><ifr:description language=\"en\">Division</ifr:description></ifr:descriptor><ifr:definition><ifr:field name=\"VBAK.SPART\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TVTA</ifr:checkTable><ifr:offset1>113</ifr:offset1><ifr:offset2>218</ifr:offset2></ifr:properties></ifr:field><ifr:scalarType name=\"SPART\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 4, "ITEM_TYPE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Item_Type", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "ITEM_TYPE", 0, 0, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"ITEM_TYPE\"><ifr:descriptor><ifr:description language=\"en\">Sales document item category</ifr:description></ifr:descriptor><ifr:definition><ifr:field name=\"VBAP.PSTYV\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TVPT</ifr:checkTable><ifr:offset1>132</ifr:offset1><ifr:offset2>264</ifr:offset2></ifr:properties></ifr:field><ifr:scalarType name=\"PSTYV\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 5, "ORDER_TYPE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Order_Type", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "ORDER_TYPE", 0, 0, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"ORDER_TYPE\"><ifr:descriptor><ifr:description language=\"en\">Sales Document Type</ifr:description></ifr:descriptor><ifr:definition><ifr:field name=\"VBAK.AUART\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TVAK</ifr:checkTable><ifr:offset1>65</ifr:offset1><ifr:offset2>130</ifr:offset2></ifr:properties></ifr:field><ifr:scalarType name=\"AUART\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength><ifr:conversionExit>AUART</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 6, "REGION", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Region", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "REGION", 0, 0, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"REGION\"><ifr:descriptor><ifr:description language=\"en\">Region (State, Province, County)</ifr:description></ifr:descriptor><ifr:definition><ifr:field name=\"KNA1.REGIO\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>T005S</ifr:checkTable><ifr:offset1>131</ifr:offset1><ifr:offset2>262</ifr:offset2></ifr:properties></ifr:field><ifr:scalarType name=\"REGIO\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 7, "SALES_ORG", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Sales_Org", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "SALES_ORG", 0, 0, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"SALES_ORG\"><ifr:descriptor><ifr:description language=\"en\">Sales Organization</ifr:description></ifr:descriptor><ifr:definition><ifr:scalarType name=\"VKORG\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 8, "I_SUBSCRIPTION", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "I_Subscription", hmh.sap.rfc.util.ZsubsType_List.class, new hmh.sap.rfc.ZsubsType(), new java.lang.String[][]{}, "I_SUBSCRIPTION", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"I_SUBSCRIPTION\"><ifr:descriptor><ifr:description language=\"en\">For subscription terms</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZSUBS\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZSUBS\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 9, "I_MATERIAL_NUMBER", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "I_Material_Number", hmh.sap.rfc.util.ZmatnrType_List.class, new hmh.sap.rfc.ZmatnrType(), new java.lang.String[][]{}, "I_MATERIAL_NUMBER", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"I_MATERIAL_NUMBER\"><ifr:descriptor><ifr:description language=\"en\">Table Type for Materials</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZMATNR\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZMATNR\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 10, "I_MATERIAL_DETAIL", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "I_Material_Detail", hmh.sap.rfc.util.Zmaterial_DetailsType_List.class, new hmh.sap.rfc.Zmaterial_DetailsType(), new java.lang.String[][]{}, "I_MATERIAL_DETAIL", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"I_MATERIAL_DETAIL\"><ifr:descriptor><ifr:description language=\"en\">Material Details</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZMATERIAL_DETAILS\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZMATERIAL_DETAILS\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 11, "I_ISBN", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "I_Isbn", hmh.sap.rfc.util.Zident_CodeType_List.class, new hmh.sap.rfc.Zident_CodeType(), new java.lang.String[][]{}, "I_ISBN", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"I_ISBN\"><ifr:descriptor><ifr:description language=\"en\">Table Type for ISMIDENTCODE</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZIDENT_CODE\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZIDENT_CODE\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 12, "I_ERROR_MSGS", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "I_Error_Msgs", hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List.class, new hmh.sap.rfc.Zbdcmsgcoll_RfcType(), new java.lang.String[][]{}, "I_ERROR_MSGS", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"I_ERROR_MSGS\"><ifr:descriptor><ifr:description language=\"en\">Message Table in Transaction</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZBDCMSGCOLL_RFC\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZBDCMSGCOLL_RFC\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 13, "I_COMPONENTS", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "I_Components", hmh.sap.rfc.util.ZcompType_List.class, new hmh.sap.rfc.ZcompType(), new java.lang.String[][]{}, "I_COMPONENTS", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"I_COMPONENTS\"><ifr:descriptor><ifr:description language=\"en\">To hold the components of a material</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZCOMP\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZCOMP\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        staticDescriptor = descriptor;
    }
    protected  Z_Rfc_Get_Material_Detail_Atp_Input (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    public  Z_Rfc_Get_Material_Detail_Atp_Input () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List get_as_listI_Error_Msgs() {
        return (hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List)baseTypeData().getElementValue(12);
    }

    
    public void setCountry(java.lang.String Country) {
        baseTypeData().setElementValue(0, Country);
    }

    
    public java.lang.String getDivision() {
        return (java.lang.String)baseTypeData().getElementValueAsString(3);
    }

    
    public void setI_Subscription(hmh.sap.rfc.ZsubsType[] I_Subscription) {
        baseTypeData().setElementValue(8, new hmh.sap.rfc.util.ZsubsType_List());
        hmh.sap.rfc.util.ZsubsType_List list$ = get_as_listI_Subscription();
        for (int  i$ = 0; i$ < I_Subscription.length; i$++){
         list$.addZsubsType(I_Subscription[ i$]);
        }
    }

    
    public java.lang.String getItem_Type() {
        return (java.lang.String)baseTypeData().getElementValueAsString(4);
    }

    
    public java.lang.String getCust_Id() {
        return (java.lang.String)baseTypeData().getElementValueAsString(1);
    }

    
    public void setI_Components(hmh.sap.rfc.util.ZcompType_List I_Components) {
        baseTypeData().setElementValue(13, I_Components);
    }

    
    public void setRegion(java.lang.String Region) {
        baseTypeData().setElementValue(6, Region);
    }

    
    public hmh.sap.rfc.Zbdcmsgcoll_RfcType[] getI_Error_Msgs() {
        hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List i$ = (hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List)baseTypeData().getElementValue(12);
        if ( i$ == null){return null;}
        return  i$.toArrayZbdcmsgcoll_RfcType();
    }

    
    public hmh.sap.rfc.ZmatnrType[] getI_Material_Number() {
        hmh.sap.rfc.util.ZmatnrType_List i$ = (hmh.sap.rfc.util.ZmatnrType_List)baseTypeData().getElementValue(9);
        if ( i$ == null){return null;}
        return  i$.toArrayZmatnrType();
    }

    
    public MetaData metadataZ_Rfc_Get_Material_Detail_Atp_Input() {
        return metadata;
    }

    
    public hmh.sap.rfc.util.Zident_CodeType_List get_as_listI_Isbn() {
        return (hmh.sap.rfc.util.Zident_CodeType_List)baseTypeData().getElementValue(11);
    }

    
    public java.lang.String getRegion() {
        return (java.lang.String)baseTypeData().getElementValueAsString(6);
    }

    
    public java.lang.String getCountry() {
        return (java.lang.String)baseTypeData().getElementValueAsString(0);
    }

    
    public void setSales_Org(java.lang.String Sales_Org) {
        baseTypeData().setElementValue(7, Sales_Org);
    }

    
    public hmh.sap.rfc.Zmaterial_DetailsType[] getI_Material_Detail() {
        hmh.sap.rfc.util.Zmaterial_DetailsType_List i$ = (hmh.sap.rfc.util.Zmaterial_DetailsType_List)baseTypeData().getElementValue(10);
        if ( i$ == null){return null;}
        return  i$.toArrayZmaterial_DetailsType();
    }

    
    public void setI_Material_Detail(hmh.sap.rfc.Zmaterial_DetailsType[] I_Material_Detail) {
        baseTypeData().setElementValue(10, new hmh.sap.rfc.util.Zmaterial_DetailsType_List());
        hmh.sap.rfc.util.Zmaterial_DetailsType_List list$ = get_as_listI_Material_Detail();
        for (int  i$ = 0; i$ < I_Material_Detail.length; i$++){
         list$.addZmaterial_DetailsType(I_Material_Detail[ i$]);
        }
    }

    
    public void setItem_Type(java.lang.String Item_Type) {
        baseTypeData().setElementValue(4, Item_Type);
    }

    
    public void setI_Isbn(hmh.sap.rfc.util.Zident_CodeType_List I_Isbn) {
        baseTypeData().setElementValue(11, I_Isbn);
    }

    
    public void setI_Components(hmh.sap.rfc.ZcompType[] I_Components) {
        baseTypeData().setElementValue(13, new hmh.sap.rfc.util.ZcompType_List());
        hmh.sap.rfc.util.ZcompType_List list$ = get_as_listI_Components();
        for (int  i$ = 0; i$ < I_Components.length; i$++){
         list$.addZcompType(I_Components[ i$]);
        }
    }

    
    public void setI_Material_Detail(hmh.sap.rfc.util.Zmaterial_DetailsType_List I_Material_Detail) {
        baseTypeData().setElementValue(10, I_Material_Detail);
    }

    
    public java.lang.String getDist_Chnl() {
        return (java.lang.String)baseTypeData().getElementValueAsString(2);
    }

    
    public hmh.sap.rfc.util.Zmaterial_DetailsType_List get_as_listI_Material_Detail() {
        return (hmh.sap.rfc.util.Zmaterial_DetailsType_List)baseTypeData().getElementValue(10);
    }

    
    public hmh.sap.rfc.Zident_CodeType[] getI_Isbn() {
        hmh.sap.rfc.util.Zident_CodeType_List i$ = (hmh.sap.rfc.util.Zident_CodeType_List)baseTypeData().getElementValue(11);
        if ( i$ == null){return null;}
        return  i$.toArrayZident_CodeType();
    }

    
    public hmh.sap.rfc.util.ZmatnrType_List get_as_listI_Material_Number() {
        return (hmh.sap.rfc.util.ZmatnrType_List)baseTypeData().getElementValue(9);
    }

    
    public hmh.sap.rfc.ZsubsType[] getI_Subscription() {
        hmh.sap.rfc.util.ZsubsType_List i$ = (hmh.sap.rfc.util.ZsubsType_List)baseTypeData().getElementValue(8);
        if ( i$ == null){return null;}
        return  i$.toArrayZsubsType();
    }

    
    public hmh.sap.rfc.util.ZsubsType_List get_as_listI_Subscription() {
        return (hmh.sap.rfc.util.ZsubsType_List)baseTypeData().getElementValue(8);
    }

    
    public void setI_Isbn(hmh.sap.rfc.Zident_CodeType[] I_Isbn) {
        baseTypeData().setElementValue(11, new hmh.sap.rfc.util.Zident_CodeType_List());
        hmh.sap.rfc.util.Zident_CodeType_List list$ = get_as_listI_Isbn();
        for (int  i$ = 0; i$ < I_Isbn.length; i$++){
         list$.addZident_CodeType(I_Isbn[ i$]);
        }
    }

    
    public void setI_Subscription(hmh.sap.rfc.util.ZsubsType_List I_Subscription) {
        baseTypeData().setElementValue(8, I_Subscription);
    }

    
    public java.lang.String getOrder_Type() {
        return (java.lang.String)baseTypeData().getElementValueAsString(5);
    }

    
    public void setI_Material_Number(hmh.sap.rfc.util.ZmatnrType_List I_Material_Number) {
        baseTypeData().setElementValue(9, I_Material_Number);
    }

    
    public void setCust_Id(java.lang.String Cust_Id) {
        baseTypeData().setElementValue(1, Cust_Id);
    }

    
    public void setOrder_Type(java.lang.String Order_Type) {
        baseTypeData().setElementValue(5, Order_Type);
    }

    
    public void setDivision(java.lang.String Division) {
        baseTypeData().setElementValue(3, Division);
    }

    
    public void setI_Error_Msgs(hmh.sap.rfc.Zbdcmsgcoll_RfcType[] I_Error_Msgs) {
        baseTypeData().setElementValue(12, new hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List());
        hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List list$ = get_as_listI_Error_Msgs();
        for (int  i$ = 0; i$ < I_Error_Msgs.length; i$++){
         list$.addZbdcmsgcoll_RfcType(I_Error_Msgs[ i$]);
        }
    }

    
    public hmh.sap.rfc.ZcompType[] getI_Components() {
        hmh.sap.rfc.util.ZcompType_List i$ = (hmh.sap.rfc.util.ZcompType_List)baseTypeData().getElementValue(13);
        if ( i$ == null){return null;}
        return  i$.toArrayZcompType();
    }

    
    public void setI_Error_Msgs(hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List I_Error_Msgs) {
        baseTypeData().setElementValue(12, I_Error_Msgs);
    }

    
    public hmh.sap.rfc.util.ZcompType_List get_as_listI_Components() {
        return (hmh.sap.rfc.util.ZcompType_List)baseTypeData().getElementValue(13);
    }

    
    public void setDist_Chnl(java.lang.String Dist_Chnl) {
        baseTypeData().setElementValue(2, Dist_Chnl);
    }

    
    public java.lang.String getSales_Org() {
        return (java.lang.String)baseTypeData().getElementValueAsString(7);
    }

    
    public void setI_Material_Number(hmh.sap.rfc.ZmatnrType[] I_Material_Number) {
        baseTypeData().setElementValue(9, new hmh.sap.rfc.util.ZmatnrType_List());
        hmh.sap.rfc.util.ZmatnrType_List list$ = get_as_listI_Material_Number();
        for (int  i$ = 0; i$ < I_Material_Number.length; i$++){
         list$.addZmatnrType(I_Material_Number[ i$]);
        }
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  Z_Rfc_Get_Material_Detail_Atp_Input parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Z_Rfc_Get_Material_Detail_Atp_Input parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getI_Subscription() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(8);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDivision() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getItem_Type() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(4);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCust_Id() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getOrder_Type() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(5);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getI_Error_Msgs() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(12);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getI_Material_Number() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(9);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCountry() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRegion() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(6);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getI_Components() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(13);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getI_Material_Detail() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(10);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDist_Chnl() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSales_Org() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(7);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getI_Isbn() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(11);
        }
    
    }

}
