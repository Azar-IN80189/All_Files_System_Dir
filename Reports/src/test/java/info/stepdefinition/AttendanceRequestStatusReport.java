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
import info.pojo.AttendanceRequestStatusReport_POJO;
import info.pojo.ClockLocationDifferenceReport_POJO;
import info.pojo.ExceptionReport_POJO;
import info.pojo.MasterReports_POJO;
import info.pojo.WeeklyAttendanceReport_POJO;
import info.utilities.ExcelReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AttendanceRequestStatusReport extends Reusableclass {
	public static Allowancepojo a;
	public static MasterReports_POJO m;
	public static ExcelReader reader;
	public static WeeklyAttendanceReport_POJO w;
	public static ExceptionReport_POJO x;
	public static ClockLocationDifferenceReport_POJO c;
	public static AttendanceRequestStatusReport_POJO r;
	@Given("User need to enter Attendance request status Report")
	public void user_need_to_enter_attendance_request_status_report() {
		c =new ClockLocationDifferenceReport_POJO();
		x =new ExceptionReport_POJO();
		r=new AttendanceRequestStatusReport_POJO();
		tomovethecursor(x.reportsmain);
		mouseclick(r.ARSRmain);
	
	}

	@And("Generate report for the ARSR individual report {string} and {int}")
	public void generate_report_for_the_arsr_individual_report_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException, AWTException {
		r=new AttendanceRequestStatusReport_POJO();
		x =new ExceptionReport_POJO();
		c =new ClockLocationDifferenceReport_POJO();
		reader = new ExcelReader();
		Thread.sleep(2000);
		List<Map<String, String>> data = reader.getData("src/test/resources/Excel File/Test Data.xlsx", SheetName);
		actionssendkeysdelete(r.arsrfromdate);
		String fromdate = data.get(RowNumber).get("FromDate");
		Thread.sleep(500);
		tofill(r.arsrfromdate, fromdate);
		totabkey();
		
		actionssendkeysdelete(r.arsrtodate);
		String todate = data.get(RowNumber).get("ToDate");
		Thread.sleep(500);
		tofill(r.arsrtodate, todate);
		totabkey();
		
		Selectcheckbox(r.arsrspendingchkbox);
		Selectcheckbox(r.arsrsapprovedchkbox);
		Selectcheckbox(r.arsrsrejectedchkbox);
		Selectcheckbox(r.arsrscancelledchkbox);
		Thread.sleep(2000);
		toClick(r.arsrIndividualrdobtn);
		Thread.sleep(2000);
		explicitWaitClick(r.arsrallchkbox);
		ScrolldownElement(r.arsrshowbtn);
		clickjavascript(r.arsrshowbtn);
		
		Thread.sleep(2000);
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


		String Exp1 = "Attendance Request Status Report (Individual)";

		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.elementToBeClickable(r.arsrsindividualverification));
		highLightElement(r.arsrsindividualverification);


		WebElement individualVerfication = driver.findElement(By.xpath("//span[contains(.,'Attendance Request Status Report (Individual)')]"));
		String FirstActual1 = individualVerfication.getText();

		System.out.println("Expected1: " + Exp1 + " Actual: " + FirstActual1);

		softAssert.assertEquals(Exp1, FirstActual1);
		System.out.println(softAssert);
		Scrollupjavascript();
		driver.switchTo().defaultContent();
		explicitWaitClick(r.arsrreportexitbtn);
		
	}
	
	@When("Generate report for the ARSR Department report {string} and {int}")
	public void generate_report_for_the_arsr_department_report_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException, AWTException {
		r=new AttendanceRequestStatusReport_POJO();
		x =new ExceptionReport_POJO();
		c =new ClockLocationDifferenceReport_POJO();
		reader = new ExcelReader();
		List<Map<String, String>> data = reader.getData("src/test/resources/Excel File/Test Data.xlsx", SheetName);
		actionssendkeysdelete(r.arsrfromdate);
		String fromdate = data.get(RowNumber).get("FromDate");
		Thread.sleep(500);
		tofill(r.arsrfromdate, fromdate);
		totabkey();
		
		actionssendkeysdelete(r.arsrtodate);
		String todate = data.get(RowNumber).get("ToDate");
		Thread.sleep(500);
		tofill(r.arsrtodate, todate);
		totabkey();
		Thread.sleep(2000);
		toClick(r.arsrDepartmentrdobtn);
		Thread.sleep(2000);
		explicitWaitClick(r.arsrallchkbox);
		ScrolldownElement(r.arsrshowbtn);
		clickjavascript(r.arsrshowbtn);
		
		Thread.sleep(2000);
		//Dept verification 
				Thread.sleep(2000);
				SoftAssert softAssert = new SoftAssert();


				try
				{
					driver.switchTo().frame(0);
				}
				catch(NoSuchFrameException e)
				{
					System.out.println(e.getMessage());
				}


				String Exp1 = "Attendance Request Status Report (Department)";

				WebDriverWait wait = new WebDriverWait(driver, 100);
				wait.until(ExpectedConditions.elementToBeClickable(r.arsrsdeptverification));
				highLightElement(r.arsrsdeptverification);


				WebElement individualVerfication = driver.findElement(By.xpath("//span[contains(.,'Attendance Request Status Report (Department)')]"));
				String FirstActual1 = individualVerfication.getText();

				System.out.println("Expected1: " + Exp1 + " Actual: " + FirstActual1);

				softAssert.assertEquals(Exp1, FirstActual1);
				System.out.println(softAssert);
				Scrollupjavascript();
				driver.switchTo().defaultContent();
				explicitWaitClick(r.arsrreportexitbtn);
	
	}
	
	@Then("Generate report for the ARSR Section report {string} and {int}")
	public void generate_report_for_the_arsr_section_report_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException, AWTException {
		r=new AttendanceRequestStatusReport_POJO();
		x =new ExceptionReport_POJO();
		c =new ClockLocationDifferenceReport_POJO();
		reader = new ExcelReader();
		List<Map<String, String>> data = reader.getData("src/test/resources/Excel File/Test Data.xlsx", SheetName);
		actionssendkeysdelete(r.arsrfromdate);
		String fromdate = data.get(RowNumber).get("FromDate");
		Thread.sleep(500);
		tofill(r.arsrfromdate, fromdate);
		totabkey();
		
		actionssendkeysdelete(r.arsrtodate);
		String todate = data.get(RowNumber).get("ToDate");
		Thread.sleep(500);
		tofill(r.arsrtodate, todate);
		totabkey();
		Thread.sleep(2000);
		toClick(r.arsrSectionrdobtn);
		Thread.sleep(2000);
		String Deptsection = data.get(RowNumber).get("Department name");
		actionssendkeysdelete(r.arsrsectiondeptdd);
		tofill(r.arsrsectiondeptdd, Deptsection);
		explicitWaitClick(r.arsrallchkbox);
		ScrolldownElement(r.arsrshowbtn);
		clickjavascript(r.arsrshowbtn);
		
		Thread.sleep(2000);
		//Section verification 
		Thread.sleep(2000);
		SoftAssert softAssert = new SoftAssert();


		try
		{
			driver.switchTo().frame(0);
		}
		catch(NoSuchFrameException e)
		{
			System.out.println(e.getMessage());
		}


		String Exp1 = "Attendance Request Status Report (Section)";

		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.elementToBeClickable(r.arsrssectionverification));
		highLightElement(r.arsrssectionverification);


		WebElement individualVerfication = driver.findElement(By.xpath("//span[contains(.,'Attendance Request Status Report (Section)')]"));
		String FirstActual1 = individualVerfication.getText();

		System.out.println("Expected1: " + Exp1 + " Actual: " + FirstActual1);

		softAssert.assertEquals(Exp1, FirstActual1);
		System.out.println(softAssert);
		Scrollupjavascript();
		driver.switchTo().defaultContent();
		explicitWaitClick(r.arsrreportexitbtn);
	}
	
	@When("Generate report for the ARSR Designation report {string} and {int}")
	public void generate_report_for_the_arsr_designation_report_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException, AWTException {
		r=new AttendanceRequestStatusReport_POJO();
		x =new ExceptionReport_POJO();
		c =new ClockLocationDifferenceReport_POJO();
		reader = new ExcelReader();
		List<Map<String, String>> data = reader.getData("src/test/resources/Excel File/Test Data.xlsx", SheetName);
		actionssendkeysdelete(r.arsrfromdate);
		String fromdate = data.get(RowNumber).get("FromDate");
		Thread.sleep(500);
		tofill(r.arsrfromdate, fromdate);
		totabkey();
		
		actionssendkeysdelete(r.arsrtodate);
		String todate = data.get(RowNumber).get("ToDate");
		Thread.sleep(500);
		tofill(r.arsrtodate, todate);
		totabkey();
		Thread.sleep(2000);
		toClick(r.arsrdesignationrdobtn);
		Thread.sleep(2000);
		explicitWaitClick(r.arsrallchkbox);
		ScrolldownElement(r.arsrshowbtn);
		clickjavascript(r.arsrshowbtn);
		
		Thread.sleep(2000);
		//Designation verification 
				Thread.sleep(2000);
				SoftAssert softAssert = new SoftAssert();


				try
				{
					driver.switchTo().frame(0);
				}
				catch(NoSuchFrameException e)
				{
					System.out.println(e.getMessage());
				}


				String Exp1 = "Attendance Request Status Report (Designation)";

				WebDriverWait wait = new WebDriverWait(driver, 100);
				wait.until(ExpectedConditions.elementToBeClickable(r.arsrsdesignationverification));
				highLightElement(r.arsrsdesignationverification);


				WebElement individualVerfication = driver.findElement(By.xpath("//span[contains(.,'Attendance Request Status Report (Designation)')]"));
				String FirstActual1 = individualVerfication.getText();

				System.out.println("Expected1: " + Exp1 + " Actual: " + FirstActual1);

				softAssert.assertEquals(Exp1, FirstActual1);
				System.out.println(softAssert);
				Scrollupjavascript();
				driver.switchTo().defaultContent();
				explicitWaitClick(r.arsrreportexitbtn);
	
	}
	
	@When("Generate report for the ARSR Category report {string} and {int}")
	public void generate_report_for_the_arsr_category_report_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException, AWTException {
		r=new AttendanceRequestStatusReport_POJO();
		x =new ExceptionReport_POJO();
		c =new ClockLocationDifferenceReport_POJO();
		reader = new ExcelReader();
		List<Map<String, String>> data = reader.getData("src/test/resources/Excel File/Test Data.xlsx", SheetName);
		actionssendkeysdelete(r.arsrfromdate);
		String fromdate = data.get(RowNumber).get("FromDate");
		Thread.sleep(500);
		tofill(r.arsrfromdate, fromdate);
		totabkey();
		
		actionssendkeysdelete(r.arsrtodate);
		String todate = data.get(RowNumber).get("ToDate");
		Thread.sleep(500);
		tofill(r.arsrtodate, todate);
		totabkey();
		Thread.sleep(2000);
		toClick(r.arsrcategoryrdobtn);
		Thread.sleep(2000);
		explicitWaitClick(r.arsrallchkbox);
		ScrolldownElement(r.arsrshowbtn);
		clickjavascript(r.arsrshowbtn);
		
		Thread.sleep(2000);
		//Category verification 
		Thread.sleep(2000);
		SoftAssert softAssert = new SoftAssert();


		try
		{
			driver.switchTo().frame(0);
		}
		catch(NoSuchFrameException e)
		{
			System.out.println(e.getMessage());
		}


		String Exp1 = "Attendance Request Status Report (Category)";

		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.elementToBeClickable(r.arsrscategoryverification));
		highLightElement(r.arsrscategoryverification);


		WebElement individualVerfication = driver.findElement(By.xpath("//span[contains(.,'Attendance Request Status Report (Category)')]"));
		String FirstActual1 = individualVerfication.getText();

		System.out.println("Expected1: " + Exp1 + " Actual: " + FirstActual1);

		softAssert.assertEquals(Exp1, FirstActual1);
		System.out.println(softAssert);
		Scrollupjavascript();
		driver.switchTo().defaultContent();
		explicitWaitClick(r.arsrreportexitbtn);
	
	}
	
	@Then("Generate report for the ARSR Destination group report {string} and {int}")
	public void generate_report_for_the_arsr_destination_group_report_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException, AWTException {
		r=new AttendanceRequestStatusReport_POJO();
		x =new ExceptionReport_POJO();
		c =new ClockLocationDifferenceReport_POJO();
		reader = new ExcelReader();
		List<Map<String, String>> data = reader.getData("src/test/resources/Excel File/Test Data.xlsx", SheetName);
		actionssendkeysdelete(r.arsrfromdate);
		String fromdate = data.get(RowNumber).get("FromDate");
		Thread.sleep(500);
		tofill(r.arsrfromdate, fromdate);
		totabkey();
		
		actionssendkeysdelete(r.arsrtodate);
		String todate = data.get(RowNumber).get("ToDate");
		Thread.sleep(500);
		tofill(r.arsrtodate, todate);
		totabkey();
		Thread.sleep(2000);
		toClick(r.arsrextraclassificationrdobtn);
		Thread.sleep(2000);
		explicitWaitClick(r.arsrallchkbox);
		ScrolldownElement(r.arsrshowbtn);
		clickjavascript(r.arsrshowbtn);
		
		Thread.sleep(2000);
		//Extra classification verification 
				Thread.sleep(2000);
				SoftAssert softAssert = new SoftAssert();


				try
				{
					driver.switchTo().frame(0);
				}
				catch(NoSuchFrameException e)
				{
					System.out.println(e.getMessage());
				}


				String Exp1 = "Attendance Request Status Report (Extra Classification)";

				WebDriverWait wait = new WebDriverWait(driver, 100);
				wait.until(ExpectedConditions.elementToBeClickable(r.arsrsextraclassificationverification));
				highLightElement(r.arsrsextraclassificationverification);


				WebElement individualVerfication = driver.findElement(By.xpath("//span[contains(.,'Attendance Request Status Report (Extra Classification)')]"));
				String FirstActual1 = individualVerfication.getText();

				System.out.println("Expected1: " + Exp1 + " Actual: " + FirstActual1);

				softAssert.assertEquals(Exp1, FirstActual1);
				System.out.println(softAssert);
				Scrollupjavascript();
				driver.switchTo().defaultContent();
				explicitWaitClick(r.arsrreportexitbtn);
	
	}



}
