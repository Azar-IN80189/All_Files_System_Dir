package info.pages;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import info.base.BaseClass;
import info.pom.ApproverSettings_POJO;
import info.pom.PageObjectModel;
import info.utility.ExcelReader;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApproverSettings extends BaseClass {
	public static PageObjectModel p;
	ApproverSettings_POJO a;
	
	@Before(order=3)
	@Given("User need to set the Approver for the employee")
	public void user_need_to_set_the_approver_for_the_employee() throws IOException {
		a=new ApproverSettings_POJO();
toClick(a.Administrationclick);
	}

	@When("User Entered in to Approver page")
	public void user_entered_in_to_approver_page() throws IOException {
		a=new ApproverSettings_POJO();
		
		tomovethecursor(a.ApproverSettings);
		toClick(a.ApproverSettings);

	
	}

	@When("User need to enter details in to Approver page {string} and {int}")
	public void user_need_to_enter_details_in_to_approver_page_and(String SheetName, Integer RowNumber) throws IOException, InvalidFormatException, InterruptedException {
		a=new ApproverSettings_POJO();
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("src/test/resources/Excel/Automation.xlsx", SheetName);
		String Searchemployee = testData.get(RowNumber).get("Search Employee");
		a.SearchEmployee.sendKeys(Searchemployee);
		toClick(a.SearchEmployeebtn);
		String FirstApprover = testData.get(RowNumber).get("First Level Approver");
		toselectbyvisibletext(a.FirstApprover, FirstApprover);
		Thread.sleep(1000);
		String SecondApprover = testData.get(RowNumber).get("Second Level Approver");
		toselectbyvisibletext(a.SecondApprover, SecondApprover);
		String ThirdApprover = testData.get(RowNumber).get("Final Level Approver");
		toselectbyvisibletext(a.ThirdApprover, ThirdApprover);
		Scrolldownjavascript();
		toClick(a.CheckboxclickEmployee);
	
	}

	@Then("User need to click save to Assign the Approver for an employee")
	public void user_need_to_click_save_to_assign_the_approver_for_an_employee() throws IOException, InterruptedException {
		a=new ApproverSettings_POJO();
		
		toClick(a.ApproverSettingsSave);
		
	
	}

}
