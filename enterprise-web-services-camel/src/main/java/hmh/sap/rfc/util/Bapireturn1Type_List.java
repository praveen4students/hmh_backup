package hmh.sap.rfc.util;


public class Bapireturn1Type_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.util.List, java.io.Serializable {

    private  static final long serialVersionUID = -442664381L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:BAPIRETURN1", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", hmh.sap.rfc.Bapireturn1Type.class, new hmh.sap.rfc.Bapireturn1Type(), new java.lang.String[][]{}, 470, 940, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"BAPIRETURN1\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Return Parameter</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>110</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>470</ifr:internalLength1><ifr:internalLength2>940</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  Bapireturn1Type_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public int lastIndexOfBapireturn1Type(hmh.sap.rfc.Bapireturn1Type item) {
        return baseList().lastIndexOf(item);
    }

    
    public void addBapireturn1Type(int index, hmh.sap.rfc.Bapireturn1Type item) {
        baseList().add(index, item);
    }

    
    public void addBapireturn1Type(hmh.sap.rfc.Bapireturn1Type item) {
        baseList().add(item);
    }

    
    public boolean containsBapireturn1Type(hmh.sap.rfc.Bapireturn1Type item) {
        return baseList().contains(item);
    }

    
    public void addAllBapireturn1Type(int index, Bapireturn1Type_List item) {
        baseList().addAll(index, item);
    }

    
    public boolean removeBapireturn1Type(hmh.sap.rfc.Bapireturn1Type item) {
        return baseList().remove(item);
    }

    
    public hmh.sap.rfc.Bapireturn1Type setBapireturn1Type(int index, hmh.sap.rfc.Bapireturn1Type item) {
        return (hmh.sap.rfc.Bapireturn1Type)baseList().set(index, item);
    }

    
    public hmh.sap.rfc.Bapireturn1Type[] toArrayBapireturn1Type() {
        return (hmh.sap.rfc.Bapireturn1Type[])baseList().toArray(new hmh.sap.rfc.Bapireturn1Type[] {});
    }

    
    public void addAllBapireturn1Type(Bapireturn1Type_List item) {
        baseList().addAll(item);
    }

    
    public hmh.sap.rfc.Bapireturn1Type removeBapireturn1Type(int index) {
        return (hmh.sap.rfc.Bapireturn1Type)baseList().remove(index);
    }

    
    public Bapireturn1Type_List subListBapireturn1Type(int fromIndex, int toIndex) {
        return (Bapireturn1Type_List)baseList().subList(fromIndex, toIndex);
    }

    
    public hmh.sap.rfc.Bapireturn1Type getBapireturn1Type(int index) {
        return (hmh.sap.rfc.Bapireturn1Type)baseList().get(index);
    }

    
    public boolean containsAllBapireturn1Type(Bapireturn1Type_List item) {
        return baseList().containsAll(item);
    }

    
    public int indexOfBapireturn1Type(hmh.sap.rfc.Bapireturn1Type item) {
        return baseList().indexOf(item);
    }

}
