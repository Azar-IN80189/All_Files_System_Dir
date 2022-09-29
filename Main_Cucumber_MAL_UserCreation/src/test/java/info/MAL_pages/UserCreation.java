package info.MAL_pages;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import info.base.Reusableclass;
import info.pom.UserCreation_MAL_POJO;
import info.utility.ExcelReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class UserCreation  extends Reusableclass{
	public static UserCreation_MAL_POJO s;

	@Given("User have to click Administrator and User creation in MAL")
	public void user_have_to_click_administrator_and_user_creation_in_mal() throws IOException, InterruptedException {
		s = new UserCreation_MAL_POJO();
		System.out.println("Creation page");
		pageUrl();
		pageTitle();
		//deletecookies();
		toClick(s.Administrator);
	}

	@When("User is entering in to user creation page in MAL")
	public void user_is_entering_in_to_user_creation_page_in_mal() throws IOException, InterruptedException {
		System.out.println("user is in usercreation page");
		s = new UserCreation_MAL_POJO();
		//highLightElement(s.UserCreation);
		clickjavascript(s.UserCreation);
	}

	@And("User need to create new user in MAL")
	public void user_need_to_create_new_user_in_mal() throws IOException, InterruptedException {
		s = new UserCreation_MAL_POJO();
		Explicitwaitvisibility(s.NewUser);
		toClick(s.NewUser);
		implicitwait();
	}

	@When("User entered the details required for User Creation from given in MAL {string} and {int}")
	public void user_entered_the_details_required_for_user_creation_from_given_in_mal_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
		s = new UserCreation_MAL_POJO();
		implicitwait();
		List<Map<String,String>> testData=reader.getData("src/test/resources/Excel/Automation.xlsx", SheetName);
		String user = testData.get(RowNumber).get("username");
		String email = testData.get(RowNumber).get("primaryemail");
		String phone = testData.get(RowNumber).get("mobilenumber");
		s.Displayname.sendKeys(user);
		s.primaryemail.sendKeys(email);
		s.mobilenumber.sendKeys(phone);
	}

	@And("User need to give superadmin permission in MAL")
	public void user_need_to_give_superadmin_permission_in_mal() throws IOException, InterruptedException {
		s = new UserCreation_MAL_POJO();
		toClick(s.showbasicsalary);
		toClick(s.allowlockattendencedetails);
		toClick(s.allowunlockattendencedetails);
		implicitwait();
		toClick(s.AppAccess);
		Thread.sleep(3000);
		toselectbyvisibletext(s.ETms, "ALL");
		WaitforLoadingIcontoDisappear(s.LoadingIcon);
		toselectbyvisibletext(s.ELeave, "ALL");
		WaitforLoadingIcontoDisappear(s.LoadingIcon);
		toselectbyvisibletext(s.EPayroll, "ALL");
		WaitforLoadingIcontoDisappear(s.LoadingIcon);
		ScrolldownElement(s.EAttendence);
		toselectbyvisibletext(s.EAttendence, "ALL");
		WaitforLoadingIcontoDisappear(s.LoadingIcon);
		ScrolldownElement(s.EClaim);
		toselectbyvisibletext(s.EClaim, "ALL");
		WaitforLoadingIcontoDisappear(s.LoadingIcon);
		ScrolldownElement(s.EAppraisal);
		toselectbyvisibletext(s.EAppraisal, "ALL");
		WaitforLoadingIcontoDisappear(s.LoadingIcon);
		Thread.sleep(6000);
		ScrollupElement(s.CompanyAcess);
		toClick(s.CompanyAcess);
		WaitforLoadingIcontoDisappear(s.LoadingIcon);
		toClick(s.Selectcompany);
		WaitforLoadingIcontoDisappear(s.LoadingIcon);
		
		Explicitwaitvisibility(s.DepartmentAccess);
		toClick(s.DepartmentAccess);
		WaitforLoadingIcontoDisappear(s.LoadingIcon);
		
		ScrolldownElement(s.ETmsSuperadmin);
		Selectcheckbox(s.ETmsSuperadmin);
		WaitforLoadingIcontoDisappear(s.LoadingIcon);
		
		ScrolldownElement(s.ETMSISAPPROVERCHKBOX);
		Explicitwaitvisibility(s.ETMSISAPPROVERCHKBOX);
		Selectcheckbox(s.ETMSISAPPROVERCHKBOX);
		WaitforLoadingIcontoDisappear(s.LoadingIcon);
		
		ScrolldownElement(s.ELeaveSuperadmin);
		Explicitwaitvisibility(s.ELeaveSuperadmin);
		Selectcheckbox(s.ELeaveSuperadmin);
		WaitforLoadingIcontoDisappear(s.LoadingIcon);
		
		ScrolldownElement(s.ELEAVEISAPPROVERCHKBOX);
		Explicitwaitvisibility(s.ELEAVEISAPPROVERCHKBOX);
		Selectcheckbox(s.ELEAVEISAPPROVERCHKBOX);
		WaitforLoadingIcontoDisappear(s.LoadingIcon);
		
		ScrolldownElement(s.EClaimSuperadmin);
		Explicitwaitvisibility(s.EClaimSuperadmin);
		Selectcheckbox(s.EClaimSuperadmin);
		WaitforLoadingIcontoDisappear(s.LoadingIcon);
		
		ScrolldownElement(s.ECLAIMISAPPROVERCHKBOX);
		Explicitwaitvisibility(s.ECLAIMISAPPROVERCHKBOX);
		Selectcheckbox(s.ECLAIMISAPPROVERCHKBOX);
		WaitforLoadingIcontoDisappear(s.LoadingIcon);
		
		ScrolldownElement(s.EPayrollSuperadmin);
		Explicitwaitvisibility(s.EPayrollSuperadmin);
		Selectcheckbox(s.EPayrollSuperadmin);
		WaitforLoadingIcontoDisappear(s.LoadingIcon);
		
		ScrolldownElement(s.EPAYROLLISAPPROVERCHKBOX);
		Explicitwaitvisibility(s.EPAYROLLISAPPROVERCHKBOX);
		Selectcheckbox(s.EPAYROLLISAPPROVERCHKBOX);
		WaitforLoadingIcontoDisappear(s.LoadingIcon);
		
		ScrolldownElement(s.EAttendenceSuperadmin);
		Explicitwaitvisibility(s.EAttendenceSuperadmin);
		Selectcheckbox(s.EAttendenceSuperadmin);
		WaitforLoadingIcontoDisappear(s.LoadingIcon);
		
		ScrolldownElement(s.EMOBILEISAPPROVERCHKBOX);
		Explicitwaitvisibility(s.EMOBILEISAPPROVERCHKBOX);
		Selectcheckbox(s.EMOBILEISAPPROVERCHKBOX);
		WaitforLoadingIcontoDisappear(s.LoadingIcon);
		ScrolldownElement(s.EAppraisalSuperadmin);
		
		Explicitwaitvisibility(s.EAppraisalSuperadmin);
		Selectcheckbox(s.EAppraisalSuperadmin);
		WaitforLoadingIcontoDisappear(s.LoadingIcon);
		
		ScrolldownElement(s.EAPPRAISALISAPPROVERCHKBOX);
		Explicitwaitvisibility(s.EAPPRAISALISAPPROVERCHKBOX);
		Selectcheckbox(s.EAPPRAISALISAPPROVERCHKBOX);
		WaitforLoadingIcontoDisappear(s.LoadingIcon);

	}

	@And("User need to give location access in MAL")
	public void user_need_to_give_location_access_in_mal() throws IOException, InterruptedException {
		s = new UserCreation_MAL_POJO();
		Explicitwaitvisibility(s.LocationAccess);
		Pageloadtimeout();
		toClick(s.LocationAccess);
		Thread.sleep(2000);
		toscrolldown("arguments[0].scrollIntoView(true)", s.LocationSave);

	}

	@And("User need to select the company in MAL")
	public void user_need_to_select_the_company_in_mal() throws IOException {
		s = new UserCreation_MAL_POJO();
		Pageloadtimeout();
		toClick(s.LocationSave);

	}

	@And("User need to click save finally for creating the user in MAL")
	public void user_need_to_click_save_finally_for_creating_the_user_in_mal() throws IOException {
		s = new UserCreation_MAL_POJO();
		Pageloadtimeout();
		System.out.println("User Created Successfully");
	}

	@And("User entered UserDetails as per the requirement in MAL")
	public void user_entered_user_details_as_per_the_requirement_in_mal() throws InterruptedException {
		Pageloadtimeout();
		System.out.println("User done");
		Thread.sleep(5000);
	}


}
