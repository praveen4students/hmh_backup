package hmh.sap.rfc.wrapper;

import hmh.sap.rfc.Zbdcmsgcoll_RfcType;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Zbdcmsgcoll_RfcType")
public class Zbdcmsgcoll_RfcType_Wrapper {

		private Zbdcmsgcoll_RfcType instance;
		
		public void setInstance(Zbdcmsgcoll_RfcType instance) {
			this.instance = instance;
		}
		
		public Zbdcmsgcoll_RfcType_Wrapper() {}
		
		public Zbdcmsgcoll_RfcType_Wrapper(Zbdcmsgcoll_RfcType instance) {
			this.instance = instance;
		}

		
		//
		//	delegate methods
		//

		public void setDynumb(String Dynumb) {
			instance.setDynumb(Dynumb);
		}

		public String getMsgnr() {
			return instance.getMsgnr();
		}

		public void setMsgv2(String Msgv2) {
			instance.setMsgv2(Msgv2);
		}

		public String getMsgv1() {
			return instance.getMsgv1();
		}

		public String getMsgtyp() {
			return instance.getMsgtyp();
		}

		public void setMsgspra(String Msgspra) {
			instance.setMsgspra(Msgspra);
		}

		public String getTcode() {
			return instance.getTcode();
		}

		public void setMsgtyp(String Msgtyp) {
			instance.setMsgtyp(Msgtyp);
		}

		public void setMsgid(String Msgid) {
			instance.setMsgid(Msgid);
		}

		public String getMsgid() {
			return instance.getMsgid();
		}

		public void setMsgv1(String Msgv1) {
			instance.setMsgv1(Msgv1);
		}

		public void setMsgnr(String Msgnr) {
			instance.setMsgnr(Msgnr);
		}

		public String getDynumb() {
			return instance.getDynumb();
		}

		public String getMsgspra() {
			return instance.getMsgspra();
		}

		public void setDyname(String Dyname) {
			instance.setDyname(Dyname);
		}

		public void setTcode(String Tcode) {
			instance.setTcode(Tcode);
		}

		public String getDyname() {
			return instance.getDyname();
		}

		public String getMsgv2() {
			return instance.getMsgv2();
		}
		
}
