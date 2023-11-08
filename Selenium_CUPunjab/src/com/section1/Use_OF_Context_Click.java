package com.section1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Use_OF_Context_Click {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		Actions act = new Actions(driver);
		act.contextClick().perform();
		
		Robot r = new Robot();
		
		for(int i=0;i<10;i++)
		{
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(4000);
		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		
	}

}
