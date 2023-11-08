package com.section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_01 {

	public static void main(String[] args) {
		
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");

		System.out.println(driver.getTitle());

		driver.findElement(By.name("username")).sendKeys("admin", Keys.TAB, "manager", Keys.ENTER);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("container_tasks"))));

		System.out.println(driver.getTitle());

		driver.findElement(By.id("container_tasks")).click();
		
		driver.findElement(By.xpath("(//div[@class='checkbox inactive'])[2]")).click();
		
		driver.findElement(By.xpath("//div[text()='Delete']")).click();
	}

}
