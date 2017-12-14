package hmh.sap.rfc;


public class Bapi_Mlgt_GaType extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1335984408562L) ;

    private  Bapi_Mlgt_GaType.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.XSDL_COMPLEX_TYPE, "urn:sap-com:document:sap:rfc:functions", "BAPI_MLGT_GA", 10, 0, hmh.sap.rfc.Bapi_Mlgt_GaType.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "BAPI_MLGT_GA", 55, 76, -1, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"BAPI_MLGT_GA\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Storage type data</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>55</ifr:internalLength1><ifr:internalLength2>76</ifr:internalLength2></ifr:definition></ifr:container></s0:type>");
        descriptorSetElementProperties(descriptor, 0, "WHSE_NO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Whse_No", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "WHSE_NO", 0, 0, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"WHSE_NO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Warehouse Number / Warehouse Complex</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>0</ifr:offset1><ifr:offset2>0</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"LGNUM\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 1, "STGE_TYPE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Stge_Type", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "STGE_TYPE", 3, 6, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"STGE_TYPE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Storage Type</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>3</ifr:offset1><ifr:offset2>6</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"LGTYP\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 2, "DEL_FLAG", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Del_Flag", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "DEL_FLAG", 6, 12, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DEL_FLAG\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Deletion flag for all material data of a storage type</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>6</ifr:offset1><ifr:offset2>12</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"LVOLT\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>true</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 3, "STGE_BIN", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Stge_Bin", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "STGE_BIN", 7, 14, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"STGE_BIN\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Storage Bin</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>7</ifr:offset1><ifr:offset2>14</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"LGPLA\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 4, "MAX_SB_QTY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Max_Sb_Qty", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "13"}, {"fractionDigits", "3"}}, "MAX_SB_QTY", 17, 34, -1, 7, 7, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MAX_SB_QTY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Maximum storage bin quantity</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:referenceField>MEINS</ifr:referenceField><ifr:referenceTable>MARA</ifr:referenceTable><ifr:offset1>17</ifr:offset1><ifr:offset2>34</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MLGT_LPMAX\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>QUAN</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>13</ifr:length><ifr:internalLength1>7</ifr:internalLength1><ifr:internalLength2>7</ifr:internalLength2><ifr:decimals>3</ifr:decimals><ifr:outputLength>17</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 5, "MIN_SB_QTY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Min_Sb_Qty", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "13"}, {"fractionDigits", "3"}}, "MIN_SB_QTY", 24, 41, -1, 7, 7, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MIN_SB_QTY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Minimum storage bin quantity</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:referenceField>MEINS</ifr:referenceField><ifr:referenceTable>MARA</ifr:referenceTable><ifr:offset1>24</ifr:offset1><ifr:offset2>41</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MLGT_LPMIN\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>QUAN</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>13</ifr:length><ifr:internalLength1>7</ifr:internalLength1><ifr:internalLength2>7</ifr:internalLength2><ifr:decimals>3</ifr:decimals><ifr:outputLength>17</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 6, "CTRL_QTY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ctrl_Qty", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "13"}, {"fractionDigits", "3"}}, "CTRL_QTY", 31, 48, -1, 7, 7, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CTRL_QTY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Control quantity</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:referenceField>MEINS</ifr:referenceField><ifr:referenceTable>MARA</ifr:referenceTable><ifr:offset1>31</ifr:offset1><ifr:offset2>48</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MLGT_MAMNG\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>QUAN</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>13</ifr:length><ifr:internalLength1>7</ifr:internalLength1><ifr:internalLength2>7</ifr:internalLength2><ifr:decimals>3</ifr:decimals><ifr:outputLength>17</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 7, "REPLEN_QTY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Replen_Qty", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "13"}, {"fractionDigits", "3"}}, "REPLEN_QTY", 38, 55, -1, 7, 7, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"REPLEN_QTY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Replenishment quantity</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:referenceField>MEINS</ifr:referenceField><ifr:referenceTable>MARA</ifr:referenceTable><ifr:offset1>38</ifr:offset1><ifr:offset2>55</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MLGT_NSMNG\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>QUAN</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>13</ifr:length><ifr:internalLength1>7</ifr:internalLength1><ifr:internalLength2>7</ifr:internalLength2><ifr:decimals>3</ifr:decimals><ifr:outputLength>17</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 8, "PICK_AREA", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Pick_Area", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "PICK_AREA", 45, 62, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PICK_AREA\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Picking Area</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>45</ifr:offset1><ifr:offset2>62</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"KOBER\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 9, "ROUND_QTY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:decimal", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Round_Qty", java.math.BigDecimal.class, null, new java.lang.String[][]{{"totalDigits", "13"}, {"fractionDigits", "3"}}, "ROUND_QTY", 48, 68, -1, 7, 7, -1, com.sap.mw.jco.JCO.TYPE_BCD, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ROUND_QTY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Rounding qty</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:referenceField>MEINS</ifr:referenceField><ifr:referenceTable>MARA</ifr:referenceTable><ifr:offset1>48</ifr:offset1><ifr:offset2>68</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MLGT_RDMNG\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>QUAN</ifr:type><ifr:abapType>P</ifr:abapType><ifr:length>13</ifr:length><ifr:internalLength1>7</ifr:internalLength1><ifr:internalLength2>7</ifr:internalLength2><ifr:decimals>3</ifr:decimals><ifr:outputLength>17</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        staticDescriptor = descriptor;
    }
    public  Bapi_Mlgt_GaType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    protected  Bapi_Mlgt_GaType (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    
    public java.lang.String getPick_Area() {
        return (java.lang.String)baseTypeData().getElementValueAsString(8);
    }

    
    public void setDel_Flag(java.lang.String Del_Flag) {
        baseTypeData().setElementValue(2, Del_Flag);
    }

    
    public void setCtrl_Qty(java.math.BigDecimal Ctrl_Qty) {
        baseTypeData().setElementValue(6, Ctrl_Qty);
    }

    
    public java.lang.String getStge_Type() {
        return (java.lang.String)baseTypeData().getElementValueAsString(1);
    }

    
    public void setStge_Bin(java.lang.String Stge_Bin) {
        baseTypeData().setElementValue(3, Stge_Bin);
    }

    
    public java.lang.String getStge_Bin() {
        return (java.lang.String)baseTypeData().getElementValueAsString(3);
    }

    
    public void setReplen_Qty(java.math.BigDecimal Replen_Qty) {
        baseTypeData().setElementValue(7, Replen_Qty);
    }

    
    public java.lang.String getDel_Flag() {
        return (java.lang.String)baseTypeData().getElementValueAsString(2);
    }

    
    public java.math.BigDecimal getRound_Qty() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(9);
    }

    
    public void setMax_Sb_Qty(java.math.BigDecimal Max_Sb_Qty) {
        baseTypeData().setElementValue(4, Max_Sb_Qty);
    }

    
    public void setRound_Qty(java.math.BigDecimal Round_Qty) {
        baseTypeData().setElementValue(9, Round_Qty);
    }

    
    public void setStge_Type(java.lang.String Stge_Type) {
        baseTypeData().setElementValue(1, Stge_Type);
    }

    
    public MetaData metadata() {
        return metadata;
    }

    
    public void setMin_Sb_Qty(java.math.BigDecimal Min_Sb_Qty) {
        baseTypeData().setElementValue(5, Min_Sb_Qty);
    }

    
    public java.lang.String getWhse_No() {
        return (java.lang.String)baseTypeData().getElementValueAsString(0);
    }

    
    public void setWhse_No(java.lang.String Whse_No) {
        baseTypeData().setElementValue(0, Whse_No);
    }

    
    public void setPick_Area(java.lang.String Pick_Area) {
        baseTypeData().setElementValue(8, Pick_Area);
    }

    
    public java.math.BigDecimal getMin_Sb_Qty() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(5);
    }

    
    public java.math.BigDecimal getMax_Sb_Qty() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(4);
    }

    
    public java.math.BigDecimal getReplen_Qty() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(7);
    }

    
    public java.math.BigDecimal getCtrl_Qty() {
        return (java.math.BigDecimal)baseTypeData().getElementValueAsBigDecimal(6);
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  Bapi_Mlgt_GaType parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Bapi_Mlgt_GaType parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPick_Area() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(8);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getStge_Type() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getStge_Bin() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getWhse_No() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDel_Flag() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRound_Qty() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(9);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMin_Sb_Qty() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(5);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMax_Sb_Qty() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(4);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getReplen_Qty() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(7);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCtrl_Qty() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(6);
        }
    
    }

}
