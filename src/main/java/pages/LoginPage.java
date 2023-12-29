package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	By user = By.id("input-email");
	By pass = By.id("input-password");
	By login = By.xpath("//input[@value='Login']");


	public void loginToAppValid() {
		driver.findElement(user).sendKeys("bahu@gmail.com");
		driver.findElement(pass).sendKeys("Review");
		driver.findElement(login).click();
	
		
	}
	public void loginToAppInvalid() {
		driver.findElement(user).sendKeys("bahuee@gmail.com");
		driver.findElement(pass).sendKeys("Review");
		driver.findElement(login).click();
	
		
	}
	public void loginToAppInvalid2() {
		driver.findElement(user).sendKeys("bahu@gmail.com");
		driver.findElement(pass).sendKeys("Regrt");
		driver.findElement(login).click();
	
		
	}
	public void loginToAppInvalid3() {
		driver.findElement(user).sendKeys("fgvhb@fghbj.com");
		driver.findElement(pass).sendKeys("dxfcgvh");
		driver.findElement(login).click();
	
		
	}
}