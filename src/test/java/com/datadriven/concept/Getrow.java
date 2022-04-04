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

public class Getrow {
	
	
	public static void getrow() throws IOException {
		
		File f = new File("C:\\Users\\om\\eclipse-workspace\\mavenproject\\Testcase\\testcase.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet s = w.getSheetAt(0);
		Row r = s.getRow(1);
		for (int i = 0; i < r.getPhysicalNumberOfCells(); i++) {
			Cell c = r.getCell(i);
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
		w.close();
	}

	public static void main(String[] args) throws IOException {
		
		getrow();
	}

}
