package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NetBanking extends BasePage{
	
	public NetBanking(WebDriver driver){
		super(driver);
	}	

	
	@FindBy(xpath = "//*[@id=\"cartIcon\"]")
	private WebElement cartButton;

	@FindBy(xpath = "//*[@id=\"buynow_fl\"]")
	private WebElement buyNow;
	
	@FindBy(xpath = "//input[@type='radio']")
	private WebElement deliveryAddress;
	
	@FindBy(xpath = "//button[text()='Proceed']")
	private WebElement deliveryProceed;
	
	@FindBy(xpath = "//input[@value='Net Banking']")
	private WebElement selectPayment;
	
	@FindBy(xpath = "//input[@type='radio']")
	private WebElement bankInforadioButton;
	
	@FindBy(xpath = "//div[@class='payment_actionBtn__2KSX+']")
	private WebElement submit;
	
	
	@FindBy(xpath = "//input[@id= 'User ID']")
	private WebElement netBankingUserId;
	
	@FindBy(xpath = "//input[@id='Password']")
	private WebElement netBankingPwd;
	
	@FindBy(xpath = "//input[@id='submit']")
	private WebElement paymentSubmit;
	
	public WebElement getCartButton() {
		return cartButton;
	}

	public WebElement getBuyNow() {
		return buyNow;
	}

	public WebElement getDeliveryAddress() {
		return deliveryAddress;
	}

	public WebElement getDeliveryProceed() {
		return deliveryProceed;
	}

	public WebElement getSelectPayment() {
		return selectPayment;
	}

	public WebElement getBankInforadioButton() {
		return bankInforadioButton;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getNetBankingUserId() {
		return netBankingUserId;
	}

	public WebElement getNetBankingPwd() {
		return netBankingPwd;
	}

	public WebElement getPaymentSubmit() {
		return paymentSubmit;
	}

	public void performMenProduct(String userId, String pwd)
	{
		getCartButton().click();		
		getBuyNow().click();		
		getDeliveryAddress().click();
		getDeliveryProceed().click();
		getSelectPayment().click();
		getBankInforadioButton().click();
		getSubmit().click();
		getNetBankingUserId().sendKeys(userId);
		getNetBankingPwd().sendKeys(pwd);
		getPaymentSubmit().click();	
		
	}
	
}
