package TestScripts;
import org.openqa.selenium.By;
import org.testng.Assert;

import org.testng.annotations.Test;

import base.BaseOfTests;
import dataProvider.CustomDataProvider;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseOfTests{
//Positive scenario
	@Test(priority=1)
	public void loginbut() throws InterruptedException {
		HomePage hm = new HomePage(driver);
		hm.accountButton();
		Thread.sleep(1000);
		hm.loginButton();
		Thread.sleep(1000);
	}
	@Test(priority=2,dataProvider= "testInputData",dataProviderClass = CustomDataProvider.class)

public void loginToApplication() throws InterruptedException {
		
	LoginPage am = new LoginPage(driver);
	am.loginToAppValid();
	Thread.sleep(1000);
	Assert.assertEquals(driver.getTitle(), "My Account");
	System.out.println("Logged in successfully");
	
	
}}