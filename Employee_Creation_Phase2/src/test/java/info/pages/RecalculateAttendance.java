package info.pages;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import info.base.BaseClass;
import info.pom.Recalculate_Attendance_POJO;
import info.utility.ExcelReader;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class RecalculateAttendance extends BaseClass{
	Recalculate_Attendance_POJO r;
	@Before(order=5)
	@Given("User need to Recalculate attendance for an employee")
	public void user_need_to_recalculate_attendance_for_an_employee() throws IOException {
r=new Recalculate_Attendance_POJO();
tomovethecursor(r.utilityclickRecalculate);
	toClick(r.utilityclickRecalculate);
	toClick(r.RecalculateAttendance);
	
	}

	@Given("User need to enter details in to Recalculate Attendance page {string} and {int}")
	public void user_need_to_enter_details_in_to_recalculate_attendance_page_and(String SheetName, Integer RowNumber) throws IOException, InvalidFormatException {
		ExcelReader reader=new ExcelReader();
		r =new Recalculate_Attendance_POJO();
		
		List<Map<String,String>> testData=reader.getData("src/test/resources/Excel/Automation.xlsx", SheetName);
		actionssendkeysdelete(r.FromDateRecalc);
		String Fromdate = testData.get(RowNumber).get("From");
		toFill(r.FromDateRecalc, Fromdate);
		actionssendkeysdelete(r.ToDateRecalc);
		String Todate = testData.get(RowNumber).get("To");
		toFill(r.ToDateRecalc, Todate);
		String Searchemp = testData.get(RowNumber).get("Search Employee");
		toFill(r.EmployeeSearch, Searchemp);
		Explicitwaitvisibility(r.EmployeeSearchbtn);
		toClick(r.EmployeeSearchbtn);
	
		
	
	
	}

	@Then("User need to click Reprocess to Recalculate for an employee")
	public void user_need_to_click_reprocess_to_recalculate_for_an_employee() throws IOException {
		r =new Recalculate_Attendance_POJO();
		Scrolldownjavascript();
		toClick(r.Recalculatebtn);
	
	
	}
}
