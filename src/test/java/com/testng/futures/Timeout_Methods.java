package com.testng.futures;

import org.testng.annotations.Test;

public class Timeout_Methods {
	
	
	@Test(timeOut = 5000)
	private void mobile() throws InterruptedException {
		
		Thread.sleep(2000);
		System.out.println("Browser Launch");
		
		Thread.sleep(1000);
		System.out.println("Url Launch");
		
		Thread.sleep(1000);
		System.out.println("Singin");
		
		
	
	}

}
