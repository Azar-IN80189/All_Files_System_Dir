package info.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import info.base.Reusableclass;

public class Allowancepojo extends Reusableclass {

	public Allowancepojo() {

		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath="//input[@id='txtLogin']")
	public WebElement username;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	public WebElement pwd;
	
	@FindBy(xpath="//input[@id='btnLogin']")
	public WebElement click;

	@FindBy(xpath="(//a[@class='dropdown-toggle'])[2]")
	public WebElement ChangeDB;

	@FindBy(xpath="//input[@id='txtCustomerSearch']")
	public WebElement DBname;

	@FindBy(xpath = "//*[@id=\"tblCustomerList\"]/tbody/tr[1]/td/li/a")
	public WebElement DBnameselect;

	@FindBy(id = "txtCustomerSearch")
	public WebElement DBnameenter;
	
	@FindBy(xpath="//a[text()='KARTHIKA']")
	public WebElement DBnam;

	@FindBy(xpath = "//span[contains(.,'Allowance Settings')]")
	public WebElement AllowanceSettings;

	@FindBy(xpath = "//a[@menu-caption='Allowance']")
	public WebElement Allowance;

	@FindBy(xpath = "//a[@data-value='Add']")
	public WebElement newallowance;

	@FindBy(xpath = "//input[contains(@id,'txtAllowanceCode')]")
	public WebElement allowancecode;

	@FindBy(id="ContentPlaceHolder1_txtAllowanceName")
	public WebElement allowancename;

	@FindBy(id="ContentPlaceHolder1_txtAmount")
	public WebElement allowanceamount;

	@FindBy(id="ContentPlaceHolder1_chkInTime")
	public WebElement chkbytimein;
	
	@FindBy(xpath="//select[@id='ddlInTime']")
	public WebElement selectclkbytimein;
	
	@FindBy(id="txtInTime")
	public WebElement intime;
	
	@FindBy(id="ContentPlaceHolder1_chkOutTime")
	public WebElement chkbyouttime;
	
	@FindBy(xpath="//select[@id='ddlOutTime']")
	public WebElement selectclkbyouttime;
	
	@FindBy(id="txtOutTime")
	public WebElement outtime;
	
	@FindBy(id="ContentPlaceHolder1_chkActual")
	public WebElement chkactual;
	
	@FindBy(id="ddlActual")
	public WebElement selectdd1actual;
	
	@FindBy(id="txtActual")
	public WebElement actualtime;
	
	@FindBy(id="ContentPlaceHolder1_chkByNRM")
	public WebElement chkbynrm;
	
	@FindBy(id="ddlOpByNRM")
	public WebElement selectnrm;
	
	@FindBy(id="txtByNRM")
	public WebElement nrm;
	
	@FindBy(xpath="//span[@id='ContentPlaceHolder1_gvReason_lblReasonName_31']")
	public WebElement scrolldown;
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPwd() {
		return pwd;
	}

	
	public WebElement getClick() {
		return click;
	}

	public WebElement getScrolldown() {
		return scrolldown;
	}

	public WebElement getChangeDB() {
		return ChangeDB;
	}

	public WebElement getDBname() {
		return DBname;
	}

	public WebElement getDBnameselect() {
		return DBnameselect;
	}

	public WebElement getDBnameenter() {
		return DBnameenter;
	}

	public WebElement getDBnam() {
		return DBnam;
	}

	public WebElement getAllowanceSettings() {
		return AllowanceSettings;
	}

	public WebElement getAllowance() {
		return Allowance;
	}

	public WebElement getNewallowance() {
		return newallowance;
	}

	public WebElement getAllowancecode() {
		return allowancecode;
	}

	public WebElement getAllowancename() {
		return allowancename;
	}

	public WebElement getAllowanceamount() {
		return allowanceamount;
	}

	public WebElement getChkbytimein() {
		return chkbytimein;
	}

	public WebElement getSelectclkbytimein() {
		return selectclkbytimein;
	}

	public WebElement getIntime() {
		return intime;
	}

	public WebElement getChkbyouttime() {
		return chkbyouttime;
	}

	public WebElement getSelectclkbyouttime() {
		return selectclkbyouttime;
	}

	public WebElement getOuttime() {
		return outtime;
	}

	public WebElement getChkactual() {
		return chkactual;
	}

