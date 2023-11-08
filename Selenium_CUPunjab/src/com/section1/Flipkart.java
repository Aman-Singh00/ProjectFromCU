package com.section1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws AWTException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");

		driver.findElement(By.name("q")).sendKeys("iphone", Keys.ENTER);

		// String result =
		// driver.findElement(By.xpath("//span[contains(@class,'Ermr')]")).getText();

		// System.out.println(result);

		WebElement iphone_name = driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 (Blue, 128 GB)']"));

		String name = iphone_name.getText();

		String price = driver
				.findElement(
						By.xpath("//div[text()='APPLE iPhone 14 (Blue, 128 GB)']/../..//div[contains(@class,'jeq')]"))
				.getText();

		System.out.println(name + "=====>" + price);

	}

}
