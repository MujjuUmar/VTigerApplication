package POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPOM {
	
	/**
	 * This is to Declaring The WebElement
	 */
	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement createIcon;

	/**
	 * This is to Initialize the WebElement
	 * @param driver
	 */
	public OrganizationPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//Public Getter Method's
	 
	public WebElement getCreateIcon() {
		return createIcon;
	}
	
	///Utilizing the WebElement
	
	public void createNewOrganization() {
		getCreateIcon().click();
	}
	
}
