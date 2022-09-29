package info.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import info.base.Reusableclass;

public class Tax_Rate_POJO extends Reusableclass
{
	public Tax_Rate_POJO() {

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//a[contains(.,'more_horiz Organization')]")
	public WebElement Organizationslide;
	
	@FindBy(xpath = "//a[@href='/organization/taxrate']")
	public WebElement Taxrateslide;	
	
	@FindBy(xpath = "//button[@type='button'][contains(.,'add  New Tax Rate')]")
	public WebElement Newtaxratebtn;	
	
	@FindBy(xpath = "//input[contains(@formcontrolname,'taxName')]")
	public WebElement TaxRateDisplayName;	
	
	@FindBy(xpath = "//input[contains(@formcontrolname,'taxCode')]")
	public WebElement TaxCode;	
	
	@FindBy(xpath = "(//input[contains(@type,'text')])[5]")
	public WebElement BoxNumberDD;	
	
	@FindBy(xpath = "(//span[@class='mat-checkbox-inner-container'])[1]")
	public WebElement PurchaseTaxChkbox;
	
	@FindBy(xpath = "(//span[@class='mat-checkbox-inner-container'])[2]")
	public WebElement SalesTaxChkbox;
	
	@FindBy(xpath = "//input[@formcontrolname='compoundName']")
	public WebElement Componentname;
	
	@FindBy(xpath = "//input[contains(@formcontrolname,'rate')]")
	public WebElement Componentpercentage;
	
	@FindBy(xpath = "//button[@type='button'][contains(.,'addAdd Component')]")
	public WebElement Addcomponentbtn;
	
	@FindBy(xpath = "/html/body/app-dashboard/div[1]/main/div/app-taxrate/div/div/div/div/div/div[1]/div/form/div/div[2]/div/div/div[5]/table/tbody/tr[2]/td[3]/button/span")
	public WebElement Removecomponentxbtn;
	
	
	@FindBy(xpath = "//button[contains(.,'Save')]")
	public WebElement Savebtn;
	
	@FindBy(xpath = "//input[contains(@id,'compound0')]")
	public WebElement compoundradiobtn;
	
	@FindBy(xpath = "//button[@type='button'][contains(.,'Yes, remove it!')]")
	public WebElement Yesremovebtn;
	
	@FindBy(xpath = "//input[contains(@id,'search-box')]")
	public WebElement Searchboxtax;
	
	@FindBy(xpath = "(//input[contains(@type,'checkbox')])[3]")
	public WebElement Checkboxtax;
	
	@FindBy(xpath = "(//i[contains(@class,'fa fa-pencil t-link edit')])[1]")
	public WebElement Edittax;
	
	@FindBy(xpath = "//button[contains(.,'Delete')]")
	public WebElement Deletebtn;
	
	
	
	
	
	
	
	
	
	
}
