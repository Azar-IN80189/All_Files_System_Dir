package info.stepdefinition;


import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import info.base.Reusableclass;
import info.pojo.Allowancepojo;
import info.pojo.MasterReports_POJO;
import info.pojo.WeeklyAttendanceReport_POJO;
import info.utilities.ExcelReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WeeklyAttendanceReport extends Reusableclass  {
	public static Allowancepojo a;
	public static MasterReports_POJO m;
	public static ExcelReader reader;
	public static WeeklyAttendanceReport_POJO w;
	@Given("User need to enter Weekly attendance reports")
	public void user_need_to_enter_weekly_attendance_reports() {
		a = new Allowancepojo();
		m=new MasterReports_POJO();
		w=new WeeklyAttendanceReport_POJO();
		tomovethecursor(m.reportsmain);
		explicitWaitClick(w.Weeklyattendancereportmain);

	}



	@Given("User need to check the individual reports for all employee {string} and {int}")
	public void user_need_to_check_the_individual_reports_for_all_employee_and(String SheetName, Integer RowNumber) throws InterruptedException, AWTException, InvalidFormatException, IOException {
		reader = new ExcelReader();
		w=new WeeklyAttendanceReport_POJO();
		List<Map<String, String>> data = reader.getData("src/test/resources/Excel File/Test Data.xlsx", SheetName);
		actionssendkeysdelete(w.Weeklyattendancefrom);
		String fromdate = data.get(RowNumber).get("FromDate");
		Thread.sleep(500);
		tofill(w.Weeklyattendancefrom, fromdate);
		totabkey();

		actionssendkeysdelete(w.Weeklyattendanceto);
		String todate = data.get(RowNumber).get("ToDate");
		Thread.sleep(500);
		tofill(w.Weeklyattendanceto, todate);
		totabkey();
		Thread.sleep(500);
		Selectcheckbox(w.Weeklyattendanceindividualallchkbox);
		Thread.sleep(500);
		ScrolldownElement(w.Weeklyattendanceindividualshowbtn);
		Thread.sleep(500);
		clickjavascript(w.Weeklyattendanceindividualshowbtn);

		//ScrolldownElement(w.Weeklyattendancefrom);



	}
	@Then("User need to verify the reports whether it is generating or not in individual reports for all employee")
	public void user_need_to_verify_the_reports_whether_it_is_generating_or_not_in_individual_reports_for_all_employee() throws InterruptedException {
		w=new WeeklyAttendanceReport_POJO();
		SoftAssert softAssert = new SoftAssert();
		//Individual verification 
		Thread.sleep(2000);
		w=new WeeklyAttendanceReport_POJO();	


		try
		{
			driver.switchTo().frame(0);
		}
		catch(NoSuchFrameException e)
		{
			System.out.println(e.getMessage());
		}


		String Exp1 = "Weekly Attendance Report (By Individual)";

		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.elementToBeClickable(w.Weeklyattendanceindividualverification));
		highLightElement(w.Weeklyattendanceindividualverification);


		WebElement individualVerfication = driver.findElement(By.xpath("//span[contains(.,'Weekly Attendance Report (By Individual)')]"));
		String FirstActual1 = individualVerfication.getText();

		System.out.println("Expected1: " + Exp1 + " Actual: " + FirstActual1);

		softAssert.assertEquals(Exp1, FirstActual1);
		System.out.println(softAssert);
		Scrollupjavascript();
		driver.switchTo().defaultContent();
	}
	@Then("User need to check the individual reports for particular employee {string} and {int}")
	public void user_need_to_check_the_individual_reports_for_particular_employee_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException, AWTException {
		reader = new ExcelReader();
		w=new WeeklyAttendanceReport_POJO();
		m=new MasterReports_POJO();
		w=new WeeklyAttendanceReport_POJO();
		
		tomovethecursor(m.reportsmain);
		explicitWaitClick(w.Weeklyattendancereportmain);
		List<Map<String, String>> data = reader.getData("src/test/resources/Excel File/Test Data.xlsx", SheetName);
		actionssendkeysdelete(w.Weeklyattendancefrom);
		String fromdate = data.get(RowNumber).get("FromDate");
		Thread.sleep(500);
		tofill(w.Weeklyattendancefrom, fromdate);
		totabkey();

		actionssendkeysdelete(w.Weeklyattendanceto);
		String todate = data.get(RowNumber).get("ToDate");
		Thread.sleep(500);
		tofill(w.Weeklyattendanceto, todate);
		totabkey();

		String Searchweekly = data.get(RowNumber).get("Search Employee");
		tofill(w.Weeklyattendanceindividualsearchbox, Searchweekly);
		implicitwait();
		Thread.sleep(1000);
		clickjavascript(w.Weeklyattendanceindividualsearchbtn);
		Thread.sleep(1000);
		clickjavascript(w.Weeklyattendanceindividualallchkbox);
		Thread.sleep(1000);
		ScrolldownElement(w.Weeklyattendanceindividualshowbtn);
		Thread.sleep(1000);
		clickjavascript(w.Weeklyattendanceindividualshowbtn);

		//ScrolldownElement(w.Weeklyattendancefrom);

	}
	@Then("User need to verify the reports whether it is generating or not in individual reports for particular employee")
	public void user_need_to_verify_the_reports_whether_it_is_generating_or_not_in_individual_reports_for_particular_employee() throws InterruptedException {
		w=new WeeklyAttendanceReport_POJO();
		SoftAssert softAssert = new SoftAssert();
		Thread.sleep(2000);
		//Individual verification 
		try
		{
			driver.switchTo().frame(0);
		}
		catch(NoSuchFrameException e)
		{
			System.out.println(e.getMessage());
		}
		String Exp1 = "002  JOYCELYN ONG SHI CHING";
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.elementToBeClickable(w.Weeklyattendanceindividualjoyverification));
		ScrolldownElement(w.Weeklyattendanceindividualjoyverification);
		highLightElement(w.Weeklyattendanceindividualjoyverification);

		WebElement individualVerfication = driver.findElement(By.xpath("(//span[contains(.,'002  JOYCELYN ONG SHI CHING')])[2]"));
		String FirstActual1 = individualVerfication.getText();

		System.out.println("Expected1: " + Exp1 + " Actual: " + FirstActual1);

		softAssert.assertEquals(Exp1, FirstActual1);
		System.out.println(softAssert);
		Scrollupjavascript();
		driver.switchTo().defaultContent();
		Scrollupjavascript();
	}
	
	@Then("User need to check department report in weekly attendance section {string} and {int}")
	public void user_need_to_check_department_report_in_weekly_attendance_section_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException, AWTException {
		reader = new ExcelReader();
		w=new WeeklyAttendanceReport_POJO();
		m=new MasterReports_POJO();
		w=new WeeklyAttendanceReport_POJO();
		tomovethecursor(m.reportsmain);
		explicitWaitClick(w.Weeklyattendancereportmain);
		List<Map<String, String>> data = reader.getData("src/test/resources/Excel File/Test Data.xlsx", SheetName);
		actionssendkeysdelete(w.Weeklyattendancefrom);
		String fromdate = data.get(RowNumber).get("FromDate");
		Thread.sleep(500);
		tofill(w.Weeklyattendancefrom, fromdate);
		totabkey();

		actionssendkeysdelete(w.Weeklyattendanceto);
		String todate = data.get(RowNumber).get("ToDate");
		Thread.sleep(500);
		tofill(w.Weeklyattendanceto, todate);
		totabkey();
		Thread.sleep(3000);
		clickjavascript(w.Weeklyattendancedepartmentradiobtn);
		Thread.sleep(500);
		clickjavascript(w.Weeklyattendanceindividualallchkbox);
		Thread.sleep(500);
		ScrolldownElement(w.Weeklyattendanceindividualshowbtn);
		Thread.sleep(500);
		clickjavascript(w.Weeklyattendanceindividualshowbtn);


	}



	@And("User need to verify the reports whether it is generating or not in Department reports")
	public void user_need_to_verify_the_reports_whether_it_is_generating_or_not_in_department_reports() throws InterruptedException {
		w=new WeeklyAttendanceReport_POJO();
		SoftAssert softAssert = new SoftAssert();

		//department verification 

		Thread.sleep(2000);

		w=new WeeklyAttendanceReport_POJO();	


		try
		{
			driver.switchTo().frame(0);
		}
		catch(NoSuchFrameException e)
		{
			System.out.println(e.getMessage());
		}


		String Exp1 = "Weekly Attendance Report (By Department)";

		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.elementToBeClickable(w.Weeklyattendancedeptverification));
		highLightElement(w.Weeklyattendancedeptverification);


		WebElement deptVerfication = driver.findElement(By.xpath("//span[contains(.,'Weekly Attendance Report (By Department)')]"));
		String FirstActual1 = deptVerfication.getText();

		System.out.println("Expected1: " + Exp1 + " Actual: " + FirstActual1);

		softAssert.assertEquals(Exp1, FirstActual1);
		System.out.println(softAssert);
		Scrollupjavascript();
		driver.switchTo().defaultContent();
	}

	@Then("User need to check the department reports for particular department {string} and {int}")
	public void user_need_to_check_the_department_reports_for_particular_department_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException, AWTException {
		reader = new ExcelReader();
		w=new WeeklyAttendanceReport_POJO();
		m=new MasterReports_POJO();
		w=new WeeklyAttendanceReport_POJO();
		
		tomovethecursor(m.reportsmain);
		explicitWaitClick(w.Weeklyattendancereportmain);
		List<Map<String, String>> data = reader.getData("src/test/resources/Excel File/Test Data.xlsx", SheetName);
		actionssendkeysdelete(w.Weeklyattendancefrom);
		String fromdate = data.get(RowNumber).get("FromDate");
		Thread.sleep(500);
		tofill(w.Weeklyattendancefrom, fromdate);
		totabkey();

		actionssendkeysdelete(w.Weeklyattendanceto);
		String todate = data.get(RowNumber).get("ToDate");
		Thread.sleep(500);
		tofill(w.Weeklyattendanceto, todate);
		totabkey();
		Thread.sleep(2000);
		clickjavascript(w.Weeklyattendancedepartmentradiobtn);
		Thread.sleep(1000);
		String Searchweekly = data.get(RowNumber).get("Department name");
		tofill(w.Weeklyattendanceindividualsearchbox, Searchweekly);
		Thread.sleep(1000);
		clickjavascript(w.Weeklyattendanceindividualsearchbtn);
		Explicitwaitvisibility(w.Weeklyattendanceindividualallchkbox);
		Selectcheckbox(w.Weeklyattendanceindividualallchkbox);
		Thread.sleep(1000);
		ScrolldownElement(w.Weeklyattendanceindividualshowbtn);
		Thread.sleep(1000);
		clickjavascript(w.Weeklyattendanceindividualshowbtn);

	}



	@Then("User need to verify the reports whether it is generating or not in department reports for particular department")
	public void user_need_to_verify_the_reports_whether_it_is_generating_or_not_in_department_reports_for_particular_department() throws InterruptedException {
		w=new WeeklyAttendanceReport_POJO();
		SoftAssert softAssert = new SoftAssert();
		Thread.sleep(2000);
		//Individual verification 
		try
		{
			driver.switchTo().frame(0);
		}
		catch(NoSuchFrameException e)
		{
			System.out.println(e.getMessage());
		}
		String Exp1 = "ADMIN";
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.elementToBeClickable(w.Weeklyattendanceonedeptverification));
		ScrolldownElement(w.Weeklyattendanceonedeptverification);
		highLightElement(w.Weeklyattendanceonedeptverification);

		WebElement individualVerfication = driver.findElement(By.xpath("//a[@target='_self'][contains(.,'ADMIN')]"));
		String FirstActual1 = individualVerfication.getText();

		System.out.println("Expected1: " + Exp1 + " Actual: " + FirstActual1);

		softAssert.assertEquals(Exp1, FirstActual1);
		System.out.println(softAssert);
		Scrollupjavascript();
		driver.switchTo().defaultContent();
		Scrollupjavascript();
