package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Use_Of_GetAttribute {
	
	public static void main(String[] args) {
		
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		String placeholder_value = driver.findElement(By.name("username")).getAttribute("placeholder");
		System.out.println(placeholder_value);
		
		
	}

}
