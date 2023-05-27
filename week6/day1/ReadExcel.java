package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readData(String fileName) throws IOException {
		// Set up the path
		XSSFWorkbook wb = new XSSFWorkbook("Data/"+fileName+".xlsx");
		// Get into work Sheet
		XSSFSheet ws = wb.getSheetAt(0);// sheet index ctrl+2
		// Row count
		int rowCount = ws.getLastRowNum();
		// Column Count
		short columnCount = ws.getRow(0).getLastCellNum();
		//To pass the data
		String[][] data = new String[rowCount][columnCount];
		// To get all the row value
		for (int i = 1; i <= rowCount; i++) {
		// Get into the Row
			XSSFRow row = ws.getRow(i);// Row ctrl+2+l
			
		for (int j = 0; j < columnCount; j++) {
		// Get into Column
			XSSFCell cell = row.getCell(j);
				
		// Read the data
		data[i-1][j]= cell.getStringCellValue();
				//data[0][0]=Testleaf
				//data[0][1]=Princila
				System.out.println(cell);
			}		
		}
		//Close the file
		wb.close();
		
		return data;
		

	}
	
}
