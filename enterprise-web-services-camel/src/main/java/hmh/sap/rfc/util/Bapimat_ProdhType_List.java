package hmh.sap.rfc.util;


public class Bapimat_ProdhType_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.util.List, java.io.Serializable {

    private  static final long serialVersionUID = 117731060L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:BAPIMAT_PRODH", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", hmh.sap.rfc.Bapimat_ProdhType.class, new hmh.sap.rfc.Bapimat_ProdhType(), new java.lang.String[][]{}, 98, 196, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"BAPIMAT_PRODH\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">BO Material: Product Hierarchy Nodes</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>98</ifr:internalLength1><ifr:internalLength2>196</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  Bapimat_ProdhType_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public boolean containsBapimat_ProdhType(hmh.sap.rfc.Bapimat_ProdhType item) {
        return baseList().contains(item);
    }

    
    public hmh.sap.rfc.Bapimat_ProdhType getBapimat_ProdhType(int index) {
        return (hmh.sap.rfc.Bapimat_ProdhType)baseList().get(index);
    }

    
    public void addBapimat_ProdhType(int index, hmh.sap.rfc.Bapimat_ProdhType item) {
        baseList().add(index, item);
    }

    
    public boolean containsAllBapimat_ProdhType(Bapimat_ProdhType_List item) {
        return baseList().containsAll(item);
    }

    
    public Bapimat_ProdhType_List subListBapimat_ProdhType(int fromIndex, int toIndex) {
        return (Bapimat_ProdhType_List)baseList().subList(fromIndex, toIndex);
    }

    
    public hmh.sap.rfc.Bapimat_ProdhType[] toArrayBapimat_ProdhType() {
        return (hmh.sap.rfc.Bapimat_ProdhType[])baseList().toArray(new hmh.sap.rfc.Bapimat_ProdhType[] {});
    }

    
    public boolean removeBapimat_ProdhType(hmh.sap.rfc.Bapimat_ProdhType item) {
        return baseList().remove(item);
    }

    
    public hmh.sap.rfc.Bapimat_ProdhType setBapimat_ProdhType(int index, hmh.sap.rfc.Bapimat_ProdhType item) {
        return (hmh.sap.rfc.Bapimat_ProdhType)baseList().set(index, item);
    }

    
    public void addAllBapimat_ProdhType(Bapimat_ProdhType_List item) {
        baseList().addAll(item);
    }

    
    public int indexOfBapimat_ProdhType(hmh.sap.rfc.Bapimat_ProdhType item) {
        return baseList().indexOf(item);
    }

    
    public void addBapimat_ProdhType(hmh.sap.rfc.Bapimat_ProdhType item) {
        baseList().add(item);
    }

    
    public void addAllBapimat_ProdhType(int index, Bapimat_ProdhType_List item) {
        baseList().addAll(index, item);
    }

    
    public int lastIndexOfBapimat_ProdhType(hmh.sap.rfc.Bapimat_ProdhType item) {
        return baseList().lastIndexOf(item);
    }

    
    public hmh.sap.rfc.Bapimat_ProdhType removeBapimat_ProdhType(int index) {
        return (hmh.sap.rfc.Bapimat_ProdhType)baseList().remove(index);
    }

}
