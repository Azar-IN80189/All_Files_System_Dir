package info.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import info.base.Reusableclass;

public class Inventory_Items_POJO extends Reusableclass
{
	public Inventory_Items_POJO() {

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//a[contains(.,'ballot Inventory')]")
	public WebElement Inventoryslide;
	
	@FindBy(xpath = "//a[@href='/inventory/items']")
	public WebElement Itemslide;
	
	@FindBy(xpath = "//button[@type='button'][contains(.,'add  Add Item')]")
	public WebElement Additembtn;
	
	@FindBy(xpath = "//button[contains(.,'add  Manage Category')]")
	public WebElement ManageCategorybtn;
	
	@FindBy(xpath = "//button[contains(.,'add  Manage Unit Type')]")
	public WebElement ManageUnitType;
	
	@FindBy(xpath = "//a[contains(.,'All')]")
	public WebElement AllTabheader;
	
	@FindBy(xpath = "//a[@data-toggle='tab'][contains(.,'Sales')]")
	public WebElement SalesTab;
	
	@FindBy(xpath = "//a[contains(.,'Purchases')]")
	public WebElement PurchasesTab;
	
	@FindBy(xpath = "//a[contains(.,'Inactive')]")
	public WebElement Inactivetab;
	
	
	//ADD ITEM SECTION POJO
	
	@FindBy(xpath = "//input[contains(@formcontrolname,'itemCode')]")
	public WebElement Itemcodesku;
	
	@FindBy(xpath = "//input[@formcontrolname='itemName']")
	public WebElement Itemname;
	
	@FindBy(xpath = "(//input[@type='text'])[11]")
	public WebElement TestDD;
	
	@FindBy(xpath = "//input[contains(@formcontrolname,'purchasePrice')]")
	public WebElement costpricetxtbox;
	
	@FindBy(xpath = "//label[@for='chkPurchaseItem']")
	public WebElement Ipurchasechkbox;
	
	@FindBy(xpath = "//label[contains(@for,'chkISellItem')]")
	public WebElement Isellchkbox;	
	
	@FindBy(xpath = "(//button[contains(.,'Save')])[2]")
	public WebElement Savebtn;	
	
	//SERVICE TAB
	
	@FindBy(xpath = "//a[contains(.,'Service')]")
	public WebElement ServiceTab;	
	
	
	//PRODUCT GROUP TAB
	
	@FindBy(xpath = "//a[contains(.,'Product Group')]")
	public WebElement ProductGroup;	
	
	@FindBy(xpath = "//input[@formcontrolname='itemCode']")
	public WebElement ItemcodeProductGroup;	
	
	@FindBy(xpath = "//input[@formcontrolname='itemName']")
	public WebElement ItemnameProductGroup;	
	
	@FindBy(xpath = "//textarea[@formcontrolname='groupDescription']")
	public WebElement DescriptionProductGroup;	
	
	@FindBy(xpath = "(//input[@type='text'])[8]")
	public WebElement items1ProductGroup;	
	
	@FindBy(xpath = "(//div[@col-id='Quantity'])[2]")
	public WebElement QuantityProductGroup;	
	
	@FindBy(xpath = "(//div[@col-id='PGPurchasePrice'])[2]")
	public WebElement PurchaseUnitpriceProductGroup;	
	
	@FindBy(xpath = "(//div[@col-id='SellingPrice'])[2]")
	public WebElement SellingpriceProductGroup;	
	
	@FindBy(xpath = "(//button[contains(.,'Save')])[2]")
	public WebElement SavebtnProductGroup;	
	
	
	//COMMON PATHS
	
	
	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	public WebElement CheckallboxItems;	
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	public WebElement Searchitems;	
	
	@FindBy(xpath = "//button[contains(.,'Delete')]")
	public WebElement Deletebtn;	
	
	//ManageCategory
	
	@FindBy(xpath = "//input[@formcontrolname='productCategoryName']")
	public WebElement Categorynametxtbox;
	
	@FindBy(xpath = "//button[contains(.,'add Add Category')]")
	public WebElement AddcategoryBtn;
	
	@FindBy(xpath = "(//button[contains(.,'Cancel')])[1]")
	public WebElement Cancelbtn;
	
	//ManageUnitType
	
	@FindBy(xpath = "//input[contains(@formcontrolname,'ItemUnitTypeName')]")
	public WebElement UnitTypename;
	
	@FindBy(xpath = "//label[contains(.,'Active')]")
	public WebElement Activechkbox;
	
	@FindBy(xpath = "//label[contains(.,'Default')]")
	public WebElement Defaultchkbox;
	
	@FindBy(xpath = "(//button[contains(.,'Save')])[3]")
	public WebElement SavebtnManageunittype;
	
	@FindBy(xpath = "(//font[contains(.,'OK')])[2]")
	public WebElement Okbtnclick;
	
	
}