driver.switchTo().defaultContent();
	}

	@And("User need to check the Section reports for all the sections {string} and {int}")
	public void user_need_to_check_the_section_reports_for_all_the_sections_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException, AWTException {
		reader = new ExcelReader();
		w=new WeeklyAttendanceReport_POJO();
		m=new MasterReports_POJO();
		w=new WeeklyAttendanceReport_POJO();
		tomovethecursor(m.reportsmain);
		explicitWaitClick(w.Weeklyattendancereportmain);
		List<Map<String, String>> data = reader.getData("src/test/resources/Excel File/Test Data.xlsx", SheetName);
		actionssendkeysdelete(w.Weeklyattendancefrom);
		String fromdate = data.get(RowNumber).get("FromDate");
		Thread.sleep(500);
		tofill(w.Weeklyattendancefrom, fromdate);
		totabkey();

		actionssendkeysdelete(w.Weeklyattendanceto);
		String todate = data.get(RowNumber).get("ToDate");
		Thread.sleep(500);
		tofill(w.Weeklyattendanceto, todate);
		totabkey();
		Thread.sleep(2000);
		clickjavascript(w.Weeklyattendancesectionradiobtn);
		Thread.sleep(1000);
		actionssendkeysdelete(w.Weeklyattendancesectiondeptdd);
		String deptddweekly = data.get(RowNumber).get("Department name");
		tofill(w.Weeklyattendancesectiondeptdd, deptddweekly);
		totabkey();
		Thread.sleep(1000);
		Selectcheckbox(w.Weeklyattendanceindividualallchkbox);
		Thread.sleep(1000);
		ScrolldownElement(w.Weeklyattendanceindividualshowbtn);
		Thread.sleep(1000);
		clickjavascript(w.Weeklyattendanceindividualshowbtn);


	}



	@Then("User need to verify the reports whether it is generating or not in Section reports for all the sections")
	public void user_need_to_verify_the_reports_whether_it_is_generating_or_not_in_section_reports_for_all_the_sections() throws InterruptedException {
		w=new WeeklyAttendanceReport_POJO();
		SoftAssert softAssert = new SoftAssert();
		//section verification 
		Thread.sleep(2000);
		w=new WeeklyAttendanceReport_POJO();	


		try
		{
			driver.switchTo().frame(0);
		}
		catch(NoSuchFrameException e)
		{
			System.out.println(e.getMessage());
		}


		String Exp1 = "Weekly Attendance Report (By Section)";

		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.elementToBeClickable(w.Weeklyattendancesectionverification));
		highLightElement(w.Weeklyattendancesectionverification);


		WebElement individualVerfication = driver.findElement(By.xpath("//span[contains(.,'Weekly Attendance Report (By Section)')]"));
		String FirstActual1 = individualVerfication.getText();

		System.out.println("Expected1: " + Exp1 + " Actual: " + FirstActual1);

		softAssert.assertEquals(Exp1, FirstActual1);
		System.out.println(softAssert);
		Scrollupjavascript();
		driver.switchTo().defaultContent();
	}

	@And("User need to check the Section reports for the particular section {string} and {int}")
	public void user_need_to_check_the_section_reports_for_the_particular_section_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException, AWTException {
		reader = new ExcelReader();
		w=new WeeklyAttendanceReport_POJO();
		m=new MasterReports_POJO();
		w=new WeeklyAttendanceReport_POJO();
		
		tomovethecursor(m.reportsmain);
		explicitWaitClick(w.Weeklyattendancereportmain);
		List<Map<String, String>> data = reader.getData("src/test/resources/Excel File/Test Data.xlsx", SheetName);
		actionssendkeysdelete(w.Weeklyattendancefrom);
		String fromdate = data.get(RowNumber).get("FromDate");
		Thread.sleep(500);
		tofill(w.Weeklyattendancefrom, fromdate);
		totabkey();

		actionssendkeysdelete(w.Weeklyattendanceto);
		String todate = data.get(RowNumber).get("ToDate");
		Thread.sleep(500);
		tofill(w.Weeklyattendanceto, todate);
		totabkey();
		Thread.sleep(1000);
		clickjavascript(w.Weeklyattendancesectionradiobtn);
		Thread.sleep(1000);
		String Searchweekly = data.get(RowNumber).get("Section name");
		tofill(w.Weeklyattendanceindividualsearchbox, Searchweekly);
		Thread.sleep(1000);
		clickjavascript(w.Weeklyattendanceindividualsearchbtn);
		Thread.sleep(1000);
		Selectcheckbox(w.Weeklyattendanceindividualallchkbox);
		Thread.sleep(1000);
		ScrolldownElement(w.Weeklyattendanceindividualshowbtn);
		Thread.sleep(1000);
		clickjavascript(w.Weeklyattendanceindividualshowbtn);

	}



	@Then("User need to verify the reports whether it is generating or not in Section reports for the particular sections")
	public void user_need_to_verify_the_reports_whether_it_is_generating_or_not_in_section_reports_for_the_particular_sections() throws InterruptedException {
		w=new WeeklyAttendanceReport_POJO();
		SoftAssert softAssert = new SoftAssert();
		Thread.sleep(2000);
		//section verification 
		try
		{
			driver.switchTo().frame(0);
		}
		catch(NoSuchFrameException e)
		{
			System.out.println(e.getMessage());
		}
		String Exp1 = "NONE";
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.elementToBeClickable(w.Weeklyattendanceonesectionverification));
		ScrolldownElement(w.Weeklyattendanceonesectionverification);
		highLightElement(w.Weeklyattendanceonesectionverification);

		WebElement individualVerfication = driver.findElement(By.xpath("(//a[contains(.,'NONE')])[1]"));
		String FirstActual1 = individualVerfication.getText();

		System.out.println("Expected1: " + Exp1 + " Actual: " + FirstActual1);

		softAssert.assertEquals(Exp1, FirstActual1);
		System.out.println(softAssert);
		Scrollupjavascript();
		driver.switchTo().defaultContent();
		Scrollupjavascript();
		driver.switchTo().defaultContent();
	}

	@Given("User need to check the designation reports for all the designation {string} and {int}")
	public void user_need_to_check_the_designation_reports_for_all_the_designation_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException, AWTException {
		reader = new ExcelReader();
		w=new WeeklyAttendanceReport_POJO();
		m=new MasterReports_POJO();
		w=new WeeklyAttendanceReport_POJO();
		tomovethecursor(m.reportsmain);
		explicitWaitClick(w.Weeklyattendancereportmain);
		List<Map<String, String>> data = reader.getData("src/test/resources/Excel File/Test Data.xlsx", SheetName);
		actionssendkeysdelete(w.Weeklyattendancefrom);
		String fromdate = data.get(RowNumber).get("FromDate");
		Thread.sleep(500);
		tofill(w.Weeklyattendancefrom, fromdate);
		totabkey();

		actionssendkeysdelete(w.Weeklyattendanceto);
		String todate = data.get(RowNumber).get("ToDate");
		Thread.sleep(500);
		tofill(w.Weeklyattendanceto, todate);
		totabkey();
		Thread.sleep(2000);
		clickjavascript(w.Weeklyattendancedesignationradiobtn);
		Thread.sleep(500);
		clickjavascript(w.Weeklyattendanceindividualallchkbox);
		Thread.sleep(500);
		ScrolldownElement(w.Weeklyattendanceindividualshowbtn);
		Thread.sleep(500);
		clickjavascript(w.Weeklyattendanceindividualshowbtn);


	}


	@When("User need to verify the reports whether it is generating or not in designation reports for all the designation")
	public void user_need_to_verify_the_reports_whether_it_is_generating_or_not_in_designation_reports_for_all_the_designation() throws InterruptedException {
		w=new WeeklyAttendanceReport_POJO();
		SoftAssert softAssert = new SoftAssert();
		//designation verification 
		Thread.sleep(2000);
		w=new WeeklyAttendanceReport_POJO();	


		try
		{
			driver.switchTo().frame(0);
		}
		catch(NoSuchFrameException e)
		{
			System.out.println(e.getMessage());
		}


		String Exp1 = "Weekly Attendance Report (By Designation)";

		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.elementToBeClickable(w.Weeklyattendancedesignationverification));
		highLightElement(w.Weeklyattendancedesignationverification);


		WebElement individualVerfication = driver.findElement(By.xpath("//span[contains(.,'Weekly Attendance Report (By Designation)')]"));
		String FirstActual1 = individualVerfication.getText();

		System.out.println("Expected1: " + Exp1 + " Actual: " + FirstActual1);

		softAssert.assertEquals(Exp1, FirstActual1);
		System.out.println(softAssert);
		Scrollupjavascript();
		driver.switchTo().defaultContent();
	}

	@And("User need to check the designation reports for the particular designation {string} and {int}")
	public void user_need_to_check_the_designation_reports_for_the_particular_designation_and(String SheetName, Integer RowNumber) throws InterruptedException, InvalidFormatException, IOException, AWTException {
		reader = new ExcelReader();
		w=new WeeklyAttendanceReport_POJO();
		m=new MasterReports_POJO();
		w=new WeeklyAttendanceReport_POJO();
	
		tomovethecursor(m.reportsmain);
		explicitWaitClick(w.Weeklyattendancereportmain);
		List<Map<String, String>> data = reader.getData("src/test/resources/Excel File/Test Data.xlsx", SheetName);
		actionssendkeysdelete(w.Weeklyattendancefrom);
		String fromdate = data.get(RowNumber).get("FromDate");
		Thread.sleep(500);
		tofill(w.Weeklyattendancefrom, fromdate);
		totabkey();

		actionssendkeysdelete(w.Weeklyattendanceto);
		String todate = data.get(RowNumber).get("ToDate");
		Thread.sleep(500);
		tofill(w.Weeklyattendanceto, todate);
		totabkey();
		Thread.sleep(2000);
		clickjavascript(w.Weeklyattendancedesignationradiobtn);
		Thread.sleep(1000);
		String Searchweekly = data.get(RowNumber).get("Designation name");
		tofill(w.Weeklyattendanceindividualsearchbox, Searchweekly);
		Thread.sleep(1000);
		clickjavascript(w.Weeklyattendanceindividualsearchbtn);
		Explicitwait(w.Weeklyattendanceindividualallchkbox);
		Selectcheckbox(w.Weeklyattendanceindividualallchkbox);
		Thread.sleep(1000);
		ScrolldownElement(w.Weeklyattendanceindividualshowbtn);
		Thread.sleep(1000);
		clickjavascript(w.Weeklyattendanceindividualshowbtn);

	}

	@Then("User need to verify the reports whether it is generating or not in designation reports for the particular designation")
	public void user_need_to_verify_the_reports_whether_it_is_generating_or_not_in_designation_reports_for_the_particular_designation() throws InterruptedException {
		w=new WeeklyAttendanceReport_POJO();
		SoftAssert softAssert = new SoftAssert();
		//designation verification 
		Thread.sleep(2000);
		w=new WeeklyAttendanceReport_POJO();	


		try
		{
			driver.switchTo().frame(0);
		}
		catch(NoSuchFrameException e)
		{
			System.out.println(e.getMessage());
		}


		String Exp1 = "GENERAL MANAGER";

		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.elementToBeClickable(w.Weeklyattendanceonedesignationverification));
		highLightElement(w.Weeklyattendanceonedesignationverification);


		WebElement individualVerfication = driver.findElement(By.xpath("//a[contains(.,'GENERAL MANAGER')]"));
		String FirstActual1 = individualVerfication.getText();

		System.out.println("Expected1: " + Exp1 + " Actual: " + FirstActual1);

		softAssert.assertEquals(Exp1, FirstActual1);
		System.out.println(softAssert);
		Scrollupjavascript();
