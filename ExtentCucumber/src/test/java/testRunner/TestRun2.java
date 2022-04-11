package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "./src/test/java/Features/Loginvalidate.feature",
	
		glue={"stepdefinations"},
		dryRun = false,
		monochrome=true,
		
		plugin = { "pretty", "html:test-output", "json:target/cucumber.json",
		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter: "}	
		
		
		)

public class TestRun2 {

}
