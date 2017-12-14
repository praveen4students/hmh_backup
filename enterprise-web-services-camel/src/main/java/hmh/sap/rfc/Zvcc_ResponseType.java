package hmh.sap.rfc;


public class Zvcc_ResponseType extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1354127028480L) ;

    private  Zvcc_ResponseType.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.XSDL_COMPLEX_TYPE, "urn:sap-com:document:sap:rfc:functions", "ZVCC_RESPONSE", 15, 0, hmh.sap.rfc.Zvcc_ResponseType.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "ZVCC_RESPONSE", 99, 198, -1, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"ZVCC_RESPONSE\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Structure for Credit Card Reponse Codes</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>110</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>99</ifr:internalLength1><ifr:internalLength2>198</ifr:internalLength2></ifr:definition></ifr:container></s0:type>");
        descriptorSetElementProperties(descriptor, 0, "AUST1", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Aust1", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "AUST1", 0, 0, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"AUST1\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Payment cards: Status regarding requirements</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>0</ifr:offset1><ifr:offset2>0</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AUST1_CC\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 1, "AUST2", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Aust2", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "AUST2", 1, 2, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"AUST2\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Payment cards: Totals status - Call external system</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>1</ifr:offset1><ifr:offset2>2</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AUST2_CC\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 2, "AUST3", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Aust3", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "AUST3", 2, 4, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"AUST3\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Payment cards: Overall status - Responses from ext. system</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>2</ifr:offset1><ifr:offset2>4</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AUST3_CC\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 3, "RCCVV", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Rccvv", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "RCCVV", 3, 6, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"RCCVV\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Result check of card verification value</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>3</ifr:offset1><ifr:offset2>6</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"RCCVV_CC\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 4, "RTEXT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Rtext", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "40"}}, "RTEXT", 7, 14, -1, 40, 80, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"RTEXT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Payment cards: Result text</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>7</ifr:offset1><ifr:offset2>14</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"RTEXT_CC\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>40</ifr:length><ifr:internalLength1>40</ifr:internalLength1><ifr:internalLength2>80</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>40</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 5, "REACT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "React", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "REACT", 47, 94, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REACT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Payment cards: Response to authorization checks</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>47</ifr:offset1><ifr:offset2>94</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"REACT_SD\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 6, "CCPRE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ccpre", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "CCPRE", 48, 96, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CCPRE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Payment cards: Preauthorization</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>48</ifr:offset1><ifr:offset2>96</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CCPRE\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 7, "RCAVR", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Rcavr", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "RCAVR", 49, 98, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"RCAVR\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Payment Cards: Result of Address Check (Address Result)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>49</ifr:offset1><ifr:offset2>98</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"RCAVR_CC\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 8, "RCRSP", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Rcrsp", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "RCRSP", 53, 106, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"RCRSP\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Payment cards: Result of card check (response code)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>53</ifr:offset1><ifr:offset2>106</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"RCRSP_CC\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 9, "AUNUM", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Aunum", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "AUNUM", 57, 114, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"AUNUM\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Payment cards: Authorization number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>57</ifr:offset1><ifr:offset2>114</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AUNUM\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 10, "AUTRA", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Autra", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "15"}}, "AUTRA", 67, 134, -1, 15, 30, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"AUTRA\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Payment cards: Authoriz. reference code of clearing house</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>67</ifr:offset1><ifr:offset2>134</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AUTRA\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>15</ifr:length><ifr:internalLength1>15</ifr:internalLength1><ifr:internalLength2>30</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>15</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 11, "CCALL", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ccall", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "CCALL", 82, 164, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CCALL\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Payment cards: Status when external system is called?</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>82</ifr:offset1><ifr:offset2>164</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CCALL\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 12, "AUDAT", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Audat", java.sql.Date.class, null, new java.lang.String[][]{}, "AUDAT", 83, 166, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"AUDAT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Payment cards: Authorization date</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>83</ifr:offset1><ifr:offset2>166</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AUDAT_CC\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 13, "AUTIM", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:time", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Autim", java.sql.Time.class, null, new java.lang.String[][]{}, "AUTIM", 91, 182, -1, 6, 12, -1, com.sap.mw.jco.JCO.TYPE_TIME, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"AUTIM\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Payment cards: Authorization time</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>91</ifr:offset1><ifr:offset2>182</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AUTIM\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>TIMS</ifr:type><ifr:abapType>T</ifr:abapType><ifr:length>6</ifr:length><ifr:internalLength1>6</ifr:internalLength1><ifr:internalLength2>12</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>8</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 14, "CCTYP", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Cctyp", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "CCTYP", 97, 194, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CCTYP\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Payment cards: Card category</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>97</ifr:offset1><ifr:offset2>194</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CCTYP\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        staticDescriptor = descriptor;
    }
    protected  Zvcc_ResponseType (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    public  Zvcc_ResponseType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public java.lang.String getRcavr() {
        return (java.lang.String)baseTypeData().getElementValueAsString(7);
    }

    
    public java.lang.String getCcpre() {
        return (java.lang.String)baseTypeData().getElementValueAsString(6);
    }

    
    public java.lang.String getRtext() {
        return (java.lang.String)baseTypeData().getElementValueAsString(4);
    }

    
    public java.lang.String getRccvv() {
        return (java.lang.String)baseTypeData().getElementValueAsString(3);
    }

    
    public void setRcrsp(java.lang.String Rcrsp) {
        baseTypeData().setElementValue(8, Rcrsp);
    }

    
    public void setRccvv(java.lang.String Rccvv) {
        baseTypeData().setElementValue(3, Rccvv);
    }

    
    public void setAutra(java.lang.String Autra) {
        baseTypeData().setElementValue(10, Autra);
    }

    
    public void setAudat(java.sql.Date Audat) {
        baseTypeData().setElementValue(12, Audat);
    }

    
    public MetaData metadata() {
        return metadata;
    }

    
    public java.sql.Time getAutim() {
        return (java.sql.Time)baseTypeData().getElementValueAsTime(13);
    }

    
    public void setReact(java.lang.String React) {
        baseTypeData().setElementValue(5, React);
    }

    
    public java.lang.String getAust3() {
        return (java.lang.String)baseTypeData().getElementValueAsString(2);
    }

    
    public void setAust2(java.lang.String Aust2) {
        baseTypeData().setElementValue(1, Aust2);
    }

    
    public void setCcpre(java.lang.String Ccpre) {
        baseTypeData().setElementValue(6, Ccpre);
    }

    
    public java.lang.String getCcall() {
        return (java.lang.String)baseTypeData().getElementValueAsString(11);
    }

    
    public java.lang.String getAust1() {
        return (java.lang.String)baseTypeData().getElementValueAsString(0);
    }

    
    public void setAust1(java.lang.String Aust1) {
        baseTypeData().setElementValue(0, Aust1);
    }

    
    public void setCcall(java.lang.String Ccall) {
        baseTypeData().setElementValue(11, Ccall);
    }

    
    public java.lang.String getAutra() {
        return (java.lang.String)baseTypeData().getElementValueAsString(10);
    }

    
    public void setRtext(java.lang.String Rtext) {
        baseTypeData().setElementValue(4, Rtext);
    }

    
    public void setCctyp(java.lang.String Cctyp) {
        baseTypeData().setElementValue(14, Cctyp);
    }

    
    public java.lang.String getRcrsp() {
        return (java.lang.String)baseTypeData().getElementValueAsString(8);
    }

    
    public void setAutim(java.sql.Time Autim) {
        baseTypeData().setElementValue(13, Autim);
    }

    
    public java.lang.String getAust2() {
        return (java.lang.String)baseTypeData().getElementValueAsString(1);
    }

    
    public void setRcavr(java.lang.String Rcavr) {
        baseTypeData().setElementValue(7, Rcavr);
    }

    
    public java.lang.String getReact() {
        return (java.lang.String)baseTypeData().getElementValueAsString(5);
    }

    
    public java.lang.String getAunum() {
        return (java.lang.String)baseTypeData().getElementValueAsString(9);
    }

    
    public void setAust3(java.lang.String Aust3) {
        baseTypeData().setElementValue(2, Aust3);
    }

    
    public java.lang.String getCctyp() {
        return (java.lang.String)baseTypeData().getElementValueAsString(14);
    }

    
    public java.sql.Date getAudat() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(12);
    }

    
    public void setAunum(java.lang.String Aunum) {
        baseTypeData().setElementValue(9, Aunum);
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  Zvcc_ResponseType parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Zvcc_ResponseType parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRcavr() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(7);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCcpre() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(6);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRtext() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(4);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRccvv() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRcrsp() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(8);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getAutim() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(13);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getAust3() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getAust2() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getReact() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(5);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getAunum() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(9);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCcall() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(11);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getAust1() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCctyp() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(14);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getAudat() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(12);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getAutra() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(10);
        }
    
    }

}
