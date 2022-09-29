package info.MAL_pages;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import info.base.Reusableclass;
import info.pom.UserCreation_MAL_POJO;
import info.utility.ExcelReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Login extends Reusableclass {
	public static UserCreation_MAL_POJO p;
	//public Methods Methods=new Methods(DriverFactory.getDriver());
	@Given("User have to navigate to the login page in MAL")
	public void user_have_to_navigate_to_the_login_page_in_mal() {
		browserLaunch();
		toMaximize();
		launchUrl("https://staging.info-tech.com.my/Login.aspx");
		
	}

	@When("User entered username and Password from given sheetname in MAL {string} rownumber {int}")
	public void user_entered_username_and_password_from_given_sheetname_in_mal_rownumber(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException {
	ExcelReader reader=new ExcelReader();
	p = new UserCreation_MAL_POJO();
	List<Map<String,String>> testData=reader.getData("src/test/resources/Excel/Automation.xlsx", SheetName);
	String email = testData.get(RowNumber).get("useremail");
	String password = testData.get(RowNumber).get("userpassword");
	p.Username.sendKeys(email);
	Thread.sleep(500);
	p.password.sendKeys(password);
	toClick(p.click);
	
	
	}

	@Then("User should enter in to the hompage of the user in MAL")
	public void user_should_enter_in_to_the_hompage_of_the_user_in_mal() {
		System.out.println("User is in homepage");
	}

}
