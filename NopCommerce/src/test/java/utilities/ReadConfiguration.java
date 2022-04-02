package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfiguration {
	
	Properties pro;
	
	public ReadConfiguration() {
		
		File fi = new File("./Configuration/config.properties");
		
		try {
			
			FileInputStream fis = new FileInputStream(fi);
			pro = new Properties();
			pro.load(fis);
			
		}
		catch(Exception e) {
			
			System.out.println("The exception message is " + e);
		}
		
	}
	
	public  String getApplicationurl() {
		
		String url = pro.getProperty("baseURL");
		return url;
		
	}
	
	public String getusername() {
		
		String username = pro.getProperty("username");
		return username;
	}
	
	public String getpassword() {
		
		String password = pro.getProperty("password");
		return password;
	}
	public String getchromepath() {
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}
	
	public String getfirefoxpath() {
		
		String firefoxpath = pro.getProperty("firefoxpath");
		return firefoxpath;
	}

}
