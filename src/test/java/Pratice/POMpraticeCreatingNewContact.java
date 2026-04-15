package Pratice;

import java.io.IOException;

//import org.apache.commons.compress.harmony.unpack200.bytecode.ConstantValueAttribute;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import GenericUtility.ExcelUtility;
import GenericUtility.PropertiesUtility;
import GenericUtility.SeleniumUtility;
import POMclasses.ContactPOM;
import POMclasses.VTigerHomePage;
import POMclasses.VTigerLoginPage;
import POMclasses.creatingNewContactPage;

public class POMpraticeCreatingNewContact {
	public static void main(String[] args) throws IOException {
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
		VTigerLoginPage lp = new VTigerLoginPage(driver);
		lp.loginToApplication(UN, Pwd);
		VTigerHomePage HomePage = new VTigerHomePage(driver);
		HomePage.clickOnContactMenu();
		ContactPOM ConPage=new ContactPOM(driver);
		ConPage.clickOnCreateNewContactIcon();
		ExcelUtility eutil = new ExcelUtility();
		creatingNewContactPage CnCp = new creatingNewContactPage(driver);
		
		//String lname = eutil.getDataFromExcel("Contact", 1, 1);
//		String fname = eutil.getDataFromExcel("Contact", 1, 2);
//		String LeadSource = eutil.getDataFromExcel("Contact", 1, 3);
//		CnCp.createNewContact(lname, fname, LeadSource);
		
		
//		String lname = eutil.getDataFromExcel("Contact", 1, 1);
//		String Dept = eutil.getDataFromExcel("Contact", 4, 2);
//		String Mail = eutil.getDataFromExcel("Contact", 4, 3);
//		String Mobile = eutil.getDataFromExcel("Contact", 4, 4);  
		
//		CnCp.createNewContact(lname, Dept, Mail, Mobile);
		
		String lname = eutil.getDataFromExcel("Contact", 7, 1);
		String Title = eutil.getDataFromExcel("Contact", 7, 2);
		String eMail = eutil.getDataFromExcel("Contact", 7, 3);
		String MailingCity = eutil.getDataFromExcel("Contact", 7, 4);
		String MailingState = eutil.getDataFromExcel("Contact", 7, 5);
		String MailCountry = eutil.getDataFromExcel("Contact", 7, 6);
		
		CnCp.createNewContact(lname, Title, eMail, MailingCity, MailingState, MailCountry);
		
		
		
		
		
	}

}
