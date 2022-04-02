package tests;
import java.io.IOException;import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.Loginpage;
import utilities.XLUtils;


public class LoginDDTTest extends BaseClass {

	@Test(dataProvider="LoginData")
	public void loginDDT(String user,String pwd) throws InterruptedException
	{
		Loginpage lp=new Loginpage(driver);
		lp.username(user);
		lp.password(pwd);
		lp.login();
		
		String error_msg = driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[1]")).getText();
		
		if(error_msg.contains("Login was unsuccessful. Please correct the errors and try again.")) {
			
			logger.info("******Login DDT Test Passed*******");
			
		}
		else {
			
			logger.info("******Login DDT Test Filed*******");
			
		}
	}

	@DataProvider(name="LoginData")
	String [][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/test/java/testdata/LoginData.xlsx";
		
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path,"Sheet1",1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1", i,j);//1 0
			}
				
		}
	return logindata;
	}
	
}

	

