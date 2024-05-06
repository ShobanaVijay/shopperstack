package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BeautyProduct extends BasePage{
	
	public BeautyProduct(WebDriver driver){
		super(driver);
	}	

	@FindBy(xpath = "//a[@id='beautyProducts']")
	private WebElement beautyMenuButton;
	
	@FindBy(xpath = "//button[@aria-label='SubCategory']")
	private WebElement subCategoryButton;
	
	@FindBy(xpath = "/html/body/div[1]/div[4]/div/div/div[2]/div[3]/div[2]/button")
	private WebElement addToCartButton;
	
	@FindBy(xpath = "//*[@id=\"cartIcon\"]")
	private WebElement cartButton;
	

	public WebElement getBeautyMenuButton() {
		return beautyMenuButton;
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
	
	
	public void performElectronicsProduct()
	{
		getBeautyMenuButton().click();		
		getSubCategoryButton().click();		
		getAddToCartButton().click();		
		getCartButton().click();
	}
}
