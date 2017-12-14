package hmh.sap.rfc;


public class BapisditType extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1354127028443L) ;

    private  BapisditType.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.XSDL_COMPLEX_TYPE, "urn:sap-com:document:sap:rfc:functions", "BAPISDIT", 219, 0, hmh.sap.rfc.BapisditType.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "BAPISDIT", 1400, 2408, -1, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"BAPISDIT\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Structure of VBAP with English Field Names</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>110</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>1400</ifr:internalLength1><ifr:internalLength2>2408</ifr:internalLength2></ifr:definition></ifr:container></s0:type>");
        descriptorSetElementProperties(descriptor, 0, "OPERATION", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Operation", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "OPERATION", 0, 0, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"OPERATION\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Function</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>0</ifr:offset1><ifr:offset2>0</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MSGFN\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 1, "DOC_NUMBER", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Doc_Number", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "DOC_NUMBER", 3, 6, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DOC_NUMBER\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Sales Document</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>3</ifr:offset1><ifr:offset2>6</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VBELN_VA\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 2, "ITM_NUMBER", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Itm_Number", java.lang.String.class, null, new java.lang.String[][]{{"pattern", "\\d+"}, {"maxLength", "6"}}, "ITM_NUMBER", 13, 26, -1, 6, 12, -1, com.sap.mw.jco.JCO.TYPE_NUM, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ITM_NUMBER\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Sales Document Item</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>13</ifr:offset1><ifr:offset2>26</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"POSNR_VA\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>NUMC</ifr:type><ifr:abapType>N</ifr:abapType><ifr:length>6</ifr:length><ifr:internalLength1>6</ifr:internalLength1><ifr:internalLength2>12</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>6</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 3, "MATERIAL", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Material", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "18"}}, "MATERIAL", 19, 38, -1, 18, 36, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MATERIAL\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Material Number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>19</ifr:offset1><ifr:offset2>38</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MATNR\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>18</ifr:length><ifr:internalLength1>18</ifr:internalLength1><ifr:internalLength2>36</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>18</ifr:outputLength><ifr:conversionExit>MATN1</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 4, "MAT_ENTRD", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Mat_Entrd", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "18"}}, "MAT_ENTRD", 37, 74, -1, 18, 36, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MAT_ENTRD\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Material entered</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>37</ifr:offset1><ifr:offset2>74</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MATWA\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>18</ifr:length><ifr:internalLength1>18</ifr:internalLength1><ifr:internalLength2>36</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>18</ifr:outputLength><ifr:conversionExit>MATN1</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 5, "PR_REF_MAT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Pr_Ref_Mat", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "18"}}, "PR_REF_MAT", 55, 110, -1, 18, 36, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PR_REF_MAT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Pricing reference material</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>55</ifr:offset1><ifr:offset2>110</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PMATN\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>18</ifr:length><ifr:internalLength1>18</ifr:internalLength1><ifr:internalLength2>36</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>18</ifr:outputLength><ifr:conversionExit>MATN1</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 6, "BATCH", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Batch", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "BATCH", 73, 146, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"BATCH\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Batch Number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>73</ifr:offset1><ifr:offset2>146</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CHARG_D\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 7, "MATL_GROUP", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Matl_Group", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "9"}}, "MATL_GROUP", 83, 166, -1, 9, 18, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MATL_GROUP\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Material Group</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>83</ifr:offset1><ifr:offset2>166</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MATKL\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>9</ifr:length><ifr:internalLength1>9</ifr:internalLength1><ifr:internalLength2>18</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>9</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 8, "SHORT_TEXT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Short_Text", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "40"}}, "SHORT_TEXT", 92, 184, -1, 40, 80, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SHORT_TEXT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Short Text for Sales Order Item</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>92</ifr:offset1><ifr:offset2>184</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ARKTX\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>40</ifr:length><ifr:internalLength1>40</ifr:internalLength1><ifr:internalLength2>80</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>40</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 9, "ITEM_CATEG", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Item_Categ", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "ITEM_CATEG", 132, 264, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ITEM_CATEG\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Sales document item category</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>132</ifr:offset1><ifr:offset2>264</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PSTYV\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 10, "ITEM_TYPE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Item_Type", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "ITEM_TYPE", 136, 272, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ITEM_TYPE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Item type</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>136</ifr:offset1><ifr:offset2>272</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"POSAR\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 11, "REL_FOR_DE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Rel_For_De", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "REL_FOR_DE", 137, 274, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REL_FOR_DE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Item is relevant for delivery</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>137</ifr:offset1><ifr:offset2>274</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"LFREL_AP\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 12, "REL_FOR_BI", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Rel_For_Bi", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "REL_FOR_BI", 138, 276, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REL_FOR_BI\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Relevant for Billing</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>138</ifr:offset1><ifr:offset2>276</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"FKREL\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 13, "HG_LV_ITEM", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Hg_Lv_Item", java.lang.String.class, null, new java.lang.String[][]{{"pattern", "\\d+"}, {"maxLength", "6"}}, "HG_LV_ITEM", 139, 278, -1, 6, 12, -1, com.sap.mw.jco.JCO.TYPE_NUM, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"HG_LV_ITEM\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Higher-level item in bill of material structures</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>139</ifr:offset1><ifr:offset2>278</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"UEPOS\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>NUMC</ifr:type><ifr:abapType>N</ifr:abapType><ifr:length>6</ifr:length><ifr:internalLength1>6</ifr:internalLength1><ifr:internalLength2>12</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>6</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 14, "ALTERN_ITM", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Altern_Itm", java.lang.String.class, null, new java.lang.String[][]{{"pattern", "\\d+"}, {"maxLength", "6"}}, "ALTERN_ITM", 145, 290, -1, 6, 12, -1, com.sap.mw.jco.JCO.TYPE_NUM, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ALTERN_ITM\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Item for which this item is an alternative</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>145</ifr:offset1><ifr:offset2>290</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"GRPOS\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>NUMC</ifr:type><ifr:abapType>N</ifr:abapType><ifr:length>6</ifr:length><ifr:internalLength1>6</ifr:internalLength1><ifr:internalLength2>12</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>6</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 15, "REA_FOR_RE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Rea_For_Re", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "REA_FOR_RE", 151, 302, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REA_FOR_RE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Reason for rejection of quotations and sales orders</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>151</ifr:offset1><ifr:offset2>302</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ABGRU_VA\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 16, "PROD_HIER", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Prod_Hier", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "18"}}, "PROD_HIER", 153, 306, -1, 18, 36, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PROD_HIER\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Product hierarchy</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>153</ifr:offset1><ifr:offset2>306</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PRODH_D\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>18</ifr:length><ifr:internalLength1>18</ifr:internalLength1><ifr:internalLength2>36</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>18</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 17, "OUT_AGR_TA", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Out_Agr_Ta", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "28"}, {"fractionDigits", "9"}}, "OUT_AGR_TA", 171, 342, -1, 15, 15, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"OUT_AGR_TA\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Currency amount for BAPIS (with 9 decimal places)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>171</ifr:offset1><ifr:offset2>342</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPICUREXT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>28</ifr:length><ifr:internalLength1>15</ifr:internalLength1><ifr:internalLength2>15</ifr:internalLength2><ifr:decimals>9</ifr:decimals><ifr:outputLength>35</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 18, "TARGET_QTY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Target_Qty", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "13"}, {"fractionDigits", "3"}}, "TARGET_QTY", 186, 357, -1, 7, 7, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TARGET_QTY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Target quantity in sales units</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:referenceField>TARGET_QU</ifr:referenceField><ifr:referenceTable>BAPISDIT</ifr:referenceTable><ifr:offset1>186</ifr:offset1><ifr:offset2>357</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"DZMENG\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>QUAN</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>13</ifr:length><ifr:internalLength1>7</ifr:internalLength1><ifr:internalLength2>7</ifr:internalLength2><ifr:decimals>3</ifr:decimals><ifr:outputLength>17</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 19, "TARGET_QU", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Target_Qu", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "TARGET_QU", 193, 364, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TARGET_QU\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Target quantity UoM</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>193</ifr:offset1><ifr:offset2>364</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"DZIEME\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>UNIT</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength><ifr:conversionExit>CUNIT</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 20, "T_UNIT_ISO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "T_Unit_Iso", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "T_UNIT_ISO", 196, 370, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"T_UNIT_ISO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Target quantity unit of measure in ISO code</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>196</ifr:offset1><ifr:offset2>370</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ISO_ZIEME\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 21, "TARG_QTY_N", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Targ_Qty_N", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "5"}, {"fractionDigits", "0"}}, "TARG_QTY_N", 199, 376, -1, 3, 3, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TARG_QTY_N\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Factor for converting sales units to base units (target qty)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>199</ifr:offset1><ifr:offset2>376</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"UMZIZ\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>5</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>3</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>6</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 22, "TARG_QTY_D", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Targ_Qty_D", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "5"}, {"fractionDigits", "0"}}, "TARG_QTY_D", 202, 379, -1, 3, 3, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TARG_QTY_D\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Factor for converting sales units to base units (target qty)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>202</ifr:offset1><ifr:offset2>379</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"UMZIN\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>5</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>3</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>6</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 23, "BASE_UOM", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Base_Uom", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "BASE_UOM", 205, 382, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"BASE_UOM\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Base Unit of Measure</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>205</ifr:offset1><ifr:offset2>382</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MEINS\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>UNIT</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength><ifr:conversionExit>CUNIT</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 24, "T_BAS_UNIT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "T_Bas_Unit", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "T_BAS_UNIT", 208, 388, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"T_BAS_UNIT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Target quantity unit of measure in ISO code</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>208</ifr:offset1><ifr:offset2>388</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ISO_ZIEME\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 25, "SCALE_QUAN", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Scale_Quan", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "13"}, {"fractionDigits", "3"}}, "SCALE_QUAN", 211, 394, -1, 7, 7, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SCALE_QUAN\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Scale quantity in base unit of measure</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:referenceField>BASE_UOM</ifr:referenceField><ifr:referenceTable>BAPISDIT</ifr:referenceTable><ifr:offset1>211</ifr:offset1><ifr:offset2>394</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"SMENG\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>QUAN</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>13</ifr:length><ifr:internalLength1>7</ifr:internalLength1><ifr:internalLength2>7</ifr:internalLength2><ifr:decimals>3</ifr:decimals><ifr:outputLength>17</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 26, "ROUND_DLV", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Round_Dlv", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "13"}, {"fractionDigits", "3"}}, "ROUND_DLV", 218, 401, -1, 7, 7, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ROUND_DLV\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Rounding quantity for delivery</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:referenceField>TARGET_QU</ifr:referenceField><ifr:referenceTable>BAPISDIT</ifr:referenceTable><ifr:offset1>218</ifr:offset1><ifr:offset2>401</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ABLFZ\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>QUAN</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>13</ifr:length><ifr:internalLength1>7</ifr:internalLength1><ifr:internalLength2>7</ifr:internalLength2><ifr:decimals>3</ifr:decimals><ifr:outputLength>15</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 27, "RECON_DATE", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Recon_Date", java.sql.Date.class, null, new java.lang.String[][]{}, "RECON_DATE", 225, 408, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"RECON_DATE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Reconciliation date for agreed cumulative quantity</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>225</ifr:offset1><ifr:offset2>408</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ABDAT\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 28, "MAX_DEVIAT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Max_Deviat", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "13"}, {"fractionDigits", "3"}}, "MAX_DEVIAT", 233, 424, -1, 7, 7, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MAX_DEVIAT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Allowed deviation in quantity (absolute)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:referenceField>TARGET_QU</ifr:referenceField><ifr:referenceTable>BAPISDIT</ifr:referenceTable><ifr:offset1>233</ifr:offset1><ifr:offset2>424</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ABSFZ\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>QUAN</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>13</ifr:length><ifr:internalLength1>7</ifr:internalLength1><ifr:internalLength2>7</ifr:internalLength2><ifr:decimals>3</ifr:decimals><ifr:outputLength>17</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 29, "PO_ITM_NO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Po_Itm_No", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "6"}}, "PO_ITM_NO", 240, 432, -1, 6, 12, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PO_ITM_NO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Item Number of the Underlying Purchase Order</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>240</ifr:offset1><ifr:offset2>432</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"POSEX\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>6</ifr:length><ifr:internalLength1>6</ifr:internalLength1><ifr:internalLength2>12</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>6</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 30, "CUST_MAT22", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cust_Mat22", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "22"}}, "CUST_MAT22", 246, 444, -1, 22, 44, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CUST_MAT22\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Material belonging to the customer</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>246</ifr:offset1><ifr:offset2>444</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KDMAT22\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>22</ifr:length><ifr:internalLength1>22</ifr:internalLength1><ifr:internalLength2>44</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>22</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 31, "MAX_DEV_PE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Max_Dev_Pe", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "3"}, {"fractionDigits", "0"}}, "MAX_DEV_PE", 268, 488, -1, 2, 2, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MAX_DEV_PE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Allowed deviation in quantity (in percent)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>268</ifr:offset1><ifr:offset2>488</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KBVER\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 32, "MAX_DEV_DA", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Max_Dev_Da", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "3"}, {"fractionDigits", "0"}}, "MAX_DEV_DA", 270, 490, -1, 2, 2, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MAX_DEV_DA\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Days by which the quantity can be shifted</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>270</ifr:offset1><ifr:offset2>490</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KEVER\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 33, "REPAIR_PRO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Repair_Pro", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "REPAIR_PRO", 272, 492, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REPAIR_PRO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Repair Processing: Classification of Items</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>272</ifr:offset1><ifr:offset2>492</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VKGRU\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 34, "DLVSCHEDUS", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Dlvschedus", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "DLVSCHEDUS", 275, 498, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DLVSCHEDUS\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Usage indicator</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>275</ifr:offset1><ifr:offset2>498</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ABRVW\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 35, "DLV_GROUP", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Dlv_Group", java.lang.String.class, null, new java.lang.String[][]{{"pattern", "\\d+"}, {"maxLength", "3"}}, "DLV_GROUP", 278, 504, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_NUM, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DLV_GROUP\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Delivery group (items are delivered together)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>278</ifr:offset1><ifr:offset2>504</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"GRKOR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>NUMC</ifr:type><ifr:abapType>N</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 36, "FIXED_QUAN", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Fixed_Quan", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "FIXED_QUAN", 281, 510, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"FIXED_QUAN\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Quantity is Fixed</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>281</ifr:offset1><ifr:offset2>510</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"FMENG\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 37, "DELI_UNLIM", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Deli_Unlim", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "DELI_UNLIM", 282, 512, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DELI_UNLIM\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Unlimited overdelivery allowed</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>282</ifr:offset1><ifr:offset2>512</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"UEBTK_V\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 38, "OVER_DLV_T", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Over_Dlv_T", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "3"}, {"fractionDigits", "1"}}, "OVER_DLV_T", 283, 514, -1, 2, 2, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"OVER_DLV_T\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Overdelivery tolerance limit</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>283</ifr:offset1><ifr:offset2>514</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"UEBTO\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>1</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 39, "UNDER_DLV", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Under_Dlv", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "3"}, {"fractionDigits", "1"}}, "UNDER_DLV", 285, 516, -1, 2, 2, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"UNDER_DLV\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Underdelivery tolerance limit</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>285</ifr:offset1><ifr:offset2>516</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"UNTTO\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>1</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 40, "BILL_BLOCK", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Bill_Block", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "BILL_BLOCK", 287, 518, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"BILL_BLOCK\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Billing block for item</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>287</ifr:offset1><ifr:offset2>518</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"FAKSP_AP\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 41, "REPLACE_PT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Replace_Pt", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "REPLACE_PT", 289, 522, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REPLACE_PT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Replacement part</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>289</ifr:offset1><ifr:offset2>522</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ATPKZ\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 42, "METH_BILL", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Meth_Bill", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "METH_BILL", 290, 524, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"METH_BILL\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Method of billing for CO/PPC orders</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>290</ifr:offset1><ifr:offset2>524</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"RKFKF\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 43, "DIVISION", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Division", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "DIVISION", 291, 526, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DIVISION\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Division</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>291</ifr:offset1><ifr:offset2>526</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"SPART\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 44, "BUS_AREA", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Bus_Area", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "BUS_AREA", 293, 530, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"BUS_AREA\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Business Area</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>293</ifr:offset1><ifr:offset2>530</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"GSBER\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 45, "NET_VALUE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Net_Value", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "28"}, {"fractionDigits", "9"}}, "NET_VALUE", 297, 538, -1, 15, 15, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"NET_VALUE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Currency amount for BAPIS (with 9 decimal places)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>297</ifr:offset1><ifr:offset2>538</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPICUREXT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>28</ifr:length><ifr:internalLength1>15</ifr:internalLength1><ifr:internalLength2>15</ifr:internalLength2><ifr:decimals>9</ifr:decimals><ifr:outputLength>35</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 46, "CURRENCY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Currency", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "5"}}, "CURRENCY", 312, 554, -1, 5, 10, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CURRENCY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">SD document currency</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>312</ifr:offset1><ifr:offset2>554</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"WAERK\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CUKY</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>5</ifr:length><ifr:internalLength1>5</ifr:internalLength1><ifr:internalLength2>10</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>5</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 47, "CURREN_ISO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Curren_Iso", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "CURREN_ISO", 317, 564, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CURREN_ISO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">ISO code currency</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>317</ifr:offset1><ifr:offset2>564</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"WAERS_ISO\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 48, "MAX_PL_DLV", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Max_Pl_Dlv", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "1"}, {"fractionDigits", "0"}}, "MAX_PL_DLV", 320, 570, -1, 1, 1, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MAX_PL_DLV\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Maximum Number of Partial Deliveries Allowed Per Item</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>320</ifr:offset1><ifr:offset2>570</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ANTLF\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>1</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 49, "PART_DLV", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Part_Dlv", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PART_DLV", 321, 572, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PART_DLV\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Partial delivery at item level</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>321</ifr:offset1><ifr:offset2>572</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KZTLF\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 50, "BTCH_SPLIT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Btch_Split", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "BTCH_SPLIT", 322, 574, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"BTCH_SPLIT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Batch split allowed</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>322</ifr:offset1><ifr:offset2>574</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CHSPL\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 51, "REQ_QTY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Req_Qty", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "15"}, {"fractionDigits", "3"}}, "REQ_QTY", 323, 576, -1, 8, 8, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REQ_QTY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Cumulative order quantity in sales units</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:referenceField>SALES_UNIT</ifr:referenceField><ifr:referenceTable>BAPISDIT</ifr:referenceTable><ifr:offset1>323</ifr:offset1><ifr:offset2>576</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KWMENG\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>QUAN</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>15</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>3</ifr:decimals><ifr:outputLength>19</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 52, "CUM_REQ_DE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cum_Req_De", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "15"}, {"fractionDigits", "3"}}, "CUM_REQ_DE", 331, 584, -1, 8, 8, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CUM_REQ_DE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Cumulative required delivery qty (all dlv-relev.sched.lines)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:referenceField>SALES_UNIT</ifr:referenceField><ifr:referenceTable>BAPISDIT</ifr:referenceTable><ifr:offset1>331</ifr:offset1><ifr:offset2>584</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"LSMENG\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>QUAN</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>15</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>3</ifr:decimals><ifr:outputLength>19</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 53, "CUM_CF_QTY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cum_Cf_Qty", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "15"}, {"fractionDigits", "3"}}, "CUM_CF_QTY", 339, 592, -1, 8, 8, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CUM_CF_QTY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Cumulative confirmed quantity in sales unit</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:referenceField>SALES_UNIT</ifr:referenceField><ifr:referenceTable>BAPISDIT</ifr:referenceTable><ifr:offset1>339</ifr:offset1><ifr:offset2>592</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KBMENG\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>QUAN</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>15</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>3</ifr:decimals><ifr:outputLength>19</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 54, "CUM_CON_QU", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cum_Con_Qu", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "15"}, {"fractionDigits", "3"}}, "CUM_CON_QU", 347, 600, -1, 8, 8, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CUM_CON_QU\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Cumulative confirmed quantity in base unit</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:referenceField>BASE_UOM</ifr:referenceField><ifr:referenceTable>BAPISDIT</ifr:referenceTable><ifr:offset1>347</ifr:offset1><ifr:offset2>600</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KLMENG\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>QUAN</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>15</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>3</ifr:decimals><ifr:outputLength>19</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 55, "SALES_UNIT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Sales_Unit", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "SALES_UNIT", 355, 608, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SALES_UNIT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Sales unit</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>355</ifr:offset1><ifr:offset2>608</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VRKME\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>UNIT</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength><ifr:conversionExit>CUNIT</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 56, "ISOCODUNIT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Isocodunit", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "ISOCODUNIT", 358, 614, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ISOCODUNIT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">ISO code for unit of measurement</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>358</ifr:offset1><ifr:offset2>614</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ISOCD_UNIT\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 57, "SALES_QTY1", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Sales_Qty1", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "5"}, {"fractionDigits", "0"}}, "SALES_QTY1", 361, 620, -1, 3, 3, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SALES_QTY1\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Numerator (factor) for conversion of sales quantity into SKU</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>361</ifr:offset1><ifr:offset2>620</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"UMVKZ\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>5</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>3</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>6</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 58, "SALES_QTY2", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Sales_Qty2", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "5"}, {"fractionDigits", "0"}}, "SALES_QTY2", 364, 623, -1, 3, 3, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SALES_QTY2\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Denominator (divisor) for conversion of sales qty. into SKU</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>364</ifr:offset1><ifr:offset2>623</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"UMVKN\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>5</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>3</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>6</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 59, "GROSS_WEIG", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Gross_Weig", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "15"}, {"fractionDigits", "3"}}, "GROSS_WEIG", 367, 626, -1, 8, 8, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"GROSS_WEIG\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Gross Weight of the Item</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:referenceField>UNIT_OF_WT</ifr:referenceField><ifr:referenceTable>BAPISDIT</ifr:referenceTable><ifr:offset1>367</ifr:offset1><ifr:offset2>626</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BRGEW_AP\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>QUAN</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>15</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>3</ifr:decimals><ifr:outputLength>19</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 60, "NET_WEIGHT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Net_Weight", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "15"}, {"fractionDigits", "3"}}, "NET_WEIGHT", 375, 634, -1, 8, 8, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"NET_WEIGHT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Net Weight of the Item</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:referenceField>UNIT_OF_WT</ifr:referenceField><ifr:referenceTable>BAPISDIT</ifr:referenceTable><ifr:offset1>375</ifr:offset1><ifr:offset2>634</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"NTGEW_AP\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>QUAN</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>15</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>3</ifr:decimals><ifr:outputLength>19</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 61, "UNIT_OF_WT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Unit_Of_Wt", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "UNIT_OF_WT", 383, 642, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"UNIT_OF_WT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Weight Unit</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>383</ifr:offset1><ifr:offset2>642</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"GEWEI\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>UNIT</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength><ifr:conversionExit>CUNIT</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 62, "UNIT_WTISO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Unit_Wtiso", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "UNIT_WTISO", 386, 648, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"UNIT_WTISO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Unit of weight in ISO code</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>386</ifr:offset1><ifr:offset2>648</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"GEWEI_ISO\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 63, "VOLUME", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Volume", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "15"}, {"fractionDigits", "3"}}, "VOLUME", 389, 654, -1, 8, 8, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"VOLUME\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Volume of the item</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:referenceField>VOLUMEUNIT</ifr:referenceField><ifr:referenceTable>BAPISDIT</ifr:referenceTable><ifr:offset1>389</ifr:offset1><ifr:offset2>654</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VOLUM_AP\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>QUAN</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>15</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>3</ifr:decimals><ifr:outputLength>19</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 64, "VOLUMEUNIT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Volumeunit", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "VOLUMEUNIT", 397, 662, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"VOLUMEUNIT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Volume unit</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>397</ifr:offset1><ifr:offset2>662</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VOLEH\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>UNIT</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength><ifr:conversionExit>CUNIT</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 65, "VOLUNITISO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Volunitiso", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "VOLUNITISO", 400, 668, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"VOLUNITISO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Volume unit in ISO code</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>400</ifr:offset1><ifr:offset2>668</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VOLEH_ISO\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 66, "CAU_VBELN", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cau_Vbeln", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "CAU_VBELN", 403, 674, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CAU_VBELN\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Originating document</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>403</ifr:offset1><ifr:offset2>674</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VBELV\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 67, "CAU_POSNR", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cau_Posnr", java.lang.String.class, null, new java.lang.String[][]{{"pattern", "\\d+"}, {"maxLength", "6"}}, "CAU_POSNR", 413, 694, -1, 6, 12, -1, com.sap.mw.jco.JCO.TYPE_NUM, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CAU_POSNR\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Originating item</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>413</ifr:offset1><ifr:offset2>694</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"POSNV\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>NUMC</ifr:type><ifr:abapType>N</ifr:abapType><ifr:length>6</ifr:length><ifr:internalLength1>6</ifr:internalLength1><ifr:internalLength2>12</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>6</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 68, "REF_DOC", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ref_Doc", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "REF_DOC", 419, 706, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REF_DOC\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Document number of the reference document</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>419</ifr:offset1><ifr:offset2>706</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VGBEL\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 69, "POSNR_VOR", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Posnr_Vor", java.lang.String.class, null, new java.lang.String[][]{{"pattern", "\\d+"}, {"maxLength", "6"}}, "POSNR_VOR", 429, 726, -1, 6, 12, -1, com.sap.mw.jco.JCO.TYPE_NUM, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"POSNR_VOR\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Item number of the reference item</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>429</ifr:offset1><ifr:offset2>726</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VGPOS\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>NUMC</ifr:type><ifr:abapType>N</ifr:abapType><ifr:length>6</ifr:length><ifr:internalLength1>6</ifr:internalLength1><ifr:internalLength2>12</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>6</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 70, "OBJ_COPY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Obj_Copy", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "OBJ_COPY", 435, 738, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"OBJ_COPY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Complete reference indicator</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>435</ifr:offset1><ifr:offset2>738</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VOREF\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 71, "UPDAT_FLAG", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Updat_Flag", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "UPDAT_FLAG", 436, 740, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"UPDAT_FLAG\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Update indicator for sales document document flow</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>436</ifr:offset1><ifr:offset2>740</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"UPFLV\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 72, "END_RULE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "End_Rule", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "END_RULE", 437, 742, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"END_RULE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Completion rule for quotation / contract</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>437</ifr:offset1><ifr:offset2>742</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ERLRE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 73, "DLV_PRIO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Dlv_Prio", java.lang.String.class, null, new java.lang.String[][]{{"pattern", "\\d+"}, {"maxLength", "2"}}, "DLV_PRIO", 438, 744, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_NUM, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DLV_PRIO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Delivery Priority</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>438</ifr:offset1><ifr:offset2>744</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"LPRIO\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>NUMC</ifr:type><ifr:abapType>N</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 74, "PLANT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Plant", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "PLANT", 440, 748, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PLANT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Plant</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>440</ifr:offset1><ifr:offset2>748</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"WERKS_D\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 75, "STGE_LOC", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Stge_Loc", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "STGE_LOC", 444, 756, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"STGE_LOC\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Storage Location</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>444</ifr:offset1><ifr:offset2>756</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"LGORT_D\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 76, "SHIP_POINT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ship_Point", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "SHIP_POINT", 448, 764, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SHIP_POINT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Shipping Point/Receiving Point</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>448</ifr:offset1><ifr:offset2>764</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VSTEL\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 77, "ROUTE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Route", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "6"}}, "ROUTE", 452, 772, -1, 6, 12, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ROUTE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Route</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>452</ifr:offset1><ifr:offset2>772</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ROUTE\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>6</ifr:length><ifr:internalLength1>6</ifr:internalLength1><ifr:internalLength2>12</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>6</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 78, "KEY_ST", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Key_St", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "KEY_ST", 458, 784, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"KEY_ST\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Origin of the bill of material</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>458</ifr:offset1><ifr:offset2>784</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"STKEY\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 79, "DATE_ST", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Date_St", java.sql.Date.class, null, new java.lang.String[][]{}, "DATE_ST", 459, 786, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DATE_ST\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Key date of the bill of material</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>459</ifr:offset1><ifr:offset2>786</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"STDAT\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 80, "NBR_ST", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Nbr_St", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "8"}}, "NBR_ST", 467, 802, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"NBR_ST\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Bill of material</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>467</ifr:offset1><ifr:offset2>802</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"STNUM\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>8</ifr:outputLength><ifr:conversionExit>NUMCV</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 81, "STPOS_VBAP", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Stpos_Vbap", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "5"}, {"fractionDigits", "0"}}, "STPOS_VBAP", 475, 818, -1, 3, 3, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"STPOS_VBAP\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Bill of material item number VBAP not used</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>475</ifr:offset1><ifr:offset2>818</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"STPOS_VBAP\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>5</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>3</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 82, "ORDER_PROB", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Order_Prob", java.lang.String.class, null, new java.lang.String[][]{{"pattern", "\\d+"}, {"maxLength", "3"}}, "ORDER_PROB", 478, 822, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_NUM, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ORDER_PROB\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Order probability of the item</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>478</ifr:offset1><ifr:offset2>822</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AWAHR\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>NUMC</ifr:type><ifr:abapType>N</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 83, "CREAT_DATE", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Creat_Date", java.sql.Date.class, null, new java.lang.String[][]{}, "CREAT_DATE", 481, 828, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CREAT_DATE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Date on which the record was created</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>481</ifr:offset1><ifr:offset2>828</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ERDAT\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 84, "CREATED_BY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Created_By", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "12"}}, "CREATED_BY", 489, 844, -1, 12, 24, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CREATED_BY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Name of Person who Created the Object</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>489</ifr:offset1><ifr:offset2>844</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ERNAM\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>12</ifr:length><ifr:internalLength1>12</ifr:internalLength1><ifr:internalLength2>24</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>12</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 85, "REC_TIME", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:time", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Rec_Time", java.sql.Time.class, null, new java.lang.String[][]{}, "REC_TIME", 501, 868, -1, 6, 12, -1, com.sap.mw.jco.JCO.TYPE_TIME, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REC_TIME\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Entry time</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>501</ifr:offset1><ifr:offset2>868</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ERZET\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>TIMS</ifr:type><ifr:abapType>T</ifr:abapType><ifr:length>6</ifr:length><ifr:internalLength1>6</ifr:internalLength1><ifr:internalLength2>12</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>8</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 86, "TAX_CLASS1", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Tax_Class1", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "TAX_CLASS1", 507, 880, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TAX_CLASS1\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Tax classification material</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>507</ifr:offset1><ifr:offset2>880</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"TAXMT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 87, "TAX_CLASS2", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Tax_Class2", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "TAX_CLASS2", 508, 882, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TAX_CLASS2\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Tax classification material</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>508</ifr:offset1><ifr:offset2>882</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"TAXMT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 88, "TAX_CLASS3", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Tax_Class3", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "TAX_CLASS3", 509, 884, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TAX_CLASS3\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Tax classification material</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>509</ifr:offset1><ifr:offset2>884</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"TAXMT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 89, "TAX_CLASS4", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Tax_Class4", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "TAX_CLASS4", 510, 886, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TAX_CLASS4\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Tax classification material</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>510</ifr:offset1><ifr:offset2>886</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"TAXMT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 90, "TAX_CLASS5", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Tax_Class5", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "TAX_CLASS5", 511, 888, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TAX_CLASS5\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Tax classification material</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>511</ifr:offset1><ifr:offset2>888</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"TAXMT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 91, "TAX_CLASS6", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Tax_Class6", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "TAX_CLASS6", 512, 890, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TAX_CLASS6\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Tax classification material</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>512</ifr:offset1><ifr:offset2>890</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"TAXMT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 92, "TAX_CLASS7", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Tax_Class7", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "TAX_CLASS7", 513, 892, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TAX_CLASS7\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Tax classification material</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>513</ifr:offset1><ifr:offset2>892</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"TAXMT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 93, "TAX_CLASS8", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Tax_Class8", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "TAX_CLASS8", 514, 894, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TAX_CLASS8\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Tax classification material</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>514</ifr:offset1><ifr:offset2>894</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"TAXMT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 94, "TAX_CLASS9", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Tax_Class9", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "TAX_CLASS9", 515, 896, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TAX_CLASS9\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Tax classification material</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>515</ifr:offset1><ifr:offset2>896</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"TAXMT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 95, "FIX_SP_DAY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Fix_Sp_Day", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "5"}, {"fractionDigits", "2"}}, "FIX_SP_DAY", 516, 898, -1, 3, 3, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"FIX_SP_DAY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Fixed shipping processing time in days (= setup time)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>516</ifr:offset1><ifr:offset2>898</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VBEAF\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>5</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>3</ifr:internalLength2><ifr:decimals>2</ifr:decimals><ifr:outputLength>6</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 96, "VAR_SP_DAY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Var_Sp_Day", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "5"}, {"fractionDigits", "2"}}, "VAR_SP_DAY", 519, 901, -1, 3, 3, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"VAR_SP_DAY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Variable shipping processing time in days</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>519</ifr:offset1><ifr:offset2>901</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VBEAV\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>5</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>3</ifr:internalLength2><ifr:decimals>2</ifr:decimals><ifr:outputLength>6</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 97, "PREC_DOC", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Prec_Doc", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PREC_DOC", 522, 904, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PREC_DOC\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Preceding document has resulted from reference</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>522</ifr:offset1><ifr:offset2>904</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VGREF\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 98, "NET_PRICE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Net_Price", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "28"}, {"fractionDigits", "9"}}, "NET_PRICE", 523, 906, -1, 15, 15, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"NET_PRICE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Currency amount for BAPIS (with 9 decimal places)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>523</ifr:offset1><ifr:offset2>906</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPICUREXT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>28</ifr:length><ifr:internalLength1>15</ifr:internalLength1><ifr:internalLength2>15</ifr:internalLength2><ifr:decimals>9</ifr:decimals><ifr:outputLength>35</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 99, "COND_P_UNT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cond_P_Unt", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "5"}, {"fractionDigits", "0"}}, "COND_P_UNT", 538, 921, -1, 3, 3, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"COND_P_UNT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Condition pricing unit</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>538</ifr:offset1><ifr:offset2>921</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KPEIN\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>5</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>3</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>5</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 100, "COND_UNIT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cond_Unit", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "COND_UNIT", 541, 924, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"COND_UNIT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Condition unit</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>541</ifr:offset1><ifr:offset2>924</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KMEIN\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>UNIT</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength><ifr:conversionExit>CUNIT</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 101, "CONISOUNIT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Conisounit", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "CONISOUNIT", 544, 930, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CONISOUNIT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Target quantity unit of measure in ISO code</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>544</ifr:offset1><ifr:offset2>930</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ISO_ZIEME\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 102, "RETOURE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Retoure", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "RETOURE", 547, 936, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"RETOURE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Returns item</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>547</ifr:offset1><ifr:offset2>936</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"SHKZG_VA\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 103, "CASH_DISC", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cash_Disc", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "CASH_DISC", 548, 938, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CASH_DISC\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Cash discount indicator</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>548</ifr:offset1><ifr:offset2>938</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"SKTOF\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 104, "AVAILCHECK", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Availcheck", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "AVAILCHECK", 549, 940, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"AVAILCHECK\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Checking Group for Availability Check</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>549</ifr:offset1><ifr:offset2>940</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MTVFP\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 105, "SUM_REQUIR", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Sum_Requir", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "SUM_REQUIR", 551, 944, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SUM_REQUIR\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Summing up of requirements</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>551</ifr:offset1><ifr:offset2>944</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"SUMBD\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 106, "MAT_PR_GRP", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Mat_Pr_Grp", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "MAT_PR_GRP", 552, 946, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MAT_PR_GRP\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Material Pricing Group</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>552</ifr:offset1><ifr:offset2>946</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KONDM\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 107, "ACCT_ASSGT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Acct_Assgt", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "ACCT_ASSGT", 554, 950, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ACCT_ASSGT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Account assignment group for this material</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>554</ifr:offset1><ifr:offset2>950</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KTGRM\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 108, "REBATE_GRP", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Rebate_Grp", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "REBATE_GRP", 556, 954, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REBATE_GRP\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Volume rebate group</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>556</ifr:offset1><ifr:offset2>954</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BONUS\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 109, "COMM_GROUP", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Comm_Group", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "COMM_GROUP", 558, 958, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"COMM_GROUP\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Commission group</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>558</ifr:offset1><ifr:offset2>958</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PROVG\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 110, "EUR_ART_NR", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Eur_Art_Nr", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "13"}}, "EUR_ART_NR", 560, 962, -1, 13, 26, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"EUR_ART_NR\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">European Article Number (EAN) - obsolete!!!!!</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>560</ifr:offset1><ifr:offset2>962</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"EANNR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>13</ifr:length><ifr:internalLength1>13</ifr:internalLength1><ifr:internalLength2>26</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>13</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 111, "PRICE_OK", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Price_Ok", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PRICE_OK", 573, 988, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PRICE_OK\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Pricing is OK</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>573</ifr:offset1><ifr:offset2>988</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PRSOK\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 112, "VAL_TYPE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Val_Type", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "VAL_TYPE", 574, 990, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"VAL_TYPE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Valuation Type</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>574</ifr:offset1><ifr:offset2>990</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BWTAR_D\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 113, "SEP_VALUAT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Sep_Valuat", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "SEP_VALUAT", 584, 1010, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SEP_VALUAT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Indicator: Separate valuation</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>584</ifr:offset1><ifr:offset2>1010</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BWTEX\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 114, "BATCH_MGMT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Batch_Mgmt", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "BATCH_MGMT", 585, 1012, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"BATCH_MGMT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Batch management requirement indicator</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>585</ifr:offset1><ifr:offset2>1012</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"XCHPF\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 115, "IND_BTCH", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ind_Btch", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "IND_BTCH", 586, 1014, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"IND_BTCH\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Batch management indicator (internal)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>586</ifr:offset1><ifr:offset2>1014</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"XCHAR\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 116, "MIN_DELY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Min_Dely", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "13"}, {"fractionDigits", "3"}}, "MIN_DELY", 587, 1016, -1, 7, 7, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MIN_DELY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Minimum delivery quantity in delivery note processing</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:referenceField>BASE_UOM</ifr:referenceField><ifr:referenceTable>BAPISDIT</ifr:referenceTable><ifr:offset1>587</ifr:offset1><ifr:offset2>1016</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MINLF\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>QUAN</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>13</ifr:length><ifr:internalLength1>7</ifr:internalLength1><ifr:internalLength2>7</ifr:internalLength2><ifr:decimals>3</ifr:decimals><ifr:outputLength>17</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 117, "UPDATE_GRP", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Update_Grp", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "6"}}, "UPDATE_GRP", 594, 1024, -1, 6, 12, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"UPDATE_GRP\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Update group for statistics update</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>594</ifr:offset1><ifr:offset2>1024</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"STAFO\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>6</ifr:length><ifr:internalLength1>6</ifr:internalLength1><ifr:internalLength2>12</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>6</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 118, "COST_DOC_C", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cost_Doc_C", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "28"}, {"fractionDigits", "9"}}, "COST_DOC_C", 600, 1036, -1, 15, 15, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"COST_DOC_C\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Currency amount for BAPIS (with 9 decimal places)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>600</ifr:offset1><ifr:offset2>1036</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPICUREXT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>28</ifr:length><ifr:internalLength1>15</ifr:internalLength1><ifr:internalLength2>15</ifr:internalLength2><ifr:decimals>9</ifr:decimals><ifr:outputLength>35</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 119, "SUBTOT_PP1", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Subtot_Pp1", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "28"}, {"fractionDigits", "9"}}, "SUBTOT_PP1", 615, 1051, -1, 15, 15, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SUBTOT_PP1\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Currency amount for BAPIS (with 9 decimal places)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>615</ifr:offset1><ifr:offset2>1051</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPICUREXT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>28</ifr:length><ifr:internalLength1>15</ifr:internalLength1><ifr:internalLength2>15</ifr:internalLength2><ifr:decimals>9</ifr:decimals><ifr:outputLength>35</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 120, "SUBTOT_PP2", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Subtot_Pp2", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "28"}, {"fractionDigits", "9"}}, "SUBTOT_PP2", 630, 1066, -1, 15, 15, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SUBTOT_PP2\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Currency amount for BAPIS (with 9 decimal places)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>630</ifr:offset1><ifr:offset2>1066</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPICUREXT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>28</ifr:length><ifr:internalLength1>15</ifr:internalLength1><ifr:internalLength2>15</ifr:internalLength2><ifr:decimals>9</ifr:decimals><ifr:outputLength>35</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 121, "SUBTOT_PP3", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Subtot_Pp3", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "28"}, {"fractionDigits", "9"}}, "SUBTOT_PP3", 645, 1081, -1, 15, 15, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SUBTOT_PP3\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Currency amount for BAPIS (with 9 decimal places)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>645</ifr:offset1><ifr:offset2>1081</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPICUREXT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>28</ifr:length><ifr:internalLength1>15</ifr:internalLength1><ifr:internalLength2>15</ifr:internalLength2><ifr:decimals>9</ifr:decimals><ifr:outputLength>35</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 122, "SUBTOT_PP4", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Subtot_Pp4", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "28"}, {"fractionDigits", "9"}}, "SUBTOT_PP4", 660, 1096, -1, 15, 15, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SUBTOT_PP4\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Currency amount for BAPIS (with 9 decimal places)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>660</ifr:offset1><ifr:offset2>1096</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPICUREXT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>28</ifr:length><ifr:internalLength1>15</ifr:internalLength1><ifr:internalLength2>15</ifr:internalLength2><ifr:decimals>9</ifr:decimals><ifr:outputLength>35</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 123, "SUBTOT_PP5", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Subtot_Pp5", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "28"}, {"fractionDigits", "9"}}, "SUBTOT_PP5", 675, 1111, -1, 15, 15, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SUBTOT_PP5\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Currency amount for BAPIS (with 9 decimal places)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>675</ifr:offset1><ifr:offset2>1111</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPICUREXT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>28</ifr:length><ifr:internalLength1>15</ifr:internalLength1><ifr:internalLength2>15</ifr:internalLength2><ifr:decimals>9</ifr:decimals><ifr:outputLength>35</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 124, "SUBTOT_PP6", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Subtot_Pp6", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "28"}, {"fractionDigits", "9"}}, "SUBTOT_PP6", 690, 1126, -1, 15, 15, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SUBTOT_PP6\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Currency amount for BAPIS (with 9 decimal places)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>690</ifr:offset1><ifr:offset2>1126</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPICUREXT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>28</ifr:length><ifr:internalLength1>15</ifr:internalLength1><ifr:internalLength2>15</ifr:internalLength2><ifr:decimals>9</ifr:decimals><ifr:outputLength>35</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 125, "EXCH_RATE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Exch_Rate", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "9"}, {"fractionDigits", "5"}}, "EXCH_RATE", 705, 1141, -1, 5, 5, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"EXCH_RATE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Directly quoted exchange rate for statistics</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>705</ifr:offset1><ifr:offset2>1141</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"STCUR_P\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>9</ifr:length><ifr:internalLength1>5</ifr:internalLength1><ifr:internalLength2>5</ifr:internalLength2><ifr:decimals>5</ifr:decimals><ifr:outputLength>12</ifr:outputLength><ifr:conversionExit>EXCRT</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 126, "CH_ON", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ch_On", java.sql.Date.class, null, new java.lang.String[][]{}, "CH_ON", 710, 1146, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CH_ON\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Date of Last Change</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>710</ifr:offset1><ifr:offset2>1146</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AEDAT\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 127, "EAN_UPC", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ean_Upc", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "18"}}, "EAN_UPC", 718, 1162, -1, 18, 36, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"EAN_UPC\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">International Article Number (EAN/UPC)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>718</ifr:offset1><ifr:offset2>1162</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"EAN11\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>18</ifr:length><ifr:internalLength1>18</ifr:internalLength1><ifr:internalLength2>36</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>18</ifr:outputLength><ifr:conversionExit>EAN11</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 128, "FIX_DATE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Fix_Date", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "FIX_DATE", 736, 1198, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"FIX_DATE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Delivery date and quantity fixed</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>736</ifr:offset1><ifr:offset2>1198</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"FIXMG\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 129, "PROFIT_CTR", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Profit_Ctr", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "PROFIT_CTR", 737, 1200, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PROFIT_CTR\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Profit Center</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>737</ifr:offset1><ifr:offset2>1200</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PRCTR\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 130, "PRC_GROUP1", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Prc_Group1", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "PRC_GROUP1", 747, 1220, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PRC_GROUP1\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Returns Disposition</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>747</ifr:offset1><ifr:offset2>1220</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MVGR1\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 131, "PRC_GROUP2", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Prc_Group2", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "PRC_GROUP2", 750, 1226, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PRC_GROUP2\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Carton Rounding</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>750</ifr:offset1><ifr:offset2>1226</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MVGR2\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 132, "PRC_GROUP3", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Prc_Group3", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "PRC_GROUP3", 753, 1232, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PRC_GROUP3\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Material Status</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>753</ifr:offset1><ifr:offset2>1232</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MVGR3\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 133, "PRC_GROUP4", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Prc_Group4", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "PRC_GROUP4", 756, 1238, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PRC_GROUP4\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">E Goods Indicator</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>756</ifr:offset1><ifr:offset2>1238</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MVGR4\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 134, "PRC_GROUP5", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Prc_Group5", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "PRC_GROUP5", 759, 1244, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PRC_GROUP5\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Royalty Relevance</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>759</ifr:offset1><ifr:offset2>1244</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MVGR5\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 135, "COMPON_QTY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Compon_Qty", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "13"}, {"fractionDigits", "3"}}, "COMPON_QTY", 762, 1250, -1, 7, 7, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"COMPON_QTY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Component quantity</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:referenceField>BASE_UOM</ifr:referenceField><ifr:referenceTable>BAPISDIT</ifr:referenceTable><ifr:offset1>762</ifr:offset1><ifr:offset2>1250</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KMPMG\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>true</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>QUAN</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>13</ifr:length><ifr:internalLength1>7</ifr:internalLength1><ifr:internalLength2>7</ifr:internalLength2><ifr:decimals>3</ifr:decimals><ifr:outputLength>18</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 136, "SUBSTREASO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Substreaso", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "SUBSTREASO", 769, 1258, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SUBSTREASO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Reason for material substitution</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>769</ifr:offset1><ifr:offset2>1258</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"SUGRD\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 137, "SPEC_STOCK", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Spec_Stock", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "SPEC_STOCK", 773, 1266, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SPEC_STOCK\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Special Stock Indicator</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>773</ifr:offset1><ifr:offset2>1266</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"SOBKZ\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 138, "ALLOC_INDI", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Alloc_Indi", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "ALLOC_INDI", 774, 1268, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ALLOC_INDI\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Allocation Indicator</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>774</ifr:offset1><ifr:offset2>1268</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VPZUO\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 139, "PROFIT_SEG", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Profit_Seg", java.lang.String.class, null, new java.lang.String[][]{{"pattern", "\\d+"}, {"maxLength", "10"}}, "PROFIT_SEG", 775, 1270, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_NUM, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PROFIT_SEG\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Profitability Segment Number (CO-PA)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>775</ifr:offset1><ifr:offset2>1270</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"RKEOBJNR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>NUMC</ifr:type><ifr:abapType>N</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 140, "WBS_ELEM", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Wbs_Elem", java.lang.String.class, null, new java.lang.String[][]{{"pattern", "\\d+"}, {"maxLength", "8"}}, "WBS_ELEM", 785, 1290, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_NUM, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"WBS_ELEM\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Work Breakdown Structure Element (WBS Element)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>785</ifr:offset1><ifr:offset2>1290</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PS_PSP_PNR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>NUMC</ifr:type><ifr:abapType>N</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>24</ifr:outputLength><ifr:conversionExit>ABPSP</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 141, "ORDERID", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Orderid", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "12"}}, "ORDERID", 793, 1306, -1, 12, 24, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ORDERID\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Order Number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>793</ifr:offset1><ifr:offset2>1306</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AUFNR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>12</ifr:length><ifr:internalLength1>12</ifr:internalLength1><ifr:internalLength2>24</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>12</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 142, "PLNG_MATL", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Plng_Matl", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "18"}}, "PLNG_MATL", 805, 1330, -1, 18, 36, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PLNG_MATL\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Planning material</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>805</ifr:offset1><ifr:offset2>1330</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VPMAT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>18</ifr:length><ifr:internalLength1>18</ifr:internalLength1><ifr:internalLength2>36</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>18</ifr:outputLength><ifr:conversionExit>MATN1</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 143, "PLNG_PLANT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Plng_Plant", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "PLNG_PLANT", 823, 1366, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PLNG_PLANT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Planning plant</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>823</ifr:offset1><ifr:offset2>1366</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VPWRK\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 144, "BASE_UNIT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Base_Unit", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "BASE_UNIT", 827, 1374, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"BASE_UNIT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Base unit of measure for product group</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>827</ifr:offset1><ifr:offset2>1374</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PRBME\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>UNIT</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength><ifr:conversionExit>CUNIT</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 145, "ISOBASUNIT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Isobasunit", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "ISOBASUNIT", 830, 1380, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ISOBASUNIT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Target quantity unit of measure in ISO code</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>830</ifr:offset1><ifr:offset2>1380</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ISO_ZIEME\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 146, "CONV_FACT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:double", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Conv_Fact", java.lang.Double.class, null, new java.lang.String[][]{}, "CONV_FACT", 840, 1392, -1, 8, 8, -1, com.sap.mw.jco.JCO.TYPE_FLOAT, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CONV_FACT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Conversion factor: quantities</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>840</ifr:offset1><ifr:offset2>1392</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"UMREFF\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>true</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>FLTP</ifr:type><ifr:abapType>F</ifr:abapType><ifr:length>16</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>16</ifr:decimals><ifr:outputLength>22</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 147, "ACCTASSCAT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Acctasscat", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "ACCTASSCAT", 848, 1400, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ACCTASSCAT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Account assignment category</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>848</ifr:offset1><ifr:offset2>1400</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KNTTP\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 148, "CONSUMPT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Consumpt", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "CONSUMPT", 849, 1402, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CONSUMPT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Consumption posting</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>849</ifr:offset1><ifr:offset2>1402</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KZVBR\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 149, "BOMEXPLNO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Bomexplno", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "8"}}, "BOMEXPLNO", 850, 1404, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"BOMEXPLNO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">BOM explosion number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>850</ifr:offset1><ifr:offset2>1404</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"SERNR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>8</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 150, "OBJ_NR_IT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Obj_Nr_It", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "22"}}, "OBJ_NR_IT", 858, 1420, -1, 22, 44, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"OBJ_NR_IT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Object number at item level</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>858</ifr:offset1><ifr:offset2>1420</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"OBJPO\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>22</ifr:length><ifr:internalLength1>22</ifr:internalLength1><ifr:internalLength2>44</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>22</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 151, "RES_ANAL", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Res_Anal", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "6"}}, "RES_ANAL", 880, 1464, -1, 6, 12, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"RES_ANAL\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Results Analysis Key</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>880</ifr:offset1><ifr:offset2>1464</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ABGR_SCHL\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>6</ifr:length><ifr:internalLength1>6</ifr:internalLength1><ifr:internalLength2>12</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>6</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 152, "REQMTSTYP", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Reqmtstyp", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "REQMTSTYP", 886, 1476, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REQMTSTYP\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Requirements type</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>886</ifr:offset1><ifr:offset2>1476</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BEDAE\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 153, "CREDPRICIT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Credpricit", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "28"}, {"fractionDigits", "9"}}, "CREDPRICIT", 890, 1484, -1, 15, 15, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CREDPRICIT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Currency amount for BAPIS (with 9 decimal places)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>890</ifr:offset1><ifr:offset2>1484</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPICUREXT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>28</ifr:length><ifr:internalLength1>15</ifr:internalLength1><ifr:internalLength2>15</ifr:internalLength2><ifr:decimals>9</ifr:decimals><ifr:outputLength>35</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 154, "PARTRELID", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Partrelid", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PARTRELID", 905, 1500, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PARTRELID\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">ID for partial release of order item, credit block</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>905</ifr:offset1><ifr:offset2>1500</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CMTFG\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 155, "ACTCREDID", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Actcredid", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "ACTCREDID", 906, 1502, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ACTCREDID\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">ID: Item with active credit function / relevant for credit</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>906</ifr:offset1><ifr:offset2>1502</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CMPNT\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 156, "CR_EXCHRAT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cr_Exchrat", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "9"}, {"fractionDigits", "5"}}, "CR_EXCHRAT", 907, 1504, -1, 5, 5, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CR_EXCHRAT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Directly quoted exch. rate for credit data on req. dely date</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>907</ifr:offset1><ifr:offset2>1504</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CMKUA_P\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>9</ifr:length><ifr:internalLength1>5</ifr:internalLength1><ifr:internalLength2>5</ifr:internalLength2><ifr:decimals>5</ifr:decimals><ifr:outputLength>12</ifr:outputLength><ifr:conversionExit>EXCRT</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 157, "CONFIG", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Config", java.lang.String.class, null, new java.lang.String[][]{{"pattern", "\\d+"}, {"maxLength", "18"}}, "CONFIG", 912, 1510, -1, 18, 36, -1, com.sap.mw.jco.JCO.TYPE_NUM, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CONFIG\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Configuration</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>912</ifr:offset1><ifr:offset2>1510</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CUOBJ_VA\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>NUMC</ifr:type><ifr:abapType>N</ifr:abapType><ifr:length>18</ifr:length><ifr:internalLength1>18</ifr:internalLength1><ifr:internalLength2>36</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>18</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 158, "CHCLASS_IN", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Chclass_In", java.lang.String.class, null, new java.lang.String[][]{{"pattern", "\\d+"}, {"maxLength", "18"}}, "CHCLASS_IN", 930, 1546, -1, 18, 36, -1, com.sap.mw.jco.JCO.TYPE_NUM, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CHCLASS_IN\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Internal object number of the batch classification</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>930</ifr:offset1><ifr:offset2>1546</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CUOBJ_CH\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>NUMC</ifr:type><ifr:abapType>N</ifr:abapType><ifr:length>18</ifr:length><ifr:internalLength1>18</ifr:internalLength1><ifr:internalLength2>36</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>18</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 159, "STAT_PRICE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Stat_Price", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "STAT_PRICE", 948, 1582, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"STAT_PRICE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Status expected price</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>948</ifr:offset1><ifr:offset2>1582</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CEPOK\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 160, "COND_UPDAT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cond_Updat", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "COND_UPDAT", 949, 1584, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"COND_UPDAT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Condition update</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>949</ifr:offset1><ifr:offset2>1584</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KOUPD\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 161, "SERNO_PROF", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Serno_Prof", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "SERNO_PROF", 950, 1586, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SERNO_PROF\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Serial Number Profile</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>950</ifr:offset1><ifr:offset2>1586</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"SERAIL\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 162, "NO_OF_SERI", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:int", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "No_Of_Seri", java.lang.Integer.class, null, new java.lang.String[][]{}, "NO_OF_SERI", 956, 1596, -1, 4, 4, -1, com.sap.mw.jco.JCO.TYPE_INT, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"NO_OF_SERI\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Number of serial numbers</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>956</ifr:offset1><ifr:offset2>1596</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ANZSN\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>true</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>INT4</ifr:type><ifr:abapType>I</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 163, "NOGRPOSTED", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Nogrposted", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "NOGRPOSTED", 960, 1600, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"NOGRPOSTED\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Customer has not posted goods receipt</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>960</ifr:offset1><ifr:offset2>1600</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"NACHL\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 164, "MAT_GRP_SM", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Mat_Grp_Sm", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "MAT_GRP_SM", 961, 1602, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MAT_GRP_SM\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Material Group: Packaging Materials</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>961</ifr:offset1><ifr:offset2>1602</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MAGRV\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 165, "MAN_PR_CH", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Man_Pr_Ch", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "MAN_PR_CH", 965, 1610, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MAN_PR_CH\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Status manual price change</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>965</ifr:offset1><ifr:offset2>1610</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MPROK\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 166, "DOC_CAT_SD", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Doc_Cat_Sd", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "DOC_CAT_SD", 966, 1612, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DOC_CAT_SD\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Document category of preceding SD document</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>966</ifr:offset1><ifr:offset2>1612</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VBTYP_V\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 167, "MATDETERID", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Matdeterid", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "MATDETERID", 967, 1614, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MATDETERID\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">ID for material determination</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>967</ifr:offset1><ifr:offset2>1614</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PROSA\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 168, "ITUSAGEID", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Itusageid", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "ITUSAGEID", 968, 1616, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ITUSAGEID\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">ID for higher-level item usage</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>968</ifr:offset1><ifr:offset2>1616</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"UEPVW\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 169, "COSTESTNR", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Costestnr", java.lang.String.class, null, new java.lang.String[][]{{"pattern", "\\d+"}, {"maxLength", "12"}}, "COSTESTNR", 969, 1618, -1, 12, 24, -1, com.sap.mw.jco.JCO.TYPE_NUM, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"COSTESTNR\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Cost Estimate Number for Cost Est. w/o Qty Structure</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>969</ifr:offset1><ifr:offset2>1618</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CK_KALNR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>NUMC</ifr:type><ifr:abapType>N</ifr:abapType><ifr:length>12</ifr:length><ifr:internalLength1>12</ifr:internalLength1><ifr:internalLength2>24</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>12</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 170, "CSTG_VRNT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cstg_Vrnt", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "CSTG_VRNT", 981, 1642, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CSTG_VRNT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Costing Variant</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>981</ifr:offset1><ifr:offset2>1642</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CK_KLVAR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 171, "BOMITEMNR", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Bomitemnr", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "BOMITEMNR", 985, 1650, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"BOMITEMNR\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">BOM Item Number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>985</ifr:offset1><ifr:offset2>1650</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"SPOSN\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength><ifr:conversionExit>NUMCV</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 172, "STAT_VAL", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Stat_Val", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "STAT_VAL", 989, 1658, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"STAT_VAL\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Statistical values</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>989</ifr:offset1><ifr:offset2>1658</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KOWRR\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 173, "STAT_DATE", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Stat_Date", java.sql.Date.class, null, new java.lang.String[][]{}, "STAT_DATE", 990, 1660, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"STAT_DATE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Statistics date</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>990</ifr:offset1><ifr:offset2>1660</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"STADAT\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 174, "BUS_TRANST", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Bus_Transt", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "BUS_TRANST", 998, 1676, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"BUS_TRANST\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Business Transaction Type for Foreign Trade</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>998</ifr:offset1><ifr:offset2>1676</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"EXART\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 175, "PREF_INDIC", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Pref_Indic", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PREF_INDIC", 1000, 1680, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PREF_INDIC\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Preference indicator in export/import</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>1000</ifr:offset1><ifr:offset2>1680</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PREFE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 176, "NRCONDREC", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Nrcondrec", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "NRCONDREC", 1001, 1682, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"NRCONDREC\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Number of condition record from batch determination</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1001</ifr:offset1><ifr:offset2>1682</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KNUMH_CH\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 177, "INTCLASSNR", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Intclassnr", java.lang.String.class, null, new java.lang.String[][]{{"pattern", "\\d+"}, {"maxLength", "10"}}, "INTCLASSNR", 1011, 1702, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_NUM, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"INTCLASSNR\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Internal Class Number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1011</ifr:offset1><ifr:offset2>1702</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CLINT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>NUMC</ifr:type><ifr:abapType>N</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 178, "BATCH_EXIT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Batch_Exit", java.lang.String.class, null, new java.lang.String[][]{{"pattern", "\\d+"}, {"maxLength", "3"}}, "BATCH_EXIT", 1021, 1722, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_NUM, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"BATCH_EXIT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Batches: Exit to quantity proposal</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1021</ifr:offset1><ifr:offset2>1722</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CHMVS\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>NUMC</ifr:type><ifr:abapType>N</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 179, "BOM_CATEGO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Bom_Catego", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "BOM_CATEGO", 1024, 1728, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"BOM_CATEGO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">BOM category</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>1024</ifr:offset1><ifr:offset2>1728</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"STLTY\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 180, "BOM_IT_NR", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Bom_It_Nr", java.lang.String.class, null, new java.lang.String[][]{{"pattern", "\\d+"}, {"maxLength", "8"}}, "BOM_IT_NR", 1025, 1730, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_NUM, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"BOM_IT_NR\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">BOM item node number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1025</ifr:offset1><ifr:offset2>1730</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"STLKN\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>NUMC</ifr:type><ifr:abapType>N</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>8</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 181, "COUNTER", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Counter", java.lang.String.class, null, new java.lang.String[][]{{"pattern", "\\d+"}, {"maxLength", "8"}}, "COUNTER", 1033, 1746, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_NUM, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"COUNTER\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Internal counter</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1033</ifr:offset1><ifr:offset2>1746</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CIM_COUNT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>NUMC</ifr:type><ifr:abapType>N</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>8</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 182, "INCONSCONF", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Inconsconf", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "INCONSCONF", 1041, 1762, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"INCONSCONF\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Inconsistent configuration</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>1041</ifr:offset1><ifr:offset2>1762</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CUINK\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 183, "OVERH_KEY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Overh_Key", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "6"}}, "OVERH_KEY", 1042, 1764, -1, 6, 12, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"OVERH_KEY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Overhead key</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1042</ifr:offset1><ifr:offset2>1764</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AUFZSCHL\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>6</ifr:length><ifr:internalLength1>6</ifr:internalLength1><ifr:internalLength2>12</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>6</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 184, "CSTG_SHEET", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cstg_Sheet", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "6"}}, "CSTG_SHEET", 1048, 1776, -1, 6, 12, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CSTG_SHEET\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Costing Sheet</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1048</ifr:offset1><ifr:offset2>1776</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AUFKALSM\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>6</ifr:length><ifr:internalLength1>6</ifr:internalLength1><ifr:internalLength2>12</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>6</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 185, "CSTG_VRNT1", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cstg_Vrnt1", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "CSTG_VRNT1", 1054, 1788, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CSTG_VRNT1\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Costing Variant</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1054</ifr:offset1><ifr:offset2>1788</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CK_KLVAR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 186, "PROD_ALLOC", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Prod_Alloc", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "18"}}, "PROD_ALLOC", 1058, 1796, -1, 18, 36, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PROD_ALLOC\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Product allocation determination procedure</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1058</ifr:offset1><ifr:offset2>1796</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KOSCH\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>18</ifr:length><ifr:internalLength1>18</ifr:internalLength1><ifr:internalLength2>36</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>18</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 187, "PRICE_REF", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Price_Ref", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "18"}}, "PRICE_REF", 1076, 1832, -1, 18, 36, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PRICE_REF\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Pricing reference material of main item</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1076</ifr:offset1><ifr:offset2>1832</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"UPMAT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>18</ifr:length><ifr:internalLength1>18</ifr:internalLength1><ifr:internalLength2>36</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>18</ifr:outputLength><ifr:conversionExit>MATN1</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 188, "MATPRICGRP", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Matpricgrp", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "MATPRICGRP", 1094, 1868, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MATPRICGRP\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Material pricing group of main item</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1094</ifr:offset1><ifr:offset2>1868</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"UKONM\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 189, "MATFRGTGRP", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Matfrgtgrp", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "8"}}, "MATFRGTGRP", 1096, 1872, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MATFRGTGRP\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Material freight group</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1096</ifr:offset1><ifr:offset2>1872</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MFRGR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>8</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 190, "PLANDLVSCH", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Plandlvsch", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "PLANDLVSCH", 1104, 1888, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PLANDLVSCH\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Planning delivery schedule instruction</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1104</ifr:offset1><ifr:offset2>1888</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PLAVO\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 191, "SEQUENCENO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Sequenceno", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "35"}}, "SEQUENCENO", 1108, 1896, -1, 35, 70, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SEQUENCENO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">KANBAN/sequence number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1108</ifr:offset1><ifr:offset2>1896</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KANNR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>35</ifr:length><ifr:internalLength1>35</ifr:internalLength1><ifr:internalLength2>70</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>35</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 192, "CREDPRIC", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:double", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Credpric", java.lang.Double.class, null, new java.lang.String[][]{}, "CREDPRIC", 1144, 1968, -1, 8, 8, -1, com.sap.mw.jco.JCO.TYPE_FLOAT, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CREDPRIC\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Item credit price</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1144</ifr:offset1><ifr:offset2>1968</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CMPRE_FLT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>true</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>FLTP</ifr:type><ifr:abapType>F</ifr:abapType><ifr:length>16</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>16</ifr:decimals><ifr:outputLength>22</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 193, "PAY_GUARAN", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Pay_Guaran", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "PAY_GUARAN", 1152, 1976, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PAY_GUARAN\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Form of payment guarantee</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1152</ifr:offset1><ifr:offset2>1976</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ABSFORM_CM\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 194, "GURANTEED", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:double", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Guranteed", java.lang.Double.class, null, new java.lang.String[][]{}, "GURANTEED", 1160, 1984, -1, 8, 8, -1, com.sap.mw.jco.JCO.TYPE_FLOAT, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"GURANTEED\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Guaranteed (factor between 0 and 1)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1160</ifr:offset1><ifr:offset2>1984</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ABGES_CM\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>true</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>FLTP</ifr:type><ifr:abapType>F</ifr:abapType><ifr:length>16</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>16</ifr:decimals><ifr:outputLength>22</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 195, "CFOP_CODE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cfop_Code", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "5"}}, "CFOP_CODE", 1168, 1992, -1, 5, 10, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CFOP_CODE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">CFOP code and extension (old 5 char version)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1168</ifr:offset1><ifr:offset2>1992</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"J_1BCFOP_OLD\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>5</ifr:length><ifr:internalLength1>5</ifr:internalLength1><ifr:internalLength2>10</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>5</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 196, "TAXLAWICMS", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Taxlawicms", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "TAXLAWICMS", 1173, 2002, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TAXLAWICMS\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Tax law: ICMS</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1173</ifr:offset1><ifr:offset2>2002</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"J_1BTAXLW1\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 197, "TAXLAWIPI", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Taxlawipi", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "TAXLAWIPI", 1176, 2008, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TAXLAWIPI\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Tax law: IPI</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1176</ifr:offset1><ifr:offset2>2008</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"J_1BTAXLW2\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 198, "SD_TAXCODE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Sd_Taxcode", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "SD_TAXCODE", 1179, 2014, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SD_TAXCODE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">SD tax code</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1179</ifr:offset1><ifr:offset2>2014</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"J_1BTXSDC_\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 199, "VALCONTRNR", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Valcontrnr", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "VALCONTRNR", 1181, 2018, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"VALCONTRNR\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Value contract no.</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1181</ifr:offset1><ifr:offset2>2018</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"WKTNR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 200, "VALCONTRIT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Valcontrit", java.lang.String.class, null, new java.lang.String[][]{{"pattern", "\\d+"}, {"maxLength", "6"}}, "VALCONTRIT", 1191, 2038, -1, 6, 12, -1, com.sap.mw.jco.JCO.TYPE_NUM, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"VALCONTRIT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Value contract item</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1191</ifr:offset1><ifr:offset2>2038</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"WKTPS\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>NUMC</ifr:type><ifr:abapType>N</ifr:abapType><ifr:length>6</ifr:length><ifr:internalLength1>6</ifr:internalLength1><ifr:internalLength2>12</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>6</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 201, "ASSORT_MOD", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Assort_Mod", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "18"}}, "ASSORT_MOD", 1197, 2050, -1, 18, 36, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ASSORT_MOD\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Assortment module</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1197</ifr:offset1><ifr:offset2>2050</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"W_SORTK\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>18</ifr:length><ifr:internalLength1>18</ifr:internalLength1><ifr:internalLength2>36</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>18</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 202, "VALSPECSTO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Valspecsto", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "VALSPECSTO", 1215, 2086, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"VALSPECSTO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Valuation of Special Stock</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>1215</ifr:offset1><ifr:offset2>2086</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KZBWS\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 203, "MATGRHIE1", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Matgrhie1", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "18"}}, "MATGRHIE1", 1216, 2088, -1, 18, 36, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MATGRHIE1\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Material group hierarchy 1</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1216</ifr:offset1><ifr:offset2>2088</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"WGRU_HIE1\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>18</ifr:length><ifr:internalLength1>18</ifr:internalLength1><ifr:internalLength2>36</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>18</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 204, "MATGRHIE2", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Matgrhie2", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "18"}}, "MATGRHIE2", 1234, 2124, -1, 18, 36, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MATGRHIE2\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Material group hierarchy 2</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1234</ifr:offset1><ifr:offset2>2124</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"WGRU_HIE2\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>18</ifr:length><ifr:internalLength1>18</ifr:internalLength1><ifr:internalLength2>36</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>18</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 205, "PROMOTION", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Promotion", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "PROMOTION", 1252, 2160, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PROMOTION\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Promotion</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>1252</ifr:offset1><ifr:offset2>2160</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KNUMA_PI\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 206, "SALES_DEAL", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Sales_Deal", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "SALES_DEAL", 1262, 2180, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SALES_DEAL\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Sales deal</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>1262</ifr:offset1><ifr:offset2>2180</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KNUMA_AG\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 207, "FLGLEADUNI", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Flgleaduni", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "FLGLEADUNI", 1272, 2200, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"FLGLEADUNI\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">ID: Leading unit of measure for completing a transaction</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>1272</ifr:offset1><ifr:offset2>2200</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KZFME\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 208, "FREE_GOODS", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Free_Goods", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "FREE_GOODS", 1273, 2202, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"FREE_GOODS\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Free goods delivery control</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>1273</ifr:offset1><ifr:offset2>2202</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"LSTANR\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 209, "VALID_OBJ", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Valid_Obj", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "12"}}, "VALID_OBJ", 1274, 2204, -1, 12, 24, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"VALID_OBJ\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Parameter Variant/Standard Variant</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1274</ifr:offset1><ifr:offset2>2204</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"TECHS\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>12</ifr:length><ifr:internalLength1>12</ifr:internalLength1><ifr:internalLength2>24</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>12</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 210, "TAX_AMOUNT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Tax_Amount", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "28"}, {"fractionDigits", "9"}}, "TAX_AMOUNT", 1286, 2228, -1, 15, 15, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TAX_AMOUNT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Currency amount for BAPIS (with 9 decimal places)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1286</ifr:offset1><ifr:offset2>2228</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPICUREXT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>28</ifr:length><ifr:internalLength1>15</ifr:internalLength1><ifr:internalLength2>15</ifr:internalLength2><ifr:decimals>9</ifr:decimals><ifr:outputLength>35</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 211, "MRP_AREA", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Mrp_Area", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "MRP_AREA", 1301, 2244, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MRP_AREA\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">MRP area</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1301</ifr:offset1><ifr:offset2>2244</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BERID\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 212, "CUST_MAT35", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cust_Mat35", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "35"}}, "CUST_MAT35", 1311, 2264, -1, 35, 70, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CUST_MAT35\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Material belonging to the customer</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1311</ifr:offset1><ifr:offset2>2264</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KDMAT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>35</ifr:length><ifr:internalLength1>35</ifr:internalLength1><ifr:internalLength2>70</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>35</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 213, "CR_EXCHRAT_V", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cr_Exchrat_V", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "9"}, {"fractionDigits", "5"}}, "CR_EXCHRAT_V", 1346, 2334, -1, 5, 5, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CR_EXCHRAT_V\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Indirectly quoted exch.rate for credit data on req.dely date</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1346</ifr:offset1><ifr:offset2>2334</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CMKUA_V\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>9</ifr:length><ifr:internalLength1>5</ifr:internalLength1><ifr:internalLength2>5</ifr:internalLength2><ifr:decimals>5</ifr:decimals><ifr:outputLength>12</ifr:outputLength><ifr:conversionExit>EXCRT</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 214, "EXCHRATEST_V", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Exchratest_V", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "9"}, {"fractionDigits", "5"}}, "EXCHRATEST_V", 1351, 2339, -1, 5, 5, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"EXCHRATEST_V\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Indirectly quoted exchange rate for statistics</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1351</ifr:offset1><ifr:offset2>2339</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"STCUR_V\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>9</ifr:length><ifr:internalLength1>5</ifr:internalLength1><ifr:internalLength2>5</ifr:internalLength2><ifr:decimals>5</ifr:decimals><ifr:outputLength>12</ifr:outputLength><ifr:conversionExit>EXCRT</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 215, "ITM_TYPE_USAGE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Itm_Type_Usage", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "ITM_TYPE_USAGE", 1356, 2344, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ITM_TYPE_USAGE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Item usage</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1356</ifr:offset1><ifr:offset2>2344</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VWPOS\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 216, "CFOP_LONG", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cfop_Long", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "CFOP_LONG", 1360, 2352, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CFOP_LONG\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">CFOP code and extension</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1360</ifr:offset1><ifr:offset2>2352</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"J_1BCFOP_LONG\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 217, "GROSS_VAL", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Gross_Val", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "28"}, {"fractionDigits", "9"}}, "GROSS_VAL", 1370, 2372, -1, 15, 15, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"GROSS_VAL\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Currency amount for BAPIS (with 9 decimal places)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1370</ifr:offset1><ifr:offset2>2372</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPICUREXT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>28</ifr:length><ifr:internalLength1>15</ifr:internalLength1><ifr:internalLength2>15</ifr:internalLength2><ifr:decimals>9</ifr:decimals><ifr:outputLength>35</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 218, "LOG_SYSTEM_OWN", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Log_System_Own", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "LOG_SYSTEM_OWN", 1385, 2388, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"LOG_SYSTEM_OWN\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Logical System</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1385</ifr:offset1><ifr:offset2>2388</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"LOGSYS\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        staticDescriptor = descriptor;
    }
    public  BapisditType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    protected  BapisditType (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    
    public void setChclass_In(java.lang.String Chclass_In) {
        baseTypeData().setElementValue(158, Chclass_In);
    }

    
    public java.lang.String getBase_Uom() {
        return (java.lang.String)baseTypeData().getElementValueAsString(23);
    }

    
    public java.lang.String getItem_Type() {
        return (java.lang.String)baseTypeData().getElementValueAsString(10);
    }

    
    public void setConsumpt(java.lang.String Consumpt) {
        baseTypeData().setElementValue(148, Consumpt);
    }

    
    public void setPrc_Group2(java.lang.String Prc_Group2) {
        baseTypeData().setElementValue(131, Prc_Group2);
    }

    
    public void setInd_Btch(java.lang.String Ind_Btch) {
        baseTypeData().setElementValue(115, Ind_Btch);
    }

    
    public void setProd_Alloc(java.lang.String Prod_Alloc) {
        baseTypeData().setElementValue(186, Prod_Alloc);
    }

    
    public java.lang.String getMatfrgtgrp() {
        return (java.lang.String)baseTypeData().getElementValueAsString(189);
    }

    
    public java.lang.String getTax_Class5() {
        return (java.lang.String)baseTypeData().getElementValueAsString(90);
    }

    
    public void setT_Unit_Iso(java.lang.String T_Unit_Iso) {
        baseTypeData().setElementValue(20, T_Unit_Iso);
    }

    
    public java.math.BigDecimal getTarg_Qty_N() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(21);
    }

    
    public void setBill_Block(java.lang.String Bill_Block) {
        baseTypeData().setElementValue(40, Bill_Block);
    }

    
    public java.lang.String getDlv_Prio() {
        return (java.lang.String)baseTypeData().getElementValueAsString(73);
    }

    
    public java.lang.String getRef_Doc() {
        return (java.lang.String)baseTypeData().getElementValueAsString(68);
    }

    
    public void setAcct_Assgt(java.lang.String Acct_Assgt) {
        baseTypeData().setElementValue(107, Acct_Assgt);
    }

    
    public java.lang.String getIntclassnr() {
        return (java.lang.String)baseTypeData().getElementValueAsString(177);
    }

    
    public void setTax_Class4(java.lang.String Tax_Class4) {
        baseTypeData().setElementValue(89, Tax_Class4);
    }

    
    public java.lang.String getReqmtstyp() {
        return (java.lang.String)baseTypeData().getElementValueAsString(152);
    }

    
    public void setItusageid(java.lang.String Itusageid) {
        baseTypeData().setElementValue(168, Itusageid);
    }

    
    public java.lang.String getTax_Class4() {
        return (java.lang.String)baseTypeData().getElementValueAsString(89);
    }

    
    public java.lang.String getSales_Deal() {
        return (java.lang.String)baseTypeData().getElementValueAsString(206);
    }

    
    public java.lang.String getMat_Pr_Grp() {
        return (java.lang.String)baseTypeData().getElementValueAsString(106);
    }

    
    public void setMax_Pl_Dlv(java.math.BigDecimal Max_Pl_Dlv) {
        baseTypeData().setElementValue(48, Max_Pl_Dlv);
    }

    
    public void setAvailcheck(java.lang.String Availcheck) {
        baseTypeData().setElementValue(104, Availcheck);
    }

    
    public java.lang.String getPrice_Ok() {
        return (java.lang.String)baseTypeData().getElementValueAsString(111);
    }

    
    public void setDoc_Number(java.lang.String Doc_Number) {
        baseTypeData().setElementValue(1, Doc_Number);
    }

    
    public void setBatch(java.lang.String Batch) {
        baseTypeData().setElementValue(6, Batch);
    }

    
    public void setValcontrnr(java.lang.String Valcontrnr) {
        baseTypeData().setElementValue(199, Valcontrnr);
    }

    
    public void setDlv_Prio(java.lang.String Dlv_Prio) {
        baseTypeData().setElementValue(73, Dlv_Prio);
    }

    
    public java.lang.String getMrp_Area() {
        return (java.lang.String)baseTypeData().getElementValueAsString(211);
    }

    
    public java.lang.String getSubstreaso() {
        return (java.lang.String)baseTypeData().getElementValueAsString(136);
    }

    
    public java.math.BigDecimal getCum_Req_De() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(52);
    }

    
    public void setUnit_Of_Wt(java.lang.String Unit_Of_Wt) {
        baseTypeData().setElementValue(61, Unit_Of_Wt);
    }

    
    public void setPartrelid(java.lang.String Partrelid) {
        baseTypeData().setElementValue(154, Partrelid);
    }

    
    public java.sql.Date getCh_On() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(126);
    }

    
    public java.lang.String getBomitemnr() {
        return (java.lang.String)baseTypeData().getElementValueAsString(171);
    }

    
    public void setMrp_Area(java.lang.String Mrp_Area) {
        baseTypeData().setElementValue(211, Mrp_Area);
    }

    
    public java.lang.String getComm_Group() {
        return (java.lang.String)baseTypeData().getElementValueAsString(109);
    }

    
    public java.lang.String getRel_For_Bi() {
        return (java.lang.String)baseTypeData().getElementValueAsString(12);
    }

    
    public java.lang.String getTax_Class7() {
        return (java.lang.String)baseTypeData().getElementValueAsString(92);
    }

    
    public java.lang.String getStat_Val() {
        return (java.lang.String)baseTypeData().getElementValueAsString(172);
    }

    
    public void setNet_Weight(java.math.BigDecimal Net_Weight) {
        baseTypeData().setElementValue(60, Net_Weight);
    }

    
    public void setItm_Type_Usage(java.lang.String Itm_Type_Usage) {
        baseTypeData().setElementValue(215, Itm_Type_Usage);
    }

    
    public void setCompon_Qty(java.math.BigDecimal Compon_Qty) {
        baseTypeData().setElementValue(135, Compon_Qty);
    }

    
    public void setCredpricit(java.math.BigDecimal Credpricit) {
        baseTypeData().setElementValue(153, Credpricit);
    }

    
    public void setCr_Exchrat_V(java.math.BigDecimal Cr_Exchrat_V) {
        baseTypeData().setElementValue(213, Cr_Exchrat_V);
    }

    
    public java.lang.String getCash_Disc() {
        return (java.lang.String)baseTypeData().getElementValueAsString(103);
    }

    
    public java.lang.String getItusageid() {
        return (java.lang.String)baseTypeData().getElementValueAsString(168);
    }

    
    public void setValid_Obj(java.lang.String Valid_Obj) {
        baseTypeData().setElementValue(209, Valid_Obj);
    }

    
    public void setSales_Qty1(java.math.BigDecimal Sales_Qty1) {
        baseTypeData().setElementValue(57, Sales_Qty1);
    }

    
    public void setConv_Fact(double Conv_Fact) {
        baseTypeData().setElementValue(146, Conv_Fact);
    }

    
    public java.lang.String getTax_Class6() {
        return (java.lang.String)baseTypeData().getElementValueAsString(91);
    }

    
    public void setEnd_Rule(java.lang.String End_Rule) {
        baseTypeData().setElementValue(72, End_Rule);
    }

    
    public java.lang.String getBatch_Exit() {
        return (java.lang.String)baseTypeData().getElementValueAsString(178);
    }

    
    public void setBatch_Exit(java.lang.String Batch_Exit) {
        baseTypeData().setElementValue(178, Batch_Exit);
    }

    
    public java.lang.String getCstg_Sheet() {
        return (java.lang.String)baseTypeData().getElementValueAsString(184);
    }

    
    public java.math.BigDecimal getCr_Exchrat() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(156);
    }

    
    public void setPart_Dlv(java.lang.String Part_Dlv) {
        baseTypeData().setElementValue(49, Part_Dlv);
    }

    
    public java.lang.String getNbr_St() {
        return (java.lang.String)baseTypeData().getElementValueAsString(80);
    }

    
    public void setVolumeunit(java.lang.String Volumeunit) {
        baseTypeData().setElementValue(64, Volumeunit);
    }

    
    public java.lang.String getTax_Class9() {
        return (java.lang.String)baseTypeData().getElementValueAsString(94);
    }

    
    public void setStat_Price(java.lang.String Stat_Price) {
        baseTypeData().setElementValue(159, Stat_Price);
    }

    
    public void setCstg_Sheet(java.lang.String Cstg_Sheet) {
        baseTypeData().setElementValue(184, Cstg_Sheet);
    }

    
    public void setFix_Sp_Day(java.math.BigDecimal Fix_Sp_Day) {
        baseTypeData().setElementValue(95, Fix_Sp_Day);
    }

    
    public void setRebate_Grp(java.lang.String Rebate_Grp) {
        baseTypeData().setElementValue(108, Rebate_Grp);
    }

    
    public java.lang.String getMaterial() {
        return (java.lang.String)baseTypeData().getElementValueAsString(3);
    }

    
    public java.math.BigDecimal getMax_Pl_Dlv() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(48);
    }

    
    public void setMin_Dely(java.math.BigDecimal Min_Dely) {
        baseTypeData().setElementValue(116, Min_Dely);
    }

    
    public void setItem_Type(java.lang.String Item_Type) {
        baseTypeData().setElementValue(10, Item_Type);
    }

    
    public java.lang.String getFlgleaduni() {
        return (java.lang.String)baseTypeData().getElementValueAsString(207);
    }

    
    public void setCredpric(double Credpric) {
        baseTypeData().setElementValue(192, Credpric);
    }

    
    public void setItm_Number(java.lang.String Itm_Number) {
        baseTypeData().setElementValue(2, Itm_Number);
    }

    
    public void setRetoure(java.lang.String Retoure) {
        baseTypeData().setElementValue(102, Retoure);
    }

    
    public void setNbr_St(java.lang.String Nbr_St) {
        baseTypeData().setElementValue(80, Nbr_St);
    }

    
    public void setDate_St(java.sql.Date Date_St) {
        baseTypeData().setElementValue(79, Date_St);
    }

    
    public java.lang.String getPlant() {
        return (java.lang.String)baseTypeData().getElementValueAsString(74);
    }

    
    public void setBomexplno(java.lang.String Bomexplno) {
        baseTypeData().setElementValue(149, Bomexplno);
    }

    
    public java.math.BigDecimal getFix_Sp_Day() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(95);
    }

    
    public void setMaterial(java.lang.String Material) {
        baseTypeData().setElementValue(3, Material);
    }

    
    public java.lang.String getShort_Text() {
        return (java.lang.String)baseTypeData().getElementValueAsString(8);
    }

    
    public void setItem_Categ(java.lang.String Item_Categ) {
        baseTypeData().setElementValue(9, Item_Categ);
    }

    
    public java.math.BigDecimal getRound_Dlv() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(26);
    }

    
    public java.math.BigDecimal getNet_Price() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(98);
    }

    
    public java.lang.String getTax_Class8() {
        return (java.lang.String)baseTypeData().getElementValueAsString(93);
    }

    
    public void setRecon_Date(java.sql.Date Recon_Date) {
        baseTypeData().setElementValue(27, Recon_Date);
    }

    
    public java.lang.String getOrderid() {
        return (java.lang.String)baseTypeData().getElementValueAsString(141);
    }

    
    public void setPrc_Group1(java.lang.String Prc_Group1) {
        baseTypeData().setElementValue(130, Prc_Group1);
    }

    
    public java.lang.String getMatl_Group() {
        return (java.lang.String)baseTypeData().getElementValueAsString(7);
    }

    
    public void setObj_Copy(java.lang.String Obj_Copy) {
        baseTypeData().setElementValue(70, Obj_Copy);
    }

    
    public java.math.BigDecimal getUnder_Dlv() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(39);
    }

    
    public void setStat_Val(java.lang.String Stat_Val) {
        baseTypeData().setElementValue(172, Stat_Val);
    }

    
    public void setCh_On(java.sql.Date Ch_On) {
        baseTypeData().setElementValue(126, Ch_On);
    }

    
    public void setTax_Class9(java.lang.String Tax_Class9) {
        baseTypeData().setElementValue(94, Tax_Class9);
    }

    
    public void setSales_Unit(java.lang.String Sales_Unit) {
        baseTypeData().setElementValue(55, Sales_Unit);
    }

    
    public void setTaxlawicms(java.lang.String Taxlawicms) {
        baseTypeData().setElementValue(196, Taxlawicms);
    }

    
    public java.lang.String getAssort_Mod() {
        return (java.lang.String)baseTypeData().getElementValueAsString(201);
    }

    
    public void setScale_Quan(java.math.BigDecimal Scale_Quan) {
        baseTypeData().setElementValue(25, Scale_Quan);
    }

    
    public java.math.BigDecimal getCum_Con_Qu() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(54);
    }

    
    public java.lang.String getNogrposted() {
        return (java.lang.String)baseTypeData().getElementValueAsString(163);
    }

    
    public void setStat_Date(java.sql.Date Stat_Date) {
        baseTypeData().setElementValue(173, Stat_Date);
    }

    
    public java.lang.String getValid_Obj() {
        return (java.lang.String)baseTypeData().getElementValueAsString(209);
    }

    
    public java.lang.String getWbs_Elem() {
        return (java.lang.String)baseTypeData().getElementValueAsString(140);
    }

    
    public void setNogrposted(java.lang.String Nogrposted) {
        baseTypeData().setElementValue(163, Nogrposted);
    }

    
    public void setDivision(java.lang.String Division) {
        baseTypeData().setElementValue(43, Division);
    }

    
    public void setCond_Unit(java.lang.String Cond_Unit) {
        baseTypeData().setElementValue(100, Cond_Unit);
    }

    
    public void setCau_Posnr(java.lang.String Cau_Posnr) {
        baseTypeData().setElementValue(67, Cau_Posnr);
    }

    
    public void setComm_Group(java.lang.String Comm_Group) {
        baseTypeData().setElementValue(109, Comm_Group);
    }

    
    public void setCounter(java.lang.String Counter) {
        baseTypeData().setElementValue(181, Counter);
    }

    
    public void setCreated_By(java.lang.String Created_By) {
        baseTypeData().setElementValue(84, Created_By);
    }

    
    public void setTax_Class5(java.lang.String Tax_Class5) {
        baseTypeData().setElementValue(90, Tax_Class5);
    }

    
    public void setRea_For_Re(java.lang.String Rea_For_Re) {
        baseTypeData().setElementValue(15, Rea_For_Re);
    }

    
    public void setAcctasscat(java.lang.String Acctasscat) {
        baseTypeData().setElementValue(147, Acctasscat);
    }

    
    public java.lang.String getEnd_Rule() {
        return (java.lang.String)baseTypeData().getElementValueAsString(72);
    }

    
    public java.lang.String getVolumeunit() {
        return (java.lang.String)baseTypeData().getElementValueAsString(64);
    }

    
    public java.lang.String getRel_For_De() {
        return (java.lang.String)baseTypeData().getElementValueAsString(11);
    }

    
    public void setTarget_Qu(java.lang.String Target_Qu) {
        baseTypeData().setElementValue(19, Target_Qu);
    }

    
    public java.lang.String getAlloc_Indi() {
        return (java.lang.String)baseTypeData().getElementValueAsString(138);
    }

    
    public java.lang.String getDivision() {
        return (java.lang.String)baseTypeData().getElementValueAsString(43);
    }

    
    public void setPlant(java.lang.String Plant) {
        baseTypeData().setElementValue(74, Plant);
    }

    
    public void setSubtot_Pp4(java.math.BigDecimal Subtot_Pp4) {
        baseTypeData().setElementValue(122, Subtot_Pp4);
    }

    
    public java.lang.String getTaxlawicms() {
        return (java.lang.String)baseTypeData().getElementValueAsString(196);
    }

    
    public void setConfig(java.lang.String Config) {
        baseTypeData().setElementValue(157, Config);
    }

    
    public void setSubtot_Pp6(java.math.BigDecimal Subtot_Pp6) {
        baseTypeData().setElementValue(124, Subtot_Pp6);
    }

    
    public void setExch_Rate(java.math.BigDecimal Exch_Rate) {
        baseTypeData().setElementValue(125, Exch_Rate);
    }

    
    public void setBtch_Split(java.lang.String Btch_Split) {
        baseTypeData().setElementValue(50, Btch_Split);
    }

    
    public java.math.BigDecimal getMax_Deviat() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(28);
    }

    
    public void setReplace_Pt(java.lang.String Replace_Pt) {
        baseTypeData().setElementValue(41, Replace_Pt);
    }

    
    public void setRepair_Pro(java.lang.String Repair_Pro) {
        baseTypeData().setElementValue(33, Repair_Pro);
    }

    
    public java.lang.String getMeth_Bill() {
        return (java.lang.String)baseTypeData().getElementValueAsString(42);
    }

    
    public void setBus_Transt(java.lang.String Bus_Transt) {
        baseTypeData().setElementValue(174, Bus_Transt);
    }

    
    public java.lang.String getRoute() {
        return (java.lang.String)baseTypeData().getElementValueAsString(77);
    }

    
    public java.math.BigDecimal getScale_Quan() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(25);
    }

    
    public void setRel_For_De(java.lang.String Rel_For_De) {
        baseTypeData().setElementValue(11, Rel_For_De);
    }

    
    public void setCfop_Code(java.lang.String Cfop_Code) {
        baseTypeData().setElementValue(195, Cfop_Code);
    }

    
    public java.lang.String getDeli_Unlim() {
        return (java.lang.String)baseTypeData().getElementValueAsString(37);
    }

    
    public void setSequenceno(java.lang.String Sequenceno) {
        baseTypeData().setElementValue(191, Sequenceno);
    }

    
    public double getGuranteed() {
        return baseTypeData().getElementValueAsDouble(194);
    }

    
    public void setUpdate_Grp(java.lang.String Update_Grp) {
        baseTypeData().setElementValue(117, Update_Grp);
    }

    
    public java.lang.String getCurrency() {
        return (java.lang.String)baseTypeData().getElementValueAsString(46);
    }

    
    public void setBatch_Mgmt(java.lang.String Batch_Mgmt) {
        baseTypeData().setElementValue(114, Batch_Mgmt);
    }

    
    public void setProfit_Ctr(java.lang.String Profit_Ctr) {
        baseTypeData().setElementValue(129, Profit_Ctr);
    }

    
    public java.lang.String getDoc_Cat_Sd() {
        return (java.lang.String)baseTypeData().getElementValueAsString(166);
    }

    
    public java.lang.String getPosnr_Vor() {
        return (java.lang.String)baseTypeData().getElementValueAsString(69);
    }

    
    public java.lang.String getUpdate_Grp() {
        return (java.lang.String)baseTypeData().getElementValueAsString(117);
    }

    
    public void setTax_Class3(java.lang.String Tax_Class3) {
        baseTypeData().setElementValue(88, Tax_Class3);
    }

    
    public java.lang.String getValcontrit() {
        return (java.lang.String)baseTypeData().getElementValueAsString(200);
    }

    
    public void setBus_Area(java.lang.String Bus_Area) {
        baseTypeData().setElementValue(44, Bus_Area);
    }

    
    public java.lang.String getProfit_Ctr() {
        return (java.lang.String)baseTypeData().getElementValueAsString(129);
    }

    
    public void setObj_Nr_It(java.lang.String Obj_Nr_It) {
        baseTypeData().setElementValue(150, Obj_Nr_It);
    }

    
    public java.math.BigDecimal getStpos_Vbap() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(81);
    }

    
    public void setIsobasunit(java.lang.String Isobasunit) {
        baseTypeData().setElementValue(145, Isobasunit);
    }

    
    public java.math.BigDecimal getCost_Doc_C() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(118);
    }

    
    public void setOrder_Prob(java.lang.String Order_Prob) {
        baseTypeData().setElementValue(82, Order_Prob);
    }

    
    public java.math.BigDecimal getTarget_Qty() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(18);
    }

    
    public java.math.BigDecimal getTax_Amount() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(210);
    }

    
    public java.lang.String getBatch() {
        return (java.lang.String)baseTypeData().getElementValueAsString(6);
    }

    
    public void setRes_Anal(java.lang.String Res_Anal) {
        baseTypeData().setElementValue(151, Res_Anal);
    }

    
    public java.lang.String getMat_Grp_Sm() {
        return (java.lang.String)baseTypeData().getElementValueAsString(164);
    }

    
    public java.lang.String getPrc_Group1() {
        return (java.lang.String)baseTypeData().getElementValueAsString(130);
    }

    
    public java.lang.String getPrc_Group5() {
        return (java.lang.String)baseTypeData().getElementValueAsString(134);
    }

    
    public java.lang.String getAcctasscat() {
        return (java.lang.String)baseTypeData().getElementValueAsString(147);
    }

    
    public java.lang.String getMatgrhie2() {
        return (java.lang.String)baseTypeData().getElementValueAsString(204);
    }

    
    public void setUnit_Wtiso(java.lang.String Unit_Wtiso) {
        baseTypeData().setElementValue(62, Unit_Wtiso);
    }

    
    public java.lang.String getItm_Type_Usage() {
        return (java.lang.String)baseTypeData().getElementValueAsString(215);
    }

    
    public java.math.BigDecimal getExchratest_V() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(214);
    }

    
    public java.math.BigDecimal getSales_Qty1() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(57);
    }

    
    public java.math.BigDecimal getMax_Dev_Da() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(32);
    }

    
    public void setValspecsto(java.lang.String Valspecsto) {
        baseTypeData().setElementValue(202, Valspecsto);
    }

    
    public java.lang.String getUnit_Of_Wt() {
        return (java.lang.String)baseTypeData().getElementValueAsString(61);
    }

    
    public java.lang.String getActcredid() {
        return (java.lang.String)baseTypeData().getElementValueAsString(155);
    }

    
    public java.lang.String getPrc_Group4() {
        return (java.lang.String)baseTypeData().getElementValueAsString(133);
    }

    
    public java.lang.String getPart_Dlv() {
        return (java.lang.String)baseTypeData().getElementValueAsString(49);
    }

    
    public java.lang.String getBase_Unit() {
        return (java.lang.String)baseTypeData().getElementValueAsString(144);
    }

    
    public void setRec_Time(java.sql.Time Rec_Time) {
        baseTypeData().setElementValue(85, Rec_Time);
    }

    
    public void setAlloc_Indi(java.lang.String Alloc_Indi) {
        baseTypeData().setElementValue(138, Alloc_Indi);
    }

    
    public java.lang.String getShip_Point() {
        return (java.lang.String)baseTypeData().getElementValueAsString(76);
    }

    
    public void setNrcondrec(java.lang.String Nrcondrec) {
        baseTypeData().setElementValue(176, Nrcondrec);
    }

    
    public java.lang.String getVolunitiso() {
        return (java.lang.String)baseTypeData().getElementValueAsString(65);
    }

    
    public java.lang.String getLog_System_Own() {
        return (java.lang.String)baseTypeData().getElementValueAsString(218);
    }

    
    public java.math.BigDecimal getSales_Qty2() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(58);
    }

    
    public java.math.BigDecimal getNet_Value() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(45);
    }

    
    public java.lang.String getPrc_Group3() {
        return (java.lang.String)baseTypeData().getElementValueAsString(132);
    }

    
    public java.lang.String getPr_Ref_Mat() {
        return (java.lang.String)baseTypeData().getElementValueAsString(5);
    }

    
    public java.sql.Date getCreat_Date() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(83);
    }

    
    public java.lang.String getObj_Copy() {
        return (java.lang.String)baseTypeData().getElementValueAsString(70);
    }

    
    public void setFixed_Quan(java.lang.String Fixed_Quan) {
        baseTypeData().setElementValue(36, Fixed_Quan);
    }

    
    public void setBom_Catego(java.lang.String Bom_Catego) {
        baseTypeData().setElementValue(179, Bom_Catego);
    }

    
    public java.lang.String getEan_Upc() {
        return (java.lang.String)baseTypeData().getElementValueAsString(127);
    }

    
    public void setCstg_Vrnt(java.lang.String Cstg_Vrnt) {
        baseTypeData().setElementValue(170, Cstg_Vrnt);
    }

    
    public void setCurrency(java.lang.String Currency) {
        baseTypeData().setElementValue(46, Currency);
    }

    
    public void setCost_Doc_C(java.math.BigDecimal Cost_Doc_C) {
        baseTypeData().setElementValue(118, Cost_Doc_C);
    }

    
    public java.lang.String getItem_Categ() {
        return (java.lang.String)baseTypeData().getElementValueAsString(9);
    }

    
    public void setActcredid(java.lang.String Actcredid) {
        baseTypeData().setElementValue(155, Actcredid);
    }

    
    public java.lang.String getT_Bas_Unit() {
        return (java.lang.String)baseTypeData().getElementValueAsString(24);
    }

    
    public java.lang.String getProd_Hier() {
        return (java.lang.String)baseTypeData().getElementValueAsString(16);
    }

    
    public void setTax_Class6(java.lang.String Tax_Class6) {
        baseTypeData().setElementValue(91, Tax_Class6);
    }

    
    public java.lang.String getPrc_Group2() {
        return (java.lang.String)baseTypeData().getElementValueAsString(131);
    }

    
    public java.lang.String getMatgrhie1() {
        return (java.lang.String)baseTypeData().getElementValueAsString(203);
    }

    
    public java.sql.Date getDate_St() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(79);
    }

    
    public void setTax_Class2(java.lang.String Tax_Class2) {
        baseTypeData().setElementValue(87, Tax_Class2);
    }

    
    public void setEan_Upc(java.lang.String Ean_Upc) {
        baseTypeData().setElementValue(127, Ean_Upc);
    }

    
    public void setSpec_Stock(java.lang.String Spec_Stock) {
        baseTypeData().setElementValue(137, Spec_Stock);
    }

    
    public void setCust_Mat35(java.lang.String Cust_Mat35) {
        baseTypeData().setElementValue(212, Cust_Mat35);
    }

    
    public java.lang.String getDlv_Group() {
        return (java.lang.String)baseTypeData().getElementValueAsString(35);
    }

    
    public void setTax_Class8(java.lang.String Tax_Class8) {
        baseTypeData().setElementValue(93, Tax_Class8);
    }

    
    public void setOver_Dlv_T(java.math.BigDecimal Over_Dlv_T) {
        baseTypeData().setElementValue(38, Over_Dlv_T);
    }

    
    public java.lang.String getSales_Unit() {
        return (java.lang.String)baseTypeData().getElementValueAsString(55);
    }

    
    public void setCum_Con_Qu(java.math.BigDecimal Cum_Con_Qu) {
        baseTypeData().setElementValue(54, Cum_Con_Qu);
    }

    
    public java.lang.String getBom_It_Nr() {
        return (java.lang.String)baseTypeData().getElementValueAsString(180);
    }

    
    public void setPosnr_Vor(java.lang.String Posnr_Vor) {
        baseTypeData().setElementValue(69, Posnr_Vor);
    }

    
    public java.lang.String getIsobasunit() {
        return (java.lang.String)baseTypeData().getElementValueAsString(145);
    }

    
    public void setMax_Dev_Pe(java.math.BigDecimal Max_Dev_Pe) {
        baseTypeData().setElementValue(31, Max_Dev_Pe);
    }

    
    public void setMatgrhie1(java.lang.String Matgrhie1) {
        baseTypeData().setElementValue(203, Matgrhie1);
    }

    
    public void setRef_Doc(java.lang.String Ref_Doc) {
        baseTypeData().setElementValue(68, Ref_Doc);
    }

    
    public java.lang.String getStge_Loc() {
        return (java.lang.String)baseTypeData().getElementValueAsString(75);
    }

    
    public java.lang.String getCstg_Vrnt() {
        return (java.lang.String)baseTypeData().getElementValueAsString(170);
    }

    
    public void setTaxlawipi(java.lang.String Taxlawipi) {
        baseTypeData().setElementValue(197, Taxlawipi);
    }

    
    public void setVar_Sp_Day(java.math.BigDecimal Var_Sp_Day) {
        baseTypeData().setElementValue(96, Var_Sp_Day);
    }

    
    public java.math.BigDecimal getCr_Exchrat_V() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(213);
    }

    
    public void setCurren_Iso(java.lang.String Curren_Iso) {
        baseTypeData().setElementValue(47, Curren_Iso);
    }

    
    public java.lang.String getSum_Requir() {
        return (java.lang.String)baseTypeData().getElementValueAsString(105);
    }

    
    public java.math.BigDecimal getNet_Weight() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(60);
    }

    
    public java.lang.String getT_Unit_Iso() {
        return (java.lang.String)baseTypeData().getElementValueAsString(20);
    }

    
    public void setAltern_Itm(java.lang.String Altern_Itm) {
        baseTypeData().setElementValue(14, Altern_Itm);
    }

    
    public void setBase_Uom(java.lang.String Base_Uom) {
        baseTypeData().setElementValue(23, Base_Uom);
    }

    
    public void setRound_Dlv(java.math.BigDecimal Round_Dlv) {
        baseTypeData().setElementValue(26, Round_Dlv);
    }

    
    public void setShip_Point(java.lang.String Ship_Point) {
        baseTypeData().setElementValue(76, Ship_Point);
    }

    
    public java.math.BigDecimal getGross_Val() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(217);
    }

    
    public void setGross_Val(java.math.BigDecimal Gross_Val) {
        baseTypeData().setElementValue(217, Gross_Val);
    }

    
    public java.math.BigDecimal getReq_Qty() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(51);
    }

    
    public void setCum_Req_De(java.math.BigDecimal Cum_Req_De) {
        baseTypeData().setElementValue(52, Cum_Req_De);
    }

    
    public java.math.BigDecimal getMin_Dely() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(116);
    }

    
    public void setT_Bas_Unit(java.lang.String T_Bas_Unit) {
        baseTypeData().setElementValue(24, T_Bas_Unit);
    }

    
    public java.lang.String getCust_Mat22() {
        return (java.lang.String)baseTypeData().getElementValueAsString(30);
    }

    
    public void setSubstreaso(java.lang.String Substreaso) {
        baseTypeData().setElementValue(136, Substreaso);
    }

    
    public void setSales_Qty2(java.math.BigDecimal Sales_Qty2) {
        baseTypeData().setElementValue(58, Sales_Qty2);
    }

    
    public void setCr_Exchrat(java.math.BigDecimal Cr_Exchrat) {
        baseTypeData().setElementValue(156, Cr_Exchrat);
    }

    
    public java.lang.String getChclass_In() {
        return (java.lang.String)baseTypeData().getElementValueAsString(158);
    }

    
    public void setVolunitiso(java.lang.String Volunitiso) {
        baseTypeData().setElementValue(65, Volunitiso);
    }

    
    public void setVolume(java.math.BigDecimal Volume) {
        baseTypeData().setElementValue(63, Volume);
    }

    
    public void setCfop_Long(java.lang.String Cfop_Long) {
        baseTypeData().setElementValue(216, Cfop_Long);
    }

    
    public void setSales_Deal(java.lang.String Sales_Deal) {
        baseTypeData().setElementValue(206, Sales_Deal);
    }

    
    public void setFlgleaduni(java.lang.String Flgleaduni) {
        baseTypeData().setElementValue(207, Flgleaduni);
    }

    
    public void setIntclassnr(java.lang.String Intclassnr) {
        baseTypeData().setElementValue(177, Intclassnr);
    }

    
    public void setBase_Unit(java.lang.String Base_Unit) {
        baseTypeData().setElementValue(144, Base_Unit);
    }

    
    public java.lang.String getPref_Indic() {
        return (java.lang.String)baseTypeData().getElementValueAsString(175);
    }

    
    public void setNet_Value(java.math.BigDecimal Net_Value) {
        baseTypeData().setElementValue(45, Net_Value);
    }

    
    public java.lang.String getProd_Alloc() {
        return (java.lang.String)baseTypeData().getElementValueAsString(186);
    }

    
    public void setCreat_Date(java.sql.Date Creat_Date) {
        baseTypeData().setElementValue(83, Creat_Date);
    }

    
    public java.lang.String getValcontrnr() {
        return (java.lang.String)baseTypeData().getElementValueAsString(199);
    }

    
    public void setSd_Taxcode(java.lang.String Sd_Taxcode) {
        baseTypeData().setElementValue(198, Sd_Taxcode);
    }

    
    public void setSep_Valuat(java.lang.String Sep_Valuat) {
        baseTypeData().setElementValue(113, Sep_Valuat);
    }

    
    public java.math.BigDecimal getSubtot_Pp1() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(119);
    }

    
    public void setStpos_Vbap(java.math.BigDecimal Stpos_Vbap) {
        baseTypeData().setElementValue(81, Stpos_Vbap);
    }

    
    public java.lang.String getInd_Btch() {
        return (java.lang.String)baseTypeData().getElementValueAsString(115);
    }

    
    public java.lang.String getVal_Type() {
        return (java.lang.String)baseTypeData().getElementValueAsString(112);
    }

    
    public java.lang.String getSep_Valuat() {
        return (java.lang.String)baseTypeData().getElementValueAsString(113);
    }

    
    public void setSum_Requir(java.lang.String Sum_Requir) {
        baseTypeData().setElementValue(105, Sum_Requir);
    }

    
    public void setCstg_Vrnt1(java.lang.String Cstg_Vrnt1) {
        baseTypeData().setElementValue(185, Cstg_Vrnt1);
    }

    
    public java.lang.String getRebate_Grp() {
        return (java.lang.String)baseTypeData().getElementValueAsString(108);
    }

    
    public void setCum_Cf_Qty(java.math.BigDecimal Cum_Cf_Qty) {
        baseTypeData().setElementValue(53, Cum_Cf_Qty);
    }

    
    public java.lang.String getObj_Nr_It() {
        return (java.lang.String)baseTypeData().getElementValueAsString(150);
    }

    
    public java.math.BigDecimal getExch_Rate() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(125);
    }

    
    public java.lang.String getPrec_Doc() {
        return (java.lang.String)baseTypeData().getElementValueAsString(97);
    }

    
    public void setReqmtstyp(java.lang.String Reqmtstyp) {
        baseTypeData().setElementValue(152, Reqmtstyp);
    }

    
    public void setDoc_Cat_Sd(java.lang.String Doc_Cat_Sd) {
        baseTypeData().setElementValue(166, Doc_Cat_Sd);
    }

    
    public java.lang.String getIsocodunit() {
        return (java.lang.String)baseTypeData().getElementValueAsString(56);
    }

    
    public void setExchratest_V(java.math.BigDecimal Exchratest_V) {
        baseTypeData().setElementValue(214, Exchratest_V);
    }

    
    public java.lang.String getKey_St() {
        return (java.lang.String)baseTypeData().getElementValueAsString(78);
    }

    
    public void setCust_Mat22(java.lang.String Cust_Mat22) {
        baseTypeData().setElementValue(30, Cust_Mat22);
    }

    
    public java.lang.String getCau_Vbeln() {
        return (java.lang.String)baseTypeData().getElementValueAsString(66);
    }

    
    public double getConv_Fact() {
        return baseTypeData().getElementValueAsDouble(146);
    }

    
    public java.lang.String getBomexplno() {
        return (java.lang.String)baseTypeData().getElementValueAsString(149);
    }

    
    public java.math.BigDecimal getSubtot_Pp3() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(121);
    }

    
    public java.math.BigDecimal getMax_Dev_Pe() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(31);
    }

    
    public void setPrice_Ok(java.lang.String Price_Ok) {
        baseTypeData().setElementValue(111, Price_Ok);
    }

    
    public java.lang.String getMatdeterid() {
        return (java.lang.String)baseTypeData().getElementValueAsString(167);
    }

    
    public java.lang.String getCond_Unit() {
        return (java.lang.String)baseTypeData().getElementValueAsString(100);
    }

    
    public java.lang.String getStat_Price() {
        return (java.lang.String)baseTypeData().getElementValueAsString(159);
    }

    
    public void setReq_Qty(java.math.BigDecimal Req_Qty) {
        baseTypeData().setElementValue(51, Req_Qty);
    }

    
    public java.lang.String getPo_Itm_No() {
        return (java.lang.String)baseTypeData().getElementValueAsString(29);
    }

    
    public java.lang.String getEur_Art_Nr() {
        return (java.lang.String)baseTypeData().getElementValueAsString(110);
    }

    
    public void setNo_Of_Seri(int No_Of_Seri) {
        baseTypeData().setElementValue(162, No_Of_Seri);
    }

    
    public java.math.BigDecimal getSubtot_Pp2() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(120);
    }

    
    public void setLog_System_Own(java.lang.String Log_System_Own) {
        baseTypeData().setElementValue(218, Log_System_Own);
    }

    
    public java.lang.String getFixed_Quan() {
        return (java.lang.String)baseTypeData().getElementValueAsString(36);
    }

    
    public double getCredpric() {
        return baseTypeData().getElementValueAsDouble(192);
    }

    
    public void setStge_Loc(java.lang.String Stge_Loc) {
        baseTypeData().setElementValue(75, Stge_Loc);
    }

    
    public void setAssort_Mod(java.lang.String Assort_Mod) {
        baseTypeData().setElementValue(201, Assort_Mod);
    }

    
    public void setCond_Updat(java.lang.String Cond_Updat) {
        baseTypeData().setElementValue(160, Cond_Updat);
    }

    
    public java.lang.String getRea_For_Re() {
        return (java.lang.String)baseTypeData().getElementValueAsString(15);
    }

    
    public java.math.BigDecimal getCredpricit() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(153);
    }

    
    public void setBomitemnr(java.lang.String Bomitemnr) {
        baseTypeData().setElementValue(171, Bomitemnr);
    }

    
    public java.lang.String getRes_Anal() {
        return (java.lang.String)baseTypeData().getElementValueAsString(151);
    }

    
    public java.math.BigDecimal getCum_Cf_Qty() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(53);
    }

    
    public java.math.BigDecimal getSubtot_Pp5() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(123);
    }

    
    public void setInconsconf(java.lang.String Inconsconf) {
        baseTypeData().setElementValue(182, Inconsconf);
    }

    
    public java.math.BigDecimal getOver_Dlv_T() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(38);
    }

    
    public java.lang.String getMatpricgrp() {
        return (java.lang.String)baseTypeData().getElementValueAsString(188);
    }

    
    public java.lang.String getBus_Transt() {
        return (java.lang.String)baseTypeData().getElementValueAsString(174);
    }

    
    public void setIsocodunit(java.lang.String Isocodunit) {
        baseTypeData().setElementValue(56, Isocodunit);
    }

    
    public void setMat_Entrd(java.lang.String Mat_Entrd) {
        baseTypeData().setElementValue(4, Mat_Entrd);
    }

    
    public void setConisounit(java.lang.String Conisounit) {
        baseTypeData().setElementValue(101, Conisounit);
    }

    
    public void setMatgrhie2(java.lang.String Matgrhie2) {
        baseTypeData().setElementValue(204, Matgrhie2);
    }

    
    public void setTarget_Qty(java.math.BigDecimal Target_Qty) {
        baseTypeData().setElementValue(18, Target_Qty);
    }

    
    public void setMatl_Group(java.lang.String Matl_Group) {
        baseTypeData().setElementValue(7, Matl_Group);
    }

    
    public java.math.BigDecimal getGross_Weig() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(59);
    }

    
    public void setGuranteed(double Guranteed) {
        baseTypeData().setElementValue(194, Guranteed);
    }

    
    public java.lang.String getNrcondrec() {
        return (java.lang.String)baseTypeData().getElementValueAsString(176);
    }

    
    public java.lang.String getTarget_Qu() {
        return (java.lang.String)baseTypeData().getElementValueAsString(19);
    }

    
    public void setDlvschedus(java.lang.String Dlvschedus) {
        baseTypeData().setElementValue(34, Dlvschedus);
    }

    
    public void setMax_Deviat(java.math.BigDecimal Max_Deviat) {
        baseTypeData().setElementValue(28, Max_Deviat);
    }

    
    public void setPay_Guaran(java.lang.String Pay_Guaran) {
        baseTypeData().setElementValue(193, Pay_Guaran);
    }

    
    public java.math.BigDecimal getCompon_Qty() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(135);
    }

    
    public java.lang.String getConsumpt() {
        return (java.lang.String)baseTypeData().getElementValueAsString(148);
    }

    
    public java.lang.String getBtch_Split() {
        return (java.lang.String)baseTypeData().getElementValueAsString(50);
    }

    
    public java.math.BigDecimal getSubtot_Pp4() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(122);
    }

    
    public void setMatpricgrp(java.lang.String Matpricgrp) {
        baseTypeData().setElementValue(188, Matpricgrp);
    }

    
    public void setShort_Text(java.lang.String Short_Text) {
        baseTypeData().setElementValue(8, Short_Text);
    }

    
    public void setNet_Price(java.math.BigDecimal Net_Price) {
        baseTypeData().setElementValue(98, Net_Price);
    }

    
    public void setPrc_Group5(java.lang.String Prc_Group5) {
        baseTypeData().setElementValue(134, Prc_Group5);
    }

    
    public void setProfit_Seg(java.lang.String Profit_Seg) {
        baseTypeData().setElementValue(139, Profit_Seg);
    }

    
    public java.lang.String getCust_Mat35() {
        return (java.lang.String)baseTypeData().getElementValueAsString(212);
    }

    
    public java.lang.String getCau_Posnr() {
        return (java.lang.String)baseTypeData().getElementValueAsString(67);
    }

    
    public void setMeth_Bill(java.lang.String Meth_Bill) {
        baseTypeData().setElementValue(42, Meth_Bill);
    }

    
    public java.lang.String getOperation() {
        return (java.lang.String)baseTypeData().getElementValueAsString(0);
    }

    
    public java.lang.String getSpec_Stock() {
        return (java.lang.String)baseTypeData().getElementValueAsString(137);
    }

    
    public java.lang.String getFree_Goods() {
        return (java.lang.String)baseTypeData().getElementValueAsString(208);
    }

    
    public java.lang.String getDlvschedus() {
        return (java.lang.String)baseTypeData().getElementValueAsString(34);
    }

    
    public java.lang.String getConfig() {
        return (java.lang.String)baseTypeData().getElementValueAsString(157);
    }

    
    public java.lang.String getPay_Guaran() {
        return (java.lang.String)baseTypeData().getElementValueAsString(193);
    }

    
    public java.lang.String getTaxlawipi() {
        return (java.lang.String)baseTypeData().getElementValueAsString(197);
    }

    
    public void setSubtot_Pp1(java.math.BigDecimal Subtot_Pp1) {
        baseTypeData().setElementValue(119, Subtot_Pp1);
    }

    
    public java.math.BigDecimal getSubtot_Pp6() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(124);
    }

    
    public void setMan_Pr_Ch(java.lang.String Man_Pr_Ch) {
        baseTypeData().setElementValue(165, Man_Pr_Ch);
    }

    
    public java.lang.String getConisounit() {
        return (java.lang.String)baseTypeData().getElementValueAsString(101);
    }

    
    public void setValcontrit(java.lang.String Valcontrit) {
        baseTypeData().setElementValue(200, Valcontrit);
    }

    
    public void setCond_P_Unt(java.math.BigDecimal Cond_P_Unt) {
        baseTypeData().setElementValue(99, Cond_P_Unt);
    }

    
    public void setSerno_Prof(java.lang.String Serno_Prof) {
        baseTypeData().setElementValue(161, Serno_Prof);
    }

    
    public java.lang.String getPlng_Plant() {
        return (java.lang.String)baseTypeData().getElementValueAsString(143);
    }

    
    public void setPlng_Plant(java.lang.String Plng_Plant) {
        baseTypeData().setElementValue(143, Plng_Plant);
    }

    
    public java.lang.String getReplace_Pt() {
        return (java.lang.String)baseTypeData().getElementValueAsString(41);
    }

    
    public void setPlandlvsch(java.lang.String Plandlvsch) {
        baseTypeData().setElementValue(190, Plandlvsch);
    }

    
    public java.lang.String getBus_Area() {
        return (java.lang.String)baseTypeData().getElementValueAsString(44);
    }

    
    public java.lang.String getCreated_By() {
        return (java.lang.String)baseTypeData().getElementValueAsString(84);
    }

    
    public void setCash_Disc(java.lang.String Cash_Disc) {
        baseTypeData().setElementValue(103, Cash_Disc);
    }

    
    public void setOut_Agr_Ta(java.math.BigDecimal Out_Agr_Ta) {
        baseTypeData().setElementValue(17, Out_Agr_Ta);
    }

    
    public void setMatfrgtgrp(java.lang.String Matfrgtgrp) {
        baseTypeData().setElementValue(189, Matfrgtgrp);
    }

    
    public void setWbs_Elem(java.lang.String Wbs_Elem) {
        baseTypeData().setElementValue(140, Wbs_Elem);
    }

    
    public void setProd_Hier(java.lang.String Prod_Hier) {
        baseTypeData().setElementValue(16, Prod_Hier);
    }

    
    public void setTax_Amount(java.math.BigDecimal Tax_Amount) {
        baseTypeData().setElementValue(210, Tax_Amount);
    }

    
    public void setTarg_Qty_D(java.math.BigDecimal Targ_Qty_D) {
        baseTypeData().setElementValue(22, Targ_Qty_D);
    }

    
    public int getNo_Of_Seri() {
        return baseTypeData().getElementValueAsInt(162);
    }

    
    public void setPref_Indic(java.lang.String Pref_Indic) {
        baseTypeData().setElementValue(175, Pref_Indic);
    }

    
    public void setFix_Date(java.lang.String Fix_Date) {
        baseTypeData().setElementValue(128, Fix_Date);
    }

    
    public java.lang.String getBom_Catego() {
        return (java.lang.String)baseTypeData().getElementValueAsString(179);
    }

    
    public java.lang.String getPartrelid() {
        return (java.lang.String)baseTypeData().getElementValueAsString(154);
    }

    
    public void setTax_Class7(java.lang.String Tax_Class7) {
        baseTypeData().setElementValue(92, Tax_Class7);
    }

    
    public java.lang.String getCurren_Iso() {
        return (java.lang.String)baseTypeData().getElementValueAsString(47);
    }

    
    public void setVal_Type(java.lang.String Val_Type) {
        baseTypeData().setElementValue(112, Val_Type);
    }

    
    public void setMat_Pr_Grp(java.lang.String Mat_Pr_Grp) {
        baseTypeData().setElementValue(106, Mat_Pr_Grp);
    }

    
    public java.math.BigDecimal getVolume() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(63);
    }

    
    public java.math.BigDecimal getTarg_Qty_D() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(22);
    }

    
    public java.lang.String getOverh_Key() {
        return (java.lang.String)baseTypeData().getElementValueAsString(183);
    }

    
    public java.lang.String getUpdat_Flag() {
        return (java.lang.String)baseTypeData().getElementValueAsString(71);
    }

    
    public java.lang.String getRetoure() {
        return (java.lang.String)baseTypeData().getElementValueAsString(102);
    }

    
    public java.lang.String getAltern_Itm() {
        return (java.lang.String)baseTypeData().getElementValueAsString(14);
    }

    
    public void setCau_Vbeln(java.lang.String Cau_Vbeln) {
        baseTypeData().setElementValue(66, Cau_Vbeln);
    }

    
    public void setDeli_Unlim(java.lang.String Deli_Unlim) {
        baseTypeData().setElementValue(37, Deli_Unlim);
    }

    
    public void setBom_It_Nr(java.lang.String Bom_It_Nr) {
        baseTypeData().setElementValue(180, Bom_It_Nr);
    }

    
    public java.lang.String getMat_Entrd() {
        return (java.lang.String)baseTypeData().getElementValueAsString(4);
    }

    
    public java.lang.String getBill_Block() {
        return (java.lang.String)baseTypeData().getElementValueAsString(40);
    }

    
    public void setEur_Art_Nr(java.lang.String Eur_Art_Nr) {
        baseTypeData().setElementValue(110, Eur_Art_Nr);
    }

    
    public void setSubtot_Pp5(java.math.BigDecimal Subtot_Pp5) {
        baseTypeData().setElementValue(123, Subtot_Pp5);
    }

    
    public void setOrderid(java.lang.String Orderid) {
        baseTypeData().setElementValue(141, Orderid);
    }

    
    public void setSubtot_Pp2(java.math.BigDecimal Subtot_Pp2) {
        baseTypeData().setElementValue(120, Subtot_Pp2);
    }

    
    public void setGross_Weig(java.math.BigDecimal Gross_Weig) {
        baseTypeData().setElementValue(59, Gross_Weig);
    }

    
    public java.lang.String getAcct_Assgt() {
        return (java.lang.String)baseTypeData().getElementValueAsString(107);
    }

    
    public java.math.BigDecimal getCond_P_Unt() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(99);
    }

    
    public java.lang.String getFix_Date() {
        return (java.lang.String)baseTypeData().getElementValueAsString(128);
    }

    
    public java.lang.String getProfit_Seg() {
        return (java.lang.String)baseTypeData().getElementValueAsString(139);
    }

    
    public void setTarg_Qty_N(java.math.BigDecimal Targ_Qty_N) {
        baseTypeData().setElementValue(21, Targ_Qty_N);
    }

    
    public java.lang.String getUnit_Wtiso() {
        return (java.lang.String)baseTypeData().getElementValueAsString(62);
    }

    
    public java.lang.String getSequenceno() {
        return (java.lang.String)baseTypeData().getElementValueAsString(191);
    }

    
    public void setMatdeterid(java.lang.String Matdeterid) {
        baseTypeData().setElementValue(167, Matdeterid);
    }

    
    public java.lang.String getAvailcheck() {
        return (java.lang.String)baseTypeData().getElementValueAsString(104);
    }

    
    public java.lang.String getTax_Class2() {
        return (java.lang.String)baseTypeData().getElementValueAsString(87);
    }

    
    public void setCostestnr(java.lang.String Costestnr) {
        baseTypeData().setElementValue(169, Costestnr);
    }

    
    public void setPrc_Group3(java.lang.String Prc_Group3) {
        baseTypeData().setElementValue(132, Prc_Group3);
    }

    
    public java.lang.String getPlandlvsch() {
        return (java.lang.String)baseTypeData().getElementValueAsString(190);
    }

    
    public java.lang.String getCfop_Long() {
        return (java.lang.String)baseTypeData().getElementValueAsString(216);
    }

    
    public void setPo_Itm_No(java.lang.String Po_Itm_No) {
        baseTypeData().setElementValue(29, Po_Itm_No);
    }

    
    public java.lang.String getSerno_Prof() {
        return (java.lang.String)baseTypeData().getElementValueAsString(161);
    }

    
    public java.lang.String getCostestnr() {
        return (java.lang.String)baseTypeData().getElementValueAsString(169);
    }

    
    public void setOverh_Key(java.lang.String Overh_Key) {
        baseTypeData().setElementValue(183, Overh_Key);
    }

    
    public void setPr_Ref_Mat(java.lang.String Pr_Ref_Mat) {
        baseTypeData().setElementValue(5, Pr_Ref_Mat);
    }

    
    public java.math.BigDecimal getVar_Sp_Day() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(96);
    }

    
    public java.lang.String getRepair_Pro() {
        return (java.lang.String)baseTypeData().getElementValueAsString(33);
    }

    
    public java.sql.Time getRec_Time() {
        return (java.sql.Time)baseTypeData().getElementValueAsTime(85);
    }

    
    public java.math.BigDecimal getOut_Agr_Ta() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(17);
    }

    
    public java.lang.String getTax_Class3() {
        return (java.lang.String)baseTypeData().getElementValueAsString(88);
    }

    
    public java.lang.String getCfop_Code() {
        return (java.lang.String)baseTypeData().getElementValueAsString(195);
    }

    
    public java.lang.String getDoc_Number() {
        return (java.lang.String)baseTypeData().getElementValueAsString(1);
    }

    
    public void setMat_Grp_Sm(java.lang.String Mat_Grp_Sm) {
        baseTypeData().setElementValue(164, Mat_Grp_Sm);
    }

    
    public java.sql.Date getStat_Date() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(173);
    }

    
    public java.lang.String getHg_Lv_Item() {
        return (java.lang.String)baseTypeData().getElementValueAsString(13);
    }

    
    public void setFree_Goods(java.lang.String Free_Goods) {
        baseTypeData().setElementValue(208, Free_Goods);
    }

    
    public void setPrice_Ref(java.lang.String Price_Ref) {
        baseTypeData().setElementValue(187, Price_Ref);
    }

    
    public void setRel_For_Bi(java.lang.String Rel_For_Bi) {
        baseTypeData().setElementValue(12, Rel_For_Bi);
    }

    
    public void setDlv_Group(java.lang.String Dlv_Group) {
        baseTypeData().setElementValue(35, Dlv_Group);
    }

    
    public void setPromotion(java.lang.String Promotion) {
        baseTypeData().setElementValue(205, Promotion);
    }

    
    public java.lang.String getValspecsto() {
        return (java.lang.String)baseTypeData().getElementValueAsString(202);
    }

    
    public java.lang.String getPromotion() {
        return (java.lang.String)baseTypeData().getElementValueAsString(205);
    }

    
    public void setTax_Class1(java.lang.String Tax_Class1) {
        baseTypeData().setElementValue(86, Tax_Class1);
    }

    
    public void setSubtot_Pp3(java.math.BigDecimal Subtot_Pp3) {
        baseTypeData().setElementValue(121, Subtot_Pp3);
    }

    
    public java.lang.String getInconsconf() {
        return (java.lang.String)baseTypeData().getElementValueAsString(182);
    }

    
    public java.lang.String getSd_Taxcode() {
        return (java.lang.String)baseTypeData().getElementValueAsString(198);
    }

    
    public void setUnder_Dlv(java.math.BigDecimal Under_Dlv) {
        baseTypeData().setElementValue(39, Under_Dlv);
    }

    
    public MetaData metadata() {
        return metadata;
    }

    
    public void setUpdat_Flag(java.lang.String Updat_Flag) {
        baseTypeData().setElementValue(71, Updat_Flag);
    }

    
    public java.lang.String getCstg_Vrnt1() {
        return (java.lang.String)baseTypeData().getElementValueAsString(185);
    }

    
    public java.sql.Date getRecon_Date() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(27);
    }

    
    public java.lang.String getBatch_Mgmt() {
        return (java.lang.String)baseTypeData().getElementValueAsString(114);
    }

    
    public java.lang.String getMan_Pr_Ch() {
        return (java.lang.String)baseTypeData().getElementValueAsString(165);
    }

    
    public void setPrec_Doc(java.lang.String Prec_Doc) {
        baseTypeData().setElementValue(97, Prec_Doc);
    }

    
    public void setPlng_Matl(java.lang.String Plng_Matl) {
        baseTypeData().setElementValue(142, Plng_Matl);
    }

    
    public void setMax_Dev_Da(java.math.BigDecimal Max_Dev_Da) {
        baseTypeData().setElementValue(32, Max_Dev_Da);
    }

    
    public java.lang.String getPrice_Ref() {
        return (java.lang.String)baseTypeData().getElementValueAsString(187);
    }

    
    public void setRoute(java.lang.String Route) {
        baseTypeData().setElementValue(77, Route);
    }

    
    public void setOperation(java.lang.String Operation) {
        baseTypeData().setElementValue(0, Operation);
    }

    
    public void setPrc_Group4(java.lang.String Prc_Group4) {
        baseTypeData().setElementValue(133, Prc_Group4);
    }

    
    public java.lang.String getPlng_Matl() {
        return (java.lang.String)baseTypeData().getElementValueAsString(142);
    }

    
    public java.lang.String getCond_Updat() {
        return (java.lang.String)baseTypeData().getElementValueAsString(160);
    }

    
    public void setHg_Lv_Item(java.lang.String Hg_Lv_Item) {
        baseTypeData().setElementValue(13, Hg_Lv_Item);
    }

    
    public java.lang.String getTax_Class1() {
        return (java.lang.String)baseTypeData().getElementValueAsString(86);
    }

    
    public void setKey_St(java.lang.String Key_St) {
        baseTypeData().setElementValue(78, Key_St);
    }

    
    public java.lang.String getItm_Number() {
        return (java.lang.String)baseTypeData().getElementValueAsString(2);
    }

    
    public java.lang.String getCounter() {
        return (java.lang.String)baseTypeData().getElementValueAsString(181);
    }

    
    public java.lang.String getOrder_Prob() {
        return (java.lang.String)baseTypeData().getElementValueAsString(82);
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  BapisditType parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (BapisditType parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getStge_Loc() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(75);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getBase_Uom() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(23);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCstg_Vrnt() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(170);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getItem_Type() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(10);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCr_Exchrat_V() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(213);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSum_Requir() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(105);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getNet_Weight() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(60);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getT_Unit_Iso() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(20);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMatfrgtgrp() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(189);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTax_Class5() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(90);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getGross_Val() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(217);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTarg_Qty_N() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(21);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getReq_Qty() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(51);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDlv_Prio() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(73);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMin_Dely() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(116);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRef_Doc() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(68);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getIntclassnr() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(177);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCust_Mat22() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(30);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getReqmtstyp() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(152);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTax_Class4() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(89);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSales_Deal() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(206);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMat_Pr_Grp() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(106);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPrice_Ok() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(111);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getChclass_In() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(158);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMrp_Area() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(211);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSubstreaso() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(136);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCum_Req_De() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(52);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCh_On() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(126);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getBomitemnr() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(171);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPref_Indic() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(175);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getComm_Group() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(109);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRel_For_Bi() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(12);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getProd_Alloc() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(186);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getValcontrnr() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(199);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTax_Class7() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(92);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getStat_Val() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(172);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSubtot_Pp1() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(119);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getInd_Btch() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(115);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getVal_Type() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(112);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSep_Valuat() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(113);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCash_Disc() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(103);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getItusageid() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(168);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTax_Class6() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(91);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getBatch_Exit() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(178);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRebate_Grp() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(108);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCstg_Sheet() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(184);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCr_Exchrat() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(156);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getObj_Nr_It() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(150);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getNbr_St() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(80);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getExch_Rate() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(125);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPrec_Doc() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(97);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTax_Class9() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(94);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMax_Pl_Dlv() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(48);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMaterial() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getIsocodunit() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(56);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getKey_St() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(78);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCau_Vbeln() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(66);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getConv_Fact() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(146);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getBomexplno() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(149);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getFlgleaduni() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(207);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSubtot_Pp3() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(121);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMax_Dev_Pe() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(31);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMatdeterid() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(167);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPlant() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(74);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCond_Unit() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(100);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getStat_Price() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(159);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPo_Itm_No() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(29);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getFix_Sp_Day() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(95);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getEur_Art_Nr() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(110);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getShort_Text() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(8);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSubtot_Pp2() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(120);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRound_Dlv() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(26);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getNet_Price() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(98);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTax_Class8() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(93);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getOrderid() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(141);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getFixed_Quan() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(36);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCredpric() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(192);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMatl_Group() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(7);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getUnder_Dlv() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(39);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRea_For_Re() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(15);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCredpricit() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(153);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getAssort_Mod() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(201);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCum_Con_Qu() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(54);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRes_Anal() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(151);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCum_Cf_Qty() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(53);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSubtot_Pp5() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(123);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getOver_Dlv_T() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(38);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMatpricgrp() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(188);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getNogrposted() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(163);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getBus_Transt() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(174);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getValid_Obj() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(209);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getWbs_Elem() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(140);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getGross_Weig() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(59);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getNrcondrec() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(176);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTarget_Qu() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(19);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCompon_Qty() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(135);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getConsumpt() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(148);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getBtch_Split() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(50);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSubtot_Pp4() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(122);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getEnd_Rule() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(72);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getVolumeunit() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(64);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRel_For_De() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(11);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getAlloc_Indi() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(138);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDivision() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(43);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCust_Mat35() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(212);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCau_Posnr() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(67);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getOperation() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSpec_Stock() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(137);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getFree_Goods() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(208);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDlvschedus() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(34);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getConfig() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(157);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPay_Guaran() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(193);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTaxlawicms() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(196);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTaxlawipi() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(197);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMax_Deviat() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(28);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSubtot_Pp6() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(124);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getConisounit() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(101);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPlng_Plant() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(143);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getReplace_Pt() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(41);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMeth_Bill() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(42);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getBus_Area() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(44);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRoute() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(77);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getScale_Quan() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(25);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCreated_By() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(84);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDeli_Unlim() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(37);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getGuranteed() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(194);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCurrency() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(46);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getNo_Of_Seri() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(162);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getBom_Catego() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(179);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPartrelid() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(154);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCurren_Iso() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(47);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDoc_Cat_Sd() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(166);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPosnr_Vor() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(69);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getUpdate_Grp() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(117);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getValcontrit() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(200);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getVolume() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(63);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTarg_Qty_D() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(22);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getOverh_Key() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(183);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getUpdat_Flag() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(71);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRetoure() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(102);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getProfit_Ctr() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(129);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getAltern_Itm() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(14);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getStpos_Vbap() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(81);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMat_Entrd() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(4);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getBill_Block() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(40);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCost_Doc_C() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(118);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getAcct_Assgt() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(107);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCond_P_Unt() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(99);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getFix_Date() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(128);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getProfit_Seg() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(139);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTarget_Qty() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(18);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTax_Amount() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(210);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getBatch() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(6);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMat_Grp_Sm() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(164);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getUnit_Wtiso() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(62);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSequenceno() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(191);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPrc_Group1() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(130);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPrc_Group5() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(134);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getAvailcheck() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(104);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTax_Class2() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(87);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getAcctasscat() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(147);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPlandlvsch() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(190);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMatgrhie2() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(204);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCfop_Long() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(216);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSerno_Prof() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(161);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getItm_Type_Usage() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(215);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCostestnr() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(169);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getExchratest_V() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(214);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSales_Qty1() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(57);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMax_Dev_Da() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(32);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getUnit_Of_Wt() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(61);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getActcredid() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(155);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getVar_Sp_Day() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(96);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRepair_Pro() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(33);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRec_Time() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(85);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getOut_Agr_Ta() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(17);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPrc_Group4() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(133);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPart_Dlv() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(49);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTax_Class3() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(88);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getBase_Unit() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(144);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCfop_Code() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(195);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDoc_Number() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getShip_Point() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(76);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getStat_Date() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(173);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getHg_Lv_Item() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(13);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getVolunitiso() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(65);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getValspecsto() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(202);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getLog_System_Own() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(218);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSales_Qty2() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(58);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPromotion() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(205);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getNet_Value() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(45);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPrc_Group3() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(132);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPr_Ref_Mat() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(5);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCreat_Date() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(83);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getInconsconf() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(182);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSd_Taxcode() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(198);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getObj_Copy() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(70);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getEan_Upc() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(127);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCstg_Vrnt1() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(185);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRecon_Date() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(27);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getBatch_Mgmt() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(114);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMan_Pr_Ch() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(165);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getItem_Categ() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(9);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getT_Bas_Unit() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(24);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getProd_Hier() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(16);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPrice_Ref() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(187);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPrc_Group2() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(131);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMatgrhie1() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(203);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDate_St() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(79);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPlng_Matl() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(142);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCond_Updat() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(160);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDlv_Group() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(35);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTax_Class1() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(86);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSales_Unit() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(55);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getBom_It_Nr() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(180);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getItm_Number() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCounter() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(181);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getIsobasunit() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(145);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getOrder_Prob() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(82);
        }
    
    }

}
