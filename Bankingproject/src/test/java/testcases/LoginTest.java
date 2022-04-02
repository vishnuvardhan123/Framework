package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.Loginpage;

public class LoginTest extends BaseClass {
	@Test
	public void login() throws IOException {
		
		Loginpage lp = new Loginpage(driver);
		
		logger.info("******* Login Test Started*******");
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		if(driver.getTitle().equalsIgnoreCase("GTPL Bank Manager HomePage")) {
			
			logger.info("****** Login Test Passed *******");
		}
		else {
			
			capturescreenshot(driver, "LoginTest");
			logger.info("****** Login Test Failed *******");
		}
		
		
	}

}
