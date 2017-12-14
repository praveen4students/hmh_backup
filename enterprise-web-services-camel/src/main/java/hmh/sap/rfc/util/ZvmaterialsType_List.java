package hmh.sap.rfc.util;


public class ZvmaterialsType_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.util.List, java.io.Serializable {

    private  static final long serialVersionUID = 1877710762L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:ZVMATERIALS", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", hmh.sap.rfc.ZvmaterialsType.class, new hmh.sap.rfc.ZvmaterialsType(), new java.lang.String[][]{}, 18, 36, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"ZVMATERIALS\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Material Numbers</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>18</ifr:internalLength1><ifr:internalLength2>36</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  ZvmaterialsType_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public ZvmaterialsType_List subListZvmaterialsType(int fromIndex, int toIndex) {
        return (ZvmaterialsType_List)baseList().subList(fromIndex, toIndex);
    }

    
    public hmh.sap.rfc.ZvmaterialsType getZvmaterialsType(int index) {
        return (hmh.sap.rfc.ZvmaterialsType)baseList().get(index);
    }

    
    public hmh.sap.rfc.ZvmaterialsType[] toArrayZvmaterialsType() {
        return (hmh.sap.rfc.ZvmaterialsType[])baseList().toArray(new hmh.sap.rfc.ZvmaterialsType[] {});
    }

    
    public boolean containsAllZvmaterialsType(ZvmaterialsType_List item) {
        return baseList().containsAll(item);
    }

    
    public int lastIndexOfZvmaterialsType(hmh.sap.rfc.ZvmaterialsType item) {
        return baseList().lastIndexOf(item);
    }

    
    public hmh.sap.rfc.ZvmaterialsType removeZvmaterialsType(int index) {
        return (hmh.sap.rfc.ZvmaterialsType)baseList().remove(index);
    }

    
    public void addAllZvmaterialsType(int index, ZvmaterialsType_List item) {
        baseList().addAll(index, item);
    }

    
    public int indexOfZvmaterialsType(hmh.sap.rfc.ZvmaterialsType item) {
        return baseList().indexOf(item);
    }

    
    public boolean containsZvmaterialsType(hmh.sap.rfc.ZvmaterialsType item) {
        return baseList().contains(item);
    }

    
    public void addAllZvmaterialsType(ZvmaterialsType_List item) {
        baseList().addAll(item);
    }

    
    public hmh.sap.rfc.ZvmaterialsType setZvmaterialsType(int index, hmh.sap.rfc.ZvmaterialsType item) {
        return (hmh.sap.rfc.ZvmaterialsType)baseList().set(index, item);
    }

    
    public void addZvmaterialsType(hmh.sap.rfc.ZvmaterialsType item) {
        baseList().add(item);
    }

    
    public void addZvmaterialsType(int index, hmh.sap.rfc.ZvmaterialsType item) {
        baseList().add(index, item);
    }

    
    public boolean removeZvmaterialsType(hmh.sap.rfc.ZvmaterialsType item) {
        return baseList().remove(item);
    }

}
