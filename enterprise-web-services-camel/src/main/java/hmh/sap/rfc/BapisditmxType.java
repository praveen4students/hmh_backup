package hmh.sap.rfc;


public class BapisditmxType extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1354127028482L) ;

    private  BapisditmxType.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.XSDL_COMPLEX_TYPE, "urn:sap-com:document:sap:rfc:functions", "BAPISDITMX", 175, 0, hmh.sap.rfc.BapisditmxType.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "BAPISDITMX", 180, 360, -1, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"BAPISDITMX\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Communication Fields: Sales and Distribution Document Item</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>110</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>180</ifr:internalLength1><ifr:internalLength2>360</ifr:internalLength2></ifr:definition></ifr:container></s0:type>");
        descriptorSetElementProperties(descriptor, 0, "ITM_NUMBER", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Itm_Number", java.lang.String.class, null, new java.lang.String[][]{{"pattern", "\\d+"}, {"maxLength", "6"}}, "ITM_NUMBER", 0, 0, -1, 6, 12, -1, com.sap.mw.jco.JCO.TYPE_NUM, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ITM_NUMBER\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Sales Document Item</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>VBUP</ifr:checkTable><ifr:offset1>0</ifr:offset1><ifr:offset2>0</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"POSNR_VA\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>NUMC</ifr:type><ifr:abapType>N</ifr:abapType><ifr:length>6</ifr:length><ifr:internalLength1>6</ifr:internalLength1><ifr:internalLength2>12</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>6</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 1, "UPDATEFLAG", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Updateflag", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "UPDATEFLAG", 6, 12, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"UPDATEFLAG\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Update indicator</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>6</ifr:offset1><ifr:offset2>12</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"UPDKZ_D\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 2, "HG_LV_ITEM", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Hg_Lv_Item", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "HG_LV_ITEM", 7, 14, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"HG_LV_ITEM\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>7</ifr:offset1><ifr:offset2>14</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 3, "PO_ITM_NO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Po_Itm_No", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PO_ITM_NO", 8, 16, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PO_ITM_NO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>8</ifr:offset1><ifr:offset2>16</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 4, "MATERIAL", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Material", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "MATERIAL", 9, 18, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MATERIAL\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>9</ifr:offset1><ifr:offset2>18</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 5, "ALT_TO_ITM", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Alt_To_Itm", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "ALT_TO_ITM", 10, 20, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ALT_TO_ITM\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>10</ifr:offset1><ifr:offset2>20</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 6, "CUST_MAT22", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cust_Mat22", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "CUST_MAT22", 11, 22, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CUST_MAT22\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>11</ifr:offset1><ifr:offset2>22</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 7, "BATCH", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Batch", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "BATCH", 12, 24, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"BATCH\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>12</ifr:offset1><ifr:offset2>24</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 8, "DLV_GROUP", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Dlv_Group", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "DLV_GROUP", 13, 26, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DLV_GROUP\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>13</ifr:offset1><ifr:offset2>26</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 9, "PART_DLV", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Part_Dlv", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PART_DLV", 14, 28, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PART_DLV\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>14</ifr:offset1><ifr:offset2>28</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 10, "REASON_REJ", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Reason_Rej", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "REASON_REJ", 15, 30, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REASON_REJ\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>15</ifr:offset1><ifr:offset2>30</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 11, "BILL_BLOCK", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Bill_Block", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "BILL_BLOCK", 16, 32, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"BILL_BLOCK\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>16</ifr:offset1><ifr:offset2>32</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 12, "BILL_DATE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Bill_Date", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "BILL_DATE", 17, 34, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"BILL_DATE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>17</ifr:offset1><ifr:offset2>34</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 13, "PLANT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Plant", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PLANT", 18, 36, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PLANT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>18</ifr:offset1><ifr:offset2>36</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 14, "STORE_LOC", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Store_Loc", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "STORE_LOC", 19, 38, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"STORE_LOC\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>19</ifr:offset1><ifr:offset2>38</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 15, "TARGET_QTY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Target_Qty", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "TARGET_QTY", 20, 40, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TARGET_QTY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>20</ifr:offset1><ifr:offset2>40</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 16, "TARGET_QU", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Target_Qu", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "TARGET_QU", 21, 42, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TARGET_QU\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>21</ifr:offset1><ifr:offset2>42</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 17, "T_UNIT_ISO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "T_Unit_Iso", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "T_UNIT_ISO", 22, 44, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"T_UNIT_ISO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>22</ifr:offset1><ifr:offset2>44</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 18, "ITEM_CATEG", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Item_Categ", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "ITEM_CATEG", 23, 46, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ITEM_CATEG\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>23</ifr:offset1><ifr:offset2>46</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 19, "SHORT_TEXT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Short_Text", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "SHORT_TEXT", 24, 48, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SHORT_TEXT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>24</ifr:offset1><ifr:offset2>48</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 20, "PRC_GROUP1", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Prc_Group1", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PRC_GROUP1", 25, 50, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PRC_GROUP1\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>25</ifr:offset1><ifr:offset2>50</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 21, "PRC_GROUP2", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Prc_Group2", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PRC_GROUP2", 26, 52, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PRC_GROUP2\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>26</ifr:offset1><ifr:offset2>52</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 22, "PRC_GROUP3", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Prc_Group3", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PRC_GROUP3", 27, 54, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PRC_GROUP3\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>27</ifr:offset1><ifr:offset2>54</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 23, "PRC_GROUP4", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Prc_Group4", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PRC_GROUP4", 28, 56, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PRC_GROUP4\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>28</ifr:offset1><ifr:offset2>56</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 24, "PRC_GROUP5", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Prc_Group5", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PRC_GROUP5", 29, 58, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PRC_GROUP5\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>29</ifr:offset1><ifr:offset2>58</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 25, "PROD_HIERA", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Prod_Hiera", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PROD_HIERA", 30, 60, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PROD_HIERA\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>30</ifr:offset1><ifr:offset2>60</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 26, "MATL_GROUP", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Matl_Group", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "MATL_GROUP", 31, 62, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MATL_GROUP\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>31</ifr:offset1><ifr:offset2>62</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 27, "PURCH_NO_C", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Purch_No_C", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PURCH_NO_C", 32, 64, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PURCH_NO_C\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>32</ifr:offset1><ifr:offset2>64</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 28, "PURCH_DATE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Purch_Date", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PURCH_DATE", 33, 66, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PURCH_DATE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>33</ifr:offset1><ifr:offset2>66</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 29, "PO_METHOD", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Po_Method", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PO_METHOD", 34, 68, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PO_METHOD\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>34</ifr:offset1><ifr:offset2>68</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 30, "REF_1", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ref_1", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "REF_1", 35, 70, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REF_1\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>35</ifr:offset1><ifr:offset2>70</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 31, "PURCH_NO_S", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Purch_No_S", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PURCH_NO_S", 36, 72, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PURCH_NO_S\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>36</ifr:offset1><ifr:offset2>72</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 32, "PO_DAT_S", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Po_Dat_S", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PO_DAT_S", 37, 74, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PO_DAT_S\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>37</ifr:offset1><ifr:offset2>74</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 33, "PO_METH_S", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Po_Meth_S", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PO_METH_S", 38, 76, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PO_METH_S\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>38</ifr:offset1><ifr:offset2>76</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 34, "REF_1_S", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ref_1_S", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "REF_1_S", 39, 78, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REF_1_S\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>39</ifr:offset1><ifr:offset2>78</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 35, "POITM_NO_S", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Poitm_No_S", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "POITM_NO_S", 40, 80, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"POITM_NO_S\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>40</ifr:offset1><ifr:offset2>80</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 36, "PRICE_GRP", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Price_Grp", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PRICE_GRP", 41, 82, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PRICE_GRP\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>41</ifr:offset1><ifr:offset2>82</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 37, "CUST_GROUP", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cust_Group", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "CUST_GROUP", 42, 84, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CUST_GROUP\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>42</ifr:offset1><ifr:offset2>84</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 38, "SALES_DIST", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Sales_Dist", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "SALES_DIST", 43, 86, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SALES_DIST\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>43</ifr:offset1><ifr:offset2>86</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 39, "PRICE_LIST", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Price_List", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PRICE_LIST", 44, 88, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PRICE_LIST\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>44</ifr:offset1><ifr:offset2>88</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 40, "INCOTERMS1", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Incoterms1", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "INCOTERMS1", 45, 90, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"INCOTERMS1\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>45</ifr:offset1><ifr:offset2>90</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 41, "INCOTERMS2", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Incoterms2", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "INCOTERMS2", 46, 92, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"INCOTERMS2\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>46</ifr:offset1><ifr:offset2>92</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 42, "ORDCOMP_IN", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ordcomp_In", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "ORDCOMP_IN", 47, 94, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ORDCOMP_IN\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>47</ifr:offset1><ifr:offset2>94</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 43, "BILL_SCHED", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Bill_Sched", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "BILL_SCHED", 48, 96, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"BILL_SCHED\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>48</ifr:offset1><ifr:offset2>96</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 44, "INVO_SCHED", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Invo_Sched", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "INVO_SCHED", 49, 98, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"INVO_SCHED\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>49</ifr:offset1><ifr:offset2>98</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 45, "MN_INVOICE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Mn_Invoice", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "MN_INVOICE", 50, 100, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MN_INVOICE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>50</ifr:offset1><ifr:offset2>100</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 46, "EX_RATE_FI", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ex_Rate_Fi", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "EX_RATE_FI", 51, 102, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"EX_RATE_FI\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>51</ifr:offset1><ifr:offset2>102</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 47, "ADD_VAL_DY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Add_Val_Dy", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "ADD_VAL_DY", 52, 104, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ADD_VAL_DY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>52</ifr:offset1><ifr:offset2>104</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 48, "FIX_VAL_DY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Fix_Val_Dy", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "FIX_VAL_DY", 53, 106, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"FIX_VAL_DY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>53</ifr:offset1><ifr:offset2>106</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 49, "PMNTTRMS", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Pmnttrms", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PMNTTRMS", 54, 108, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PMNTTRMS\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>54</ifr:offset1><ifr:offset2>108</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 50, "PYMT_METH", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Pymt_Meth", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PYMT_METH", 55, 110, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PYMT_METH\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>55</ifr:offset1><ifr:offset2>110</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 51, "ACCNT_ASGN", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Accnt_Asgn", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "ACCNT_ASGN", 56, 112, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ACCNT_ASGN\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>56</ifr:offset1><ifr:offset2>112</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 52, "EXCHG_RATE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Exchg_Rate", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "EXCHG_RATE", 57, 114, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"EXCHG_RATE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>57</ifr:offset1><ifr:offset2>114</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 53, "PRICE_DATE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Price_Date", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PRICE_DATE", 58, 116, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PRICE_DATE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>58</ifr:offset1><ifr:offset2>116</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 54, "SERV_DATE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Serv_Date", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "SERV_DATE", 59, 118, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SERV_DATE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>59</ifr:offset1><ifr:offset2>118</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 55, "DUNN_KEY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Dunn_Key", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "DUNN_KEY", 60, 120, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DUNN_KEY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>60</ifr:offset1><ifr:offset2>120</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 56, "DUNN_BLOCK", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Dunn_Block", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "DUNN_BLOCK", 61, 122, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DUNN_BLOCK\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>61</ifr:offset1><ifr:offset2>122</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 57, "PROMOTION", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Promotion", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PROMOTION", 62, 124, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PROMOTION\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>62</ifr:offset1><ifr:offset2>124</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 58, "PMTGAR_PRO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Pmtgar_Pro", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PMTGAR_PRO", 63, 126, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PMTGAR_PRO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>63</ifr:offset1><ifr:offset2>126</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 59, "DOC_NUM_FI", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Doc_Num_Fi", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "DOC_NUM_FI", 64, 128, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DOC_NUM_FI\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>64</ifr:offset1><ifr:offset2>128</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 60, "DEPARTM_NO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Departm_No", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "DEPARTM_NO", 65, 130, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DEPARTM_NO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>65</ifr:offset1><ifr:offset2>130</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 61, "REC_POINT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Rec_Point", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "REC_POINT", 66, 132, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REC_POINT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>66</ifr:offset1><ifr:offset2>132</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 62, "CSTCNDGRP1", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cstcndgrp1", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "CSTCNDGRP1", 67, 134, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CSTCNDGRP1\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>67</ifr:offset1><ifr:offset2>134</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 63, "CSTCNDGRP2", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cstcndgrp2", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "CSTCNDGRP2", 68, 136, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CSTCNDGRP2\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>68</ifr:offset1><ifr:offset2>136</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 64, "CSTCNDGRP3", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cstcndgrp3", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "CSTCNDGRP3", 69, 138, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CSTCNDGRP3\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>69</ifr:offset1><ifr:offset2>138</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 65, "CSTCNDGRP4", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cstcndgrp4", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "CSTCNDGRP4", 70, 140, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CSTCNDGRP4\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>70</ifr:offset1><ifr:offset2>140</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 66, "CSTCNDGRP5", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cstcndgrp5", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "CSTCNDGRP5", 71, 142, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CSTCNDGRP5\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>71</ifr:offset1><ifr:offset2>142</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 67, "DLV_TIME", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Dlv_Time", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "DLV_TIME", 72, 144, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DLV_TIME\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>72</ifr:offset1><ifr:offset2>144</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 68, "SALES_UNIT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Sales_Unit", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "SALES_UNIT", 73, 146, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SALES_UNIT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>73</ifr:offset1><ifr:offset2>146</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 69, "TRG_QTY_NO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Trg_Qty_No", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "TRG_QTY_NO", 74, 148, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TRG_QTY_NO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>74</ifr:offset1><ifr:offset2>148</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 70, "TRGQTY_DEN", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Trgqty_Den", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "TRGQTY_DEN", 75, 150, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TRGQTY_DEN\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>75</ifr:offset1><ifr:offset2>150</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 71, "RNDDLV_QTY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Rnddlv_Qty", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "RNDDLV_QTY", 76, 152, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"RNDDLV_QTY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>76</ifr:offset1><ifr:offset2>152</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 72, "MAXDEVAMNT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Maxdevamnt", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "MAXDEVAMNT", 77, 154, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MAXDEVAMNT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>77</ifr:offset1><ifr:offset2>154</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 73, "MAXDEVPER", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Maxdevper", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "MAXDEVPER", 78, 156, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MAXDEVPER\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>78</ifr:offset1><ifr:offset2>156</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 74, "MAXDEV_DAY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Maxdev_Day", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "MAXDEV_DAY", 79, 158, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MAXDEV_DAY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>79</ifr:offset1><ifr:offset2>158</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 75, "USAGE_IND", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Usage_Ind", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "USAGE_IND", 80, 160, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"USAGE_IND\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>80</ifr:offset1><ifr:offset2>160</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 76, "FIXED_QUAN", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Fixed_Quan", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "FIXED_QUAN", 81, 162, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"FIXED_QUAN\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>81</ifr:offset1><ifr:offset2>162</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 77, "UNLMT_DLV", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Unlmt_Dlv", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "UNLMT_DLV", 82, 164, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"UNLMT_DLV\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>82</ifr:offset1><ifr:offset2>164</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 78, "OVERDLVTOL", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Overdlvtol", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "OVERDLVTOL", 83, 166, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"OVERDLVTOL\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>83</ifr:offset1><ifr:offset2>166</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 79, "UNDDLV_TOL", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Unddlv_Tol", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "UNDDLV_TOL", 84, 168, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"UNDDLV_TOL\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>84</ifr:offset1><ifr:offset2>168</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 80, "DIVISION", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Division", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "DIVISION", 85, 170, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DIVISION\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>85</ifr:offset1><ifr:offset2>170</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 81, "SALQTYNUM", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Salqtynum", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "SALQTYNUM", 86, 172, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SALQTYNUM\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>86</ifr:offset1><ifr:offset2>172</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 82, "SALQTYDEN", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Salqtyden", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "SALQTYDEN", 87, 174, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SALQTYDEN\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>87</ifr:offset1><ifr:offset2>174</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 83, "GROSS_WGHT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Gross_Wght", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "GROSS_WGHT", 88, 176, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"GROSS_WGHT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>88</ifr:offset1><ifr:offset2>176</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 84, "NET_WEIGHT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Net_Weight", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "NET_WEIGHT", 89, 178, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"NET_WEIGHT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>89</ifr:offset1><ifr:offset2>178</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 85, "UNTOF_WGHT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Untof_Wght", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "UNTOF_WGHT", 90, 180, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"UNTOF_WGHT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>90</ifr:offset1><ifr:offset2>180</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 86, "VOLUME", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Volume", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "VOLUME", 91, 182, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"VOLUME\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>91</ifr:offset1><ifr:offset2>182</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 87, "VOLUNIT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Volunit", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "VOLUNIT", 92, 184, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"VOLUNIT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>92</ifr:offset1><ifr:offset2>184</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 88, "DLV_PRIO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Dlv_Prio", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "DLV_PRIO", 93, 186, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DLV_PRIO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>93</ifr:offset1><ifr:offset2>186</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 89, "SHIP_POINT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ship_Point", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "SHIP_POINT", 94, 188, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SHIP_POINT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>94</ifr:offset1><ifr:offset2>188</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 90, "ROUTE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Route", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "ROUTE", 95, 190, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ROUTE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>95</ifr:offset1><ifr:offset2>190</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 91, "TAX_CLASS1", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Tax_Class1", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "TAX_CLASS1", 96, 192, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TAX_CLASS1\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>96</ifr:offset1><ifr:offset2>192</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 92, "TAX_CLASS2", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Tax_Class2", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "TAX_CLASS2", 97, 194, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TAX_CLASS2\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>97</ifr:offset1><ifr:offset2>194</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 93, "TAX_CLASS3", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Tax_Class3", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "TAX_CLASS3", 98, 196, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TAX_CLASS3\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>98</ifr:offset1><ifr:offset2>196</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 94, "TAX_CLASS4", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Tax_Class4", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "TAX_CLASS4", 99, 198, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TAX_CLASS4\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>99</ifr:offset1><ifr:offset2>198</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 95, "TAX_CLASS5", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Tax_Class5", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "TAX_CLASS5", 100, 200, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TAX_CLASS5\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>100</ifr:offset1><ifr:offset2>200</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 96, "TAX_CLASS6", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Tax_Class6", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "TAX_CLASS6", 101, 202, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TAX_CLASS6\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>101</ifr:offset1><ifr:offset2>202</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 97, "TAX_CLASS7", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Tax_Class7", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "TAX_CLASS7", 102, 204, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TAX_CLASS7\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>102</ifr:offset1><ifr:offset2>204</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 98, "TAX_CLASS8", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Tax_Class8", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "TAX_CLASS8", 103, 206, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TAX_CLASS8\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>103</ifr:offset1><ifr:offset2>206</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 99, "TAX_CLASS9", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Tax_Class9", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "TAX_CLASS9", 104, 208, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TAX_CLASS9\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>104</ifr:offset1><ifr:offset2>208</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 100, "MAT_PR_GRP", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Mat_Pr_Grp", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "MAT_PR_GRP", 105, 210, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MAT_PR_GRP\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>105</ifr:offset1><ifr:offset2>210</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 101, "VAL_TYPE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Val_Type", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "VAL_TYPE", 106, 212, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"VAL_TYPE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>106</ifr:offset1><ifr:offset2>212</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 102, "FIXDAT_QTY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Fixdat_Qty", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "FIXDAT_QTY", 107, 214, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"FIXDAT_QTY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>107</ifr:offset1><ifr:offset2>214</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 103, "BOMEXPL_NO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Bomexpl_No", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "BOMEXPL_NO", 108, 216, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"BOMEXPL_NO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>108</ifr:offset1><ifr:offset2>216</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 104, "RESANALKEY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Resanalkey", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "RESANALKEY", 109, 218, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"RESANALKEY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>109</ifr:offset1><ifr:offset2>218</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 105, "REQMTS_TYP", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Reqmts_Typ", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "REQMTS_TYP", 110, 220, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REQMTS_TYP\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>110</ifr:offset1><ifr:offset2>220</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 106, "NO_GR_POST", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "No_Gr_Post", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "NO_GR_POST", 111, 222, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"NO_GR_POST\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>111</ifr:offset1><ifr:offset2>222</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 107, "BUS_TRANST", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Bus_Transt", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "BUS_TRANST", 112, 224, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"BUS_TRANST\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>112</ifr:offset1><ifr:offset2>224</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 108, "OVERHD_KEY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Overhd_Key", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "OVERHD_KEY", 113, 226, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"OVERHD_KEY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>113</ifr:offset1><ifr:offset2>226</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 109, "CSTG_SHEET", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cstg_Sheet", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "CSTG_SHEET", 114, 228, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CSTG_SHEET\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>114</ifr:offset1><ifr:offset2>228</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 110, "MATFRGTGRP", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Matfrgtgrp", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "MATFRGTGRP", 115, 230, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MATFRGTGRP\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>115</ifr:offset1><ifr:offset2>230</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 111, "PLDLVSHDIN", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Pldlvshdin", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PLDLVSHDIN", 116, 232, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PLDLVSHDIN\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>116</ifr:offset1><ifr:offset2>232</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 112, "SEQ_NO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Seq_No", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "SEQ_NO", 117, 234, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SEQ_NO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>117</ifr:offset1><ifr:offset2>234</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 113, "BIL_FORM", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Bil_Form", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "BIL_FORM", 118, 236, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"BIL_FORM\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>118</ifr:offset1><ifr:offset2>236</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 114, "DLI_PROFIL", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Dli_Profil", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "DLI_PROFIL", 119, 238, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DLI_PROFIL\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>119</ifr:offset1><ifr:offset2>238</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 115, "REV_TYPE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Rev_Type", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "REV_TYPE", 120, 240, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REV_TYPE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>120</ifr:offset1><ifr:offset2>240</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 116, "BEGDEM_PER", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Begdem_Per", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "BEGDEM_PER", 121, 242, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"BEGDEM_PER\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>121</ifr:offset1><ifr:offset2>242</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 117, "PR_REF_MAT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Pr_Ref_Mat", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PR_REF_MAT", 122, 244, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PR_REF_MAT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>122</ifr:offset1><ifr:offset2>244</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 118, "REFOBJTYPE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Refobjtype", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "REFOBJTYPE", 123, 246, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REFOBJTYPE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>123</ifr:offset1><ifr:offset2>246</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 119, "REFOBJKEY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Refobjkey", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "REFOBJKEY", 124, 248, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REFOBJKEY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>124</ifr:offset1><ifr:offset2>248</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 120, "REFLOGSYS", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Reflogsys", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "REFLOGSYS", 125, 250, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REFLOGSYS\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>125</ifr:offset1><ifr:offset2>250</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 121, "ORDER_PROB", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Order_Prob", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "ORDER_PROB", 126, 252, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ORDER_PROB\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>126</ifr:offset1><ifr:offset2>252</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 122, "MAX_PL_DLV", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Max_Pl_Dlv", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "MAX_PL_DLV", 127, 254, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MAX_PL_DLV\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>127</ifr:offset1><ifr:offset2>254</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 123, "CFOP_CODE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cfop_Code", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "CFOP_CODE", 128, 256, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CFOP_CODE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>128</ifr:offset1><ifr:offset2>256</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 124, "TAXLAWICMS", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Taxlawicms", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "TAXLAWICMS", 129, 258, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TAXLAWICMS\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>129</ifr:offset1><ifr:offset2>258</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 125, "TAXLAWIPI", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Taxlawipi", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "TAXLAWIPI", 130, 260, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TAXLAWIPI\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>130</ifr:offset1><ifr:offset2>260</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 126, "SD_TAXCODE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Sd_Taxcode", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "SD_TAXCODE", 131, 262, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SD_TAXCODE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>131</ifr:offset1><ifr:offset2>262</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 127, "ASSORT_MOD", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Assort_Mod", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "ASSORT_MOD", 132, 264, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ASSORT_MOD\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>132</ifr:offset1><ifr:offset2>264</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 128, "COMP_QUANT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Comp_Quant", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "COMP_QUANT", 133, 266, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"COMP_QUANT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>133</ifr:offset1><ifr:offset2>266</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 129, "TARGET_VAL", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Target_Val", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "TARGET_VAL", 134, 268, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TARGET_VAL\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>134</ifr:offset1><ifr:offset2>268</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 130, "PROFIT_CTR", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Profit_Ctr", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PROFIT_CTR", 135, 270, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PROFIT_CTR\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>135</ifr:offset1><ifr:offset2>270</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 131, "ORDERID", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Orderid", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "ORDERID", 136, 272, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ORDERID\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>136</ifr:offset1><ifr:offset2>272</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 132, "WBS_ELEM", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Wbs_Elem", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "WBS_ELEM", 137, 274, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"WBS_ELEM\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>137</ifr:offset1><ifr:offset2>274</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 133, "DEPREC_PER", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Deprec_Per", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "DEPREC_PER", 138, 276, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DEPREC_PER\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>138</ifr:offset1><ifr:offset2>276</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 134, "REF_DOC", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ref_Doc", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "REF_DOC", 139, 278, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REF_DOC\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>139</ifr:offset1><ifr:offset2>278</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 135, "REF_DOC_IT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ref_Doc_It", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "REF_DOC_IT", 140, 280, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REF_DOC_IT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>140</ifr:offset1><ifr:offset2>280</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 136, "REF_DOC_CA", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ref_Doc_Ca", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "REF_DOC_CA", 141, 282, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REF_DOC_CA\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>141</ifr:offset1><ifr:offset2>282</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 137, "CUST_MAT35", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cust_Mat35", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "CUST_MAT35", 142, 284, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CUST_MAT35\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>142</ifr:offset1><ifr:offset2>284</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 138, "EXCH_RATE_FI_V", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Exch_Rate_Fi_V", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "EXCH_RATE_FI_V", 143, 286, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"EXCH_RATE_FI_V\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>143</ifr:offset1><ifr:offset2>286</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 139, "EXCHG_RATE_V", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Exchg_Rate_V", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "EXCHG_RATE_V", 144, 288, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"EXCHG_RATE_V\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>144</ifr:offset1><ifr:offset2>288</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 140, "ITEMGUID_ATP", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Itemguid_Atp", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "ITEMGUID_ATP", 145, 290, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ITEMGUID_ATP\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>145</ifr:offset1><ifr:offset2>290</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 141, "VAL_CONTR", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Val_Contr", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "VAL_CONTR", 146, 292, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"VAL_CONTR\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>146</ifr:offset1><ifr:offset2>292</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 142, "VAL_CON_I", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Val_Con_I", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "VAL_CON_I", 147, 294, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"VAL_CON_I\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>147</ifr:offset1><ifr:offset2>294</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 143, "CONFIG_ID", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Config_Id", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "CONFIG_ID", 148, 296, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CONFIG_ID\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>148</ifr:offset1><ifr:offset2>296</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 144, "INST_ID", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Inst_Id", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "INST_ID", 149, 298, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"INST_ID\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>149</ifr:offset1><ifr:offset2>298</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 145, "MAT_EXT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Mat_Ext", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "MAT_EXT", 150, 300, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MAT_EXT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>150</ifr:offset1><ifr:offset2>300</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 146, "MAT_GUID", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Mat_Guid", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "MAT_GUID", 151, 302, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MAT_GUID\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>151</ifr:offset1><ifr:offset2>302</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 147, "MAT_VERS", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Mat_Vers", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "MAT_VERS", 152, 304, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MAT_VERS\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>152</ifr:offset1><ifr:offset2>304</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 148, "P_MAT_EXT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "P_Mat_Ext", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "P_MAT_EXT", 153, 306, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"P_MAT_EXT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>153</ifr:offset1><ifr:offset2>306</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 149, "P_MAT_GUID", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "P_Mat_Guid", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "P_MAT_GUID", 154, 308, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"P_MAT_GUID\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>154</ifr:offset1><ifr:offset2>308</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 150, "P_MAT_VERS", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "P_Mat_Vers", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "P_MAT_VERS", 155, 310, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"P_MAT_VERS\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>155</ifr:offset1><ifr:offset2>310</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 151, "FUNC_AREA", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Func_Area", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "FUNC_AREA", 156, 312, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"FUNC_AREA\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>156</ifr:offset1><ifr:offset2>312</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 152, "ALTERN_BOM", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Altern_Bom", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "ALTERN_BOM", 157, 314, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ALTERN_BOM\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>157</ifr:offset1><ifr:offset2>314</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 153, "FKK_CONACCT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Fkk_Conacct", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "FKK_CONACCT", 158, 316, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"FKK_CONACCT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>158</ifr:offset1><ifr:offset2>316</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 154, "EAN_UPC", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ean_Upc", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "EAN_UPC", 159, 318, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"EAN_UPC\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>159</ifr:offset1><ifr:offset2>318</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 155, "PRODCAT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Prodcat", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PRODCAT", 160, 320, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PRODCAT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>160</ifr:offset1><ifr:offset2>320</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 156, "SHIP_TYPE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ship_Type", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "SHIP_TYPE", 161, 322, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SHIP_TYPE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>161</ifr:offset1><ifr:offset2>322</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 157, "S_PROC_IND", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "S_Proc_Ind", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "S_PROC_IND", 162, 324, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"S_PROC_IND\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>162</ifr:offset1><ifr:offset2>324</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 158, "BILL_REL", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Bill_Rel", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "BILL_REL", 163, 326, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"BILL_REL\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>163</ifr:offset1><ifr:offset2>326</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 159, "VW_UEPOS", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Vw_Uepos", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "VW_UEPOS", 164, 328, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"VW_UEPOS\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>164</ifr:offset1><ifr:offset2>328</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 160, "CAMPAIGN", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Campaign", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "CAMPAIGN", 165, 330, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CAMPAIGN\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>165</ifr:offset1><ifr:offset2>330</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 161, "DLVSCHDUSE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Dlvschduse", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "DLVSCHDUSE", 166, 332, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DLVSCHDUSE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>166</ifr:offset1><ifr:offset2>332</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 162, "SELECTION", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Selection", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "SELECTION", 167, 334, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SELECTION\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>167</ifr:offset1><ifr:offset2>334</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 163, "MAT_ENTRD", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Mat_Entrd", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "MAT_ENTRD", 168, 336, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MAT_ENTRD\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>168</ifr:offset1><ifr:offset2>336</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 164, "LOG_SYSTEM_OWN", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Log_System_Own", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "LOG_SYSTEM_OWN", 169, 338, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"LOG_SYSTEM_OWN\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>169</ifr:offset1><ifr:offset2>338</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 165, "ITM_TYPE_USAGE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Itm_Type_Usage", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "ITM_TYPE_USAGE", 170, 340, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ITM_TYPE_USAGE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>170</ifr:offset1><ifr:offset2>340</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 166, "MAT_ENTRD_EXTERNAL", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Mat_Entrd_External", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "MAT_ENTRD_EXTERNAL", 171, 342, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MAT_ENTRD_EXTERNAL\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>171</ifr:offset1><ifr:offset2>342</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 167, "MAT_ENTRD_GUID", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Mat_Entrd_Guid", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "MAT_ENTRD_GUID", 172, 344, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MAT_ENTRD_GUID\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>172</ifr:offset1><ifr:offset2>344</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 168, "MAT_ENTRD_VERSION", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Mat_Entrd_Version", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "MAT_ENTRD_VERSION", 173, 346, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MAT_ENTRD_VERSION\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>173</ifr:offset1><ifr:offset2>346</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 169, "LOC_TAXCAT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Loc_Taxcat", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "LOC_TAXCAT", 174, 348, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"LOC_TAXCAT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>174</ifr:offset1><ifr:offset2>348</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 170, "LOC_ZEROVAT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Loc_Zerovat", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "LOC_ZEROVAT", 175, 350, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"LOC_ZEROVAT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>175</ifr:offset1><ifr:offset2>350</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 171, "LOC_ACTCODE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Loc_Actcode", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "LOC_ACTCODE", 176, 352, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"LOC_ACTCODE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>176</ifr:offset1><ifr:offset2>352</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 172, "LOC_DISTTYPE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Loc_Disttype", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "LOC_DISTTYPE", 177, 354, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"LOC_DISTTYPE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>177</ifr:offset1><ifr:offset2>354</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 173, "LOC_TXRELCLAS", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Loc_Txrelclas", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "LOC_TXRELCLAS", 178, 356, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"LOC_TXRELCLAS\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>178</ifr:offset1><ifr:offset2>356</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 174, "CALC_MOTIVE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Calc_Motive", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "CALC_MOTIVE", 179, 358, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CALC_MOTIVE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Updated information in related user data field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>179</ifr:offset1><ifr:offset2>358</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BAPIUPDATE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        staticDescriptor = descriptor;
    }
    public  BapisditmxType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    protected  BapisditmxType (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    
    public void setRef_Doc(java.lang.String Ref_Doc) {
        baseTypeData().setElementValue(134, Ref_Doc);
    }

    
    public java.lang.String getIncoterms1() {
        return (java.lang.String)baseTypeData().getElementValueAsString(40);
    }

    
    public void setRef_1(java.lang.String Ref_1) {
        baseTypeData().setElementValue(30, Ref_1);
    }

    
    public void setTaxlawipi(java.lang.String Taxlawipi) {
        baseTypeData().setElementValue(125, Taxlawipi);
    }

    
    public java.lang.String getUsage_Ind() {
        return (java.lang.String)baseTypeData().getElementValueAsString(75);
    }

    
    public java.lang.String getReason_Rej() {
        return (java.lang.String)baseTypeData().getElementValueAsString(10);
    }

    
    public java.lang.String getUnlmt_Dlv() {
        return (java.lang.String)baseTypeData().getElementValueAsString(77);
    }

    
    public java.lang.String getP_Mat_Ext() {
        return (java.lang.String)baseTypeData().getElementValueAsString(148);
    }

    
    public java.lang.String getRef_Doc_It() {
        return (java.lang.String)baseTypeData().getElementValueAsString(135);
    }

    
    public void setPrc_Group2(java.lang.String Prc_Group2) {
        baseTypeData().setElementValue(21, Prc_Group2);
    }

    
    public java.lang.String getDoc_Num_Fi() {
        return (java.lang.String)baseTypeData().getElementValueAsString(59);
    }

    
    public java.lang.String getNet_Weight() {
        return (java.lang.String)baseTypeData().getElementValueAsString(84);
    }

    
    public java.lang.String getT_Unit_Iso() {
        return (java.lang.String)baseTypeData().getElementValueAsString(17);
    }

    
    public void setPurch_No_S(java.lang.String Purch_No_S) {
        baseTypeData().setElementValue(31, Purch_No_S);
    }

    
    public java.lang.String getConfig_Id() {
        return (java.lang.String)baseTypeData().getElementValueAsString(143);
    }

    
    public java.lang.String getMatfrgtgrp() {
        return (java.lang.String)baseTypeData().getElementValueAsString(110);
    }

    
    public java.lang.String getNo_Gr_Post() {
        return (java.lang.String)baseTypeData().getElementValueAsString(106);
    }

    
    public void setTrgqty_Den(java.lang.String Trgqty_Den) {
        baseTypeData().setElementValue(70, Trgqty_Den);
    }

    
    public void setNet_Weight(java.lang.String Net_Weight) {
        baseTypeData().setElementValue(84, Net_Weight);
    }

    
    public void setShip_Point(java.lang.String Ship_Point) {
        baseTypeData().setElementValue(89, Ship_Point);
    }

    
    public java.lang.String getTax_Class5() {
        return (java.lang.String)baseTypeData().getElementValueAsString(95);
    }

    
    public void setDeprec_Per(java.lang.String Deprec_Per) {
        baseTypeData().setElementValue(133, Deprec_Per);
    }

    
    public void setT_Unit_Iso(java.lang.String T_Unit_Iso) {
        baseTypeData().setElementValue(17, T_Unit_Iso);
    }

    
    public java.lang.String getPurch_No_C() {
        return (java.lang.String)baseTypeData().getElementValueAsString(27);
    }

    
    public java.lang.String getAdd_Val_Dy() {
        return (java.lang.String)baseTypeData().getElementValueAsString(47);
    }

    
    public java.lang.String getIncoterms2() {
        return (java.lang.String)baseTypeData().getElementValueAsString(41);
    }

    
    public void setBill_Block(java.lang.String Bill_Block) {
        baseTypeData().setElementValue(11, Bill_Block);
    }

    
    public java.lang.String getDlv_Prio() {
        return (java.lang.String)baseTypeData().getElementValueAsString(88);
    }

    
    public java.lang.String getFixdat_Qty() {
        return (java.lang.String)baseTypeData().getElementValueAsString(102);
    }

    
    public java.lang.String getCstcndgrp5() {
        return (java.lang.String)baseTypeData().getElementValueAsString(66);
    }

    
    public java.lang.String getRef_Doc() {
        return (java.lang.String)baseTypeData().getElementValueAsString(134);
    }

    
    public java.lang.String getCstcndgrp4() {
        return (java.lang.String)baseTypeData().getElementValueAsString(65);
    }

    
    public void setTax_Class4(java.lang.String Tax_Class4) {
        baseTypeData().setElementValue(94, Tax_Class4);
    }

    
    public java.lang.String getCust_Mat22() {
        return (java.lang.String)baseTypeData().getElementValueAsString(6);
    }

    
    public void setLoc_Actcode(java.lang.String Loc_Actcode) {
        baseTypeData().setElementValue(171, Loc_Actcode);
    }

    
    public java.lang.String getTax_Class4() {
        return (java.lang.String)baseTypeData().getElementValueAsString(94);
    }

    
    public java.lang.String getMat_Pr_Grp() {
        return (java.lang.String)baseTypeData().getElementValueAsString(100);
    }

    
    public void setProdcat(java.lang.String Prodcat) {
        baseTypeData().setElementValue(155, Prodcat);
    }

    
    public void setRnddlv_Qty(java.lang.String Rnddlv_Qty) {
        baseTypeData().setElementValue(71, Rnddlv_Qty);
    }

    
    public void setMat_Entrd_Guid(java.lang.String Mat_Entrd_Guid) {
        baseTypeData().setElementValue(167, Mat_Entrd_Guid);
    }

    
    public void setBatch(java.lang.String Batch) {
        baseTypeData().setElementValue(7, Batch);
    }

    
    public void setBill_Sched(java.lang.String Bill_Sched) {
        baseTypeData().setElementValue(43, Bill_Sched);
    }

    
    public java.lang.String getFunc_Area() {
        return (java.lang.String)baseTypeData().getElementValueAsString(151);
    }

    
    public void setDlv_Prio(java.lang.String Dlv_Prio) {
        baseTypeData().setElementValue(88, Dlv_Prio);
    }

    
    public void setRefobjkey(java.lang.String Refobjkey) {
        baseTypeData().setElementValue(119, Refobjkey);
    }

    
    public void setLoc_Taxcat(java.lang.String Loc_Taxcat) {
        baseTypeData().setElementValue(169, Loc_Taxcat);
    }

    
    public java.lang.String getMat_Entrd_Guid() {
        return (java.lang.String)baseTypeData().getElementValueAsString(167);
    }

    
    public java.lang.String getCstcndgrp3() {
        return (java.lang.String)baseTypeData().getElementValueAsString(64);
    }

    
    public java.lang.String getPrice_Date() {
        return (java.lang.String)baseTypeData().getElementValueAsString(53);
    }

    
    public java.lang.String getPoitm_No_S() {
        return (java.lang.String)baseTypeData().getElementValueAsString(35);
    }

    
    public void setSd_Taxcode(java.lang.String Sd_Taxcode) {
        baseTypeData().setElementValue(126, Sd_Taxcode);
    }

    
    public java.lang.String getTax_Class7() {
        return (java.lang.String)baseTypeData().getElementValueAsString(97);
    }

    
    public java.lang.String getPo_Dat_S() {
        return (java.lang.String)baseTypeData().getElementValueAsString(32);
    }

    
    public java.lang.String getProdcat() {
        return (java.lang.String)baseTypeData().getElementValueAsString(155);
    }

    
    public void setPurch_No_C(java.lang.String Purch_No_C) {
        baseTypeData().setElementValue(27, Purch_No_C);
    }

    
    public java.lang.String getRefobjkey() {
        return (java.lang.String)baseTypeData().getElementValueAsString(119);
    }

    
    public java.lang.String getTrg_Qty_No() {
        return (java.lang.String)baseTypeData().getElementValueAsString(69);
    }

    
    public void setMat_Entrd_Version(java.lang.String Mat_Entrd_Version) {
        baseTypeData().setElementValue(168, Mat_Entrd_Version);
    }

    
    public void setItm_Type_Usage(java.lang.String Itm_Type_Usage) {
        baseTypeData().setElementValue(165, Itm_Type_Usage);
    }

    
    public void setCstcndgrp4(java.lang.String Cstcndgrp4) {
        baseTypeData().setElementValue(65, Cstcndgrp4);
    }

    
    public void setRef_Doc_It(java.lang.String Ref_Doc_It) {
        baseTypeData().setElementValue(135, Ref_Doc_It);
    }

    
    public void setDoc_Num_Fi(java.lang.String Doc_Num_Fi) {
        baseTypeData().setElementValue(59, Doc_Num_Fi);
    }

    
    public java.lang.String getCampaign() {
        return (java.lang.String)baseTypeData().getElementValueAsString(160);
    }

    
    public java.lang.String getAltern_Bom() {
        return (java.lang.String)baseTypeData().getElementValueAsString(152);
    }

    
    public java.lang.String getMn_Invoice() {
        return (java.lang.String)baseTypeData().getElementValueAsString(45);
    }

    
    public void setRefobjtype(java.lang.String Refobjtype) {
        baseTypeData().setElementValue(118, Refobjtype);
    }

    
    public java.lang.String getDunn_Key() {
        return (java.lang.String)baseTypeData().getElementValueAsString(55);
    }

    
    public java.lang.String getReqmts_Typ() {
        return (java.lang.String)baseTypeData().getElementValueAsString(105);
    }

    
    public void setDlv_Time(java.lang.String Dlv_Time) {
        baseTypeData().setElementValue(67, Dlv_Time);
    }

    
    public java.lang.String getVal_Type() {
        return (java.lang.String)baseTypeData().getElementValueAsString(101);
    }

    
    public void setAlt_To_Itm(java.lang.String Alt_To_Itm) {
        baseTypeData().setElementValue(5, Alt_To_Itm);
    }

    
    public java.lang.String getCstcndgrp2() {
        return (java.lang.String)baseTypeData().getElementValueAsString(63);
    }

    
    public java.lang.String getExchg_Rate_V() {
        return (java.lang.String)baseTypeData().getElementValueAsString(139);
    }

    
    public java.lang.String getMat_Vers() {
        return (java.lang.String)baseTypeData().getElementValueAsString(147);
    }

    
    public java.lang.String getTax_Class6() {
        return (java.lang.String)baseTypeData().getElementValueAsString(96);
    }

    
    public java.lang.String getCstg_Sheet() {
        return (java.lang.String)baseTypeData().getElementValueAsString(109);
    }

    
    public java.lang.String getRef_1() {
        return (java.lang.String)baseTypeData().getElementValueAsString(30);
    }

    
    public void setPart_Dlv(java.lang.String Part_Dlv) {
        baseTypeData().setElementValue(9, Part_Dlv);
    }

    
    public void setAdd_Val_Dy(java.lang.String Add_Val_Dy) {
        baseTypeData().setElementValue(47, Add_Val_Dy);
    }

    
    public java.lang.String getSalqtyden() {
        return (java.lang.String)baseTypeData().getElementValueAsString(82);
    }

    
    public void setResanalkey(java.lang.String Resanalkey) {
        baseTypeData().setElementValue(104, Resanalkey);
    }

    
    public void setFixdat_Qty(java.lang.String Fixdat_Qty) {
        baseTypeData().setElementValue(102, Fixdat_Qty);
    }

    
    public void setCstg_Sheet(java.lang.String Cstg_Sheet) {
        baseTypeData().setElementValue(109, Cstg_Sheet);
    }

    
    public java.lang.String getTax_Class9() {
        return (java.lang.String)baseTypeData().getElementValueAsString(99);
    }

    
    public void setUnlmt_Dlv(java.lang.String Unlmt_Dlv) {
        baseTypeData().setElementValue(77, Unlmt_Dlv);
    }

    
    public void setReason_Rej(java.lang.String Reason_Rej) {
        baseTypeData().setElementValue(10, Reason_Rej);
    }

    
    public java.lang.String getPymt_Meth() {
        return (java.lang.String)baseTypeData().getElementValueAsString(50);
    }

    
    public void setInvo_Sched(java.lang.String Invo_Sched) {
        baseTypeData().setElementValue(44, Invo_Sched);
    }

    
    public java.lang.String getUpdateflag() {
        return (java.lang.String)baseTypeData().getElementValueAsString(1);
    }

    
    public java.lang.String getMax_Pl_Dlv() {
        return (java.lang.String)baseTypeData().getElementValueAsString(122);
    }

    
    public java.lang.String getMaterial() {
        return (java.lang.String)baseTypeData().getElementValueAsString(4);
    }

    
    public java.lang.String getAlt_To_Itm() {
        return (java.lang.String)baseTypeData().getElementValueAsString(5);
    }

    
    public void setCust_Mat22(java.lang.String Cust_Mat22) {
        baseTypeData().setElementValue(6, Cust_Mat22);
    }

    
    public java.lang.String getDli_Profil() {
        return (java.lang.String)baseTypeData().getElementValueAsString(114);
    }

    
    public java.lang.String getExch_Rate_Fi_V() {
        return (java.lang.String)baseTypeData().getElementValueAsString(138);
    }

    
    public void setRef_1_S(java.lang.String Ref_1_S) {
        baseTypeData().setElementValue(34, Ref_1_S);
    }

    
    public void setRef_Doc_Ca(java.lang.String Ref_Doc_Ca) {
        baseTypeData().setElementValue(136, Ref_Doc_Ca);
    }

    
    public void setMat_Ext(java.lang.String Mat_Ext) {
        baseTypeData().setElementValue(145, Mat_Ext);
    }

    
    public void setVolunit(java.lang.String Volunit) {
        baseTypeData().setElementValue(87, Volunit);
    }

    
    public void setItm_Number(java.lang.String Itm_Number) {
        baseTypeData().setElementValue(0, Itm_Number);
    }

    
    public void setEx_Rate_Fi(java.lang.String Ex_Rate_Fi) {
        baseTypeData().setElementValue(46, Ex_Rate_Fi);
    }

    
    public void setUpdateflag(java.lang.String Updateflag) {
        baseTypeData().setElementValue(1, Updateflag);
    }

    
    public java.lang.String getSales_Dist() {
        return (java.lang.String)baseTypeData().getElementValueAsString(38);
    }

    
    public java.lang.String getPlant() {
        return (java.lang.String)baseTypeData().getElementValueAsString(13);
    }

    
    public java.lang.String getPo_Itm_No() {
        return (java.lang.String)baseTypeData().getElementValueAsString(3);
    }

    
    public void setPrice_Date(java.lang.String Price_Date) {
        baseTypeData().setElementValue(53, Price_Date);
    }

    
    public void setMaterial(java.lang.String Material) {
        baseTypeData().setElementValue(4, Material);
    }

    
    public void setItem_Categ(java.lang.String Item_Categ) {
        baseTypeData().setElementValue(18, Item_Categ);
    }

    
    public java.lang.String getShort_Text() {
        return (java.lang.String)baseTypeData().getElementValueAsString(19);
    }

    
    public java.lang.String getDepartm_No() {
        return (java.lang.String)baseTypeData().getElementValueAsString(60);
    }

    
    public void setReqmts_Typ(java.lang.String Reqmts_Typ) {
        baseTypeData().setElementValue(105, Reqmts_Typ);
    }

    
    public void setDli_Profil(java.lang.String Dli_Profil) {
        baseTypeData().setElementValue(114, Dli_Profil);
    }

    
    public void setPmtgar_Pro(java.lang.String Pmtgar_Pro) {
        baseTypeData().setElementValue(58, Pmtgar_Pro);
    }

    
    public java.lang.String getTax_Class8() {
        return (java.lang.String)baseTypeData().getElementValueAsString(98);
    }

    
    public java.lang.String getOrderid() {
        return (java.lang.String)baseTypeData().getElementValueAsString(131);
    }

    
    public void setLog_System_Own(java.lang.String Log_System_Own) {
        baseTypeData().setElementValue(164, Log_System_Own);
    }

    
    public void setPrc_Group1(java.lang.String Prc_Group1) {
        baseTypeData().setElementValue(20, Prc_Group1);
    }

    
    public void setUnddlv_Tol(java.lang.String Unddlv_Tol) {
        baseTypeData().setElementValue(79, Unddlv_Tol);
    }

    
    public void setOverhd_Key(java.lang.String Overhd_Key) {
        baseTypeData().setElementValue(108, Overhd_Key);
    }

    
    public java.lang.String getFixed_Quan() {
        return (java.lang.String)baseTypeData().getElementValueAsString(76);
    }

    
    public void setIncoterms1(java.lang.String Incoterms1) {
        baseTypeData().setElementValue(40, Incoterms1);
    }

    
    public void setInst_Id(java.lang.String Inst_Id) {
        baseTypeData().setElementValue(144, Inst_Id);
    }

    
    public java.lang.String getMatl_Group() {
        return (java.lang.String)baseTypeData().getElementValueAsString(26);
    }

    
    public void setAssort_Mod(java.lang.String Assort_Mod) {
        baseTypeData().setElementValue(127, Assort_Mod);
    }

    
    public void setLoc_Zerovat(java.lang.String Loc_Zerovat) {
        baseTypeData().setElementValue(170, Loc_Zerovat);
    }

    
    public void setShip_Type(java.lang.String Ship_Type) {
        baseTypeData().setElementValue(156, Ship_Type);
    }

    
    public java.lang.String getReflogsys() {
        return (java.lang.String)baseTypeData().getElementValueAsString(120);
    }

    
    public java.lang.String getUnddlv_Tol() {
        return (java.lang.String)baseTypeData().getElementValueAsString(79);
    }

    
    public java.lang.String getPmnttrms() {
        return (java.lang.String)baseTypeData().getElementValueAsString(49);
    }

    
    public void setVw_Uepos(java.lang.String Vw_Uepos) {
        baseTypeData().setElementValue(159, Vw_Uepos);
    }

    
    public java.lang.String getServ_Date() {
        return (java.lang.String)baseTypeData().getElementValueAsString(54);
    }

    
    public void setTax_Class9(java.lang.String Tax_Class9) {
        baseTypeData().setElementValue(99, Tax_Class9);
    }

    
    public java.lang.String getPurch_No_S() {
        return (java.lang.String)baseTypeData().getElementValueAsString(31);
    }

    
    public void setSales_Unit(java.lang.String Sales_Unit) {
        baseTypeData().setElementValue(68, Sales_Unit);
    }

    
    public void setTaxlawicms(java.lang.String Taxlawicms) {
        baseTypeData().setElementValue(124, Taxlawicms);
    }

    
    public java.lang.String getAssort_Mod() {
        return (java.lang.String)baseTypeData().getElementValueAsString(127);
    }

    
    public void setPrice_Grp(java.lang.String Price_Grp) {
        baseTypeData().setElementValue(36, Price_Grp);
    }

    
    public void setTarget_Qty(java.lang.String Target_Qty) {
        baseTypeData().setElementValue(15, Target_Qty);
    }

    
    public void setPldlvshdin(java.lang.String Pldlvshdin) {
        baseTypeData().setElementValue(111, Pldlvshdin);
    }

    
    public void setFkk_Conacct(java.lang.String Fkk_Conacct) {
        baseTypeData().setElementValue(153, Fkk_Conacct);
    }

    
    public java.lang.String getVal_Contr() {
        return (java.lang.String)baseTypeData().getElementValueAsString(141);
    }

    
    public void setDunn_Block(java.lang.String Dunn_Block) {
        baseTypeData().setElementValue(56, Dunn_Block);
    }

    
    public java.lang.String getBus_Transt() {
        return (java.lang.String)baseTypeData().getElementValueAsString(107);
    }

    
    public void setMat_Vers(java.lang.String Mat_Vers) {
        baseTypeData().setElementValue(147, Mat_Vers);
    }

    
    public java.lang.String getOverhd_Key() {
        return (java.lang.String)baseTypeData().getElementValueAsString(108);
    }

    
    public java.lang.String getTarget_Val() {
        return (java.lang.String)baseTypeData().getElementValueAsString(129);
    }

    
    public java.lang.String getPo_Method() {
        return (java.lang.String)baseTypeData().getElementValueAsString(29);
    }

    
    public void setMat_Entrd(java.lang.String Mat_Entrd) {
        baseTypeData().setElementValue(163, Mat_Entrd);
    }

    
    public void setAccnt_Asgn(java.lang.String Accnt_Asgn) {
        baseTypeData().setElementValue(51, Accnt_Asgn);
    }

    
    public void setSales_Dist(java.lang.String Sales_Dist) {
        baseTypeData().setElementValue(38, Sales_Dist);
    }

    
    public void setMatl_Group(java.lang.String Matl_Group) {
        baseTypeData().setElementValue(26, Matl_Group);
    }

    
    public java.lang.String getWbs_Elem() {
        return (java.lang.String)baseTypeData().getElementValueAsString(132);
    }

    
    public void setDivision(java.lang.String Division) {
        baseTypeData().setElementValue(80, Division);
    }

    
    public java.lang.String getVw_Uepos() {
        return (java.lang.String)baseTypeData().getElementValueAsString(159);
    }

    
    public java.lang.String getTarget_Qu() {
        return (java.lang.String)baseTypeData().getElementValueAsString(16);
    }

    
    public void setBill_Rel(java.lang.String Bill_Rel) {
        baseTypeData().setElementValue(158, Bill_Rel);
    }

    
    public java.lang.String getResanalkey() {
        return (java.lang.String)baseTypeData().getElementValueAsString(104);
    }

    
    public void setItemguid_Atp(java.lang.String Itemguid_Atp) {
        baseTypeData().setElementValue(140, Itemguid_Atp);
    }

    
    public java.lang.String getSelection() {
        return (java.lang.String)baseTypeData().getElementValueAsString(162);
    }

    
    public void setIncoterms2(java.lang.String Incoterms2) {
        baseTypeData().setElementValue(41, Incoterms2);
    }

    
    public void setTax_Class5(java.lang.String Tax_Class5) {
        baseTypeData().setElementValue(95, Tax_Class5);
    }

    
    public void setPurch_Date(java.lang.String Purch_Date) {
        baseTypeData().setElementValue(28, Purch_Date);
    }

    
    public java.lang.String getSeq_No() {
        return (java.lang.String)baseTypeData().getElementValueAsString(112);
    }

    
    public void setTarget_Qu(java.lang.String Target_Qu) {
        baseTypeData().setElementValue(16, Target_Qu);
    }

    
    public java.lang.String getPldlvshdin() {
        return (java.lang.String)baseTypeData().getElementValueAsString(111);
    }

    
    public java.lang.String getDlvschduse() {
        return (java.lang.String)baseTypeData().getElementValueAsString(161);
    }

    
    public void setShort_Text(java.lang.String Short_Text) {
        baseTypeData().setElementValue(19, Short_Text);
    }

    
    public java.lang.String getDivision() {
        return (java.lang.String)baseTypeData().getElementValueAsString(80);
    }

    
    public void setExchg_Rate_V(java.lang.String Exchg_Rate_V) {
        baseTypeData().setElementValue(139, Exchg_Rate_V);
    }

    
    public void setPrc_Group5(java.lang.String Prc_Group5) {
        baseTypeData().setElementValue(24, Prc_Group5);
    }

    
    public java.lang.String getBill_Rel() {
        return (java.lang.String)baseTypeData().getElementValueAsString(158);
    }

    
    public void setBegdem_Per(java.lang.String Begdem_Per) {
        baseTypeData().setElementValue(116, Begdem_Per);
    }

    
    public java.lang.String getStore_Loc() {
        return (java.lang.String)baseTypeData().getElementValueAsString(14);
    }

    
    public java.lang.String getCust_Mat35() {
        return (java.lang.String)baseTypeData().getElementValueAsString(137);
    }

    
    public java.lang.String getEx_Rate_Fi() {
        return (java.lang.String)baseTypeData().getElementValueAsString(46);
    }

    
    public void setPlant(java.lang.String Plant) {
        baseTypeData().setElementValue(13, Plant);
    }

    
    public java.lang.String getLoc_Taxcat() {
        return (java.lang.String)baseTypeData().getElementValueAsString(169);
    }

    
    public void setUsage_Ind(java.lang.String Usage_Ind) {
        baseTypeData().setElementValue(75, Usage_Ind);
    }

    
    public java.lang.String getMat_Entrd_External() {
        return (java.lang.String)baseTypeData().getElementValueAsString(166);
    }

    
    public java.lang.String getBegdem_Per() {
        return (java.lang.String)baseTypeData().getElementValueAsString(116);
    }

    
    public java.lang.String getProd_Hiera() {
        return (java.lang.String)baseTypeData().getElementValueAsString(25);
    }

    
    public void setPmnttrms(java.lang.String Pmnttrms) {
        baseTypeData().setElementValue(49, Pmnttrms);
    }

    
    public void setMax_Pl_Dlv(java.lang.String Max_Pl_Dlv) {
        baseTypeData().setElementValue(122, Max_Pl_Dlv);
    }

    
    public java.lang.String getSalqtynum() {
        return (java.lang.String)baseTypeData().getElementValueAsString(81);
    }

    
    public java.lang.String getLoc_Txrelclas() {
        return (java.lang.String)baseTypeData().getElementValueAsString(173);
    }

    
    public java.lang.String getRef_1_S() {
        return (java.lang.String)baseTypeData().getElementValueAsString(34);
    }

    
    public java.lang.String getFix_Val_Dy() {
        return (java.lang.String)baseTypeData().getElementValueAsString(48);
    }

    
    public void setOverdlvtol(java.lang.String Overdlvtol) {
        baseTypeData().setElementValue(78, Overdlvtol);
    }

    
    public void setFunc_Area(java.lang.String Func_Area) {
        baseTypeData().setElementValue(151, Func_Area);
    }

    
    public java.lang.String getTaxlawicms() {
        return (java.lang.String)baseTypeData().getElementValueAsString(124);
    }

    
    public void setReflogsys(java.lang.String Reflogsys) {
        baseTypeData().setElementValue(120, Reflogsys);
    }

    
    public void setExch_Rate_Fi_V(java.lang.String Exch_Rate_Fi_V) {
        baseTypeData().setElementValue(138, Exch_Rate_Fi_V);
    }

    
    public java.lang.String getTaxlawipi() {
        return (java.lang.String)baseTypeData().getElementValueAsString(125);
    }

    
    public java.lang.String getBill_Sched() {
        return (java.lang.String)baseTypeData().getElementValueAsString(43);
    }

    
    public void setNo_Gr_Post(java.lang.String No_Gr_Post) {
        baseTypeData().setElementValue(106, No_Gr_Post);
    }

    
    public void setVal_Con_I(java.lang.String Val_Con_I) {
        baseTypeData().setElementValue(142, Val_Con_I);
    }

    
    public java.lang.String getLoc_Zerovat() {
        return (java.lang.String)baseTypeData().getElementValueAsString(170);
    }

    
    public void setVal_Contr(java.lang.String Val_Contr) {
        baseTypeData().setElementValue(141, Val_Contr);
    }

    
    public java.lang.String getInvo_Sched() {
        return (java.lang.String)baseTypeData().getElementValueAsString(44);
    }

    
    public java.lang.String getUntof_Wght() {
        return (java.lang.String)baseTypeData().getElementValueAsString(85);
    }

    
    public void setP_Mat_Vers(java.lang.String P_Mat_Vers) {
        baseTypeData().setElementValue(150, P_Mat_Vers);
    }

    
    public java.lang.String getBil_Form() {
        return (java.lang.String)baseTypeData().getElementValueAsString(113);
    }

    
    public void setBus_Transt(java.lang.String Bus_Transt) {
        baseTypeData().setElementValue(107, Bus_Transt);
    }

    
    public java.lang.String getLoc_Actcode() {
        return (java.lang.String)baseTypeData().getElementValueAsString(171);
    }

    
    public java.lang.String getBomexpl_No() {
        return (java.lang.String)baseTypeData().getElementValueAsString(103);
    }

    
    public java.lang.String getDunn_Block() {
        return (java.lang.String)baseTypeData().getElementValueAsString(56);
    }

    
    public java.lang.String getExchg_Rate() {
        return (java.lang.String)baseTypeData().getElementValueAsString(52);
    }

    
    public void setCstcndgrp1(java.lang.String Cstcndgrp1) {
        baseTypeData().setElementValue(62, Cstcndgrp1);
    }

    
    public java.lang.String getMaxdev_Day() {
        return (java.lang.String)baseTypeData().getElementValueAsString(74);
    }

    
    public java.lang.String getMat_Guid() {
        return (java.lang.String)baseTypeData().getElementValueAsString(146);
    }

    
    public java.lang.String getRoute() {
        return (java.lang.String)baseTypeData().getElementValueAsString(90);
    }

    
    public void setCfop_Code(java.lang.String Cfop_Code) {
        baseTypeData().setElementValue(123, Cfop_Code);
    }

    
    public java.lang.String getPmtgar_Pro() {
        return (java.lang.String)baseTypeData().getElementValueAsString(58);
    }

    
    public void setCstcndgrp2(java.lang.String Cstcndgrp2) {
        baseTypeData().setElementValue(63, Cstcndgrp2);
    }

    
    public java.lang.String getMaxdevper() {
        return (java.lang.String)baseTypeData().getElementValueAsString(73);
    }

    
    public java.lang.String getRev_Type() {
        return (java.lang.String)baseTypeData().getElementValueAsString(115);
    }

    
    public void setExchg_Rate(java.lang.String Exchg_Rate) {
        baseTypeData().setElementValue(52, Exchg_Rate);
    }

    
    public void setMatfrgtgrp(java.lang.String Matfrgtgrp) {
        baseTypeData().setElementValue(110, Matfrgtgrp);
    }

    
    public void setWbs_Elem(java.lang.String Wbs_Elem) {
        baseTypeData().setElementValue(132, Wbs_Elem);
    }

    
    public java.lang.String getRefobjtype() {
        return (java.lang.String)baseTypeData().getElementValueAsString(118);
    }

    
    public void setCalc_Motive(java.lang.String Calc_Motive) {
        baseTypeData().setElementValue(174, Calc_Motive);
    }

    
    public java.lang.String getDeprec_Per() {
        return (java.lang.String)baseTypeData().getElementValueAsString(133);
    }

    
    public void setProfit_Ctr(java.lang.String Profit_Ctr) {
        baseTypeData().setElementValue(130, Profit_Ctr);
    }

    
    public void setTax_Class7(java.lang.String Tax_Class7) {
        baseTypeData().setElementValue(97, Tax_Class7);
    }

    
    public java.lang.String getComp_Quant() {
        return (java.lang.String)baseTypeData().getElementValueAsString(128);
    }

    
    public void setVal_Type(java.lang.String Val_Type) {
        baseTypeData().setElementValue(101, Val_Type);
    }

    
    public void setLoc_Txrelclas(java.lang.String Loc_Txrelclas) {
        baseTypeData().setElementValue(173, Loc_Txrelclas);
    }

    
    public void setMat_Pr_Grp(java.lang.String Mat_Pr_Grp) {
        baseTypeData().setElementValue(100, Mat_Pr_Grp);
    }

    
    public void setPymt_Meth(java.lang.String Pymt_Meth) {
        baseTypeData().setElementValue(50, Pymt_Meth);
    }

    
    public java.lang.String getCust_Group() {
        return (java.lang.String)baseTypeData().getElementValueAsString(37);
    }

    
    public java.lang.String getPurch_Date() {
        return (java.lang.String)baseTypeData().getElementValueAsString(28);
    }

    
    public void setMaxdevper(java.lang.String Maxdevper) {
        baseTypeData().setElementValue(73, Maxdevper);
    }

    
    public void setTax_Class3(java.lang.String Tax_Class3) {
        baseTypeData().setElementValue(93, Tax_Class3);
    }

    
    public void setProd_Hiera(java.lang.String Prod_Hiera) {
        baseTypeData().setElementValue(25, Prod_Hiera);
    }

    
    public java.lang.String getVolume() {
        return (java.lang.String)baseTypeData().getElementValueAsString(86);
    }

    
    public void setSelection(java.lang.String Selection) {
        baseTypeData().setElementValue(162, Selection);
    }

    
    public java.lang.String getProfit_Ctr() {
        return (java.lang.String)baseTypeData().getElementValueAsString(130);
    }

    
    public java.lang.String getRnddlv_Qty() {
        return (java.lang.String)baseTypeData().getElementValueAsString(71);
    }

    
    public java.lang.String getLoc_Disttype() {
        return (java.lang.String)baseTypeData().getElementValueAsString(172);
    }

    
    public java.lang.String getMat_Entrd() {
        return (java.lang.String)baseTypeData().getElementValueAsString(163);
    }

    
    public void setDlvschduse(java.lang.String Dlvschduse) {
        baseTypeData().setElementValue(161, Dlvschduse);
    }

    
    public void setComp_Quant(java.lang.String Comp_Quant) {
        baseTypeData().setElementValue(128, Comp_Quant);
    }

    
    public java.lang.String getBill_Block() {
        return (java.lang.String)baseTypeData().getElementValueAsString(11);
    }

    
    public void setOrder_Prob(java.lang.String Order_Prob) {
        baseTypeData().setElementValue(121, Order_Prob);
    }

    
    public void setCstcndgrp5(java.lang.String Cstcndgrp5) {
        baseTypeData().setElementValue(66, Cstcndgrp5);
    }

    
    public void setFix_Val_Dy(java.lang.String Fix_Val_Dy) {
        baseTypeData().setElementValue(48, Fix_Val_Dy);
    }

    
    public void setUntof_Wght(java.lang.String Untof_Wght) {
        baseTypeData().setElementValue(85, Untof_Wght);
    }

    
    public java.lang.String getS_Proc_Ind() {
        return (java.lang.String)baseTypeData().getElementValueAsString(157);
    }

    
    public void setP_Mat_Ext(java.lang.String P_Mat_Ext) {
        baseTypeData().setElementValue(148, P_Mat_Ext);
    }

    
    public void setOrderid(java.lang.String Orderid) {
        baseTypeData().setElementValue(131, Orderid);
    }

    
    public java.lang.String getRec_Point() {
        return (java.lang.String)baseTypeData().getElementValueAsString(61);
    }

    
    public void setTrg_Qty_No(java.lang.String Trg_Qty_No) {
        baseTypeData().setElementValue(69, Trg_Qty_No);
    }

    
    public java.lang.String getTarget_Qty() {
        return (java.lang.String)baseTypeData().getElementValueAsString(15);
    }

    
    public void setOrdcomp_In(java.lang.String Ordcomp_In) {
        baseTypeData().setElementValue(42, Ordcomp_In);
    }

    
    public void setPoitm_No_S(java.lang.String Poitm_No_S) {
        baseTypeData().setElementValue(35, Poitm_No_S);
    }

    
    public java.lang.String getBatch() {
        return (java.lang.String)baseTypeData().getElementValueAsString(7);
    }

    
    public java.lang.String getFkk_Conacct() {
        return (java.lang.String)baseTypeData().getElementValueAsString(153);
    }

    
    public void setConfig_Id(java.lang.String Config_Id) {
        baseTypeData().setElementValue(143, Config_Id);
    }

    
    public void setPo_Meth_S(java.lang.String Po_Meth_S) {
        baseTypeData().setElementValue(33, Po_Meth_S);
    }

    
    public java.lang.String getAccnt_Asgn() {
        return (java.lang.String)baseTypeData().getElementValueAsString(51);
    }

    
    public java.lang.String getPrc_Group1() {
        return (java.lang.String)baseTypeData().getElementValueAsString(20);
    }

    
    public java.lang.String getPrc_Group5() {
        return (java.lang.String)baseTypeData().getElementValueAsString(24);
    }

    
    public void setSalqtyden(java.lang.String Salqtyden) {
        baseTypeData().setElementValue(82, Salqtyden);
    }

    
    public java.lang.String getCalc_Motive() {
        return (java.lang.String)baseTypeData().getElementValueAsString(174);
    }

    
    public java.lang.String getTax_Class2() {
        return (java.lang.String)baseTypeData().getElementValueAsString(92);
    }

    
    public void setPrc_Group3(java.lang.String Prc_Group3) {
        baseTypeData().setElementValue(22, Prc_Group3);
    }

    
    public java.lang.String getBill_Date() {
        return (java.lang.String)baseTypeData().getElementValueAsString(12);
    }

    
    public java.lang.String getCstcndgrp1() {
        return (java.lang.String)baseTypeData().getElementValueAsString(62);
    }

    
    public void setPo_Itm_No(java.lang.String Po_Itm_No) {
        baseTypeData().setElementValue(3, Po_Itm_No);
    }

    
    public void setPrice_List(java.lang.String Price_List) {
        baseTypeData().setElementValue(39, Price_List);
    }

    
    public java.lang.String getPrice_List() {
        return (java.lang.String)baseTypeData().getElementValueAsString(39);
    }

    
    public java.lang.String getGross_Wght() {
        return (java.lang.String)baseTypeData().getElementValueAsString(83);
    }

    
    public void setCstcndgrp3(java.lang.String Cstcndgrp3) {
        baseTypeData().setElementValue(64, Cstcndgrp3);
    }

    
    public java.lang.String getItm_Type_Usage() {
        return (java.lang.String)baseTypeData().getElementValueAsString(165);
    }

    
    public void setStore_Loc(java.lang.String Store_Loc) {
        baseTypeData().setElementValue(14, Store_Loc);
    }

    
    public void setPr_Ref_Mat(java.lang.String Pr_Ref_Mat) {
        baseTypeData().setElementValue(117, Pr_Ref_Mat);
    }

    
    public void setS_Proc_Ind(java.lang.String S_Proc_Ind) {
        baseTypeData().setElementValue(157, S_Proc_Ind);
    }

    
    public java.lang.String getOverdlvtol() {
        return (java.lang.String)baseTypeData().getElementValueAsString(78);
    }

    
    public void setCust_Group(java.lang.String Cust_Group) {
        baseTypeData().setElementValue(37, Cust_Group);
    }

    
    public void setMat_Entrd_External(java.lang.String Mat_Entrd_External) {
        baseTypeData().setElementValue(166, Mat_Entrd_External);
    }

    
    public java.lang.String getMat_Ext() {
        return (java.lang.String)baseTypeData().getElementValueAsString(145);
    }

    
    public java.lang.String getPrc_Group4() {
        return (java.lang.String)baseTypeData().getElementValueAsString(23);
    }

    
    public void setMat_Guid(java.lang.String Mat_Guid) {
        baseTypeData().setElementValue(146, Mat_Guid);
    }

    
    public void setLoc_Disttype(java.lang.String Loc_Disttype) {
        baseTypeData().setElementValue(172, Loc_Disttype);
    }

    
    public java.lang.String getPo_Meth_S() {
        return (java.lang.String)baseTypeData().getElementValueAsString(33);
    }

    
    public java.lang.String getPart_Dlv() {
        return (java.lang.String)baseTypeData().getElementValueAsString(9);
    }

    
    public java.lang.String getTrgqty_Den() {
        return (java.lang.String)baseTypeData().getElementValueAsString(70);
    }

    
    public void setRev_Type(java.lang.String Rev_Type) {
        baseTypeData().setElementValue(115, Rev_Type);
    }

    
    public java.lang.String getTax_Class3() {
        return (java.lang.String)baseTypeData().getElementValueAsString(93);
    }

    
    public java.lang.String getCfop_Code() {
        return (java.lang.String)baseTypeData().getElementValueAsString(123);
    }

    
    public java.lang.String getP_Mat_Vers() {
        return (java.lang.String)baseTypeData().getElementValueAsString(150);
    }

    
    public java.lang.String getShip_Point() {
        return (java.lang.String)baseTypeData().getElementValueAsString(89);
    }

    
    public void setMaxdev_Day(java.lang.String Maxdev_Day) {
        baseTypeData().setElementValue(74, Maxdev_Day);
    }

    
    public java.lang.String getHg_Lv_Item() {
        return (java.lang.String)baseTypeData().getElementValueAsString(2);
    }

    
    public java.lang.String getMat_Entrd_Version() {
        return (java.lang.String)baseTypeData().getElementValueAsString(168);
    }

    
    public void setSalqtynum(java.lang.String Salqtynum) {
        baseTypeData().setElementValue(81, Salqtynum);
    }

    
    public void setVolume(java.lang.String Volume) {
        baseTypeData().setElementValue(86, Volume);
    }

    
    public java.lang.String getMaxdevamnt() {
        return (java.lang.String)baseTypeData().getElementValueAsString(72);
    }

    
    public void setPo_Method(java.lang.String Po_Method) {
        baseTypeData().setElementValue(29, Po_Method);
    }

    
    public void setDlv_Group(java.lang.String Dlv_Group) {
        baseTypeData().setElementValue(8, Dlv_Group);
    }

    
    public void setBill_Date(java.lang.String Bill_Date) {
        baseTypeData().setElementValue(12, Bill_Date);
    }

    
    public void setPromotion(java.lang.String Promotion) {
        baseTypeData().setElementValue(57, Promotion);
    }

    
    public java.lang.String getLog_System_Own() {
        return (java.lang.String)baseTypeData().getElementValueAsString(164);
    }

    
    public void setSeq_No(java.lang.String Seq_No) {
        baseTypeData().setElementValue(112, Seq_No);
    }

    
    public void setServ_Date(java.lang.String Serv_Date) {
        baseTypeData().setElementValue(54, Serv_Date);
    }

    
    public void setBomexpl_No(java.lang.String Bomexpl_No) {
        baseTypeData().setElementValue(103, Bomexpl_No);
    }

    
    public java.lang.String getPromotion() {
        return (java.lang.String)baseTypeData().getElementValueAsString(57);
    }

    
    public java.lang.String getPrc_Group3() {
        return (java.lang.String)baseTypeData().getElementValueAsString(22);
    }

    
    public void setMaxdevamnt(java.lang.String Maxdevamnt) {
        baseTypeData().setElementValue(72, Maxdevamnt);
    }

    
    public java.lang.String getInst_Id() {
        return (java.lang.String)baseTypeData().getElementValueAsString(144);
    }

    
    public void setTax_Class1(java.lang.String Tax_Class1) {
        baseTypeData().setElementValue(91, Tax_Class1);
    }

    
    public java.lang.String getVolunit() {
        return (java.lang.String)baseTypeData().getElementValueAsString(87);
    }

    
    public java.lang.String getPr_Ref_Mat() {
        return (java.lang.String)baseTypeData().getElementValueAsString(117);
    }

    
    public void setMn_Invoice(java.lang.String Mn_Invoice) {
        baseTypeData().setElementValue(45, Mn_Invoice);
    }

    
    public void setP_Mat_Guid(java.lang.String P_Mat_Guid) {
        baseTypeData().setElementValue(149, P_Mat_Guid);
    }

    
    public java.lang.String getSd_Taxcode() {
        return (java.lang.String)baseTypeData().getElementValueAsString(126);
    }

    
    public void setTarget_Val(java.lang.String Target_Val) {
        baseTypeData().setElementValue(129, Target_Val);
    }

    
    public void setFixed_Quan(java.lang.String Fixed_Quan) {
        baseTypeData().setElementValue(76, Fixed_Quan);
    }

    
    public void setDunn_Key(java.lang.String Dunn_Key) {
        baseTypeData().setElementValue(55, Dunn_Key);
    }

    
    public MetaData metadata() {
        return metadata;
    }

    
    public java.lang.String getEan_Upc() {
        return (java.lang.String)baseTypeData().getElementValueAsString(154);
    }

    
    public void setRec_Point(java.lang.String Rec_Point) {
        baseTypeData().setElementValue(61, Rec_Point);
    }

    
    public java.lang.String getOrdcomp_In() {
        return (java.lang.String)baseTypeData().getElementValueAsString(42);
    }

    
    public java.lang.String getItem_Categ() {
        return (java.lang.String)baseTypeData().getElementValueAsString(18);
    }

    
    public void setTax_Class6(java.lang.String Tax_Class6) {
        baseTypeData().setElementValue(96, Tax_Class6);
    }

    
    public void setRoute(java.lang.String Route) {
        baseTypeData().setElementValue(90, Route);
    }

    
    public java.lang.String getPrc_Group2() {
        return (java.lang.String)baseTypeData().getElementValueAsString(21);
    }

    
    public void setPrc_Group4(java.lang.String Prc_Group4) {
        baseTypeData().setElementValue(23, Prc_Group4);
    }

    
    public void setEan_Upc(java.lang.String Ean_Upc) {
        baseTypeData().setElementValue(154, Ean_Upc);
    }

    
    public void setTax_Class2(java.lang.String Tax_Class2) {
        baseTypeData().setElementValue(92, Tax_Class2);
    }

    
    public java.lang.String getVal_Con_I() {
        return (java.lang.String)baseTypeData().getElementValueAsString(142);
    }

    
    public void setCust_Mat35(java.lang.String Cust_Mat35) {
        baseTypeData().setElementValue(137, Cust_Mat35);
    }

    
    public java.lang.String getDlv_Group() {
        return (java.lang.String)baseTypeData().getElementValueAsString(8);
    }

    
    public void setTax_Class8(java.lang.String Tax_Class8) {
        baseTypeData().setElementValue(98, Tax_Class8);
    }

    
    public void setDepartm_No(java.lang.String Departm_No) {
        baseTypeData().setElementValue(60, Departm_No);
    }

    
    public java.lang.String getP_Mat_Guid() {
        return (java.lang.String)baseTypeData().getElementValueAsString(149);
    }

    
    public void setHg_Lv_Item(java.lang.String Hg_Lv_Item) {
        baseTypeData().setElementValue(2, Hg_Lv_Item);
    }

    
    public java.lang.String getTax_Class1() {
        return (java.lang.String)baseTypeData().getElementValueAsString(91);
    }

    
    public java.lang.String getDlv_Time() {
        return (java.lang.String)baseTypeData().getElementValueAsString(67);
    }

    
    public java.lang.String getItemguid_Atp() {
        return (java.lang.String)baseTypeData().getElementValueAsString(140);
    }

    
    public java.lang.String getSales_Unit() {
        return (java.lang.String)baseTypeData().getElementValueAsString(68);
    }

    
    public void setBil_Form(java.lang.String Bil_Form) {
        baseTypeData().setElementValue(113, Bil_Form);
    }

    
    public java.lang.String getItm_Number() {
        return (java.lang.String)baseTypeData().getElementValueAsString(0);
    }

    
    public java.lang.String getRef_Doc_Ca() {
        return (java.lang.String)baseTypeData().getElementValueAsString(136);
    }

    
    public void setGross_Wght(java.lang.String Gross_Wght) {
        baseTypeData().setElementValue(83, Gross_Wght);
    }

    
    public java.lang.String getShip_Type() {
        return (java.lang.String)baseTypeData().getElementValueAsString(156);
    }

    
    public void setPo_Dat_S(java.lang.String Po_Dat_S) {
        baseTypeData().setElementValue(32, Po_Dat_S);
    }

    
    public void setCampaign(java.lang.String Campaign) {
        baseTypeData().setElementValue(160, Campaign);
    }

    
    public void setAltern_Bom(java.lang.String Altern_Bom) {
        baseTypeData().setElementValue(152, Altern_Bom);
    }

    
    public java.lang.String getOrder_Prob() {
        return (java.lang.String)baseTypeData().getElementValueAsString(121);
    }

    
    public java.lang.String getPrice_Grp() {
        return (java.lang.String)baseTypeData().getElementValueAsString(36);
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  BapisditmxType parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (BapisditmxType parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPldlvshdin() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(111);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getIncoterms1() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(40);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDlvschduse() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(161);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getUsage_Ind() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(75);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDivision() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(80);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getReason_Rej() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(10);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getUnlmt_Dlv() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(77);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getBill_Rel() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(158);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getStore_Loc() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(14);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCust_Mat35() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(137);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getP_Mat_Ext() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(148);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRef_Doc_It() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(135);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getEx_Rate_Fi() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(46);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getLoc_Taxcat() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(169);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMat_Entrd_External() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(166);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDoc_Num_Fi() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(59);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getNet_Weight() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(84);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getT_Unit_Iso() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(17);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getBegdem_Per() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(116);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getProd_Hiera() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(25);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getConfig_Id() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(143);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMatfrgtgrp() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(110);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getNo_Gr_Post() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(106);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSalqtynum() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(81);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getLoc_Txrelclas() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(173);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRef_1_S() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(34);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getFix_Val_Dy() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(48);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTax_Class5() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(95);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTaxlawicms() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(124);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPurch_No_C() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(27);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTaxlawipi() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(125);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getAdd_Val_Dy() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(47);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getIncoterms2() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(41);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getBill_Sched() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(43);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDlv_Prio() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(88);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getFixdat_Qty() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(102);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCstcndgrp5() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(66);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getLoc_Zerovat() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(170);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRef_Doc() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(134);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getInvo_Sched() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(44);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getUntof_Wght() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(85);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCstcndgrp4() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(65);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCust_Mat22() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(6);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTax_Class4() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(94);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getBil_Form() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(113);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMat_Pr_Grp() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(100);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getLoc_Actcode() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(171);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getBomexpl_No() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(103);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDunn_Block() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(56);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getExchg_Rate() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(52);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMaxdev_Day() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(74);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMat_Guid() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(146);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRoute() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(90);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPmtgar_Pro() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(58);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMaxdevper() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(73);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRev_Type() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(115);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getFunc_Area() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(151);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRefobjtype() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(118);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMat_Entrd_Guid() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(167);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCstcndgrp3() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(64);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPrice_Date() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(53);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDeprec_Per() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(133);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPoitm_No_S() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(35);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getComp_Quant() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(128);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTax_Class7() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(97);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPo_Dat_S() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(32);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getProdcat() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(155);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCust_Group() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(37);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPurch_Date() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(28);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRefobjkey() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(119);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getVolume() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(86);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTrg_Qty_No() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(69);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getProfit_Ctr() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(130);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRnddlv_Qty() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(71);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getLoc_Disttype() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(172);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMat_Entrd() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(163);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCampaign() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(160);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getAltern_Bom() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(152);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMn_Invoice() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(45);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getBill_Block() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(11);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDunn_Key() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(55);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getReqmts_Typ() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(105);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getVal_Type() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(101);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getS_Proc_Ind() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(157);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRec_Point() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(61);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCstcndgrp2() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(63);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getExchg_Rate_V() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(139);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMat_Vers() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(147);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTarget_Qty() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(15);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getBatch() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(7);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getFkk_Conacct() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(153);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTax_Class6() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(96);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCstg_Sheet() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(109);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRef_1() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(30);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSalqtyden() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(82);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getAccnt_Asgn() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(51);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPrc_Group5() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(24);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPrc_Group1() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(20);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCalc_Motive() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(174);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTax_Class9() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(99);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTax_Class2() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(92);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPymt_Meth() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(50);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getUpdateflag() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMax_Pl_Dlv() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(122);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getAlt_To_Itm() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(5);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMaterial() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(4);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getBill_Date() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(12);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCstcndgrp1() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(62);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDli_Profil() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(114);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getExch_Rate_Fi_V() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(138);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPrice_List() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(39);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getGross_Wght() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(83);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getItm_Type_Usage() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(165);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getOverdlvtol() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(78);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSales_Dist() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(38);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMat_Ext() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(145);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPrc_Group4() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(23);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPo_Meth_S() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(33);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPart_Dlv() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(9);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPlant() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(13);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTrgqty_Den() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(70);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPo_Itm_No() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTax_Class3() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(93);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCfop_Code() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(123);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getShort_Text() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(19);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDepartm_No() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(60);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getP_Mat_Vers() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(150);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getShip_Point() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(89);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTax_Class8() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(98);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getHg_Lv_Item() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMat_Entrd_Version() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(168);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getOrderid() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(131);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMaxdevamnt() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(72);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getLog_System_Own() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(164);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getFixed_Quan() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(76);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPromotion() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(57);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMatl_Group() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(26);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPrc_Group3() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(22);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getInst_Id() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(144);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getReflogsys() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(120);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getUnddlv_Tol() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(79);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getVolunit() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(87);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPr_Ref_Mat() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(117);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSd_Taxcode() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(126);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPmnttrms() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(49);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getServ_Date() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(54);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPurch_No_S() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(31);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getEan_Upc() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(154);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getAssort_Mod() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(127);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getOrdcomp_In() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(42);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getVal_Contr() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(141);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getBus_Transt() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(107);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getItem_Categ() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(18);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getOverhd_Key() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(108);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPrc_Group2() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(21);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTarget_Val() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(129);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPo_Method() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(29);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getVal_Con_I() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(142);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getWbs_Elem() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(132);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDlv_Group() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(8);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getVw_Uepos() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(159);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getP_Mat_Guid() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(149);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTarget_Qu() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(16);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTax_Class1() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(91);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDlv_Time() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(67);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getItemguid_Atp() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(140);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getResanalkey() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(104);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSales_Unit() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(68);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSelection() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(162);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getItm_Number() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRef_Doc_Ca() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(136);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getShip_Type() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(156);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSeq_No() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(112);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getOrder_Prob() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(121);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPrice_Grp() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(36);
        }
    
    }

}
