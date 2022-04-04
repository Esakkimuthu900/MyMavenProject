package com.datadriven.concept;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Cell {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\om\\Documents\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		w.createSheet("Student").createRow(0).createCell(0).setCellValue("Student Name");
		w.getSheet("Student").getRow(0).createCell(1).setCellValue("Student Height");
		w.getSheet("Student").createRow(1).createCell(0).setCellValue("Esakki");
		w.getSheet("Student").getRow(1).createCell(1).setCellValue(7.65);
		w.getSheet("Student").createRow(2).createCell(0).setCellValue("Raja");
		w.getSheet("Student").getRow(2).createCell(1).setCellValue(7.68);
		
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);
		w.close();
		
		System.out.println("Create Sucessfully");
    }

}
