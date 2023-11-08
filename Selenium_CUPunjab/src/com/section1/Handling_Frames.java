package com.section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Frames {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("file:///C:/Users/AMAN%20SINGH/Downloads/iframe%20(1).html");

		driver.switchTo().frame(0);

		driver.findElement(By.xpath("//a[text()='Log in']")).click();
	}

}
