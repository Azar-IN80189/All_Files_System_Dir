package info.pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;

import info.base.BaseClass;
import info.pom.UserCreation_POJO;
import info.utility.ExcelReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmailReset_Login extends BaseClass{
	public static UserCreation_POJO p;
	@When("User navigated to the mailinator page")
	public void user_navigated_to_the_mailinator_page() {
		Pageloadtimeout();
		driver.navigate().to("https://www.mailinator.com/v4/public/inboxes.jsp");

	}

	@Then("User will enter search mail {string} and {int}")
	public void user_will_enter_search_mail_and(String SheetName1, Integer RowNumber1) throws InvalidFormatException, IOException, InterruptedException, AWTException {
		ExcelReader reader=new ExcelReader();
		p = new UserCreation_POJO();
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

	@And("User Need to change and reset password {string} and {int}")
	public void user_Need_to_change_and_reset_password_and(String SheetName1, Integer RowNumber1) throws IOException, InvalidFormatException, AWTException {
		ExcelReader reader=new ExcelReader();
		p = new UserCreation_POJO();
		tohandlewindows();
		List<Map<String,String>> testData=reader.getData("src/test/resources/Excel/Automation.xlsx", SheetName1);
		implicitwait();
		String newpassword= testData.get(RowNumber1).get("resetpassword");
		String retypepassword= testData.get(RowNumber1).get("resetpassword");
		p.Newpasswordreset.sendKeys(newpassword);
		p.ReNewpasswordreset.sendKeys(retypepassword);
		toClick(p.savepasswordreset);
		toenter();
	}

	@When("User will navigate to login page will enter changed Username and password {string} and {int}")
	public void user_will_navigate_to_login_page_will_enter_changed_Username_and_password_and(String SheetName, Integer RowNumber) throws AWTException, IOException, InvalidFormatException, InterruptedException, Exception {

		implicitwait();
		tohandlewindows();
		ExcelReader reader=new ExcelReader();
		p = new UserCreation_POJO();
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
		toClick(p.logoutuser);
		
//		try {
//			toClick(driver.findElement(By.xpath("//*[@id=\"Panel7\"]/div/div/div/div/div/button/span[1]")));
//			Explicitwaitvisibility(p.logoutuser);
//			toClick(p.logoutuser);
//			
//		} catch (Exception e) {
//			toClick(driver.findElement(By.xpath("//*[@id=\"Panel7\"]/div/div/div/div/div/button/span[1]")));
//			toClick(p.changepassworduser);
//			Scrolldownjavascript();
//			String currentpassworduser = testData.get(RowNumber).get("Reset Password");
//			p.currentpassworduser.sendKeys(currentpassworduser);
//			String newpasschangeuser = testData.get(RowNumber).get("Standard Password");
//			p.newpasschangeuser.sendKeys(newpasschangeuser);
//			String renewpasschangeuser = testData.get(RowNumber).get("Standard Password");
//			p.renewpasschangeuser.sendKeys(renewpasschangeuser);
//			toClick(p.savechangepassworduser);
//			Thread.sleep(2000);
//			//toAcceptAlert();
//			toenter();
//			tohandlewindows();
//			String Usernamelast = testData.get(RowNumber).get("Employee Email");
//			p.Username.sendKeys(Usernamelast);
//			Thread.sleep(500);
//			String passwordlast = testData.get(RowNumber).get("Standard Password");
//			p.password.sendKeys(passwordlast);
//			toClick(p.click);
//			Explicitwaitvisibility(p.logoutuser);
//			toClick(p.logoutuser);
//		}
//		
		
		}

	@And("After logged in successfully user loggedout successfully")
	public void after_logged_in_successfully_user_loggedout_successfully() throws InterruptedException {
		
		
		
		
		driver.quit();

	}


}
