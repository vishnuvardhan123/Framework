package tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import utilities.ReadConfiguration;

public class BaseClass {
	
	ReadConfiguration readconfig = new ReadConfiguration();
	
	public static WebDriver driver;
	
	public String baseurl = readconfig.getApplicationurl();
	
	public String username = readconfig.getusername();
	
	public String password = readconfig.getpassword();
	
	public String chromepath = readconfig.getchromepath();
	
	public String firefoxpath = readconfig.getfirefoxpath();
	
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {
		
		logger = Logger.getLogger("ebanking");
		PropertyConfigurator.configure("Log4j.properties");
		
		if(br.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", chromepath);
			
			driver = new ChromeDriver();
		}
		
		else if(br.equals("firefox")) {
			
			System.setProperty("webdriver.firefox.driver", firefoxpath);
			
		}
		
		driver.get(baseurl);
		driver.manage().window().maximize();
		
	}
	
	@AfterClass
	public void teardown() {
		
		driver.quit();
	}
	public void capturescreenshot(WebDriver driver , String tname) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File(System.getProperty("user.dir") +"/Screenshots/"+tname+".png");		
		
		FileUtils.copyFile(source, dest);
		
		System.out.println("Screenshot taken");
		
	}
	
	  public static String randomestring() {
	        String generatedString1 = RandomStringUtils.randomAlphabetic(5);
	        return (generatedString1);
	    }
	

}
