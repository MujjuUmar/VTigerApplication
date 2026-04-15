package POMclasses;

import java.awt.print.PageFormat;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.AddHasCasting;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import GenericUtility.SeleniumUtility;

public class creatingNewOpportunitiesPagePOM {
	
	 WebDriver driver;
	//Declaring the WebElement
	
	@FindBy(name = "potentialname")
	private WebElement OrganizationName;
	
	@FindBy(xpath =  "(//img[@title='Select'])[1]")
	private WebElement RelatedToTextField;
	
	@FindBy(name = "opportunity_type")
	private WebElement TypeDropDown;
	
	@FindBy(name = "leadsource")
	private WebElement leadSourceDropDown;
	
	@FindBy(name ="amount")
	private WebElement amountTextField;
	
	@FindBy(name = "nextstep")
	private WebElement NextStepTextField;
	
	@FindBy(name = "sales_stage")
	private WebElement SalesStageDropDown;
	
	@FindBy(name = "probability")
	private WebElement probabilityTextField;
	
	@FindBy(name = "description")
	private WebElement descriptionTextField;
	
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveButton;
	
	//Initializing The WebElement
	
	public creatingNewOpportunitiesPagePOM(WebDriver driver) {
		  //this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//Public Getter's Method's

	public WebElement getOrganizationName() {
		return OrganizationName;
	}

	public WebElement getRelatedToTextField() {
		return RelatedToTextField;
	}

	public WebElement getTypeDropDown() {
		return TypeDropDown;
	}

	public WebElement getLeadSourceDropDown() {
		return leadSourceDropDown;
	}

	public WebElement getAmountTextField() {
		return amountTextField;
	}

	public WebElement getNextStepTextField() {
		return NextStepTextField;
	}

	public WebElement getSalesStageDropDown() {
		return SalesStageDropDown;
	}

	public WebElement getProbabilityTextField() {
		return probabilityTextField;
	}

	public WebElement getDescriptionTextField() {
		return descriptionTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	//Utilizing the WebElement
	
	public void createNewOpportunity(String OrgName , String relatedTo , String Type) {
		getOrganizationName().sendKeys(OrgName);
		getRelatedToTextField().sendKeys(relatedTo);
		getTypeDropDown().sendKeys(Type);
		getSaveButton().click();
	}
	
	public void createNewOpportunity(String OrgName , String relatedTo,  String leadSource , String Amount , String NextSteps) {
		getOrganizationName().sendKeys(OrgName);
		//getRelatedToTextField().sendKeys(relatedTo);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(RelatedToTextField));
		getRelatedToTextField().sendKeys(relatedTo);
		
		getLeadSourceDropDown().sendKeys(leadSource);
		getAmountTextField().sendKeys(Amount);
		getNextStepTextField().sendKeys(NextSteps);
		getSaveButton().click();
		
	}
	
	
	

	
}
