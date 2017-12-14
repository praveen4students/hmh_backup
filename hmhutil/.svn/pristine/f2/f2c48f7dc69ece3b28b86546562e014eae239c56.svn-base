package com.hmh.util.async;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.hmh.util.dao.AsyncMethodException;
import com.hmh.util.dao.UtilDAO;

public class AsyncServiceImpl implements AsyncService,
									InitializingBean, DisposableBean 
{	
	private static final Logger logger = Logger.getLogger(AsyncServiceImpl.class);
	
	//private static AuditService log;
	
	private UtilDAO utilDAO;
	
	public void setUtilDAO(UtilDAO utilDAO) {
		logger.debug("instantiate utilDAO");		
		this.utilDAO = utilDAO;
	}

	@Override
	public void destroy() throws Exception {
		logger.debug("destroy " + this.getClass().getName());	
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		logger.debug("initialize " + this.getClass().getName());
	}

	@Override
	public boolean asyncPoll(String rqstId) {
		// TODO Auto-generated method stub
		return utilDAO.asyncPoll(rqstId);
	}

	@Override
	public String getAsyncResponse(String rqstId) throws AsyncMethodException {
		// TODO Auto-generated method stub
		logger.info("RQST ID ==================== " + rqstId);
		return utilDAO.getAsyncResponse(rqstId);
	}

	
	@Override
	public String makeNewAsyncCallId() throws AsyncMethodException {
		// TODO Auto-generated method stub
		return utilDAO.getAsyncRqstId();
	}

	@Override
	public void saveAsyncResponse(String callId, String requestXml, String responseXml) {
		// TODO Auto-generated method stub
		utilDAO.saveAsyncResponse(callId, requestXml, responseXml);
	}

	@Override
	public void saveAsyncError(String callId, String requestXml, String errorXml) {
		// TODO Auto-generated method stub
		utilDAO.saveAsyncError(callId, requestXml, errorXml);
	}
	
}
