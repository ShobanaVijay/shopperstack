package testscripts;

import org.testng.annotations.Test;

import element_Repository.ElectronicsProduct;
import generic_Library.BaseTest;

public class Verify_the_user_is_able_to_use_electronic_products_link extends BaseTest {

	@Test
	
	public void ElectronicsProduct()
	{
		ElectronicsProduct ep = new ElectronicsProduct(driver);
		ep.getElectronicsMenuButton().click();
		ep.getSubCategoryButton().click();
		ep.getAddToCartButton().click();
		ep.getCartButton().click();

}
}

