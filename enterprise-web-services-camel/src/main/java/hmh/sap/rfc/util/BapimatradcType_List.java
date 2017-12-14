package hmh.sap.rfc.util;


public class BapimatradcType_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.util.List, java.io.Serializable {

    private  static final long serialVersionUID = 1656939280L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:BAPIMATRADC", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", hmh.sap.rfc.BapimatradcType.class, new hmh.sap.rfc.BapimatradcType(), new java.lang.String[][]{}, 7, 14, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"BAPIMATRADC\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Structure for Material Master BAPI Interface: DChannel Range</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>7</ifr:internalLength1><ifr:internalLength2>14</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  BapimatradcType_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public void addBapimatradcType(hmh.sap.rfc.BapimatradcType item) {
        baseList().add(item);
    }

    
    public hmh.sap.rfc.BapimatradcType setBapimatradcType(int index, hmh.sap.rfc.BapimatradcType item) {
        return (hmh.sap.rfc.BapimatradcType)baseList().set(index, item);
    }

    
    public BapimatradcType_List subListBapimatradcType(int fromIndex, int toIndex) {
        return (BapimatradcType_List)baseList().subList(fromIndex, toIndex);
    }

    
    public void addAllBapimatradcType(BapimatradcType_List item) {
        baseList().addAll(item);
    }

    
    public boolean containsAllBapimatradcType(BapimatradcType_List item) {
        return baseList().containsAll(item);
    }

    
    public hmh.sap.rfc.BapimatradcType getBapimatradcType(int index) {
        return (hmh.sap.rfc.BapimatradcType)baseList().get(index);
    }

    
    public boolean containsBapimatradcType(hmh.sap.rfc.BapimatradcType item) {
        return baseList().contains(item);
    }

    
    public void addAllBapimatradcType(int index, BapimatradcType_List item) {
        baseList().addAll(index, item);
    }

    
    public hmh.sap.rfc.BapimatradcType removeBapimatradcType(int index) {
        return (hmh.sap.rfc.BapimatradcType)baseList().remove(index);
    }

    
    public boolean removeBapimatradcType(hmh.sap.rfc.BapimatradcType item) {
        return baseList().remove(item);
    }

    
    public void addBapimatradcType(int index, hmh.sap.rfc.BapimatradcType item) {
        baseList().add(index, item);
    }

    
    public hmh.sap.rfc.BapimatradcType[] toArrayBapimatradcType() {
        return (hmh.sap.rfc.BapimatradcType[])baseList().toArray(new hmh.sap.rfc.BapimatradcType[] {});
    }

    
    public int indexOfBapimatradcType(hmh.sap.rfc.BapimatradcType item) {
        return baseList().indexOf(item);
    }

    
    public int lastIndexOfBapimatradcType(hmh.sap.rfc.BapimatradcType item) {
        return baseList().lastIndexOf(item);
    }

}
