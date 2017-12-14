package hmh.sap.rfc.util;


public class ZvsrType_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.util.List, java.io.Serializable {

    private  static final long serialVersionUID = -1309351787L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:ZVSR", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", hmh.sap.rfc.ZvsrType.class, new hmh.sap.rfc.ZvsrType(), new java.lang.String[][]{}, 66, 132, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"ZVSR\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Sales Representative</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>66</ifr:internalLength1><ifr:internalLength2>132</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  ZvsrType_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public hmh.sap.rfc.ZvsrType removeZvsrType(int index) {
        return (hmh.sap.rfc.ZvsrType)baseList().remove(index);
    }

    
    public void addAllZvsrType(int index, ZvsrType_List item) {
        baseList().addAll(index, item);
    }

    
    public hmh.sap.rfc.ZvsrType[] toArrayZvsrType() {
        return (hmh.sap.rfc.ZvsrType[])baseList().toArray(new hmh.sap.rfc.ZvsrType[] {});
    }

    
    public ZvsrType_List subListZvsrType(int fromIndex, int toIndex) {
        return (ZvsrType_List)baseList().subList(fromIndex, toIndex);
    }

    
    public void addAllZvsrType(ZvsrType_List item) {
        baseList().addAll(item);
    }

    
    public boolean containsZvsrType(hmh.sap.rfc.ZvsrType item) {
        return baseList().contains(item);
    }

    
    public hmh.sap.rfc.ZvsrType setZvsrType(int index, hmh.sap.rfc.ZvsrType item) {
        return (hmh.sap.rfc.ZvsrType)baseList().set(index, item);
    }

    
    public int lastIndexOfZvsrType(hmh.sap.rfc.ZvsrType item) {
        return baseList().lastIndexOf(item);
    }

    
    public void addZvsrType(hmh.sap.rfc.ZvsrType item) {
        baseList().add(item);
    }

    
    public boolean containsAllZvsrType(ZvsrType_List item) {
        return baseList().containsAll(item);
    }

    
    public hmh.sap.rfc.ZvsrType getZvsrType(int index) {
        return (hmh.sap.rfc.ZvsrType)baseList().get(index);
    }

    
    public int indexOfZvsrType(hmh.sap.rfc.ZvsrType item) {
        return baseList().indexOf(item);
    }

    
    public void addZvsrType(int index, hmh.sap.rfc.ZvsrType item) {
        baseList().add(index, item);
    }

    
    public boolean removeZvsrType(hmh.sap.rfc.ZvsrType item) {
        return baseList().remove(item);
    }

}
