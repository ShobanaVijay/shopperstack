package testscripts;

import org.testng.annotations.Test;

import element_Repository.EditAddress;
import generic_Library.BaseTest;

public class Verify_the_user_is_able_to_edit_address extends BaseTest{
	
	@Test
	public void editAddress()
	{
		EditAddress ea = new EditAddress(driver);
		ea.getAccountSettingsButton().click();
		ea.getMyProfileButton().click();
		ea.getMyaddressesButton().click();
		ea.getEditAddressButton().click();
		ea.getAddressTypeRadioButton().click();
		ea.getName().sendKeys("Shobana");
		ea.getHouseInfo().sendKeys("Apt-303");
		ea.getStreetInfo().sendKeys("St.Margarates Bay Road");
		ea.getLandMark().sendKeys("Chock Hotel");
		ea.getCountry().sendKeys("India");
		ea.getState().sendKeys("Karnataka");
		ea.getCity().sendKeys("Bengaluru");
		ea.getPinCode().sendKeys("632445");
		ea.getPhoneNumber().sendKeys("7828825143");
		ea.getUpdateAddressButton().click();
		
		
		
		
	}

}
