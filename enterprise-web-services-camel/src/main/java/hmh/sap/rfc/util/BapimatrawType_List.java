package hmh.sap.rfc.util;


public class BapimatrawType_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.util.List, java.io.Serializable {

    private  static final long serialVersionUID = -2007625030L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:BAPIMATRAW", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", hmh.sap.rfc.BapimatrawType.class, new hmh.sap.rfc.BapimatrawType(), new java.lang.String[][]{}, 11, 22, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"BAPIMATRAW\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Structure for BAPI interface mat.master: Range - plant</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>11</ifr:internalLength1><ifr:internalLength2>22</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  BapimatrawType_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public hmh.sap.rfc.BapimatrawType[] toArrayBapimatrawType() {
        return (hmh.sap.rfc.BapimatrawType[])baseList().toArray(new hmh.sap.rfc.BapimatrawType[] {});
    }

    
    public void addAllBapimatrawType(int index, BapimatrawType_List item) {
        baseList().addAll(index, item);
    }

    
    public BapimatrawType_List subListBapimatrawType(int fromIndex, int toIndex) {
        return (BapimatrawType_List)baseList().subList(fromIndex, toIndex);
    }

    
    public void addBapimatrawType(hmh.sap.rfc.BapimatrawType item) {
        baseList().add(item);
    }

    
    public hmh.sap.rfc.BapimatrawType removeBapimatrawType(int index) {
        return (hmh.sap.rfc.BapimatrawType)baseList().remove(index);
    }

    
    public hmh.sap.rfc.BapimatrawType setBapimatrawType(int index, hmh.sap.rfc.BapimatrawType item) {
        return (hmh.sap.rfc.BapimatrawType)baseList().set(index, item);
    }

    
    public boolean containsAllBapimatrawType(BapimatrawType_List item) {
        return baseList().containsAll(item);
    }

    
    public void addBapimatrawType(int index, hmh.sap.rfc.BapimatrawType item) {
        baseList().add(index, item);
    }

    
    public int indexOfBapimatrawType(hmh.sap.rfc.BapimatrawType item) {
        return baseList().indexOf(item);
    }

    
    public boolean removeBapimatrawType(hmh.sap.rfc.BapimatrawType item) {
        return baseList().remove(item);
    }

    
    public void addAllBapimatrawType(BapimatrawType_List item) {
        baseList().addAll(item);
    }

    
    public boolean containsBapimatrawType(hmh.sap.rfc.BapimatrawType item) {
        return baseList().contains(item);
    }

    
    public int lastIndexOfBapimatrawType(hmh.sap.rfc.BapimatrawType item) {
        return baseList().lastIndexOf(item);
    }

    
    public hmh.sap.rfc.BapimatrawType getBapimatrawType(int index) {
        return (hmh.sap.rfc.BapimatrawType)baseList().get(index);
    }

}
