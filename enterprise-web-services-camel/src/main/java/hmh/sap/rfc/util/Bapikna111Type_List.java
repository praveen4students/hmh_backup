package hmh.sap.rfc.util;


public class Bapikna111Type_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.util.List, java.io.Serializable {

    private  static final long serialVersionUID = -1387370395L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:BAPIKNA111", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", hmh.sap.rfc.Bapikna111Type.class, new hmh.sap.rfc.Bapikna111Type(), new java.lang.String[][]{}, 680, 1360, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"BAPIKNA111\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Transfer Structure KNA1/Search Results</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>680</ifr:internalLength1><ifr:internalLength2>1360</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  Bapikna111Type_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public hmh.sap.rfc.Bapikna111Type setBapikna111Type(int index, hmh.sap.rfc.Bapikna111Type item) {
        return (hmh.sap.rfc.Bapikna111Type)baseList().set(index, item);
    }

    
    public hmh.sap.rfc.Bapikna111Type removeBapikna111Type(int index) {
        return (hmh.sap.rfc.Bapikna111Type)baseList().remove(index);
    }

    
    public hmh.sap.rfc.Bapikna111Type[] toArrayBapikna111Type() {
        return (hmh.sap.rfc.Bapikna111Type[])baseList().toArray(new hmh.sap.rfc.Bapikna111Type[] {});
    }

    
    public void addAllBapikna111Type(Bapikna111Type_List item) {
        baseList().addAll(item);
    }

    
    public boolean containsAllBapikna111Type(Bapikna111Type_List item) {
        return baseList().containsAll(item);
    }

    
    public int lastIndexOfBapikna111Type(hmh.sap.rfc.Bapikna111Type item) {
        return baseList().lastIndexOf(item);
    }

    
    public Bapikna111Type_List subListBapikna111Type(int fromIndex, int toIndex) {
        return (Bapikna111Type_List)baseList().subList(fromIndex, toIndex);
    }

    
    public int indexOfBapikna111Type(hmh.sap.rfc.Bapikna111Type item) {
        return baseList().indexOf(item);
    }

    
    public void addAllBapikna111Type(int index, Bapikna111Type_List item) {
        baseList().addAll(index, item);
    }

    
    public boolean containsBapikna111Type(hmh.sap.rfc.Bapikna111Type item) {
        return baseList().contains(item);
    }

    
    public boolean removeBapikna111Type(hmh.sap.rfc.Bapikna111Type item) {
        return baseList().remove(item);
    }

    
    public hmh.sap.rfc.Bapikna111Type getBapikna111Type(int index) {
        return (hmh.sap.rfc.Bapikna111Type)baseList().get(index);
    }

    
    public void addBapikna111Type(int index, hmh.sap.rfc.Bapikna111Type item) {
        baseList().add(index, item);
    }

    
    public void addBapikna111Type(hmh.sap.rfc.Bapikna111Type item) {
        baseList().add(item);
    }

}
