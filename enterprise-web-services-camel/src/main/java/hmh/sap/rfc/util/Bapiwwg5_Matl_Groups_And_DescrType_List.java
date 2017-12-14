package hmh.sap.rfc.util;


public class Bapiwwg5_Matl_Groups_And_DescrType_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.util.List, java.io.Serializable {

    private  static final long serialVersionUID = 613312898L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:BAPIWWG5_MATL_GROUPS_AND_DESCR", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", hmh.sap.rfc.Bapiwwg5_Matl_Groups_And_DescrType.class, new hmh.sap.rfc.Bapiwwg5_Matl_Groups_And_DescrType(), new java.lang.String[][]{}, 29, 58, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"BAPIWWG5_MATL_GROUPS_AND_DESCR\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Structure for BAPI Output Table Matl Grp(s) and Descriptions</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>29</ifr:internalLength1><ifr:internalLength2>58</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  Bapiwwg5_Matl_Groups_And_DescrType_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public hmh.sap.rfc.Bapiwwg5_Matl_Groups_And_DescrType setBapiwwg5_Matl_Groups_And_DescrType(int index, hmh.sap.rfc.Bapiwwg5_Matl_Groups_And_DescrType item) {
        return (hmh.sap.rfc.Bapiwwg5_Matl_Groups_And_DescrType)baseList().set(index, item);
    }

    
    public void addAllBapiwwg5_Matl_Groups_And_DescrType(Bapiwwg5_Matl_Groups_And_DescrType_List item) {
        baseList().addAll(item);
    }

    
    public hmh.sap.rfc.Bapiwwg5_Matl_Groups_And_DescrType[] toArrayBapiwwg5_Matl_Groups_And_DescrType() {
        return (hmh.sap.rfc.Bapiwwg5_Matl_Groups_And_DescrType[])baseList().toArray(new hmh.sap.rfc.Bapiwwg5_Matl_Groups_And_DescrType[] {});
    }

    
    public void addBapiwwg5_Matl_Groups_And_DescrType(int index, hmh.sap.rfc.Bapiwwg5_Matl_Groups_And_DescrType item) {
        baseList().add(index, item);
    }

    
    public boolean removeBapiwwg5_Matl_Groups_And_DescrType(hmh.sap.rfc.Bapiwwg5_Matl_Groups_And_DescrType item) {
        return baseList().remove(item);
    }

    
    public Bapiwwg5_Matl_Groups_And_DescrType_List subListBapiwwg5_Matl_Groups_And_DescrType(int fromIndex, int toIndex) {
        return (Bapiwwg5_Matl_Groups_And_DescrType_List)baseList().subList(fromIndex, toIndex);
    }

    
    public void addAllBapiwwg5_Matl_Groups_And_DescrType(int index, Bapiwwg5_Matl_Groups_And_DescrType_List item) {
        baseList().addAll(index, item);
    }

    
    public int lastIndexOfBapiwwg5_Matl_Groups_And_DescrType(hmh.sap.rfc.Bapiwwg5_Matl_Groups_And_DescrType item) {
        return baseList().lastIndexOf(item);
    }

    
    public hmh.sap.rfc.Bapiwwg5_Matl_Groups_And_DescrType getBapiwwg5_Matl_Groups_And_DescrType(int index) {
        return (hmh.sap.rfc.Bapiwwg5_Matl_Groups_And_DescrType)baseList().get(index);
    }

    
    public boolean containsBapiwwg5_Matl_Groups_And_DescrType(hmh.sap.rfc.Bapiwwg5_Matl_Groups_And_DescrType item) {
        return baseList().contains(item);
    }

    
    public void addBapiwwg5_Matl_Groups_And_DescrType(hmh.sap.rfc.Bapiwwg5_Matl_Groups_And_DescrType item) {
        baseList().add(item);
    }

    
    public boolean containsAllBapiwwg5_Matl_Groups_And_DescrType(Bapiwwg5_Matl_Groups_And_DescrType_List item) {
        return baseList().containsAll(item);
    }

    
    public int indexOfBapiwwg5_Matl_Groups_And_DescrType(hmh.sap.rfc.Bapiwwg5_Matl_Groups_And_DescrType item) {
        return baseList().indexOf(item);
    }

    
    public hmh.sap.rfc.Bapiwwg5_Matl_Groups_And_DescrType removeBapiwwg5_Matl_Groups_And_DescrType(int index) {
        return (hmh.sap.rfc.Bapiwwg5_Matl_Groups_And_DescrType)baseList().remove(index);
    }

}
