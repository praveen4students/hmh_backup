package hmh.sap.rfc;


public class Sd_Salesdocument_Create_Input extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1342559989906L) ;

    private  Sd_Salesdocument_Create_Input.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.WSDL_MESSAGE_FOR_JCO, "urn:sap-com:document:sap:rfc:functions", "SD_SALESDOCUMENT_CREATE.Input", 45, 0, hmh.sap.rfc.Sd_Salesdocument_Create_Input.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "SD_SALESDOCUMENT_CREATE", 0, 0, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor /><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:package>VA</ifr:package><ifr:akhNode>HLA0009601</ifr:akhNode><ifr:released>no</ifr:released><ifr:outbound>false</ifr:outbound><ifr:synchronous>true</ifr:synchronous><ifr:asynchronous>false</ifr:asynchronous><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2></ifr:properties><ifr:definition /></ifr:container>");
        descriptorSetElementProperties(descriptor, 0, "BEHAVE_WHEN_ERROR", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Behave_When_Error", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "BEHAVE_WHEN_ERROR", 0, 0, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"BEHAVE_WHEN_ERROR\"><ifr:descriptor /><ifr:definition><ifr:field name=\"BAPIFLAG.BAPIFLAG\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>0</ifr:offset1><ifr:offset2>0</ifr:offset2></ifr:properties></ifr:field><ifr:scalarType name=\"CHAR1\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType><ifr:defaultDefinition>SPACE</ifr:defaultDefinition></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 1, "BINARY_RELATIONSHIPTYPE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Binary_Relationshiptype", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "BINARY_RELATIONSHIPTYPE", 0, 0, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"BINARY_RELATIONSHIPTYPE\"><ifr:descriptor /><ifr:definition><ifr:field name=\"BRELTYP.RELTYPE\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>0</ifr:offset1><ifr:offset2>0</ifr:offset2></ifr:properties></ifr:field><ifr:scalarType name=\"BINRELTYP\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType><ifr:defaultDefinition>SPACE</ifr:defaultDefinition></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 2, "BUSINESS_OBJECT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Business_Object", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "BUSINESS_OBJECT", 0, 0, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"BUSINESS_OBJECT\"><ifr:descriptor /><ifr:definition><ifr:field name=\"BAPIUSW01.OBJTYPE\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>3</ifr:offset1><ifr:offset2>6</ifr:offset2></ifr:properties></ifr:field><ifr:scalarType name=\"OJ_NAME\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType><ifr:defaultDefinition>SPACE</ifr:defaultDefinition></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 3, "CONVERT_PARVW_AUART", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Convert_Parvw_Auart", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "CONVERT_PARVW_AUART", 0, 0, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"CONVERT_PARVW_AUART\"><ifr:descriptor /><ifr:definition><ifr:field name=\"BAPIFLAG.BAPIFLAG\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>0</ifr:offset1><ifr:offset2>0</ifr:offset2></ifr:properties></ifr:field><ifr:scalarType name=\"CHAR1\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType><ifr:defaultDefinition>SPACE</ifr:defaultDefinition></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 4, "INT_NUMBER_ASSIGNMENT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Int_Number_Assignment", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "INT_NUMBER_ASSIGNMENT", 0, 0, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"INT_NUMBER_ASSIGNMENT\"><ifr:descriptor /><ifr:definition><ifr:field name=\"BAPIFLAG.BAPIFLAG\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>0</ifr:offset1><ifr:offset2>0</ifr:offset2></ifr:properties></ifr:field><ifr:scalarType name=\"CHAR1\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType><ifr:defaultDefinition>SPACE</ifr:defaultDefinition></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 5, "LOGIC_SWITCH", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:BAPISDLS", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Logic_Switch", hmh.sap.rfc.BapisdlsType.class, new hmh.sap.rfc.BapisdlsType(), new java.lang.String[][]{}, "LOGIC_SWITCH", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"LOGIC_SWITCH\"><ifr:descriptor /><ifr:definition><ifr:complexType name=\"BAPISDLS\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPISDLS\" /></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 6, "SALESDOCUMENT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Salesdocument", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "SALESDOCUMENT", 0, 0, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"SALESDOCUMENT\"><ifr:descriptor /><ifr:definition><ifr:field name=\"BAPIVBELN.VBELN\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>0</ifr:offset1><ifr:offset2>0</ifr:offset2></ifr:properties></ifr:field><ifr:scalarType name=\"VBELN_VA\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 7, "SALES_HEADER_IN", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:BAPISDHD1", "urn:sap-com:document:sap:rfc:functions", false, 1, 1, false, null, "Sales_Header_In", hmh.sap.rfc.Bapisdhd1Type.class, new hmh.sap.rfc.Bapisdhd1Type(), new java.lang.String[][]{}, "SALES_HEADER_IN", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"SALES_HEADER_IN\"><ifr:descriptor /><ifr:definition><ifr:complexType name=\"BAPISDHD1\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPISDHD1\" /></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 8, "SALES_HEADER_INX", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:BAPISDHD1X", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Sales_Header_Inx", hmh.sap.rfc.Bapisdhd1XType.class, new hmh.sap.rfc.Bapisdhd1XType(), new java.lang.String[][]{}, "SALES_HEADER_INX", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"SALES_HEADER_INX\"><ifr:descriptor /><ifr:definition><ifr:complexType name=\"BAPISDHD1X\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPISDHD1X\" /></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 9, "SENDER", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:BDI_LOGSYS", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Sender", hmh.sap.rfc.Bdi_LogsysType.class, new hmh.sap.rfc.Bdi_LogsysType(), new java.lang.String[][]{}, "SENDER", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"SENDER\"><ifr:descriptor /><ifr:definition><ifr:complexType name=\"BDI_LOGSYS\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BDI_LOGSYS\" /></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 10, "STATUS_BUFFER_REFRESH", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Status_Buffer_Refresh", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "STATUS_BUFFER_REFRESH", 0, 0, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"STATUS_BUFFER_REFRESH\"><ifr:descriptor /><ifr:definition><ifr:field name=\"BAPIFLAG.BAPIFLAG\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>0</ifr:offset1><ifr:offset2>0</ifr:offset2></ifr:properties></ifr:field><ifr:scalarType name=\"CHAR1\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType><ifr:defaultDefinition>&apos;X&apos;</ifr:defaultDefinition></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 11, "TESTRUN", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Testrun", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "TESTRUN", 0, 0, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"TESTRUN\"><ifr:descriptor /><ifr:definition><ifr:field name=\"BAPIFLAG.BAPIFLAG\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>0</ifr:offset1><ifr:offset2>0</ifr:offset2></ifr:properties></ifr:field><ifr:scalarType name=\"CHAR1\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 12, "TEXTLINES_EX", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Textlines_Ex", hmh.sap.rfc.util.BapitextliType_List.class, new hmh.sap.rfc.BapitextliType(), new java.lang.String[][]{}, "TEXTLINES_EX", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"TEXTLINES_EX\"><ifr:descriptor /><ifr:definition><ifr:complexType name=\"BAPITEXTLI\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPITEXTLI\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 13, "TEXTHEADERS_EX", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Textheaders_Ex", hmh.sap.rfc.util.BapisdtehdType_List.class, new hmh.sap.rfc.BapisdtehdType(), new java.lang.String[][]{}, "TEXTHEADERS_EX", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"TEXTHEADERS_EX\"><ifr:descriptor /><ifr:definition><ifr:complexType name=\"BAPISDTEHD\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPISDTEHD\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 14, "SCHEDULE_EX", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Schedule_Ex", hmh.sap.rfc.util.BapisdheduType_List.class, new hmh.sap.rfc.BapisdheduType(), new java.lang.String[][]{}, "SCHEDULE_EX", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"SCHEDULE_EX\"><ifr:descriptor /><ifr:definition><ifr:complexType name=\"BAPISDHEDU\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPISDHEDU\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 15, "SALES_TEXT", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Sales_Text", hmh.sap.rfc.util.BapisdtextType_List.class, new hmh.sap.rfc.BapisdtextType(), new java.lang.String[][]{}, "SALES_TEXT", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"SALES_TEXT\"><ifr:descriptor /><ifr:definition><ifr:complexType name=\"BAPISDTEXT\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPISDTEXT\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 16, "SALES_SCHED_CONF_IN", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Sales_Sched_Conf_In", hmh.sap.rfc.util.Bapischdl2Type_List.class, new hmh.sap.rfc.Bapischdl2Type(), new java.lang.String[][]{}, "SALES_SCHED_CONF_IN", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"SALES_SCHED_CONF_IN\"><ifr:descriptor /><ifr:definition><ifr:complexType name=\"BAPISCHDL2\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPISCHDL2\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 17, "SALES_SCHEDULES_INX", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Sales_Schedules_Inx", hmh.sap.rfc.util.BapischdlxType_List.class, new hmh.sap.rfc.BapischdlxType(), new java.lang.String[][]{}, "SALES_SCHEDULES_INX", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"SALES_SCHEDULES_INX\"><ifr:descriptor /><ifr:definition><ifr:complexType name=\"BAPISCHDLX\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPISCHDLX\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 18, "SALES_SCHEDULES_IN", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Sales_Schedules_In", hmh.sap.rfc.util.BapischdlType_List.class, new hmh.sap.rfc.BapischdlType(), new java.lang.String[][]{}, "SALES_SCHEDULES_IN", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"SALES_SCHEDULES_IN\"><ifr:descriptor /><ifr:definition><ifr:complexType name=\"BAPISCHDL\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPISCHDL\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 19, "SALES_PARTNERS", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Sales_Partners", hmh.sap.rfc.util.BapiparnrType_List.class, new hmh.sap.rfc.BapiparnrType(), new java.lang.String[][]{}, "SALES_PARTNERS", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"SALES_PARTNERS\"><ifr:descriptor /><ifr:definition><ifr:complexType name=\"BAPIPARNR\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPIPARNR\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 20, "SALES_KEYS", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Sales_Keys", hmh.sap.rfc.util.BapisdkeyType_List.class, new hmh.sap.rfc.BapisdkeyType(), new java.lang.String[][]{}, "SALES_KEYS", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"SALES_KEYS\"><ifr:descriptor /><ifr:definition><ifr:complexType name=\"BAPISDKEY\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPISDKEY\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 21, "SALES_ITEMS_INX", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Sales_Items_Inx", hmh.sap.rfc.util.BapisditmxType_List.class, new hmh.sap.rfc.BapisditmxType(), new java.lang.String[][]{}, "SALES_ITEMS_INX", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"SALES_ITEMS_INX\"><ifr:descriptor /><ifr:definition><ifr:complexType name=\"BAPISDITMX\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPISDITMX\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 22, "SALES_ITEMS_IN", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Sales_Items_In", hmh.sap.rfc.util.BapisditmType_List.class, new hmh.sap.rfc.BapisditmType(), new java.lang.String[][]{}, "SALES_ITEMS_IN", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"SALES_ITEMS_IN\"><ifr:descriptor /><ifr:definition><ifr:complexType name=\"BAPISDITM\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPISDITM\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 23, "SALES_CONTRACT_INX", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Sales_Contract_Inx", hmh.sap.rfc.util.BapictrxType_List.class, new hmh.sap.rfc.BapictrxType(), new java.lang.String[][]{}, "SALES_CONTRACT_INX", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"SALES_CONTRACT_INX\"><ifr:descriptor /><ifr:definition><ifr:complexType name=\"BAPICTRX\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPICTRX\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 24, "SALES_CONTRACT_IN", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Sales_Contract_In", hmh.sap.rfc.util.BapictrType_List.class, new hmh.sap.rfc.BapictrType(), new java.lang.String[][]{}, "SALES_CONTRACT_IN", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"SALES_CONTRACT_IN\"><ifr:descriptor /><ifr:definition><ifr:complexType name=\"BAPICTR\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPICTR\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 25, "SALES_CONDITIONS_INX", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Sales_Conditions_Inx", hmh.sap.rfc.util.BapicondxType_List.class, new hmh.sap.rfc.BapicondxType(), new java.lang.String[][]{}, "SALES_CONDITIONS_INX", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"SALES_CONDITIONS_INX\"><ifr:descriptor /><ifr:definition><ifr:complexType name=\"BAPICONDX\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPICONDX\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 26, "SALES_CONDITIONS_IN", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Sales_Conditions_In", hmh.sap.rfc.util.BapicondType_List.class, new hmh.sap.rfc.BapicondType(), new java.lang.String[][]{}, "SALES_CONDITIONS_IN", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"SALES_CONDITIONS_IN\"><ifr:descriptor /><ifr:definition><ifr:complexType name=\"BAPICOND\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPICOND\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 27, "SALES_CFGS_VK", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Sales_Cfgs_Vk", hmh.sap.rfc.util.BapicuvkType_List.class, new hmh.sap.rfc.BapicuvkType(), new java.lang.String[][]{}, "SALES_CFGS_VK", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"SALES_CFGS_VK\"><ifr:descriptor /><ifr:definition><ifr:complexType name=\"BAPICUVK\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPICUVK\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 28, "SALES_CFGS_VALUE", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Sales_Cfgs_Value", hmh.sap.rfc.util.BapicuvalType_List.class, new hmh.sap.rfc.BapicuvalType(), new java.lang.String[][]{}, "SALES_CFGS_VALUE", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"SALES_CFGS_VALUE\"><ifr:descriptor /><ifr:definition><ifr:complexType name=\"BAPICUVAL\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPICUVAL\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 29, "SALES_CFGS_REFINST", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Sales_Cfgs_Refinst", hmh.sap.rfc.util.BapicurefType_List.class, new hmh.sap.rfc.BapicurefType(), new java.lang.String[][]{}, "SALES_CFGS_REFINST", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"SALES_CFGS_REFINST\"><ifr:descriptor /><ifr:definition><ifr:complexType name=\"BAPICUREF\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPICUREF\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 30, "SALES_CFGS_REF", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Sales_Cfgs_Ref", hmh.sap.rfc.util.BapicucfgType_List.class, new hmh.sap.rfc.BapicucfgType(), new java.lang.String[][]{}, "SALES_CFGS_REF", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"SALES_CFGS_REF\"><ifr:descriptor /><ifr:definition><ifr:complexType name=\"BAPICUCFG\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPICUCFG\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 31, "SALES_CFGS_PART_OF", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Sales_Cfgs_Part_Of", hmh.sap.rfc.util.BapicuprtType_List.class, new hmh.sap.rfc.BapicuprtType(), new java.lang.String[][]{}, "SALES_CFGS_PART_OF", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"SALES_CFGS_PART_OF\"><ifr:descriptor /><ifr:definition><ifr:complexType name=\"BAPICUPRT\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPICUPRT\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 32, "SALES_CFGS_INST", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Sales_Cfgs_Inst", hmh.sap.rfc.util.BapicuinsType_List.class, new hmh.sap.rfc.BapicuinsType(), new java.lang.String[][]{}, "SALES_CFGS_INST", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"SALES_CFGS_INST\"><ifr:descriptor /><ifr:definition><ifr:complexType name=\"BAPICUINS\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPICUINS\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 33, "SALES_CFGS_BLOB", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Sales_Cfgs_Blob", hmh.sap.rfc.util.BapicublbType_List.class, new hmh.sap.rfc.BapicublbType(), new java.lang.String[][]{}, "SALES_CFGS_BLOB", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"SALES_CFGS_BLOB\"><ifr:descriptor /><ifr:definition><ifr:complexType name=\"BAPICUBLB\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPICUBLB\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 34, "SALES_CCARD", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Sales_Ccard", hmh.sap.rfc.util.BapiccardType_List.class, new hmh.sap.rfc.BapiccardType(), new java.lang.String[][]{}, "SALES_CCARD", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"SALES_CCARD\"><ifr:descriptor /><ifr:definition><ifr:complexType name=\"BAPICCARD\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPICCARD\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 35, "RETURN", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Return", hmh.sap.rfc.util.Bapiret2Type_List.class, new hmh.sap.rfc.Bapiret2Type(), new java.lang.String[][]{}, "RETURN", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"RETURN\"><ifr:descriptor /><ifr:definition><ifr:complexType name=\"BAPIRET2\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPIRET2\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 36, "PARTNERS_EX", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Partners_Ex", hmh.sap.rfc.util.BapisdpartType_List.class, new hmh.sap.rfc.BapisdpartType(), new java.lang.String[][]{}, "PARTNERS_EX", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"PARTNERS_EX\"><ifr:descriptor /><ifr:definition><ifr:complexType name=\"BAPISDPART\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPISDPART\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 37, "PARTNERADDRESSES", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Partneraddresses", hmh.sap.rfc.util.Bapiaddr1Type_List.class, new hmh.sap.rfc.Bapiaddr1Type(), new java.lang.String[][]{}, "PARTNERADDRESSES", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"PARTNERADDRESSES\"><ifr:descriptor /><ifr:definition><ifr:complexType name=\"BAPIADDR1\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPIADDR1\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 38, "ITEMS_EX", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Items_Ex", hmh.sap.rfc.util.BapisditType_List.class, new hmh.sap.rfc.BapisditType(), new java.lang.String[][]{}, "ITEMS_EX", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"ITEMS_EX\"><ifr:descriptor /><ifr:definition><ifr:complexType name=\"BAPISDIT\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPISDIT\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 39, "INCOMPLETE_LOG", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Incomplete_Log", hmh.sap.rfc.util.BapiincompType_List.class, new hmh.sap.rfc.BapiincompType(), new java.lang.String[][]{}, "INCOMPLETE_LOG", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"INCOMPLETE_LOG\"><ifr:descriptor /><ifr:definition><ifr:complexType name=\"BAPIINCOMP\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPIINCOMP\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 40, "EXTENSIONIN", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Extensionin", hmh.sap.rfc.util.BapiparexType_List.class, new hmh.sap.rfc.BapiparexType(), new java.lang.String[][]{}, "EXTENSIONIN", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"EXTENSIONIN\"><ifr:descriptor /><ifr:definition><ifr:complexType name=\"BAPIPAREX\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPIPAREX\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 41, "EXTENSIONEX", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Extensionex", hmh.sap.rfc.util.BapiparexType_List.class, new hmh.sap.rfc.BapiparexType(), new java.lang.String[][]{}, "EXTENSIONEX", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"EXTENSIONEX\"><ifr:descriptor /><ifr:definition><ifr:complexType name=\"BAPIPAREX\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPIPAREX\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 42, "CONDITIONS_EX", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Conditions_Ex", hmh.sap.rfc.util.BapicondType_List.class, new hmh.sap.rfc.BapicondType(), new java.lang.String[][]{}, "CONDITIONS_EX", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"CONDITIONS_EX\"><ifr:descriptor /><ifr:definition><ifr:complexType name=\"BAPICOND\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPICOND\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 43, "BUSINESS_EX", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Business_Ex", hmh.sap.rfc.util.BapisdbusiType_List.class, new hmh.sap.rfc.BapisdbusiType(), new java.lang.String[][]{}, "BUSINESS_EX", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"BUSINESS_EX\"><ifr:descriptor /><ifr:definition><ifr:complexType name=\"BAPISDBUSI\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPISDBUSI\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 44, "BATCH_CHARC", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Batch_Charc", hmh.sap.rfc.util.BapibtselType_List.class, new hmh.sap.rfc.BapibtselType(), new java.lang.String[][]{}, "BATCH_CHARC", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"BATCH_CHARC\"><ifr:descriptor /><ifr:definition><ifr:complexType name=\"BAPIBTSEL\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPIBTSEL\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        staticDescriptor = descriptor;
    }
    public  Sd_Salesdocument_Create_Input () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    protected  Sd_Salesdocument_Create_Input (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    
    public void setSales_Cfgs_Blob(hmh.sap.rfc.util.BapicublbType_List Sales_Cfgs_Blob) {
        baseTypeData().setElementValue(33, Sales_Cfgs_Blob);
    }

    
    public hmh.sap.rfc.util.BapisditmxType_List get_as_listSales_Items_Inx() {
        return (hmh.sap.rfc.util.BapisditmxType_List)baseTypeData().getElementValue(21);
    }

    
    public hmh.sap.rfc.util.BapicondType_List get_as_listSales_Conditions_In() {
        return (hmh.sap.rfc.util.BapicondType_List)baseTypeData().getElementValue(26);
    }

    
    public hmh.sap.rfc.BapisdtextType[] getSales_Text() {
        hmh.sap.rfc.util.BapisdtextType_List i$ = (hmh.sap.rfc.util.BapisdtextType_List)baseTypeData().getElementValue(15);
        if ( i$ == null){return null;}
        return  i$.toArrayBapisdtextType();
    }

    
    public hmh.sap.rfc.Bapiaddr1Type[] getPartneraddresses() {
        hmh.sap.rfc.util.Bapiaddr1Type_List i$ = (hmh.sap.rfc.util.Bapiaddr1Type_List)baseTypeData().getElementValue(37);
        if ( i$ == null){return null;}
        return  i$.toArrayBapiaddr1Type();
    }

    
    public java.lang.String getBusiness_Object() {
        return (java.lang.String)baseTypeData().getElementValueAsString(2);
    }

    
    public void setSales_Contract_In(hmh.sap.rfc.BapictrType[] Sales_Contract_In) {
        baseTypeData().setElementValue(24, new hmh.sap.rfc.util.BapictrType_List());
        hmh.sap.rfc.util.BapictrType_List list$ = get_as_listSales_Contract_In();
        for (int  i$ = 0; i$ < Sales_Contract_In.length; i$++){
         list$.addBapictrType(Sales_Contract_In[ i$]);
        }
    }

    
    public hmh.sap.rfc.Bdi_LogsysType getSender() {
        return (hmh.sap.rfc.Bdi_LogsysType)baseTypeData().getElementValue(9);
    }

    
    public void setConvert_Parvw_Auart(java.lang.String Convert_Parvw_Auart) {
        baseTypeData().setElementValue(3, Convert_Parvw_Auart);
    }

    
    public hmh.sap.rfc.BapicondxType[] getSales_Conditions_Inx() {
        hmh.sap.rfc.util.BapicondxType_List i$ = (hmh.sap.rfc.util.BapicondxType_List)baseTypeData().getElementValue(25);
        if ( i$ == null){return null;}
        return  i$.toArrayBapicondxType();
    }

    
    public void setSales_Conditions_In(hmh.sap.rfc.util.BapicondType_List Sales_Conditions_In) {
        baseTypeData().setElementValue(26, Sales_Conditions_In);
    }

    
    public hmh.sap.rfc.util.BapisdtextType_List get_as_listSales_Text() {
        return (hmh.sap.rfc.util.BapisdtextType_List)baseTypeData().getElementValue(15);
    }

    
    public hmh.sap.rfc.util.BapiccardType_List get_as_listSales_Ccard() {
        return (hmh.sap.rfc.util.BapiccardType_List)baseTypeData().getElementValue(34);
    }

    
    public void setBehave_When_Error(java.lang.String Behave_When_Error) {
        baseTypeData().setElementValue(0, Behave_When_Error);
    }

    
    public hmh.sap.rfc.util.BapiparnrType_List get_as_listSales_Partners() {
        return (hmh.sap.rfc.util.BapiparnrType_List)baseTypeData().getElementValue(19);
    }

    
    public hmh.sap.rfc.util.BapicuinsType_List get_as_listSales_Cfgs_Inst() {
        return (hmh.sap.rfc.util.BapicuinsType_List)baseTypeData().getElementValue(32);
    }

    
    public java.lang.String getInt_Number_Assignment() {
        return (java.lang.String)baseTypeData().getElementValueAsString(4);
    }

    
    public void setSales_Contract_In(hmh.sap.rfc.util.BapictrType_List Sales_Contract_In) {
        baseTypeData().setElementValue(24, Sales_Contract_In);
    }

    
    public hmh.sap.rfc.BapicuvalType[] getSales_Cfgs_Value() {
        hmh.sap.rfc.util.BapicuvalType_List i$ = (hmh.sap.rfc.util.BapicuvalType_List)baseTypeData().getElementValue(28);
        if ( i$ == null){return null;}
        return  i$.toArrayBapicuvalType();
    }

    
    public void setBatch_Charc(hmh.sap.rfc.util.BapibtselType_List Batch_Charc) {
        baseTypeData().setElementValue(44, Batch_Charc);
    }

    
    public void setLogic_Switch(hmh.sap.rfc.BapisdlsType Logic_Switch) {
        baseTypeData().setElementValue(5, Logic_Switch);
    }

    
    public void setSales_Schedules_In(hmh.sap.rfc.util.BapischdlType_List Sales_Schedules_In) {
        baseTypeData().setElementValue(18, Sales_Schedules_In);
    }

    
    public hmh.sap.rfc.util.Bapischdl2Type_List get_as_listSales_Sched_Conf_In() {
        return (hmh.sap.rfc.util.Bapischdl2Type_List)baseTypeData().getElementValue(16);
    }

    
    public java.lang.String getBehave_When_Error() {
        return (java.lang.String)baseTypeData().getElementValueAsString(0);
    }

    
    public hmh.sap.rfc.BapicurefType[] getSales_Cfgs_Refinst() {
        hmh.sap.rfc.util.BapicurefType_List i$ = (hmh.sap.rfc.util.BapicurefType_List)baseTypeData().getElementValue(29);
        if ( i$ == null){return null;}
        return  i$.toArrayBapicurefType();
    }

    
    public void setSales_Conditions_In(hmh.sap.rfc.BapicondType[] Sales_Conditions_In) {
        baseTypeData().setElementValue(26, new hmh.sap.rfc.util.BapicondType_List());
        hmh.sap.rfc.util.BapicondType_List list$ = get_as_listSales_Conditions_In();
        for (int  i$ = 0; i$ < Sales_Conditions_In.length; i$++){
         list$.addBapicondType(Sales_Conditions_In[ i$]);
        }
    }

    
    public void setExtensionin(hmh.sap.rfc.BapiparexType[] Extensionin) {
        baseTypeData().setElementValue(40, new hmh.sap.rfc.util.BapiparexType_List());
        hmh.sap.rfc.util.BapiparexType_List list$ = get_as_listExtensionin();
        for (int  i$ = 0; i$ < Extensionin.length; i$++){
         list$.addBapiparexType(Extensionin[ i$]);
        }
    }

    
    public void setSales_Header_In(hmh.sap.rfc.Bapisdhd1Type Sales_Header_In) {
        baseTypeData().setElementValue(7, Sales_Header_In);
    }

    
    public hmh.sap.rfc.util.BapisditType_List get_as_listItems_Ex() {
        return (hmh.sap.rfc.util.BapisditType_List)baseTypeData().getElementValue(38);
    }

    
    public hmh.sap.rfc.util.BapischdlxType_List get_as_listSales_Schedules_Inx() {
        return (hmh.sap.rfc.util.BapischdlxType_List)baseTypeData().getElementValue(17);
    }

    
    public hmh.sap.rfc.util.BapiparexType_List get_as_listExtensionex() {
        return (hmh.sap.rfc.util.BapiparexType_List)baseTypeData().getElementValue(41);
    }

    
    public void setSales_Items_Inx(hmh.sap.rfc.util.BapisditmxType_List Sales_Items_Inx) {
        baseTypeData().setElementValue(21, Sales_Items_Inx);
    }

    
    public hmh.sap.rfc.BapicuinsType[] getSales_Cfgs_Inst() {
        hmh.sap.rfc.util.BapicuinsType_List i$ = (hmh.sap.rfc.util.BapicuinsType_List)baseTypeData().getElementValue(32);
        if ( i$ == null){return null;}
        return  i$.toArrayBapicuinsType();
    }

    
    public hmh.sap.rfc.util.BapisdbusiType_List get_as_listBusiness_Ex() {
        return (hmh.sap.rfc.util.BapisdbusiType_List)baseTypeData().getElementValue(43);
    }

    
    public void setSender(hmh.sap.rfc.Bdi_LogsysType Sender) {
        baseTypeData().setElementValue(9, Sender);
    }

    
    public hmh.sap.rfc.Bapischdl2Type[] getSales_Sched_Conf_In() {
        hmh.sap.rfc.util.Bapischdl2Type_List i$ = (hmh.sap.rfc.util.Bapischdl2Type_List)baseTypeData().getElementValue(16);
        if ( i$ == null){return null;}
        return  i$.toArrayBapischdl2Type();
    }

    
    public void setSales_Cfgs_Refinst(hmh.sap.rfc.BapicurefType[] Sales_Cfgs_Refinst) {
        baseTypeData().setElementValue(29, new hmh.sap.rfc.util.BapicurefType_List());
        hmh.sap.rfc.util.BapicurefType_List list$ = get_as_listSales_Cfgs_Refinst();
        for (int  i$ = 0; i$ < Sales_Cfgs_Refinst.length; i$++){
         list$.addBapicurefType(Sales_Cfgs_Refinst[ i$]);
        }
    }

    
    public hmh.sap.rfc.util.BapicondxType_List get_as_listSales_Conditions_Inx() {
        return (hmh.sap.rfc.util.BapicondxType_List)baseTypeData().getElementValue(25);
    }

    
    public hmh.sap.rfc.util.BapictrType_List get_as_listSales_Contract_In() {
        return (hmh.sap.rfc.util.BapictrType_List)baseTypeData().getElementValue(24);
    }

    
    public hmh.sap.rfc.BapicublbType[] getSales_Cfgs_Blob() {
        hmh.sap.rfc.util.BapicublbType_List i$ = (hmh.sap.rfc.util.BapicublbType_List)baseTypeData().getElementValue(33);
        if ( i$ == null){return null;}
        return  i$.toArrayBapicublbType();
    }

    
    public void setSales_Schedules_In(hmh.sap.rfc.BapischdlType[] Sales_Schedules_In) {
        baseTypeData().setElementValue(18, new hmh.sap.rfc.util.BapischdlType_List());
        hmh.sap.rfc.util.BapischdlType_List list$ = get_as_listSales_Schedules_In();
        for (int  i$ = 0; i$ < Sales_Schedules_In.length; i$++){
         list$.addBapischdlType(Sales_Schedules_In[ i$]);
        }
    }

    
    public void setSales_Partners(hmh.sap.rfc.BapiparnrType[] Sales_Partners) {
        baseTypeData().setElementValue(19, new hmh.sap.rfc.util.BapiparnrType_List());
        hmh.sap.rfc.util.BapiparnrType_List list$ = get_as_listSales_Partners();
        for (int  i$ = 0; i$ < Sales_Partners.length; i$++){
         list$.addBapiparnrType(Sales_Partners[ i$]);
        }
    }

    
    public void setConditions_Ex(hmh.sap.rfc.util.BapicondType_List Conditions_Ex) {
        baseTypeData().setElementValue(42, Conditions_Ex);
    }

    
    public void setSales_Cfgs_Part_Of(hmh.sap.rfc.util.BapicuprtType_List Sales_Cfgs_Part_Of) {
        baseTypeData().setElementValue(31, Sales_Cfgs_Part_Of);
    }

    
    public void setSales_Schedules_Inx(hmh.sap.rfc.BapischdlxType[] Sales_Schedules_Inx) {
        baseTypeData().setElementValue(17, new hmh.sap.rfc.util.BapischdlxType_List());
        hmh.sap.rfc.util.BapischdlxType_List list$ = get_as_listSales_Schedules_Inx();
        for (int  i$ = 0; i$ < Sales_Schedules_Inx.length; i$++){
         list$.addBapischdlxType(Sales_Schedules_Inx[ i$]);
        }
    }

    
    public hmh.sap.rfc.BapisditType[] getItems_Ex() {
        hmh.sap.rfc.util.BapisditType_List i$ = (hmh.sap.rfc.util.BapisditType_List)baseTypeData().getElementValue(38);
        if ( i$ == null){return null;}
        return  i$.toArrayBapisditType();
    }

    
    public hmh.sap.rfc.BapiincompType[] getIncomplete_Log() {
        hmh.sap.rfc.util.BapiincompType_List i$ = (hmh.sap.rfc.util.BapiincompType_List)baseTypeData().getElementValue(39);
        if ( i$ == null){return null;}
        return  i$.toArrayBapiincompType();
    }

    
    public void setSales_Cfgs_Blob(hmh.sap.rfc.BapicublbType[] Sales_Cfgs_Blob) {
        baseTypeData().setElementValue(33, new hmh.sap.rfc.util.BapicublbType_List());
        hmh.sap.rfc.util.BapicublbType_List list$ = get_as_listSales_Cfgs_Blob();
        for (int  i$ = 0; i$ < Sales_Cfgs_Blob.length; i$++){
         list$.addBapicublbType(Sales_Cfgs_Blob[ i$]);
        }
    }

    
    public hmh.sap.rfc.util.BapisditmType_List get_as_listSales_Items_In() {
        return (hmh.sap.rfc.util.BapisditmType_List)baseTypeData().getElementValue(22);
    }

    
    public hmh.sap.rfc.BapisdkeyType[] getSales_Keys() {
        hmh.sap.rfc.util.BapisdkeyType_List i$ = (hmh.sap.rfc.util.BapisdkeyType_List)baseTypeData().getElementValue(20);
        if ( i$ == null){return null;}
        return  i$.toArrayBapisdkeyType();
    }

    
    public hmh.sap.rfc.BapiccardType[] getSales_Ccard() {
        hmh.sap.rfc.util.BapiccardType_List i$ = (hmh.sap.rfc.util.BapiccardType_List)baseTypeData().getElementValue(34);
        if ( i$ == null){return null;}
        return  i$.toArrayBapiccardType();
    }

    
    public java.lang.String getSalesdocument() {
        return (java.lang.String)baseTypeData().getElementValueAsString(6);
    }

    
    public void setPartners_Ex(hmh.sap.rfc.BapisdpartType[] Partners_Ex) {
        baseTypeData().setElementValue(36, new hmh.sap.rfc.util.BapisdpartType_List());
        hmh.sap.rfc.util.BapisdpartType_List list$ = get_as_listPartners_Ex();
        for (int  i$ = 0; i$ < Partners_Ex.length; i$++){
         list$.addBapisdpartType(Partners_Ex[ i$]);
        }
    }

    
    public void setSales_Conditions_Inx(hmh.sap.rfc.util.BapicondxType_List Sales_Conditions_Inx) {
        baseTypeData().setElementValue(25, Sales_Conditions_Inx);
    }

    
    public void setPartneraddresses(hmh.sap.rfc.util.Bapiaddr1Type_List Partneraddresses) {
        baseTypeData().setElementValue(37, Partneraddresses);
    }

    
    public void setSales_Items_Inx(hmh.sap.rfc.BapisditmxType[] Sales_Items_Inx) {
        baseTypeData().setElementValue(21, new hmh.sap.rfc.util.BapisditmxType_List());
        hmh.sap.rfc.util.BapisditmxType_List list$ = get_as_listSales_Items_Inx();
        for (int  i$ = 0; i$ < Sales_Items_Inx.length; i$++){
         list$.addBapisditmxType(Sales_Items_Inx[ i$]);
        }
    }

    
    public void setSales_Items_In(hmh.sap.rfc.BapisditmType[] Sales_Items_In) {
        baseTypeData().setElementValue(22, new hmh.sap.rfc.util.BapisditmType_List());
        hmh.sap.rfc.util.BapisditmType_List list$ = get_as_listSales_Items_In();
        for (int  i$ = 0; i$ < Sales_Items_In.length; i$++){
         list$.addBapisditmType(Sales_Items_In[ i$]);
        }
    }

    
    public void setSales_Cfgs_Inst(hmh.sap.rfc.BapicuinsType[] Sales_Cfgs_Inst) {
        baseTypeData().setElementValue(32, new hmh.sap.rfc.util.BapicuinsType_List());
        hmh.sap.rfc.util.BapicuinsType_List list$ = get_as_listSales_Cfgs_Inst();
        for (int  i$ = 0; i$ < Sales_Cfgs_Inst.length; i$++){
         list$.addBapicuinsType(Sales_Cfgs_Inst[ i$]);
        }
    }

    
    public hmh.sap.rfc.BapiparexType[] getExtensionin() {
        hmh.sap.rfc.util.BapiparexType_List i$ = (hmh.sap.rfc.util.BapiparexType_List)baseTypeData().getElementValue(40);
        if ( i$ == null){return null;}
        return  i$.toArrayBapiparexType();
    }

    
    public hmh.sap.rfc.util.BapisdpartType_List get_as_listPartners_Ex() {
        return (hmh.sap.rfc.util.BapisdpartType_List)baseTypeData().getElementValue(36);
    }

    
    public hmh.sap.rfc.util.BapischdlType_List get_as_listSales_Schedules_In() {
        return (hmh.sap.rfc.util.BapischdlType_List)baseTypeData().getElementValue(18);
    }

    
    public hmh.sap.rfc.BapictrType[] getSales_Contract_In() {
        hmh.sap.rfc.util.BapictrType_List i$ = (hmh.sap.rfc.util.BapictrType_List)baseTypeData().getElementValue(24);
        if ( i$ == null){return null;}
        return  i$.toArrayBapictrType();
    }

    
    public void setTextheaders_Ex(hmh.sap.rfc.util.BapisdtehdType_List Textheaders_Ex) {
        baseTypeData().setElementValue(13, Textheaders_Ex);
    }

    
    public void setSales_Text(hmh.sap.rfc.BapisdtextType[] Sales_Text) {
        baseTypeData().setElementValue(15, new hmh.sap.rfc.util.BapisdtextType_List());
        hmh.sap.rfc.util.BapisdtextType_List list$ = get_as_listSales_Text();
        for (int  i$ = 0; i$ < Sales_Text.length; i$++){
         list$.addBapisdtextType(Sales_Text[ i$]);
        }
    }

    
    public void setSales_Cfgs_Vk(hmh.sap.rfc.BapicuvkType[] Sales_Cfgs_Vk) {
        baseTypeData().setElementValue(27, new hmh.sap.rfc.util.BapicuvkType_List());
        hmh.sap.rfc.util.BapicuvkType_List list$ = get_as_listSales_Cfgs_Vk();
        for (int  i$ = 0; i$ < Sales_Cfgs_Vk.length; i$++){
         list$.addBapicuvkType(Sales_Cfgs_Vk[ i$]);
        }
    }

    
    public hmh.sap.rfc.BapiparexType[] getExtensionex() {
        hmh.sap.rfc.util.BapiparexType_List i$ = (hmh.sap.rfc.util.BapiparexType_List)baseTypeData().getElementValue(41);
        if ( i$ == null){return null;}
        return  i$.toArrayBapiparexType();
    }

    
    public void setInt_Number_Assignment(java.lang.String Int_Number_Assignment) {
        baseTypeData().setElementValue(4, Int_Number_Assignment);
    }

    
    public void setExtensionex(hmh.sap.rfc.BapiparexType[] Extensionex) {
        baseTypeData().setElementValue(41, new hmh.sap.rfc.util.BapiparexType_List());
        hmh.sap.rfc.util.BapiparexType_List list$ = get_as_listExtensionex();
        for (int  i$ = 0; i$ < Extensionex.length; i$++){
         list$.addBapiparexType(Extensionex[ i$]);
        }
    }

    
    public hmh.sap.rfc.util.BapicuvalType_List get_as_listSales_Cfgs_Value() {
        return (hmh.sap.rfc.util.BapicuvalType_List)baseTypeData().getElementValue(28);
    }

    
    public hmh.sap.rfc.util.BapitextliType_List get_as_listTextlines_Ex() {
        return (hmh.sap.rfc.util.BapitextliType_List)baseTypeData().getElementValue(12);
    }

    
    public void setSales_Cfgs_Part_Of(hmh.sap.rfc.BapicuprtType[] Sales_Cfgs_Part_Of) {
        baseTypeData().setElementValue(31, new hmh.sap.rfc.util.BapicuprtType_List());
        hmh.sap.rfc.util.BapicuprtType_List list$ = get_as_listSales_Cfgs_Part_Of();
        for (int  i$ = 0; i$ < Sales_Cfgs_Part_Of.length; i$++){
         list$.addBapicuprtType(Sales_Cfgs_Part_Of[ i$]);
        }
    }

    
    public hmh.sap.rfc.BapitextliType[] getTextlines_Ex() {
        hmh.sap.rfc.util.BapitextliType_List i$ = (hmh.sap.rfc.util.BapitextliType_List)baseTypeData().getElementValue(12);
        if ( i$ == null){return null;}
        return  i$.toArrayBapitextliType();
    }

    
    public java.lang.String getStatus_Buffer_Refresh() {
        return (java.lang.String)baseTypeData().getElementValueAsString(10);
    }

    
    public hmh.sap.rfc.BapictrxType[] getSales_Contract_Inx() {
        hmh.sap.rfc.util.BapictrxType_List i$ = (hmh.sap.rfc.util.BapictrxType_List)baseTypeData().getElementValue(23);
        if ( i$ == null){return null;}
        return  i$.toArrayBapictrxType();
    }

    
    public void setReturn(hmh.sap.rfc.Bapiret2Type[] Return) {
        baseTypeData().setElementValue(35, new hmh.sap.rfc.util.Bapiret2Type_List());
        hmh.sap.rfc.util.Bapiret2Type_List list$ = get_as_listReturn();
        for (int  i$ = 0; i$ < Return.length; i$++){
         list$.addBapiret2Type(Return[ i$]);
        }
    }

    
    public hmh.sap.rfc.Bapisdhd1XType getSales_Header_Inx() {
        return (hmh.sap.rfc.Bapisdhd1XType)baseTypeData().getElementValue(8);
    }

    
    public hmh.sap.rfc.util.BapicuvkType_List get_as_listSales_Cfgs_Vk() {
        return (hmh.sap.rfc.util.BapicuvkType_List)baseTypeData().getElementValue(27);
    }

    
    public void setExtensionex(hmh.sap.rfc.util.BapiparexType_List Extensionex) {
        baseTypeData().setElementValue(41, Extensionex);
    }

    
    public void setSchedule_Ex(hmh.sap.rfc.util.BapisdheduType_List Schedule_Ex) {
        baseTypeData().setElementValue(14, Schedule_Ex);
    }

    
    public void setSales_Contract_Inx(hmh.sap.rfc.BapictrxType[] Sales_Contract_Inx) {
        baseTypeData().setElementValue(23, new hmh.sap.rfc.util.BapictrxType_List());
        hmh.sap.rfc.util.BapictrxType_List list$ = get_as_listSales_Contract_Inx();
        for (int  i$ = 0; i$ < Sales_Contract_Inx.length; i$++){
         list$.addBapictrxType(Sales_Contract_Inx[ i$]);
        }
    }

    
    public hmh.sap.rfc.util.BapicublbType_List get_as_listSales_Cfgs_Blob() {
        return (hmh.sap.rfc.util.BapicublbType_List)baseTypeData().getElementValue(33);
    }

    
    public hmh.sap.rfc.util.BapicucfgType_List get_as_listSales_Cfgs_Ref() {
        return (hmh.sap.rfc.util.BapicucfgType_List)baseTypeData().getElementValue(30);
    }

    
    public hmh.sap.rfc.BapischdlxType[] getSales_Schedules_Inx() {
        hmh.sap.rfc.util.BapischdlxType_List i$ = (hmh.sap.rfc.util.BapischdlxType_List)baseTypeData().getElementValue(17);
        if ( i$ == null){return null;}
        return  i$.toArrayBapischdlxType();
    }

    
    public void setSales_Cfgs_Value(hmh.sap.rfc.BapicuvalType[] Sales_Cfgs_Value) {
        baseTypeData().setElementValue(28, new hmh.sap.rfc.util.BapicuvalType_List());
        hmh.sap.rfc.util.BapicuvalType_List list$ = get_as_listSales_Cfgs_Value();
        for (int  i$ = 0; i$ < Sales_Cfgs_Value.length; i$++){
         list$.addBapicuvalType(Sales_Cfgs_Value[ i$]);
        }
    }

    
    public hmh.sap.rfc.BapisditmType[] getSales_Items_In() {
        hmh.sap.rfc.util.BapisditmType_List i$ = (hmh.sap.rfc.util.BapisditmType_List)baseTypeData().getElementValue(22);
        if ( i$ == null){return null;}
        return  i$.toArrayBapisditmType();
    }

    
    public MetaData metadataSd_Salesdocument_Create_Input() {
        return metadata;
    }

    
    public hmh.sap.rfc.Bapiret2Type[] getReturn() {
        hmh.sap.rfc.util.Bapiret2Type_List i$ = (hmh.sap.rfc.util.Bapiret2Type_List)baseTypeData().getElementValue(35);
        if ( i$ == null){return null;}
        return  i$.toArrayBapiret2Type();
    }

    
    public void setSales_Cfgs_Vk(hmh.sap.rfc.util.BapicuvkType_List Sales_Cfgs_Vk) {
        baseTypeData().setElementValue(27, Sales_Cfgs_Vk);
    }

    
    public hmh.sap.rfc.BapisdpartType[] getPartners_Ex() {
        hmh.sap.rfc.util.BapisdpartType_List i$ = (hmh.sap.rfc.util.BapisdpartType_List)baseTypeData().getElementValue(36);
        if ( i$ == null){return null;}
        return  i$.toArrayBapisdpartType();
    }

    
    public void setSales_Ccard(hmh.sap.rfc.BapiccardType[] Sales_Ccard) {
        baseTypeData().setElementValue(34, new hmh.sap.rfc.util.BapiccardType_List());
        hmh.sap.rfc.util.BapiccardType_List list$ = get_as_listSales_Ccard();
        for (int  i$ = 0; i$ < Sales_Ccard.length; i$++){
         list$.addBapiccardType(Sales_Ccard[ i$]);
        }
    }

    
    public hmh.sap.rfc.BapibtselType[] getBatch_Charc() {
        hmh.sap.rfc.util.BapibtselType_List i$ = (hmh.sap.rfc.util.BapibtselType_List)baseTypeData().getElementValue(44);
        if ( i$ == null){return null;}
        return  i$.toArrayBapibtselType();
    }

    
    public void setSales_Conditions_Inx(hmh.sap.rfc.BapicondxType[] Sales_Conditions_Inx) {
        baseTypeData().setElementValue(25, new hmh.sap.rfc.util.BapicondxType_List());
        hmh.sap.rfc.util.BapicondxType_List list$ = get_as_listSales_Conditions_Inx();
        for (int  i$ = 0; i$ < Sales_Conditions_Inx.length; i$++){
         list$.addBapicondxType(Sales_Conditions_Inx[ i$]);
        }
    }

    
    public void setTextlines_Ex(hmh.sap.rfc.util.BapitextliType_List Textlines_Ex) {
        baseTypeData().setElementValue(12, Textlines_Ex);
    }

    
    public hmh.sap.rfc.util.BapictrxType_List get_as_listSales_Contract_Inx() {
        return (hmh.sap.rfc.util.BapictrxType_List)baseTypeData().getElementValue(23);
    }

    
    public hmh.sap.rfc.BapicondType[] getConditions_Ex() {
        hmh.sap.rfc.util.BapicondType_List i$ = (hmh.sap.rfc.util.BapicondType_List)baseTypeData().getElementValue(42);
        if ( i$ == null){return null;}
        return  i$.toArrayBapicondType();
    }

    
    public void setPartneraddresses(hmh.sap.rfc.Bapiaddr1Type[] Partneraddresses) {
        baseTypeData().setElementValue(37, new hmh.sap.rfc.util.Bapiaddr1Type_List());
        hmh.sap.rfc.util.Bapiaddr1Type_List list$ = get_as_listPartneraddresses();
        for (int  i$ = 0; i$ < Partneraddresses.length; i$++){
         list$.addBapiaddr1Type(Partneraddresses[ i$]);
        }
    }

    
    public void setSchedule_Ex(hmh.sap.rfc.BapisdheduType[] Schedule_Ex) {
        baseTypeData().setElementValue(14, new hmh.sap.rfc.util.BapisdheduType_List());
        hmh.sap.rfc.util.BapisdheduType_List list$ = get_as_listSchedule_Ex();
        for (int  i$ = 0; i$ < Schedule_Ex.length; i$++){
         list$.addBapisdheduType(Schedule_Ex[ i$]);
        }
    }

    
    public hmh.sap.rfc.BapicuvkType[] getSales_Cfgs_Vk() {
        hmh.sap.rfc.util.BapicuvkType_List i$ = (hmh.sap.rfc.util.BapicuvkType_List)baseTypeData().getElementValue(27);
        if ( i$ == null){return null;}
        return  i$.toArrayBapicuvkType();
    }

    
    public hmh.sap.rfc.util.Bapiret2Type_List get_as_listReturn() {
        return (hmh.sap.rfc.util.Bapiret2Type_List)baseTypeData().getElementValue(35);
    }

    
    public void setSalesdocument(java.lang.String Salesdocument) {
        baseTypeData().setElementValue(6, Salesdocument);
    }

    
    public java.lang.String getConvert_Parvw_Auart() {
        return (java.lang.String)baseTypeData().getElementValueAsString(3);
    }

    
    public void setItems_Ex(hmh.sap.rfc.util.BapisditType_List Items_Ex) {
        baseTypeData().setElementValue(38, Items_Ex);
    }

    
    public hmh.sap.rfc.BapisditmxType[] getSales_Items_Inx() {
        hmh.sap.rfc.util.BapisditmxType_List i$ = (hmh.sap.rfc.util.BapisditmxType_List)baseTypeData().getElementValue(21);
        if ( i$ == null){return null;}
        return  i$.toArrayBapisditmxType();
    }

    
    public hmh.sap.rfc.util.BapisdtehdType_List get_as_listTextheaders_Ex() {
        return (hmh.sap.rfc.util.BapisdtehdType_List)baseTypeData().getElementValue(13);
    }

    
    public hmh.sap.rfc.BapiparnrType[] getSales_Partners() {
        hmh.sap.rfc.util.BapiparnrType_List i$ = (hmh.sap.rfc.util.BapiparnrType_List)baseTypeData().getElementValue(19);
        if ( i$ == null){return null;}
        return  i$.toArrayBapiparnrType();
    }

    
    public hmh.sap.rfc.BapicondType[] getSales_Conditions_In() {
        hmh.sap.rfc.util.BapicondType_List i$ = (hmh.sap.rfc.util.BapicondType_List)baseTypeData().getElementValue(26);
        if ( i$ == null){return null;}
        return  i$.toArrayBapicondType();
    }

    
    public void setSales_Keys(hmh.sap.rfc.BapisdkeyType[] Sales_Keys) {
        baseTypeData().setElementValue(20, new hmh.sap.rfc.util.BapisdkeyType_List());
        hmh.sap.rfc.util.BapisdkeyType_List list$ = get_as_listSales_Keys();
        for (int  i$ = 0; i$ < Sales_Keys.length; i$++){
         list$.addBapisdkeyType(Sales_Keys[ i$]);
        }
    }

    
    public hmh.sap.rfc.util.BapiincompType_List get_as_listIncomplete_Log() {
        return (hmh.sap.rfc.util.BapiincompType_List)baseTypeData().getElementValue(39);
    }

    
    public hmh.sap.rfc.BapicuprtType[] getSales_Cfgs_Part_Of() {
        hmh.sap.rfc.util.BapicuprtType_List i$ = (hmh.sap.rfc.util.BapicuprtType_List)baseTypeData().getElementValue(31);
        if ( i$ == null){return null;}
        return  i$.toArrayBapicuprtType();
    }

    
    public java.lang.String getBinary_Relationshiptype() {
        return (java.lang.String)baseTypeData().getElementValueAsString(1);
    }

    
    public void setBusiness_Ex(hmh.sap.rfc.util.BapisdbusiType_List Business_Ex) {
        baseTypeData().setElementValue(43, Business_Ex);
    }

    
    public void setIncomplete_Log(hmh.sap.rfc.BapiincompType[] Incomplete_Log) {
        baseTypeData().setElementValue(39, new hmh.sap.rfc.util.BapiincompType_List());
        hmh.sap.rfc.util.BapiincompType_List list$ = get_as_listIncomplete_Log();
        for (int  i$ = 0; i$ < Incomplete_Log.length; i$++){
         list$.addBapiincompType(Incomplete_Log[ i$]);
        }
    }

    
    public void setSales_Contract_Inx(hmh.sap.rfc.util.BapictrxType_List Sales_Contract_Inx) {
        baseTypeData().setElementValue(23, Sales_Contract_Inx);
    }

    
    public void setReturn(hmh.sap.rfc.util.Bapiret2Type_List Return) {
        baseTypeData().setElementValue(35, Return);
    }

    
    public void setSales_Sched_Conf_In(hmh.sap.rfc.util.Bapischdl2Type_List Sales_Sched_Conf_In) {
        baseTypeData().setElementValue(16, Sales_Sched_Conf_In);
    }

    
    public void setTextlines_Ex(hmh.sap.rfc.BapitextliType[] Textlines_Ex) {
        baseTypeData().setElementValue(12, new hmh.sap.rfc.util.BapitextliType_List());
        hmh.sap.rfc.util.BapitextliType_List list$ = get_as_listTextlines_Ex();
        for (int  i$ = 0; i$ < Textlines_Ex.length; i$++){
         list$.addBapitextliType(Textlines_Ex[ i$]);
        }
    }

    
    public void setSales_Keys(hmh.sap.rfc.util.BapisdkeyType_List Sales_Keys) {
        baseTypeData().setElementValue(20, Sales_Keys);
    }

    
    public hmh.sap.rfc.util.BapicurefType_List get_as_listSales_Cfgs_Refinst() {
        return (hmh.sap.rfc.util.BapicurefType_List)baseTypeData().getElementValue(29);
    }

    
    public void setIncomplete_Log(hmh.sap.rfc.util.BapiincompType_List Incomplete_Log) {
        baseTypeData().setElementValue(39, Incomplete_Log);
    }

    
    public void setSales_Cfgs_Inst(hmh.sap.rfc.util.BapicuinsType_List Sales_Cfgs_Inst) {
        baseTypeData().setElementValue(32, Sales_Cfgs_Inst);
    }

    
    public void setSales_Header_Inx(hmh.sap.rfc.Bapisdhd1XType Sales_Header_Inx) {
        baseTypeData().setElementValue(8, Sales_Header_Inx);
    }

    
    public void setBatch_Charc(hmh.sap.rfc.BapibtselType[] Batch_Charc) {
        baseTypeData().setElementValue(44, new hmh.sap.rfc.util.BapibtselType_List());
        hmh.sap.rfc.util.BapibtselType_List list$ = get_as_listBatch_Charc();
        for (int  i$ = 0; i$ < Batch_Charc.length; i$++){
         list$.addBapibtselType(Batch_Charc[ i$]);
        }
    }

    
    public hmh.sap.rfc.BapisdbusiType[] getBusiness_Ex() {
        hmh.sap.rfc.util.BapisdbusiType_List i$ = (hmh.sap.rfc.util.BapisdbusiType_List)baseTypeData().getElementValue(43);
        if ( i$ == null){return null;}
        return  i$.toArrayBapisdbusiType();
    }

    
    public void setConditions_Ex(hmh.sap.rfc.BapicondType[] Conditions_Ex) {
        baseTypeData().setElementValue(42, new hmh.sap.rfc.util.BapicondType_List());
        hmh.sap.rfc.util.BapicondType_List list$ = get_as_listConditions_Ex();
        for (int  i$ = 0; i$ < Conditions_Ex.length; i$++){
         list$.addBapicondType(Conditions_Ex[ i$]);
        }
    }

    
    public hmh.sap.rfc.util.BapicondType_List get_as_listConditions_Ex() {
        return (hmh.sap.rfc.util.BapicondType_List)baseTypeData().getElementValue(42);
    }

    
    public void setSales_Items_In(hmh.sap.rfc.util.BapisditmType_List Sales_Items_In) {
        baseTypeData().setElementValue(22, Sales_Items_In);
    }

    
    public hmh.sap.rfc.BapisdtehdType[] getTextheaders_Ex() {
        hmh.sap.rfc.util.BapisdtehdType_List i$ = (hmh.sap.rfc.util.BapisdtehdType_List)baseTypeData().getElementValue(13);
        if ( i$ == null){return null;}
        return  i$.toArrayBapisdtehdType();
    }

    
    public hmh.sap.rfc.Bapisdhd1Type getSales_Header_In() {
        return (hmh.sap.rfc.Bapisdhd1Type)baseTypeData().getElementValue(7);
    }

    
    public void setSales_Cfgs_Ref(hmh.sap.rfc.util.BapicucfgType_List Sales_Cfgs_Ref) {
        baseTypeData().setElementValue(30, Sales_Cfgs_Ref);
    }

    
    public void setExtensionin(hmh.sap.rfc.util.BapiparexType_List Extensionin) {
        baseTypeData().setElementValue(40, Extensionin);
    }

    
    public void setBusiness_Object(java.lang.String Business_Object) {
        baseTypeData().setElementValue(2, Business_Object);
    }

    
    public void setSales_Text(hmh.sap.rfc.util.BapisdtextType_List Sales_Text) {
        baseTypeData().setElementValue(15, Sales_Text);
    }

    
    public void setSales_Cfgs_Refinst(hmh.sap.rfc.util.BapicurefType_List Sales_Cfgs_Refinst) {
        baseTypeData().setElementValue(29, Sales_Cfgs_Refinst);
    }

    
    public hmh.sap.rfc.util.BapibtselType_List get_as_listBatch_Charc() {
        return (hmh.sap.rfc.util.BapibtselType_List)baseTypeData().getElementValue(44);
    }

    
    public hmh.sap.rfc.util.Bapiaddr1Type_List get_as_listPartneraddresses() {
        return (hmh.sap.rfc.util.Bapiaddr1Type_List)baseTypeData().getElementValue(37);
    }

    
    public void setPartners_Ex(hmh.sap.rfc.util.BapisdpartType_List Partners_Ex) {
        baseTypeData().setElementValue(36, Partners_Ex);
    }

    
    public void setBusiness_Ex(hmh.sap.rfc.BapisdbusiType[] Business_Ex) {
        baseTypeData().setElementValue(43, new hmh.sap.rfc.util.BapisdbusiType_List());
        hmh.sap.rfc.util.BapisdbusiType_List list$ = get_as_listBusiness_Ex();
        for (int  i$ = 0; i$ < Business_Ex.length; i$++){
         list$.addBapisdbusiType(Business_Ex[ i$]);
        }
    }

    
    public hmh.sap.rfc.BapisdheduType[] getSchedule_Ex() {
        hmh.sap.rfc.util.BapisdheduType_List i$ = (hmh.sap.rfc.util.BapisdheduType_List)baseTypeData().getElementValue(14);
        if ( i$ == null){return null;}
        return  i$.toArrayBapisdheduType();
    }

    
    public hmh.sap.rfc.BapisdlsType getLogic_Switch() {
        return (hmh.sap.rfc.BapisdlsType)baseTypeData().getElementValue(5);
    }

    
    public void setStatus_Buffer_Refresh(java.lang.String Status_Buffer_Refresh) {
        baseTypeData().setElementValue(10, Status_Buffer_Refresh);
    }

    
    public void setTestrun(java.lang.String Testrun) {
        baseTypeData().setElementValue(11, Testrun);
    }

    
    public hmh.sap.rfc.util.BapisdkeyType_List get_as_listSales_Keys() {
        return (hmh.sap.rfc.util.BapisdkeyType_List)baseTypeData().getElementValue(20);
    }

    
    public hmh.sap.rfc.util.BapiparexType_List get_as_listExtensionin() {
        return (hmh.sap.rfc.util.BapiparexType_List)baseTypeData().getElementValue(40);
    }

    
    public void setSales_Cfgs_Value(hmh.sap.rfc.util.BapicuvalType_List Sales_Cfgs_Value) {
        baseTypeData().setElementValue(28, Sales_Cfgs_Value);
    }

    
    public void setSales_Ccard(hmh.sap.rfc.util.BapiccardType_List Sales_Ccard) {
        baseTypeData().setElementValue(34, Sales_Ccard);
    }

    
    public hmh.sap.rfc.BapischdlType[] getSales_Schedules_In() {
        hmh.sap.rfc.util.BapischdlType_List i$ = (hmh.sap.rfc.util.BapischdlType_List)baseTypeData().getElementValue(18);
        if ( i$ == null){return null;}
        return  i$.toArrayBapischdlType();
    }

    
    public void setSales_Partners(hmh.sap.rfc.util.BapiparnrType_List Sales_Partners) {
        baseTypeData().setElementValue(19, Sales_Partners);
    }

    
    public void setItems_Ex(hmh.sap.rfc.BapisditType[] Items_Ex) {
        baseTypeData().setElementValue(38, new hmh.sap.rfc.util.BapisditType_List());
        hmh.sap.rfc.util.BapisditType_List list$ = get_as_listItems_Ex();
        for (int  i$ = 0; i$ < Items_Ex.length; i$++){
         list$.addBapisditType(Items_Ex[ i$]);
        }
    }

    
    public hmh.sap.rfc.BapicucfgType[] getSales_Cfgs_Ref() {
        hmh.sap.rfc.util.BapicucfgType_List i$ = (hmh.sap.rfc.util.BapicucfgType_List)baseTypeData().getElementValue(30);
        if ( i$ == null){return null;}
        return  i$.toArrayBapicucfgType();
    }

    
    public hmh.sap.rfc.util.BapisdheduType_List get_as_listSchedule_Ex() {
        return (hmh.sap.rfc.util.BapisdheduType_List)baseTypeData().getElementValue(14);
    }

    
    public void setSales_Cfgs_Ref(hmh.sap.rfc.BapicucfgType[] Sales_Cfgs_Ref) {
        baseTypeData().setElementValue(30, new hmh.sap.rfc.util.BapicucfgType_List());
        hmh.sap.rfc.util.BapicucfgType_List list$ = get_as_listSales_Cfgs_Ref();
        for (int  i$ = 0; i$ < Sales_Cfgs_Ref.length; i$++){
         list$.addBapicucfgType(Sales_Cfgs_Ref[ i$]);
        }
    }

    
    public void setSales_Schedules_Inx(hmh.sap.rfc.util.BapischdlxType_List Sales_Schedules_Inx) {
        baseTypeData().setElementValue(17, Sales_Schedules_Inx);
    }

    
    public hmh.sap.rfc.util.BapicuprtType_List get_as_listSales_Cfgs_Part_Of() {
        return (hmh.sap.rfc.util.BapicuprtType_List)baseTypeData().getElementValue(31);
    }

    
    public void setSales_Sched_Conf_In(hmh.sap.rfc.Bapischdl2Type[] Sales_Sched_Conf_In) {
        baseTypeData().setElementValue(16, new hmh.sap.rfc.util.Bapischdl2Type_List());
        hmh.sap.rfc.util.Bapischdl2Type_List list$ = get_as_listSales_Sched_Conf_In();
        for (int  i$ = 0; i$ < Sales_Sched_Conf_In.length; i$++){
         list$.addBapischdl2Type(Sales_Sched_Conf_In[ i$]);
        }
    }

    
    public java.lang.String getTestrun() {
        return (java.lang.String)baseTypeData().getElementValueAsString(11);
    }

    
    public void setTextheaders_Ex(hmh.sap.rfc.BapisdtehdType[] Textheaders_Ex) {
        baseTypeData().setElementValue(13, new hmh.sap.rfc.util.BapisdtehdType_List());
        hmh.sap.rfc.util.BapisdtehdType_List list$ = get_as_listTextheaders_Ex();
        for (int  i$ = 0; i$ < Textheaders_Ex.length; i$++){
         list$.addBapisdtehdType(Textheaders_Ex[ i$]);
        }
    }

    
    public void setBinary_Relationshiptype(java.lang.String Binary_Relationshiptype) {
        baseTypeData().setElementValue(1, Binary_Relationshiptype);
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  Sd_Salesdocument_Create_Input parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Sd_Salesdocument_Create_Input parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getBusiness_Ex() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(43);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSales_Text() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(15);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSales_Header_In() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(7);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTextheaders_Ex() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(13);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getItems_Ex() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(38);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getIncomplete_Log() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(39);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPartneraddresses() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(37);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getBusiness_Object() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSales_Schedules_Inx() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(17);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSales_Keys() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(20);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSales_Ccard() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(34);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSales_Items_In() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(22);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSender() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(9);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSalesdocument() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(6);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getReturn() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(35);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSales_Conditions_Inx() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(25);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPartners_Ex() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(36);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getBatch_Charc() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(44);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getInt_Number_Assignment() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(4);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSchedule_Ex() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(14);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getExtensionin() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(40);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getLogic_Switch() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(5);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSales_Cfgs_Value() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(28);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSales_Contract_In() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(24);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getConditions_Ex() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(42);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSales_Cfgs_Refinst() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(29);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getBehave_When_Error() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSales_Cfgs_Vk() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(27);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getConvert_Parvw_Auart() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSales_Items_Inx() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(21);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSales_Conditions_In() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(26);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSales_Partners() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(19);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getExtensionex() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(41);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSales_Cfgs_Part_Of() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(31);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSales_Schedules_In() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(18);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSales_Cfgs_Ref() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(30);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getBinary_Relationshiptype() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTextlines_Ex() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(12);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSales_Cfgs_Inst() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(32);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getStatus_Buffer_Refresh() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(10);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSales_Sched_Conf_In() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(16);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSales_Contract_Inx() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(23);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTestrun() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(11);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSales_Header_Inx() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(8);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSales_Cfgs_Blob() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(33);
        }
    
    }

}
