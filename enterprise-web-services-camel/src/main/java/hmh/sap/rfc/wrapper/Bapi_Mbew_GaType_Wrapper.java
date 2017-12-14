package hmh.sap.rfc.wrapper;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;

import hmh.sap.rfc.Bapi_Mbew_GaType;


@XmlRootElement(name = "Bapi_Mbew_GaType")
public class Bapi_Mbew_GaType_Wrapper {

	private Bapi_Mbew_GaType instance;
	
	public void setInstance(Bapi_Mbew_GaType instance) {
		this.instance = instance;
	}

	public Bapi_Mbew_GaType_Wrapper() {}
	
	public Bapi_Mbew_GaType_Wrapper(Bapi_Mbew_GaType instance) {
		this.instance = instance;
	}

	
	//
	//	delegate methods
	//

	public void setMatl_Usage(String Matl_Usage) {
		instance.setMatl_Usage(Matl_Usage);
	}

	public String getVm_P_Stock() {
		return instance.getVm_P_Stock();
	}

	public void setPr_Ctrl_Pp(String Pr_Ctrl_Pp) {
		instance.setPr_Ctrl_Pp(Pr_Ctrl_Pp);
	}

	public BigDecimal getMov_Pr_Pp() {
		return instance.getMov_Pr_Pp();
	}

	public BigDecimal getMoving_Pr() {
		return instance.getMoving_Pr();
	}

	public void setVm_P_Stock(String Vm_P_Stock) {
		instance.setVm_P_Stock(Vm_P_Stock);
	}

	public String getVal_Cat() {
		return instance.getVal_Cat();
	}

	public void setCurrency_Iso(String Currency_Iso) {
		instance.setCurrency_Iso(Currency_Iso);
	}

	public void setMl_Settle(String Ml_Settle) {
		instance.setMl_Settle(Ml_Settle);
	}

	public void setCurr_Plan_Price(BigDecimal Curr_Plan_Price) {
		instance.setCurr_Plan_Price(Curr_Plan_Price);
	}

	public void setPoolnumber(String Poolnumber) {
		instance.setPoolnumber(Poolnumber);
	}

	public void setPr_Unit_Pp(BigDecimal Pr_Unit_Pp) {
		instance.setPr_Unit_Pp(Pr_Unit_Pp);
	}

	public String getPoolnumber() {
		return instance.getPoolnumber();
	}

	public String getMl_Settle() {
		return instance.getMl_Settle();
	}

	public void setPer_Pre_Cost_Est(String Per_Pre_Cost_Est) {
		instance.setPer_Pre_Cost_Est(Per_Pre_Cost_Est);
	}

	public void setPlndprice2(BigDecimal Plndprice2) {
		instance.setPlndprice2(Plndprice2);
	}

	public void setMl_Active(String Ml_Active) {
		instance.setMl_Active(Ml_Active);
	}

	public BigDecimal getTax_Cml_Un() {
		return instance.getTax_Cml_Un();
	}

	public BigDecimal getPrev_Plan_Price() {
		return instance.getPrev_Plan_Price();
	}

	public String getMat_Origin() {
		return instance.getMat_Origin();
	}

	public void setVal_Cat(String Val_Cat) {
		instance.setVal_Cat(Val_Cat);
	}

	public void setMov_Pr_Pp(BigDecimal Mov_Pr_Pp) {
		instance.setMov_Pr_Pp(Mov_Pr_Pp);
	}

	public String getVal_Class() {
		return instance.getVal_Class();
	}

	public BigDecimal getTaxprice_3() {
		return instance.getTaxprice_3();
	}

	public void setOverhead_Grp(String Overhead_Grp) {
		instance.setOverhead_Grp(Overhead_Grp);
	}

	public void setFuture_Pr(BigDecimal Future_Pr) {
		instance.setFuture_Pr(Future_Pr);
	}

	public BigDecimal getPlnd_Price() {
		return instance.getPlnd_Price();
	}

	public void setCommprice3(BigDecimal Commprice3) {
		instance.setCommprice3(Commprice3);
	}

	public void setOrig_Group(String Orig_Group) {
		instance.setOrig_Group(Orig_Group);
	}

	public String getCurrency() {
		return instance.getCurrency();
	}

	public void setTaxprice_3(BigDecimal Taxprice_3) {
		instance.setTaxprice_3(Taxprice_3);
	}

	public void setVal_Type(String Val_Type) {
		instance.setVal_Type(Val_Type);
	}

	public String getOverhead_Grp() {
		return instance.getOverhead_Grp();
	}

	public java.util.Date getPlndprdate1() {
		return instance.getPlndprdate1();
	}

	public void setStd_Pr_Pp(BigDecimal Std_Pr_Pp) {
		instance.setStd_Pr_Pp(Std_Pr_Pp);
	}

	public java.util.Date getPlndprdate3() {
		return instance.getPlndprdate3();
	}

