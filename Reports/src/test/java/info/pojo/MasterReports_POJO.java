package info.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import info.base.Reusableclass;

public class MasterReports_POJO extends Reusableclass {

	public MasterReports_POJO() {

		PageFactory.initElements(driver, this);

	}
	//Master reports
	
	@FindBy(xpath = "//span[contains(.,'Reports')]")
	public WebElement reportsmain;
	
	@FindBy(xpath = "//a[contains(.,'Master Report')]")
	public WebElement Masterreportsmain;
	
	@FindBy(xpath = "//select[contains(@id,'ddlCategories')]")
	public WebElement Dropdownmaster;
	
	@FindBy(xpath = "//a[contains(.,'Preview')]")
	public WebElement previewmaster;
	
	@FindBy(xpath = "//select[contains(@id,'ddlOrderBy')]")
	public WebElement employeeorderdd;
	
	@FindBy(xpath = "//select[contains(@name,'ddlWrkTypes')]")
	public WebElement Shiftdd;
	
	@FindBy(xpath = "(//div[contains(.,'Company List')])[24]")
	public WebElement Companypdf;
	
	@FindBy(xpath = "(//div[contains(.,'Department List')])[24]")
	public WebElement deptpdf;
	
	@FindBy(xpath = "(//div[contains(.,'Section List')])[24]")
	public WebElement sectionpdf;
	
	@FindBy(xpath = "(//div[contains(.,'Designation List')])[24]")
	public WebElement Designationpdf;
	
	@FindBy(xpath = "(//div[contains(.,'Category List')])[24]")
	public WebElement Categorypdf;
	
	@FindBy(xpath = "(//div[contains(.,'Reason List')])[24]")
	public WebElement Leavereasonpdf;
	
	@FindBy(xpath = "(//div[contains(.,'Holiday List')])[24]")
	public WebElement Holidaypdf;
	
	@FindBy(xpath = "(//div[contains(.,'Employee List')])[24]")
	public WebElement Employeepdf;
	
	@FindBy(xpath = "(//div[contains(.,'001')])[23]")
	public WebElement employeecode001verification;
	
	@FindBy(xpath = "(//div[contains(.,'CHONG KEEN WAI')])[23]")
	public WebElement employeenameverification;
	
	@FindBy(xpath = "(//div[contains(.,'001')])[24]")
	public WebElement employeecardnoverification;
	
	@FindBy(xpath = "(//div[contains(.,'14-07-2014')])[23]")
	public WebElement employeejoindateverification;
	
	@FindBy(xpath = "(//div[contains(.,'ADMIN')])[23]")
	public WebElement employeedepartmentverification;
	
	@FindBy(xpath = "(//div[contains(.,'BUSINESS MANAGER')])[23]")
	public WebElement employeedesignationverification;
	
	@FindBy(xpath = "(//div[contains(.,'Allowance List')])[24]")
	public WebElement employeeallowanceverification;
	
	@FindBy(xpath = "(//div[contains(.,'Duty Rosters')])[24]")
	public WebElement employeeDutyRostersverification;
	
	@FindBy(xpath = "(//div[contains(.,'Auto Shifts')])[24]")
	public WebElement employeeautoshiftverification;
	
	@FindBy(xpath = "(//div[contains(.,'Locations')])[24]")
	public WebElement employeelocationverification;
	
	
	@FindBy(xpath = "(//div[contains(.,'01')])[25]")
	public WebElement employeeshiftverification;
	
	
	@FindBy(xpath = "(//div[contains(.,'Working Hours')])[24]")
	public WebElement employeeshiftallverification;
	
	
	
	
	
	
	
	
		
}
