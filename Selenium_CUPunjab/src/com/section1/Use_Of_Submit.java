package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Use_Of_Submit {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		String tag = driver.findElement(By.name("q")).getTagName();
		System.out.println(tag);
	
		
		
	}

}
