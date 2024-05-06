package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout extends BasePage
{
	public Logout(WebDriver driver){
		super(driver);
	}
	

	@FindBy(xpath = "/html/body/div[3]/div[1]")
	private WebElement accountSettingsButton;

	@FindBy(xpath = "LogoutButton")
	private WebElement logoutButton;

	public WebElement getAccountSettingsButton() {
		return accountSettingsButton;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}

	public void performLogout()
	{
		getAccountSettingsButton().click();
		getLogoutButton().click();
	}
}
