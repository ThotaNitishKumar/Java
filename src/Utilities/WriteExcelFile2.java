package Utilities;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelFile2 {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet1 =workbook.createSheet("NitishData");
		
		String[][] data= {{"ID","Name","Company","Location"},
				          {"1","Nitish","Genpact","Hyderbad"},
				          {"2","Kumar","Matrix","Pune"},
				          {"3","Rohit","Mumbai Indians","Mumbai"},
				          {"4","Sharma","India","Nagpur"}
				          };
		
		for (int i = 0; i < data.length; i++) {
			XSSFRow row = sheet1.createRow(i);
			for (int j = 0; j < data[i].length; j++) {
				
				Cell cell = row.createCell(j);
				cell.setCellValue(data[i][j]);
				

				
			}
		}FileOutputStream file = new FileOutputStream("NitishData.xlsx");
		workbook.write(file);
		file.close();
		System.out.println("Creating excel file sucessfully");
		

	}

}
