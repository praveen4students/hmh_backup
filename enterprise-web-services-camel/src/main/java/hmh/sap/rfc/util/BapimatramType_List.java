package hmh.sap.rfc.util;


public class BapimatramType_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.util.List, java.io.Serializable {

    private  static final long serialVersionUID = -2016860240L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:BAPIMATRAM", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", hmh.sap.rfc.BapimatramType.class, new hmh.sap.rfc.BapimatramType(), new java.lang.String[][]{}, 39, 78, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"BAPIMATRAM\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Structure for Material Master BAPI Interface: Matl No. Range</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>39</ifr:internalLength1><ifr:internalLength2>78</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  BapimatramType_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public int indexOfBapimatramType(hmh.sap.rfc.BapimatramType item) {
        return baseList().indexOf(item);
    }

    
    public void addAllBapimatramType(BapimatramType_List item) {
        baseList().addAll(item);
    }

    
    public BapimatramType_List subListBapimatramType(int fromIndex, int toIndex) {
        return (BapimatramType_List)baseList().subList(fromIndex, toIndex);
    }

    
    public int lastIndexOfBapimatramType(hmh.sap.rfc.BapimatramType item) {
        return baseList().lastIndexOf(item);
    }

    
    public void addBapimatramType(hmh.sap.rfc.BapimatramType item) {
        baseList().add(item);
    }

    
    public void addBapimatramType(int index, hmh.sap.rfc.BapimatramType item) {
        baseList().add(index, item);
    }

    
    public hmh.sap.rfc.BapimatramType getBapimatramType(int index) {
        return (hmh.sap.rfc.BapimatramType)baseList().get(index);
    }

    
    public void addAllBapimatramType(int index, BapimatramType_List item) {
        baseList().addAll(index, item);
    }

    
    public hmh.sap.rfc.BapimatramType[] toArrayBapimatramType() {
        return (hmh.sap.rfc.BapimatramType[])baseList().toArray(new hmh.sap.rfc.BapimatramType[] {});
    }

    
    public boolean removeBapimatramType(hmh.sap.rfc.BapimatramType item) {
        return baseList().remove(item);
    }

    
    public boolean containsBapimatramType(hmh.sap.rfc.BapimatramType item) {
        return baseList().contains(item);
    }

    
    public boolean containsAllBapimatramType(BapimatramType_List item) {
        return baseList().containsAll(item);
    }

    
    public hmh.sap.rfc.BapimatramType removeBapimatramType(int index) {
        return (hmh.sap.rfc.BapimatramType)baseList().remove(index);
    }

    
    public hmh.sap.rfc.BapimatramType setBapimatramType(int index, hmh.sap.rfc.BapimatramType item) {
        return (hmh.sap.rfc.BapimatramType)baseList().set(index, item);
    }

}
