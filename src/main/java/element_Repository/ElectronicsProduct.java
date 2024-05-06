package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElectronicsProduct extends BasePage{
	
	public ElectronicsProduct(WebDriver driver){
		super(driver);
	}	

	@FindBy(xpath = "//a[@id='electronics']")
	private WebElement electronicsMenuButton;
	
	@FindBy(xpath = "//a[text()='Cameras ']")
	private WebElement subCategoryButton;
	
	@FindBy(xpath = "/html/body/div[1]/div[4]/div/div/div[2]/div[3]/div[2]/button")
	private WebElement addToCartButton;
	
	@FindBy(xpath = "//*[@id=\"cartIcon\"]")
	private WebElement cartButton;
	

	public WebElement getElectronicsMenuButton() {
		return electronicsMenuButton;
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
		getElectronicsMenuButton().click();		
		getSubCategoryButton().click();		
		getAddToCartButton().click();		
		getCartButton().click();
	}
}
