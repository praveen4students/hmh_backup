package hmh.sap.rfc.util;


public class BapimatrasType_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.util.List, java.io.Serializable {

    private  static final long serialVersionUID = -2011319114L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:BAPIMATRAS", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", hmh.sap.rfc.BapimatrasType.class, new hmh.sap.rfc.BapimatrasType(), new java.lang.String[][]{}, 83, 166, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"BAPIMATRAS\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Structure for Material Master BAPI Interface: Matl No. Range</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>83</ifr:internalLength1><ifr:internalLength2>166</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  BapimatrasType_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public hmh.sap.rfc.BapimatrasType getBapimatrasType(int index) {
        return (hmh.sap.rfc.BapimatrasType)baseList().get(index);
    }

    
    public boolean removeBapimatrasType(hmh.sap.rfc.BapimatrasType item) {
        return baseList().remove(item);
    }

    
    public hmh.sap.rfc.BapimatrasType removeBapimatrasType(int index) {
        return (hmh.sap.rfc.BapimatrasType)baseList().remove(index);
    }

    
    public hmh.sap.rfc.BapimatrasType[] toArrayBapimatrasType() {
        return (hmh.sap.rfc.BapimatrasType[])baseList().toArray(new hmh.sap.rfc.BapimatrasType[] {});
    }

    
    public void addAllBapimatrasType(BapimatrasType_List item) {
        baseList().addAll(item);
    }

    
    public int indexOfBapimatrasType(hmh.sap.rfc.BapimatrasType item) {
        return baseList().indexOf(item);
    }

    
    public int lastIndexOfBapimatrasType(hmh.sap.rfc.BapimatrasType item) {
        return baseList().lastIndexOf(item);
    }

    
    public void addBapimatrasType(hmh.sap.rfc.BapimatrasType item) {
        baseList().add(item);
    }

    
    public void addAllBapimatrasType(int index, BapimatrasType_List item) {
        baseList().addAll(index, item);
    }

    
    public void addBapimatrasType(int index, hmh.sap.rfc.BapimatrasType item) {
        baseList().add(index, item);
    }

    
    public boolean containsBapimatrasType(hmh.sap.rfc.BapimatrasType item) {
        return baseList().contains(item);
    }

    
    public BapimatrasType_List subListBapimatrasType(int fromIndex, int toIndex) {
        return (BapimatrasType_List)baseList().subList(fromIndex, toIndex);
    }

    
    public boolean containsAllBapimatrasType(BapimatrasType_List item) {
        return baseList().containsAll(item);
    }

    
    public hmh.sap.rfc.BapimatrasType setBapimatrasType(int index, hmh.sap.rfc.BapimatrasType item) {
        return (hmh.sap.rfc.BapimatrasType)baseList().set(index, item);
    }

}
