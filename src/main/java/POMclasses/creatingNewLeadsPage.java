package POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.SeleniumUtility;

public class creatingNewLeadsPage {
	
	//Declaring The WebElement
	
	@FindBy(name = "firstname")
	private WebElement firstNameTextFiled;
	
	@FindBy(name = "lastname")
	private WebElement lasttNameTextFiled;
	
	@FindBy(name = "company")
	private WebElement companyNameTextFiled;
	
	@FindBy(id = "designation")
	private WebElement titalNameTextFiled;
	
	@FindBy(name = "leadsource")
	private WebElement LeadsSourseDropDown;
	
	@FindBy(id = "noofemployees")
	private WebElement noOfEmplTextField;
	
	@FindBy(id = "phone")
	private WebElement phoneNumberTextFiled;
	
	@FindBy(id = "email")
	private WebElement emailTextFiled;
	
	@FindBy(id = "city")
	private WebElement cityNameTextFiled;
	
	@FindBy(id = "state")
	private WebElement stateNameTextFiled;
	
	@FindBy(id = "country")
	private WebElement countryNameTextFiled;
	
	
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveButton;
	
	/*
	 * initializing Webelement
	 */
	
	public creatingNewLeadsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * //Public Getter Method's
	 */

	public WebElement getFirstNameTextFiled() {
		return firstNameTextFiled;
	}

	public WebElement getLasttNameTextFiled() {
		return lasttNameTextFiled;
	}

	public WebElement getCompanyNameTextFiled() {
		return companyNameTextFiled;
	}

	public WebElement getTitalNameTextFiled() {
		return titalNameTextFiled;
	}

	public WebElement getLeadsSourseDropDown() {
		return LeadsSourseDropDown;
	}

	public WebElement getNoOfEmplTextField() {
		return noOfEmplTextField;
	}

	public WebElement getPhoneNumberTextFiled() {
		return phoneNumberTextFiled;
	}

	public WebElement getEmailTextFiled() {
		return emailTextFiled;
	}

	public WebElement getCityNameTextFiled() {
		return cityNameTextFiled;
	}

	public WebElement getStateNameTextFiled() {
		return stateNameTextFiled;
	}

	public WebElement getCountryNameTextFiled() {
		return countryNameTextFiled;
	}
	
	public WebElement getSaveButton() {
		return saveButton;
	}
	
	/**
	 * This is Business Library to create a new Lead
	 * @param fname
	 * @param lname
	 * @param company
	 */
	
	public void creatingNewLead(String fname , String lname , String company ) {
		getFirstNameTextFiled().sendKeys(fname);
		getLasttNameTextFiled().sendKeys(lname);
		getCompanyNameTextFiled().sendKeys(company);
		getSaveButton().click();
		
	}
	/**
	 * This is a Business Library to create a new Lead
	 * @param lname
	 * @param company
	 * @param title
	 * @param LeadSource
	 * @param NoOfEmp
	 */
	public void creatingNewLead(String lname, String company , String title , String LeadSource , String NoOfEmp) {
		getLasttNameTextFiled().sendKeys(lname);
		getCompanyNameTextFiled().sendKeys(company);
		getTitalNameTextFiled().sendKeys(title);
		new SeleniumUtility().handleDDUsingSelectByValue(LeadsSourseDropDown, LeadSource);
		//getLeadsSourseDropDown().sendKeys(LeadSource);
		getNoOfEmplTextField().sendKeys(NoOfEmp);
		getSaveButton().click();
		
	}
	
	/**
	 * This is a Business Library to create a new lead
	 * @param lname
	 * @param company
	 * @param PhoneNo
	 * @param Email
	 * @param city
	 * @param state
	 * @param country
	 */
	public void creatingNewLead(String lname , String company , String PhoneNo , String Email , String city , 
			String state, String country) {
		getLasttNameTextFiled().sendKeys(lname);
		getCompanyNameTextFiled().sendKeys(company);
		getPhoneNumberTextFiled().sendKeys(PhoneNo);
		getEmailTextFiled().sendKeys(Email);
		getCityNameTextFiled().sendKeys(city);
		getStateNameTextFiled().sendKeys(state);
		getCountryNameTextFiled().sendKeys(country);
		getSaveButton().click();
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
