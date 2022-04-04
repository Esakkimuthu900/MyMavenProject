package com.testng.futures;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_Test {
	
	@Test(dataProvider = "student_data")
	private void school(String studentname , String studentclass ) {
		
		System.out.println("Student name is : " + studentname);
		System.out.println("Student class is : "+ studentclass);

	}
	@DataProvider
	private Object[][] student_data() {
		
		return new Object[][] {
			
			{"Esakki", "10th class"},
			{"Muthu", "11th class"},
			{"Raja", "12th class"}
			
		};
	}
	
	

}
