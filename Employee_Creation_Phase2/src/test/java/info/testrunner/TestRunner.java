package info.testrunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"timeline:test-output-thread/","rerun:target/failedrun.txt",
		},features="src/test/resources/Features",glue= {"info.pages"},monochrome=true, dryRun=false)

public class TestRunner /*extends AbstractTestNGCucumberTests*/  {
	
	/*@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios(){
		
		return super.scenarios();*/
	

}
