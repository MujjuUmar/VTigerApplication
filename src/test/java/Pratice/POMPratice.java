package Pratice;

import java.io.IOException;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.ExcelUtility;
import GenericUtility.PropertiesUtility;
import GenericUtility.SeleniumUtility;
import POMclasses.LeadsPOM;
import POMclasses.VTigerHomePage;
import POMclasses.VTigerLoginPage;
import POMclasses.creatingNewLeadsPage;
import net.bytebuddy.build.ToStringPlugin.Exclude;


public class POMPratice {
	
//	@FindBy(xpath = "//input[@name='user_name']")
//	WebElement usernameTF;
//	
//	@FindBy ( name = "  ")
//	WebElement 
//	
//	public POMPratice(WebDriver driver) {
//		PageFactory.initElements(driver, this);
//	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		SeleniumUtility sutil=new SeleniumUtility();
		PropertiesUtility putil=new PropertiesUtility();
		String Url = putil.getDataFromProperties("url");
		System.out.println(Url);
		String UN = putil.getDataFromProperties("username");
		String Pwd= putil.getDataFromProperties("password");
		WebDriver driver=new ChromeDriver();
		sutil.implicitWait(driver, 60);
		sutil.accessWebApplication(driver, Url);
		sutil.maximizationOfWebApp(driver);
		//WebElement element=	driver.findElement(By.xpath("//input[@name='user_name']"));
//		POMPratice p = new POMPratice(driver);
//		p.usernameTF.sendKeys("admin");
//		Thread.sleep(2000);
//		sutil.refreshTheWebPage(driver);
//		Thread.sleep(3000);
//		p.usernameTF.sendKeys("username");
		VTigerLoginPage Lp = new VTigerLoginPage(driver);
		Lp.loginToApplication(UN, Pwd);
		VTigerHomePage homePage = new VTigerHomePage(driver);
		homePage.clickOnLeadsMenu();
		LeadsPOM lp = new LeadsPOM(driver);
		lp.clickONPlusIcon();
		ExcelUtility eutil = new ExcelUtility();
		//String fname = eutil.getDataFromExcel("leads", 4, 1);
//		String lname = eutil.getDataFromExcel("Leads", 4, 1);
//		String Company = eutil.getDataFromExcel("Leads", 4, 2);
//		String title = eutil.getDataFromExcel("Leads", 4, 3);
//		String leadSourse = eutil.getDataFromExcel("Leads", 4, 4);
//		String NoOfEmp = eutil.getDataFromExcel("Leads", 4, 5);
		creatingNewLeadsPage cnlp= new creatingNewLeadsPage(driver);
//		//cnlp.creatingNewLead(fname, lname, Company);
//		cnlp.creatingNewLead(lname, Company, title, leadSourse, NoOfEmp);
		
		String lname = eutil.getDataFromExcel("Leads", 7, 1);
		String company = eutil.getDataFromExcel("Leads", 7, 2);
		String PhoneNo = eutil.getDataFromExcel("Leads", 7, 3);
		String eMail = eutil.getDataFromExcel("Leads", 7, 4);
		String city = eutil.getDataFromExcel("Leads", 7, 5);
		String state = eutil.getDataFromExcel("Leads", 7, 6);
		String country = eutil.getDataFromExcel("Leads", 7, 7);
		
		cnlp.creatingNewLead(lname, company, PhoneNo, eMail, city, state, country);
		
		
		
	}
}
