package info.stepdefinition;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import info.base.Reusableclass;
import info.pojo.Purchase_order_POJO;
import info.pojo.Tax_Rate_POJO;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Tax_Rate extends Reusableclass {
	public static Tax_Rate_POJO t;
	public static Purchase_order_POJO w;
	@Before("@LoginFunction")
	public void Login() throws IOException, InterruptedException, InvalidFormatException {
		w = new Purchase_order_POJO();
		t=new Tax_Rate_POJO();
		browserLaunch();
		toMaximize();
		launchUrl("https://staging.infotech-accounting.com/login");
		ngWebDriver.waitForAngularRequestsToFinish();
		Thread.sleep(3000);
		w = new Purchase_order_POJO();
		toClick(w.username);
		tofill(w.username, "accounting@the23app.com");
		toClick(w.password);
		Thread.sleep(2000);
		tofill(w.password, "Test@123");
		Thread.sleep(2000);
		toClick(w.submit);
		Thread.sleep(3000);
	}
	@Given("User need to Login & navigate to tax rates section")
	public void user_need_to_login_navigate_to_tax_rates_section() throws InterruptedException, AWTException {
		t=new Tax_Rate_POJO();
		w = new Purchase_order_POJO();

		toClick(t.Organizationslide);
		toClick(t.Taxrateslide);
		Thread.sleep(2000);
		clickjavascript(t.Newtaxratebtn);


	}

	@And	("User need to create a tax rate")
	public void user_need_to_create_a_tax_rate() throws InterruptedException, AWTException {
		t=new Tax_Rate_POJO();
		w = new Purchase_order_POJO();

		Thread.sleep(2000);
		tofill(t.TaxRateDisplayName, "jdajdkhdsksd");
		tofill(t.TaxCode, "8988898877");
		Thread.sleep(2000);
		tofill(t.BoxNumberDD, "1, 6 - Standard-Rated Supplies");
		toenter();
		toClick(t.PurchaseTaxChkbox);
		toClick(t.SalesTaxChkbox);
		tofill(t.Componentname, "diamond");
		actionssendkeysdelete(t.Componentpercentage);
		tofill(t.Componentpercentage, "18");

		toClick(t.Addcomponentbtn);
		toClick(t.compoundradiobtn);
		Thread.sleep(2000);
		ScrolldownElement(t.Removecomponentxbtn);
		Thread.sleep(2000);
		toClick(t.Removecomponentxbtn);
		toClick(t.Yesremovebtn);
		Thread.sleep(3000);
		toClick(t.Savebtn);
	}


	@Then("User need to edit the tax rate")
	public void user_need_to_edit_the_tax_rate() throws InterruptedException {
		t=new Tax_Rate_POJO();
		w = new Purchase_order_POJO();
		tofill(t.Searchboxtax, "jdajdkhdsksd");
		toClick(t.Edittax);
		toClick(t.Componentname);
		tofill(t.Componentname, "component");
		Thread.sleep(2000);
		toClick(t.Savebtn);
	}


	@Then("User need to Delete the tax rate")
	public void user_need_to_delete_the_tax_rate() throws InterruptedException, AWTException {
		t=new Tax_Rate_POJO();
		w = new Purchase_order_POJO();
		Thread.sleep(5000);
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		clickjavascript(t.Checkboxtax);
		Thread.sleep(2000);
		toClick(t.Deletebtn);
		Thread.sleep(2000);
		toenter();
		
		driver.quit();

	}
}
