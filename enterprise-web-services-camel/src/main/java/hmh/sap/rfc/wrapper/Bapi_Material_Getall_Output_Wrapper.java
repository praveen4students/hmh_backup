package hmh.sap.rfc.wrapper;

import javax.xml.bind.annotation.XmlRootElement;

import hmh.sap.rfc.Bapi_Makt_GaType;
import hmh.sap.rfc.Bapi_Mara_GaType;
import hmh.sap.rfc.Bapi_Marc_GaType;
import hmh.sap.rfc.Bapi_Mard_GaType;
import hmh.sap.rfc.Bapi_Marm_GaType;
import hmh.sap.rfc.Bapi_Material_Getall_Output;
import hmh.sap.rfc.Bapi_Mbew_GaType;
import hmh.sap.rfc.Bapi_Mean_GaType;
import hmh.sap.rfc.Bapi_Mfhm_GaType;
import hmh.sap.rfc.Bapi_Mlan_GaType;
import hmh.sap.rfc.Bapi_Mlgn_GaType;
import hmh.sap.rfc.Bapi_Mlgt_GaType;
import hmh.sap.rfc.Bapi_Mltx_GaType;
import hmh.sap.rfc.Bapi_Mpgd_GaType;
import hmh.sap.rfc.Bapi_Mpop_GaType;
import hmh.sap.rfc.Bapi_Mvke_GaType;
import hmh.sap.rfc.Bapi_Myms_GaType;
import hmh.sap.rfc.BapiparexType;
import hmh.sap.rfc.BapireturnType;


@XmlRootElement(name = "Bapi_Material_Getall_Output")
public class Bapi_Material_Getall_Output_Wrapper {

	private Bapi_Material_Getall_Output instance;
	
	public void setInstance(Bapi_Material_Getall_Output instance) {
		this.instance = instance;
	}

	
	public void setClientdata(Bapi_Mara_GaType_Wrapper Clientdata) {
		//instance.setClientdata(Clientdata);
	}
	public Bapi_Mara_GaType_Wrapper getClientdata() {		
		return new Bapi_Mara_GaType_Wrapper(instance.getClientdata());
	}

	public Bapi_Marc_GaType_Wrapper getPlantdata() {
		return new Bapi_Marc_GaType_Wrapper(instance.getPlantdata());
	}
	public void setPlantdata(Bapi_Marc_GaType_Wrapper Plantdata) {
		//instance.setPlantdata(Plantdata);
	}

	public Bapi_Mpgd_GaType_Wrapper getPlanningdata() {
		return new Bapi_Mpgd_GaType_Wrapper(instance.getPlanningdata());
	}
	public void setPlanningdata(Bapi_Mpgd_GaType_Wrapper Planningdata) {
		//instance.setPlanningdata(Planningdata);
	}
	
	public Bapi_Mpop_GaType_Wrapper getForecastparameters() {
		return new Bapi_Mpop_GaType_Wrapper(instance.getForecastparameters());
	}
	public void setForecastparameters(Bapi_Mpop_GaType_Wrapper Forecastparameters) {
		//instance.setForecastparameters(Forecastparameters);
	}

	public Bapi_Mard_GaType_Wrapper getStoragelocationdata() {
		return new Bapi_Mard_GaType_Wrapper(instance.getStoragelocationdata());
	}
	public void setStoragelocationdata(Bapi_Mard_GaType_Wrapper Storagelocationdata) {
		//instance.setStoragelocationdata(Storagelocationdata);
	}

	public Bapi_Mbew_GaType_Wrapper getValuationdata() {
		return new Bapi_Mbew_GaType_Wrapper(instance.getValuationdata());
	}
	public void setValuationdata(Bapi_Mbew_GaType_Wrapper Valuationdata) {
		//instance.setValuationdata(Valuationdata);
	}

	public Bapi_Mlgn_GaType_Wrapper getWarehousenumberdata() {
		return new Bapi_Mlgn_GaType_Wrapper(instance.getWarehousenumberdata());
	}
	public void setWarehousenumberdata(Bapi_Mlgn_GaType_Wrapper Warehousenumberdata) {
		//instance.setWarehousenumberdata(Warehousenumberdata);
	}

