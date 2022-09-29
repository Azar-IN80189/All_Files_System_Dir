package info.pages;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import info.base.BaseClass;
import info.pom.Utility_Purgeandrepo_POJO;
import info.utility.ExcelReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class PurgeandReprocess extends BaseClass {
	Utility_Purgeandrepo_POJO pr;
	
	@Given("User need to purge and reprocess a employee")
	public void user_need_to_purge_and_reprocess_a_employee() throws IOException {
		pr =new Utility_Purgeandrepo_POJO();
		tomovethecursor(pr.utilityclick);
		toClick(pr.utilityclick);
		tomovethecursor(pr.Purgeandreprogressclick);
		toClick(pr.Purgeandreprogressclick);
		actionssendkeysdelete(pr.FromDatepurge);

	}



	@Given("User need to enter details in to purge and reprocess page {string} and {int}")
	public void user_need_to_enter_details_in_to_purge_and_reprocess_page_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
		pr =new Utility_Purgeandrepo_POJO();
		List<Map<String,String>> testData=reader.getData("src/test/resources/Excel/Automation.xlsx", SheetName);
		String Fromdate = testData.get(RowNumber).get("From");
		toFill(pr.FromDatepurge, Fromdate);
		actionssendkeysdelete(pr.ToDatepurge);
		String Todate = testData.get(RowNumber).get("To");
		toFill(pr.ToDatepurge, Todate);
		toClick(pr.purgecheckbox);
		toClick(pr.reprocesscheckbox);
		String Searchemp = testData.get(RowNumber).get("Search Employee");
		toFill(pr.purgeandreposearch, Searchemp);
		toClick(pr.purgeandreposearchbtn);
		toClick(pr.checkemployeepurge);
		Scrolldownjavascript();
		toClick(pr.processbtn);


	}
	@Then("User need to click process to purge and reprocess for an employee")
	public void user_need_to_click_process_to_purge_and_reprocess_for_an_employee() throws IOException {
		pr =new Utility_Purgeandrepo_POJO();
		toClick(pr.processbtn);

	}
}