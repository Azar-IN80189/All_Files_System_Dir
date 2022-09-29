package info.pom;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import info.base.BaseClass;

public class Utility_Purgeandrepo_POJO extends BaseClass {
	

	public Utility_Purgeandrepo_POJO() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//span[contains(.,'Utility')]")
	public WebElement utilityclick;
	
	@FindBy(xpath = "//a[contains(.,'Purge And Reprocess')]")
	public WebElement Purgeandreprogressclick;
	
	@FindBy(xpath = "//input[@id='txtFromDate']")
	public WebElement FromDatepurge;
	
	@FindBy(xpath = "//input[@id='txtToDate']")
	public WebElement ToDatepurge;
	
	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_CheckBoxList1_0']")
	public WebElement purgecheckbox;
	
	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_CheckBoxList1_1']")
	public WebElement reprocesscheckbox;
	
	@FindBy(xpath = "//input[contains(@id,'txtGlobalSearch')]")
	public WebElement purgeandreposearch;
	
	@FindBy(xpath = "//a[contains(@id,'lnkSearch')]")
	public WebElement purgeandreposearchbtn;
	
	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_UCEmployeeList_gvEmpList_chkAll']")
	public WebElement checkemployeepurge;
	
	@FindBy(xpath = "//input[contains(@id,'btnProcess')]")
	public WebElement processbtn;
	
	@FindBy(xpath = "//input[contains(@id,'btnClear')]")
	public WebElement clearbtn;

	public WebElement getUtilityclick() {
		return utilityclick;
	}

	public void setUtilityclick(WebElement utilityclick) {
		this.utilityclick = utilityclick;
	}

	public WebElement getPurgeandreprogressclick() {
		return Purgeandreprogressclick;
	}

	public void setPurgeandreprogressclick(WebElement purgeandreprogressclick) {
		Purgeandreprogressclick = purgeandreprogressclick;
	}

	public WebElement getFromDatepurge() {
		return FromDatepurge;
	}

	public void setFromDatepurge(WebElement fromDatepurge) {
		FromDatepurge = fromDatepurge;
	}

	public WebElement getToDatepurge() {
		return ToDatepurge;
	}

	public void setToDatepurge(WebElement toDatepurge) {
		ToDatepurge = toDatepurge;
	}

	public WebElement getPurgecheckbox() {
		return purgecheckbox;
	}

	public void setPurgecheckbox(WebElement purgecheckbox) {
		this.purgecheckbox = purgecheckbox;
	}

	public WebElement getReprocesscheckbox() {
		return reprocesscheckbox;
	}

	public void setReprocesscheckbox(WebElement reprocesscheckbox) {
		this.reprocesscheckbox = reprocesscheckbox;
	}

	public WebElement getPurgeandreposearch() {
		return purgeandreposearch;
	}

	public void setPurgeandreposearch(WebElement purgeandreposearch) {
		this.purgeandreposearch = purgeandreposearch;
	}

	public WebElement getPurgeandreposearchbtn() {
		return purgeandreposearchbtn;
	}

	public void setPurgeandreposearchbtn(WebElement purgeandreposearchbtn) {
		this.purgeandreposearchbtn = purgeandreposearchbtn;
	}

	public WebElement getCheckemployeepurge() {
		return checkemployeepurge;
	}

	public void setCheckemployeepurge(WebElement checkemployeepurge) {
		this.checkemployeepurge = checkemployeepurge;
	}

	public WebElement getProcessbtn() {
		return processbtn;
	}

	public void setProcessbtn(WebElement processbtn) {
		this.processbtn = processbtn;
	}

	public WebElement getClearbtn() {
		return clearbtn;
	}

	public void setClearbtn(WebElement clearbtn) {
		this.clearbtn = clearbtn;
	}
	
}