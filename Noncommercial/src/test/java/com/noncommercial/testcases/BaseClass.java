package com.noncommercial.testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.noncommercial.utilities.ReadConfiguration;

public class BaseClass {
	
	ReadConfiguration readconfig=new ReadConfiguration();
	
	public String baseURL=readconfig.geturl();
	public String username=readconfig.getusername();
	public String password=readconfig.getpassword();
	public static WebDriver driver;
	
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {
		
		if(br.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",readconfig.getchromepath());
			
			ChromeOptions options = new ChromeOptions();
			options.setAcceptInsecureCerts(true);
			options.setCapability("browserVersion", "99.0.4844.84");
					
			driver=new ChromeDriver(options);
			
		}
		
		if(br.equals("firefox")) {
			
			System.setProperty("webdriver.chrome.driver", readconfig.getfirefoxpath());
			
			driver = new FirefoxDriver();
			
		}
		
			if(br.equals("ie")) {
			
			System.setProperty("webdriver.chrome.driver", readconfig.getiepath());
			
			driver = new InternetExplorerDriver();
			
		}
			driver.get(baseURL);
	}
	
	@AfterClass
	public void teardown() {
		
		driver.quit();
		
	}
	public  String randomstring() {
		
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return(generatedstring);
		
	}
	
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	

}
