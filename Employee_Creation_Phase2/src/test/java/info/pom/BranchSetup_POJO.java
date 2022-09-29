package info.pom;


import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BranchSetup_POJO extends info.base.BaseClass {
	public BranchSetup_POJO() throws IOException {
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath = "//a[contains(.,'Shift Settings')]")
	public WebElement shiftsettings;
	
	
	@FindBy(xpath = "//a[contains(.,'Branch Setup')]")
	public WebElement BranchSetupclick;

	@FindBy(xpath = "//a[@data-text='~/ETMS/Branch.aspx']")
	public WebElement Branchclick;

	@FindBy(xpath = "//a[@id='ContentPlaceHolder1_lnkManage']")
	public WebElement Branchsetupnewbtn;

	@FindBy(id ="ContentPlaceHolder1_txtShiftGroupCode")
	public WebElement Branchcode;

	@FindBy(id = "ContentPlaceHolder1_txtShiftGroupName")
	public WebElement Branchname;

	@FindBy(id = "ContentPlaceHolder1_tabContainer_tabBrnShift_txtShiftSearchText")
	public WebElement Searchshiftname;

	@FindBy(xpath = "(//i[@class='fa fa-search'])[2]")
	public WebElement Searchshiftbtn;

	@FindBy(id = "ContentPlaceHolder1_tabContainer_tabBrnShift_gvShiftMaster_chbIncludeAllDays")
	public WebElement Assigntobranch;

	@FindBy(xpath = "//input[@value='Save']")
	public WebElement BranchSetupSave;
	
	@FindBy(xpath = "//input[contains(@name,'chkSysClock')]")
	public WebElement CheckboxAssignshiftautomatic;
	
	@FindBy(xpath = "(//span[contains(.,'Shift Assignment')])[4]")
	public WebElement ShiftAssignment;
	
	@FindBy(xpath = "//input[contains(@id,'ContentPlaceHolder1_tabContainer_tabBrnShift_ddlShift_Input')]")
	public WebElement ShiftSelect;
	
	
	@FindBy(xpath = "//input[contains(@id,'rbAShift')]")
	public WebElement Autoshiftradioselect;
	
	@FindBy(xpath = "//input[contains(@id,'ContentPlaceHolder1_tabContainer_tabBrnShift_ddlAutoShift_Input')]")
	public WebElement Autoshiftradioshiftselect;
	
	public WebElement getCheckboxAssignshiftautomatic() {
		return CheckboxAssignshiftautomatic;
	}

	public void setCheckboxAssignshiftautomatic(WebElement checkboxAssignshiftautomatic) {
		CheckboxAssignshiftautomatic = checkboxAssignshiftautomatic;
	}

	public WebElement getBranchSetupclick() {
		return BranchSetupclick;
	}

	public void setBranchSetupclick(WebElement branchSetupclick) {
		BranchSetupclick = branchSetupclick;
	}

	public WebElement getBranchclick() {
		return Branchclick;
	}
	public WebElement getShiftsettings() {
		return shiftsettings;
	}

	public void setShiftsettings(WebElement shiftsettings) {
		this.shiftsettings = shiftsettings;
	}


	public void setBranchclick(WebElement branchclick) {
		Branchclick = branchclick;
	}

	public WebElement getBranchsetupnewbtn() {
		return Branchsetupnewbtn;
	}

	public void setBranchsetupnewbtn(WebElement branchsetupnewbtn) {
		Branchsetupnewbtn = branchsetupnewbtn;
	}

	public WebElement getBranchcode() {
		return Branchcode;
	}

	public void setBranchcode(WebElement branchcode) {
		Branchcode = branchcode;
	}

	public WebElement getBranchname() {
		return Branchname;
	}

	public void setBranchname(WebElement branchname) {
		Branchname = branchname;
	}

	public WebElement getSearchshiftname() {
		return Searchshiftname;
	}

	public void setSearchshiftname(WebElement searchshiftname) {
		Searchshiftname = searchshiftname;
	}

	public WebElement getSearchshiftbtn() {
		return Searchshiftbtn;
	}

	public void setSearchshiftbtn(WebElement searchshiftbtn) {
		Searchshiftbtn = searchshiftbtn;
	}

	public WebElement getAssigntobranch() {
		return Assigntobranch;
	}

	public void setAssigntobranch(WebElement assigntobranch) {
		Assigntobranch = assigntobranch;
	}

	public WebElement getBranchSetupSave() {
		return BranchSetupSave;
	}

	public void setBranchSetupSave(WebElement branchSetupSave) {
		BranchSetupSave = branchSetupSave;
	}
	
	
	
	
}
	