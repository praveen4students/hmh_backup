package hmh.sap.rfc.wrapper;

import hmh.sap.rfc.Bapiret2Type;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Bapiret2Type")
public class Bapiret2Type_Wrapper {

	private Bapiret2Type instance;
	
	public void setInstance(Bapiret2Type instance) {
		this.instance = instance;
	}

	public Bapiret2Type_Wrapper() {}
	
	public Bapiret2Type_Wrapper(Bapiret2Type instance) {
		this.instance = instance;
	}

	
	//
	//	delegate methods
	//

	public String getMessage() {
		return instance.getMessage();
	}

	public String getNumber() {
		return instance.getNumber();
	}

	public void setId(String Id) {
		instance.setId(Id);
	}

	public int getRow() {
		return instance.getRow();
	}

	public void setMessage_V2(String Message_V2) {
		instance.setMessage_V2(Message_V2);
	}

	public String getLog_Msg_No() {
		return instance.getLog_Msg_No();
	}

	public String getMessage_V2() {
		return instance.getMessage_V2();
	}

	public void setParameter(String Parameter) {
		instance.setParameter(Parameter);
	}

	public void setMessage_V3(String Message_V3) {
		instance.setMessage_V3(Message_V3);
	}

	public String getMessage_V4() {
		return instance.getMessage_V4();
	}

	public void setLog_Msg_No(String Log_Msg_No) {
		instance.setLog_Msg_No(Log_Msg_No);
	}

	public void setMessage(String Message) {
		instance.setMessage(Message);
	}

	public void setType(String Type) {
		instance.setType(Type);
	}

	public String getField() {
		return instance.getField();
	}

	public void setMessage_V1(String Message_V1) {
		instance.setMessage_V1(Message_V1);
	}

	public void setSystem(String System) {
		instance.setSystem(System);
	}

	public String getType() {
		return instance.getType();
	}

	public void setLog_No(String Log_No) {
		instance.setLog_No(Log_No);
	}

	public void setRow(int Row) {
		instance.setRow(Row);
	}

	public void setNumber(String Number) {
		instance.setNumber(Number);
	}

	public String getMessage_V1() {
		return instance.getMessage_V1();
	}

	public String getParameter() {
		return instance.getParameter();
	}

	public String getMessage_V3() {
		return instance.getMessage_V3();
	}

	public String getId() {
		return instance.getId();
	}

	public void setMessage_V4(String Message_V4) {
		instance.setMessage_V4(Message_V4);
	}

	public String getSystem() {
		return instance.getSystem();
	}

	public String getLog_No() {
		return instance.getLog_No();
	}

	public void setField(String Field) {
		instance.setField(Field);
	}

}
