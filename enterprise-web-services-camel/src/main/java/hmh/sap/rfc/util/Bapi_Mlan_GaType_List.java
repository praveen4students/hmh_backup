package hmh.sap.rfc.util;


public class Bapi_Mlan_GaType_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.util.List, java.io.Serializable {

    private  static final long serialVersionUID = 2080146848L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:BAPI_MLAN_GA", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", hmh.sap.rfc.Bapi_Mlan_GaType.class, new hmh.sap.rfc.Bapi_Mlan_GaType(), new java.lang.String[][]{}, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"BAPI_MLAN_GA\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Control Data</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  Bapi_Mlan_GaType_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public hmh.sap.rfc.Bapi_Mlan_GaType removeBapi_Mlan_GaType(int index) {
        return (hmh.sap.rfc.Bapi_Mlan_GaType)baseList().remove(index);
    }

    
    public void addAllBapi_Mlan_GaType(int index, Bapi_Mlan_GaType_List item) {
        baseList().addAll(index, item);
    }

    
    public hmh.sap.rfc.Bapi_Mlan_GaType getBapi_Mlan_GaType(int index) {
        return (hmh.sap.rfc.Bapi_Mlan_GaType)baseList().get(index);
    }

    
    public void addBapi_Mlan_GaType(hmh.sap.rfc.Bapi_Mlan_GaType item) {
        baseList().add(item);
    }

    
    public int lastIndexOfBapi_Mlan_GaType(hmh.sap.rfc.Bapi_Mlan_GaType item) {
        return baseList().lastIndexOf(item);
    }

    
    public Bapi_Mlan_GaType_List subListBapi_Mlan_GaType(int fromIndex, int toIndex) {
        return (Bapi_Mlan_GaType_List)baseList().subList(fromIndex, toIndex);
    }

    
    public boolean removeBapi_Mlan_GaType(hmh.sap.rfc.Bapi_Mlan_GaType item) {
        return baseList().remove(item);
    }

    
    public boolean containsBapi_Mlan_GaType(hmh.sap.rfc.Bapi_Mlan_GaType item) {
        return baseList().contains(item);
    }

    
    public void addBapi_Mlan_GaType(int index, hmh.sap.rfc.Bapi_Mlan_GaType item) {
        baseList().add(index, item);
    }

    
    public boolean containsAllBapi_Mlan_GaType(Bapi_Mlan_GaType_List item) {
        return baseList().containsAll(item);
    }

    
    public hmh.sap.rfc.Bapi_Mlan_GaType[] toArrayBapi_Mlan_GaType() {
        return (hmh.sap.rfc.Bapi_Mlan_GaType[])baseList().toArray(new hmh.sap.rfc.Bapi_Mlan_GaType[] {});
    }

    
    public hmh.sap.rfc.Bapi_Mlan_GaType setBapi_Mlan_GaType(int index, hmh.sap.rfc.Bapi_Mlan_GaType item) {
        return (hmh.sap.rfc.Bapi_Mlan_GaType)baseList().set(index, item);
    }

    
    public void addAllBapi_Mlan_GaType(Bapi_Mlan_GaType_List item) {
        baseList().addAll(item);
    }

    
    public int indexOfBapi_Mlan_GaType(hmh.sap.rfc.Bapi_Mlan_GaType item) {
        return baseList().indexOf(item);
    }

}
