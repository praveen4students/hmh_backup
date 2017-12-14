package hmh.sap.rfc;


public class Z_Rfc_Get_Cust_Relationships_Output extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1329337766947L) ;

    private  Z_Rfc_Get_Cust_Relationships_Output.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.WSDL_MESSAGE_FOR_JCO, "urn:sap-com:document:sap:rfc:functions", "Z_RFC_GET_CUST_RELATIONSHIPS.Output", 4, 0, hmh.sap.rfc.Z_Rfc_Get_Cust_Relationships_Output.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "Z_RFC_GET_CUST_RELATIONSHIPS", 0, 0, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Web Service Customer Relationships</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:package>ZVSL</ifr:package><ifr:akhNode>HLA0009600</ifr:akhNode><ifr:released>no</ifr:released><ifr:outbound>false</ifr:outbound><ifr:synchronous>true</ifr:synchronous><ifr:asynchronous>false</ifr:asynchronous><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2></ifr:properties><ifr:definition /></ifr:container>");
        descriptorSetElementProperties(descriptor, 0, "E_STATUS", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "E_Status", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "E_STATUS", 0, 0, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.EXPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"E_STATUS\"><ifr:descriptor><ifr:description language=\"en\">BDC   status</ifr:description></ifr:descriptor><ifr:definition><ifr:field name=\"BDCTH.STATE\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>1</ifr:offset1><ifr:offset2>2</ifr:offset2></ifr:properties></ifr:field><ifr:scalarType name=\"BDC_STATE\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>out</ifr:direction><ifr:class>export</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 1, "T_RELATION", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "T_Relation", hmh.sap.rfc.util.ZvrelationType_List.class, new hmh.sap.rfc.ZvrelationType(), new java.lang.String[][]{}, "T_RELATION", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"T_RELATION\"><ifr:descriptor><ifr:description language=\"en\">Structure for Relationships of customers</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZVRELATION\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZVRELATION\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 2, "T_CUSTOMERS", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "T_Customers", hmh.sap.rfc.util.ZvcustomersType_List.class, new hmh.sap.rfc.ZvcustomersType(), new java.lang.String[][]{}, "T_CUSTOMERS", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"T_CUSTOMERS\"><ifr:descriptor><ifr:description language=\"en\">Customer ID</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZVCUSTOMERS\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZVCUSTOMERS\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 3, "T_BDCMSGCOLL", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "T_Bdcmsgcoll", hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List.class, new hmh.sap.rfc.Zbdcmsgcoll_RfcType(), new java.lang.String[][]{}, "T_BDCMSGCOLL", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"T_BDCMSGCOLL\"><ifr:descriptor><ifr:description language=\"en\">Collecting messages in the SAP System</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZBDCMSGCOLL_RFC\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZBDCMSGCOLL_RFC\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        staticDescriptor = descriptor;
    }
    public  Z_Rfc_Get_Cust_Relationships_Output () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    protected  Z_Rfc_Get_Cust_Relationships_Output (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    
    public void setT_Customers(hmh.sap.rfc.util.ZvcustomersType_List T_Customers) {
        baseTypeData().setElementValue(2, T_Customers);
    }

    
    public void setT_Bdcmsgcoll(hmh.sap.rfc.Zbdcmsgcoll_RfcType[] T_Bdcmsgcoll) {
        baseTypeData().setElementValue(3, new hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List());
        hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List list$ = get_as_listT_Bdcmsgcoll();
        for (int  i$ = 0; i$ < T_Bdcmsgcoll.length; i$++){
         list$.addZbdcmsgcoll_RfcType(T_Bdcmsgcoll[ i$]);
        }
    }

    
    public void setT_Relation(hmh.sap.rfc.util.ZvrelationType_List T_Relation) {
        baseTypeData().setElementValue(1, T_Relation);
    }

    
    public void setT_Relation(hmh.sap.rfc.ZvrelationType[] T_Relation) {
        baseTypeData().setElementValue(1, new hmh.sap.rfc.util.ZvrelationType_List());
        hmh.sap.rfc.util.ZvrelationType_List list$ = get_as_listT_Relation();
        for (int  i$ = 0; i$ < T_Relation.length; i$++){
         list$.addZvrelationType(T_Relation[ i$]);
        }
    }

    
    public hmh.sap.rfc.Zbdcmsgcoll_RfcType[] getT_Bdcmsgcoll() {
        hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List i$ = (hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List)baseTypeData().getElementValue(3);
        if ( i$ == null){return null;}
        return  i$.toArrayZbdcmsgcoll_RfcType();
    }

    
    public hmh.sap.rfc.util.ZvrelationType_List get_as_listT_Relation() {
        return (hmh.sap.rfc.util.ZvrelationType_List)baseTypeData().getElementValue(1);
    }

    
    public void setT_Customers(hmh.sap.rfc.ZvcustomersType[] T_Customers) {
        baseTypeData().setElementValue(2, new hmh.sap.rfc.util.ZvcustomersType_List());
        hmh.sap.rfc.util.ZvcustomersType_List list$ = get_as_listT_Customers();
        for (int  i$ = 0; i$ < T_Customers.length; i$++){
         list$.addZvcustomersType(T_Customers[ i$]);
        }
    }

    
    public MetaData metadataZ_Rfc_Get_Cust_Relationships_Output() {
        return metadata;
    }

    
    public hmh.sap.rfc.ZvrelationType[] getT_Relation() {
        hmh.sap.rfc.util.ZvrelationType_List i$ = (hmh.sap.rfc.util.ZvrelationType_List)baseTypeData().getElementValue(1);
        if ( i$ == null){return null;}
        return  i$.toArrayZvrelationType();
    }

    
    public hmh.sap.rfc.util.ZvcustomersType_List get_as_listT_Customers() {
        return (hmh.sap.rfc.util.ZvcustomersType_List)baseTypeData().getElementValue(2);
    }

    
    public hmh.sap.rfc.ZvcustomersType[] getT_Customers() {
        hmh.sap.rfc.util.ZvcustomersType_List i$ = (hmh.sap.rfc.util.ZvcustomersType_List)baseTypeData().getElementValue(2);
        if ( i$ == null){return null;}
        return  i$.toArrayZvcustomersType();
    }

    
    public java.lang.String getE_Status() {
        return (java.lang.String)baseTypeData().getElementValueAsString(0);
    }

    
    public hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List get_as_listT_Bdcmsgcoll() {
        return (hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List)baseTypeData().getElementValue(3);
    }

    
    public void setE_Status(java.lang.String E_Status) {
        baseTypeData().setElementValue(0, E_Status);
    }

    
    public void setT_Bdcmsgcoll(hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List T_Bdcmsgcoll) {
        baseTypeData().setElementValue(3, T_Bdcmsgcoll);
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  Z_Rfc_Get_Cust_Relationships_Output parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Z_Rfc_Get_Cust_Relationships_Output parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getT_Relation() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getT_Customers() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getT_Bdcmsgcoll() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getE_Status() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
    }

}
