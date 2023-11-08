package com.section1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_Data_From_Properties {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis  = new FileInputStream("E:\\Testdata.properties");
		
		Properties pobj = new Properties();
		
		pobj.load(fis);
		
		String url = pobj.getProperty("url");
		
		System.out.println(url);
		
		String un = pobj.getProperty("username");
		
		System.out.println(un);
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
	}

}
