package hmh.sap.rfc.util;


public class ZvetailcustType_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.util.List, java.io.Serializable {

    private  static final long serialVersionUID = -1756747898L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:ZVETAILCUST", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", hmh.sap.rfc.ZvetailcustType.class, new hmh.sap.rfc.ZvetailcustType(), new java.lang.String[][]{}, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"ZVETAILCUST\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Etial Customer Ids</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  ZvetailcustType_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public void addZvetailcustType(hmh.sap.rfc.ZvetailcustType item) {
        baseList().add(item);
    }

    
    public boolean containsZvetailcustType(hmh.sap.rfc.ZvetailcustType item) {
        return baseList().contains(item);
    }

    
    public ZvetailcustType_List subListZvetailcustType(int fromIndex, int toIndex) {
        return (ZvetailcustType_List)baseList().subList(fromIndex, toIndex);
    }

    
    public hmh.sap.rfc.ZvetailcustType getZvetailcustType(int index) {
        return (hmh.sap.rfc.ZvetailcustType)baseList().get(index);
    }

    
    public hmh.sap.rfc.ZvetailcustType removeZvetailcustType(int index) {
        return (hmh.sap.rfc.ZvetailcustType)baseList().remove(index);
    }

    
    public int indexOfZvetailcustType(hmh.sap.rfc.ZvetailcustType item) {
        return baseList().indexOf(item);
    }

    
    public void addAllZvetailcustType(int index, ZvetailcustType_List item) {
        baseList().addAll(index, item);
    }

    
    public hmh.sap.rfc.ZvetailcustType setZvetailcustType(int index, hmh.sap.rfc.ZvetailcustType item) {
        return (hmh.sap.rfc.ZvetailcustType)baseList().set(index, item);
    }

    
    public hmh.sap.rfc.ZvetailcustType[] toArrayZvetailcustType() {
        return (hmh.sap.rfc.ZvetailcustType[])baseList().toArray(new hmh.sap.rfc.ZvetailcustType[] {});
    }

    
    public boolean containsAllZvetailcustType(ZvetailcustType_List item) {
        return baseList().containsAll(item);
    }

    
    public int lastIndexOfZvetailcustType(hmh.sap.rfc.ZvetailcustType item) {
        return baseList().lastIndexOf(item);
    }

    
    public void addZvetailcustType(int index, hmh.sap.rfc.ZvetailcustType item) {
        baseList().add(index, item);
    }

    
    public boolean removeZvetailcustType(hmh.sap.rfc.ZvetailcustType item) {
        return baseList().remove(item);
    }

    
    public void addAllZvetailcustType(ZvetailcustType_List item) {
        baseList().addAll(item);
    }

}
