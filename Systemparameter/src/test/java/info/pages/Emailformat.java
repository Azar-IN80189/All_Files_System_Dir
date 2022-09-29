package info.pages;

import info.POJO.Emailformatpojo;
import info.POJO.settingsSPpojo;
import info.base.Reusableclass;
import io.cucumber.java.en.Given;

public class Emailformat extends Reusableclass {
	
	public static Emailformatpojo e;
	public static settingsSPpojo sp;

	@Given("Selectall information and save in email format")
	public void selectall_information_and_save_in_email_format() throws InterruptedException {
		
		e = new Emailformatpojo();
		sp = new settingsSPpojo();
		
		toClick(sp.Utility);
		tomovethecursor(sp.systemparameter);
		toClick(sp.systemparameter);
		Thread.sleep(1000);
		
		toClick(e.Email);
		toClick(e.all);
		ScrolldownElement(e.savebutton);
		toClick(e.savebutton);
		ScrollupElement(sp.Utility);
		Thread.sleep(1000);
		
	}
	
	@Given("Select necessory information and save in email format")
	public void select_necessory_information_and_save_in_email_format() throws InterruptedException {
		
		e = new Emailformatpojo();
		
		tomovethecursor(e.all);
		Thread.sleep(1000);
		toClick(e.all);
		Thread.sleep(1000);
		toClick(e.Empcode);
		toClick(e.Empname);
		toClick(e.designation);
		toClick(e.dept);
		toClick(e.Late);
		toClick(e.comment);
		toClick(e.shift);
		toClick(e.Reason);
		Thread.sleep(1000);
		ScrolldownElement(e.savebutton);
		Thread.sleep(1000);
		toClick(e.savebutton);
		ScrollupElement(sp.Utility);
		Thread.sleep(2000);
		
	}
	
	@Given("Selectall information in supervisor and save in email format")
	public void selectall_information_in_supervisor_and_save_in_email_format() throws InterruptedException {
		
		e = new Emailformatpojo();
		tomovethecursor(e.allsv);
		toClick(e.allsv);
		ScrolldownElement(e.savebutton);
		Thread.sleep(1000);
		toClick(e.savebutton);
		ScrollupElement(sp.Utility);
		Thread.sleep(2000);
		
	}
	
	@Given("Select necessory information in supervisor and save in email format")
	public void select_necessory_information_in_supervisor_and_save_in_email_format() throws InterruptedException {
		
		e = new Emailformatpojo();
		
		tomovethecursor(e.allsv);
		Thread.sleep(1000);
		toClick(e.allsv);
		Thread.sleep(1000);
		toClick(e.Empcodesv);
		toClick(e.Empnamesv);
		toClick(e.designationsv);
		toClick(e.deptsv);
		toClick(e.Latesv);
		toClick(e.commentsv);
		Thread.sleep(1000);
		toClick(e.shiftsv);
		toClick(e.Reasonsv);
		Thread.sleep(1000);
		ScrolldownElement(e.savebutton);
		Thread.sleep(1000);
		toClick(e.savebutton);
		ScrollupElement(sp.Utility);
		Thread.sleep(2000);
		
	}
	
}
