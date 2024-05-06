package testscripts;

import org.testng.annotations.Test;

import element_Repository.BeautyProduct;
import generic_Library.BaseTest;

public class Verify_the_user_is_able_to_addproduct_beautyProducts extends BaseTest {
	
	@Test
	
	public void beautyProducts() throws InterruptedException
	{
		BeautyProduct bp = new BeautyProduct(driver);
		Thread.sleep(3000);
		bp.getBeautyMenuButton().click();
		Thread.sleep(6000);
		bp.getSubCategoryButton().click();
		Thread.sleep(6000);
		bp.getAddToCartButton().click();
		Thread.sleep(6000);
		bp.getCartButton().click();

}
}



