package hmh.sap.rfc.util;


public class Bapiret2Type_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.util.List, java.io.Serializable {

    private  static final long serialVersionUID = 10322211L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:BAPIRET2", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", hmh.sap.rfc.Bapiret2Type.class, new hmh.sap.rfc.Bapiret2Type(), new java.lang.String[][]{}, 548, 1088, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"BAPIRET2\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Return Parameter</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>110</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>548</ifr:internalLength1><ifr:internalLength2>1088</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  Bapiret2Type_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public boolean containsBapiret2Type(hmh.sap.rfc.Bapiret2Type item) {
        return baseList().contains(item);
    }

    
    public boolean containsAllBapiret2Type(Bapiret2Type_List item) {
        return baseList().containsAll(item);
    }

    
    public Bapiret2Type_List subListBapiret2Type(int fromIndex, int toIndex) {
        return (Bapiret2Type_List)baseList().subList(fromIndex, toIndex);
    }

    
    public void addBapiret2Type(int index, hmh.sap.rfc.Bapiret2Type item) {
        baseList().add(index, item);
    }

    
    public hmh.sap.rfc.Bapiret2Type setBapiret2Type(int index, hmh.sap.rfc.Bapiret2Type item) {
        return (hmh.sap.rfc.Bapiret2Type)baseList().set(index, item);
    }

    
    public hmh.sap.rfc.Bapiret2Type removeBapiret2Type(int index) {
        return (hmh.sap.rfc.Bapiret2Type)baseList().remove(index);
    }

    
    public void addAllBapiret2Type(Bapiret2Type_List item) {
        baseList().addAll(item);
    }

    
    public hmh.sap.rfc.Bapiret2Type getBapiret2Type(int index) {
        return (hmh.sap.rfc.Bapiret2Type)baseList().get(index);
    }

    
    public boolean removeBapiret2Type(hmh.sap.rfc.Bapiret2Type item) {
        return baseList().remove(item);
    }

    
    public hmh.sap.rfc.Bapiret2Type[] toArrayBapiret2Type() {
        return (hmh.sap.rfc.Bapiret2Type[])baseList().toArray(new hmh.sap.rfc.Bapiret2Type[] {});
    }

    
    public void addAllBapiret2Type(int index, Bapiret2Type_List item) {
        baseList().addAll(index, item);
    }

    
    public int indexOfBapiret2Type(hmh.sap.rfc.Bapiret2Type item) {
        return baseList().indexOf(item);
    }

    
    public void addBapiret2Type(hmh.sap.rfc.Bapiret2Type item) {
        baseList().add(item);
    }

    
    public int lastIndexOfBapiret2Type(hmh.sap.rfc.Bapiret2Type item) {
        return baseList().lastIndexOf(item);
    }

}
