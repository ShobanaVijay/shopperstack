package testscripts;

import org.testng.annotations.Test;

import element_Repository.RemoveCart;
import generic_Library.BaseTest;

public class Verify_the_user_is_able_to_remove_product_in_cart extends BaseTest
{

	@Test
	
	public void removeProduct()
	{
		RemoveCart rc= new RemoveCart(driver);
		rc.getCartButton().click();
		rc.getRemoveCartButton().click();
		rc.getConfirmYesButton().click();
		rc.getConfirmCancelButton().click();
	}
}
