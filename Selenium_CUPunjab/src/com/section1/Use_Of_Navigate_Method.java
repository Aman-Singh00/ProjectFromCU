package com.section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Use_Of_Navigate_Method {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.navigate().to("https://www.amazon.in/");

		driver.navigate().to("https://www.selenium.dev/");

		Thread.sleep(2000);
		driver.navigate().back();

		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();

		driver.quit();

	}

}
