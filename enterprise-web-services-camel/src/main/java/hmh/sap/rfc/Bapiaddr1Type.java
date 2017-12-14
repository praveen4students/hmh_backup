package hmh.sap.rfc;


public class Bapiaddr1Type extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1354127028430L) ;

    private  Bapiaddr1Type.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.XSDL_COMPLEX_TYPE, "urn:sap-com:document:sap:rfc:functions", "BAPIADDR1", 67, 0, hmh.sap.rfc.Bapiaddr1Type.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "BAPIADDR1", 1520, 3040, -1, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"BAPIADDR1\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">BAPI Reference Structure for Addresses (Org./Company)</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>110</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>1520</ifr:internalLength1><ifr:internalLength2>3040</ifr:internalLength2></ifr:definition></ifr:container></s0:type>");
        descriptorSetElementProperties(descriptor, 0, "ADDR_NO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Addr_No", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "ADDR_NO", 0, 0, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ADDR_NO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Address number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>ADRC</ifr:checkTable><ifr:offset1>0</ifr:offset1><ifr:offset2>0</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_ADDRNUM\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 1, "FORMOFADDR", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Formofaddr", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "20"}}, "FORMOFADDR", 10, 20, -1, 20, 40, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"FORMOFADDR\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Form of address text</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>10</ifr:offset1><ifr:offset2>20</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_TITLE_T\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>20</ifr:length><ifr:internalLength1>20</ifr:internalLength1><ifr:internalLength2>40</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>20</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 2, "NAME", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Name", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "40"}}, "NAME", 30, 60, -1, 40, 80, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"NAME\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Name 1</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>30</ifr:offset1><ifr:offset2>60</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_NAME1\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>40</ifr:length><ifr:internalLength1>40</ifr:internalLength1><ifr:internalLength2>80</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>40</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 3, "NAME_2", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Name_2", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "40"}}, "NAME_2", 70, 140, -1, 40, 80, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"NAME_2\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Name 2</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>70</ifr:offset1><ifr:offset2>140</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_NAME2\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>40</ifr:length><ifr:internalLength1>40</ifr:internalLength1><ifr:internalLength2>80</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>40</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 4, "NAME_3", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Name_3", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "40"}}, "NAME_3", 110, 220, -1, 40, 80, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"NAME_3\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Name 3</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>110</ifr:offset1><ifr:offset2>220</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_NAME3\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>40</ifr:length><ifr:internalLength1>40</ifr:internalLength1><ifr:internalLength2>80</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>40</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 5, "NAME_4", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Name_4", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "40"}}, "NAME_4", 150, 300, -1, 40, 80, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"NAME_4\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Name 4</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>150</ifr:offset1><ifr:offset2>300</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_NAME4\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>40</ifr:length><ifr:internalLength1>40</ifr:internalLength1><ifr:internalLength2>80</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>40</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 6, "C_O_NAME", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "C_O_Name", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "40"}}, "C_O_NAME", 190, 380, -1, 40, 80, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"C_O_NAME\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">c/o name</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>190</ifr:offset1><ifr:offset2>380</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_NAME_CO\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>40</ifr:length><ifr:internalLength1>40</ifr:internalLength1><ifr:internalLength2>80</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>40</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 7, "CITY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "City", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "40"}}, "CITY", 230, 460, -1, 40, 80, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CITY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">City</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>230</ifr:offset1><ifr:offset2>460</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_CITY1\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>40</ifr:length><ifr:internalLength1>40</ifr:internalLength1><ifr:internalLength2>80</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>40</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 8, "DISTRICT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "District", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "40"}}, "DISTRICT", 270, 540, -1, 40, 80, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DISTRICT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">District</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>270</ifr:offset1><ifr:offset2>540</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_CITY2\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>40</ifr:length><ifr:internalLength1>40</ifr:internalLength1><ifr:internalLength2>80</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>40</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 9, "CITY_NO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "City_No", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "12"}}, "CITY_NO", 310, 620, -1, 12, 24, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CITY_NO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">City code for city/street file</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>ADRCITY</ifr:checkTable><ifr:offset1>310</ifr:offset1><ifr:offset2>620</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_CITYNUM\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>12</ifr:length><ifr:internalLength1>12</ifr:internalLength1><ifr:internalLength2>24</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>12</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 10, "POSTL_COD1", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Postl_Cod1", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "POSTL_COD1", 322, 644, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"POSTL_COD1\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">City postal code</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>322</ifr:offset1><ifr:offset2>644</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_PSTCD1\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 11, "POSTL_COD2", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Postl_Cod2", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "POSTL_COD2", 332, 664, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"POSTL_COD2\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">PO Box postal code</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>332</ifr:offset1><ifr:offset2>664</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_PSTCD2\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 12, "POSTL_COD3", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Postl_Cod3", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "POSTL_COD3", 342, 684, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"POSTL_COD3\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Company postal code (for large customers)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>342</ifr:offset1><ifr:offset2>684</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_PSTCD3\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 13, "PO_BOX", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Po_Box", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "PO_BOX", 352, 704, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PO_BOX\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">PO Box</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>352</ifr:offset1><ifr:offset2>704</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_POBX\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 14, "PO_BOX_CIT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Po_Box_Cit", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "40"}}, "PO_BOX_CIT", 362, 724, -1, 40, 80, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PO_BOX_CIT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">PO Box city</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>362</ifr:offset1><ifr:offset2>724</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_POBXLOC\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>40</ifr:length><ifr:internalLength1>40</ifr:internalLength1><ifr:internalLength2>80</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>40</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 15, "DELIV_DIS", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Deliv_Dis", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "15"}}, "DELIV_DIS", 402, 804, -1, 15, 30, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DELIV_DIS\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Post delivery district</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>402</ifr:offset1><ifr:offset2>804</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_PSTLAR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>15</ifr:length><ifr:internalLength1>15</ifr:internalLength1><ifr:internalLength2>30</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>15</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 16, "STREET", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Street", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "40"}}, "STREET", 417, 834, -1, 40, 80, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"STREET\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Street name</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>417</ifr:offset1><ifr:offset2>834</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_STR_OLD\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>40</ifr:length><ifr:internalLength1>40</ifr:internalLength1><ifr:internalLength2>80</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>40</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 17, "STREET_NO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Street_No", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "12"}}, "STREET_NO", 457, 914, -1, 12, 24, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"STREET_NO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Street code for city/street file</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>ADRSTREET</ifr:checkTable><ifr:offset1>457</ifr:offset1><ifr:offset2>914</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_STRNUM\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>12</ifr:length><ifr:internalLength1>12</ifr:internalLength1><ifr:internalLength2>24</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>12</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 18, "STR_ABBR", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Str_Abbr", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "STR_ABBR", 469, 938, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"STR_ABBR\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Abbreviation of street name (e.g in Spain)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>ADRSTRTYPE</ifr:checkTable><ifr:offset1>469</ifr:offset1><ifr:offset2>938</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_STRABBR\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 19, "HOUSE_NO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "House_No", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "HOUSE_NO", 471, 942, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"HOUSE_NO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">House Number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>471</ifr:offset1><ifr:offset2>942</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_HSNM1\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 20, "STR_SUPPL1", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Str_Suppl1", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "40"}}, "STR_SUPPL1", 481, 962, -1, 40, 80, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"STR_SUPPL1\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Street 2</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>481</ifr:offset1><ifr:offset2>962</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_STRSPP1\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>40</ifr:length><ifr:internalLength1>40</ifr:internalLength1><ifr:internalLength2>80</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>40</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 21, "STR_SUPPL2", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Str_Suppl2", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "40"}}, "STR_SUPPL2", 521, 1042, -1, 40, 80, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"STR_SUPPL2\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Street 3</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>521</ifr:offset1><ifr:offset2>1042</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_STRSPP2\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>40</ifr:length><ifr:internalLength1>40</ifr:internalLength1><ifr:internalLength2>80</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>40</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 22, "LOCATION", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Location", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "40"}}, "LOCATION", 561, 1122, -1, 40, 80, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"LOCATION\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Street 5</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>561</ifr:offset1><ifr:offset2>1122</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_LCTN\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>40</ifr:length><ifr:internalLength1>40</ifr:internalLength1><ifr:internalLength2>80</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>40</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 23, "BUILDING", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Building", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "BUILDING", 601, 1202, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"BUILDING\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">old: building (no. or abbreviation)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>601</ifr:offset1><ifr:offset2>1202</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_BLD_OLD\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 24, "FLOOR", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Floor", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "FLOOR", 611, 1222, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"FLOOR\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Floor in building</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>611</ifr:offset1><ifr:offset2>1222</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_FLOOR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 25, "ROOM_NO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Room_No", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "ROOM_NO", 621, 1242, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ROOM_NO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Room or Appartment Number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>621</ifr:offset1><ifr:offset2>1242</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_ROOMNUM\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 26, "COUNTRY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Country", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "COUNTRY", 631, 1262, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"COUNTRY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Country Key</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>T005</ifr:checkTable><ifr:offset1>631</ifr:offset1><ifr:offset2>1262</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"LAND1\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 27, "LANGU", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Langu", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "LANGU", 634, 1268, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"LANGU\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Language Key</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>T002</ifr:checkTable><ifr:offset1>634</ifr:offset1><ifr:offset2>1268</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"SPRAS\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>LANG</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength><ifr:conversionExit>ISOLA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 28, "REGION", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Region", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "REGION", 635, 1270, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REGION\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Region (State, Province, County)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>T005S</ifr:checkTable><ifr:offset1>635</ifr:offset1><ifr:offset2>1270</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"REGIO\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 29, "SORT1", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Sort1", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "20"}}, "SORT1", 638, 1276, -1, 20, 40, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SORT1\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Search Term 1</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>638</ifr:offset1><ifr:offset2>1276</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_SORT1\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>20</ifr:length><ifr:internalLength1>20</ifr:internalLength1><ifr:internalLength2>40</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>20</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 30, "SORT2", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Sort2", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "20"}}, "SORT2", 658, 1316, -1, 20, 40, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SORT2\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Search Term 2</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>658</ifr:offset1><ifr:offset2>1316</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_SORT2\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>20</ifr:length><ifr:internalLength1>20</ifr:internalLength1><ifr:internalLength2>40</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>20</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 31, "TIME_ZONE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Time_Zone", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "6"}}, "TIME_ZONE", 678, 1356, -1, 6, 12, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TIME_ZONE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Address time zone</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TTZZ</ifr:checkTable><ifr:offset1>678</ifr:offset1><ifr:offset2>1356</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_TZONE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>6</ifr:length><ifr:internalLength1>6</ifr:internalLength1><ifr:internalLength2>12</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>6</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 32, "TAXJURCODE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Taxjurcode", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "15"}}, "TAXJURCODE", 684, 1368, -1, 15, 30, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TAXJURCODE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Tax jurisdiction code</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>684</ifr:offset1><ifr:offset2>1368</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_TXJCD\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>15</ifr:length><ifr:internalLength1>15</ifr:internalLength1><ifr:internalLength2>30</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>15</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 33, "ADR_NOTES", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Adr_Notes", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "50"}}, "ADR_NOTES", 699, 1398, -1, 50, 100, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ADR_NOTES\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Address notes</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>699</ifr:offset1><ifr:offset2>1398</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_REMARK1\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>50</ifr:length><ifr:internalLength1>50</ifr:internalLength1><ifr:internalLength2>100</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>50</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 34, "COMM_TYPE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Comm_Type", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "COMM_TYPE", 749, 1498, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"COMM_TYPE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Communication Method (Key) (Business Address Services)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TSAC</ifr:checkTable><ifr:offset1>749</ifr:offset1><ifr:offset2>1498</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_COMM\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 35, "TEL1_NUMBR", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Tel1_Numbr", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "30"}}, "TEL1_NUMBR", 752, 1504, -1, 30, 60, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TEL1_NUMBR\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">First telephone no.: dialling code+number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>752</ifr:offset1><ifr:offset2>1504</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_TLNMBR1\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>30</ifr:length><ifr:internalLength1>30</ifr:internalLength1><ifr:internalLength2>60</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>30</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 36, "TEL1_EXT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Tel1_Ext", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "TEL1_EXT", 782, 1564, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TEL1_EXT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">First Telephone No.: Extension</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>782</ifr:offset1><ifr:offset2>1564</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_TLXTNS1\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 37, "FAX_NUMBER", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Fax_Number", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "30"}}, "FAX_NUMBER", 792, 1584, -1, 30, 60, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"FAX_NUMBER\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">First fax no.: dialling code+number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>792</ifr:offset1><ifr:offset2>1584</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_FXNMBR1\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>30</ifr:length><ifr:internalLength1>30</ifr:internalLength1><ifr:internalLength2>60</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>30</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 38, "FAX_EXTENS", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Fax_Extens", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "FAX_EXTENS", 822, 1644, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"FAX_EXTENS\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">First fax no.: extension</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>822</ifr:offset1><ifr:offset2>1644</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_FXXTNS1\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 39, "STREET_LNG", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Street_Lng", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "60"}}, "STREET_LNG", 832, 1664, -1, 60, 120, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"STREET_LNG\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Street</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>832</ifr:offset1><ifr:offset2>1664</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_STREET\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>60</ifr:length><ifr:internalLength1>60</ifr:internalLength1><ifr:internalLength2>120</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>60</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 40, "DISTRCT_NO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Distrct_No", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "8"}}, "DISTRCT_NO", 892, 1784, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DISTRCT_NO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">District code for City and Street file</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>ADRCITYPRT</ifr:checkTable><ifr:offset1>892</ifr:offset1><ifr:offset2>1784</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_CITYPNM\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>8</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 41, "CHCKSTATUS", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Chckstatus", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "CHCKSTATUS", 900, 1800, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CHCKSTATUS\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">City file test status</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>900</ifr:offset1><ifr:offset2>1800</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_CHECKST\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 42, "PBOXCIT_NO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Pboxcit_No", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "12"}}, "PBOXCIT_NO", 901, 1802, -1, 12, 24, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PBOXCIT_NO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">City PO box code (City file)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>ADRCITY</ifr:checkTable><ifr:offset1>901</ifr:offset1><ifr:offset2>1802</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_CIT2NUM\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>12</ifr:length><ifr:internalLength1>12</ifr:internalLength1><ifr:internalLength2>24</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>12</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 43, "TRANSPZONE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Transpzone", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "TRANSPZONE", 913, 1826, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TRANSPZONE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Transportation zone to or from which the goods are delivered</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TZONE</ifr:checkTable><ifr:offset1>913</ifr:offset1><ifr:offset2>1826</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"LZONE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 44, "HOUSE_NO2", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "House_No2", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "HOUSE_NO2", 923, 1846, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"HOUSE_NO2\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">House number supplement</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>923</ifr:offset1><ifr:offset2>1846</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_HSNM2\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 45, "E_MAIL", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "E_Mail", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "241"}}, "E_MAIL", 933, 1866, -1, 241, 482, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"E_MAIL\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">E-Mail Address</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>933</ifr:offset1><ifr:offset2>1866</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_SMTPADR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>241</ifr:length><ifr:internalLength1>241</ifr:internalLength1><ifr:internalLength2>482</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>241</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 46, "STR_SUPPL3", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Str_Suppl3", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "40"}}, "STR_SUPPL3", 1174, 2348, -1, 40, 80, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"STR_SUPPL3\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Street 4</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1174</ifr:offset1><ifr:offset2>2348</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_STRSPP3\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>40</ifr:length><ifr:internalLength1>40</ifr:internalLength1><ifr:internalLength2>80</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>40</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 47, "TITLE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Title", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "30"}}, "TITLE", 1214, 2428, -1, 30, 60, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TITLE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Title text</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1214</ifr:offset1><ifr:offset2>2428</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_TITLETX\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>30</ifr:length><ifr:internalLength1>30</ifr:internalLength1><ifr:internalLength2>60</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>30</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 48, "COUNTRYISO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Countryiso", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "COUNTRYISO", 1244, 2488, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"COUNTRYISO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Country ISO code</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>1244</ifr:offset1><ifr:offset2>2488</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"INTCA\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 49, "LANGU_ISO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Langu_Iso", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "LANGU_ISO", 1246, 2492, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"LANGU_ISO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Language according to ISO 639</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1246</ifr:offset1><ifr:offset2>2492</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"LAISO\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 50, "BUILD_LONG", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Build_Long", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "20"}}, "BUILD_LONG", 1248, 2496, -1, 20, 40, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"BUILD_LONG\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Building (Number or Code)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1248</ifr:offset1><ifr:offset2>2496</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_BLDNG\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>20</ifr:length><ifr:internalLength1>20</ifr:internalLength1><ifr:internalLength2>40</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>20</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 51, "REGIOGROUP", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Regiogroup", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "8"}}, "REGIOGROUP", 1268, 2536, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REGIOGROUP\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Regional structure grouping</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>ADRREGGRP</ifr:checkTable><ifr:offset1>1268</ifr:offset1><ifr:offset2>2536</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"REGIOGROUP\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>8</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 52, "HOME_CITY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Home_City", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "40"}}, "HOME_CITY", 1276, 2552, -1, 40, 80, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"HOME_CITY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">City (different from postal city)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1276</ifr:offset1><ifr:offset2>2552</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_CITY3\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>40</ifr:length><ifr:internalLength1>40</ifr:internalLength1><ifr:internalLength2>80</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>40</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 53, "HOMECITYNO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Homecityno", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "12"}}, "HOMECITYNO", 1316, 2632, -1, 12, 24, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"HOMECITYNO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Different city code for city/street file</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1316</ifr:offset1><ifr:offset2>2632</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_CITYHNM\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>12</ifr:length><ifr:internalLength1>12</ifr:internalLength1><ifr:internalLength2>24</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>12</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 54, "PCODE1_EXT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Pcode1_Ext", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "PCODE1_EXT", 1328, 2656, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PCODE1_EXT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">City postal code extension, e.g. ZIP+4+2 code</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1328</ifr:offset1><ifr:offset2>2656</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_PST1XT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 55, "PCODE2_EXT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Pcode2_Ext", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "PCODE2_EXT", 1338, 2676, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PCODE2_EXT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">PO Box postal code extension, e.g. ZIP+4+2 code</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1338</ifr:offset1><ifr:offset2>2676</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_PST2XT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 56, "PCODE3_EXT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Pcode3_Ext", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "PCODE3_EXT", 1348, 2696, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PCODE3_EXT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Major customer postal code extension, e.g. ZIP+4+2 code</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1348</ifr:offset1><ifr:offset2>2696</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_PST3XT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 57, "PO_W_O_NO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Po_W_O_No", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PO_W_O_NO", 1358, 2716, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PO_W_O_NO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Flag: PO Box without number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>1358</ifr:offset1><ifr:offset2>2716</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_POBXNUM\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 58, "PO_BOX_REG", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Po_Box_Reg", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "PO_BOX_REG", 1359, 2718, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PO_BOX_REG\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Region for PO Box (Country, State, Province, ...)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1359</ifr:offset1><ifr:offset2>2718</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_POBXREG\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 59, "POBOX_CTRY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Pobox_Ctry", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "POBOX_CTRY", 1362, 2724, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"POBOX_CTRY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">PO box country</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1362</ifr:offset1><ifr:offset2>2724</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_POBXCTY\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 60, "PO_CTRYISO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Po_Ctryiso", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "PO_CTRYISO", 1365, 2730, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PO_CTRYISO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Country ISO code</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>1365</ifr:offset1><ifr:offset2>2730</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"INTCA\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 61, "HOMEPAGE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Homepage", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "132"}}, "HOMEPAGE", 1367, 2734, -1, 132, 264, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"HOMEPAGE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">URI, e.g. Homepage or ftp Address</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1367</ifr:offset1><ifr:offset2>2734</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_URISCR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>132</ifr:length><ifr:internalLength1>132</ifr:internalLength1><ifr:internalLength2>264</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>132</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 62, "DONT_USE_S", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Dont_Use_S", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "DONT_USE_S", 1499, 2998, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DONT_USE_S\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Street Address Undeliverable Flag</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TSAD12</ifr:checkTable><ifr:offset1>1499</ifr:offset1><ifr:offset2>2998</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_NO_USES\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 63, "DONT_USE_P", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Dont_Use_P", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "DONT_USE_P", 1503, 3006, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DONT_USE_P\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">PO Box Address Undeliverable Flag</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TSAD12</ifr:checkTable><ifr:offset1>1503</ifr:offset1><ifr:offset2>3006</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_NO_USEP\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 64, "HOUSE_NO3", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "House_No3", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "HOUSE_NO3", 1507, 3014, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"HOUSE_NO3\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">House number range</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1507</ifr:offset1><ifr:offset2>3014</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_HSNM3\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 65, "LANGU_CR", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Langu_Cr", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "LANGU_CR", 1517, 3034, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"LANGU_CR\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Address record creation original language</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1517</ifr:offset1><ifr:offset2>3034</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_LANGUCR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>LANG</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength><ifr:conversionExit>ISOLA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 66, "LANGUCRISO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Langucriso", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "LANGUCRISO", 1518, 3036, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"LANGUCRISO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Language according to ISO 639</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1518</ifr:offset1><ifr:offset2>3036</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"LAISO\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        staticDescriptor = descriptor;
    }
    protected  Bapiaddr1Type (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    public  Bapiaddr1Type () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public java.lang.String getPostl_Cod1() {
        return (java.lang.String)baseTypeData().getElementValueAsString(10);
    }

    
    public java.lang.String getE_Mail() {
        return (java.lang.String)baseTypeData().getElementValueAsString(45);
    }

    
    public java.lang.String getChckstatus() {
        return (java.lang.String)baseTypeData().getElementValueAsString(41);
    }

    
    public java.lang.String getCountryiso() {
        return (java.lang.String)baseTypeData().getElementValueAsString(48);
    }

    
    public void setStr_Suppl1(java.lang.String Str_Suppl1) {
        baseTypeData().setElementValue(20, Str_Suppl1);
    }

    
    public java.lang.String getPcode1_Ext() {
        return (java.lang.String)baseTypeData().getElementValueAsString(54);
    }

    
    public java.lang.String getDistrict() {
        return (java.lang.String)baseTypeData().getElementValueAsString(8);
    }

    
    public java.lang.String getCountry() {
        return (java.lang.String)baseTypeData().getElementValueAsString(26);
    }

    
    public java.lang.String getRegion() {
        return (java.lang.String)baseTypeData().getElementValueAsString(28);
    }

    
    public void setHomecityno(java.lang.String Homecityno) {
        baseTypeData().setElementValue(53, Homecityno);
    }

    
    public java.lang.String getC_O_Name() {
        return (java.lang.String)baseTypeData().getElementValueAsString(6);
    }

    
    public void setName_2(java.lang.String Name_2) {
        baseTypeData().setElementValue(3, Name_2);
    }

    
    public void setPcode3_Ext(java.lang.String Pcode3_Ext) {
        baseTypeData().setElementValue(56, Pcode3_Ext);
    }

    
    public void setCountryiso(java.lang.String Countryiso) {
        baseTypeData().setElementValue(48, Countryiso);
    }

    
    public java.lang.String getSort2() {
        return (java.lang.String)baseTypeData().getElementValueAsString(30);
    }

    
    public void setSort2(java.lang.String Sort2) {
        baseTypeData().setElementValue(30, Sort2);
    }

    
    public java.lang.String getHouse_No3() {
        return (java.lang.String)baseTypeData().getElementValueAsString(64);
    }

    
    public java.lang.String getHomepage() {
        return (java.lang.String)baseTypeData().getElementValueAsString(61);
    }

    
    public void setComm_Type(java.lang.String Comm_Type) {
        baseTypeData().setElementValue(34, Comm_Type);
    }

    
    public java.lang.String getHouse_No() {
        return (java.lang.String)baseTypeData().getElementValueAsString(19);
    }

    
    public java.lang.String getRoom_No() {
        return (java.lang.String)baseTypeData().getElementValueAsString(25);
    }

    
    public void setTel1_Ext(java.lang.String Tel1_Ext) {
        baseTypeData().setElementValue(36, Tel1_Ext);
    }

    
    public void setTranspzone(java.lang.String Transpzone) {
        baseTypeData().setElementValue(43, Transpzone);
    }

    
    public java.lang.String getPostl_Cod2() {
        return (java.lang.String)baseTypeData().getElementValueAsString(11);
    }

    
    public void setTel1_Numbr(java.lang.String Tel1_Numbr) {
        baseTypeData().setElementValue(35, Tel1_Numbr);
    }

    
    public void setDistrct_No(java.lang.String Distrct_No) {
        baseTypeData().setElementValue(40, Distrct_No);
    }

    
    public void setStreet_Lng(java.lang.String Street_Lng) {
        baseTypeData().setElementValue(39, Street_Lng);
    }

    
    public java.lang.String getPcode3_Ext() {
        return (java.lang.String)baseTypeData().getElementValueAsString(56);
    }

    
    public void setName(java.lang.String Name) {
        baseTypeData().setElementValue(2, Name);
    }

    
    public void setDont_Use_P(java.lang.String Dont_Use_P) {
        baseTypeData().setElementValue(63, Dont_Use_P);
    }

    
    public java.lang.String getStr_Suppl3() {
        return (java.lang.String)baseTypeData().getElementValueAsString(46);
    }

    
    public void setTime_Zone(java.lang.String Time_Zone) {
        baseTypeData().setElementValue(31, Time_Zone);
    }

    
    public java.lang.String getHouse_No2() {
        return (java.lang.String)baseTypeData().getElementValueAsString(44);
    }

    
    public void setLangu(java.lang.String Langu) {
        baseTypeData().setElementValue(27, Langu);
    }

    
    public void setCountry(java.lang.String Country) {
        baseTypeData().setElementValue(26, Country);
    }

    
    public void setE_Mail(java.lang.String E_Mail) {
        baseTypeData().setElementValue(45, E_Mail);
    }

    
    public java.lang.String getPostl_Cod3() {
        return (java.lang.String)baseTypeData().getElementValueAsString(12);
    }

    
    public void setRegion(java.lang.String Region) {
        baseTypeData().setElementValue(28, Region);
    }

    
    public java.lang.String getDont_Use_P() {
        return (java.lang.String)baseTypeData().getElementValueAsString(63);
    }

    
    public void setBuild_Long(java.lang.String Build_Long) {
        baseTypeData().setElementValue(50, Build_Long);
    }

    
    public java.lang.String getFax_Number() {
        return (java.lang.String)baseTypeData().getElementValueAsString(37);
    }

    
    public java.lang.String getStr_Suppl2() {
        return (java.lang.String)baseTypeData().getElementValueAsString(21);
    }

    
    public void setFax_Number(java.lang.String Fax_Number) {
        baseTypeData().setElementValue(37, Fax_Number);
    }

    
    public java.lang.String getPcode2_Ext() {
        return (java.lang.String)baseTypeData().getElementValueAsString(55);
    }

    
    public java.lang.String getStr_Abbr() {
        return (java.lang.String)baseTypeData().getElementValueAsString(18);
    }

    
    public void setPboxcit_No(java.lang.String Pboxcit_No) {
        baseTypeData().setElementValue(42, Pboxcit_No);
    }

    
    public java.lang.String getPo_W_O_No() {
        return (java.lang.String)baseTypeData().getElementValueAsString(57);
    }

    
    public void setDistrict(java.lang.String District) {
        baseTypeData().setElementValue(8, District);
    }

    
    public java.lang.String getLocation() {
        return (java.lang.String)baseTypeData().getElementValueAsString(22);
    }

    
    public void setLangu_Cr(java.lang.String Langu_Cr) {
        baseTypeData().setElementValue(65, Langu_Cr);
    }

    
    public void setHouse_No(java.lang.String House_No) {
        baseTypeData().setElementValue(19, House_No);
    }

    
    public java.lang.String getTel1_Numbr() {
        return (java.lang.String)baseTypeData().getElementValueAsString(35);
    }

    
    public void setPo_Ctryiso(java.lang.String Po_Ctryiso) {
        baseTypeData().setElementValue(60, Po_Ctryiso);
    }

    
    public java.lang.String getLangu_Cr() {
        return (java.lang.String)baseTypeData().getElementValueAsString(65);
    }

    
    public java.lang.String getPobox_Ctry() {
        return (java.lang.String)baseTypeData().getElementValueAsString(59);
    }

    
    public java.lang.String getRegiogroup() {
        return (java.lang.String)baseTypeData().getElementValueAsString(51);
    }

    
    public java.lang.String getCity_No() {
        return (java.lang.String)baseTypeData().getElementValueAsString(9);
    }

    
    public void setPo_W_O_No(java.lang.String Po_W_O_No) {
        baseTypeData().setElementValue(57, Po_W_O_No);
    }

    
    public void setName_4(java.lang.String Name_4) {
        baseTypeData().setElementValue(5, Name_4);
    }

    
    public void setFax_Extens(java.lang.String Fax_Extens) {
        baseTypeData().setElementValue(38, Fax_Extens);
    }

    
    public void setTitle(java.lang.String Title) {
        baseTypeData().setElementValue(47, Title);
    }

    
    public void setPostl_Cod2(java.lang.String Postl_Cod2) {
        baseTypeData().setElementValue(11, Postl_Cod2);
    }

    
    public java.lang.String getStr_Suppl1() {
        return (java.lang.String)baseTypeData().getElementValueAsString(20);
    }

    
    public void setFloor(java.lang.String Floor) {
        baseTypeData().setElementValue(24, Floor);
    }

    
    public java.lang.String getSort1() {
        return (java.lang.String)baseTypeData().getElementValueAsString(29);
    }

    
    public void setCity(java.lang.String City) {
        baseTypeData().setElementValue(7, City);
    }

    
    public java.lang.String getPboxcit_No() {
        return (java.lang.String)baseTypeData().getElementValueAsString(42);
    }

    
    public java.lang.String getStreet() {
        return (java.lang.String)baseTypeData().getElementValueAsString(16);
    }

    
    public void setStreet_No(java.lang.String Street_No) {
        baseTypeData().setElementValue(17, Street_No);
    }

    
    public void setDeliv_Dis(java.lang.String Deliv_Dis) {
        baseTypeData().setElementValue(15, Deliv_Dis);
    }

    
    public void setFormofaddr(java.lang.String Formofaddr) {
        baseTypeData().setElementValue(1, Formofaddr);
    }

    
    public java.lang.String getName_4() {
        return (java.lang.String)baseTypeData().getElementValueAsString(5);
    }

    
    public java.lang.String getCity() {
        return (java.lang.String)baseTypeData().getElementValueAsString(7);
    }

    
    public void setPo_Box_Cit(java.lang.String Po_Box_Cit) {
        baseTypeData().setElementValue(14, Po_Box_Cit);
    }

    
    public java.lang.String getTitle() {
        return (java.lang.String)baseTypeData().getElementValueAsString(47);
    }

    
    public java.lang.String getBuild_Long() {
        return (java.lang.String)baseTypeData().getElementValueAsString(50);
    }

    
    public java.lang.String getHomecityno() {
        return (java.lang.String)baseTypeData().getElementValueAsString(53);
    }

    
    public java.lang.String getComm_Type() {
        return (java.lang.String)baseTypeData().getElementValueAsString(34);
    }

    
    public java.lang.String getDeliv_Dis() {
        return (java.lang.String)baseTypeData().getElementValueAsString(15);
    }

    
    public void setDont_Use_S(java.lang.String Dont_Use_S) {
        baseTypeData().setElementValue(62, Dont_Use_S);
    }

    
    public void setStr_Suppl2(java.lang.String Str_Suppl2) {
        baseTypeData().setElementValue(21, Str_Suppl2);
    }

    
    public java.lang.String getName_3() {
        return (java.lang.String)baseTypeData().getElementValueAsString(4);
    }

    
    public java.lang.String getName() {
        return (java.lang.String)baseTypeData().getElementValueAsString(2);
    }

    
    public void setLangu_Iso(java.lang.String Langu_Iso) {
        baseTypeData().setElementValue(49, Langu_Iso);
    }

    
    public void setHouse_No2(java.lang.String House_No2) {
        baseTypeData().setElementValue(44, House_No2);
    }

    
    public java.lang.String getDistrct_No() {
        return (java.lang.String)baseTypeData().getElementValueAsString(40);
    }

    
    public void setHouse_No3(java.lang.String House_No3) {
        baseTypeData().setElementValue(64, House_No3);
    }

    
    public void setPostl_Cod3(java.lang.String Postl_Cod3) {
        baseTypeData().setElementValue(12, Postl_Cod3);
    }

    
    public void setHome_City(java.lang.String Home_City) {
        baseTypeData().setElementValue(52, Home_City);
    }

    
    public void setRoom_No(java.lang.String Room_No) {
        baseTypeData().setElementValue(25, Room_No);
    }

    
    public java.lang.String getName_2() {
        return (java.lang.String)baseTypeData().getElementValueAsString(3);
    }

    
    public java.lang.String getPo_Ctryiso() {
        return (java.lang.String)baseTypeData().getElementValueAsString(60);
    }

    
    public void setAdr_Notes(java.lang.String Adr_Notes) {
        baseTypeData().setElementValue(33, Adr_Notes);
    }

    
    public java.lang.String getTranspzone() {
        return (java.lang.String)baseTypeData().getElementValueAsString(43);
    }

    
    public void setSort1(java.lang.String Sort1) {
        baseTypeData().setElementValue(29, Sort1);
    }

    
    public void setPo_Box_Reg(java.lang.String Po_Box_Reg) {
        baseTypeData().setElementValue(58, Po_Box_Reg);
    }

    
    public java.lang.String getLangu() {
        return (java.lang.String)baseTypeData().getElementValueAsString(27);
    }

    
    public java.lang.String getLangu_Iso() {
        return (java.lang.String)baseTypeData().getElementValueAsString(49);
    }

    
    public java.lang.String getFax_Extens() {
        return (java.lang.String)baseTypeData().getElementValueAsString(38);
    }

    
    public java.lang.String getBuilding() {
        return (java.lang.String)baseTypeData().getElementValueAsString(23);
    }

    
    public java.lang.String getAddr_No() {
        return (java.lang.String)baseTypeData().getElementValueAsString(0);
    }

    
    public void setPo_Box(java.lang.String Po_Box) {
        baseTypeData().setElementValue(13, Po_Box);
    }

    
    public void setStr_Abbr(java.lang.String Str_Abbr) {
        baseTypeData().setElementValue(18, Str_Abbr);
    }

    
    public java.lang.String getStreet_No() {
        return (java.lang.String)baseTypeData().getElementValueAsString(17);
    }

    
    public java.lang.String getTaxjurcode() {
        return (java.lang.String)baseTypeData().getElementValueAsString(32);
    }

    
    public MetaData metadata() {
        return metadata;
    }

    
    public void setRegiogroup(java.lang.String Regiogroup) {
        baseTypeData().setElementValue(51, Regiogroup);
    }

    
    public java.lang.String getStreet_Lng() {
        return (java.lang.String)baseTypeData().getElementValueAsString(39);
    }

    
    public void setPostl_Cod1(java.lang.String Postl_Cod1) {
        baseTypeData().setElementValue(10, Postl_Cod1);
    }

    
    public java.lang.String getTel1_Ext() {
        return (java.lang.String)baseTypeData().getElementValueAsString(36);
    }

    
    public java.lang.String getHome_City() {
        return (java.lang.String)baseTypeData().getElementValueAsString(52);
    }

    
    public void setStreet(java.lang.String Street) {
        baseTypeData().setElementValue(16, Street);
    }

    
    public void setTaxjurcode(java.lang.String Taxjurcode) {
        baseTypeData().setElementValue(32, Taxjurcode);
    }

    
    public void setC_O_Name(java.lang.String C_O_Name) {
        baseTypeData().setElementValue(6, C_O_Name);
    }

    
    public void setLocation(java.lang.String Location) {
        baseTypeData().setElementValue(22, Location);
    }

    
    public java.lang.String getPo_Box_Reg() {
        return (java.lang.String)baseTypeData().getElementValueAsString(58);
    }

    
    public java.lang.String getPo_Box_Cit() {
        return (java.lang.String)baseTypeData().getElementValueAsString(14);
    }

    
    public void setPcode1_Ext(java.lang.String Pcode1_Ext) {
        baseTypeData().setElementValue(54, Pcode1_Ext);
    }

    
    public java.lang.String getFormofaddr() {
        return (java.lang.String)baseTypeData().getElementValueAsString(1);
    }

    
    public void setChckstatus(java.lang.String Chckstatus) {
        baseTypeData().setElementValue(41, Chckstatus);
    }

    
    public void setName_3(java.lang.String Name_3) {
        baseTypeData().setElementValue(4, Name_3);
    }

    
    public void setPobox_Ctry(java.lang.String Pobox_Ctry) {
        baseTypeData().setElementValue(59, Pobox_Ctry);
    }

    
    public java.lang.String getAdr_Notes() {
        return (java.lang.String)baseTypeData().getElementValueAsString(33);
    }

    
    public java.lang.String getTime_Zone() {
        return (java.lang.String)baseTypeData().getElementValueAsString(31);
    }

    
    public void setAddr_No(java.lang.String Addr_No) {
        baseTypeData().setElementValue(0, Addr_No);
    }

    
    public void setCity_No(java.lang.String City_No) {
        baseTypeData().setElementValue(9, City_No);
    }

    
    public void setBuilding(java.lang.String Building) {
        baseTypeData().setElementValue(23, Building);
    }

    
    public void setStr_Suppl3(java.lang.String Str_Suppl3) {
        baseTypeData().setElementValue(46, Str_Suppl3);
    }

    
    public void setPcode2_Ext(java.lang.String Pcode2_Ext) {
        baseTypeData().setElementValue(55, Pcode2_Ext);
    }

    
    public void setHomepage(java.lang.String Homepage) {
        baseTypeData().setElementValue(61, Homepage);
    }

    
    public void setLangucriso(java.lang.String Langucriso) {
        baseTypeData().setElementValue(66, Langucriso);
    }

    
    public java.lang.String getDont_Use_S() {
        return (java.lang.String)baseTypeData().getElementValueAsString(62);
    }

    
    public java.lang.String getFloor() {
        return (java.lang.String)baseTypeData().getElementValueAsString(24);
    }

    
    public java.lang.String getLangucriso() {
        return (java.lang.String)baseTypeData().getElementValueAsString(66);
    }

    
    public java.lang.String getPo_Box() {
        return (java.lang.String)baseTypeData().getElementValueAsString(13);
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  Bapiaddr1Type parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Bapiaddr1Type parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPostl_Cod1() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(10);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getE_Mail() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(45);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getChckstatus() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(41);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCountryiso() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(48);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTitle() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(47);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getBuild_Long() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(50);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPcode1_Ext() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(54);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getHomecityno() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(53);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDistrict() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(8);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getComm_Type() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(34);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDeliv_Dis() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(15);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCountry() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(26);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRegion() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(28);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getName_3() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(4);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getC_O_Name() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(6);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getName() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSort2() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(30);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getHouse_No3() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(64);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getHomepage() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(61);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getHouse_No() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(19);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDistrct_No() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(40);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRoom_No() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(25);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPostl_Cod2() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(11);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getName_2() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPo_Ctryiso() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(60);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPcode3_Ext() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(56);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getStr_Suppl3() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(46);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTranspzone() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(43);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getHouse_No2() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(44);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getLangu() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(27);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getLangu_Iso() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(49);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getFax_Extens() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(38);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getBuilding() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(23);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getAddr_No() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getStreet_No() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(17);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPostl_Cod3() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(12);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTaxjurcode() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(32);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDont_Use_P() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(63);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getFax_Number() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(37);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getStreet_Lng() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(39);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getStr_Suppl2() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(21);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTel1_Ext() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(36);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPcode2_Ext() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(55);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getStr_Abbr() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(18);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPo_W_O_No() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(57);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getHome_City() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(52);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getLocation() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(22);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTel1_Numbr() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(35);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getLangu_Cr() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(65);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPo_Box_Reg() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(58);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPo_Box_Cit() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(14);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPobox_Ctry() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(59);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRegiogroup() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(51);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getFormofaddr() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCity_No() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(9);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getAdr_Notes() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(33);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTime_Zone() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(31);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getStr_Suppl1() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(20);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSort1() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(29);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPboxcit_No() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(42);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getStreet() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(16);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDont_Use_S() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(62);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getFloor() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(24);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getLangucriso() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(66);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPo_Box() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(13);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getName_4() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(5);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCity() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(7);
        }
    
    }

}
