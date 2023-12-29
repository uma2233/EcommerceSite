package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage{
	 WebDriver driver;
		public HomePage(WebDriver driver) {
			this.driver = driver;
		}
		By acc = By.xpath("//*[contains(text(),'My Account')]");
		By reg = By.xpath("//*[contains(text(),'Register')]");
		By log = By.xpath("//a[contains(text(),'Login')]");

		public void loginButton(){
			driver.findElement(log).click();
		
		}
		public void accountButton(){
			driver.findElement(acc).click();
		
		}
		public void registerButton(){
			driver.findElement(reg).click();
		
		}
}
