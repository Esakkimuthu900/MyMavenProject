package com.testng.futures;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Test {
	
	@Test
	@Parameters({"studentname","studentid"})
	private void collage( String studentname, int studentid) {
		
		System.out.println("Student name is : " + studentname);
		System.out.println("Student id is :" + studentid);
	}
		
}


