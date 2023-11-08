package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Use_of_IsEnabled {
	
	
	public static void main(String[] args) {
		
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
//		WebElement username = driver.findElement(By.name("username"));
//		if(username.isEnabled())
//		{
//			username.sendKeys("admin");
//		}
//		else
//		{
//			System.out.println("webelement is disabled");
//		}
		
		WebElement logo = driver.findElement(By.className("atLogoImg"));
		if(logo.isDisplayed())
			System.out.println("logo is displayed");
		else
			System.out.println("logo is not displayed");
		
	}

}
