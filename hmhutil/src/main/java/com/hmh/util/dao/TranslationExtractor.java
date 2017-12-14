package com.hmh.util.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import org.apache.log4j.Logger;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.hmh.util.hasher.HasherImpl;

public class TranslationExtractor implements ResultSetExtractor<HashMap<HasherImpl.Key, String>> {

	private static final Logger logger = Logger.getLogger(HasherImpl.class);

	public HashMap<HasherImpl.Key, String> extractData(ResultSet rs) throws SQLException,
			DataAccessException {
		//Hasher hasher = Hasher.getInstance();
		HashMap<HasherImpl.Key, String> cacheMap = new HashMap<HasherImpl.Key, String>();
		//logger.debug("category\tsystem1\tvalue1\tsystem2\tvalue2");
		while(rs.next()) {
			HasherImpl.Key key = new HasherImpl.Key(rs.getString(5), rs.getString(1), rs.getString(2), rs.getString(3));
			cacheMap.put(key, rs.getString(4));
			//logger.debug(rs.getString(5) + " " + rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
		}
		return cacheMap;
	}

}
