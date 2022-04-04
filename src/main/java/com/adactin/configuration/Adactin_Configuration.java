package com.adactin.configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Adactin_Configuration {
	
	public static Properties p;
	
	public Adactin_Configuration() throws IOException {
		
		File f = new File
				("C:\\Users\\om\\eclipse-workspace\\mavenproject\\src\\main\\java\\com\\properties\\file\\Adactinclass.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}
	
	public String get_url() {
	   String value = p.getProperty("url");
	   return value;
	}
	
	public String get_username() {
		String value = p.getProperty("username");
		return value;
	}
	public String get_password() {
		String value = p.getProperty("password");
		return value;
	}
	public String get_firstname() {
		String value = p.getProperty("firstname");
		return value;
	}
	public String get_lastname() {
		String lastname = p.getProperty("lastname");
		return lastname;
	}
	public String get_address() {
		String value = p.getProperty("address");
		return value;
	}
	public String get_ccnumber() {
		String value = p.getProperty("ccnumber");
		return value;
	}
	public String get_ccvnumber() {
		String value = p.getProperty("ccv");
		return value;
	}

}
