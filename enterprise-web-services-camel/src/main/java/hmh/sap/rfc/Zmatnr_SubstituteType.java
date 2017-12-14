package hmh.sap.rfc;


public class Zmatnr_SubstituteType extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1329337306551L) ;

    private  Zmatnr_SubstituteType.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.XSDL_COMPLEX_TYPE, "urn:sap-com:document:sap:rfc:functions", "ZMATNR_SUBSTITUTE", 9, 0, hmh.sap.rfc.Zmatnr_SubstituteType.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "ZMATNR_SUBSTITUTE", 156, 312, -1, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"ZMATNR_SUBSTITUTE\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Gets the substituted material details</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>156</ifr:internalLength1><ifr:internalLength2>312</ifr:internalLength2></ifr:definition></ifr:container></s0:type>");
        descriptorSetElementProperties(descriptor, 0, "MATNR", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Matnr", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "18"}}, "MATNR", 0, 0, -1, 18, 36, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MATNR\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Material Number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>0</ifr:offset1><ifr:offset2>0</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MATNR\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>18</ifr:length><ifr:internalLength1>18</ifr:internalLength1><ifr:internalLength2>36</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>18</ifr:outputLength><ifr:conversionExit>MATN1</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 1, "ISBN", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Isbn", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "18"}}, "ISBN", 18, 36, -1, 18, 36, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ISBN\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Identification Code</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>18</ifr:offset1><ifr:offset2>36</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ISMIDENTCODE\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>18</ifr:length><ifr:internalLength1>18</ifr:internalLength1><ifr:internalLength2>36</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>18</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 2, "SUB_TITLE_NUMBER", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Sub_Title_Number", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "18"}}, "SUB_TITLE_NUMBER", 36, 72, -1, 18, 36, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SUB_TITLE_NUMBER\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Material Number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>36</ifr:offset1><ifr:offset2>72</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MATNR\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>18</ifr:length><ifr:internalLength1>18</ifr:internalLength1><ifr:internalLength2>36</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>18</ifr:outputLength><ifr:conversionExit>MATN1</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 3, "SUB_ISBN", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Sub_Isbn", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "18"}}, "SUB_ISBN", 54, 108, -1, 18, 36, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SUB_ISBN\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Identification Code</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>54</ifr:offset1><ifr:offset2>108</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ISMIDENTCODE\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>18</ifr:length><ifr:internalLength1>18</ifr:internalLength1><ifr:internalLength2>36</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>18</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 4, "DESCRIPTION", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Description", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "80"}}, "DESCRIPTION", 72, 144, -1, 80, 160, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"DESCRIPTION\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Address line</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>72</ifr:offset1><ifr:offset2>144</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"LINES\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>80</ifr:length><ifr:internalLength1>80</ifr:internalLength1><ifr:internalLength2>160</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>80</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 5, "AUTO_SUBSTITUTE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Auto_Substitute", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "AUTO_SUBSTITUTE", 152, 304, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"AUTO_SUBSTITUTE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Indicates if the material is substituted automatically</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>152</ifr:offset1><ifr:offset2>304</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 6, "USE_PRIME_PRICE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Use_Prime_Price", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "USE_PRIME_PRICE", 153, 306, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"USE_PRIME_PRICE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Indicates the material used for pricing</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>153</ifr:offset1><ifr:offset2>306</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 7, "APPLY_SALE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Apply_Sale", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "APPLY_SALE", 154, 308, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"APPLY_SALE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Indicates the material used for sale transactions</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>154</ifr:offset1><ifr:offset2>308</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 8, "APPLY_SAMPLE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Apply_Sample", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "APPLY_SAMPLE", 155, 310, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"APPLY_SAMPLE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Indicates the material used for sample transactions</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>155</ifr:offset1><ifr:offset2>310</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        staticDescriptor = descriptor;
    }
    protected  Zmatnr_SubstituteType (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    public  Zmatnr_SubstituteType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public void setMatnr(java.lang.String Matnr) {
        baseTypeData().setElementValue(0, Matnr);
    }

    
    public void setApply_Sale(java.lang.String Apply_Sale) {
        baseTypeData().setElementValue(7, Apply_Sale);
    }

    
    public void setUse_Prime_Price(java.lang.String Use_Prime_Price) {
        baseTypeData().setElementValue(6, Use_Prime_Price);
    }

    
    public java.lang.String getAuto_Substitute() {
        return (java.lang.String)baseTypeData().getElementValueAsString(5);
    }

    
    public void setIsbn(java.lang.String Isbn) {
        baseTypeData().setElementValue(1, Isbn);
    }

    
    public void setDescription(java.lang.String Description) {
        baseTypeData().setElementValue(4, Description);
    }

    
    public java.lang.String getDescription() {
        return (java.lang.String)baseTypeData().getElementValueAsString(4);
    }

    
    public java.lang.String getApply_Sample() {
        return (java.lang.String)baseTypeData().getElementValueAsString(8);
    }

    
    public java.lang.String getSub_Isbn() {
        return (java.lang.String)baseTypeData().getElementValueAsString(3);
    }

    
    public java.lang.String getMatnr() {
        return (java.lang.String)baseTypeData().getElementValueAsString(0);
    }

    
    public void setSub_Title_Number(java.lang.String Sub_Title_Number) {
        baseTypeData().setElementValue(2, Sub_Title_Number);
    }

    
    public MetaData metadata() {
        return metadata;
    }

    
    public void setAuto_Substitute(java.lang.String Auto_Substitute) {
        baseTypeData().setElementValue(5, Auto_Substitute);
    }

    
    public java.lang.String getUse_Prime_Price() {
        return (java.lang.String)baseTypeData().getElementValueAsString(6);
    }

    
    public java.lang.String getSub_Title_Number() {
        return (java.lang.String)baseTypeData().getElementValueAsString(2);
    }

    
    public void setSub_Isbn(java.lang.String Sub_Isbn) {
        baseTypeData().setElementValue(3, Sub_Isbn);
    }

    
    public void setApply_Sample(java.lang.String Apply_Sample) {
        baseTypeData().setElementValue(8, Apply_Sample);
    }

    
    public java.lang.String getApply_Sale() {
        return (java.lang.String)baseTypeData().getElementValueAsString(7);
    }

    
    public java.lang.String getIsbn() {
        return (java.lang.String)baseTypeData().getElementValueAsString(1);
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  Zmatnr_SubstituteType parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Zmatnr_SubstituteType parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getUse_Prime_Price() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(6);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSub_Title_Number() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getAuto_Substitute() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(5);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getDescription() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(4);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getApply_Sample() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(8);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getSub_Isbn() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getApply_Sale() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(7);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getIsbn() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMatnr() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
    }

}
