package hmh.sap.rfc.wrapper;

import javax.xml.bind.annotation.XmlRootElement;

import hmh.sap.rfc.Bapi_Mpgd_GaType;


@XmlRootElement(name = "Bapi_Mpgd_GaType")
public class Bapi_Mpgd_GaType_Wrapper {

	private Bapi_Mpgd_GaType instance;
	
	public void setInstance(Bapi_Mpgd_GaType instance) {
		this.instance = instance;
	}

	public Bapi_Mpgd_GaType_Wrapper() {}
	
	public Bapi_Mpgd_GaType_Wrapper(Bapi_Mpgd_GaType instance) {
		this.instance = instance;
	}

	
	//
	//	delegate methods
	//

	public String getPlng_Matl_External() {
		return instance.getPlng_Matl_External();
	}

	public void setPlng_Matl_Version(String Plng_Matl_Version) {
		instance.setPlng_Matl_Version(Plng_Matl_Version);
	}

	public String getPlant() {
		return instance.getPlant();
	}

	public void setPlng_Matl_External(String Plng_Matl_External) {
		instance.setPlng_Matl_External(Plng_Matl_External);
	}

	public String getPlng_Matl() {
		return instance.getPlng_Matl();
	}

	public void setPlant(String Plant) {
		instance.setPlant(Plant);
	}

	public String getPlng_Matl_Guid() {
		return instance.getPlng_Matl_Guid();
	}

	public void setPlng_Matl_Guid(String Plng_Matl_Guid) {
		instance.setPlng_Matl_Guid(Plng_Matl_Guid);
	}

	public void setConvfactor(String Convfactor) {
		instance.setConvfactor(Convfactor);
	}

	public String getPlng_Plant() {
		return instance.getPlng_Plant();
	}

	public void setPlng_Plant(String Plng_Plant) {
		instance.setPlng_Plant(Plng_Plant);
	}

	public String getConvfactor() {
		return instance.getConvfactor();
	}

	public String getPlng_Matl_Version() {
		return instance.getPlng_Matl_Version();
	}

	public void setPlng_Matl(String Plng_Matl) {
		instance.setPlng_Matl(Plng_Matl);
	}
	
}
