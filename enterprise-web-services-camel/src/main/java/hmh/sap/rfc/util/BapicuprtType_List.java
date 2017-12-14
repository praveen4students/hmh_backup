package hmh.sap.rfc.util;


public class BapicuprtType_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.util.List, java.io.Serializable {

    private  static final long serialVersionUID = 2087873730L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:BAPICUPRT", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", hmh.sap.rfc.BapicuprtType.class, new hmh.sap.rfc.BapicuprtType(), new java.lang.String[][]{}, 123, 246, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"BAPICUPRT\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Part_of Entries of Several Configurations</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>110</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>123</ifr:internalLength1><ifr:internalLength2>246</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  BapicuprtType_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public boolean containsAllBapicuprtType(BapicuprtType_List item) {
        return baseList().containsAll(item);
    }

    
    public hmh.sap.rfc.BapicuprtType removeBapicuprtType(int index) {
        return (hmh.sap.rfc.BapicuprtType)baseList().remove(index);
    }

    
    public hmh.sap.rfc.BapicuprtType getBapicuprtType(int index) {
        return (hmh.sap.rfc.BapicuprtType)baseList().get(index);
    }

    
    public void addAllBapicuprtType(int index, BapicuprtType_List item) {
        baseList().addAll(index, item);
    }

    
    public void addAllBapicuprtType(BapicuprtType_List item) {
        baseList().addAll(item);
    }

    
    public int indexOfBapicuprtType(hmh.sap.rfc.BapicuprtType item) {
        return baseList().indexOf(item);
    }

    
    public boolean removeBapicuprtType(hmh.sap.rfc.BapicuprtType item) {
        return baseList().remove(item);
    }

    
    public boolean containsBapicuprtType(hmh.sap.rfc.BapicuprtType item) {
        return baseList().contains(item);
    }

    
    public hmh.sap.rfc.BapicuprtType setBapicuprtType(int index, hmh.sap.rfc.BapicuprtType item) {
        return (hmh.sap.rfc.BapicuprtType)baseList().set(index, item);
    }

    
    public hmh.sap.rfc.BapicuprtType[] toArrayBapicuprtType() {
        return (hmh.sap.rfc.BapicuprtType[])baseList().toArray(new hmh.sap.rfc.BapicuprtType[] {});
    }

    
    public void addBapicuprtType(hmh.sap.rfc.BapicuprtType item) {
        baseList().add(item);
    }

    
    public void addBapicuprtType(int index, hmh.sap.rfc.BapicuprtType item) {
        baseList().add(index, item);
    }

    
    public int lastIndexOfBapicuprtType(hmh.sap.rfc.BapicuprtType item) {
        return baseList().lastIndexOf(item);
    }

    
    public BapicuprtType_List subListBapicuprtType(int fromIndex, int toIndex) {
        return (BapicuprtType_List)baseList().subList(fromIndex, toIndex);
    }

}
