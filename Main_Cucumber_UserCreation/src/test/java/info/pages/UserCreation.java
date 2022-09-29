package info.pages;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import info.base.BaseClass;
import info.pom.UserCreation_POJO;
import info.utility.ExcelReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class UserCreation  extends BaseClass{
	public static UserCreation_POJO p;
	
	@Given("User have to click Administrator and User creation")
	public void user_have_to_click_Administrator_and_User_creation() throws InterruptedException, IOException {
		p = new UserCreation_POJO();
		System.out.println("Creation page");
		toClick(p.Administrator);
		toClick(p.UserCreation);
		
	}

	@When("User is entering in to user creation page")
	public void user_is_entering_in_to_user_creation_page() {
		System.out.println("user is in usercreation page");
		implicitwait();
	}

	@And("User need to create new user")
	public void user_need_to_create_new_user() throws IOException {
		p = new UserCreation_POJO();
		toClick(p.NewUser);
		implicitwait();
	}

	@When("User entered the details required for User Creation from given {string} and {int}")
	public void user_entered_the_details_required_for_User_Creation_from_given_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
		p = new UserCreation_POJO();
		implicitwait();
		List<Map<String,String>> testData=reader.getData("src/test/resources/Excel/Automation.xlsx", SheetName);
		String user = testData.get(RowNumber).get("username");
		String email = testData.get(RowNumber).get("primaryemail");
		String phone = testData.get(RowNumber).get("mobilenumber");
		p.Displayname.sendKeys(user);
		p.primaryemail.sendKeys(email);
		p.mobilenumber.sendKeys(phone);
	}

	@And("User need to give superadmin permission")
	public void user_need_to_give_superadmin_permission() throws InterruptedException, IOException {
		p = new UserCreation_POJO();
		toClick(p.showbasicsalary);
		toClick(p.allowlockattendencedetails);
		toClick(p.allowunlockattendencedetails);
		implicitwait();
		toClick(p.AppAccess);
		toselectbyvisibletext(p.ETms, "ALL");
		toselectbyvisibletext(p.ELeave, "ALL");
		toselectbyvisibletext(p.EPayroll, "ALL");
		toselectbyvisibletext(p.EAttendence, "ALL");
		toselectbyvisibletext(p.EClaim, "ALL");
		toselectbyvisibletext(p.EAppraisal, "ALL");
		implicitwait();
		toClick(p.CompanyAcess);
		toClick(p.Selectcompany);
		Thread.sleep(4000);
		toClick(p.DepartmentAccess);
		toClick(p.ETmsSuperadmin);
		toClick(p.ELeaveSuperadmin);
		toClick(p.EClaimSuperadmin);
		toClick(p.EPayrollSuperadmin);
		toClick(p.EAttendenceSuperadmin);
		toClick(p.EAppraisalSuperadmin);
		
	}

	@And("User need to give location access")
	public void user_need_to_give_location_access() throws InterruptedException, IOException {
		p = new UserCreation_POJO();
		Thread.sleep(2000);
		toClick(p.LocationAccess);
		Thread.sleep(2000);
		toscrolldown("arguments[0].scrollIntoView(true)", p.LocationSave);
		
	}

	@And("User need to select the company")
	public void user_need_to_select_the_company() throws InterruptedException, IOException {
		p = new UserCreation_POJO();
		Pageloadtimeout();
		toClick(p.LocationSave);
		
	}

	@And("User need to click save finally for creating the user")
	public void user_need_to_click_save_finally_for_creating_the_user() throws InterruptedException, IOException {
		p = new UserCreation_POJO();
		Pageloadtimeout();
		System.out.println("User Created Successfully");
	}

	@And("User entered UserDetails as per the requirement")
	public void user_entered_UserDetails_as_per_the_requirements() throws InterruptedException {
		Pageloadtimeout();
		System.out.println("User done");
		Thread.sleep(6000);
	}


}
