package com.hmh.util.dao;


import java.io.StringReader;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.UncategorizedSQLException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.AbstractLobCreatingPreparedStatementCallback;
import org.springframework.jdbc.support.lob.DefaultLobHandler;
import org.springframework.jdbc.support.lob.LobCreator;
import org.springframework.jdbc.support.lob.LobHandler;

import com.hmh.util.hasher.HasherImpl;

public class UtilDAOImpl implements UtilDAO,
								InitializingBean, DisposableBean 
{
	private static final Logger logger = Logger.getLogger(UtilDAOImpl.class);

	private JdbcTemplate jdbcTemplate;
	private LobHandler lobHandler = new DefaultLobHandler();  // reusable object
	private int maxRetryCount;
	private String severity;
	
	public void setDataSource(DataSource dataSource) {
		logger.info("setDataSource");
		this.jdbcTemplate = new JdbcTemplate(dataSource);
//		this.jdbcTemplate.getDataSource().getConnection().
	}
	
	
	public UtilDAOImpl() {
		init();
	}
	
	public void init() {
		logger.info("init");
/*
		try {
			java.sql.DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
*/
	}
	
	public void insertToEAI_LOG(final EAI_Log log)
	{
		logger.info(log.getMsg_Text() + " event-id " + log.getEvent_id());
		boolean isTxnSuccess = false;
		int failureCount = 0;
		
		// we do not insert a.load_acty_tmstp, as db trigger does it
		String query =  " INSERT INTO EAI_LOG " 
					   +"  ( trans_id, event_id, ebs_nm, source, severity, cmpt_nm, evnt_payload, " 
					   +"   err_stack_trace, evnt_acty_tmstp, err_family, err_type, msg_text, destination ) " 
					   +" VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?) "; 
		
		while(!isTxnSuccess) 
		{
			try 
			{
				long startTime = 0, endTime = 0;
				if (logger.isDebugEnabled()) 
				{
					startTime = System.currentTimeMillis();
					logger.debug("update query start");			
				}
	
				/*			
	 			jdbcTemplate.update(query, new Object[] {
						log.getTrans_id(), log.getEvent_id(),
						log.getEbs_Name(),log.getSource(),
						log.getSeverity(),log.getCmpnt_Name(),
						log.getEvnt_payLoad(), log.getErr_StackTrace(),
						log.getEvent_Actvty_TS(),log.getErr_Family(),
						log.getErr_Type(),log.getMsg_Text(),
						//log.getLoad_Actvty_TS(),
						log.getDestination()
				});
				 */		
				final String payload = log.getEvnt_payLoad() != null 
										? log.getEvnt_payLoad() 
										: "";
				
				final String stackTrace = log.getErr_StackTrace() != null 
										   ? log.getErr_StackTrace() 
										   : "";
				
				jdbcTemplate.execute(
					query,
					new AbstractLobCreatingPreparedStatementCallback(lobHandler) 
					{                         
						@Override
						protected void setValues(PreparedStatement ps, LobCreator lobCreator) 
					    throws SQLException, DataAccessException 
					    {
					    	ps.setString(1, log.getTrans_id());
					    	ps.setString(2, log.getEvent_id());
					    	ps.setString(3, log.getEbs_Name());
					    	ps.setString(4, log.getSource());
					    	ps.setString(5, getSeverity());				//ps.setString(5, log.getSeverity());
					    	ps.setString(6, log.getCmpnt_Name());
					    	/*
					    	 * setObject will insert any String object 
					    	 * which has more than 100000 characters 
					    	 * (i.e. 97 KB in size)
					    	 */
					    	ps.setObject(7, payload);					
					    	ps.setObject(8, stackTrace);
					    	ps.setTimestamp(9, log.getEvent_Actvty_TS());	
					    	ps.setString(10, log.getErr_Family());
					    	/*
					    	 * Since DB Column "err_type" can hold the string 
					    	 * value with 50 Characters, trim the string which 
					    	 * has more than 50 characters
					    	 */
					    	ps.setString(11, trimString(log.getErr_Type(), 50));	
					    	ps.setString(12, log.getMsg_Text());
					    	ps.setString(13, log.getDestination());
						}
					}
				);
				
				if (logger.isDebugEnabled()) 
				{
					endTime = System.currentTimeMillis();
					logger.debug("update query end. Time: " + (endTime - startTime) + " ms.");			
				}
				isTxnSuccess = true;
			
			} catch(DataAccessException de) {
				
				//logger.error("DataAccessException occured in inserting log into EAI_LOG table : \n \t" 
				//			  + de.getMessage(), de);
				
				if(failureCount < maxRetryCount) 
				{
					failureCount++;
					logger.debug("insertToEAI_LOG method called. retry " + failureCount);
					
					try{
						java.lang.Thread.sleep(500L); // Wait for 2 seconds
			        }catch(java.lang.Exception e){}
				} else {
					logger.error("DataAccessException in insertToEAI_LOG", de);
					break;
				}
			}catch(Exception ex) {
				logger.error("Exception occured in inserting log into EAI_LOG table : \n \t" + ex.getMessage(), ex);
				break;
			}//End of Try-Catch Block
		
		}//End of while
		
	}//End of method insertToEAI_LOG()

	
	public HashMap<HasherImpl.Key, String> loadIntoCache() {
		logger.debug("loadIntoCache method called");		

		String query = 
    		"SELECT SYSTEM1, SYSTEM1FIELD, SYSTEM2, SYSTEM2FIELD, CATEGORY FROM FIELD_MAP_VIEW";
		
		List<HashMap<HasherImpl.Key, String>> resultList = jdbcTemplate.query(query, new Object[]{},new RowMapper<HashMap<HasherImpl.Key, String>>() {
			
			public HashMap<HasherImpl.Key, String> mapRow(ResultSet rs, int arg1) throws SQLException {
				return new TranslationExtractor().extractData(rs);
			}
		});
		
//		Hasher hasher = Hasher.getInstance();
//		hasher.hashMap = resultList.get(0);
		return resultList.get(0);
	}

	@Override
	public void destroy() throws Exception {
		logger.info("destroy " + this.getClass().getName());	
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		logger.info("initialize " + this.getClass().getName());
	}

	@Override
	public String getAsyncRqstId() throws AsyncMethodException {
		boolean isTxnSuccess = false;
		int failureCount = 0;
		while(!isTxnSuccess) {
			try {
				logger.debug("getAsyncRqstId method called");
				String query = "SELECT EAI_ASYNC_CALL_ID.NEXTVAL FROM dual";
				//String query = "SELECT get_async_call_id FROM dual";
				

				//
				// unique constraint (IC_COMMON_STG.EAI_ASYNC_CALL_PK) violated !!!
				//
				Long rqstId;
				//synchronized(this) {
				rqstId = jdbcTemplate.queryForLong(query);
				//}
				
				/**
				 * TODO Save rqst Id and rqst in the DB
				 */
				/*
				 * query =
				 * "insert into EAI_ASYNC_CALL(requestId, REQUEST) values(?,?)";
				 * jdbcTemplate.update(query, new Object[]{rqstId, xmlContent});
				 */
				logger.debug("getAsyncRqstId method finished. rqstId = " + rqstId);

				isTxnSuccess = true;
				return rqstId.toString();
			} catch(DataAccessException de) {
				if(failureCount < maxRetryCount) {
					failureCount++;
					logger.debug("getAsyncRqstId method called. retry " + failureCount);
					try{java.lang.Thread.sleep(500L); // Wait for 2 seconds
			        }catch(java.lang.Exception e){}
				} else {
					logger.error("DataAccessException in getAsyncRqstId");
					//break;
					throw new AsyncMethodException(de.getMessage(), de);
				}
			} catch (Exception e) {
				logger.error("Error in getAsyncRqstId", e);
				//e.printStackTrace();
				throw new AsyncMethodException(e.getMessage(), e);				
				//break;
			}
		}
		return null;
	}

	@Override
	public void saveAsyncResponse(String rqstId, String rqstXml, String responseXml) {

		logger.debug("saveAsyncResponse method called");
		logger.info("Request Xml :: \n" + rqstXml);
		logger.info("Response Xml :: \n" + responseXml);
		logger.info("Request ID ::::::::: " + rqstId);

		boolean isTxnSuccess = false;
		int failureCount = 0;
		while(!isTxnSuccess) {
			try {
				/**
				 * Save rqst Id and rqst in the DB
				 */
				Long requestId = new Long(rqstId);				
				String query = "insert into EAI_ASYNC_CALL(requestId, REQUEST, RESPONSE) values(?,?,?)";
				jdbcTemplate.update(query, new Object[]{requestId, rqstXml, responseXml});
				//String query = "{call SAVE_ASYNC_CALL(?,?,?,?)}";
				//jdbcTemplate.update(query, new Object[]{requestId, rqstXml, responseXml, null});
				isTxnSuccess = true;

			} catch(DataAccessException de) {
				
				logger.error(de);
				
				if(failureCount < maxRetryCount) {
					failureCount++;
					logger.debug("saveAsyncResponse method called. retry " + failureCount);
					try{java.lang.Thread.sleep(500L); // Wait for 2 seconds
			        }catch(java.lang.Exception e){}
				} else {
					logger.error("DataAccessException in saveAsyncResponse", de);
					break;
				}
				
			} catch(Exception e) {
				logger.error("Error in saveAsyncResponse", e);
				break;
				//e.printStackTrace();
			}			
		}
	}

	@Override
	public boolean asyncPoll(String rqstId) {
		boolean isTxnSuccess = false;
		int failureCount = 0;
		while(!isTxnSuccess) {
		try {
			logger.debug("asyncPoll method called");
			String query = "SELECT requestId FROM EAI_ASYNC_CALL where requestId = ?";
			String tempId = jdbcTemplate.queryForObject(query, new Object[]{ rqstId }, String.class);
			if( tempId != null && tempId.trim().length() > 0 ) {
				return true;
			} 
			isTxnSuccess = true;
		} catch(EmptyResultDataAccessException ex) {
			break;			
		} catch(DataAccessException de) {
			if(failureCount < maxRetryCount) {
				failureCount++;
				logger.debug("asyncPoll method called. retry " + failureCount);								
				try{java.lang.Thread.sleep(500L); // Wait for 2 seconds
		        }catch(java.lang.Exception e){}
			} else {
				logger.error("DataAccessException in asyncPoll");
				break;
			}
		} catch(Exception e) {
			logger.error("Error in asyncPoll", e);
			break;
			//e.printStackTrace();
		}
		}
		return false;
	}

	@Override
	public String getAsyncResponse(String rqstId) throws AsyncMethodException {
		
		boolean isTxnSuccess = false;
		int failureCount = 0;
		while (!isTxnSuccess) {
			try {
				logger.debug("getAsyncResponse method called");
				String query = "SELECT RESPONSE, ERROR FROM EAI_ASYNC_CALL where requestId = ?";
				Map<String, Object> asyncResponseMap = jdbcTemplate
						.queryForMap(query, new Object[] { rqstId });
				isTxnSuccess = true;
				String response = (String) asyncResponseMap.get("RESPONSE");
				String error = (String) asyncResponseMap.get("ERROR");
				if (response != null && response.trim().length() > 0) {
					return response;
				} else {
					throw new AsyncMethodException(error);
				}
			} catch(EmptyResultDataAccessException ex) {
				throw new AsyncMethodException(ex.getMessage(), ex);
			} catch (DataAccessException de) {
				if (failureCount < maxRetryCount) {
					failureCount++;
					try{java.lang.Thread.sleep(500L); // Wait for 2 seconds
			        }catch(java.lang.Exception e){}
				} else {
					logger.error("DataAccessException in getAsyncResponse");
					throw new AsyncMethodException(de.getMessage(), de);
				}
			} catch (AsyncMethodException ex) {
				throw ex;
			} catch (Exception e) {
				logger.error("Error in getAsyncResponse", e);
				// e.printStackTrace();
				throw new AsyncMethodException(e.getMessage(), e);
				// return null;
			}
		}
			return null;
	}

	@Override
	public void saveAsyncError(String rqstId, String rqstXml, String errResponseXml) {

		logger.debug("saveAsyncError method called");
		logger.debug("Request Xml :: \n" + rqstXml);
		logger.debug("Error Xml :: \n" + errResponseXml);
		logger.debug("Request ID ::::::::: " + rqstId);

		boolean isTxnSuccess = false;
		int failureCount = 0;		
		while(!isTxnSuccess) {
		try {
			/**
			 * TODO
			 * Save rqst Id and rqst in the DB
			 */
			Long requestId = new Long(rqstId);
			String query = "insert into EAI_ASYNC_CALL(requestId, REQUEST, ERROR) values(?,?,?)";
			jdbcTemplate.update(query, new Object[]{requestId, rqstXml, errResponseXml});
			//String query = "{call SAVE_ASYNC_CALL(?,?,?,?)}";			
			//jdbcTemplate.update(query, new Object[]{requestId, rqstXml, null, errResponseXml});
			isTxnSuccess = true;

		} catch (DataAccessException de) {
			
			logger.error(de);
			
			if (failureCount < maxRetryCount) {
				failureCount++;
				logger.debug("saveAsyncError method called. retry " + failureCount);				
				try{java.lang.Thread.sleep(500L); // Wait for 2 seconds
		        }catch(java.lang.Exception e){}
			} else {
				logger.error("DataAccessException in saveAsyncError", de);
				break;
			}

		} catch(Exception e) {
			logger.error("Error in saveAsyncError", e);
			break;
			//e.printStackTrace();
		} 
		}
	}

	/**
	 * @return the maxRetryCount
	 */
	public int getMaxRetryCount() {
		return maxRetryCount;
	}
	/**
	 * @param maxRetryCount the maxRetryCount to set
	 */
	public void setMaxRetryCount(int maxRetryCount) {
		this.maxRetryCount = maxRetryCount;
	}


	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}

	/**
	 * This method trims any given string to the specified length.
	 *  
	 * @param str     - String to be Trimmed
	 * @param length  - Max number of characters that string can have
	 * @return String - Trimmed string
	 */
	private String trimString(String str, int length)
	{
		if(str!=null && str.length() > length)
		{
			return str.trim().substring(0, (length-1));
		}else if(str!=null){
			return str.trim();
		}else{
			return null;
		}
	}//End of trimString()

}//End of Class
