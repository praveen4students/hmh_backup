package hmh.sap.rfc;


public class BapischdlType extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1354127028481L) ;

    private  BapischdlType.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.XSDL_COMPLEX_TYPE, "urn:sap-com:document:sap:rfc:functions", "BAPISCHDL", 23, 0, hmh.sap.rfc.BapischdlType.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "BAPISCHDL", 198, 390, -1, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"BAPISCHDL\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Communication Fields for Maintaining SD Doc. Schedule Lines</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>110</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>198</ifr:internalLength1><ifr:internalLength2>390</ifr:internalLength2></ifr:definition></ifr:container></s0:type>");
        descriptorSetElementProperties(descriptor, 0, "ITM_NUMBER", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Itm_Number", java.lang.String.class, null, new java.lang.String[][]{{"pattern", "\\d+"}, {"maxLength", "6"}}, "ITM_NUMBER", 0, 0, -1, 6, 12, -1, com.sap.mw.jco.JCO.TYPE_NUM, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ITM_NUMBER\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Sales Document Item</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>VBUP</ifr:checkTable><ifr:offset1>0</ifr:offset1><ifr:offset2>0</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"POSNR_VA\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>NUMC</ifr:type><ifr:abapType>N</ifr:abapType><ifr:length>6</ifr:length><ifr:internalLength1>6</ifr:internalLength1><ifr:internalLength2>12</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>6</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 1, "SCHED_LINE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Sched_Line", java.lang.String.class, null, new java.lang.String[][]{{"pattern", "\\d+"}, {"maxLength", "4"}}, "SCHED_LINE", 6, 12, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_NUM, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SCHED_LINE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Schedule line</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>VBEP</ifr:checkTable><ifr:offset1>6</ifr:offset1><ifr:offset2>12</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ETENR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>NUMC</ifr:type><ifr:abapType>N</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 2, "REQ_DATE", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Req_Date", java.sql.Date.class, null, new java.lang.String[][]{}, "REQ_DATE", 10, 20, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REQ_DATE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Schedule line date</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>10</ifr:offset1><ifr:offset2>20</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"EDATU\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 3, "DATE_TYPE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Date_Type", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "DATE_TYPE", 18, 36, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DATE_TYPE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Date type (day, week, month, interval)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>18</ifr:offset1><ifr:offset2>36</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PRGRS\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 4, "REQ_TIME", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:time", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Req_Time", java.sql.Time.class, null, new java.lang.String[][]{}, "REQ_TIME", 19, 38, -1, 6, 12, -1, com.sap.mw.jco.JCO.TYPE_TIME, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REQ_TIME\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Arrival time</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>19</ifr:offset1><ifr:offset2>38</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"EZEIT_VBEP\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>TIMS</ifr:type><ifr:abapType>T</ifr:abapType><ifr:length>6</ifr:length><ifr:internalLength1>6</ifr:internalLength1><ifr:internalLength2>12</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>8</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 5, "REQ_QTY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Req_Qty", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "13"}, {"fractionDigits", "3"}}, "REQ_QTY", 25, 50, -1, 7, 7, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REQ_QTY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Order quantity in sales units</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:referenceField>VRKME</ifr:referenceField><ifr:referenceTable>VBAP</ifr:referenceTable><ifr:offset1>25</ifr:offset1><ifr:offset2>50</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"WMENG\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>QUAN</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>13</ifr:length><ifr:internalLength1>7</ifr:internalLength1><ifr:internalLength2>7</ifr:internalLength2><ifr:decimals>3</ifr:decimals><ifr:outputLength>17</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 6, "REQ_DLV_BL", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Req_Dlv_Bl", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "REQ_DLV_BL", 32, 58, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REQ_DLV_BL\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Schedule line blocked for delivery</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TVLS</ifr:checkTable><ifr:offset1>32</ifr:offset1><ifr:offset2>58</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"LIFSP_EP\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 7, "SCHED_TYPE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Sched_Type", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "SCHED_TYPE", 34, 62, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SCHED_TYPE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Schedule line category</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TVEP</ifr:checkTable><ifr:offset1>34</ifr:offset1><ifr:offset2>62</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ETTYP\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 8, "TP_DATE", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Tp_Date", java.sql.Date.class, null, new java.lang.String[][]{}, "TP_DATE", 36, 66, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TP_DATE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Transportation Planning Date</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>36</ifr:offset1><ifr:offset2>66</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"TDDAT_D\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 9, "MS_DATE", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ms_Date", java.sql.Date.class, null, new java.lang.String[][]{}, "MS_DATE", 44, 82, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MS_DATE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Material availability date</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>44</ifr:offset1><ifr:offset2>82</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MBDAT\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 10, "LOAD_DATE", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Load_Date", java.sql.Date.class, null, new java.lang.String[][]{}, "LOAD_DATE", 52, 98, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"LOAD_DATE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Loading Date</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>52</ifr:offset1><ifr:offset2>98</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"LDDAT\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 11, "GI_DATE", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Gi_Date", java.sql.Date.class, null, new java.lang.String[][]{}, "GI_DATE", 60, 114, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"GI_DATE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Goods issue date</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>60</ifr:offset1><ifr:offset2>114</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"WADAT\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 12, "TP_TIME", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:time", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Tp_Time", java.sql.Time.class, null, new java.lang.String[][]{}, "TP_TIME", 68, 130, -1, 6, 12, -1, com.sap.mw.jco.JCO.TYPE_TIME, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TP_TIME\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Transportation planning -time (local w/ref. to shipping pnt)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>68</ifr:offset1><ifr:offset2>130</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"TDUHR\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>TIMS</ifr:type><ifr:abapType>T</ifr:abapType><ifr:length>6</ifr:length><ifr:internalLength1>6</ifr:internalLength1><ifr:internalLength2>12</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>5</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 13, "MS_TIME", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:time", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ms_Time", java.sql.Time.class, null, new java.lang.String[][]{}, "MS_TIME", 74, 142, -1, 6, 12, -1, com.sap.mw.jco.JCO.TYPE_TIME, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MS_TIME\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Material staging time (local time with reference to a plant)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>74</ifr:offset1><ifr:offset2>142</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MBUHR\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>TIMS</ifr:type><ifr:abapType>T</ifr:abapType><ifr:length>6</ifr:length><ifr:internalLength1>6</ifr:internalLength1><ifr:internalLength2>12</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>8</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 14, "LOAD_TIME", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:time", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Load_Time", java.sql.Time.class, null, new java.lang.String[][]{}, "LOAD_TIME", 80, 154, -1, 6, 12, -1, com.sap.mw.jco.JCO.TYPE_TIME, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"LOAD_TIME\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Loading time (local time with reference to a shipping point)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>80</ifr:offset1><ifr:offset2>154</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"LDUHR\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>TIMS</ifr:type><ifr:abapType>T</ifr:abapType><ifr:length>6</ifr:length><ifr:internalLength1>6</ifr:internalLength1><ifr:internalLength2>12</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>5</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 15, "GI_TIME", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:time", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Gi_Time", java.sql.Time.class, null, new java.lang.String[][]{}, "GI_TIME", 86, 166, -1, 6, 12, -1, com.sap.mw.jco.JCO.TYPE_TIME, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"GI_TIME\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Time of goods issue (local time, with reference to a plant)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>86</ifr:offset1><ifr:offset2>166</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"WAUHR\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>TIMS</ifr:type><ifr:abapType>T</ifr:abapType><ifr:length>6</ifr:length><ifr:internalLength1>6</ifr:internalLength1><ifr:internalLength2>12</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>8</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 16, "REFOBJTYPE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Refobjtype", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "REFOBJTYPE", 92, 178, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REFOBJTYPE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Object Type</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TOJTB</ifr:checkTable><ifr:offset1>92</ifr:offset1><ifr:offset2>178</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"SWO_OBJTYP\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 17, "REFOBJKEY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Refobjkey", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "70"}}, "REFOBJKEY", 102, 198, -1, 70, 140, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REFOBJKEY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Object Key</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>102</ifr:offset1><ifr:offset2>198</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"SWO_TYPEID\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>70</ifr:length><ifr:internalLength1>70</ifr:internalLength1><ifr:internalLength2>140</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>70</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 18, "REFLOGSYS", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Reflogsys", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "REFLOGSYS", 172, 338, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REFLOGSYS\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Logical System</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>TBDLS</ifr:checkTable><ifr:offset1>172</ifr:offset1><ifr:offset2>338</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"LOGSYS\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 19, "DLV_DATE", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Dlv_Date", java.sql.Date.class, null, new java.lang.String[][]{}, "DLV_DATE", 182, 358, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DLV_DATE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Schedule line date</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>182</ifr:offset1><ifr:offset2>358</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"EDATU\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 20, "DLV_TIME", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:time", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Dlv_Time", java.sql.Time.class, null, new java.lang.String[][]{}, "DLV_TIME", 190, 374, -1, 6, 12, -1, com.sap.mw.jco.JCO.TYPE_TIME, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DLV_TIME\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Arrival time</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>190</ifr:offset1><ifr:offset2>374</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"EZEIT_VBEP\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>TIMS</ifr:type><ifr:abapType>T</ifr:abapType><ifr:length>6</ifr:length><ifr:internalLength1>6</ifr:internalLength1><ifr:internalLength2>12</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>8</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 21, "REL_TYPE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Rel_Type", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "REL_TYPE", 196, 386, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REL_TYPE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Release type</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>196</ifr:offset1><ifr:offset2>386</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ABART\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 22, "PLAN_SCHED_TYPE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Plan_Sched_Type", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "PLAN_SCHED_TYPE", 197, 388, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PLAN_SCHED_TYPE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Schedule line type EDI</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>197</ifr:offset1><ifr:offset2>388</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"EDI_ETTYP\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        staticDescriptor = descriptor;
    }
    protected  BapischdlType (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    public  BapischdlType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public void setMs_Time(java.sql.Time Ms_Time) {
        baseTypeData().setElementValue(13, Ms_Time);
    }

    
    public java.lang.String getPlan_Sched_Type() {
        return (java.lang.String)baseTypeData().getElementValueAsString(22);
    }

    
    public void setMs_Date(java.sql.Date Ms_Date) {
        baseTypeData().setElementValue(9, Ms_Date);
    }

    
    public void setTp_Date(java.sql.Date Tp_Date) {
        baseTypeData().setElementValue(8, Tp_Date);
    }

    
    public java.lang.String getReflogsys() {
        return (java.lang.String)baseTypeData().getElementValueAsString(18);
    }

    
    public java.sql.Date getGi_Date() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(11);
    }

    
    public void setTp_Time(java.sql.Time Tp_Time) {
        baseTypeData().setElementValue(12, Tp_Time);
    }

    
    public java.sql.Time getLoad_Time() {
        return (java.sql.Time)baseTypeData().getElementValueAsTime(14);
    }

    
    public java.sql.Date getTp_Date() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(8);
    }

    
    public void setGi_Time(java.sql.Time Gi_Time) {
        baseTypeData().setElementValue(15, Gi_Time);
    }

    
    public java.sql.Date getReq_Date() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(2);
    }

    
    public void setLoad_Date(java.sql.Date Load_Date) {
        baseTypeData().setElementValue(10, Load_Date);
    }

    
    public MetaData metadata() {
        return metadata;
    }

    
    public void setRefobjkey(java.lang.String Refobjkey) {
        baseTypeData().setElementValue(17, Refobjkey);
    }

    
    public java.lang.String getRefobjtype() {
        return (java.lang.String)baseTypeData().getElementValueAsString(16);
    }

    
    public java.sql.Time getGi_Time() {
        return (java.sql.Time)baseTypeData().getElementValueAsTime(15);
    }

    
    public java.sql.Date getMs_Date() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(9);
    }

    
    public void setReq_Date(java.sql.Date Req_Date) {
        baseTypeData().setElementValue(2, Req_Date);
    }

    
    public void setPlan_Sched_Type(java.lang.String Plan_Sched_Type) {
        baseTypeData().setElementValue(22, Plan_Sched_Type);
    }

    
    public java.lang.String getSched_Type() {
        return (java.lang.String)baseTypeData().getElementValueAsString(7);
    }

    
    public java.sql.Date getLoad_Date() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(10);
    }

    
    public void setGi_Date(java.sql.Date Gi_Date) {
        baseTypeData().setElementValue(11, Gi_Date);
    }

    
    public void setLoad_Time(java.sql.Time Load_Time) {
        baseTypeData().setElementValue(14, Load_Time);
    }

    
    public void setItm_Number(java.lang.String Itm_Number) {
        baseTypeData().setElementValue(0, Itm_Number);
    }

    
    public void setReflogsys(java.lang.String Reflogsys) {
        baseTypeData().setElementValue(18, Reflogsys);
    }

    
    public void setDate_Type(java.lang.String Date_Type) {
        baseTypeData().setElementValue(3, Date_Type);
    }

    
    public java.lang.String getRefobjkey() {
        return (java.lang.String)baseTypeData().getElementValueAsString(17);
    }

    
    public void setReq_Time(java.sql.Time Req_Time) {
        baseTypeData().setElementValue(4, Req_Time);
    }

    
    public java.math.BigDecimal getReq_Qty() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(5);
    }

    
    public java.sql.Time getMs_Time() {
        return (java.sql.Time)baseTypeData().getElementValueAsTime(13);
    }

    
    public void setReq_Qty(java.math.BigDecimal Req_Qty) {
        baseTypeData().setElementValue(5, Req_Qty);
    }

    
    public void setDlv_Date(java.sql.Date Dlv_Date) {
        baseTypeData().setElementValue(19, Dlv_Date);
    }

    
    public void setRefobjtype(java.lang.String Refobjtype) {
        baseTypeData().setElementValue(16, Refobjtype);
    }

    
    public void setDlv_Time(java.sql.Time Dlv_Time) {
        baseTypeData().setElementValue(20, Dlv_Time);
    }

    
    public java.lang.String getDate_Type() {
        return (java.lang.String)baseTypeData().getElementValueAsString(3);
    }

    
    public java.sql.Time getDlv_Time() {
        return (java.sql.Time)baseTypeData().getElementValueAsTime(20);
    }

    
    public void setSched_Line(java.lang.String Sched_Line) {
        baseTypeData().setElementValue(1, Sched_Line);
    }

    
    public java.sql.Time getTp_Time() {
        return (java.sql.Time)baseTypeData().getElementValueAsTime(12);
    }

    
    public java.sql.Date getDlv_Date() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(19);
    }

    
    public java.lang.String getReq_Dlv_Bl() {
        return (java.lang.String)baseTypeData().getElementValueAsString(6);
    }

    
    public java.lang.String getItm_Number() {
        return (java.lang.String)baseTypeData().getElementValueAsString(0);
    }

    
    public void setReq_Dlv_Bl(java.lang.String Req_Dlv_Bl) {
        baseTypeData().setElementValue(6, Req_Dlv_Bl);
    }

    
    public void setRel_Type(java.lang.String Rel_Type) {
        baseTypeData().setElementValue(21, Rel_Type);
    }

    
    public java.lang.String getRel_Type() {
        return (java.lang.String)baseTypeData().getElementValueAsString(21);
    }

    
    public void setSched_Type(java.lang.String Sched_Type) {
        baseTypeData().setElementValue(7, Sched_Type);
    }

    
    public java.sql.Time getReq_Time() {
        return (java.sql.Time)baseTypeData().getElementValueAsTime(4);
    }

    
    public java.lang.String getSched_Line() {
        return (java.lang.String)baseTypeData().getElementValueAsString(1);
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  BapischdlType parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (BapischdlType parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPlan_Sched_Type() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(22);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRefobjkey() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(17);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getReflogsys() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(18);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getReq_Qty() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(5);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getGi_Date() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(11);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMs_Time() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(13);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getLoad_Time() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(14);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTp_Date() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(8);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getReq_Date() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDate_Type() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDlv_Time() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(20);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRefobjtype() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(16);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getGi_Time() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(15);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMs_Date() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(9);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTp_Time() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(12);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDlv_Date() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(19);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getItm_Number() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getReq_Dlv_Bl() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(6);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSched_Type() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(7);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRel_Type() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(21);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getLoad_Date() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(10);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getReq_Time() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(4);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSched_Line() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
    }

}
