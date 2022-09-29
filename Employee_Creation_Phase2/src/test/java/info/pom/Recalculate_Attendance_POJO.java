package info.pom;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import info.base.BaseClass;

public class Recalculate_Attendance_POJO extends BaseClass {
	

	public Recalculate_Attendance_POJO() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[contains(.,'Utility')]")
	public WebElement utilityclickRecalculate;
	
	
	@FindBy(xpath = "//a[contains(.,'Recalculate Attendance')]")
	public WebElement RecalculateAttendance;
	
	@FindBy(xpath = "//input[@id='txtFromDate']")
	public WebElement FromDateRecalc;
	
	@FindBy(xpath = "//input[@id='txtToDate']")
	public WebElement ToDateRecalc;
	
	@FindBy(xpath = "//input[contains(@id,'txtGlobalSearch')]")
	public WebElement EmployeeSearch;
	
	@FindBy(xpath = "(//i[@class='fa fa-search'])[1]")
	public WebElement EmployeeSearchbtn;
	
	@FindBy(xpath = "(//input[contains(@name,'chkAll')])[1]")
	public WebElement EmployeeSelect;
	
	@FindBy(xpath = "//input[@value='Recalculate']")
	public WebElement Recalculatebtn;
	
	@FindBy(xpath = "//input[@value='Clear']")
	public WebElement ClearBtn;

	public WebElement getUtilityclickRecalculate() {
		return utilityclickRecalculate;
	}

	public void setUtilityclickRecalculate(WebElement utilityclickRecalculate) {
		this.utilityclickRecalculate = utilityclickRecalculate;
	}

	public WebElement getRecalculateAttendance() {
		return RecalculateAttendance;
	}

	public void setRecalculateAttendance(WebElement recalculateAttendance) {
		RecalculateAttendance = recalculateAttendance;
	}

	public WebElement getFromDateRecalc() {
		return FromDateRecalc;
	}

	public void setFromDateRecalc(WebElement fromDateRecalc) {
		FromDateRecalc = fromDateRecalc;
	}

	public WebElement getToDateRecalc() {
		return ToDateRecalc;
	}

	public void setToDateRecalc(WebElement toDateRecalc) {
		ToDateRecalc = toDateRecalc;
	}

	public WebElement getEmployeeSearch() {
		return EmployeeSearch;
	}

	public void setEmployeeSearch(WebElement employeeSearch) {
		EmployeeSearch = employeeSearch;
	}

	public WebElement getEmployeeSearchbtn() {
		return EmployeeSearchbtn;
	}

	public void setEmployeeSearchbtn(WebElement employeeSearchbtn) {
		EmployeeSearchbtn = employeeSearchbtn;
	}

	public WebElement getEmployeeSelect() {
		return EmployeeSelect;
	}

	public void setEmployeeSelect(WebElement employeeSelect) {
		EmployeeSelect = employeeSelect;
	}

	public WebElement getRecalculatebtn() {
		return Recalculatebtn;
	}

	public void setRecalculatebtn(WebElement recalculatebtn) {
		Recalculatebtn = recalculatebtn;
	}

	public WebElement getClearBtn() {
		return ClearBtn;
	}

	public void setClearBtn(WebElement clearBtn) {
		ClearBtn = clearBtn;
	}
	
	
}