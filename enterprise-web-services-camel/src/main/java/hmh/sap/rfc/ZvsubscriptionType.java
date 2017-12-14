package hmh.sap.rfc;


public class ZvsubscriptionType extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1329338318030L) ;

    private  ZvsubscriptionType.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.XSDL_COMPLEX_TYPE, "urn:sap-com:document:sap:rfc:functions", "ZVSUBSCRIPTION", 7, 0, hmh.sap.rfc.ZvsubscriptionType.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "ZVSUBSCRIPTION", 41, 76, -1, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"ZVSUBSCRIPTION\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Subscription</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>41</ifr:internalLength1><ifr:internalLength2>76</ifr:internalLength2></ifr:definition></ifr:container></s0:type>");
        descriptorSetElementProperties(descriptor, 0, "INV_NO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Inv_No", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "INV_NO", 0, 0, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"INV_NO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Sales and Distribution Document Number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>0</ifr:offset1><ifr:offset2>0</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VBELN\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 1, "LINENUM", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Linenum", java.lang.String.class, null, new java.lang.String[][]{{"pattern", "\\d+"}, {"maxLength", "6"}}, "LINENUM", 10, 20, -1, 6, 12, -1, com.sap.mw.jco.JCO.TYPE_NUM, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"LINENUM\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Item number of the SD document</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>10</ifr:offset1><ifr:offset2>20</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"POSNR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>NUMC</ifr:type><ifr:abapType>N</ifr:abapType><ifr:length>6</ifr:length><ifr:internalLength1>6</ifr:internalLength1><ifr:internalLength2>12</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>6</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 2, "DURATION", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:unsignedByte", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Duration", java.lang.Short.class, null, new java.lang.String[][]{}, "DURATION", 16, 32, -1, 1, 1, -1, com.sap.mw.jco.JCO.TYPE_INT1, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DURATION\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Byte value</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>16</ifr:offset1><ifr:offset2>32</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"INT1\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>INT1</ifr:type><ifr:abapType>b</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>1</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 3, "UNIT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Unit", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "UNIT", 17, 34, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"UNIT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Unit of validity period of contract</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>17</ifr:offset1><ifr:offset2>34</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VLAUE_VEDA\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 4, "RATE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Rate", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "13"}, {"fractionDigits", "2"}}, "RATE", 18, 36, -1, 7, 7, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"RATE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Subtotal 2 from pricing procedure for condition</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:referenceField>WAERK</ifr:referenceField><ifr:referenceTable>VBRK</ifr:referenceTable><ifr:offset1>18</ifr:offset1><ifr:offset2>36</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KZWI2\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>true</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CURR</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>13</ifr:length><ifr:internalLength1>7</ifr:internalLength1><ifr:internalLength2>7</ifr:internalLength2><ifr:decimals>2</ifr:decimals><ifr:outputLength>18</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 5, "STARTDT", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Startdt", java.sql.Date.class, null, new java.lang.String[][]{}, "STARTDT", 25, 44, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"STARTDT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Contract start date</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>25</ifr:offset1><ifr:offset2>44</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VBDAT_VEDA\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 6, "ENDDT", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Enddt", java.sql.Date.class, null, new java.lang.String[][]{}, "ENDDT", 33, 60, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ENDDT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Contract end date</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>33</ifr:offset1><ifr:offset2>60</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VNDAT_VEDA\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        staticDescriptor = descriptor;
    }
    public  ZvsubscriptionType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    protected  ZvsubscriptionType (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    
    public java.lang.String getLinenum() {
        return (java.lang.String)baseTypeData().getElementValueAsString(1);
    }

    
    public java.sql.Date getStartdt() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(5);
    }

    
    public void setDuration(short Duration) {
        baseTypeData().setElementValue(2, Duration);
    }

    
    public java.lang.String getInv_No() {
        return (java.lang.String)baseTypeData().getElementValueAsString(0);
    }

    
    public java.sql.Date getEnddt() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(6);
    }

    
    public MetaData metadata() {
        return metadata;
    }

    
    public void setInv_No(java.lang.String Inv_No) {
        baseTypeData().setElementValue(0, Inv_No);
    }

    
    public java.math.BigDecimal getRate() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(4);
    }

    
    public void setRate(java.math.BigDecimal Rate) {
        baseTypeData().setElementValue(4, Rate);
    }

    
    public short getDuration() {
        return baseTypeData().getElementValueAsShort(2);
    }

    
    public void setEnddt(java.sql.Date Enddt) {
        baseTypeData().setElementValue(6, Enddt);
    }

    
    public void setLinenum(java.lang.String Linenum) {
        baseTypeData().setElementValue(1, Linenum);
    }

    
    public void setUnit(java.lang.String Unit) {
        baseTypeData().setElementValue(3, Unit);
    }

    
    public java.lang.String getUnit() {
        return (java.lang.String)baseTypeData().getElementValueAsString(3);
    }

    
    public void setStartdt(java.sql.Date Startdt) {
        baseTypeData().setElementValue(5, Startdt);
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  ZvsubscriptionType parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (ZvsubscriptionType parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getLinenum() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRate() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(4);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getStartdt() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(5);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDuration() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getUnit() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getInv_No() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getEnddt() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(6);
        }
    
    }

}
