package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RemoveCart extends BasePage{
	
	public RemoveCart(WebDriver driver){
		super(driver);
	}	

	@FindBy(xpath = "//*[@id=\"cartIcon\"]")
	private WebElement cartButton;
	
	@FindBy(xpath = "/html/body/div[1]/section[2]/article/div[1]/div[1]/div[1]/div[2]/div[3]/button")
	private WebElement removeCartButton;		

	@FindBy(xpath = "/html/body/div[3]/div[3]/div/div[2]/button[2]")
	private WebElement ConfirmYesButton;
	
	@FindBy(xpath = "/html/body/div[3]/div[3]/div/div[2]/button[1]")
	private WebElement ConfirmCancelButton;
	
	public WebElement getCartButton() {
		return cartButton;
	}

	public WebElement getRemoveCartButton() {
		return removeCartButton;
	}

	public WebElement getConfirmYesButton() {
		return ConfirmYesButton;
	}

	public WebElement getConfirmCancelButton() {
		return ConfirmCancelButton;
	}
	
	public void performRemoveCart()
	{
		getCartButton().click();		
		getRemoveCartButton().click();		
		getConfirmYesButton().click();		
		getConfirmCancelButton().click();
	}	
}
