package com.hmh.util.audit;

import com.hmh.util.dao.EAI_Log;

public interface AuditService {

	public void insertToEAI_LOG(EAI_Log log);

}