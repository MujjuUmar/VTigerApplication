package Pratice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import GenericUtility.PropertiesUtility;
import GenericUtility.SeleniumUtility;
import POMclasses.ContactPOM;
import POMclasses.LeadsPOM;
import POMclasses.VTigerHomePage;
import POMclasses.VTigerLoginPage;

public class VtigerLoginUsingPOM {
	public static void main(String[] args) throws IOException {
		PropertiesUtility putil = new PropertiesUtility();
		SeleniumUtility sutil = new SeleniumUtility();
		String Url = putil.getDataFromProperties("url");
		String UN = putil.getDataFromProperties("username");
		String Pwd = putil.getDataFromProperties("password");
		WebDriver driver  =new ChromeDriver();
		sutil.maximizationOfWebApp(driver);
		sutil.accessWebApplication(driver, Url);
		VTigerLoginPage VTlp = new VTigerLoginPage(driver);
		VTlp.loginToApplication(UN, Pwd);
//		VTigerHomePage VtHp = new VTigerHomePage(driver);
//		VtHp.clickOnLeadsMenu();
//		LeadsPOM Lpom = new LeadsPOM(driver);
//		Lpom.clickONPlusIcon();
//		VtHp.clickOnContactMenu();
//		//VtHp.performSignOut();
//		ContactPOM Cpom = new ContactPOM(driver);
//		Cpom.clickOnCreateNewContact();
		VTigerHomePage VtHp = new VTigerHomePage(driver);
		VtHp.clickOnContactMenu();
		ContactPOM Cpom = new ContactPOM(driver);
		Cpom.clickOnCreateNewContactIcon();
		
		
		
	}

}
