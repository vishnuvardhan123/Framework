package com.noncommercial.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfiguration {
	
	Properties prop;
	
	public ReadConfiguration() 
	{
		File src = new File("./Configuration/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
		
	}
	public String geturl() {
		
		String url = prop.getProperty("url");
		
		return url;
		
	}
	public  String getusername() {
			
			String username = prop.getProperty("username");
			return username;
		}
	
	public  String getpassword() {
		
		String password = prop.getProperty("password");
		return password;
	}
	
	public  String getchromepath() {
		
		String chromepath = prop.getProperty("chromepath");
		return chromepath;
	}
	
	public  String getfirefoxpath() {
			
			String firefoxpath = prop.getProperty("firefoxpath");
			return firefoxpath;
		}
	
	public  String getiepath() {
		
		String iepath = prop.getProperty("iepath");
		return iepath;
	}

}
