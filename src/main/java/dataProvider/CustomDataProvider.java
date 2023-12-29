package dataProvider;
import org.testng.annotations.DataProvider;

public class CustomDataProvider {
@DataProvider(name ="testInputData")
public static Object[][] getData(){
	Object[][] arr = ExcelReader.getDataFromSheet("logincreds");
	return arr;
}
}
