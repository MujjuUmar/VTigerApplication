package TestCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import POMclasses.ContactPOM;
import POMclasses.VTigerHomePage;
import POMclasses.creatingNewContactPage;

public class TC_06 extends BaseClass {
	@Test(groups = {"Smoke" , "Sanity"})
	public void CON__003 () throws EncryptedDocumentException, IOException {
		VTigerHomePage HomePage = new  VTigerHomePage(driver);
		HomePage.clickOnContactMenu();
		ContactPOM contact = new ContactPOM(driver);
		contact.clickOnCreateNewContactIcon();
		creatingNewContactPage cncp = new creatingNewContactPage(driver);
		
		String lname = eutil.getDataFromExcel("Contact", 7, 1);
		String Title = eutil.getDataFromExcel("Contact", 7, 2);
		String email = eutil.getDataFromExcel("Contact", 7, 3);
		String mailingCity = eutil.getDataFromExcel("Contact", 7, 4);
		String mailingstate = eutil.getDataFromExcel("Contact", 7, 5);
		String mailingCountry = eutil.getDataFromExcel("Contact", 7, 6);
		cncp.createNewContact(lname, Title, email, mailingCity, mailingstate, mailingCountry);
		
		
	}
}