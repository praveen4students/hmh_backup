package hmh.sap.rfc;


public class Z_Rfc_Get_Cust_Details_Input extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1329337766952L) ;

    private  Z_Rfc_Get_Cust_Details_Input.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.WSDL_MESSAGE_FOR_JCO, "urn:sap-com:document:sap:rfc:functions", "Z_RFC_GET_CUST_DETAILS.Input", 5, 0, hmh.sap.rfc.Z_Rfc_Get_Cust_Details_Input.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "Z_RFC_GET_CUST_DETAILS", 0, 0, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Get Web Service Customer Details</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:package>ZVSL</ifr:package><ifr:akhNode>HLA0009600</ifr:akhNode><ifr:released>no</ifr:released><ifr:outbound>false</ifr:outbound><ifr:synchronous>true</ifr:synchronous><ifr:asynchronous>false</ifr:asynchronous><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2></ifr:properties><ifr:definition /></ifr:container>");
        descriptorSetElementProperties(descriptor, 0, "T_GETCUST", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "T_Getcust", hmh.sap.rfc.util.ZvgetcustType_List.class, new hmh.sap.rfc.ZvgetcustType(), new java.lang.String[][]{}, "T_GETCUST", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"T_GETCUST\"><ifr:descriptor><ifr:description language=\"en\">Customer Key fields</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZVGETCUST\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZVGETCUST\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 1, "T_EMAIL", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "T_Email", hmh.sap.rfc.util.Zvemail2Type_List.class, new hmh.sap.rfc.Zvemail2Type(), new java.lang.String[][]{}, "T_EMAIL", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"T_EMAIL\"><ifr:descriptor><ifr:description language=\"en\">Email Addresses of customers</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZVEMAIL2\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZVEMAIL2\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 2, "T_DIVINFO", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "T_Divinfo", hmh.sap.rfc.util.ZvdivinfoType_List.class, new hmh.sap.rfc.ZvdivinfoType(), new java.lang.String[][]{}, "T_DIVINFO", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"T_DIVINFO\"><ifr:descriptor><ifr:description language=\"en\">Cutomer Division Information</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZVDIVINFO\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZVDIVINFO\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 3, "T_CUSTDETAILS", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "T_Custdetails", hmh.sap.rfc.util.ZvcustdetailsType_List.class, new hmh.sap.rfc.ZvcustdetailsType(), new java.lang.String[][]{}, "T_CUSTDETAILS", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"T_CUSTDETAILS\"><ifr:descriptor><ifr:description language=\"en\">Web Service Customer details</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZVCUSTDETAILS\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZVCUSTDETAILS\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 4, "T_BDCMSGCOLL", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "T_Bdcmsgcoll", hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List.class, new hmh.sap.rfc.Zbdcmsgcoll_RfcType(), new java.lang.String[][]{}, "T_BDCMSGCOLL", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"T_BDCMSGCOLL\"><ifr:descriptor><ifr:description language=\"en\">Collecting messages in the SAP System</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZBDCMSGCOLL_RFC\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZBDCMSGCOLL_RFC\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        staticDescriptor = descriptor;
    }
    public  Z_Rfc_Get_Cust_Details_Input () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    protected  Z_Rfc_Get_Cust_Details_Input (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    
    public hmh.sap.rfc.util.Zvemail2Type_List get_as_listT_Email() {
        return (hmh.sap.rfc.util.Zvemail2Type_List)baseTypeData().getElementValue(1);
    }

    
    public hmh.sap.rfc.ZvcustdetailsType[] getT_Custdetails() {
        hmh.sap.rfc.util.ZvcustdetailsType_List i$ = (hmh.sap.rfc.util.ZvcustdetailsType_List)baseTypeData().getElementValue(3);
        if ( i$ == null){return null;}
        return  i$.toArrayZvcustdetailsType();
    }

    
    public void setT_Bdcmsgcoll(hmh.sap.rfc.Zbdcmsgcoll_RfcType[] T_Bdcmsgcoll) {
        baseTypeData().setElementValue(4, new hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List());
        hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List list$ = get_as_listT_Bdcmsgcoll();
        for (int  i$ = 0; i$ < T_Bdcmsgcoll.length; i$++){
         list$.addZbdcmsgcoll_RfcType(T_Bdcmsgcoll[ i$]);
        }
    }

    
    public hmh.sap.rfc.Zbdcmsgcoll_RfcType[] getT_Bdcmsgcoll() {
        hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List i$ = (hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List)baseTypeData().getElementValue(4);
        if ( i$ == null){return null;}
        return  i$.toArrayZbdcmsgcoll_RfcType();
    }

    
    public void setT_Email(hmh.sap.rfc.Zvemail2Type[] T_Email) {
        baseTypeData().setElementValue(1, new hmh.sap.rfc.util.Zvemail2Type_List());
        hmh.sap.rfc.util.Zvemail2Type_List list$ = get_as_listT_Email();
        for (int  i$ = 0; i$ < T_Email.length; i$++){
         list$.addZvemail2Type(T_Email[ i$]);
        }
    }

    
    public void setT_Getcust(hmh.sap.rfc.ZvgetcustType[] T_Getcust) {
        baseTypeData().setElementValue(0, new hmh.sap.rfc.util.ZvgetcustType_List());
        hmh.sap.rfc.util.ZvgetcustType_List list$ = get_as_listT_Getcust();
        for (int  i$ = 0; i$ < T_Getcust.length; i$++){
         list$.addZvgetcustType(T_Getcust[ i$]);
        }
    }

    
    public void setT_Custdetails(hmh.sap.rfc.util.ZvcustdetailsType_List T_Custdetails) {
        baseTypeData().setElementValue(3, T_Custdetails);
    }

    
    public hmh.sap.rfc.util.ZvgetcustType_List get_as_listT_Getcust() {
        return (hmh.sap.rfc.util.ZvgetcustType_List)baseTypeData().getElementValue(0);
    }

    
    public void setT_Getcust(hmh.sap.rfc.util.ZvgetcustType_List T_Getcust) {
        baseTypeData().setElementValue(0, T_Getcust);
    }

    
    public void setT_Divinfo(hmh.sap.rfc.util.ZvdivinfoType_List T_Divinfo) {
        baseTypeData().setElementValue(2, T_Divinfo);
    }

    
    public void setT_Custdetails(hmh.sap.rfc.ZvcustdetailsType[] T_Custdetails) {
        baseTypeData().setElementValue(3, new hmh.sap.rfc.util.ZvcustdetailsType_List());
        hmh.sap.rfc.util.ZvcustdetailsType_List list$ = get_as_listT_Custdetails();
        for (int  i$ = 0; i$ < T_Custdetails.length; i$++){
         list$.addZvcustdetailsType(T_Custdetails[ i$]);
        }
    }

    
    public hmh.sap.rfc.ZvdivinfoType[] getT_Divinfo() {
        hmh.sap.rfc.util.ZvdivinfoType_List i$ = (hmh.sap.rfc.util.ZvdivinfoType_List)baseTypeData().getElementValue(2);
        if ( i$ == null){return null;}
        return  i$.toArrayZvdivinfoType();
    }

    
    public hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List get_as_listT_Bdcmsgcoll() {
        return (hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List)baseTypeData().getElementValue(4);
    }

    
    public hmh.sap.rfc.Zvemail2Type[] getT_Email() {
        hmh.sap.rfc.util.Zvemail2Type_List i$ = (hmh.sap.rfc.util.Zvemail2Type_List)baseTypeData().getElementValue(1);
        if ( i$ == null){return null;}
        return  i$.toArrayZvemail2Type();
    }

    
    public hmh.sap.rfc.util.ZvcustdetailsType_List get_as_listT_Custdetails() {
        return (hmh.sap.rfc.util.ZvcustdetailsType_List)baseTypeData().getElementValue(3);
    }

    
    public MetaData metadataZ_Rfc_Get_Cust_Details_Input() {
        return metadata;
    }

    
    public void setT_Bdcmsgcoll(hmh.sap.rfc.util.Zbdcmsgcoll_RfcType_List T_Bdcmsgcoll) {
        baseTypeData().setElementValue(4, T_Bdcmsgcoll);
    }

    
    public void setT_Email(hmh.sap.rfc.util.Zvemail2Type_List T_Email) {
        baseTypeData().setElementValue(1, T_Email);
    }

    
    public hmh.sap.rfc.util.ZvdivinfoType_List get_as_listT_Divinfo() {
        return (hmh.sap.rfc.util.ZvdivinfoType_List)baseTypeData().getElementValue(2);
    }

    
    public hmh.sap.rfc.ZvgetcustType[] getT_Getcust() {
        hmh.sap.rfc.util.ZvgetcustType_List i$ = (hmh.sap.rfc.util.ZvgetcustType_List)baseTypeData().getElementValue(0);
        if ( i$ == null){return null;}
        return  i$.toArrayZvgetcustType();
    }

    
    public void setT_Divinfo(hmh.sap.rfc.ZvdivinfoType[] T_Divinfo) {
        baseTypeData().setElementValue(2, new hmh.sap.rfc.util.ZvdivinfoType_List());
        hmh.sap.rfc.util.ZvdivinfoType_List list$ = get_as_listT_Divinfo();
        for (int  i$ = 0; i$ < T_Divinfo.length; i$++){
         list$.addZvdivinfoType(T_Divinfo[ i$]);
        }
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  Z_Rfc_Get_Cust_Details_Input parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Z_Rfc_Get_Cust_Details_Input parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getT_Custdetails() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getT_Bdcmsgcoll() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(4);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getT_Divinfo() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getT_Email() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getT_Getcust() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
    }

}
