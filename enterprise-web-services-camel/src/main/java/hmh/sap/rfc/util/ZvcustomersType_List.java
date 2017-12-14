package hmh.sap.rfc.util;


public class ZvcustomersType_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.util.List, java.io.Serializable {

    private  static final long serialVersionUID = 883201875L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:ZVCUSTOMERS", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", hmh.sap.rfc.ZvcustomersType.class, new hmh.sap.rfc.ZvcustomersType(), new java.lang.String[][]{}, 12, 24, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"ZVCUSTOMERS\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Customer number of business partner</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>12</ifr:internalLength1><ifr:internalLength2>24</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  ZvcustomersType_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public ZvcustomersType_List subListZvcustomersType(int fromIndex, int toIndex) {
        return (ZvcustomersType_List)baseList().subList(fromIndex, toIndex);
    }

    
    public hmh.sap.rfc.ZvcustomersType setZvcustomersType(int index, hmh.sap.rfc.ZvcustomersType item) {
        return (hmh.sap.rfc.ZvcustomersType)baseList().set(index, item);
    }

    
    public void addZvcustomersType(int index, hmh.sap.rfc.ZvcustomersType item) {
        baseList().add(index, item);
    }

    
    public hmh.sap.rfc.ZvcustomersType removeZvcustomersType(int index) {
        return (hmh.sap.rfc.ZvcustomersType)baseList().remove(index);
    }

    
    public void addAllZvcustomersType(int index, ZvcustomersType_List item) {
        baseList().addAll(index, item);
    }

    
    public int indexOfZvcustomersType(hmh.sap.rfc.ZvcustomersType item) {
        return baseList().indexOf(item);
    }

    
    public boolean containsAllZvcustomersType(ZvcustomersType_List item) {
        return baseList().containsAll(item);
    }

    
    public boolean containsZvcustomersType(hmh.sap.rfc.ZvcustomersType item) {
        return baseList().contains(item);
    }

    
    public boolean removeZvcustomersType(hmh.sap.rfc.ZvcustomersType item) {
        return baseList().remove(item);
    }

    
    public hmh.sap.rfc.ZvcustomersType getZvcustomersType(int index) {
        return (hmh.sap.rfc.ZvcustomersType)baseList().get(index);
    }

    
    public int lastIndexOfZvcustomersType(hmh.sap.rfc.ZvcustomersType item) {
        return baseList().lastIndexOf(item);
    }

    
    public hmh.sap.rfc.ZvcustomersType[] toArrayZvcustomersType() {
        return (hmh.sap.rfc.ZvcustomersType[])baseList().toArray(new hmh.sap.rfc.ZvcustomersType[] {});
    }

    
    public void addAllZvcustomersType(ZvcustomersType_List item) {
        baseList().addAll(item);
    }

    
    public void addZvcustomersType(hmh.sap.rfc.ZvcustomersType item) {
        baseList().add(item);
    }

}
