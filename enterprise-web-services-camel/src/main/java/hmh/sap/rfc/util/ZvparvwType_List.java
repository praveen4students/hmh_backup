package hmh.sap.rfc.util;


public class ZvparvwType_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.util.List, java.io.Serializable {

    private  static final long serialVersionUID = -1961182816L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:ZVPARVW", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", hmh.sap.rfc.ZvparvwType.class, new hmh.sap.rfc.ZvparvwType(), new java.lang.String[][]{}, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"ZVPARVW\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">I/P Partner functions to Find transaction RFC</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  ZvparvwType_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public hmh.sap.rfc.ZvparvwType[] toArrayZvparvwType() {
        return (hmh.sap.rfc.ZvparvwType[])baseList().toArray(new hmh.sap.rfc.ZvparvwType[] {});
    }

    
    public boolean containsAllZvparvwType(ZvparvwType_List item) {
        return baseList().containsAll(item);
    }

    
    public void addZvparvwType(hmh.sap.rfc.ZvparvwType item) {
        baseList().add(item);
    }

    
    public hmh.sap.rfc.ZvparvwType getZvparvwType(int index) {
        return (hmh.sap.rfc.ZvparvwType)baseList().get(index);
    }

    
    public boolean removeZvparvwType(hmh.sap.rfc.ZvparvwType item) {
        return baseList().remove(item);
    }

    
    public void addAllZvparvwType(int index, ZvparvwType_List item) {
        baseList().addAll(index, item);
    }

    
    public boolean containsZvparvwType(hmh.sap.rfc.ZvparvwType item) {
        return baseList().contains(item);
    }

    
    public void addZvparvwType(int index, hmh.sap.rfc.ZvparvwType item) {
        baseList().add(index, item);
    }

    
    public void addAllZvparvwType(ZvparvwType_List item) {
        baseList().addAll(item);
    }

    
    public int indexOfZvparvwType(hmh.sap.rfc.ZvparvwType item) {
        return baseList().indexOf(item);
    }

    
    public hmh.sap.rfc.ZvparvwType removeZvparvwType(int index) {
        return (hmh.sap.rfc.ZvparvwType)baseList().remove(index);
    }

    
    public hmh.sap.rfc.ZvparvwType setZvparvwType(int index, hmh.sap.rfc.ZvparvwType item) {
        return (hmh.sap.rfc.ZvparvwType)baseList().set(index, item);
    }

    
    public int lastIndexOfZvparvwType(hmh.sap.rfc.ZvparvwType item) {
        return baseList().lastIndexOf(item);
    }

    
    public ZvparvwType_List subListZvparvwType(int fromIndex, int toIndex) {
        return (ZvparvwType_List)baseList().subList(fromIndex, toIndex);
    }

}
