package hmh.sap.rfc;


public class BapisdhdType extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1354127028438L) ;

    private  BapisdhdType.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.XSDL_COMPLEX_TYPE, "urn:sap-com:document:sap:rfc:functions", "BAPISDHD", 115, 0, hmh.sap.rfc.BapisdhdType.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "BAPISDHD", 817, 1604, -1, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"BAPISDHD\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">BAPI Structure of VBAK with English Field Names</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>110</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>817</ifr:internalLength1><ifr:internalLength2>1604</ifr:internalLength2></ifr:definition></ifr:container></s0:type>");
        descriptorSetElementProperties(descriptor, 0, "OPERATION", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Operation", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "OPERATION", 0, 0, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"OPERATION\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Function</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>0</ifr:offset1><ifr:offset2>0</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MSGFN\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 1, "DOC_NUMBER", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Doc_Number", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "DOC_NUMBER", 3, 6, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DOC_NUMBER\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Sales Document</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>3</ifr:offset1><ifr:offset2>6</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VBELN_VA\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 2, "REC_DATE", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Rec_Date", java.sql.Date.class, null, new java.lang.String[][]{}, "REC_DATE", 13, 26, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REC_DATE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Date on which the record was created</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>13</ifr:offset1><ifr:offset2>26</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ERDAT\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 3, "REC_TIME", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:time", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Rec_Time", java.sql.Time.class, null, new java.lang.String[][]{}, "REC_TIME", 21, 42, -1, 6, 12, -1, com.sap.mw.jco.JCO.TYPE_TIME, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REC_TIME\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Entry time</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>21</ifr:offset1><ifr:offset2>42</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ERZET\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>TIMS</ifr:type><ifr:abapType>T</ifr:abapType><ifr:length>6</ifr:length><ifr:internalLength1>6</ifr:internalLength1><ifr:internalLength2>12</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>8</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 4, "CREATED_BY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Created_By", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "12"}}, "CREATED_BY", 27, 54, -1, 12, 24, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CREATED_BY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Name of Person who Created the Object</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>27</ifr:offset1><ifr:offset2>54</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ERNAM\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>12</ifr:length><ifr:internalLength1>12</ifr:internalLength1><ifr:internalLength2>24</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>12</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 5, "QT_VALID_F", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Qt_Valid_F", java.sql.Date.class, null, new java.lang.String[][]{}, "QT_VALID_F", 39, 78, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"QT_VALID_F\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Quotation/Inquiry is valid from</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>39</ifr:offset1><ifr:offset2>78</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ANGDT_V\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 6, "QT_VALID_T", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Qt_Valid_T", java.sql.Date.class, null, new java.lang.String[][]{}, "QT_VALID_T", 47, 94, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"QT_VALID_T\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Date until which bid/quotation is binding (valid-to date)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>47</ifr:offset1><ifr:offset2>94</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BNDDT\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 7, "DOC_DATE", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Doc_Date", java.sql.Date.class, null, new java.lang.String[][]{}, "DOC_DATE", 55, 110, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DOC_DATE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Document date (date received/sent)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>55</ifr:offset1><ifr:offset2>110</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AUDAT\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 8, "SD_DOC_CAT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Sd_Doc_Cat", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "SD_DOC_CAT", 63, 126, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SD_DOC_CAT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">SD document category</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>63</ifr:offset1><ifr:offset2>126</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VBTYP\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 9, "TRAN_GROUP", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Tran_Group", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "TRAN_GROUP", 64, 128, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TRAN_GROUP\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Transaction group</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>64</ifr:offset1><ifr:offset2>128</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"TRVOG\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 10, "DOC_TYPE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Doc_Type", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "DOC_TYPE", 65, 130, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DOC_TYPE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Sales Document Type</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>65</ifr:offset1><ifr:offset2>130</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AUART\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength><ifr:conversionExit>AUART</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 11, "ORD_REASON", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ord_Reason", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "ORD_REASON", 69, 138, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ORD_REASON\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Order reason (reason for the business transaction)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>69</ifr:offset1><ifr:offset2>138</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AUGRU\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 12, "WAR_DATE", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "War_Date", java.sql.Date.class, null, new java.lang.String[][]{}, "WAR_DATE", 72, 144, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"WAR_DATE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Guarantee date</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>72</ifr:offset1><ifr:offset2>144</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"GWLDT\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 13, "SD_COL_NUM", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Sd_Col_Num", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "SD_COL_NUM", 80, 160, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SD_COL_NUM\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Collective number (SD)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>80</ifr:offset1><ifr:offset2>160</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"SUBMI_SD\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 14, "DLV_BLOCK", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Dlv_Block", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "DLV_BLOCK", 90, 180, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DLV_BLOCK\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Delivery block (document header)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>90</ifr:offset1><ifr:offset2>180</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"LIFSK\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 15, "BILL_BLOCK", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Bill_Block", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "BILL_BLOCK", 92, 184, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"BILL_BLOCK\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Billing block in SD document</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>92</ifr:offset1><ifr:offset2>184</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"FAKSK\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 16, "NET_VAL_HD", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Net_Val_Hd", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "28"}, {"fractionDigits", "9"}}, "NET_VAL_HD", 94, 188, -1, 15, 15, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"NET_VAL_HD\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Currency amount for BAPIS (with 9 decimal places)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>94</ifr:offset1><ifr:offset2>188</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPICUREXT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>28</ifr:length><ifr:internalLength1>15</ifr:internalLength1><ifr:internalLength2>15</ifr:internalLength2><ifr:decimals>9</ifr:decimals><ifr:outputLength>35</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 17, "CURRENCY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Currency", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "5"}}, "CURRENCY", 109, 204, -1, 5, 10, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CURRENCY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">SD document currency</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>109</ifr:offset1><ifr:offset2>204</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"WAERK\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CUKY</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>5</ifr:length><ifr:internalLength1>5</ifr:internalLength1><ifr:internalLength2>10</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>5</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 18, "CURREN_ISO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Curren_Iso", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "CURREN_ISO", 114, 214, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CURREN_ISO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">ISO code currency</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>114</ifr:offset1><ifr:offset2>214</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"WAERS_ISO\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 19, "SALES_ORG", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Sales_Org", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "SALES_ORG", 117, 220, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SALES_ORG\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Sales Organization</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>117</ifr:offset1><ifr:offset2>220</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VKORG\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 20, "DISTR_CHAN", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Distr_Chan", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "DISTR_CHAN", 121, 228, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DISTR_CHAN\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Distribution Channel</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>121</ifr:offset1><ifr:offset2>228</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VTWEG\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 21, "DIVISION", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Division", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "DIVISION", 123, 232, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DIVISION\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Division</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>123</ifr:offset1><ifr:offset2>232</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"SPART\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 22, "SALES_GRP", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Sales_Grp", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "SALES_GRP", 125, 236, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SALES_GRP\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Sales group</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>125</ifr:offset1><ifr:offset2>236</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VKGRP\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 23, "SALES_OFF", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Sales_Off", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "SALES_OFF", 128, 242, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SALES_OFF\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Sales office</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>128</ifr:offset1><ifr:offset2>242</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VKBUR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 24, "BUS_AREA", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Bus_Area", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "BUS_AREA", 132, 250, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"BUS_AREA\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Business Area</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>132</ifr:offset1><ifr:offset2>250</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"GSBER\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 25, "CT_AREA", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ct_Area", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "CT_AREA", 136, 258, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CT_AREA\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Business area from cost center</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>136</ifr:offset1><ifr:offset2>258</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"GSKST\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 26, "CT_VALID_F", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ct_Valid_F", java.sql.Date.class, null, new java.lang.String[][]{}, "CT_VALID_F", 140, 266, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CT_VALID_F\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Valid-from date (outline agreements, product proposals)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>140</ifr:offset1><ifr:offset2>266</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"GUEBG\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 27, "CT_VALID_T", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ct_Valid_T", java.sql.Date.class, null, new java.lang.String[][]{}, "CT_VALID_T", 148, 282, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CT_VALID_T\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Valid-to date (outline agreements, product proposals)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>148</ifr:offset1><ifr:offset2>282</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"GUEEN\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 28, "CONDITIONS", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Conditions", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "CONDITIONS", 156, 298, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CONDITIONS\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Number of the document condition</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>156</ifr:offset1><ifr:offset2>298</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KNUMV\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 29, "REQ_DATE_H", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Req_Date_H", java.sql.Date.class, null, new java.lang.String[][]{}, "REQ_DATE_H", 166, 318, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REQ_DATE_H\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Requested delivery date</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>166</ifr:offset1><ifr:offset2>318</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"EDATU_VBAK\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 30, "DATE_TYPE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Date_Type", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "DATE_TYPE", 174, 334, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DATE_TYPE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Proposed date type</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>174</ifr:offset1><ifr:offset2>334</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PRGRS_VBAK\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 31, "COMPL_DLV", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Compl_Dlv", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "COMPL_DLV", 175, 336, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"COMPL_DLV\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Complete delivery defined for each sales order?</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>175</ifr:offset1><ifr:offset2>336</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AUTLF\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 32, "DOC_CLASS", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Doc_Class", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "9"}}, "DOC_CLASS", 176, 338, -1, 9, 18, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DOC_CLASS\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Original system with release and transaction control</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>176</ifr:offset1><ifr:offset2>338</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VBKLA\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>9</ifr:length><ifr:internalLength1>9</ifr:internalLength1><ifr:internalLength2>18</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>9</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 33, "DOC_INDIC", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Doc_Indic", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "DOC_INDIC", 185, 356, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DOC_INDIC\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">SD document indicator</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>185</ifr:offset1><ifr:offset2>356</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VBKLT\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 34, "SD_PRIC_PR", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Sd_Pric_Pr", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "6"}}, "SD_PRIC_PR", 186, 358, -1, 6, 12, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SD_PRIC_PR\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Sales and Distribution: Pricing Procedure in Pricing</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>186</ifr:offset1><ifr:offset2>358</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KALSMASD\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>6</ifr:length><ifr:internalLength1>6</ifr:internalLength1><ifr:internalLength2>12</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>6</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 35, "SHIP_COND", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ship_Cond", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "SHIP_COND", 192, 370, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SHIP_COND\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Shipping conditions</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>192</ifr:offset1><ifr:offset2>370</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VSBED\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 36, "ORDBILLTYP", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ordbilltyp", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "ORDBILLTYP", 194, 374, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ORDBILLTYP\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Proposed billing type for an order-related billing document</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>194</ifr:offset1><ifr:offset2>374</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"FKARA\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 37, "ORD_PROBAB", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ord_Probab", java.lang.String.class, null, new java.lang.String[][]{{"pattern", "\\d+"}, {"maxLength", "3"}}, "ORD_PROBAB", 198, 382, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_NUM, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ORD_PROBAB\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Sales probability</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>198</ifr:offset1><ifr:offset2>382</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AWAHR_AK\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>NUMC</ifr:type><ifr:abapType>N</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 38, "SEAR_PRPR", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Sear_Prpr", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "40"}}, "SEAR_PRPR", 201, 388, -1, 40, 80, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SEAR_PRPR\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Search term for product proposal</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>201</ifr:offset1><ifr:offset2>388</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KTEXT_V\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>40</ifr:length><ifr:internalLength1>40</ifr:internalLength1><ifr:internalLength2>80</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>40</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 39, "PURCH_NO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Purch_No", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "20"}}, "PURCH_NO", 241, 468, -1, 20, 40, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PURCH_NO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Customer purchase order number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>241</ifr:offset1><ifr:offset2>468</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BSTNK\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>20</ifr:length><ifr:internalLength1>20</ifr:internalLength1><ifr:internalLength2>40</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>20</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 40, "PO_METHOD", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Po_Method", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "PO_METHOD", 261, 508, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PO_METHOD\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Customer purchase order type</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>261</ifr:offset1><ifr:offset2>508</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BSARK\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 41, "PURCH_DATE", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Purch_Date", java.sql.Date.class, null, new java.lang.String[][]{}, "PURCH_DATE", 265, 516, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PURCH_DATE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Customer purchase order date</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>265</ifr:offset1><ifr:offset2>516</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BSTDK\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 42, "PO_SUPPLEM", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Po_Supplem", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "PO_SUPPLEM", 273, 532, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PO_SUPPLEM\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Purchase order number supplement</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>273</ifr:offset1><ifr:offset2>532</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BSTZD\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 43, "REF_1", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ref_1", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "12"}}, "REF_1", 277, 540, -1, 12, 24, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REF_1\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Customer&apos;s or vendor&apos;s internal reference</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>277</ifr:offset1><ifr:offset2>540</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"IHREZ\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>12</ifr:length><ifr:internalLength1>12</ifr:internalLength1><ifr:internalLength2>24</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>12</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 44, "ORDERER_NA", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Orderer_Na", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "35"}}, "ORDERER_NA", 289, 564, -1, 35, 70, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ORDERER_NA\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Name of orderer</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>289</ifr:offset1><ifr:offset2>564</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BNAME_V\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>35</ifr:length><ifr:internalLength1>35</ifr:internalLength1><ifr:internalLength2>70</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>35</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 45, "TELEPHONE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Telephone", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "16"}}, "TELEPHONE", 324, 634, -1, 16, 32, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TELEPHONE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Telephone number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>324</ifr:offset1><ifr:offset2>634</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"TELF1_VP\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>16</ifr:length><ifr:internalLength1>16</ifr:internalLength1><ifr:internalLength2>32</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>16</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 46, "DUN_COUNT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Dun_Count", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "3"}, {"fractionDigits", "0"}}, "DUN_COUNT", 340, 666, -1, 2, 2, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DUN_COUNT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Number of contacts from the customer</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>340</ifr:offset1><ifr:offset2>666</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MAHZA\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 47, "DUN_DATE", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Dun_Date", java.sql.Date.class, null, new java.lang.String[][]{}, "DUN_DATE", 342, 668, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DUN_DATE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Last customer contact date</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>342</ifr:offset1><ifr:offset2>668</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MAHDT\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 48, "SOLD_TO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Sold_To", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "SOLD_TO", 350, 684, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SOLD_TO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Sold-to party</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>350</ifr:offset1><ifr:offset2>684</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KUNAG\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 49, "COSTCENTER", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Costcenter", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "COSTCENTER", 360, 704, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"COSTCENTER\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Cost Center</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>360</ifr:offset1><ifr:offset2>704</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KOSTL\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 50, "UPDATE_GRP", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Update_Grp", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "6"}}, "UPDATE_GRP", 370, 724, -1, 6, 12, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"UPDATE_GRP\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Update group for statistics update</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>370</ifr:offset1><ifr:offset2>724</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"STAFO\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>6</ifr:length><ifr:internalLength1>6</ifr:internalLength1><ifr:internalLength2>12</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>6</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 51, "STAT_CURR", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Stat_Curr", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "5"}}, "STAT_CURR", 376, 736, -1, 5, 10, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"STAT_CURR\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Statistics currency</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>376</ifr:offset1><ifr:offset2>736</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"STWAE\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CUKY</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>5</ifr:length><ifr:internalLength1>5</ifr:internalLength1><ifr:internalLength2>10</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>5</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 52, "ISOSTATCUR", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Isostatcur", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "ISOSTATCUR", 381, 746, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ISOSTATCUR\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">ISO code currency</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>381</ifr:offset1><ifr:offset2>746</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"WAERS_ISO\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 53, "CH_ON", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ch_On", java.sql.Date.class, null, new java.lang.String[][]{}, "CH_ON", 384, 752, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CH_ON\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Date of Last Change</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>384</ifr:offset1><ifr:offset2>752</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AEDAT\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 54, "CUST_GRP1", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cust_Grp1", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "CUST_GRP1", 392, 768, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CUST_GRP1\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Carton Roundng Allowed</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>392</ifr:offset1><ifr:offset2>768</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KVGR1\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 55, "CUST_GRP2", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cust_Grp2", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "CUST_GRP2", 395, 774, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CUST_GRP2\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Contract Pricing Allowed</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>395</ifr:offset1><ifr:offset2>774</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KVGR2\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 56, "CUST_GRP3", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cust_Grp3", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "CUST_GRP3", 398, 780, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CUST_GRP3\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Substitution Allowed</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>398</ifr:offset1><ifr:offset2>780</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KVGR3\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 57, "CUST_GRP4", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cust_Grp4", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "CUST_GRP4", 401, 786, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CUST_GRP4\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Freight Terms</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>401</ifr:offset1><ifr:offset2>786</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KVGR4\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 58, "CUST_GRP5", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cust_Grp5", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "CUST_GRP5", 404, 792, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CUST_GRP5\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Promotion Code</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>404</ifr:offset1><ifr:offset2>792</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KVGR5\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 59, "AGREE_COND", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Agree_Cond", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "AGREE_COND", 407, 798, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"AGREE_COND\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Agreement (various conditions grouped together)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>407</ifr:offset1><ifr:offset2>798</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KNUMA\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 60, "CO_AREA", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Co_Area", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "CO_AREA", 417, 818, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CO_AREA\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Controlling Area</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>417</ifr:offset1><ifr:offset2>818</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KOKRS\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 61, "WBS_ELEM", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Wbs_Elem", java.lang.String.class, null, new java.lang.String[][]{{"pattern", "\\d+"}, {"maxLength", "8"}}, "WBS_ELEM", 421, 826, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_NUM, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"WBS_ELEM\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Work Breakdown Structure Element (WBS Element)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>421</ifr:offset1><ifr:offset2>826</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PS_PSP_PNR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>NUMC</ifr:type><ifr:abapType>N</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>24</ifr:outputLength><ifr:conversionExit>ABPSP</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 62, "EXCHG_RATE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Exchg_Rate", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "EXCHG_RATE", 429, 842, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"EXCHG_RATE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Exchange Rate Type</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>429</ifr:offset1><ifr:offset2>842</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KURST\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 63, "C_CTR_AREA", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "C_Ctr_Area", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "C_CTR_AREA", 433, 850, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"C_CTR_AREA\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Credit control area</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>433</ifr:offset1><ifr:offset2>850</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KKBER\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 64, "CRED_ACCNT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cred_Accnt", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "CRED_ACCNT", 437, 858, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CRED_ACCNT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Customer&apos;s account number with credit limit reference</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>437</ifr:offset1><ifr:offset2>858</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KNKLI\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 65, "CRED_GROUP", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cred_Group", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "CRED_GROUP", 447, 878, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CRED_GROUP\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Customer Credit Group</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>447</ifr:offset1><ifr:offset2>878</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"GRUPP_CM\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 66, "REPR_GROUP", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Repr_Group", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "REPR_GROUP", 451, 886, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REPR_GROUP\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Credit representative group for credit management</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>451</ifr:offset1><ifr:offset2>886</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"SBGRP_CM\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 67, "RISK_CATEG", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Risk_Categ", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "RISK_CATEG", 454, 892, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"RISK_CATEG\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Credit management: Risk category</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>454</ifr:offset1><ifr:offset2>892</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CTLPC_CM\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 68, "CURR_CRED", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Curr_Cred", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "5"}}, "CURR_CRED", 457, 898, -1, 5, 10, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CURR_CRED\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Currency key of credit control area</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>457</ifr:offset1><ifr:offset2>898</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"WAERS_CM\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CUKY</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>5</ifr:length><ifr:internalLength1>5</ifr:internalLength1><ifr:internalLength2>10</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>5</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 69, "ISOCURRCRE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Isocurrcre", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "ISOCURRCRE", 462, 908, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ISOCURRCRE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">ISO code currency</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>462</ifr:offset1><ifr:offset2>908</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"WAERS_ISO\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 70, "REL_DAT_DD", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Rel_Dat_Dd", java.sql.Date.class, null, new java.lang.String[][]{}, "REL_DAT_DD", 465, 914, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REL_DAT_DD\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Release date of the document determined by credit management</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>465</ifr:offset1><ifr:offset2>914</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CMFRE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 71, "NEXT_CHDAT", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Next_Chdat", java.sql.Date.class, null, new java.lang.String[][]{}, "NEXT_CHDAT", 473, 930, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"NEXT_CHDAT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Date of next credit check of document</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>473</ifr:offset1><ifr:offset2>930</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CMNUP\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 72, "NEXT_DATE", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Next_Date", java.sql.Date.class, null, new java.lang.String[][]{}, "NEXT_DATE", 481, 946, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"NEXT_DATE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Next date</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>481</ifr:offset1><ifr:offset2>946</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CMNGV\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 73, "REL_CREDIT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Rel_Credit", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "28"}, {"fractionDigits", "9"}}, "REL_CREDIT", 489, 962, -1, 15, 15, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REL_CREDIT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Currency amount for BAPIS (with 9 decimal places)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>489</ifr:offset1><ifr:offset2>962</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPICUREXT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>28</ifr:length><ifr:internalLength1>15</ifr:internalLength1><ifr:internalLength2>15</ifr:internalLength2><ifr:decimals>9</ifr:decimals><ifr:outputLength>35</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 74, "HI_TYPE_PR", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Hi_Type_Pr", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "HI_TYPE_PR", 504, 978, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"HI_TYPE_PR\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Hierarchy type for pricing</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>504</ifr:offset1><ifr:offset2>978</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"HITYP_PR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 75, "DLVSCHEDUS", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Dlvschedus", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "DLVSCHEDUS", 505, 980, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DLVSCHEDUS\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Usage indicator</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>505</ifr:offset1><ifr:offset2>980</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ABRVW\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 76, "PLAN_DLV", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Plan_Dlv", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PLAN_DLV", 508, 986, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PLAN_DLV\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">MRP for delivery schedule types</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>508</ifr:offset1><ifr:offset2>986</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ABDIS\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 77, "REF_DOC", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ref_Doc", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "REF_DOC", 509, 988, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REF_DOC\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Document number of the reference document</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>509</ifr:offset1><ifr:offset2>988</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VGBEL\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 78, "OB_JNR_HD", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ob_Jnr_Hd", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "22"}}, "OB_JNR_HD", 519, 1008, -1, 22, 44, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"OB_JNR_HD\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Object number at header level</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>519</ifr:offset1><ifr:offset2>1008</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"OBJKO\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>22</ifr:length><ifr:internalLength1>22</ifr:internalLength1><ifr:internalLength2>44</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>22</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 79, "COMP_CODE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Comp_Code", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "COMP_CODE", 541, 1052, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"COMP_CODE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Company code to be billed</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>541</ifr:offset1><ifr:offset2>1052</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BUKRS_VF\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 80, "ALT_TAX_CL", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Alt_Tax_Cl", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "ALT_TAX_CL", 545, 1060, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ALT_TAX_CL\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Alternative tax classification</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>545</ifr:offset1><ifr:offset2>1060</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"TAXK1_AK\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 81, "TAX_CLASS2", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Tax_Class2", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "TAX_CLASS2", 546, 1062, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TAX_CLASS2\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Tax classification 2 for customer</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>546</ifr:offset1><ifr:offset2>1062</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"TAXK2\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 82, "TAX_CLASS3", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Tax_Class3", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "TAX_CLASS3", 547, 1064, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TAX_CLASS3\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Tax classification 3 for customer</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>547</ifr:offset1><ifr:offset2>1064</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"TAXK3\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 83, "TAX_CLASS4", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Tax_Class4", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "TAX_CLASS4", 548, 1066, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TAX_CLASS4\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Tax classification 4 for customer</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>548</ifr:offset1><ifr:offset2>1066</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"TAXK4\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 84, "TAX_CLASS5", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Tax_Class5", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "TAX_CLASS5", 549, 1068, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TAX_CLASS5\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Tax classification 5 for customer</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>549</ifr:offset1><ifr:offset2>1068</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"TAXK5\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 85, "TAX_CLASS6", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Tax_Class6", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "TAX_CLASS6", 550, 1070, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TAX_CLASS6\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Tax classification 6 for customer</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>550</ifr:offset1><ifr:offset2>1070</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"TAXK6\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 86, "TAX_CLASS7", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Tax_Class7", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "TAX_CLASS7", 551, 1072, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TAX_CLASS7\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Tax classification 7 for customer</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>551</ifr:offset1><ifr:offset2>1072</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"TAXK7\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 87, "TAX_CLASS8", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Tax_Class8", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "TAX_CLASS8", 552, 1074, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TAX_CLASS8\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Tax classification 8 for customer</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>552</ifr:offset1><ifr:offset2>1074</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"TAXK8\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 88, "TAX_CLASS9", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Tax_Class9", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "TAX_CLASS9", 553, 1076, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TAX_CLASS9\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Tax classification 9 for customer</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>553</ifr:offset1><ifr:offset2>1076</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"TAXK9\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 89, "REF_DOC_L", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ref_Doc_L", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "16"}}, "REF_DOC_L", 554, 1078, -1, 16, 32, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REF_DOC_L\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Reference Document Number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>554</ifr:offset1><ifr:offset2>1078</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"XBLNR_V\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>16</ifr:length><ifr:internalLength1>16</ifr:internalLength1><ifr:internalLength2>32</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>16</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 90, "ASS_NUMBER", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ass_Number", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "18"}}, "ASS_NUMBER", 570, 1110, -1, 18, 36, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ASS_NUMBER\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Assignment number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>570</ifr:offset1><ifr:offset2>1110</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ORDNR_V\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>18</ifr:length><ifr:internalLength1>18</ifr:internalLength1><ifr:internalLength2>36</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>18</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 91, "DOC_CAT_SD", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Doc_Cat_Sd", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "DOC_CAT_SD", 588, 1146, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DOC_CAT_SD\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Document category of preceding SD document</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>588</ifr:offset1><ifr:offset2>1146</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VBTYP_V\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 92, "KALSM_CH", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Kalsm_Ch", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "6"}}, "KALSM_CH", 589, 1148, -1, 6, 12, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"KALSM_CH\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Search procedure for batch determination</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>589</ifr:offset1><ifr:offset2>1148</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KALSMA_CH\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>6</ifr:length><ifr:internalLength1>6</ifr:internalLength1><ifr:internalLength2>12</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>6</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 93, "ACC_PERIOD", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Acc_Period", java.lang.String.class, null, new java.lang.String[][]{{"pattern", "\\d+"}, {"maxLength", "2"}}, "ACC_PERIOD", 595, 1160, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_NUM, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ACC_PERIOD\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Accrual period for order-related billing docs.to be accrued</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>595</ifr:offset1><ifr:offset2>1160</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AGRZR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>NUMC</ifr:type><ifr:abapType>N</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 94, "ORDERID", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Orderid", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "12"}}, "ORDERID", 597, 1164, -1, 12, 24, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ORDERID\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Order Number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>597</ifr:offset1><ifr:offset2>1164</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AUFNR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>12</ifr:length><ifr:internalLength1>12</ifr:internalLength1><ifr:internalLength2>24</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>12</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 95, "NOTIF_NO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Notif_No", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "12"}}, "NOTIF_NO", 609, 1188, -1, 12, 24, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"NOTIF_NO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Notification Number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>609</ifr:offset1><ifr:offset2>1188</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"QMNUM\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>12</ifr:length><ifr:internalLength1>12</ifr:internalLength1><ifr:internalLength2>24</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>12</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 96, "MASTER_CON", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Master_Con", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "MASTER_CON", 621, 1212, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MASTER_CON\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Mster contract number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>621</ifr:offset1><ifr:offset2>1212</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VBELN_GRP\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 97, "REF_PROC", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ref_Proc", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "REF_PROC", 631, 1232, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REF_PROC\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Referencing requirement: Procedure</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>631</ifr:offset1><ifr:offset2>1232</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"SCHEME_GRP\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 98, "CHECK_PART", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Check_Part", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "CHECK_PART", 635, 1240, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CHECK_PART\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Check partner authorizations</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>635</ifr:offset1><ifr:offset2>1240</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ABRUF_PART\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 99, "PICK_UP_DA", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Pick_Up_Da", java.sql.Date.class, null, new java.lang.String[][]{}, "PICK_UP_DA", 636, 1242, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PICK_UP_DA\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Pick up date</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>636</ifr:offset1><ifr:offset2>1242</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ABHOD\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 100, "PICK_UP_T1", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:time", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Pick_Up_T1", java.sql.Time.class, null, new java.lang.String[][]{}, "PICK_UP_T1", 644, 1258, -1, 6, 12, -1, com.sap.mw.jco.JCO.TYPE_TIME, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PICK_UP_T1\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Pick up time</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>644</ifr:offset1><ifr:offset2>1258</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ABHOZ\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>TIMS</ifr:type><ifr:abapType>T</ifr:abapType><ifr:length>6</ifr:length><ifr:internalLength1>6</ifr:internalLength1><ifr:internalLength2>12</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>8</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 101, "PICK_UP_T2", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:time", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Pick_Up_T2", java.sql.Time.class, null, new java.lang.String[][]{}, "PICK_UP_T2", 650, 1270, -1, 6, 12, -1, com.sap.mw.jco.JCO.TYPE_TIME, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PICK_UP_T2\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Pick up time</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>650</ifr:offset1><ifr:offset2>1270</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ABHOZ\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>TIMS</ifr:type><ifr:abapType>T</ifr:abapType><ifr:length>6</ifr:length><ifr:internalLength1>6</ifr:internalLength1><ifr:internalLength2>12</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>8</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 102, "NUM_PAY_CA", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Num_Pay_Ca", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "NUM_PAY_CA", 656, 1282, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"NUM_PAY_CA\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Number of payment card plan type</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>656</ifr:offset1><ifr:offset2>1282</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"RPLNR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 103, "LINE_TIME", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:time", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Line_Time", java.sql.Time.class, null, new java.lang.String[][]{}, "LINE_TIME", 666, 1302, -1, 6, 12, -1, com.sap.mw.jco.JCO.TYPE_TIME, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"LINE_TIME\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Proposed schedule line time (local with ref. to sales org.)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>666</ifr:offset1><ifr:offset2>1302</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"EZEIT_VBAK\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>TIMS</ifr:type><ifr:abapType>T</ifr:abapType><ifr:length>6</ifr:length><ifr:internalLength1>6</ifr:internalLength1><ifr:internalLength2>12</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>8</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 104, "TAX_DEST_CT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Tax_Dest_Ct", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "TAX_DEST_CT", 672, 1314, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TAX_DEST_CT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Tax destination country</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>672</ifr:offset1><ifr:offset2>1314</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"LAND1TX\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 105, "ISOTAXDEST", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Isotaxdest", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "ISOTAXDEST", 675, 1320, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ISOTAXDEST\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Country ISO code</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>675</ifr:offset1><ifr:offset2>1320</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"INTCA\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 106, "TAX_DEPART", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Tax_Depart", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "TAX_DEPART", 677, 1324, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TAX_DEPART\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Tax departure country</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>677</ifr:offset1><ifr:offset2>1324</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"LANDTX\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 107, "ISOTAXDEPA", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Isotaxdepa", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "ISOTAXDEPA", 680, 1330, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ISOTAXDEPA\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Country ISO code</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>680</ifr:offset1><ifr:offset2>1330</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"INTCA\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 108, "EU_TRIANG", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Eu_Triang", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "EU_TRIANG", 682, 1334, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"EU_TRIANG\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Indicator: Triangular deal within the EU ?</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>682</ifr:offset1><ifr:offset2>1334</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"XEGDR\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 109, "MAST_CONTR", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Mast_Contr", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "MAST_CONTR", 683, 1336, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MAST_CONTR\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Block master contr. until all lower level contracts updated</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>683</ifr:offset1><ifr:offset2>1336</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ENQUEUE_GRP\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 110, "CML_QTY_DA", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cml_Qty_Da", java.sql.Date.class, null, new java.lang.String[][]{}, "CML_QTY_DA", 684, 1338, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CML_QTY_DA\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Cml delivery order qty date</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>684</ifr:offset1><ifr:offset2>1338</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"DAT_FZAU\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 111, "MS_DATE", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ms_Date", java.sql.Date.class, null, new java.lang.String[][]{}, "MS_DATE", 692, 1354, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MS_DATE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Material availability date</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>692</ifr:offset1><ifr:offset2>1354</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MBDAT\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 112, "VERSION", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Version", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "12"}}, "VERSION", 700, 1370, -1, 12, 24, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"VERSION\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Sales document version number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>700</ifr:offset1><ifr:offset2>1370</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VSNMR_V\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>12</ifr:length><ifr:internalLength1>12</ifr:internalLength1><ifr:internalLength2>24</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>12</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 113, "REF_DOC_L_LONG", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ref_Doc_L_Long", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "35"}}, "REF_DOC_L_LONG", 712, 1394, -1, 35, 70, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REF_DOC_L_LONG\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Reference Document Number (See long text for dependencies)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>712</ifr:offset1><ifr:offset2>1394</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"XBLNR_V_LONG\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>35</ifr:length><ifr:internalLength1>35</ifr:internalLength1><ifr:internalLength2>70</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>35</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 114, "CRM_GUID", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Crm_Guid", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "70"}}, "CRM_GUID", 747, 1464, -1, 70, 140, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CRM_GUID\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Character field, length 70</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>747</ifr:offset1><ifr:offset2>1464</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CHAR70\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>70</ifr:length><ifr:internalLength1>70</ifr:internalLength1><ifr:internalLength2>140</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>70</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        staticDescriptor = descriptor;
    }
    protected  BapisdhdType (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    public  BapisdhdType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public void setNet_Val_Hd(java.math.BigDecimal Net_Val_Hd) {
        baseTypeData().setElementValue(16, Net_Val_Hd);
    }

    
    public void setRef_Doc(java.lang.String Ref_Doc) {
        baseTypeData().setElementValue(77, Ref_Doc);
    }

    
    public void setTran_Group(java.lang.String Tran_Group) {
        baseTypeData().setElementValue(9, Tran_Group);
    }

    
    public void setRef_1(java.lang.String Ref_1) {
        baseTypeData().setElementValue(43, Ref_1);
    }

    
    public java.lang.String getTax_Depart() {
        return (java.lang.String)baseTypeData().getElementValueAsString(106);
    }

    
    public java.sql.Date getNext_Date() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(72);
    }

    
    public void setOrdbilltyp(java.lang.String Ordbilltyp) {
        baseTypeData().setElementValue(36, Ordbilltyp);
    }

    
    public void setCurren_Iso(java.lang.String Curren_Iso) {
        baseTypeData().setElementValue(18, Curren_Iso);
    }

    
    public java.lang.String getKalsm_Ch() {
        return (java.lang.String)baseTypeData().getElementValueAsString(92);
    }

    
    public void setAcc_Period(java.lang.String Acc_Period) {
        baseTypeData().setElementValue(93, Acc_Period);
    }

    
    public java.lang.String getSear_Prpr() {
        return (java.lang.String)baseTypeData().getElementValueAsString(38);
    }

    
    public java.lang.String getCust_Grp5() {
        return (java.lang.String)baseTypeData().getElementValueAsString(58);
    }

    
    public java.lang.String getTax_Class5() {
        return (java.lang.String)baseTypeData().getElementValueAsString(84);
    }

    
    public void setConditions(java.lang.String Conditions) {
        baseTypeData().setElementValue(28, Conditions);
    }

    
    public void setSales_Grp(java.lang.String Sales_Grp) {
        baseTypeData().setElementValue(22, Sales_Grp);
    }

    
    public void setBill_Block(java.lang.String Bill_Block) {
        baseTypeData().setElementValue(15, Bill_Block);
    }

    
    public void setSd_Pric_Pr(java.lang.String Sd_Pric_Pr) {
        baseTypeData().setElementValue(34, Sd_Pric_Pr);
    }

    
    public void setCt_Area(java.lang.String Ct_Area) {
        baseTypeData().setElementValue(25, Ct_Area);
    }

    
    public java.math.BigDecimal getRel_Credit() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(73);
    }

    
    public void setRef_Proc(java.lang.String Ref_Proc) {
        baseTypeData().setElementValue(97, Ref_Proc);
    }

    
    public java.lang.String getRef_Doc() {
        return (java.lang.String)baseTypeData().getElementValueAsString(77);
    }

    
    public void setRepr_Group(java.lang.String Repr_Group) {
        baseTypeData().setElementValue(66, Repr_Group);
    }

    
    public void setTax_Class4(java.lang.String Tax_Class4) {
        baseTypeData().setElementValue(83, Tax_Class4);
    }

    
    public java.sql.Date getCml_Qty_Da() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(110);
    }

    
    public java.lang.String getTax_Class4() {
        return (java.lang.String)baseTypeData().getElementValueAsString(83);
    }

    
    public void setMaster_Con(java.lang.String Master_Con) {
        baseTypeData().setElementValue(96, Master_Con);
    }

    
    public java.lang.String getCust_Grp4() {
        return (java.lang.String)baseTypeData().getElementValueAsString(57);
    }

    
    public void setDoc_Number(java.lang.String Doc_Number) {
        baseTypeData().setElementValue(1, Doc_Number);
    }

    
    public void setHi_Type_Pr(java.lang.String Hi_Type_Pr) {
        baseTypeData().setElementValue(74, Hi_Type_Pr);
    }

    
    public void setReq_Date_H(java.sql.Date Req_Date_H) {
        baseTypeData().setElementValue(29, Req_Date_H);
    }

    
    public void setCust_Grp4(java.lang.String Cust_Grp4) {
        baseTypeData().setElementValue(57, Cust_Grp4);
    }

    
    public java.lang.String getCurr_Cred() {
        return (java.lang.String)baseTypeData().getElementValueAsString(68);
    }

    
    public void setCml_Qty_Da(java.sql.Date Cml_Qty_Da) {
        baseTypeData().setElementValue(110, Cml_Qty_Da);
    }

    
    public java.sql.Date getCh_On() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(53);
    }

    
    public java.lang.String getCrm_Guid() {
        return (java.lang.String)baseTypeData().getElementValueAsString(114);
    }

    
    public java.lang.String getTax_Class7() {
        return (java.lang.String)baseTypeData().getElementValueAsString(86);
    }

    
    public java.lang.String getSales_Off() {
        return (java.lang.String)baseTypeData().getElementValueAsString(23);
    }

    
    public java.lang.String getSold_To() {
        return (java.lang.String)baseTypeData().getElementValueAsString(48);
    }

    
    public void setAgree_Cond(java.lang.String Agree_Cond) {
        baseTypeData().setElementValue(59, Agree_Cond);
    }

    
    public void setDlv_Block(java.lang.String Dlv_Block) {
        baseTypeData().setElementValue(14, Dlv_Block);
    }

    
    public java.lang.String getOrderer_Na() {
        return (java.lang.String)baseTypeData().getElementValueAsString(44);
    }

    
    public java.lang.String getCred_Group() {
        return (java.lang.String)baseTypeData().getElementValueAsString(65);
    }

    
    public java.lang.String getSd_Doc_Cat() {
        return (java.lang.String)baseTypeData().getElementValueAsString(8);
    }

    
    public java.lang.String getDoc_Type() {
        return (java.lang.String)baseTypeData().getElementValueAsString(10);
    }

    
    public java.lang.String getDistr_Chan() {
        return (java.lang.String)baseTypeData().getElementValueAsString(20);
    }

    
    public java.lang.String getTax_Class6() {
        return (java.lang.String)baseTypeData().getElementValueAsString(85);
    }

    
    public java.lang.String getRef_1() {
        return (java.lang.String)baseTypeData().getElementValueAsString(43);
    }

    
    public void setPlan_Dlv(java.lang.String Plan_Dlv) {
        baseTypeData().setElementValue(76, Plan_Dlv);
    }

    
    public void setSear_Prpr(java.lang.String Sear_Prpr) {
        baseTypeData().setElementValue(38, Sear_Prpr);
    }

    
    public java.sql.Date getDun_Date() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(47);
    }

    
    public void setDoc_Cat_Sd(java.lang.String Doc_Cat_Sd) {
        baseTypeData().setElementValue(91, Doc_Cat_Sd);
    }

    
    public java.lang.String getOrdbilltyp() {
        return (java.lang.String)baseTypeData().getElementValueAsString(36);
    }

    
    public java.lang.String getTax_Class9() {
        return (java.lang.String)baseTypeData().getElementValueAsString(88);
    }

    
    public java.lang.String getAss_Number() {
        return (java.lang.String)baseTypeData().getElementValueAsString(90);
    }

    
    public void setNext_Chdat(java.sql.Date Next_Chdat) {
        baseTypeData().setElementValue(71, Next_Chdat);
    }

    
    public void setSales_Org(java.lang.String Sales_Org) {
        baseTypeData().setElementValue(19, Sales_Org);
    }

    
    public void setRisk_Categ(java.lang.String Risk_Categ) {
        baseTypeData().setElementValue(67, Risk_Categ);
    }

    
    public java.sql.Time getPick_Up_T2() {
        return (java.sql.Time)baseTypeData().getElementValueAsTime(101);
    }

    
    public java.sql.Date getCt_Valid_F() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(26);
    }

    
    public void setOrderer_Na(java.lang.String Orderer_Na) {
        baseTypeData().setElementValue(44, Orderer_Na);
    }

    
    public void setCurr_Cred(java.lang.String Curr_Cred) {
        baseTypeData().setElementValue(68, Curr_Cred);
    }

    
    public java.lang.String getHi_Type_Pr() {
        return (java.lang.String)baseTypeData().getElementValueAsString(74);
    }

    
    public void setIsocurrcre(java.lang.String Isocurrcre) {
        baseTypeData().setElementValue(69, Isocurrcre);
    }

    
    public void setOrd_Probab(java.lang.String Ord_Probab) {
        baseTypeData().setElementValue(37, Ord_Probab);
    }

    
    public void setCust_Grp2(java.lang.String Cust_Grp2) {
        baseTypeData().setElementValue(55, Cust_Grp2);
    }

    
    public java.sql.Date getRel_Dat_Dd() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(70);
    }

    
    public java.lang.String getConditions() {
        return (java.lang.String)baseTypeData().getElementValueAsString(28);
    }

    
    public void setTelephone(java.lang.String Telephone) {
        baseTypeData().setElementValue(45, Telephone);
    }

    
    public java.lang.String getOrd_Probab() {
        return (java.lang.String)baseTypeData().getElementValueAsString(37);
    }

    
    public java.lang.String getDate_Type() {
        return (java.lang.String)baseTypeData().getElementValueAsString(30);
    }

    
    public java.lang.String getAlt_Tax_Cl() {
        return (java.lang.String)baseTypeData().getElementValueAsString(80);
    }

    
    public void setDun_Count(java.math.BigDecimal Dun_Count) {
        baseTypeData().setElementValue(46, Dun_Count);
    }

    
    public java.lang.String getComp_Code() {
        return (java.lang.String)baseTypeData().getElementValueAsString(79);
    }

    
    public java.lang.String getTax_Class8() {
        return (java.lang.String)baseTypeData().getElementValueAsString(87);
    }

    
    public void setNotif_No(java.lang.String Notif_No) {
        baseTypeData().setElementValue(95, Notif_No);
    }

    
    public void setCompl_Dlv(java.lang.String Compl_Dlv) {
        baseTypeData().setElementValue(31, Compl_Dlv);
    }

    
    public java.lang.String getOrderid() {
        return (java.lang.String)baseTypeData().getElementValueAsString(94);
    }

    
    public java.lang.String getCo_Area() {
        return (java.lang.String)baseTypeData().getElementValueAsString(60);
    }

    
    public void setDoc_Indic(java.lang.String Doc_Indic) {
        baseTypeData().setElementValue(33, Doc_Indic);
    }

    
    public java.math.BigDecimal getDun_Count() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(46);
    }

    
    public java.sql.Date getCt_Valid_T() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(27);
    }

    
    public java.sql.Time getLine_Time() {
        return (java.sql.Time)baseTypeData().getElementValueAsTime(103);
    }

    
    public java.lang.String getSales_Grp() {
        return (java.lang.String)baseTypeData().getElementValueAsString(22);
    }

    
    public java.lang.String getIsotaxdepa() {
        return (java.lang.String)baseTypeData().getElementValueAsString(107);
    }

    
    public void setVersion(java.lang.String Version) {
        baseTypeData().setElementValue(112, Version);
    }

    
    public void setCh_On(java.sql.Date Ch_On) {
        baseTypeData().setElementValue(53, Ch_On);
    }

    
    public void setTax_Class9(java.lang.String Tax_Class9) {
        baseTypeData().setElementValue(88, Tax_Class9);
    }

    
    public void setSold_To(java.lang.String Sold_To) {
        baseTypeData().setElementValue(48, Sold_To);
    }

    
    public void setCred_Group(java.lang.String Cred_Group) {
        baseTypeData().setElementValue(65, Cred_Group);
    }

    
    public java.lang.String getSd_Col_Num() {
        return (java.lang.String)baseTypeData().getElementValueAsString(13);
    }

    
    public java.lang.String getPo_Method() {
        return (java.lang.String)baseTypeData().getElementValueAsString(40);
    }

    
    public void setQt_Valid_T(java.sql.Date Qt_Valid_T) {
        baseTypeData().setElementValue(6, Qt_Valid_T);
    }

    
    public java.lang.String getWbs_Elem() {
        return (java.lang.String)baseTypeData().getElementValueAsString(61);
    }

    
    public void setShip_Cond(java.lang.String Ship_Cond) {
        baseTypeData().setElementValue(35, Ship_Cond);
    }

    
    public void setDivision(java.lang.String Division) {
        baseTypeData().setElementValue(21, Division);
    }

    
    public void setDlvschedus(java.lang.String Dlvschedus) {
        baseTypeData().setElementValue(75, Dlvschedus);
    }

    
    public java.sql.Time getPick_Up_T1() {
        return (java.sql.Time)baseTypeData().getElementValueAsTime(100);
    }

    
    public java.lang.String getCheck_Part() {
        return (java.lang.String)baseTypeData().getElementValueAsString(98);
    }

    
    public java.lang.String getDoc_Class() {
        return (java.lang.String)baseTypeData().getElementValueAsString(32);
    }

    
    public void setSales_Off(java.lang.String Sales_Off) {
        baseTypeData().setElementValue(23, Sales_Off);
    }

    
    public void setCreated_By(java.lang.String Created_By) {
        baseTypeData().setElementValue(4, Created_By);
    }

    
    public void setCred_Accnt(java.lang.String Cred_Accnt) {
        baseTypeData().setElementValue(64, Cred_Accnt);
    }

    
    public void setTax_Class5(java.lang.String Tax_Class5) {
        baseTypeData().setElementValue(84, Tax_Class5);
    }

    
    public java.lang.String getVersion() {
        return (java.lang.String)baseTypeData().getElementValueAsString(112);
    }

    
    public void setPurch_Date(java.sql.Date Purch_Date) {
        baseTypeData().setElementValue(41, Purch_Date);
    }

    
    public void setMs_Date(java.sql.Date Ms_Date) {
        baseTypeData().setElementValue(111, Ms_Date);
    }

    
    public java.lang.String getDivision() {
        return (java.lang.String)baseTypeData().getElementValueAsString(21);
    }

    
    public void setCust_Grp5(java.lang.String Cust_Grp5) {
        baseTypeData().setElementValue(58, Cust_Grp5);
    }

    
    public void setWar_Date(java.sql.Date War_Date) {
        baseTypeData().setElementValue(12, War_Date);
    }

    
    public java.lang.String getOperation() {
        return (java.lang.String)baseTypeData().getElementValueAsString(0);
    }

    
    public void setCust_Grp3(java.lang.String Cust_Grp3) {
        baseTypeData().setElementValue(56, Cust_Grp3);
    }

    
    public java.sql.Date getMs_Date() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(111);
    }

    
    public void setKalsm_Ch(java.lang.String Kalsm_Ch) {
        baseTypeData().setElementValue(92, Kalsm_Ch);
    }

    
    public void setTax_Depart(java.lang.String Tax_Depart) {
        baseTypeData().setElementValue(106, Tax_Depart);
    }

    
    public java.lang.String getIsotaxdest() {
        return (java.lang.String)baseTypeData().getElementValueAsString(105);
    }

    
    public java.sql.Date getWar_Date() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(12);
    }

    
    public java.lang.String getDlvschedus() {
        return (java.lang.String)baseTypeData().getElementValueAsString(75);
    }

    
    public java.lang.String getAgree_Cond() {
        return (java.lang.String)baseTypeData().getElementValueAsString(59);
    }

    
    public java.sql.Date getQt_Valid_F() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(5);
    }

    
    public java.lang.String getOb_Jnr_Hd() {
        return (java.lang.String)baseTypeData().getElementValueAsString(78);
    }

    
    public void setIsotaxdepa(java.lang.String Isotaxdepa) {
        baseTypeData().setElementValue(107, Isotaxdepa);
    }

    
    public void setPick_Up_T2(java.sql.Time Pick_Up_T2) {
        baseTypeData().setElementValue(101, Pick_Up_T2);
    }

    
    public void setCt_Valid_F(java.sql.Date Ct_Valid_F) {
        baseTypeData().setElementValue(26, Ct_Valid_F);
    }

    
    public void setPurch_No(java.lang.String Purch_No) {
        baseTypeData().setElementValue(39, Purch_No);
    }

    
    public java.lang.String getIsocurrcre() {
        return (java.lang.String)baseTypeData().getElementValueAsString(69);
    }

    
    public java.lang.String getNotif_No() {
        return (java.lang.String)baseTypeData().getElementValueAsString(95);
    }

    
    public void setC_Ctr_Area(java.lang.String C_Ctr_Area) {
        baseTypeData().setElementValue(63, C_Ctr_Area);
    }

    
    public void setPick_Up_Da(java.sql.Date Pick_Up_Da) {
        baseTypeData().setElementValue(99, Pick_Up_Da);
    }

    
    public java.lang.String getSd_Pric_Pr() {
        return (java.lang.String)baseTypeData().getElementValueAsString(34);
    }

    
    public java.lang.String getIsostatcur() {
        return (java.lang.String)baseTypeData().getElementValueAsString(52);
    }

    
    public java.lang.String getCostcenter() {
        return (java.lang.String)baseTypeData().getElementValueAsString(49);
    }

    
    public void setNext_Date(java.sql.Date Next_Date) {
        baseTypeData().setElementValue(72, Next_Date);
    }

    
    public java.lang.String getExchg_Rate() {
        return (java.lang.String)baseTypeData().getElementValueAsString(62);
    }

    
    public java.lang.String getBus_Area() {
        return (java.lang.String)baseTypeData().getElementValueAsString(24);
    }

    
    public java.lang.String getAcc_Period() {
        return (java.lang.String)baseTypeData().getElementValueAsString(93);
    }

    
    public void setDoc_Type(java.lang.String Doc_Type) {
        baseTypeData().setElementValue(10, Doc_Type);
    }

    
    public java.lang.String getCreated_By() {
        return (java.lang.String)baseTypeData().getElementValueAsString(4);
    }

    
    public java.sql.Date getNext_Chdat() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(71);
    }

    
    public void setSd_Col_Num(java.lang.String Sd_Col_Num) {
        baseTypeData().setElementValue(13, Sd_Col_Num);
    }

    
    public void setExchg_Rate(java.lang.String Exchg_Rate) {
        baseTypeData().setElementValue(62, Exchg_Rate);
    }

    
    public void setWbs_Elem(java.lang.String Wbs_Elem) {
        baseTypeData().setElementValue(61, Wbs_Elem);
    }

    
    public void setUpdate_Grp(java.lang.String Update_Grp) {
        baseTypeData().setElementValue(50, Update_Grp);
    }

    
    public java.lang.String getCurrency() {
        return (java.lang.String)baseTypeData().getElementValueAsString(17);
    }

    
    public void setStat_Curr(java.lang.String Stat_Curr) {
        baseTypeData().setElementValue(51, Stat_Curr);
    }

    
    public void setOb_Jnr_Hd(java.lang.String Ob_Jnr_Hd) {
        baseTypeData().setElementValue(78, Ob_Jnr_Hd);
    }

    
    public java.lang.String getRef_Doc_L() {
        return (java.lang.String)baseTypeData().getElementValueAsString(89);
    }

    
    public void setIsotaxdest(java.lang.String Isotaxdest) {
        baseTypeData().setElementValue(105, Isotaxdest);
    }

    
    public java.lang.String getOrd_Reason() {
        return (java.lang.String)baseTypeData().getElementValueAsString(11);
    }

    
    public void setRel_Dat_Dd(java.sql.Date Rel_Dat_Dd) {
        baseTypeData().setElementValue(70, Rel_Dat_Dd);
    }

    
    public void setAlt_Tax_Cl(java.lang.String Alt_Tax_Cl) {
        baseTypeData().setElementValue(80, Alt_Tax_Cl);
    }

    
    public java.math.BigDecimal getNet_Val_Hd() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(16);
    }

    
    public java.lang.String getCurren_Iso() {
        return (java.lang.String)baseTypeData().getElementValueAsString(18);
    }

    
    public void setTax_Class7(java.lang.String Tax_Class7) {
        baseTypeData().setElementValue(86, Tax_Class7);
    }

    
    public java.lang.String getDoc_Cat_Sd() {
        return (java.lang.String)baseTypeData().getElementValueAsString(91);
    }

    
    public java.sql.Date getPick_Up_Da() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(99);
    }

    
    public java.sql.Date getPurch_Date() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(41);
    }

    
    public java.lang.String getTran_Group() {
        return (java.lang.String)baseTypeData().getElementValueAsString(9);
    }

    
    public void setSd_Doc_Cat(java.lang.String Sd_Doc_Cat) {
        baseTypeData().setElementValue(8, Sd_Doc_Cat);
    }

    
    public java.lang.String getUpdate_Grp() {
        return (java.lang.String)baseTypeData().getElementValueAsString(50);
    }

    
    public void setTax_Class3(java.lang.String Tax_Class3) {
        baseTypeData().setElementValue(82, Tax_Class3);
    }

    
    public java.lang.String getPurch_No() {
        return (java.lang.String)baseTypeData().getElementValueAsString(39);
    }

    
    public void setDistr_Chan(java.lang.String Distr_Chan) {
        baseTypeData().setElementValue(20, Distr_Chan);
    }

    
    public void setBus_Area(java.lang.String Bus_Area) {
        baseTypeData().setElementValue(24, Bus_Area);
    }

    
    public java.lang.String getC_Ctr_Area() {
        return (java.lang.String)baseTypeData().getElementValueAsString(63);
    }

    
    public java.lang.String getBill_Block() {
        return (java.lang.String)baseTypeData().getElementValueAsString(15);
    }

    
    public java.sql.Date getQt_Valid_T() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(6);
    }

    
    public void setNum_Pay_Ca(java.lang.String Num_Pay_Ca) {
        baseTypeData().setElementValue(102, Num_Pay_Ca);
    }

    
    public void setOrderid(java.lang.String Orderid) {
        baseTypeData().setElementValue(94, Orderid);
    }

    
    public void setMast_Contr(java.lang.String Mast_Contr) {
        baseTypeData().setElementValue(109, Mast_Contr);
    }

    
    public java.lang.String getTelephone() {
        return (java.lang.String)baseTypeData().getElementValueAsString(45);
    }

    
    public java.lang.String getNum_Pay_Ca() {
        return (java.lang.String)baseTypeData().getElementValueAsString(102);
    }

    
    public java.lang.String getPlan_Dlv() {
        return (java.lang.String)baseTypeData().getElementValueAsString(76);
    }

    
    public java.lang.String getStat_Curr() {
        return (java.lang.String)baseTypeData().getElementValueAsString(51);
    }

    
    public void setRel_Credit(java.math.BigDecimal Rel_Credit) {
        baseTypeData().setElementValue(73, Rel_Credit);
    }

    
    public void setComp_Code(java.lang.String Comp_Code) {
        baseTypeData().setElementValue(79, Comp_Code);
    }

    
    public void setDoc_Date(java.sql.Date Doc_Date) {
        baseTypeData().setElementValue(7, Doc_Date);
    }

    
    public void setPo_Supplem(java.lang.String Po_Supplem) {
        baseTypeData().setElementValue(42, Po_Supplem);
    }

    
    public java.lang.String getCred_Accnt() {
        return (java.lang.String)baseTypeData().getElementValueAsString(64);
    }

    
    public void setRef_Doc_L(java.lang.String Ref_Doc_L) {
        baseTypeData().setElementValue(89, Ref_Doc_L);
    }

    
    public java.lang.String getDlv_Block() {
        return (java.lang.String)baseTypeData().getElementValueAsString(14);
    }

    
    public void setOrd_Reason(java.lang.String Ord_Reason) {
        baseTypeData().setElementValue(11, Ord_Reason);
    }

    
    public java.lang.String getTax_Class2() {
        return (java.lang.String)baseTypeData().getElementValueAsString(81);
    }

    
    public void setQt_Valid_F(java.sql.Date Qt_Valid_F) {
        baseTypeData().setElementValue(5, Qt_Valid_F);
    }

    
    public java.lang.String getRef_Doc_L_Long() {
        return (java.lang.String)baseTypeData().getElementValueAsString(113);
    }

    
    public java.lang.String getCust_Grp1() {
        return (java.lang.String)baseTypeData().getElementValueAsString(54);
    }

    
    public void setCust_Grp1(java.lang.String Cust_Grp1) {
        baseTypeData().setElementValue(54, Cust_Grp1);
    }

    
    public void setCostcenter(java.lang.String Costcenter) {
        baseTypeData().setElementValue(49, Costcenter);
    }

    
    public java.lang.String getShip_Cond() {
        return (java.lang.String)baseTypeData().getElementValueAsString(35);
    }

    
    public java.lang.String getCompl_Dlv() {
        return (java.lang.String)baseTypeData().getElementValueAsString(31);
    }

    
    public java.lang.String getMast_Contr() {
        return (java.lang.String)baseTypeData().getElementValueAsString(109);
    }

    
    public void setCheck_Part(java.lang.String Check_Part) {
        baseTypeData().setElementValue(98, Check_Part);
    }

    
    public java.sql.Date getDoc_Date() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(7);
    }

    
    public void setPick_Up_T1(java.sql.Time Pick_Up_T1) {
        baseTypeData().setElementValue(100, Pick_Up_T1);
    }

    
    public java.lang.String getEu_Triang() {
        return (java.lang.String)baseTypeData().getElementValueAsString(108);
    }

    
    public java.sql.Time getRec_Time() {
        return (java.sql.Time)baseTypeData().getElementValueAsTime(3);
    }

    
    public java.lang.String getTax_Class3() {
        return (java.lang.String)baseTypeData().getElementValueAsString(82);
    }

    
    public void setDun_Date(java.sql.Date Dun_Date) {
        baseTypeData().setElementValue(47, Dun_Date);
    }

    
    public java.lang.String getRepr_Group() {
        return (java.lang.String)baseTypeData().getElementValueAsString(66);
    }

    
    public void setRec_Time(java.sql.Time Rec_Time) {
        baseTypeData().setElementValue(3, Rec_Time);
    }

    
    public java.lang.String getDoc_Number() {
        return (java.lang.String)baseTypeData().getElementValueAsString(1);
    }

    
    public java.lang.String getRef_Proc() {
        return (java.lang.String)baseTypeData().getElementValueAsString(97);
    }

    
    public void setTax_Dest_Ct(java.lang.String Tax_Dest_Ct) {
        baseTypeData().setElementValue(104, Tax_Dest_Ct);
    }

    
    public void setPo_Method(java.lang.String Po_Method) {
        baseTypeData().setElementValue(40, Po_Method);
    }

    
    public java.lang.String getRisk_Categ() {
        return (java.lang.String)baseTypeData().getElementValueAsString(67);
    }

    
    public java.lang.String getCust_Grp3() {
        return (java.lang.String)baseTypeData().getElementValueAsString(56);
    }

    
    public java.lang.String getTax_Dest_Ct() {
        return (java.lang.String)baseTypeData().getElementValueAsString(104);
    }

    
    public void setCt_Valid_T(java.sql.Date Ct_Valid_T) {
        baseTypeData().setElementValue(27, Ct_Valid_T);
    }

    
    public java.lang.String getMaster_Con() {
        return (java.lang.String)baseTypeData().getElementValueAsString(96);
    }

    
    public void setIsostatcur(java.lang.String Isostatcur) {
        baseTypeData().setElementValue(52, Isostatcur);
    }

    
    public MetaData metadata() {
        return metadata;
    }

    
    public void setDoc_Class(java.lang.String Doc_Class) {
        baseTypeData().setElementValue(32, Doc_Class);
    }

    
    public void setCurrency(java.lang.String Currency) {
        baseTypeData().setElementValue(17, Currency);
    }

    
    public void setEu_Triang(java.lang.String Eu_Triang) {
        baseTypeData().setElementValue(108, Eu_Triang);
    }

    
    public void setRef_Doc_L_Long(java.lang.String Ref_Doc_L_Long) {
        baseTypeData().setElementValue(113, Ref_Doc_L_Long);
    }

    
    public void setDate_Type(java.lang.String Date_Type) {
        baseTypeData().setElementValue(30, Date_Type);
    }

    
    public java.lang.String getCust_Grp2() {
        return (java.lang.String)baseTypeData().getElementValueAsString(55);
    }

    
    public void setTax_Class6(java.lang.String Tax_Class6) {
        baseTypeData().setElementValue(85, Tax_Class6);
    }

    
    public void setOperation(java.lang.String Operation) {
        baseTypeData().setElementValue(0, Operation);
    }

    
    public void setCrm_Guid(java.lang.String Crm_Guid) {
        baseTypeData().setElementValue(114, Crm_Guid);
    }

    
    public void setTax_Class2(java.lang.String Tax_Class2) {
        baseTypeData().setElementValue(81, Tax_Class2);
    }

    
    public java.lang.String getPo_Supplem() {
        return (java.lang.String)baseTypeData().getElementValueAsString(42);
    }

    
    public void setCo_Area(java.lang.String Co_Area) {
        baseTypeData().setElementValue(60, Co_Area);
    }

    
    public void setTax_Class8(java.lang.String Tax_Class8) {
        baseTypeData().setElementValue(87, Tax_Class8);
    }

    
    public void setLine_Time(java.sql.Time Line_Time) {
        baseTypeData().setElementValue(103, Line_Time);
    }

    
    public void setRec_Date(java.sql.Date Rec_Date) {
        baseTypeData().setElementValue(2, Rec_Date);
    }

    
    public java.sql.Date getRec_Date() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(2);
    }

    
    public java.sql.Date getReq_Date_H() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(29);
    }

    
    public java.lang.String getDoc_Indic() {
        return (java.lang.String)baseTypeData().getElementValueAsString(33);
    }

    
    public java.lang.String getCt_Area() {
        return (java.lang.String)baseTypeData().getElementValueAsString(25);
    }

    
    public void setAss_Number(java.lang.String Ass_Number) {
        baseTypeData().setElementValue(90, Ass_Number);
    }

    
    public java.lang.String getSales_Org() {
        return (java.lang.String)baseTypeData().getElementValueAsString(19);
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  BapisdhdType parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (BapisdhdType parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDivision() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(21);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTax_Depart() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(106);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getNext_Date() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(72);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getOperation() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMs_Date() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(111);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getIsotaxdest() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(105);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getWar_Date() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(12);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getKalsm_Ch() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(92);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDlvschedus() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(75);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSear_Prpr() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(38);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCust_Grp5() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(58);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTax_Class5() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(84);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getAgree_Cond() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(59);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getQt_Valid_F() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(5);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getOb_Jnr_Hd() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(78);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRel_Credit() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(73);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRef_Doc() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(77);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getIsocurrcre() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(69);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getNotif_No() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(95);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCml_Qty_Da() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(110);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTax_Class4() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(83);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSd_Pric_Pr() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(34);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getIsostatcur() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(52);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCostcenter() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(49);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCust_Grp4() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(57);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getExchg_Rate() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(62);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getBus_Area() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(24);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getAcc_Period() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(93);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCreated_By() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(4);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getNext_Chdat() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(71);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCurr_Cred() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(68);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCurrency() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(17);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCh_On() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(53);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRef_Doc_L() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(89);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCrm_Guid() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(114);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getOrd_Reason() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(11);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getNet_Val_Hd() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(16);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCurren_Iso() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(18);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTax_Class7() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(86);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDoc_Cat_Sd() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(91);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPick_Up_Da() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(99);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPurch_Date() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(41);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTran_Group() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(9);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSales_Off() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(23);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getUpdate_Grp() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(50);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPurch_No() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(39);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSold_To() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(48);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getC_Ctr_Area() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(63);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getBill_Block() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(15);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getOrderer_Na() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(44);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getQt_Valid_T() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(6);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCred_Group() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(65);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTelephone() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(45);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSd_Doc_Cat() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(8);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getNum_Pay_Ca() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(102);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPlan_Dlv() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(76);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDoc_Type() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(10);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getStat_Curr() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(51);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDistr_Chan() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(20);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTax_Class6() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(85);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRef_1() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(43);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCred_Accnt() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(64);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDlv_Block() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(14);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDun_Date() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(47);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getOrdbilltyp() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(36);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTax_Class2() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(81);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTax_Class9() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(88);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRef_Doc_L_Long() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(113);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getAss_Number() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(90);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCust_Grp1() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(54);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getShip_Cond() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(35);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCompl_Dlv() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(31);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMast_Contr() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(109);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPick_Up_T2() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(101);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCt_Valid_F() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(26);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getHi_Type_Pr() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(74);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDoc_Date() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(7);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRel_Dat_Dd() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(70);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getEu_Triang() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(108);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getConditions() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(28);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRec_Time() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTax_Class3() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(82);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getOrd_Probab() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(37);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRepr_Group() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(66);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDoc_Number() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRef_Proc() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(97);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDate_Type() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(30);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getAlt_Tax_Cl() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(80);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getComp_Code() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(79);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTax_Class8() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(87);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getOrderid() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(94);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCo_Area() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(60);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDun_Count() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(46);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCt_Valid_T() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(27);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRisk_Categ() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(67);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getLine_Time() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(103);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCust_Grp3() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(56);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTax_Dest_Ct() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(104);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSales_Grp() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(22);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getIsotaxdepa() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(107);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMaster_Con() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(96);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSd_Col_Num() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(13);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCust_Grp2() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(55);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPo_Method() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(40);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPo_Supplem() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(42);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getWbs_Elem() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(61);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPick_Up_T1() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(100);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCheck_Part() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(98);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRec_Date() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getReq_Date_H() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(29);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDoc_Class() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(32);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDoc_Indic() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(33);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCt_Area() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(25);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getVersion() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(112);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSales_Org() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(19);
        }
    
    }

}
