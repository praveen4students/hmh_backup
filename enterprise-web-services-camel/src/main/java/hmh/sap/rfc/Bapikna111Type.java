package hmh.sap.rfc;


public class Bapikna111Type extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1335986960830L) ;

    private  Bapikna111Type.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.XSDL_COMPLEX_TYPE, "urn:sap-com:document:sap:rfc:functions", "BAPIKNA111", 19, 0, hmh.sap.rfc.Bapikna111Type.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "BAPIKNA111", 680, 1360, -1, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"BAPIKNA111\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Transfer Structure KNA1/Search Results</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>680</ifr:internalLength1><ifr:internalLength2>1360</ifr:internalLength2></ifr:definition></ifr:container></s0:type>");
        descriptorSetElementProperties(descriptor, 0, "COMP_CODE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Comp_Code", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "COMP_CODE", 0, 0, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"COMP_CODE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Company Code</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>T001</ifr:checkTable><ifr:offset1>0</ifr:offset1><ifr:offset2>0</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BUKRS\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 1, "TABNAME", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Tabname", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "30"}}, "TABNAME", 4, 8, -1, 30, 60, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TABNAME\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Table Name</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>DD02L</ifr:checkTable><ifr:offset1>4</ifr:offset1><ifr:offset2>8</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"TABNAME\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>30</ifr:length><ifr:internalLength1>30</ifr:internalLength1><ifr:internalLength2>60</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>30</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 2, "FIELDNAME", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Fieldname", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "30"}}, "FIELDNAME", 34, 68, -1, 30, 60, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"FIELDNAME\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Field Name</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>DD03L</ifr:checkTable><ifr:offset1>34</ifr:offset1><ifr:offset2>68</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"FIELDNAME\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>30</ifr:length><ifr:internalLength1>30</ifr:internalLength1><ifr:internalLength2>60</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>30</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 3, "FIELDVALUE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Fieldvalue", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "132"}}, "FIELDVALUE", 64, 128, -1, 132, 264, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"FIELDVALUE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Field value</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>64</ifr:offset1><ifr:offset2>128</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"FIELDVALUE\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>132</ifr:length><ifr:internalLength1>132</ifr:internalLength1><ifr:internalLength2>264</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>132</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 4, "CUSTOMER", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Customer", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "CUSTOMER", 196, 392, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CUSTOMER\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Customer Number 1</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>KNA1</ifr:checkTable><ifr:offset1>196</ifr:offset1><ifr:offset2>392</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KUNNR\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 5, "PSTG_BLK_G", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Pstg_Blk_G", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PSTG_BLK_G", 206, 412, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PSTG_BLK_G\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Central posting block</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>206</ifr:offset1><ifr:offset2>412</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"SPERB_X\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 6, "PSTG_BLK_C", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Pstg_Blk_C", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PSTG_BLK_C", 207, 414, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PSTG_BLK_C\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Posting block for company code</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>207</ifr:offset1><ifr:offset2>414</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"SPERB_B\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 7, "DEL_FLAG_G", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Del_Flag_G", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "DEL_FLAG_G", 208, 416, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DEL_FLAG_G\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Central Deletion Flag for Master Record</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>208</ifr:offset1><ifr:offset2>416</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"LOEVM_X\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 8, "DEL_FLAG_C", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Del_Flag_C", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "DEL_FLAG_C", 209, 418, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DEL_FLAG_C\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Deletion Flag for Master Record (Company Code Level)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>209</ifr:offset1><ifr:offset2>418</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"LOEVM_B\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 9, "TYPE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Type", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "TYPE", 210, 420, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TYPE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Message type: S Success, E Error, W Warning, I Info, A Abort</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>210</ifr:offset1><ifr:offset2>420</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPI_MTYPE\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 10, "ID", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Id", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "20"}}, "ID", 211, 422, -1, 20, 40, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ID\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Messages, Message Class</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>T100A</ifr:checkTable><ifr:offset1>211</ifr:offset1><ifr:offset2>422</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"SYMSGID\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>20</ifr:length><ifr:internalLength1>20</ifr:internalLength1><ifr:internalLength2>40</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>20</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 11, "NUMBER", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Number", java.lang.String.class, null, new java.lang.String[][]{{"pattern", "\\d+"}, {"maxLength", "3"}}, "NUMBER", 231, 462, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_NUM, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"NUMBER\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Messages, Message Number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>231</ifr:offset1><ifr:offset2>462</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"SYMSGNO\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>NUMC</ifr:type><ifr:abapType>N</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 12, "MESSAGE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Message", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "220"}}, "MESSAGE", 234, 468, -1, 220, 440, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MESSAGE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Message Text</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>234</ifr:offset1><ifr:offset2>468</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPI_MSG\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>220</ifr:length><ifr:internalLength1>220</ifr:internalLength1><ifr:internalLength2>440</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>220</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 13, "LOG_NO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Log_No", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "20"}}, "LOG_NO", 454, 908, -1, 20, 40, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"LOG_NO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Application log: log number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>BALHDR</ifr:checkTable><ifr:offset1>454</ifr:offset1><ifr:offset2>908</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BALOGNR\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>20</ifr:length><ifr:internalLength1>20</ifr:internalLength1><ifr:internalLength2>40</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>20</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 14, "LOG_MSG_NO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Log_Msg_No", java.lang.String.class, null, new java.lang.String[][]{{"pattern", "\\d+"}, {"maxLength", "6"}}, "LOG_MSG_NO", 474, 948, -1, 6, 12, -1, com.sap.mw.jco.JCO.TYPE_NUM, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"LOG_MSG_NO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Application log: Internal message serial number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>BALM</ifr:checkTable><ifr:offset1>474</ifr:offset1><ifr:offset2>948</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BALMNR\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>NUMC</ifr:type><ifr:abapType>N</ifr:abapType><ifr:length>6</ifr:length><ifr:internalLength1>6</ifr:internalLength1><ifr:internalLength2>12</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>6</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 15, "MESSAGE_V1", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Message_V1", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "50"}}, "MESSAGE_V1", 480, 960, -1, 50, 100, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MESSAGE_V1\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Messages, Message Variable</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>480</ifr:offset1><ifr:offset2>960</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"SYMSGV\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>50</ifr:length><ifr:internalLength1>50</ifr:internalLength1><ifr:internalLength2>100</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>50</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 16, "MESSAGE_V2", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Message_V2", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "50"}}, "MESSAGE_V2", 530, 1060, -1, 50, 100, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MESSAGE_V2\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Messages, Message Variable</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>530</ifr:offset1><ifr:offset2>1060</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"SYMSGV\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>50</ifr:length><ifr:internalLength1>50</ifr:internalLength1><ifr:internalLength2>100</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>50</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 17, "MESSAGE_V3", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Message_V3", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "50"}}, "MESSAGE_V3", 580, 1160, -1, 50, 100, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MESSAGE_V3\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Messages, Message Variable</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>580</ifr:offset1><ifr:offset2>1160</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"SYMSGV\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>50</ifr:length><ifr:internalLength1>50</ifr:internalLength1><ifr:internalLength2>100</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>50</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 18, "MESSAGE_V4", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Message_V4", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "50"}}, "MESSAGE_V4", 630, 1260, -1, 50, 100, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MESSAGE_V4\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Messages, Message Variable</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>630</ifr:offset1><ifr:offset2>1260</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"SYMSGV\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>50</ifr:length><ifr:internalLength1>50</ifr:internalLength1><ifr:internalLength2>100</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>50</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        staticDescriptor = descriptor;
    }
    public  Bapikna111Type () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    protected  Bapikna111Type (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    
    public java.lang.String getPstg_Blk_C() {
        return (java.lang.String)baseTypeData().getElementValueAsString(6);
    }

    
    public void setFieldvalue(java.lang.String Fieldvalue) {
        baseTypeData().setElementValue(3, Fieldvalue);
    }

    
    public void setId(java.lang.String Id) {
        baseTypeData().setElementValue(10, Id);
    }

    
    public java.lang.String getNumber() {
        return (java.lang.String)baseTypeData().getElementValueAsString(11);
    }

    
    public java.lang.String getMessage() {
        return (java.lang.String)baseTypeData().getElementValueAsString(12);
    }

    
    public void setTabname(java.lang.String Tabname) {
        baseTypeData().setElementValue(1, Tabname);
    }

    
    public void setMessage_V2(java.lang.String Message_V2) {
        baseTypeData().setElementValue(16, Message_V2);
    }

    
    public java.lang.String getLog_Msg_No() {
        return (java.lang.String)baseTypeData().getElementValueAsString(14);
    }

    
    public java.lang.String getFieldname() {
        return (java.lang.String)baseTypeData().getElementValueAsString(2);
    }

    
    public java.lang.String getMessage_V2() {
        return (java.lang.String)baseTypeData().getElementValueAsString(16);
    }

    
    public void setDel_Flag_C(java.lang.String Del_Flag_C) {
        baseTypeData().setElementValue(8, Del_Flag_C);
    }

    
    public MetaData metadata() {
        return metadata;
    }

    
    public void setMessage_V3(java.lang.String Message_V3) {
        baseTypeData().setElementValue(17, Message_V3);
    }

    
    public void setCustomer(java.lang.String Customer) {
        baseTypeData().setElementValue(4, Customer);
    }

    
    public java.lang.String getMessage_V4() {
        return (java.lang.String)baseTypeData().getElementValueAsString(18);
    }

    
    public void setPstg_Blk_C(java.lang.String Pstg_Blk_C) {
        baseTypeData().setElementValue(6, Pstg_Blk_C);
    }

    
    public void setLog_Msg_No(java.lang.String Log_Msg_No) {
        baseTypeData().setElementValue(14, Log_Msg_No);
    }

    
    public void setMessage(java.lang.String Message) {
        baseTypeData().setElementValue(12, Message);
    }

    
    public java.lang.String getTabname() {
        return (java.lang.String)baseTypeData().getElementValueAsString(1);
    }

    
    public java.lang.String getFieldvalue() {
        return (java.lang.String)baseTypeData().getElementValueAsString(3);
    }

    
    public void setType(java.lang.String Type) {
        baseTypeData().setElementValue(9, Type);
    }

    
    public void setMessage_V1(java.lang.String Message_V1) {
        baseTypeData().setElementValue(15, Message_V1);
    }

    
    public void setDel_Flag_G(java.lang.String Del_Flag_G) {
        baseTypeData().setElementValue(7, Del_Flag_G);
    }

    
    public java.lang.String getDel_Flag_C() {
        return (java.lang.String)baseTypeData().getElementValueAsString(8);
    }

    
    public java.lang.String getCustomer() {
        return (java.lang.String)baseTypeData().getElementValueAsString(4);
    }

    
    public void setFieldname(java.lang.String Fieldname) {
        baseTypeData().setElementValue(2, Fieldname);
    }

    
    public java.lang.String getDel_Flag_G() {
        return (java.lang.String)baseTypeData().getElementValueAsString(7);
    }

    
    public java.lang.String getType() {
        return (java.lang.String)baseTypeData().getElementValueAsString(9);
    }

    
    public void setLog_No(java.lang.String Log_No) {
        baseTypeData().setElementValue(13, Log_No);
    }

    
    public java.lang.String getPstg_Blk_G() {
        return (java.lang.String)baseTypeData().getElementValueAsString(5);
    }

    
    public void setNumber(java.lang.String Number) {
        baseTypeData().setElementValue(11, Number);
    }

    
    public java.lang.String getMessage_V1() {
        return (java.lang.String)baseTypeData().getElementValueAsString(15);
    }

    
    public void setPstg_Blk_G(java.lang.String Pstg_Blk_G) {
        baseTypeData().setElementValue(5, Pstg_Blk_G);
    }

    
    public java.lang.String getComp_Code() {
        return (java.lang.String)baseTypeData().getElementValueAsString(0);
    }

    
    public java.lang.String getMessage_V3() {
        return (java.lang.String)baseTypeData().getElementValueAsString(17);
    }

    
    public void setMessage_V4(java.lang.String Message_V4) {
        baseTypeData().setElementValue(18, Message_V4);
    }

    
    public java.lang.String getId() {
        return (java.lang.String)baseTypeData().getElementValueAsString(10);
    }

    
    public java.lang.String getLog_No() {
        return (java.lang.String)baseTypeData().getElementValueAsString(13);
    }

    
    public void setComp_Code(java.lang.String Comp_Code) {
        baseTypeData().setElementValue(0, Comp_Code);
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  Bapikna111Type parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Bapikna111Type parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPstg_Blk_C() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(6);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMessage() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(12);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getNumber() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(11);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCustomer() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(4);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDel_Flag_G() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(7);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getType() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(9);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getLog_Msg_No() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(14);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getFieldname() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPstg_Blk_G() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(5);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMessage_V2() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(16);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMessage_V1() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(15);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getComp_Code() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMessage_V3() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(17);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getId() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(10);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getLog_No() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(13);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMessage_V4() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(18);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTabname() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getFieldvalue() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDel_Flag_C() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(8);
        }
    
    }

}
