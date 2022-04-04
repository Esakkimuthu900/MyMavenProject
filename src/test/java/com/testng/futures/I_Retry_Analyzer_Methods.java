package com.testng.futures;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class I_Retry_Analyzer_Methods {
	
	@Test (retryAnalyzer = I_Retry_Class.class)
	private void facebook() {
		
		String username = "Esakkimuthu123";
		String password = "040672";
		
		assertEquals(username, password);
	}
	@Test(retryAnalyzer = I_Retry_Class.class)
	private void instagram() {
		
		String username ="Sivakutty123";
		String password = "Sivakutty123";
		
		assertEquals(username, password);
	
	}
	
}
