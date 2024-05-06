package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditAddress extends BasePage{
	
	public EditAddress(WebDriver driver){
		super(driver);
	}	
	

	@FindBy(xpath = "/html/body/div[3]/div[1]")
	private WebElement accountSettingsButton;
		
	@FindBy(xpath = "/html/body/div[3]/div[3]/ul/li[1]]")
	private WebElement myProfileButton;		
	
	@FindBy(xpath = "/html/body/div[1]/section[2]/div/div/div[3]/a[2]/div")
	private WebElement myaddressesButton;	
	
	@FindBy(xpath = "//*[@id=\"editaddress_fl\"]")
	private WebElement editAddressButton;
	
	@FindBy(xpath = "//input[@id='Home']")
	private WebElement addressTypeRadioButton;
	
	@FindBy(xpath = "//input[@id='Name']")
	private WebElement name;	
	
	@FindBy(xpath = "//input[@id='House/Office Info']")
	private WebElement houseInfo;
	
	@FindBy(xpath = "//input[@id='Street Info']")
	private WebElement streetInfo;
	
	@FindBy(xpath = "//input[@id='Landmark']")
	private WebElement landMark;
	
	@FindBy(xpath = "//select[@id='Country']")
	private WebElement country;
	
	@FindBy(xpath = "//select[@id='State']")
	private WebElement state;
	
	@FindBy(xpath = "//select[@id='City']")
	private WebElement city;	
	
	@FindBy(xpath = "//input[@id='Pincode']")
	private WebElement pinCode;	

	@FindBy(xpath = "//input[@id='Phone Number']")
	private WebElement phoneNumber;
	
	@FindBy(xpath = "//button[@id='Update Address']")
	private WebElement updateAddressButton;
	
	public WebElement getAccountSettingsButton() {
		return accountSettingsButton;
	}

	public WebElement getMyProfileButton() {
		return myProfileButton;
	}

	public WebElement getMyaddressesButton() {
		return myaddressesButton;
	}
	
	public WebElement getEditAddressButton() {
		return editAddressButton;
	}

	public WebElement getAddressTypeRadioButton() {
		return addressTypeRadioButton;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getHouseInfo() {
		return houseInfo;
	}

	public WebElement getStreetInfo() {
		return streetInfo;
	}

	public WebElement getLandMark() {
		return landMark;
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

	public WebElement getPinCode() {
		return pinCode;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	
	public WebElement getUpdateAddressButton() {
		return updateAddressButton;
	}
	

	public void performEditAddress(String name, String houseInfo,String streetInfo,String landmark,
			String country,String state,String city,String pinCode,String phoneNumber)
	{
		getAccountSettingsButton().click();
		getMyProfileButton().click();
		getMyaddressesButton().click();
		getEditAddressButton().click();
		getAddressTypeRadioButton().click();
		getName().sendKeys(name);
	    getHouseInfo().sendKeys(houseInfo);
	    getStreetInfo().sendKeys(streetInfo);
	    getLandMark().sendKeys(landmark);
	    getCountry().sendKeys(country);
		getState().sendKeys(state);
		getCity().sendKeys(city);
		getPinCode().sendKeys(pinCode);
		getPhoneNumber().sendKeys(phoneNumber);		
		getUpdateAddressButton().click();
	}	
}
