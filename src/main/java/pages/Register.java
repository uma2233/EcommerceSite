package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register{
	 WebDriver driver;
		public Register(WebDriver driver) {
			this.driver = driver;
		}
		By fn = By.id("input-firstname");
		By ln = By.id("input-lastname");
		By ema = By.id("input-email");
		By tele = By.id("input-telephone");
		By pwd = By.id("input-password");
		By pwdc = By.id("input-confirm");
		By checkb= By.xpath("//input[@name='agree']");
		By cont = By.xpath("//input[@value='Continue']");
		
		public void filldetails(){
			driver.findElement(fn).sendKeys("Kareena");
			driver.findElement(ln).sendKeys("kapoor");
			driver.findElement(ema).sendKeys("kareena@gmail.com");
			driver.findElement(tele).sendKeys("7895412366");
			driver.findElement(pwd).sendKeys("Regular@2024");
			driver.findElement(pwdc).sendKeys("Regular@2024");
		}
		public void checkButton(){
			driver.findElement(checkb).click();
		
		}
		public void continueButton(){
			driver.findElement(cont).click();
		
		}
}
