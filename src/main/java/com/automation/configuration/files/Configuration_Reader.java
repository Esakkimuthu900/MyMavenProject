package com.automation.configuration.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;
	
	public Configuration_Reader() throws IOException{
		
		File f = new File
				("C:\\Users\\om\\eclipse-workspace\\mavenproject\\src\\main\\java\\com\\properties\\file\\Automation.properties");
		
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}
	
	public String geturl() {
		
		String value = p.getProperty("url");
		return value;
	}
	public String getusername() {
		String value = p.getProperty("username");
		return value;
	}
	public String getpassword() {
		String value = p.getProperty("password");
		return value;
	}

}
