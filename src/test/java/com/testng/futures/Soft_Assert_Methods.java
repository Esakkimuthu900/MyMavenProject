package com.testng.futures;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert_Methods {

	@Test 
	private void facebook() {
		
		String username = "Esakkimuthu123";
		String password = "040672";
		
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(username, password);
	}
	@Test
	private void instagram() {
		
		String username ="Sivakutty123";
		String password = "Sivakutty123";
		
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(username, password);

	}

}
