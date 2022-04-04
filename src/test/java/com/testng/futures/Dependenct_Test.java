package com.testng.futures;

import org.testng.annotations.Test;

public class Dependenct_Test {
	
	@Test
	
	private void payment() {
		System.out.println("Payment");

	}
	@Test
	
	private void mobile() {
		System.out.println("Mobile");
	}
	@Test(dependsOnMethods = "payment")
	
	private void delivery() {
		System.out.println("Delivery");

	}
	

}
