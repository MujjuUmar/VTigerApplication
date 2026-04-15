package GenericUtility;

//import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
//import java.nio.file.Files;
//import java.sql.Driver;
//import java.io.File;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * This is an utility class which stores the functionality from Selenium
 */
public class SeleniumUtility {
	/**
	 * This is a generic method to access the web Application
	 * @param driver
	 * @param Url
	 */
	public void accessWebApplication(WebDriver driver, String Url) {
		driver.get(Url);	
	}
	/**
	 * This is a generic method to maximize the Chrome or Edge Browser
	 * @param driver
	 */
	public void maximizationOfWebApp(WebDriver driver ) {
		driver.manage().window().maximize();
	}
	/**
	 * This is the generic method to refresh the WebPage
	 * @param driver
	 */
	public void refreshTheWebPage(WebDriver driver) {
		driver.navigate().refresh();
	}
	
	////////////********** Synchronization *************//////////////////
	
	/**
	 * This is a generic method for implicit wait 
	 * @param driver
	 * @param Maxtime
	 */
	public void implicitWait(WebDriver driver, int Maxtime) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Maxtime));
	}
	
	/**
	 * This is a generic method for Explicit wait
	 * @param driver
	 * @param Maxtime
	 */
	public void explicitWait(WebDriver driver, int Maxtime, By elemant) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Maxtime));
		wait.until(ExpectedConditions.visibilityOfElementLocated(elemant));
	}
	
	////////***********  Handing DropDown(Selection Method) **********//////////////
	
	/**
	 * This is a generic method to handle DropDown using index
	 * @param driver
	 * @param element
	 * @param Number
	 */
	public void handleDDUsingSelectByIndex(WebElement element , int indexNumber) {
		Select set1 = new Select(element);
		set1.selectByIndex(indexNumber);
	}
	
	/**
	 * This is a generic method to handle DropDown using VisibleText
	 * @param driver
	 * @param element
	 * @param Element
	 */
	public void handleDDUsingSelectByVisibleText(WebElement element , String visibleText) {
		Select set1 = new Select(element);
		set1.selectByVisibleText(visibleText);
	}
	
	/**
	 * This is the generic Method to handle DropDown Using Value Attribute
	 * @param driver
	 * @param Element
	 * @param ValueAttributeName
	 */
	public void handleDDUsingSelectByValue( WebElement Element,  String ValueAttributeName ) {
		Select set1 = new Select(Element);
		set1.selectByValue(ValueAttributeName);
	}
	
	////**** Handling DropDown (De-selection Method) ******//////////
	
	/**
	 * This is a generic Method to De-select the DropDown Using Index Value
	 * @param element
	 * @param indexNumber
	 */
	public void handleDDUsingDeSelectByIdex(WebElement element , int indexNumber) {
		Select set1 = new Select(element);
		set1.deselectByIndex(indexNumber);
	}
	
	/**
	 * This is a generic Method to Perform De-select Operation Using Value Of Attribute
	 * @param Element
	 * @param ValueAttributeName
	 */
	public void handleDDUsingDeSelectByValue( WebElement Element,  String ValueAttributeName ) {
		Select set1 = new Select(Element);
		set1.deselectByValue(ValueAttributeName);
	}
	
	/**
	 * This is a generic method to perfrom De-Select Operation on DropDown by using VisibleText
	 * @param element
	 * @param visibleText
	 */
	public void handleDDUsingDeSelectByVisibleText(WebElement element , String visibleText) {
		Select set1 = new Select(element);
		set1.deselectByVisibleText(visibleText);
	}
	
	/////***** Validate DropDown Is Multi Select or Not********///////////
	
	public void isMultiSelect(WebElement element) {
		Select set = new Select(element);
		boolean value=set.isMultiple();
		System.out.println(value);
	}
	
	
	///////****** Mouse Actions ********//////////////
	
	/**
	 * This is a generic method to Scroll the WebPage
	 * @param driver
	 * @param element
	 */
	public void scrollingOperation(WebDriver driver , WebElement element) {
		Actions act=new Actions(driver);
		act.scrollToElement(element).perform();
	}
	
	/**
	 * This is a generic method to perform mouse hovering Actions
	 * @param driver
	 * @param element
	 */
	public void mouseHovring(WebDriver driver, WebElement element) {
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	/**
	 * This is a generic method to Double click the webElement
	 * @param driver
	 */
	public void doubleClick(WebDriver driver, WebElement element) {
		Actions act=new Actions(driver);
		act.doubleClick(element).perform();
	}
	/**
	 * This is a generic Method to perform Click Operation on WebElement
	 * @param driver
	 * @param element
	 */
	public void mouseClick(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.click(element).perform();
	}
	/**
	 * This is a generic Method to perfrom Right Click Operation On Webelement
	 * @param driver
	 * @param element
	 */
	public void contextClick(WebDriver driver , WebElement element) {
		Actions act = new Actions(driver);
		act.contextClick(element).perform();
	}
	/**
	 * This is a generic Method to perfrom the ClickAndHold Operation on WebElement
	 * @param driver
	 * @param element
	 */
	public void clickAndHold(WebDriver driver , WebElement element) {
		Actions act = new Actions(driver);
		act.clickAndHold(element).perform();
	}
	/**
	 * This is a generic Method to perform the Release Operation on WebElement
	 * @param driver
	 * @param element
	 */
	public void release(WebDriver driver, WebElement element) {
		Actions act= new Actions(driver);
		act.release(element).perform();
	}
	/**
	 * This is a generic method to perform Move Operation on Webelemnt
	 * @param driver
	 * @param x
	 * @param y
	 */
	public void moveByOffset(WebDriver driver, int x , int y) {
		Actions act = new Actions(driver);
		act.moveByOffset(x, y);
	}
	/**
	 * This is a generic Method to perfrom the drag and drop operation on WebElement
	 * @param driver
	 * @param Ele1
	 * @param Ele2
	 */
	public void dragAndDropOperation(WebDriver driver , WebElement Ele1, WebElement Ele2) {
		Actions act=new Actions(driver);
		act.dragAndDrop(Ele1, Ele2);
	}
	/**
	 * This is a generic Method to perfrom the Scroll Operation on WebElement
	 * @param driver
	 * @param x
	 * @param y
	 */
	public void scrollByAmount(WebDriver driver , int x , int y) {
		Actions act=new Actions(driver);
		act.scrollByAmount(x, y);
	}
	
	/////******* Alert ********//////////
	
	/**
	 * This is the generic method to accept the Alert Pop-up
	 * @param driver
	 */
	public void acceptAlertPopup(WebDriver driver) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    try {
	        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	        System.out.println("Alert message: " + alert.getText());
	        alert.accept();
	    } catch (TimeoutException e) {
	        System.out.println("Alert not found");
	    }
	}
	
	/**
	 * This is a generic Method to dismiss the alert Pop-up
	 * @param driver
	 */
	public void dismissAlertPopup(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	//////******* Frames *******/////////
	
	/**
	 * This is the generic Method to switch the control inside the Frame Using Index 
	 * @param driver
	 * @param frameIndex
	 */
	public void switchToFrameUsingIndex(WebDriver driver , int frameIndex) {
		driver.switchTo().frame(frameIndex);
	}
	/**
	 *  This is the generic Method to switch the control inside the Frame Using Name Or Id
	 * @param driver
	 * @param nameOrId
	 */
	public void switvhToFrameUsingNameOrId(WebDriver driver , String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}
	////******Multiple Windows****////////
	
	/**
	 * This is a generic Method to switch the Control Next WebPage
	 * @param driver
	 */
	public void switchToSecondTab(WebDriver driver) {
		String pid = driver.getWindowHandle();
		Set<String> allPids = driver.getWindowHandles();
		for(String id:allPids) {
			if(!id.equals(pid)) {
				driver.switchTo().window(pid);
			}
		}
	}
	
	/////***** File Upload ******///////////
	
	/**
	 * This is a generic Method to Upload the file to the WebElement.
	 * @param fileUploadEle
	 * @param filePath
	 */
	public void uploadFile(WebElement fileUploadEle , String filePath) {
		fileUploadEle.sendKeys(filePath);	
	}
	
	/////******* Taking ScreenShots ********////////
	
	public String webPageScreenShot(WebDriver driver, String screenshotName) throws IOException  {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\screenShot\\"+screenshotName+".png");
		com.google.common.io.Files.copy(src, dest);
		return dest.getAbsolutePath();
	}
	
}
