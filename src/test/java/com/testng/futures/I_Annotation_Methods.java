package com.testng.futures;

import static org.testng.Assert.assertEquals;

import java.util.Scanner;

import org.testng.annotations.Test;

public class I_Annotation_Methods {
	
	@Test (priority = -1)
	private void fb_username() {
		
		String username = "sivakutty123@gmail.com";
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		
		assertEquals(username, input);
	}
	@Test
	private void fb_password() {
		
		String username ="14240689";
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		
		assertEquals(username, input);
	}
	

}
