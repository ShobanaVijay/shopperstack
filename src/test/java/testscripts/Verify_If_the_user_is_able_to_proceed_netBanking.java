package testscripts;

import org.testng.annotations.Test;

import element_Repository.NetBanking;
import generic_Library.BaseTest;

public class Verify_If_the_user_is_able_to_proceed_netBanking extends BaseTest {
	
	@Test
	
	public void netBanking()
	{
		NetBanking n1 = new NetBanking(driver);
		n1.getCartButton().click();
		n1.getBuyNow().click();
		n1.getDeliveryAddress().click();
		n1.getDeliveryProceed().click();
		n1.getSelectPayment().click();
		n1.getBankInforadioButton().click();
		n1.getSubmit().click();
		n1.getNetBankingUserId().sendKeys("abcd");
		n1.getNetBankingPwd().sendKeys("***");
		n1.getPaymentSubmit().click();
	}

}
