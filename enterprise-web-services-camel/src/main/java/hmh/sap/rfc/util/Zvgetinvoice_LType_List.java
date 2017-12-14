package hmh.sap.rfc.util;


public class Zvgetinvoice_LType_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.util.List, java.io.Serializable {

    private  static final long serialVersionUID = 135933402L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:ZVGETINVOICE_L", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", hmh.sap.rfc.Zvgetinvoice_LType.class, new hmh.sap.rfc.Zvgetinvoice_LType(), new java.lang.String[][]{}, 204, 382, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"ZVGETINVOICE_L\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Invoice - item details</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>204</ifr:internalLength1><ifr:internalLength2>382</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  Zvgetinvoice_LType_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public hmh.sap.rfc.Zvgetinvoice_LType removeZvgetinvoice_LType(int index) {
        return (hmh.sap.rfc.Zvgetinvoice_LType)baseList().remove(index);
    }

    
    public boolean removeZvgetinvoice_LType(hmh.sap.rfc.Zvgetinvoice_LType item) {
        return baseList().remove(item);
    }

    
    public void addZvgetinvoice_LType(int index, hmh.sap.rfc.Zvgetinvoice_LType item) {
        baseList().add(index, item);
    }

    
    public int lastIndexOfZvgetinvoice_LType(hmh.sap.rfc.Zvgetinvoice_LType item) {
        return baseList().lastIndexOf(item);
    }

    
    public hmh.sap.rfc.Zvgetinvoice_LType setZvgetinvoice_LType(int index, hmh.sap.rfc.Zvgetinvoice_LType item) {
        return (hmh.sap.rfc.Zvgetinvoice_LType)baseList().set(index, item);
    }

    
    public boolean containsZvgetinvoice_LType(hmh.sap.rfc.Zvgetinvoice_LType item) {
        return baseList().contains(item);
    }

    
    public boolean containsAllZvgetinvoice_LType(Zvgetinvoice_LType_List item) {
        return baseList().containsAll(item);
    }

    
    public hmh.sap.rfc.Zvgetinvoice_LType[] toArrayZvgetinvoice_LType() {
        return (hmh.sap.rfc.Zvgetinvoice_LType[])baseList().toArray(new hmh.sap.rfc.Zvgetinvoice_LType[] {});
    }

    
    public Zvgetinvoice_LType_List subListZvgetinvoice_LType(int fromIndex, int toIndex) {
        return (Zvgetinvoice_LType_List)baseList().subList(fromIndex, toIndex);
    }

    
    public void addAllZvgetinvoice_LType(Zvgetinvoice_LType_List item) {
        baseList().addAll(item);
    }

    
    public int indexOfZvgetinvoice_LType(hmh.sap.rfc.Zvgetinvoice_LType item) {
        return baseList().indexOf(item);
    }

    
    public hmh.sap.rfc.Zvgetinvoice_LType getZvgetinvoice_LType(int index) {
        return (hmh.sap.rfc.Zvgetinvoice_LType)baseList().get(index);
    }

    
    public void addZvgetinvoice_LType(hmh.sap.rfc.Zvgetinvoice_LType item) {
        baseList().add(item);
    }

    
    public void addAllZvgetinvoice_LType(int index, Zvgetinvoice_LType_List item) {
        baseList().addAll(index, item);
    }

}
