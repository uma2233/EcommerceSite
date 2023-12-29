package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PlacingOrderPage {
	 WebDriver driver;
		public PlacingOrderPage(WebDriver driver) {
			this.driver = driver;
		}
		By cmp = By.xpath("//a[normalize-space()='Components']");
		By moni = By.xpath("//a[normalize-space()='Monitors (2)']");
		By crtscroll = By.xpath("//img[@title='Apple Cinema 30\"']");
		By addcrt = By.xpath("//div[@id='content']//div[1]//div[1]//div[2]//div[2]//button[1]//span[1]");

		public void addtothecart(){
			Actions act = new Actions(driver);
			WebElement ele = driver.findElement(cmp);
			act.moveToElement(ele).perform();
			driver.findElement(moni).click();
			WebElement elm = driver.findElement(crtscroll);
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true)",elm);
			driver.findElement(addcrt).click();
			System.out.println("add cart button verfified successfully");
			
			
			
			
			
			
		
		}
}
