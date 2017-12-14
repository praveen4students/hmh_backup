package hmh.sap.rfc;


public class Bapi_Mvke_GaType extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1335984408569L) ;

    private  Bapi_Mvke_GaType.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.XSDL_COMPLEX_TYPE, "urn:sap-com:document:sap:rfc:functions", "BAPI_MVKE_GA", 44, 0, hmh.sap.rfc.Bapi_Mvke_GaType.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "BAPI_MVKE_GA", 227, 426, -1, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"BAPI_MVKE_GA\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Sales Data</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>227</ifr:internalLength1><ifr:internalLength2>426</ifr:internalLength2></ifr:definition></ifr:container></s0:type>");
        descriptorSetElementProperties(descriptor, 0, "SALES_ORG", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Sales_Org", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "SALES_ORG", 0, 0, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SALES_ORG\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Sales Organization</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>0</ifr:offset1><ifr:offset2>0</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VKORG\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 1, "DISTR_CHAN", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Distr_Chan", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "DISTR_CHAN", 4, 8, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DISTR_CHAN\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Distribution Channel</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>4</ifr:offset1><ifr:offset2>8</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VTWEG\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 2, "DEL_FLAG", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Del_Flag", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "DEL_FLAG", 6, 12, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DEL_FLAG\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Ind.: Flag material for deletion at distribution chain level</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>6</ifr:offset1><ifr:offset2>12</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"LVOVK\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 3, "MATL_STATS", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Matl_Stats", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "MATL_STATS", 7, 14, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MATL_STATS\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Material statistics group</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>7</ifr:offset1><ifr:offset2>14</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"STGMA\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 4, "REBATE_GRP", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Rebate_Grp", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "REBATE_GRP", 8, 16, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REBATE_GRP\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Volume rebate group</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>8</ifr:offset1><ifr:offset2>16</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BONUS\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 5, "COMM_GROUP", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Comm_Group", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "COMM_GROUP", 10, 20, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"COMM_GROUP\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Commission group</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>10</ifr:offset1><ifr:offset2>20</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PROVG\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 6, "CASH_DISC", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cash_Disc", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "CASH_DISC", 12, 24, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CASH_DISC\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Cash discount indicator</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>12</ifr:offset1><ifr:offset2>24</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"SKTOF\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 7, "SAL_STATUS", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Sal_Status", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "SAL_STATUS", 13, 26, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SAL_STATUS\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Distribution-chain-specific material status</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>13</ifr:offset1><ifr:offset2>26</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VMSTA\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 8, "VALID_FROM", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Valid_From", java.sql.Date.class, null, new java.lang.String[][]{}, "VALID_FROM", 15, 30, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"VALID_FROM\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Date from which distr.-chain-spec. material status is valid</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>15</ifr:offset1><ifr:offset2>30</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VMSTD\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 9, "MIN_ORDER", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Min_Order", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "13"}, {"fractionDigits", "3"}}, "MIN_ORDER", 23, 46, -1, 7, 7, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MIN_ORDER\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Minimum order quantity in base unit of measure</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:referenceField>MEINS</ifr:referenceField><ifr:referenceTable>MARA</ifr:referenceTable><ifr:offset1>23</ifr:offset1><ifr:offset2>46</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MINAU\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>QUAN</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>13</ifr:length><ifr:internalLength1>7</ifr:internalLength1><ifr:internalLength2>7</ifr:internalLength2><ifr:decimals>3</ifr:decimals><ifr:outputLength>17</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 10, "MIN_DELY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Min_Dely", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "13"}, {"fractionDigits", "3"}}, "MIN_DELY", 30, 53, -1, 7, 7, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MIN_DELY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Minimum delivery quantity in delivery note processing</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:referenceField>MEINS</ifr:referenceField><ifr:referenceTable>MARA</ifr:referenceTable><ifr:offset1>30</ifr:offset1><ifr:offset2>53</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MINLF\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>QUAN</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>13</ifr:length><ifr:internalLength1>7</ifr:internalLength1><ifr:internalLength2>7</ifr:internalLength2><ifr:decimals>3</ifr:decimals><ifr:outputLength>17</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 11, "MIN_MTO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Min_Mto", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "13"}, {"fractionDigits", "3"}}, "MIN_MTO", 37, 60, -1, 7, 7, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MIN_MTO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Minimum make-to-order quantity</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:referenceField>MEINS</ifr:referenceField><ifr:referenceTable>MARA</ifr:referenceTable><ifr:offset1>37</ifr:offset1><ifr:offset2>60</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MINEF\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>QUAN</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>13</ifr:length><ifr:internalLength1>7</ifr:internalLength1><ifr:internalLength2>7</ifr:internalLength2><ifr:decimals>3</ifr:decimals><ifr:outputLength>17</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 12, "DELY_UNIT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Dely_Unit", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "13"}, {"fractionDigits", "3"}}, "DELY_UNIT", 44, 67, -1, 7, 7, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DELY_UNIT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Delivery unit</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:referenceField>MEINS</ifr:referenceField><ifr:referenceTable>MARA</ifr:referenceTable><ifr:offset1>44</ifr:offset1><ifr:offset2>67</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"SCHRT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>QUAN</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>13</ifr:length><ifr:internalLength1>7</ifr:internalLength1><ifr:internalLength2>7</ifr:internalLength2><ifr:decimals>3</ifr:decimals><ifr:outputLength>17</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 13, "DELY_UOM", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Dely_Uom", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "DELY_UOM", 51, 74, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DELY_UOM\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Unit of measure of delivery unit</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>51</ifr:offset1><ifr:offset2>74</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"SCHME\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>UNIT</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength><ifr:conversionExit>CUNIT</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 14, "DELY_UOM_ISO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Dely_Uom_Iso", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "DELY_UOM_ISO", 54, 80, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DELY_UOM_ISO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Unit of measure for delivery unit in ISO code</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>54</ifr:offset1><ifr:offset2>80</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"SCHME_ISO\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 15, "SALES_UNIT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Sales_Unit", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "SALES_UNIT", 57, 86, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SALES_UNIT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Sales unit</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>57</ifr:offset1><ifr:offset2>86</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VRKME\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>UNIT</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength><ifr:conversionExit>CUNIT</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 16, "SALES_UNIT_ISO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Sales_Unit_Iso", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "SALES_UNIT_ISO", 60, 92, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SALES_UNIT_ISO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Sales unit in ISO code</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>60</ifr:offset1><ifr:offset2>92</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VRKME_ISO\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 17, "ITEM_CAT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Item_Cat", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "ITEM_CAT", 63, 98, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ITEM_CAT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Item category group from material master</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>63</ifr:offset1><ifr:offset2>98</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MTPOS\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 18, "DELYG_PLNT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Delyg_Plnt", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "DELYG_PLNT", 67, 106, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DELYG_PLNT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Delivering Plant</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>67</ifr:offset1><ifr:offset2>106</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"DWERK\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 19, "PROD_HIER", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Prod_Hier", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "18"}}, "PROD_HIER", 71, 114, -1, 18, 36, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PROD_HIER\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Product hierarchy</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>71</ifr:offset1><ifr:offset2>114</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PRODH_D\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>18</ifr:length><ifr:internalLength1>18</ifr:internalLength1><ifr:internalLength2>36</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>18</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 20, "PR_REF_MAT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Pr_Ref_Mat", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "18"}}, "PR_REF_MAT", 89, 150, -1, 18, 36, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PR_REF_MAT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Pricing reference material</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>89</ifr:offset1><ifr:offset2>150</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PMATN\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>18</ifr:length><ifr:internalLength1>18</ifr:internalLength1><ifr:internalLength2>36</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>18</ifr:outputLength><ifr:conversionExit>MATN1</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 21, "MAT_PR_GRP", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Mat_Pr_Grp", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "MAT_PR_GRP", 107, 186, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MAT_PR_GRP\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Material Pricing Group</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>107</ifr:offset1><ifr:offset2>186</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KONDM\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 22, "ACCT_ASSGT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Acct_Assgt", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "ACCT_ASSGT", 109, 190, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ACCT_ASSGT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Account assignment group for this material</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>109</ifr:offset1><ifr:offset2>190</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KTGRM\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 23, "MATL_GRP_1", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Matl_Grp_1", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "MATL_GRP_1", 111, 194, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MATL_GRP_1\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Returns Disposition</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>111</ifr:offset1><ifr:offset2>194</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MVGR1\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 24, "MATL_GRP_2", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Matl_Grp_2", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "MATL_GRP_2", 114, 200, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MATL_GRP_2\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Carton Rounding</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>114</ifr:offset1><ifr:offset2>200</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MVGR2\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 25, "MATL_GRP_3", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Matl_Grp_3", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "MATL_GRP_3", 117, 206, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MATL_GRP_3\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Material Status</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>117</ifr:offset1><ifr:offset2>206</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MVGR3\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 26, "MATL_GRP_4", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Matl_Grp_4", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "MATL_GRP_4", 120, 212, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MATL_GRP_4\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">E Goods Indicator</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>120</ifr:offset1><ifr:offset2>212</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MVGR4\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 27, "MATL_GRP_5", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Matl_Grp_5", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "MATL_GRP_5", 123, 218, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MATL_GRP_5\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Royalty Relevance</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>123</ifr:offset1><ifr:offset2>218</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MVGR5\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 28, "PROD_ATT_1", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Prod_Att_1", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PROD_ATT_1", 126, 224, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PROD_ATT_1\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Contract sales only = OS</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>126</ifr:offset1><ifr:offset2>224</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PRAT1\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 29, "PROD_ATT_2", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Prod_Att_2", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PROD_ATT_2", 127, 226, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PROD_ATT_2\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Print Subscription</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>127</ifr:offset1><ifr:offset2>226</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PRAT2\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 30, "PROD_ATT_3", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Prod_Att_3", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PROD_ATT_3", 128, 228, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PROD_ATT_3\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Blocked</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>128</ifr:offset1><ifr:offset2>228</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PRAT3\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 31, "PROD_ATT_4", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Prod_Att_4", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PROD_ATT_4", 129, 230, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PROD_ATT_4\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Exclude Coupon Code</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>129</ifr:offset1><ifr:offset2>230</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PRAT4\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 32, "PROD_ATT_5", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Prod_Att_5", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PROD_ATT_5", 130, 232, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PROD_ATT_5\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">ID for product attribute 5</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>130</ifr:offset1><ifr:offset2>232</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PRAT5\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 33, "PROD_ATT_6", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Prod_Att_6", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PROD_ATT_6", 131, 234, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PROD_ATT_6\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">ID for product attribute 6</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>131</ifr:offset1><ifr:offset2>234</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PRAT6\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 34, "PROD_ATT_7", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Prod_Att_7", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PROD_ATT_7", 132, 236, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PROD_ATT_7\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">ID for product attribute 7</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>132</ifr:offset1><ifr:offset2>236</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PRAT7\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 35, "PROD_ATT_8", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Prod_Att_8", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PROD_ATT_8", 133, 238, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PROD_ATT_8\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">ID for product attribute 8</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>133</ifr:offset1><ifr:offset2>238</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PRAT8\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 36, "PROD_ATT_9", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Prod_Att_9", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PROD_ATT_9", 134, 240, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PROD_ATT_9\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">ID for product attribute 9</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>134</ifr:offset1><ifr:offset2>240</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PRAT9\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 37, "PROD_ATT10", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Prod_Att10", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PROD_ATT10", 135, 242, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PROD_ATT10\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">ID for product attribute 10</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>135</ifr:offset1><ifr:offset2>242</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PRATA\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 38, "ROUND_PROF", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Round_Prof", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "ROUND_PROF", 136, 244, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ROUND_PROF\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Rounding profile</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>136</ifr:offset1><ifr:offset2>244</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"RDPRF\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 39, "VAR_SALES_UN", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Var_Sales_Un", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "VAR_SALES_UN", 140, 252, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"VAR_SALES_UN\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Variable Sales Unit Not Allowed</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>140</ifr:offset1><ifr:offset2>252</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VAVME\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 40, "UNIT_GROUP", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Unit_Group", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "UNIT_GROUP", 141, 254, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"UNIT_GROUP\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Unit of measure group</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>141</ifr:offset1><ifr:offset2>254</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MEGRU\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 41, "PR_REF_MAT_EXTERNAL", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Pr_Ref_Mat_External", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "40"}}, "PR_REF_MAT_EXTERNAL", 145, 262, -1, 40, 80, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PR_REF_MAT_EXTERNAL\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Long material number (future development) for PR_RE field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>145</ifr:offset1><ifr:offset2>262</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MGV_PR_REF_MAT_EXTERNAL\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>40</ifr:length><ifr:internalLength1>40</ifr:internalLength1><ifr:internalLength2>80</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>40</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 42, "PR_REF_MAT_GUID", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Pr_Ref_Mat_Guid", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "32"}}, "PR_REF_MAT_GUID", 185, 342, -1, 32, 64, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PR_REF_MAT_GUID\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">External GUID (future development) for PR_REF_MAT field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>185</ifr:offset1><ifr:offset2>342</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MGV_PR_REF_MAT_GUID\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>32</ifr:length><ifr:internalLength1>32</ifr:internalLength1><ifr:internalLength2>64</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>32</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 43, "PR_REF_MAT_VERSION", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Pr_Ref_Mat_Version", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "PR_REF_MAT_VERSION", 217, 406, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PR_REF_MAT_VERSION\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Version number (future development) for PR_REF_MAT field</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>217</ifr:offset1><ifr:offset2>406</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MGV_PR_REF_MAT_VERSION\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        staticDescriptor = descriptor;
    }
    public  Bapi_Mvke_GaType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    protected  Bapi_Mvke_GaType (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    
    public java.lang.String getProd_Att_6() {
        return (java.lang.String)baseTypeData().getElementValueAsString(33);
    }

    
    public java.lang.String getProd_Att_2() {
        return (java.lang.String)baseTypeData().getElementValueAsString(29);
    }

    
    public java.lang.String getPr_Ref_Mat_Version() {
        return (java.lang.String)baseTypeData().getElementValueAsString(43);
    }

    
    public void setProd_Att_7(java.lang.String Prod_Att_7) {
        baseTypeData().setElementValue(34, Prod_Att_7);
    }

    
    public void setRebate_Grp(java.lang.String Rebate_Grp) {
        baseTypeData().setElementValue(4, Rebate_Grp);
    }

    
    public void setPr_Ref_Mat_External(java.lang.String Pr_Ref_Mat_External) {
        baseTypeData().setElementValue(41, Pr_Ref_Mat_External);
    }

    
    public void setMin_Dely(java.math.BigDecimal Min_Dely) {
        baseTypeData().setElementValue(10, Min_Dely);
    }

    
    public java.lang.String getItem_Cat() {
        return (java.lang.String)baseTypeData().getElementValueAsString(17);
    }

    
    public java.lang.String getSal_Status() {
        return (java.lang.String)baseTypeData().getElementValueAsString(7);
    }

    
    public void setSales_Org(java.lang.String Sales_Org) {
        baseTypeData().setElementValue(0, Sales_Org);
    }

    
    public java.lang.String getVar_Sales_Un() {
        return (java.lang.String)baseTypeData().getElementValueAsString(39);
    }

    
    public java.lang.String getProd_Att_9() {
        return (java.lang.String)baseTypeData().getElementValueAsString(36);
    }

    
    public void setVar_Sales_Un(java.lang.String Var_Sales_Un) {
        baseTypeData().setElementValue(39, Var_Sales_Un);
    }

    
    public void setDelyg_Plnt(java.lang.String Delyg_Plnt) {
        baseTypeData().setElementValue(18, Delyg_Plnt);
    }

    
    public void setPr_Ref_Mat(java.lang.String Pr_Ref_Mat) {
        baseTypeData().setElementValue(20, Pr_Ref_Mat);
    }

    
    public void setUnit_Group(java.lang.String Unit_Group) {
        baseTypeData().setElementValue(40, Unit_Group);
    }

    
    public java.lang.String getMatl_Grp_5() {
        return (java.lang.String)baseTypeData().getElementValueAsString(27);
    }

    
    public void setProd_Att_9(java.lang.String Prod_Att_9) {
        baseTypeData().setElementValue(36, Prod_Att_9);
    }

    
    public void setProd_Att_6(java.lang.String Prod_Att_6) {
        baseTypeData().setElementValue(33, Prod_Att_6);
    }

    
    public java.math.BigDecimal getDely_Unit() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(12);
    }

    
    public java.lang.String getProd_Att_5() {
        return (java.lang.String)baseTypeData().getElementValueAsString(32);
    }

    
    public void setPr_Ref_Mat_Guid(java.lang.String Pr_Ref_Mat_Guid) {
        baseTypeData().setElementValue(42, Pr_Ref_Mat_Guid);
    }

    
    public void setMatl_Grp_4(java.lang.String Matl_Grp_4) {
        baseTypeData().setElementValue(26, Matl_Grp_4);
    }

    
    public void setDely_Uom(java.lang.String Dely_Uom) {
        baseTypeData().setElementValue(13, Dely_Uom);
    }

    
    public java.sql.Date getValid_From() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(8);
    }

    
    public java.lang.String getProd_Att_1() {
        return (java.lang.String)baseTypeData().getElementValueAsString(28);
    }

    
    public void setMin_Mto(java.math.BigDecimal Min_Mto) {
        baseTypeData().setElementValue(11, Min_Mto);
    }

    
    public java.math.BigDecimal getMin_Dely() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(10);
    }

    
    public java.lang.String getDely_Uom() {
        return (java.lang.String)baseTypeData().getElementValueAsString(13);
    }

    
    public java.lang.String getDely_Uom_Iso() {
        return (java.lang.String)baseTypeData().getElementValueAsString(14);
    }

    
    public void setMatl_Grp_2(java.lang.String Matl_Grp_2) {
        baseTypeData().setElementValue(24, Matl_Grp_2);
    }

    
    public void setProd_Att_3(java.lang.String Prod_Att_3) {
        baseTypeData().setElementValue(30, Prod_Att_3);
    }

    
    public void setAcct_Assgt(java.lang.String Acct_Assgt) {
        baseTypeData().setElementValue(22, Acct_Assgt);
    }

    
    public void setProd_Att_5(java.lang.String Prod_Att_5) {
        baseTypeData().setElementValue(32, Prod_Att_5);
    }

    
    public void setItem_Cat(java.lang.String Item_Cat) {
        baseTypeData().setElementValue(17, Item_Cat);
    }

    
    public java.lang.String getMat_Pr_Grp() {
        return (java.lang.String)baseTypeData().getElementValueAsString(21);
    }

    
    public void setProd_Att10(java.lang.String Prod_Att10) {
        baseTypeData().setElementValue(37, Prod_Att10);
    }

    
    public java.lang.String getMatl_Grp_4() {
        return (java.lang.String)baseTypeData().getElementValueAsString(26);
    }

    
    public void setDel_Flag(java.lang.String Del_Flag) {
        baseTypeData().setElementValue(2, Del_Flag);
    }

    
    public void setSales_Unit_Iso(java.lang.String Sales_Unit_Iso) {
        baseTypeData().setElementValue(16, Sales_Unit_Iso);
    }

    
    public void setMatl_Grp_1(java.lang.String Matl_Grp_1) {
        baseTypeData().setElementValue(23, Matl_Grp_1);
    }

    
    public java.lang.String getMatl_Stats() {
        return (java.lang.String)baseTypeData().getElementValueAsString(3);
    }

    
    public java.lang.String getProd_Att_4() {
        return (java.lang.String)baseTypeData().getElementValueAsString(31);
    }

    
    public java.lang.String getPr_Ref_Mat() {
        return (java.lang.String)baseTypeData().getElementValueAsString(20);
    }

    
    public java.lang.String getDel_Flag() {
        return (java.lang.String)baseTypeData().getElementValueAsString(2);
    }

    
    public java.lang.String getProd_Att10() {
        return (java.lang.String)baseTypeData().getElementValueAsString(37);
    }

    
    public void setMatl_Grp_3(java.lang.String Matl_Grp_3) {
        baseTypeData().setElementValue(25, Matl_Grp_3);
    }

    
    public void setCash_Disc(java.lang.String Cash_Disc) {
        baseTypeData().setElementValue(6, Cash_Disc);
    }

    
    public void setProd_Hier(java.lang.String Prod_Hier) {
        baseTypeData().setElementValue(19, Prod_Hier);
    }

    
    public MetaData metadata() {
        return metadata;
    }

    
    public void setRound_Prof(java.lang.String Round_Prof) {
        baseTypeData().setElementValue(38, Round_Prof);
    }

    
    public void setSales_Unit(java.lang.String Sales_Unit) {
        baseTypeData().setElementValue(15, Sales_Unit);
    }

    
    public java.lang.String getPr_Ref_Mat_External() {
        return (java.lang.String)baseTypeData().getElementValueAsString(41);
    }

    
    public java.lang.String getMatl_Grp_3() {
        return (java.lang.String)baseTypeData().getElementValueAsString(25);
    }

    
    public void setMin_Order(java.math.BigDecimal Min_Order) {
        baseTypeData().setElementValue(9, Min_Order);
    }

    
    public void setMatl_Grp_5(java.lang.String Matl_Grp_5) {
        baseTypeData().setElementValue(27, Matl_Grp_5);
    }

    
    public java.lang.String getUnit_Group() {
        return (java.lang.String)baseTypeData().getElementValueAsString(40);
    }

    
    public java.lang.String getComm_Group() {
        return (java.lang.String)baseTypeData().getElementValueAsString(5);
    }

    
    public void setProd_Att_8(java.lang.String Prod_Att_8) {
        baseTypeData().setElementValue(35, Prod_Att_8);
    }

    
    public void setValid_From(java.sql.Date Valid_From) {
        baseTypeData().setElementValue(8, Valid_From);
    }

    
    public void setMatl_Stats(java.lang.String Matl_Stats) {
        baseTypeData().setElementValue(3, Matl_Stats);
    }

    
    public void setDely_Unit(java.math.BigDecimal Dely_Unit) {
        baseTypeData().setElementValue(12, Dely_Unit);
    }

    
    public void setMat_Pr_Grp(java.lang.String Mat_Pr_Grp) {
        baseTypeData().setElementValue(21, Mat_Pr_Grp);
    }

    
    public void setProd_Att_4(java.lang.String Prod_Att_4) {
        baseTypeData().setElementValue(31, Prod_Att_4);
    }

    
    public java.lang.String getProd_Att_7() {
        return (java.lang.String)baseTypeData().getElementValueAsString(34);
    }

    
    public java.lang.String getDelyg_Plnt() {
        return (java.lang.String)baseTypeData().getElementValueAsString(18);
    }

    
    public java.lang.String getProd_Hier() {
        return (java.lang.String)baseTypeData().getElementValueAsString(19);
    }

    
    public void setDistr_Chan(java.lang.String Distr_Chan) {
        baseTypeData().setElementValue(1, Distr_Chan);
    }

    
    public java.lang.String getPr_Ref_Mat_Guid() {
        return (java.lang.String)baseTypeData().getElementValueAsString(42);
    }

    
    public java.lang.String getProd_Att_3() {
        return (java.lang.String)baseTypeData().getElementValueAsString(30);
    }

    
    public void setDely_Uom_Iso(java.lang.String Dely_Uom_Iso) {
        baseTypeData().setElementValue(14, Dely_Uom_Iso);
    }

    
    public void setProd_Att_1(java.lang.String Prod_Att_1) {
        baseTypeData().setElementValue(28, Prod_Att_1);
    }

    
    public void setPr_Ref_Mat_Version(java.lang.String Pr_Ref_Mat_Version) {
        baseTypeData().setElementValue(43, Pr_Ref_Mat_Version);
    }

    
    public java.lang.String getMatl_Grp_1() {
        return (java.lang.String)baseTypeData().getElementValueAsString(23);
    }

    
    public java.lang.String getCash_Disc() {
        return (java.lang.String)baseTypeData().getElementValueAsString(6);
    }

    
    public java.lang.String getMatl_Grp_2() {
        return (java.lang.String)baseTypeData().getElementValueAsString(24);
    }

    
    public java.math.BigDecimal getMin_Order() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(9);
    }

    
    public java.lang.String getSales_Unit() {
        return (java.lang.String)baseTypeData().getElementValueAsString(15);
    }

    
    public void setComm_Group(java.lang.String Comm_Group) {
        baseTypeData().setElementValue(5, Comm_Group);
    }

    
    public java.lang.String getAcct_Assgt() {
        return (java.lang.String)baseTypeData().getElementValueAsString(22);
    }

    
    public java.lang.String getRound_Prof() {
        return (java.lang.String)baseTypeData().getElementValueAsString(38);
    }

    
    public void setProd_Att_2(java.lang.String Prod_Att_2) {
        baseTypeData().setElementValue(29, Prod_Att_2);
    }

    
    public java.math.BigDecimal getMin_Mto() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(11);
    }

    
    public void setSal_Status(java.lang.String Sal_Status) {
        baseTypeData().setElementValue(7, Sal_Status);
    }

    
    public java.lang.String getDistr_Chan() {
        return (java.lang.String)baseTypeData().getElementValueAsString(1);
    }

    
    public java.lang.String getProd_Att_8() {
        return (java.lang.String)baseTypeData().getElementValueAsString(35);
    }

    
    public java.lang.String getRebate_Grp() {
        return (java.lang.String)baseTypeData().getElementValueAsString(4);
    }

    
    public java.lang.String getSales_Org() {
        return (java.lang.String)baseTypeData().getElementValueAsString(0);
    }

    
    public java.lang.String getSales_Unit_Iso() {
        return (java.lang.String)baseTypeData().getElementValueAsString(16);
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  Bapi_Mvke_GaType parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Bapi_Mvke_GaType parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getProd_Att_6() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(33);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getProd_Att_2() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(29);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPr_Ref_Mat_Version() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(43);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMatl_Stats() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getProd_Att_4() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(31);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPr_Ref_Mat() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(20);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDel_Flag() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getProd_Att10() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(37);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getItem_Cat() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(17);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSal_Status() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(7);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPr_Ref_Mat_External() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(41);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getVar_Sales_Un() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(39);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMatl_Grp_3() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(25);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getUnit_Group() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(40);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getComm_Group() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(5);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getProd_Att_9() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(36);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMatl_Grp_5() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(27);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getProd_Att_7() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(34);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDely_Unit() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(12);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDelyg_Plnt() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(18);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getProd_Hier() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(19);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getProd_Att_5() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(32);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPr_Ref_Mat_Guid() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(42);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getProd_Att_3() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(30);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getValid_From() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(8);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getProd_Att_1() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(28);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMin_Dely() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(10);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDely_Uom() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(13);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDely_Uom_Iso() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(14);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMatl_Grp_1() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(23);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMatl_Grp_2() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(24);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCash_Disc() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(6);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMin_Order() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(9);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSales_Unit() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(15);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getAcct_Assgt() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(22);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRound_Prof() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(38);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMin_Mto() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(11);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMat_Pr_Grp() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(21);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDistr_Chan() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getProd_Att_8() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(35);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRebate_Grp() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(4);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSales_Org() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMatl_Grp_4() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(26);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSales_Unit_Iso() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(16);
        }
    
    }

}