	public void setPrev_Plan_Price(BigDecimal Prev_Plan_Price) {
		instance.setPrev_Plan_Price(Prev_Plan_Price);
	}

	public void setVclass_Pp(String Vclass_Pp) {
		instance.setVclass_Pp(Vclass_Pp);
	}

	public String getPer_Cur_Cost_Est() {
		return instance.getPer_Cur_Cost_Est();
	}

	public void setTaxprice_2(BigDecimal Taxprice_2) {
		instance.setTaxprice_2(Taxprice_2);
	}

	public BigDecimal getStd_Price() {
		return instance.getStd_Price();
	}

	public void setPr_Ctrl_Py(String Pr_Ctrl_Py) {
		instance.setPr_Ctrl_Py(Pr_Ctrl_Py);
	}

	public String getVal_Type() {
		return instance.getVal_Type();
	}

	public String getMl_Active() {
		return instance.getMl_Active();
	}

	public void setMoving_Pr(BigDecimal Moving_Pr) {
		instance.setMoving_Pr(Moving_Pr);
	}

	public BigDecimal getCurr_Plan_Price() {
		return instance.getCurr_Plan_Price();
	}

	public void setFisc_Year(String Fisc_Year) {
		instance.setFisc_Year(Fisc_Year);
	}

	public BigDecimal getCommprice1() {
		return instance.getCommprice1();
	}

	public void setLifo_Fifo(String Lifo_Fifo) {
		instance.setLifo_Fifo(Lifo_Fifo);
	}

	public void setFij_Pre_Cost_Est(String Fij_Pre_Cost_Est) {
		instance.setFij_Pre_Cost_Est(Fij_Pre_Cost_Est);
	}

	public String getCurr_Period() {
		return instance.getCurr_Period();
	}

	public java.util.Date getPlndprdate2() {
		return instance.getPlndprdate2();
	}

	public String getLifo_Fifo() {
		return instance.getLifo_Fifo();
	}

	public void setCommprice1(BigDecimal Commprice1) {
		instance.setCommprice1(Commprice1);
	}

	public void setTax_Cml_Un(BigDecimal Tax_Cml_Un) {
		instance.setTax_Cml_Un(Tax_Cml_Un);
	}

	public String getPer_Fut_Cost_Est() {
		return instance.getPer_Fut_Cost_Est();
	}

	public String getPr_Ctrl_Pp() {
		return instance.getPr_Ctrl_Pp();
	}

	public void setPrice_Unit(BigDecimal Price_Unit) {
		instance.setPrice_Unit(Price_Unit);
	}

	public BigDecimal getPrice_Unit() {
		return instance.getPrice_Unit();
	}

	public BigDecimal getCommprice2() {
		return instance.getCommprice2();
	}

	public BigDecimal getTaxprice_1() {
		return instance.getTaxprice_1();
	}

	public void setMat_Origin(String Mat_Origin) {
		instance.setMat_Origin(Mat_Origin);
	}

	public BigDecimal getPlndprice2() {
		return instance.getPlndprice2();
	}

	public String getIn_House() {
		return instance.getIn_House();
	}

	public BigDecimal getPr_Unit_Pp() {
		return instance.getPr_Unit_Pp();
	}

	public void setVal_Area(String Val_Area) {
		instance.setVal_Area(Val_Area);
	}

	public void setMov_Pr_Py(BigDecimal Mov_Pr_Py) {
		instance.setMov_Pr_Py(Mov_Pr_Py);
	}

	public void setFij_Fut_Cost_Est(String Fij_Fut_Cost_Est) {
		instance.setFij_Fut_Cost_Est(Fij_Fut_Cost_Est);
	}

	public void setPlndprice1(BigDecimal Plndprice1) {
		instance.setPlndprice1(Plndprice1);
	}

	public void setVm_So_Stk(String Vm_So_Stk) {
		instance.setVm_So_Stk(Vm_So_Stk);
	}

	public void setPlndprice3(BigDecimal Plndprice3) {
		instance.setPlndprice3(Plndprice3);
	}

	public void setDeval_Ind(String Deval_Ind) {
		instance.setDeval_Ind(Deval_Ind);
	}

	public void setPlndprdate3(java.util.Date Plndprdate3) {
		//instance.setPlndprdate3(Plndprdate3);
	}

	public BigDecimal getPr_Unit_Py() {
		return instance.getPr_Unit_Py();
	}

	public String getVclass_Py() {
		return instance.getVclass_Py();
	}

	public String getFisc_Year() {
		return instance.getFisc_Year();
	}

	public BigDecimal getCommprice3() {
		return instance.getCommprice3();
	}

	public java.util.Date getValid_From() {
		return instance.getValid_From();
	}

	public void setPlnd_Price(BigDecimal Plnd_Price) {
		instance.setPlnd_Price(Plnd_Price);
	}

