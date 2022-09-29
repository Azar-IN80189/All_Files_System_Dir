package info.pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import info.base.BaseClass;
import info.pom.PageObjectModel;
import info.utility.ExcelReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BasicMasterSetup extends BaseClass{
	PageObjectModel s;
	
	
	@Given("User need to Create the Shift for the employee {string} and {int}")
	public void user_need_to_Create_the_Shift_for_the_employee_and(String SheetName, Integer RowNumber) throws IOException, InterruptedException, InvalidFormatException {

		ExcelReader reader=new ExcelReader();
		s = new PageObjectModel();
		
		
		List<Map<String,String>> testData=reader.getData("src/test/resources/Excel/Automation.xlsx", SheetName);
		Explicitwait(s.shiftsetting);
		tomovethecursor(s.getShiftsetting());
		clickjavascript(s.getShiftsetting());
		implicitwait();
		toClick(s.shiftmaster);
		toClick(s.newshift);
		String shiftcode = testData.get(RowNumber).get("Shift Code");
		s.shiftcode.sendKeys(shiftcode);
		String shiftname = testData.get(RowNumber).get("Shift Name ");
		s.shiftname.sendKeys(shiftname);
		String lategraceperiod = testData.get(RowNumber).get("Lateness grace");
		s.lategraceperiod.sendKeys(lategraceperiod);
		String aftereveryminuts = testData.get(RowNumber).get("Lateness AfterEvery");
		s.aftereveryminuts.sendKeys(aftereveryminuts);
		String latededuct = testData.get(RowNumber).get("Deduct");
		s.latededuct.sendKeys(latededuct);
		String earlygraceperiod = testData.get(RowNumber).get("Early out Grace");
		s.earlygraceperiod.sendKeys(earlygraceperiod);
		String earlyoutafterevery = testData.get(RowNumber).get("Early out AfterEvery");
		s.earlyoutafterevery.sendKeys(earlyoutafterevery);
		String Earlyoutdeduct = testData.get(RowNumber).get("Deduct");
		s.Earlyoutdeduct.sendKeys(Earlyoutdeduct);
		toselectbyindex(s.roundscroll, 0);
		String roundvalue = testData.get(RowNumber).get("Overtime Round Value");
		s.roundvalue.sendKeys(roundvalue);
		String minimumovertime = testData.get(RowNumber).get("Minimum Overtime");
		s.minimumovertime.sendKeys(minimumovertime);
		implicitwait();
		Explicitwait(s.checkearlyot);
		toClick(s.checkearlyot);
		Explicitwait(s.eroundscroll);
		String eroundscroll = testData.get(RowNumber).get("Overtime Round");
		toselectbyvisibletext(s.eroundscroll, eroundscroll);
		Explicitwait(s.EarlyOT);
		Thread.sleep(1000);
		String EarlyOT = testData.get(RowNumber).get("Early Over Time Round");
		s.EarlyOT.sendKeys(EarlyOT);
		Explicitwait(s.txtearlyminOT);
		toClick(s.txtearlyminOT);
		String txtearlyminOT = testData.get(RowNumber).get("Early OT Minimum");
		s.txtearlyminOT.sendKeys(txtearlyminOT);




		Scrolldownjavascript();
		Thread.sleep(500);
		clickjavascript(s.daychange);
		clickjavascript(s.chkoffsetPH);
		actionssendkeysdelete(s.Timein);
		implicitwait();
		String Timein = testData.get(RowNumber).get("Time In");
		s.Timein.sendKeys(Timein);
		actionssendkeysdelete(s.Timeout);
		String Timeout = testData.get(RowNumber).get("Time Out");
		s.Timeout.sendKeys(Timeout);
		actionssendkeysdelete(s.Lunchout);
		String Lunchout = testData.get(RowNumber).get("Lunch Out");
		s.Lunchout.sendKeys(Lunchout);
		actionssendkeysdelete(s.Lunchin);
		String Lunchin = testData.get(RowNumber).get("Lunch In");
		s.Lunchin.sendKeys(Lunchin);
		toselectbyindex(s.overtimedropdown, 1);
		toClick(s.extra);
		toselectbyindex(s.erate, 2);
		actionssendkeysdelete(s.Maxhr);
		String Maxhr = testData.get(RowNumber).get("Max Hr");
		s.Maxhr.sendKeys(Maxhr);
		toClick(s.lunchlatecheck);
		toselectbyindex(s.phdropdown, 1);

		actionssendkeysdelete(s.phmax);
		String phmax = testData.get(RowNumber).get("PH Max Hr");
		s.phmax.sendKeys(phmax);
		actionssendkeysdelete(s.OT1hrssu0);
		String OT1hrssu0 = testData.get(RowNumber).get("1.00");
		s.OT1hrssu0.sendKeys(OT1hrssu0);
		actionssendkeysdelete(s.OTD1Ded0su);
		String OTD1Ded0su = testData.get(RowNumber).get("1-Ded");
		s.OTD1Ded0su.sendKeys(OTD1Ded0su);
		moverightscroll(s.OTD2Dedsu);
		actionssendkeysdelete(s.OT2hrssu0);
		String OT2hrssu0 = testData.get(RowNumber).get("2.00");
		s.OT2hrssu0.sendKeys(OT2hrssu0);
		actionssendkeysdelete(s.OTD2Dedsu);
		String OTD2Dedsu = testData.get(RowNumber).get("2-Ded");
		s.OTD2Dedsu.sendKeys(OTD2Dedsu);
		actionssendkeysdelete(s.OT3hrssu0);
		String OT3hrssu0 = testData.get(RowNumber).get("3.00");
		s.OT3hrssu0.sendKeys(OT3hrssu0);
		actionssendkeysdelete(s.OTD3Dedsu);
		String OTD3Dedsu = testData.get(RowNumber).get("3-Ded");
		s.OTD3Dedsu.sendKeys(OTD3Dedsu);



		moveleftscroll(s.timeinmon);
		actionssendkeysdelete(s.timeinmon);
		implicitwait();
		String timeinmon = testData.get(RowNumber).get("Time In");
		s.timeinmon.sendKeys(timeinmon);
		actionssendkeysdelete(s.timeoutmon);
		String timeoutmon = testData.get(RowNumber).get("Time Out");
		s.timeoutmon.sendKeys(timeoutmon);
		actionssendkeysdelete(s.lunchoutmon);
		String lunchoutmon = testData.get(RowNumber).get("Lunch Out");
		s.lunchoutmon.sendKeys(lunchoutmon);
		actionssendkeysdelete(s.lunnchinmon);
		String lunnchinmon = testData.get(RowNumber).get("Lunch In");
		s.lunnchinmon.sendKeys(lunnchinmon);
		toselectbyindex(s.ddOtratemon, 1);
		toClick(s.chkotextramon);
		toselectbyindex(s.extraratemon, 2);
		actionssendkeysdelete(s.maxhrmon);
		String maxhrmon = testData.get(RowNumber).get("Max Hr");
		s.maxhrmon.sendKeys(maxhrmon);
		toClick(s.lunchlatemon);
		toselectbyindex(s.ddphmon, 1);

		actionssendkeysdelete(s.phmaxmon);
		String phmaxmon = testData.get(RowNumber).get("PH Max Hr");
		s.phmaxmon.sendKeys(phmaxmon);
		actionssendkeysdelete(s.OThrs1mon);
		String OThrs1mon = testData.get(RowNumber).get("1.00");
		s.OThrs1mon.sendKeys(OThrs1mon);
		actionssendkeysdelete(s.OT1Ded1mon);
		String OT1Ded1mon = testData.get(RowNumber).get("1-Ded");
		s.OT1Ded1mon.sendKeys(OT1Ded1mon);
		moverightscroll(s.OTded2mon);
		actionssendkeysdelete(s.OT2hrsmon);
		String OT2hrsmon = testData.get(RowNumber).get("2.00");
		s.OT2hrsmon.sendKeys(OT2hrsmon);
		actionssendkeysdelete(s.OTded2mon);
		String OTded2mon = testData.get(RowNumber).get("2-Ded");
		s.OTded2mon.sendKeys(OTded2mon);
		actionssendkeysdelete(s.OT3hrsmon);
		String OT3hrsmon = testData.get(RowNumber).get("3.00");
		s.OT3hrsmon.sendKeys(OT3hrsmon);
		actionssendkeysdelete(s.OTded3mon);
		String OTded3mon = testData.get(RowNumber).get("3-Ded");
		s.OTded3mon.sendKeys(OTded3mon);










		moveleftscroll(s.timeintue);
		actionssendkeysdelete(s.timeintue);
		implicitwait();
		String timeintue = testData.get(RowNumber).get("Time In");
		s.timeintue.sendKeys(timeintue);
		actionssendkeysdelete(s.timeouttue);
		String timeouttue = testData.get(RowNumber).get("Time Out");
		s.timeouttue.sendKeys(timeouttue);
		actionssendkeysdelete(s.lunchouttue);
		String lunchouttue = testData.get(RowNumber).get("Lunch Out");
		s.lunchouttue.sendKeys(lunchouttue);
		actionssendkeysdelete(s.lunchintue);
		String lunchintue = testData.get(RowNumber).get("Lunch In");
		s.lunchintue.sendKeys(lunchintue);
		toselectbyindex(s.ddotratetue, 1);
		toClick(s.chkExtratue);
		toselectbyindex(s.ddextraratetue, 2);
		actionssendkeysdelete(s.maxhrtue);
		String maxhrtue = testData.get(RowNumber).get("Max Hr");
		s.maxhrtue.sendKeys(maxhrtue);
		toClick(s.chklunchlatetue);
		toselectbyindex(s.ddph2tue, 1);

		actionssendkeysdelete(s.phmaxtue);
		String phmaxtue = testData.get(RowNumber).get("PH Max Hr");
		s.phmaxtue.sendKeys(phmaxtue);
		actionssendkeysdelete(s.OT1hrstue);
		String OT1hrstue = testData.get(RowNumber).get("1.00");
		s.OT1hrstue.sendKeys(OT1hrstue);
		actionssendkeysdelete(s.OT1dedtue);
		String OT1dedtue = testData.get(RowNumber).get("1-Ded");
		s.OT1dedtue.sendKeys(OT1dedtue);
		moverightscroll(s.OT2dedtue);
		actionssendkeysdelete(s.OT2hrstue);
		String OT2hrstue = testData.get(RowNumber).get("2.00");
		s.OT2hrstue.sendKeys(OT2hrstue);
		actionssendkeysdelete(s.OT2dedtue);
		String OT2dedtue = testData.get(RowNumber).get("2-Ded");
		s.OT2dedtue.sendKeys(OT2dedtue);
		actionssendkeysdelete(s.OT3hrstue);
		String OT3hrstue = testData.get(RowNumber).get("3.00");
		s.OT3hrstue.sendKeys(OT3hrstue);
		actionssendkeysdelete(s.OT3destue);
		String OT3destue = testData.get(RowNumber).get("3-Ded");
		s.OT3destue.sendKeys(OT3destue);



		moveleftscroll(s.timeinwed);
		actionssendkeysdelete(s.timeinwed);
		implicitwait();
		String timeinwed = testData.get(RowNumber).get("Time In");
		s.timeinwed.sendKeys(timeinwed);
		actionssendkeysdelete(s.timeoutwed);
		String timeoutwed = testData.get(RowNumber).get("Time Out");
		s.timeoutwed.sendKeys(timeoutwed);
		actionssendkeysdelete(s.lunchoutwed);
		String lunchoutwed = testData.get(RowNumber).get("Lunch Out");
		s.lunchoutwed.sendKeys(lunchoutwed);
		actionssendkeysdelete(s.lunchinwed);
		String lunchinwed = testData.get(RowNumber).get("Lunch In");
		s.lunchinwed.sendKeys(lunchinwed);
		toselectbyindex(s.dd1OTratewed, 1);
		toClick(s.chkOtextrawed);
		toselectbyindex(s.ddextraratewed, 2);
		actionssendkeysdelete(s.maxhrwed);
		String maxhrwed = testData.get(RowNumber).get("Max Hr");
		s.maxhrwed.sendKeys(maxhrwed);
		toClick(s.lunchlatewed);
		toselectbyindex(s.ddphwed, 1);

		actionssendkeysdelete(s.phmaxwed);
		String phmaxwed = testData.get(RowNumber).get("PH Max Hr");
		s.phmaxwed.sendKeys(phmaxwed);
		actionssendkeysdelete(s.OThrs1wed);
		String OThrs1wed = testData.get(RowNumber).get("1.00");
		s.OThrs1wed.sendKeys(OThrs1wed);
		actionssendkeysdelete(s.OTded1wed);
		String OTded1wed = testData.get(RowNumber).get("1-Ded");
		s.OTded1wed.sendKeys(OTded1wed);
		moverightscroll(s.OTded2wed);
		actionssendkeysdelete(s.OT2hrswed);
		String OT2hrswed = testData.get(RowNumber).get("2.00");
		s.OT2hrswed.sendKeys(OT2hrswed);
		actionssendkeysdelete(s.OTded2wed);
		String OTded2wed = testData.get(RowNumber).get("2-Ded");
		s.OTded2wed.sendKeys(OTded2wed);
		actionssendkeysdelete(s.OThrs3wed);
		String OThrs3wed = testData.get(RowNumber).get("3.00");
		s.OThrs3wed.sendKeys(OThrs3wed);
		actionssendkeysdelete(s.OTded3wed);
		String OTded3wed = testData.get(RowNumber).get("3-Ded");
		s.OTded3wed.sendKeys(OTded3wed);


		moveleftscroll(s.timeinthur);
		actionssendkeysdelete(s.timeinthur);
		implicitwait();
		String timeinthur = testData.get(RowNumber).get("Time In");
		s.timeinthur.sendKeys(timeinthur);
		actionssendkeysdelete(s.timeoutthur);
		String timeoutthur = testData.get(RowNumber).get("Time Out");
		s.timeoutthur.sendKeys(timeoutthur);
		actionssendkeysdelete(s.lunchoutthur);
		String lunchoutthur = testData.get(RowNumber).get("Lunch Out");
		s.lunchoutthur.sendKeys(lunchoutthur);
		actionssendkeysdelete(s.lunchinthur);
		String lunchinthur = testData.get(RowNumber).get("Lunch In");
		s.lunchinthur.sendKeys(lunchinthur);
		toselectbyindex(s.ddotratethur, 1);
		toClick(s.OTextrathur);
		toselectbyindex(s.ddotextraratethur, 2);
		actionssendkeysdelete(s.maxhrthur);
		String maxhrthur = testData.get(RowNumber).get("Max Hr");
		s.maxhrthur.sendKeys(maxhrthur);
		toClick(s.chklunchkatethur);
		toselectbyindex(s.ddphthur, 1);

		actionssendkeysdelete(s.phmaxthur);
		String phmaxthur = testData.get(RowNumber).get("PH Max Hr");
		s.phmaxthur.sendKeys(phmaxthur);
		actionssendkeysdelete(s.OT1hrsthur);
		String OT1hrsthur = testData.get(RowNumber).get("1.00");
		s.OT1hrsthur.sendKeys(OT1hrsthur);
		actionssendkeysdelete(s.OT1dedthur);
		String OT1dedthur = testData.get(RowNumber).get("1-Ded");
		s.OT1dedthur.sendKeys(OT1dedthur);
		moverightscroll(s.OT2dedthur);
		actionssendkeysdelete(s.OT2hrsthur);
		String OT2hrsthur = testData.get(RowNumber).get("2.00");
		s.OT2hrsthur.sendKeys(OT2hrsthur);
		actionssendkeysdelete(s.OT2dedthur);
		String OT2dedthur = testData.get(RowNumber).get("2-Ded");
		s.OT2dedthur.sendKeys(OT2dedthur);
		actionssendkeysdelete(s.OT3hrsthur);
		String OT3hrsthur = testData.get(RowNumber).get("3.00");
		s.OT3hrsthur.sendKeys(OT3hrsthur);
		actionssendkeysdelete(s.OT3dedthur);
		String OT3dedthur = testData.get(RowNumber).get("3-Ded");
		s.OT3dedthur.sendKeys(OT3dedthur);


		moveleftscroll(s.timeinfri);
		actionssendkeysdelete(s.timeinfri);
		implicitwait();
		String timeinfri = testData.get(RowNumber).get("Time In");
		s.timeinfri.sendKeys(timeinfri);
		actionssendkeysdelete(s.timeoutfri);
		String timeoutfri = testData.get(RowNumber).get("Time Out");
		s.timeoutfri.sendKeys(timeoutfri);
		actionssendkeysdelete(s.lunchoutfri);
		String lunchoutfri = testData.get(RowNumber).get("Lunch Out");
		s.lunchoutfri.sendKeys(lunchoutfri);
		actionssendkeysdelete(s.lunchinfri);
		String lunchinfri = testData.get(RowNumber).get("Lunch In");
		s.lunchinfri.sendKeys(lunchinfri);
		toselectbyindex(s.ddotratefri, 1);
		toClick(s.OTextrafri);
		toselectbyindex(s.ddotextraratefri, 2);
		actionssendkeysdelete(s.maxhrfri);
		String maxhrfri = testData.get(RowNumber).get("Max Hr");
		s.maxhrfri.sendKeys(maxhrfri);
		toClick(s.chklunchkatefri);
		toselectbyindex(s.ddpfri, 1);
		Scrolldownjavascript();
		actionssendkeysdelete(s.phmaxfri);
		String phmaxfri = testData.get(RowNumber).get("PH Max Hr");
		s.phmaxfri.sendKeys(phmaxfri);
		actionssendkeysdelete(s.OT1hrsfri);
		String OT1hrsfri = testData.get(RowNumber).get("1.00");
		s.OT1hrsfri.sendKeys(OT1hrsfri);
		actionssendkeysdelete(s.OT1dedfri);
		String OT1dedfri = testData.get(RowNumber).get("1-Ded");
		s.OT1dedfri.sendKeys(OT1dedfri);
		moverightscroll(s.OT2dedfri);
		actionssendkeysdelete(s.OT2hrsfri);
		String OT2hrsfri = testData.get(RowNumber).get("2.00");
		s.OT2hrsfri.sendKeys(OT2hrsfri);
		actionssendkeysdelete(s.OT2dedfri);
		String OT2dedfri = testData.get(RowNumber).get("2-Ded");
		s.OT2dedfri.sendKeys(OT2dedfri);
		actionssendkeysdelete(s.OT3hrsfri);
		String OT3hrsfri = testData.get(RowNumber).get("3.00");
		s.OT3hrsfri.sendKeys(OT3hrsfri);
		actionssendkeysdelete(s.OT3dedfri);
		String OT3dedfri = testData.get(RowNumber).get("3-Ded");
		s.OT3dedfri.sendKeys(OT3dedfri);




		moveleftscroll(s.timeinsat);
		actionssendkeysdelete(s.timeinsat);
		implicitwait();
		String timeinsat = testData.get(RowNumber).get("Time In");
		s.timeinsat.sendKeys(timeinsat);
		actionssendkeysdelete(s.timeoutsat);
		String timeoutsat = testData.get(RowNumber).get("Time Out");
		s.timeoutsat.sendKeys(timeoutsat);
		actionssendkeysdelete(s.lunchoutsat);
		String lunchoutsat = testData.get(RowNumber).get("Lunch Out");
		s.lunchoutsat.sendKeys(lunchoutsat);
		actionssendkeysdelete(s.lunchinsat);
		String lunchinsat = testData.get(RowNumber).get("Lunch In");
		s.lunchinsat.sendKeys(lunchinsat);
		toselectbyindex(s.ddotratesat, 1);
		toClick(s.chkOTextrasat);
		toselectbyindex(s.ddotextraratefri, 2);
		actionssendkeysdelete(s.maxhrsat);
		String maxhrsat = testData.get(RowNumber).get("Max Hr");
		s.maxhrsat.sendKeys(maxhrsat);
		toClick(s.chklunchkatesat);
		toselectbyindex(s.ddphsat, 1);

		actionssendkeysdelete(s.phmaxsat);
		String phmaxsat = testData.get(RowNumber).get("PH Max Hr");
		s.phmaxsat.sendKeys(phmaxsat);
		actionssendkeysdelete(s.OT1hrssat);
		String OT1hrssat = testData.get(RowNumber).get("1.00");
		s.OT1hrssat.sendKeys(OT1hrssat);
		actionssendkeysdelete(s.OT1dedsat);
		String OT1dedsat = testData.get(RowNumber).get("1-Ded");
		s.OT1dedsat.sendKeys(OT1dedsat);
		moverightscroll(s.OT2dedsat);
		actionssendkeysdelete(s.OT2hrssat);
		String OT2hrssat = testData.get(RowNumber).get("2.00");
		s.OT2hrssat.sendKeys(OT2hrssat);
		actionssendkeysdelete(s.OT2dedsat);
		String OT2dedsat = testData.get(RowNumber).get("2-Ded");
		s.OT2dedsat.sendKeys(OT2dedsat);
		actionssendkeysdelete(s.OT3hrssat);
		String OT3hrssat = testData.get(RowNumber).get("3.00");
		s.OT3hrssat.sendKeys(OT3hrssat);
		actionssendkeysdelete(s.OT3dedsat);
		String OT3dedsat = testData.get(RowNumber).get("3-Ded");
		s.OT3dedsat.sendKeys(OT3dedsat);

		
		Scrollupjavascript();
		toClick(s.lunchlate0);
		toClick(s.chksaturday);
		toClick(s.chksunday);
		Scrolldownjavascript();
		toClick(s.saveshiftmaster);
		Thread.sleep(3000);
		Scrollupjavascript();
	}



	@Given("User need to create the department")
	public void user_need_to_create_the_department() throws IOException, InvalidFormatException, InterruptedException {
		s = new PageObjectModel();
		tomovethecursor(s.Master);
		toClick(s.Master);
		implicitwait();
		tomovethecursor(s.BasicMasterSetup);
		toClick(s.BasicMasterDepartment);
		toClick(s.BasicMasterDepartmentnewbtn);
	}



	@When("User entered Dept code and Dept name {string} and {int}")
	public void user_entered_Dept_code_and_Dept_name_and(String SheetName1, Integer RowNumber1) throws IOException, InvalidFormatException {
		ExcelReader reader=new ExcelReader();
		s = new PageObjectModel();
		List<Map<String,String>> testData=reader.getData("src/test/resources/Excel/Automation.xlsx", SheetName1);
		String deptcode = testData.get(RowNumber1).get("BasicDepartmentcode");
		String deptname = testData.get(RowNumber1).get("BasicDepartmentname");
		s.BasicMasterDepartmentcode.sendKeys(deptcode);
		s.BasicMasterDepartmentName.sendKeys(deptname);

	}

	@Then("User need to click save to create a Department")
	public void user_need_to_click_save_to_create_a_Department() throws InterruptedException, IOException {
		s = new PageObjectModel();
		Thread.sleep(1000);
		toClick(s.BasicDepartmentSave);
		Thread.sleep(1000);
	}

	@Then("User need to create the designation")
	public void user_need_to_create_the_designation() throws IOException {
		s = new PageObjectModel();
		implicitwait();
		tomovethecursor(s.Master);
		tomovethecursor(s.BasicMasterSetup);
		toClick(s.BasicMasterDesignation);
		toClick(s.BasicMasterDesignationnewbtn);

	}

	@When("User entered designation code and designation name {string} and {int}")
	public void user_entered_designation_code_and_designation_name_and(String SheetName1, Integer RowNumber1) throws IOException, InvalidFormatException {
		ExcelReader reader=new ExcelReader();
		s = new PageObjectModel();
		List<Map<String,String>> testData=reader.getData("src/test/resources/Excel/Automation.xlsx", SheetName1);
		String designationcode = testData.get(RowNumber1).get("BasicDesignationcode");
		String designationname = testData.get(RowNumber1).get("BasicDesignationname");
		implicitwait();
		s.BasicMasterDesignationcode.sendKeys(designationcode);
		s.BasicMasterDesignationname.sendKeys(designationname);


	}

	@When("User have to click save to create a designation")
	public void user_have_to_click_save_to_create_a_designation() throws InterruptedException, IOException {
		s = new PageObjectModel();
		Thread.sleep(1000);
		toClick(s.BasicMasterDesignationSave);
		Thread.sleep(1000);
	}

	@Then("User need to create a section")
	public void user_need_to_create_a_section() throws IOException {
		s = new PageObjectModel();
		implicitwait();
		tomovethecursor(s.Master);
		tomovethecursor(s.BasicMasterSetup);
		implicitwait();
		toClick(s.BasicMasterSection);
		implicitwait();
		toClick(s.BasicMasterSectionnewbtn);
		implicitwait();

	}

	@When("User entered section code and section name {string} and {int}")
	public void user_entered_section_code_and_section_name_and(String SheetName1, Integer RowNumber1) throws IOException, InvalidFormatException, AWTException {
		implicitwait();
		ExcelReader reader=new ExcelReader();
		s = new PageObjectModel();
		List<Map<String,String>> testData=reader.getData("src/test/resources/Excel/Automation.xlsx", SheetName1);
		String sectioncode = testData.get(RowNumber1).get("BasicSectioncode");
		String sectionname = testData.get(RowNumber1).get("BasicSectionname");
		implicitwait();
		s.BasicMasterSectioncode.sendKeys(sectioncode);
		s.BasicMasterSectionname.sendKeys(sectionname);
		toClick(s.SectionDepartment);
		actionssendkeysdelete(s.SectionDepartment);
		String SectionDepartment = testData.get(RowNumber1).get("BasicDepartmentname");
		s.SectionDepartment.sendKeys(SectionDepartment);
		todown();
		toenter();
		implicitwait();

	}

	@When("User need to select the dept and click save to create a section")
	public void user_need_to_select_the_dept_and_click_save_to_create_a_section() throws InterruptedException, IOException {
		s = new PageObjectModel();
		Thread.sleep(1000);
		toClick(s.BasicMasterSectionSave);
		Thread.sleep(3000);
	}

	@Then("User need to create a category")
	public void user_need_to_create_a_category() throws IOException {
		s = new PageObjectModel();
		tomovethecursor(s.Master);
		tomovethecursor(s.BasicMasterSetup);
		implicitwait();
		toClick(s.BasicMasterCategory);
		implicitwait();
		toClick(s.BasicMasterCategorynewbtn);
		implicitwait();

	}

	@When("User entered category code and category name {string} and {int}")
	public void user_entered_category_code_and_category_name_and(String SheetName1, Integer RowNumber1) throws IOException, InvalidFormatException {
		implicitwait();
		ExcelReader reader=new ExcelReader();
		s= new PageObjectModel();
		List<Map<String,String>> testData=reader.getData("src/test/resources/Excel/Automation.xlsx", SheetName1);
		String categorycode = testData.get(RowNumber1).get("BasicCategorycode");
		String  categoryname = testData.get(RowNumber1).get("BasicCategoryname");
		implicitwait();		
		s.BasicMasterCategorycode.sendKeys(categorycode);
		s.BasicMasterCategoryname.sendKeys(categoryname);



	}

	@When("user need to click save to create a category")
	public void user_need_to_click_save_to_create_a_category() throws InterruptedException, IOException {
		s = new PageObjectModel();
		Thread.sleep(1000);
		toClick(s.BasicMasterCategorySave);
		Thread.sleep(1000);
	}

	@Then("User need to create the designation group")
	public void user_need_to_create_the_designation_group() throws IOException {
		s = new PageObjectModel();
		implicitwait();
		tomovethecursor(s.Master);
		tomovethecursor(s.BasicMasterSetup);
		implicitwait();
		toClick(s.BasicMasterDesignationgroup);
		implicitwait();
		toClick(s.BasicMasterDesignationgroupnewbtn);
		implicitwait();

	}

	@When("user entered designationgroupcode and designationgroupname {string} and {int}")
	public void user_entered_designationgroupcode_and_designationgroupname_and(String SheetName1, Integer RowNumber1) throws IOException, InvalidFormatException {
		implicitwait();
		ExcelReader reader=new ExcelReader();
		s = new PageObjectModel();
		List<Map<String,String>> testData=reader.getData("src/test/resources/Excel/Automation.xlsx", SheetName1);
		String designationgroupcode = testData.get(RowNumber1).get("BasicDesignationgroupcode");
		String  designationgroupname = testData.get(RowNumber1).get("BasicDesignationgroupname");
		implicitwait();		
		s.BasicMasterDesignationgroupcode.sendKeys(designationgroupcode);
		s.BasicMasterDesignationgroupname.sendKeys(designationgroupname);

	}

	@Then("user need to click save to create a designation group")
	public void user_need_to_click_save_to_create_a_designation_group() throws InterruptedException {
		Thread.sleep(1000);
		toClick(s.BasicMasterDesignationgroupSave);
		Thread.sleep(1000);
	}



}
