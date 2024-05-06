package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Advertisement extends BasePage
{
	public Advertisement(WebDriver driver){
		super(driver);
	}
	

	@FindBy(xpath = "//input[@id='Advertisement']")
	private WebElement advertisement;

	public WebElement getAdvertisement() {
		return advertisement;
	}

	public void performAdvertisement()
	{
		getAdvertisement().click();
	}
}