	public void setQty_Struct(String Qty_Struct) {
		instance.setQty_Struct(Qty_Struct);
	}

	public String getPer_Pre_Cost_Est() {
		return instance.getPer_Pre_Cost_Est();
	}

	public BigDecimal getPlndprice1() {
		return instance.getPlndprice1();
	}

	public String getVal_Area() {
		return instance.getVal_Area();
	}

	public void setTaxprice_1(BigDecimal Taxprice_1) {
		instance.setTaxprice_1(Taxprice_1);
	}

	public void setPlndprdate1(java.util.Date Plndprdate1) {
		//instance.setPlndprdate1(Plndprdate1);
	}

	public BigDecimal getTaxprice_2() {
		return instance.getTaxprice_2();
	}

	public void setCurr_Period(String Curr_Period) {
		instance.setCurr_Period(Curr_Period);
	}

	public void setMaint_Stat(String Maint_Stat) {
		instance.setMaint_Stat(Maint_Stat);
	}

	public void setIn_House(String In_House) {
		instance.setIn_House(In_House);
	}

	public void setPr_Unit_Py(BigDecimal Pr_Unit_Py) {
		instance.setPr_Unit_Py(Pr_Unit_Py);
	}

	public String getPr_Ctrl_Py() {
		return instance.getPr_Ctrl_Py();
	}

	public void setDel_Flag(String Del_Flag) {
		instance.setDel_Flag(Del_Flag);
	}

	public String getQty_Struct() {
		return instance.getQty_Struct();
	}

	public String getPrice_Ctrl() {
		return instance.getPrice_Ctrl();
	}

	public void setPer_Cur_Cost_Est(String Per_Cur_Cost_Est) {
		instance.setPer_Cur_Cost_Est(Per_Cur_Cost_Est);
	}

	public String getCurrency_Iso() {
		return instance.getCurrency_Iso();
	}

	public String getDel_Flag() {
		return instance.getDel_Flag();
	}

	public BigDecimal getStd_Pr_Py() {
		return instance.getStd_Pr_Py();
	}

	public BigDecimal getMov_Pr_Py() {
		return instance.getMov_Pr_Py();
	}

	public void setPlndprdate2(java.util.Date Plndprdate2) {
		//instance.setPlndprdate2(Plndprdate2);
	}

	public BigDecimal getFuture_Pr() {
		return instance.getFuture_Pr();
	}

	public void setStd_Pr_Py(BigDecimal Std_Pr_Py) {
		instance.setStd_Pr_Py(Std_Pr_Py);
	}

	public void setCommprice2(BigDecimal Commprice2) {
		instance.setCommprice2(Commprice2);
	}

	public String getMatl_Usage() {
		return instance.getMatl_Usage();
	}

	public void setValid_From(java.util.Date Valid_From) {
		//instance.setValid_From(Valid_From);
	}

	public void setPer_Fut_Cost_Est(String Per_Fut_Cost_Est) {
		instance.setPer_Fut_Cost_Est(Per_Fut_Cost_Est);
	}

	public void setCurrency(String Currency) {
		instance.setCurrency(Currency);
	}

	public String getVm_So_Stk() {
		return instance.getVm_So_Stk();
	}

	public String getFij_Fut_Cost_Est() {
		return instance.getFij_Fut_Cost_Est();
	}

	public String getDeval_Ind() {
		return instance.getDeval_Ind();
	}

	public void setOrig_Mat(String Orig_Mat) {
		instance.setOrig_Mat(Orig_Mat);
	}

	public String getVclass_Pp() {
		return instance.getVclass_Pp();
	}

	public void setStd_Price(BigDecimal Std_Price) {
		instance.setStd_Price(Std_Price);
	}

	public void setFij_Cur_Cost_Est(String Fij_Cur_Cost_Est) {
		instance.setFij_Cur_Cost_Est(Fij_Cur_Cost_Est);
	}

	public void setPrice_Ctrl(String Price_Ctrl) {
		instance.setPrice_Ctrl(Price_Ctrl);
	}

	public BigDecimal getPlndprice3() {
		return instance.getPlndprice3();
	}

	public void setVal_Class(String Val_Class) {
		instance.setVal_Class(Val_Class);
	}

	public String getMaint_Stat() {
		return instance.getMaint_Stat();
	}

	public BigDecimal getStd_Pr_Pp() {
		return instance.getStd_Pr_Pp();
	}

	public String getFij_Pre_Cost_Est() {
		return instance.getFij_Pre_Cost_Est();
	}

	public String getOrig_Group() {
		return instance.getOrig_Group();
	}

	public void setVclass_Py(String Vclass_Py) {
		instance.setVclass_Py(Vclass_Py);
	}

	public String getOrig_Mat() {
		return instance.getOrig_Mat();
	}

	public String getFij_Cur_Cost_Est() {
		return instance.getFij_Cur_Cost_Est();
	}

}
