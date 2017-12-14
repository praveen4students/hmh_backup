package com.hmh.util.async;

import com.hmh.util.dao.AsyncMethodException;


public interface AsyncService {
	public boolean asyncPoll(String rqstId);
	public String getAsyncResponse(String rqstId) throws AsyncMethodException;
	
	//
	public String makeNewAsyncCallId() throws AsyncMethodException;
	public void saveAsyncResponse(String callId, String requestXml, String responseXml);
	public void saveAsyncError(String callId, String requestXml, String errorXml);
	
}