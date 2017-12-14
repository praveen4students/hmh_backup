package hmh.sap.rfc.util;


public class BapictrType_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.util.List, java.io.Serializable {

    private  static final long serialVersionUID = -1384155293L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:BAPICTR", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", hmh.sap.rfc.BapictrType.class, new hmh.sap.rfc.BapictrType(), new java.lang.String[][]{}, 129, 258, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"BAPICTR\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Communciation Fields: SD Contract Data</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>110</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>129</ifr:internalLength1><ifr:internalLength2>258</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  BapictrType_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public void addBapictrType(hmh.sap.rfc.BapictrType item) {
        baseList().add(item);
    }

    
    public void addAllBapictrType(BapictrType_List item) {
        baseList().addAll(item);
    }

    
    public boolean removeBapictrType(hmh.sap.rfc.BapictrType item) {
        return baseList().remove(item);
    }

    
    public void addBapictrType(int index, hmh.sap.rfc.BapictrType item) {
        baseList().add(index, item);
    }

    
    public boolean containsBapictrType(hmh.sap.rfc.BapictrType item) {
        return baseList().contains(item);
    }

    
    public hmh.sap.rfc.BapictrType[] toArrayBapictrType() {
        return (hmh.sap.rfc.BapictrType[])baseList().toArray(new hmh.sap.rfc.BapictrType[] {});
    }

    
    public int lastIndexOfBapictrType(hmh.sap.rfc.BapictrType item) {
        return baseList().lastIndexOf(item);
    }

    
    public hmh.sap.rfc.BapictrType removeBapictrType(int index) {
        return (hmh.sap.rfc.BapictrType)baseList().remove(index);
    }

    
    public boolean containsAllBapictrType(BapictrType_List item) {
        return baseList().containsAll(item);
    }

    
    public BapictrType_List subListBapictrType(int fromIndex, int toIndex) {
        return (BapictrType_List)baseList().subList(fromIndex, toIndex);
    }

    
    public hmh.sap.rfc.BapictrType getBapictrType(int index) {
        return (hmh.sap.rfc.BapictrType)baseList().get(index);
    }

    
    public hmh.sap.rfc.BapictrType setBapictrType(int index, hmh.sap.rfc.BapictrType item) {
        return (hmh.sap.rfc.BapictrType)baseList().set(index, item);
    }

    
    public void addAllBapictrType(int index, BapictrType_List item) {
        baseList().addAll(index, item);
    }

    
    public int indexOfBapictrType(hmh.sap.rfc.BapictrType item) {
        return baseList().indexOf(item);
    }

}
