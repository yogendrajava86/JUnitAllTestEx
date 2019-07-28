package com.app.util;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFile {
	private static Properties propsd=null;
	private static InputStream is = null;
	private static String fileName = "D:\\JavaApp\\SpringBootWorkStation\\JUnitAllTestEx\\src\\main\\resources\\app.properties";
	static {
		propsd = new Properties();		    
			try {
				is = new FileInputStream(fileName);
				propsd.load(is);
			} catch (Exception e) {
				e.printStackTrace();
			} 			
	}
	
	public static Properties getProperties() {
		return propsd;
	}
}
