package utility;
import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class ScreenshotCapture {
 public static void testScreenshot(WebDriver driver,String screenName)throws Exception {
	 try {
		 TakesScreenshot ts = (TakesScreenshot)driver;
		 File f =ts.getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(f, new File("D:\\SkillUP\\screenshots"+screenName+".png"));
	 }
	 catch(WebDriverException e) {
		 System.out.println("Screens cannot be captured "+e.getMessage());
	 }
 }
}
