package POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.SeleniumUtility;

public class creatingNewOrganizationPagePOM {
	
	/**
	 * This is to Declare the WebElemnt 
	 */
	
	@FindBy(name = "accountname")
	private WebElement OrganizationName;
	
	@FindBy(name = "website")
	private WebElement websiteLink;
	
	@FindBy(name = "employees")
	private WebElement NoOfEmp;
	
	@FindBy(name = "email2")
	private WebElement OtherEmailTextField;
	
	@FindBy(name = "industry")
	private WebElement industryDropDown;
	
	@FindBy(name = "accounttype")
	private WebElement indTypeDropDown;
	
	@FindBy(name = "phone")
	private WebElement phoneTextField;
	
	@FindBy(name = "fax")
	private WebElement faxTextField;
	
	@FindBy(name = "otherphone")
	private WebElement OtherPhoneTextField;
	
	@FindBy(name = "email1")
	private WebElement emaliTextField;
	
	@FindBy(name = "ownership")
	private WebElement OwnerShipTextField;
	
	@FindBy(name = "rating")
	private WebElement ratingDropDown;
	
	@FindBy(name = "annual_revenue")
	private WebElement revenueTextField;
	
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveButton;
	//This is to Initialize the WebElement
	
	
	public creatingNewOrganizationPagePOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	/**
	 * This is a public getter method
	 * @return
	 */


	public WebElement getOrganizationName() {
		return OrganizationName;
	}


	public WebElement getWebsiteLink() {
		return websiteLink;
	}


	public WebElement getNoOfEmp() {
		return NoOfEmp;
	}


	public WebElement getOtherEmailTextField() {
		return OtherEmailTextField;
	}


	public WebElement getIndustryDropDown() {
		return industryDropDown;
	}


	public WebElement getIndTypeDropDown() {
		return indTypeDropDown;
	}


	public WebElement getPhoneTextField() {
		return phoneTextField;
	}


	public WebElement getFaxTextField() {
		return faxTextField;
	}


	public WebElement getOtherPhoneTextField() {
		return OtherPhoneTextField;
	}


	public WebElement getEmaliTextField() {
		return emaliTextField;
	}


	public WebElement getOwnerShipTextField() {
		return OwnerShipTextField;
	}


	public WebElement getRatingDropDown() {
		return ratingDropDown;
	}


	public WebElement getRevenueTextField() {
		return revenueTextField;
	}
	
	public WebElement getSaveButton() {
		return saveButton;
	}
	
	// Utilizing the WebElement
	
	/**
	 *  This is Business Library to create a new Organization
	 * @param OrganizationName
	 * @param Website
	 * @param NoOfEmp
	 */
	public void creatingNewOrganization(String OrganizationName, String Website , String NoOfEmp) {
		getOrganizationName().sendKeys(OrganizationName);
		getWebsiteLink().sendKeys(Website);
		getNoOfEmp().sendKeys(NoOfEmp);
		getSaveButton().click();
	}
	
	
	/**
	 * This is a Business Library to create a new Organization
	 * @param OrganizationName
	 * @param Website
	 * @param Industry
	 * @param Type
	 * @param Phone
	 */
	public void creatingNewOrganization(String OrganizationName , String Website , String OtherMail , String Industry , String Type, String Phone ) {
		getOrganizationName().sendKeys(OrganizationName);
		getWebsiteLink().sendKeys(Website);
		getOtherEmailTextField().sendKeys(OtherMail);
		getIndustryDropDown().sendKeys(Industry);
		//new SeleniumUtility().handleDDUsingDeSelectByVisibleText(NoOfEmp, Industry);
		getIndTypeDropDown().sendKeys(Type);
		getOtherPhoneTextField().sendKeys(Phone);
		getSaveButton().click();
	}
	
	public void creatingNewOrganization(String OrganizationName , String Website , String Fax , String OtherPhone , String Email,
			String OwnerShip, String Rating , String Revenue) {
		getOrganizationName().sendKeys(OrganizationName);
		getWebsiteLink().sendKeys(Website);
		getFaxTextField().sendKeys(Fax);
		getOtherPhoneTextField().sendKeys(OtherPhone);
		getEmaliTextField().sendKeys(Email);
		getOwnerShipTextField().sendKeys(OwnerShip);
		getRatingDropDown().sendKeys(Rating);
		getRevenueTextField().sendKeys(Revenue);
		getSaveButton().click();
		
		
	}

	

}

















