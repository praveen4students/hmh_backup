package hmh.sap.rfc;


public class Bapisdhd1Type extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1354127028451L) ;

    private  Bapisdhd1Type.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.XSDL_COMPLEX_TYPE, "urn:sap-com:document:sap:rfc:functions", "BAPISDHD1", 116, 0, hmh.sap.rfc.Bapisdhd1Type.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "BAPISDHD1", 849, 1662, -1, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"BAPISDHD1\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Communication Fields: Sales and Distribution Document Header</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>110</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>849</ifr:internalLength1><ifr:internalLength2>1662</ifr:internalLength2></ifr:definition></ifr:container></s0:type>");
        descriptorSetElementProperties(descriptor, 0, "REFOBJTYPE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Refobjtype", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "REFOBJTYPE", 0, 0, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REFOBJTYPE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Object Type</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TOJTB</ifr:checkTable><ifr:offset1>0</ifr:offset1><ifr:offset2>0</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"SWO_OBJTYP\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 1, "REFOBJKEY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Refobjkey", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "70"}}, "REFOBJKEY", 10, 20, -1, 70, 140, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REFOBJKEY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Object Key</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>10</ifr:offset1><ifr:offset2>20</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"SWO_TYPEID\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>70</ifr:length><ifr:internalLength1>70</ifr:internalLength1><ifr:internalLength2>140</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>70</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 2, "REFDOCTYPE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Refdoctype", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "REFDOCTYPE", 80, 160, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REFDOCTYPE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Document type of reference object</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>80</ifr:offset1><ifr:offset2>160</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"REFDOCTYPE\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 3, "DOC_TYPE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Doc_Type", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "DOC_TYPE", 90, 180, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DOC_TYPE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Sales Document Type</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TVAK</ifr:checkTable><ifr:offset1>90</ifr:offset1><ifr:offset2>180</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AUART\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength><ifr:conversionExit>AUART</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 4, "COLLECT_NO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Collect_No", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "COLLECT_NO", 94, 188, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"COLLECT_NO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Collective number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>94</ifr:offset1><ifr:offset2>188</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"SUBMI\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 5, "SALES_ORG", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Sales_Org", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "SALES_ORG", 104, 208, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SALES_ORG\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Sales Organization</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TVKO</ifr:checkTable><ifr:offset1>104</ifr:offset1><ifr:offset2>208</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VKORG\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 6, "DISTR_CHAN", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Distr_Chan", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "DISTR_CHAN", 108, 216, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DISTR_CHAN\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Distribution Channel</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TVKOV</ifr:checkTable><ifr:offset1>108</ifr:offset1><ifr:offset2>216</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VTWEG\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 7, "DIVISION", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Division", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "DIVISION", 110, 220, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DIVISION\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Division</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TVTA</ifr:checkTable><ifr:offset1>110</ifr:offset1><ifr:offset2>220</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"SPART\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 8, "SALES_GRP", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Sales_Grp", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "SALES_GRP", 112, 224, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SALES_GRP\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Sales group</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TVBVK</ifr:checkTable><ifr:offset1>112</ifr:offset1><ifr:offset2>224</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VKGRP\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 9, "SALES_OFF", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Sales_Off", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "SALES_OFF", 115, 230, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SALES_OFF\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Sales office</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TVKBZ</ifr:checkTable><ifr:offset1>115</ifr:offset1><ifr:offset2>230</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VKBUR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 10, "REQ_DATE_H", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Req_Date_H", java.sql.Date.class, null, new java.lang.String[][]{}, "REQ_DATE_H", 119, 238, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REQ_DATE_H\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Requested delivery date</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>119</ifr:offset1><ifr:offset2>238</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"EDATU_VBAK\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 11, "DATE_TYPE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Date_Type", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "DATE_TYPE", 127, 254, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DATE_TYPE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Proposed date type</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>127</ifr:offset1><ifr:offset2>254</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PRGRS_VBAK\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 12, "PURCH_DATE", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Purch_Date", java.sql.Date.class, null, new java.lang.String[][]{}, "PURCH_DATE", 128, 256, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PURCH_DATE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Customer purchase order date</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>128</ifr:offset1><ifr:offset2>256</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BSTDK\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 13, "PO_METHOD", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Po_Method", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "PO_METHOD", 136, 272, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PO_METHOD\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Customer purchase order type</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>T176</ifr:checkTable><ifr:offset1>136</ifr:offset1><ifr:offset2>272</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BSARK\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 14, "PO_SUPPLEM", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Po_Supplem", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "PO_SUPPLEM", 140, 280, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PO_SUPPLEM\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Purchase order number supplement</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>140</ifr:offset1><ifr:offset2>280</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BSTZD\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 15, "REF_1", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ref_1", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "12"}}, "REF_1", 144, 288, -1, 12, 24, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REF_1\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Customer&apos;s or vendor&apos;s internal reference</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>144</ifr:offset1><ifr:offset2>288</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"IHREZ\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>12</ifr:length><ifr:internalLength1>12</ifr:internalLength1><ifr:internalLength2>24</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>12</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 16, "NAME", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Name", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "35"}}, "NAME", 156, 312, -1, 35, 70, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"NAME\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Name of orderer</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>156</ifr:offset1><ifr:offset2>312</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BNAME_V\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>35</ifr:length><ifr:internalLength1>35</ifr:internalLength1><ifr:internalLength2>70</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>35</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 17, "TELEPHONE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Telephone", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "16"}}, "TELEPHONE", 191, 382, -1, 16, 32, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TELEPHONE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Telephone number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>191</ifr:offset1><ifr:offset2>382</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"TELF1_VP\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>16</ifr:length><ifr:internalLength1>16</ifr:internalLength1><ifr:internalLength2>32</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>16</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 18, "PRICE_GRP", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Price_Grp", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "PRICE_GRP", 207, 414, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PRICE_GRP\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Price group (customer)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>T188</ifr:checkTable><ifr:offset1>207</ifr:offset1><ifr:offset2>414</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KONDA\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 19, "CUST_GROUP", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cust_Group", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "CUST_GROUP", 209, 418, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CUST_GROUP\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Customer group</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>T151</ifr:checkTable><ifr:offset1>209</ifr:offset1><ifr:offset2>418</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KDGRP\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 20, "SALES_DIST", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Sales_Dist", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "6"}}, "SALES_DIST", 211, 422, -1, 6, 12, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SALES_DIST\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Sales district</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>T171</ifr:checkTable><ifr:offset1>211</ifr:offset1><ifr:offset2>422</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BZIRK\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>6</ifr:length><ifr:internalLength1>6</ifr:internalLength1><ifr:internalLength2>12</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>6</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 21, "PRICE_LIST", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Price_List", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "PRICE_LIST", 217, 434, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PRICE_LIST\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Price list type</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>T189</ifr:checkTable><ifr:offset1>217</ifr:offset1><ifr:offset2>434</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PLTYP\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 22, "INCOTERMS1", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Incoterms1", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "INCOTERMS1", 219, 438, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"INCOTERMS1\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Incoterms (part 1)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TINC</ifr:checkTable><ifr:offset1>219</ifr:offset1><ifr:offset2>438</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"INCO1\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 23, "INCOTERMS2", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Incoterms2", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "28"}}, "INCOTERMS2", 222, 444, -1, 28, 56, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"INCOTERMS2\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Incoterms (part 2)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>222</ifr:offset1><ifr:offset2>444</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"INCO2\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>28</ifr:length><ifr:internalLength1>28</ifr:internalLength1><ifr:internalLength2>56</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>28</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 24, "PMNTTRMS", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Pmnttrms", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "PMNTTRMS", 250, 500, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PMNTTRMS\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Terms of payment key</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>250</ifr:offset1><ifr:offset2>500</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"DZTERM\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 25, "DLV_BLOCK", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Dlv_Block", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "DLV_BLOCK", 254, 508, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DLV_BLOCK\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Delivery block (document header)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TVLS</ifr:checkTable><ifr:offset1>254</ifr:offset1><ifr:offset2>508</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"LIFSK\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 26, "BILL_BLOCK", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Bill_Block", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "BILL_BLOCK", 256, 512, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"BILL_BLOCK\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Billing block in SD document</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TVFS</ifr:checkTable><ifr:offset1>256</ifr:offset1><ifr:offset2>512</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"FAKSK\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 27, "ORD_REASON", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ord_Reason", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "ORD_REASON", 258, 516, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ORD_REASON\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Order reason (reason for the business transaction)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TVAU</ifr:checkTable><ifr:offset1>258</ifr:offset1><ifr:offset2>516</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AUGRU\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 28, "COMPL_DLV", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Compl_Dlv", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "COMPL_DLV", 261, 522, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"COMPL_DLV\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Complete delivery defined for each sales order?</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>261</ifr:offset1><ifr:offset2>522</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AUTLF\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 29, "PRICE_DATE", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Price_Date", java.sql.Date.class, null, new java.lang.String[][]{}, "PRICE_DATE", 262, 524, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PRICE_DATE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Date for pricing and exchange rate</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>262</ifr:offset1><ifr:offset2>524</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PRSDT\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 30, "QT_VALID_F", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Qt_Valid_F", java.sql.Date.class, null, new java.lang.String[][]{}, "QT_VALID_F", 270, 540, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"QT_VALID_F\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Quotation/Inquiry is valid from</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>270</ifr:offset1><ifr:offset2>540</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ANGDT_V\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 31, "QT_VALID_T", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Qt_Valid_T", java.sql.Date.class, null, new java.lang.String[][]{}, "QT_VALID_T", 278, 556, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"QT_VALID_T\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Date until which bid/quotation is binding (valid-to date)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>278</ifr:offset1><ifr:offset2>556</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BNDDT\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 32, "CT_VALID_F", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ct_Valid_F", java.sql.Date.class, null, new java.lang.String[][]{}, "CT_VALID_F", 286, 572, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CT_VALID_F\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Valid-from date (outline agreements, product proposals)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>286</ifr:offset1><ifr:offset2>572</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"GUEBG\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 33, "CT_VALID_T", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ct_Valid_T", java.sql.Date.class, null, new java.lang.String[][]{}, "CT_VALID_T", 294, 588, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CT_VALID_T\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Valid-to date (outline agreements, product proposals)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>294</ifr:offset1><ifr:offset2>588</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"GUEEN\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 34, "CUST_GRP1", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cust_Grp1", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "CUST_GRP1", 302, 604, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CUST_GRP1\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Carton Roundng Allowed</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TVV1</ifr:checkTable><ifr:offset1>302</ifr:offset1><ifr:offset2>604</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KVGR1\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 35, "CUST_GRP2", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cust_Grp2", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "CUST_GRP2", 305, 610, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CUST_GRP2\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Contract Pricing Allowed</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TVV2</ifr:checkTable><ifr:offset1>305</ifr:offset1><ifr:offset2>610</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KVGR2\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 36, "CUST_GRP3", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cust_Grp3", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "CUST_GRP3", 308, 616, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CUST_GRP3\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Substitution Allowed</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TVV3</ifr:checkTable><ifr:offset1>308</ifr:offset1><ifr:offset2>616</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KVGR3\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 37, "CUST_GRP4", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cust_Grp4", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "CUST_GRP4", 311, 622, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CUST_GRP4\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Freight Terms</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TVV4</ifr:checkTable><ifr:offset1>311</ifr:offset1><ifr:offset2>622</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KVGR4\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 38, "CUST_GRP5", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cust_Grp5", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "CUST_GRP5", 314, 628, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CUST_GRP5\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Promotion Code</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TVV5</ifr:checkTable><ifr:offset1>314</ifr:offset1><ifr:offset2>628</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KVGR5\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 39, "PURCH_NO_C", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Purch_No_C", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "35"}}, "PURCH_NO_C", 317, 634, -1, 35, 70, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PURCH_NO_C\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Customer purchase order number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>317</ifr:offset1><ifr:offset2>634</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BSTKD\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>35</ifr:length><ifr:internalLength1>35</ifr:internalLength1><ifr:internalLength2>70</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>35</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 40, "PURCH_NO_S", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Purch_No_S", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "35"}}, "PURCH_NO_S", 352, 704, -1, 35, 70, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PURCH_NO_S\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Ship-to Party&apos;s Purchase Order Number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>352</ifr:offset1><ifr:offset2>704</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BSTKD_E\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>35</ifr:length><ifr:internalLength1>35</ifr:internalLength1><ifr:internalLength2>70</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>35</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 41, "PO_DAT_S", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Po_Dat_S", java.sql.Date.class, null, new java.lang.String[][]{}, "PO_DAT_S", 387, 774, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PO_DAT_S\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Ship-to party&apos;s PO date</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>387</ifr:offset1><ifr:offset2>774</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BSTDK_E\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 42, "PO_METH_S", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Po_Meth_S", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "PO_METH_S", 395, 790, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PO_METH_S\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Ship-to party purchase order type</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>T176</ifr:checkTable><ifr:offset1>395</ifr:offset1><ifr:offset2>790</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BSARK_E\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 43, "REF_1_S", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ref_1_S", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "12"}}, "REF_1_S", 399, 798, -1, 12, 24, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REF_1_S\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Ship-to party character</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>399</ifr:offset1><ifr:offset2>798</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"IHREZ_E\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>12</ifr:length><ifr:internalLength1>12</ifr:internalLength1><ifr:internalLength2>24</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>12</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 44, "SD_DOC_CAT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Sd_Doc_Cat", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "SD_DOC_CAT", 411, 822, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SD_DOC_CAT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">SD document category</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>411</ifr:offset1><ifr:offset2>822</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VBTYP\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 45, "DOC_DATE", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Doc_Date", java.sql.Date.class, null, new java.lang.String[][]{}, "DOC_DATE", 412, 824, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DOC_DATE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Document date (date received/sent)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>412</ifr:offset1><ifr:offset2>824</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AUDAT\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 46, "WAR_DATE", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "War_Date", java.sql.Date.class, null, new java.lang.String[][]{}, "WAR_DATE", 420, 840, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"WAR_DATE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Guarantee date</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>420</ifr:offset1><ifr:offset2>840</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"GWLDT\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 47, "SHIP_COND", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ship_Cond", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "SHIP_COND", 428, 856, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SHIP_COND\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Shipping conditions</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TVSB</ifr:checkTable><ifr:offset1>428</ifr:offset1><ifr:offset2>856</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VSBED\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 48, "PP_SEARCH", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Pp_Search", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "40"}}, "PP_SEARCH", 430, 860, -1, 40, 80, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PP_SEARCH\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Search term for product proposal</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>430</ifr:offset1><ifr:offset2>860</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KTEXT_V\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>40</ifr:length><ifr:internalLength1>40</ifr:internalLength1><ifr:internalLength2>80</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>40</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 49, "DUN_COUNT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Dun_Count", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "3"}, {"fractionDigits", "0"}}, "DUN_COUNT", 470, 940, -1, 2, 2, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DUN_COUNT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Number of contacts from the customer</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>470</ifr:offset1><ifr:offset2>940</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MAHZA\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 50, "DUN_DATE", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Dun_Date", java.sql.Date.class, null, new java.lang.String[][]{}, "DUN_DATE", 472, 942, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DUN_DATE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Last customer contact date</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>472</ifr:offset1><ifr:offset2>942</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MAHDT\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 51, "DLVSCHDUSE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Dlvschduse", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "DLVSCHDUSE", 480, 958, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DLVSCHDUSE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Usage indicator</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TVLV</ifr:checkTable><ifr:offset1>480</ifr:offset1><ifr:offset2>958</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ABRVW\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 52, "PLDLVSTYP", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Pldlvstyp", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PLDLVSTYP", 483, 964, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PLDLVSTYP\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">MRP for delivery schedule types</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>483</ifr:offset1><ifr:offset2>964</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ABDIS\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 53, "REF_DOC", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ref_Doc", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "REF_DOC", 484, 966, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REF_DOC\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Document number of the reference document</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>VBUK</ifr:checkTable><ifr:offset1>484</ifr:offset1><ifr:offset2>966</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VGBEL\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 54, "COMP_CDE_B", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Comp_Cde_B", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "COMP_CDE_B", 494, 986, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"COMP_CDE_B\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Company code to be billed</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>T001</ifr:checkTable><ifr:offset1>494</ifr:offset1><ifr:offset2>986</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BUKRS_VF\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 55, "ALTTAX_CLS", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Alttax_Cls", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "ALTTAX_CLS", 498, 994, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ALTTAX_CLS\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Alternative tax classification</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TSKD</ifr:checkTable><ifr:offset1>498</ifr:offset1><ifr:offset2>994</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"TAXK1_AK\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 56, "TAX_CLASS2", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Tax_Class2", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "TAX_CLASS2", 499, 996, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TAX_CLASS2\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Tax classification 2 for customer</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TSKD</ifr:checkTable><ifr:offset1>499</ifr:offset1><ifr:offset2>996</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"TAXK2\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 57, "TAX_CLASS3", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Tax_Class3", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "TAX_CLASS3", 500, 998, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TAX_CLASS3\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Tax classification 3 for customer</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TSKD</ifr:checkTable><ifr:offset1>500</ifr:offset1><ifr:offset2>998</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"TAXK3\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 58, "TAX_CLASS4", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Tax_Class4", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "TAX_CLASS4", 501, 1000, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TAX_CLASS4\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Tax classification 4 for customer</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TSKD</ifr:checkTable><ifr:offset1>501</ifr:offset1><ifr:offset2>1000</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"TAXK4\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 59, "TAX_CLASS5", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Tax_Class5", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "TAX_CLASS5", 502, 1002, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TAX_CLASS5\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Tax classification 5 for customer</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TSKD</ifr:checkTable><ifr:offset1>502</ifr:offset1><ifr:offset2>1002</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"TAXK5\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 60, "TAX_CLASS6", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Tax_Class6", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "TAX_CLASS6", 503, 1004, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TAX_CLASS6\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Tax classification 6 for customer</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TSKD</ifr:checkTable><ifr:offset1>503</ifr:offset1><ifr:offset2>1004</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"TAXK6\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 61, "TAX_CLASS7", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Tax_Class7", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "TAX_CLASS7", 504, 1006, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TAX_CLASS7\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Tax classification 7 for customer</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TSKD</ifr:checkTable><ifr:offset1>504</ifr:offset1><ifr:offset2>1006</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"TAXK7\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 62, "TAX_CLASS8", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Tax_Class8", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "TAX_CLASS8", 505, 1008, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TAX_CLASS8\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Tax classification 8 for customer</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TSKD</ifr:checkTable><ifr:offset1>505</ifr:offset1><ifr:offset2>1008</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"TAXK8\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 63, "TAX_CLASS9", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Tax_Class9", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "TAX_CLASS9", 506, 1010, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TAX_CLASS9\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Tax classification 9 for customer</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TSKD</ifr:checkTable><ifr:offset1>506</ifr:offset1><ifr:offset2>1010</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"TAXK9\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 64, "REF_DOC_L", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ref_Doc_L", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "16"}}, "REF_DOC_L", 507, 1012, -1, 16, 32, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REF_DOC_L\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Reference Document Number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>507</ifr:offset1><ifr:offset2>1012</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"XBLNR_V\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>16</ifr:length><ifr:internalLength1>16</ifr:internalLength1><ifr:internalLength2>32</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>16</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 65, "ASS_NUMBER", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ass_Number", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "18"}}, "ASS_NUMBER", 523, 1044, -1, 18, 36, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ASS_NUMBER\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Assignment number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>523</ifr:offset1><ifr:offset2>1044</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ORDNR_V\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>18</ifr:length><ifr:internalLength1>18</ifr:internalLength1><ifr:internalLength2>36</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>18</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 66, "REFDOC_CAT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Refdoc_Cat", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "REFDOC_CAT", 541, 1080, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REFDOC_CAT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Document category of preceding SD document</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>541</ifr:offset1><ifr:offset2>1080</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VBTYP_V\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 67, "ORDCOMB_IN", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ordcomb_In", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "ORDCOMB_IN", 542, 1082, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ORDCOMB_IN\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Order combination indicator</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>542</ifr:offset1><ifr:offset2>1082</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KZAZU_D\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 68, "BILL_SCHED", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Bill_Sched", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "BILL_SCHED", 543, 1084, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"BILL_SCHED\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Invoice dates (calendar identification)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TFACD</ifr:checkTable><ifr:offset1>543</ifr:offset1><ifr:offset2>1084</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PERFK\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 69, "INVO_SCHED", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Invo_Sched", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "INVO_SCHED", 545, 1088, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"INVO_SCHED\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Invoice list schedule (calendar identification)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TFACD</ifr:checkTable><ifr:offset1>545</ifr:offset1><ifr:offset2>1088</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PERRL\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 70, "MN_INVOICE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Mn_Invoice", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "MN_INVOICE", 547, 1092, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MN_INVOICE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Manual invoice maintenance</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>547</ifr:offset1><ifr:offset2>1092</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MRNKZ\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 71, "EXRATE_FI", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Exrate_Fi", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "9"}, {"fractionDigits", "5"}}, "EXRATE_FI", 548, 1094, -1, 5, 5, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"EXRATE_FI\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Directly quoted exchange rate for FI postings</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>548</ifr:offset1><ifr:offset2>1094</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KURRF_P\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>9</ifr:length><ifr:internalLength1>5</ifr:internalLength1><ifr:internalLength2>5</ifr:internalLength2><ifr:decimals>5</ifr:decimals><ifr:outputLength>12</ifr:outputLength><ifr:conversionExit>EXCRT</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 72, "ADD_VAL_DY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Add_Val_Dy", java.lang.String.class, null, new java.lang.String[][]{{"pattern", "\\d+"}, {"maxLength", "2"}}, "ADD_VAL_DY", 553, 1100, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_NUM, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ADD_VAL_DY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Additional value days</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>553</ifr:offset1><ifr:offset2>1100</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VALTG\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>NUMC</ifr:type><ifr:abapType>N</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 73, "FIX_VAL_DY", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Fix_Val_Dy", java.sql.Date.class, null, new java.lang.String[][]{}, "FIX_VAL_DY", 555, 1104, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"FIX_VAL_DY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Fixed value date</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>555</ifr:offset1><ifr:offset2>1104</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VALDT\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 74, "PYMT_METH", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Pymt_Meth", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PYMT_METH", 563, 1120, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PYMT_METH\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Payment method</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>T042Z</ifr:checkTable><ifr:offset1>563</ifr:offset1><ifr:offset2>1120</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"DZLSCH\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 75, "ACCNT_ASGN", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Accnt_Asgn", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "ACCNT_ASGN", 564, 1122, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ACCNT_ASGN\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Account assignment group for this customer</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TVKT</ifr:checkTable><ifr:offset1>564</ifr:offset1><ifr:offset2>1122</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KTGRD\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 76, "EXCHG_RATE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Exchg_Rate", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "9"}, {"fractionDigits", "5"}}, "EXCHG_RATE", 566, 1126, -1, 5, 5, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"EXCHG_RATE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Directly quoted exchange rate for pricing and statistics</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>566</ifr:offset1><ifr:offset2>1126</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KURSK_P\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>9</ifr:length><ifr:internalLength1>5</ifr:internalLength1><ifr:internalLength2>5</ifr:internalLength2><ifr:decimals>5</ifr:decimals><ifr:outputLength>11</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 77, "BILL_DATE", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Bill_Date", java.sql.Date.class, null, new java.lang.String[][]{}, "BILL_DATE", 571, 1132, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"BILL_DATE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Billing date for billing index and printout</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>571</ifr:offset1><ifr:offset2>1132</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"FKDAT\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 78, "SERV_DATE", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Serv_Date", java.sql.Date.class, null, new java.lang.String[][]{}, "SERV_DATE", 579, 1148, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SERV_DATE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Date on which services rendered</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>579</ifr:offset1><ifr:offset2>1148</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"FBUDA\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 79, "DUNN_KEY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Dunn_Key", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "DUNN_KEY", 587, 1164, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DUNN_KEY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Dunning key</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>T040</ifr:checkTable><ifr:offset1>587</ifr:offset1><ifr:offset2>1164</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MSCHL\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 80, "DUNN_BLOCK", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Dunn_Block", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "DUNN_BLOCK", 588, 1166, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DUNN_BLOCK\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Dunning block</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>T040S</ifr:checkTable><ifr:offset1>588</ifr:offset1><ifr:offset2>1166</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MANSP\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 81, "PMTGAR_PRO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Pmtgar_Pro", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "6"}}, "PMTGAR_PRO", 589, 1168, -1, 6, 12, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PMTGAR_PRO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Payment guarantee procedure</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>589</ifr:offset1><ifr:offset2>1168</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ABSSCHE_CM\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>6</ifr:length><ifr:internalLength1>6</ifr:internalLength1><ifr:internalLength2>12</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>6</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 82, "DEPARTM_NO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Departm_No", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "DEPARTM_NO", 595, 1180, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DEPARTM_NO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Department number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TSAB</ifr:checkTable><ifr:offset1>595</ifr:offset1><ifr:offset2>1180</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ABTNR\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 83, "REC_POINT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Rec_Point", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "25"}}, "REC_POINT", 599, 1188, -1, 25, 50, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REC_POINT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Receiving point</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>599</ifr:offset1><ifr:offset2>1188</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"EMPST\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>25</ifr:length><ifr:internalLength1>25</ifr:internalLength1><ifr:internalLength2>50</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>25</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 84, "DOC_NUM_FI", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Doc_Num_Fi", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "DOC_NUM_FI", 624, 1238, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DOC_NUM_FI\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Financial doc. processing: Internal financial doc. number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>624</ifr:offset1><ifr:offset2>1238</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"LCNUM\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 85, "CSTCNDGRP1", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cstcndgrp1", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "CSTCNDGRP1", 634, 1258, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CSTCNDGRP1\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Customer Class</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TVKGG</ifr:checkTable><ifr:offset1>634</ifr:offset1><ifr:offset2>1258</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KDKG1\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 86, "CSTCNDGRP2", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cstcndgrp2", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "CSTCNDGRP2", 636, 1262, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CSTCNDGRP2\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Customer Type</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TVKGG</ifr:checkTable><ifr:offset1>636</ifr:offset1><ifr:offset2>1262</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KDKG2\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 87, "CSTCNDGRP3", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cstcndgrp3", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "CSTCNDGRP3", 638, 1266, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CSTCNDGRP3\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Delivered/Non-delivered</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TVKGG</ifr:checkTable><ifr:offset1>638</ifr:offset1><ifr:offset2>1266</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KDKG3\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 88, "CSTCNDGRP4", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cstcndgrp4", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "CSTCNDGRP4", 640, 1270, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CSTCNDGRP4\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Backorder Choices</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TVKGG</ifr:checkTable><ifr:offset1>640</ifr:offset1><ifr:offset2>1270</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KDKG4\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 89, "CSTCNDGRP5", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cstcndgrp5", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "CSTCNDGRP5", 642, 1274, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CSTCNDGRP5\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">No Ship Consolidation</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TVKGG</ifr:checkTable><ifr:offset1>642</ifr:offset1><ifr:offset2>1274</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KDKG5\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 90, "DLV_TIME", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Dlv_Time", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "DLV_TIME", 644, 1278, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DLV_TIME\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Agreed delivery time</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TVDC</ifr:checkTable><ifr:offset1>644</ifr:offset1><ifr:offset2>1278</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"DELCO\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 91, "CURRENCY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Currency", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "5"}}, "CURRENCY", 647, 1284, -1, 5, 10, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CURRENCY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">SD document currency</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TCURC</ifr:checkTable><ifr:offset1>647</ifr:offset1><ifr:offset2>1284</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"WAERK\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CUKY</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>5</ifr:length><ifr:internalLength1>5</ifr:internalLength1><ifr:internalLength2>10</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>5</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 92, "CURR_ISO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Curr_Iso", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "CURR_ISO", 652, 1294, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CURR_ISO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">ISO code currency</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>652</ifr:offset1><ifr:offset2>1294</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"WAERS_ISO\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 93, "CREATED_BY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Created_By", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "12"}}, "CREATED_BY", 655, 1300, -1, 12, 24, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CREATED_BY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Name of Person who Created the Object</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>655</ifr:offset1><ifr:offset2>1300</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ERNAM\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>12</ifr:length><ifr:internalLength1>12</ifr:internalLength1><ifr:internalLength2>24</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>12</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 94, "TAXDEP_CTY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Taxdep_Cty", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "TAXDEP_CTY", 667, 1324, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TAXDEP_CTY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Tax departure country</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>T005</ifr:checkTable><ifr:offset1>667</ifr:offset1><ifr:offset2>1324</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"LANDTX\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 95, "TAXDST_CTY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Taxdst_Cty", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "TAXDST_CTY", 670, 1330, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TAXDST_CTY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Tax destination country</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>T005</ifr:checkTable><ifr:offset1>670</ifr:offset1><ifr:offset2>1330</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"LAND1TX\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 96, "EUTRI_DEAL", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Eutri_Deal", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "EUTRI_DEAL", 673, 1336, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"EUTRI_DEAL\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Indicator: Triangular deal within the EU ?</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>673</ifr:offset1><ifr:offset2>1336</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"XEGDR\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 97, "MAST_CONTR", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Mast_Contr", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "MAST_CONTR", 674, 1338, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MAST_CONTR\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Mster contract number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>VBUK</ifr:checkTable><ifr:offset1>674</ifr:offset1><ifr:offset2>1338</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VBELN_GRP\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 98, "REF_PROC", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ref_Proc", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "REF_PROC", 684, 1358, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REF_PROC\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Referencing requirement: Procedure</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TVGRPS</ifr:checkTable><ifr:offset1>684</ifr:offset1><ifr:offset2>1358</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"SCHEME_GRP\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 99, "CHKPRTAUTH", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Chkprtauth", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "CHKPRTAUTH", 688, 1366, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CHKPRTAUTH\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Check partner authorizations</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>688</ifr:offset1><ifr:offset2>1366</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ABRUF_PART\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 100, "CMLQTY_DAT", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cmlqty_Dat", java.sql.Date.class, null, new java.lang.String[][]{}, "CMLQTY_DAT", 689, 1368, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CMLQTY_DAT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Cml delivery order qty date</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>689</ifr:offset1><ifr:offset2>1368</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"DAT_FZAU\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 101, "VERSION", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Version", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "12"}}, "VERSION", 697, 1384, -1, 12, 24, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"VERSION\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Sales document version number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>697</ifr:offset1><ifr:offset2>1384</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VSNMR_V\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>12</ifr:length><ifr:internalLength1>12</ifr:internalLength1><ifr:internalLength2>24</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>12</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 102, "NOTIF_NO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Notif_No", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "12"}}, "NOTIF_NO", 709, 1408, -1, 12, 24, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"NOTIF_NO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Notification Number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>709</ifr:offset1><ifr:offset2>1408</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"QMNUM\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>12</ifr:length><ifr:internalLength1>12</ifr:internalLength1><ifr:internalLength2>24</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>12</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 103, "WBS_ELEM", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Wbs_Elem", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "24"}}, "WBS_ELEM", 721, 1432, -1, 24, 48, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"WBS_ELEM\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Work Breakdown Structure Element (WBS Element)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>721</ifr:offset1><ifr:offset2>1432</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PS_POSID\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>24</ifr:length><ifr:internalLength1>24</ifr:internalLength1><ifr:internalLength2>48</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>24</ifr:outputLength><ifr:conversionExit>ABPSN</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 104, "EXCH_RATE_FI_V", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Exch_Rate_Fi_V", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "9"}, {"fractionDigits", "5"}}, "EXCH_RATE_FI_V", 745, 1480, -1, 5, 5, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"EXCH_RATE_FI_V\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Indirectly quoted exchange rate for FI postings</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>745</ifr:offset1><ifr:offset2>1480</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KURRF_V\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>9</ifr:length><ifr:internalLength1>5</ifr:internalLength1><ifr:internalLength2>5</ifr:internalLength2><ifr:decimals>5</ifr:decimals><ifr:outputLength>12</ifr:outputLength><ifr:conversionExit>EXCRT</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 105, "EXCHG_RATE_V", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Exchg_Rate_V", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "9"}, {"fractionDigits", "5"}}, "EXCHG_RATE_V", 750, 1485, -1, 5, 5, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"EXCHG_RATE_V\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Indirectly quoted exchange rate for pricing and statistics</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>750</ifr:offset1><ifr:offset2>1485</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KURSK_V\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>9</ifr:length><ifr:internalLength1>5</ifr:internalLength1><ifr:internalLength2>5</ifr:internalLength2><ifr:decimals>5</ifr:decimals><ifr:outputLength>11</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 106, "FKK_CONACCT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Fkk_Conacct", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "12"}}, "FKK_CONACCT", 755, 1490, -1, 12, 24, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"FKK_CONACCT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Character field of length 12</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>755</ifr:offset1><ifr:offset2>1490</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CHAR012\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>12</ifr:length><ifr:internalLength1>12</ifr:internalLength1><ifr:internalLength2>24</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>12</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 107, "CAMPAIGN", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:base64Binary", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Campaign", byte[].class, null, new java.lang.String[][]{{"length", "16"}}, "CAMPAIGN", 767, 1514, -1, 16, 16, -1, com.sap.mw.jco.JCO.TYPE_BYTE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CAMPAIGN\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Generic project planning: GUID from external R/3 system</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>767</ifr:offset1><ifr:offset2>1514</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CGPL_GUID16_R3\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>RAW</ifr:type><ifr:abapType>X</ifr:abapType><ifr:length>16</ifr:length><ifr:internalLength1>16</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>32</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 108, "DOC_CLASS", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Doc_Class", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "9"}}, "DOC_CLASS", 783, 1530, -1, 9, 18, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DOC_CLASS\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Original system with release and transaction control</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>783</ifr:offset1><ifr:offset2>1530</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VBKLA\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>9</ifr:length><ifr:internalLength1>9</ifr:internalLength1><ifr:internalLength2>18</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>9</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 109, "H_CURR", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "H_Curr", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "5"}}, "H_CURR", 792, 1548, -1, 5, 10, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"H_CURR\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Currency Key</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TCURC</ifr:checkTable><ifr:offset1>792</ifr:offset1><ifr:offset2>1548</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"WAERS\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CUKY</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>5</ifr:length><ifr:internalLength1>5</ifr:internalLength1><ifr:internalLength2>10</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>5</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 110, "H_CURR_ISO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "H_Curr_Iso", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "H_CURR_ISO", 797, 1558, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"H_CURR_ISO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">ISO currency code</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>797</ifr:offset1><ifr:offset2>1558</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ISOCD\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 111, "SHIP_TYPE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ship_Type", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "SHIP_TYPE", 800, 1564, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SHIP_TYPE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Shipping type</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>T173</ifr:checkTable><ifr:offset1>800</ifr:offset1><ifr:offset2>1564</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VSARTTR\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 112, "S_PROC_IND", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "S_Proc_Ind", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "S_PROC_IND", 802, 1568, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"S_PROC_IND\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Special processing indicator</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TVSAK</ifr:checkTable><ifr:offset1>802</ifr:offset1><ifr:offset2>1568</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"SDABW\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 113, "REF_DOC_L_LONG", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ref_Doc_L_Long", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "35"}}, "REF_DOC_L_LONG", 806, 1576, -1, 35, 70, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REF_DOC_L_LONG\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Reference Document Number (See long text for dependencies)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>806</ifr:offset1><ifr:offset2>1576</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"XBLNR_V_LONG\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>35</ifr:length><ifr:internalLength1>35</ifr:internalLength1><ifr:internalLength2>70</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>35</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 114, "LINE_TIME", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:time", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Line_Time", java.sql.Time.class, null, new java.lang.String[][]{}, "LINE_TIME", 841, 1646, -1, 6, 12, -1, com.sap.mw.jco.JCO.TYPE_TIME, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"LINE_TIME\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Proposed schedule line time (local with ref. to sales org.)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>841</ifr:offset1><ifr:offset2>1646</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"EZEIT_VBAK\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>TIMS</ifr:type><ifr:abapType>T</ifr:abapType><ifr:length>6</ifr:length><ifr:internalLength1>6</ifr:internalLength1><ifr:internalLength2>12</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>8</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 115, "CALC_MOTIVE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Calc_Motive", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "CALC_MOTIVE", 847, 1658, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CALC_MOTIVE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Accounting Indicator</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TBMOT</ifr:checkTable><ifr:offset1>847</ifr:offset1><ifr:offset2>1658</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BEMOT\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        staticDescriptor = descriptor;
    }
    public  Bapisdhd1Type () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    protected  Bapisdhd1Type (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    
    public java.lang.String getIncoterms1() {
        return (java.lang.String)baseTypeData().getElementValueAsString(22);
    }

    
    public void setRef_Doc(java.lang.String Ref_Doc) {
        baseTypeData().setElementValue(53, Ref_Doc);
    }

    
    public void setRef_1(java.lang.String Ref_1) {
        baseTypeData().setElementValue(15, Ref_1);
    }

    
    public java.lang.String getTaxdst_Cty() {
        return (java.lang.String)baseTypeData().getElementValueAsString(95);
    }

    
    public java.lang.String getDoc_Num_Fi() {
        return (java.lang.String)baseTypeData().getElementValueAsString(84);
    }

    
    public void setPurch_No_S(java.lang.String Purch_No_S) {
        baseTypeData().setElementValue(40, Purch_No_S);
    }

    
    public java.lang.String getCust_Grp5() {
        return (java.lang.String)baseTypeData().getElementValueAsString(38);
    }

    
    public java.lang.String getTax_Class5() {
        return (java.lang.String)baseTypeData().getElementValueAsString(59);
    }

    
    public java.lang.String getPurch_No_C() {
        return (java.lang.String)baseTypeData().getElementValueAsString(39);
    }

    
    public void setSales_Grp(java.lang.String Sales_Grp) {
        baseTypeData().setElementValue(8, Sales_Grp);
    }

    
    public void setBill_Block(java.lang.String Bill_Block) {
        baseTypeData().setElementValue(26, Bill_Block);
    }

    
    public java.lang.String getIncoterms2() {
        return (java.lang.String)baseTypeData().getElementValueAsString(23);
    }

    
    public java.lang.String getAdd_Val_Dy() {
        return (java.lang.String)baseTypeData().getElementValueAsString(72);
    }

    
    public java.lang.String getCstcndgrp5() {
        return (java.lang.String)baseTypeData().getElementValueAsString(89);
    }

    
    public void setRef_Proc(java.lang.String Ref_Proc) {
        baseTypeData().setElementValue(98, Ref_Proc);
    }

    
    public java.lang.String getRef_Doc() {
        return (java.lang.String)baseTypeData().getElementValueAsString(53);
    }

    
    public void setName(java.lang.String Name) {
        baseTypeData().setElementValue(16, Name);
    }

    
    public java.lang.String getCstcndgrp4() {
        return (java.lang.String)baseTypeData().getElementValueAsString(88);
    }

    
    public void setTax_Class4(java.lang.String Tax_Class4) {
        baseTypeData().setElementValue(58, Tax_Class4);
    }

    
    public void setH_Curr(java.lang.String H_Curr) {
        baseTypeData().setElementValue(109, H_Curr);
    }

    
    public java.lang.String getTax_Class4() {
        return (java.lang.String)baseTypeData().getElementValueAsString(58);
    }

    
    public java.lang.String getCust_Grp4() {
        return (java.lang.String)baseTypeData().getElementValueAsString(37);
    }

    
    public void setH_Curr_Iso(java.lang.String H_Curr_Iso) {
        baseTypeData().setElementValue(110, H_Curr_Iso);
    }

    
    public void setServ_Date(java.sql.Date Serv_Date) {
        baseTypeData().setElementValue(78, Serv_Date);
    }

    
    public void setCampaign(byte[] Campaign) {
        baseTypeData().setElementValue(107, Campaign);
    }

    
    public void setCmlqty_Dat(java.sql.Date Cmlqty_Dat) {
        baseTypeData().setElementValue(100, Cmlqty_Dat);
    }

    
    public void setBill_Sched(java.lang.String Bill_Sched) {
        baseTypeData().setElementValue(68, Bill_Sched);
    }

    
    public void setReq_Date_H(java.sql.Date Req_Date_H) {
        baseTypeData().setElementValue(10, Req_Date_H);
    }

    
    public void setCust_Grp4(java.lang.String Cust_Grp4) {
        baseTypeData().setElementValue(37, Cust_Grp4);
    }

    
    public java.lang.String getH_Curr() {
        return (java.lang.String)baseTypeData().getElementValueAsString(109);
    }

    
    public void setRefobjkey(java.lang.String Refobjkey) {
        baseTypeData().setElementValue(1, Refobjkey);
    }

    
    public java.lang.String getCstcndgrp3() {
        return (java.lang.String)baseTypeData().getElementValueAsString(87);
    }

    
    public java.sql.Date getPrice_Date() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(29);
    }

    
    public java.lang.String getTax_Class7() {
        return (java.lang.String)baseTypeData().getElementValueAsString(61);
    }

    
    public java.sql.Date getPo_Dat_S() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(41);
    }

    
    public java.lang.String getChkprtauth() {
        return (java.lang.String)baseTypeData().getElementValueAsString(99);
    }

    
    public void setPurch_No_C(java.lang.String Purch_No_C) {
        baseTypeData().setElementValue(39, Purch_No_C);
    }

    
    public java.lang.String getSales_Off() {
        return (java.lang.String)baseTypeData().getElementValueAsString(9);
    }

    
    public java.lang.String getRefobjkey() {
        return (java.lang.String)baseTypeData().getElementValueAsString(1);
    }

    
    public void setDlv_Block(java.lang.String Dlv_Block) {
        baseTypeData().setElementValue(25, Dlv_Block);
    }

    
    public void setCstcndgrp4(java.lang.String Cstcndgrp4) {
        baseTypeData().setElementValue(88, Cstcndgrp4);
    }

    
    public void setPo_Dat_S(java.sql.Date Po_Dat_S) {
        baseTypeData().setElementValue(41, Po_Dat_S);
    }

    
    public void setDoc_Num_Fi(java.lang.String Doc_Num_Fi) {
        baseTypeData().setElementValue(84, Doc_Num_Fi);
    }

    
    public byte[] getCampaign() {
        return (byte[])baseTypeData().getElementValueAsByteArray(107);
    }

    
    public java.lang.String getMn_Invoice() {
        return (java.lang.String)baseTypeData().getElementValueAsString(70);
    }

    
    public void setRefobjtype(java.lang.String Refobjtype) {
        baseTypeData().setElementValue(0, Refobjtype);
    }

    
    public java.lang.String getDunn_Key() {
        return (java.lang.String)baseTypeData().getElementValueAsString(79);
    }

    
    public void setDlv_Time(java.lang.String Dlv_Time) {
        baseTypeData().setElementValue(90, Dlv_Time);
    }

    
    public java.math.BigDecimal getExrate_Fi() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(71);
    }

    
    public java.lang.String getCstcndgrp2() {
        return (java.lang.String)baseTypeData().getElementValueAsString(86);
    }

    
    public java.lang.String getSd_Doc_Cat() {
        return (java.lang.String)baseTypeData().getElementValueAsString(44);
    }

    
    public void setExchg_Rate(java.math.BigDecimal Exchg_Rate) {
        baseTypeData().setElementValue(76, Exchg_Rate);
    }

    
    public java.lang.String getPldlvstyp() {
        return (java.lang.String)baseTypeData().getElementValueAsString(52);
    }

    
    public java.math.BigDecimal getExchg_Rate_V() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(105);
    }

    
    public java.lang.String getDoc_Type() {
        return (java.lang.String)baseTypeData().getElementValueAsString(3);
    }

    
    public java.lang.String getDistr_Chan() {
        return (java.lang.String)baseTypeData().getElementValueAsString(6);
    }

    
    public java.lang.String getTax_Class6() {
        return (java.lang.String)baseTypeData().getElementValueAsString(60);
    }

    
    public java.lang.String getRef_1() {
        return (java.lang.String)baseTypeData().getElementValueAsString(15);
    }

    
    public void setAdd_Val_Dy(java.lang.String Add_Val_Dy) {
        baseTypeData().setElementValue(72, Add_Val_Dy);
    }

    
    public java.sql.Date getDun_Date() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(50);
    }

    
    public java.lang.String getTax_Class9() {
        return (java.lang.String)baseTypeData().getElementValueAsString(63);
    }

    
    public java.lang.String getAss_Number() {
        return (java.lang.String)baseTypeData().getElementValueAsString(65);
    }

    
    public java.lang.String getPymt_Meth() {
        return (java.lang.String)baseTypeData().getElementValueAsString(74);
    }

    
    public void setInvo_Sched(java.lang.String Invo_Sched) {
        baseTypeData().setElementValue(69, Invo_Sched);
    }

    
    public void setSales_Org(java.lang.String Sales_Org) {
        baseTypeData().setElementValue(5, Sales_Org);
    }

    
    public java.math.BigDecimal getExch_Rate_Fi_V() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(104);
    }

    
    public void setRef_1_S(java.lang.String Ref_1_S) {
        baseTypeData().setElementValue(43, Ref_1_S);
    }

    
    public java.lang.String getName() {
        return (java.lang.String)baseTypeData().getElementValueAsString(16);
    }

    
    public void setExchg_Rate_V(java.math.BigDecimal Exchg_Rate_V) {
        baseTypeData().setElementValue(105, Exchg_Rate_V);
    }

    
    public java.sql.Date getCt_Valid_F() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(32);
    }

    
    public void setCust_Grp2(java.lang.String Cust_Grp2) {
        baseTypeData().setElementValue(35, Cust_Grp2);
    }

    
    public java.lang.String getCollect_No() {
        return (java.lang.String)baseTypeData().getElementValueAsString(4);
    }

    
    public java.lang.String getSales_Dist() {
        return (java.lang.String)baseTypeData().getElementValueAsString(20);
    }

    
    public void setTelephone(java.lang.String Telephone) {
        baseTypeData().setElementValue(17, Telephone);
    }

    
    public java.lang.String getDate_Type() {
        return (java.lang.String)baseTypeData().getElementValueAsString(11);
    }

    
    public java.lang.String getDepartm_No() {
        return (java.lang.String)baseTypeData().getElementValueAsString(82);
    }

    
    public void setDun_Count(java.math.BigDecimal Dun_Count) {
        baseTypeData().setElementValue(49, Dun_Count);
    }

    
    public void setPmtgar_Pro(java.lang.String Pmtgar_Pro) {
        baseTypeData().setElementValue(81, Pmtgar_Pro);
    }

    
    public void setNotif_No(java.lang.String Notif_No) {
        baseTypeData().setElementValue(102, Notif_No);
    }

    
    public java.lang.String getTax_Class8() {
        return (java.lang.String)baseTypeData().getElementValueAsString(62);
    }

    
    public void setCompl_Dlv(java.lang.String Compl_Dlv) {
        baseTypeData().setElementValue(28, Compl_Dlv);
    }

    
    public java.math.BigDecimal getDun_Count() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(49);
    }

    
    public void setIncoterms1(java.lang.String Incoterms1) {
        baseTypeData().setElementValue(22, Incoterms1);
    }

    
    public java.sql.Date getCt_Valid_T() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(33);
    }

    
    public java.sql.Time getLine_Time() {
        return (java.sql.Time)baseTypeData().getElementValueAsTime(114);
    }

    
    public void setPldlvstyp(java.lang.String Pldlvstyp) {
        baseTypeData().setElementValue(52, Pldlvstyp);
    }

    
    public void setShip_Type(java.lang.String Ship_Type) {
        baseTypeData().setElementValue(111, Ship_Type);
    }

    
    public java.lang.String getSales_Grp() {
        return (java.lang.String)baseTypeData().getElementValueAsString(8);
    }

    
    public void setVersion(java.lang.String Version) {
        baseTypeData().setElementValue(101, Version);
    }

    
    public java.lang.String getPmnttrms() {
        return (java.lang.String)baseTypeData().getElementValueAsString(24);
    }

    
    public java.sql.Date getServ_Date() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(78);
    }

    
    public java.lang.String getPurch_No_S() {
        return (java.lang.String)baseTypeData().getElementValueAsString(40);
    }

    
    public void setTax_Class9(java.lang.String Tax_Class9) {
        baseTypeData().setElementValue(63, Tax_Class9);
    }

    
    public void setPrice_Grp(java.lang.String Price_Grp) {
        baseTypeData().setElementValue(18, Price_Grp);
    }

    
    public void setFkk_Conacct(java.lang.String Fkk_Conacct) {
        baseTypeData().setElementValue(106, Fkk_Conacct);
    }

    
    public void setDunn_Block(java.lang.String Dunn_Block) {
        baseTypeData().setElementValue(80, Dunn_Block);
    }

    
    public java.lang.String getPo_Method() {
        return (java.lang.String)baseTypeData().getElementValueAsString(13);
    }

    
    public void setAccnt_Asgn(java.lang.String Accnt_Asgn) {
        baseTypeData().setElementValue(75, Accnt_Asgn);
    }

    
    public void setQt_Valid_T(java.sql.Date Qt_Valid_T) {
        baseTypeData().setElementValue(31, Qt_Valid_T);
    }

    
    public void setSales_Dist(java.lang.String Sales_Dist) {
        baseTypeData().setElementValue(20, Sales_Dist);
    }

    
    public java.lang.String getWbs_Elem() {
        return (java.lang.String)baseTypeData().getElementValueAsString(103);
    }

    
    public void setShip_Cond(java.lang.String Ship_Cond) {
        baseTypeData().setElementValue(47, Ship_Cond);
    }

    
    public void setDivision(java.lang.String Division) {
        baseTypeData().setElementValue(7, Division);
    }

    
    public java.lang.String getDoc_Class() {
        return (java.lang.String)baseTypeData().getElementValueAsString(108);
    }

    
    public void setSales_Off(java.lang.String Sales_Off) {
        baseTypeData().setElementValue(9, Sales_Off);
    }

    
    public void setIncoterms2(java.lang.String Incoterms2) {
        baseTypeData().setElementValue(23, Incoterms2);
    }

    
    public void setCreated_By(java.lang.String Created_By) {
        baseTypeData().setElementValue(93, Created_By);
    }

    
    public void setTax_Class5(java.lang.String Tax_Class5) {
        baseTypeData().setElementValue(59, Tax_Class5);
    }

    
    public void setAlttax_Cls(java.lang.String Alttax_Cls) {
        baseTypeData().setElementValue(55, Alttax_Cls);
    }

    
    public java.lang.String getVersion() {
        return (java.lang.String)baseTypeData().getElementValueAsString(101);
    }

    
    public void setPurch_Date(java.sql.Date Purch_Date) {
        baseTypeData().setElementValue(12, Purch_Date);
    }

    
    public java.lang.String getDlvschduse() {
        return (java.lang.String)baseTypeData().getElementValueAsString(51);
    }

    
    public java.lang.String getDivision() {
        return (java.lang.String)baseTypeData().getElementValueAsString(7);
    }

    
    public void setCust_Grp5(java.lang.String Cust_Grp5) {
        baseTypeData().setElementValue(38, Cust_Grp5);
    }

    
    public void setWar_Date(java.sql.Date War_Date) {
        baseTypeData().setElementValue(46, War_Date);
    }

    
    public void setCust_Grp3(java.lang.String Cust_Grp3) {
        baseTypeData().setElementValue(36, Cust_Grp3);
    }

    
    public void setPmnttrms(java.lang.String Pmnttrms) {
        baseTypeData().setElementValue(24, Pmnttrms);
    }

    
    public java.lang.String getRefdoc_Cat() {
        return (java.lang.String)baseTypeData().getElementValueAsString(66);
    }

    
    public java.sql.Date getWar_Date() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(46);
    }

    
    public java.lang.String getRef_1_S() {
        return (java.lang.String)baseTypeData().getElementValueAsString(43);
    }

    
    public java.sql.Date getFix_Val_Dy() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(73);
    }

    
    public java.sql.Date getQt_Valid_F() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(30);
    }

    
    public void setExch_Rate_Fi_V(java.math.BigDecimal Exch_Rate_Fi_V) {
        baseTypeData().setElementValue(104, Exch_Rate_Fi_V);
    }

    
    public void setPp_Search(java.lang.String Pp_Search) {
        baseTypeData().setElementValue(48, Pp_Search);
    }

    
    public java.lang.String getBill_Sched() {
        return (java.lang.String)baseTypeData().getElementValueAsString(68);
    }

    
    public void setRefdoctype(java.lang.String Refdoctype) {
        baseTypeData().setElementValue(2, Refdoctype);
    }

    
    public void setCt_Valid_F(java.sql.Date Ct_Valid_F) {
        baseTypeData().setElementValue(32, Ct_Valid_F);
    }

    
    public java.lang.String getInvo_Sched() {
        return (java.lang.String)baseTypeData().getElementValueAsString(69);
    }

    
    public java.lang.String getNotif_No() {
        return (java.lang.String)baseTypeData().getElementValueAsString(102);
    }

    
    public java.lang.String getDunn_Block() {
        return (java.lang.String)baseTypeData().getElementValueAsString(80);
    }

    
    public void setEutri_Deal(java.lang.String Eutri_Deal) {
        baseTypeData().setElementValue(96, Eutri_Deal);
    }

    
    public java.math.BigDecimal getExchg_Rate() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(76);
    }

    
    public void setCstcndgrp1(java.lang.String Cstcndgrp1) {
        baseTypeData().setElementValue(85, Cstcndgrp1);
    }

    
    public java.lang.String getTaxdep_Cty() {
        return (java.lang.String)baseTypeData().getElementValueAsString(94);
    }

    
    public void setDoc_Type(java.lang.String Doc_Type) {
        baseTypeData().setElementValue(3, Doc_Type);
    }

    
    public java.lang.String getCreated_By() {
        return (java.lang.String)baseTypeData().getElementValueAsString(93);
    }

    
    public java.lang.String getPmtgar_Pro() {
        return (java.lang.String)baseTypeData().getElementValueAsString(81);
    }

    
    public void setCstcndgrp2(java.lang.String Cstcndgrp2) {
        baseTypeData().setElementValue(86, Cstcndgrp2);
    }

    
    public java.sql.Date getCmlqty_Dat() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(100);
    }

    
    public void setComp_Cde_B(java.lang.String Comp_Cde_B) {
        baseTypeData().setElementValue(54, Comp_Cde_B);
    }

    
    public void setWbs_Elem(java.lang.String Wbs_Elem) {
        baseTypeData().setElementValue(103, Wbs_Elem);
    }

    
    public java.lang.String getRefobjtype() {
        return (java.lang.String)baseTypeData().getElementValueAsString(0);
    }

    
    public void setCalc_Motive(java.lang.String Calc_Motive) {
        baseTypeData().setElementValue(115, Calc_Motive);
    }

    
    public java.lang.String getCurrency() {
        return (java.lang.String)baseTypeData().getElementValueAsString(91);
    }

    
    public java.lang.String getPp_Search() {
        return (java.lang.String)baseTypeData().getElementValueAsString(48);
    }

    
    public java.lang.String getRef_Doc_L() {
        return (java.lang.String)baseTypeData().getElementValueAsString(64);
    }

    
    public java.lang.String getOrd_Reason() {
        return (java.lang.String)baseTypeData().getElementValueAsString(27);
    }

    
    public void setChkprtauth(java.lang.String Chkprtauth) {
        baseTypeData().setElementValue(99, Chkprtauth);
    }

    
    public void setTax_Class7(java.lang.String Tax_Class7) {
        baseTypeData().setElementValue(61, Tax_Class7);
    }

    
    public void setPymt_Meth(java.lang.String Pymt_Meth) {
        baseTypeData().setElementValue(74, Pymt_Meth);
    }

    
    public java.sql.Date getPurch_Date() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(12);
    }

    
    public java.lang.String getCust_Group() {
        return (java.lang.String)baseTypeData().getElementValueAsString(19);
    }

    
    public void setSd_Doc_Cat(java.lang.String Sd_Doc_Cat) {
        baseTypeData().setElementValue(44, Sd_Doc_Cat);
    }

    
    public void setTax_Class3(java.lang.String Tax_Class3) {
        baseTypeData().setElementValue(57, Tax_Class3);
    }

    
    public void setDistr_Chan(java.lang.String Distr_Chan) {
        baseTypeData().setElementValue(6, Distr_Chan);
    }

    
    public void setDlvschduse(java.lang.String Dlvschduse) {
        baseTypeData().setElementValue(51, Dlvschduse);
    }

    
    public java.lang.String getBill_Block() {
        return (java.lang.String)baseTypeData().getElementValueAsString(26);
    }

    
    public java.sql.Date getQt_Valid_T() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(31);
    }

    
    public void setCstcndgrp5(java.lang.String Cstcndgrp5) {
        baseTypeData().setElementValue(89, Cstcndgrp5);
    }

    
    public java.lang.String getS_Proc_Ind() {
        return (java.lang.String)baseTypeData().getElementValueAsString(112);
    }

    
    public java.lang.String getRec_Point() {
        return (java.lang.String)baseTypeData().getElementValueAsString(83);
    }

    
    public void setMast_Contr(java.lang.String Mast_Contr) {
        baseTypeData().setElementValue(97, Mast_Contr);
    }

    
    public java.lang.String getTelephone() {
        return (java.lang.String)baseTypeData().getElementValueAsString(17);
    }

    
    public java.lang.String getFkk_Conacct() {
        return (java.lang.String)baseTypeData().getElementValueAsString(106);
    }

    
    public void setDoc_Date(java.sql.Date Doc_Date) {
        baseTypeData().setElementValue(45, Doc_Date);
    }

    
    public void setPo_Supplem(java.lang.String Po_Supplem) {
        baseTypeData().setElementValue(14, Po_Supplem);
    }

    
    public void setRef_Doc_L(java.lang.String Ref_Doc_L) {
        baseTypeData().setElementValue(64, Ref_Doc_L);
    }

    
    public void setPo_Meth_S(java.lang.String Po_Meth_S) {
        baseTypeData().setElementValue(42, Po_Meth_S);
    }

    
    public java.lang.String getComp_Cde_B() {
        return (java.lang.String)baseTypeData().getElementValueAsString(54);
    }

    
    public java.lang.String getDlv_Block() {
        return (java.lang.String)baseTypeData().getElementValueAsString(25);
    }

    
    public java.lang.String getOrdcomb_In() {
        return (java.lang.String)baseTypeData().getElementValueAsString(67);
    }

    
    public java.lang.String getAccnt_Asgn() {
        return (java.lang.String)baseTypeData().getElementValueAsString(75);
    }

    
    public void setCurr_Iso(java.lang.String Curr_Iso) {
        baseTypeData().setElementValue(92, Curr_Iso);
    }

    
    public void setOrd_Reason(java.lang.String Ord_Reason) {
        baseTypeData().setElementValue(27, Ord_Reason);
    }

    
    public java.lang.String getCalc_Motive() {
        return (java.lang.String)baseTypeData().getElementValueAsString(115);
    }

    
    public java.lang.String getTax_Class2() {
        return (java.lang.String)baseTypeData().getElementValueAsString(56);
    }

    
    public void setQt_Valid_F(java.sql.Date Qt_Valid_F) {
        baseTypeData().setElementValue(30, Qt_Valid_F);
    }

    
    public void setExrate_Fi(java.math.BigDecimal Exrate_Fi) {
        baseTypeData().setElementValue(71, Exrate_Fi);
    }

    
    public java.lang.String getRef_Doc_L_Long() {
        return (java.lang.String)baseTypeData().getElementValueAsString(113);
    }

    
    public void setCust_Grp1(java.lang.String Cust_Grp1) {
        baseTypeData().setElementValue(34, Cust_Grp1);
    }

    
    public java.lang.String getCust_Grp1() {
        return (java.lang.String)baseTypeData().getElementValueAsString(34);
    }

    
    public java.lang.String getShip_Cond() {
        return (java.lang.String)baseTypeData().getElementValueAsString(47);
    }

    
    public java.sql.Date getBill_Date() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(77);
    }

    
    public java.lang.String getCstcndgrp1() {
        return (java.lang.String)baseTypeData().getElementValueAsString(85);
    }

    
    public java.lang.String getPrice_List() {
        return (java.lang.String)baseTypeData().getElementValueAsString(21);
    }

    
    public void setPrice_List(java.lang.String Price_List) {
        baseTypeData().setElementValue(21, Price_List);
    }

    
    public java.lang.String getCompl_Dlv() {
        return (java.lang.String)baseTypeData().getElementValueAsString(28);
    }

    
    public java.lang.String getMast_Contr() {
        return (java.lang.String)baseTypeData().getElementValueAsString(97);
    }

    
    public void setPrice_Date(java.sql.Date Price_Date) {
        baseTypeData().setElementValue(29, Price_Date);
    }

    
    public void setCstcndgrp3(java.lang.String Cstcndgrp3) {
        baseTypeData().setElementValue(87, Cstcndgrp3);
    }

    
    public void setRefdoc_Cat(java.lang.String Refdoc_Cat) {
        baseTypeData().setElementValue(66, Refdoc_Cat);
    }

    
    public void setS_Proc_Ind(java.lang.String S_Proc_Ind) {
        baseTypeData().setElementValue(112, S_Proc_Ind);
    }

    
    public void setCust_Group(java.lang.String Cust_Group) {
        baseTypeData().setElementValue(19, Cust_Group);
    }

    
    public java.sql.Date getDoc_Date() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(45);
    }

    
    public void setTaxdep_Cty(java.lang.String Taxdep_Cty) {
        baseTypeData().setElementValue(94, Taxdep_Cty);
    }

    
    public java.lang.String getPo_Meth_S() {
        return (java.lang.String)baseTypeData().getElementValueAsString(42);
    }

    
    public java.lang.String getTax_Class3() {
        return (java.lang.String)baseTypeData().getElementValueAsString(57);
    }

    
    public void setDun_Date(java.sql.Date Dun_Date) {
        baseTypeData().setElementValue(50, Dun_Date);
    }

    
    public void setFix_Val_Dy(java.sql.Date Fix_Val_Dy) {
        baseTypeData().setElementValue(73, Fix_Val_Dy);
    }

    
    public java.lang.String getRef_Proc() {
        return (java.lang.String)baseTypeData().getElementValueAsString(98);
    }

    
    public void setBill_Date(java.sql.Date Bill_Date) {
        baseTypeData().setElementValue(77, Bill_Date);
    }

    
    public java.lang.String getAlttax_Cls() {
        return (java.lang.String)baseTypeData().getElementValueAsString(55);
    }

    
    public void setPo_Method(java.lang.String Po_Method) {
        baseTypeData().setElementValue(13, Po_Method);
    }

    
    public void setTaxdst_Cty(java.lang.String Taxdst_Cty) {
        baseTypeData().setElementValue(95, Taxdst_Cty);
    }

    
    public java.lang.String getCust_Grp3() {
        return (java.lang.String)baseTypeData().getElementValueAsString(36);
    }

    
    public void setCt_Valid_T(java.sql.Date Ct_Valid_T) {
        baseTypeData().setElementValue(33, Ct_Valid_T);
    }

    
    public java.lang.String getEutri_Deal() {
        return (java.lang.String)baseTypeData().getElementValueAsString(96);
    }

    
    public void setOrdcomb_In(java.lang.String Ordcomb_In) {
        baseTypeData().setElementValue(67, Ordcomb_In);
    }

    
    public void setMn_Invoice(java.lang.String Mn_Invoice) {
        baseTypeData().setElementValue(70, Mn_Invoice);
    }

    
    public void setDunn_Key(java.lang.String Dunn_Key) {
        baseTypeData().setElementValue(79, Dunn_Key);
    }

    
    public MetaData metadata() {
        return metadata;
    }

    
    public void setRec_Point(java.lang.String Rec_Point) {
        baseTypeData().setElementValue(83, Rec_Point);
    }

    
    public void setDoc_Class(java.lang.String Doc_Class) {
        baseTypeData().setElementValue(108, Doc_Class);
    }

    
    public void setCurrency(java.lang.String Currency) {
        baseTypeData().setElementValue(91, Currency);
    }

    
    public void setRef_Doc_L_Long(java.lang.String Ref_Doc_L_Long) {
        baseTypeData().setElementValue(113, Ref_Doc_L_Long);
    }

    
    public void setDate_Type(java.lang.String Date_Type) {
        baseTypeData().setElementValue(11, Date_Type);
    }

    
    public java.lang.String getCust_Grp2() {
        return (java.lang.String)baseTypeData().getElementValueAsString(35);
    }

    
    public void setCollect_No(java.lang.String Collect_No) {
        baseTypeData().setElementValue(4, Collect_No);
    }

    
    public void setTax_Class6(java.lang.String Tax_Class6) {
        baseTypeData().setElementValue(60, Tax_Class6);
    }

    
    public void setTax_Class2(java.lang.String Tax_Class2) {
        baseTypeData().setElementValue(56, Tax_Class2);
    }

    
    public java.lang.String getPo_Supplem() {
        return (java.lang.String)baseTypeData().getElementValueAsString(14);
    }

    
    public java.lang.String getH_Curr_Iso() {
        return (java.lang.String)baseTypeData().getElementValueAsString(110);
    }

    
    public java.lang.String getRefdoctype() {
        return (java.lang.String)baseTypeData().getElementValueAsString(2);
    }

    
    public void setTax_Class8(java.lang.String Tax_Class8) {
        baseTypeData().setElementValue(62, Tax_Class8);
    }

    
    public void setDepartm_No(java.lang.String Departm_No) {
        baseTypeData().setElementValue(82, Departm_No);
    }

    
    public void setLine_Time(java.sql.Time Line_Time) {
        baseTypeData().setElementValue(114, Line_Time);
    }

    
    public java.lang.String getDlv_Time() {
        return (java.lang.String)baseTypeData().getElementValueAsString(90);
    }

    
    public java.lang.String getCurr_Iso() {
        return (java.lang.String)baseTypeData().getElementValueAsString(92);
    }

    
    public java.sql.Date getReq_Date_H() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(10);
    }

    
    public java.lang.String getShip_Type() {
        return (java.lang.String)baseTypeData().getElementValueAsString(111);
    }

    
    public void setAss_Number(java.lang.String Ass_Number) {
        baseTypeData().setElementValue(65, Ass_Number);
    }

    
    public java.lang.String getSales_Org() {
        return (java.lang.String)baseTypeData().getElementValueAsString(5);
    }

    
    public java.lang.String getPrice_Grp() {
        return (java.lang.String)baseTypeData().getElementValueAsString(18);
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  Bapisdhd1Type parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Bapisdhd1Type parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getIncoterms1() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(22);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDlvschduse() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(51);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTaxdst_Cty() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(95);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDivision() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(7);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDoc_Num_Fi() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(84);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRefdoc_Cat() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(66);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getWar_Date() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(46);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRef_1_S() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(43);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getFix_Val_Dy() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(73);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCust_Grp5() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(38);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTax_Class5() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(59);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getQt_Valid_F() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(30);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPurch_No_C() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(39);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getIncoterms2() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(23);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getAdd_Val_Dy() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(72);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getBill_Sched() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(68);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCstcndgrp5() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(89);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRef_Doc() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(53);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getInvo_Sched() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(69);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCstcndgrp4() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(88);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getNotif_No() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(102);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTax_Class4() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(58);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCust_Grp4() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(37);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDunn_Block() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(80);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getExchg_Rate() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(76);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTaxdep_Cty() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(94);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCreated_By() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(93);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPmtgar_Pro() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(81);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCmlqty_Dat() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(100);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getH_Curr() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(109);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRefobjtype() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCurrency() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(91);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPp_Search() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(48);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCstcndgrp3() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(87);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRef_Doc_L() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(64);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPrice_Date() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(29);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getOrd_Reason() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(27);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTax_Class7() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(61);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPo_Dat_S() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(41);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getChkprtauth() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(99);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPurch_Date() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(12);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCust_Group() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(19);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSales_Off() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(9);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRefobjkey() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCampaign() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(107);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getBill_Block() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(26);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMn_Invoice() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(70);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getQt_Valid_T() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(31);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDunn_Key() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(79);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getS_Proc_Ind() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(112);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getExrate_Fi() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(71);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRec_Point() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(83);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCstcndgrp2() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(86);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTelephone() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(17);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSd_Doc_Cat() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(44);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPldlvstyp() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(52);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getExchg_Rate_V() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(105);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDoc_Type() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getFkk_Conacct() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(106);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDistr_Chan() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(6);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTax_Class6() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(60);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRef_1() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(15);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getComp_Cde_B() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(54);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDlv_Block() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(25);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getOrdcomb_In() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(67);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDun_Date() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(50);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getAccnt_Asgn() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(75);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCalc_Motive() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(115);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTax_Class2() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(56);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTax_Class9() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(63);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRef_Doc_L_Long() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(113);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getAss_Number() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(65);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPymt_Meth() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(74);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCust_Grp1() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(34);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getShip_Cond() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(47);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getBill_Date() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(77);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCstcndgrp1() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(85);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getExch_Rate_Fi_V() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(104);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPrice_List() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(21);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCompl_Dlv() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(28);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getName() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(16);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMast_Contr() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(97);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCt_Valid_F() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(32);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDoc_Date() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(45);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCollect_No() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(4);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSales_Dist() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(20);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPo_Meth_S() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(42);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTax_Class3() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(57);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRef_Proc() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(98);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDate_Type() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(11);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDepartm_No() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(82);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getAlttax_Cls() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(55);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTax_Class8() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(62);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDun_Count() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(49);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCt_Valid_T() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(33);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getLine_Time() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(114);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCust_Grp3() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(36);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getEutri_Deal() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(96);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSales_Grp() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(8);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPmnttrms() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(24);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getServ_Date() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(78);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPurch_No_S() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(40);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCust_Grp2() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(35);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPo_Method() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(13);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPo_Supplem() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(14);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getH_Curr_Iso() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(110);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getWbs_Elem() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(103);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRefdoctype() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDlv_Time() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(90);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCurr_Iso() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(92);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getReq_Date_H() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(10);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDoc_Class() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(108);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getShip_Type() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(111);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getVersion() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(101);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSales_Org() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(5);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPrice_Grp() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(18);
        }
    
    }

}
