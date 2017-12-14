package hmh.sap.rfc;


public class Z_Rfc_Find_Transaction_Input extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1329338318014L) ;

    private  Z_Rfc_Find_Transaction_Input.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.WSDL_MESSAGE_FOR_JCO, "urn:sap-com:document:sap:rfc:functions", "Z_RFC_FIND_TRANSACTION.Input", 8, 0, hmh.sap.rfc.Z_Rfc_Find_Transaction_Input.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "Z_RFC_FIND_TRANSACTION", 0, 0, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">RFC for Find Transaction</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:package>ZVSL</ifr:package><ifr:akhNode>HLA0009600</ifr:akhNode><ifr:released>no</ifr:released><ifr:outbound>false</ifr:outbound><ifr:synchronous>true</ifr:synchronous><ifr:asynchronous>false</ifr:asynchronous><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2></ifr:properties><ifr:definition /></ifr:container>");
        descriptorSetElementProperties(descriptor, 0, "I_INPUT", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:ZVFINDTRANS_IP", "urn:sap-com:document:sap:rfc:functions", false, 1, 1, false, null, "I_Input", hmh.sap.rfc.Zvfindtrans_IpType.class, new hmh.sap.rfc.Zvfindtrans_IpType(), new java.lang.String[][]{}, "I_INPUT", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"I_INPUT\"><ifr:descriptor><ifr:description language=\"en\">I/P parameters for find transaction method</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZVFINDTRANS_IP\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZVFINDTRANS_IP\" /></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 1, "T_SUBS", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "T_Subs", hmh.sap.rfc.util.ZvsubscriptionType_List.class, new hmh.sap.rfc.ZvsubscriptionType(), new java.lang.String[][]{}, "T_SUBS", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"T_SUBS\"><ifr:descriptor><ifr:description language=\"en\">Subscription</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZVSUBSCRIPTION\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZVSUBSCRIPTION\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 2, "T_SREP", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "T_Srep", hmh.sap.rfc.util.ZvsrType_List.class, new hmh.sap.rfc.ZvsrType(), new java.lang.String[][]{}, "T_SREP", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"T_SREP\"><ifr:descriptor><ifr:description language=\"en\">Sales Representative</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZVSR\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZVSR\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 3, "T_SALES_H", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "T_Sales_H", hmh.sap.rfc.util.Zvsales_Order_HType_List.class, new hmh.sap.rfc.Zvsales_Order_HType(), new java.lang.String[][]{}, "T_SALES_H", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"T_SALES_H\"><ifr:descriptor><ifr:description language=\"en\">O/P  Sales order header</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZVSALES_ORDER_H\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZVSALES_ORDER_H\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 4, "T_SALES_D", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "T_Sales_D", hmh.sap.rfc.util.Zvso_LineitemType_List.class, new hmh.sap.rfc.Zvso_LineitemType(), new java.lang.String[][]{}, "T_SALES_D", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"T_SALES_D\"><ifr:descriptor><ifr:description language=\"en\">Sales order line items</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZVSO_LINEITEM\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZVSO_LINEITEM\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 5, "T_PARVW", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "T_Parvw", hmh.sap.rfc.util.ZvparvwType_List.class, new hmh.sap.rfc.ZvparvwType(), new java.lang.String[][]{}, "T_PARVW", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"T_PARVW\"><ifr:descriptor><ifr:description language=\"en\">I/P Partner functions to Find transaction RFC</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZVPARVW\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZVPARVW\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 6, "T_EMAIL", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "T_Email", hmh.sap.rfc.util.ZvemailType_List.class, new hmh.sap.rfc.ZvemailType(), new java.lang.String[][]{}, "T_EMAIL", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"T_EMAIL\"><ifr:descriptor><ifr:description language=\"en\">Email Addresses of customers</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZVEMAIL\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZVEMAIL\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 7, "T_ADDR", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "T_Addr", hmh.sap.rfc.util.ZvaddrType_List.class, new hmh.sap.rfc.ZvaddrType(), new java.lang.String[][]{}, "T_ADDR", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"T_ADDR\"><ifr:descriptor><ifr:description language=\"en\">Address</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZVADDR\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZVADDR\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        staticDescriptor = descriptor;
    }
    protected  Z_Rfc_Find_Transaction_Input (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    public  Z_Rfc_Find_Transaction_Input () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public hmh.sap.rfc.util.ZvparvwType_List get_as_listT_Parvw() {
        return (hmh.sap.rfc.util.ZvparvwType_List)baseTypeData().getElementValue(5);
    }

    
    public void setT_Subs(hmh.sap.rfc.util.ZvsubscriptionType_List T_Subs) {
        baseTypeData().setElementValue(1, T_Subs);
    }

    
    public hmh.sap.rfc.Zvfindtrans_IpType getI_Input() {
        return (hmh.sap.rfc.Zvfindtrans_IpType)baseTypeData().getElementValue(0);
    }

    
    public hmh.sap.rfc.Zvso_LineitemType[] getT_Sales_D() {
        hmh.sap.rfc.util.Zvso_LineitemType_List i$ = (hmh.sap.rfc.util.Zvso_LineitemType_List)baseTypeData().getElementValue(4);
        if ( i$ == null){return null;}
        return  i$.toArrayZvso_LineitemType();
    }

    
    public hmh.sap.rfc.util.Zvso_LineitemType_List get_as_listT_Sales_D() {
        return (hmh.sap.rfc.util.Zvso_LineitemType_List)baseTypeData().getElementValue(4);
    }

    
    public hmh.sap.rfc.Zvsales_Order_HType[] getT_Sales_H() {
        hmh.sap.rfc.util.Zvsales_Order_HType_List i$ = (hmh.sap.rfc.util.Zvsales_Order_HType_List)baseTypeData().getElementValue(3);
        if ( i$ == null){return null;}
        return  i$.toArrayZvsales_Order_HType();
    }

    
    public hmh.sap.rfc.util.Zvsales_Order_HType_List get_as_listT_Sales_H() {
        return (hmh.sap.rfc.util.Zvsales_Order_HType_List)baseTypeData().getElementValue(3);
    }

    
    public hmh.sap.rfc.ZvsrType[] getT_Srep() {
        hmh.sap.rfc.util.ZvsrType_List i$ = (hmh.sap.rfc.util.ZvsrType_List)baseTypeData().getElementValue(2);
        if ( i$ == null){return null;}
        return  i$.toArrayZvsrType();
    }

    
    public void setI_Input(hmh.sap.rfc.Zvfindtrans_IpType I_Input) {
        baseTypeData().setElementValue(0, I_Input);
    }

    
    public MetaData metadataZ_Rfc_Find_Transaction_Input() {
        return metadata;
    }

    
    public void setT_Srep(hmh.sap.rfc.util.ZvsrType_List T_Srep) {
        baseTypeData().setElementValue(2, T_Srep);
    }

    
    public void setT_Parvw(hmh.sap.rfc.util.ZvparvwType_List T_Parvw) {
        baseTypeData().setElementValue(5, T_Parvw);
    }

    
    public hmh.sap.rfc.ZvemailType[] getT_Email() {
        hmh.sap.rfc.util.ZvemailType_List i$ = (hmh.sap.rfc.util.ZvemailType_List)baseTypeData().getElementValue(6);
        if ( i$ == null){return null;}
        return  i$.toArrayZvemailType();
    }

    
    public void setT_Subs(hmh.sap.rfc.ZvsubscriptionType[] T_Subs) {
        baseTypeData().setElementValue(1, new hmh.sap.rfc.util.ZvsubscriptionType_List());
        hmh.sap.rfc.util.ZvsubscriptionType_List list$ = get_as_listT_Subs();
        for (int  i$ = 0; i$ < T_Subs.length; i$++){
         list$.addZvsubscriptionType(T_Subs[ i$]);
        }
    }

    
    public hmh.sap.rfc.ZvparvwType[] getT_Parvw() {
        hmh.sap.rfc.util.ZvparvwType_List i$ = (hmh.sap.rfc.util.ZvparvwType_List)baseTypeData().getElementValue(5);
        if ( i$ == null){return null;}
        return  i$.toArrayZvparvwType();
    }

    
    public void setT_Addr(hmh.sap.rfc.ZvaddrType[] T_Addr) {
        baseTypeData().setElementValue(7, new hmh.sap.rfc.util.ZvaddrType_List());
        hmh.sap.rfc.util.ZvaddrType_List list$ = get_as_listT_Addr();
        for (int  i$ = 0; i$ < T_Addr.length; i$++){
         list$.addZvaddrType(T_Addr[ i$]);
        }
    }

    
    public void setT_Sales_D(hmh.sap.rfc.Zvso_LineitemType[] T_Sales_D) {
        baseTypeData().setElementValue(4, new hmh.sap.rfc.util.Zvso_LineitemType_List());
        hmh.sap.rfc.util.Zvso_LineitemType_List list$ = get_as_listT_Sales_D();
        for (int  i$ = 0; i$ < T_Sales_D.length; i$++){
         list$.addZvso_LineitemType(T_Sales_D[ i$]);
        }
    }

    
    public hmh.sap.rfc.util.ZvemailType_List get_as_listT_Email() {
        return (hmh.sap.rfc.util.ZvemailType_List)baseTypeData().getElementValue(6);
    }

    
    public hmh.sap.rfc.util.ZvaddrType_List get_as_listT_Addr() {
        return (hmh.sap.rfc.util.ZvaddrType_List)baseTypeData().getElementValue(7);
    }

    
    public void setT_Sales_H(hmh.sap.rfc.util.Zvsales_Order_HType_List T_Sales_H) {
        baseTypeData().setElementValue(3, T_Sales_H);
    }

    
    public hmh.sap.rfc.util.ZvsrType_List get_as_listT_Srep() {
        return (hmh.sap.rfc.util.ZvsrType_List)baseTypeData().getElementValue(2);
    }

    
    public void setT_Sales_D(hmh.sap.rfc.util.Zvso_LineitemType_List T_Sales_D) {
        baseTypeData().setElementValue(4, T_Sales_D);
    }

    
    public void setT_Parvw(hmh.sap.rfc.ZvparvwType[] T_Parvw) {
        baseTypeData().setElementValue(5, new hmh.sap.rfc.util.ZvparvwType_List());
        hmh.sap.rfc.util.ZvparvwType_List list$ = get_as_listT_Parvw();
        for (int  i$ = 0; i$ < T_Parvw.length; i$++){
         list$.addZvparvwType(T_Parvw[ i$]);
        }
    }

    
    public void setT_Email(hmh.sap.rfc.ZvemailType[] T_Email) {
        baseTypeData().setElementValue(6, new hmh.sap.rfc.util.ZvemailType_List());
        hmh.sap.rfc.util.ZvemailType_List list$ = get_as_listT_Email();
        for (int  i$ = 0; i$ < T_Email.length; i$++){
         list$.addZvemailType(T_Email[ i$]);
        }
    }

    
    public void setT_Srep(hmh.sap.rfc.ZvsrType[] T_Srep) {
        baseTypeData().setElementValue(2, new hmh.sap.rfc.util.ZvsrType_List());
        hmh.sap.rfc.util.ZvsrType_List list$ = get_as_listT_Srep();
        for (int  i$ = 0; i$ < T_Srep.length; i$++){
         list$.addZvsrType(T_Srep[ i$]);
        }
    }

    
    public void setT_Sales_H(hmh.sap.rfc.Zvsales_Order_HType[] T_Sales_H) {
        baseTypeData().setElementValue(3, new hmh.sap.rfc.util.Zvsales_Order_HType_List());
        hmh.sap.rfc.util.Zvsales_Order_HType_List list$ = get_as_listT_Sales_H();
        for (int  i$ = 0; i$ < T_Sales_H.length; i$++){
         list$.addZvsales_Order_HType(T_Sales_H[ i$]);
        }
    }

    
    public void setT_Email(hmh.sap.rfc.util.ZvemailType_List T_Email) {
        baseTypeData().setElementValue(6, T_Email);
    }

    
    public hmh.sap.rfc.util.ZvsubscriptionType_List get_as_listT_Subs() {
        return (hmh.sap.rfc.util.ZvsubscriptionType_List)baseTypeData().getElementValue(1);
    }

    
    public hmh.sap.rfc.ZvsubscriptionType[] getT_Subs() {
        hmh.sap.rfc.util.ZvsubscriptionType_List i$ = (hmh.sap.rfc.util.ZvsubscriptionType_List)baseTypeData().getElementValue(1);
        if ( i$ == null){return null;}
        return  i$.toArrayZvsubscriptionType();
    }

    
    public void setT_Addr(hmh.sap.rfc.util.ZvaddrType_List T_Addr) {
        baseTypeData().setElementValue(7, T_Addr);
    }

    
    public hmh.sap.rfc.ZvaddrType[] getT_Addr() {
        hmh.sap.rfc.util.ZvaddrType_List i$ = (hmh.sap.rfc.util.ZvaddrType_List)baseTypeData().getElementValue(7);
        if ( i$ == null){return null;}
        return  i$.toArrayZvaddrType();
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  Z_Rfc_Find_Transaction_Input parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Z_Rfc_Find_Transaction_Input parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getT_Sales_D() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(4);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getI_Input() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getT_Sales_H() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getT_Subs() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getT_Email() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(6);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getT_Addr() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(7);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getT_Parvw() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(5);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getT_Srep() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
    }

}
