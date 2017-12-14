package hmh.sap.rfc.util;


public class BapisdkeyType_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.util.List, java.io.Serializable {

    private  static final long serialVersionUID = -1134710992L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:BAPISDKEY", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", hmh.sap.rfc.BapisdkeyType.class, new hmh.sap.rfc.BapisdkeyType(), new java.lang.String[][]{}, 189, 378, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"BAPISDKEY\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Key in Sales and Distribution Document</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>110</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>189</ifr:internalLength1><ifr:internalLength2>378</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  BapisdkeyType_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public boolean containsAllBapisdkeyType(BapisdkeyType_List item) {
        return baseList().containsAll(item);
    }

    
    public hmh.sap.rfc.BapisdkeyType removeBapisdkeyType(int index) {
        return (hmh.sap.rfc.BapisdkeyType)baseList().remove(index);
    }

    
    public BapisdkeyType_List subListBapisdkeyType(int fromIndex, int toIndex) {
        return (BapisdkeyType_List)baseList().subList(fromIndex, toIndex);
    }

    
    public boolean removeBapisdkeyType(hmh.sap.rfc.BapisdkeyType item) {
        return baseList().remove(item);
    }

    
    public void addAllBapisdkeyType(int index, BapisdkeyType_List item) {
        baseList().addAll(index, item);
    }

    
    public int indexOfBapisdkeyType(hmh.sap.rfc.BapisdkeyType item) {
        return baseList().indexOf(item);
    }

    
    public boolean containsBapisdkeyType(hmh.sap.rfc.BapisdkeyType item) {
        return baseList().contains(item);
    }

    
    public int lastIndexOfBapisdkeyType(hmh.sap.rfc.BapisdkeyType item) {
        return baseList().lastIndexOf(item);
    }

    
    public hmh.sap.rfc.BapisdkeyType setBapisdkeyType(int index, hmh.sap.rfc.BapisdkeyType item) {
        return (hmh.sap.rfc.BapisdkeyType)baseList().set(index, item);
    }

    
    public void addAllBapisdkeyType(BapisdkeyType_List item) {
        baseList().addAll(item);
    }

    
    public void addBapisdkeyType(hmh.sap.rfc.BapisdkeyType item) {
        baseList().add(item);
    }

    
    public hmh.sap.rfc.BapisdkeyType[] toArrayBapisdkeyType() {
        return (hmh.sap.rfc.BapisdkeyType[])baseList().toArray(new hmh.sap.rfc.BapisdkeyType[] {});
    }

    
    public void addBapisdkeyType(int index, hmh.sap.rfc.BapisdkeyType item) {
        baseList().add(index, item);
    }

    
    public hmh.sap.rfc.BapisdkeyType getBapisdkeyType(int index) {
        return (hmh.sap.rfc.BapisdkeyType)baseList().get(index);
    }

}
