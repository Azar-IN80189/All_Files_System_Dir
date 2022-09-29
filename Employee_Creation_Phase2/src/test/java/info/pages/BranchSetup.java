package info.pages;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;

import info.base.BaseClass;
import info.pom.BranchSetup_POJO;
import info.pom.PageObjectModel;
import info.utility.ExcelReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BranchSetup extends BaseClass{
	public static PageObjectModel p;
	BranchSetup_POJO b;
	Logger log = Logger.getLogger(BranchSetup.class);
	@Before("@LoginFunction")
	public void Setup() throws IOException, InterruptedException, InvalidFormatException {
		log.info("****************************** Starting test cases execution  *****************************************");
		browserLaunch();
		toMaximize();
		log.info("Browser Launched Successfully");
		launchUrl("https://staging.info-tech.com.sg/");
		log.info("Navigated to specified URL");
		p = new PageObjectModel();
		Explicitwaitvisibility(p.Username);
		toFill(p.Username, "i1@gmail.com");
		Explicitwaitvisibility(p.password);
		toFill(p.password, "Info@123");
		Explicitwaitvisibility(p.click);
		toClick(p.click);
		implicitwait();
		toClick(p.ChangeDB);
		Pageloadtimeout();
		toFill(p.DBnameenter,"AZARUDEEN");
		tomovethecursor(driver.findElement(By.xpath("//*[@id=\"tblCustomerList\"]/tbody/tr[1]")));
		toClick(driver.findElement(By.xpath("//*[@id=\"tblCustomerList\"]/tbody/tr[1]")));
		log.info("Logged in as User and selected Database");
	}

	@After("@LoginFunction")
	public void Teardown() {
		System.out.println("Logged in as a User");
	}


@Before(order=1)
	@Then("User need to create Branch setup")
	public void user_need_to_create_branch_setup() throws InterruptedException, IOException {
		b=new BranchSetup_POJO();
		log.info("Creating Branch Scenario 1 ");
		implicitwait();
		Thread.sleep(500);
		tomovethecursor(b.shiftsettings);
		toClick(b.shiftsettings);
		tomovethecursor(b.BranchSetupclick);
		//toClick(b.BranchSetupclick);
		tomovethecursor(b.Branchclick);
		toClick(b.Branchclick);	
	}

	@When("User Entered in to Branch section")
	public void user_entered_in_to_branch_section() throws IOException {
		b=new BranchSetup_POJO();

		//toClick(b.CheckboxAssignshiftautomatic);
		toClick(b.Branchsetupnewbtn);
		implicitwait();


	}

	@When("User need to enter details in to Branch section {string} and {int}")
	public void user_need_to_enter_details_in_to_branch_section_and_row_number(String SheetName, Integer RowNumber) throws IOException, InterruptedException, InvalidFormatException {
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
		String Searchshift = testData.get(RowNumber).get("Assigned Shift");
		b.Searchshiftname.sendKeys(Searchshift);
		toClick(b.Searchshiftbtn);
		Explicitwaitvisibility(b.Assigntobranch);
		toClick(b.Assigntobranch);

	}

	@Then("User need to click save to allocate the particular branch to the shift")
	public void user_need_to_click_save_to_allocate_the_particular_branch_to_the_shift() throws IOException {
		b=new BranchSetup_POJO();
		implicitwait();
		toClick(b.BranchSetupSave);
		log.info("Branch Scenario 1 Created");
	}
}
