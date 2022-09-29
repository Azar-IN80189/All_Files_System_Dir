package info.pom;


import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModel extends info.base.Reusableclass {
	public PageObjectModel() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "//input[contains(@name,'Input')]")
	public WebElement SectionDepartment;
	
	@FindBy(id="ContentPlaceHolder1_txtEmpSearchText")
	public WebElement seacrchtext;

	@FindBy(id ="txtLogin")
	public WebElement Username;
	
	@FindBy(xpath ="//img[@src='../../../Artifacts/images/ChangeCustomer.svg']")
	public WebElement dbiconclick;
	
	
	@FindBy(xpath ="//*[@id=\\\"tblCustomerList\\\"]/tbody/tr[1]")
	public WebElement dbmovecursor;
	
	@FindBy(xpath ="//*[@id=\\\"tblCustomerList\\\"]/tbody/tr[1]")
	public WebElement dbnameclick;

	@FindBy(id = "txtPassword")
	public WebElement password;

	@FindBy(id = "btnLogin")
	public WebElement click;

	@FindBy(xpath = "//a[@title='Change Customer']")
	public WebElement Changecustomer;

	@FindBy(id = "txtCustomerSearch")
	public WebElement DBname;

	@FindBy(id = "tblCustomerList")
	public WebElement DBnameselect;

	@FindBy(id = "txtCustomerSearch")
	public WebElement DBnameenter;

	@FindBy(xpath = "//*[@id=\"tblCustomerList\"]/tbody/tr[1]/td/li/a")
	public WebElement DBnameselectteja;

	@FindBy(xpath = "//main//div//tr//td[@class='ng-binding']")
	public WebElement ClickEmail;

	@FindBy(xpath = "//span[normalize-space()='Logout']")
	public WebElement logoutuser;

	@FindBy(xpath = "(//a[@class='btn bgSuccess'])[2]")
	public WebElement changepassworduser;

	@FindBy(xpath = "(//input[@class='form-control'])[1]")
	public WebElement currentpassworduser;

	@FindBy(id = "ContentPlaceHolder1_tabContainer_tabProfile_txtNewPassword")
	public WebElement newpasschangeuser;

	@FindBy(id = "ContentPlaceHolder1_tabContainer_tabProfile_txtReEnterPassword")
	public WebElement renewpasschangeuser;

	@FindBy(id = "ContentPlaceHolder1_tabContainer_tabProfile_btnSavePassword")
	public WebElement savechangepassworduser;

	@FindBy(xpath = "//input[@id='inbox_field']")
	public WebElement SearchMailinator;

	@FindBy(xpath = "(//a[@rel='nofollow'])[5]")
	public WebElement scrollmailinator;

	@FindBy(xpath = "//td[@class='ng-binding']")
	public WebElement mailinatorname;

	@FindBy(id = "txtNewPassword")
	public WebElement Newpasswordreset;

	@FindBy(id = "txtReEnterPassword")
	public WebElement ReNewpasswordreset;

	@FindBy(id = "btnSavePassword")
	public WebElement savepasswordreset;

	@FindBy(xpath = "(//iframe[@title='HTML Email Message Body'])[1]")
	public WebElement frames;

	@FindBy(xpath = "(//a[contains(text(),'click here')])[1]")
	public WebElement mailinatorresetpass;

	@FindBy(xpath = "//td[@class='ng-binding']")
	public WebElement mailinatorvisiblemail;

	@FindBy(xpath = "(//span[@class='title'])[9]")
	public WebElement Administrator;

	@FindBy(xpath = "//a[@menu-caption='User Creation']")
	public WebElement UserCreation;

	@FindBy(id = "ContentPlaceHolder1_tabUsers_tabActiveUsers_lnkManage")
	public WebElement NewUser;

	@FindBy(id = "ContentPlaceHolder1_TabContainer1_TabPanel_Main_txtDisplayName")
	public WebElement Displayname;

	@FindBy(id = "chkIsMobNoLoginEnabled")
	public WebElement allowloginusingcheckbox;

	@FindBy(id = "ContentPlaceHolder1_TabContainer1_TabPanel_Main_txtEmail")
	public WebElement primaryemail;

	@FindBy(xpath = "//*[@id=\"ddlMobISO\"]/option[102]")
	public WebElement mobilearea;

	@FindBy(id = "txtMobileNo")
	public WebElement mobilenumber;

	@FindBy(id = "ContentPlaceHolder1_TabContainer1_TabPanel_Main_chkShowBasicSalary")
	public WebElement showbasicsalary;

	@FindBy(id = "ContentPlaceHolder1_TabContainer1_TabPanel_Main_chkAllowtolockAtd")
	public WebElement allowlockattendencedetails;

	@FindBy(id = "ContentPlaceHolder1_TabContainer1_TabPanel_Main_chkAllowtoUnlockAtd")
	public WebElement allowunlockattendencedetails;

	@FindBy(id = "__tab_ContentPlaceHolder1_TabContainer1_TabPanel_AppRights")
	public WebElement AppAccess;

	@FindBy(id = "ContentPlaceHolder1_TabContainer1_TabPanel_AppRights_dlETMSAccess")
	public WebElement ETms;

	@FindBy(id = "ContentPlaceHolder1_TabContainer1_TabPanel_AppRights_dlELeaveAccess")
	public WebElement ELeave;

	@FindBy(id = "ContentPlaceHolder1_TabContainer1_TabPanel_AppRights_dlEPayrollAccess")
	public WebElement EPayroll;

	@FindBy(id = "ContentPlaceHolder1_TabContainer1_TabPanel_AppRights_dlMobileAttendanceAccess")
	public WebElement EAttendence;

	@FindBy(id = "ContentPlaceHolder1_TabContainer1_TabPanel_AppRights_dlEClaimAccess")
	public WebElement EClaim;

	@FindBy(id = "ContentPlaceHolder1_TabContainer1_TabPanel_AppRights_dlEAppraisalAccess")
	public WebElement EAppraisal;

	@FindBy(id = "ContentPlaceHolder1_btnSave")
	public WebElement AppAccessSave;

	@FindBy(id = "ContentPlaceHolder1_btnCancel")
	public WebElement AppAccessCancel;

	@FindBy(id = "__tab_ContentPlaceHolder1_TabContainer1_TabPanel_CompanyRights")
	public WebElement CompanyAcess;

	@FindBy(id = "ContentPlaceHolder1_TabContainer1_TabPanel_CompanyRights_gvCompany_chkCompany_0")
	public WebElement Selectcompany;

	@FindBy(id = "ContentPlaceHolder1_btnSave")
	public WebElement CompanyAccessSave;

	@FindBy(id = "ContentPlaceHolder1_btnCancel")
	public WebElement CompanyAccessCancel;

	@FindBy(id = "__tab_ContentPlaceHolder1_TabContainer1_TabPanel_UserRights")
	public WebElement DepartmentAccess;

	@FindBy(id = "ContentPlaceHolder1_TabContainer1_TabPanel_UserRights_chkETMSIsSuperAdmin")
	public WebElement ETmsSuperadmin;

	@FindBy(id = "ContentPlaceHolder1_TabContainer1_TabPanel_UserRights_chkELEAVEIsSuperAdmin")
	public WebElement ELeaveSuperadmin;

	@FindBy(id = "ContentPlaceHolder1_TabContainer1_TabPanel_UserRights_chkEPAYROLLIsSuperAdmin")
	public WebElement EPayrollSuperadmin;

	@FindBy(id = "ContentPlaceHolder1_TabContainer1_TabPanel_UserRights_chkMOBILEATTENDANCEIsSuperAdmin")
	public WebElement EAttendenceSuperadmin;

	@FindBy(id = "ContentPlaceHolder1_TabContainer1_TabPanel_UserRights_chkECLAIMIsSuperAdmin")
	public WebElement EClaimSuperadmin;

	@FindBy(id = "ContentPlaceHolder1_TabContainer1_TabPanel_UserRights_chkEAPPRAISALIsSuperAdmin")
	public WebElement EAppraisalSuperadmin;

	@FindBy(id = "ContentPlaceHolder1_btnSave")
	public WebElement DepartmentAccessSave;

	@FindBy(id = "ContentPlaceHolder1_btnCancel")
	public WebElement DepartmentAccessCancel;

	@FindBy(id = "__tab_ContentPlaceHolder1_TabContainer1_tbpLocationAccess")
	public WebElement LocationAccess;

	@FindBy(id = "chkLocationAll")
	public WebElement LocationAll;

	@FindBy(id = "ContentPlaceHolder1_btnSave")
	public WebElement LocationSave;

	@FindBy(id = "ContentPlaceHolder1_btnCancel")
	public WebElement LocationDelete;
	@FindBy(xpath="(//a[@href='#'])[7]")
	public WebElement Master;
	@FindBy(xpath="//a[@menu-caption='Employee Basic Details']")
	public WebElement Basicemployeedetails;
	@FindBy(xpath="(//a[@class='btn bgSuccess'])[4]")
	public WebElement Newemp;
	@FindBy(id="chkAppETMS")
	public WebElement Etmscheckbox;
	@FindBy(id="chkAppMOBILEATTENDANCE")
	public WebElement Mobileattendencecheck;
	@FindBy(id="txtEmpCode")		
	public WebElement EmployeeCode;
	@FindBy(id="txtEmpName")
	public WebElement EmployeeName;
	@FindBy(id="dlGender")
	public WebElement Genderdrop;
	@FindBy(id="ddlMarital")
	public WebElement Maritialstatusdrop;
	@FindBy(id="txtEmail")
	public WebElement EMAIL;
	@FindBy(id="ddlMobISO")
	public WebElement MOBILEAREA;
	@FindBy(id="txtMobileNo")
	public WebElement Mobilenumber;
	@FindBy(xpath="//input[@id='txtJoinDate']")
	public WebElement JoinDate;
	@FindBy(xpath="//input[@id='txtProbation']")
	public WebElement Probation;
	@FindBy(xpath="//input[@id='txtCardFPFaceID']")
	public WebElement Facereaderenter;
	@FindBy(id="dlDepartment")
	public WebElement Department;
	@FindBy(id="dlSection")
	public WebElement Section;
	@FindBy(id="dlDesignation")
	public WebElement Designation;
	@FindBy(id="dlHolidayGroup")
	public WebElement Holidaygroup;
	@FindBy(id="txtHoursWorkPerDay")
	public WebElement Hoursworked;
	@FindBy(id="txtDaysWorkPerWeek")
	public WebElement Daysworking;
	@FindBy(id="ContentPlaceHolder1_tabEmployeeContainer_tabEmpBasic_dlPartTimeFlexi")
	public WebElement Parttimeflexi;
	@FindBy(id="dlCategory")
	public WebElement Category;
	@FindBy(id="dlLeaveCategory")
	public WebElement Leavecategory;
	@FindBy(id="ContentPlaceHolder1_btnSave")
	public WebElement EmpbasicSave;
	@FindBy(id="dtPickConfirmDt")
	public WebElement Confirmationdate;
	@FindBy(id="__tab_tabETMS")
	public WebElement ETMSsidetab;
	@FindBy(id="dlOTtype")
	public WebElement OTType;
	@FindBy(id="chkWeekOT")
	public WebElement CheckWeeklyOt;
	@FindBy(id="txtWeeklyOTEligWorkHrs")
	public WebElement workingothours;
	@FindBy(id="ddlbranch")
	public WebElement BranchselectEtmsside;
	@FindBy(id="dlShift")
	public WebElement SelectShiftEtmsside;
	@FindBy(id="dlRestDay")
	public WebElement RestdayEtmsside;
	@FindBy(id="ContentPlaceHolder1_btnSave")
	public WebElement Etmssave;
	@FindBy(id="__tab_ContentPlaceHolder1_tabEmployeeContainer_tabEmpBasic")
	public WebElement GeneralEtms;
	@FindBy(xpath="//a[@menu-caption='Basic Master Setup']")
	public WebElement BasicMasterSetup;
	@FindBy(xpath="//a[@data-text='~/CommonMasters/Department.aspx']")
	public WebElement BasicMasterDepartment;
	@FindBy(xpath="(//a[@class='btn bgSuccess pull-right'])[1]")
	public WebElement BasicMasterDepartmentnewbtn;
	@FindBy(id="ContentPlaceHolder1_txtAddDeptCode")
	public WebElement BasicMasterDepartmentcode;
	@FindBy(id="ContentPlaceHolder1_txtAddDeptName")
	public WebElement BasicMasterDepartmentName;
	@FindBy(id="ContentPlaceHolder1_btnSave")
	public WebElement BasicDepartmentSave;
	@FindBy(xpath="//a[@data-id='1103']")
	public WebElement BasicMasterDesignation;
	@FindBy(xpath="(//a[@class='btn bgSuccess pull-right'])[1]")
	public WebElement BasicMasterDesignationnewbtn;
	@FindBy(id="ContentPlaceHolder1_txtAddDesigCode")
	public WebElement BasicMasterDesignationcode;
	@FindBy(id="ContentPlaceHolder1_txtAddDesigName")
	public WebElement BasicMasterDesignationname;
	@FindBy(xpath="//input[@class='btn bgSuccess pull-left']")
	public WebElement BasicMasterDesignationSave;
	@FindBy(xpath="//a[@data-id='1104']")
	public WebElement BasicMasterSection;
	@FindBy(xpath="(//a[@class='btn bgSuccess'])[1]")
	public WebElement BasicMasterSectionnewbtn;
	@FindBy(id="ContentPlaceHolder1_txtAddSecCode")
	public WebElement BasicMasterSectioncode;
	@FindBy(id="ContentPlaceHolder1_txtAddSecName")
	public WebElement BasicMasterSectionname;
	@FindBy(id="ContentPlaceHolder1_dlDept_Input")
	public WebElement BasicMasterSectionDepartment;
	@FindBy(id="ContentPlaceHolder1_btnAddNew")
	public WebElement BasicMasterSectionSave;
	@FindBy(xpath="//a[@data-id='1105']")
	public WebElement BasicMasterCategory;
	@FindBy(id="ContentPlaceHolder1_lnkManage")
	public WebElement BasicMasterCategorynewbtn;
	@FindBy(id="ContentPlaceHolder1_txtCategoryCode")
	public WebElement BasicMasterCategorycode;
	@FindBy(id="ContentPlaceHolder1_txtCategoryName")
	public WebElement BasicMasterCategoryname;
	@FindBy(id="ContentPlaceHolder1_btnAdd")
	public WebElement BasicMasterCategorySave;
	@FindBy(xpath="//a[@data-text='~/CommonMasters/DesigGroup.aspx']")
	public WebElement BasicMasterDesignationgroup;
	@FindBy(id="ContentPlaceHolder1_lnkManage")
	public WebElement BasicMasterDesignationgroupnewbtn;
	@FindBy(id="ContentPlaceHolder1_txtAddDesigCode")
	public WebElement BasicMasterDesignationgroupcode;
	@FindBy(id="ContentPlaceHolder1_txtAddDesigName")
	public WebElement BasicMasterDesignationgroupname;
	
	
	
	@FindBy(id="ContentPlaceHolder1_txtEmpSearchText")
	public WebElement EmployeeSearch;
	public WebElement getEmployeeSearch() {
		return EmployeeSearch;
	}
	public void setEmployeeSearch(WebElement employeeSearch) {
		EmployeeSearch = employeeSearch;
	}
	public WebElement getBasicMasterDepartmentName() {
		return BasicMasterDepartmentName;
	}
	public void setBasicMasterDepartmentName(WebElement basicMasterDepartmentName) {
		BasicMasterDepartmentName = basicMasterDepartmentName;
	}
	public WebElement getBasicDepartmentSave() {
		return BasicDepartmentSave;
	}
	public void setBasicDepartmentSave(WebElement basicDepartmentSave) {
		BasicDepartmentSave = basicDepartmentSave;
	}
	public WebElement getConfirmDateemp() {
		return confirmDateemp;
	}
	public void setConfirmDateemp(WebElement confirmDateemp) {
		this.confirmDateemp = confirmDateemp;
	}


	@FindBy(id="ContentPlaceHolder1_btnAdd")
	public WebElement BasicMasterDesignationgroupSave;
	
	@FindBy(id="dtPickConfirmDt")
	public WebElement confirmDateemp;
	
	@FindBy(xpath="//span[text()='Shift Settings']")
	public WebElement shiftsetting;

	@FindBy(xpath="//a[@menu-caption='Shift Master']")
	public WebElement shiftmaster;

	@FindBy(xpath="//a[@data-value='Add']")
	public WebElement newshift;

	@FindBy(xpath="//input[@id='ContentPlaceHolder1_txtShiftCode']")
	public WebElement shiftcode;

	@FindBy(xpath="//input[@id='ContentPlaceHolder1_txtShiftName']")
	public WebElement shiftname;

	@FindBy(xpath="//input[@id='ContentPlaceHolder1_txtLateGracePeriod']")
	public WebElement lategraceperiod;

	@FindBy(xpath="//input[@id='ContentPlaceHolder1_txtLateAftMin']")
	public WebElement aftereveryminuts;

	@FindBy(xpath="//input[@id='ContentPlaceHolder1_txtLateDeduct']")
	public WebElement latededuct;

	@FindBy(xpath="//input[@id='ContentPlaceHolder1_chkExcludeLateGrace']")
	public WebElement Excludegraceperiod;

	@FindBy(xpath=" //input[@id='ContentPlaceHolder1_chkOffsetOT']")
	public WebElement latenessoffsetot;

	@FindBy(xpath="//input[@id='ContentPlaceHolder1_txtEarlyOutGracePeriod']")
	public WebElement earlygraceperiod;

	@FindBy(xpath="//input[@id='ContentPlaceHolder1_txtEarlyOutAftevery']")
	public WebElement earlyoutafterevery;

	@FindBy(xpath="//input[@id='ContentPlaceHolder1_txtEarlyOutDeduct']")
	public WebElement Earlyoutdeduct;

	@FindBy(xpath="//select[@id='ContentPlaceHolder1_ddlOverTime']")
	public WebElement roundscroll;

	@FindBy(xpath="//input[@id='ContentPlaceHolder1_txtOverTime']")
	public WebElement roundvalue;

	@FindBy(xpath="//input[@id='ContentPlaceHolder1_txtMinOT']")
	public WebElement minimumovertime;

	@FindBy(id="ContentPlaceHolder1_chkEarlyOT")
	public WebElement checkearlyot;
	
	@FindBy(id="ContentPlaceHolder1_ddlEarlyOT")
	public WebElement eroundscroll;

	@FindBy(id="ContentPlaceHolder1_txtEarlyOT")
	public WebElement EarlyOT; 

	@FindBy(id="ContentPlaceHolder1_txtEarlyMinOT")
	public WebElement txtearlyminOT;

	@FindBy(id="ContentPlaceHolder1_rbLunchLate_0")
	public WebElement lunchlate0;

	@FindBy(id="ContentPlaceHolder1_rbLunchLate_1")
	public WebElement lunchlate1;

	@FindBy(id="ContentPlaceHolder1_rbLunchLate_2")
	public WebElement lunchlate2;

	@FindBy(id="ContentPlaceHolder1_rbDinner1Late_0")
	public WebElement dinnerlate0;

	@FindBy(id="ContentPlaceHolder1_rbDinner1Late_1")
	public WebElement dinnerlate1;

	@FindBy(id="ContentPlaceHolder1_rbDinner1Late_2")
	public WebElement dinnerlate2;

	@FindBy(id="ContentPlaceHolder1_rbDinner2Late_0")
	public WebElement dinnerlate20;

	@FindBy(id=" ContentPlaceHolder1_rbDinner2Late_1")
	public WebElement dinnerlate21;

	@FindBy(id=" ContentPlaceHolder1_rbDinner2Late_2")
	public WebElement dinnerlate22;

	@FindBy(xpath="//input[@id='ContentPlaceHolder1_chkHMonday']")
	public WebElement chkmonday;

	@FindBy(id="ContentPlaceHolder1_chkHTuesday")
	public WebElement chktuesday;

	@FindBy(id="ContentPlaceHolder1_chkHWednesday")
	public WebElement chkwednesday;

	@FindBy(id="ContentPlaceHolder1_chkHThursday")
	public WebElement chkthursday;

	@FindBy(id="ContentPlaceHolder1_chkHFriday")
	public WebElement chkfriday;

	@FindBy(id="ContentPlaceHolder1_chkHSaturday")
	public WebElement chksaturday;

	@FindBy(id="ContentPlaceHolder1_chkHSunday")
	public WebElement chksunday;

	@FindBy(id="ContentPlaceHolder1_chkDayChange")
	public WebElement daychange;

	@FindBy(id="ContentPlaceHolder1_chkOffsetPH")
	public WebElement chkoffsetPH;

	@FindBy(xpath="//input[@id='ContentPlaceHolder1_grdShiftDtl_txtTimeIn_0']")
	public WebElement Timein;

	@FindBy(xpath="//input[@id='ContentPlaceHolder1_grdShiftDtl_txtTimeOut_0']")
	public WebElement Timeout;
	
	
	@FindBy(xpath = "//select[@id='dlDesignationGrp']")
	public WebElement ExtraClassification;
	
	@FindBy(id=" ContentPlaceHolder1_grdShiftDtl_txtDayChange_0")
	public WebElement daychange1;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtLunchOut_0")
	public WebElement Lunchout;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtLunchIn_0")
	public WebElement Lunchin;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_ddlOTRate_0")
	public WebElement overtimedropdown;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_chkOTExtra_0")
	public WebElement extra;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_ddlOTExtraRate_0")
	public WebElement erate;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtMaxHr_0")
	public WebElement Maxhr;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_chkLunchLate_0")
	public WebElement lunchlatecheck;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_ddlPH_0")
	public WebElement phdropdown;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtPHMax_0")
	public WebElement phmax;

	@FindBy(xpath="//input[@id='ContentPlaceHolder1_btnAdd']")
	public WebElement saveshiftmaster;

	@FindBy(xpath="//input[@id='ContentPlaceHolder1_btnCancelAdd']")
	public WebElement cancelshiftmaster;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtOT1Hrs_0")
	public WebElement OT1hrssu0;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtOT1Ded_0")
	public WebElement OTD1Ded0su;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtOT2Hrs_0")
	public WebElement OT2hrssu0;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtOT2Ded_0")
	public WebElement OTD2Dedsu;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtOT3Hrs_0")
	public WebElement OT3hrssu0;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtOT3Ded_0")
	public WebElement OTD3Dedsu;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtDin1Out_0")
	public WebElement Din1out0br1su;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtDin1In_0")
	public WebElement Din1in0br1su;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtDin2Out_0")
	public WebElement Din2outbr2su;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtDin2In_0")
	public WebElement Din2inbrsu;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtDin3Out_0")
	public WebElement Din3outbrsu;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtDin3In_0")
	public WebElement Din3inbrsu;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_chkShowOff_0")
	public WebElement chkshowoff;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtTimeIn_1")
	public WebElement timeinmon;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtTimeOut_1")
	public WebElement timeoutmon;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtDayChange_1")
	public WebElement daychangemon;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtLunchOut_1")
	public WebElement lunchoutmon;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtLunchIn_1")
	public WebElement lunnchinmon;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_chkRestDay_1")
	public WebElement Restdaymon;
	@FindBy(xpath="//div[contains(@class,'col-lg-12 col-md-12 col-sm-12 col-xs-12 no-padding margin-bottom')]//div[@class='col-lg-12 no-padding']")
	public WebElement pageright;
	
	@FindBy(xpath="//div[contains(@class,'col-lg-12 col-md-12 col-sm-12 col-xs-12 no-padding margin-bottom')]//div[@class='col-lg-12 no-padding']")
	public WebElement pageleft;
	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_ddlOTRate_1")
	public WebElement ddOtratemon;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_chkOTExtra_1")
	public WebElement chkotextramon;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_ddlOTExtraRate_1")
	public WebElement extraratemon;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtMaxHr_1")
	public WebElement maxhrmon;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_chkLunchLate_1")
	public WebElement lunchlatemon;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_chkDin1Late_1")
	public WebElement dinlatemon;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_chkDin2Late_1")
	public WebElement din2latemon;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_ddlPH_1")
	public WebElement ddphmon;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtPHMax_1")
	public WebElement phmaxmon;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtOT1Hrs_1")
	public WebElement OThrs1mon;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtOT1Ded_1")
	public WebElement OT1Ded1mon;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtOT2Hrs_1")
	public WebElement OT2hrsmon;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtOT2Ded_1")
	public WebElement OTded2mon;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtOT3Hrs_1")
	public WebElement OT3hrsmon;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtOT3Ded_1")
	public WebElement OTded3mon;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtDin1Out_1")
	public WebElement Din1outmon;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtDin1In_1")
	public WebElement Din1inmon;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtDin2Out_1")
	public WebElement Din2outmon;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtDin2In_1")
	public WebElement Din2inmon;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtDin3Out_1")
	public WebElement Din3outmon;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtDin3In_1")
	public WebElement Din3inmon;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_chkShowOff_1")
	public WebElement chkshowoffmon;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtTimeIn_2")
	public WebElement timeintue;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtTimeOut_2")
	public WebElement timeouttue;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtDayChange_2")
	public WebElement daychangetue;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtLunchOut_2")
	public WebElement lunchouttue;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtLunchIn_2")
	public WebElement lunchintue;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_chkRestDay_2")
	public WebElement chkrestdaytue;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_ddlOTRate_2")
	public WebElement ddotratetue;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_chkOTExtra_2")
	public WebElement chkExtratue;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_ddlOTExtraRate_2")
	public WebElement ddextraratetue;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtMaxHr_2")
	public WebElement maxhrtue;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_chkLunchLate_2")
	public WebElement chklunchlatetue;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_chkDin1Late_2")
	public WebElement Dilatetue;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_chkDin2Late_2")
	public WebElement Dilate2tue;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_ddlPH_2")
	public WebElement ddph2tue;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtPHMax_2")
	public WebElement phmaxtue;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_ddlPHExt_2")
	public WebElement phexttue;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtOT1Hrs_2")
	public WebElement OT1hrstue;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtOT1Ded_2")
	public WebElement OT1dedtue;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtOT2Hrs_2")
	public WebElement OT2hrstue;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtOT2Ded_2")
	public WebElement OT2dedtue;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtOT3Hrs_2")
	public WebElement OT3hrstue;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtOT3Ded_2")
	public WebElement OT3destue;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtDin1Out_2")
	public WebElement Din1outtue;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtDin1In_2")
	public WebElement Din1intue;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtDin2Out_2")
	public WebElement Din2outtue;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtDin2In_2")
	public WebElement Din2intue;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtDin3Out_2")
	public WebElement Din3outtue;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtDin3In_2")
	public WebElement Ddin3intue;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_chkShowOff_2")
	public WebElement chkshowofftue;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtTimeIn_3")
	public WebElement timeinwed;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtTimeOut_3")
	public WebElement timeoutwed;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtDayChange_3")
	public WebElement daychangewed;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtLunchOut_3")
	public WebElement lunchoutwed;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtLunchIn_3")
	public WebElement lunchinwed;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_chkRestDay_3")
	public WebElement chkrestdaywed;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_ddlOTRate_3")
	public WebElement dd1OTratewed;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_chkOTExtra_3")
	public WebElement chkOtextrawed;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_ddlOTExtraRate_3")
	public WebElement ddextraratewed;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtMaxHr_3")
	public WebElement maxhrwed;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_chkLunchLate_3")
	public WebElement lunchlatewed;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_chkDin1Late_3")
	public WebElement dinlate1wed;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_chkDin2Late_3")
	public WebElement dinlate2wed;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_ddlPH_3")
	public WebElement ddphwed;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtPHMax_3")
	public WebElement phmaxwed;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_ddlPHExt_3")
	public WebElement phextwed;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtOT1Hrs_3")
	public WebElement OThrs1wed;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtOT1Ded_3")
	public WebElement OTded1wed;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtOT2Hrs_3")
	public WebElement OT2hrswed;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtOT2Ded_3")
	public WebElement OTded2wed;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtOT3Hrs_3")
	public WebElement OThrs3wed;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtOT3Ded_3")
	public WebElement OTded3wed;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtDin1Out_3")
	public WebElement Din1outwed;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtDin1In_3")
	public WebElement Din1inwed;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtDin2Out_3")
	public WebElement Din2outwed;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtDin2In_3")
	public WebElement Din2inwed;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtDin3Out_3")
	public WebElement Din3outwed;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtDin3In_3")
	public WebElement Din3inwed;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_chkShowOff_3")
	public WebElement chkshowoffwed;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtTimeIn_4")
	public WebElement timeinthur;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtTimeOut_4")
	public WebElement timeoutthur;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtDayChange_4")
	public WebElement daychangethur;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtLunchOut_4")
	public WebElement lunchoutthur;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtLunchIn_4")
	public WebElement lunchinthur;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_chkRestDay_4")
	public WebElement Chkrestdaythur;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_ddlOTRate_4")
	public WebElement ddotratethur;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_chkOTExtra_4")
	public WebElement OTextrathur;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_ddlOTExtraRate_4")
	public WebElement ddotextraratethur;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtMaxHr_4")
	public WebElement maxhrthur;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_chkLunchLate_4")
	public WebElement chklunchkatethur;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_chkDin1Late_4")
	public WebElement chkdinelate1thur;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_chkDin2Late_4")
	public WebElement chkdinelate2thur;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_ddlPH_4")
	public WebElement ddphthur;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtPHMax_4")
	public WebElement phmaxthur;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_ddlPHExt_4")
	public WebElement ddphextthur;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtOT1Hrs_4")
	public WebElement OT1hrsthur;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtOT1Ded_4")
	public WebElement OT1dedthur;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtOT2Hrs_4")
	public WebElement OT2hrsthur;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtOT2Ded_4")
	public WebElement OT2dedthur;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtOT3Hrs_4")
	public WebElement OT3hrsthur;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtOT3Ded_4")
	public WebElement OT3dedthur;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtDin1Out_4")
	public WebElement Din1outthur;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtDin1In_4")
	public WebElement Din1inthur;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtDin2Out_4")
	public WebElement Din2outthur;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtDin2In_4")
	public WebElement Din2inthur;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtDin3Out_4")
	public WebElement Din3outthur;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtDin3In_4")
	public WebElement Ddin3inthur;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_chkShowOff_4")
	public WebElement chkshowoffthur;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtTimeIn_5")
	public WebElement timeinfri;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtTimeOut_5")
	public WebElement timeoutfri;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtDayChange_5")
	public WebElement daychangefri;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtLunchOut_5")
	public WebElement lunchoutfri;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtLunchIn_5")
	public WebElement lunchinfri;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_chkRestDay_5")
	public WebElement Chkrestdayfri;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_ddlOTRate_5")
	public WebElement ddotratefri;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_chkOTExtra_5")
	public WebElement OTextrafri;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_ddlOTExtraRate_5")
	public WebElement ddotextraratefri;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtMaxHr_5")
	public WebElement maxhrfri;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_chkLunchLate_5")
	public WebElement chklunchkatefri;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_chkDin1Late_5")
	public WebElement chkdinelate1fri;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_chkDin2Late_5")
	public WebElement chkdinelate2fri;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_ddlPH_5")
	public WebElement ddpfri;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtPHMax_5")
	public WebElement phmaxfri;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_ddlPHExt_5")
	public WebElement ddphextfri;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtOT1Hrs_5")
	public WebElement OT1hrsfri;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtOT1Ded_5")
	public WebElement OT1dedfri;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtOT2Hrs_5")
	public WebElement OT2hrsfri;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtOT2Ded_5")
	public WebElement OT2dedfri;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtOT3Hrs_5")
	public WebElement OT3hrsfri;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtOT3Ded_5")
	public WebElement OT3dedfri;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtDin1Out_5")
	public WebElement Din1outfri;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtDin1In_5")
	public WebElement Din1infri;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtDin2Out_5")
	public WebElement Din2outfri;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtDin2In_5")
	public WebElement Din2infri;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtDin3Out_5")
	public WebElement Din3outfri;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtDin3In_5")
	public WebElement Ddin3infri;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_chkShowOff_5")
	public WebElement chkshowofffri;

	
	@FindBy(id="txtLogin")
	public WebElement username;
	
	@FindBy(id="txtPassword")
	public WebElement pwd;
	


	@FindBy(id="tog1")
	public WebElement ChangeDB;

	
	
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
	
	@FindBy(xpath="//*[@id=\"ContentPlaceHolder1_btnSave\"]")
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








	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtTimeIn_6")
	public WebElement timeinsat;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtTimeOut_6")
	public WebElement timeoutsat;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtDayChange_6")
	public WebElement daychangesat;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtLunchOut_6")
	public WebElement lunchoutsat;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtLunchIn_6")
	public WebElement lunchinsat;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_chkRestDay_6")
	public WebElement Chkrestdaysat;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_ddlOTRate_6")
	public WebElement ddotratesat;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_chkOTExtra_6")
	public WebElement chkOTextrasat;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_ddlOTExtraRate_6")
	public WebElement ddotextraratesat;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtMaxHr_6")
	public WebElement maxhrsat;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_chkLunchLate_6")
	public WebElement chklunchkatesat;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_chkDin1Late_6")
	public WebElement chkdinelate1sat;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_chkDin2Late_6")
	public WebElement chkdinelate2sat;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_ddlPH_6")
	public WebElement ddphsat;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtPHMax_6")
	public WebElement phmaxsat;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_ddlPHExt_6")
	public WebElement ddphextsat;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtOT1Hrs_6")
	public WebElement OT1hrssat;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtOT1Ded_6")
	public WebElement OT1dedsat;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtOT2Hrs_6")
	public WebElement OT2hrssat;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtOT2Ded_6")
	public WebElement OT2dedsat;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtOT3Hrs_6")
	public WebElement OT3hrssat;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtOT3Ded_6")
	public WebElement OT3dedsat;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtDin1Out_6")
	public WebElement Din1outsat;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtDin1In_6")
	public WebElement Din1insat;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtDin2Out_6")
	public WebElement Din2outsat;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtDin2In_6")
	public WebElement Din2insat;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtDin3Out_6")
	public WebElement Din3outsat;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_txtDin3In_6")
	public WebElement Ddin3insat;

	@FindBy(id="ContentPlaceHolder1_grdShiftDtl_chkShowOff_6")
	public WebElement chkshowoffsat;
	
	@FindBy(xpath = "(//th[contains(.,'Out')])[4]")
	public WebElement RightslideTable;



	
	public WebElement getShiftsetting() {
		return shiftsetting;
	}
	public WebElement getShiftmaster() {
		return shiftmaster;
	}
	public WebElement getNewshift() {
		return newshift;
	}
	public WebElement getShiftcode() {
		return shiftcode;
	}
	public WebElement getShiftname() {
		return shiftname;
	}
	public WebElement getLategraceperiod() {
		return lategraceperiod;
	}
	public WebElement getAftereveryminuts() {
		return aftereveryminuts;
	}
	public WebElement getLatededuct() {
		return latededuct;
	}
	public WebElement getExcludegraceperiod() {
		return Excludegraceperiod;
	}
	public WebElement getLatenessoffsetot() {
		return latenessoffsetot;
	}
	public WebElement getEarlygraceperiod() {
		return earlygraceperiod;
	}
	public WebElement getEarlyoutafterevery() {
		return earlyoutafterevery;
	}
	public WebElement getEarlyoutdeduct() {
		return Earlyoutdeduct;
	}
	public WebElement getRoundscroll() {
		return roundscroll;
	}
	public WebElement getRoundvalue() {
		return roundvalue;
	}
	public WebElement getMinimumovertime() {
		return minimumovertime;
	}
	public WebElement getCheckearlyot() {
		return checkearlyot;
	}
	public WebElement getEroundscroll() {
		return eroundscroll;
	}
	public WebElement getEarlyOT() {
		return EarlyOT;
	}
	public WebElement getTxtearlyminOT() {
		return txtearlyminOT;
	}
	public WebElement getLunchlate0() {
		return lunchlate0;
	}
	public WebElement getLunchlate1() {
		return lunchlate1;
	}
	public WebElement getLunchlate2() {
		return lunchlate2;
	}
	public WebElement getDinnerlate0() {
		return dinnerlate0;
	}
	public WebElement getDinnerlate1() {
		return dinnerlate1;
	}
	public WebElement getDinnerlate2() {
		return dinnerlate2;
	}
	public WebElement getDinnerlate20() {
		return dinnerlate20;
	}
	public WebElement getDinnerlate21() {
		return dinnerlate21;
	}
	public WebElement getDinnerlate22() {
		return dinnerlate22;
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
	public WebElement getDaychange() {
		return daychange;
	}
	public WebElement getChkoffsetPH() {
		return chkoffsetPH;
	}
	public WebElement getTimein() {
		return Timein;
	}
	public WebElement getTimeout() {
		return Timeout;
	}
	public WebElement getDaychange1() {
		return daychange1;
	}
	public WebElement getLunchout() {
		return Lunchout;
	}
	public WebElement getLunchin() {
		return Lunchin;
	}
	public WebElement getOvertimedropdown() {
		return overtimedropdown;
	}
	public WebElement getExtra() {
		return extra;
	}
	public WebElement getErate() {
		return erate;
	}
	public WebElement getMaxhr() {
		return Maxhr;
	}
	public WebElement getLunchlatecheck() {
		return lunchlatecheck;
	}
	public WebElement getPhdropdown() {
		return phdropdown;
	}
	public WebElement getPhmax() {
		return phmax;
	}
	public WebElement getSaveshiftmaster() {
		return saveshiftmaster;
	}
	public WebElement getCancelshiftmaster() {
		return cancelshiftmaster;
	}
	public WebElement getOT1hrssu0() {
		return OT1hrssu0;
	}
	public WebElement getOTD1Ded0su() {
		return OTD1Ded0su;
	}
	public WebElement getOT2hrssu0() {
		return OT2hrssu0;
	}
	public WebElement getOTD2Dedsu() {
		return OTD2Dedsu;
	}
	public WebElement getOT3hrssu0() {
		return OT3hrssu0;
	}
	public WebElement getOTD3Dedsu() {
		return OTD3Dedsu;
	}
	public WebElement getDin1out0br1su() {
		return Din1out0br1su;
	}
	public WebElement getDin1in0br1su() {
		return Din1in0br1su;
	}
	public WebElement getDin2outbr2su() {
		return Din2outbr2su;
	}
	public WebElement getDin2inbrsu() {
		return Din2inbrsu;
	}
	public WebElement getDin3outbrsu() {
		return Din3outbrsu;
	}
	public WebElement getDin3inbrsu() {
		return Din3inbrsu;
	}
	public WebElement getChkshowoff() {
		return chkshowoff;
	}
	public WebElement getTimeinmon() {
		return timeinmon;
	}
	public WebElement getTimeoutmon() {
		return timeoutmon;
	}
	public WebElement getDaychangemon() {
		return daychangemon;
	}
	public WebElement getLunchoutmon() {
		return lunchoutmon;
	}
	public WebElement getLunnchinmon() {
		return lunnchinmon;
	}
	public WebElement getRestdaymon() {
		return Restdaymon;
	}
	public WebElement getPageright() {
		return pageright;
	}
	public WebElement getPageleft() {
		return pageleft;
	}
	public WebElement getDdOtratemon() {
		return ddOtratemon;
	}
	public WebElement getChkotextramon() {
		return chkotextramon;
	}
	public WebElement getExtraratemon() {
		return extraratemon;
	}
	public WebElement getMaxhrmon() {
		return maxhrmon;
	}
	public WebElement getLunchlatemon() {
		return lunchlatemon;
	}
	public WebElement getDinlatemon() {
		return dinlatemon;
	}
	public WebElement getDin2latemon() {
		return din2latemon;
	}
	public WebElement getDdphmon() {
		return ddphmon;
	}
	public WebElement getPhmaxmon() {
		return phmaxmon;
	}
	public WebElement getOThrs1mon() {
		return OThrs1mon;
	}
	public WebElement getOT1Ded1mon() {
		return OT1Ded1mon;
	}
	public WebElement getOT2hrsmon() {
		return OT2hrsmon;
	}
	public WebElement getOTded2mon() {
		return OTded2mon;
	}
	public WebElement getOT3hrsmon() {
		return OT3hrsmon;
	}
	public WebElement getOTded3mon() {
		return OTded3mon;
	}
	public WebElement getDin1outmon() {
		return Din1outmon;
	}
	public WebElement getDin1inmon() {
		return Din1inmon;
	}
	public WebElement getDin2outmon() {
		return Din2outmon;
	}
	public WebElement getDin2inmon() {
		return Din2inmon;
	}
	public WebElement getDin3outmon() {
		return Din3outmon;
	}
	public WebElement getDin3inmon() {
		return Din3inmon;
	}
	public WebElement getChkshowoffmon() {
		return chkshowoffmon;
	}
	public WebElement getTimeintue() {
		return timeintue;
	}
	public WebElement getTimeouttue() {
		return timeouttue;
	}
	public WebElement getDaychangetue() {
		return daychangetue;
	}
	public WebElement getLunchouttue() {
		return lunchouttue;
	}
	public WebElement getLunchintue() {
		return lunchintue;
	}
	public WebElement getChkrestdaytue() {
		return chkrestdaytue;
	}
	public WebElement getDdotratetue() {
		return ddotratetue;
	}
	public WebElement getChkExtratue() {
		return chkExtratue;
	}
	public WebElement getDdextraratetue() {
		return ddextraratetue;
	}
	public WebElement getMaxhrtue() {
		return maxhrtue;
	}
	public WebElement getChklunchlatetue() {
		return chklunchlatetue;
	}
	public WebElement getDilatetue() {
		return Dilatetue;
	}
	public WebElement getDilate2tue() {
		return Dilate2tue;
	}
	public WebElement getDdph2tue() {
		return ddph2tue;
	}
	public WebElement getPhmaxtue() {
		return phmaxtue;
	}
	public WebElement getPhexttue() {
		return phexttue;
	}
	public WebElement getOT1hrstue() {
		return OT1hrstue;
	}
	public WebElement getOT1dedtue() {
		return OT1dedtue;
	}
	public WebElement getOT2hrstue() {
		return OT2hrstue;
	}
	public WebElement getOT2dedtue() {
		return OT2dedtue;
	}
	public WebElement getOT3hrstue() {
		return OT3hrstue;
	}
	public WebElement getOT3destue() {
		return OT3destue;
	}
	public WebElement getDin1outtue() {
		return Din1outtue;
	}
	public WebElement getDin1intue() {
		return Din1intue;
	}
	public WebElement getDin2outtue() {
		return Din2outtue;
	}
	public WebElement getDin2intue() {
		return Din2intue;
	}
	public WebElement getDin3outtue() {
		return Din3outtue;
	}
	public WebElement getDdin3intue() {
		return Ddin3intue;
	}
	public WebElement getChkshowofftue() {
		return chkshowofftue;
	}
	public WebElement getTimeinwed() {
		return timeinwed;
	}
	public WebElement getTimeoutwed() {
		return timeoutwed;
	}
	public WebElement getDaychangewed() {
		return daychangewed;
	}
	public WebElement getLunchoutwed() {
		return lunchoutwed;
	}
	public WebElement getLunchinwed() {
		return lunchinwed;
	}
	public WebElement getChkrestdaywed() {
		return chkrestdaywed;
	}
	public WebElement getDd1OTratewed() {
		return dd1OTratewed;
	}
	public WebElement getChkOtextrawed() {
		return chkOtextrawed;
	}
	public WebElement getDdextraratewed() {
		return ddextraratewed;
	}
	public WebElement getMaxhrwed() {
		return maxhrwed;
	}
	public WebElement getLunchlatewed() {
		return lunchlatewed;
	}
	public WebElement getDinlate1wed() {
		return dinlate1wed;
	}
	public WebElement getDinlate2wed() {
		return dinlate2wed;
	}
	public WebElement getDdphwed() {
		return ddphwed;
	}
	public WebElement getPhmaxwed() {
		return phmaxwed;
	}
	public WebElement getPhextwed() {
		return phextwed;
	}
	public WebElement getOThrs1wed() {
		return OThrs1wed;
	}
	public WebElement getOTded1wed() {
		return OTded1wed;
	}
	public WebElement getOT2hrswed() {
		return OT2hrswed;
	}
	public WebElement getOTded2wed() {
		return OTded2wed;
	}
	public WebElement getOThrs3wed() {
		return OThrs3wed;
	}
	public WebElement getOTded3wed() {
		return OTded3wed;
	}
	public WebElement getDin1outwed() {
		return Din1outwed;
	}
	public WebElement getDin1inwed() {
		return Din1inwed;
	}
	public WebElement getDin2outwed() {
		return Din2outwed;
	}
	public WebElement getDin2inwed() {
		return Din2inwed;
	}
	public WebElement getDin3outwed() {
		return Din3outwed;
	}
	public WebElement getDin3inwed() {
		return Din3inwed;
	}
	public WebElement getChkshowoffwed() {
		return chkshowoffwed;
	}
	public WebElement getTimeinthur() {
		return timeinthur;
	}
	public WebElement getTimeoutthur() {
		return timeoutthur;
	}
	public WebElement getDaychangethur() {
		return daychangethur;
	}
	public WebElement getLunchoutthur() {
		return lunchoutthur;
	}
	public WebElement getLunchinthur() {
		return lunchinthur;
	}
	public WebElement getChkrestdaythur() {
		return Chkrestdaythur;
	}
	public WebElement getDdotratethur() {
		return ddotratethur;
	}
	public WebElement getOTextrathur() {
		return OTextrathur;
	}
	public WebElement getDdotextraratethur() {
		return ddotextraratethur;
	}
	public WebElement getMaxhrthur() {
		return maxhrthur;
	}
	public WebElement getChklunchkatethur() {
		return chklunchkatethur;
	}
	public WebElement getChkdinelate1thur() {
		return chkdinelate1thur;
	}
	public WebElement getChkdinelate2thur() {
		return chkdinelate2thur;
	}
	public WebElement getDdphthur() {
		return ddphthur;
	}
	public WebElement getPhmaxthur() {
		return phmaxthur;
	}
	public WebElement getDdphextthur() {
		return ddphextthur;
	}
	public WebElement getOT1hrsthur() {
		return OT1hrsthur;
	}
	public WebElement getOT1dedthur() {
		return OT1dedthur;
	}
	public WebElement getOT2hrsthur() {
		return OT2hrsthur;
	}
	public WebElement getOT2dedthur() {
		return OT2dedthur;
	}
	public WebElement getOT3hrsthur() {
		return OT3hrsthur;
	}
	public WebElement getOT3dedthur() {
		return OT3dedthur;
	}
	public WebElement getDin1outthur() {
		return Din1outthur;
	}
	public WebElement getDin1inthur() {
		return Din1inthur;
	}
	public WebElement getDin2outthur() {
		return Din2outthur;
	}
	public WebElement getDin2inthur() {
		return Din2inthur;
	}
	public WebElement getDin3outthur() {
		return Din3outthur;
	}
	public WebElement getDdin3inthur() {
		return Ddin3inthur;
	}
	public WebElement getChkshowoffthur() {
		return chkshowoffthur;
	}
	public WebElement getTimeinfri() {
		return timeinfri;
	}
	public WebElement getTimeoutfri() {
		return timeoutfri;
	}
	public WebElement getDaychangefri() {
		return daychangefri;
	}
	public WebElement getLunchoutfri() {
		return lunchoutfri;
	}
	public WebElement getLunchinfri() {
		return lunchinfri;
	}
	public WebElement getChkrestdayfri() {
		return Chkrestdayfri;
	}
	public WebElement getDdotratefri() {
		return ddotratefri;
	}
	public WebElement getOTextrafri() {
		return OTextrafri;
	}
	public WebElement getDdotextraratefri() {
		return ddotextraratefri;
	}
	public WebElement getMaxhrfri() {
		return maxhrfri;
	}
	public WebElement getChklunchkatefri() {
		return chklunchkatefri;
	}
	public WebElement getChkdinelate1fri() {
		return chkdinelate1fri;
	}
	public WebElement getChkdinelate2fri() {
		return chkdinelate2fri;
	}
	public WebElement getDdpfri() {
		return ddpfri;
	}
	public WebElement getPhmaxfri() {
		return phmaxfri;
	}
	public WebElement getDdphextfri() {
		return ddphextfri;
	}
	public WebElement getOT1hrsfri() {
		return OT1hrsfri;
	}
	public WebElement getOT1dedfri() {
		return OT1dedfri;
	}
	public WebElement getOT2hrsfri() {
		return OT2hrsfri;
	}
	public WebElement getOT2dedfri() {
		return OT2dedfri;
	}
	public WebElement getOT3hrsfri() {
		return OT3hrsfri;
	}
	public WebElement getOT3dedfri() {
		return OT3dedfri;
	}
	public WebElement getDin1outfri() {
		return Din1outfri;
	}
	public WebElement getDin1infri() {
		return Din1infri;
	}
	public WebElement getDin2outfri() {
		return Din2outfri;
	}
	public WebElement getDin2infri() {
		return Din2infri;
	}
	public WebElement getDin3outfri() {
		return Din3outfri;
	}
	public WebElement getDdin3infri() {
		return Ddin3infri;
	}
	public WebElement getChkshowofffri() {
		return chkshowofffri;
	}
	public WebElement getTimeinsat() {
		return timeinsat;
	}
	public WebElement getTimeoutsat() {
		return timeoutsat;
	}
	public WebElement getDaychangesat() {
		return daychangesat;
	}
	public WebElement getLunchoutsat() {
		return lunchoutsat;
	}
	public WebElement getLunchinsat() {
		return lunchinsat;
	}
	public WebElement getChkrestdaysat() {
		return Chkrestdaysat;
	}
	public WebElement getDdotratesat() {
		return ddotratesat;
	}
	public WebElement getChkOTextrasat() {
		return chkOTextrasat;
	}
	public WebElement getDdotextraratesat() {
		return ddotextraratesat;
	}
	public WebElement getMaxhrsat() {
		return maxhrsat;
	}
	public WebElement getChklunchkatesat() {
		return chklunchkatesat;
	}
	public WebElement getChkdinelate1sat() {
		return chkdinelate1sat;
	}
	public WebElement getChkdinelate2sat() {
		return chkdinelate2sat;
	}
	public WebElement getDdphsat() {
		return ddphsat;
	}
	public WebElement getPhmaxsat() {
		return phmaxsat;
	}
	public WebElement getDdphextsat() {
		return ddphextsat;
	}
	public WebElement getOT1hrssat() {
		return OT1hrssat;
	}
	public WebElement getOT1dedsat() {
		return OT1dedsat;
	}
	public WebElement getOT2hrssat() {
		return OT2hrssat;
	}
	public WebElement getOT2dedsat() {
		return OT2dedsat;
	}
	public WebElement getOT3hrssat() {
		return OT3hrssat;
	}
	public WebElement getOT3dedsat() {
		return OT3dedsat;
	}
	public WebElement getDin1outsat() {
		return Din1outsat;
	}
	public WebElement getDin1insat() {
		return Din1insat;
	}
	public WebElement getDin2outsat() {
		return Din2outsat;
	}
	public WebElement getDin2insat() {
		return Din2insat;
	}
	public WebElement getDin3outsat() {
		return Din3outsat;
	}
	public WebElement getDdin3insat() {
		return Ddin3insat;
	}
	public WebElement getChkshowoffsat() {
		return chkshowoffsat;
	}
	public WebElement getRightslideTable() {
		return RightslideTable;
	}
	public WebElement getExtraClassification() {
		return ExtraClassification;
	}
	public void setExtraClassification(WebElement extraClassification) {
		ExtraClassification = extraClassification;
	}

	
	
	public WebElement getSeacrchtext() {
		return seacrchtext;
	}
	public void setSeacrchtext(WebElement seacrchtext) {
		this.seacrchtext = seacrchtext;
	}
	
	
	public WebElement getGeneralEtms() {
		return GeneralEtms;
	}
	public void setGeneralEtms(WebElement generalEtms) {
		GeneralEtms = generalEtms;
	}
	public WebElement getBasicMasterSetup() {
		return BasicMasterSetup;
	}
	public void setBasicMasterSetup(WebElement basicMasterSetup) {
		BasicMasterSetup = basicMasterSetup;
	}
	public WebElement getBasicMasterDepartment() {
		return BasicMasterDepartment;
	}
	public void setBasicMasterDepartment(WebElement basicMasterDepartment) {
		BasicMasterDepartment = basicMasterDepartment;
	}
	public WebElement getBasicMasterDepartmentnewbtn() {
		return BasicMasterDepartmentnewbtn;
	}
	public void setBasicMasterDepartmentnewbtn(WebElement basicMasterDepartmentnewbtn) {
		BasicMasterDepartmentnewbtn = basicMasterDepartmentnewbtn;
	}
	public WebElement getBasicMasterDepartmentcode() {
		return BasicMasterDepartmentcode;
	}
	public void setBasicMasterDepartmentcode(WebElement basicMasterDepartmentcode) {
		BasicMasterDepartmentcode = basicMasterDepartmentcode;
	}
	public WebElement getDepartmentName() {
		return BasicMasterDepartmentName;
	}
	public void setDepartmentName(WebElement departmentName) {
		BasicMasterDepartmentName = departmentName;
	}
	public WebElement getDepartmentSave() {
		return BasicDepartmentSave;
	}
	public void setDepartmentSave(WebElement departmentSave) {
		BasicDepartmentSave = departmentSave;
	}
	public WebElement getBasicMasterDesignation() {
		return BasicMasterDesignation;
	}
	public void setBasicMasterDesignation(WebElement basicMasterDesignation) {
		BasicMasterDesignation = basicMasterDesignation;
	}
	public WebElement getBasicMasterDesignationnewbtn() {
		return BasicMasterDesignationnewbtn;
	}
	public void setBasicMasterDesignationnewbtn(WebElement basicMasterDesignationnewbtn) {
		BasicMasterDesignationnewbtn = basicMasterDesignationnewbtn;
	}
	public WebElement getBasicMasterDesignationcode() {
		return BasicMasterDesignationcode;
	}
	public void setBasicMasterDesignationcode(WebElement basicMasterDesignationcode) {
		BasicMasterDesignationcode = basicMasterDesignationcode;
	}
	public WebElement getBasicMasterDesignationname() {
		return BasicMasterDesignationname;
	}
	public void setBasicMasterDesignationname(WebElement basicMasterDesignationname) {
		BasicMasterDesignationname = basicMasterDesignationname;
	}
	public WebElement getBasicMasterDesignationSave() {
		return BasicMasterDesignationSave;
	}
	public void setBasicMasterDesignationSave(WebElement basicMasterDesignationSave) {
		BasicMasterDesignationSave = basicMasterDesignationSave;
	}
	public WebElement getBasicMasterSection() {
		return BasicMasterSection;
	}
	public void setBasicMasterSection(WebElement basicMasterSection) {
		BasicMasterSection = basicMasterSection;
	}
	public WebElement getBasicMasterSectionnewbtn() {
		return BasicMasterSectionnewbtn;
	}
	public void setBasicMasterSectionnewbtn(WebElement basicMasterSectionnewbtn) {
		BasicMasterSectionnewbtn = basicMasterSectionnewbtn;
	}
	public WebElement getBasicMasterSectioncode() {
		return BasicMasterSectioncode;
	}
	public void setBasicMasterSectioncode(WebElement basicMasterSectioncode) {
		BasicMasterSectioncode = basicMasterSectioncode;
	}
	public WebElement getBasicMasterSectionname() {
		return BasicMasterSectionname;
	}
	public void setBasicMasterSectionname(WebElement basicMasterSectionname) {
		BasicMasterSectionname = basicMasterSectionname;
	}
	public WebElement getBasicMasterSectionDepartment() {
		return BasicMasterSectionDepartment;
	}
	public void setBasicMasterSectionDepartment(WebElement basicMasterSectionDepartment) {
		BasicMasterSectionDepartment = basicMasterSectionDepartment;
	}
	public WebElement getBasicMasterSectionSave() {
		return BasicMasterSectionSave;
	}
	public void setBasicMasterSectionSave(WebElement basicMasterSectionSave) {
		BasicMasterSectionSave = basicMasterSectionSave;
	}
	public WebElement getBasicMasterCategory() {
		return BasicMasterCategory;
	}
	public void setBasicMasterCategory(WebElement basicMasterCategory) {
		BasicMasterCategory = basicMasterCategory;
	}
	public WebElement getBasicMasterCategorynewbtn() {
		return BasicMasterCategorynewbtn;
	}
	public void setBasicMasterCategorynewbtn(WebElement basicMasterCategorynewbtn) {
		BasicMasterCategorynewbtn = basicMasterCategorynewbtn;
	}
	public WebElement getBasicMasterCategorycode() {
		return BasicMasterCategorycode;
	}
	public void setBasicMasterCategorycode(WebElement basicMasterCategorycode) {
		BasicMasterCategorycode = basicMasterCategorycode;
	}
	public WebElement getBasicMasterCategoryname() {
		return BasicMasterCategoryname;
	}
	public void setBasicMasterCategoryname(WebElement basicMasterCategoryname) {
		BasicMasterCategoryname = basicMasterCategoryname;
	}
	public WebElement getBasicMasterCategorySave() {
		return BasicMasterCategorySave;
	}
	public void setBasicMasterCategorySave(WebElement basicMasterCategorySave) {
		BasicMasterCategorySave = basicMasterCategorySave;
	}
	public WebElement getBasicMasterDesignationgroup() {
		return BasicMasterDesignationgroup;
	}
	public void setBasicMasterDesignationgroup(WebElement basicMasterDesignationgroup) {
		BasicMasterDesignationgroup = basicMasterDesignationgroup;
	}
	public WebElement getBasicMasterDesignationgroupnewbtn() {
		return BasicMasterDesignationgroupnewbtn;
	}
	public void setBasicMasterDesignationgroupnewbtn(WebElement basicMasterDesignationgroupnewbtn) {
		BasicMasterDesignationgroupnewbtn = basicMasterDesignationgroupnewbtn;
	}
	public WebElement getBasicMasterDesignationgroupcode() {
		return BasicMasterDesignationgroupcode;
	}
	public void setBasicMasterDesignationgroupcode(WebElement basicMasterDesignationgroupcode) {
		BasicMasterDesignationgroupcode = basicMasterDesignationgroupcode;
	}
	public WebElement getBasicMasterDesignationgroupname() {
		return BasicMasterDesignationgroupname;
	}
	public void setBasicMasterDesignationgroupname(WebElement basicMasterDesignationgroupname) {
		BasicMasterDesignationgroupname = basicMasterDesignationgroupname;
	}
	public WebElement getBasicMasterDesignationgroupSave() {
		return BasicMasterDesignationgroupSave;
	}
	public void setBasicMasterDesignationgroupSave(WebElement basicMasterDesignationgroupSave) {
		BasicMasterDesignationgroupSave = basicMasterDesignationgroupSave;
	}
	public WebElement getETMSsidetab() {
		return ETMSsidetab;
	}
	public void setETMSsidetab(WebElement eTMSsidetab) {
		ETMSsidetab = eTMSsidetab;
	}
	public WebElement getOTType() {
		return OTType;
	}
	public void setOTType(WebElement oTType) {
		OTType = oTType;
	}
	public WebElement getCheckWeeklyOt() {
		return CheckWeeklyOt;
	}
	public void setCheckWeeklyOt(WebElement checkWeeklyOt) {
		CheckWeeklyOt = checkWeeklyOt;
	}
	public WebElement getWorkingothours() {
		return workingothours;
	}
	public void setWorkingothours(WebElement workingothours) {
		this.workingothours = workingothours;
	}
	public WebElement getBranchselectEtmsside() {
		return BranchselectEtmsside;
	}
	public void setBranchselectEtmsside(WebElement branchselectEtmsside) {
		BranchselectEtmsside = branchselectEtmsside;
	}
	public WebElement getSelectShiftEtmsside() {
		return SelectShiftEtmsside;
	}
	public void setSelectShiftEtmsside(WebElement selectShiftEtmsside) {
		SelectShiftEtmsside = selectShiftEtmsside;
	}
	public WebElement getRestdayEtmsside() {
		return RestdayEtmsside;
	}
	public void setRestdayEtmsside(WebElement restdayEtmsside) {
		RestdayEtmsside = restdayEtmsside;
	}
	public WebElement getEtmssave() {
		return Etmssave;
	}
	public void setEtmssave(WebElement etmssave) {
		Etmssave = etmssave;
	}
	public WebElement getChangecustomer() {
		return Changecustomer;
	}
	public void setChangecustomer(WebElement changecustomer) {
		Changecustomer = changecustomer;
	}
	public WebElement getConfirmationdate() {
		return Confirmationdate;
	}
	public void setConfirmationdate(WebElement confirmationdate) {
		Confirmationdate = confirmationdate;
	}
	public WebElement getMaster() {
		return Master;
	}
	public void setMaster(WebElement master) {
		Master = master;
	}
	public WebElement getBasicemployeedetails() {
		return Basicemployeedetails;
	}
	public void setBasicemployeedetails(WebElement basicemployeedetails) {
		Basicemployeedetails = basicemployeedetails;
	}
	public WebElement getNewemp() {
		return Newemp;
	}
	public void setNewemp(WebElement newemp) {
		Newemp = newemp;
	}
	public WebElement getEtmscheckbox() {
		return Etmscheckbox;
	}
	public void setEtmscheckbox(WebElement etmscheckbox) {
		Etmscheckbox = etmscheckbox;
	}
	public WebElement getMobileattendencecheck() {
		return Mobileattendencecheck;
	}
	public void setMobileattendencecheck(WebElement mobileattendencecheck) {
		Mobileattendencecheck = mobileattendencecheck;
	}
	public WebElement getEmployeeCode() {
		return EmployeeCode;
	}
	public void setEmployeeCode(WebElement employeeCode) {
		EmployeeCode = employeeCode;
	}
	public WebElement getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(WebElement employeeName) {
		EmployeeName = employeeName;
	}
	public WebElement getGenderdrop() {
		return Genderdrop;
	}
	public void setGenderdrop(WebElement genderdrop) {
		Genderdrop = genderdrop;
	}
	public WebElement getMaritialstatusdrop() {
		return Maritialstatusdrop;
	}
	public void setMaritialstatusdrop(WebElement maritialstatusdrop) {
		Maritialstatusdrop = maritialstatusdrop;
	}
	public WebElement getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(WebElement eMAIL) {
		EMAIL = eMAIL;
	}
	public WebElement getMOBILEAREA() {
		return MOBILEAREA;
	}
	public void setMOBILEAREA(WebElement mOBILEAREA) {
		MOBILEAREA = mOBILEAREA;
	}
	public WebElement getMobilenumber() {
		return Mobilenumber;
	}
	public void setMobilenumber(WebElement mobilenumber) {
		Mobilenumber = mobilenumber;
	}
	public WebElement getJoinDate() {
		return JoinDate;
	}
	public void setJoinDate(WebElement joinDate) {
		JoinDate = joinDate;
	}
	public WebElement getProbation() {
		return Probation;
	}
	public void setProbation(WebElement probation) {
		Probation = probation;
	}
	public WebElement getFacereaderenter() {
		return Facereaderenter;
	}
	public void setFacereaderenter(WebElement facereaderenter) {
		Facereaderenter = facereaderenter;
	}
	public WebElement getDepartment() {
		return Department;
	}
	public void setDepartment(WebElement department) {
		Department = department;
	}
	public WebElement getSection() {
		return Section;
	}
	public void setSection(WebElement section) {
		Section = section;
	}
	public WebElement getDesignation() {
		return Designation;
	}
	public void setDesignation(WebElement designation) {
		Designation = designation;
	}
	public WebElement getHolidaygroup() {
		return Holidaygroup;
	}
	public void setHolidaygroup(WebElement holidaygroup) {
		Holidaygroup = holidaygroup;
	}
	public WebElement getHoursworked() {
		return Hoursworked;
	}
	public void setHoursworked(WebElement hoursworked) {
		Hoursworked = hoursworked;
	}
	public WebElement getDaysworking() {
		return Daysworking;
	}
	public void setDaysworking(WebElement daysworking) {
		Daysworking = daysworking;
	}
	public WebElement getParttimeflexi() {
		return Parttimeflexi;
	}
	public void setParttimeflexi(WebElement parttimeflexi) {
		Parttimeflexi = parttimeflexi;
	}
	public WebElement getCategory() {
		return Category;
	}
	public void setCategory(WebElement category) {
		Category = category;
	}
	public WebElement getLeavecategory() {
		return Leavecategory;
	}
	public void setLeavecategory(WebElement leavecategory) {
		Leavecategory = leavecategory;
	}
	public WebElement getEmpbasicSave() {
		return EmpbasicSave;
	}
	public void setEmpbasicSave(WebElement empbasicSave) {
		EmpbasicSave = empbasicSave;
	}

	public WebElement getChangepassworduser() {
		return changepassworduser;
	}

	public void setChangepassworduser(WebElement changepassworduser) {
		this.changepassworduser = changepassworduser;
	}

	public WebElement getCurrentpassworduser() {
		return currentpassworduser;
	}

	public void setCurrentpassworduser(WebElement currentpassworduser) {
		this.currentpassworduser = currentpassworduser;
	}

	public WebElement getNewpasschangeuser() {
		return newpasschangeuser;
	}

	public void setNewpasschangeuser(WebElement newpasschangeuser) {
		this.newpasschangeuser = newpasschangeuser;
	}

	public WebElement getRenewpasschangeuser() {
		return renewpasschangeuser;
	}

	public void setRenewpasschangeuser(WebElement renewpasschangeuser) {
		this.renewpasschangeuser = renewpasschangeuser;
	}

	public WebElement getSavechangepassworduser() {
		return savechangepassworduser;
	}

	public void setSavechangepassworduser(WebElement savechangepassworduser) {
		this.savechangepassworduser = savechangepassworduser;
	}

	public WebElement getLogoutuser() {
		return logoutuser;
	}

	public void setLogoutuser(WebElement logoutuser) {
		this.logoutuser = logoutuser;
	}

	public WebElement getClickEmail() {
		return ClickEmail;
	}

	public void setClickEmail(WebElement clickEmail) {
		ClickEmail = clickEmail;
	}

	public WebElement getScrollmailinator() {
		return scrollmailinator;
	}

	public void setScrollmailinator(WebElement scrollmailinator) {
		this.scrollmailinator = scrollmailinator;
	}

	public WebElement getSearchMailinator() {
		return SearchMailinator;
	}

	public void setSearchMailinator(WebElement searchMailinator) {
		SearchMailinator = searchMailinator;
	}

	public WebElement getNewpasswordreset() {
		return Newpasswordreset;
	}

	public void setNewpasswordreset(WebElement newpasswordreset) {
		Newpasswordreset = newpasswordreset;
	}

	public WebElement getReNewpasswordreset() {
		return ReNewpasswordreset;
	}

	public void setReNewpasswordreset(WebElement reNewpasswordreset) {
		ReNewpasswordreset = reNewpasswordreset;
	}

	public WebElement getSavepasswordreset() {
		return savepasswordreset;
	}

	public void setSavepasswordreset(WebElement savepasswordreset) {
		this.savepasswordreset = savepasswordreset;
	}

	public WebElement getFrames() {
		return frames;
	}

	public void setFrames(WebElement frames) {
		this.frames = frames;
	}

	public WebElement getMailinatorresetpass() {
		return mailinatorresetpass;
	}

	public void setMailinatorresetpass(WebElement mailinatorresetpass) {
		this.mailinatorresetpass = mailinatorresetpass;
	}

	public WebElement getMailinatorname() {
		return mailinatorname;
	}

	public void setMailinatorname(WebElement mailinatorname) {
		this.mailinatorname = mailinatorname;
	}

	public WebElement getMailinatorvisiblemail() {
		return mailinatorvisiblemail;
	}

	public void setMailinatorvisiblemail(WebElement mailinatorvisiblemail) {
		this.mailinatorvisiblemail = mailinatorvisiblemail;
	}

	public WebElement getChangeDB() {
		return Changecustomer;
	}

	public void setChangeDB(WebElement changeDB) {
		Changecustomer = changeDB;
	}

	public WebElement getDBname() {
		return DBname;
	}

	public void setDBname(WebElement dBname) {
		DBname = dBname;
	}

	public WebElement getDBnameselect() {
		return DBnameselect;
	}

	public void setDBnameselect(WebElement dBnameselect) {
		DBnameselect = dBnameselect;
	}

	public WebElement getDBnameenter() {
		return DBnameenter;
	}

	public void setDBnameenter(WebElement dBnameenter) {
		DBnameenter = dBnameenter;
	}

	public WebElement getDBnameselectteja() {
		return DBnameselectteja;
	}

	public void setDBnameselectteja(WebElement dBnameselectteja) {
		DBnameselectteja = dBnameselectteja;
	}

	public WebElement getAdministrator() {
		return Administrator;
	}

	public void setAdministrator(WebElement administrator) {
		Administrator = administrator;
	}

	public WebElement getUserCreation() {
		return UserCreation;
	}

	public void setUserCreation(WebElement userCreation) {
		UserCreation = userCreation;
	}

	public WebElement getNewUser() {
		return NewUser;
	}

	public void setNewUser(WebElement newUser) {
		NewUser = newUser;
	}

	public WebElement getDisplayname() {
		return Displayname;
	}

	public void setDisplayname(WebElement displayname) {
		Displayname = displayname;
	}

	public WebElement getAllowloginusingcheckbox() {
		return allowloginusingcheckbox;
	}

	public void setAllowloginusingcheckbox(WebElement allowloginusingcheckbox) {
		this.allowloginusingcheckbox = allowloginusingcheckbox;
	}

	public WebElement getPrimaryemail() {
		return primaryemail;
	}

	public void setPrimaryemail(WebElement primaryemail) {
		this.primaryemail = primaryemail;
	}

	public WebElement getMobilearea() {
		return mobilearea;
	}

	public void setMobilearea(WebElement mobilearea) {
		this.mobilearea = mobilearea;
	}

	public WebElement getMobilenumber1() {
		return mobilenumber;
	}

	public void setMobilenumber1(WebElement mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public WebElement getShowbasicsalary() {
		return showbasicsalary;
	}

	public void setShowbasicsalary(WebElement showbasicsalary) {
		this.showbasicsalary = showbasicsalary;
	}

	public WebElement getAllowlockattendencedetails() {
		return allowlockattendencedetails;
	}

	public void setAllowlockattendencedetails(WebElement allowlockattendencedetails) {
		this.allowlockattendencedetails = allowlockattendencedetails;
	}

	public WebElement getAllowunlockattendencedetails() {
		return allowunlockattendencedetails;
	}

	public void setAllowunlockattendencedetails(WebElement allowunlockattendencedetails) {
		this.allowunlockattendencedetails = allowunlockattendencedetails;
	}

	public WebElement getAppAccess() {
		return AppAccess;
	}

	public void setAppAccess(WebElement appAccess) {
		AppAccess = appAccess;
	}

	public WebElement getETms() {
		return ETms;
	}

	public void setETms(WebElement eTms) {
		ETms = eTms;
	}

	public WebElement getELeave() {
		return ELeave;
	}

	public void setELeave(WebElement eLeave) {
		ELeave = eLeave;
	}

	public WebElement getEPayroll() {
		return EPayroll;
	}

	public void setEPayroll(WebElement ePayroll) {
		EPayroll = ePayroll;
	}

	public WebElement getEAttendence() {
		return EAttendence;
	}

	public void setEAttendence(WebElement eAttendence) {
		EAttendence = eAttendence;
	}

	public WebElement getEClaim() {
		return EClaim;
	}

	public void setEClaim(WebElement eClaim) {
		EClaim = eClaim;
	}

	public WebElement getEAppraisal() {
		return EAppraisal;
	}

	public void setEAppraisal(WebElement eAppraisal) {
		EAppraisal = eAppraisal;
	}

	public WebElement getAppAccessSave() {
		return AppAccessSave;
	}

	public void setAppAccessSave(WebElement appAccessSave) {
		AppAccessSave = appAccessSave;
	}

	public WebElement getAppAccessCancel() {
		return AppAccessCancel;
	}

	public void setAppAccessCancel(WebElement appAccessCancel) {
		AppAccessCancel = appAccessCancel;
	}

	public WebElement getCompanyAcess() {
		return CompanyAcess;
	}

	public void setCompanyAcess(WebElement companyAcess) {
		CompanyAcess = companyAcess;
	}

	public WebElement getSelectcompany() {
		return Selectcompany;
	}

	public void setSelectcompany(WebElement selectcompany) {
		Selectcompany = selectcompany;
	}

	public WebElement getCompanyAccessSave() {
		return CompanyAccessSave;
	}

	public void setCompanyAccessSave(WebElement companyAccessSave) {
		CompanyAccessSave = companyAccessSave;
	}

	public WebElement getCompanyAccessCancel() {
		return CompanyAccessCancel;
	}

	public void setCompanyAccessCancel(WebElement companyAccessCancel) {
		CompanyAccessCancel = companyAccessCancel;
	}

	public WebElement getDepartmentAccess() {
		return DepartmentAccess;
	}

	public void setDepartmentAccess(WebElement departmentAccess) {
		DepartmentAccess = departmentAccess;
	}

	public WebElement getETmsSuperadmin() {
		return ETmsSuperadmin;
	}

	public void setETmsSuperadmin(WebElement eTmsSuperadmin) {
		ETmsSuperadmin = eTmsSuperadmin;
	}

	public WebElement getELeaveSuperadmin() {
		return ELeaveSuperadmin;
	}

	public void setELeaveSuperadmin(WebElement eLeaveSuperadmin) {
		ELeaveSuperadmin = eLeaveSuperadmin;
	}

	public WebElement getEPayrollSuperadmin() {
		return EPayrollSuperadmin;
	}

	public void setEPayrollSuperadmin(WebElement ePayrollSuperadmin) {
		EPayrollSuperadmin = ePayrollSuperadmin;
	}

	public WebElement getEAttendenceSuperadmin() {
		return EAttendenceSuperadmin;
	}

	public void setEAttendenceSuperadmin(WebElement eAttendenceSuperadmin) {
		EAttendenceSuperadmin = eAttendenceSuperadmin;
	}

	public WebElement getEClaimSuperadmin() {
		return EClaimSuperadmin;
	}

	public void setEClaimSuperadmin(WebElement eClaimSuperadmin) {
		EClaimSuperadmin = eClaimSuperadmin;
	}

	public WebElement getEAppraisalSuperadmin() {
		return EAppraisalSuperadmin;
	}

	public void setEAppraisalSuperadmin(WebElement eAppraisalSuperadmin) {
		EAppraisalSuperadmin = eAppraisalSuperadmin;
	}

	public WebElement getDepartmentAccessSave() {
		return DepartmentAccessSave;
	}

	public void setDepartmentAccessSave(WebElement departmentAccessSave) {
		DepartmentAccessSave = departmentAccessSave;
	}

	public WebElement getDepartmentAccessCancel() {
		return DepartmentAccessCancel;
	}

	public void setDepartmentAccessCancel(WebElement departmentAccessCancel) {
		DepartmentAccessCancel = departmentAccessCancel;
	}

	public WebElement getLocationAccess() {
		return LocationAccess;
	}

	public void setLocationAccess(WebElement locationAccess) {
		LocationAccess = locationAccess;
	}

	public WebElement getLocationAll() {
		return LocationAll;
	}

	public void setLocationAll(WebElement locationAll) {
		LocationAll = locationAll;
	}

	public WebElement getLocationSave() {
		return LocationSave;
	}

	public void setLocationSave(WebElement locationSave) {
		LocationSave = locationSave;
	}

	public WebElement getLocationDelete() {
		return LocationDelete;
	}

	public void setLocationDelete(WebElement locationDelete) {
		LocationDelete = locationDelete;
	}

	public void setClick(WebElement click) {
		this.click = click;
	}

	public WebElement getUsername() {
		return Username;
	}

	public void setUsername(WebElement username) {
		Username = username;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getClick() {
		return click;
	}

	
	public WebElement getSectionDepartment() {
		return SectionDepartment;
	}
	public void setSectionDepartment(WebElement sectionDepartment) {
		SectionDepartment = sectionDepartment;
	}
	public WebElement getPwd() {
		return pwd;
	}
	public void setPwd(WebElement pwd) {
		this.pwd = pwd;
	}
	public WebElement getDBnam() {
		return DBnam;
	}
	public void setDBnam(WebElement dBnam) {
		DBnam = dBnam;
	}
	public WebElement getAllowanceSettings() {
		return AllowanceSettings;
	}
	public void setAllowanceSettings(WebElement allowanceSettings) {
		AllowanceSettings = allowanceSettings;
	}
	public WebElement getAllowance() {
		return Allowance;
	}
	public void setAllowance(WebElement allowance) {
		Allowance = allowance;
	}
	public WebElement getNewallowance() {
		return newallowance;
	}
	public void setNewallowance(WebElement newallowance) {
		this.newallowance = newallowance;
	}
	public WebElement getAllowancecode() {
		return allowancecode;
	}
	public void setAllowancecode(WebElement allowancecode) {
		this.allowancecode = allowancecode;
	}
	public WebElement getAllowancename() {
		return allowancename;
	}
	public void setAllowancename(WebElement allowancename) {
		this.allowancename = allowancename;
	}
	public WebElement getAllowanceamount() {
		return allowanceamount;
	}
	public void setAllowanceamount(WebElement allowanceamount) {
		this.allowanceamount = allowanceamount;
	}
	public WebElement getChkbytimein() {
		return chkbytimein;
	}
	public void setChkbytimein(WebElement chkbytimein) {
		this.chkbytimein = chkbytimein;
	}
	public WebElement getSelectclkbytimein() {
		return selectclkbytimein;
	}
	public void setSelectclkbytimein(WebElement selectclkbytimein) {
		this.selectclkbytimein = selectclkbytimein;
	}
	public WebElement getIntime() {
		return intime;
	}
	public void setIntime(WebElement intime) {
		this.intime = intime;
	}
	public WebElement getChkbyouttime() {
		return chkbyouttime;
	}
	public void setChkbyouttime(WebElement chkbyouttime) {
		this.chkbyouttime = chkbyouttime;
	}
	public WebElement getSelectclkbyouttime() {
		return selectclkbyouttime;
	}
	public void setSelectclkbyouttime(WebElement selectclkbyouttime) {
		this.selectclkbyouttime = selectclkbyouttime;
	}
	public WebElement getOuttime() {
		return outtime;
	}
	public void setOuttime(WebElement outtime) {
		this.outtime = outtime;
	}
	public WebElement getChkactual() {
		return chkactual;
	}
	public void setChkactual(WebElement chkactual) {
		this.chkactual = chkactual;
	}
	public WebElement getSelectdd1actual() {
		return selectdd1actual;
	}
	public void setSelectdd1actual(WebElement selectdd1actual) {
		this.selectdd1actual = selectdd1actual;
	}
	public WebElement getActualtime() {
		return actualtime;
	}
	public void setActualtime(WebElement actualtime) {
		this.actualtime = actualtime;
	}
	public WebElement getChkbynrm() {
		return chkbynrm;
	}
	public void setChkbynrm(WebElement chkbynrm) {
		this.chkbynrm = chkbynrm;
	}
	public WebElement getSelectnrm() {
		return selectnrm;
	}
	public void setSelectnrm(WebElement selectnrm) {
		this.selectnrm = selectnrm;
	}
	public WebElement getNrm() {
		return nrm;
	}
	public void setNrm(WebElement nrm) {
		this.nrm = nrm;
	}
	public WebElement getScrolldown() {
		return scrolldown;
	}
	public void setScrolldown(WebElement scrolldown) {
		this.scrolldown = scrolldown;
	}
	public WebElement getChkbyot() {
		return chkbyot;
	}
	public void setChkbyot(WebElement chkbyot) {
		this.chkbyot = chkbyot;
	}
	public WebElement getSelectot() {
		return selectot;
	}
	public void setSelectot(WebElement selectot) {
		this.selectot = selectot;
	}
	public WebElement getOTtime() {
		return OTtime;
	}
	public void setOTtime(WebElement oTtime) {
		OTtime = oTtime;
	}
	public WebElement getChkbylate() {
		return chkbylate;
	}
	public void setChkbylate(WebElement chkbylate) {
		this.chkbylate = chkbylate;
	}
	public WebElement getSelectlate() {
		return selectlate;
	}
	public void setSelectlate(WebElement selectlate) {
		this.selectlate = selectlate;
	}
	public WebElement getLatetime() {
		return latetime;
	}
	public void setLatetime(WebElement latetime) {
		this.latetime = latetime;
	}
	public WebElement getChkbyearly() {
		return chkbyearly;
	}
	public void setChkbyearly(WebElement chkbyearly) {
		this.chkbyearly = chkbyearly;
	}
	public WebElement getSelectearlytime() {
		return selectearlytime;
	}
	public void setSelectearlytime(WebElement selectearlytime) {
		this.selectearlytime = selectearlytime;
	}
	public WebElement getEarlyouttime() {
		return earlyouttime;
	}
	public void setEarlyouttime(WebElement earlyouttime) {
		this.earlyouttime = earlyouttime;
	}
	public WebElement getChkphrestday() {
		return chkphrestday;
	}
	public void setChkphrestday(WebElement chkphrestday) {
		this.chkphrestday = chkphrestday;
	}
	public WebElement getSelectphrestday() {
		return selectphrestday;
	}
	public void setSelectphrestday(WebElement selectphrestday) {
		this.selectphrestday = selectphrestday;
	}
	public WebElement getPHrestday() {
		return PHrestday;
	}
	public void setPHrestday(WebElement pHrestday) {
		PHrestday = pHrestday;
	}
	public WebElement getChkbyday() {
		return chkbyday;
	}
	public void setChkbyday(WebElement chkbyday) {
		this.chkbyday = chkbyday;
	}
	public WebElement getChkallday() {
		return chkallday;
	}
	public void setChkallday(WebElement chkallday) {
		this.chkallday = chkallday;
	}
	public WebElement getChkbyshift() {
		return chkbyshift;
	}
	public void setChkbyshift(WebElement chkbyshift) {
		this.chkbyshift = chkbyshift;
	}
	public WebElement getChkpayshift() {
		return chkpayshift;
	}
	public void setChkpayshift(WebElement chkpayshift) {
		this.chkpayshift = chkpayshift;
	}
	public WebElement getChkallshift() {
		return chkallshift;
	}
	public void setChkallshift(WebElement chkallshift) {
		this.chkallshift = chkallshift;
	}
	public WebElement getChkbyreason() {
		return chkbyreason;
	}
	public void setChkbyreason(WebElement chkbyreason) {
		this.chkbyreason = chkbyreason;
	}
	public WebElement getChkpayreason() {
		return chkpayreason;
	}
	public void setChkpayreason(WebElement chkpayreason) {
		this.chkpayreason = chkpayreason;
	}
	public WebElement getChkreasonall() {
		return chkreasonall;
	}
	public void setChkreasonall(WebElement chkreasonall) {
		this.chkreasonall = chkreasonall;
	}
	public WebElement getChkclkloc() {
		return chkclkloc;
	}
	public void setChkclkloc(WebElement chkclkloc) {
		this.chkclkloc = chkclkloc;
	}
	public WebElement getPayreasonchkall() {
		return payreasonchkall;
	}
	public void setPayreasonchkall(WebElement payreasonchkall) {
		this.payreasonchkall = payreasonchkall;
	}
	public WebElement getSave() {
		return save;
	}
	public void setSave(WebElement save) {
		this.save = save;
	}
	public WebElement getCancel() {
		return cancel;
	}
	public void setCancel(WebElement cancel) {
		this.cancel = cancel;
	}
	public WebElement getShiftcode0() {
		return shiftcode0;
	}
	public void setShiftcode0(WebElement shiftcode0) {
		this.shiftcode0 = shiftcode0;
	}
	public WebElement getShiftcode1() {
		return shiftcode1;
	}
	public void setShiftcode1(WebElement shiftcode1) {
		this.shiftcode1 = shiftcode1;
	}
	public WebElement getShiftcode2() {
		return shiftcode2;
	}
	public void setShiftcode2(WebElement shiftcode2) {
		this.shiftcode2 = shiftcode2;
	}
	public WebElement getShiftcode3() {
		return shiftcode3;
	}
	public void setShiftcode3(WebElement shiftcode3) {
		this.shiftcode3 = shiftcode3;
	}
	public WebElement getChkreason0() {
		return chkreason0;
	}
	public void setChkreason0(WebElement chkreason0) {
		this.chkreason0 = chkreason0;
	}
	public WebElement getChkreason1() {
		return chkreason1;
	}
	public void setChkreason1(WebElement chkreason1) {
		this.chkreason1 = chkreason1;
	}
	public WebElement getChkreason2() {
		return chkreason2;
	}
	public void setChkreason2(WebElement chkreason2) {
		this.chkreason2 = chkreason2;
	}
	public WebElement getChkreason3() {
		return chkreason3;
	}
	public void setChkreason3(WebElement chkreason3) {
		this.chkreason3 = chkreason3;
	}
	public WebElement getChkreason4() {
		return chkreason4;
	}
	public void setChkreason4(WebElement chkreason4) {
		this.chkreason4 = chkreason4;
	}

	public WebElement getStaffallowance() {
		return staffallowance;
	}
	public void setStaffallowance(WebElement staffallowance) {
		this.staffallowance = staffallowance;
	}
	public WebElement getSearchtext() {
		return searchtext;
	}
	public void setSearchtext(WebElement searchtext) {
		this.searchtext = searchtext;
	}
	public WebElement getSearch() {
		return search;
	}
	public void setSearch(WebElement search) {
		this.search = search;
	}
	public WebElement getEditicon() {
		return editicon;
	}
	public void setEditicon(WebElement editicon) {
		this.editicon = editicon;
	}
	public WebElement getAttendance() {
		return attendance;
	}
	public void setAttendance(WebElement attendance) {
		this.attendance = attendance;
	}
	public WebElement getBox1() {
		return box1;
	}
	public void setBox1(WebElement box1) {
		this.box1 = box1;
	}
	public WebElement getBox2() {
		return box2;
	}
	public void setBox2(WebElement box2) {
		this.box2 = box2;
	}
	public WebElement getBox3() {
		return box3;
	}
	public void setBox3(WebElement box3) {
		this.box3 = box3;
	}
	public WebElement getBox4() {
		return box4;
	}
	public void setBox4(WebElement box4) {
		this.box4 = box4;
	}
	public WebElement getOperator1() {
		return operator1;
	}
	public void setOperator1(WebElement operator1) {
		this.operator1 = operator1;
	}
	public WebElement getOperator2() {
		return operator2;
	}
	public void setOperator2(WebElement operator2) {
		this.operator2 = operator2;
	}
	public WebElement getOperator3() {
		return operator3;
	}
	public void setOperator3(WebElement operator3) {
		this.operator3 = operator3;
	}
	public WebElement getHealth() {
		return health;
	}
	public void setHealth(WebElement health) {
		this.health = health;
	}
	public WebElement getDailyhealth() {
		return dailyhealth;
	}
	public void setDailyhealth(WebElement dailyhealth) {
		this.dailyhealth = dailyhealth;
	}
	public WebElement getHealthbox1() {
		return healthbox1;
	}
	public void setHealthbox1(WebElement healthbox1) {
		this.healthbox1 = healthbox1;
	}
	public WebElement getHealthbox2() {
		return healthbox2;
	}
	public void setHealthbox2(WebElement healthbox2) {
		this.healthbox2 = healthbox2;
	}
	public WebElement getHealthbox3() {
		return healthbox3;
	}
	public void setHealthbox3(WebElement healthbox3) {
		this.healthbox3 = healthbox3;
	}
	public WebElement getHealthbox4() {
		return healthbox4;
	}
	public void setHealthbox4(WebElement healthbox4) {
		this.healthbox4 = healthbox4;
	}
	public WebElement getHealthoperator1() {
		return healthoperator1;
	}
	public void setHealthoperator1(WebElement healthoperator1) {
		this.healthoperator1 = healthoperator1;
	}
	public WebElement getHealthoperator2() {
		return healthoperator2;
	}
	public void setHealthoperator2(WebElement healthoperator2) {
		this.healthoperator2 = healthoperator2;
	}
	public WebElement getMonthlyhealth() {
		return monthlyhealth;
	}
	public void setMonthlyhealth(WebElement monthlyhealth) {
		this.monthlyhealth = monthlyhealth;
	}
	public WebElement getTransport() {
		return transport;
	}
	public void setTransport(WebElement transport) {
		this.transport = transport;
	}
	public WebElement getDailytransport() {
		return dailytransport;
	}
	public void setDailytransport(WebElement dailytransport) {
		this.dailytransport = dailytransport;
	}
	public WebElement getTransportbox1() {
		return transportbox1;
	}
	public void setTransportbox1(WebElement transportbox1) {
		this.transportbox1 = transportbox1;
	}
	public WebElement getTransportbox2() {
		return transportbox2;
	}
	public void setTransportbox2(WebElement transportbox2) {
		this.transportbox2 = transportbox2;
	}
	public WebElement getTransportbox3() {
		return transportbox3;
	}
	public void setTransportbox3(WebElement transportbox3) {
		this.transportbox3 = transportbox3;
	}
	public WebElement getTransportbox4() {
		return transportbox4;
	}
	public void setTransportbox4(WebElement transportbox4) {
		this.transportbox4 = transportbox4;
	}
	public WebElement getTransportoperator1() {
		return transportoperator1;
	}
	public void setTransportoperator1(WebElement transportoperator1) {
		this.transportoperator1 = transportoperator1;
	}
	public WebElement getTransportoperator2() {
		return transportoperator2;
	}
	public void setTransportoperator2(WebElement transportoperator2) {
		this.transportoperator2 = transportoperator2;
	}
	public WebElement getTransportoperator3() {
		return transportoperator3;
	}
	public void setTransportoperator3(WebElement transportoperator3) {
		this.transportoperator3 = transportoperator3;
	}
	public WebElement getMeals() {
		return meals;
	}
	public void setMeals(WebElement meals) {
		this.meals = meals;
	}
	public WebElement getDailymeals() {
		return dailymeals;
	}
	public void setDailymeals(WebElement dailymeals) {
		this.dailymeals = dailymeals;
	}
	public WebElement getMealsbox1() {
		return mealsbox1;
	}
	public void setMealsbox1(WebElement mealsbox1) {
		this.mealsbox1 = mealsbox1;
	}
	public WebElement getMealsbox2() {
		return mealsbox2;
	}
	public void setMealsbox2(WebElement mealsbox2) {
		this.mealsbox2 = mealsbox2;
	}
	public WebElement getMealsbox3() {
		return mealsbox3;
	}
	public void setMealsbox3(WebElement mealsbox3) {
		this.mealsbox3 = mealsbox3;
	}
	public WebElement getMealsbox4() {
		return mealsbox4;
	}
	public void setMealsbox4(WebElement mealsbox4) {
		this.mealsbox4 = mealsbox4;
	}
	public WebElement getMealsoperator1() {
		return mealsoperator1;
	}
	public void setMealsoperator1(WebElement mealsoperator1) {
		this.mealsoperator1 = mealsoperator1;
	}
	public WebElement getMealsoperator2() {
		return mealsoperator2;
	}
	public void setMealsoperator2(WebElement mealsoperator2) {
		this.mealsoperator2 = mealsoperator2;
	}
	public WebElement getMealsoperator3() {
		return mealsoperator3;
	}
	public void setMealsoperator3(WebElement mealsoperator3) {
		this.mealsoperator3 = mealsoperator3;
	}
	public WebElement getSavebutton() {
		return savebutton;
	}
	public void setSavebutton(WebElement savebutton) {
		this.savebutton = savebutton;
	}
	public void setShiftsetting(WebElement shiftsetting) {
		this.shiftsetting = shiftsetting;
	}
	public void setShiftmaster(WebElement shiftmaster) {
		this.shiftmaster = shiftmaster;
	}
	public void setNewshift(WebElement newshift) {
		this.newshift = newshift;
	}
	public void setShiftcode(WebElement shiftcode) {
		this.shiftcode = shiftcode;
	}
	public void setShiftname(WebElement shiftname) {
		this.shiftname = shiftname;
	}
	public void setLategraceperiod(WebElement lategraceperiod) {
		this.lategraceperiod = lategraceperiod;
	}
	public void setAftereveryminuts(WebElement aftereveryminuts) {
		this.aftereveryminuts = aftereveryminuts;
	}
	public void setLatededuct(WebElement latededuct) {
		this.latededuct = latededuct;
	}
	public void setExcludegraceperiod(WebElement excludegraceperiod) {
		Excludegraceperiod = excludegraceperiod;
	}
	public void setLatenessoffsetot(WebElement latenessoffsetot) {
		this.latenessoffsetot = latenessoffsetot;
	}
	public void setEarlygraceperiod(WebElement earlygraceperiod) {
		this.earlygraceperiod = earlygraceperiod;
	}
	public void setEarlyoutafterevery(WebElement earlyoutafterevery) {
		this.earlyoutafterevery = earlyoutafterevery;
	}
	public void setEarlyoutdeduct(WebElement earlyoutdeduct) {
		Earlyoutdeduct = earlyoutdeduct;
	}
	public void setRoundscroll(WebElement roundscroll) {
		this.roundscroll = roundscroll;
	}
	public void setRoundvalue(WebElement roundvalue) {
		this.roundvalue = roundvalue;
	}
	public void setMinimumovertime(WebElement minimumovertime) {
		this.minimumovertime = minimumovertime;
	}
	public void setCheckearlyot(WebElement checkearlyot) {
		this.checkearlyot = checkearlyot;
	}
	public void setEroundscroll(WebElement eroundscroll) {
		this.eroundscroll = eroundscroll;
	}
	public void setEarlyOT(WebElement earlyOT) {
		EarlyOT = earlyOT;
	}
	public void setTxtearlyminOT(WebElement txtearlyminOT) {
		this.txtearlyminOT = txtearlyminOT;
	}
	public void setLunchlate0(WebElement lunchlate0) {
		this.lunchlate0 = lunchlate0;
	}
	public void setLunchlate1(WebElement lunchlate1) {
		this.lunchlate1 = lunchlate1;
	}
	public void setLunchlate2(WebElement lunchlate2) {
		this.lunchlate2 = lunchlate2;
	}
	public void setDinnerlate0(WebElement dinnerlate0) {
		this.dinnerlate0 = dinnerlate0;
	}
	public void setDinnerlate1(WebElement dinnerlate1) {
		this.dinnerlate1 = dinnerlate1;
	}
	public void setDinnerlate2(WebElement dinnerlate2) {
		this.dinnerlate2 = dinnerlate2;
	}
	public void setDinnerlate20(WebElement dinnerlate20) {
		this.dinnerlate20 = dinnerlate20;
	}
	public void setDinnerlate21(WebElement dinnerlate21) {
		this.dinnerlate21 = dinnerlate21;
	}
	public void setDinnerlate22(WebElement dinnerlate22) {
		this.dinnerlate22 = dinnerlate22;
	}
	public void setChkmonday(WebElement chkmonday) {
		this.chkmonday = chkmonday;
	}
	public void setChktuesday(WebElement chktuesday) {
		this.chktuesday = chktuesday;
	}
	public void setChkwednesday(WebElement chkwednesday) {
		this.chkwednesday = chkwednesday;
	}
	public void setChkthursday(WebElement chkthursday) {
		this.chkthursday = chkthursday;
	}
	public void setChkfriday(WebElement chkfriday) {
		this.chkfriday = chkfriday;
	}
	public void setChksaturday(WebElement chksaturday) {
		this.chksaturday = chksaturday;
	}
	public void setChksunday(WebElement chksunday) {
		this.chksunday = chksunday;
	}
	public void setDaychange(WebElement daychange) {
		this.daychange = daychange;
	}
	public void setChkoffsetPH(WebElement chkoffsetPH) {
		this.chkoffsetPH = chkoffsetPH;
	}
	public void setTimein(WebElement timein) {
		Timein = timein;
	}
	public void setTimeout(WebElement timeout) {
		Timeout = timeout;
	}
	public void setDaychange1(WebElement daychange1) {
		this.daychange1 = daychange1;
	}
	public void setLunchout(WebElement lunchout) {
		Lunchout = lunchout;
	}
	public void setLunchin(WebElement lunchin) {
		Lunchin = lunchin;
	}
	public void setOvertimedropdown(WebElement overtimedropdown) {
		this.overtimedropdown = overtimedropdown;
	}
	public void setExtra(WebElement extra) {
		this.extra = extra;
	}
	public void setErate(WebElement erate) {
		this.erate = erate;
	}
	public void setMaxhr(WebElement maxhr) {
		Maxhr = maxhr;
	}
	public void setLunchlatecheck(WebElement lunchlatecheck) {
		this.lunchlatecheck = lunchlatecheck;
	}
	public void setPhdropdown(WebElement phdropdown) {
		this.phdropdown = phdropdown;
	}
	public void setPhmax(WebElement phmax) {
		this.phmax = phmax;
	}
	public void setSaveshiftmaster(WebElement saveshiftmaster) {
		this.saveshiftmaster = saveshiftmaster;
	}
	public void setCancelshiftmaster(WebElement cancelshiftmaster) {
		this.cancelshiftmaster = cancelshiftmaster;
	}
	public void setOT1hrssu0(WebElement oT1hrssu0) {
		OT1hrssu0 = oT1hrssu0;
	}
	public void setOTD1Ded0su(WebElement oTD1Ded0su) {
		OTD1Ded0su = oTD1Ded0su;
	}
	public void setOT2hrssu0(WebElement oT2hrssu0) {
		OT2hrssu0 = oT2hrssu0;
	}
	public void setOTD2Dedsu(WebElement oTD2Dedsu) {
		OTD2Dedsu = oTD2Dedsu;
	}
	public void setOT3hrssu0(WebElement oT3hrssu0) {
		OT3hrssu0 = oT3hrssu0;
	}
	public void setOTD3Dedsu(WebElement oTD3Dedsu) {
		OTD3Dedsu = oTD3Dedsu;
	}
	public void setDin1out0br1su(WebElement din1out0br1su) {
		Din1out0br1su = din1out0br1su;
	}
	public void setDin1in0br1su(WebElement din1in0br1su) {
		Din1in0br1su = din1in0br1su;
	}
	public void setDin2outbr2su(WebElement din2outbr2su) {
		Din2outbr2su = din2outbr2su;
	}
	public void setDin2inbrsu(WebElement din2inbrsu) {
		Din2inbrsu = din2inbrsu;
	}
	public void setDin3outbrsu(WebElement din3outbrsu) {
		Din3outbrsu = din3outbrsu;
	}
	public void setDin3inbrsu(WebElement din3inbrsu) {
		Din3inbrsu = din3inbrsu;
	}
	public void setChkshowoff(WebElement chkshowoff) {
		this.chkshowoff = chkshowoff;
	}
	public void setTimeinmon(WebElement timeinmon) {
		this.timeinmon = timeinmon;
	}
	public void setTimeoutmon(WebElement timeoutmon) {
		this.timeoutmon = timeoutmon;
	}
	public void setDaychangemon(WebElement daychangemon) {
		this.daychangemon = daychangemon;
	}
	public void setLunchoutmon(WebElement lunchoutmon) {
		this.lunchoutmon = lunchoutmon;
	}
	public void setLunnchinmon(WebElement lunnchinmon) {
		this.lunnchinmon = lunnchinmon;
	}
	public void setRestdaymon(WebElement restdaymon) {
		Restdaymon = restdaymon;
	}
	public void setPageright(WebElement pageright) {
		this.pageright = pageright;
	}
	public void setPageleft(WebElement pageleft) {
		this.pageleft = pageleft;
	}
	public void setDdOtratemon(WebElement ddOtratemon) {
		this.ddOtratemon = ddOtratemon;
	}
	public void setChkotextramon(WebElement chkotextramon) {
		this.chkotextramon = chkotextramon;
	}
	public void setExtraratemon(WebElement extraratemon) {
		this.extraratemon = extraratemon;
	}
	public WebElement getDbiconclick() {
		return dbiconclick;
	}
	public WebElement getDbmovecursor() {
		return dbmovecursor;
	}
	public WebElement getDbnameclick() {
		return dbnameclick;
	}
	public void setMaxhrmon(WebElement maxhrmon) {
		this.maxhrmon = maxhrmon;
	}
	public void setLunchlatemon(WebElement lunchlatemon) {
		this.lunchlatemon = lunchlatemon;
	}
	public void setDinlatemon(WebElement dinlatemon) {
		this.dinlatemon = dinlatemon;
	}
	public void setDin2latemon(WebElement din2latemon) {
		this.din2latemon = din2latemon;
	}
	public void setDdphmon(WebElement ddphmon) {
		this.ddphmon = ddphmon;
	}
	public void setPhmaxmon(WebElement phmaxmon) {
		this.phmaxmon = phmaxmon;
	}
	public void setOThrs1mon(WebElement oThrs1mon) {
		OThrs1mon = oThrs1mon;
	}
	public void setOT1Ded1mon(WebElement oT1Ded1mon) {
		OT1Ded1mon = oT1Ded1mon;
	}
	public void setOT2hrsmon(WebElement oT2hrsmon) {
		OT2hrsmon = oT2hrsmon;
	}
	public void setOTded2mon(WebElement oTded2mon) {
		OTded2mon = oTded2mon;
	}
	public void setOT3hrsmon(WebElement oT3hrsmon) {
		OT3hrsmon = oT3hrsmon;
	}
	public void setOTded3mon(WebElement oTded3mon) {
		OTded3mon = oTded3mon;
	}
	public void setDin1outmon(WebElement din1outmon) {
		Din1outmon = din1outmon;
	}
	public void setDin1inmon(WebElement din1inmon) {
		Din1inmon = din1inmon;
	}
	public void setDin2outmon(WebElement din2outmon) {
		Din2outmon = din2outmon;
	}
	public void setDin2inmon(WebElement din2inmon) {
		Din2inmon = din2inmon;
	}
	public void setDin3outmon(WebElement din3outmon) {
		Din3outmon = din3outmon;
	}
	public void setDin3inmon(WebElement din3inmon) {
		Din3inmon = din3inmon;
	}
	public void setChkshowoffmon(WebElement chkshowoffmon) {
		this.chkshowoffmon = chkshowoffmon;
	}
	public void setTimeintue(WebElement timeintue) {
		this.timeintue = timeintue;
	}
	public void setTimeouttue(WebElement timeouttue) {
		this.timeouttue = timeouttue;
	}
	public void setDaychangetue(WebElement daychangetue) {
		this.daychangetue = daychangetue;
	}
	public void setLunchouttue(WebElement lunchouttue) {
		this.lunchouttue = lunchouttue;
	}
	public void setLunchintue(WebElement lunchintue) {
		this.lunchintue = lunchintue;
	}
	public void setChkrestdaytue(WebElement chkrestdaytue) {
		this.chkrestdaytue = chkrestdaytue;
	}
	public void setDdotratetue(WebElement ddotratetue) {
		this.ddotratetue = ddotratetue;
	}
	public void setChkExtratue(WebElement chkExtratue) {
		this.chkExtratue = chkExtratue;
	}
	public void setDdextraratetue(WebElement ddextraratetue) {
		this.ddextraratetue = ddextraratetue;
	}
	public void setMaxhrtue(WebElement maxhrtue) {
		this.maxhrtue = maxhrtue;
	}
	public void setChklunchlatetue(WebElement chklunchlatetue) {
		this.chklunchlatetue = chklunchlatetue;
	}
	public void setDilatetue(WebElement dilatetue) {
		Dilatetue = dilatetue;
	}
	public void setDilate2tue(WebElement dilate2tue) {
		Dilate2tue = dilate2tue;
	}
	public void setDdph2tue(WebElement ddph2tue) {
		this.ddph2tue = ddph2tue;
	}
	public void setPhmaxtue(WebElement phmaxtue) {
		this.phmaxtue = phmaxtue;
	}
	public void setPhexttue(WebElement phexttue) {
		this.phexttue = phexttue;
	}
	public void setOT1hrstue(WebElement oT1hrstue) {
		OT1hrstue = oT1hrstue;
	}
	public void setOT1dedtue(WebElement oT1dedtue) {
		OT1dedtue = oT1dedtue;
	}
	public void setOT2hrstue(WebElement oT2hrstue) {
		OT2hrstue = oT2hrstue;
	}
	public void setOT2dedtue(WebElement oT2dedtue) {
		OT2dedtue = oT2dedtue;
	}
	public void setOT3hrstue(WebElement oT3hrstue) {
		OT3hrstue = oT3hrstue;
	}
	public void setOT3destue(WebElement oT3destue) {
		OT3destue = oT3destue;
	}
	public void setDin1outtue(WebElement din1outtue) {
		Din1outtue = din1outtue;
	}
	public void setDin1intue(WebElement din1intue) {
		Din1intue = din1intue;
	}
	public void setDin2outtue(WebElement din2outtue) {
		Din2outtue = din2outtue;
	}
	public void setDin2intue(WebElement din2intue) {
		Din2intue = din2intue;
	}
	public void setDin3outtue(WebElement din3outtue) {
		Din3outtue = din3outtue;
	}
	public void setDdin3intue(WebElement ddin3intue) {
		Ddin3intue = ddin3intue;
	}
	public void setChkshowofftue(WebElement chkshowofftue) {
		this.chkshowofftue = chkshowofftue;
	}
	public void setTimeinwed(WebElement timeinwed) {
		this.timeinwed = timeinwed;
	}
	public void setTimeoutwed(WebElement timeoutwed) {
		this.timeoutwed = timeoutwed;
	}
	public void setDaychangewed(WebElement daychangewed) {
		this.daychangewed = daychangewed;
	}
	public void setLunchoutwed(WebElement lunchoutwed) {
		this.lunchoutwed = lunchoutwed;
	}
	public void setLunchinwed(WebElement lunchinwed) {
		this.lunchinwed = lunchinwed;
	}
	public void setChkrestdaywed(WebElement chkrestdaywed) {
		this.chkrestdaywed = chkrestdaywed;
	}
	public void setDd1OTratewed(WebElement dd1oTratewed) {
		dd1OTratewed = dd1oTratewed;
	}
	public void setChkOtextrawed(WebElement chkOtextrawed) {
		this.chkOtextrawed = chkOtextrawed;
	}
	public void setDdextraratewed(WebElement ddextraratewed) {
		this.ddextraratewed = ddextraratewed;
	}
	public void setMaxhrwed(WebElement maxhrwed) {
		this.maxhrwed = maxhrwed;
	}
	public void setLunchlatewed(WebElement lunchlatewed) {
		this.lunchlatewed = lunchlatewed;
	}
	public void setDinlate1wed(WebElement dinlate1wed) {
		this.dinlate1wed = dinlate1wed;
	}
	public void setDinlate2wed(WebElement dinlate2wed) {
		this.dinlate2wed = dinlate2wed;
	}
	public void setDdphwed(WebElement ddphwed) {
		this.ddphwed = ddphwed;
	}
	public void setPhmaxwed(WebElement phmaxwed) {
		this.phmaxwed = phmaxwed;
	}
	public void setPhextwed(WebElement phextwed) {
		this.phextwed = phextwed;
	}
	public void setOThrs1wed(WebElement oThrs1wed) {
		OThrs1wed = oThrs1wed;
	}
	public void setOTded1wed(WebElement oTded1wed) {
		OTded1wed = oTded1wed;
	}
	public void setOT2hrswed(WebElement oT2hrswed) {
		OT2hrswed = oT2hrswed;
	}
	public void setOTded2wed(WebElement oTded2wed) {
		OTded2wed = oTded2wed;
	}
	public void setOThrs3wed(WebElement oThrs3wed) {
		OThrs3wed = oThrs3wed;
	}
	public void setOTded3wed(WebElement oTded3wed) {
		OTded3wed = oTded3wed;
	}
	public void setDin1outwed(WebElement din1outwed) {
		Din1outwed = din1outwed;
	}
	public void setDin1inwed(WebElement din1inwed) {
		Din1inwed = din1inwed;
	}
	public void setDin2outwed(WebElement din2outwed) {
		Din2outwed = din2outwed;
	}
	public void setDin2inwed(WebElement din2inwed) {
		Din2inwed = din2inwed;
	}
	public void setDin3outwed(WebElement din3outwed) {
		Din3outwed = din3outwed;
	}
	public void setDin3inwed(WebElement din3inwed) {
		Din3inwed = din3inwed;
	}
	public void setChkshowoffwed(WebElement chkshowoffwed) {
		this.chkshowoffwed = chkshowoffwed;
	}
	public void setTimeinthur(WebElement timeinthur) {
		this.timeinthur = timeinthur;
	}
	public void setTimeoutthur(WebElement timeoutthur) {
		this.timeoutthur = timeoutthur;
	}
	public void setDaychangethur(WebElement daychangethur) {
		this.daychangethur = daychangethur;
	}
	public void setLunchoutthur(WebElement lunchoutthur) {
		this.lunchoutthur = lunchoutthur;
	}
	public void setLunchinthur(WebElement lunchinthur) {
		this.lunchinthur = lunchinthur;
	}
	public void setChkrestdaythur(WebElement chkrestdaythur) {
		Chkrestdaythur = chkrestdaythur;
	}
	public void setDdotratethur(WebElement ddotratethur) {
		this.ddotratethur = ddotratethur;
	}
	public void setOTextrathur(WebElement oTextrathur) {
		OTextrathur = oTextrathur;
	}
	public void setDdotextraratethur(WebElement ddotextraratethur) {
		this.ddotextraratethur = ddotextraratethur;
	}
	public void setMaxhrthur(WebElement maxhrthur) {
		this.maxhrthur = maxhrthur;
	}
	public void setChklunchkatethur(WebElement chklunchkatethur) {
		this.chklunchkatethur = chklunchkatethur;
	}
	public void setChkdinelate1thur(WebElement chkdinelate1thur) {
		this.chkdinelate1thur = chkdinelate1thur;
	}
	public void setChkdinelate2thur(WebElement chkdinelate2thur) {
		this.chkdinelate2thur = chkdinelate2thur;
	}
	public void setDdphthur(WebElement ddphthur) {
		this.ddphthur = ddphthur;
	}
	public void setPhmaxthur(WebElement phmaxthur) {
		this.phmaxthur = phmaxthur;
	}
	public void setDdphextthur(WebElement ddphextthur) {
		this.ddphextthur = ddphextthur;
	}
	public void setOT1hrsthur(WebElement oT1hrsthur) {
		OT1hrsthur = oT1hrsthur;
	}
	public void setOT1dedthur(WebElement oT1dedthur) {
		OT1dedthur = oT1dedthur;
	}
	public void setOT2hrsthur(WebElement oT2hrsthur) {
		OT2hrsthur = oT2hrsthur;
	}
	public void setOT2dedthur(WebElement oT2dedthur) {
		OT2dedthur = oT2dedthur;
	}
	public void setOT3hrsthur(WebElement oT3hrsthur) {
		OT3hrsthur = oT3hrsthur;
	}
	public void setOT3dedthur(WebElement oT3dedthur) {
		OT3dedthur = oT3dedthur;
	}
	public void setDin1outthur(WebElement din1outthur) {
		Din1outthur = din1outthur;
	}
	public void setDin1inthur(WebElement din1inthur) {
		Din1inthur = din1inthur;
	}
	public void setDin2outthur(WebElement din2outthur) {
		Din2outthur = din2outthur;
	}
	public void setDin2inthur(WebElement din2inthur) {
		Din2inthur = din2inthur;
	}
	public void setDin3outthur(WebElement din3outthur) {
		Din3outthur = din3outthur;
	}
	public void setDdin3inthur(WebElement ddin3inthur) {
		Ddin3inthur = ddin3inthur;
	}
	public void setChkshowoffthur(WebElement chkshowoffthur) {
		this.chkshowoffthur = chkshowoffthur;
	}
	public void setTimeinfri(WebElement timeinfri) {
		this.timeinfri = timeinfri;
	}
	public void setTimeoutfri(WebElement timeoutfri) {
		this.timeoutfri = timeoutfri;
	}
	public void setDaychangefri(WebElement daychangefri) {
		this.daychangefri = daychangefri;
	}
	public void setLunchoutfri(WebElement lunchoutfri) {
		this.lunchoutfri = lunchoutfri;
	}
	public void setLunchinfri(WebElement lunchinfri) {
		this.lunchinfri = lunchinfri;
	}
	public void setChkrestdayfri(WebElement chkrestdayfri) {
		Chkrestdayfri = chkrestdayfri;
	}
	public void setDdotratefri(WebElement ddotratefri) {
		this.ddotratefri = ddotratefri;
	}
	public void setOTextrafri(WebElement oTextrafri) {
		OTextrafri = oTextrafri;
	}
	public void setDdotextraratefri(WebElement ddotextraratefri) {
		this.ddotextraratefri = ddotextraratefri;
	}
	public void setMaxhrfri(WebElement maxhrfri) {
		this.maxhrfri = maxhrfri;
	}
	public void setChklunchkatefri(WebElement chklunchkatefri) {
		this.chklunchkatefri = chklunchkatefri;
	}
	public void setChkdinelate1fri(WebElement chkdinelate1fri) {
		this.chkdinelate1fri = chkdinelate1fri;
	}
	public void setChkdinelate2fri(WebElement chkdinelate2fri) {
		this.chkdinelate2fri = chkdinelate2fri;
	}
	public void setDdpfri(WebElement ddpfri) {
		this.ddpfri = ddpfri;
	}
	public void setPhmaxfri(WebElement phmaxfri) {
		this.phmaxfri = phmaxfri;
	}
	public void setDdphextfri(WebElement ddphextfri) {
		this.ddphextfri = ddphextfri;
	}
	public void setOT1hrsfri(WebElement oT1hrsfri) {
		OT1hrsfri = oT1hrsfri;
	}
	public void setOT1dedfri(WebElement oT1dedfri) {
		OT1dedfri = oT1dedfri;
	}
	public void setOT2hrsfri(WebElement oT2hrsfri) {
		OT2hrsfri = oT2hrsfri;
	}
	public void setOT2dedfri(WebElement oT2dedfri) {
		OT2dedfri = oT2dedfri;
	}
	public void setOT3hrsfri(WebElement oT3hrsfri) {
		OT3hrsfri = oT3hrsfri;
	}
	public void setOT3dedfri(WebElement oT3dedfri) {
		OT3dedfri = oT3dedfri;
	}
	public void setDin1outfri(WebElement din1outfri) {
		Din1outfri = din1outfri;
	}
	public void setDin1infri(WebElement din1infri) {
		Din1infri = din1infri;
	}
	public void setDin2outfri(WebElement din2outfri) {
		Din2outfri = din2outfri;
	}
	public void setDin2infri(WebElement din2infri) {
		Din2infri = din2infri;
	}
	public void setDin3outfri(WebElement din3outfri) {
		Din3outfri = din3outfri;
	}
	public void setDdin3infri(WebElement ddin3infri) {
		Ddin3infri = ddin3infri;
	}
	public void setChkshowofffri(WebElement chkshowofffri) {
		this.chkshowofffri = chkshowofffri;
	}
	public void setTimeinsat(WebElement timeinsat) {
		this.timeinsat = timeinsat;
	}
	public void setTimeoutsat(WebElement timeoutsat) {
		this.timeoutsat = timeoutsat;
	}
	public void setDaychangesat(WebElement daychangesat) {
		this.daychangesat = daychangesat;
	}
	public void setLunchoutsat(WebElement lunchoutsat) {
		this.lunchoutsat = lunchoutsat;
	}
	public void setLunchinsat(WebElement lunchinsat) {
		this.lunchinsat = lunchinsat;
	}
	public void setChkrestdaysat(WebElement chkrestdaysat) {
		Chkrestdaysat = chkrestdaysat;
	}
	public void setDdotratesat(WebElement ddotratesat) {
		this.ddotratesat = ddotratesat;
	}
	public void setChkOTextrasat(WebElement chkOTextrasat) {
		this.chkOTextrasat = chkOTextrasat;
	}
	public void setDdotextraratesat(WebElement ddotextraratesat) {
		this.ddotextraratesat = ddotextraratesat;
	}
	public void setMaxhrsat(WebElement maxhrsat) {
		this.maxhrsat = maxhrsat;
	}
	public void setChklunchkatesat(WebElement chklunchkatesat) {
		this.chklunchkatesat = chklunchkatesat;
	}
	public void setChkdinelate1sat(WebElement chkdinelate1sat) {
		this.chkdinelate1sat = chkdinelate1sat;
	}
	public void setChkdinelate2sat(WebElement chkdinelate2sat) {
		this.chkdinelate2sat = chkdinelate2sat;
	}
	public void setDdphsat(WebElement ddphsat) {
		this.ddphsat = ddphsat;
	}
	public void setPhmaxsat(WebElement phmaxsat) {
		this.phmaxsat = phmaxsat;
	}
	public void setDdphextsat(WebElement ddphextsat) {
		this.ddphextsat = ddphextsat;
	}
	public void setOT1hrssat(WebElement oT1hrssat) {
		OT1hrssat = oT1hrssat;
	}
	public void setOT1dedsat(WebElement oT1dedsat) {
		OT1dedsat = oT1dedsat;
	}
	public void setOT2hrssat(WebElement oT2hrssat) {
		OT2hrssat = oT2hrssat;
	}
	public void setOT2dedsat(WebElement oT2dedsat) {
		OT2dedsat = oT2dedsat;
	}
	public void setOT3hrssat(WebElement oT3hrssat) {
		OT3hrssat = oT3hrssat;
	}
	public void setOT3dedsat(WebElement oT3dedsat) {
		OT3dedsat = oT3dedsat;
	}
	public void setDin1outsat(WebElement din1outsat) {
		Din1outsat = din1outsat;
	}
	public void setDin1insat(WebElement din1insat) {
		Din1insat = din1insat;
	}
	public void setDin2outsat(WebElement din2outsat) {
		Din2outsat = din2outsat;
	}
	public void setDin2insat(WebElement din2insat) {
		Din2insat = din2insat;
	}
	public void setDin3outsat(WebElement din3outsat) {
		Din3outsat = din3outsat;
	}
	public void setDdin3insat(WebElement ddin3insat) {
		Ddin3insat = ddin3insat;
	}
	public void setChkshowoffsat(WebElement chkshowoffsat) {
		this.chkshowoffsat = chkshowoffsat;
	}
	public void setRightslideTable(WebElement rightslideTable) {
		RightslideTable = rightslideTable;
	}


	
}
