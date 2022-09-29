package info.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import info.base.Reusableclass;

public class AttendProblemReport_POJO extends Reusableclass {

	public AttendProblemReport_POJO() {

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//span[contains(.,'Reports')]")
	public WebElement reportsmain;
	
	@FindBy(xpath = "//a[contains(.,'Attend. Problem')]")
	public WebElement attendprobmain;
	
	@FindBy(xpath = "//input[contains(@value,'IND')]")
	public WebElement attendIndividualrdobtn;
	
	@FindBy(xpath = "//input[contains(@name,'txtGlobalSearch')]")
	public WebElement attendIndividualsearchbox;
	
	@FindBy(xpath = "//a[@class='btn bgInfo']")
	public WebElement attendIndividualsearchbtn;
	
	@FindBy(xpath = "//input[@value='DEP']")
	public WebElement attendDepartmentrdobtn;
	
	@FindBy(xpath = "//input[@value='SEC']")
	public WebElement attendSectionrdobtn;
	
	@FindBy(xpath = "//input[@value='DES']")
	public WebElement attenddesignationrdobtn;
	
	@FindBy(xpath = "//input[@value='CAT']")
	public WebElement attendcategoryrdobtn;
	
	@FindBy(xpath = "//input[@value='DEG']")
	public WebElement attendextraclassificationrdobtn;
	
	@FindBy(xpath = "//input[contains(@name,'chkAll')]")
	public WebElement attendallchkbox;
	
	@FindBy(xpath = "//input[contains(@value,'Show')]")
	public WebElement attendshowbtn;
	
	@FindBy(xpath = "//input[contains(@value,'ADMIN')]")
	public WebElement attendsectiondeptdd;
	
	@FindBy(xpath = "//input[contains(@name,'btnClose')]")
	public WebElement attendreportexitbtn;
	
	@FindBy(xpath = "//input[contains(@name,'txtFromDate')]")
	public WebElement attendprobfromdate;
	
	@FindBy(xpath = "//input[contains(@name,'txtToDate')]")
	public WebElement attendprobtodate;
	
	@FindBy(xpath = "//span[contains(.,'Attendance Problem Report (Individual)')]")
	public WebElement attendindividualverification;
	
	@FindBy(xpath = "//span[contains(.,'Attendance Problem Report (Department)')]")
	public WebElement attenddeptverification;
	
	@FindBy(xpath = "//span[contains(.,'Attendance Problem Report (Section)')]")
	public WebElement attendsectionverification;
	
	@FindBy(xpath = "//span[contains(.,'Attendance Problem Report (Designation)')]")
	public WebElement attenddesignationverification;
	
	@FindBy(xpath = "//span[contains(.,'Attendance Problem Report (Category)')]")
	public WebElement attendcategoryverification;
	
	@FindBy(xpath = "//span[contains(.,'Attendance Problem Report (Extra Classification)')]")
	public WebElement attendextraclassificationverification;
	
	
	
	
	
	
	
	
	
}
