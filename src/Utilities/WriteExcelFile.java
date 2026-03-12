package Utilities;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelFile {

	public static void main(String[] args) {
		//Blank Workbook
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		//Create Excel Sheet
		XSSFSheet samplesheet =workbook.createSheet("SampleSheet");
		
		//Creating the Data
		
		Map<String, Object[]> dataSet = new HashMap<String, Object[]>();
		
		dataSet.put("1", new Object[] {"ID","NAME", "Company"} );
		dataSet.put("2", new Object[] {"1","Nitish", "Genpact"} );
		dataSet.put("3", new Object[] {"2","Kumar", "Matrix"} );
		dataSet.put("4", new Object[] {"3","Rohit", "Mumbai Indians"} );
		dataSet.put("5", new Object[] {"4","SHarma", "India"} );
		
		//Iterate over the data
		
		Set<String> set = dataSet.keySet();
		int rownum =0;
		
		for(String key : set) {
			Row row = samplesheet.createRow(rownum++);
			
			Object[] data = dataSet.get(key);
			
			int cellNum=0;
			
			for(Object value : data) {
				
				Cell cell = row.createCell(cellNum++);
				
				if (value instanceof String) 
					cell.setCellValue((String)value);
					else if(value instanceof Integer)
					    cell.setCellValue((Integer)value);
					
				
					
					
				
			}
			
		}
		//Write Down file on Hardisk
		try {
			FileOutputStream writefile = new FileOutputStream("sampleTest.xlsx");
			try {
				workbook.write(writefile);
				writefile.close();
				System.out.println("Sample Excel File is being created Successfuly");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
