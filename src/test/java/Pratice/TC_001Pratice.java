package Pratice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.ExcelUtility;
import GenericUtility.PropertiesUtility;
import GenericUtility.SeleniumUtility;
import POMclasses.LeadsPOM;
import POMclasses.VTigerHomePage;
import POMclasses.VTigerLoginPage;
import POMclasses.creatingNewLeadsPage;

public class TC_001Pratice extends BaseClass {
	
	@Test
	public void createNewLeads() throws IOException {
		VTigerHomePage HomePage = new VTigerHomePage(driver);
		HomePage.clickOnLeadsMenu();
		LeadsPOM leads= new LeadsPOM(driver);
		leads.clickONPlusIcon();
		creatingNewLeadsPage cnlp = new creatingNewLeadsPage(driver);
		String fname = eutil.getDataFromExcel("Leads", 1, 1);
		String lname = eutil.getDataFromExcel("Leads", 1, 2);
		String Company = eutil.getDataFromExcel("Leads", 1, 3);
		
		cnlp.creatingNewLead(fname, lname, Company);
		
//		HomePage.performSignOut();
//		driver.quit();
		
		
	
		
		
	}

}
