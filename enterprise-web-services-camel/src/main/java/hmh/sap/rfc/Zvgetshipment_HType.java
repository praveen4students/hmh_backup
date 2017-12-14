package hmh.sap.rfc;


public class Zvgetshipment_HType extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1329338318044L) ;

    private  Zvgetshipment_HType.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.XSDL_COMPLEX_TYPE, "urn:sap-com:document:sap:rfc:functions", "ZVGETSHIPMENT_H", 9, 0, hmh.sap.rfc.Zvgetshipment_HType.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "ZVGETSHIPMENT_H", 79, 144, -1, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"ZVGETSHIPMENT_H\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Shipment - Header</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>79</ifr:internalLength1><ifr:internalLength2>144</ifr:internalLength2></ifr:definition></ifr:container></s0:type>");
        descriptorSetElementProperties(descriptor, 0, "SONO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Sono", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "SONO", 0, 0, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SONO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Sales and Distribution Document Number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>0</ifr:offset1><ifr:offset2>0</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VBELN\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 1, "SHIPMENTNO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Shipmentno", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "SHIPMENTNO", 10, 20, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SHIPMENTNO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Delivery</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>10</ifr:offset1><ifr:offset2>20</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VBELN_VL\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 2, "SHIPCRG", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Shipcrg", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "13"}, {"fractionDigits", "2"}}, "SHIPCRG", 20, 40, -1, 7, 7, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SHIPCRG\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Shipment charge</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:referenceField>WAERK</ifr:referenceField><ifr:referenceTable>LIKP</ifr:referenceTable><ifr:offset1>20</ifr:offset1><ifr:offset2>40</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType><ifr:definition><ifr:type>CURR</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>13</ifr:length><ifr:internalLength1>7</ifr:internalLength1><ifr:internalLength2>7</ifr:internalLength2><ifr:decimals>2</ifr:decimals></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 3, "SHIPCR", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Shipcr", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "SHIPCR", 27, 48, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SHIPCR\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Shipment carrier</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>27</ifr:offset1><ifr:offset2>48</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 4, "SHIPSL", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Shipsl", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "12"}}, "SHIPSL", 37, 68, -1, 12, 24, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SHIPSL\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Shipment service level</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>37</ifr:offset1><ifr:offset2>68</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>12</ifr:length><ifr:internalLength1>12</ifr:internalLength1><ifr:internalLength2>24</ifr:internalLength2><ifr:decimals>0</ifr:decimals></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 5, "SHIPWT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Shipwt", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "15"}, {"fractionDigits", "3"}}, "SHIPWT", 49, 92, -1, 8, 8, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SHIPWT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Shipment weight</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:referenceField>GEWEI</ifr:referenceField><ifr:referenceTable>LIKP</ifr:referenceTable><ifr:offset1>49</ifr:offset1><ifr:offset2>92</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType><ifr:definition><ifr:type>QUAN</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>15</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>3</ifr:decimals></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 6, "TOTPKG", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Totpkg", java.lang.String.class, null, new java.lang.String[][]{{"pattern", "\\d+"}, {"maxLength", "6"}}, "TOTPKG", 57, 100, -1, 6, 12, -1, com.sap.mw.jco.JCO.TYPE_NUM, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TOTPKG\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Total package</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>57</ifr:offset1><ifr:offset2>100</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType><ifr:definition><ifr:type>NUMC</ifr:type><ifr:abapType>N</ifr:abapType><ifr:length>6</ifr:length><ifr:internalLength1>6</ifr:internalLength1><ifr:internalLength2>12</ifr:internalLength2><ifr:decimals>0</ifr:decimals></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 7, "DOCDT", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Docdt", java.sql.Date.class, null, new java.lang.String[][]{}, "DOCDT", 63, 112, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DOCDT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Document date</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>63</ifr:offset1><ifr:offset2>112</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 8, "SHIPDT", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Shipdt", java.sql.Date.class, null, new java.lang.String[][]{}, "SHIPDT", 71, 128, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SHIPDT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Ship date</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>71</ifr:offset1><ifr:offset2>128</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        staticDescriptor = descriptor;
    }
    protected  Zvgetshipment_HType (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    public  Zvgetshipment_HType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public void setShipdt(java.sql.Date Shipdt) {
        baseTypeData().setElementValue(8, Shipdt);
    }

    
    public void setShipmentno(java.lang.String Shipmentno) {
        baseTypeData().setElementValue(1, Shipmentno);
    }

    
    public void setSono(java.lang.String Sono) {
        baseTypeData().setElementValue(0, Sono);
    }

    
    public java.lang.String getTotpkg() {
        return (java.lang.String)baseTypeData().getElementValueAsString(6);
    }

    
    public java.lang.String getShipsl() {
        return (java.lang.String)baseTypeData().getElementValueAsString(4);
    }

    
    public java.sql.Date getDocdt() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(7);
    }

    
    public java.lang.String getShipmentno() {
        return (java.lang.String)baseTypeData().getElementValueAsString(1);
    }

    
    public java.math.BigDecimal getShipwt() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(5);
    }

    
    public MetaData metadata() {
        return metadata;
    }

    
    public void setShipcrg(java.math.BigDecimal Shipcrg) {
        baseTypeData().setElementValue(2, Shipcrg);
    }

    
    public void setShipwt(java.math.BigDecimal Shipwt) {
        baseTypeData().setElementValue(5, Shipwt);
    }

    
    public java.lang.String getShipcr() {
        return (java.lang.String)baseTypeData().getElementValueAsString(3);
    }

    
    public void setShipcr(java.lang.String Shipcr) {
        baseTypeData().setElementValue(3, Shipcr);
    }

    
    public java.lang.String getSono() {
        return (java.lang.String)baseTypeData().getElementValueAsString(0);
    }

    
    public void setTotpkg(java.lang.String Totpkg) {
        baseTypeData().setElementValue(6, Totpkg);
    }

    
    public void setDocdt(java.sql.Date Docdt) {
        baseTypeData().setElementValue(7, Docdt);
    }

    
    public java.sql.Date getShipdt() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(8);
    }

    
    public java.math.BigDecimal getShipcrg() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(2);
    }

    
    public void setShipsl(java.lang.String Shipsl) {
        baseTypeData().setElementValue(4, Shipsl);
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  Zvgetshipment_HType parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Zvgetshipment_HType parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getShipcr() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSono() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTotpkg() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(6);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getShipsl() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(4);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getShipdt() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(8);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDocdt() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(7);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getShipmentno() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getShipwt() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(5);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getShipcrg() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
    }

}
