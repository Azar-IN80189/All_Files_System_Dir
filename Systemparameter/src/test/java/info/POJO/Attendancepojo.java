package info.POJO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import info.base.Reusableclass;

public class Attendancepojo extends Reusableclass{
	
	public Attendancepojo()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Attendance Process Setting']")
	public WebElement Attpro;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_tabDirectLink_chkMobileDirectLink']")
	public WebElement checkmbl;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_tabDirectLink_btnMobileTimeLogSyncNow']")
	public WebElement processatt;

	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_tabDirectLink_btnMobileTimeLogSyncNow']")
	public WebElement facereaderatt;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_tabDirectLink_btnADMSTimeLogSyncNow']")
	public WebElement processfacereaderatt;
	
	@FindBy(xpath="//*[@id=\"notificationIcon\"]/img")
	public WebElement bellicon;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_btnSave']")
	public WebElement savebutton;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_tabDirectLink_chkATDProcessWithTemperature']")
	public WebElement temp;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_tabDirectLink_txtTemperature']")
	public WebElement temperature;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabSysParam_tabDirectLink_chkATDProcessWithMask']")
	public WebElement tempwithmask;
	
}


