package TestCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
//import GenericUtility.ExcelUtility;
//import GenericUtility.PropertiesUtility;
//import GenericUtility.SeleniumUtility;
import POMclasses.LeadsPOM;
import POMclasses.VTigerHomePage;
//import POMclasses.VTigerLoginPage;
import POMclasses.creatingNewLeadsPage;
@Listeners(GenericUtility.ListenersImplimentation.class)
public class TestCase_01 extends BaseClass {
	
	@Test(groups = {"Smoke" , "Regression"} , retryAnalyzer = GenericUtility.RetryAnalyzerImplementation.class)
	public void LE_001() throws EncryptedDocumentException, IOException {
		VTigerHomePage HomePage = new VTigerHomePage(driver);
		HomePage.clickOnLeadsMenu();
		LeadsPOM leadsPage = new LeadsPOM(driver);
		leadsPage.clickONPlusIcon();
		//Assert.fail();
		String fname = eutil.getDataFromExcel("Leads", 1, 1);
		String lname = eutil.getDataFromExcel("Leads", 1, 2);
		String Company =eutil.getDataFromExcel("Leads", 1, 3);
		creatingNewLeadsPage cnlp = new creatingNewLeadsPage(driver);
		cnlp.creatingNewLead(fname, lname, Company);
		
	}	
}