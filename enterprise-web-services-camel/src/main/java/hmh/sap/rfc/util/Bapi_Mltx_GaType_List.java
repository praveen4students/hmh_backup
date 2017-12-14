package hmh.sap.rfc.util;


public class Bapi_Mltx_GaType_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.util.List, java.io.Serializable {

    private  static final long serialVersionUID = -1948482711L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:BAPI_MLTX_GA", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", hmh.sap.rfc.Bapi_Mltx_GaType.class, new hmh.sap.rfc.Bapi_Mltx_GaType(), new java.lang.String[][]{}, 221, 442, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"BAPI_MLTX_GA\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Long Texts</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>221</ifr:internalLength1><ifr:internalLength2>442</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  Bapi_Mltx_GaType_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public hmh.sap.rfc.Bapi_Mltx_GaType removeBapi_Mltx_GaType(int index) {
        return (hmh.sap.rfc.Bapi_Mltx_GaType)baseList().remove(index);
    }

    
    public hmh.sap.rfc.Bapi_Mltx_GaType[] toArrayBapi_Mltx_GaType() {
        return (hmh.sap.rfc.Bapi_Mltx_GaType[])baseList().toArray(new hmh.sap.rfc.Bapi_Mltx_GaType[] {});
    }

    
    public boolean removeBapi_Mltx_GaType(hmh.sap.rfc.Bapi_Mltx_GaType item) {
        return baseList().remove(item);
    }

    
    public boolean containsBapi_Mltx_GaType(hmh.sap.rfc.Bapi_Mltx_GaType item) {
        return baseList().contains(item);
    }

    
    public int lastIndexOfBapi_Mltx_GaType(hmh.sap.rfc.Bapi_Mltx_GaType item) {
        return baseList().lastIndexOf(item);
    }

    
    public void addAllBapi_Mltx_GaType(Bapi_Mltx_GaType_List item) {
        baseList().addAll(item);
    }

    
    public void addAllBapi_Mltx_GaType(int index, Bapi_Mltx_GaType_List item) {
        baseList().addAll(index, item);
    }

    
    public hmh.sap.rfc.Bapi_Mltx_GaType getBapi_Mltx_GaType(int index) {
        return (hmh.sap.rfc.Bapi_Mltx_GaType)baseList().get(index);
    }

    
    public int indexOfBapi_Mltx_GaType(hmh.sap.rfc.Bapi_Mltx_GaType item) {
        return baseList().indexOf(item);
    }

    
    public hmh.sap.rfc.Bapi_Mltx_GaType setBapi_Mltx_GaType(int index, hmh.sap.rfc.Bapi_Mltx_GaType item) {
        return (hmh.sap.rfc.Bapi_Mltx_GaType)baseList().set(index, item);
    }

    
    public void addBapi_Mltx_GaType(hmh.sap.rfc.Bapi_Mltx_GaType item) {
        baseList().add(item);
    }

    
    public void addBapi_Mltx_GaType(int index, hmh.sap.rfc.Bapi_Mltx_GaType item) {
        baseList().add(index, item);
    }

    
    public Bapi_Mltx_GaType_List subListBapi_Mltx_GaType(int fromIndex, int toIndex) {
        return (Bapi_Mltx_GaType_List)baseList().subList(fromIndex, toIndex);
    }

    
    public boolean containsAllBapi_Mltx_GaType(Bapi_Mltx_GaType_List item) {
        return baseList().containsAll(item);
    }

}
