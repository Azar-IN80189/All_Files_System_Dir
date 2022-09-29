package info.MAL_pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;

import info.base.Reusableclass;
import info.pom.UserCreation_MAL_POJO;
import info.utility.ExcelReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class dataBase_Select  extends Reusableclass {
	public static UserCreation_MAL_POJO p;
	@Given("User need to enter in to db in MAL")
	public void user_need_to_enter_in_to_db_in_mal() throws IOException {
		p = new UserCreation_MAL_POJO();
		implicitwait();
	}

	@When("User enters Database Name in MAL {string} and {int}")
	public void user_enters_database_name_in_mal_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException {
		ExcelReader reader=new ExcelReader();
		p = new UserCreation_MAL_POJO();
		Thread.sleep(2000);
		toClick(p.ChangeDB);
		List<Map<String,String>> testData=reader.getData("src/test/resources/Excel/Automation.xlsx", SheetName);
		Pageloadtimeout();
		String Dbname = testData.get(RowNumber).get("database");
		p.DBnameenter.sendKeys(Dbname);
		tomovethecursor(driver.findElement(By.xpath("//*[@id=\"tblCustomerList\"]/a[1]")));
		toClick(driver.findElement(By.xpath("//*[@id=\"tblCustomerList\"]/a[1]")));
			implicitwait();
	}

	@And("User clicks on User Database name in MAL")
	public void user_clicks_on_user_database_name_in_mal()throws InterruptedException, AWTException {
		System.out.println("user entered db name successfully");
		implicitwait();
	}


}
