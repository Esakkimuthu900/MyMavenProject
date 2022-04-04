package com.testng.futures;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Methods {
	
	
	@Test(priority = -1)
	private void tamil() {
		System.out.println("Tamil");
	}
	@Test(priority = 0)
	private void english() {
		System.out.println("English");
	}
	@Test(priority =1)
	private void Science() {
		System.out.println("Science");
	}
	@Ignore
	@Test
	private void Maths() {
		System.out.println("Maths");
	}

}
