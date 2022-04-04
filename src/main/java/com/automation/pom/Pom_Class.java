package com.automation.pom;

import org.openqa.selenium.WebDriver;

public class Pom_Class {
	
	public WebDriver driver;
	
	private Firstpage  p1;
	private Secondpage p2;
	private Thirdpage  p3;
	private Fourthpage p4;
	private Fifethpage p5;
	private Sixthpage  p6;
	private Seventhpage p7;
	
	
	
	public Pom_Class(WebDriver driver2) {
		
		this.driver= driver2;
	}


	public Seventhpage getP7() {
		
		if (p7==null) {
			p7 = new Seventhpage(driver);
		}
		return p7;
	}

	
	public Firstpage getP1() {
	  if (p1==null) {
		p1= new Firstpage(driver);
	}
		return p1;
	}
	public Secondpage getP2() {
		if (p2==null) {
			p2=new Secondpage(driver);
		}
		return p2;
	}
	public Thirdpage getP3() {
		if (p3==null) {
			p3= new Thirdpage(driver);
		}
		return p3;
	}
	public Fourthpage getP4() {
		if (p4==null) {
			p4 = new Fourthpage(driver);
		}
		return p4;
	}
	public Fifethpage getP5() {
		if (p5==null) {
			p5 = new Fifethpage(driver);
		}
		return p5;
	}
	public Sixthpage getP6() {
		if (p6==null) {
			p6 = new Sixthpage(driver);
		}
		return p6;
	}	
}
