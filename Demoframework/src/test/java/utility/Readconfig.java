package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {
	
	Properties prop;
	
	public Readconfig() {
		
		File fi = new File("./Configuration/config.properties")	;	
		
		try {
			
			FileInputStream fis = new FileInputStream(fi);
			prop = new Properties();
			prop.load(fis);
			
		}
		
		catch(Exception e) {
			
			System.out.println("The exception message is  " + e);
			
		}
		
		
	}
	
	public String getapplicationurl() {
		
		String url = prop.getProperty("baseUrl");
		
		return url;
		
	}
	
	public String getusername() {
		
		String uname = prop.getProperty("username");
		
		return uname;
		
	}
	
	public String getpassword() {
		
		String pwd = prop.getProperty("admin");
		
		return pwd;
		
	}
	
	public String getchromepath() {
		
		String chromepath = prop.getProperty("chromepath");
		
		return chromepath;
		
	}
public String getfirefoxpath() {
		
		String firefoxpath = prop.getProperty("chromepath");
		
		return firefoxpath;
		
	}
}
