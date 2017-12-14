package hmh.sap.rfc.util;


public class Zvgetsales_LType_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.util.List, java.io.Serializable {

    private  static final long serialVersionUID = -1812116999L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:ZVGETSALES_L", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", hmh.sap.rfc.Zvgetsales_LType.class, new hmh.sap.rfc.Zvgetsales_LType(), new java.lang.String[][]{}, 129, 246, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"ZVGETSALES_L\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Sales Document Details Input (Line Items)</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>110</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>129</ifr:internalLength1><ifr:internalLength2>246</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  Zvgetsales_LType_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public int indexOfZvgetsales_LType(hmh.sap.rfc.Zvgetsales_LType item) {
        return baseList().indexOf(item);
    }

    
    public Zvgetsales_LType_List subListZvgetsales_LType(int fromIndex, int toIndex) {
        return (Zvgetsales_LType_List)baseList().subList(fromIndex, toIndex);
    }

    
    public int lastIndexOfZvgetsales_LType(hmh.sap.rfc.Zvgetsales_LType item) {
        return baseList().lastIndexOf(item);
    }

    
    public hmh.sap.rfc.Zvgetsales_LType removeZvgetsales_LType(int index) {
        return (hmh.sap.rfc.Zvgetsales_LType)baseList().remove(index);
    }

    
    public hmh.sap.rfc.Zvgetsales_LType[] toArrayZvgetsales_LType() {
        return (hmh.sap.rfc.Zvgetsales_LType[])baseList().toArray(new hmh.sap.rfc.Zvgetsales_LType[] {});
    }

    
    public boolean containsZvgetsales_LType(hmh.sap.rfc.Zvgetsales_LType item) {
        return baseList().contains(item);
    }

    
    public boolean containsAllZvgetsales_LType(Zvgetsales_LType_List item) {
        return baseList().containsAll(item);
    }

    
    public hmh.sap.rfc.Zvgetsales_LType setZvgetsales_LType(int index, hmh.sap.rfc.Zvgetsales_LType item) {
        return (hmh.sap.rfc.Zvgetsales_LType)baseList().set(index, item);
    }

    
    public boolean removeZvgetsales_LType(hmh.sap.rfc.Zvgetsales_LType item) {
        return baseList().remove(item);
    }

    
    public void addZvgetsales_LType(hmh.sap.rfc.Zvgetsales_LType item) {
        baseList().add(item);
    }

    
    public void addAllZvgetsales_LType(Zvgetsales_LType_List item) {
        baseList().addAll(item);
    }

    
    public void addAllZvgetsales_LType(int index, Zvgetsales_LType_List item) {
        baseList().addAll(index, item);
    }

    
    public void addZvgetsales_LType(int index, hmh.sap.rfc.Zvgetsales_LType item) {
        baseList().add(index, item);
    }

    
    public hmh.sap.rfc.Zvgetsales_LType getZvgetsales_LType(int index) {
        return (hmh.sap.rfc.Zvgetsales_LType)baseList().get(index);
    }

}
