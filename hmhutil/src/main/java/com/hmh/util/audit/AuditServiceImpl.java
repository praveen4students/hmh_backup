package com.hmh.util.audit;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.hmh.util.dao.EAI_Log;
import com.hmh.util.dao.UtilDAO;

public class AuditServiceImpl implements AuditService,
									InitializingBean, DisposableBean 
{	
	private static final Logger logger = Logger.getLogger(AuditServiceImpl.class);
	
	//private static AuditService log;
	
	private UtilDAO utilDAO;
	
	public void setUtilDAO(UtilDAO utilDAO) {
		logger.debug("instantiate utilDAO");		
		this.utilDAO = utilDAO;
	}
/*
	public static synchronized AuditService getInstance() {
		if ( log == null ) {
			log = new AuditService();
		} 
		return log;
	}
*/	

	/* (non-Javadoc)
	 * @see com.hmh.util.audit.AuditService#insertToEAI_LOG(com.hmh.util.dao.EAI_Log)
	 */
	@Override
	public void insertToEAI_LOG(EAI_Log log) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("Spring-EAI_Log.xml");
									//new ClassPathResource("/META-INF/spring/server.xml")
		//UtilDAO utilDAO = (UtilDAO) context.getBean("utilDAO");
		utilDAO.insertToEAI_LOG(log);
	}

	@Override
	public void destroy() throws Exception {
		logger.debug("destroy " + this.getClass().getName());	
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		logger.debug("initialize " + this.getClass().getName());
	}
	
}
