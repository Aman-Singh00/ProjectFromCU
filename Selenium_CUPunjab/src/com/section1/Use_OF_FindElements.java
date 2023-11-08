package com.section1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Use_OF_FindElements {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='✕']")).click();

		driver.findElement(By.name("q")).sendKeys("iphone", Keys.ENTER);

		
		List<WebElement> iphone = driver.findElements(By.xpath("//div[contains(@class,'rR')]"));
		
		for( WebElement opt:iphone)
		{
			System.out.println(opt.getText());
		}
		
		//// div[contains(@class,'rR')]
	}

}
