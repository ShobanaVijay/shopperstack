package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditProfile extends BasePage{
	
	public EditProfile(WebDriver driver){
		super(driver);
	}	
	
	@FindBy(xpath = "/html/body/div[3]/div[1]")
	private WebElement accountSettingsButton;
		
	@FindBy(xpath = "/html/body/div[3]/div[3]/ul/li[1]]")
	private WebElement myProfileButton;	
	
	@FindBy(xpath = "/html/body/div[1]/section[2]/div/section/section/div[1]/button")
	private WebElement editProfileButton;
	
	@FindBy(xpath = "//input[@id='First Name']")
	private WebElement firstName;
	
	@FindBy(xpath = "//input[@id='Last Name']")
	private WebElement lastName;
	
	@FindBy(xpath = "//*[@id=\":rg:\"]")
	private WebElement dob;
	
	@FindBy(xpath = "//input[@id='Phone Number']")
	private WebElement phoneNumber;
	
	@FindBy(xpath = "//select[@id='Country']")
	private WebElement country;
	
	@FindBy(xpath = "//select[@id='State']")
	private WebElement state;
	
	@FindBy(xpath = "//select[@id='City']")
	private WebElement city;
	
	@FindBy(xpath = "//button[@id='submit']")
	private WebElement submitButton;

	public WebElement getAccountSettingsButton() {
		return accountSettingsButton;
	}

	public WebElement getMyProfileButton() {
		return myProfileButton;
	}

	public WebElement getEditProfileButton() {
		return editProfileButton;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getDob() {
		return dob;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}
	

	public void performEditProfile(String firstName, String lastName,String dob,String phoneNumber,String country,
			String state,String city)
	{
		getAccountSettingsButton().click();
		getMyProfileButton().click();
		getEditProfileButton().click();
		getFirstName().sendKeys(firstName);
	    getLastName().sendKeys(lastName);
	    getDob().click();
		getPhoneNumber().sendKeys(phoneNumber);		
		getCountry().sendKeys(country);
		getState().sendKeys(state);
		getCity().sendKeys(city);
		getSubmitButton().click();
	}
}
