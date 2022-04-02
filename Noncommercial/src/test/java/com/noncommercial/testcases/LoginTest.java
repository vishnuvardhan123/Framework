package com.noncommercial.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.noncommericial.pageobjects.Login_page;
public class LoginTest extends BaseClass {
	
	@Test
	public void login() throws IOException {
		
		Login_page lp = new Login_page(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		if(driver.getTitle().equals("GTPL Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
	
			logger.info("Login test passed");
			driver.quit();
		}
		else
		{
			captureScreen(driver,"loginTest");
		
			
			logger.info("Login test failed");
		}
		
	}
	

}
