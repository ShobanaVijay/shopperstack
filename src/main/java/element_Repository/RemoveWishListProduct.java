package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RemoveWishListProduct extends BasePage{
	
	public RemoveWishListProduct(WebDriver driver){
		super(driver);
	}	
	
	@FindBy(xpath = "/html/body/div[3]/div[1]")
	private WebElement accountSettingsButton;
		
	@FindBy(xpath = "/html/body/div[3]/div[3]/ul/li[3]")
	private WebElement wishListButton;		
	
	@FindBy(xpath = "/html/body/div[1]/section[2]/article/div/div/div[2]/div[2]/button[2]")
	private WebElement removeWishListButton;
	


	public WebElement getAccountSettingsButton() {
		return accountSettingsButton;
	}

	public WebElement getWishListButton() {
		return wishListButton;
	}

	public WebElement getRemoveWishListButton() {
		return removeWishListButton;
	}		
	
	public void performAddWishList(String Search)
	{
		getAccountSettingsButton().click();		
		getWishListButton().click();		
		getRemoveWishListButton().click();			
	}	
}
