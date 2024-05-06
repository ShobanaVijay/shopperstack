package testscripts;

import org.testng.annotations.Test;

import element_Repository.DeleteAddress;
import generic_Library.BaseTest;

public class Verify_the_user_is_able_to_delete_address extends BaseTest {
	
	@Test
	public void deleteAddress()
	{
		DeleteAddress da = new DeleteAddress(driver);
		da.getAccountSettingsButton().click();
		da.getMyProfileButton().click();
		da.getMyaddressesButton().click();
		da.getDeleteAddressButton().click();
		da.getConfirmYesButton().click();
		da.getConfirmCancelButton().click();
		

}
}

	
	
	