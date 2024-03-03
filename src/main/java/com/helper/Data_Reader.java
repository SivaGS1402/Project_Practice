package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Data_Reader {

	public static Properties p;     //declare p as static variable to use in other methods

	public Data_Reader() throws IOException {    //constructor 

		File f= new File("C:\\Users\\Siva\\eclipse-workspace\\ProjectPractice\\src\\main\\java\\propertyfile\\OrangeHRM.properties");
		FileInputStream fis =new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}	
	public String getPropUrl() {
		String url = p.getProperty("url");
		return url;
	}
	public String getPropUsername() {
		String username = p.getProperty("username");
		return username;
	}
	public String getPropPassword() {
		String password = p.getProperty("password");
		return password;
	}
}
