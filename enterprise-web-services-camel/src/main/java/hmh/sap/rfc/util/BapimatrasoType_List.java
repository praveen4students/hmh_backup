package hmh.sap.rfc.util;


public class BapimatrasoType_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.util.List, java.io.Serializable {

    private  static final long serialVersionUID = 2097458797L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:BAPIMATRASO", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", hmh.sap.rfc.BapimatrasoType.class, new hmh.sap.rfc.BapimatrasoType(), new java.lang.String[][]{}, 11, 22, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"BAPIMATRASO\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Structure for Material Master BAPI Interface: SOrg. Range</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>11</ifr:internalLength1><ifr:internalLength2>22</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  BapimatrasoType_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public hmh.sap.rfc.BapimatrasoType removeBapimatrasoType(int index) {
        return (hmh.sap.rfc.BapimatrasoType)baseList().remove(index);
    }

    
    public boolean removeBapimatrasoType(hmh.sap.rfc.BapimatrasoType item) {
        return baseList().remove(item);
    }

    
    public void addAllBapimatrasoType(int index, BapimatrasoType_List item) {
        baseList().addAll(index, item);
    }

    
    public hmh.sap.rfc.BapimatrasoType setBapimatrasoType(int index, hmh.sap.rfc.BapimatrasoType item) {
        return (hmh.sap.rfc.BapimatrasoType)baseList().set(index, item);
    }

    
    public hmh.sap.rfc.BapimatrasoType getBapimatrasoType(int index) {
        return (hmh.sap.rfc.BapimatrasoType)baseList().get(index);
    }

    
    public void addAllBapimatrasoType(BapimatrasoType_List item) {
        baseList().addAll(item);
    }

    
    public hmh.sap.rfc.BapimatrasoType[] toArrayBapimatrasoType() {
        return (hmh.sap.rfc.BapimatrasoType[])baseList().toArray(new hmh.sap.rfc.BapimatrasoType[] {});
    }

    
    public int indexOfBapimatrasoType(hmh.sap.rfc.BapimatrasoType item) {
        return baseList().indexOf(item);
    }

    
    public void addBapimatrasoType(int index, hmh.sap.rfc.BapimatrasoType item) {
        baseList().add(index, item);
    }

    
    public int lastIndexOfBapimatrasoType(hmh.sap.rfc.BapimatrasoType item) {
        return baseList().lastIndexOf(item);
    }

    
    public BapimatrasoType_List subListBapimatrasoType(int fromIndex, int toIndex) {
        return (BapimatrasoType_List)baseList().subList(fromIndex, toIndex);
    }

    
    public boolean containsAllBapimatrasoType(BapimatrasoType_List item) {
        return baseList().containsAll(item);
    }

    
    public boolean containsBapimatrasoType(hmh.sap.rfc.BapimatrasoType item) {
        return baseList().contains(item);
    }

    
    public void addBapimatrasoType(hmh.sap.rfc.BapimatrasoType item) {
        baseList().add(item);
    }

}
