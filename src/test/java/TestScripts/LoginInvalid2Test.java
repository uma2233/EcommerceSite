package TestScripts;
import org.openqa.selenium.By;
import org.testng.Assert;

import org.testng.annotations.Test;

import base.BaseOfTests;
import dataProvider.CustomDataProvider;
import pages.HomePage;
import pages.LoginPage;

public class LoginInvalid2Test extends BaseOfTests{
//Positive scenario
	@Test(priority=1)
	public void loginbut2() throws InterruptedException {
		HomePage hm = new HomePage(driver);
		hm.accountButton();
		Thread.sleep(1000);
		hm.loginButton();
		Thread.sleep(1000);
	}
	@Test(priority=2)

public void loginToApplicationInvalid2() throws InterruptedException {
		
	LoginPage am = new LoginPage(driver);
	am.loginToAppInvalid2();
	Thread.sleep(1000);
	Assert.assertEquals(driver.getTitle(), "My Account","Invalidcreds did not login successfully");
	
	
	
}}