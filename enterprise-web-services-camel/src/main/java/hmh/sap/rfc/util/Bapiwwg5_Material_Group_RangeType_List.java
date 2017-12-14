package hmh.sap.rfc.util;


public class Bapiwwg5_Material_Group_RangeType_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.util.List, java.io.Serializable {

    private  static final long serialVersionUID = 842257688L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:BAPIWWG5_MATERIAL_GROUP_RANGE", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", hmh.sap.rfc.Bapiwwg5_Material_Group_RangeType.class, new hmh.sap.rfc.Bapiwwg5_Material_Group_RangeType(), new java.lang.String[][]{}, 21, 42, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"BAPIWWG5_MATERIAL_GROUP_RANGE\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Structure for BAPI Range Table Material Groups</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>21</ifr:internalLength1><ifr:internalLength2>42</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  Bapiwwg5_Material_Group_RangeType_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public void addBapiwwg5_Material_Group_RangeType(int index, hmh.sap.rfc.Bapiwwg5_Material_Group_RangeType item) {
        baseList().add(index, item);
    }

    
    public hmh.sap.rfc.Bapiwwg5_Material_Group_RangeType setBapiwwg5_Material_Group_RangeType(int index, hmh.sap.rfc.Bapiwwg5_Material_Group_RangeType item) {
        return (hmh.sap.rfc.Bapiwwg5_Material_Group_RangeType)baseList().set(index, item);
    }

    
    public int lastIndexOfBapiwwg5_Material_Group_RangeType(hmh.sap.rfc.Bapiwwg5_Material_Group_RangeType item) {
        return baseList().lastIndexOf(item);
    }

    
    public hmh.sap.rfc.Bapiwwg5_Material_Group_RangeType[] toArrayBapiwwg5_Material_Group_RangeType() {
        return (hmh.sap.rfc.Bapiwwg5_Material_Group_RangeType[])baseList().toArray(new hmh.sap.rfc.Bapiwwg5_Material_Group_RangeType[] {});
    }

    
    public hmh.sap.rfc.Bapiwwg5_Material_Group_RangeType removeBapiwwg5_Material_Group_RangeType(int index) {
        return (hmh.sap.rfc.Bapiwwg5_Material_Group_RangeType)baseList().remove(index);
    }

    
    public boolean containsBapiwwg5_Material_Group_RangeType(hmh.sap.rfc.Bapiwwg5_Material_Group_RangeType item) {
        return baseList().contains(item);
    }

    
    public hmh.sap.rfc.Bapiwwg5_Material_Group_RangeType getBapiwwg5_Material_Group_RangeType(int index) {
        return (hmh.sap.rfc.Bapiwwg5_Material_Group_RangeType)baseList().get(index);
    }

    
    public int indexOfBapiwwg5_Material_Group_RangeType(hmh.sap.rfc.Bapiwwg5_Material_Group_RangeType item) {
        return baseList().indexOf(item);
    }

    
    public boolean containsAllBapiwwg5_Material_Group_RangeType(Bapiwwg5_Material_Group_RangeType_List item) {
        return baseList().containsAll(item);
    }

    
    public void addAllBapiwwg5_Material_Group_RangeType(Bapiwwg5_Material_Group_RangeType_List item) {
        baseList().addAll(item);
    }

    
    public void addBapiwwg5_Material_Group_RangeType(hmh.sap.rfc.Bapiwwg5_Material_Group_RangeType item) {
        baseList().add(item);
    }

    
    public void addAllBapiwwg5_Material_Group_RangeType(int index, Bapiwwg5_Material_Group_RangeType_List item) {
        baseList().addAll(index, item);
    }

    
    public Bapiwwg5_Material_Group_RangeType_List subListBapiwwg5_Material_Group_RangeType(int fromIndex, int toIndex) {
        return (Bapiwwg5_Material_Group_RangeType_List)baseList().subList(fromIndex, toIndex);
    }

    
    public boolean removeBapiwwg5_Material_Group_RangeType(hmh.sap.rfc.Bapiwwg5_Material_Group_RangeType item) {
        return baseList().remove(item);
    }

}
