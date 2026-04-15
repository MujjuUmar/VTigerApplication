package TestCaseRepo;

import java.io.IOException;
//import java.util.Base64;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
//import POMclasses.ContactPOM;
import POMclasses.LeadsPOM;
import POMclasses.VTigerHomePage;
//import POMclasses.VTigerLoginPage;
//import POMclasses.creatingNewContactPage;
import POMclasses.creatingNewLeadsPage;
//import Pratice.VtigerLoginUsingPOM;
@Listeners(GenericUtility.ListenersImplimentation.class)
public class TC_02 extends BaseClass {
	@Test(groups = {"Somke" , "Regression" , "Sanity"})
	public void LE_002 () throws EncryptedDocumentException, IOException{
		VTigerHomePage HomePage = new VTigerHomePage(driver);
		HomePage.clickOnLeadsMenu();
		LeadsPOM leads = new LeadsPOM(driver);
		leads.clickONPlusIcon();
		creatingNewLeadsPage cnlp = new creatingNewLeadsPage(driver);
		String lname = eutil.getDataFromExcel("Leads", 4, 1);
		String Company = eutil.getDataFromExcel("Leads", 4, 2);
		String Title = eutil.getDataFromExcel("Leads", 4, 3);
		String LeadSource = eutil.getDataFromExcel("Leads", 4, 4);
		String NoOfEmp = eutil.getDataFromExcel("Leads", 4, 5);
		
		cnlp.creatingNewLead(lname, Company, Title, LeadSource, NoOfEmp);
		
	}
	
//	@Test
//	public void m1() {
//		System.out.println("Happy BirthDay Bro");
//	}
}
