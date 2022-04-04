package com.mavenproject;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automation.pom.Pom_Class;
import com.base_class.Base_Class;

public class Multipurchase extends Base_Class {
	
public static WebDriver driver = browser_launch("Firefox");
	
	public static Pom_Class pom = new Pom_Class(driver);
	
	public static Logger log = Logger.getLogger(Automation_Testing.class);

     public static void main(String[] args) throws IOException {
    	 
    	PropertyConfigurator.configure("log4j.properties");
		
		getUrl("http://automationpractice.com/index.php?");
		
		implicitwait(30, "SECONDS");
		
		log.info("Url Launch");
				
		//Sigin Methods
		
		clickElement(pom.getP1().getSigin_btn());
		
		//Login Methods
		
		inputElement(pom.getP2().getUsername(),getdata("C:\\Users\\om\\Pictures\\PROJECT\\Programs\\Test Cases\\Automation Testcase.xlsx", 
				0, 25, 5));
		
		inputElement(pom.getP2().getPassword(),getdata("C:\\Users\\om\\Pictures\\PROJECT\\Programs\\Test Cases\\Automation Testcase.xlsx", 
				0, 26, 5));
		
		clickElement(pom.getP2().getSubmit_btn());
		
		log.info("Sign in Successfull");
		//Select Purchase Option
		
		clickElement(pom.getP3().getSelectoption());
		
		//Price Change Methods
		
		dropdown("Index",pom.getP3().getPrize(), "1");
		
		//Icon views Change Methods 
		
		clickElement(pom.getP3().getIconview());
		
		//colour Select Methods
		
		clickElement(pom.getP3().getColor_btn());
		
		//Quantity Select Methods
		
		clear(pom.getP4().getQuantity());
		inputElement(pom.getP4().getQuantity(), "2");
		
	    //Size Select Methods
		
		dropdown("Visibletext", pom.getP4().getSize(), "M");
		
		//Add To Card Methods
		
		clickElement(pom.getP4().getAddtocard());
		
		clickElement(pom.getP5().getContinoueshopping());
		
		log.info("Dress Selected Successfull");
		
		//Sign Out Methods 
		clickElement(pom.getP7().getSignout());
		
		//Women Dress Purchase
		
		clickElement(pom.getP1().getSigin_btn());
		
		inputElement(pom.getP2().getUsername(),getdata("C:\\Users\\om\\Pictures\\PROJECT\\Programs\\Test Cases\\Automation Testcase.xlsx", 
				0, 25, 5));
		
		inputElement(pom.getP2().getPassword(),getdata("C:\\Users\\om\\Pictures\\PROJECT\\Programs\\Test Cases\\Automation Testcase.xlsx", 
				0, 26, 5));
		
		clickElement(pom.getP2().getSubmit_btn());
		
		clickElement(pom.getP7().getWomendress());
		
		clickElement(pom.getP3().getIconview());
		
		clickElement(pom.getP3().getColor_btn());
		
		clear(pom.getP4().getQuantity());
		
		inputElement(pom.getP4().getQuantity(), "2");
		
		dropdown("Visibletext", pom.getP4().getSize(), "M");
		
		clickElement(pom.getP4().getAddtocard());
		
		clickElement(pom.getP5().getContinoueshopping());
		
		clickElement(pom.getP7().getSignout());
		
		//Dresses Purchases
		
        clickElement(pom.getP1().getSigin_btn());
		
		inputElement(pom.getP2().getUsername(),getdata("C:\\Users\\om\\Pictures\\PROJECT\\Programs\\Test Cases\\Automation Testcase.xlsx", 
				0, 25, 5));
		
		inputElement(pom.getP2().getPassword(),getdata("C:\\Users\\om\\Pictures\\PROJECT\\Programs\\Test Cases\\Automation Testcase.xlsx", 
				0, 26, 5));
		
		clickElement(pom.getP2().getSubmit_btn());
		
		clickElement(pom.getP7().getDresses());
		
		clickElement(pom.getP3().getIconview());
		
		clickElement(pom.getP7().getDresses1());
		
		clear(pom.getP4().getQuantity());
		
		inputElement(pom.getP4().getQuantity(), "2");
		
		dropdown("Visibletext", pom.getP4().getSize(), "M");
		
		clickElement(pom.getP4().getAddtocard());
		
		clickElement(pom.getP5().getProceed_btn());
		clickElement(pom.getP5().getProceed_btn());
		clickElement(pom.getP5().getConfirn_Btn());

		clickElement(pom.getP6().getCheckbox());
		
		clickElement(pom.getP6().getSubmit_btn());
		
		clickElement(pom.getP6().getPayment());
		
		clickElement(pom.getP6().getSubmit_btn());
		
		clickElement(pom.getP6().getBack_btn());
		
		clickElement(pom.getP7().getSignout());





		

      
  }
}

