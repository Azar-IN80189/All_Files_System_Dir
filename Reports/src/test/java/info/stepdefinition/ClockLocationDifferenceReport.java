package info.stepdefinition;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import info.base.Reusableclass;
import info.pojo.Allowancepojo;
import info.pojo.ClockLocationDifferenceReport_POJO;
import info.pojo.ExceptionReport_POJO;
import info.pojo.MasterReports_POJO;
import info.pojo.WeeklyAttendanceReport_POJO;
import info.utilities.ExcelReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ClockLocationDifferenceReport extends Reusableclass {
	public static Allowancepojo a;
	public static MasterReports_POJO m;
	public static ExcelReader reader;
	public static WeeklyAttendanceReport_POJO w;
	public static ExceptionReport_POJO x;
	public static ClockLocationDifferenceReport_POJO c;
	@Given("User need to enter Clock Location Difference Report")
	public void user_need_to_enter_clock_location_difference_report() {
		c =new ClockLocationDifferenceReport_POJO();
		x =new ExceptionReport_POJO();
		tomovethecursor(x.reportsmain);
		mouseclick(c.Clocklocationdiffreportmain);
		
		
	}

	@And("User entered generate report for the CLDR individual report {string} and {int}")
	public void user_entered_generate_report_for_the_cldr_individual_report_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException, AWTException {
		x =new ExceptionReport_POJO();
		c =new ClockLocationDifferenceReport_POJO();
		reader = new ExcelReader();
		List<Map<String, String>> data = reader.getData("src/test/resources/Excel File/Test Data.xlsx", SheetName);
		actionssendkeysdelete(c.cldrfromdate);
		String fromdate = data.get(RowNumber).get("FromDate");
		Thread.sleep(500);
		tofill(c.cldrfromdate, fromdate);
		totabkey();
		
		actionssendkeysdelete(c.cldrtodate);
		String todate = data.get(RowNumber).get("ToDate");
		Thread.sleep(500);
		tofill(c.cldrtodate, todate);
		totabkey();
		Thread.sleep(2000);
		toClick(c.cldrIndividualrdobtn);
		Thread.sleep(2000);
		explicitWaitClick(c.cldrallchkbox);
		ScrolldownElement(c.cldrpreviewbtn);
		clickjavascript(c.cldrpreviewbtn);
		
		Thread.sleep(4000);
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
	@When("User entered generate report for the CLDR Department report {string} and {int}")
	public void user_entered_generate_report_for_the_cldr_department_report_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException, AWTException {
		x =new ExceptionReport_POJO();
		c =new ClockLocationDifferenceReport_POJO();
		reader = new ExcelReader();
		List<Map<String, String>> data = reader.getData("src/test/resources/Excel File/Test Data.xlsx", SheetName);
		actionssendkeysdelete(c.cldrfromdate);
		String fromdate = data.get(RowNumber).get("FromDate");
		Thread.sleep(500);
		tofill(c.cldrfromdate, fromdate);
		totabkey();
		
		actionssendkeysdelete(c.cldrtodate);
		String todate = data.get(RowNumber).get("ToDate");
		Thread.sleep(500);
		tofill(c.cldrtodate, todate);
		totabkey();
		Thread.sleep(2000);
		toClick(c.cldrDepartmentrdobtn);
		Thread.sleep(2000);
		explicitWaitClick(c.cldrallchkbox);
		ScrolldownElement(c.cldrpreviewbtn);
		clickjavascript(c.cldrpreviewbtn);
		
		Thread.sleep(4000);
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
	@Then("User entered generate report for the CLDR Section report {string} and {int}")
	public void user_entered_generate_report_for_the_cldr_section_report_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException, AWTException {
		x =new ExceptionReport_POJO();
		c =new ClockLocationDifferenceReport_POJO();
		reader = new ExcelReader();
		List<Map<String, String>> data = reader.getData("src/test/resources/Excel File/Test Data.xlsx", SheetName);
		actionssendkeysdelete(c.cldrfromdate);
		String fromdate = data.get(RowNumber).get("FromDate");
		Thread.sleep(500);
		tofill(c.cldrfromdate, fromdate);
		totabkey();
		
		actionssendkeysdelete(c.cldrtodate);
		String todate = data.get(RowNumber).get("ToDate");
		Thread.sleep(500);
		tofill(c.cldrtodate, todate);
		totabkey();
		Thread.sleep(2000);
		toClick(c.cldrSectionrdobtn);
		Thread.sleep(2000);
		String Deptsection = data.get(RowNumber).get("Department name");
		actionssendkeysdelete(c.cldrsectiondeptdd);
		tofill(c.cldrsectiondeptdd, Deptsection);
		explicitWaitClick(c.cldrallchkbox);
		ScrolldownElement(c.cldrpreviewbtn);
		clickjavascript(c.cldrpreviewbtn);
		
		Thread.sleep(4000);
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
	@When("User entered generate report for the CLDR Designation report {string} and {int}")
	public void user_entered_generate_report_for_the_cldr_designation_report_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException, AWTException {
		x =new ExceptionReport_POJO();
		c =new ClockLocationDifferenceReport_POJO();
		reader = new ExcelReader();
		List<Map<String, String>> data = reader.getData("src/test/resources/Excel File/Test Data.xlsx", SheetName);
		actionssendkeysdelete(c.cldrfromdate);
		String fromdate = data.get(RowNumber).get("FromDate");
		Thread.sleep(500);
		tofill(c.cldrfromdate, fromdate);
		totabkey();
		
		actionssendkeysdelete(c.cldrtodate);
		String todate = data.get(RowNumber).get("ToDate");
		Thread.sleep(500);
		tofill(c.cldrtodate, todate);
		totabkey();
		Thread.sleep(2000);
		toClick(c.cldrdesignationrdobtn);
		Thread.sleep(2000);
		explicitWaitClick(c.cldrallchkbox);
		ScrolldownElement(c.cldrpreviewbtn);
		clickjavascript(c.cldrpreviewbtn);
		
		Thread.sleep(4000);
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
	@When("User entered generate report for the CLDR Category report {string} and {int}")
	public void user_entered_generate_report_for_the_cldr_category_report_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException, AWTException {
		x =new ExceptionReport_POJO();
		c =new ClockLocationDifferenceReport_POJO();
		reader = new ExcelReader();
		List<Map<String, String>> data = reader.getData("src/test/resources/Excel File/Test Data.xlsx", SheetName);
		actionssendkeysdelete(c.cldrfromdate);
		String fromdate = data.get(RowNumber).get("FromDate");
		Thread.sleep(500);
		tofill(c.cldrfromdate, fromdate);
		totabkey();
		
		actionssendkeysdelete(c.cldrtodate);
		String todate = data.get(RowNumber).get("ToDate");
		Thread.sleep(500);
		tofill(c.cldrtodate, todate);
		totabkey();
		Thread.sleep(2000);
		toClick(c.cldrcategoryrdobtn);
		Thread.sleep(2000);
		explicitWaitClick(c.cldrallchkbox);
		ScrolldownElement(c.cldrpreviewbtn);
		clickjavascript(c.cldrpreviewbtn);
		
		Thread.sleep(4000);
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
	@Then("User entered generate report for the CLDR Destination group report {string} and {int}")
	public void user_entered_generate_report_for_the_cldr_destination_group_report_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException, AWTException {
		x =new ExceptionReport_POJO();
		c =new ClockLocationDifferenceReport_POJO();
		reader = new ExcelReader();
		List<Map<String, String>> data = reader.getData("src/test/resources/Excel File/Test Data.xlsx", SheetName);
		actionssendkeysdelete(c.cldrfromdate);
		String fromdate = data.get(RowNumber).get("FromDate");
		Thread.sleep(500);
		tofill(c.cldrfromdate, fromdate);
		totabkey();
		
		actionssendkeysdelete(c.cldrtodate);
		String todate = data.get(RowNumber).get("ToDate");
		Thread.sleep(500);
		tofill(c.cldrtodate, todate);
		totabkey();
		Thread.sleep(2000);
		toClick(c.cldrextraclassificationrdobtn);
		Thread.sleep(2000);
		explicitWaitClick(c.cldrallchkbox);
		ScrolldownElement(c.cldrpreviewbtn);
		clickjavascript(c.cldrpreviewbtn);
		
		Thread.sleep(4000);
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



}
