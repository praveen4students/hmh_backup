package hmh.sap.rfc.wrapper;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;

import hmh.sap.rfc.Bapi_Mard_GaType;


@XmlRootElement(name = "Bapi_Mard_GaType")
public class Bapi_Mard_GaType_Wrapper {

	private Bapi_Mard_GaType instance;
	
	public void setInstance(Bapi_Mard_GaType instance) {
		this.instance = instance;
	}

	public Bapi_Mard_GaType_Wrapper() {}
	
	public Bapi_Mard_GaType_Wrapper(Bapi_Mard_GaType instance) {
		this.instance = instance;
	}

	
	//
	//	delegate methods
	//

	public void setDel_Flag(String Del_Flag) {
		instance.setDel_Flag(Del_Flag);
	}

	public BigDecimal getRepl_Qty() {
		return instance.getRepl_Qty();
	}

	public String getStge_Loc() {
		return instance.getStge_Loc();
	}

	public void setMrp_Ind(String Mrp_Ind) {
		instance.setMrp_Ind(Mrp_Ind);
	}

	public void setRepl_Qty(BigDecimal Repl_Qty) {
		instance.setRepl_Qty(Repl_Qty);
	}

	public void setStge_Bin(String Stge_Bin) {
		instance.setStge_Bin(Stge_Bin);
	}

	public void setSpec_Proc(String Spec_Proc) {
		instance.setSpec_Proc(Spec_Proc);
	}

	public String getStge_Bin() {
		return instance.getStge_Bin();
	}

	public String getDel_Flag() {
		return instance.getDel_Flag();
	}

	public void setReorder_Pt(BigDecimal Reorder_Pt) {
		instance.setReorder_Pt(Reorder_Pt);
	}

	public void setPlant(String Plant) {
		instance.setPlant(Plant);
	}

	public String getSpec_Proc() {
		return instance.getSpec_Proc();
	}

	public double getInv_Corr_Fac() {
		return instance.getInv_Corr_Fac();
	}

	public void setPickg_Area(String Pickg_Area) {
		instance.setPickg_Area(Pickg_Area);
	}

	public String getPickg_Area() {
		return instance.getPickg_Area();
	}

	public BigDecimal getReorder_Pt() {
		return instance.getReorder_Pt();
	}

	public String getFisc_Year() {
		return instance.getFisc_Year();
	}

	public String getPlant() {
		return instance.getPlant();
	}

	public void setInv_Corr_Fac(double Inv_Corr_Fac) {
		instance.setInv_Corr_Fac(Inv_Corr_Fac);
	}

	public String getMrp_Ind() {
		return instance.getMrp_Ind();
	}

	public void setCurr_Period(String Curr_Period) {
		instance.setCurr_Period(Curr_Period);
	}

	public String getMaint_Stat() {
		return instance.getMaint_Stat();
	}

	public void setFisc_Year(String Fisc_Year) {
		instance.setFisc_Year(Fisc_Year);
	}

	public void setMaint_Stat(String Maint_Stat) {
		instance.setMaint_Stat(Maint_Stat);
	}

	public String getCurr_Period() {
		return instance.getCurr_Period();
	}

	public void setStge_Loc(String Stge_Loc) {
		instance.setStge_Loc(Stge_Loc);
	}
	
}
