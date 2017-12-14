package hmh.sap.rfc.util;


public class BapisdpartType_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.util.List, java.io.Serializable {

    private  static final long serialVersionUID = -119177290L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:BAPISDPART", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", hmh.sap.rfc.BapisdpartType.class, new hmh.sap.rfc.BapisdpartType(), new java.lang.String[][]{}, 180, 360, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"BAPISDPART\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">BAPI Structure of VBPA with English Field Names</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>110</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>180</ifr:internalLength1><ifr:internalLength2>360</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  BapisdpartType_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public hmh.sap.rfc.BapisdpartType setBapisdpartType(int index, hmh.sap.rfc.BapisdpartType item) {
        return (hmh.sap.rfc.BapisdpartType)baseList().set(index, item);
    }

    
    public hmh.sap.rfc.BapisdpartType getBapisdpartType(int index) {
        return (hmh.sap.rfc.BapisdpartType)baseList().get(index);
    }

    
    public boolean removeBapisdpartType(hmh.sap.rfc.BapisdpartType item) {
        return baseList().remove(item);
    }

    
    public int lastIndexOfBapisdpartType(hmh.sap.rfc.BapisdpartType item) {
        return baseList().lastIndexOf(item);
    }

    
    public void addBapisdpartType(int index, hmh.sap.rfc.BapisdpartType item) {
        baseList().add(index, item);
    }

    
    public void addBapisdpartType(hmh.sap.rfc.BapisdpartType item) {
        baseList().add(item);
    }

    
    public BapisdpartType_List subListBapisdpartType(int fromIndex, int toIndex) {
        return (BapisdpartType_List)baseList().subList(fromIndex, toIndex);
    }

    
    public boolean containsAllBapisdpartType(BapisdpartType_List item) {
        return baseList().containsAll(item);
    }

    
    public boolean containsBapisdpartType(hmh.sap.rfc.BapisdpartType item) {
        return baseList().contains(item);
    }

    
    public hmh.sap.rfc.BapisdpartType removeBapisdpartType(int index) {
        return (hmh.sap.rfc.BapisdpartType)baseList().remove(index);
    }

    
    public hmh.sap.rfc.BapisdpartType[] toArrayBapisdpartType() {
        return (hmh.sap.rfc.BapisdpartType[])baseList().toArray(new hmh.sap.rfc.BapisdpartType[] {});
    }

    
    public void addAllBapisdpartType(int index, BapisdpartType_List item) {
        baseList().addAll(index, item);
    }

    
    public int indexOfBapisdpartType(hmh.sap.rfc.BapisdpartType item) {
        return baseList().indexOf(item);
    }

    
    public void addAllBapisdpartType(BapisdpartType_List item) {
        baseList().addAll(item);
    }

}
