package com.testng.futures;

import org.testng.annotations.Test;

public class Priority_Methods {
	
	@Test(priority = 1)
	
	private void collage() {
		System.out.println("collage");
	}
	
	@Test(priority = -1)
	
	private void sslc() {
		System.out.println("School");
	}
	
	@Test(priority = 0)
	
	private void Hssc() {
		System.out.println("Hssc");
	}

}
