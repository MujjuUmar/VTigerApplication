package POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class creatingNewContactPage {
	
	
	/*
	 * Declaring The WebElement
	 */
	
	@FindBy(name = "lastname")
	private WebElement lastNameTextFiled;
	
	@FindBy(name = "firstname")
	private WebElement firstNameTextField;
	
	@FindBy(name = "leadsource")
	private WebElement LeadSourceNameTextFiled;
	
	@FindBy(name = "department")
	private WebElement DepartNameNameTextFiled;
	
	@FindBy(id = "email")
	private WebElement eMailNameTextFiled;
	
	@FindBy(id = "mobile")
	private WebElement MobileNameTextFiled;
	
	@FindBy(id = "title")
	private WebElement titleNameTextFiled;
	
	@FindBy(id = "mailingcity")
	private WebElement MailingCityNameTextFiled;
	
	@FindBy(name = "mailingstate")
	private WebElement MailingStateTextFiled;
	
	@FindBy(name = "mailingcountry")
	private WebElement MailingCountryNameTextFiled;
	
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveButton;

	/*
	 * initializing WebElement
	 */
	
	
	public creatingNewContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	

	/*
	 * //Public Getter Method's
	 */

	public WebElement getLastNameTextFiled() {
		return lastNameTextFiled;
	}

	public WebElement getfirstNameTextFiled() {
		return firstNameTextField;
	}

	public WebElement getLeadSourceNameTextFiled() {
		return LeadSourceNameTextFiled;
	}

	public WebElement getDepartNameNameTextFiled() {
		return DepartNameNameTextFiled;
	}

	public WebElement geteMailNameTextFiled() {
		return eMailNameTextFiled;
	}

	public WebElement getMobileNameTextFiled() {
		return MobileNameTextFiled;
	}

	public WebElement getTitleNameTextFiled() {
		return titleNameTextFiled;
	}

	public WebElement getMailingCityNameTextFiled() {
		return MailingCityNameTextFiled;
	}

	public WebElement getMailingStateTextFiled() {
		return MailingStateTextFiled;
	}

	public WebElement getMailingCountryNameTextFiled() {
		return MailingCountryNameTextFiled;
	}
	
	public WebElement getSaveButto() {
		return saveButton;
	}
	
	/**
	 * This is a Business Library to create new Contacts
	 * @param lname
	 * @param fname
	 * @param LeadSource
	 */
	
	public void createNewContact(String lname , String fName , String LeadSource) {
		getLastNameTextFiled().sendKeys(lname);
		getfirstNameTextFiled().sendKeys(fName);
		getLeadSourceNameTextFiled().sendKeys(LeadSource);
		getSaveButto().click();
	}
	
	/**
	 * This is a Business Library to create a new Contact
	 * @param lname
	 * @param Dept
	 * @param mail
	 * @param mobile
	 */
	public void createNewContact(String lname , String Dept , String mail , String mobile) {
		getLastNameTextFiled().sendKeys(lname);
		getDepartNameNameTextFiled().sendKeys(Dept);
		geteMailNameTextFiled().sendKeys(mail);
		getMobileNameTextFiled().sendKeys(mobile);
		getSaveButto().click();
		
	}
	
	/**
	 * This is a Business Library to create a new Contact
	 * @param lname
	 * @param title
	 * @param mail
	 * @param MailingCity
	 * @param MailingState
	 * @param MailingCountry
	 */
	
	public void createNewContact(String lname , String title , String mail , String MailingCity , String MailingState , String MailingCountry) {
		getLastNameTextFiled().sendKeys(lname);
		getTitleNameTextFiled().sendKeys(title);
		geteMailNameTextFiled().sendKeys(mail);
		getMailingCityNameTextFiled().sendKeys(MailingCity);
		getMailingStateTextFiled().sendKeys(MailingState);
		getMailingCountryNameTextFiled().sendKeys(MailingCountry);
		getSaveButto().click();
		
		
		
		
	}
	
	
}


