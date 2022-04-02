package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AddCustomerpage;
import pages.Loginpage;

public class AddCustomerTest extends BaseClass {
	@Test
	public void login() throws IOException, InterruptedException {
		
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
		
		AddCustomerpage addcust=new AddCustomerpage(driver);
		addcust.clickAddNewCustomer();
		logger.info("providing customer details....");
		addcust.custName("Pavan");
		addcust.custgender("male");
		addcust.custdob("10","15","1985");
		Thread.sleep(5000);
		addcust.custaddress("INDIA");
		addcust.custcity("HYD");
		addcust.custstate("AP");
		addcust.custpinno("5000074");
		addcust.custtelephoneno("987890091");
		
		String email=randomestring()+"@gmail.com";
		addcust.custemailid(email);
//		addcust.custpassword("abcdef");
		addcust.custsubmit();
		
		Thread.sleep(3000);
		
		logger.info("validation started....");
		
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("test case passed....");
			
		}
		else
		{
			logger.info("test case failed....");
			capturescreenshot(driver,"AddCustomerTest");
			Assert.assertTrue(false);
		}
		
		
	}

}
