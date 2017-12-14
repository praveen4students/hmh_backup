package com.hmh.util.dao;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Timestamp;
import java.util.Date;

public class EAI_Log 
{
	// msg_text points
	public static final String LOG_ENTER = "LogEnter";
	public static final String LOG_EXIT = "LogExit";
	public static final String LOG_REQUEST = "LogRequest";
	public static final String LOG_RESPONSE = "LogResponse";
	public static final String LOG_EXCEPTION = "LogError";
	public static final String LOG_FILTER = "LogFilter";
	public static final String LOG_DUPLICATE = "LogDuplicate";

	// systems
	public static final String SYS_WebService = "WebService";
	public static final String SYS_SAP = "SAP";
	public static final String SYS_SFDC = "SFDC";
	
	// exceptions family
	public static final String EXEPTION_BUSINESS = "B";
	public static final String EXEPTION_SYSTEM = "S";

	// for id generator
	private static int staticCounter=0;
	private static final int nBits=4;

	private static String ipAddress;
	static {
		try {
			ipAddress = InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(System.err);
		}
	}
	
	private String trans_id;
	private String event_id;
	private String ebs_Name;
	private String source;
	private String severity;
	private String cmpnt_Name;
	private String evnt_payLoad;
	private String err_StackTrace;
	private Timestamp event_Actvty_TS;
	private String err_Family;
	private String err_Type;
	private String msg_Text;
	private Date load_Actvty_TS;
	private String destination; 

	
	public String getTrans_id() {
		return trans_id;
	}

	public void setTrans_id(String trans_id) {
		this.trans_id = trans_id;
	}

	public String getEvent_id() {
		return event_id;
	}

	public void setEvent_id(String event_id) {
		this.event_id = event_id;
	}

	public String getEbs_Name() {
		return ebs_Name;
	}

	public void setEbs_Name(String ebs_Name) {
		this.ebs_Name = ebs_Name;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getCmpnt_Name() {
		return cmpnt_Name;
	}

	public void setCmpnt_Name(String cmpnt_Name) {
		this.cmpnt_Name = cmpnt_Name;
	}

	public String getEvnt_payLoad() {
		return evnt_payLoad;
	}

	public void setEvnt_payLoad(String evnt_payLoad) {
		this.evnt_payLoad = evnt_payLoad;
	}

	public String getErr_StackTrace() {
		return err_StackTrace;
	}

	public void setErr_StackTrace(String err_StackTrace) {
		this.err_StackTrace = err_StackTrace;
	}

	public Timestamp getEvent_Actvty_TS() {
		return event_Actvty_TS;
	}

	public void setEvent_Actvty_TS(Timestamp event_Actvty_TS) {
		this.event_Actvty_TS = event_Actvty_TS;
	}

	public String getErr_Family() {
		return err_Family;
	}

	public void setErr_Family(String err_Family) {
		this.err_Family = err_Family;
	}

	public String getErr_Type() {
		return err_Type;
	}

	public void setErr_Type(String err_Type) {
		this.err_Type = err_Type;
	}

	public String getMsg_Text() {
		return msg_Text;
	}

	public void setMsg_Text(String msg_Text) {
		this.msg_Text = msg_Text;
	}

	public Date getLoad_Actvty_TS() {
		return load_Actvty_TS;
	}

	public void setLoad_Actvty_TS(Date load_Actvty_TS) {
		this.load_Actvty_TS = load_Actvty_TS;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	protected EAI_Log(String transId, String event_id, String ebs_Name, String source, String severity, String cmpnt_Name, String evnt_payLoad, String err_StackTrace, Timestamp event_Actvty_TS,
			String err_Family, String err_Type, String msg_Text, Date load_Actvty_TS, String destination) 
	{
		this.trans_id = transId;
		this.event_id = event_id;
		this.ebs_Name = ebs_Name;
		this.source = source;
		this.severity = severity;
		this.cmpnt_Name = cmpnt_Name;
		this.evnt_payLoad = evnt_payLoad;
		this.err_StackTrace = err_StackTrace;
		this.event_Actvty_TS = event_Actvty_TS;
		this.err_Family = err_Family;
		this.err_Type = err_Type;
		this.msg_Text = msg_Text;
		this.load_Actvty_TS = load_Actvty_TS;
		this.destination = destination;
	}
	
	public static String makeEventId() {
		long id = ((System.currentTimeMillis()) << nBits) | (staticCounter++ & 2^nBits-1);
		long tid = Thread.currentThread().getId();
		return id + "." + tid + "." + ipAddress;
	}
	
	
	public static EAI_Log enter(String transID, String ebs_Name, String source, String dest) {
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		//EAI_Log log = new EAI_Log(transID, makeEventId(), ebs_Name, source, "trail", null, null, null, ts,
		EAI_Log log = new EAI_Log(transID, makeEventId(), ebs_Name, source, "camel", null, null, null, ts,
				null, null, LOG_ENTER, null, dest);
		return log;
	}

	public void toRequest() {
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		setMsg_Text(LOG_REQUEST);
		setEvent_Actvty_TS(ts);
	}
	public static EAI_Log toRequest(EAI_Log log) {
		log.toRequest();
		return log;		
	}
	
	public void toResponse() {
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		setMsg_Text(LOG_RESPONSE);
		setEvent_Actvty_TS(ts);
	}	
	public static EAI_Log toResponse(EAI_Log log) {
		log.toResponse();
		return log;		
	}

	//public void toException(Object body, String errorType, String errorFamily, String stackTrace) {
	//	toException(convertBodyToString(body), errorType, errorFamily, stackTrace);
	//}
	
	public void toException(String payload, String errorType, String errorFamily, String stackTrace) {
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		setMsg_Text(LOG_EXCEPTION);
		setEvent_Actvty_TS(ts);
		setEvnt_payLoad(payload);
		setErr_Type(errorType);
		setErr_Family(errorFamily);
		setErr_StackTrace(stackTrace);
	}	
	public static EAI_Log toException(EAI_Log log, String payload, String errorType, String errorFamily, String stackTrace) {
		log.toException(payload, errorType, errorFamily, stackTrace);
		return log;		
	}

	public void toExit() {
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		setMsg_Text(LOG_EXIT);
		setEvent_Actvty_TS(ts);
		setEvnt_payLoad(null);
		setErr_Type(null);
		setErr_Family(null);
		setErr_StackTrace(null);
	}
	public static EAI_Log toExit(EAI_Log log) {
		log.toExit();
		return log;
	}
	
	public EAI_Log clone() {
		EAI_Log log = new EAI_Log(this.trans_id, this.event_id, this.ebs_Name, this.source, this.severity, this.cmpnt_Name, this.evnt_payLoad, this.err_StackTrace, this.event_Actvty_TS, 
				this.err_Family, this.err_Type, this.msg_Text, this.load_Actvty_TS, this.destination);
		return log;
	}
	
	public Object[] makeDataArray() {
		return new Object[] {
				getTrans_id(), getEvent_id(),
				getEbs_Name(), getSource(),
				getSeverity(), getCmpnt_Name(),
				getEvnt_payLoad(), getErr_StackTrace(),
				getEvent_Actvty_TS(), getErr_Family(),
				getErr_Type(), getMsg_Text(),
				getLoad_Actvty_TS(), getDestination()
		};
	}
		
	@Override
	public String toString() {
		//TODO
		return null;
	}
	
	
}
