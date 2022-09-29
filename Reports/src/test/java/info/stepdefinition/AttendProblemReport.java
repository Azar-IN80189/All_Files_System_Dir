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
import info.pojo.AttendProblemReport_POJO;
import info.pojo.ExceptionReport_POJO;
import info.pojo.MasterReports_POJO;
import info.pojo.WeeklyAttendanceReport_POJO;
import info.utilities.ExcelReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AttendProblemReport extends Reusableclass {
	public static Allowancepojo a;
	public static MasterReports_POJO m;
	public static ExcelReader reader;
	public static WeeklyAttendanceReport_POJO w;
	public static ExceptionReport_POJO x;
	public static AttendProblemReport_POJO p;

	@Given("User need to enter Attnd prob reports")
	public void user_need_to_enter_attnd_prob_reports() {
		p =new AttendProblemReport_POJO();
		tomovethecursor(p.reportsmain);
		mouseclick(p.attendprobmain);


	}



	@And("User entered generate report for the individual report {string} and {int}")
	public void user_entered_generate_report_for_the_individual_report_and(String SheetName, Integer RowNumber) throws InterruptedException, AWTException, InvalidFormatException, IOException {
		p =new AttendProblemReport_POJO();
		reader = new ExcelReader();
		List<Map<String, String>> data = reader.getData("src/test/resources/Excel File/Test Data.xlsx", SheetName);
		p =new AttendProblemReport_POJO();
		actionssendkeysdelete(p.attendprobfromdate);
		String fromdate = data.get(RowNumber).get("FromDate");
		Thread.sleep(500);
		tofill(p.attendprobfromdate, fromdate);
		totabkey();

		actionssendkeysdelete(p.attendprobtodate);
		String todate = data.get(RowNumber).get("ToDate");
		Thread.sleep(500);
		tofill(p.attendprobtodate, todate);
		totabkey();

		clickjavascript(p.attendIndividualrdobtn);
		Thread.sleep(1000);
		String Searchemp = data.get(RowNumber).get("Employeename");
		tofill(p.attendIndividualsearchbox, Searchemp);
		toClick(p.attendallchkbox);
		Thread.sleep(1000);
		clickjavascript(p.attendIndividualsearchbtn);
		ScrolldownElement(p.attendshowbtn);
		clickjavascript(p.attendshowbtn);

		SoftAssert softAssert = new SoftAssert();
		//Individual 1 employee verification 
		Thread.sleep(2000);
		p =new AttendProblemReport_POJO();	


		try
		{
			driver.switchTo().frame(0);
		}
		catch(NoSuchFrameException e)
		{
			System.out.println(e.getMessage());
		}


		String Exp1 = "Attendance Problem Report (Individual)";

		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.elementToBeClickable(p.attendindividualverification));
		highLightElement(p.attendindividualverification);


		WebElement individualVerfication = driver.findElement(By.xpath("//span[contains(.,'Attendance Problem Report (Individual)')]"));
		String FirstActual1 = individualVerfication.getText();

		System.out.println("Expected1: " + Exp1 + " Actual: " + FirstActual1);

		softAssert.assertEquals(Exp1, FirstActual1);
		System.out.println(softAssert);
		Scrollupjavascript();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		explicitWaitClick(p.attendreportexitbtn);
		actionssendkeysdelete(p.attendIndividualsearchbox);
		clickjavascript(p.attendIndividualsearchbtn);
		ScrolldownElement(p.attendshowbtn);
		clickjavascript(p.attendshowbtn);


		//Individual all employee verification 
		Thread.sleep(2000);
		p =new AttendProblemReport_POJO();	


		try
		{
			driver.switchTo().frame(0);
		}
		catch(NoSuchFrameException e)
		{
			System.out.println(e.getMessage());
		}


		String Exp2 = "Attendance Problem Report (Individual)";

		WebDriverWait wait1 = new WebDriverWait(driver, 100);
		wait1.until(ExpectedConditions.elementToBeClickable(p.attendindividualverification));
		highLightElement(p.attendindividualverification);


		WebElement individualVerficationall = driver.findElement(By.xpath("//span[contains(.,'Attendance Problem Report (Individual)')]"));
		String FirstActual2 = individualVerficationall.getText();

		System.out.println("Expected1: " + Exp2 + " Actual: " + FirstActual2);

		softAssert.assertEquals(Exp2, FirstActual2);
		System.out.println(softAssert);
		Scrollupjavascript();
		driver.switchTo().defaultContent();

		Thread.sleep(3000);
		explicitWaitClick(p.attendreportexitbtn);



	}

	@When("User entered generate report for the Department report {string} and {int}")
	public void user_entered_generate_report_for_the_department_report_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException, AWTException {
		reader = new ExcelReader();
		m=new MasterReports_POJO();
		w=new WeeklyAttendanceReport_POJO();
		p =new AttendProblemReport_POJO();
		tomovethecursor(m.reportsmain);
		explicitWaitClick(p.attendprobmain);
		List<Map<String, String>> data = reader.getData("src/test/resources/Excel File/Test Data.xlsx", SheetName);
		actionssendkeysdelete(p.attendprobfromdate);
		String fromdate = data.get(RowNumber).get("FromDate");
		Thread.sleep(500);
		tofill(p.attendprobfromdate, fromdate);
		totabkey();

		actionssendkeysdelete(p.attendprobtodate);
		String todate = data.get(RowNumber).get("ToDate");
		Thread.sleep(500);
		tofill(p.attendprobtodate, todate);
		totabkey();
		Thread.sleep(3000);
		clickjavascript(p.attendDepartmentrdobtn);
		Thread.sleep(1500);
		clickjavascript(p.attendallchkbox);
		Thread.sleep(500);
		ScrolldownElement(p.attendshowbtn);
		Thread.sleep(500);
		clickjavascript(p.attendshowbtn);
		w=new WeeklyAttendanceReport_POJO();
		p =new AttendProblemReport_POJO();
		SoftAssert softAssert = new SoftAssert();

		//department verification 

		Thread.sleep(2000);

		p =new AttendProblemReport_POJO();	


		try
		{
			driver.switchTo().frame(0);
		}
		catch(NoSuchFrameException e)
		{
			System.out.println(e.getMessage());
		}


		String Exp1 = "Attendance Problem Report (Department)";

		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.elementToBeClickable(p.attenddeptverification));
		highLightElement(p.attenddeptverification);


		WebElement deptVerfication = driver.findElement(By.xpath("//span[contains(.,'Attendance Problem Report (Department)')]"));
		String FirstActual1 = deptVerfication.getText();

		System.out.println("Expected1: " + Exp1 + " Actual: " + FirstActual1);

		softAssert.assertEquals(Exp1, FirstActual1);
		System.out.println(softAssert);
		Scrollupjavascript();
		driver.switchTo().defaultContent();

		Thread.sleep(3000);
		explicitWaitClick(p.attendreportexitbtn);

	}

	@Then("User entered generate report for the Section report {string} and {int}")
	public void user_entered_generate_report_for_the_section_report_and(String SheetName, Integer RowNumber) throws InterruptedException, InvalidFormatException, IOException, AWTException {
		reader = new ExcelReader();
		w=new WeeklyAttendanceReport_POJO();
		m=new MasterReports_POJO();
		w=new WeeklyAttendanceReport_POJO();
		p =new AttendProblemReport_POJO();
		Thread.sleep(2000);
		tomovethecursor(m.reportsmain);
		explicitWaitClick(p.attendprobmain);
		List<Map<String, String>> data = reader.getData("src/test/resources/Excel File/Test Data.xlsx", SheetName);
		actionssendkeysdelete(p.attendprobfromdate);
		String fromdate = data.get(RowNumber).get("FromDate");
		Thread.sleep(500);
		tofill(p.attendprobfromdate, fromdate);
		totabkey();

		actionssendkeysdelete(p.attendprobtodate);
		String todate = data.get(RowNumber).get("ToDate");
		Thread.sleep(500);
		tofill(p.attendprobtodate, todate);
		totabkey();
		Thread.sleep(2000);
		clickjavascript(p.attendSectionrdobtn);
		Thread.sleep(2000);
		actionssendkeysdelete(p.attendsectiondeptdd);
		String deptddattnd = data.get(RowNumber).get("Department name");
		tofill(p.attendsectiondeptdd, deptddattnd);
		totabkey();
		Thread.sleep(1000);
		Selectcheckbox(p.attendallchkbox);
		Thread.sleep(1000);
		ScrolldownElement(p.attendshowbtn);
		Thread.sleep(1000);
		clickjavascript(p.attendshowbtn);


		SoftAssert softAssert = new SoftAssert();

		//Section verification 

		Thread.sleep(2000);

		p =new AttendProblemReport_POJO();	


		try
		{
			driver.switchTo().frame(0);
		}
		catch(NoSuchFrameException e)
		{
			System.out.println(e.getMessage());
		}


		String Exp1 = "Attendance Problem Report (Section)";

		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.elementToBeClickable(p.attendsectionverification));
		highLightElement(p.attendsectionverification);


		WebElement deptVerfication = driver.findElement(By.xpath("//span[contains(.,'Attendance Problem Report (Section)')]"));
		String FirstActual1 = deptVerfication.getText();

		System.out.println("Expected1: " + Exp1 + " Actual: " + FirstActual1);

		softAssert.assertEquals(Exp1, FirstActual1);
		System.out.println(softAssert);
		Scrollupjavascript();
		driver.switchTo().defaultContent();

		Thread.sleep(3000);

		explicitWaitClick(p.attendreportexitbtn);


	}

	@When("User entered generate report for the Designation report {string} and {int}")
	public void user_entered_generate_report_for_the_designation_report_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException, AWTException {
		reader = new ExcelReader();
		w=new WeeklyAttendanceReport_POJO();
		m=new MasterReports_POJO();
		w=new WeeklyAttendanceReport_POJO();
		p =new AttendProblemReport_POJO();

		tomovethecursor(m.reportsmain);
		explicitWaitClick(p.attendprobmain);
		List<Map<String, String>> data = reader.getData("src/test/resources/Excel File/Test Data.xlsx", SheetName);
		actionssendkeysdelete(p.attendprobfromdate);
		String fromdate = data.get(RowNumber).get("FromDate");
		Thread.sleep(500);
		tofill(p.attendprobfromdate, fromdate);
		totabkey();

		actionssendkeysdelete(p.attendprobtodate);
		String todate = data.get(RowNumber).get("ToDate");
		Thread.sleep(500);
		tofill(p.attendprobtodate, todate);
		totabkey();
		Thread.sleep(1500);
		clickjavascript(p.attenddesignationrdobtn);
		Thread.sleep(1000);
		Selectcheckbox(p.attendallchkbox);
		Thread.sleep(1000);
		ScrolldownElement(p.attendshowbtn);
		Thread.sleep(1000);
		clickjavascript(p.attendshowbtn);

		SoftAssert softAssert = new SoftAssert();
		Thread.sleep(2000);
		//Designation verification 
		try
		{
			driver.switchTo().frame(0);
		}
		catch(NoSuchFrameException e)
		{
			System.out.println(e.getMessage());
		}
		String Exp1 = "Attendance Problem Report (Designation)";
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.elementToBeClickable(p.attenddesignationverification));
		highLightElement(p.attenddesignationverification);

		WebElement individualVerfication = driver.findElement(By.xpath("//span[contains(.,'Attendance Problem Report (Designation)')]"));
		String FirstActual1 = individualVerfication.getText();

		System.out.println("Expected1: " + Exp1 + " Actual: " + FirstActual1);

		softAssert.assertEquals(Exp1, FirstActual1);
		System.out.println(softAssert);
		Scrollupjavascript();
		driver.switchTo().defaultContent();

		Thread.sleep(3000);

		explicitWaitClick(p.attendreportexitbtn);





	}

	@When("User entered generate report for the Category report {string} and {int}")
	public void user_entered_generate_report_for_the_category_report_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException, AWTException {
		reader = new ExcelReader();
		w=new WeeklyAttendanceReport_POJO();
		m=new MasterReports_POJO();
		w=new WeeklyAttendanceReport_POJO();
		p =new AttendProblemReport_POJO();
		Thread.sleep(1500);
		tomovethecursor(m.reportsmain);
		explicitWaitClick(p.attendprobmain);
		List<Map<String, String>> data = reader.getData("src/test/resources/Excel File/Test Data.xlsx", SheetName);
		actionssendkeysdelete(p.attendprobfromdate);
		String fromdate = data.get(RowNumber).get("FromDate");
		Thread.sleep(500);
		tofill(p.attendprobfromdate, fromdate);
		totabkey();

		actionssendkeysdelete(p.attendprobtodate);
		String todate = data.get(RowNumber).get("ToDate");
		Thread.sleep(500);
		tofill(p.attendprobtodate, todate);
		totabkey();
		Thread.sleep(1500);
		clickjavascript(p.attendcategoryrdobtn);
		Thread.sleep(1000);
		Selectcheckbox(p.attendallchkbox);
		Thread.sleep(1000);
		ScrolldownElement(p.attendshowbtn);
		Thread.sleep(1000);
		clickjavascript(p.attendshowbtn);
		
		SoftAssert softAssert = new SoftAssert();
		Thread.sleep(2000);
		
		//Category verification 
		try
		{
			driver.switchTo().frame(0);
		}
		catch(NoSuchFrameException e)
		{
			System.out.println(e.getMessage());
		}
		String Exp1 = "Attendance Problem Report (Category)";
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.elementToBeClickable(p.attendcategoryverification));
		highLightElement(p.attendcategoryverification);

		WebElement individualVerfication = driver.findElement(By.xpath("//span[contains(.,'Attendance Problem Report (Category)')]"));
		String FirstActual1 = individualVerfication.getText();

		System.out.println("Expected1: " + Exp1 + " Actual: " + FirstActual1);

		softAssert.assertEquals(Exp1, FirstActual1);
		System.out.println(softAssert);
		Scrollupjavascript();
		driver.switchTo().defaultContent();

		Thread.sleep(3000);

		explicitWaitClick(p.attendreportexitbtn);



	}

	@Then("User entered generate report for the Destination group report {string} and {int}")
	public void user_entered_generate_report_for_the_destination_group_report_and(String SheetName, Integer RowNumber) throws InterruptedException, InvalidFormatException, IOException, AWTException {
		reader = new ExcelReader();
		w=new WeeklyAttendanceReport_POJO();
		m=new MasterReports_POJO();
		w=new WeeklyAttendanceReport_POJO();
		p =new AttendProblemReport_POJO();
		Thread.sleep(1500);
		tomovethecursor(m.reportsmain);
		explicitWaitClick(p.attendprobmain);
		List<Map<String, String>> data = reader.getData("src/test/resources/Excel File/Test Data.xlsx", SheetName);
		actionssendkeysdelete(p.attendprobfromdate);
		String fromdate = data.get(RowNumber).get("FromDate");
		Thread.sleep(500);
		tofill(p.attendprobfromdate, fromdate);
		totabkey();

		actionssendkeysdelete(p.attendprobtodate);
		String todate = data.get(RowNumber).get("ToDate");
		Thread.sleep(500);
		tofill(p.attendprobtodate, todate);
		totabkey();
		Thread.sleep(1500);
		clickjavascript(p.attendextraclassificationrdobtn);
		Thread.sleep(1000);
		Selectcheckbox(p.attendallchkbox);
		Thread.sleep(1000);
		ScrolldownElement(p.attendshowbtn);
		Thread.sleep(1000);
		clickjavascript(p.attendshowbtn);
		
		SoftAssert softAssert = new SoftAssert();
		Thread.sleep(2000);
		
		//Extra classification verification 
		try
		{
			driver.switchTo().frame(0);
		}
		catch(NoSuchFrameException e)
		{
			System.out.println(e.getMessage());
		}
		String Exp1 = "Attendance Problem Report (Extra Classification)";
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.elementToBeClickable(p.attendextraclassificationverification));
		highLightElement(p.attendextraclassificationverification);

		WebElement individualVerfication = driver.findElement(By.xpath("//span[contains(.,'Attendance Problem Report (Extra Classification)')]"));
		String FirstActual1 = individualVerfication.getText();

		System.out.println("Expected1: " + Exp1 + " Actual: " + FirstActual1);

		softAssert.assertEquals(Exp1, FirstActual1);
		System.out.println(softAssert);
		Scrollupjavascript();
		driver.switchTo().defaultContent();

		Thread.sleep(3000);

		explicitWaitClick(p.attendreportexitbtn);

	}

}
