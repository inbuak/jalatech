package com.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * @author Lenovo
 * @see used to maintain all resuable methods
 */
public class BaseClass {
	public static WebDriver driver;

	public static void getdriver() {
		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
	}
	
	/**
	 * @see used to launch the application url
	 * @param url
	 */
	public static void AppUrl(String url) {
		driver.get(url);
	}

	/**
	 * @see used to maximize the window
	 */
	public static void Maximize() {
		driver.manage().window().maximize();
	}

	/**
	 * @see used to get the title from webpage
	 * @return String
	 */
	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	/**
	 * @see used to get the current URL from webpage
	 * @return String
	 */
	public String getentertedUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	/**
	 * @see used to close the current webpage
	 * 
	 */
	public void closewindow() {
		driver.close();
	}

	/**
	 * @see used to close entire webpage
	 *
	 */
	public static void quitwindow() {
		driver.quit();
	}

	/**
	 * 
	 * @param id
	 * @return String
	 * @see used to find the locator for single webelement by using Id
	 */
	public WebElement findElementById(String id) {
		WebElement element = driver.findElement(By.id(id));
		return element;
	}

	/**
	 * 
	 * @param name
	 * @return String
	 * @see used to find the locator for single webelement by using name
	 */
	public WebElement findElementByname(String name) {
		WebElement element = driver.findElement(By.name(name));
		return element;
	}

	/**
	 * 
	 * @param className
	 * @return String
	 * @see used to find the locator for single webelement by using className
	 */
	public WebElement findElementByclassName(String className) {
		WebElement element = driver.findElement(By.className(className));
		return element;
	}

	/**
	 * 
	 * @param xpath
	 * @return String
	 * @see used to find the locator for single webelement by using xpath
	 */
	public WebElement findElementByxpath(String xpathExpression) {
		WebElement element = driver.findElement(By.xpath(xpathExpression));
		return element;
	}

	/**
	 * 
	 * @param element
	 * @param data
	 * @see used to pass the values by using sendkeys
	 */
	public void elementSendkeys(WebElement element, String data) {
		element.sendKeys(data);
	}

	/**
	 * 
	 * @param element
	 * @return String
	 * @see used to get text from the webpage
	 */
	public String getText(WebElement element) {
		String text = element.getText();
		return text;
	}

	// value---> fixed
	/**
	 * 
	 * @param element
	 * @param data
	 * @return String
	 * @see used to get the text from the field which we passed
	 */
	public String getAttribute(WebElement element, String value) {
		String attribute = element.getAttribute(value);
		return attribute;
	}

