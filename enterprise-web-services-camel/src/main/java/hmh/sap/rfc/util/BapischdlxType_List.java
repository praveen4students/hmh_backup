package hmh.sap.rfc.util;


public class BapischdlxType_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.util.List, java.io.Serializable {

    private  static final long serialVersionUID = -1169840694L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:BAPISCHDLX", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", hmh.sap.rfc.BapischdlxType.class, new hmh.sap.rfc.BapischdlxType(), new java.lang.String[][]{}, 109, 218, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"BAPISCHDLX\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Checkbox List for Maintaining Sales Document Schedule Line</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>110</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>109</ifr:internalLength1><ifr:internalLength2>218</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  BapischdlxType_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public void addAllBapischdlxType(int index, BapischdlxType_List item) {
        baseList().addAll(index, item);
    }

    
    public BapischdlxType_List subListBapischdlxType(int fromIndex, int toIndex) {
        return (BapischdlxType_List)baseList().subList(fromIndex, toIndex);
    }

    
    public hmh.sap.rfc.BapischdlxType[] toArrayBapischdlxType() {
        return (hmh.sap.rfc.BapischdlxType[])baseList().toArray(new hmh.sap.rfc.BapischdlxType[] {});
    }

    
    public int lastIndexOfBapischdlxType(hmh.sap.rfc.BapischdlxType item) {
        return baseList().lastIndexOf(item);
    }

    
    public void addBapischdlxType(hmh.sap.rfc.BapischdlxType item) {
        baseList().add(item);
    }

    
    public hmh.sap.rfc.BapischdlxType removeBapischdlxType(int index) {
        return (hmh.sap.rfc.BapischdlxType)baseList().remove(index);
    }

    
    public boolean containsBapischdlxType(hmh.sap.rfc.BapischdlxType item) {
        return baseList().contains(item);
    }

    
    public hmh.sap.rfc.BapischdlxType getBapischdlxType(int index) {
        return (hmh.sap.rfc.BapischdlxType)baseList().get(index);
    }

    
    public boolean removeBapischdlxType(hmh.sap.rfc.BapischdlxType item) {
        return baseList().remove(item);
    }

    
    public hmh.sap.rfc.BapischdlxType setBapischdlxType(int index, hmh.sap.rfc.BapischdlxType item) {
        return (hmh.sap.rfc.BapischdlxType)baseList().set(index, item);
    }

    
    public void addBapischdlxType(int index, hmh.sap.rfc.BapischdlxType item) {
        baseList().add(index, item);
    }

    
    public int indexOfBapischdlxType(hmh.sap.rfc.BapischdlxType item) {
        return baseList().indexOf(item);
    }

    
    public boolean containsAllBapischdlxType(BapischdlxType_List item) {
        return baseList().containsAll(item);
    }

    
    public void addAllBapischdlxType(BapischdlxType_List item) {
        baseList().addAll(item);
    }

}
