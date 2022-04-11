package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en. *;
import junit.framework.Assert;
import pages.AddCustomerPage;
import pages.LoginPage;
import pages.SearchCustomerPage;

@SuppressWarnings("deprecation")
public class HomepageTest extends BaseClass {
	
	WebDriver driver = null;
	
	AddCustomerPage ap; LoginPage lp; SearchCustomerPage searchCust;
	
	
	
	@Given("User Launch Chrome browser")
	public void user_Launch_Chrome_browser() {
	   
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Testlaptop4\\eclipse-workspace\\ExtentCucumber\\Drivers\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		lp = new LoginPage(driver);
		ap =new AddCustomerPage(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_URL(String string) {
	  
		driver.get(string);
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_Email_as_and_Password_as(String string, String string2) {
		lp.username(string);
		lp.password(string2);

	}

	
	@When("Click on Login")
	public void click_on_Login() {
		lp.login();
	}

	@Then("User can view Dashboad")
	public void user_can_view_Dashboad() {
	   
	String title = driver.getTitle();
		
		if(title.equalsIgnoreCase("Dashboard / nopCommerce administration")) {
			
			System.out.println("LoginPage Validated");
			
			//lp.logout();
			
		
		}
		else {
			
			System.out.println("LoginPage Validation Failed");
			
			//driver.quit();
			
		}
	}

	@When("User click on customers Menu")
	
	
	public void user_click_on_customers_Menu() {
	ap.clickOnCustomersMenu();
	}

	@When("click on customers Menu Item")
	public void click_on_customers_Menu_Item() {
	   ap.clickOnCustomersMenuItem();
	}

	@When("click on Add new button")
	public void click_on_Add_new_button() throws InterruptedException {
		
	    ap.clickOnAddnew();
	}

	@Then("User can view Add new customer page")
	public void user_can_view_Add_new_customer_page() {
		
		String title = driver.getTitle();
		
		  Assert.assertEquals("Add a new customer / nopCommerce administration", title);
	}

	@When("User enter customer info")
	public void user_enter_customer_info() throws InterruptedException {
		
		 String email = randomestring() + "@gmail.com";
	
		ap.setEmail(email);
		ap.setPassword("Welcome");
		ap.setFirstName("Kiran");
		ap.setLastName("Kumar");
		ap.setGender("Male");
		ap.setDob("7/05/1985");
		ap.setCompanyName("shopify");
		ap.setCustomerRoles("Administrators");
	}

	@When("click on Save button")
	public void click_on_Save_button() {
	    ap.clicksave();
	}

	@Then("User can view confirmation message {string}")
	public void user_can_view_confirmation_message(String string) {
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText()
                .contains("The new customer has been added successfully"));
	}

	@Then("close browser")
	public void close_browser() {

		driver.quit();
	}

	@When("Enter customer EMail")
	public void enter_customer_EMail() {
		 searchCust=new SearchCustomerPage(driver);
	     searchCust.setEmail("victoria_victoria@nopCommerce.com");
	}

	@When("Click on search button")
	public void click_on_search_button() throws InterruptedException {
	    searchCust.clickSearch();
        Thread.sleep(3000);
	}

	@Then("User should found Email in the Search table")
	public void user_should_found_Email_in_the_Search_table() {
		 boolean status=searchCust.searchCustomerByEmail("victoria_victoria@nopCommerce.com");
	      Assert.assertEquals(true, status);
	}

	@When("Enter customer FirstName")
	public void enter_customer_FirstName() {
	
		searchCust=new SearchCustomerPage(driver);
        searchCust.setFirstName("Victoria");
	}

	@When("Enter customer LastName")
	public void enter_customer_LastName() {
	
		 searchCust.setLastName("Terces");
	}

	@Then("User should found Name in the Search table")
	public void user_should_found_Name_in_the_Search_table() {
	  
		boolean status=searchCust.searchCustomerByName("Victoria Terces");
        Assert.assertEquals(true, status);
	}
}