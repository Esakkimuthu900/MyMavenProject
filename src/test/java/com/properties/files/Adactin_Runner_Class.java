package com.properties.files;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.adactin.configuration.Adactin_Reader;
import com.adactin.pom.Adactin_Pom_Class;
import com.base_class.Base_Class;
import com.mavenproject.Runner_Class;

public class Adactin_Runner_Class extends Base_Class{
	
public static WebDriver driver = browser_launch("Firefox");
	
	public static Adactin_Pom_Class apc = new Adactin_Pom_Class(driver);
	
	public static Logger log = Logger.getLogger(Runner_Class.class);
	
	public static void main(String[] args) throws IOException {
		
		PropertyConfigurator.configure("log4j.properties");
		
		String url = Adactin_Reader.get_Adactin_Reader().get_Adactin().get_url();
		
		getUrl(url);
		
		log.info("Url Launch");
		
		//Login Methods
		
	    inputElement(apc.getFp().getUsername(),Adactin_Reader.get_Adactin_Reader().get_Adactin().get_username());
		
		inputElement(apc.getFp().getPassword(),Adactin_Reader.get_Adactin_Reader().get_Adactin().get_password());
		
		clickElement(apc.getFp().getLogin());
		
		log.info("Log in Successfull");
		
		//Select Visible Text Methods
		
		dropdown("Visibletext", apc.getSp().getLocation(), "Paris");
		
		//Select By Index Methods
		
		dropdown("Index", apc.getSp().getHotelname(), "1");
		
		dropdown("Index", apc.getSp().getRoomtype(), "2");
		
		//Select By Value Methods
		
		dropdown("Value",apc.getSp().getNumberofrooms(), "2");
		
		//SendKeys Methods (Index X-Path)
		
		clear(apc.getSp().getJoindate());
		inputElement(apc.getSp().getJoindate(), "14/04/2022");
		
		clear(apc.getSp().getOutdate());
		inputElement(apc.getSp().getOutdate(), "20/04/2022");
		
		//Select By Index Methods
		
		dropdown("Index", apc.getSp().getAdhultperson(), "3");
		
		dropdown("Index", apc.getSp().getChildroom(), "2");
		
		log.info("Hotal Details Entered");
		
		//Search Button Click
		
		clickElement(apc.getSp().getSubmit());
		
		//Radio Button Methods
		
		clickElement(apc.getTp().getRadio_btn());
		
		//Continue Button click 
		
	    clickElement(apc.getTp().getSubmit_btn());
		
		//Booking Details Entry Sendkeys Methods
		
		inputElement(apc.getFour().getFirstname(),Adactin_Reader.get_Adactin_Reader().get_Adactin().get_firstname());
		
		inputElement(apc.getFour().getLastname(),Adactin_Reader.get_Adactin_Reader().get_Adactin().get_lastname());
		
		inputElement(apc.getFour().getAddress(),Adactin_Reader.get_Adactin_Reader().get_Adactin().get_address());
		
		//Card Number Entry
		
		inputElement(apc.getFour().getCardnumber(),Adactin_Reader.get_Adactin_Reader().get_Adactin().get_ccnumber());
		
		//DropDown Methods
		
		dropdown("Visibletext", apc.getFour().getCardtype(), "VISA");
		
		dropdown("Index", apc.getFour().getExpirymonth(), "4");
		
		dropdown("Visibletext", apc.getFour().getExpiryyear(), "2022");
		
		//Sendkeys Methods
		
		inputElement(apc.getFour().getCcvnumber(),Adactin_Reader.get_Adactin_Reader().get_Adactin().get_ccvnumber()); 
		
		//Book Now Button Click
		
		clickElement(apc.getFour().getBooknow_btn());
		
		log.info("Confir Booking Sucessfull");
		
		//ScreenShot Methods
		
		filehandler("C:\\Users\\om\\Pictures\\screenshot picture\\screenshot.png");
		
        log.info("Testing Finished");

	}


}
