package info.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import info.base.Reusableclass;

public class ExceptionReport_POJO extends Reusableclass {

	public ExceptionReport_POJO() {

		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath = "//span[contains(.,'Reports')]")
	public WebElement reportsmain;
	
	@FindBy(xpath = "//a[contains(@menu-caption,'Exception ')]")
	public WebElement Exceptionmain;
	
	@FindBy(xpath = "//input[contains(@id,'txtFromDate')]")
	public WebElement Exceptionfrom;
	
	@FindBy(xpath = "//input[contains(@id,'txtToDate')]")
	public WebElement Exceptionto;
	
	@FindBy(xpath = "//input[contains(@value,'Date')]")
	public WebElement Exceptionclockdateradiobtn;
	
	@FindBy(xpath = "//input[contains(@value,'Employee')]")
	public WebElement Exceptionemployeeradiobtn; 	
	
	@FindBy(xpath = "//input[contains(@value,'Lateness')]")
	public WebElement ExceptionLatenessradiobtn; 
	
	@FindBy(xpath = "//input[contains(@value,'Absentees')]")
	public WebElement ExceptionAbsenteesradiobtn; 	
	
	@FindBy(xpath = "//input[contains(@value,'MissingClocks')]")
	public WebElement ExceptionMissingClocksradiobtn; 	
	
	@FindBy(xpath = "//input[contains(@value,'OverTime')]")
	public WebElement ExceptionOverTimeradiobtn; 	
	
	
	@FindBy(xpath = "//input[@value='OT10N']")
	public WebElement ExceptionOverTime0t1; 
	@FindBy(xpath = "//input[@value='OT15N']")
	public WebElement ExceptionOverTime0t15; 
	@FindBy(xpath = "//input[@value='OT20N']")
	public WebElement ExceptionOverTime0t2; 
	@FindBy(xpath = "//input[@value='OT30N']")
	public WebElement ExceptionOverTime0t3; 
	@FindBy(xpath = "//input[contains(@value,'SflatN')]")
	public WebElement ExceptionOverTime0tflat; 
	
	@FindBy(xpath = "//input[contains(@value,'Allowance')]")
	public WebElement ExceptionAllowanceradiobtn; 
	
	
	@FindBy(xpath = "//input[contains(@value,'ShiftAllN')]")
	public WebElement Exceptionallowanceshift; 
	@FindBy(xpath = "//input[contains(@value,'AttdAllN')]")
	public WebElement Exceptionallowanceattendance; 
	@FindBy(xpath = "//input[@value='HealthAllN']")
	public WebElement Exceptionallowancehealth; 
	@FindBy(xpath = "//input[contains(@value,'MealAllN')]")
	public WebElement Exceptionallowancemeal; 
	@FindBy(xpath = "//input[contains(@value,'TranAllN')]")
	public WebElement Exceptionallowancetransport; 
	@FindBy(xpath = "//input[contains(@value,'Oth1AllN')]")
	public WebElement Exceptionallowanceothers1; 
	@FindBy(xpath = "//input[contains(@value,'Oth2AllN')]")
	public WebElement Exceptionallowanceothers2; 
	
	
	@FindBy(xpath = "//input[contains(@value,'Clocking')]")
	public WebElement ExceptionClockingradiobtn; 
	
	@FindBy(xpath = "//span[contains(@class,'form-control')]")
	public WebElement ExceptionClockingoperator; 
	
	@FindBy(xpath = "//select[contains(@name,'ddlClockingvalue')]")
	public WebElement ExceptionClockingdd; 
	
	
	
	
	@FindBy(xpath = "//input[contains(@value,'ClockOut')]")
	public WebElement ExceptionClockOutradiobtn; 
	
	
	
	@FindBy(xpath = "//select[contains(@name,'ddlClockOutCondition')]")
	public WebElement ExceptionClockoutoperator; 
	
	@FindBy(xpath = "//input[contains(@name,'txtClockOutTime')]")
	public WebElement ExceptionClockoutdd; 
	
	
	
	@FindBy(xpath = "//input[contains(@value,'IND')]")
	public WebElement Exceptionindividualradiobtn; 
	
	@FindBy(xpath = "//input[contains(@value,'DEP')]")
	public WebElement Exceptiondeptradiobtn; 
	
	@FindBy(xpath = "//input[@value='SEC']")
	public WebElement Exceptionsectionradiobtn; 
	
	@FindBy(xpath = "//input[contains(@value,'DES')]")
	public WebElement Exceptiondesignationradiobtn; 
	
	@FindBy(xpath = "//input[contains(@value,'CAT')]")
	public WebElement Exceptioncategoryradiobtn; 
	
	@FindBy(xpath = "//input[@value='DEG']")
	public WebElement Exceptiondesignationgroupradiobtn; 
	
	@FindBy(xpath = "//input[@onclick='checkAll(this);']")
	public WebElement Exceptionallchkbox;
	
	@FindBy(xpath = "//input[contains(@id,'txtGlobalSearch')]")
	public WebElement Exceptionsearchbox;
	
	@FindBy(xpath = "//a[@id='ContentPlaceHolder1_UCEmployeeList_lnkSearch']")
	public WebElement Exceptionsearchbtn;
	
	@FindBy(xpath = "//input[@onclick='checkAll(this);']")
	public WebElement Exceptionindividualchkall;
	
	@FindBy(xpath = "//input[@onclick='checkAll(this);']")
	public WebElement Exceptiondepartmentchkall;
	
	@FindBy(xpath = "//input[@onclick='checkAll(this);']")
	public WebElement Exceptionsectionchkall;
	
	@FindBy(xpath = "//input[@onclick='checkAll(this);']")
	public WebElement Exceptiondesignationchkall;
	
	@FindBy(xpath = "//input[@onclick='checkAll(this);']")
	public WebElement Exceptioncategorychkall;
	
	@FindBy(xpath = "//input[@onclick='checkAll(this);']")
	public WebElement Exceptiondesignationgroupchkall;
	
	@FindBy(xpath = "//input[@value='Preview']")
	public WebElement Exceptionexportbtn;
}
