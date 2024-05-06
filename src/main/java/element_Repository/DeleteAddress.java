package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteAddress extends BasePage{
	
	public DeleteAddress(WebDriver driver){
		super(driver);
	}	

	@FindBy(xpath = "/html/body/div[3]/div[1]")
	private WebElement accountSettingsButton;
		
	@FindBy(xpath = "/html/body/div[3]/div[3]/ul/li[1]]")
	private WebElement myProfileButton;	
	
	@FindBy(xpath = "/html/body/div[1]/section[2]/div/div/div[3]/a[2]/div")
	private WebElement myaddressesButton;
	
	@FindBy(xpath = "/html/body/div[1]/section[2]/div/section/div/div[2]/div/div[2]/div/button")
	private WebElement deleteAddressButton;
	
	@FindBy(xpath = "/html/body/div[3]/div[3]/div/div[2]/button[2]")
	private WebElement ConfirmYesButton;
	
	@FindBy(xpath = "/html/body/div[3]/div[3]/div/div[2]/button[1]")
	private WebElement ConfirmCancelButton;

	public WebElement getAccountSettingsButton() {
		return accountSettingsButton;
	}

	public WebElement getMyProfileButton() {
		return myProfileButton;
	}

	public WebElement getMyaddressesButton() {
		return myaddressesButton;
	}

	public WebElement getDeleteAddressButton() {
		return deleteAddressButton;
	}

	public WebElement getConfirmYesButton() {
		return ConfirmYesButton;
	}

	public WebElement getConfirmCancelButton() {
		return ConfirmCancelButton;
	}
	
	
	public void performDeleteAddress()
	{
		getAccountSettingsButton().click();
		getMyProfileButton().click();
		getMyaddressesButton().click();
		getDeleteAddressButton().click();			
		getConfirmYesButton().click();
		getConfirmCancelButton().click();
	}	
}
