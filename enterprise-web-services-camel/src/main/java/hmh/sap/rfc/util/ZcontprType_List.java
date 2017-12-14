package hmh.sap.rfc.util;


public class ZcontprType_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.util.List, java.io.Serializable {

    private  static final long serialVersionUID = 2065373672L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:ZCONTPR", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", hmh.sap.rfc.ZcontprType.class, new hmh.sap.rfc.ZcontprType(), new java.lang.String[][]{}, 26, 44, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"ZCONTPR\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Contract Price Output</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>26</ifr:internalLength1><ifr:internalLength2>44</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  ZcontprType_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public void addZcontprType(hmh.sap.rfc.ZcontprType item) {
        baseList().add(item);
    }

    
    public void addAllZcontprType(ZcontprType_List item) {
        baseList().addAll(item);
    }

    
    public hmh.sap.rfc.ZcontprType setZcontprType(int index, hmh.sap.rfc.ZcontprType item) {
        return (hmh.sap.rfc.ZcontprType)baseList().set(index, item);
    }

    
    public hmh.sap.rfc.ZcontprType[] toArrayZcontprType() {
        return (hmh.sap.rfc.ZcontprType[])baseList().toArray(new hmh.sap.rfc.ZcontprType[] {});
    }

    
    public void addZcontprType(int index, hmh.sap.rfc.ZcontprType item) {
        baseList().add(index, item);
    }

    
    public ZcontprType_List subListZcontprType(int fromIndex, int toIndex) {
        return (ZcontprType_List)baseList().subList(fromIndex, toIndex);
    }

    
    public boolean containsAllZcontprType(ZcontprType_List item) {
        return baseList().containsAll(item);
    }

    
    public hmh.sap.rfc.ZcontprType removeZcontprType(int index) {
        return (hmh.sap.rfc.ZcontprType)baseList().remove(index);
    }

    
    public int lastIndexOfZcontprType(hmh.sap.rfc.ZcontprType item) {
        return baseList().lastIndexOf(item);
    }

    
    public int indexOfZcontprType(hmh.sap.rfc.ZcontprType item) {
        return baseList().indexOf(item);
    }

    
    public void addAllZcontprType(int index, ZcontprType_List item) {
        baseList().addAll(index, item);
    }

    
    public hmh.sap.rfc.ZcontprType getZcontprType(int index) {
        return (hmh.sap.rfc.ZcontprType)baseList().get(index);
    }

    
    public boolean removeZcontprType(hmh.sap.rfc.ZcontprType item) {
        return baseList().remove(item);
    }

    
    public boolean containsZcontprType(hmh.sap.rfc.ZcontprType item) {
        return baseList().contains(item);
    }

}
