package hmh.sap.rfc.wrapper;

import java.math.BigDecimal;
import java.sql.Date;

import javax.xml.bind.annotation.XmlRootElement;
import hmh.sap.rfc.Bapi_Mara_GaType;


@XmlRootElement(name = "Bapi_Mara_GaType")
public class Bapi_Mara_GaType_Wrapper {

	private Bapi_Mara_GaType instance;
	
	public void setInstance(Bapi_Mara_GaType instance) {
		this.instance = instance;
	}

	public Bapi_Mara_GaType_Wrapper() {}
	
	public Bapi_Mara_GaType_Wrapper(Bapi_Mara_GaType instance) {
		this.instance = instance;
	}
	
	
	//
	//	delegate methods
	//
	public String getInv_Mat_No_Version() {
		// TODO Auto-generated method stub
		return instance.getInv_Mat_No_Version();
	}

	
	public String getBase_Uom() {
		// TODO Auto-generated method stub
		return instance.getBase_Uom();
	}

	
	public String getPl_Ref_Mat() {
		// TODO Auto-generated method stub
		return instance.getPl_Ref_Mat();
	}

	
	public String getLabel_Form() {
		// TODO Auto-generated method stub
		return instance.getLabel_Form();
	}

	
	public void setRound_Up_Rule_Expiration_Date(
			String Round_Up_Rule_Expiration_Date) {
		// TODO Auto-generated method stub
		instance.setRound_Up_Rule_Expiration_Date(Round_Up_Rule_Expiration_Date);
	}

	
	public String getEnvt_Rlvt() {
		// TODO Auto-generated method stub
		return instance.getEnvt_Rlvt();
	}

	
	public String getSal_Status() {
		// TODO Auto-generated method stub
		return instance.getSal_Status();
	}

	
	public BigDecimal getNet_Weight() {
		// TODO Auto-generated method stub
		return instance.getNet_Weight();
	}

	
	public String getNo_Sheets() {
		// TODO Auto-generated method stub
		return instance.getNo_Sheets();
	}

	
	public void setProd_Alloc(String Prod_Alloc) {
		// TODO Auto-generated method stub
		instance.setProd_Alloc(Prod_Alloc);
	}

	
	public void setBase_Uom(String Base_Uom) {
		// TODO Auto-generated method stub
		instance.setBase_Uom(Base_Uom);
	}

	
	public String getSerialization_Level() {
		// TODO Auto-generated method stub
		return instance.getSerialization_Level();
	}

	
	public String getProd_Composition_On_Packaging() {
		// TODO Auto-generated method stub
		return instance.getProd_Composition_On_Packaging();
	}

	
	public String getProd_Memo() {
		// TODO Auto-generated method stub
		return instance.getProd_Memo();
	}

	
	public String getUomusage() {
		// TODO Auto-generated method stub
		return instance.getUomusage();
	}

	
	public void setSvalidfrom(java.util.Date Svalidfrom) {
		// TODO Auto-generated method stub
		instance.setSvalidfrom(new Date(Svalidfrom.getTime()));
	}

	
	public void setStor_Conds(String Stor_Conds) {
		// TODO Auto-generated method stub
		instance.setStor_Conds(Stor_Conds);
	}

	
	public void setMatl_Type(String Matl_Type) {
		// TODO Auto-generated method stub
		instance.setMatl_Type(Matl_Type);
	}

	
	public void setEnvt_Rlvt(String Envt_Rlvt) {
		// TODO Auto-generated method stub
		instance.setEnvt_Rlvt(Envt_Rlvt);
	}

	
	public String getCompetitor() {
		// TODO Auto-generated method stub
		return instance.getCompetitor();
	}

	
	public void setStd_Descr(String Std_Descr) {
		// TODO Auto-generated method stub
		instance.setStd_Descr(Std_Descr);
	}

	
	public String getHaz_Mat_No_Guid() {
		// TODO Auto-generated method stub
		return instance.getHaz_Mat_No_Guid();
	}

	
	public void setPo_Unit_Iso(String Po_Unit_Iso) {
		// TODO Auto-generated method stub
		instance.setPo_Unit_Iso(Po_Unit_Iso);
	}

	
	public void setItem_Cat(String Item_Cat) {
		// TODO Auto-generated method stub
		instance.setItem_Cat(Item_Cat);
	}

	
	public void setFill_Level(BigDecimal Fill_Level) {
		// TODO Auto-generated method stub
		instance.setFill_Level(Fill_Level);
	}

	
	public void setStack_Fact(short Stack_Fact) {
		// TODO Auto-generated method stub
		instance.setStack_Fact(Stack_Fact);
	}

	
	public String getChanged_By() {
		// TODO Auto-generated method stub
		return instance.getChanged_By();
	}

	
	public java.util.Date getSvalidfrom() {
		// TODO Auto-generated method stub
		return instance.getSvalidfrom();
	}

	
	public String getBasic_Matl() {
		// TODO Auto-generated method stub
		return instance.getBasic_Matl();
	}

	
	public void setCreated_On(java.util.Date Created_On) {
		// TODO Auto-generated method stub
		//instance.setCreated_On(new Date(Created_On.getTime()));
	}

	
	public void setBase_Uom_Iso(String Base_Uom_Iso) {
		// TODO Auto-generated method stub
		instance.setBase_Uom_Iso(Base_Uom_Iso);
	}

	
	public String getProc_Rule() {
		// TODO Auto-generated method stub
		return instance.getProc_Rule();
	}

	
	public void setQm_Procmnt(String Qm_Procmnt) {
		// TODO Auto-generated method stub
		instance.setQm_Procmnt(Qm_Procmnt);
	}

	
	public void setUnit_Of_Wt(String Unit_Of_Wt) {
		// TODO Auto-generated method stub
		instance.setUnit_Of_Wt(Unit_Of_Wt);
	}

	
	public void setLast_Chnge(java.util.Date Last_Chnge) {
		// TODO Auto-generated method stub
		instance.setLast_Chnge(new Date(Last_Chnge.getTime()));
	}

	
	public void setCatprofile(String Catprofile) {
		// TODO Auto-generated method stub
		instance.setCatprofile(Catprofile);
	}

	
	public void setCo_Product(String Co_Product) {
		// TODO Auto-generated method stub
		instance.setCo_Product(Co_Product);
	}

	
	public BigDecimal getQty_Gr_Gi() {
		// TODO Auto-generated method stub
		return instance.getQty_Gr_Gi();
	}

	
	public void setProc_Rule(String Proc_Rule) {
		// TODO Auto-generated method stub
		instance.setProc_Rule(Proc_Rule);
	}

	
	public void setMfr_No(String Mfr_No) {
		// TODO Auto-generated method stub
		instance.setMfr_No(Mfr_No);
	}

	
	public String getAppd_B_Rec() {
		// TODO Auto-generated method stub
		return instance.getAppd_B_Rec();
	}

	
	public String getProd_Alloc() {
		// TODO Auto-generated method stub
		return instance.getProd_Alloc();
	}

	
	public void setPeriod_Ind_Expiration_Date(String Period_Ind_Expiration_Date) {
		// TODO Auto-generated method stub
		instance.setPeriod_Ind_Expiration_Date(Period_Ind_Expiration_Date);
	}

	
	public void setPack_Wt_Un_Iso(String Pack_Wt_Un_Iso) {
		// TODO Auto-generated method stub
		instance.setPack_Wt_Un_Iso(Pack_Wt_Un_Iso);
	}

	
	public void setTrans_Grp(String Trans_Grp) {
		// TODO Auto-generated method stub
		instance.setTrans_Grp(Trans_Grp);
	}

	
	public void setNet_Weight(BigDecimal Net_Weight) {
		// TODO Auto-generated method stub
		instance.setNet_Weight(Net_Weight);
	}

	
	public java.util.Date getLast_Chnge() {
		// TODO Auto-generated method stub
		return instance.getLast_Chnge();
	}

	
	public void setSup_Source(String Sup_Source) {
		// TODO Auto-generated method stub
		instance.setSup_Source(Sup_Source);
	}

	
	public String getCm_Relevance_Flag() {
		// TODO Auto-generated method stub
		return instance.getCm_Relevance_Flag();
	}

	
	public void setShelf_Life(BigDecimal Shelf_Life) {
		// TODO Auto-generated method stub
		instance.setShelf_Life(Shelf_Life);
	}

	
	public void setHaz_Mat_No_External(String Haz_Mat_No_External) {
		// TODO Auto-generated method stub
		instance.setHaz_Mat_No_External(Haz_Mat_No_External);
	}

	
	public BigDecimal getStor_Pct() {
		// TODO Auto-generated method stub
		return instance.getStor_Pct();
	}

	
	public String getHaz_Mat_No_Version() {
		// TODO Auto-generated method stub
		return instance.getHaz_Mat_No_Version();
	}

	
	public void setDoc_Chg_No(String Doc_Chg_No) {
		// TODO Auto-generated method stub
		instance.setDoc_Chg_No(Doc_Chg_No);
	}

	
	public void setMat_Status(String Mat_Status) {
		// TODO Auto-generated method stub
		instance.setMat_Status(Mat_Status);
	}

	
	public String getDoc_Type() {
		// TODO Auto-generated method stub
		return instance.getDoc_Type();
	}

	
	public void setQty_Gr_Gi(BigDecimal Qty_Gr_Gi) {
		// TODO Auto-generated method stub
		instance.setQty_Gr_Gi(Qty_Gr_Gi);
	}

	
	public String getHaz_Mat_No() {
		// TODO Auto-generated method stub
		return instance.getHaz_Mat_No();
	}

	
	public void setLabel_Type(String Label_Type) {
		// TODO Auto-generated method stub
		instance.setLabel_Type(Label_Type);
	}

	
	public void setInv_Mat_No_Guid(String Inv_Mat_No_Guid) {
		// TODO Auto-generated method stub
		instance.setInv_Mat_No_Guid(Inv_Mat_No_Guid);
	}

	
	public String getExtmatlgrp() {
		// TODO Auto-generated method stub
		return instance.getExtmatlgrp();
	}

	
	public java.util.Date getPvalidfrom() {
		// TODO Auto-generated method stub
		return instance.getPvalidfrom();
	}

	
	public String getMaterial_Fixed() {
		// TODO Auto-generated method stub
		return instance.getMaterial_Fixed();
	}

	
	public String getDsn_Office() {
		// TODO Auto-generated method stub
		return instance.getDsn_Office();
	}

	
	public void setUomusage(String Uomusage) {
		// TODO Auto-generated method stub
		instance.setUomusage(Uomusage);
	}

	
	public String getPageformat() {
		// TODO Auto-generated method stub
		return instance.getPageformat();
	}

	
	public void setGtin_Variant(String Gtin_Variant) {
		// TODO Auto-generated method stub
		instance.setGtin_Variant(Gtin_Variant);
	}

	
	public void setAppd_B_Rec(String Appd_B_Rec) {
		// TODO Auto-generated method stub
		instance.setAppd_B_Rec(Appd_B_Rec);
	}

	
	public String getMaterial() {
		// TODO Auto-generated method stub
		return instance.getMaterial();
	}

	
	public String getPo_Unit_Iso() {
		// TODO Auto-generated method stub
		return instance.getPo_Unit_Iso();
	}

	
	public String getItem_Cat() {
		// TODO Auto-generated method stub
		return instance.getItem_Cat();
	}

	
	public BigDecimal getVol_Tol_Lt() {
		// TODO Auto-generated method stub
		return instance.getVol_Tol_Lt();
	}

	
	public void setHaz_Mat_No(String Haz_Mat_No) {
		// TODO Auto-generated method stub
		instance.setHaz_Mat_No(Haz_Mat_No);
	}

	
	public void setNo_Sheets(String No_Sheets) {
		// TODO Auto-generated method stub
		instance.setNo_Sheets(No_Sheets);
	}

	
	public void setPar_Eff(String Par_Eff) {
		// TODO Auto-generated method stub
		instance.setPar_Eff(Par_Eff);
	}

	
	public String getHigh_Visc() {
		// TODO Auto-generated method stub
		return instance.getHigh_Visc();
	}

	
	public void setSeason(String Season) {
		// TODO Auto-generated method stub
		instance.setSeason(Season);
	}

	
	public void setProd_Memo(String Prod_Memo) {
		// TODO Auto-generated method stub
		instance.setProd_Memo(Prod_Memo);
	}

	
	public String getSup_Source() {
		// TODO Auto-generated method stub
		return instance.getSup_Source();
	}

	
	public void setPur_Status(String Pur_Status) {
		// TODO Auto-generated method stub
		instance.setPur_Status(Pur_Status);
	}

	
	public String getLooseorliq() {
		// TODO Auto-generated method stub
		return instance.getLooseorliq();
	}

	
	public void setMaterial(String Material) {
		// TODO Auto-generated method stub
		instance.setMaterial(Material);
	}

	
	public String getHaz_Mat_No_External() {
		// TODO Auto-generated method stub
		return instance.getHaz_Mat_No_External();
	}

	
	public void setHaz_Mat_No_Guid(String Haz_Mat_No_Guid) {
		// TODO Auto-generated method stub
		instance.setHaz_Mat_No_Guid(Haz_Mat_No_Guid);
	}

	
	public void setVar_Ord_Un(String Var_Ord_Un) {
		// TODO Auto-generated method stub
		instance.setVar_Ord_Un(Var_Ord_Un);
	}

	
	public String getClosed_Box() {
		// TODO Auto-generated method stub
		return instance.getClosed_Box();
	}

	
	public BigDecimal getAllwd_Vol() {
		// TODO Auto-generated method stub
		return instance.getAllwd_Vol();
	}

	
	public java.util.Date getCreated_On() {
		// TODO Auto-generated method stub
		return instance.getCreated_On();
	}

	
	public String getContainer() {
		// TODO Auto-generated method stub
		return instance.getContainer();
	}

	
	public void setDsn_Office(String Dsn_Office) {
		// TODO Auto-generated method stub
		instance.setDsn_Office(Dsn_Office);
	}

	
	public String getMatl_Group() {
		// TODO Auto-generated method stub
		return instance.getMatl_Group();
	}

	
	public void setDel_Flag(String Del_Flag) {
		// TODO Auto-generated method stub
		instance.setDel_Flag(Del_Flag);
	}

	
	public String getPack_Vo_Un() {
		// TODO Auto-generated method stub
		return instance.getPack_Vo_Un();
	}

	
	public void setCompetitor(String Competitor) {
		// TODO Auto-generated method stub
		instance.setCompetitor(Competitor);
	}

	
	public BigDecimal getFill_Level() {
		// TODO Auto-generated method stub
		return instance.getFill_Level();
	}

	
	public void setPvalidfrom(java.util.Date Pvalidfrom) {
		// TODO Auto-generated method stub
		instance.setPvalidfrom(new Date(Pvalidfrom.getTime()));
	}

	
	public String getDel_Flag() {
		// TODO Auto-generated method stub
		return instance.getDel_Flag();
	}

	
	public void setStor_Pct(BigDecimal Stor_Pct) {
		// TODO Auto-generated method stub
		instance.setStor_Pct(Stor_Pct);
	}

	
	public String getDocument() {
		// TODO Auto-generated method stub
		return instance.getDocument();
	}

	
	public void setConf_Matl(String Conf_Matl) {
		// TODO Auto-generated method stub
		instance.setConf_Matl(Conf_Matl);
	}

	
	public void setWt_Tol_Lt(BigDecimal Wt_Tol_Lt) {
		// TODO Auto-generated method stub
		instance.setWt_Tol_Lt(Wt_Tol_Lt);
	}

	
	public String getVar_Ord_Un() {
		// TODO Auto-generated method stub
		return instance.getVar_Ord_Un();
	}

	
	public void setInv_Mat_No_Version(String Inv_Mat_No_Version) {
		// TODO Auto-generated method stub
		instance.setInv_Mat_No_Version(Inv_Mat_No_Version);
	}

	
	public void setPl_Ref_Mat(String Pl_Ref_Mat) {
		// TODO Auto-generated method stub
		instance.setPl_Ref_Mat(Pl_Ref_Mat);
	}

	
	public void setProd_Composition_On_Packaging(
			String Prod_Composition_On_Packaging) {
		// TODO Auto-generated method stub
		instance.setProd_Composition_On_Packaging(Prod_Composition_On_Packaging);
	}

	
	public String getCad_Id() {
		// TODO Auto-generated method stub
		return instance.getCad_Id();
	}

	
	public void setHazmatprof(String Hazmatprof) {
		// TODO Auto-generated method stub
		instance.setHazmatprof(Hazmatprof);
	}

	
	public String getPeriod_Ind_Expiration_Date() {
		// TODO Auto-generated method stub
		return instance.getPeriod_Ind_Expiration_Date();
	}

	
	public String getPack_Vo_Un_Iso() {
		// TODO Auto-generated method stub
		return instance.getPack_Vo_Un_Iso();
	}

	
	public void setChanged_By(String Changed_By) {
		// TODO Auto-generated method stub
		instance.setChanged_By(Changed_By);
	}

	
	public String getPo_Unit() {
		// TODO Auto-generated method stub
		return instance.getPo_Unit();
	}

	
	public String getSled_Bbd() {
		// TODO Auto-generated method stub
		return instance.getSled_Bbd();
	}

	
	public void setMatl_Group(String Matl_Group) {
		// TODO Auto-generated method stub
		instance.setMatl_Group(Matl_Group);
	}

	
	public void setSled_Bbd(String Sled_Bbd) {
		// TODO Auto-generated method stub
		instance.setSled_Bbd(Sled_Bbd);
	}

	
	public void setPack_Wt_Un(String Pack_Wt_Un) {
		// TODO Auto-generated method stub
		instance.setPack_Wt_Un(Pack_Wt_Un);
	}

	
	public void setDivision(String Division) {
		// TODO Auto-generated method stub
		instance.setDivision(Division);
	}

	
	public String getMaint_Stat() {
		// TODO Auto-generated method stub
		return instance.getMaint_Stat();
	}

	
	public void setPur_Valkey(String Pur_Valkey) {
		// TODO Auto-generated method stub
		instance.setPur_Valkey(Pur_Valkey);
	}

	
	public String getQm_Procmnt() {
		// TODO Auto-generated method stub
		return instance.getQm_Procmnt();
	}

	
	public void setCreated_By(String Created_By) {
		// TODO Auto-generated method stub
		instance.setCreated_By(Created_By);
	}

	
	public void setDocument(String Document) {
		// TODO Auto-generated method stub
		instance.setDocument(Document);
	}

	
	public String getDoc_Chg_No() {
		// TODO Auto-generated method stub
		return instance.getDoc_Chg_No();
	}

	
	public String getInv_Mat_No_Guid() {
		// TODO Auto-generated method stub
		return instance.getInv_Mat_No_Guid();
	}

	
	public String getGtin_Variant() {
		// TODO Auto-generated method stub
		return instance.getGtin_Variant();
	}

	
	public String getSh_Mat_Typ() {
		// TODO Auto-generated method stub
		return instance.getSh_Mat_Typ();
	}

	
	public String getManuf_Prof() {
		// TODO Auto-generated method stub
		return instance.getManuf_Prof();
	}

	
	public String getDivision() {
		// TODO Auto-generated method stub
		return instance.getDivision();
	}

	
	public String getInv_Mat_No() {
		// TODO Auto-generated method stub
		return instance.getInv_Mat_No();
	}

	
	public String getQual_Dik() {
		// TODO Auto-generated method stub
		return instance.getQual_Dik();
	}

	
	public String getOld_Mat_No() {
		// TODO Auto-generated method stub
		return instance.getOld_Mat_No();
	}

	
	public void setAllwd_Vol(BigDecimal Allwd_Vol) {
		// TODO Auto-generated method stub
		instance.setAllwd_Vol(Allwd_Vol);
	}

	
	public void setContainer(String Container) {
		// TODO Auto-generated method stub
		instance.setContainer(Container);
	}

	
	public String getCo_Product() {
		// TODO Auto-generated method stub
		return instance.getCo_Product();
	}

	
	public String getConfigured() {
		// TODO Auto-generated method stub
		return instance.getConfigured();
	}

	
	public void setMatcmpllvl(String Matcmpllvl) {
		// TODO Auto-generated method stub
		instance.setMatcmpllvl(Matcmpllvl);
	}

	
	public String getMatl_Type() {
		// TODO Auto-generated method stub
		return instance.getMatl_Type();
	}

	
	public void setPack_Vo_Un_Iso(String Pack_Vo_Un_Iso) {
		// TODO Auto-generated method stub
		instance.setPack_Vo_Un_Iso(Pack_Vo_Un_Iso);
	}

	
	public void setCm_Relevance_Flag(String Cm_Relevance_Flag) {
		// TODO Auto-generated method stub
		instance.setCm_Relevance_Flag(Cm_Relevance_Flag);
	}

	
	public String getInd_Sector() {
		// TODO Auto-generated method stub
		return instance.getInd_Sector();
	}

	
	public void setInv_Mat_No_External(String Inv_Mat_No_External) {
		// TODO Auto-generated method stub
		instance.setInv_Mat_No_External(Inv_Mat_No_External);
	}

	
	public void setHigh_Visc(String High_Visc) {
		// TODO Auto-generated method stub
		instance.setHigh_Visc(High_Visc);
	}

	
	public void setClosed_Box(String Closed_Box) {
		// TODO Auto-generated method stub
		instance.setClosed_Box(Closed_Box);
	}

	
	public String getPack_Wt_Un() {
		// TODO Auto-generated method stub
		return instance.getPack_Wt_Un();
	}

	
	public void setLabel_Form(String Label_Form) {
		// TODO Auto-generated method stub
		instance.setLabel_Form(Label_Form);
	}

	
	public String getCreated_By() {
		// TODO Auto-generated method stub
		return instance.getCreated_By();
	}

	
	public void setDoc_Type(String Doc_Type) {
		// TODO Auto-generated method stub
		instance.setDoc_Type(Doc_Type);
	}

	
	public String getMatcmpllvl() {
		// TODO Auto-generated method stub
		return instance.getMatcmpllvl();
	}

	
	public void setProd_Hier(String Prod_Hier) {
		// TODO Auto-generated method stub
		instance.setProd_Hier(Prod_Hier);
	}

	
	public void setHaz_Mat_No_Version(String Haz_Mat_No_Version) {
		// TODO Auto-generated method stub
		instance.setHaz_Mat_No_Version(Haz_Mat_No_Version);
	}

	
	public void setBatch_Mgmt(String Batch_Mgmt) {
		// TODO Auto-generated method stub
		instance.setBatch_Mgmt(Batch_Mgmt);
	}

	
	public void setConfigured(String Configured) {
		// TODO Auto-generated method stub
		instance.setConfigured(Configured);
	}

	
	public String getInv_Mat_No_External() {
		// TODO Auto-generated method stub
		return instance.getInv_Mat_No_External();
	}

	
	public void setAllowed_Wt(BigDecimal Allowed_Wt) {
		// TODO Auto-generated method stub
		instance.setAllowed_Wt(Allowed_Wt);
	}

	
	public String getCatprofile() {
		// TODO Auto-generated method stub
		return instance.getCatprofile();
	}

	
	public String getPack_Wt_Un_Iso() {
		// TODO Auto-generated method stub
		return instance.getPack_Wt_Un_Iso();
	}

	
	public String getSize_Dim() {
		// TODO Auto-generated method stub
		return instance.getSize_Dim();
	}

	
	public void setTemp_Conds(String Temp_Conds) {
		// TODO Auto-generated method stub
		instance.setTemp_Conds(Temp_Conds);
	}

	
	public void setExtmatlgrp(String Extmatlgrp) {
		// TODO Auto-generated method stub
		instance.setExtmatlgrp(Extmatlgrp);
	}

	
	public void setPage_No(String Page_No) {
		// TODO Auto-generated method stub
		instance.setPage_No(Page_No);
	}

	
	public short getStack_Fact() {
		// TODO Auto-generated method stub
		return instance.getStack_Fact();
	}

	
	public String getPar_Eff() {
		// TODO Auto-generated method stub
		return instance.getPar_Eff();
	}

	
	public String getDoc_Format() {
		// TODO Auto-generated method stub
		return instance.getDoc_Format();
	}

	
	public void setLooseorliq(String Looseorliq) {
		// TODO Auto-generated method stub
		instance.setLooseorliq(Looseorliq);
	}

	
	public void setBasic_Matl(String Basic_Matl) {
		// TODO Auto-generated method stub
		instance.setBasic_Matl(Basic_Matl);
	}

	
	public void setOld_Mat_No(String Old_Mat_No) {
		// TODO Auto-generated method stub
		instance.setOld_Mat_No(Old_Mat_No);
	}

	
	public String getPage_No() {
		// TODO Auto-generated method stub
		return instance.getPage_No();
	}

	
	public String getMat_Grp_Sm() {
		// TODO Auto-generated method stub
		return instance.getMat_Grp_Sm();
	}

	
	public void setManu_Mat(String Manu_Mat) {
		// TODO Auto-generated method stub
		instance.setManu_Mat(Manu_Mat);
	}

	
	public BigDecimal getMinremlife() {
		// TODO Auto-generated method stub
		return instance.getMinremlife();
	}

	
	public void setQual_Dik(String Qual_Dik) {
		// TODO Auto-generated method stub
		instance.setQual_Dik(Qual_Dik);
	}

	
	public String getManu_Mat() {
		// TODO Auto-generated method stub
		return instance.getManu_Mat();
	}

	
	public String getPur_Status() {
		// TODO Auto-generated method stub
		return instance.getPur_Status();
	}

	
	public void setPr_Ref_Mat(String Pr_Ref_Mat) {
		// TODO Auto-generated method stub
		instance.setPr_Ref_Mat(Pr_Ref_Mat);
	}

	
	public void setInv_Mat_No(String Inv_Mat_No) {
		// TODO Auto-generated method stub
		instance.setInv_Mat_No(Inv_Mat_No);
	}

	
	public String getUnit_Of_Wt() {
		// TODO Auto-generated method stub
		return instance.getUnit_Of_Wt();
	}

	
	public String getBase_Uom_Iso() {
		// TODO Auto-generated method stub
		return instance.getBase_Uom_Iso();
	}

	
	public void setCad_Id(String Cad_Id) {
		// TODO Auto-generated method stub
		instance.setCad_Id(Cad_Id);
	}

	
	public void setSerialization_Level(String Serialization_Level) {
		// TODO Auto-generated method stub
		instance.setSerialization_Level(Serialization_Level);
	}

	
	public String getTrans_Grp() {
		// TODO Auto-generated method stub
		return instance.getTrans_Grp();
	}

	
	public void setMat_Grp_Sm(String Mat_Grp_Sm) {
		// TODO Auto-generated method stub
		instance.setMat_Grp_Sm(Mat_Grp_Sm);
	}

	
	public void setVol_Tol_Lt(BigDecimal Vol_Tol_Lt) {
		// TODO Auto-generated method stub
		instance.setVol_Tol_Lt(Vol_Tol_Lt);
	}

	
	public void setMaint_Stat(String Maint_Stat) {
		// TODO Auto-generated method stub
		instance.setMaint_Stat(Maint_Stat);
	}

	
	public void setPack_Vo_Un(String Pack_Vo_Un) {
		// TODO Auto-generated method stub
		instance.setPack_Vo_Un(Pack_Vo_Un);
	}

	
	public String getPur_Valkey() {
		// TODO Auto-generated method stub
		return instance.getPur_Valkey();
	}

	
	public void setSize_Dim(String Size_Dim) {
		// TODO Auto-generated method stub
		instance.setSize_Dim(Size_Dim);
	}

	
	public String getTemp_Conds() {
		// TODO Auto-generated method stub
		return instance.getTemp_Conds();
	}

	
	public void setManuf_Prof(String Manuf_Prof) {
		// TODO Auto-generated method stub
		instance.setManuf_Prof(Manuf_Prof);
	}

	
	public void setPo_Unit(String Po_Unit) {
		// TODO Auto-generated method stub
		instance.setPo_Unit(Po_Unit);
	}

	
	public String getLabel_Type() {
		// TODO Auto-generated method stub
		return instance.getLabel_Type();
	}

	
	public void setDoc_Format(String Doc_Format) {
		// TODO Auto-generated method stub
		instance.setDoc_Format(Doc_Format);
	}

	
	public String getDoc_Vers() {
		// TODO Auto-generated method stub
		return instance.getDoc_Vers();
	}

	
	public void setUnit_Of_Wt_Iso(String Unit_Of_Wt_Iso) {
		// TODO Auto-generated method stub
		instance.setUnit_Of_Wt_Iso(Unit_Of_Wt_Iso);
	}

	
	public String getPr_Ref_Mat() {
		// TODO Auto-generated method stub
		return instance.getPr_Ref_Mat();
	}

	
	public BigDecimal getWt_Tol_Lt() {
		// TODO Auto-generated method stub
		return instance.getWt_Tol_Lt();
	}

	
	public void setDoc_Vers(String Doc_Vers) {
		// TODO Auto-generated method stub
		instance.setDoc_Vers(Doc_Vers);
	}

	
	public String getStor_Conds() {
		// TODO Auto-generated method stub
		return instance.getStor_Conds();
	}

		
	public String getHazmatprof() {
		// TODO Auto-generated method stub
		return instance.getHazmatprof();
	}

	
	public String getSeason() {
		// TODO Auto-generated method stub
		return instance.getSeason();
	}

	
	public String getUnit_Of_Wt_Iso() {
		// TODO Auto-generated method stub
		return instance.getUnit_Of_Wt_Iso();
	}

	
	public String getStd_Descr() {
		// TODO Auto-generated method stub
		return instance.getStd_Descr();
	}

	
	public String getAuthoritygroup() {
		// TODO Auto-generated method stub
		return instance.getAuthoritygroup();
	}

	
	public void setMaterial_Fixed(String Material_Fixed) {
		// TODO Auto-generated method stub
		instance.setMaterial_Fixed(Material_Fixed);
	}

	
	public String getBatch_Mgmt() {
		// TODO Auto-generated method stub
		return instance.getBatch_Mgmt();
	}

	
	public BigDecimal getShelf_Life() {
		// TODO Auto-generated method stub
		return instance.getShelf_Life();
	}

	
	public String getMfr_No() {
		// TODO Auto-generated method stub
		return instance.getMfr_No();
	}

	
	public String getMat_Status() {
		// TODO Auto-generated method stub
		return instance.getMat_Status();
	}

	
	public String getProd_Hier() {
		// TODO Auto-generated method stub
		return instance.getProd_Hier();
	}

	
	public BigDecimal getAllowed_Wt() {
		// TODO Auto-generated method stub
		return instance.getAllowed_Wt();
	}

	
	public String getRound_Up_Rule_Expiration_Date() {
		// TODO Auto-generated method stub
		return instance.getRound_Up_Rule_Expiration_Date();
	}

	
	public void setPageformat(String Pageformat) {
		// TODO Auto-generated method stub
		instance.setPageformat(Pageformat);
	}

	
	public void setMinremlife(BigDecimal Minremlife) {
		// TODO Auto-generated method stub
		instance.setMinremlife(Minremlife);
	}

	
	public void setAuthoritygroup(String Authoritygroup) {
		// TODO Auto-generated method stub
		instance.setAuthoritygroup(Authoritygroup);
	}

	
	public String getConf_Matl() {
		// TODO Auto-generated method stub
		return instance.getConf_Matl();
	}

	
	public void setSh_Mat_Typ(String Sh_Mat_Typ) {
		// TODO Auto-generated method stub
		instance.setSh_Mat_Typ(Sh_Mat_Typ);
	}

	
	public void setSal_Status(String Sal_Status) {
		// TODO Auto-generated method stub
		instance.setSal_Status(Sal_Status);
	}

	
	public void setInd_Sector(String Ind_Sector) {
		// TODO Auto-generated method stub
		instance.setInd_Sector(Ind_Sector);
	}

}
