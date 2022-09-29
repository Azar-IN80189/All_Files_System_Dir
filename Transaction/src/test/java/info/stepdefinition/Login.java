package info.stepdefinition;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import info.base.Reusableclass;
import info.pojo.AutoshiftNew_POJO;
import info.pojo.AutoshiftOld_POJO;
import info.pojo.User_POJO;
import info.utilities.ExcelReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends Reusableclass 
{

	AutoshiftNew_POJO asp;
	User_POJO usp;
	
	 @Given("^User is on Login Page$")
	 public void user_is_on_login_page() throws Throwable 
	 {
		 browserLaunch();
		 toMaximize();
		 deletecookies();
		 launchUrl("https://staging.info-tech.com.sg");
	        
	 }

	 @When("^User enter the login user name \"([^\"]*)\" and password (.+)$")
	 public void user_enter_the_user_name_something_and_password(String sheetname, int rownumber) throws Throwable 
	 {
		 	ExcelReader reader=new ExcelReader();
			asp = new AutoshiftNew_POJO();
			usp = new User_POJO();
			List<Map<String,String>> testData=reader.getData("C:\\Users\\Sheik Mohammed\\eclipse-workspace\\info\\src\\test\\resources\\Excel File\\Test Data.xlsx", sheetname);
			String username=testData.get(rownumber).get("Username");
			String password=testData.get(rownumber).get("Password");
			String dbname=testData.get(rownumber).get("DB Name");
			
			tofill(usp.Username, username);
			tofill(usp.password, password);
			toClick(usp.click);
			implicitwait();
			toClick(usp.ChangeDB);
			toClick(usp.DBnameenter);
			tofill(usp.DBnameenter,dbname);
			Thread.sleep(1000);
			totabkey();
			Thread.sleep(1000);
			toenter();  
	 }
}
