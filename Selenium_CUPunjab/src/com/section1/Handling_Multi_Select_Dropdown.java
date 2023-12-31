package com.section1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_Multi_Select_Dropdown {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='ide']"));
		
		Select s = new Select(dropdown);
		
		//s.selectByIndex(3);
		//s.selectByIndex(2);
		
		s.selectByVisibleText("Visual Studio");
		s.selectByVisibleText("IntelliJ IDEA");
		
		
		
		WebElement option = s.getFirstSelectedOption();
		
		System.out.println(option.getText());
		
//		if(s.isMultiple())
//		{
//			System.out.println("it is multi select dropdown");
//		}
//		else
//		{
//			System.out.println("it is not a multi select dropdown");
//		}
		
		
		
		
		
		
	
		
		
		
	}

}
