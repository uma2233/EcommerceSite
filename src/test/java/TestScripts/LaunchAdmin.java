package TestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseOfTests;

public class LaunchAdmin extends BaseOfTests{
@Test
public void launchingAdmin() {
	String pageTitle = driver.getTitle();
	Assert.assertEquals(pageTitle, "Your Store");
	System.out.println("Admin URL opened successfully, Title is "+ pageTitle);
}
}
