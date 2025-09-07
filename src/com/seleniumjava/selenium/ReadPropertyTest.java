package com.seleniumjava.selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadPropertyTest {

	public static void main(String[] args) throws Throwable 
	{
		
		
		Properties config=new Properties();
		
		FileInputStream fis=new FileInputStream("D:/SeleniumBatch8/SeleniumVASU/Environment.properties");

		config.load(fis);
		
		System.out.println(config.getProperty("Browser"));
		
		System.out.println(config.getProperty("URL"));
	}

}
