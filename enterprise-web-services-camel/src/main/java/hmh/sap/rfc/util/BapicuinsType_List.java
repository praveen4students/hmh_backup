package hmh.sap.rfc.util;


public class BapicuinsType_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.util.List, java.io.Serializable {

    private  static final long serialVersionUID = 54875134L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:BAPICUINS", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", hmh.sap.rfc.BapicuinsType.class, new hmh.sap.rfc.BapicuinsType(), new java.lang.String[][]{}, 233, 466, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"BAPICUINS\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Instances of several configurations</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>110</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>233</ifr:internalLength1><ifr:internalLength2>466</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  BapicuinsType_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public void addAllBapicuinsType(BapicuinsType_List item) {
        baseList().addAll(item);
    }

    
    public hmh.sap.rfc.BapicuinsType setBapicuinsType(int index, hmh.sap.rfc.BapicuinsType item) {
        return (hmh.sap.rfc.BapicuinsType)baseList().set(index, item);
    }

    
    public void addAllBapicuinsType(int index, BapicuinsType_List item) {
        baseList().addAll(index, item);
    }

    
    public boolean containsBapicuinsType(hmh.sap.rfc.BapicuinsType item) {
        return baseList().contains(item);
    }

    
    public int lastIndexOfBapicuinsType(hmh.sap.rfc.BapicuinsType item) {
        return baseList().lastIndexOf(item);
    }

    
    public hmh.sap.rfc.BapicuinsType[] toArrayBapicuinsType() {
        return (hmh.sap.rfc.BapicuinsType[])baseList().toArray(new hmh.sap.rfc.BapicuinsType[] {});
    }

    
    public hmh.sap.rfc.BapicuinsType removeBapicuinsType(int index) {
        return (hmh.sap.rfc.BapicuinsType)baseList().remove(index);
    }

    
    public hmh.sap.rfc.BapicuinsType getBapicuinsType(int index) {
        return (hmh.sap.rfc.BapicuinsType)baseList().get(index);
    }

    
    public boolean removeBapicuinsType(hmh.sap.rfc.BapicuinsType item) {
        return baseList().remove(item);
    }

    
    public void addBapicuinsType(int index, hmh.sap.rfc.BapicuinsType item) {
        baseList().add(index, item);
    }

    
    public boolean containsAllBapicuinsType(BapicuinsType_List item) {
        return baseList().containsAll(item);
    }

    
    public void addBapicuinsType(hmh.sap.rfc.BapicuinsType item) {
        baseList().add(item);
    }

    
    public BapicuinsType_List subListBapicuinsType(int fromIndex, int toIndex) {
        return (BapicuinsType_List)baseList().subList(fromIndex, toIndex);
    }

    
    public int indexOfBapicuinsType(hmh.sap.rfc.BapicuinsType item) {
        return baseList().indexOf(item);
    }

}
