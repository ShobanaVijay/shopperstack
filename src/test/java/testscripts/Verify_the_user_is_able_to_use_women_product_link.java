package testscripts;

import org.testng.annotations.Test;

import element_Repository.WomenProduct;
import generic_Library.BaseTest;

public class Verify_the_user_is_able_to_use_women_product_link extends BaseTest {
	
	@Test
	public void womenProduct()
	{
		WomenProduct wp = new WomenProduct(driver);
		wp.getWomenMenuButton().click();
		wp.getSubCategoryButton().click();
		wp.getAddToCartButton().click();
		wp.getCartButton().click();
		
	}

}
