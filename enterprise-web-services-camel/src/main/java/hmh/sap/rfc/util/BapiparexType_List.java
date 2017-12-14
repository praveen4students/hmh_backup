package hmh.sap.rfc.util;


public class BapiparexType_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.util.List, java.io.Serializable {

    private  static final long serialVersionUID = 975856342L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:BAPIPAREX", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", hmh.sap.rfc.BapiparexType.class, new hmh.sap.rfc.BapiparexType(), new java.lang.String[][]{}, 990, 1980, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"BAPIPAREX\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Ref. structure for BAPI parameter ExtensionIn/ExtensionOut</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>110</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>990</ifr:internalLength1><ifr:internalLength2>1980</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  BapiparexType_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public boolean containsAllBapiparexType(BapiparexType_List item) {
        return baseList().containsAll(item);
    }

    
    public void addBapiparexType(int index, hmh.sap.rfc.BapiparexType item) {
        baseList().add(index, item);
    }

    
    public hmh.sap.rfc.BapiparexType getBapiparexType(int index) {
        return (hmh.sap.rfc.BapiparexType)baseList().get(index);
    }

    
    public void addAllBapiparexType(BapiparexType_List item) {
        baseList().addAll(item);
    }

    
    public int indexOfBapiparexType(hmh.sap.rfc.BapiparexType item) {
        return baseList().indexOf(item);
    }

    
    public hmh.sap.rfc.BapiparexType[] toArrayBapiparexType() {
        return (hmh.sap.rfc.BapiparexType[])baseList().toArray(new hmh.sap.rfc.BapiparexType[] {});
    }

    
    public boolean removeBapiparexType(hmh.sap.rfc.BapiparexType item) {
        return baseList().remove(item);
    }

    
    public boolean containsBapiparexType(hmh.sap.rfc.BapiparexType item) {
        return baseList().contains(item);
    }

    
    public hmh.sap.rfc.BapiparexType removeBapiparexType(int index) {
        return (hmh.sap.rfc.BapiparexType)baseList().remove(index);
    }

    
    public BapiparexType_List subListBapiparexType(int fromIndex, int toIndex) {
        return (BapiparexType_List)baseList().subList(fromIndex, toIndex);
    }

    
    public void addAllBapiparexType(int index, BapiparexType_List item) {
        baseList().addAll(index, item);
    }

    
    public void addBapiparexType(hmh.sap.rfc.BapiparexType item) {
        baseList().add(item);
    }

    
    public int lastIndexOfBapiparexType(hmh.sap.rfc.BapiparexType item) {
        return baseList().lastIndexOf(item);
    }

    
    public hmh.sap.rfc.BapiparexType setBapiparexType(int index, hmh.sap.rfc.BapiparexType item) {
        return (hmh.sap.rfc.BapiparexType)baseList().set(index, item);
    }

}
