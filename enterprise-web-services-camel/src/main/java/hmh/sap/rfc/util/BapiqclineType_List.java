package hmh.sap.rfc.util;


public class BapiqclineType_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.util.List, java.io.Serializable {

    private  static final long serialVersionUID = 2081722872L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:BAPIQCLINE", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", hmh.sap.rfc.BapiqclineType.class, new hmh.sap.rfc.BapiqclineType(), new java.lang.String[][]{}, 132, 264, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"BAPIQCLINE\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Transfer structure for lines of text</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>132</ifr:internalLength1><ifr:internalLength2>264</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  BapiqclineType_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public hmh.sap.rfc.BapiqclineType getBapiqclineType(int index) {
        return (hmh.sap.rfc.BapiqclineType)baseList().get(index);
    }

    
    public boolean containsAllBapiqclineType(BapiqclineType_List item) {
        return baseList().containsAll(item);
    }

    
    public void addAllBapiqclineType(int index, BapiqclineType_List item) {
        baseList().addAll(index, item);
    }

    
    public BapiqclineType_List subListBapiqclineType(int fromIndex, int toIndex) {
        return (BapiqclineType_List)baseList().subList(fromIndex, toIndex);
    }

    
    public int indexOfBapiqclineType(hmh.sap.rfc.BapiqclineType item) {
        return baseList().indexOf(item);
    }

    
    public hmh.sap.rfc.BapiqclineType setBapiqclineType(int index, hmh.sap.rfc.BapiqclineType item) {
        return (hmh.sap.rfc.BapiqclineType)baseList().set(index, item);
    }

    
    public boolean containsBapiqclineType(hmh.sap.rfc.BapiqclineType item) {
        return baseList().contains(item);
    }

    
    public void addBapiqclineType(hmh.sap.rfc.BapiqclineType item) {
        baseList().add(item);
    }

    
    public hmh.sap.rfc.BapiqclineType[] toArrayBapiqclineType() {
        return (hmh.sap.rfc.BapiqclineType[])baseList().toArray(new hmh.sap.rfc.BapiqclineType[] {});
    }

    
    public void addBapiqclineType(int index, hmh.sap.rfc.BapiqclineType item) {
        baseList().add(index, item);
    }

    
    public int lastIndexOfBapiqclineType(hmh.sap.rfc.BapiqclineType item) {
        return baseList().lastIndexOf(item);
    }

    
    public void addAllBapiqclineType(BapiqclineType_List item) {
        baseList().addAll(item);
    }

    
    public boolean removeBapiqclineType(hmh.sap.rfc.BapiqclineType item) {
        return baseList().remove(item);
    }

    
    public hmh.sap.rfc.BapiqclineType removeBapiqclineType(int index) {
        return (hmh.sap.rfc.BapiqclineType)baseList().remove(index);
    }

}
