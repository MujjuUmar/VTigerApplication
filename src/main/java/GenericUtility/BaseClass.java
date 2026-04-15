package GenericUtility;

import java.io.IOException;

//import org.openqa.selenium.By;
//import org.apache.commons.math3.analysis.function.Log;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

//import com.beust.jcommander.Parameter;

import POMclasses.VTigerHomePage;
import POMclasses.VTigerLoginPage;

public class BaseClass {
	
	public WebDriver driver;
	public static WebDriver sDriver;
	public PropertiesUtility putil = new PropertiesUtility();
	public SeleniumUtility sutil = new SeleniumUtility();
	public ExcelUtility eutil = new ExcelUtility();
	
	
	@BeforeSuite(alwaysRun = true)
	public void bsConfig() {
		System.out.println("Creating DB connection");
	}
	//This is for Cross Browser Execution
	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void bcConfig(@Optional("chrome") String BROWSER) throws IOException {
		if(BROWSER.equals("chrome"))
			driver = new ChromeDriver();
		else if(BROWSER.equals("edge"))
			driver = new EdgeDriver();
		else if(BROWSER.equals("FireFox"))
			driver = new FirefoxDriver();
		else
			driver = new ChromeDriver();
		sDriver = driver;  //Used for listener's
		String URL = putil.getDataFromProperties("url");
		sutil.accessWebApplication(driver, URL);
		sutil.implicitWait(driver, 60);
		sutil.maximizationOfWebApp(driver);
		System.out.println("Acessing the Web Browser");
		
	}

	@BeforeMethod(alwaysRun = true)
	public void bmConfig() throws IOException {
		String UN = putil.getDataFromProperties("username");
		String Pwd = putil.getDataFromProperties("password");
		VTigerLoginPage LoginPage = new VTigerLoginPage(driver);
		LoginPage.loginToApplication(UN, Pwd);;
		System.out.println("Performing Login Operation's");
		
	}
	
	@AfterMethod(alwaysRun = true)
	public void amConfig() throws InterruptedException {
		VTigerHomePage homepage = new VTigerHomePage(driver);
		homepage.performSignOut();
		System.out.println("Logout done Successfully");
	}
	
	@AfterClass(alwaysRun = true)
	public void acConfig() {
		driver.quit();
		System.out.println("Browser Closed succesfully");
	}
	
	
	@AfterSuite(alwaysRun = true)
	public void asConfig() {
		System.out.println("Closing DB Connection");
	}

}
