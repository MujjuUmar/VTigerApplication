package POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpportunitiesPOM {
	
	/**
	 * Declaring The WebElement
	 */
	@FindBy( xpath = "//img[@title='Create Opportunity...']")
	private WebElement createNewOpportunities;

	
	 /**
	 * //Initializing the WebElement
	 * @param driver
	 */
	public OpportunitiesPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	////Public Getter Method's
	
	 public WebElement getCreateNewOpportunities() {
		 return createNewOpportunities;
	 }
	 
	 public void createNewOpportunitiesIcon() {
		 getCreateNewOpportunities().click();
	 }
	
}
