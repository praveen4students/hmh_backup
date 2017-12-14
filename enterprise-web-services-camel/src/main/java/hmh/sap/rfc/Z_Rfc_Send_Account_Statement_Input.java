package hmh.sap.rfc;


public class Z_Rfc_Send_Account_Statement_Input extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1326920827674L) ;

    private  Z_Rfc_Send_Account_Statement_Input.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.WSDL_MESSAGE_FOR_JCO, "urn:sap-com:document:sap:rfc:functions", "Z_RFC_SEND_ACCOUNT_STATEMENT.Input", 5, 0, hmh.sap.rfc.Z_Rfc_Send_Account_Statement_Input.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "Z_RFC_SEND_ACCOUNT_STATEMENT", 0, 0, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Customer Care</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:package>ZVBD</ifr:package><ifr:akhNode>HLA0009600</ifr:akhNode><ifr:released>no</ifr:released><ifr:outbound>false</ifr:outbound><ifr:synchronous>true</ifr:synchronous><ifr:asynchronous>false</ifr:asynchronous><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2></ifr:properties><ifr:definition /></ifr:container>");
        descriptorSetElementProperties(descriptor, 0, "BILL_TO_CUSTOMER", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 1, 1, false, null, "Bill_To_Customer", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "BILL_TO_CUSTOMER", 0, 0, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"BILL_TO_CUSTOMER\"><ifr:descriptor><ifr:description language=\"en\">Customer</ifr:description></ifr:descriptor><ifr:definition><ifr:scalarType name=\"KUNNR\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 1, "EMAIL_SUBJECT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 1, 1, false, null, "Email_Subject", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "50"}}, "EMAIL_SUBJECT", 0, 0, -1, 50, 100, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"EMAIL_SUBJECT\"><ifr:descriptor><ifr:description language=\"en\">Comment</ifr:description></ifr:descriptor><ifr:definition><ifr:field name=\"SODOCCHGI1.OBJ_DESCR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>12</ifr:offset1><ifr:offset2>24</ifr:offset2></ifr:properties></ifr:field><ifr:scalarType name=\"SO_OBJ_DES\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>50</ifr:length><ifr:internalLength1>50</ifr:internalLength1><ifr:internalLength2>100</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>50</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 2, "EMAIL_TEXT", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Email_Text", hmh.sap.rfc.util.Solisti1Type_List.class, new hmh.sap.rfc.Solisti1Type(), new java.lang.String[][]{}, "EMAIL_TEXT", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"EMAIL_TEXT\"><ifr:descriptor><ifr:description language=\"en\">Email text</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"SOLISTI1\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=SOLISTI1\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 3, "EMAIL_ID_TO", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Email_Id_To", hmh.sap.rfc.util.ZemailType_List.class, new hmh.sap.rfc.ZemailType(), new java.lang.String[][]{}, "EMAIL_ID_TO", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"EMAIL_ID_TO\"><ifr:descriptor><ifr:description language=\"en\">Email address TO</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZEMAIL\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZEMAIL\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 4, "EMAIL_ID_CC", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Email_Id_Cc", hmh.sap.rfc.util.ZemailType_List.class, new hmh.sap.rfc.ZemailType(), new java.lang.String[][]{}, "EMAIL_ID_CC", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"EMAIL_ID_CC\"><ifr:descriptor><ifr:description language=\"en\">Email address CC</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZEMAIL\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZEMAIL\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        staticDescriptor = descriptor;
    }
    protected  Z_Rfc_Send_Account_Statement_Input (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    public  Z_Rfc_Send_Account_Statement_Input () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public void setEmail_Text(hmh.sap.rfc.Solisti1Type[] Email_Text) {
        baseTypeData().setElementValue(2, new hmh.sap.rfc.util.Solisti1Type_List());
        hmh.sap.rfc.util.Solisti1Type_List list$ = get_as_listEmail_Text();
        for (int  i$ = 0; i$ < Email_Text.length; i$++){
         list$.addSolisti1Type(Email_Text[ i$]);
        }
    }

    
    public MetaData metadataZ_Rfc_Send_Account_Statement_Input() {
        return metadata;
    }

    
    public java.lang.String getEmail_Subject() {
        return (java.lang.String)baseTypeData().getElementValueAsString(1);
    }

    
    public hmh.sap.rfc.util.Solisti1Type_List get_as_listEmail_Text() {
        return (hmh.sap.rfc.util.Solisti1Type_List)baseTypeData().getElementValue(2);
    }

    
    public void setEmail_Id_To(hmh.sap.rfc.util.ZemailType_List Email_Id_To) {
        baseTypeData().setElementValue(3, Email_Id_To);
    }

    
    public hmh.sap.rfc.ZemailType[] getEmail_Id_Cc() {
        hmh.sap.rfc.util.ZemailType_List i$ = (hmh.sap.rfc.util.ZemailType_List)baseTypeData().getElementValue(4);
        if ( i$ == null){return null;}
        return  i$.toArrayZemailType();
    }

    
    public hmh.sap.rfc.util.ZemailType_List get_as_listEmail_Id_To() {
        return (hmh.sap.rfc.util.ZemailType_List)baseTypeData().getElementValue(3);
    }

    
    public void setEmail_Id_Cc(hmh.sap.rfc.ZemailType[] Email_Id_Cc) {
        baseTypeData().setElementValue(4, new hmh.sap.rfc.util.ZemailType_List());
        hmh.sap.rfc.util.ZemailType_List list$ = get_as_listEmail_Id_Cc();
        for (int  i$ = 0; i$ < Email_Id_Cc.length; i$++){
         list$.addZemailType(Email_Id_Cc[ i$]);
        }
    }

    
    public void setBill_To_Customer(java.lang.String Bill_To_Customer) {
        baseTypeData().setElementValue(0, Bill_To_Customer);
    }

    
    public void setEmail_Id_To(hmh.sap.rfc.ZemailType[] Email_Id_To) {
        baseTypeData().setElementValue(3, new hmh.sap.rfc.util.ZemailType_List());
        hmh.sap.rfc.util.ZemailType_List list$ = get_as_listEmail_Id_To();
        for (int  i$ = 0; i$ < Email_Id_To.length; i$++){
         list$.addZemailType(Email_Id_To[ i$]);
        }
    }

    
    public hmh.sap.rfc.util.ZemailType_List get_as_listEmail_Id_Cc() {
        return (hmh.sap.rfc.util.ZemailType_List)baseTypeData().getElementValue(4);
    }

    
    public hmh.sap.rfc.ZemailType[] getEmail_Id_To() {
        hmh.sap.rfc.util.ZemailType_List i$ = (hmh.sap.rfc.util.ZemailType_List)baseTypeData().getElementValue(3);
        if ( i$ == null){return null;}
        return  i$.toArrayZemailType();
    }

    
    public java.lang.String getBill_To_Customer() {
        return (java.lang.String)baseTypeData().getElementValueAsString(0);
    }

    
    public void setEmail_Text(hmh.sap.rfc.util.Solisti1Type_List Email_Text) {
        baseTypeData().setElementValue(2, Email_Text);
    }

    
    public void setEmail_Subject(java.lang.String Email_Subject) {
        baseTypeData().setElementValue(1, Email_Subject);
    }

    
    public hmh.sap.rfc.Solisti1Type[] getEmail_Text() {
        hmh.sap.rfc.util.Solisti1Type_List i$ = (hmh.sap.rfc.util.Solisti1Type_List)baseTypeData().getElementValue(2);
        if ( i$ == null){return null;}
        return  i$.toArraySolisti1Type();
    }

    
    public void setEmail_Id_Cc(hmh.sap.rfc.util.ZemailType_List Email_Id_Cc) {
        baseTypeData().setElementValue(4, Email_Id_Cc);
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  Z_Rfc_Send_Account_Statement_Input parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Z_Rfc_Send_Account_Statement_Input parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getEmail_Id_To() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getEmail_Subject() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getBill_To_Customer() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getEmail_Id_Cc() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(4);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getEmail_Text() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
    }

}
