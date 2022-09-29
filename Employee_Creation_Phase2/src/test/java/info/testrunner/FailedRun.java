package info.testrunner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"timeline:test-output-thread/","rerun:target/failedrun.txt"
		},features="@target/failedrun.txt",glue= {"info.pages"},
monochrome=false)

public class FailedRun extends AbstractTestNGCucumberTests {
@Override
@DataProvider(parallel=true)
public Object[][] scenarios(){
	
	return super.scenarios();
}


}
