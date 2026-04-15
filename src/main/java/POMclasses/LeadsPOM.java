package POMclasses;

//import java.awt.print.PageFormat;
//import java.awt.print.Pageable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is a POM class for Leads WebPage
 */

public class LeadsPOM {
	
	//Declaring The WebElement
	
	@FindBy( xpath = "//img[@title = 'Create Lead...']")
	private WebElement plusIcon;
	/**
	 * //Initializing the WebElement
	 * @param driver
	 */
	public LeadsPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Public Getter Method's
 
	public WebElement getPlusIcon() {
		return plusIcon;
	}
	
	//Utilizing the WebElement
	
	public void clickONPlusIcon() {
		getPlusIcon().click();
	}

}
