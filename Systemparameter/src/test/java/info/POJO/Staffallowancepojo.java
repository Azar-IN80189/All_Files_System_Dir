package info.POJO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import info.base.Reusableclass;

public class Staffallowancepojo extends Reusableclass{
	
	public Staffallowancepojo() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="txtLogin")
	public WebElement username;
	
	@FindBy(id="txtPassword")
	public WebElement pwd;
	
	@FindBy(name="btnLogin")
	public WebElement click;

	@FindBy(id="tog1")
	public WebElement ChangeDB;

	@FindBy(id = "txtCustomerSearch")
	public WebElement DBname;

	@FindBy(xpath = "//*[@id=\"tblCustomerList\"]/tbody/tr[1]/td/li/a")
	public WebElement DBnameselect;

	@FindBy(id = "txtCustomerSearch")
	public WebElement DBnameenter;
	
	@FindBy(xpath="//a[text()='KARTHIKA']")
	public WebElement DBnam;
	
	@FindBy(xpath = "//span[text()='Allowance Settings']")
	public WebElement AllowanceSettings;
	
	@FindBy(xpath = "//a[@menu-caption='Staff Allowance']")
	public WebElement staffallowance;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_txtEmpSearchText']")
	public WebElement seacrchtext;
	
	@FindBy(xpath="//button[@class='btn bgInfo']")
	public WebElement search;
	
	@FindBy(xpath="//a[@id='ContentPlaceHolder1_gvEmpSearch_lnkEdit_0']")
	public WebElement editicon;
	
	@FindBy(id="ContentPlaceHolder1_tabContainer_tabAtt_ddlAllA1_DropDiv")
	public WebElement ddn;
	
	@FindBy(id="ContentPlaceHolder1_tabContainer_tabAtt_ddlAllA1_Input")
	public WebElement attendance;
	
	@FindBy(xpath="//*[@id=\"ContentPlaceHolder1_tabContainer_tabAtt_rblAtt_1\"]")
	public WebElement monthly;
	
	@FindBy(xpath="//*[@id=\"ContentPlaceHolder1_tabContainer_tabAtt_txtAttAllow\"]")
	public WebElement monthlyamount;
	
	@FindBy(xpath="//*[@id=\"ContentPlaceHolder1_tabContainer_tabAtt_chkAttAbsPen\"]")
	public WebElement monthlychkbox;
	
	@FindBy(xpath="//*[@id=\"ContentPlaceHolder1_tabContainer_tabAtt_txtAttlate\"]")
	public WebElement monthlyded;
	
	@FindBy(xpath="//*[@id=\"ContentPlaceHolder1_tabContainer_tabAtt_gvPartialDedAtt_lblRC1Ded1NAtt_0\"]")
	public WebElement ded1;
	
	@FindBy(xpath="//*[@id=\"ContentPlaceHolder1_tabContainer_tabAtt_gvPartialDedAtt_lblRC1Ded2NAtt_0\"]")
	public WebElement ded2;
	
	@FindBy(xpath="//*[@id=\"ContentPlaceHolder1_tabContainer_tabAtt_gvPartialDedAtt_lblRC1Ded3NAtt_0\"]")
	public WebElement ded3;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabContainer_tabAtt_ddlAllA1_Input']")
	public WebElement box1;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabContainer_tabAtt_ddlAllA2_Input']")
	public WebElement box2;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabContainer_tabAtt_ddlAllA3_Input']")
	public WebElement box3;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabContainer_tabAtt_ddlAllA4_Input']")
	public WebElement box4;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabContainer_tabAtt_ddlAllA5_Input']")
	public WebElement box5;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_tabContainer_tabAtt_ddlAllA6_Input']")
	public WebElement box6;
	
	@FindBy(id="ContentPlaceHolder1_tabContainer_tabAtt_ddlOpA1")
	public WebElement operator1;
	
	@FindBy(xpath="//*[@id='ContentPlaceHolder1_tabContainer_tabAtt_ddlOpA2']")
	public WebElement operator2;
	
	@FindBy(id="ContentPlaceHolder1_tabContainer_tabAtt_ddlOpA3")
	public WebElement operator3;
	
	@FindBy(id="ContentPlaceHolder1_tabContainer_tabAtt_ddlOpA4")
	public WebElement operator4;
	
	@FindBy(id="ContentPlaceHolder1_tabContainer_tabAtt_ddlOpA5")
	public WebElement operator5;
	
	@FindBy(id="(//a[@class='ajax__tab_tab'])[2]")
	public WebElement health;
	
	@FindBy(id="ContentPlaceHolder1_tabContainer_tabHealth_rblHea_0")
	public WebElement dailyhealth;
	
	@FindBy(id="ContentPlaceHolder1_tabContainer_tabHealth_ddlAllH1_Input")
	public WebElement healthbox1;
	
	@FindBy(id="ContentPlaceHolder1_tabContainer_tabHealth_ddlAllH2_Input")
	public WebElement healthbox2;
	
	@FindBy(id="ContentPlaceHolder1_tabContainer_tabHealth_ddlAllH3_Input")
	public WebElement healthbox3;
	
	@FindBy(id="ContentPlaceHolder1_tabContainer_tabHealth_ddlAllH4_Input")
	public WebElement healthbox4;
	
	@FindBy(id="ContentPlaceHolder1_tabContainer_tabHealth_ddlOpH1")
	public WebElement healthoperator1;
	
	@FindBy(id="ContentPlaceHolder1_tabContainer_tabHealth_ddlOpH2")
	public WebElement healthoperator2;
	
	@FindBy(id="ContentPlaceHolder1_tabContainer_tabHealth_rblHea_1")
	public WebElement monthlyhealth;
	
	@FindBy(id="transport: (//a[@class='ajax__tab_tab'])[3]")
	public WebElement transport;
	
	@FindBy(id="ContentPlaceHolder1_tabContainer_tabTrans_rblTra_0")
	public WebElement dailytransport;
	
	@FindBy(id="ContentPlaceHolder1_tabContainer_tabTrans_ddlAllT1_Input")
	public WebElement transportbox1;
	
	@FindBy(id="ContentPlaceHolder1_tabContainer_tabTrans_ddlAllT2_Input")
	public WebElement transportbox2;
	
	@FindBy(id="ContentPlaceHolder1_tabContainer_tabTrans_ddlAllT3_Input")
	public WebElement transportbox3;
	
	@FindBy(id=" ContentPlaceHolder1_tabContainer_tabTrans_ddlAllT4_Input")
	public WebElement transportbox4;
	
	@FindBy(id=" ContentPlaceHolder1_tabContainer_tabTrans_ddlOpT1")
	public WebElement transportoperator1;
	
	@FindBy(id="ContentPlaceHolder1_tabContainer_tabTrans_ddlOpT2")	
	public WebElement transportoperator2;
	
	@FindBy(id="ContentPlaceHolder1_tabContainer_tabTrans_ddlOpT3")
	public WebElement transportoperator3;
	
	@FindBy(id="__tab_ContentPlaceHolder1_tabContainer_tabMeals")
	public WebElement meals;
	
	@FindBy(id="ContentPlaceHolder1_tabContainer_tabMeals_rblMea_0")
	public WebElement dailymeals;
	
	@FindBy(id="ContentPlaceHolder1_tabContainer_tabMeals_ddlAllM1_Input")
	public WebElement mealsbox1;
	
	@FindBy(id="ContentPlaceHolder1_tabContainer_tabMeals_ddlAllM2_Input")
	public WebElement mealsbox2;
	
	@FindBy(id="ContentPlaceHolder1_tabContainer_tabMeals_ddlAllM3_Input")
	public WebElement mealsbox3;
	
	@FindBy(id="ContentPlaceHolder1_tabContainer_tabMeals_ddlAllM4_Input")
	public WebElement mealsbox4;
	
	@FindBy(id="ContentPlaceHolder1_tabContainer_tabMeals_ddlOpM1")
	public WebElement mealsoperator1;
	
	@FindBy(id="ContentPlaceHolder1_tabContainer_tabMeals_ddlOpM2")
	public WebElement mealsoperator2;
	
	@FindBy(id="ContentPlaceHolder1_tabContainer_tabMeals_ddlOpM3")
	public WebElement mealsoperator3;
	
	@FindBy(xpath="//input[@title='Click to save Allowance info']")
	public WebElement savebutton;
	
	@FindBy(xpath="//*[@id=\"ContentPlaceHolder1_gvEmpSearch_lnkASDel_0\"]")
	public WebElement Deletebutton;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_btnUpdate']")
	public WebElement Updatebutton;
	
	
	
	




}