	public WebElement getSelectdd1actual() {
		return selectdd1actual;
	}

	public WebElement getActualtime() {
		return actualtime;
	}

	public WebElement getChkbynrm() {
		return chkbynrm;
	}

	public WebElement getSelectnrm() {
		return selectnrm;
	}

	public WebElement getNrm() {
		return nrm;
	}

	public WebElement getChkbyot() {
		return chkbyot;
	}

	public WebElement getSelectot() {
		return selectot;
	}

	public WebElement getOTtime() {
		return OTtime;
	}

	public WebElement getChkbylate() {
		return chkbylate;
	}

	public WebElement getSelectlate() {
		return selectlate;
	}

	public WebElement getLatetime() {
		return latetime;
	}

	public WebElement getChkbyearly() {
		return chkbyearly;
	}

	public WebElement getSelectearlytime() {
		return selectearlytime;
	}

	public WebElement getEarlyouttime() {
		return earlyouttime;
	}

	public WebElement getChkphrestday() {
		return chkphrestday;
	}

	public WebElement getSelectphrestday() {
		return selectphrestday;
	}

	public WebElement getPHrestday() {
		return PHrestday;
	}

	public WebElement getChkbyday() {
		return chkbyday;
	}

	public WebElement getChkallday() {
		return chkallday;
	}

	public WebElement getChkmonday() {
		return chkmonday;
	}

	public WebElement getChktuesday() {
		return chktuesday;
	}

	public WebElement getChkwednesday() {
		return chkwednesday;
	}

	public WebElement getChkthursday() {
		return chkthursday;
	}

	public WebElement getChkfriday() {
		return chkfriday;
	}

	public WebElement getChksaturday() {
		return chksaturday;
	}

	public WebElement getChksunday() {
		return chksunday;
	}

	public WebElement getChkbyshift() {
		return chkbyshift;
	}

	public WebElement getPayshift() {
		return chkpayshift;
	}

	public WebElement getChkallshift() {
		return chkallshift;
	}

	public WebElement getChkbyreason() {
		return chkbyreason;
	}

	public WebElement getChkpayreason() {
		return chkpayreason;
	}

	public WebElement getChkreasonall() {
		return chkreasonall;
	}

	public WebElement getChkclkloc() {
		return chkclkloc;
	}

	public WebElement getPayreasonchkall() {
		return payreasonchkall;
	}

	public WebElement getSave() {
		return save;
	}

	public WebElement getCancel() {
		return cancel;
	}
	@FindBy(id="ContentPlaceHolder1_chkByOT")
	public WebElement chkbyot;
	
	@FindBy(id="ddlOpByOT")
	public WebElement selectot;
	
	@FindBy(id="txtByOT")
	public WebElement OTtime;
	
	@FindBy(id="ContentPlaceHolder1_chkByLate")
	public WebElement chkbylate;
	
	@FindBy(id="ddlOpByLate")
	public WebElement selectlate;
	
	@FindBy(id="txtByLateness")
	public WebElement latetime;
	
	@FindBy(id="ContentPlaceHolder1_chkByEarly")
	public WebElement chkbyearly;
	
	@FindBy(xpath="//select[@id='ddlOpByEarly']")
	public WebElement selectearlytime;
	
	@FindBy(id="txtByEarlyOut")
	public WebElement earlyouttime;
	
	@FindBy(id="ContentPlaceHolder1_chkByPHRest")
	public WebElement chkphrestday;
	
	@FindBy(id="ddlOpByPHRest")
	public WebElement selectphrestday;
	
	@FindBy(id="txtByPHRest")
	public WebElement PHrestday;
	
	@FindBy(id="ContentPlaceHolder1_chkByDay")
	public WebElement chkbyday;
	
	@FindBy(id="ContentPlaceHolder1_chkAll")
	public WebElement chkallday;
	
	@FindBy(id="ContentPlaceHolder1_chkMonday")
	public WebElement chkmonday;
	
	@FindBy(id="ContentPlaceHolder1_chkTuesday")
	public WebElement chktuesday;
	
	@FindBy(id="ContentPlaceHolder1_chkWednesday")
	public WebElement chkwednesday;
	
	@FindBy(id="ContentPlaceHolder1_chkThursday")
	public WebElement chkthursday;
	
