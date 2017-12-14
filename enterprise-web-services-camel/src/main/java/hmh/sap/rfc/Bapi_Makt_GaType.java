package hmh.sap.rfc;


public class Bapi_Makt_GaType extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1335984408550L) ;

    private  Bapi_Makt_GaType.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.XSDL_COMPLEX_TYPE, "urn:sap-com:document:sap:rfc:functions", "BAPI_MAKT_GA", 3, 0, hmh.sap.rfc.Bapi_Makt_GaType.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "BAPI_MAKT_GA", 43, 86, -1, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"BAPI_MAKT_GA\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Material Descriptions</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>43</ifr:internalLength1><ifr:internalLength2>86</ifr:internalLength2></ifr:definition></ifr:container></s0:type>");
        descriptorSetElementProperties(descriptor, 0, "LANGU", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Langu", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "LANGU", 0, 0, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"LANGU\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Language Key</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>0</ifr:offset1><ifr:offset2>0</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"SPRAS\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>LANG</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength><ifr:conversionExit>ISOLA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 1, "LANGU_ISO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Langu_Iso", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "LANGU_ISO", 1, 2, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"LANGU_ISO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Language according to ISO 639</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1</ifr:offset1><ifr:offset2>2</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"LAISO\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 2, "MATL_DESC", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Matl_Desc", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "40"}}, "MATL_DESC", 3, 6, -1, 40, 80, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MATL_DESC\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Material Description</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>3</ifr:offset1><ifr:offset2>6</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MAKTX\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>40</ifr:length><ifr:internalLength1>40</ifr:internalLength1><ifr:internalLength2>80</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>40</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        staticDescriptor = descriptor;
    }
    protected  Bapi_Makt_GaType (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    public  Bapi_Makt_GaType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public java.lang.String getMatl_Desc() {
        return (java.lang.String)baseTypeData().getElementValueAsString(2);
    }

    
    public void setLangu_Iso(java.lang.String Langu_Iso) {
        baseTypeData().setElementValue(1, Langu_Iso);
    }

    
    public java.lang.String getLangu() {
        return (java.lang.String)baseTypeData().getElementValueAsString(0);
    }

    
    public java.lang.String getLangu_Iso() {
        return (java.lang.String)baseTypeData().getElementValueAsString(1);
    }

    
    public void setMatl_Desc(java.lang.String Matl_Desc) {
        baseTypeData().setElementValue(2, Matl_Desc);
    }

    
    public void setLangu(java.lang.String Langu) {
        baseTypeData().setElementValue(0, Langu);
    }

    
    public MetaData metadata() {
        return metadata;
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  Bapi_Makt_GaType parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Bapi_Makt_GaType parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMatl_Desc() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getLangu() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getLangu_Iso() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
    }

}
