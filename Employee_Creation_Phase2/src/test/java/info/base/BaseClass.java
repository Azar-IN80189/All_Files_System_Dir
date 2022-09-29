package info.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Actions ac;
	public static Robot r;
	public static JavascriptExecutor js;
	public static Select s;

	public static void browserLaunch() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
	}

	public static void actionssendkeysdelete(WebElement element) {

		Actions a=new Actions(driver);
		a.moveToElement(element).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();

	}
	public static void launchUrl(String url) {

		driver.get(url);

	}
	public static void Scrolldownjavascript() {

		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");

	}
	public void deletecookies() {

		driver.manage().deleteAllCookies();

	}
	public static void Scrollmiddlejavascript() {

		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");

	}

	public static void toMaximize() {
		driver.manage().window().maximize();

	}

	public static String pageTitle() {

		String title = driver.getTitle();
		return title;

	}

	public static String pageUrl() {

		String url = driver.getCurrentUrl();
		return url;

	}
	public static void Pageloadtimeout() {
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}

	public static void toFill(WebElement element, String value) {

		element.sendKeys(value);
	}


	public static void toClick(WebElement element) {

		element.click();
	}

	public static void closeBrowser() {

		driver.close();

	}

	public static void quitbrowser() {

		driver.quit();

	}
	//	public static String excelReadValue(String Sheetname, int rownum, int cellnum) throws IOException {
	//
	//		File f = new File("C:\\Users\\Azarudeen\\eclipse-workspace\\UserCreationDemo\\src\\test\\resources\\Excel\\Automation.xlsx");
	//
	//		FileInputStream input = new FileInputStream(f);
	//
	//		Workbook wb = new XSSFWorkbook(input);
	//
	//		Sheet s = wb.getSheet(Sheetname);
	//
	//		String value = null;
	//
	//		Row r = s.getRow(rownum);
	//
	//		Cell c = r.getCell(cellnum);
	//
	//		int cellType = c.getCellType();
	//
	//		if(cellType == 1)
	//		{
	//			value = c.getStringCellValue();
	//		}
	//		else {
	//			double d = c.getNumericCellValue();
	//			long l = (long)d;
	//			value = String.valueOf(l);
	//		}
	//
	//
	//		return value;
	//
	//	}


	public static int getRowcount(String sheetname) throws IOException {

		File f =new File("C:\\Users\\Azarudeen\\eclipse-workspace\\UserCreationDemo\\src\\test\\resources\\Excel\\Automation.xlsx");

		FileInputStream input =new FileInputStream(f);

		XSSFWorkbook wb = new XSSFWorkbook(input);

		XSSFSheet s = wb.getSheet(sheetname);

		int rowcount = s.getLastRowNum();

		input.close();
		wb.close();
		return rowcount;


	}


	public static int getCellcount(String sheetname, int rownum) throws IOException {

		File f =new File("C:\\Users\\Azarudeen\\eclipse-workspace\\UserCreationDemo\\src\\test\\resources\\Excel\\Automation.xlsx");

		FileInputStream input =new FileInputStream(f);

		XSSFWorkbook wb = new XSSFWorkbook(input);

		XSSFSheet s = wb.getSheet(sheetname);

		XSSFRow r = s.getRow(rownum);

		int cellcount = r.getLastCellNum();

		input.close();
		wb.close();
		return cellcount;


	}

	public static String togettext(WebElement element) {

		String txt = element.getText();
		return txt;

	}

	public static String toGetAttributevalue(WebElement element) {

		String attribute = element.getAttribute("value");
		return attribute;

	}

	public static void tomovethecursor(WebElement element) {

		ac = new Actions(driver);
		ac.moveToElement(element).perform();

	}

	public static void todraganddrop(WebElement source, WebElement target) {

		ac = new Actions(driver);
		ac.dragAndDrop(source, target).perform();

	}

	public static void todoubleclick(WebElement element) {

		ac = new Actions(driver);
		ac.doubleClick(element).perform();

	}

	public static void tocontextclick(WebElement element) {

		ac = new Actions(driver);
		ac.contextClick(element).perform();

	}

	public static void tokeyup(WebElement element, CharSequence value) {

		ac = new Actions(driver);
		ac.keyUp(element, value);

	}

	public static void tokeydown(WebElement element, String value) {

		ac = new Actions(driver);
		ac.keyDown(element, value);

	}

	public static void toshiftkey() throws AWTException {

		r = new Robot();
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_SHIFT);

	}

	public static void totabkey() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

	}

	public static void toselectall() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);

	}

	public static void tocut() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);

	}

	public static void tocopy() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);

	}

	public static void toundo() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_Z);
		r.keyRelease(KeyEvent.VK_Z);
		r.keyRelease(KeyEvent.VK_CONTROL);

	}

	public static void toredo() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_Y);
		r.keyRelease(KeyEvent.VK_Y);
		r.keyRelease(KeyEvent.VK_CONTROL);

	}

	public static void topaste() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);

	}

	public static void todown() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

	}

	public static void toenter() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void topressA() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);

	}
	public static void closebrowser() {

		driver.close();

	}

	public static void topressX() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_X);

	}

	public static void topressC() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);

	}

	public static void topressV() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);

	}

	public static void topressZ() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_Z);
		r.keyRelease(KeyEvent.VK_Z);

	}

	public static void topressY() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_Y);
		r.keyRelease(KeyEvent.VK_Y);

	}

	public void tosnap(String name) throws IOException {

		TakesScreenshot tk = (TakesScreenshot) driver;
		File temp = tk.getScreenshotAs(OutputType.FILE);
		File dest = new File("/Employee_Creation_Phase2/Screenshots"
				+ name + ".png");
		FileUtils.copyFile(temp, dest);

	}

	public static void insertValue(WebElement element, String value) {

		js = (JavascriptExecutor) driver;
		js.executeScript(value, element);

	}

	public void clickjavascript(WebElement element) {

		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);

	}

	public static String getValue(WebElement element) {

		js = (JavascriptExecutor) driver;
		Object txt = js.executeScript("return arguments[0].getAttributes('value')", element);
		String s = (String) txt;
		return s;

	}


	public static void toscrollup(String value, WebElement element) {

		js = (JavascriptExecutor) driver;
		js.executeScript(value, element);

	}

	public static void toscrolldown(String value, WebElement element) {

		js = (JavascriptExecutor) driver;
		js.executeScript(value, element);

	}


	public static void toselectbyindex(WebElement element, int i) {

		s = new Select(element);
		s.selectByIndex(i);

	}

	public static void toselectbyvalue(WebElement element, String value) {

		s = new Select(element);
		s.selectByValue(value);

	}

	public static void toselectbyvisibletext(WebElement element, String text) {

		s = new Select(element);
		s.selectByVisibleText(text);

	}

	public static boolean selectismultiple(WebElement element) {

		s = new Select(element);
		boolean m = s.isMultiple();
		return m;

	}

	public static void todeselectAll(WebElement element) {

		s = new Select(element);
		s.deselectAll();

	}

	public static void todeselectbyindex(WebElement element, int i) {

		s = new Select(element);
		s.deselectByIndex(i);

	}

	public static void toselectbyvalue(WebElement element, int i, String value) {

		s = new Select(element);
		s.deselectByValue(value);

	}

	public static void todeselectbyvisibletext(WebElement element, String text) {

		s = new Select(element);
		s.deselectByVisibleText(text);

	}

	public static void toselectAll(WebElement element) {

		s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			s.deselectByIndex(i);

		}
	}

	public static void Explicitwaitvisibility(WebElement ele) {

		WebDriverWait wait=new WebDriverWait(driver, 20);
		//WebElement element= 
		wait.until(ExpectedConditions.visibilityOf(ele));

	}

	public static void togetoptons(WebElement element) {

		s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement option = options.get(i);
			String text = option.getText();
			System.out.println(text);
		}

	}

	public static void togetallselectedoptons(WebElement element) {

		s = new Select(element);
		List<WebElement> options = s.getAllSelectedOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement option = options.get(i);
			String text = option.getText();
			System.out.println(text);
		}

	}

	public static void togetfirstselectedoptons(WebElement element) {

		s = new Select(element);
		s.getFirstSelectedOption();

	}

	public static void tohandlewindow() {

		String Parid = driver.getWindowHandle();
		System.out.println(Parid);

	}

	public static void tohandlewindows() {

		Set<String> allwinid = driver.getWindowHandles();
		for (String allid : allwinid) {
			driver.switchTo().window(allid);
			System.out.println(allid);
		}

	}

	public static void implicitwait() {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	public static void createExcel(int Rownum, int Cellnum, String passvalue) throws IOException {

		// create sheet

		File f = new File(
				"C:\\Users\\Azarudeen\\eclipse-workspace\\UserCreationDemo\\src\\test\\resources\\Excel\\Book1.xlsx");

		Workbook wb = new XSSFWorkbook();

		Sheet newsheet = wb.createSheet("Details");

		Row newrow = newsheet.createRow(Rownum);

		Cell newcell = newrow.createCell(Cellnum);

		newcell.setCellValue(passvalue);

		FileOutputStream fos = new FileOutputStream(f);

		wb.write(fos);

		System.out.println("writed");

		wb.close();
	}
	public void SelectDropdowngenric(String xpath,String value) {
		List<WebElement> genricselect = driver.findElements(By.xpath(xpath));
		System.out.println(genricselect.size());
		for (int i = 0; i < genricselect.size(); i++) {
			System.out.println(genricselect.get(i).getText());
			if (genricselect.get(i).getText().equals(value)) {
				genricselect.get(i).click();
				break;
			}
		}
	}

	public static void createCell(int Rownum, int Cellnum, String passvalue, String sheetname, String filename)
			throws IOException {

		File f = new File("C:\\Users\\Azarudeen\\eclipse-workspace\\UserCreationDemo\\src\\test\\resources\\Excel\\Book1.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(filename);

		Sheet newsheet = wb.getSheet(sheetname);

		Row r = newsheet.getRow(Rownum);

		Cell c = r.createCell(Cellnum);

		c.setCellValue(passvalue);

		FileOutputStream fos = new FileOutputStream(f);

		wb.write(fos);

		System.out.println("writed");
		fis.close();
		wb.close();
	}

	// Create row
	public static void createRow(int rownum, int cellNum, String passvalue, String filename, String sheetname)
			throws IOException {

		File f = new File("C:\\Users\\Azarudeen\\eclipse-workspace\\UserCreationDemo\\src\\test\\resources\\Excel\\Book1.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(filename);

		Sheet s = wb.getSheet(sheetname);

		Row r = s.createRow(rownum);

		Cell c = r.createCell(cellNum);

		c.setCellValue(passvalue);

		FileOutputStream fos = new FileOutputStream(f);

		wb.write(fos);

		System.out.println("writed");
		fis.close();
		wb.close();

	}

	//	public static void excelRead(String NewFile, String SheetName) throws IOException {
	//
	//		File f = new File("C:\\Users\\Azarudeen\\eclipse-workspace\\UserCreationDemo\\src\\test\\resources\\Excel"
	//				+ NewFile + ".xlsx");
	//
	//		FileInputStream fis = new FileInputStream(f);
	//
	//		Workbook wb = new XSSFWorkbook(fis);
	//
	//		Sheet s = wb.getSheet(SheetName);
	//
	//		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
	//
	//			Row r = s.getRow(i);
	//
	//			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
	//
	//				Cell c = r.getCell(j);
	//
	//				int cellType = c.getCellType();
	//
	//				String value;
	//
	//				if (cellType == 1) {
	//
	//					value = c.getStringCellValue();
	//
	//				}
	//
	//				else if (DateUtil.isCellDateFormatted(c)) {
	//					Date d = c.getDateCellValue();
	//
	//					SimpleDateFormat s1 = new SimpleDateFormat("dd/MM/yyyy");
	//
	//					value = s1.format(d);
	//
	//				} else {
	//
	//					double dd = c.getNumericCellValue();
	//
	//					long l = (long) dd;
	//
	//					value = String.valueOf(l);
	//
	//				}
	//				System.out.println(value);
	//
	//			}
	//
	//		}
	//
	//	}

	//	public static String excelReadValue(String NewFile, String Sheetname, int rownum, int cellnum) throws IOException {
	//
	//		File f = new File("C:\\Users\\Azarudeen\\eclipse-workspace\\UserCreationDemo\\src\\test\\resources\\Excel\\Automation.xlsx");
	//
	//		FileInputStream input = new FileInputStream(f);
	//
	//		Workbook wb = new XSSFWorkbook(input);
	//
	//		Sheet s = wb.getSheet(Sheetname);
	//
	//		Row r = s.getRow(rownum);
	//
	//		Cell c = r.getCell(cellnum);
	//
	//		int cellType = c.getCellType();
	//		String value;
	//
	//		if (cellType == 1) {
	//			value = c.getStringCellValue();
	//		}
	//
	//		else if (DateUtil.isCellDateFormatted(c)) {
	//
	//			Date d = c.getDateCellValue();
	//			SimpleDateFormat s1 = new SimpleDateFormat("dd/MM/yyyy");
	//			value = s1.format(d);
	//		} else {
	//			double d = c.getNumericCellValue();
	//			long l = (long) d;
	//			value = String.valueOf(l);
	//		}
	//
	//		return value;
	//
	//	}
	//
	//	public void WaitForVisible(WebDriver driver, WebElement element) {
	//		try {
	//			Thread.sleep(1000);
	//			WebDriverWait wait = new WebDriverWait(driver, 15);
	//			wait.until(ExpectedConditions.visibilityOf(element));
	//		} catch (Exception e) {
	//			e.printStackTrace();
	//		}
	//
	//	}
	//
	//	public static void Scrolldownjavascript() {
	//
	//		js = (JavascriptExecutor) driver;
	//		js.executeScript("window.scrollBy(0,600)");
	//
	//	}
	//
	//	public static void actionClick(WebElement element) {
	//
	//		ac = new Actions(driver);
	//		ac.moveToElement(element).click().perform();
	//
	//	}
	//		
	//				 public static void excelReadMultiple (String SheetName) throws IOException {
	//
	//						File f = new File("C:\\Users\\Azarudeen\\eclipse-workspace\\UserCreationDemo\\src\\test\\resources\\Excel\\Automation.xlsx");
	//
	//						FileInputStream fis = new FileInputStream(f);
	//
	//						Workbook wb = new XSSFWorkbook(fis);
	//
	//						Sheet s = wb.getSheet(SheetName);
	//
	//						for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
	//
	//							Row r = s.getRow(i);
	//
	//							for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
	//
	//								Cell c = r.getCell(j);
	//
	//								int cellType = c.getCellType();
	//
	//								String value;
	//
	//								if (cellType == 1) {
	//
	//									value = c.getStringCellValue();
	//
	//								}
	//
	//								else if (DateUtil.isCellDateFormatted(c)) {
	//									Date d = c.getDateCellValue();
	//
	//									SimpleDateFormat s1 = new SimpleDateFormat("dd/MM/yyyy");
	//
	//									value = s1.format(d);
	//
	//								} else {
	//
	//									double dd = c.getNumericCellValue();
	//
	//									long l = (long) dd;
	//
	//									value = String.valueOf(l);
	//
	//								}
	//								System.out.println(value);
	//
	//							}

	//}

	//}

	public static void excelReadData() throws IOException {
		File file = new File("C:\\Users\\Azarudeen\\eclipse-workspace\\UserCreationDemo\\src\\test\\resources\\Excel\\Automation.xlsx");

		FileInputStream finput = new FileInputStream(file);

		Workbook w = new XSSFWorkbook(finput);

		Sheet s = w.getSheet("User Creation");

		int noofRows = s.getPhysicalNumberOfRows();

		for (int i = 0; i < noofRows; i++) {

			Row r=s.getRow(i);

			int noofCells=r.getPhysicalNumberOfCells();

			for (int j = 0; j < noofCells; j++) {
				Cell c = r.getCell(j);
				System.out.println(c);

			}
			w.close();



		}}}


