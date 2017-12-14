package hmh.sap.rfc;


public class Bapi_Material_Availability_Input extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1335986080128L) ;

    private  Bapi_Material_Availability_Input.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.WSDL_MESSAGE_FOR_JCO, "urn:sap-com:document:sap:rfc:functions", "BAPI_MATERIAL_AVAILABILITY.Input", 17, 0, hmh.sap.rfc.Bapi_Material_Availability_Input.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "BAPI_MATERIAL_AVAILABILITY", 0, 0, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">ATP information</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:package>MDW1</ifr:package><ifr:akhNode>HLA0006562</ifr:akhNode><ifr:released>external</ifr:released><ifr:outbound>false</ifr:outbound><ifr:synchronous>true</ifr:synchronous><ifr:asynchronous>false</ifr:asynchronous><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2></ifr:properties><ifr:definition /></ifr:container>");
        descriptorSetElementProperties(descriptor, 0, "BATCH", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Batch", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "BATCH", 0, 0, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"BATCH\"><ifr:descriptor><ifr:description language=\"en\">Batch</ifr:description></ifr:descriptor><ifr:definition><ifr:field name=\"BAPICM61V.CHARG\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>9</ifr:offset1><ifr:offset2>18</ifr:offset2></ifr:properties></ifr:field><ifr:scalarType name=\"CHARG_D\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 1, "CHECK_RULE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Check_Rule", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "CHECK_RULE", 0, 0, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"CHECK_RULE\"><ifr:descriptor><ifr:description language=\"en\">Checking rule</ifr:description></ifr:descriptor><ifr:definition><ifr:field name=\"BAPIT441V.PRREG\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>T441R</ifr:checkTable><ifr:offset1>5</ifr:offset1><ifr:offset2>10</ifr:offset2></ifr:properties></ifr:field><ifr:scalarType name=\"PRREG\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 2, "CUSTOMER", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Customer", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "CUSTOMER", 0, 0, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"CUSTOMER\"><ifr:descriptor><ifr:description language=\"en\">Customer number</ifr:description></ifr:descriptor><ifr:definition><ifr:field name=\"BAPIKNVVKY.CUSTOMER\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>KNA1</ifr:checkTable><ifr:offset1>0</ifr:offset1><ifr:offset2>0</ifr:offset2></ifr:properties></ifr:field><ifr:scalarType name=\"KUNNR\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 3, "DEC_FOR_ROUNDING", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:short", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Dec_For_Rounding", java.lang.Short.class, null, new java.lang.String[][]{}, "DEC_FOR_ROUNDING", 0, 0, -1, 2, 2, -1, com.sap.mw.jco.JCO.TYPE_INT2, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"DEC_FOR_ROUNDING\"><ifr:descriptor><ifr:description language=\"en\">No. of decimal places to which rounding should be performed</ifr:description></ifr:descriptor><ifr:definition><ifr:field name=\"BAPICM61M.ANDEC\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>6</ifr:offset1><ifr:offset2>10</ifr:offset2></ifr:properties></ifr:field><ifr:scalarType name=\"ANDEC\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>true</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>INT2</ifr:type><ifr:abapType>s</ifr:abapType><ifr:length>5</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 4, "DEC_FOR_ROUNDING_X", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Dec_For_Rounding_X", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "DEC_FOR_ROUNDING_X", 0, 0, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"DEC_FOR_ROUNDING_X\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 5, "DOC_NUMBER", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Doc_Number", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "DOC_NUMBER", 0, 0, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"DOC_NUMBER\"><ifr:descriptor><ifr:description language=\"en\">Document number</ifr:description></ifr:descriptor><ifr:definition><ifr:field name=\"BAPISDHEAD.DOC_NUMBER\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>VBUK</ifr:checkTable><ifr:offset1>0</ifr:offset1><ifr:offset2>0</ifr:offset2></ifr:properties></ifr:field><ifr:scalarType name=\"VBELN_VA\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 6, "ITM_NUMBER", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Itm_Number", java.lang.String.class, null, new java.lang.String[][]{{"pattern", "\\d+"}, {"maxLength", "6"}}, "ITM_NUMBER", 0, 0, -1, 6, 12, -1, com.sap.mw.jco.JCO.TYPE_NUM, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"ITM_NUMBER\"><ifr:descriptor><ifr:description language=\"en\">Item number</ifr:description></ifr:descriptor><ifr:definition><ifr:field name=\"BAPISDITM.ITM_NUMBER\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>VBUP</ifr:checkTable><ifr:offset1>0</ifr:offset1><ifr:offset2>0</ifr:offset2></ifr:properties></ifr:field><ifr:scalarType name=\"POSNR_VA\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>NUMC</ifr:type><ifr:abapType>N</ifr:abapType><ifr:length>6</ifr:length><ifr:internalLength1>6</ifr:internalLength1><ifr:internalLength2>12</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>6</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 7, "MATERIAL", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 1, 1, false, null, "Material", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "18"}}, "MATERIAL", 0, 0, -1, 18, 36, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"MATERIAL\"><ifr:descriptor><ifr:description language=\"en\">Material number</ifr:description></ifr:descriptor><ifr:definition><ifr:field name=\"BAPIMATVP.MATNR\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>0</ifr:offset1><ifr:offset2>0</ifr:offset2></ifr:properties></ifr:field><ifr:scalarType name=\"MATNR\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>18</ifr:length><ifr:internalLength1>18</ifr:internalLength1><ifr:internalLength2>36</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>18</ifr:outputLength><ifr:conversionExit>MATN1</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 8, "PLANT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 1, 1, false, null, "Plant", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "PLANT", 0, 0, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"PLANT\"><ifr:descriptor><ifr:description language=\"en\">Plant</ifr:description></ifr:descriptor><ifr:definition><ifr:field name=\"BAPIMATVP.WERKS\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>T001W</ifr:checkTable><ifr:offset1>18</ifr:offset1><ifr:offset2>36</ifr:offset2></ifr:properties></ifr:field><ifr:scalarType name=\"WERKS_D\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 9, "READ_ATP_LOCK", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Read_Atp_Lock", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "READ_ATP_LOCK", 0, 0, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"READ_ATP_LOCK\"><ifr:descriptor><ifr:description language=\"en\">Control indicator for availability check</ifr:description></ifr:descriptor><ifr:definition><ifr:field name=\"BAPICM61V.VFPST\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>0</ifr:offset1><ifr:offset2>0</ifr:offset2></ifr:properties></ifr:field><ifr:scalarType name=\"VFPST\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 10, "READ_ATP_LOCK_X", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Read_Atp_Lock_X", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "READ_ATP_LOCK_X", 0, 0, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"READ_ATP_LOCK_X\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 11, "STGE_LOC", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Stge_Loc", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "STGE_LOC", 0, 0, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"STGE_LOC\"><ifr:descriptor><ifr:description language=\"en\">Storage location</ifr:description></ifr:descriptor><ifr:definition><ifr:field name=\"BAPICM61V.LGORT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>5</ifr:offset1><ifr:offset2>10</ifr:offset2></ifr:properties></ifr:field><ifr:scalarType name=\"LGORT_D\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 12, "STOCK_IND", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Stock_Ind", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "STOCK_IND", 0, 0, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"STOCK_IND\"><ifr:descriptor><ifr:description language=\"en\">Special Stock Indicator</ifr:description></ifr:descriptor><ifr:definition><ifr:field name=\"BAPICM61V.SOBKZ\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>74</ifr:offset1><ifr:offset2>136</ifr:offset2></ifr:properties></ifr:field><ifr:scalarType name=\"SOBKZ\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 13, "UNIT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 1, 1, false, null, "Unit", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "UNIT", 0, 0, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"UNIT\"><ifr:descriptor><ifr:description language=\"en\">Unit of measure for display</ifr:description></ifr:descriptor><ifr:definition><ifr:field name=\"BAPIADMM.UNIT\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>T006</ifr:checkTable><ifr:offset1>28</ifr:offset1><ifr:offset2>56</ifr:offset2></ifr:properties></ifr:field><ifr:scalarType name=\"MEINH\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>UNIT</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength><ifr:conversionExit>CUNIT</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 14, "WBS_ELEM", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Wbs_Elem", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "24"}}, "WBS_ELEM", 0, 0, -1, 24, 48, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"WBS_ELEM\"><ifr:descriptor><ifr:description language=\"en\">WBS Element</ifr:description></ifr:descriptor><ifr:definition><ifr:field name=\"BAPISDITM.WBS_ELEM\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>899</ifr:offset1><ifr:offset2>1704</ifr:offset2></ifr:properties></ifr:field><ifr:scalarType name=\"PS_POSID\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>24</ifr:length><ifr:internalLength1>24</ifr:internalLength1><ifr:internalLength2>48</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>24</ifr:outputLength><ifr:conversionExit>ABPSN</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 15, "WMDVSX", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Wmdvsx", hmh.sap.rfc.util.BapiwmdvsType_List.class, new hmh.sap.rfc.BapiwmdvsType(), new java.lang.String[][]{}, "WMDVSX", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"WMDVSX\"><ifr:descriptor><ifr:description language=\"en\">Input table (date and quantity)</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"BAPIWMDVS\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPIWMDVS\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 16, "WMDVEX", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Wmdvex", hmh.sap.rfc.util.BapiwmdveType_List.class, new hmh.sap.rfc.BapiwmdveType(), new java.lang.String[][]{}, "WMDVEX", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"WMDVEX\"><ifr:descriptor><ifr:description language=\"en\">Output table (date and ATP quantity)</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"BAPIWMDVE\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPIWMDVE\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        staticDescriptor = descriptor;
    }
    protected  Bapi_Material_Availability_Input (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    public  Bapi_Material_Availability_Input () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public java.lang.String getStge_Loc() {
        return (java.lang.String)baseTypeData().getElementValueAsString(11);
    }

    
    public void setDoc_Number(java.lang.String Doc_Number) {
        baseTypeData().setElementValue(5, Doc_Number);
    }

    
    public short getDec_For_Rounding() {
        return baseTypeData().getElementValueAsShort(3);
    }

    
    public void setBatch(java.lang.String Batch) {
        baseTypeData().setElementValue(0, Batch);
    }

    
    public MetaData metadataBapi_Material_Availability_Input() {
        return metadata;
    }

    
    public void setDec_For_Rounding(short Dec_For_Rounding) {
        baseTypeData().setElementValue(3, Dec_For_Rounding);
    }

    
    public void setWmdvsx(hmh.sap.rfc.util.BapiwmdvsType_List Wmdvsx) {
        baseTypeData().setElementValue(15, Wmdvsx);
    }

    
    public void setWbs_Elem(java.lang.String Wbs_Elem) {
        baseTypeData().setElementValue(14, Wbs_Elem);
    }

    
    public java.lang.String getMaterial() {
        return (java.lang.String)baseTypeData().getElementValueAsString(7);
    }

    
    public java.lang.String getRead_Atp_Lock_X() {
        return (java.lang.String)baseTypeData().getElementValueAsString(10);
    }

    
    public void setPlant(java.lang.String Plant) {
        baseTypeData().setElementValue(8, Plant);
    }

    
    public void setWmdvex(hmh.sap.rfc.util.BapiwmdveType_List Wmdvex) {
        baseTypeData().setElementValue(16, Wmdvex);
    }

    
    public void setRead_Atp_Lock(java.lang.String Read_Atp_Lock) {
        baseTypeData().setElementValue(9, Read_Atp_Lock);
    }

    
    public void setCheck_Rule(java.lang.String Check_Rule) {
        baseTypeData().setElementValue(1, Check_Rule);
    }

    
    public void setWmdvex(hmh.sap.rfc.BapiwmdveType[] Wmdvex) {
        baseTypeData().setElementValue(16, new hmh.sap.rfc.util.BapiwmdveType_List());
        hmh.sap.rfc.util.BapiwmdveType_List list$ = get_as_listWmdvex();
        for (int  i$ = 0; i$ < Wmdvex.length; i$++){
         list$.addBapiwmdveType(Wmdvex[ i$]);
        }
    }

    
    public void setDec_For_Rounding_X(java.lang.String Dec_For_Rounding_X) {
        baseTypeData().setElementValue(4, Dec_For_Rounding_X);
    }

    
    public void setCustomer(java.lang.String Customer) {
        baseTypeData().setElementValue(2, Customer);
    }

    
    public hmh.sap.rfc.util.BapiwmdveType_List get_as_listWmdvex() {
        return (hmh.sap.rfc.util.BapiwmdveType_List)baseTypeData().getElementValue(16);
    }

    
    public void setRead_Atp_Lock_X(java.lang.String Read_Atp_Lock_X) {
        baseTypeData().setElementValue(10, Read_Atp_Lock_X);
    }

    
    public java.lang.String getDec_For_Rounding_X() {
        return (java.lang.String)baseTypeData().getElementValueAsString(4);
    }

    
    public void setItm_Number(java.lang.String Itm_Number) {
        baseTypeData().setElementValue(6, Itm_Number);
    }

    
    public java.lang.String getCheck_Rule() {
        return (java.lang.String)baseTypeData().getElementValueAsString(1);
    }

    
    public java.lang.String getCustomer() {
        return (java.lang.String)baseTypeData().getElementValueAsString(2);
    }

    
    public java.lang.String getPlant() {
        return (java.lang.String)baseTypeData().getElementValueAsString(8);
    }

    
    public hmh.sap.rfc.BapiwmdvsType[] getWmdvsx() {
        hmh.sap.rfc.util.BapiwmdvsType_List i$ = (hmh.sap.rfc.util.BapiwmdvsType_List)baseTypeData().getElementValue(15);
        if ( i$ == null){return null;}
        return  i$.toArrayBapiwmdvsType();
    }

    
    public java.lang.String getStock_Ind() {
        return (java.lang.String)baseTypeData().getElementValueAsString(12);
    }

    
    public void setMaterial(java.lang.String Material) {
        baseTypeData().setElementValue(7, Material);
    }

    
    public java.lang.String getWbs_Elem() {
        return (java.lang.String)baseTypeData().getElementValueAsString(14);
    }

    
    public java.lang.String getDoc_Number() {
        return (java.lang.String)baseTypeData().getElementValueAsString(5);
    }

    
    public void setStock_Ind(java.lang.String Stock_Ind) {
        baseTypeData().setElementValue(12, Stock_Ind);
    }

    
    public hmh.sap.rfc.util.BapiwmdvsType_List get_as_listWmdvsx() {
        return (hmh.sap.rfc.util.BapiwmdvsType_List)baseTypeData().getElementValue(15);
    }

    
    public void setUnit(java.lang.String Unit) {
        baseTypeData().setElementValue(13, Unit);
    }

    
    public java.lang.String getItm_Number() {
        return (java.lang.String)baseTypeData().getElementValueAsString(6);
    }

    
    public hmh.sap.rfc.BapiwmdveType[] getWmdvex() {
        hmh.sap.rfc.util.BapiwmdveType_List i$ = (hmh.sap.rfc.util.BapiwmdveType_List)baseTypeData().getElementValue(16);
        if ( i$ == null){return null;}
        return  i$.toArrayBapiwmdveType();
    }

    
    public void setWmdvsx(hmh.sap.rfc.BapiwmdvsType[] Wmdvsx) {
        baseTypeData().setElementValue(15, new hmh.sap.rfc.util.BapiwmdvsType_List());
        hmh.sap.rfc.util.BapiwmdvsType_List list$ = get_as_listWmdvsx();
        for (int  i$ = 0; i$ < Wmdvsx.length; i$++){
         list$.addBapiwmdvsType(Wmdvsx[ i$]);
        }
    }

    
    public java.lang.String getRead_Atp_Lock() {
        return (java.lang.String)baseTypeData().getElementValueAsString(9);
    }

    
    public java.lang.String getUnit() {
        return (java.lang.String)baseTypeData().getElementValueAsString(13);
    }

    
    public java.lang.String getBatch() {
        return (java.lang.String)baseTypeData().getElementValueAsString(0);
    }

    
    public void setStge_Loc(java.lang.String Stge_Loc) {
        baseTypeData().setElementValue(11, Stge_Loc);
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  Bapi_Material_Availability_Input parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Bapi_Material_Availability_Input parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getStge_Loc() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(11);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCheck_Rule() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCustomer() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDec_For_Rounding() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPlant() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(8);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getWmdvsx() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(15);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getStock_Ind() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(12);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getWbs_Elem() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(14);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDoc_Number() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(5);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMaterial() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(7);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRead_Atp_Lock_X() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(10);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getItm_Number() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(6);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getWmdvex() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(16);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRead_Atp_Lock() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(9);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getUnit() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(13);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getBatch() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDec_For_Rounding_X() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(4);
        }
    
    }

}
