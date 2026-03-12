package Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	public static void main(String[] args) throws IOException {
	  FileInputStream readfile = new FileInputStream("NitishData.xlsx");
      XSSFWorkbook workbook = new XSSFWorkbook(readfile);
      XSSFSheet sheet =workbook.getSheet("NitishData");
      
      int rows = sheet.getLastRowNum();
      
      for (int i = 0; i < rows; i++) {
    	  
    	  XSSFRow row = sheet.getRow(i);
    	  int cells = row.getLastCellNum();
    	  
    	  for (int j = 0; j < cells; j++) {
    		  
    		  XSSFCell cell =row.getCell(j);
    		  System.out.print(cell.toString() + "   ");
			
		}
    	  System.out.println();
		
	}
      workbook.close();
      readfile.close();
	}

}
