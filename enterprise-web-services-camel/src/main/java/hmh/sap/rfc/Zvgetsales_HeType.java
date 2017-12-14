package hmh.sap.rfc;


public class Zvgetsales_HeType extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1355250403778L) ;

    private  Zvgetsales_HeType.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.XSDL_COMPLEX_TYPE, "urn:sap-com:document:sap:rfc:functions", "ZVGETSALES_HE", 13, 0, hmh.sap.rfc.Zvgetsales_HeType.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "ZVGETSALES_HE", 106, 178, -1, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"ZVGETSALES_HE\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Sales Document Header Output (Export Parameter From FM)</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>110</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>106</ifr:internalLength1><ifr:internalLength2>178</ifr:internalLength2></ifr:definition></ifr:container></s0:type>");
        descriptorSetElementProperties(descriptor, 0, "CLIENTTRANSACTIONID", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Clienttransactionid", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "CLIENTTRANSACTIONID", 0, 0, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CLIENTTRANSACTIONID\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Sales and Distribution Document Number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>0</ifr:offset1><ifr:offset2>0</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VBELN\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 1, "SALEDATE", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Saledate", java.sql.Date.class, null, new java.lang.String[][]{}, "SALEDATE", 10, 20, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SALEDATE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Document date (date received/sent)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>10</ifr:offset1><ifr:offset2>20</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AUDAT\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 2, "ORDERSUBTOTAL", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ordersubtotal", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "13"}, {"fractionDigits", "2"}}, "ORDERSUBTOTAL", 18, 36, -1, 7, 7, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ORDERSUBTOTAL\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Subtotal 1 from pricing procedure for condition</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:referenceField>WAERK</ifr:referenceField><ifr:referenceTable>VBAP</ifr:referenceTable><ifr:offset1>18</ifr:offset1><ifr:offset2>36</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KZWI1\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>true</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CURR</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>13</ifr:length><ifr:internalLength1>7</ifr:internalLength1><ifr:internalLength2>7</ifr:internalLength2><ifr:decimals>2</ifr:decimals><ifr:outputLength>18</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 3, "TAXAMOUNT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Taxamount", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "13"}, {"fractionDigits", "2"}}, "TAXAMOUNT", 25, 43, -1, 7, 7, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TAXAMOUNT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Tax amount in document currency</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:referenceField>WAERK</ifr:referenceField><ifr:referenceTable>VBAP</ifr:referenceTable><ifr:offset1>25</ifr:offset1><ifr:offset2>43</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MWSBP\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>true</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CURR</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>13</ifr:length><ifr:internalLength1>7</ifr:internalLength1><ifr:internalLength2>7</ifr:internalLength2><ifr:decimals>2</ifr:decimals><ifr:outputLength>18</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 4, "SHIPPINGAMOUNT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Shippingamount", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "13"}, {"fractionDigits", "2"}}, "SHIPPINGAMOUNT", 32, 50, -1, 7, 7, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SHIPPINGAMOUNT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Subtotal 3 from pricing procedure for condition</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:referenceField>WAERK</ifr:referenceField><ifr:referenceTable>VBAP</ifr:referenceTable><ifr:offset1>32</ifr:offset1><ifr:offset2>50</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KZWI3\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>true</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CURR</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>13</ifr:length><ifr:internalLength1>7</ifr:internalLength1><ifr:internalLength2>7</ifr:internalLength2><ifr:decimals>2</ifr:decimals><ifr:outputLength>18</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 5, "SALETOTAL", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Saletotal", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "15"}, {"fractionDigits", "2"}}, "SALETOTAL", 39, 57, -1, 8, 8, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SALETOTAL\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Net value in document currency</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:referenceField>WAERK</ifr:referenceField><ifr:referenceTable>VBAP</ifr:referenceTable><ifr:offset1>39</ifr:offset1><ifr:offset2>57</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"NETWR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>true</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CURR</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>15</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>2</ifr:decimals><ifr:outputLength>21</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 6, "DELIVEREDPRICINGCODE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Deliveredpricingcode", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "DELIVEREDPRICINGCODE", 47, 66, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DELIVEREDPRICINGCODE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Delivered/Non-delivered</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>47</ifr:offset1><ifr:offset2>66</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KDKG3\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 7, "CONFIR_QTY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Confir_Qty", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "13"}, {"fractionDigits", "3"}}, "CONFIR_QTY", 49, 70, -1, 7, 7, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CONFIR_QTY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Confirmed quantity</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:referenceField>SALES_UNIT</ifr:referenceField><ifr:referenceTable>BAPISDHEDU</ifr:referenceTable><ifr:offset1>49</ifr:offset1><ifr:offset2>70</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"BMENG\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>QUAN</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>13</ifr:length><ifr:internalLength1>7</ifr:internalLength1><ifr:internalLength2>7</ifr:internalLength2><ifr:decimals>3</ifr:decimals><ifr:outputLength>17</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 8, "CREDITCARD_PREAUTH", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Creditcard_Preauth", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "CREDITCARD_PREAUTH", 56, 78, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CREDITCARD_PREAUTH\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Payment cards: Preauthorization</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>56</ifr:offset1><ifr:offset2>78</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CCPRE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 9, "CREDITCARD_RESPONSE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Creditcard_Response", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "CREDITCARD_RESPONSE", 57, 80, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CREDITCARD_RESPONSE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Payment cards: Response to authorization checks</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>57</ifr:offset1><ifr:offset2>80</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"REACT_SD\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 10, "CREDITCARD_RESULT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Creditcard_Result", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "40"}}, "CREDITCARD_RESULT", 58, 82, -1, 40, 80, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CREDITCARD_RESULT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Payment cards: Result text</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>58</ifr:offset1><ifr:offset2>82</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"RTEXT_CC\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>40</ifr:length><ifr:internalLength1>40</ifr:internalLength1><ifr:internalLength2>80</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>40</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 11, "CREDITCARD_CVV_RESULT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Creditcard_Cvv_Result", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "CREDITCARD_CVV_RESULT", 98, 162, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CREDITCARD_CVV_RESULT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Result check of card verification value</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>98</ifr:offset1><ifr:offset2>162</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"RCCVV_CC\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 12, "CREDITCARD_ADD_RESULT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Creditcard_Add_Result", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "CREDITCARD_ADD_RESULT", 102, 170, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CREDITCARD_ADD_RESULT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Payment Cards: Result of Address Check (Address Result)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>102</ifr:offset1><ifr:offset2>170</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"RCAVR_CC\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        staticDescriptor = descriptor;
    }
    protected  Zvgetsales_HeType (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    public  Zvgetsales_HeType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public java.sql.Date getSaledate() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(1);
    }

    
    public java.math.BigDecimal getOrdersubtotal() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(2);
    }

    
    public java.lang.String getCreditcard_Cvv_Result() {
        return (java.lang.String)baseTypeData().getElementValueAsString(11);
    }

    
    public void setSaletotal(java.math.BigDecimal Saletotal) {
        baseTypeData().setElementValue(5, Saletotal);
    }

    
    public java.lang.String getDeliveredpricingcode() {
        return (java.lang.String)baseTypeData().getElementValueAsString(6);
    }

    
    public void setDeliveredpricingcode(java.lang.String Deliveredpricingcode) {
        baseTypeData().setElementValue(6, Deliveredpricingcode);
    }

    
    public MetaData metadata() {
        return metadata;
    }

    
    public java.math.BigDecimal getSaletotal() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(5);
    }

    
    public java.math.BigDecimal getShippingamount() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(4);
    }

    
    public void setShippingamount(java.math.BigDecimal Shippingamount) {
        baseTypeData().setElementValue(4, Shippingamount);
    }

    
    public void setCreditcard_Response(java.lang.String Creditcard_Response) {
        baseTypeData().setElementValue(9, Creditcard_Response);
    }

    
    public java.lang.String getCreditcard_Preauth() {
        return (java.lang.String)baseTypeData().getElementValueAsString(8);
    }

    
    public java.math.BigDecimal getTaxamount() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(3);
    }

    
    public java.lang.String getCreditcard_Result() {
        return (java.lang.String)baseTypeData().getElementValueAsString(10);
    }

    
    public java.math.BigDecimal getConfir_Qty() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(7);
    }

    
    public void setCreditcard_Add_Result(java.lang.String Creditcard_Add_Result) {
        baseTypeData().setElementValue(12, Creditcard_Add_Result);
    }

    
    public void setCreditcard_Result(java.lang.String Creditcard_Result) {
        baseTypeData().setElementValue(10, Creditcard_Result);
    }

    
    public java.lang.String getCreditcard_Add_Result() {
        return (java.lang.String)baseTypeData().getElementValueAsString(12);
    }

    
    public java.lang.String getCreditcard_Response() {
        return (java.lang.String)baseTypeData().getElementValueAsString(9);
    }

    
    public void setTaxamount(java.math.BigDecimal Taxamount) {
        baseTypeData().setElementValue(3, Taxamount);
    }

    
    public void setOrdersubtotal(java.math.BigDecimal Ordersubtotal) {
        baseTypeData().setElementValue(2, Ordersubtotal);
    }

    
    public void setSaledate(java.sql.Date Saledate) {
        baseTypeData().setElementValue(1, Saledate);
    }

    
    public void setConfir_Qty(java.math.BigDecimal Confir_Qty) {
        baseTypeData().setElementValue(7, Confir_Qty);
    }

    
    public void setClienttransactionid(java.lang.String Clienttransactionid) {
        baseTypeData().setElementValue(0, Clienttransactionid);
    }

    
    public void setCreditcard_Preauth(java.lang.String Creditcard_Preauth) {
        baseTypeData().setElementValue(8, Creditcard_Preauth);
    }

    
    public java.lang.String getClienttransactionid() {
        return (java.lang.String)baseTypeData().getElementValueAsString(0);
    }

    
    public void setCreditcard_Cvv_Result(java.lang.String Creditcard_Cvv_Result) {
        baseTypeData().setElementValue(11, Creditcard_Cvv_Result);
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  Zvgetsales_HeType parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Zvgetsales_HeType parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSaledate() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCreditcard_Result() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(10);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getOrdersubtotal() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getConfir_Qty() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(7);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCreditcard_Cvv_Result() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(11);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDeliveredpricingcode() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(6);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSaletotal() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(5);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCreditcard_Add_Result() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(12);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getShippingamount() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(4);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCreditcard_Response() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(9);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCreditcard_Preauth() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(8);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getClienttransactionid() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTaxamount() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
    }

}
