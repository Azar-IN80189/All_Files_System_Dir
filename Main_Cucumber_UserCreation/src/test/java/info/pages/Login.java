package info.pages;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import info.base.BaseClass;
import info.pom.UserCreation_POJO;
import info.utility.ExcelReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Login extends BaseClass {
	public static UserCreation_POJO p;
	//public Methods Methods=new Methods(DriverFactory.getDriver());
	@Given("User have to navigate to the login page")
	public void user_have_to_navigate_to_the_login_page() {
		browserLaunch();
		toMaximize();
		launchUrl("https://staging.info-tech.com.sg/");
		
	}

	@When("User entered username and Password from given sheetname {string} rownumber {int}")
	public void user_entered_username_and_Password_from_given_sheetname_rownumber(String SheetName, Integer RowNumber) throws IOException, InvalidFormatException, InterruptedException {
	ExcelReader reader=new ExcelReader();
	p = new UserCreation_POJO();
	List<Map<String,String>> testData=reader.getData("src/test/resources/Excel/Automation.xlsx", SheetName);
	String email = testData.get(RowNumber).get("useremail");
	String password = testData.get(RowNumber).get("userpassword");
	p.Username.sendKeys(email);
	Thread.sleep(500);
	p.password.sendKeys(password);
	toClick(p.click);
	
	
	}

	@Then("User should enter in to the hompage of the user")
	public void user_should_enter_in_to_the_hompage_of_the_user() {
		System.out.println("User is in homepage");
	}

}
