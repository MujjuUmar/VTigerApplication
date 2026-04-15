package Pratice;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import GenericUtility.PropertiesUtility;
import GenericUtility.SeleniumUtility;
import POMclasses.OpportunitiesPOM;
import POMclasses.VTigerHomePage;
import POMclasses.VTigerLoginPage;
import POMclasses.creatingNewOpportunitiesPagePOM;

public class Pratice {
	public static void main(String[] args) throws IOException {
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
//		String Pid = driver.getWindowHandle();
//		driver.findElement(By.xpath("(//img[@title='Select'])[1]")).click();
//		Set<String> Allpid = driver.getWindowHandles();
//		for(String id:Allpid) {
//			if(!id.equals(Pid)) {
//				driver.switchTo().window(id);
//			}
//		}
//		driver.findElement(By.xpath("//a[@id='1']")).click();
		creatingNewOpportunitiesPagePOM Oppo= new creatingNewOpportunitiesPagePOM(driver);
		
		
	}
	
}
