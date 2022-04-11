package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pages.AddCustomerPage;
import pages.Loginpage;

public class AddCustomerTest extends BaseClass {
	
	Loginpage lp; AddCustomerPage ac; 
	
	@Test
	
	public void addcustomer() throws InterruptedException {
		
		lp = new Loginpage(driver);
		
		logger.info("******Login Test Started*******");
		
		lp.username(username);
		lp.password(password);
		lp.login();
		
		ac = new AddCustomerPage(driver);
		logger.info("******Providing Customer Details*******");
		
		ac.clickOnCustomersMenu();
		ac.clickOnCustomersMenuItem();
		ac.clickOnAddnew();
		
		String title = driver.getTitle();
		
		  Assert.assertEquals("Add a new customer / nopCommerce administration", title);
		  String email = randomestring() + "@gmail.com";
			
			ac.setEmail(email);
			ac.setPassword("Welcome");
			ac.setFirstName("Kiran");
			ac.setLastName("Kumar");
			ac.setGender("Male");
			ac.setDob("7/05/1985");
			ac.setCompanyName("shopify");
			ac.setCustomerRoles("Administrators");
			 ac.clicksave();
			Assert.assertTrue(driver.findElement(By.tagName("body")).getText()
		                .contains("The new customer has been added successfully"));
			driver.quit();
			
			logger.info("******AddCustomerTest Passed*******");
		
	}
	
	

}
