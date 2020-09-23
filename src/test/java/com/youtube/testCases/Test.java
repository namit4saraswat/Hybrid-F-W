package com.youtube.testCases;

import java.io.IOException;

import com.youtube.utilities.ReadConfig;
import org.apache.log4j.Logger;

public class Test {

	public static void main(String[] args) throws IOException {
		Logger log = Logger.getLogger(Test.class);
		ReadConfig read = new ReadConfig();
		
		//testing readConfig
		/*
		 * Properties prop = new Properties(); FileInputStream ip = new
		 * FileInputStream("C:\\Users\\namit\\Documents\\Linked in learning\\Eclipse\\inetBanking\\Configuration\\config.properties"
		 * ); prop.load(ip);
		 * 
		 * 
		 * System.out.println(prop.getProperty("baseURL"));
		 */
		System.out.println(read.getbaseURL());
		
		
		// Testing logger as well here
		
		
		log.info("This is reading base URL info message");		
		log.debug("This is debug message");
		log.warn("This is warning message");
		
	}

}
