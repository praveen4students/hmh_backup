package hmh.sap.rfc;


public class Z_Rfc_Send_Invoice_Email_Pdf_Output extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1353100462968L) ;

    private  Z_Rfc_Send_Invoice_Email_Pdf_Output.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.WSDL_MESSAGE_FOR_JCO, "urn:sap-com:document:sap:rfc:functions", "Z_RFC_SEND_INVOICE_EMAIL_PDF.Output", 6, 0, hmh.sap.rfc.Z_Rfc_Send_Invoice_Email_Pdf_Output.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "Z_RFC_SEND_INVOICE_EMAIL_PDF", 0, 0, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Email Invoice PDF to web customer</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>110</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:package>ZVBD</ifr:package><ifr:akhNode>HLA0009600</ifr:akhNode><ifr:released>no</ifr:released><ifr:outbound>false</ifr:outbound><ifr:synchronous>true</ifr:synchronous><ifr:asynchronous>false</ifr:asynchronous><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2></ifr:properties><ifr:definition /></ifr:container>");
        descriptorSetElementProperties(descriptor, 0, "E_BIN_FILE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:base64Binary", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "E_Bin_File", byte[].class, null, new java.lang.String[][]{}, "E_BIN_FILE", 0, 0, -1, 0, 0, 0, com.sap.mw.jco.JCO.TYPE_XSTRING, com.sap.mw.jco.JCO.EXPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"E_BIN_FILE\"><ifr:descriptor><ifr:description language=\"en\">BIN File (PDF Data)</ifr:description></ifr:descriptor><ifr:definition><ifr:abapType><ifr:definition><ifr:abapType>y</ifr:abapType><ifr:internalLength1>0</ifr:internalLength1><ifr:internalLength2>0</ifr:internalLength2><ifr:internalLength4>0</ifr:internalLength4></ifr:definition></ifr:abapType></ifr:definition><ifr:properties><ifr:direction>out</ifr:direction><ifr:class>export</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>false</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 1, "E_BIN_FILE_SIZE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "E_Bin_File_Size", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "12"}}, "E_BIN_FILE_SIZE", 0, 0, -1, 12, 24, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.EXPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"E_BIN_FILE_SIZE\"><ifr:descriptor><ifr:description language=\"en\">Character field of length 40</ifr:description></ifr:descriptor><ifr:definition><ifr:scalarType name=\"SO_OBJ_LEN\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>12</ifr:length><ifr:internalLength1>12</ifr:internalLength1><ifr:internalLength2>24</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>12</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>out</ifr:direction><ifr:class>export</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 2, "E_RETURN", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:ZBDCMSGCOLL_RFC", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "E_Return", hmh.sap.rfc.Zbdcmsgcoll_RfcType.class, new hmh.sap.rfc.Zbdcmsgcoll_RfcType(), new java.lang.String[][]{}, "E_RETURN", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, com.sap.mw.jco.JCO.EXPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"E_RETURN\"><ifr:descriptor><ifr:description language=\"en\">Return parameter (for error)</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZBDCMSGCOLL_RFC\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZBDCMSGCOLL_RFC\" /></ifr:definition><ifr:properties><ifr:direction>out</ifr:direction><ifr:class>export</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 3, "EMAIL_TEXT", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Email_Text", hmh.sap.rfc.util.Solisti1Type_List.class, new hmh.sap.rfc.Solisti1Type(), new java.lang.String[][]{}, "EMAIL_TEXT", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"EMAIL_TEXT\"><ifr:descriptor><ifr:description language=\"en\">Email text</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"SOLISTI1\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=SOLISTI1\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 4, "EMAIL_ID_TO", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Email_Id_To", hmh.sap.rfc.util.ZemailType_List.class, new hmh.sap.rfc.ZemailType(), new java.lang.String[][]{}, "EMAIL_ID_TO", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"EMAIL_ID_TO\"><ifr:descriptor><ifr:description language=\"en\">Email address TO</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZEMAIL\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZEMAIL\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 5, "EMAIL_ID_CC", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Email_Id_Cc", hmh.sap.rfc.util.ZemailType_List.class, new hmh.sap.rfc.ZemailType(), new java.lang.String[][]{}, "EMAIL_ID_CC", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"EMAIL_ID_CC\"><ifr:descriptor><ifr:description language=\"en\">Email address CC</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZEMAIL\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZEMAIL\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        staticDescriptor = descriptor;
    }
    public  Z_Rfc_Send_Invoice_Email_Pdf_Output () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    protected  Z_Rfc_Send_Invoice_Email_Pdf_Output (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    
    public void setEmail_Text(hmh.sap.rfc.Solisti1Type[] Email_Text) {
        baseTypeData().setElementValue(3, new hmh.sap.rfc.util.Solisti1Type_List());
        hmh.sap.rfc.util.Solisti1Type_List list$ = get_as_listEmail_Text();
        for (int  i$ = 0; i$ < Email_Text.length; i$++){
         list$.addSolisti1Type(Email_Text[ i$]);
        }
    }

    
    public hmh.sap.rfc.Zbdcmsgcoll_RfcType getE_Return() {
        return (hmh.sap.rfc.Zbdcmsgcoll_RfcType)baseTypeData().getElementValue(2);
    }

    
    public byte[] getE_Bin_File() {
        return (byte[])baseTypeData().getElementValueAsByteArray(0);
    }

    
    public hmh.sap.rfc.util.Solisti1Type_List get_as_listEmail_Text() {
        return (hmh.sap.rfc.util.Solisti1Type_List)baseTypeData().getElementValue(3);
    }

    
    public void setEmail_Id_To(hmh.sap.rfc.util.ZemailType_List Email_Id_To) {
        baseTypeData().setElementValue(4, Email_Id_To);
    }

    
    public hmh.sap.rfc.ZemailType[] getEmail_Id_Cc() {
        hmh.sap.rfc.util.ZemailType_List i$ = (hmh.sap.rfc.util.ZemailType_List)baseTypeData().getElementValue(5);
        if ( i$ == null){return null;}
        return  i$.toArrayZemailType();
    }

    
    public void setE_Bin_File(byte[] E_Bin_File) {
        baseTypeData().setElementValue(0, E_Bin_File);
    }

    
    public hmh.sap.rfc.util.ZemailType_List get_as_listEmail_Id_To() {
        return (hmh.sap.rfc.util.ZemailType_List)baseTypeData().getElementValue(4);
    }

    
    public void setEmail_Id_Cc(hmh.sap.rfc.ZemailType[] Email_Id_Cc) {
        baseTypeData().setElementValue(5, new hmh.sap.rfc.util.ZemailType_List());
        hmh.sap.rfc.util.ZemailType_List list$ = get_as_listEmail_Id_Cc();
        for (int  i$ = 0; i$ < Email_Id_Cc.length; i$++){
         list$.addZemailType(Email_Id_Cc[ i$]);
        }
    }

    
    public void setE_Bin_File_Size(java.lang.String E_Bin_File_Size) {
        baseTypeData().setElementValue(1, E_Bin_File_Size);
    }

    
    public void setEmail_Id_To(hmh.sap.rfc.ZemailType[] Email_Id_To) {
        baseTypeData().setElementValue(4, new hmh.sap.rfc.util.ZemailType_List());
        hmh.sap.rfc.util.ZemailType_List list$ = get_as_listEmail_Id_To();
        for (int  i$ = 0; i$ < Email_Id_To.length; i$++){
         list$.addZemailType(Email_Id_To[ i$]);
        }
    }

    
    public hmh.sap.rfc.util.ZemailType_List get_as_listEmail_Id_Cc() {
        return (hmh.sap.rfc.util.ZemailType_List)baseTypeData().getElementValue(5);
    }

    
    public java.lang.String getE_Bin_File_Size() {
        return (java.lang.String)baseTypeData().getElementValueAsString(1);
    }

    
    public hmh.sap.rfc.ZemailType[] getEmail_Id_To() {
        hmh.sap.rfc.util.ZemailType_List i$ = (hmh.sap.rfc.util.ZemailType_List)baseTypeData().getElementValue(4);
        if ( i$ == null){return null;}
        return  i$.toArrayZemailType();
    }

    
    public void setE_Return(hmh.sap.rfc.Zbdcmsgcoll_RfcType E_Return) {
        baseTypeData().setElementValue(2, E_Return);
    }

    
    public MetaData metadataZ_Rfc_Send_Invoice_Email_Pdf_Output() {
        return metadata;
    }

    
    public void setEmail_Text(hmh.sap.rfc.util.Solisti1Type_List Email_Text) {
        baseTypeData().setElementValue(3, Email_Text);
    }

    
    public hmh.sap.rfc.Solisti1Type[] getEmail_Text() {
        hmh.sap.rfc.util.Solisti1Type_List i$ = (hmh.sap.rfc.util.Solisti1Type_List)baseTypeData().getElementValue(3);
        if ( i$ == null){return null;}
        return  i$.toArraySolisti1Type();
    }

    
    public void setEmail_Id_Cc(hmh.sap.rfc.util.ZemailType_List Email_Id_Cc) {
        baseTypeData().setElementValue(5, Email_Id_Cc);
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  Z_Rfc_Send_Invoice_Email_Pdf_Output parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Z_Rfc_Send_Invoice_Email_Pdf_Output parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getE_Return() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getEmail_Id_To() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(4);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getE_Bin_File_Size() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getE_Bin_File() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getEmail_Id_Cc() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(5);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getEmail_Text() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
    }

}
