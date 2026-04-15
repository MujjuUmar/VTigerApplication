package TestCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import POMclasses.ContactPOM;
import POMclasses.VTigerHomePage;
import POMclasses.creatingNewContactPage;
@Listeners(GenericUtility.ListenersImplimentation.class)
public class TC_04 extends BaseClass{
	@Test(groups = {"Regression"})
	public void CON_01 () throws EncryptedDocumentException, IOException{
		VTigerHomePage HomePage = new  VTigerHomePage(driver);
		HomePage.clickOnContactMenu();
		ContactPOM contact = new ContactPOM(driver);
		contact.clickOnCreateNewContactIcon();
		creatingNewContactPage cncp = new creatingNewContactPage(driver);
		
		String lname = eutil.getDataFromExcel("Contact", 1, 1);
		String fname = eutil.getDataFromExcel("Contact", 1, 2);
		String LeasSource = eutil.getDataFromExcel("Contact", 1, 3);
		
		cncp.createNewContact(lname, fname, LeasSource);
	}

}
