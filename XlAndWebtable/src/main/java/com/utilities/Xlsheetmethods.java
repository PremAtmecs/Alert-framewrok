package com.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Xlsheetmethods {

String alert;

@Test
	 public  String  GetXlSheet() { 
	Locatorinputs locator =new Locatorinputs();
		

		 
		    FileInputStream fs = null;
		    try {
		    	fs = new FileInputStream("C:\\Users\\arun.chinnapilla\\Desktop\\AlertsWB.xlsx");
		    } catch (FileNotFoundException e) {
		    	
		    	e.printStackTrace();
		    }

		    XSSFWorkbook workbook = null;
		    try {
		    	workbook = new XSSFWorkbook(fs);
		    } catch (IOException e) {
		    	
		    	e.printStackTrace();
		    }
		    XSSFSheet sheet = workbook.getSheet("SheetOfAlerts");
			Row row = sheet.getRow(0);
			Cell cell = row.getCell(0);
		
			int rowcount=sheet.getLastRowNum();
		
			int cellcount= row.getLastCellNum()-row.getFirstCellNum();
		
		
			
			for(int rows=0;rows<rowcount;rows++) {
				for(int cells=0;cells<cellcount;cells++) {
			if(sheet.getRow(rows).getCell(cells).getStringCellValue().equals(locator.getreqrow())) {
		
				
			
				for(int rows1=0;rows1<rowcount;rows1++) {
					for(int cells1=0;cells1<cellcount;cells1++) {
					
					
					      if(sheet.getRow(rows1).getCell(cells1).getStringCellValue().equals(locator.getreqcolumn())) {
					
					    System.out.println(sheet.getRow(rows).getCell(cells1).getStringCellValue());
						String alert=sheet.getRow(rows).getCell(cells1).getStringCellValue();
						this.alert=alert;
						return alert;
					      }
					      else {
					    	
					      }
				    }
				}
		
				}
			else {
				break;
			}
				
			   }
				
	     }
			
			return null;
		
		}
		
}

	 

