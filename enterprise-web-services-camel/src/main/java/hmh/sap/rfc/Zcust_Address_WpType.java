package hmh.sap.rfc;


public class Zcust_Address_WpType extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1356026424543L) ;

    private  Zcust_Address_WpType.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.XSDL_COMPLEX_TYPE, "urn:sap-com:document:sap:rfc:functions", "ZCUST_ADDRESS_WP", 11, 0, hmh.sap.rfc.Zcust_Address_WpType.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "ZCUST_ADDRESS_WP", 468, 936, -1, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"ZCUST_ADDRESS_WP\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Structure for Customer Address</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>110</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>468</ifr:internalLength1><ifr:internalLength2>936</ifr:internalLength2></ifr:definition></ifr:container></s0:type>");
        descriptorSetElementProperties(descriptor, 0, "CUSTOMER_NAME", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Customer_Name", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "35"}}, "CUSTOMER_NAME", 0, 0, -1, 35, 70, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CUSTOMER_NAME\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Name 1</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>0</ifr:offset1><ifr:offset2>0</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"NAME1_GP\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>35</ifr:length><ifr:internalLength1>35</ifr:internalLength1><ifr:internalLength2>70</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>35</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 1, "TELEPHONE_1", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Telephone_1", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "16"}}, "TELEPHONE_1", 35, 70, -1, 16, 32, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TELEPHONE_1\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">First telephone number</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>35</ifr:offset1><ifr:offset2>70</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"TELF1\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>16</ifr:length><ifr:internalLength1>16</ifr:internalLength1><ifr:internalLength2>32</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>16</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 2, "EMAIL", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Email", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "241"}}, "EMAIL", 51, 102, -1, 241, 482, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"EMAIL\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">E-Mail Address</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>51</ifr:offset1><ifr:offset2>102</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_SMTPADR\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>241</ifr:length><ifr:internalLength1>241</ifr:internalLength1><ifr:internalLength2>482</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>241</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 3, "ADDR_LINE1", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Addr_Line1", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "35"}}, "ADDR_LINE1", 292, 584, -1, 35, 70, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ADDR_LINE1\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">House number and street</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>292</ifr:offset1><ifr:offset2>584</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"STRAS_GP\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>35</ifr:length><ifr:internalLength1>35</ifr:internalLength1><ifr:internalLength2>70</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>35</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 4, "ADDR_LINE2", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Addr_Line2", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "40"}}, "ADDR_LINE2", 327, 654, -1, 40, 80, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ADDR_LINE2\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Street 2</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>327</ifr:offset1><ifr:offset2>654</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_STRSPP1\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>40</ifr:length><ifr:internalLength1>40</ifr:internalLength1><ifr:internalLength2>80</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>40</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 5, "ADDR_LINE3", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Addr_Line3", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "40"}}, "ADDR_LINE3", 367, 734, -1, 40, 80, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ADDR_LINE3\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Street 3</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>367</ifr:offset1><ifr:offset2>734</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_STRSPP2\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>40</ifr:length><ifr:internalLength1>40</ifr:internalLength1><ifr:internalLength2>80</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>40</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 6, "PO_BOX", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Po_Box", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "PO_BOX", 407, 814, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PO_BOX\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">PO Box</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>407</ifr:offset1><ifr:offset2>814</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"AD_POBX\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 7, "CITY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "City", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "35"}}, "CITY", 417, 834, -1, 35, 70, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CITY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">City</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>417</ifr:offset1><ifr:offset2>834</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ORT01_GP\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>35</ifr:length><ifr:internalLength1>35</ifr:internalLength1><ifr:internalLength2>70</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>35</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 8, "STATE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "State", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "STATE", 452, 904, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"STATE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Region (State, Province, County)</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>452</ifr:offset1><ifr:offset2>904</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"REGIO\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 9, "ZIP_CODE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Zip_Code", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "ZIP_CODE", 455, 910, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ZIP_CODE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Postal Code</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>455</ifr:offset1><ifr:offset2>910</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PSTLZ\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 10, "COUNTRY_CODE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Country_Code", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "COUNTRY_CODE", 465, 930, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"COUNTRY_CODE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"en\">Country Key</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>465</ifr:offset1><ifr:offset2>930</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"LAND1\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        staticDescriptor = descriptor;
    }
    public  Zcust_Address_WpType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    protected  Zcust_Address_WpType (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    
    public void setPo_Box(java.lang.String Po_Box) {
        baseTypeData().setElementValue(6, Po_Box);
    }

    
    public void setCountry_Code(java.lang.String Country_Code) {
        baseTypeData().setElementValue(10, Country_Code);
    }

    
    public void setAddr_Line1(java.lang.String Addr_Line1) {
        baseTypeData().setElementValue(3, Addr_Line1);
    }

    
    public void setTelephone_1(java.lang.String Telephone_1) {
        baseTypeData().setElementValue(1, Telephone_1);
    }

    
    public java.lang.String getZip_Code() {
        return (java.lang.String)baseTypeData().getElementValueAsString(9);
    }

    
    public java.lang.String getCountry_Code() {
        return (java.lang.String)baseTypeData().getElementValueAsString(10);
    }

    
    public MetaData metadata() {
        return metadata;
    }

    
    public java.lang.String getTelephone_1() {
        return (java.lang.String)baseTypeData().getElementValueAsString(1);
    }

    
    public java.lang.String getAddr_Line2() {
        return (java.lang.String)baseTypeData().getElementValueAsString(4);
    }

    
    public java.lang.String getAddr_Line3() {
        return (java.lang.String)baseTypeData().getElementValueAsString(5);
    }

    
    public void setCity(java.lang.String City) {
        baseTypeData().setElementValue(7, City);
    }

    
    public java.lang.String getAddr_Line1() {
        return (java.lang.String)baseTypeData().getElementValueAsString(3);
    }

    
    public void setCustomer_Name(java.lang.String Customer_Name) {
        baseTypeData().setElementValue(0, Customer_Name);
    }

    
    public java.lang.String getState() {
        return (java.lang.String)baseTypeData().getElementValueAsString(8);
    }

    
    public java.lang.String getCustomer_Name() {
        return (java.lang.String)baseTypeData().getElementValueAsString(0);
    }

    
    public java.lang.String getEmail() {
        return (java.lang.String)baseTypeData().getElementValueAsString(2);
    }

    
    public void setEmail(java.lang.String Email) {
        baseTypeData().setElementValue(2, Email);
    }

    
    public void setZip_Code(java.lang.String Zip_Code) {
        baseTypeData().setElementValue(9, Zip_Code);
    }

    
    public void setAddr_Line2(java.lang.String Addr_Line2) {
        baseTypeData().setElementValue(4, Addr_Line2);
    }

    
    public void setAddr_Line3(java.lang.String Addr_Line3) {
        baseTypeData().setElementValue(5, Addr_Line3);
    }

    
    public void setState(java.lang.String State) {
        baseTypeData().setElementValue(8, State);
    }

    
    public java.lang.String getCity() {
        return (java.lang.String)baseTypeData().getElementValueAsString(7);
    }

    
    public java.lang.String getPo_Box() {
        return (java.lang.String)baseTypeData().getElementValueAsString(6);
    }

    
    
    public static class MetaData implements java.io.Serializable {
    
        private  Zcust_Address_WpType parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Zcust_Address_WpType parent) {
            this.parent = parent;
            
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getAddr_Line2() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(4);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getAddr_Line3() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(5);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getAddr_Line1() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getState() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(8);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getEmail() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCustomer_Name() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getZip_Code() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(9);
        }
    
        
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCountry_Code() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(10);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getCity() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(7);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getPo_Box() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(6);
        }
    
        
        public com.sap.aii.proxy.framework.core.JcoMetaData getTelephone_1() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
    }

}
