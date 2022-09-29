package info.pom;


import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import info.base.Reusableclass;

public class UserCreation_MAL_POJO extends Reusableclass {
	public UserCreation_MAL_POJO() throws IOException {
		PageFactory.initElements(driver, this);
		
	}


	@FindBy(id ="txtLogin")
	public WebElement Username;

	@FindBy(id = "txtPassword")
	public WebElement password;

	@FindBy(id = "btnLogin")
	public WebElement click;

	@FindBy(xpath = "//i[contains(@class,'icon-users')]")
	public WebElement ChangeDB;

	@FindBy(id = "//input[@id='txtCustomerSearch']")
	public WebElement DBname;

	////a[@href='https://staging.info-tech.com.my/ETMS/ETMSDashboard.aspx?id=34263']
	@FindBy(xpath = "(//a[@class='dropdown-item ui-tx-14 ui-fw-500 text-uppercase py-2'])[7]")
	public WebElement DBnameselect;

	@FindBy(id = "txtCustomerSearch")
	public WebElement DBnameenter;

	@FindBy(xpath = "//*[@id=\"tblCustomerList\"]/tbody/tr[1]/td/li/a")
	public WebElement DBnameselectteja;

	@FindBy(xpath = "//main//div//tr//td[@class='ng-binding']")
	public WebElement ClickEmail;

	@FindBy(xpath = "//i[@class='fa fa-power-off ui-tx-white']")
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

	@FindBy(id="inbox_field")
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

	@FindBy(xpath = "//a[contains(.,'Administration')]")
	public WebElement Administrator;

	@FindBy(xpath = "//a[@menu-caption='User Creation']")
	public WebElement UserCreation;

	@FindBy(xpath = "//a[contains(.,'+ New')]")
	public WebElement NewUser;

	@FindBy(xpath="//input[contains(@id,'txtDisplayName')]")
	public WebElement Displayname;

	@FindBy(id = "chkIsMobNoLoginEnabled")
	public WebElement allowloginusingcheckbox;

	@FindBy(xpath="//input[contains(@id,'txtEmail')]")
	public WebElement primaryemail;

	@FindBy(xpath = "//select[@id='ddlMobISO']")
	public WebElement mobilearea;

	@FindBy(xpath="//input[@id='txtMobileNo']")
	public WebElement mobilenumber;

	@FindBy(xpath = "//label[contains(.,'Show Basic Salary')]")
	public WebElement showbasicsalary;

	@FindBy(xpath = "//label[contains(.,'Allow to Lock Attendance Detail')]")
	public WebElement allowlockattendencedetails;

	@FindBy(xpath = "//label[contains(.,'Allow to UnLock Attendance Detail')]")
	public WebElement allowunlockattendencedetails;

	@FindBy(xpath = "(//span[contains(.,'App Access')])[4]")
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

	@FindBy(xpath = "//input[contains(@name,'CompanyRights$gvCompany$ctl01$chkAll')]")
	public WebElement Selectcompany;

	@FindBy(id = "ContentPlaceHolder1_btnSave")
	public WebElement CompanyAccessSave;

	@FindBy(id = "ContentPlaceHolder1_btnCancel")
	public WebElement CompanyAccessCancel;

	@FindBy(id = "__tab_ContentPlaceHolder1_TabContainer1_TabPanel_UserRights")
	public WebElement DepartmentAccess;

	@FindBy(xpath = "//label[contains(@for,'chkETMSIsSuperAdmin')]")
	public WebElement ETmsSuperadmin;

	@FindBy(xpath = "//label[contains(@for,'chkELEAVEIsSuperAdmin')]")
	public WebElement ELeaveSuperadmin;

	@FindBy(xpath = "//label[contains(@for,'chkEPAYROLLIsSuperAdmin')]")
	public WebElement EPayrollSuperadmin;

	@FindBy(xpath = "//label[contains(@for,'chkMOBILEATTENDANCEIsSuperAdmin')]")
	public WebElement EAttendenceSuperadmin;

