package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Use_of_Name_Locator {
	
	
	public static void main(String[] args) {
		
		
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement username_textField = driver.findElement(By.name("username"));
		username_textField.sendKeys("admin");
	}

}
