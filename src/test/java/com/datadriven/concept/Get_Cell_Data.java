package com.datadriven.concept;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Get_Cell_Data {
	
	public static void getdata() throws IOException {
		
		File f = new File("C:\\Users\\om\\eclipse-workspace\\mavenproject\\Testcase\\Automation Testcase.xlsx");
		FileInputStream fis = new  FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet s = w.getSheetAt(0);
		Row r = s.getRow(25);
		Cell c = r.getCell(5);
		CellType type = c.getCellType();
		
		 if (type.equals(CellType.NUMERIC)) {
			 double nv = c.getNumericCellValue();
			 int i = (int) nv;
			 System.out.println(i);
		}
		 else if (type.equals(CellType.STRING)) {
			 String sv = c.getStringCellValue();
			 System.out.println(sv);
		}
		 
		 w.close();
	}

	public static void main(String[] args) throws IOException {
		
		getdata();

	}

}
