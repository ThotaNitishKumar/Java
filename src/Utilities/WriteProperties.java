package Utilities;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

import ExceptionHandling.FinallyBlock;

public class WriteProperties {

	public static void main(String[] args) {
		
		Properties prop  = new Properties();
		OutputStream writeFile =null;
		
		try {
			
			writeFile = new FileOutputStream("config.properties");
			
			prop.setProperty("DbServer", "Nitish.Kumar02");
			prop.setProperty("DBName", "db_Nitish");
			prop.setProperty("DBPass", "RohitSharma");
			prop.setProperty("username", "root");
			
			prop.store(writeFile, "Data base Information");
			
			System.out.println("Create Properties Successfully");
		}catch(IOException io){
			
			io.printStackTrace();
			
		}finally {
			if(writeFile!=null) {
				try {
					writeFile.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		

	}

}
