package info.pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import info.base.BaseClass;
import info.pom.BranchSetup_POJO;
import info.pom.PageObjectModel;
import info.utility.ExcelReader;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BranchSetupScenario2 extends BaseClass{
	public static PageObjectModel p;
	BranchSetup_POJO b;
	Logger log = Logger.getLogger(BranchSetup.class);
@Before(order=2)
	@Then("User need to create Branch setup2")
	public void user_need_to_create_branch_setup2() throws IOException, InterruptedException {
		b=new BranchSetup_POJO();
		implicitwait();
		Thread.sleep(500);
		tomovethecursor(b.shiftsettings);
		toClick(b.shiftsettings);
		tomovethecursor(b.BranchSetupclick);
		//toClick(b.BranchSetupclick);
		tomovethecursor(b.Branchclick);
		toClick(b.Branchclick);	

	}



	@When("User Entered in to Branch section2")
	public void user_entered_in_to_branch_section2() throws IOException {
		b=new BranchSetup_POJO();
		toClick(b.CheckboxAssignshiftautomatic);

		toClick(b.Branchsetupnewbtn);
		implicitwait();

	}
	@When("User need to enter details in to Branch section2 {string} and {int}")
	public void user_need_to_enter_details_in_to_branch_section2_and(String SheetName, Integer RowNumber) throws IOException, InterruptedException, InvalidFormatException, AWTException {
		ExcelReader reader=new ExcelReader();
		p = new PageObjectModel();
		b=new BranchSetup_POJO();
		implicitwait();
		List<Map<String,String>> testData=reader.getData("src/test/resources/Excel/Automation.xlsx", SheetName);
		Pageloadtimeout();
		String BranchCode = testData.get(RowNumber).get("Branch Code");
		b.Branchcode.sendKeys(BranchCode);
		String Branchname = testData.get(RowNumber).get("Branch Name");
		b.Branchname.sendKeys(Branchname);
		Thread.sleep(1000);
		toClick(b.ShiftAssignment);
		String shiftselect = testData.get(RowNumber).get("Shift Select");
		toClick(b.ShiftSelect);
		toFill(b.ShiftSelect, shiftselect);
		toenter();



	}
	@Then("User need to click save to allocate the particular branch to the shift for Scenario {int}")
	public void user_need_to_click_save_to_allocate_the_particular_branch_to_the_shift_for_scenario(Integer int1) throws IOException {
		b=new BranchSetup_POJO();
		implicitwait();
		toClick(b.BranchSetupSave);

	}



}
