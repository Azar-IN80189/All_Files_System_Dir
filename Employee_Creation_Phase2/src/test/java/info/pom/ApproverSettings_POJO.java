package info.pom;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApproverSettings_POJO extends info.base.BaseClass {
	public ApproverSettings_POJO() throws IOException {
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath = "//span[contains(.,'Administration')]")
	public WebElement Administrationclick;
	
	@FindBy(xpath = "//a[contains(.,'Approver Settings')]")
	public WebElement ApproverSettings;
	
	@FindBy(xpath = "//input[contains(@id,'txtEmpSearchText')]")
	public WebElement SearchEmployee;
	
	@FindBy(xpath = "//i[contains(@class,'fa fa-search')]")
	public WebElement SearchEmployeebtn;
	
	
	@FindBy(xpath = "//select[contains(@id,'dlFirstLevelApprover')]")
	public WebElement FirstApprover;
	
	@FindBy(xpath = "//select[contains(@id,'dlSecondLevelApprover')]")
	public WebElement SecondApprover;
	
	public WebElement getAdministrationclick() {
		return Administrationclick;
	}

	public void setAdministrationclick(WebElement administrationclick) {
		Administrationclick = administrationclick;
	}

	public WebElement getApproverSettings() {
		return ApproverSettings;
	}

	public void setApproverSettings(WebElement approverSettings) {
		ApproverSettings = approverSettings;
	}

	public WebElement getSearchEmployee() {
		return SearchEmployee;
	}

	public void setSearchEmployee(WebElement searchEmployee) {
		SearchEmployee = searchEmployee;
	}

	public WebElement getSearchEmployeebtn() {
		return SearchEmployeebtn;
	}

	public void setSearchEmployeebtn(WebElement searchEmployeebtn) {
		SearchEmployeebtn = searchEmployeebtn;
	}

	public WebElement getFirstApprover() {
		return FirstApprover;
	}

	public void setFirstApprover(WebElement firstApprover) {
		FirstApprover = firstApprover;
	}

	public WebElement getSecondApprover() {
		return SecondApprover;
	}

	public void setSecondApprover(WebElement secondApprover) {
		SecondApprover = secondApprover;
	}

	public WebElement getThirdApprover() {
		return ThirdApprover;
	}

	public void setThirdApprover(WebElement thirdApprover) {
		ThirdApprover = thirdApprover;
	}

	public WebElement getCheckboxclickEmployee() {
		return CheckboxclickEmployee;
	}

	public void setCheckboxclickEmployee(WebElement checkboxclickEmployee) {
		CheckboxclickEmployee = checkboxclickEmployee;
	}

	public WebElement getApproverSettingsSave() {
		return ApproverSettingsSave;
	}

	public void setApproverSettingsSave(WebElement approverSettingsSave) {
		ApproverSettingsSave = approverSettingsSave;
	}

	@FindBy(xpath = "//select[@id='ContentPlaceHolder1_dlThirdLevelApprover']")
	public WebElement ThirdApprover;
	
	@FindBy(xpath = "//input[contains(@id,'chkAll')]")
	public WebElement CheckboxclickEmployee;
	
	@FindBy(xpath = "//input[contains(@id,'btnSave')]")
	public WebElement ApproverSettingsSave;
	

	
	
	
	
	
	
}