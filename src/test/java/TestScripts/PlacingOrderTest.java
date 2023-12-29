package TestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseOfTests;
import pages.CheckingCartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.PlacingOrderPage;
import pages.TransactionsPage;

public class PlacingOrderTest extends BaseOfTests{
		@Test(priority=1)
		public void orderplace() throws InterruptedException {
			HomePage hm = new HomePage(driver);
			hm.accountButton();
			Thread.sleep(1000);
			hm.loginButton();
			Thread.sleep(1000);
		LoginPage am = new LoginPage(driver);
		am.loginToAppValid();
		Thread.sleep(1000);
		Assert.assertEquals(driver.getTitle(), "My Account");
		System.out.println("Logged in successfully");
		PlacingOrderPage pg = new PlacingOrderPage(driver);
		pg.addtothecart();
		Thread.sleep(1000);
		CheckingCartPage ct = new CheckingCartPage(driver);
		ct.cartdetailsfill();
		
		TransactionsPage tt = new TransactionsPage(driver);
		tt.carterrormsg();
		System.out.println("Order placed successfully");

}
}