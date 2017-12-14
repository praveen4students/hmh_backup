package com.hmh.util.dao;

import java.util.HashMap;

import com.hmh.util.hasher.HasherImpl;


public interface UtilDAO 
{
	public void insertToEAI_LOG(EAI_Log log);
	public HashMap<HasherImpl.Key, String> loadIntoCache();
	public String getAsyncRqstId() throws AsyncMethodException;
	public void saveAsyncResponse(String rqstId, String rqstXml, String responseXml);
	public void saveAsyncError(String rqstId, String rqstXml, String errResponseXml);
	public boolean asyncPoll(String rqstId);
	public String getAsyncResponse(String rqstId) throws AsyncMethodException;
}




