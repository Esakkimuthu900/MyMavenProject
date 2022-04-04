package com.testng.futures;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Parallel_Method {
	
	@Test 
	private void facebook() {
		
		String username = "Esakkimuthu123";
		String password = "040672";
		
		System.out.println("Facebook username is :" + username);
		System.out.println("Facebook password is : "+ password);
		
	}
	@Test
	private void instagram() {
		
		String username ="Sivakutty123";
		String password = "Sivakutty123";
		
		System.out.println("instagram username is :" +username);
		System.out.println("instagram password is :" +password);

	}


}
