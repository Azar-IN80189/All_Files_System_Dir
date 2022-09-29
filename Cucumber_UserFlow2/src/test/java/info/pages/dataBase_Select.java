package info.pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;

import info.pom.PageObjectModel;
import info.utility.ExcelReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class dataBase_Select  extends info.base.BaseClass {
	public static PageObjectModel p;
	@Given("User need to enter in to db")
	public void user_need_to_enter_in_to_db() throws IOException {
		p = new PageObjectModel();
		implicitwait();
	}

	@When("User enters Database Name{string} and {int}")
	public void user_enters_Database_Name_and(String SheetName, Integer RowNumber) throws IOException, InvalidFormatException, InterruptedException, AWTException {
		ExcelReader reader=new ExcelReader();
		p = new PageObjectModel();
		Thread.sleep(2000);
		toClick(p.ChangeDB);
		List<Map<String,String>> testData=reader.getData("src/test/resources/Excel/Automation.xlsx", SheetName);
		Pageloadtimeout();
		String Dbname = testData.get(RowNumber).get("database");
		p.DBnameenter.sendKeys(Dbname);
		tomovethecursor(driver.findElement(By.xpath("//*[@id=\"tblCustomerList\"]/tbody/tr[1]")));
		toClick(driver.findElement(By.xpath("//*[@id=\"tblCustomerList\"]/tbody/tr[1]")));
			
	}

	@And("User clicks on User Database name")
	public void user_clicks_on_User_Database_name() throws InterruptedException, AWTException {
		System.out.println("user entered db name successfully");
		
	}


}
