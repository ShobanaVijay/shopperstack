package testscripts;

import org.testng.annotations.Test;

import element_Repository.CartContinueShop;
import generic_Library.BaseTest;

public class Verify_If_the_user_is_able_to_continueshopping extends BaseTest {
	
	@Test
	
	public void continueShopping()
	{
		CartContinueShop cs = new CartContinueShop(driver);
		cs.getMenMenuButton().click();
		cs.getSubCategoryButton().click();
		cs.getAddToCartButton().click();
		cs.getCartButton().click();
		cs.getContinueShopButton().click();
	}

}
