package browserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import java.time.Duration;

public class BrowserFactory {
	
		public static WebDriver browserInstance(String browserName, String applicationURL) {
			WebDriver driver = null;
			if(browserName.contains("Chrome")||browserName.contains("GC")||browserName.contains("Google Chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\singh\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
				ChromeOptions opt = new ChromeOptions();
				opt.addArguments("--remote-allow-origins=*");
				driver= new ChromeDriver(opt);
			}else if(browserName.contains("Firefox")){
				driver= new FirefoxDriver();
			}else if(browserName.contains("Edge")){
				driver= new EdgeDriver();
			}else if(browserName.contains("Safari")){
				driver= new SafariDriver();
				
			}
			else{
				System.out.println("Sorry" + browserName +"not supported");
				driver = new ChromeDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
			driver.get(applicationURL);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			return driver;
		}
	}




