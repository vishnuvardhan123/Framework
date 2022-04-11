package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage {
	
	WebDriver Idriver;
	
	public AddCustomerPage(WebDriver rdriver) {
		
		Idriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
		
	}

	@FindBy(xpath = "//*[@class='nav-icon far fa-user']//following-sibling::p")
	WebElement menu;
	@FindBy(xpath = "(//*[@class='nav-icon far fa-dot-circle']//following-sibling::p)[13]")
	WebElement menuitem;
	@FindBy(xpath = "//a[@class='btn btn-primary']")
	WebElement btnAddnew;
	@FindBy(name = "Email")
	WebElement txtEmail;
	@FindBy(name = "Password")
	WebElement txtPassword;
	@FindBy(name = "FirstName")
	WebElement fstname;
	@FindBy(name = "LastName")
	WebElement lstname;
	@FindBy(id = "Gender_Male")
	WebElement male;
	@FindBy(id = "Gender_Female")
	WebElement female;
	@FindBy(xpath = "//input[@id='DateOfBirth']")
	WebElement txtdob;
	@FindBy(name = "Company")
	WebElement txtcmpny;
	@FindBy(xpath = "(//div[@class=\"k-widget k-multiselect k-multiselect-clearable\"])[2]")
	WebElement txtcustomerRoles;
	@FindBy(name = "save")
	WebElement btnsave;
	


    public void clickOnCustomersMenu() {
     menu.click();
    }

    public void clickOnCustomersMenuItem() {
       menuitem.click();
    }

    public void clickOnAddnew() {
    	btnAddnew.click();
    }

    public void setEmail(String email)
    {
        txtEmail.clear();
        txtEmail.sendKeys(email);
    }

    public void setPassword(String password)
    {
        txtPassword.clear();
        txtPassword.click();
    }
    
    public void setFirstName(String fname)
    {
    	fstname.clear();
    	fstname.sendKeys(fname);
    }

    public void setLastName(String lname)
    {
        lstname.clear();
        lstname.sendKeys(lname);
    }
    
    public void setGender(String gender)
    {
        if(gender.equals("Male"))
        {
            male.click();
        }
        else if(gender.equals("Female"))
        {
           female.click();
        }

    }
    
    public void setDob(String dob)
    {
        txtdob.sendKeys(dob);
    }

    public void setCompanyName(String comname)
    {
    	txtcmpny.sendKeys(comname);
    }

    public void clicksave()
    {
        btnsave.click();
    }


    public void setCustomerRoles(String role) throws InterruptedException
    {
    	 txtcustomerRoles.click();
    	
        if(!role.equals("Administrators")) //If role is vendors should not delete Register as per req.
        {
        	
        	Select s = new Select(txtcustomerRoles);
        	s.selectByVisibleText("Administrators");
        }

        else  if(role.equals("Forum Moderators"))
        {
        	Select s = new Select(txtcustomerRoles);
        	s.selectByIndex(1);
        }
        else if(role.equals("Guests"))
        {
        	Select s = new Select(txtcustomerRoles);
        	s.selectByIndex(2);
        }
        else if(role.equals("Registered"))
        {
        	Select s = new Select(txtcustomerRoles);
        	s.selectByIndex(3);
        }
        else if(role.equals("Vendors"))
        {
        	Select s = new Select(txtcustomerRoles);
        	s.selectByIndex(4);
        }
    
}
	
	
	
	
}
