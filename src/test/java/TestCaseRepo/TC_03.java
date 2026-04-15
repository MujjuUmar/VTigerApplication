package TestCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import POMclasses.LeadsPOM;
import POMclasses.VTigerHomePage;
import POMclasses.creatingNewLeadsPage;
@Listeners(GenericUtility.ListenersImplimentation.class)
public class TC_03 extends BaseClass {
	
	@Test(groups = {"Smoke"})
	public void LE_003 () throws EncryptedDocumentException, IOException {
		VTigerHomePage HomePage = new VTigerHomePage(driver);
		HomePage.clickOnLeadsMenu();
		LeadsPOM leads = new LeadsPOM(driver);
		leads.clickONPlusIcon();
		creatingNewLeadsPage cnlp = new creatingNewLeadsPage(driver);
		String lname = eutil.getDataFromExcel("Leads", 7, 1);
		String Company = eutil.getDataFromExcel("Leads", 7, 2);
		String PhoneNo = eutil.getDataFromExcel("Leads", 7, 3);
		String Email = eutil.getDataFromExcel("Leads", 7, 4);
		String city = eutil.getDataFromExcel("Leads", 7, 5);
		String state = eutil.getDataFromExcel("Leads", 7, 6);
		String country = eutil.getDataFromExcel("Leads", 7, 6);
		
		cnlp.creatingNewLead(lname, Company, PhoneNo, Email, city, state, country);
		
	}

}
