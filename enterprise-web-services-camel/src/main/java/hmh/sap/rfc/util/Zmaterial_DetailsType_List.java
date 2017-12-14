package hmh.sap.rfc.util;


public class Zmaterial_DetailsType_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.util.List, java.io.Serializable {

    private  static final long serialVersionUID = 667958462L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:ZMATERIAL_DETAILS", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", hmh.sap.rfc.Zmaterial_DetailsType.class, new hmh.sap.rfc.Zmaterial_DetailsType(), new java.lang.String[][]{}, 386, 758, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"ZMATERIAL_DETAILS\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Material Details</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>386</ifr:internalLength1><ifr:internalLength2>758</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  Zmaterial_DetailsType_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public void addZmaterial_DetailsType(hmh.sap.rfc.Zmaterial_DetailsType item) {
        baseList().add(item);
    }

    
    public hmh.sap.rfc.Zmaterial_DetailsType[] toArrayZmaterial_DetailsType() {
        return (hmh.sap.rfc.Zmaterial_DetailsType[])baseList().toArray(new hmh.sap.rfc.Zmaterial_DetailsType[] {});
    }

    
    public boolean containsZmaterial_DetailsType(hmh.sap.rfc.Zmaterial_DetailsType item) {
        return baseList().contains(item);
    }

    
    public void addAllZmaterial_DetailsType(Zmaterial_DetailsType_List item) {
        baseList().addAll(item);
    }

    
    public int indexOfZmaterial_DetailsType(hmh.sap.rfc.Zmaterial_DetailsType item) {
        return baseList().indexOf(item);
    }

    
    public hmh.sap.rfc.Zmaterial_DetailsType removeZmaterial_DetailsType(int index) {
        return (hmh.sap.rfc.Zmaterial_DetailsType)baseList().remove(index);
    }

    
    public boolean removeZmaterial_DetailsType(hmh.sap.rfc.Zmaterial_DetailsType item) {
        return baseList().remove(item);
    }

    
    public void addZmaterial_DetailsType(int index, hmh.sap.rfc.Zmaterial_DetailsType item) {
        baseList().add(index, item);
    }

    
    public hmh.sap.rfc.Zmaterial_DetailsType getZmaterial_DetailsType(int index) {
        return (hmh.sap.rfc.Zmaterial_DetailsType)baseList().get(index);
    }

    
    public void addAllZmaterial_DetailsType(int index, Zmaterial_DetailsType_List item) {
        baseList().addAll(index, item);
    }

    
    public boolean containsAllZmaterial_DetailsType(Zmaterial_DetailsType_List item) {
        return baseList().containsAll(item);
    }

    
    public hmh.sap.rfc.Zmaterial_DetailsType setZmaterial_DetailsType(int index, hmh.sap.rfc.Zmaterial_DetailsType item) {
        return (hmh.sap.rfc.Zmaterial_DetailsType)baseList().set(index, item);
    }

    
    public int lastIndexOfZmaterial_DetailsType(hmh.sap.rfc.Zmaterial_DetailsType item) {
        return baseList().lastIndexOf(item);
    }

    
    public Zmaterial_DetailsType_List subListZmaterial_DetailsType(int fromIndex, int toIndex) {
        return (Zmaterial_DetailsType_List)baseList().subList(fromIndex, toIndex);
    }

}
