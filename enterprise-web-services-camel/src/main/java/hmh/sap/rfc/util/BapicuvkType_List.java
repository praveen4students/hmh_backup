package hmh.sap.rfc.util;


public class BapicuvkType_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.util.List, java.io.Serializable {

    private  static final long serialVersionUID = 1063026969L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:BAPICUVK", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", hmh.sap.rfc.BapicuvkType.class, new hmh.sap.rfc.BapicuvkType(), new java.lang.String[][]{}, 55, 110, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"BAPICUVK\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Variant Condition Keys in Configurations</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>110</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>55</ifr:internalLength1><ifr:internalLength2>110</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  BapicuvkType_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public int lastIndexOfBapicuvkType(hmh.sap.rfc.BapicuvkType item) {
        return baseList().lastIndexOf(item);
    }

    
    public hmh.sap.rfc.BapicuvkType[] toArrayBapicuvkType() {
        return (hmh.sap.rfc.BapicuvkType[])baseList().toArray(new hmh.sap.rfc.BapicuvkType[] {});
    }

    
    public hmh.sap.rfc.BapicuvkType removeBapicuvkType(int index) {
        return (hmh.sap.rfc.BapicuvkType)baseList().remove(index);
    }

    
    public int indexOfBapicuvkType(hmh.sap.rfc.BapicuvkType item) {
        return baseList().indexOf(item);
    }

    
    public boolean containsAllBapicuvkType(BapicuvkType_List item) {
        return baseList().containsAll(item);
    }

    
    public hmh.sap.rfc.BapicuvkType setBapicuvkType(int index, hmh.sap.rfc.BapicuvkType item) {
        return (hmh.sap.rfc.BapicuvkType)baseList().set(index, item);
    }

    
    public BapicuvkType_List subListBapicuvkType(int fromIndex, int toIndex) {
        return (BapicuvkType_List)baseList().subList(fromIndex, toIndex);
    }

    
    public hmh.sap.rfc.BapicuvkType getBapicuvkType(int index) {
        return (hmh.sap.rfc.BapicuvkType)baseList().get(index);
    }

    
    public void addBapicuvkType(hmh.sap.rfc.BapicuvkType item) {
        baseList().add(item);
    }

    
    public void addAllBapicuvkType(BapicuvkType_List item) {
        baseList().addAll(item);
    }

    
    public boolean removeBapicuvkType(hmh.sap.rfc.BapicuvkType item) {
        return baseList().remove(item);
    }

    
    public void addAllBapicuvkType(int index, BapicuvkType_List item) {
        baseList().addAll(index, item);
    }

    
    public void addBapicuvkType(int index, hmh.sap.rfc.BapicuvkType item) {
        baseList().add(index, item);
    }

    
    public boolean containsBapicuvkType(hmh.sap.rfc.BapicuvkType item) {
        return baseList().contains(item);
    }

}
