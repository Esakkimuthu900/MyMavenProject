package com.datadriven.concept;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Getcolumn {
	
	public static void getcolumn() throws IOException {
		File f = new File ("C:\\Users\\om\\eclipse-workspace\\mavenproject\\Testcase\\testcase.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheet = w.getSheetAt(0);
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			
			Row r = sheet.getRow(i);
			Cell c = r.getCell(1);
			CellType type = c.getCellType();
			if(type.equals(CellType.STRING)) {
				
				System.out.println(c.getStringCellValue());
			}
			else if(type.equals(CellType.NUMERIC)) {
				
				double nv = c.getNumericCellValue();
				int in = (int) nv;
				System.out.println(in);
			}
		}
		
		w.close();	
	}

	public static void main(String[] args) throws IOException {
		
		getcolumn();

	}

}
