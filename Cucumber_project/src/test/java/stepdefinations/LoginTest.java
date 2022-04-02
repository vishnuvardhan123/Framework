package stepdefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.LoginPage;

public class LoginTest {
	
	WebDriver driver = null;
	
	LoginPage lp; 
	
	@Given("when user opens chrome browser")
	public void when_user_opens_chrome_browser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Testlaptop4\\eclipse-workspace\\Testing_Programs\\src\\Selinium_Programs\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		lp = new LoginPage(driver);

	}

	@When("user opens url {string}")
	public void user_opens_url(String string) {
		
		driver.get(string);
	
	}

	@When("user enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String string, String string2) {
		
		lp.username(string);
		lp.password(string2);

	}

	@When("user click on login")
	public void user_click_on_login() {
		
		lp.login();

	}

	@Then("validating the loginpage")
	public void validating_the_loginpage() {
		
		String title = driver.getTitle();
		
		if(title.equalsIgnoreCase("Dashboard / nopCommerce administration")) {
			
			System.out.println("LoginPage Validated");
			
			lp.logout();
			
			driver.quit();
		}
		else {
			
			System.out.println("LoginPage Validation Failed");
			
			driver.quit();
			
		}
	}

}
