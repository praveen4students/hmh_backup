package hmh.sap.rfc.util;


public class BapitextliType_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.util.List, java.io.Serializable {

    private  static final long serialVersionUID = -1564797348L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:BAPITEXTLI", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", hmh.sap.rfc.BapitextliType.class, new hmh.sap.rfc.BapitextliType(), new java.lang.String[][]{}, 232, 464, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"BAPITEXTLI\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">BAPI Structure for STX_LINES Structure</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>110</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>232</ifr:internalLength1><ifr:internalLength2>464</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  BapitextliType_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public void addAllBapitextliType(BapitextliType_List item) {
        baseList().addAll(item);
    }

    
    public hmh.sap.rfc.BapitextliType setBapitextliType(int index, hmh.sap.rfc.BapitextliType item) {
        return (hmh.sap.rfc.BapitextliType)baseList().set(index, item);
    }

    
    public void addAllBapitextliType(int index, BapitextliType_List item) {
        baseList().addAll(index, item);
    }

    
    public BapitextliType_List subListBapitextliType(int fromIndex, int toIndex) {
        return (BapitextliType_List)baseList().subList(fromIndex, toIndex);
    }

    
    public int indexOfBapitextliType(hmh.sap.rfc.BapitextliType item) {
        return baseList().indexOf(item);
    }

    
    public boolean containsAllBapitextliType(BapitextliType_List item) {
        return baseList().containsAll(item);
    }

    
    public int lastIndexOfBapitextliType(hmh.sap.rfc.BapitextliType item) {
        return baseList().lastIndexOf(item);
    }

    
    public hmh.sap.rfc.BapitextliType getBapitextliType(int index) {
        return (hmh.sap.rfc.BapitextliType)baseList().get(index);
    }

    
    public void addBapitextliType(int index, hmh.sap.rfc.BapitextliType item) {
        baseList().add(index, item);
    }

    
    public boolean containsBapitextliType(hmh.sap.rfc.BapitextliType item) {
        return baseList().contains(item);
    }

    
    public hmh.sap.rfc.BapitextliType removeBapitextliType(int index) {
        return (hmh.sap.rfc.BapitextliType)baseList().remove(index);
    }

    
    public void addBapitextliType(hmh.sap.rfc.BapitextliType item) {
        baseList().add(item);
    }

    
    public boolean removeBapitextliType(hmh.sap.rfc.BapitextliType item) {
        return baseList().remove(item);
    }

    
    public hmh.sap.rfc.BapitextliType[] toArrayBapitextliType() {
        return (hmh.sap.rfc.BapitextliType[])baseList().toArray(new hmh.sap.rfc.BapitextliType[] {});
    }

}
