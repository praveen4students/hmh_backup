package hmh.sap.rfc.util;


public class Zmatnr_SubstituteType_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.util.List, java.io.Serializable {

    private  static final long serialVersionUID = 528633065L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:ZMATNR_SUBSTITUTE", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", hmh.sap.rfc.Zmatnr_SubstituteType.class, new hmh.sap.rfc.Zmatnr_SubstituteType(), new java.lang.String[][]{}, 156, 312, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"ZMATNR_SUBSTITUTE\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Gets the substituted material details</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>156</ifr:internalLength1><ifr:internalLength2>312</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  Zmatnr_SubstituteType_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public void addZmatnr_SubstituteType(hmh.sap.rfc.Zmatnr_SubstituteType item) {
        baseList().add(item);
    }

    
    public boolean removeZmatnr_SubstituteType(hmh.sap.rfc.Zmatnr_SubstituteType item) {
        return baseList().remove(item);
    }

    
    public Zmatnr_SubstituteType_List subListZmatnr_SubstituteType(int fromIndex, int toIndex) {
        return (Zmatnr_SubstituteType_List)baseList().subList(fromIndex, toIndex);
    }

    
    public void addAllZmatnr_SubstituteType(int index, Zmatnr_SubstituteType_List item) {
        baseList().addAll(index, item);
    }

    
    public void addAllZmatnr_SubstituteType(Zmatnr_SubstituteType_List item) {
        baseList().addAll(item);
    }

    
    public hmh.sap.rfc.Zmatnr_SubstituteType getZmatnr_SubstituteType(int index) {
        return (hmh.sap.rfc.Zmatnr_SubstituteType)baseList().get(index);
    }

    
    public void addZmatnr_SubstituteType(int index, hmh.sap.rfc.Zmatnr_SubstituteType item) {
        baseList().add(index, item);
    }

    
    public int indexOfZmatnr_SubstituteType(hmh.sap.rfc.Zmatnr_SubstituteType item) {
        return baseList().indexOf(item);
    }

    
    public boolean containsAllZmatnr_SubstituteType(Zmatnr_SubstituteType_List item) {
        return baseList().containsAll(item);
    }

    
    public boolean containsZmatnr_SubstituteType(hmh.sap.rfc.Zmatnr_SubstituteType item) {
        return baseList().contains(item);
    }

    
    public int lastIndexOfZmatnr_SubstituteType(hmh.sap.rfc.Zmatnr_SubstituteType item) {
        return baseList().lastIndexOf(item);
    }

    
    public hmh.sap.rfc.Zmatnr_SubstituteType[] toArrayZmatnr_SubstituteType() {
        return (hmh.sap.rfc.Zmatnr_SubstituteType[])baseList().toArray(new hmh.sap.rfc.Zmatnr_SubstituteType[] {});
    }

    
    public hmh.sap.rfc.Zmatnr_SubstituteType removeZmatnr_SubstituteType(int index) {
        return (hmh.sap.rfc.Zmatnr_SubstituteType)baseList().remove(index);
    }

    
    public hmh.sap.rfc.Zmatnr_SubstituteType setZmatnr_SubstituteType(int index, hmh.sap.rfc.Zmatnr_SubstituteType item) {
        return (hmh.sap.rfc.Zmatnr_SubstituteType)baseList().set(index, item);
    }

}
