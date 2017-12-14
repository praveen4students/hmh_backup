package hmh.sap.rfc;


public class BapiparexType extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1354127028470L) ;

    private  BapiparexType.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.XSDL_COMPLEX_TYPE, "urn:sap-com:document:sap:rfc:functions", "BAPIPAREX", 5, 0, hmh.sap.rfc.BapiparexType.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "BAPIPAREX", 990, 1980, -1, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"BAPIPAREX\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Ref. structure for BAPI parameter ExtensionIn/ExtensionOut</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>110</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>990</ifr:internalLength1><ifr:internalLength2>1980</ifr:internalLength2></ifr:definition></ifr:container></s0:type>");
        descriptorSetElementProperties(descriptor, 0, "STRUCTURE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Structure", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "30"}}, "STRUCTURE", 0, 0, -1, 30, 60, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"STRUCTURE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Structure name of  BAPI table extension</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>0</ifr:offset1><ifr:offset2>0</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"TE_STRUC\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>30</ifr:length><ifr:internalLength1>30</ifr:internalLength1><ifr:internalLength2>60</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>30</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 1, "VALUEPART1", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Valuepart1", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "240"}}, "VALUEPART1", 30, 60, -1, 240, 480, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"VALUEPART1\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Data part of BAPI extension parameter</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>30</ifr:offset1><ifr:offset2>60</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VALUEPART\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>240</ifr:length><ifr:internalLength1>240</ifr:internalLength1><ifr:internalLength2>480</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>240</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 2, "VALUEPART2", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Valuepart2", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "240"}}, "VALUEPART2", 270, 540, -1, 240, 480, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"VALUEPART2\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Data part of BAPI extension parameter</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>270</ifr:offset1><ifr:offset2>540</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VALUEPART\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>240</ifr:length><ifr:internalLength1>240</ifr:internalLength1><ifr:internalLength2>480</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>240</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 3, "VALUEPART3", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Valuepart3", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "240"}}, "VALUEPART3", 510, 1020, -1, 240, 480, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"VALUEPART3\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Data part of BAPI extension parameter</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>510</ifr:offset1><ifr:offset2>1020</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VALUEPART\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>240</ifr:length><ifr:internalLength1>240</ifr:internalLength1><ifr:internalLength2>480</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>240</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 4, "VALUEPART4", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Valuepart4", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "240"}}, "VALUEPART4", 750, 1500, -1, 240, 480, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"VALUEPART4\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Data part of BAPI extension parameter</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>750</ifr:offset1><ifr:offset2>1500</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"VALUEPART\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>240</ifr:length><ifr:internalLength1>240</ifr:internalLength1><ifr:internalLength2>480</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>240</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        staticDescriptor = descriptor;
    }
    public  BapiparexType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    protected  BapiparexType (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    
    public java.lang.String getValuepart3() {
        return (java.lang.String)baseTypeData().getElementValueAsString(3);
    }

    
    public java.lang.String getValuepart4() {
        return (java.lang.String)baseTypeData().getElementValueAsString(4);
    }

    
    public void setValuepart3(java.lang.String Valuepart3) {
        baseTypeData().setElementValue(3, Valuepart3);
    }

    
    public void setValuepart2(java.lang.String Valuepart2) {
        baseTypeData().setElementValue(2, Valuepart2);
    }

    
    public void setStructure(java.lang.String Structure) {
        baseTypeData().setElementValue(0, Structure);
    }

    
    public java.lang.String getValuepart1() {
        return (java.lang.String)baseTypeData().getElementValueAsString(1);
    }

    
    public void setValuepart1(java.lang.String Valuepart1) {
        baseTypeData().setElementValue(1, Valuepart1);
    }

    
    public MetaData metadata() {
        return metadata;
    }

    
    public void setValuepart4(java.lang.String Valuepart4) {
        baseTypeData().setElementValue(4, Valuepart4);
    }

    
    public java.lang.String getValuepart2() {
        return (java.lang.String)baseTypeData().getElementValueAsString(2);
    }

    
    public java.lang.String getStructure() {
        return (java.lang.String)baseTypeData().getElementValueAsString(0);
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  BapiparexType parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (BapiparexType parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getValuepart3() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getValuepart4() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(4);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getValuepart1() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getValuepart2() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getStructure() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
    }

}
