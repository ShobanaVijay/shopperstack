package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCart extends BasePage{
	
	public AddCart(WebDriver driver){
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
	
	
	public void performAddCart()
	{
		getMenMenuButton().click();		
		getSubCategoryButton().click();		
		getAddToCartButton().click();		
		getCartButton().click();
	}	
	
}
