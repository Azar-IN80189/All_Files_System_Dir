package info.stepdefinition;

import java.awt.AWTException;

import info.base.Reusableclass;
import info.pojo.Purchase_order_POJO;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Purchase_Order extends Reusableclass{

	public static Purchase_order_POJO a;
	@Given("User need to enter in to purchase order homepage")
	public void user_need_to_enter_in_to_purchase_order_homepage() throws InterruptedException {
		browserLaunch();
		launchUrl("https://staging.infotech-accounting.com/login");
		ngWebDriver.waitForAngularRequestsToFinish();
		toMaximize();
		a = new Purchase_order_POJO();
		Thread.sleep(3000);
		toClick(a.username);
		tofill(a.username, "accounting@the23app.com");
		toClick(a.password);
		tofill(a.password, "Test@123");
		toClick(a.submit);
	}



	@Given("User need to create new purchase order")
	public void user_need_to_create_new_purchase_order() throws InterruptedException, AWTException {
		a = new Purchase_order_POJO();
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		
		implicitwait();
		toClick(a.PurchaseMenu);
		toClick(a.PurchaseOrder);
		Thread.sleep(5000);
		clickjavascript(a.Newpurchaseorder);
		Thread.sleep(5000);
		toClick(a.Suppliername);
		tofill(a.Suppliername, "dfgdfgdrree");
		toenter();
		//toClick(a.Savenewcontent);
		totabkey();


		tofill(a.Date, "11/09/2022");
		toenter();
		totabkey();



		Thread.sleep(3000);


		tofill(a.DeliveryDate, "12/09/2022");
		toenter();
		totabkey();

		Thread.sleep(5000);
		toClick(a.Currencydropdown);
		tofill(a.Currencydropdown, "AED - United Arab Emirates Dirham");
		toenter();
		Thread.sleep(5000);
		totabkey();


		clickjavascript(a.Amountaredropdown);
		tofill(a.Amountaredropdown,"Tax Exclusive");
		toenter();
		Thread.sleep(5000);
		totabkey();
		
		Thread.sleep(2000);

		clickjavascript(a.ThemeDropdown);
		tofill(a.ThemeDropdown,"Standard Template");
		toenter();
		
		//totabkey();

		/*explicitWaitClick(a.Salespersontxtbox);
		tofill(a.Salespersontxtbox, "Test1");
		toenter();
		Thread.sleep(5000);
		explicitWaitClick(a.PriorityDropdown);
		tofill(a.PriorityDropdown, "Low");
		toenter();
		Thread.sleep(5000);
		explicitWaitClick(a.Testtxtbox);
		tofill(a.Testtxtbox, "Tester1");
		toenter();
		Thread.sleep(5000);*/


		
		Thread.sleep(3000);
		toClick(a.Listitem1);
		Thread.sleep(2000);
		//todoubleclick(a.Listitem1);
		tofill(a.Listitem1, "mars");
		Thread.sleep(1000);
		toenter();

		
		
		Thread.sleep(3000);
		toClick(a.Listitem2);
		Thread.sleep(2000);
		//todoubleclick(a.Listitem2);
		tofill(a.Listitem2, "mars");
		Thread.sleep(1000);
		toenter();

		ScrolldownElement(a.addnewlinesbtn);
		Thread.sleep(1000);
		clickjavascript(a.addnewlinesbtn);

		ScrollupElement(a.addnewlinesbtn);
		clickjavascript(a.Deleterow3);
		Thread.sleep(1000);
		ScrolldownElement(a.Deliveryinstxtbox);
		tofill(a.Deliveryinstxtbox, "testtext");
		Thread.sleep(1000);
		mouseOver(a.Approvebtnclick);
		clickjavascript(a.Approvebtnclick);

	}


		
	}

	@Then("User need to approve and save")
	public void user_need_to_approve_and_save() {


	}








}
