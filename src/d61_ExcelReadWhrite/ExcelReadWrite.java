package d61_ExcelReadWhrite;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadWrite {
	
	/*
	 create custom class that can read and write an excel file
	 		instance variables: String filepath;
	 							String SheetName;
	 							FileInputStream file;
	 							WorkBook excelfile;
	 							Sheet sheet;
	 							
	 							Cell cell;
	 							
	 		Actions: ReadData(int row, int cell)  ==> String
	 				 WriteData(int row, int cell,String setValue) ==> void
	 							 
	 */
	
		String filepath;
		String SheetName;
		FileInputStream file;
		Workbook excelfile;
		Sheet sheet;
		
		Cell cell;
		
		public ExcelReadWrite(String filepath, String SheetName) {
			this.filepath = filepath;
			this.SheetName = SheetName;
			try {
				file = new FileInputStream(filepath);
				excelfile = WorkbookFactory.create(file);
				sheet = excelfile.getSheet(SheetName);
			}catch(Exception e) {
				
			}	
			
		}
	
		public String readData(int rowNum, int cellNum) {
			String data ="";  // store the cell data
			cell = sheet.getRow(rowNum).getCell(cellNum);
				data = cell.toString();
			return data;
		}
		
		public void WriteData(int rowNum, int cellNum, String setValue) {
			cell = sheet.getRow(rowNum).getCell(cellNum);
			cell.setCellValue(setValue);
			
		}
		
	
	
	public static void main(String[] args) {
		String path = "/Users/hichamahloufous/Desktop/TestData.xlsx";
		String sheetName = "Sheet1";
		
		ExcelReadWrite obj = new ExcelReadWrite(path, sheetName);
		
		String data1 = obj.readData(1, 0);
		System.out.println(data1);
		
		obj.WriteData(1, 0, "Mehmet");
		
		String data2 =  obj.readData(1, 0);
		System.out.println( data2 );  //
		
			
	}
	
}
