package info.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import info.base.Reusableclass;

public class ClockLocationDifferenceReport extends Reusableclass {
	public ClockLocationDifferenceReport() {

		PageFactory.initElements(driver, this);
}
	@FindBy(xpath = "//span[contains(.,'Reports')]")
	public WebElement reportsmain;
	
	@FindBy(xpath = "//a[@menu-caption='Clock Location Difference Report']")
	public WebElement Clocklocationdifferencereportmain;
	
	@FindBy(xpath = "//input[contains(@id,'txtFromDate')]")
	public WebElement Fromdatecldr;
	
	@FindBy(xpath = "//input[contains(@id,'txtToDate')]")
	public WebElement todatecldr;
	
	@FindBy(xpath = "//input[@value='IND']")
	public WebElement Individualradiobtn;
	
	@FindBy(xpath = "//input[@value='DEP']")
	public WebElement departmentradiobtn;
	
	@FindBy(xpath = "//input[contains(@value,'SEC')]")
	public WebElement sectionradiobtn;
	
	@FindBy(xpath = "//input[@value='DES']")
	public WebElement designationradiobtn;
	
	@FindBy(xpath = "//input[@value='CAT']")
	public WebElement categoryradiobtn;
	
	@FindBy(xpath = "//input[@value='DEG']")
	public WebElement Extraclassificationradiobtn;
	
	@FindBy(xpath = "//input[contains(@name,'chkAll')]")
	public WebElement Checkallindividual;
	
	
	
	
	
	
	
	
	
	
	
	
}
