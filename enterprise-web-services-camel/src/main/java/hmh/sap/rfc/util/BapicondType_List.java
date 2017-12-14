package hmh.sap.rfc.util;


public class BapicondType_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.util.List, java.io.Serializable {

    private  static final long serialVersionUID = -202525676L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:BAPICOND", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", hmh.sap.rfc.BapicondType.class, new hmh.sap.rfc.BapicondType(), new java.lang.String[][]{}, 336, 560, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"BAPICOND\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Communication Fields for Maintaining Conditions in the Order</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>110</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>336</ifr:internalLength1><ifr:internalLength2>560</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  BapicondType_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public hmh.sap.rfc.BapicondType getBapicondType(int index) {
        return (hmh.sap.rfc.BapicondType)baseList().get(index);
    }

    
    public hmh.sap.rfc.BapicondType removeBapicondType(int index) {
        return (hmh.sap.rfc.BapicondType)baseList().remove(index);
    }

    
    public int indexOfBapicondType(hmh.sap.rfc.BapicondType item) {
        return baseList().indexOf(item);
    }

    
    public hmh.sap.rfc.BapicondType setBapicondType(int index, hmh.sap.rfc.BapicondType item) {
        return (hmh.sap.rfc.BapicondType)baseList().set(index, item);
    }

    
    public BapicondType_List subListBapicondType(int fromIndex, int toIndex) {
        return (BapicondType_List)baseList().subList(fromIndex, toIndex);
    }

    
    public void addBapicondType(hmh.sap.rfc.BapicondType item) {
        baseList().add(item);
    }

    
    public void addBapicondType(int index, hmh.sap.rfc.BapicondType item) {
        baseList().add(index, item);
    }

    
    public void addAllBapicondType(BapicondType_List item) {
        baseList().addAll(item);
    }

    
    public int lastIndexOfBapicondType(hmh.sap.rfc.BapicondType item) {
        return baseList().lastIndexOf(item);
    }

    
    public void addAllBapicondType(int index, BapicondType_List item) {
        baseList().addAll(index, item);
    }

    
    public boolean containsAllBapicondType(BapicondType_List item) {
        return baseList().containsAll(item);
    }

    
    public boolean removeBapicondType(hmh.sap.rfc.BapicondType item) {
        return baseList().remove(item);
    }

    
    public hmh.sap.rfc.BapicondType[] toArrayBapicondType() {
        return (hmh.sap.rfc.BapicondType[])baseList().toArray(new hmh.sap.rfc.BapicondType[] {});
    }

    
    public boolean containsBapicondType(hmh.sap.rfc.BapicondType item) {
        return baseList().contains(item);
    }

}
