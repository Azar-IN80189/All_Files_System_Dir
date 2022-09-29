package info.stepdefinition;

import java.awt.AWTException;

import info.base.Reusableclass;
import info.pojo.Inventory_PriceList_POJO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Inventory_PriceList extends Reusableclass{

	public static Inventory_PriceList_POJO n;

	@Given("User need to navigate to Pricelist slide")
	public void user_need_to_navigate_to_pricelist_slide() {
		n=new Inventory_PriceList_POJO();
		toClick(n.Inventoryslide);
		clickjavascript(n.PriceListslide);



	}


	@Then("User need to Add an Price List")
	public void user_need_to_add_an_price_list() throws InterruptedException, AWTException {
		n=new Inventory_PriceList_POJO();
		for(String winHandle : driver.getWindowHandles()){
			driver.switchTo().window(winHandle);

			toClick(n.AddPriceListbtn);
			Thread.sleep(3000);
			tofill(n.PriceListName, "kiijdujwwwdwd");
			tofill(n.TypeDD, "Purchase");
			toenter();
			tofill(n.EffectiveFrom, "08/09/2022");
			tofill(n.EffectiveTo, "10/09/2022");
			Thread.sleep(3000);
			toClick(n.Items1table);
			tofill(n.Items1tabletype, "samsung");
			toenter();
			Thread.sleep(3000);
			toClick(n.Quantity1table);
			tofill(n.Quantity1table, "1");
			Thread.sleep(3000);
			totabkey();
			Thread.sleep(1000);
			tofill(n.Unit1Price, "100");
			Thread.sleep(1000);
			totabkey();
			clickjavascript(n.AddNewLinesbtn);
			Thread.sleep(3000);
			toClick(n.Savebtn);


		}


	}

	@And("User need to Delete the price List")
	public void user_need_to_delete_the_price_list() throws InterruptedException {
		n=new Inventory_PriceList_POJO();
		for(String winHandle : driver.getWindowHandles()){
			driver.switchTo().window(winHandle);
			Thread.sleep(1000);
			tofill(n.Searchboxmain, "kiijdujwwwdwd");
			Thread.sleep(1000);
			clickjavascript(n.Checkboxmain);
			Thread.sleep(1000);
			toClick(n.Dropdown);
			Thread.sleep(1000);
			mouseclick(n.Delete);
			Thread.sleep(1000);
			clickjavascript(n.Okpopup);

			driver.quit();



		}

	}

}
