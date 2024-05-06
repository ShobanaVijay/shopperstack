package testscripts;

import org.testng.annotations.Test;

import element_Repository.COD;
import generic_Library.BaseTest;

public class Verify_If_the_user_is_able_to_proceed_COD extends BaseTest{
	
	@Test
	
	public void codPayment()
	{
		COD c1 = new COD(driver);
		c1.getCartButton().click();
		c1.getBuyNow().click();
		c1.getDeliveryAddress().click();
		c1.getDeliveryProceed().click();
		c1.getSelectPayment().click();
		c1.getCod().click();
		c1.getSelectPayment().click();
		
	
	}

}
