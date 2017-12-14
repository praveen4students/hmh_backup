package com.hmh.util.hasher;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.hmh.util.audit.AuditServiceImpl;
import com.hmh.util.dao.UtilDAO;


public class HasherImpl implements Hasher,
							InitializingBean, DisposableBean {

	private static final Logger logger = Logger.getLogger(HasherImpl.class);

	//private static Hasher hasher;
	private UtilDAO utilDAO;
	
	public void setUtilDAO(UtilDAO utilDAO) {
		logger.debug("instantiate utilDAO");		
		this.utilDAO = utilDAO;
	}
	
/*	
	private Hasher() {
		init();
	}
		
	private Hasher(String xmlFile) {
		init(xmlFile);
	}
*/

/*	
	public static synchronized Hasher getInstance() {
		if ( hasher == null ) {
			hasher = new Hasher();
		} 
		return hasher;
	}
*/	

	public static class Key implements Comparable<Key>  
	{  
	    private String _key;  
	      
	    public Key(String string1, String string2, String string3, String string4)  
	    {  
	        _key = string1 + "|" + string2 + "|" + string3 + "|" + string4;  
	    }  
	      
	    public int compareTo(Key other)  
	    {  
	        return _key.compareTo(other._key);  
	    }  
	      
	    //@Override  
	    public boolean equals(Object other)  
	    {  
	        return (other != null) && (getClass() == other.getClass()) &&   
	            _key.equals(((Key)other)._key);  
	    }  
	      
	    //@Override  
	    public int hashCode()  
	    {  
	        return _key.hashCode();  
	    }  
	      
	    //@Override  
	    public String toString()  
	    {  
	        return _key;  
	    }
	}  
	
	static HashMap<Key, String> hashMap; //new HashMap<Key, String>();
	
	private void parseXmlFile(String fileName){
		//get the factory
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		Document dom = null;
		
		try {

			//Using factory get an instance of document builder
			DocumentBuilder db = dbf.newDocumentBuilder();

			//parse using builder to get DOM representation of the XML file
			File file = new File(fileName);
			dom = db.parse(file);

			//get the root element
			Element docElement = dom.getDocumentElement();

			//get a nodelist of elements
			NodeList nl = docElement.getElementsByTagName("Record");
			if(nl != null && nl.getLength() > 0) {
				for(int i = 0 ; i < nl.getLength();i++) {

					//get the employee element
					Element el = (Element)nl.item(i);

					String system1 = getTextValue(el,"SYSTEM1");
					String system1val = getTextValue(el,"SYSTEM1FIELD");
					String system2 = getTextValue(el,"SYSTEM2");
					String system2val = getTextValue(el,"SYSTEM2FIELD");
					String category = getTextValue(el,"CATEGORY");

					//add it to list
					hashMap.put(new Key(category, system1, system1val, system2), system2val);
				}
			}
			
		} catch(ParserConfigurationException pce) {
			pce.printStackTrace();
		} catch(SAXException se) {
			se.printStackTrace();
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}	
	
	private String getTextValue(Element element, String tagName) {
		String textVal = null;
		NodeList nl = element.getElementsByTagName(tagName);
		if(nl != null && nl.getLength() > 0) {
			Element el = (Element)nl.item(0);
			textVal = el.getFirstChild().getNodeValue();
		}

		return textVal;
	}

	private void readDb() {
		//ApplicationContext context = new ClassPathXmlApplicationContext("Spring-EAI_Log.xml");
		//UtilDAO dao = (UtilDAO) context.getBean("utilDAO");
		logger.debug("readDb method called");		
		
		hashMap = utilDAO.loadIntoCache();
		
		logger.debug("hashMap got " + hashMap.size() + " items");
	}
	
	/*private void readDb(String driver, String url, String uname, String pwd)
	{
	    try {
	    	Class.forName(driver).newInstance();
	    	Connection conn = DriverManager.getConnection(url, uname, pwd);

	    	String query = 
	    		"SELECT SYSTEM1, SYSTEM1FIELD, SYSTEM2, SYSTEM2FIELD, CATEGORY FROM FIELD_MAP_VIEW";
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			while (rs.next())
			{		  
				String system1 = rs.getString(1); //getTextValue(el,"SYSTEM1");
				String system1val = rs.getString(2); //getTextValue(el,"SYSTEM1FIELD");
				String system2 = rs.getString(3); //getTextValue(el,"SYSTEM2");
				String system2val = rs.getString(4); //getTextValue(el,"SYSTEM2FIELD");
				String category = rs.getString(5); //getTextValue(el,"CATEGORY");

				//add it to list
				hashMap.put(new Key(category, system1, system1val, system2), system2val);			  
				// and add reverse reference
				hashMap.put(new Key(category, system2, system2val, system1), system1val);			  
			}
	      
			conn.close();
	    }
	    catch(Exception ex) {
	    	ex.printStackTrace(System.err);
	    }
	}*/
	
	
	//
	// public interface
	//
	
	
	public void init(String xmlFile) {
		parseXmlFile(xmlFile);
	}

	public void init() {
		logger.debug("init method called");		
		if (hashMap == null) {
			hashMap = new HashMap<Key, String>();
			readDb();
		}
	}
	
	/* (non-Javadoc)
	 * @see com.hmh.util.hasher.Hasher#getValue(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public String getValue(String category, String system1, String system1val, String system2)
	{
		//System.out.println("cat:" + category);
		//System.out.println("sys1:" + system1);
		//System.out.println("sys1val:" + system1val);
		//System.out.println("sys2:" + system2);
		String system2val = hashMap.get(new Key(category, system1, system1val, system2));
		//System.out.println("sys2val:" + system2val);
		
		/*
		if ((system2val == null) && (system1 != null && system1val.length() == 0)) {
			system2val = system1val;
		}
		else if ((system2val == null) && (system1val != null)) {
			system2val = category + "_UNEXPECTED";
			
			logger.error("!!! UNEXPECTED VALUE for c[" + category + "] s1[" + system1 + "] v1[" + system1val + "] s2[" + system2 + "]");
		}
		*/
		
		return system2val;
	}
	
	

	@Override
	public void destroy() throws Exception {
		logger.debug("destroy " + this.getClass().getName());
		hashMap = null;
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		logger.debug("initialize " + this.getClass().getName());
		init();
	}

}
