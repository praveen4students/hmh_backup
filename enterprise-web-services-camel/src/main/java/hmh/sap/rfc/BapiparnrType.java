package hmh.sap.rfc;


public class BapiparnrType extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1354127028490L) ;

    private  BapiparnrType.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.XSDL_COMPLEX_TYPE, "urn:sap-com:document:sap:rfc:functions", "BAPIPARNR", 37, 0, hmh.sap.rfc.BapiparnrType.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "BAPIPARNR", 664, 1328, -1, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"BAPIPARNR\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Communications Fields: SD Document Partner: WWW</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>110</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>664</ifr:internalLength1><ifr:internalLength2>1328</ifr:internalLength2></ifr:definition></ifr:container></s0:type>");
        descriptorSetElementProperties(descriptor, 0, "PARTN_ROLE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Partn_Role", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "PARTN_ROLE", 0, 0, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PARTN_ROLE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Partner function</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TPAR</ifr:checkTable><ifr:offset1>0</ifr:offset1><ifr:offset2>0</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PARVW\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength><ifr:conversionExit>PARVW</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 1, "PARTN_NUMB", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Partn_Numb", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "PARTN_NUMB", 2, 4, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PARTN_NUMB\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Customer Number 1</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>KNA1</ifr:checkTable><ifr:offset1>2</ifr:offset1><ifr:offset2>4</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KUNNR\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 2, "ITM_NUMBER", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Itm_Number", java.lang.String.class, null, new java.lang.String[][]{{"pattern", "\\d+"}, {"maxLength", "6"}}, "ITM_NUMBER", 12, 24, -1, 6, 12, -1, com.sap.mw.jco.JCO.TYPE_NUM, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ITM_NUMBER\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Item number of the SD document</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>VBUP</ifr:checkTable><ifr:offset1>12</ifr:offset1><ifr:offset2>24</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"POSNR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>NUMC</ifr:type><ifr:abapType>N</ifr:abapType><ifr:length>6</ifr:length><ifr:internalLength1>6</ifr:internalLength1><ifr:internalLength2>12</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>6</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 3, "TITLE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Title", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "15"}}, "TITLE", 18, 36, -1, 15, 30, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TITLE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Form of address</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>18</ifr:offset1><ifr:offset2>36</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ANRED_VP\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>15</ifr:length><ifr:internalLength1>15</ifr:internalLength1><ifr:internalLength2>30</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>15</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 4, "NAME", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Name", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "35"}}, "NAME", 33, 66, -1, 35, 70, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"NAME\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Name 1</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>33</ifr:offset1><ifr:offset2>66</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"NAME1_GP\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>35</ifr:length><ifr:internalLength1>35</ifr:internalLength1><ifr:internalLength2>70</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>35</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 5, "NAME_2", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Name_2", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "35"}}, "NAME_2", 68, 136, -1, 35, 70, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"NAME_2\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Name 2</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>68</ifr:offset1><ifr:offset2>136</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"NAME2_GP\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>35</ifr:length><ifr:internalLength1>35</ifr:internalLength1><ifr:internalLength2>70</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>35</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 6, "NAME_3", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Name_3", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "35"}}, "NAME_3", 103, 206, -1, 35, 70, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"NAME_3\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Name 3</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>103</ifr:offset1><ifr:offset2>206</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"NAME3_GP\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>35</ifr:length><ifr:internalLength1>35</ifr:internalLength1><ifr:internalLength2>70</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>35</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 7, "NAME_4", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Name_4", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "35"}}, "NAME_4", 138, 276, -1, 35, 70, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"NAME_4\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Name 4</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>138</ifr:offset1><ifr:offset2>276</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"NAME4_GP\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>35</ifr:length><ifr:internalLength1>35</ifr:internalLength1><ifr:internalLength2>70</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>35</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 8, "STREET", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Street", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "35"}}, "STREET", 173, 346, -1, 35, 70, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"STREET\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">House number and street</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>173</ifr:offset1><ifr:offset2>346</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"STRAS_GP\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>35</ifr:length><ifr:internalLength1>35</ifr:internalLength1><ifr:internalLength2>70</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>35</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 9, "COUNTRY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Country", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "COUNTRY", 208, 416, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"COUNTRY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Country Key</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>T005</ifr:checkTable><ifr:offset1>208</ifr:offset1><ifr:offset2>416</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"LAND1\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 10, "COUNTR_ISO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Countr_Iso", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "COUNTR_ISO", 211, 422, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"COUNTR_ISO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Country key in ISO code</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>211</ifr:offset1><ifr:offset2>422</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"LAND1_ISO\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 11, "POSTL_CODE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Postl_Code", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "POSTL_CODE", 213, 426, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"POSTL_CODE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Postal Code</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>213</ifr:offset1><ifr:offset2>426</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PSTLZ\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 12, "POBX_PCD", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Pobx_Pcd", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "POBX_PCD", 223, 446, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"POBX_PCD\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">P.O. Box Postal Code</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>223</ifr:offset1><ifr:offset2>446</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PSTL2\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 13, "POBX_CTY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Pobx_Cty", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "35"}}, "POBX_CTY", 233, 466, -1, 35, 70, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"POBX_CTY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">PO Box city</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>233</ifr:offset1><ifr:offset2>466</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PFORT_GP\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>35</ifr:length><ifr:internalLength1>35</ifr:internalLength1><ifr:internalLength2>70</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>35</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 14, "CITY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "City", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "35"}}, "CITY", 268, 536, -1, 35, 70, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CITY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">City</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>268</ifr:offset1><ifr:offset2>536</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ORT01_GP\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>35</ifr:length><ifr:internalLength1>35</ifr:internalLength1><ifr:internalLength2>70</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>35</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 15, "DISTRICT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "District", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "35"}}, "DISTRICT", 303, 606, -1, 35, 70, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DISTRICT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">District</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>303</ifr:offset1><ifr:offset2>606</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ORT02_GP\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>35</ifr:length><ifr:internalLength1>35</ifr:internalLength1><ifr:internalLength2>70</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>35</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 16, "REGION", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Region", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "REGION", 338, 676, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REGION\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Region (State, Province, County)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>T005S</ifr:checkTable><ifr:offset1>338</ifr:offset1><ifr:offset2>676</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"REGIO\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 17, "PO_BOX", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Po_Box", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "PO_BOX", 341, 682, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PO_BOX\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">PO Box</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>341</ifr:offset1><ifr:offset2>682</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PFACH\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 18, "TELEPHONE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Telephone", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "16"}}, "TELEPHONE", 351, 702, -1, 16, 32, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TELEPHONE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">First telephone number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>351</ifr:offset1><ifr:offset2>702</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"TELF1\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>16</ifr:length><ifr:internalLength1>16</ifr:internalLength1><ifr:internalLength2>32</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>16</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 19, "TELEPHONE2", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Telephone2", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "16"}}, "TELEPHONE2", 367, 734, -1, 16, 32, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TELEPHONE2\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Second telephone number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>367</ifr:offset1><ifr:offset2>734</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"TELF2\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>16</ifr:length><ifr:internalLength1>16</ifr:internalLength1><ifr:internalLength2>32</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>16</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 20, "TELEBOX", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Telebox", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "15"}}, "TELEBOX", 383, 766, -1, 15, 30, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TELEBOX\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Telebox number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>383</ifr:offset1><ifr:offset2>766</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"TELBX\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>15</ifr:length><ifr:internalLength1>15</ifr:internalLength1><ifr:internalLength2>30</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>15</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 21, "FAX_NUMBER", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Fax_Number", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "31"}}, "FAX_NUMBER", 398, 796, -1, 31, 62, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"FAX_NUMBER\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Fax Number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>398</ifr:offset1><ifr:offset2>796</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"TELFX\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>31</ifr:length><ifr:internalLength1>31</ifr:internalLength1><ifr:internalLength2>62</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>31</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 22, "TELETEX_NO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Teletex_No", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "30"}}, "TELETEX_NO", 429, 858, -1, 30, 60, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TELETEX_NO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Teletex number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>429</ifr:offset1><ifr:offset2>858</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"TELTX\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>30</ifr:length><ifr:internalLength1>30</ifr:internalLength1><ifr:internalLength2>60</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>30</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 23, "TELEX_NO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Telex_No", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "30"}}, "TELEX_NO", 459, 918, -1, 30, 60, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TELEX_NO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Telex number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>459</ifr:offset1><ifr:offset2>918</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"TELX1\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>30</ifr:length><ifr:internalLength1>30</ifr:internalLength1><ifr:internalLength2>60</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>30</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 24, "LANGU", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Langu", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "LANGU", 489, 978, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"LANGU\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Language Key</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>T002</ifr:checkTable><ifr:offset1>489</ifr:offset1><ifr:offset2>978</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"SPRAS\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>LANG</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength><ifr:conversionExit>ISOLA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 25, "LANGU_ISO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Langu_Iso", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "LANGU_ISO", 490, 980, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"LANGU_ISO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Language according to ISO 639</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>490</ifr:offset1><ifr:offset2>980</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"LAISO\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 26, "UNLOAD_PT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Unload_Pt", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "25"}}, "UNLOAD_PT", 492, 984, -1, 25, 50, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"UNLOAD_PT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Unloading Point</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>492</ifr:offset1><ifr:offset2>984</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ABLAD\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>25</ifr:length><ifr:internalLength1>25</ifr:internalLength1><ifr:internalLength2>50</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>25</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 27, "TRANSPZONE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Transpzone", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "TRANSPZONE", 517, 1034, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TRANSPZONE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Transportation zone to or from which the goods are delivered</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TZONE</ifr:checkTable><ifr:offset1>517</ifr:offset1><ifr:offset2>1034</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"LZONE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 28, "TAXJURCODE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Taxjurcode", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "15"}}, "TAXJURCODE", 527, 1054, -1, 15, 30, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TAXJURCODE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Jurisdiction for Tax Calculation - Tax Jurisdiction Code</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TTXJ</ifr:checkTable><ifr:offset1>527</ifr:offset1><ifr:offset2>1054</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"TXJCD\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>15</ifr:length><ifr:internalLength1>15</ifr:internalLength1><ifr:internalLength2>30</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>15</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 29, "ADDRESS", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Address", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "ADDRESS", 542, 1084, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ADDRESS\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Address</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>542</ifr:offset1><ifr:offset2>1084</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ADRNR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 30, "PRIV_ADDR", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Priv_Addr", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "PRIV_ADDR", 552, 1104, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PRIV_ADDR\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Home address</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>552</ifr:offset1><ifr:offset2>1104</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ADRNP\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 31, "ADDR_TYPE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Addr_Type", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "ADDR_TYPE", 562, 1124, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ADDR_TYPE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Address type (1=Organization, 2=Person, 3=Contact person)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>562</ifr:offset1><ifr:offset2>1124</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_ADRTYPE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 32, "ADDR_ORIG", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Addr_Orig", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "ADDR_ORIG", 563, 1126, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ADDR_ORIG\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Origin of an address</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>563</ifr:offset1><ifr:offset2>1126</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ADDR_ORIGIN\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 33, "ADDR_LINK", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Addr_Link", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "ADDR_LINK", 564, 1128, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ADDR_LINK\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Link to address number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>564</ifr:offset1><ifr:offset2>1128</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ADDR_LINK\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 34, "REFOBJTYPE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Refobjtype", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "REFOBJTYPE", 574, 1148, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REFOBJTYPE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Object Type</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TOJTB</ifr:checkTable><ifr:offset1>574</ifr:offset1><ifr:offset2>1148</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"SWO_OBJTYP\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 35, "REFOBJKEY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Refobjkey", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "70"}}, "REFOBJKEY", 584, 1168, -1, 70, 140, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REFOBJKEY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Object Key</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>584</ifr:offset1><ifr:offset2>1168</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"SWO_TYPEID\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>70</ifr:length><ifr:internalLength1>70</ifr:internalLength1><ifr:internalLength2>140</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>70</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 36, "REFLOGSYS", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Reflogsys", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "REFLOGSYS", 654, 1308, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REFLOGSYS\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Logical System</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TBDLS</ifr:checkTable><ifr:offset1>654</ifr:offset1><ifr:offset2>1308</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"LOGSYS\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        staticDescriptor = descriptor;
    }
    protected  BapiparnrType (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    public  BapiparnrType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public java.lang.String getTelephone2() {
        return (java.lang.String)baseTypeData().getElementValueAsString(19);
    }

    
    public java.lang.String getPartn_Role() {
        return (java.lang.String)baseTypeData().getElementValueAsString(0);
    }

    
    public java.lang.String getTitle() {
        return (java.lang.String)baseTypeData().getElementValueAsString(3);
    }

    
    public java.lang.String getDistrict() {
        return (java.lang.String)baseTypeData().getElementValueAsString(15);
    }

    
    public java.lang.String getCountry() {
        return (java.lang.String)baseTypeData().getElementValueAsString(9);
    }

    
    public java.lang.String getRegion() {
        return (java.lang.String)baseTypeData().getElementValueAsString(16);
    }

    
    public java.lang.String getTeletex_No() {
        return (java.lang.String)baseTypeData().getElementValueAsString(22);
    }

    
    public java.lang.String getName_3() {
        return (java.lang.String)baseTypeData().getElementValueAsString(6);
    }

    
    public java.lang.String getName() {
        return (java.lang.String)baseTypeData().getElementValueAsString(4);
    }

    
    public void setTeletex_No(java.lang.String Teletex_No) {
        baseTypeData().setElementValue(22, Teletex_No);
    }

    
    public void setTelephone2(java.lang.String Telephone2) {
        baseTypeData().setElementValue(19, Telephone2);
    }

    
    public void setName_2(java.lang.String Name_2) {
        baseTypeData().setElementValue(5, Name_2);
    }

    
    public void setAddr_Orig(java.lang.String Addr_Orig) {
        baseTypeData().setElementValue(32, Addr_Orig);
    }

    
    public void setLangu_Iso(java.lang.String Langu_Iso) {
        baseTypeData().setElementValue(25, Langu_Iso);
    }

    
    public void setItm_Number(java.lang.String Itm_Number) {
        baseTypeData().setElementValue(2, Itm_Number);
    }

    
    public void setReflogsys(java.lang.String Reflogsys) {
        baseTypeData().setElementValue(36, Reflogsys);
    }

    
    public void setTelephone(java.lang.String Telephone) {
        baseTypeData().setElementValue(18, Telephone);
    }

    
    public java.lang.String getTelebox() {
        return (java.lang.String)baseTypeData().getElementValueAsString(20);
    }

    
    public void setPriv_Addr(java.lang.String Priv_Addr) {
        baseTypeData().setElementValue(30, Priv_Addr);
    }

    
    public void setCountr_Iso(java.lang.String Countr_Iso) {
        baseTypeData().setElementValue(10, Countr_Iso);
    }

    
    public void setTranspzone(java.lang.String Transpzone) {
        baseTypeData().setElementValue(27, Transpzone);
    }

    
    public void setUnload_Pt(java.lang.String Unload_Pt) {
        baseTypeData().setElementValue(26, Unload_Pt);
    }

    
    public java.lang.String getName_2() {
        return (java.lang.String)baseTypeData().getElementValueAsString(5);
    }

    
    public void setName(java.lang.String Name) {
        baseTypeData().setElementValue(4, Name);
    }

    
    public java.lang.String getAddr_Link() {
        return (java.lang.String)baseTypeData().getElementValueAsString(33);
    }

    
    public java.lang.String getTranspzone() {
        return (java.lang.String)baseTypeData().getElementValueAsString(27);
    }

    
    public void setPartn_Role(java.lang.String Partn_Role) {
        baseTypeData().setElementValue(0, Partn_Role);
    }

    
    public java.lang.String getLangu() {
        return (java.lang.String)baseTypeData().getElementValueAsString(24);
    }

    
    public java.lang.String getLangu_Iso() {
        return (java.lang.String)baseTypeData().getElementValueAsString(25);
    }

    
    public void setLangu(java.lang.String Langu) {
        baseTypeData().setElementValue(24, Langu);
    }

    
    public java.lang.String getPartn_Numb() {
        return (java.lang.String)baseTypeData().getElementValueAsString(1);
    }

    
    public void setPobx_Pcd(java.lang.String Pobx_Pcd) {
        baseTypeData().setElementValue(12, Pobx_Pcd);
    }

    
    public void setCountry(java.lang.String Country) {
        baseTypeData().setElementValue(9, Country);
    }

    
    public void setPo_Box(java.lang.String Po_Box) {
        baseTypeData().setElementValue(17, Po_Box);
    }

    
    public java.lang.String getReflogsys() {
        return (java.lang.String)baseTypeData().getElementValueAsString(36);
    }

    
    public void setPostl_Code(java.lang.String Postl_Code) {
        baseTypeData().setElementValue(11, Postl_Code);
    }

    
    public void setRegion(java.lang.String Region) {
        baseTypeData().setElementValue(16, Region);
    }

    
    public java.lang.String getAddress() {
        return (java.lang.String)baseTypeData().getElementValueAsString(29);
    }

    
    public java.lang.String getTaxjurcode() {
        return (java.lang.String)baseTypeData().getElementValueAsString(28);
    }

    
    public void setPartn_Numb(java.lang.String Partn_Numb) {
        baseTypeData().setElementValue(1, Partn_Numb);
    }

    
    public MetaData metadata() {
        return metadata;
    }

    
    public java.lang.String getPostl_Code() {
        return (java.lang.String)baseTypeData().getElementValueAsString(11);
    }

    
    public void setRefobjkey(java.lang.String Refobjkey) {
        baseTypeData().setElementValue(35, Refobjkey);
    }

    
    public java.lang.String getRefobjtype() {
        return (java.lang.String)baseTypeData().getElementValueAsString(34);
    }

    
    public void setAddr_Link(java.lang.String Addr_Link) {
        baseTypeData().setElementValue(33, Addr_Link);
    }

    
    public java.lang.String getFax_Number() {
        return (java.lang.String)baseTypeData().getElementValueAsString(21);
    }

    
    public void setTelex_No(java.lang.String Telex_No) {
        baseTypeData().setElementValue(23, Telex_No);
    }

    
    public void setFax_Number(java.lang.String Fax_Number) {
        baseTypeData().setElementValue(21, Fax_Number);
    }

    
    public java.lang.String getPobx_Cty() {
        return (java.lang.String)baseTypeData().getElementValueAsString(13);
    }

    
    public java.lang.String getCountr_Iso() {
        return (java.lang.String)baseTypeData().getElementValueAsString(10);
    }

    
    public void setDistrict(java.lang.String District) {
        baseTypeData().setElementValue(15, District);
    }

    
    public java.lang.String getPriv_Addr() {
        return (java.lang.String)baseTypeData().getElementValueAsString(30);
    }

    
    public void setAddress(java.lang.String Address) {
        baseTypeData().setElementValue(29, Address);
    }

    
    public void setStreet(java.lang.String Street) {
        baseTypeData().setElementValue(8, Street);
    }

    
    public void setTaxjurcode(java.lang.String Taxjurcode) {
        baseTypeData().setElementValue(28, Taxjurcode);
    }

    
    public java.lang.String getPobx_Pcd() {
        return (java.lang.String)baseTypeData().getElementValueAsString(12);
    }

    
    public java.lang.String getRefobjkey() {
        return (java.lang.String)baseTypeData().getElementValueAsString(35);
    }

    
    public void setName_4(java.lang.String Name_4) {
        baseTypeData().setElementValue(7, Name_4);
    }

    
    public void setName_3(java.lang.String Name_3) {
        baseTypeData().setElementValue(6, Name_3);
    }

    
    public void setRefobjtype(java.lang.String Refobjtype) {
        baseTypeData().setElementValue(34, Refobjtype);
    }

    
    public void setTitle(java.lang.String Title) {
        baseTypeData().setElementValue(3, Title);
    }

    
    public java.lang.String getTelex_No() {
        return (java.lang.String)baseTypeData().getElementValueAsString(23);
    }

    
    public java.lang.String getAddr_Type() {
        return (java.lang.String)baseTypeData().getElementValueAsString(31);
    }

    
    public void setCity(java.lang.String City) {
        baseTypeData().setElementValue(14, City);
    }

    
    public java.lang.String getTelephone() {
        return (java.lang.String)baseTypeData().getElementValueAsString(18);
    }

    
    public void setAddr_Type(java.lang.String Addr_Type) {
        baseTypeData().setElementValue(31, Addr_Type);
    }

    
    public java.lang.String getUnload_Pt() {
        return (java.lang.String)baseTypeData().getElementValueAsString(26);
    }

    
    public java.lang.String getItm_Number() {
        return (java.lang.String)baseTypeData().getElementValueAsString(2);
    }

    
    public java.lang.String getStreet() {
        return (java.lang.String)baseTypeData().getElementValueAsString(8);
    }

    
    public void setTelebox(java.lang.String Telebox) {
        baseTypeData().setElementValue(20, Telebox);
    }

    
    public java.lang.String getAddr_Orig() {
        return (java.lang.String)baseTypeData().getElementValueAsString(32);
    }

    
    public java.lang.String getName_4() {
        return (java.lang.String)baseTypeData().getElementValueAsString(7);
    }

    
    public java.lang.String getCity() {
        return (java.lang.String)baseTypeData().getElementValueAsString(14);
    }

    
    public java.lang.String getPo_Box() {
        return (java.lang.String)baseTypeData().getElementValueAsString(17);
    }

    
    public void setPobx_Cty(java.lang.String Pobx_Cty) {
        baseTypeData().setElementValue(13, Pobx_Cty);
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  BapiparnrType parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (BapiparnrType parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTelephone2() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(19);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getReflogsys() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(36);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTitle() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPartn_Role() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getAddress() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(29);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDistrict() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(15);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTaxjurcode() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(28);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPostl_Code() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(11);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRefobjtype() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(34);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCountry() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(9);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRegion() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(16);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getFax_Number() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(21);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTeletex_No() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(22);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getName_3() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(6);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getName() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(4);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPobx_Cty() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(13);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCountr_Iso() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(10);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPriv_Addr() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(30);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPobx_Pcd() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(12);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRefobjkey() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(35);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTelebox() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(20);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTelex_No() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(23);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getAddr_Type() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(31);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getName_2() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(5);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTelephone() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(18);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getUnload_Pt() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(26);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getItm_Number() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getAddr_Link() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(33);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTranspzone() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(27);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getStreet() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(8);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getLangu() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(24);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getAddr_Orig() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(32);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getLangu_Iso() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(25);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getName_4() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(7);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCity() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(14);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPo_Box() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(17);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPartn_Numb() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
    }

}
