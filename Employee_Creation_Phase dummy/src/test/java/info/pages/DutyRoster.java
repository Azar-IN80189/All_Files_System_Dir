package info.pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import info.base.Reusableclass;
import info.pom.AutoshiftNew_POJO;
import info.pom.Dutyroster_New_POJO;
import info.pom.User_POJO;
import info.utility.ExcelReader;
import io.cucumber.java.en.Given;

public class DutyRoster extends Reusableclass
{
	AutoshiftNew_POJO asp;
	User_POJO usp;
	Dutyroster_New_POJO drp;
		

@Given("User enter the employee code, employee name {string} and shift details {int}")
public void user_enter_the_employee_code_employee_name_and_shift_details(String SheetName1, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException, AWTException 
{
	ExcelReader reader=new ExcelReader();
	drp=new Dutyroster_New_POJO();
	asp=new AutoshiftNew_POJO();
		
	//clicking shift settings using selector option for click by mouse
	toClick(asp.Shiftsetting);
	toClick(drp.DutyrosterMenu);
	System.out.println("Duty Roster Page Is Opened");
	toClick(drp.NewDutyroster);
	
	
	
	List<Map<String,String>> DutyData=reader.getData("src/test/resources/Excel/Automation.xlsx", SheetName1);
	toClick(drp.DutyrosterCode);
	String DutyCode=DutyData.get(RowNumber).get("Duty Roster Code");
	
	tofill(drp.DutyrosterCode, DutyCode);
	Thread.sleep(1000);
	
	toClick(drp.DutyrosterName);
	String DutyName=DutyData.get(RowNumber).get("Duty Roster Name");
	tofill(drp.DutyrosterName, DutyName);
		
	String EffectiveFrom=DutyData.get(RowNumber).get("Effective From");
	actionssendkeysdelete(drp.DREffectiveFrom);
	tofill(drp.DREffectiveFrom, EffectiveFrom);
	toenter();
	
	String RecurrenceDays=DutyData.get(RowNumber).get("Recurrence Days");
	String GroupInvolved=DutyData.get(RowNumber).get("Group Involved");
	
	toselectbyvisibletext(drp.DRRecurrenceDays, RecurrenceDays);
	toselectbyvisibletext(drp.DRGroupinvolved, GroupInvolved);
	

	try//Try Block
	{
		//Row 1 Drop Selection Block
		
		//Row 1
		//G1DR1
		String DD1R0=DutyData.get(RowNumber).get("G1DR1");
		System.out.println(DD1R0);
		
		Thread.sleep(500);
		WebDriverWait wait1 = new WebDriverWait(driver,100);
		wait1.until(ExpectedConditions.elementToBeClickable(drp.DD1R0));
		toClick(drp.DD1R0);
		
		Thread.sleep(500);
		
		WebDriverWait wait24 = new WebDriverWait(driver,100);
		wait24.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='ContentPlaceHolder1_gvFirstWeek_ddlShift2_3']/option[contains(text(), '"+DD1R0+"')]")));
		driver.findElement(By.xpath("//select[@id='ContentPlaceHolder1_gvFirstWeek_ddlShift0_0']/option[contains(text(), '"+DD1R0+"')]")).click();
		System.out.println(DD1R0);
		Thread.sleep(1000);
		
		//G1DR2
		String DD1R1=DutyData.get(RowNumber).get("G1DR2");
		System.out.println(DD1R1);
		
		Thread.sleep(2000);
		WebDriverWait wait2 = new WebDriverWait(driver,100);
		wait2.until(ExpectedConditions.elementToBeClickable(drp.DD1R1));
		toClick(drp.DD1R1);
		
		Thread.sleep(500);
		
		WebDriverWait wait23 = new WebDriverWait(driver,100);
		wait23.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='ContentPlaceHolder1_gvFirstWeek_ddlShift2_3']/option[contains(text(), '"+DD1R1+"')]")));
		driver.findElement(By.xpath("//select[@id='ContentPlaceHolder1_gvFirstWeek_ddlShift1_0']/option[contains(text(), '"+DD1R1+"')]")).click();
		System.out.println(DD1R1);
		Thread.sleep(2000);
		
		//G1DR3
		String DD1R2=DutyData.get(RowNumber).get("G1DR3");
		System.out.println(DD1R2);
		
		Thread.sleep(2000);
		WebDriverWait wait3 = new WebDriverWait(driver,100);
		wait3.until(ExpectedConditions.elementToBeClickable(drp.DD1R2));
		toClick(drp.DD1R2);
				
		Thread.sleep(500);
		
		WebDriverWait wait22 = new WebDriverWait(driver,100);
		wait22.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='ContentPlaceHolder1_gvFirstWeek_ddlShift2_3']/option[contains(text(), '"+DD1R2+"')]")));
		driver.findElement(By.xpath("//select[@id='ContentPlaceHolder1_gvFirstWeek_ddlShift2_0']/option[contains(text(), '"+DD1R2+"')]")).click();
		System.out.println(DD1R2);
		Thread.sleep(2000);
		
		
		//Row 2
		//G2DR1
		String DD2R0=DutyData.get(RowNumber).get("G2DR1");
		System.out.println(DD2R0);