	// 1%--->
	public String getAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}

	/**
	 * 
	 * @param element
	 * @see used to click the button or link in webpage
	 */
	public void elementClick(WebElement element) {
		element.click();

	}

	/**
	 * 
	 * @param element
	 * @see used to click the button or link in webpage
	 */
	public void getClick(WebElement element) {
		element.click();
	}

	/**
	 * 
	 * @param element
	 * @see used to mouseover action from one element to another element
	 */
	public void mouseOverAction(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}

	/**
	 * 
	 * @param element
	 * @see used to click the element by rightclick action
	 */
	public void rightClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();
	}

	/**
	 * 
	 * @param element
	 * @see used to click the element by doubleclick action
	 */
	public void doubleClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();
	}

	/**
	 * @see used to press and release the button by using keyboard action
	 * @throws AWTException
	 * 
	 */
	public void enterKeyRobot() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	/**
	 * @see used to accept the alert message
	 */
	public void Accept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	/**
	 * @see used to dismiss/cancel the alert message
	 */
	public void Dismiss() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	/**
	 * @see used to get the text from alertbox from webpage
	 * @param data
	 * @return String
	 */
	public String alertgetText(String data) {
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		return text;
	}

	/**
	 * @see used to select text from dropdown by using visibletext
	 * @param element
	 * @param text
	 */
	public void selectByText(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	/**
	 * @see used to select value from dropdown by using Value
	 * @param element
	 * @param value
	 */
	public void selectByValue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}

	/**
	 * @see used to select index value from dropdown to get the text
	 * @param element
	 * @param index
	 */
	public void selectByIndex(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}

	/**
	 * @see used to enter the values into textbox by using javascript
	 * @param element
	 * @param data
	 */
	public void elementSendkeysJs(WebElement element, String data) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0],setAttribute('value'," + data + "')", element);
	}

	/**
	 * @see used to click the button/link by using javascript
	 * @param element
	 */
	public void elementClickJs(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0],click()", element);
	}

	/**
	 * @see used to scroll up the webpage by using javascript
	 * @param element
	 */
	public void elementScrollup(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0],scrollIntoView(true)", element);
	}

	/**
	 * @see used to scroll down the webpage by using javascript
	 */
	public void elementScrolldown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0],scrollIntoView(false)", element);
	}

	/**
	 * @see used to switch the frame element by using index
	 * @param index
	 */
	public void frameIndex(int index) {
		driver.switchTo().frame(0);
	}

	/**
	 * @see used to switch the frame element by using Id
	 * @param data
	 */
	public void frameId(String data) {
		driver.switchTo().frame(data);
	}
	/**
	 * @see used to switch the frame element by using webelement
	 * @param element
	 */
	public void frameElement(WebElement element) {
		driver.switchTo().frame(element);
	}
	/**
	 * @see used to get the all the options from dropdown by using text
	 * @param element
	 * @param index
	 */
	public void getOptionsByText(WebElement element, int index) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size();) {
			WebElement element1 = options.get(i);
			String text1 = element1.getText();
		}
	}
	
	/**
	 * @see used to get the all the options from dropdown by using value
	 * @param element
	 * @param index
	 */
	public void getOptionsAttribute(WebElement element, int index) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (int j = 0; j < options.size();) {
			WebElement element1 = options.get(j);
			String attribute = element1.getAttribute("value");
		}
	}
	/**
	 * @see  used to get the first selected  options from dropdown 
	 * @param element
	 * @param text
	 * @return String
	 */
	public String getFirstSelectedOptions(WebElement element, String text) {
		Select s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text2 = firstSelectedOption.getText();
		return text2;
	}
	/**
	 * @see used to selet all the text/values from dropdown is true/false
	 * @param element
	 * @return boolean
	 */
	public boolean isMultiple(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		return multiple;
	}
	/**
	 * @see used to wait the page/frame for certain secounds/minutes/hours
	 */
	public void implicityWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	/**
	 * @see used to deslect all the values from dropdown by using index
	 * @param element
	 * @param index
	 */
	public void deSelectByIndex(WebElement element, int index) {
		Select sel = new Select(element);
		sel.deselectByIndex(0);
	}
	/**
	 * @see used to deslect all the attribute values from dropdown by using value
	 * @param element
	 * @param value
	 */
	public void deSelectByValue(WebElement element, String value) {
		Select sel = new Select(element);
		sel.deselectByValue(value);
	}
	/**
	 * @see  used to deslect all the values from dropdown by using visible text
	 * @param element
	 * @param text
	 */
	public void deSelectByText(WebElement element, String text) {
		Select sel = new Select(element);
		sel.deselectByVisibleText(text);
	}
	/**
	 * @see  used to deslect all the valyes from dropdown by using deselectAll
	 * @param element
	 */

	public void deSelectAll(WebElement element) {
		Select sel = new Select(element);
		sel.deselectAll();
	}
	/**
	 * @see used to get the parent window ffrom one frame to another frame
	 * @return String
	 */
	public String parentWindow() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}
	/**
	 * @see used to get the child window from one frame to another frame
	 * @return  Set<String>
	 */
	public Set<String> allWindow() {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
	}
	/**
	 * @see used to clear the entered text from textbox
	 * @param element
	 */
	public void ClearText(WebElement element) {
		element.clear();
	}
	/**
	 * @see used to take the screenshot in execution by using FILE output type
	 * @return File
	 */

	public File Takescreenshot() {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		return screenshotAs;
	}
	/**
	 * @see used to take the screenshot in execution by using FILE output type
	 * @param element
	 * @param xpathExpression
	 * @return File
	 */

	public File elementTakescreenshot(WebElement element, String xpathExpression) {
		WebElement element2 = driver.findElement(By.xpath(xpathExpression));
		File screenshotAs = element2.getScreenshotAs(OutputType.FILE);
		return screenshotAs;
	}
	/**
	 * @see used to refresh the webpage
	 */
	public void refreshPage() {
		driver.navigate().refresh();
	}
	/**
	 * @see used to forward the webpage
	 */
	public void forwardPage() {
		driver.navigate().forward();
	}
	/**
	 * @see used to backward the webpage
	 */
	public void backwardPage() {
		driver.navigate().back();
	}
	/**
	 * @see used to print the dompage in console
	 * @return String
	 */
	public String pageSource() {
		String pageSource = driver.getPageSource();
		return pageSource;
	}
	/**
	 * @see used to perform keyboard action towards UP
	 * @param element
	 * @param data
	 */
	public void keyUp(WebElement element, String data) {
		Actions actions = new Actions(driver);
		actions.keyUp(element, data);
	}
	/**
	 * @see  used to perform keyboard action towards DOWN
	 * @param element
	 * @param data
	 */

	public void keyDown(WebElement element, String data) {
		Actions actions = new Actions(driver);
		actions.keyDown(element, data);
	}
	/**
	 * @see used to enters the values into textbox in alert
	 * @param text
	 */
	public void elementSend(String text) {
		Alert al = driver.switchTo().alert();
		al.sendKeys(text);
	}
	/**
	 * @see used to launch the firefox browser
	 */
	public void launchFirefox() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	/**
	 * @see  used to launch the edge browser
	 */
	public void launchEdge() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
	/**
	 *@see  used to launch the internetExplorer browser 
	 */
	public void launchInternetExp() {
		WebDriverManager.iedriver().setup();
		driver = new InternetExplorerDriver();
	}
	/**
	 * @see used to get the file location to save the screenshot from execution
	 * @param pathname
	 * @param element
	 * @return File
	 * @throws IOException
	 */

	public File Filepath(String pathname, WebElement element) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(pathname);
		FileUtils.copyFile(screenshotAs, file);
		return file;
	}
	/**
	 * @see used to take screenshot by using  byte[] outputType
	 * @return  byte[] 
	 */
	public byte[] OutputByte() {
		TakesScreenshot ts = (TakesScreenshot) driver;
		byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
		return screenshotAs;
	}
	/**
	 *@see used to take screenshot by using Base64 outputType 
	 * @return String
	 */
	public String OutputBase64() {
		TakesScreenshot ts = (TakesScreenshot) driver;
		String screenshotAs = ts.getScreenshotAs(OutputType.BASE64);
		return screenshotAs;
	}
	/**
	 * @see used to select all the text from dropdown by using all selected options
	 * @param element
	 * @param index
	 */
	public void getAllSelectedOptions(WebElement element, int index) {
		Select s = new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (int i = 0; i < allSelectedOptions.size(); i++) {
			WebElement element1 = allSelectedOptions.get(i);
			String text = element1.getText();

		}
	}
	/**
	 * @see used to wait the element in milliseconds
	 * @param milliseconds
	 * @throws InterruptedException
	 */
	public void Sleep(int milliseconds) throws InterruptedException {
		Thread.sleep(1000);
	}
	/**
	 * @see used to switch the parent window 
	 * @param text
	 */
	public void moveToParentwin(String text) {
		driver.switchTo().window(text);
	}
	/**
	 * @see used to navigate into the URL
	 * @param url
	 */
	public void navigateTo(String url) {
		driver.navigate().to(url);
	}
	/**
	 * @see used to  Drag the text and Drop the text from one location into another by using Action
	 * @param source
	 * @param target
	 */
	public void DragandDop(WebElement source, WebElement target) {
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target);
	}
	/**
	 * @see used to read the input/data from excel file
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return String
	 * @throws IOException
	 */
	public String readValueFromExcel(String sheetName, int rowNum, int cellNum) throws IOException {

		String result = "";
		File file = new File("C:\\Users\\Lenov\\eclipse-workspace\\FrameWrk\\Excel\\Hari.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		CellType type = cell.getCellType();
		switch (type) {
		case STRING:
			result = cell.getStringCellValue();

			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = (Date) cell.getDateCellValue();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMM/yyyy");
				result = dateFormat.format(dateCellValue);

			} else {
				double numericCellValue = cell.getNumericCellValue();
				BigDecimal valueOf = BigDecimal.valueOf(numericCellValue);
				result = valueOf.toString();
			}
			break;
		default:
			break;
		}
		return result;
	}
	/**
	 * @see used to update the data into excel file 
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @param oldData
	 * @param newData
	 * @throws IOException
	 */
	public void updateCellValue(String sheetName, int rowNum, int cellNum, String oldData, String newData)
			throws IOException {

		File file = new File("C:\\Users\\Lenov\\eclipse-workspace\\FrameWrk\\Excel\\Hari.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		String cellValue = cell.getStringCellValue();
		if (cellValue.equals(oldData)) {
			cell.setCellValue(newData);
		}
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		workbook.write(fileOutputStream);

	}
	/**
	 * @see used to write the value/datas into excel fie
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @param data
	 * @throws IOException
	 */
	public void writeCellData(String sheetName, int rowNum, int cellNum, String data) throws IOException {
		File file = new File("C:\\Users\\Lenov\\eclipse-workspace\\FrameWrk\\Excel\\Hari.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.createCell(cellNum);
		cell.setCellValue(data);
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		workbook.write(fileOutputStream);

	}
	
	/**
	 * @see used to switch the case to execute the browser
	 * @param browser
	 */
	public static void getDriver(String browser) {
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "ie":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			break;
		}
	}

	/**
	 * @see  used to get project path/location from user directory
	 * @return String
	 */
	public static String getProjectPath() {
		String property = System.getProperty("user.dir");
		return property;
	}
	/**
	 * @see used to read project path/location from file to config the properties
	 * @param key
	 * @return String
	 * @throws FileNotFoundException
	 * @throws IOException
	 */

	public static String getPropertFileValue(String key) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.load(new FileInputStream(getProjectPath() + "\\config\\config.properties"));
		Object object = properties.get(key);
		String value = (String) object;
		return value;
	}

}
