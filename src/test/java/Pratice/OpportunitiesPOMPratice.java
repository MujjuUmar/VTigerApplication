package Pratice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

import GenericUtility.ExcelUtility;
import GenericUtility.PropertiesUtility;
import GenericUtility.SeleniumUtility;
import POMclasses.OpportunitiesPOM;
import POMclasses.RelatedToOrganizationPOM;
import POMclasses.VTigerHomePage;
import POMclasses.VTigerLoginPage;
import POMclasses.creatingNewOpportunitiesPagePOM;
import POMclasses.creatingNewOrganizationPagePOM;

public class OpportunitiesPOMPratice {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		PropertiesUtility putil= new PropertiesUtility();
		SeleniumUtility sutil = new SeleniumUtility();
		String Url = putil.getDataFromProperties("url");
		String username = putil.getDataFromProperties("username");
		String password = putil.getDataFromProperties("password");
		WebDriver driver = new ChromeDriver();
		sutil.implicitWait(driver, 60);
		sutil.accessWebApplication(driver, Url);
		sutil.maximizationOfWebApp(driver);
		VTigerLoginPage LoginPage = new VTigerLoginPage(driver);
		LoginPage.loginToApplication(username, password);
		VTigerHomePage HomePage = new VTigerHomePage(driver);
		HomePage.clickOnOpportunitiesMenu();
		OpportunitiesPOM newOppo = new OpportunitiesPOM(driver);
		newOppo.createNewOpportunitiesIcon();
		creatingNewOpportunitiesPagePOM Opportunity = new creatingNewOpportunitiesPagePOM(driver);
		ExcelUtility eutil = new ExcelUtility();
		String OrgName = eutil.getDataFromExcel("Opportunity", 4, 1);
		RelatedToOrganizationPOM relOrg = new RelatedToOrganizationPOM(driver);
		relOrg.clickOnRelatedField();
		sutil.switchToSecondTab(driver);
		String relatedTo = eutil.getDataFromExcel("Opportunity", 4, 2);
		//String Type = eutil.getDataFromExcel("Opportunity", 1, 3);
		
		//Opportunity.createNewOpportunity(OrgName, relatedTo, Type);
		String leadSourse = eutil.getDataFromExcel("Opportunity", 4, 3);
		String Amount = eutil.getDataFromExcel("Opportunity", 4, 4);
		String NextSteps = eutil.getDataFromExcel("Opportunity", 4, 5);

		Opportunity.createNewOpportunity(OrgName, relatedTo, leadSourse, Amount, NextSteps);
		
		
		
		

	}

}
