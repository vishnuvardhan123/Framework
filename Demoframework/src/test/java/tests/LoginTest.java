package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.Loginpage;

public class LoginTest extends BaseClass {
	
	Loginpage lp;
	
	@Test
	public void logintest() throws IOException {
		
		logger.info("******Login Test Started*******");
		
		lp = new Loginpage(driver);
		lp.username(username);
		lp.password(password);
		lp.login();
		logger.info("******Login Test Passed*******");
		
		if(driver.getTitle().contentEquals("Dashboard / nopCommerce administration")) {
			
			logger.info("******Login Test Passed*******");
			
		}
		
		else {
			
			capturescreenshot(driver,"LoginTest");
			logger.info("******Login Test Failed*******");
		}
	}

}
