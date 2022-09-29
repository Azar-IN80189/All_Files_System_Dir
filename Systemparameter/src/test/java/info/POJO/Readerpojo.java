package info.POJO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import info.base.Reusableclass;

public class Readerpojo extends Reusableclass {
	
	public Readerpojo() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//span[text()='Utility']")
	public WebElement Utility;
	
	@FindBy(xpath="//a[text()='System Parameter']")
	public WebElement systemparameter;
	
	@FindBy(xpath="//span[text()='Reader Integration']")
	public WebElement Reader;
	
	@FindBy(xpath="//a[@id='ContentPlaceHolder1_tabSysParam_tabClockInfo_lnkReaderAdd']")
	public WebElement New;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_tabClockInfo_txtAddClkLocCode']")
	public WebElement Readerid;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_tabClockInfo_txtAddClkLocName']")
	public WebElement Readername;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_tabClockInfo_btnReaderCancel']")
	public WebElement cancel;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_tabClockInfo_btnReaderSave']")
	public WebElement Add;
	
	@FindBy(xpath="//a[@id='ContentPlaceHolder1_tabSysParam_tabClockInfo_gvClkLoc_lnkJTEdit_0']")
	public WebElement edit;
	
	@FindBy(xpath="//a[@id='ContentPlaceHolder1_tabSysParam_tabClockInfo_gvClkLoc_lnkJTDel_0']")
	public WebElement delete;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_tabClockInfo_btnReaderUpdate']")
	public WebElement update;
	
	@FindBy(xpath="ContentPlaceHolder1_btnSave")
	public WebElement savebutton;
	
	
	
	
	
}
