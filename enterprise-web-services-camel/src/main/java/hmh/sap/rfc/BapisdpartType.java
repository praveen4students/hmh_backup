package hmh.sap.rfc;


public class BapisdpartType extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1354127028442L) ;

    private  BapisdpartType.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.XSDL_COMPLEX_TYPE, "urn:sap-com:document:sap:rfc:functions", "BAPISDPART", 25, 0, hmh.sap.rfc.BapisdpartType.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "BAPISDPART", 180, 360, -1, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"BAPISDPART\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">BAPI Structure of VBPA with English Field Names</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>110</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>180</ifr:internalLength1><ifr:internalLength2>360</ifr:internalLength2></ifr:definition></ifr:container></s0:type>");
        descriptorSetElementProperties(descriptor, 0, "OPERATION", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Operation", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "OPERATION", 0, 0, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"OPERATION\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Function</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>0</ifr:offset1><ifr:offset2>0</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MSGFN\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 1, "SD_DOC", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Sd_Doc", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "SD_DOC", 3, 6, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SD_DOC\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Sales and Distribution Document Number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>3</ifr:offset1><ifr:offset2>6</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VBELN\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 2, "ITM_NUMBER", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Itm_Number", java.lang.String.class, null, new java.lang.String[][]{{"pattern", "\\d+"}, {"maxLength", "6"}}, "ITM_NUMBER", 13, 26, -1, 6, 12, -1, com.sap.mw.jco.JCO.TYPE_NUM, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ITM_NUMBER\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Item number of the SD document</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>13</ifr:offset1><ifr:offset2>26</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"POSNR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>NUMC</ifr:type><ifr:abapType>N</ifr:abapType><ifr:length>6</ifr:length><ifr:internalLength1>6</ifr:internalLength1><ifr:internalLength2>12</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>6</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 3, "PARTN_ROLE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Partn_Role", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "PARTN_ROLE", 19, 38, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PARTN_ROLE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Partner function</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>19</ifr:offset1><ifr:offset2>38</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PARVW\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength><ifr:conversionExit>PARVW</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 4, "CUSTOMER", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Customer", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "CUSTOMER", 21, 42, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CUSTOMER\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Customer Number 1</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>21</ifr:offset1><ifr:offset2>42</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KUNNR\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 5, "VENDOR_NO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Vendor_No", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "VENDOR_NO", 31, 62, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"VENDOR_NO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Account Number of Vendor or Creditor</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>31</ifr:offset1><ifr:offset2>62</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"LIFNR\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 6, "PERSON_NO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Person_No", java.lang.String.class, null, new java.lang.String[][]{{"pattern", "\\d+"}, {"maxLength", "8"}}, "PERSON_NO", 41, 82, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_NUM, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PERSON_NO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Personnel Number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>41</ifr:offset1><ifr:offset2>82</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PERNR_D\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>NUMC</ifr:type><ifr:abapType>N</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>8</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 7, "CONTACT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Contact", java.lang.String.class, null, new java.lang.String[][]{{"pattern", "\\d+"}, {"maxLength", "10"}}, "CONTACT", 49, 98, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_NUM, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CONTACT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Number of contact person</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>49</ifr:offset1><ifr:offset2>98</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PARNR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>NUMC</ifr:type><ifr:abapType>N</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 8, "ADDRESS", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Address", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "ADDRESS", 59, 118, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ADDRESS\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Address</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>59</ifr:offset1><ifr:offset2>118</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ADRNR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 9, "UNLOAD_PT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Unload_Pt", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "25"}}, "UNLOAD_PT", 69, 138, -1, 25, 50, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"UNLOAD_PT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Unloading Point</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>69</ifr:offset1><ifr:offset2>138</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ABLAD\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>25</ifr:length><ifr:internalLength1>25</ifr:internalLength1><ifr:internalLength2>50</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>25</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 10, "COUNTRY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Country", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "COUNTRY", 94, 188, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"COUNTRY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Country Key</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>94</ifr:offset1><ifr:offset2>188</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"LAND1\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 11, "COUNTRYISO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Countryiso", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "COUNTRYISO", 97, 194, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"COUNTRYISO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Country ISO code</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>97</ifr:offset1><ifr:offset2>194</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"INTCA\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 12, "ADDRE_INDI", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Addre_Indi", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "ADDRE_INDI", 99, 198, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ADDRE_INDI\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Address indicator</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>99</ifr:offset1><ifr:offset2>198</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ADRDA\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 13, "ACC_1_TIME", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Acc_1_Time", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "ACC_1_TIME", 100, 200, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ACC_1_TIME\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Indicator: Is the account a one-time account?</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>100</ifr:offset1><ifr:offset2>200</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"XCPDK\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 14, "CUSTHITYP", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Custhityp", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "CUSTHITYP", 101, 202, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CUSTHITYP\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Customer hierarchy type</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>101</ifr:offset1><ifr:offset2>202</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"HITYP_KH\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 15, "PRIC_REL", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Pric_Rel", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PRIC_REL", 102, 204, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PRIC_REL\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Relevant for price determination ID</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>102</ifr:offset1><ifr:offset2>204</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PRFRE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 16, "REBATE_REL", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Rebate_Rel", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "REBATE_REL", 103, 206, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REBATE_REL\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">ID: Customer is to receive rebates</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>103</ifr:offset1><ifr:offset2>206</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BOKRE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 17, "LEVEL_NR", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Level_Nr", java.lang.String.class, null, new java.lang.String[][]{{"pattern", "\\d+"}, {"maxLength", "2"}}, "LEVEL_NR", 104, 208, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_NUM, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"LEVEL_NR\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Level number within hierarchy</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>104</ifr:offset1><ifr:offset2>208</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"HISTUNR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>NUMC</ifr:type><ifr:abapType>N</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 18, "DESC_PARTN", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Desc_Partn", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "30"}}, "DESC_PARTN", 106, 212, -1, 30, 60, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DESC_PARTN\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Customer description of partner (plant, storage location)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>106</ifr:offset1><ifr:offset2>212</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KNREF\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>30</ifr:length><ifr:internalLength1>30</ifr:internalLength1><ifr:internalLength2>60</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>30</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 19, "TRANSPZONE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Transpzone", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "TRANSPZONE", 136, 272, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TRANSPZONE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Transportation zone to or from which the goods are delivered</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>136</ifr:offset1><ifr:offset2>272</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"LZONE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 20, "ASSIGN_HI", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Assign_Hi", java.lang.String.class, null, new java.lang.String[][]{{"pattern", "\\d+"}, {"maxLength", "2"}}, "ASSIGN_HI", 146, 292, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_NUM, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ASSIGN_HI\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Assignment to Hierarchy</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>146</ifr:offset1><ifr:offset2>292</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"HZUOR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>NUMC</ifr:type><ifr:abapType>N</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 21, "VAT_REG_NO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Vat_Reg_No", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "20"}}, "VAT_REG_NO", 148, 296, -1, 20, 40, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"VAT_REG_NO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">VAT registration number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>148</ifr:offset1><ifr:offset2>296</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"STCEG\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>20</ifr:length><ifr:internalLength1>20</ifr:internalLength1><ifr:internalLength2>40</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>20</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 22, "FURTHERPAR", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Furtherpar", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "FURTHERPAR", 168, 336, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"FURTHERPAR\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Indicator &apos;further partners in this function&apos; (VBPA2)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>168</ifr:offset1><ifr:offset2>336</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PARTNER_FF\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 23, "PERS_NO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Pers_No", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "PERS_NO", 169, 338, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PERS_NO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Person number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>169</ifr:offset1><ifr:offset2>338</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_PERSNUM\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 24, "CALEND_UPD", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Calend_Upd", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "CALEND_UPD", 179, 358, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CALEND_UPD\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Maintain appointments in calendar</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>179</ifr:offset1><ifr:offset2>358</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KALE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        staticDescriptor = descriptor;
    }
    public  BapisdpartType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    protected  BapisdpartType (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    
    public void setAddre_Indi(java.lang.String Addre_Indi) {
        baseTypeData().setElementValue(12, Addre_Indi);
    }

    
    public java.lang.String getCountryiso() {
        return (java.lang.String)baseTypeData().getElementValueAsString(11);
    }

    
    public java.lang.String getPartn_Role() {
        return (java.lang.String)baseTypeData().getElementValueAsString(3);
    }

    
    public void setSd_Doc(java.lang.String Sd_Doc) {
        baseTypeData().setElementValue(1, Sd_Doc);
    }

    
    public java.lang.String getOperation() {
        return (java.lang.String)baseTypeData().getElementValueAsString(0);
    }

    
    public java.lang.String getCountry() {
        return (java.lang.String)baseTypeData().getElementValueAsString(10);
    }

    
    public void setRebate_Rel(java.lang.String Rebate_Rel) {
        baseTypeData().setElementValue(16, Rebate_Rel);
    }

    
    public void setCountryiso(java.lang.String Countryiso) {
        baseTypeData().setElementValue(11, Countryiso);
    }

    
    public void setFurtherpar(java.lang.String Furtherpar) {
        baseTypeData().setElementValue(22, Furtherpar);
    }

    
    public java.lang.String getCalend_Upd() {
        return (java.lang.String)baseTypeData().getElementValueAsString(24);
    }

    
    public void setItm_Number(java.lang.String Itm_Number) {
        baseTypeData().setElementValue(2, Itm_Number);
    }

    
    public java.lang.String getVendor_No() {
        return (java.lang.String)baseTypeData().getElementValueAsString(5);
    }

    
    public void setCusthityp(java.lang.String Custhityp) {
        baseTypeData().setElementValue(14, Custhityp);
    }

    
    public void setPers_No(java.lang.String Pers_No) {
        baseTypeData().setElementValue(23, Pers_No);
    }

    
    public java.lang.String getPerson_No() {
        return (java.lang.String)baseTypeData().getElementValueAsString(6);
    }

    
    public void setTranspzone(java.lang.String Transpzone) {
        baseTypeData().setElementValue(19, Transpzone);
    }

    
    public void setUnload_Pt(java.lang.String Unload_Pt) {
        baseTypeData().setElementValue(9, Unload_Pt);
    }

    
    public java.lang.String getRebate_Rel() {
        return (java.lang.String)baseTypeData().getElementValueAsString(16);
    }

    
    public void setDesc_Partn(java.lang.String Desc_Partn) {
        baseTypeData().setElementValue(18, Desc_Partn);
    }

    
    public java.lang.String getTranspzone() {
        return (java.lang.String)baseTypeData().getElementValueAsString(19);
    }

    
    public void setPartn_Role(java.lang.String Partn_Role) {
        baseTypeData().setElementValue(3, Partn_Role);
    }

    
    public java.lang.String getDesc_Partn() {
        return (java.lang.String)baseTypeData().getElementValueAsString(18);
    }

    
    public java.lang.String getContact() {
        return (java.lang.String)baseTypeData().getElementValueAsString(7);
    }

    
    public java.lang.String getVat_Reg_No() {
        return (java.lang.String)baseTypeData().getElementValueAsString(21);
    }

    
    public void setPric_Rel(java.lang.String Pric_Rel) {
        baseTypeData().setElementValue(15, Pric_Rel);
    }

    
    public void setPerson_No(java.lang.String Person_No) {
        baseTypeData().setElementValue(6, Person_No);
    }

    
    public java.lang.String getCusthityp() {
        return (java.lang.String)baseTypeData().getElementValueAsString(14);
    }

    
    public void setCountry(java.lang.String Country) {
        baseTypeData().setElementValue(10, Country);
    }

    
    public java.lang.String getAssign_Hi() {
        return (java.lang.String)baseTypeData().getElementValueAsString(20);
    }

    
    public void setVendor_No(java.lang.String Vendor_No) {
        baseTypeData().setElementValue(5, Vendor_No);
    }

    
    public java.lang.String getAddress() {
        return (java.lang.String)baseTypeData().getElementValueAsString(8);
    }

    
    public java.lang.String getPers_No() {
        return (java.lang.String)baseTypeData().getElementValueAsString(23);
    }

    
    public MetaData metadata() {
        return metadata;
    }

    
    public void setContact(java.lang.String Contact) {
        baseTypeData().setElementValue(7, Contact);
    }

    
    public java.lang.String getAcc_1_Time() {
        return (java.lang.String)baseTypeData().getElementValueAsString(13);
    }

    
    public java.lang.String getSd_Doc() {
        return (java.lang.String)baseTypeData().getElementValueAsString(1);
    }

    
    public void setCustomer(java.lang.String Customer) {
        baseTypeData().setElementValue(4, Customer);
    }

    
    public java.lang.String getAddre_Indi() {
        return (java.lang.String)baseTypeData().getElementValueAsString(12);
    }

    
    public void setAddress(java.lang.String Address) {
        baseTypeData().setElementValue(8, Address);
    }

    
    public java.lang.String getFurtherpar() {
        return (java.lang.String)baseTypeData().getElementValueAsString(22);
    }

    
    public void setAssign_Hi(java.lang.String Assign_Hi) {
        baseTypeData().setElementValue(20, Assign_Hi);
    }

    
    public void setOperation(java.lang.String Operation) {
        baseTypeData().setElementValue(0, Operation);
    }

    
    public java.lang.String getCustomer() {
        return (java.lang.String)baseTypeData().getElementValueAsString(4);
    }

    
    public void setVat_Reg_No(java.lang.String Vat_Reg_No) {
        baseTypeData().setElementValue(21, Vat_Reg_No);
    }

    
    public void setLevel_Nr(java.lang.String Level_Nr) {
        baseTypeData().setElementValue(17, Level_Nr);
    }

    
    public void setCalend_Upd(java.lang.String Calend_Upd) {
        baseTypeData().setElementValue(24, Calend_Upd);
    }

    
    public void setAcc_1_Time(java.lang.String Acc_1_Time) {
        baseTypeData().setElementValue(13, Acc_1_Time);
    }

    
    public java.lang.String getUnload_Pt() {
        return (java.lang.String)baseTypeData().getElementValueAsString(9);
    }

    
    public java.lang.String getItm_Number() {
        return (java.lang.String)baseTypeData().getElementValueAsString(2);
    }

    
    public java.lang.String getLevel_Nr() {
        return (java.lang.String)baseTypeData().getElementValueAsString(17);
    }

    
    public java.lang.String getPric_Rel() {
        return (java.lang.String)baseTypeData().getElementValueAsString(15);
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  BapisdpartType parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (BapisdpartType parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCusthityp() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(14);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getAssign_Hi() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(20);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCountryiso() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(11);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPartn_Role() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getAddress() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(8);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPers_No() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(23);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getOperation() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCountry() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(10);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getAcc_1_Time() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(13);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSd_Doc() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getAddre_Indi() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(12);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCalend_Upd() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(24);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getFurtherpar() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(22);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getVendor_No() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(5);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCustomer() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(4);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPerson_No() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(6);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRebate_Rel() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(16);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getUnload_Pt() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(9);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getItm_Number() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTranspzone() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(19);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getLevel_Nr() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(17);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDesc_Partn() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(18);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getContact() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(7);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getVat_Reg_No() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(21);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPric_Rel() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(15);
        }
    
    }

}
