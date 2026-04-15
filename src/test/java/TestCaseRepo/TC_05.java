package TestCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import POMclasses.ContactPOM;
import POMclasses.VTigerHomePage;
import POMclasses.creatingNewContactPage;

public class TC_05 extends BaseClass {
	@Test(groups = { "Sanity"})
	public void CON_002() throws EncryptedDocumentException, IOException {
		VTigerHomePage HomePage = new  VTigerHomePage(driver);
		HomePage.clickOnContactMenu();
		ContactPOM contact = new ContactPOM(driver);
		contact.clickOnCreateNewContactIcon();
		creatingNewContactPage cncp = new creatingNewContactPage(driver);
		
		String lname = eutil.getDataFromExcel("Contact", 4, 1);
		String Dept = eutil.getDataFromExcel("Contact", 4, 2);
		String email = eutil.getDataFromExcel("Contact", 4, 3);
		
		String Mobile = eutil.getDataFromExcel("Contact", 4, 4);
		
		cncp.createNewContact(lname, Dept, email, Mobile);
	}

}
