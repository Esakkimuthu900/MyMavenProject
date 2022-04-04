package com.testng.futures;

import org.testng.annotations.Test;

public class Expected_Exception_Methods {
	
	
	@Test(expectedExceptions = ArithmeticException.class)
	private void student() {
		
		int a = 10;
		int b = 0;
		System.out.println(a/b);
	}

}
