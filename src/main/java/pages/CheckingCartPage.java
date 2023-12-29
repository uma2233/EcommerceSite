package pages;
	
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	import org.openqa.selenium.support.ui.Select;
	
	public class CheckingCartPage {
		 WebDriver driver;
			public CheckingCartPage(WebDriver driver) {
				this.driver = driver;
			}
			By scrollelement = By.xpath("//input[@type='radio' ][@value='5'][contains(@name,'option[218]')]");
			By scrollelement2 = By.xpath("//div[@class='alert alert-info']");
			By element = By.xpath("input[value='5'][name='option[218]']");
			By chkb = By.xpath("//input[@type='checkbox'][contains(@value,'10')]");
			By txt = By.xpath("//input[@type='text'][@id='input-option208']");
			By drp = By.xpath("//select[@id='input-option217']");
			By textenter = By.xpath("//*[@placeholder='Textarea']");
			By fl = By.xpath("//button[@id='button-upload222']");
			By btncart = By.xpath("//button[@id='button-cart']");
			By itmcart = By.xpath("//span[@id='cart-total']");
			By chekout =By.xpath("//a[@title='Checkout']//i[@class='fa fa-share']");
			
	
			public void cartdetailsfill() throws InterruptedException{
				WebElement elm1 = driver.findElement(scrollelement);
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("arguments[0].scrollIntoView(true)",elm1);
				driver.findElement(scrollelement).click();
				Thread.sleep(2000);
				
//				WebElement elm5 = driver.findElement(chkb);
//				js.executeScript("arguments[0].scrollIntoView(true)",elm5);
				driver.findElement(chkb).click();
				Thread.sleep(2000);
				
				driver.findElement(txt).sendKeys("GreatProd");
				Thread.sleep(2000);
//				
WebElement elm2 = driver.findElement(drp);
//				js.executeScript("arguments[0].scrollIntoView(true)",elm2);
				Select sc = new Select(elm2);
			    sc.selectByValue("4");
			    Thread.sleep(2000);
			    
//			    WebElement elm6 = driver.findElement(textenter);
//				js.executeScript("arguments[0].scrollIntoView(true)",elm6);
			    driver.findElement(textenter).sendKeys("This product needs to be handled with care");
			    Thread.sleep(2000);
//			    
//			    WebElement elm7 = driver.findElement(fl);
//				js.executeScript("arguments[0].scrollIntoView(true)",elm7);
			    //driver.findElement(fl).click();
			    driver.findElement(fl).sendKeys("C:\\Users\\singh\\Downloads\\Screenshot_2023-01-31-12-33-15-604_com.instagram.android.jpg");
     System.out.println("File uploaded successfully");
     Thread.sleep(2000);

  //Alert alt = driver.switchTo().alert();
  //alt.accept();
//			    
			    WebElement elm4 = driver.findElement(btncart);
			    js.executeScript("arguments[0].scrollIntoView(true)",elm4);
			    driver.findElement(btncart).click();
			    Thread.sleep(2000);
			    
			    WebElement elm3 = driver.findElement(itmcart);
			    js.executeScript("arguments[0].scrollIntoView(true)",elm3);
			    String ss = elm3.getText();
			  
			    System.out.println(ss);
			    Thread.sleep(2000);
			    driver.findElement(chekout).click();
			    
			    
			    
			    
			    
			    
			    	
			    
			}
				
				
	}
