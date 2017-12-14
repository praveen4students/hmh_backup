package hmh.sap.rfc.util;


public class BapiwmdvsType_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.util.List, java.io.Serializable {

    private  static final long serialVersionUID = 1589392845L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:BAPIWMDVS", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", hmh.sap.rfc.BapiwmdvsType.class, new hmh.sap.rfc.BapiwmdvsType(), new java.lang.String[][]{}, 24, 32, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"BAPIWMDVS\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Structure for Simulated Reqmts - ATP Internet Information</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>24</ifr:internalLength1><ifr:internalLength2>32</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  BapiwmdvsType_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public void addBapiwmdvsType(hmh.sap.rfc.BapiwmdvsType item) {
        baseList().add(item);
    }

    
    public hmh.sap.rfc.BapiwmdvsType removeBapiwmdvsType(int index) {
        return (hmh.sap.rfc.BapiwmdvsType)baseList().remove(index);
    }

    
    public boolean containsAllBapiwmdvsType(BapiwmdvsType_List item) {
        return baseList().containsAll(item);
    }

    
    public BapiwmdvsType_List subListBapiwmdvsType(int fromIndex, int toIndex) {
        return (BapiwmdvsType_List)baseList().subList(fromIndex, toIndex);
    }

    
    public boolean containsBapiwmdvsType(hmh.sap.rfc.BapiwmdvsType item) {
        return baseList().contains(item);
    }

    
    public void addAllBapiwmdvsType(int index, BapiwmdvsType_List item) {
        baseList().addAll(index, item);
    }

    
    public void addAllBapiwmdvsType(BapiwmdvsType_List item) {
        baseList().addAll(item);
    }

    
    public boolean removeBapiwmdvsType(hmh.sap.rfc.BapiwmdvsType item) {
        return baseList().remove(item);
    }

    
    public int indexOfBapiwmdvsType(hmh.sap.rfc.BapiwmdvsType item) {
        return baseList().indexOf(item);
    }

    
    public void addBapiwmdvsType(int index, hmh.sap.rfc.BapiwmdvsType item) {
        baseList().add(index, item);
    }

    
    public int lastIndexOfBapiwmdvsType(hmh.sap.rfc.BapiwmdvsType item) {
        return baseList().lastIndexOf(item);
    }

    
    public hmh.sap.rfc.BapiwmdvsType setBapiwmdvsType(int index, hmh.sap.rfc.BapiwmdvsType item) {
        return (hmh.sap.rfc.BapiwmdvsType)baseList().set(index, item);
    }

    
    public hmh.sap.rfc.BapiwmdvsType[] toArrayBapiwmdvsType() {
        return (hmh.sap.rfc.BapiwmdvsType[])baseList().toArray(new hmh.sap.rfc.BapiwmdvsType[] {});
    }

    
    public hmh.sap.rfc.BapiwmdvsType getBapiwmdvsType(int index) {
        return (hmh.sap.rfc.BapiwmdvsType)baseList().get(index);
    }

}
