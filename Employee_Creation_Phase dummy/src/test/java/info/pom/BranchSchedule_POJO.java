package info.pom;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BranchSchedule_POJO extends info.base.BaseClass{
	
	public BranchSchedule_POJO() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//span[@class='title'][contains(.,'Shift Settings')]")
	public WebElement ShiftSettingsBS;
	
	@FindBy(xpath = "//a[contains(.,'Branch Setup')]")
	public WebElement BranchsetupBS;
	
	@FindBy(xpath = "//a[contains(.,'Branch Schedule')]")
	public WebElement BranchschedhuleclickBS;
	
	@FindBy(xpath = "//select[contains(@id,'dlBranch')]")
	public WebElement BranchselectBS;
	
	@FindBy(xpath = "//input[contains(@name,'txtFromDate')]")
	public WebElement FromdateBS;
	
	@FindBy(xpath = "//input[contains(@id,'txtToDate')]")
	public WebElement TodateBS;
	
	@FindBy(xpath = "//input[contains(@id,'btnGenerate')]")
	public WebElement Createschedhulebtn;
	
	@FindBy(xpath = "//input[contains(@id,'btnDelete')]")
	public WebElement deleteschedhulebtn;
	
}
