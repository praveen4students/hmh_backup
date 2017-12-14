package hmh.sap.rfc.util;


public class BapiincompType_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.util.List, java.io.Serializable {

    private  static final long serialVersionUID = -837105754L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:BAPIINCOMP", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", hmh.sap.rfc.BapiincompType.class, new hmh.sap.rfc.BapiincompType(), new java.lang.String[][]{}, 122, 244, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"BAPIINCOMP\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Communication Fields: Incompletion</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>110</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>122</ifr:internalLength1><ifr:internalLength2>244</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  BapiincompType_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public hmh.sap.rfc.BapiincompType[] toArrayBapiincompType() {
        return (hmh.sap.rfc.BapiincompType[])baseList().toArray(new hmh.sap.rfc.BapiincompType[] {});
    }

    
    public int lastIndexOfBapiincompType(hmh.sap.rfc.BapiincompType item) {
        return baseList().lastIndexOf(item);
    }

    
    public BapiincompType_List subListBapiincompType(int fromIndex, int toIndex) {
        return (BapiincompType_List)baseList().subList(fromIndex, toIndex);
    }

    
    public int indexOfBapiincompType(hmh.sap.rfc.BapiincompType item) {
        return baseList().indexOf(item);
    }

    
    public boolean removeBapiincompType(hmh.sap.rfc.BapiincompType item) {
        return baseList().remove(item);
    }

    
    public void addBapiincompType(hmh.sap.rfc.BapiincompType item) {
        baseList().add(item);
    }

    
    public void addAllBapiincompType(int index, BapiincompType_List item) {
        baseList().addAll(index, item);
    }

    
    public boolean containsBapiincompType(hmh.sap.rfc.BapiincompType item) {
        return baseList().contains(item);
    }

    
    public hmh.sap.rfc.BapiincompType removeBapiincompType(int index) {
        return (hmh.sap.rfc.BapiincompType)baseList().remove(index);
    }

    
    public hmh.sap.rfc.BapiincompType setBapiincompType(int index, hmh.sap.rfc.BapiincompType item) {
        return (hmh.sap.rfc.BapiincompType)baseList().set(index, item);
    }

    
    public void addBapiincompType(int index, hmh.sap.rfc.BapiincompType item) {
        baseList().add(index, item);
    }

    
    public boolean containsAllBapiincompType(BapiincompType_List item) {
        return baseList().containsAll(item);
    }

    
    public hmh.sap.rfc.BapiincompType getBapiincompType(int index) {
        return (hmh.sap.rfc.BapiincompType)baseList().get(index);
    }

    
    public void addAllBapiincompType(BapiincompType_List item) {
        baseList().addAll(item);
    }

}
