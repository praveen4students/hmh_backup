package hmh.sap.rfc.util;


public class Zvgetshipment_DType_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.util.List, java.io.Serializable {

    private  static final long serialVersionUID = 2123928499L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:ZVGETSHIPMENT_D", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", hmh.sap.rfc.Zvgetshipment_DType.class, new hmh.sap.rfc.Zvgetshipment_DType(), new java.lang.String[][]{}, 122, 238, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"ZVGETSHIPMENT_D\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"en\">Shipmet - ltems</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>620 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>122</ifr:internalLength1><ifr:internalLength2>238</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  Zvgetshipment_DType_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    
    public void addZvgetshipment_DType(hmh.sap.rfc.Zvgetshipment_DType item) {
        baseList().add(item);
    }

    
    public int indexOfZvgetshipment_DType(hmh.sap.rfc.Zvgetshipment_DType item) {
        return baseList().indexOf(item);
    }

    
    public void addZvgetshipment_DType(int index, hmh.sap.rfc.Zvgetshipment_DType item) {
        baseList().add(index, item);
    }

    
    public hmh.sap.rfc.Zvgetshipment_DType getZvgetshipment_DType(int index) {
        return (hmh.sap.rfc.Zvgetshipment_DType)baseList().get(index);
    }

    
    public hmh.sap.rfc.Zvgetshipment_DType removeZvgetshipment_DType(int index) {
        return (hmh.sap.rfc.Zvgetshipment_DType)baseList().remove(index);
    }

    
    public hmh.sap.rfc.Zvgetshipment_DType[] toArrayZvgetshipment_DType() {
        return (hmh.sap.rfc.Zvgetshipment_DType[])baseList().toArray(new hmh.sap.rfc.Zvgetshipment_DType[] {});
    }

    
    public hmh.sap.rfc.Zvgetshipment_DType setZvgetshipment_DType(int index, hmh.sap.rfc.Zvgetshipment_DType item) {
        return (hmh.sap.rfc.Zvgetshipment_DType)baseList().set(index, item);
    }

    
    public boolean containsZvgetshipment_DType(hmh.sap.rfc.Zvgetshipment_DType item) {
        return baseList().contains(item);
    }

    
    public void addAllZvgetshipment_DType(int index, Zvgetshipment_DType_List item) {
        baseList().addAll(index, item);
    }

    
    public int lastIndexOfZvgetshipment_DType(hmh.sap.rfc.Zvgetshipment_DType item) {
        return baseList().lastIndexOf(item);
    }

    
    public void addAllZvgetshipment_DType(Zvgetshipment_DType_List item) {
        baseList().addAll(item);
    }

    
    public boolean removeZvgetshipment_DType(hmh.sap.rfc.Zvgetshipment_DType item) {
        return baseList().remove(item);
    }

    
    public Zvgetshipment_DType_List subListZvgetshipment_DType(int fromIndex, int toIndex) {
        return (Zvgetshipment_DType_List)baseList().subList(fromIndex, toIndex);
    }

    
    public boolean containsAllZvgetshipment_DType(Zvgetshipment_DType_List item) {
        return baseList().containsAll(item);
    }

}
