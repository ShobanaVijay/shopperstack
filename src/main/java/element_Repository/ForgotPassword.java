package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPassword extends BasePage
{
	public ForgotPassword(WebDriver driver){
		super(driver);
	}	
	
	@FindBy(xpath = "//*[@id=\"Forgot Password?\"]")
	private WebElement forgotPasswordButton;
	
	@FindBy(xpath = "//input[@id='Email Address']")
	private WebElement emailAddress;
	
	@FindBy(xpath = "//input[@id='Proceed']")
	private WebElement proceedButton;
	
	@FindBy(xpath = "//input[@id='resetlink']")
	private WebElement resetLinkButton;

	public WebElement getForgotPasswordButton() {
		return forgotPasswordButton;
	}

	public WebElement getEmailAddress() {
		return emailAddress;
	}

	public WebElement getProceedButton() {
		return proceedButton;
	}

	public WebElement getResetLinkButton() {
		return resetLinkButton;
	}
	
	
	public void performForgotPassword(String email)
	{
		getForgotPasswordButton().click();
		getEmailAddress().sendKeys(email);
	    getProceedButton().click();
	    getResetLinkButton().click();
	}
}
