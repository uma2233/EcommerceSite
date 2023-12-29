package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TransactionsPage {
		 WebDriver driver;
			public TransactionsPage(WebDriver driver) {
				this.driver = driver;
			}
			By element = By.xpath("//div[@class='alert alert-danger alert-dismissible']");
			
	
			public void carterrormsg(){
				
			    String st = driver.findElement(element).getText();
			    System.out.println(st);
			    
			    
			    
			    
			    
			    	
			    
			}
				
				
	}