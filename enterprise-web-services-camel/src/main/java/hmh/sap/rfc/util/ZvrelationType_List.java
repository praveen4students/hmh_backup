package hmh.sap.rfc.util;


public class ZvrelationType_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.util.List, java.io.Serializable {

    private  static final long serialVersionUID = 1219788978L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:ZVRELATION", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", hmh.sap.rfc.ZvrelationType.class, new hmh.sap.rfc.ZvrelationType(), new java.lang.String[][]{}, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"ZVRELATION\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Structure for Relationships of customers</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  ZvrelationType_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public int lastIndexOfZvrelationType(hmh.sap.rfc.ZvrelationType item) {
        return baseList().lastIndexOf(item);
    }

    
    public void addZvrelationType(hmh.sap.rfc.ZvrelationType item) {
        baseList().add(item);
    }

    
    public boolean containsAllZvrelationType(ZvrelationType_List item) {
        return baseList().containsAll(item);
    }

    
    public boolean removeZvrelationType(hmh.sap.rfc.ZvrelationType item) {
        return baseList().remove(item);
    }

    
    public void addAllZvrelationType(ZvrelationType_List item) {
        baseList().addAll(item);
    }

    
    public hmh.sap.rfc.ZvrelationType setZvrelationType(int index, hmh.sap.rfc.ZvrelationType item) {
        return (hmh.sap.rfc.ZvrelationType)baseList().set(index, item);
    }

    
    public void addAllZvrelationType(int index, ZvrelationType_List item) {
        baseList().addAll(index, item);
    }

    
    public hmh.sap.rfc.ZvrelationType[] toArrayZvrelationType() {
        return (hmh.sap.rfc.ZvrelationType[])baseList().toArray(new hmh.sap.rfc.ZvrelationType[] {});
    }

    
    public hmh.sap.rfc.ZvrelationType getZvrelationType(int index) {
        return (hmh.sap.rfc.ZvrelationType)baseList().get(index);
    }

    
    public int indexOfZvrelationType(hmh.sap.rfc.ZvrelationType item) {
        return baseList().indexOf(item);
    }

    
    public boolean containsZvrelationType(hmh.sap.rfc.ZvrelationType item) {
        return baseList().contains(item);
    }

    
    public ZvrelationType_List subListZvrelationType(int fromIndex, int toIndex) {
        return (ZvrelationType_List)baseList().subList(fromIndex, toIndex);
    }

    
    public hmh.sap.rfc.ZvrelationType removeZvrelationType(int index) {
        return (hmh.sap.rfc.ZvrelationType)baseList().remove(index);
    }

    
    public void addZvrelationType(int index, hmh.sap.rfc.ZvrelationType item) {
        baseList().add(index, item);
    }

}
