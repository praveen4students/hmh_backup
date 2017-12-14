package hmh.sap.rfc.util;


public class ZvcustsubType_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.util.List, java.io.Serializable {

    private  static final long serialVersionUID = -581227765L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:ZVCUSTSUB", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", hmh.sap.rfc.ZvcustsubType.class, new hmh.sap.rfc.ZvcustsubType(), new java.lang.String[][]{}, 98, 196, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"ZVCUSTSUB\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Customer Substitution material Details</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>98</ifr:internalLength1><ifr:internalLength2>196</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  ZvcustsubType_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public hmh.sap.rfc.ZvcustsubType getZvcustsubType(int index) {
        return (hmh.sap.rfc.ZvcustsubType)baseList().get(index);
    }

    
    public boolean containsAllZvcustsubType(ZvcustsubType_List item) {
        return baseList().containsAll(item);
    }

    
    public int indexOfZvcustsubType(hmh.sap.rfc.ZvcustsubType item) {
        return baseList().indexOf(item);
    }

    
    public int lastIndexOfZvcustsubType(hmh.sap.rfc.ZvcustsubType item) {
        return baseList().lastIndexOf(item);
    }

    
    public void addZvcustsubType(hmh.sap.rfc.ZvcustsubType item) {
        baseList().add(item);
    }

    
    public void addAllZvcustsubType(ZvcustsubType_List item) {
        baseList().addAll(item);
    }

    
    public boolean containsZvcustsubType(hmh.sap.rfc.ZvcustsubType item) {
        return baseList().contains(item);
    }

    
    public hmh.sap.rfc.ZvcustsubType setZvcustsubType(int index, hmh.sap.rfc.ZvcustsubType item) {
        return (hmh.sap.rfc.ZvcustsubType)baseList().set(index, item);
    }

    
    public void addZvcustsubType(int index, hmh.sap.rfc.ZvcustsubType item) {
        baseList().add(index, item);
    }

    
    public hmh.sap.rfc.ZvcustsubType[] toArrayZvcustsubType() {
        return (hmh.sap.rfc.ZvcustsubType[])baseList().toArray(new hmh.sap.rfc.ZvcustsubType[] {});
    }

    
    public void addAllZvcustsubType(int index, ZvcustsubType_List item) {
        baseList().addAll(index, item);
    }

    
    public hmh.sap.rfc.ZvcustsubType removeZvcustsubType(int index) {
        return (hmh.sap.rfc.ZvcustsubType)baseList().remove(index);
    }

    
    public boolean removeZvcustsubType(hmh.sap.rfc.ZvcustsubType item) {
        return baseList().remove(item);
    }

    
    public ZvcustsubType_List subListZvcustsubType(int fromIndex, int toIndex) {
        return (ZvcustsubType_List)baseList().subList(fromIndex, toIndex);
    }

}
