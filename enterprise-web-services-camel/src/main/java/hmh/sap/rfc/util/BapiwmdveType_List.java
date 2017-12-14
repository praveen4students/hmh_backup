package hmh.sap.rfc.util;


public class BapiwmdveType_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.util.List, java.io.Serializable {

    private  static final long serialVersionUID = 1576463551L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:BAPIWMDVE", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", hmh.sap.rfc.BapiwmdveType.class, new hmh.sap.rfc.BapiwmdveType(), new java.lang.String[][]{}, 35, 58, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"BAPIWMDVE\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Results of Availability Check - ATP Info in Internet</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>35</ifr:internalLength1><ifr:internalLength2>58</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  BapiwmdveType_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public hmh.sap.rfc.BapiwmdveType[] toArrayBapiwmdveType() {
        return (hmh.sap.rfc.BapiwmdveType[])baseList().toArray(new hmh.sap.rfc.BapiwmdveType[] {});
    }

    
    public boolean containsBapiwmdveType(hmh.sap.rfc.BapiwmdveType item) {
        return baseList().contains(item);
    }

    
    public int indexOfBapiwmdveType(hmh.sap.rfc.BapiwmdveType item) {
        return baseList().indexOf(item);
    }

    
    public hmh.sap.rfc.BapiwmdveType removeBapiwmdveType(int index) {
        return (hmh.sap.rfc.BapiwmdveType)baseList().remove(index);
    }

    
    public boolean containsAllBapiwmdveType(BapiwmdveType_List item) {
        return baseList().containsAll(item);
    }

    
    public void addBapiwmdveType(int index, hmh.sap.rfc.BapiwmdveType item) {
        baseList().add(index, item);
    }

    
    public void addBapiwmdveType(hmh.sap.rfc.BapiwmdveType item) {
        baseList().add(item);
    }

    
    public void addAllBapiwmdveType(BapiwmdveType_List item) {
        baseList().addAll(item);
    }

    
    public hmh.sap.rfc.BapiwmdveType getBapiwmdveType(int index) {
        return (hmh.sap.rfc.BapiwmdveType)baseList().get(index);
    }

    
    public void addAllBapiwmdveType(int index, BapiwmdveType_List item) {
        baseList().addAll(index, item);
    }

    
    public int lastIndexOfBapiwmdveType(hmh.sap.rfc.BapiwmdveType item) {
        return baseList().lastIndexOf(item);
    }

    
    public BapiwmdveType_List subListBapiwmdveType(int fromIndex, int toIndex) {
        return (BapiwmdveType_List)baseList().subList(fromIndex, toIndex);
    }

    
    public hmh.sap.rfc.BapiwmdveType setBapiwmdveType(int index, hmh.sap.rfc.BapiwmdveType item) {
        return (hmh.sap.rfc.BapiwmdveType)baseList().set(index, item);
    }

    
    public boolean removeBapiwmdveType(hmh.sap.rfc.BapiwmdveType item) {
        return baseList().remove(item);
    }

}
