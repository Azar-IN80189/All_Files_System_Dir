package info.pages;

import info.POJO.Readerpojo;
import info.POJO.settingsSPpojo;
import info.base.Reusableclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Readersettings extends Reusableclass {

	public static settingsSPpojo sp;
	public static Readerpojo r;

	@Given("Enter into utility systemparameter and Reader settings")
	public void enter_into_utility_systemparameter_and_reader_settings() {

		sp = new settingsSPpojo();
		r = new Readerpojo();

		toClick(sp.Utility);
		tomovethecursor(sp.systemparameter);
		toClick(sp.systemparameter);
		toClick(r.Reader);

	}

	@When("create new reader in reader settings")
	public void create_new_reader_in_reader_settings() throws InterruptedException {

		r = new Readerpojo();

		toClick(r.New);
		Thread.sleep(1500);
		toClick(r.Readerid);
		Thread.sleep(3000);
		tofill(r.Readerid, "INFO12");
		actionssendkeysdelete(r.Readername);
		tofill(r.Readername, "INFOTECH");
		Thread.sleep(1000);
		toClick(r.Add);
		Thread.sleep(1500);
		System.out.println("New Reader is Added successfully");

	}
	
	@Given("cancel the reader")
	public void cancel_the_reader() throws InterruptedException {
		
		r = new Readerpojo();

		toClick(r.New);
		Thread.sleep(1500);
		toClick(r.Readerid);
		Thread.sleep(3000);
		tofill(r.Readerid, "INFO12");
		actionssendkeysdelete(r.Readername);
		tofill(r.Readername, "INFOTECH");
		Thread.sleep(1000);
		Explicitwait(r.cancel);
		toClick(r.cancel);
		System.out.println("Cancelled successfully");
		
	}

	@Given("Edit the Reader")
	public void edit_the_reader() throws InterruptedException {
		
		r = new Readerpojo();

		toClick(r.edit);
		Thread.sleep(1000);
		clickjavascript(r.Readername);
		Thread.sleep(1000);
		actionssendkeysdelete(r.Readername);
		tofill(r.Readername, "INFOTECHIndia");
		toClick(r.update);
		Thread.sleep(2000);
		System.out.println("New Reader is Edit and updated successfully");
		
	}

	@Given("Delete the Reader")
	public void delete_the_reader() throws InterruptedException {
		
		r = new Readerpojo();
		
		Thread.sleep(1000);
		toClick(r.delete);
	
		Thread.sleep(1000);
		toAcceptAlert();
		System.out.println("Reader is deleted successfully");
		
	}

}
