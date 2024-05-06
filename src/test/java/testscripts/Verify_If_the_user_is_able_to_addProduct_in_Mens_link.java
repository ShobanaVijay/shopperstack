package testscripts;

import org.testng.annotations.Test;

import element_Repository.MenProduct;
import generic_Library.BaseTest;

public class Verify_If_the_user_is_able_to_addProduct_in_Mens_link extends BaseTest {
	
	@Test
	public void mensProduct()
	{
		MenProduct mp = new MenProduct(driver);
		mp.getMenMenuButton().click();
		mp.getSubCategoryButton().click();
		mp.getAddToCartButton().click();
		mp.getCartButton().click();
		
	}
}
