package testscripts;

import org.testng.annotations.Test;

import element_Repository.LoginPage;
import generic_Library.BaseTest;

public class Verify_If_the_user_is_able_to_login extends BaseTest {
	@Test
	public void login()
	{
		LoginPage lp = new LoginPage(driver);
		lp.getEmailTextField().sendKeys("shobana@gmail.com");
		lp.getPasswordTextField().sendKeys("*****");
		lp.getLoginButton().click();
		
}
}