	@FindBy(xpath = "//label[contains(@for,'chkECLAIMIsSuperAdmin')]")
	public WebElement EClaimSuperadmin;

	@FindBy(xpath = "//label[contains(@for,'chkEAPPRAISALIsSuperAdmin')]")
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
	
	@FindBy(xpath = "(//label[contains(.,'Is Approver?')])[1]")
	public WebElement ETMSISAPPROVERCHKBOX;
	
	@FindBy(xpath = "//label[contains(@for,'chkELEAVEIsApprover')]")
	public WebElement ELEAVEISAPPROVERCHKBOX;
	
	@FindBy(xpath = "//label[contains(@for,'chkECLAIMIsApprover')]")
	public WebElement ECLAIMISAPPROVERCHKBOX;
	
	@FindBy(xpath = "//label[contains(@for,'chkEPAYROLLIsApprover')]")
	public WebElement EPAYROLLISAPPROVERCHKBOX;	
	
	@FindBy(xpath = "//label[contains(@for,'chkMOBILEATTENDANCEIsApprover')]")
	public WebElement EMOBILEISAPPROVERCHKBOX;	
	
	@FindBy(xpath = "//label[contains(@for,'chkEAPPRAISALIsApprover')]")
	public WebElement EAPPRAISALISAPPROVERCHKBOX;	
	
	@FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_imgProgress\"]")
	public List<WebElement> LoadingIcon;	
	
	
	


	public WebElement getETMSISAPPROVERCHKBOX() {
		return ETMSISAPPROVERCHKBOX;
	}

	public void setETMSISAPPROVERCHKBOX(WebElement eTMSISAPPROVERCHKBOX) {
		ETMSISAPPROVERCHKBOX = eTMSISAPPROVERCHKBOX;
	}

	public WebElement getELEAVEISAPPROVERCHKBOX() {
		return ELEAVEISAPPROVERCHKBOX;
	}

	public void setELEAVEISAPPROVERCHKBOX(WebElement eLEAVEISAPPROVERCHKBOX) {
		ELEAVEISAPPROVERCHKBOX = eLEAVEISAPPROVERCHKBOX;
	}

	public WebElement getECLAIMISAPPROVERCHKBOX() {
		return ECLAIMISAPPROVERCHKBOX;
	}

	public void setECLAIMISAPPROVERCHKBOX(WebElement eCLAIMISAPPROVERCHKBOX) {
		ECLAIMISAPPROVERCHKBOX = eCLAIMISAPPROVERCHKBOX;
	}

	public WebElement getEPAYROLLISAPPROVERCHKBOX() {
		return EPAYROLLISAPPROVERCHKBOX;
	}

	public void setEPAYROLLISAPPROVERCHKBOX(WebElement ePAYROLLISAPPROVERCHKBOX) {
		EPAYROLLISAPPROVERCHKBOX = ePAYROLLISAPPROVERCHKBOX;
	}

	public WebElement getEMOBILEISAPPROVERCHKBOX() {
		return EMOBILEISAPPROVERCHKBOX;
	}

	public void setEMOBILEISAPPROVERCHKBOX(WebElement eMOBILEISAPPROVERCHKBOX) {
		EMOBILEISAPPROVERCHKBOX = eMOBILEISAPPROVERCHKBOX;
	}

	public WebElement getEAPPRAISALISAPPROVERCHKBOX() {
		return EAPPRAISALISAPPROVERCHKBOX;
	}

	public void setEAPPRAISALISAPPROVERCHKBOX(WebElement eAPPRAISALISAPPROVERCHKBOX) {
		EAPPRAISALISAPPROVERCHKBOX = eAPPRAISALISAPPROVERCHKBOX;
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
		return ChangeDB;
	}

	public void setChangeDB(WebElement changeDB) {
		ChangeDB = changeDB;
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

	public WebElement getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(WebElement mobilenumber) {
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

}
