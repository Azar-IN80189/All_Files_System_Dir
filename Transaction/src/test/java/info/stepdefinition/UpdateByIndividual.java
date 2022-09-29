package info.stepdefinition;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import info.base.Reusableclass;
import info.pojo.AutoshiftNew_POJO;
import info.pojo.BranchScheduler_POJO;
import info.pojo.EmployeeAllocation_POJO;
import info.pojo.EmployeeScheduler_POJO;
import info.pojo.UpdateByIndividual_POJO;
import info.utilities.ExcelReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class UpdateByIndividual extends Reusableclass
{
	EmployeeAllocation_POJO eap;
	BranchScheduler_POJO bsp;
	AutoshiftNew_POJO asp;
	EmployeeScheduler_POJO esp;
	UpdateByIndividual_POJO uip;
	
	
	@Given("User is on update by individual screen")
	public void user_is_on_update_by_individual_screen() 
	{
	   
	   uip= new UpdateByIndividual_POJO();
	   
	   mouseOver(uip.TransactionMenu);
	   
	   //Explicit Wait for UpdateByIndividualMenu
	   WebDriverWait wait1 = new WebDriverWait(driver,100);
	   wait1.until(ExpectedConditions.elementToBeClickable(uip.UpdateByIndividualMenu));
	   toClick(uip.UpdateByIndividualMenu);
	  
	}

	@When("fill the clock in and clock out {string} and {int}")
	public void fill_the_clock_in_and_clock_out_and(String Sheet5, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException 
	{
		uip= new UpdateByIndividual_POJO();
		
		ExcelReader reader=new ExcelReader();
		
		List<Map<String,String>> UBIData=reader.getData("src\\test\\resources\\Excel File\\Test Data.xlsx",Sheet5);
		
		try
		{
		
		//Explicit Wait for Employee
		String EmployeeName=UBIData.get(RowNumber).get("Employee Name");
		WebDriverWait wait2 = new WebDriverWait(driver,100);
		wait2.until(ExpectedConditions.elementToBeClickable(uip.Employee));
		actionssendkeysdelete(uip.Employee);
		tofill(uip.Employee, EmployeeName);
		todown();
		toenter();
		
		//Explicit Wait for From Date
		String FromDate=UBIData.get(RowNumber).get("Effective From");
		WebDriverWait wait3 = new WebDriverWait(driver,100);
		wait3.until(ExpectedConditions.elementToBeClickable(uip.FromDate));
		Thread.sleep(500);
		actionssendkeysdelete(uip.FromDate);
		Thread.sleep(500);
		tofill(uip.FromDate, FromDate);
		toenter();
		
		//Explicit Wait for To Date
		String ToDate=UBIData.get(RowNumber).get("Effective To");
		WebDriverWait wait4 = new WebDriverWait(driver,100);
		wait4.until(ExpectedConditions.elementToBeClickable(uip.ToDate));
		Thread.sleep(500);
		actionssendkeysdelete(uip.ToDate);
		Thread.sleep(500);
		tofill(uip.ToDate, ToDate);
		toenter();
		
		//Click Search
		Thread.sleep(1000);
		toClick(uip.Search);
		
		//Click Missing Date
		//Explicit Wait for Missing Date
		WebDriverWait wait = new WebDriverWait(driver,100);
		wait.until(ExpectedConditions.elementToBeClickable(uip.MissingDate));
		toClick(uip.MissingDate);
		
		Thread.sleep(1000);
		
		String In=UBIData.get(RowNumber).get("In1");
		String Out=UBIData.get(RowNumber).get("Out1");
		String Shift=UBIData.get(RowNumber).get("Shfit1");
		String Reason=UBIData.get(RowNumber).get("Reason1");
		
		Thread.sleep(1000);
				
		System.out.println("Record Available");
		
		//Row 1 -  Insertion	
		
		//Explicit Wait for Clock In
		WebDriverWait wait5 = new WebDriverWait(driver,100);
		wait5.until(ExpectedConditions.elementToBeClickable(uip.ClockIn1));
		Thread.sleep(3000);
		actionssendkeysdelete(uip.ClockIn1);
		WebElement ClockIntxt1=driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[6]/textarea"));
		actionssendkeysdelete(ClockIntxt1);
		Thread.sleep(1000);		
		tofill(ClockIntxt1, In); 
		Thread.sleep(1000);	
		//toenter();
		totabkey();
		System.out.println("Clockin Enterted");

		//Explicit Wait for Clock Out
		WebDriverWait wait6 = new WebDriverWait(driver,100);
		wait6.until(ExpectedConditions.elementToBeClickable(uip.ClockOut1));
		Thread.sleep(2000);
		actionssendkeysdelete(uip.ClockOut1);
		WebElement ClockOuttxt1=driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[6]/textarea"));
		actionssendkeysdelete(ClockOuttxt1);
		Thread.sleep(1000);
		tofill(ClockOuttxt1, Out); 
		Thread.sleep(1000);	
		totabkey();

		//Explicit Wait for shift
		WebDriverWait wait7 = new WebDriverWait(driver,100);
		wait6.until(ExpectedConditions.elementToBeClickable(uip.Shift1));
		Thread.sleep(2000);
		actionssendkeysdelete(uip.Shift1);
		WebElement Shifttxt1=driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[7]/textarea"));
		actionssendkeysdelete(Shifttxt1);
		Thread.sleep(1000);
		tofill(Shifttxt1, Shift); 
		Thread.sleep(1000);	
		totabkey();

		//Explicit Wait for Reason
		WebDriverWait wait8 = new WebDriverWait(driver,100);
		wait6.until(ExpectedConditions.elementToBeClickable(uip.Reason1));
		Thread.sleep(2000);
		actionssendkeysdelete(uip.Reason1);
		WebElement Reasontxt1=driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[7]/textarea"));
		actionssendkeysdelete(Reasontxt1);
		Thread.sleep(1000);
		tofill(Reasontxt1, Reason); 
		Thread.sleep(1000);	
		totabkey();
		
		String In2=UBIData.get(RowNumber).get("In2");
		String Out2=UBIData.get(RowNumber).get("Out2");
		String Shift2=UBIData.get(RowNumber).get("Shfit2");
		String Reason2=UBIData.get(RowNumber).get("Reason2");

		/*  Row 2 -  Insertion	*/
		
		//Explicit Wait for Clock In
		WebDriverWait wait9 = new WebDriverWait(driver,100);
		wait9.until(ExpectedConditions.elementToBeClickable(uip.ClockIn2));
		Thread.sleep(2000);
		actionssendkeysdelete(uip.ClockIn2);
		WebElement ClockIntxt2=driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[6]/textarea"));
		actionssendkeysdelete(ClockIntxt2);
		Thread.sleep(1000);		
		tofill(ClockIntxt2, In2); 
		Thread.sleep(1000);	
		//toenter();
		totabkey();
		System.out.println("Clockin Enterted");

		//Explicit Wait for Clock Out
		WebDriverWait wait10 = new WebDriverWait(driver,100);
		wait10.until(ExpectedConditions.elementToBeClickable(uip.ClockOut2));
		Thread.sleep(2000);
		actionssendkeysdelete(uip.ClockOut2);
		WebElement ClockOuttxt2=driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[6]/textarea"));
		actionssendkeysdelete(ClockOuttxt2);
		Thread.sleep(1000);
		tofill(ClockOuttxt2, Out2); 
		Thread.sleep(1000);	
		totabkey();

		//Explicit Wait for shift
		WebDriverWait wait11 = new WebDriverWait(driver,100);
		wait11.until(ExpectedConditions.elementToBeClickable(uip.Shift2));
		Thread.sleep(2000);
		actionssendkeysdelete(uip.Shift2);
		WebElement Shifttxt2=driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[7]/textarea"));
		actionssendkeysdelete(Shifttxt2);
		Thread.sleep(1000);
		tofill(Shifttxt2, Shift2); 
		Thread.sleep(1000);	
		totabkey();

		//Explicit Wait for Reason
		WebDriverWait wait12 = new WebDriverWait(driver,100);
		wait6.until(ExpectedConditions.elementToBeClickable(uip.Reason2));
		Thread.sleep(2000);
		actionssendkeysdelete(uip.Reason2);
		WebElement Reasontxt2=driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[7]/textarea"));
		actionssendkeysdelete(Reasontxt2);
		Thread.sleep(1000);
		tofill(Reasontxt2, Reason2); 
		Thread.sleep(1000);	
		totabkey();

		/*  Row 3 -  Insertion	*/
		
		String In3=UBIData.get(RowNumber).get("In3");
		String Out3=UBIData.get(RowNumber).get("Out3");
		String Shift3=UBIData.get(RowNumber).get("Shfit3");
		String Reason3=UBIData.get(RowNumber).get("Reason3");
		
		//Explicit Wait for Clock In
		WebDriverWait wait13 = new WebDriverWait(driver,100);
		wait13.until(ExpectedConditions.elementToBeClickable(uip.ClockIn3));
		Thread.sleep(2000);
		actionssendkeysdelete(uip.ClockIn3);
		WebElement ClockIntxt3=driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[6]/textarea"));
		actionssendkeysdelete(ClockIntxt3);
		Thread.sleep(1000);		
		tofill(ClockIntxt3, In3); 
		Thread.sleep(1000);	
		//toenter();
		totabkey();
		System.out.println("Clockin Enterted");

		//Explicit Wait for Clock Out
		WebDriverWait wait14 = new WebDriverWait(driver,100);
		wait14.until(ExpectedConditions.elementToBeClickable(uip.ClockOut3));
		Thread.sleep(2000);
		actionssendkeysdelete(uip.ClockOut3);
		WebElement ClockOuttxt3=driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[6]/textarea"));
		actionssendkeysdelete(ClockOuttxt3);
		Thread.sleep(1000);
		tofill(ClockOuttxt3, Out3); 
		Thread.sleep(1000);	
		totabkey();

		//Explicit Wait for shift
		WebDriverWait wait15 = new WebDriverWait(driver,100);
		wait15.until(ExpectedConditions.elementToBeClickable(uip.Shift3));
		Thread.sleep(2000);
		actionssendkeysdelete(uip.Shift3);
		WebElement Shifttxt3=driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[7]/textarea"));
		actionssendkeysdelete(Shifttxt3);
		Thread.sleep(1000);
		tofill(Shifttxt3, Shift3); 
		Thread.sleep(1000);	
		totabkey();

		//Explicit Wait for Reason
		WebDriverWait wait16 = new WebDriverWait(driver,100);
		wait16.until(ExpectedConditions.elementToBeClickable(uip.Reason3));
		Thread.sleep(2000);
		actionssendkeysdelete(uip.Reason3);
		WebElement Reasontxt3=driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[7]/textarea"));
		actionssendkeysdelete(Reasontxt3);
		Thread.sleep(1000);
		tofill(Reasontxt3, Reason3); 
		Thread.sleep(1000);	
		totabkey();
		
		/*  Row 4 -  Insertion	*/
		
		String In4=UBIData.get(RowNumber).get("In4");
		String Out4=UBIData.get(RowNumber).get("Out4");
		String Shift4=UBIData.get(RowNumber).get("Shfit4");
		String Reason4=UBIData.get(RowNumber).get("Reason4");
		
		//Explicit Wait for Clock In
		WebDriverWait wait17 = new WebDriverWait(driver,100);
		wait17.until(ExpectedConditions.elementToBeClickable(uip.ClockIn4));
		Thread.sleep(2000);
		actionssendkeysdelete(uip.ClockIn4);
		WebElement ClockIntxt4=driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[6]/textarea"));
		actionssendkeysdelete(ClockIntxt4);
		Thread.sleep(1000);		
		tofill(ClockIntxt4, In4); 
		Thread.sleep(1000);	
		//toenter();
		totabkey();
		System.out.println("Clockin Enterted");

		//Explicit Wait for Clock Out
		WebDriverWait wait18 = new WebDriverWait(driver,100);
		wait18.until(ExpectedConditions.elementToBeClickable(uip.ClockOut4));
		Thread.sleep(2000);
		actionssendkeysdelete(uip.ClockOut4);
		WebElement ClockOuttxt4=driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[6]/textarea"));
		actionssendkeysdelete(ClockOuttxt4);
		Thread.sleep(1000);
		tofill(ClockOuttxt4, Out4); 
		Thread.sleep(1000);	
		totabkey();

		//Explicit Wait for shift
		WebDriverWait wait19 = new WebDriverWait(driver,100);
		wait19.until(ExpectedConditions.elementToBeClickable(uip.Shift4));
		Thread.sleep(2000);
		actionssendkeysdelete(uip.Shift4);
		WebElement Shifttxt4=driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[7]/textarea"));
		actionssendkeysdelete(Shifttxt4);
		Thread.sleep(1000);
		tofill(Shifttxt4, Shift4); 
		Thread.sleep(1000);	
		totabkey();

		//Explicit Wait for Reason
		WebDriverWait wait20 = new WebDriverWait(driver,100);
		wait20.until(ExpectedConditions.elementToBeClickable(uip.Reason4));
		Thread.sleep(2000);
		actionssendkeysdelete(uip.Reason4);
		WebElement Reasontxt4=driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[7]/textarea"));
		actionssendkeysdelete(Reasontxt4);
		Thread.sleep(1000);
		tofill(Reasontxt4, Reason4); 
		Thread.sleep(1000);	
		totabkey();
		
		/*  Row 5 -  Insertion	*/
		
		String In5=UBIData.get(RowNumber).get("In5");
		String Out5=UBIData.get(RowNumber).get("Out5");
		String Shift5=UBIData.get(RowNumber).get("Shfit5");
		String Reason5=UBIData.get(RowNumber).get("Reason5");
		
		//Explicit Wait for Clock In
		WebDriverWait wait21 = new WebDriverWait(driver,100);
		wait21.until(ExpectedConditions.elementToBeClickable(uip.ClockIn5));
		Thread.sleep(2000);
		actionssendkeysdelete(uip.ClockIn5);
		WebElement ClockIntxt5=driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[6]/textarea"));
		actionssendkeysdelete(ClockIntxt5);
		Thread.sleep(1000);		
		tofill(ClockIntxt5, In5); 
		Thread.sleep(1000);	
		//toenter();
		totabkey();
		System.out.println("Clockin Enterted");

		//Explicit Wait for Clock Out
		WebDriverWait wait22 = new WebDriverWait(driver,100);
		wait22.until(ExpectedConditions.elementToBeClickable(uip.ClockOut5));
		Thread.sleep(2000);
		actionssendkeysdelete(uip.ClockOut5);
		WebElement ClockOuttxt5=driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[6]/textarea"));
		actionssendkeysdelete(ClockOuttxt5);
		Thread.sleep(1000);
		tofill(ClockOuttxt5, Out5); 
		Thread.sleep(1000);	
		totabkey();

		//Explicit Wait for shift
		WebDriverWait wait23 = new WebDriverWait(driver,100);
		wait23.until(ExpectedConditions.elementToBeClickable(uip.Shift5));
		Thread.sleep(2000);
		actionssendkeysdelete(uip.Shift5);
		WebElement Shifttxt5=driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[7]/textarea"));
		actionssendkeysdelete(Shifttxt5);
		Thread.sleep(1000);
		tofill(Shifttxt5, Shift5); 
		Thread.sleep(1000);	
		totabkey();

		//Explicit Wait for Reason
		WebDriverWait wait24 = new WebDriverWait(driver,100);
		wait24.until(ExpectedConditions.elementToBeClickable(uip.Reason5));
		Thread.sleep(2000);
		actionssendkeysdelete(uip.Reason5);
		WebElement Reasontxt5=driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[7]/textarea"));
		actionssendkeysdelete(Reasontxt5);
		Thread.sleep(1000);
		tofill(Reasontxt5, Reason5); 
		Thread.sleep(1000);	
		totabkey();
	
		//Explicit Wait for Lock
		Thread.sleep(3000);
		WebDriverWait wait25 = new WebDriverWait(driver,100);
		wait25.until(ExpectedConditions.elementToBeClickable(uip.Lock5));
				
		uip.Lock5.click();
		
		Thread.sleep(2000);
				
		Thread.sleep(3000);
		
		Scrolldownjavascript();
        
        System.out.println("Scroll Down ");
        
       /* Actions dragger = new Actions(driver);

        WebElement draggablePartOfScrollbar = driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[1]/div/div/div[1]/table/tbody/tr[1]/td[27]"));

        int numberOfPixelsToDragTheScrollbarRight = 5000;

        dragger.moveToElement(draggablePartOfScrollbar).clickAndHold().moveByOffset(numberOfPixelsToDragTheScrollbarRight ,0).release().perform();
       */
        System.out.println("Scroll Right ");
		Thread.sleep(3000);
		Actions a = new Actions(driver);
        WebElement myElement = new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[1]/div/div/div[1]/table/tbody/tr[1]/td[26]"))));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", myElement);
        a.moveToElement(myElement).click().build().perform();
       
        Thread.sleep(5000);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	@Given("User is on Recalculate Attendance screen")
	public void user_is_on_recalculate_attendance_screen() throws InvalidFormatException, IOException, InterruptedException 
	{
		System.out.println("Recalculate Session");
		
		uip= new UpdateByIndividual_POJO();
		
		Thread.sleep(2000);
		//Explicit Wait for Master
		WebDriverWait wait31 = new WebDriverWait(driver, 100);
		wait31.until(ExpectedConditions.elementToBeClickable(uip.UtilityMenu));
		mouseOver(uip.UtilityMenu);

		WebDriverWait wait32 = new WebDriverWait(driver, 100);
		wait32.until(ExpectedConditions.elementToBeClickable(uip.RecalculateAttendanceMenu));
		toClick(uip.RecalculateAttendanceMenu);
		
	}

	@When("User given the date range and recaulate the attendance for the selected employee {string} and {int}")
	public void user_given_the_date_range_and_recaulate_the_attendance_for_the_selected_employee(String Sheet5, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException, AWTException 
	{
		System.out.println("Recalculate Date Range Process");
		
		uip= new UpdateByIndividual_POJO();
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> UBIData=reader.getData("src\\test\\resources\\Excel File\\Test Data.xlsx",Sheet5);
				
		// Explicit Wait for From Date
		String RAFromDate = UBIData.get(RowNumber).get("Effective From");
		WebDriverWait wait33 = new WebDriverWait(driver, 100);
		wait33.until(ExpectedConditions.elementToBeClickable(uip.RAFromDate));
		Thread.sleep(500);
		actionssendkeysdelete(uip.RAFromDate);
		Thread.sleep(500);
		tofill(uip.RAFromDate, RAFromDate);
		toenter();

		// Explicit Wait for To Date
		String RAToDate = UBIData.get(RowNumber).get("Effective To");
		WebDriverWait wait34 = new WebDriverWait(driver, 100);
		wait34.until(ExpectedConditions.elementToBeClickable(uip.RAToDate));
		Thread.sleep(500);
		actionssendkeysdelete(uip.RAToDate);
		Thread.sleep(500);
		tofill(uip.RAToDate, RAToDate);
		toenter();
				
		// Explicit Wait for RA Employee
		String RAEmployeeName = UBIData.get(RowNumber).get("Employee Name");
		WebDriverWait wait35 = new WebDriverWait(driver, 100);
		wait35.until(ExpectedConditions.elementToBeClickable(uip.RAEmpSearchTxt));
		tofill(uip.RAEmpSearchTxt, RAEmployeeName);
		Thread.sleep(500);
		toClick(uip.RAEmpSearchBtn);
		Thread.sleep(3000);
		WebDriverWait wait36 = new WebDriverWait(driver, 100);
		wait36.until(ExpectedConditions.elementToBeClickable(uip.RAEmpChkBox));
		uip.RAEmpChkBox.click();
		Scrolldownjavascript();
		Thread.sleep(2000);
		WebDriverWait wait37 = new WebDriverWait(driver, 100);
		wait37.until(ExpectedConditions.elementToBeClickable(uip.RARecalcualte));
		toClick(uip.RARecalcualte);
		Thread.sleep(4000);
		System.out.println("Recalculate the Attendance Done");
		Scrollupjavascript();
	
	}

	@Then("User verify the changes in update by individual {string} and {int}")
	public void user_verify_the_changes_in_update_by_individual(String Sheet5, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException, AWTException 
	{
		System.out.println("Recalculate Changes verifing in UBI");
		
		uip= new UpdateByIndividual_POJO();
		
		ExcelReader reader=new ExcelReader();
		
		List<Map<String,String>> UBIData=reader.getData("src\\test\\resources\\Excel File\\Test Data.xlsx",Sheet5);
		
		try
		{
			
		mouseOver(uip.TransactionMenu);

		// Explicit Wait for UpdateByIndividualMenu
		WebDriverWait wait1 = new WebDriverWait(driver, 100);
		wait1.until(ExpectedConditions.elementToBeClickable(uip.UpdateByIndividualMenu));
		toClick(uip.UpdateByIndividualMenu);
		
		//Explicit Wait for Employee
		String EmployeeName=UBIData.get(RowNumber).get("Employee Name");
		WebDriverWait wait2 = new WebDriverWait(driver,100);
		wait2.until(ExpectedConditions.elementToBeClickable(uip.Employee));
		actionssendkeysdelete(uip.Employee);
		tofill(uip.Employee, EmployeeName);
		todown();
		toenter();
		
		//Explicit Wait for From Date
		Thread.sleep(1000);
		String FromDate=UBIData.get(RowNumber).get("Effective From");
		WebDriverWait wait3 = new WebDriverWait(driver,100);
		wait3.until(ExpectedConditions.elementToBeClickable(uip.FromDate));
		Thread.sleep(500);
		actionssendkeysdelete(uip.FromDate);
		Thread.sleep(500);
		tofill(uip.FromDate, FromDate);
		toenter();
		
		//Explicit Wait for To Date
		String ToDate=UBIData.get(RowNumber).get("Effective To");
		WebDriverWait wait4 = new WebDriverWait(driver,100);
		wait4.until(ExpectedConditions.elementToBeClickable(uip.ToDate));
		Thread.sleep(500);
		actionssendkeysdelete(uip.ToDate);
		Thread.sleep(500);
		tofill(uip.ToDate, ToDate);
		toenter();
		
		WebDriverWait wait5 = new WebDriverWait(driver,100);
		wait5.until(ExpectedConditions.elementToBeClickable(uip.Search));
		//Click Search
		Thread.sleep(1000);
		toClick(uip.Search);
		
		//============================== Verification Part =====================//
		
		// OT10   Verification ==>  1
		String OT101Exp="2:00";
		Thread.sleep(3000);
		WebDriverWait wait6 = new WebDriverWait(driver,100);
		wait6.until(ExpectedConditions.elementToBeClickable(uip.OT101));
		toClick(uip.OT101);
		
		WebElement OT101=driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[1]/div/div/div/table/tbody/tr[1]/td[16]"));
		String OT101Act=OT101.getText();
				
		System.out.println("OT10 : Expected: "+OT101Exp+" Actual: "+uip.OT101.getText());
		
		//Soft Validation OT10
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(OT101Exp, OT101Act);
		
		// OT15   Verification ==>  2
		String OT151Exp = "2:00";
		Thread.sleep(3000);
		WebDriverWait wait7 = new WebDriverWait(driver, 100);
		wait7.until(ExpectedConditions.elementToBeClickable(uip.OT151));
		toClick(uip.OT151);

		WebElement OT151 = driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[1]/div/div/div/table/tbody/tr[1]/td[17]"));
		String OT151Act = OT151.getText();

		System.out.println("OT15 : Expected: "+OT151Exp+" Actual: "+uip.OT151.getText());
		//Soft Validation OT10
		soft.assertEquals(OT151Exp, OT151Act);
	
		//  Latness Verification ==>  3
		String LatnessExp = "0:50";
		Thread.sleep(500);
		WebDriverWait wait12 = new WebDriverWait(driver, 100);
		wait12.until(ExpectedConditions.elementToBeClickable(uip.Lateness2));
		toClick(uip.Lateness2);
		
		WebElement Late = driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[1]/div/div/div/table/tbody/tr[2]/td[15]"));
		String LatenessAct = Late.getText();
		
		System.out.println("Latness : Expected: "+LatnessExp+" Actual: "+uip.Lateness2.getText());
		
		soft.assertEquals(LatnessExp, LatenessAct);
		
		//  Under Verification ==>  4
		String UnderExp = "0:50";
		Thread.sleep(500);
		WebDriverWait wait13 = new WebDriverWait(driver, 100);
		wait13.until(ExpectedConditions.elementToBeClickable(uip.Under3));
		toClick(uip.Under3);
		
		WebElement Under = driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[1]/div/div/div/table/tbody/tr[3]/td[14]"));
		String UnderAct = Under.getText();
		
		System.out.println("Under : Expected: "+UnderExp+" Actual: "+uip.Under3.getText());
		soft.assertEquals(UnderExp, UnderAct);
			
		//  OT20 Verification ==>  5
		String OT204Exp = "2:00";
		Thread.sleep(500);
		WebDriverWait wait14 = new WebDriverWait(driver, 100);
		wait14.until(ExpectedConditions.elementToBeClickable(uip.OT204));
		toClick(uip.OT204);
		Thread.sleep(500);
		WebElement OT204 = driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[1]/div/div/div/table/tbody/tr[4]/td[18]"));
		String OT204Act = OT204.getText();

		System.out.println("OT20 : Exp: "+OT204Exp+" Actual: "+uip.OT204.getText());
		soft.assertEquals(OT204Exp, OT204Act);
			
		//  OT30 Verification ==>  6
		String OT304Exp = "5:50";
		Thread.sleep(500);
		WebDriverWait wait15 = new WebDriverWait(driver, 100);
		wait15.until(ExpectedConditions.elementToBeClickable(uip.OT304));
		toClick(uip.OT304);
		
		WebElement OT304 = driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[1]/div/div/div/table/tbody/tr[4]/td[19]"));
		String OT304Act = OT304.getText();
		
		System.out.println("OT30 : Expected: "+OT304Exp+" Actual: "+uip.OT304.getText());
		soft.assertEquals(OT304Exp, OT304Act);
		
		//Scroll Right
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		WebElement myElement = new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[1]/div/div/div/table/tbody/tr[1]/td[28]"))));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", myElement);
        a.moveToElement(myElement).build().perform();
 
		// Meal Allowance Verification ==>  7
		String MealAwl1Exp = "100.00";
		Thread.sleep(500);
		
		WebElement MealAwl = driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[1]/div/div/div/table/tbody/tr[1]/td[24]"));
		String MealAwl1Act = MealAwl.getText();
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", MealAwl);
        a.moveToElement(MealAwl).click().build().perform();
        Thread.sleep(5000);
        
        System.out.println("Meal Allowance : Expected: "+MealAwl1Exp+" Actual: "+MealAwl1Act);
        
        soft.assertEquals(MealAwl1Exp, MealAwl1Act);
		totabkey();
		
		// Transport Allowance Verification ==>  8
		String TransportAwl1Exp = "150.00";
		Thread.sleep(500);
		WebElement TransportAwl = driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[1]/div/div/div/table/tbody/tr[1]/td[25]"));
		
		String TransportAwlAct = TransportAwl.getText();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", TransportAwl);
        a.moveToElement(TransportAwl).click().build().perform();
        System.out.println("Transport Allowance : Expected: "+TransportAwl1Exp+" Actual: "+TransportAwlAct);

        soft.assertEquals(TransportAwl1Exp, TransportAwlAct);
		
		// Health Allowance Verification ==>  9
		String HealthAwl1Exp = "250.00";
		Thread.sleep(500);
		WebElement HealthAwl = driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[1]/div/div/div/table/tbody/tr[1]/td[26]"));

		String HealthAwlAct = HealthAwl.getText();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", HealthAwl);
        a.moveToElement(HealthAwl).click().build().perform();
        System.out.println("Health Allowance : Expected: "+HealthAwl1Exp+" Actual: "+HealthAwlAct);
        soft.assertEquals(HealthAwl1Exp, HealthAwlAct);
		
		// Other1 Allowance Verification ==>  10
		String Other1Awl1Exp = "150.00";
		Thread.sleep(500);
		WebElement Other1Awl = driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[1]/div/div/div/table/tbody/tr[1]/td[27]"));

		String OtherAwl1Act = Other1Awl.getText();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", Other1Awl);
        a.moveToElement(Other1Awl).click().build().perform();
        System.out.println("Other Allowance : Expected: "+Other1Awl1Exp+" Actual: "+OtherAwl1Act);
        soft.assertEquals(Other1Awl1Exp, OtherAwl1Act);
        
        soft.assertAll();
				
		//============================== Filter Section =====================//
		
		uip.Late.click();
		Thread.sleep(3000);
		uip.Late.click();
		
		uip.Under.click();
		Thread.sleep(3000);
		uip.Under.click();
		
		uip.Absent.click();
		Thread.sleep(3000);
		uip.Absent.click();
		
		uip.Insufficient.click();
		Thread.sleep(3000);
		uip.Insufficient.click();
		
		System.out.println("Filter Section Executed");
		
		//Explicit Wait for Lock
		WebDriverWait wait25 = new WebDriverWait(driver, 100);
		wait25.until(ExpectedConditions.elementToBeClickable(uip.Lock5));
		Thread.sleep(2000);

		//Unlock the 5th row
		uip.Lock5.click();
		System.out.println("07-01-2022 is unlocked");

		Thread.sleep(2000);
		
	}
	catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

	@Given("User is on basic employee master screen")
	public void user_is_on_basic_employee_master_screen() 
	{
		System.out.println("User Is On Employee Master");
		
		uip= new UpdateByIndividual_POJO();
		
		//Explicit Wait for Master
		WebDriverWait wait21 = new WebDriverWait(driver, 100);
		wait21.until(ExpectedConditions.elementToBeClickable(uip.Master));
		mouseOver(uip.Master);

		WebDriverWait wait22 = new WebDriverWait(driver, 100);
		wait22.until(ExpectedConditions.elementToBeClickable(uip.BasicEmployeeMaster));
		toClick(uip.BasicEmployeeMaster);
	    
	}

	@When("User Change the shift and ot settings {string} and {int}")
	public void user_change_the_shift_and_ot_settings(String Sheet5, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException
	{
		System.out.println("Employee Master Change");
		
		uip= new UpdateByIndividual_POJO();
		
		ExcelReader reader=new ExcelReader();
		
		List<Map<String,String>> UBIData=reader.getData("src\\test\\resources\\Excel File\\Test Data.xlsx",Sheet5);
		
		
		//Explicit Wait for Employee
		String EmployeeNameMaster=UBIData.get(RowNumber).get("Employee Name");
		
		WebDriverWait wait23 = new WebDriverWait(driver,100);
		wait23.until(ExpectedConditions.elementToBeClickable(uip.EmpSrchTxt));
		actionssendkeysdelete(uip.EmpSrchTxt);
		tofill(uip.EmpSrchTxt, EmployeeNameMaster);
		
		WebDriverWait wait24 = new WebDriverWait(driver,100);
		wait24.until(ExpectedConditions.elementToBeClickable(uip.EmpSrchButton));
		toClick(uip.EmpSrchButton);
		
		Thread.sleep(3000);
		WebDriverWait wait25 = new WebDriverWait(driver,100);
		wait25.until(ExpectedConditions.elementToBeClickable(uip.EmpEditButton));
		toClick(uip.EmpEditButton);
		
		
		String PartOrFlexi=UBIData.get(RowNumber).get("PartOrFlexi");
		
		//Change nature of employee to flexi instead of Null
		Thread.sleep(2000);
		WebDriverWait wait31 = new WebDriverWait(driver,100);
		wait31.until(ExpectedConditions.elementToBeClickable(uip.DllPartFlexi));
		toselectbyvisibletext(uip.DllPartFlexi, PartOrFlexi);
		
		Scrolldownjavascript();
		
		Thread.sleep(2000);
		WebDriverWait wait26 = new WebDriverWait(driver,100);
		wait26.until(ExpectedConditions.elementToBeClickable(uip.EmpUpdateBtn));
		toClick(uip.EmpUpdateBtn);
		
		Thread.sleep(2000);
		Scrollupjavascript();
		
		System.out.println("General Section Updated");
		
		//Click Edit
		Thread.sleep(2000);
		WebDriverWait wait27 = new WebDriverWait(driver,100);
		wait27.until(ExpectedConditions.elementToBeClickable(uip.EmpEditButton));
		toClick(uip.EmpEditButton);
		
		//Click TMS Tab
		Thread.sleep(2000);
		WebDriverWait wait28 = new WebDriverWait(driver,100);
		wait28.until(ExpectedConditions.elementToBeClickable(uip.EmpTMSTab));
		toClick(uip.EmpTMSTab);
		
		String OTType=UBIData.get(RowNumber).get("OT Type");
		
		//Change the employee OT Type to Felxi and Rate
		WebDriverWait wait32 = new WebDriverWait(driver,100);
		wait32.until(ExpectedConditions.elementToBeClickable(uip.DllOTType));
		toselectbyvisibletext(uip.DllOTType, OTType);
		
		String FlexiRate=UBIData.get(RowNumber).get("PartOrFlexi Rate");
		WebDriverWait wait33 = new WebDriverWait(driver,100);
		wait33.until(ExpectedConditions.elementToBeClickable(uip.flatrate));
		tofill(uip.flatrate, FlexiRate);
		
		//Change the employee Shift
		String EmpShift=UBIData.get(RowNumber).get("Emp Shift");
		WebDriverWait wait29 = new WebDriverWait(driver,100);
		wait29.until(ExpectedConditions.elementToBeClickable(By.xpath("//option[contains(text(),'"+EmpShift+"')]")));
		
		driver.findElement(By.xpath("//option[contains(text(),'"+EmpShift+"')]")).click();
		
		Scrolldownjavascript();
		
		Thread.sleep(1000);
		WebDriverWait wait30 = new WebDriverWait(driver,100);
		wait30.until(ExpectedConditions.elementToBeClickable(uip.EmpUpdateBtn));
		toClick(uip.EmpUpdateBtn);
		
		Scrollupjavascript();
		
		System.out.println("TMS Section Updated");
		
	}

	@Then("User navigate to purge and reprocess screen {string} and {int}")
	public void user_navigate_to_purge_and_reprocess_screen(String Sheet5, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException, AWTException
	{
		System.out.println("Purge and Reprocess Section");
		
		uip= new UpdateByIndividual_POJO();
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> UBIData=reader.getData("src\\test\\resources\\Excel File\\Test Data.xlsx",Sheet5);
			
		try
		{
			Thread.sleep(2000);
			//Explicit Wait for Master
			WebDriverWait wait31 = new WebDriverWait(driver, 100);
			wait31.until(ExpectedConditions.elementToBeClickable(uip.UtilityMenu));
			mouseOver(uip.UtilityMenu);

			WebDriverWait wait32 = new WebDriverWait(driver, 100);
			wait32.until(ExpectedConditions.elementToBeClickable(uip.RecalculateAttendanceMenu));
			toClick(uip.RecalculateAttendanceMenu);
			
			// Explicit Wait for From Date
			String RAFromDate = UBIData.get(RowNumber).get("Effective From");
			WebDriverWait wait33 = new WebDriverWait(driver, 100);
			wait33.until(ExpectedConditions.elementToBeClickable(uip.RAFromDate));
			Thread.sleep(500);
			actionssendkeysdelete(uip.RAFromDate);
			Thread.sleep(500);
			tofill(uip.RAFromDate, RAFromDate);
			toenter();

			// Explicit Wait for To Date
			String RAToDate = UBIData.get(RowNumber).get("Effective To");
			WebDriverWait wait34 = new WebDriverWait(driver, 100);
			wait34.until(ExpectedConditions.elementToBeClickable(uip.RAToDate));
			Thread.sleep(500);
			actionssendkeysdelete(uip.RAToDate);
			Thread.sleep(500);
			tofill(uip.RAToDate, RAToDate);
			toenter();
					
			// Explicit Wait for RA Employee
			String RAEmployeeName = UBIData.get(RowNumber).get("Employee Name");
			WebDriverWait wait35 = new WebDriverWait(driver, 100);
			wait35.until(ExpectedConditions.elementToBeClickable(uip.RAEmpSearchTxt));
			tofill(uip.RAEmpSearchTxt, RAEmployeeName);
			Thread.sleep(500);
			toClick(uip.RAEmpSearchBtn);
			Thread.sleep(3000);
			WebDriverWait wait36 = new WebDriverWait(driver, 100);
			wait36.until(ExpectedConditions.elementToBeClickable(uip.RAEmpChkBox));
			uip.RAEmpChkBox.click();
			Scrolldownjavascript();
			Thread.sleep(2000);
			WebDriverWait wait37 = new WebDriverWait(driver, 100);
			wait37.until(ExpectedConditions.elementToBeClickable(uip.RARecalcualte));
			toClick(uip.RARecalcualte);
			Thread.sleep(4000);
			System.out.println("Recalculate the Attendance Done");
			Scrollupjavascript();

			Thread.sleep(4000);
			
		// ====================== Update By Individual Screen =========================== //
		mouseOver(uip.TransactionMenu);
		
		// Explicit Wait for UpdateByIndividualMenu
		WebDriverWait wait1 = new WebDriverWait(driver, 100);
		wait1.until(ExpectedConditions.elementToBeClickable(uip.UpdateByIndividualMenu));
		toClick(uip.UpdateByIndividualMenu);

		// Explicit Wait for Employee
		String EmployeeName = UBIData.get(RowNumber).get("Employee Name");
		WebDriverWait wait2 = new WebDriverWait(driver, 100);
		wait2.until(ExpectedConditions.elementToBeClickable(uip.Employee));
		actionssendkeysdelete(uip.Employee);
		tofill(uip.Employee, EmployeeName);
		todown();
		toenter();

		// Explicit Wait for From Date
		Thread.sleep(1000);
		String FromDate = UBIData.get(RowNumber).get("Effective From");
		WebDriverWait wait3 = new WebDriverWait(driver, 100);
		wait3.until(ExpectedConditions.elementToBeClickable(uip.FromDate));
		Thread.sleep(500);
		actionssendkeysdelete(uip.FromDate);
		Thread.sleep(500);
		tofill(uip.FromDate, FromDate);
		toenter();

		// Explicit Wait for To Date
		String ToDate = UBIData.get(RowNumber).get("Effective To");
		WebDriverWait wait4 = new WebDriverWait(driver, 100);
		wait4.until(ExpectedConditions.elementToBeClickable(uip.ToDate));
		Thread.sleep(500);
		actionssendkeysdelete(uip.ToDate);
		Thread.sleep(500);
		tofill(uip.ToDate, ToDate);
		toenter();

		WebDriverWait wait5 = new WebDriverWait(driver, 100);
		wait5.until(ExpectedConditions.elementToBeClickable(uip.Search));
		// Click Search
		Thread.sleep(1000);
		toClick(uip.Search);
		Thread.sleep(3000);
		
		// Flat Verification ==>  11
		String FlatExp = "3:00";
		Thread.sleep(3000);
		WebDriverWait wait91 = new WebDriverWait(driver, 100);
		wait91.until(ExpectedConditions.elementToBeClickable(uip.Flat));
		toClick(uip.Flat);

		WebElement Flat = driver.findElement(By.xpath("//*[@id=\"dhot\"]/div[1]/div/div/div/table/tbody/tr[1]/td[20]"));
		String FlatActual = Flat.getText();

		System.out.println("Flat : Expected: " + FlatExp + " Actual: " + uip.Flat.getText());

		SoftAssert soft = new SoftAssert();
		soft.assertEquals(FlatExp, FlatActual);
		
		Thread.sleep(1000);
		unSelectcheckbox(uip.Lock5);
		
		//==================== Purge And Process ==========================//
		
		//Explicit Wait for Master
		WebDriverWait wait71 = new WebDriverWait(driver, 100);
		wait71.until(ExpectedConditions.elementToBeClickable(uip.UtilityMenu));
		mouseOver(uip.UtilityMenu);
		
		// Explicit Wait for Purge And Process Menu
		WebDriverWait wait72 = new WebDriverWait(driver, 100);
		wait72.until(ExpectedConditions.elementToBeClickable(uip.PurgeAndReprocessMenu));
		toClick(uip.PurgeAndReprocessMenu);
		
		// Explicit Wait for From Date
		String PRFromDate = UBIData.get(RowNumber).get("Effective From");
		WebDriverWait wait73 = new WebDriverWait(driver, 100);
		wait73.until(ExpectedConditions.elementToBeClickable(uip.PRFromDate));
		Thread.sleep(500);
		actionssendkeysdelete(uip.PRFromDate);
		Thread.sleep(500);
		tofill(uip.PRFromDate, PRFromDate);
		toenter();

		// Explicit Wait for To Date
		String PRToDate = UBIData.get(RowNumber).get("Effective To");
		WebDriverWait wait74 = new WebDriverWait(driver, 100);
		wait74.until(ExpectedConditions.elementToBeClickable(uip.PRToDate));
		Thread.sleep(500);
		actionssendkeysdelete(uip.PRToDate);
		Thread.sleep(500);
		tofill(uip.PRToDate, PRToDate);
		toenter();
				
		// Explicit Wait for RA Employee
		String PREmployeeName = UBIData.get(RowNumber).get("Employee Name");
		WebDriverWait wait75 = new WebDriverWait(driver, 100);
		wait75.until(ExpectedConditions.elementToBeClickable(uip.PREmpSrchTxt));
		tofill(uip.PREmpSrchTxt, PREmployeeName);
		Thread.sleep(1000);
		WebDriverWait wait76 = new WebDriverWait(driver, 100);
		wait76.until(ExpectedConditions.elementToBeClickable(uip.PREmpSrchBtn));
		toClick(uip.PREmpSrchBtn);
		
		Thread.sleep(2000);
		WebDriverWait wait77 = new WebDriverWait(driver, 100);
		wait77.until(ExpectedConditions.elementToBeClickable(uip.PRPurgeChkBox));
		uip.PRPurgeChkBox.click();
		
		Thread.sleep(2000);
		WebDriverWait wait78 = new WebDriverWait(driver, 100);
		wait78.until(ExpectedConditions.elementToBeClickable(uip.PRReprocessChkBox));
		uip.PRReprocessChkBox.click();
		
		Thread.sleep(2000);
		WebDriverWait wait79 = new WebDriverWait(driver, 100);
		wait79.until(ExpectedConditions.elementToBeClickable(uip.PREmpChkBox));
		uip.PREmpChkBox.click();
		
		Scrolldownjavascript();
		
		Thread.sleep(1000);
		WebDriverWait wait40 = new WebDriverWait(driver, 100);
		wait40.until(ExpectedConditions.elementToBeClickable(uip.PRProcessBtn));
		toClick(uip.PRProcessBtn);
		Thread.sleep(3000);
		Scrollupjavascript();
		System.out.println("Purge Reprocess Done");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Then("User Verify the change in Update By Individual Screen {string} and {int}")
	public void user_verify_the_change_in_update_by_individual_screen(String Sheet5, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException, AWTException
	{
		System.out.println("Recalculate Changes verifing in UBI");
		
		uip= new UpdateByIndividual_POJO();
		
		ExcelReader reader=new ExcelReader();
		
		List<Map<String,String>> UBIData=reader.getData("src\\test\\resources\\Excel File\\Test Data.xlsx",Sheet5);
		
		try
		{
			
		mouseOver(uip.TransactionMenu);

		// Explicit Wait for UpdateByIndividualMenu
		WebDriverWait wait1 = new WebDriverWait(driver, 100);
		wait1.until(ExpectedConditions.elementToBeClickable(uip.UpdateByIndividualMenu));
		toClick(uip.UpdateByIndividualMenu);
		
		//Explicit Wait for Employee
		String EmployeeName=UBIData.get(RowNumber).get("Employee Name");
		WebDriverWait wait2 = new WebDriverWait(driver,100);
		wait2.until(ExpectedConditions.elementToBeClickable(uip.Employee));
		actionssendkeysdelete(uip.Employee);
		tofill(uip.Employee, EmployeeName);
		todown();
		toenter();
		
		//Explicit Wait for From Date
		String FromDate=UBIData.get(RowNumber).get("Effective From");
		WebDriverWait wait3 = new WebDriverWait(driver,100);
		wait3.until(ExpectedConditions.elementToBeClickable(uip.FromDate));
		Thread.sleep(500);
		actionssendkeysdelete(uip.FromDate);
		Thread.sleep(500);
		tofill(uip.FromDate, FromDate);
		toenter();
		
		//Explicit Wait for To Date
		String ToDate=UBIData.get(RowNumber).get("Effective To");
		WebDriverWait wait4 = new WebDriverWait(driver,100);
		wait4.until(ExpectedConditions.elementToBeClickable(uip.ToDate));
		Thread.sleep(500);
		actionssendkeysdelete(uip.ToDate);
		Thread.sleep(500);
		tofill(uip.ToDate, ToDate);
		toenter();
		
		//Click Search
		Thread.sleep(1000);
		toClick(uip.Search);
		Thread.sleep(3000);
		
		
		
		
	}
	catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	
}
