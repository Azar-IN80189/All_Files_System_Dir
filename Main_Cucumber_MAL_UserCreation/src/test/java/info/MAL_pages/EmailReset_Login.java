package info.MAL_pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;

import info.base.Reusableclass;
import info.pom.UserCreation_MAL_POJO;
import info.utility.ExcelReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmailReset_Login extends Reusableclass{
	public static UserCreation_MAL_POJO p;
	@When("User navigated to the mailinator page in MAL")
	public void user_navigated_to_the_mailinator_page_in_mal() {
		Pageloadtimeout();
		driver.navigate().to("https://www.mailinator.com/v4/public/inboxes.jsp");

	}

	@Then("User will enter search mail in MAL {string} and {int}")
	public void user_will_enter_search_mail_in_mal_and(String SheetName1, Integer RowNumber1) throws IOException, InvalidFormatException, AWTException, InterruptedException {
		ExcelReader reader=new ExcelReader();
		p = new UserCreation_MAL_POJO();
		implicitwait();
		List<Map<String,String>> testData=reader.getData("src/test/resources/Excel/Automation.xlsx", SheetName1);
		String  search= testData.get(RowNumber1).get("searchmail");
		p.SearchMailinator.sendKeys(search);
		toenter();
		Thread.sleep(2000);
		toClick(p.mailinatorvisiblemail);
		Pageloadtimeout();
		Scrolldownjavascript();
		Pageloadtimeout();
		driver.switchTo().frame(p.frames);
		Scrolldownjavascript();
		toClick(p.mailinatorresetpass);
		implicitwait();

	}

	@And("User Need to change and reset password in MAL {string} and {int}")
	public void user_need_to_change_and_reset_password_in_mal_and(String SheetName1, Integer RowNumber1) throws IOException, InvalidFormatException, AWTException, InterruptedException {
		ExcelReader reader=new ExcelReader();
		p = new UserCreation_MAL_POJO();
		tohandlewindows();
		List<Map<String,String>> testData=reader.getData("src/test/resources/Excel/Automation.xlsx", SheetName1);
		implicitwait();
		String newpassword= testData.get(RowNumber1).get("resetpassword");
		String retypepassword= testData.get(RowNumber1).get("resetpassword");
		p.Newpasswordreset.sendKeys(newpassword);
		Thread.sleep(2000);
		p.ReNewpasswordreset.sendKeys(retypepassword);
		Thread.sleep(2000);
		toClick(p.savepasswordreset);
		toenter();
	}

	@When("User will navigate to login page will enter changed Username and password in MAL {string} and {int}")
	public void user_will_navigate_to_login_page_will_enter_changed_username_and_password_in_mal_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException, AWTException {

		implicitwait();
		tohandlewindows();
		ExcelReader reader=new ExcelReader();
		p = new UserCreation_MAL_POJO();
		implicitwait();
		List<Map<String,String>> testData=reader.getData("src/test/resources/Excel/Automation.xlsx", SheetName);
		String username = testData.get(RowNumber).get("primaryemail");
		String password= testData.get(RowNumber).get("resetpassword");
		p.Username.sendKeys(username);
		Thread.sleep(500);
		p.password.sendKeys(password);
		implicitwait();
		toClick(p.click);
		implicitwait();
		Explicitwaitvisibility(p.logoutuser);
			toClick(p.logoutuser);
		}
		
		
		

	@And("After logged in successfully user loggedout successfully in MAL")
	public void after_logged_in_successfully_user_loggedout_successfully_in_mal() {
		
		
		
		
		driver.quit();

	}


}
