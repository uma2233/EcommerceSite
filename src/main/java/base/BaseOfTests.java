package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import browserFactory.BrowserFactory;



public class BaseOfTests{
	 protected WebDriver driver;

	  @BeforeClass
	  public void setupBrowser() {
		driver =BrowserFactory.browserInstance("Chrome", "https://tutorialsninja.com/demo"); 
	  }
	  
	  @AfterClass
	  public void closeBrowser() {
		  driver.quit();
	  }
	}

