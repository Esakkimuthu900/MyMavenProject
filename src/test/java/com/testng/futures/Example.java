package com.testng.futures;

import org.testng.annotations.Test;

public class Example {
	
	
	@Test(dependsOnMethods = "watch")
	private void mobile() {
		System.out.println("mobile");
	}
	@Test
	private void offer() {
		System.out.println("offer");
	}
	@Test
	private void watch() {
		
		System.out.println("Time");

	}

}
