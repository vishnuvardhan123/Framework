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
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import utility.Readconfig;

public class BaseClass {
	
	public static WebDriver driver;
	
	Readconfig readconfig = new Readconfig();
	
	String  chromepath = readconfig.getapplicationurl();
	String username = readconfig.getusername();
	String password = readconfig.getpassword();
	
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
		
		else if(br.equals("firefox")){
			
			System.setProperty("webdriver.firefox.driver", readconfig.getfirefoxpath());
			
		}
		
		driver.get(readconfig.getapplicationurl());
		
		driver.manage().window().maximize();
	}
	
	
	public void capturescreenshot(WebDriver driver, String tname) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./Screenshots" +tname+".png");
		
		FileUtils.copyFile(source, dest);
		
	}
	
	public static String randomestring() {
		String generatedString1 = RandomStringUtils.randomAlphabetic(5);
		return (generatedString1);
	}

}
