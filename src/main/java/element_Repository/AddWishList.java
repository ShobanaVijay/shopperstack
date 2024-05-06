package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddWishList extends BasePage{
	
	public AddWishList(WebDriver driver){
		super(driver);
	}	
	
	@FindBy(xpath = "//a[@id='women']")
	private WebElement womenMenuButton;
	
	@FindBy(xpath = "//a[text()='Kurtas & Suits']")
	private WebElement subCategoryButton;
	
	@FindBy(xpath = "")
	private WebElement favoriteIconButton;
	
	@FindBy(xpath = "/html/body/div[1]/section[1]/article/div[3]/div[1]/button/span[1]/div")
	private WebElement accountSettingsButton;
	
	@FindBy(xpath = "/html/body/div[3]/div[3]/ul/li[3]")
	private WebElement wishListButton;

	public WebElement getWomenMenuButton() {
		return womenMenuButton;
	}

	public WebElement getSubCategoryButton() {
		return subCategoryButton;
	}

	public WebElement getFavoriteIconButton() {
		return favoriteIconButton;
	}

	public WebElement getAccountSettingsButton() {
		return accountSettingsButton;
	}

	public WebElement getWishListButton() {
		return wishListButton;
	}		
	
	
	public void performAddWishList(String Search)
	{
		getWomenMenuButton().click();		
		getSubCategoryButton().click();		
		getFavoriteIconButton().click();		
		getAccountSettingsButton().click();		
		getWishListButton().click();
	}	
}
