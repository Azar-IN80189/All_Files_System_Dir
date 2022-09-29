package info.POJO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import info.base.Reusableclass;

public class UpIpojo extends Reusableclass{
	
	public UpIpojo() {

		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="//span[text()='Transaction']")
	public WebElement Transcaction;
	
	@FindBy(xpath="(//a[text()='Update By Individual'])[1]")
	public WebElement upindi;
	
	@FindBy(xpath="//*[@id=\"inputpicker-div-2\"]/span")
	public WebElement clickarrow;
	
	@FindBy(xpath="//input[@id='inputpicker-1']")
	public WebElement input1;
	
	@FindBy(xpath="//input[@id='txtFromDate']")
	public WebElement dateFromup;
	
	@FindBy(xpath="//input[@id='txtTodate']")
	public WebElement dateToup;
	
	@FindBy(xpath="//a[@id='inpbtnSearch']")
	public WebElement searchbutton;
	
	@FindBy(xpath="//*[@id=\"dhot\"]/div[1]/div/div/div/table/tbody/tr/td[7]")
	public WebElement timeIn;
	
	@FindBy(xpath="//*[@id=\"dhot\"]/div[6]/textarea")
	public WebElement textarea1;
	
	@FindBy(xpath="//*[@id=\"dhot\"]/div[1]/div/div/div/table/tbody/tr/td[8]")
	public WebElement timeOut;
	
	@FindBy(xpath="//*[@id=\"dhot\"]/div[1]/div/div/div/table/tbody/tr[2]/td[7]")
	public WebElement timeinRD;
	
	@FindBy(xpath="//*[@id=\"dhot\"]/div[1]/div/div/div/table/tbody/tr[2]/td[8]")
	public WebElement timeoutRD;
}
