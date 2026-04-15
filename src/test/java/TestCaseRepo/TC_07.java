package TestCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import POMclasses.OrganizationPOM;
import POMclasses.VTigerHomePage;
import POMclasses.creatingNewOrganizationPagePOM;

public class TC_07 extends BaseClass {
	@Test(groups = {"Regression" , "Smoke"})
	public void Org_001 () throws EncryptedDocumentException, IOException {
		VTigerHomePage Homepage = new VTigerHomePage(driver);
		Homepage.clickOnOrganizationMenu();
		OrganizationPOM OrgPage = new OrganizationPOM(driver);
		OrgPage.createNewOrganization();
		
		creatingNewOrganizationPagePOM cnop = new creatingNewOrganizationPagePOM(driver);
		
		String PrgName = eutil.getDataFromExcel("Organization", 1, 1);
		String Website = eutil.getDataFromExcel("Organization", 1, 2);
		String NoOfEmp = eutil.getDataFromExcel("Organization", 1, 3);
		
		
		cnop.creatingNewOrganization(PrgName, Website, NoOfEmp);
		
		sutil.acceptAlertPopup(driver);
				
	}

}
