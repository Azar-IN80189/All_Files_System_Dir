package info.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"timeline:test-output-thread/","rerun:target/failedtestcases.txt"
		},features="src/test/resources/Feature/empcreation.feature",glue= {"info.pages"},monochrome=false
)
public class RunnerClass {

}
	