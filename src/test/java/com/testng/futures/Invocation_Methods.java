package com.testng.futures;

import org.testng.annotations.Test;

public class Invocation_Methods {
	
	@Test
	private void tamil() {
		System.out.println("Tamil");
	}
	@Test(invocationCount = 3)
	private void english() {
		System.out.println("English");
	}
	@Test
	private void Maths() {
		System.out.println("Maths");
	}

}
