package info.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import info.base.Reusableclass;

public class WeeklyAttendanceReport_POJO extends Reusableclass {

	public WeeklyAttendanceReport_POJO() {

		PageFactory.initElements(driver, this);

	}
	
	//Weekly Attendance reports individual
	
	@FindBy(xpath = "//a[contains(.,'Weekly Attendance Report')]")
	public WebElement Weeklyattendancereportmain;
	
	@FindBy(xpath = "//input[contains(@id,'txtFromDate')]")
	public WebElement Weeklyattendancefrom;
	
	@FindBy(xpath = "//input[contains(@id,'txtToDate')]")
	public WebElement Weeklyattendanceto;
	
	
	@FindBy(xpath = "//input[@checked='checked']")
	public WebElement Weeklyattendanceindividualradiobtn;
	
	@FindBy(xpath = "//input[@onclick='checkAll(this);']")
	public WebElement Weeklyattendanceindividualallchkbox;
	
	@FindBy(xpath = "//input[contains(@id,'txtGlobalSearch')]")
	public WebElement Weeklyattendanceindividualsearchbox;
	
	
	@FindBy(xpath = "//a[@id='ContentPlaceHolder1_UCEmployeeList_lnkSearch']")
	public WebElement Weeklyattendanceindividualsearchbtn;
	
	@FindBy(xpath = "//input[contains(@value,'Show')]")
	public WebElement Weeklyattendanceindividualshowbtn;
	
	
	//Weekly Attendance reports Department
	
	@FindBy(xpath = "//input[contains(@value,'DEP')]")
	public WebElement Weeklyattendancedepartmentradiobtn;
	
	//Weekly Attendance reports Section
	
	@FindBy(xpath = "//input[contains(@name,'Input')]")
	public WebElement Weeklyattendancesectiondeptdd;
	
	//Weekly Attendance reports designation
	
	@FindBy(xpath = "//input[contains(@value,'DES')]")
	public WebElement Weeklyattendancedesignationradiobtn;
	
	//Weekly Attendance reports category
	
	@FindBy(xpath = "//input[contains(@value,'CAT')]")
	public WebElement Weeklyattendancecategoryradiobtn;
	
	//Weekly Attendance reports extraclassification
	
	@FindBy(xpath = "//input[contains(@value,'DEG')]")
	public WebElement Weeklyattendanceextraclassificationradiobtn;
	
	
	@FindBy(xpath = "//span[contains(.,'Weekly Attendance Report (By Individual)')]")
	public WebElement Weeklyattendanceindividualverification;
	
	@FindBy(xpath = "(//span[contains(.,'002  JOYCELYN ONG SHI CHING')])[2]")
	public WebElement Weeklyattendanceindividualjoyverification;
	
	//department
	
	@FindBy(xpath = "//span[contains(.,'Weekly Attendance Report (By Department)')]")
	public WebElement Weeklyattendancedeptverification;
	
	@FindBy(xpath = "//a[@target='_self'][contains(.,'ADMIN')]")
	public WebElement Weeklyattendanceonedeptverification;
	
	//section 
	
	@FindBy(xpath = "//input[@value='SEC']")
	public WebElement Weeklyattendancesectionradiobtn;
	
	@FindBy(xpath = "//span[contains(.,'Weekly Attendance Report (By Section)')]")
	public WebElement Weeklyattendancesectionverification;
	
	@FindBy(xpath = "(//a[contains(.,'NONE')])[1]")
	public WebElement Weeklyattendanceonesectionverification;
	
	//designation
	
	
	
	@FindBy(xpath = "//span[contains(.,'Weekly Attendance Report (By Designation)')]")
	public WebElement Weeklyattendancedesignationverification;
	
	@FindBy(xpath = "//a[contains(.,'GENERAL MANAGER')]")
	public WebElement Weeklyattendanceonedesignationverification;
	
	//category
	
	@FindBy(xpath = "//span[contains(.,'Weekly Attendance Report (By Category)')]")
	public WebElement Weeklyattendancecategoryverification;
	
	
	@FindBy(xpath = "//a[contains(.,'NON-EXECUTIVE')]")
	public WebElement Weeklyattendanceonecategoryverification;
	
	
	//Extra classification
	
	@FindBy(xpath = "//span[contains(.,'Weekly Attendance Report (By Designation Group)')]")
	public WebElement Weeklyattendanceclassificationverification;
	
	
	@FindBy(xpath = "(//a[contains(.,'NONE')])[1]")
	public WebElement Weeklyattendanceoneclassificationverification;
	
	
	
	
	
	
	
}