driver.switchTo().defaultContent();
	}


	@Given("User need to check the Category reports for all the Category {string} and {int}")
	public void user_need_to_check_the_category_reports_for_all_the_category_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException, AWTException {
		reader = new ExcelReader();
		w=new WeeklyAttendanceReport_POJO();
		m=new MasterReports_POJO();
		w=new WeeklyAttendanceReport_POJO();
		Explicitwaitvisibility(m.reportsmain);
		tomovethecursor(m.reportsmain);
		explicitWaitClick(w.Weeklyattendancereportmain);
		List<Map<String, String>> data = reader.getData("src/test/resources/Excel File/Test Data.xlsx", SheetName);
		actionssendkeysdelete(w.Weeklyattendancefrom);
		String fromdate = data.get(RowNumber).get("FromDate");
		Thread.sleep(500);
		tofill(w.Weeklyattendancefrom, fromdate);
		totabkey();

		actionssendkeysdelete(w.Weeklyattendanceto);
		String todate = data.get(RowNumber).get("ToDate");
		Thread.sleep(500);
		tofill(w.Weeklyattendanceto, todate);
		totabkey();
		Thread.sleep(2000);
		clickjavascript(w.Weeklyattendancecategoryradiobtn);
		Thread.sleep(500);
		clickjavascript(w.Weeklyattendanceindividualallchkbox);
		Thread.sleep(500);
		ScrolldownElement(w.Weeklyattendanceindividualshowbtn);
		Thread.sleep(500);
		clickjavascript(w.Weeklyattendanceindividualshowbtn);


	}



	@When("User need to verify the reports whether it is generating or not in Category reports for all the Category")
	public void user_need_to_verify_the_reports_whether_it_is_generating_or_not_in_category_reports_for_all_the_category() throws InterruptedException {
		w=new WeeklyAttendanceReport_POJO();
		SoftAssert softAssert = new SoftAssert();
		//category verification 
		Thread.sleep(2000);
		w=new WeeklyAttendanceReport_POJO();	


		try
		{
			driver.switchTo().frame(0);
		}
		catch(NoSuchFrameException e)
		{
			System.out.println(e.getMessage());
		}


		String Exp1 = "Weekly Attendance Report (By Category)";

		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.elementToBeClickable(w.Weeklyattendancecategoryverification));
		highLightElement(w.Weeklyattendancecategoryverification);


		WebElement categoryVerfication = driver.findElement(By.xpath("//span[contains(.,'Weekly Attendance Report (By Category)')]"));
		String FirstActual1 = categoryVerfication.getText();

		System.out.println("Expected1: " + Exp1 + " Actual: " + FirstActual1);

		softAssert.assertEquals(Exp1, FirstActual1);
		System.out.println(softAssert);
		Scrollupjavascript();
		driver.switchTo().defaultContent();

	}
	@And("User need to check the Category reports for the particular Category {string} and {int}")
	public void user_need_to_check_the_category_reports_for_the_particular_category_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException, AWTException {
		reader = new ExcelReader();
		w=new WeeklyAttendanceReport_POJO();
		m=new MasterReports_POJO();
		w=new WeeklyAttendanceReport_POJO();
		
		tomovethecursor(m.reportsmain);
		explicitWaitClick(w.Weeklyattendancereportmain);
		List<Map<String, String>> data = reader.getData("src/test/resources/Excel File/Test Data.xlsx", SheetName);
		actionssendkeysdelete(w.Weeklyattendancefrom);
		String fromdate = data.get(RowNumber).get("FromDate");
		Thread.sleep(500);
		tofill(w.Weeklyattendancefrom, fromdate);
		totabkey();

		actionssendkeysdelete(w.Weeklyattendanceto);
		String todate = data.get(RowNumber).get("ToDate");
		Thread.sleep(500);
		tofill(w.Weeklyattendanceto, todate);
		totabkey();
		Thread.sleep(2000);
		clickjavascript(w.Weeklyattendancecategoryradiobtn);
		Thread.sleep(1000);
		String Searchweekly = data.get(RowNumber).get("Category name");
		tofill(w.Weeklyattendanceindividualsearchbox, Searchweekly);
		Thread.sleep(1000);
		clickjavascript(w.Weeklyattendanceindividualsearchbtn);
		Thread.sleep(1000);
		Selectcheckbox(w.Weeklyattendanceindividualallchkbox);
		Thread.sleep(1000);
		ScrolldownElement(w.Weeklyattendanceindividualshowbtn);
		Thread.sleep(1000);
		clickjavascript(w.Weeklyattendanceindividualshowbtn);

	}


	@Then("User need to verify the reports whether it is generating or not in Category reports for the particular Category")
	public void user_need_to_verify_the_reports_whether_it_is_generating_or_not_in_category_reports_for_the_particular_category() throws InterruptedException {
		w=new WeeklyAttendanceReport_POJO();
		SoftAssert softAssert = new SoftAssert();
		//category verification 
		Thread.sleep(2000);
		w=new WeeklyAttendanceReport_POJO();	


		try
		{
			driver.switchTo().frame(0);
		}
		catch(NoSuchFrameException e)
		{
			System.out.println(e.getMessage());
		}


		String Exp1 = "NON-EXECUTIVE";

		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.elementToBeClickable(w.Weeklyattendanceonecategoryverification));
		highLightElement(w.Weeklyattendanceonecategoryverification);


		WebElement individualVerfication = driver.findElement(By.xpath("//a[contains(.,'NON-EXECUTIVE')]"));
		String FirstActual1 = individualVerfication.getText();

		System.out.println("Expected1: " + Exp1 + " Actual: " + FirstActual1);

		softAssert.assertEquals(Exp1, FirstActual1);
		System.out.println(softAssert);
		Scrollupjavascript();
