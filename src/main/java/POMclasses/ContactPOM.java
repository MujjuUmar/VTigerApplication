package POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is a POM class for Contacts WebPage
 */

public class ContactPOM {
	
	//Declaring The WebElement
	
	@FindBy( xpath =  "//img[@title='Create Contact...']")
	WebElement createNewContact;
	
	/**
	 * //Initializing the WebElement
	 * @param driver
	 */
	
	public ContactPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//Public Getter Method's
	
	public WebElement getCreateNewContact() {
		return createNewContact;
	}
	
	//Utilizing the WebElement

	public void clickOnCreateNewContactIcon() {
		getCreateNewContact().click();
	}
	
}
