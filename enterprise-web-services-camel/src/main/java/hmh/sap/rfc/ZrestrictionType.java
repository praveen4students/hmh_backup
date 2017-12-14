package hmh.sap.rfc;


public class ZrestrictionType extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1343230299058L) ;

    private  ZrestrictionType.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.XSDL_COMPLEX_TYPE, "urn:sap-com:document:sap:rfc:functions", "ZRESTRICTION", 2, 0, hmh.sap.rfc.ZrestrictionType.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "ZRESTRICTION", 19, 38, -1, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"ZRESTRICTION\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Structure for Restriction</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>19</ifr:internalLength1><ifr:internalLength2>38</ifr:internalLength2></ifr:definition></ifr:container></s0:type>");
        descriptorSetElementProperties(descriptor, 0, "MATNR", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Matnr", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "18"}}, "MATNR", 0, 0, -1, 18, 36, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MATNR\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Material Number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>0</ifr:offset1><ifr:offset2>0</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MATNR\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>18</ifr:length><ifr:internalLength1>18</ifr:internalLength1><ifr:internalLength2>36</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>18</ifr:outputLength><ifr:conversionExit>MATN1</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 1, "RESTRICTED", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Restricted", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "RESTRICTED", 18, 36, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"RESTRICTED\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Character field length 1</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>18</ifr:offset1><ifr:offset2>36</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CHAR01\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        staticDescriptor = descriptor;
    }
    protected  ZrestrictionType (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    public  ZrestrictionType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public void setMatnr(java.lang.String Matnr) {
        baseTypeData().setElementValue(0, Matnr);
    }

    
    public java.lang.String getRestricted() {
        return (java.lang.String)baseTypeData().getElementValueAsString(1);
    }

    
    public void setRestricted(java.lang.String Restricted) {
        baseTypeData().setElementValue(1, Restricted);
    }

    
    public java.lang.String getMatnr() {
        return (java.lang.String)baseTypeData().getElementValueAsString(0);
    }

    
    public MetaData metadata() {
        return metadata;
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  ZrestrictionType parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (ZrestrictionType parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getRestricted() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMatnr() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
    }

}