	@FindBy(id="ContentPlaceHolder1_chkFriday")
	public WebElement chkfriday;
	
	@FindBy(id="ContentPlaceHolder1_chkSaturday")
	public WebElement chksaturday;
	
	@FindBy(id="ContentPlaceHolder1_chkSunday")
	public WebElement chksunday;
	
	@FindBy(id="ContentPlaceHolder1_chkByShift")
	public WebElement chkbyshift;
	
	@FindBy(id="ContentPlaceHolder1_chbPayShift")
	public WebElement chkpayshift;
	
	@FindBy(id="ContentPlaceHolder1_gvShift_chkAll")
	public WebElement chkallshift;
	
	@FindBy(id="ContentPlaceHolder1_chkByReason")
	public WebElement chkbyreason;
	
	@FindBy(id="ContentPlaceHolder1_chbPayReason")
	public WebElement chkpayreason;
	
	@FindBy(id="ContentPlaceHolder1_gvReason_chkAll")
	public WebElement chkreasonall;
	
	@FindBy(id="ContentPlaceHolder1_chkByClockLocation")
	public WebElement chkclkloc;
	
	@FindBy(xpath="(//input[@id='C'])[2]")
	public WebElement payreasonchkall;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_btnSave']")
	public WebElement save;
	
	@FindBy(id="//input[@name='ctl00$ContentPlaceHolder1$btnCancel']")
	public WebElement cancel;

	@FindBy(id="ContentPlaceHolder1_gvShift_chkShiftCode_0")
	public WebElement shiftcode0;
	
	@FindBy(id="ContentPlaceHolder1_gvShift_chkShiftCode_1")
	public WebElement shiftcode1;
	
	@FindBy(id="ContentPlaceHolder1_gvShift_chkShiftCode_2")
	public WebElement shiftcode2;
	
	@FindBy(id="ContentPlaceHolder1_gvShift_chkShiftCode_3")
	public WebElement shiftcode3;
	
	@FindBy(id="ContentPlaceHolder1_gvReason_chkReason_0")
	public WebElement chkreason0;
	
	@FindBy(id="ContentPlaceHolder1_gvReason_chkReason_1")
	public WebElement chkreason1;
	
	@FindBy(id="ContentPlaceHolder1_gvReason_chkReason_2")
	public WebElement chkreason2;
	
	@FindBy(id="ContentPlaceHolder1_gvReason_chkReason_3")
	public WebElement chkreason3;
	
	@FindBy(id="ContentPlaceHolder1_gvReason_chkReason_4")
	public WebElement chkreason4;
	

//staffallowance
	
	@FindBy(xpath="(//span[@class='title'])[3]")
	public WebElement allowance;
	
	@FindBy(xpath="//a[@menu-caption='Staff Allowance']")
	public WebElement staffallowance;
	
	@FindBy(id="ContentPlaceHolder1_txtEmpSearchText")
	public WebElement searchtext;
	
	@FindBy(xpath="//button[@class='btn bgInfo']")
	public WebElement search;
	
	@FindBy(xpath=" //a[@class='btn editIcon']")
	public WebElement editicon;
	
	@FindBy(id="ContentPlaceHolder1_tabContainer_tabAtt_ddlAllA1_Input")
	public WebElement attendance;
	
	@FindBy(id="ContentPlaceHolder1_tabContainer_tabAtt_ddlAllA2_Input")
	public WebElement box1;
	
	@FindBy(id="ContentPlaceHolder1_tabContainer_tabAtt_ddlAllA3_Input")
	public WebElement box2;
	
	@FindBy(id="ContentPlaceHolder1_tabContainer_tabAtt_ddlAllA4_Input")
	public WebElement box3;
	
	@FindBy(id=" ContentPlaceHolder1_tabContainer_tabAtt_ddlAllA4_Input")
	public WebElement box4;
	
	@FindBy(id="ContentPlaceHolder1_tabContainer_tabAtt_ddlOpA1")
	public WebElement operator1;
	
	@FindBy(id=":ContentPlaceHolder1_tabContainer_tabAtt_ddlOpA2")
	public WebElement operator2;
	
	@FindBy(id="ContentPlaceHolder1_tabContainer_tabAtt_ddlOpA3")
	public WebElement operator3;
	
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	








}
