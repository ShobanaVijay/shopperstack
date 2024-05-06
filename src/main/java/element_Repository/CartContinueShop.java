package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartContinueShop extends BasePage{
	
	public CartContinueShop(WebDriver driver){
		super(driver);
	}	
	
	@FindBy(xpath = "//a[@id='men']")
	private WebElement menMenuButton;
	
	@FindBy(xpath = "//a[text()='T-shirts']")
	private WebElement subCategoryButton;
	
	@FindBy(xpath = "/html/body/div[1]/div[4]/div/div/div[2]/div[3]/div[2]/button")
	private WebElement addToCartButton;
	
	@FindBy(xpath = "//*[@id=\"cartIcon\"]")
	private WebElement cartButton;
	
	@FindBy(xpath = "//span[text()='Continue Shopping']")
	private WebElement continueShopButton;
	

	public WebElement getMenMenuButton() {
		return menMenuButton;
	}

	public WebElement getSubCategoryButton() {
		return subCategoryButton;
	}

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}

	public WebElement getCartButton() {
		return cartButton;
	}

	public WebElement getContinueShopButton() {
		return continueShopButton;
	}
	
	
	public void performCartContinue()
	{
		getMenMenuButton().click();		
		getSubCategoryButton().click();		
		getAddToCartButton().click();		
		getCartButton().click();
		getContinueShopButton().click();
	}	

}
