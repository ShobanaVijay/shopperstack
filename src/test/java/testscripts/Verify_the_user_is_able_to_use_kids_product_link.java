package testscripts;

import org.testng.annotations.Test;

import element_Repository.KidsProduct;
import generic_Library.BaseTest;

public class Verify_the_user_is_able_to_use_kids_product_link extends BaseTest{
	
	@Test
	public void kidsProduct()
	{
		KidsProduct kp = new KidsProduct(driver);
		kp.getKidsMenuButton().click();
		kp.getSubCategoryButton().click();
		kp.getAddToCartButton().click();
		kp.getCartButton().click();
	}

}
