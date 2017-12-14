package hmh.sap.rfc.util;


public class Zvgetinvoice_HType_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.util.List, java.io.Serializable {

    private  static final long serialVersionUID = 132239318L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:ZVGETINVOICE_H", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", hmh.sap.rfc.Zvgetinvoice_HType.class, new hmh.sap.rfc.Zvgetinvoice_HType(), new java.lang.String[][]{}, 61, 94, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"ZVGETINVOICE_H\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Invoice - Header Info</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>61</ifr:internalLength1><ifr:internalLength2>94</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  Zvgetinvoice_HType_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public hmh.sap.rfc.Zvgetinvoice_HType[] toArrayZvgetinvoice_HType() {
        return (hmh.sap.rfc.Zvgetinvoice_HType[])baseList().toArray(new hmh.sap.rfc.Zvgetinvoice_HType[] {});
    }

    
    public int lastIndexOfZvgetinvoice_HType(hmh.sap.rfc.Zvgetinvoice_HType item) {
        return baseList().lastIndexOf(item);
    }

    
    public hmh.sap.rfc.Zvgetinvoice_HType setZvgetinvoice_HType(int index, hmh.sap.rfc.Zvgetinvoice_HType item) {
        return (hmh.sap.rfc.Zvgetinvoice_HType)baseList().set(index, item);
    }

    
    public void addZvgetinvoice_HType(int index, hmh.sap.rfc.Zvgetinvoice_HType item) {
        baseList().add(index, item);
    }

    
    public boolean containsZvgetinvoice_HType(hmh.sap.rfc.Zvgetinvoice_HType item) {
        return baseList().contains(item);
    }

    
    public boolean containsAllZvgetinvoice_HType(Zvgetinvoice_HType_List item) {
        return baseList().containsAll(item);
    }

    
    public hmh.sap.rfc.Zvgetinvoice_HType removeZvgetinvoice_HType(int index) {
        return (hmh.sap.rfc.Zvgetinvoice_HType)baseList().remove(index);
    }

    
    public Zvgetinvoice_HType_List subListZvgetinvoice_HType(int fromIndex, int toIndex) {
        return (Zvgetinvoice_HType_List)baseList().subList(fromIndex, toIndex);
    }

    
    public void addZvgetinvoice_HType(hmh.sap.rfc.Zvgetinvoice_HType item) {
        baseList().add(item);
    }

    
    public void addAllZvgetinvoice_HType(Zvgetinvoice_HType_List item) {
        baseList().addAll(item);
    }

    
    public void addAllZvgetinvoice_HType(int index, Zvgetinvoice_HType_List item) {
        baseList().addAll(index, item);
    }

    
    public hmh.sap.rfc.Zvgetinvoice_HType getZvgetinvoice_HType(int index) {
        return (hmh.sap.rfc.Zvgetinvoice_HType)baseList().get(index);
    }

    
    public int indexOfZvgetinvoice_HType(hmh.sap.rfc.Zvgetinvoice_HType item) {
        return baseList().indexOf(item);
    }

    
    public boolean removeZvgetinvoice_HType(hmh.sap.rfc.Zvgetinvoice_HType item) {
        return baseList().remove(item);
    }

}
