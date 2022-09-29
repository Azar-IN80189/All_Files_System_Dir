package info.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import info.base.Reusableclass;

public class AttendanceRequestStatusReport_POJO extends Reusableclass {
	public AttendanceRequestStatusReport_POJO() {

		PageFactory.initElements(driver, this);
}
	@FindBy(xpath = "//span[contains(.,'Reports')]")
	public WebElement reportsmain;
	
	@FindBy(xpath = "//a[contains(.,'Attendance Request Status Report')]")
	public WebElement ARSRmain;
	
	@FindBy(xpath = "//input[@value='IND']")
	public WebElement arsrIndividualrdobtn;
	
	@FindBy(xpath = "//input[@value='DEP']")
	public WebElement arsrDepartmentrdobtn;
	
	@FindBy(xpath = "//input[@value='SEC']")
	public WebElement arsrSectionrdobtn;
	
	@FindBy(xpath = "//input[@value='DES']")
	public WebElement arsrdesignationrdobtn;
	
	@FindBy(xpath = "//input[@value='CAT']")
	public WebElement arsrcategoryrdobtn;
	
	@FindBy(xpath = "//input[@value='DEG']")
	public WebElement arsrextraclassificationrdobtn;
	
	@FindBy(xpath = "//input[contains(@name,'chkAll')]")
	public WebElement arsrallchkbox;
	
	@FindBy(xpath = "//input[@value='Preview']")
	public WebElement arsrpreviewbtn;
	
	@FindBy(xpath = "//input[contains(@value,'ADMIN')]")
	public WebElement arsrsectiondeptdd;
	
	@FindBy(xpath = "//input[contains(@name,'btnClose')]")
	public WebElement arsrreportexitbtn;
	
	@FindBy(xpath = "//input[contains(@name,'dtPickStrtDate')]")
	public WebElement arsrfromdate;
	
	@FindBy(xpath = "//input[contains(@name,'dtPickEndDate')]")
	public WebElement arsrtodate;
	
	@FindBy(xpath = "//input[contains(@value,'Show')]")
	public WebElement arsrshowbtn;
	
	@FindBy(xpath = "//input[@value='APPLIED']")
	public WebElement arsrspendingchkbox;
	
	@FindBy(xpath = "//input[@value='APPROVED']")
	public WebElement arsrsapprovedchkbox;
	
	@FindBy(xpath = "//input[@value='REJECTED']")
	public WebElement arsrsrejectedchkbox;
	
	@FindBy(xpath = "//input[@value='CANCELLED']")
	public WebElement arsrscancelledchkbox;
	
	@FindBy(xpath = "//span[contains(.,'Attendance Request Status Report (Individual)')]")
	public WebElement arsrsindividualverification;
	
	@FindBy(xpath = "//span[contains(.,'Attendance Request Status Report (Department)')]")
	public WebElement arsrsdeptverification;
	
	@FindBy(xpath = "//span[contains(.,'Attendance Request Status Report (Section)')]")
	public WebElement arsrssectionverification;
	
	@FindBy(xpath = "//span[contains(.,'Attendance Request Status Report (Designation)')]")
	public WebElement arsrsdesignationverification;
	
	@FindBy(xpath = "//span[contains(.,'Attendance Request Status Report (Category)')]")
	public WebElement arsrscategoryverification;
	
	@FindBy(xpath = "//span[contains(.,'Attendance Request Status Report (Extra Classification)')]")
	public WebElement arsrsextraclassificationverification;
	
	
	
	
	
	
	
	
	
	
}
