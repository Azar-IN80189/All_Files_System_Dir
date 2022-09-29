package info.pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import info.pom.PageObjectModel;
import info.utility.ExcelReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeCreation extends info.base.Reusableclass {
	PageObjectModel p;
	
	static PageObjectModel s;
	@When("User need to enter in to Master and Employee basic details section with {string} and {int}")
	public void user_need_to_enter_in_to_Master_and_Employee_basic_details_section_with_and(String SheetName3, Integer RowNumber3) throws IOException, InvalidFormatException, InterruptedException, AWTException {
		p = new PageObjectModel();
		ExcelReader reader=new ExcelReader();
		implicitwait();
		toClick(p.Master);
		implicitwait();
		toClick(p.Basicemployeedetails);
		implicitwait();
		toClick(p.Newemp);
		Thread.sleep(3000);
		implicitwait();
		toClick(p.Etmscheckbox);
		implicitwait();
		toClick(p.ETMSsidetab);
		implicitwait();
		toselectbyindex(p.OTType, 0);
		implicitwait();
		//toClick(p.CheckWeeklyOt);
		//implicitwait();
		//p.workingothours.clear();
		//tofill(p.workingothours,"46.00");//Missing options
		//toenter();
		//implicitwait();
		toselectbyindex(p.BranchselectEtmsside, 0);
		implicitwait();
		List<Map<String,String>> testData=reader.getData("src/test/resources/Excel/Automation.xlsx", SheetName3);
		String SelectShiftEtmsside = testData.get(RowNumber3).get("Shift Name ");
		p.SelectShiftEtmsside.sendKeys(SelectShiftEtmsside);
		implicitwait();
		toselectbyindex(p.RestdayEtmsside,7);
		implicitwait();


	}

	@When("User Create a Employee by filling the employee form {string} and {int}")
	public void user_Create_a_Employee_by_filling_the_employee_form_and(String SheetName3, Integer RowNumber3) throws IOException, InvalidFormatException, AWTException, InterruptedException {
		ExcelReader reader=new ExcelReader();
		p = new PageObjectModel();

		List<Map<String,String>> testData=reader.getData("src/test/resources/Excel/Automation.xlsx", SheetName3);
		toClick(p.GeneralEtms);
		implicitwait();
		p.EmployeeCode.clear();
		String empcode = testData.get(RowNumber3).get("EmployeeCode");
		p.EmployeeCode.sendKeys(empcode);
		implicitwait();
		p.EmployeeName.clear();
		String empname = testData.get(RowNumber3).get("EmployeeName");
		p.EmployeeName.sendKeys(empname);
		implicitwait();
		String gender = testData.get(RowNumber3).get("GENDER");
		toselectbyvalue(p.Genderdrop,gender);
		implicitwait();
		String marital = testData.get(RowNumber3).get("MARITAL STATUS");
		toselectbyvalue(p.Maritialstatusdrop,marital);
		implicitwait();
		p.EMAIL.clear();
		String empemail = testData.get(RowNumber3).get("Employee Email");
		p.EMAIL.sendKeys(empemail);
		implicitwait();
		p.Mobilenumber.clear();
		String empmobile = testData.get(RowNumber3).get("Mobile Number");
		p.Mobilenumber.sendKeys(empmobile);
		implicitwait();
		String joiningdate = testData.get(RowNumber3).get("Join Date");
		p.JoinDate.sendKeys(joiningdate);
		toenter();
		implicitwait();
		String empprobationmonth = testData.get(RowNumber3).get("Probation");
		String fingerprintid = testData.get(RowNumber3).get("FaceReaderNumber");
		String hoursworked = testData.get(RowNumber3).get("Hours Worked");
		implicitwait();
		p.Probation.sendKeys(empprobationmonth);
		implicitwait();
		p.Facereaderenter.sendKeys(fingerprintid);
		implicitwait();
		p.Hoursworked.sendKeys(hoursworked);
		String department = testData.get(RowNumber3).get("BasicDepartmentname");
		toselectbyvisibletext(p.Department,department);
		Thread.sleep(2000);
		String Section = testData.get(RowNumber3).get("BasicSectionname");
		toselectbyvisibletext(p.Section, Section);
		String Designation = testData.get(RowNumber3).get("BasicDesignationname");
		toselectbyvisibletext(p.Designation,Designation);
		String ExtraClassification = testData.get(RowNumber3).get("BasicDesignationgroupname");
		toselectbyvisibletext(p.ExtraClassification,ExtraClassification);
		toselectbyindex(p.Holidaygroup,0);
		toselectbyindex(p.Parttimeflexi,0);
		String Category = testData.get(RowNumber3).get("BasicCategoryname");
		toselectbyvisibletext(p.Category,Category);
		toselectbyindex(p.Leavecategory,0);



	}


	@Then("User have to click save to create a employee")
	public void user_have_to_click_save_to_create_a_employee() throws IOException, InterruptedException, AWTException {

		p = new PageObjectModel();
		implicitwait();
		Scrolldownjavascript();
		Thread.sleep(3000);
		toClick(p.EmpbasicSave);
		Thread.sleep(5000);
	}

	@Given("User have to Reset {string} and {int}")
	public void user_have_to_Reset_and(String SheetName2, Integer RowNumber2) throws IOException, InvalidFormatException, InterruptedException, AWTException {
		ExcelReader reader=new ExcelReader();
		p = new PageObjectModel();
		driver.navigate().to("https://www.mailinator.com/v4/public/inboxes.jsp");
		implicitwait();
		tohandlewindows();
		toClick(p.SearchMailinator);
		List<Map<String,String>> testData=reader.getData("src/test/resources/Excel/Automation.xlsx", SheetName2);
		String SearchMailinator = testData.get(RowNumber2).get("SearchMail");
		p.SearchMailinator.sendKeys(SearchMailinator);
		Thread.sleep(800);
		toenter();
		Thread.sleep(2000);
		toClick(p.mailinatorvisiblemail);
		Thread.sleep(1000);
		Scrolldownjavascript();
		Thread.sleep(500);
		driver.switchTo().frame(p.frames);
		toClick(p.mailinatorresetpass);
		implicitwait();
		tohandlewindows();
		Explicitwait(p.Newpasswordreset);
		toClick(p.Newpasswordreset);
		String Newpasswordreset = testData.get(RowNumber2).get("Reset Password");
		p.Newpasswordreset.sendKeys(Newpasswordreset);
		Explicitwait(p.ReNewpasswordreset);
		toClick(p.ReNewpasswordreset);
		String ReNewpasswordreset = testData.get(RowNumber2).get("Reset Password");
		p.ReNewpasswordreset.sendKeys(ReNewpasswordreset);
		Explicitwait(p.savepasswordreset);
		toClick(p.savepasswordreset);
		toenter();
		implicitwait();
		Thread.sleep(1000);
		toenter();
		tohandlewindows();
		String Username = testData.get(RowNumber2).get("Employee Email");
		p.Username.sendKeys(Username);
		Thread.sleep(500);
		String password = testData.get(RowNumber2).get("Reset Password");
		p.password.sendKeys(password);
		toClick(p.click);
		Thread.sleep(1000);
		try {
			toClick(p.changepassworduser);
			Scrolldownjavascript();
			String currentpassworduser = testData.get(RowNumber2).get("Reset Password");
			p.currentpassworduser.sendKeys(currentpassworduser);
			String newpasschangeuser = testData.get(RowNumber2).get("Standard Password");
			p.newpasschangeuser.sendKeys(newpasschangeuser);
			String renewpasschangeuser = testData.get(RowNumber2).get("Standard Password");
			p.renewpasschangeuser.sendKeys(renewpasschangeuser);
			toClick(p.savechangepassworduser);
			Thread.sleep(2000);
			//toAcceptAlert();
			toenter();
			tohandlewindows();
			String Usernamelast = testData.get(RowNumber2).get("Employee Email");
			p.Username.sendKeys(Usernamelast);
			Thread.sleep(500);
			String passwordlast = testData.get(RowNumber2).get("Standard Password");
			p.password.sendKeys(passwordlast);
			toClick(p.click);
		} catch (Exception e) {
			Explicitwaitvisibility(p.logoutuser);
			toClick(p.logoutuser);
		}
		Explicitwaitvisibility(p.logoutuser);
		toClick(p.logoutuser);

		closebrowser();
	


	}
	
}
