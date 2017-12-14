package hmh.sap.rfc.util;


public class ZvdivinfoType_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.util.List, java.io.Serializable {

    private  static final long serialVersionUID = 596527037L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:ZVDIVINFO", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", hmh.sap.rfc.ZvdivinfoType.class, new hmh.sap.rfc.ZvdivinfoType(), new java.lang.String[][]{}, 21, 42, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"ZVDIVINFO\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Cutomer Division Information</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>21</ifr:internalLength1><ifr:internalLength2>42</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  ZvdivinfoType_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public void addZvdivinfoType(int index, hmh.sap.rfc.ZvdivinfoType item) {
        baseList().add(index, item);
    }

    
    public void addAllZvdivinfoType(int index, ZvdivinfoType_List item) {
        baseList().addAll(index, item);
    }

    
    public ZvdivinfoType_List subListZvdivinfoType(int fromIndex, int toIndex) {
        return (ZvdivinfoType_List)baseList().subList(fromIndex, toIndex);
    }

    
    public boolean containsZvdivinfoType(hmh.sap.rfc.ZvdivinfoType item) {
        return baseList().contains(item);
    }

    
    public hmh.sap.rfc.ZvdivinfoType getZvdivinfoType(int index) {
        return (hmh.sap.rfc.ZvdivinfoType)baseList().get(index);
    }

    
    public hmh.sap.rfc.ZvdivinfoType[] toArrayZvdivinfoType() {
        return (hmh.sap.rfc.ZvdivinfoType[])baseList().toArray(new hmh.sap.rfc.ZvdivinfoType[] {});
    }

    
    public int indexOfZvdivinfoType(hmh.sap.rfc.ZvdivinfoType item) {
        return baseList().indexOf(item);
    }

    
    public void addZvdivinfoType(hmh.sap.rfc.ZvdivinfoType item) {
        baseList().add(item);
    }

    
    public int lastIndexOfZvdivinfoType(hmh.sap.rfc.ZvdivinfoType item) {
        return baseList().lastIndexOf(item);
    }

    
    public boolean removeZvdivinfoType(hmh.sap.rfc.ZvdivinfoType item) {
        return baseList().remove(item);
    }

    
    public boolean containsAllZvdivinfoType(ZvdivinfoType_List item) {
        return baseList().containsAll(item);
    }

    
    public hmh.sap.rfc.ZvdivinfoType setZvdivinfoType(int index, hmh.sap.rfc.ZvdivinfoType item) {
        return (hmh.sap.rfc.ZvdivinfoType)baseList().set(index, item);
    }

    
    public hmh.sap.rfc.ZvdivinfoType removeZvdivinfoType(int index) {
        return (hmh.sap.rfc.ZvdivinfoType)baseList().remove(index);
    }

    
    public void addAllZvdivinfoType(ZvdivinfoType_List item) {
        baseList().addAll(item);
    }

}
