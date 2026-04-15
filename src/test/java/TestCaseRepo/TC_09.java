package TestCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import POMclasses.OrganizationPOM;
import POMclasses.VTigerHomePage;
import POMclasses.creatingNewOrganizationPagePOM;

public class TC_09 extends BaseClass {
	@Test(groups = {"Regression"})
	public void Org_003 () throws EncryptedDocumentException, IOException {
		VTigerHomePage HomePage = new VTigerHomePage(driver);
		HomePage.clickOnOrganizationMenu();
		OrganizationPOM Orgpom = new OrganizationPOM(driver);
		Orgpom.createNewOrganization();
		
		creatingNewOrganizationPagePOM cnop = new creatingNewOrganizationPagePOM(driver);
		
		String Orgname = eutil.getDataFromExcel("Organization", 7, 1);
		String Website = eutil.getDataFromExcel("Organization", 7, 2);
		String Fax = eutil.getDataFromExcel("Organization", 7, 3);
		String OtherPhone = eutil.getDataFromExcel("Organization", 7, 4);
		String Email = eutil.getDataFromExcel("Organization", 7, 5);
		String OwnerShip = eutil.getDataFromExcel("Organization", 7, 6);
		String rating = eutil.getDataFromExcel("Organization", 7, 7);
		String AnnualRevenue = eutil.getDataFromExcel("Organization", 7, 8);
		
		cnop.creatingNewOrganization(Orgname, Website, Fax, OtherPhone, Email, OwnerShip, rating, AnnualRevenue);
		
		sutil.acceptAlertPopup(driver);
	}
	

}
