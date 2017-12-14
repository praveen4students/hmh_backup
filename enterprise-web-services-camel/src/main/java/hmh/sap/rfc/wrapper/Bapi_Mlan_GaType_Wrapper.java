package hmh.sap.rfc.wrapper;

import hmh.sap.rfc.Bapi_Mlan_GaType;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "Bapi_Mlan_GaType")
public class Bapi_Mlan_GaType_Wrapper {

		private Bapi_Mlan_GaType instance;
		
		public void setInstance(Bapi_Mlan_GaType instance) {
			this.instance = instance;
		}

		public Bapi_Mlan_GaType_Wrapper() {}
		
		public Bapi_Mlan_GaType_Wrapper(Bapi_Mlan_GaType instance) {
			this.instance = instance;
		}

		
		//
		//	delegate methods
		//

		public void setTax_Type_1(String Tax_Type_1) {
			instance.setTax_Type_1(Tax_Type_1);
		}

		public void setDepcountry_Iso(String Depcountry_Iso) {
			instance.setDepcountry_Iso(Depcountry_Iso);
		}

		public String getTaxclass_1() {
			return instance.getTaxclass_1();
		}

		public String getDepcountry() {
			return instance.getDepcountry();
		}

		public void setTaxclass_1(String Taxclass_1) {
			instance.setTaxclass_1(Taxclass_1);
		}

		public void setDepcountry(String Depcountry) {
			instance.setDepcountry(Depcountry);
		}

		public String getTax_Type_1() {
			return instance.getTax_Type_1();
		}

		public String getDepcountry_Iso() {
			return instance.getDepcountry_Iso();
		}
		
}
