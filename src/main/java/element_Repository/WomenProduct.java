package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WomenProduct extends BasePage{
	
	public WomenProduct(WebDriver driver){
		super(driver);
	}	

	
	@FindBy(xpath = "//a[@id='women']")
	private WebElement womenMenuButton;
	
	@FindBy(xpath = "//a[text()='Sarees']")
	private WebElement subCategoryButton;
	
	@FindBy(xpath = "/html/body/div[1]/div[4]/div/div/div/div[3]/div[2]/button")
	private WebElement addToCartButton;
	
	@FindBy(xpath = "//*[@id=\\\"cartIcon\\\"]")
	private WebElement cartButton;
	
	
	public WebElement getWomenMenuButton() {
		return womenMenuButton;
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
	
	
	public void performWomenProduct()
	{
		getWomenMenuButton().click();		
		getSubCategoryButton().click();		
		getAddToCartButton().click();		
		getCartButton().click();
	}
}
