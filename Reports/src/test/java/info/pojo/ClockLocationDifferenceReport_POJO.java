package info.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import info.base.Reusableclass;

public class ClockLocationDifferenceReport_POJO extends Reusableclass {
	public ClockLocationDifferenceReport_POJO() {

		PageFactory.initElements(driver, this);
}
	
	@FindBy(xpath = "//span[contains(.,'Reports')]")
	public WebElement reportsmain;
	
	@FindBy(xpath = "//a[contains(.,'Clock Location Difference Report')]")
	public WebElement Clocklocationdiffreportmain;
	
	@FindBy(xpath = "//input[contains(@value,'IND')]")
	public WebElement cldrIndividualrdobtn;
	
	@FindBy(xpath = "//input[@value='DEP']")
	public WebElement cldrDepartmentrdobtn;
	
	@FindBy(xpath = "//input[@value='SEC']")
	public WebElement cldrSectionrdobtn;
	
	@FindBy(xpath = "//input[@value='DES']")
	public WebElement cldrdesignationrdobtn;
	
	@FindBy(xpath = "//input[@value='CAT']")
	public WebElement cldrcategoryrdobtn;
	
	@FindBy(xpath = "//input[@value='DEG']")
	public WebElement cldrextraclassificationrdobtn;
	
	@FindBy(xpath = "//input[contains(@name,'chkAll')]")
	public WebElement cldrallchkbox;
	
	@FindBy(xpath = "//input[@value='Preview']")
	public WebElement cldrpreviewbtn;
	
	@FindBy(xpath = "//input[contains(@value,'ADMIN')]")
	public WebElement cldrsectiondeptdd;
	
	@FindBy(xpath = "//input[contains(@name,'btnClose')]")
	public WebElement cldrreportexitbtn;
	
	@FindBy(xpath = "//input[contains(@name,'txtFromDate')]")
	public WebElement cldrfromdate;
	
	@FindBy(xpath = "//input[contains(@name,'txtToDate')]")
	public WebElement cldrtodate;
	
	//Verification pojos
	
	@FindBy(xpath = "//a[contains(.,'Clock Location Difference Report')]")
	public WebElement cldrindividualverification;
	
	@FindBy(xpath = "//a[contains(.,'Clock Location Difference Report')]")
	public WebElement cldrdeptverification;
	
	@FindBy(xpath = "//a[contains(.,'Clock Location Difference Report')]")
	public WebElement cldrsectionverification;
	
	@FindBy(xpath = "//a[contains(.,'Clock Location Difference Report')]")
	public WebElement cldrdesignationverification;
	
	@FindBy(xpath = "//a[contains(.,'Clock Location Difference Report')]")
	public WebElement cldrcategoryverification;
	
	@FindBy(xpath = "//a[contains(.,'Clock Location Difference Report')]")
	public WebElement cldrextraclassificationverification;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