		Thread.sleep(2000);
		WebDriverWait wait4 = new WebDriverWait(driver,100);
		wait2.until(ExpectedConditions.elementToBeClickable(drp.DD2R0));
		toClick(drp.DD2R0);
		
		Thread.sleep(500);
		
		WebDriverWait wait21 = new WebDriverWait(driver,100);
		wait21.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='ContentPlaceHolder1_gvFirstWeek_ddlShift2_3']/option[contains(text(), '"+DD2R0+"')]")));
		driver.findElement(By.xpath("//select[@id='ContentPlaceHolder1_gvFirstWeek_ddlShift0_1']/option[contains(text(), '"+DD2R0+"')]")).click();
		System.out.println(DD2R0);
		Thread.sleep(2000);

		//G2DR2
		String DD2R1=DutyData.get(RowNumber).get("G2DR2");
		System.out.println(DD2R1);
		
		Thread.sleep(2000);
		WebDriverWait wait5 = new WebDriverWait(driver,100);
		wait5.until(ExpectedConditions.elementToBeClickable(drp.DD2R1));
		toClick(drp.DD2R1);

		Thread.sleep(500);
		
		WebDriverWait wait20 = new WebDriverWait(driver,100);
		wait20.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='ContentPlaceHolder1_gvFirstWeek_ddlShift2_3']/option[contains(text(), '"+DD2R1+"')]")));
		driver.findElement(By.xpath("//select[@id='ContentPlaceHolder1_gvFirstWeek_ddlShift1_1']/option[contains(text(), '"+DD2R1+"')]")).click();
		System.out.println(DD2R1);
		Thread.sleep(2000);
		//G2DR3
		String DD2R2=DutyData.get(RowNumber).get("G2DR3");
		System.out.println(DD2R2);
		
		Thread.sleep(2000);
		WebDriverWait wait6 = new WebDriverWait(driver,100);
		wait6.until(ExpectedConditions.elementToBeClickable(drp.DD2R2));
		toClick(drp.DD2R2);
		
		Thread.sleep(500);
		WebDriverWait wait19 = new WebDriverWait(driver,100);
		wait19.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='ContentPlaceHolder1_gvFirstWeek_ddlShift2_3']/option[contains(text(), '"+DD2R2+"')]")));
		driver.findElement(By.xpath("//select[@id='ContentPlaceHolder1_gvFirstWeek_ddlShift2_1']/option[contains(text(), '"+DD2R2+"')]")).click();
		System.out.println(DD2R2);
		
		Thread.sleep(2000);
		
		//Row 3
		//G3DR1
		
		String DD3R0=DutyData.get(RowNumber).get("G3DR1");
		System.out.println(DD3R0);

		Thread.sleep(2000);
		WebDriverWait wait7 = new WebDriverWait(driver,100);
		wait7.until(ExpectedConditions.elementToBeClickable(drp.DD3R0));
		toClick(drp.DD3R0);
		System.out.println("Row 3");
		
		Thread.sleep(500);
		
		WebDriverWait wait18 = new WebDriverWait(driver,100);
		wait18.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='ContentPlaceHolder1_gvFirstWeek_ddlShift2_3']/option[contains(text(), '"+DD3R0+"')]")));
		driver.findElement(By.xpath("//select[@id='ContentPlaceHolder1_gvFirstWeek_ddlShift0_2']/option[contains(text(), '"+DD3R0+"')]")).click();
		System.out.println(DD3R0);
		Thread.sleep(2000);

		//G3DR2
		String DD3R1=DutyData.get(RowNumber).get("G3DR2");
		System.out.println(DD3R1);
		
		
		Thread.sleep(2000);
		WebDriverWait wait8 = new WebDriverWait(driver,100);
		wait8.until(ExpectedConditions.elementToBeClickable(drp.DD3R1));
		toClick(drp.DD3R1);
		
		Thread.sleep(500);
		
		WebDriverWait wait17 = new WebDriverWait(driver,100);
		wait17.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='ContentPlaceHolder1_gvFirstWeek_ddlShift2_3']/option[contains(text(), '"+DD3R1+"')]")));
		
		driver.findElement(By.xpath("//select[@id='ContentPlaceHolder1_gvFirstWeek_ddlShift1_2']/option[contains(text(), '"+DD3R1+"')]")).click();
		System.out.println(DD3R1);
		Thread.sleep(2000);

		//G3DR3
		String DD3R2=DutyData.get(RowNumber).get("G3DR3");
		System.out.println(DD3R2);

		Thread.sleep(2000);
		WebDriverWait wait9 = new WebDriverWait(driver,100);
		wait9.until(ExpectedConditions.elementToBeClickable(drp.DD3R2));
		toClick(drp.DD3R2);

		Thread.sleep(500);
		
		WebDriverWait wait16 = new WebDriverWait(driver,100);
		wait16.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='ContentPlaceHolder1_gvFirstWeek_ddlShift2_3']/option[contains(text(), '"+DD3R2+"')]")));
		
		driver.findElement(By.xpath("//select[@id='ContentPlaceHolder1_gvFirstWeek_ddlShift2_2']/option[contains(text(), '"+DD3R2+"')]")).click();
		System.out.println(DD3R2);
		Thread.sleep(2000);
		//Row 4
		//G4DR1
		String DD4R0=DutyData.get(RowNumber).get("G4DR1");
		System.out.println(DD4R0);

		Thread.sleep(2000);
		WebDriverWait wait10 = new WebDriverWait(driver,100);
		wait10.until(ExpectedConditions.elementToBeClickable(drp.DD4R0));
		toClick(drp.DD4R0);

		Thread.sleep(500);
		
		WebDriverWait wait15 = new WebDriverWait(driver,100);
		wait15.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='ContentPlaceHolder1_gvFirstWeek_ddlShift2_3']/option[contains(text(), '"+DD4R0+"')]")));
		driver.findElement(By.xpath("//select[@id='ContentPlaceHolder1_gvFirstWeek_ddlShift0_3']/option[contains(text(), '"+DD4R0+"')]")).click();
		System.out.println(DD4R0);
		Thread.sleep(2000);

		//G4DR2
		String DD4R1=DutyData.get(RowNumber).get("G4DR2");
		System.out.println(DD4R1);

		Thread.sleep(2000);
		WebDriverWait wait11 = new WebDriverWait(driver,100);
		wait11.until(ExpectedConditions.elementToBeClickable(drp.DD4R1));
		toClick(drp.DD4R1);

		Thread.sleep(500);
		
		WebDriverWait wait14 = new WebDriverWait(driver,100);
		wait14.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='ContentPlaceHolder1_gvFirstWeek_ddlShift2_3']/option[contains(text(), '"+DD4R1+"')]")));
		driver.findElement(By.xpath("//select[@id='ContentPlaceHolder1_gvFirstWeek_ddlShift1_3']/option[contains(text(), '"+DD4R1+"')]")).click();
		System.out.println(DD4R1);
		Thread.sleep(2000);

		//G2DR3
		String DD4R2=DutyData.get(RowNumber).get("G4DR3");
		System.out.println(DD4R2);

		Thread.sleep(2000);
		WebDriverWait wait12 = new WebDriverWait(driver,100);
		wait12.until(ExpectedConditions.elementToBeClickable(drp.DD4R2));
		toClick(drp.DD4R2);

		Thread.sleep(2000);
		WebDriverWait wait13 = new WebDriverWait(driver,100);
		wait13.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='ContentPlaceHolder1_gvFirstWeek_ddlShift2_3']/option[contains(text(), '"+DD4R2+"')]")));
		
		driver.findElement(By.xpath("//select[@id='ContentPlaceHolder1_gvFirstWeek_ddlShift2_3']/option[contains(text(), '"+DD4R2+"')]")).click();
		System.out.println(DD4R2);
		Thread.sleep(2000);
		//Save
		Scrolldownjavascript();
		Scrolldownjavascript();
		Thread.sleep(2000);
		WebDriverWait wait25 = new WebDriverWait(driver,100);
		wait25.until(ExpectedConditions.elementToBeClickable(drp.DRSaveButton));
		//toClick(drp.DRSaveButton);
		clickjavascript(drp.DRSaveButton);
	}
	catch(Exception e)
	{
	System.out.println("Error Message:"+e);
	}
	
	}//Method Closing

}//Class Closing



