package hmh.sap.rfc;


public class Bapi_Mara_GaType extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1335984408563L) ;

    private  Bapi_Mara_GaType.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.XSDL_COMPLEX_TYPE, "urn:sap-com:document:sap:rfc:functions", "BAPI_MARA_GA", 108, 0, hmh.sap.rfc.Bapi_Mara_GaType.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "BAPI_MARA_GA", 834, 1624, -1, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"BAPI_MARA_GA\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Material Data at Client Level</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>834</ifr:internalLength1><ifr:internalLength2>1624</ifr:internalLength2></ifr:definition></ifr:container></s0:type>");
        descriptorSetElementProperties(descriptor, 0, "MATERIAL", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Material", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "18"}}, "MATERIAL", 0, 0, -1, 18, 36, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MATERIAL\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Material Number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>0</ifr:offset1><ifr:offset2>0</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MATNR\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>18</ifr:length><ifr:internalLength1>18</ifr:internalLength1><ifr:internalLength2>36</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>18</ifr:outputLength><ifr:conversionExit>MATN1</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 1, "IND_SECTOR", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ind_Sector", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "IND_SECTOR", 18, 36, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"IND_SECTOR\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Industry Sector</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>18</ifr:offset1><ifr:offset2>36</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MBRSH\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 2, "MATL_TYPE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Matl_Type", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "MATL_TYPE", 19, 38, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MATL_TYPE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Material Type</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>19</ifr:offset1><ifr:offset2>38</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MTART\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 3, "CREATED_ON", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Created_On", java.sql.Date.class, null, new java.lang.String[][]{}, "CREATED_ON", 23, 46, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CREATED_ON\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Creation date</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>23</ifr:offset1><ifr:offset2>46</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ERSDA\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 4, "CREATED_BY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Created_By", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "12"}}, "CREATED_BY", 31, 62, -1, 12, 24, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CREATED_BY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Name of Person who Created the Object</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>31</ifr:offset1><ifr:offset2>62</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ERNAM\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>12</ifr:length><ifr:internalLength1>12</ifr:internalLength1><ifr:internalLength2>24</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>12</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 5, "LAST_CHNGE", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Last_Chnge", java.sql.Date.class, null, new java.lang.String[][]{}, "LAST_CHNGE", 43, 86, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"LAST_CHNGE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Date of Last Change</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>43</ifr:offset1><ifr:offset2>86</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"LAEDA\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 6, "CHANGED_BY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Changed_By", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "12"}}, "CHANGED_BY", 51, 102, -1, 12, 24, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CHANGED_BY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Name of person who changed object</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>51</ifr:offset1><ifr:offset2>102</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AENAM\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>12</ifr:length><ifr:internalLength1>12</ifr:internalLength1><ifr:internalLength2>24</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>12</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 7, "MAT_STATUS", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Mat_Status", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "15"}}, "MAT_STATUS", 63, 126, -1, 15, 30, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MAT_STATUS\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Maintenance status of complete material</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>63</ifr:offset1><ifr:offset2>126</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VPSTA\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>15</ifr:length><ifr:internalLength1>15</ifr:internalLength1><ifr:internalLength2>30</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>15</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 8, "MAINT_STAT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Maint_Stat", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "15"}}, "MAINT_STAT", 78, 156, -1, 15, 30, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MAINT_STAT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Maintenance status</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>78</ifr:offset1><ifr:offset2>156</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PSTAT_D\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>15</ifr:length><ifr:internalLength1>15</ifr:internalLength1><ifr:internalLength2>30</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>15</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 9, "DEL_FLAG", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Del_Flag", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "DEL_FLAG", 93, 186, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DEL_FLAG\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Flag Material for Deletion at Client Level</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>93</ifr:offset1><ifr:offset2>186</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"LVOMA\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 10, "MATL_GROUP", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Matl_Group", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "9"}}, "MATL_GROUP", 94, 188, -1, 9, 18, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MATL_GROUP\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Material Group</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>94</ifr:offset1><ifr:offset2>188</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MATKL\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>9</ifr:length><ifr:internalLength1>9</ifr:internalLength1><ifr:internalLength2>18</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>9</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 11, "OLD_MAT_NO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Old_Mat_No", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "18"}}, "OLD_MAT_NO", 103, 206, -1, 18, 36, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"OLD_MAT_NO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Old material number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>103</ifr:offset1><ifr:offset2>206</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BISMT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>18</ifr:length><ifr:internalLength1>18</ifr:internalLength1><ifr:internalLength2>36</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>18</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 12, "BASE_UOM", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Base_Uom", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "BASE_UOM", 121, 242, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"BASE_UOM\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Base Unit of Measure</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>121</ifr:offset1><ifr:offset2>242</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MEINS\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>UNIT</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength><ifr:conversionExit>CUNIT</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 13, "BASE_UOM_ISO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Base_Uom_Iso", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "BASE_UOM_ISO", 124, 248, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"BASE_UOM_ISO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Base unit of measure in ISO code</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>124</ifr:offset1><ifr:offset2>248</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MEINS_ISO\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 14, "PO_UNIT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Po_Unit", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "PO_UNIT", 127, 254, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PO_UNIT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Order unit</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>127</ifr:offset1><ifr:offset2>254</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BSTME\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>UNIT</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength><ifr:conversionExit>CUNIT</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 15, "PO_UNIT_ISO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Po_Unit_Iso", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "PO_UNIT_ISO", 130, 260, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PO_UNIT_ISO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Order unit in ISO code</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>130</ifr:offset1><ifr:offset2>260</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BSTME_ISO\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 16, "DOCUMENT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Document", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "22"}}, "DOCUMENT", 133, 266, -1, 22, 44, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DOCUMENT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Document number (without document management system)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>133</ifr:offset1><ifr:offset2>266</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"DZEINR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>22</ifr:length><ifr:internalLength1>22</ifr:internalLength1><ifr:internalLength2>44</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>22</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 17, "DOC_TYPE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Doc_Type", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "DOC_TYPE", 155, 310, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DOC_TYPE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Document type (without Document Management system)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>155</ifr:offset1><ifr:offset2>310</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"DZEIAR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 18, "DOC_VERS", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Doc_Vers", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "DOC_VERS", 158, 316, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DOC_VERS\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Document version (without Document Management system)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>158</ifr:offset1><ifr:offset2>316</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"DZEIVR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 19, "DOC_FORMAT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Doc_Format", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "DOC_FORMAT", 160, 320, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DOC_FORMAT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Page format of document (without Document Management system)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>160</ifr:offset1><ifr:offset2>320</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"DZEIFO\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 20, "DOC_CHG_NO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Doc_Chg_No", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "6"}}, "DOC_CHG_NO", 164, 328, -1, 6, 12, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DOC_CHG_NO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Document change number (without document management system)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>164</ifr:offset1><ifr:offset2>328</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AESZN\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>6</ifr:length><ifr:internalLength1>6</ifr:internalLength1><ifr:internalLength2>12</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>6</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 21, "PAGE_NO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Page_No", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "PAGE_NO", 170, 340, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PAGE_NO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Page number of document (without Document Management system)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>170</ifr:offset1><ifr:offset2>340</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BLATT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 22, "NO_SHEETS", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "No_Sheets", java.lang.String.class, null, new java.lang.String[][]{{"pattern", "\\d+"}, {"maxLength", "3"}}, "NO_SHEETS", 173, 346, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_NUM, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"NO_SHEETS\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Number of sheets (without Document Management system)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>173</ifr:offset1><ifr:offset2>346</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BLANZ\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>NUMC</ifr:type><ifr:abapType>N</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 23, "PROD_MEMO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Prod_Memo", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "18"}}, "PROD_MEMO", 176, 352, -1, 18, 36, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PROD_MEMO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Production/Inspection Memo</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>176</ifr:offset1><ifr:offset2>352</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"FERTH\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>18</ifr:length><ifr:internalLength1>18</ifr:internalLength1><ifr:internalLength2>36</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>18</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 24, "PAGEFORMAT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Pageformat", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "PAGEFORMAT", 194, 388, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PAGEFORMAT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Page Format of Production Memo</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>194</ifr:offset1><ifr:offset2>388</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"FORMT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 25, "SIZE_DIM", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Size_Dim", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "32"}}, "SIZE_DIM", 198, 396, -1, 32, 64, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SIZE_DIM\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Size/dimensions</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>198</ifr:offset1><ifr:offset2>396</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"GROES\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>32</ifr:length><ifr:internalLength1>32</ifr:internalLength1><ifr:internalLength2>64</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>32</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 26, "BASIC_MATL", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Basic_Matl", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "48"}}, "BASIC_MATL", 230, 460, -1, 48, 96, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"BASIC_MATL\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Basic Material</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>230</ifr:offset1><ifr:offset2>460</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"WRKST\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>48</ifr:length><ifr:internalLength1>48</ifr:internalLength1><ifr:internalLength2>96</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>48</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 27, "STD_DESCR", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Std_Descr", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "18"}}, "STD_DESCR", 278, 556, -1, 18, 36, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"STD_DESCR\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Industry Standard Description (such as ANSI or ISO)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>278</ifr:offset1><ifr:offset2>556</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"NORMT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>18</ifr:length><ifr:internalLength1>18</ifr:internalLength1><ifr:internalLength2>36</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>18</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 28, "DSN_OFFICE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Dsn_Office", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "DSN_OFFICE", 296, 592, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DSN_OFFICE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Laboratory/design office</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>296</ifr:offset1><ifr:offset2>592</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"LABOR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 29, "PUR_VALKEY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Pur_Valkey", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "PUR_VALKEY", 299, 598, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PUR_VALKEY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Purchasing Value Key</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>299</ifr:offset1><ifr:offset2>598</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"EKWSL\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 30, "NET_WEIGHT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Net_Weight", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "13"}, {"fractionDigits", "3"}}, "NET_WEIGHT", 303, 606, -1, 7, 7, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"NET_WEIGHT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Net weight</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:referenceField>GEWEI</ifr:referenceField><ifr:referenceTable>MARA</ifr:referenceTable><ifr:offset1>303</ifr:offset1><ifr:offset2>606</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"NTGEW\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>QUAN</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>13</ifr:length><ifr:internalLength1>7</ifr:internalLength1><ifr:internalLength2>7</ifr:internalLength2><ifr:decimals>3</ifr:decimals><ifr:outputLength>17</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 31, "UNIT_OF_WT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Unit_Of_Wt", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "UNIT_OF_WT", 310, 614, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"UNIT_OF_WT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Weight Unit</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>310</ifr:offset1><ifr:offset2>614</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"GEWEI\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>UNIT</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength><ifr:conversionExit>CUNIT</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 32, "UNIT_OF_WT_ISO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Unit_Of_Wt_Iso", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "UNIT_OF_WT_ISO", 313, 620, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"UNIT_OF_WT_ISO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Unit of weight in ISO code</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>313</ifr:offset1><ifr:offset2>620</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"GEWEI_ISO\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 33, "CONTAINER", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Container", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "CONTAINER", 316, 626, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CONTAINER\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Container requirements</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>316</ifr:offset1><ifr:offset2>626</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BEHVO\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 34, "STOR_CONDS", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Stor_Conds", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "STOR_CONDS", 318, 630, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"STOR_CONDS\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Storage conditions</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>318</ifr:offset1><ifr:offset2>630</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"RAUBE\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 35, "TEMP_CONDS", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Temp_Conds", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "TEMP_CONDS", 320, 634, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TEMP_CONDS\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Temperature conditions indicator</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>320</ifr:offset1><ifr:offset2>634</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"TEMPB\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 36, "TRANS_GRP", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Trans_Grp", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "TRANS_GRP", 322, 638, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TRANS_GRP\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Transportation group</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>322</ifr:offset1><ifr:offset2>638</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"TRAGR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 37, "HAZ_MAT_NO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Haz_Mat_No", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "18"}}, "HAZ_MAT_NO", 326, 646, -1, 18, 36, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"HAZ_MAT_NO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Hazardous material number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>326</ifr:offset1><ifr:offset2>646</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"STOFF\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>18</ifr:length><ifr:internalLength1>18</ifr:internalLength1><ifr:internalLength2>36</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>18</ifr:outputLength><ifr:conversionExit>MATN1</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 38, "DIVISION", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Division", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "DIVISION", 344, 682, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DIVISION\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Division</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>344</ifr:offset1><ifr:offset2>682</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"SPART\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 39, "COMPETITOR", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Competitor", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "COMPETITOR", 346, 686, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"COMPETITOR\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Competitor</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>346</ifr:offset1><ifr:offset2>686</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"WETTB\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 40, "QTY_GR_GI", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Qty_Gr_Gi", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "13"}, {"fractionDigits", "3"}}, "QTY_GR_GI", 356, 706, -1, 7, 7, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"QTY_GR_GI\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Quantity: Number of GR/GI Slips to Print</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:referenceField>MEINS</ifr:referenceField><ifr:referenceTable>MARA</ifr:referenceTable><ifr:offset1>356</ifr:offset1><ifr:offset2>706</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"WESCH\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>QUAN</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>13</ifr:length><ifr:internalLength1>7</ifr:internalLength1><ifr:internalLength2>7</ifr:internalLength2><ifr:decimals>3</ifr:decimals><ifr:outputLength>17</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 41, "PROC_RULE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Proc_Rule", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PROC_RULE", 363, 714, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PROC_RULE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Procurement rule</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>363</ifr:offset1><ifr:offset2>714</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BWVOR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 42, "SUP_SOURCE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Sup_Source", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "SUP_SOURCE", 364, 716, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SUP_SOURCE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Source of Supply</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>364</ifr:offset1><ifr:offset2>716</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BWSCL\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 43, "SEASON", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Season", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "SEASON", 365, 718, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SEASON\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Season category</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>365</ifr:offset1><ifr:offset2>718</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"SAISO\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 44, "LABEL_TYPE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Label_Type", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "LABEL_TYPE", 369, 726, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"LABEL_TYPE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Label type</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>369</ifr:offset1><ifr:offset2>726</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ETIAR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 45, "LABEL_FORM", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Label_Form", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "LABEL_FORM", 371, 730, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"LABEL_FORM\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Label form</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>371</ifr:offset1><ifr:offset2>730</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ETIFO\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 46, "PROD_HIER", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Prod_Hier", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "18"}}, "PROD_HIER", 373, 734, -1, 18, 36, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PROD_HIER\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Product hierarchy</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>373</ifr:offset1><ifr:offset2>734</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PRODH_D\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>18</ifr:length><ifr:internalLength1>18</ifr:internalLength1><ifr:internalLength2>36</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>18</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 47, "CAD_ID", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cad_Id", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "CAD_ID", 391, 770, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CAD_ID\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">CAD indicator</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>391</ifr:offset1><ifr:offset2>770</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CADKZ\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 48, "ALLOWED_WT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Allowed_Wt", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "13"}, {"fractionDigits", "3"}}, "ALLOWED_WT", 392, 772, -1, 7, 7, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ALLOWED_WT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Allowed packaging weight</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:referenceField>ERGEI</ifr:referenceField><ifr:referenceTable>MARA</ifr:referenceTable><ifr:offset1>392</ifr:offset1><ifr:offset2>772</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ERGEW\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>QUAN</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>13</ifr:length><ifr:internalLength1>7</ifr:internalLength1><ifr:internalLength2>7</ifr:internalLength2><ifr:decimals>3</ifr:decimals><ifr:outputLength>17</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 49, "PACK_WT_UN", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Pack_Wt_Un", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "PACK_WT_UN", 399, 780, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PACK_WT_UN\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Unit of weight (allowed packaging weight)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>399</ifr:offset1><ifr:offset2>780</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ERGEI\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>UNIT</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength><ifr:conversionExit>CUNIT</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 50, "PACK_WT_UN_ISO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Pack_Wt_Un_Iso", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "PACK_WT_UN_ISO", 402, 786, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PACK_WT_UN_ISO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Unit of weight (allowed packaging weight) in ISO code</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>402</ifr:offset1><ifr:offset2>786</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ERGEI_ISO\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 51, "ALLWD_VOL", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Allwd_Vol", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "13"}, {"fractionDigits", "3"}}, "ALLWD_VOL", 405, 792, -1, 7, 7, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ALLWD_VOL\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Allowed packaging volume</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:referenceField>ERVOE</ifr:referenceField><ifr:referenceTable>MARA</ifr:referenceTable><ifr:offset1>405</ifr:offset1><ifr:offset2>792</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ERVOL\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>QUAN</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>13</ifr:length><ifr:internalLength1>7</ifr:internalLength1><ifr:internalLength2>7</ifr:internalLength2><ifr:decimals>3</ifr:decimals><ifr:outputLength>17</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 52, "PACK_VO_UN", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Pack_Vo_Un", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "PACK_VO_UN", 412, 800, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PACK_VO_UN\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Volume unit (allowed packaging volume)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>412</ifr:offset1><ifr:offset2>800</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ERVOE\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>UNIT</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength><ifr:conversionExit>CUNIT</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 53, "PACK_VO_UN_ISO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Pack_Vo_Un_Iso", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "PACK_VO_UN_ISO", 415, 806, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PACK_VO_UN_ISO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Volume unit (allowed packaging volume) in ISO code</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>415</ifr:offset1><ifr:offset2>806</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ERVOE_ISO\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 54, "WT_TOL_LT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Wt_Tol_Lt", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "3"}, {"fractionDigits", "1"}}, "WT_TOL_LT", 418, 812, -1, 2, 2, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"WT_TOL_LT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Excess Weight Tolerance for Handling unit</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>418</ifr:offset1><ifr:offset2>812</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"GEWTO\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>1</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 55, "VOL_TOL_LT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Vol_Tol_Lt", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "3"}, {"fractionDigits", "1"}}, "VOL_TOL_LT", 420, 814, -1, 2, 2, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"VOL_TOL_LT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Excess Volume Tolerance of the Handling Unit</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>420</ifr:offset1><ifr:offset2>814</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VOLTO\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>1</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 56, "VAR_ORD_UN", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Var_Ord_Un", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "VAR_ORD_UN", 422, 816, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"VAR_ORD_UN\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Variable order unit active</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>422</ifr:offset1><ifr:offset2>816</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VABME\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 57, "CONFIGURED", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Configured", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "CONFIGURED", 423, 818, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CONFIGURED\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Configurable Material</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>423</ifr:offset1><ifr:offset2>818</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KZKFG\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 58, "BATCH_MGMT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Batch_Mgmt", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "BATCH_MGMT", 424, 820, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"BATCH_MGMT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Batch management requirement indicator</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>424</ifr:offset1><ifr:offset2>820</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"XCHPF\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 59, "SH_MAT_TYP", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Sh_Mat_Typ", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "SH_MAT_TYP", 425, 822, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SH_MAT_TYP\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Packaging Material Type</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>425</ifr:offset1><ifr:offset2>822</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VHIART\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 60, "FILL_LEVEL", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Fill_Level", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "3"}, {"fractionDigits", "0"}}, "FILL_LEVEL", 429, 830, -1, 2, 2, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"FILL_LEVEL\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Maximum level (by volume)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>429</ifr:offset1><ifr:offset2>830</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"FUELG\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 61, "STACK_FACT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:short", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Stack_Fact", java.lang.Short.class, null, new java.lang.String[][]{}, "STACK_FACT", 432, 832, -1, 2, 2, -1, com.sap.mw.jco.JCO.TYPE_INT2, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"STACK_FACT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Stacking factor</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>432</ifr:offset1><ifr:offset2>832</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"STFAK\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>INT2</ifr:type><ifr:abapType>s</ifr:abapType><ifr:length>5</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>5</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 62, "MAT_GRP_SM", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Mat_Grp_Sm", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "MAT_GRP_SM", 434, 834, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MAT_GRP_SM\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Material Group: Packaging Materials</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>434</ifr:offset1><ifr:offset2>834</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MAGRV\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 63, "AUTHORITYGROUP", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Authoritygroup", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "AUTHORITYGROUP", 438, 842, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"AUTHORITYGROUP\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Authorization Group</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>438</ifr:offset1><ifr:offset2>842</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BEGRU\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 64, "QM_PROCMNT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Qm_Procmnt", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "QM_PROCMNT", 442, 850, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"QM_PROCMNT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">QM in Procurement is Active</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>442</ifr:offset1><ifr:offset2>850</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"QMPUR\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 65, "CATPROFILE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Catprofile", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "9"}}, "CATPROFILE", 443, 852, -1, 9, 18, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CATPROFILE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Catalog Profile</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>443</ifr:offset1><ifr:offset2>852</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"RBNR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>9</ifr:length><ifr:internalLength1>9</ifr:internalLength1><ifr:internalLength2>18</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>9</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 66, "MINREMLIFE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Minremlife", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "4"}, {"fractionDigits", "0"}}, "MINREMLIFE", 452, 870, -1, 3, 3, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MINREMLIFE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Minimum remaining shelf life</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>452</ifr:offset1><ifr:offset2>870</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MHDRZ\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>3</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>5</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 67, "SHELF_LIFE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Shelf_Life", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "4"}, {"fractionDigits", "0"}}, "SHELF_LIFE", 455, 873, -1, 3, 3, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SHELF_LIFE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Total shelf life</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>455</ifr:offset1><ifr:offset2>873</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MHDHB\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>3</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>5</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 68, "STOR_PCT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Stor_Pct", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "3"}, {"fractionDigits", "0"}}, "STOR_PCT", 458, 876, -1, 2, 2, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"STOR_PCT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Storage percentage</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>458</ifr:offset1><ifr:offset2>876</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MHDLP\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DEC</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 69, "CONF_MATL", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Conf_Matl", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "18"}}, "CONF_MATL", 460, 878, -1, 18, 36, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CONF_MATL\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Cross-Plant Configurable Material</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>460</ifr:offset1><ifr:offset2>878</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"SATNR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>18</ifr:length><ifr:internalLength1>18</ifr:internalLength1><ifr:internalLength2>36</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>18</ifr:outputLength><ifr:conversionExit>MATN1</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 70, "CO_PRODUCT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Co_Product", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "CO_PRODUCT", 478, 914, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CO_PRODUCT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Indicator: Material can be co-product</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>478</ifr:offset1><ifr:offset2>914</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KZKUPMAT\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 71, "PR_REF_MAT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Pr_Ref_Mat", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "18"}}, "PR_REF_MAT", 479, 916, -1, 18, 36, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PR_REF_MAT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Pricing reference material</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>479</ifr:offset1><ifr:offset2>916</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PMATN\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>18</ifr:length><ifr:internalLength1>18</ifr:internalLength1><ifr:internalLength2>36</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>18</ifr:outputLength><ifr:conversionExit>MATN1</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 72, "PUR_STATUS", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Pur_Status", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "PUR_STATUS", 497, 952, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PUR_STATUS\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Material Status</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>497</ifr:offset1><ifr:offset2>952</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MSTAE\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 73, "SAL_STATUS", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Sal_Status", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "SAL_STATUS", 499, 956, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SAL_STATUS\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Cross-distribution-chain material status</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>499</ifr:offset1><ifr:offset2>956</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MSTAV\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 74, "PVALIDFROM", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Pvalidfrom", java.sql.Date.class, null, new java.lang.String[][]{}, "PVALIDFROM", 501, 960, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PVALIDFROM\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Date from which the cross-plant material status is valid</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>501</ifr:offset1><ifr:offset2>960</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MSTDE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 75, "SVALIDFROM", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Svalidfrom", java.sql.Date.class, null, new java.lang.String[][]{}, "SVALIDFROM", 509, 976, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SVALIDFROM\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Date from which the X-distr.-chain material status is valid</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>509</ifr:offset1><ifr:offset2>976</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MSTDV\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 76, "ENVT_RLVT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Envt_Rlvt", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "ENVT_RLVT", 517, 992, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ENVT_RLVT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Indicator: Environmentally Relevant</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>517</ifr:offset1><ifr:offset2>992</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KZUMW\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 77, "PROD_ALLOC", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Prod_Alloc", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "18"}}, "PROD_ALLOC", 518, 994, -1, 18, 36, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PROD_ALLOC\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Product allocation determination procedure</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>518</ifr:offset1><ifr:offset2>994</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KOSCH\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>18</ifr:length><ifr:internalLength1>18</ifr:internalLength1><ifr:internalLength2>36</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>18</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 78, "QUAL_DIK", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Qual_Dik", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "QUAL_DIK", 536, 1030, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"QUAL_DIK\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Material qualifies for discount in kind</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>536</ifr:offset1><ifr:offset2>1030</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"NRFHG\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 79, "MANU_MAT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Manu_Mat", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "40"}}, "MANU_MAT", 537, 1032, -1, 40, 80, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MANU_MAT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Manufacturer part number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>537</ifr:offset1><ifr:offset2>1032</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MFRPN\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>40</ifr:length><ifr:internalLength1>40</ifr:internalLength1><ifr:internalLength2>80</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>40</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 80, "MFR_NO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Mfr_No", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "MFR_NO", 577, 1112, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MFR_NO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Manufacturer number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>577</ifr:offset1><ifr:offset2>1112</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MFRNR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 81, "INV_MAT_NO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Inv_Mat_No", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "18"}}, "INV_MAT_NO", 587, 1132, -1, 18, 36, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"INV_MAT_NO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Number of firm&apos;s own (internal) inventory-managed material</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>587</ifr:offset1><ifr:offset2>1132</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MPMAT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>18</ifr:length><ifr:internalLength1>18</ifr:internalLength1><ifr:internalLength2>36</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>18</ifr:outputLength><ifr:conversionExit>MATN1</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 82, "MANUF_PROF", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Manuf_Prof", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "MANUF_PROF", 605, 1168, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MANUF_PROF\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Mfr part profile</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>605</ifr:offset1><ifr:offset2>1168</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MPROF\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 83, "HAZMATPROF", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Hazmatprof", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "HAZMATPROF", 609, 1176, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"HAZMATPROF\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Dangerous Goods Indicator Profile</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>609</ifr:offset1><ifr:offset2>1176</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ADGE_PROFL\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 84, "HIGH_VISC", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "High_Visc", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "HIGH_VISC", 612, 1182, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"HIGH_VISC\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Indicator: Highly Viscous</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>612</ifr:offset1><ifr:offset2>1182</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ADGE_IHIVI\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 85, "LOOSEORLIQ", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Looseorliq", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "LOOSEORLIQ", 613, 1184, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"LOOSEORLIQ\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Indicator: In Bulk/Liquid</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>613</ifr:offset1><ifr:offset2>1184</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ADGE_ILOOS\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 86, "CLOSED_BOX", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Closed_Box", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "CLOSED_BOX", 614, 1186, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CLOSED_BOX\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Packaging Material is Closed Packaging</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>614</ifr:offset1><ifr:offset2>1186</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KZGVH\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 87, "APPD_B_REC", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Appd_B_Rec", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "APPD_B_REC", 615, 1188, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"APPD_B_REC\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Indicator: Approved batch record required</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>615</ifr:offset1><ifr:offset2>1188</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"XGCHP\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 88, "MATCMPLLVL", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Matcmpllvl", java.lang.String.class, null, new java.lang.String[][]{{"pattern", "\\d+"}, {"maxLength", "2"}}, "MATCMPLLVL", 616, 1190, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_NUM, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MATCMPLLVL\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Material completion level</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>616</ifr:offset1><ifr:offset2>1190</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CSCP_COMP_LVL\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>NUMC</ifr:type><ifr:abapType>N</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 89, "PAR_EFF", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Par_Eff", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PAR_EFF", 618, 1194, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PAR_EFF\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Assign effectivity parameter values/ override change numbers</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>618</ifr:offset1><ifr:offset2>1194</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CC_MTEFF\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 90, "ROUND_UP_RULE_EXPIRATION_DATE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Round_Up_Rule_Expiration_Date", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "ROUND_UP_RULE_EXPIRATION_DATE", 619, 1196, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ROUND_UP_RULE_EXPIRATION_DATE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Rounding rule for calculation of SLED</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>619</ifr:offset1><ifr:offset2>1196</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"RDMHD\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 91, "PERIOD_IND_EXPIRATION_DATE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Period_Ind_Expiration_Date", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PERIOD_IND_EXPIRATION_DATE", 620, 1198, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PERIOD_IND_EXPIRATION_DATE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Period indicator for shelf life expiration date</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>620</ifr:offset1><ifr:offset2>1198</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"DATTP\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength><ifr:conversionExit>PERKZ</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 92, "PROD_COMPOSITION_ON_PACKAGING", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Prod_Composition_On_Packaging", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PROD_COMPOSITION_ON_PACKAGING", 621, 1200, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PROD_COMPOSITION_ON_PACKAGING\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Indicator: Product composition printed on packaging</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>621</ifr:offset1><ifr:offset2>1200</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PRZUS\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 93, "ITEM_CAT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Item_Cat", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "ITEM_CAT", 622, 1202, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ITEM_CAT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">General item category group</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>622</ifr:offset1><ifr:offset2>1202</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MTPOS_MARA\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 94, "HAZ_MAT_NO_EXTERNAL", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Haz_Mat_No_External", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "40"}}, "HAZ_MAT_NO_EXTERNAL", 626, 1210, -1, 40, 80, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"HAZ_MAT_NO_EXTERNAL\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Long material number (future development) for HAZ_M field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>626</ifr:offset1><ifr:offset2>1210</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MGV_HAZ_MAT_NO_EXTERNAL\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>40</ifr:length><ifr:internalLength1>40</ifr:internalLength1><ifr:internalLength2>80</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>40</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 95, "HAZ_MAT_NO_GUID", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Haz_Mat_No_Guid", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "32"}}, "HAZ_MAT_NO_GUID", 666, 1290, -1, 32, 64, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"HAZ_MAT_NO_GUID\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">External GUID (future development) for HAZ_MAT_NO  field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>666</ifr:offset1><ifr:offset2>1290</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MGV_HAZ_MAT_NO_GUID\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>32</ifr:length><ifr:internalLength1>32</ifr:internalLength1><ifr:internalLength2>64</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>32</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 96, "HAZ_MAT_NO_VERSION", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Haz_Mat_No_Version", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "HAZ_MAT_NO_VERSION", 698, 1354, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"HAZ_MAT_NO_VERSION\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Version number (future development) for HAZ_MAT_NO field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>698</ifr:offset1><ifr:offset2>1354</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MGV_HAZ_MAT_NO_VERSION\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 97, "INV_MAT_NO_EXTERNAL", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Inv_Mat_No_External", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "40"}}, "INV_MAT_NO_EXTERNAL", 708, 1374, -1, 40, 80, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"INV_MAT_NO_EXTERNAL\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Long material number (future development) for INV_M field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>708</ifr:offset1><ifr:offset2>1374</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MGV_INV_MAT_NO_EXTERNAL\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>40</ifr:length><ifr:internalLength1>40</ifr:internalLength1><ifr:internalLength2>80</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>40</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 98, "INV_MAT_NO_GUID", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Inv_Mat_No_Guid", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "32"}}, "INV_MAT_NO_GUID", 748, 1454, -1, 32, 64, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"INV_MAT_NO_GUID\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">External GUID (future development) for INV_MAT_NO field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>748</ifr:offset1><ifr:offset2>1454</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MGV_INV_MAT_NO_GUID\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>32</ifr:length><ifr:internalLength1>32</ifr:internalLength1><ifr:internalLength2>64</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>32</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 99, "INV_MAT_NO_VERSION", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Inv_Mat_No_Version", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "INV_MAT_NO_VERSION", 780, 1518, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"INV_MAT_NO_VERSION\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Version number (future development) for INV_MAT_NO field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>780</ifr:offset1><ifr:offset2>1518</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MGV_INV_MAT_NO_VERSION\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 100, "MATERIAL_FIXED", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Material_Fixed", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "MATERIAL_FIXED", 790, 1538, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MATERIAL_FIXED\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Material Is Locked</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>790</ifr:offset1><ifr:offset2>1538</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MATFI\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 101, "CM_RELEVANCE_FLAG", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cm_Relevance_Flag", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "CM_RELEVANCE_FLAG", 791, 1540, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CM_RELEVANCE_FLAG\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Relevant for Configuration Management</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>791</ifr:offset1><ifr:offset2>1540</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"DE_CM_RELEVANCE_FLAG\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 102, "SLED_BBD", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Sled_Bbd", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "SLED_BBD", 792, 1542, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SLED_BBD\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Expiration Date</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>792</ifr:offset1><ifr:offset2>1542</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"SLED_BBD\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 103, "GTIN_VARIANT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Gtin_Variant", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "GTIN_VARIANT", 793, 1544, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"GTIN_VARIANT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Global Trade Item Number Variant</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>793</ifr:offset1><ifr:offset2>1544</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"GTIN_VARIANT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 104, "SERIALIZATION_LEVEL", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Serialization_Level", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "SERIALIZATION_LEVEL", 795, 1548, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SERIALIZATION_LEVEL\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Level of Explicitness for Serial Number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>795</ifr:offset1><ifr:offset2>1548</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"SERLV\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 105, "PL_REF_MAT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Pl_Ref_Mat", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "18"}}, "PL_REF_MAT", 796, 1550, -1, 18, 36, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PL_REF_MAT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Reference material for materials packed in same way</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>796</ifr:offset1><ifr:offset2>1550</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PL_RMATP\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>18</ifr:length><ifr:internalLength1>18</ifr:internalLength1><ifr:internalLength2>36</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>18</ifr:outputLength><ifr:conversionExit>MATN1</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 106, "EXTMATLGRP", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Extmatlgrp", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "18"}}, "EXTMATLGRP", 814, 1586, -1, 18, 36, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"EXTMATLGRP\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">External material group</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>814</ifr:offset1><ifr:offset2>1586</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"EXTWG\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>18</ifr:length><ifr:internalLength1>18</ifr:internalLength1><ifr:internalLength2>36</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>18</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 107, "UOMUSAGE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Uomusage", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "UOMUSAGE", 832, 1622, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"UOMUSAGE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Units of measure usage</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>832</ifr:offset1><ifr:offset2>1622</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KZWSO\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        staticDescriptor = descriptor;
    }
    public  Bapi_Mara_GaType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    protected  Bapi_Mara_GaType (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    
    public java.lang.String getInv_Mat_No_Version() {
        return (java.lang.String)baseTypeData().getElementValueAsString(99);
    }

    
    public java.lang.String getBase_Uom() {
        return (java.lang.String)baseTypeData().getElementValueAsString(12);
    }

    
    public java.lang.String getPl_Ref_Mat() {
        return (java.lang.String)baseTypeData().getElementValueAsString(105);
    }

    
    public java.lang.String getLabel_Form() {
        return (java.lang.String)baseTypeData().getElementValueAsString(45);
    }

    
    public void setRound_Up_Rule_Expiration_Date(java.lang.String Round_Up_Rule_Expiration_Date) {
        baseTypeData().setElementValue(90, Round_Up_Rule_Expiration_Date);
    }

    
    public java.lang.String getEnvt_Rlvt() {
        return (java.lang.String)baseTypeData().getElementValueAsString(76);
    }

    
    public java.lang.String getSal_Status() {
        return (java.lang.String)baseTypeData().getElementValueAsString(73);
    }

    
    public java.math.BigDecimal getNet_Weight() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(30);
    }

    
    public java.lang.String getNo_Sheets() {
        return (java.lang.String)baseTypeData().getElementValueAsString(22);
    }

    
    public void setProd_Alloc(java.lang.String Prod_Alloc) {
        baseTypeData().setElementValue(77, Prod_Alloc);
    }

    
    public void setBase_Uom(java.lang.String Base_Uom) {
        baseTypeData().setElementValue(12, Base_Uom);
    }

    
    public java.lang.String getSerialization_Level() {
        return (java.lang.String)baseTypeData().getElementValueAsString(104);
    }

    
    public java.lang.String getProd_Composition_On_Packaging() {
        return (java.lang.String)baseTypeData().getElementValueAsString(92);
    }

    
    public java.lang.String getProd_Memo() {
        return (java.lang.String)baseTypeData().getElementValueAsString(23);
    }

    
    public java.lang.String getUomusage() {
        return (java.lang.String)baseTypeData().getElementValueAsString(107);
    }

    
    public void setSvalidfrom(java.sql.Date Svalidfrom) {
        baseTypeData().setElementValue(75, Svalidfrom);
    }

    
    public void setStor_Conds(java.lang.String Stor_Conds) {
        baseTypeData().setElementValue(34, Stor_Conds);
    }

    
    public void setMatl_Type(java.lang.String Matl_Type) {
        baseTypeData().setElementValue(2, Matl_Type);
    }

    
    public void setEnvt_Rlvt(java.lang.String Envt_Rlvt) {
        baseTypeData().setElementValue(76, Envt_Rlvt);
    }

    
    public java.lang.String getCompetitor() {
        return (java.lang.String)baseTypeData().getElementValueAsString(39);
    }

    
    public void setStd_Descr(java.lang.String Std_Descr) {
        baseTypeData().setElementValue(27, Std_Descr);
    }

    
    public java.lang.String getHaz_Mat_No_Guid() {
        return (java.lang.String)baseTypeData().getElementValueAsString(95);
    }

    
    public void setPo_Unit_Iso(java.lang.String Po_Unit_Iso) {
        baseTypeData().setElementValue(15, Po_Unit_Iso);
    }

    
    public void setItem_Cat(java.lang.String Item_Cat) {
        baseTypeData().setElementValue(93, Item_Cat);
    }

    
    public void setFill_Level(java.math.BigDecimal Fill_Level) {
        baseTypeData().setElementValue(60, Fill_Level);
    }

    
    public void setStack_Fact(short Stack_Fact) {
        baseTypeData().setElementValue(61, Stack_Fact);
    }

    
    public java.lang.String getChanged_By() {
        return (java.lang.String)baseTypeData().getElementValueAsString(6);
    }

    
    public java.sql.Date getSvalidfrom() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(75);
    }

    
    public java.lang.String getBasic_Matl() {
        return (java.lang.String)baseTypeData().getElementValueAsString(26);
    }

    
    public void setCreated_On(java.sql.Date Created_On) {
        baseTypeData().setElementValue(3, Created_On);
    }

    
    public void setBase_Uom_Iso(java.lang.String Base_Uom_Iso) {
        baseTypeData().setElementValue(13, Base_Uom_Iso);
    }

    
    public java.lang.String getProc_Rule() {
        return (java.lang.String)baseTypeData().getElementValueAsString(41);
    }

    
    public void setQm_Procmnt(java.lang.String Qm_Procmnt) {
        baseTypeData().setElementValue(64, Qm_Procmnt);
    }

    
    public void setUnit_Of_Wt(java.lang.String Unit_Of_Wt) {
        baseTypeData().setElementValue(31, Unit_Of_Wt);
    }

    
    public void setLast_Chnge(java.sql.Date Last_Chnge) {
        baseTypeData().setElementValue(5, Last_Chnge);
    }

    
    public void setCatprofile(java.lang.String Catprofile) {
        baseTypeData().setElementValue(65, Catprofile);
    }

    
    public void setCo_Product(java.lang.String Co_Product) {
        baseTypeData().setElementValue(70, Co_Product);
    }

    
    public java.math.BigDecimal getQty_Gr_Gi() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(40);
    }

    
    public void setProc_Rule(java.lang.String Proc_Rule) {
        baseTypeData().setElementValue(41, Proc_Rule);
    }

    
    public void setMfr_No(java.lang.String Mfr_No) {
        baseTypeData().setElementValue(80, Mfr_No);
    }

    
    public java.lang.String getAppd_B_Rec() {
        return (java.lang.String)baseTypeData().getElementValueAsString(87);
    }

    
    public java.lang.String getProd_Alloc() {
        return (java.lang.String)baseTypeData().getElementValueAsString(77);
    }

    
    public void setPeriod_Ind_Expiration_Date(java.lang.String Period_Ind_Expiration_Date) {
        baseTypeData().setElementValue(91, Period_Ind_Expiration_Date);
    }

    
    public void setPack_Wt_Un_Iso(java.lang.String Pack_Wt_Un_Iso) {
        baseTypeData().setElementValue(50, Pack_Wt_Un_Iso);
    }

    
    public void setTrans_Grp(java.lang.String Trans_Grp) {
        baseTypeData().setElementValue(36, Trans_Grp);
    }

    
    public void setNet_Weight(java.math.BigDecimal Net_Weight) {
        baseTypeData().setElementValue(30, Net_Weight);
    }

    
    public java.sql.Date getLast_Chnge() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(5);
    }

    
    public void setSup_Source(java.lang.String Sup_Source) {
        baseTypeData().setElementValue(42, Sup_Source);
    }

    
    public java.lang.String getCm_Relevance_Flag() {
        return (java.lang.String)baseTypeData().getElementValueAsString(101);
    }

    
    public void setShelf_Life(java.math.BigDecimal Shelf_Life) {
        baseTypeData().setElementValue(67, Shelf_Life);
    }

    
    public void setHaz_Mat_No_External(java.lang.String Haz_Mat_No_External) {
        baseTypeData().setElementValue(94, Haz_Mat_No_External);
    }

    
    public java.math.BigDecimal getStor_Pct() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(68);
    }

    
    public java.lang.String getHaz_Mat_No_Version() {
        return (java.lang.String)baseTypeData().getElementValueAsString(96);
    }

    
    public void setDoc_Chg_No(java.lang.String Doc_Chg_No) {
        baseTypeData().setElementValue(20, Doc_Chg_No);
    }

    
    public void setMat_Status(java.lang.String Mat_Status) {
        baseTypeData().setElementValue(7, Mat_Status);
    }

    
    public java.lang.String getDoc_Type() {
        return (java.lang.String)baseTypeData().getElementValueAsString(17);
    }

    
    public void setQty_Gr_Gi(java.math.BigDecimal Qty_Gr_Gi) {
        baseTypeData().setElementValue(40, Qty_Gr_Gi);
    }

    
    public java.lang.String getHaz_Mat_No() {
        return (java.lang.String)baseTypeData().getElementValueAsString(37);
    }

    
    public void setLabel_Type(java.lang.String Label_Type) {
        baseTypeData().setElementValue(44, Label_Type);
    }

    
    public void setInv_Mat_No_Guid(java.lang.String Inv_Mat_No_Guid) {
        baseTypeData().setElementValue(98, Inv_Mat_No_Guid);
    }

    
    public java.lang.String getExtmatlgrp() {
        return (java.lang.String)baseTypeData().getElementValueAsString(106);
    }

    
    public java.sql.Date getPvalidfrom() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(74);
    }

    
    public java.lang.String getMaterial_Fixed() {
        return (java.lang.String)baseTypeData().getElementValueAsString(100);
    }

    
    public java.lang.String getDsn_Office() {
        return (java.lang.String)baseTypeData().getElementValueAsString(28);
    }

    
    public void setUomusage(java.lang.String Uomusage) {
        baseTypeData().setElementValue(107, Uomusage);
    }

    
    public java.lang.String getPageformat() {
        return (java.lang.String)baseTypeData().getElementValueAsString(24);
    }

    
    public void setGtin_Variant(java.lang.String Gtin_Variant) {
        baseTypeData().setElementValue(103, Gtin_Variant);
    }

    
    public void setAppd_B_Rec(java.lang.String Appd_B_Rec) {
        baseTypeData().setElementValue(87, Appd_B_Rec);
    }

    
    public java.lang.String getMaterial() {
        return (java.lang.String)baseTypeData().getElementValueAsString(0);
    }

    
    public java.lang.String getPo_Unit_Iso() {
        return (java.lang.String)baseTypeData().getElementValueAsString(15);
    }

    
    public java.lang.String getItem_Cat() {
        return (java.lang.String)baseTypeData().getElementValueAsString(93);
    }

    
    public java.math.BigDecimal getVol_Tol_Lt() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(55);
    }

    
    public void setHaz_Mat_No(java.lang.String Haz_Mat_No) {
        baseTypeData().setElementValue(37, Haz_Mat_No);
    }

    
    public void setNo_Sheets(java.lang.String No_Sheets) {
        baseTypeData().setElementValue(22, No_Sheets);
    }

    
    public void setPar_Eff(java.lang.String Par_Eff) {
        baseTypeData().setElementValue(89, Par_Eff);
    }

    
    public java.lang.String getHigh_Visc() {
        return (java.lang.String)baseTypeData().getElementValueAsString(84);
    }

    
    public void setSeason(java.lang.String Season) {
        baseTypeData().setElementValue(43, Season);
    }

    
    public void setProd_Memo(java.lang.String Prod_Memo) {
        baseTypeData().setElementValue(23, Prod_Memo);
    }

    
    public java.lang.String getSup_Source() {
        return (java.lang.String)baseTypeData().getElementValueAsString(42);
    }

    
    public void setPur_Status(java.lang.String Pur_Status) {
        baseTypeData().setElementValue(72, Pur_Status);
    }

    
    public java.lang.String getLooseorliq() {
        return (java.lang.String)baseTypeData().getElementValueAsString(85);
    }

    
    public void setMaterial(java.lang.String Material) {
        baseTypeData().setElementValue(0, Material);
    }

    
    public java.lang.String getHaz_Mat_No_External() {
        return (java.lang.String)baseTypeData().getElementValueAsString(94);
    }

    
    public void setHaz_Mat_No_Guid(java.lang.String Haz_Mat_No_Guid) {
        baseTypeData().setElementValue(95, Haz_Mat_No_Guid);
    }

    
    public void setVar_Ord_Un(java.lang.String Var_Ord_Un) {
        baseTypeData().setElementValue(56, Var_Ord_Un);
    }

    
    public java.lang.String getClosed_Box() {
        return (java.lang.String)baseTypeData().getElementValueAsString(86);
    }

    
    public java.math.BigDecimal getAllwd_Vol() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(51);
    }

    
    public java.sql.Date getCreated_On() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(3);
    }

    
    public java.lang.String getContainer() {
        return (java.lang.String)baseTypeData().getElementValueAsString(33);
    }

    
    public void setDsn_Office(java.lang.String Dsn_Office) {
        baseTypeData().setElementValue(28, Dsn_Office);
    }

    
    public java.lang.String getMatl_Group() {
        return (java.lang.String)baseTypeData().getElementValueAsString(10);
    }

    
    public void setDel_Flag(java.lang.String Del_Flag) {
        baseTypeData().setElementValue(9, Del_Flag);
    }

    
    public java.lang.String getPack_Vo_Un() {
        return (java.lang.String)baseTypeData().getElementValueAsString(52);
    }

    
    public void setCompetitor(java.lang.String Competitor) {
        baseTypeData().setElementValue(39, Competitor);
    }

    
    public java.math.BigDecimal getFill_Level() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(60);
    }

    
    public void setPvalidfrom(java.sql.Date Pvalidfrom) {
        baseTypeData().setElementValue(74, Pvalidfrom);
    }

    
    public java.lang.String getDel_Flag() {
        return (java.lang.String)baseTypeData().getElementValueAsString(9);
    }

    
    public void setStor_Pct(java.math.BigDecimal Stor_Pct) {
        baseTypeData().setElementValue(68, Stor_Pct);
    }

    
    public java.lang.String getDocument() {
        return (java.lang.String)baseTypeData().getElementValueAsString(16);
    }

    
    public void setConf_Matl(java.lang.String Conf_Matl) {
        baseTypeData().setElementValue(69, Conf_Matl);
    }

    
    public void setWt_Tol_Lt(java.math.BigDecimal Wt_Tol_Lt) {
        baseTypeData().setElementValue(54, Wt_Tol_Lt);
    }

    
    public java.lang.String getVar_Ord_Un() {
        return (java.lang.String)baseTypeData().getElementValueAsString(56);
    }

    
    public void setInv_Mat_No_Version(java.lang.String Inv_Mat_No_Version) {
        baseTypeData().setElementValue(99, Inv_Mat_No_Version);
    }

    
    public void setPl_Ref_Mat(java.lang.String Pl_Ref_Mat) {
        baseTypeData().setElementValue(105, Pl_Ref_Mat);
    }

    
    public void setProd_Composition_On_Packaging(java.lang.String Prod_Composition_On_Packaging) {
        baseTypeData().setElementValue(92, Prod_Composition_On_Packaging);
    }

    
    public java.lang.String getCad_Id() {
        return (java.lang.String)baseTypeData().getElementValueAsString(47);
    }

    
    public void setHazmatprof(java.lang.String Hazmatprof) {
        baseTypeData().setElementValue(83, Hazmatprof);
    }

    
    public java.lang.String getPeriod_Ind_Expiration_Date() {
        return (java.lang.String)baseTypeData().getElementValueAsString(91);
    }

    
    public java.lang.String getPack_Vo_Un_Iso() {
        return (java.lang.String)baseTypeData().getElementValueAsString(53);
    }

    
    public void setChanged_By(java.lang.String Changed_By) {
        baseTypeData().setElementValue(6, Changed_By);
    }

    
    public java.lang.String getPo_Unit() {
        return (java.lang.String)baseTypeData().getElementValueAsString(14);
    }

    
    public java.lang.String getSled_Bbd() {
        return (java.lang.String)baseTypeData().getElementValueAsString(102);
    }

    
    public void setMatl_Group(java.lang.String Matl_Group) {
        baseTypeData().setElementValue(10, Matl_Group);
    }

    
    public void setSled_Bbd(java.lang.String Sled_Bbd) {
        baseTypeData().setElementValue(102, Sled_Bbd);
    }

    
    public void setPack_Wt_Un(java.lang.String Pack_Wt_Un) {
        baseTypeData().setElementValue(49, Pack_Wt_Un);
    }

    
    public void setDivision(java.lang.String Division) {
        baseTypeData().setElementValue(38, Division);
    }

    
    public java.lang.String getMaint_Stat() {
        return (java.lang.String)baseTypeData().getElementValueAsString(8);
    }

    
    public void setPur_Valkey(java.lang.String Pur_Valkey) {
        baseTypeData().setElementValue(29, Pur_Valkey);
    }

    
    public java.lang.String getQm_Procmnt() {
        return (java.lang.String)baseTypeData().getElementValueAsString(64);
    }

    
    public void setCreated_By(java.lang.String Created_By) {
        baseTypeData().setElementValue(4, Created_By);
    }

    
    public void setDocument(java.lang.String Document) {
        baseTypeData().setElementValue(16, Document);
    }

    
    public java.lang.String getDoc_Chg_No() {
        return (java.lang.String)baseTypeData().getElementValueAsString(20);
    }

    
    public java.lang.String getInv_Mat_No_Guid() {
        return (java.lang.String)baseTypeData().getElementValueAsString(98);
    }

    
    public java.lang.String getGtin_Variant() {
        return (java.lang.String)baseTypeData().getElementValueAsString(103);
    }

    
    public java.lang.String getSh_Mat_Typ() {
        return (java.lang.String)baseTypeData().getElementValueAsString(59);
    }

    
    public java.lang.String getManuf_Prof() {
        return (java.lang.String)baseTypeData().getElementValueAsString(82);
    }

    
    public java.lang.String getDivision() {
        return (java.lang.String)baseTypeData().getElementValueAsString(38);
    }

    
    public java.lang.String getInv_Mat_No() {
        return (java.lang.String)baseTypeData().getElementValueAsString(81);
    }

    
    public java.lang.String getQual_Dik() {
        return (java.lang.String)baseTypeData().getElementValueAsString(78);
    }

    
    public java.lang.String getOld_Mat_No() {
        return (java.lang.String)baseTypeData().getElementValueAsString(11);
    }

    
    public void setAllwd_Vol(java.math.BigDecimal Allwd_Vol) {
        baseTypeData().setElementValue(51, Allwd_Vol);
    }

    
    public void setContainer(java.lang.String Container) {
        baseTypeData().setElementValue(33, Container);
    }

    
    public java.lang.String getCo_Product() {
        return (java.lang.String)baseTypeData().getElementValueAsString(70);
    }

    
    public java.lang.String getConfigured() {
        return (java.lang.String)baseTypeData().getElementValueAsString(57);
    }

    
    public void setMatcmpllvl(java.lang.String Matcmpllvl) {
        baseTypeData().setElementValue(88, Matcmpllvl);
    }

    
    public java.lang.String getMatl_Type() {
        return (java.lang.String)baseTypeData().getElementValueAsString(2);
    }

    
    public void setPack_Vo_Un_Iso(java.lang.String Pack_Vo_Un_Iso) {
        baseTypeData().setElementValue(53, Pack_Vo_Un_Iso);
    }

    
    public void setCm_Relevance_Flag(java.lang.String Cm_Relevance_Flag) {
        baseTypeData().setElementValue(101, Cm_Relevance_Flag);
    }

    
    public java.lang.String getInd_Sector() {
        return (java.lang.String)baseTypeData().getElementValueAsString(1);
    }

    
    public void setInv_Mat_No_External(java.lang.String Inv_Mat_No_External) {
        baseTypeData().setElementValue(97, Inv_Mat_No_External);
    }

    
    public void setHigh_Visc(java.lang.String High_Visc) {
        baseTypeData().setElementValue(84, High_Visc);
    }

    
    public void setClosed_Box(java.lang.String Closed_Box) {
        baseTypeData().setElementValue(86, Closed_Box);
    }

    
    public java.lang.String getPack_Wt_Un() {
        return (java.lang.String)baseTypeData().getElementValueAsString(49);
    }

    
    public void setLabel_Form(java.lang.String Label_Form) {
        baseTypeData().setElementValue(45, Label_Form);
    }

    
    public java.lang.String getCreated_By() {
        return (java.lang.String)baseTypeData().getElementValueAsString(4);
    }

    
    public void setDoc_Type(java.lang.String Doc_Type) {
        baseTypeData().setElementValue(17, Doc_Type);
    }

    
    public java.lang.String getMatcmpllvl() {
        return (java.lang.String)baseTypeData().getElementValueAsString(88);
    }

    
    public void setProd_Hier(java.lang.String Prod_Hier) {
        baseTypeData().setElementValue(46, Prod_Hier);
    }

    
    public void setHaz_Mat_No_Version(java.lang.String Haz_Mat_No_Version) {
        baseTypeData().setElementValue(96, Haz_Mat_No_Version);
    }

    
    public void setBatch_Mgmt(java.lang.String Batch_Mgmt) {
        baseTypeData().setElementValue(58, Batch_Mgmt);
    }

    
    public void setConfigured(java.lang.String Configured) {
        baseTypeData().setElementValue(57, Configured);
    }

    
    public java.lang.String getInv_Mat_No_External() {
        return (java.lang.String)baseTypeData().getElementValueAsString(97);
    }

    
    public void setAllowed_Wt(java.math.BigDecimal Allowed_Wt) {
        baseTypeData().setElementValue(48, Allowed_Wt);
    }

    
    public java.lang.String getCatprofile() {
        return (java.lang.String)baseTypeData().getElementValueAsString(65);
    }

    
    public java.lang.String getPack_Wt_Un_Iso() {
        return (java.lang.String)baseTypeData().getElementValueAsString(50);
    }

    
    public java.lang.String getSize_Dim() {
        return (java.lang.String)baseTypeData().getElementValueAsString(25);
    }

    
    public void setTemp_Conds(java.lang.String Temp_Conds) {
        baseTypeData().setElementValue(35, Temp_Conds);
    }

    
    public void setExtmatlgrp(java.lang.String Extmatlgrp) {
        baseTypeData().setElementValue(106, Extmatlgrp);
    }

    
    public void setPage_No(java.lang.String Page_No) {
        baseTypeData().setElementValue(21, Page_No);
    }

    
    public short getStack_Fact() {
        return baseTypeData().getElementValueAsShort(61);
    }

    
    public java.lang.String getPar_Eff() {
        return (java.lang.String)baseTypeData().getElementValueAsString(89);
    }

    
    public java.lang.String getDoc_Format() {
        return (java.lang.String)baseTypeData().getElementValueAsString(19);
    }

    
    public void setLooseorliq(java.lang.String Looseorliq) {
        baseTypeData().setElementValue(85, Looseorliq);
    }

    
    public void setBasic_Matl(java.lang.String Basic_Matl) {
        baseTypeData().setElementValue(26, Basic_Matl);
    }

    
    public void setOld_Mat_No(java.lang.String Old_Mat_No) {
        baseTypeData().setElementValue(11, Old_Mat_No);
    }

    
    public java.lang.String getPage_No() {
        return (java.lang.String)baseTypeData().getElementValueAsString(21);
    }

    
    public java.lang.String getMat_Grp_Sm() {
        return (java.lang.String)baseTypeData().getElementValueAsString(62);
    }

    
    public void setManu_Mat(java.lang.String Manu_Mat) {
        baseTypeData().setElementValue(79, Manu_Mat);
    }

    
    public java.math.BigDecimal getMinremlife() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(66);
    }

    
    public void setQual_Dik(java.lang.String Qual_Dik) {
        baseTypeData().setElementValue(78, Qual_Dik);
    }

    
    public java.lang.String getManu_Mat() {
        return (java.lang.String)baseTypeData().getElementValueAsString(79);
    }

    
    public java.lang.String getPur_Status() {
        return (java.lang.String)baseTypeData().getElementValueAsString(72);
    }

    
    public void setPr_Ref_Mat(java.lang.String Pr_Ref_Mat) {
        baseTypeData().setElementValue(71, Pr_Ref_Mat);
    }

    
    public void setInv_Mat_No(java.lang.String Inv_Mat_No) {
        baseTypeData().setElementValue(81, Inv_Mat_No);
    }

    
    public java.lang.String getUnit_Of_Wt() {
        return (java.lang.String)baseTypeData().getElementValueAsString(31);
    }

    
    public java.lang.String getBase_Uom_Iso() {
        return (java.lang.String)baseTypeData().getElementValueAsString(13);
    }

    
    public void setCad_Id(java.lang.String Cad_Id) {
        baseTypeData().setElementValue(47, Cad_Id);
    }

    
    public void setSerialization_Level(java.lang.String Serialization_Level) {
        baseTypeData().setElementValue(104, Serialization_Level);
    }

    
    public java.lang.String getTrans_Grp() {
        return (java.lang.String)baseTypeData().getElementValueAsString(36);
    }

    
    public void setMat_Grp_Sm(java.lang.String Mat_Grp_Sm) {
        baseTypeData().setElementValue(62, Mat_Grp_Sm);
    }

    
    public void setVol_Tol_Lt(java.math.BigDecimal Vol_Tol_Lt) {
        baseTypeData().setElementValue(55, Vol_Tol_Lt);
    }

    
    public void setMaint_Stat(java.lang.String Maint_Stat) {
        baseTypeData().setElementValue(8, Maint_Stat);
    }

    
    public void setPack_Vo_Un(java.lang.String Pack_Vo_Un) {
        baseTypeData().setElementValue(52, Pack_Vo_Un);
    }

    
    public java.lang.String getPur_Valkey() {
        return (java.lang.String)baseTypeData().getElementValueAsString(29);
    }

    
    public void setSize_Dim(java.lang.String Size_Dim) {
        baseTypeData().setElementValue(25, Size_Dim);
    }

    
    public java.lang.String getTemp_Conds() {
        return (java.lang.String)baseTypeData().getElementValueAsString(35);
    }

    
    public void setManuf_Prof(java.lang.String Manuf_Prof) {
        baseTypeData().setElementValue(82, Manuf_Prof);
    }

    
    public void setPo_Unit(java.lang.String Po_Unit) {
        baseTypeData().setElementValue(14, Po_Unit);
    }

    
    public java.lang.String getLabel_Type() {
        return (java.lang.String)baseTypeData().getElementValueAsString(44);
    }

    
    public void setDoc_Format(java.lang.String Doc_Format) {
        baseTypeData().setElementValue(19, Doc_Format);
    }

    
    public java.lang.String getDoc_Vers() {
        return (java.lang.String)baseTypeData().getElementValueAsString(18);
    }

    
    public void setUnit_Of_Wt_Iso(java.lang.String Unit_Of_Wt_Iso) {
        baseTypeData().setElementValue(32, Unit_Of_Wt_Iso);
    }

    
    public java.lang.String getPr_Ref_Mat() {
        return (java.lang.String)baseTypeData().getElementValueAsString(71);
    }

    
    public java.math.BigDecimal getWt_Tol_Lt() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(54);
    }

    
    public void setDoc_Vers(java.lang.String Doc_Vers) {
        baseTypeData().setElementValue(18, Doc_Vers);
    }

    
    public java.lang.String getStor_Conds() {
        return (java.lang.String)baseTypeData().getElementValueAsString(34);
    }

    
    public MetaData metadata() {
        return metadata;
    }

    
    public java.lang.String getHazmatprof() {
        return (java.lang.String)baseTypeData().getElementValueAsString(83);
    }

    
    public java.lang.String getSeason() {
        return (java.lang.String)baseTypeData().getElementValueAsString(43);
    }

    
    public java.lang.String getUnit_Of_Wt_Iso() {
        return (java.lang.String)baseTypeData().getElementValueAsString(32);
    }

    
    public java.lang.String getStd_Descr() {
        return (java.lang.String)baseTypeData().getElementValueAsString(27);
    }

    
    public java.lang.String getAuthoritygroup() {
        return (java.lang.String)baseTypeData().getElementValueAsString(63);
    }

    
    public void setMaterial_Fixed(java.lang.String Material_Fixed) {
        baseTypeData().setElementValue(100, Material_Fixed);
    }

    
    public java.lang.String getBatch_Mgmt() {
        return (java.lang.String)baseTypeData().getElementValueAsString(58);
    }

    
    public java.math.BigDecimal getShelf_Life() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(67);
    }

    
    public java.lang.String getMfr_No() {
        return (java.lang.String)baseTypeData().getElementValueAsString(80);
    }

    
    public java.lang.String getMat_Status() {
        return (java.lang.String)baseTypeData().getElementValueAsString(7);
    }

    
    public java.lang.String getProd_Hier() {
        return (java.lang.String)baseTypeData().getElementValueAsString(46);
    }

    
    public java.math.BigDecimal getAllowed_Wt() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(48);
    }

    
    public java.lang.String getRound_Up_Rule_Expiration_Date() {
        return (java.lang.String)baseTypeData().getElementValueAsString(90);
    }

    
    public void setPageformat(java.lang.String Pageformat) {
        baseTypeData().setElementValue(24, Pageformat);
    }

    
    public void setMinremlife(java.math.BigDecimal Minremlife) {
        baseTypeData().setElementValue(66, Minremlife);
    }

    
    public void setAuthoritygroup(java.lang.String Authoritygroup) {
        baseTypeData().setElementValue(63, Authoritygroup);
    }

    
    public java.lang.String getConf_Matl() {
        return (java.lang.String)baseTypeData().getElementValueAsString(69);
    }

    
    public void setSh_Mat_Typ(java.lang.String Sh_Mat_Typ) {
        baseTypeData().setElementValue(59, Sh_Mat_Typ);
    }

    
    public void setSal_Status(java.lang.String Sal_Status) {
        baseTypeData().setElementValue(73, Sal_Status);
    }

    
    public void setInd_Sector(java.lang.String Ind_Sector) {
        baseTypeData().setElementValue(1, Ind_Sector);
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  Bapi_Mara_GaType parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Bapi_Mara_GaType parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getInv_Mat_No_Version() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(99);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getBase_Uom() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(12);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getGtin_Variant() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(103);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSh_Mat_Typ() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(59);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getManuf_Prof() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(82);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDivision() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(38);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPl_Ref_Mat() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(105);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getLabel_Form() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(45);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getEnvt_Rlvt() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(76);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSal_Status() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(73);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getInv_Mat_No() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(81);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getQual_Dik() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(78);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getNet_Weight() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(30);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getNo_Sheets() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(22);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getOld_Mat_No() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(11);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCo_Product() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(70);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getConfigured() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(57);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSerialization_Level() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(104);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getProd_Composition_On_Packaging() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(92);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getProd_Memo() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(23);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getUomusage() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(107);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMatl_Type() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCompetitor() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(39);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getHaz_Mat_No_Guid() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(95);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getInd_Sector() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getChanged_By() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(6);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSvalidfrom() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(75);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getBasic_Matl() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(26);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPack_Wt_Un() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(49);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCreated_By() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(4);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMatcmpllvl() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(88);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getProc_Rule() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(41);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getQty_Gr_Gi() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(40);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getAppd_B_Rec() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(87);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getInv_Mat_No_External() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(97);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getProd_Alloc() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(77);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCatprofile() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(65);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPack_Wt_Un_Iso() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(50);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSize_Dim() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(25);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getLast_Chnge() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(5);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCm_Relevance_Flag() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(101);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getStor_Pct() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(68);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getStack_Fact() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(61);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPar_Eff() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(89);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDoc_Format() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(19);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getHaz_Mat_No_Version() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(96);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDoc_Type() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(17);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getHaz_Mat_No() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(37);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPage_No() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(21);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMat_Grp_Sm() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(62);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMinremlife() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(66);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getExtmatlgrp() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(106);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPvalidfrom() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(74);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMaterial_Fixed() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(100);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDsn_Office() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(28);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPageformat() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(24);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMaterial() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPo_Unit_Iso() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(15);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getManu_Mat() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(79);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getItem_Cat() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(93);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getVol_Tol_Lt() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(55);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPur_Status() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(72);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getHigh_Visc() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(84);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getUnit_Of_Wt() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(31);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getBase_Uom_Iso() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(13);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSup_Source() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(42);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getLooseorliq() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(85);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTrans_Grp() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(36);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getHaz_Mat_No_External() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(94);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getClosed_Box() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(86);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getAllwd_Vol() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(51);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCreated_On() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getContainer() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(33);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPur_Valkey() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(29);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTemp_Conds() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(35);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getLabel_Type() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(44);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMatl_Group() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(10);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDoc_Vers() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(18);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPack_Vo_Un() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(52);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getFill_Level() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(60);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPr_Ref_Mat() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(71);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDel_Flag() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(9);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDocument() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(16);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getWt_Tol_Lt() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(54);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getStor_Conds() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(34);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getHazmatprof() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(83);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSeason() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(43);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getVar_Ord_Un() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(56);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getUnit_Of_Wt_Iso() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(32);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getStd_Descr() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(27);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getAuthoritygroup() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(63);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getBatch_Mgmt() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(58);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCad_Id() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(47);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getShelf_Life() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(67);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMfr_No() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(80);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMat_Status() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(7);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPeriod_Ind_Expiration_Date() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(91);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPack_Vo_Un_Iso() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(53);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getProd_Hier() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(46);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPo_Unit() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(14);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getAllowed_Wt() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(48);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRound_Up_Rule_Expiration_Date() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(90);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSled_Bbd() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(102);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMaint_Stat() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(8);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getQm_Procmnt() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(64);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getConf_Matl() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(69);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDoc_Chg_No() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(20);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getInv_Mat_No_Guid() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(98);
        }
    
    }

}
