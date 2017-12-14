package hmh.sap.rfc;


public class Zvfindtrans_IpType extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1329338318028L) ;

    private  Zvfindtrans_IpType.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.XSDL_COMPLEX_TYPE, "urn:sap-com:document:sap:rfc:functions", "ZVFINDTRANS_IP", 17, 0, hmh.sap.rfc.Zvfindtrans_IpType.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "ZVFINDTRANS_IP", 161, 322, -1, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"ZVFINDTRANS_IP\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">I/P parameters for find transaction method</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>161</ifr:internalLength1><ifr:internalLength2>322</ifr:internalLength2></ifr:definition></ifr:container></s0:type>");
        descriptorSetElementProperties(descriptor, 0, "SEARCHTYPE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Searchtype", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "SEARCHTYPE", 0, 0, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SEARCHTYPE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Search Type - (blank for standard Find transactions)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>0</ifr:offset1><ifr:offset2>0</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 1, "CUSTOMER", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Customer", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "CUSTOMER", 2, 4, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CUSTOMER\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Customer Number 1</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>2</ifr:offset1><ifr:offset2>4</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KUNNR\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 2, "CLIENTTID", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Clienttid", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "12"}}, "CLIENTTID", 12, 24, -1, 12, 24, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CLIENTTID\" category=\"simple\"><ifr:descriptor /><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>12</ifr:offset1><ifr:offset2>24</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>12</ifr:length><ifr:internalLength1>12</ifr:internalLength1><ifr:internalLength2>24</ifr:internalLength2><ifr:decimals>0</ifr:decimals></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 3, "FROMDATE", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Fromdate", java.sql.Date.class, null, new java.lang.String[][]{}, "FROMDATE", 24, 48, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"FROMDATE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Document date (date received/sent)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>24</ifr:offset1><ifr:offset2>48</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AUDAT\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 4, "TODATE", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Todate", java.sql.Date.class, null, new java.lang.String[][]{}, "TODATE", 32, 64, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TODATE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Document date (date received/sent)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>32</ifr:offset1><ifr:offset2>64</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AUDAT\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 5, "LIMIT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Limit", java.lang.String.class, null, new java.lang.String[][]{{"pattern", "\\d+"}, {"maxLength", "4"}}, "LIMIT", 40, 80, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_NUM, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"LIMIT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">limit of result</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>40</ifr:offset1><ifr:offset2>80</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ZV_LIMIT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>NUMC</ifr:type><ifr:abapType>N</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 6, "INVOICE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Invoice", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "INVOICE", 44, 88, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"INVOICE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Sales and Distribution Document Number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>44</ifr:offset1><ifr:offset2>88</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VBELN\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 7, "PONO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Pono", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "35"}}, "PONO", 54, 108, -1, 35, 70, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PONO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Customer purchase order number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>54</ifr:offset1><ifr:offset2>108</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BSTKD\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>35</ifr:length><ifr:internalLength1>35</ifr:internalLength1><ifr:internalLength2>70</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>35</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 8, "ISBN", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Isbn", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "18"}}, "ISBN", 89, 178, -1, 18, 36, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ISBN\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Identification Code</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>89</ifr:offset1><ifr:offset2>178</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ISMIDENTCODE\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>18</ifr:length><ifr:internalLength1>18</ifr:internalLength1><ifr:internalLength2>36</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>18</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 9, "MATERIAL", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Material", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "18"}}, "MATERIAL", 107, 214, -1, 18, 36, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MATERIAL\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Material Number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>107</ifr:offset1><ifr:offset2>214</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MATNR\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>18</ifr:length><ifr:internalLength1>18</ifr:internalLength1><ifr:internalLength2>36</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>18</ifr:outputLength><ifr:conversionExit>MATN1</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 10, "STATUS", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Status", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "STATUS", 125, 250, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"STATUS\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Overall processing status of document</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>125</ifr:offset1><ifr:offset2>250</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"GBSTK\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 11, "ORDERTYPE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ordertype", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "ORDERTYPE", 126, 252, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ORDERTYPE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Sales Document Type</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>126</ifr:offset1><ifr:offset2>252</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AUART\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength><ifr:conversionExit>AUART</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 12, "DIVISION", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Division", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "DIVISION", 130, 260, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DIVISION\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Division</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>130</ifr:offset1><ifr:offset2>260</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"SPART\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 13, "ODERSOURCE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Odersource", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "ODERSOURCE", 132, 264, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ODERSOURCE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Customer purchase order type</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>132</ifr:offset1><ifr:offset2>264</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BSARK\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 14, "SAN", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "San", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "12"}}, "SAN", 136, 272, -1, 12, 24, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SAN\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Shipper&apos;s (Our) Account Number at the Customer or Vendor</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>136</ifr:offset1><ifr:offset2>272</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"EIKTO\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>12</ifr:length><ifr:internalLength1>12</ifr:internalLength1><ifr:internalLength2>24</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>12</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 15, "ZIPCODE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Zipcode", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "ZIPCODE", 148, 296, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ZIPCODE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Postal Code</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>148</ifr:offset1><ifr:offset2>296</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PSTLZ\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 16, "COUNTRY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Country", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "COUNTRY", 158, 316, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"COUNTRY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Region (State, Province, County)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>158</ifr:offset1><ifr:offset2>316</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"REGIO\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        staticDescriptor = descriptor;
    }
    public  Zvfindtrans_IpType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    protected  Zvfindtrans_IpType (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    
    public void setCountry(java.lang.String Country) {
        baseTypeData().setElementValue(16, Country);
    }

    
    public java.lang.String getStatus() {
        return (java.lang.String)baseTypeData().getElementValueAsString(10);
    }

    
    public java.lang.String getDivision() {
        return (java.lang.String)baseTypeData().getElementValueAsString(12);
    }

    
    public void setInvoice(java.lang.String Invoice) {
        baseTypeData().setElementValue(6, Invoice);
    }

    
    public void setLimit(java.lang.String Limit) {
        baseTypeData().setElementValue(5, Limit);
    }

    
    public void setTodate(java.sql.Date Todate) {
        baseTypeData().setElementValue(4, Todate);
    }

    
    public java.lang.String getMaterial() {
        return (java.lang.String)baseTypeData().getElementValueAsString(9);
    }

    
    public void setOrdertype(java.lang.String Ordertype) {
        baseTypeData().setElementValue(11, Ordertype);
    }

    
    public MetaData metadata() {
        return metadata;
    }

    
    public java.lang.String getSearchtype() {
        return (java.lang.String)baseTypeData().getElementValueAsString(0);
    }

    
    public void setPono(java.lang.String Pono) {
        baseTypeData().setElementValue(7, Pono);
    }

    
    public java.lang.String getCountry() {
        return (java.lang.String)baseTypeData().getElementValueAsString(16);
    }

    
    public void setZipcode(java.lang.String Zipcode) {
        baseTypeData().setElementValue(15, Zipcode);
    }

    
    public java.lang.String getLimit() {
        return (java.lang.String)baseTypeData().getElementValueAsString(5);
    }

    
    public void setCustomer(java.lang.String Customer) {
        baseTypeData().setElementValue(1, Customer);
    }

    
    public java.sql.Date getTodate() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(4);
    }

    
    public void setSearchtype(java.lang.String Searchtype) {
        baseTypeData().setElementValue(0, Searchtype);
    }

    
    public java.lang.String getCustomer() {
        return (java.lang.String)baseTypeData().getElementValueAsString(1);
    }

    
    public java.sql.Date getFromdate() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(3);
    }

    
    public void setIsbn(java.lang.String Isbn) {
        baseTypeData().setElementValue(8, Isbn);
    }

    
    public java.lang.String getPono() {
        return (java.lang.String)baseTypeData().getElementValueAsString(7);
    }

    
    public java.lang.String getOrdertype() {
        return (java.lang.String)baseTypeData().getElementValueAsString(11);
    }

    
    public void setMaterial(java.lang.String Material) {
        baseTypeData().setElementValue(9, Material);
    }

    
    public void setDivision(java.lang.String Division) {
        baseTypeData().setElementValue(12, Division);
    }

    
    public java.lang.String getClienttid() {
        return (java.lang.String)baseTypeData().getElementValueAsString(2);
    }

    
    public void setStatus(java.lang.String Status) {
        baseTypeData().setElementValue(10, Status);
    }

    
    public void setFromdate(java.sql.Date Fromdate) {
        baseTypeData().setElementValue(3, Fromdate);
    }

    
    public void setClienttid(java.lang.String Clienttid) {
        baseTypeData().setElementValue(2, Clienttid);
    }

    
    public void setOdersource(java.lang.String Odersource) {
        baseTypeData().setElementValue(13, Odersource);
    }

    
    public java.lang.String getSan() {
        return (java.lang.String)baseTypeData().getElementValueAsString(14);
    }

    
    public void setSan(java.lang.String San) {
        baseTypeData().setElementValue(14, San);
    }

    
    public java.lang.String getInvoice() {
        return (java.lang.String)baseTypeData().getElementValueAsString(6);
    }

    
    public java.lang.String getZipcode() {
        return (java.lang.String)baseTypeData().getElementValueAsString(15);
    }

    
    public java.lang.String getOdersource() {
        return (java.lang.String)baseTypeData().getElementValueAsString(13);
    }

    
    public java.lang.String getIsbn() {
        return (java.lang.String)baseTypeData().getElementValueAsString(8);
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  Zvfindtrans_IpType parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Zvfindtrans_IpType parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCustomer() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDivision() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(12);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getFromdate() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getStatus() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(10);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPono() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(7);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getOrdertype() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(11);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMaterial() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(9);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getClienttid() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSearchtype() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCountry() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(16);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getLimit() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(5);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSan() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(14);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTodate() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(4);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getInvoice() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(6);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getZipcode() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(15);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getOdersource() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(13);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getIsbn() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(8);
        }
    
    }

}
