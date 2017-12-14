package hmh.sap.rfc.util;


public class Bapischdl2Type_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.util.List, java.io.Serializable {

    private  static final long serialVersionUID = -1234487164L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:BAPISCHDL2", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", hmh.sap.rfc.Bapischdl2Type.class, new hmh.sap.rfc.Bapischdl2Type(), new java.lang.String[][]{}, 91, 176, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"BAPISCHDL2\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Commun. fields for sales document sched. line (confirmation)</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>110</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>91</ifr:internalLength1><ifr:internalLength2>176</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  Bapischdl2Type_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public void addBapischdl2Type(int index, hmh.sap.rfc.Bapischdl2Type item) {
        baseList().add(index, item);
    }

    
    public hmh.sap.rfc.Bapischdl2Type removeBapischdl2Type(int index) {
        return (hmh.sap.rfc.Bapischdl2Type)baseList().remove(index);
    }

    
    public hmh.sap.rfc.Bapischdl2Type setBapischdl2Type(int index, hmh.sap.rfc.Bapischdl2Type item) {
        return (hmh.sap.rfc.Bapischdl2Type)baseList().set(index, item);
    }

    
    public Bapischdl2Type_List subListBapischdl2Type(int fromIndex, int toIndex) {
        return (Bapischdl2Type_List)baseList().subList(fromIndex, toIndex);
    }

    
    public int lastIndexOfBapischdl2Type(hmh.sap.rfc.Bapischdl2Type item) {
        return baseList().lastIndexOf(item);
    }

    
    public int indexOfBapischdl2Type(hmh.sap.rfc.Bapischdl2Type item) {
        return baseList().indexOf(item);
    }

    
    public boolean containsBapischdl2Type(hmh.sap.rfc.Bapischdl2Type item) {
        return baseList().contains(item);
    }

    
    public boolean containsAllBapischdl2Type(Bapischdl2Type_List item) {
        return baseList().containsAll(item);
    }

    
    public boolean removeBapischdl2Type(hmh.sap.rfc.Bapischdl2Type item) {
        return baseList().remove(item);
    }

    
    public hmh.sap.rfc.Bapischdl2Type[] toArrayBapischdl2Type() {
        return (hmh.sap.rfc.Bapischdl2Type[])baseList().toArray(new hmh.sap.rfc.Bapischdl2Type[] {});
    }

    
    public void addBapischdl2Type(hmh.sap.rfc.Bapischdl2Type item) {
        baseList().add(item);
    }

    
    public hmh.sap.rfc.Bapischdl2Type getBapischdl2Type(int index) {
        return (hmh.sap.rfc.Bapischdl2Type)baseList().get(index);
    }

    
    public void addAllBapischdl2Type(Bapischdl2Type_List item) {
        baseList().addAll(item);
    }

    
    public void addAllBapischdl2Type(int index, Bapischdl2Type_List item) {
        baseList().addAll(index, item);
    }

}
