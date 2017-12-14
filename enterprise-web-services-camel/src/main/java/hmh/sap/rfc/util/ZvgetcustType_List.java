package hmh.sap.rfc.util;


public class ZvgetcustType_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.util.List, java.io.Serializable {

    private  static final long serialVersionUID = 34063527L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:ZVGETCUST", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", hmh.sap.rfc.ZvgetcustType.class, new hmh.sap.rfc.ZvgetcustType(), new java.lang.String[][]{}, 30, 60, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"ZVGETCUST\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Customer Key fields</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>30</ifr:internalLength1><ifr:internalLength2>60</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  ZvgetcustType_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public void addZvgetcustType(int index, hmh.sap.rfc.ZvgetcustType item) {
        baseList().add(index, item);
    }

    
    public hmh.sap.rfc.ZvgetcustType removeZvgetcustType(int index) {
        return (hmh.sap.rfc.ZvgetcustType)baseList().remove(index);
    }

    
    public boolean containsZvgetcustType(hmh.sap.rfc.ZvgetcustType item) {
        return baseList().contains(item);
    }

    
    public int lastIndexOfZvgetcustType(hmh.sap.rfc.ZvgetcustType item) {
        return baseList().lastIndexOf(item);
    }

    
    public void addAllZvgetcustType(int index, ZvgetcustType_List item) {
        baseList().addAll(index, item);
    }

    
    public hmh.sap.rfc.ZvgetcustType getZvgetcustType(int index) {
        return (hmh.sap.rfc.ZvgetcustType)baseList().get(index);
    }

    
    public boolean containsAllZvgetcustType(ZvgetcustType_List item) {
        return baseList().containsAll(item);
    }

    
    public boolean removeZvgetcustType(hmh.sap.rfc.ZvgetcustType item) {
        return baseList().remove(item);
    }

    
    public hmh.sap.rfc.ZvgetcustType[] toArrayZvgetcustType() {
        return (hmh.sap.rfc.ZvgetcustType[])baseList().toArray(new hmh.sap.rfc.ZvgetcustType[] {});
    }

    
    public void addZvgetcustType(hmh.sap.rfc.ZvgetcustType item) {
        baseList().add(item);
    }

    
    public hmh.sap.rfc.ZvgetcustType setZvgetcustType(int index, hmh.sap.rfc.ZvgetcustType item) {
        return (hmh.sap.rfc.ZvgetcustType)baseList().set(index, item);
    }

    
    public ZvgetcustType_List subListZvgetcustType(int fromIndex, int toIndex) {
        return (ZvgetcustType_List)baseList().subList(fromIndex, toIndex);
    }

    
    public int indexOfZvgetcustType(hmh.sap.rfc.ZvgetcustType item) {
        return baseList().indexOf(item);
    }

    
    public void addAllZvgetcustType(ZvgetcustType_List item) {
        baseList().addAll(item);
    }

}
