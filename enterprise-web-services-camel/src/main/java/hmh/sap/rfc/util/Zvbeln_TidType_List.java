package hmh.sap.rfc.util;


public class Zvbeln_TidType_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.util.List, java.io.Serializable {

    private  static final long serialVersionUID = 1844331627L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:ZVBELN_TID", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", hmh.sap.rfc.Zvbeln_TidType.class, new hmh.sap.rfc.Zvbeln_TidType(), new java.lang.String[][]{}, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"ZVBELN_TID\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">463 - Structure for VBELN</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  Zvbeln_TidType_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public hmh.sap.rfc.Zvbeln_TidType[] toArrayZvbeln_TidType() {
        return (hmh.sap.rfc.Zvbeln_TidType[])baseList().toArray(new hmh.sap.rfc.Zvbeln_TidType[] {});
    }

    
    public hmh.sap.rfc.Zvbeln_TidType setZvbeln_TidType(int index, hmh.sap.rfc.Zvbeln_TidType item) {
        return (hmh.sap.rfc.Zvbeln_TidType)baseList().set(index, item);
    }

    
    public boolean removeZvbeln_TidType(hmh.sap.rfc.Zvbeln_TidType item) {
        return baseList().remove(item);
    }

    
    public boolean containsAllZvbeln_TidType(Zvbeln_TidType_List item) {
        return baseList().containsAll(item);
    }

    
    public int indexOfZvbeln_TidType(hmh.sap.rfc.Zvbeln_TidType item) {
        return baseList().indexOf(item);
    }

    
    public hmh.sap.rfc.Zvbeln_TidType removeZvbeln_TidType(int index) {
        return (hmh.sap.rfc.Zvbeln_TidType)baseList().remove(index);
    }

    
    public void addZvbeln_TidType(hmh.sap.rfc.Zvbeln_TidType item) {
        baseList().add(item);
    }

    
    public int lastIndexOfZvbeln_TidType(hmh.sap.rfc.Zvbeln_TidType item) {
        return baseList().lastIndexOf(item);
    }

    
    public Zvbeln_TidType_List subListZvbeln_TidType(int fromIndex, int toIndex) {
        return (Zvbeln_TidType_List)baseList().subList(fromIndex, toIndex);
    }

    
    public void addAllZvbeln_TidType(Zvbeln_TidType_List item) {
        baseList().addAll(item);
    }

    
    public boolean containsZvbeln_TidType(hmh.sap.rfc.Zvbeln_TidType item) {
        return baseList().contains(item);
    }

    
    public void addAllZvbeln_TidType(int index, Zvbeln_TidType_List item) {
        baseList().addAll(index, item);
    }

    
    public void addZvbeln_TidType(int index, hmh.sap.rfc.Zvbeln_TidType item) {
        baseList().add(index, item);
    }

    
    public hmh.sap.rfc.Zvbeln_TidType getZvbeln_TidType(int index) {
        return (hmh.sap.rfc.Zvbeln_TidType)baseList().get(index);
    }

}
