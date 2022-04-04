package com.testng.futures;

import org.testng.annotations.Test;

public class Grouping_Methods {
	
	@Test(groups = "Ajith Movies")
	private void vivegam() {
		System.out.println("Vivegam");
	}
	@Test(groups = "Ajith Movies")
	private void billa() {
		System.out.println("Billa");
	}
	@Test(groups ="Surya Movies")
	private void singam() {
		System.out.println("Singam");
	}
	@Test(groups = "Surya Movies")
	private void ayan() {
		System.out.println("Ayan");
	}
	@Test(groups = "Vijay Movies")
	private void kavalan() {
		System.out.println("Kavalan");
	}
	@Test(groups = "Vijay Movies")
	private void theri() {
		System.out.println("Theri");
	}
	
	
	
	
	
	
	
}
