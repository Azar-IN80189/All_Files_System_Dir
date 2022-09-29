package info.pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import info.POJO.PHandRestpojo;
import info.POJO.UpIpojo;
import info.POJO.settingsSPpojo;
import info.base.Reusableclass;
import info.utility.ExcelReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Phandrest extends Reusableclass {

	public static PHandRestpojo s;
	public static UpIpojo u;
	public static settingsSPpojo sp;
	public static ExcelReader reader;

	@Before("@Logincredentials")
	public void setup() throws AWTException, InterruptedException {

		System.out.println("***** Enable Allow Early OT in System Parameter *****");
		browserLaunch();
		toMaximize();
		launchUrl("https://staging.info-tech.com.sg/Login.aspx");
		torefresh();
		s = new PHandRestpojo();
		Explicitwait(s.username);
		tofill(s.username, "i1@gmail.com");
		Explicitwait(s.pwd);
		tofill(s.pwd, "Info@123");
		Explicitwait(s.click);
		toClick(s.click);
		Thread.sleep(1000);
		toClick(s.ChangeDB);
		toClick(s.DBname);
		tofill(s.DBname, "KARTHIKA");
		Thread.sleep(500);
		totabkey();
		Thread.sleep(500);
		toenter();

	}

	@After
	public void close() {

		System.out.println("*****PH and Rest day settings for allow early OT *****");

	}

	// Scenario1:- Get into system parameter and PH Rest day settings enable Allow
	// early OT and Enable NEW RULE

	@Given("Get into systemparameter and PH Rest day settings enable Allow early OT and Enable NEW RULE")
	public void get_into_systemparameter_and_ph_rest_day_settings_enable_allow_early_ot_and_enable_new_rule()
			throws InterruptedException {

		s = new PHandRestpojo();
		sp = new settingsSPpojo();
		tomovethecursor(sp.Utility);
		toClick(sp.systemparameter);
		Thread.sleep(1000);
		toClick(s.PHRestday);
		Thread.sleep(500);
		toClick(s.OTonPHC); // Enable Allow Early OT
		Thread.sleep(1000);
		toClick(s.PHnewm1);
		Thread.sleep(2000);
		Scrolldownjavascript();
		toClick(s.save);
	}

	@When("Check updates in update by individual section Fetch Details from Excel Sheet {string} RowNumber {int}")
	public void check_updates_in_update_by_individual_section_fetch_details_from_excel_sheet_row_number(
			String SheetName, Integer RowNumber)
			throws AWTException, InvalidFormatException, IOException, InterruptedException {

		reader = new ExcelReader();
		s = new PHandRestpojo();
		u = new UpIpojo();
		Thread.sleep(1000);
		tomovethecursor(u.Transcaction);
		toClick(u.Transcaction);
		toClick(u.upindi);
		Thread.sleep(1000);
		Explicitwait(u.input1);
		tomovethecursor(u.input1);
		Thread.sleep(1000);
		tofill(u.input1, "KARTHIKA");
		Thread.sleep(500);
		toenter();
		List<Map<String, String>> data = reader.getData("src/test/resources/Excel/Test Data.xlsx", SheetName);
		actionssendkeysdelete(u.dateFromup);
		String fromdate = data.get(RowNumber).get("FromDate");
		tomovethecursor(u.dateFromup);
		Thread.sleep(500);
		tofill(u.dateFromup, fromdate);
		toenter();

		actionssendkeysdelete(u.dateToup);
		Thread.sleep(500);
		String todate = data.get(RowNumber).get("ToDate");
		tofill(u.dateToup, todate);
		toenter();
		Thread.sleep(500);
		clickjavascript(u.searchbutton);

		String timeIN = data.get(RowNumber).get("Timein");
		Thread.sleep(500);
		tomovethecursor(u.timeIn);
		actionssendkeysdelete(u.timeIn);
		Thread.sleep(2000);
		WebElement IN = driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[6]/textarea"));
		actionssendkeysdelete(IN);
		Thread.sleep(1000);
		tofill(IN, timeIN);
		totabkey();
		Thread.sleep(1000);

		String timeOUT = data.get(RowNumber).get("Timeout");
		Thread.sleep(500);
		tomovethecursor(u.timeOut);
		actionssendkeysdelete(u.timeOut);
		Thread.sleep(2000);
		WebElement OUT = driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[6]/textarea"));
		actionssendkeysdelete(OUT);
		Thread.sleep(1000);
		tofill(OUT, timeOUT);
		totabkey();
		Thread.sleep(2000);

		String Exp = "10:50";
		WebElement value = driver
				.findElement(By.xpath("//*[@id=\"dhot\"]/div[1]/div/div/div/table/tbody/tr[1]/td[16]"));
		String Actual = value.getText();
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(Exp, Actual);

		String Exp1 = "02:50";
		WebElement value1 = driver
				.findElement(By.xpath("//*[@id=\"dhot\"]/div[1]/div/div/div/table/tbody/tr[1]/td[16]"));
		String Actual1 = value1.getText();
		SoftAssert soft1 = new SoftAssert();
		soft1.assertEquals(Exp1, Actual1);

		System.out.println("OT is created based on Enable allow Early OT");
		Thread.sleep(2000);

	}

	// Scenario 2:- Go to system parameter and PH Rest Day settings Enable Allow
	// early OT and Enable old rule onPH

	@Given("Go to systemparameter and PH Rest Day settings Enable Allow early OT and Enable old rule")
	public void go_to_systemparameter_and_ph_rest_day_settings_enable_allow_early_ot_and_enable_old_rule()
			throws InterruptedException {

		s = new PHandRestpojo();
		sp = new settingsSPpojo();
		implicitwait();
		toClick(sp.Utility);
		tomovethecursor(sp.systemparameter);
		toClick(sp.systemparameter);
		toClick(s.PHRestday);
		Thread.sleep(1000);
		toClick(s.PHoldm1);
		Thread.sleep(1000);
		Scrolldownjavascript();
		Thread.sleep(1000);
		toClick(s.save);

	}

	@When("Updates are done in update by individual section {string} RowNumber {int}")
	public void updates_are_done_in_update_by_individual_section_row_number(String SheetName, Integer RowNumber)
			throws InterruptedException, AWTException, InvalidFormatException, IOException {

		reader = new ExcelReader();
		s = new PHandRestpojo();
		u = new UpIpojo();
		Thread.sleep(1000);
		tomovethecursor(u.Transcaction);
		toClick(u.Transcaction);
		Thread.sleep(1000);
		toClick(u.upindi);
		Thread.sleep(1000);
		Explicitwait(u.input1);
		tomovethecursor(u.input1);
		Thread.sleep(1000);
		tofill(u.input1, "KARTHIKA");
		Thread.sleep(500);
		toenter();
		List<Map<String, String>> data = reader.getData("src/test/resources/Excel/Test Data.xlsx", SheetName);

		actionssendkeysdelete(u.dateFromup);
		String fromdate = data.get(RowNumber).get("FromDate");
		tomovethecursor(u.dateFromup);
		Thread.sleep(1000);
		tofill(u.dateFromup, fromdate);
		toenter();

		actionssendkeysdelete(u.dateToup);
		String todate = data.get(RowNumber).get("ToDate");
		Thread.sleep(1000);
		tofill(u.dateToup, todate);
		toenter();

		toClick(u.searchbutton);

		String timeIN = data.get(RowNumber).get("Timein");
		Thread.sleep(1000);
		tomovethecursor(u.timeIn);
		actionssendkeysdelete(u.timeIn);
		Thread.sleep(2000);
		WebElement IN = driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[6]/textarea"));
		actionssendkeysdelete(IN);
		Thread.sleep(1000);
		tofill(IN, timeIN);
		totabkey();
		Thread.sleep(1000);

		String timeOUT = data.get(RowNumber).get("Timeout");
		Thread.sleep(500);
		tomovethecursor(u.timeOut);
		actionssendkeysdelete(u.timeOut);
		Thread.sleep(2000);
		WebElement OUT = driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[6]/textarea"));
		actionssendkeysdelete(OUT);
		Thread.sleep(1000);
		tofill(OUT, timeOUT);
		totabkey();
		Thread.sleep(2000);

		String Exp = "10:50";
		WebElement value = driver
				.findElement(By.xpath("//*[@id=\"dhot\"]/div[1]/div/div/div/table/tbody/tr[1]/td[16]"));
		String Actual = value.getText();
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(Exp, Actual);

		System.out.println("OT is created based on Enable allow Early OT");
		Thread.sleep(2000);

	}

	// Scenario 3:- PH and Rest Day Settings enable OLD RULE on PH with in shift
	// time

	@Given("System parameter and PH and Rest Day Settings Enable old rule accept with in shift time")
	public void system_parameter_and_ph_and_rest_day_settings_enable_old_rule_accept_with_in_shift_time()
			throws InterruptedException {

		s = new PHandRestpojo();
		sp = new settingsSPpojo();
		toClick(sp.Utility);
		tomovethecursor(sp.systemparameter);
		toClick(sp.systemparameter);
		Thread.sleep(1000);
		toClick(s.PHRestday);
		Thread.sleep(1000);
		toClick(s.OTonPHC);
		Thread.sleep(1000);
		toClick(s.PHoldm1);
		Thread.sleep(2000);
		Scrolldownjavascript();
		toClick(s.save);

	}

	@When("Check updates are showin update  by individual section {string} RowNumber {int}")
	public void check_updates_are_showin_update_by_individual_section_row_number(String SheetName, Integer RowNumber)
			throws InvalidFormatException, IOException, InterruptedException, AWTException {

		reader = new ExcelReader();
		s = new PHandRestpojo();
		u = new UpIpojo();
		Thread.sleep(1000);
		tomovethecursor(u.Transcaction);
		toClick(u.Transcaction);
		Thread.sleep(1000);
		toClick(u.upindi);
		Thread.sleep(1000);
		Explicitwait(u.input1);
		tomovethecursor(u.input1);
		Thread.sleep(1000);
		tofill(u.input1, "KARTHIKA");
		Thread.sleep(500);
		toenter();

		List<Map<String, String>> data = reader.getData("src/test/resources/Excel/Test Data.xlsx", SheetName);

		String fromdate = data.get(RowNumber).get("FromDate");
		actionssendkeysdelete(u.dateFromup);
		tomovethecursor(u.dateFromup);
		toClick(u.dateFromup);
		Thread.sleep(1000);
		Explicitwait(u.dateFromup);
		tofill(u.dateFromup, fromdate);
		toenter();

		actionssendkeysdelete(u.dateToup);
		String todate = data.get(RowNumber).get("ToDate");
		Thread.sleep(1000);
		Explicitwait(u.dateToup);
		tofill(u.dateToup, todate);
		toenter();

		toClick(u.searchbutton);

		String timeIN = data.get(RowNumber).get("Timein");
		Thread.sleep(1000);
		tomovethecursor(u.timeIn);
		actionssendkeysdelete(u.timeIn);
		Thread.sleep(2000);
		WebElement IN = driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[6]/textarea"));
		actionssendkeysdelete(IN);
		Thread.sleep(1000);
		tofill(IN, timeIN);
		totabkey();
		Thread.sleep(1000);

		String timeOUT = data.get(RowNumber).get("Timeout");
		Thread.sleep(500);
		tomovethecursor(u.timeOut);
		actionssendkeysdelete(u.timeOut);
		Thread.sleep(2000);
		WebElement OUT = driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[6]/textarea"));
		actionssendkeysdelete(OUT);
		Thread.sleep(1000);
		tofill(OUT, timeOUT);
		totabkey();
		Thread.sleep(2000);

		String Exp = "07:00";
		WebElement value = driver
				.findElement(By.xpath("//*[@id=\"dhot\"]/div[1]/div/div/div/table/tbody/tr[1]/td[16]"));
		String Actual = value.getText();
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(Exp, Actual);

		System.out.println("OT is created based on Enable allow Early OT");
		Thread.sleep(2000);

	}

	// Scenario 4:- PH and Rest Day Settings enable OLD RULE on PH out of shift time

	@Given("System parameter and PH and Rest Day Settings Enable old rule accept with out of shift time")
	public void system_parameter_and_ph_and_rest_day_settings_enable_old_rule_accept_with_out_of_shift_time()
			throws InterruptedException {

		System.out.println("old rule accept with out shift time");

	}

	@When("Check updates are update by individual section {string} RowNumber {int}")
	public void check_updates_are_update_by_individual_section_row_number(String SheetName, Integer RowNumber)
			throws InvalidFormatException, IOException, InterruptedException, AWTException {

		reader = new ExcelReader();
		s = new PHandRestpojo();
		u = new UpIpojo();
		Thread.sleep(1000);
		tomovethecursor(u.Transcaction);
		toClick(u.Transcaction);
		Thread.sleep(1000);
		toClick(u.upindi);
		Thread.sleep(1000);
		Explicitwait(u.input1);
		tomovethecursor(u.input1);
		Thread.sleep(1000);
		tofill(u.input1, "KARTHIKA");
		Thread.sleep(500);
		toenter();
		List<Map<String, String>> data = reader.getData("src/test/resources/Excel/Test Data.xlsx", SheetName);

		actionssendkeysdelete(u.dateFromup);
		String fromdate = data.get(RowNumber).get("FromDate");
		tomovethecursor(u.dateFromup);
		Thread.sleep(1000);
		tofill(u.dateFromup, fromdate);
		toenter();

		actionssendkeysdelete(u.dateToup);
		String todate = data.get(RowNumber).get("ToDate");
		Thread.sleep(1000);
		tofill(u.dateToup, todate);
		toenter();

		toClick(u.searchbutton);

		String timeIN = data.get(RowNumber).get("Timein");
		Thread.sleep(1000);
		tomovethecursor(u.timeIn);
		actionssendkeysdelete(u.timeIn);
		Thread.sleep(2000);
		WebElement IN = driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[6]/textarea"));
		actionssendkeysdelete(IN);
		Thread.sleep(1000);
		tofill(IN, timeIN);
		totabkey();
		Thread.sleep(1000);

		String timeOUT = data.get(RowNumber).get("Timeout");
		Thread.sleep(500);
		tomovethecursor(u.timeOut);
		actionssendkeysdelete(u.timeOut);
		Thread.sleep(2000);
		WebElement OUT = driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[6]/textarea"));
		actionssendkeysdelete(OUT);
		Thread.sleep(1000);
		tofill(OUT, timeOUT);
		totabkey();
		Thread.sleep(2000);

		String Exp = "10:00";
		WebElement value = driver
				.findElement(By.xpath("//*[@id=\"dhot\"]/div[1]/div/div/div/table/tbody/tr[1]/td[16]"));
		String Actual = value.getText();
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(Exp, Actual);

		System.out.println("OT is created based on Enable allow Early OT");
		Thread.sleep(2000);

	}

	// Scenario 5:- PH and Rest Day Settings enable NEW RULE on PH with in shift
	// time

	@Given("System parameter and PH and Rest Day Settings Enable new rule accept with in shift time")
	public void system_parameter_and_ph_and_rest_day_settings_enable_new_rule_accept_with_in_shift_time()
			throws InterruptedException {

		torefresh();
		s = new PHandRestpojo();
		sp = new settingsSPpojo();
		toClick(sp.Utility);
		tomovethecursor(sp.systemparameter);
		toClick(sp.systemparameter);
		Thread.sleep(1000);
		toClick(s.PHRestday);
		Thread.sleep(1000);
		toClick(s.PHnewm1);
		Thread.sleep(2000);
		Scrolldownjavascript();
		toClick(s.save);
	}

	@When("Check update by individual section {string} RowNumber {int}")
	public void check_update_by_individual_section_row_number(String SheetName, Integer RowNumber)
			throws InvalidFormatException, IOException, InterruptedException, AWTException {

		reader = new ExcelReader();
		s = new PHandRestpojo();
		u = new UpIpojo();
		Thread.sleep(1000);
		tomovethecursor(u.Transcaction);
		toClick(u.Transcaction);
		Thread.sleep(1000);
		toClick(u.upindi);
		Thread.sleep(1000);
		Explicitwait(u.input1);
		tomovethecursor(u.input1);
		Thread.sleep(1000);
		tofill(u.input1, "KARTHIKA");
		Thread.sleep(500);
		toenter();
		List<Map<String, String>> data = reader.getData("src/test/resources/Excel/Test Data.xlsx", SheetName);

		actionssendkeysdelete(u.dateFromup);
		String fromdate = data.get(RowNumber).get("FromDate");
		tomovethecursor(u.dateFromup);
		Thread.sleep(1000);
		tofill(u.dateFromup, fromdate);
		toenter();

		actionssendkeysdelete(u.dateToup);
		String todate = data.get(RowNumber).get("ToDate");
		Thread.sleep(1000);
		tofill(u.dateToup, todate);
		toenter();

		toClick(u.searchbutton);

		String timeIN = data.get(RowNumber).get("Timein");
		Thread.sleep(1000);
		tomovethecursor(u.timeIn);
		actionssendkeysdelete(u.timeIn);
		Thread.sleep(2000);
		WebElement IN = driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[6]/textarea"));
		actionssendkeysdelete(IN);
		Thread.sleep(1000);
		tofill(IN, timeIN);
		totabkey();
		Thread.sleep(1000);

		String timeOUT = data.get(RowNumber).get("Timeout");
		Thread.sleep(500);
		tomovethecursor(u.timeOut);
		actionssendkeysdelete(u.timeOut);
		Thread.sleep(2000);
		WebElement OUT = driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[6]/textarea"));
		actionssendkeysdelete(OUT);
		Thread.sleep(1000);
		tofill(OUT, timeOUT);
		totabkey();
		Thread.sleep(2000);

		String Exp = "08:00";
		WebElement value = driver
				.findElement(By.xpath("//*[@id=\"dhot\"]/div[1]/div/div/div/table/tbody/tr[1]/td[16]"));
		String Actual = value.getText();
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(Exp, Actual);

		System.out.println("OT is created based on Enable allow Early OT");
		Thread.sleep(2000);

	}

	// Scenario 6:- PH and Rest Day Settings enable NEW RULE on PH out of shift time

	@Given("System parameter and PH and Rest Day Settings Enable new rule accept with out of shift time")
	public void system_parameter_and_ph_and_rest_day_settings_enable_new_rule_accept_with_out_of_shift_time()
			throws InterruptedException {

		System.out.println("Enable new rule accept with out of shift time");

	}

	@When("updated in update by individual section {string} RowNumber {int}")
	public void updated_in_update_by_individual_section_row_number(String SheetName, Integer RowNumber)
			throws InvalidFormatException, IOException, InterruptedException, AWTException {

		reader = new ExcelReader();
		s = new PHandRestpojo();
		u = new UpIpojo();
		Thread.sleep(1000);
		tomovethecursor(u.Transcaction);
		toClick(u.Transcaction);
		Thread.sleep(1000);
		toClick(u.upindi);
		Thread.sleep(1000);
		Explicitwait(u.input1);
		tomovethecursor(u.input1);
		Thread.sleep(1000);
		tofill(u.input1, "KARTHIKA");
		Thread.sleep(500);
		toenter();
		List<Map<String, String>> data = reader.getData("src/test/resources/Excel/Test Data.xlsx", SheetName);

		actionssendkeysdelete(u.dateFromup);
		String fromdate = data.get(RowNumber).get("FromDate");
		tomovethecursor(u.dateFromup);
		Thread.sleep(1000);
		tofill(u.dateFromup, fromdate);
		toenter();

		actionssendkeysdelete(u.dateToup);
		String todate = data.get(RowNumber).get("ToDate");
		Thread.sleep(1000);
		tofill(u.dateToup, todate);
		toenter();

		toClick(u.searchbutton);

		String timeIN = data.get(RowNumber).get("Timein");
		Thread.sleep(1000);
		tomovethecursor(u.timeIn);
		actionssendkeysdelete(u.timeIn);
		Thread.sleep(2000);
		WebElement IN = driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[6]/textarea"));
		actionssendkeysdelete(IN);
		Thread.sleep(1000);
		tofill(IN, timeIN);
		totabkey();
		Thread.sleep(1000);

		String timeOUT = data.get(RowNumber).get("Timeout");
		Thread.sleep(500);
		tomovethecursor(u.timeOut);
		actionssendkeysdelete(u.timeOut);
		Thread.sleep(2000);
		WebElement OUT = driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[6]/textarea"));
		actionssendkeysdelete(OUT);
		Thread.sleep(1000);
		tofill(OUT, timeOUT);
		totabkey();
		Thread.sleep(2000);

		String Exp = "10:00";
		WebElement value = driver
				.findElement(By.xpath("//*[@id=\"dhot\"]/div[1]/div/div/div/table/tbody/tr[1]/td[16]"));
		String Actual = value.getText();
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(Exp, Actual);

		System.out.println("OT is created based on Enable allow Early OT");
		Thread.sleep(2000);
	}

	// Scenario 7:- PH and Rest Day Settings Enable OLD RULE and with in shift time on RestDay

	@Given("Go to system parameter and Enable old rule with in shift time on RestDay")
	public void go_to_system_parameter_and_enable_old_rule_with_in_shift_time_on_rest_day()
			throws InterruptedException {

		s = new PHandRestpojo();
		sp = new settingsSPpojo();
		Thread.sleep(1000);
		toClick(sp.Utility);
		tomovethecursor(sp.systemparameter);
		toClick(sp.systemparameter);
		toClick(s.PHRestday);
		Thread.sleep(1000);
		toClick(s.RDoldm1);
		Thread.sleep(1000);
		Scrolldownjavascript();
		toClick(s.save);
		Thread.sleep(2000);
	}

	@When("Changes are done in Update by individual section {string} RowNumber {int}")
	public void changes_are_done_in_update_by_individual_section_row_number(String SheetName, Integer RowNumber)
			throws InterruptedException, InvalidFormatException, IOException, AWTException {

		reader = new ExcelReader();
		s = new PHandRestpojo();
		u = new UpIpojo();
		Thread.sleep(1000);
		tomovethecursor(u.Transcaction);
		toClick(u.Transcaction);
		Thread.sleep(1000);
		toClick(u.upindi);
		Thread.sleep(1000);
		Explicitwait(u.input1);
		tomovethecursor(u.input1);
		Thread.sleep(1000);
		tofill(u.input1, "KARTHIKA");
		Thread.sleep(500);
		toenter();
		List<Map<String, String>> data = reader.getData("src/test/resources/Excel/Test Data.xlsx", SheetName);

		actionssendkeysdelete(u.dateFromup);
		String fromdate = data.get(RowNumber).get("FromDate");
		tomovethecursor(u.dateFromup);
		Thread.sleep(1000);
		tofill(u.dateFromup, fromdate);
		toenter();

		actionssendkeysdelete(u.dateToup);
		String todate = data.get(RowNumber).get("ToDate");
		Thread.sleep(1000);
		tofill(u.dateToup, todate);
		toenter();

		toClick(u.searchbutton);

		String timeIN = data.get(RowNumber).get("Timein");
		Thread.sleep(1000);
		tomovethecursor(u.timeinRD);
		actionssendkeysdelete(u.timeinRD);
		Thread.sleep(2000);
		WebElement IN = driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[6]/textarea"));
		actionssendkeysdelete(IN);
		Thread.sleep(1000);
		tofill(IN, timeIN);
		totabkey();
		Thread.sleep(1000);

		String timeOUT = data.get(RowNumber).get("Timeout");
		Thread.sleep(500);
		tomovethecursor(u.timeoutRD);
		actionssendkeysdelete(u.timeoutRD);
		Thread.sleep(2000);
		WebElement OUT = driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[6]/textarea"));
		Thread.sleep(500);
		actionssendkeysdelete(OUT);
		Thread.sleep(1000);
		tofill(OUT, timeOUT);
		totabkey();
		Thread.sleep(2000);

		String Exp = "04:00";
		WebElement value = driver
				.findElement(By.xpath("//*[@id=\"dhot\"]/div[1]/div/div/div/table/tbody/tr[2]/td[17]"));
		String Actual = value.getText();
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(Exp, Actual);

		String Exp1 = "03:00";
		WebElement value1 = driver
				.findElement(By.xpath("//*[@id=\"dhot\"]/div[1]/div/div/div/table/tbody/tr[2]/td[18]"));
		String Actual1 = value1.getText();
		SoftAssert soft1 = new SoftAssert();
		soft1.assertEquals(Exp1, Actual1);

		System.out.println("OT is created based on Enable allow Early OT");
		Thread.sleep(2000);

	}

	// Scenario:-9 PH and Rest Day Settings Enable OLD RULE and out of shift time on RestDay

	@Given("Go to system parameter and Enable old rule out of shift time on RestDay")
	public void go_to_system_parameter_and_enable_old_rule_out_of_shift_time_on_rest_day() throws InterruptedException {

		System.out.println("Enable old rule out of shift time on RestDay");
		
	}

	@When("Changes are show in Update by individual section {string} RowNumber {int}")
	public void changes_are_show_in_update_by_individual_section_row_number(String SheetName, Integer RowNumber)
			throws InterruptedException, InvalidFormatException, IOException, AWTException {

		reader = new ExcelReader();
		s = new PHandRestpojo();
		u = new UpIpojo();
		Thread.sleep(1000);
		tomovethecursor(u.Transcaction);
		toClick(u.Transcaction);
		Thread.sleep(1000);
		toClick(u.upindi);
		Thread.sleep(1000);
		Explicitwait(u.input1);
		tomovethecursor(u.input1);
		Thread.sleep(1000);
		tofill(u.input1, "KARTHIKA");
		Thread.sleep(500);
		toenter();
		List<Map<String, String>> data = reader.getData("src/test/resources/Excel/Test Data.xlsx", SheetName);

		actionssendkeysdelete(u.dateFromup);
		String fromdate = data.get(RowNumber).get("FromDate");
		tomovethecursor(u.dateFromup);
		Thread.sleep(1000);
		tofill(u.dateFromup, fromdate);
		toenter();

		actionssendkeysdelete(u.dateToup);
		String todate = data.get(RowNumber).get("ToDate");
		Thread.sleep(1000);
		tofill(u.dateToup, todate);
		toenter();

		toClick(u.searchbutton);

		String timeIN = data.get(RowNumber).get("Timein");
		Thread.sleep(1000);
		tomovethecursor(u.timeinRD);
		actionssendkeysdelete(u.timeinRD);
		Thread.sleep(2000);
		WebElement IN = driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[6]/textarea"));
		actionssendkeysdelete(IN);
		Thread.sleep(1000);
		tofill(IN, timeIN);
		totabkey();
		Thread.sleep(1000);

		String timeOUT = data.get(RowNumber).get("Timeout");
		Thread.sleep(500);
		tomovethecursor(u.timeoutRD);
		actionssendkeysdelete(u.timeoutRD);
		Thread.sleep(2000);
		WebElement OUT = driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[6]/textarea"));
		actionssendkeysdelete(OUT);
		Thread.sleep(1000);
		tofill(OUT, timeOUT);
		totabkey();
		Thread.sleep(2000);

		String Exp = "04:00";
		WebElement value = driver
				.findElement(By.xpath("//*[@id=\"dhot\"]/div[1]/div/div/div/table/tbody/tr[2]/td[17]"));
		String Actual = value.getText();
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(Exp, Actual);

		String Exp1 = "06:00";
		WebElement value1 = driver
				.findElement(By.xpath("//*[@id=\"dhot\"]/div[1]/div/div/div/table/tbody/tr[2]/td[18]"));
		String Actual1 = value1.getText();
		SoftAssert soft1 = new SoftAssert();
		soft1.assertEquals(Exp1, Actual1);

		System.out.println("OT is created based on Enable allow Early OT");
		Thread.sleep(2000);
	}

	// Scenario 9:- PH and Rest Day Settings Enable NEW RULE less than 4hrs on RestDay

	@Given("Go to system parameter and Enable new rule less than 4hrs on rest day")
	public void go_to_system_parameter_and_enable_new_rule_less_than_4PHandRestpojot_day() throws InterruptedException {

		s = new PHandRestpojo();
		sp = new settingsSPpojo();
		Thread.sleep(1000);
		toClick(sp.Utility);
		Explicitwait(sp.systemparameter);
		tomovethecursor(sp.systemparameter);
		toClick(sp.systemparameter);
		toClick(s.PHRestday);
		Thread.sleep(1000);
		toClick(s.RDnewm1);
		Thread.sleep(1000);
		Scrolldownjavascript();
		toClick(s.save);
		Thread.sleep(2000);

	}

	@When("Check whether changes done in Update by individual section {string} RowNumber {int}")
	public void check_whether_changes_done_in_update_by_individual_section_row_number(String SheetName,
			Integer RowNumber) throws InterruptedException, InvalidFormatException, IOException, AWTException {

		reader = new ExcelReader();
		s = new PHandRestpojo();
		u = new UpIpojo();
		Thread.sleep(1000);
		tomovethecursor(u.Transcaction);
		toClick(u.Transcaction);
		Thread.sleep(1000);
		toClick(u.upindi);
		Thread.sleep(1000);
		Explicitwait(u.input1);
		tomovethecursor(u.input1);
		Thread.sleep(1000);
		tofill(u.input1, "KARTHIKA");
		Thread.sleep(500);
		toenter();
		List<Map<String, String>> data = reader.getData("src/test/resources/Excel/Test Data.xlsx", SheetName);

		actionssendkeysdelete(u.dateFromup);
		String fromdate = data.get(RowNumber).get("FromDate");
		tomovethecursor(u.dateFromup);
		Thread.sleep(1000);
		tofill(u.dateFromup, fromdate);
		toenter();

		actionssendkeysdelete(u.dateToup);
		String todate = data.get(RowNumber).get("ToDate");
		Thread.sleep(1000);
		tofill(u.dateToup, todate);
		toenter();

		toClick(u.searchbutton);

		String timeIN = data.get(RowNumber).get("Timein");
		Thread.sleep(1000);
		tomovethecursor(u.timeinRD);
		actionssendkeysdelete(u.timeinRD);
		Thread.sleep(2000);
		WebElement IN = driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[6]/textarea"));
		actionssendkeysdelete(IN);
		Thread.sleep(1000);
		tofill(IN, timeIN);
		totabkey();
		Thread.sleep(1000);

		String timeOUT = data.get(RowNumber).get("Timeout");
		Thread.sleep(500);
		tomovethecursor(u.timeoutRD);
		actionssendkeysdelete(u.timeoutRD);
		Thread.sleep(2000);
		WebElement OUT = driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[6]/textarea"));
		actionssendkeysdelete(OUT);
		Thread.sleep(1000);
		tofill(OUT, timeOUT);
		totabkey();
		Thread.sleep(2000);

		String Exp = "04:00";
		WebElement value = driver
				.findElement(By.xpath("//*[@id=\"dhot\"]/div[1]/div/div/div/table/tbody/tr[2]/td[17]"));
		String Actual = value.getText();
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(Exp, Actual);

		System.out.println("OT is created based on Enable allow Early OT");
		Thread.sleep(2000);
	}

	// Scenario 10:- PH and Rest Day Settings Enable NEW RULE greater than 4hrs on RestDay

	@Given("Go to system parameter and Enable new rule greater than 4hrs on rest day")
	public void go_to_system_parameter_and_enable_new_rule_greater_PHandRestpojoon_rest_day()
			throws InterruptedException {

		System.out.println("Enable new rule greater than 4hrs on rest day");
	}

	@When("Check changes are changed in Update by individual section {string} RowNumber {int}")
	public void check_changes_are_changed_in_update_by_individual_section_row_number(String SheetName,
			Integer RowNumber) throws InterruptedException, InvalidFormatException, IOException, AWTException {

		reader = new ExcelReader();
		s = new PHandRestpojo();
		u = new UpIpojo();
		Thread.sleep(1000);
		tomovethecursor(u.Transcaction);
		toClick(u.Transcaction);
		Thread.sleep(1000);
		toClick(u.upindi);
		Thread.sleep(1000);
		Explicitwait(u.input1);
		tomovethecursor(u.input1);
		Thread.sleep(1000);
		tofill(u.input1, "KARTHIKA");
		Thread.sleep(500);
		toenter();
		List<Map<String, String>> data = reader.getData("src/test/resources/Excel/Test Data.xlsx", SheetName);

		actionssendkeysdelete(u.dateFromup);
		String fromdate = data.get(RowNumber).get("FromDate");
		tomovethecursor(u.dateFromup);
		Thread.sleep(1000);
		tofill(u.dateFromup, fromdate);
		toenter();

		actionssendkeysdelete(u.dateToup);
		String todate = data.get(RowNumber).get("ToDate");
		Thread.sleep(1000);
		tofill(u.dateToup, todate);
		toenter();

		toClick(u.searchbutton);

		String timeIN = data.get(RowNumber).get("Timein");
		Thread.sleep(1000);
		tomovethecursor(u.timeinRD);
		actionssendkeysdelete(u.timeinRD);
		Thread.sleep(2000);
		WebElement IN = driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[6]/textarea"));
		actionssendkeysdelete(IN);
		Thread.sleep(1000);
		tofill(IN, timeIN);
		totabkey();
		Thread.sleep(1000);

		String timeOUT = data.get(RowNumber).get("Timeout");
		Thread.sleep(500);
		tomovethecursor(u.timeoutRD);
		actionssendkeysdelete(u.timeoutRD);
		Thread.sleep(2000);
		WebElement OUT = driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[6]/textarea"));
		actionssendkeysdelete(OUT);
		Thread.sleep(1000);
		tofill(OUT, timeOUT);
		totabkey();
		Thread.sleep(2000);

		String Exp = "04:00";
		WebElement value = driver
				.findElement(By.xpath("//*[@id=\"dhot\"]/div[1]/div/div/div/table/tbody/tr[2]/td[17]"));
		String Actual = value.getText();
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(Exp, Actual);

		String Exp1 = "04:00";
		WebElement value1 = driver
				.findElement(By.xpath("//*[@id=\"dhot\"]/div[1]/div/div/div/table/tbody/tr[2]/td[18]"));
		String Actual1 = value1.getText();
		SoftAssert soft1 = new SoftAssert();
		soft1.assertEquals(Exp1, Actual1);

		System.out.println("OT is created based on Enable allow Early OT");
		Thread.sleep(2000);

	}

	// Scenario 11:- PH and Rest Day Settings Enable NEW RULE out of shift time with OT on RestDay

	@Given("Go to system parameter and Enable new rule out of shift time with OT on rest day")
	public void go_to_system_parameter_and_enable_new_rule_out_of_sPHandRestpojowith_ot_on_rest_day()
			throws InterruptedException {

		System.out.println("Enable new rule out of shift time with OT on rest day");
		
	}

	@When("changes are checked in Update by individual section {string} RowNumber {int}")
	public void changes_are_checked_in_update_by_individual_section_row_number(String SheetName, Integer RowNumber)
			throws InvalidFormatException, IOException, InterruptedException, AWTException {

		reader = new ExcelReader();
		s = new PHandRestpojo();
		u = new UpIpojo();
		Thread.sleep(1000);
		tomovethecursor(u.Transcaction);
		toClick(u.Transcaction);
		Thread.sleep(1000);
		toClick(u.upindi);
		Thread.sleep(1000);
		Explicitwait(u.input1);
		tomovethecursor(u.input1);
		Thread.sleep(1000);
		tofill(u.input1, "KARTHIKA");
		Thread.sleep(500);
		toenter();
		List<Map<String, String>> data = reader.getData("src/test/resources/Excel/Test Data.xlsx", SheetName);

		actionssendkeysdelete(u.dateFromup);
		String fromdate = data.get(RowNumber).get("FromDate");
		tomovethecursor(u.dateFromup);
		Thread.sleep(1000);
		tofill(u.dateFromup, fromdate);
		toenter();

		actionssendkeysdelete(u.dateToup);
		String todate = data.get(RowNumber).get("ToDate");
		Thread.sleep(1000);
		tofill(u.dateToup, todate);
		toenter();

		toClick(u.searchbutton);

		String timeIN = data.get(RowNumber).get("Timein");
		Thread.sleep(1000);
		tomovethecursor(u.timeinRD);
		actionssendkeysdelete(u.timeinRD);
		Thread.sleep(2000);
		WebElement IN = driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[6]/textarea"));
		actionssendkeysdelete(IN);
		Thread.sleep(1000);
		tofill(IN, timeIN);
		totabkey();
		Thread.sleep(1000);

		String timeOUT = data.get(RowNumber).get("Timeout");
		Thread.sleep(500);
		tomovethecursor(u.timeoutRD);
		actionssendkeysdelete(u.timeoutRD);
		Thread.sleep(2000);
		WebElement OUT = driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[6]/textarea"));
		Thread.sleep(1000);
		actionssendkeysdelete(OUT);
		Thread.sleep(1000);
		tofill(OUT, timeOUT);
		totabkey();
		Thread.sleep(2000);

		String Exp = "04:00";
		WebElement value = driver
				.findElement(By.xpath("//*[@id=\"dhot\"]/div[1]/div/div/div/table/tbody/tr[2]/td[17]"));
		String Actual = value.getText();
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(Exp, Actual);

		String Exp1 = "06:00";
		WebElement value1 = driver
				.findElement(By.xpath("//*[@id=\"dhot\"]/div[1]/div/div/div/table/tbody/tr[2]/td[18]"));
		String Actual1 = value1.getText();
		SoftAssert soft1 = new SoftAssert();
		soft1.assertEquals(Exp1, Actual1);

		System.out.println("OT is created based on Enable allow Early OT");
		Thread.sleep(2000);

	}

	// METHOD2

	// Scenario 13:- PH and Rest Day Settings Enable PH/REST Day Pay in Method 2 Rest day

	@Given("Go to system parameter and Enable PHREST Day and less than 4hrs on RD")
	public void go_to_system_parameter_and_enable_PHandRestpojo_and_less_than_4hrs_on_rd() throws InterruptedException {

		s = new PHandRestpojo();
		sp = new settingsSPpojo();
		toClick(sp.Utility);
		tomovethecursor(sp.systemparameter);
		toClick(sp.systemparameter);
		toClick(s.PHRestday);
		Thread.sleep(1000);
		toClick(s.SepePHRS);
		Thread.sleep(1000);
		Scrolldownjavascript();
		toClick(s.save);
		Thread.sleep(2000);

	}

	@When("Update by individual section {string} RowNumber {int}")
	public void update_by_individual_section_row_number(String SheetName, Integer RowNumber)
			throws InvalidFormatException, InterruptedException, IOException, AWTException {

		reader = new ExcelReader();
		s = new PHandRestpojo();
		u = new UpIpojo();
		Thread.sleep(1000);
		tomovethecursor(u.Transcaction);
		toClick(u.Transcaction);
		Thread.sleep(1000);
		toClick(u.upindi);
		Thread.sleep(1000);
		Explicitwait(u.input1);
		tomovethecursor(u.input1);
		Thread.sleep(1000);
		tofill(u.input1, "KARTHIKA");
		Thread.sleep(500);
		toenter();
		List<Map<String, String>> data = reader.getData("src/test/resources/Excel/Test Data.xlsx", SheetName);

		actionssendkeysdelete(u.dateFromup);
		String fromdate = data.get(RowNumber).get("FromDate");
		tomovethecursor(u.dateFromup);
		Thread.sleep(1000);
		tofill(u.dateFromup, fromdate);
		toenter();

		actionssendkeysdelete(u.dateToup);
		String todate = data.get(RowNumber).get("ToDate");
		Thread.sleep(1000);
		tofill(u.dateToup, todate);
		toenter();

		toClick(u.searchbutton);

		String timeIN = data.get(RowNumber).get("Timein");
		Thread.sleep(1000);
		tomovethecursor(u.timeinRD);
		actionssendkeysdelete(u.timeinRD);
		Thread.sleep(2000);
		WebElement IN = driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[6]/textarea"));
		actionssendkeysdelete(IN);
		Thread.sleep(1000);
		tofill(IN, timeIN);
		totabkey();
		Thread.sleep(1000);

		String timeOUT = data.get(RowNumber).get("Timeout");
		Thread.sleep(500);
		tomovethecursor(u.timeoutRD);
		actionssendkeysdelete(u.timeoutRD);
		Thread.sleep(2000);
		WebElement OUT = driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[6]/textarea"));
		actionssendkeysdelete(OUT);
		Thread.sleep(1000);
		tofill(OUT, timeOUT);
		totabkey();
		Thread.sleep(2000);

		String Exp = "1.00";
		WebElement value = driver
				.findElement(By.xpath("//*[@id=\"dhot\"]/div[1]/div/div/div/table/tbody/tr[2]/td[19]"));
		String Actual = value.getText();
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(Exp, Actual);

		System.out.println("OT is created based on Enable allow Early OT");
		Thread.sleep(2000);
	}

	// Scenario 14:-PH and Rest Day Settings Enable PH/REST Day Pay in Method 2 Rest day

	@Given("Go to system parameter and Enable PH\\/REST Day and greater than 4hrs on RD")
	public void go_to_system_parameter_and_enablPHandRestpojoday_and_greater_than_4hrs_on_rd()
			throws InterruptedException {

		System.out.println("Enable PH\\\\/REST Day and greater than 4hrs on RD");

	}

	@When("updates in Update by individual section {string} RowNumber {int}")
	public void updates_in_update_by_individual_section_row_number(String SheetName, Integer RowNumber)
			throws InvalidFormatException, IOException, AWTException, InterruptedException {

		reader = new ExcelReader();
		s = new PHandRestpojo();
		u = new UpIpojo();
		Thread.sleep(1000);
		tomovethecursor(u.Transcaction);
		toClick(u.Transcaction);
		Thread.sleep(1000);
		toClick(u.upindi);
		Thread.sleep(1000);
		Explicitwait(u.input1);
		tomovethecursor(u.input1);
		Thread.sleep(1000);
		tofill(u.input1, "KARTHIKA");
		Thread.sleep(500);
		toenter();
		List<Map<String, String>> data = reader.getData("src/test/resources/Excel/Test Data.xlsx", SheetName);

		actionssendkeysdelete(u.dateFromup);
		String fromdate = data.get(RowNumber).get("FromDate");
		tomovethecursor(u.dateFromup);
		Thread.sleep(1000);
		tofill(u.dateFromup, fromdate);
		toenter();

		actionssendkeysdelete(u.dateToup);
		String todate = data.get(RowNumber).get("ToDate");
		Thread.sleep(1000);
		tofill(u.dateToup, todate);
		toenter();

		toClick(u.searchbutton);

		String timeIN = data.get(RowNumber).get("Timein");
		Thread.sleep(1000);
		tomovethecursor(u.timeinRD);
		actionssendkeysdelete(u.timeinRD);
		Thread.sleep(2000);
		WebElement IN = driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[6]/textarea"));
		actionssendkeysdelete(IN);
		Thread.sleep(1000);
		tofill(IN, timeIN);
		totabkey();
		Thread.sleep(1000);

		String timeOUT = data.get(RowNumber).get("Timeout");
		Thread.sleep(500);
		tomovethecursor(u.timeoutRD);
		actionssendkeysdelete(u.timeoutRD);
		Thread.sleep(2000);
		WebElement OUT = driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[6]/textarea"));
		actionssendkeysdelete(OUT);
		Thread.sleep(1000);
		tofill(OUT, timeOUT);
		totabkey();
		Thread.sleep(2000);

		String Exp = "2.00";
		WebElement value = driver
				.findElement(By.xpath("//*[@id=\"dhot\"]/div[1]/div/div/div/table/tbody/tr[2]/td[19]"));
		String Actual = value.getText();
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(Exp, Actual);

		System.out.println("OT is created based on Enable allow Early OT");
		Thread.sleep(2000);
	}

	// Scenario 15: PH and Rest Day Settings Enable PH/REST Day Pay in Method 2 Rest day

	@Given("Go to system parameter and Enable PH\\/REST Day and more than 4hrs after shift out on RD")
	public void go_to_system_parameter_and_enable_ph_rePHandRestpojo_more_than_4hrs_after_shift_out_on_rd()
			throws InterruptedException {

		System.out.println("Enable PH\\\\/REST Day and more than 4hrs after shift out on RD");
	
	}

	@When("Check here Update by individual section {string} RowNumber {int}")
	public void check_here_update_by_individual_section_row_number(String SheetName, Integer RowNumber)
			throws InterruptedException, InvalidFormatException, IOException, AWTException {

		reader = new ExcelReader();
		s = new PHandRestpojo();
		u = new UpIpojo();
		Thread.sleep(1000);
		tomovethecursor(u.Transcaction);
		toClick(u.Transcaction);
		Thread.sleep(1000);
		toClick(u.upindi);
		Thread.sleep(1000);
		Explicitwait(u.input1);
		tomovethecursor(u.input1);
		Thread.sleep(1000);
		tofill(u.input1, "KARTHIKA");
		Thread.sleep(500);
		toenter();
		List<Map<String, String>> data = reader.getData("src/test/resources/Excel/Test Data.xlsx", SheetName);

		actionssendkeysdelete(u.dateFromup);
		String fromdate = data.get(RowNumber).get("FromDate");
		tomovethecursor(u.dateFromup);
		Thread.sleep(1000);
		tofill(u.dateFromup, fromdate);
		toenter();

		actionssendkeysdelete(u.dateToup);
		String todate = data.get(RowNumber).get("ToDate");
		Thread.sleep(1000);
		tofill(u.dateToup, todate);
		toenter();

		toClick(u.searchbutton);

		String timeIN = data.get(RowNumber).get("Timein");
		Thread.sleep(1000);
		tomovethecursor(u.timeinRD);
		actionssendkeysdelete(u.timeinRD);
		Thread.sleep(2000);
		WebElement IN = driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[6]/textarea"));
		actionssendkeysdelete(IN);
		Thread.sleep(1000);
		tofill(IN, timeIN);
		totabkey();
		Thread.sleep(1000);

		String timeOUT = data.get(RowNumber).get("Timeout");
		Thread.sleep(500);
		tomovethecursor(u.timeoutRD);
		actionssendkeysdelete(u.timeoutRD);
		Thread.sleep(2000);
		WebElement OUT = driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[6]/textarea"));
		actionssendkeysdelete(OUT);
		Thread.sleep(1000);
		tofill(OUT, timeOUT);
		totabkey();
		Thread.sleep(2000);

		String Exp1 = "03:00";
		WebElement value1 = driver
				.findElement(By.xpath("//*[@id=\"dhot\"]/div[1]/div/div/div/table/tbody/tr[2]/td[18]"));
		String Actual1 = value1.getText();
		SoftAssert soft1 = new SoftAssert();
		soft1.assertEquals(Exp1, Actual1);

		String Exp = "2.00";
		WebElement value = driver
				.findElement(By.xpath("//*[@id=\"dhot\"]/div[1]/div/div/div/table/tbody/tr[2]/td[19]"));
		String Actual = value.getText();
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(Exp, Actual);

		System.out.println("OT is created based on Enable allow Early OT");
		Thread.sleep(2000);
	}

	// Scenario 16:- Go to system parameter and Enable PH\\/REST Day more than 4hrs with in shift on PH

	@Given("Go to system parameter and Enable PH\\/REST Day more than 4hrs with in shift on PH")
	public void go_to_system_parameter_and_PHandRestpojorest_day_more_than_4hrs_with_in_shift_on_ph()
			throws InterruptedException {

		System.out.println("Enable PH\\\\/REST Day more than 4hrs with in shift on PH");

	}

	@When("Checked by Update by individual section {string} RowNumber {int}")
	public void checked_by_update_by_individual_section_row_number(String SheetName, Integer RowNumber)
			throws InvalidFormatException, InterruptedException, IOException, AWTException {

		reader = new ExcelReader();
		s = new PHandRestpojo();
		u = new UpIpojo();
		Thread.sleep(1000);
		tomovethecursor(u.Transcaction);
		toClick(u.Transcaction);
		Thread.sleep(1000);
		toClick(u.upindi);
		Thread.sleep(1000);
		Explicitwait(u.input1);
		tomovethecursor(u.input1);
		Thread.sleep(1000);
		tofill(u.input1, "KARTHIKA");
		Thread.sleep(500);
		toenter();
		List<Map<String, String>> data = reader.getData("src/test/resources/Excel/Test Data.xlsx", SheetName);

		actionssendkeysdelete(u.dateFromup);
		String fromdate = data.get(RowNumber).get("FromDate");
		tomovethecursor(u.dateFromup);
		Thread.sleep(1000);
		tofill(u.dateFromup, fromdate);
		toenter();

		actionssendkeysdelete(u.dateToup);
		String todate = data.get(RowNumber).get("ToDate");
		Thread.sleep(1000);
		tofill(u.dateToup, todate);
		toenter();

		toClick(u.searchbutton);

		String timeIN = data.get(RowNumber).get("Timein");
		Thread.sleep(1000);
		tomovethecursor(u.timeIn);
		actionssendkeysdelete(u.timeIn);
		Thread.sleep(2000);
		WebElement IN = driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[6]/textarea"));
		actionssendkeysdelete(IN);
		Thread.sleep(1000);
		tofill(IN, timeIN);
		totabkey();
		Thread.sleep(1000);

		String timeOUT = data.get(RowNumber).get("Timeout");
		Thread.sleep(500);
		tomovethecursor(u.timeOut);
		actionssendkeysdelete(u.timeOut);
		Thread.sleep(2000);
		WebElement OUT = driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[6]/textarea"));
		actionssendkeysdelete(OUT);
		Thread.sleep(1000);
		tofill(OUT, timeOUT);
		totabkey();
		Thread.sleep(2000);

		String Exp = "1.00";
		WebElement value = driver
				.findElement(By.xpath("//*[@id=\"dhot\"]/div[1]/div/div/div/table/tbody/tr[1]/td[19]"));
		String Actual = value.getText();
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(Exp, Actual);

		System.out.println("OT is created based on Enable allow Early OT");
		Thread.sleep(2000);
	}

	// Scenario 17:- Go to system parameter and Enable PH\\/REST Day and more than 4hrs after shift out on PH

	@Given("Go to system parameter and Enable PH\\/REST Day and more than 4hrs after shift out on PH")
	public void go_to_system_parameter_and_PHandRestpojorest_day_and_more_than_4hrs_after_shift_out_on_ph()
			throws InterruptedException {

		System.out.println("Enable PH\\\\/REST Day and more than 4hrs after shift out on PH");

	}

	@When("Checked in  Update by individual section {string} RowNumber {int}")
	public void checked_in_update_by_individual_section_row_number(String SheetName, Integer RowNumber)
			throws InterruptedException, InvalidFormatException, IOException, AWTException {

		reader = new ExcelReader();
		s = new PHandRestpojo();
		u = new UpIpojo();
		Thread.sleep(1000);
		tomovethecursor(u.Transcaction);
		toClick(u.Transcaction);
		Thread.sleep(1000);
		toClick(u.upindi);
		Thread.sleep(1000);
		Explicitwait(u.input1);
		tomovethecursor(u.input1);
		Thread.sleep(1000);
		tofill(u.input1, "KARTHIKA");
		Thread.sleep(500);
		toenter();
		List<Map<String, String>> data = reader.getData("src/test/resources/Excel/Test Data.xlsx", SheetName);

		actionssendkeysdelete(u.dateFromup);
		String fromdate = data.get(RowNumber).get("FromDate");
		tomovethecursor(u.dateFromup);
		Thread.sleep(1000);
		tofill(u.dateFromup, fromdate);
		toenter();

		actionssendkeysdelete(u.dateToup);
		String todate = data.get(RowNumber).get("ToDate");
		Thread.sleep(1000);
		tofill(u.dateToup, todate);
		toenter();

		toClick(u.searchbutton);

		String timeIN = data.get(RowNumber).get("Timein");
		Thread.sleep(1000);
		tomovethecursor(u.timeIn);
		actionssendkeysdelete(u.timeIn);
		Thread.sleep(2000);
		WebElement IN = driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[6]/textarea"));
		actionssendkeysdelete(IN);
		Thread.sleep(1000);
		tofill(IN, timeIN);
		totabkey();
		Thread.sleep(1000);

		String timeOUT = data.get(RowNumber).get("Timeout");
		Thread.sleep(500);
		tomovethecursor(u.timeOut);
		actionssendkeysdelete(u.timeOut);
		Thread.sleep(2000);
		WebElement OUT = driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[6]/textarea"));
		actionssendkeysdelete(OUT);
		Thread.sleep(1000);
		tofill(OUT, timeOUT);
		totabkey();
		Thread.sleep(2000);

		String Exp = "1.00";
		WebElement value = driver
				.findElement(By.xpath("//*[@id=\"dhot\"]/div[1]/div/div/div/table/tbody/tr[1]/td[19]"));
		String Actual = value.getText();
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(Exp, Actual);

		System.out.println("OT is created based on Enable allow Early OT");
		Thread.sleep(2000);

	}

	// Scenario 17:- system parameter and enable No NRM on PH

	@Given("system parameter and enable No NRM on PH")
	public void system_parameter_and_enable_no_nrm_on_ph() throws InterruptedException {

		s = new PHandRestpojo();
		sp = new settingsSPpojo();
		toClick(sp.Utility);
		tomovethecursor(sp.systemparameter);
		toClick(sp.systemparameter);
		toClick(s.PHRestday);
		Thread.sleep(1000);
		toClick(s.noNRMonPh);
		Thread.sleep(1000);
		Scrolldownjavascript();
		toClick(s.save);
		Thread.sleep(2000);
	}

	@When("check NRM is changed or not {string} RowNumber {int}")
	public void check_nrm_is_changed_or_not_row_number(String SheetName, Integer RowNumber)
			throws InterruptedException, InvalidFormatException, IOException, AWTException {

		reader = new ExcelReader();
		s = new PHandRestpojo();
		u = new UpIpojo();
		Thread.sleep(1000);
		tomovethecursor(u.Transcaction);
		toClick(u.Transcaction);
		toClick(u.upindi);
		Thread.sleep(1000);
		tomovethecursor(u.input1);
		Thread.sleep(1000);
		tofill(u.input1, "KARTHIKA");
		Thread.sleep(1000);
		toenter();
		List<Map<String, String>> data = reader.getData("src/test/resources/Excel/Test Data.xlsx", SheetName);
		actionssendkeysdelete(u.dateFromup);
		String fromdate = data.get(RowNumber).get("FromDate");
		Thread.sleep(1000);
		tomovethecursor(u.dateFromup);
		Thread.sleep(1000);
		tofill(u.dateFromup, fromdate);
		toenter();

		actionssendkeysdelete(u.dateToup);
		String todate = data.get(RowNumber).get("ToDate");
		Thread.sleep(1000);
		tofill(u.dateToup, todate);
		toenter();

		toClick(u.searchbutton);

		String timeIN = data.get(RowNumber).get("Timein");
		Thread.sleep(1000);
		tomovethecursor(u.timeinRD);
		actionssendkeysdelete(u.timeinRD);
		Thread.sleep(2000);
		WebElement IN = driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[6]/textarea"));
		actionssendkeysdelete(IN);
		Thread.sleep(1000);
		tofill(IN, timeIN);
		totabkey();
		Thread.sleep(1000);

		String timeOUT = data.get(RowNumber).get("Timeout");
		Thread.sleep(500);
		tomovethecursor(u.timeoutRD);
		actionssendkeysdelete(u.timeoutRD);
		Thread.sleep(2000);
		WebElement OUT = driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[6]/textarea"));
		Thread.sleep(1000);
		actionssendkeysdelete(OUT);
		Thread.sleep(1000);
		tofill(OUT, timeOUT);
		toenter();
		Thread.sleep(2000);
		System.out.println("OT is created based on Enable allow Early OT");
		Thread.sleep(2000);

	}

}
