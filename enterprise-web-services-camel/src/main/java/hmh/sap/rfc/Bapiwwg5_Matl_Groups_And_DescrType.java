package hmh.sap.rfc;


public class Bapiwwg5_Matl_Groups_And_DescrType extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1335985769731L) ;

    private  Bapiwwg5_Matl_Groups_And_DescrType.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.XSDL_COMPLEX_TYPE, "urn:sap-com:document:sap:rfc:functions", "BAPIWWG5_MATL_GROUPS_AND_DESCR", 2, 0, hmh.sap.rfc.Bapiwwg5_Matl_Groups_And_DescrType.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "BAPIWWG5_MATL_GROUPS_AND_DESCR", 29, 58, -1, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"BAPIWWG5_MATL_GROUPS_AND_DESCR\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Structure for BAPI Output Table Matl Grp(s) and Descriptions</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>29</ifr:internalLength1><ifr:internalLength2>58</ifr:internalLength2></ifr:definition></ifr:container></s0:type>");
        descriptorSetElementProperties(descriptor, 0, "MATL_GROUP", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Matl_Group", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "9"}}, "MATL_GROUP", 0, 0, -1, 9, 18, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MATL_GROUP\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Material Group</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>0</ifr:offset1><ifr:offset2>0</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MATKL\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>9</ifr:length><ifr:internalLength1>9</ifr:internalLength1><ifr:internalLength2>18</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>9</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 1, "MG_DESCR_SHORT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Mg_Descr_Short", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "20"}}, "MG_DESCR_SHORT", 9, 18, -1, 20, 40, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MG_DESCR_SHORT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Description of material group</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>9</ifr:offset1><ifr:offset2>18</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"WGBEZ\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>20</ifr:length><ifr:internalLength1>20</ifr:internalLength1><ifr:internalLength2>40</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>20</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        staticDescriptor = descriptor;
    }
    protected  Bapiwwg5_Matl_Groups_And_DescrType (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    public  Bapiwwg5_Matl_Groups_And_DescrType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public java.lang.String getMatl_Group() {
        return (java.lang.String)baseTypeData().getElementValueAsString(0);
    }

    
    public java.lang.String getMg_Descr_Short() {
        return (java.lang.String)baseTypeData().getElementValueAsString(1);
    }

    
    public void setMg_Descr_Short(java.lang.String Mg_Descr_Short) {
        baseTypeData().setElementValue(1, Mg_Descr_Short);
    }

    
    public void setMatl_Group(java.lang.String Matl_Group) {
        baseTypeData().setElementValue(0, Matl_Group);
    }

    
    public MetaData metadata() {
        return metadata;
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  Bapiwwg5_Matl_Groups_And_DescrType parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Bapiwwg5_Matl_Groups_And_DescrType parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMatl_Group() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getMg_Descr_Short() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
    }

}
