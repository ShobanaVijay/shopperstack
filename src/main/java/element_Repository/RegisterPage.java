package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage
{
	public RegisterPage(WebDriver driver){
		super(driver);
	}
	
	@FindBy(xpath = "//input[@id='Create Account']")
	private WebElement createAccountButton;
	
	@FindBy(xpath = "//input[@id='First Name']")
	private WebElement firstName;
	
	@FindBy(xpath = "//input[@id='Last Name']")
	private WebElement lastName;
	
	@FindBy(xpath = "//input[@id='Female']")
	private WebElement genderRadioButton;
	
	@FindBy(xpath = "//input[@id='Phone Number']")
	private WebElement phoneNumber;
	
	@FindBy(xpath = "//input[@id='Email Address']")
	private WebElement emailAddress;
	
	@FindBy(xpath = "//input[@id='Password']")
	private WebElement password;	

	@FindBy(xpath = "//input[@id='Confirm Password']")
	private WebElement confirmPassword;
	
	@FindBy(xpath = "//input[@id='Terms and Conditions']")
	private WebElement termsConditions;
	
	@FindBy(xpath = "//input[@id='Register']")
	private WebElement registerButton;
	
	
	public WebElement getCreateAccountButton() {
		return createAccountButton;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getGenderRadioButton() {
		return genderRadioButton;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public WebElement getEmailAddress() {
		return emailAddress;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmPassword() {
		return confirmPassword;
	}

	public WebElement getTermsConditions() {
		return termsConditions;
	}
	

	public void performRegister(String firstName, String lastName,String phoneNumber,String email,String password,
			String confirmPassword)
	{
		getCreateAccountButton().click();
		getFirstName().sendKeys(firstName);
	    getLastName().sendKeys(lastName);
	    getGenderRadioButton().click();
		getPhoneNumber().sendKeys(phoneNumber);		
		getEmailAddress().sendKeys(email);
		getPassword().sendKeys(password);
		getConfirmPassword().sendKeys(confirmPassword);
		getTermsConditions().click();
		getRegisterButton().click();
	}
}
