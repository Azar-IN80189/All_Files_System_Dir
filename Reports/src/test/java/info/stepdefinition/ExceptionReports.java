package info.stepdefinition;



import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import info.base.Reusableclass;
import info.pojo.Allowancepojo;
import info.pojo.ExceptionReport_POJO;
import info.pojo.MasterReports_POJO;
import info.pojo.WeeklyAttendanceReport_POJO;
import info.utilities.ExcelReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExceptionReports extends Reusableclass {
	public static Allowancepojo a;
	public static MasterReports_POJO m;
	public static ExcelReader reader;
	public static WeeklyAttendanceReport_POJO w;
	public static ExceptionReport_POJO x;
	
	@Given("User need to enter Exception reports")
	public void user_need_to_enter_exception_reports() {
		x =new ExceptionReport_POJO();
tomovethecursor(x.reportsmain);
mouseclick(x.Exceptionmain);

	
	}


	@When("User entered generate report for the lateness-individual employee {string} and {int}")
	public void user_entered_generate_report_for_the_lateness_individual_employee_and(String SheetName, Integer RowNumber) throws InterruptedException, AWTException, InvalidFormatException, IOException {
		x =new ExceptionReport_POJO();
		reader = new ExcelReader();
		List<Map<String, String>> data = reader.getData("src/test/resources/Excel File/Test Data.xlsx", SheetName);
		implicitwait();
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
		
		toClick(x.ExceptionLatenessradiobtn);
		explicitWaitClick(x.Exceptionallchkbox);
		ScrolldownElement(x.Exceptionexportbtn);
		clickjavascript(x.Exceptionexportbtn);
		Thread.sleep(2000);
		String parentWindow = driver.getWindowHandle();
		Set<String> handles =  driver.getWindowHandles();
		   for(String windowHandle  : handles)
		       {
		       if(!windowHandle.equals(parentWindow))
		          {
		          driver.switchTo().window(windowHandle);
		       //  <!--Perform your operation here for new window-->
		          
		         driver.close(); //closing child window
		         
		         driver.switchTo().window(parentWindow); //cntrl to parent window
		          }
		       }
	
	}
	
	@Then("User need to generate report for the absentees-department")
	public void user_need_to_generate_report_for_the_absentees_department() throws InterruptedException {
		x =new ExceptionReport_POJO();
		toClick(x.ExceptionAbsenteesradiobtn);
		explicitWaitClick(x.Exceptiondeptradiobtn);
		Thread.sleep(2000);
		ScrolldownElement(x.Exceptionallchkbox);
		explicitWaitClick(x.Exceptionallchkbox);
		ScrolldownElement(x.Exceptionexportbtn);
		clickjavascript(x.Exceptionexportbtn);
		Thread.sleep(2000);
		String parentWindow = driver.getWindowHandle();
		Set<String> handles =  driver.getWindowHandles();
		   for(String windowHandle  : handles)
		       {
		       if(!windowHandle.equals(parentWindow))
		          {
		          driver.switchTo().window(windowHandle);
		       //  <!--Perform your operation here for new window-->
		          
		         driver.close(); //closing child window
		         
		         driver.switchTo().window(parentWindow); //cntrl to parent window
		          }
		       }
	
	}
	
	@Then("User need to generate report for the Missing clocks-Section")
	public void user_need_to_generate_report_for_the_missing_clocks_section() throws InterruptedException {
		x =new ExceptionReport_POJO();
		toClick(x.ExceptionMissingClocksradiobtn);
		explicitWaitClick(x.Exceptionsectionradiobtn);
		Thread.sleep(2000);
		ScrolldownElement(x.Exceptionallchkbox);
		explicitWaitClick(x.Exceptionallchkbox);
		ScrolldownElement(x.Exceptionexportbtn);
		clickjavascript(x.Exceptionexportbtn);
		Thread.sleep(2000);
		String parentWindow = driver.getWindowHandle();
		Set<String> handles =  driver.getWindowHandles();
		   for(String windowHandle  : handles)
		       {
		       if(!windowHandle.equals(parentWindow))
		          {
		          driver.switchTo().window(windowHandle);
		       //  <!--Perform your operation here for new window-->
		          
		         driver.close(); //closing child window
		         
		         driver.switchTo().window(parentWindow); //cntrl to parent window
		          }
		       }
	
	
	}
	
	@Then("User need to generate report for the Overtime-designation")
	public void user_need_to_generate_report_for_the_overtime_designation() throws InterruptedException {
		x =new ExceptionReport_POJO();
		toClick(x.ExceptionOverTimeradiobtn);
		Thread.sleep(2000);
		clickjavascript(x.ExceptionOverTime0t1);
		clickjavascript(x.ExceptionOverTime0t15);
		clickjavascript(x.ExceptionOverTime0t2);
		clickjavascript(x.ExceptionOverTime0t3);
		clickjavascript(x.ExceptionOverTime0tflat);
		explicitWaitClick(x.Exceptiondesignationradiobtn);
		Thread.sleep(2000);
		ScrolldownElement(x.Exceptionallchkbox);
		explicitWaitClick(x.Exceptionallchkbox);
		ScrolldownElement(x.Exceptionexportbtn);
		clickjavascript(x.Exceptionexportbtn);
		Thread.sleep(2000);
		String parentWindow = driver.getWindowHandle();
		Set<String> handles =  driver.getWindowHandles();
		   for(String windowHandle  : handles)
		       {
		       if(!windowHandle.equals(parentWindow))
		          {
		          driver.switchTo().window(windowHandle);
		       //  <!--Perform your operation here for new window-->
		          
		         driver.close(); //closing child window
		         
		         driver.switchTo().window(parentWindow); //cntrl to parent window
		          }
		       }
	
	}
	
	@Then("User need to generate report for the Allowance-category")
	public void user_need_to_generate_report_for_the_allowance_category() throws InterruptedException {
		x =new ExceptionReport_POJO();
		toClick(x.ExceptionAllowanceradiobtn);
		Thread.sleep(2000);
		clickjavascript(x.Exceptionallowanceshift);
		clickjavascript(x.Exceptionallowanceattendance);
		clickjavascript(x.Exceptionallowancehealth);
		clickjavascript(x.Exceptionallowancemeal);
		clickjavascript(x.Exceptionallowancetransport);
		clickjavascript(x.Exceptionallowanceothers1);
		clickjavascript(x.Exceptionallowanceothers2);
		explicitWaitClick(x.Exceptioncategoryradiobtn);
		Thread.sleep(2000);
		ScrolldownElement(x.Exceptionallchkbox);
		explicitWaitClick(x.Exceptionallchkbox);
		ScrolldownElement(x.Exceptionexportbtn);
		clickjavascript(x.Exceptionexportbtn);
		Thread.sleep(2000);
		String parentWindow = driver.getWindowHandle();
		Set<String> handles =  driver.getWindowHandles();
		   for(String windowHandle  : handles)
		       {
		       if(!windowHandle.equals(parentWindow))
		          {
		          driver.switchTo().window(windowHandle);
		       //  <!--Perform your operation here for new window-->
		          
		         driver.close(); //closing child window
		         
		         driver.switchTo().window(parentWindow); //cntrl to parent window
		          }
		       }
	
	
	}
	
	@Then("User need to generate report for the clocking-DesignationGroup")
	public void user_need_to_generate_report_for_the_clocking_designation_group() throws InterruptedException {
		x =new ExceptionReport_POJO();
		toClick(x.ExceptionClockingradiobtn);
		toselectbyindex(x.ExceptionClockingdd, 1);
		explicitWaitClick(x.Exceptiondesignationgroupradiobtn);
		Thread.sleep(2000);
		ScrolldownElement(x.Exceptionallchkbox);
		explicitWaitClick(x.Exceptionallchkbox);
		ScrolldownElement(x.Exceptionexportbtn);
		clickjavascript(x.Exceptionexportbtn);
		Thread.sleep(2000);
		String parentWindow = driver.getWindowHandle();
		Set<String> handles =  driver.getWindowHandles();
		   for(String windowHandle  : handles)
		       {
		       if(!windowHandle.equals(parentWindow))
		          {
		          driver.switchTo().window(windowHandle);
		       //  <!--Perform your operation here for new window-->
		          
		         driver.close(); //closing child window
		         
		         driver.switchTo().window(parentWindow); //cntrl to parent window
		          }
		       }
	
	
	}
	
	@Then("User need to generate report for the clock out-DesignationGroup")
	public void user_need_to_generate_report_for_the_clock_out_designation_group() throws InterruptedException {
		x =new ExceptionReport_POJO();
		toClick(x.ExceptionClockOutradiobtn);
		Thread.sleep(2000);
		toselectbyvalue(x.ExceptionClockoutoperator, "2");
		actionssendkeysdelete(x.ExceptionClockoutdd);
		tofill(x.ExceptionClockoutdd, "1200");
		explicitWaitClick(x.Exceptiondesignationgroupradiobtn);
		Thread.sleep(2000);
		ScrolldownElement(x.Exceptionallchkbox);
		Selectcheckbox(x.Exceptionallchkbox);
		ScrolldownElement(x.Exceptionexportbtn);
		clickjavascript(x.Exceptionexportbtn);
		Thread.sleep(2000);
		String parentWindow = driver.getWindowHandle();
		Set<String> handles =  driver.getWindowHandles();
		   for(String windowHandle  : handles)
		       {
		       if(!windowHandle.equals(parentWindow))
		          {
		          driver.switchTo().window(windowHandle);
		       //  <!--Perform your operation here for new window-->
		          
		         driver.close(); //closing child window
		         
		         driver.switchTo().window(parentWindow); //cntrl to parent window
		          }
		       }
		   closebrowser();
	
	}



}
