package info.stepdefinition;



import java.awt.AWTException;

import info.base.Reusableclass;
import info.pojo.Forgot_Password_POJO;
import info.pojo.Inventory_Items_POJO;
import info.pojo.Purchase_order_POJO;
import info.pojo.UserCreation_POJO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Inventory_Items extends Reusableclass {
	public static Purchase_order_POJO w;
	public static UserCreation_POJO u;
	public static Forgot_Password_POJO f;
	public static Inventory_Items_POJO i;
	@Given("User need to navigate to Item slide")
	public void user_need_to_navigate_to_item_slide() throws AWTException {
		i=new Inventory_Items_POJO();
		toClick(i.Inventoryslide);
		toClick(i.Itemslide);



	}

	@And("User need to Add an item")
	public void user_need_to_add_an_item() throws AWTException, InterruptedException {
		i=new Inventory_Items_POJO();

		Explicitwait(i.Additembtn);

		toClick(i.Additembtn);

		Explicitwait(i.Itemcodesku);

		tofill(i.Itemcodesku, "4565346544222");

		tofill(i.Itemname, "Fsde");

		tofill(i.TestDD, "name");

		toenter();

		tocheckselected(i.Ipurchasechkbox);

		tocheckselected(i.Isellchkbox);

		tofill(i.costpricetxtbox, "120");

		ScrolldownElement(i.Savebtn);

		clickjavascript(i.Savebtn);

		for(String winHandle : driver.getWindowHandles()){
			driver.switchTo().window(winHandle);

			tofill(i.Searchitems, "4565346544222");

			Thread.sleep(3000);

			clickjavascript(i.CheckallboxItems);

			toClick(i.Deletebtn);

			toenter();
		}


	}

	@And("User need to Manage an item")
	public void user_need_to_manage_an_item() throws InterruptedException {
		i=new Inventory_Items_POJO();
		for(String winHandle : driver.getWindowHandles()){
			Explicitwait(i.ManageCategorybtn);
			clickjavascript(i.ManageCategorybtn);
			Thread.sleep(2000);
			tofill(i.Categorynametxtbox, "wdhjdbdbdb");
			clickjavascript(i.AddcategoryBtn);
			toClick(i.Cancelbtn);
			actionssendkeysdelete(i.Searchitems);
		}
	}

	@Then("User need to Manage a unit type")
	public void user_need_to_manage_a_unit_type() throws InterruptedException, AWTException {
		i=new Inventory_Items_POJO();

		Thread.sleep(4000);
		Explicitwait(i.ManageUnitType);
		clickjavascript(i.ManageUnitType);
		Thread.sleep(2000);
		tofill(i.UnitTypename, "wdhjdbdbdb");
		clickjavascript(i.Activechkbox);
		clickjavascript(i.Defaultchkbox);
		Thread.sleep(1000);
		clickjavascript(i.SavebtnManageunittype);
		Thread.sleep(3000);
		totabkey();
		totabkey();
		totabkey();
		toenter();
		Thread.sleep(2000);
		clickjavascript(i.Searchitems);
		actionssendkeysdelete(i.Searchitems);

	}



	@Then("User need to verify the headers")
	public void user_need_to_verify_the_headers() throws InterruptedException {
		i=new Inventory_Items_POJO();
		for(String winHandle : driver.getWindowHandles()){
			ScrollupElement(i.AllTabheader);
			toClick(i.AllTabheader);
			clickjavascript(i.SalesTab);
			clickjavascript(i.PurchasesTab);
			Thread.sleep(3000);
			clickjavascript(i.Inactivetab);
			driver.quit();
		}
	}


















}
