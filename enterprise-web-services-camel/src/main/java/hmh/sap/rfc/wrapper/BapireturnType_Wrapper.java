package hmh.sap.rfc.wrapper;

import hmh.sap.rfc.BapireturnType;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "BapireturnType")
public class BapireturnType_Wrapper {

		private BapireturnType instance;
		
		public void setInstance(BapireturnType instance) {
			this.instance = instance;
		}

		public BapireturnType_Wrapper() {}
		
		public BapireturnType_Wrapper(BapireturnType instance) {
			this.instance = instance;
		}

		
		//
		//	delegate methods
		//

		public String getCode() {
			return instance.getCode();
		}

		public String getMessage() {
			return instance.getMessage();
		}

		public void setCode(String Code) {
			instance.setCode(Code);
		}

		public void setMessage_V2(String Message_V2) {
			instance.setMessage_V2(Message_V2);
		}

		public String getType() {
			return instance.getType();
		}

		public String getLog_Msg_No() {
			return instance.getLog_Msg_No();
		}

		public void setLog_No(String Log_No) {
			instance.setLog_No(Log_No);
		}

		public String getMessage_V2() {
			return instance.getMessage_V2();
		}

		public String getMessage_V1() {
			return instance.getMessage_V1();
		}

		public void setMessage_V3(String Message_V3) {
			instance.setMessage_V3(Message_V3);
		}

		public String getMessage_V3() {
			return instance.getMessage_V3();
		}

		public void setMessage_V4(String Message_V4) {
			instance.setMessage_V4(Message_V4);
		}

		public String getLog_No() {
			return instance.getLog_No();
		}

		public String getMessage_V4() {
			return instance.getMessage_V4();
		}

		public void setMessage(String Message) {
			instance.setMessage(Message);
		}

		public void setLog_Msg_No(String Log_Msg_No) {
			instance.setLog_Msg_No(Log_Msg_No);
		}

		public void setType(String Type) {
			instance.setType(Type);
		}

		public void setMessage_V1(String Message_V1) {
			instance.setMessage_V1(Message_V1);
		}
		
}
