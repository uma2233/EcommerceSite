package TestScripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseOfTests;
import pages.HomePage;
import pages.Register;

public class RegisterTest extends BaseOfTests{
@Test

public void adminPageElements() throws InterruptedException {
	HomePage hm = new HomePage(driver);
	hm.accountButton();
	System.out.println("Account button clicked successfully");
	Thread.sleep(1000);
	hm.registerButton();
	System.out.println("Register button clicked successfully");
	Thread.sleep(1000);
	Register rg = new Register(driver);
	rg.filldetails();
	System.out.println("Register form details filled successfully");
	Thread.sleep(1000);
	rg.checkButton();
	System.out.println("Terms agreed successfully");
	Thread.sleep(1000);
	rg.continueButton();
	System.out.println("Continue button clicked successfully");
	Thread.sleep(1000);
	Assert.assertEquals(driver.findElement(By.xpath("//p[contains(text(),'Congratulations! Your new account has been successfully created!')]")).isDisplayed(),true);
	System.out.println("Successful registration");
}}
