package testscripts;

import org.testng.annotations.Test;

import element_Repository.Logout;
import generic_Library.BaseTest;

public class Verify_If_the_user_is_able_to_logout extends BaseTest {
	
	@Test
	
	public void logout()
	{
		Logout l1 = new Logout(driver);
		l1.getAccountSettingsButton().click();
		l1.getLogoutButton().click();
	}

}
