package testscripts;

import org.testng.annotations.Test;

import element_Repository.SearchProduct;
import generic_Library.BaseTest;

public class Verify_the_user_is_able_to_search_product extends BaseTest {
	
	@Test
	
	public void searchProduct()
	{
		SearchProduct sp = new SearchProduct(driver);
		sp.getSearch().sendKeys("jeans");
		sp.getSearchButton().click();
	}
}
