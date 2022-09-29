package info.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;
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
import org.openqa.selenium.Alert;
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

public class Reusableclass {
	public static WebDriver driver;
	public static Actions ac;
	public static Robot r;
	public static Alert a;
	public static JavascriptExecutor js;
	public static Select s;
	private static Sheet sheet;

	// 1.Browser launch

	public static void browserLaunch() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
	}

	// 2.Get url method

	public static void launchUrl(String url) {

		driver.get(url);

	}

	// 3.Maximize the window

	public static void toMaximize() {

		driver.manage().window().maximize();

	}

	// 4.Delete Cookies

	public void deletecookies() {

		driver.manage().deleteAllCookies();

	}

	// 5. Get page Title
	public static String pageTitle() {

		String title = driver.getTitle();
		return title;

	}

	// 6.Get page URL

	public static String pageUrl() {

		String url = driver.getCurrentUrl();
		return url;

	}

	// 7.passing text to particular field

	public static void tofill(WebElement element, String value) {

		element.sendKeys(value);
	}

	// 8.click login or submit buttons

	public static void toClick(WebElement element) {

		element.click();
	}

	// 9.close the browser

	public static void closetab() {

		driver.close();

	}
	// 10.quit the browser

	public static void closebrowser() {

		driver.quit();

	}

	// 11.isenabled

	public static void tocheckenable(WebElement element) {

		boolean enabled = element.isEnabled();

	}

	// 12. tocheckdisplay

	public static void tocheckdisplay(WebElement element) {

		boolean displayed = element.isDisplayed();

	}

	// 13. tocheckselected

	public static void tocheckselected(WebElement element) {

		boolean selected = element.isSelected();

	}

	// 14.tonavigateurl

	public static void tonavigateurl(String value) {

		driver.navigate().to(value);

	}

	// 15 . toforward

	public static void toforward() {

		driver.navigate().forward();

	}

	// 16.toback

	public static void toback() {

		driver.navigate().back();

	}

	// 17.torefresh

	public static void torefresh() {

		driver.navigate().refresh();

	}

	// 18. get the particular text

	public static String togettext(WebElement element) {

		String txt = element.getText();
		return txt;

	}

	// 19. get the attribute value

	public static String toGetAttributevalue(WebElement element) {

		String attribute = element.getAttribute("value");
		return attribute;

	}

	// 20. move the cursor one element to another

	public static void tomovethecursor(WebElement element) {

		// WebDriverWait wait = new WebDriverWait(driver, 30);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element.toString())));

		ac = new Actions(driver);
		ac.moveToElement(element).perform();

	}

	// 21. drag one field to another field

	public static void todraganddrop(WebElement source, WebElement target) {

		ac = new Actions(driver);
		ac.dragAndDrop(source, target).perform();

	}

	// 22. double click the element

	public static void todoubleclick(WebElement element) {

		ac = new Actions(driver);
		ac.doubleClick(element).perform();

	}

	// 23. Right click the element

	public static void tocontextclick(WebElement element) {

		ac = new Actions(driver);
		ac.contextClick(element).perform();

	}

	// 24. release the key

	public static void tokeyup(WebElement element, CharSequence value) {

		ac = new Actions(driver);
		ac.keyUp(element, value);

	}

	// 25.press the key

	public static void tokeydown(WebElement element, String value) {

		ac = new Actions(driver);
		ac.keyDown(element, value);

	}

	// 26. shiftkey function

	public static void toshiftkey() throws AWTException {

		r = new Robot();
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_SHIFT);

	}

	// 27. tabkey function

	public static void totabkey() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

	}

	// 28. ctrl+a function

	public static void toselectall() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);

	}

	// 29. ctrl+x function

	public static void tocut() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);

	}

	// 30. ctrl+c function

	public static void tocopy() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);

	}

	// 31. ctrl+z function

	public static void toundo() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_Z);
		r.keyRelease(KeyEvent.VK_Z);
		r.keyRelease(KeyEvent.VK_CONTROL);

	}

	// 32. ctrl+y function

	public static void toredo() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_Y);
		r.keyRelease(KeyEvent.VK_Y);
		r.keyRelease(KeyEvent.VK_CONTROL);

	}

	// 33.ctrl+v function

	public static void topaste() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);

	}

	// 34. down arrow option

	public static void todown() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

	}
	// 35. topressup

	public void topressup() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_UP);
		r.keyPress(KeyEvent.VK_UP);

	}

	// 36. enter option

	public static void toenter() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	// 37. selcet all option

	public static void topressA() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);

	}

	// 38. cut option

	public static void topressX() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_X);

	}

	// 39. copy option

	public static void topressC() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);

	}

	// 40.paste option

	public static void topressV() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);

	}

	// 41. undo option

	public static void topressZ() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_Z);
		r.keyRelease(KeyEvent.VK_Z);

	}
	// 42.redo option

	public static void topressY() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_Y);
		r.keyRelease(KeyEvent.VK_Y);

	}
	// 43.toAcceptAlert

	public static void toAcceptAlert() {

		a = driver.switchTo().alert();
		a.accept();

	}

	// 44. toDismissAlert

	public static void toDismissAlert() {

		a = driver.switchTo().alert();
		a.dismiss();

	}

	// 45.tosendkeysalert

	private void tosendkeysalert(String value) {

		a = driver.switchTo().alert();
		a.sendKeys(value);

	}

	// 46. take screen shot option

	public void tosnap(String name) throws IOException {

		TakesScreenshot tk = (TakesScreenshot) driver;
		File temp = tk.getScreenshotAs(OutputType.FILE);
		File dest = new File(
				"C:\\Users\\eclipse-workspace\\BrowserLaunch\\src\\test\\resources\\Screenshots" + name + ".png");
		FileUtils.copyFile(temp, dest);

	}

	// 47. passvalue in field using javascript

	public static void insertValue(WebElement element, String value) {

		js = (JavascriptExecutor) driver;
		js.executeScript(value, element);

	}

	// 48. click the button using javascript

	public static void clickjavascript(WebElement element) {

		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);

	}

	// 49. get value using javascript

	public static String getValue(WebElement element) {

		js = (JavascriptExecutor) driver;
		Object txt = js.executeScript("return arguments[0].getAttributes('value')", element);
		String s = (String) txt;
		return s;

	}

	// 50. scroll the page

	public static void toscrollup(String value, WebElement element) {

		js = (JavascriptExecutor) driver;
		js.executeScript(value, element);

	}

	// 51. scroll the page

	public static void toscrolldown(String value, WebElement element) {

		js = (JavascriptExecutor) driver;
		js.executeScript(value, element);

	}

	// 52. select the element by index

	public static void toselectbyindex(WebElement element, int i) {

		s = new Select(element);
		s.selectByIndex(i);

	}

	// 53. select the element by its value

	public static void toselectbyvalue(WebElement element, String value) {

		s = new Select(element);
		s.selectByValue(value);

	}

	// 54. select the element using text

	public static void toselectbyvisibletext(WebElement element, String text) {

		s = new Select(element);
		s.selectByVisibleText(text);

	}

	// 55. select multiple element

	public static boolean selectismultiple(WebElement element) {

		s = new Select(element);
		boolean m = s.isMultiple();
		return m;

	}

	// 56. deselect all element

	public static void todeselectAll(WebElement element) {

		s = new Select(element);
		s.deselectAll();

	}

	// 57.deselect the element by its index

	public static void todeselectbyindex(WebElement element, int i) {

		s = new Select(element);
		s.deselectByIndex(i);

	}

	// 58. deselect the element by its value

	public static void todeselectbyvalue(WebElement element, int i, String value) {

		s = new Select(element);
		s.deselectByValue(value);

	}

	// 59. delselect the element by its visible text

	public static void todeselectbyvisibletext(WebElement element, String text) {

		s = new Select(element);
		s.deselectByVisibleText(text);

	}

	// 60. select all element by using list

	public static void toselectAll(WebElement element) {

		s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			s.deselectByIndex(i);

		}
	}

	// 61. to get options by using list

	public static void togetoptions(WebElement element) {

		s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement option = options.get(i);
			String text = option.getText();
			System.out.println(text);
		}

	}

	// 62. select all sected option using list

	public static void togetallselectedoptions(WebElement element) {

		s = new Select(element);
		List<WebElement> options = s.getAllSelectedOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement option = options.get(i);
			String text = option.getText();
			System.out.println(text);
		}

	}

	// 63. select first option

	public static void togetfirstselectedoptions(WebElement element) {

		s = new Select(element);
		s.getFirstSelectedOption();

	}

	// 64. to get window handle

	public static void tohandlewindow() {

		String Parid = driver.getWindowHandle();
		System.out.println(Parid);

	}

	// 65.to get window handles

	public static void tohandlewindows() {

		Set<String> allwinid = driver.getWindowHandles();
		for (String allid : allwinid) {
			driver.switchTo().window(allid);
			System.out.println(allid);
		}

	}

	// 66. to window handles

	public static void towindowhandles(Object parId) {

		Set<String> allwinid = driver.getWindowHandles();
		for (String allid : allwinid) {
			if (!parId.equals(allid)) {
				driver.switchTo().window(allid);
			}

		}

	}

	// 67. tomultiplewindow

	public void tomultiplewindows(int value) {

		Set<String> Setofid = driver.getWindowHandles();
		List<String> li = new LinkedList();
		li.addAll(Setofid);
		driver.switchTo().window(li.get(value));

	}

	// 68.wait method

	public static void implicitwait() {

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	// 69. Scrolldownjavascript

	public static void Scrolldownjavascript() {

		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");

	}

	// 70. create the value in excel sheet

	public static void createExcel(int Rownum, int Cellnum, String passvalue, String Filename, String sheetname)
			throws IOException {

		// create sheet

		File f = new File(Filename);

		Workbook wb = new XSSFWorkbook();

		Sheet newsheet = wb.createSheet(sheetname);

		Row newrow = newsheet.createRow(Rownum);

		Cell newcell = newrow.createCell(Cellnum);

		newcell.setCellValue(passvalue);

		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);

		System.out.println("writed");
	}

	// 71.Create new cell in excel sheet

	public static void createCell(int Rownum, int Cellnum, String passvalue, String sheetname, String filename)
			throws IOException {

		File f = new File(filename);

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(filename);

		Sheet newsheet = wb.getSheet(sheetname);

		Row r = newsheet.getRow(Rownum);

		Cell c = r.createCell(Cellnum);

		c.setCellValue(passvalue);

		FileOutputStream fos = new FileOutputStream(f);

		wb.write(fos);

		System.out.println("writed");
	}

	// 72.Create row in excel sheet

	public static void createRow(int rownum, int cellNum, String passvalue, String filename, String sheetname)
			throws IOException {

		File f = new File(filename);

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(filename);

		Sheet s = wb.getSheet(sheetname);

		Row r = s.createRow(rownum);

		Cell c = r.createCell(cellNum);

		c.setCellValue(passvalue);

		FileOutputStream fos = new FileOutputStream(f);

		wb.write(fos);

		System.out.println("writed");

	}

	// 73. read the existing value in excel sheet.

	/*
	 * public static void excelRead(String filename, String SheetName ) throws
	 * IOException {
	 * 
	 * File f = new
	 * File("C:\\Users\\Karthika Devi\\eclipse-workspace\\browserlaunch\\Excel file\\Automation.xlsx"
	 * );
	 * 
	 * FileInputStream fis = new FileInputStream(f);
	 * 
	 * Workbook wb = new XSSFWorkbook(fis);
	 * 
	 * Sheet s = wb.getSheet(SheetName);
	 * 
	 * for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
	 * 
	 * Row r = s.getRow(i);
	 * 
	 * for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
	 * 
	 * Cell c = r.getCell(j);
	 * 
	 * CellType cellType = c.getCellType();
	 * 
	 * String value;
	 * 
	 * // if (cellType == 1) { // // value = c.getStringCellValue(); // // }
	 * 
	 * else if (DateUtil.isCellDateFormatted(c)) { Date d = c.getDateCellValue();
	 * 
	 * SimpleDateFormat s1 = new SimpleDateFormat("dd/MM/yyyy");
	 * 
	 * value = s1.format(d);
	 * 
	 * } else {
	 * 
	 * double dd = c.getNumericCellValue();
	 * 
	 * long l = (long) dd;
	 * 
	 * value = String.valueOf(l);
	 * 
	 * } System.out.println(value);
	 * 
	 * }
	 * 
	 * }
	 * 
	 * }
	 */

	// 74. read the value from particular excel sheet.

	public static String excelReadValue(String Sheetname, int rownum, int cellnum) throws IOException {

		File f = new File("C:\\Users\\Karthika Devi\\eclipse-workspace\\browserlaunch\\Excel file\\Automation.xlsx");

		FileInputStream input = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(input);

		Sheet s = wb.getSheet(Sheetname);

		String value = null;

		Row r = s.getRow(rownum);

		Cell c = r.getCell(cellnum);

		return value;

	}

	// 75.getRowcount

	public static int getRowcount(String sheetname) throws IOException {

		File f = new File("C:\\Users\\Karthika Devi\\eclipse-workspace\\browserlaunch\\Excel file\\Automation.xlsx");

		FileInputStream input = new FileInputStream(f);

		XSSFWorkbook wb = new XSSFWorkbook(input);

		XSSFSheet s = wb.getSheet(sheetname);

		int rowcount = s.getLastRowNum();

		input.close();

		return rowcount;

	}

	// 76.getCellcount

	public static int getCellcount(String sheetname, int rownum) throws IOException {

		File f = new File("C:\\Users\\Karthika Devi\\eclipse-workspace\\browserlaunch\\Excel file\\Automation.xlsx");

		FileInputStream input = new FileInputStream(f);

		XSSFWorkbook wb = new XSSFWorkbook(input);

		XSSFSheet s = wb.getSheet(sheetname);

		XSSFRow r = s.getRow(rownum);

		int cellcount = r.getLastCellNum();

		input.close();

		return cellcount;

	}

	public static void Explicitwait(WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void actionssendkeysdelete(WebElement element) {

		Actions a = new Actions(driver);
		a.moveToElement(element).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();

	}

}
