package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
//		features = "./Features/Loginvalidate.feature",
		features = "./Features/HomePage.feature",
		glue={"stepdefinations"},
		tags= {"not @regression and  @sanity"},
		
		dryRun = false,
		monochrome=true,
		
		plugin= {"pretty", "html:test-output" , "json:target/cucumber.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		
//		plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "json:target/cucumber-report.json"}
		
		)

public class TestRun {

}
