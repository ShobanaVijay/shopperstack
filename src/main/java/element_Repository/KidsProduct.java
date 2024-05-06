package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KidsProduct extends BasePage{
	
	public KidsProduct(WebDriver driver){
		super(driver);
	}	

	@FindBy(xpath = "//a[@id='kids']")
	private WebElement kidsMenuButton;
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/div/nav/ul/li[3]/div/aside/div[1]/ul/li[2]/a")
	private WebElement subCategoryButton;
	
	@FindBy(xpath = "/html/body/div[1]/div[4]/div/div/div[1]/div[3]/div[2]/button")
	private WebElement addToCartButton;
	
	@FindBy(xpath = "//*[@id=\"cartIcon\"]")
	private WebElement cartButton;
	
	
	public WebElement getKidsMenuButton() {
		return kidsMenuButton;
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
	
	
	public void performKidsProduct()
	{
		getKidsMenuButton().click();		
		getSubCategoryButton().click();		
		getAddToCartButton().click();		
		getCartButton().click();
	}
}
