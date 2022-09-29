package info.pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import info.base.BaseClass;
import info.pom.PageObjectModel;
import info.utility.ExcelReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmailReset_Login extends BaseClass{
	
	public static PageObjectModel v;
	
	@When("User navigated to the mailinator page")
	public void user_navigated_to_the_mailinator_page() {
		Pageloadtimeout();
		driver.navigate().to("https://www.mailinator.com/v4/public/inboxes.jsp");

	}

	@Then("User will enter search mail {string} and {int}")
	public void user_will_enter_search_mail_and(String SheetName1, Integer RowNumber1) throws InvalidFormatException, IOException, InterruptedException, AWTException {
		ExcelReader reader=new ExcelReader();
		implicitwait();
		 v = new PageObjectModel();
		List<Map<String,String>> testData=reader.getData("src/test/resources/Excel/Automation.xlsx", SheetName1);
		String  search= testData.get(RowNumber1).get("searchmail");
		v.SearchMailinator.sendKeys(search);
		toenter();
		Thread.sleep(2000);
		toClick(v.mailinatorvisiblemail);
		Pageloadtimeout();
		Scrolldownjavascript();
		Pageloadtimeout();
		driver.switchTo().frame(v.frames);
		Scrolldownjavascript();
		toClick(v.mailinatorresetpass);
		implicitwait();

	}

	@And("User Need to change and reset password {string} and {int}")
	public void user_Need_to_change_and_reset_password_and(String SheetName1, Integer RowNumber1) throws IOException, InvalidFormatException, AWTException {
		ExcelReader reader=new ExcelReader();
		 v = new PageObjectModel();
		tohandlewindows();
		List<Map<String,String>> testData=reader.getData("src/test/resources/Excel/Automation.xlsx", SheetName1);
		implicitwait();
		String newpassword= testData.get(RowNumber1).get("resetpassword");
		String retypepassword= testData.get(RowNumber1).get("resetpassword");
		v.Newpasswordreset.sendKeys(newpassword);
		v.ReNewpasswordreset.sendKeys(retypepassword);
		toClick(v.savepasswordreset);
		toenter();
	}

	@When("User will navigate to login page will enter changed Username and password {string} and {int}")
	public void user_will_navigate_to_login_page_will_enter_changed_Username_and_password_and(String SheetName, Integer RowNumber) throws AWTException, IOException, InvalidFormatException, InterruptedException, Exception {

		implicitwait();
		tohandlewindows();
		ExcelReader reader=new ExcelReader();
		 v = new PageObjectModel();
	
		
		implicitwait();
		List<Map<String,String>> testData=reader.getData("src/test/resources/Excel/Automation.xlsx", SheetName);
		String username = testData.get(RowNumber).get("primaryemail");
		String password= testData.get(RowNumber).get("resetpassword");
		v.Username.sendKeys(username);
		Thread.sleep(500);
		v.password.sendKeys(password);
		implicitwait();
		toClick(v.click);
		implicitwait();
		
	}


	@When("After logged in successfully with {string} and {int}")
	public void after_logged_in_successfully_with_and(String SheetName, Integer RowNumber) throws IOException, InvalidFormatException, InterruptedException, AWTException {
		ExcelReader reader=new ExcelReader();
		 v = new PageObjectModel();
			Explicitwaitvisibility(v.changepassworduser);
			toClick(v.changepassworduser);
			Scrolldownjavascript();
			implicitwait();
			List<Map<String,String>> testData=reader.getData("src/test/resources/Excel/Automation.xlsx", SheetName);
			String currentpassworduser = testData.get(RowNumber).get("resetpassword");
			toFill(v.currentpassworduser, currentpassworduser);
			String newpasschangeuser = testData.get(RowNumber).get("Standard Password");
			toFill(v.newpasschangeuser, newpasschangeuser);
			String renewpasschangeuser = testData.get(RowNumber).get("Standard Password");
			toFill(v.renewpasschangeuser, renewpasschangeuser);	
			toClick(v.savechangepassworduser);
			Thread.sleep(2000);
			//toAcceptAlert();
			toenter();
			tohandlewindows();
			String Usernamelast = testData.get(RowNumber).get("primaryemail");
			v.Username.sendKeys(Usernamelast);
			Thread.sleep(500);
			String passwordlast = testData.get(RowNumber).get("Standard Password");
			v.password.sendKeys(passwordlast);
			toClick(v.click);
	
	}

}
