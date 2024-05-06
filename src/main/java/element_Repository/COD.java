package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class COD extends BasePage{
	
	public COD(WebDriver driver){
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
	
	@FindBy(xpath = "//input[@value='COD']")
	private WebElement cod;
	
	@FindBy(xpath = "//button[text()='Proceed']")
	private WebElement paymentProceed;
		
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

	public WebElement getCod() {
		return cod;
	}

	public WebElement getPaymentProceed() {
		return paymentProceed;
	}

	public void performMenProduct()
	{
		getCartButton().click();		
		getBuyNow().click();		
		getDeliveryAddress().click();		
		getDeliveryProceed().click();
		getSelectPayment().click();		
		getCod().click();
		getPaymentProceed().click();		

	}
}
