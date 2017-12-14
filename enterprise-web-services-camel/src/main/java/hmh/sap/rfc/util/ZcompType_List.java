package hmh.sap.rfc.util;


public class ZcompType_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.util.List, java.io.Serializable {

    private  static final long serialVersionUID = -62285501L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:ZCOMP", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", hmh.sap.rfc.ZcompType.class, new hmh.sap.rfc.ZcompType(), new java.lang.String[][]{}, 62, 118, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"ZCOMP\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">To hold the components of a material</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>62</ifr:internalLength1><ifr:internalLength2>118</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  ZcompType_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public void addAllZcompType(ZcompType_List item) {
        baseList().addAll(item);
    }

    
    public int lastIndexOfZcompType(hmh.sap.rfc.ZcompType item) {
        return baseList().lastIndexOf(item);
    }

    
    public hmh.sap.rfc.ZcompType[] toArrayZcompType() {
        return (hmh.sap.rfc.ZcompType[])baseList().toArray(new hmh.sap.rfc.ZcompType[] {});
    }

    
    public void addZcompType(int index, hmh.sap.rfc.ZcompType item) {
        baseList().add(index, item);
    }

    
    public hmh.sap.rfc.ZcompType setZcompType(int index, hmh.sap.rfc.ZcompType item) {
        return (hmh.sap.rfc.ZcompType)baseList().set(index, item);
    }

    
    public void addZcompType(hmh.sap.rfc.ZcompType item) {
        baseList().add(item);
    }

    
    public boolean containsAllZcompType(ZcompType_List item) {
        return baseList().containsAll(item);
    }

    
    public hmh.sap.rfc.ZcompType getZcompType(int index) {
        return (hmh.sap.rfc.ZcompType)baseList().get(index);
    }

    
    public hmh.sap.rfc.ZcompType removeZcompType(int index) {
        return (hmh.sap.rfc.ZcompType)baseList().remove(index);
    }

    
    public boolean removeZcompType(hmh.sap.rfc.ZcompType item) {
        return baseList().remove(item);
    }

    
    public boolean containsZcompType(hmh.sap.rfc.ZcompType item) {
        return baseList().contains(item);
    }

    
    public void addAllZcompType(int index, ZcompType_List item) {
        baseList().addAll(index, item);
    }

    
    public int indexOfZcompType(hmh.sap.rfc.ZcompType item) {
        return baseList().indexOf(item);
    }

    
    public ZcompType_List subListZcompType(int fromIndex, int toIndex) {
        return (ZcompType_List)baseList().subList(fromIndex, toIndex);
    }

}
