package info.pages;

import java.awt.AWTException;
import info.POJO.Attendancepojo;
import info.POJO.UpIpojo;
import info.POJO.settingsSPpojo;
import info.base.Reusableclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Attendanceprocess extends Reusableclass{
	
	public static settingsSPpojo sp;
	public static Attendancepojo a;
	public static UpIpojo u;
	
	@Given("Go to utility and syetem parameter settings Attendance process settings")
	public void go_to_utility_and_syetem_parameter_settings_attendance_process_settings() throws InterruptedException {
		
		sp = new settingsSPpojo();
		a = new Attendancepojo();
		
		toClick(sp.Utility);
		tomovethecursor(sp.systemparameter);
		toClick(sp.systemparameter);
		Thread.sleep(1000);
		toClick(a.Attpro);
	}

	@When("Click check box in attendance process settings and click process attendance")
	public void click_check_box_in_attendance_process_settings_and_click_process_attendance() throws InterruptedException {
		
		a = new Attendancepojo();
		
		toClick(a.checkmbl);
		Thread.sleep(3000);
		toClick(a.processatt);
		Thread.sleep(2000);
		ScrolldownElement(a.savebutton);
		toClick(a.savebutton);
		Thread.sleep(2000);
	}
	
	@When("Check Attendance process settings for Temperature Reader")
	public void check_attendance_process_settings_for_temperature_reader() throws InterruptedException {
		
		a = new Attendancepojo();
		
		toClick(a.temp);
		Thread.sleep(1000);
		actionssendkeysdelete(a.temperature);
		Thread.sleep(1000);
		tofill(a.temperature, "97.0");
		Thread.sleep(1000);
		toClick(a.tempwithmask);
		ScrolldownElement(a.savebutton);
		toClick(a.savebutton);
		toClick(a.bellicon);
		Thread.sleep(30000);
		toClick(a.bellicon);
		
	}

	@When("check in update by individual section in and out are updated")
	public void check_in_update_by_individual_section_in_and_out_are_updated() throws InterruptedException, AWTException {
		
		u =  new UpIpojo();
		
		tomovethecursor(u.Transcaction);
		toClick(u.Transcaction);
		toClick(u.upindi);
		Thread.sleep(1000);
		Explicitwait(u.input1);
		tomovethecursor(u.input1);
		Thread.sleep(1000);
		tofill(u.input1, "KARTHIKA");
		Thread.sleep(500);
		toenter();
		
		tomovethecursor(u.dateFromup);
		actionssendkeysdelete(u.dateFromup);
		Thread.sleep(500);
		tofill(u.dateFromup, "03-02-2022");
		toenter();
		
		tomovethecursor(u.dateToup);
		actionssendkeysdelete(u.dateToup);
		Thread.sleep(1000);
		tofill(u.dateToup, "03-02-2022");
		toenter();
		Thread.sleep(500);
		clickjavascript(u.searchbutton);
		
		torefresh();
		
		tofill(u.input1, "KARTHIKA");
		Thread.sleep(500);
		toenter();
		
		tomovethecursor(u.dateFromup);
		actionssendkeysdelete(u.dateFromup);
		Thread.sleep(500);
		tofill(u.dateFromup, "03-02-2022");
		toenter();
		
		tomovethecursor(u.dateToup);
		actionssendkeysdelete(u.dateToup);
		Thread.sleep(1000);
		tofill(u.dateToup, "03-02-2022");
		toenter();
		Thread.sleep(500);
		clickjavascript(u.searchbutton);
		
	}  
	
}
