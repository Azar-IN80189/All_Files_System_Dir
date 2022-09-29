package info.POJO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import info.base.Reusableclass;

public class PHandRestpojo extends Reusableclass{
	
	public PHandRestpojo() {
		
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
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_tabPHRestDaySetting_chkAllowEOTonPHC']")
	public WebElement OTonPHC;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_tabPHRestDaySetting_chkNoNRMonPH']")
	public WebElement noNRMonPh;
	
	@FindBy(xpath="//span[text()='PH-Rest Day Setting']")
	public WebElement PHRestday;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_tabPHRestDaySetting_rblEnableNRPHC_0']")
	public WebElement PHnewm1;

	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_tabPHRestDaySetting_rblEnableNRPHC_1']")
	public WebElement PHoldm1;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_tabPHRestDaySetting_rblEnableNRRESC_0']")
	public WebElement RDnewm1;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_tabPHRestDaySetting_rblEnableNRRESC_1']")
	public WebElement RDoldm1;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_tabPHRestDaySetting_chkSeparatePHRES']")
	public WebElement SepePHRS;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_tabPHRestDaySetting_chkSeparatePHRES']")
	public WebElement PHRESm2;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_btnSave']")
	public WebElement save;
	
	
	
	
	
	
	
	
	
}
