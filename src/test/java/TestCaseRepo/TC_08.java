package TestCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import POMclasses.OrganizationPOM;
import POMclasses.VTigerHomePage;
import POMclasses.creatingNewOrganizationPagePOM;

public class TC_08 extends BaseClass {
	@Test(groups = {"Sanity"})
	public void Org__002() throws EncryptedDocumentException, IOException {
		VTigerHomePage HomePage = new VTigerHomePage(driver);
		HomePage.clickOnOrganizationMenu();
		OrganizationPOM Orgpom = new OrganizationPOM(driver);
		Orgpom.createNewOrganization();
		
		creatingNewOrganizationPagePOM cnop = new creatingNewOrganizationPagePOM(driver);
		
		
		
		String Orgname = eutil.getDataFromExcel("Organization", 4, 1);
		String Website = eutil.getDataFromExcel("Organization", 4, 2);
		String OtherMail = eutil.getDataFromExcel("Organization", 4, 3);
		String Industry = eutil.getDataFromExcel("Organization", 4, 4);
		String Tyoe = eutil.getDataFromExcel("Organization", 4, 5);
		String Phone = eutil.getDataFromExcel("Organization", 4, 6);
		
		cnop.creatingNewOrganization(Orgname, Website, OtherMail, Industry, Tyoe, Phone);
		
		sutil.acceptAlertPopup(driver);
	}

}
