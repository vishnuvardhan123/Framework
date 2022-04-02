package com.noncommercial.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test {

	@Test
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Testlaptop4\\eclipse-workspace\\Noncommercial\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/V1/index.php");
		
	}
}
