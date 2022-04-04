package com.testng.futures;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Hard_Assert_Methods {
	
	@Test 
	private void facebook() {
		
		String username = "Esakkimuthu123";
		
        Scanner s = new Scanner(System.in);
        String password = s.nextLine();
        
		assertNotEquals(username, password);
	}
	@Test
	private void instagram() {
		
		String username ="Sivakutty123";
		
		Scanner s = new Scanner(System.in);
        String password = s.nextLine();
		
		assertEquals(username, password);

	}
}
