package info.pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import info.base.Reusableclass;
import info.pom.Allowancepojo;
import info.pom.EmployeePojo;
import info.pom.Staffallowancepojo;
import info.utility.ExcelReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StaffAllowance extends Reusableclass {
	Allowancepojo a;
	EmployeePojo s;
	Staffallowancepojo st;
	ExcelReader reader;

	//Staff Allowance

	@Given("User have to click allowance settings and Staff allowance")
	public void user_have_to_click_allowance_settings_and_staff_allowance() throws InterruptedException {

		System.out.println("***** Staff allowance is started *****");
		a = new Allowancepojo();
		st = new Staffallowancepojo();

		a = new Allowancepojo();
		st = new Staffallowancepojo();
		Thread.sleep(1000);
		tomovethecursor(a.AllowanceSettings);
		implicitwait();
		tomovethecursor(st.staffallowance);
		toClick(st.staffallowance);
		Thread.sleep(1000);
	}

	@Then("Map allowance to particular employee from given sheetname {string} and RowNumber {int}")
	public void map_allowance_to_particular_employee_from_given_sheetname_and_row_number(String SheetName1,
			Integer RowNumber1) throws InvalidFormatException, IOException, InterruptedException, AWTException {
		a = new Allowancepojo();
		st = new Staffallowancepojo();

		reader = new ExcelReader();

		List<Map<String, String>> empName = reader.getData(
				"src/test/resources/Excel/Automation.xlsx",
				SheetName1);
		String EName = empName.get(RowNumber1).get("Empname");
		tofill(st.seacrchtext, EName);
		Thread.sleep(1000);
		toClick(st.search);
		Explicitwait(st.editicon);
		toClick(st.editicon);

		Thread.sleep(500);

		Scrolldownjavascript();

		Thread.sleep(1000);

		List<Map<String, String>> Allowanceone = reader.getData(
				"src/test/resources/Excel/Automation.xlsx",
				SheetName1);
		String Al1 = Allowanceone.get(RowNumber1).get("Allowance1");
		tofill(st.box1, Al1);
		todown();
		toenter();

		List<Map<String, String>> Allowancetwo = reader.getData(
				"src/test/resources/Excel/Automation.xlsx",
				SheetName1);
		String Al2 = Allowancetwo.get(RowNumber1).get("Allowance2");
		tofill(st.box2, Al2);
		todown();
		toenter();

		toselectbyvisibletext(st.operator1, "ADD");

	}

	@When("User have to save the Attendance allowance")
	public void user_have_to_save_the_attendance_allowance() {
		a = new Allowancepojo();
		st = new Staffallowancepojo();
		Explicitwait(st.savebutton);

		clickjavascript(st.savebutton);

		System.out.println("Staff allowance Mapped to that employee");
		Scrollupjavascript();
	}
}
