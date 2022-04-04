package com.datadriven.concept;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Alldata {
	
	public static void alldata() throws IOException {
		
		File f = new File ("C:\\Users\\om\\eclipse-workspace\\mavenproject\\Testcase\\testcase.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheet = w.getSheetAt(0);
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			
			Row r = sheet.getRow(i);
			
		for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
			
			Cell c = r.getCell(j);
			
			CellType type = c.getCellType();
			
			if (type.equals(CellType.STRING)) {
				
				String sv = c.getStringCellValue();
				System.out.println(sv);
			}
			else if (type.equals(CellType.NUMERIC)) {
				
				double nv = c.getNumericCellValue();
				int in = (int) nv;
				String value = Integer.toString(in);
				System.out.println(value);
		    }
			
		}
	}
		w.close();
}

	public static void main(String[] args) throws IOException {
		
		alldata();
		

	}

}
