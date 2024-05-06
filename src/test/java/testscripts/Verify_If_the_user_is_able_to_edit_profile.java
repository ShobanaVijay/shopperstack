package testscripts;

import org.testng.annotations.Test;

import element_Repository.EditProfile;
import generic_Library.BaseTest;

public class Verify_If_the_user_is_able_to_edit_profile extends BaseTest
{
	@Test
	
		public void demo()
		{
			EditProfile e1 = new EditProfile(driver);
			e1.getAccountSettingsButton().click();
			e1.getMyProfileButton().click();
			e1.getEditProfileButton().click();
			e1.getFirstName().sendKeys("Shobana");
			e1.getLastName().sendKeys("Gunasekar");
			e1.getDob().sendKeys("dob");;
			e1.getPhoneNumber().sendKeys("7828825143");
			e1.getCountry().sendKeys("India");
			e1.getState().sendKeys("karnataka");
			e1.getCity().sendKeys("Bengaluru");
			e1.getSubmitButton().click();
		
			
			
		}
	
	

}
