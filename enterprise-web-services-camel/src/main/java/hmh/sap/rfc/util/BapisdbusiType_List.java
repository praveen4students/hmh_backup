package hmh.sap.rfc.util;


public class BapisdbusiType_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.util.List, java.io.Serializable {

    private  static final long serialVersionUID = 1839956652L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:BAPISDBUSI", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", hmh.sap.rfc.BapisdbusiType.class, new hmh.sap.rfc.BapisdbusiType(), new java.lang.String[][]{}, 590, 1100, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"BAPISDBUSI\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">BAPI Structure of VBKD with English Field Names</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>110</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>590</ifr:internalLength1><ifr:internalLength2>1100</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  BapisdbusiType_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public boolean containsBapisdbusiType(hmh.sap.rfc.BapisdbusiType item) {
        return baseList().contains(item);
    }

    
    public int indexOfBapisdbusiType(hmh.sap.rfc.BapisdbusiType item) {
        return baseList().indexOf(item);
    }

    
    public hmh.sap.rfc.BapisdbusiType getBapisdbusiType(int index) {
        return (hmh.sap.rfc.BapisdbusiType)baseList().get(index);
    }

    
    public hmh.sap.rfc.BapisdbusiType removeBapisdbusiType(int index) {
        return (hmh.sap.rfc.BapisdbusiType)baseList().remove(index);
    }

    
    public hmh.sap.rfc.BapisdbusiType[] toArrayBapisdbusiType() {
        return (hmh.sap.rfc.BapisdbusiType[])baseList().toArray(new hmh.sap.rfc.BapisdbusiType[] {});
    }

    
    public void addAllBapisdbusiType(int index, BapisdbusiType_List item) {
        baseList().addAll(index, item);
    }

    
    public hmh.sap.rfc.BapisdbusiType setBapisdbusiType(int index, hmh.sap.rfc.BapisdbusiType item) {
        return (hmh.sap.rfc.BapisdbusiType)baseList().set(index, item);
    }

    
    public void addBapisdbusiType(hmh.sap.rfc.BapisdbusiType item) {
        baseList().add(item);
    }

    
    public int lastIndexOfBapisdbusiType(hmh.sap.rfc.BapisdbusiType item) {
        return baseList().lastIndexOf(item);
    }

    
    public void addBapisdbusiType(int index, hmh.sap.rfc.BapisdbusiType item) {
        baseList().add(index, item);
    }

    
    public void addAllBapisdbusiType(BapisdbusiType_List item) {
        baseList().addAll(item);
    }

    
    public BapisdbusiType_List subListBapisdbusiType(int fromIndex, int toIndex) {
        return (BapisdbusiType_List)baseList().subList(fromIndex, toIndex);
    }

    
    public boolean removeBapisdbusiType(hmh.sap.rfc.BapisdbusiType item) {
        return baseList().remove(item);
    }

    
    public boolean containsAllBapisdbusiType(BapisdbusiType_List item) {
        return baseList().containsAll(item);
    }

}
