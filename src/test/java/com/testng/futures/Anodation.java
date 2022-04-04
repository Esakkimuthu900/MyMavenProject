package com.testng.futures;

import org.junit.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Anodation {
	
	@BeforeSuite
	private void Set_Property() {
		System.out.println("Set Property");
	}
	@BeforeTest
	private void Browser_Launch() {
	    System.out.println("Browser Launch");
	}
	@BeforeClass
	private void url_Launch() {
		System.out.println("Url Launch");
	}
	@BeforeMethod
	private void Sigin() {
		System.out.println("Sigin Sucessfull");
	}
	@Test
	private void T_Shirt() {
		System.out.println("TShirt");
	}
	@Test
	private void Shirt() {
		System.out.println("Shirt");
	} 
	@AfterMethod
	private void Sigout() {
		System.out.println("Sigout Successfull");
	}
	@AfterClass
	private void Assert() {
		System.out.println("Assert");
	}
	@AfterTest
	private void Close() {
		System.out.println("Browser Close");
	}
	@AfterSuite
	private void Delete_Cookies() {
		System.out.println("Delete All Cookies");
	}
	
	
	}
