package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Use_Of_Move_To_Element {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		
		WebElement fashion = driver.findElement(By.xpath("//span[text()='Fashion']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(fashion).perform();
		WebElement men = driver.findElement(By.linkText("Men's T-Shirts"));
		act.moveToElement(men).click().perform();
		
		
		
		
		
		
	}

}
