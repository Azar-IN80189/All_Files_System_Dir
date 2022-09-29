package info.POJO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import info.base.Reusableclass;

public class Emailformatpojo extends Reusableclass{
	
	public Emailformatpojo() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//span[text()='Email Format']")
	public WebElement Email;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_TabPanel5_chkESelectAll']")
	public WebElement all;

	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_TabPanel5_chkEEmpCode']")
	public WebElement Empcode;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_TabPanel5_chkEEmpName']")
	public WebElement Empname;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_TabPanel5_chkEDesignation']")
	public WebElement designation;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_TabPanel5_chkEDept']")
	public WebElement dept;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_TabPanel5_chkETimeInOut']")
	public WebElement timeinout;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_TabPanel5_chkEOT']")
	public WebElement OT;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_TabPanel5_chkELate']")
	public WebElement Late;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_TabPanel5_chkEUnder']")
	public WebElement under;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_TabPanel5_ChkEShift']")
	public WebElement shift;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_TabPanel5_chkERea']")
	public WebElement Reason;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_TabPanel5_chkEOfficerComment']")
	public WebElement comment;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_TabPanel5_chkEStatus']")
	public WebElement status;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_TabPanel5_chkEApprovedBy']")
	public WebElement approved;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_TabPanel5_chkERemarks']")
	public WebElement remarks;
	
	
	// Supervisor locators
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_TabPanel5_chkSSelectAll']")
	public WebElement allsv;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_TabPanel5_chkSEmpCode']")
	public WebElement Empcodesv;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_TabPanel5_chkSEmpName']")
	public WebElement Empnamesv;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_TabPanel5_chkSDesignation']")
	public WebElement designationsv;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_TabPanel5_chkSDept']")
	public WebElement deptsv;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_TabPanel5_chkSTimeInOut']")
	public WebElement timeinoutsv;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_TabPanel5_chkSOT']")
	public WebElement OTsv;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_TabPanel5_chkSLate']")
	public WebElement Latesv;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_TabPanel5_chkSUnder']")
	public WebElement undersv;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_TabPanel5_chkSShift']")
	public WebElement shiftsv;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_TabPanel5_chkSRea']")
	public WebElement Reasonsv;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_TabPanel5_chkSOfficerComment']")
	public WebElement commentsv;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_TabPanel5_chkSStatus']")
	public WebElement statussv;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_TabPanel5_chkSApprovedBy']")
	public WebElement approvedsv;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_TabPanel5_chkSRemarks']")
	public WebElement remarkssv;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_btnSave']")
	public WebElement savebutton;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_TabMobile_chkEnableSchedule']")
	public WebElement mobiletms;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_btnSave']")
	public WebElement savebuttonMobile;
	
	
	
	
}
