package hmh.sap.rfc.wrapper;

import hmh.sap.rfc.Bapi_Mean_GaType;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Bapi_Mean_GaType")
public class Bapi_Mean_GaType_Wrapper {

		private Bapi_Mean_GaType instance;
		
		public void setInstance(Bapi_Mean_GaType instance) {
			this.instance = instance;
		}

		public Bapi_Mean_GaType_Wrapper() {}
		
		public Bapi_Mean_GaType_Wrapper(Bapi_Mean_GaType instance) {
			this.instance = instance;
		}

		
		//
		//	delegate methods
		//

		public void setMain_Ean(String Main_Ean) {
			instance.setMain_Ean(Main_Ean);
		}

		public void setEan_Upc(String Ean_Upc) {
			instance.setEan_Upc(Ean_Upc);
		}

		public void setUnit(String Unit) {
			instance.setUnit(Unit);
		}

		public String getEan_Cat() {
			return instance.getEan_Cat();
		}

		public String getUnit() {
			return instance.getUnit();
		}

		public void setUnit_Iso(String Unit_Iso) {
			instance.setUnit_Iso(Unit_Iso);
		}

		public String getMain_Ean() {
			return instance.getMain_Ean();
		}

		public void setEan_Cat(String Ean_Cat) {
			instance.setEan_Cat(Ean_Cat);
		}

		public String getUnit_Iso() {
			return instance.getUnit_Iso();
		}

		public String getEan_Upc() {
			return instance.getEan_Upc();
		}
		
}
