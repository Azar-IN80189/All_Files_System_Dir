package info.pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;

import info.base.Reusableclass;
import info.pom.Allowancepojo;
import info.pom.EmployeePojo;
import info.pom.Staffallowancepojo;
import info.utility.ExcelReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Allowancecreation extends Reusableclass {

	public static Allowancepojo a;
	public static EmployeePojo s;
	public static Staffallowancepojo st;
	public static ExcelReader reader;

	@Before("@Logincredentials")
	public void setup() throws AWTException, InterruptedException {
		a = new Allowancepojo();
		System.out.println(" ****** Allowance Creation Started *****");

		browserLaunch();
		toMaximize();
		launchUrl("https://staging.info-tech.com.sg/Login.aspx");
		a = new Allowancepojo();
		tofill(a.username, "i1@gmail.com");
		Thread.sleep(500);
		tofill(a.pwd, "Info@123");
		toClick(a.click);
		Thread.sleep(1000);
		toClick(a.ChangeDB);
		toClick(a.DBname);
		tofill(a.DBname, "AZARUDEEN");
		implicitwait();
		tomovethecursor(driver.findElement(By.xpath("//*[@id=\"tblCustomerList\"]/tbody/tr[1]")));
		toClick(driver.findElement(By.xpath("//*[@id=\"tblCustomerList\"]/tbody/tr[1]")));

	}

	@After
	public void close() {
		System.out.println("***** Allowances are created *****");

	}

	@When("User have to click Allowance Settings and create first Allowance")
	public void user_have_to_click_allowance_settings_and_create_first_allowance() throws InterruptedException {
		a = new Allowancepojo();
		Thread.sleep(2000);
		tomovethecursor(a.AllowanceSettings);
		toClick(a.AllowanceSettings);
		Thread.sleep(1000);
		toClick(a.Allowance);
		Thread.sleep(1000);
		toClick(a.newallowance);

	}

	@When("User need to give allowance details from given sheetname {string} rownumber {int}")
	public void user_need_to_give_allowance_details_from_given_sheetname_rownumber(String SheetName, Integer RowNumber)
			throws InvalidFormatException, IOException, InterruptedException {

		System.out.println("***** First Allowance Creation started *****");

		reader = new ExcelReader();
		a = new Allowancepojo();
		// Allowance Code

		List<Map<String, String>> Allowancecode = reader.getData(
				"src/test/resources/Excel/Automation.xlsx",
				SheetName);
		String code = Allowancecode.get(RowNumber).get("Allowance Code");
		Explicitwait(a.allowancecode);
		tofill(a.allowancecode, code);

		// AllowanceName

		List<Map<String, String>> Allowancename = reader.getData(
				"src/test/resources/Excel/Automation.xlsx",
				SheetName);
		String name = Allowancename.get(RowNumber).get("Allowance Name");
		Explicitwait(a.allowancename);
		tofill(a.allowancename, name);

		// AllownceAmount
		List<Map<String, String>> Allowanceamount = reader.getData(
				"src/test/resources/Excel/Automation.xlsx",
				SheetName);
		String amount = Allowanceamount.get(RowNumber).get("Allowance Amount");
		Explicitwait(a.allowanceamount);
		tofill(a.allowanceamount, amount);

		// Timein

		Explicitwait(a.chkbytimein);
		toClick(a.chkbytimein);
		Thread.sleep(1200);
		toselectbyindex(a.selectclkbytimein, 0);
		Explicitwait(a.intime);
		actionssendkeysdelete(a.intime);
		List<Map<String, String>> Timein = reader.getData(
				"src/test/resources/Excel/Automation.xlsx",
				SheetName);
		String inTime = Timein.get(RowNumber).get("Time In");
		Thread.sleep(1000);
		tofill(a.intime, inTime);

		// Timeout

		Explicitwait(a.chkbyouttime);
		toClick(a.chkbyouttime);
		Explicitwait(a.selectclkbyouttime);
		toselectbyindex(a.selectclkbyouttime, 2);
		Explicitwait(a.outtime);
		actionssendkeysdelete(a.outtime);
		Explicitwait(a.outtime);
		List<Map<String, String>> Timeout = reader.getData(
				"src/test/resources/Excel/Automation.xlsx",
				SheetName);
		String outTime = Timeout.get(RowNumber).get("Time Out");
		Thread.sleep(1000);
		tofill(a.outtime, outTime);

		// Actualtime

		Explicitwait(a.chkactual);
		toClick(a.chkactual);
		Explicitwait(a.selectdd1actual);
		toselectbyindex(a.selectdd1actual, 0);
		Explicitwait(a.actualtime);
		actionssendkeysdelete(a.actualtime);
		Explicitwait(a.actualtime);
		List<Map<String, String>> ActualTime = reader.getData(
				"src/test/resources/Excel/Automation.xlsx",
				SheetName);
		String timeActual = ActualTime.get(RowNumber).get("Acutual Time");
		tofill(a.actualtime, timeActual);

		// NRM

		Explicitwait(a.chkbynrm);
		toClick(a.chkbynrm);
		Thread.sleep(1000);
		toselectbyindex(a.selectnrm, 0);
		Explicitwait(a.nrm);
		actionssendkeysdelete(a.nrm);
		Explicitwait(a.nrm);
		List<Map<String, String>> nrm = reader.getData(
				"src/test/resources/Excel/Automation.xlsx",
				SheetName);
		String nrmTime = nrm.get(RowNumber).get("NRM");
		tofill(a.nrm, nrmTime);

		// Overtime

		Explicitwait(a.chkbyot);
		toClick(a.chkbyot);
		Explicitwait(a.selectot);
		toselectbyindex(a.selectot, 0);
		Explicitwait(a.OTtime);
		actionssendkeysdelete(a.OTtime);
		Explicitwait(a.OTtime);
		List<Map<String, String>> overtime = reader.getData(
				"src/test/resources/Excel/Automation.xlsx",
				SheetName);
		String timeOver = overtime.get(RowNumber).get("OT");
		tofill(a.OTtime, timeOver);

		// Lateness

		Explicitwait(a.chkbylate);
		toClick(a.chkbylate);
		Explicitwait(a.selectlate);
		toselectbyindex(a.selectlate, 0);
		Explicitwait(a.latetime);
		actionssendkeysdelete(a.latetime);
		Explicitwait(a.latetime);
		List<Map<String, String>> Latenesstime = reader.getData(
				"src/test/resources/Excel/Automation.xlsx",
				SheetName);
		String timeLateness = Latenesstime.get(RowNumber).get("Lateness");
		tofill(a.latetime, timeLateness);

		Explicitwait(a.chkbyearly);
		toClick(a.chkbyearly);
		Explicitwait(a.selectearlytime);
		toselectbyindex(a.selectearlytime, 0);
		Thread.sleep(500);
		actionssendkeysdelete(a.earlyouttime);
		List<Map<String, String>> Earlyouttime = reader.getData(
				"src/test/resources/Excel/Automation.xlsx",
				SheetName);
		String timeEarlyout = Earlyouttime.get(RowNumber).get("Earlyout");
		Thread.sleep(500);
		tofill(a.earlyouttime, timeEarlyout);

		Explicitwait(a.chkbyday);
		toClick(a.chkbyday);
		Explicitwait(a.chkallday);
		toClick(a.chkallday);

		Scrolldownjavascript();

		Explicitwait(a.chkbyshift);
		toClick(a.chkbyshift);
		Thread.sleep(1000);
		toClick(a.chkpayshift);
		toClick(a.chkallshift);

		Explicitwait(a.chkbyreason);
		toClick(a.chkbyreason);
		Explicitwait(a.chkpayreason);
		toClick(a.chkpayreason);
		Thread.sleep(1000);
		toClick(a.chkreasonall);
		Thread.sleep(1000);

	}

	@Then("User save the first allowance")
	public void user_save_the_first_allowance() throws InterruptedException {
		a = new Allowancepojo();
		Thread.sleep(500);
	Scrolldownjavascript();
		toClick(a.save);
		Thread.sleep(500);
		System.out.println("Allowance one is created");
	}

	// Second Allowance Creation

	@When("User have to click Allowance Settings and create second Allowance")
	public void user_have_to_click_allowance_settings_and_create_second_allowance() throws InterruptedException {

		System.out.println("***** Second Allowance Creation started *****");

		a = new Allowancepojo();
		tomovethecursor(a.AllowanceSettings);
		toClick(a.AllowanceSettings);
		Thread.sleep(1000);
		toClick(a.Allowance);
		Thread.sleep(1000);
		toClick(a.newallowance);

	}

	@When("User need to fetch allowance details from given sheetname {string} rownumber {int}")
	public void user_need_to_fetch_allowance_details_from_given_sheetname_rownumber(String SheetName, Integer RowNumber)
			throws InvalidFormatException, IOException, InterruptedException {

		reader = new ExcelReader();
		a = new Allowancepojo();
		// Allowance Code

		List<Map<String, String>> Allowancecode = reader.getData(
				"src/test/resources/Excel/Automation.xlsx",
				SheetName);
		String code = Allowancecode.get(RowNumber).get("Allowance Code");
		Explicitwait(a.allowancecode);
		tofill(a.allowancecode, code);

		// AllowanceName

		List<Map<String, String>> Allowancename = reader.getData(
				"src/test/resources/Excel/Automation.xlsx",
				SheetName);
		String name = Allowancename.get(RowNumber).get("Allowance Name");
		Explicitwait(a.allowancename);
		tofill(a.allowancename, name);

		// AllownceAmount
		List<Map<String, String>> Allowanceamount = reader.getData(
				"src/test/resources/Excel/Automation.xlsx",
				SheetName);
		String amount = Allowanceamount.get(RowNumber).get("Allowance Amount");
		Explicitwait(a.allowanceamount);
		tofill(a.allowanceamount, amount);

		// Timein

		Explicitwait(a.chkbytimein);
		toClick(a.chkbytimein);
		Thread.sleep(1200);
		toselectbyindex(a.selectclkbytimein, 0);
		Explicitwait(a.intime);
		actionssendkeysdelete(a.intime);
		List<Map<String, String>> Timein = reader.getData(
				"src/test/resources/Excel/Automation.xlsx",
				SheetName);
		String inTime = Timein.get(RowNumber).get("Time In");
		Thread.sleep(1000);
		tofill(a.intime, inTime);

		// Timeout

		Explicitwait(a.chkbyouttime);
		toClick(a.chkbyouttime);
		Explicitwait(a.selectclkbyouttime);
		toselectbyindex(a.selectclkbyouttime, 2);
		Explicitwait(a.outtime);
		actionssendkeysdelete(a.outtime);
		Explicitwait(a.outtime);
		List<Map<String, String>> Timeout = reader.getData(
				"src/test/resources/Excel/Automation.xlsx",
				SheetName);
		String outTime = Timeout.get(RowNumber).get("Time Out");
		Thread.sleep(1000);
		tofill(a.outtime, outTime);

		Explicitwait(a.chkactual);
		toClick(a.chkactual);
		Explicitwait(a.selectdd1actual);
		toselectbyindex(a.selectdd1actual, 0);
		Explicitwait(a.actualtime);
		actionssendkeysdelete(a.actualtime);
		Explicitwait(a.actualtime);
		List<Map<String, String>> ActualTime = reader.getData(
				"src/test/resources/Excel/Automation.xlsx",
				SheetName);
		String timeActual = ActualTime.get(RowNumber).get("Acutual Time");
		tofill(a.actualtime, timeActual);

		Explicitwait(a.chkbyday);
		toClick(a.chkbyday);
		Explicitwait(a.chkallday);
		toClick(a.chkallday);

	}

	@Then("User save the second allowance")
	public void user_save_the_second_allowance() throws InterruptedException {

		a = new Allowancepojo();
		Thread.sleep(1000);
		clickjavascript(a.save);
		Thread.sleep(500);
		System.out.println("Allowance second is created");
	}

	@When("User have to click Allowance Settings and create Third Allowance")
	public void user_have_to_click_allowance_settings_and_create_third_allowance() throws InterruptedException {

		System.out.println("***** Third Allowance Creation started *****");

		a = new Allowancepojo();
		tomovethecursor(a.AllowanceSettings);
		toClick(a.AllowanceSettings);
		Thread.sleep(1000);
		toClick(a.Allowance);
		Thread.sleep(1000);
		toClick(a.newallowance);

	}

	@When("User need to get allowance details from given sheetname {string} rownumber {int}")
	public void user_need_to_get_allowance_details_from_given_sheetname_rownumber(String SheetName, Integer RowNumber)
			throws InvalidFormatException, IOException, InterruptedException {

		reader = new ExcelReader();
		a = new Allowancepojo();
		// Allowance Code

		List<Map<String, String>> Allowancecode = reader.getData(
				"src/test/resources/Excel/Automation.xlsx",
				SheetName);
		String code = Allowancecode.get(RowNumber).get("Allowance Code");
		Explicitwait(a.allowancecode);
		tofill(a.allowancecode, code);

		// AllowanceName

		List<Map<String, String>> Allowancename = reader.getData(
				"src/test/resources/Excel/Automation.xlsx",
				SheetName);
		String name = Allowancename.get(RowNumber).get("Allowance Name");
		Explicitwait(a.allowancename);
		tofill(a.allowancename, name);

		// AllownceAmount
		List<Map<String, String>> Allowanceamount = reader.getData(
				"src/test/resources/Excel/Automation.xlsx",
				SheetName);
		String amount = Allowanceamount.get(RowNumber).get("Allowance Amount");
		Explicitwait(a.allowanceamount);
		tofill(a.allowanceamount, amount);

		// Timein

		Explicitwait(a.chkbytimein);
		toClick(a.chkbytimein);
		Thread.sleep(1200);
		toselectbyindex(a.selectclkbytimein, 0);
		Explicitwait(a.intime);
		actionssendkeysdelete(a.intime);
		List<Map<String, String>> Timein = reader.getData(
				"src/test/resources/Excel File/Test Data.xlsx",
				SheetName);
		String inTime = Timein.get(RowNumber).get("Time In");
		Thread.sleep(1000);
		tofill(a.intime, inTime);

		// Timeout

		Explicitwait(a.chkbyouttime);
		toClick(a.chkbyouttime);
		Explicitwait(a.selectclkbyouttime);
		toselectbyindex(a.selectclkbyouttime, 2);
		Explicitwait(a.outtime);
		actionssendkeysdelete(a.outtime);
		Explicitwait(a.outtime);
		List<Map<String, String>> Timeout = reader.getData(
				"src/test/resources/Excel/Automation.xlsx",
				SheetName);
		String outTime = Timeout.get(RowNumber).get("Time Out");
		Thread.sleep(1000);
		tofill(a.outtime, outTime);
	}

	@Then("User save the third allowance")
	public void user_save_the_third_allowance() throws InterruptedException {

		a = new Allowancepojo();
		Thread.sleep(1000);
		clickjavascript(a.save);
		Thread.sleep(500);
		System.out.println("Allowance third is created");
	}

	// Fourth Allowance

	@When("User have to click Allowance Settings and create Fourth Allowance")
	public void user_have_to_click_allowance_settings_and_create_fourth_allowance() throws InterruptedException {

		System.out.println("Fourth Allowance creation started");

		a = new Allowancepojo();
		tomovethecursor(a.AllowanceSettings);
		toClick(a.AllowanceSettings);
		Thread.sleep(1000);
		toClick(a.Allowance);
		Thread.sleep(1000);
		toClick(a.newallowance);

	}

	@When("User need to bring allowance details from given sheetname {string} rownumber {int}")
	public void user_need_to_bring_allowance_details_from_given_sheetname_rownumber(String SheetName, Integer RowNumber)
			throws InterruptedException, InvalidFormatException, IOException {

		reader = new ExcelReader();
		a = new Allowancepojo();
		// Allowance Code

		List<Map<String, String>> Allowancecode = reader.getData(
				"src/test/resources/Excel/Automation.xlsx",
				SheetName);
		String code = Allowancecode.get(RowNumber).get("Allowance Code");
		Explicitwait(a.allowancecode);
		tofill(a.allowancecode, code);

		// AllowanceName

		List<Map<String, String>> Allowancename = reader.getData(
				"src/test/resources/Excel/Automation.xlsx",
				SheetName);
		String name = Allowancename.get(RowNumber).get("Allowance Name");
		Explicitwait(a.allowancename);
		tofill(a.allowancename, name);

		// AllownceAmount
		List<Map<String, String>> Allowanceamount = reader.getData(
				"src/test/resources/Excel/Automation.xlsx",
				SheetName);
		String amount = Allowanceamount.get(RowNumber).get("Allowance Amount");
		Explicitwait(a.allowanceamount);
		tofill(a.allowanceamount, amount);

		// Timein

		Explicitwait(a.chkbytimein);
		toClick(a.chkbytimein);
		Thread.sleep(1200);
		toselectbyindex(a.selectclkbytimein, 0);
		Explicitwait(a.intime);
		actionssendkeysdelete(a.intime);
		List<Map<String, String>> Timein = reader.getData(
				"src/test/resources/Excel/Automation.xlsx",
				SheetName);
		String inTime = Timein.get(RowNumber).get("Time In");
		Thread.sleep(1000);
		tofill(a.intime, inTime);

		// Timeout

		Explicitwait(a.chkbyouttime);
		toClick(a.chkbyouttime);
		Explicitwait(a.selectclkbyouttime);
		toselectbyindex(a.selectclkbyouttime, 2);
		Explicitwait(a.outtime);
		actionssendkeysdelete(a.outtime);
		Explicitwait(a.outtime);
		List<Map<String, String>> Timeout = reader.getData(
				"src/test/resources/Excel/Automation.xlsx",
				SheetName);
		String outTime = Timeout.get(RowNumber).get("Time Out");
		Thread.sleep(1000);
		tofill(a.outtime, outTime);

		Scrolldownjavascript();

		Explicitwait(a.chkbyreason);
		toClick(a.chkbyreason);
		Explicitwait(a.chkpayreason);
		toClick(a.chkpayreason);
		Thread.sleep(1000);
		toClick(a.chkreasonall);
		Thread.sleep(1000);

	}

	@Then("User save the fourth allowance")
	public void user_save_the_fourth_allowance() throws InterruptedException {

		a = new Allowancepojo();
		Thread.sleep(500);
		Scrolldownjavascript();
		clickjavascript(a.save);
		Thread.sleep(500);
		Scrollupjavascript();
		System.out.println("Allowance four is created");
	}

}
