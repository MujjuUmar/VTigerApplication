package Pratice;

import java.awt.Dimension;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import GenericUtility.ExcelUtility;
import GenericUtility.PropertiesUtility;
import GenericUtility.SeleniumUtility;
import POMclasses.OrganizationPOM;
import POMclasses.VTigerHomePage;
import POMclasses.VTigerLoginPage;
import POMclasses.creatingNewOrganizationPagePOM;

public class OrganizationMenuPratice {
	public static void main(String[] args) throws IOException {
		PropertiesUtility putil = new PropertiesUtility();
		SeleniumUtility sutil = new SeleniumUtility();
		String Url = putil.getDataFromProperties("url");
		String username = putil.getDataFromProperties("username");
		String password = putil.getDataFromProperties("password");
		WebDriver driver = new ChromeDriver();
		sutil.implicitWait(driver, 60);
		sutil.accessWebApplication(driver, Url);
		sutil.maximizationOfWebApp(driver);
		VTigerLoginPage loginPage = new VTigerLoginPage(driver);
		loginPage.loginToApplication(username, password);
		VTigerHomePage HomePage = new VTigerHomePage(driver);
		HomePage.clickOnOrganizationMenu();
		OrganizationPOM OrgPom = new OrganizationPOM(driver);
		OrgPom.createNewOrganization();
		
		//driver.findElement(By.css)
		
		creatingNewOrganizationPagePOM creatOrg = new creatingNewOrganizationPagePOM(driver);
		ExcelUtility eutil = new ExcelUtility();
//		String NoOfEmp = eutil.getDataFromExcel("Organization", 1, 3);
//		creatOrg.creatingNewOrganization(OrgName, WebLink, NoOfEmp);
//		String OrgName = eutil.getDataFromExcel("Organization", 4, 1);
//		String WebLink = eutil.getDataFromExcel("Organization", 4, 2);
//		String OtherEmail = eutil.getDataFromExcel("Organization", 4, 3);
//		String Industry = eutil.getDataFromExcel("Organization", 4, 4);
//		String Type = eutil.getDataFromExcel("Organization", 4, 5);
//		String phone = eutil.getDataFromExcel("Organization", 4, 6);
//
//		
//		creatOrg.creatingNewOrganization(OrgName, WebLink, OtherEmail, Industry, Type, phone);
		
		String Orgname = eutil.getDataFromExcel("Organization", 7, 1);
		String WebLink = eutil.getDataFromExcel("Organization", 7, 2);
		String Fax = eutil.getDataFromExcel("Organization", 7, 3);
		String OtherPhone = eutil.getDataFromExcel("Organization", 7, 4);
		String Email = eutil.getDataFromExcel("Organization", 7, 5);
		String OwnerShip = eutil.getDataFromExcel("Organization", 7, 6);
		String Rating = eutil.getDataFromExcel("Organization", 7, 7);
		String Revenue = eutil.getDataFromExcel("Organization", 7, 8);
		
		creatOrg.creatingNewOrganization(Orgname, WebLink, Fax, OtherPhone, Email, OwnerShip, Rating, Revenue);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
