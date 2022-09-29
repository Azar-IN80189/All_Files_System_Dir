package info.POJO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import info.base.Reusableclass;

public class settingsSPpojo extends Reusableclass {
	
	public settingsSPpojo()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="txtLogin")
	public WebElement username;
	
	@FindBy(id="txtPassword")
	public WebElement pwd;
	
	@FindBy(id="btnLogin")
	public WebElement click;

	@FindBy(xpath="(//a[@class='dropdown-toggle'])[2]")
	public WebElement ChangeDB;

	@FindBy(id ="txtCustomerSearch")
	public WebElement DBname;

	@FindBy(xpath="//span[text()='Utility']")
	public WebElement Utility;
	
	@FindBy(xpath="//a[text()='System Parameter']")
	public WebElement systemparameter;
	
	@FindBy(xpath="(//span[text()='Settings'])[2]")
	public WebElement settings;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_tabSettings_chkValidateNRIC']")
	public WebElement NRIC;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_tabSettings_chkShowResignedEmp']")
	public WebElement ResEmp;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_tabSettings_txtTerminateAfter']")
	public WebElement ResDate;

	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_tabSettings_chkGenEmpCodeAuto']")
	public WebElement Empcodeauto;

	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_tabSettings_txtFixedStartChar']")
	public WebElement Fixedcode;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_tabSettings_txtStartNumber']")
	public WebElement Numbercode;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_tabSettings_txtOther1']")
	public WebElement otherbox1;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_tabSettings_txtOther2']")
	public WebElement otherbox2;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_tabSettings_txtDesigGroupTitle']")
	public WebElement designationbox;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_tabSettings_chkFixNRM']")
	public WebElement FixNRMcheckbox;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_tabSettings_chkShow8Clock']")
	public WebElement showclock8;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_tabSettings_chkPresetOTBasedOnShift']")
	public WebElement basedonshift;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_tabSettings_chkFixLunch']")
	public WebElement Fixlunchcheckbox;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_tabSettings_chkHighLvlApprover']")
	public WebElement approvals;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_tabSettings_chkOT15']")
	public WebElement chkOT15;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_tabSettings_chkOTRTPH']")
	public WebElement chkOTRTPH;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_tabSettings_showOT30']")
	public WebElement showOT30;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_tabSettings_allowOTEdit']")
	public WebElement allowOTedit;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_tabSettings_showOTReason']")
	public WebElement showOTReason;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_btnSave']")
	public WebElement savebutton;
	
	@FindBy(xpath="//span[text()='Master']")
	public WebElement Master;
	
	@FindBy(xpath="//a[text()='Basic Master Setup']")
	public WebElement BasicMaster;
	
}
