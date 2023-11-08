package com.section1;


import java.lang.StackWalker.Option;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser {
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//driver.close();
		driver.quit();
		
//		Options opt = driver.manage();
//		Window win = opt.window();
//		Dimension s = new Dimension(1000,1500);
//		win.setSize(s);
		
//		Options opt = driver.manage();
//		Window win = opt.window();
//		Point p = new Point(100, 200);
//		win.setPosition(p);
		
		
		
		
		
		
		
		
		
	}
	
	

}
