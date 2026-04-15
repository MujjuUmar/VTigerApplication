package POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is a POM class for Login Webpage
 */
public class VTigerLoginPage {
	
	//Declaring The WebElement
	
	@FindBy(name="user_name") 
	WebElement usernameTextField;
	
	@FindBy ( name = "user_password")
	WebElement passwordTextField;
	
	@FindBy ( id = "submitButton")
	WebElement loginButton;
	
	//Initializing The WebElement

	
	public VTigerLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//Public Getter Method
	
	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	//Utilizing the WebElement
	
	public void loginToApplication( String UN , String Pwd) {
		getUsernameTextField().sendKeys(UN);
		getPasswordTextField().sendKeys(Pwd);
		getLoginButton().click();
	}
	
	
	
}
