package hmh.sap.rfc.util;


public class BapimatlstType_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.util.List, java.io.Serializable {

    private  static final long serialVersionUID = 1769841631L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:BAPIMATLST", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", hmh.sap.rfc.BapimatlstType.class, new hmh.sap.rfc.BapimatlstType(), new java.lang.String[][]{}, 140, 280, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"BAPIMATLST\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Material Number and Description</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>140</ifr:internalLength1><ifr:internalLength2>280</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  BapimatlstType_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public void addAllBapimatlstType(int index, BapimatlstType_List item) {
        baseList().addAll(index, item);
    }

    
    public void addAllBapimatlstType(BapimatlstType_List item) {
        baseList().addAll(item);
    }

    
    public boolean containsBapimatlstType(hmh.sap.rfc.BapimatlstType item) {
        return baseList().contains(item);
    }

    
    public hmh.sap.rfc.BapimatlstType setBapimatlstType(int index, hmh.sap.rfc.BapimatlstType item) {
        return (hmh.sap.rfc.BapimatlstType)baseList().set(index, item);
    }

    
    public void addBapimatlstType(int index, hmh.sap.rfc.BapimatlstType item) {
        baseList().add(index, item);
    }

    
    public hmh.sap.rfc.BapimatlstType getBapimatlstType(int index) {
        return (hmh.sap.rfc.BapimatlstType)baseList().get(index);
    }

    
    public boolean removeBapimatlstType(hmh.sap.rfc.BapimatlstType item) {
        return baseList().remove(item);
    }

    
    public BapimatlstType_List subListBapimatlstType(int fromIndex, int toIndex) {
        return (BapimatlstType_List)baseList().subList(fromIndex, toIndex);
    }

    
    public int indexOfBapimatlstType(hmh.sap.rfc.BapimatlstType item) {
        return baseList().indexOf(item);
    }

    
    public hmh.sap.rfc.BapimatlstType[] toArrayBapimatlstType() {
        return (hmh.sap.rfc.BapimatlstType[])baseList().toArray(new hmh.sap.rfc.BapimatlstType[] {});
    }

    
    public void addBapimatlstType(hmh.sap.rfc.BapimatlstType item) {
        baseList().add(item);
    }

    
    public int lastIndexOfBapimatlstType(hmh.sap.rfc.BapimatlstType item) {
        return baseList().lastIndexOf(item);
    }

    
    public boolean containsAllBapimatlstType(BapimatlstType_List item) {
        return baseList().containsAll(item);
    }

    
    public hmh.sap.rfc.BapimatlstType removeBapimatlstType(int index) {
        return (hmh.sap.rfc.BapimatlstType)baseList().remove(index);
    }

}
