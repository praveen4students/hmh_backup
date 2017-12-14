package hmh.sap.rfc;


public class Zvgetsales_LeType extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1355250403772L) ;

    private  Zvgetsales_LeType.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.XSDL_COMPLEX_TYPE, "urn:sap-com:document:sap:rfc:functions", "ZVGETSALES_LE", 20, 0, hmh.sap.rfc.Zvgetsales_LeType.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "ZVGETSALES_LE", 181, 308, -1, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"ZVGETSALES_LE\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Sales Document Item Output (Export Parmeter To FM).</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>110</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>181</ifr:internalLength1><ifr:internalLength2>308</ifr:internalLength2></ifr:definition></ifr:container></s0:type>");
        descriptorSetElementProperties(descriptor, 0, "LINE_NO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Line_No", java.lang.String.class, null, new java.lang.String[][]{{"pattern", "\\d+"}, {"maxLength", "6"}}, "LINE_NO", 0, 0, -1, 6, 12, -1, com.sap.mw.jco.JCO.TYPE_NUM, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"LINE_NO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Sales Document Item</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>0</ifr:offset1><ifr:offset2>0</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"POSNR_VA\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>NUMC</ifr:type><ifr:abapType>N</ifr:abapType><ifr:length>6</ifr:length><ifr:internalLength1>6</ifr:internalLength1><ifr:internalLength2>12</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>6</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 1, "MATERIALID", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Materialid", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "18"}}, "MATERIALID", 6, 12, -1, 18, 36, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MATERIALID\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Material Number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>6</ifr:offset1><ifr:offset2>12</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MATNR\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>18</ifr:length><ifr:internalLength1>18</ifr:internalLength1><ifr:internalLength2>36</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>18</ifr:outputLength><ifr:conversionExit>MATN1</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 2, "QUANTITY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Quantity", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "15"}, {"fractionDigits", "3"}}, "QUANTITY", 24, 48, -1, 8, 8, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"QUANTITY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Cumulative order quantity in sales units</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:referenceField>VRKME</ifr:referenceField><ifr:referenceTable>VBAP</ifr:referenceTable><ifr:offset1>24</ifr:offset1><ifr:offset2>48</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KWMENG\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>QUAN</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>15</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>3</ifr:decimals><ifr:outputLength>19</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 3, "LISTPRICE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Listprice", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "13"}, {"fractionDigits", "2"}}, "LISTPRICE", 32, 56, -1, 7, 7, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"LISTPRICE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Subtotal 1 from pricing procedure for condition</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:referenceField>WAERK</ifr:referenceField><ifr:referenceTable>VBAP</ifr:referenceTable><ifr:offset1>32</ifr:offset1><ifr:offset2>56</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KZWI1\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>true</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CURR</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>13</ifr:length><ifr:internalLength1>7</ifr:internalLength1><ifr:internalLength2>7</ifr:internalLength2><ifr:decimals>2</ifr:decimals><ifr:outputLength>18</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 4, "NETPRICE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Netprice", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "13"}, {"fractionDigits", "2"}}, "NETPRICE", 39, 63, -1, 7, 7, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"NETPRICE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Subtotal 2 from pricing procedure for condition</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:referenceField>WAERK</ifr:referenceField><ifr:referenceTable>VBAP</ifr:referenceTable><ifr:offset1>39</ifr:offset1><ifr:offset2>63</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KZWI2\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>true</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CURR</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>13</ifr:length><ifr:internalLength1>7</ifr:internalLength1><ifr:internalLength2>7</ifr:internalLength2><ifr:decimals>2</ifr:decimals><ifr:outputLength>18</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 5, "DISCOUNTPERCENT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Discountpercent", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "11"}, {"fractionDigits", "2"}}, "DISCOUNTPERCENT", 46, 70, -1, 6, 6, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DISCOUNTPERCENT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Rate (condition amount or percentage)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:referenceField>KOEI1</ifr:referenceField><ifr:referenceTable>RV61A</ifr:referenceTable><ifr:offset1>46</ifr:offset1><ifr:offset2>70</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KBETR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>true</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CURR</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>11</ifr:length><ifr:internalLength1>6</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>2</ifr:decimals><ifr:outputLength>16</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 6, "SUBSTITUTED", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Substituted", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "SUBSTITUTED", 52, 76, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SUBSTITUTED\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Reason for material substitution</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>52</ifr:offset1><ifr:offset2>76</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"SUGRD\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 7, "DELIVERYDATE", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Deliverydate", java.sql.Date.class, null, new java.lang.String[][]{}, "DELIVERYDATE", 56, 84, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DELIVERYDATE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Schedule line date</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>56</ifr:offset1><ifr:offset2>84</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"EDATU\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 8, "CONFIR_QTY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Confir_Qty", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "13"}, {"fractionDigits", "3"}}, "CONFIR_QTY", 64, 100, -1, 7, 7, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CONFIR_QTY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Confirmed quantity</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:referenceField>SALES_UNIT</ifr:referenceField><ifr:referenceTable>BAPISDHEDU</ifr:referenceTable><ifr:offset1>64</ifr:offset1><ifr:offset2>100</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BMENG\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>QUAN</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>13</ifr:length><ifr:internalLength1>7</ifr:internalLength1><ifr:internalLength2>7</ifr:internalLength2><ifr:decimals>3</ifr:decimals><ifr:outputLength>17</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 9, "ZCOUPON_CODE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Zcoupon_Code", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "ZCOUPON_CODE", 71, 108, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ZCOUPON_CODE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Coupon Code</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>71</ifr:offset1><ifr:offset2>108</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ZCOUPON_CODE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 10, "CON_PRICE_IND", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Con_Price_Ind", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "CON_PRICE_IND", 81, 128, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CON_PRICE_IND\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Single-character flag</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>81</ifr:offset1><ifr:offset2>128</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CHAR1\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 11, "DELV_PRICE_IND", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Delv_Price_Ind", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "DELV_PRICE_IND", 82, 130, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DELV_PRICE_IND\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Delivered Price Indicator</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>82</ifr:offset1><ifr:offset2>130</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 12, "DISC_AMT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Disc_Amt", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "13"}, {"fractionDigits", "2"}}, "DISC_AMT", 83, 132, -1, 7, 7, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DISC_AMT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Condition value</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:referenceField>WAERK</ifr:referenceField><ifr:referenceTable>VBAP</ifr:referenceTable><ifr:offset1>83</ifr:offset1><ifr:offset2>132</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KWERT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>true</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CURR</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>13</ifr:length><ifr:internalLength1>7</ifr:internalLength1><ifr:internalLength2>7</ifr:internalLength2><ifr:decimals>2</ifr:decimals><ifr:outputLength>18</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 13, "PROMO_AMT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Promo_Amt", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "13"}, {"fractionDigits", "2"}}, "PROMO_AMT", 90, 139, -1, 7, 7, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PROMO_AMT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Condition value</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:referenceField>WAERK</ifr:referenceField><ifr:referenceTable>VBAP</ifr:referenceTable><ifr:offset1>90</ifr:offset1><ifr:offset2>139</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KWERT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>true</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CURR</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>13</ifr:length><ifr:internalLength1>7</ifr:internalLength1><ifr:internalLength2>7</ifr:internalLength2><ifr:decimals>2</ifr:decimals><ifr:outputLength>18</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 14, "FREE_INDICATOR", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Free_Indicator", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "FREE_INDICATOR", 97, 146, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"FREE_INDICATOR\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">General Flag</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>97</ifr:offset1><ifr:offset2>146</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"FLAG\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 15, "TIME_UNIT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Time_Unit", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "30"}}, "TIME_UNIT", 98, 148, -1, 30, 60, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TIME_UNIT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Characteristic Value</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>98</ifr:offset1><ifr:offset2>148</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ATWRT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>30</ifr:length><ifr:internalLength1>30</ifr:internalLength1><ifr:internalLength2>60</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>30</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 16, "TIME_DURATION", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Time_Duration", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "30"}}, "TIME_DURATION", 128, 208, -1, 30, 60, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TIME_DURATION\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Characteristic Value</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>128</ifr:offset1><ifr:offset2>208</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ATWRT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>30</ifr:length><ifr:internalLength1>30</ifr:internalLength1><ifr:internalLength2>60</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>30</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 17, "CONTRACT_START", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Contract_Start", java.sql.Date.class, null, new java.lang.String[][]{}, "CONTRACT_START", 158, 268, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CONTRACT_START\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Date</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>158</ifr:offset1><ifr:offset2>268</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"DATUM\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 18, "CONTRACT_END", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Contract_End", java.sql.Date.class, null, new java.lang.String[][]{}, "CONTRACT_END", 166, 284, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CONTRACT_END\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Date</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>166</ifr:offset1><ifr:offset2>284</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"DATUM\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 19, "SUBSCR_RATE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Subscr_Rate", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "13"}, {"fractionDigits", "2"}}, "SUBSCR_RATE", 174, 300, -1, 7, 7, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SUBSCR_RATE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Condition value</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:referenceField>WAERK</ifr:referenceField><ifr:referenceTable>VBAP</ifr:referenceTable><ifr:offset1>174</ifr:offset1><ifr:offset2>300</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KWERT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>true</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CURR</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>13</ifr:length><ifr:internalLength1>7</ifr:internalLength1><ifr:internalLength2>7</ifr:internalLength2><ifr:decimals>2</ifr:decimals><ifr:outputLength>18</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        staticDescriptor = descriptor;
    }
    public  Zvgetsales_LeType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    protected  Zvgetsales_LeType (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    
    public java.lang.String getLine_No() {
        return (java.lang.String)baseTypeData().getElementValueAsString(0);
    }

    
    public void setZcoupon_Code(java.lang.String Zcoupon_Code) {
        baseTypeData().setElementValue(9, Zcoupon_Code);
    }

    
    public void setPromo_Amt(java.math.BigDecimal Promo_Amt) {
        baseTypeData().setElementValue(13, Promo_Amt);
    }

    
    public void setFree_Indicator(java.lang.String Free_Indicator) {
        baseTypeData().setElementValue(14, Free_Indicator);
    }

    
    public java.lang.String getTime_Duration() {
        return (java.lang.String)baseTypeData().getElementValueAsString(16);
    }

    
    public void setNetprice(java.math.BigDecimal Netprice) {
        baseTypeData().setElementValue(4, Netprice);
    }

    
    public void setTime_Unit(java.lang.String Time_Unit) {
        baseTypeData().setElementValue(15, Time_Unit);
    }

    
    public void setDisc_Amt(java.math.BigDecimal Disc_Amt) {
        baseTypeData().setElementValue(12, Disc_Amt);
    }

    
    public MetaData metadata() {
        return metadata;
    }

    
    public void setLine_No(java.lang.String Line_No) {
        baseTypeData().setElementValue(0, Line_No);
    }

    
    public void setTime_Duration(java.lang.String Time_Duration) {
        baseTypeData().setElementValue(16, Time_Duration);
    }

    
    public java.math.BigDecimal getPromo_Amt() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(13);
    }

    
    public java.lang.String getDelv_Price_Ind() {
        return (java.lang.String)baseTypeData().getElementValueAsString(11);
    }

    
    public void setDeliverydate(java.sql.Date Deliverydate) {
        baseTypeData().setElementValue(7, Deliverydate);
    }

    
    public java.math.BigDecimal getQuantity() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(2);
    }

    
    public java.lang.String getMaterialid() {
        return (java.lang.String)baseTypeData().getElementValueAsString(1);
    }

    
    public java.math.BigDecimal getListprice() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(3);
    }

    
    public void setListprice(java.math.BigDecimal Listprice) {
        baseTypeData().setElementValue(3, Listprice);
    }

    
    public java.lang.String getZcoupon_Code() {
        return (java.lang.String)baseTypeData().getElementValueAsString(9);
    }

    
    public void setDelv_Price_Ind(java.lang.String Delv_Price_Ind) {
        baseTypeData().setElementValue(11, Delv_Price_Ind);
    }

    
    public java.lang.String getTime_Unit() {
        return (java.lang.String)baseTypeData().getElementValueAsString(15);
    }

    
    public java.sql.Date getDeliverydate() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(7);
    }

    
    public java.math.BigDecimal getConfir_Qty() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(8);
    }

    
    public java.sql.Date getContract_End() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(18);
    }

    
    public void setDiscountpercent(java.math.BigDecimal Discountpercent) {
        baseTypeData().setElementValue(5, Discountpercent);
    }

    
    public java.math.BigDecimal getDiscountpercent() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(5);
    }

    
    public java.math.BigDecimal getNetprice() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(4);
    }

    
    public void setQuantity(java.math.BigDecimal Quantity) {
        baseTypeData().setElementValue(2, Quantity);
    }

    
    public void setSubstituted(java.lang.String Substituted) {
        baseTypeData().setElementValue(6, Substituted);
    }

    
    public java.lang.String getFree_Indicator() {
        return (java.lang.String)baseTypeData().getElementValueAsString(14);
    }

    
    public void setMaterialid(java.lang.String Materialid) {
        baseTypeData().setElementValue(1, Materialid);
    }

    
    public java.sql.Date getContract_Start() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(17);
    }

    
    public java.lang.String getCon_Price_Ind() {
        return (java.lang.String)baseTypeData().getElementValueAsString(10);
    }

    
    public void setContract_End(java.sql.Date Contract_End) {
        baseTypeData().setElementValue(18, Contract_End);
    }

    
    public java.math.BigDecimal getDisc_Amt() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(12);
    }

    
    public void setConfir_Qty(java.math.BigDecimal Confir_Qty) {
        baseTypeData().setElementValue(8, Confir_Qty);
    }

    
    public void setContract_Start(java.sql.Date Contract_Start) {
        baseTypeData().setElementValue(17, Contract_Start);
    }

    
    public void setCon_Price_Ind(java.lang.String Con_Price_Ind) {
        baseTypeData().setElementValue(10, Con_Price_Ind);
    }

    
    public void setSubscr_Rate(java.math.BigDecimal Subscr_Rate) {
        baseTypeData().setElementValue(19, Subscr_Rate);
    }

    
    public java.lang.String getSubstituted() {
        return (java.lang.String)baseTypeData().getElementValueAsString(6);
    }

    
    public java.math.BigDecimal getSubscr_Rate() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(19);
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  Zvgetsales_LeType parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Zvgetsales_LeType parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getLine_No() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDeliverydate() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(7);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getConfir_Qty() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(8);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getContract_End() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(18);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDiscountpercent() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(5);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getNetprice() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(4);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTime_Duration() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(16);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getFree_Indicator() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(14);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getContract_Start() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(17);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPromo_Amt() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(13);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCon_Price_Ind() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(10);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDelv_Price_Ind() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(11);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMaterialid() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getQuantity() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDisc_Amt() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(12);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getListprice() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getZcoupon_Code() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(9);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSubstituted() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(6);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSubscr_Rate() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(19);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTime_Unit() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(15);
        }
    
    }

}
