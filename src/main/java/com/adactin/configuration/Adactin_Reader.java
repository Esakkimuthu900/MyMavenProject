package com.adactin.configuration;

import java.io.IOException;

public class Adactin_Reader {
	
	private Adactin_Reader() {
		
	}
	
	public static Adactin_Reader  get_Adactin_Reader() {
		
		Adactin_Reader reader = new Adactin_Reader();
		return reader;
	}
	public Adactin_Configuration get_Adactin() throws IOException {
		
		Adactin_Configuration  reader= new Adactin_Configuration();
		return reader;
	}
}
