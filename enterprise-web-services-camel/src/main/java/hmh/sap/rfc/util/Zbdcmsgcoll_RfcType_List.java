package hmh.sap.rfc.util;


public class Zbdcmsgcoll_RfcType_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.util.List, java.io.Serializable {

    private  static final long serialVersionUID = 1375137648L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:ZBDCMSGCOLL_RFC", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", hmh.sap.rfc.Zbdcmsgcoll_RfcType.class, new hmh.sap.rfc.Zbdcmsgcoll_RfcType(), new java.lang.String[][]{}, 289, 578, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"ZBDCMSGCOLL_RFC\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Collecting RFC messages within SAP</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>110</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>289</ifr:internalLength1><ifr:internalLength2>578</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  Zbdcmsgcoll_RfcType_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public boolean containsZbdcmsgcoll_RfcType(hmh.sap.rfc.Zbdcmsgcoll_RfcType item) {
        return baseList().contains(item);
    }

    
    public int lastIndexOfZbdcmsgcoll_RfcType(hmh.sap.rfc.Zbdcmsgcoll_RfcType item) {
        return baseList().lastIndexOf(item);
    }

    
    public hmh.sap.rfc.Zbdcmsgcoll_RfcType setZbdcmsgcoll_RfcType(int index, hmh.sap.rfc.Zbdcmsgcoll_RfcType item) {
        return (hmh.sap.rfc.Zbdcmsgcoll_RfcType)baseList().set(index, item);
    }

    
    public hmh.sap.rfc.Zbdcmsgcoll_RfcType removeZbdcmsgcoll_RfcType(int index) {
        return (hmh.sap.rfc.Zbdcmsgcoll_RfcType)baseList().remove(index);
    }

    
    public void addZbdcmsgcoll_RfcType(hmh.sap.rfc.Zbdcmsgcoll_RfcType item) {
        baseList().add(item);
    }

    
    public Zbdcmsgcoll_RfcType_List subListZbdcmsgcoll_RfcType(int fromIndex, int toIndex) {
        return (Zbdcmsgcoll_RfcType_List)baseList().subList(fromIndex, toIndex);
    }

    
    public hmh.sap.rfc.Zbdcmsgcoll_RfcType getZbdcmsgcoll_RfcType(int index) {
        return (hmh.sap.rfc.Zbdcmsgcoll_RfcType)baseList().get(index);
    }

    
    public boolean removeZbdcmsgcoll_RfcType(hmh.sap.rfc.Zbdcmsgcoll_RfcType item) {
        return baseList().remove(item);
    }

    
    public void addAllZbdcmsgcoll_RfcType(Zbdcmsgcoll_RfcType_List item) {
        baseList().addAll(item);
    }

    
    public hmh.sap.rfc.Zbdcmsgcoll_RfcType[] toArrayZbdcmsgcoll_RfcType() {
        return (hmh.sap.rfc.Zbdcmsgcoll_RfcType[])baseList().toArray(new hmh.sap.rfc.Zbdcmsgcoll_RfcType[] {});
    }

    
    public void addAllZbdcmsgcoll_RfcType(int index, Zbdcmsgcoll_RfcType_List item) {
        baseList().addAll(index, item);
    }

    
    public int indexOfZbdcmsgcoll_RfcType(hmh.sap.rfc.Zbdcmsgcoll_RfcType item) {
        return baseList().indexOf(item);
    }

    
    public boolean containsAllZbdcmsgcoll_RfcType(Zbdcmsgcoll_RfcType_List item) {
        return baseList().containsAll(item);
    }

    
    public void addZbdcmsgcoll_RfcType(int index, hmh.sap.rfc.Zbdcmsgcoll_RfcType item) {
        baseList().add(index, item);
    }

}
