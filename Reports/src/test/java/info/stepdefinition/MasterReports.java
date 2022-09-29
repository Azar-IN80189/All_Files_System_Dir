package info.stepdefinition;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import info.base.Reusableclass;
import info.pojo.Allowancepojo;
import info.pojo.MasterReports_POJO;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MasterReports extends Reusableclass {

	public static Allowancepojo a;
	public static MasterReports_POJO m;




	@Before("@Loginmain")
	public void setup() throws AWTException, InterruptedException {
		a = new Allowancepojo();
		System.out.println(" ****** Login Started *****");

		browserLaunch();
		toMaximize();
		launchUrl("https://staging.info-tech.com.sg/Login.aspx");
		a = new Allowancepojo();
		tofill(a.username, "i1@gmail.com");
		Thread.sleep(500);
		tofill(a.pwd,"Program@2o22");
		toClick(a.click);
		implicitwait();
		toClick(a.ChangeDB);
		toClick(a.DBname);
		tofill(a.DBname, "AZARUDEEN01");
		implicitwait();
		tomovethecursor(driver.findElement(By.xpath("//*[@id=\"tblCustomerList\"]/tr[1]/td/li/a")));
		toClick(driver.findElement(By.xpath("//*[@id=\"tblCustomerList\"]/tr[1]/td/li/a")));

	}
	
	//Company reports

	@Given("User need to enter in to master reports")
	public void user_need_to_enter_in_to_master_reports() {
		a = new Allowancepojo();
		m = new MasterReports_POJO();
		tomovethecursor(m.reportsmain);
		explicitWaitClick(m.Masterreportsmain);


	}

	@Given("User need to check the company reports")
	public void user_need_to_check_the_company_reports() {
		m = new MasterReports_POJO();
		toselectbyvisibletext(m.Dropdownmaster, "Company");
		clickjavascript(m.previewmaster);

	}



	@Then("User need to verify the reports whether it is generating or not in Company")
	public void user_need_to_verify_the_reports_whether_it_is_generating_or_not_in_company() throws InterruptedException {
		m = new MasterReports_POJO();
		SoftAssert softAssert = new SoftAssert();
		//company verification 
		String Exp1 = "Company List";
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.elementToBeClickable(m.Companypdf));
		ScrolldownElement(m.Companypdf);
		highLightElement(m.Companypdf);

		WebElement companyVerfication = driver.findElement(By.xpath("(//div[contains(.,'Company List')])[24]"));
		String FirstActual1 = companyVerfication.getText();

		System.out.println("Expected1: " + Exp1 + " Actual: " + FirstActual1);

		softAssert.assertEquals(Exp1, FirstActual1);
		System.out.println(softAssert);
		Scrollupjavascript();
	}
	//Department reports

	@Given("User need to check the Department reports")
	public void user_need_to_check_the_department_reports() {
		m = new MasterReports_POJO();
		toselectbyvisibletext(m.Dropdownmaster, "Department");
		clickjavascript(m.previewmaster);

	}



	@Then("User need to verify the reports whether it is generating or not in department")
	public void user_need_to_verify_the_reports_whether_it_is_generating_or_not_in_department() throws InterruptedException {
		m = new MasterReports_POJO();
		SoftAssert softAssert = new SoftAssert();
		//company verification 
		String Exp1 = "Department List";
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.elementToBeClickable(m.deptpdf));
		ScrolldownElement(m.deptpdf);
		highLightElement(m.deptpdf);

		WebElement departmentVerfication = driver.findElement(By.xpath("(//div[contains(.,'Department List')])[24]"));
		String FirstActual1 = departmentVerfication.getText();

		System.out.println("Expected1: " + Exp1 + " Actual: " + FirstActual1);

		softAssert.assertEquals(Exp1, FirstActual1);
		System.out.println(softAssert);
		Scrollupjavascript();
	}

	//Section reports

	@Given("User need to check the Section reports")
	public void user_need_to_check_the_section_reports() {
		m = new MasterReports_POJO();
		toselectbyvisibletext(m.Dropdownmaster, "Section");
		clickjavascript(m.previewmaster);

	}



	@Then("User need to verify the reports whether it is generating or not in Section")
	public void user_need_to_verify_the_reports_whether_it_is_generating_or_not_in_section() throws InterruptedException {
		m = new MasterReports_POJO();
		SoftAssert softAssert = new SoftAssert();
		//Section verification 
		String Exp1 = "Section List";
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.elementToBeClickable(m.sectionpdf));
		ScrolldownElement(m.sectionpdf);
		highLightElement(m.sectionpdf);

		WebElement SectionVerfication = driver.findElement(By.xpath("(//div[contains(.,'Section List')])[24]"));
		String FirstActual1 = SectionVerfication.getText();

		System.out.println("Expected1: " + Exp1 + " Actual: " + FirstActual1);

		softAssert.assertEquals(Exp1, FirstActual1);
		System.out.println(softAssert);
		Scrollupjavascript();

	}

	//Designation reports

	@Given("User need to check the Designation reports")
	public void user_need_to_check_the_designation_reports() {
		m = new MasterReports_POJO();
		toselectbyvisibletext(m.Dropdownmaster, "Designation");
		clickjavascript(m.previewmaster);

	}



	@Then("User need to verify the reports whether it is generating or not in Designation")
	public void user_need_to_verify_the_reports_whether_it_is_generating_or_not_in_designation() throws InterruptedException {
		m = new MasterReports_POJO();
		SoftAssert softAssert = new SoftAssert();
		//Designation verification 
		String Exp1 = "Designation List";
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.elementToBeClickable(m.Designationpdf));
		ScrolldownElement(m.Designationpdf);
		highLightElement(m.Designationpdf);

		WebElement DesignationVerfication = driver.findElement(By.xpath("(//div[contains(.,'Designation List')])[24]"));
		String FirstActual1 = DesignationVerfication.getText();

		System.out.println("Expected1: " + Exp1 + " Actual: " + FirstActual1);

		softAssert.assertEquals(Exp1, FirstActual1);
		System.out.println(softAssert);
		Scrollupjavascript();

	}

	//Category reports

	@Given("User need to check the Category reports")
	public void user_need_to_check_the_category_reports() {
		m = new MasterReports_POJO();
		toselectbyvisibletext(m.Dropdownmaster, "Category");
		clickjavascript(m.previewmaster);

	}


	@Then("User need to verify the reports whether it is generating or not in Category")
	public void user_need_to_verify_the_reports_whether_it_is_generating_or_not_in_category() throws InterruptedException {
		m = new MasterReports_POJO();
		SoftAssert softAssert = new SoftAssert();
		//category verification 
		String Exp1 = "Category List";
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.elementToBeClickable(m.Categorypdf));
		ScrolldownElement(m.Categorypdf);
		highLightElement(m.Categorypdf);

		WebElement CategoryVerfication = driver.findElement(By.xpath("(//div[contains(.,'Category List')])[24]"));
		String FirstActual1 = CategoryVerfication.getText();

		System.out.println("Expected1: " + Exp1 + " Actual: " + FirstActual1);

		softAssert.assertEquals(Exp1, FirstActual1);
		System.out.println(softAssert);
		Scrollupjavascript();

	}

	//Leavetype reports

	@Given("User need to check the Leavetype\\(reason) reports")
	public void user_need_to_check_the_leavetype_reason_reports() {
		m = new MasterReports_POJO();
		toselectbyvisibletext(m.Dropdownmaster, "Leave Type (Reason)");
		clickjavascript(m.previewmaster);

	}



	@Then("User need to verify the reports whether it is generating or not in Leavetype\\(reason)")
	public void user_need_to_verify_the_reports_whether_it_is_generating_or_not_in_leavetype_reason() throws InterruptedException {
		m = new MasterReports_POJO();
		SoftAssert softAssert = new SoftAssert();

		//Leavetype verification 

		String Exp1 = "Reason List";
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.elementToBeClickable(m.Leavereasonpdf));
		ScrolldownElement(m.Leavereasonpdf);
		highLightElement(m.Leavereasonpdf);

		WebElement LeavereasonVerfication = driver.findElement(By.xpath("(//div[contains(.,'Reason List')])[24]"));
		String FirstActual1 = LeavereasonVerfication.getText();

		System.out.println("Expected1: " + Exp1 + " Actual: " + FirstActual1);

		softAssert.assertEquals(Exp1, FirstActual1);
		System.out.println(softAssert);
		Scrollupjavascript();

	}

	//Holiday reports

	@Given("User need to check the Holiday reports")
	public void user_need_to_check_the_holiday_reports() {
		m = new MasterReports_POJO();
		toselectbyvisibletext(m.Dropdownmaster, "Holiday");
		clickjavascript(m.previewmaster);

	}


	@Then("User need to verify the reports whether it is generating or not in Holiday")
	public void user_need_to_verify_the_reports_whether_it_is_generating_or_not_in_holiday() throws InterruptedException {
		m = new MasterReports_POJO();
		SoftAssert softAssert = new SoftAssert();
		
		//Holiday verification 
		
		String Exp1 = "Holiday List";
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.elementToBeClickable(m.Holidaypdf));
		ScrolldownElement(m.Holidaypdf);
		highLightElement(m.Holidaypdf);

		WebElement HolidayVerfication = driver.findElement(By.xpath("(//div[contains(.,'Holiday List')])[24]"));
		String FirstActual1 = HolidayVerfication.getText();

		System.out.println("Expected1: " + Exp1 + " Actual: " + FirstActual1);

		softAssert.assertEquals(Exp1, FirstActual1);
		System.out.println(softAssert);
		Scrollupjavascript();

	}

	//Employee reports

	@Given("User need to check the Employee reports")
	public void user_need_to_check_the_employee_reports() {
		m = new MasterReports_POJO();
		toselectbyvisibletext(m.Dropdownmaster, "Employee");
		Explicitwait(m.employeeorderdd);
		toselectbyvisibletext(m.employeeorderdd, "Employee Code");
		clickjavascript(m.previewmaster);

	}



	@Then("User need to verify the reports whether it is generating or not in orderby manner")
	public void user_need_to_verify_the_reports_whether_it_is_generating_or_not_in_orderby_manner() throws InterruptedException {
		m = new MasterReports_POJO();
		SoftAssert softAssert = new SoftAssert();
		
		//Employee code verification 
		
		String Exp1 = "001";
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.elementToBeClickable(m.employeecode001verification));
		ScrolldownElement(m.employeecode001verification);
		highLightElement(m.employeecode001verification);

		WebElement EmployeecodeVerfication = driver.findElement(By.xpath("(//div[contains(.,'001')])[23]"));
		String FirstActual1 = EmployeecodeVerfication.getText();

		System.out.println("Expected1: " + Exp1 + " Actual: " + FirstActual1);

		softAssert.assertEquals(Exp1, FirstActual1);
		System.out.println(softAssert);
		Scrollupjavascript();

		Thread.sleep(2000);

		m = new MasterReports_POJO();
		toselectbyvisibletext(m.Dropdownmaster, "Employee");
		Explicitwait(m.employeeorderdd);
		toselectbyvisibletext(m.employeeorderdd, "Employee Name");
		clickjavascript(m.previewmaster);

		Thread.sleep(2000);
		m = new MasterReports_POJO();
		
		//Employee card verification 
		
		String Exp2 = "001";
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(m.employeecardnoverification));
		ScrolldownElement(m.employeecardnoverification);
		highLightElement(m.employeecardnoverification);

		WebElement EmployeecardVerfication = driver.findElement(By.xpath("(//div[contains(.,'001')])[24]"));
		String FirstActual2 = EmployeecardVerfication.getText();

		System.out.println("Expected1: " + Exp2 + " Actual: " + FirstActual2);

		softAssert.assertEquals(Exp2, FirstActual2);
		System.out.println(softAssert);
		Scrollupjavascript();


		Thread.sleep(2000);

		m = new MasterReports_POJO();
		toselectbyvisibletext(m.Dropdownmaster, "Employee");
		Explicitwait(m.employeeorderdd);
		toselectbyvisibletext(m.employeeorderdd, "Card No");
		clickjavascript(m.previewmaster);

		Thread.sleep(2000);
		m = new MasterReports_POJO();
		//Employee verification 
		String Exp3 = "CHONG KEEN WAI";
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(m.employeenameverification));
		ScrolldownElement(m.employeenameverification);
		highLightElement(m.employeenameverification);

		WebElement EmployeenameVerfication = driver.findElement(By.xpath("(//div[contains(.,'CHONG KEEN WAI')])[23]"));
		String FirstActual3 = EmployeenameVerfication.getText();

		System.out.println("Expected1: " + Exp3 + " Actual: " + FirstActual3);

		softAssert.assertEquals(Exp3, FirstActual3);
		System.out.println(softAssert);
		Scrollupjavascript();


		Thread.sleep(2000);

		m = new MasterReports_POJO();
		toselectbyvisibletext(m.Dropdownmaster, "Employee");
		Explicitwait(m.employeeorderdd);
		toselectbyvisibletext(m.employeeorderdd, "Join Date");
		clickjavascript(m.previewmaster);

		Thread.sleep(2000);
		m = new MasterReports_POJO();
		
		//Employee date verification 
		
		String Exp4 = "14-07-2014";
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(m.employeejoindateverification));
		ScrolldownElement(m.employeejoindateverification);
		highLightElement(m.employeejoindateverification);

		WebElement EmployeedateVerfication = driver.findElement(By.xpath("(//div[contains(.,'14-07-2014')])[23]"));
		String FirstActual4 = EmployeedateVerfication.getText();

		System.out.println("Expected1: " + Exp4 + " Actual: " + FirstActual4);

		softAssert.assertEquals(Exp4, FirstActual4);
		System.out.println(softAssert);
		Scrollupjavascript();

		Thread.sleep(2000);

		m = new MasterReports_POJO();
		toselectbyvisibletext(m.Dropdownmaster, "Employee");
		Explicitwait(m.employeeorderdd);
		toselectbyvisibletext(m.employeeorderdd, "Department");
		clickjavascript(m.previewmaster);

		Thread.sleep(2000);
		m = new MasterReports_POJO();
		
		//Employee Department verification 
		
		String Exp5 = "ADMIN";
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(m.employeedepartmentverification));
		ScrolldownElement(m.employeedepartmentverification);
		highLightElement(m.employeedepartmentverification);

		WebElement EmployeeDeptVerfication = driver.findElement(By.xpath("(//div[contains(.,'ADMIN')])[23]"));
		String FirstActual5 = EmployeeDeptVerfication.getText();

		System.out.println("Expected1: " + Exp5 + " Actual: " + FirstActual5);

		softAssert.assertEquals(Exp5, FirstActual5);
		System.out.println(softAssert);
		Scrollupjavascript();

		Thread.sleep(2000);

		m = new MasterReports_POJO();
		toselectbyvisibletext(m.Dropdownmaster, "Employee");
		Explicitwait(m.employeeorderdd);
		toselectbyvisibletext(m.employeeorderdd, "Designation");
		clickjavascript(m.previewmaster);

		Thread.sleep(2000);
		m = new MasterReports_POJO();
		
		//Employee Designation verification 
		
		String Exp6 = "BUSINESS MANAGER";
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(m.employeedesignationverification));
		ScrolldownElement(m.employeedesignationverification);
		highLightElement(m.employeedesignationverification);

		WebElement EmployeeDesignationVerfication = driver.findElement(By.xpath("(//div[contains(.,'BUSINESS MANAGER')])[23]"));
		String FirstActual6 = EmployeeDesignationVerfication.getText();

		System.out.println("Expected1: " + Exp6 + " Actual: " + FirstActual6);

		softAssert.assertEquals(Exp6, FirstActual6);
		System.out.println(softAssert);
		Scrollupjavascript();

		Thread.sleep(2000);

		m = new MasterReports_POJO();
		toselectbyvisibletext(m.Dropdownmaster, "Employee");
		Explicitwait(m.employeeorderdd);
		toselectbyvisibletext(m.employeeorderdd, "Shift");
		clickjavascript(m.previewmaster);

		Thread.sleep(2000);
		m = new MasterReports_POJO();
		
		//Employee Shift verification 
		
		String Exp7 = "01";
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(m.employeeshiftverification));
		ScrolldownElement(m.employeeshiftverification);
		highLightElement(m.employeeshiftverification);

		WebElement EmployeeshiftVerfication = driver.findElement(By.xpath("(//div[contains(.,'01')])[25]"));
		String FirstActual7 = EmployeeshiftVerfication.getText();

		System.out.println("Expected1: " + Exp7 + " Actual: " + FirstActual7);

		softAssert.assertEquals(Exp7, FirstActual7);
		System.out.println(softAssert);
		Scrollupjavascript();

	}

	//Allowance reports

	@Given("User need to check the Allowance reports")
	public void user_need_to_check_the_allowance_reports() {
		m = new MasterReports_POJO();
		toselectbyvisibletext(m.Dropdownmaster, "Allowance");
		clickjavascript(m.previewmaster);

	}



	@Then("User need to verify the reports whether it is generating or not in Allowance")
	public void user_need_to_verify_the_reports_whether_it_is_generating_or_not_in_allowance() throws InterruptedException {
		//Allowance  verification 
		SoftAssert softAssert = new SoftAssert();
		m = new MasterReports_POJO();
				String Exp1 = "Allowance List";
				Thread.sleep(3000);
				WebDriverWait wait = new WebDriverWait(driver, 100);
				wait.until(ExpectedConditions.elementToBeClickable(m.employeeallowanceverification));
				ScrolldownElement(m.employeeallowanceverification);
				highLightElement(m.employeeallowanceverification);

				WebElement allowanceVerfication = driver.findElement(By.xpath("(//div[contains(.,'Allowance List')])[24]"));
				String FirstActual1 = allowanceVerfication.getText();

				System.out.println("Expected1: " + Exp1 + " Actual: " + FirstActual1);

				softAssert.assertEquals(Exp1, FirstActual1);
				System.out.println(softAssert);
				Scrollupjavascript();

	}

	//Autoshift reports

	@Given("User need to check the Autoshift reports")
	public void user_need_to_check_the_autoshift_reports() {
		m = new MasterReports_POJO();
		toselectbyvisibletext(m.Dropdownmaster, "Auto Shift");
		clickjavascript(m.previewmaster);

	}



	@Then("User need to verify the reports whether it is generating or not in Autoshift")
	public void user_need_to_verify_the_reports_whether_it_is_generating_or_not_in_autoshift() throws InterruptedException {
		//Autoshift  verification 
		SoftAssert softAssert = new SoftAssert();
		m = new MasterReports_POJO();
				String Exp1 = "Auto Shifts";
				Thread.sleep(3000);
				WebDriverWait wait = new WebDriverWait(driver, 100);
				wait.until(ExpectedConditions.elementToBeClickable(m.employeeautoshiftverification));
				ScrolldownElement(m.employeeautoshiftverification);
				highLightElement(m.employeeautoshiftverification);

				WebElement allowanceVerfication = driver.findElement(By.xpath("(//div[contains(.,'Auto Shifts')])[24]"));
				String FirstActual1 = allowanceVerfication.getText();

				System.out.println("Expected1: " + Exp1 + " Actual: " + FirstActual1);

				softAssert.assertEquals(Exp1, FirstActual1);
				System.out.println(softAssert);
				Scrollupjavascript();

	}

	//Dutyroster reports

	@Given("User need to check the Dutyroster reports")
	public void user_need_to_check_the_dutyroster_reports() {
		m = new MasterReports_POJO();
		toselectbyvisibletext(m.Dropdownmaster, "Duty Roster");
		clickjavascript(m.previewmaster);

	}



	@Then("User need to verify the reports whether it is generating or not in Dutyroster")
	public void user_need_to_verify_the_reports_whether_it_is_generating_or_not_in_dutyroster() throws InterruptedException {
		//Dutyroster  verification 
		SoftAssert softAssert = new SoftAssert();
		m = new MasterReports_POJO();
				String Exp1 = "Duty Rosters";
				Thread.sleep(3000);
				WebDriverWait wait = new WebDriverWait(driver, 100);
				wait.until(ExpectedConditions.elementToBeClickable(m.employeeDutyRostersverification));
				ScrolldownElement(m.employeeDutyRostersverification);
				highLightElement(m.employeeDutyRostersverification);

				WebElement allowanceVerfication = driver.findElement(By.xpath("(//div[contains(.,'Duty Rosters')])[24]"));
				String FirstActual1 = allowanceVerfication.getText();

				System.out.println("Expected1: " + Exp1 + " Actual: " + FirstActual1);

				softAssert.assertEquals(Exp1, FirstActual1);
				System.out.println(softAssert);
				Scrollupjavascript();

	}

	//Location reports

	@Given("User need to check the Location reports")
	public void user_need_to_check_the_location_reports() {
		m = new MasterReports_POJO();
		toselectbyvisibletext(m.Dropdownmaster, "Location");
		clickjavascript(m.previewmaster);

	}


	@Then("User need to verify the reports whether it is generating or not in Location")
	public void user_need_to_verify_the_reports_whether_it_is_generating_or_not_in_location() throws InterruptedException {
		//Location  verification 
				SoftAssert softAssert = new SoftAssert();
				m = new MasterReports_POJO();
						String Exp1 = "Locations";
						Thread.sleep(3000);
						WebDriverWait wait = new WebDriverWait(driver, 100);
						wait.until(ExpectedConditions.elementToBeClickable(m.employeelocationverification));
						ScrolldownElement(m.employeelocationverification);
						highLightElement(m.employeelocationverification);

						WebElement allowanceVerfication = driver.findElement(By.xpath("(//div[contains(.,'Locations')])[24]"));
						String FirstActual1 = allowanceVerfication.getText();

						System.out.println("Expected1: " + Exp1 + " Actual: " + FirstActual1);

						softAssert.assertEquals(Exp1, FirstActual1);
						System.out.println(softAssert);
						Scrollupjavascript();


	}

	//Shift reports
	@Given("User need to check the Shift reports")
	public void user_need_to_check_the_shift_reports() {
		m = new MasterReports_POJO();
		toselectbyvisibletext(m.Dropdownmaster, "Shift");
		Explicitwait(m.Shiftdd);
		toselectbyvisibletext(m.Shiftdd, "ALL");
		clickjavascript(m.previewmaster);

	}


	@Then("User need to verify the reports whether it is generating or not in shift wise")
	public void user_need_to_verify_the_reports_whether_it_is_generating_or_not_in_shift_wise() throws InterruptedException {
		m = new MasterReports_POJO();
		SoftAssert softAssert = new SoftAssert();
		
		//Shift verification 
		
		String Exp1 = "Working Hours";
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.elementToBeClickable(m.employeeshiftallverification));
		ScrolldownElement(m.employeeshiftallverification);
		highLightElement(m.employeeshiftallverification);

		WebElement EmployeeshiftVerfication = driver.findElement(By.xpath("(//div[contains(.,'Working Hours')])[24]"));
		String FirstActual1 = EmployeeshiftVerfication.getText();

		System.out.println("Expected1: " + Exp1 + " Actual: " + FirstActual1);

		softAssert.assertEquals(Exp1, FirstActual1);
		System.out.println(softAssert);
		Scrollupjavascript();

closebrowser();
	}




}
