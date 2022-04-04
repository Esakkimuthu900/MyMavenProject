package com.automation.configuration.files;

import java.io.IOException;

public class File_Reader {
	
	public File_Reader() {

	}
	
	public static File_Reader get_file() {
		
		File_Reader f = new File_Reader();
		return f;
	}
	public Configuration_Reader get_configuration() throws IOException {
		
		Configuration_Reader reader = new Configuration_Reader();
		return reader;	
	} 

}
