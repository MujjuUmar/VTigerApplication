package POMclasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This is a POM class for Home WebPage
 */

public class VTigerHomePage {
	
	//Declaring The WebElement
	public WebDriver driver;
	
	@FindBy( xpath = "//td[@class='tabUnSelected']/a[text()='Leads']")
	private WebElement leadsMenu;
	
	@FindBy ( xpath = "//a[text()='Contacts']")
	private WebElement contactMenu;
	
	@FindBy ( xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement accountIcon;
	
	@FindBy (xpath = "//a[text()='Sign Out']")
	private WebElement signOutOperation;
	
	@FindBy( xpath = "//a[text()='Organizations']")
	private WebElement OrganizationMenu;
	
	@FindBy( xpath = "(//a[text()='Opportunities'])[1]")
	private WebElement OpportunitiesIcon;
	
	//Initializing the WebElement
	
	
	public VTigerHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Public getter

	public WebElement getLeadsMenu() {
		return leadsMenu;
	}

	public WebElement getContactMenu() {
		return contactMenu;
	}

	public WebElement getAccountIcon() {
		return accountIcon;
	}

	public WebElement getSignOutOperation() {
		return signOutOperation;
	}
	
	public WebElement getOrganizationMenu() {
		return OrganizationMenu;
	}
	
	public WebElement getOpportunitiesIcon() {
		return OpportunitiesIcon;
		
	}
	//Utilizing the WebElement
	
	public void clickOnLeadsMenu() {
		getLeadsMenu().click();
	}
	
	public void clickOnContactMenu() {
		getContactMenu().click();
	}
	
	public void performSignOut() throws InterruptedException {
		Thread.sleep(3000);
		
		getAccountIcon().click();
		getSignOutOperation().click();
		
	}
	
	public void clickOnOrganizationMenu() {
		getOrganizationMenu().click();
	}
	
	public  void clickOnOpportunitiesMenu() {
		getOpportunitiesIcon().click();
		
	}
	

}
