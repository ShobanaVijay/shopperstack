package testscripts;

import org.testng.annotations.Test;

import element_Repository.RemoveWishListProduct;
import generic_Library.BaseTest;

public class Verify_the_user_is_able_to_remove_product_in_wishlist extends BaseTest {
	
	@Test
	
	public void removewishlistedProduct()
	{
		RemoveWishListProduct rp = new RemoveWishListProduct(driver);
		rp.getAccountSettingsButton().click();
		rp.getWishListButton().click();
		rp.getRemoveWishListButton().click();
		
	}

}