driver.switchTo().defaultContent();
	}

	@Given("User need to check the Extraclassification reports for all the Extraclassification {string} and {int}")
	public void user_need_to_check_the_extraclassification_reports_for_all_the_extraclassification_and(String SheetName, Integer RowNumber) throws InterruptedException, InvalidFormatException, IOException, AWTException {
		reader = new ExcelReader();
		w=new WeeklyAttendanceReport_POJO();
		m=new MasterReports_POJO();
		w=new WeeklyAttendanceReport_POJO();
		tomovethecursor(m.reportsmain);
		explicitWaitClick(w.Weeklyattendancereportmain);
		List<Map<String, String>> data = reader.getData("src/test/resources/Excel File/Test Data.xlsx", SheetName);
		actionssendkeysdelete(w.Weeklyattendancefrom);
		String fromdate = data.get(RowNumber).get("FromDate");
		Thread.sleep(500);
		tofill(w.Weeklyattendancefrom, fromdate);
		totabkey();

		actionssendkeysdelete(w.Weeklyattendanceto);
		String todate = data.get(RowNumber).get("ToDate");
		Thread.sleep(500);
		tofill(w.Weeklyattendanceto, todate);
		totabkey();
		Thread.sleep(2000);
		clickjavascript(w.Weeklyattendanceextraclassificationradiobtn);
		Thread.sleep(500);
		clickjavascript(w.Weeklyattendanceindividualallchkbox);
		Thread.sleep(500);
		ScrolldownElement(w.Weeklyattendanceindividualshowbtn);
		Thread.sleep(500);
		clickjavascript(w.Weeklyattendanceindividualshowbtn);

	
	}


	@When("User need to verify the reports whether it is generating or not in Extraclassification reports for all the Extraclassification")
	public void user_need_to_verify_the_reports_whether_it_is_generating_or_not_in_extraclassification_reports_for_all_the_extraclassification() throws InterruptedException {
		w=new WeeklyAttendanceReport_POJO();
		SoftAssert softAssert = new SoftAssert();
		//category verification 
		Thread.sleep(2000);
		w=new WeeklyAttendanceReport_POJO();	


		try
		{
			driver.switchTo().frame(0);
		}
		catch(NoSuchFrameException e)
		{
			System.out.println(e.getMessage());
		}


		String Exp1 = "Weekly Attendance Report (By Designation Group)";

		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.elementToBeClickable(w.Weeklyattendanceclassificationverification));
		highLightElement(w.Weeklyattendanceclassificationverification);


		WebElement categoryVerfication = driver.findElement(By.xpath("//span[contains(.,'Weekly Attendance Report (By Designation Group)')]"));
		String FirstActual1 = categoryVerfication.getText();

		System.out.println("Expected1: " + Exp1 + " Actual: " + FirstActual1);

		softAssert.assertEquals(Exp1, FirstActual1);
		System.out.println(softAssert);
		Scrollupjavascript();
		driver.switchTo().defaultContent();
	}
	@And("User need to check the Extraclassification reports for the particular Extraclassification {string} and {int}")
	public void user_need_to_check_the_extraclassification_reports_for_the_particular_extraclassification_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException, AWTException {
		reader = new ExcelReader();
		w=new WeeklyAttendanceReport_POJO();
		m=new MasterReports_POJO();
		w=new WeeklyAttendanceReport_POJO();
		
		tomovethecursor(m.reportsmain);
		explicitWaitClick(w.Weeklyattendancereportmain);
		List<Map<String, String>> data = reader.getData("src/test/resources/Excel File/Test Data.xlsx", SheetName);
		actionssendkeysdelete(w.Weeklyattendancefrom);
		String fromdate = data.get(RowNumber).get("FromDate");
		Thread.sleep(500);
		tofill(w.Weeklyattendancefrom, fromdate);
		totabkey();

		actionssendkeysdelete(w.Weeklyattendanceto);
		String todate = data.get(RowNumber).get("ToDate");
		Thread.sleep(500);
		tofill(w.Weeklyattendanceto, todate);
		totabkey();
		Thread.sleep(2000);
		clickjavascript(w.Weeklyattendanceextraclassificationradiobtn);
		Thread.sleep(1000);
		String Searchweekly = data.get(RowNumber).get("Extra Classification");
		tofill(w.Weeklyattendanceindividualsearchbox, Searchweekly);
		Thread.sleep(1000);
		clickjavascript(w.Weeklyattendanceindividualsearchbtn);
		Thread.sleep(1000);
		Selectcheckbox(w.Weeklyattendanceindividualallchkbox);
		Thread.sleep(1000);
		ScrolldownElement(w.Weeklyattendanceindividualshowbtn);
		Thread.sleep(1000);
		clickjavascript(w.Weeklyattendanceindividualshowbtn);
	
	}
	
	@Then("User need to verify the reports whether it is generating or not in Extraclassification reports for the particular Extraclassification")
	public void user_need_to_verify_the_reports_whether_it_is_generating_or_not_in_extraclassification_reports_for_the_particular_extraclassification() throws InterruptedException {
		w=new WeeklyAttendanceReport_POJO();
		SoftAssert softAssert = new SoftAssert();
		//category verification 
		Thread.sleep(2000);
		w=new WeeklyAttendanceReport_POJO();	


		try
		{
			driver.switchTo().frame(0);
		}
		catch(NoSuchFrameException e)
		{
			System.out.println(e.getMessage());
		}


		String Exp1 = "NONE";

		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.elementToBeClickable(w.Weeklyattendanceoneclassificationverification));
		highLightElement(w.Weeklyattendanceoneclassificationverification);


		WebElement individualVerfication = driver.findElement(By.xpath("(//a[contains(.,'NONE')])[1]"));
		String FirstActual1 = individualVerfication.getText();

		System.out.println("Expected1: " + Exp1 + " Actual: " + FirstActual1);

		softAssert.assertEquals(Exp1, FirstActual1);
		System.out.println(softAssert);
		Scrollupjavascript();
		driver.switchTo().defaultContent();
		closebrowser();
	}






}
