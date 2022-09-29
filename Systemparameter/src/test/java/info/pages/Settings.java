package info.pages;

import java.awt.AWTException;
import info.POJO.Staffallowancepojo;
import info.POJO.UpIpojo;
import info.POJO.settingsSPpojo;
import info.base.Reusableclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Settings extends Reusableclass {

	public static settingsSPpojo sp;
	public static Staffallowancepojo st;
	public static UpIpojo u;

	@Given("Go to Utility System parameter and settings Tab")
	public void go_to_utility_system_parameter_and_settings_tab() {

		sp = new settingsSPpojo();
		toClick(sp.Utility);
		tomovethecursor(sp.systemparameter);
		toClick(sp.systemparameter);

	}

	@When("Check all check boxes in Settings Tab")
	public void check_all_check_boxes_in_settings_tab() throws InterruptedException, AWTException {

		sp = new settingsSPpojo();

		Thread.sleep(500);
		toClick(sp.ResEmp);
		Thread.sleep(1000);
		actionssendkeysdelete(sp.ResDate);
		tofill(sp.ResDate, "21022022");	
		toenter();
		
		Thread.sleep(1000);
		toClick(sp.Empcodeauto);
		Thread.sleep(1000);
		tofill(sp.Fixedcode, "abc");
		Thread.sleep(1000);
		tofill(sp.Numbercode, "1234");
		Thread.sleep(500);
		ScrolldownElement(sp.savebutton);
		toClick(sp.savebutton);
		Thread.sleep(2000);

	}

	@When("Check allowance check box and rename and changes are done in Staffallowance section")
	public void check_allowance_check_box_and_rename_and_changes_are_done_in_staffallowance_section()
			throws InterruptedException {

		st = new Staffallowancepojo();
		sp = new settingsSPpojo();
		
		actionssendkeysdelete(sp.otherbox1);
		tofill(sp.otherbox1, "Allowance1");
		actionssendkeysdelete(sp.otherbox2);
		tofill(sp.otherbox2, "Allowance2");
		ScrolldownElement(sp.savebutton);
		toClick(sp.savebutton);

		tomovethecursor(st.AllowanceSettings);
		implicitwait();
		tomovethecursor(st.staffallowance);
		toClick(st.staffallowance);
		Thread.sleep(1000);
		toClick(st.editicon);
		System.out.println("Changes are done in Staffallowance tab");
		Thread.sleep(2000);

	}

	@When("Check extra classification check box and Changes are done in basic master setup option extraclassfication")
	public void check_extra_classification_check_box_and_changes_are_done_in_basic_master_setup_option_extraclassfication() throws InterruptedException {

		sp = new settingsSPpojo();
		tomovethecursor(sp.Utility);
		toClick(sp.Utility);
		Thread.sleep(1000);
		toClick(sp.systemparameter);
		
		actionssendkeysdelete(sp.designationbox);
		tofill(sp.designationbox, "Other Classification");
		Thread.sleep(1500);
		ScrolldownElement(sp.savebutton);
		toClick(sp.savebutton);

		tomovethecursor(sp.Master);
		toClick(sp.Master);
		tomovethecursor(sp.BasicMaster);
		System.out.println("The value is changed into other classfication");
		Thread.sleep(2000);

	}

	@When("click fix NRM and check in update by individual section")
	public void click_fix_nrm_and_check_in_update_by_individual_section() throws InterruptedException {

		sp = new settingsSPpojo();
		u = new UpIpojo();

		toClick(sp.Utility);
		tomovethecursor(sp.systemparameter);
		toClick(sp.systemparameter);
		
		ScrolldownElement(sp.FixNRMcheckbox);
		toClick(sp.FixNRMcheckbox);
		Thread.sleep(1000);
		ScrolldownElement(sp.savebutton);
		toClick(sp.savebutton);

		tomovethecursor(u.Transcaction);
		toClick(u.Transcaction);
		Thread.sleep(1000);
		toClick(u.upindi);
		System.out.println("The NRM is changed to Fix NRM");

	}

	@When("click show upto 8clocks and check in update by individual section")
	public void click_show_upto_8clocks_and_check_in_update_by_individual_section() throws InterruptedException {

		sp = new settingsSPpojo();
		u = new UpIpojo();
		
		toClick(sp.Utility);
		tomovethecursor(sp.systemparameter);
		toClick(sp.systemparameter);

		ScrolldownElement(sp.showclock8);
		toClick(sp.showclock8);
		Thread.sleep(1000);
		ScrolldownElement(sp.savebutton);
		toClick(sp.savebutton);

		tomovethecursor(u.Transcaction);
		toClick(u.Transcaction);
		Thread.sleep(1000);
		toClick(u.upindi);
		System.out.println("The 4clock is changed to Fix 8clock");
		Thread.sleep(2000);
		
		toClick(sp.Utility);
		tomovethecursor(sp.systemparameter);
		toClick(sp.systemparameter);
		
		ScrolldownElement(sp.FixNRMcheckbox);
		toClick(sp.FixNRMcheckbox);
		toClick(sp.showclock8);
		Thread.sleep(1000);
		ScrolldownElement(sp.savebutton);
		toClick(sp.savebutton);

	}

}
