package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public static Object[][] getDataFromSheet(String sheetName){
		Object[][] arr = null;
		try {
			File src = new File("C:\\Users\\singh\\eclipse-workspace3\\MissionEcommerce\\src\\test\\resources\\testData\\testInputData.xlsx");
			FileInputStream fis = new FileInputStream(src);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheet("logincreds");
			int row = sheet.getPhysicalNumberOfRows();
			int column = sheet.getRow(0).getPhysicalNumberOfCells();
			arr = new Object[row][column];
			for(int i =0;i<row;i++) {
				for(int j=0; j<column;j++) {
					arr[i][j] = wb.getSheet(sheetName).getRow(i).getCell(j).getStringCellValue();
					
				}}}catch(FileNotFoundException e) {
					System.out.println("could not found file" + e.getMessage());
				}catch(IOException e) {
					System.out.println("could not found file" + e.getMessage());
				}
				return arr;
			
	
	}}

