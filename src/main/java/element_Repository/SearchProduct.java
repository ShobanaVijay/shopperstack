package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchProduct extends BasePage{
	
	public SearchProduct(WebDriver driver){
		super(driver);
	}		


	@FindBy(xpath = "//input[@id='search']")
	private WebElement search;	
	
	@FindBy(xpath = "//*[@id=\"searchBtn\"]")
	private WebElement searchButton;
	
	public WebElement getSearch() {
		return search;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}	
	
	public void performSearchProduct(String Search)
	{
		getSearch().sendKeys(Search);
		getSearchButton().click();		
	}	
}
