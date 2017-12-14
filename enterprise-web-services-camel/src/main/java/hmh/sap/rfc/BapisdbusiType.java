package hmh.sap.rfc;


public class BapisdbusiType extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1354127028470L) ;

    private  BapisdbusiType.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.XSDL_COMPLEX_TYPE, "urn:sap-com:document:sap:rfc:functions", "BAPISDBUSI", 88, 0, hmh.sap.rfc.BapisdbusiType.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "BAPISDBUSI", 590, 1100, -1, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"BAPISDBUSI\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">BAPI Structure of VBKD with English Field Names</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>110</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>590</ifr:internalLength1><ifr:internalLength2>1100</ifr:internalLength2></ifr:definition></ifr:container></s0:type>");
        descriptorSetElementProperties(descriptor, 0, "OPERATION", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Operation", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "OPERATION", 0, 0, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"OPERATION\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Function</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>0</ifr:offset1><ifr:offset2>0</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MSGFN\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 1, "SD_DOC", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Sd_Doc", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "SD_DOC", 3, 6, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SD_DOC\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Sales and Distribution Document Number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>3</ifr:offset1><ifr:offset2>6</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VBELN\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 2, "ITM_NUMBER", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Itm_Number", java.lang.String.class, null, new java.lang.String[][]{{"pattern", "\\d+"}, {"maxLength", "6"}}, "ITM_NUMBER", 13, 26, -1, 6, 12, -1, com.sap.mw.jco.JCO.TYPE_NUM, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ITM_NUMBER\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Item number of the SD document</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>13</ifr:offset1><ifr:offset2>26</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"POSNR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>NUMC</ifr:type><ifr:abapType>N</ifr:abapType><ifr:length>6</ifr:length><ifr:internalLength1>6</ifr:internalLength1><ifr:internalLength2>12</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>6</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 3, "PRICE_GRP", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Price_Grp", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "PRICE_GRP", 19, 38, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PRICE_GRP\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Price group (customer)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>19</ifr:offset1><ifr:offset2>38</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KONDA\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 4, "CUST_GROUP", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cust_Group", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "CUST_GROUP", 21, 42, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CUST_GROUP\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Customer group</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>21</ifr:offset1><ifr:offset2>42</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KDGRP\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 5, "SALES_DIST", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Sales_Dist", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "6"}}, "SALES_DIST", 23, 46, -1, 6, 12, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SALES_DIST\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Sales district</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>23</ifr:offset1><ifr:offset2>46</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BZIRK\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>6</ifr:length><ifr:internalLength1>6</ifr:internalLength1><ifr:internalLength2>12</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>6</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 6, "PRICE_LIST", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Price_List", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "PRICE_LIST", 29, 58, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PRICE_LIST\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Price list type</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>29</ifr:offset1><ifr:offset2>58</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PLTYP\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 7, "INCOTERMS1", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Incoterms1", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "INCOTERMS1", 31, 62, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"INCOTERMS1\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Incoterms (part 1)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>31</ifr:offset1><ifr:offset2>62</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"INCO1\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 8, "INCOTERMS2", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Incoterms2", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "28"}}, "INCOTERMS2", 34, 68, -1, 28, 56, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"INCOTERMS2\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Incoterms (part 2)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>34</ifr:offset1><ifr:offset2>68</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"INCO2\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>28</ifr:length><ifr:internalLength1>28</ifr:internalLength1><ifr:internalLength2>56</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>28</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 9, "ORDCOMBIND", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ordcombind", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "ORDCOMBIND", 62, 124, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ORDCOMBIND\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Order combination indicator</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>62</ifr:offset1><ifr:offset2>124</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KZAZU_D\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 10, "BILL_SCHED", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Bill_Sched", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "BILL_SCHED", 63, 126, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"BILL_SCHED\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Invoice dates (calendar identification)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>63</ifr:offset1><ifr:offset2>126</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PERFK\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 11, "INVO_SCHED", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Invo_Sched", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "INVO_SCHED", 65, 130, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"INVO_SCHED\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Invoice list schedule (calendar identification)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>65</ifr:offset1><ifr:offset2>130</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PERRL\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 12, "MN_INVOICE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Mn_Invoice", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "MN_INVOICE", 67, 134, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MN_INVOICE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Manual invoice maintenance</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>67</ifr:offset1><ifr:offset2>134</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MRNKZ\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 13, "EXCHRATEFI", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Exchratefi", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "9"}, {"fractionDigits", "5"}}, "EXCHRATEFI", 68, 136, -1, 5, 5, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"EXCHRATEFI\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Directly quoted exchange rate for FI postings</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>68</ifr:offset1><ifr:offset2>136</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KURRF_P\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>9</ifr:length><ifr:internalLength1>5</ifr:internalLength1><ifr:internalLength2>5</ifr:internalLength2><ifr:decimals>5</ifr:decimals><ifr:outputLength>12</ifr:outputLength><ifr:conversionExit>EXCRT</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 14, "ADD_VAL_DY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Add_Val_Dy", java.lang.String.class, null, new java.lang.String[][]{{"pattern", "\\d+"}, {"maxLength", "2"}}, "ADD_VAL_DY", 73, 142, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_NUM, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ADD_VAL_DY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Additional value days</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>73</ifr:offset1><ifr:offset2>142</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VALTG\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>NUMC</ifr:type><ifr:abapType>N</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 15, "FIX_VAL_DY", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Fix_Val_Dy", java.sql.Date.class, null, new java.lang.String[][]{}, "FIX_VAL_DY", 75, 146, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"FIX_VAL_DY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Fixed value date</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>75</ifr:offset1><ifr:offset2>146</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VALDT\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 16, "PMNTTRMS", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Pmnttrms", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "PMNTTRMS", 83, 162, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PMNTTRMS\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Terms of payment key</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>83</ifr:offset1><ifr:offset2>162</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"DZTERM\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 17, "PAYMETHODE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Paymethode", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PAYMETHODE", 87, 170, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PAYMETHODE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Payment Method</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>87</ifr:offset1><ifr:offset2>170</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"SCHZW_BSEG\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 18, "ACCNT_ASGN", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Accnt_Asgn", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "ACCNT_ASGN", 88, 172, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ACCNT_ASGN\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Account assignment group for this customer</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>88</ifr:offset1><ifr:offset2>172</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KTGRD\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 19, "EXCHG_RATE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Exchg_Rate", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "9"}, {"fractionDigits", "5"}}, "EXCHG_RATE", 90, 176, -1, 5, 5, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"EXCHG_RATE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Directly quoted exchange rate for pricing and statistics</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>90</ifr:offset1><ifr:offset2>176</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KURSK_P\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>9</ifr:length><ifr:internalLength1>5</ifr:internalLength1><ifr:internalLength2>5</ifr:internalLength2><ifr:decimals>5</ifr:decimals><ifr:outputLength>11</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 20, "PRICE_DATE", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Price_Date", java.sql.Date.class, null, new java.lang.String[][]{}, "PRICE_DATE", 95, 182, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PRICE_DATE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Date for pricing and exchange rate</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>95</ifr:offset1><ifr:offset2>182</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PRSDT\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 21, "BILL_DATE", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Bill_Date", java.sql.Date.class, null, new java.lang.String[][]{}, "BILL_DATE", 103, 198, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"BILL_DATE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Billing date for billing index and printout</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>103</ifr:offset1><ifr:offset2>198</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"FKDAT\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 22, "SERV_DATE", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Serv_Date", java.sql.Date.class, null, new java.lang.String[][]{}, "SERV_DATE", 111, 214, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SERV_DATE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Date on which services rendered</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>111</ifr:offset1><ifr:offset2>214</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"FBUDA\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 23, "FISC_YEAR", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Fisc_Year", java.lang.String.class, null, new java.lang.String[][]{{"pattern", "\\d+"}, {"maxLength", "4"}}, "FISC_YEAR", 119, 230, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_NUM, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"FISC_YEAR\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Fiscal Year</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>119</ifr:offset1><ifr:offset2>230</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"GJAHR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>NUMC</ifr:type><ifr:abapType>N</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength><ifr:conversionExit>GJAHR</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 24, "POSTPERIOD", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Postperiod", java.lang.String.class, null, new java.lang.String[][]{{"pattern", "\\d+"}, {"maxLength", "3"}}, "POSTPERIOD", 123, 238, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_NUM, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"POSTPERIOD\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Posting Period</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>123</ifr:offset1><ifr:offset2>238</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"POPER\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>NUMC</ifr:type><ifr:abapType>N</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 25, "EXCHRATEST", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Exchratest", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "9"}, {"fractionDigits", "5"}}, "EXCHRATEST", 126, 244, -1, 5, 5, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"EXCHRATEST\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Directly quoted exchange rate for statistics</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>126</ifr:offset1><ifr:offset2>244</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"STCUR_P\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>9</ifr:length><ifr:internalLength1>5</ifr:internalLength1><ifr:internalLength2>5</ifr:internalLength2><ifr:decimals>5</ifr:decimals><ifr:outputLength>12</ifr:outputLength><ifr:conversionExit>EXCRT</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 26, "DUNN_KEY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Dunn_Key", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "DUNN_KEY", 131, 250, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DUNN_KEY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Dunning key</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>131</ifr:offset1><ifr:offset2>250</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MSCHL\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 27, "DUNN_BLOCK", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Dunn_Block", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "DUNN_BLOCK", 132, 252, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DUNN_BLOCK\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Dunning block</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>132</ifr:offset1><ifr:offset2>252</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MANSP\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 28, "BILL_PLAN", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Bill_Plan", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "BILL_PLAN", 133, 254, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"BILL_PLAN\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Billing plan number / invoicing plan number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>133</ifr:offset1><ifr:offset2>254</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"FPLNR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 29, "PROMOTION", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Promotion", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "PROMOTION", 143, 274, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PROMOTION\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Promotion</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>143</ifr:offset1><ifr:offset2>274</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"WAKTION\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 30, "PAY_GUARAN", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Pay_Guaran", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "6"}}, "PAY_GUARAN", 153, 294, -1, 6, 12, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PAY_GUARAN\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Payment guarantee procedure</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>153</ifr:offset1><ifr:offset2>294</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ABSSCHE_CM\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>6</ifr:length><ifr:internalLength1>6</ifr:internalLength1><ifr:internalLength2>12</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>6</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 31, "FINDOCPROC", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Findocproc", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "FINDOCPROC", 159, 306, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"FINDOCPROC\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Financial doc. processing: Internal financial doc. number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>159</ifr:offset1><ifr:offset2>306</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"LCNUM\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 32, "J_1AFITP_D", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "J_1Afitp_D", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "J_1AFITP_D", 169, 326, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"J_1AFITP_D\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Tax type</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>169</ifr:offset1><ifr:offset2>326</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"J_1AFITP_D\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 33, "REAS_0_VAT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Reas_0_Vat", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "REAS_0_VAT", 171, 330, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REAS_0_VAT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Reason for zero VAT</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>171</ifr:offset1><ifr:offset2>330</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"J_1ARFZVAT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 34, "REGION", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Region", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "REGION", 172, 332, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REGION\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Region (State, Province, County)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>172</ifr:offset1><ifr:offset2>332</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"REGIO\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 35, "ACTIVICODE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Activicode", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "ACTIVICODE", 175, 338, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ACTIVICODE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Activity Code for Gross Income Tax</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>175</ifr:offset1><ifr:offset2>338</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"J_1AGICD_D\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 36, "DISTRIBTYP", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Distribtyp", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "DISTRIBTYP", 177, 342, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DISTRIBTYP\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Distribution Type for Employment Tax</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>177</ifr:offset1><ifr:offset2>342</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"J_1ADTYP_D\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 37, "TAX_CLASS", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Tax_Class", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "TAX_CLASS", 179, 346, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TAX_CLASS\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Tax relevant classification</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>179</ifr:offset1><ifr:offset2>346</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"J_1ATXREL_\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 38, "DEPART_NO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Depart_No", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "DEPART_NO", 189, 366, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DEPART_NO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Department number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>189</ifr:offset1><ifr:offset2>366</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ABTNR\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 39, "REC_POINT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Rec_Point", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "25"}}, "REC_POINT", 193, 374, -1, 25, 50, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REC_POINT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Receiving point</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>193</ifr:offset1><ifr:offset2>374</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"EMPST\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>25</ifr:length><ifr:internalLength1>25</ifr:internalLength1><ifr:internalLength2>50</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>25</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 40, "PURCH_NO_C", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Purch_No_C", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "35"}}, "PURCH_NO_C", 218, 424, -1, 35, 70, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PURCH_NO_C\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Customer purchase order number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>218</ifr:offset1><ifr:offset2>424</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BSTKD\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>35</ifr:length><ifr:internalLength1>35</ifr:internalLength1><ifr:internalLength2>70</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>35</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 41, "PURCH_DATE", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Purch_Date", java.sql.Date.class, null, new java.lang.String[][]{}, "PURCH_DATE", 253, 494, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PURCH_DATE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Customer purchase order date</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>253</ifr:offset1><ifr:offset2>494</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BSTDK\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 42, "PO_METHOD", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Po_Method", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "PO_METHOD", 261, 510, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PO_METHOD\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Customer purchase order type</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>261</ifr:offset1><ifr:offset2>510</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BSARK\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 43, "REF_1", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ref_1", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "12"}}, "REF_1", 265, 518, -1, 12, 24, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REF_1\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Customer&apos;s or vendor&apos;s internal reference</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>265</ifr:offset1><ifr:offset2>518</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"IHREZ\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>12</ifr:length><ifr:internalLength1>12</ifr:internalLength1><ifr:internalLength2>24</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>12</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 44, "PURCH_NO_S", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Purch_No_S", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "35"}}, "PURCH_NO_S", 277, 542, -1, 35, 70, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PURCH_NO_S\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Ship-to Party&apos;s Purchase Order Number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>277</ifr:offset1><ifr:offset2>542</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BSTKD_E\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>35</ifr:length><ifr:internalLength1>35</ifr:internalLength1><ifr:internalLength2>70</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>35</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 45, "PO_DAT_S", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Po_Dat_S", java.sql.Date.class, null, new java.lang.String[][]{}, "PO_DAT_S", 312, 612, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PO_DAT_S\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Ship-to party&apos;s PO date</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>312</ifr:offset1><ifr:offset2>612</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BSTDK_E\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 46, "PO_METH_S", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Po_Meth_S", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "PO_METH_S", 320, 628, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PO_METH_S\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Ship-to party purchase order type</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>320</ifr:offset1><ifr:offset2>628</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BSARK_E\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 47, "REF_1_S", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ref_1_S", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "12"}}, "REF_1_S", 324, 636, -1, 12, 24, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REF_1_S\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Ship-to party character</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>324</ifr:offset1><ifr:offset2>636</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"IHREZ_E\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>12</ifr:length><ifr:internalLength1>12</ifr:internalLength1><ifr:internalLength2>24</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>12</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 48, "POITMNOS", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Poitmnos", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "6"}}, "POITMNOS", 336, 660, -1, 6, 12, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"POITMNOS\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Item Number of the Underlying Purchase Order</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>336</ifr:offset1><ifr:offset2>660</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"POSEX_E\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>6</ifr:length><ifr:internalLength1>6</ifr:internalLength1><ifr:internalLength2>12</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>6</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 49, "TRANS_DATE", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Trans_Date", java.sql.Date.class, null, new java.lang.String[][]{}, "TRANS_DATE", 342, 672, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TRANS_DATE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Translation date</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>342</ifr:offset1><ifr:offset2>672</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"WWERT_D\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 50, "TRANSDATE", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Transdate", java.sql.Date.class, null, new java.lang.String[][]{}, "TRANSDATE", 350, 688, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TRANSDATE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Translation date</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>350</ifr:offset1><ifr:offset2>688</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"WWERT_D\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 51, "CUSTCONGR1", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Custcongr1", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "CUSTCONGR1", 358, 704, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CUSTCONGR1\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Customer Class</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>358</ifr:offset1><ifr:offset2>704</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KDKG1\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 52, "CUSTCONGR2", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Custcongr2", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "CUSTCONGR2", 360, 708, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CUSTCONGR2\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Customer Type</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>360</ifr:offset1><ifr:offset2>708</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KDKG2\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 53, "CUSTCONGR3", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Custcongr3", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "CUSTCONGR3", 362, 712, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CUSTCONGR3\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Delivered/Non-delivered</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>362</ifr:offset1><ifr:offset2>712</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KDKG3\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 54, "CUSTCONGR4", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Custcongr4", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "CUSTCONGR4", 364, 716, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CUSTCONGR4\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Backorder Choices</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>364</ifr:offset1><ifr:offset2>716</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KDKG4\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 55, "CUSTCONGR5", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Custcongr5", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "CUSTCONGR5", 366, 720, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CUSTCONGR5\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">No Ship Consolidation</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>366</ifr:offset1><ifr:offset2>720</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KDKG5\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 56, "VALCONTCUR", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Valcontcur", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "5"}}, "VALCONTCUR", 368, 724, -1, 5, 10, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"VALCONTCUR\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Value contract currency</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>368</ifr:offset1><ifr:offset2>724</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"WKWAE\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CUKY</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>5</ifr:length><ifr:internalLength1>5</ifr:internalLength1><ifr:internalLength2>10</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>5</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 57, "ISOVALCONT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Isovalcont", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "ISOVALCONT", 373, 734, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ISOVALCONT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">ISO code currency</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>373</ifr:offset1><ifr:offset2>734</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"WAERS_ISO\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 58, "EXCHRATECO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Exchrateco", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "9"}, {"fractionDigits", "5"}}, "EXCHRATECO", 376, 740, -1, 5, 5, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"EXCHRATECO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Direct noted exchange rate in value contract currency</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>376</ifr:offset1><ifr:offset2>740</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"WKKUR_P\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>9</ifr:length><ifr:internalLength1>5</ifr:internalLength1><ifr:internalLength2>5</ifr:internalLength2><ifr:decimals>5</ifr:decimals><ifr:outputLength>12</ifr:outputLength><ifr:conversionExit>EXCRT</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 59, "CURRENCKEY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Currenckey", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "5"}}, "CURRENCKEY", 381, 746, -1, 5, 10, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CURRENCKEY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Currency key for letter-of-credit procg in foreign trade</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>381</ifr:offset1><ifr:offset2>746</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AKWAE\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CUKY</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>5</ifr:length><ifr:internalLength1>5</ifr:internalLength1><ifr:internalLength2>10</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>5</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 60, "ISOCURRKEY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Isocurrkey", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "ISOCURRKEY", 386, 756, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ISOCURRKEY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">ISO code currency</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>386</ifr:offset1><ifr:offset2>756</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"WAERS_ISO\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 61, "EXCHRATELC", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Exchratelc", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "9"}, {"fractionDigits", "5"}}, "EXCHRATELC", 389, 762, -1, 5, 5, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"EXCHRATELC\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Price-quotation rate for processing letters of credit in FT</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>389</ifr:offset1><ifr:offset2>762</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AKKUR_P\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>9</ifr:length><ifr:internalLength1>5</ifr:internalLength1><ifr:internalLength2>5</ifr:internalLength2><ifr:decimals>5</ifr:decimals><ifr:outputLength>12</ifr:outputLength><ifr:conversionExit>EXCRT</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 62, "CEPRPERCEN", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ceprpercen", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "5"}, {"fractionDigits", "2"}}, "CEPRPERCEN", 394, 767, -1, 3, 3, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CEPRPERCEN\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Depreciation percentage for financial document processing</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>394</ifr:offset1><ifr:offset2>767</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AKPRZ\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>5</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>3</ifr:internalLength2><ifr:decimals>2</ifr:decimals><ifr:outputLength>6</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 63, "INFLAT_IDX", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Inflat_Idx", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "5"}}, "INFLAT_IDX", 397, 770, -1, 5, 10, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"INFLAT_IDX\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Inflation Index</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>397</ifr:offset1><ifr:offset2>770</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"J_1AINDXP\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>5</ifr:length><ifr:internalLength1>5</ifr:internalLength1><ifr:internalLength2>10</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>5</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 64, "BASDATEIDX", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Basdateidx", java.sql.Date.class, null, new java.lang.String[][]{}, "BASDATEIDX", 402, 780, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"BASDATEIDX\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Indexing base date</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>402</ifr:offset1><ifr:offset2>780</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"J_1AIDATES\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 65, "CUST_PO_NO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cust_Po_No", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "35"}}, "CUST_PO_NO", 410, 796, -1, 35, 70, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CUST_PO_NO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Customer PO number as matchcode field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>410</ifr:offset1><ifr:offset2>796</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BSTKD_M\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>35</ifr:length><ifr:internalLength1>35</ifr:internalLength1><ifr:internalLength2>70</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>35</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 66, "DLV_TIME", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Dlv_Time", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "DLV_TIME", 445, 866, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DLV_TIME\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Agreed delivery time</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>445</ifr:offset1><ifr:offset2>866</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"DELCO\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 67, "DLI_PROFIL", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Dli_Profil", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "8"}}, "DLI_PROFIL", 448, 872, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DLI_PROFIL\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Dynamic Item Processor Profile</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>448</ifr:offset1><ifr:offset2>872</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD01PROFNR\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>8</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 68, "CALC_MOTIVE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Calc_Motive", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "CALC_MOTIVE", 456, 888, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CALC_MOTIVE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Accounting Indicator</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>456</ifr:offset1><ifr:offset2>888</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BEMOT\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 69, "BILL_FORM", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Bill_Form", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "BILL_FORM", 458, 892, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"BILL_FORM\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Billing form</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>458</ifr:offset1><ifr:offset2>892</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"FAKTF\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 70, "REVENUETYP", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Revenuetyp", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "REVENUETYP", 460, 896, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REVENUETYP\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Revenue recognition category</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>460</ifr:offset1><ifr:offset2>896</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"RR_RELTYP\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 71, "BEGDEMAPER", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Begdemaper", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "BEGDEMAPER", 461, 898, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"BEGDEMAPER\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Proposed start date for accrual period</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>461</ifr:offset1><ifr:offset2>898</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"RR_ACDATV\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 72, "EXCHRATELC_V", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Exchratelc_V", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "9"}, {"fractionDigits", "5"}}, "EXCHRATELC_V", 462, 900, -1, 5, 5, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"EXCHRATELC_V\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Indir.-quotation rate for processing letters of credit in FT</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>462</ifr:offset1><ifr:offset2>900</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AKKUR_V\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>9</ifr:length><ifr:internalLength1>5</ifr:internalLength1><ifr:internalLength2>5</ifr:internalLength2><ifr:decimals>5</ifr:decimals><ifr:outputLength>12</ifr:outputLength><ifr:conversionExit>EXCRT</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 73, "EXCH_RATE_FI_V", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Exch_Rate_Fi_V", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "9"}, {"fractionDigits", "5"}}, "EXCH_RATE_FI_V", 467, 905, -1, 5, 5, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"EXCH_RATE_FI_V\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Indirectly quoted exchange rate for FI postings</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>467</ifr:offset1><ifr:offset2>905</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KURRF_V\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>9</ifr:length><ifr:internalLength1>5</ifr:internalLength1><ifr:internalLength2>5</ifr:internalLength2><ifr:decimals>5</ifr:decimals><ifr:outputLength>12</ifr:outputLength><ifr:conversionExit>EXCRT</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 74, "EXCHG_RATE_V", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Exchg_Rate_V", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "9"}, {"fractionDigits", "5"}}, "EXCHG_RATE_V", 472, 910, -1, 5, 5, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"EXCHG_RATE_V\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Indirectly quoted exchange rate for pricing and statistics</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>472</ifr:offset1><ifr:offset2>910</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KURSK_V\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>9</ifr:length><ifr:internalLength1>5</ifr:internalLength1><ifr:internalLength2>5</ifr:internalLength2><ifr:decimals>5</ifr:decimals><ifr:outputLength>11</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 75, "EXCHRATEST_V", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Exchratest_V", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "9"}, {"fractionDigits", "5"}}, "EXCHRATEST_V", 477, 915, -1, 5, 5, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"EXCHRATEST_V\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Indirectly quoted exchange rate for statistics</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>477</ifr:offset1><ifr:offset2>915</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"STCUR_V\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>9</ifr:length><ifr:internalLength1>5</ifr:internalLength1><ifr:internalLength2>5</ifr:internalLength2><ifr:decimals>5</ifr:decimals><ifr:outputLength>12</ifr:outputLength><ifr:conversionExit>EXCRT</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 76, "EXCHRATECO_V", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Exchrateco_V", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "9"}, {"fractionDigits", "5"}}, "EXCHRATECO_V", 482, 920, -1, 5, 5, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"EXCHRATECO_V\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Indirect noted exchange rate in value contract currency</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>482</ifr:offset1><ifr:offset2>920</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"WKKUR_V\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>9</ifr:length><ifr:internalLength1>5</ifr:internalLength1><ifr:internalLength2>5</ifr:internalLength2><ifr:decimals>5</ifr:decimals><ifr:outputLength>12</ifr:outputLength><ifr:conversionExit>EXCRT</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 77, "DELIV_TYPE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Deliv_Type", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "DELIV_TYPE", 487, 926, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DELIV_TYPE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Shipping type</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>487</ifr:offset1><ifr:offset2>926</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VSARTTR\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 78, "TRANS_CAT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Trans_Cat", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "TRANS_CAT", 489, 930, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TRANS_CAT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Means-of-Transport Type</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>489</ifr:offset1><ifr:offset2>930</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"TRATY\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 79, "TRANS_MAT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Trans_Mat", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "18"}}, "TRANS_MAT", 493, 938, -1, 18, 36, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TRANS_MAT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Means of Transport</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>493</ifr:offset1><ifr:offset2>938</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"TRMTYP\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>18</ifr:length><ifr:internalLength1>18</ifr:internalLength1><ifr:internalLength2>36</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>18</ifr:outputLength><ifr:conversionExit>MATN1</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 80, "SPEC_PROC", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Spec_Proc", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "SPEC_PROC", 511, 974, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SPEC_PROC\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Special processing indicator</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>511</ifr:offset1><ifr:offset2>974</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"SDABW\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 81, "PRODCAT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Prodcat", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "PRODCAT", 515, 982, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PRODCAT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Product catalog number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>515</ifr:offset1><ifr:offset2>982</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"WMINR\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 82, "FUNC_AREA", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Func_Area", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "FUNC_AREA", 525, 1002, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"FUNC_AREA\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Functional Area</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>525</ifr:offset1><ifr:offset2>1002</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"FKBER_SHORT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 83, "POD_PROC", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Pod_Proc", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "POD_PROC", 529, 1010, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"POD_PROC\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Relevant for POD processing</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>529</ifr:offset1><ifr:offset2>1010</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PODKZ\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 84, "CAMPAIGN", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:base64Binary", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Campaign", byte[].class, null, new java.lang.String[][]{{"length", "16"}}, "CAMPAIGN", 530, 1012, -1, 16, 16, -1, com.sap.mw.jco.JCO.TYPE_BYTE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CAMPAIGN\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Generic project planning: GUID from external R/3 system</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>530</ifr:offset1><ifr:offset2>1012</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CGPL_GUID16_R3\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>RAW</ifr:type><ifr:abapType>X</ifr:abapType><ifr:length>16</ifr:length><ifr:internalLength1>16</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>32</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 85, "FKK_CONACCT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Fkk_Conacct", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "12"}}, "FKK_CONACCT", 546, 1028, -1, 12, 24, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"FKK_CONACCT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Character field of length 12</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>546</ifr:offset1><ifr:offset2>1028</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CHAR012\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>12</ifr:length><ifr:internalLength1>12</ifr:internalLength1><ifr:internalLength2>24</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>12</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 86, "FUNC_AREA_LONG", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Func_Area_Long", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "16"}}, "FUNC_AREA_LONG", 558, 1052, -1, 16, 32, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"FUNC_AREA_LONG\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Functional Area</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>558</ifr:offset1><ifr:offset2>1052</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"FKBER_LONG\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>16</ifr:length><ifr:internalLength1>16</ifr:internalLength1><ifr:internalLength2>32</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>16</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 87, "FKK_CONACCT_GUID", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:base64Binary", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Fkk_Conacct_Guid", byte[].class, null, new java.lang.String[][]{{"length", "16"}}, "FKK_CONACCT_GUID", 574, 1084, -1, 16, 16, -1, com.sap.mw.jco.JCO.TYPE_BYTE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"FKK_CONACCT_GUID\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">GUID in &apos;RAW&apos; format</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>574</ifr:offset1><ifr:offset2>1084</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"GUID_16\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>RAW</ifr:type><ifr:abapType>X</ifr:abapType><ifr:length>16</ifr:length><ifr:internalLength1>16</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>32</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        staticDescriptor = descriptor;
    }
    protected  BapisdbusiType (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    public  BapisdbusiType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public java.lang.String getIncoterms1() {
        return (java.lang.String)baseTypeData().getElementValueAsString(7);
    }

    
    public void setValcontcur(java.lang.String Valcontcur) {
        baseTypeData().setElementValue(56, Valcontcur);
    }

    
    public java.lang.String getCustcongr4() {
        return (java.lang.String)baseTypeData().getElementValueAsString(54);
    }

    
    public void setRef_1(java.lang.String Ref_1) {
        baseTypeData().setElementValue(43, Ref_1);
    }

    
    public void setJ_1Afitp_D(java.lang.String J_1Afitp_D) {
        baseTypeData().setElementValue(32, J_1Afitp_D);
    }

    
    public java.math.BigDecimal getExchratest() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(25);
    }

    
    public void setDepart_No(java.lang.String Depart_No) {
        baseTypeData().setElementValue(38, Depart_No);
    }

    
    public void setSd_Doc(java.lang.String Sd_Doc) {
        baseTypeData().setElementValue(1, Sd_Doc);
    }

    
    public java.sql.Date getBasdateidx() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(64);
    }

    
    public java.lang.String getOperation() {
        return (java.lang.String)baseTypeData().getElementValueAsString(0);
    }

    
    public java.lang.String getRegion() {
        return (java.lang.String)baseTypeData().getElementValueAsString(34);
    }

    
    public java.lang.String getSpec_Proc() {
        return (java.lang.String)baseTypeData().getElementValueAsString(80);
    }

    
    public java.math.BigDecimal getExchratelc_V() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(72);
    }

    
    public java.lang.String getBegdemaper() {
        return (java.lang.String)baseTypeData().getElementValueAsString(71);
    }

    
    public java.lang.String getPaymethode() {
        return (java.lang.String)baseTypeData().getElementValueAsString(17);
    }

    
    public void setPmnttrms(java.lang.String Pmnttrms) {
        baseTypeData().setElementValue(16, Pmnttrms);
    }

    
    public void setPurch_No_S(java.lang.String Purch_No_S) {
        baseTypeData().setElementValue(44, Purch_No_S);
    }

    
    public java.lang.String getRef_1_S() {
        return (java.lang.String)baseTypeData().getElementValueAsString(47);
    }

    
    public java.lang.String getPod_Proc() {
        return (java.lang.String)baseTypeData().getElementValueAsString(83);
    }

    
    public void setOrdcombind(java.lang.String Ordcombind) {
        baseTypeData().setElementValue(9, Ordcombind);
    }

    
    public java.sql.Date getFix_Val_Dy() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(15);
    }

    
    public void setPod_Proc(java.lang.String Pod_Proc) {
        baseTypeData().setElementValue(83, Pod_Proc);
    }

    
    public java.lang.String getPay_Guaran() {
        return (java.lang.String)baseTypeData().getElementValueAsString(30);
    }

    
    public void setFunc_Area(java.lang.String Func_Area) {
        baseTypeData().setElementValue(82, Func_Area);
    }

    
    public void setExch_Rate_Fi_V(java.math.BigDecimal Exch_Rate_Fi_V) {
        baseTypeData().setElementValue(73, Exch_Rate_Fi_V);
    }

    
    public java.lang.String getPurch_No_C() {
        return (java.lang.String)baseTypeData().getElementValueAsString(40);
    }

    
    public java.lang.String getCustcongr5() {
        return (java.lang.String)baseTypeData().getElementValueAsString(55);
    }

    
    public java.lang.String getAdd_Val_Dy() {
        return (java.lang.String)baseTypeData().getElementValueAsString(14);
    }

    
    public java.lang.String getIncoterms2() {
        return (java.lang.String)baseTypeData().getElementValueAsString(8);
    }

    
    public void setFindocproc(java.lang.String Findocproc) {
        baseTypeData().setElementValue(31, Findocproc);
    }

    
    public java.lang.String getBill_Sched() {
        return (java.lang.String)baseTypeData().getElementValueAsString(10);
    }

    
    public java.lang.String getIsovalcont() {
        return (java.lang.String)baseTypeData().getElementValueAsString(57);
    }

    
    public void setReas_0_Vat(java.lang.String Reas_0_Vat) {
        baseTypeData().setElementValue(33, Reas_0_Vat);
    }

    
    public java.lang.String getDeliv_Type() {
        return (java.lang.String)baseTypeData().getElementValueAsString(77);
    }

    
    public java.lang.String getFindocproc() {
        return (java.lang.String)baseTypeData().getElementValueAsString(31);
    }

    
    public java.lang.String getDepart_No() {
        return (java.lang.String)baseTypeData().getElementValueAsString(38);
    }

    
    public byte[] getFkk_Conacct_Guid() {
        return (byte[])baseTypeData().getElementValueAsByteArray(87);
    }

    
    public java.lang.String getInvo_Sched() {
        return (java.lang.String)baseTypeData().getElementValueAsString(11);
    }

    
    public java.lang.String getDistribtyp() {
        return (java.lang.String)baseTypeData().getElementValueAsString(36);
    }

    
    public void setDistribtyp(java.lang.String Distribtyp) {
        baseTypeData().setElementValue(36, Distribtyp);
    }

    
    public void setProdcat(java.lang.String Prodcat) {
        baseTypeData().setElementValue(81, Prodcat);
    }

    
    public java.math.BigDecimal getExchrateco_V() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(76);
    }

    
    public void setExchratelc(java.math.BigDecimal Exchratelc) {
        baseTypeData().setElementValue(61, Exchratelc);
    }

    
    public java.math.BigDecimal getExchratelc() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(61);
    }

    
    public java.sql.Date getTrans_Date() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(49);
    }

    
    public java.lang.String getDunn_Block() {
        return (java.lang.String)baseTypeData().getElementValueAsString(27);
    }

    
    public java.lang.String getCustcongr2() {
        return (java.lang.String)baseTypeData().getElementValueAsString(52);
    }

    
    public java.math.BigDecimal getExchg_Rate() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(19);
    }

    
    public void setSpec_Proc(java.lang.String Spec_Proc) {
        baseTypeData().setElementValue(80, Spec_Proc);
    }

    
    public java.sql.Date getTransdate() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(50);
    }

    
    public void setServ_Date(java.sql.Date Serv_Date) {
        baseTypeData().setElementValue(22, Serv_Date);
    }

    
    public void setCampaign(byte[] Campaign) {
        baseTypeData().setElementValue(84, Campaign);
    }

    
    public void setBill_Sched(java.lang.String Bill_Sched) {
        baseTypeData().setElementValue(10, Bill_Sched);
    }

    
    public java.lang.String getFunc_Area() {
        return (java.lang.String)baseTypeData().getElementValueAsString(82);
    }

    
    public void setRegion(java.lang.String Region) {
        baseTypeData().setElementValue(34, Region);
    }

    
    public void setFunc_Area_Long(java.lang.String Func_Area_Long) {
        baseTypeData().setElementValue(86, Func_Area_Long);
    }

    
    public java.lang.String getCurrenckey() {
        return (java.lang.String)baseTypeData().getElementValueAsString(59);
    }

    
    public void setRevenuetyp(java.lang.String Revenuetyp) {
        baseTypeData().setElementValue(70, Revenuetyp);
    }

    
    public void setTransdate(java.sql.Date Transdate) {
        baseTypeData().setElementValue(50, Transdate);
    }

    
    public java.lang.String getJ_1Afitp_D() {
        return (java.lang.String)baseTypeData().getElementValueAsString(32);
    }

    
    public void setCurrenckey(java.lang.String Currenckey) {
        baseTypeData().setElementValue(59, Currenckey);
    }

    
    public void setDeliv_Type(java.lang.String Deliv_Type) {
        baseTypeData().setElementValue(77, Deliv_Type);
    }

    
    public void setCalc_Motive(java.lang.String Calc_Motive) {
        baseTypeData().setElementValue(68, Calc_Motive);
    }

    
    public void setCustcongr4(java.lang.String Custcongr4) {
        baseTypeData().setElementValue(54, Custcongr4);
    }

    
    public void setInflat_Idx(java.lang.String Inflat_Idx) {
        baseTypeData().setElementValue(63, Inflat_Idx);
    }

    
    public java.sql.Date getPrice_Date() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(20);
    }

    
    public java.lang.String getBill_Plan() {
        return (java.lang.String)baseTypeData().getElementValueAsString(28);
    }

    
    public java.lang.String getPoitmnos() {
        return (java.lang.String)baseTypeData().getElementValueAsString(48);
    }

    
    public java.sql.Date getPo_Dat_S() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(45);
    }

    
    public void setCustcongr5(java.lang.String Custcongr5) {
        baseTypeData().setElementValue(55, Custcongr5);
    }

    
    public java.lang.String getProdcat() {
        return (java.lang.String)baseTypeData().getElementValueAsString(81);
    }

    
    public java.lang.String getCust_Group() {
        return (java.lang.String)baseTypeData().getElementValueAsString(4);
    }

    
    public java.sql.Date getPurch_Date() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(41);
    }

    
    public void setPurch_No_C(java.lang.String Purch_No_C) {
        baseTypeData().setElementValue(40, Purch_No_C);
    }

    
    public void setIsovalcont(java.lang.String Isovalcont) {
        baseTypeData().setElementValue(57, Isovalcont);
    }

    
    public java.lang.String getCustcongr3() {
        return (java.lang.String)baseTypeData().getElementValueAsString(53);
    }

    
    public java.lang.String getTax_Class() {
        return (java.lang.String)baseTypeData().getElementValueAsString(37);
    }

    
    public void setExchratelc_V(java.math.BigDecimal Exchratelc_V) {
        baseTypeData().setElementValue(72, Exchratelc_V);
    }

    
    public java.lang.String getPostperiod() {
        return (java.lang.String)baseTypeData().getElementValueAsString(24);
    }

    
    public void setExchrateco_V(java.math.BigDecimal Exchrateco_V) {
        baseTypeData().setElementValue(76, Exchrateco_V);
    }

    
    public java.math.BigDecimal getCeprpercen() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(62);
    }

    
    public void setBill_Form(java.lang.String Bill_Form) {
        baseTypeData().setElementValue(69, Bill_Form);
    }

    
    public void setTrans_Mat(java.lang.String Trans_Mat) {
        baseTypeData().setElementValue(79, Trans_Mat);
    }

    
    public void setPo_Dat_S(java.sql.Date Po_Dat_S) {
        baseTypeData().setElementValue(45, Po_Dat_S);
    }

    
    public byte[] getCampaign() {
        return (byte[])baseTypeData().getElementValueAsByteArray(84);
    }

    
    public java.lang.String getMn_Invoice() {
        return (java.lang.String)baseTypeData().getElementValueAsString(12);
    }

    
    public java.lang.String getDunn_Key() {
        return (java.lang.String)baseTypeData().getElementValueAsString(26);
    }

    
    public void setDlv_Time(java.lang.String Dlv_Time) {
        baseTypeData().setElementValue(66, Dlv_Time);
    }

    
    public void setTrans_Cat(java.lang.String Trans_Cat) {
        baseTypeData().setElementValue(78, Trans_Cat);
    }

    
    public void setCustcongr1(java.lang.String Custcongr1) {
        baseTypeData().setElementValue(51, Custcongr1);
    }

    
    public java.lang.String getRec_Point() {
        return (java.lang.String)baseTypeData().getElementValueAsString(39);
    }

    
    public void setFisc_Year(java.lang.String Fisc_Year) {
        baseTypeData().setElementValue(23, Fisc_Year);
    }

    
    public void setExchg_Rate(java.math.BigDecimal Exchg_Rate) {
        baseTypeData().setElementValue(19, Exchg_Rate);
    }

    
    public java.math.BigDecimal getExchg_Rate_V() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(74);
    }

    
    public java.lang.String getReas_0_Vat() {
        return (java.lang.String)baseTypeData().getElementValueAsString(33);
    }

    
    public java.lang.String getFkk_Conacct() {
        return (java.lang.String)baseTypeData().getElementValueAsString(85);
    }

    
    public java.lang.String getRef_1() {
        return (java.lang.String)baseTypeData().getElementValueAsString(43);
    }

    
    public void setAdd_Val_Dy(java.lang.String Add_Val_Dy) {
        baseTypeData().setElementValue(14, Add_Val_Dy);
    }

    
    public void setPo_Meth_S(java.lang.String Po_Meth_S) {
        baseTypeData().setElementValue(46, Po_Meth_S);
    }

    
    public java.lang.String getAccnt_Asgn() {
        return (java.lang.String)baseTypeData().getElementValueAsString(18);
    }

    
    public java.lang.String getCalc_Motive() {
        return (java.lang.String)baseTypeData().getElementValueAsString(68);
    }

    
    public void setPaymethode(java.lang.String Paymethode) {
        baseTypeData().setElementValue(17, Paymethode);
    }

    
    public java.lang.String getFunc_Area_Long() {
        return (java.lang.String)baseTypeData().getElementValueAsString(86);
    }

    
    public void setInvo_Sched(java.lang.String Invo_Sched) {
        baseTypeData().setElementValue(11, Invo_Sched);
    }

    
    public void setPoitmnos(java.lang.String Poitmnos) {
        baseTypeData().setElementValue(48, Poitmnos);
    }

    
    public java.sql.Date getBill_Date() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(21);
    }

    
    public void setExchratest_V(java.math.BigDecimal Exchratest_V) {
        baseTypeData().setElementValue(75, Exchratest_V);
    }

    
    public void setPostperiod(java.lang.String Postperiod) {
        baseTypeData().setElementValue(24, Postperiod);
    }

    
    public java.lang.String getDli_Profil() {
        return (java.lang.String)baseTypeData().getElementValueAsString(67);
    }

    
    public java.math.BigDecimal getExch_Rate_Fi_V() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(73);
    }

    
    public java.math.BigDecimal getExchratefi() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(13);
    }

    
    public java.lang.String getPrice_List() {
        return (java.lang.String)baseTypeData().getElementValueAsString(6);
    }

    
    public void setPrice_List(java.lang.String Price_List) {
        baseTypeData().setElementValue(6, Price_List);
    }

    
    public void setRef_1_S(java.lang.String Ref_1_S) {
        baseTypeData().setElementValue(47, Ref_1_S);
    }

    
    public void setExchg_Rate_V(java.math.BigDecimal Exchg_Rate_V) {
        baseTypeData().setElementValue(74, Exchg_Rate_V);
    }

    
    public void setPrice_Date(java.sql.Date Price_Date) {
        baseTypeData().setElementValue(20, Price_Date);
    }

    
    public void setTax_Class(java.lang.String Tax_Class) {
        baseTypeData().setElementValue(37, Tax_Class);
    }

    
    public java.lang.String getCustcongr1() {
        return (java.lang.String)baseTypeData().getElementValueAsString(51);
    }

    
    public void setFkk_Conacct_Guid(byte[] Fkk_Conacct_Guid) {
        baseTypeData().setElementValue(87, Fkk_Conacct_Guid);
    }

    
    public java.math.BigDecimal getExchratest_V() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(75);
    }

    
    public void setItm_Number(java.lang.String Itm_Number) {
        baseTypeData().setElementValue(2, Itm_Number);
    }

    
    public void setCustcongr3(java.lang.String Custcongr3) {
        baseTypeData().setElementValue(53, Custcongr3);
    }

    
    public void setCust_Group(java.lang.String Cust_Group) {
        baseTypeData().setElementValue(4, Cust_Group);
    }

    
    public java.lang.String getFisc_Year() {
        return (java.lang.String)baseTypeData().getElementValueAsString(23);
    }

    
    public java.lang.String getSales_Dist() {
        return (java.lang.String)baseTypeData().getElementValueAsString(5);
    }

    
    public void setBegdemaper(java.lang.String Begdemaper) {
        baseTypeData().setElementValue(71, Begdemaper);
    }

    
    public java.lang.String getPo_Meth_S() {
        return (java.lang.String)baseTypeData().getElementValueAsString(46);
    }

    
    public java.lang.String getOrdcombind() {
        return (java.lang.String)baseTypeData().getElementValueAsString(9);
    }

    
    public void setFix_Val_Dy(java.sql.Date Fix_Val_Dy) {
        baseTypeData().setElementValue(15, Fix_Val_Dy);
    }

    
    public void setBill_Date(java.sql.Date Bill_Date) {
        baseTypeData().setElementValue(21, Bill_Date);
    }

    
    public void setDli_Profil(java.lang.String Dli_Profil) {
        baseTypeData().setElementValue(67, Dli_Profil);
    }

    
    public void setActivicode(java.lang.String Activicode) {
        baseTypeData().setElementValue(35, Activicode);
    }

    
    public java.lang.String getBill_Form() {
        return (java.lang.String)baseTypeData().getElementValueAsString(69);
    }

    
    public java.lang.String getValcontcur() {
        return (java.lang.String)baseTypeData().getElementValueAsString(56);
    }

    
    public java.lang.String getInflat_Idx() {
        return (java.lang.String)baseTypeData().getElementValueAsString(63);
    }

    
    public void setPo_Method(java.lang.String Po_Method) {
        baseTypeData().setElementValue(42, Po_Method);
    }

    
    public void setPromotion(java.lang.String Promotion) {
        baseTypeData().setElementValue(29, Promotion);
    }

    
    public void setIncoterms1(java.lang.String Incoterms1) {
        baseTypeData().setElementValue(7, Incoterms1);
    }

    
    public void setExchrateco(java.math.BigDecimal Exchrateco) {
        baseTypeData().setElementValue(58, Exchrateco);
    }

    
    public java.lang.String getPromotion() {
        return (java.lang.String)baseTypeData().getElementValueAsString(29);
    }

    
    public void setCustcongr2(java.lang.String Custcongr2) {
        baseTypeData().setElementValue(52, Custcongr2);
    }

    
    public void setIsocurrkey(java.lang.String Isocurrkey) {
        baseTypeData().setElementValue(60, Isocurrkey);
    }

    
    public void setCeprpercen(java.math.BigDecimal Ceprpercen) {
        baseTypeData().setElementValue(62, Ceprpercen);
    }

    
    public void setMn_Invoice(java.lang.String Mn_Invoice) {
        baseTypeData().setElementValue(12, Mn_Invoice);
    }

    
    public java.lang.String getPmnttrms() {
        return (java.lang.String)baseTypeData().getElementValueAsString(16);
    }

    
    public java.sql.Date getServ_Date() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(22);
    }

    
    public void setDunn_Key(java.lang.String Dunn_Key) {
        baseTypeData().setElementValue(26, Dunn_Key);
    }

    
    public java.lang.String getPurch_No_S() {
        return (java.lang.String)baseTypeData().getElementValueAsString(44);
    }

    
    public MetaData metadata() {
        return metadata;
    }

    
    public java.lang.String getTrans_Cat() {
        return (java.lang.String)baseTypeData().getElementValueAsString(78);
    }

    
    public void setRec_Point(java.lang.String Rec_Point) {
        baseTypeData().setElementValue(39, Rec_Point);
    }

    
    public void setPrice_Grp(java.lang.String Price_Grp) {
        baseTypeData().setElementValue(3, Price_Grp);
    }

    
    public java.lang.String getSd_Doc() {
        return (java.lang.String)baseTypeData().getElementValueAsString(1);
    }

    
    public java.lang.String getIsocurrkey() {
        return (java.lang.String)baseTypeData().getElementValueAsString(60);
    }

    
    public java.lang.String getActivicode() {
        return (java.lang.String)baseTypeData().getElementValueAsString(35);
    }

    
    public void setBill_Plan(java.lang.String Bill_Plan) {
        baseTypeData().setElementValue(28, Bill_Plan);
    }

    
    public void setFkk_Conacct(java.lang.String Fkk_Conacct) {
        baseTypeData().setElementValue(85, Fkk_Conacct);
    }

    
    public java.math.BigDecimal getExchrateco() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(58);
    }

    
    public void setDunn_Block(java.lang.String Dunn_Block) {
        baseTypeData().setElementValue(27, Dunn_Block);
    }

    
    public void setExchratefi(java.math.BigDecimal Exchratefi) {
        baseTypeData().setElementValue(13, Exchratefi);
    }

    
    public void setBasdateidx(java.sql.Date Basdateidx) {
        baseTypeData().setElementValue(64, Basdateidx);
    }

    
    public void setCust_Po_No(java.lang.String Cust_Po_No) {
        baseTypeData().setElementValue(65, Cust_Po_No);
    }

    
    public void setOperation(java.lang.String Operation) {
        baseTypeData().setElementValue(0, Operation);
    }

    
    public java.lang.String getPo_Method() {
        return (java.lang.String)baseTypeData().getElementValueAsString(42);
    }

    
    public java.lang.String getRevenuetyp() {
        return (java.lang.String)baseTypeData().getElementValueAsString(70);
    }

    
    public void setAccnt_Asgn(java.lang.String Accnt_Asgn) {
        baseTypeData().setElementValue(18, Accnt_Asgn);
    }

    
    public java.lang.String getTrans_Mat() {
        return (java.lang.String)baseTypeData().getElementValueAsString(79);
    }

    
    public void setSales_Dist(java.lang.String Sales_Dist) {
        baseTypeData().setElementValue(5, Sales_Dist);
    }

    
    public java.lang.String getDlv_Time() {
        return (java.lang.String)baseTypeData().getElementValueAsString(66);
    }

    
    public java.lang.String getCust_Po_No() {
        return (java.lang.String)baseTypeData().getElementValueAsString(65);
    }

    
    public void setTrans_Date(java.sql.Date Trans_Date) {
        baseTypeData().setElementValue(49, Trans_Date);
    }

    
    public void setPay_Guaran(java.lang.String Pay_Guaran) {
        baseTypeData().setElementValue(30, Pay_Guaran);
    }

    
    public java.lang.String getItm_Number() {
        return (java.lang.String)baseTypeData().getElementValueAsString(2);
    }

    
    public void setIncoterms2(java.lang.String Incoterms2) {
        baseTypeData().setElementValue(8, Incoterms2);
    }

    
    public void setPurch_Date(java.sql.Date Purch_Date) {
        baseTypeData().setElementValue(41, Purch_Date);
    }

    
    public java.lang.String getPrice_Grp() {
        return (java.lang.String)baseTypeData().getElementValueAsString(3);
    }

    
    public void setExchratest(java.math.BigDecimal Exchratest) {
        baseTypeData().setElementValue(25, Exchratest);
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  BapisdbusiType parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (BapisdbusiType parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getIncoterms1() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(7);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCustcongr4() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(54);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getAccnt_Asgn() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(18);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getExchratest() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(25);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCalc_Motive() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(68);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getFunc_Area_Long() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(86);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getBill_Date() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(21);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getBasdateidx() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(64);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getOperation() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRegion() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(34);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSpec_Proc() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(80);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getExchratelc_V() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(72);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getBegdemaper() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(71);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDli_Profil() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(67);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPaymethode() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(17);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getExch_Rate_Fi_V() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(73);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getExchratefi() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(13);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPrice_List() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(6);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRef_1_S() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(47);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPod_Proc() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(83);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCustcongr1() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(51);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getFix_Val_Dy() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(15);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getExchratest_V() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(75);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPay_Guaran() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(30);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPurch_No_C() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(40);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCustcongr5() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(55);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getFisc_Year() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(23);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getAdd_Val_Dy() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(14);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getIncoterms2() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(8);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSales_Dist() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(5);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getBill_Sched() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(10);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPo_Meth_S() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(46);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getIsovalcont() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(57);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getOrdcombind() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(9);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDeliv_Type() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(77);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getFindocproc() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(31);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDepart_No() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(38);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getFkk_Conacct_Guid() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(87);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getBill_Form() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(69);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getInvo_Sched() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(11);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getValcontcur() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(56);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getInflat_Idx() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(63);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDistribtyp() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(36);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getExchrateco_V() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(76);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getExchratelc() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(61);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTrans_Date() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(49);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDunn_Block() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(27);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPromotion() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(29);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCustcongr2() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(52);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getExchg_Rate() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(19);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTransdate() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(50);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getFunc_Area() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(82);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPmnttrms() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(16);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCurrenckey() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(59);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getServ_Date() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(22);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getJ_1Afitp_D() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(32);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPurch_No_S() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(44);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTrans_Cat() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(78);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSd_Doc() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getIsocurrkey() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(60);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getActivicode() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(35);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPrice_Date() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(20);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getBill_Plan() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(28);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getExchrateco() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(58);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPoitmnos() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(48);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPo_Dat_S() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(45);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getProdcat() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(81);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCust_Group() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(4);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPurch_Date() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(41);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPo_Method() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(42);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCustcongr3() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(53);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTax_Class() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(37);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRevenuetyp() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(70);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPostperiod() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(24);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCeprpercen() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(62);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTrans_Mat() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(79);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCampaign() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(84);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMn_Invoice() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(12);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDunn_Key() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(26);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDlv_Time() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(66);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCust_Po_No() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(65);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRec_Point() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(39);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getExchg_Rate_V() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(74);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getItm_Number() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getReas_0_Vat() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(33);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getFkk_Conacct() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(85);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRef_1() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(43);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPrice_Grp() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
    }

}
