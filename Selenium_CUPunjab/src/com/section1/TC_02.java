package com.section1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_02 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("//span[text()='✕']")).click();

		driver.findElement(By.name("q")).sendKeys("iphone", Keys.ENTER);

		driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 (Starlight, 128 GB)']")).click();

		String window_id = driver.getWindowHandle();
		Set<String> all_id = driver.getWindowHandles();
		for (String id : all_id) {
			driver.switchTo().window(id);
			if (driver.getTitle().contains("APPLE iPhone 14 ( 128 GB Storage ) Online at Best Price On Flipkart.com")) {
				break;
			}
		}
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		driver.switchTo().window(window_id);
		driver.findElement(By.xpath("//span[text()='Cart']")).click();

	}

}
