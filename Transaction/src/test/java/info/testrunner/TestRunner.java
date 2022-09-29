
package info.testrunner;

//import org.junit.runner.RunWith;

//import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

	//@RunWith(Cucumber.class)
	@CucumberOptions
	(
			tags= "@UpdateByBranch",
			plugin = {"pretty",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
			"timeline:test-output-thread/"},
			features="src/test/resources/Features",
			glue= {"info.stepdefinition"},
			dryRun=false,
			monochrome=true
			
	)
	public class TestRunner extends AbstractTestNGCucumberTests 
	{

	}
		


