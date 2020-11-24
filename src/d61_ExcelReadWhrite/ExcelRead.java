package d61_ExcelReadWhrite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.ResultSet;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelRead {
	public static void main(String[] args) throws Exception {
		
String filePath ="/Users/hichamahloufous/Desktop/TestData.xlsx";  // path of excel file
		
		String sheetname = "Sheet1";  // Name of the sheet
		
		FileInputStream file = new FileInputStream(filePath); // reads a file
		
		Workbook excelFile = WorkbookFactory.create(file); // specially designed for Excel Files
		//XSSFWorkbook excelfile2 = new XSSFWorkbook(file);   // does the same thing
		
		
		Sheet sheet =  excelFile.getSheet(sheetname);  // gets the specific spread sheet from excelfile
		// XSSFSheet sheet2 =excelfile2.getSheet(sheetname);
		
		
		Cell cell = sheet.getRow(1).getCell(0); // retrives specific cell from the speardsheet
		
		cell.setCellValue("goldberg");// change the value of the cell from hicham to goldberg
		// it reads that cell value as "goldberg" but does not change it in the excel sheet
		
		
		
		
		
		
		String cellData=cell.toString();
		
	//	String cellData = cell.getStringCellValue();  // converts the cell' value to STring data type
		
	//	System.out.println(cellData);
	System.out.println(cellData);	
	
	
	
		

	
	
		
	}

}
