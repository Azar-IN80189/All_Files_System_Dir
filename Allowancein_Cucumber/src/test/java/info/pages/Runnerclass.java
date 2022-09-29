package info.pages;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Allowancenewfeature" , monochrome = true, dryRun = false,
		glue = {"info.pages"})
public class Runnerclass {

}