	public Bapi_Mvke_GaType_Wrapper getSalesdata() {
		return new Bapi_Mvke_GaType_Wrapper(instance.getSalesdata());
	}
	public void setSalesdata(Bapi_Mvke_GaType_Wrapper Salesdata) {
		//instance.setSalesdata(Salesdata);
	}

	public Bapi_Mlgt_GaType_Wrapper getStoragetypedata() {
		return new Bapi_Mlgt_GaType_Wrapper(instance.getStoragetypedata());
	}
	public void setStoragetypedata(Bapi_Mlgt_GaType_Wrapper Storagetypedata) {
		//instance.setStoragetypedata(Storagetypedata);
	}

	public Bapi_Mfhm_GaType_Wrapper getProductionresourcetooldata() {
		return new Bapi_Mfhm_GaType_Wrapper(instance.getProductionresourcetooldata());
	}
	public void setProductionresourcetooldata(
			Bapi_Mfhm_GaType_Wrapper Productionresourcetooldata) {
		//instance.setProductionresourcetooldata(Productionresourcetooldata);
	}

	public Bapi_Myms_GaType_Wrapper getLifovaluationdata() {
		return new Bapi_Myms_GaType_Wrapper(instance.getLifovaluationdata());
	}
	public void setLifovaluationdata(Bapi_Myms_GaType_Wrapper Lifovaluationdata) {
		//instance.setLifovaluationdata(Lifovaluationdata);
	}

	public Bapi_Makt_GaType_Wrapper[] getMaterialdescription() {
		return Util.copyArray(instance.getMaterialdescription(), Bapi_Makt_GaType.class, Bapi_Makt_GaType_Wrapper.class);
	}
	public void setMaterialdescription(Bapi_Makt_GaType_Wrapper[] Materialdescription) {
		//instance.setMaterialdescription(Materialdescription);
	}

	public Bapi_Marm_GaType_Wrapper[] getUnitsofmeasure() {
		return Util.copyArray(instance.getUnitsofmeasure(), Bapi_Marm_GaType.class, Bapi_Marm_GaType_Wrapper.class);
	}
	public void setUnitsofmeasure(Bapi_Marm_GaType_Wrapper[] Unitsofmeasure) {
		//instance.setUnitsofmeasure(Unitsofmeasure);
	}

	public Bapi_Mean_GaType_Wrapper[] getInternationarticlenumbers() {
		return Util.copyArray(instance.getInternationarticlenumbers(), Bapi_Mean_GaType.class, Bapi_Mean_GaType_Wrapper.class);
	}
	public void setInternationarticlenumbers(
			Bapi_Mean_GaType_Wrapper[] Internationarticlenumbers) {
		//instance.setInternationarticlenumbers(Internationarticlenumbers);
	}

	public Bapi_Mltx_GaType_Wrapper[] getMaterialtext() {
		return Util.copyArray(instance.getMaterialtext(), Bapi_Mltx_GaType.class, Bapi_Mltx_GaType_Wrapper.class);
	}
	public void setMaterialtext(Bapi_Mltx_GaType_Wrapper[] Materialtext) {
		//instance.setMaterialtext(Materialtext);
	}

	public Bapi_Mlan_GaType_Wrapper[] getTaxclassifications() {
		return Util.copyArray(instance.getTaxclassifications(), Bapi_Mlan_GaType.class, Bapi_Mlan_GaType_Wrapper.class);
	}
	public void setTaxclassifications(Bapi_Mlan_GaType_Wrapper[] Taxclassifications) {
		//instance.setTaxclassifications(Taxclassifications);
	}

	public BapiparexType_Wrapper[] getExtensionout() {
		return Util.copyArray(instance.getExtensionout(), BapiparexType.class, BapiparexType_Wrapper.class);
	}
	public void setExtensionout(BapiparexType_Wrapper[] Extensionout) {
		//instance.setExtensionout(Extensionout);
	}

	public BapireturnType_Wrapper[] getReturn() {
		return Util.copyArray(instance.getReturn(), BapireturnType.class, BapireturnType_Wrapper.class);
	}
	public void setReturn(BapireturnType_Wrapper[] Return) {
		//instance.setReturn(Return);
	}
	
}
