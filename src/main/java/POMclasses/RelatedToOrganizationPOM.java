package POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RelatedToOrganizationPOM {
	
	// Declaring the WebElement
	
	@FindBy(xpath = "(//img[@title='Select'])[1]")
	private WebElement relatedToTextfield;
	
	//Initializing the WebElement
	
	public RelatedToOrganizationPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Public Getter Method
	
	public WebElement getRelatedToTextfield() {
		return relatedToTextfield;
	}
	
	public void clickOnRelatedField() {
		getRelatedToTextfield().click();
	}
	

}
